/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#version 130

/* The position of the vertex as two-dimensional vector */
in vec2 vertex;

/* Write interpolated texture coordinate to fragment shader */
out vec2 texcoord;

void main(void) {
  gl_Position = vec4(vertex, 0.0, 1.0);

  /*
   * Compute texture coordinate by simply
   * interval-mapping from [-1..+1] to [0..1]
   */
  texcoord = vertex * 0.5 + vec2(0.5, 0.5);
}
