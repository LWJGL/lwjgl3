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
 * struct DBDATETIM4 {
 *     USHORT numdays;
 *     USHORT nummins;
 * }</code></pre>
 */
public class DBDATETIM4 extends Struct implements NativeResource {

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
        return wrap(DBDATETIM4.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code DBDATETIM4} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static DBDATETIM4 calloc() {
        return wrap(DBDATETIM4.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code DBDATETIM4} instance allocated with {@link BufferUtils}. */
    public static DBDATETIM4 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(DBDATETIM4.class, memAddress(container), container);
    }

    /** Returns a new {@code DBDATETIM4} instance for the specified memory address. */
    public static DBDATETIM4 create(long address) {
        return wrap(DBDATETIM4.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static DBDATETIM4 createSafe(long address) {
        return address == NULL ? null : wrap(DBDATETIM4.class, address);
    }

    /**
     * Returns a new {@link DBDATETIM4.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static DBDATETIM4.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link DBDATETIM4.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static DBDATETIM4.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DBDATETIM4.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static DBDATETIM4.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link DBDATETIM4.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static DBDATETIM4.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static DBDATETIM4.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
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
        return wrap(DBDATETIM4.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code DBDATETIM4} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static DBDATETIM4 calloc(MemoryStack stack) {
        return wrap(DBDATETIM4.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link DBDATETIM4.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static DBDATETIM4.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DBDATETIM4.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static DBDATETIM4.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #numdays}. */
    public static short nnumdays(long struct) { return UNSAFE.getShort(null, struct + DBDATETIM4.NUMDAYS); }
    /** Unsafe version of {@link #nummins}. */
    public static short nnummins(long struct) { return UNSAFE.getShort(null, struct + DBDATETIM4.NUMMINS); }

    /** Unsafe version of {@link #numdays(short) numdays}. */
    public static void nnumdays(long struct, short value) { UNSAFE.putShort(null, struct + DBDATETIM4.NUMDAYS, value); }
    /** Unsafe version of {@link #nummins(short) nummins}. */
    public static void nnummins(long struct, short value) { UNSAFE.putShort(null, struct + DBDATETIM4.NUMMINS, value); }

    // -----------------------------------

    /** An array of {@link DBDATETIM4} structs. */
    public static class Buffer extends StructBuffer<DBDATETIM4, Buffer> implements NativeResource {

        private static final DBDATETIM4 ELEMENT_FACTORY = DBDATETIM4.create(-1L);

        /**
         * Creates a new {@code DBDATETIM4.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link DBDATETIM4#SIZEOF}, and its mark will be undefined.
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