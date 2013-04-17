/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.glfw;

/** A WindowCallback adapter for convenience. */
public abstract class WindowCallbackAdapter extends WindowCallback {

	@Override
	public void windowPos(long window, int xpos, int ypos) {
	}

	@Override
	public void windowSize(long window, int width, int height) {
	}

	@Override
	public void windowClose(long window) {
	}

	@Override
	public void windowRefresh(long window) {
	}

	@Override
	public void windowFocus(long window, int focused) {
	}

	@Override
	public void windowIconify(long window, int iconified) {
	}

	@Override
	public void key(long window, int key, int action) {
	}

	@Override
	public void character(long window, int character) {
	}

	@Override
	public void mouseButton(long window, int button, int action) {
	}

	@Override
	public void cursorPos(long window, double xpos, double ypos) {
	}

	@Override
	public void cursorEnter(long window, int entered) {
	}

	@Override
	public void scroll(long window, double xpos, double ypos) {
	}

}