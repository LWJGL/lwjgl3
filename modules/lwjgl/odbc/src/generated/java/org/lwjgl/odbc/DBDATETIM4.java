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

    DBDATETIM4(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link DBDATETIM4} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public DBDATETIM4(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code numdays} field. */
    @NativeType("USHORT")
    public short numdays() { return nnumdays(address()); }
    /** Returns the value of the {@code nummins} field. */
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

    /** Returns a new {@link DBDATETIM4} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static DBDATETIM4 malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link DBDATETIM4} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static DBDATETIM4 calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link DBDATETIM4} instance allocated with {@link BufferUtils}. */
    public static DBDATETIM4 create() {
        return new DBDATETIM4(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link DBDATETIM4} instance for the specified memory address. */
    public static DBDATETIM4 create(long address) {
        return new DBDATETIM4(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static DBDATETIM4 createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link DBDATETIM4.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static DBDATETIM4.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DBDATETIM4.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static DBDATETIM4.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DBDATETIM4.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static DBDATETIM4.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
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
    @Nullable
    public static DBDATETIM4.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link DBDATETIM4} instance allocated on the thread-local {@link MemoryStack}. */
    public static DBDATETIM4 mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link DBDATETIM4} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static DBDATETIM4 callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link DBDATETIM4} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static DBDATETIM4 mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link DBDATETIM4} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static DBDATETIM4 callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link DBDATETIM4.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static DBDATETIM4.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link DBDATETIM4.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static DBDATETIM4.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link DBDATETIM4.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static DBDATETIM4.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DBDATETIM4.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static DBDATETIM4.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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

        /**
         * Creates a new {@link DBDATETIM4.Buffer} instance backed by the specified container.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected DBDATETIM4 newInstance(long address) {
            return new DBDATETIM4(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code numdays} field. */
        @NativeType("USHORT")
        public short numdays() { return DBDATETIM4.nnumdays(address()); }
        /** Returns the value of the {@code nummins} field. */
        @NativeType("USHORT")
        public short nummins() { return DBDATETIM4.nnummins(address()); }

        /** Sets the specified value to the {@code numdays} field. */
        public DBDATETIM4.Buffer numdays(@NativeType("USHORT") short value) { DBDATETIM4.nnumdays(address(), value); return this; }
        /** Sets the specified value to the {@code nummins} field. */
        public DBDATETIM4.Buffer nummins(@NativeType("USHORT") short value) { DBDATETIM4.nnummins(address(), value); return this; }

    }

}