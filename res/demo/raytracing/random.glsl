/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#version 330 core

#define PI 3.14159265359

/**
 * http://amindforeverprogramming.blogspot.de/2013/07/random-floats-in-glsl-330.html
 */
uint hash(uint x) {
  x += (x << 10u);
  x ^= (x >> 6u);
  x += (x << 3u);
  x ^= (x >> 11u);
  x += (x << 15u);
  return x;
}

/**
 * http://amindforeverprogramming.blogspot.de/2013/07/random-floats-in-glsl-330.html
 */
uint hash( uvec3 v ) {
  return hash(v.x ^ hash(v.y) ^ hash(v.z));
}

/**
 * http://amindforeverprogramming.blogspot.de/2013/07/random-floats-in-glsl-330.html
 */
float random(vec2 f, float time) {
  const uint mantissaMask = 0x007FFFFFu;
  const uint one = 0x3F800000u;
  uint h = hash(floatBitsToUint(vec3(f, time)));
  h &= mantissaMask;
  h |= one;
  float r2 = uintBitsToFloat(h);
  return (r2 - 1.0) * 2.0 - 1.0;
}

vec3 randomSpherePoint(vec2 pix, float time) {
  float x = 0.0, y = 0.0, z = 0.0;
  x = random(pix, time);
  y = random(pix + vec2(641.51224, 423.178), time);
  z = random(pix - vec2(147.16414, 363.941), time);
  return normalize(vec3(x, y, z));
}

vec3 randomHemispherePoint(vec3 n, vec2 pix, float time) {
  vec3 v = randomSpherePoint(pix, time);
  return v * sign(dot(v, n));
}

/**
 * After:
 * http://mathworld.wolfram.com/DiskPointPicking.html
 */
vec3 randomDiskPoint(vec3 n, vec2 pix, float time) {
  float r = random(pix + vec2(512.62, 112.7346), time) * 0.5 + 0.5;
  float angle = (random(pix + vec2(754.234, 231.845), time) + 1) * PI;
  float sr = sqrt(r);
  vec2 p = vec2(sr * cos(angle), sr * sin(angle));
  /*
   * Compute some arbitrary tangent space for orienting
   * our disk towards the normal.
   */
  vec3 tangent;
  if (abs(n.x) < 0.5) {
    tangent = vec3(1.0, 0.0, 0.0);
  } else {
    tangent = vec3(0.0, 1.0, 0.0);
  }
  vec3 bitangent = cross(tangent, n);
  tangent = cross(bitangent, n);
  
  /* Make our disk orient towards the normal. */
  return tangent * p.x + bitangent * p.y;
}
