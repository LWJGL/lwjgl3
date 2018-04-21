/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A 4x4 matrix with float components.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code M} &ndash; the matrix components</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct ovrMatrix4f {
 *     float M[16];
 * }</pre></code>
 */
@NativeType("struct ovrMatrix4f")
public class OVRMatrix4f extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

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

    OVRMatrix4f(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link OVRMatrix4f} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRMatrix4f(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link FloatBuffer} view of the {@code M} field. */
    @NativeType("float[16]")
    public FloatBuffer M() { return nM(address()); }
    /** Returns the value at the specified index of the {@code M} field. */
    public float M(int index) { return nM(address(), index); }

    /** Copies the specified {@link FloatBuffer} to the {@code M} field. */
    public OVRMatrix4f M(@NativeType("float[16]") FloatBuffer value) { nM(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code M} field. */
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

    /** Returns a new {@link OVRMatrix4f} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRMatrix4f malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link OVRMatrix4f} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRMatrix4f calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link OVRMatrix4f} instance allocated with {@link BufferUtils}. */
    public static OVRMatrix4f create() {
        return new OVRMatrix4f(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link OVRMatrix4f} instance for the specified memory address. */
    public static OVRMatrix4f create(long address) {
        return new OVRMatrix4f(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRMatrix4f createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link OVRMatrix4f.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRMatrix4f.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRMatrix4f.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRMatrix4f.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRMatrix4f.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRMatrix4f.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
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
    @Nullable
    public static OVRMatrix4f.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link OVRMatrix4f} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRMatrix4f mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link OVRMatrix4f} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRMatrix4f callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link OVRMatrix4f} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRMatrix4f mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link OVRMatrix4f} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRMatrix4f callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRMatrix4f.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRMatrix4f.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRMatrix4f.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static OVRMatrix4f.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRMatrix4f.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRMatrix4f.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRMatrix4f.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRMatrix4f.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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

        /**
         * Creates a new {@link OVRMatrix4f.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRMatrix4f#SIZEOF}, and its mark will be undefined.
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
        protected OVRMatrix4f newInstance(long address) {
            return new OVRMatrix4f(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link FloatBuffer} view of the {@code M} field. */
        @NativeType("float[16]")
        public FloatBuffer M() { return OVRMatrix4f.nM(address()); }
        /** Returns the value at the specified index of the {@code M} field. */
        public float M(int index) { return OVRMatrix4f.nM(address(), index); }

        /** Copies the specified {@link FloatBuffer} to the {@code M} field. */
        public OVRMatrix4f.Buffer M(@NativeType("float[16]") FloatBuffer value) { OVRMatrix4f.nM(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code M} field. */
        public OVRMatrix4f.Buffer M(int index, float value) { OVRMatrix4f.nM(address(), index, value); return this; }

    }

}