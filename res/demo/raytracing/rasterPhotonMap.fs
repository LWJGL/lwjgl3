/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#version 400

uniform samplerCubeArray cubeMaps;

in vec3 positionOnUnitCube;
flat in int level;

out vec4 color;

void main(void) {
  float r = texture(cubeMaps, vec4(positionOnUnitCube, float(level))).r;
  color = vec4(r, r, r, 1.0);
}
