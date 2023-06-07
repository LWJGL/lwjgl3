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
 * struct LLVMOrcCSymbolMapPair {
 *     LLVMOrcSymbolStringPoolEntryRef Name;
 *     {@link LLVMJITEvaluatedSymbol LLVMJITEvaluatedSymbol} Sym;
 * }</code></pre>
 */
public class LLVMOrcCSymbolMapPair extends Struct<LLVMOrcCSymbolMapPair> implements NativeResource {

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

    protected LLVMOrcCSymbolMapPair(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected LLVMOrcCSymbolMapPair create(long address, @Nullable ByteBuffer container) {
        return new LLVMOrcCSymbolMapPair(address, container);
    }

    /**
     * Creates a {@code LLVMOrcCSymbolMapPair} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LLVMOrcCSymbolMapPair(ByteBuffer container) {
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
    public LLVMOrcCSymbolMapPair Name(@NativeType("LLVMOrcSymbolStringPoolEntryRef") long value) { nName(address(), value); return this; }
    /** Copies the specified {@link LLVMJITEvaluatedSymbol} to the {@code Sym} field. */
    public LLVMOrcCSymbolMapPair Sym(LLVMJITEvaluatedSymbol value) { nSym(address(), value); return this; }
    /** Passes the {@code Sym} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LLVMOrcCSymbolMapPair Sym(java.util.function.Consumer<LLVMJITEvaluatedSymbol> consumer) { consumer.accept(Sym()); return this; }

    /** Initializes this struct with the specified values. */
    public LLVMOrcCSymbolMapPair set(
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
    public LLVMOrcCSymbolMapPair set(LLVMOrcCSymbolMapPair src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LLVMOrcCSymbolMapPair} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LLVMOrcCSymbolMapPair malloc() {
        return new LLVMOrcCSymbolMapPair(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code LLVMOrcCSymbolMapPair} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LLVMOrcCSymbolMapPair calloc() {
        return new LLVMOrcCSymbolMapPair(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code LLVMOrcCSymbolMapPair} instance allocated with {@link BufferUtils}. */
    public static LLVMOrcCSymbolMapPair create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new LLVMOrcCSymbolMapPair(memAddress(container), container);
    }

    /** Returns a new {@code LLVMOrcCSymbolMapPair} instance for the specified memory address. */
    public static LLVMOrcCSymbolMapPair create(long address) {
        return new LLVMOrcCSymbolMapPair(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMOrcCSymbolMapPair createSafe(long address) {
        return address == NULL ? null : new LLVMOrcCSymbolMapPair(address, null);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolMapPair.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolMapPair.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolMapPair.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolMapPair.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolMapPair.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolMapPair.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link LLVMOrcCSymbolMapPair.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolMapPair.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMOrcCSymbolMapPair.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code LLVMOrcCSymbolMapPair} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMOrcCSymbolMapPair malloc(MemoryStack stack) {
        return new LLVMOrcCSymbolMapPair(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code LLVMOrcCSymbolMapPair} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMOrcCSymbolMapPair calloc(MemoryStack stack) {
        return new LLVMOrcCSymbolMapPair(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolMapPair.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolMapPair.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolMapPair.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolMapPair.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Name}. */
    public static long nName(long struct) { return memGetAddress(struct + LLVMOrcCSymbolMapPair.NAME); }
    /** Unsafe version of {@link #Sym}. */
    public static LLVMJITEvaluatedSymbol nSym(long struct) { return LLVMJITEvaluatedSymbol.create(struct + LLVMOrcCSymbolMapPair.SYM); }

    /** Unsafe version of {@link #Name(long) Name}. */
    public static void nName(long struct, long value) { memPutAddress(struct + LLVMOrcCSymbolMapPair.NAME, check(value)); }
    /** Unsafe version of {@link #Sym(LLVMJITEvaluatedSymbol) Sym}. */
    public static void nSym(long struct, LLVMJITEvaluatedSymbol value) { memCopy(value.address(), struct + LLVMOrcCSymbolMapPair.SYM, LLVMJITEvaluatedSymbol.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + LLVMOrcCSymbolMapPair.NAME));
    }

    // -----------------------------------

    /** An array of {@link LLVMOrcCSymbolMapPair} structs. */
    public static class Buffer extends StructBuffer<LLVMOrcCSymbolMapPair, Buffer> implements NativeResource {

        private static final LLVMOrcCSymbolMapPair ELEMENT_FACTORY = LLVMOrcCSymbolMapPair.create(-1L);

        /**
         * Creates a new {@code LLVMOrcCSymbolMapPair.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LLVMOrcCSymbolMapPair#SIZEOF}, and its mark will be undefined.</p>
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
        protected LLVMOrcCSymbolMapPair getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code Name} field. */
        @NativeType("LLVMOrcSymbolStringPoolEntryRef")
        public long Name() { return LLVMOrcCSymbolMapPair.nName(address()); }
        /** @return a {@link LLVMJITEvaluatedSymbol} view of the {@code Sym} field. */
        public LLVMJITEvaluatedSymbol Sym() { return LLVMOrcCSymbolMapPair.nSym(address()); }

        /** Sets the specified value to the {@code Name} field. */
        public LLVMOrcCSymbolMapPair.Buffer Name(@NativeType("LLVMOrcSymbolStringPoolEntryRef") long value) { LLVMOrcCSymbolMapPair.nName(address(), value); return this; }
        /** Copies the specified {@link LLVMJITEvaluatedSymbol} to the {@code Sym} field. */
        public LLVMOrcCSymbolMapPair.Buffer Sym(LLVMJITEvaluatedSymbol value) { LLVMOrcCSymbolMapPair.nSym(address(), value); return this; }
        /** Passes the {@code Sym} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LLVMOrcCSymbolMapPair.Buffer Sym(java.util.function.Consumer<LLVMJITEvaluatedSymbol> consumer) { consumer.accept(Sym()); return this; }

    }

}