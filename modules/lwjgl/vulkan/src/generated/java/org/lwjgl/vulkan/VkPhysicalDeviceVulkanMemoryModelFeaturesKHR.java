/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Structure describing features supported by VK_KHR_vulkan_memory_model.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVulkanMemoryModel#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code vulkanMemoryModel} &ndash; indicates whether the Vulkan Memory Model is supported, as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#memory-model">Vulkan Memory Model</a>. This also indicates whether shader modules <b>can</b> declare the {@code VulkanMemoryModelKHR} capability.</li>
 * <li>{@code vulkanMemoryModelDeviceScope} &ndash; indicates whether the Vulkan Memory Model can use {@code Device} scope synchronization. This also indicates whether shader modules <b>can</b> declare the {@code VulkanMemoryModelDeviceScopeKHR} capability.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceVulkanMemoryModelFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 vulkanMemoryModel;
 *     VkBool32 vulkanMemoryModelDeviceScope;
 * }</code></pre>
 */
public class VkPhysicalDeviceVulkanMemoryModelFeaturesKHR extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VULKANMEMORYMODEL,
        VULKANMEMORYMODELDEVICESCOPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VULKANMEMORYMODEL = layout.offsetof(2);
        VULKANMEMORYMODELDEVICESCOPE = layout.offsetof(3);
    }

    VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code vulkanMemoryModel} field. */
    @NativeType("VkBool32")
    public boolean vulkanMemoryModel() { return nvulkanMemoryModel(address()) != 0; }
    /** Returns the value of the {@code vulkanMemoryModelDeviceScope} field. */
    @NativeType("VkBool32")
    public boolean vulkanMemoryModelDeviceScope() { return nvulkanMemoryModelDeviceScope(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR set(
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
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR set(VkPhysicalDeviceVulkanMemoryModelFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR create(long address) {
        return new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #vulkanMemoryModel}. */
    public static int nvulkanMemoryModel(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.VULKANMEMORYMODEL); }
    /** Unsafe version of {@link #vulkanMemoryModelDeviceScope}. */
    public static int nvulkanMemoryModelDeviceScope(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.VULKANMEMORYMODELDEVICESCOPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkanMemoryModelFeaturesKHR, Buffer> {

        /**
         * Creates a new {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkPhysicalDeviceVulkanMemoryModelFeaturesKHR newInstance(long address) {
            return new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.npNext(address()); }
        /** Returns the value of the {@code vulkanMemoryModel} field. */
        @NativeType("VkBool32")
        public boolean vulkanMemoryModel() { return VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.nvulkanMemoryModel(address()) != 0; }
        /** Returns the value of the {@code vulkanMemoryModelDeviceScope} field. */
        @NativeType("VkBool32")
        public boolean vulkanMemoryModelDeviceScope() { return VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.nvulkanMemoryModelDeviceScope(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.npNext(address(), value); return this; }

    }

}