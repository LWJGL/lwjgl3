/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#version 400
#extension GL_ARB_bindless_texture : require

#define MAX_BOXES 128

uniform Samplers {
  samplerCube samplers[MAX_BOXES];
};

in vec3 positionOnUnitCube;
flat in int level;

out vec4 color;

void main(void) {
  float r = texture(samplers[level], positionOnUnitCube).r;
  color = vec4(r, r, r, 1.0);
}
