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
 * See {@link VkPhysicalDeviceUniformBufferStandardLayoutFeatures}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 uniformBufferStandardLayout;
 * }</code></pre>
 */
public class VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR extends VkPhysicalDeviceUniformBufferStandardLayoutFeatures {

    /**
     * Creates a {@code VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code uniformBufferStandardLayout} field. */
    @Override
    public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR uniformBufferStandardLayout(@NativeType("VkBool32") boolean value) { nuniformBufferStandardLayout(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR set(
        int sType,
        long pNext,
        boolean uniformBufferStandardLayout
    ) {
        sType(sType);
        pNext(pNext);
        uniformBufferStandardLayout(uniformBufferStandardLayout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR set(VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR malloc() {
        return wrap(VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR calloc() {
        return wrap(VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR create(long address) {
        return wrap(VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceUniformBufferStandardLayoutFeatures.Buffer {

        private static final VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code uniformBufferStandardLayout} field. */
        @Override
        public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer uniformBufferStandardLayout(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.nuniformBufferStandardLayout(address(), value ? 1 : 0); return this; }

    }

}