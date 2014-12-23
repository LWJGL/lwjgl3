/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#version 130

in vec4 viewPosition;
in vec4 viewNormal;

out vec4 value;

void main(void) {
  value = viewNormal;
}
