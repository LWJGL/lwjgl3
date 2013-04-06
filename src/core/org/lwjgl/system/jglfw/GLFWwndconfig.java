/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * The source in this file is ported from GLFW. License terms: http://www.glfw.org/license.html
 */
package org.lwjgl.system.jglfw;

class GLFWwndconfig {

	final int width;
	final int height;

	final CharSequence title;

	final boolean resizable;
	final boolean visible;

	final int glMajor;
	final int glMinor;

	final boolean glForward;
	final boolean glDebug;

	final int glProfile;
	final int glRobustness;

	final GLFWmonitor monitor;
	final GLFWwindow  share;

	GLFWwndconfig(int width, int height, CharSequence title, boolean resizable, boolean visible, int glMajor, int glMinor, boolean glForward, boolean glDebug, int glProfile, int glRobustness, GLFWmonitor monitor, GLFWwindow share) {
		this.width = width;
		this.height = height;
		this.title = title;
		this.resizable = resizable;
		this.visible = visible;
		this.glMajor = glMajor;
		this.glMinor = glMinor;
		this.glForward = glForward;
		this.glDebug = glDebug;
		this.glProfile = glProfile;
		this.glRobustness = glRobustness;
		this.monitor = monitor;
		this.share = share;
	}

}