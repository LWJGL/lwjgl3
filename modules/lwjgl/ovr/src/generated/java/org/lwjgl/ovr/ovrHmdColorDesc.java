/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrHmdColorDesc {
 *     ovrColorSpace {@link #ColorSpace};
 *     char[4];
 * }</code></pre>
 */
public class ovrHmdColorDesc extends Struct<ovrHmdColorDesc> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COLORSPACE;

    static {
        Layout layout = __struct(
            DEFAULT_PACK_ALIGNMENT, POINTER_SIZE,
            __member(4),
            __padding(4, true)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COLORSPACE = layout.offsetof(0);
    }

    protected ovrHmdColorDesc(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ovrHmdColorDesc create(long address, @Nullable ByteBuffer container) {
        return new ovrHmdColorDesc(address, container);
    }

    /**
     * Creates a {@code ovrHmdColorDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ovrHmdColorDesc(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * Approximate color space the HMD display can output.
     * 
     * <p>Use ColorPrimaries for more precise color space definition including white point (e.g. DN75)</p>
     */
    @NativeType("ovrColorSpace")
    public int ColorSpace() { return nColorSpace(address()); }

    /** Sets the specified value to the {@link #ColorSpace} field. */
    public ovrHmdColorDesc ColorSpace(@NativeType("ovrColorSpace") int value) { nColorSpace(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ovrHmdColorDesc set(ovrHmdColorDesc src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ovrHmdColorDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ovrHmdColorDesc malloc() {
        return new ovrHmdColorDesc(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ovrHmdColorDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ovrHmdColorDesc calloc() {
        return new ovrHmdColorDesc(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ovrHmdColorDesc} instance allocated with {@link BufferUtils}. */
    public static ovrHmdColorDesc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ovrHmdColorDesc(memAddress(container), container);
    }

    /** Returns a new {@code ovrHmdColorDesc} instance for the specified memory address. */
    public static ovrHmdColorDesc create(long address) {
        return new ovrHmdColorDesc(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ovrHmdColorDesc createSafe(long address) {
        return address == NULL ? null : new ovrHmdColorDesc(address, null);
    }

    /**
     * Returns a new {@link ovrHmdColorDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ovrHmdColorDesc.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ovrHmdColorDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ovrHmdColorDesc.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ovrHmdColorDesc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ovrHmdColorDesc.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ovrHmdColorDesc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ovrHmdColorDesc.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ovrHmdColorDesc.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ovrHmdColorDesc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ovrHmdColorDesc malloc(MemoryStack stack) {
        return new ovrHmdColorDesc(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ovrHmdColorDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ovrHmdColorDesc calloc(MemoryStack stack) {
        return new ovrHmdColorDesc(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ovrHmdColorDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ovrHmdColorDesc.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ovrHmdColorDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ovrHmdColorDesc.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ColorSpace}. */
    public static int nColorSpace(long struct) { return memGetInt(struct + ovrHmdColorDesc.COLORSPACE); }

    /** Unsafe version of {@link #ColorSpace(int) ColorSpace}. */
    public static void nColorSpace(long struct, int value) { memPutInt(struct + ovrHmdColorDesc.COLORSPACE, value); }

    // -----------------------------------

    /** An array of {@link ovrHmdColorDesc} structs. */
    public static class Buffer extends StructBuffer<ovrHmdColorDesc, Buffer> implements NativeResource {

        private static final ovrHmdColorDesc ELEMENT_FACTORY = ovrHmdColorDesc.create(-1L);

        /**
         * Creates a new {@code ovrHmdColorDesc.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ovrHmdColorDesc#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected ovrHmdColorDesc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link ovrHmdColorDesc#ColorSpace} field. */
        @NativeType("ovrColorSpace")
        public int ColorSpace() { return ovrHmdColorDesc.nColorSpace(address()); }

        /** Sets the specified value to the {@link ovrHmdColorDesc#ColorSpace} field. */
        public ovrHmdColorDesc.Buffer ColorSpace(@NativeType("ovrColorSpace") int value) { ovrHmdColorDesc.nColorSpace(address(), value); return this; }

    }

}