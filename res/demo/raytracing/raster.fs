/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#version 130

in vec4 worldPosition;
in vec4 worldNormal;

out vec4 worldPosition_out;
out vec4 worldNormal_out;

void main(void) {
  worldPosition_out = worldPosition;
  worldNormal_out = worldNormal;
}
