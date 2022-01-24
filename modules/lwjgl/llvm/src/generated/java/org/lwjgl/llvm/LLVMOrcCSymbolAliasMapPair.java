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
 * Represents a pair of a symbol name and {@code SymbolAliasMapEntry}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct LLVMOrcCSymbolAliasMapPair {
 *     LLVMOrcSymbolStringPoolEntryRef Name;
 *     {@link LLVMOrcCSymbolAliasMapEntry LLVMOrcCSymbolAliasMapEntry} Entry;
 * }</code></pre>
 */
public class LLVMOrcCSymbolAliasMapPair extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        ENTRY;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(LLVMOrcCSymbolAliasMapEntry.SIZEOF, LLVMOrcCSymbolAliasMapEntry.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        ENTRY = layout.offsetof(1);
    }

    /**
     * Creates a {@code LLVMOrcCSymbolAliasMapPair} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LLVMOrcCSymbolAliasMapPair(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code Name} field. */
    @NativeType("LLVMOrcSymbolStringPoolEntryRef")
    public long Name() { return nName(address()); }
    /** @return a {@link LLVMOrcCSymbolAliasMapEntry} view of the {@code Entry} field. */
    public LLVMOrcCSymbolAliasMapEntry Entry() { return nEntry(address()); }

    /** Sets the specified value to the {@code Name} field. */
    public LLVMOrcCSymbolAliasMapPair Name(@NativeType("LLVMOrcSymbolStringPoolEntryRef") long value) { nName(address(), value); return this; }
    /** Copies the specified {@link LLVMOrcCSymbolAliasMapEntry} to the {@code Entry} field. */
    public LLVMOrcCSymbolAliasMapPair Entry(LLVMOrcCSymbolAliasMapEntry value) { nEntry(address(), value); return this; }
    /** Passes the {@code Entry} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LLVMOrcCSymbolAliasMapPair Entry(java.util.function.Consumer<LLVMOrcCSymbolAliasMapEntry> consumer) { consumer.accept(Entry()); return this; }

    /** Initializes this struct with the specified values. */
    public LLVMOrcCSymbolAliasMapPair set(
        long Name,
        LLVMOrcCSymbolAliasMapEntry Entry
    ) {
        Name(Name);
        Entry(Entry);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LLVMOrcCSymbolAliasMapPair set(LLVMOrcCSymbolAliasMapPair src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LLVMOrcCSymbolAliasMapPair} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LLVMOrcCSymbolAliasMapPair malloc() {
        return wrap(LLVMOrcCSymbolAliasMapPair.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code LLVMOrcCSymbolAliasMapPair} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LLVMOrcCSymbolAliasMapPair calloc() {
        return wrap(LLVMOrcCSymbolAliasMapPair.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code LLVMOrcCSymbolAliasMapPair} instance allocated with {@link BufferUtils}. */
    public static LLVMOrcCSymbolAliasMapPair create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(LLVMOrcCSymbolAliasMapPair.class, memAddress(container), container);
    }

    /** Returns a new {@code LLVMOrcCSymbolAliasMapPair} instance for the specified memory address. */
    public static LLVMOrcCSymbolAliasMapPair create(long address) {
        return wrap(LLVMOrcCSymbolAliasMapPair.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMOrcCSymbolAliasMapPair createSafe(long address) {
        return address == NULL ? null : wrap(LLVMOrcCSymbolAliasMapPair.class, address);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolAliasMapPair.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolAliasMapPair.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolAliasMapPair.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolAliasMapPair.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolAliasMapPair.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolAliasMapPair.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link LLVMOrcCSymbolAliasMapPair.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolAliasMapPair.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMOrcCSymbolAliasMapPair.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code LLVMOrcCSymbolAliasMapPair} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMOrcCSymbolAliasMapPair malloc(MemoryStack stack) {
        return wrap(LLVMOrcCSymbolAliasMapPair.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code LLVMOrcCSymbolAliasMapPair} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMOrcCSymbolAliasMapPair calloc(MemoryStack stack) {
        return wrap(LLVMOrcCSymbolAliasMapPair.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolAliasMapPair.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolAliasMapPair.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolAliasMapPair.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolAliasMapPair.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Name}. */
    public static long nName(long struct) { return memGetAddress(struct + LLVMOrcCSymbolAliasMapPair.NAME); }
    /** Unsafe version of {@link #Entry}. */
    public static LLVMOrcCSymbolAliasMapEntry nEntry(long struct) { return LLVMOrcCSymbolAliasMapEntry.create(struct + LLVMOrcCSymbolAliasMapPair.ENTRY); }

    /** Unsafe version of {@link #Name(long) Name}. */
    public static void nName(long struct, long value) { memPutAddress(struct + LLVMOrcCSymbolAliasMapPair.NAME, check(value)); }
    /** Unsafe version of {@link #Entry(LLVMOrcCSymbolAliasMapEntry) Entry}. */
    public static void nEntry(long struct, LLVMOrcCSymbolAliasMapEntry value) { memCopy(value.address(), struct + LLVMOrcCSymbolAliasMapPair.ENTRY, LLVMOrcCSymbolAliasMapEntry.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + LLVMOrcCSymbolAliasMapPair.NAME));
        LLVMOrcCSymbolAliasMapEntry.validate(struct + LLVMOrcCSymbolAliasMapPair.ENTRY);
    }

    // -----------------------------------

    /** An array of {@link LLVMOrcCSymbolAliasMapPair} structs. */
    public static class Buffer extends StructBuffer<LLVMOrcCSymbolAliasMapPair, Buffer> implements NativeResource {

        private static final LLVMOrcCSymbolAliasMapPair ELEMENT_FACTORY = LLVMOrcCSymbolAliasMapPair.create(-1L);

        /**
         * Creates a new {@code LLVMOrcCSymbolAliasMapPair.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LLVMOrcCSymbolAliasMapPair#SIZEOF}, and its mark will be undefined.
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
        protected LLVMOrcCSymbolAliasMapPair getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code Name} field. */
        @NativeType("LLVMOrcSymbolStringPoolEntryRef")
        public long Name() { return LLVMOrcCSymbolAliasMapPair.nName(address()); }
        /** @return a {@link LLVMOrcCSymbolAliasMapEntry} view of the {@code Entry} field. */
        public LLVMOrcCSymbolAliasMapEntry Entry() { return LLVMOrcCSymbolAliasMapPair.nEntry(address()); }

        /** Sets the specified value to the {@code Name} field. */
        public LLVMOrcCSymbolAliasMapPair.Buffer Name(@NativeType("LLVMOrcSymbolStringPoolEntryRef") long value) { LLVMOrcCSymbolAliasMapPair.nName(address(), value); return this; }
        /** Copies the specified {@link LLVMOrcCSymbolAliasMapEntry} to the {@code Entry} field. */
        public LLVMOrcCSymbolAliasMapPair.Buffer Entry(LLVMOrcCSymbolAliasMapEntry value) { LLVMOrcCSymbolAliasMapPair.nEntry(address(), value); return this; }
        /** Passes the {@code Entry} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LLVMOrcCSymbolAliasMapPair.Buffer Entry(java.util.function.Consumer<LLVMOrcCSymbolAliasMapEntry> consumer) { consumer.accept(Entry()); return this; }

    }

}