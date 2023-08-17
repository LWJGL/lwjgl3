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
 * Structure specifies H.265 encode frame parameters.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_EXT}</li>
 * <li>{@code pNaluSliceSegmentEntries} <b>must</b> be a valid pointer to an array of {@code naluSliceSegmentEntryCount} valid {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT} structures</li>
 * <li>{@code pStdPictureInfo} <b>must</b> be a valid pointer to a valid {@code StdVideoEncodeH265PictureInfo} value</li>
 * <li>{@code naluSliceSegmentEntryCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH265NaluSliceSegmentInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265PictureInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #naluSliceSegmentEntryCount};
 *     {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT VkVideoEncodeH265NaluSliceSegmentInfoEXT} const * {@link #pNaluSliceSegmentEntries};
 *     {@link StdVideoEncodeH265PictureInfo StdVideoEncodeH265PictureInfo} const * {@link #pStdPictureInfo};
 * }</code></pre>
 */
public class VkVideoEncodeH265PictureInfoEXT extends Struct<VkVideoEncodeH265PictureInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        NALUSLICESEGMENTENTRYCOUNT,
        PNALUSLICESEGMENTENTRIES,
        PSTDPICTUREINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        NALUSLICESEGMENTENTRYCOUNT = layout.offsetof(2);
        PNALUSLICESEGMENTENTRIES = layout.offsetof(3);
        PSTDPICTUREINFO = layout.offsetof(4);
    }

    protected VkVideoEncodeH265PictureInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265PictureInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265PictureInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265PictureInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265PictureInfoEXT(ByteBuffer container) {
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
    /** the number of slice segment NALUs in the frame. */
    @NativeType("uint32_t")
    public int naluSliceSegmentEntryCount() { return nnaluSliceSegmentEntryCount(address()); }
    /** a pointer to an array of {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT} structures specifying the division of the current picture into slice segments and the properties of these slice segments. */
    @NativeType("VkVideoEncodeH265NaluSliceSegmentInfoEXT const *")
    public VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer pNaluSliceSegmentEntries() { return npNaluSliceSegmentEntries(address()); }
    /** a pointer to a {@code StdVideoEncodeH265PictureInfo} structure specifying the syntax and other codec-specific information from the H.265 specification, associated with this picture. */
    @NativeType("StdVideoEncodeH265PictureInfo const *")
    public StdVideoEncodeH265PictureInfo pStdPictureInfo() { return npStdPictureInfo(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265PictureInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH265PictureInfoEXT sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265PictureInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer} to the {@link #pNaluSliceSegmentEntries} field. */
    public VkVideoEncodeH265PictureInfoEXT pNaluSliceSegmentEntries(@NativeType("VkVideoEncodeH265NaluSliceSegmentInfoEXT const *") VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer value) { npNaluSliceSegmentEntries(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH265PictureInfo} to the {@link #pStdPictureInfo} field. */
    public VkVideoEncodeH265PictureInfoEXT pStdPictureInfo(@NativeType("StdVideoEncodeH265PictureInfo const *") StdVideoEncodeH265PictureInfo value) { npStdPictureInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265PictureInfoEXT set(
        int sType,
        long pNext,
        VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer pNaluSliceSegmentEntries,
        StdVideoEncodeH265PictureInfo pStdPictureInfo
    ) {
        sType(sType);
        pNext(pNext);
        pNaluSliceSegmentEntries(pNaluSliceSegmentEntries);
        pStdPictureInfo(pStdPictureInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH265PictureInfoEXT set(VkVideoEncodeH265PictureInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265PictureInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265PictureInfoEXT malloc() {
        return new VkVideoEncodeH265PictureInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265PictureInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265PictureInfoEXT calloc() {
        return new VkVideoEncodeH265PictureInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265PictureInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265PictureInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265PictureInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265PictureInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH265PictureInfoEXT create(long address) {
        return new VkVideoEncodeH265PictureInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265PictureInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265PictureInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265PictureInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265PictureInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265PictureInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265PictureInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265PictureInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265PictureInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265PictureInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265PictureInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265PictureInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265PictureInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265PictureInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH265PictureInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265PictureInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265PictureInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH265PictureInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265PictureInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265PictureInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265PictureInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265PictureInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265PictureInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265PictureInfoEXT.PNEXT); }
    /** Unsafe version of {@link #naluSliceSegmentEntryCount}. */
    public static int nnaluSliceSegmentEntryCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265PictureInfoEXT.NALUSLICESEGMENTENTRYCOUNT); }
    /** Unsafe version of {@link #pNaluSliceSegmentEntries}. */
    public static VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer npNaluSliceSegmentEntries(long struct) { return VkVideoEncodeH265NaluSliceSegmentInfoEXT.create(memGetAddress(struct + VkVideoEncodeH265PictureInfoEXT.PNALUSLICESEGMENTENTRIES), nnaluSliceSegmentEntryCount(struct)); }
    /** Unsafe version of {@link #pStdPictureInfo}. */
    public static StdVideoEncodeH265PictureInfo npStdPictureInfo(long struct) { return StdVideoEncodeH265PictureInfo.create(memGetAddress(struct + VkVideoEncodeH265PictureInfoEXT.PSTDPICTUREINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265PictureInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265PictureInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code naluSliceSegmentEntryCount} field of the specified {@code struct}. */
    public static void nnaluSliceSegmentEntryCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265PictureInfoEXT.NALUSLICESEGMENTENTRYCOUNT, value); }
    /** Unsafe version of {@link #pNaluSliceSegmentEntries(VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer) pNaluSliceSegmentEntries}. */
    public static void npNaluSliceSegmentEntries(long struct, VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer value) { memPutAddress(struct + VkVideoEncodeH265PictureInfoEXT.PNALUSLICESEGMENTENTRIES, value.address()); nnaluSliceSegmentEntryCount(struct, value.remaining()); }
    /** Unsafe version of {@link #pStdPictureInfo(StdVideoEncodeH265PictureInfo) pStdPictureInfo}. */
    public static void npStdPictureInfo(long struct, StdVideoEncodeH265PictureInfo value) { memPutAddress(struct + VkVideoEncodeH265PictureInfoEXT.PSTDPICTUREINFO, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int naluSliceSegmentEntryCount = nnaluSliceSegmentEntryCount(struct);
        long pNaluSliceSegmentEntries = memGetAddress(struct + VkVideoEncodeH265PictureInfoEXT.PNALUSLICESEGMENTENTRIES);
        check(pNaluSliceSegmentEntries);
        validate(pNaluSliceSegmentEntries, naluSliceSegmentEntryCount, VkVideoEncodeH265NaluSliceSegmentInfoEXT.SIZEOF, VkVideoEncodeH265NaluSliceSegmentInfoEXT::validate);
        long pStdPictureInfo = memGetAddress(struct + VkVideoEncodeH265PictureInfoEXT.PSTDPICTUREINFO);
        check(pStdPictureInfo);
        StdVideoEncodeH265PictureInfo.validate(pStdPictureInfo);
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265PictureInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265PictureInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265PictureInfoEXT ELEMENT_FACTORY = VkVideoEncodeH265PictureInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265PictureInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265PictureInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH265PictureInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265PictureInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265PictureInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265PictureInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265PictureInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265PictureInfoEXT#naluSliceSegmentEntryCount} field. */
        @NativeType("uint32_t")
        public int naluSliceSegmentEntryCount() { return VkVideoEncodeH265PictureInfoEXT.nnaluSliceSegmentEntryCount(address()); }
        /** @return a {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH265PictureInfoEXT#pNaluSliceSegmentEntries} field. */
        @NativeType("VkVideoEncodeH265NaluSliceSegmentInfoEXT const *")
        public VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer pNaluSliceSegmentEntries() { return VkVideoEncodeH265PictureInfoEXT.npNaluSliceSegmentEntries(address()); }
        /** @return a {@link StdVideoEncodeH265PictureInfo} view of the struct pointed to by the {@link VkVideoEncodeH265PictureInfoEXT#pStdPictureInfo} field. */
        @NativeType("StdVideoEncodeH265PictureInfo const *")
        public StdVideoEncodeH265PictureInfo pStdPictureInfo() { return VkVideoEncodeH265PictureInfoEXT.npStdPictureInfo(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265PictureInfoEXT#sType} field. */
        public VkVideoEncodeH265PictureInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265PictureInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_EXT} value to the {@link VkVideoEncodeH265PictureInfoEXT#sType} field. */
        public VkVideoEncodeH265PictureInfoEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH265PictureInfoEXT#pNext} field. */
        public VkVideoEncodeH265PictureInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265PictureInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer} to the {@link VkVideoEncodeH265PictureInfoEXT#pNaluSliceSegmentEntries} field. */
        public VkVideoEncodeH265PictureInfoEXT.Buffer pNaluSliceSegmentEntries(@NativeType("VkVideoEncodeH265NaluSliceSegmentInfoEXT const *") VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer value) { VkVideoEncodeH265PictureInfoEXT.npNaluSliceSegmentEntries(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH265PictureInfo} to the {@link VkVideoEncodeH265PictureInfoEXT#pStdPictureInfo} field. */
        public VkVideoEncodeH265PictureInfoEXT.Buffer pStdPictureInfo(@NativeType("StdVideoEncodeH265PictureInfo const *") StdVideoEncodeH265PictureInfo value) { VkVideoEncodeH265PictureInfoEXT.npStdPictureInfo(address(), value); return this; }

    }

}