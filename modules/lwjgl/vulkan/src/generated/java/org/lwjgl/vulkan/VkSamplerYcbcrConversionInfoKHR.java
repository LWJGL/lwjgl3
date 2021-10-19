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
 * See {@link VkSamplerYcbcrConversionInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSamplerYcbcrConversionInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSamplerYcbcrConversion conversion;
 * }</code></pre>
 */
public class VkSamplerYcbcrConversionInfoKHR extends VkSamplerYcbcrConversionInfo {

    /**
     * Creates a {@code VkSamplerYcbcrConversionInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSamplerYcbcrConversionInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkSamplerYcbcrConversionInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO} value to the {@code sType} field. */
    @Override
    public VkSamplerYcbcrConversionInfoKHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkSamplerYcbcrConversionInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code conversion} field. */
    @Override
    public VkSamplerYcbcrConversionInfoKHR conversion(@NativeType("VkSamplerYcbcrConversion") long value) { nconversion(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkSamplerYcbcrConversionInfoKHR set(
        int sType,
        long pNext,
        long conversion
    ) {
        sType(sType);
        pNext(pNext);
        conversion(conversion);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSamplerYcbcrConversionInfoKHR set(VkSamplerYcbcrConversionInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSamplerYcbcrConversionInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSamplerYcbcrConversionInfoKHR malloc() {
        return wrap(VkSamplerYcbcrConversionInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSamplerYcbcrConversionInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSamplerYcbcrConversionInfoKHR calloc() {
        return wrap(VkSamplerYcbcrConversionInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSamplerYcbcrConversionInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkSamplerYcbcrConversionInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSamplerYcbcrConversionInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSamplerYcbcrConversionInfoKHR} instance for the specified memory address. */
    public static VkSamplerYcbcrConversionInfoKHR create(long address) {
        return wrap(VkSamplerYcbcrConversionInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerYcbcrConversionInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkSamplerYcbcrConversionInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSamplerYcbcrConversionInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerYcbcrConversionInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSamplerYcbcrConversionInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSamplerYcbcrConversionInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerYcbcrConversionInfoKHR malloc(MemoryStack stack) {
        return wrap(VkSamplerYcbcrConversionInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSamplerYcbcrConversionInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerYcbcrConversionInfoKHR calloc(MemoryStack stack) {
        return wrap(VkSamplerYcbcrConversionInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkSamplerYcbcrConversionInfoKHR} structs. */
    public static class Buffer extends VkSamplerYcbcrConversionInfo.Buffer {

        private static final VkSamplerYcbcrConversionInfoKHR ELEMENT_FACTORY = VkSamplerYcbcrConversionInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkSamplerYcbcrConversionInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSamplerYcbcrConversionInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkSamplerYcbcrConversionInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkSamplerYcbcrConversionInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSamplerYcbcrConversionInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO} value to the {@code sType} field. */
        @Override
        public VkSamplerYcbcrConversionInfoKHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkSamplerYcbcrConversionInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkSamplerYcbcrConversionInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code conversion} field. */
        @Override
        public VkSamplerYcbcrConversionInfoKHR.Buffer conversion(@NativeType("VkSamplerYcbcrConversion") long value) { VkSamplerYcbcrConversionInfoKHR.nconversion(address(), value); return this; }

    }

}