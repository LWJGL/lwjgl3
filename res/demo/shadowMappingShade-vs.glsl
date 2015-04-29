/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#version 130

uniform mat4 modelViewProjectionMatrix;
uniform mat4 lightModelViewProjectionMatrix;
uniform mat4 biasMatrix;

in vec3 position;
in vec3 normal;
out vec4 lightBiasedClipPosition;
out vec3 worldNormal;

void main(void) {
	/* Pass the normal to the fragment shader (we do lighting computations in world coordinates) */
    worldNormal = normal;

    /* Compute vertex position as seen from
       the light and use linear interpolation when passing it
       to the fragment shader
    */
    lightBiasedClipPosition = biasMatrix * lightModelViewProjectionMatrix * vec4(position, 1.0);

    /* Normally transform the vertex */
	gl_Position = modelViewProjectionMatrix * vec4(position, 1.0);
}
