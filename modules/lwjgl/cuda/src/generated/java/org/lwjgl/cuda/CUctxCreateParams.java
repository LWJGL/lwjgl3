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
 * <pre>{@code
 * struct CUctxCreateParams {
 *     {@link CUexecAffinityParam CUexecAffinityParam} * execAffinityParams;
 *     unsigned int numExecAffinityParams;
 *     {@link CUctxCigParam CUctxCigParam} * cigParams;
 * }}</pre>
 */
public class CUctxCreateParams extends Struct<CUctxCreateParams> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        EXECAFFINITYPARAMS,
        NUMEXECAFFINITYPARAMS,
        CIGPARAMS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        EXECAFFINITYPARAMS = layout.offsetof(0);
        NUMEXECAFFINITYPARAMS = layout.offsetof(1);
        CIGPARAMS = layout.offsetof(2);
    }

    protected CUctxCreateParams(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUctxCreateParams create(long address, @Nullable ByteBuffer container) {
        return new CUctxCreateParams(address, container);
    }

    /**
     * Creates a {@code CUctxCreateParams} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUctxCreateParams(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link CUexecAffinityParam.Buffer} view of the struct array pointed to by the {@code execAffinityParams} field. */
    @NativeType("CUexecAffinityParam *")
    public CUexecAffinityParam.@Nullable Buffer execAffinityParams() { return nexecAffinityParams(address()); }
    /** @return the value of the {@code numExecAffinityParams} field. */
    @NativeType("unsigned int")
    public int numExecAffinityParams() { return nnumExecAffinityParams(address()); }
    /** @return a {@link CUctxCigParam} view of the struct pointed to by the {@code cigParams} field. */
    @NativeType("CUctxCigParam *")
    public @Nullable CUctxCigParam cigParams() { return ncigParams(address()); }

    /** Sets the address of the specified {@link CUexecAffinityParam.Buffer} to the {@code execAffinityParams} field. */
    public CUctxCreateParams execAffinityParams(@NativeType("CUexecAffinityParam *") CUexecAffinityParam.@Nullable Buffer value) { nexecAffinityParams(address(), value); return this; }
    /** Sets the specified value to the {@code numExecAffinityParams} field. */
    public CUctxCreateParams numExecAffinityParams(@NativeType("unsigned int") int value) { nnumExecAffinityParams(address(), value); return this; }
    /** Sets the address of the specified {@link CUctxCigParam} to the {@code cigParams} field. */
    public CUctxCreateParams cigParams(@Nullable @NativeType("CUctxCigParam *") CUctxCigParam value) { ncigParams(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUctxCreateParams set(
        CUexecAffinityParam.@Nullable Buffer execAffinityParams,
        int numExecAffinityParams,
        @Nullable CUctxCigParam cigParams
    ) {
        execAffinityParams(execAffinityParams);
        numExecAffinityParams(numExecAffinityParams);
        cigParams(cigParams);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUctxCreateParams set(CUctxCreateParams src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUctxCreateParams} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUctxCreateParams malloc() {
        return new CUctxCreateParams(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUctxCreateParams} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUctxCreateParams calloc() {
        return new CUctxCreateParams(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUctxCreateParams} instance allocated with {@link BufferUtils}. */
    public static CUctxCreateParams create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUctxCreateParams(memAddress(container), container);
    }

    /** Returns a new {@code CUctxCreateParams} instance for the specified memory address. */
    public static CUctxCreateParams create(long address) {
        return new CUctxCreateParams(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CUctxCreateParams createSafe(long address) {
        return address == NULL ? null : new CUctxCreateParams(address, null);
    }

    /**
     * Returns a new {@link CUctxCreateParams.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUctxCreateParams.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUctxCreateParams.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUctxCreateParams.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUctxCreateParams.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUctxCreateParams.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUctxCreateParams.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUctxCreateParams.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CUctxCreateParams.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUctxCreateParams} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUctxCreateParams malloc(MemoryStack stack) {
        return new CUctxCreateParams(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUctxCreateParams} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUctxCreateParams calloc(MemoryStack stack) {
        return new CUctxCreateParams(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUctxCreateParams.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUctxCreateParams.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUctxCreateParams.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUctxCreateParams.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #execAffinityParams}. */
    public static CUexecAffinityParam.@Nullable Buffer nexecAffinityParams(long struct) { return CUexecAffinityParam.createSafe(memGetAddress(struct + CUctxCreateParams.EXECAFFINITYPARAMS), nnumExecAffinityParams(struct)); }
    /** Unsafe version of {@link #numExecAffinityParams}. */
    public static int nnumExecAffinityParams(long struct) { return memGetInt(struct + CUctxCreateParams.NUMEXECAFFINITYPARAMS); }
    /** Unsafe version of {@link #cigParams}. */
    public static @Nullable CUctxCigParam ncigParams(long struct) { return CUctxCigParam.createSafe(memGetAddress(struct + CUctxCreateParams.CIGPARAMS)); }

    /** Unsafe version of {@link #execAffinityParams(CUexecAffinityParam.Buffer) execAffinityParams}. */
    public static void nexecAffinityParams(long struct, CUexecAffinityParam.@Nullable Buffer value) { memPutAddress(struct + CUctxCreateParams.EXECAFFINITYPARAMS, memAddressSafe(value)); nnumExecAffinityParams(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code numExecAffinityParams} field of the specified {@code struct}. */
    public static void nnumExecAffinityParams(long struct, int value) { memPutInt(struct + CUctxCreateParams.NUMEXECAFFINITYPARAMS, value); }
    /** Unsafe version of {@link #cigParams(CUctxCigParam) cigParams}. */
    public static void ncigParams(long struct, @Nullable CUctxCigParam value) { memPutAddress(struct + CUctxCreateParams.CIGPARAMS, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link CUctxCreateParams} structs. */
    public static class Buffer extends StructBuffer<CUctxCreateParams, Buffer> implements NativeResource {

        private static final CUctxCreateParams ELEMENT_FACTORY = CUctxCreateParams.create(-1L);

        /**
         * Creates a new {@code CUctxCreateParams.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUctxCreateParams#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUctxCreateParams getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link CUexecAffinityParam.Buffer} view of the struct array pointed to by the {@code execAffinityParams} field. */
        @NativeType("CUexecAffinityParam *")
        public CUexecAffinityParam.@Nullable Buffer execAffinityParams() { return CUctxCreateParams.nexecAffinityParams(address()); }
        /** @return the value of the {@code numExecAffinityParams} field. */
        @NativeType("unsigned int")
        public int numExecAffinityParams() { return CUctxCreateParams.nnumExecAffinityParams(address()); }
        /** @return a {@link CUctxCigParam} view of the struct pointed to by the {@code cigParams} field. */
        @NativeType("CUctxCigParam *")
        public @Nullable CUctxCigParam cigParams() { return CUctxCreateParams.ncigParams(address()); }

        /** Sets the address of the specified {@link CUexecAffinityParam.Buffer} to the {@code execAffinityParams} field. */
        public CUctxCreateParams.Buffer execAffinityParams(@NativeType("CUexecAffinityParam *") CUexecAffinityParam.@Nullable Buffer value) { CUctxCreateParams.nexecAffinityParams(address(), value); return this; }
        /** Sets the specified value to the {@code numExecAffinityParams} field. */
        public CUctxCreateParams.Buffer numExecAffinityParams(@NativeType("unsigned int") int value) { CUctxCreateParams.nnumExecAffinityParams(address(), value); return this; }
        /** Sets the address of the specified {@link CUctxCigParam} to the {@code cigParams} field. */
        public CUctxCreateParams.Buffer cigParams(@Nullable @NativeType("CUctxCigParam *") CUctxCigParam value) { CUctxCreateParams.ncigParams(address(), value); return this; }

    }

}