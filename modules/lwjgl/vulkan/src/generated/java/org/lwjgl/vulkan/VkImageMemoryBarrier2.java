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
 * struct VkImageMemoryBarrier2 {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineStageFlags2 srcStageMask;
 *     VkAccessFlags2 srcAccessMask;
 *     VkPipelineStageFlags2 dstStageMask;
 *     VkAccessFlags2 dstAccessMask;
 *     VkImageLayout oldLayout;
 *     VkImageLayout newLayout;
 *     uint32_t srcQueueFamilyIndex;
 *     uint32_t dstQueueFamilyIndex;
 *     VkImage image;
 *     {@link VkImageSubresourceRange VkImageSubresourceRange} subresourceRange;
 * }}</pre>
 */
public class VkImageMemoryBarrier2 extends Struct<VkImageMemoryBarrier2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCSTAGEMASK,
        SRCACCESSMASK,
        DSTSTAGEMASK,
        DSTACCESSMASK,
        OLDLAYOUT,
        NEWLAYOUT,
        SRCQUEUEFAMILYINDEX,
        DSTQUEUEFAMILYINDEX,
        IMAGE,
        SUBRESOURCERANGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(VkImageSubresourceRange.SIZEOF, VkImageSubresourceRange.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSTAGEMASK = layout.offsetof(2);
        SRCACCESSMASK = layout.offsetof(3);
        DSTSTAGEMASK = layout.offsetof(4);
        DSTACCESSMASK = layout.offsetof(5);
        OLDLAYOUT = layout.offsetof(6);
        NEWLAYOUT = layout.offsetof(7);
        SRCQUEUEFAMILYINDEX = layout.offsetof(8);
        DSTQUEUEFAMILYINDEX = layout.offsetof(9);
        IMAGE = layout.offsetof(10);
        SUBRESOURCERANGE = layout.offsetof(11);
    }

    protected VkImageMemoryBarrier2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageMemoryBarrier2 create(long address, @Nullable ByteBuffer container) {
        return new VkImageMemoryBarrier2(address, container);
    }

    /**
     * Creates a {@code VkImageMemoryBarrier2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageMemoryBarrier2(ByteBuffer container) {
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
    /** @return the value of the {@code srcStageMask} field. */
    @NativeType("VkPipelineStageFlags2")
    public long srcStageMask() { return nsrcStageMask(address()); }
    /** @return the value of the {@code srcAccessMask} field. */
    @NativeType("VkAccessFlags2")
    public long srcAccessMask() { return nsrcAccessMask(address()); }
    /** @return the value of the {@code dstStageMask} field. */
    @NativeType("VkPipelineStageFlags2")
    public long dstStageMask() { return ndstStageMask(address()); }
    /** @return the value of the {@code dstAccessMask} field. */
    @NativeType("VkAccessFlags2")
    public long dstAccessMask() { return ndstAccessMask(address()); }
    /** @return the value of the {@code oldLayout} field. */
    @NativeType("VkImageLayout")
    public int oldLayout() { return noldLayout(address()); }
    /** @return the value of the {@code newLayout} field. */
    @NativeType("VkImageLayout")
    public int newLayout() { return nnewLayout(address()); }
    /** @return the value of the {@code srcQueueFamilyIndex} field. */
    @NativeType("uint32_t")
    public int srcQueueFamilyIndex() { return nsrcQueueFamilyIndex(address()); }
    /** @return the value of the {@code dstQueueFamilyIndex} field. */
    @NativeType("uint32_t")
    public int dstQueueFamilyIndex() { return ndstQueueFamilyIndex(address()); }
    /** @return the value of the {@code image} field. */
    @NativeType("VkImage")
    public long image() { return nimage(address()); }
    /** @return a {@link VkImageSubresourceRange} view of the {@code subresourceRange} field. */
    public VkImageSubresourceRange subresourceRange() { return nsubresourceRange(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImageMemoryBarrier2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2 STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2} value to the {@code sType} field. */
    public VkImageMemoryBarrier2 sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImageMemoryBarrier2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkExternalMemoryAcquireUnmodifiedEXT} value to the {@code pNext} chain. */
    public VkImageMemoryBarrier2 pNext(VkExternalMemoryAcquireUnmodifiedEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMemoryBarrierAccessFlags3KHR} value to the {@code pNext} chain. */
    public VkImageMemoryBarrier2 pNext(VkMemoryBarrierAccessFlags3KHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSampleLocationsInfoEXT} value to the {@code pNext} chain. */
    public VkImageMemoryBarrier2 pNext(VkSampleLocationsInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code srcStageMask} field. */
    public VkImageMemoryBarrier2 srcStageMask(@NativeType("VkPipelineStageFlags2") long value) { nsrcStageMask(address(), value); return this; }
    /** Sets the specified value to the {@code srcAccessMask} field. */
    public VkImageMemoryBarrier2 srcAccessMask(@NativeType("VkAccessFlags2") long value) { nsrcAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@code dstStageMask} field. */
    public VkImageMemoryBarrier2 dstStageMask(@NativeType("VkPipelineStageFlags2") long value) { ndstStageMask(address(), value); return this; }
    /** Sets the specified value to the {@code dstAccessMask} field. */
    public VkImageMemoryBarrier2 dstAccessMask(@NativeType("VkAccessFlags2") long value) { ndstAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@code oldLayout} field. */
    public VkImageMemoryBarrier2 oldLayout(@NativeType("VkImageLayout") int value) { noldLayout(address(), value); return this; }
    /** Sets the specified value to the {@code newLayout} field. */
    public VkImageMemoryBarrier2 newLayout(@NativeType("VkImageLayout") int value) { nnewLayout(address(), value); return this; }
    /** Sets the specified value to the {@code srcQueueFamilyIndex} field. */
    public VkImageMemoryBarrier2 srcQueueFamilyIndex(@NativeType("uint32_t") int value) { nsrcQueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@code dstQueueFamilyIndex} field. */
    public VkImageMemoryBarrier2 dstQueueFamilyIndex(@NativeType("uint32_t") int value) { ndstQueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@code image} field. */
    public VkImageMemoryBarrier2 image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
    public VkImageMemoryBarrier2 subresourceRange(VkImageSubresourceRange value) { nsubresourceRange(address(), value); return this; }
    /** Passes the {@code subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageMemoryBarrier2 subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageMemoryBarrier2 set(
        int sType,
        long pNext,
        long srcStageMask,
        long srcAccessMask,
        long dstStageMask,
        long dstAccessMask,
        int oldLayout,
        int newLayout,
        int srcQueueFamilyIndex,
        int dstQueueFamilyIndex,
        long image,
        VkImageSubresourceRange subresourceRange
    ) {
        sType(sType);
        pNext(pNext);
        srcStageMask(srcStageMask);
        srcAccessMask(srcAccessMask);
        dstStageMask(dstStageMask);
        dstAccessMask(dstAccessMask);
        oldLayout(oldLayout);
        newLayout(newLayout);
        srcQueueFamilyIndex(srcQueueFamilyIndex);
        dstQueueFamilyIndex(dstQueueFamilyIndex);
        image(image);
        subresourceRange(subresourceRange);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageMemoryBarrier2 set(VkImageMemoryBarrier2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageMemoryBarrier2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageMemoryBarrier2 malloc() {
        return new VkImageMemoryBarrier2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageMemoryBarrier2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageMemoryBarrier2 calloc() {
        return new VkImageMemoryBarrier2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageMemoryBarrier2} instance allocated with {@link BufferUtils}. */
    public static VkImageMemoryBarrier2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageMemoryBarrier2(memAddress(container), container);
    }

    /** Returns a new {@code VkImageMemoryBarrier2} instance for the specified memory address. */
    public static VkImageMemoryBarrier2 create(long address) {
        return new VkImageMemoryBarrier2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImageMemoryBarrier2 createSafe(long address) {
        return address == NULL ? null : new VkImageMemoryBarrier2(address, null);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageMemoryBarrier2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImageMemoryBarrier2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImageMemoryBarrier2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageMemoryBarrier2 malloc(MemoryStack stack) {
        return new VkImageMemoryBarrier2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageMemoryBarrier2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageMemoryBarrier2 calloc(MemoryStack stack) {
        return new VkImageMemoryBarrier2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImageMemoryBarrier2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageMemoryBarrier2.PNEXT); }
    /** Unsafe version of {@link #srcStageMask}. */
    public static long nsrcStageMask(long struct) { return memGetLong(struct + VkImageMemoryBarrier2.SRCSTAGEMASK); }
    /** Unsafe version of {@link #srcAccessMask}. */
    public static long nsrcAccessMask(long struct) { return memGetLong(struct + VkImageMemoryBarrier2.SRCACCESSMASK); }
    /** Unsafe version of {@link #dstStageMask}. */
    public static long ndstStageMask(long struct) { return memGetLong(struct + VkImageMemoryBarrier2.DSTSTAGEMASK); }
    /** Unsafe version of {@link #dstAccessMask}. */
    public static long ndstAccessMask(long struct) { return memGetLong(struct + VkImageMemoryBarrier2.DSTACCESSMASK); }
    /** Unsafe version of {@link #oldLayout}. */
    public static int noldLayout(long struct) { return memGetInt(struct + VkImageMemoryBarrier2.OLDLAYOUT); }
    /** Unsafe version of {@link #newLayout}. */
    public static int nnewLayout(long struct) { return memGetInt(struct + VkImageMemoryBarrier2.NEWLAYOUT); }
    /** Unsafe version of {@link #srcQueueFamilyIndex}. */
    public static int nsrcQueueFamilyIndex(long struct) { return memGetInt(struct + VkImageMemoryBarrier2.SRCQUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #dstQueueFamilyIndex}. */
    public static int ndstQueueFamilyIndex(long struct) { return memGetInt(struct + VkImageMemoryBarrier2.DSTQUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return memGetLong(struct + VkImageMemoryBarrier2.IMAGE); }
    /** Unsafe version of {@link #subresourceRange}. */
    public static VkImageSubresourceRange nsubresourceRange(long struct) { return VkImageSubresourceRange.create(struct + VkImageMemoryBarrier2.SUBRESOURCERANGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageMemoryBarrier2.PNEXT, value); }
    /** Unsafe version of {@link #srcStageMask(long) srcStageMask}. */
    public static void nsrcStageMask(long struct, long value) { memPutLong(struct + VkImageMemoryBarrier2.SRCSTAGEMASK, value); }
    /** Unsafe version of {@link #srcAccessMask(long) srcAccessMask}. */
    public static void nsrcAccessMask(long struct, long value) { memPutLong(struct + VkImageMemoryBarrier2.SRCACCESSMASK, value); }
    /** Unsafe version of {@link #dstStageMask(long) dstStageMask}. */
    public static void ndstStageMask(long struct, long value) { memPutLong(struct + VkImageMemoryBarrier2.DSTSTAGEMASK, value); }
    /** Unsafe version of {@link #dstAccessMask(long) dstAccessMask}. */
    public static void ndstAccessMask(long struct, long value) { memPutLong(struct + VkImageMemoryBarrier2.DSTACCESSMASK, value); }
    /** Unsafe version of {@link #oldLayout(int) oldLayout}. */
    public static void noldLayout(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier2.OLDLAYOUT, value); }
    /** Unsafe version of {@link #newLayout(int) newLayout}. */
    public static void nnewLayout(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier2.NEWLAYOUT, value); }
    /** Unsafe version of {@link #srcQueueFamilyIndex(int) srcQueueFamilyIndex}. */
    public static void nsrcQueueFamilyIndex(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier2.SRCQUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #dstQueueFamilyIndex(int) dstQueueFamilyIndex}. */
    public static void ndstQueueFamilyIndex(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier2.DSTQUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #image(long) image}. */
    public static void nimage(long struct, long value) { memPutLong(struct + VkImageMemoryBarrier2.IMAGE, value); }
    /** Unsafe version of {@link #subresourceRange(VkImageSubresourceRange) subresourceRange}. */
    public static void nsubresourceRange(long struct, VkImageSubresourceRange value) { memCopy(value.address(), struct + VkImageMemoryBarrier2.SUBRESOURCERANGE, VkImageSubresourceRange.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkImageMemoryBarrier2} structs. */
    public static class Buffer extends StructBuffer<VkImageMemoryBarrier2, Buffer> implements NativeResource {

        private static final VkImageMemoryBarrier2 ELEMENT_FACTORY = VkImageMemoryBarrier2.create(-1L);

        /**
         * Creates a new {@code VkImageMemoryBarrier2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageMemoryBarrier2#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageMemoryBarrier2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageMemoryBarrier2.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageMemoryBarrier2.npNext(address()); }
        /** @return the value of the {@code srcStageMask} field. */
        @NativeType("VkPipelineStageFlags2")
        public long srcStageMask() { return VkImageMemoryBarrier2.nsrcStageMask(address()); }
        /** @return the value of the {@code srcAccessMask} field. */
        @NativeType("VkAccessFlags2")
        public long srcAccessMask() { return VkImageMemoryBarrier2.nsrcAccessMask(address()); }
        /** @return the value of the {@code dstStageMask} field. */
        @NativeType("VkPipelineStageFlags2")
        public long dstStageMask() { return VkImageMemoryBarrier2.ndstStageMask(address()); }
        /** @return the value of the {@code dstAccessMask} field. */
        @NativeType("VkAccessFlags2")
        public long dstAccessMask() { return VkImageMemoryBarrier2.ndstAccessMask(address()); }
        /** @return the value of the {@code oldLayout} field. */
        @NativeType("VkImageLayout")
        public int oldLayout() { return VkImageMemoryBarrier2.noldLayout(address()); }
        /** @return the value of the {@code newLayout} field. */
        @NativeType("VkImageLayout")
        public int newLayout() { return VkImageMemoryBarrier2.nnewLayout(address()); }
        /** @return the value of the {@code srcQueueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int srcQueueFamilyIndex() { return VkImageMemoryBarrier2.nsrcQueueFamilyIndex(address()); }
        /** @return the value of the {@code dstQueueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int dstQueueFamilyIndex() { return VkImageMemoryBarrier2.ndstQueueFamilyIndex(address()); }
        /** @return the value of the {@code image} field. */
        @NativeType("VkImage")
        public long image() { return VkImageMemoryBarrier2.nimage(address()); }
        /** @return a {@link VkImageSubresourceRange} view of the {@code subresourceRange} field. */
        public VkImageSubresourceRange subresourceRange() { return VkImageMemoryBarrier2.nsubresourceRange(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageMemoryBarrier2.Buffer sType(@NativeType("VkStructureType") int value) { VkImageMemoryBarrier2.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2 STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2} value to the {@code sType} field. */
        public VkImageMemoryBarrier2.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImageMemoryBarrier2.Buffer pNext(@NativeType("void const *") long value) { VkImageMemoryBarrier2.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkExternalMemoryAcquireUnmodifiedEXT} value to the {@code pNext} chain. */
        public VkImageMemoryBarrier2.Buffer pNext(VkExternalMemoryAcquireUnmodifiedEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMemoryBarrierAccessFlags3KHR} value to the {@code pNext} chain. */
        public VkImageMemoryBarrier2.Buffer pNext(VkMemoryBarrierAccessFlags3KHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSampleLocationsInfoEXT} value to the {@code pNext} chain. */
        public VkImageMemoryBarrier2.Buffer pNext(VkSampleLocationsInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code srcStageMask} field. */
        public VkImageMemoryBarrier2.Buffer srcStageMask(@NativeType("VkPipelineStageFlags2") long value) { VkImageMemoryBarrier2.nsrcStageMask(address(), value); return this; }
        /** Sets the specified value to the {@code srcAccessMask} field. */
        public VkImageMemoryBarrier2.Buffer srcAccessMask(@NativeType("VkAccessFlags2") long value) { VkImageMemoryBarrier2.nsrcAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@code dstStageMask} field. */
        public VkImageMemoryBarrier2.Buffer dstStageMask(@NativeType("VkPipelineStageFlags2") long value) { VkImageMemoryBarrier2.ndstStageMask(address(), value); return this; }
        /** Sets the specified value to the {@code dstAccessMask} field. */
        public VkImageMemoryBarrier2.Buffer dstAccessMask(@NativeType("VkAccessFlags2") long value) { VkImageMemoryBarrier2.ndstAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@code oldLayout} field. */
        public VkImageMemoryBarrier2.Buffer oldLayout(@NativeType("VkImageLayout") int value) { VkImageMemoryBarrier2.noldLayout(address(), value); return this; }
        /** Sets the specified value to the {@code newLayout} field. */
        public VkImageMemoryBarrier2.Buffer newLayout(@NativeType("VkImageLayout") int value) { VkImageMemoryBarrier2.nnewLayout(address(), value); return this; }
        /** Sets the specified value to the {@code srcQueueFamilyIndex} field. */
        public VkImageMemoryBarrier2.Buffer srcQueueFamilyIndex(@NativeType("uint32_t") int value) { VkImageMemoryBarrier2.nsrcQueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@code dstQueueFamilyIndex} field. */
        public VkImageMemoryBarrier2.Buffer dstQueueFamilyIndex(@NativeType("uint32_t") int value) { VkImageMemoryBarrier2.ndstQueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@code image} field. */
        public VkImageMemoryBarrier2.Buffer image(@NativeType("VkImage") long value) { VkImageMemoryBarrier2.nimage(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
        public VkImageMemoryBarrier2.Buffer subresourceRange(VkImageSubresourceRange value) { VkImageMemoryBarrier2.nsubresourceRange(address(), value); return this; }
        /** Passes the {@code subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageMemoryBarrier2.Buffer subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    }

}