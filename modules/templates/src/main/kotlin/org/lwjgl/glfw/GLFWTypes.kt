/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.glfw

import org.lwjgl.generator.*

val GLFW_PACKAGE = "org.lwjgl.glfw"

val GLFWmonitor = "GLFWmonitor".p
val GLFWmonitor_p = GLFWmonitor.p

val GLFWwindow = "GLFWwindow".p

val GLFWvidmode_p = struct_p(GLFW_PACKAGE, "GLFWvidmode") {
	documentation = "Video mode."
	nativeImport("glfw3.h")
	int.member("width")
	int.member("height")
	int.member("redBits")
	int.member("greenBits")
	int.member("blueBits")
	int.member("refreshRate")
}

val GLFWgammaramp_p = struct_p(GLFW_PACKAGE, "GLFWgammaramp") {
	documentation = "Gamma ramp."
	nativeImport("glfw3.h")
	unsigned_short_p.member("red")
	unsigned_short_p.member("green")
	unsigned_short_p.member("blue")
	unsigned_int.member("size")
}

val GLFWcursor = "GLFWcursor".p

val GLFWimage_p = struct_p(GLFW_PACKAGE, "GLFWimage") {
	documentation = "Image data."
	nativeImport("glfw3.h")
	int.member("width")
	int.member("height")
	unsigned_char_p.member("pixels")
}

// callback functions

val GLFWerrorfun = "GLFWerrorfun".callback(
	GLFW_PACKAGE, void, "GLFWErrorCallback",
	"Will be called with an error code and a human-readable description when a GLFW error occurs.",
	int.IN("error", "the error code"),
	nullTerminated _ charUTF8_p.IN("description", "a pointer to a UTF-8 encoded string describing the error"),
    samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetErrorCallback() method."
	preamble.javaImport(
		"java.io.PrintStream",
		"java.lang.reflect.Field",
		"java.util.Map",
        "org.lwjgl.LWJGLUtil.TokenFilter",
	    "static org.lwjgl.glfw.GLFW.*"
	)
	additionalCode = """
	/**
	 * Converts the specified {@link GLFWErrorCallback} argument to a String.
	 *
	 * <p>This method may only be used inside a GLFWErrorCallback invocation.</p>
	 *
	 * @param description pointer to the UTF-8 encoded description string
	 *
	 * @return the description as a String
	 */
	public static String getDescription(long description) {
		return memDecodeUTF8(description);
	}

	/** A functional interface for {@link GLFWErrorCallback}. */
	public interface SAMString {
		void invoke(int error, String description);
	}

	/**
	 * Creates a {@link GLFWErrorCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWErrorCallback} instance
	 */
	public static GLFWErrorCallback createString(final SAMString sam) {
		return new GLFWErrorCallback() {
			@Override
			public void invoke(int error, long description) {
				sam.invoke(error, getDescription(description));
			}
		};
	}

	/**
	 * Returns a {@link GLFWErrorCallback} instance that prints the error to the {@link LWJGLUtil#DEBUG_STREAM}.
	 *
	 * @return the GLFWerrorCallback
	 */
	public static GLFWErrorCallback createPrint() {
		return createPrint(LWJGLUtil.DEBUG_STREAM);
	}

	/**
	 * Returns a {@link GLFWErrorCallback} instance that prints the error in the specified {@link PrintStream}.
	 *
	 * @param stream the PrintStream to use
	 *
	 * @return the GLFWerrorCallback
	 */
	public static GLFWErrorCallback createPrint(final PrintStream stream) {
		return new GLFWErrorCallback() {
			private final Map<Integer, String> ERROR_CODES = LWJGLUtil.getClassTokens(new TokenFilter() {
				@Override
				public boolean accept(Field field, int value) {
					return 0x10000 < value && value < 0x20000;
				}
			}, null, GLFW.class);

			@Override
			public void invoke(int error, long description) {
				String msg = memDecodeUTF8(description);

				stream.printf("[LWJGL] %s error\n", ERROR_CODES.get(error));
				stream.println("\tDescription : " + msg);
				stream.println("\tStacktrace  :");
				StackTraceElement[] stack = Thread.currentThread().getStackTrace();
				for ( int i = 4; i < stack.length; i++ ) {
					stream.print("\t\t");
					stream.println(stack[i].toString());
				}
			}
		};
	}

	/**
	 * Returns a {@link GLFWErrorCallback} instance that throws an {@link IllegalStateException} when an error occurs.
	 *
	 * @return the GLFWerrorCallback
	 */
	public static GLFWErrorCallback createThrow() {
		return new GLFWErrorCallback() {
			@Override
			public void invoke(int error, long description) {
				throw new IllegalStateException(String.format("GLFW error [0x%X]: %s", error, memDecodeUTF8(description)));
			}
		};
	}

	/** See {@link GLFW#glfwSetErrorCallback SetErrorCallback}. */
	public GLFWErrorCallback set() {
		glfwSetErrorCallback(this);
		return this;
	}
"""
}

