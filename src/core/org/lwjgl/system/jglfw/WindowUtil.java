/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * The source in this file is ported from GLFW. License terms: http://www.glfw.org/license.html
 */
package org.lwjgl.system.jglfw;

import static org.lwjgl.system.jglfw.InputUtil.*;
import static org.lwjgl.system.jglfw.JGLFW.*;

final class WindowUtil {

	static GLFWwindow focusedWindow;

	private WindowUtil() {
	}

	static void inputWindowFocus(GLFWwindow window, boolean focused) {
		if ( focused ) {
			if ( focusedWindow != window ) {
				focusedWindow = window;

				if ( window.focusCallback != null )
					window.focusCallback.invoke(window, focused);
			}
		} else {
			if ( focusedWindow == window ) {
				focusedWindow = null;

				if ( window.focusCallback != null )
					window.focusCallback.invoke(window, focused);

				// Release all pressed keyboard keys
				for ( int i = 0; i <= GLFW_KEY_LAST; i++ ) {
					if ( window.keys[i] == GLFW_PRESS )
						inputKey(window, i, GLFW_RELEASE);
				}

				// Release all pressed mouse buttons
				for ( int i = 0; i <= GLFW_MOUSE_BUTTON_LAST; i++ ) {
					if ( window.mouseButtons[i] == GLFW_PRESS )
						inputMouseClick(window, i, GLFW_RELEASE);
				}
			}
		}
	}

	static void inputWindowPos(GLFWwindow window, int x, int y) {
		if ( window.posCallback != null )
			window.posCallback.invoke(window, x, y);
	}

	static void inputWindowSize(GLFWwindow window, int width, int height) {
		if ( window.sizeCallback != null )
			window.sizeCallback.invoke(window, width, height);
	}

	static void inputWindowIconify(GLFWwindow window, boolean iconified) {
		if ( window.iconified == iconified )
			return;

		window.iconified = iconified;

		if ( window.iconifyCallback != null )
			window.iconifyCallback.invoke(window, iconified);
	}

	static void inputWindowVisibility(GLFWwindow window, boolean visible) {
		window.visible = visible;
	}

	static void inputWindowDamage(GLFWwindow window) {
		if ( window.refreshCallback != null )
			window.refreshCallback.invoke(window);
	}

	static void inputWindowCloseRequest(GLFWwindow window) {
		window.closed = true;

		if ( window.closeCallback != null )
			window.closeCallback.invoke(window);
	}

}