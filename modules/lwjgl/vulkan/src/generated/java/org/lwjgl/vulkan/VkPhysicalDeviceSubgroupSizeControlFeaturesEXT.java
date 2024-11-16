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
 * See {@link VkPhysicalDeviceSubgroupSizeControlFeatures}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceSubgroupSizeControlFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 subgroupSizeControl;
 *     VkBool32 computeFullSubgroups;
 * }</code></pre>
 */
public class VkPhysicalDeviceSubgroupSizeControlFeaturesEXT extends VkPhysicalDeviceSubgroupSizeControlFeatures {

    protected VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceSubgroupSizeControlFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code subgroupSizeControl} field. */
    @Override
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT subgroupSizeControl(@NativeType("VkBool32") boolean value) { nsubgroupSizeControl(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code computeFullSubgroups} field. */
    @Override
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT computeFullSubgroups(@NativeType("VkBool32") boolean value) { ncomputeFullSubgroups(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT set(
        int sType,
        long pNext,
        boolean subgroupSizeControl,
        boolean computeFullSubgroups
    ) {
        sType(sType);
        pNext(pNext);
        subgroupSizeControl(subgroupSizeControl);
        computeFullSubgroups(computeFullSubgroups);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT set(VkPhysicalDeviceSubgroupSizeControlFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT malloc() {
        return new VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT calloc() {
        return new VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT create(long address) {
        return new VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceSubgroupSizeControlFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} structs. */
    public static class Buffer extends VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer {

        private static final VkPhysicalDeviceSubgroupSizeControlFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceSubgroupSizeControlFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code subgroupSizeControl} field. */
        @Override
        public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer subgroupSizeControl(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.nsubgroupSizeControl(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code computeFullSubgroups} field. */
        @Override
        public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer computeFullSubgroups(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.ncomputeFullSubgroups(address(), value ? 1 : 0); return this; }

    }

}