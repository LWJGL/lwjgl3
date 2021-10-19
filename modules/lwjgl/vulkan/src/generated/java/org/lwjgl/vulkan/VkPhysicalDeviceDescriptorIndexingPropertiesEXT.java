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
 * See {@link VkPhysicalDeviceDescriptorIndexingProperties}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDescriptorIndexingPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxUpdateAfterBindDescriptorsInAllPools;
 *     VkBool32 shaderUniformBufferArrayNonUniformIndexingNative;
 *     VkBool32 shaderSampledImageArrayNonUniformIndexingNative;
 *     VkBool32 shaderStorageBufferArrayNonUniformIndexingNative;
 *     VkBool32 shaderStorageImageArrayNonUniformIndexingNative;
 *     VkBool32 shaderInputAttachmentArrayNonUniformIndexingNative;
 *     VkBool32 robustBufferAccessUpdateAfterBind;
 *     VkBool32 quadDivergentImplicitLod;
 *     uint32_t maxPerStageDescriptorUpdateAfterBindSamplers;
 *     uint32_t maxPerStageDescriptorUpdateAfterBindUniformBuffers;
 *     uint32_t maxPerStageDescriptorUpdateAfterBindStorageBuffers;
 *     uint32_t maxPerStageDescriptorUpdateAfterBindSampledImages;
 *     uint32_t maxPerStageDescriptorUpdateAfterBindStorageImages;
 *     uint32_t maxPerStageDescriptorUpdateAfterBindInputAttachments;
 *     uint32_t maxPerStageUpdateAfterBindResources;
 *     uint32_t maxDescriptorSetUpdateAfterBindSamplers;
 *     uint32_t maxDescriptorSetUpdateAfterBindUniformBuffers;
 *     uint32_t maxDescriptorSetUpdateAfterBindUniformBuffersDynamic;
 *     uint32_t maxDescriptorSetUpdateAfterBindStorageBuffers;
 *     uint32_t maxDescriptorSetUpdateAfterBindStorageBuffersDynamic;
 *     uint32_t maxDescriptorSetUpdateAfterBindSampledImages;
 *     uint32_t maxDescriptorSetUpdateAfterBindStorageImages;
 *     uint32_t maxDescriptorSetUpdateAfterBindInputAttachments;
 * }</code></pre>
 */
public class VkPhysicalDeviceDescriptorIndexingPropertiesEXT extends VkPhysicalDeviceDescriptorIndexingProperties {

    /**
     * Creates a {@code VkPhysicalDeviceDescriptorIndexingPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT set(VkPhysicalDeviceDescriptorIndexingPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDescriptorIndexingPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT malloc() {
        return wrap(VkPhysicalDeviceDescriptorIndexingPropertiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorIndexingPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT calloc() {
        return wrap(VkPhysicalDeviceDescriptorIndexingPropertiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorIndexingPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceDescriptorIndexingPropertiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorIndexingPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT create(long address) {
        return wrap(VkPhysicalDeviceDescriptorIndexingPropertiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceDescriptorIndexingPropertiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorIndexingPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDescriptorIndexingPropertiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorIndexingPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDescriptorIndexingPropertiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDescriptorIndexingPropertiesEXT} structs. */
    public static class Buffer extends VkPhysicalDeviceDescriptorIndexingProperties.Buffer {

        private static final VkPhysicalDeviceDescriptorIndexingPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceDescriptorIndexingPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDescriptorIndexingPropertiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceDescriptorIndexingPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDescriptorIndexingPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDescriptorIndexingPropertiesEXT.npNext(address(), value); return this; }

    }

}