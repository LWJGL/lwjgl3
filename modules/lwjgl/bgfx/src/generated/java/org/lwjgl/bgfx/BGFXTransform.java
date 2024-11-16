/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Transform data.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_transform_t {
 *     float * {@link #data};
 *     uint16_t {@link #num};
 * }</code></pre>
 */
@NativeType("struct bgfx_transform_t")
public class BGFXTransform extends Struct<BGFXTransform> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DATA,
        NUM;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DATA = layout.offsetof(0);
        NUM = layout.offsetof(1);
    }

    protected BGFXTransform(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected BGFXTransform create(long address, @Nullable ByteBuffer container) {
        return new BGFXTransform(address, container);
    }

    /**
     * Creates a {@code BGFXTransform} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXTransform(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** pointer to first 4x4 matrix */
    @NativeType("float *")
    public FloatBuffer data() { return ndata(address()); }
    /** number of matrices */
    @NativeType("uint16_t")
    public short num() { return nnum(address()); }

    // -----------------------------------

    /** Returns a new {@code BGFXTransform} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXTransform malloc() {
        return new BGFXTransform(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code BGFXTransform} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXTransform calloc() {
        return new BGFXTransform(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code BGFXTransform} instance allocated with {@link BufferUtils}. */
    public static BGFXTransform create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new BGFXTransform(memAddress(container), container);
    }

    /** Returns a new {@code BGFXTransform} instance for the specified memory address. */
    public static BGFXTransform create(long address) {
        return new BGFXTransform(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable BGFXTransform createSafe(long address) {
        return address == NULL ? null : new BGFXTransform(address, null);
    }

    /**
     * Returns a new {@link BGFXTransform.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXTransform.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link BGFXTransform.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXTransform.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXTransform.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXTransform.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link BGFXTransform.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BGFXTransform.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static BGFXTransform.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static BGFXTransform mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static BGFXTransform callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static BGFXTransform mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static BGFXTransform callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXTransform.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXTransform.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXTransform.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXTransform.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code BGFXTransform} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXTransform malloc(MemoryStack stack) {
        return new BGFXTransform(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code BGFXTransform} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXTransform calloc(MemoryStack stack) {
        return new BGFXTransform(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link BGFXTransform.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXTransform.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXTransform.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXTransform.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #data() data}. */
    public static FloatBuffer ndata(long struct) { return memFloatBuffer(memGetAddress(struct + BGFXTransform.DATA), (Short.toUnsignedInt(nnum(struct)) << 4)); }
    /** Unsafe version of {@link #num}. */
    public static short nnum(long struct) { return memGetShort(struct + BGFXTransform.NUM); }

    // -----------------------------------

    /** An array of {@link BGFXTransform} structs. */
    public static class Buffer extends StructBuffer<BGFXTransform, Buffer> implements NativeResource {

        private static final BGFXTransform ELEMENT_FACTORY = BGFXTransform.create(-1L);

        /**
         * Creates a new {@code BGFXTransform.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXTransform#SIZEOF}, and its mark will be undefined.</p>
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
        protected BGFXTransform getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FloatBuffer} view of the data pointed to by the {@link BGFXTransform#data} field. */
        @NativeType("float *")
        public FloatBuffer data() { return BGFXTransform.ndata(address()); }
        /** @return the value of the {@link BGFXTransform#num} field. */
        @NativeType("uint16_t")
        public short num() { return BGFXTransform.nnum(address()); }

    }

}