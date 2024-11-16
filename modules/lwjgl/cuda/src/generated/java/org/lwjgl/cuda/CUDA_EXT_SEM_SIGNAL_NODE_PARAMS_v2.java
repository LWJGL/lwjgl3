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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 {
 *     CUexternalSemaphore * extSemArray;
 *     {@link CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS} const * paramsArray;
 *     unsigned int numExtSems;
 * }</code></pre>
 */
public class CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 extends Struct<CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        EXTSEMARRAY,
        PARAMSARRAY,
        NUMEXTSEMS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        EXTSEMARRAY = layout.offsetof(0);
        PARAMSARRAY = layout.offsetof(1);
        NUMEXTSEMS = layout.offsetof(2);
    }

    protected CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 create(long address, @Nullable ByteBuffer container) {
        return new CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2(address, container);
    }

    /**
     * Creates a {@code CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code extSemArray} field. */
    @NativeType("CUexternalSemaphore *")
    public PointerBuffer extSemArray() { return nextSemArray(address()); }
    /** @return a {@link CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS.Buffer} view of the struct array pointed to by the {@code paramsArray} field. */
    @NativeType("CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS const *")
    public CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS.Buffer paramsArray() { return nparamsArray(address()); }
    /** @return the value of the {@code numExtSems} field. */
    @NativeType("unsigned int")
    public int numExtSems() { return nnumExtSems(address()); }

    /** Sets the address of the specified {@link PointerBuffer} to the {@code extSemArray} field. */
    public CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 extSemArray(@NativeType("CUexternalSemaphore *") PointerBuffer value) { nextSemArray(address(), value); return this; }
    /** Sets the address of the specified {@link CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS.Buffer} to the {@code paramsArray} field. */
    public CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 paramsArray(@NativeType("CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS const *") CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS.Buffer value) { nparamsArray(address(), value); return this; }
    /** Sets the specified value to the {@code numExtSems} field. */
    public CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 numExtSems(@NativeType("unsigned int") int value) { nnumExtSems(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 set(
        PointerBuffer extSemArray,
        CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS.Buffer paramsArray,
        int numExtSems
    ) {
        extSemArray(extSemArray);
        paramsArray(paramsArray);
        numExtSems(numExtSems);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 set(CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 malloc() {
        return new CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 calloc() {
        return new CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2} instance allocated with {@link BufferUtils}. */
    public static CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2(memAddress(container), container);
    }

    /** Returns a new {@code CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2} instance for the specified memory address. */
    public static CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 create(long address) {
        return new CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 createSafe(long address) {
        return address == NULL ? null : new CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2(address, null);
    }

    /**
     * Returns a new {@link CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 malloc(MemoryStack stack) {
        return new CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 calloc(MemoryStack stack) {
        return new CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #extSemArray() extSemArray}. */
    public static PointerBuffer nextSemArray(long struct) { return memPointerBuffer(memGetAddress(struct + CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.EXTSEMARRAY), nnumExtSems(struct)); }
    /** Unsafe version of {@link #paramsArray}. */
    public static CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS.Buffer nparamsArray(long struct) { return CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS.create(memGetAddress(struct + CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.PARAMSARRAY), nnumExtSems(struct)); }
    /** Unsafe version of {@link #numExtSems}. */
    public static int nnumExtSems(long struct) { return memGetInt(struct + CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.NUMEXTSEMS); }

    /** Unsafe version of {@link #extSemArray(PointerBuffer) extSemArray}. */
    public static void nextSemArray(long struct, PointerBuffer value) { memPutAddress(struct + CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.EXTSEMARRAY, memAddress(value)); }
    /** Unsafe version of {@link #paramsArray(CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS.Buffer) paramsArray}. */
    public static void nparamsArray(long struct, CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS.Buffer value) { memPutAddress(struct + CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.PARAMSARRAY, value.address()); }
    /** Sets the specified value to the {@code numExtSems} field of the specified {@code struct}. */
    public static void nnumExtSems(long struct, int value) { memPutInt(struct + CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.NUMEXTSEMS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.EXTSEMARRAY));
        check(memGetAddress(struct + CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.PARAMSARRAY));
    }

    // -----------------------------------

    /** An array of {@link CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2} structs. */
    public static class Buffer extends StructBuffer<CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2, Buffer> implements NativeResource {

        private static final CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 ELEMENT_FACTORY = CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.create(-1L);

        /**
         * Creates a new {@code CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code extSemArray} field. */
        @NativeType("CUexternalSemaphore *")
        public PointerBuffer extSemArray() { return CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.nextSemArray(address()); }
        /** @return a {@link CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS.Buffer} view of the struct array pointed to by the {@code paramsArray} field. */
        @NativeType("CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS const *")
        public CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS.Buffer paramsArray() { return CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.nparamsArray(address()); }
        /** @return the value of the {@code numExtSems} field. */
        @NativeType("unsigned int")
        public int numExtSems() { return CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.nnumExtSems(address()); }

        /** Sets the address of the specified {@link PointerBuffer} to the {@code extSemArray} field. */
        public CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.Buffer extSemArray(@NativeType("CUexternalSemaphore *") PointerBuffer value) { CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.nextSemArray(address(), value); return this; }
        /** Sets the address of the specified {@link CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS.Buffer} to the {@code paramsArray} field. */
        public CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.Buffer paramsArray(@NativeType("CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS const *") CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS.Buffer value) { CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.nparamsArray(address(), value); return this; }
        /** Sets the specified value to the {@code numExtSems} field. */
        public CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.Buffer numExtSems(@NativeType("unsigned int") int value) { CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.nnumExtSems(address(), value); return this; }

    }

}