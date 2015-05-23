/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#version 130

in vec2 vertex;
out vec2 texcoord;
out vec2 vertexNDC;

void main(void) {
  vertexNDC = vertex;
  texcoord = vertex * 0.5 + vec2(0.5, 0.5);
  gl_Position = vec4(vertex, 0.0, 1.0);
}
