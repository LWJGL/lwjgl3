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
 * See {@link VkPhysicalDevicePipelineCreationCacheControlFeatures}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 pipelineCreationCacheControl;
 * }</code></pre>
 */
public class VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT extends VkPhysicalDevicePipelineCreationCacheControlFeatures {

    /**
     * Creates a {@code VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineCreationCacheControl} field. */
    @Override
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT pipelineCreationCacheControl(@NativeType("VkBool32") boolean value) { npipelineCreationCacheControl(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT set(
        int sType,
        long pNext,
        boolean pipelineCreationCacheControl
    ) {
        sType(sType);
        pNext(pNext);
        pipelineCreationCacheControl(pipelineCreationCacheControl);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT set(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT malloc() {
        return wrap(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT calloc() {
        return wrap(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT create(long address) {
        return wrap(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} structs. */
    public static class Buffer extends VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer {

        private static final VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT ELEMENT_FACTORY = VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineCreationCacheControl} field. */
        @Override
        public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer pipelineCreationCacheControl(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.npipelineCreationCacheControl(address(), value ? 1 : 0); return this; }

    }

}