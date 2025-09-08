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
 * struct VkBufferImageCopy {
 *     VkDeviceSize bufferOffset;
 *     uint32_t bufferRowLength;
 *     uint32_t bufferImageHeight;
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} imageSubresource;
 *     {@link VkOffset3D VkOffset3D} imageOffset;
 *     {@link VkExtent3D VkExtent3D} imageExtent;
 * }</code></pre>
 */
public class VkBufferImageCopy extends Struct<VkBufferImageCopy> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BUFFEROFFSET,
        BUFFERROWLENGTH,
        BUFFERIMAGEHEIGHT,
        IMAGESUBRESOURCE,
        IMAGEOFFSET,
        IMAGEEXTENT;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(4),
            __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF),
            __member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF),
            __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BUFFEROFFSET = layout.offsetof(0);
        BUFFERROWLENGTH = layout.offsetof(1);
        BUFFERIMAGEHEIGHT = layout.offsetof(2);
        IMAGESUBRESOURCE = layout.offsetof(3);
        IMAGEOFFSET = layout.offsetof(4);
        IMAGEEXTENT = layout.offsetof(5);
    }

    protected VkBufferImageCopy(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBufferImageCopy create(long address, @Nullable ByteBuffer container) {
        return new VkBufferImageCopy(address, container);
    }

    /**
     * Creates a {@code VkBufferImageCopy} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBufferImageCopy(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code bufferOffset} field. */
    @NativeType("VkDeviceSize")
    public long bufferOffset() { return nbufferOffset(address()); }
    /** @return the value of the {@code bufferRowLength} field. */
    @NativeType("uint32_t")
    public int bufferRowLength() { return nbufferRowLength(address()); }
    /** @return the value of the {@code bufferImageHeight} field. */
    @NativeType("uint32_t")
    public int bufferImageHeight() { return nbufferImageHeight(address()); }
    /** @return a {@link VkImageSubresourceLayers} view of the {@code imageSubresource} field. */
    public VkImageSubresourceLayers imageSubresource() { return nimageSubresource(address()); }
    /** @return a {@link VkOffset3D} view of the {@code imageOffset} field. */
    public VkOffset3D imageOffset() { return nimageOffset(address()); }
    /** @return a {@link VkExtent3D} view of the {@code imageExtent} field. */
    public VkExtent3D imageExtent() { return nimageExtent(address()); }

    /** Sets the specified value to the {@code bufferOffset} field. */
    public VkBufferImageCopy bufferOffset(@NativeType("VkDeviceSize") long value) { nbufferOffset(address(), value); return this; }
    /** Sets the specified value to the {@code bufferRowLength} field. */
    public VkBufferImageCopy bufferRowLength(@NativeType("uint32_t") int value) { nbufferRowLength(address(), value); return this; }
    /** Sets the specified value to the {@code bufferImageHeight} field. */
    public VkBufferImageCopy bufferImageHeight(@NativeType("uint32_t") int value) { nbufferImageHeight(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@code imageSubresource} field. */
    public VkBufferImageCopy imageSubresource(VkImageSubresourceLayers value) { nimageSubresource(address(), value); return this; }
    /** Passes the {@code imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkBufferImageCopy imageSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(imageSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D} to the {@code imageOffset} field. */
    public VkBufferImageCopy imageOffset(VkOffset3D value) { nimageOffset(address(), value); return this; }
    /** Passes the {@code imageOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkBufferImageCopy imageOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(imageOffset()); return this; }
    /** Copies the specified {@link VkExtent3D} to the {@code imageExtent} field. */
    public VkBufferImageCopy imageExtent(VkExtent3D value) { nimageExtent(address(), value); return this; }
    /** Passes the {@code imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkBufferImageCopy imageExtent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(imageExtent()); return this; }

    /** Initializes this struct with the specified values. */
    public VkBufferImageCopy set(
        long bufferOffset,
        int bufferRowLength,
        int bufferImageHeight,
        VkImageSubresourceLayers imageSubresource,
        VkOffset3D imageOffset,
        VkExtent3D imageExtent
    ) {
        bufferOffset(bufferOffset);
        bufferRowLength(bufferRowLength);
        bufferImageHeight(bufferImageHeight);
        imageSubresource(imageSubresource);
        imageOffset(imageOffset);
        imageExtent(imageExtent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBufferImageCopy set(VkBufferImageCopy src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferImageCopy} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBufferImageCopy malloc() {
        return new VkBufferImageCopy(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBufferImageCopy} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBufferImageCopy calloc() {
        return new VkBufferImageCopy(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBufferImageCopy} instance allocated with {@link BufferUtils}. */
    public static VkBufferImageCopy create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferImageCopy(memAddress(container), container);
    }

    /** Returns a new {@code VkBufferImageCopy} instance for the specified memory address. */
    public static VkBufferImageCopy create(long address) {
        return new VkBufferImageCopy(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBufferImageCopy createSafe(long address) {
        return address == NULL ? null : new VkBufferImageCopy(address, null);
    }

    /**
     * Returns a new {@link VkBufferImageCopy.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBufferImageCopy.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferImageCopy.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBufferImageCopy.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBufferImageCopy.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBufferImageCopy mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBufferImageCopy callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBufferImageCopy mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBufferImageCopy callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBufferImageCopy.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBufferImageCopy.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBufferImageCopy.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBufferImageCopy.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkBufferImageCopy} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferImageCopy malloc(MemoryStack stack) {
        return new VkBufferImageCopy(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBufferImageCopy} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferImageCopy calloc(MemoryStack stack) {
        return new VkBufferImageCopy(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBufferImageCopy.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferImageCopy.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bufferOffset}. */
    public static long nbufferOffset(long struct) { return memGetLong(struct + VkBufferImageCopy.BUFFEROFFSET); }
    /** Unsafe version of {@link #bufferRowLength}. */
    public static int nbufferRowLength(long struct) { return memGetInt(struct + VkBufferImageCopy.BUFFERROWLENGTH); }
    /** Unsafe version of {@link #bufferImageHeight}. */
    public static int nbufferImageHeight(long struct) { return memGetInt(struct + VkBufferImageCopy.BUFFERIMAGEHEIGHT); }
    /** Unsafe version of {@link #imageSubresource}. */
    public static VkImageSubresourceLayers nimageSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkBufferImageCopy.IMAGESUBRESOURCE); }
    /** Unsafe version of {@link #imageOffset}. */
    public static VkOffset3D nimageOffset(long struct) { return VkOffset3D.create(struct + VkBufferImageCopy.IMAGEOFFSET); }
    /** Unsafe version of {@link #imageExtent}. */
    public static VkExtent3D nimageExtent(long struct) { return VkExtent3D.create(struct + VkBufferImageCopy.IMAGEEXTENT); }

    /** Unsafe version of {@link #bufferOffset(long) bufferOffset}. */
    public static void nbufferOffset(long struct, long value) { memPutLong(struct + VkBufferImageCopy.BUFFEROFFSET, value); }
    /** Unsafe version of {@link #bufferRowLength(int) bufferRowLength}. */
    public static void nbufferRowLength(long struct, int value) { memPutInt(struct + VkBufferImageCopy.BUFFERROWLENGTH, value); }
    /** Unsafe version of {@link #bufferImageHeight(int) bufferImageHeight}. */
    public static void nbufferImageHeight(long struct, int value) { memPutInt(struct + VkBufferImageCopy.BUFFERIMAGEHEIGHT, value); }
    /** Unsafe version of {@link #imageSubresource(VkImageSubresourceLayers) imageSubresource}. */
    public static void nimageSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkBufferImageCopy.IMAGESUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
    /** Unsafe version of {@link #imageOffset(VkOffset3D) imageOffset}. */
    public static void nimageOffset(long struct, VkOffset3D value) { memCopy(value.address(), struct + VkBufferImageCopy.IMAGEOFFSET, VkOffset3D.SIZEOF); }
    /** Unsafe version of {@link #imageExtent(VkExtent3D) imageExtent}. */
    public static void nimageExtent(long struct, VkExtent3D value) { memCopy(value.address(), struct + VkBufferImageCopy.IMAGEEXTENT, VkExtent3D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkBufferImageCopy} structs. */
    public static class Buffer extends StructBuffer<VkBufferImageCopy, Buffer> implements NativeResource {

        private static final VkBufferImageCopy ELEMENT_FACTORY = VkBufferImageCopy.create(-1L);

        /**
         * Creates a new {@code VkBufferImageCopy.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBufferImageCopy#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBufferImageCopy getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code bufferOffset} field. */
        @NativeType("VkDeviceSize")
        public long bufferOffset() { return VkBufferImageCopy.nbufferOffset(address()); }
        /** @return the value of the {@code bufferRowLength} field. */
        @NativeType("uint32_t")
        public int bufferRowLength() { return VkBufferImageCopy.nbufferRowLength(address()); }
        /** @return the value of the {@code bufferImageHeight} field. */
        @NativeType("uint32_t")
        public int bufferImageHeight() { return VkBufferImageCopy.nbufferImageHeight(address()); }
        /** @return a {@link VkImageSubresourceLayers} view of the {@code imageSubresource} field. */
        public VkImageSubresourceLayers imageSubresource() { return VkBufferImageCopy.nimageSubresource(address()); }
        /** @return a {@link VkOffset3D} view of the {@code imageOffset} field. */
        public VkOffset3D imageOffset() { return VkBufferImageCopy.nimageOffset(address()); }
        /** @return a {@link VkExtent3D} view of the {@code imageExtent} field. */
        public VkExtent3D imageExtent() { return VkBufferImageCopy.nimageExtent(address()); }

        /** Sets the specified value to the {@code bufferOffset} field. */
        public VkBufferImageCopy.Buffer bufferOffset(@NativeType("VkDeviceSize") long value) { VkBufferImageCopy.nbufferOffset(address(), value); return this; }
        /** Sets the specified value to the {@code bufferRowLength} field. */
        public VkBufferImageCopy.Buffer bufferRowLength(@NativeType("uint32_t") int value) { VkBufferImageCopy.nbufferRowLength(address(), value); return this; }
        /** Sets the specified value to the {@code bufferImageHeight} field. */
        public VkBufferImageCopy.Buffer bufferImageHeight(@NativeType("uint32_t") int value) { VkBufferImageCopy.nbufferImageHeight(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@code imageSubresource} field. */
        public VkBufferImageCopy.Buffer imageSubresource(VkImageSubresourceLayers value) { VkBufferImageCopy.nimageSubresource(address(), value); return this; }
        /** Passes the {@code imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkBufferImageCopy.Buffer imageSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(imageSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D} to the {@code imageOffset} field. */
        public VkBufferImageCopy.Buffer imageOffset(VkOffset3D value) { VkBufferImageCopy.nimageOffset(address(), value); return this; }
        /** Passes the {@code imageOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkBufferImageCopy.Buffer imageOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(imageOffset()); return this; }
        /** Copies the specified {@link VkExtent3D} to the {@code imageExtent} field. */
        public VkBufferImageCopy.Buffer imageExtent(VkExtent3D value) { VkBufferImageCopy.nimageExtent(address(), value); return this; }
        /** Passes the {@code imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkBufferImageCopy.Buffer imageExtent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(imageExtent()); return this; }

    }

}