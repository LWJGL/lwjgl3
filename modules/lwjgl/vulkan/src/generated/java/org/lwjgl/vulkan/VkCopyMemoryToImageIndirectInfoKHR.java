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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct VkCopyMemoryToImageIndirectInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkAddressCopyFlagsKHR srcCopyFlags;
 *     uint32_t copyCount;
 *     {@link VkStridedDeviceAddressRangeKHR VkStridedDeviceAddressRangeKHR} copyAddressRange;
 *     VkImage dstImage;
 *     VkImageLayout dstImageLayout;
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} const * pImageSubresources;
 * }</code></pre>
 */
public class VkCopyMemoryToImageIndirectInfoKHR extends Struct<VkCopyMemoryToImageIndirectInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCCOPYFLAGS,
        COPYCOUNT,
        COPYADDRESSRANGE,
        DSTIMAGE,
        DSTIMAGELAYOUT,
        PIMAGESUBRESOURCES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(VkStridedDeviceAddressRangeKHR.SIZEOF, VkStridedDeviceAddressRangeKHR.ALIGNOF),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCCOPYFLAGS = layout.offsetof(2);
        COPYCOUNT = layout.offsetof(3);
        COPYADDRESSRANGE = layout.offsetof(4);
        DSTIMAGE = layout.offsetof(5);
        DSTIMAGELAYOUT = layout.offsetof(6);
        PIMAGESUBRESOURCES = layout.offsetof(7);
    }

    protected VkCopyMemoryToImageIndirectInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyMemoryToImageIndirectInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkCopyMemoryToImageIndirectInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkCopyMemoryToImageIndirectInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyMemoryToImageIndirectInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code srcCopyFlags} field. */
    @NativeType("VkAddressCopyFlagsKHR")
    public int srcCopyFlags() { return nsrcCopyFlags(address()); }
    /** @return the value of the {@code copyCount} field. */
    @NativeType("uint32_t")
    public int copyCount() { return ncopyCount(address()); }
    /** @return a {@link VkStridedDeviceAddressRangeKHR} view of the {@code copyAddressRange} field. */
    public VkStridedDeviceAddressRangeKHR copyAddressRange() { return ncopyAddressRange(address()); }
    /** @return the value of the {@code dstImage} field. */
    @NativeType("VkImage")
    public long dstImage() { return ndstImage(address()); }
    /** @return the value of the {@code dstImageLayout} field. */
    @NativeType("VkImageLayout")
    public int dstImageLayout() { return ndstImageLayout(address()); }
    /** @return a {@link VkImageSubresourceLayers.Buffer} view of the struct array pointed to by the {@code pImageSubresources} field. */
    @NativeType("VkImageSubresourceLayers const *")
    public VkImageSubresourceLayers.Buffer pImageSubresources() { return npImageSubresources(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCopyMemoryToImageIndirectInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRCopyMemoryIndirect#VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INDIRECT_INFO_KHR STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INDIRECT_INFO_KHR} value to the {@code sType} field. */
    public VkCopyMemoryToImageIndirectInfoKHR sType$Default() { return sType(KHRCopyMemoryIndirect.VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INDIRECT_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCopyMemoryToImageIndirectInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code srcCopyFlags} field. */
    public VkCopyMemoryToImageIndirectInfoKHR srcCopyFlags(@NativeType("VkAddressCopyFlagsKHR") int value) { nsrcCopyFlags(address(), value); return this; }
    /** Copies the specified {@link VkStridedDeviceAddressRangeKHR} to the {@code copyAddressRange} field. */
    public VkCopyMemoryToImageIndirectInfoKHR copyAddressRange(VkStridedDeviceAddressRangeKHR value) { ncopyAddressRange(address(), value); return this; }
    /** Passes the {@code copyAddressRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkCopyMemoryToImageIndirectInfoKHR copyAddressRange(java.util.function.Consumer<VkStridedDeviceAddressRangeKHR> consumer) { consumer.accept(copyAddressRange()); return this; }
    /** Sets the specified value to the {@code dstImage} field. */
    public VkCopyMemoryToImageIndirectInfoKHR dstImage(@NativeType("VkImage") long value) { ndstImage(address(), value); return this; }
    /** Sets the specified value to the {@code dstImageLayout} field. */
    public VkCopyMemoryToImageIndirectInfoKHR dstImageLayout(@NativeType("VkImageLayout") int value) { ndstImageLayout(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageSubresourceLayers.Buffer} to the {@code pImageSubresources} field. */
    public VkCopyMemoryToImageIndirectInfoKHR pImageSubresources(@NativeType("VkImageSubresourceLayers const *") VkImageSubresourceLayers.Buffer value) { npImageSubresources(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyMemoryToImageIndirectInfoKHR set(
        int sType,
        long pNext,
        int srcCopyFlags,
        VkStridedDeviceAddressRangeKHR copyAddressRange,
        long dstImage,
        int dstImageLayout,
        VkImageSubresourceLayers.Buffer pImageSubresources
    ) {
        sType(sType);
        pNext(pNext);
        srcCopyFlags(srcCopyFlags);
        copyAddressRange(copyAddressRange);
        dstImage(dstImage);
        dstImageLayout(dstImageLayout);
        pImageSubresources(pImageSubresources);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCopyMemoryToImageIndirectInfoKHR set(VkCopyMemoryToImageIndirectInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyMemoryToImageIndirectInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryToImageIndirectInfoKHR malloc() {
        return new VkCopyMemoryToImageIndirectInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMemoryToImageIndirectInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryToImageIndirectInfoKHR calloc() {
        return new VkCopyMemoryToImageIndirectInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMemoryToImageIndirectInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkCopyMemoryToImageIndirectInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyMemoryToImageIndirectInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyMemoryToImageIndirectInfoKHR} instance for the specified memory address. */
    public static VkCopyMemoryToImageIndirectInfoKHR create(long address) {
        return new VkCopyMemoryToImageIndirectInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCopyMemoryToImageIndirectInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkCopyMemoryToImageIndirectInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageIndirectInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageIndirectInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageIndirectInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageIndirectInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageIndirectInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageIndirectInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyMemoryToImageIndirectInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageIndirectInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCopyMemoryToImageIndirectInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyMemoryToImageIndirectInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryToImageIndirectInfoKHR malloc(MemoryStack stack) {
        return new VkCopyMemoryToImageIndirectInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyMemoryToImageIndirectInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryToImageIndirectInfoKHR calloc(MemoryStack stack) {
        return new VkCopyMemoryToImageIndirectInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageIndirectInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageIndirectInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageIndirectInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageIndirectInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCopyMemoryToImageIndirectInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyMemoryToImageIndirectInfoKHR.PNEXT); }
    /** Unsafe version of {@link #srcCopyFlags}. */
    public static int nsrcCopyFlags(long struct) { return memGetInt(struct + VkCopyMemoryToImageIndirectInfoKHR.SRCCOPYFLAGS); }
    /** Unsafe version of {@link #copyCount}. */
    public static int ncopyCount(long struct) { return memGetInt(struct + VkCopyMemoryToImageIndirectInfoKHR.COPYCOUNT); }
    /** Unsafe version of {@link #copyAddressRange}. */
    public static VkStridedDeviceAddressRangeKHR ncopyAddressRange(long struct) { return VkStridedDeviceAddressRangeKHR.create(struct + VkCopyMemoryToImageIndirectInfoKHR.COPYADDRESSRANGE); }
    /** Unsafe version of {@link #dstImage}. */
    public static long ndstImage(long struct) { return memGetLong(struct + VkCopyMemoryToImageIndirectInfoKHR.DSTIMAGE); }
    /** Unsafe version of {@link #dstImageLayout}. */
    public static int ndstImageLayout(long struct) { return memGetInt(struct + VkCopyMemoryToImageIndirectInfoKHR.DSTIMAGELAYOUT); }
    /** Unsafe version of {@link #pImageSubresources}. */
    public static VkImageSubresourceLayers.Buffer npImageSubresources(long struct) { return VkImageSubresourceLayers.create(memGetAddress(struct + VkCopyMemoryToImageIndirectInfoKHR.PIMAGESUBRESOURCES), ncopyCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCopyMemoryToImageIndirectInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyMemoryToImageIndirectInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #srcCopyFlags(int) srcCopyFlags}. */
    public static void nsrcCopyFlags(long struct, int value) { memPutInt(struct + VkCopyMemoryToImageIndirectInfoKHR.SRCCOPYFLAGS, value); }
    /** Sets the specified value to the {@code copyCount} field of the specified {@code struct}. */
    public static void ncopyCount(long struct, int value) { memPutInt(struct + VkCopyMemoryToImageIndirectInfoKHR.COPYCOUNT, value); }
    /** Unsafe version of {@link #copyAddressRange(VkStridedDeviceAddressRangeKHR) copyAddressRange}. */
    public static void ncopyAddressRange(long struct, VkStridedDeviceAddressRangeKHR value) { memCopy(value.address(), struct + VkCopyMemoryToImageIndirectInfoKHR.COPYADDRESSRANGE, VkStridedDeviceAddressRangeKHR.SIZEOF); }
    /** Unsafe version of {@link #dstImage(long) dstImage}. */
    public static void ndstImage(long struct, long value) { memPutLong(struct + VkCopyMemoryToImageIndirectInfoKHR.DSTIMAGE, value); }
    /** Unsafe version of {@link #dstImageLayout(int) dstImageLayout}. */
    public static void ndstImageLayout(long struct, int value) { memPutInt(struct + VkCopyMemoryToImageIndirectInfoKHR.DSTIMAGELAYOUT, value); }
    /** Unsafe version of {@link #pImageSubresources(VkImageSubresourceLayers.Buffer) pImageSubresources}. */
    public static void npImageSubresources(long struct, VkImageSubresourceLayers.Buffer value) { memPutAddress(struct + VkCopyMemoryToImageIndirectInfoKHR.PIMAGESUBRESOURCES, value.address()); ncopyCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkCopyMemoryToImageIndirectInfoKHR.PIMAGESUBRESOURCES));
    }

    // -----------------------------------

    /** An array of {@link VkCopyMemoryToImageIndirectInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkCopyMemoryToImageIndirectInfoKHR, Buffer> implements NativeResource {

        private static final VkCopyMemoryToImageIndirectInfoKHR ELEMENT_FACTORY = VkCopyMemoryToImageIndirectInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkCopyMemoryToImageIndirectInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyMemoryToImageIndirectInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyMemoryToImageIndirectInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyMemoryToImageIndirectInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyMemoryToImageIndirectInfoKHR.npNext(address()); }
        /** @return the value of the {@code srcCopyFlags} field. */
        @NativeType("VkAddressCopyFlagsKHR")
        public int srcCopyFlags() { return VkCopyMemoryToImageIndirectInfoKHR.nsrcCopyFlags(address()); }
        /** @return the value of the {@code copyCount} field. */
        @NativeType("uint32_t")
        public int copyCount() { return VkCopyMemoryToImageIndirectInfoKHR.ncopyCount(address()); }
        /** @return a {@link VkStridedDeviceAddressRangeKHR} view of the {@code copyAddressRange} field. */
        public VkStridedDeviceAddressRangeKHR copyAddressRange() { return VkCopyMemoryToImageIndirectInfoKHR.ncopyAddressRange(address()); }
        /** @return the value of the {@code dstImage} field. */
        @NativeType("VkImage")
        public long dstImage() { return VkCopyMemoryToImageIndirectInfoKHR.ndstImage(address()); }
        /** @return the value of the {@code dstImageLayout} field. */
        @NativeType("VkImageLayout")
        public int dstImageLayout() { return VkCopyMemoryToImageIndirectInfoKHR.ndstImageLayout(address()); }
        /** @return a {@link VkImageSubresourceLayers.Buffer} view of the struct array pointed to by the {@code pImageSubresources} field. */
        @NativeType("VkImageSubresourceLayers const *")
        public VkImageSubresourceLayers.Buffer pImageSubresources() { return VkCopyMemoryToImageIndirectInfoKHR.npImageSubresources(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCopyMemoryToImageIndirectInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyMemoryToImageIndirectInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRCopyMemoryIndirect#VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INDIRECT_INFO_KHR STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INDIRECT_INFO_KHR} value to the {@code sType} field. */
        public VkCopyMemoryToImageIndirectInfoKHR.Buffer sType$Default() { return sType(KHRCopyMemoryIndirect.VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INDIRECT_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCopyMemoryToImageIndirectInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkCopyMemoryToImageIndirectInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code srcCopyFlags} field. */
        public VkCopyMemoryToImageIndirectInfoKHR.Buffer srcCopyFlags(@NativeType("VkAddressCopyFlagsKHR") int value) { VkCopyMemoryToImageIndirectInfoKHR.nsrcCopyFlags(address(), value); return this; }
        /** Copies the specified {@link VkStridedDeviceAddressRangeKHR} to the {@code copyAddressRange} field. */
        public VkCopyMemoryToImageIndirectInfoKHR.Buffer copyAddressRange(VkStridedDeviceAddressRangeKHR value) { VkCopyMemoryToImageIndirectInfoKHR.ncopyAddressRange(address(), value); return this; }
        /** Passes the {@code copyAddressRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkCopyMemoryToImageIndirectInfoKHR.Buffer copyAddressRange(java.util.function.Consumer<VkStridedDeviceAddressRangeKHR> consumer) { consumer.accept(copyAddressRange()); return this; }
        /** Sets the specified value to the {@code dstImage} field. */
        public VkCopyMemoryToImageIndirectInfoKHR.Buffer dstImage(@NativeType("VkImage") long value) { VkCopyMemoryToImageIndirectInfoKHR.ndstImage(address(), value); return this; }
        /** Sets the specified value to the {@code dstImageLayout} field. */
        public VkCopyMemoryToImageIndirectInfoKHR.Buffer dstImageLayout(@NativeType("VkImageLayout") int value) { VkCopyMemoryToImageIndirectInfoKHR.ndstImageLayout(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageSubresourceLayers.Buffer} to the {@code pImageSubresources} field. */
        public VkCopyMemoryToImageIndirectInfoKHR.Buffer pImageSubresources(@NativeType("VkImageSubresourceLayers const *") VkImageSubresourceLayers.Buffer value) { VkCopyMemoryToImageIndirectInfoKHR.npImageSubresources(address(), value); return this; }

    }

}