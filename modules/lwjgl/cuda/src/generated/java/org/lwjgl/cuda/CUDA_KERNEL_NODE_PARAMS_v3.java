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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUDA_KERNEL_NODE_PARAMS_v3 {
 *     CUfunction func;
 *     unsigned int gridDimX;
 *     unsigned int gridDimY;
 *     unsigned int gridDimZ;
 *     unsigned int blockDimX;
 *     unsigned int blockDimY;
 *     unsigned int blockDimZ;
 *     unsigned int sharedMemBytes;
 *     void ** kernelParams;
 *     void ** extra;
 *     CUkernel kern;
 *     CUcontext ctx;
 * }</code></pre>
 */
public class CUDA_KERNEL_NODE_PARAMS_v3 extends Struct<CUDA_KERNEL_NODE_PARAMS_v3> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FUNC,
        GRIDDIMX,
        GRIDDIMY,
        GRIDDIMZ,
        BLOCKDIMX,
        BLOCKDIMY,
        BLOCKDIMZ,
        SHAREDMEMBYTES,
        KERNELPARAMS,
        EXTRA,
        KERN,
        CTX;

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
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FUNC = layout.offsetof(0);
        GRIDDIMX = layout.offsetof(1);
        GRIDDIMY = layout.offsetof(2);
        GRIDDIMZ = layout.offsetof(3);
        BLOCKDIMX = layout.offsetof(4);
        BLOCKDIMY = layout.offsetof(5);
        BLOCKDIMZ = layout.offsetof(6);
        SHAREDMEMBYTES = layout.offsetof(7);
        KERNELPARAMS = layout.offsetof(8);
        EXTRA = layout.offsetof(9);
        KERN = layout.offsetof(10);
        CTX = layout.offsetof(11);
    }

    protected CUDA_KERNEL_NODE_PARAMS_v3(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUDA_KERNEL_NODE_PARAMS_v3 create(long address, @Nullable ByteBuffer container) {
        return new CUDA_KERNEL_NODE_PARAMS_v3(address, container);
    }

    /**
     * Creates a {@code CUDA_KERNEL_NODE_PARAMS_v3} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_KERNEL_NODE_PARAMS_v3(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code func} field. */
    @NativeType("CUfunction")
    public long func() { return nfunc(address()); }
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
    /**
     * @return a {@link PointerBuffer} view of the data pointed to by the {@code kernelParams} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("void **")
    public @Nullable PointerBuffer kernelParams(int capacity) { return nkernelParams(address(), capacity); }
    /**
     * @return a {@link PointerBuffer} view of the data pointed to by the {@code extra} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("void **")
    public @Nullable PointerBuffer extra(int capacity) { return nextra(address(), capacity); }
    /** @return the value of the {@code kern} field. */
    @NativeType("CUkernel")
    public long kern() { return nkern(address()); }
    /** @return the value of the {@code ctx} field. */
    @NativeType("CUcontext")
    public long ctx() { return nctx(address()); }

    /** Sets the specified value to the {@code func} field. */
    public CUDA_KERNEL_NODE_PARAMS_v3 func(@NativeType("CUfunction") long value) { nfunc(address(), value); return this; }
    /** Sets the specified value to the {@code gridDimX} field. */
    public CUDA_KERNEL_NODE_PARAMS_v3 gridDimX(@NativeType("unsigned int") int value) { ngridDimX(address(), value); return this; }
    /** Sets the specified value to the {@code gridDimY} field. */
    public CUDA_KERNEL_NODE_PARAMS_v3 gridDimY(@NativeType("unsigned int") int value) { ngridDimY(address(), value); return this; }
    /** Sets the specified value to the {@code gridDimZ} field. */
    public CUDA_KERNEL_NODE_PARAMS_v3 gridDimZ(@NativeType("unsigned int") int value) { ngridDimZ(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimX} field. */
    public CUDA_KERNEL_NODE_PARAMS_v3 blockDimX(@NativeType("unsigned int") int value) { nblockDimX(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimY} field. */
    public CUDA_KERNEL_NODE_PARAMS_v3 blockDimY(@NativeType("unsigned int") int value) { nblockDimY(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimZ} field. */
    public CUDA_KERNEL_NODE_PARAMS_v3 blockDimZ(@NativeType("unsigned int") int value) { nblockDimZ(address(), value); return this; }
    /** Sets the specified value to the {@code sharedMemBytes} field. */
    public CUDA_KERNEL_NODE_PARAMS_v3 sharedMemBytes(@NativeType("unsigned int") int value) { nsharedMemBytes(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code kernelParams} field. */
    public CUDA_KERNEL_NODE_PARAMS_v3 kernelParams(@Nullable @NativeType("void **") PointerBuffer value) { nkernelParams(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code extra} field. */
    public CUDA_KERNEL_NODE_PARAMS_v3 extra(@Nullable @NativeType("void **") PointerBuffer value) { nextra(address(), value); return this; }
    /** Sets the specified value to the {@code kern} field. */
    public CUDA_KERNEL_NODE_PARAMS_v3 kern(@NativeType("CUkernel") long value) { nkern(address(), value); return this; }
    /** Sets the specified value to the {@code ctx} field. */
    public CUDA_KERNEL_NODE_PARAMS_v3 ctx(@NativeType("CUcontext") long value) { nctx(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_KERNEL_NODE_PARAMS_v3 set(
        long func,
        int gridDimX,
        int gridDimY,
        int gridDimZ,
        int blockDimX,
        int blockDimY,
        int blockDimZ,
        int sharedMemBytes,
        @Nullable PointerBuffer kernelParams,
        @Nullable PointerBuffer extra,
        long kern,
        long ctx
    ) {
        func(func);
        gridDimX(gridDimX);
        gridDimY(gridDimY);
        gridDimZ(gridDimZ);
        blockDimX(blockDimX);
        blockDimY(blockDimY);
        blockDimZ(blockDimZ);
        sharedMemBytes(sharedMemBytes);
        kernelParams(kernelParams);
        extra(extra);
        kern(kern);
        ctx(ctx);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUDA_KERNEL_NODE_PARAMS_v3 set(CUDA_KERNEL_NODE_PARAMS_v3 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_KERNEL_NODE_PARAMS_v3} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_KERNEL_NODE_PARAMS_v3 malloc() {
        return new CUDA_KERNEL_NODE_PARAMS_v3(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUDA_KERNEL_NODE_PARAMS_v3} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_KERNEL_NODE_PARAMS_v3 calloc() {
        return new CUDA_KERNEL_NODE_PARAMS_v3(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUDA_KERNEL_NODE_PARAMS_v3} instance allocated with {@link BufferUtils}. */
    public static CUDA_KERNEL_NODE_PARAMS_v3 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUDA_KERNEL_NODE_PARAMS_v3(memAddress(container), container);
    }

    /** Returns a new {@code CUDA_KERNEL_NODE_PARAMS_v3} instance for the specified memory address. */
    public static CUDA_KERNEL_NODE_PARAMS_v3 create(long address) {
        return new CUDA_KERNEL_NODE_PARAMS_v3(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CUDA_KERNEL_NODE_PARAMS_v3 createSafe(long address) {
        return address == NULL ? null : new CUDA_KERNEL_NODE_PARAMS_v3(address, null);
    }

    /**
     * Returns a new {@link CUDA_KERNEL_NODE_PARAMS_v3.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_KERNEL_NODE_PARAMS_v3.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_KERNEL_NODE_PARAMS_v3.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_KERNEL_NODE_PARAMS_v3.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_KERNEL_NODE_PARAMS_v3.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_KERNEL_NODE_PARAMS_v3.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUDA_KERNEL_NODE_PARAMS_v3.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_KERNEL_NODE_PARAMS_v3.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CUDA_KERNEL_NODE_PARAMS_v3.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUDA_KERNEL_NODE_PARAMS_v3} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_KERNEL_NODE_PARAMS_v3 malloc(MemoryStack stack) {
        return new CUDA_KERNEL_NODE_PARAMS_v3(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUDA_KERNEL_NODE_PARAMS_v3} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_KERNEL_NODE_PARAMS_v3 calloc(MemoryStack stack) {
        return new CUDA_KERNEL_NODE_PARAMS_v3(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUDA_KERNEL_NODE_PARAMS_v3.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_KERNEL_NODE_PARAMS_v3.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_KERNEL_NODE_PARAMS_v3.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_KERNEL_NODE_PARAMS_v3.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #func}. */
    public static long nfunc(long struct) { return memGetAddress(struct + CUDA_KERNEL_NODE_PARAMS_v3.FUNC); }
    /** Unsafe version of {@link #gridDimX}. */
    public static int ngridDimX(long struct) { return memGetInt(struct + CUDA_KERNEL_NODE_PARAMS_v3.GRIDDIMX); }
    /** Unsafe version of {@link #gridDimY}. */
    public static int ngridDimY(long struct) { return memGetInt(struct + CUDA_KERNEL_NODE_PARAMS_v3.GRIDDIMY); }
    /** Unsafe version of {@link #gridDimZ}. */
    public static int ngridDimZ(long struct) { return memGetInt(struct + CUDA_KERNEL_NODE_PARAMS_v3.GRIDDIMZ); }
    /** Unsafe version of {@link #blockDimX}. */
    public static int nblockDimX(long struct) { return memGetInt(struct + CUDA_KERNEL_NODE_PARAMS_v3.BLOCKDIMX); }
    /** Unsafe version of {@link #blockDimY}. */
    public static int nblockDimY(long struct) { return memGetInt(struct + CUDA_KERNEL_NODE_PARAMS_v3.BLOCKDIMY); }
    /** Unsafe version of {@link #blockDimZ}. */
    public static int nblockDimZ(long struct) { return memGetInt(struct + CUDA_KERNEL_NODE_PARAMS_v3.BLOCKDIMZ); }
    /** Unsafe version of {@link #sharedMemBytes}. */
    public static int nsharedMemBytes(long struct) { return memGetInt(struct + CUDA_KERNEL_NODE_PARAMS_v3.SHAREDMEMBYTES); }
    /** Unsafe version of {@link #kernelParams(int) kernelParams}. */
    public static @Nullable PointerBuffer nkernelParams(long struct, int capacity) { return memPointerBufferSafe(memGetAddress(struct + CUDA_KERNEL_NODE_PARAMS_v3.KERNELPARAMS), capacity); }
    /** Unsafe version of {@link #extra(int) extra}. */
    public static @Nullable PointerBuffer nextra(long struct, int capacity) { return memPointerBufferSafe(memGetAddress(struct + CUDA_KERNEL_NODE_PARAMS_v3.EXTRA), capacity); }
    /** Unsafe version of {@link #kern}. */
    public static long nkern(long struct) { return memGetAddress(struct + CUDA_KERNEL_NODE_PARAMS_v3.KERN); }
    /** Unsafe version of {@link #ctx}. */
    public static long nctx(long struct) { return memGetAddress(struct + CUDA_KERNEL_NODE_PARAMS_v3.CTX); }

    /** Unsafe version of {@link #func(long) func}. */
    public static void nfunc(long struct, long value) { memPutAddress(struct + CUDA_KERNEL_NODE_PARAMS_v3.FUNC, value); }
    /** Unsafe version of {@link #gridDimX(int) gridDimX}. */
    public static void ngridDimX(long struct, int value) { memPutInt(struct + CUDA_KERNEL_NODE_PARAMS_v3.GRIDDIMX, value); }
    /** Unsafe version of {@link #gridDimY(int) gridDimY}. */
    public static void ngridDimY(long struct, int value) { memPutInt(struct + CUDA_KERNEL_NODE_PARAMS_v3.GRIDDIMY, value); }
    /** Unsafe version of {@link #gridDimZ(int) gridDimZ}. */
    public static void ngridDimZ(long struct, int value) { memPutInt(struct + CUDA_KERNEL_NODE_PARAMS_v3.GRIDDIMZ, value); }
    /** Unsafe version of {@link #blockDimX(int) blockDimX}. */
    public static void nblockDimX(long struct, int value) { memPutInt(struct + CUDA_KERNEL_NODE_PARAMS_v3.BLOCKDIMX, value); }
    /** Unsafe version of {@link #blockDimY(int) blockDimY}. */
    public static void nblockDimY(long struct, int value) { memPutInt(struct + CUDA_KERNEL_NODE_PARAMS_v3.BLOCKDIMY, value); }
    /** Unsafe version of {@link #blockDimZ(int) blockDimZ}. */
    public static void nblockDimZ(long struct, int value) { memPutInt(struct + CUDA_KERNEL_NODE_PARAMS_v3.BLOCKDIMZ, value); }
    /** Unsafe version of {@link #sharedMemBytes(int) sharedMemBytes}. */
    public static void nsharedMemBytes(long struct, int value) { memPutInt(struct + CUDA_KERNEL_NODE_PARAMS_v3.SHAREDMEMBYTES, value); }
    /** Unsafe version of {@link #kernelParams(PointerBuffer) kernelParams}. */
    public static void nkernelParams(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + CUDA_KERNEL_NODE_PARAMS_v3.KERNELPARAMS, memAddressSafe(value)); }
    /** Unsafe version of {@link #extra(PointerBuffer) extra}. */
    public static void nextra(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + CUDA_KERNEL_NODE_PARAMS_v3.EXTRA, memAddressSafe(value)); }
    /** Unsafe version of {@link #kern(long) kern}. */
    public static void nkern(long struct, long value) { memPutAddress(struct + CUDA_KERNEL_NODE_PARAMS_v3.KERN, value); }
    /** Unsafe version of {@link #ctx(long) ctx}. */
    public static void nctx(long struct, long value) { memPutAddress(struct + CUDA_KERNEL_NODE_PARAMS_v3.CTX, value); }

    // -----------------------------------

    /** An array of {@link CUDA_KERNEL_NODE_PARAMS_v3} structs. */
    public static class Buffer extends StructBuffer<CUDA_KERNEL_NODE_PARAMS_v3, Buffer> implements NativeResource {

        private static final CUDA_KERNEL_NODE_PARAMS_v3 ELEMENT_FACTORY = CUDA_KERNEL_NODE_PARAMS_v3.create(-1L);

        /**
         * Creates a new {@code CUDA_KERNEL_NODE_PARAMS_v3.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_KERNEL_NODE_PARAMS_v3#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUDA_KERNEL_NODE_PARAMS_v3 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code func} field. */
        @NativeType("CUfunction")
        public long func() { return CUDA_KERNEL_NODE_PARAMS_v3.nfunc(address()); }
        /** @return the value of the {@code gridDimX} field. */
        @NativeType("unsigned int")
        public int gridDimX() { return CUDA_KERNEL_NODE_PARAMS_v3.ngridDimX(address()); }
        /** @return the value of the {@code gridDimY} field. */
        @NativeType("unsigned int")
        public int gridDimY() { return CUDA_KERNEL_NODE_PARAMS_v3.ngridDimY(address()); }
        /** @return the value of the {@code gridDimZ} field. */
        @NativeType("unsigned int")
        public int gridDimZ() { return CUDA_KERNEL_NODE_PARAMS_v3.ngridDimZ(address()); }
        /** @return the value of the {@code blockDimX} field. */
        @NativeType("unsigned int")
        public int blockDimX() { return CUDA_KERNEL_NODE_PARAMS_v3.nblockDimX(address()); }
        /** @return the value of the {@code blockDimY} field. */
        @NativeType("unsigned int")
        public int blockDimY() { return CUDA_KERNEL_NODE_PARAMS_v3.nblockDimY(address()); }
        /** @return the value of the {@code blockDimZ} field. */
        @NativeType("unsigned int")
        public int blockDimZ() { return CUDA_KERNEL_NODE_PARAMS_v3.nblockDimZ(address()); }
        /** @return the value of the {@code sharedMemBytes} field. */
        @NativeType("unsigned int")
        public int sharedMemBytes() { return CUDA_KERNEL_NODE_PARAMS_v3.nsharedMemBytes(address()); }
        /**
         * @return a {@link PointerBuffer} view of the data pointed to by the {@code kernelParams} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void **")
        public @Nullable PointerBuffer kernelParams(int capacity) { return CUDA_KERNEL_NODE_PARAMS_v3.nkernelParams(address(), capacity); }
        /**
         * @return a {@link PointerBuffer} view of the data pointed to by the {@code extra} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void **")
        public @Nullable PointerBuffer extra(int capacity) { return CUDA_KERNEL_NODE_PARAMS_v3.nextra(address(), capacity); }
        /** @return the value of the {@code kern} field. */
        @NativeType("CUkernel")
        public long kern() { return CUDA_KERNEL_NODE_PARAMS_v3.nkern(address()); }
        /** @return the value of the {@code ctx} field. */
        @NativeType("CUcontext")
        public long ctx() { return CUDA_KERNEL_NODE_PARAMS_v3.nctx(address()); }

        /** Sets the specified value to the {@code func} field. */
        public CUDA_KERNEL_NODE_PARAMS_v3.Buffer func(@NativeType("CUfunction") long value) { CUDA_KERNEL_NODE_PARAMS_v3.nfunc(address(), value); return this; }
        /** Sets the specified value to the {@code gridDimX} field. */
        public CUDA_KERNEL_NODE_PARAMS_v3.Buffer gridDimX(@NativeType("unsigned int") int value) { CUDA_KERNEL_NODE_PARAMS_v3.ngridDimX(address(), value); return this; }
        /** Sets the specified value to the {@code gridDimY} field. */
        public CUDA_KERNEL_NODE_PARAMS_v3.Buffer gridDimY(@NativeType("unsigned int") int value) { CUDA_KERNEL_NODE_PARAMS_v3.ngridDimY(address(), value); return this; }
        /** Sets the specified value to the {@code gridDimZ} field. */
        public CUDA_KERNEL_NODE_PARAMS_v3.Buffer gridDimZ(@NativeType("unsigned int") int value) { CUDA_KERNEL_NODE_PARAMS_v3.ngridDimZ(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimX} field. */
        public CUDA_KERNEL_NODE_PARAMS_v3.Buffer blockDimX(@NativeType("unsigned int") int value) { CUDA_KERNEL_NODE_PARAMS_v3.nblockDimX(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimY} field. */
        public CUDA_KERNEL_NODE_PARAMS_v3.Buffer blockDimY(@NativeType("unsigned int") int value) { CUDA_KERNEL_NODE_PARAMS_v3.nblockDimY(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimZ} field. */
        public CUDA_KERNEL_NODE_PARAMS_v3.Buffer blockDimZ(@NativeType("unsigned int") int value) { CUDA_KERNEL_NODE_PARAMS_v3.nblockDimZ(address(), value); return this; }
        /** Sets the specified value to the {@code sharedMemBytes} field. */
        public CUDA_KERNEL_NODE_PARAMS_v3.Buffer sharedMemBytes(@NativeType("unsigned int") int value) { CUDA_KERNEL_NODE_PARAMS_v3.nsharedMemBytes(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code kernelParams} field. */
        public CUDA_KERNEL_NODE_PARAMS_v3.Buffer kernelParams(@Nullable @NativeType("void **") PointerBuffer value) { CUDA_KERNEL_NODE_PARAMS_v3.nkernelParams(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code extra} field. */
        public CUDA_KERNEL_NODE_PARAMS_v3.Buffer extra(@Nullable @NativeType("void **") PointerBuffer value) { CUDA_KERNEL_NODE_PARAMS_v3.nextra(address(), value); return this; }
        /** Sets the specified value to the {@code kern} field. */
        public CUDA_KERNEL_NODE_PARAMS_v3.Buffer kern(@NativeType("CUkernel") long value) { CUDA_KERNEL_NODE_PARAMS_v3.nkern(address(), value); return this; }
        /** Sets the specified value to the {@code ctx} field. */
        public CUDA_KERNEL_NODE_PARAMS_v3.Buffer ctx(@NativeType("CUcontext") long value) { CUDA_KERNEL_NODE_PARAMS_v3.nctx(address(), value); return this; }

    }

}