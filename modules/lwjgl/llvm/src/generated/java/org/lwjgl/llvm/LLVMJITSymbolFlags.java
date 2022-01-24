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
 * Represents the linkage flags for a symbol definition.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct LLVMJITSymbolFlags {
 *     uint8_t GenericFlags;
 *     uint8_t TargetFlags;
 * }</code></pre>
 */
public class LLVMJITSymbolFlags extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        GENERICFLAGS,
        TARGETFLAGS;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        GENERICFLAGS = layout.offsetof(0);
        TARGETFLAGS = layout.offsetof(1);
    }

    /**
     * Creates a {@code LLVMJITSymbolFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LLVMJITSymbolFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code GenericFlags} field. */
    @NativeType("uint8_t")
    public byte GenericFlags() { return nGenericFlags(address()); }
    /** @return the value of the {@code TargetFlags} field. */
    @NativeType("uint8_t")
    public byte TargetFlags() { return nTargetFlags(address()); }

    /** Sets the specified value to the {@code GenericFlags} field. */
    public LLVMJITSymbolFlags GenericFlags(@NativeType("uint8_t") byte value) { nGenericFlags(address(), value); return this; }
    /** Sets the specified value to the {@code TargetFlags} field. */
    public LLVMJITSymbolFlags TargetFlags(@NativeType("uint8_t") byte value) { nTargetFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public LLVMJITSymbolFlags set(
        byte GenericFlags,
        byte TargetFlags
    ) {
        GenericFlags(GenericFlags);
        TargetFlags(TargetFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LLVMJITSymbolFlags set(LLVMJITSymbolFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LLVMJITSymbolFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LLVMJITSymbolFlags malloc() {
        return wrap(LLVMJITSymbolFlags.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code LLVMJITSymbolFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LLVMJITSymbolFlags calloc() {
        return wrap(LLVMJITSymbolFlags.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code LLVMJITSymbolFlags} instance allocated with {@link BufferUtils}. */
    public static LLVMJITSymbolFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(LLVMJITSymbolFlags.class, memAddress(container), container);
    }

    /** Returns a new {@code LLVMJITSymbolFlags} instance for the specified memory address. */
    public static LLVMJITSymbolFlags create(long address) {
        return wrap(LLVMJITSymbolFlags.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMJITSymbolFlags createSafe(long address) {
        return address == NULL ? null : wrap(LLVMJITSymbolFlags.class, address);
    }

    /**
     * Returns a new {@link LLVMJITSymbolFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMJITSymbolFlags.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LLVMJITSymbolFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMJITSymbolFlags.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMJITSymbolFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LLVMJITSymbolFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link LLVMJITSymbolFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LLVMJITSymbolFlags.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMJITSymbolFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code LLVMJITSymbolFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMJITSymbolFlags malloc(MemoryStack stack) {
        return wrap(LLVMJITSymbolFlags.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code LLVMJITSymbolFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LLVMJITSymbolFlags calloc(MemoryStack stack) {
        return wrap(LLVMJITSymbolFlags.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link LLVMJITSymbolFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMJITSymbolFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LLVMJITSymbolFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LLVMJITSymbolFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #GenericFlags}. */
    public static byte nGenericFlags(long struct) { return UNSAFE.getByte(null, struct + LLVMJITSymbolFlags.GENERICFLAGS); }
    /** Unsafe version of {@link #TargetFlags}. */
    public static byte nTargetFlags(long struct) { return UNSAFE.getByte(null, struct + LLVMJITSymbolFlags.TARGETFLAGS); }

    /** Unsafe version of {@link #GenericFlags(byte) GenericFlags}. */
    public static void nGenericFlags(long struct, byte value) { UNSAFE.putByte(null, struct + LLVMJITSymbolFlags.GENERICFLAGS, value); }
    /** Unsafe version of {@link #TargetFlags(byte) TargetFlags}. */
    public static void nTargetFlags(long struct, byte value) { UNSAFE.putByte(null, struct + LLVMJITSymbolFlags.TARGETFLAGS, value); }

    // -----------------------------------

    /** An array of {@link LLVMJITSymbolFlags} structs. */
    public static class Buffer extends StructBuffer<LLVMJITSymbolFlags, Buffer> implements NativeResource {

        private static final LLVMJITSymbolFlags ELEMENT_FACTORY = LLVMJITSymbolFlags.create(-1L);

        /**
         * Creates a new {@code LLVMJITSymbolFlags.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LLVMJITSymbolFlags#SIZEOF}, and its mark will be undefined.
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
        protected LLVMJITSymbolFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code GenericFlags} field. */
        @NativeType("uint8_t")
        public byte GenericFlags() { return LLVMJITSymbolFlags.nGenericFlags(address()); }
        /** @return the value of the {@code TargetFlags} field. */
        @NativeType("uint8_t")
        public byte TargetFlags() { return LLVMJITSymbolFlags.nTargetFlags(address()); }

        /** Sets the specified value to the {@code GenericFlags} field. */
        public LLVMJITSymbolFlags.Buffer GenericFlags(@NativeType("uint8_t") byte value) { LLVMJITSymbolFlags.nGenericFlags(address(), value); return this; }
        /** Sets the specified value to the {@code TargetFlags} field. */
        public LLVMJITSymbolFlags.Buffer TargetFlags(@NativeType("uint8_t") byte value) { LLVMJITSymbolFlags.nTargetFlags(address(), value); return this; }

    }

}