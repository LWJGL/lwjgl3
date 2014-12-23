/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#version 130

uniform mat4 modelViewMatrix;
uniform mat4 projectionMatrix;
uniform mat4 normalMatrix;

in vec3 vertexPosition;
in vec3 vertexNormal;

out vec4 viewPosition;
out vec4 viewNormal;

void main(void) {
  viewPosition = modelViewMatrix * vec4(vertexPosition, 1.0);
  viewNormal = normalMatrix * vec4(vertexNormal, 1.0);
  gl_Position = projectionMatrix * viewPosition;
}
