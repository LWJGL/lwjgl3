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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A 4x4 matrix with float components.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrMatrix4f {
 *     float {@link #M}[16];
 * }</code></pre>
 */
@NativeType("struct ovrMatrix4f")
public class OVRMatrix4f extends Struct<OVRMatrix4f> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M;

    static {
        Layout layout = __struct(
            __array(4, 16)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M = layout.offsetof(0);
    }

    protected OVRMatrix4f(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected OVRMatrix4f create(long address, @Nullable ByteBuffer container) {
        return new OVRMatrix4f(address, container);
    }

    /**
     * Creates a {@code OVRMatrix4f} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRMatrix4f(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the matrix components */
    @NativeType("float[16]")
    public FloatBuffer M() { return nM(address()); }
    /** the matrix components */
    public float M(int index) { return nM(address(), index); }

    /** Copies the specified {@link FloatBuffer} to the {@link #M} field. */
    public OVRMatrix4f M(@NativeType("float[16]") FloatBuffer value) { nM(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #M} field. */
    public OVRMatrix4f M(int index, float value) { nM(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRMatrix4f set(OVRMatrix4f src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRMatrix4f} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRMatrix4f malloc() {
        return new OVRMatrix4f(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code OVRMatrix4f} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRMatrix4f calloc() {
        return new OVRMatrix4f(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code OVRMatrix4f} instance allocated with {@link BufferUtils}. */
    public static OVRMatrix4f create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new OVRMatrix4f(memAddress(container), container);
    }

    /** Returns a new {@code OVRMatrix4f} instance for the specified memory address. */
    public static OVRMatrix4f create(long address) {
        return new OVRMatrix4f(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable OVRMatrix4f createSafe(long address) {
        return address == NULL ? null : new OVRMatrix4f(address, null);
    }

    /**
     * Returns a new {@link OVRMatrix4f.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRMatrix4f.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRMatrix4f.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRMatrix4f.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRMatrix4f.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRMatrix4f.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link OVRMatrix4f.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRMatrix4f.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static OVRMatrix4f.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRMatrix4f mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRMatrix4f callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRMatrix4f mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRMatrix4f callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRMatrix4f.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRMatrix4f.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRMatrix4f.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRMatrix4f.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRMatrix4f} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRMatrix4f malloc(MemoryStack stack) {
        return new OVRMatrix4f(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code OVRMatrix4f} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRMatrix4f calloc(MemoryStack stack) {
        return new OVRMatrix4f(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link OVRMatrix4f.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRMatrix4f.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRMatrix4f.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRMatrix4f.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #M}. */
    public static FloatBuffer nM(long struct) { return memFloatBuffer(struct + OVRMatrix4f.M, 16); }
    /** Unsafe version of {@link #M(int) M}. */
    public static float nM(long struct, int index) {
        return memGetFloat(struct + OVRMatrix4f.M + check(index, 16) * 4);
    }

    /** Unsafe version of {@link #M(FloatBuffer) M}. */
    public static void nM(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 16); }
        memCopy(memAddress(value), struct + OVRMatrix4f.M, value.remaining() * 4);
    }
    /** Unsafe version of {@link #M(int, float) M}. */
    public static void nM(long struct, int index, float value) {
        memPutFloat(struct + OVRMatrix4f.M + check(index, 16) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link OVRMatrix4f} structs. */
    public static class Buffer extends StructBuffer<OVRMatrix4f, Buffer> implements NativeResource {

        private static final OVRMatrix4f ELEMENT_FACTORY = OVRMatrix4f.create(-1L);

        /**
         * Creates a new {@code OVRMatrix4f.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRMatrix4f#SIZEOF}, and its mark will be undefined.</p>
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
        protected OVRMatrix4f getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FloatBuffer} view of the {@link OVRMatrix4f#M} field. */
        @NativeType("float[16]")
        public FloatBuffer M() { return OVRMatrix4f.nM(address()); }
        /** @return the value at the specified index of the {@link OVRMatrix4f#M} field. */
        public float M(int index) { return OVRMatrix4f.nM(address(), index); }

        /** Copies the specified {@link FloatBuffer} to the {@link OVRMatrix4f#M} field. */
        public OVRMatrix4f.Buffer M(@NativeType("float[16]") FloatBuffer value) { OVRMatrix4f.nM(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link OVRMatrix4f#M} field. */
        public OVRMatrix4f.Buffer M(int index, float value) { OVRMatrix4f.nM(address(), index, value); return this; }

    }

}