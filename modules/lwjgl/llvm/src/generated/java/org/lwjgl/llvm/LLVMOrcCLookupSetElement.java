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
 * An element type for a symbol lookup set.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct LLVMOrcCLookupSetElement {
 *     LLVMOrcSymbolStringPoolEntryRef Name;
 *     LLVMOrcSymbolLookupFlags LookupFlags;
 * }</code></pre>
 */
public class LLVMOrcCLookupSetElement extends Struct<LLVMOrcCLookupSetElement> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        LOOKUPFLAGS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        LOOKUPFLAGS = layout.offsetof(1);
    }

    protected LLVMOrcCLookupSetElement(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected LLVMOrcCLookupSetElement create(long address, @Nullable ByteBuffer container) {
        return new LLVMOrcCLookupSetElement(address, container);
    }

    /**
     * Creates a {@code LLVMOrcCLookupSetElement} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LLVMOrcCLookupSetElement(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code Name} field. */
    @NativeType("LLVMOrcSymbolStringPoolEntryRef")
    public long Name() { return nName(address()); }
    /** @return the value of the {@code LookupFlags} field. */
    @NativeType("LLVMOrcSymbolLookupFlags")
    public int LookupFlags() { return nLookupFlags(address()); }

    /** Sets the specified value to the {@code Name} field. */
    public LLVMOrcCLookupSetElement Name(@NativeType("LLVMOrcSymbolStringPoolEntryRef") long value) { nName(address(), value); return this; }
    /** Sets the specified value to the {@code LookupFlags} field. */
    public LLVMOrcCLookupSetElement LookupFlags(@NativeType("LLVMOrcSymbolLookupFlags") int value) { nLookupFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public LLVMOrcCLookupSetElement set(
        long Name,
        int LookupFlags
    ) {
        Name(Name);
        LookupFlags(LookupFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LLVMOrcCLookupSetElement set(LLVMOrcCLookupSetElement src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LLVMOrcCLookupSetElement} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LLVMOrcCLookupSetElement malloc() {
        return new LLVMOrcCLookupSetElement(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code LLVMOrcCLookupSetElement} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LLVMOrcCLookupSetElement calloc() {
        return new LLVMOrcCLookupSetElement(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code LLVMOrcCLookupSetElement} instance allocated with {@link BufferUtils}. */
    public static LLVMOrcCLookupSetElement create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new LLVMOrcCLookupSetElement(memAddress(container), container);
    }

    /** Returns a new {@code LLVMOrcCLookupSetElement} instance for the specified memory address. */
    public static LLVMOrcCLookupSetElement create(long address) {
        return new LLVMOrcCLookupSetElement(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable LLVMOrcCLookupSetElement createSafe(long address) {
        return address == NULL ? null : new LLVMOrcCLookupSetElement(address, null);
    }

    /**
     * Returns a new {@link LLVMOrcCLookupSetElement.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCLookupSetElement.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCLookupSetElement.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCLookupSetElement.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCLookupSetElement.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCLookupSetElement.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link LLVMOrcCLookupSetElement.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCLookupSetElement.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static LLVMOrcCLookupSetElement.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code LLVMOrcCLookupSetElement} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMOrcCLookupSetElement malloc(MemoryStack stack) {
        return new LLVMOrcCLookupSetElement(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code LLVMOrcCLookupSetElement} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMOrcCLookupSetElement calloc(MemoryStack stack) {
        return new LLVMOrcCLookupSetElement(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link LLVMOrcCLookupSetElement.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCLookupSetElement.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCLookupSetElement.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCLookupSetElement.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Name}. */
    public static long nName(long struct) { return memGetAddress(struct + LLVMOrcCLookupSetElement.NAME); }
    /** Unsafe version of {@link #LookupFlags}. */
    public static int nLookupFlags(long struct) { return memGetInt(struct + LLVMOrcCLookupSetElement.LOOKUPFLAGS); }

    /** Unsafe version of {@link #Name(long) Name}. */
    public static void nName(long struct, long value) { memPutAddress(struct + LLVMOrcCLookupSetElement.NAME, check(value)); }
    /** Unsafe version of {@link #LookupFlags(int) LookupFlags}. */
    public static void nLookupFlags(long struct, int value) { memPutInt(struct + LLVMOrcCLookupSetElement.LOOKUPFLAGS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + LLVMOrcCLookupSetElement.NAME));
    }

    // -----------------------------------

    /** An array of {@link LLVMOrcCLookupSetElement} structs. */
    public static class Buffer extends StructBuffer<LLVMOrcCLookupSetElement, Buffer> implements NativeResource {

        private static final LLVMOrcCLookupSetElement ELEMENT_FACTORY = LLVMOrcCLookupSetElement.create(-1L);

        /**
         * Creates a new {@code LLVMOrcCLookupSetElement.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LLVMOrcCLookupSetElement#SIZEOF}, and its mark will be undefined.</p>
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
        protected LLVMOrcCLookupSetElement getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code Name} field. */
        @NativeType("LLVMOrcSymbolStringPoolEntryRef")
        public long Name() { return LLVMOrcCLookupSetElement.nName(address()); }
        /** @return the value of the {@code LookupFlags} field. */
        @NativeType("LLVMOrcSymbolLookupFlags")
        public int LookupFlags() { return LLVMOrcCLookupSetElement.nLookupFlags(address()); }

        /** Sets the specified value to the {@code Name} field. */
        public LLVMOrcCLookupSetElement.Buffer Name(@NativeType("LLVMOrcSymbolStringPoolEntryRef") long value) { LLVMOrcCLookupSetElement.nName(address(), value); return this; }
        /** Sets the specified value to the {@code LookupFlags} field. */
        public LLVMOrcCLookupSetElement.Buffer LookupFlags(@NativeType("LLVMOrcSymbolLookupFlags") int value) { LLVMOrcCLookupSetElement.nLookupFlags(address(), value); return this; }

    }

}