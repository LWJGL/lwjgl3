/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.glfw;

/** A WindowCallback adapter for convenience. */
public abstract class WindowCallbackAdapter extends WindowCallback {

	@Override
	public void windowPos(final long window, final int xpos, final int ypos) {
	}

	@Override
	public void windowSize(final long window, final int width, final int height) {
	}

	@Override
	public void windowClose(final long window) {
	}

	@Override
	public void windowRefresh(final long window) {
	}

	@Override
	public void windowFocus(final long window, final int focused) {
	}

	@Override
	public void windowIconify(final long window, final int iconified) {
	}

	@Override
	public void key(final long window, final int key, final int action) {
	}

	@Override
	public void character(final long window, final int character) {
	}

	@Override
	public void mouseButton(final long window, final int button, final int action) {
	}

	@Override
	public void cursorPos(final long window, final int xpos, final int ypos) {
	}

	@Override
	public void cursorEnter(final long window, final int entered) {
	}

	@Override
	public void scroll(final long window, final double xpos, final double ypos) {
	}

}