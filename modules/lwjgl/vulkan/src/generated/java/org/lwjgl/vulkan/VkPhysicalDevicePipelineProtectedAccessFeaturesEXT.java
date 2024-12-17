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
 * struct VkPhysicalDevicePipelineProtectedAccessFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 pipelineProtectedAccess;
 * }}</pre>
 */
public class VkPhysicalDevicePipelineProtectedAccessFeaturesEXT extends VkPhysicalDevicePipelineProtectedAccessFeatures {

    protected VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePipelineProtectedAccessFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePipelineProtectedAccessFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineProtectedAccess} field. */
    @Override
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT pipelineProtectedAccess(@NativeType("VkBool32") boolean value) { npipelineProtectedAccess(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT set(
        int sType,
        long pNext,
        boolean pipelineProtectedAccess
    ) {
        sType(sType);
        pNext(pNext);
        pipelineProtectedAccess(pipelineProtectedAccess);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT set(VkPhysicalDevicePipelineProtectedAccessFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePipelineProtectedAccessFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT malloc() {
        return new VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineProtectedAccessFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT calloc() {
        return new VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineProtectedAccessFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineProtectedAccessFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT create(long address) {
        return new VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePipelineProtectedAccessFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineProtectedAccessFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineProtectedAccessFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineProtectedAccessFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePipelineProtectedAccessFeaturesEXT} structs. */
    public static class Buffer extends VkPhysicalDevicePipelineProtectedAccessFeatures.Buffer {

        private static final VkPhysicalDevicePipelineProtectedAccessFeaturesEXT ELEMENT_FACTORY = VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePipelineProtectedAccessFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePipelineProtectedAccessFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineProtectedAccess} field. */
        @Override
        public VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.Buffer pipelineProtectedAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePipelineProtectedAccessFeaturesEXT.npipelineProtectedAccess(address(), value ? 1 : 0); return this; }

    }

}