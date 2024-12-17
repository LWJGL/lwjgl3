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
 * struct VkVideoEncodeH264NaluSliceInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     int32_t constantQp;
 *     {@link StdVideoEncodeH264SliceHeader StdVideoEncodeH264SliceHeader} const * pStdSliceHeader;
 * }}</pre>
 */
public class VkVideoEncodeH264NaluSliceInfoKHR extends Struct<VkVideoEncodeH264NaluSliceInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CONSTANTQP,
        PSTDSLICEHEADER;

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
        PSTDSLICEHEADER = layout.offsetof(3);
    }

    protected VkVideoEncodeH264NaluSliceInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH264NaluSliceInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264NaluSliceInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH264NaluSliceInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264NaluSliceInfoKHR(ByteBuffer container) {
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
    /** @return a {@link StdVideoEncodeH264SliceHeader} view of the struct pointed to by the {@code pStdSliceHeader} field. */
    @NativeType("StdVideoEncodeH264SliceHeader const *")
    public StdVideoEncodeH264SliceHeader pStdSliceHeader() { return npStdSliceHeader(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeH264NaluSliceInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_INFO_KHR} value to the {@code sType} field. */
    public VkVideoEncodeH264NaluSliceInfoKHR sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeH264NaluSliceInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code constantQp} field. */
    public VkVideoEncodeH264NaluSliceInfoKHR constantQp(@NativeType("int32_t") int value) { nconstantQp(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264SliceHeader} to the {@code pStdSliceHeader} field. */
    public VkVideoEncodeH264NaluSliceInfoKHR pStdSliceHeader(@NativeType("StdVideoEncodeH264SliceHeader const *") StdVideoEncodeH264SliceHeader value) { npStdSliceHeader(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264NaluSliceInfoKHR set(
        int sType,
        long pNext,
        int constantQp,
        StdVideoEncodeH264SliceHeader pStdSliceHeader
    ) {
        sType(sType);
        pNext(pNext);
        constantQp(constantQp);
        pStdSliceHeader(pStdSliceHeader);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH264NaluSliceInfoKHR set(VkVideoEncodeH264NaluSliceInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264NaluSliceInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264NaluSliceInfoKHR malloc() {
        return new VkVideoEncodeH264NaluSliceInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264NaluSliceInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264NaluSliceInfoKHR calloc() {
        return new VkVideoEncodeH264NaluSliceInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264NaluSliceInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264NaluSliceInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264NaluSliceInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264NaluSliceInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeH264NaluSliceInfoKHR create(long address) {
        return new VkVideoEncodeH264NaluSliceInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH264NaluSliceInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH264NaluSliceInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264NaluSliceInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264NaluSliceInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264NaluSliceInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264NaluSliceInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264NaluSliceInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264NaluSliceInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH264NaluSliceInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264NaluSliceInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH264NaluSliceInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264NaluSliceInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264NaluSliceInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH264NaluSliceInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264NaluSliceInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264NaluSliceInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH264NaluSliceInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264NaluSliceInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264NaluSliceInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264NaluSliceInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264NaluSliceInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeH264NaluSliceInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264NaluSliceInfoKHR.PNEXT); }
    /** Unsafe version of {@link #constantQp}. */
    public static int nconstantQp(long struct) { return memGetInt(struct + VkVideoEncodeH264NaluSliceInfoKHR.CONSTANTQP); }
    /** Unsafe version of {@link #pStdSliceHeader}. */
    public static StdVideoEncodeH264SliceHeader npStdSliceHeader(long struct) { return StdVideoEncodeH264SliceHeader.create(memGetAddress(struct + VkVideoEncodeH264NaluSliceInfoKHR.PSTDSLICEHEADER)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeH264NaluSliceInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264NaluSliceInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #constantQp(int) constantQp}. */
    public static void nconstantQp(long struct, int value) { memPutInt(struct + VkVideoEncodeH264NaluSliceInfoKHR.CONSTANTQP, value); }
    /** Unsafe version of {@link #pStdSliceHeader(StdVideoEncodeH264SliceHeader) pStdSliceHeader}. */
    public static void npStdSliceHeader(long struct, StdVideoEncodeH264SliceHeader value) { memPutAddress(struct + VkVideoEncodeH264NaluSliceInfoKHR.PSTDSLICEHEADER, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pStdSliceHeader = memGetAddress(struct + VkVideoEncodeH264NaluSliceInfoKHR.PSTDSLICEHEADER);
        check(pStdSliceHeader);
        StdVideoEncodeH264SliceHeader.validate(pStdSliceHeader);
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264NaluSliceInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264NaluSliceInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264NaluSliceInfoKHR ELEMENT_FACTORY = VkVideoEncodeH264NaluSliceInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264NaluSliceInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264NaluSliceInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH264NaluSliceInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264NaluSliceInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264NaluSliceInfoKHR.npNext(address()); }
        /** @return the value of the {@code constantQp} field. */
        @NativeType("int32_t")
        public int constantQp() { return VkVideoEncodeH264NaluSliceInfoKHR.nconstantQp(address()); }
        /** @return a {@link StdVideoEncodeH264SliceHeader} view of the struct pointed to by the {@code pStdSliceHeader} field. */
        @NativeType("StdVideoEncodeH264SliceHeader const *")
        public StdVideoEncodeH264SliceHeader pStdSliceHeader() { return VkVideoEncodeH264NaluSliceInfoKHR.npStdSliceHeader(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeH264NaluSliceInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264NaluSliceInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_INFO_KHR} value to the {@code sType} field. */
        public VkVideoEncodeH264NaluSliceInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeH264NaluSliceInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264NaluSliceInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code constantQp} field. */
        public VkVideoEncodeH264NaluSliceInfoKHR.Buffer constantQp(@NativeType("int32_t") int value) { VkVideoEncodeH264NaluSliceInfoKHR.nconstantQp(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264SliceHeader} to the {@code pStdSliceHeader} field. */
        public VkVideoEncodeH264NaluSliceInfoKHR.Buffer pStdSliceHeader(@NativeType("StdVideoEncodeH264SliceHeader const *") StdVideoEncodeH264SliceHeader value) { VkVideoEncodeH264NaluSliceInfoKHR.npStdSliceHeader(address(), value); return this; }

    }

}