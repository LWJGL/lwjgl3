/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#version 140

uniform mat4 viewMatrix;
uniform mat4 projectionMatrix;

in vec3 vertexPosition;
in vec3 vertexNormal;
in vec3 boxCenter;
in vec3 boxHalfSize;

out vec3 positionOnUnitCube;
flat out int level;

void main(void) {
  positionOnUnitCube = vertexPosition;
  level = gl_InstanceID;
  vec4 worldPosition = vec4(boxCenter + vertexPosition * boxHalfSize, 1.0);
  gl_Position = projectionMatrix * viewMatrix * worldPosition;
}
