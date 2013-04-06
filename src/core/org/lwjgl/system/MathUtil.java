/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

public final class MathUtil {

	private MathUtil() {
	}

	public static int mathNextPoT(int value) {
		int v = value - 1;

		v |= (v >>> 1);
		v |= (v >>> 2);
		v |= (v >>> 4);
		v |= (v >>> 8);
		v |= (v >>> 16);

		return v + 1;
	}

	public static long mathUIntToPtr(int value) {
		return value & 0xFFFFFFFFL;
	}

}