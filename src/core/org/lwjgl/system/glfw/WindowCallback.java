/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.glfw;

import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.LWJGLUtil.Platform;
import org.lwjgl.PointerBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.FastLongMap;

import java.lang.reflect.Method;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.glfw.GLFW.*;

/** This class encapsulates callback functionality for all window-specific {@link GLFW} callback methods. */
public abstract class WindowCallback {

	static final long[] CALLBACKS;

	private static final int WINDOW_POS_INDEX     = 0;
	private static final int WINDOW_SIZE_INDEX    = 1;
	private static final int WINDOW_CLOSE_INDEX   = 2;
	private static final int WINDOW_REFRESH_INDEX = 3;
	private static final int WINDOW_FOCUS_INDEX   = 4;
	private static final int WINDOW_ICONIFY_INDEX = 5;
	private static final int KEY_INDEX            = 6;
	private static final int CHARACTER_INDEX      = 7;
	private static final int MOUSE_BUTTON_INDEX   = 8;
	private static final int CURSOR_POS_INDEX     = 9;
	private static final int CURSOR_ENTER_INDEX   = 10;
	private static final int SCROLL_INDEX         = 11;

	private static final int LAST_INDEX = SCROLL_INDEX;

	public static final int WINDOW_POS     = 1 << WINDOW_POS_INDEX;
	public static final int WINDOW_SIZE    = 1 << WINDOW_SIZE_INDEX;
	public static final int WINDOW_CLOSE   = 1 << WINDOW_CLOSE_INDEX;
	public static final int WINDOW_REFRESH = 1 << WINDOW_REFRESH_INDEX;
	public static final int WINDOW_FOCUS   = 1 << WINDOW_FOCUS_INDEX;
	public static final int WINDOW_ICONIFY = 1 << WINDOW_ICONIFY_INDEX;
	public static final int KEY            = 1 << KEY_INDEX;
	public static final int CHARACTER      = 1 << CHARACTER_INDEX;
	public static final int MOUSE_BUTTON   = 1 << MOUSE_BUTTON_INDEX;
	public static final int CURSOR_POS     = 1 << CURSOR_POS_INDEX;
	public static final int CURSOR_ENTER   = 1 << CURSOR_ENTER_INDEX;
	public static final int SCROLL         = 1 << SCROLL_INDEX;

	public static final int ALL = 0xFFFF;

