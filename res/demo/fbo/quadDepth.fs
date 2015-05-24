/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#version 130

uniform sampler2D tex;
uniform mat4 inverseProjectionViewMatrix;

in vec2 vertexNDC;
in vec2 texcoord;

out vec4 color;

void main(void) {
  float depth = texture2D(tex, texcoord).r;
  vec4 ndc = vec4(vertexNDC, depth * 2.0 - 1.0, 1.0);
  vec4 worldPos = inverseProjectionViewMatrix * ndc;
  worldPos /= worldPos.w;
  color = worldPos;
}
