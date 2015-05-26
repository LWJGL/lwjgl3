#version 330 core
#extension GL_EXT_texture_array : enable

in vec2 texcoord;

uniform sampler2DArray tex;

out vec4 color;

void main(void) {
  if (texcoord.x < 0.5) {
    color = texture2DArray(tex, vec3(texcoord, 0.0));
  } else {
    color = texture2DArray(tex, vec3(texcoord, 1.0));
  }
}
