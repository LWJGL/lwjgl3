/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import sun.misc.*;

import java.nio.*;

import static java.lang.Character.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;
import static org.lwjgl.system.jni.JNINativeInterface.*;

/** MemoryAccess specialized for Android. */
final class MemoryAccess {

    static {
        Library.initialize();
    }

    static long getAddressOffset(Unsafe UNSAFE) {
        long MAGIC_ADDRESS = 0xDEADBEEF8BADF00DL;
        if (BITS32) {
            MAGIC_ADDRESS &= 0xFFFFFFFFL;
        }

        ByteBuffer bb = NewDirectByteBuffer(MAGIC_ADDRESS, 0);

        long offset = 8L; // 8 byte aligned, cannot be at 0
        while (true) {
            if (UNSAFE.getLong(bb, offset) == MAGIC_ADDRESS) {
                return offset;
            }
            offset += 8L;
        }
    }

    static long getCapacityOffset(Unsafe UNSAFE) {
        int MAGIC_CAPACITY = 0x0D15EA5E;

        ByteBuffer bb = NewDirectByteBuffer(-1L, MAGIC_CAPACITY);
        bb.limit(0);

        long offset = 4L; // 4 byte aligned, cannot be at 0
        while (true) {
            if (UNSAFE.getInt(bb, offset) == MAGIC_CAPACITY) {
                return offset;
            }
            offset += 4L;
        }
    }

