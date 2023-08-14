/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to string.h. */
public class LibCString {

    static { Library.initialize(); }

    protected LibCString() {
        throw new UnsupportedOperationException();
    }

    // --- [ memset ] ---

    /**
     * Unsafe version of: {@link #memset}
     *
     * @param count number of bytes to fill
     */
    public static native long nmemset(long dest, int c, long count);

    /**
     * Fills a memory area with a constant byte.
     *
     * @param dest pointer to the memory area to fill
     * @param c    byte to set
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static long memset(@NativeType("void *") ByteBuffer dest, int c) {
        return nmemset(memAddress(dest), c, dest.remaining());
    }

    /**
     * Fills a memory area with a constant byte.
     *
     * @param dest pointer to the memory area to fill
     * @param c    byte to set
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static long memset(@NativeType("void *") ShortBuffer dest, int c) {
        return nmemset(memAddress(dest), c, Integer.toUnsignedLong(dest.remaining()) << 1);
    }

    /**
     * Fills a memory area with a constant byte.
     *
     * @param dest pointer to the memory area to fill
     * @param c    byte to set
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static long memset(@NativeType("void *") IntBuffer dest, int c) {
        return nmemset(memAddress(dest), c, Integer.toUnsignedLong(dest.remaining()) << 2);
    }

    /**
     * Fills a memory area with a constant byte.
     *
     * @param dest pointer to the memory area to fill
     * @param c    byte to set
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static long memset(@NativeType("void *") LongBuffer dest, int c) {
        return nmemset(memAddress(dest), c, Integer.toUnsignedLong(dest.remaining()) << 3);
    }

    /**
     * Fills a memory area with a constant byte.
     *
     * @param dest pointer to the memory area to fill
     * @param c    byte to set
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static long memset(@NativeType("void *") FloatBuffer dest, int c) {
        return nmemset(memAddress(dest), c, Integer.toUnsignedLong(dest.remaining()) << 2);
    }

    /**
     * Fills a memory area with a constant byte.
     *
     * @param dest pointer to the memory area to fill
     * @param c    byte to set
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static long memset(@NativeType("void *") DoubleBuffer dest, int c) {
        return nmemset(memAddress(dest), c, Integer.toUnsignedLong(dest.remaining()) << 3);
    }

    // --- [ memcpy ] ---

    /**
     * Unsafe version of: {@link #memcpy}
     *
     * @param count the number of bytes to be copied
     */
    public static native long nmemcpy(long dest, long src, long count);

