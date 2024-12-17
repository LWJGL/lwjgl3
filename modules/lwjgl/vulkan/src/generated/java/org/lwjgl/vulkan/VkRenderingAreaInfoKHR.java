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
 * struct VkRenderingAreaInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t viewMask;
 *     uint32_t colorAttachmentCount;
 *     VkFormat const * pColorAttachmentFormats;
 *     VkFormat depthAttachmentFormat;
 *     VkFormat stencilAttachmentFormat;
 * }}</pre>
 */
public class VkRenderingAreaInfoKHR extends VkRenderingAreaInfo {

    protected VkRenderingAreaInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderingAreaInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkRenderingAreaInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkRenderingAreaInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderingAreaInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkRenderingAreaInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_RENDERING_AREA_INFO STRUCTURE_TYPE_RENDERING_AREA_INFO} value to the {@code sType} field. */
    @Override
    public VkRenderingAreaInfoKHR sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_RENDERING_AREA_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkRenderingAreaInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code viewMask} field. */
    @Override
    public VkRenderingAreaInfoKHR viewMask(@NativeType("uint32_t") int value) { nviewMask(address(), value); return this; }
    /** Sets the specified value to the {@code colorAttachmentCount} field. */
    @Override
    public VkRenderingAreaInfoKHR colorAttachmentCount(@NativeType("uint32_t") int value) { ncolorAttachmentCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pColorAttachmentFormats} field. */
    @Override
    public VkRenderingAreaInfoKHR pColorAttachmentFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { npColorAttachmentFormats(address(), value); return this; }
    /** Sets the specified value to the {@code depthAttachmentFormat} field. */
    @Override
    public VkRenderingAreaInfoKHR depthAttachmentFormat(@NativeType("VkFormat") int value) { ndepthAttachmentFormat(address(), value); return this; }
    /** Sets the specified value to the {@code stencilAttachmentFormat} field. */
    @Override
    public VkRenderingAreaInfoKHR stencilAttachmentFormat(@NativeType("VkFormat") int value) { nstencilAttachmentFormat(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkRenderingAreaInfoKHR set(
        int sType,
        long pNext,
        int viewMask,
        int colorAttachmentCount,
        @Nullable IntBuffer pColorAttachmentFormats,
        int depthAttachmentFormat,
        int stencilAttachmentFormat
    ) {
        sType(sType);
        pNext(pNext);
        viewMask(viewMask);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachmentFormats(pColorAttachmentFormats);
        depthAttachmentFormat(depthAttachmentFormat);
        stencilAttachmentFormat(stencilAttachmentFormat);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderingAreaInfoKHR set(VkRenderingAreaInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderingAreaInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderingAreaInfoKHR malloc() {
        return new VkRenderingAreaInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderingAreaInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderingAreaInfoKHR calloc() {
        return new VkRenderingAreaInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderingAreaInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkRenderingAreaInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderingAreaInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderingAreaInfoKHR} instance for the specified memory address. */
    public static VkRenderingAreaInfoKHR create(long address) {
        return new VkRenderingAreaInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRenderingAreaInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkRenderingAreaInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkRenderingAreaInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingAreaInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderingAreaInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingAreaInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingAreaInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingAreaInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderingAreaInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderingAreaInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRenderingAreaInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRenderingAreaInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingAreaInfoKHR malloc(MemoryStack stack) {
        return new VkRenderingAreaInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderingAreaInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingAreaInfoKHR calloc(MemoryStack stack) {
        return new VkRenderingAreaInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderingAreaInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingAreaInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingAreaInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingAreaInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkRenderingAreaInfoKHR} structs. */
    public static class Buffer extends VkRenderingAreaInfo.Buffer {

        private static final VkRenderingAreaInfoKHR ELEMENT_FACTORY = VkRenderingAreaInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkRenderingAreaInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderingAreaInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderingAreaInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkRenderingAreaInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderingAreaInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_RENDERING_AREA_INFO STRUCTURE_TYPE_RENDERING_AREA_INFO} value to the {@code sType} field. */
        @Override
        public VkRenderingAreaInfoKHR.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_RENDERING_AREA_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkRenderingAreaInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkRenderingAreaInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code viewMask} field. */
        @Override
        public VkRenderingAreaInfoKHR.Buffer viewMask(@NativeType("uint32_t") int value) { VkRenderingAreaInfoKHR.nviewMask(address(), value); return this; }
        /** Sets the specified value to the {@code colorAttachmentCount} field. */
        @Override
        public VkRenderingAreaInfoKHR.Buffer colorAttachmentCount(@NativeType("uint32_t") int value) { VkRenderingAreaInfoKHR.ncolorAttachmentCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pColorAttachmentFormats} field. */
        @Override
        public VkRenderingAreaInfoKHR.Buffer pColorAttachmentFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { VkRenderingAreaInfoKHR.npColorAttachmentFormats(address(), value); return this; }
        /** Sets the specified value to the {@code depthAttachmentFormat} field. */
        @Override
        public VkRenderingAreaInfoKHR.Buffer depthAttachmentFormat(@NativeType("VkFormat") int value) { VkRenderingAreaInfoKHR.ndepthAttachmentFormat(address(), value); return this; }
        /** Sets the specified value to the {@code stencilAttachmentFormat} field. */
        @Override
        public VkRenderingAreaInfoKHR.Buffer stencilAttachmentFormat(@NativeType("VkFormat") int value) { VkRenderingAreaInfoKHR.nstencilAttachmentFormat(address(), value); return this; }

    }

}