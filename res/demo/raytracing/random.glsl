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

/**
 * Generate a uniformly distributed random point on the unit disk.
 * 
 * After:
 * http://mathworld.wolfram.com/DiskPointPicking.html
 */
vec3 randomDiskPoint_(vec3 rand, vec3 n) {
  float r = rand.x * 0.5 + 0.5;
  float angle = (rand.y + 1.0) * PI;
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

/**
 * See above function.
 */
vec3 randomDiskPoint(vec3 n, vec2 pix, float time) {
  float rand1 = random(pix + vec2(512.62, 112.7346), time);
  float rand2 = random(pix - vec2(754.234, 231.845), time);
  return randomDiskPoint_(vec3(rand1, rand2, 0.0), n);
}

/**
 * Generate a uniformly distributed random point on the unit-sphere.
 *
 * After:
 * http://mathworld.wolfram.com/SpherePointPicking.html
 */
vec3 randomSpherePoint_(vec3 rand) {
  float ang1 = (rand.x + 1.0) * PI; // 2.0 * [0..1) * PI
  float u = rand.y; // [-1..1), cos and acos(2v-1)) cancels each other out, so we arrive at [-1..1)
  float u2 = u * u;
  float x = sqrt(1.0 - u2) * cos(ang1);
  float y = sqrt(1.0 - u2) * sin(ang1);
  float z = u;
  return vec3(x, y, z);
}

/**
 * Generate a uniformly distributed random point on the unit-hemisphere
 * around the given normal vector.
 * 
 * The points are uniform over the sphere and NOT over the projected disk
 * of the sphere, so this function cannot be used when sampling a spherical
 * light, where we need to sample the projected surface of the light (i.e. disk)!
 */
vec3 randomHemispherePoint_(vec3 rand, vec3 n) {
  /**
   * Generate random sphere point and swap vector along the normal, if it
   * points the other way.
   */
  vec3 v = randomSpherePoint_(rand);
  return v * sign(dot(v, n));
}

/**
 * See above function above.
 */
vec3 randomHemispherePoint(vec3 n, vec2 pix, float time) {
  float rand1 = random(pix, time);
  float rand2 = random(pix + vec2(641.51224, 423.178), time);
  float rand3 = random(pix - vec2(147.16414, 363.941), time);
  return randomHemispherePoint_(vec3(rand1, rand2, rand3), n);
}

