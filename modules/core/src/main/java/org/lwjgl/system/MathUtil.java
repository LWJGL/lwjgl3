/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

/**
 * Math utility class.
 * <p/>
 * Method names in this class are prefixed with {@code math} to avoid
 * ambiguities when used with static imports.
 */
public final class MathUtil {

	private MathUtil() {
	}

	/**
	 * Returns true if the specified integer {@code value} is a power-of-two
	 * number.
	 *
	 * @param value
	 *            the value to test
	 *
	 * @return true if the value if a power-of-two number.
	 */
	public static boolean mathIsPoT(int value) {
		return Integer.bitCount(value) == 1;
	}

	/**
	 * Rounds the specified integer {@code value} up to the next power-of-two
	 * number. The returned value will be equal to {@code value} if it already
	 * is a power-of-two number.
	 *
	 * @param value
	 *            the value to round-up. Must be a number between {@code 1} and
	 *            <code>1 &lt;&lt; 30</code>.
	 *
	 * @return the power-of-two rounded value
	 */
	public static int mathRoundPoT(int value) {
		return 1 << (32 - Integer.numberOfLeadingZeros(value - 1));
	}

	/**
	 * Converts an unsigned integer value to a pointer value.
	 *
	 * @param value
	 *            the unsigned integer
	 *
	 * @return the pointer value
	 */
	public static long mathUIntToPtr(int value) {
		return value & 0xFFFFFFFFL;
	}

	/**
	 * Find the integer logarithm base 2 of the given value.
	 * 
	 * @param value
	 *            the value for which to find its logarithm
	 */
	public static int mathLog2i(int value) {
		int r = 0;
		while ((value >>= 1) > 0) {
			r++;
		}
		return r;
	}

}