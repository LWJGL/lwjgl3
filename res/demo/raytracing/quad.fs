#version 130

/* This comes interpolated from the vertex shader */
in vec2 texcoord;
out vec4 color;

/* The texture we are going to sample */
uniform sampler2D tex;

void main(void) {
  /* Well, simply sample the texture */
  color = texture2D(tex, texcoord);
}
