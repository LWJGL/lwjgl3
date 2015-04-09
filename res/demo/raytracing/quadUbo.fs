/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#ifdef GL_core_profile
  #define varying in
  #define texture2D texture

  out vec4 color;
  #define OUT color
#else
  #define OUT gl_FragColor
#endif

/* This comes interpolated from the vertex shader */
varying vec2 texcoord;

/* The texture we are going to sample */
layout(std140) uniform Uniforms {
  sampler2D tex;
};

void main(void) {
  /* Well, simply sample the texture */
  OUT = texture2D(tex, texcoord);
}
