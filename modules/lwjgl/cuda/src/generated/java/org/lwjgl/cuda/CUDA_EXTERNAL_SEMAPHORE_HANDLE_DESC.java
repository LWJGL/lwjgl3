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
 * External semaphore handle descriptor.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC {
 *     CUexternalSemaphoreHandleType {@link #type};
 *     union {
 *         int {@link #handle_fd fd};
 *         struct {
 *             void * {@link #handle_win32_handle handle};
 *             void const * {@link #handle_win32_name name};
 *         } win32;
 *         void const * {@link #handle_nvSciSyncObj nvSciSyncObj};
 *     } handle;
 *     unsigned int {@link #flags};
 *     unsigned int reserved[16];
 * }</code></pre>
 */
public class CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        HANDLE,
            HANDLE_FD,
            HANDLE_WIN32,
                HANDLE_WIN32_HANDLE,
                HANDLE_WIN32_NAME,
            HANDLE_NVSCISYNCOBJ,
        FLAGS,
        RESERVED;

    static {
        Layout layout = __struct(
            __member(4),
            __union(
                __member(4),
                __struct(
                    __member(POINTER_SIZE),
                    __member(POINTER_SIZE)
                ),
                __member(POINTER_SIZE)
            ),
            __member(4),
            __array(4, 16)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        HANDLE = layout.offsetof(1);
            HANDLE_FD = layout.offsetof(2);
            HANDLE_WIN32 = layout.offsetof(3);
                HANDLE_WIN32_HANDLE = layout.offsetof(4);
                HANDLE_WIN32_NAME = layout.offsetof(5);
            HANDLE_NVSCISYNCOBJ = layout.offsetof(6);
        FLAGS = layout.offsetof(7);
        RESERVED = layout.offsetof(8);
    }

    /**
     * Creates a {@code CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** type of the handle */
    @NativeType("CUexternalSemaphoreHandleType")
    public int type() { return ntype(address()); }
    /**
     * File descriptor referencing the semaphore object. Valid when type is one of the following:
     * 
     * <ul>
     * <li>{@link CU#CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD}</li>
     * <li>{@link CU#CU_EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_FD EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_FD}</li>
     * </ul>
     */
    public int handle_fd() { return nhandle_fd(address()); }
    /** Valid NT handle. Must be NULL if 'name' is non-NULL */
    @NativeType("void *")
    public long handle_win32_handle() { return nhandle_win32_handle(address()); }
    /** Name of a valid synchronization primitive. Must be NULL if 'handle' is non-NULL. */
    @NativeType("void const *")
    public long handle_win32_name() { return nhandle_win32_name(address()); }
    /** Valid {@code NvSciSyncObj}. Must be non {@code NULL} */
    @NativeType("void const *")
    public long handle_nvSciSyncObj() { return nhandle_nvSciSyncObj(address()); }
    /** Flags reserved for the future. Must be zero. */
    @NativeType("unsigned int")
    public int flags() { return nflags(address()); }
    /** @return a {@link IntBuffer} view of the {@code reserved} field. */
    @NativeType("unsigned int[16]")
    public IntBuffer reserved() { return nreserved(address()); }
    /** @return the value at the specified index of the {@code reserved} field. */
    @NativeType("unsigned int")
    public int reserved(int index) { return nreserved(address(), index); }

    /** Sets the specified value to the {@link #type} field. */
    public CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC type(@NativeType("CUexternalSemaphoreHandleType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #handle_fd} field. */
    public CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC handle_fd(int value) { nhandle_fd(address(), value); return this; }
    /** Sets the specified value to the {@link #handle_win32_handle} field. */
    public CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC handle_win32_handle(@NativeType("void *") long value) { nhandle_win32_handle(address(), value); return this; }
    /** Sets the specified value to the {@link #handle_win32_name} field. */
    public CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC handle_win32_name(@NativeType("void const *") long value) { nhandle_win32_name(address(), value); return this; }
    /** Sets the specified value to the {@link #handle_nvSciSyncObj} field. */
    public CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC handle_nvSciSyncObj(@NativeType("void const *") long value) { nhandle_nvSciSyncObj(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC flags(@NativeType("unsigned int") int value) { nflags(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
    public CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC reserved(@NativeType("unsigned int[16]") IntBuffer value) { nreserved(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code reserved} field. */
    public CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC reserved(int index, @NativeType("unsigned int") int value) { nreserved(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC set(CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC malloc() {
        return wrap(CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC calloc() {
        return wrap(CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC} instance allocated with {@link BufferUtils}. */
    public static CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.class, memAddress(container), container);
    }

    /** Returns a new {@code CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC} instance for the specified memory address. */
    public static CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC create(long address) {
        return wrap(CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC createSafe(long address) {
        return address == NULL ? null : wrap(CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.class, address);
    }

    /**
     * Returns a new {@link CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC malloc(MemoryStack stack) {
        return wrap(CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC calloc(MemoryStack stack) {
        return wrap(CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.TYPE); }
    /** Unsafe version of {@link #handle_fd}. */
    public static int nhandle_fd(long struct) { return UNSAFE.getInt(null, struct + CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.HANDLE_FD); }
    /** Unsafe version of {@link #handle_win32_handle}. */
    public static long nhandle_win32_handle(long struct) { return memGetAddress(struct + CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.HANDLE_WIN32_HANDLE); }
    /** Unsafe version of {@link #handle_win32_name}. */
    public static long nhandle_win32_name(long struct) { return memGetAddress(struct + CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.HANDLE_WIN32_NAME); }
    /** Unsafe version of {@link #handle_nvSciSyncObj}. */
    public static long nhandle_nvSciSyncObj(long struct) { return memGetAddress(struct + CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.HANDLE_NVSCISYNCOBJ); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.FLAGS); }
    /** Unsafe version of {@link #reserved}. */
    public static IntBuffer nreserved(long struct) { return memIntBuffer(struct + CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.RESERVED, 16); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static int nreserved(long struct, int index) {
        return UNSAFE.getInt(null, struct + CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.RESERVED + check(index, 16) * 4);
    }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.TYPE, value); }
    /** Unsafe version of {@link #handle_fd(int) handle_fd}. */
    public static void nhandle_fd(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.HANDLE_FD, value); }
    /** Unsafe version of {@link #handle_win32_handle(long) handle_win32_handle}. */
    public static void nhandle_win32_handle(long struct, long value) { memPutAddress(struct + CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.HANDLE_WIN32_HANDLE, value); }
    /** Unsafe version of {@link #handle_win32_name(long) handle_win32_name}. */
    public static void nhandle_win32_name(long struct, long value) { memPutAddress(struct + CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.HANDLE_WIN32_NAME, value); }
    /** Unsafe version of {@link #handle_nvSciSyncObj(long) handle_nvSciSyncObj}. */
    public static void nhandle_nvSciSyncObj(long struct, long value) { memPutAddress(struct + CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.HANDLE_NVSCISYNCOBJ, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.FLAGS, value); }
    /** Unsafe version of {@link #reserved(IntBuffer) reserved}. */
    public static void nreserved(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 16); }
        memCopy(memAddress(value), struct + CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.RESERVED, value.remaining() * 4);
    }
    /** Unsafe version of {@link #reserved(int, int) reserved}. */
    public static void nreserved(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.RESERVED + check(index, 16) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC} structs. */
    public static class Buffer extends StructBuffer<CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC, Buffer> implements NativeResource {

        private static final CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC ELEMENT_FACTORY = CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.create(-1L);

        /**
         * Creates a new {@code CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC#SIZEOF}, and its mark will be undefined.
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
        protected CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC#type} field. */
        @NativeType("CUexternalSemaphoreHandleType")
        public int type() { return CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.ntype(address()); }
        /** @return the value of the {@link CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC#handle_fd} field. */
        public int handle_fd() { return CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.nhandle_fd(address()); }
        /** @return the value of the {@link CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC#handle_win32_handle} field. */
        @NativeType("void *")
        public long handle_win32_handle() { return CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.nhandle_win32_handle(address()); }
        /** @return the value of the {@link CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC#handle_win32_name} field. */
        @NativeType("void const *")
        public long handle_win32_name() { return CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.nhandle_win32_name(address()); }
        /** @return the value of the {@link CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC#handle_nvSciSyncObj} field. */
        @NativeType("void const *")
        public long handle_nvSciSyncObj() { return CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.nhandle_nvSciSyncObj(address()); }
        /** @return the value of the {@link CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC#flags} field. */
        @NativeType("unsigned int")
        public int flags() { return CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.nflags(address()); }
        /** @return a {@link IntBuffer} view of the {@code reserved} field. */
        @NativeType("unsigned int[16]")
        public IntBuffer reserved() { return CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.nreserved(address()); }
        /** @return the value at the specified index of the {@code reserved} field. */
        @NativeType("unsigned int")
        public int reserved(int index) { return CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.nreserved(address(), index); }

        /** Sets the specified value to the {@link CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC#type} field. */
        public CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer type(@NativeType("CUexternalSemaphoreHandleType") int value) { CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC#handle_fd} field. */
        public CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer handle_fd(int value) { CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.nhandle_fd(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC#handle_win32_handle} field. */
        public CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer handle_win32_handle(@NativeType("void *") long value) { CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.nhandle_win32_handle(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC#handle_win32_name} field. */
        public CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer handle_win32_name(@NativeType("void const *") long value) { CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.nhandle_win32_name(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC#handle_nvSciSyncObj} field. */
        public CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer handle_nvSciSyncObj(@NativeType("void const *") long value) { CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.nhandle_nvSciSyncObj(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC#flags} field. */
        public CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer flags(@NativeType("unsigned int") int value) { CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.nflags(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
        public CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer reserved(@NativeType("unsigned int[16]") IntBuffer value) { CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.nreserved(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code reserved} field. */
        public CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.Buffer reserved(int index, @NativeType("unsigned int") int value) { CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.nreserved(address(), index, value); return this; }

    }

}