    /**
     * Copies bytes between memory areas that must not overlap.
     *
     * @param dest pointer to the destination memory area
     * @param src  pointer to the source memory area
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static long memcpy(@NativeType("void *") ByteBuffer dest, @NativeType("void const *") ByteBuffer src) {
        if (CHECKS) {
            check(dest, src.remaining());
        }
        return nmemcpy(memAddress(dest), memAddress(src), src.remaining());
    }

    /**
     * Copies bytes between memory areas that must not overlap.
     *
     * @param dest pointer to the destination memory area
     * @param src  pointer to the source memory area
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static long memcpy(@NativeType("void *") ShortBuffer dest, @NativeType("void const *") ShortBuffer src) {
        if (CHECKS) {
            check(dest, src.remaining());
        }
        return nmemcpy(memAddress(dest), memAddress(src), Integer.toUnsignedLong(src.remaining()) << 1);
    }

    /**
     * Copies bytes between memory areas that must not overlap.
     *
     * @param dest pointer to the destination memory area
     * @param src  pointer to the source memory area
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static long memcpy(@NativeType("void *") IntBuffer dest, @NativeType("void const *") IntBuffer src) {
        if (CHECKS) {
            check(dest, src.remaining());
        }
        return nmemcpy(memAddress(dest), memAddress(src), Integer.toUnsignedLong(src.remaining()) << 2);
    }

    /**
     * Copies bytes between memory areas that must not overlap.
     *
     * @param dest pointer to the destination memory area
     * @param src  pointer to the source memory area
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static long memcpy(@NativeType("void *") LongBuffer dest, @NativeType("void const *") LongBuffer src) {
        if (CHECKS) {
            check(dest, src.remaining());
        }
        return nmemcpy(memAddress(dest), memAddress(src), Integer.toUnsignedLong(src.remaining()) << 3);
    }

    /**
     * Copies bytes between memory areas that must not overlap.
     *
     * @param dest pointer to the destination memory area
     * @param src  pointer to the source memory area
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static long memcpy(@NativeType("void *") FloatBuffer dest, @NativeType("void const *") FloatBuffer src) {
        if (CHECKS) {
            check(dest, src.remaining());
        }
        return nmemcpy(memAddress(dest), memAddress(src), Integer.toUnsignedLong(src.remaining()) << 2);
    }

    /**
     * Copies bytes between memory areas that must not overlap.
     *
     * @param dest pointer to the destination memory area
     * @param src  pointer to the source memory area
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static long memcpy(@NativeType("void *") DoubleBuffer dest, @NativeType("void const *") DoubleBuffer src) {
        if (CHECKS) {
            check(dest, src.remaining());
        }
        return nmemcpy(memAddress(dest), memAddress(src), Integer.toUnsignedLong(src.remaining()) << 3);
    }

    // --- [ memmove ] ---

    /**
     * Unsafe version of: {@link #memmove}
     *
     * @param count the number of bytes to be copied
     */
    public static native long nmemmove(long dest, long src, long count);

