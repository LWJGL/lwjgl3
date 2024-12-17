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
 * struct VkPhysicalDeviceShaderCorePropertiesAMD {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t shaderEngineCount;
 *     uint32_t shaderArraysPerEngineCount;
 *     uint32_t computeUnitsPerShaderArray;
 *     uint32_t simdPerComputeUnit;
 *     uint32_t wavefrontsPerSimd;
 *     uint32_t wavefrontSize;
 *     uint32_t sgprsPerSimd;
 *     uint32_t minSgprAllocation;
 *     uint32_t maxSgprAllocation;
 *     uint32_t sgprAllocationGranularity;
 *     uint32_t vgprsPerSimd;
 *     uint32_t minVgprAllocation;
 *     uint32_t maxVgprAllocation;
 *     uint32_t vgprAllocationGranularity;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderCorePropertiesAMD extends Struct<VkPhysicalDeviceShaderCorePropertiesAMD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERENGINECOUNT,
        SHADERARRAYSPERENGINECOUNT,
        COMPUTEUNITSPERSHADERARRAY,
        SIMDPERCOMPUTEUNIT,
        WAVEFRONTSPERSIMD,
        WAVEFRONTSIZE,
        SGPRSPERSIMD,
        MINSGPRALLOCATION,
        MAXSGPRALLOCATION,
        SGPRALLOCATIONGRANULARITY,
        VGPRSPERSIMD,
        MINVGPRALLOCATION,
        MAXVGPRALLOCATION,
        VGPRALLOCATIONGRANULARITY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERENGINECOUNT = layout.offsetof(2);
        SHADERARRAYSPERENGINECOUNT = layout.offsetof(3);
        COMPUTEUNITSPERSHADERARRAY = layout.offsetof(4);
        SIMDPERCOMPUTEUNIT = layout.offsetof(5);
        WAVEFRONTSPERSIMD = layout.offsetof(6);
        WAVEFRONTSIZE = layout.offsetof(7);
        SGPRSPERSIMD = layout.offsetof(8);
        MINSGPRALLOCATION = layout.offsetof(9);
        MAXSGPRALLOCATION = layout.offsetof(10);
        SGPRALLOCATIONGRANULARITY = layout.offsetof(11);
        VGPRSPERSIMD = layout.offsetof(12);
        MINVGPRALLOCATION = layout.offsetof(13);
        MAXVGPRALLOCATION = layout.offsetof(14);
        VGPRALLOCATIONGRANULARITY = layout.offsetof(15);
    }

    protected VkPhysicalDeviceShaderCorePropertiesAMD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderCorePropertiesAMD create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderCorePropertiesAMD(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderCorePropertiesAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderCorePropertiesAMD(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code shaderEngineCount} field. */
    @NativeType("uint32_t")
    public int shaderEngineCount() { return nshaderEngineCount(address()); }
    /** @return the value of the {@code shaderArraysPerEngineCount} field. */
    @NativeType("uint32_t")
    public int shaderArraysPerEngineCount() { return nshaderArraysPerEngineCount(address()); }
    /** @return the value of the {@code computeUnitsPerShaderArray} field. */
    @NativeType("uint32_t")
    public int computeUnitsPerShaderArray() { return ncomputeUnitsPerShaderArray(address()); }
    /** @return the value of the {@code simdPerComputeUnit} field. */
    @NativeType("uint32_t")
    public int simdPerComputeUnit() { return nsimdPerComputeUnit(address()); }
    /** @return the value of the {@code wavefrontsPerSimd} field. */
    @NativeType("uint32_t")
    public int wavefrontsPerSimd() { return nwavefrontsPerSimd(address()); }
    /** @return the value of the {@code wavefrontSize} field. */
    @NativeType("uint32_t")
    public int wavefrontSize() { return nwavefrontSize(address()); }
    /** @return the value of the {@code sgprsPerSimd} field. */
    @NativeType("uint32_t")
    public int sgprsPerSimd() { return nsgprsPerSimd(address()); }
    /** @return the value of the {@code minSgprAllocation} field. */
    @NativeType("uint32_t")
    public int minSgprAllocation() { return nminSgprAllocation(address()); }
    /** @return the value of the {@code maxSgprAllocation} field. */
    @NativeType("uint32_t")
    public int maxSgprAllocation() { return nmaxSgprAllocation(address()); }
    /** @return the value of the {@code sgprAllocationGranularity} field. */
    @NativeType("uint32_t")
    public int sgprAllocationGranularity() { return nsgprAllocationGranularity(address()); }
    /** @return the value of the {@code vgprsPerSimd} field. */
    @NativeType("uint32_t")
    public int vgprsPerSimd() { return nvgprsPerSimd(address()); }
    /** @return the value of the {@code minVgprAllocation} field. */
    @NativeType("uint32_t")
    public int minVgprAllocation() { return nminVgprAllocation(address()); }
    /** @return the value of the {@code maxVgprAllocation} field. */
    @NativeType("uint32_t")
    public int maxVgprAllocation() { return nmaxVgprAllocation(address()); }
    /** @return the value of the {@code vgprAllocationGranularity} field. */
    @NativeType("uint32_t")
    public int vgprAllocationGranularity() { return nvgprAllocationGranularity(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderCorePropertiesAMD sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDShaderCoreProperties#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_AMD STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_AMD} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderCorePropertiesAMD sType$Default() { return sType(AMDShaderCoreProperties.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_AMD); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderCorePropertiesAMD pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderCorePropertiesAMD set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderCorePropertiesAMD set(VkPhysicalDeviceShaderCorePropertiesAMD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderCorePropertiesAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderCorePropertiesAMD malloc() {
        return new VkPhysicalDeviceShaderCorePropertiesAMD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderCorePropertiesAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderCorePropertiesAMD calloc() {
        return new VkPhysicalDeviceShaderCorePropertiesAMD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderCorePropertiesAMD} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderCorePropertiesAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderCorePropertiesAMD(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderCorePropertiesAMD} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderCorePropertiesAMD create(long address) {
        return new VkPhysicalDeviceShaderCorePropertiesAMD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderCorePropertiesAMD createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderCorePropertiesAMD(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCorePropertiesAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCorePropertiesAMD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCorePropertiesAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCorePropertiesAMD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCorePropertiesAMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCorePropertiesAMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderCorePropertiesAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCorePropertiesAMD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderCorePropertiesAMD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderCorePropertiesAMD mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderCorePropertiesAMD callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderCorePropertiesAMD mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderCorePropertiesAMD callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderCorePropertiesAMD.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderCorePropertiesAMD.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderCorePropertiesAMD.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderCorePropertiesAMD.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderCorePropertiesAMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderCorePropertiesAMD malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderCorePropertiesAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderCorePropertiesAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderCorePropertiesAMD calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderCorePropertiesAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCorePropertiesAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCorePropertiesAMD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCorePropertiesAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCorePropertiesAMD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderCorePropertiesAMD.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderCorePropertiesAMD.PNEXT); }
    /** Unsafe version of {@link #shaderEngineCount}. */
    public static int nshaderEngineCount(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderCorePropertiesAMD.SHADERENGINECOUNT); }
    /** Unsafe version of {@link #shaderArraysPerEngineCount}. */
    public static int nshaderArraysPerEngineCount(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderCorePropertiesAMD.SHADERARRAYSPERENGINECOUNT); }
    /** Unsafe version of {@link #computeUnitsPerShaderArray}. */
    public static int ncomputeUnitsPerShaderArray(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderCorePropertiesAMD.COMPUTEUNITSPERSHADERARRAY); }
    /** Unsafe version of {@link #simdPerComputeUnit}. */
    public static int nsimdPerComputeUnit(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderCorePropertiesAMD.SIMDPERCOMPUTEUNIT); }
    /** Unsafe version of {@link #wavefrontsPerSimd}. */
    public static int nwavefrontsPerSimd(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderCorePropertiesAMD.WAVEFRONTSPERSIMD); }
    /** Unsafe version of {@link #wavefrontSize}. */
    public static int nwavefrontSize(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderCorePropertiesAMD.WAVEFRONTSIZE); }
    /** Unsafe version of {@link #sgprsPerSimd}. */
    public static int nsgprsPerSimd(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderCorePropertiesAMD.SGPRSPERSIMD); }
    /** Unsafe version of {@link #minSgprAllocation}. */
    public static int nminSgprAllocation(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderCorePropertiesAMD.MINSGPRALLOCATION); }
    /** Unsafe version of {@link #maxSgprAllocation}. */
    public static int nmaxSgprAllocation(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderCorePropertiesAMD.MAXSGPRALLOCATION); }
    /** Unsafe version of {@link #sgprAllocationGranularity}. */
    public static int nsgprAllocationGranularity(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderCorePropertiesAMD.SGPRALLOCATIONGRANULARITY); }
    /** Unsafe version of {@link #vgprsPerSimd}. */
    public static int nvgprsPerSimd(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderCorePropertiesAMD.VGPRSPERSIMD); }
    /** Unsafe version of {@link #minVgprAllocation}. */
    public static int nminVgprAllocation(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderCorePropertiesAMD.MINVGPRALLOCATION); }
    /** Unsafe version of {@link #maxVgprAllocation}. */
    public static int nmaxVgprAllocation(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderCorePropertiesAMD.MAXVGPRALLOCATION); }
    /** Unsafe version of {@link #vgprAllocationGranularity}. */
    public static int nvgprAllocationGranularity(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderCorePropertiesAMD.VGPRALLOCATIONGRANULARITY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderCorePropertiesAMD.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderCorePropertiesAMD.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderCorePropertiesAMD} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderCorePropertiesAMD, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderCorePropertiesAMD ELEMENT_FACTORY = VkPhysicalDeviceShaderCorePropertiesAMD.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderCorePropertiesAMD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderCorePropertiesAMD#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderCorePropertiesAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderCorePropertiesAMD.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderCorePropertiesAMD.npNext(address()); }
        /** @return the value of the {@code shaderEngineCount} field. */
        @NativeType("uint32_t")
        public int shaderEngineCount() { return VkPhysicalDeviceShaderCorePropertiesAMD.nshaderEngineCount(address()); }
        /** @return the value of the {@code shaderArraysPerEngineCount} field. */
        @NativeType("uint32_t")
        public int shaderArraysPerEngineCount() { return VkPhysicalDeviceShaderCorePropertiesAMD.nshaderArraysPerEngineCount(address()); }
        /** @return the value of the {@code computeUnitsPerShaderArray} field. */
        @NativeType("uint32_t")
        public int computeUnitsPerShaderArray() { return VkPhysicalDeviceShaderCorePropertiesAMD.ncomputeUnitsPerShaderArray(address()); }
        /** @return the value of the {@code simdPerComputeUnit} field. */
        @NativeType("uint32_t")
        public int simdPerComputeUnit() { return VkPhysicalDeviceShaderCorePropertiesAMD.nsimdPerComputeUnit(address()); }
        /** @return the value of the {@code wavefrontsPerSimd} field. */
        @NativeType("uint32_t")
        public int wavefrontsPerSimd() { return VkPhysicalDeviceShaderCorePropertiesAMD.nwavefrontsPerSimd(address()); }
        /** @return the value of the {@code wavefrontSize} field. */
        @NativeType("uint32_t")
        public int wavefrontSize() { return VkPhysicalDeviceShaderCorePropertiesAMD.nwavefrontSize(address()); }
        /** @return the value of the {@code sgprsPerSimd} field. */
        @NativeType("uint32_t")
        public int sgprsPerSimd() { return VkPhysicalDeviceShaderCorePropertiesAMD.nsgprsPerSimd(address()); }
        /** @return the value of the {@code minSgprAllocation} field. */
        @NativeType("uint32_t")
        public int minSgprAllocation() { return VkPhysicalDeviceShaderCorePropertiesAMD.nminSgprAllocation(address()); }
        /** @return the value of the {@code maxSgprAllocation} field. */
        @NativeType("uint32_t")
        public int maxSgprAllocation() { return VkPhysicalDeviceShaderCorePropertiesAMD.nmaxSgprAllocation(address()); }
        /** @return the value of the {@code sgprAllocationGranularity} field. */
        @NativeType("uint32_t")
        public int sgprAllocationGranularity() { return VkPhysicalDeviceShaderCorePropertiesAMD.nsgprAllocationGranularity(address()); }
        /** @return the value of the {@code vgprsPerSimd} field. */
        @NativeType("uint32_t")
        public int vgprsPerSimd() { return VkPhysicalDeviceShaderCorePropertiesAMD.nvgprsPerSimd(address()); }
        /** @return the value of the {@code minVgprAllocation} field. */
        @NativeType("uint32_t")
        public int minVgprAllocation() { return VkPhysicalDeviceShaderCorePropertiesAMD.nminVgprAllocation(address()); }
        /** @return the value of the {@code maxVgprAllocation} field. */
        @NativeType("uint32_t")
        public int maxVgprAllocation() { return VkPhysicalDeviceShaderCorePropertiesAMD.nmaxVgprAllocation(address()); }
        /** @return the value of the {@code vgprAllocationGranularity} field. */
        @NativeType("uint32_t")
        public int vgprAllocationGranularity() { return VkPhysicalDeviceShaderCorePropertiesAMD.nvgprAllocationGranularity(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderCorePropertiesAMD.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderCorePropertiesAMD.nsType(address(), value); return this; }
        /** Sets the {@link AMDShaderCoreProperties#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_AMD STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_AMD} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderCorePropertiesAMD.Buffer sType$Default() { return sType(AMDShaderCoreProperties.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_AMD); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderCorePropertiesAMD.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderCorePropertiesAMD.npNext(address(), value); return this; }

    }

}