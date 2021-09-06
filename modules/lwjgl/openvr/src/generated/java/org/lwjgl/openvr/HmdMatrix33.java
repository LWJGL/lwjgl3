/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

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
 * struct HmdMatrix33_t {
 *     float m[9];
 * }</code></pre>
 */
@NativeType("struct HmdMatrix33_t")
public class HmdMatrix33 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M;

    static {
        Layout layout = __struct(
            __array(4, 9)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M = layout.offsetof(0);
    }

    /**
     * Creates a {@code HmdMatrix33} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public HmdMatrix33(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FloatBuffer} view of the {@code m} field. */
    @NativeType("float[9]")
    public FloatBuffer m() { return nm(address()); }
    /** @return the value at the specified index of the {@code m} field. */
    public float m(int index) { return nm(address(), index); }

    /** Copies the specified {@link FloatBuffer} to the {@code m} field. */
    public HmdMatrix33 m(@NativeType("float[9]") FloatBuffer value) { nm(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m} field. */
    public HmdMatrix33 m(int index, float value) { nm(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public HmdMatrix33 set(HmdMatrix33 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code HmdMatrix33} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static HmdMatrix33 malloc() {
        return wrap(HmdMatrix33.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code HmdMatrix33} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static HmdMatrix33 calloc() {
        return wrap(HmdMatrix33.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code HmdMatrix33} instance allocated with {@link BufferUtils}. */
    public static HmdMatrix33 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(HmdMatrix33.class, memAddress(container), container);
    }

    /** Returns a new {@code HmdMatrix33} instance for the specified memory address. */
    public static HmdMatrix33 create(long address) {
        return wrap(HmdMatrix33.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static HmdMatrix33 createSafe(long address) {
        return address == NULL ? null : wrap(HmdMatrix33.class, address);
    }

    /**
     * Returns a new {@link HmdMatrix33.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HmdMatrix33.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link HmdMatrix33.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HmdMatrix33.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdMatrix33.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static HmdMatrix33.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link HmdMatrix33.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static HmdMatrix33.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static HmdMatrix33.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static HmdMatrix33 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static HmdMatrix33 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static HmdMatrix33 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static HmdMatrix33 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdMatrix33.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdMatrix33.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdMatrix33.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdMatrix33.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code HmdMatrix33} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdMatrix33 malloc(MemoryStack stack) {
        return wrap(HmdMatrix33.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code HmdMatrix33} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdMatrix33 calloc(MemoryStack stack) {
        return wrap(HmdMatrix33.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link HmdMatrix33.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HmdMatrix33.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdMatrix33.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HmdMatrix33.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m}. */
    public static FloatBuffer nm(long struct) { return memFloatBuffer(struct + HmdMatrix33.M, 9); }
    /** Unsafe version of {@link #m(int) m}. */
    public static float nm(long struct, int index) {
        return UNSAFE.getFloat(null, struct + HmdMatrix33.M + check(index, 9) * 4);
    }

    /** Unsafe version of {@link #m(FloatBuffer) m}. */
    public static void nm(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 9); }
        memCopy(memAddress(value), struct + HmdMatrix33.M, value.remaining() * 4);
    }
    /** Unsafe version of {@link #m(int, float) m}. */
    public static void nm(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + HmdMatrix33.M + check(index, 9) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link HmdMatrix33} structs. */
    public static class Buffer extends StructBuffer<HmdMatrix33, Buffer> implements NativeResource {

        private static final HmdMatrix33 ELEMENT_FACTORY = HmdMatrix33.create(-1L);

        /**
         * Creates a new {@code HmdMatrix33.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link HmdMatrix33#SIZEOF}, and its mark will be undefined.
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
        protected HmdMatrix33 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FloatBuffer} view of the {@code m} field. */
        @NativeType("float[9]")
        public FloatBuffer m() { return HmdMatrix33.nm(address()); }
        /** @return the value at the specified index of the {@code m} field. */
        public float m(int index) { return HmdMatrix33.nm(address(), index); }

        /** Copies the specified {@link FloatBuffer} to the {@code m} field. */
        public HmdMatrix33.Buffer m(@NativeType("float[9]") FloatBuffer value) { HmdMatrix33.nm(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m} field. */
        public HmdMatrix33.Buffer m(int index, float value) { HmdMatrix33.nm(address(), index, value); return this; }

    }

}