    //  Left-shifts value by bytes*8 bits in big-endian archictures.
    // Right-shifts value by bytes*8 bits in little-endian archictures.
    private static long shl(long value, int bytes) {
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            return value << (bytes << 3);
        } else {
            return value >>> (bytes << 3);
        }
    }

    // Right-shifts value by bytes*8 bits in big-endian archictures.
    //  Left-shifts value by bytes*8 bits in little-endian archictures.
    private static long shr(long value, int bytes) {
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            return value >>> (bytes << 3);
        } else {
            return value << (bytes << 3);
        }
    }

    // Bit from a where mask bit is 0, bit from b where mask bit is 1.
    private static long merge(long a, long b, long mask) {
        return a ^ ((a ^ b) & mask);
    }

    // Returns a long where each byte is equal to value.
    private static long fill(byte value) {
        long fill = value;

        if (value != 0) {
            fill |= fill << 8;
            fill |= fill << 16;
            fill |= fill << 32;
        }

        return fill;
    }

    static void memSetLoop(long dst, byte value, int bytes) {
        int i = 0;

        int  misalignment = (int)dst & 7;
        long fill         = fill(value);

        if (8 <= bytes) {
            if (misalignment != 0) {
                memPutLong(dst - misalignment, merge(
                    memGetLong(dst - misalignment),
                    fill,
                    shr(-1L, misalignment) // 0x00000000FFFFFFFF
                ));
                i += 8 - misalignment;
            }

            // Aligned longs for performance
            for (; i <= bytes - 8; i += 8) {
                memPutLong(dst + i, fill);
            }
        } else if (misalignment != 0 && 0 < bytes) {
            memPutLong(dst - misalignment, merge(
                memGetLong(dst - misalignment),
                fill,
                shr(shl(-1L, 8 - bytes), misalignment) // 0x0000FFFFFFFF0000
            ));
            i += 8 - misalignment;
        }

        // Aligned tail
        if (i < bytes) {
            memPutLong(dst + i, merge(
                memGetLong(dst + i),
                fill,
                shl(-1L, 8 - (bytes - i)) // 0xFFFFFFFF00000000
            ));
        }
    }

    static void memCopyAligned(long src, long dst, int bytes) {
        int i = 0;

        // Aligned longs for performance
        for (; i <= bytes - 8; i += 8) {
            memPutLong(dst + i, memGetLong(src + i));
        }

        // Aligned tail
        if (i < bytes) {
            memPutLong(dst + i, merge(
                memGetLong(dst + i),
                memGetLong(src + i),
                shl(-1L, 8 - (bytes - i))
            ));
        }
    }

    static final class MemoryTextUtilUnsafe extends MemoryTextUtil {

        @Override
        int strlen64NT1(long address, int maxLength) {
            int i = 0;

            if (8 <= maxLength) {
                int misalignment = (int)address & 7;
                if (misalignment != 0) {
                    // Align to 8 bytes
                    for (int len = 8 - misalignment; i < len; i++) {
                        if (memGetByte(address + i) == 0) {
                            return i;
                        }
                    }
                }

                // Aligned longs for performance
                do {
                    long v = memGetLong(address + i);
                    if (((v - 0x0101010101010101L) & ~v & 0x8080808080808080L) != 0) {
                        break;
                    }
                    i += 8;
                } while (i <= maxLength - 8);
            }

            // Tail
            for (; i < maxLength; i++) {
                if (memGetByte(address + i) == 0) {
                    break;
                }
            }

            return i;
        }

        @Override
        int strlen64NT2(long address, int maxLength) {
            int i = 0;

            if (8 <= maxLength) {
                int misalignment = (int)address & 7;
                if (misalignment != 0) {
                    // Align to 8 bytes
                    for (int len = 8 - misalignment; i < len; i += 2) {
                        if (memGetShort(address + i) == 0) {
                            return i;
                        }
                    }
                }

                // Aligned longs for performance
                do {
                    long v = memGetLong(address + i);
                    if (((v - 0x0001000100010001L) & ~v & 0x8000800080008000L) != 0) {
                        break;
                    }
                    i += 8;
                } while (i <= maxLength - 8);
            }

            // Tail
            for (; i < maxLength; i += 2) {
                if (memGetShort(address + i) == 0) {
                    break;
                }
            }

            return i;
        }

        @Override
        int strlen32NT1(long address, int maxLength) {
            int i = 0;

            if (4 <= maxLength) {
                int misalignment = (int)address & 3;
                if (misalignment != 0) {
                    // Align to 4 bytes
                    for (int len = 4 - misalignment; i < len; i++) {
                        if (memGetByte(address + i) == 0) {
                            return i;
                        }
                    }
                }

                // Aligned ints for performance
                do {
                    int v = memGetInt(address + i);
                    if (((v - 0x01010101) & ~v & 0x80808080) != 0) {
                        break;
                    }
                    i += 4;
                } while (i <= maxLength - 4);
            }

            // Tail
            for (; i < maxLength; i++) {
                if (memGetByte(address + i) == 0) {
                    break;
                }
            }

            return i;
        }

        @Override
        int strlen32NT2(long address, int maxLength) {
            int i = 0;

            if (4 <= maxLength) {
                int misalignment = (int)address & 3;
                if (misalignment != 0) {
                    // Align to 4 bytes
                    for (int len = 4 - misalignment; i < len; i += 2) {
                        if (memGetShort(address + i) == 0) {
                            return i;
                        }
                    }
                }

                // Aligned longs for performance
                do {
                    int v = memGetInt(address + i);
                    if (((v - 0x00010001) & ~v & 0x80008000) != 0) {
                        break;
                    }
                    i += 4;
                } while (i <= maxLength - 4);
            }

            // Tail
            for (; i < maxLength; i += 2) {
                if (memGetShort(address + i) == 0) {
                    break;
                }
            }

            return i;
        }

        @Override
        int encodeASCII(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
            return encodeASCII(text, nullTerminated, memAddress(target) + offset);
        }

        private static int encodeASCII(CharSequence text, boolean nullTerminated, long target) {
            int p = 0, len = text.length();

            for (; p < len; p++) {
                memPutByte(target + p, (byte)text.charAt(p));
            }

            if (nullTerminated) {
                memPutByte(target + p++, (byte)0);
            }

            return p;
        }

        @Override
        int encodeUTF8(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
            return encodeUTF8(text, nullTerminated, memAddress(target) + offset);
        }

        private static int encodeUTF8(CharSequence text, boolean nullTerminated, long target) {
            int i = 0, len = text.length(), p = 0;

            char c;

            // ASCII fast path
            while (i < len && (c = text.charAt(i)) < 0x80) {
                memPutByte(target + p++, (byte)c);
                i++;
            }

            // Slow path
            while (i < len) {
                c = text.charAt(i++);
                if (c < 0x80) {
                    memPutByte(target + p++, (byte)c);
                } else {
                    int cp = c;
                    if (c < 0x800) {
                        memPutByte(target + p++, (byte)(0xC0 | cp >> 6));
                    } else {
                        if (!isHighSurrogate(c)) {
                            memPutByte(target + p++, (byte)(0xE0 | cp >> 12));
                        } else {
                            cp = toCodePoint(c, text.charAt(i++));

                            memPutByte(target + p++, (byte)(0xF0 | cp >> 18));
                            memPutByte(target + p++, (byte)(0x80 | cp >> 12 & 0x3F));
                        }
                        memPutByte(target + p++, (byte)(0x80 | cp >> 6 & 0x3F));
                    }
                    memPutByte(target + p++, (byte)(0x80 | cp & 0x3F));
                }
            }

            if (nullTerminated) {
                memPutByte(target + p, (byte)0);
            }

            return p;
        }

        @Override
        int encodeUTF16(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
            return encodeUTF16(text, nullTerminated, memAddress(target) + offset);
        }

        private static int encodeUTF16(CharSequence text, boolean nullTerminated, long target) {
            int p = 0, len = text.length();

            for (int i = 0; i < len; i++, p += 2) {
                memPutShort(target + p, (short)text.charAt(i));
            }

            if (nullTerminated) {
                memPutShort(target + p, (short)0);
                p += 2;
            }

            return p;
        }

    }

    static sun.misc.Unsafe getUnsafeInstance() {
        java.lang.reflect.Field[] fields = sun.misc.Unsafe.class.getDeclaredFields();

        /*
        Different runtimes use different names for the Unsafe singleton,
        so we cannot use .getDeclaredField and we scan instead. For example:

        Oracle: theUnsafe
        PERC : m_unsafe_instance
        Android: THE_ONE
        */
        for (java.lang.reflect.Field field : fields) {
            if (!field.getType().equals(sun.misc.Unsafe.class)) {
                continue;
            }

            int modifiers = field.getModifiers();
            if (!(java.lang.reflect.Modifier.isStatic(modifiers) && java.lang.reflect.Modifier.isFinal(modifiers))) {
                continue;
            }

            field.setAccessible(true);
            try {
                return (sun.misc.Unsafe)field.get(null);
            } catch (IllegalAccessException e) {
                // ignore
            }
            break;
        }

        throw new UnsupportedOperationException();
    }

}