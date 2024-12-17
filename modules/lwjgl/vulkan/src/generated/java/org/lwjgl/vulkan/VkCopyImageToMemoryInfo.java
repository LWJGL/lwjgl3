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
 * struct VkCopyImageToMemoryInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkHostImageCopyFlags flags;
 *     VkImage srcImage;
 *     VkImageLayout srcImageLayout;
 *     uint32_t regionCount;
 *     {@link VkImageToMemoryCopy VkImageToMemoryCopy} const * pRegions;
 * }}</pre>
 */
public class VkCopyImageToMemoryInfo extends Struct<VkCopyImageToMemoryInfo> implements NativeResource {

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
        REGIONCOUNT,
        PREGIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
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
        REGIONCOUNT = layout.offsetof(5);
        PREGIONS = layout.offsetof(6);
    }

    protected VkCopyImageToMemoryInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyImageToMemoryInfo create(long address, @Nullable ByteBuffer container) {
        return new VkCopyImageToMemoryInfo(address, container);
    }

    /**
     * Creates a {@code VkCopyImageToMemoryInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyImageToMemoryInfo(ByteBuffer container) {
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
    /** @return the value of the {@code regionCount} field. */
    @NativeType("uint32_t")
    public int regionCount() { return nregionCount(address()); }
    /** @return a {@link VkImageToMemoryCopy.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
    @NativeType("VkImageToMemoryCopy const *")
    public VkImageToMemoryCopy.Buffer pRegions() { return npRegions(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCopyImageToMemoryInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO} value to the {@code sType} field. */
    public VkCopyImageToMemoryInfo sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCopyImageToMemoryInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkCopyImageToMemoryInfo flags(@NativeType("VkHostImageCopyFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code srcImage} field. */
    public VkCopyImageToMemoryInfo srcImage(@NativeType("VkImage") long value) { nsrcImage(address(), value); return this; }
    /** Sets the specified value to the {@code srcImageLayout} field. */
    public VkCopyImageToMemoryInfo srcImageLayout(@NativeType("VkImageLayout") int value) { nsrcImageLayout(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageToMemoryCopy.Buffer} to the {@code pRegions} field. */
    public VkCopyImageToMemoryInfo pRegions(@NativeType("VkImageToMemoryCopy const *") VkImageToMemoryCopy.Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyImageToMemoryInfo set(
        int sType,
        long pNext,
        int flags,
        long srcImage,
        int srcImageLayout,
        VkImageToMemoryCopy.Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        srcImage(srcImage);
        srcImageLayout(srcImageLayout);
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
    public VkCopyImageToMemoryInfo set(VkCopyImageToMemoryInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyImageToMemoryInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyImageToMemoryInfo malloc() {
        return new VkCopyImageToMemoryInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyImageToMemoryInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyImageToMemoryInfo calloc() {
        return new VkCopyImageToMemoryInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyImageToMemoryInfo} instance allocated with {@link BufferUtils}. */
    public static VkCopyImageToMemoryInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyImageToMemoryInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyImageToMemoryInfo} instance for the specified memory address. */
    public static VkCopyImageToMemoryInfo create(long address) {
        return new VkCopyImageToMemoryInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCopyImageToMemoryInfo createSafe(long address) {
        return address == NULL ? null : new VkCopyImageToMemoryInfo(address, null);
    }

    /**
     * Returns a new {@link VkCopyImageToMemoryInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToMemoryInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageToMemoryInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToMemoryInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageToMemoryInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToMemoryInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyImageToMemoryInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToMemoryInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCopyImageToMemoryInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyImageToMemoryInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyImageToMemoryInfo malloc(MemoryStack stack) {
        return new VkCopyImageToMemoryInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyImageToMemoryInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyImageToMemoryInfo calloc(MemoryStack stack) {
        return new VkCopyImageToMemoryInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyImageToMemoryInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToMemoryInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageToMemoryInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToMemoryInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCopyImageToMemoryInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyImageToMemoryInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkCopyImageToMemoryInfo.FLAGS); }
    /** Unsafe version of {@link #srcImage}. */
    public static long nsrcImage(long struct) { return memGetLong(struct + VkCopyImageToMemoryInfo.SRCIMAGE); }
    /** Unsafe version of {@link #srcImageLayout}. */
    public static int nsrcImageLayout(long struct) { return memGetInt(struct + VkCopyImageToMemoryInfo.SRCIMAGELAYOUT); }
    /** Unsafe version of {@link #regionCount}. */
    public static int nregionCount(long struct) { return memGetInt(struct + VkCopyImageToMemoryInfo.REGIONCOUNT); }
    /** Unsafe version of {@link #pRegions}. */
    public static VkImageToMemoryCopy.Buffer npRegions(long struct) { return VkImageToMemoryCopy.create(memGetAddress(struct + VkCopyImageToMemoryInfo.PREGIONS), nregionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCopyImageToMemoryInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyImageToMemoryInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkCopyImageToMemoryInfo.FLAGS, value); }
    /** Unsafe version of {@link #srcImage(long) srcImage}. */
    public static void nsrcImage(long struct, long value) { memPutLong(struct + VkCopyImageToMemoryInfo.SRCIMAGE, value); }
    /** Unsafe version of {@link #srcImageLayout(int) srcImageLayout}. */
    public static void nsrcImageLayout(long struct, int value) { memPutInt(struct + VkCopyImageToMemoryInfo.SRCIMAGELAYOUT, value); }
    /** Sets the specified value to the {@code regionCount} field of the specified {@code struct}. */
    public static void nregionCount(long struct, int value) { memPutInt(struct + VkCopyImageToMemoryInfo.REGIONCOUNT, value); }
    /** Unsafe version of {@link #pRegions(VkImageToMemoryCopy.Buffer) pRegions}. */
    public static void npRegions(long struct, VkImageToMemoryCopy.Buffer value) { memPutAddress(struct + VkCopyImageToMemoryInfo.PREGIONS, value.address()); nregionCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int regionCount = nregionCount(struct);
        long pRegions = memGetAddress(struct + VkCopyImageToMemoryInfo.PREGIONS);
        check(pRegions);
        validate(pRegions, regionCount, VkImageToMemoryCopy.SIZEOF, VkImageToMemoryCopy::validate);
    }

    // -----------------------------------

    /** An array of {@link VkCopyImageToMemoryInfo} structs. */
    public static class Buffer extends StructBuffer<VkCopyImageToMemoryInfo, Buffer> implements NativeResource {

        private static final VkCopyImageToMemoryInfo ELEMENT_FACTORY = VkCopyImageToMemoryInfo.create(-1L);

        /**
         * Creates a new {@code VkCopyImageToMemoryInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyImageToMemoryInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyImageToMemoryInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyImageToMemoryInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyImageToMemoryInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkHostImageCopyFlags")
        public int flags() { return VkCopyImageToMemoryInfo.nflags(address()); }
        /** @return the value of the {@code srcImage} field. */
        @NativeType("VkImage")
        public long srcImage() { return VkCopyImageToMemoryInfo.nsrcImage(address()); }
        /** @return the value of the {@code srcImageLayout} field. */
        @NativeType("VkImageLayout")
        public int srcImageLayout() { return VkCopyImageToMemoryInfo.nsrcImageLayout(address()); }
        /** @return the value of the {@code regionCount} field. */
        @NativeType("uint32_t")
        public int regionCount() { return VkCopyImageToMemoryInfo.nregionCount(address()); }
        /** @return a {@link VkImageToMemoryCopy.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
        @NativeType("VkImageToMemoryCopy const *")
        public VkImageToMemoryCopy.Buffer pRegions() { return VkCopyImageToMemoryInfo.npRegions(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCopyImageToMemoryInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyImageToMemoryInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO} value to the {@code sType} field. */
        public VkCopyImageToMemoryInfo.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCopyImageToMemoryInfo.Buffer pNext(@NativeType("void const *") long value) { VkCopyImageToMemoryInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkCopyImageToMemoryInfo.Buffer flags(@NativeType("VkHostImageCopyFlags") int value) { VkCopyImageToMemoryInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code srcImage} field. */
        public VkCopyImageToMemoryInfo.Buffer srcImage(@NativeType("VkImage") long value) { VkCopyImageToMemoryInfo.nsrcImage(address(), value); return this; }
        /** Sets the specified value to the {@code srcImageLayout} field. */
        public VkCopyImageToMemoryInfo.Buffer srcImageLayout(@NativeType("VkImageLayout") int value) { VkCopyImageToMemoryInfo.nsrcImageLayout(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageToMemoryCopy.Buffer} to the {@code pRegions} field. */
        public VkCopyImageToMemoryInfo.Buffer pRegions(@NativeType("VkImageToMemoryCopy const *") VkImageToMemoryCopy.Buffer value) { VkCopyImageToMemoryInfo.npRegions(address(), value); return this; }

    }

}