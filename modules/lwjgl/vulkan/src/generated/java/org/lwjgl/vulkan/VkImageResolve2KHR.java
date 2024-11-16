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
 * See {@link VkImageResolve2}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageResolve2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} srcSubresource;
 *     {@link VkOffset3D VkOffset3D} srcOffset;
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} dstSubresource;
 *     {@link VkOffset3D VkOffset3D} dstOffset;
 *     {@link VkExtent3D VkExtent3D} extent;
 * }</code></pre>
 */
public class VkImageResolve2KHR extends VkImageResolve2 {

    protected VkImageResolve2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageResolve2KHR create(long address, @Nullable ByteBuffer container) {
        return new VkImageResolve2KHR(address, container);
    }

    /**
     * Creates a {@code VkImageResolve2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageResolve2KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkImageResolve2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2 STRUCTURE_TYPE_IMAGE_RESOLVE_2} value to the {@code sType} field. */
    @Override
    public VkImageResolve2KHR sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkImageResolve2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@code srcSubresource} field. */
    @Override
    public VkImageResolve2KHR srcSubresource(VkImageSubresourceLayers value) { nsrcSubresource(address(), value); return this; }
    /** Passes the {@code srcSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkImageResolve2KHR srcSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(srcSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D} to the {@code srcOffset} field. */
    @Override
    public VkImageResolve2KHR srcOffset(VkOffset3D value) { nsrcOffset(address(), value); return this; }
    /** Passes the {@code srcOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkImageResolve2KHR srcOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(srcOffset()); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@code dstSubresource} field. */
    @Override
    public VkImageResolve2KHR dstSubresource(VkImageSubresourceLayers value) { ndstSubresource(address(), value); return this; }
    /** Passes the {@code dstSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkImageResolve2KHR dstSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(dstSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D} to the {@code dstOffset} field. */
    @Override
    public VkImageResolve2KHR dstOffset(VkOffset3D value) { ndstOffset(address(), value); return this; }
    /** Passes the {@code dstOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkImageResolve2KHR dstOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(dstOffset()); return this; }
    /** Copies the specified {@link VkExtent3D} to the {@code extent} field. */
    @Override
    public VkImageResolve2KHR extent(VkExtent3D value) { nextent(address(), value); return this; }
    /** Passes the {@code extent} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkImageResolve2KHR extent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(extent()); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkImageResolve2KHR set(
        int sType,
        long pNext,
        VkImageSubresourceLayers srcSubresource,
        VkOffset3D srcOffset,
        VkImageSubresourceLayers dstSubresource,
        VkOffset3D dstOffset,
        VkExtent3D extent
    ) {
        sType(sType);
        pNext(pNext);
        srcSubresource(srcSubresource);
        srcOffset(srcOffset);
        dstSubresource(dstSubresource);
        dstOffset(dstOffset);
        extent(extent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageResolve2KHR set(VkImageResolve2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageResolve2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageResolve2KHR malloc() {
        return new VkImageResolve2KHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageResolve2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageResolve2KHR calloc() {
        return new VkImageResolve2KHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageResolve2KHR} instance allocated with {@link BufferUtils}. */
    public static VkImageResolve2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageResolve2KHR(memAddress(container), container);
    }

    /** Returns a new {@code VkImageResolve2KHR} instance for the specified memory address. */
    public static VkImageResolve2KHR create(long address) {
        return new VkImageResolve2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImageResolve2KHR createSafe(long address) {
        return address == NULL ? null : new VkImageResolve2KHR(address, null);
    }

    /**
     * Returns a new {@link VkImageResolve2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageResolve2KHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageResolve2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageResolve2KHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageResolve2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageResolve2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageResolve2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageResolve2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImageResolve2KHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImageResolve2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageResolve2KHR malloc(MemoryStack stack) {
        return new VkImageResolve2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageResolve2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageResolve2KHR calloc(MemoryStack stack) {
        return new VkImageResolve2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageResolve2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageResolve2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageResolve2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageResolve2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkImageResolve2KHR} structs. */
    public static class Buffer extends VkImageResolve2.Buffer {

        private static final VkImageResolve2KHR ELEMENT_FACTORY = VkImageResolve2KHR.create(-1L);

        /**
         * Creates a new {@code VkImageResolve2KHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageResolve2KHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageResolve2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkImageResolve2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkImageResolve2KHR.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2 STRUCTURE_TYPE_IMAGE_RESOLVE_2} value to the {@code sType} field. */
        @Override
        public VkImageResolve2KHR.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkImageResolve2KHR.Buffer pNext(@NativeType("void const *") long value) { VkImageResolve2KHR.npNext(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@code srcSubresource} field. */
        @Override
        public VkImageResolve2KHR.Buffer srcSubresource(VkImageSubresourceLayers value) { VkImageResolve2KHR.nsrcSubresource(address(), value); return this; }
        /** Passes the {@code srcSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkImageResolve2KHR.Buffer srcSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(srcSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D} to the {@code srcOffset} field. */
        @Override
        public VkImageResolve2KHR.Buffer srcOffset(VkOffset3D value) { VkImageResolve2KHR.nsrcOffset(address(), value); return this; }
        /** Passes the {@code srcOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkImageResolve2KHR.Buffer srcOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(srcOffset()); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@code dstSubresource} field. */
        @Override
        public VkImageResolve2KHR.Buffer dstSubresource(VkImageSubresourceLayers value) { VkImageResolve2KHR.ndstSubresource(address(), value); return this; }
        /** Passes the {@code dstSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkImageResolve2KHR.Buffer dstSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(dstSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D} to the {@code dstOffset} field. */
        @Override
        public VkImageResolve2KHR.Buffer dstOffset(VkOffset3D value) { VkImageResolve2KHR.ndstOffset(address(), value); return this; }
        /** Passes the {@code dstOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkImageResolve2KHR.Buffer dstOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(dstOffset()); return this; }
        /** Copies the specified {@link VkExtent3D} to the {@code extent} field. */
        @Override
        public VkImageResolve2KHR.Buffer extent(VkExtent3D value) { VkImageResolve2KHR.nextent(address(), value); return this; }
        /** Passes the {@code extent} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkImageResolve2KHR.Buffer extent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(extent()); return this; }

    }

}