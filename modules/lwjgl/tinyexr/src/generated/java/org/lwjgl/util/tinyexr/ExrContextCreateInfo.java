/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct ExrContextCreateInfo {
 *     uint32_t api_version;
 *     {@link ExrAllocator ExrAllocator} const * allocator;
 *     {@link ExrErrorCallbackI ExrErrorCallback} error_callback;
 *     void * error_userdata;
 *     uint32_t flags;
 *     uint32_t max_threads;
 * }</code></pre>
 */
public class ExrContextCreateInfo extends Struct<ExrContextCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        API_VERSION,
        ALLOCATOR,
        ERROR_CALLBACK,
        ERROR_USERDATA,
        FLAGS,
        MAX_THREADS;

    static {
        java.util.Objects.requireNonNull(ExrErrorCallbackI.DESCRIPTOR);

        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        API_VERSION = layout.offsetof(0);
        ALLOCATOR = layout.offsetof(1);
        ERROR_CALLBACK = layout.offsetof(2);
        ERROR_USERDATA = layout.offsetof(3);
        FLAGS = layout.offsetof(4);
        MAX_THREADS = layout.offsetof(5);
    }

    protected ExrContextCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrContextCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new ExrContextCreateInfo(address, container);
    }

    /**
     * Creates a {@code ExrContextCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrContextCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code api_version} field. */
    @NativeType("uint32_t")
    public int api_version() { return napi_version(address()); }
    /** @return a {@link ExrAllocator} view of the struct pointed to by the {@code allocator} field. */
    @NativeType("ExrAllocator const *")
    public @Nullable ExrAllocator allocator() { return nallocator(address()); }
    /** @return the value of the {@code error_callback} field. */
    public @Nullable ExrErrorCallback error_callback() { return nerror_callback(address()); }
    /** @return the value of the {@code error_userdata} field. */
    @NativeType("void *")
    public long error_userdata() { return nerror_userdata(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("uint32_t")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code max_threads} field. */
    @NativeType("uint32_t")
    public int max_threads() { return nmax_threads(address()); }

    /** Sets the specified value to the {@code api_version} field. */
    public ExrContextCreateInfo api_version(@NativeType("uint32_t") int value) { napi_version(address(), value); return this; }
    /** Sets the address of the specified {@link ExrAllocator} to the {@code allocator} field. */
    public ExrContextCreateInfo allocator(@Nullable @NativeType("ExrAllocator const *") ExrAllocator value) { nallocator(address(), value); return this; }
    /** Sets the specified value to the {@code error_callback} field. */
    public ExrContextCreateInfo error_callback(@Nullable @NativeType("ExrErrorCallback") ExrErrorCallbackI value) { nerror_callback(address(), value); return this; }
    /** Sets the specified value to the {@code error_userdata} field. */
    public ExrContextCreateInfo error_userdata(@NativeType("void *") long value) { nerror_userdata(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public ExrContextCreateInfo flags(@NativeType("uint32_t") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code max_threads} field. */
    public ExrContextCreateInfo max_threads(@NativeType("uint32_t") int value) { nmax_threads(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrContextCreateInfo set(
        int api_version,
        @Nullable ExrAllocator allocator,
        @Nullable ExrErrorCallbackI error_callback,
        long error_userdata,
        int flags,
        int max_threads
    ) {
        api_version(api_version);
        allocator(allocator);
        error_callback(error_callback);
        error_userdata(error_userdata);
        flags(flags);
        max_threads(max_threads);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ExrContextCreateInfo set(ExrContextCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrContextCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrContextCreateInfo malloc() {
        return new ExrContextCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrContextCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrContextCreateInfo calloc() {
        return new ExrContextCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrContextCreateInfo} instance allocated with {@link BufferUtils}. */
    public static ExrContextCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrContextCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code ExrContextCreateInfo} instance for the specified memory address. */
    public static ExrContextCreateInfo create(long address) {
        return new ExrContextCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrContextCreateInfo createSafe(long address) {
        return address == NULL ? null : new ExrContextCreateInfo(address, null);
    }

    /**
     * Returns a new {@link ExrContextCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrContextCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrContextCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrContextCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrContextCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrContextCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrContextCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrContextCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrContextCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrContextCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrContextCreateInfo malloc(MemoryStack stack) {
        return new ExrContextCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrContextCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrContextCreateInfo calloc(MemoryStack stack) {
        return new ExrContextCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrContextCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrContextCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrContextCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrContextCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #api_version}. */
    public static int napi_version(long struct) { return memGetInt(struct + ExrContextCreateInfo.API_VERSION); }
    /** Unsafe version of {@link #allocator}. */
    public static @Nullable ExrAllocator nallocator(long struct) { return ExrAllocator.createSafe(memGetAddress(struct + ExrContextCreateInfo.ALLOCATOR)); }
    /** Unsafe version of {@link #error_callback}. */
    public static @Nullable ExrErrorCallback nerror_callback(long struct) { return ExrErrorCallback.createSafe(memGetAddress(struct + ExrContextCreateInfo.ERROR_CALLBACK)); }
    /** Unsafe version of {@link #error_userdata}. */
    public static long nerror_userdata(long struct) { return memGetAddress(struct + ExrContextCreateInfo.ERROR_USERDATA); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + ExrContextCreateInfo.FLAGS); }
    /** Unsafe version of {@link #max_threads}. */
    public static int nmax_threads(long struct) { return memGetInt(struct + ExrContextCreateInfo.MAX_THREADS); }

    /** Unsafe version of {@link #api_version(int) api_version}. */
    public static void napi_version(long struct, int value) { memPutInt(struct + ExrContextCreateInfo.API_VERSION, value); }
    /** Unsafe version of {@link #allocator(ExrAllocator) allocator}. */
    public static void nallocator(long struct, @Nullable ExrAllocator value) { memPutAddress(struct + ExrContextCreateInfo.ALLOCATOR, memAddressSafe(value)); }
    /** Unsafe version of {@link #error_callback(ExrErrorCallbackI) error_callback}. */
    public static void nerror_callback(long struct, @Nullable ExrErrorCallbackI value) { memPutAddress(struct + ExrContextCreateInfo.ERROR_CALLBACK, memAddressSafe(value)); }
    /** Unsafe version of {@link #error_userdata(long) error_userdata}. */
    public static void nerror_userdata(long struct, long value) { memPutAddress(struct + ExrContextCreateInfo.ERROR_USERDATA, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + ExrContextCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #max_threads(int) max_threads}. */
    public static void nmax_threads(long struct, int value) { memPutInt(struct + ExrContextCreateInfo.MAX_THREADS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long allocator = memGetAddress(struct + ExrContextCreateInfo.ALLOCATOR);
        if (allocator != NULL) {
            ExrAllocator.validate(allocator);
        }
    }

    // -----------------------------------

    /** An array of {@link ExrContextCreateInfo} structs. */
    public static class Buffer extends StructBuffer<ExrContextCreateInfo, Buffer> implements NativeResource {

        private static final ExrContextCreateInfo ELEMENT_FACTORY = ExrContextCreateInfo.create(-1L);

        /**
         * Creates a new {@code ExrContextCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrContextCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrContextCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code api_version} field. */
        @NativeType("uint32_t")
        public int api_version() { return ExrContextCreateInfo.napi_version(address()); }
        /** @return a {@link ExrAllocator} view of the struct pointed to by the {@code allocator} field. */
        @NativeType("ExrAllocator const *")
        public @Nullable ExrAllocator allocator() { return ExrContextCreateInfo.nallocator(address()); }
        /** @return the value of the {@code error_callback} field. */
        public @Nullable ExrErrorCallback error_callback() { return ExrContextCreateInfo.nerror_callback(address()); }
        /** @return the value of the {@code error_userdata} field. */
        @NativeType("void *")
        public long error_userdata() { return ExrContextCreateInfo.nerror_userdata(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("uint32_t")
        public int flags() { return ExrContextCreateInfo.nflags(address()); }
        /** @return the value of the {@code max_threads} field. */
        @NativeType("uint32_t")
        public int max_threads() { return ExrContextCreateInfo.nmax_threads(address()); }

        /** Sets the specified value to the {@code api_version} field. */
        public ExrContextCreateInfo.Buffer api_version(@NativeType("uint32_t") int value) { ExrContextCreateInfo.napi_version(address(), value); return this; }
        /** Sets the address of the specified {@link ExrAllocator} to the {@code allocator} field. */
        public ExrContextCreateInfo.Buffer allocator(@Nullable @NativeType("ExrAllocator const *") ExrAllocator value) { ExrContextCreateInfo.nallocator(address(), value); return this; }
        /** Sets the specified value to the {@code error_callback} field. */
        public ExrContextCreateInfo.Buffer error_callback(@Nullable @NativeType("ExrErrorCallback") ExrErrorCallbackI value) { ExrContextCreateInfo.nerror_callback(address(), value); return this; }
        /** Sets the specified value to the {@code error_userdata} field. */
        public ExrContextCreateInfo.Buffer error_userdata(@NativeType("void *") long value) { ExrContextCreateInfo.nerror_userdata(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public ExrContextCreateInfo.Buffer flags(@NativeType("uint32_t") int value) { ExrContextCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code max_threads} field. */
        public ExrContextCreateInfo.Buffer max_threads(@NativeType("uint32_t") int value) { ExrContextCreateInfo.nmax_threads(address(), value); return this; }

    }

}