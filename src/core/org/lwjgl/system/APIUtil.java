/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import java.lang.reflect.Method;

public final class APIUtil {

	private static final ThreadLocal<APIBuffer> API_BUFFERS = new ThreadLocal<APIBuffer>() {
		protected APIBuffer initialValue() {
			return new APIBuffer();
		}
	};

	private static final ThreadLocal<APIBuffer> INTERNAL_BUFFERS = new ThreadLocal<APIBuffer>() {
		protected APIBuffer initialValue() {
			return new APIBuffer();
		}
	};

	private APIUtil() {
	}

	/**
	 * Returns the callback method for the given callback class. The
	 * callback method should be named "invoke" and the parameter types
	 * should not contain the user data parameter.
	 *
	 * @param clazz          the callback class
	 * @param parameterTypes the callback function parameters
	 *
	 * @return the callback method
	 */
	@SuppressWarnings("unchecked")
	public static Method apiCallbackMethod(Class clazz, Class<?>... parameterTypes) {
		try {
			return clazz.getMethod("invoke", parameterTypes);
		} catch (NoSuchMethodException e) {
			throw new RuntimeException(e);
		}
	}

	/** Returns a thread-local APIBuffer. */
	public static APIBuffer apiBuffer() {
		return API_BUFFERS.get().reset();
	}

	/** Do not use. */
	public static APIBuffer internalBuffer() {
		return INTERNAL_BUFFERS.get().reset();
	}

}