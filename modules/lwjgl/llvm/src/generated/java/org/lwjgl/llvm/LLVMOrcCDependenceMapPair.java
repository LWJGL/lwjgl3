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
 * Represents a pair of a {@code JITDylib} and {@code LLVMOrcCSymbolsList}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct LLVMOrcCDependenceMapPair {
 *     LLVMOrcJITDylibRef JD;
 *     {@link LLVMOrcCSymbolsList LLVMOrcCSymbolsList} Names;
 * }</code></pre>
 */
public class LLVMOrcCDependenceMapPair extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        JD,
        NAMES;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(LLVMOrcCSymbolsList.SIZEOF, LLVMOrcCSymbolsList.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        JD = layout.offsetof(0);
        NAMES = layout.offsetof(1);
    }

    /**
     * Creates a {@code LLVMOrcCDependenceMapPair} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LLVMOrcCDependenceMapPair(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code JD} field. */
    @NativeType("LLVMOrcJITDylibRef")
    public long JD() { return nJD(address()); }
    /** @return a {@link LLVMOrcCSymbolsList} view of the {@code Names} field. */
    public LLVMOrcCSymbolsList Names() { return nNames(address()); }

    /** Sets the specified value to the {@code JD} field. */
    public LLVMOrcCDependenceMapPair JD(@NativeType("LLVMOrcJITDylibRef") long value) { nJD(address(), value); return this; }
    /** Copies the specified {@link LLVMOrcCSymbolsList} to the {@code Names} field. */
    public LLVMOrcCDependenceMapPair Names(LLVMOrcCSymbolsList value) { nNames(address(), value); return this; }
    /** Passes the {@code Names} field to the specified {@link java.util.function.Consumer Consumer}. */
    public LLVMOrcCDependenceMapPair Names(java.util.function.Consumer<LLVMOrcCSymbolsList> consumer) { consumer.accept(Names()); return this; }

    /** Initializes this struct with the specified values. */
    public LLVMOrcCDependenceMapPair set(
        long JD,
        LLVMOrcCSymbolsList Names
    ) {
        JD(JD);
        Names(Names);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LLVMOrcCDependenceMapPair set(LLVMOrcCDependenceMapPair src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LLVMOrcCDependenceMapPair} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LLVMOrcCDependenceMapPair malloc() {
        return wrap(LLVMOrcCDependenceMapPair.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code LLVMOrcCDependenceMapPair} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LLVMOrcCDependenceMapPair calloc() {
        return wrap(LLVMOrcCDependenceMapPair.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code LLVMOrcCDependenceMapPair} instance allocated with {@link BufferUtils}. */
    public static LLVMOrcCDependenceMapPair create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(LLVMOrcCDependenceMapPair.class, memAddress(container), container);
    }

    /** Returns a new {@code LLVMOrcCDependenceMapPair} instance for the specified memory address. */
    public static LLVMOrcCDependenceMapPair create(long address) {
        return wrap(LLVMOrcCDependenceMapPair.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMOrcCDependenceMapPair createSafe(long address) {
        return address == NULL ? null : wrap(LLVMOrcCDependenceMapPair.class, address);
    }

    /**
     * Returns a new {@link LLVMOrcCDependenceMapPair.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCDependenceMapPair.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCDependenceMapPair.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCDependenceMapPair.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCDependenceMapPair.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCDependenceMapPair.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link LLVMOrcCDependenceMapPair.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCDependenceMapPair.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMOrcCDependenceMapPair.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code LLVMOrcCDependenceMapPair} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMOrcCDependenceMapPair malloc(MemoryStack stack) {
        return wrap(LLVMOrcCDependenceMapPair.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code LLVMOrcCDependenceMapPair} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMOrcCDependenceMapPair calloc(MemoryStack stack) {
        return wrap(LLVMOrcCDependenceMapPair.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link LLVMOrcCDependenceMapPair.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCDependenceMapPair.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCDependenceMapPair.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCDependenceMapPair.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #JD}. */
    public static long nJD(long struct) { return memGetAddress(struct + LLVMOrcCDependenceMapPair.JD); }
    /** Unsafe version of {@link #Names}. */
    public static LLVMOrcCSymbolsList nNames(long struct) { return LLVMOrcCSymbolsList.create(struct + LLVMOrcCDependenceMapPair.NAMES); }

    /** Unsafe version of {@link #JD(long) JD}. */
    public static void nJD(long struct, long value) { memPutAddress(struct + LLVMOrcCDependenceMapPair.JD, check(value)); }
    /** Unsafe version of {@link #Names(LLVMOrcCSymbolsList) Names}. */
    public static void nNames(long struct, LLVMOrcCSymbolsList value) { memCopy(value.address(), struct + LLVMOrcCDependenceMapPair.NAMES, LLVMOrcCSymbolsList.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + LLVMOrcCDependenceMapPair.JD));
        LLVMOrcCSymbolsList.validate(struct + LLVMOrcCDependenceMapPair.NAMES);
    }

    // -----------------------------------

    /** An array of {@link LLVMOrcCDependenceMapPair} structs. */
    public static class Buffer extends StructBuffer<LLVMOrcCDependenceMapPair, Buffer> implements NativeResource {

        private static final LLVMOrcCDependenceMapPair ELEMENT_FACTORY = LLVMOrcCDependenceMapPair.create(-1L);

        /**
         * Creates a new {@code LLVMOrcCDependenceMapPair.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LLVMOrcCDependenceMapPair#SIZEOF}, and its mark will be undefined.
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
        protected LLVMOrcCDependenceMapPair getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code JD} field. */
        @NativeType("LLVMOrcJITDylibRef")
        public long JD() { return LLVMOrcCDependenceMapPair.nJD(address()); }
        /** @return a {@link LLVMOrcCSymbolsList} view of the {@code Names} field. */
        public LLVMOrcCSymbolsList Names() { return LLVMOrcCDependenceMapPair.nNames(address()); }

        /** Sets the specified value to the {@code JD} field. */
        public LLVMOrcCDependenceMapPair.Buffer JD(@NativeType("LLVMOrcJITDylibRef") long value) { LLVMOrcCDependenceMapPair.nJD(address(), value); return this; }
        /** Copies the specified {@link LLVMOrcCSymbolsList} to the {@code Names} field. */
        public LLVMOrcCDependenceMapPair.Buffer Names(LLVMOrcCSymbolsList value) { LLVMOrcCDependenceMapPair.nNames(address(), value); return this; }
        /** Passes the {@code Names} field to the specified {@link java.util.function.Consumer Consumer}. */
        public LLVMOrcCDependenceMapPair.Buffer Names(java.util.function.Consumer<LLVMOrcCSymbolsList> consumer) { consumer.accept(Names()); return this; }

    }

}