    /**
     * Copies {@code count} bytes from memory area {@code src} to memory area {@code dest}.
     * 
     * <p>The memory areas may overlap: copying takes place as though the bytes in {@code src} are first copied into a temporary array that does not overlap
     * {@code src} or {@code dest}, and the bytes are then copied from the temporary array to {@code dest}.</p>
     *
     * @param dest pointer to the destination memory area
     * @param src  pointer to the source memory area
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static long memmove(@NativeType("void *") ByteBuffer dest, @NativeType("void const *") ByteBuffer src) {
        if (CHECKS) {
            check(dest, src.remaining());
        }
        return nmemmove(memAddress(dest), memAddress(src), src.remaining());
    }

    /**
     * Copies {@code count} bytes from memory area {@code src} to memory area {@code dest}.
     * 
     * <p>The memory areas may overlap: copying takes place as though the bytes in {@code src} are first copied into a temporary array that does not overlap
     * {@code src} or {@code dest}, and the bytes are then copied from the temporary array to {@code dest}.</p>
     *
     * @param dest pointer to the destination memory area
     * @param src  pointer to the source memory area
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static long memmove(@NativeType("void *") ShortBuffer dest, @NativeType("void const *") ShortBuffer src) {
        if (CHECKS) {
            check(dest, src.remaining());
        }
        return nmemmove(memAddress(dest), memAddress(src), Integer.toUnsignedLong(src.remaining()) << 1);
    }

    /**
     * Copies {@code count} bytes from memory area {@code src} to memory area {@code dest}.
     * 
     * <p>The memory areas may overlap: copying takes place as though the bytes in {@code src} are first copied into a temporary array that does not overlap
     * {@code src} or {@code dest}, and the bytes are then copied from the temporary array to {@code dest}.</p>
     *
     * @param dest pointer to the destination memory area
     * @param src  pointer to the source memory area
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static long memmove(@NativeType("void *") IntBuffer dest, @NativeType("void const *") IntBuffer src) {
        if (CHECKS) {
            check(dest, src.remaining());
        }
        return nmemmove(memAddress(dest), memAddress(src), Integer.toUnsignedLong(src.remaining()) << 2);
    }

    /**
     * Copies {@code count} bytes from memory area {@code src} to memory area {@code dest}.
     * 
     * <p>The memory areas may overlap: copying takes place as though the bytes in {@code src} are first copied into a temporary array that does not overlap
     * {@code src} or {@code dest}, and the bytes are then copied from the temporary array to {@code dest}.</p>
     *
     * @param dest pointer to the destination memory area
     * @param src  pointer to the source memory area
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static long memmove(@NativeType("void *") LongBuffer dest, @NativeType("void const *") LongBuffer src) {
        if (CHECKS) {
            check(dest, src.remaining());
        }
        return nmemmove(memAddress(dest), memAddress(src), Integer.toUnsignedLong(src.remaining()) << 3);
    }

    /**
     * Copies {@code count} bytes from memory area {@code src} to memory area {@code dest}.
     * 
     * <p>The memory areas may overlap: copying takes place as though the bytes in {@code src} are first copied into a temporary array that does not overlap
     * {@code src} or {@code dest}, and the bytes are then copied from the temporary array to {@code dest}.</p>
     *
     * @param dest pointer to the destination memory area
     * @param src  pointer to the source memory area
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static long memmove(@NativeType("void *") FloatBuffer dest, @NativeType("void const *") FloatBuffer src) {
        if (CHECKS) {
            check(dest, src.remaining());
        }
        return nmemmove(memAddress(dest), memAddress(src), Integer.toUnsignedLong(src.remaining()) << 2);
    }

    /**
     * Copies {@code count} bytes from memory area {@code src} to memory area {@code dest}.
     * 
     * <p>The memory areas may overlap: copying takes place as though the bytes in {@code src} are first copied into a temporary array that does not overlap
     * {@code src} or {@code dest}, and the bytes are then copied from the temporary array to {@code dest}.</p>
     *
     * @param dest pointer to the destination memory area
     * @param src  pointer to the source memory area
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static long memmove(@NativeType("void *") DoubleBuffer dest, @NativeType("void const *") DoubleBuffer src) {
        if (CHECKS) {
            check(dest, src.remaining());
        }
        return nmemmove(memAddress(dest), memAddress(src), Integer.toUnsignedLong(src.remaining()) << 3);
    }

    // --- [ strlen ] ---

    public static native long nstrlen(long str);

    @NativeType("size_t")
    public static long strlen(@NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nstrlen(memAddress(str));
    }

    // --- [ strerror ] ---

    /** Unsafe version of: {@link #strerror} */
    public static native long nstrerror(int errnum);

    /** Returns string describing error number. */
    @Nullable
    @NativeType("char *")
    public static String strerror(int errnum) {
        long __result = nstrerror(errnum);
        return memASCIISafe(__result);
    }

    /** Array version of: {@link #nmemset} */
    public static native long nmemset(byte[] dest, int c, long count);

    /** Array version of: {@link #memset} */
    @NativeType("void *")
    public static long memset(@NativeType("void *") byte[] dest, int c) {
        return nmemset(dest, c, Integer.toUnsignedLong(dest.length) << 0);
    }

    /** Array version of: {@link #nmemset} */
    public static native long nmemset(short[] dest, int c, long count);

    /** Array version of: {@link #memset} */
    @NativeType("void *")
    public static long memset(@NativeType("void *") short[] dest, int c) {
        return nmemset(dest, c, Integer.toUnsignedLong(dest.length) << 1);
    }

    /** Array version of: {@link #nmemset} */
    public static native long nmemset(int[] dest, int c, long count);

    /** Array version of: {@link #memset} */
    @NativeType("void *")
    public static long memset(@NativeType("void *") int[] dest, int c) {
        return nmemset(dest, c, Integer.toUnsignedLong(dest.length) << 2);
    }

    /** Array version of: {@link #nmemset} */
    public static native long nmemset(long[] dest, int c, long count);

    /** Array version of: {@link #memset} */
    @NativeType("void *")
    public static long memset(@NativeType("void *") long[] dest, int c) {
        return nmemset(dest, c, Integer.toUnsignedLong(dest.length) << 3);
    }

