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
 * See {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 separateDepthStencilLayouts;
 * }</code></pre>
 */
public class VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR extends VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures {

    /**
     * Creates a {@code VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code separateDepthStencilLayouts} field. */
    @Override
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR separateDepthStencilLayouts(@NativeType("VkBool32") boolean value) { nseparateDepthStencilLayouts(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR set(
        int sType,
        long pNext,
        boolean separateDepthStencilLayouts
    ) {
        sType(sType);
        pNext(pNext);
        separateDepthStencilLayouts(separateDepthStencilLayouts);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR set(VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR malloc() {
        return wrap(VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR calloc() {
        return wrap(VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR create(long address) {
        return wrap(VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures.Buffer {

        private static final VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code separateDepthStencilLayouts} field. */
        @Override
        public VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.Buffer separateDepthStencilLayouts(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR.nseparateDepthStencilLayouts(address(), value ? 1 : 0); return this; }

    }

}