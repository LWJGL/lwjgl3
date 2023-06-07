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
 * An element type for a JITDylib search order.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct LLVMOrcCJITDylibSearchOrderElement {
 *     LLVMOrcJITDylibRef JD;
 *     LLVMOrcJITDylibLookupFlags JDLookupFlags;
 * }</code></pre>
 */
public class LLVMOrcCJITDylibSearchOrderElement extends Struct<LLVMOrcCJITDylibSearchOrderElement> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        JD,
        JDLOOKUPFLAGS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        JD = layout.offsetof(0);
        JDLOOKUPFLAGS = layout.offsetof(1);
    }

    protected LLVMOrcCJITDylibSearchOrderElement(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected LLVMOrcCJITDylibSearchOrderElement create(long address, @Nullable ByteBuffer container) {
        return new LLVMOrcCJITDylibSearchOrderElement(address, container);
    }

    /**
     * Creates a {@code LLVMOrcCJITDylibSearchOrderElement} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LLVMOrcCJITDylibSearchOrderElement(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code JD} field. */
    @NativeType("LLVMOrcJITDylibRef")
    public long JD() { return nJD(address()); }
    /** @return the value of the {@code JDLookupFlags} field. */
    @NativeType("LLVMOrcJITDylibLookupFlags")
    public int JDLookupFlags() { return nJDLookupFlags(address()); }

    /** Sets the specified value to the {@code JD} field. */
    public LLVMOrcCJITDylibSearchOrderElement JD(@NativeType("LLVMOrcJITDylibRef") long value) { nJD(address(), value); return this; }
    /** Sets the specified value to the {@code JDLookupFlags} field. */
    public LLVMOrcCJITDylibSearchOrderElement JDLookupFlags(@NativeType("LLVMOrcJITDylibLookupFlags") int value) { nJDLookupFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public LLVMOrcCJITDylibSearchOrderElement set(
        long JD,
        int JDLookupFlags
    ) {
        JD(JD);
        JDLookupFlags(JDLookupFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LLVMOrcCJITDylibSearchOrderElement set(LLVMOrcCJITDylibSearchOrderElement src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LLVMOrcCJITDylibSearchOrderElement} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LLVMOrcCJITDylibSearchOrderElement malloc() {
        return new LLVMOrcCJITDylibSearchOrderElement(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code LLVMOrcCJITDylibSearchOrderElement} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LLVMOrcCJITDylibSearchOrderElement calloc() {
        return new LLVMOrcCJITDylibSearchOrderElement(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code LLVMOrcCJITDylibSearchOrderElement} instance allocated with {@link BufferUtils}. */
    public static LLVMOrcCJITDylibSearchOrderElement create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new LLVMOrcCJITDylibSearchOrderElement(memAddress(container), container);
    }

    /** Returns a new {@code LLVMOrcCJITDylibSearchOrderElement} instance for the specified memory address. */
    public static LLVMOrcCJITDylibSearchOrderElement create(long address) {
        return new LLVMOrcCJITDylibSearchOrderElement(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMOrcCJITDylibSearchOrderElement createSafe(long address) {
        return address == NULL ? null : new LLVMOrcCJITDylibSearchOrderElement(address, null);
    }

    /**
     * Returns a new {@link LLVMOrcCJITDylibSearchOrderElement.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCJITDylibSearchOrderElement.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCJITDylibSearchOrderElement.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCJITDylibSearchOrderElement.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCJITDylibSearchOrderElement.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCJITDylibSearchOrderElement.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link LLVMOrcCJITDylibSearchOrderElement.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCJITDylibSearchOrderElement.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMOrcCJITDylibSearchOrderElement.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code LLVMOrcCJITDylibSearchOrderElement} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMOrcCJITDylibSearchOrderElement malloc(MemoryStack stack) {
        return new LLVMOrcCJITDylibSearchOrderElement(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code LLVMOrcCJITDylibSearchOrderElement} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMOrcCJITDylibSearchOrderElement calloc(MemoryStack stack) {
        return new LLVMOrcCJITDylibSearchOrderElement(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link LLVMOrcCJITDylibSearchOrderElement.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCJITDylibSearchOrderElement.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMOrcCJITDylibSearchOrderElement.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMOrcCJITDylibSearchOrderElement.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #JD}. */
    public static long nJD(long struct) { return memGetAddress(struct + LLVMOrcCJITDylibSearchOrderElement.JD); }
    /** Unsafe version of {@link #JDLookupFlags}. */
    public static int nJDLookupFlags(long struct) { return UNSAFE.getInt(null, struct + LLVMOrcCJITDylibSearchOrderElement.JDLOOKUPFLAGS); }

    /** Unsafe version of {@link #JD(long) JD}. */
    public static void nJD(long struct, long value) { memPutAddress(struct + LLVMOrcCJITDylibSearchOrderElement.JD, check(value)); }
    /** Unsafe version of {@link #JDLookupFlags(int) JDLookupFlags}. */
    public static void nJDLookupFlags(long struct, int value) { UNSAFE.putInt(null, struct + LLVMOrcCJITDylibSearchOrderElement.JDLOOKUPFLAGS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + LLVMOrcCJITDylibSearchOrderElement.JD));
    }

    // -----------------------------------

    /** An array of {@link LLVMOrcCJITDylibSearchOrderElement} structs. */
    public static class Buffer extends StructBuffer<LLVMOrcCJITDylibSearchOrderElement, Buffer> implements NativeResource {

        private static final LLVMOrcCJITDylibSearchOrderElement ELEMENT_FACTORY = LLVMOrcCJITDylibSearchOrderElement.create(-1L);

        /**
         * Creates a new {@code LLVMOrcCJITDylibSearchOrderElement.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LLVMOrcCJITDylibSearchOrderElement#SIZEOF}, and its mark will be undefined.</p>
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
        protected LLVMOrcCJITDylibSearchOrderElement getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code JD} field. */
        @NativeType("LLVMOrcJITDylibRef")
        public long JD() { return LLVMOrcCJITDylibSearchOrderElement.nJD(address()); }
        /** @return the value of the {@code JDLookupFlags} field. */
        @NativeType("LLVMOrcJITDylibLookupFlags")
        public int JDLookupFlags() { return LLVMOrcCJITDylibSearchOrderElement.nJDLookupFlags(address()); }

        /** Sets the specified value to the {@code JD} field. */
        public LLVMOrcCJITDylibSearchOrderElement.Buffer JD(@NativeType("LLVMOrcJITDylibRef") long value) { LLVMOrcCJITDylibSearchOrderElement.nJD(address(), value); return this; }
        /** Sets the specified value to the {@code JDLookupFlags} field. */
        public LLVMOrcCJITDylibSearchOrderElement.Buffer JDLookupFlags(@NativeType("LLVMOrcJITDylibLookupFlags") int value) { LLVMOrcCJITDylibSearchOrderElement.nJDLookupFlags(address(), value); return this; }

    }

}