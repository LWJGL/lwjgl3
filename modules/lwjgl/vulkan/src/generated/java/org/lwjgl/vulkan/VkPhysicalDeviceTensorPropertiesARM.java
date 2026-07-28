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
 * struct VkPhysicalDeviceTensorPropertiesARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxTensorDimensionCount;
 *     uint64_t maxTensorElements;
 *     uint64_t maxPerDimensionTensorElements;
 *     int64_t maxTensorStride;
 *     uint64_t maxTensorSize;
 *     uint32_t maxTensorShaderAccessArrayLength;
 *     uint32_t maxTensorShaderAccessSize;
 *     uint32_t maxDescriptorSetStorageTensors;
 *     uint32_t maxPerStageDescriptorSetStorageTensors;
 *     uint32_t maxDescriptorSetUpdateAfterBindStorageTensors;
 *     uint32_t maxPerStageDescriptorUpdateAfterBindStorageTensors;
 *     VkBool32 shaderStorageTensorArrayNonUniformIndexingNative;
 *     VkShaderStageFlags shaderTensorSupportedStages;
 * }}</pre>
 */
public class VkPhysicalDeviceTensorPropertiesARM extends Struct<VkPhysicalDeviceTensorPropertiesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXTENSORDIMENSIONCOUNT,
        MAXTENSORELEMENTS,
        MAXPERDIMENSIONTENSORELEMENTS,
        MAXTENSORSTRIDE,
        MAXTENSORSIZE,
        MAXTENSORSHADERACCESSARRAYLENGTH,
        MAXTENSORSHADERACCESSSIZE,
        MAXDESCRIPTORSETSTORAGETENSORS,
        MAXPERSTAGEDESCRIPTORSETSTORAGETENSORS,
        MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGETENSORS,
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGETENSORS,
        SHADERSTORAGETENSORARRAYNONUNIFORMINDEXINGNATIVE,
        SHADERTENSORSUPPORTEDSTAGES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
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
        MAXTENSORDIMENSIONCOUNT = layout.offsetof(2);
        MAXTENSORELEMENTS = layout.offsetof(3);
        MAXPERDIMENSIONTENSORELEMENTS = layout.offsetof(4);
        MAXTENSORSTRIDE = layout.offsetof(5);
        MAXTENSORSIZE = layout.offsetof(6);
        MAXTENSORSHADERACCESSARRAYLENGTH = layout.offsetof(7);
        MAXTENSORSHADERACCESSSIZE = layout.offsetof(8);
        MAXDESCRIPTORSETSTORAGETENSORS = layout.offsetof(9);
        MAXPERSTAGEDESCRIPTORSETSTORAGETENSORS = layout.offsetof(10);
        MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGETENSORS = layout.offsetof(11);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGETENSORS = layout.offsetof(12);
        SHADERSTORAGETENSORARRAYNONUNIFORMINDEXINGNATIVE = layout.offsetof(13);
        SHADERTENSORSUPPORTEDSTAGES = layout.offsetof(14);
    }

    protected VkPhysicalDeviceTensorPropertiesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceTensorPropertiesARM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceTensorPropertiesARM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceTensorPropertiesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceTensorPropertiesARM(ByteBuffer container) {
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
    /** @return the value of the {@code maxTensorDimensionCount} field. */
    @NativeType("uint32_t")
    public int maxTensorDimensionCount() { return nmaxTensorDimensionCount(address()); }
    /** @return the value of the {@code maxTensorElements} field. */
    @NativeType("uint64_t")
    public long maxTensorElements() { return nmaxTensorElements(address()); }
    /** @return the value of the {@code maxPerDimensionTensorElements} field. */
    @NativeType("uint64_t")
    public long maxPerDimensionTensorElements() { return nmaxPerDimensionTensorElements(address()); }
    /** @return the value of the {@code maxTensorStride} field. */
    @NativeType("int64_t")
    public long maxTensorStride() { return nmaxTensorStride(address()); }
    /** @return the value of the {@code maxTensorSize} field. */
    @NativeType("uint64_t")
    public long maxTensorSize() { return nmaxTensorSize(address()); }
    /** @return the value of the {@code maxTensorShaderAccessArrayLength} field. */
    @NativeType("uint32_t")
    public int maxTensorShaderAccessArrayLength() { return nmaxTensorShaderAccessArrayLength(address()); }
    /** @return the value of the {@code maxTensorShaderAccessSize} field. */
    @NativeType("uint32_t")
    public int maxTensorShaderAccessSize() { return nmaxTensorShaderAccessSize(address()); }
    /** @return the value of the {@code maxDescriptorSetStorageTensors} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetStorageTensors() { return nmaxDescriptorSetStorageTensors(address()); }
    /** @return the value of the {@code maxPerStageDescriptorSetStorageTensors} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorSetStorageTensors() { return nmaxPerStageDescriptorSetStorageTensors(address()); }
    /** @return the value of the {@code maxDescriptorSetUpdateAfterBindStorageTensors} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindStorageTensors() { return nmaxDescriptorSetUpdateAfterBindStorageTensors(address()); }
    /** @return the value of the {@code maxPerStageDescriptorUpdateAfterBindStorageTensors} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindStorageTensors() { return nmaxPerStageDescriptorUpdateAfterBindStorageTensors(address()); }
    /** @return the value of the {@code shaderStorageTensorArrayNonUniformIndexingNative} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageTensorArrayNonUniformIndexingNative() { return nshaderStorageTensorArrayNonUniformIndexingNative(address()) != 0; }
    /** @return the value of the {@code shaderTensorSupportedStages} field. */
    @NativeType("VkShaderStageFlags")
    public int shaderTensorSupportedStages() { return nshaderTensorSupportedStages(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceTensorPropertiesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_PROPERTIES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_PROPERTIES_ARM} value to the {@code sType} field. */
    public VkPhysicalDeviceTensorPropertiesARM sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_PROPERTIES_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceTensorPropertiesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceTensorPropertiesARM set(
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
    public VkPhysicalDeviceTensorPropertiesARM set(VkPhysicalDeviceTensorPropertiesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceTensorPropertiesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTensorPropertiesARM malloc() {
        return new VkPhysicalDeviceTensorPropertiesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceTensorPropertiesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTensorPropertiesARM calloc() {
        return new VkPhysicalDeviceTensorPropertiesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceTensorPropertiesARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceTensorPropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceTensorPropertiesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceTensorPropertiesARM} instance for the specified memory address. */
    public static VkPhysicalDeviceTensorPropertiesARM create(long address) {
        return new VkPhysicalDeviceTensorPropertiesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceTensorPropertiesARM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceTensorPropertiesARM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTensorPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTensorPropertiesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTensorPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTensorPropertiesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTensorPropertiesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTensorPropertiesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceTensorPropertiesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTensorPropertiesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceTensorPropertiesARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTensorPropertiesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTensorPropertiesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceTensorPropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTensorPropertiesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTensorPropertiesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceTensorPropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTensorPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTensorPropertiesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTensorPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTensorPropertiesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceTensorPropertiesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceTensorPropertiesARM.PNEXT); }
    /** Unsafe version of {@link #maxTensorDimensionCount}. */
    public static int nmaxTensorDimensionCount(long struct) { return memGetInt(struct + VkPhysicalDeviceTensorPropertiesARM.MAXTENSORDIMENSIONCOUNT); }
    /** Unsafe version of {@link #maxTensorElements}. */
    public static long nmaxTensorElements(long struct) { return memGetLong(struct + VkPhysicalDeviceTensorPropertiesARM.MAXTENSORELEMENTS); }
    /** Unsafe version of {@link #maxPerDimensionTensorElements}. */
    public static long nmaxPerDimensionTensorElements(long struct) { return memGetLong(struct + VkPhysicalDeviceTensorPropertiesARM.MAXPERDIMENSIONTENSORELEMENTS); }
    /** Unsafe version of {@link #maxTensorStride}. */
    public static long nmaxTensorStride(long struct) { return memGetLong(struct + VkPhysicalDeviceTensorPropertiesARM.MAXTENSORSTRIDE); }
    /** Unsafe version of {@link #maxTensorSize}. */
    public static long nmaxTensorSize(long struct) { return memGetLong(struct + VkPhysicalDeviceTensorPropertiesARM.MAXTENSORSIZE); }
    /** Unsafe version of {@link #maxTensorShaderAccessArrayLength}. */
    public static int nmaxTensorShaderAccessArrayLength(long struct) { return memGetInt(struct + VkPhysicalDeviceTensorPropertiesARM.MAXTENSORSHADERACCESSARRAYLENGTH); }
    /** Unsafe version of {@link #maxTensorShaderAccessSize}. */
    public static int nmaxTensorShaderAccessSize(long struct) { return memGetInt(struct + VkPhysicalDeviceTensorPropertiesARM.MAXTENSORSHADERACCESSSIZE); }
    /** Unsafe version of {@link #maxDescriptorSetStorageTensors}. */
    public static int nmaxDescriptorSetStorageTensors(long struct) { return memGetInt(struct + VkPhysicalDeviceTensorPropertiesARM.MAXDESCRIPTORSETSTORAGETENSORS); }
    /** Unsafe version of {@link #maxPerStageDescriptorSetStorageTensors}. */
    public static int nmaxPerStageDescriptorSetStorageTensors(long struct) { return memGetInt(struct + VkPhysicalDeviceTensorPropertiesARM.MAXPERSTAGEDESCRIPTORSETSTORAGETENSORS); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindStorageTensors}. */
    public static int nmaxDescriptorSetUpdateAfterBindStorageTensors(long struct) { return memGetInt(struct + VkPhysicalDeviceTensorPropertiesARM.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGETENSORS); }
    /** Unsafe version of {@link #maxPerStageDescriptorUpdateAfterBindStorageTensors}. */
    public static int nmaxPerStageDescriptorUpdateAfterBindStorageTensors(long struct) { return memGetInt(struct + VkPhysicalDeviceTensorPropertiesARM.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGETENSORS); }
    /** Unsafe version of {@link #shaderStorageTensorArrayNonUniformIndexingNative}. */
    public static int nshaderStorageTensorArrayNonUniformIndexingNative(long struct) { return memGetInt(struct + VkPhysicalDeviceTensorPropertiesARM.SHADERSTORAGETENSORARRAYNONUNIFORMINDEXINGNATIVE); }
    /** Unsafe version of {@link #shaderTensorSupportedStages}. */
    public static int nshaderTensorSupportedStages(long struct) { return memGetInt(struct + VkPhysicalDeviceTensorPropertiesARM.SHADERTENSORSUPPORTEDSTAGES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTensorPropertiesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceTensorPropertiesARM.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceTensorPropertiesARM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTensorPropertiesARM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceTensorPropertiesARM ELEMENT_FACTORY = VkPhysicalDeviceTensorPropertiesARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceTensorPropertiesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceTensorPropertiesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceTensorPropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceTensorPropertiesARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceTensorPropertiesARM.npNext(address()); }
        /** @return the value of the {@code maxTensorDimensionCount} field. */
        @NativeType("uint32_t")
        public int maxTensorDimensionCount() { return VkPhysicalDeviceTensorPropertiesARM.nmaxTensorDimensionCount(address()); }
        /** @return the value of the {@code maxTensorElements} field. */
        @NativeType("uint64_t")
        public long maxTensorElements() { return VkPhysicalDeviceTensorPropertiesARM.nmaxTensorElements(address()); }
        /** @return the value of the {@code maxPerDimensionTensorElements} field. */
        @NativeType("uint64_t")
        public long maxPerDimensionTensorElements() { return VkPhysicalDeviceTensorPropertiesARM.nmaxPerDimensionTensorElements(address()); }
        /** @return the value of the {@code maxTensorStride} field. */
        @NativeType("int64_t")
        public long maxTensorStride() { return VkPhysicalDeviceTensorPropertiesARM.nmaxTensorStride(address()); }
        /** @return the value of the {@code maxTensorSize} field. */
        @NativeType("uint64_t")
        public long maxTensorSize() { return VkPhysicalDeviceTensorPropertiesARM.nmaxTensorSize(address()); }
        /** @return the value of the {@code maxTensorShaderAccessArrayLength} field. */
        @NativeType("uint32_t")
        public int maxTensorShaderAccessArrayLength() { return VkPhysicalDeviceTensorPropertiesARM.nmaxTensorShaderAccessArrayLength(address()); }
        /** @return the value of the {@code maxTensorShaderAccessSize} field. */
        @NativeType("uint32_t")
        public int maxTensorShaderAccessSize() { return VkPhysicalDeviceTensorPropertiesARM.nmaxTensorShaderAccessSize(address()); }
        /** @return the value of the {@code maxDescriptorSetStorageTensors} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetStorageTensors() { return VkPhysicalDeviceTensorPropertiesARM.nmaxDescriptorSetStorageTensors(address()); }
        /** @return the value of the {@code maxPerStageDescriptorSetStorageTensors} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorSetStorageTensors() { return VkPhysicalDeviceTensorPropertiesARM.nmaxPerStageDescriptorSetStorageTensors(address()); }
        /** @return the value of the {@code maxDescriptorSetUpdateAfterBindStorageTensors} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindStorageTensors() { return VkPhysicalDeviceTensorPropertiesARM.nmaxDescriptorSetUpdateAfterBindStorageTensors(address()); }
        /** @return the value of the {@code maxPerStageDescriptorUpdateAfterBindStorageTensors} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindStorageTensors() { return VkPhysicalDeviceTensorPropertiesARM.nmaxPerStageDescriptorUpdateAfterBindStorageTensors(address()); }
        /** @return the value of the {@code shaderStorageTensorArrayNonUniformIndexingNative} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageTensorArrayNonUniformIndexingNative() { return VkPhysicalDeviceTensorPropertiesARM.nshaderStorageTensorArrayNonUniformIndexingNative(address()) != 0; }
        /** @return the value of the {@code shaderTensorSupportedStages} field. */
        @NativeType("VkShaderStageFlags")
        public int shaderTensorSupportedStages() { return VkPhysicalDeviceTensorPropertiesARM.nshaderTensorSupportedStages(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceTensorPropertiesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceTensorPropertiesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_PROPERTIES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_PROPERTIES_ARM} value to the {@code sType} field. */
        public VkPhysicalDeviceTensorPropertiesARM.Buffer sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_PROPERTIES_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceTensorPropertiesARM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceTensorPropertiesARM.npNext(address(), value); return this; }

    }

}