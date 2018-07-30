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

    HmdMatrix33(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link HmdMatrix33} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public HmdMatrix33(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link FloatBuffer} view of the {@code m} field. */
    @NativeType("float[9]")
    public FloatBuffer m() { return nm(address()); }
    /** Returns the value at the specified index of the {@code m} field. */
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

    /** Returns a new {@link HmdMatrix33} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static HmdMatrix33 malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link HmdMatrix33} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static HmdMatrix33 calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link HmdMatrix33} instance allocated with {@link BufferUtils}. */
    public static HmdMatrix33 create() {
        return new HmdMatrix33(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link HmdMatrix33} instance for the specified memory address. */
    public static HmdMatrix33 create(long address) {
        return new HmdMatrix33(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static HmdMatrix33 createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link HmdMatrix33.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HmdMatrix33.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdMatrix33.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HmdMatrix33.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdMatrix33.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static HmdMatrix33.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link HmdMatrix33.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static HmdMatrix33.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static HmdMatrix33.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link HmdMatrix33} instance allocated on the thread-local {@link MemoryStack}. */
    public static HmdMatrix33 mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link HmdMatrix33} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static HmdMatrix33 callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link HmdMatrix33} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdMatrix33 mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link HmdMatrix33} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdMatrix33 callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link HmdMatrix33.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static HmdMatrix33.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link HmdMatrix33.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static HmdMatrix33.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link HmdMatrix33.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HmdMatrix33.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdMatrix33.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HmdMatrix33.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m}. */
    public static FloatBuffer nm(long struct) { return memFloatBuffer(struct + HmdMatrix33.M, 9); }
    /** Unsafe version of {@link #m(int) m}. */
    public static float nm(long struct, int index) {
        return memGetFloat(struct + HmdMatrix33.M + check(index, 9) * 4);
    }

    /** Unsafe version of {@link #m(FloatBuffer) m}. */
    public static void nm(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 9); }
        memCopy(memAddress(value), struct + HmdMatrix33.M, value.remaining() * 4);
    }
    /** Unsafe version of {@link #m(int, float) m}. */
    public static void nm(long struct, int index, float value) {
        memPutFloat(struct + HmdMatrix33.M + check(index, 9) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link HmdMatrix33} structs. */
    public static class Buffer extends StructBuffer<HmdMatrix33, Buffer> implements NativeResource {

        /**
         * Creates a new {@link HmdMatrix33.Buffer} instance backed by the specified container.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected HmdMatrix33 newInstance(long address) {
            return new HmdMatrix33(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link FloatBuffer} view of the {@code m} field. */
        @NativeType("float[9]")
        public FloatBuffer m() { return HmdMatrix33.nm(address()); }
        /** Returns the value at the specified index of the {@code m} field. */
        public float m(int index) { return HmdMatrix33.nm(address(), index); }

        /** Copies the specified {@link FloatBuffer} to the {@code m} field. */
        public HmdMatrix33.Buffer m(@NativeType("float[9]") FloatBuffer value) { HmdMatrix33.nm(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m} field. */
        public HmdMatrix33.Buffer m(int index, float value) { HmdMatrix33.nm(address(), index, value); return this; }

    }

}