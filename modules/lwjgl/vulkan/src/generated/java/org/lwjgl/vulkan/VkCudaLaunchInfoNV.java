/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying the parameters to launch a CUDA kernel.
 * 
 * <h5>Description</h5>
 * 
 * <p>Kernel parameters of {@code function} are specified via {@code pParams}, very much the same way as described in <a href="https://docs.nvidia.com/cuda/cuda-driver-api/group__CUDA__EXEC.html#group__CUDA__EXEC_1gb8f3dc3031b40da29d5f9a7139e52e15">cuLaunchKernel</a></p>
 * 
 * <p>If {@code function} has N parameters, then {@code pParams} <b>must</b> be an array of N pointers and {@code paramCount} <b>must</b> be set to N. Each of {@code kernelParams}[0] through {@code kernelParams}[N-1] <b>must</b> point to a region of memory from which the actual kernel parameter will be copied. The number of kernel parameters and their offsets and sizes are not specified here as that information is stored in the {@code VkCudaFunctionNV} object.</p>
 * 
 * <p>The application-owned memory pointed to by {@code pParams} and {@code kernelParams}[0] through {@code kernelParams}[N-1] are consumed immediately, and <b>may</b> be altered or freed after {@link NVCudaKernelLaunch#vkCmdCudaLaunchKernelNV CmdCudaLaunchKernelNV} has returned.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code gridDimX} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[0]</li>
 * <li>{@code gridDimY} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[1]</li>
 * <li>{@code gridDimZ} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[2]</li>
 * <li>{@code paramCount} <b>must</b> be the total amount of parameters listed in the {@code pParams} table</li>
 * <li>{@code pParams} <b>must</b> be a pointer to a table of {@code paramCount} parameters, corresponding to the arguments of {@code function}</li>
 * <li>{@code extraCount} <b>must</b> be 0</li>
 * <li>{@code pExtras} <b>must</b> be NULL</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVCudaKernelLaunch#VK_STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code function} <b>must</b> be a valid {@code VkCudaFunctionNV} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link NVCudaKernelLaunch#vkCmdCudaLaunchKernelNV CmdCudaLaunchKernelNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCudaLaunchInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkCudaFunctionNV {@link #function};
 *     uint32_t {@link #gridDimX};
 *     uint32_t {@link #gridDimY};
 *     uint32_t {@link #gridDimZ};
 *     uint32_t {@link #blockDimX};
 *     uint32_t {@link #blockDimY};
 *     uint32_t {@link #blockDimZ};
 *     uint32_t {@link #sharedMemBytes};
 *     size_t {@link #paramCount};
 *     void const * const * {@link #pParams};
 *     size_t {@link #extraCount};
 *     void const * const * {@link #pExtras};
 * }</code></pre>
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

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the CUDA-Driver handle to the function being launched. */
    @NativeType("VkCudaFunctionNV")
    public long function() { return nfunction(address()); }
    /** the number of local workgroups to dispatch in the X dimension. It <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[0] */
    @NativeType("uint32_t")
    public int gridDimX() { return ngridDimX(address()); }
    /** the number of local workgroups to dispatch in the Y dimension. It <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[1] */
    @NativeType("uint32_t")
    public int gridDimY() { return ngridDimY(address()); }
    /** the number of local workgroups to dispatch in the Z dimension. It <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[2] */
    @NativeType("uint32_t")
    public int gridDimZ() { return ngridDimZ(address()); }
    /** block size in the X dimension. */
    @NativeType("uint32_t")
    public int blockDimX() { return nblockDimX(address()); }
    /** block size in the Y dimension. */
    @NativeType("uint32_t")
    public int blockDimY() { return nblockDimY(address()); }
    /** block size in the Z dimension. */
    @NativeType("uint32_t")
    public int blockDimZ() { return nblockDimZ(address()); }
    /** the dynamic shared-memory size per thread block in bytes. */
    @NativeType("uint32_t")
    public int sharedMemBytes() { return nsharedMemBytes(address()); }
    /** the length of the {@code pParams} table. */
    @NativeType("size_t")
    public long paramCount() { return nparamCount(address()); }
    /** a pointer to an array of {@code paramCount} pointers, corresponding to the arguments of {@code function}. */
    @Nullable
    @NativeType("void const * const *")
    public PointerBuffer pParams() { return npParams(address()); }
    /** reserved for future use. */
    @NativeType("size_t")
    public long extraCount() { return nextraCount(address()); }
    /** reserved for future use. */
    @Nullable
    @NativeType("void const * const *")
    public PointerBuffer pExtras() { return npExtras(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCudaLaunchInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVCudaKernelLaunch#VK_STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV} value to the {@link #sType} field. */
    public VkCudaLaunchInfoNV sType$Default() { return sType(NVCudaKernelLaunch.VK_STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCudaLaunchInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #function} field. */
    public VkCudaLaunchInfoNV function(@NativeType("VkCudaFunctionNV") long value) { nfunction(address(), value); return this; }
    /** Sets the specified value to the {@link #gridDimX} field. */
    public VkCudaLaunchInfoNV gridDimX(@NativeType("uint32_t") int value) { ngridDimX(address(), value); return this; }
    /** Sets the specified value to the {@link #gridDimY} field. */
    public VkCudaLaunchInfoNV gridDimY(@NativeType("uint32_t") int value) { ngridDimY(address(), value); return this; }
    /** Sets the specified value to the {@link #gridDimZ} field. */
    public VkCudaLaunchInfoNV gridDimZ(@NativeType("uint32_t") int value) { ngridDimZ(address(), value); return this; }
    /** Sets the specified value to the {@link #blockDimX} field. */
    public VkCudaLaunchInfoNV blockDimX(@NativeType("uint32_t") int value) { nblockDimX(address(), value); return this; }
    /** Sets the specified value to the {@link #blockDimY} field. */
    public VkCudaLaunchInfoNV blockDimY(@NativeType("uint32_t") int value) { nblockDimY(address(), value); return this; }
    /** Sets the specified value to the {@link #blockDimZ} field. */
    public VkCudaLaunchInfoNV blockDimZ(@NativeType("uint32_t") int value) { nblockDimZ(address(), value); return this; }
    /** Sets the specified value to the {@link #sharedMemBytes} field. */
    public VkCudaLaunchInfoNV sharedMemBytes(@NativeType("uint32_t") int value) { nsharedMemBytes(address(), value); return this; }
    /** Sets the specified value to the {@link #paramCount} field. */
    public VkCudaLaunchInfoNV paramCount(@NativeType("size_t") long value) { nparamCount(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@link #pParams} field. */
    public VkCudaLaunchInfoNV pParams(@Nullable @NativeType("void const * const *") PointerBuffer value) { npParams(address(), value); return this; }
    /** Sets the specified value to the {@link #extraCount} field. */
    public VkCudaLaunchInfoNV extraCount(@NativeType("size_t") long value) { nextraCount(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@link #pExtras} field. */
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
    @Nullable
    public static VkCudaLaunchInfoNV createSafe(long address) {
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
    @Nullable
    public static VkCudaLaunchInfoNV.Buffer createSafe(long address, int capacity) {
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
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCudaLaunchInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCudaLaunchInfoNV.PNEXT); }
    /** Unsafe version of {@link #function}. */
    public static long nfunction(long struct) { return UNSAFE.getLong(null, struct + VkCudaLaunchInfoNV.FUNCTION); }
    /** Unsafe version of {@link #gridDimX}. */
    public static int ngridDimX(long struct) { return UNSAFE.getInt(null, struct + VkCudaLaunchInfoNV.GRIDDIMX); }
    /** Unsafe version of {@link #gridDimY}. */
    public static int ngridDimY(long struct) { return UNSAFE.getInt(null, struct + VkCudaLaunchInfoNV.GRIDDIMY); }
    /** Unsafe version of {@link #gridDimZ}. */
    public static int ngridDimZ(long struct) { return UNSAFE.getInt(null, struct + VkCudaLaunchInfoNV.GRIDDIMZ); }
    /** Unsafe version of {@link #blockDimX}. */
    public static int nblockDimX(long struct) { return UNSAFE.getInt(null, struct + VkCudaLaunchInfoNV.BLOCKDIMX); }
    /** Unsafe version of {@link #blockDimY}. */
    public static int nblockDimY(long struct) { return UNSAFE.getInt(null, struct + VkCudaLaunchInfoNV.BLOCKDIMY); }
    /** Unsafe version of {@link #blockDimZ}. */
    public static int nblockDimZ(long struct) { return UNSAFE.getInt(null, struct + VkCudaLaunchInfoNV.BLOCKDIMZ); }
    /** Unsafe version of {@link #sharedMemBytes}. */
    public static int nsharedMemBytes(long struct) { return UNSAFE.getInt(null, struct + VkCudaLaunchInfoNV.SHAREDMEMBYTES); }
    /** Unsafe version of {@link #paramCount}. */
    public static long nparamCount(long struct) { return memGetAddress(struct + VkCudaLaunchInfoNV.PARAMCOUNT); }
    /** Unsafe version of {@link #pParams() pParams}. */
    @Nullable public static PointerBuffer npParams(long struct) { return memPointerBufferSafe(memGetAddress(struct + VkCudaLaunchInfoNV.PPARAMS), (int)nparamCount(struct)); }
    /** Unsafe version of {@link #extraCount}. */
    public static long nextraCount(long struct) { return memGetAddress(struct + VkCudaLaunchInfoNV.EXTRACOUNT); }
    /** Unsafe version of {@link #pExtras() pExtras}. */
    @Nullable public static PointerBuffer npExtras(long struct) { return memPointerBufferSafe(memGetAddress(struct + VkCudaLaunchInfoNV.PEXTRAS), (int)nextraCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCudaLaunchInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCudaLaunchInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #function(long) function}. */
    public static void nfunction(long struct, long value) { UNSAFE.putLong(null, struct + VkCudaLaunchInfoNV.FUNCTION, value); }
    /** Unsafe version of {@link #gridDimX(int) gridDimX}. */
    public static void ngridDimX(long struct, int value) { UNSAFE.putInt(null, struct + VkCudaLaunchInfoNV.GRIDDIMX, value); }
    /** Unsafe version of {@link #gridDimY(int) gridDimY}. */
    public static void ngridDimY(long struct, int value) { UNSAFE.putInt(null, struct + VkCudaLaunchInfoNV.GRIDDIMY, value); }
    /** Unsafe version of {@link #gridDimZ(int) gridDimZ}. */
    public static void ngridDimZ(long struct, int value) { UNSAFE.putInt(null, struct + VkCudaLaunchInfoNV.GRIDDIMZ, value); }
    /** Unsafe version of {@link #blockDimX(int) blockDimX}. */
    public static void nblockDimX(long struct, int value) { UNSAFE.putInt(null, struct + VkCudaLaunchInfoNV.BLOCKDIMX, value); }
    /** Unsafe version of {@link #blockDimY(int) blockDimY}. */
    public static void nblockDimY(long struct, int value) { UNSAFE.putInt(null, struct + VkCudaLaunchInfoNV.BLOCKDIMY, value); }
    /** Unsafe version of {@link #blockDimZ(int) blockDimZ}. */
    public static void nblockDimZ(long struct, int value) { UNSAFE.putInt(null, struct + VkCudaLaunchInfoNV.BLOCKDIMZ, value); }
    /** Unsafe version of {@link #sharedMemBytes(int) sharedMemBytes}. */
    public static void nsharedMemBytes(long struct, int value) { UNSAFE.putInt(null, struct + VkCudaLaunchInfoNV.SHAREDMEMBYTES, value); }
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
        protected VkCudaLaunchInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCudaLaunchInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCudaLaunchInfoNV.nsType(address()); }
        /** @return the value of the {@link VkCudaLaunchInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCudaLaunchInfoNV.npNext(address()); }
        /** @return the value of the {@link VkCudaLaunchInfoNV#function} field. */
        @NativeType("VkCudaFunctionNV")
        public long function() { return VkCudaLaunchInfoNV.nfunction(address()); }
        /** @return the value of the {@link VkCudaLaunchInfoNV#gridDimX} field. */
        @NativeType("uint32_t")
        public int gridDimX() { return VkCudaLaunchInfoNV.ngridDimX(address()); }
        /** @return the value of the {@link VkCudaLaunchInfoNV#gridDimY} field. */
        @NativeType("uint32_t")
        public int gridDimY() { return VkCudaLaunchInfoNV.ngridDimY(address()); }
        /** @return the value of the {@link VkCudaLaunchInfoNV#gridDimZ} field. */
        @NativeType("uint32_t")
        public int gridDimZ() { return VkCudaLaunchInfoNV.ngridDimZ(address()); }
        /** @return the value of the {@link VkCudaLaunchInfoNV#blockDimX} field. */
        @NativeType("uint32_t")
        public int blockDimX() { return VkCudaLaunchInfoNV.nblockDimX(address()); }
        /** @return the value of the {@link VkCudaLaunchInfoNV#blockDimY} field. */
        @NativeType("uint32_t")
        public int blockDimY() { return VkCudaLaunchInfoNV.nblockDimY(address()); }
        /** @return the value of the {@link VkCudaLaunchInfoNV#blockDimZ} field. */
        @NativeType("uint32_t")
        public int blockDimZ() { return VkCudaLaunchInfoNV.nblockDimZ(address()); }
        /** @return the value of the {@link VkCudaLaunchInfoNV#sharedMemBytes} field. */
        @NativeType("uint32_t")
        public int sharedMemBytes() { return VkCudaLaunchInfoNV.nsharedMemBytes(address()); }
        /** @return the value of the {@link VkCudaLaunchInfoNV#paramCount} field. */
        @NativeType("size_t")
        public long paramCount() { return VkCudaLaunchInfoNV.nparamCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link VkCudaLaunchInfoNV#pParams} field. */
        @Nullable
        @NativeType("void const * const *")
        public PointerBuffer pParams() { return VkCudaLaunchInfoNV.npParams(address()); }
        /** @return the value of the {@link VkCudaLaunchInfoNV#extraCount} field. */
        @NativeType("size_t")
        public long extraCount() { return VkCudaLaunchInfoNV.nextraCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link VkCudaLaunchInfoNV#pExtras} field. */
        @Nullable
        @NativeType("void const * const *")
        public PointerBuffer pExtras() { return VkCudaLaunchInfoNV.npExtras(address()); }

        /** Sets the specified value to the {@link VkCudaLaunchInfoNV#sType} field. */
        public VkCudaLaunchInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkCudaLaunchInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVCudaKernelLaunch#VK_STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV} value to the {@link VkCudaLaunchInfoNV#sType} field. */
        public VkCudaLaunchInfoNV.Buffer sType$Default() { return sType(NVCudaKernelLaunch.VK_STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV); }
        /** Sets the specified value to the {@link VkCudaLaunchInfoNV#pNext} field. */
        public VkCudaLaunchInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkCudaLaunchInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkCudaLaunchInfoNV#function} field. */
        public VkCudaLaunchInfoNV.Buffer function(@NativeType("VkCudaFunctionNV") long value) { VkCudaLaunchInfoNV.nfunction(address(), value); return this; }
        /** Sets the specified value to the {@link VkCudaLaunchInfoNV#gridDimX} field. */
        public VkCudaLaunchInfoNV.Buffer gridDimX(@NativeType("uint32_t") int value) { VkCudaLaunchInfoNV.ngridDimX(address(), value); return this; }
        /** Sets the specified value to the {@link VkCudaLaunchInfoNV#gridDimY} field. */
        public VkCudaLaunchInfoNV.Buffer gridDimY(@NativeType("uint32_t") int value) { VkCudaLaunchInfoNV.ngridDimY(address(), value); return this; }
        /** Sets the specified value to the {@link VkCudaLaunchInfoNV#gridDimZ} field. */
        public VkCudaLaunchInfoNV.Buffer gridDimZ(@NativeType("uint32_t") int value) { VkCudaLaunchInfoNV.ngridDimZ(address(), value); return this; }
        /** Sets the specified value to the {@link VkCudaLaunchInfoNV#blockDimX} field. */
        public VkCudaLaunchInfoNV.Buffer blockDimX(@NativeType("uint32_t") int value) { VkCudaLaunchInfoNV.nblockDimX(address(), value); return this; }
        /** Sets the specified value to the {@link VkCudaLaunchInfoNV#blockDimY} field. */
        public VkCudaLaunchInfoNV.Buffer blockDimY(@NativeType("uint32_t") int value) { VkCudaLaunchInfoNV.nblockDimY(address(), value); return this; }
        /** Sets the specified value to the {@link VkCudaLaunchInfoNV#blockDimZ} field. */
        public VkCudaLaunchInfoNV.Buffer blockDimZ(@NativeType("uint32_t") int value) { VkCudaLaunchInfoNV.nblockDimZ(address(), value); return this; }
        /** Sets the specified value to the {@link VkCudaLaunchInfoNV#sharedMemBytes} field. */
        public VkCudaLaunchInfoNV.Buffer sharedMemBytes(@NativeType("uint32_t") int value) { VkCudaLaunchInfoNV.nsharedMemBytes(address(), value); return this; }
        /** Sets the specified value to the {@link VkCudaLaunchInfoNV#paramCount} field. */
        public VkCudaLaunchInfoNV.Buffer paramCount(@NativeType("size_t") long value) { VkCudaLaunchInfoNV.nparamCount(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@link VkCudaLaunchInfoNV#pParams} field. */
        public VkCudaLaunchInfoNV.Buffer pParams(@Nullable @NativeType("void const * const *") PointerBuffer value) { VkCudaLaunchInfoNV.npParams(address(), value); return this; }
        /** Sets the specified value to the {@link VkCudaLaunchInfoNV#extraCount} field. */
        public VkCudaLaunchInfoNV.Buffer extraCount(@NativeType("size_t") long value) { VkCudaLaunchInfoNV.nextraCount(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@link VkCudaLaunchInfoNV#pExtras} field. */
        public VkCudaLaunchInfoNV.Buffer pExtras(@Nullable @NativeType("void const * const *") PointerBuffer value) { VkCudaLaunchInfoNV.npExtras(address(), value); return this; }

    }

}