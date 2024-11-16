/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUctxCigParam {
 *     CUtensorMapDataType sharedDataType;
 *     void * sharedData;
 * }</code></pre>
 */
public class CUctxCigParam extends Struct<CUctxCigParam> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SHAREDDATATYPE,
        SHAREDDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SHAREDDATATYPE = layout.offsetof(0);
        SHAREDDATA = layout.offsetof(1);
    }

    protected CUctxCigParam(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUctxCigParam create(long address, @Nullable ByteBuffer container) {
        return new CUctxCigParam(address, container);
    }

    /**
     * Creates a {@code CUctxCigParam} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUctxCigParam(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sharedDataType} field. */
    @NativeType("CUtensorMapDataType")
    public int sharedDataType() { return nsharedDataType(address()); }
    /** @return the value of the {@code sharedData} field. */
    @NativeType("void *")
    public long sharedData() { return nsharedData(address()); }

    /** Sets the specified value to the {@code sharedDataType} field. */
    public CUctxCigParam sharedDataType(@NativeType("CUtensorMapDataType") int value) { nsharedDataType(address(), value); return this; }
    /** Sets the specified value to the {@code sharedData} field. */
    public CUctxCigParam sharedData(@NativeType("void *") long value) { nsharedData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUctxCigParam set(
        int sharedDataType,
        long sharedData
    ) {
        sharedDataType(sharedDataType);
        sharedData(sharedData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUctxCigParam set(CUctxCigParam src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUctxCigParam} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUctxCigParam malloc() {
        return new CUctxCigParam(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUctxCigParam} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUctxCigParam calloc() {
        return new CUctxCigParam(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUctxCigParam} instance allocated with {@link BufferUtils}. */
    public static CUctxCigParam create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUctxCigParam(memAddress(container), container);
    }

    /** Returns a new {@code CUctxCigParam} instance for the specified memory address. */
    public static CUctxCigParam create(long address) {
        return new CUctxCigParam(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CUctxCigParam createSafe(long address) {
        return address == NULL ? null : new CUctxCigParam(address, null);
    }

    /**
     * Returns a new {@link CUctxCigParam.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUctxCigParam.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUctxCigParam.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUctxCigParam.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUctxCigParam.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUctxCigParam.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUctxCigParam.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUctxCigParam.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CUctxCigParam.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUctxCigParam} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUctxCigParam malloc(MemoryStack stack) {
        return new CUctxCigParam(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUctxCigParam} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUctxCigParam calloc(MemoryStack stack) {
        return new CUctxCigParam(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUctxCigParam.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUctxCigParam.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUctxCigParam.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUctxCigParam.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sharedDataType}. */
    public static int nsharedDataType(long struct) { return memGetInt(struct + CUctxCigParam.SHAREDDATATYPE); }
    /** Unsafe version of {@link #sharedData}. */
    public static long nsharedData(long struct) { return memGetAddress(struct + CUctxCigParam.SHAREDDATA); }

    /** Unsafe version of {@link #sharedDataType(int) sharedDataType}. */
    public static void nsharedDataType(long struct, int value) { memPutInt(struct + CUctxCigParam.SHAREDDATATYPE, value); }
    /** Unsafe version of {@link #sharedData(long) sharedData}. */
    public static void nsharedData(long struct, long value) { memPutAddress(struct + CUctxCigParam.SHAREDDATA, value); }

    // -----------------------------------

    /** An array of {@link CUctxCigParam} structs. */
    public static class Buffer extends StructBuffer<CUctxCigParam, Buffer> implements NativeResource {

        private static final CUctxCigParam ELEMENT_FACTORY = CUctxCigParam.create(-1L);

        /**
         * Creates a new {@code CUctxCigParam.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUctxCigParam#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUctxCigParam getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sharedDataType} field. */
        @NativeType("CUtensorMapDataType")
        public int sharedDataType() { return CUctxCigParam.nsharedDataType(address()); }
        /** @return the value of the {@code sharedData} field. */
        @NativeType("void *")
        public long sharedData() { return CUctxCigParam.nsharedData(address()); }

        /** Sets the specified value to the {@code sharedDataType} field. */
        public CUctxCigParam.Buffer sharedDataType(@NativeType("CUtensorMapDataType") int value) { CUctxCigParam.nsharedDataType(address(), value); return this; }
        /** Sets the specified value to the {@code sharedData} field. */
        public CUctxCigParam.Buffer sharedData(@NativeType("void *") long value) { CUctxCigParam.nsharedData(address(), value); return this; }

    }

}