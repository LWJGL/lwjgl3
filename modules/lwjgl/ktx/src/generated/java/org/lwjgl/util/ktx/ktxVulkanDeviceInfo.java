/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.*;

/**
 * Struct for passing information about the Vulkan device on which to create images to the texture image loading functions.
 * 
 * <p>Avoids passing a large number of parameters to each loading function. Use of {@link KTXVulkan#ktxVulkanDeviceInfo_Create VulkanDeviceInfo_Create} or {@link KTXVulkan#ktxVulkanDeviceInfo_Construct VulkanDeviceInfo_Construct} to populate
 * this structure is highly recommended.</p>
 * 
 * <pre><code>
 *     ktxVulkanDeviceInfo vdi;
 *     ktxVulkanTexture texture;
 *  
 *     vdi = ktxVulkanDeviceInfo_create(physicalDevice,
 *                                      device,
 *                                      queue,
 *                                      cmdPool,
 *                                      &amp;allocator);
 *     ktxLoadVkTextureN("texture_1.ktx", vdi, &amp;texture, NULL, NULL);
 *     // ...
 *     ktxLoadVkTextureN("texture_n.ktx", vdi, &amp;texture, NULL, NULL);
 *     ktxVulkanDeviceInfo_destroy(vdi);</code></pre>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ktxVulkanDeviceInfo {
 *     VkInstance {@link #instance};
 *     VkPhysicalDevice {@link #physicalDevice};
 *     VkDevice {@link #device};
 *     VkQueue {@link #queue};
 *     VkCommandBuffer {@link #cmdBuffer};
 *     VkCommandPool {@link #cmdPool};
 *     {@link VkAllocationCallbacks VkAllocationCallbacks} const * {@link #pAllocator};
 *     {@link VkPhysicalDeviceMemoryProperties VkPhysicalDeviceMemoryProperties} {@link #deviceMemoryProperties};
 *     {@link ktxVulkanFunctions ktxVulkanFunctions} {@link #vkFuncs};
 * }</code></pre>
 */
