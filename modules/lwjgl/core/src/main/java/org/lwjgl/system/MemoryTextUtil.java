/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import java.nio.*;

import static java.lang.Character.*;
import static org.lwjgl.system.MathUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/** {@code strlen} and string encoding utilities. */
class MemoryTextUtil {

    protected MemoryTextUtil() {
    }

    /**
     * Optimized {@code strlen} for 64-bit architectures.
     *
     * @see MemoryUtil#memByteBufferNT1(long, int)
     */
    int strlen64NT1(long address, int maxLength) {
        int i = 0;

        ByteBuffer buffer = memByteBuffer(address, Integer.MAX_VALUE);

        if (8 <= maxLength) {
            int misalignment = (int)address & 7;
            if (misalignment != 0) {
                // Align to 8 bytes
                for (int len = 8 - misalignment; i < len; i++) {
                    if (buffer.get(i) == 0) {
                        return i;
                    }
                }
            }

            // Aligned longs for performance
            while (i <= maxLength - 8) {
                if (mathHasZeroByte(buffer.getLong(i))) {
                    break;
                }
                i += 8;
            }
        }

        // Tail
        for (; i < maxLength; i++) {
            if (buffer.get(i) == 0) {
                break;
            }
        }

        return i;
    }

    /**
     * Optimized {@code strlen} for 64-bit architectures.
     *
     * @see MemoryUtil#memByteBufferNT2(long, int)
     */
    int strlen64NT2(long address, int maxLength) {
        int i = 0;

        ByteBuffer buffer = memByteBuffer(address, Integer.MAX_VALUE);

        if (8 <= maxLength) {
            int misalignment = (int)address & 7;
            if (misalignment != 0) {
                // Align to 8 bytes
                for (int len = 8 - misalignment; i < len; i += 2) {
                    if (buffer.getShort(i) == 0) {
                        return i;
                    }
                }
            }

            // Aligned longs for performance
            while (i <= maxLength - 8) {
                if (mathHasZeroShort(buffer.getLong(i))) {
                    break;
                }
                i += 8;
            }
        }

        // Tail
        for (; i < maxLength; i += 2) {
            if (buffer.getShort(i) == 0) {
                break;
            }
        }

        return i;
    }

    /**
     * Optimized {@code strlen} for 32-bit architectures.
     *
     * @see MemoryUtil#memByteBufferNT1(long, int)
     */
    int strlen32NT1(long address, int maxLength) {
        int i = 0;

        ByteBuffer buffer = memByteBuffer(address, Integer.MAX_VALUE);

        if (4 <= maxLength) {
            int misalignment = (int)address & 3;
            if (misalignment != 0) {
                // Align to 4 bytes
                for (int len = 4 - misalignment; i < len; i++) {
                    if (buffer.get(i) == 0) {
                        return i;
                    }
                }
            }

            // Aligned ints for performance
            while (i <= maxLength - 4) {
                if (mathHasZeroByte(buffer.getInt(i))) {
                    break;
                }
                i += 4;
            }
        }

        // Tail
        for (; i < maxLength; i++) {
            if (buffer.get(i) == 0) {
                break;
            }
        }

        return i;
    }

    /**
     * Optimized {@code strlen} for 32-bit architectures.
     *
     * @see MemoryUtil#memByteBufferNT2(long, int)
     */
    int strlen32NT2(long address, int maxLength) {
        int i = 0;

        ByteBuffer buffer = memByteBuffer(address, Integer.MAX_VALUE);

        if (4 <= maxLength) {
            int misalignment = (int)address & 3;
            if (misalignment != 0) {
                // Align to 4 bytes
                for (int len = 4 - misalignment; i < len; i += 2) {
                    if (buffer.getShort(i) == 0) {
                        return i;
                    }
                }
            }

            // Aligned ints for performance
            while (i <= maxLength - 4) {
                if (mathHasZeroShort(buffer.getInt(i))) {
                    break;
                }
                i += 4;
            }
        }

        // Tail
        for (; i < maxLength; i += 2) {
            if (buffer.getShort(i) == 0) {
                break;
            }
        }

        return i;
    }

