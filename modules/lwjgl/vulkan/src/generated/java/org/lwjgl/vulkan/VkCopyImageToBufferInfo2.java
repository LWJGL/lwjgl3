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
 * struct VkCopyImageToBufferInfo2 {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImage srcImage;
 *     VkImageLayout srcImageLayout;
 *     VkBuffer dstBuffer;
 *     uint32_t regionCount;
 *     {@link VkBufferImageCopy2 VkBufferImageCopy2} const * pRegions;
 * }}</pre>
 */
public class VkCopyImageToBufferInfo2 extends Struct<VkCopyImageToBufferInfo2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCIMAGE,
        SRCIMAGELAYOUT,
        DSTBUFFER,
        REGIONCOUNT,
        PREGIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCIMAGE = layout.offsetof(2);
        SRCIMAGELAYOUT = layout.offsetof(3);
        DSTBUFFER = layout.offsetof(4);
        REGIONCOUNT = layout.offsetof(5);
        PREGIONS = layout.offsetof(6);
    }

    protected VkCopyImageToBufferInfo2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyImageToBufferInfo2 create(long address, @Nullable ByteBuffer container) {
        return new VkCopyImageToBufferInfo2(address, container);
    }

    /**
     * Creates a {@code VkCopyImageToBufferInfo2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyImageToBufferInfo2(ByteBuffer container) {
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
    /** @return the value of the {@code srcImage} field. */
    @NativeType("VkImage")
    public long srcImage() { return nsrcImage(address()); }
    /** @return the value of the {@code srcImageLayout} field. */
    @NativeType("VkImageLayout")
    public int srcImageLayout() { return nsrcImageLayout(address()); }
    /** @return the value of the {@code dstBuffer} field. */
    @NativeType("VkBuffer")
    public long dstBuffer() { return ndstBuffer(address()); }
    /** @return the value of the {@code regionCount} field. */
    @NativeType("uint32_t")
    public int regionCount() { return nregionCount(address()); }
    /** @return a {@link VkBufferImageCopy2.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
    @NativeType("VkBufferImageCopy2 const *")
    public VkBufferImageCopy2.Buffer pRegions() { return npRegions(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCopyImageToBufferInfo2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2 STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2} value to the {@code sType} field. */
    public VkCopyImageToBufferInfo2 sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCopyImageToBufferInfo2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code srcImage} field. */
    public VkCopyImageToBufferInfo2 srcImage(@NativeType("VkImage") long value) { nsrcImage(address(), value); return this; }
    /** Sets the specified value to the {@code srcImageLayout} field. */
    public VkCopyImageToBufferInfo2 srcImageLayout(@NativeType("VkImageLayout") int value) { nsrcImageLayout(address(), value); return this; }
    /** Sets the specified value to the {@code dstBuffer} field. */
    public VkCopyImageToBufferInfo2 dstBuffer(@NativeType("VkBuffer") long value) { ndstBuffer(address(), value); return this; }
    /** Sets the address of the specified {@link VkBufferImageCopy2.Buffer} to the {@code pRegions} field. */
    public VkCopyImageToBufferInfo2 pRegions(@NativeType("VkBufferImageCopy2 const *") VkBufferImageCopy2.Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyImageToBufferInfo2 set(
        int sType,
        long pNext,
        long srcImage,
        int srcImageLayout,
        long dstBuffer,
        VkBufferImageCopy2.Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        srcImage(srcImage);
        srcImageLayout(srcImageLayout);
        dstBuffer(dstBuffer);
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
    public VkCopyImageToBufferInfo2 set(VkCopyImageToBufferInfo2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyImageToBufferInfo2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyImageToBufferInfo2 malloc() {
        return new VkCopyImageToBufferInfo2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyImageToBufferInfo2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyImageToBufferInfo2 calloc() {
        return new VkCopyImageToBufferInfo2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyImageToBufferInfo2} instance allocated with {@link BufferUtils}. */
    public static VkCopyImageToBufferInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyImageToBufferInfo2(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyImageToBufferInfo2} instance for the specified memory address. */
    public static VkCopyImageToBufferInfo2 create(long address) {
        return new VkCopyImageToBufferInfo2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCopyImageToBufferInfo2 createSafe(long address) {
        return address == NULL ? null : new VkCopyImageToBufferInfo2(address, null);
    }

    /**
     * Returns a new {@link VkCopyImageToBufferInfo2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToBufferInfo2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageToBufferInfo2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToBufferInfo2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageToBufferInfo2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToBufferInfo2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyImageToBufferInfo2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToBufferInfo2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCopyImageToBufferInfo2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyImageToBufferInfo2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyImageToBufferInfo2 malloc(MemoryStack stack) {
        return new VkCopyImageToBufferInfo2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyImageToBufferInfo2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyImageToBufferInfo2 calloc(MemoryStack stack) {
        return new VkCopyImageToBufferInfo2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyImageToBufferInfo2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToBufferInfo2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageToBufferInfo2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToBufferInfo2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCopyImageToBufferInfo2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyImageToBufferInfo2.PNEXT); }
    /** Unsafe version of {@link #srcImage}. */
    public static long nsrcImage(long struct) { return memGetLong(struct + VkCopyImageToBufferInfo2.SRCIMAGE); }
    /** Unsafe version of {@link #srcImageLayout}. */
    public static int nsrcImageLayout(long struct) { return memGetInt(struct + VkCopyImageToBufferInfo2.SRCIMAGELAYOUT); }
    /** Unsafe version of {@link #dstBuffer}. */
    public static long ndstBuffer(long struct) { return memGetLong(struct + VkCopyImageToBufferInfo2.DSTBUFFER); }
    /** Unsafe version of {@link #regionCount}. */
    public static int nregionCount(long struct) { return memGetInt(struct + VkCopyImageToBufferInfo2.REGIONCOUNT); }
    /** Unsafe version of {@link #pRegions}. */
    public static VkBufferImageCopy2.Buffer npRegions(long struct) { return VkBufferImageCopy2.create(memGetAddress(struct + VkCopyImageToBufferInfo2.PREGIONS), nregionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCopyImageToBufferInfo2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyImageToBufferInfo2.PNEXT, value); }
    /** Unsafe version of {@link #srcImage(long) srcImage}. */
    public static void nsrcImage(long struct, long value) { memPutLong(struct + VkCopyImageToBufferInfo2.SRCIMAGE, value); }
    /** Unsafe version of {@link #srcImageLayout(int) srcImageLayout}. */
    public static void nsrcImageLayout(long struct, int value) { memPutInt(struct + VkCopyImageToBufferInfo2.SRCIMAGELAYOUT, value); }
    /** Unsafe version of {@link #dstBuffer(long) dstBuffer}. */
    public static void ndstBuffer(long struct, long value) { memPutLong(struct + VkCopyImageToBufferInfo2.DSTBUFFER, value); }
    /** Sets the specified value to the {@code regionCount} field of the specified {@code struct}. */
    public static void nregionCount(long struct, int value) { memPutInt(struct + VkCopyImageToBufferInfo2.REGIONCOUNT, value); }
    /** Unsafe version of {@link #pRegions(VkBufferImageCopy2.Buffer) pRegions}. */
    public static void npRegions(long struct, VkBufferImageCopy2.Buffer value) { memPutAddress(struct + VkCopyImageToBufferInfo2.PREGIONS, value.address()); nregionCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkCopyImageToBufferInfo2.PREGIONS));
    }

    // -----------------------------------

    /** An array of {@link VkCopyImageToBufferInfo2} structs. */
    public static class Buffer extends StructBuffer<VkCopyImageToBufferInfo2, Buffer> implements NativeResource {

        private static final VkCopyImageToBufferInfo2 ELEMENT_FACTORY = VkCopyImageToBufferInfo2.create(-1L);

        /**
         * Creates a new {@code VkCopyImageToBufferInfo2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyImageToBufferInfo2#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyImageToBufferInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyImageToBufferInfo2.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyImageToBufferInfo2.npNext(address()); }
        /** @return the value of the {@code srcImage} field. */
        @NativeType("VkImage")
        public long srcImage() { return VkCopyImageToBufferInfo2.nsrcImage(address()); }
        /** @return the value of the {@code srcImageLayout} field. */
        @NativeType("VkImageLayout")
        public int srcImageLayout() { return VkCopyImageToBufferInfo2.nsrcImageLayout(address()); }
        /** @return the value of the {@code dstBuffer} field. */
        @NativeType("VkBuffer")
        public long dstBuffer() { return VkCopyImageToBufferInfo2.ndstBuffer(address()); }
        /** @return the value of the {@code regionCount} field. */
        @NativeType("uint32_t")
        public int regionCount() { return VkCopyImageToBufferInfo2.nregionCount(address()); }
        /** @return a {@link VkBufferImageCopy2.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
        @NativeType("VkBufferImageCopy2 const *")
        public VkBufferImageCopy2.Buffer pRegions() { return VkCopyImageToBufferInfo2.npRegions(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCopyImageToBufferInfo2.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyImageToBufferInfo2.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2 STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2} value to the {@code sType} field. */
        public VkCopyImageToBufferInfo2.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCopyImageToBufferInfo2.Buffer pNext(@NativeType("void const *") long value) { VkCopyImageToBufferInfo2.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code srcImage} field. */
        public VkCopyImageToBufferInfo2.Buffer srcImage(@NativeType("VkImage") long value) { VkCopyImageToBufferInfo2.nsrcImage(address(), value); return this; }
        /** Sets the specified value to the {@code srcImageLayout} field. */
        public VkCopyImageToBufferInfo2.Buffer srcImageLayout(@NativeType("VkImageLayout") int value) { VkCopyImageToBufferInfo2.nsrcImageLayout(address(), value); return this; }
        /** Sets the specified value to the {@code dstBuffer} field. */
        public VkCopyImageToBufferInfo2.Buffer dstBuffer(@NativeType("VkBuffer") long value) { VkCopyImageToBufferInfo2.ndstBuffer(address(), value); return this; }
        /** Sets the address of the specified {@link VkBufferImageCopy2.Buffer} to the {@code pRegions} field. */
        public VkCopyImageToBufferInfo2.Buffer pRegions(@NativeType("VkBufferImageCopy2 const *") VkBufferImageCopy2.Buffer value) { VkCopyImageToBufferInfo2.npRegions(address(), value); return this; }

    }

}