	static {
		try {
			Method[] callbacks = new Method[LAST_INDEX + 1];

			getMethod(callbacks, WINDOW_POS_INDEX, "windowPos", long.class, int.class, int.class);
			getMethod(callbacks, WINDOW_SIZE_INDEX, "windowSize", long.class, int.class, int.class);
			getMethod(callbacks, WINDOW_CLOSE_INDEX, "windowClose", long.class);
			getMethod(callbacks, WINDOW_REFRESH_INDEX, "windowRefresh", long.class);
			getMethod(callbacks, WINDOW_FOCUS_INDEX, "windowFocus", long.class, int.class);
			getMethod(callbacks, WINDOW_ICONIFY_INDEX, "windowIconify", long.class, int.class);
			getMethod(callbacks, KEY_INDEX, "key", long.class, int.class, int.class);
			getMethod(callbacks, CHARACTER_INDEX, "character", long.class, int.class);
			getMethod(callbacks, MOUSE_BUTTON_INDEX, "mouseButton", long.class, int.class, int.class);
			getMethod(callbacks, CURSOR_POS_INDEX, "cursorPos", long.class, double.class, double.class);
			getMethod(callbacks, CURSOR_ENTER_INDEX, "cursorEnter", long.class, int.class);
			getMethod(callbacks, SCROLL_INDEX, "scroll", long.class, double.class, double.class);

			PointerBuffer procs = BufferUtils.createPointerBuffer(callbacks.length);

			setCallbacks(callbacks, memAddress(procs));

			CALLBACKS = new long[callbacks.length];
			for ( int i = 0; i < CALLBACKS.length; i++ )
				CALLBACKS[i] = procs.get(i);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	// This is used like a Set.
	private static final FastLongMap<Long> windows = new FastLongMap<Long>();

	private int eventTypes;

	protected WindowCallback() {
	}

	private static void getMethod(Method[] callbacks, int index, String name, Class<?>... parameterTypes) throws NoSuchMethodException {
		callbacks[index] = WindowCallback.class.getDeclaredMethod(name, parameterTypes);
	}

	private static native void setCallbacks(Method[] callbacks, long procs);

	/**
	 * Enables all window event callbacks for the given GLFW window.
	 *
	 * @param window the GLFW window
	 * @param proc   the WindowCallback instance, or NULL to disable event callbacks.
	 */
	public static void set(long window, WindowCallback proc) {
		set(window, proc, ALL);
	}

	/**
	 * Enables window event callbacks for the given GLFW window. The {@code eventTypes} parameter
	 * is a bit-field the defines which type of events to enable.
	 *
	 * @param window     the GLFW window
	 * @param proc       the WindowCallback instance, or NULL to disable event callbacks.
	 * @param eventTypes the event types bit-field
	 */
	public static void set(long window, WindowCallback proc, int eventTypes) {
		long oldRef = glfwGetWindowUserPointer(window);
		if ( oldRef != NULL ) {
			cleanup(window, oldRef);
			windows.remove(window);
		}

		if ( proc != null ) {
			if ( LWJGLUtil.getPlatform() == Platform.MACOSX ) {
				// Wrap the user-specified callback
				proc = new WindowCallbackMacOSX(proc);
				// Enable all event types, else glfwWaitEvents can block
				eventTypes = ALL;
			}

			windows.put(window, window);
			glfwSetWindowUserPointer(window, memGlobalRefNew(proc));

			configEvents(window, proc.eventTypes = eventTypes, 1L);
		}
	}

	private static void cleanup(long window, long oldRef) {
		WindowCallback old = memGlobalRefToObject(oldRef);
		configEvents(window, old.eventTypes, 0L);

		glfwSetWindowUserPointer(window, NULL);
		memGlobalRefDelete(oldRef);
	}

	private static boolean isEventEnabled(int eventTypes, int type) {
		return (eventTypes & type) != 0;
	}

	private static void configEvents(long window, int eventTypes, long enable) {
		if ( isEventEnabled(eventTypes, WINDOW_POS) )
			glfwSetWindowPosCallback(window, CALLBACKS[WINDOW_POS_INDEX] * enable);

		if ( isEventEnabled(eventTypes, WINDOW_SIZE) )
			glfwSetWindowSizeCallback(window, CALLBACKS[WINDOW_SIZE_INDEX] * enable);

		if ( isEventEnabled(eventTypes, WINDOW_CLOSE) )
			glfwSetWindowCloseCallback(window, CALLBACKS[WINDOW_CLOSE_INDEX] * enable);

		if ( isEventEnabled(eventTypes, WINDOW_REFRESH) )
			glfwSetWindowRefreshCallback(window, CALLBACKS[WINDOW_REFRESH_INDEX] * enable);

		if ( isEventEnabled(eventTypes, WINDOW_FOCUS) )
			glfwSetWindowFocusCallback(window, CALLBACKS[WINDOW_FOCUS_INDEX] * enable);

		if ( isEventEnabled(eventTypes, WINDOW_ICONIFY) )
			glfwSetWindowIconifyCallback(window, CALLBACKS[WINDOW_ICONIFY_INDEX] * enable);

		if ( isEventEnabled(eventTypes, KEY) )
			glfwSetKeyCallback(window, CALLBACKS[KEY_INDEX] * enable);

		if ( isEventEnabled(eventTypes, CHARACTER) )
			glfwSetCharCallback(window, CALLBACKS[CHARACTER_INDEX] * enable);

		if ( isEventEnabled(eventTypes, MOUSE_BUTTON) )
			glfwSetMouseButtonCallback(window, CALLBACKS[MOUSE_BUTTON_INDEX] * enable);

		if ( isEventEnabled(eventTypes, CURSOR_POS) )
			glfwSetCursorPosCallback(window, CALLBACKS[CURSOR_POS_INDEX] * enable);

		if ( isEventEnabled(eventTypes, CURSOR_ENTER) )
			glfwSetCursorEnterCallback(window, CALLBACKS[CURSOR_ENTER_INDEX] * enable);

		if ( isEventEnabled(eventTypes, SCROLL) )
			glfwSetScrollCallback(window, CALLBACKS[SCROLL_INDEX] * enable);
	}

	/**
	 * This is called automatically on {@link GLFW#glfwTerminate()}. Iterates over all GLFW
	 * windows and clears the associated WindowCallback. We do this to avoid a memory leak
	 * from the global reference we create in {@link #set(long, WindowCallback, int)}.
	 */
	static void clearAll() {
		for ( FastLongMap.Entry<Long> entry : windows )
			cleanup(entry.getKey(), glfwGetWindowUserPointer(entry.getKey()));

		windows.clear();
	}

	/**
	 * The window move callback.
	 *
	 * @param window the window that was moved
	 * @param xpos   the new x-coordinate, in pixels, of the upper-left corner of the client area of the window
	 * @param ypos   the new y-coordinate, in pixels, of the upper-left corner of the client area of the window
	 *
	 * @see GLFW#glfwSetWindowPosCallback(long, long)
	 */
	public abstract void windowPos(long window, int xpos, int ypos);

	/**
	 * The window resize callback.
	 *
	 * @param window the window that was resized
	 * @param width  the new width, in pixels, of the window
	 * @param height the new height, in pixels, of the window
	 *
	 * @see GLFW#glfwSetWindowSizeCallback(long, long)
	 */
	public abstract void windowSize(long window, int width, int height);

	/**
	 * The window close callback.
	 *
	 * @param window the window that the user attempted to close
	 *
	 * @see GLFW#glfwSetWindowCloseCallback(long, long)
	 */
	public abstract void windowClose(long window);

	/**
	 * The window refresh callback.
	 *
	 * @param window the window whose content needs to be refreshed
	 *
	 * @see GLFW#glfwSetWindowRefreshCallback(long, long)
	 */
	public abstract void windowRefresh(long window);

	/**
	 * The window focus callback.
	 *
	 * @param window  the window that was focused or defocused
	 * @param focused {@link GL11#GL_TRUE} if the window was focused, or {@link GL11#GL_FALSE} if it was defocused
	 *
	 * @see GLFW#glfwSetWindowFocusCallback(long, long)
	 */
	public abstract void windowFocus(long window, int focused);

	/**
	 * The window iconify callback.
	 *
	 * @param window    the window that was iconified or restored.
	 * @param iconified {@link GL11#GL_TRUE} if the window was iconified, or {@link GL11#GL_FALSE} if it was restored
	 *
	 * @see GLFW#glfwSetWindowIconifyCallback(long, long)
	 */
	public abstract void windowIconify(long window, int iconified);

	/**
	 * The key callback.
	 *
	 * @param window the window that received the event
	 * @param key    the keyboard key that was pressed or released
	 * @param action the key action. One of:<p/>{@link GLFW#GLFW_PRESS}, {@link GLFW#GLFW_RELEASE}, {@link GLFW#GLFW_REPEAT}
	 *
	 * @see GLFW#glfwSetKeyCallback(long, long)
	 */
	public abstract void key(long window, int key, int action);

	/**
	 * The char callback.
	 *
	 * @param window    the window that received the event
	 * @param character the Unicode code point of the character
	 *
	 * @see GLFW#glfwSetCharCallback(long, long)
	 */
	public abstract void character(long window, int character);

	/**
	 * The mouse button callback.
	 *
	 * @param window the window that received the event
	 * @param button the mouse button that was pressed or released
	 * @param action the button action. One of:<p/>{@link GLFW#GLFW_PRESS}, {@link GLFW#GLFW_RELEASE}
	 *
	 * @see GLFW#glfwSetMouseButtonCallback(long, long)
	 */
	public abstract void mouseButton(long window, int button, int action);

	/**
	 * The cursor move callback.
	 *
	 * @param window the window that received the event
	 * @param xpos   the new x-coordinate of the cursor
	 * @param ypos   the new y-coordinate of the cursor
	 *
	 * @see GLFW#glfwSetCursorPosCallback(long, long)
	 */
	public abstract void cursorPos(long window, double xpos, double ypos);

	/**
	 * The cursor enter callback.
	 *
	 * @param window  the window that received the event
	 * @param entered {@link GL11#GL_TRUE} if the cursor enter the window's client area, or {@link GL11#GL_FALSE} if it left it
	 *
	 * @see GLFW#glfwSetCursorEnterCallback(long, long)
	 */
	public abstract void cursorEnter(long window, int entered);

	/**
	 * The scroll callback.
	 *
	 * @param window the window that received the event
	 * @param xpos   the scroll offset along the x-axis
	 * @param ypos   the scroll offset along the y-axis
	 *
	 * @see GLFW#glfwSetScrollCallback(long, long)
	 */
	public abstract void scroll(long window, double xpos, double ypos);

}