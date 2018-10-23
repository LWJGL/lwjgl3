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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * 3D array descriptor.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code Width} &ndash; Width of 3D array</li>
 * <li>{@code Height} &ndash; Height of 3D array</li>
 * <li>{@code Depth} &ndash; Depth of 3D array</li>
 * <li>{@code Format} &ndash; Array format</li>
 * <li>{@code NumChannels} &ndash; Channels per array element</li>
 * <li>{@code Flags} &ndash; Flags</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUDA_ARRAY3D_DESCRIPTOR {
 *     size_t Width;
 *     size_t Height;
 *     size_t Depth;
 *     CUarray_format Format;
 *     unsigned int NumChannels;
 *     unsigned int Flags;
 * }</code></pre>
 */
public class CUDA_ARRAY3D_DESCRIPTOR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WIDTH,
        HEIGHT,
        DEPTH,
        FORMAT,
        NUMCHANNELS,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
        DEPTH = layout.offsetof(2);
        FORMAT = layout.offsetof(3);
        NUMCHANNELS = layout.offsetof(4);
        FLAGS = layout.offsetof(5);
    }

    /**
     * Creates a {@link CUDA_ARRAY3D_DESCRIPTOR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_ARRAY3D_DESCRIPTOR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code Width} field. */
    @NativeType("size_t")
    public long Width() { return nWidth(address()); }
    /** Returns the value of the {@code Height} field. */
    @NativeType("size_t")
    public long Height() { return nHeight(address()); }
    /** Returns the value of the {@code Depth} field. */
    @NativeType("size_t")
    public long Depth() { return nDepth(address()); }
    /** Returns the value of the {@code Format} field. */
    @NativeType("CUarray_format")
    public int Format() { return nFormat(address()); }
    /** Returns the value of the {@code NumChannels} field. */
    @NativeType("unsigned int")
    public int NumChannels() { return nNumChannels(address()); }
    /** Returns the value of the {@code Flags} field. */
    @NativeType("unsigned int")
    public int Flags() { return nFlags(address()); }

    /** Sets the specified value to the {@code Width} field. */
    public CUDA_ARRAY3D_DESCRIPTOR Width(@NativeType("size_t") long value) { nWidth(address(), value); return this; }
    /** Sets the specified value to the {@code Height} field. */
    public CUDA_ARRAY3D_DESCRIPTOR Height(@NativeType("size_t") long value) { nHeight(address(), value); return this; }
    /** Sets the specified value to the {@code Depth} field. */
    public CUDA_ARRAY3D_DESCRIPTOR Depth(@NativeType("size_t") long value) { nDepth(address(), value); return this; }
    /** Sets the specified value to the {@code Format} field. */
    public CUDA_ARRAY3D_DESCRIPTOR Format(@NativeType("CUarray_format") int value) { nFormat(address(), value); return this; }
    /** Sets the specified value to the {@code NumChannels} field. */
    public CUDA_ARRAY3D_DESCRIPTOR NumChannels(@NativeType("unsigned int") int value) { nNumChannels(address(), value); return this; }
    /** Sets the specified value to the {@code Flags} field. */
    public CUDA_ARRAY3D_DESCRIPTOR Flags(@NativeType("unsigned int") int value) { nFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_ARRAY3D_DESCRIPTOR set(
        long Width,
        long Height,
        long Depth,
        int Format,
        int NumChannels,
        int Flags
    ) {
        Width(Width);
        Height(Height);
        Depth(Depth);
        Format(Format);
        NumChannels(NumChannels);
        Flags(Flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUDA_ARRAY3D_DESCRIPTOR set(CUDA_ARRAY3D_DESCRIPTOR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link CUDA_ARRAY3D_DESCRIPTOR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_ARRAY3D_DESCRIPTOR malloc() {
        return wrap(CUDA_ARRAY3D_DESCRIPTOR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link CUDA_ARRAY3D_DESCRIPTOR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_ARRAY3D_DESCRIPTOR calloc() {
        return wrap(CUDA_ARRAY3D_DESCRIPTOR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link CUDA_ARRAY3D_DESCRIPTOR} instance allocated with {@link BufferUtils}. */
    public static CUDA_ARRAY3D_DESCRIPTOR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUDA_ARRAY3D_DESCRIPTOR.class, memAddress(container), container);
    }

    /** Returns a new {@link CUDA_ARRAY3D_DESCRIPTOR} instance for the specified memory address. */
    public static CUDA_ARRAY3D_DESCRIPTOR create(long address) {
        return wrap(CUDA_ARRAY3D_DESCRIPTOR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_ARRAY3D_DESCRIPTOR createSafe(long address) {
        return address == NULL ? null : wrap(CUDA_ARRAY3D_DESCRIPTOR.class, address);
    }

    /**
     * Returns a new {@link CUDA_ARRAY3D_DESCRIPTOR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_ARRAY3D_DESCRIPTOR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_ARRAY3D_DESCRIPTOR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_ARRAY3D_DESCRIPTOR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_ARRAY3D_DESCRIPTOR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_ARRAY3D_DESCRIPTOR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUDA_ARRAY3D_DESCRIPTOR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_ARRAY3D_DESCRIPTOR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_ARRAY3D_DESCRIPTOR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link CUDA_ARRAY3D_DESCRIPTOR} instance allocated on the thread-local {@link MemoryStack}. */
    public static CUDA_ARRAY3D_DESCRIPTOR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link CUDA_ARRAY3D_DESCRIPTOR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static CUDA_ARRAY3D_DESCRIPTOR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link CUDA_ARRAY3D_DESCRIPTOR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_ARRAY3D_DESCRIPTOR mallocStack(MemoryStack stack) {
        return wrap(CUDA_ARRAY3D_DESCRIPTOR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link CUDA_ARRAY3D_DESCRIPTOR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_ARRAY3D_DESCRIPTOR callocStack(MemoryStack stack) {
        return wrap(CUDA_ARRAY3D_DESCRIPTOR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUDA_ARRAY3D_DESCRIPTOR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_ARRAY3D_DESCRIPTOR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CUDA_ARRAY3D_DESCRIPTOR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_ARRAY3D_DESCRIPTOR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CUDA_ARRAY3D_DESCRIPTOR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_ARRAY3D_DESCRIPTOR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_ARRAY3D_DESCRIPTOR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_ARRAY3D_DESCRIPTOR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Width}. */
    public static long nWidth(long struct) { return memGetAddress(struct + CUDA_ARRAY3D_DESCRIPTOR.WIDTH); }
    /** Unsafe version of {@link #Height}. */
    public static long nHeight(long struct) { return memGetAddress(struct + CUDA_ARRAY3D_DESCRIPTOR.HEIGHT); }
    /** Unsafe version of {@link #Depth}. */
    public static long nDepth(long struct) { return memGetAddress(struct + CUDA_ARRAY3D_DESCRIPTOR.DEPTH); }
    /** Unsafe version of {@link #Format}. */
    public static int nFormat(long struct) { return UNSAFE.getInt(null, struct + CUDA_ARRAY3D_DESCRIPTOR.FORMAT); }
    /** Unsafe version of {@link #NumChannels}. */
    public static int nNumChannels(long struct) { return UNSAFE.getInt(null, struct + CUDA_ARRAY3D_DESCRIPTOR.NUMCHANNELS); }
    /** Unsafe version of {@link #Flags}. */
    public static int nFlags(long struct) { return UNSAFE.getInt(null, struct + CUDA_ARRAY3D_DESCRIPTOR.FLAGS); }

    /** Unsafe version of {@link #Width(long) Width}. */
    public static void nWidth(long struct, long value) { memPutAddress(struct + CUDA_ARRAY3D_DESCRIPTOR.WIDTH, value); }
    /** Unsafe version of {@link #Height(long) Height}. */
    public static void nHeight(long struct, long value) { memPutAddress(struct + CUDA_ARRAY3D_DESCRIPTOR.HEIGHT, value); }
    /** Unsafe version of {@link #Depth(long) Depth}. */
    public static void nDepth(long struct, long value) { memPutAddress(struct + CUDA_ARRAY3D_DESCRIPTOR.DEPTH, value); }
    /** Unsafe version of {@link #Format(int) Format}. */
    public static void nFormat(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_ARRAY3D_DESCRIPTOR.FORMAT, value); }
    /** Unsafe version of {@link #NumChannels(int) NumChannels}. */
    public static void nNumChannels(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_ARRAY3D_DESCRIPTOR.NUMCHANNELS, value); }
    /** Unsafe version of {@link #Flags(int) Flags}. */
    public static void nFlags(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_ARRAY3D_DESCRIPTOR.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link CUDA_ARRAY3D_DESCRIPTOR} structs. */
    public static class Buffer extends StructBuffer<CUDA_ARRAY3D_DESCRIPTOR, Buffer> implements NativeResource {

        private static final CUDA_ARRAY3D_DESCRIPTOR ELEMENT_FACTORY = CUDA_ARRAY3D_DESCRIPTOR.create(-1L);

        /**
         * Creates a new {@link CUDA_ARRAY3D_DESCRIPTOR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_ARRAY3D_DESCRIPTOR#SIZEOF}, and its mark will be undefined.
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
        protected CUDA_ARRAY3D_DESCRIPTOR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code Width} field. */
        @NativeType("size_t")
        public long Width() { return CUDA_ARRAY3D_DESCRIPTOR.nWidth(address()); }
        /** Returns the value of the {@code Height} field. */
        @NativeType("size_t")
        public long Height() { return CUDA_ARRAY3D_DESCRIPTOR.nHeight(address()); }
        /** Returns the value of the {@code Depth} field. */
        @NativeType("size_t")
        public long Depth() { return CUDA_ARRAY3D_DESCRIPTOR.nDepth(address()); }
        /** Returns the value of the {@code Format} field. */
        @NativeType("CUarray_format")
        public int Format() { return CUDA_ARRAY3D_DESCRIPTOR.nFormat(address()); }
        /** Returns the value of the {@code NumChannels} field. */
        @NativeType("unsigned int")
        public int NumChannels() { return CUDA_ARRAY3D_DESCRIPTOR.nNumChannels(address()); }
        /** Returns the value of the {@code Flags} field. */
        @NativeType("unsigned int")
        public int Flags() { return CUDA_ARRAY3D_DESCRIPTOR.nFlags(address()); }

        /** Sets the specified value to the {@code Width} field. */
        public CUDA_ARRAY3D_DESCRIPTOR.Buffer Width(@NativeType("size_t") long value) { CUDA_ARRAY3D_DESCRIPTOR.nWidth(address(), value); return this; }
        /** Sets the specified value to the {@code Height} field. */
        public CUDA_ARRAY3D_DESCRIPTOR.Buffer Height(@NativeType("size_t") long value) { CUDA_ARRAY3D_DESCRIPTOR.nHeight(address(), value); return this; }
        /** Sets the specified value to the {@code Depth} field. */
        public CUDA_ARRAY3D_DESCRIPTOR.Buffer Depth(@NativeType("size_t") long value) { CUDA_ARRAY3D_DESCRIPTOR.nDepth(address(), value); return this; }
        /** Sets the specified value to the {@code Format} field. */
        public CUDA_ARRAY3D_DESCRIPTOR.Buffer Format(@NativeType("CUarray_format") int value) { CUDA_ARRAY3D_DESCRIPTOR.nFormat(address(), value); return this; }
        /** Sets the specified value to the {@code NumChannels} field. */
        public CUDA_ARRAY3D_DESCRIPTOR.Buffer NumChannels(@NativeType("unsigned int") int value) { CUDA_ARRAY3D_DESCRIPTOR.nNumChannels(address(), value); return this; }
        /** Sets the specified value to the {@code Flags} field. */
        public CUDA_ARRAY3D_DESCRIPTOR.Buffer Flags(@NativeType("unsigned int") int value) { CUDA_ARRAY3D_DESCRIPTOR.nFlags(address(), value); return this; }

    }

}