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
 * struct VkImageMemoryBarrier {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkAccessFlags srcAccessMask;
 *     VkAccessFlags dstAccessMask;
 *     VkImageLayout oldLayout;
 *     VkImageLayout newLayout;
 *     uint32_t srcQueueFamilyIndex;
 *     uint32_t dstQueueFamilyIndex;
 *     VkImage image;
 *     {@link VkImageSubresourceRange VkImageSubresourceRange} subresourceRange;
 * }</code></pre>
 */
public class VkImageMemoryBarrier extends Struct<VkImageMemoryBarrier> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCACCESSMASK,
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
            __member(4),
            __member(4),
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
        SRCACCESSMASK = layout.offsetof(2);
        DSTACCESSMASK = layout.offsetof(3);
        OLDLAYOUT = layout.offsetof(4);
        NEWLAYOUT = layout.offsetof(5);
        SRCQUEUEFAMILYINDEX = layout.offsetof(6);
        DSTQUEUEFAMILYINDEX = layout.offsetof(7);
        IMAGE = layout.offsetof(8);
        SUBRESOURCERANGE = layout.offsetof(9);
    }

    protected VkImageMemoryBarrier(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageMemoryBarrier create(long address, @Nullable ByteBuffer container) {
        return new VkImageMemoryBarrier(address, container);
    }

    /**
     * Creates a {@code VkImageMemoryBarrier} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageMemoryBarrier(ByteBuffer container) {
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
    /** @return the value of the {@code srcAccessMask} field. */
    @NativeType("VkAccessFlags")
    public int srcAccessMask() { return nsrcAccessMask(address()); }
    /** @return the value of the {@code dstAccessMask} field. */
    @NativeType("VkAccessFlags")
    public int dstAccessMask() { return ndstAccessMask(address()); }
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
    public VkImageMemoryBarrier sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER} value to the {@code sType} field. */
    public VkImageMemoryBarrier sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImageMemoryBarrier pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkExternalMemoryAcquireUnmodifiedEXT} value to the {@code pNext} chain. */
    public VkImageMemoryBarrier pNext(VkExternalMemoryAcquireUnmodifiedEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSampleLocationsInfoEXT} value to the {@code pNext} chain. */
    public VkImageMemoryBarrier pNext(VkSampleLocationsInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code srcAccessMask} field. */
    public VkImageMemoryBarrier srcAccessMask(@NativeType("VkAccessFlags") int value) { nsrcAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@code dstAccessMask} field. */
    public VkImageMemoryBarrier dstAccessMask(@NativeType("VkAccessFlags") int value) { ndstAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@code oldLayout} field. */
    public VkImageMemoryBarrier oldLayout(@NativeType("VkImageLayout") int value) { noldLayout(address(), value); return this; }
    /** Sets the specified value to the {@code newLayout} field. */
    public VkImageMemoryBarrier newLayout(@NativeType("VkImageLayout") int value) { nnewLayout(address(), value); return this; }
    /** Sets the specified value to the {@code srcQueueFamilyIndex} field. */
    public VkImageMemoryBarrier srcQueueFamilyIndex(@NativeType("uint32_t") int value) { nsrcQueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@code dstQueueFamilyIndex} field. */
    public VkImageMemoryBarrier dstQueueFamilyIndex(@NativeType("uint32_t") int value) { ndstQueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@code image} field. */
    public VkImageMemoryBarrier image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
    public VkImageMemoryBarrier subresourceRange(VkImageSubresourceRange value) { nsubresourceRange(address(), value); return this; }
    /** Passes the {@code subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageMemoryBarrier subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageMemoryBarrier set(
        int sType,
        long pNext,
        int srcAccessMask,
        int dstAccessMask,
        int oldLayout,
        int newLayout,
        int srcQueueFamilyIndex,
        int dstQueueFamilyIndex,
        long image,
        VkImageSubresourceRange subresourceRange
    ) {
        sType(sType);
        pNext(pNext);
        srcAccessMask(srcAccessMask);
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
    public VkImageMemoryBarrier set(VkImageMemoryBarrier src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageMemoryBarrier} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageMemoryBarrier malloc() {
        return new VkImageMemoryBarrier(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageMemoryBarrier} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageMemoryBarrier calloc() {
        return new VkImageMemoryBarrier(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageMemoryBarrier} instance allocated with {@link BufferUtils}. */
    public static VkImageMemoryBarrier create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageMemoryBarrier(memAddress(container), container);
    }

    /** Returns a new {@code VkImageMemoryBarrier} instance for the specified memory address. */
    public static VkImageMemoryBarrier create(long address) {
        return new VkImageMemoryBarrier(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImageMemoryBarrier createSafe(long address) {
        return address == NULL ? null : new VkImageMemoryBarrier(address, null);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageMemoryBarrier.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImageMemoryBarrier.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryBarrier mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryBarrier callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryBarrier mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryBarrier callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryBarrier.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryBarrier.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryBarrier.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryBarrier.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImageMemoryBarrier} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageMemoryBarrier malloc(MemoryStack stack) {
        return new VkImageMemoryBarrier(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageMemoryBarrier} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageMemoryBarrier calloc(MemoryStack stack) {
        return new VkImageMemoryBarrier(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImageMemoryBarrier.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageMemoryBarrier.PNEXT); }
    /** Unsafe version of {@link #srcAccessMask}. */
    public static int nsrcAccessMask(long struct) { return memGetInt(struct + VkImageMemoryBarrier.SRCACCESSMASK); }
    /** Unsafe version of {@link #dstAccessMask}. */
    public static int ndstAccessMask(long struct) { return memGetInt(struct + VkImageMemoryBarrier.DSTACCESSMASK); }
    /** Unsafe version of {@link #oldLayout}. */
    public static int noldLayout(long struct) { return memGetInt(struct + VkImageMemoryBarrier.OLDLAYOUT); }
    /** Unsafe version of {@link #newLayout}. */
    public static int nnewLayout(long struct) { return memGetInt(struct + VkImageMemoryBarrier.NEWLAYOUT); }
    /** Unsafe version of {@link #srcQueueFamilyIndex}. */
    public static int nsrcQueueFamilyIndex(long struct) { return memGetInt(struct + VkImageMemoryBarrier.SRCQUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #dstQueueFamilyIndex}. */
    public static int ndstQueueFamilyIndex(long struct) { return memGetInt(struct + VkImageMemoryBarrier.DSTQUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return memGetLong(struct + VkImageMemoryBarrier.IMAGE); }
    /** Unsafe version of {@link #subresourceRange}. */
    public static VkImageSubresourceRange nsubresourceRange(long struct) { return VkImageSubresourceRange.create(struct + VkImageMemoryBarrier.SUBRESOURCERANGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageMemoryBarrier.PNEXT, value); }
    /** Unsafe version of {@link #srcAccessMask(int) srcAccessMask}. */
    public static void nsrcAccessMask(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier.SRCACCESSMASK, value); }
    /** Unsafe version of {@link #dstAccessMask(int) dstAccessMask}. */
    public static void ndstAccessMask(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier.DSTACCESSMASK, value); }
    /** Unsafe version of {@link #oldLayout(int) oldLayout}. */
    public static void noldLayout(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier.OLDLAYOUT, value); }
    /** Unsafe version of {@link #newLayout(int) newLayout}. */
    public static void nnewLayout(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier.NEWLAYOUT, value); }
    /** Unsafe version of {@link #srcQueueFamilyIndex(int) srcQueueFamilyIndex}. */
    public static void nsrcQueueFamilyIndex(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier.SRCQUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #dstQueueFamilyIndex(int) dstQueueFamilyIndex}. */
    public static void ndstQueueFamilyIndex(long struct, int value) { memPutInt(struct + VkImageMemoryBarrier.DSTQUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #image(long) image}. */
    public static void nimage(long struct, long value) { memPutLong(struct + VkImageMemoryBarrier.IMAGE, value); }
    /** Unsafe version of {@link #subresourceRange(VkImageSubresourceRange) subresourceRange}. */
    public static void nsubresourceRange(long struct, VkImageSubresourceRange value) { memCopy(value.address(), struct + VkImageMemoryBarrier.SUBRESOURCERANGE, VkImageSubresourceRange.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkImageMemoryBarrier} structs. */
    public static class Buffer extends StructBuffer<VkImageMemoryBarrier, Buffer> implements NativeResource {

        private static final VkImageMemoryBarrier ELEMENT_FACTORY = VkImageMemoryBarrier.create(-1L);

        /**
         * Creates a new {@code VkImageMemoryBarrier.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageMemoryBarrier#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageMemoryBarrier getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageMemoryBarrier.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageMemoryBarrier.npNext(address()); }
        /** @return the value of the {@code srcAccessMask} field. */
        @NativeType("VkAccessFlags")
        public int srcAccessMask() { return VkImageMemoryBarrier.nsrcAccessMask(address()); }
        /** @return the value of the {@code dstAccessMask} field. */
        @NativeType("VkAccessFlags")
        public int dstAccessMask() { return VkImageMemoryBarrier.ndstAccessMask(address()); }
        /** @return the value of the {@code oldLayout} field. */
        @NativeType("VkImageLayout")
        public int oldLayout() { return VkImageMemoryBarrier.noldLayout(address()); }
        /** @return the value of the {@code newLayout} field. */
        @NativeType("VkImageLayout")
        public int newLayout() { return VkImageMemoryBarrier.nnewLayout(address()); }
        /** @return the value of the {@code srcQueueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int srcQueueFamilyIndex() { return VkImageMemoryBarrier.nsrcQueueFamilyIndex(address()); }
        /** @return the value of the {@code dstQueueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int dstQueueFamilyIndex() { return VkImageMemoryBarrier.ndstQueueFamilyIndex(address()); }
        /** @return the value of the {@code image} field. */
        @NativeType("VkImage")
        public long image() { return VkImageMemoryBarrier.nimage(address()); }
        /** @return a {@link VkImageSubresourceRange} view of the {@code subresourceRange} field. */
        public VkImageSubresourceRange subresourceRange() { return VkImageMemoryBarrier.nsubresourceRange(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageMemoryBarrier.Buffer sType(@NativeType("VkStructureType") int value) { VkImageMemoryBarrier.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER} value to the {@code sType} field. */
        public VkImageMemoryBarrier.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImageMemoryBarrier.Buffer pNext(@NativeType("void const *") long value) { VkImageMemoryBarrier.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkExternalMemoryAcquireUnmodifiedEXT} value to the {@code pNext} chain. */
        public VkImageMemoryBarrier.Buffer pNext(VkExternalMemoryAcquireUnmodifiedEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSampleLocationsInfoEXT} value to the {@code pNext} chain. */
        public VkImageMemoryBarrier.Buffer pNext(VkSampleLocationsInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code srcAccessMask} field. */
        public VkImageMemoryBarrier.Buffer srcAccessMask(@NativeType("VkAccessFlags") int value) { VkImageMemoryBarrier.nsrcAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@code dstAccessMask} field. */
        public VkImageMemoryBarrier.Buffer dstAccessMask(@NativeType("VkAccessFlags") int value) { VkImageMemoryBarrier.ndstAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@code oldLayout} field. */
        public VkImageMemoryBarrier.Buffer oldLayout(@NativeType("VkImageLayout") int value) { VkImageMemoryBarrier.noldLayout(address(), value); return this; }
        /** Sets the specified value to the {@code newLayout} field. */
        public VkImageMemoryBarrier.Buffer newLayout(@NativeType("VkImageLayout") int value) { VkImageMemoryBarrier.nnewLayout(address(), value); return this; }
        /** Sets the specified value to the {@code srcQueueFamilyIndex} field. */
        public VkImageMemoryBarrier.Buffer srcQueueFamilyIndex(@NativeType("uint32_t") int value) { VkImageMemoryBarrier.nsrcQueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@code dstQueueFamilyIndex} field. */
        public VkImageMemoryBarrier.Buffer dstQueueFamilyIndex(@NativeType("uint32_t") int value) { VkImageMemoryBarrier.ndstQueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@code image} field. */
        public VkImageMemoryBarrier.Buffer image(@NativeType("VkImage") long value) { VkImageMemoryBarrier.nimage(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
        public VkImageMemoryBarrier.Buffer subresourceRange(VkImageSubresourceRange value) { VkImageMemoryBarrier.nsubresourceRange(address(), value); return this; }
        /** Passes the {@code subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageMemoryBarrier.Buffer subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    }

}