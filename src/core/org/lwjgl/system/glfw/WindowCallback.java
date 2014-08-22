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

import java.lang.reflect.Method;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.glfw.GLFW.*;

/** This class encapsulates callback functionality for all window-specific {@link GLFW} callback methods. */
public abstract class WindowCallback {

	static final long[] CALLBACKS;

	public static enum Event {
		WINDOW_POS("windowPos", long.class, int.class, int.class),
		WINDOW_SIZE("windowSize", long.class, int.class, int.class),
		WINDOW_CLOSE("windowClose", long.class),
		WINDOW_REFRESH("windowRefresh", long.class),
		WINDOW_FOCUS("windowFocus", long.class, int.class),
		WINDOW_ICONIFY("windowIconify", long.class, int.class),
		FRAMEBUFFER_SIZE("framebufferSize", long.class, int.class, int.class),
		KEY("key", long.class, int.class, int.class, int.class, int.class),
		CHARACTER("character", long.class, int.class),
		CHARMODS("charMods", long.class, int.class, int.class),
		MOUSE_BUTTON("mouseButton", long.class, int.class, int.class, int.class),
		CURSOR_POS("cursorPos", long.class, double.class, double.class),
		CURSOR_ENTER("cursorEnter", long.class, int.class),
		SCROLL("scroll", long.class, double.class, double.class),
		DROP("drop", long.class, int.class, long.class);

		private final String     method;
		private final Class<?>[] parameterTypes;

		Event(String method, Class<?>... parameterTypes) {
			this.method = method;
			this.parameterTypes = parameterTypes;
		}
	}

	public static final EnumSet<Event> ALL = EnumSet.allOf(Event.class);

