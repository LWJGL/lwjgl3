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
 * <p>If the {@link VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceProperties2}, it is filled with the implementation-dependent limits.</p>
 * 
 * <p>If {@code filterMinmaxSingleComponentFormats} is {@link VK10#VK_TRUE TRUE}, the following formats <b>must</b> support the {@link EXTSamplerFilterMinmax#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT_EXT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT_EXT} feature with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, if they support {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}.</p>
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
 * <p>If {@code filterMinmaxImageComponentMapping} is {@link VK10#VK_FALSE FALSE} the component mapping of the image view used with min/max filtering <b>must</b> have been created with the {@code r} component set to {@link VK10#VK_COMPONENT_SWIZZLE_IDENTITY COMPONENT_SWIZZLE_IDENTITY}. Only the {@code r} component of the sampled image value is defined and the other component values are undefined. If {@code filterMinmaxImageComponentMapping} is {@link VK10#VK_TRUE TRUE} this restriction does not apply and image component mapping works as normal.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTSamplerFilterMinmax#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code filterMinmaxSingleComponentFormats} &ndash; a boolean value indicating whether a minimum set of required formats support min/max filtering.</li>
 * <li>{@code filterMinmaxImageComponentMapping} &ndash; a boolean value indicating whether the implementation supports non-identity component mapping of the image when doing min/max filtering.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 filterMinmaxSingleComponentFormats;
 *     VkBool32 filterMinmaxImageComponentMapping;
 * }</code></pre>
 */
public class VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT extends Struct implements NativeResource {

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
     * Creates a {@code VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT(ByteBuffer container) {
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
    /** Returns the value of the {@code filterMinmaxSingleComponentFormats} field. */
    @NativeType("VkBool32")
    public boolean filterMinmaxSingleComponentFormats() { return nfilterMinmaxSingleComponentFormats(address()) != 0; }
    /** Returns the value of the {@code filterMinmaxImageComponentMapping} field. */
    @NativeType("VkBool32")
    public boolean filterMinmaxImageComponentMapping() { return nfilterMinmaxImageComponentMapping(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT set(
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
    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT set(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT malloc() {
        return wrap(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT calloc() {
        return wrap(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT create(long address) {
        return wrap(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #filterMinmaxSingleComponentFormats}. */
    public static int nfilterMinmaxSingleComponentFormats(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.FILTERMINMAXSINGLECOMPONENTFORMATS); }
    /** Unsafe version of {@link #filterMinmaxImageComponentMapping}. */
    public static int nfilterMinmaxImageComponentMapping(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.FILTERMINMAXIMAGECOMPONENTMAPPING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.npNext(address()); }
        /** Returns the value of the {@code filterMinmaxSingleComponentFormats} field. */
        @NativeType("VkBool32")
        public boolean filterMinmaxSingleComponentFormats() { return VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.nfilterMinmaxSingleComponentFormats(address()) != 0; }
        /** Returns the value of the {@code filterMinmaxImageComponentMapping} field. */
        @NativeType("VkBool32")
        public boolean filterMinmaxImageComponentMapping() { return VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.nfilterMinmaxImageComponentMapping(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT.npNext(address(), value); return this; }

    }

}