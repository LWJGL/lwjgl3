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
 * struct FMOD_COMPLEX {
 *     float real;
 *     float imag;
 * }</code></pre>
 */
@NativeType("struct FMOD_COMPLEX")
public class FMOD_COMPLEX extends Struct<FMOD_COMPLEX> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        REAL,
        IMAG;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        REAL = layout.offsetof(0);
        IMAG = layout.offsetof(1);
    }

    protected FMOD_COMPLEX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_COMPLEX create(long address, @Nullable ByteBuffer container) {
        return new FMOD_COMPLEX(address, container);
    }

    /**
     * Creates a {@code FMOD_COMPLEX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_COMPLEX(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code real} field. */
    public float real() { return nreal(address()); }
    /** @return the value of the {@code imag} field. */
    public float imag() { return nimag(address()); }

    /** Sets the specified value to the {@code real} field. */
    public FMOD_COMPLEX real(float value) { nreal(address(), value); return this; }
    /** Sets the specified value to the {@code imag} field. */
    public FMOD_COMPLEX imag(float value) { nimag(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_COMPLEX set(
        float real,
        float imag
    ) {
        real(real);
        imag(imag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_COMPLEX set(FMOD_COMPLEX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_COMPLEX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_COMPLEX malloc() {
        return new FMOD_COMPLEX(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_COMPLEX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_COMPLEX calloc() {
        return new FMOD_COMPLEX(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_COMPLEX} instance allocated with {@link BufferUtils}. */
    public static FMOD_COMPLEX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_COMPLEX(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_COMPLEX} instance for the specified memory address. */
    public static FMOD_COMPLEX create(long address) {
        return new FMOD_COMPLEX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_COMPLEX createSafe(long address) {
        return address == NULL ? null : new FMOD_COMPLEX(address, null);
    }

    /**
     * Returns a new {@link FMOD_COMPLEX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_COMPLEX.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_COMPLEX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_COMPLEX.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_COMPLEX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_COMPLEX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_COMPLEX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_COMPLEX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_COMPLEX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_COMPLEX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_COMPLEX malloc(MemoryStack stack) {
        return new FMOD_COMPLEX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_COMPLEX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_COMPLEX calloc(MemoryStack stack) {
        return new FMOD_COMPLEX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_COMPLEX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_COMPLEX.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_COMPLEX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_COMPLEX.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #real}. */
    public static float nreal(long struct) { return UNSAFE.getFloat(null, struct + FMOD_COMPLEX.REAL); }
    /** Unsafe version of {@link #imag}. */
    public static float nimag(long struct) { return UNSAFE.getFloat(null, struct + FMOD_COMPLEX.IMAG); }

    /** Unsafe version of {@link #real(float) real}. */
    public static void nreal(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_COMPLEX.REAL, value); }
    /** Unsafe version of {@link #imag(float) imag}. */
    public static void nimag(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_COMPLEX.IMAG, value); }

    // -----------------------------------

    /** An array of {@link FMOD_COMPLEX} structs. */
    public static class Buffer extends StructBuffer<FMOD_COMPLEX, Buffer> implements NativeResource {

        private static final FMOD_COMPLEX ELEMENT_FACTORY = FMOD_COMPLEX.create(-1L);

        /**
         * Creates a new {@code FMOD_COMPLEX.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_COMPLEX#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_COMPLEX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code real} field. */
        public float real() { return FMOD_COMPLEX.nreal(address()); }
        /** @return the value of the {@code imag} field. */
        public float imag() { return FMOD_COMPLEX.nimag(address()); }

        /** Sets the specified value to the {@code real} field. */
        public FMOD_COMPLEX.Buffer real(float value) { FMOD_COMPLEX.nreal(address(), value); return this; }
        /** Sets the specified value to the {@code imag} field. */
        public FMOD_COMPLEX.Buffer imag(float value) { FMOD_COMPLEX.nimag(address(), value); return this; }

    }

}