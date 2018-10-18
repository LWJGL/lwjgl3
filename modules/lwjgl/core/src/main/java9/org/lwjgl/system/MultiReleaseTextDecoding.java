/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import java.nio.*;
import java.nio.charset.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * String decoding utilities.
 *
 * <p>These implementations use a {@code byte[]} instead of a {@code char[]} buffer, which is faster with compact strings (JEP 254) on Java 9.</p>
 *
 * <p>An extra array copy is still required. New String constructors are required to eliminate it.</p>
 */
final class MultiReleaseTextDecoding {

    static {
        apiLog("Java 9 text decoding enabled");
    }

    private MultiReleaseTextDecoding() {
    }

    /** @see MemoryUtil#memUTF8(ByteBuffer, int, int) */
    static String decodeUTF8(long source, int length) {
        if (length <= 0) {
            return "";
        }

        byte[] bytes = length <= ARRAY_TLC_SIZE ? ARRAY_TLC_BYTE.get() : new byte[length];
        memByteBuffer(source, length).get(bytes, 0, length);
        return new String(bytes, 0, length, StandardCharsets.UTF_8);
    }

}