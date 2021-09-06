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
 * struct DBMONEY {
 *     LONG mnyhigh;
 *     ULONG mnylow;
 * }</code></pre>
 */
public class DBMONEY extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MNYHIGH,
        MNYLOW;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MNYHIGH = layout.offsetof(0);
        MNYLOW = layout.offsetof(1);
    }

    /**
     * Creates a {@code DBMONEY} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public DBMONEY(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code mnyhigh} field. */
    @NativeType("LONG")
    public int mnyhigh() { return nmnyhigh(address()); }
    /** @return the value of the {@code mnylow} field. */
    @NativeType("ULONG")
    public int mnylow() { return nmnylow(address()); }

    /** Sets the specified value to the {@code mnyhigh} field. */
    public DBMONEY mnyhigh(@NativeType("LONG") int value) { nmnyhigh(address(), value); return this; }
    /** Sets the specified value to the {@code mnylow} field. */
    public DBMONEY mnylow(@NativeType("ULONG") int value) { nmnylow(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public DBMONEY set(
        int mnyhigh,
        int mnylow
    ) {
        mnyhigh(mnyhigh);
        mnylow(mnylow);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public DBMONEY set(DBMONEY src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code DBMONEY} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static DBMONEY malloc() {
        return wrap(DBMONEY.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code DBMONEY} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static DBMONEY calloc() {
        return wrap(DBMONEY.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code DBMONEY} instance allocated with {@link BufferUtils}. */
    public static DBMONEY create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(DBMONEY.class, memAddress(container), container);
    }

    /** Returns a new {@code DBMONEY} instance for the specified memory address. */
    public static DBMONEY create(long address) {
        return wrap(DBMONEY.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static DBMONEY createSafe(long address) {
        return address == NULL ? null : wrap(DBMONEY.class, address);
    }

    /**
     * Returns a new {@link DBMONEY.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static DBMONEY.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link DBMONEY.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static DBMONEY.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DBMONEY.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static DBMONEY.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link DBMONEY.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static DBMONEY.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static DBMONEY.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static DBMONEY mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static DBMONEY callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static DBMONEY mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static DBMONEY callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static DBMONEY.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static DBMONEY.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static DBMONEY.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static DBMONEY.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code DBMONEY} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static DBMONEY malloc(MemoryStack stack) {
        return wrap(DBMONEY.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code DBMONEY} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static DBMONEY calloc(MemoryStack stack) {
        return wrap(DBMONEY.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link DBMONEY.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static DBMONEY.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DBMONEY.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static DBMONEY.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mnyhigh}. */
    public static int nmnyhigh(long struct) { return UNSAFE.getInt(null, struct + DBMONEY.MNYHIGH); }
    /** Unsafe version of {@link #mnylow}. */
    public static int nmnylow(long struct) { return UNSAFE.getInt(null, struct + DBMONEY.MNYLOW); }

    /** Unsafe version of {@link #mnyhigh(int) mnyhigh}. */
    public static void nmnyhigh(long struct, int value) { UNSAFE.putInt(null, struct + DBMONEY.MNYHIGH, value); }
    /** Unsafe version of {@link #mnylow(int) mnylow}. */
    public static void nmnylow(long struct, int value) { UNSAFE.putInt(null, struct + DBMONEY.MNYLOW, value); }

    // -----------------------------------

    /** An array of {@link DBMONEY} structs. */
    public static class Buffer extends StructBuffer<DBMONEY, Buffer> implements NativeResource {

        private static final DBMONEY ELEMENT_FACTORY = DBMONEY.create(-1L);

        /**
         * Creates a new {@code DBMONEY.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link DBMONEY#SIZEOF}, and its mark will be undefined.
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
        protected DBMONEY getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code mnyhigh} field. */
        @NativeType("LONG")
        public int mnyhigh() { return DBMONEY.nmnyhigh(address()); }
        /** @return the value of the {@code mnylow} field. */
        @NativeType("ULONG")
        public int mnylow() { return DBMONEY.nmnylow(address()); }

        /** Sets the specified value to the {@code mnyhigh} field. */
        public DBMONEY.Buffer mnyhigh(@NativeType("LONG") int value) { DBMONEY.nmnyhigh(address(), value); return this; }
        /** Sets the specified value to the {@code mnylow} field. */
        public DBMONEY.Buffer mnylow(@NativeType("ULONG") int value) { DBMONEY.nmnylow(address(), value); return this; }

    }

}