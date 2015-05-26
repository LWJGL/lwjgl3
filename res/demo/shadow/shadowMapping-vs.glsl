/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#version 130

uniform mat4 viewProjectionMatrix;

in vec3 position;

void main(void) {
	gl_Position = viewProjectionMatrix * vec4(position, 1.0);
}
