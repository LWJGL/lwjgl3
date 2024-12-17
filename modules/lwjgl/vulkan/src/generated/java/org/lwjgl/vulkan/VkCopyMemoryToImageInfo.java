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
 * struct VkCopyMemoryToImageInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkHostImageCopyFlags flags;
 *     VkImage dstImage;
 *     VkImageLayout dstImageLayout;
 *     uint32_t regionCount;
 *     {@link VkMemoryToImageCopy VkMemoryToImageCopy} const * pRegions;
 * }}</pre>
 */
public class VkCopyMemoryToImageInfo extends Struct<VkCopyMemoryToImageInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
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
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DSTIMAGE = layout.offsetof(3);
        DSTIMAGELAYOUT = layout.offsetof(4);
        REGIONCOUNT = layout.offsetof(5);
        PREGIONS = layout.offsetof(6);
    }

    protected VkCopyMemoryToImageInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyMemoryToImageInfo create(long address, @Nullable ByteBuffer container) {
        return new VkCopyMemoryToImageInfo(address, container);
    }

    /**
     * Creates a {@code VkCopyMemoryToImageInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyMemoryToImageInfo(ByteBuffer container) {
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
    /** @return the value of the {@code dstImage} field. */
    @NativeType("VkImage")
    public long dstImage() { return ndstImage(address()); }
    /** @return the value of the {@code dstImageLayout} field. */
    @NativeType("VkImageLayout")
    public int dstImageLayout() { return ndstImageLayout(address()); }
    /** @return the value of the {@code regionCount} field. */
    @NativeType("uint32_t")
    public int regionCount() { return nregionCount(address()); }
    /** @return a {@link VkMemoryToImageCopy.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
    @NativeType("VkMemoryToImageCopy const *")
    public VkMemoryToImageCopy.Buffer pRegions() { return npRegions(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCopyMemoryToImageInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO} value to the {@code sType} field. */
    public VkCopyMemoryToImageInfo sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCopyMemoryToImageInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkCopyMemoryToImageInfo flags(@NativeType("VkHostImageCopyFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code dstImage} field. */
    public VkCopyMemoryToImageInfo dstImage(@NativeType("VkImage") long value) { ndstImage(address(), value); return this; }
    /** Sets the specified value to the {@code dstImageLayout} field. */
    public VkCopyMemoryToImageInfo dstImageLayout(@NativeType("VkImageLayout") int value) { ndstImageLayout(address(), value); return this; }
    /** Sets the address of the specified {@link VkMemoryToImageCopy.Buffer} to the {@code pRegions} field. */
    public VkCopyMemoryToImageInfo pRegions(@NativeType("VkMemoryToImageCopy const *") VkMemoryToImageCopy.Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyMemoryToImageInfo set(
        int sType,
        long pNext,
        int flags,
        long dstImage,
        int dstImageLayout,
        VkMemoryToImageCopy.Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
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
    public VkCopyMemoryToImageInfo set(VkCopyMemoryToImageInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyMemoryToImageInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryToImageInfo malloc() {
        return new VkCopyMemoryToImageInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMemoryToImageInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryToImageInfo calloc() {
        return new VkCopyMemoryToImageInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMemoryToImageInfo} instance allocated with {@link BufferUtils}. */
    public static VkCopyMemoryToImageInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyMemoryToImageInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyMemoryToImageInfo} instance for the specified memory address. */
    public static VkCopyMemoryToImageInfo create(long address) {
        return new VkCopyMemoryToImageInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCopyMemoryToImageInfo createSafe(long address) {
        return address == NULL ? null : new VkCopyMemoryToImageInfo(address, null);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyMemoryToImageInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCopyMemoryToImageInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyMemoryToImageInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryToImageInfo malloc(MemoryStack stack) {
        return new VkCopyMemoryToImageInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyMemoryToImageInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryToImageInfo calloc(MemoryStack stack) {
        return new VkCopyMemoryToImageInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCopyMemoryToImageInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyMemoryToImageInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkCopyMemoryToImageInfo.FLAGS); }
    /** Unsafe version of {@link #dstImage}. */
    public static long ndstImage(long struct) { return memGetLong(struct + VkCopyMemoryToImageInfo.DSTIMAGE); }
    /** Unsafe version of {@link #dstImageLayout}. */
    public static int ndstImageLayout(long struct) { return memGetInt(struct + VkCopyMemoryToImageInfo.DSTIMAGELAYOUT); }
    /** Unsafe version of {@link #regionCount}. */
    public static int nregionCount(long struct) { return memGetInt(struct + VkCopyMemoryToImageInfo.REGIONCOUNT); }
    /** Unsafe version of {@link #pRegions}. */
    public static VkMemoryToImageCopy.Buffer npRegions(long struct) { return VkMemoryToImageCopy.create(memGetAddress(struct + VkCopyMemoryToImageInfo.PREGIONS), nregionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCopyMemoryToImageInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyMemoryToImageInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkCopyMemoryToImageInfo.FLAGS, value); }
    /** Unsafe version of {@link #dstImage(long) dstImage}. */
    public static void ndstImage(long struct, long value) { memPutLong(struct + VkCopyMemoryToImageInfo.DSTIMAGE, value); }
    /** Unsafe version of {@link #dstImageLayout(int) dstImageLayout}. */
    public static void ndstImageLayout(long struct, int value) { memPutInt(struct + VkCopyMemoryToImageInfo.DSTIMAGELAYOUT, value); }
    /** Sets the specified value to the {@code regionCount} field of the specified {@code struct}. */
    public static void nregionCount(long struct, int value) { memPutInt(struct + VkCopyMemoryToImageInfo.REGIONCOUNT, value); }
    /** Unsafe version of {@link #pRegions(VkMemoryToImageCopy.Buffer) pRegions}. */
    public static void npRegions(long struct, VkMemoryToImageCopy.Buffer value) { memPutAddress(struct + VkCopyMemoryToImageInfo.PREGIONS, value.address()); nregionCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int regionCount = nregionCount(struct);
        long pRegions = memGetAddress(struct + VkCopyMemoryToImageInfo.PREGIONS);
        check(pRegions);
        validate(pRegions, regionCount, VkMemoryToImageCopy.SIZEOF, VkMemoryToImageCopy::validate);
    }

    // -----------------------------------

    /** An array of {@link VkCopyMemoryToImageInfo} structs. */
    public static class Buffer extends StructBuffer<VkCopyMemoryToImageInfo, Buffer> implements NativeResource {

        private static final VkCopyMemoryToImageInfo ELEMENT_FACTORY = VkCopyMemoryToImageInfo.create(-1L);

        /**
         * Creates a new {@code VkCopyMemoryToImageInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyMemoryToImageInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyMemoryToImageInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyMemoryToImageInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyMemoryToImageInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkHostImageCopyFlags")
        public int flags() { return VkCopyMemoryToImageInfo.nflags(address()); }
        /** @return the value of the {@code dstImage} field. */
        @NativeType("VkImage")
        public long dstImage() { return VkCopyMemoryToImageInfo.ndstImage(address()); }
        /** @return the value of the {@code dstImageLayout} field. */
        @NativeType("VkImageLayout")
        public int dstImageLayout() { return VkCopyMemoryToImageInfo.ndstImageLayout(address()); }
        /** @return the value of the {@code regionCount} field. */
        @NativeType("uint32_t")
        public int regionCount() { return VkCopyMemoryToImageInfo.nregionCount(address()); }
        /** @return a {@link VkMemoryToImageCopy.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
        @NativeType("VkMemoryToImageCopy const *")
        public VkMemoryToImageCopy.Buffer pRegions() { return VkCopyMemoryToImageInfo.npRegions(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCopyMemoryToImageInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyMemoryToImageInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO} value to the {@code sType} field. */
        public VkCopyMemoryToImageInfo.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCopyMemoryToImageInfo.Buffer pNext(@NativeType("void const *") long value) { VkCopyMemoryToImageInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkCopyMemoryToImageInfo.Buffer flags(@NativeType("VkHostImageCopyFlags") int value) { VkCopyMemoryToImageInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code dstImage} field. */
        public VkCopyMemoryToImageInfo.Buffer dstImage(@NativeType("VkImage") long value) { VkCopyMemoryToImageInfo.ndstImage(address(), value); return this; }
        /** Sets the specified value to the {@code dstImageLayout} field. */
        public VkCopyMemoryToImageInfo.Buffer dstImageLayout(@NativeType("VkImageLayout") int value) { VkCopyMemoryToImageInfo.ndstImageLayout(address(), value); return this; }
        /** Sets the address of the specified {@link VkMemoryToImageCopy.Buffer} to the {@code pRegions} field. */
        public VkCopyMemoryToImageInfo.Buffer pRegions(@NativeType("VkMemoryToImageCopy const *") VkMemoryToImageCopy.Buffer value) { VkCopyMemoryToImageInfo.npRegions(address(), value); return this; }

    }

}