    /** Array version of: {@link #nmemset} */
    public static native long nmemset(float[] dest, int c, long count);

    /** Array version of: {@link #memset} */
    @NativeType("void *")
    public static long memset(@NativeType("void *") float[] dest, int c) {
        return nmemset(dest, c, Integer.toUnsignedLong(dest.length) << 2);
    }

    /** Array version of: {@link #nmemset} */
    public static native long nmemset(double[] dest, int c, long count);

    /** Array version of: {@link #memset} */
    @NativeType("void *")
    public static long memset(@NativeType("void *") double[] dest, int c) {
        return nmemset(dest, c, Integer.toUnsignedLong(dest.length) << 3);
    }

    /** Array version of: {@link #nmemcpy} */
    public static native long nmemcpy(byte[] dest, byte[] src, long count);

    /** Array version of: {@link #memcpy} */
    @NativeType("void *")
    public static long memcpy(@NativeType("void *") byte[] dest, @NativeType("void const *") byte[] src) {
        if (CHECKS) {
            check(dest, src.length);
        }
        return nmemcpy(dest, src, Integer.toUnsignedLong(src.length) << 0);
    }

    /** Array version of: {@link #nmemcpy} */
    public static native long nmemcpy(short[] dest, short[] src, long count);

    /** Array version of: {@link #memcpy} */
    @NativeType("void *")
    public static long memcpy(@NativeType("void *") short[] dest, @NativeType("void const *") short[] src) {
        if (CHECKS) {
            check(dest, src.length);
        }
        return nmemcpy(dest, src, Integer.toUnsignedLong(src.length) << 1);
    }

    /** Array version of: {@link #nmemcpy} */
    public static native long nmemcpy(int[] dest, int[] src, long count);

    /** Array version of: {@link #memcpy} */
    @NativeType("void *")
    public static long memcpy(@NativeType("void *") int[] dest, @NativeType("void const *") int[] src) {
        if (CHECKS) {
            check(dest, src.length);
        }
        return nmemcpy(dest, src, Integer.toUnsignedLong(src.length) << 2);
    }

    /** Array version of: {@link #nmemcpy} */
    public static native long nmemcpy(long[] dest, long[] src, long count);

    /** Array version of: {@link #memcpy} */
    @NativeType("void *")
    public static long memcpy(@NativeType("void *") long[] dest, @NativeType("void const *") long[] src) {
        if (CHECKS) {
            check(dest, src.length);
        }
        return nmemcpy(dest, src, Integer.toUnsignedLong(src.length) << 3);
    }

    /** Array version of: {@link #nmemcpy} */
    public static native long nmemcpy(float[] dest, float[] src, long count);

    /** Array version of: {@link #memcpy} */
    @NativeType("void *")
    public static long memcpy(@NativeType("void *") float[] dest, @NativeType("void const *") float[] src) {
        if (CHECKS) {
            check(dest, src.length);
        }
        return nmemcpy(dest, src, Integer.toUnsignedLong(src.length) << 2);
    }

    /** Array version of: {@link #nmemcpy} */
    public static native long nmemcpy(double[] dest, double[] src, long count);

    /** Array version of: {@link #memcpy} */
    @NativeType("void *")
    public static long memcpy(@NativeType("void *") double[] dest, @NativeType("void const *") double[] src) {
        if (CHECKS) {
            check(dest, src.length);
        }
        return nmemcpy(dest, src, Integer.toUnsignedLong(src.length) << 3);
    }

    /** Array version of: {@link #nmemmove} */
    public static native long nmemmove(byte[] dest, byte[] src, long count);

    /** Array version of: {@link #memmove} */
    @NativeType("void *")
    public static long memmove(@NativeType("void *") byte[] dest, @NativeType("void const *") byte[] src) {
        if (CHECKS) {
            check(dest, src.length);
        }
        return nmemmove(dest, src, Integer.toUnsignedLong(src.length) << 0);
    }

