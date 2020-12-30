/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vpx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Rational Number
 *
 * This structure holds a fractional value.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code num} &ndash; fraction numerator</li>
 * <li>{@code den} &ndash; fraction denominator</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct vpx_rational {
 *     int num;
 *     int den;
 * }</code></pre>
 */
public class vpx_rational extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NUM,
        DEN;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NUM = layout.offsetof(0);
        DEN = layout.offsetof(1);
    }

    /**
     * Creates a {@code vpx_rational} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public vpx_rational(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code num} field. */
    public int num() { return nnum(address()); }
    /** Returns the value of the {@code den} field. */
    public int den() { return nden(address()); }

    /** Sets the specified value to the {@code num} field. */
    public vpx_rational num(int value) { nnum(address(), value); return this; }
    /** Sets the specified value to the {@code den} field. */
    public vpx_rational den(int value) { nden(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public vpx_rational set(
        int num,
        int den
    ) {
        num(num);
        den(den);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public vpx_rational set(vpx_rational src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code vpx_rational} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static vpx_rational malloc() {
        return wrap(vpx_rational.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code vpx_rational} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static vpx_rational calloc() {
        return wrap(vpx_rational.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code vpx_rational} instance allocated with {@link BufferUtils}. */
    public static vpx_rational create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(vpx_rational.class, memAddress(container), container);
    }

    /** Returns a new {@code vpx_rational} instance for the specified memory address. */
    public static vpx_rational create(long address) {
        return wrap(vpx_rational.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static vpx_rational createSafe(long address) {
        return address == NULL ? null : wrap(vpx_rational.class, address);
    }

    /**
     * Returns a new {@link vpx_rational.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_rational.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link vpx_rational.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_rational.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link vpx_rational.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_rational.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link vpx_rational.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static vpx_rational.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static vpx_rational.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code vpx_rational} instance allocated on the thread-local {@link MemoryStack}. */
    public static vpx_rational mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code vpx_rational} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static vpx_rational callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code vpx_rational} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static vpx_rational mallocStack(MemoryStack stack) {
        return wrap(vpx_rational.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code vpx_rational} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static vpx_rational callocStack(MemoryStack stack) {
        return wrap(vpx_rational.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link vpx_rational.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_rational.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link vpx_rational.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_rational.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link vpx_rational.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static vpx_rational.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link vpx_rational.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static vpx_rational.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #num}. */
    public static int nnum(long struct) { return UNSAFE.getInt(null, struct + vpx_rational.NUM); }
    /** Unsafe version of {@link #den}. */
    public static int nden(long struct) { return UNSAFE.getInt(null, struct + vpx_rational.DEN); }

    /** Unsafe version of {@link #num(int) num}. */
    public static void nnum(long struct, int value) { UNSAFE.putInt(null, struct + vpx_rational.NUM, value); }
    /** Unsafe version of {@link #den(int) den}. */
    public static void nden(long struct, int value) { UNSAFE.putInt(null, struct + vpx_rational.DEN, value); }

    // -----------------------------------

    /** An array of {@link vpx_rational} structs. */
    public static class Buffer extends StructBuffer<vpx_rational, Buffer> implements NativeResource {

        private static final vpx_rational ELEMENT_FACTORY = vpx_rational.create(-1L);

        /**
         * Creates a new {@code vpx_rational.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link vpx_rational#SIZEOF}, and its mark will be undefined.
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
        protected vpx_rational getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code num} field. */
        public int num() { return vpx_rational.nnum(address()); }
        /** Returns the value of the {@code den} field. */
        public int den() { return vpx_rational.nden(address()); }

        /** Sets the specified value to the {@code num} field. */
        public vpx_rational.Buffer num(int value) { vpx_rational.nnum(address(), value); return this; }
        /** Sets the specified value to the {@code den} field. */
        public vpx_rational.Buffer den(int value) { vpx_rational.nden(address(), value); return this; }

    }

}