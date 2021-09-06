/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Accepted by the {@code host_ptr} argument of {@link CL10#clCreateBuffer CreateBuffer}, {@link CL10#clCreateImage2D CreateImage2D} and {@link CL10#clCreateImage3D CreateImage3D}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct cl_mem_ext_host_ptr {
 *     cl_uint {@link #allocation_type};
 *     cl_uint {@link #host_cache_policy};
 * }</code></pre>
 */
@NativeType("struct cl_mem_ext_host_ptr")
public class CLMemEXTHostPtr extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ALLOCATION_TYPE,
        HOST_CACHE_POLICY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ALLOCATION_TYPE = layout.offsetof(0);
        HOST_CACHE_POLICY = layout.offsetof(1);
    }

    /**
     * Creates a {@code CLMemEXTHostPtr} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CLMemEXTHostPtr(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** type of external memory allocation. Legal values will be defined in layered extensions. */
    @NativeType("cl_uint")
    public int allocation_type() { return nallocation_type(address()); }
    /** host cache policy for this external memory allocation */
    @NativeType("cl_uint")
    public int host_cache_policy() { return nhost_cache_policy(address()); }

    /** Sets the specified value to the {@link #allocation_type} field. */
    public CLMemEXTHostPtr allocation_type(@NativeType("cl_uint") int value) { nallocation_type(address(), value); return this; }
    /** Sets the specified value to the {@link #host_cache_policy} field. */
    public CLMemEXTHostPtr host_cache_policy(@NativeType("cl_uint") int value) { nhost_cache_policy(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CLMemEXTHostPtr set(
        int allocation_type,
        int host_cache_policy
    ) {
        allocation_type(allocation_type);
        host_cache_policy(host_cache_policy);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CLMemEXTHostPtr set(CLMemEXTHostPtr src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CLMemEXTHostPtr} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CLMemEXTHostPtr malloc() {
        return wrap(CLMemEXTHostPtr.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CLMemEXTHostPtr} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CLMemEXTHostPtr calloc() {
        return wrap(CLMemEXTHostPtr.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CLMemEXTHostPtr} instance allocated with {@link BufferUtils}. */
    public static CLMemEXTHostPtr create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CLMemEXTHostPtr.class, memAddress(container), container);
    }

    /** Returns a new {@code CLMemEXTHostPtr} instance for the specified memory address. */
    public static CLMemEXTHostPtr create(long address) {
        return wrap(CLMemEXTHostPtr.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CLMemEXTHostPtr createSafe(long address) {
        return address == NULL ? null : wrap(CLMemEXTHostPtr.class, address);
    }

    /**
     * Returns a new {@link CLMemEXTHostPtr.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLMemEXTHostPtr.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CLMemEXTHostPtr.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLMemEXTHostPtr.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLMemEXTHostPtr.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CLMemEXTHostPtr.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CLMemEXTHostPtr.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CLMemEXTHostPtr.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CLMemEXTHostPtr.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CLMemEXTHostPtr mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CLMemEXTHostPtr callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CLMemEXTHostPtr mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CLMemEXTHostPtr callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CLMemEXTHostPtr.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CLMemEXTHostPtr.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CLMemEXTHostPtr.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CLMemEXTHostPtr.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CLMemEXTHostPtr} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CLMemEXTHostPtr malloc(MemoryStack stack) {
        return wrap(CLMemEXTHostPtr.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CLMemEXTHostPtr} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CLMemEXTHostPtr calloc(MemoryStack stack) {
        return wrap(CLMemEXTHostPtr.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CLMemEXTHostPtr.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLMemEXTHostPtr.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLMemEXTHostPtr.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLMemEXTHostPtr.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #allocation_type}. */
    public static int nallocation_type(long struct) { return UNSAFE.getInt(null, struct + CLMemEXTHostPtr.ALLOCATION_TYPE); }
    /** Unsafe version of {@link #host_cache_policy}. */
    public static int nhost_cache_policy(long struct) { return UNSAFE.getInt(null, struct + CLMemEXTHostPtr.HOST_CACHE_POLICY); }

    /** Unsafe version of {@link #allocation_type(int) allocation_type}. */
    public static void nallocation_type(long struct, int value) { UNSAFE.putInt(null, struct + CLMemEXTHostPtr.ALLOCATION_TYPE, value); }
    /** Unsafe version of {@link #host_cache_policy(int) host_cache_policy}. */
    public static void nhost_cache_policy(long struct, int value) { UNSAFE.putInt(null, struct + CLMemEXTHostPtr.HOST_CACHE_POLICY, value); }

    // -----------------------------------

    /** An array of {@link CLMemEXTHostPtr} structs. */
    public static class Buffer extends StructBuffer<CLMemEXTHostPtr, Buffer> implements NativeResource {

        private static final CLMemEXTHostPtr ELEMENT_FACTORY = CLMemEXTHostPtr.create(-1L);

        /**
         * Creates a new {@code CLMemEXTHostPtr.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CLMemEXTHostPtr#SIZEOF}, and its mark will be undefined.
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
        protected CLMemEXTHostPtr getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link CLMemEXTHostPtr#allocation_type} field. */
        @NativeType("cl_uint")
        public int allocation_type() { return CLMemEXTHostPtr.nallocation_type(address()); }
        /** @return the value of the {@link CLMemEXTHostPtr#host_cache_policy} field. */
        @NativeType("cl_uint")
        public int host_cache_policy() { return CLMemEXTHostPtr.nhost_cache_policy(address()); }

        /** Sets the specified value to the {@link CLMemEXTHostPtr#allocation_type} field. */
        public CLMemEXTHostPtr.Buffer allocation_type(@NativeType("cl_uint") int value) { CLMemEXTHostPtr.nallocation_type(address(), value); return this; }
        /** Sets the specified value to the {@link CLMemEXTHostPtr#host_cache_policy} field. */
        public CLMemEXTHostPtr.Buffer host_cache_policy(@NativeType("cl_uint") int value) { CLMemEXTHostPtr.nhost_cache_policy(address(), value); return this; }

    }

}