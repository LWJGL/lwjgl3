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
 * External semaphore wait parameters.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS {
 *     struct {
 *         struct {
 *             unsigned long long {@link #params_fence_value value};
 *         } fence;
 *         union {
 *             void * fence;
 *             unsigned long long reserved;
 *         } nvSciSync;
 *         struct {
 *             unsigned long long {@link #params_keyedMutex_key key};
 *             unsigned int {@link #params_keyedMutex_timeoutMs timeoutMs};
 *         } keyedMutex;
 *         unsigned int params[10];
 *     } params;
 *     unsigned int {@link #flags};
 *     unsigned int reserved[16];
 * }</code></pre>
 */
public class CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PARAMS,
            PARAMS_FENCE,
                PARAMS_FENCE_VALUE,
            PARAMS_NVSCISYNC,
                PARAMS_NVSCISYNC_FENCE,
                PARAMS_NVSCISYNC_RESERVED,
            PARAMS_KEYEDMUTEX,
                PARAMS_KEYEDMUTEX_KEY,
                PARAMS_KEYEDMUTEX_TIMEOUTMS,
            PARAMS_PARAMS,
        FLAGS,
        RESERVED;

    static {
        Layout layout = __struct(
            __struct(
                __struct(
                    __member(8)
                ),
                __union(
                    __member(POINTER_SIZE),
                    __member(8)
                ),
                __struct(
                    __member(8),
                    __member(4)
                ),
                __array(4, 10)
            ),
            __member(4),
            __array(4, 16)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PARAMS = layout.offsetof(0);
            PARAMS_FENCE = layout.offsetof(1);
                PARAMS_FENCE_VALUE = layout.offsetof(2);
            PARAMS_NVSCISYNC = layout.offsetof(3);
                PARAMS_NVSCISYNC_FENCE = layout.offsetof(4);
                PARAMS_NVSCISYNC_RESERVED = layout.offsetof(5);
            PARAMS_KEYEDMUTEX = layout.offsetof(6);
                PARAMS_KEYEDMUTEX_KEY = layout.offsetof(7);
                PARAMS_KEYEDMUTEX_TIMEOUTMS = layout.offsetof(8);
            PARAMS_PARAMS = layout.offsetof(9);
        FLAGS = layout.offsetof(10);
        RESERVED = layout.offsetof(11);
    }

    /**
     * Creates a {@code CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** value of fence to be waited on */
    @NativeType("unsigned long long")
    public long params_fence_value() { return nparams_fence_value(address()); }
    /** @return the value of the {@code params.nvSciSync.fence} field. */
    @NativeType("void *")
    public long params_nvSciSync_fence() { return nparams_nvSciSync_fence(address()); }
    /** @return the value of the {@code params.nvSciSync.reserved} field. */
    @NativeType("unsigned long long")
    public long params_nvSciSync_reserved() { return nparams_nvSciSync_reserved(address()); }
    /** value of key to acquire the mutex with */
    @NativeType("unsigned long long")
    public long params_keyedMutex_key() { return nparams_keyedMutex_key(address()); }
    /** timeout in milliseconds to wait to acquire the mutex */
    @NativeType("unsigned int")
    public int params_keyedMutex_timeoutMs() { return nparams_keyedMutex_timeoutMs(address()); }
    /** @return a {@link IntBuffer} view of the {@code params.params} field. */
    @NativeType("unsigned int[10]")
    public IntBuffer params_params() { return nparams_params(address()); }
    /** @return the value at the specified index of the {@code params.params} field. */
    @NativeType("unsigned int")
    public int params_params(int index) { return nparams_params(address(), index); }
    /**
     * only when {@code CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS} is used to wait on a {@code CUexternalSemaphore} of type
     * {@link CU#CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC}, the valid flag is {@link CU#CUDA_EXTERNAL_SEMAPHORE_WAIT_SKIP_NVSCIBUF_MEMSYNC} which indicates that while waiting for
     * the {@code CUexternalSemaphore}, no memory synchronization operations should be performed for any external memory object imported as
     * {@link CU#CU_EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF}. For all other types of {@code CUexternalSemaphore}, {@code flags} must be zero.
     */
    @NativeType("unsigned int")
    public int flags() { return nflags(address()); }
    /** @return a {@link IntBuffer} view of the {@code reserved} field. */
    @NativeType("unsigned int[16]")
    public IntBuffer reserved() { return nreserved(address()); }
    /** @return the value at the specified index of the {@code reserved} field. */
    @NativeType("unsigned int")
    public int reserved(int index) { return nreserved(address(), index); }

    /** Sets the specified value to the {@link #params_fence_value} field. */
    public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS params_fence_value(@NativeType("unsigned long long") long value) { nparams_fence_value(address(), value); return this; }
    /** Sets the specified value to the {@code fence} field. */
    public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS params_nvSciSync_fence(@NativeType("void *") long value) { nparams_nvSciSync_fence(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS params_nvSciSync_reserved(@NativeType("unsigned long long") long value) { nparams_nvSciSync_reserved(address(), value); return this; }
    /** Sets the specified value to the {@link #params_keyedMutex_key} field. */
    public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS params_keyedMutex_key(@NativeType("unsigned long long") long value) { nparams_keyedMutex_key(address(), value); return this; }
    /** Sets the specified value to the {@link #params_keyedMutex_timeoutMs} field. */
    public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS params_keyedMutex_timeoutMs(@NativeType("unsigned int") int value) { nparams_keyedMutex_timeoutMs(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code params} field. */
    public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS params_params(@NativeType("unsigned int[10]") IntBuffer value) { nparams_params(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code params} field. */
    public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS params_params(int index, @NativeType("unsigned int") int value) { nparams_params(address(), index, value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS flags(@NativeType("unsigned int") int value) { nflags(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
    public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS reserved(@NativeType("unsigned int[16]") IntBuffer value) { nreserved(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code reserved} field. */
    public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS reserved(int index, @NativeType("unsigned int") int value) { nreserved(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS set(CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS malloc() {
        return wrap(CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS calloc() {
        return wrap(CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS} instance allocated with {@link BufferUtils}. */
    public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.class, memAddress(container), container);
    }

    /** Returns a new {@code CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS} instance for the specified memory address. */
    public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS create(long address) {
        return wrap(CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS createSafe(long address) {
        return address == NULL ? null : wrap(CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.class, address);
    }

    /**
     * Returns a new {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS malloc(MemoryStack stack) {
        return wrap(CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS calloc(MemoryStack stack) {
        return wrap(CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #params_fence_value}. */
    public static long nparams_fence_value(long struct) { return UNSAFE.getLong(null, struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.PARAMS_FENCE_VALUE); }
    /** Unsafe version of {@link #params_nvSciSync_fence}. */
    public static long nparams_nvSciSync_fence(long struct) { return memGetAddress(struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.PARAMS_NVSCISYNC_FENCE); }
    /** Unsafe version of {@link #params_nvSciSync_reserved}. */
    public static long nparams_nvSciSync_reserved(long struct) { return UNSAFE.getLong(null, struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.PARAMS_NVSCISYNC_RESERVED); }
    /** Unsafe version of {@link #params_keyedMutex_key}. */
    public static long nparams_keyedMutex_key(long struct) { return UNSAFE.getLong(null, struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.PARAMS_KEYEDMUTEX_KEY); }
    /** Unsafe version of {@link #params_keyedMutex_timeoutMs}. */
    public static int nparams_keyedMutex_timeoutMs(long struct) { return UNSAFE.getInt(null, struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.PARAMS_KEYEDMUTEX_TIMEOUTMS); }
    /** Unsafe version of {@link #params_params}. */
    public static IntBuffer nparams_params(long struct) { return memIntBuffer(struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.PARAMS_PARAMS, 10); }
    /** Unsafe version of {@link #params_params(int) params_params}. */
    public static int nparams_params(long struct, int index) {
        return UNSAFE.getInt(null, struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.PARAMS_PARAMS + check(index, 10) * 4);
    }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.FLAGS); }
    /** Unsafe version of {@link #reserved}. */
    public static IntBuffer nreserved(long struct) { return memIntBuffer(struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.RESERVED, 16); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static int nreserved(long struct, int index) {
        return UNSAFE.getInt(null, struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.RESERVED + check(index, 16) * 4);
    }

    /** Unsafe version of {@link #params_fence_value(long) params_fence_value}. */
    public static void nparams_fence_value(long struct, long value) { UNSAFE.putLong(null, struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.PARAMS_FENCE_VALUE, value); }
    /** Unsafe version of {@link #params_nvSciSync_fence(long) params_nvSciSync_fence}. */
    public static void nparams_nvSciSync_fence(long struct, long value) { memPutAddress(struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.PARAMS_NVSCISYNC_FENCE, value); }
    /** Unsafe version of {@link #params_nvSciSync_reserved(long) params_nvSciSync_reserved}. */
    public static void nparams_nvSciSync_reserved(long struct, long value) { UNSAFE.putLong(null, struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.PARAMS_NVSCISYNC_RESERVED, value); }
    /** Unsafe version of {@link #params_keyedMutex_key(long) params_keyedMutex_key}. */
    public static void nparams_keyedMutex_key(long struct, long value) { UNSAFE.putLong(null, struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.PARAMS_KEYEDMUTEX_KEY, value); }
    /** Unsafe version of {@link #params_keyedMutex_timeoutMs(int) params_keyedMutex_timeoutMs}. */
    public static void nparams_keyedMutex_timeoutMs(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.PARAMS_KEYEDMUTEX_TIMEOUTMS, value); }
    /** Unsafe version of {@link #params_params(IntBuffer) params_params}. */
    public static void nparams_params(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 10); }
        memCopy(memAddress(value), struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.PARAMS_PARAMS, value.remaining() * 4);
    }
    /** Unsafe version of {@link #params_params(int, int) params_params}. */
    public static void nparams_params(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.PARAMS_PARAMS + check(index, 10) * 4, value);
    }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.FLAGS, value); }
    /** Unsafe version of {@link #reserved(IntBuffer) reserved}. */
    public static void nreserved(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 16); }
        memCopy(memAddress(value), struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.RESERVED, value.remaining() * 4);
    }
    /** Unsafe version of {@link #reserved(int, int) reserved}. */
    public static void nreserved(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.RESERVED + check(index, 16) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS} structs. */
    public static class Buffer extends StructBuffer<CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS, Buffer> implements NativeResource {

        private static final CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS ELEMENT_FACTORY = CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.create(-1L);

        /**
         * Creates a new {@code CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS#SIZEOF}, and its mark will be undefined.
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
        protected CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS#params_fence_value} field. */
        @NativeType("unsigned long long")
        public long params_fence_value() { return CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nparams_fence_value(address()); }
        /** @return the value of the {@code params.nvSciSync.fence} field. */
        @NativeType("void *")
        public long params_nvSciSync_fence() { return CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nparams_nvSciSync_fence(address()); }
        /** @return the value of the {@code params.nvSciSync.reserved} field. */
        @NativeType("unsigned long long")
        public long params_nvSciSync_reserved() { return CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nparams_nvSciSync_reserved(address()); }
        /** @return the value of the {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS#params_keyedMutex_key} field. */
        @NativeType("unsigned long long")
        public long params_keyedMutex_key() { return CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nparams_keyedMutex_key(address()); }
        /** @return the value of the {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS#params_keyedMutex_timeoutMs} field. */
        @NativeType("unsigned int")
        public int params_keyedMutex_timeoutMs() { return CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nparams_keyedMutex_timeoutMs(address()); }
        /** @return a {@link IntBuffer} view of the {@code params.params} field. */
        @NativeType("unsigned int[10]")
        public IntBuffer params_params() { return CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nparams_params(address()); }
        /** @return the value at the specified index of the {@code params.params} field. */
        @NativeType("unsigned int")
        public int params_params(int index) { return CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nparams_params(address(), index); }
        /** @return the value of the {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS#flags} field. */
        @NativeType("unsigned int")
        public int flags() { return CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nflags(address()); }
        /** @return a {@link IntBuffer} view of the {@code reserved} field. */
        @NativeType("unsigned int[16]")
        public IntBuffer reserved() { return CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nreserved(address()); }
        /** @return the value at the specified index of the {@code reserved} field. */
        @NativeType("unsigned int")
        public int reserved(int index) { return CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nreserved(address(), index); }

        /** Sets the specified value to the {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS#params_fence_value} field. */
        public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer params_fence_value(@NativeType("unsigned long long") long value) { CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nparams_fence_value(address(), value); return this; }
        /** Sets the specified value to the {@code fence} field. */
        public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer params_nvSciSync_fence(@NativeType("void *") long value) { CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nparams_nvSciSync_fence(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer params_nvSciSync_reserved(@NativeType("unsigned long long") long value) { CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nparams_nvSciSync_reserved(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS#params_keyedMutex_key} field. */
        public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer params_keyedMutex_key(@NativeType("unsigned long long") long value) { CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nparams_keyedMutex_key(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS#params_keyedMutex_timeoutMs} field. */
        public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer params_keyedMutex_timeoutMs(@NativeType("unsigned int") int value) { CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nparams_keyedMutex_timeoutMs(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code params} field. */
        public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer params_params(@NativeType("unsigned int[10]") IntBuffer value) { CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nparams_params(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code params} field. */
        public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer params_params(int index, @NativeType("unsigned int") int value) { CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nparams_params(address(), index, value); return this; }
        /** Sets the specified value to the {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS#flags} field. */
        public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer flags(@NativeType("unsigned int") int value) { CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nflags(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
        public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer reserved(@NativeType("unsigned int[16]") IntBuffer value) { CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nreserved(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code reserved} field. */
        public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer reserved(int index, @NativeType("unsigned int") int value) { CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nreserved(address(), index, value); return this; }

    }

}