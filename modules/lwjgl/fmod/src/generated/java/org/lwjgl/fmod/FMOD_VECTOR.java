/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FMOD_VECTOR {
 *     float x;
 *     float y;
 *     float z;
 * }</code></pre>
 */
public class FMOD_VECTOR extends Struct<FMOD_VECTOR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        Z;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        Z = layout.offsetof(2);
    }

    protected FMOD_VECTOR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_VECTOR create(long address, @Nullable ByteBuffer container) {
        return new FMOD_VECTOR(address, container);
    }

    /**
     * Creates a {@code FMOD_VECTOR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_VECTOR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code x} field. */
    public float x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    public float y() { return ny(address()); }
    /** @return the value of the {@code z} field. */
    public float z() { return nz(address()); }

    /** Sets the specified value to the {@code x} field. */
    public FMOD_VECTOR x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public FMOD_VECTOR y(float value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code z} field. */
    public FMOD_VECTOR z(float value) { nz(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_VECTOR set(
        float x,
        float y,
        float z
    ) {
        x(x);
        y(y);
        z(z);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_VECTOR set(FMOD_VECTOR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_VECTOR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_VECTOR malloc() {
        return new FMOD_VECTOR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_VECTOR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_VECTOR calloc() {
        return new FMOD_VECTOR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_VECTOR} instance allocated with {@link BufferUtils}. */
    public static FMOD_VECTOR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_VECTOR(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_VECTOR} instance for the specified memory address. */
    public static FMOD_VECTOR create(long address) {
        return new FMOD_VECTOR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_VECTOR createSafe(long address) {
        return address == NULL ? null : new FMOD_VECTOR(address, null);
    }

    /**
     * Returns a new {@link FMOD_VECTOR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_VECTOR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_VECTOR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_VECTOR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_VECTOR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_VECTOR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_VECTOR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_VECTOR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_VECTOR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_VECTOR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_VECTOR malloc(MemoryStack stack) {
        return new FMOD_VECTOR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_VECTOR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_VECTOR calloc(MemoryStack stack) {
        return new FMOD_VECTOR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_VECTOR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_VECTOR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_VECTOR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_VECTOR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return UNSAFE.getFloat(null, struct + FMOD_VECTOR.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return UNSAFE.getFloat(null, struct + FMOD_VECTOR.Y); }
    /** Unsafe version of {@link #z}. */
    public static float nz(long struct) { return UNSAFE.getFloat(null, struct + FMOD_VECTOR.Z); }

    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_VECTOR.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_VECTOR.Y, value); }
    /** Unsafe version of {@link #z(float) z}. */
    public static void nz(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_VECTOR.Z, value); }

    // -----------------------------------

    /** An array of {@link FMOD_VECTOR} structs. */
    public static class Buffer extends StructBuffer<FMOD_VECTOR, Buffer> implements NativeResource {

        private static final FMOD_VECTOR ELEMENT_FACTORY = FMOD_VECTOR.create(-1L);

        /**
         * Creates a new {@code FMOD_VECTOR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_VECTOR#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_VECTOR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code x} field. */
        public float x() { return FMOD_VECTOR.nx(address()); }
        /** @return the value of the {@code y} field. */
        public float y() { return FMOD_VECTOR.ny(address()); }
        /** @return the value of the {@code z} field. */
        public float z() { return FMOD_VECTOR.nz(address()); }

        /** Sets the specified value to the {@code x} field. */
        public FMOD_VECTOR.Buffer x(float value) { FMOD_VECTOR.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public FMOD_VECTOR.Buffer y(float value) { FMOD_VECTOR.ny(address(), value); return this; }
        /** Sets the specified value to the {@code z} field. */
        public FMOD_VECTOR.Buffer z(float value) { FMOD_VECTOR.nz(address(), value); return this; }

    }

}