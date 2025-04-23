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
 * struct VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 fragmentDensityMapOffset;
 * }}</pre>
 */
public class VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM extends VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT {

    protected VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTFragmentDensityMapOffset#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_EXT} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM sType$Default() { return sType(EXTFragmentDensityMapOffset.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code fragmentDensityMapOffset} field. */
    @Override
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM fragmentDensityMapOffset(@NativeType("VkBool32") boolean value) { nfragmentDensityMapOffset(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM set(
        int sType,
        long pNext,
        boolean fragmentDensityMapOffset
    ) {
        sType(sType);
        pNext(pNext);
        fragmentDensityMapOffset(fragmentDensityMapOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM set(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM malloc() {
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM calloc() {
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM create(long address) {
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} structs. */
    public static class Buffer extends VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT.Buffer {

        private static final VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link EXTFragmentDensityMapOffset#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_EXT} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer sType$Default() { return sType(EXTFragmentDensityMapOffset.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code fragmentDensityMapOffset} field. */
        @Override
        public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer fragmentDensityMapOffset(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.nfragmentDensityMapOffset(address(), value ? 1 : 0); return this; }

    }

}