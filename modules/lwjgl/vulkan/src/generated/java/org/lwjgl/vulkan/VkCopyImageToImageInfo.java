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
 * <pre>{@code
 * struct VkCopyImageToImageInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkHostImageCopyFlags flags;
 *     VkImage srcImage;
 *     VkImageLayout srcImageLayout;
 *     VkImage dstImage;
 *     VkImageLayout dstImageLayout;
 *     uint32_t regionCount;
 *     {@link VkImageCopy2 VkImageCopy2} const * pRegions;
 * }}</pre>
 */
public class VkCopyImageToImageInfo extends Struct<VkCopyImageToImageInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        SRCIMAGE,
        SRCIMAGELAYOUT,
        DSTIMAGE,
        DSTIMAGELAYOUT,
        REGIONCOUNT,
        PREGIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SRCIMAGE = layout.offsetof(3);
        SRCIMAGELAYOUT = layout.offsetof(4);
        DSTIMAGE = layout.offsetof(5);
        DSTIMAGELAYOUT = layout.offsetof(6);
        REGIONCOUNT = layout.offsetof(7);
        PREGIONS = layout.offsetof(8);
    }

    protected VkCopyImageToImageInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyImageToImageInfo create(long address, @Nullable ByteBuffer container) {
        return new VkCopyImageToImageInfo(address, container);
    }

    /**
     * Creates a {@code VkCopyImageToImageInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyImageToImageInfo(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkHostImageCopyFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code srcImage} field. */
    @NativeType("VkImage")
    public long srcImage() { return nsrcImage(address()); }
    /** @return the value of the {@code srcImageLayout} field. */
    @NativeType("VkImageLayout")
    public int srcImageLayout() { return nsrcImageLayout(address()); }
    /** @return the value of the {@code dstImage} field. */
    @NativeType("VkImage")
    public long dstImage() { return ndstImage(address()); }
    /** @return the value of the {@code dstImageLayout} field. */
    @NativeType("VkImageLayout")
    public int dstImageLayout() { return ndstImageLayout(address()); }
    /** @return the value of the {@code regionCount} field. */
    @NativeType("uint32_t")
    public int regionCount() { return nregionCount(address()); }
    /** @return a {@link VkImageCopy2.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
    @NativeType("VkImageCopy2 const *")
    public VkImageCopy2.Buffer pRegions() { return npRegions(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCopyImageToImageInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO} value to the {@code sType} field. */
    public VkCopyImageToImageInfo sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCopyImageToImageInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkCopyImageToImageInfo flags(@NativeType("VkHostImageCopyFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code srcImage} field. */
    public VkCopyImageToImageInfo srcImage(@NativeType("VkImage") long value) { nsrcImage(address(), value); return this; }
    /** Sets the specified value to the {@code srcImageLayout} field. */
    public VkCopyImageToImageInfo srcImageLayout(@NativeType("VkImageLayout") int value) { nsrcImageLayout(address(), value); return this; }
    /** Sets the specified value to the {@code dstImage} field. */
    public VkCopyImageToImageInfo dstImage(@NativeType("VkImage") long value) { ndstImage(address(), value); return this; }
    /** Sets the specified value to the {@code dstImageLayout} field. */
    public VkCopyImageToImageInfo dstImageLayout(@NativeType("VkImageLayout") int value) { ndstImageLayout(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageCopy2.Buffer} to the {@code pRegions} field. */
    public VkCopyImageToImageInfo pRegions(@NativeType("VkImageCopy2 const *") VkImageCopy2.Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyImageToImageInfo set(
        int sType,
        long pNext,
        int flags,
        long srcImage,
        int srcImageLayout,
        long dstImage,
        int dstImageLayout,
        VkImageCopy2.Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        srcImage(srcImage);
        srcImageLayout(srcImageLayout);
        dstImage(dstImage);
        dstImageLayout(dstImageLayout);
        pRegions(pRegions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCopyImageToImageInfo set(VkCopyImageToImageInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyImageToImageInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyImageToImageInfo malloc() {
        return new VkCopyImageToImageInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyImageToImageInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyImageToImageInfo calloc() {
        return new VkCopyImageToImageInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyImageToImageInfo} instance allocated with {@link BufferUtils}. */
    public static VkCopyImageToImageInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyImageToImageInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyImageToImageInfo} instance for the specified memory address. */
    public static VkCopyImageToImageInfo create(long address) {
        return new VkCopyImageToImageInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCopyImageToImageInfo createSafe(long address) {
        return address == NULL ? null : new VkCopyImageToImageInfo(address, null);
    }

    /**
     * Returns a new {@link VkCopyImageToImageInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToImageInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageToImageInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToImageInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageToImageInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToImageInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyImageToImageInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToImageInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCopyImageToImageInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyImageToImageInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyImageToImageInfo malloc(MemoryStack stack) {
        return new VkCopyImageToImageInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyImageToImageInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyImageToImageInfo calloc(MemoryStack stack) {
        return new VkCopyImageToImageInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyImageToImageInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToImageInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageToImageInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToImageInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCopyImageToImageInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyImageToImageInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkCopyImageToImageInfo.FLAGS); }
    /** Unsafe version of {@link #srcImage}. */
    public static long nsrcImage(long struct) { return memGetLong(struct + VkCopyImageToImageInfo.SRCIMAGE); }
    /** Unsafe version of {@link #srcImageLayout}. */
    public static int nsrcImageLayout(long struct) { return memGetInt(struct + VkCopyImageToImageInfo.SRCIMAGELAYOUT); }
    /** Unsafe version of {@link #dstImage}. */
    public static long ndstImage(long struct) { return memGetLong(struct + VkCopyImageToImageInfo.DSTIMAGE); }
    /** Unsafe version of {@link #dstImageLayout}. */
    public static int ndstImageLayout(long struct) { return memGetInt(struct + VkCopyImageToImageInfo.DSTIMAGELAYOUT); }
    /** Unsafe version of {@link #regionCount}. */
    public static int nregionCount(long struct) { return memGetInt(struct + VkCopyImageToImageInfo.REGIONCOUNT); }
    /** Unsafe version of {@link #pRegions}. */
    public static VkImageCopy2.Buffer npRegions(long struct) { return VkImageCopy2.create(memGetAddress(struct + VkCopyImageToImageInfo.PREGIONS), nregionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCopyImageToImageInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyImageToImageInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkCopyImageToImageInfo.FLAGS, value); }
    /** Unsafe version of {@link #srcImage(long) srcImage}. */
    public static void nsrcImage(long struct, long value) { memPutLong(struct + VkCopyImageToImageInfo.SRCIMAGE, value); }
    /** Unsafe version of {@link #srcImageLayout(int) srcImageLayout}. */
    public static void nsrcImageLayout(long struct, int value) { memPutInt(struct + VkCopyImageToImageInfo.SRCIMAGELAYOUT, value); }
    /** Unsafe version of {@link #dstImage(long) dstImage}. */
    public static void ndstImage(long struct, long value) { memPutLong(struct + VkCopyImageToImageInfo.DSTIMAGE, value); }
    /** Unsafe version of {@link #dstImageLayout(int) dstImageLayout}. */
    public static void ndstImageLayout(long struct, int value) { memPutInt(struct + VkCopyImageToImageInfo.DSTIMAGELAYOUT, value); }
    /** Sets the specified value to the {@code regionCount} field of the specified {@code struct}. */
    public static void nregionCount(long struct, int value) { memPutInt(struct + VkCopyImageToImageInfo.REGIONCOUNT, value); }
    /** Unsafe version of {@link #pRegions(VkImageCopy2.Buffer) pRegions}. */
    public static void npRegions(long struct, VkImageCopy2.Buffer value) { memPutAddress(struct + VkCopyImageToImageInfo.PREGIONS, value.address()); nregionCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkCopyImageToImageInfo.PREGIONS));
    }

    // -----------------------------------

    /** An array of {@link VkCopyImageToImageInfo} structs. */
    public static class Buffer extends StructBuffer<VkCopyImageToImageInfo, Buffer> implements NativeResource {

        private static final VkCopyImageToImageInfo ELEMENT_FACTORY = VkCopyImageToImageInfo.create(-1L);

        /**
         * Creates a new {@code VkCopyImageToImageInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyImageToImageInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyImageToImageInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyImageToImageInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyImageToImageInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkHostImageCopyFlags")
        public int flags() { return VkCopyImageToImageInfo.nflags(address()); }
        /** @return the value of the {@code srcImage} field. */
        @NativeType("VkImage")
        public long srcImage() { return VkCopyImageToImageInfo.nsrcImage(address()); }
        /** @return the value of the {@code srcImageLayout} field. */
        @NativeType("VkImageLayout")
        public int srcImageLayout() { return VkCopyImageToImageInfo.nsrcImageLayout(address()); }
        /** @return the value of the {@code dstImage} field. */
        @NativeType("VkImage")
        public long dstImage() { return VkCopyImageToImageInfo.ndstImage(address()); }
        /** @return the value of the {@code dstImageLayout} field. */
        @NativeType("VkImageLayout")
        public int dstImageLayout() { return VkCopyImageToImageInfo.ndstImageLayout(address()); }
        /** @return the value of the {@code regionCount} field. */
        @NativeType("uint32_t")
        public int regionCount() { return VkCopyImageToImageInfo.nregionCount(address()); }
        /** @return a {@link VkImageCopy2.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
        @NativeType("VkImageCopy2 const *")
        public VkImageCopy2.Buffer pRegions() { return VkCopyImageToImageInfo.npRegions(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCopyImageToImageInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyImageToImageInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO} value to the {@code sType} field. */
        public VkCopyImageToImageInfo.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCopyImageToImageInfo.Buffer pNext(@NativeType("void const *") long value) { VkCopyImageToImageInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkCopyImageToImageInfo.Buffer flags(@NativeType("VkHostImageCopyFlags") int value) { VkCopyImageToImageInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code srcImage} field. */
        public VkCopyImageToImageInfo.Buffer srcImage(@NativeType("VkImage") long value) { VkCopyImageToImageInfo.nsrcImage(address(), value); return this; }
        /** Sets the specified value to the {@code srcImageLayout} field. */
        public VkCopyImageToImageInfo.Buffer srcImageLayout(@NativeType("VkImageLayout") int value) { VkCopyImageToImageInfo.nsrcImageLayout(address(), value); return this; }
        /** Sets the specified value to the {@code dstImage} field. */
        public VkCopyImageToImageInfo.Buffer dstImage(@NativeType("VkImage") long value) { VkCopyImageToImageInfo.ndstImage(address(), value); return this; }
        /** Sets the specified value to the {@code dstImageLayout} field. */
        public VkCopyImageToImageInfo.Buffer dstImageLayout(@NativeType("VkImageLayout") int value) { VkCopyImageToImageInfo.ndstImageLayout(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageCopy2.Buffer} to the {@code pRegions} field. */
        public VkCopyImageToImageInfo.Buffer pRegions(@NativeType("VkImageCopy2 const *") VkImageCopy2.Buffer value) { VkCopyImageToImageInfo.npRegions(address(), value); return this; }

    }

}