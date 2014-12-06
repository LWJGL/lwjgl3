/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.glfw;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.LWJGLUtil.TokenFilter;
import org.lwjgl.system.libffi.Closure;

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.Map;

import static org.lwjgl.Pointer.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Utility class for GLFW callbacks.
 * <p/>
 * This class has been designed to work well with {@code import static}.
 */
public final class Callbacks {

	private Callbacks() {}

	/** @see GLFW#glfwSetErrorCallback */
	public static void glfwSetCallback(GLFWerrorfun cbfun) { glfwSetErrorCallback(cbfun); }

	/** @see GLFW#glfwSetMonitorCallback */
	public static void glfwSetCallback(GLFWmonitorfun cbfun) { glfwSetMonitorCallback(cbfun); }

	/** @see GLFW#glfwSetWindowPosCallback */
	public static void glfwSetCallback(long window, GLFWwindowposfun cbfun) { glfwSetWindowPosCallback(window, cbfun); }

	/** @see GLFW#glfwSetWindowSizeCallback */
	public static void glfwSetCallback(long window, GLFWwindowsizefun cbfun) { glfwSetWindowSizeCallback(window, cbfun); }

	/** @see GLFW#glfwSetWindowCloseCallback */
	public static void glfwSetCallback(long window, GLFWwindowclosefun cbfun) { glfwSetWindowCloseCallback(window, cbfun); }

	/** @see GLFW#glfwSetWindowRefreshCallback */
	public static void glfwSetCallback(long window, GLFWwindowrefreshfun cbfun) { glfwSetWindowRefreshCallback(window, cbfun); }

	/** @see GLFW#glfwSetWindowFocusCallback */
	public static void glfwSetCallback(long window, GLFWwindowfocusfun cbfun) { glfwSetWindowFocusCallback(window, cbfun); }

	/** @see GLFW#glfwSetWindowIconifyCallback */
	public static void glfwSetCallback(long window, GLFWwindowiconifyfun cbfun) { glfwSetWindowIconifyCallback(window, cbfun); }

	/** @see GLFW#glfwSetFramebufferSizeCallback */
	public static void glfwSetCallback(long window, GLFWframebuffersizefun cbfun) { glfwSetFramebufferSizeCallback(window, cbfun); }

	/** @see GLFW#glfwSetKeyCallback */
	public static void glfwSetCallback(long window, GLFWkeyfun cbfun) { glfwSetKeyCallback(window, cbfun); }

	/** @see GLFW#glfwSetCharCallback */
	public static void glfwSetCallback(long window, GLFWcharfun cbfun) { glfwSetCharCallback(window, cbfun); }

	/** @see GLFW#glfwSetCharModsCallback */
	public static void glfwSetCallback(long window, GLFWcharmodsfun cbfun) { glfwSetCharModsCallback(window, cbfun); }

	/** @see GLFW#glfwSetMouseButtonCallback */
	public static void glfwSetCallback(long window, GLFWmousebuttonfun cbfun) { glfwSetMouseButtonCallback(window, cbfun); }

	/** @see GLFW#glfwSetCursorPosCallback */
	public static void glfwSetCallback(long window, GLFWcursorposfun cbfun) { glfwSetCursorPosCallback(window, cbfun); }

	/** @see GLFW#glfwSetCursorEnterCallback */
	public static void glfwSetCallback(long window, GLFWcursorenterfun cbfun) { glfwSetCursorEnterCallback(window, cbfun); }

	/** @see GLFW#glfwSetScrollCallback */
	public static void glfwSetCallback(long window, GLFWscrollfun cbfun) { glfwSetScrollCallback(window, cbfun); }

	/** @see GLFW#glfwSetDropCallback */
	public static void glfwSetCallback(long window, GLFWdropfun cbfun) { glfwSetDropCallback(window, cbfun); }

	/**
	 * Resets all callbacks for the specified GLFW window to {@code NULL} and {@link Closure#release releases} all previously set callbacks.
	 *
	 * @param window the GLFW window
	 */
	public static void releaseAllCallbacks(long window) {
		long[] callbacks = {
			nglfwSetWindowPosCallback(window, NULL),
			nglfwSetWindowSizeCallback(window, NULL),
			nglfwSetWindowCloseCallback(window, NULL),
			nglfwSetWindowRefreshCallback(window, NULL),
			nglfwSetWindowFocusCallback(window, NULL),
			nglfwSetWindowIconifyCallback(window, NULL),
			nglfwSetFramebufferSizeCallback(window, NULL),
			nglfwSetKeyCallback(window, NULL),
			nglfwSetCharCallback(window, NULL),
			nglfwSetCharModsCallback(window, NULL),
			nglfwSetMouseButtonCallback(window, NULL),
			nglfwSetCursorPosCallback(window, NULL),
			nglfwSetCursorEnterCallback(window, NULL),
			nglfwSetScrollCallback(window, NULL),
			nglfwSetDropCallback(window, NULL)
		};

		for ( long callback : callbacks ) {
			if ( callback != NULL )
				Closure.release(callback);
		}
	}

	/**
	 * Returns a {@link GLFWerrorfun} instance that prints the error in the standard error stream.
	 *
	 * @return the GLFWerrorfun
	 */
	public static GLFWerrorfun errorfunPrint() {
		return errorfunPrint(System.err);
	}

