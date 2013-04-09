/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.glfw;

import org.lwjgl.LWJGLUtil;

import java.lang.reflect.Method;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be passed to the {@link GLFW#glfwSetErrorCallback(ErrorCallback)} method. */
public class ErrorCallback {

	static final long CALLBACK;

	static {
		try {
			CALLBACK = setCallback(ErrorCallback.class.getDeclaredMethod(
				"callback", int.class, long.class
			));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static ErrorCallback callback;

	public ErrorCallback() {
	}

	private static native long setCallback(Method callback);

	static long register(ErrorCallback proc) {
		callback = proc;
		return CALLBACK;
	}

	private static void callback(int error, long description) {
		callback.invoke(error, description);
	}

	/**
	 * This method will be called when a GLFW error is generated. It should be overriden if custom behavior is desired.
	 * The default implementation will print the error details on the standard error stream.
	 *
	 * @param error       the error code
	 * @param description a UTF-8 encoded string describing the error
	 */
	public void invoke(int error, long description) {
		invoke(error, memDecodeUTF8(memByteBufferNT1(description)));
	}

	/** String version of {@link #invoke(int, long)}. */
	public void invoke(int error, String description) {
		System.err.println("[LWJGL] GLFW error");
		System.err.println("\tCode: " + LWJGLUtil.toHexString(error));
		System.err.println("\tDescription: " + description);
	}

}