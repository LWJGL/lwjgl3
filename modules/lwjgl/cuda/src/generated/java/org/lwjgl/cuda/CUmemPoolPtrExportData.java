/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Opaque data for exporting a pool allocation.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUmemPoolPtrExportData {
 *     unsigned char reserved[64];
 * }</code></pre>
 */
public class CUmemPoolPtrExportData extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RESERVED;

    static {
        Layout layout = __struct(
            __array(1, 64)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RESERVED = layout.offsetof(0);
    }

    /**
     * Creates a {@code CUmemPoolPtrExportData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUmemPoolPtrExportData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code reserved} field. */
    @NativeType("unsigned char[64]")
    public ByteBuffer reserved() { return nreserved(address()); }
    /** @return the value at the specified index of the {@code reserved} field. */
    @NativeType("unsigned char")
    public byte reserved(int index) { return nreserved(address(), index); }

    /** Copies the specified {@link ByteBuffer} to the {@code reserved} field. */
    public CUmemPoolPtrExportData reserved(@NativeType("unsigned char[64]") ByteBuffer value) { nreserved(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code reserved} field. */
    public CUmemPoolPtrExportData reserved(int index, @NativeType("unsigned char") byte value) { nreserved(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUmemPoolPtrExportData set(CUmemPoolPtrExportData src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUmemPoolPtrExportData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUmemPoolPtrExportData malloc() {
        return wrap(CUmemPoolPtrExportData.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CUmemPoolPtrExportData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUmemPoolPtrExportData calloc() {
        return wrap(CUmemPoolPtrExportData.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CUmemPoolPtrExportData} instance allocated with {@link BufferUtils}. */
    public static CUmemPoolPtrExportData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUmemPoolPtrExportData.class, memAddress(container), container);
    }

    /** Returns a new {@code CUmemPoolPtrExportData} instance for the specified memory address. */
    public static CUmemPoolPtrExportData create(long address) {
        return wrap(CUmemPoolPtrExportData.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUmemPoolPtrExportData createSafe(long address) {
        return address == NULL ? null : wrap(CUmemPoolPtrExportData.class, address);
    }

    /**
     * Returns a new {@link CUmemPoolPtrExportData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUmemPoolPtrExportData.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUmemPoolPtrExportData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUmemPoolPtrExportData.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUmemPoolPtrExportData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUmemPoolPtrExportData.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUmemPoolPtrExportData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUmemPoolPtrExportData.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUmemPoolPtrExportData.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code CUmemPoolPtrExportData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUmemPoolPtrExportData malloc(MemoryStack stack) {
        return wrap(CUmemPoolPtrExportData.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CUmemPoolPtrExportData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUmemPoolPtrExportData calloc(MemoryStack stack) {
        return wrap(CUmemPoolPtrExportData.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUmemPoolPtrExportData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUmemPoolPtrExportData.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUmemPoolPtrExportData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUmemPoolPtrExportData.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #reserved}. */
    public static ByteBuffer nreserved(long struct) { return memByteBuffer(struct + CUmemPoolPtrExportData.RESERVED, 64); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static byte nreserved(long struct, int index) {
        return UNSAFE.getByte(null, struct + CUmemPoolPtrExportData.RESERVED + check(index, 64) * 1);
    }

    /** Unsafe version of {@link #reserved(ByteBuffer) reserved}. */
    public static void nreserved(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 64); }
        memCopy(memAddress(value), struct + CUmemPoolPtrExportData.RESERVED, value.remaining() * 1);
    }
    /** Unsafe version of {@link #reserved(int, byte) reserved}. */
    public static void nreserved(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + CUmemPoolPtrExportData.RESERVED + check(index, 64) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link CUmemPoolPtrExportData} structs. */
    public static class Buffer extends StructBuffer<CUmemPoolPtrExportData, Buffer> implements NativeResource {

        private static final CUmemPoolPtrExportData ELEMENT_FACTORY = CUmemPoolPtrExportData.create(-1L);

        /**
         * Creates a new {@code CUmemPoolPtrExportData.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUmemPoolPtrExportData#SIZEOF}, and its mark will be undefined.
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
        protected CUmemPoolPtrExportData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code reserved} field. */
        @NativeType("unsigned char[64]")
        public ByteBuffer reserved() { return CUmemPoolPtrExportData.nreserved(address()); }
        /** @return the value at the specified index of the {@code reserved} field. */
        @NativeType("unsigned char")
        public byte reserved(int index) { return CUmemPoolPtrExportData.nreserved(address(), index); }

        /** Copies the specified {@link ByteBuffer} to the {@code reserved} field. */
        public CUmemPoolPtrExportData.Buffer reserved(@NativeType("unsigned char[64]") ByteBuffer value) { CUmemPoolPtrExportData.nreserved(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code reserved} field. */
        public CUmemPoolPtrExportData.Buffer reserved(int index, @NativeType("unsigned char") byte value) { CUmemPoolPtrExportData.nreserved(address(), index, value); return this; }

    }

}