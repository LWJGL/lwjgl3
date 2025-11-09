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
 * struct VkPhysicalDeviceMemoryDecompressionFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 memoryDecompression;
 * }}</pre>
 */
public class VkPhysicalDeviceMemoryDecompressionFeaturesNV extends VkPhysicalDeviceMemoryDecompressionFeaturesEXT {

    protected VkPhysicalDeviceMemoryDecompressionFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMemoryDecompressionFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMemoryDecompressionFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMemoryDecompression#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_EXT} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV sType$Default() { return sType(EXTMemoryDecompression.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code memoryDecompression} field. */
    @Override
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV memoryDecompression(@NativeType("VkBool32") boolean value) { nmemoryDecompression(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV set(
        int sType,
        long pNext,
        boolean memoryDecompression
    ) {
        sType(sType);
        pNext(pNext);
        memoryDecompression(memoryDecompression);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMemoryDecompressionFeaturesNV set(VkPhysicalDeviceMemoryDecompressionFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMemoryDecompressionFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV malloc() {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryDecompressionFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV calloc() {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryDecompressionFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryDecompressionFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV create(long address) {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceMemoryDecompressionFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMemoryDecompressionFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMemoryDecompressionFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMemoryDecompressionFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV} structs. */
    public static class Buffer extends VkPhysicalDeviceMemoryDecompressionFeaturesEXT.Buffer {

        private static final VkPhysicalDeviceMemoryDecompressionFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceMemoryDecompressionFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMemoryDecompressionFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMemoryDecompressionFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMemoryDecompressionFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link EXTMemoryDecompression#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_EXT} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer sType$Default() { return sType(EXTMemoryDecompression.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMemoryDecompressionFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code memoryDecompression} field. */
        @Override
        public VkPhysicalDeviceMemoryDecompressionFeaturesNV.Buffer memoryDecompression(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMemoryDecompressionFeaturesNV.nmemoryDecompression(address(), value ? 1 : 0); return this; }

    }

}