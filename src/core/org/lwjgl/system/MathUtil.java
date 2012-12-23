/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import java.util.concurrent.ThreadLocalRandom;

public final class MathUtil {

	private MathUtil() {
	}

	public static int mathNextPoT(final int value) {
		int v = value - 1;

		v |= (v >>> 1);
		v |= (v >>> 2);
		v |= (v >>> 4);
		v |= (v >>> 8);
		v |= (v >>> 16);

		return v + 1;
	}

	public static int mathRandom(int range) {
		return ThreadLocalRandom.current().nextInt(range + 1);
	}

}