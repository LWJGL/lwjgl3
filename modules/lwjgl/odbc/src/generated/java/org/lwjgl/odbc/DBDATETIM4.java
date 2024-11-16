/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.odbc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct DBDATETIM4 {
 *     USHORT numdays;
 *     USHORT nummins;
 * }</code></pre>
 */
public class DBDATETIM4 extends Struct<DBDATETIM4> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NUMDAYS,
        NUMMINS;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NUMDAYS = layout.offsetof(0);
        NUMMINS = layout.offsetof(1);
    }

    protected DBDATETIM4(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected DBDATETIM4 create(long address, @Nullable ByteBuffer container) {
        return new DBDATETIM4(address, container);
    }

    /**
     * Creates a {@code DBDATETIM4} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public DBDATETIM4(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code numdays} field. */
    @NativeType("USHORT")
    public short numdays() { return nnumdays(address()); }
    /** @return the value of the {@code nummins} field. */
    @NativeType("USHORT")
    public short nummins() { return nnummins(address()); }

    /** Sets the specified value to the {@code numdays} field. */
    public DBDATETIM4 numdays(@NativeType("USHORT") short value) { nnumdays(address(), value); return this; }
    /** Sets the specified value to the {@code nummins} field. */
    public DBDATETIM4 nummins(@NativeType("USHORT") short value) { nnummins(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public DBDATETIM4 set(
        short numdays,
        short nummins
    ) {
        numdays(numdays);
        nummins(nummins);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public DBDATETIM4 set(DBDATETIM4 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code DBDATETIM4} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static DBDATETIM4 malloc() {
        return new DBDATETIM4(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code DBDATETIM4} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static DBDATETIM4 calloc() {
        return new DBDATETIM4(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code DBDATETIM4} instance allocated with {@link BufferUtils}. */
    public static DBDATETIM4 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new DBDATETIM4(memAddress(container), container);
    }

    /** Returns a new {@code DBDATETIM4} instance for the specified memory address. */
    public static DBDATETIM4 create(long address) {
        return new DBDATETIM4(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable DBDATETIM4 createSafe(long address) {
        return address == NULL ? null : new DBDATETIM4(address, null);
    }

    /**
     * Returns a new {@link DBDATETIM4.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static DBDATETIM4.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link DBDATETIM4.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static DBDATETIM4.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DBDATETIM4.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static DBDATETIM4.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link DBDATETIM4.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static DBDATETIM4.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static DBDATETIM4.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static DBDATETIM4 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static DBDATETIM4 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static DBDATETIM4 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static DBDATETIM4 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static DBDATETIM4.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static DBDATETIM4.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static DBDATETIM4.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static DBDATETIM4.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code DBDATETIM4} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static DBDATETIM4 malloc(MemoryStack stack) {
        return new DBDATETIM4(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code DBDATETIM4} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static DBDATETIM4 calloc(MemoryStack stack) {
        return new DBDATETIM4(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link DBDATETIM4.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static DBDATETIM4.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DBDATETIM4.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static DBDATETIM4.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #numdays}. */
    public static short nnumdays(long struct) { return memGetShort(struct + DBDATETIM4.NUMDAYS); }
    /** Unsafe version of {@link #nummins}. */
    public static short nnummins(long struct) { return memGetShort(struct + DBDATETIM4.NUMMINS); }

    /** Unsafe version of {@link #numdays(short) numdays}. */
    public static void nnumdays(long struct, short value) { memPutShort(struct + DBDATETIM4.NUMDAYS, value); }
    /** Unsafe version of {@link #nummins(short) nummins}. */
    public static void nnummins(long struct, short value) { memPutShort(struct + DBDATETIM4.NUMMINS, value); }

    // -----------------------------------

    /** An array of {@link DBDATETIM4} structs. */
    public static class Buffer extends StructBuffer<DBDATETIM4, Buffer> implements NativeResource {

        private static final DBDATETIM4 ELEMENT_FACTORY = DBDATETIM4.create(-1L);

        /**
         * Creates a new {@code DBDATETIM4.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link DBDATETIM4#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected DBDATETIM4 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code numdays} field. */
        @NativeType("USHORT")
        public short numdays() { return DBDATETIM4.nnumdays(address()); }
        /** @return the value of the {@code nummins} field. */
        @NativeType("USHORT")
        public short nummins() { return DBDATETIM4.nnummins(address()); }

        /** Sets the specified value to the {@code numdays} field. */
        public DBDATETIM4.Buffer numdays(@NativeType("USHORT") short value) { DBDATETIM4.nnumdays(address(), value); return this; }
        /** Sets the specified value to the {@code nummins} field. */
        public DBDATETIM4.Buffer nummins(@NativeType("USHORT") short value) { DBDATETIM4.nnummins(address(), value); return this; }

    }

}