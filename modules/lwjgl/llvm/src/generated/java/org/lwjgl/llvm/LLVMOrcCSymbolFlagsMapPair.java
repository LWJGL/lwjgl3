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
 * Represents a pair of a symbol name and {@code LLVMJITSymbolFlags}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct LLVMOrcCSymbolFlagsMapPair {
 *     LLVMOrcSymbolStringPoolEntryRef Name;
 *     {@link LLVMJITSymbolFlags LLVMJITSymbolFlags} Flags;
 * }</code></pre>
 */
public class LLVMOrcCSymbolFlagsMapPair extends Struct<LLVMOrcCSymbolFlagsMapPair> implements NativeResource {

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

    protected LLVMOrcCSymbolFlagsMapPair(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected LLVMOrcCSymbolFlagsMapPair create(long address, @Nullable ByteBuffer container) {
        return new LLVMOrcCSymbolFlagsMapPair(address, container);
    }

    /**
     * Creates a {@code LLVMOrcCSymbolFlagsMapPair} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LLVMOrcCSymbolFlagsMapPair(ByteBuffer container) {
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
    public LLVMOrcCSymbolFlagsMapPair Name(@NativeType("LLVMOrcSymbolStringPoolEntryRef") long value) { nName(address(), value); return this; }
    /** Copies the specified {@link LLVMJITSymbolFlags} to the {@code Flags} field. */
    public LLVMOrcCSymbolFlagsMapPair Flags(LLVMJITSymbolFlags value) { nFlags(address(), value); return this; }
    /** Passes the {@code Flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LLVMOrcCSymbolFlagsMapPair Flags(java.util.function.Consumer<LLVMJITSymbolFlags> consumer) { consumer.accept(Flags()); return this; }

    /** Initializes this struct with the specified values. */
    public LLVMOrcCSymbolFlagsMapPair set(
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
    public LLVMOrcCSymbolFlagsMapPair set(LLVMOrcCSymbolFlagsMapPair src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LLVMOrcCSymbolFlagsMapPair} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LLVMOrcCSymbolFlagsMapPair malloc() {
        return new LLVMOrcCSymbolFlagsMapPair(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code LLVMOrcCSymbolFlagsMapPair} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LLVMOrcCSymbolFlagsMapPair calloc() {
        return new LLVMOrcCSymbolFlagsMapPair(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code LLVMOrcCSymbolFlagsMapPair} instance allocated with {@link BufferUtils}. */
    public static LLVMOrcCSymbolFlagsMapPair create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new LLVMOrcCSymbolFlagsMapPair(memAddress(container), container);
    }

    /** Returns a new {@code LLVMOrcCSymbolFlagsMapPair} instance for the specified memory address. */
    public static LLVMOrcCSymbolFlagsMapPair create(long address) {
        return new LLVMOrcCSymbolFlagsMapPair(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMOrcCSymbolFlagsMapPair createSafe(long address) {
        return address == NULL ? null : new LLVMOrcCSymbolFlagsMapPair(address, null);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolFlagsMapPair.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolFlagsMapPair.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolFlagsMapPair.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolFlagsMapPair.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolFlagsMapPair.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolFlagsMapPair.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link LLVMOrcCSymbolFlagsMapPair.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolFlagsMapPair.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMOrcCSymbolFlagsMapPair.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code LLVMOrcCSymbolFlagsMapPair} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMOrcCSymbolFlagsMapPair malloc(MemoryStack stack) {
        return new LLVMOrcCSymbolFlagsMapPair(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code LLVMOrcCSymbolFlagsMapPair} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMOrcCSymbolFlagsMapPair calloc(MemoryStack stack) {
        return new LLVMOrcCSymbolFlagsMapPair(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolFlagsMapPair.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolFlagsMapPair.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCSymbolFlagsMapPair.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCSymbolFlagsMapPair.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Name}. */
    public static long nName(long struct) { return memGetAddress(struct + LLVMOrcCSymbolFlagsMapPair.NAME); }
    /** Unsafe version of {@link #Flags}. */
    public static LLVMJITSymbolFlags nFlags(long struct) { return LLVMJITSymbolFlags.create(struct + LLVMOrcCSymbolFlagsMapPair.FLAGS); }

    /** Unsafe version of {@link #Name(long) Name}. */
    public static void nName(long struct, long value) { memPutAddress(struct + LLVMOrcCSymbolFlagsMapPair.NAME, check(value)); }
    /** Unsafe version of {@link #Flags(LLVMJITSymbolFlags) Flags}. */
    public static void nFlags(long struct, LLVMJITSymbolFlags value) { memCopy(value.address(), struct + LLVMOrcCSymbolFlagsMapPair.FLAGS, LLVMJITSymbolFlags.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + LLVMOrcCSymbolFlagsMapPair.NAME));
    }

    // -----------------------------------

    /** An array of {@link LLVMOrcCSymbolFlagsMapPair} structs. */
    public static class Buffer extends StructBuffer<LLVMOrcCSymbolFlagsMapPair, Buffer> implements NativeResource {

        private static final LLVMOrcCSymbolFlagsMapPair ELEMENT_FACTORY = LLVMOrcCSymbolFlagsMapPair.create(-1L);

        /**
         * Creates a new {@code LLVMOrcCSymbolFlagsMapPair.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LLVMOrcCSymbolFlagsMapPair#SIZEOF}, and its mark will be undefined.</p>
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
        protected LLVMOrcCSymbolFlagsMapPair getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code Name} field. */
        @NativeType("LLVMOrcSymbolStringPoolEntryRef")
        public long Name() { return LLVMOrcCSymbolFlagsMapPair.nName(address()); }
        /** @return a {@link LLVMJITSymbolFlags} view of the {@code Flags} field. */
        public LLVMJITSymbolFlags Flags() { return LLVMOrcCSymbolFlagsMapPair.nFlags(address()); }

        /** Sets the specified value to the {@code Name} field. */
        public LLVMOrcCSymbolFlagsMapPair.Buffer Name(@NativeType("LLVMOrcSymbolStringPoolEntryRef") long value) { LLVMOrcCSymbolFlagsMapPair.nName(address(), value); return this; }
        /** Copies the specified {@link LLVMJITSymbolFlags} to the {@code Flags} field. */
        public LLVMOrcCSymbolFlagsMapPair.Buffer Flags(LLVMJITSymbolFlags value) { LLVMOrcCSymbolFlagsMapPair.nFlags(address(), value); return this; }
        /** Passes the {@code Flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LLVMOrcCSymbolFlagsMapPair.Buffer Flags(java.util.function.Consumer<LLVMJITSymbolFlags> consumer) { consumer.accept(Flags()); return this; }

    }

}