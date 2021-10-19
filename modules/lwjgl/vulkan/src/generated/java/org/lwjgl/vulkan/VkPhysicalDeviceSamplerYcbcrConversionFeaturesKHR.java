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
 * See {@link VkPhysicalDeviceSamplerYcbcrConversionFeatures}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 samplerYcbcrConversion;
 * }</code></pre>
 */
public class VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR extends VkPhysicalDeviceSamplerYcbcrConversionFeatures {

    /**
     * Creates a {@code VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code samplerYcbcrConversion} field. */
    @Override
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR samplerYcbcrConversion(@NativeType("VkBool32") boolean value) { nsamplerYcbcrConversion(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR set(
        int sType,
        long pNext,
        boolean samplerYcbcrConversion
    ) {
        sType(sType);
        pNext(pNext);
        samplerYcbcrConversion(samplerYcbcrConversion);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR set(VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR malloc() {
        return wrap(VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR calloc() {
        return wrap(VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR create(long address) {
        return wrap(VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceSamplerYcbcrConversionFeatures.Buffer {

        private static final VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
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
        protected VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code samplerYcbcrConversion} field. */
        @Override
        public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Buffer samplerYcbcrConversion(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.nsamplerYcbcrConversion(address(), value ? 1 : 0); return this; }

    }

}