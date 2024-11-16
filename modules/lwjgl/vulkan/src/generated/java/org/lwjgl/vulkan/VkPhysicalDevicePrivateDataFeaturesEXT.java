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
 * See {@link VkPhysicalDevicePrivateDataFeatures}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDevicePrivateDataFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 privateData;
 * }</code></pre>
 */
public class VkPhysicalDevicePrivateDataFeaturesEXT extends VkPhysicalDevicePrivateDataFeatures {

    protected VkPhysicalDevicePrivateDataFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePrivateDataFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePrivateDataFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePrivateDataFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePrivateDataFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDevicePrivateDataFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDevicePrivateDataFeaturesEXT sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDevicePrivateDataFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code privateData} field. */
    @Override
    public VkPhysicalDevicePrivateDataFeaturesEXT privateData(@NativeType("VkBool32") boolean value) { nprivateData(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDevicePrivateDataFeaturesEXT set(
        int sType,
        long pNext,
        boolean privateData
    ) {
        sType(sType);
        pNext(pNext);
        privateData(privateData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePrivateDataFeaturesEXT set(VkPhysicalDevicePrivateDataFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePrivateDataFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePrivateDataFeaturesEXT malloc() {
        return new VkPhysicalDevicePrivateDataFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePrivateDataFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePrivateDataFeaturesEXT calloc() {
        return new VkPhysicalDevicePrivateDataFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePrivateDataFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePrivateDataFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePrivateDataFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePrivateDataFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDevicePrivateDataFeaturesEXT create(long address) {
        return new VkPhysicalDevicePrivateDataFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePrivateDataFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePrivateDataFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrivateDataFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrivateDataFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrivateDataFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrivateDataFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrivateDataFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrivateDataFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePrivateDataFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrivateDataFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePrivateDataFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePrivateDataFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePrivateDataFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDevicePrivateDataFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePrivateDataFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePrivateDataFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDevicePrivateDataFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrivateDataFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrivateDataFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrivateDataFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrivateDataFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePrivateDataFeaturesEXT} structs. */
    public static class Buffer extends VkPhysicalDevicePrivateDataFeatures.Buffer {

        private static final VkPhysicalDevicePrivateDataFeaturesEXT ELEMENT_FACTORY = VkPhysicalDevicePrivateDataFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePrivateDataFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePrivateDataFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePrivateDataFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDevicePrivateDataFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePrivateDataFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDevicePrivateDataFeaturesEXT.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDevicePrivateDataFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePrivateDataFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code privateData} field. */
        @Override
        public VkPhysicalDevicePrivateDataFeaturesEXT.Buffer privateData(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePrivateDataFeaturesEXT.nprivateData(address(), value ? 1 : 0); return this; }

    }

}