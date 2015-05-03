/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#version 330 core

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
uint hash(uvec3 v) {
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
