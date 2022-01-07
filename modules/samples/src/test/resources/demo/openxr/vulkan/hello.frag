#version 450

layout(location = 0) in vec3 passColor;

layout(location = 0) out vec4 outColor;

layout(push_constant) uniform constants
{
    mat4 transformationMatrix;
    bool invertColors;
} PushConstants;

void main() {
    if (PushConstants.invertColors) {
        outColor = vec4(1.0 - passColor.r, 1.0 - passColor.g, 1.0 - passColor.b, 1.0);
    } else {
        outColor = vec4(passColor, 1.0);
    }
}
