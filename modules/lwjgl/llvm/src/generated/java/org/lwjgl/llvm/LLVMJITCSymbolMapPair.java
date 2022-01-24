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
 * Represents a pair of a symbol name and an evaluated symbol.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct LLVMJITCSymbolMapPair {
 *     LLVMOrcSymbolStringPoolEntryRef Name;
 *     {@link LLVMJITEvaluatedSymbol LLVMJITEvaluatedSymbol} Sym;
 * }</code></pre>
 */
public class LLVMJITCSymbolMapPair extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        SYM;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(LLVMJITEvaluatedSymbol.SIZEOF, LLVMJITEvaluatedSymbol.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        SYM = layout.offsetof(1);
    }

    /**
     * Creates a {@code LLVMJITCSymbolMapPair} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LLVMJITCSymbolMapPair(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code Name} field. */
    @NativeType("LLVMOrcSymbolStringPoolEntryRef")
    public long Name() { return nName(address()); }
    /** @return a {@link LLVMJITEvaluatedSymbol} view of the {@code Sym} field. */
    public LLVMJITEvaluatedSymbol Sym() { return nSym(address()); }

    /** Sets the specified value to the {@code Name} field. */
    public LLVMJITCSymbolMapPair Name(@NativeType("LLVMOrcSymbolStringPoolEntryRef") long value) { nName(address(), value); return this; }
    /** Copies the specified {@link LLVMJITEvaluatedSymbol} to the {@code Sym} field. */
    public LLVMJITCSymbolMapPair Sym(LLVMJITEvaluatedSymbol value) { nSym(address(), value); return this; }
    /** Passes the {@code Sym} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LLVMJITCSymbolMapPair Sym(java.util.function.Consumer<LLVMJITEvaluatedSymbol> consumer) { consumer.accept(Sym()); return this; }

    /** Initializes this struct with the specified values. */
    public LLVMJITCSymbolMapPair set(
        long Name,
        LLVMJITEvaluatedSymbol Sym
    ) {
        Name(Name);
        Sym(Sym);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LLVMJITCSymbolMapPair set(LLVMJITCSymbolMapPair src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LLVMJITCSymbolMapPair} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LLVMJITCSymbolMapPair malloc() {
        return wrap(LLVMJITCSymbolMapPair.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code LLVMJITCSymbolMapPair} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LLVMJITCSymbolMapPair calloc() {
        return wrap(LLVMJITCSymbolMapPair.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code LLVMJITCSymbolMapPair} instance allocated with {@link BufferUtils}. */
    public static LLVMJITCSymbolMapPair create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(LLVMJITCSymbolMapPair.class, memAddress(container), container);
    }

    /** Returns a new {@code LLVMJITCSymbolMapPair} instance for the specified memory address. */
    public static LLVMJITCSymbolMapPair create(long address) {
        return wrap(LLVMJITCSymbolMapPair.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMJITCSymbolMapPair createSafe(long address) {
        return address == NULL ? null : wrap(LLVMJITCSymbolMapPair.class, address);
    }

    /**
     * Returns a new {@link LLVMJITCSymbolMapPair.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMJITCSymbolMapPair.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LLVMJITCSymbolMapPair.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMJITCSymbolMapPair.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMJITCSymbolMapPair.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMJITCSymbolMapPair.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link LLVMJITCSymbolMapPair.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LLVMJITCSymbolMapPair.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMJITCSymbolMapPair.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code LLVMJITCSymbolMapPair} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMJITCSymbolMapPair malloc(MemoryStack stack) {
        return wrap(LLVMJITCSymbolMapPair.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code LLVMJITCSymbolMapPair} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMJITCSymbolMapPair calloc(MemoryStack stack) {
        return wrap(LLVMJITCSymbolMapPair.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link LLVMJITCSymbolMapPair.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMJITCSymbolMapPair.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMJITCSymbolMapPair.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMJITCSymbolMapPair.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Name}. */
    public static long nName(long struct) { return memGetAddress(struct + LLVMJITCSymbolMapPair.NAME); }
    /** Unsafe version of {@link #Sym}. */
    public static LLVMJITEvaluatedSymbol nSym(long struct) { return LLVMJITEvaluatedSymbol.create(struct + LLVMJITCSymbolMapPair.SYM); }

    /** Unsafe version of {@link #Name(long) Name}. */
    public static void nName(long struct, long value) { memPutAddress(struct + LLVMJITCSymbolMapPair.NAME, check(value)); }
    /** Unsafe version of {@link #Sym(LLVMJITEvaluatedSymbol) Sym}. */
    public static void nSym(long struct, LLVMJITEvaluatedSymbol value) { memCopy(value.address(), struct + LLVMJITCSymbolMapPair.SYM, LLVMJITEvaluatedSymbol.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + LLVMJITCSymbolMapPair.NAME));
    }

    // -----------------------------------

    /** An array of {@link LLVMJITCSymbolMapPair} structs. */
    public static class Buffer extends StructBuffer<LLVMJITCSymbolMapPair, Buffer> implements NativeResource {

        private static final LLVMJITCSymbolMapPair ELEMENT_FACTORY = LLVMJITCSymbolMapPair.create(-1L);

        /**
         * Creates a new {@code LLVMJITCSymbolMapPair.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LLVMJITCSymbolMapPair#SIZEOF}, and its mark will be undefined.
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
        protected LLVMJITCSymbolMapPair getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code Name} field. */
        @NativeType("LLVMOrcSymbolStringPoolEntryRef")
        public long Name() { return LLVMJITCSymbolMapPair.nName(address()); }
        /** @return a {@link LLVMJITEvaluatedSymbol} view of the {@code Sym} field. */
        public LLVMJITEvaluatedSymbol Sym() { return LLVMJITCSymbolMapPair.nSym(address()); }

        /** Sets the specified value to the {@code Name} field. */
        public LLVMJITCSymbolMapPair.Buffer Name(@NativeType("LLVMOrcSymbolStringPoolEntryRef") long value) { LLVMJITCSymbolMapPair.nName(address(), value); return this; }
        /** Copies the specified {@link LLVMJITEvaluatedSymbol} to the {@code Sym} field. */
        public LLVMJITCSymbolMapPair.Buffer Sym(LLVMJITEvaluatedSymbol value) { LLVMJITCSymbolMapPair.nSym(address(), value); return this; }
        /** Passes the {@code Sym} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LLVMJITCSymbolMapPair.Buffer Sym(java.util.function.Consumer<LLVMJITEvaluatedSymbol> consumer) { consumer.accept(Sym()); return this; }

    }

}