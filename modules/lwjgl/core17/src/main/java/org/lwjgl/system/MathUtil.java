/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import java.math.*;

import static java.lang.Math.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Math utility class.
 *
 * <p>Method names in this class are prefixed with {@code math} to avoid ambiguities when used with static imports.</p>
 */
public final class MathUtil {

    static {
        apiLog("Java 11 multiplyHigh enabled");
        apiLog("Java 17 divideUnsigned/remainderUnsigned enabled");
    }

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
        long result = multiplyHigh(x, y);
        result += (y & (x >> 63));
        result += (x & (y >> 63));
        return result;
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
        return multiplyHigh(x, y);
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
        return Long.divideUnsigned(dividend, divisor);
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
        return Long.remainderUnsigned(dividend, divisor);
    }

}