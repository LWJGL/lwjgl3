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
 * See {@link VkPhysicalDeviceDescriptorIndexingFeatures}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDescriptorIndexingFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderInputAttachmentArrayDynamicIndexing;
 *     VkBool32 shaderUniformTexelBufferArrayDynamicIndexing;
 *     VkBool32 shaderStorageTexelBufferArrayDynamicIndexing;
 *     VkBool32 shaderUniformBufferArrayNonUniformIndexing;
 *     VkBool32 shaderSampledImageArrayNonUniformIndexing;
 *     VkBool32 shaderStorageBufferArrayNonUniformIndexing;
 *     VkBool32 shaderStorageImageArrayNonUniformIndexing;
 *     VkBool32 shaderInputAttachmentArrayNonUniformIndexing;
 *     VkBool32 shaderUniformTexelBufferArrayNonUniformIndexing;
 *     VkBool32 shaderStorageTexelBufferArrayNonUniformIndexing;
 *     VkBool32 descriptorBindingUniformBufferUpdateAfterBind;
 *     VkBool32 descriptorBindingSampledImageUpdateAfterBind;
 *     VkBool32 descriptorBindingStorageImageUpdateAfterBind;
 *     VkBool32 descriptorBindingStorageBufferUpdateAfterBind;
 *     VkBool32 descriptorBindingUniformTexelBufferUpdateAfterBind;
 *     VkBool32 descriptorBindingStorageTexelBufferUpdateAfterBind;
 *     VkBool32 descriptorBindingUpdateUnusedWhilePending;
 *     VkBool32 descriptorBindingPartiallyBound;
 *     VkBool32 descriptorBindingVariableDescriptorCount;
 *     VkBool32 runtimeDescriptorArray;
 * }</code></pre>
 */
public class VkPhysicalDeviceDescriptorIndexingFeaturesEXT extends VkPhysicalDeviceDescriptorIndexingFeatures {

    /**
     * Creates a {@code VkPhysicalDeviceDescriptorIndexingFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderInputAttachmentArrayDynamicIndexing} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderInputAttachmentArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderInputAttachmentArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderUniformTexelBufferArrayDynamicIndexing} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderUniformTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderUniformTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageTexelBufferArrayDynamicIndexing} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderStorageTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderUniformBufferArrayNonUniformIndexing} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderUniformBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderUniformBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderSampledImageArrayNonUniformIndexing} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderSampledImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderSampledImageArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageBufferArrayNonUniformIndexing} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderStorageBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageImageArrayNonUniformIndexing} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderStorageImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageImageArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderInputAttachmentArrayNonUniformIndexing} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderInputAttachmentArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderInputAttachmentArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderUniformTexelBufferArrayNonUniformIndexing} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderUniformTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderUniformTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageTexelBufferArrayNonUniformIndexing} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderStorageTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingUniformBufferUpdateAfterBind} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingUniformBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingUniformBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingSampledImageUpdateAfterBind} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingSampledImageUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingSampledImageUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingStorageImageUpdateAfterBind} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingStorageImageUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingStorageImageUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingStorageBufferUpdateAfterBind} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingStorageBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingStorageBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingUniformTexelBufferUpdateAfterBind} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingUniformTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingUniformTexelBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingStorageTexelBufferUpdateAfterBind} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingStorageTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingStorageTexelBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingUpdateUnusedWhilePending} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingUpdateUnusedWhilePending(@NativeType("VkBool32") boolean value) { ndescriptorBindingUpdateUnusedWhilePending(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingPartiallyBound} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingPartiallyBound(@NativeType("VkBool32") boolean value) { ndescriptorBindingPartiallyBound(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingVariableDescriptorCount} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingVariableDescriptorCount(@NativeType("VkBool32") boolean value) { ndescriptorBindingVariableDescriptorCount(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code runtimeDescriptorArray} field. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT runtimeDescriptorArray(@NativeType("VkBool32") boolean value) { nruntimeDescriptorArray(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT set(
        int sType,
        long pNext,
        boolean shaderInputAttachmentArrayDynamicIndexing,
        boolean shaderUniformTexelBufferArrayDynamicIndexing,
        boolean shaderStorageTexelBufferArrayDynamicIndexing,
        boolean shaderUniformBufferArrayNonUniformIndexing,
        boolean shaderSampledImageArrayNonUniformIndexing,
        boolean shaderStorageBufferArrayNonUniformIndexing,
        boolean shaderStorageImageArrayNonUniformIndexing,
        boolean shaderInputAttachmentArrayNonUniformIndexing,
        boolean shaderUniformTexelBufferArrayNonUniformIndexing,
        boolean shaderStorageTexelBufferArrayNonUniformIndexing,
        boolean descriptorBindingUniformBufferUpdateAfterBind,
        boolean descriptorBindingSampledImageUpdateAfterBind,
        boolean descriptorBindingStorageImageUpdateAfterBind,
        boolean descriptorBindingStorageBufferUpdateAfterBind,
        boolean descriptorBindingUniformTexelBufferUpdateAfterBind,
        boolean descriptorBindingStorageTexelBufferUpdateAfterBind,
        boolean descriptorBindingUpdateUnusedWhilePending,
        boolean descriptorBindingPartiallyBound,
        boolean descriptorBindingVariableDescriptorCount,
        boolean runtimeDescriptorArray
    ) {
        sType(sType);
        pNext(pNext);
        shaderInputAttachmentArrayDynamicIndexing(shaderInputAttachmentArrayDynamicIndexing);
        shaderUniformTexelBufferArrayDynamicIndexing(shaderUniformTexelBufferArrayDynamicIndexing);
        shaderStorageTexelBufferArrayDynamicIndexing(shaderStorageTexelBufferArrayDynamicIndexing);
        shaderUniformBufferArrayNonUniformIndexing(shaderUniformBufferArrayNonUniformIndexing);
        shaderSampledImageArrayNonUniformIndexing(shaderSampledImageArrayNonUniformIndexing);
        shaderStorageBufferArrayNonUniformIndexing(shaderStorageBufferArrayNonUniformIndexing);
        shaderStorageImageArrayNonUniformIndexing(shaderStorageImageArrayNonUniformIndexing);
        shaderInputAttachmentArrayNonUniformIndexing(shaderInputAttachmentArrayNonUniformIndexing);
        shaderUniformTexelBufferArrayNonUniformIndexing(shaderUniformTexelBufferArrayNonUniformIndexing);
        shaderStorageTexelBufferArrayNonUniformIndexing(shaderStorageTexelBufferArrayNonUniformIndexing);
        descriptorBindingUniformBufferUpdateAfterBind(descriptorBindingUniformBufferUpdateAfterBind);
        descriptorBindingSampledImageUpdateAfterBind(descriptorBindingSampledImageUpdateAfterBind);
        descriptorBindingStorageImageUpdateAfterBind(descriptorBindingStorageImageUpdateAfterBind);
        descriptorBindingStorageBufferUpdateAfterBind(descriptorBindingStorageBufferUpdateAfterBind);
        descriptorBindingUniformTexelBufferUpdateAfterBind(descriptorBindingUniformTexelBufferUpdateAfterBind);
        descriptorBindingStorageTexelBufferUpdateAfterBind(descriptorBindingStorageTexelBufferUpdateAfterBind);
        descriptorBindingUpdateUnusedWhilePending(descriptorBindingUpdateUnusedWhilePending);
        descriptorBindingPartiallyBound(descriptorBindingPartiallyBound);
        descriptorBindingVariableDescriptorCount(descriptorBindingVariableDescriptorCount);
        runtimeDescriptorArray(runtimeDescriptorArray);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT set(VkPhysicalDeviceDescriptorIndexingFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDescriptorIndexingFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceDescriptorIndexingFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorIndexingFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceDescriptorIndexingFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorIndexingFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceDescriptorIndexingFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorIndexingFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceDescriptorIndexingFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceDescriptorIndexingFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorIndexingFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDescriptorIndexingFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorIndexingFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDescriptorIndexingFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT} structs. */
    public static class Buffer extends VkPhysicalDeviceDescriptorIndexingFeatures.Buffer {

