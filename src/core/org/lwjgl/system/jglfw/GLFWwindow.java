/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * The source in this file is ported from GLFW. License terms: http://www.glfw.org/license.html
 */
package org.lwjgl.system.jglfw;

import org.lwjgl.system.glfw.GLFW;

public class GLFWwindow {

	CharSequence title;

	// Window settings and state
	boolean iconified;
	boolean resizable;
	boolean decorated;
	boolean visible;
	boolean closed;

	Object userPointer;

	GLFWvidmode videoMode;
	GLFWmonitor monitor;

	// Input state
	boolean stickyKeys;
	boolean stickyMouseButtons;
	double  cursorPosX, cursorPosY;
	int cursorMode;
	byte[] mouseButtons = new byte[GLFW.GLFW_MOUSE_BUTTON_LAST + 1];
	byte[] keys         = new byte[GLFW.GLFW_KEY_LAST + 1];

	// OpenGL extensions and context attributes
	int glMajor, glMinor, glRevision;
	boolean glForward, glDebug;
	int glProfile;
	int glRobustness;

	// Callbacks

	GLFWwindowposfun     posCallback;
	GLFWwindowsizefun    sizeCallback;
	GLFWwindowclosefun   closeCallback;
	GLFWwindowrefreshfun refreshCallback;
	GLFWwindowfocusfun   focusCallback;
	GLFWwindowiconifyfun iconifyCallback;
	GLFWmousebuttonfun   mouseButtonCallback;
	GLFWcursorposfun     cursorPosCallback;
	GLFWcursorenterfun   cursorEnterCallback;
	GLFWscrollfun        scrollCallback;
	GLFWkeyfun           keyCallback;
	GLFWcharfun          charCallback;

	GLFWwindow() {
	}

	public CharSequence getTitle() {
		return title;
	}

	public boolean isResizable() {
		return resizable;
	}

	public boolean isVisible() {
		return visible;
	}

	public GLFWvidmode getVideoMode() {
		return videoMode;
	}

	public GLFWmonitor getMonitor() {
		return monitor;
	}

	@SuppressWarnings("unchecked")
	<T extends GLFWwindow> T asPlatformWindow() {
		return (T)this;
	}

}