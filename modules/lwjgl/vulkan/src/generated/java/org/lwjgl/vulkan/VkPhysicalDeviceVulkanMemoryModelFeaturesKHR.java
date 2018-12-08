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
public class VkPhysicalDeviceVulkanMemoryModelFeaturesKHR extends Struct implements NativeResource {

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

    /**
     * Creates a {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
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
    /** Sets the specified value to the {@code vulkanMemoryModel} field. */
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR vulkanMemoryModel(@NativeType("VkBool32") boolean value) { nvulkanMemoryModel(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vulkanMemoryModelDeviceScope} field. */
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR vulkanMemoryModelDeviceScope(@NativeType("VkBool32") boolean value) { nvulkanMemoryModelDeviceScope(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR set(
        int sType,
        long pNext,
        boolean vulkanMemoryModel,
        boolean vulkanMemoryModelDeviceScope
    ) {
        sType(sType);
        pNext(pNext);
        vulkanMemoryModel(vulkanMemoryModel);
        vulkanMemoryModelDeviceScope(vulkanMemoryModelDeviceScope);

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

    /** Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR malloc() {
        return wrap(VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR calloc() {
        return wrap(VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR create(long address) {
        return wrap(VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #vulkanMemoryModel}. */
    public static int nvulkanMemoryModel(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.VULKANMEMORYMODEL); }
    /** Unsafe version of {@link #vulkanMemoryModelDeviceScope}. */
    public static int nvulkanMemoryModelDeviceScope(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.VULKANMEMORYMODELDEVICESCOPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #vulkanMemoryModel(boolean) vulkanMemoryModel}. */
    public static void nvulkanMemoryModel(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.VULKANMEMORYMODEL, value); }
    /** Unsafe version of {@link #vulkanMemoryModelDeviceScope(boolean) vulkanMemoryModelDeviceScope}. */
    public static void nvulkanMemoryModelDeviceScope(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.VULKANMEMORYMODELDEVICESCOPE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkanMemoryModelFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVulkanMemoryModelFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.create(-1L);

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
        protected VkPhysicalDeviceVulkanMemoryModelFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
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
        /** Sets the specified value to the {@code vulkanMemoryModel} field. */
        public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer vulkanMemoryModel(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.nvulkanMemoryModel(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vulkanMemoryModelDeviceScope} field. */
        public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer vulkanMemoryModelDeviceScope(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.nvulkanMemoryModelDeviceScope(address(), value ? 1 : 0); return this; }

    }

}