public class ktxVulkanDeviceInfo extends Struct<ktxVulkanDeviceInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        INSTANCE,
        PHYSICALDEVICE,
        DEVICE,
        QUEUE,
        CMDBUFFER,
        CMDPOOL,
        PALLOCATOR,
        DEVICEMEMORYPROPERTIES,
        VKFUNCS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE),
            __member(VkPhysicalDeviceMemoryProperties.SIZEOF, VkPhysicalDeviceMemoryProperties.ALIGNOF),
            __member(ktxVulkanFunctions.SIZEOF, ktxVulkanFunctions.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        INSTANCE = layout.offsetof(0);
        PHYSICALDEVICE = layout.offsetof(1);
        DEVICE = layout.offsetof(2);
        QUEUE = layout.offsetof(3);
        CMDBUFFER = layout.offsetof(4);
        CMDPOOL = layout.offsetof(5);
        PALLOCATOR = layout.offsetof(6);
        DEVICEMEMORYPROPERTIES = layout.offsetof(7);
        VKFUNCS = layout.offsetof(8);
    }

    protected ktxVulkanDeviceInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ktxVulkanDeviceInfo create(long address, @Nullable ByteBuffer container) {
        return new ktxVulkanDeviceInfo(address, container);
    }

    /**
     * Creates a {@code ktxVulkanDeviceInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ktxVulkanDeviceInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** instance used to communicate with vulkan */
    @NativeType("VkInstance")
    public long instance() { return ninstance(address()); }
    /** handle of the physical device */
    @NativeType("VkPhysicalDevice")
    public long physicalDevice() { return nphysicalDevice(address()); }
    /** handle of the logical device */
    @NativeType("VkDevice")
    public long device() { return ndevice(address()); }
    /** handle to the queue to which to submit commands */
    @NativeType("VkQueue")
    public long queue() { return nqueue(address()); }
    /** handle of the cmdBuffer to use */
    @NativeType("VkCommandBuffer")
    public long cmdBuffer() { return ncmdBuffer(address()); }
    /** handle of the command pool from which to allocate the command buffer */
    @NativeType("VkCommandPool")
    public long cmdPool() { return ncmdPool(address()); }
    /** pointer to the allocator to use for the command buffer and created images */
    @Nullable
    @NativeType("VkAllocationCallbacks const *")
    public VkAllocationCallbacks pAllocator() { return npAllocator(address()); }
    /** memory properties of the Vulkan physical device */
    public VkPhysicalDeviceMemoryProperties deviceMemoryProperties() { return ndeviceMemoryProperties(address()); }
    /** the functions needed to operate functions */
    public ktxVulkanFunctions vkFuncs() { return nvkFuncs(address()); }

    /** Sets the specified value to the {@link #instance} field. */
    public ktxVulkanDeviceInfo instance(VkInstance value) { ninstance(address(), value); return this; }
    /** Sets the specified value to the {@link #physicalDevice} field. */
    public ktxVulkanDeviceInfo physicalDevice(VkPhysicalDevice value) { nphysicalDevice(address(), value); return this; }
    /** Sets the specified value to the {@link #device} field. */
    public ktxVulkanDeviceInfo device(VkDevice value) { ndevice(address(), value); return this; }
    /** Sets the specified value to the {@link #queue} field. */
    public ktxVulkanDeviceInfo queue(VkQueue value) { nqueue(address(), value); return this; }
    /** Sets the specified value to the {@link #cmdBuffer} field. */
    public ktxVulkanDeviceInfo cmdBuffer(VkCommandBuffer value) { ncmdBuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #cmdPool} field. */
    public ktxVulkanDeviceInfo cmdPool(@NativeType("VkCommandPool") long value) { ncmdPool(address(), value); return this; }
    /** Sets the address of the specified {@link VkAllocationCallbacks} to the {@link #pAllocator} field. */
    public ktxVulkanDeviceInfo pAllocator(@Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks value) { npAllocator(address(), value); return this; }
    /** Copies the specified {@link VkPhysicalDeviceMemoryProperties} to the {@link #deviceMemoryProperties} field. */
    public ktxVulkanDeviceInfo deviceMemoryProperties(VkPhysicalDeviceMemoryProperties value) { ndeviceMemoryProperties(address(), value); return this; }
    /** Copies the specified {@link ktxVulkanFunctions} to the {@link #vkFuncs} field. */
    public ktxVulkanDeviceInfo vkFuncs(ktxVulkanFunctions value) { nvkFuncs(address(), value); return this; }
    /** Passes the {@link #vkFuncs} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ktxVulkanDeviceInfo vkFuncs(java.util.function.Consumer<ktxVulkanFunctions> consumer) { consumer.accept(vkFuncs()); return this; }

    /** Initializes this struct with the specified values. */
    public ktxVulkanDeviceInfo set(
        VkInstance instance,
        VkPhysicalDevice physicalDevice,
        VkDevice device,
        VkQueue queue,
        VkCommandBuffer cmdBuffer,
        long cmdPool,
        @Nullable VkAllocationCallbacks pAllocator,
        VkPhysicalDeviceMemoryProperties deviceMemoryProperties,
        ktxVulkanFunctions vkFuncs
    ) {
        instance(instance);
        physicalDevice(physicalDevice);
        device(device);
        queue(queue);
        cmdBuffer(cmdBuffer);
        cmdPool(cmdPool);
        pAllocator(pAllocator);
        deviceMemoryProperties(deviceMemoryProperties);
        vkFuncs(vkFuncs);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ktxVulkanDeviceInfo set(ktxVulkanDeviceInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ktxVulkanDeviceInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ktxVulkanDeviceInfo malloc() {
        return new ktxVulkanDeviceInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ktxVulkanDeviceInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ktxVulkanDeviceInfo calloc() {
        return new ktxVulkanDeviceInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ktxVulkanDeviceInfo} instance allocated with {@link BufferUtils}. */
    public static ktxVulkanDeviceInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ktxVulkanDeviceInfo(memAddress(container), container);
    }

    /** Returns a new {@code ktxVulkanDeviceInfo} instance for the specified memory address. */
    public static ktxVulkanDeviceInfo create(long address) {
        return new ktxVulkanDeviceInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ktxVulkanDeviceInfo createSafe(long address) {
        return address == NULL ? null : new ktxVulkanDeviceInfo(address, null);
    }

    /**
     * Returns a new {@link ktxVulkanDeviceInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ktxVulkanDeviceInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ktxVulkanDeviceInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ktxVulkanDeviceInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ktxVulkanDeviceInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ktxVulkanDeviceInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ktxVulkanDeviceInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ktxVulkanDeviceInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ktxVulkanDeviceInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ktxVulkanDeviceInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ktxVulkanDeviceInfo malloc(MemoryStack stack) {
        return new ktxVulkanDeviceInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ktxVulkanDeviceInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ktxVulkanDeviceInfo calloc(MemoryStack stack) {
        return new ktxVulkanDeviceInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ktxVulkanDeviceInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ktxVulkanDeviceInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ktxVulkanDeviceInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ktxVulkanDeviceInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #instance}. */
    public static long ninstance(long struct) { return memGetAddress(struct + ktxVulkanDeviceInfo.INSTANCE); }
    /** Unsafe version of {@link #physicalDevice}. */
    public static long nphysicalDevice(long struct) { return memGetAddress(struct + ktxVulkanDeviceInfo.PHYSICALDEVICE); }
    /** Unsafe version of {@link #device}. */
    public static long ndevice(long struct) { return memGetAddress(struct + ktxVulkanDeviceInfo.DEVICE); }
    /** Unsafe version of {@link #queue}. */
    public static long nqueue(long struct) { return memGetAddress(struct + ktxVulkanDeviceInfo.QUEUE); }
    /** Unsafe version of {@link #cmdBuffer}. */
    public static long ncmdBuffer(long struct) { return memGetAddress(struct + ktxVulkanDeviceInfo.CMDBUFFER); }
    /** Unsafe version of {@link #cmdPool}. */
    public static long ncmdPool(long struct) { return UNSAFE.getLong(null, struct + ktxVulkanDeviceInfo.CMDPOOL); }
    /** Unsafe version of {@link #pAllocator}. */
    @Nullable public static VkAllocationCallbacks npAllocator(long struct) { return VkAllocationCallbacks.createSafe(memGetAddress(struct + ktxVulkanDeviceInfo.PALLOCATOR)); }
    /** Unsafe version of {@link #deviceMemoryProperties}. */
    public static VkPhysicalDeviceMemoryProperties ndeviceMemoryProperties(long struct) { return VkPhysicalDeviceMemoryProperties.create(struct + ktxVulkanDeviceInfo.DEVICEMEMORYPROPERTIES); }
    /** Unsafe version of {@link #vkFuncs}. */
    public static ktxVulkanFunctions nvkFuncs(long struct) { return ktxVulkanFunctions.create(struct + ktxVulkanDeviceInfo.VKFUNCS); }

    /** Unsafe version of {@link #instance(VkInstance) instance}. */
    public static void ninstance(long struct, VkInstance value) { memPutAddress(struct + ktxVulkanDeviceInfo.INSTANCE, value.address()); }
    /** Unsafe version of {@link #physicalDevice(VkPhysicalDevice) physicalDevice}. */
    public static void nphysicalDevice(long struct, VkPhysicalDevice value) { memPutAddress(struct + ktxVulkanDeviceInfo.PHYSICALDEVICE, value.address()); }
    /** Unsafe version of {@link #device(VkDevice) device}. */
    public static void ndevice(long struct, VkDevice value) { memPutAddress(struct + ktxVulkanDeviceInfo.DEVICE, value.address()); }
    /** Unsafe version of {@link #queue(VkQueue) queue}. */
    public static void nqueue(long struct, VkQueue value) { memPutAddress(struct + ktxVulkanDeviceInfo.QUEUE, value.address()); }
    /** Unsafe version of {@link #cmdBuffer(VkCommandBuffer) cmdBuffer}. */
    public static void ncmdBuffer(long struct, VkCommandBuffer value) { memPutAddress(struct + ktxVulkanDeviceInfo.CMDBUFFER, value.address()); }
    /** Unsafe version of {@link #cmdPool(long) cmdPool}. */
    public static void ncmdPool(long struct, long value) { UNSAFE.putLong(null, struct + ktxVulkanDeviceInfo.CMDPOOL, value); }
    /** Unsafe version of {@link #pAllocator(VkAllocationCallbacks) pAllocator}. */
    public static void npAllocator(long struct, @Nullable VkAllocationCallbacks value) { memPutAddress(struct + ktxVulkanDeviceInfo.PALLOCATOR, memAddressSafe(value)); }
    /** Unsafe version of {@link #deviceMemoryProperties(VkPhysicalDeviceMemoryProperties) deviceMemoryProperties}. */
    public static void ndeviceMemoryProperties(long struct, VkPhysicalDeviceMemoryProperties value) { memCopy(value.address(), struct + ktxVulkanDeviceInfo.DEVICEMEMORYPROPERTIES, VkPhysicalDeviceMemoryProperties.SIZEOF); }
    /** Unsafe version of {@link #vkFuncs(ktxVulkanFunctions) vkFuncs}. */
    public static void nvkFuncs(long struct, ktxVulkanFunctions value) { memCopy(value.address(), struct + ktxVulkanDeviceInfo.VKFUNCS, ktxVulkanFunctions.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ktxVulkanDeviceInfo.INSTANCE));
        check(memGetAddress(struct + ktxVulkanDeviceInfo.PHYSICALDEVICE));
        check(memGetAddress(struct + ktxVulkanDeviceInfo.DEVICE));
        check(memGetAddress(struct + ktxVulkanDeviceInfo.QUEUE));
        check(memGetAddress(struct + ktxVulkanDeviceInfo.CMDBUFFER));
        ktxVulkanFunctions.validate(struct + ktxVulkanDeviceInfo.VKFUNCS);
    }

    // -----------------------------------

    /** An array of {@link ktxVulkanDeviceInfo} structs. */
    public static class Buffer extends StructBuffer<ktxVulkanDeviceInfo, Buffer> implements NativeResource {

        private static final ktxVulkanDeviceInfo ELEMENT_FACTORY = ktxVulkanDeviceInfo.create(-1L);

        /**
         * Creates a new {@code ktxVulkanDeviceInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ktxVulkanDeviceInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected ktxVulkanDeviceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link ktxVulkanDeviceInfo#instance} field. */
        @NativeType("VkInstance")
        public long instance() { return ktxVulkanDeviceInfo.ninstance(address()); }
        /** @return the value of the {@link ktxVulkanDeviceInfo#physicalDevice} field. */
        @NativeType("VkPhysicalDevice")
        public long physicalDevice() { return ktxVulkanDeviceInfo.nphysicalDevice(address()); }
        /** @return the value of the {@link ktxVulkanDeviceInfo#device} field. */
        @NativeType("VkDevice")
        public long device() { return ktxVulkanDeviceInfo.ndevice(address()); }
        /** @return the value of the {@link ktxVulkanDeviceInfo#queue} field. */
        @NativeType("VkQueue")
        public long queue() { return ktxVulkanDeviceInfo.nqueue(address()); }
        /** @return the value of the {@link ktxVulkanDeviceInfo#cmdBuffer} field. */
        @NativeType("VkCommandBuffer")
        public long cmdBuffer() { return ktxVulkanDeviceInfo.ncmdBuffer(address()); }
        /** @return the value of the {@link ktxVulkanDeviceInfo#cmdPool} field. */
        @NativeType("VkCommandPool")
        public long cmdPool() { return ktxVulkanDeviceInfo.ncmdPool(address()); }
        /** @return a {@link VkAllocationCallbacks} view of the struct pointed to by the {@link ktxVulkanDeviceInfo#pAllocator} field. */
        @Nullable
        @NativeType("VkAllocationCallbacks const *")
        public VkAllocationCallbacks pAllocator() { return ktxVulkanDeviceInfo.npAllocator(address()); }
        /** @return a {@link VkPhysicalDeviceMemoryProperties} view of the {@link ktxVulkanDeviceInfo#deviceMemoryProperties} field. */
        public VkPhysicalDeviceMemoryProperties deviceMemoryProperties() { return ktxVulkanDeviceInfo.ndeviceMemoryProperties(address()); }
        /** @return a {@link ktxVulkanFunctions} view of the {@link ktxVulkanDeviceInfo#vkFuncs} field. */
        public ktxVulkanFunctions vkFuncs() { return ktxVulkanDeviceInfo.nvkFuncs(address()); }

        /** Sets the specified value to the {@link ktxVulkanDeviceInfo#instance} field. */
        public ktxVulkanDeviceInfo.Buffer instance(VkInstance value) { ktxVulkanDeviceInfo.ninstance(address(), value); return this; }
        /** Sets the specified value to the {@link ktxVulkanDeviceInfo#physicalDevice} field. */
        public ktxVulkanDeviceInfo.Buffer physicalDevice(VkPhysicalDevice value) { ktxVulkanDeviceInfo.nphysicalDevice(address(), value); return this; }
        /** Sets the specified value to the {@link ktxVulkanDeviceInfo#device} field. */
        public ktxVulkanDeviceInfo.Buffer device(VkDevice value) { ktxVulkanDeviceInfo.ndevice(address(), value); return this; }
        /** Sets the specified value to the {@link ktxVulkanDeviceInfo#queue} field. */
        public ktxVulkanDeviceInfo.Buffer queue(VkQueue value) { ktxVulkanDeviceInfo.nqueue(address(), value); return this; }
        /** Sets the specified value to the {@link ktxVulkanDeviceInfo#cmdBuffer} field. */
        public ktxVulkanDeviceInfo.Buffer cmdBuffer(VkCommandBuffer value) { ktxVulkanDeviceInfo.ncmdBuffer(address(), value); return this; }
        /** Sets the specified value to the {@link ktxVulkanDeviceInfo#cmdPool} field. */
        public ktxVulkanDeviceInfo.Buffer cmdPool(@NativeType("VkCommandPool") long value) { ktxVulkanDeviceInfo.ncmdPool(address(), value); return this; }
        /** Sets the address of the specified {@link VkAllocationCallbacks} to the {@link ktxVulkanDeviceInfo#pAllocator} field. */
        public ktxVulkanDeviceInfo.Buffer pAllocator(@Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks value) { ktxVulkanDeviceInfo.npAllocator(address(), value); return this; }
        /** Copies the specified {@link VkPhysicalDeviceMemoryProperties} to the {@link ktxVulkanDeviceInfo#deviceMemoryProperties} field. */
        public ktxVulkanDeviceInfo.Buffer deviceMemoryProperties(VkPhysicalDeviceMemoryProperties value) { ktxVulkanDeviceInfo.ndeviceMemoryProperties(address(), value); return this; }
        /** Copies the specified {@link ktxVulkanFunctions} to the {@link ktxVulkanDeviceInfo#vkFuncs} field. */
        public ktxVulkanDeviceInfo.Buffer vkFuncs(ktxVulkanFunctions value) { ktxVulkanDeviceInfo.nvkFuncs(address(), value); return this; }
        /** Passes the {@link ktxVulkanDeviceInfo#vkFuncs} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ktxVulkanDeviceInfo.Buffer vkFuncs(java.util.function.Consumer<ktxVulkanFunctions> consumer) { consumer.accept(vkFuncs()); return this; }

    }

}