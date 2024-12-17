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
 * struct VkRenderingAttachmentLocationInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t colorAttachmentCount;
 *     uint32_t const * pColorAttachmentLocations;
 * }}</pre>
 */
public class VkRenderingAttachmentLocationInfoKHR extends VkRenderingAttachmentLocationInfo {

    protected VkRenderingAttachmentLocationInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderingAttachmentLocationInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkRenderingAttachmentLocationInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkRenderingAttachmentLocationInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderingAttachmentLocationInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkRenderingAttachmentLocationInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO} value to the {@code sType} field. */
    @Override
    public VkRenderingAttachmentLocationInfoKHR sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkRenderingAttachmentLocationInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code colorAttachmentCount} field. */
    @Override
    public VkRenderingAttachmentLocationInfoKHR colorAttachmentCount(@NativeType("uint32_t") int value) { ncolorAttachmentCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pColorAttachmentLocations} field. */
    @Override
    public VkRenderingAttachmentLocationInfoKHR pColorAttachmentLocations(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npColorAttachmentLocations(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkRenderingAttachmentLocationInfoKHR set(
        int sType,
        long pNext,
        int colorAttachmentCount,
        @Nullable IntBuffer pColorAttachmentLocations
    ) {
        sType(sType);
        pNext(pNext);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachmentLocations(pColorAttachmentLocations);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderingAttachmentLocationInfoKHR set(VkRenderingAttachmentLocationInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderingAttachmentLocationInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderingAttachmentLocationInfoKHR malloc() {
        return new VkRenderingAttachmentLocationInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderingAttachmentLocationInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderingAttachmentLocationInfoKHR calloc() {
        return new VkRenderingAttachmentLocationInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderingAttachmentLocationInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkRenderingAttachmentLocationInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderingAttachmentLocationInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderingAttachmentLocationInfoKHR} instance for the specified memory address. */
    public static VkRenderingAttachmentLocationInfoKHR create(long address) {
        return new VkRenderingAttachmentLocationInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRenderingAttachmentLocationInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkRenderingAttachmentLocationInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkRenderingAttachmentLocationInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentLocationInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderingAttachmentLocationInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentLocationInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingAttachmentLocationInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentLocationInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderingAttachmentLocationInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentLocationInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRenderingAttachmentLocationInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRenderingAttachmentLocationInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingAttachmentLocationInfoKHR malloc(MemoryStack stack) {
        return new VkRenderingAttachmentLocationInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderingAttachmentLocationInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingAttachmentLocationInfoKHR calloc(MemoryStack stack) {
        return new VkRenderingAttachmentLocationInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderingAttachmentLocationInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentLocationInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingAttachmentLocationInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentLocationInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkRenderingAttachmentLocationInfoKHR} structs. */
    public static class Buffer extends VkRenderingAttachmentLocationInfo.Buffer {

        private static final VkRenderingAttachmentLocationInfoKHR ELEMENT_FACTORY = VkRenderingAttachmentLocationInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkRenderingAttachmentLocationInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderingAttachmentLocationInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderingAttachmentLocationInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkRenderingAttachmentLocationInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderingAttachmentLocationInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO} value to the {@code sType} field. */
        @Override
        public VkRenderingAttachmentLocationInfoKHR.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkRenderingAttachmentLocationInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkRenderingAttachmentLocationInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code colorAttachmentCount} field. */
        @Override
        public VkRenderingAttachmentLocationInfoKHR.Buffer colorAttachmentCount(@NativeType("uint32_t") int value) { VkRenderingAttachmentLocationInfoKHR.ncolorAttachmentCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pColorAttachmentLocations} field. */
        @Override
        public VkRenderingAttachmentLocationInfoKHR.Buffer pColorAttachmentLocations(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkRenderingAttachmentLocationInfoKHR.npColorAttachmentLocations(address(), value); return this; }

    }

}