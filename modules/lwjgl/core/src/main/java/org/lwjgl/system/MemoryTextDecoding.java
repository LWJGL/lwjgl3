/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import java.nio.*;

import static java.lang.Character.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * String decoding utilities.
 *
 * <p>On Java 9 different implementations are used that work better with compact strings (JEP 254).</p>
 */
final class MemoryTextDecoding {

    private MemoryTextDecoding() {
    }

    /** @see MemoryUtil#memASCII(ByteBuffer, int, int) */
    static String decodeASCII(ByteBuffer buffer, int length, int offset) {
        if (length <= 0) {
            return "";
        }

        char[] chars = new char[length];

        for (int i = 0; i < length; i++) {
            chars[i] = (char)buffer.get(offset + i);
        }

        return new String(chars);
    }

    // ---------------------------------------------------------------------------------------------------------------------

    /** @see MemoryUtil#memUTF8(ByteBuffer, int, int) */
    static String decodeUTF8(ByteBuffer buffer, int length, int offset) {
        if (length <= 0) {
            return "";
        }

        char[] string = new char[length];

        int i = 0, position = offset, limit = offset + length;

        // fast path
        while (position < limit) {
            int c = buffer.get(position);
            if (c < 0) {
                break;
            }

            string[i++] = (char)c;
            position++;
        }

        // slow path
        while (position < limit) {
            int b0 = buffer.get(position++);
            if (0 <= b0) {
                string[i++] = (char)b0;
            } else if ((b0 >> 5) == -2 && (b0 & 0x1E) != 0) {
                int b1 = buffer.get(position++);
                checkMalformed2(b1);

                string[i++] = (char)(((b0 << 6) ^ b1) ^ (((byte)0xC0 << 6) ^ ((byte)0x80 << 0)));
            } else if ((b0 >> 4) == -2) {
                int b1 = buffer.get(position++);
                int b2 = buffer.get(position++);
                checkMalformed3(b0, b1, b2);

                string[i++] = checkSurrogate((char)((b0 << 12) ^ (b1 << 6) ^ (b2 ^ (((byte)0xE0 << 12) ^ ((byte)0x80 << 6) ^ ((byte)0x80 << 0)))));
            } else if ((b0 >> 3) == -2) {
                int b1 = buffer.get(position++);
                int b2 = buffer.get(position++);
                int b3 = buffer.get(position++);
                int cp = ((b0 << 18) ^ (b1 << 12) ^ (b2 << 6) ^ (b3 ^ ((byte)0xF0 << 18 ^ ((byte)0x80 << 12) ^ ((byte)0x80 << 6) ^ ((byte)0x80 << 0))));
                checkMalformed4(b1, b2, b3, cp);

                string[i++] = (char)((cp >>> 10) + MIN_HIGH_SURROGATE - (MIN_SUPPLEMENTARY_CODE_POINT >>> 10));
                string[i++] = (char)((cp & 0x3FF) + MIN_LOW_SURROGATE);
            } else if (Checks.DEBUG) {
                throw new RuntimeException("Malformed character sequence");
            }
        }

        return new String(string, 0, i);
    }

    private static void checkMalformed2(int b1) {
        if (Checks.DEBUG && (b1 & 0xC0) != 0x80) {
            throw new RuntimeException("Malformed character sequence");
        }
    }

    private static void checkMalformed3(int b0, int b1, int b2) {
        if (Checks.DEBUG && ((b0 == (byte)0xE0 && (b1 & 0xE0) == 0x80) || (b1 & 0xC0) != 0x80 || (b2 & 0xC0) != 0x80)) {
            throw new RuntimeException("Malformed character sequence");
        }
    }

    private static char checkSurrogate(char c) {
        if (Checks.DEBUG && MIN_SURROGATE <= c && c <= MAX_SURROGATE) {
            throw new RuntimeException("Malformed character sequence");
        }
        return c;
    }

    private static void checkMalformed4(int b1, int b2, int b3, int cp) {
        if (Checks.DEBUG && ((b1 & 0xC0) != 0x80 || (b2 & 0xC0) != 0x80 || (b3 & 0xC0) != 0x80 || !isSupplementaryCodePoint(cp))) {
            throw new RuntimeException("Malformed character sequence");
        }
    }

    // ---------------------------------------------------------------------------------------------------------------------

    /** @see MemoryUtil#memUTF16(ByteBuffer, int, int) */
    static String decodeUTF16(ByteBuffer buffer, int length, int offset) {
        if (length <= 0) {
            return "";
        }

        return memCharBuffer(memAddress(buffer) + offset, length).toString();
    }

}