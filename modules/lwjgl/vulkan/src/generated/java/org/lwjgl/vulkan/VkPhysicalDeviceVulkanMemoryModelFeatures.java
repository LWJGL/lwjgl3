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
 * struct VkPhysicalDeviceVulkanMemoryModelFeatures {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 vulkanMemoryModel;
 *     VkBool32 vulkanMemoryModelDeviceScope;
 *     VkBool32 vulkanMemoryModelAvailabilityVisibilityChains;
 * }}</pre>
 */
public class VkPhysicalDeviceVulkanMemoryModelFeatures extends Struct<VkPhysicalDeviceVulkanMemoryModelFeatures> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VULKANMEMORYMODEL,
        VULKANMEMORYMODELDEVICESCOPE,
        VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VULKANMEMORYMODEL = layout.offsetof(2);
        VULKANMEMORYMODELDEVICESCOPE = layout.offsetof(3);
        VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS = layout.offsetof(4);
    }

    protected VkPhysicalDeviceVulkanMemoryModelFeatures(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceVulkanMemoryModelFeatures create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceVulkanMemoryModelFeatures(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVulkanMemoryModelFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVulkanMemoryModelFeatures(ByteBuffer container) {
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
    /** @return the value of the {@code vulkanMemoryModel} field. */
    @NativeType("VkBool32")
    public boolean vulkanMemoryModel() { return nvulkanMemoryModel(address()) != 0; }
    /** @return the value of the {@code vulkanMemoryModelDeviceScope} field. */
    @NativeType("VkBool32")
    public boolean vulkanMemoryModelDeviceScope() { return nvulkanMemoryModelDeviceScope(address()) != 0; }
    /** @return the value of the {@code vulkanMemoryModelAvailabilityVisibilityChains} field. */
    @NativeType("VkBool32")
    public boolean vulkanMemoryModelAvailabilityVisibilityChains() { return nvulkanMemoryModelAvailabilityVisibilityChains(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceVulkanMemoryModelFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDeviceVulkanMemoryModelFeatures sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceVulkanMemoryModelFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code vulkanMemoryModel} field. */
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModel(@NativeType("VkBool32") boolean value) { nvulkanMemoryModel(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vulkanMemoryModelDeviceScope} field. */
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelDeviceScope(@NativeType("VkBool32") boolean value) { nvulkanMemoryModelDeviceScope(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vulkanMemoryModelAvailabilityVisibilityChains} field. */
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelAvailabilityVisibilityChains(@NativeType("VkBool32") boolean value) { nvulkanMemoryModelAvailabilityVisibilityChains(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVulkanMemoryModelFeatures set(
        int sType,
        long pNext,
        boolean vulkanMemoryModel,
        boolean vulkanMemoryModelDeviceScope,
        boolean vulkanMemoryModelAvailabilityVisibilityChains
    ) {
        sType(sType);
        pNext(pNext);
        vulkanMemoryModel(vulkanMemoryModel);
        vulkanMemoryModelDeviceScope(vulkanMemoryModelDeviceScope);
        vulkanMemoryModelAvailabilityVisibilityChains(vulkanMemoryModelAvailabilityVisibilityChains);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVulkanMemoryModelFeatures set(VkPhysicalDeviceVulkanMemoryModelFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVulkanMemoryModelFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkanMemoryModelFeatures malloc() {
        return new VkPhysicalDeviceVulkanMemoryModelFeatures(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkanMemoryModelFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkanMemoryModelFeatures calloc() {
        return new VkPhysicalDeviceVulkanMemoryModelFeatures(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkanMemoryModelFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVulkanMemoryModelFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVulkanMemoryModelFeatures(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkanMemoryModelFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceVulkanMemoryModelFeatures create(long address) {
        return new VkPhysicalDeviceVulkanMemoryModelFeatures(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceVulkanMemoryModelFeatures createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceVulkanMemoryModelFeatures(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceVulkanMemoryModelFeatures.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkanMemoryModelFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkanMemoryModelFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkanMemoryModelFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkanMemoryModelFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkanMemoryModelFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVulkanMemoryModelFeatures.PNEXT); }
    /** Unsafe version of {@link #vulkanMemoryModel}. */
    public static int nvulkanMemoryModel(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkanMemoryModelFeatures.VULKANMEMORYMODEL); }
    /** Unsafe version of {@link #vulkanMemoryModelDeviceScope}. */
    public static int nvulkanMemoryModelDeviceScope(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkanMemoryModelFeatures.VULKANMEMORYMODELDEVICESCOPE); }
    /** Unsafe version of {@link #vulkanMemoryModelAvailabilityVisibilityChains}. */
    public static int nvulkanMemoryModelAvailabilityVisibilityChains(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkanMemoryModelFeatures.VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkanMemoryModelFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVulkanMemoryModelFeatures.PNEXT, value); }
    /** Unsafe version of {@link #vulkanMemoryModel(boolean) vulkanMemoryModel}. */
    public static void nvulkanMemoryModel(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkanMemoryModelFeatures.VULKANMEMORYMODEL, value); }
    /** Unsafe version of {@link #vulkanMemoryModelDeviceScope(boolean) vulkanMemoryModelDeviceScope}. */
    public static void nvulkanMemoryModelDeviceScope(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkanMemoryModelFeatures.VULKANMEMORYMODELDEVICESCOPE, value); }
    /** Unsafe version of {@link #vulkanMemoryModelAvailabilityVisibilityChains(boolean) vulkanMemoryModelAvailabilityVisibilityChains}. */
    public static void nvulkanMemoryModelAvailabilityVisibilityChains(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkanMemoryModelFeatures.VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVulkanMemoryModelFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkanMemoryModelFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVulkanMemoryModelFeatures ELEMENT_FACTORY = VkPhysicalDeviceVulkanMemoryModelFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVulkanMemoryModelFeatures#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceVulkanMemoryModelFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVulkanMemoryModelFeatures.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVulkanMemoryModelFeatures.npNext(address()); }
        /** @return the value of the {@code vulkanMemoryModel} field. */
        @NativeType("VkBool32")
        public boolean vulkanMemoryModel() { return VkPhysicalDeviceVulkanMemoryModelFeatures.nvulkanMemoryModel(address()) != 0; }
        /** @return the value of the {@code vulkanMemoryModelDeviceScope} field. */
        @NativeType("VkBool32")
        public boolean vulkanMemoryModelDeviceScope() { return VkPhysicalDeviceVulkanMemoryModelFeatures.nvulkanMemoryModelDeviceScope(address()) != 0; }
        /** @return the value of the {@code vulkanMemoryModelAvailabilityVisibilityChains} field. */
        @NativeType("VkBool32")
        public boolean vulkanMemoryModelAvailabilityVisibilityChains() { return VkPhysicalDeviceVulkanMemoryModelFeatures.nvulkanMemoryModelAvailabilityVisibilityChains(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVulkanMemoryModelFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVulkanMemoryModelFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code vulkanMemoryModel} field. */
        public VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer vulkanMemoryModel(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkanMemoryModelFeatures.nvulkanMemoryModel(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vulkanMemoryModelDeviceScope} field. */
        public VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer vulkanMemoryModelDeviceScope(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkanMemoryModelFeatures.nvulkanMemoryModelDeviceScope(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vulkanMemoryModelAvailabilityVisibilityChains} field. */
        public VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer vulkanMemoryModelAvailabilityVisibilityChains(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkanMemoryModelFeatures.nvulkanMemoryModelAvailabilityVisibilityChains(address(), value ? 1 : 0); return this; }

    }

}