    /** Array version of: {@link #nmemmove} */
    public static native long nmemmove(short[] dest, short[] src, long count);

    /** Array version of: {@link #memmove} */
    @NativeType("void *")
    public static long memmove(@NativeType("void *") short[] dest, @NativeType("void const *") short[] src) {
        if (CHECKS) {
            check(dest, src.length);
        }
        return nmemmove(dest, src, Integer.toUnsignedLong(src.length) << 1);
    }

    /** Array version of: {@link #nmemmove} */
    public static native long nmemmove(int[] dest, int[] src, long count);

    /** Array version of: {@link #memmove} */
    @NativeType("void *")
    public static long memmove(@NativeType("void *") int[] dest, @NativeType("void const *") int[] src) {
        if (CHECKS) {
            check(dest, src.length);
        }
        return nmemmove(dest, src, Integer.toUnsignedLong(src.length) << 2);
    }

    /** Array version of: {@link #nmemmove} */
    public static native long nmemmove(long[] dest, long[] src, long count);

    /** Array version of: {@link #memmove} */
    @NativeType("void *")
    public static long memmove(@NativeType("void *") long[] dest, @NativeType("void const *") long[] src) {
        if (CHECKS) {
            check(dest, src.length);
        }
        return nmemmove(dest, src, Integer.toUnsignedLong(src.length) << 3);
    }

    /** Array version of: {@link #nmemmove} */
    public static native long nmemmove(float[] dest, float[] src, long count);

    /** Array version of: {@link #memmove} */
    @NativeType("void *")
    public static long memmove(@NativeType("void *") float[] dest, @NativeType("void const *") float[] src) {
        if (CHECKS) {
            check(dest, src.length);
        }
        return nmemmove(dest, src, Integer.toUnsignedLong(src.length) << 2);
    }

    /** Array version of: {@link #nmemmove} */
    public static native long nmemmove(double[] dest, double[] src, long count);

    /** Array version of: {@link #memmove} */
    @NativeType("void *")
    public static long memmove(@NativeType("void *") double[] dest, @NativeType("void const *") double[] src) {
        if (CHECKS) {
            check(dest, src.length);
        }
        return nmemmove(dest, src, Integer.toUnsignedLong(src.length) << 3);
    }

    /**
     * Fills memory with a constant byte.
     *
     * @param dest pointer to destination
     * @param c    character to set
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static <T extends CustomBuffer<T>> long memset(@NativeType("void *") T dest, @NativeType("int") int c) {
        return nmemset(memAddress(dest), c, Integer.toUnsignedLong(dest.remaining()) * dest.sizeof());
    }

    /**
     * Copies bytes between memory areas that must not overlap.
     *
     * @param dest pointer to the destination memory area
     * @param src  pointer to the source memory area
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static <T extends CustomBuffer<T>> long memcpy(@NativeType("void *") T dest, @NativeType("void const *") T src) {
        if (CHECKS) {
            check(src, dest.remaining());
        }
        return nmemcpy(memAddress(dest), memAddress(src), (long)src.remaining() * src.sizeof());
    }

    /**
     * Copies {@code count} bytes from memory area {@code src} to memory area {@code dest}.
     *
     * <p>The memory areas may overlap: copying takes place as though the bytes in {@code src} are first copied into a temporary array that does not overlap
     * {@code src} or {@code dest}, and the bytes are then copied from the temporary array to {@code dest}.</p>
     *
     * @param dest pointer to the destination memory area
     * @param src  pointer to the source memory area
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static <T extends CustomBuffer<T>> long memmove(@NativeType("void *") T dest, @NativeType("void const *") T src) {
        if (CHECKS) {
            check(src, dest.remaining());
        }
        return nmemmove(memAddress(dest), memAddress(src), (long)src.remaining() * src.sizeof());
    }

}