#version 330 core

in vec2 position;

uniform mat4 viewMatrix;
uniform mat4 projMatrix;

out vec2 texcoord;

void main(void) {
  texcoord = position * 0.5 + vec2(0.5, 0.5);
  vec2 pos = position;
  pos *= 10.0;
  gl_Position = projMatrix * viewMatrix * vec4(pos.x, 0.0, pos.y, 1.0);
}
