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
 * struct VkPhysicalDeviceLineRasterizationFeaturesEXT {
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
public class VkPhysicalDeviceLineRasterizationFeaturesEXT extends VkPhysicalDeviceLineRasterizationFeatures {

    protected VkPhysicalDeviceLineRasterizationFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceLineRasterizationFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceLineRasterizationFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceLineRasterizationFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceLineRasterizationFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceLineRasterizationFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceLineRasterizationFeaturesEXT sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceLineRasterizationFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code rectangularLines} field. */
    @Override
    public VkPhysicalDeviceLineRasterizationFeaturesEXT rectangularLines(@NativeType("VkBool32") boolean value) { nrectangularLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code bresenhamLines} field. */
    @Override
    public VkPhysicalDeviceLineRasterizationFeaturesEXT bresenhamLines(@NativeType("VkBool32") boolean value) { nbresenhamLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code smoothLines} field. */
    @Override
    public VkPhysicalDeviceLineRasterizationFeaturesEXT smoothLines(@NativeType("VkBool32") boolean value) { nsmoothLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code stippledRectangularLines} field. */
    @Override
    public VkPhysicalDeviceLineRasterizationFeaturesEXT stippledRectangularLines(@NativeType("VkBool32") boolean value) { nstippledRectangularLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code stippledBresenhamLines} field. */
    @Override
    public VkPhysicalDeviceLineRasterizationFeaturesEXT stippledBresenhamLines(@NativeType("VkBool32") boolean value) { nstippledBresenhamLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code stippledSmoothLines} field. */
    @Override
    public VkPhysicalDeviceLineRasterizationFeaturesEXT stippledSmoothLines(@NativeType("VkBool32") boolean value) { nstippledSmoothLines(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceLineRasterizationFeaturesEXT set(
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
    public VkPhysicalDeviceLineRasterizationFeaturesEXT set(VkPhysicalDeviceLineRasterizationFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceLineRasterizationFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT malloc() {
        return new VkPhysicalDeviceLineRasterizationFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceLineRasterizationFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT calloc() {
        return new VkPhysicalDeviceLineRasterizationFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceLineRasterizationFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceLineRasterizationFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceLineRasterizationFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT create(long address) {
        return new VkPhysicalDeviceLineRasterizationFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceLineRasterizationFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceLineRasterizationFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceLineRasterizationFeaturesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceLineRasterizationFeaturesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceLineRasterizationFeaturesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceLineRasterizationFeaturesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceLineRasterizationFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceLineRasterizationFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceLineRasterizationFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceLineRasterizationFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceLineRasterizationFeaturesEXT} structs. */
    public static class Buffer extends VkPhysicalDeviceLineRasterizationFeatures.Buffer {

        private static final VkPhysicalDeviceLineRasterizationFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceLineRasterizationFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceLineRasterizationFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceLineRasterizationFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceLineRasterizationFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceLineRasterizationFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code rectangularLines} field. */
        @Override
        public VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer rectangularLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeaturesEXT.nrectangularLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code bresenhamLines} field. */
        @Override
        public VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer bresenhamLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeaturesEXT.nbresenhamLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code smoothLines} field. */
        @Override
        public VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer smoothLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeaturesEXT.nsmoothLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code stippledRectangularLines} field. */
        @Override
        public VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer stippledRectangularLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeaturesEXT.nstippledRectangularLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code stippledBresenhamLines} field. */
        @Override
        public VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer stippledBresenhamLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeaturesEXT.nstippledBresenhamLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code stippledSmoothLines} field. */
        @Override
        public VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer stippledSmoothLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeaturesEXT.nstippledSmoothLines(address(), value ? 1 : 0); return this; }

    }

}