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
 * struct VkCopyMemoryToImageIndirectCommandKHR {
 *     VkDeviceAddress srcAddress;
 *     uint32_t bufferRowLength;
 *     uint32_t bufferImageHeight;
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} imageSubresource;
 *     {@link VkOffset3D VkOffset3D} imageOffset;
 *     {@link VkExtent3D VkExtent3D} imageExtent;
 * }</code></pre>
 */
public class VkCopyMemoryToImageIndirectCommandKHR extends Struct<VkCopyMemoryToImageIndirectCommandKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SRCADDRESS,
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

        SRCADDRESS = layout.offsetof(0);
        BUFFERROWLENGTH = layout.offsetof(1);
        BUFFERIMAGEHEIGHT = layout.offsetof(2);
        IMAGESUBRESOURCE = layout.offsetof(3);
        IMAGEOFFSET = layout.offsetof(4);
        IMAGEEXTENT = layout.offsetof(5);
    }

    protected VkCopyMemoryToImageIndirectCommandKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyMemoryToImageIndirectCommandKHR create(long address, @Nullable ByteBuffer container) {
        return new VkCopyMemoryToImageIndirectCommandKHR(address, container);
    }

    /**
     * Creates a {@code VkCopyMemoryToImageIndirectCommandKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyMemoryToImageIndirectCommandKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code srcAddress} field. */
    @NativeType("VkDeviceAddress")
    public long srcAddress() { return nsrcAddress(address()); }
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

    /** Sets the specified value to the {@code srcAddress} field. */
    public VkCopyMemoryToImageIndirectCommandKHR srcAddress(@NativeType("VkDeviceAddress") long value) { nsrcAddress(address(), value); return this; }
    /** Sets the specified value to the {@code bufferRowLength} field. */
    public VkCopyMemoryToImageIndirectCommandKHR bufferRowLength(@NativeType("uint32_t") int value) { nbufferRowLength(address(), value); return this; }
    /** Sets the specified value to the {@code bufferImageHeight} field. */
    public VkCopyMemoryToImageIndirectCommandKHR bufferImageHeight(@NativeType("uint32_t") int value) { nbufferImageHeight(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@code imageSubresource} field. */
    public VkCopyMemoryToImageIndirectCommandKHR imageSubresource(VkImageSubresourceLayers value) { nimageSubresource(address(), value); return this; }
    /** Passes the {@code imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkCopyMemoryToImageIndirectCommandKHR imageSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(imageSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D} to the {@code imageOffset} field. */
    public VkCopyMemoryToImageIndirectCommandKHR imageOffset(VkOffset3D value) { nimageOffset(address(), value); return this; }
    /** Passes the {@code imageOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkCopyMemoryToImageIndirectCommandKHR imageOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(imageOffset()); return this; }
    /** Copies the specified {@link VkExtent3D} to the {@code imageExtent} field. */
    public VkCopyMemoryToImageIndirectCommandKHR imageExtent(VkExtent3D value) { nimageExtent(address(), value); return this; }
    /** Passes the {@code imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkCopyMemoryToImageIndirectCommandKHR imageExtent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(imageExtent()); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyMemoryToImageIndirectCommandKHR set(
        long srcAddress,
        int bufferRowLength,
        int bufferImageHeight,
        VkImageSubresourceLayers imageSubresource,
        VkOffset3D imageOffset,
        VkExtent3D imageExtent
    ) {
        srcAddress(srcAddress);
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
    public VkCopyMemoryToImageIndirectCommandKHR set(VkCopyMemoryToImageIndirectCommandKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyMemoryToImageIndirectCommandKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryToImageIndirectCommandKHR malloc() {
        return new VkCopyMemoryToImageIndirectCommandKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMemoryToImageIndirectCommandKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryToImageIndirectCommandKHR calloc() {
        return new VkCopyMemoryToImageIndirectCommandKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMemoryToImageIndirectCommandKHR} instance allocated with {@link BufferUtils}. */
    public static VkCopyMemoryToImageIndirectCommandKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyMemoryToImageIndirectCommandKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyMemoryToImageIndirectCommandKHR} instance for the specified memory address. */
    public static VkCopyMemoryToImageIndirectCommandKHR create(long address) {
        return new VkCopyMemoryToImageIndirectCommandKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCopyMemoryToImageIndirectCommandKHR createSafe(long address) {
        return address == NULL ? null : new VkCopyMemoryToImageIndirectCommandKHR(address, null);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageIndirectCommandKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageIndirectCommandKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageIndirectCommandKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageIndirectCommandKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageIndirectCommandKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageIndirectCommandKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyMemoryToImageIndirectCommandKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageIndirectCommandKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCopyMemoryToImageIndirectCommandKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyMemoryToImageIndirectCommandKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryToImageIndirectCommandKHR malloc(MemoryStack stack) {
        return new VkCopyMemoryToImageIndirectCommandKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyMemoryToImageIndirectCommandKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryToImageIndirectCommandKHR calloc(MemoryStack stack) {
        return new VkCopyMemoryToImageIndirectCommandKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageIndirectCommandKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageIndirectCommandKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageIndirectCommandKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageIndirectCommandKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #srcAddress}. */
    public static long nsrcAddress(long struct) { return memGetLong(struct + VkCopyMemoryToImageIndirectCommandKHR.SRCADDRESS); }
    /** Unsafe version of {@link #bufferRowLength}. */
    public static int nbufferRowLength(long struct) { return memGetInt(struct + VkCopyMemoryToImageIndirectCommandKHR.BUFFERROWLENGTH); }
    /** Unsafe version of {@link #bufferImageHeight}. */
    public static int nbufferImageHeight(long struct) { return memGetInt(struct + VkCopyMemoryToImageIndirectCommandKHR.BUFFERIMAGEHEIGHT); }
    /** Unsafe version of {@link #imageSubresource}. */
    public static VkImageSubresourceLayers nimageSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkCopyMemoryToImageIndirectCommandKHR.IMAGESUBRESOURCE); }
    /** Unsafe version of {@link #imageOffset}. */
    public static VkOffset3D nimageOffset(long struct) { return VkOffset3D.create(struct + VkCopyMemoryToImageIndirectCommandKHR.IMAGEOFFSET); }
    /** Unsafe version of {@link #imageExtent}. */
    public static VkExtent3D nimageExtent(long struct) { return VkExtent3D.create(struct + VkCopyMemoryToImageIndirectCommandKHR.IMAGEEXTENT); }

    /** Unsafe version of {@link #srcAddress(long) srcAddress}. */
    public static void nsrcAddress(long struct, long value) { memPutLong(struct + VkCopyMemoryToImageIndirectCommandKHR.SRCADDRESS, value); }
    /** Unsafe version of {@link #bufferRowLength(int) bufferRowLength}. */
    public static void nbufferRowLength(long struct, int value) { memPutInt(struct + VkCopyMemoryToImageIndirectCommandKHR.BUFFERROWLENGTH, value); }
    /** Unsafe version of {@link #bufferImageHeight(int) bufferImageHeight}. */
    public static void nbufferImageHeight(long struct, int value) { memPutInt(struct + VkCopyMemoryToImageIndirectCommandKHR.BUFFERIMAGEHEIGHT, value); }
    /** Unsafe version of {@link #imageSubresource(VkImageSubresourceLayers) imageSubresource}. */
    public static void nimageSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkCopyMemoryToImageIndirectCommandKHR.IMAGESUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
    /** Unsafe version of {@link #imageOffset(VkOffset3D) imageOffset}. */
    public static void nimageOffset(long struct, VkOffset3D value) { memCopy(value.address(), struct + VkCopyMemoryToImageIndirectCommandKHR.IMAGEOFFSET, VkOffset3D.SIZEOF); }
    /** Unsafe version of {@link #imageExtent(VkExtent3D) imageExtent}. */
    public static void nimageExtent(long struct, VkExtent3D value) { memCopy(value.address(), struct + VkCopyMemoryToImageIndirectCommandKHR.IMAGEEXTENT, VkExtent3D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkCopyMemoryToImageIndirectCommandKHR} structs. */
    public static class Buffer extends StructBuffer<VkCopyMemoryToImageIndirectCommandKHR, Buffer> implements NativeResource {

        private static final VkCopyMemoryToImageIndirectCommandKHR ELEMENT_FACTORY = VkCopyMemoryToImageIndirectCommandKHR.create(-1L);

        /**
         * Creates a new {@code VkCopyMemoryToImageIndirectCommandKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyMemoryToImageIndirectCommandKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyMemoryToImageIndirectCommandKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code srcAddress} field. */
        @NativeType("VkDeviceAddress")
        public long srcAddress() { return VkCopyMemoryToImageIndirectCommandKHR.nsrcAddress(address()); }
        /** @return the value of the {@code bufferRowLength} field. */
        @NativeType("uint32_t")
        public int bufferRowLength() { return VkCopyMemoryToImageIndirectCommandKHR.nbufferRowLength(address()); }
        /** @return the value of the {@code bufferImageHeight} field. */
        @NativeType("uint32_t")
        public int bufferImageHeight() { return VkCopyMemoryToImageIndirectCommandKHR.nbufferImageHeight(address()); }
        /** @return a {@link VkImageSubresourceLayers} view of the {@code imageSubresource} field. */
        public VkImageSubresourceLayers imageSubresource() { return VkCopyMemoryToImageIndirectCommandKHR.nimageSubresource(address()); }
        /** @return a {@link VkOffset3D} view of the {@code imageOffset} field. */
        public VkOffset3D imageOffset() { return VkCopyMemoryToImageIndirectCommandKHR.nimageOffset(address()); }
        /** @return a {@link VkExtent3D} view of the {@code imageExtent} field. */
        public VkExtent3D imageExtent() { return VkCopyMemoryToImageIndirectCommandKHR.nimageExtent(address()); }

        /** Sets the specified value to the {@code srcAddress} field. */
        public VkCopyMemoryToImageIndirectCommandKHR.Buffer srcAddress(@NativeType("VkDeviceAddress") long value) { VkCopyMemoryToImageIndirectCommandKHR.nsrcAddress(address(), value); return this; }
        /** Sets the specified value to the {@code bufferRowLength} field. */
        public VkCopyMemoryToImageIndirectCommandKHR.Buffer bufferRowLength(@NativeType("uint32_t") int value) { VkCopyMemoryToImageIndirectCommandKHR.nbufferRowLength(address(), value); return this; }
        /** Sets the specified value to the {@code bufferImageHeight} field. */
        public VkCopyMemoryToImageIndirectCommandKHR.Buffer bufferImageHeight(@NativeType("uint32_t") int value) { VkCopyMemoryToImageIndirectCommandKHR.nbufferImageHeight(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@code imageSubresource} field. */
        public VkCopyMemoryToImageIndirectCommandKHR.Buffer imageSubresource(VkImageSubresourceLayers value) { VkCopyMemoryToImageIndirectCommandKHR.nimageSubresource(address(), value); return this; }
        /** Passes the {@code imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkCopyMemoryToImageIndirectCommandKHR.Buffer imageSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(imageSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D} to the {@code imageOffset} field. */
        public VkCopyMemoryToImageIndirectCommandKHR.Buffer imageOffset(VkOffset3D value) { VkCopyMemoryToImageIndirectCommandKHR.nimageOffset(address(), value); return this; }
        /** Passes the {@code imageOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkCopyMemoryToImageIndirectCommandKHR.Buffer imageOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(imageOffset()); return this; }
        /** Copies the specified {@link VkExtent3D} to the {@code imageExtent} field. */
        public VkCopyMemoryToImageIndirectCommandKHR.Buffer imageExtent(VkExtent3D value) { VkCopyMemoryToImageIndirectCommandKHR.nimageExtent(address(), value); return this; }
        /** Passes the {@code imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkCopyMemoryToImageIndirectCommandKHR.Buffer imageExtent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(imageExtent()); return this; }

    }

}