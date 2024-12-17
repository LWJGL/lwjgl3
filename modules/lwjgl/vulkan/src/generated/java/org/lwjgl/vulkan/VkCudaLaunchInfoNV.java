/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkCudaLaunchInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkCudaFunctionNV function;
 *     uint32_t gridDimX;
 *     uint32_t gridDimY;
 *     uint32_t gridDimZ;
 *     uint32_t blockDimX;
 *     uint32_t blockDimY;
 *     uint32_t blockDimZ;
 *     uint32_t sharedMemBytes;
 *     size_t paramCount;
 *     void const * const * pParams;
 *     size_t extraCount;
 *     void const * const * pExtras;
 * }}</pre>
 */
public class VkCudaLaunchInfoNV extends Struct<VkCudaLaunchInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FUNCTION,
        GRIDDIMX,
        GRIDDIMY,
        GRIDDIMZ,
        BLOCKDIMX,
        BLOCKDIMY,
        BLOCKDIMZ,
        SHAREDMEMBYTES,
        PARAMCOUNT,
        PPARAMS,
        EXTRACOUNT,
        PEXTRAS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
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

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FUNCTION = layout.offsetof(2);
        GRIDDIMX = layout.offsetof(3);
        GRIDDIMY = layout.offsetof(4);
        GRIDDIMZ = layout.offsetof(5);
        BLOCKDIMX = layout.offsetof(6);
        BLOCKDIMY = layout.offsetof(7);
        BLOCKDIMZ = layout.offsetof(8);
        SHAREDMEMBYTES = layout.offsetof(9);
        PARAMCOUNT = layout.offsetof(10);
        PPARAMS = layout.offsetof(11);
        EXTRACOUNT = layout.offsetof(12);
        PEXTRAS = layout.offsetof(13);
    }

    protected VkCudaLaunchInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCudaLaunchInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkCudaLaunchInfoNV(address, container);
    }

    /**
     * Creates a {@code VkCudaLaunchInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCudaLaunchInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code function} field. */
    @NativeType("VkCudaFunctionNV")
    public long function() { return nfunction(address()); }
    /** @return the value of the {@code gridDimX} field. */
    @NativeType("uint32_t")
    public int gridDimX() { return ngridDimX(address()); }
    /** @return the value of the {@code gridDimY} field. */
    @NativeType("uint32_t")
    public int gridDimY() { return ngridDimY(address()); }
    /** @return the value of the {@code gridDimZ} field. */
    @NativeType("uint32_t")
    public int gridDimZ() { return ngridDimZ(address()); }
    /** @return the value of the {@code blockDimX} field. */
    @NativeType("uint32_t")
    public int blockDimX() { return nblockDimX(address()); }
    /** @return the value of the {@code blockDimY} field. */
    @NativeType("uint32_t")
    public int blockDimY() { return nblockDimY(address()); }
    /** @return the value of the {@code blockDimZ} field. */
    @NativeType("uint32_t")
    public int blockDimZ() { return nblockDimZ(address()); }
    /** @return the value of the {@code sharedMemBytes} field. */
    @NativeType("uint32_t")
    public int sharedMemBytes() { return nsharedMemBytes(address()); }
    /** @return the value of the {@code paramCount} field. */
    @NativeType("size_t")
    public long paramCount() { return nparamCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code pParams} field. */
    @NativeType("void const * const *")
    public @Nullable PointerBuffer pParams() { return npParams(address()); }
    /** @return the value of the {@code extraCount} field. */
    @NativeType("size_t")
    public long extraCount() { return nextraCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code pExtras} field. */
    @NativeType("void const * const *")
    public @Nullable PointerBuffer pExtras() { return npExtras(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCudaLaunchInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVCudaKernelLaunch#VK_STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV} value to the {@code sType} field. */
    public VkCudaLaunchInfoNV sType$Default() { return sType(NVCudaKernelLaunch.VK_STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCudaLaunchInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code function} field. */
    public VkCudaLaunchInfoNV function(@NativeType("VkCudaFunctionNV") long value) { nfunction(address(), value); return this; }
    /** Sets the specified value to the {@code gridDimX} field. */
    public VkCudaLaunchInfoNV gridDimX(@NativeType("uint32_t") int value) { ngridDimX(address(), value); return this; }
    /** Sets the specified value to the {@code gridDimY} field. */
    public VkCudaLaunchInfoNV gridDimY(@NativeType("uint32_t") int value) { ngridDimY(address(), value); return this; }
    /** Sets the specified value to the {@code gridDimZ} field. */
    public VkCudaLaunchInfoNV gridDimZ(@NativeType("uint32_t") int value) { ngridDimZ(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimX} field. */
    public VkCudaLaunchInfoNV blockDimX(@NativeType("uint32_t") int value) { nblockDimX(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimY} field. */
    public VkCudaLaunchInfoNV blockDimY(@NativeType("uint32_t") int value) { nblockDimY(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimZ} field. */
    public VkCudaLaunchInfoNV blockDimZ(@NativeType("uint32_t") int value) { nblockDimZ(address(), value); return this; }
    /** Sets the specified value to the {@code sharedMemBytes} field. */
    public VkCudaLaunchInfoNV sharedMemBytes(@NativeType("uint32_t") int value) { nsharedMemBytes(address(), value); return this; }
    /** Sets the specified value to the {@code paramCount} field. */
    public VkCudaLaunchInfoNV paramCount(@NativeType("size_t") long value) { nparamCount(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code pParams} field. */
    public VkCudaLaunchInfoNV pParams(@Nullable @NativeType("void const * const *") PointerBuffer value) { npParams(address(), value); return this; }
    /** Sets the specified value to the {@code extraCount} field. */
    public VkCudaLaunchInfoNV extraCount(@NativeType("size_t") long value) { nextraCount(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code pExtras} field. */
    public VkCudaLaunchInfoNV pExtras(@Nullable @NativeType("void const * const *") PointerBuffer value) { npExtras(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCudaLaunchInfoNV set(
        int sType,
        long pNext,
        long function,
        int gridDimX,
        int gridDimY,
        int gridDimZ,
        int blockDimX,
        int blockDimY,
        int blockDimZ,
        int sharedMemBytes,
        long paramCount,
        @Nullable PointerBuffer pParams,
        long extraCount,
        @Nullable PointerBuffer pExtras
    ) {
        sType(sType);
        pNext(pNext);
        function(function);
        gridDimX(gridDimX);
        gridDimY(gridDimY);
        gridDimZ(gridDimZ);
        blockDimX(blockDimX);
        blockDimY(blockDimY);
        blockDimZ(blockDimZ);
        sharedMemBytes(sharedMemBytes);
        paramCount(paramCount);
        pParams(pParams);
        extraCount(extraCount);
        pExtras(pExtras);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCudaLaunchInfoNV set(VkCudaLaunchInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCudaLaunchInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCudaLaunchInfoNV malloc() {
        return new VkCudaLaunchInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCudaLaunchInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCudaLaunchInfoNV calloc() {
        return new VkCudaLaunchInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCudaLaunchInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkCudaLaunchInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCudaLaunchInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkCudaLaunchInfoNV} instance for the specified memory address. */
    public static VkCudaLaunchInfoNV create(long address) {
        return new VkCudaLaunchInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCudaLaunchInfoNV createSafe(long address) {
        return address == NULL ? null : new VkCudaLaunchInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkCudaLaunchInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCudaLaunchInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCudaLaunchInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCudaLaunchInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCudaLaunchInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCudaLaunchInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCudaLaunchInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCudaLaunchInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCudaLaunchInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCudaLaunchInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCudaLaunchInfoNV malloc(MemoryStack stack) {
        return new VkCudaLaunchInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCudaLaunchInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCudaLaunchInfoNV calloc(MemoryStack stack) {
        return new VkCudaLaunchInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCudaLaunchInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCudaLaunchInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCudaLaunchInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCudaLaunchInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCudaLaunchInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCudaLaunchInfoNV.PNEXT); }
    /** Unsafe version of {@link #function}. */
    public static long nfunction(long struct) { return memGetLong(struct + VkCudaLaunchInfoNV.FUNCTION); }
    /** Unsafe version of {@link #gridDimX}. */
    public static int ngridDimX(long struct) { return memGetInt(struct + VkCudaLaunchInfoNV.GRIDDIMX); }
    /** Unsafe version of {@link #gridDimY}. */
    public static int ngridDimY(long struct) { return memGetInt(struct + VkCudaLaunchInfoNV.GRIDDIMY); }
    /** Unsafe version of {@link #gridDimZ}. */
    public static int ngridDimZ(long struct) { return memGetInt(struct + VkCudaLaunchInfoNV.GRIDDIMZ); }
    /** Unsafe version of {@link #blockDimX}. */
    public static int nblockDimX(long struct) { return memGetInt(struct + VkCudaLaunchInfoNV.BLOCKDIMX); }
    /** Unsafe version of {@link #blockDimY}. */
    public static int nblockDimY(long struct) { return memGetInt(struct + VkCudaLaunchInfoNV.BLOCKDIMY); }
    /** Unsafe version of {@link #blockDimZ}. */
    public static int nblockDimZ(long struct) { return memGetInt(struct + VkCudaLaunchInfoNV.BLOCKDIMZ); }
    /** Unsafe version of {@link #sharedMemBytes}. */
    public static int nsharedMemBytes(long struct) { return memGetInt(struct + VkCudaLaunchInfoNV.SHAREDMEMBYTES); }
    /** Unsafe version of {@link #paramCount}. */
    public static long nparamCount(long struct) { return memGetAddress(struct + VkCudaLaunchInfoNV.PARAMCOUNT); }
    /** Unsafe version of {@link #pParams() pParams}. */
    public static @Nullable PointerBuffer npParams(long struct) { return memPointerBufferSafe(memGetAddress(struct + VkCudaLaunchInfoNV.PPARAMS), (int)nparamCount(struct)); }
    /** Unsafe version of {@link #extraCount}. */
    public static long nextraCount(long struct) { return memGetAddress(struct + VkCudaLaunchInfoNV.EXTRACOUNT); }
    /** Unsafe version of {@link #pExtras() pExtras}. */
    public static @Nullable PointerBuffer npExtras(long struct) { return memPointerBufferSafe(memGetAddress(struct + VkCudaLaunchInfoNV.PEXTRAS), (int)nextraCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCudaLaunchInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCudaLaunchInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #function(long) function}. */
    public static void nfunction(long struct, long value) { memPutLong(struct + VkCudaLaunchInfoNV.FUNCTION, value); }
    /** Unsafe version of {@link #gridDimX(int) gridDimX}. */
    public static void ngridDimX(long struct, int value) { memPutInt(struct + VkCudaLaunchInfoNV.GRIDDIMX, value); }
    /** Unsafe version of {@link #gridDimY(int) gridDimY}. */
    public static void ngridDimY(long struct, int value) { memPutInt(struct + VkCudaLaunchInfoNV.GRIDDIMY, value); }
    /** Unsafe version of {@link #gridDimZ(int) gridDimZ}. */
    public static void ngridDimZ(long struct, int value) { memPutInt(struct + VkCudaLaunchInfoNV.GRIDDIMZ, value); }
    /** Unsafe version of {@link #blockDimX(int) blockDimX}. */
    public static void nblockDimX(long struct, int value) { memPutInt(struct + VkCudaLaunchInfoNV.BLOCKDIMX, value); }
    /** Unsafe version of {@link #blockDimY(int) blockDimY}. */
    public static void nblockDimY(long struct, int value) { memPutInt(struct + VkCudaLaunchInfoNV.BLOCKDIMY, value); }
    /** Unsafe version of {@link #blockDimZ(int) blockDimZ}. */
    public static void nblockDimZ(long struct, int value) { memPutInt(struct + VkCudaLaunchInfoNV.BLOCKDIMZ, value); }
    /** Unsafe version of {@link #sharedMemBytes(int) sharedMemBytes}. */
    public static void nsharedMemBytes(long struct, int value) { memPutInt(struct + VkCudaLaunchInfoNV.SHAREDMEMBYTES, value); }
    /** Sets the specified value to the {@code paramCount} field of the specified {@code struct}. */
    public static void nparamCount(long struct, long value) { memPutAddress(struct + VkCudaLaunchInfoNV.PARAMCOUNT, value); }
    /** Unsafe version of {@link #pParams(PointerBuffer) pParams}. */
    public static void npParams(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + VkCudaLaunchInfoNV.PPARAMS, memAddressSafe(value)); if (value != null) { nparamCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code extraCount} field of the specified {@code struct}. */
    public static void nextraCount(long struct, long value) { memPutAddress(struct + VkCudaLaunchInfoNV.EXTRACOUNT, value); }
    /** Unsafe version of {@link #pExtras(PointerBuffer) pExtras}. */
    public static void npExtras(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + VkCudaLaunchInfoNV.PEXTRAS, memAddressSafe(value)); if (value != null) { nextraCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkCudaLaunchInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkCudaLaunchInfoNV, Buffer> implements NativeResource {

        private static final VkCudaLaunchInfoNV ELEMENT_FACTORY = VkCudaLaunchInfoNV.create(-1L);

        /**
         * Creates a new {@code VkCudaLaunchInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCudaLaunchInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCudaLaunchInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCudaLaunchInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCudaLaunchInfoNV.npNext(address()); }
        /** @return the value of the {@code function} field. */
        @NativeType("VkCudaFunctionNV")
        public long function() { return VkCudaLaunchInfoNV.nfunction(address()); }
        /** @return the value of the {@code gridDimX} field. */
        @NativeType("uint32_t")
        public int gridDimX() { return VkCudaLaunchInfoNV.ngridDimX(address()); }
        /** @return the value of the {@code gridDimY} field. */
        @NativeType("uint32_t")
        public int gridDimY() { return VkCudaLaunchInfoNV.ngridDimY(address()); }
        /** @return the value of the {@code gridDimZ} field. */
        @NativeType("uint32_t")
        public int gridDimZ() { return VkCudaLaunchInfoNV.ngridDimZ(address()); }
        /** @return the value of the {@code blockDimX} field. */
        @NativeType("uint32_t")
        public int blockDimX() { return VkCudaLaunchInfoNV.nblockDimX(address()); }
        /** @return the value of the {@code blockDimY} field. */
        @NativeType("uint32_t")
        public int blockDimY() { return VkCudaLaunchInfoNV.nblockDimY(address()); }
        /** @return the value of the {@code blockDimZ} field. */
        @NativeType("uint32_t")
        public int blockDimZ() { return VkCudaLaunchInfoNV.nblockDimZ(address()); }
        /** @return the value of the {@code sharedMemBytes} field. */
        @NativeType("uint32_t")
        public int sharedMemBytes() { return VkCudaLaunchInfoNV.nsharedMemBytes(address()); }
        /** @return the value of the {@code paramCount} field. */
        @NativeType("size_t")
        public long paramCount() { return VkCudaLaunchInfoNV.nparamCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code pParams} field. */
        @NativeType("void const * const *")
        public @Nullable PointerBuffer pParams() { return VkCudaLaunchInfoNV.npParams(address()); }
        /** @return the value of the {@code extraCount} field. */
        @NativeType("size_t")
        public long extraCount() { return VkCudaLaunchInfoNV.nextraCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code pExtras} field. */
        @NativeType("void const * const *")
        public @Nullable PointerBuffer pExtras() { return VkCudaLaunchInfoNV.npExtras(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCudaLaunchInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkCudaLaunchInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVCudaKernelLaunch#VK_STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV} value to the {@code sType} field. */
        public VkCudaLaunchInfoNV.Buffer sType$Default() { return sType(NVCudaKernelLaunch.VK_STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCudaLaunchInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkCudaLaunchInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code function} field. */
        public VkCudaLaunchInfoNV.Buffer function(@NativeType("VkCudaFunctionNV") long value) { VkCudaLaunchInfoNV.nfunction(address(), value); return this; }
        /** Sets the specified value to the {@code gridDimX} field. */
        public VkCudaLaunchInfoNV.Buffer gridDimX(@NativeType("uint32_t") int value) { VkCudaLaunchInfoNV.ngridDimX(address(), value); return this; }
        /** Sets the specified value to the {@code gridDimY} field. */
        public VkCudaLaunchInfoNV.Buffer gridDimY(@NativeType("uint32_t") int value) { VkCudaLaunchInfoNV.ngridDimY(address(), value); return this; }
        /** Sets the specified value to the {@code gridDimZ} field. */
        public VkCudaLaunchInfoNV.Buffer gridDimZ(@NativeType("uint32_t") int value) { VkCudaLaunchInfoNV.ngridDimZ(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimX} field. */
        public VkCudaLaunchInfoNV.Buffer blockDimX(@NativeType("uint32_t") int value) { VkCudaLaunchInfoNV.nblockDimX(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimY} field. */
        public VkCudaLaunchInfoNV.Buffer blockDimY(@NativeType("uint32_t") int value) { VkCudaLaunchInfoNV.nblockDimY(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimZ} field. */
        public VkCudaLaunchInfoNV.Buffer blockDimZ(@NativeType("uint32_t") int value) { VkCudaLaunchInfoNV.nblockDimZ(address(), value); return this; }
        /** Sets the specified value to the {@code sharedMemBytes} field. */
        public VkCudaLaunchInfoNV.Buffer sharedMemBytes(@NativeType("uint32_t") int value) { VkCudaLaunchInfoNV.nsharedMemBytes(address(), value); return this; }
        /** Sets the specified value to the {@code paramCount} field. */
        public VkCudaLaunchInfoNV.Buffer paramCount(@NativeType("size_t") long value) { VkCudaLaunchInfoNV.nparamCount(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code pParams} field. */
        public VkCudaLaunchInfoNV.Buffer pParams(@Nullable @NativeType("void const * const *") PointerBuffer value) { VkCudaLaunchInfoNV.npParams(address(), value); return this; }
        /** Sets the specified value to the {@code extraCount} field. */
        public VkCudaLaunchInfoNV.Buffer extraCount(@NativeType("size_t") long value) { VkCudaLaunchInfoNV.nextraCount(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code pExtras} field. */
        public VkCudaLaunchInfoNV.Buffer pExtras(@Nullable @NativeType("void const * const *") PointerBuffer value) { VkCudaLaunchInfoNV.npExtras(address(), value); return this; }

    }

}