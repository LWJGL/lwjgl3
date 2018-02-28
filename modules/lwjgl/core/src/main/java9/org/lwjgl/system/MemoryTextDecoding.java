/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import java.nio.*;
import java.nio.charset.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * String decoding utilities.
 *
 * <p>These implementations use a {@code byte[]} instead of a {@code char[]} buffer, which is faster with compact strings (JEP 254) on Java 9.</p>
 *
 * <p>An extra array copy is still required. New String constructors are required to eliminate it, that will likely be available on Java 11.</p>
 */
final class MemoryTextDecoding {

    private MemoryTextDecoding() {
    }

    /** @see MemoryUtil#memASCII(ByteBuffer, int, int) */
    static String decodeASCII(ByteBuffer buffer, int length, int offset) {
        if (length <= 0) {
            return "";
        }

        byte[] bytes = new byte[length];
        memByteBuffer(memAddress(buffer) + offset, length).get(bytes);
        return new String(bytes, StandardCharsets.ISO_8859_1);
    }

    // ---------------------------------------------------------------------------------------------------------------------

    /** @see MemoryUtil#memUTF8(ByteBuffer, int, int) */
    static String decodeUTF8(ByteBuffer buffer, int length, int offset) {
        if (length <= 0) {
            return "";
        }

        byte[] bytes = new byte[length];
        memByteBuffer(memAddress(buffer) + offset, length).get(bytes);
        return new String(bytes, StandardCharsets.UTF_8);
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