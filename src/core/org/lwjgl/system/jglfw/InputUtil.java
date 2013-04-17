/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * The source in this file is ported from GLFW. License terms: http://www.glfw.org/license.html
 */
package org.lwjgl.system.jglfw;

import org.lwjgl.BufferUtils;

import java.nio.IntBuffer;

import static org.lwjgl.system.jglfw.JGLFW.*;

final class InputUtil {

	static final int _GLFW_STICK = 3;

	static double cursorPosX;
	static double cursorPosY;

	private InputUtil() {
	}

	public static void setCursorMode(GLFWwindow window, int newMode) {
		int oldMode;

		if ( newMode != GLFW_CURSOR_NORMAL &&
		     newMode != GLFW_CURSOR_HIDDEN &&
		     newMode != GLFW_CURSOR_CAPTURED ) {
			inputError(GLFW_INVALID_ENUM, "Invalid cursor mode");
			return;
		}

		oldMode = window.cursorMode;
		if ( oldMode == newMode )
			return;

		if ( oldMode == GLFW_CURSOR_CAPTURED )
			platform.setCursorPos(window, cursorPosX, cursorPosY);
		else if ( newMode == GLFW_CURSOR_CAPTURED ) {
			cursorPosX = window.cursorPosX;
			cursorPosY = window.cursorPosY;

			// TODO: optimize
			IntBuffer widthOut = BufferUtils.createIntBuffer(1);
			IntBuffer heightOut = BufferUtils.createIntBuffer(1);

			platform.getWindowSize(window, widthOut, heightOut);

			int width = widthOut.get(0);
			int height = heightOut.get(0);

			platform.setCursorPos(window, width / 2.0, height / 2.0);
		}

		platform.setCursorMode(window, newMode);
		window.cursorMode = newMode;
	}

	public static void setStickyKeys(GLFWwindow window, boolean enabled) {
		if ( window.stickyKeys == enabled )
			return;

		if ( !enabled ) {
			// Release all sticky keys
			for ( int i = 0; i <= GLFW_KEY_LAST; i++ ) {
				if ( window.keys[i] == _GLFW_STICK )
					window.keys[i] = GLFW_RELEASE;
			}
		}

		window.stickyKeys = enabled;

	}

	public static void setStickyMouseButtons(GLFWwindow window, boolean enabled) {
		if ( window.stickyMouseButtons == enabled )
			return;

		if ( !enabled ) {
			// Release all sticky mouse buttons
			for ( int i = 0; i <= GLFW_MOUSE_BUTTON_LAST; i++ ) {
				if ( window.mouseButtons[i] == _GLFW_STICK )
					window.mouseButtons[i] = GLFW_RELEASE;
			}
		}

		window.stickyMouseButtons = enabled;
	}

	static void inputKey(GLFWwindow window, int key, int action) {
		boolean repeated = false;

		if ( key < 0 || key > GLFW_KEY_LAST )
			return;

		if ( action == GLFW_PRESS && window.keys[key] == GLFW_PRESS )
			repeated = true;

		if ( action == GLFW_RELEASE && window.stickyKeys )
			window.keys[key] = _GLFW_STICK;
		else
			window.keys[key] = (byte)action;

		if ( repeated )
			action = GLFW_REPEAT;

		if ( window.keyCallback != null )
			window.keyCallback.invoke(window, key, action);
	}

	static void inputChar(GLFWwindow window, int character) {
		if ( character == -1 )
			return;

		if ( character < 32 || (character > 126 && character < 160) )
			return;

		if ( window.charCallback != null )
			window.charCallback.invoke(window, character);
	}

	static void inputScroll(GLFWwindow window, double xoffset, double yoffset) {
		if ( window.scrollCallback != null )
			window.scrollCallback.invoke(window, xoffset, yoffset);
	}

	static void inputMouseClick(GLFWwindow window, int button, int action) {
		if ( button < 0 || button > GLFW_MOUSE_BUTTON_LAST )
			return;

		// Register mouse button action
		if ( action == GLFW_RELEASE && window.stickyMouseButtons )
			window.mouseButtons[button] = _GLFW_STICK;
		else
			window.mouseButtons[button] = (byte)action;

		if ( window.mouseButtonCallback != null )
			window.mouseButtonCallback.invoke(window, button, action);
	}

	static void inputCursorMotion(GLFWwindow window, double x, double y) {
		if ( window.cursorMode == GLFW_CURSOR_CAPTURED ) {
			if ( x == 0.0 && y == 0.0 )
				return;

			window.cursorPosX += x;
			window.cursorPosY += y;
		} else {
			if ( window.cursorPosX == x && window.cursorPosY == y )
				return;

			window.cursorPosX = x;
			window.cursorPosY = y;
		}

		if ( window.cursorPosCallback != null )
			window.cursorPosCallback.invoke(window, window.cursorPosX, window.cursorPosY);
	}

	static void inputCursorEnter(GLFWwindow window, boolean entered) {
		if ( window.cursorEnterCallback != null )
			window.cursorEnterCallback.invoke(window, entered);
	}

}