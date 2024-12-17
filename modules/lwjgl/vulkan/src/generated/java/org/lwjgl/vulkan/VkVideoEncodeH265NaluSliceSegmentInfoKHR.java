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

import org.lwjgl.vulkan.video.*;

/**
 * <pre>{@code
 * struct VkVideoEncodeH265NaluSliceSegmentInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     int32_t constantQp;
 *     {@link StdVideoEncodeH265SliceSegmentHeader StdVideoEncodeH265SliceSegmentHeader} const * pStdSliceSegmentHeader;
 * }}</pre>
 */
public class VkVideoEncodeH265NaluSliceSegmentInfoKHR extends Struct<VkVideoEncodeH265NaluSliceSegmentInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CONSTANTQP,
        PSTDSLICESEGMENTHEADER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CONSTANTQP = layout.offsetof(2);
        PSTDSLICESEGMENTHEADER = layout.offsetof(3);
    }

    protected VkVideoEncodeH265NaluSliceSegmentInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265NaluSliceSegmentInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265NaluSliceSegmentInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code constantQp} field. */
    @NativeType("int32_t")
    public int constantQp() { return nconstantQp(address()); }
    /** @return a {@link StdVideoEncodeH265SliceSegmentHeader} view of the struct pointed to by the {@code pStdSliceSegmentHeader} field. */
    @NativeType("StdVideoEncodeH265SliceSegmentHeader const *")
    public StdVideoEncodeH265SliceSegmentHeader pStdSliceSegmentHeader() { return npStdSliceSegmentHeader(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_KHR} value to the {@code sType} field. */
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code constantQp} field. */
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR constantQp(@NativeType("int32_t") int value) { nconstantQp(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH265SliceSegmentHeader} to the {@code pStdSliceSegmentHeader} field. */
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR pStdSliceSegmentHeader(@NativeType("StdVideoEncodeH265SliceSegmentHeader const *") StdVideoEncodeH265SliceSegmentHeader value) { npStdSliceSegmentHeader(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR set(
        int sType,
        long pNext,
        int constantQp,
        StdVideoEncodeH265SliceSegmentHeader pStdSliceSegmentHeader
    ) {
        sType(sType);
        pNext(pNext);
        constantQp(constantQp);
        pStdSliceSegmentHeader(pStdSliceSegmentHeader);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR set(VkVideoEncodeH265NaluSliceSegmentInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265NaluSliceSegmentInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR malloc() {
        return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265NaluSliceSegmentInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR calloc() {
        return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265NaluSliceSegmentInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265NaluSliceSegmentInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR create(long address) {
        return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH265NaluSliceSegmentInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265NaluSliceSegmentInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265NaluSliceSegmentInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265NaluSliceSegmentInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeH265NaluSliceSegmentInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265NaluSliceSegmentInfoKHR.PNEXT); }
    /** Unsafe version of {@link #constantQp}. */
    public static int nconstantQp(long struct) { return memGetInt(struct + VkVideoEncodeH265NaluSliceSegmentInfoKHR.CONSTANTQP); }
    /** Unsafe version of {@link #pStdSliceSegmentHeader}. */
    public static StdVideoEncodeH265SliceSegmentHeader npStdSliceSegmentHeader(long struct) { return StdVideoEncodeH265SliceSegmentHeader.create(memGetAddress(struct + VkVideoEncodeH265NaluSliceSegmentInfoKHR.PSTDSLICESEGMENTHEADER)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeH265NaluSliceSegmentInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265NaluSliceSegmentInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #constantQp(int) constantQp}. */
    public static void nconstantQp(long struct, int value) { memPutInt(struct + VkVideoEncodeH265NaluSliceSegmentInfoKHR.CONSTANTQP, value); }
    /** Unsafe version of {@link #pStdSliceSegmentHeader(StdVideoEncodeH265SliceSegmentHeader) pStdSliceSegmentHeader}. */
    public static void npStdSliceSegmentHeader(long struct, StdVideoEncodeH265SliceSegmentHeader value) { memPutAddress(struct + VkVideoEncodeH265NaluSliceSegmentInfoKHR.PSTDSLICESEGMENTHEADER, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pStdSliceSegmentHeader = memGetAddress(struct + VkVideoEncodeH265NaluSliceSegmentInfoKHR.PSTDSLICESEGMENTHEADER);
        check(pStdSliceSegmentHeader);
        StdVideoEncodeH265SliceSegmentHeader.validate(pStdSliceSegmentHeader);
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265NaluSliceSegmentInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265NaluSliceSegmentInfoKHR ELEMENT_FACTORY = VkVideoEncodeH265NaluSliceSegmentInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH265NaluSliceSegmentInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265NaluSliceSegmentInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265NaluSliceSegmentInfoKHR.npNext(address()); }
        /** @return the value of the {@code constantQp} field. */
        @NativeType("int32_t")
        public int constantQp() { return VkVideoEncodeH265NaluSliceSegmentInfoKHR.nconstantQp(address()); }
        /** @return a {@link StdVideoEncodeH265SliceSegmentHeader} view of the struct pointed to by the {@code pStdSliceSegmentHeader} field. */
        @NativeType("StdVideoEncodeH265SliceSegmentHeader const *")
        public StdVideoEncodeH265SliceSegmentHeader pStdSliceSegmentHeader() { return VkVideoEncodeH265NaluSliceSegmentInfoKHR.npStdSliceSegmentHeader(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265NaluSliceSegmentInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_KHR} value to the {@code sType} field. */
        public VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265NaluSliceSegmentInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code constantQp} field. */
        public VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer constantQp(@NativeType("int32_t") int value) { VkVideoEncodeH265NaluSliceSegmentInfoKHR.nconstantQp(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH265SliceSegmentHeader} to the {@code pStdSliceSegmentHeader} field. */
        public VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer pStdSliceSegmentHeader(@NativeType("StdVideoEncodeH265SliceSegmentHeader const *") StdVideoEncodeH265SliceSegmentHeader value) { VkVideoEncodeH265NaluSliceSegmentInfoKHR.npStdSliceSegmentHeader(address(), value); return this; }

    }

}