/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#version 130

/* This comes interpolated from the vertex shader */
in vec2 texcoord;

/* The fragment color */
out vec4 color;

/* The texture we are going to sample */
uniform sampler2D tex;

void main(void) {
  /* Well, simply sample the texture */
  color = texture(tex, texcoord);
}