    // ---------------------------------------------------------------------------------------------------------------------

    /** @see MemoryUtil#memASCII(CharSequence, boolean, ByteBuffer, int) */
    int encodeASCII(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
        int len = text.length();
        for (int i = 0; i < len; i++) {
            target.put(offset + i, (byte)text.charAt(i));
        }

        if (nullTerminated) {
            target.put(offset + len, (byte)0);
        }

        return len + (nullTerminated ? 1 : 0);
    }

    // ---------------------------------------------------------------------------------------------------------------------

    /** @see MemoryUtil#memUTF8(CharSequence, boolean, ByteBuffer, int) */
    int encodeUTF8(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
        int i = 0, len = text.length(), p = offset;

        char c;

        // ASCII fast path
        while (i < len && (c = text.charAt(i)) < 0x80) {
            target.put(p++, (byte)c);
            i++;
        }

        // Slow path
        while (i < len) {
            c = text.charAt(i++);
            if (c < 0x80) {
                target.put(p++, (byte)c);
            } else {
                int cp = c;
                if (c < 0x800) {
                    target.put(p++, (byte)(0xC0 | cp >> 6));
                } else {
                    if (!isHighSurrogate(c)) {
                        target.put(p++, (byte)(0xE0 | cp >> 12));
                    } else {
                        cp = toCodePoint(c, text.charAt(i++));

                        target.put(p++, (byte)(0xF0 | cp >> 18));
                        target.put(p++, (byte)(0x80 | cp >> 12 & 0x3F));
                    }
                    target.put(p++, (byte)(0x80 | cp >> 6 & 0x3F));
                }
                target.put(p++, (byte)(0x80 | cp & 0x3F));
            }
        }

        if (nullTerminated) {
            target.put(p++, (byte)0);
        }

        return p - offset;
    }

    /** @see MemoryUtil#memLengthUTF8 */
    static int encodeUTF8Length(CharSequence value) {
        int i, len = value.length(), bytes = len; // start with 1:1

        // ASCII fast path
        for (i = 0; i < len; i++) {
            if (0x80 <= value.charAt(i)) {
                break;
            }
        }

        // 1 or 2 bytes fast path
        for (; i < len; i++) {
            char c = value.charAt(i);

            // fallback to slow path
            if (0x800 <= c) {
                bytes += encodeUTF8LengthSlow(value, i, len);
                break;
            }

            // c <= 127: 0
            // c >= 128: 1
            bytes += (0x7F - c) >>> 31;
        }

        return bytes;
    }

    private static int encodeUTF8LengthSlow(CharSequence value, int offset, int len) {
        int bytes = 0;

        for (int i = offset; i < len; i++) {
            char c = value.charAt(i);
            if (c < 0x800) {
                bytes += (0x7F - c) >>> 31;
            } else if (c < MIN_SURROGATE || MAX_SURROGATE < c) {
                bytes += 2;
            } else {
                if (Checks.DEBUG) {
                    checkSurrogatePair(value, i, len);
                }

                bytes += 2; // the byte count already includes 2 bytes for the surrogate pair, add 2 more
                i++;
            }
        }

        return bytes;
    }

    private static void checkSurrogatePair(CharSequence value, int offset, int len) {
        char hi = value.charAt(offset);
        if (len <= offset) {
            throw new RuntimeException(String.format("Character sequence ends with single surrogate character: 0x%X", hi));
        }

        char lo = value.charAt(offset + 1);
        if (!Character.isSurrogatePair(hi, lo)) {
            throw new RuntimeException(String.format("Malformed surrogate pair: 0x%X - 0x%X", hi, lo));
        }
    }

    // ---------------------------------------------------------------------------------------------------------------------

    /** @see MemoryUtil#memUTF16(CharSequence, boolean, ByteBuffer, int) */
    int encodeUTF16(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
        int len = text.length();
        for (int i = 0; i < len; i++) {
            target.putChar(offset + 2 * i, text.charAt(i));
        }

        if (nullTerminated) {
            target.putChar(offset + 2 * len, '\0');
        }

        return 2 * (len + (nullTerminated ? 1 : 0));
    }

}