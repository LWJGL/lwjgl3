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
 * Semaphore wait node parameters
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUDA_EXT_SEM_WAIT_NODE_PARAMS {
 *     CUexternalSemaphore * {@link #extSemArray};
 *     {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS} const * {@link #paramsArray};
 *     unsigned int {@link #numExtSems};
 * }</code></pre>
 */
public class CUDA_EXT_SEM_WAIT_NODE_PARAMS extends Struct implements NativeResource {

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

    /**
     * Creates a {@code CUDA_EXT_SEM_WAIT_NODE_PARAMS} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_EXT_SEM_WAIT_NODE_PARAMS(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** array of external semaphore handles */
    @NativeType("CUexternalSemaphore *")
    public PointerBuffer extSemArray() { return nextSemArray(address()); }
    /** array of external semaphore wait parameters */
    @NativeType("CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS const *")
    public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer paramsArray() { return nparamsArray(address()); }
    /** number of handles and parameters supplied in extSemArray and paramsArray */
    @NativeType("unsigned int")
    public int numExtSems() { return nnumExtSems(address()); }

    /** Sets the address of the specified {@link PointerBuffer} to the {@link #extSemArray} field. */
    public CUDA_EXT_SEM_WAIT_NODE_PARAMS extSemArray(@NativeType("CUexternalSemaphore *") PointerBuffer value) { nextSemArray(address(), value); return this; }
    /** Sets the address of the specified {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer} to the {@link #paramsArray} field. */
    public CUDA_EXT_SEM_WAIT_NODE_PARAMS paramsArray(@NativeType("CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS const *") CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer value) { nparamsArray(address(), value); return this; }
    /** Sets the specified value to the {@link #numExtSems} field. */
    public CUDA_EXT_SEM_WAIT_NODE_PARAMS numExtSems(@NativeType("unsigned int") int value) { nnumExtSems(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_EXT_SEM_WAIT_NODE_PARAMS set(
        PointerBuffer extSemArray,
        CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer paramsArray,
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
    public CUDA_EXT_SEM_WAIT_NODE_PARAMS set(CUDA_EXT_SEM_WAIT_NODE_PARAMS src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_EXT_SEM_WAIT_NODE_PARAMS} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_EXT_SEM_WAIT_NODE_PARAMS malloc() {
        return wrap(CUDA_EXT_SEM_WAIT_NODE_PARAMS.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CUDA_EXT_SEM_WAIT_NODE_PARAMS} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_EXT_SEM_WAIT_NODE_PARAMS calloc() {
        return wrap(CUDA_EXT_SEM_WAIT_NODE_PARAMS.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CUDA_EXT_SEM_WAIT_NODE_PARAMS} instance allocated with {@link BufferUtils}. */
    public static CUDA_EXT_SEM_WAIT_NODE_PARAMS create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUDA_EXT_SEM_WAIT_NODE_PARAMS.class, memAddress(container), container);
    }

    /** Returns a new {@code CUDA_EXT_SEM_WAIT_NODE_PARAMS} instance for the specified memory address. */
    public static CUDA_EXT_SEM_WAIT_NODE_PARAMS create(long address) {
        return wrap(CUDA_EXT_SEM_WAIT_NODE_PARAMS.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_EXT_SEM_WAIT_NODE_PARAMS createSafe(long address) {
        return address == NULL ? null : wrap(CUDA_EXT_SEM_WAIT_NODE_PARAMS.class, address);
    }

    /**
     * Returns a new {@link CUDA_EXT_SEM_WAIT_NODE_PARAMS.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_EXT_SEM_WAIT_NODE_PARAMS.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_EXT_SEM_WAIT_NODE_PARAMS.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_EXT_SEM_WAIT_NODE_PARAMS.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_EXT_SEM_WAIT_NODE_PARAMS.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_EXT_SEM_WAIT_NODE_PARAMS.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUDA_EXT_SEM_WAIT_NODE_PARAMS.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_EXT_SEM_WAIT_NODE_PARAMS.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_EXT_SEM_WAIT_NODE_PARAMS.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code CUDA_EXT_SEM_WAIT_NODE_PARAMS} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_EXT_SEM_WAIT_NODE_PARAMS malloc(MemoryStack stack) {
        return wrap(CUDA_EXT_SEM_WAIT_NODE_PARAMS.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CUDA_EXT_SEM_WAIT_NODE_PARAMS} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_EXT_SEM_WAIT_NODE_PARAMS calloc(MemoryStack stack) {
        return wrap(CUDA_EXT_SEM_WAIT_NODE_PARAMS.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUDA_EXT_SEM_WAIT_NODE_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_EXT_SEM_WAIT_NODE_PARAMS.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_EXT_SEM_WAIT_NODE_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_EXT_SEM_WAIT_NODE_PARAMS.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #extSemArray() extSemArray}. */
    public static PointerBuffer nextSemArray(long struct) { return memPointerBuffer(memGetAddress(struct + CUDA_EXT_SEM_WAIT_NODE_PARAMS.EXTSEMARRAY), nnumExtSems(struct)); }
    /** Unsafe version of {@link #paramsArray}. */
    public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer nparamsArray(long struct) { return CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.create(memGetAddress(struct + CUDA_EXT_SEM_WAIT_NODE_PARAMS.PARAMSARRAY), nnumExtSems(struct)); }
    /** Unsafe version of {@link #numExtSems}. */
    public static int nnumExtSems(long struct) { return UNSAFE.getInt(null, struct + CUDA_EXT_SEM_WAIT_NODE_PARAMS.NUMEXTSEMS); }

    /** Unsafe version of {@link #extSemArray(PointerBuffer) extSemArray}. */
    public static void nextSemArray(long struct, PointerBuffer value) { memPutAddress(struct + CUDA_EXT_SEM_WAIT_NODE_PARAMS.EXTSEMARRAY, memAddress(value)); }
    /** Unsafe version of {@link #paramsArray(CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer) paramsArray}. */
    public static void nparamsArray(long struct, CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer value) { memPutAddress(struct + CUDA_EXT_SEM_WAIT_NODE_PARAMS.PARAMSARRAY, value.address()); }
    /** Sets the specified value to the {@code numExtSems} field of the specified {@code struct}. */
    public static void nnumExtSems(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_EXT_SEM_WAIT_NODE_PARAMS.NUMEXTSEMS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + CUDA_EXT_SEM_WAIT_NODE_PARAMS.EXTSEMARRAY));
        check(memGetAddress(struct + CUDA_EXT_SEM_WAIT_NODE_PARAMS.PARAMSARRAY));
    }

    // -----------------------------------

    /** An array of {@link CUDA_EXT_SEM_WAIT_NODE_PARAMS} structs. */
    public static class Buffer extends StructBuffer<CUDA_EXT_SEM_WAIT_NODE_PARAMS, Buffer> implements NativeResource {

        private static final CUDA_EXT_SEM_WAIT_NODE_PARAMS ELEMENT_FACTORY = CUDA_EXT_SEM_WAIT_NODE_PARAMS.create(-1L);

        /**
         * Creates a new {@code CUDA_EXT_SEM_WAIT_NODE_PARAMS.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_EXT_SEM_WAIT_NODE_PARAMS#SIZEOF}, and its mark will be undefined.
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
        protected CUDA_EXT_SEM_WAIT_NODE_PARAMS getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link CUDA_EXT_SEM_WAIT_NODE_PARAMS#extSemArray} field. */
        @NativeType("CUexternalSemaphore *")
        public PointerBuffer extSemArray() { return CUDA_EXT_SEM_WAIT_NODE_PARAMS.nextSemArray(address()); }
        /** @return a {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer} view of the struct array pointed to by the {@link CUDA_EXT_SEM_WAIT_NODE_PARAMS#paramsArray} field. */
        @NativeType("CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS const *")
        public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer paramsArray() { return CUDA_EXT_SEM_WAIT_NODE_PARAMS.nparamsArray(address()); }
        /** @return the value of the {@link CUDA_EXT_SEM_WAIT_NODE_PARAMS#numExtSems} field. */
        @NativeType("unsigned int")
        public int numExtSems() { return CUDA_EXT_SEM_WAIT_NODE_PARAMS.nnumExtSems(address()); }

        /** Sets the address of the specified {@link PointerBuffer} to the {@link CUDA_EXT_SEM_WAIT_NODE_PARAMS#extSemArray} field. */
        public CUDA_EXT_SEM_WAIT_NODE_PARAMS.Buffer extSemArray(@NativeType("CUexternalSemaphore *") PointerBuffer value) { CUDA_EXT_SEM_WAIT_NODE_PARAMS.nextSemArray(address(), value); return this; }
        /** Sets the address of the specified {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer} to the {@link CUDA_EXT_SEM_WAIT_NODE_PARAMS#paramsArray} field. */
        public CUDA_EXT_SEM_WAIT_NODE_PARAMS.Buffer paramsArray(@NativeType("CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS const *") CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer value) { CUDA_EXT_SEM_WAIT_NODE_PARAMS.nparamsArray(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_EXT_SEM_WAIT_NODE_PARAMS#numExtSems} field. */
        public CUDA_EXT_SEM_WAIT_NODE_PARAMS.Buffer numExtSems(@NativeType("unsigned int") int value) { CUDA_EXT_SEM_WAIT_NODE_PARAMS.nnumExtSems(address(), value); return this; }

    }

}