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
 * Host node parameters.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUDA_HOST_NODE_PARAMS {
 *     void (*{@link CUhostFnI fn}) (void *userData);
 *     void * {@link #userData};
 * }</code></pre>
 */
public class CUDA_HOST_NODE_PARAMS extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FN,
        USERDATA;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FN = layout.offsetof(0);
        USERDATA = layout.offsetof(1);
    }

    /**
     * Creates a {@code CUDA_HOST_NODE_PARAMS} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_HOST_NODE_PARAMS(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** The function to call when the node executes */
    @NativeType("void (*) (void *)")
    public CUhostFn fn() { return nfn(address()); }
    /** Argument to pass to the function */
    @NativeType("void *")
    public long userData() { return nuserData(address()); }

    /** Sets the specified value to the {@link #fn} field. */
    public CUDA_HOST_NODE_PARAMS fn(@NativeType("void (*) (void *)") CUhostFnI value) { nfn(address(), value); return this; }
    /** Sets the specified value to the {@link #userData} field. */
    public CUDA_HOST_NODE_PARAMS userData(@NativeType("void *") long value) { nuserData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_HOST_NODE_PARAMS set(
        CUhostFnI fn,
        long userData
    ) {
        fn(fn);
        userData(userData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUDA_HOST_NODE_PARAMS set(CUDA_HOST_NODE_PARAMS src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_HOST_NODE_PARAMS} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_HOST_NODE_PARAMS malloc() {
        return wrap(CUDA_HOST_NODE_PARAMS.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CUDA_HOST_NODE_PARAMS} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_HOST_NODE_PARAMS calloc() {
        return wrap(CUDA_HOST_NODE_PARAMS.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CUDA_HOST_NODE_PARAMS} instance allocated with {@link BufferUtils}. */
    public static CUDA_HOST_NODE_PARAMS create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUDA_HOST_NODE_PARAMS.class, memAddress(container), container);
    }

    /** Returns a new {@code CUDA_HOST_NODE_PARAMS} instance for the specified memory address. */
    public static CUDA_HOST_NODE_PARAMS create(long address) {
        return wrap(CUDA_HOST_NODE_PARAMS.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_HOST_NODE_PARAMS createSafe(long address) {
        return address == NULL ? null : wrap(CUDA_HOST_NODE_PARAMS.class, address);
    }

    /**
     * Returns a new {@link CUDA_HOST_NODE_PARAMS.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_HOST_NODE_PARAMS.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_HOST_NODE_PARAMS.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_HOST_NODE_PARAMS.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_HOST_NODE_PARAMS.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_HOST_NODE_PARAMS.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUDA_HOST_NODE_PARAMS.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_HOST_NODE_PARAMS.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_HOST_NODE_PARAMS.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_HOST_NODE_PARAMS mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_HOST_NODE_PARAMS callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_HOST_NODE_PARAMS mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_HOST_NODE_PARAMS callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_HOST_NODE_PARAMS.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_HOST_NODE_PARAMS.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_HOST_NODE_PARAMS.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_HOST_NODE_PARAMS.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CUDA_HOST_NODE_PARAMS} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_HOST_NODE_PARAMS malloc(MemoryStack stack) {
        return wrap(CUDA_HOST_NODE_PARAMS.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CUDA_HOST_NODE_PARAMS} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_HOST_NODE_PARAMS calloc(MemoryStack stack) {
        return wrap(CUDA_HOST_NODE_PARAMS.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUDA_HOST_NODE_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_HOST_NODE_PARAMS.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_HOST_NODE_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_HOST_NODE_PARAMS.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #fn}. */
    public static CUhostFn nfn(long struct) { return CUhostFn.create(memGetAddress(struct + CUDA_HOST_NODE_PARAMS.FN)); }
    /** Unsafe version of {@link #userData}. */
    public static long nuserData(long struct) { return memGetAddress(struct + CUDA_HOST_NODE_PARAMS.USERDATA); }

    /** Unsafe version of {@link #fn(CUhostFnI) fn}. */
    public static void nfn(long struct, CUhostFnI value) { memPutAddress(struct + CUDA_HOST_NODE_PARAMS.FN, value.address()); }
    /** Unsafe version of {@link #userData(long) userData}. */
    public static void nuserData(long struct, long value) { memPutAddress(struct + CUDA_HOST_NODE_PARAMS.USERDATA, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + CUDA_HOST_NODE_PARAMS.FN));
    }

    // -----------------------------------

    /** An array of {@link CUDA_HOST_NODE_PARAMS} structs. */
    public static class Buffer extends StructBuffer<CUDA_HOST_NODE_PARAMS, Buffer> implements NativeResource {

        private static final CUDA_HOST_NODE_PARAMS ELEMENT_FACTORY = CUDA_HOST_NODE_PARAMS.create(-1L);

        /**
         * Creates a new {@code CUDA_HOST_NODE_PARAMS.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_HOST_NODE_PARAMS#SIZEOF}, and its mark will be undefined.
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
        protected CUDA_HOST_NODE_PARAMS getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link CUDA_HOST_NODE_PARAMS#fn} field. */
        @NativeType("void (*) (void *)")
        public CUhostFn fn() { return CUDA_HOST_NODE_PARAMS.nfn(address()); }
        /** @return the value of the {@link CUDA_HOST_NODE_PARAMS#userData} field. */
        @NativeType("void *")
        public long userData() { return CUDA_HOST_NODE_PARAMS.nuserData(address()); }

        /** Sets the specified value to the {@link CUDA_HOST_NODE_PARAMS#fn} field. */
        public CUDA_HOST_NODE_PARAMS.Buffer fn(@NativeType("void (*) (void *)") CUhostFnI value) { CUDA_HOST_NODE_PARAMS.nfn(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_HOST_NODE_PARAMS#userData} field. */
        public CUDA_HOST_NODE_PARAMS.Buffer userData(@NativeType("void *") long value) { CUDA_HOST_NODE_PARAMS.nuserData(address(), value); return this; }

    }

}