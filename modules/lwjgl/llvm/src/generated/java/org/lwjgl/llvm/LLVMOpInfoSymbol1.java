/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct LLVMOpInfoSymbol1 {
 *     uint64_t Present;
 *     char const * Name;
 *     uint64_t Value;
 * }}</pre>
 */
@NativeType("struct LLVMOpInfoSymbol1")
public class LLVMOpInfoSymbol1 extends Struct<LLVMOpInfoSymbol1> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PRESENT,
        NAME,
        VALUE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PRESENT = layout.offsetof(0);
        NAME = layout.offsetof(1);
        VALUE = layout.offsetof(2);
    }

    protected LLVMOpInfoSymbol1(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected LLVMOpInfoSymbol1 create(long address, @Nullable ByteBuffer container) {
        return new LLVMOpInfoSymbol1(address, container);
    }

    /**
     * Creates a {@code LLVMOpInfoSymbol1} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LLVMOpInfoSymbol1(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code Present} field. */
    @NativeType("uint64_t")
    public long Present() { return nPresent(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code Name} field. */
    @NativeType("char const *")
    public @Nullable ByteBuffer Name() { return nName(address()); }
    /** @return the null-terminated string pointed to by the {@code Name} field. */
    @NativeType("char const *")
    public @Nullable String NameString() { return nNameString(address()); }
    /** @return the value of the {@code Value} field. */
    @NativeType("uint64_t")
    public long Value() { return nValue(address()); }

    /** Sets the specified value to the {@code Present} field. */
    public LLVMOpInfoSymbol1 Present(@NativeType("uint64_t") long value) { nPresent(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code Name} field. */
    public LLVMOpInfoSymbol1 Name(@Nullable @NativeType("char const *") ByteBuffer value) { nName(address(), value); return this; }
    /** Sets the specified value to the {@code Value} field. */
    public LLVMOpInfoSymbol1 Value(@NativeType("uint64_t") long value) { nValue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public LLVMOpInfoSymbol1 set(
        long Present,
        @Nullable ByteBuffer Name,
        long Value
    ) {
        Present(Present);
        Name(Name);
        Value(Value);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LLVMOpInfoSymbol1 set(LLVMOpInfoSymbol1 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LLVMOpInfoSymbol1} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LLVMOpInfoSymbol1 malloc() {
        return new LLVMOpInfoSymbol1(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code LLVMOpInfoSymbol1} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LLVMOpInfoSymbol1 calloc() {
        return new LLVMOpInfoSymbol1(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code LLVMOpInfoSymbol1} instance allocated with {@link BufferUtils}. */
    public static LLVMOpInfoSymbol1 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new LLVMOpInfoSymbol1(memAddress(container), container);
    }

    /** Returns a new {@code LLVMOpInfoSymbol1} instance for the specified memory address. */
    public static LLVMOpInfoSymbol1 create(long address) {
        return new LLVMOpInfoSymbol1(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable LLVMOpInfoSymbol1 createSafe(long address) {
        return address == NULL ? null : new LLVMOpInfoSymbol1(address, null);
    }

    /**
     * Returns a new {@link LLVMOpInfoSymbol1.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOpInfoSymbol1.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LLVMOpInfoSymbol1.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOpInfoSymbol1.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMOpInfoSymbol1.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOpInfoSymbol1.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link LLVMOpInfoSymbol1.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LLVMOpInfoSymbol1.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static LLVMOpInfoSymbol1.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static LLVMOpInfoSymbol1 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static LLVMOpInfoSymbol1 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static LLVMOpInfoSymbol1 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static LLVMOpInfoSymbol1 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static LLVMOpInfoSymbol1.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static LLVMOpInfoSymbol1.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static LLVMOpInfoSymbol1.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static LLVMOpInfoSymbol1.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code LLVMOpInfoSymbol1} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMOpInfoSymbol1 malloc(MemoryStack stack) {
        return new LLVMOpInfoSymbol1(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code LLVMOpInfoSymbol1} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMOpInfoSymbol1 calloc(MemoryStack stack) {
        return new LLVMOpInfoSymbol1(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link LLVMOpInfoSymbol1.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMOpInfoSymbol1.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMOpInfoSymbol1.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMOpInfoSymbol1.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Present}. */
    public static long nPresent(long struct) { return memGetLong(struct + LLVMOpInfoSymbol1.PRESENT); }
    /** Unsafe version of {@link #Name}. */
    public static @Nullable ByteBuffer nName(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + LLVMOpInfoSymbol1.NAME)); }
    /** Unsafe version of {@link #NameString}. */
    public static @Nullable String nNameString(long struct) { return memUTF8Safe(memGetAddress(struct + LLVMOpInfoSymbol1.NAME)); }
    /** Unsafe version of {@link #Value}. */
    public static long nValue(long struct) { return memGetLong(struct + LLVMOpInfoSymbol1.VALUE); }

    /** Unsafe version of {@link #Present(long) Present}. */
    public static void nPresent(long struct, long value) { memPutLong(struct + LLVMOpInfoSymbol1.PRESENT, value); }
    /** Unsafe version of {@link #Name(ByteBuffer) Name}. */
    public static void nName(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + LLVMOpInfoSymbol1.NAME, memAddressSafe(value));
    }
    /** Unsafe version of {@link #Value(long) Value}. */
    public static void nValue(long struct, long value) { memPutLong(struct + LLVMOpInfoSymbol1.VALUE, value); }

    // -----------------------------------

    /** An array of {@link LLVMOpInfoSymbol1} structs. */
    public static class Buffer extends StructBuffer<LLVMOpInfoSymbol1, Buffer> implements NativeResource {

        private static final LLVMOpInfoSymbol1 ELEMENT_FACTORY = LLVMOpInfoSymbol1.create(-1L);

        /**
         * Creates a new {@code LLVMOpInfoSymbol1.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LLVMOpInfoSymbol1#SIZEOF}, and its mark will be undefined.</p>
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
        protected LLVMOpInfoSymbol1 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code Present} field. */
        @NativeType("uint64_t")
        public long Present() { return LLVMOpInfoSymbol1.nPresent(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code Name} field. */
        @NativeType("char const *")
        public @Nullable ByteBuffer Name() { return LLVMOpInfoSymbol1.nName(address()); }
        /** @return the null-terminated string pointed to by the {@code Name} field. */
        @NativeType("char const *")
        public @Nullable String NameString() { return LLVMOpInfoSymbol1.nNameString(address()); }
        /** @return the value of the {@code Value} field. */
        @NativeType("uint64_t")
        public long Value() { return LLVMOpInfoSymbol1.nValue(address()); }

        /** Sets the specified value to the {@code Present} field. */
        public LLVMOpInfoSymbol1.Buffer Present(@NativeType("uint64_t") long value) { LLVMOpInfoSymbol1.nPresent(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code Name} field. */
        public LLVMOpInfoSymbol1.Buffer Name(@Nullable @NativeType("char const *") ByteBuffer value) { LLVMOpInfoSymbol1.nName(address(), value); return this; }
        /** Sets the specified value to the {@code Value} field. */
        public LLVMOpInfoSymbol1.Buffer Value(@NativeType("uint64_t") long value) { LLVMOpInfoSymbol1.nValue(address(), value); return this; }

    }

}