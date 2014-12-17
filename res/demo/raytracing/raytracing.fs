/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#version 330 core

uniform sampler2D framebuffer;

uniform vec3 eye;
uniform vec3 ray00;
uniform vec3 ray01;
uniform vec3 ray10;
uniform vec3 ray11;

uniform float blendFactor;
uniform float time;
uniform float width;
uniform float height;
uniform int sampleCount;

in vec2 texcoord;

out vec4 color;

struct box {
  vec3 min;
  vec3 max;
  int mat;
};

#define MAX_SCENE_BOUNDS 100.0
#define NUM_BOXES 7

const box boxes[] = box[7](
  /* The ground */
  box(vec3(-5.0, -0.1, -5.0), vec3(5.0, 0.0, 5.0), 0),
  /* Box in the middle */
  box(vec3(-0.5, 0.0, -0.5), vec3(0.5, 1.0, 0.5), 1),
  /* Left wall */
  box(vec3(-5.1, 0.0, -5.0), vec3(-5.0, 5.0, 5.0), 2),
  /* Right wall */
  box(vec3(5.0, 0.0, -5.0), vec3(5.1, 5.0, 5.0), 3),
  /* Back wall */
  box(vec3(-5.0, 0.0, -5.1), vec3(5.0, 5.0, -5.0), 0),
  /* Front wall */
  box(vec3(-5.0, 0.0, 5.0), vec3(5.0, 5.0, 5.1), 0),
  /* Top wall */
  box(vec3(-5.0, 5.0, -5.0), vec3(5.0, 5.1, 5.0), 4)
);

#define EPSILON 0.00001
#define LIGHT_RADIUS 0.6

#define LIGHT_BASE_INTENSITY 15.0
const vec3 lightCenterPosition = vec3(1.5, 3.9, 3);
const vec4 lightColor = vec4(1);

float random(vec2 f, float time);
vec3 randomDiskPoint(vec3 n, vec2 pix, float time);

struct hitinfo {
  float near;
  float far;
  int bi;
};

vec2 intersectBox(vec3 origin, vec3 dir, const box b) {
  vec3 tMin = (b.min - origin) / dir;
  vec3 tMax = (b.max - origin) / dir;
  vec3 t1 = min(tMin, tMax);
  vec3 t2 = max(tMin, tMax);
  float tNear = max(max(t1.x, t1.y), t1.z);
  float tFar = min(min(t2.x, t2.y), t2.z);
  return vec2(tNear, tFar);
}

vec4 colorOfBox(const box b) {
  vec4 col;
  if (b.mat == 0) {
    col = vec4(1.0, 1.0, 1.0, 1.0);
  } else if (b.mat == 1) {
    col = vec4(1.0, 0.0, 0.0, 1.0);
  } else if (b.mat == 2) {
    col = vec4(0.0, 0.0, 1.0, 1.0);
  } else if (b.mat == 3) {
    col = vec4(0.0, 1.0, 0.0, 1.0);
  } else {
    col = vec4(0.0, 0.0, 0.0, 1.0);
  }
  return col;
}

bool intersectBoxes(vec3 origin, vec3 dir, out hitinfo info) {
  float smallest = MAX_SCENE_BOUNDS;
  bool found = false;
  for (int i = 0; i < NUM_BOXES; i++) {
    vec2 lambda = intersectBox(origin, dir, boxes[i]);
    if (lambda.x > 0.0 && lambda.x < lambda.y && lambda.x < smallest) {
      info.near = lambda.x;
      info.far = lambda.y;
      info.bi = i;
      smallest = lambda.x;
      found = true;
    }
  }
  return found;
}

vec3 normalForBox(vec3 hit, const box b) {
  if (hit.x < b.min.x + EPSILON)
    return vec3(-1.0, 0.0, 0.0);
  else if (hit.x > b.max.x - EPSILON)
    return vec3(1.0, 0.0, 0.0);
  else if (hit.y < b.min.y + EPSILON)
    return vec3(0.0, -1.0, 0.0);
  else if (hit.y > b.max.y - EPSILON)
    return vec3(0.0, 1.0, 0.0);
  else if (hit.z < b.min.z + EPSILON)
    return vec3(0.0, 0.0, -1.0);
  else
    return vec3(0.0, 0.0, 1.0);
}

vec4 trace(vec3 origin, vec3 dir, vec2 pix) {
  hitinfo i;
  vec4 finalColor = vec4(0.0, 0.0, 0.0, 1.0);
  if (intersectBoxes(origin, dir, i)) {
    box b = boxes[i.bi];
    vec3 hitPoint = origin + i.near * dir;
    vec3 normal = normalForBox(hitPoint, b);
    vec3 lightNormal = normalize(hitPoint - lightCenterPosition);
    vec3 lightPosition = lightCenterPosition + randomDiskPoint(lightNormal, pix, time) * LIGHT_RADIUS;
    vec3 shadowRayDir = lightPosition - hitPoint;
    vec3 shadowRayStart = hitPoint + normal * EPSILON;
    hitinfo shadowRayInfo;
    bool lightObstructed = intersectBoxes(shadowRayStart, shadowRayDir, shadowRayInfo);
    if (lightObstructed && shadowRayInfo.near < 1.0) {
      finalColor = vec4(0.0, 0.0, 0.0, 1.0);
    } else {
      float cosineFallOff = max(0.0, dot(normal, normalize(shadowRayDir)));
      float oneOverR2 = 1.0 / dot(shadowRayDir, shadowRayDir);
      vec4 col = colorOfBox(b);
      finalColor = col * vec4(lightColor * LIGHT_BASE_INTENSITY * cosineFallOff * oneOverR2);
    }
  }
  return finalColor;
}

void main(void) {
  vec2 pos = texcoord;
  vec4 newColor = vec4(0.0, 0.0, 0.0, 1.0);
  for (int sample = 0; sample < sampleCount; sample++) {
    vec2 jitter = random(vec2(float(sample), 612.653), time) / vec2(width, height) / 2.0;
    vec2 p = pos + jitter;
    vec3 dir = mix(mix(ray00, ray01, p.y), mix(ray10, ray11, p.y), p.x);
    newColor += trace(eye, dir, p);
  }
  newColor /= sampleCount;
  vec4 oldColor = vec4(0.0);
  if (blendFactor > 0.0) {
    /* Without explicitly disabling imageLoad for
     * the first frame, we get VERY STRANGE corrupted image!
     * 'mix' SHOULD mix oldColor out, but strangely it does not!
     */
    oldColor = texture(framebuffer, pos);
  }
  color = mix(newColor, oldColor, blendFactor);
}
