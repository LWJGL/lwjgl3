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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.VK10.*;
import static org.lwjgl.vulkan.VK11.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceVulkan11Properties {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint8_t deviceUUID[VK_UUID_SIZE];
 *     uint8_t driverUUID[VK_UUID_SIZE];
 *     uint8_t deviceLUID[VK_LUID_SIZE];
 *     uint32_t deviceNodeMask;
 *     VkBool32 deviceLUIDValid;
 *     uint32_t subgroupSize;
 *     VkShaderStageFlags subgroupSupportedStages;
 *     VkSubgroupFeatureFlags subgroupSupportedOperations;
 *     VkBool32 subgroupQuadOperationsInAllStages;
 *     VkPointClippingBehavior pointClippingBehavior;
 *     uint32_t maxMultiviewViewCount;
 *     uint32_t maxMultiviewInstanceIndex;
 *     VkBool32 protectedNoFault;
 *     uint32_t maxPerSetDescriptors;
 *     VkDeviceSize maxMemoryAllocationSize;
 * }}</pre>
 */
public class VkPhysicalDeviceVulkan11Properties extends Struct<VkPhysicalDeviceVulkan11Properties> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEVICEUUID,
        DRIVERUUID,
        DEVICELUID,
        DEVICENODEMASK,
        DEVICELUIDVALID,
        SUBGROUPSIZE,
        SUBGROUPSUPPORTEDSTAGES,
        SUBGROUPSUPPORTEDOPERATIONS,
        SUBGROUPQUADOPERATIONSINALLSTAGES,
        POINTCLIPPINGBEHAVIOR,
        MAXMULTIVIEWVIEWCOUNT,
        MAXMULTIVIEWINSTANCEINDEX,
        PROTECTEDNOFAULT,
        MAXPERSETDESCRIPTORS,
        MAXMEMORYALLOCATIONSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, VK_UUID_SIZE),
            __array(1, VK_UUID_SIZE),
            __array(1, VK_LUID_SIZE),
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
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEUUID = layout.offsetof(2);
        DRIVERUUID = layout.offsetof(3);
        DEVICELUID = layout.offsetof(4);
        DEVICENODEMASK = layout.offsetof(5);
        DEVICELUIDVALID = layout.offsetof(6);
        SUBGROUPSIZE = layout.offsetof(7);
        SUBGROUPSUPPORTEDSTAGES = layout.offsetof(8);
        SUBGROUPSUPPORTEDOPERATIONS = layout.offsetof(9);
        SUBGROUPQUADOPERATIONSINALLSTAGES = layout.offsetof(10);
        POINTCLIPPINGBEHAVIOR = layout.offsetof(11);
        MAXMULTIVIEWVIEWCOUNT = layout.offsetof(12);
        MAXMULTIVIEWINSTANCEINDEX = layout.offsetof(13);
        PROTECTEDNOFAULT = layout.offsetof(14);
        MAXPERSETDESCRIPTORS = layout.offsetof(15);
        MAXMEMORYALLOCATIONSIZE = layout.offsetof(16);
    }

    protected VkPhysicalDeviceVulkan11Properties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceVulkan11Properties create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceVulkan11Properties(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVulkan11Properties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVulkan11Properties(ByteBuffer container) {
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
    /** @return a {@link ByteBuffer} view of the {@code deviceUUID} field. */
    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer deviceUUID() { return ndeviceUUID(address()); }
    /** @return the value at the specified index of the {@code deviceUUID} field. */
    @NativeType("uint8_t")
    public byte deviceUUID(int index) { return ndeviceUUID(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code driverUUID} field. */
    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer driverUUID() { return ndriverUUID(address()); }
    /** @return the value at the specified index of the {@code driverUUID} field. */
    @NativeType("uint8_t")
    public byte driverUUID(int index) { return ndriverUUID(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code deviceLUID} field. */
    @NativeType("uint8_t[VK_LUID_SIZE]")
    public ByteBuffer deviceLUID() { return ndeviceLUID(address()); }
    /** @return the value at the specified index of the {@code deviceLUID} field. */
    @NativeType("uint8_t")
    public byte deviceLUID(int index) { return ndeviceLUID(address(), index); }
    /** @return the value of the {@code deviceNodeMask} field. */
    @NativeType("uint32_t")
    public int deviceNodeMask() { return ndeviceNodeMask(address()); }
    /** @return the value of the {@code deviceLUIDValid} field. */
    @NativeType("VkBool32")
    public boolean deviceLUIDValid() { return ndeviceLUIDValid(address()) != 0; }
    /** @return the value of the {@code subgroupSize} field. */
    @NativeType("uint32_t")
    public int subgroupSize() { return nsubgroupSize(address()); }
    /** @return the value of the {@code subgroupSupportedStages} field. */
    @NativeType("VkShaderStageFlags")
    public int subgroupSupportedStages() { return nsubgroupSupportedStages(address()); }
    /** @return the value of the {@code subgroupSupportedOperations} field. */
    @NativeType("VkSubgroupFeatureFlags")
    public int subgroupSupportedOperations() { return nsubgroupSupportedOperations(address()); }
    /** @return the value of the {@code subgroupQuadOperationsInAllStages} field. */
    @NativeType("VkBool32")
    public boolean subgroupQuadOperationsInAllStages() { return nsubgroupQuadOperationsInAllStages(address()) != 0; }
    /** @return the value of the {@code pointClippingBehavior} field. */
    @NativeType("VkPointClippingBehavior")
    public int pointClippingBehavior() { return npointClippingBehavior(address()); }
    /** @return the value of the {@code maxMultiviewViewCount} field. */
    @NativeType("uint32_t")
    public int maxMultiviewViewCount() { return nmaxMultiviewViewCount(address()); }
    /** @return the value of the {@code maxMultiviewInstanceIndex} field. */
    @NativeType("uint32_t")
    public int maxMultiviewInstanceIndex() { return nmaxMultiviewInstanceIndex(address()); }
    /** @return the value of the {@code protectedNoFault} field. */
    @NativeType("VkBool32")
    public boolean protectedNoFault() { return nprotectedNoFault(address()) != 0; }
    /** @return the value of the {@code maxPerSetDescriptors} field. */
    @NativeType("uint32_t")
    public int maxPerSetDescriptors() { return nmaxPerSetDescriptors(address()); }
    /** @return the value of the {@code maxMemoryAllocationSize} field. */
    @NativeType("VkDeviceSize")
    public long maxMemoryAllocationSize() { return nmaxMemoryAllocationSize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceVulkan11Properties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES} value to the {@code sType} field. */
    public VkPhysicalDeviceVulkan11Properties sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceVulkan11Properties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVulkan11Properties set(
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
    public VkPhysicalDeviceVulkan11Properties set(VkPhysicalDeviceVulkan11Properties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVulkan11Properties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan11Properties malloc() {
        return new VkPhysicalDeviceVulkan11Properties(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan11Properties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan11Properties calloc() {
        return new VkPhysicalDeviceVulkan11Properties(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan11Properties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVulkan11Properties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVulkan11Properties(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan11Properties} instance for the specified memory address. */
    public static VkPhysicalDeviceVulkan11Properties create(long address) {
        return new VkPhysicalDeviceVulkan11Properties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceVulkan11Properties createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceVulkan11Properties(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan11Properties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan11Properties.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan11Properties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan11Properties.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan11Properties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan11Properties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceVulkan11Properties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan11Properties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceVulkan11Properties.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan11Properties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan11Properties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan11Properties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan11Properties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan11Properties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan11Properties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan11Properties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan11Properties.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan11Properties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan11Properties.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Properties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVulkan11Properties.PNEXT); }
    /** Unsafe version of {@link #deviceUUID}. */
    public static ByteBuffer ndeviceUUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceVulkan11Properties.DEVICEUUID, VK_UUID_SIZE); }
    /** Unsafe version of {@link #deviceUUID(int) deviceUUID}. */
    public static byte ndeviceUUID(long struct, int index) {
        return memGetByte(struct + VkPhysicalDeviceVulkan11Properties.DEVICEUUID + check(index, VK_UUID_SIZE) * 1);
    }
    /** Unsafe version of {@link #driverUUID}. */
    public static ByteBuffer ndriverUUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceVulkan11Properties.DRIVERUUID, VK_UUID_SIZE); }
    /** Unsafe version of {@link #driverUUID(int) driverUUID}. */
    public static byte ndriverUUID(long struct, int index) {
        return memGetByte(struct + VkPhysicalDeviceVulkan11Properties.DRIVERUUID + check(index, VK_UUID_SIZE) * 1);
    }
    /** Unsafe version of {@link #deviceLUID}. */
    public static ByteBuffer ndeviceLUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceVulkan11Properties.DEVICELUID, VK_LUID_SIZE); }
    /** Unsafe version of {@link #deviceLUID(int) deviceLUID}. */
    public static byte ndeviceLUID(long struct, int index) {
        return memGetByte(struct + VkPhysicalDeviceVulkan11Properties.DEVICELUID + check(index, VK_LUID_SIZE) * 1);
    }
    /** Unsafe version of {@link #deviceNodeMask}. */
    public static int ndeviceNodeMask(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Properties.DEVICENODEMASK); }
    /** Unsafe version of {@link #deviceLUIDValid}. */
    public static int ndeviceLUIDValid(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Properties.DEVICELUIDVALID); }
    /** Unsafe version of {@link #subgroupSize}. */
    public static int nsubgroupSize(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Properties.SUBGROUPSIZE); }
    /** Unsafe version of {@link #subgroupSupportedStages}. */
    public static int nsubgroupSupportedStages(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Properties.SUBGROUPSUPPORTEDSTAGES); }
    /** Unsafe version of {@link #subgroupSupportedOperations}. */
    public static int nsubgroupSupportedOperations(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Properties.SUBGROUPSUPPORTEDOPERATIONS); }
    /** Unsafe version of {@link #subgroupQuadOperationsInAllStages}. */
    public static int nsubgroupQuadOperationsInAllStages(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Properties.SUBGROUPQUADOPERATIONSINALLSTAGES); }
    /** Unsafe version of {@link #pointClippingBehavior}. */
    public static int npointClippingBehavior(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Properties.POINTCLIPPINGBEHAVIOR); }
    /** Unsafe version of {@link #maxMultiviewViewCount}. */
    public static int nmaxMultiviewViewCount(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Properties.MAXMULTIVIEWVIEWCOUNT); }
    /** Unsafe version of {@link #maxMultiviewInstanceIndex}. */
    public static int nmaxMultiviewInstanceIndex(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Properties.MAXMULTIVIEWINSTANCEINDEX); }
    /** Unsafe version of {@link #protectedNoFault}. */
    public static int nprotectedNoFault(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Properties.PROTECTEDNOFAULT); }
    /** Unsafe version of {@link #maxPerSetDescriptors}. */
    public static int nmaxPerSetDescriptors(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan11Properties.MAXPERSETDESCRIPTORS); }
    /** Unsafe version of {@link #maxMemoryAllocationSize}. */
    public static long nmaxMemoryAllocationSize(long struct) { return memGetLong(struct + VkPhysicalDeviceVulkan11Properties.MAXMEMORYALLOCATIONSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan11Properties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVulkan11Properties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVulkan11Properties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkan11Properties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVulkan11Properties ELEMENT_FACTORY = VkPhysicalDeviceVulkan11Properties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVulkan11Properties.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVulkan11Properties#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceVulkan11Properties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVulkan11Properties.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVulkan11Properties.npNext(address()); }
        /** @return a {@link ByteBuffer} view of the {@code deviceUUID} field. */
        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer deviceUUID() { return VkPhysicalDeviceVulkan11Properties.ndeviceUUID(address()); }
        /** @return the value at the specified index of the {@code deviceUUID} field. */
        @NativeType("uint8_t")
        public byte deviceUUID(int index) { return VkPhysicalDeviceVulkan11Properties.ndeviceUUID(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code driverUUID} field. */
        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer driverUUID() { return VkPhysicalDeviceVulkan11Properties.ndriverUUID(address()); }
        /** @return the value at the specified index of the {@code driverUUID} field. */
        @NativeType("uint8_t")
        public byte driverUUID(int index) { return VkPhysicalDeviceVulkan11Properties.ndriverUUID(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code deviceLUID} field. */
        @NativeType("uint8_t[VK_LUID_SIZE]")
        public ByteBuffer deviceLUID() { return VkPhysicalDeviceVulkan11Properties.ndeviceLUID(address()); }
        /** @return the value at the specified index of the {@code deviceLUID} field. */
        @NativeType("uint8_t")
        public byte deviceLUID(int index) { return VkPhysicalDeviceVulkan11Properties.ndeviceLUID(address(), index); }
        /** @return the value of the {@code deviceNodeMask} field. */
        @NativeType("uint32_t")
        public int deviceNodeMask() { return VkPhysicalDeviceVulkan11Properties.ndeviceNodeMask(address()); }
        /** @return the value of the {@code deviceLUIDValid} field. */
        @NativeType("VkBool32")
        public boolean deviceLUIDValid() { return VkPhysicalDeviceVulkan11Properties.ndeviceLUIDValid(address()) != 0; }
        /** @return the value of the {@code subgroupSize} field. */
        @NativeType("uint32_t")
        public int subgroupSize() { return VkPhysicalDeviceVulkan11Properties.nsubgroupSize(address()); }
        /** @return the value of the {@code subgroupSupportedStages} field. */
        @NativeType("VkShaderStageFlags")
        public int subgroupSupportedStages() { return VkPhysicalDeviceVulkan11Properties.nsubgroupSupportedStages(address()); }
        /** @return the value of the {@code subgroupSupportedOperations} field. */
        @NativeType("VkSubgroupFeatureFlags")
        public int subgroupSupportedOperations() { return VkPhysicalDeviceVulkan11Properties.nsubgroupSupportedOperations(address()); }
        /** @return the value of the {@code subgroupQuadOperationsInAllStages} field. */
        @NativeType("VkBool32")
        public boolean subgroupQuadOperationsInAllStages() { return VkPhysicalDeviceVulkan11Properties.nsubgroupQuadOperationsInAllStages(address()) != 0; }
        /** @return the value of the {@code pointClippingBehavior} field. */
        @NativeType("VkPointClippingBehavior")
        public int pointClippingBehavior() { return VkPhysicalDeviceVulkan11Properties.npointClippingBehavior(address()); }
        /** @return the value of the {@code maxMultiviewViewCount} field. */
        @NativeType("uint32_t")
        public int maxMultiviewViewCount() { return VkPhysicalDeviceVulkan11Properties.nmaxMultiviewViewCount(address()); }
        /** @return the value of the {@code maxMultiviewInstanceIndex} field. */
        @NativeType("uint32_t")
        public int maxMultiviewInstanceIndex() { return VkPhysicalDeviceVulkan11Properties.nmaxMultiviewInstanceIndex(address()); }
        /** @return the value of the {@code protectedNoFault} field. */
        @NativeType("VkBool32")
        public boolean protectedNoFault() { return VkPhysicalDeviceVulkan11Properties.nprotectedNoFault(address()) != 0; }
        /** @return the value of the {@code maxPerSetDescriptors} field. */
        @NativeType("uint32_t")
        public int maxPerSetDescriptors() { return VkPhysicalDeviceVulkan11Properties.nmaxPerSetDescriptors(address()); }
        /** @return the value of the {@code maxMemoryAllocationSize} field. */
        @NativeType("VkDeviceSize")
        public long maxMemoryAllocationSize() { return VkPhysicalDeviceVulkan11Properties.nmaxMemoryAllocationSize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceVulkan11Properties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVulkan11Properties.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES} value to the {@code sType} field. */
        public VkPhysicalDeviceVulkan11Properties.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceVulkan11Properties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVulkan11Properties.npNext(address(), value); return this; }

    }

}