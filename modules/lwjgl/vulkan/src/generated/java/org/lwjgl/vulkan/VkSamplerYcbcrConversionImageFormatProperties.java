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
 * Structure specifying combined image sampler descriptor count for multi-planar images.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSamplerYcbcrConversionImageFormatProperties {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #combinedImageSamplerDescriptorCount};
 * }</code></pre>
 */
public class VkSamplerYcbcrConversionImageFormatProperties extends Struct<VkSamplerYcbcrConversionImageFormatProperties> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COMBINEDIMAGESAMPLERDESCRIPTORCOUNT;

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
        COMBINEDIMAGESAMPLERDESCRIPTORCOUNT = layout.offsetof(2);
    }

    protected VkSamplerYcbcrConversionImageFormatProperties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSamplerYcbcrConversionImageFormatProperties create(long address, @Nullable ByteBuffer container) {
        return new VkSamplerYcbcrConversionImageFormatProperties(address, container);
    }

    /**
     * Creates a {@code VkSamplerYcbcrConversionImageFormatProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSamplerYcbcrConversionImageFormatProperties(ByteBuffer container) {
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
    /** the number of combined image sampler descriptors that the implementation uses to access the format. */
    @NativeType("uint32_t")
    public int combinedImageSamplerDescriptorCount() { return ncombinedImageSamplerDescriptorCount(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSamplerYcbcrConversionImageFormatProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES} value to the {@link #sType} field. */
    public VkSamplerYcbcrConversionImageFormatProperties sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSamplerYcbcrConversionImageFormatProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSamplerYcbcrConversionImageFormatProperties set(
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
    public VkSamplerYcbcrConversionImageFormatProperties set(VkSamplerYcbcrConversionImageFormatProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSamplerYcbcrConversionImageFormatProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSamplerYcbcrConversionImageFormatProperties malloc() {
        return new VkSamplerYcbcrConversionImageFormatProperties(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSamplerYcbcrConversionImageFormatProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSamplerYcbcrConversionImageFormatProperties calloc() {
        return new VkSamplerYcbcrConversionImageFormatProperties(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSamplerYcbcrConversionImageFormatProperties} instance allocated with {@link BufferUtils}. */
    public static VkSamplerYcbcrConversionImageFormatProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSamplerYcbcrConversionImageFormatProperties(memAddress(container), container);
    }

    /** Returns a new {@code VkSamplerYcbcrConversionImageFormatProperties} instance for the specified memory address. */
    public static VkSamplerYcbcrConversionImageFormatProperties create(long address) {
        return new VkSamplerYcbcrConversionImageFormatProperties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSamplerYcbcrConversionImageFormatProperties createSafe(long address) {
        return address == NULL ? null : new VkSamplerYcbcrConversionImageFormatProperties(address, null);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionImageFormatProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionImageFormatProperties.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionImageFormatProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionImageFormatProperties.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionImageFormatProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionImageFormatProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSamplerYcbcrConversionImageFormatProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionImageFormatProperties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSamplerYcbcrConversionImageFormatProperties.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionImageFormatProperties mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionImageFormatProperties callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionImageFormatProperties mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionImageFormatProperties callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionImageFormatProperties.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionImageFormatProperties.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionImageFormatProperties.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionImageFormatProperties.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSamplerYcbcrConversionImageFormatProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerYcbcrConversionImageFormatProperties malloc(MemoryStack stack) {
        return new VkSamplerYcbcrConversionImageFormatProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSamplerYcbcrConversionImageFormatProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerYcbcrConversionImageFormatProperties calloc(MemoryStack stack) {
        return new VkSamplerYcbcrConversionImageFormatProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionImageFormatProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionImageFormatProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionImageFormatProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionImageFormatProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSamplerYcbcrConversionImageFormatProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSamplerYcbcrConversionImageFormatProperties.PNEXT); }
    /** Unsafe version of {@link #combinedImageSamplerDescriptorCount}. */
    public static int ncombinedImageSamplerDescriptorCount(long struct) { return memGetInt(struct + VkSamplerYcbcrConversionImageFormatProperties.COMBINEDIMAGESAMPLERDESCRIPTORCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSamplerYcbcrConversionImageFormatProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSamplerYcbcrConversionImageFormatProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkSamplerYcbcrConversionImageFormatProperties} structs. */
    public static class Buffer extends StructBuffer<VkSamplerYcbcrConversionImageFormatProperties, Buffer> implements NativeResource {

        private static final VkSamplerYcbcrConversionImageFormatProperties ELEMENT_FACTORY = VkSamplerYcbcrConversionImageFormatProperties.create(-1L);

        /**
         * Creates a new {@code VkSamplerYcbcrConversionImageFormatProperties.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSamplerYcbcrConversionImageFormatProperties#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSamplerYcbcrConversionImageFormatProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSamplerYcbcrConversionImageFormatProperties#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSamplerYcbcrConversionImageFormatProperties.nsType(address()); }
        /** @return the value of the {@link VkSamplerYcbcrConversionImageFormatProperties#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSamplerYcbcrConversionImageFormatProperties.npNext(address()); }
        /** @return the value of the {@link VkSamplerYcbcrConversionImageFormatProperties#combinedImageSamplerDescriptorCount} field. */
        @NativeType("uint32_t")
        public int combinedImageSamplerDescriptorCount() { return VkSamplerYcbcrConversionImageFormatProperties.ncombinedImageSamplerDescriptorCount(address()); }

        /** Sets the specified value to the {@link VkSamplerYcbcrConversionImageFormatProperties#sType} field. */
        public VkSamplerYcbcrConversionImageFormatProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkSamplerYcbcrConversionImageFormatProperties.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES} value to the {@link VkSamplerYcbcrConversionImageFormatProperties#sType} field. */
        public VkSamplerYcbcrConversionImageFormatProperties.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES); }
        /** Sets the specified value to the {@link VkSamplerYcbcrConversionImageFormatProperties#pNext} field. */
        public VkSamplerYcbcrConversionImageFormatProperties.Buffer pNext(@NativeType("void *") long value) { VkSamplerYcbcrConversionImageFormatProperties.npNext(address(), value); return this; }

    }

}