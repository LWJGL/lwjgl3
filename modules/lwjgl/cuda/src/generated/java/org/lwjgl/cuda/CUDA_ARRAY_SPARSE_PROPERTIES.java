/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * CUDA array sparse properties.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUDA_ARRAY_SPARSE_PROPERTIES {
 *     struct {
 *         unsigned int {@link #tileExtent_width width};
 *         unsigned int {@link #tileExtent_height height};
 *         unsigned int {@link #tileExtent_depth depth};
 *     } tileExtent;
 *     unsigned int {@link #miptailFirstLevel};
 *     unsigned long long {@link #miptailSize};
 *     unsigned int {@link #flags};
 *     unsigned int reserved[4];
 * }</code></pre>
 */
public class CUDA_ARRAY_SPARSE_PROPERTIES extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TILEEXTENT,
            TILEEXTENT_WIDTH,
            TILEEXTENT_HEIGHT,
            TILEEXTENT_DEPTH,
        MIPTAILFIRSTLEVEL,
        MIPTAILSIZE,
        FLAGS,
        RESERVED;

    static {
        Layout layout = __struct(
            __struct(
                __member(4),
                __member(4),
                __member(4)
            ),
            __member(4),
            __member(8),
            __member(4),
            __array(4, 4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TILEEXTENT = layout.offsetof(0);
            TILEEXTENT_WIDTH = layout.offsetof(1);
            TILEEXTENT_HEIGHT = layout.offsetof(2);
            TILEEXTENT_DEPTH = layout.offsetof(3);
        MIPTAILFIRSTLEVEL = layout.offsetof(4);
        MIPTAILSIZE = layout.offsetof(5);
        FLAGS = layout.offsetof(6);
        RESERVED = layout.offsetof(7);
    }

    /**
     * Creates a {@code CUDA_ARRAY_SPARSE_PROPERTIES} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_ARRAY_SPARSE_PROPERTIES(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** width of sparse tile in elements */
    @NativeType("unsigned int")
    public int tileExtent_width() { return ntileExtent_width(address()); }
    /** height of sparse tile in elements */
    @NativeType("unsigned int")
    public int tileExtent_height() { return ntileExtent_height(address()); }
    /** depth of sparse tile in elements */
    @NativeType("unsigned int")
    public int tileExtent_depth() { return ntileExtent_depth(address()); }
    /** first mip level at which the mip tail begins */
    @NativeType("unsigned int")
    public int miptailFirstLevel() { return nmiptailFirstLevel(address()); }
    /** total size of the mip tail */
    @NativeType("unsigned long long")
    public long miptailSize() { return nmiptailSize(address()); }
    /** flags will either be zero or {@link CU#CU_ARRAY_SPARSE_PROPERTIES_SINGLE_MIPTAIL ARRAY_SPARSE_PROPERTIES_SINGLE_MIPTAIL} */
    @NativeType("unsigned int")
    public int flags() { return nflags(address()); }
    /** @return a {@link IntBuffer} view of the {@code reserved} field. */
    @NativeType("unsigned int[4]")
    public IntBuffer reserved() { return nreserved(address()); }
    /** @return the value at the specified index of the {@code reserved} field. */
    @NativeType("unsigned int")
    public int reserved(int index) { return nreserved(address(), index); }

    /** Sets the specified value to the {@link #tileExtent_width} field. */
    public CUDA_ARRAY_SPARSE_PROPERTIES tileExtent_width(@NativeType("unsigned int") int value) { ntileExtent_width(address(), value); return this; }
    /** Sets the specified value to the {@link #tileExtent_height} field. */
    public CUDA_ARRAY_SPARSE_PROPERTIES tileExtent_height(@NativeType("unsigned int") int value) { ntileExtent_height(address(), value); return this; }
    /** Sets the specified value to the {@link #tileExtent_depth} field. */
    public CUDA_ARRAY_SPARSE_PROPERTIES tileExtent_depth(@NativeType("unsigned int") int value) { ntileExtent_depth(address(), value); return this; }
    /** Sets the specified value to the {@link #miptailFirstLevel} field. */
    public CUDA_ARRAY_SPARSE_PROPERTIES miptailFirstLevel(@NativeType("unsigned int") int value) { nmiptailFirstLevel(address(), value); return this; }
    /** Sets the specified value to the {@link #miptailSize} field. */
    public CUDA_ARRAY_SPARSE_PROPERTIES miptailSize(@NativeType("unsigned long long") long value) { nmiptailSize(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public CUDA_ARRAY_SPARSE_PROPERTIES flags(@NativeType("unsigned int") int value) { nflags(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
    public CUDA_ARRAY_SPARSE_PROPERTIES reserved(@NativeType("unsigned int[4]") IntBuffer value) { nreserved(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code reserved} field. */
    public CUDA_ARRAY_SPARSE_PROPERTIES reserved(int index, @NativeType("unsigned int") int value) { nreserved(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_ARRAY_SPARSE_PROPERTIES set(
        int tileExtent_width,
        int tileExtent_height,
        int tileExtent_depth,
        int miptailFirstLevel,
        long miptailSize,
        int flags,
        IntBuffer reserved
    ) {
        tileExtent_width(tileExtent_width);
        tileExtent_height(tileExtent_height);
        tileExtent_depth(tileExtent_depth);
        miptailFirstLevel(miptailFirstLevel);
        miptailSize(miptailSize);
        flags(flags);
        reserved(reserved);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUDA_ARRAY_SPARSE_PROPERTIES set(CUDA_ARRAY_SPARSE_PROPERTIES src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_ARRAY_SPARSE_PROPERTIES} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_ARRAY_SPARSE_PROPERTIES malloc() {
        return wrap(CUDA_ARRAY_SPARSE_PROPERTIES.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CUDA_ARRAY_SPARSE_PROPERTIES} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_ARRAY_SPARSE_PROPERTIES calloc() {
        return wrap(CUDA_ARRAY_SPARSE_PROPERTIES.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CUDA_ARRAY_SPARSE_PROPERTIES} instance allocated with {@link BufferUtils}. */
    public static CUDA_ARRAY_SPARSE_PROPERTIES create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUDA_ARRAY_SPARSE_PROPERTIES.class, memAddress(container), container);
    }

    /** Returns a new {@code CUDA_ARRAY_SPARSE_PROPERTIES} instance for the specified memory address. */
    public static CUDA_ARRAY_SPARSE_PROPERTIES create(long address) {
        return wrap(CUDA_ARRAY_SPARSE_PROPERTIES.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_ARRAY_SPARSE_PROPERTIES createSafe(long address) {
        return address == NULL ? null : wrap(CUDA_ARRAY_SPARSE_PROPERTIES.class, address);
    }

    /**
     * Returns a new {@link CUDA_ARRAY_SPARSE_PROPERTIES.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_ARRAY_SPARSE_PROPERTIES.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_ARRAY_SPARSE_PROPERTIES.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_ARRAY_SPARSE_PROPERTIES.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_ARRAY_SPARSE_PROPERTIES.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_ARRAY_SPARSE_PROPERTIES.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUDA_ARRAY_SPARSE_PROPERTIES.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_ARRAY_SPARSE_PROPERTIES.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_ARRAY_SPARSE_PROPERTIES.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code CUDA_ARRAY_SPARSE_PROPERTIES} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_ARRAY_SPARSE_PROPERTIES malloc(MemoryStack stack) {
        return wrap(CUDA_ARRAY_SPARSE_PROPERTIES.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CUDA_ARRAY_SPARSE_PROPERTIES} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_ARRAY_SPARSE_PROPERTIES calloc(MemoryStack stack) {
        return wrap(CUDA_ARRAY_SPARSE_PROPERTIES.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUDA_ARRAY_SPARSE_PROPERTIES.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_ARRAY_SPARSE_PROPERTIES.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_ARRAY_SPARSE_PROPERTIES.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_ARRAY_SPARSE_PROPERTIES.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #tileExtent_width}. */
    public static int ntileExtent_width(long struct) { return UNSAFE.getInt(null, struct + CUDA_ARRAY_SPARSE_PROPERTIES.TILEEXTENT_WIDTH); }
    /** Unsafe version of {@link #tileExtent_height}. */
    public static int ntileExtent_height(long struct) { return UNSAFE.getInt(null, struct + CUDA_ARRAY_SPARSE_PROPERTIES.TILEEXTENT_HEIGHT); }
    /** Unsafe version of {@link #tileExtent_depth}. */
    public static int ntileExtent_depth(long struct) { return UNSAFE.getInt(null, struct + CUDA_ARRAY_SPARSE_PROPERTIES.TILEEXTENT_DEPTH); }
    /** Unsafe version of {@link #miptailFirstLevel}. */
    public static int nmiptailFirstLevel(long struct) { return UNSAFE.getInt(null, struct + CUDA_ARRAY_SPARSE_PROPERTIES.MIPTAILFIRSTLEVEL); }
    /** Unsafe version of {@link #miptailSize}. */
    public static long nmiptailSize(long struct) { return UNSAFE.getLong(null, struct + CUDA_ARRAY_SPARSE_PROPERTIES.MIPTAILSIZE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + CUDA_ARRAY_SPARSE_PROPERTIES.FLAGS); }
    /** Unsafe version of {@link #reserved}. */
    public static IntBuffer nreserved(long struct) { return memIntBuffer(struct + CUDA_ARRAY_SPARSE_PROPERTIES.RESERVED, 4); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static int nreserved(long struct, int index) {
        return UNSAFE.getInt(null, struct + CUDA_ARRAY_SPARSE_PROPERTIES.RESERVED + check(index, 4) * 4);
    }

    /** Unsafe version of {@link #tileExtent_width(int) tileExtent_width}. */
    public static void ntileExtent_width(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_ARRAY_SPARSE_PROPERTIES.TILEEXTENT_WIDTH, value); }
    /** Unsafe version of {@link #tileExtent_height(int) tileExtent_height}. */
    public static void ntileExtent_height(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_ARRAY_SPARSE_PROPERTIES.TILEEXTENT_HEIGHT, value); }
    /** Unsafe version of {@link #tileExtent_depth(int) tileExtent_depth}. */
    public static void ntileExtent_depth(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_ARRAY_SPARSE_PROPERTIES.TILEEXTENT_DEPTH, value); }
    /** Unsafe version of {@link #miptailFirstLevel(int) miptailFirstLevel}. */
    public static void nmiptailFirstLevel(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_ARRAY_SPARSE_PROPERTIES.MIPTAILFIRSTLEVEL, value); }
    /** Unsafe version of {@link #miptailSize(long) miptailSize}. */
    public static void nmiptailSize(long struct, long value) { UNSAFE.putLong(null, struct + CUDA_ARRAY_SPARSE_PROPERTIES.MIPTAILSIZE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_ARRAY_SPARSE_PROPERTIES.FLAGS, value); }
    /** Unsafe version of {@link #reserved(IntBuffer) reserved}. */
    public static void nreserved(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + CUDA_ARRAY_SPARSE_PROPERTIES.RESERVED, value.remaining() * 4);
    }
    /** Unsafe version of {@link #reserved(int, int) reserved}. */
    public static void nreserved(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + CUDA_ARRAY_SPARSE_PROPERTIES.RESERVED + check(index, 4) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link CUDA_ARRAY_SPARSE_PROPERTIES} structs. */
    public static class Buffer extends StructBuffer<CUDA_ARRAY_SPARSE_PROPERTIES, Buffer> implements NativeResource {

        private static final CUDA_ARRAY_SPARSE_PROPERTIES ELEMENT_FACTORY = CUDA_ARRAY_SPARSE_PROPERTIES.create(-1L);

        /**
         * Creates a new {@code CUDA_ARRAY_SPARSE_PROPERTIES.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_ARRAY_SPARSE_PROPERTIES#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected CUDA_ARRAY_SPARSE_PROPERTIES getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link CUDA_ARRAY_SPARSE_PROPERTIES#tileExtent_width} field. */
        @NativeType("unsigned int")
        public int tileExtent_width() { return CUDA_ARRAY_SPARSE_PROPERTIES.ntileExtent_width(address()); }
        /** @return the value of the {@link CUDA_ARRAY_SPARSE_PROPERTIES#tileExtent_height} field. */
        @NativeType("unsigned int")
        public int tileExtent_height() { return CUDA_ARRAY_SPARSE_PROPERTIES.ntileExtent_height(address()); }
        /** @return the value of the {@link CUDA_ARRAY_SPARSE_PROPERTIES#tileExtent_depth} field. */
        @NativeType("unsigned int")
        public int tileExtent_depth() { return CUDA_ARRAY_SPARSE_PROPERTIES.ntileExtent_depth(address()); }
        /** @return the value of the {@link CUDA_ARRAY_SPARSE_PROPERTIES#miptailFirstLevel} field. */
        @NativeType("unsigned int")
        public int miptailFirstLevel() { return CUDA_ARRAY_SPARSE_PROPERTIES.nmiptailFirstLevel(address()); }
        /** @return the value of the {@link CUDA_ARRAY_SPARSE_PROPERTIES#miptailSize} field. */
        @NativeType("unsigned long long")
        public long miptailSize() { return CUDA_ARRAY_SPARSE_PROPERTIES.nmiptailSize(address()); }
        /** @return the value of the {@link CUDA_ARRAY_SPARSE_PROPERTIES#flags} field. */
        @NativeType("unsigned int")
        public int flags() { return CUDA_ARRAY_SPARSE_PROPERTIES.nflags(address()); }
        /** @return a {@link IntBuffer} view of the {@code reserved} field. */
        @NativeType("unsigned int[4]")
        public IntBuffer reserved() { return CUDA_ARRAY_SPARSE_PROPERTIES.nreserved(address()); }
        /** @return the value at the specified index of the {@code reserved} field. */
        @NativeType("unsigned int")
        public int reserved(int index) { return CUDA_ARRAY_SPARSE_PROPERTIES.nreserved(address(), index); }

        /** Sets the specified value to the {@link CUDA_ARRAY_SPARSE_PROPERTIES#tileExtent_width} field. */
        public CUDA_ARRAY_SPARSE_PROPERTIES.Buffer tileExtent_width(@NativeType("unsigned int") int value) { CUDA_ARRAY_SPARSE_PROPERTIES.ntileExtent_width(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_ARRAY_SPARSE_PROPERTIES#tileExtent_height} field. */
        public CUDA_ARRAY_SPARSE_PROPERTIES.Buffer tileExtent_height(@NativeType("unsigned int") int value) { CUDA_ARRAY_SPARSE_PROPERTIES.ntileExtent_height(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_ARRAY_SPARSE_PROPERTIES#tileExtent_depth} field. */
        public CUDA_ARRAY_SPARSE_PROPERTIES.Buffer tileExtent_depth(@NativeType("unsigned int") int value) { CUDA_ARRAY_SPARSE_PROPERTIES.ntileExtent_depth(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_ARRAY_SPARSE_PROPERTIES#miptailFirstLevel} field. */
        public CUDA_ARRAY_SPARSE_PROPERTIES.Buffer miptailFirstLevel(@NativeType("unsigned int") int value) { CUDA_ARRAY_SPARSE_PROPERTIES.nmiptailFirstLevel(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_ARRAY_SPARSE_PROPERTIES#miptailSize} field. */
        public CUDA_ARRAY_SPARSE_PROPERTIES.Buffer miptailSize(@NativeType("unsigned long long") long value) { CUDA_ARRAY_SPARSE_PROPERTIES.nmiptailSize(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_ARRAY_SPARSE_PROPERTIES#flags} field. */
        public CUDA_ARRAY_SPARSE_PROPERTIES.Buffer flags(@NativeType("unsigned int") int value) { CUDA_ARRAY_SPARSE_PROPERTIES.nflags(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
        public CUDA_ARRAY_SPARSE_PROPERTIES.Buffer reserved(@NativeType("unsigned int[4]") IntBuffer value) { CUDA_ARRAY_SPARSE_PROPERTIES.nreserved(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code reserved} field. */
        public CUDA_ARRAY_SPARSE_PROPERTIES.Buffer reserved(int index, @NativeType("unsigned int") int value) { CUDA_ARRAY_SPARSE_PROPERTIES.nreserved(address(), index, value); return this; }

    }

}