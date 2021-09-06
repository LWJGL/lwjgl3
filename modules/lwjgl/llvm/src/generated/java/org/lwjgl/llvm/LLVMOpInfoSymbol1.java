/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The initial support in LLVM MC for the most general form of a relocatable expression is "AddSymbol - SubtractSymbol + Offset". For some Darwin targets
 * this full form is encoded in the relocation information so that {@code AddSymbol} and {@code SubtractSymbol} can be link edited independent of each
 * other. Many other platforms only allow a relocatable expression of the form {@code AddSymbol + Offset} to be encoded.
 * 
 * <p>The {@code LLVMOpInfoCallback()} for the {@code TagType} value of 1 uses the struct {@code LLVMOpInfo1}. The value of the relocatable expression for
 * the operand, including any {@code PC} adjustment, is passed in to the call back in the {@code Value} field. The symbolic information about the operand
 * is returned using all the fields of the structure with the Offset of the relocatable expression returned in the {@code Value} field. It is possible
 * that some symbols in the relocatable expression were assembly temporary symbols, for example "Ldata - LpicBase + constant", and only the Values of the
 * symbols without symbol names are present in the relocation information. The {@code VariantKind} type is one of the {@code Target} specific
 * {@code #defines} below and is used to print operands like "_foo GOT ", ":lower16:_foo", etc.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct LLVMOpInfoSymbol1 {
 *     uint64_t {@link #Present};
 *     char const * {@link #Name};
 *     uint64_t {@link #Value};
 * }</code></pre>
 */
@NativeType("struct LLVMOpInfoSymbol1")
public class LLVMOpInfoSymbol1 extends Struct implements NativeResource {

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

    /** 1 if this symbol is present */
    @NativeType("uint64_t")
    public long Present() { return nPresent(address()); }
    /** symbol name if not {@code NULL} */
    @Nullable
    @NativeType("char const *")
    public ByteBuffer Name() { return nName(address()); }
    /** symbol name if not {@code NULL} */
    @Nullable
    @NativeType("char const *")
    public String NameString() { return nNameString(address()); }
    /** symbol value if name is {@code NULL} */
    @NativeType("uint64_t")
    public long Value() { return nValue(address()); }

    /** Sets the specified value to the {@link #Present} field. */
    public LLVMOpInfoSymbol1 Present(@NativeType("uint64_t") long value) { nPresent(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #Name} field. */
    public LLVMOpInfoSymbol1 Name(@Nullable @NativeType("char const *") ByteBuffer value) { nName(address(), value); return this; }
    /** Sets the specified value to the {@link #Value} field. */
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
        return wrap(LLVMOpInfoSymbol1.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code LLVMOpInfoSymbol1} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LLVMOpInfoSymbol1 calloc() {
        return wrap(LLVMOpInfoSymbol1.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code LLVMOpInfoSymbol1} instance allocated with {@link BufferUtils}. */
    public static LLVMOpInfoSymbol1 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(LLVMOpInfoSymbol1.class, memAddress(container), container);
    }

    /** Returns a new {@code LLVMOpInfoSymbol1} instance for the specified memory address. */
    public static LLVMOpInfoSymbol1 create(long address) {
        return wrap(LLVMOpInfoSymbol1.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMOpInfoSymbol1 createSafe(long address) {
        return address == NULL ? null : wrap(LLVMOpInfoSymbol1.class, address);
    }

    /**
     * Returns a new {@link LLVMOpInfoSymbol1.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOpInfoSymbol1.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LLVMOpInfoSymbol1.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOpInfoSymbol1.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMOpInfoSymbol1.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOpInfoSymbol1.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link LLVMOpInfoSymbol1.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LLVMOpInfoSymbol1.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMOpInfoSymbol1.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
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
        return wrap(LLVMOpInfoSymbol1.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code LLVMOpInfoSymbol1} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMOpInfoSymbol1 calloc(MemoryStack stack) {
        return wrap(LLVMOpInfoSymbol1.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link LLVMOpInfoSymbol1.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMOpInfoSymbol1.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMOpInfoSymbol1.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMOpInfoSymbol1.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Present}. */
    public static long nPresent(long struct) { return UNSAFE.getLong(null, struct + LLVMOpInfoSymbol1.PRESENT); }
    /** Unsafe version of {@link #Name}. */
    @Nullable public static ByteBuffer nName(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + LLVMOpInfoSymbol1.NAME)); }
    /** Unsafe version of {@link #NameString}. */
    @Nullable public static String nNameString(long struct) { return memUTF8Safe(memGetAddress(struct + LLVMOpInfoSymbol1.NAME)); }
    /** Unsafe version of {@link #Value}. */
    public static long nValue(long struct) { return UNSAFE.getLong(null, struct + LLVMOpInfoSymbol1.VALUE); }

    /** Unsafe version of {@link #Present(long) Present}. */
    public static void nPresent(long struct, long value) { UNSAFE.putLong(null, struct + LLVMOpInfoSymbol1.PRESENT, value); }
    /** Unsafe version of {@link #Name(ByteBuffer) Name}. */
    public static void nName(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + LLVMOpInfoSymbol1.NAME, memAddressSafe(value));
    }
    /** Unsafe version of {@link #Value(long) Value}. */
    public static void nValue(long struct, long value) { UNSAFE.putLong(null, struct + LLVMOpInfoSymbol1.VALUE, value); }

    // -----------------------------------

    /** An array of {@link LLVMOpInfoSymbol1} structs. */
    public static class Buffer extends StructBuffer<LLVMOpInfoSymbol1, Buffer> implements NativeResource {

        private static final LLVMOpInfoSymbol1 ELEMENT_FACTORY = LLVMOpInfoSymbol1.create(-1L);

        /**
         * Creates a new {@code LLVMOpInfoSymbol1.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LLVMOpInfoSymbol1#SIZEOF}, and its mark will be undefined.
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
        protected LLVMOpInfoSymbol1 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link LLVMOpInfoSymbol1#Present} field. */
        @NativeType("uint64_t")
        public long Present() { return LLVMOpInfoSymbol1.nPresent(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link LLVMOpInfoSymbol1#Name} field. */
        @Nullable
        @NativeType("char const *")
        public ByteBuffer Name() { return LLVMOpInfoSymbol1.nName(address()); }
        /** @return the null-terminated string pointed to by the {@link LLVMOpInfoSymbol1#Name} field. */
        @Nullable
        @NativeType("char const *")
        public String NameString() { return LLVMOpInfoSymbol1.nNameString(address()); }
        /** @return the value of the {@link LLVMOpInfoSymbol1#Value} field. */
        @NativeType("uint64_t")
        public long Value() { return LLVMOpInfoSymbol1.nValue(address()); }

        /** Sets the specified value to the {@link LLVMOpInfoSymbol1#Present} field. */
        public LLVMOpInfoSymbol1.Buffer Present(@NativeType("uint64_t") long value) { LLVMOpInfoSymbol1.nPresent(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link LLVMOpInfoSymbol1#Name} field. */
        public LLVMOpInfoSymbol1.Buffer Name(@Nullable @NativeType("char const *") ByteBuffer value) { LLVMOpInfoSymbol1.nName(address(), value); return this; }
        /** Sets the specified value to the {@link LLVMOpInfoSymbol1#Value} field. */
        public LLVMOpInfoSymbol1.Buffer Value(@NativeType("uint64_t") long value) { LLVMOpInfoSymbol1.nValue(address(), value); return this; }

    }

}