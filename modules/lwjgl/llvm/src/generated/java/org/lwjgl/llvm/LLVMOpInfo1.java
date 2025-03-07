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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct LLVMOpInfo1 {
 *     {@link LLVMOpInfoSymbol1 struct LLVMOpInfoSymbol1} AddSymbol;
 *     {@link LLVMOpInfoSymbol1 struct LLVMOpInfoSymbol1} SubtractSymbol;
 *     uint64_t Value;
 *     uint64_t VariantKind;
 * }}</pre>
 */
@NativeType("struct LLVMOpInfo1")
public class LLVMOpInfo1 extends Struct<LLVMOpInfo1> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ADDSYMBOL,
        SUBTRACTSYMBOL,
        VALUE,
        VARIANTKIND;

    static {
        Layout layout = __struct(
            __member(LLVMOpInfoSymbol1.SIZEOF, LLVMOpInfoSymbol1.ALIGNOF),
            __member(LLVMOpInfoSymbol1.SIZEOF, LLVMOpInfoSymbol1.ALIGNOF),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ADDSYMBOL = layout.offsetof(0);
        SUBTRACTSYMBOL = layout.offsetof(1);
        VALUE = layout.offsetof(2);
        VARIANTKIND = layout.offsetof(3);
    }

    protected LLVMOpInfo1(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected LLVMOpInfo1 create(long address, @Nullable ByteBuffer container) {
        return new LLVMOpInfo1(address, container);
    }

    /**
     * Creates a {@code LLVMOpInfo1} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LLVMOpInfo1(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link LLVMOpInfoSymbol1} view of the {@code AddSymbol} field. */
    @NativeType("struct LLVMOpInfoSymbol1")
    public LLVMOpInfoSymbol1 AddSymbol() { return nAddSymbol(address()); }
    /** @return a {@link LLVMOpInfoSymbol1} view of the {@code SubtractSymbol} field. */
    @NativeType("struct LLVMOpInfoSymbol1")
    public LLVMOpInfoSymbol1 SubtractSymbol() { return nSubtractSymbol(address()); }
    /** @return the value of the {@code Value} field. */
    @NativeType("uint64_t")
    public long Value() { return nValue(address()); }
    /** @return the value of the {@code VariantKind} field. */
    @NativeType("uint64_t")
    public long VariantKind() { return nVariantKind(address()); }

    /** Copies the specified {@link LLVMOpInfoSymbol1} to the {@code AddSymbol} field. */
    public LLVMOpInfo1 AddSymbol(@NativeType("struct LLVMOpInfoSymbol1") LLVMOpInfoSymbol1 value) { nAddSymbol(address(), value); return this; }
    /** Passes the {@code AddSymbol} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LLVMOpInfo1 AddSymbol(java.util.function.Consumer<LLVMOpInfoSymbol1> consumer) { consumer.accept(AddSymbol()); return this; }
    /** Copies the specified {@link LLVMOpInfoSymbol1} to the {@code SubtractSymbol} field. */
    public LLVMOpInfo1 SubtractSymbol(@NativeType("struct LLVMOpInfoSymbol1") LLVMOpInfoSymbol1 value) { nSubtractSymbol(address(), value); return this; }
    /** Passes the {@code SubtractSymbol} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LLVMOpInfo1 SubtractSymbol(java.util.function.Consumer<LLVMOpInfoSymbol1> consumer) { consumer.accept(SubtractSymbol()); return this; }
    /** Sets the specified value to the {@code Value} field. */
    public LLVMOpInfo1 Value(@NativeType("uint64_t") long value) { nValue(address(), value); return this; }
    /** Sets the specified value to the {@code VariantKind} field. */
    public LLVMOpInfo1 VariantKind(@NativeType("uint64_t") long value) { nVariantKind(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public LLVMOpInfo1 set(
        LLVMOpInfoSymbol1 AddSymbol,
        LLVMOpInfoSymbol1 SubtractSymbol,
        long Value,
        long VariantKind
    ) {
        AddSymbol(AddSymbol);
        SubtractSymbol(SubtractSymbol);
        Value(Value);
        VariantKind(VariantKind);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LLVMOpInfo1 set(LLVMOpInfo1 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LLVMOpInfo1} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LLVMOpInfo1 malloc() {
        return new LLVMOpInfo1(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code LLVMOpInfo1} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LLVMOpInfo1 calloc() {
        return new LLVMOpInfo1(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code LLVMOpInfo1} instance allocated with {@link BufferUtils}. */
    public static LLVMOpInfo1 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new LLVMOpInfo1(memAddress(container), container);
    }

    /** Returns a new {@code LLVMOpInfo1} instance for the specified memory address. */
    public static LLVMOpInfo1 create(long address) {
        return new LLVMOpInfo1(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable LLVMOpInfo1 createSafe(long address) {
        return address == NULL ? null : new LLVMOpInfo1(address, null);
    }

    /**
     * Returns a new {@link LLVMOpInfo1.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOpInfo1.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LLVMOpInfo1.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOpInfo1.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMOpInfo1.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOpInfo1.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link LLVMOpInfo1.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LLVMOpInfo1.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static LLVMOpInfo1.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static LLVMOpInfo1 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static LLVMOpInfo1 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static LLVMOpInfo1 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static LLVMOpInfo1 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static LLVMOpInfo1.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static LLVMOpInfo1.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static LLVMOpInfo1.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static LLVMOpInfo1.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code LLVMOpInfo1} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMOpInfo1 malloc(MemoryStack stack) {
        return new LLVMOpInfo1(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code LLVMOpInfo1} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMOpInfo1 calloc(MemoryStack stack) {
        return new LLVMOpInfo1(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link LLVMOpInfo1.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMOpInfo1.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMOpInfo1.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMOpInfo1.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #AddSymbol}. */
    public static LLVMOpInfoSymbol1 nAddSymbol(long struct) { return LLVMOpInfoSymbol1.create(struct + LLVMOpInfo1.ADDSYMBOL); }
    /** Unsafe version of {@link #SubtractSymbol}. */
    public static LLVMOpInfoSymbol1 nSubtractSymbol(long struct) { return LLVMOpInfoSymbol1.create(struct + LLVMOpInfo1.SUBTRACTSYMBOL); }
    /** Unsafe version of {@link #Value}. */
    public static long nValue(long struct) { return memGetLong(struct + LLVMOpInfo1.VALUE); }
    /** Unsafe version of {@link #VariantKind}. */
    public static long nVariantKind(long struct) { return memGetLong(struct + LLVMOpInfo1.VARIANTKIND); }

    /** Unsafe version of {@link #AddSymbol(LLVMOpInfoSymbol1) AddSymbol}. */
    public static void nAddSymbol(long struct, LLVMOpInfoSymbol1 value) { memCopy(value.address(), struct + LLVMOpInfo1.ADDSYMBOL, LLVMOpInfoSymbol1.SIZEOF); }
    /** Unsafe version of {@link #SubtractSymbol(LLVMOpInfoSymbol1) SubtractSymbol}. */
    public static void nSubtractSymbol(long struct, LLVMOpInfoSymbol1 value) { memCopy(value.address(), struct + LLVMOpInfo1.SUBTRACTSYMBOL, LLVMOpInfoSymbol1.SIZEOF); }
    /** Unsafe version of {@link #Value(long) Value}. */
    public static void nValue(long struct, long value) { memPutLong(struct + LLVMOpInfo1.VALUE, value); }
    /** Unsafe version of {@link #VariantKind(long) VariantKind}. */
    public static void nVariantKind(long struct, long value) { memPutLong(struct + LLVMOpInfo1.VARIANTKIND, value); }

    // -----------------------------------

    /** An array of {@link LLVMOpInfo1} structs. */
    public static class Buffer extends StructBuffer<LLVMOpInfo1, Buffer> implements NativeResource {

        private static final LLVMOpInfo1 ELEMENT_FACTORY = LLVMOpInfo1.create(-1L);

        /**
         * Creates a new {@code LLVMOpInfo1.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LLVMOpInfo1#SIZEOF}, and its mark will be undefined.</p>
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
        protected LLVMOpInfo1 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link LLVMOpInfoSymbol1} view of the {@code AddSymbol} field. */
        @NativeType("struct LLVMOpInfoSymbol1")
        public LLVMOpInfoSymbol1 AddSymbol() { return LLVMOpInfo1.nAddSymbol(address()); }
        /** @return a {@link LLVMOpInfoSymbol1} view of the {@code SubtractSymbol} field. */
        @NativeType("struct LLVMOpInfoSymbol1")
        public LLVMOpInfoSymbol1 SubtractSymbol() { return LLVMOpInfo1.nSubtractSymbol(address()); }
        /** @return the value of the {@code Value} field. */
        @NativeType("uint64_t")
        public long Value() { return LLVMOpInfo1.nValue(address()); }
        /** @return the value of the {@code VariantKind} field. */
        @NativeType("uint64_t")
        public long VariantKind() { return LLVMOpInfo1.nVariantKind(address()); }

        /** Copies the specified {@link LLVMOpInfoSymbol1} to the {@code AddSymbol} field. */
        public LLVMOpInfo1.Buffer AddSymbol(@NativeType("struct LLVMOpInfoSymbol1") LLVMOpInfoSymbol1 value) { LLVMOpInfo1.nAddSymbol(address(), value); return this; }
        /** Passes the {@code AddSymbol} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LLVMOpInfo1.Buffer AddSymbol(java.util.function.Consumer<LLVMOpInfoSymbol1> consumer) { consumer.accept(AddSymbol()); return this; }
        /** Copies the specified {@link LLVMOpInfoSymbol1} to the {@code SubtractSymbol} field. */
        public LLVMOpInfo1.Buffer SubtractSymbol(@NativeType("struct LLVMOpInfoSymbol1") LLVMOpInfoSymbol1 value) { LLVMOpInfo1.nSubtractSymbol(address(), value); return this; }
        /** Passes the {@code SubtractSymbol} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LLVMOpInfo1.Buffer SubtractSymbol(java.util.function.Consumer<LLVMOpInfoSymbol1> consumer) { consumer.accept(SubtractSymbol()); return this; }
        /** Sets the specified value to the {@code Value} field. */
        public LLVMOpInfo1.Buffer Value(@NativeType("uint64_t") long value) { LLVMOpInfo1.nValue(address(), value); return this; }
        /** Sets the specified value to the {@code VariantKind} field. */
        public LLVMOpInfo1.Buffer VariantKind(@NativeType("uint64_t") long value) { LLVMOpInfo1.nVariantKind(address(), value); return this; }

    }

}