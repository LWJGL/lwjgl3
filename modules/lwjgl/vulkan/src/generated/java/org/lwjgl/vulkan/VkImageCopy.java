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
 * <pre><code>
 * struct VkImageCopy {
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} srcSubresource;
 *     {@link VkOffset3D VkOffset3D} srcOffset;
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} dstSubresource;
 *     {@link VkOffset3D VkOffset3D} dstOffset;
 *     {@link VkExtent3D VkExtent3D} extent;
 * }</code></pre>
 */
public class VkImageCopy extends Struct<VkImageCopy> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SRCSUBRESOURCE,
        SRCOFFSET,
        DSTSUBRESOURCE,
        DSTOFFSET,
        EXTENT;

    static {
        Layout layout = __struct(
            __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF),
            __member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF),
            __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF),
            __member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF),
            __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SRCSUBRESOURCE = layout.offsetof(0);
        SRCOFFSET = layout.offsetof(1);
        DSTSUBRESOURCE = layout.offsetof(2);
        DSTOFFSET = layout.offsetof(3);
        EXTENT = layout.offsetof(4);
    }

    protected VkImageCopy(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageCopy create(long address, @Nullable ByteBuffer container) {
        return new VkImageCopy(address, container);
    }

    /**
     * Creates a {@code VkImageCopy} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageCopy(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link VkImageSubresourceLayers} view of the {@code srcSubresource} field. */
    public VkImageSubresourceLayers srcSubresource() { return nsrcSubresource(address()); }
    /** @return a {@link VkOffset3D} view of the {@code srcOffset} field. */
    public VkOffset3D srcOffset() { return nsrcOffset(address()); }
    /** @return a {@link VkImageSubresourceLayers} view of the {@code dstSubresource} field. */
    public VkImageSubresourceLayers dstSubresource() { return ndstSubresource(address()); }
    /** @return a {@link VkOffset3D} view of the {@code dstOffset} field. */
    public VkOffset3D dstOffset() { return ndstOffset(address()); }
    /** @return a {@link VkExtent3D} view of the {@code extent} field. */
    public VkExtent3D extent() { return nextent(address()); }

    /** Copies the specified {@link VkImageSubresourceLayers} to the {@code srcSubresource} field. */
    public VkImageCopy srcSubresource(VkImageSubresourceLayers value) { nsrcSubresource(address(), value); return this; }
    /** Passes the {@code srcSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageCopy srcSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(srcSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D} to the {@code srcOffset} field. */
    public VkImageCopy srcOffset(VkOffset3D value) { nsrcOffset(address(), value); return this; }
    /** Passes the {@code srcOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageCopy srcOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(srcOffset()); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@code dstSubresource} field. */
    public VkImageCopy dstSubresource(VkImageSubresourceLayers value) { ndstSubresource(address(), value); return this; }
    /** Passes the {@code dstSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageCopy dstSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(dstSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D} to the {@code dstOffset} field. */
    public VkImageCopy dstOffset(VkOffset3D value) { ndstOffset(address(), value); return this; }
    /** Passes the {@code dstOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageCopy dstOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(dstOffset()); return this; }
    /** Copies the specified {@link VkExtent3D} to the {@code extent} field. */
    public VkImageCopy extent(VkExtent3D value) { nextent(address(), value); return this; }
    /** Passes the {@code extent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageCopy extent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(extent()); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageCopy set(
        VkImageSubresourceLayers srcSubresource,
        VkOffset3D srcOffset,
        VkImageSubresourceLayers dstSubresource,
        VkOffset3D dstOffset,
        VkExtent3D extent
    ) {
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
    public VkImageCopy set(VkImageCopy src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageCopy} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageCopy malloc() {
        return new VkImageCopy(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageCopy} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageCopy calloc() {
        return new VkImageCopy(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageCopy} instance allocated with {@link BufferUtils}. */
    public static VkImageCopy create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageCopy(memAddress(container), container);
    }

    /** Returns a new {@code VkImageCopy} instance for the specified memory address. */
    public static VkImageCopy create(long address) {
        return new VkImageCopy(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImageCopy createSafe(long address) {
        return address == NULL ? null : new VkImageCopy(address, null);
    }

    /**
     * Returns a new {@link VkImageCopy.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageCopy.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageCopy.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageCopy.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageCopy.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageCopy.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageCopy.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageCopy.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImageCopy.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageCopy mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageCopy callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageCopy mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageCopy callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageCopy.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageCopy.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageCopy.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageCopy.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImageCopy} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageCopy malloc(MemoryStack stack) {
        return new VkImageCopy(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageCopy} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageCopy calloc(MemoryStack stack) {
        return new VkImageCopy(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageCopy.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageCopy.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageCopy.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageCopy.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #srcSubresource}. */
    public static VkImageSubresourceLayers nsrcSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkImageCopy.SRCSUBRESOURCE); }
    /** Unsafe version of {@link #srcOffset}. */
    public static VkOffset3D nsrcOffset(long struct) { return VkOffset3D.create(struct + VkImageCopy.SRCOFFSET); }
    /** Unsafe version of {@link #dstSubresource}. */
    public static VkImageSubresourceLayers ndstSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkImageCopy.DSTSUBRESOURCE); }
    /** Unsafe version of {@link #dstOffset}. */
    public static VkOffset3D ndstOffset(long struct) { return VkOffset3D.create(struct + VkImageCopy.DSTOFFSET); }
    /** Unsafe version of {@link #extent}. */
    public static VkExtent3D nextent(long struct) { return VkExtent3D.create(struct + VkImageCopy.EXTENT); }

    /** Unsafe version of {@link #srcSubresource(VkImageSubresourceLayers) srcSubresource}. */
    public static void nsrcSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkImageCopy.SRCSUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
    /** Unsafe version of {@link #srcOffset(VkOffset3D) srcOffset}. */
    public static void nsrcOffset(long struct, VkOffset3D value) { memCopy(value.address(), struct + VkImageCopy.SRCOFFSET, VkOffset3D.SIZEOF); }
    /** Unsafe version of {@link #dstSubresource(VkImageSubresourceLayers) dstSubresource}. */
    public static void ndstSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkImageCopy.DSTSUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
    /** Unsafe version of {@link #dstOffset(VkOffset3D) dstOffset}. */
    public static void ndstOffset(long struct, VkOffset3D value) { memCopy(value.address(), struct + VkImageCopy.DSTOFFSET, VkOffset3D.SIZEOF); }
    /** Unsafe version of {@link #extent(VkExtent3D) extent}. */
    public static void nextent(long struct, VkExtent3D value) { memCopy(value.address(), struct + VkImageCopy.EXTENT, VkExtent3D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkImageCopy} structs. */
    public static class Buffer extends StructBuffer<VkImageCopy, Buffer> implements NativeResource {

        private static final VkImageCopy ELEMENT_FACTORY = VkImageCopy.create(-1L);

        /**
         * Creates a new {@code VkImageCopy.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageCopy#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
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
        protected VkImageCopy getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link VkImageSubresourceLayers} view of the {@code srcSubresource} field. */
        public VkImageSubresourceLayers srcSubresource() { return VkImageCopy.nsrcSubresource(address()); }
        /** @return a {@link VkOffset3D} view of the {@code srcOffset} field. */
        public VkOffset3D srcOffset() { return VkImageCopy.nsrcOffset(address()); }
        /** @return a {@link VkImageSubresourceLayers} view of the {@code dstSubresource} field. */
        public VkImageSubresourceLayers dstSubresource() { return VkImageCopy.ndstSubresource(address()); }
        /** @return a {@link VkOffset3D} view of the {@code dstOffset} field. */
        public VkOffset3D dstOffset() { return VkImageCopy.ndstOffset(address()); }
        /** @return a {@link VkExtent3D} view of the {@code extent} field. */
        public VkExtent3D extent() { return VkImageCopy.nextent(address()); }

        /** Copies the specified {@link VkImageSubresourceLayers} to the {@code srcSubresource} field. */
        public VkImageCopy.Buffer srcSubresource(VkImageSubresourceLayers value) { VkImageCopy.nsrcSubresource(address(), value); return this; }
        /** Passes the {@code srcSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageCopy.Buffer srcSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(srcSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D} to the {@code srcOffset} field. */
        public VkImageCopy.Buffer srcOffset(VkOffset3D value) { VkImageCopy.nsrcOffset(address(), value); return this; }
        /** Passes the {@code srcOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageCopy.Buffer srcOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(srcOffset()); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@code dstSubresource} field. */
        public VkImageCopy.Buffer dstSubresource(VkImageSubresourceLayers value) { VkImageCopy.ndstSubresource(address(), value); return this; }
        /** Passes the {@code dstSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageCopy.Buffer dstSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(dstSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D} to the {@code dstOffset} field. */
        public VkImageCopy.Buffer dstOffset(VkOffset3D value) { VkImageCopy.ndstOffset(address(), value); return this; }
        /** Passes the {@code dstOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageCopy.Buffer dstOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(dstOffset()); return this; }
        /** Copies the specified {@link VkExtent3D} to the {@code extent} field. */
        public VkImageCopy.Buffer extent(VkExtent3D value) { VkImageCopy.nextent(address(), value); return this; }
        /** Passes the {@code extent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageCopy.Buffer extent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(extent()); return this; }

    }

}