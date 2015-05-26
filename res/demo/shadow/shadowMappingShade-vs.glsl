/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#version 130

uniform mat4 viewProjectionMatrix;
uniform mat4 lightViewProjectionMatrix;
uniform mat4 biasMatrix;

in vec3 position;
in vec3 normal;

out vec4 lightBiasedClipPosition;
out vec3 worldPosition;
out vec3 worldNormal;

void main(void) {
	/* Pass the position and normal to the fragment shader
	   (we do lighting computations in world coordinates) */
	worldPosition = position;
	worldNormal = normal;

	/* Compute vertex position as seen from
	   the light and use linear interpolation when passing it
	   to the fragment shader
	*/
	lightBiasedClipPosition = biasMatrix * lightViewProjectionMatrix * vec4(position, 1.0);

	/* Normally transform the vertex */
	gl_Position = viewProjectionMatrix * vec4(position, 1.0);
}
