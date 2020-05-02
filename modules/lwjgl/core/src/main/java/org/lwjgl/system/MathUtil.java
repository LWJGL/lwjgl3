/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import java.math.*;

/**
 * Math utility class.
 *
 * <p>Method names in this class are prefixed with {@code math} to avoid ambiguities when used with static imports.</p>
 */
public final class MathUtil {

    private MathUtil() {
    }

    /**
     * Returns true if the specified integer {@code value} is a power-of-two
     * number.
     *
     * @param value the value to test
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
     * @param value the value to round-up. Must be a number between {@code 1} and
     *              <code>1 &lt;&lt; 30</code>.
     *
     * @return the power-of-two rounded value
     */
    public static int mathRoundPoT(int value) {
        return 1 << (32 - Integer.numberOfLeadingZeros(value - 1));
    }

    public static boolean mathHasZeroByte(int value) {
        return ((value - 0x01010101) & ~value & 0x80808080) != 0;
    }

    public static boolean mathHasZeroByte(long value) {
        return ((value - 0x0101010101010101L) & ~value & 0x8080808080808080L) != 0L;
    }

    public static boolean mathHasZeroShort(int value) {
        return ((value - 0x00010001) & ~value & 0x80008000) != 0;
    }

    public static boolean mathHasZeroShort(long value) {
        return ((value - 0x0001000100010001L) & ~value & 0x8000800080008000L) != 0L;
    }

    /**
     * Returns as a {@code long} the most significant 64 bits of the 128-bit product of two {@code uint64_t} factors.
     *
     * @param x the first value
     * @param y the second value
     *
     * @return the result
     */
    public static long mathMultiplyHighU64(long x, long y) {
        long x0 = x & 0xFFFF_FFFFL;
        long x1 = x >>> 32;
        long y0 = y & 0xFFFF_FFFFL;
        long y1 = y >>> 32;

        long t = x1 * y0 + ((x0 * y0) >>> 32);

        return x1 * y1 + (t >>> 32) + (((t & 0xFFFF_FFFFL) + x0 * y1) >>> 32);
    }

    /**
     * Returns as a {@code long} the most significant 64 bits of the 128-bit product of two {@code int64_t} factors.
     *
     * @param x the first value
     * @param y the second value
     *
     * @return the result
     */
    public static long mathMultiplyHighS64(long x, long y) {
        long x0 = x & 0xFFFF_FFFFL;
        long x1 = x >> 32;
        long y0 = y & 0xFFFF_FFFFL;
        long y1 = y >> 32;

        long t = x1 * y0 + ((x0 * y0) >>> 32);

        return x1 * y1 + (t >> 32) + (((t & 0xFFFF_FFFFL) + x0 * y1) >> 32);
    }

    /**
     * Returns the unsigned quotient of dividing the first argument by the second where each argument and the result is interpreted as an unsigned value.
     *
     * <p>When either argument is negative (i.e. a {@code uint64_t} value higher than {@code 0x8000_0000_0000_0000L}), this method uses bit twiddling to
     * implement the division. The JDK implementation uses {@link BigInteger} for this case, which has a negative impact on performance.</p>
     *
     * @param dividend the value to be divided
     * @param divisor  the value doing the dividing
     *
     * @return the unsigned quotient of the first argument divided by the second argument
     */
    public static long mathDivideUnsigned(long dividend, long divisor) {
        if (0L <= divisor) {
            return 0L <= dividend
                ? dividend / divisor
                : udivdi3(dividend, divisor);
        } else {
            return Long.compareUnsigned(dividend, divisor) < 0 ? 0L : 1L;
        }
    }

    /**
     * Returns the unsigned remainder from dividing the first argument by the second where each argument and the result is interpreted as an unsigned value.
     *
     * <p>When either argument is negative (i.e. a {@code uint64_t} value higher than {@code 0x8000_0000_0000_0000L}), this method uses bit twiddling to
     * implement the remainder. The JDK implementation uses {@link BigInteger} for this case, which has a negative impact on performance.</p>
     *
     * @param dividend the value to be divided
     * @param divisor  the value doing the dividing
     *
     * @return the unsigned remainder of the first argument divided by the second argument
     */
    public static long mathRemainderUnsigned(long dividend, long divisor) {
        if (0L < dividend && 0L < divisor) {
            return dividend % divisor;
        } else {
            return Long.compareUnsigned(dividend, divisor) < 0
                ? dividend
                : dividend - divisor * udivdi3(dividend, divisor);
        }
    }

    // Implements uint64_t / uint64_t ==> uint64_t division
    // Ported from Hacker's Delight (https://github.com/hcs0/Hackers-Delight/blob/master/divDouble.c.txt)
    private static long udivdi3(long u, long v) {
        if (v >>> 32 == 0) {
            // u < 0L in here
            if (u >>> 32 < v) {
                long q0 = (((u >>> 1) / v) << Long.numberOfLeadingZeros(v)) >>> 31;
                if ((u - q0 * v) >= v) {
                    q0++;
                }
                return q0;
            } else {
                long u1 = u >>> 32;
                long q1 = u1 / v;
                long q0 = (((u1 - q1 * v) << 32) | (u & 0xFFFF_FFFFL)) / v;
                return (q1 << 32) | q0;
            }
        }

        int  n  = Long.numberOfLeadingZeros(v);
        long q0 = (((u >>> 1) / ((v << n) >>> 32)) << n) >>> 31;
        if (q0 != 0) {
            q0--;
        }
        if (Long.compareUnsigned((u - q0 * v), v) >= 0) {
            q0++;
        }
        return q0;
    }

}