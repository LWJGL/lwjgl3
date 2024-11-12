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
 * Structure describing various implementation-defined properties introduced with VK_KHR_maintenance7.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceMaintenance7PropertiesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRMaintenance7#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_PROPERTIES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMaintenance7PropertiesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #robustFragmentShadingRateAttachmentAccess};
 *     VkBool32 {@link #separateDepthStencilAttachmentAccess};
 *     uint32_t {@link #maxDescriptorSetTotalUniformBuffersDynamic};
 *     uint32_t {@link #maxDescriptorSetTotalStorageBuffersDynamic};
 *     uint32_t {@link #maxDescriptorSetTotalBuffersDynamic};
 *     uint32_t {@link #maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic};
 *     uint32_t {@link #maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic};
 *     uint32_t {@link #maxDescriptorSetUpdateAfterBindTotalBuffersDynamic};
 * }</code></pre>
 */
public class VkPhysicalDeviceMaintenance7PropertiesKHR extends Struct<VkPhysicalDeviceMaintenance7PropertiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ROBUSTFRAGMENTSHADINGRATEATTACHMENTACCESS,
        SEPARATEDEPTHSTENCILATTACHMENTACCESS,
        MAXDESCRIPTORSETTOTALUNIFORMBUFFERSDYNAMIC,
        MAXDESCRIPTORSETTOTALSTORAGEBUFFERSDYNAMIC,
        MAXDESCRIPTORSETTOTALBUFFERSDYNAMIC,
        MAXDESCRIPTORSETUPDATEAFTERBINDTOTALUNIFORMBUFFERSDYNAMIC,
        MAXDESCRIPTORSETUPDATEAFTERBINDTOTALSTORAGEBUFFERSDYNAMIC,
        MAXDESCRIPTORSETUPDATEAFTERBINDTOTALBUFFERSDYNAMIC;

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
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ROBUSTFRAGMENTSHADINGRATEATTACHMENTACCESS = layout.offsetof(2);
        SEPARATEDEPTHSTENCILATTACHMENTACCESS = layout.offsetof(3);
        MAXDESCRIPTORSETTOTALUNIFORMBUFFERSDYNAMIC = layout.offsetof(4);
        MAXDESCRIPTORSETTOTALSTORAGEBUFFERSDYNAMIC = layout.offsetof(5);
        MAXDESCRIPTORSETTOTALBUFFERSDYNAMIC = layout.offsetof(6);
        MAXDESCRIPTORSETUPDATEAFTERBINDTOTALUNIFORMBUFFERSDYNAMIC = layout.offsetof(7);
        MAXDESCRIPTORSETUPDATEAFTERBINDTOTALSTORAGEBUFFERSDYNAMIC = layout.offsetof(8);
        MAXDESCRIPTORSETUPDATEAFTERBINDTOTALBUFFERSDYNAMIC = layout.offsetof(9);
    }

    protected VkPhysicalDeviceMaintenance7PropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMaintenance7PropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMaintenance7PropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMaintenance7PropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMaintenance7PropertiesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates whether the scaled size of a fragment shading rate attachment <b>can</b> be less than the size of the render area. If {@code robustFragmentShadingRateAttachmentAccess} is {@link VK10#VK_FALSE FALSE}, the size of the attachment multiplied by the texel size <b>must</b> be greater than or equal to the size of the render area. If it is {@link VK10#VK_TRUE TRUE} and the fragment shading rate attachment was created with {@link VkImageSubresourceRange}{@code ::baseMipLevel} equal to 0, the scaled size <b>can</b> be smaller than the render area, and shading rates for missing texels are defined by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-texel-replacement">texel replacement for invalid texels</a>. */
    @NativeType("VkBool32")
    public boolean robustFragmentShadingRateAttachmentAccess() { return nrobustFragmentShadingRateAttachmentAccess(address()) != 0; }
    /** indicates support for writing to one aspect of a depth/stencil attachment without performing read-modify-write operations on the other aspect. If this property is {@link VK10#VK_TRUE TRUE}, writes to one aspect <b>must</b> not result in read-modify-write operations on the other aspect. If {@link VK10#VK_FALSE FALSE}, writes to one aspect <b>may</b> result in writes to the other aspect as defined by <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-load-operations">render pass load operations</a>, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-store-operations">render pass store operations</a> and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-resolve-operations">render pass resolve operations</a>. */
    @NativeType("VkBool32")
    public boolean separateDepthStencilAttachmentAccess() { return nseparateDepthStencilAttachmentAccess(address()) != 0; }
    /** the maximum total count of dynamic uniform buffers that <b>can</b> be included in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. See <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-uniformbufferdynamic">Dynamic Uniform Buffer</a>. */
    @NativeType("uint32_t")
    public int maxDescriptorSetTotalUniformBuffersDynamic() { return nmaxDescriptorSetTotalUniformBuffersDynamic(address()); }
    /** the maximum total count of dynamic storage buffers that <b>can</b> be included in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. See <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-storagebufferdynamic">Dynamic Storage Buffer</a>. */
    @NativeType("uint32_t")
    public int maxDescriptorSetTotalStorageBuffersDynamic() { return nmaxDescriptorSetTotalStorageBuffersDynamic(address()); }
    /** the maximum total count of dynamic uniform buffers and storage buffers that <b>can</b> be included in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. */
    @NativeType("uint32_t")
    public int maxDescriptorSetTotalBuffersDynamic() { return nmaxDescriptorSetTotalBuffersDynamic(address()); }
    /** similar to {@code maxDescriptorSetTotalUniformBuffersDynamic} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic() { return nmaxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(address()); }
    /** similar to {@code maxDescriptorSetTotalStorageBuffersDynamic} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic() { return nmaxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(address()); }
    /** similar to {@code maxDescriptorSetTotalBuffersDynamic} but counts descriptors from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set. While an application <b>can</b> allocate dynamic storage buffer descriptors from a pool created with the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT}, bindings for these descriptors <b>must</b> not be present in any descriptor set layout that includes bindings created with {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT}. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindTotalBuffersDynamic() { return nmaxDescriptorSetUpdateAfterBindTotalBuffersDynamic(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceMaintenance7PropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance7#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_PROPERTIES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDeviceMaintenance7PropertiesKHR sType$Default() { return sType(KHRMaintenance7.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_PROPERTIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceMaintenance7PropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMaintenance7PropertiesKHR set(
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
    public VkPhysicalDeviceMaintenance7PropertiesKHR set(VkPhysicalDeviceMaintenance7PropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMaintenance7PropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMaintenance7PropertiesKHR malloc() {
        return new VkPhysicalDeviceMaintenance7PropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance7PropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMaintenance7PropertiesKHR calloc() {
        return new VkPhysicalDeviceMaintenance7PropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance7PropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMaintenance7PropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMaintenance7PropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance7PropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceMaintenance7PropertiesKHR create(long address) {
        return new VkPhysicalDeviceMaintenance7PropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceMaintenance7PropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMaintenance7PropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance7PropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance7PropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance7PropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance7PropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance7PropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance7PropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMaintenance7PropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance7PropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceMaintenance7PropertiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMaintenance7PropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMaintenance7PropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance7PropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMaintenance7PropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMaintenance7PropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance7PropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance7PropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance7PropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance7PropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance7PropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance7PropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMaintenance7PropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #robustFragmentShadingRateAttachmentAccess}. */
    public static int nrobustFragmentShadingRateAttachmentAccess(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance7PropertiesKHR.ROBUSTFRAGMENTSHADINGRATEATTACHMENTACCESS); }
    /** Unsafe version of {@link #separateDepthStencilAttachmentAccess}. */
    public static int nseparateDepthStencilAttachmentAccess(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance7PropertiesKHR.SEPARATEDEPTHSTENCILATTACHMENTACCESS); }
    /** Unsafe version of {@link #maxDescriptorSetTotalUniformBuffersDynamic}. */
    public static int nmaxDescriptorSetTotalUniformBuffersDynamic(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance7PropertiesKHR.MAXDESCRIPTORSETTOTALUNIFORMBUFFERSDYNAMIC); }
    /** Unsafe version of {@link #maxDescriptorSetTotalStorageBuffersDynamic}. */
    public static int nmaxDescriptorSetTotalStorageBuffersDynamic(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance7PropertiesKHR.MAXDESCRIPTORSETTOTALSTORAGEBUFFERSDYNAMIC); }
    /** Unsafe version of {@link #maxDescriptorSetTotalBuffersDynamic}. */
    public static int nmaxDescriptorSetTotalBuffersDynamic(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance7PropertiesKHR.MAXDESCRIPTORSETTOTALBUFFERSDYNAMIC); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic}. */
    public static int nmaxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance7PropertiesKHR.MAXDESCRIPTORSETUPDATEAFTERBINDTOTALUNIFORMBUFFERSDYNAMIC); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic}. */
    public static int nmaxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance7PropertiesKHR.MAXDESCRIPTORSETUPDATEAFTERBINDTOTALSTORAGEBUFFERSDYNAMIC); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindTotalBuffersDynamic}. */
    public static int nmaxDescriptorSetUpdateAfterBindTotalBuffersDynamic(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance7PropertiesKHR.MAXDESCRIPTORSETUPDATEAFTERBINDTOTALBUFFERSDYNAMIC); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMaintenance7PropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMaintenance7PropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMaintenance7PropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMaintenance7PropertiesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMaintenance7PropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceMaintenance7PropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMaintenance7PropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMaintenance7PropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMaintenance7PropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceMaintenance7PropertiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMaintenance7PropertiesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance7PropertiesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMaintenance7PropertiesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance7PropertiesKHR#robustFragmentShadingRateAttachmentAccess} field. */
        @NativeType("VkBool32")
        public boolean robustFragmentShadingRateAttachmentAccess() { return VkPhysicalDeviceMaintenance7PropertiesKHR.nrobustFragmentShadingRateAttachmentAccess(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance7PropertiesKHR#separateDepthStencilAttachmentAccess} field. */
        @NativeType("VkBool32")
        public boolean separateDepthStencilAttachmentAccess() { return VkPhysicalDeviceMaintenance7PropertiesKHR.nseparateDepthStencilAttachmentAccess(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance7PropertiesKHR#maxDescriptorSetTotalUniformBuffersDynamic} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetTotalUniformBuffersDynamic() { return VkPhysicalDeviceMaintenance7PropertiesKHR.nmaxDescriptorSetTotalUniformBuffersDynamic(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance7PropertiesKHR#maxDescriptorSetTotalStorageBuffersDynamic} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetTotalStorageBuffersDynamic() { return VkPhysicalDeviceMaintenance7PropertiesKHR.nmaxDescriptorSetTotalStorageBuffersDynamic(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance7PropertiesKHR#maxDescriptorSetTotalBuffersDynamic} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetTotalBuffersDynamic() { return VkPhysicalDeviceMaintenance7PropertiesKHR.nmaxDescriptorSetTotalBuffersDynamic(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance7PropertiesKHR#maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic() { return VkPhysicalDeviceMaintenance7PropertiesKHR.nmaxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance7PropertiesKHR#maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic() { return VkPhysicalDeviceMaintenance7PropertiesKHR.nmaxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance7PropertiesKHR#maxDescriptorSetUpdateAfterBindTotalBuffersDynamic} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindTotalBuffersDynamic() { return VkPhysicalDeviceMaintenance7PropertiesKHR.nmaxDescriptorSetUpdateAfterBindTotalBuffersDynamic(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceMaintenance7PropertiesKHR#sType} field. */
        public VkPhysicalDeviceMaintenance7PropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance7#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_PROPERTIES_KHR} value to the {@link VkPhysicalDeviceMaintenance7PropertiesKHR#sType} field. */
        public VkPhysicalDeviceMaintenance7PropertiesKHR.Buffer sType$Default() { return sType(KHRMaintenance7.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_PROPERTIES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDeviceMaintenance7PropertiesKHR#pNext} field. */
        public VkPhysicalDeviceMaintenance7PropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMaintenance7PropertiesKHR.npNext(address(), value); return this; }

    }

}