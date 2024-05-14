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
 * Structure describing various implementation-defined properties introduced with VK_KHR_maintenance6.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceMaintenance6PropertiesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRMaintenance6#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMaintenance6PropertiesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #blockTexelViewCompatibleMultipleLayers};
 *     uint32_t {@link #maxCombinedImageSamplerDescriptorCount};
 *     VkBool32 {@link #fragmentShadingRateClampCombinerInputs};
 * }</code></pre>
 */
public class VkPhysicalDeviceMaintenance6PropertiesKHR extends Struct<VkPhysicalDeviceMaintenance6PropertiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        BLOCKTEXELVIEWCOMPATIBLEMULTIPLELAYERS,
        MAXCOMBINEDIMAGESAMPLERDESCRIPTORCOUNT,
        FRAGMENTSHADINGRATECLAMPCOMBINERINPUTS;

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
        BLOCKTEXELVIEWCOMPATIBLEMULTIPLELAYERS = layout.offsetof(2);
        MAXCOMBINEDIMAGESAMPLERDESCRIPTORCOUNT = layout.offsetof(3);
        FRAGMENTSHADINGRATECLAMPCOMBINERINPUTS = layout.offsetof(4);
    }

    protected VkPhysicalDeviceMaintenance6PropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMaintenance6PropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMaintenance6PropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMaintenance6PropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMaintenance6PropertiesKHR(ByteBuffer container) {
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
    /** a boolean value indicating that an implementation supports creating image views with {@link VK11#VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT} where the {@code layerCount} member of {@code subresourceRange} is greater than 1. */
    @NativeType("VkBool32")
    public boolean blockTexelViewCompatibleMultipleLayers() { return nblockTexelViewCompatibleMultipleLayers(address()) != 0; }
    /** the maximum number of combined image sampler descriptors that the implementation uses to access any of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">formats that require a sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> supported by the implementation. */
    @NativeType("uint32_t")
    public int maxCombinedImageSamplerDescriptorCount() { return nmaxCombinedImageSamplerDescriptorCount(address()); }
    /** a boolean value indicating that an implementation clamps the inputs to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-combining">combiner operations</a>. */
    @NativeType("VkBool32")
    public boolean fragmentShadingRateClampCombinerInputs() { return nfragmentShadingRateClampCombinerInputs(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceMaintenance6PropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance6#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDeviceMaintenance6PropertiesKHR sType$Default() { return sType(KHRMaintenance6.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceMaintenance6PropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMaintenance6PropertiesKHR set(
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
    public VkPhysicalDeviceMaintenance6PropertiesKHR set(VkPhysicalDeviceMaintenance6PropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMaintenance6PropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMaintenance6PropertiesKHR malloc() {
        return new VkPhysicalDeviceMaintenance6PropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance6PropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMaintenance6PropertiesKHR calloc() {
        return new VkPhysicalDeviceMaintenance6PropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance6PropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMaintenance6PropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMaintenance6PropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance6PropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceMaintenance6PropertiesKHR create(long address) {
        return new VkPhysicalDeviceMaintenance6PropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMaintenance6PropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMaintenance6PropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance6PropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance6PropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance6PropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance6PropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance6PropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance6PropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMaintenance6PropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance6PropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMaintenance6PropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMaintenance6PropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMaintenance6PropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance6PropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMaintenance6PropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMaintenance6PropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance6PropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance6PropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance6PropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance6PropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance6PropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMaintenance6PropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMaintenance6PropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #blockTexelViewCompatibleMultipleLayers}. */
    public static int nblockTexelViewCompatibleMultipleLayers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMaintenance6PropertiesKHR.BLOCKTEXELVIEWCOMPATIBLEMULTIPLELAYERS); }
    /** Unsafe version of {@link #maxCombinedImageSamplerDescriptorCount}. */
    public static int nmaxCombinedImageSamplerDescriptorCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMaintenance6PropertiesKHR.MAXCOMBINEDIMAGESAMPLERDESCRIPTORCOUNT); }
    /** Unsafe version of {@link #fragmentShadingRateClampCombinerInputs}. */
    public static int nfragmentShadingRateClampCombinerInputs(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMaintenance6PropertiesKHR.FRAGMENTSHADINGRATECLAMPCOMBINERINPUTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMaintenance6PropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMaintenance6PropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMaintenance6PropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMaintenance6PropertiesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMaintenance6PropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceMaintenance6PropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMaintenance6PropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMaintenance6PropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMaintenance6PropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceMaintenance6PropertiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMaintenance6PropertiesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance6PropertiesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMaintenance6PropertiesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance6PropertiesKHR#blockTexelViewCompatibleMultipleLayers} field. */
        @NativeType("VkBool32")
        public boolean blockTexelViewCompatibleMultipleLayers() { return VkPhysicalDeviceMaintenance6PropertiesKHR.nblockTexelViewCompatibleMultipleLayers(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance6PropertiesKHR#maxCombinedImageSamplerDescriptorCount} field. */
        @NativeType("uint32_t")
        public int maxCombinedImageSamplerDescriptorCount() { return VkPhysicalDeviceMaintenance6PropertiesKHR.nmaxCombinedImageSamplerDescriptorCount(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance6PropertiesKHR#fragmentShadingRateClampCombinerInputs} field. */
        @NativeType("VkBool32")
        public boolean fragmentShadingRateClampCombinerInputs() { return VkPhysicalDeviceMaintenance6PropertiesKHR.nfragmentShadingRateClampCombinerInputs(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceMaintenance6PropertiesKHR#sType} field. */
        public VkPhysicalDeviceMaintenance6PropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMaintenance6PropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance6#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES_KHR} value to the {@link VkPhysicalDeviceMaintenance6PropertiesKHR#sType} field. */
        public VkPhysicalDeviceMaintenance6PropertiesKHR.Buffer sType$Default() { return sType(KHRMaintenance6.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDeviceMaintenance6PropertiesKHR#pNext} field. */
        public VkPhysicalDeviceMaintenance6PropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMaintenance6PropertiesKHR.npNext(address(), value); return this; }

    }

}