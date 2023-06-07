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
 * struct HmdVector3d_t {
 *     double v[3];
 * }</code></pre>
 */
@NativeType("struct HmdVector3d_t")
public class HmdVector3d extends Struct<HmdVector3d> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        V;

    static {
        Layout layout = __struct(
            __array(8, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        V = layout.offsetof(0);
    }

    protected HmdVector3d(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected HmdVector3d create(long address, @Nullable ByteBuffer container) {
        return new HmdVector3d(address, container);
    }

    /**
     * Creates a {@code HmdVector3d} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public HmdVector3d(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link DoubleBuffer} view of the {@code v} field. */
    @NativeType("double[3]")
    public DoubleBuffer v() { return nv(address()); }
    /** @return the value at the specified index of the {@code v} field. */
    public double v(int index) { return nv(address(), index); }

    /** Copies the specified {@link DoubleBuffer} to the {@code v} field. */
    public HmdVector3d v(@NativeType("double[3]") DoubleBuffer value) { nv(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code v} field. */
    public HmdVector3d v(int index, double value) { nv(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public HmdVector3d set(HmdVector3d src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code HmdVector3d} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static HmdVector3d malloc() {
        return new HmdVector3d(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code HmdVector3d} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static HmdVector3d calloc() {
        return new HmdVector3d(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code HmdVector3d} instance allocated with {@link BufferUtils}. */
    public static HmdVector3d create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new HmdVector3d(memAddress(container), container);
    }

    /** Returns a new {@code HmdVector3d} instance for the specified memory address. */
    public static HmdVector3d create(long address) {
        return new HmdVector3d(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static HmdVector3d createSafe(long address) {
        return address == NULL ? null : new HmdVector3d(address, null);
    }

    /**
     * Returns a new {@link HmdVector3d.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HmdVector3d.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link HmdVector3d.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HmdVector3d.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdVector3d.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static HmdVector3d.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link HmdVector3d.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static HmdVector3d.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static HmdVector3d.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static HmdVector3d mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static HmdVector3d callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static HmdVector3d mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static HmdVector3d callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdVector3d.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdVector3d.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdVector3d.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static HmdVector3d.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code HmdVector3d} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdVector3d malloc(MemoryStack stack) {
        return new HmdVector3d(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code HmdVector3d} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdVector3d calloc(MemoryStack stack) {
        return new HmdVector3d(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link HmdVector3d.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HmdVector3d.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdVector3d.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HmdVector3d.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #v}. */
    public static DoubleBuffer nv(long struct) { return memDoubleBuffer(struct + HmdVector3d.V, 3); }
    /** Unsafe version of {@link #v(int) v}. */
    public static double nv(long struct, int index) {
        return UNSAFE.getDouble(null, struct + HmdVector3d.V + check(index, 3) * 8);
    }

    /** Unsafe version of {@link #v(DoubleBuffer) v}. */
    public static void nv(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + HmdVector3d.V, value.remaining() * 8);
    }
    /** Unsafe version of {@link #v(int, double) v}. */
    public static void nv(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + HmdVector3d.V + check(index, 3) * 8, value);
    }

    // -----------------------------------

    /** An array of {@link HmdVector3d} structs. */
    public static class Buffer extends StructBuffer<HmdVector3d, Buffer> implements NativeResource {

        private static final HmdVector3d ELEMENT_FACTORY = HmdVector3d.create(-1L);

        /**
         * Creates a new {@code HmdVector3d.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link HmdVector3d#SIZEOF}, and its mark will be undefined.</p>
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
        protected HmdVector3d getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link DoubleBuffer} view of the {@code v} field. */
        @NativeType("double[3]")
        public DoubleBuffer v() { return HmdVector3d.nv(address()); }
        /** @return the value at the specified index of the {@code v} field. */
        public double v(int index) { return HmdVector3d.nv(address(), index); }

        /** Copies the specified {@link DoubleBuffer} to the {@code v} field. */
        public HmdVector3d.Buffer v(@NativeType("double[3]") DoubleBuffer value) { HmdVector3d.nv(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code v} field. */
        public HmdVector3d.Buffer v(int index, double value) { HmdVector3d.nv(address(), index, value); return this; }

    }

}