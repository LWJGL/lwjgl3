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
 * <pre>{@code
 * struct VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 dynamicRenderingLocalRead;
 * }}</pre>
 */
public class VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR extends VkPhysicalDeviceDynamicRenderingLocalReadFeatures {

    protected VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code dynamicRenderingLocalRead} field. */
    @Override
    public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR dynamicRenderingLocalRead(@NativeType("VkBool32") boolean value) { ndynamicRenderingLocalRead(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR set(
        int sType,
        long pNext,
        boolean dynamicRenderingLocalRead
    ) {
        sType(sType);
        pNext(pNext);
        dynamicRenderingLocalRead(dynamicRenderingLocalRead);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR set(VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR malloc() {
        return new VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR calloc() {
        return new VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR create(long address) {
        return new VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceDynamicRenderingLocalReadFeatures.Buffer {

        private static final VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code dynamicRenderingLocalRead} field. */
        @Override
        public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR.Buffer dynamicRenderingLocalRead(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR.ndynamicRenderingLocalRead(address(), value ? 1 : 0); return this; }

    }

}