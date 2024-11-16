/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct HmdVector3_t {
 *     float v[3];
 * }</code></pre>
 */
@NativeType("struct HmdVector3_t")
public class HmdVector3 extends Struct<HmdVector3> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        V;

    static {
        Layout layout = __struct(
            __array(4, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        V = layout.offsetof(0);
    }

    protected HmdVector3(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected HmdVector3 create(long address, @Nullable ByteBuffer container) {
        return new HmdVector3(address, container);
    }

    /**
     * Creates a {@code HmdVector3} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public HmdVector3(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FloatBuffer} view of the {@code v} field. */
    @NativeType("float[3]")
    public FloatBuffer v() { return nv(address()); }
    /** @return the value at the specified index of the {@code v} field. */
    public float v(int index) { return nv(address(), index); }

    /** Copies the specified {@link FloatBuffer} to the {@code v} field. */
    public HmdVector3 v(@NativeType("float[3]") FloatBuffer value) { nv(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code v} field. */
    public HmdVector3 v(int index, float value) { nv(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public HmdVector3 set(HmdVector3 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code HmdVector3} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static HmdVector3 malloc() {
        return new HmdVector3(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code HmdVector3} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static HmdVector3 calloc() {
        return new HmdVector3(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code HmdVector3} instance allocated with {@link BufferUtils}. */
    public static HmdVector3 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new HmdVector3(memAddress(container), container);
    }

    /** Returns a new {@code HmdVector3} instance for the specified memory address. */
    public static HmdVector3 create(long address) {
        return new HmdVector3(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable HmdVector3 createSafe(long address) {
        return address == NULL ? null : new HmdVector3(address, null);
    }

    /**
     * Returns a new {@link HmdVector3.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HmdVector3.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link HmdVector3.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HmdVector3.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdVector3.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static HmdVector3.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link HmdVector3.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static HmdVector3.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static HmdVector3.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static HmdVector3 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static HmdVector3 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static HmdVector3 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static HmdVector3 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdVector3.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdVector3.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdVector3.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdVector3.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code HmdVector3} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdVector3 malloc(MemoryStack stack) {
        return new HmdVector3(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code HmdVector3} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdVector3 calloc(MemoryStack stack) {
        return new HmdVector3(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link HmdVector3.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HmdVector3.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdVector3.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HmdVector3.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #v}. */
    public static FloatBuffer nv(long struct) { return memFloatBuffer(struct + HmdVector3.V, 3); }
    /** Unsafe version of {@link #v(int) v}. */
    public static float nv(long struct, int index) {
        return memGetFloat(struct + HmdVector3.V + check(index, 3) * 4);
    }

    /** Unsafe version of {@link #v(FloatBuffer) v}. */
    public static void nv(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + HmdVector3.V, value.remaining() * 4);
    }
    /** Unsafe version of {@link #v(int, float) v}. */
    public static void nv(long struct, int index, float value) {
        memPutFloat(struct + HmdVector3.V + check(index, 3) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link HmdVector3} structs. */
    public static class Buffer extends StructBuffer<HmdVector3, Buffer> implements NativeResource {

        private static final HmdVector3 ELEMENT_FACTORY = HmdVector3.create(-1L);

        /**
         * Creates a new {@code HmdVector3.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link HmdVector3#SIZEOF}, and its mark will be undefined.</p>
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
        protected HmdVector3 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FloatBuffer} view of the {@code v} field. */
        @NativeType("float[3]")
        public FloatBuffer v() { return HmdVector3.nv(address()); }
        /** @return the value at the specified index of the {@code v} field. */
        public float v(int index) { return HmdVector3.nv(address(), index); }

        /** Copies the specified {@link FloatBuffer} to the {@code v} field. */
        public HmdVector3.Buffer v(@NativeType("float[3]") FloatBuffer value) { HmdVector3.nv(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code v} field. */
        public HmdVector3.Buffer v(int index, float value) { HmdVector3.nv(address(), index, value); return this; }

    }

}