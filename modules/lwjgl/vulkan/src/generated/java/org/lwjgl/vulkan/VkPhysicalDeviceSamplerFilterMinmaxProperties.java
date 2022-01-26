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
 * Structure describing sampler filter minmax limits that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceSamplerFilterMinmaxProperties} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <p>If {@code filterMinmaxSingleComponentFormats} is {@link VK10#VK_TRUE TRUE}, the following formats <b>must</b> support the {@link VK12#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT} feature with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, if they support {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}:</p>
 * 
 * <ul>
 * <li>{@link VK10#VK_FORMAT_R8_UNORM FORMAT_R8_UNORM}</li>
 * <li>{@link VK10#VK_FORMAT_R8_SNORM FORMAT_R8_SNORM}</li>
 * <li>{@link VK10#VK_FORMAT_R16_UNORM FORMAT_R16_UNORM}</li>
 * <li>{@link VK10#VK_FORMAT_R16_SNORM FORMAT_R16_SNORM}</li>
 * <li>{@link VK10#VK_FORMAT_R16_SFLOAT FORMAT_R16_SFLOAT}</li>
 * <li>{@link VK10#VK_FORMAT_R32_SFLOAT FORMAT_R32_SFLOAT}</li>
 * <li>{@link VK10#VK_FORMAT_D16_UNORM FORMAT_D16_UNORM}</li>
 * <li>{@link VK10#VK_FORMAT_X8_D24_UNORM_PACK32 FORMAT_X8_D24_UNORM_PACK32}</li>
 * <li>{@link VK10#VK_FORMAT_D32_SFLOAT FORMAT_D32_SFLOAT}</li>
 * <li>{@link VK10#VK_FORMAT_D16_UNORM_S8_UINT FORMAT_D16_UNORM_S8_UINT}</li>
 * <li>{@link VK10#VK_FORMAT_D24_UNORM_S8_UINT FORMAT_D24_UNORM_S8_UINT}</li>
 * <li>{@link VK10#VK_FORMAT_D32_SFLOAT_S8_UINT FORMAT_D32_SFLOAT_S8_UINT}</li>
 * </ul>
 * 
 * <p>If the format is a depth/stencil format, this bit only specifies that the depth aspect (not the stencil aspect) of an image of this format supports min/max filtering, and that min/max filtering of the depth aspect is supported when depth compare is disabled in the sampler.</p>
 * 
 * <p>If {@code filterMinmaxImageComponentMapping} is {@link VK10#VK_FALSE FALSE} the component mapping of the image view used with min/max filtering <b>must</b> have been created with the {@code r} component set to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-views-identity-mappings">identity swizzle</a>. Only the {@code r} component of the sampled image value is defined and the other component values are undefined. If {@code filterMinmaxImageComponentMapping} is {@link VK10#VK_TRUE TRUE} this restriction does not apply and image component mapping works as normal.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceSamplerFilterMinmaxProperties {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #filterMinmaxSingleComponentFormats};
 *     VkBool32 {@link #filterMinmaxImageComponentMapping};
 * }</code></pre>
 */
public class VkPhysicalDeviceSamplerFilterMinmaxProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FILTERMINMAXSINGLECOMPONENTFORMATS,
        FILTERMINMAXIMAGECOMPONENTMAPPING;

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
        FILTERMINMAXSINGLECOMPONENTFORMATS = layout.offsetof(2);
        FILTERMINMAXIMAGECOMPONENTMAPPING = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPhysicalDeviceSamplerFilterMinmaxProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSamplerFilterMinmaxProperties(ByteBuffer container) {
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
    /** a boolean value indicating whether a minimum set of required formats support min/max filtering. */
    @NativeType("VkBool32")
    public boolean filterMinmaxSingleComponentFormats() { return nfilterMinmaxSingleComponentFormats(address()) != 0; }
    /** a boolean value indicating whether the implementation supports non-identity component mapping of the image when doing min/max filtering. */
    @NativeType("VkBool32")
    public boolean filterMinmaxImageComponentMapping() { return nfilterMinmaxImageComponentMapping(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceSamplerFilterMinmaxProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES} value to the {@link #sType} field. */
    public VkPhysicalDeviceSamplerFilterMinmaxProperties sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceSamplerFilterMinmaxProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceSamplerFilterMinmaxProperties set(
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
    public VkPhysicalDeviceSamplerFilterMinmaxProperties set(VkPhysicalDeviceSamplerFilterMinmaxProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSamplerFilterMinmaxProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties malloc() {
        return wrap(VkPhysicalDeviceSamplerFilterMinmaxProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSamplerFilterMinmaxProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties calloc() {
        return wrap(VkPhysicalDeviceSamplerFilterMinmaxProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSamplerFilterMinmaxProperties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceSamplerFilterMinmaxProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSamplerFilterMinmaxProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties create(long address) {
        return wrap(VkPhysicalDeviceSamplerFilterMinmaxProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceSamplerFilterMinmaxProperties.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerFilterMinmaxProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerFilterMinmaxProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerFilterMinmaxProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceSamplerFilterMinmaxProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSamplerFilterMinmaxProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSamplerFilterMinmaxProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSamplerFilterMinmaxProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSamplerFilterMinmaxProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerFilterMinmaxProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerFilterMinmaxProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSamplerFilterMinmaxProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceSamplerFilterMinmaxProperties.PNEXT); }
    /** Unsafe version of {@link #filterMinmaxSingleComponentFormats}. */
    public static int nfilterMinmaxSingleComponentFormats(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSamplerFilterMinmaxProperties.FILTERMINMAXSINGLECOMPONENTFORMATS); }
    /** Unsafe version of {@link #filterMinmaxImageComponentMapping}. */
    public static int nfilterMinmaxImageComponentMapping(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSamplerFilterMinmaxProperties.FILTERMINMAXIMAGECOMPONENTMAPPING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSamplerFilterMinmaxProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceSamplerFilterMinmaxProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSamplerFilterMinmaxProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSamplerFilterMinmaxProperties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceSamplerFilterMinmaxProperties ELEMENT_FACTORY = VkPhysicalDeviceSamplerFilterMinmaxProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSamplerFilterMinmaxProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSamplerFilterMinmaxProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceSamplerFilterMinmaxProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceSamplerFilterMinmaxProperties#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSamplerFilterMinmaxProperties.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSamplerFilterMinmaxProperties#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceSamplerFilterMinmaxProperties.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSamplerFilterMinmaxProperties#filterMinmaxSingleComponentFormats} field. */
        @NativeType("VkBool32")
        public boolean filterMinmaxSingleComponentFormats() { return VkPhysicalDeviceSamplerFilterMinmaxProperties.nfilterMinmaxSingleComponentFormats(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceSamplerFilterMinmaxProperties#filterMinmaxImageComponentMapping} field. */
        @NativeType("VkBool32")
        public boolean filterMinmaxImageComponentMapping() { return VkPhysicalDeviceSamplerFilterMinmaxProperties.nfilterMinmaxImageComponentMapping(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceSamplerFilterMinmaxProperties#sType} field. */
        public VkPhysicalDeviceSamplerFilterMinmaxProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSamplerFilterMinmaxProperties.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES} value to the {@link VkPhysicalDeviceSamplerFilterMinmaxProperties#sType} field. */
        public VkPhysicalDeviceSamplerFilterMinmaxProperties.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceSamplerFilterMinmaxProperties#pNext} field. */
        public VkPhysicalDeviceSamplerFilterMinmaxProperties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSamplerFilterMinmaxProperties.npNext(address(), value); return this; }

    }

}