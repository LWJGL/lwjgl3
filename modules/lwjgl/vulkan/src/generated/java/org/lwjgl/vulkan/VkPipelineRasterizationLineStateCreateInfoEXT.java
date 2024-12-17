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
 * struct VkPipelineRasterizationLineStateCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkLineRasterizationMode lineRasterizationMode;
 *     VkBool32 stippledLineEnable;
 *     uint32_t lineStippleFactor;
 *     uint16_t lineStipplePattern;
 * }}</pre>
 */
public class VkPipelineRasterizationLineStateCreateInfoEXT extends VkPipelineRasterizationLineStateCreateInfo {

    protected VkPipelineRasterizationLineStateCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineRasterizationLineStateCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineRasterizationLineStateCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkPipelineRasterizationLineStateCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineRasterizationLineStateCreateInfoEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPipelineRasterizationLineStateCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO} value to the {@code sType} field. */
    @Override
    public VkPipelineRasterizationLineStateCreateInfoEXT sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPipelineRasterizationLineStateCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code lineRasterizationMode} field. */
    @Override
    public VkPipelineRasterizationLineStateCreateInfoEXT lineRasterizationMode(@NativeType("VkLineRasterizationMode") int value) { nlineRasterizationMode(address(), value); return this; }
    /** Sets the specified value to the {@code stippledLineEnable} field. */
    @Override
    public VkPipelineRasterizationLineStateCreateInfoEXT stippledLineEnable(@NativeType("VkBool32") boolean value) { nstippledLineEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code lineStippleFactor} field. */
    @Override
    public VkPipelineRasterizationLineStateCreateInfoEXT lineStippleFactor(@NativeType("uint32_t") int value) { nlineStippleFactor(address(), value); return this; }
    /** Sets the specified value to the {@code lineStipplePattern} field. */
    @Override
    public VkPipelineRasterizationLineStateCreateInfoEXT lineStipplePattern(@NativeType("uint16_t") short value) { nlineStipplePattern(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPipelineRasterizationLineStateCreateInfoEXT set(
        int sType,
        long pNext,
        int lineRasterizationMode,
        boolean stippledLineEnable,
        int lineStippleFactor,
        short lineStipplePattern
    ) {
        sType(sType);
        pNext(pNext);
        lineRasterizationMode(lineRasterizationMode);
        stippledLineEnable(stippledLineEnable);
        lineStippleFactor(lineStippleFactor);
        lineStipplePattern(lineStipplePattern);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineRasterizationLineStateCreateInfoEXT set(VkPipelineRasterizationLineStateCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineRasterizationLineStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineRasterizationLineStateCreateInfoEXT malloc() {
        return new VkPipelineRasterizationLineStateCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineRasterizationLineStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineRasterizationLineStateCreateInfoEXT calloc() {
        return new VkPipelineRasterizationLineStateCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineRasterizationLineStateCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineRasterizationLineStateCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineRasterizationLineStateCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineRasterizationLineStateCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineRasterizationLineStateCreateInfoEXT create(long address) {
        return new VkPipelineRasterizationLineStateCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineRasterizationLineStateCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkPipelineRasterizationLineStateCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineRasterizationLineStateCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineRasterizationLineStateCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationLineStateCreateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationLineStateCreateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationLineStateCreateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationLineStateCreateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationLineStateCreateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationLineStateCreateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationLineStateCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationLineStateCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineRasterizationLineStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRasterizationLineStateCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineRasterizationLineStateCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineRasterizationLineStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRasterizationLineStateCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineRasterizationLineStateCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPipelineRasterizationLineStateCreateInfoEXT} structs. */
    public static class Buffer extends VkPipelineRasterizationLineStateCreateInfo.Buffer {

        private static final VkPipelineRasterizationLineStateCreateInfoEXT ELEMENT_FACTORY = VkPipelineRasterizationLineStateCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineRasterizationLineStateCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineRasterizationLineStateCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineRasterizationLineStateCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPipelineRasterizationLineStateCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineRasterizationLineStateCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO} value to the {@code sType} field. */
        @Override
        public VkPipelineRasterizationLineStateCreateInfoEXT.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPipelineRasterizationLineStateCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPipelineRasterizationLineStateCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code lineRasterizationMode} field. */
        @Override
        public VkPipelineRasterizationLineStateCreateInfoEXT.Buffer lineRasterizationMode(@NativeType("VkLineRasterizationMode") int value) { VkPipelineRasterizationLineStateCreateInfoEXT.nlineRasterizationMode(address(), value); return this; }
        /** Sets the specified value to the {@code stippledLineEnable} field. */
        @Override
        public VkPipelineRasterizationLineStateCreateInfoEXT.Buffer stippledLineEnable(@NativeType("VkBool32") boolean value) { VkPipelineRasterizationLineStateCreateInfoEXT.nstippledLineEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code lineStippleFactor} field. */
        @Override
        public VkPipelineRasterizationLineStateCreateInfoEXT.Buffer lineStippleFactor(@NativeType("uint32_t") int value) { VkPipelineRasterizationLineStateCreateInfoEXT.nlineStippleFactor(address(), value); return this; }
        /** Sets the specified value to the {@code lineStipplePattern} field. */
        @Override
        public VkPipelineRasterizationLineStateCreateInfoEXT.Buffer lineStipplePattern(@NativeType("uint16_t") short value) { VkPipelineRasterizationLineStateCreateInfoEXT.nlineStipplePattern(address(), value); return this; }

    }

}