/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import java.nio.*;
import java.nio.charset.*;

import static java.lang.Character.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * String decoding utilities.
 *
 * <p>On Java 9 different implementations are used that work better with compact strings (JEP 254).</p>
 */
final class MultiReleaseTextDecoding {

    private MultiReleaseTextDecoding() {
    }

    /** @see MemoryUtil#memUTF8(ByteBuffer, int, int) */
    static String decodeUTF8(long source, int length) {
        if (length <= 0) {
            return "";
        }

        if (DEBUG) {
            // The implementation below does no codepoint validation.
            byte[] bytes = new byte[length];
            memByteBuffer(source, length).get(bytes);
            return new String(bytes, StandardCharsets.UTF_8);
        }


        char[] string = new char[length];

        int i = 0, position = 0;

        // fast path
        while (position < length) {
            int c = UNSAFE.getByte(null, source + position);
            if (0 <= c) {
                string[i++] = (char)c;
                position++;
            } else {
                // slow path
                i = decodeUTF8Slow(source, length, position, string, i);
                break;
            }
        }

        return new String(string, 0, Math.min(i, length));
    }

    private static int decodeUTF8Slow(long source, int length, int position, char[] string, int i) {
        do {
            char c;

            int b0 = UNSAFE.getByte(null, source + position++);
            if (0 <= b0) {
                c = (char)b0;
            } else if ((b0 >> 5) == -2 && (b0 & 0x1E) != 0) {
                int b1 = UNSAFE.getByte(null, source + position++);

                c = cp2(b0, b1);
            } else if ((b0 >> 4) == -2) {
                int b1 = UNSAFE.getByte(null, source + position++);
                int b2 = UNSAFE.getByte(null, source + position++);

                c = cp3(b0, b1, b2);
            } else {
                int b1 = UNSAFE.getByte(null, source + position++);
                int b2 = UNSAFE.getByte(null, source + position++);
                int b3 = UNSAFE.getByte(null, source + position++);
                int cp = cp4(b0, b1, b2, b3);

                string[i++] = cp4Hi(cp);
                c = cp4Lo(cp);
            }

            string[i++] = c;
        } while (position < length);

        return i;
    }
    private static char cp2(int b0, int b1) {
        return (char)(((b0 << 6) ^ b1) ^ (((byte)0xC0 << 6) ^ ((byte)0x80 << 0)));
    }
    private static char cp3(int b0, int b1, int b2) {
        return (char)((b0 << 12) ^ (b1 << 6) ^ (b2 ^ (((byte)0xE0 << 12) ^ ((byte)0x80 << 6) ^ ((byte)0x80 << 0))));
    }
    private static int cp4(int b0, int b1, int b2, int b3) {
        return (b0 << 18) ^ (b1 << 12) ^ (b2 << 6) ^ (b3 ^ ((byte)0xF0 << 18 ^ ((byte)0x80 << 12) ^ ((byte)0x80 << 6) ^ ((byte)0x80 << 0)));
    }
    private static char cp4Hi(int cp) {
        return (char)((cp >>> 10) + MIN_HIGH_SURROGATE - (MIN_SUPPLEMENTARY_CODE_POINT >>> 10));
    }
    private static char cp4Lo(int cp) {
        return (char)((cp & 0x3FF) + MIN_LOW_SURROGATE);
    }

}