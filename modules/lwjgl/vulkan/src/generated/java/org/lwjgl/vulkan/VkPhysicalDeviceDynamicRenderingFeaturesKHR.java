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
 * See {@link VkPhysicalDeviceDynamicRenderingFeatures}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDynamicRenderingFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 dynamicRendering;
 * }</code></pre>
 */
public class VkPhysicalDeviceDynamicRenderingFeaturesKHR extends VkPhysicalDeviceDynamicRenderingFeatures {

    /**
     * Creates a {@code VkPhysicalDeviceDynamicRenderingFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDynamicRenderingFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceDynamicRenderingFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceDynamicRenderingFeaturesKHR sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceDynamicRenderingFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code dynamicRendering} field. */
    @Override
    public VkPhysicalDeviceDynamicRenderingFeaturesKHR dynamicRendering(@NativeType("VkBool32") boolean value) { ndynamicRendering(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceDynamicRenderingFeaturesKHR set(
        int sType,
        long pNext,
        boolean dynamicRendering
    ) {
        sType(sType);
        pNext(pNext);
        dynamicRendering(dynamicRendering);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDynamicRenderingFeaturesKHR set(VkPhysicalDeviceDynamicRenderingFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDynamicRenderingFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR malloc() {
        return wrap(VkPhysicalDeviceDynamicRenderingFeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDynamicRenderingFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR calloc() {
        return wrap(VkPhysicalDeviceDynamicRenderingFeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDynamicRenderingFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceDynamicRenderingFeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDynamicRenderingFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR create(long address) {
        return wrap(VkPhysicalDeviceDynamicRenderingFeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceDynamicRenderingFeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDynamicRenderingFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDynamicRenderingFeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDynamicRenderingFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDynamicRenderingFeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceDynamicRenderingFeatures.Buffer {

        private static final VkPhysicalDeviceDynamicRenderingFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceDynamicRenderingFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceDynamicRenderingFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDynamicRenderingFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDynamicRenderingFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code dynamicRendering} field. */
        @Override
        public VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer dynamicRendering(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDynamicRenderingFeaturesKHR.ndynamicRendering(address(), value ? 1 : 0); return this; }

    }

}