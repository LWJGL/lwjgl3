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
 * struct CUDA_LAUNCH_PARAMS {
 *     CUfunction function;
 *     unsigned int gridDimX;
 *     unsigned int gridDimY;
 *     unsigned int gridDimZ;
 *     unsigned int blockDimX;
 *     unsigned int blockDimY;
 *     unsigned int blockDimZ;
 *     unsigned int sharedMemBytes;
 *     CUstream hStream;
 *     void ** kernelParams;
 * }</code></pre>
 */
public class CUDA_LAUNCH_PARAMS extends Struct<CUDA_LAUNCH_PARAMS> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FUNCTION,
        GRIDDIMX,
        GRIDDIMY,
        GRIDDIMZ,
        BLOCKDIMX,
        BLOCKDIMY,
        BLOCKDIMZ,
        SHAREDMEMBYTES,
        HSTREAM,
        KERNELPARAMS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FUNCTION = layout.offsetof(0);
        GRIDDIMX = layout.offsetof(1);
        GRIDDIMY = layout.offsetof(2);
        GRIDDIMZ = layout.offsetof(3);
        BLOCKDIMX = layout.offsetof(4);
        BLOCKDIMY = layout.offsetof(5);
        BLOCKDIMZ = layout.offsetof(6);
        SHAREDMEMBYTES = layout.offsetof(7);
        HSTREAM = layout.offsetof(8);
        KERNELPARAMS = layout.offsetof(9);
    }

    protected CUDA_LAUNCH_PARAMS(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUDA_LAUNCH_PARAMS create(long address, @Nullable ByteBuffer container) {
        return new CUDA_LAUNCH_PARAMS(address, container);
    }

    /**
     * Creates a {@code CUDA_LAUNCH_PARAMS} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_LAUNCH_PARAMS(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code function} field. */
    @NativeType("CUfunction")
    public long function() { return nfunction(address()); }
    /** @return the value of the {@code gridDimX} field. */
    @NativeType("unsigned int")
    public int gridDimX() { return ngridDimX(address()); }
    /** @return the value of the {@code gridDimY} field. */
    @NativeType("unsigned int")
    public int gridDimY() { return ngridDimY(address()); }
    /** @return the value of the {@code gridDimZ} field. */
    @NativeType("unsigned int")
    public int gridDimZ() { return ngridDimZ(address()); }
    /** @return the value of the {@code blockDimX} field. */
    @NativeType("unsigned int")
    public int blockDimX() { return nblockDimX(address()); }
    /** @return the value of the {@code blockDimY} field. */
    @NativeType("unsigned int")
    public int blockDimY() { return nblockDimY(address()); }
    /** @return the value of the {@code blockDimZ} field. */
    @NativeType("unsigned int")
    public int blockDimZ() { return nblockDimZ(address()); }
    /** @return the value of the {@code sharedMemBytes} field. */
    @NativeType("unsigned int")
    public int sharedMemBytes() { return nsharedMemBytes(address()); }
    /** @return the value of the {@code hStream} field. */
    @NativeType("CUstream")
    public long hStream() { return nhStream(address()); }
    /**
     * @return a {@link PointerBuffer} view of the data pointed to by the {@code kernelParams} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("void **")
    public @Nullable PointerBuffer kernelParams(int capacity) { return nkernelParams(address(), capacity); }

    /** Sets the specified value to the {@code function} field. */
    public CUDA_LAUNCH_PARAMS function(@NativeType("CUfunction") long value) { nfunction(address(), value); return this; }
    /** Sets the specified value to the {@code gridDimX} field. */
    public CUDA_LAUNCH_PARAMS gridDimX(@NativeType("unsigned int") int value) { ngridDimX(address(), value); return this; }
    /** Sets the specified value to the {@code gridDimY} field. */
    public CUDA_LAUNCH_PARAMS gridDimY(@NativeType("unsigned int") int value) { ngridDimY(address(), value); return this; }
    /** Sets the specified value to the {@code gridDimZ} field. */
    public CUDA_LAUNCH_PARAMS gridDimZ(@NativeType("unsigned int") int value) { ngridDimZ(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimX} field. */
    public CUDA_LAUNCH_PARAMS blockDimX(@NativeType("unsigned int") int value) { nblockDimX(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimY} field. */
    public CUDA_LAUNCH_PARAMS blockDimY(@NativeType("unsigned int") int value) { nblockDimY(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimZ} field. */
    public CUDA_LAUNCH_PARAMS blockDimZ(@NativeType("unsigned int") int value) { nblockDimZ(address(), value); return this; }
    /** Sets the specified value to the {@code sharedMemBytes} field. */
    public CUDA_LAUNCH_PARAMS sharedMemBytes(@NativeType("unsigned int") int value) { nsharedMemBytes(address(), value); return this; }
    /** Sets the specified value to the {@code hStream} field. */
    public CUDA_LAUNCH_PARAMS hStream(@NativeType("CUstream") long value) { nhStream(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code kernelParams} field. */
    public CUDA_LAUNCH_PARAMS kernelParams(@Nullable @NativeType("void **") PointerBuffer value) { nkernelParams(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_LAUNCH_PARAMS set(
        long function,
        int gridDimX,
        int gridDimY,
        int gridDimZ,
        int blockDimX,
        int blockDimY,
        int blockDimZ,
        int sharedMemBytes,
        long hStream,
        @Nullable PointerBuffer kernelParams
    ) {
        function(function);
        gridDimX(gridDimX);
        gridDimY(gridDimY);
        gridDimZ(gridDimZ);
        blockDimX(blockDimX);
        blockDimY(blockDimY);
        blockDimZ(blockDimZ);
        sharedMemBytes(sharedMemBytes);
        hStream(hStream);
        kernelParams(kernelParams);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUDA_LAUNCH_PARAMS set(CUDA_LAUNCH_PARAMS src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_LAUNCH_PARAMS} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_LAUNCH_PARAMS malloc() {
        return new CUDA_LAUNCH_PARAMS(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUDA_LAUNCH_PARAMS} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_LAUNCH_PARAMS calloc() {
        return new CUDA_LAUNCH_PARAMS(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUDA_LAUNCH_PARAMS} instance allocated with {@link BufferUtils}. */
    public static CUDA_LAUNCH_PARAMS create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUDA_LAUNCH_PARAMS(memAddress(container), container);
    }

    /** Returns a new {@code CUDA_LAUNCH_PARAMS} instance for the specified memory address. */
    public static CUDA_LAUNCH_PARAMS create(long address) {
        return new CUDA_LAUNCH_PARAMS(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CUDA_LAUNCH_PARAMS createSafe(long address) {
        return address == NULL ? null : new CUDA_LAUNCH_PARAMS(address, null);
    }

    /**
     * Returns a new {@link CUDA_LAUNCH_PARAMS.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_LAUNCH_PARAMS.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_LAUNCH_PARAMS.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_LAUNCH_PARAMS.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_LAUNCH_PARAMS.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_LAUNCH_PARAMS.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUDA_LAUNCH_PARAMS.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_LAUNCH_PARAMS.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CUDA_LAUNCH_PARAMS.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_LAUNCH_PARAMS mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_LAUNCH_PARAMS callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_LAUNCH_PARAMS mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_LAUNCH_PARAMS callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_LAUNCH_PARAMS.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_LAUNCH_PARAMS.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_LAUNCH_PARAMS.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_LAUNCH_PARAMS.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CUDA_LAUNCH_PARAMS} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_LAUNCH_PARAMS malloc(MemoryStack stack) {
        return new CUDA_LAUNCH_PARAMS(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUDA_LAUNCH_PARAMS} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_LAUNCH_PARAMS calloc(MemoryStack stack) {
        return new CUDA_LAUNCH_PARAMS(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUDA_LAUNCH_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_LAUNCH_PARAMS.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_LAUNCH_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_LAUNCH_PARAMS.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #function}. */
    public static long nfunction(long struct) { return memGetAddress(struct + CUDA_LAUNCH_PARAMS.FUNCTION); }
    /** Unsafe version of {@link #gridDimX}. */
    public static int ngridDimX(long struct) { return memGetInt(struct + CUDA_LAUNCH_PARAMS.GRIDDIMX); }
    /** Unsafe version of {@link #gridDimY}. */
    public static int ngridDimY(long struct) { return memGetInt(struct + CUDA_LAUNCH_PARAMS.GRIDDIMY); }
    /** Unsafe version of {@link #gridDimZ}. */
    public static int ngridDimZ(long struct) { return memGetInt(struct + CUDA_LAUNCH_PARAMS.GRIDDIMZ); }
    /** Unsafe version of {@link #blockDimX}. */
    public static int nblockDimX(long struct) { return memGetInt(struct + CUDA_LAUNCH_PARAMS.BLOCKDIMX); }
    /** Unsafe version of {@link #blockDimY}. */
    public static int nblockDimY(long struct) { return memGetInt(struct + CUDA_LAUNCH_PARAMS.BLOCKDIMY); }
    /** Unsafe version of {@link #blockDimZ}. */
    public static int nblockDimZ(long struct) { return memGetInt(struct + CUDA_LAUNCH_PARAMS.BLOCKDIMZ); }
    /** Unsafe version of {@link #sharedMemBytes}. */
    public static int nsharedMemBytes(long struct) { return memGetInt(struct + CUDA_LAUNCH_PARAMS.SHAREDMEMBYTES); }
    /** Unsafe version of {@link #hStream}. */
    public static long nhStream(long struct) { return memGetAddress(struct + CUDA_LAUNCH_PARAMS.HSTREAM); }
    /** Unsafe version of {@link #kernelParams(int) kernelParams}. */
    public static @Nullable PointerBuffer nkernelParams(long struct, int capacity) { return memPointerBufferSafe(memGetAddress(struct + CUDA_LAUNCH_PARAMS.KERNELPARAMS), capacity); }

    /** Unsafe version of {@link #function(long) function}. */
    public static void nfunction(long struct, long value) { memPutAddress(struct + CUDA_LAUNCH_PARAMS.FUNCTION, check(value)); }
    /** Unsafe version of {@link #gridDimX(int) gridDimX}. */
    public static void ngridDimX(long struct, int value) { memPutInt(struct + CUDA_LAUNCH_PARAMS.GRIDDIMX, value); }
    /** Unsafe version of {@link #gridDimY(int) gridDimY}. */
    public static void ngridDimY(long struct, int value) { memPutInt(struct + CUDA_LAUNCH_PARAMS.GRIDDIMY, value); }
    /** Unsafe version of {@link #gridDimZ(int) gridDimZ}. */
    public static void ngridDimZ(long struct, int value) { memPutInt(struct + CUDA_LAUNCH_PARAMS.GRIDDIMZ, value); }
    /** Unsafe version of {@link #blockDimX(int) blockDimX}. */
    public static void nblockDimX(long struct, int value) { memPutInt(struct + CUDA_LAUNCH_PARAMS.BLOCKDIMX, value); }
    /** Unsafe version of {@link #blockDimY(int) blockDimY}. */
    public static void nblockDimY(long struct, int value) { memPutInt(struct + CUDA_LAUNCH_PARAMS.BLOCKDIMY, value); }
    /** Unsafe version of {@link #blockDimZ(int) blockDimZ}. */
    public static void nblockDimZ(long struct, int value) { memPutInt(struct + CUDA_LAUNCH_PARAMS.BLOCKDIMZ, value); }
    /** Unsafe version of {@link #sharedMemBytes(int) sharedMemBytes}. */
    public static void nsharedMemBytes(long struct, int value) { memPutInt(struct + CUDA_LAUNCH_PARAMS.SHAREDMEMBYTES, value); }
    /** Unsafe version of {@link #hStream(long) hStream}. */
    public static void nhStream(long struct, long value) { memPutAddress(struct + CUDA_LAUNCH_PARAMS.HSTREAM, value); }
    /** Unsafe version of {@link #kernelParams(PointerBuffer) kernelParams}. */
    public static void nkernelParams(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + CUDA_LAUNCH_PARAMS.KERNELPARAMS, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + CUDA_LAUNCH_PARAMS.FUNCTION));
    }

    // -----------------------------------

    /** An array of {@link CUDA_LAUNCH_PARAMS} structs. */
    public static class Buffer extends StructBuffer<CUDA_LAUNCH_PARAMS, Buffer> implements NativeResource {

        private static final CUDA_LAUNCH_PARAMS ELEMENT_FACTORY = CUDA_LAUNCH_PARAMS.create(-1L);

        /**
         * Creates a new {@code CUDA_LAUNCH_PARAMS.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_LAUNCH_PARAMS#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUDA_LAUNCH_PARAMS getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code function} field. */
        @NativeType("CUfunction")
        public long function() { return CUDA_LAUNCH_PARAMS.nfunction(address()); }
        /** @return the value of the {@code gridDimX} field. */
        @NativeType("unsigned int")
        public int gridDimX() { return CUDA_LAUNCH_PARAMS.ngridDimX(address()); }
        /** @return the value of the {@code gridDimY} field. */
        @NativeType("unsigned int")
        public int gridDimY() { return CUDA_LAUNCH_PARAMS.ngridDimY(address()); }
        /** @return the value of the {@code gridDimZ} field. */
        @NativeType("unsigned int")
        public int gridDimZ() { return CUDA_LAUNCH_PARAMS.ngridDimZ(address()); }
        /** @return the value of the {@code blockDimX} field. */
        @NativeType("unsigned int")
        public int blockDimX() { return CUDA_LAUNCH_PARAMS.nblockDimX(address()); }
        /** @return the value of the {@code blockDimY} field. */
        @NativeType("unsigned int")
        public int blockDimY() { return CUDA_LAUNCH_PARAMS.nblockDimY(address()); }
        /** @return the value of the {@code blockDimZ} field. */
        @NativeType("unsigned int")
        public int blockDimZ() { return CUDA_LAUNCH_PARAMS.nblockDimZ(address()); }
        /** @return the value of the {@code sharedMemBytes} field. */
        @NativeType("unsigned int")
        public int sharedMemBytes() { return CUDA_LAUNCH_PARAMS.nsharedMemBytes(address()); }
        /** @return the value of the {@code hStream} field. */
        @NativeType("CUstream")
        public long hStream() { return CUDA_LAUNCH_PARAMS.nhStream(address()); }
        /**
         * @return a {@link PointerBuffer} view of the data pointed to by the {@code kernelParams} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void **")
        public @Nullable PointerBuffer kernelParams(int capacity) { return CUDA_LAUNCH_PARAMS.nkernelParams(address(), capacity); }

        /** Sets the specified value to the {@code function} field. */
        public CUDA_LAUNCH_PARAMS.Buffer function(@NativeType("CUfunction") long value) { CUDA_LAUNCH_PARAMS.nfunction(address(), value); return this; }
        /** Sets the specified value to the {@code gridDimX} field. */
        public CUDA_LAUNCH_PARAMS.Buffer gridDimX(@NativeType("unsigned int") int value) { CUDA_LAUNCH_PARAMS.ngridDimX(address(), value); return this; }
        /** Sets the specified value to the {@code gridDimY} field. */
        public CUDA_LAUNCH_PARAMS.Buffer gridDimY(@NativeType("unsigned int") int value) { CUDA_LAUNCH_PARAMS.ngridDimY(address(), value); return this; }
        /** Sets the specified value to the {@code gridDimZ} field. */
        public CUDA_LAUNCH_PARAMS.Buffer gridDimZ(@NativeType("unsigned int") int value) { CUDA_LAUNCH_PARAMS.ngridDimZ(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimX} field. */
        public CUDA_LAUNCH_PARAMS.Buffer blockDimX(@NativeType("unsigned int") int value) { CUDA_LAUNCH_PARAMS.nblockDimX(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimY} field. */
        public CUDA_LAUNCH_PARAMS.Buffer blockDimY(@NativeType("unsigned int") int value) { CUDA_LAUNCH_PARAMS.nblockDimY(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimZ} field. */
        public CUDA_LAUNCH_PARAMS.Buffer blockDimZ(@NativeType("unsigned int") int value) { CUDA_LAUNCH_PARAMS.nblockDimZ(address(), value); return this; }
        /** Sets the specified value to the {@code sharedMemBytes} field. */
        public CUDA_LAUNCH_PARAMS.Buffer sharedMemBytes(@NativeType("unsigned int") int value) { CUDA_LAUNCH_PARAMS.nsharedMemBytes(address(), value); return this; }
        /** Sets the specified value to the {@code hStream} field. */
        public CUDA_LAUNCH_PARAMS.Buffer hStream(@NativeType("CUstream") long value) { CUDA_LAUNCH_PARAMS.nhStream(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code kernelParams} field. */
        public CUDA_LAUNCH_PARAMS.Buffer kernelParams(@Nullable @NativeType("void **") PointerBuffer value) { CUDA_LAUNCH_PARAMS.nkernelParams(address(), value); return this; }

    }

}