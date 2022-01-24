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
 * Represents a list of {@code LLVMOrcSymbolStringPoolEntryRef} and the associated length.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct LLVMOrcCSymbolsList {
 *     LLVMOrcSymbolStringPoolEntryRef * Symbols;
 *     size_t Length;
 * }</code></pre>
 */
public class LLVMOrcCSymbolsList extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SYMBOLS,
        LENGTH;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SYMBOLS = layout.offsetof(0);
        LENGTH = layout.offsetof(1);
    }

    /**
     * Creates a {@code LLVMOrcCSymbolsList} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LLVMOrcCSymbolsList(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code Symbols} field. */
    @NativeType("LLVMOrcSymbolStringPoolEntryRef *")
    public PointerBuffer Symbols() { return nSymbols(address()); }
    /** @return the value of the {@code Length} field. */
    @NativeType("size_t")
    public long Length() { return nLength(address()); }

    /** Sets the address of the specified {@link PointerBuffer} to the {@code Symbols} field. */
    public LLVMOrcCSymbolsList Symbols(@NativeType("LLVMOrcSymbolStringPoolEntryRef *") PointerBuffer value) { nSymbols(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LLVMOrcCSymbolsList set(LLVMOrcCSymbolsList src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LLVMOrcCSymbolsList} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LLVMOrcCSymbolsList malloc() {
        return wrap(LLVMOrcCSymbolsList.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code LLVMOrcCSymbolsList} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LLVMOrcCSymbolsList calloc() {
        return wrap(LLVMOrcCSymbolsList.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code LLVMOrcCSymbolsList} instance allocated with {@link BufferUtils}. */
    public static LLVMOrcCSymbolsList create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(LLVMOrcCSymbolsList.class, memAddress(container), container);
    }

    /** Returns a new {@code LLVMOrcCSymbolsList} instance for the specified memory address. */
    public static LLVMOrcCSymbolsList create(long address) {
        return wrap(LLVMOrcCSymbolsList.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMOrcCSymbolsList createSafe(long address) {
        return address == NULL ? null : wrap(LLVMOrcCSymbolsList.class, address);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolsList.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolsList.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolsList.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolsList.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolsList.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolsList.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link LLVMOrcCSymbolsList.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolsList.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMOrcCSymbolsList.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code LLVMOrcCSymbolsList} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMOrcCSymbolsList malloc(MemoryStack stack) {
        return wrap(LLVMOrcCSymbolsList.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code LLVMOrcCSymbolsList} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMOrcCSymbolsList calloc(MemoryStack stack) {
        return wrap(LLVMOrcCSymbolsList.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolsList.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolsList.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolsList.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolsList.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Symbols() Symbols}. */
    public static PointerBuffer nSymbols(long struct) { return memPointerBuffer(memGetAddress(struct + LLVMOrcCSymbolsList.SYMBOLS), (int)nLength(struct)); }
    /** Unsafe version of {@link #Length}. */
    public static long nLength(long struct) { return memGetAddress(struct + LLVMOrcCSymbolsList.LENGTH); }

    /** Unsafe version of {@link #Symbols(PointerBuffer) Symbols}. */
    public static void nSymbols(long struct, PointerBuffer value) { memPutAddress(struct + LLVMOrcCSymbolsList.SYMBOLS, memAddress(value)); nLength(struct, value.remaining()); }
    /** Sets the specified value to the {@code Length} field of the specified {@code struct}. */
    public static void nLength(long struct, long value) { memPutAddress(struct + LLVMOrcCSymbolsList.LENGTH, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + LLVMOrcCSymbolsList.SYMBOLS));
    }

    // -----------------------------------

    /** An array of {@link LLVMOrcCSymbolsList} structs. */
    public static class Buffer extends StructBuffer<LLVMOrcCSymbolsList, Buffer> implements NativeResource {

        private static final LLVMOrcCSymbolsList ELEMENT_FACTORY = LLVMOrcCSymbolsList.create(-1L);

        /**
         * Creates a new {@code LLVMOrcCSymbolsList.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LLVMOrcCSymbolsList#SIZEOF}, and its mark will be undefined.
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
        protected LLVMOrcCSymbolsList getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code Symbols} field. */
        @NativeType("LLVMOrcSymbolStringPoolEntryRef *")
        public PointerBuffer Symbols() { return LLVMOrcCSymbolsList.nSymbols(address()); }
        /** @return the value of the {@code Length} field. */
        @NativeType("size_t")
        public long Length() { return LLVMOrcCSymbolsList.nLength(address()); }

        /** Sets the address of the specified {@link PointerBuffer} to the {@code Symbols} field. */
        public LLVMOrcCSymbolsList.Buffer Symbols(@NativeType("LLVMOrcSymbolStringPoolEntryRef *") PointerBuffer value) { LLVMOrcCSymbolsList.nSymbols(address(), value); return this; }

    }

}