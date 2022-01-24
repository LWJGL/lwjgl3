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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Represents an evaluated symbol address and flags.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct LLVMJITEvaluatedSymbol {
 *     LLVMOrcExecutorAddress Address;
 *     {@link LLVMJITSymbolFlags LLVMJITSymbolFlags} Flags;
 * }</code></pre>
 */
public class LLVMJITEvaluatedSymbol extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ADDRESS,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(8),
            __member(LLVMJITSymbolFlags.SIZEOF, LLVMJITSymbolFlags.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ADDRESS = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
    }

    /**
     * Creates a {@code LLVMJITEvaluatedSymbol} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LLVMJITEvaluatedSymbol(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code Address} field. */
    @NativeType("LLVMOrcExecutorAddress")
    public long Address() { return nAddress(address()); }
    /** @return a {@link LLVMJITSymbolFlags} view of the {@code Flags} field. */
    public LLVMJITSymbolFlags Flags() { return nFlags(address()); }

    /** Sets the specified value to the {@code Address} field. */
    public LLVMJITEvaluatedSymbol Address(@NativeType("LLVMOrcExecutorAddress") long value) { nAddress(address(), value); return this; }
    /** Copies the specified {@link LLVMJITSymbolFlags} to the {@code Flags} field. */
    public LLVMJITEvaluatedSymbol Flags(LLVMJITSymbolFlags value) { nFlags(address(), value); return this; }
    /** Passes the {@code Flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LLVMJITEvaluatedSymbol Flags(java.util.function.Consumer<LLVMJITSymbolFlags> consumer) { consumer.accept(Flags()); return this; }

    /** Initializes this struct with the specified values. */
    public LLVMJITEvaluatedSymbol set(
        long Address,
        LLVMJITSymbolFlags Flags
    ) {
        Address(Address);
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
    public LLVMJITEvaluatedSymbol set(LLVMJITEvaluatedSymbol src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LLVMJITEvaluatedSymbol} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LLVMJITEvaluatedSymbol malloc() {
        return wrap(LLVMJITEvaluatedSymbol.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code LLVMJITEvaluatedSymbol} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LLVMJITEvaluatedSymbol calloc() {
        return wrap(LLVMJITEvaluatedSymbol.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code LLVMJITEvaluatedSymbol} instance allocated with {@link BufferUtils}. */
    public static LLVMJITEvaluatedSymbol create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(LLVMJITEvaluatedSymbol.class, memAddress(container), container);
    }

    /** Returns a new {@code LLVMJITEvaluatedSymbol} instance for the specified memory address. */
    public static LLVMJITEvaluatedSymbol create(long address) {
        return wrap(LLVMJITEvaluatedSymbol.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMJITEvaluatedSymbol createSafe(long address) {
        return address == NULL ? null : wrap(LLVMJITEvaluatedSymbol.class, address);
    }

    /**
     * Returns a new {@link LLVMJITEvaluatedSymbol.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMJITEvaluatedSymbol.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LLVMJITEvaluatedSymbol.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMJITEvaluatedSymbol.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMJITEvaluatedSymbol.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMJITEvaluatedSymbol.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link LLVMJITEvaluatedSymbol.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LLVMJITEvaluatedSymbol.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMJITEvaluatedSymbol.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code LLVMJITEvaluatedSymbol} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMJITEvaluatedSymbol malloc(MemoryStack stack) {
        return wrap(LLVMJITEvaluatedSymbol.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code LLVMJITEvaluatedSymbol} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMJITEvaluatedSymbol calloc(MemoryStack stack) {
        return wrap(LLVMJITEvaluatedSymbol.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link LLVMJITEvaluatedSymbol.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMJITEvaluatedSymbol.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMJITEvaluatedSymbol.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMJITEvaluatedSymbol.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Address}. */
    public static long nAddress(long struct) { return UNSAFE.getLong(null, struct + LLVMJITEvaluatedSymbol.ADDRESS); }
    /** Unsafe version of {@link #Flags}. */
    public static LLVMJITSymbolFlags nFlags(long struct) { return LLVMJITSymbolFlags.create(struct + LLVMJITEvaluatedSymbol.FLAGS); }

    /** Unsafe version of {@link #Address(long) Address}. */
    public static void nAddress(long struct, long value) { UNSAFE.putLong(null, struct + LLVMJITEvaluatedSymbol.ADDRESS, value); }
    /** Unsafe version of {@link #Flags(LLVMJITSymbolFlags) Flags}. */
    public static void nFlags(long struct, LLVMJITSymbolFlags value) { memCopy(value.address(), struct + LLVMJITEvaluatedSymbol.FLAGS, LLVMJITSymbolFlags.SIZEOF); }

    // -----------------------------------

    /** An array of {@link LLVMJITEvaluatedSymbol} structs. */
    public static class Buffer extends StructBuffer<LLVMJITEvaluatedSymbol, Buffer> implements NativeResource {

        private static final LLVMJITEvaluatedSymbol ELEMENT_FACTORY = LLVMJITEvaluatedSymbol.create(-1L);

        /**
         * Creates a new {@code LLVMJITEvaluatedSymbol.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LLVMJITEvaluatedSymbol#SIZEOF}, and its mark will be undefined.
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
        protected LLVMJITEvaluatedSymbol getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code Address} field. */
        @NativeType("LLVMOrcExecutorAddress")
        public long Address() { return LLVMJITEvaluatedSymbol.nAddress(address()); }
        /** @return a {@link LLVMJITSymbolFlags} view of the {@code Flags} field. */
        public LLVMJITSymbolFlags Flags() { return LLVMJITEvaluatedSymbol.nFlags(address()); }

        /** Sets the specified value to the {@code Address} field. */
        public LLVMJITEvaluatedSymbol.Buffer Address(@NativeType("LLVMOrcExecutorAddress") long value) { LLVMJITEvaluatedSymbol.nAddress(address(), value); return this; }
        /** Copies the specified {@link LLVMJITSymbolFlags} to the {@code Flags} field. */
        public LLVMJITEvaluatedSymbol.Buffer Flags(LLVMJITSymbolFlags value) { LLVMJITEvaluatedSymbol.nFlags(address(), value); return this; }
        /** Passes the {@code Flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LLVMJITEvaluatedSymbol.Buffer Flags(java.util.function.Consumer<LLVMJITSymbolFlags> consumer) { consumer.accept(Flags()); return this; }

    }

}