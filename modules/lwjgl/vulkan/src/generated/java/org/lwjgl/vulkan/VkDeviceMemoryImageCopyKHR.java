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
 * struct VkDeviceMemoryImageCopyKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkDeviceAddressRangeKHR VkDeviceAddressRangeKHR} addressRange;
 *     VkAddressCommandFlagsKHR addressFlags;
 *     uint32_t addressRowLength;
 *     uint32_t addressImageHeight;
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} imageSubresource;
 *     VkImageLayout imageLayout;
 *     {@link VkOffset3D VkOffset3D} imageOffset;
 *     {@link VkExtent3D VkExtent3D} imageExtent;
 * }</code></pre>
 */
public class VkDeviceMemoryImageCopyKHR extends Struct<VkDeviceMemoryImageCopyKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ADDRESSRANGE,
        ADDRESSFLAGS,
        ADDRESSROWLENGTH,
        ADDRESSIMAGEHEIGHT,
        IMAGESUBRESOURCE,
        IMAGELAYOUT,
        IMAGEOFFSET,
        IMAGEEXTENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkDeviceAddressRangeKHR.SIZEOF, VkDeviceAddressRangeKHR.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF),
            __member(4),
            __member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF),
            __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ADDRESSRANGE = layout.offsetof(2);
        ADDRESSFLAGS = layout.offsetof(3);
        ADDRESSROWLENGTH = layout.offsetof(4);
        ADDRESSIMAGEHEIGHT = layout.offsetof(5);
        IMAGESUBRESOURCE = layout.offsetof(6);
        IMAGELAYOUT = layout.offsetof(7);
        IMAGEOFFSET = layout.offsetof(8);
        IMAGEEXTENT = layout.offsetof(9);
    }

    protected VkDeviceMemoryImageCopyKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceMemoryImageCopyKHR create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceMemoryImageCopyKHR(address, container);
    }

    /**
     * Creates a {@code VkDeviceMemoryImageCopyKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceMemoryImageCopyKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return a {@link VkDeviceAddressRangeKHR} view of the {@code addressRange} field. */
    public VkDeviceAddressRangeKHR addressRange() { return naddressRange(address()); }
    /** @return the value of the {@code addressFlags} field. */
    @NativeType("VkAddressCommandFlagsKHR")
    public int addressFlags() { return naddressFlags(address()); }
    /** @return the value of the {@code addressRowLength} field. */
    @NativeType("uint32_t")
    public int addressRowLength() { return naddressRowLength(address()); }
    /** @return the value of the {@code addressImageHeight} field. */
    @NativeType("uint32_t")
    public int addressImageHeight() { return naddressImageHeight(address()); }
    /** @return a {@link VkImageSubresourceLayers} view of the {@code imageSubresource} field. */
    public VkImageSubresourceLayers imageSubresource() { return nimageSubresource(address()); }
    /** @return the value of the {@code imageLayout} field. */
    @NativeType("VkImageLayout")
    public int imageLayout() { return nimageLayout(address()); }
    /** @return a {@link VkOffset3D} view of the {@code imageOffset} field. */
    public VkOffset3D imageOffset() { return nimageOffset(address()); }
    /** @return a {@link VkExtent3D} view of the {@code imageExtent} field. */
    public VkExtent3D imageExtent() { return nimageExtent(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceMemoryImageCopyKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDeviceAddressCommands#VK_STRUCTURE_TYPE_DEVICE_MEMORY_IMAGE_COPY_KHR STRUCTURE_TYPE_DEVICE_MEMORY_IMAGE_COPY_KHR} value to the {@code sType} field. */
    public VkDeviceMemoryImageCopyKHR sType$Default() { return sType(KHRDeviceAddressCommands.VK_STRUCTURE_TYPE_DEVICE_MEMORY_IMAGE_COPY_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceMemoryImageCopyKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkCopyCommandTransformInfoQCOM} value to the {@code pNext} chain. */
    public VkDeviceMemoryImageCopyKHR pNext(VkCopyCommandTransformInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Copies the specified {@link VkDeviceAddressRangeKHR} to the {@code addressRange} field. */
    public VkDeviceMemoryImageCopyKHR addressRange(VkDeviceAddressRangeKHR value) { naddressRange(address(), value); return this; }
    /** Passes the {@code addressRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDeviceMemoryImageCopyKHR addressRange(java.util.function.Consumer<VkDeviceAddressRangeKHR> consumer) { consumer.accept(addressRange()); return this; }
    /** Sets the specified value to the {@code addressFlags} field. */
    public VkDeviceMemoryImageCopyKHR addressFlags(@NativeType("VkAddressCommandFlagsKHR") int value) { naddressFlags(address(), value); return this; }
    /** Sets the specified value to the {@code addressRowLength} field. */
    public VkDeviceMemoryImageCopyKHR addressRowLength(@NativeType("uint32_t") int value) { naddressRowLength(address(), value); return this; }
    /** Sets the specified value to the {@code addressImageHeight} field. */
    public VkDeviceMemoryImageCopyKHR addressImageHeight(@NativeType("uint32_t") int value) { naddressImageHeight(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@code imageSubresource} field. */
    public VkDeviceMemoryImageCopyKHR imageSubresource(VkImageSubresourceLayers value) { nimageSubresource(address(), value); return this; }
    /** Passes the {@code imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDeviceMemoryImageCopyKHR imageSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(imageSubresource()); return this; }
    /** Sets the specified value to the {@code imageLayout} field. */
    public VkDeviceMemoryImageCopyKHR imageLayout(@NativeType("VkImageLayout") int value) { nimageLayout(address(), value); return this; }
    /** Copies the specified {@link VkOffset3D} to the {@code imageOffset} field. */
    public VkDeviceMemoryImageCopyKHR imageOffset(VkOffset3D value) { nimageOffset(address(), value); return this; }
    /** Passes the {@code imageOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDeviceMemoryImageCopyKHR imageOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(imageOffset()); return this; }
    /** Copies the specified {@link VkExtent3D} to the {@code imageExtent} field. */
    public VkDeviceMemoryImageCopyKHR imageExtent(VkExtent3D value) { nimageExtent(address(), value); return this; }
    /** Passes the {@code imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDeviceMemoryImageCopyKHR imageExtent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(imageExtent()); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceMemoryImageCopyKHR set(
        int sType,
        long pNext,
        VkDeviceAddressRangeKHR addressRange,
        int addressFlags,
        int addressRowLength,
        int addressImageHeight,
        VkImageSubresourceLayers imageSubresource,
        int imageLayout,
        VkOffset3D imageOffset,
        VkExtent3D imageExtent
    ) {
        sType(sType);
        pNext(pNext);
        addressRange(addressRange);
        addressFlags(addressFlags);
        addressRowLength(addressRowLength);
        addressImageHeight(addressImageHeight);
        imageSubresource(imageSubresource);
        imageLayout(imageLayout);
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
    public VkDeviceMemoryImageCopyKHR set(VkDeviceMemoryImageCopyKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceMemoryImageCopyKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceMemoryImageCopyKHR malloc() {
        return new VkDeviceMemoryImageCopyKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceMemoryImageCopyKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceMemoryImageCopyKHR calloc() {
        return new VkDeviceMemoryImageCopyKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceMemoryImageCopyKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceMemoryImageCopyKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceMemoryImageCopyKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceMemoryImageCopyKHR} instance for the specified memory address. */
    public static VkDeviceMemoryImageCopyKHR create(long address) {
        return new VkDeviceMemoryImageCopyKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceMemoryImageCopyKHR createSafe(long address) {
        return address == NULL ? null : new VkDeviceMemoryImageCopyKHR(address, null);
    }

    /**
     * Returns a new {@link VkDeviceMemoryImageCopyKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryImageCopyKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceMemoryImageCopyKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryImageCopyKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceMemoryImageCopyKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryImageCopyKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceMemoryImageCopyKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryImageCopyKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceMemoryImageCopyKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceMemoryImageCopyKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceMemoryImageCopyKHR malloc(MemoryStack stack) {
        return new VkDeviceMemoryImageCopyKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceMemoryImageCopyKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceMemoryImageCopyKHR calloc(MemoryStack stack) {
        return new VkDeviceMemoryImageCopyKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceMemoryImageCopyKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryImageCopyKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceMemoryImageCopyKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryImageCopyKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceMemoryImageCopyKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceMemoryImageCopyKHR.PNEXT); }
    /** Unsafe version of {@link #addressRange}. */
    public static VkDeviceAddressRangeKHR naddressRange(long struct) { return VkDeviceAddressRangeKHR.create(struct + VkDeviceMemoryImageCopyKHR.ADDRESSRANGE); }
    /** Unsafe version of {@link #addressFlags}. */
    public static int naddressFlags(long struct) { return memGetInt(struct + VkDeviceMemoryImageCopyKHR.ADDRESSFLAGS); }
    /** Unsafe version of {@link #addressRowLength}. */
    public static int naddressRowLength(long struct) { return memGetInt(struct + VkDeviceMemoryImageCopyKHR.ADDRESSROWLENGTH); }
    /** Unsafe version of {@link #addressImageHeight}. */
    public static int naddressImageHeight(long struct) { return memGetInt(struct + VkDeviceMemoryImageCopyKHR.ADDRESSIMAGEHEIGHT); }
    /** Unsafe version of {@link #imageSubresource}. */
    public static VkImageSubresourceLayers nimageSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkDeviceMemoryImageCopyKHR.IMAGESUBRESOURCE); }
    /** Unsafe version of {@link #imageLayout}. */
    public static int nimageLayout(long struct) { return memGetInt(struct + VkDeviceMemoryImageCopyKHR.IMAGELAYOUT); }
    /** Unsafe version of {@link #imageOffset}. */
    public static VkOffset3D nimageOffset(long struct) { return VkOffset3D.create(struct + VkDeviceMemoryImageCopyKHR.IMAGEOFFSET); }
    /** Unsafe version of {@link #imageExtent}. */
    public static VkExtent3D nimageExtent(long struct) { return VkExtent3D.create(struct + VkDeviceMemoryImageCopyKHR.IMAGEEXTENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceMemoryImageCopyKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceMemoryImageCopyKHR.PNEXT, value); }
    /** Unsafe version of {@link #addressRange(VkDeviceAddressRangeKHR) addressRange}. */
    public static void naddressRange(long struct, VkDeviceAddressRangeKHR value) { memCopy(value.address(), struct + VkDeviceMemoryImageCopyKHR.ADDRESSRANGE, VkDeviceAddressRangeKHR.SIZEOF); }
    /** Unsafe version of {@link #addressFlags(int) addressFlags}. */
    public static void naddressFlags(long struct, int value) { memPutInt(struct + VkDeviceMemoryImageCopyKHR.ADDRESSFLAGS, value); }
    /** Unsafe version of {@link #addressRowLength(int) addressRowLength}. */
    public static void naddressRowLength(long struct, int value) { memPutInt(struct + VkDeviceMemoryImageCopyKHR.ADDRESSROWLENGTH, value); }
    /** Unsafe version of {@link #addressImageHeight(int) addressImageHeight}. */
    public static void naddressImageHeight(long struct, int value) { memPutInt(struct + VkDeviceMemoryImageCopyKHR.ADDRESSIMAGEHEIGHT, value); }
    /** Unsafe version of {@link #imageSubresource(VkImageSubresourceLayers) imageSubresource}. */
    public static void nimageSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkDeviceMemoryImageCopyKHR.IMAGESUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
    /** Unsafe version of {@link #imageLayout(int) imageLayout}. */
    public static void nimageLayout(long struct, int value) { memPutInt(struct + VkDeviceMemoryImageCopyKHR.IMAGELAYOUT, value); }
    /** Unsafe version of {@link #imageOffset(VkOffset3D) imageOffset}. */
    public static void nimageOffset(long struct, VkOffset3D value) { memCopy(value.address(), struct + VkDeviceMemoryImageCopyKHR.IMAGEOFFSET, VkOffset3D.SIZEOF); }
    /** Unsafe version of {@link #imageExtent(VkExtent3D) imageExtent}. */
    public static void nimageExtent(long struct, VkExtent3D value) { memCopy(value.address(), struct + VkDeviceMemoryImageCopyKHR.IMAGEEXTENT, VkExtent3D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkDeviceMemoryImageCopyKHR} structs. */
    public static class Buffer extends StructBuffer<VkDeviceMemoryImageCopyKHR, Buffer> implements NativeResource {

        private static final VkDeviceMemoryImageCopyKHR ELEMENT_FACTORY = VkDeviceMemoryImageCopyKHR.create(-1L);

        /**
         * Creates a new {@code VkDeviceMemoryImageCopyKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceMemoryImageCopyKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceMemoryImageCopyKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceMemoryImageCopyKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceMemoryImageCopyKHR.npNext(address()); }
        /** @return a {@link VkDeviceAddressRangeKHR} view of the {@code addressRange} field. */
        public VkDeviceAddressRangeKHR addressRange() { return VkDeviceMemoryImageCopyKHR.naddressRange(address()); }
        /** @return the value of the {@code addressFlags} field. */
        @NativeType("VkAddressCommandFlagsKHR")
        public int addressFlags() { return VkDeviceMemoryImageCopyKHR.naddressFlags(address()); }
        /** @return the value of the {@code addressRowLength} field. */
        @NativeType("uint32_t")
        public int addressRowLength() { return VkDeviceMemoryImageCopyKHR.naddressRowLength(address()); }
        /** @return the value of the {@code addressImageHeight} field. */
        @NativeType("uint32_t")
        public int addressImageHeight() { return VkDeviceMemoryImageCopyKHR.naddressImageHeight(address()); }
        /** @return a {@link VkImageSubresourceLayers} view of the {@code imageSubresource} field. */
        public VkImageSubresourceLayers imageSubresource() { return VkDeviceMemoryImageCopyKHR.nimageSubresource(address()); }
        /** @return the value of the {@code imageLayout} field. */
        @NativeType("VkImageLayout")
        public int imageLayout() { return VkDeviceMemoryImageCopyKHR.nimageLayout(address()); }
        /** @return a {@link VkOffset3D} view of the {@code imageOffset} field. */
        public VkOffset3D imageOffset() { return VkDeviceMemoryImageCopyKHR.nimageOffset(address()); }
        /** @return a {@link VkExtent3D} view of the {@code imageExtent} field. */
        public VkExtent3D imageExtent() { return VkDeviceMemoryImageCopyKHR.nimageExtent(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceMemoryImageCopyKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceMemoryImageCopyKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRDeviceAddressCommands#VK_STRUCTURE_TYPE_DEVICE_MEMORY_IMAGE_COPY_KHR STRUCTURE_TYPE_DEVICE_MEMORY_IMAGE_COPY_KHR} value to the {@code sType} field. */
        public VkDeviceMemoryImageCopyKHR.Buffer sType$Default() { return sType(KHRDeviceAddressCommands.VK_STRUCTURE_TYPE_DEVICE_MEMORY_IMAGE_COPY_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceMemoryImageCopyKHR.Buffer pNext(@NativeType("void const *") long value) { VkDeviceMemoryImageCopyKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkCopyCommandTransformInfoQCOM} value to the {@code pNext} chain. */
        public VkDeviceMemoryImageCopyKHR.Buffer pNext(VkCopyCommandTransformInfoQCOM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Copies the specified {@link VkDeviceAddressRangeKHR} to the {@code addressRange} field. */
        public VkDeviceMemoryImageCopyKHR.Buffer addressRange(VkDeviceAddressRangeKHR value) { VkDeviceMemoryImageCopyKHR.naddressRange(address(), value); return this; }
        /** Passes the {@code addressRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDeviceMemoryImageCopyKHR.Buffer addressRange(java.util.function.Consumer<VkDeviceAddressRangeKHR> consumer) { consumer.accept(addressRange()); return this; }
        /** Sets the specified value to the {@code addressFlags} field. */
        public VkDeviceMemoryImageCopyKHR.Buffer addressFlags(@NativeType("VkAddressCommandFlagsKHR") int value) { VkDeviceMemoryImageCopyKHR.naddressFlags(address(), value); return this; }
        /** Sets the specified value to the {@code addressRowLength} field. */
        public VkDeviceMemoryImageCopyKHR.Buffer addressRowLength(@NativeType("uint32_t") int value) { VkDeviceMemoryImageCopyKHR.naddressRowLength(address(), value); return this; }
        /** Sets the specified value to the {@code addressImageHeight} field. */
        public VkDeviceMemoryImageCopyKHR.Buffer addressImageHeight(@NativeType("uint32_t") int value) { VkDeviceMemoryImageCopyKHR.naddressImageHeight(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@code imageSubresource} field. */
        public VkDeviceMemoryImageCopyKHR.Buffer imageSubresource(VkImageSubresourceLayers value) { VkDeviceMemoryImageCopyKHR.nimageSubresource(address(), value); return this; }
        /** Passes the {@code imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDeviceMemoryImageCopyKHR.Buffer imageSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(imageSubresource()); return this; }
        /** Sets the specified value to the {@code imageLayout} field. */
        public VkDeviceMemoryImageCopyKHR.Buffer imageLayout(@NativeType("VkImageLayout") int value) { VkDeviceMemoryImageCopyKHR.nimageLayout(address(), value); return this; }
        /** Copies the specified {@link VkOffset3D} to the {@code imageOffset} field. */
        public VkDeviceMemoryImageCopyKHR.Buffer imageOffset(VkOffset3D value) { VkDeviceMemoryImageCopyKHR.nimageOffset(address(), value); return this; }
        /** Passes the {@code imageOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDeviceMemoryImageCopyKHR.Buffer imageOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(imageOffset()); return this; }
        /** Copies the specified {@link VkExtent3D} to the {@code imageExtent} field. */
        public VkDeviceMemoryImageCopyKHR.Buffer imageExtent(VkExtent3D value) { VkDeviceMemoryImageCopyKHR.nimageExtent(address(), value); return this; }
        /** Passes the {@code imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDeviceMemoryImageCopyKHR.Buffer imageExtent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(imageExtent()); return this; }

    }

}