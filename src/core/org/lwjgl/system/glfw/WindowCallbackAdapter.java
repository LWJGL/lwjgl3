/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.glfw;

/** A WindowCallback adapter for convenience. */
public class WindowCallbackAdapter extends WindowCallback {

	@Override
	public void windowPos(long window, int xpos, int ypos) {}

	@Override
	public void windowSize(long window, int width, int height) {}

	@Override
	public void windowClose(long window) {}

	@Override
	public void windowRefresh(long window) {}

	@Override
	public void windowFocus(long window, int focused) {}

	@Override
	public void windowIconify(long window, int iconified) {}

	@Override
	public void framebufferSize(long window, int width, int height) {}

	@Override
	public void key(long window, int key, int scancode, int action, int mods) {}

	@Override
	public void character(long window, int codepoint) {}

	@Override
	public void charMods(long window, int codepoint, int mods) {}

	@Override
	public void mouseButton(long window, int button, int action, int mods) {}

	@Override
	public void cursorPos(long window, double xpos, double ypos) {}

	@Override
	public void cursorEnter(long window, int entered) {}

	@Override
	public void scroll(long window, double xoffset, double yoffset) {}

	@Override
	public void drop(long window, int count, long names) {}

}