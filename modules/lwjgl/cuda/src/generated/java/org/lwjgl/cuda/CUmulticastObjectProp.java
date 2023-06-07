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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUmulticastObjectProp {
 *     unsigned int numDevices;
 *     size_t size;
 *     unsigned long long handleTypes;
 *     unsigned long long flags;
 * }</code></pre>
 */
public class CUmulticastObjectProp extends Struct<CUmulticastObjectProp> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NUMDEVICES,
        SIZE,
        HANDLETYPES,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NUMDEVICES = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        HANDLETYPES = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
    }

    protected CUmulticastObjectProp(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUmulticastObjectProp create(long address, @Nullable ByteBuffer container) {
        return new CUmulticastObjectProp(address, container);
    }

    /**
     * Creates a {@code CUmulticastObjectProp} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUmulticastObjectProp(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code numDevices} field. */
    @NativeType("unsigned int")
    public int numDevices() { return nnumDevices(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("size_t")
    public long size() { return nsize(address()); }
    /** @return the value of the {@code handleTypes} field. */
    @NativeType("unsigned long long")
    public long handleTypes() { return nhandleTypes(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("unsigned long long")
    public long flags() { return nflags(address()); }

    /** Sets the specified value to the {@code numDevices} field. */
    public CUmulticastObjectProp numDevices(@NativeType("unsigned int") int value) { nnumDevices(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public CUmulticastObjectProp size(@NativeType("size_t") long value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code handleTypes} field. */
    public CUmulticastObjectProp handleTypes(@NativeType("unsigned long long") long value) { nhandleTypes(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public CUmulticastObjectProp flags(@NativeType("unsigned long long") long value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUmulticastObjectProp set(
        int numDevices,
        long size,
        long handleTypes,
        long flags
    ) {
        numDevices(numDevices);
        size(size);
        handleTypes(handleTypes);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUmulticastObjectProp set(CUmulticastObjectProp src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUmulticastObjectProp} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUmulticastObjectProp malloc() {
        return new CUmulticastObjectProp(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUmulticastObjectProp} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUmulticastObjectProp calloc() {
        return new CUmulticastObjectProp(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUmulticastObjectProp} instance allocated with {@link BufferUtils}. */
    public static CUmulticastObjectProp create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUmulticastObjectProp(memAddress(container), container);
    }

    /** Returns a new {@code CUmulticastObjectProp} instance for the specified memory address. */
    public static CUmulticastObjectProp create(long address) {
        return new CUmulticastObjectProp(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUmulticastObjectProp createSafe(long address) {
        return address == NULL ? null : new CUmulticastObjectProp(address, null);
    }

    /**
     * Returns a new {@link CUmulticastObjectProp.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUmulticastObjectProp.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUmulticastObjectProp.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUmulticastObjectProp.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUmulticastObjectProp.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUmulticastObjectProp.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUmulticastObjectProp.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUmulticastObjectProp.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUmulticastObjectProp.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUmulticastObjectProp} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUmulticastObjectProp malloc(MemoryStack stack) {
        return new CUmulticastObjectProp(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUmulticastObjectProp} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUmulticastObjectProp calloc(MemoryStack stack) {
        return new CUmulticastObjectProp(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUmulticastObjectProp.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUmulticastObjectProp.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUmulticastObjectProp.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUmulticastObjectProp.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #numDevices}. */
    public static int nnumDevices(long struct) { return UNSAFE.getInt(null, struct + CUmulticastObjectProp.NUMDEVICES); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetAddress(struct + CUmulticastObjectProp.SIZE); }
    /** Unsafe version of {@link #handleTypes}. */
    public static long nhandleTypes(long struct) { return UNSAFE.getLong(null, struct + CUmulticastObjectProp.HANDLETYPES); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return UNSAFE.getLong(null, struct + CUmulticastObjectProp.FLAGS); }

    /** Unsafe version of {@link #numDevices(int) numDevices}. */
    public static void nnumDevices(long struct, int value) { UNSAFE.putInt(null, struct + CUmulticastObjectProp.NUMDEVICES, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutAddress(struct + CUmulticastObjectProp.SIZE, value); }
    /** Unsafe version of {@link #handleTypes(long) handleTypes}. */
    public static void nhandleTypes(long struct, long value) { UNSAFE.putLong(null, struct + CUmulticastObjectProp.HANDLETYPES, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { UNSAFE.putLong(null, struct + CUmulticastObjectProp.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link CUmulticastObjectProp} structs. */
    public static class Buffer extends StructBuffer<CUmulticastObjectProp, Buffer> implements NativeResource {

        private static final CUmulticastObjectProp ELEMENT_FACTORY = CUmulticastObjectProp.create(-1L);

        /**
         * Creates a new {@code CUmulticastObjectProp.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUmulticastObjectProp#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUmulticastObjectProp getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code numDevices} field. */
        @NativeType("unsigned int")
        public int numDevices() { return CUmulticastObjectProp.nnumDevices(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("size_t")
        public long size() { return CUmulticastObjectProp.nsize(address()); }
        /** @return the value of the {@code handleTypes} field. */
        @NativeType("unsigned long long")
        public long handleTypes() { return CUmulticastObjectProp.nhandleTypes(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("unsigned long long")
        public long flags() { return CUmulticastObjectProp.nflags(address()); }

        /** Sets the specified value to the {@code numDevices} field. */
        public CUmulticastObjectProp.Buffer numDevices(@NativeType("unsigned int") int value) { CUmulticastObjectProp.nnumDevices(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public CUmulticastObjectProp.Buffer size(@NativeType("size_t") long value) { CUmulticastObjectProp.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code handleTypes} field. */
        public CUmulticastObjectProp.Buffer handleTypes(@NativeType("unsigned long long") long value) { CUmulticastObjectProp.nhandleTypes(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public CUmulticastObjectProp.Buffer flags(@NativeType("unsigned long long") long value) { CUmulticastObjectProp.nflags(address(), value); return this; }

    }

}