/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * The source in this file is ported from GLFW. License terms: http://www.glfw.org/license.html
 */
package org.lwjgl.system.jglfw;

class GLFWhints {

	int redBits;
	int greenBits;
	int blueBits;
	int alphaBits;
	int depthBits;
	int stencilBits;

	int accumRedBits;
	int accumGreenBits;
	int accumBlueBits;
	int accumAlphaBits;

	int     auxBuffers;
	int     stereo;
	int     samples;
	boolean sRGB;

	boolean resizable;
	boolean visible;

	int glMajor;
	int glMinor;

	boolean glForward;
	boolean glDebug;
	int     glProfile;
	int     glRobustness;

	GLFWhints() {
	}

}