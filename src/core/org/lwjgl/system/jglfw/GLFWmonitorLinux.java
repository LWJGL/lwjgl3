/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * The source in this file is ported from GLFW. License terms: http://www.glfw.org/license.html
 */
package org.lwjgl.system.jglfw;

public class GLFWmonitorLinux extends GLFWmonitor {

	private final long output;
	private final long crtc;

	long oldMode;

	public GLFWmonitorLinux(String name, int width, int height, long output, long crtc) {
		super(name, width, height);

		this.output = output;
		this.crtc = crtc;
	}

	public long getOutput() {
		return output;
	}

	public long getCrtc() {
		return crtc;
	}
}