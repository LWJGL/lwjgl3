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
 * External semaphore wait parameters
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code params} &ndash; Parameters for fence objects
 * 
 * <ul>
 * <li>{@code params.fence} &ndash; Value of fence to be waited on</li>
 * </ul></li>
 * <li>{@code flags} &ndash; Flags reserved for the future. Must be zero.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS {
 *     struct {
 *         struct {
 *             unsigned long long value;
 *         } fence;
 *         unsigned int reserved[16];
 *     } params;
 *     unsigned int flags;
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
            PARAMS_RESERVED,
        FLAGS,
        RESERVED;

    static {
        Layout layout = __struct(
            __struct(
                __struct(
                    __member(8)
                ),
                __array(4, 16)
            ),
            __member(4),
            __array(4, 16)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PARAMS = layout.offsetof(0);
            PARAMS_FENCE = layout.offsetof(1);
                PARAMS_FENCE_VALUE = layout.offsetof(2);
            PARAMS_RESERVED = layout.offsetof(3);
        FLAGS = layout.offsetof(4);
        RESERVED = layout.offsetof(5);
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

    /** Returns the value of the {@code params.fence.value} field. */
    @NativeType("unsigned long long")
    public long params_fence_value() { return nparams_fence_value(address()); }
    /** Returns a {@link IntBuffer} view of the {@code params.reserved} field. */
    @NativeType("unsigned int[16]")
    public IntBuffer params_reserved() { return nparams_reserved(address()); }
    /** Returns the value at the specified index of the {@code params.reserved} field. */
    @NativeType("unsigned int")
    public int params_reserved(int index) { return nparams_reserved(address(), index); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("unsigned int")
    public int flags() { return nflags(address()); }
    /** Returns a {@link IntBuffer} view of the {@code reserved} field. */
    @NativeType("unsigned int[16]")
    public IntBuffer reserved() { return nreserved(address()); }
    /** Returns the value at the specified index of the {@code reserved} field. */
    @NativeType("unsigned int")
    public int reserved(int index) { return nreserved(address(), index); }

    /** Sets the specified value to the {@code params.fence.value} field. */
    public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS params_fence_value(@NativeType("unsigned long long") long value) { nparams_fence_value(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code params.reserved} field. */
    public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS params_reserved(@NativeType("unsigned int[16]") IntBuffer value) { nparams_reserved(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code params.reserved} field. */
    public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS params_reserved(int index, @NativeType("unsigned int") int value) { nparams_reserved(address(), index, value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS flags(@NativeType("unsigned int") int value) { nflags(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
    public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS reserved(@NativeType("unsigned int[16]") IntBuffer value) { nreserved(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code reserved} field. */
    public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS reserved(int index, @NativeType("unsigned int") int value) { nreserved(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS set(
        long params_fence_value,
        IntBuffer params_reserved,
        int flags,
        IntBuffer reserved
    ) {
        params_fence_value(params_fence_value);
        params_reserved(params_reserved);
        flags(flags);
        reserved(reserved);

        return this;
    }

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

    /** Returns a new {@code CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS} instance allocated on the thread-local {@link MemoryStack}. */
    public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS mallocStack(MemoryStack stack) {
        return wrap(CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS callocStack(MemoryStack stack) {
        return wrap(CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #params_fence_value}. */
    public static long nparams_fence_value(long struct) { return UNSAFE.getLong(null, struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.PARAMS_FENCE_VALUE); }
    /** Unsafe version of {@link #params_reserved}. */
    public static IntBuffer nparams_reserved(long struct) { return memIntBuffer(struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.PARAMS_RESERVED, 16); }
    /** Unsafe version of {@link #params_reserved(int) params_reserved}. */
    public static int nparams_reserved(long struct, int index) {
        return UNSAFE.getInt(null, struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.PARAMS_RESERVED + check(index, 16) * 4);
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
    /** Unsafe version of {@link #params_reserved(IntBuffer) params_reserved}. */
    public static void nparams_reserved(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 16); }
        memCopy(memAddress(value), struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.PARAMS_RESERVED, value.remaining() * 4);
    }
    /** Unsafe version of {@link #params_reserved(int, int) params_reserved}. */
    public static void nparams_reserved(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.PARAMS_RESERVED + check(index, 16) * 4, value);
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

        /** Returns the value of the {@code params.fence.value} field. */
        @NativeType("unsigned long long")
        public long params_fence_value() { return CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nparams_fence_value(address()); }
        /** Returns a {@link IntBuffer} view of the {@code params.reserved} field. */
        @NativeType("unsigned int[16]")
        public IntBuffer params_reserved() { return CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nparams_reserved(address()); }
        /** Returns the value at the specified index of the {@code params.reserved} field. */
        @NativeType("unsigned int")
        public int params_reserved(int index) { return CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nparams_reserved(address(), index); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("unsigned int")
        public int flags() { return CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nflags(address()); }
        /** Returns a {@link IntBuffer} view of the {@code reserved} field. */
        @NativeType("unsigned int[16]")
        public IntBuffer reserved() { return CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nreserved(address()); }
        /** Returns the value at the specified index of the {@code reserved} field. */
        @NativeType("unsigned int")
        public int reserved(int index) { return CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nreserved(address(), index); }

        /** Sets the specified value to the {@code params.fence.value} field. */
        public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer params_fence_value(@NativeType("unsigned long long") long value) { CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nparams_fence_value(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code params.reserved} field. */
        public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer params_reserved(@NativeType("unsigned int[16]") IntBuffer value) { CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nparams_reserved(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code params.reserved} field. */
        public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer params_reserved(int index, @NativeType("unsigned int") int value) { CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nparams_reserved(address(), index, value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer flags(@NativeType("unsigned int") int value) { CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nflags(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
        public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer reserved(@NativeType("unsigned int[16]") IntBuffer value) { CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nreserved(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code reserved} field. */
        public CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.Buffer reserved(int index, @NativeType("unsigned int") int value) { CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.nreserved(address(), index, value); return this; }

    }

}