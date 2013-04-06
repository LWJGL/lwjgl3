/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * The source in this file is ported from GLFW. License terms: http://www.glfw.org/license.html
 */
package org.lwjgl.system.jglfw;

class GLFWfbconfig {

	final int redBits;
	final int greenBits;
	final int blueBits;
	final int alphaBits;
	final int depthBits;
	final int stencilBits;

	final int accumRedBits;
	final int accumGreenBits;
	final int accumBlueBits;
	final int accumAlphaBits;

	final int auxBuffers;
	final int stereo;
	final int samples;

	final boolean sRGB;

	GLFWfbconfig(int redBits, int greenBits, int blueBits, int alphaBits, int depthBits, int stencilBits, int accumRedBits, int accumGreenBits, int accumBlueBits, int accumAlphaBits, int auxBuffers, int stereo, int samples, boolean sRGB) {
		this.redBits = redBits;
		this.greenBits = greenBits;
		this.blueBits = blueBits;
		this.alphaBits = alphaBits;
		this.depthBits = depthBits;
		this.stencilBits = stencilBits;
		this.accumRedBits = accumRedBits;
		this.accumGreenBits = accumGreenBits;
		this.accumBlueBits = accumBlueBits;
		this.accumAlphaBits = accumAlphaBits;
		this.auxBuffers = auxBuffers;
		this.stereo = stereo;
		this.samples = samples;
		this.sRGB = sRGB;
	}

}