/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.video.*;

/**
 * Structure specifies H.265 encode slice segment NALU parameters.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pStdSliceSegmentHeader} <b>must</b> be a valid pointer to a valid {@code StdVideoEncodeH265SliceSegmentHeader} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH265PictureInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265NaluSliceSegmentInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     int32_t {@link #constantQp};
 *     {@link StdVideoEncodeH265SliceSegmentHeader StdVideoEncodeH265SliceSegmentHeader} const * {@link #pStdSliceSegmentHeader};
 * }</code></pre>
 */
public class VkVideoEncodeH265NaluSliceSegmentInfoEXT extends Struct<VkVideoEncodeH265NaluSliceSegmentInfoEXT> implements NativeResource {

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

    protected VkVideoEncodeH265NaluSliceSegmentInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265NaluSliceSegmentInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265NaluSliceSegmentInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265NaluSliceSegmentInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265NaluSliceSegmentInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the QP to use for the slice segment if the current rate control mode configured for the video session is {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR}. */
    @NativeType("int32_t")
    public int constantQp() { return nconstantQp(address()); }
    /** a pointer to a {@code StdVideoEncodeH265SliceSegmentHeader} structure specifying the slice segment header for the current slice segment. */
    @NativeType("StdVideoEncodeH265SliceSegmentHeader const *")
    public StdVideoEncodeH265SliceSegmentHeader pStdSliceSegmentHeader() { return npStdSliceSegmentHeader(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265NaluSliceSegmentInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH265NaluSliceSegmentInfoEXT sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265NaluSliceSegmentInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #constantQp} field. */
    public VkVideoEncodeH265NaluSliceSegmentInfoEXT constantQp(@NativeType("int32_t") int value) { nconstantQp(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH265SliceSegmentHeader} to the {@link #pStdSliceSegmentHeader} field. */
    public VkVideoEncodeH265NaluSliceSegmentInfoEXT pStdSliceSegmentHeader(@NativeType("StdVideoEncodeH265SliceSegmentHeader const *") StdVideoEncodeH265SliceSegmentHeader value) { npStdSliceSegmentHeader(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265NaluSliceSegmentInfoEXT set(
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
    public VkVideoEncodeH265NaluSliceSegmentInfoEXT set(VkVideoEncodeH265NaluSliceSegmentInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265NaluSliceSegmentInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265NaluSliceSegmentInfoEXT malloc() {
        return new VkVideoEncodeH265NaluSliceSegmentInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265NaluSliceSegmentInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265NaluSliceSegmentInfoEXT calloc() {
        return new VkVideoEncodeH265NaluSliceSegmentInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265NaluSliceSegmentInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265NaluSliceSegmentInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265NaluSliceSegmentInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265NaluSliceSegmentInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH265NaluSliceSegmentInfoEXT create(long address) {
        return new VkVideoEncodeH265NaluSliceSegmentInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265NaluSliceSegmentInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265NaluSliceSegmentInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265NaluSliceSegmentInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265NaluSliceSegmentInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH265NaluSliceSegmentInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265NaluSliceSegmentInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265NaluSliceSegmentInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH265NaluSliceSegmentInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265NaluSliceSegmentInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265NaluSliceSegmentInfoEXT.PNEXT); }
    /** Unsafe version of {@link #constantQp}. */
    public static int nconstantQp(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265NaluSliceSegmentInfoEXT.CONSTANTQP); }
    /** Unsafe version of {@link #pStdSliceSegmentHeader}. */
    public static StdVideoEncodeH265SliceSegmentHeader npStdSliceSegmentHeader(long struct) { return StdVideoEncodeH265SliceSegmentHeader.create(memGetAddress(struct + VkVideoEncodeH265NaluSliceSegmentInfoEXT.PSTDSLICESEGMENTHEADER)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265NaluSliceSegmentInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265NaluSliceSegmentInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #constantQp(int) constantQp}. */
    public static void nconstantQp(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265NaluSliceSegmentInfoEXT.CONSTANTQP, value); }
    /** Unsafe version of {@link #pStdSliceSegmentHeader(StdVideoEncodeH265SliceSegmentHeader) pStdSliceSegmentHeader}. */
    public static void npStdSliceSegmentHeader(long struct, StdVideoEncodeH265SliceSegmentHeader value) { memPutAddress(struct + VkVideoEncodeH265NaluSliceSegmentInfoEXT.PSTDSLICESEGMENTHEADER, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pStdSliceSegmentHeader = memGetAddress(struct + VkVideoEncodeH265NaluSliceSegmentInfoEXT.PSTDSLICESEGMENTHEADER);
        check(pStdSliceSegmentHeader);
        StdVideoEncodeH265SliceSegmentHeader.validate(pStdSliceSegmentHeader);
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265NaluSliceSegmentInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265NaluSliceSegmentInfoEXT ELEMENT_FACTORY = VkVideoEncodeH265NaluSliceSegmentInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH265NaluSliceSegmentInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265NaluSliceSegmentInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265NaluSliceSegmentInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT#constantQp} field. */
        @NativeType("int32_t")
        public int constantQp() { return VkVideoEncodeH265NaluSliceSegmentInfoEXT.nconstantQp(address()); }
        /** @return a {@link StdVideoEncodeH265SliceSegmentHeader} view of the struct pointed to by the {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT#pStdSliceSegmentHeader} field. */
        @NativeType("StdVideoEncodeH265SliceSegmentHeader const *")
        public StdVideoEncodeH265SliceSegmentHeader pStdSliceSegmentHeader() { return VkVideoEncodeH265NaluSliceSegmentInfoEXT.npStdSliceSegmentHeader(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT#sType} field. */
        public VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265NaluSliceSegmentInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_EXT} value to the {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT#sType} field. */
        public VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT#pNext} field. */
        public VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265NaluSliceSegmentInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT#constantQp} field. */
        public VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer constantQp(@NativeType("int32_t") int value) { VkVideoEncodeH265NaluSliceSegmentInfoEXT.nconstantQp(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH265SliceSegmentHeader} to the {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT#pStdSliceSegmentHeader} field. */
        public VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer pStdSliceSegmentHeader(@NativeType("StdVideoEncodeH265SliceSegmentHeader const *") StdVideoEncodeH265SliceSegmentHeader value) { VkVideoEncodeH265NaluSliceSegmentInfoEXT.npStdSliceSegmentHeader(address(), value); return this; }

    }

}