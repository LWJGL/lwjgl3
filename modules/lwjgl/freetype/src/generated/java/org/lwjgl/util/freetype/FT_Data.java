/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Read-only binary data represented as a pointer and a length.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Data {
 *     FT_Byte const * pointer;
 *     FT_UInt length;
 * }</code></pre>
 */
public class FT_Data extends Struct<FT_Data> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        POINTER,
        LENGTH;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        POINTER = layout.offsetof(0);
        LENGTH = layout.offsetof(1);
    }

    protected FT_Data(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Data create(long address, @Nullable ByteBuffer container) {
        return new FT_Data(address, container);
    }

    /**
     * Creates a {@code FT_Data} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Data(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pointer} field. */
    @NativeType("FT_Byte const *")
    public ByteBuffer pointer() { return npointer(address()); }
    /** @return the value of the {@code length} field. */
    @NativeType("FT_UInt")
    public int length() { return nlength(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@code pointer} field. */
    public FT_Data pointer(@NativeType("FT_Byte const *") ByteBuffer value) { npointer(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FT_Data set(FT_Data src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FT_Data} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_Data malloc() {
        return new FT_Data(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_Data} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_Data calloc() {
        return new FT_Data(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_Data} instance allocated with {@link BufferUtils}. */
    public static FT_Data create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Data(memAddress(container), container);
    }

    /** Returns a new {@code FT_Data} instance for the specified memory address. */
    public static FT_Data create(long address) {
        return new FT_Data(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Data createSafe(long address) {
        return address == NULL ? null : new FT_Data(address, null);
    }

    /**
     * Returns a new {@link FT_Data.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Data.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_Data.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Data.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Data.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Data.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_Data.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Data.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Data.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_Data} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Data malloc(MemoryStack stack) {
        return new FT_Data(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_Data} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Data calloc(MemoryStack stack) {
        return new FT_Data(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_Data.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Data.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Data.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Data.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pointer() pointer}. */
    public static ByteBuffer npointer(long struct) { return memByteBuffer(memGetAddress(struct + FT_Data.POINTER), nlength(struct)); }
    /** Unsafe version of {@link #length}. */
    public static int nlength(long struct) { return UNSAFE.getInt(null, struct + FT_Data.LENGTH); }

    /** Unsafe version of {@link #pointer(ByteBuffer) pointer}. */
    public static void npointer(long struct, ByteBuffer value) { memPutAddress(struct + FT_Data.POINTER, memAddress(value)); nlength(struct, value.remaining()); }
    /** Sets the specified value to the {@code length} field of the specified {@code struct}. */
    public static void nlength(long struct, int value) { UNSAFE.putInt(null, struct + FT_Data.LENGTH, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FT_Data.POINTER));
    }

    // -----------------------------------

    /** An array of {@link FT_Data} structs. */
    public static class Buffer extends StructBuffer<FT_Data, Buffer> implements NativeResource {

        private static final FT_Data ELEMENT_FACTORY = FT_Data.create(-1L);

        /**
         * Creates a new {@code FT_Data.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Data#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Data getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pointer} field. */
        @NativeType("FT_Byte const *")
        public ByteBuffer pointer() { return FT_Data.npointer(address()); }
        /** @return the value of the {@code length} field. */
        @NativeType("FT_UInt")
        public int length() { return FT_Data.nlength(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@code pointer} field. */
        public FT_Data.Buffer pointer(@NativeType("FT_Byte const *") ByteBuffer value) { FT_Data.npointer(address(), value); return this; }

    }

}