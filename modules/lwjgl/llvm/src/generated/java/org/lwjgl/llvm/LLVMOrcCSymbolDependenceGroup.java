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
 * struct LLVMOrcCSymbolDependenceGroup {
 *     {@link LLVMOrcCSymbolsList LLVMOrcCSymbolsList} Symbols;
 *     {@link LLVMOrcCDependenceMapPair LLVMOrcCDependenceMapPair}s Dependencies;
 *     size_t NumDependencies;
 * }}</pre>
 */
public class LLVMOrcCSymbolDependenceGroup extends Struct<LLVMOrcCSymbolDependenceGroup> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SYMBOLS,
        DEPENDENCIES,
        NUMDEPENDENCIES;

    static {
        Layout layout = __struct(
            __member(LLVMOrcCSymbolsList.SIZEOF, LLVMOrcCSymbolsList.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SYMBOLS = layout.offsetof(0);
        DEPENDENCIES = layout.offsetof(1);
        NUMDEPENDENCIES = layout.offsetof(2);
    }

    protected LLVMOrcCSymbolDependenceGroup(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected LLVMOrcCSymbolDependenceGroup create(long address, @Nullable ByteBuffer container) {
        return new LLVMOrcCSymbolDependenceGroup(address, container);
    }

    /**
     * Creates a {@code LLVMOrcCSymbolDependenceGroup} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LLVMOrcCSymbolDependenceGroup(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link LLVMOrcCSymbolsList} view of the {@code Symbols} field. */
    public LLVMOrcCSymbolsList Symbols() { return nSymbols(address()); }
    /** @return a {@link LLVMOrcCDependenceMapPair.Buffer} view of the struct array pointed to by the {@code Dependencies} field. */
    @NativeType("LLVMOrcCDependenceMapPairs")
    public LLVMOrcCDependenceMapPair.Buffer Dependencies() { return nDependencies(address()); }
    /** @return the value of the {@code NumDependencies} field. */
    @NativeType("size_t")
    public long NumDependencies() { return nNumDependencies(address()); }

    /** Copies the specified {@link LLVMOrcCSymbolsList} to the {@code Symbols} field. */
    public LLVMOrcCSymbolDependenceGroup Symbols(LLVMOrcCSymbolsList value) { nSymbols(address(), value); return this; }
    /** Passes the {@code Symbols} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LLVMOrcCSymbolDependenceGroup Symbols(java.util.function.Consumer<LLVMOrcCSymbolsList> consumer) { consumer.accept(Symbols()); return this; }
    /** Sets the address of the specified {@link LLVMOrcCDependenceMapPair.Buffer} to the {@code Dependencies} field. */
    public LLVMOrcCSymbolDependenceGroup Dependencies(@NativeType("LLVMOrcCDependenceMapPairs") LLVMOrcCDependenceMapPair.Buffer value) { nDependencies(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public LLVMOrcCSymbolDependenceGroup set(
        LLVMOrcCSymbolsList Symbols,
        LLVMOrcCDependenceMapPair.Buffer Dependencies
    ) {
        Symbols(Symbols);
        Dependencies(Dependencies);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LLVMOrcCSymbolDependenceGroup set(LLVMOrcCSymbolDependenceGroup src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LLVMOrcCSymbolDependenceGroup} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LLVMOrcCSymbolDependenceGroup malloc() {
        return new LLVMOrcCSymbolDependenceGroup(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code LLVMOrcCSymbolDependenceGroup} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LLVMOrcCSymbolDependenceGroup calloc() {
        return new LLVMOrcCSymbolDependenceGroup(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code LLVMOrcCSymbolDependenceGroup} instance allocated with {@link BufferUtils}. */
    public static LLVMOrcCSymbolDependenceGroup create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new LLVMOrcCSymbolDependenceGroup(memAddress(container), container);
    }

    /** Returns a new {@code LLVMOrcCSymbolDependenceGroup} instance for the specified memory address. */
    public static LLVMOrcCSymbolDependenceGroup create(long address) {
        return new LLVMOrcCSymbolDependenceGroup(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable LLVMOrcCSymbolDependenceGroup createSafe(long address) {
        return address == NULL ? null : new LLVMOrcCSymbolDependenceGroup(address, null);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolDependenceGroup.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolDependenceGroup.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolDependenceGroup.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolDependenceGroup.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolDependenceGroup.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolDependenceGroup.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link LLVMOrcCSymbolDependenceGroup.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolDependenceGroup.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static LLVMOrcCSymbolDependenceGroup.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code LLVMOrcCSymbolDependenceGroup} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMOrcCSymbolDependenceGroup malloc(MemoryStack stack) {
        return new LLVMOrcCSymbolDependenceGroup(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code LLVMOrcCSymbolDependenceGroup} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMOrcCSymbolDependenceGroup calloc(MemoryStack stack) {
        return new LLVMOrcCSymbolDependenceGroup(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolDependenceGroup.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolDependenceGroup.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolDependenceGroup.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolDependenceGroup.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Symbols}. */
    public static LLVMOrcCSymbolsList nSymbols(long struct) { return LLVMOrcCSymbolsList.create(struct + LLVMOrcCSymbolDependenceGroup.SYMBOLS); }
    /** Unsafe version of {@link #Dependencies}. */
    public static LLVMOrcCDependenceMapPair.Buffer nDependencies(long struct) { return LLVMOrcCDependenceMapPair.create(memGetAddress(struct + LLVMOrcCSymbolDependenceGroup.DEPENDENCIES), (int)nNumDependencies(struct)); }
    /** Unsafe version of {@link #NumDependencies}. */
    public static long nNumDependencies(long struct) { return memGetAddress(struct + LLVMOrcCSymbolDependenceGroup.NUMDEPENDENCIES); }

    /** Unsafe version of {@link #Symbols(LLVMOrcCSymbolsList) Symbols}. */
    public static void nSymbols(long struct, LLVMOrcCSymbolsList value) { memCopy(value.address(), struct + LLVMOrcCSymbolDependenceGroup.SYMBOLS, LLVMOrcCSymbolsList.SIZEOF); }
    /** Unsafe version of {@link #Dependencies(LLVMOrcCDependenceMapPair.Buffer) Dependencies}. */
    public static void nDependencies(long struct, LLVMOrcCDependenceMapPair.Buffer value) { memPutAddress(struct + LLVMOrcCSymbolDependenceGroup.DEPENDENCIES, value.address()); nNumDependencies(struct, value.remaining()); }
    /** Sets the specified value to the {@code NumDependencies} field of the specified {@code struct}. */
    public static void nNumDependencies(long struct, long value) { memPutAddress(struct + LLVMOrcCSymbolDependenceGroup.NUMDEPENDENCIES, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        LLVMOrcCSymbolsList.validate(struct + LLVMOrcCSymbolDependenceGroup.SYMBOLS);
        long NumDependencies = nNumDependencies(struct);
        long Dependencies = memGetAddress(struct + LLVMOrcCSymbolDependenceGroup.DEPENDENCIES);
        check(Dependencies);
        validate(Dependencies, NumDependencies, LLVMOrcCDependenceMapPair.SIZEOF, LLVMOrcCDependenceMapPair::validate);
    }

    // -----------------------------------

    /** An array of {@link LLVMOrcCSymbolDependenceGroup} structs. */
    public static class Buffer extends StructBuffer<LLVMOrcCSymbolDependenceGroup, Buffer> implements NativeResource {

        private static final LLVMOrcCSymbolDependenceGroup ELEMENT_FACTORY = LLVMOrcCSymbolDependenceGroup.create(-1L);

        /**
         * Creates a new {@code LLVMOrcCSymbolDependenceGroup.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LLVMOrcCSymbolDependenceGroup#SIZEOF}, and its mark will be undefined.</p>
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
        protected LLVMOrcCSymbolDependenceGroup getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link LLVMOrcCSymbolsList} view of the {@code Symbols} field. */
        public LLVMOrcCSymbolsList Symbols() { return LLVMOrcCSymbolDependenceGroup.nSymbols(address()); }
        /** @return a {@link LLVMOrcCDependenceMapPair.Buffer} view of the struct array pointed to by the {@code Dependencies} field. */
        @NativeType("LLVMOrcCDependenceMapPairs")
        public LLVMOrcCDependenceMapPair.Buffer Dependencies() { return LLVMOrcCSymbolDependenceGroup.nDependencies(address()); }
        /** @return the value of the {@code NumDependencies} field. */
        @NativeType("size_t")
        public long NumDependencies() { return LLVMOrcCSymbolDependenceGroup.nNumDependencies(address()); }

        /** Copies the specified {@link LLVMOrcCSymbolsList} to the {@code Symbols} field. */
        public LLVMOrcCSymbolDependenceGroup.Buffer Symbols(LLVMOrcCSymbolsList value) { LLVMOrcCSymbolDependenceGroup.nSymbols(address(), value); return this; }
        /** Passes the {@code Symbols} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LLVMOrcCSymbolDependenceGroup.Buffer Symbols(java.util.function.Consumer<LLVMOrcCSymbolsList> consumer) { consumer.accept(Symbols()); return this; }
        /** Sets the address of the specified {@link LLVMOrcCDependenceMapPair.Buffer} to the {@code Dependencies} field. */
        public LLVMOrcCSymbolDependenceGroup.Buffer Dependencies(@NativeType("LLVMOrcCDependenceMapPairs") LLVMOrcCDependenceMapPair.Buffer value) { LLVMOrcCSymbolDependenceGroup.nDependencies(address(), value); return this; }

    }

}