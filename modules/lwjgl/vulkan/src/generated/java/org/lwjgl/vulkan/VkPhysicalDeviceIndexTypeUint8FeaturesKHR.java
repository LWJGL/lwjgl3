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
 * struct VkPhysicalDeviceIndexTypeUint8FeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 indexTypeUint8;
 * }}</pre>
 */
public class VkPhysicalDeviceIndexTypeUint8FeaturesKHR extends VkPhysicalDeviceIndexTypeUint8Features {

    protected VkPhysicalDeviceIndexTypeUint8FeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceIndexTypeUint8FeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceIndexTypeUint8FeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceIndexTypeUint8FeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code indexTypeUint8} field. */
    @Override
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR indexTypeUint8(@NativeType("VkBool32") boolean value) { nindexTypeUint8(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR set(
        int sType,
        long pNext,
        boolean indexTypeUint8
    ) {
        sType(sType);
        pNext(pNext);
        indexTypeUint8(indexTypeUint8);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceIndexTypeUint8FeaturesKHR set(VkPhysicalDeviceIndexTypeUint8FeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceIndexTypeUint8FeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR malloc() {
        return new VkPhysicalDeviceIndexTypeUint8FeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceIndexTypeUint8FeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR calloc() {
        return new VkPhysicalDeviceIndexTypeUint8FeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceIndexTypeUint8FeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceIndexTypeUint8FeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceIndexTypeUint8FeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR create(long address) {
        return new VkPhysicalDeviceIndexTypeUint8FeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceIndexTypeUint8FeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceIndexTypeUint8FeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIndexTypeUint8FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIndexTypeUint8FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIndexTypeUint8FeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceIndexTypeUint8FeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceIndexTypeUint8FeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceIndexTypeUint8FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceIndexTypeUint8FeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceIndexTypeUint8FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIndexTypeUint8FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIndexTypeUint8FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceIndexTypeUint8FeaturesKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceIndexTypeUint8Features.Buffer {

        private static final VkPhysicalDeviceIndexTypeUint8FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceIndexTypeUint8FeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceIndexTypeUint8FeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceIndexTypeUint8FeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceIndexTypeUint8FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceIndexTypeUint8FeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceIndexTypeUint8FeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceIndexTypeUint8FeaturesKHR.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceIndexTypeUint8FeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceIndexTypeUint8FeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code indexTypeUint8} field. */
        @Override
        public VkPhysicalDeviceIndexTypeUint8FeaturesKHR.Buffer indexTypeUint8(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceIndexTypeUint8FeaturesKHR.nindexTypeUint8(address(), value ? 1 : 0); return this; }

    }

}