	static {
		try {
			Event[] events = Event.values();
			Method[] callbacks = new Method[events.length];
			for ( Event e : events )
				callbacks[e.ordinal()] = WindowCallback.class.getMethod(e.method, e.parameterTypes);

			PointerBuffer procs = BufferUtils.createPointerBuffer(callbacks.length);

			setCallbacks(callbacks, memAddress(procs));

			CALLBACKS = new long[callbacks.length];
			for ( int i = 0; i < CALLBACKS.length; i++ ) {
				CALLBACKS[i] = procs.get(i);
				if ( CALLBACKS[i] == NULL )
					throw new IllegalStateException();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static final Set<Long> windows = new HashSet<>();

	private EnumSet<Event> eventTypes = EnumSet.noneOf(Event.class);

	protected WindowCallback() {
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
	public static void set(long window, WindowCallback proc, EnumSet<Event> eventTypes) {
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

			windows.add(window);
			glfwSetWindowUserPointer(window, memGlobalRefNew(proc));

			proc.eventTypes.clear();
			proc.eventTypes.addAll(eventTypes);

			configEvents(window, eventTypes, 1L);
		}
	}

	private static void cleanup(long window, long oldRef) {
		WindowCallback old = memGlobalRefToObject(oldRef);
		configEvents(window, old.eventTypes, 0L);

		glfwSetWindowUserPointer(window, NULL);
		memGlobalRefDelete(oldRef);
	}

	private static void configEvents(long window, EnumSet<Event> eventTypes, long enable) {
		for ( Event event : eventTypes ) {
			long callback = CALLBACKS[event.ordinal()] * enable;
			switch ( event ) {
				case WINDOW_POS:
					glfwSetWindowPosCallback(window, callback);
					break;
				case WINDOW_SIZE:
					glfwSetWindowSizeCallback(window, callback);
					break;
				case WINDOW_CLOSE:
					glfwSetWindowCloseCallback(window, callback);
					break;
				case WINDOW_REFRESH:
					glfwSetWindowRefreshCallback(window, callback);
					break;
				case WINDOW_FOCUS:
					glfwSetWindowFocusCallback(window, callback);
					break;
				case WINDOW_ICONIFY:
					glfwSetWindowIconifyCallback(window, callback);
					break;
				case FRAMEBUFFER_SIZE:
					glfwSetFramebufferSizeCallback(window, callback);
					break;
				case KEY:
					glfwSetKeyCallback(window, callback);
					break;
				case CHARACTER:
					glfwSetCharCallback(window, callback);
					break;
				case CHARMODS:
					glfwSetCharModsCallback(window, callback);
					break;
				case MOUSE_BUTTON:
					glfwSetMouseButtonCallback(window, callback);
					break;
				case CURSOR_POS:
					glfwSetCursorPosCallback(window, callback);
					break;
				case CURSOR_ENTER:
					glfwSetCursorEnterCallback(window, callback);
					break;
				case SCROLL:
					glfwSetScrollCallback(window, callback);
					break;
				case DROP:
					glfwSetDropCallback(window, callback);
					break;
				default:
					throw new IllegalStateException("Unsupported event type: " + event.name());
			}
		}
	}

	/**
	 * This is called automatically on {@link GLFW#glfwTerminate()}. Iterates over all GLFW
	 * windows and clears the associated WindowCallback. We do this to avoid a memory leak
	 * from the global reference we create in {@link #set(long, WindowCallback, java.util.EnumSet)}.
	 */
	static void clearAll() {
		for ( Long window : windows )
			cleanup(window, glfwGetWindowUserPointer(window));

		windows.clear();
	}

	/**
	 * The window move callback.
	 *
	 * @param window the window that was moved
	 * @param xpos   the new x-coordinate, in pixels, of the upper-left corner of the client area of the window
	 * @param ypos   the new y-coordinate, in pixels, of the upper-left corner of the client area of the window
	 *
	 * @see GLFW#glfwSetWindowPosCallback
	 */
	public abstract void windowPos(long window, int xpos, int ypos);

	/**
	 * The window resize callback.
	 *
	 * @param window the window that was resized
	 * @param width  the new width, in pixels, of the window
	 * @param height the new height, in pixels, of the window
	 *
	 * @see GLFW#glfwSetWindowSizeCallback
	 */
	public abstract void windowSize(long window, int width, int height);

	/**
	 * The window close callback.
	 *
	 * @param window the window that the user attempted to close
	 *
	 * @see GLFW#glfwSetWindowCloseCallback
	 */
	public abstract void windowClose(long window);

	/**
	 * The window refresh callback.
	 *
	 * @param window the window whose content needs to be refreshed
	 *
	 * @see GLFW#glfwSetWindowRefreshCallback
	 */
	public abstract void windowRefresh(long window);

	/**
	 * The window focus callback.
	 *
	 * @param window  the window that was focused or defocused
	 * @param focused {@link GL11#GL_TRUE} if the window was focused, or {@link GL11#GL_FALSE} if it was defocused
	 *
	 * @see GLFW#glfwSetWindowFocusCallback
	 */
	public abstract void windowFocus(long window, int focused);

	/**
	 * The window iconify callback.
	 *
	 * @param window    the window that was iconified or restored.
	 * @param iconified {@link GL11#GL_TRUE} if the window was iconified, or {@link GL11#GL_FALSE} if it was restored
	 *
	 * @see GLFW#glfwSetWindowIconifyCallback
	 */
	public abstract void windowIconify(long window, int iconified);

	/**
	 * The framebuffer size callback.
	 *
	 * @param window the window whose framebuffer was resized
	 * @param width  the new width, in pixels, of the framebuffer
	 * @param height the new hieght, in pixels, of the framebuffer
	 *
	 * @see GLFW#glfwSetFramebufferSizeCallback
	 */
	public abstract void framebufferSize(long window, int width, int height);

	/**
	 * The key callback.
	 *
	 * @param window the window that received the event
	 * @param key    the keyboard key that was pressed or released
	 * @param action the key action. One of:<p/>{@link GLFW#GLFW_PRESS}, {@link GLFW#GLFW_RELEASE}, {@link GLFW#GLFW_REPEAT}
	 * @param mods   bitfield describing which modifiers keys were held down
	 *
	 * @see GLFW#glfwSetKeyCallback
	 */
	public abstract void key(long window, int key, int scancode, int action, int mods);

	/**
	 * The char callback.
	 *
	 * @param window    the window that received the event
	 * @param codepoint the Unicode code point of the character
	 *
	 * @see GLFW#glfwSetCharCallback
	 */
	public abstract void character(long window, int codepoint);

	/**
	 * This Unicode character with modifiers callback. It is called for each input character, regardless of what modifier keys are held down.
	 *
	 * @param window    the window that received the event
	 * @param codepoint the Unicode code point of the character
	 * @param mods      bitfield describing which modifier keys were held down
	 *
	 * @see GLFW#glfwSetCharModsCallback
	 */
	public abstract void charMods(long window, int codepoint, int mods);

	/**
	 * The mouse button callback.
	 *
	 * @param window the window that received the event
	 * @param button the mouse button that was pressed or released
	 * @param action the button action. One of:<p/>{@link GLFW#GLFW_PRESS}, {@link GLFW#GLFW_RELEASE}
	 * @param mods   bitfield describing which modifiers keys were held down
	 *
	 * @see GLFW#glfwSetMouseButtonCallback
	 */
	public abstract void mouseButton(long window, int button, int action, int mods);

	/**
	 * The cursor move callback.
	 *
	 * @param window the window that received the event
	 * @param xpos   the new x-coordinate, in screen coordinates of the cursor
	 * @param ypos   the new y-coordinate, in screen coordinates of the cursor
	 *
	 * @see GLFW#glfwSetCursorPosCallback
	 */
	public abstract void cursorPos(long window, double xpos, double ypos);

	/**
	 * The cursor enter callback.
	 *
	 * @param window  the window that received the event
	 * @param entered {@link GL11#GL_TRUE} if the cursor enter the window's client area, or {@link GL11#GL_FALSE} if it left it
	 *
	 * @see GLFW#glfwSetCursorEnterCallback
	 */
	public abstract void cursorEnter(long window, int entered);

	/**
	 * The scroll callback.
	 *
	 * @param window  the window that received the event
	 * @param xoffset the scroll offset along the x-axis
	 * @param yoffset the scroll offset along the y-axis
	 *
	 * @see GLFW#glfwSetScrollCallback
	 */
	public abstract void scroll(long window, double xoffset, double yoffset);

	/**
	 * The file drop callback.
	 *
	 * @param window the window that received the event
	 * @param count  the number of dropped files
	 * @param names  pointer to the array of UTF-8 encoded path names of the dropped files
	 *
	 * @see GLFW#glfwSetDropCallback
	 */
	public abstract void drop(long window, int count, long names);

}