val GLFWmonitorfun = "GLFWmonitorfun".callback(
	GLFW_PACKAGE, void, "GLFWMonitorCallback",
	"Will be called when a monitor is connected to or disconnected from the system.",
	GLFWmonitor.IN("monitor", "the monitor that was connected or disconnected"),
	int.IN("event", "one of GLFW##GLFW_CONNECTED or GLFW##GLFW_DISCONNECTED"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetMonitorCallback() method."
	preamble.javaImport("static org.lwjgl.glfw.GLFW.*")
	additionalCode = """
	/** See {@link GLFW#glfwSetMonitorCallback SetMonitorCallback}. */
	public GLFWMonitorCallback set() {
		glfwSetMonitorCallback(this);
		return this;
	}
	"""
}

val GLFWwindowposfun = "GLFWwindowposfun".callback(
	GLFW_PACKAGE, void, "GLFWWindowPosCallback",
	"Will be called when the specified window moves.",
	GLFWwindow.IN("window", "the window that was moved"),
	int.IN("xpos", "the new x-coordinate, in pixels, of the upper-left corner of the client area of the window"),
	int.IN("ypos", "the new y-coordinate, in pixels, of the upper-left corner of the client area of the window"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetWindowPosCallback() method."
	preamble.javaImport("static org.lwjgl.glfw.GLFW.*")
	additionalCode = """
	/** See {@link GLFW#glfwSetWindowPosCallback SetWindowPosCallback}. */
	public GLFWWindowPosCallback set(long window) {
		glfwSetWindowPosCallback(window, this);
		return this;
	}
	"""
}


val GLFWwindowsizefun = "GLFWwindowsizefun".callback(
	GLFW_PACKAGE, void, "GLFWWindowSizeCallback",
	"Will be called when the specified window is resized.",
	GLFWwindow.IN("window", "the window that was resized"),
	int.IN("width", "the new width, in pixels, of the window"),
	int.IN("height", "the new height, in pixels, of the window"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetWindowSizeCallback() method."
	preamble.javaImport("static org.lwjgl.glfw.GLFW.*")
	additionalCode = """
	/** See {@link GLFW#glfwSetWindowSizeCallback SetWindowSizeCallback}. */
	public GLFWWindowSizeCallback set(long window) {
		glfwSetWindowSizeCallback(window, this);
		return this;
	}
	"""
}

val GLFWwindowclosefun = "GLFWwindowclosefun".callback(
	GLFW_PACKAGE, void, "GLFWWindowCloseCallback",
	"Will be called when the user attempts to close the specified window, for example by clicking the close widget in the title bar.",
	GLFWwindow.IN("window", "the window that the user attempted to close"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetWindowCloseCallback() method."
	preamble.javaImport("static org.lwjgl.glfw.GLFW.*")
	additionalCode = """
	/** See {@link GLFW#glfwSetWindowCloseCallback SetWindowCloseCallback}. */
	public GLFWWindowCloseCallback set(long window) {
		glfwSetWindowCloseCallback(window, this);
		return this;
	}
	"""
}

val GLFWwindowrefreshfun = "GLFWwindowrefreshfun".callback(
	GLFW_PACKAGE, void, "GLFWWindowRefreshCallback",
	"""
	Will be called when the client area of the specified window needs to be redrawn, for example if the window has been exposed after having been covered by
	another window.
	""",
	GLFWwindow.IN("window", "the window whose content needs to be refreshed"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetWindowRefreshCallback() method."
	preamble.javaImport("static org.lwjgl.glfw.GLFW.*")
	additionalCode = """
	/** See {@link GLFW#glfwSetWindowRefreshCallback SetWindowRefreshCallback}. */
	public GLFWWindowRefreshCallback set(long window) {
		glfwSetWindowRefreshCallback(window, this);
		return this;
	}
	"""
}

val GLFWwindowfocusfun = "GLFWwindowfocusfun".callback(
	GLFW_PACKAGE, void, "GLFWWindowFocusCallback",
	"Will be called when the specified window gains or loses focus.",
	GLFWwindow.IN("window", "the window that was focused or defocused"),
	int.IN("focused", "GL11##GL_TRUE if the window was focused, or GL11##GL_FALSE if it was defocused"),
	samConstructor = "GLFW"
) {
	javaImport("org.lwjgl.opengl.GL11")
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetWindowFocusCallback() method."
	preamble.javaImport("static org.lwjgl.glfw.GLFW.*")
	additionalCode = """
	/** See {@link GLFW#glfwSetWindowFocusCallback SetWindowFocusCallback}. */
	public GLFWWindowFocusCallback set(long window) {
		glfwSetWindowFocusCallback(window, this);
		return this;
	}
	"""
}

val GLFWwindowiconifyfun = "GLFWwindowiconifyfun".callback(
	GLFW_PACKAGE, void, "GLFWWindowIconifyCallback",
	"Will be called when the specified window is iconified or restored.",
	GLFWwindow.IN("window", "the window that was iconified or restored."),
	int.IN("iconified", "GL11#GL_TRUE if the window was iconified, or GL11#GL_FALSE if it was restored"),
	samConstructor = "GLFW"
) {
	javaImport("org.lwjgl.opengl.GL11")
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetWindowIconifyCallback() method."
	preamble.javaImport("static org.lwjgl.glfw.GLFW.*")
	additionalCode = """
	/** See {@link GLFW#glfwSetWindowIconifyCallback SetWindowIconifyCallback}. */
	public GLFWWindowIconifyCallback set(long window) {
		glfwSetWindowIconifyCallback(window, this);
		return this;
	}
	"""
}

val GLFWframebuffersizefun = "GLFWframebuffersizefun".callback(
	GLFW_PACKAGE, void, "GLFWFramebufferSizeCallback",
	"Will be called when the framebuffer of the specified window is resized.",
	GLFWwindow.IN("window", "the window whose framebuffer was resized"),
	int.IN("width", "the new width, in pixels, of the framebuffer"),
	int.IN("height", "the new height, in pixels, of the framebuffer"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetFramebufferSizeCallback() method."
	preamble.javaImport("static org.lwjgl.glfw.GLFW.*")
	additionalCode = """
	/** See {@link GLFW#glfwSetFramebufferSizeCallback SetFramebufferSizeCallback}. */
	public GLFWFramebufferSizeCallback set(long window) {
		glfwSetFramebufferSizeCallback(window, this);
		return this;
	}
	"""
}

val GLFWkeyfun = "GLFWkeyfun".callback(
	GLFW_PACKAGE, void, "GLFWKeyCallback",
	"Will be called when a key is pressed, repeated or released.",
	GLFWwindow.IN("window", "the window that received the event"),
	int.IN("key", "the keyboard key that was pressed or released"),
	int.IN("scancode", "the system-specific scancode of the key"),
	int.IN("action", "the key action", "GLFW##GLFW_PRESS GLFW##GLFW_RELEASE GLFW##GLFW_REPEAT"),
	int.IN("mods", "bitfield describing which modifiers keys were held down"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetKeyCallback() method."
	preamble.javaImport("static org.lwjgl.glfw.GLFW.*")
	additionalCode = """
	/** See {@link GLFW#glfwSetKeyCallback SetKeyCallback}. */
	public GLFWKeyCallback set(long window) {
		glfwSetKeyCallback(window, this);
		return this;
	}
	"""
}

val GLFWcharfun = "GLFWcharfun".callback(
	GLFW_PACKAGE, void, "GLFWCharCallback",
	"Will be called when a Unicode character is input.",
	GLFWwindow.IN("window", "the window that received the event"),
	unsigned_int.IN("codepoint", "the Unicode code point of the character"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetCharCallback() method."
	preamble.javaImport("static org.lwjgl.glfw.GLFW.*")
	additionalCode = """
	/** See {@link GLFW#glfwSetCharCallback SetCharCallback}. */
	public GLFWCharCallback set(long window) {
		glfwSetCharCallback(window, this);
		return this;
	}
	"""
}

val GLFWcharmodsfun = "GLFWcharmodsfun".callback(
	GLFW_PACKAGE, void, "GLFWCharModsCallback",
	"Will be called when a Unicode character is input regardless of what modifier keys are used.",
	GLFWwindow.IN("window", "the window that received the event"),
	unsigned_int.IN("codepoint", "the Unicode code point of the character"),
	int.IN("mods", "bitfield describing which modifier keys were held down"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetCharModsCallback() method."
	preamble.javaImport("static org.lwjgl.glfw.GLFW.*")
	additionalCode = """
	/** See {@link GLFW#glfwSetCharModsCallback SetCharModsCallback}. */
	public GLFWCharModsCallback set(long window) {
		glfwSetCharModsCallback(window, this);
		return this;
	}
	"""
}

val GLFWmousebuttonfun = "GLFWmousebuttonfun".callback(
	GLFW_PACKAGE, void, "GLFWMouseButtonCallback",
	"Will be called when a mouse button is pressed or released.",
	GLFWwindow.IN("window", "the window that received the event"),
	int.IN("button", "the mouse button that was pressed or released"),
	int.IN("action", "the button action", "GLFW##GLFW_PRESS GLFW##GLFW_RELEASE GLFW##GLFW_REPEAT"),
	int.IN("mods", "bitfield describing which modifiers keys were held down"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetMouseButtonCallback() method."
	preamble.javaImport("static org.lwjgl.glfw.GLFW.*")
	additionalCode = """
	/** See {@link GLFW#glfwSetMouseButtonCallback SetMouseButtonCallback}. */
	public GLFWMouseButtonCallback set(long window) {
		glfwSetMouseButtonCallback(window, this);
		return this;
	}
	"""
}

val GLFWcursorposfun = "GLFWcursorposfun".callback(
	GLFW_PACKAGE, void, "GLFWCursorPosCallback",
	"Will be called when the cursor is moved.",
	GLFWwindow.IN("window", "the window that received the event"),
	double.IN("xpos", "the new x-coordinate, in screen coordinates of the cursor"),
	double.IN("ypos", "the new y-coordinate, in screen coordinates of the cursor"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetCursorPosCallback() method."
	preamble.javaImport("static org.lwjgl.glfw.GLFW.*")
	additionalCode = """
	/** See {@link GLFW#glfwSetCursorPosCallback SetCursorPosCallback}. */
	public GLFWCursorPosCallback set(long window) {
		glfwSetCursorPosCallback(window, this);
		return this;
	}
	"""
}

val GLFWcursorenterfun = "GLFWcursorenterfun".callback(
	GLFW_PACKAGE, void, "GLFWCursorEnterCallback",
	"Will be called when the cursor enters or leaves the client area of the window.",
	GLFWwindow.IN("window", "the window that received the event"),
	int.IN("entered", "GL11##GL_TRUE if the cursor entered the window's client area, or GL11##GL_FALSE if it left it"),
	samConstructor = "GLFW"
) {
	javaImport("org.lwjgl.opengl.GL11")
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetCursorEnterCallback() method."
	preamble.javaImport("static org.lwjgl.glfw.GLFW.*")
	additionalCode = """
	/** See {@link GLFW#glfwSetCursorEnterCallback SetCursorEnterCallback}. */
	public GLFWCursorEnterCallback set(long window) {
		glfwSetCursorEnterCallback(window, this);
		return this;
	}
	"""
}

val GLFWscrollfun = "GLFWscrollfun".callback(
	GLFW_PACKAGE, void, "GLFWScrollCallback",
	"Will be called when a scrolling device is used, such as a mouse wheel or scrolling area of a touchpad.",
	GLFWwindow.IN("window", "the window that received the event"),
	double.IN("xoffset", "the scroll offset along the x-axis"),
	double.IN("yoffset", "the scroll offset along the y-axis"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetScrollCallback() method."
	preamble.javaImport("static org.lwjgl.glfw.GLFW.*")
	additionalCode = """
	/** See {@link GLFW#glfwSetScrollCallback SetScrollCallback}. */
	public GLFWScrollCallback set(long window) {
		glfwSetScrollCallback(window, this);
		return this;
	}
	"""
}

val GLFWdropfun = "GLFWdropfun".callback(
	GLFW_PACKAGE, void, "GLFWDropCallback",
	"Will be called when one or more dragged files are dropped on the window.",
	GLFWwindow.IN("window", "the window that received the event"),
	AutoSize("names") _ int.IN("count", "the number of dropped files"),
	const _ char_pp.IN("names", "pointer to the array of UTF-8 encoded path names of the dropped files"),
	samConstructor = "GLFW"
) {
	documentation = "Instances of this interface may be passed to the GLFW##glfwSetDropCallback() method."
	preamble.javaImport("static org.lwjgl.glfw.GLFW.*")
	additionalCode = """
	/** A functional interface for {@link GLFWDropCallback}. */
	public interface SAMBuffer {
		void invoke(long window, ByteBuffer[] names);
	}

	/**
	 * Creates a {@link GLFWDropCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWDropCallback} instance
	 */
	public static GLFWDropCallback createBuffer(final SAMBuffer sam) {
		return new GLFWDropCallback() {
			@Override
			public void invoke(long window, int count, long names) {
				sam.invoke(window, getNamesBuffer(count, names));
			}
		};
	}

	/** A functional interface for {@link GLFWDropCallback}. */
	public interface SAMString {
		void invoke(long window, String[] names);
	}

	/**
	 * Creates a {@link GLFWDropCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link GLFWDropCallback} instance
	 */
	public static GLFWDropCallback createString(final SAMString sam) {
		return new GLFWDropCallback() {
			@Override
			public void invoke(long window, int count, long names) {
				sam.invoke(window, getNames(count, names));
			}
		};
	}

	/**
	 * Converts the specified {@link GLFWDropCallback} arguments to a ByteBuffer array.
	 *
	 * <p>This method may only be used inside a GLFWdropCallback invocation. If you wish to use the array after the callback returns, you need to make a deep
	 * copy.</p>
	 *
	 * @param count the number of dropped files
	 * @param names pointer to the array of UTF-8 encoded path names of the dropped files
	 *
	 * @return the array of names, as ByteBuffers
	 */
	public static ByteBuffer[] getNamesBuffer(int count, long names) {
		ByteBuffer[] buffers = new ByteBuffer[count];

		for ( int i = 0; i < count; i++ )
			buffers[i] = memByteBufferNT1(memGetAddress(names + POINTER_SIZE * i));

		return buffers;
	}

	/**
	 * Converts the specified {@link GLFWDropCallback} arguments to a String array.
	 *
	 * <p>This method may only be used inside a GLFWdropCallback invocation.</p>
	 *
	 * @param count the number of dropped files
	 * @param names pointer to the array of UTF-8 encoded path names of the dropped files
	 *
	 * @return the array of names, as Strings
	 */
	public static String[] getNames(int count, long names) {
		String[] strings = new String[count];

		for ( int i = 0; i < count; i++ )
			strings[i] = memDecodeUTF8(memGetAddress(names + POINTER_SIZE * i));

		return strings;
	}

	/** A functional interface that can be used with {@link #apply(int, long, ConsumerBuffer) apply}. */
	public interface ConsumerBuffer {
		void accept(int index, ByteBuffer name);
	}

	/** A functional interface that can be used with {@link #apply(int, long, ConsumerString) apply}. */
	public interface ConsumerString {
		void accept(int index, String name);
	}

	/**
	 * Applies the specified {@link ConsumerBuffer} to the specified {@link GLFWDropCallback} arguments.
	 *
	 * <p>This method may only be used inside a GLFWDropCallback invocation.</p>
	 *
	 * @param count    the number of dropped files
	 * @param names    pointer to the array of UTF-8 encoded path names of the dropped files
	 * @param consumer the {@link ConsumerBuffer} to apply
	 */
	public static void apply(int count, long names, ConsumerBuffer consumer) {
		for ( int i = 0; i < count; i++ )
			consumer.accept(i, memByteBufferNT1(memGetAddress(names + POINTER_SIZE * i)));
	}

	/**
	 * Applies the specified {@link ConsumerString} to the specified {@link GLFWDropCallback} arguments.
	 *
	 * <p>This method may only be used inside a GLFWDropCallback invocation.</p>
	 *
	 * @param count    the number of dropped files
	 * @param names    pointer to the array of UTF-8 encoded path names of the dropped files
	 * @param consumer the {@link ConsumerString} to apply
	 */
	public static void apply(int count, long names, ConsumerString consumer) {
		for ( int i = 0; i < count; i++ )
			consumer.accept(i, memDecodeUTF8(memGetAddress(names + POINTER_SIZE * i)));
	}

	/** See {@link GLFW#glfwSetDropCallback SetDropCallback}. */
	public GLFWDropCallback set(long window) {
		glfwSetDropCallback(window, this);
		return this;
	}
"""
}

// OpenGL

val GLFWglproc = "GLFWglproc".p