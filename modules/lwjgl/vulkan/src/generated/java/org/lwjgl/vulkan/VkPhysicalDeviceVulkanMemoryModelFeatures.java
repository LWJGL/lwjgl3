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
 * Structure describing features supported by the memory model.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceVulkanMemoryModelFeatures {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #vulkanMemoryModel};
 *     VkBool32 {@link #vulkanMemoryModelDeviceScope};
 *     VkBool32 {@link #vulkanMemoryModelAvailabilityVisibilityChains};
 * }</code></pre>
 */
public class VkPhysicalDeviceVulkanMemoryModelFeatures extends Struct implements NativeResource {

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

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates whether the Vulkan Memory Model is supported, as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-model">Vulkan Memory Model</a>. This also indicates whether shader modules <b>can</b> declare the {@code VulkanMemoryModel} capability. */
    @NativeType("VkBool32")
    public boolean vulkanMemoryModel() { return nvulkanMemoryModel(address()) != 0; }
    /** indicates whether the Vulkan Memory Model can use {@code Device} scope synchronization. This also indicates whether shader modules <b>can</b> declare the {@code VulkanMemoryModelDeviceScope} capability. */
    @NativeType("VkBool32")
    public boolean vulkanMemoryModelDeviceScope() { return nvulkanMemoryModelDeviceScope(address()) != 0; }
    /** indicates whether the Vulkan Memory Model can use <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-model-availability-visibility">availability and visibility chains</a> with more than one element. */
    @NativeType("VkBool32")
    public boolean vulkanMemoryModelAvailabilityVisibilityChains() { return nvulkanMemoryModelAvailabilityVisibilityChains(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceVulkanMemoryModelFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDeviceVulkanMemoryModelFeatures sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceVulkanMemoryModelFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #vulkanMemoryModel} field. */
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModel(@NativeType("VkBool32") boolean value) { nvulkanMemoryModel(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #vulkanMemoryModelDeviceScope} field. */
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelDeviceScope(@NativeType("VkBool32") boolean value) { nvulkanMemoryModelDeviceScope(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #vulkanMemoryModelAvailabilityVisibilityChains} field. */
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
        return wrap(VkPhysicalDeviceVulkanMemoryModelFeatures.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVulkanMemoryModelFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkanMemoryModelFeatures calloc() {
        return wrap(VkPhysicalDeviceVulkanMemoryModelFeatures.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVulkanMemoryModelFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVulkanMemoryModelFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceVulkanMemoryModelFeatures.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkanMemoryModelFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceVulkanMemoryModelFeatures create(long address) {
        return wrap(VkPhysicalDeviceVulkanMemoryModelFeatures.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVulkanMemoryModelFeatures createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceVulkanMemoryModelFeatures.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkanMemoryModelFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeatures malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVulkanMemoryModelFeatures.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkanMemoryModelFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeatures calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVulkanMemoryModelFeatures.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkanMemoryModelFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVulkanMemoryModelFeatures.PNEXT); }
    /** Unsafe version of {@link #vulkanMemoryModel}. */
    public static int nvulkanMemoryModel(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkanMemoryModelFeatures.VULKANMEMORYMODEL); }
    /** Unsafe version of {@link #vulkanMemoryModelDeviceScope}. */
    public static int nvulkanMemoryModelDeviceScope(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkanMemoryModelFeatures.VULKANMEMORYMODELDEVICESCOPE); }
    /** Unsafe version of {@link #vulkanMemoryModelAvailabilityVisibilityChains}. */
    public static int nvulkanMemoryModelAvailabilityVisibilityChains(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkanMemoryModelFeatures.VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkanMemoryModelFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVulkanMemoryModelFeatures.PNEXT, value); }
    /** Unsafe version of {@link #vulkanMemoryModel(boolean) vulkanMemoryModel}. */
    public static void nvulkanMemoryModel(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkanMemoryModelFeatures.VULKANMEMORYMODEL, value); }
    /** Unsafe version of {@link #vulkanMemoryModelDeviceScope(boolean) vulkanMemoryModelDeviceScope}. */
    public static void nvulkanMemoryModelDeviceScope(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkanMemoryModelFeatures.VULKANMEMORYMODELDEVICESCOPE, value); }
    /** Unsafe version of {@link #vulkanMemoryModelAvailabilityVisibilityChains(boolean) vulkanMemoryModelAvailabilityVisibilityChains}. */
    public static void nvulkanMemoryModelAvailabilityVisibilityChains(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkanMemoryModelFeatures.VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVulkanMemoryModelFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkanMemoryModelFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVulkanMemoryModelFeatures ELEMENT_FACTORY = VkPhysicalDeviceVulkanMemoryModelFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVulkanMemoryModelFeatures#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceVulkanMemoryModelFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceVulkanMemoryModelFeatures#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVulkanMemoryModelFeatures.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkanMemoryModelFeatures#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVulkanMemoryModelFeatures.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkanMemoryModelFeatures#vulkanMemoryModel} field. */
        @NativeType("VkBool32")
        public boolean vulkanMemoryModel() { return VkPhysicalDeviceVulkanMemoryModelFeatures.nvulkanMemoryModel(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkanMemoryModelFeatures#vulkanMemoryModelDeviceScope} field. */
        @NativeType("VkBool32")
        public boolean vulkanMemoryModelDeviceScope() { return VkPhysicalDeviceVulkanMemoryModelFeatures.nvulkanMemoryModelDeviceScope(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkanMemoryModelFeatures#vulkanMemoryModelAvailabilityVisibilityChains} field. */
        @NativeType("VkBool32")
        public boolean vulkanMemoryModelAvailabilityVisibilityChains() { return VkPhysicalDeviceVulkanMemoryModelFeatures.nvulkanMemoryModelAvailabilityVisibilityChains(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceVulkanMemoryModelFeatures#sType} field. */
        public VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVulkanMemoryModelFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES} value to the {@link VkPhysicalDeviceVulkanMemoryModelFeatures#sType} field. */
        public VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkanMemoryModelFeatures#pNext} field. */
        public VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVulkanMemoryModelFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkanMemoryModelFeatures#vulkanMemoryModel} field. */
        public VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer vulkanMemoryModel(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkanMemoryModelFeatures.nvulkanMemoryModel(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkanMemoryModelFeatures#vulkanMemoryModelDeviceScope} field. */
        public VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer vulkanMemoryModelDeviceScope(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkanMemoryModelFeatures.nvulkanMemoryModelDeviceScope(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkanMemoryModelFeatures#vulkanMemoryModelAvailabilityVisibilityChains} field. */
        public VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer vulkanMemoryModelAvailabilityVisibilityChains(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkanMemoryModelFeatures.nvulkanMemoryModelAvailabilityVisibilityChains(address(), value ? 1 : 0); return this; }

    }

}