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
 * Represents a {@code SymbolAliasMapEntry}
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct LLVMOrcCSymbolAliasMapEntry {
 *     LLVMOrcSymbolStringPoolEntryRef Name;
 *     {@link LLVMJITSymbolFlags LLVMJITSymbolFlags} Flags;
 * }</code></pre>
 */
public class LLVMOrcCSymbolAliasMapEntry extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(LLVMJITSymbolFlags.SIZEOF, LLVMJITSymbolFlags.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
    }

    /**
     * Creates a {@code LLVMOrcCSymbolAliasMapEntry} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LLVMOrcCSymbolAliasMapEntry(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code Name} field. */
    @NativeType("LLVMOrcSymbolStringPoolEntryRef")
    public long Name() { return nName(address()); }
    /** @return a {@link LLVMJITSymbolFlags} view of the {@code Flags} field. */
    public LLVMJITSymbolFlags Flags() { return nFlags(address()); }

    /** Sets the specified value to the {@code Name} field. */
    public LLVMOrcCSymbolAliasMapEntry Name(@NativeType("LLVMOrcSymbolStringPoolEntryRef") long value) { nName(address(), value); return this; }
    /** Copies the specified {@link LLVMJITSymbolFlags} to the {@code Flags} field. */
    public LLVMOrcCSymbolAliasMapEntry Flags(LLVMJITSymbolFlags value) { nFlags(address(), value); return this; }
    /** Passes the {@code Flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LLVMOrcCSymbolAliasMapEntry Flags(java.util.function.Consumer<LLVMJITSymbolFlags> consumer) { consumer.accept(Flags()); return this; }

    /** Initializes this struct with the specified values. */
    public LLVMOrcCSymbolAliasMapEntry set(
        long Name,
        LLVMJITSymbolFlags Flags
    ) {
        Name(Name);
        Flags(Flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LLVMOrcCSymbolAliasMapEntry set(LLVMOrcCSymbolAliasMapEntry src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LLVMOrcCSymbolAliasMapEntry} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LLVMOrcCSymbolAliasMapEntry malloc() {
        return wrap(LLVMOrcCSymbolAliasMapEntry.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code LLVMOrcCSymbolAliasMapEntry} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LLVMOrcCSymbolAliasMapEntry calloc() {
        return wrap(LLVMOrcCSymbolAliasMapEntry.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code LLVMOrcCSymbolAliasMapEntry} instance allocated with {@link BufferUtils}. */
    public static LLVMOrcCSymbolAliasMapEntry create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(LLVMOrcCSymbolAliasMapEntry.class, memAddress(container), container);
    }

    /** Returns a new {@code LLVMOrcCSymbolAliasMapEntry} instance for the specified memory address. */
    public static LLVMOrcCSymbolAliasMapEntry create(long address) {
        return wrap(LLVMOrcCSymbolAliasMapEntry.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMOrcCSymbolAliasMapEntry createSafe(long address) {
        return address == NULL ? null : wrap(LLVMOrcCSymbolAliasMapEntry.class, address);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolAliasMapEntry.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolAliasMapEntry.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolAliasMapEntry.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolAliasMapEntry.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolAliasMapEntry.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolAliasMapEntry.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link LLVMOrcCSymbolAliasMapEntry.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolAliasMapEntry.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMOrcCSymbolAliasMapEntry.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code LLVMOrcCSymbolAliasMapEntry} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMOrcCSymbolAliasMapEntry malloc(MemoryStack stack) {
        return wrap(LLVMOrcCSymbolAliasMapEntry.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code LLVMOrcCSymbolAliasMapEntry} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMOrcCSymbolAliasMapEntry calloc(MemoryStack stack) {
        return wrap(LLVMOrcCSymbolAliasMapEntry.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolAliasMapEntry.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolAliasMapEntry.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolAliasMapEntry.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolAliasMapEntry.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Name}. */
    public static long nName(long struct) { return memGetAddress(struct + LLVMOrcCSymbolAliasMapEntry.NAME); }
    /** Unsafe version of {@link #Flags}. */
    public static LLVMJITSymbolFlags nFlags(long struct) { return LLVMJITSymbolFlags.create(struct + LLVMOrcCSymbolAliasMapEntry.FLAGS); }

    /** Unsafe version of {@link #Name(long) Name}. */
    public static void nName(long struct, long value) { memPutAddress(struct + LLVMOrcCSymbolAliasMapEntry.NAME, check(value)); }
    /** Unsafe version of {@link #Flags(LLVMJITSymbolFlags) Flags}. */
    public static void nFlags(long struct, LLVMJITSymbolFlags value) { memCopy(value.address(), struct + LLVMOrcCSymbolAliasMapEntry.FLAGS, LLVMJITSymbolFlags.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + LLVMOrcCSymbolAliasMapEntry.NAME));
    }

    // -----------------------------------

    /** An array of {@link LLVMOrcCSymbolAliasMapEntry} structs. */
    public static class Buffer extends StructBuffer<LLVMOrcCSymbolAliasMapEntry, Buffer> implements NativeResource {

        private static final LLVMOrcCSymbolAliasMapEntry ELEMENT_FACTORY = LLVMOrcCSymbolAliasMapEntry.create(-1L);

        /**
         * Creates a new {@code LLVMOrcCSymbolAliasMapEntry.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LLVMOrcCSymbolAliasMapEntry#SIZEOF}, and its mark will be undefined.
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
        protected LLVMOrcCSymbolAliasMapEntry getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code Name} field. */
        @NativeType("LLVMOrcSymbolStringPoolEntryRef")
        public long Name() { return LLVMOrcCSymbolAliasMapEntry.nName(address()); }
        /** @return a {@link LLVMJITSymbolFlags} view of the {@code Flags} field. */
        public LLVMJITSymbolFlags Flags() { return LLVMOrcCSymbolAliasMapEntry.nFlags(address()); }

        /** Sets the specified value to the {@code Name} field. */
        public LLVMOrcCSymbolAliasMapEntry.Buffer Name(@NativeType("LLVMOrcSymbolStringPoolEntryRef") long value) { LLVMOrcCSymbolAliasMapEntry.nName(address(), value); return this; }
        /** Copies the specified {@link LLVMJITSymbolFlags} to the {@code Flags} field. */
        public LLVMOrcCSymbolAliasMapEntry.Buffer Flags(LLVMJITSymbolFlags value) { LLVMOrcCSymbolAliasMapEntry.nFlags(address(), value); return this; }
        /** Passes the {@code Flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LLVMOrcCSymbolAliasMapEntry.Buffer Flags(java.util.function.Consumer<LLVMJITSymbolFlags> consumer) { consumer.accept(Flags()); return this; }

    }

}