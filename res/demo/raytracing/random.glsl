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
 * Generate a random value in [-1..+1).
 * 
 * The distribution MUST be really uniform and exhibit NO pattern at all,
 * because it is heavily used to generate random sample directions for various
 * things, and if the random function contains the slightest pattern, it will
 * be visible in the final image.
 * 
 * In the GLSL world, the function presented in the first answer to:
 * 
 *   http://stackoverflow.com/questions/4200224/random-noise-functions-for-glsl
 * 
 * is often used, but that is not a good function, as it has problems with
 * floating point precision and is very sensitive to the seed value, resulting
 * in visible patterns for small and large seeds.
 * 
 * The best implementation (requiring GLSL 330, though) that I found over
 * time is actually this:
 * 
 *   http://amindforeverprogramming.blogspot.de/2013/07/random-floats-in-glsl-330.html
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
vec3 randomDiskPoint(vec3 rand, vec3 n, vec3 up) {
  float r = rand.x * 0.5 + 0.5; // [-1..1) -> [0..1)
  float angle = (rand.y + 1.0) * PI; // [-1..1] -> [0..2*PI)
  float sr = sqrt(r);
  vec2 p = vec2(sr * cos(angle), sr * sin(angle));
  /*
   * Compute some arbitrary tangent space for orienting
   * our disk towards the normal.
   * FIXME: There is an issue here when somewhere in mid-screen the tangent
   *        space changes, because the condition below changes its value.
   *        That will be noticeable on the final render. But how to combat?
   *        We could use the camera's vectors.
   */
  vec3 tangent = up;
  vec3 bitangent = cross(tangent, n);
  tangent = cross(bitangent, n);
  
  /* Make our disk orient towards the normal. */
  return tangent * p.x + bitangent * p.y;
}

/**
 * Generate a uniformly distributed random point on the unit-sphere.
 * 
 * After:
 * http://mathworld.wolfram.com/SpherePointPicking.html
 */
vec3 randomSpherePoint(vec3 rand) {
  float ang1 = (rand.x + 1.0) * PI; // [-1..1) -> [0..2*PI)
  float u = rand.y; // [-1..1), cos and acos(2v-1) cancel each other out, so we arrive at [-1..1)
  float u2 = u * u;
  float sqrt1MinusU2 = sqrt(1.0 - u2);
  float x = sqrt1MinusU2 * cos(ang1);
  float y = sqrt1MinusU2 * sin(ang1);
  float z = u;
  return vec3(x, y, z);
}

/**
 * Generate a uniformly distributed random point on the unit-hemisphere
 * around the given normal vector.
 * 
 * This function can be used to generate reflected rays for diffuse surfaces.
 * Actually, this function can be used to sample reflected rays for ANY surface
 * with an arbitrary BRDF correctly.
 * This is because we always need to solve the integral over the hemisphere of
 * a surface point by using numerical approximation using a sum of many
 * sample directions.
 * It is only with non-lambertian BRDF's that, in theory, we could sample them more
 * efficiently, if we knew in which direction the BRDF reflects the most energy.
 * This would be importance sampling, but care must be taken as to not over-estimate
 * those surfaces, because then our sum for the integral would be greater than the
 * integral itself. This is the inherent problem with importance sampling.
 * 
 * The points are uniform over the sphere and NOT over the projected disk
 * of the sphere, so this function cannot be used when sampling a spherical
 * light, where we need to sample the projected surface of the light (i.e. disk)!
 */
vec3 randomHemispherePoint(vec3 rand, vec3 n) {
  /**
   * Generate random sphere point and swap vector along the normal, if it
   * points to the wrong of the two hemispheres.
   * This method provides a uniform distribution over the hemisphere, 
   * provided that the sphere distribution is also uniform.
   */
  vec3 v = randomSpherePoint(rand);
  return v * sign(dot(v, n));
}
