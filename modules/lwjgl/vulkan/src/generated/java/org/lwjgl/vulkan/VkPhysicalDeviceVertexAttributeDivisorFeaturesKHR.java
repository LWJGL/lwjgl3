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
 * struct VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 vertexAttributeInstanceRateDivisor;
 *     VkBool32 vertexAttributeInstanceRateZeroDivisor;
 * }}</pre>
 */
public class VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR extends VkPhysicalDeviceVertexAttributeDivisorFeatures {

    protected VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code vertexAttributeInstanceRateDivisor} field. */
    @Override
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR vertexAttributeInstanceRateDivisor(@NativeType("VkBool32") boolean value) { nvertexAttributeInstanceRateDivisor(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vertexAttributeInstanceRateZeroDivisor} field. */
    @Override
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR vertexAttributeInstanceRateZeroDivisor(@NativeType("VkBool32") boolean value) { nvertexAttributeInstanceRateZeroDivisor(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR set(
        int sType,
        long pNext,
        boolean vertexAttributeInstanceRateDivisor,
        boolean vertexAttributeInstanceRateZeroDivisor
    ) {
        sType(sType);
        pNext(pNext);
        vertexAttributeInstanceRateDivisor(vertexAttributeInstanceRateDivisor);
        vertexAttributeInstanceRateZeroDivisor(vertexAttributeInstanceRateZeroDivisor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR set(VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR malloc() {
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR calloc() {
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR create(long address) {
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer {

        private static final VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code vertexAttributeInstanceRateDivisor} field. */
        @Override
        public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.Buffer vertexAttributeInstanceRateDivisor(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.nvertexAttributeInstanceRateDivisor(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vertexAttributeInstanceRateZeroDivisor} field. */
        @Override
        public VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.Buffer vertexAttributeInstanceRateZeroDivisor(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVertexAttributeDivisorFeaturesKHR.nvertexAttributeInstanceRateZeroDivisor(address(), value ? 1 : 0); return this; }

    }

}