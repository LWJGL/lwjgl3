/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.odbc;

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
 * struct DBDATETIME {
 *     LONG dtdays;
 *     ULONG dttime;
 * }</code></pre>
 */
public class DBDATETIME extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DTDAYS,
        DTTIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DTDAYS = layout.offsetof(0);
        DTTIME = layout.offsetof(1);
    }

    /**
     * Creates a {@code DBDATETIME} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public DBDATETIME(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code dtdays} field. */
    @NativeType("LONG")
    public int dtdays() { return ndtdays(address()); }
    /** @return the value of the {@code dttime} field. */
    @NativeType("ULONG")
    public int dttime() { return ndttime(address()); }

    /** Sets the specified value to the {@code dtdays} field. */
    public DBDATETIME dtdays(@NativeType("LONG") int value) { ndtdays(address(), value); return this; }
    /** Sets the specified value to the {@code dttime} field. */
    public DBDATETIME dttime(@NativeType("ULONG") int value) { ndttime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public DBDATETIME set(
        int dtdays,
        int dttime
    ) {
        dtdays(dtdays);
        dttime(dttime);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public DBDATETIME set(DBDATETIME src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code DBDATETIME} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static DBDATETIME malloc() {
        return wrap(DBDATETIME.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code DBDATETIME} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static DBDATETIME calloc() {
        return wrap(DBDATETIME.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code DBDATETIME} instance allocated with {@link BufferUtils}. */
    public static DBDATETIME create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(DBDATETIME.class, memAddress(container), container);
    }

    /** Returns a new {@code DBDATETIME} instance for the specified memory address. */
    public static DBDATETIME create(long address) {
        return wrap(DBDATETIME.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static DBDATETIME createSafe(long address) {
        return address == NULL ? null : wrap(DBDATETIME.class, address);
    }

    /**
     * Returns a new {@link DBDATETIME.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static DBDATETIME.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link DBDATETIME.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static DBDATETIME.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DBDATETIME.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static DBDATETIME.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link DBDATETIME.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static DBDATETIME.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static DBDATETIME.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static DBDATETIME mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static DBDATETIME callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static DBDATETIME mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static DBDATETIME callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static DBDATETIME.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static DBDATETIME.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static DBDATETIME.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static DBDATETIME.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code DBDATETIME} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static DBDATETIME malloc(MemoryStack stack) {
        return wrap(DBDATETIME.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code DBDATETIME} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static DBDATETIME calloc(MemoryStack stack) {
        return wrap(DBDATETIME.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link DBDATETIME.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static DBDATETIME.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DBDATETIME.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static DBDATETIME.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #dtdays}. */
    public static int ndtdays(long struct) { return UNSAFE.getInt(null, struct + DBDATETIME.DTDAYS); }
    /** Unsafe version of {@link #dttime}. */
    public static int ndttime(long struct) { return UNSAFE.getInt(null, struct + DBDATETIME.DTTIME); }

    /** Unsafe version of {@link #dtdays(int) dtdays}. */
    public static void ndtdays(long struct, int value) { UNSAFE.putInt(null, struct + DBDATETIME.DTDAYS, value); }
    /** Unsafe version of {@link #dttime(int) dttime}. */
    public static void ndttime(long struct, int value) { UNSAFE.putInt(null, struct + DBDATETIME.DTTIME, value); }

    // -----------------------------------

    /** An array of {@link DBDATETIME} structs. */
    public static class Buffer extends StructBuffer<DBDATETIME, Buffer> implements NativeResource {

        private static final DBDATETIME ELEMENT_FACTORY = DBDATETIME.create(-1L);

        /**
         * Creates a new {@code DBDATETIME.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link DBDATETIME#SIZEOF}, and its mark will be undefined.
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
        protected DBDATETIME getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code dtdays} field. */
        @NativeType("LONG")
        public int dtdays() { return DBDATETIME.ndtdays(address()); }
        /** @return the value of the {@code dttime} field. */
        @NativeType("ULONG")
        public int dttime() { return DBDATETIME.ndttime(address()); }

        /** Sets the specified value to the {@code dtdays} field. */
        public DBDATETIME.Buffer dtdays(@NativeType("LONG") int value) { DBDATETIME.ndtdays(address(), value); return this; }
        /** Sets the specified value to the {@code dttime} field. */
        public DBDATETIME.Buffer dttime(@NativeType("ULONG") int value) { DBDATETIME.ndttime(address(), value); return this; }

    }

}