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
 * struct VkPhysicalDeviceLineRasterizationFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 rectangularLines;
 *     VkBool32 bresenhamLines;
 *     VkBool32 smoothLines;
 *     VkBool32 stippledRectangularLines;
 *     VkBool32 stippledBresenhamLines;
 *     VkBool32 stippledSmoothLines;
 * }}</pre>
 */
public class VkPhysicalDeviceLineRasterizationFeaturesKHR extends VkPhysicalDeviceLineRasterizationFeatures {

    protected VkPhysicalDeviceLineRasterizationFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceLineRasterizationFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceLineRasterizationFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceLineRasterizationFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceLineRasterizationFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceLineRasterizationFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceLineRasterizationFeaturesKHR sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceLineRasterizationFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code rectangularLines} field. */
    @Override
    public VkPhysicalDeviceLineRasterizationFeaturesKHR rectangularLines(@NativeType("VkBool32") boolean value) { nrectangularLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code bresenhamLines} field. */
    @Override
    public VkPhysicalDeviceLineRasterizationFeaturesKHR bresenhamLines(@NativeType("VkBool32") boolean value) { nbresenhamLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code smoothLines} field. */
    @Override
    public VkPhysicalDeviceLineRasterizationFeaturesKHR smoothLines(@NativeType("VkBool32") boolean value) { nsmoothLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code stippledRectangularLines} field. */
    @Override
    public VkPhysicalDeviceLineRasterizationFeaturesKHR stippledRectangularLines(@NativeType("VkBool32") boolean value) { nstippledRectangularLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code stippledBresenhamLines} field. */
    @Override
    public VkPhysicalDeviceLineRasterizationFeaturesKHR stippledBresenhamLines(@NativeType("VkBool32") boolean value) { nstippledBresenhamLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code stippledSmoothLines} field. */
    @Override
    public VkPhysicalDeviceLineRasterizationFeaturesKHR stippledSmoothLines(@NativeType("VkBool32") boolean value) { nstippledSmoothLines(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceLineRasterizationFeaturesKHR set(
        int sType,
        long pNext,
        boolean rectangularLines,
        boolean bresenhamLines,
        boolean smoothLines,
        boolean stippledRectangularLines,
        boolean stippledBresenhamLines,
        boolean stippledSmoothLines
    ) {
        sType(sType);
        pNext(pNext);
        rectangularLines(rectangularLines);
        bresenhamLines(bresenhamLines);
        smoothLines(smoothLines);
        stippledRectangularLines(stippledRectangularLines);
        stippledBresenhamLines(stippledBresenhamLines);
        stippledSmoothLines(stippledSmoothLines);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceLineRasterizationFeaturesKHR set(VkPhysicalDeviceLineRasterizationFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceLineRasterizationFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR malloc() {
        return new VkPhysicalDeviceLineRasterizationFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceLineRasterizationFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR calloc() {
        return new VkPhysicalDeviceLineRasterizationFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceLineRasterizationFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceLineRasterizationFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceLineRasterizationFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR create(long address) {
        return new VkPhysicalDeviceLineRasterizationFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceLineRasterizationFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceLineRasterizationFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceLineRasterizationFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceLineRasterizationFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceLineRasterizationFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceLineRasterizationFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceLineRasterizationFeaturesKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceLineRasterizationFeatures.Buffer {

        private static final VkPhysicalDeviceLineRasterizationFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceLineRasterizationFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceLineRasterizationFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceLineRasterizationFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceLineRasterizationFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceLineRasterizationFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code rectangularLines} field. */
        @Override
        public VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer rectangularLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeaturesKHR.nrectangularLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code bresenhamLines} field. */
        @Override
        public VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer bresenhamLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeaturesKHR.nbresenhamLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code smoothLines} field. */
        @Override
        public VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer smoothLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeaturesKHR.nsmoothLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code stippledRectangularLines} field. */
        @Override
        public VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer stippledRectangularLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeaturesKHR.nstippledRectangularLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code stippledBresenhamLines} field. */
        @Override
        public VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer stippledBresenhamLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeaturesKHR.nstippledBresenhamLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code stippledSmoothLines} field. */
        @Override
        public VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer stippledSmoothLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeaturesKHR.nstippledSmoothLines(address(), value ? 1 : 0); return this; }

    }

}