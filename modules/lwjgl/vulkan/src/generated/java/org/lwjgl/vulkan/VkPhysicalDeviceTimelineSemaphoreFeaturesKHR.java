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
 * See {@link VkPhysicalDeviceTimelineSemaphoreFeatures}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceTimelineSemaphoreFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 timelineSemaphore;
 * }</code></pre>
 */
public class VkPhysicalDeviceTimelineSemaphoreFeaturesKHR extends VkPhysicalDeviceTimelineSemaphoreFeatures {

    /**
     * Creates a {@code VkPhysicalDeviceTimelineSemaphoreFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code timelineSemaphore} field. */
    @Override
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR timelineSemaphore(@NativeType("VkBool32") boolean value) { ntimelineSemaphore(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR set(
        int sType,
        long pNext,
        boolean timelineSemaphore
    ) {
        sType(sType);
        pNext(pNext);
        timelineSemaphore(timelineSemaphore);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR set(VkPhysicalDeviceTimelineSemaphoreFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceTimelineSemaphoreFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR malloc() {
        return wrap(VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceTimelineSemaphoreFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR calloc() {
        return wrap(VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceTimelineSemaphoreFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceTimelineSemaphoreFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR create(long address) {
        return wrap(VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTimelineSemaphoreFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTimelineSemaphoreFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceTimelineSemaphoreFeaturesKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceTimelineSemaphoreFeatures.Buffer {

        private static final VkPhysicalDeviceTimelineSemaphoreFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceTimelineSemaphoreFeaturesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceTimelineSemaphoreFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code timelineSemaphore} field. */
        @Override
        public VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.Buffer timelineSemaphore(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTimelineSemaphoreFeaturesKHR.ntimelineSemaphore(address(), value ? 1 : 0); return this; }

    }

}