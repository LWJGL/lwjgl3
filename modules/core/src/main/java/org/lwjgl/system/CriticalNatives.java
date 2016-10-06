/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import java.lang.reflect.Method;

import static org.lwjgl.system.MemoryUtil.*;

final class CriticalNatives {

	private CriticalNatives() {
	}

	private static native void nenable(Method getFunctionAddress);

	static void enable() {
		try {
			nenable(CriticalNatives.class.getDeclaredMethod("getFunctionAddress", String.class));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	static native void disable();

	@SuppressWarnings("unused") // called from JNI
	private static long getFunctionAddress(String name) {
		// While in here, calling anything that goes through
		// a native method is going to deadlock the JVM.
		return NULL;
	}

}