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
 * Structure describing shading rate image limits that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceShadingRateImagePropertiesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <p>These properties are related to the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-shading-rate-image">shading rate image</a> feature.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVShadingRateImage#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShadingRateImagePropertiesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     {@link VkExtent2D VkExtent2D} {@link #shadingRateTexelSize};
 *     uint32_t {@link #shadingRatePaletteSize};
 *     uint32_t {@link #shadingRateMaxCoarseSamples};
 * }</code></pre>
 */
public class VkPhysicalDeviceShadingRateImagePropertiesNV extends Struct<VkPhysicalDeviceShadingRateImagePropertiesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADINGRATETEXELSIZE,
        SHADINGRATEPALETTESIZE,
        SHADINGRATEMAXCOARSESAMPLES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADINGRATETEXELSIZE = layout.offsetof(2);
        SHADINGRATEPALETTESIZE = layout.offsetof(3);
        SHADINGRATEMAXCOARSESAMPLES = layout.offsetof(4);
    }

    protected VkPhysicalDeviceShadingRateImagePropertiesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShadingRateImagePropertiesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShadingRateImagePropertiesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShadingRateImagePropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShadingRateImagePropertiesNV(ByteBuffer container) {
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
    /** indicates the width and height of the portion of the framebuffer corresponding to each texel in the shading rate image. */
    public VkExtent2D shadingRateTexelSize() { return nshadingRateTexelSize(address()); }
    /** indicates the maximum number of palette entries supported for the shading rate image. */
    @NativeType("uint32_t")
    public int shadingRatePaletteSize() { return nshadingRatePaletteSize(address()); }
    /** specifies the maximum number of coverage samples supported in a single fragment. If the product of the fragment size derived from the base shading rate and the number of coverage samples per pixel exceeds this limit, the final shading rate will be adjusted so that its product does not exceed the limit. */
    @NativeType("uint32_t")
    public int shadingRateMaxCoarseSamples() { return nshadingRateMaxCoarseSamples(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShadingRateImagePropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVShadingRateImage#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceShadingRateImagePropertiesNV sType$Default() { return sType(NVShadingRateImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShadingRateImagePropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShadingRateImagePropertiesNV set(
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
    public VkPhysicalDeviceShadingRateImagePropertiesNV set(VkPhysicalDeviceShadingRateImagePropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShadingRateImagePropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShadingRateImagePropertiesNV malloc() {
        return new VkPhysicalDeviceShadingRateImagePropertiesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShadingRateImagePropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShadingRateImagePropertiesNV calloc() {
        return new VkPhysicalDeviceShadingRateImagePropertiesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShadingRateImagePropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShadingRateImagePropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShadingRateImagePropertiesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShadingRateImagePropertiesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceShadingRateImagePropertiesNV create(long address) {
        return new VkPhysicalDeviceShadingRateImagePropertiesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShadingRateImagePropertiesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShadingRateImagePropertiesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShadingRateImagePropertiesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShadingRateImagePropertiesNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShadingRateImagePropertiesNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShadingRateImagePropertiesNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShadingRateImagePropertiesNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceShadingRateImagePropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShadingRateImagePropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShadingRateImagePropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShadingRateImagePropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShadingRateImagePropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShadingRateImagePropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShadingRateImagePropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShadingRateImagePropertiesNV.PNEXT); }
    /** Unsafe version of {@link #shadingRateTexelSize}. */
    public static VkExtent2D nshadingRateTexelSize(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceShadingRateImagePropertiesNV.SHADINGRATETEXELSIZE); }
    /** Unsafe version of {@link #shadingRatePaletteSize}. */
    public static int nshadingRatePaletteSize(long struct) { return memGetInt(struct + VkPhysicalDeviceShadingRateImagePropertiesNV.SHADINGRATEPALETTESIZE); }
    /** Unsafe version of {@link #shadingRateMaxCoarseSamples}. */
    public static int nshadingRateMaxCoarseSamples(long struct) { return memGetInt(struct + VkPhysicalDeviceShadingRateImagePropertiesNV.SHADINGRATEMAXCOARSESAMPLES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShadingRateImagePropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShadingRateImagePropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShadingRateImagePropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShadingRateImagePropertiesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShadingRateImagePropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceShadingRateImagePropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShadingRateImagePropertiesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShadingRateImagePropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShadingRateImagePropertiesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShadingRateImagePropertiesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShadingRateImagePropertiesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShadingRateImagePropertiesNV.npNext(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkPhysicalDeviceShadingRateImagePropertiesNV#shadingRateTexelSize} field. */
        public VkExtent2D shadingRateTexelSize() { return VkPhysicalDeviceShadingRateImagePropertiesNV.nshadingRateTexelSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShadingRateImagePropertiesNV#shadingRatePaletteSize} field. */
        @NativeType("uint32_t")
        public int shadingRatePaletteSize() { return VkPhysicalDeviceShadingRateImagePropertiesNV.nshadingRatePaletteSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShadingRateImagePropertiesNV#shadingRateMaxCoarseSamples} field. */
        @NativeType("uint32_t")
        public int shadingRateMaxCoarseSamples() { return VkPhysicalDeviceShadingRateImagePropertiesNV.nshadingRateMaxCoarseSamples(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceShadingRateImagePropertiesNV#sType} field. */
        public VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShadingRateImagePropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVShadingRateImage#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV} value to the {@link VkPhysicalDeviceShadingRateImagePropertiesNV#sType} field. */
        public VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer sType$Default() { return sType(NVShadingRateImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceShadingRateImagePropertiesNV#pNext} field. */
        public VkPhysicalDeviceShadingRateImagePropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShadingRateImagePropertiesNV.npNext(address(), value); return this; }

    }

}