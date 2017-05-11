/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import java.nio.*;

import static java.lang.Character.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This class serves two purposes:
 * <ul>
 * <li>Keep the {@link MemoryUtil} class free of implementation details.</li>
 * <li>Enable elimination of {@link ByteBuffer} allocations (via escape analysis) with the Unsafe implementation.</li>
 * </ul>
 */
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

        ByteBuffer buffer = memByteBuffer(address, maxLength);

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
            do {
                long v = buffer.getLong(i);
                if (((v - 0x0101010101010101L) & ~v & 0x8080808080808080L) != 0) {
                    break;
                }
                i += 8;
            } while (i <= maxLength - 8);
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

        ByteBuffer buffer = memByteBuffer(address, maxLength);

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
            do {
                long v = buffer.getLong(i);
                if (((v - 0x0001000100010001L) & ~v & 0x8000800080008000L) != 0) {
                    break;
                }
                i += 8;
            } while (i <= maxLength - 8);
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

        ByteBuffer buffer = memByteBuffer(address, maxLength);

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
            do {
                int v = buffer.getInt(i);
                if (((v - 0x01010101) & ~v & 0x80808080) != 0) {
                    break;
                }
                i += 4;
            } while (i <= maxLength - 4);
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

        ByteBuffer buffer = memByteBuffer(address, maxLength);

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
            do {
                int v = buffer.getInt(i);
                if (((v - 0x00010001) & ~v & 0x80008000) != 0) {
                    break;
                }
                i += 4;
            } while (i <= maxLength - 4);
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
        int p = offset;

        for (int i = 0; i < text.length(); i++, p++) {
            target.put(p, (byte)text.charAt(i));
        }

        if (nullTerminated) {
            target.put(p++, (byte)0);
        }

        return p - offset;
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
                ;
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

    /** @see MemoryUtil#memUTF16(CharSequence, boolean, ByteBuffer, int) */
    int encodeUTF16(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
        int p = offset;
        for (int i = 0; i < text.length(); i++, p += 2) {
            target.putChar(p, text.charAt(i));
        }

        if (nullTerminated) {
            target.putChar(p, '\0');
            p += 2;
        }

        return p - offset;
    }

    /** @see MemoryUtil#memUTF16(ByteBuffer, int, int) */
    static String decodeUTF16(ByteBuffer buffer, int length, int offset) {
        if (length <= 0) {
            return "";
        }

        char[] chars = new char[length];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = buffer.getChar(offset + (i << 1));
        }

        return new String(chars);
    }

}