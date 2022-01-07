#version 450

layout(location = 0) in vec3 inPosition;
layout(location = 1) in vec3 inColor;

layout(location = 0) out vec3 passColor;

layout(push_constant) uniform constants
{
    mat4 transformationMatrix;
    bool invertColors;
} PushConstants;

void main() {
    gl_Position = PushConstants.transformationMatrix * vec4(inPosition, 1.0);

    passColor = inColor;
}
