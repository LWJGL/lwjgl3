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
 * struct VkPipelineRasterizationLineStateCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkLineRasterizationMode lineRasterizationMode;
 *     VkBool32 stippledLineEnable;
 *     uint32_t lineStippleFactor;
 *     uint16_t lineStipplePattern;
 * }}</pre>
 */
public class VkPipelineRasterizationLineStateCreateInfoKHR extends VkPipelineRasterizationLineStateCreateInfo {

    protected VkPipelineRasterizationLineStateCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineRasterizationLineStateCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineRasterizationLineStateCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkPipelineRasterizationLineStateCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineRasterizationLineStateCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPipelineRasterizationLineStateCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO} value to the {@code sType} field. */
    @Override
    public VkPipelineRasterizationLineStateCreateInfoKHR sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPipelineRasterizationLineStateCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code lineRasterizationMode} field. */
    @Override
    public VkPipelineRasterizationLineStateCreateInfoKHR lineRasterizationMode(@NativeType("VkLineRasterizationMode") int value) { nlineRasterizationMode(address(), value); return this; }
    /** Sets the specified value to the {@code stippledLineEnable} field. */
    @Override
    public VkPipelineRasterizationLineStateCreateInfoKHR stippledLineEnable(@NativeType("VkBool32") boolean value) { nstippledLineEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code lineStippleFactor} field. */
    @Override
    public VkPipelineRasterizationLineStateCreateInfoKHR lineStippleFactor(@NativeType("uint32_t") int value) { nlineStippleFactor(address(), value); return this; }
    /** Sets the specified value to the {@code lineStipplePattern} field. */
    @Override
    public VkPipelineRasterizationLineStateCreateInfoKHR lineStipplePattern(@NativeType("uint16_t") short value) { nlineStipplePattern(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPipelineRasterizationLineStateCreateInfoKHR set(
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
    public VkPipelineRasterizationLineStateCreateInfoKHR set(VkPipelineRasterizationLineStateCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineRasterizationLineStateCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineRasterizationLineStateCreateInfoKHR malloc() {
        return new VkPipelineRasterizationLineStateCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineRasterizationLineStateCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineRasterizationLineStateCreateInfoKHR calloc() {
        return new VkPipelineRasterizationLineStateCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineRasterizationLineStateCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPipelineRasterizationLineStateCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineRasterizationLineStateCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineRasterizationLineStateCreateInfoKHR} instance for the specified memory address. */
    public static VkPipelineRasterizationLineStateCreateInfoKHR create(long address) {
        return new VkPipelineRasterizationLineStateCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineRasterizationLineStateCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkPipelineRasterizationLineStateCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineRasterizationLineStateCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineRasterizationLineStateCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineRasterizationLineStateCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRasterizationLineStateCreateInfoKHR malloc(MemoryStack stack) {
        return new VkPipelineRasterizationLineStateCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineRasterizationLineStateCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRasterizationLineStateCreateInfoKHR calloc(MemoryStack stack) {
        return new VkPipelineRasterizationLineStateCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPipelineRasterizationLineStateCreateInfoKHR} structs. */
    public static class Buffer extends VkPipelineRasterizationLineStateCreateInfo.Buffer {

        private static final VkPipelineRasterizationLineStateCreateInfoKHR ELEMENT_FACTORY = VkPipelineRasterizationLineStateCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPipelineRasterizationLineStateCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineRasterizationLineStateCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineRasterizationLineStateCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPipelineRasterizationLineStateCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineRasterizationLineStateCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO} value to the {@code sType} field. */
        @Override
        public VkPipelineRasterizationLineStateCreateInfoKHR.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPipelineRasterizationLineStateCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPipelineRasterizationLineStateCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code lineRasterizationMode} field. */
        @Override
        public VkPipelineRasterizationLineStateCreateInfoKHR.Buffer lineRasterizationMode(@NativeType("VkLineRasterizationMode") int value) { VkPipelineRasterizationLineStateCreateInfoKHR.nlineRasterizationMode(address(), value); return this; }
        /** Sets the specified value to the {@code stippledLineEnable} field. */
        @Override
        public VkPipelineRasterizationLineStateCreateInfoKHR.Buffer stippledLineEnable(@NativeType("VkBool32") boolean value) { VkPipelineRasterizationLineStateCreateInfoKHR.nstippledLineEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code lineStippleFactor} field. */
        @Override
        public VkPipelineRasterizationLineStateCreateInfoKHR.Buffer lineStippleFactor(@NativeType("uint32_t") int value) { VkPipelineRasterizationLineStateCreateInfoKHR.nlineStippleFactor(address(), value); return this; }
        /** Sets the specified value to the {@code lineStipplePattern} field. */
        @Override
        public VkPipelineRasterizationLineStateCreateInfoKHR.Buffer lineStipplePattern(@NativeType("uint16_t") short value) { VkPipelineRasterizationLineStateCreateInfoKHR.nlineStipplePattern(address(), value); return this; }

    }

}