/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

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
 * struct EXRBox2i {
 *     int min_x;
 *     int min_y;
 *     int max_x;
 *     int max_y;
 * }</code></pre>
 */
public class EXRBox2i extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MIN_X,
        MIN_Y,
        MAX_X,
        MAX_Y;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MIN_X = layout.offsetof(0);
        MIN_Y = layout.offsetof(1);
        MAX_X = layout.offsetof(2);
        MAX_Y = layout.offsetof(3);
    }

    /**
     * Creates a {@code EXRBox2i} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public EXRBox2i(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code min_x} field. */
    public int min_x() { return nmin_x(address()); }
    /** @return the value of the {@code min_y} field. */
    public int min_y() { return nmin_y(address()); }
    /** @return the value of the {@code max_x} field. */
    public int max_x() { return nmax_x(address()); }
    /** @return the value of the {@code max_y} field. */
    public int max_y() { return nmax_y(address()); }

    /** Sets the specified value to the {@code min_x} field. */
    public EXRBox2i min_x(int value) { nmin_x(address(), value); return this; }
    /** Sets the specified value to the {@code min_y} field. */
    public EXRBox2i min_y(int value) { nmin_y(address(), value); return this; }
    /** Sets the specified value to the {@code max_x} field. */
    public EXRBox2i max_x(int value) { nmax_x(address(), value); return this; }
    /** Sets the specified value to the {@code max_y} field. */
    public EXRBox2i max_y(int value) { nmax_y(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public EXRBox2i set(
        int min_x,
        int min_y,
        int max_x,
        int max_y
    ) {
        min_x(min_x);
        min_y(min_y);
        max_x(max_x);
        max_y(max_y);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public EXRBox2i set(EXRBox2i src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code EXRBox2i} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static EXRBox2i malloc() {
        return wrap(EXRBox2i.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code EXRBox2i} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static EXRBox2i calloc() {
        return wrap(EXRBox2i.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code EXRBox2i} instance allocated with {@link BufferUtils}. */
    public static EXRBox2i create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(EXRBox2i.class, memAddress(container), container);
    }

    /** Returns a new {@code EXRBox2i} instance for the specified memory address. */
    public static EXRBox2i create(long address) {
        return wrap(EXRBox2i.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static EXRBox2i createSafe(long address) {
        return address == NULL ? null : wrap(EXRBox2i.class, address);
    }

    /**
     * Returns a new {@link EXRBox2i.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static EXRBox2i.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link EXRBox2i.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static EXRBox2i.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EXRBox2i.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static EXRBox2i.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link EXRBox2i.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static EXRBox2i.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static EXRBox2i.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code EXRBox2i} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static EXRBox2i malloc(MemoryStack stack) {
        return wrap(EXRBox2i.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code EXRBox2i} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static EXRBox2i calloc(MemoryStack stack) {
        return wrap(EXRBox2i.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link EXRBox2i.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static EXRBox2i.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EXRBox2i.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static EXRBox2i.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #min_x}. */
    public static int nmin_x(long struct) { return UNSAFE.getInt(null, struct + EXRBox2i.MIN_X); }
    /** Unsafe version of {@link #min_y}. */
    public static int nmin_y(long struct) { return UNSAFE.getInt(null, struct + EXRBox2i.MIN_Y); }
    /** Unsafe version of {@link #max_x}. */
    public static int nmax_x(long struct) { return UNSAFE.getInt(null, struct + EXRBox2i.MAX_X); }
    /** Unsafe version of {@link #max_y}. */
    public static int nmax_y(long struct) { return UNSAFE.getInt(null, struct + EXRBox2i.MAX_Y); }

    /** Unsafe version of {@link #min_x(int) min_x}. */
    public static void nmin_x(long struct, int value) { UNSAFE.putInt(null, struct + EXRBox2i.MIN_X, value); }
    /** Unsafe version of {@link #min_y(int) min_y}. */
    public static void nmin_y(long struct, int value) { UNSAFE.putInt(null, struct + EXRBox2i.MIN_Y, value); }
    /** Unsafe version of {@link #max_x(int) max_x}. */
    public static void nmax_x(long struct, int value) { UNSAFE.putInt(null, struct + EXRBox2i.MAX_X, value); }
    /** Unsafe version of {@link #max_y(int) max_y}. */
    public static void nmax_y(long struct, int value) { UNSAFE.putInt(null, struct + EXRBox2i.MAX_Y, value); }

    // -----------------------------------

    /** An array of {@link EXRBox2i} structs. */
    public static class Buffer extends StructBuffer<EXRBox2i, Buffer> implements NativeResource {

        private static final EXRBox2i ELEMENT_FACTORY = EXRBox2i.create(-1L);

        /**
         * Creates a new {@code EXRBox2i.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link EXRBox2i#SIZEOF}, and its mark will be undefined.
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
        protected EXRBox2i getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code min_x} field. */
        public int min_x() { return EXRBox2i.nmin_x(address()); }
        /** @return the value of the {@code min_y} field. */
        public int min_y() { return EXRBox2i.nmin_y(address()); }
        /** @return the value of the {@code max_x} field. */
        public int max_x() { return EXRBox2i.nmax_x(address()); }
        /** @return the value of the {@code max_y} field. */
        public int max_y() { return EXRBox2i.nmax_y(address()); }

        /** Sets the specified value to the {@code min_x} field. */
        public EXRBox2i.Buffer min_x(int value) { EXRBox2i.nmin_x(address(), value); return this; }
        /** Sets the specified value to the {@code min_y} field. */
        public EXRBox2i.Buffer min_y(int value) { EXRBox2i.nmin_y(address(), value); return this; }
        /** Sets the specified value to the {@code max_x} field. */
        public EXRBox2i.Buffer max_x(int value) { EXRBox2i.nmax_x(address(), value); return this; }
        /** Sets the specified value to the {@code max_y} field. */
        public EXRBox2i.Buffer max_y(int value) { EXRBox2i.nmax_y(address(), value); return this; }

    }

}