        private static final VkPhysicalDeviceDescriptorIndexingFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceDescriptorIndexingFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceDescriptorIndexingFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderInputAttachmentArrayDynamicIndexing} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderInputAttachmentArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderInputAttachmentArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderUniformTexelBufferArrayDynamicIndexing} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderUniformTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderUniformTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageTexelBufferArrayDynamicIndexing} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderStorageTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderStorageTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderUniformBufferArrayNonUniformIndexing} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderUniformBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderUniformBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderSampledImageArrayNonUniformIndexing} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderSampledImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderSampledImageArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageBufferArrayNonUniformIndexing} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderStorageBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderStorageBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageImageArrayNonUniformIndexing} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderStorageImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderStorageImageArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderInputAttachmentArrayNonUniformIndexing} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderInputAttachmentArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderInputAttachmentArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderUniformTexelBufferArrayNonUniformIndexing} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderUniformTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderUniformTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageTexelBufferArrayNonUniformIndexing} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderStorageTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderStorageTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingUniformBufferUpdateAfterBind} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingUniformBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingUniformBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingSampledImageUpdateAfterBind} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingSampledImageUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingSampledImageUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingStorageImageUpdateAfterBind} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingStorageImageUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingStorageImageUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingStorageBufferUpdateAfterBind} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingStorageBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingStorageBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingUniformTexelBufferUpdateAfterBind} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingUniformTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingUniformTexelBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingStorageTexelBufferUpdateAfterBind} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingStorageTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingStorageTexelBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingUpdateUnusedWhilePending} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingUpdateUnusedWhilePending(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingUpdateUnusedWhilePending(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingPartiallyBound} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingPartiallyBound(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingPartiallyBound(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingVariableDescriptorCount} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingVariableDescriptorCount(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingVariableDescriptorCount(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code runtimeDescriptorArray} field. */
        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer runtimeDescriptorArray(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nruntimeDescriptorArray(address(), value ? 1 : 0); return this; }

    }

}