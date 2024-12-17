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
 * struct VkPhysicalDeviceMaintenance7PropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 robustFragmentShadingRateAttachmentAccess;
 *     VkBool32 separateDepthStencilAttachmentAccess;
 *     uint32_t maxDescriptorSetTotalUniformBuffersDynamic;
 *     uint32_t maxDescriptorSetTotalStorageBuffersDynamic;
 *     uint32_t maxDescriptorSetTotalBuffersDynamic;
 *     uint32_t maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic;
 *     uint32_t maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic;
 *     uint32_t maxDescriptorSetUpdateAfterBindTotalBuffersDynamic;
 * }}</pre>
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code robustFragmentShadingRateAttachmentAccess} field. */
    @NativeType("VkBool32")
    public boolean robustFragmentShadingRateAttachmentAccess() { return nrobustFragmentShadingRateAttachmentAccess(address()) != 0; }
    /** @return the value of the {@code separateDepthStencilAttachmentAccess} field. */
    @NativeType("VkBool32")
    public boolean separateDepthStencilAttachmentAccess() { return nseparateDepthStencilAttachmentAccess(address()) != 0; }
    /** @return the value of the {@code maxDescriptorSetTotalUniformBuffersDynamic} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetTotalUniformBuffersDynamic() { return nmaxDescriptorSetTotalUniformBuffersDynamic(address()); }
    /** @return the value of the {@code maxDescriptorSetTotalStorageBuffersDynamic} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetTotalStorageBuffersDynamic() { return nmaxDescriptorSetTotalStorageBuffersDynamic(address()); }
    /** @return the value of the {@code maxDescriptorSetTotalBuffersDynamic} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetTotalBuffersDynamic() { return nmaxDescriptorSetTotalBuffersDynamic(address()); }
    /** @return the value of the {@code maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic() { return nmaxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(address()); }
    /** @return the value of the {@code maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic() { return nmaxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(address()); }
    /** @return the value of the {@code maxDescriptorSetUpdateAfterBindTotalBuffersDynamic} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindTotalBuffersDynamic() { return nmaxDescriptorSetUpdateAfterBindTotalBuffersDynamic(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceMaintenance7PropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance7#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_PROPERTIES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceMaintenance7PropertiesKHR sType$Default() { return sType(KHRMaintenance7.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_PROPERTIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
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

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMaintenance7PropertiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMaintenance7PropertiesKHR.npNext(address()); }
        /** @return the value of the {@code robustFragmentShadingRateAttachmentAccess} field. */
        @NativeType("VkBool32")
        public boolean robustFragmentShadingRateAttachmentAccess() { return VkPhysicalDeviceMaintenance7PropertiesKHR.nrobustFragmentShadingRateAttachmentAccess(address()) != 0; }
        /** @return the value of the {@code separateDepthStencilAttachmentAccess} field. */
        @NativeType("VkBool32")
        public boolean separateDepthStencilAttachmentAccess() { return VkPhysicalDeviceMaintenance7PropertiesKHR.nseparateDepthStencilAttachmentAccess(address()) != 0; }
        /** @return the value of the {@code maxDescriptorSetTotalUniformBuffersDynamic} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetTotalUniformBuffersDynamic() { return VkPhysicalDeviceMaintenance7PropertiesKHR.nmaxDescriptorSetTotalUniformBuffersDynamic(address()); }
        /** @return the value of the {@code maxDescriptorSetTotalStorageBuffersDynamic} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetTotalStorageBuffersDynamic() { return VkPhysicalDeviceMaintenance7PropertiesKHR.nmaxDescriptorSetTotalStorageBuffersDynamic(address()); }
        /** @return the value of the {@code maxDescriptorSetTotalBuffersDynamic} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetTotalBuffersDynamic() { return VkPhysicalDeviceMaintenance7PropertiesKHR.nmaxDescriptorSetTotalBuffersDynamic(address()); }
        /** @return the value of the {@code maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic() { return VkPhysicalDeviceMaintenance7PropertiesKHR.nmaxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(address()); }
        /** @return the value of the {@code maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic() { return VkPhysicalDeviceMaintenance7PropertiesKHR.nmaxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(address()); }
        /** @return the value of the {@code maxDescriptorSetUpdateAfterBindTotalBuffersDynamic} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindTotalBuffersDynamic() { return VkPhysicalDeviceMaintenance7PropertiesKHR.nmaxDescriptorSetUpdateAfterBindTotalBuffersDynamic(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceMaintenance7PropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance7#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_PROPERTIES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceMaintenance7PropertiesKHR.Buffer sType$Default() { return sType(KHRMaintenance7.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_PROPERTIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceMaintenance7PropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMaintenance7PropertiesKHR.npNext(address(), value); return this; }

    }

}