/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#version 130

in vec2 position;

void main(void) {
	gl_Position = vec4(position, 0.0, 1.0);
}
