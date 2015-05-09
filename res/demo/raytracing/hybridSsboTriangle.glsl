/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#version 430 core

layout(binding = 0, rgba32f) uniform image2D framebufferImage;
layout(binding = 1, rgba32f) uniform readonly image2D worldPositionImage;
layout(binding = 2, rgba16f) uniform readonly image2D worldNormalImage;

uniform vec3 eye;
uniform vec3 ray00;
uniform vec3 ray01;
uniform vec3 ray10;
uniform vec3 ray11;

uniform float blendFactor;
uniform float time;

struct triangle {
  vec3 v0;
  vec3 v1;
  vec3 v2;
};

layout(std430) buffer Triangles {
  triangle[] triangles;
};

#define MAX_SCENE_BOUNDS 100.0
#define EPSILON 0.0001
#define LIGHT_RADIUS 1.2
#define LIGHT_BASE_INTENSITY 30.0

const vec3 lightCenterPosition = vec3(3.5, 4.9, 4);
const vec4 lightColor = vec4(1);

float random(vec2 f, float time);
vec3 randomDiskPoint(vec3 rand, vec3 n, vec3 up);
vec3 randomHemispherePoint(vec3 rand, vec3 n);

/*
 * We need random values every now and then.
 * So, they will be precomputed for each ray we trace and
 * can be used by any function.
 */
vec3 rand;
vec3 cameraUp;

float intersectTriangle(vec3 origin, vec3 ray, vec3 v0, vec3 v1, vec3 v2) {
  vec3 edge1 = v1 - v0;
  vec3 edge2 = v2 - v0;
  vec3 pvec = cross(ray, edge2);
  float det = dot(edge1, pvec);
  if (det <= 0) return -1.0;
  float invDet = 1.0 / det;
  vec3 tvec = origin - v0;
  float u = dot(tvec, pvec) * invDet;
  if (u < 0.0 || u > 1.0) return -1.0;
  vec3 qvec = cross(tvec, edge1);
  float v = dot(ray, qvec) * invDet;
  if (v < 0.0 || u + v > 1.0) return -1.0;
  float t = dot(edge2, qvec) * invDet;
  return t;
}

struct hitinfo {
  int triIndex;
  float t;
};

bool intersectTriangles(vec3 origin, vec3 dir, out hitinfo info) {
  float smallestT = MAX_SCENE_BOUNDS;
  bool found = false;
  int numTriangles = triangles.length();
  for (int i = 0; i < numTriangles; i++) {
    const triangle tri = triangles[i];
    float t = intersectTriangle(origin, dir, tri.v0, tri.v1, tri.v2);
    if (t >= 0.0 && t < smallestT) {
      info.t = t;
      info.triIndex = i;
      found = true;
    }
  }
  return found;
}

vec4 trace(vec3 origin, vec3 dir, vec3 hitPoint, vec3 normal) {
  hitinfo i;
  vec4 accumulated = vec4(0.0);
  vec4 attenuation = vec4(1.0);
  bool intersected = false;
  vec3 lightNormal = normalize(hitPoint - lightCenterPosition);
  vec3 lightPosition = lightCenterPosition + randomDiskPoint(rand, lightNormal, cameraUp) * LIGHT_RADIUS;
  vec3 shadowRayDir = lightPosition - hitPoint;
  vec3 shadowRayStart = hitPoint + normal * EPSILON;
  hitinfo shadowRayInfo;
  bool lightObstructed = intersectTriangles(shadowRayStart, shadowRayDir, shadowRayInfo);
  if (!lightObstructed || shadowRayInfo.t >= 1.0) {
    float cosineFallOff = max(0.0, dot(normal, normalize(shadowRayDir)));
    float oneOverR2 = 1.0 / dot(shadowRayDir, shadowRayDir);
    accumulated += attenuation * vec4(lightColor * LIGHT_BASE_INTENSITY * cosineFallOff * oneOverR2);
  }
  attenuation *= dot(normal, dir);
  return accumulated;
}

layout (local_size_x = 16, local_size_y = 8) in;

void main(void) {
  ivec2 pix = ivec2(gl_GlobalInvocationID.xy);
  ivec2 size = imageSize(framebufferImage);
  if (pix.x >= size.x || pix.y >= size.y) {
    return;
  }

  vec3 worldPosition = imageLoad(worldPositionImage, pix).xyz;
  vec3 worldNormal = imageLoad(worldNormalImage, pix).xyz;

  vec2 pos = (vec2(pix) + vec2(0.5, 0.5)) / vec2(size.x, size.y);
  cameraUp = normalize(ray01 - ray00);

  float rand1 = random(pix, time);
  float rand2 = random(pix + vec2(641.51224, 423.178), time);
  float rand3 = random(pix - vec2(147.16414, 363.941), time);
  /* Set global 'rand' variable */
  rand = vec3(rand1, rand2, rand3);

  vec3 dir = normalize(mix(mix(ray00, ray01, pos.y), mix(ray10, ray11, pos.y), pos.x));
  vec4 color = vec4(0.0, 0.0, 0.0, 1.0);
  color += trace(eye, dir, worldPosition, worldNormal);

  vec4 oldColor = vec4(0.0);
  if (blendFactor > 0.0) {
    oldColor = imageLoad(framebufferImage, pix);
  }
  vec4 finalColor = mix(color, oldColor, blendFactor);
  imageStore(framebufferImage, pix, finalColor);
}
