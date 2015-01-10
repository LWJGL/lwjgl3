/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#version 420
#extension GL_NV_bindless_texture : require

#define MAX_BOXES 128

layout (binding = 0) uniform Samplers {
  samplerCube samplers[MAX_BOXES];
};

in vec3 positionOnUnitCube;
flat in int level;

out vec4 color;

void main(void) {
  float r = texture(samplers[level], normalize(positionOnUnitCube)).r;
  color = vec4(r, r, r, 1.0);
}
