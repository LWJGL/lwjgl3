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
 * Structure describing whether the implementation supports maintenance6 functionality.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceMaintenance6FeaturesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceMaintenance6FeaturesKHR} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRMaintenance6#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMaintenance6FeaturesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #maintenance6};
 * }</code></pre>
 */
public class VkPhysicalDeviceMaintenance6FeaturesKHR extends Struct<VkPhysicalDeviceMaintenance6FeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAINTENANCE6;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAINTENANCE6 = layout.offsetof(2);
    }

    protected VkPhysicalDeviceMaintenance6FeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMaintenance6FeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMaintenance6FeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMaintenance6FeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMaintenance6FeaturesKHR(ByteBuffer container) {
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
    /**
     * indicates that the implementation supports the following:
     * 
     * <ul>
     * <li>{@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>can</b> be used when binding an index buffer</li>
     * <li>{@link VkBindMemoryStatusKHR} <b>can</b> be included in the {@code pNext} chain of the {@link VkBindBufferMemoryInfo} and {@link VkBindImageMemoryInfo} structures, enabling applications to retrieve {@code VkResult} values for individual memory binding operations.</li>
     * <li>{@link VkPhysicalDeviceMaintenance6PropertiesKHR}{@code ::blockTexelViewCompatibleMultipleLayers} property to indicate that the implementation supports creating image views with {@link VK11#VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT} where the {@code layerCount} member of {@code subresourceRange} is greater than 1.</li>
     * <li>{@link VkPhysicalDeviceMaintenance6PropertiesKHR}{@code ::maxCombinedImageSamplerDescriptorCount} property which indicates the maximum descriptor size required for any <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">format that requires a sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> supported by the implementation.</li>
     * <li>A {@link VkPhysicalDeviceMaintenance6PropertiesKHR}{@code ::fragmentShadingRateClampCombinerInputs} property which indicates whether the implementation clamps the inputs to fragment shading rate combiner operations.</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean maintenance6() { return nmaintenance6(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceMaintenance6FeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance6#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDeviceMaintenance6FeaturesKHR sType$Default() { return sType(KHRMaintenance6.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceMaintenance6FeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #maintenance6} field. */
    public VkPhysicalDeviceMaintenance6FeaturesKHR maintenance6(@NativeType("VkBool32") boolean value) { nmaintenance6(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMaintenance6FeaturesKHR set(
        int sType,
        long pNext,
        boolean maintenance6
    ) {
        sType(sType);
        pNext(pNext);
        maintenance6(maintenance6);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMaintenance6FeaturesKHR set(VkPhysicalDeviceMaintenance6FeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMaintenance6FeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMaintenance6FeaturesKHR malloc() {
        return new VkPhysicalDeviceMaintenance6FeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance6FeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMaintenance6FeaturesKHR calloc() {
        return new VkPhysicalDeviceMaintenance6FeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance6FeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMaintenance6FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMaintenance6FeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance6FeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceMaintenance6FeaturesKHR create(long address) {
        return new VkPhysicalDeviceMaintenance6FeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceMaintenance6FeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMaintenance6FeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance6FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance6FeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance6FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance6FeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance6FeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance6FeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMaintenance6FeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance6FeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceMaintenance6FeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMaintenance6FeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMaintenance6FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance6FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMaintenance6FeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMaintenance6FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance6FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance6FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance6FeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance6FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance6FeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance6FeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMaintenance6FeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #maintenance6}. */
    public static int nmaintenance6(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance6FeaturesKHR.MAINTENANCE6); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMaintenance6FeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMaintenance6FeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #maintenance6(boolean) maintenance6}. */
    public static void nmaintenance6(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMaintenance6FeaturesKHR.MAINTENANCE6, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMaintenance6FeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMaintenance6FeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMaintenance6FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceMaintenance6FeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMaintenance6FeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMaintenance6FeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMaintenance6FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceMaintenance6FeaturesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMaintenance6FeaturesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance6FeaturesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMaintenance6FeaturesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance6FeaturesKHR#maintenance6} field. */
        @NativeType("VkBool32")
        public boolean maintenance6() { return VkPhysicalDeviceMaintenance6FeaturesKHR.nmaintenance6(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceMaintenance6FeaturesKHR#sType} field. */
        public VkPhysicalDeviceMaintenance6FeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMaintenance6FeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance6#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES_KHR} value to the {@link VkPhysicalDeviceMaintenance6FeaturesKHR#sType} field. */
        public VkPhysicalDeviceMaintenance6FeaturesKHR.Buffer sType$Default() { return sType(KHRMaintenance6.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDeviceMaintenance6FeaturesKHR#pNext} field. */
        public VkPhysicalDeviceMaintenance6FeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMaintenance6FeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceMaintenance6FeaturesKHR#maintenance6} field. */
        public VkPhysicalDeviceMaintenance6FeaturesKHR.Buffer maintenance6(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMaintenance6FeaturesKHR.nmaintenance6(address(), value ? 1 : 0); return this; }

    }

}