	/**
	 * Returns a {@link GLFWerrorfun} instance that prints the error in the specified {@link PrintStream}.
	 *
	 * @param stream the PrintStream to use
	 *
	 * @return the GLFWerrorfun
	 */
	public static GLFWerrorfun errorfunPrint(final PrintStream stream) {
		return new GLFWerrorfun() {
			private final Map<Integer, String> ERROR_CODES = LWJGLUtil.getClassTokens(new TokenFilter() {
				@Override
				public boolean accept(Field field, int value) {
					return 0x10000 < value && value < 0x20000;
				}
			}, null, GLFW.class);

			@Override
			public void invoke(int error, long description) {
				String msg = errorfunDescriptionString(description);

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
	 * Returns a {@link GLFWerrorfun} instance that throws an {@link IllegalStateException} when an error occurs.
	 *
	 * @return the GLFWerrorfun
	 */
	public static GLFWerrorfun errorfunThrow() {
		return new GLFWerrorfun() {
			@Override
			public void invoke(int error, long description) {
				throw new IllegalStateException(String.format("GLFW error [0x%X]: %s", error, errorfunDescriptionString(description)));
			}
		};
	}

	/**
	 * Converts the specified {@link GLFWerrorfun} description string pointer to a {@link ByteBuffer}, with a capacity equal to the UTF-8 encoded string.
	 * <p/>
	 * This method may only be used inside a GLFWerrorfun invocation. If you wish to use the ByteBuffer after the callback returns, you need to make a copy.
	 *
	 * @param description a pointer to the UTF-8 encoded description string
	 *
	 * @return the description string, as a ByteBuffer
	 */
	public static ByteBuffer errorfunDescriptionBuffer(long description) {
		return memByteBufferNT1(description);
	}

	/**
	 * Converts the specified {@link GLFWerrorfun} description string pointer to a String.
	 * <p/>
	 * This method may only be used inside a GLFWerrorfun invocation.
	 *
	 * @param description a pointer to the UTF-8 encoded description string
	 *
	 * @return the description string
	 */
	public static String errorfunDescriptionString(long description) {
		return memDecodeUTF8(description);
	}

	/**
	 * Converts the specified {@link GLFWdropfun} arguments to a ByteBuffer array.
	 * <p/>
	 * This method may only be used inside a GLFWdropfun invocation. If you wish to use the array after the callback returns, you need to make a deep copy.
	 *
	 * @param count the number of dropped files
	 * @param names pointer to the array of UTF-8 encoded path names of the dropped files
	 *
	 * @return the array of names, as ByteBuffers
	 */
	public static ByteBuffer[] dropfunNamesBuffer(int count, long names) {
		ByteBuffer[] buffers = new ByteBuffer[count];

		for ( int i = 0; i < count; i++ )
			buffers[i] = memByteBufferNT1(memGetAddress(names + POINTER_SIZE * i));

		return buffers;
	}

	/**
	 * Converts the specified {@link GLFWdropfun} arguments to a String array.
	 * <p/>
	 * This method may only be used inside a GLFWdropfun invocation.
	 *
	 * @param count the number of dropped files
	 * @param names pointer to the array of UTF-8 encoded path names of the dropped files
	 *
	 * @return the array of names, as Strings
	 */
	public static String[] dropfunNamesString(int count, long names) {
		String[] strings = new String[count];

		for ( int i = 0; i < count; i++ )
			strings[i] = memDecodeUTF8(memGetAddress(names + POINTER_SIZE * i));

		return strings;
	}

	/** A functional interface that can be used with {@link #dropfunNamesApply(int, long, DropConsumerBuffer) dropfunNamesApply}. */
	public interface DropConsumerBuffer {
		void accept(int index, ByteBuffer name);
	}

	/** A functional interface that can be used with {@link #dropfunNamesApply(int, long, DropConsumerString) dropfunNamesApply}. */
	public interface DropConsumerString {
		void accept(int index, String name);
	}

	/**
	 * Applies the specified {@link DropConsumerBuffer} to the specified {@link GLFWdropfun} arguments.
	 * <p/>
	 * This method may only be used inside a GLFWdropfun invocation.
	 *
	 * @param count    the number of dropped files
	 * @param names    pointer to the array of UTF-8 encoded path names of the dropped files
	 * @param consumer the DropConsumerBuffer to apply
	 */
	public static void dropfunNamesApply(int count, long names, DropConsumerBuffer consumer) {
		for ( int i = 0; i < count; i++ )
			consumer.accept(i, memByteBufferNT1(memGetAddress(names + POINTER_SIZE * i)));
	}

	/**
	 * Applies the specified {@link DropConsumerString} to the specified {@link GLFWdropfun} arguments.
	 * <p/>
	 * This method may only be used inside a GLFWdropfun invocation.
	 *
	 * @param count    the number of dropped files
	 * @param names    pointer to the array of UTF-8 encoded path names of the dropped files
	 * @param consumer the DropConsumerString to apply
	 */
	public static void dropfunNamesApply(int count, long names, DropConsumerString consumer) {
		for ( int i = 0; i < count; i++ )
			consumer.accept(i, memDecodeUTF8(memGetAddress(names + POINTER_SIZE * i)));
	}

}