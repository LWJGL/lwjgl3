/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#version 400

uniform samplerCubeArray cubeMaps;

in vec3 positionOnUnitCube;
in float level;

out vec4 color;

void main(void) {
  float r = texture(cubeMaps, vec4(normalize(positionOnUnitCube), level)).r;
  color = vec4(r, r, r, 1.0);
  //color = vec4(1.0);
}
