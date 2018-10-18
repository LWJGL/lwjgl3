/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import java.nio.*;
import java.nio.charset.*;

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
            byte[] bytes = length <= ARRAY_TLC_SIZE ? ARRAY_TLC_BYTE.get() : new byte[length];
            memByteBuffer(source, length).get(bytes, 0, length);
            return new String(bytes, 0, length, StandardCharsets.UTF_8);
        }

        char[] string = length <= ARRAY_TLC_SIZE ? ARRAY_TLC_CHAR.get() : new char[length];

        int i = 0, position = 0;

        while (position < length) {
            char c;

            int b0 = UNSAFE.getByte(null, source + position++) & 0xFF;
            if (b0 < 0x80) {
                c = (char)b0;
            } else {
                int b1 = UNSAFE.getByte(null, source + position++) & 0x3F;
                if ((b0 & 0xE0) == 0xC0) {
                    c = (char)(((b0 & 0x1F) << 6) | b1);
                } else {
                    int b2 = UNSAFE.getByte(null, source + position++) & 0x3F;
                    if ((b0 & 0xF0) == 0xE0) {
                        c = (char)(((b0 & 0x0F) << 12) | (b1 << 6) | b2);
                    } else {
                        int b3 = UNSAFE.getByte(null, source + position++) & 0x3F;
                        int cp = ((b0 & 0x07) << 18) | (b1 << 12) | (b2 << 6) | b3;

                        if (i < length) {
                            string[i++] = (char)((cp >>> 10) + 0xD7C0);
                        }
                        c = (char)((cp & 0x3FF) + 0xDC00);
                    }
                }
            }
            if (i < length) {
                string[i++] = c;
            }
        }

        return new String(string, 0, Math.min(i, length));
    }

}