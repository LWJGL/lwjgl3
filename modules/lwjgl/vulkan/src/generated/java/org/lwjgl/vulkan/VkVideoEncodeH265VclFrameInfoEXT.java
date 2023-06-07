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
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_VCL_FRAME_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_VCL_FRAME_INFO_EXT}</li>
 * <li>If {@code pStdReferenceFinalLists} is not {@code NULL}, {@code pStdReferenceFinalLists} <b>must</b> be a valid pointer to a valid {@code StdVideoEncodeH265ReferenceListsInfo} value</li>
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
 * struct VkVideoEncodeH265VclFrameInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link StdVideoEncodeH265ReferenceModifications StdVideoEncodeH265ReferenceModifications} const * {@link #pStdReferenceFinalLists};
 *     uint32_t {@link #naluSliceSegmentEntryCount};
 *     {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT VkVideoEncodeH265NaluSliceSegmentInfoEXT} const * {@link #pNaluSliceSegmentEntries};
 *     {@link StdVideoEncodeH265PictureInfo StdVideoEncodeH265PictureInfo} const * {@link #pStdPictureInfo};
 * }</code></pre>
 */
public class VkVideoEncodeH265VclFrameInfoEXT extends Struct<VkVideoEncodeH265VclFrameInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PSTDREFERENCEFINALLISTS,
        NALUSLICESEGMENTENTRYCOUNT,
        PNALUSLICESEGMENTENTRIES,
        PSTDPICTUREINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDREFERENCEFINALLISTS = layout.offsetof(2);
        NALUSLICESEGMENTENTRYCOUNT = layout.offsetof(3);
        PNALUSLICESEGMENTENTRIES = layout.offsetof(4);
        PSTDPICTUREINFO = layout.offsetof(5);
    }

    protected VkVideoEncodeH265VclFrameInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265VclFrameInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265VclFrameInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265VclFrameInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265VclFrameInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** {@code NULL} or a pointer to a {@code StdVideoEncodeH265ReferenceListsInfo} structure specifying the reference lists to be used for the current picture. */
    @Nullable
    @NativeType("StdVideoEncodeH265ReferenceModifications const *")
    public StdVideoEncodeH265ReferenceModifications pStdReferenceFinalLists() { return npStdReferenceFinalLists(address()); }
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
    public VkVideoEncodeH265VclFrameInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_VCL_FRAME_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_VCL_FRAME_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH265VclFrameInfoEXT sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_VCL_FRAME_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265VclFrameInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH265ReferenceModifications} to the {@link #pStdReferenceFinalLists} field. */
    public VkVideoEncodeH265VclFrameInfoEXT pStdReferenceFinalLists(@Nullable @NativeType("StdVideoEncodeH265ReferenceModifications const *") StdVideoEncodeH265ReferenceModifications value) { npStdReferenceFinalLists(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer} to the {@link #pNaluSliceSegmentEntries} field. */
    public VkVideoEncodeH265VclFrameInfoEXT pNaluSliceSegmentEntries(@NativeType("VkVideoEncodeH265NaluSliceSegmentInfoEXT const *") VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer value) { npNaluSliceSegmentEntries(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH265PictureInfo} to the {@link #pStdPictureInfo} field. */
    public VkVideoEncodeH265VclFrameInfoEXT pStdPictureInfo(@NativeType("StdVideoEncodeH265PictureInfo const *") StdVideoEncodeH265PictureInfo value) { npStdPictureInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265VclFrameInfoEXT set(
        int sType,
        long pNext,
        @Nullable StdVideoEncodeH265ReferenceModifications pStdReferenceFinalLists,
        VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer pNaluSliceSegmentEntries,
        StdVideoEncodeH265PictureInfo pStdPictureInfo
    ) {
        sType(sType);
        pNext(pNext);
        pStdReferenceFinalLists(pStdReferenceFinalLists);
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
    public VkVideoEncodeH265VclFrameInfoEXT set(VkVideoEncodeH265VclFrameInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265VclFrameInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265VclFrameInfoEXT malloc() {
        return new VkVideoEncodeH265VclFrameInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265VclFrameInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265VclFrameInfoEXT calloc() {
        return new VkVideoEncodeH265VclFrameInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265VclFrameInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265VclFrameInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265VclFrameInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265VclFrameInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH265VclFrameInfoEXT create(long address) {
        return new VkVideoEncodeH265VclFrameInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265VclFrameInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265VclFrameInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265VclFrameInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265VclFrameInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265VclFrameInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265VclFrameInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265VclFrameInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265VclFrameInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265VclFrameInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265VclFrameInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265VclFrameInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265VclFrameInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265VclFrameInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH265VclFrameInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265VclFrameInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265VclFrameInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH265VclFrameInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265VclFrameInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265VclFrameInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265VclFrameInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265VclFrameInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265VclFrameInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265VclFrameInfoEXT.PNEXT); }
    /** Unsafe version of {@link #pStdReferenceFinalLists}. */
    @Nullable public static StdVideoEncodeH265ReferenceModifications npStdReferenceFinalLists(long struct) { return StdVideoEncodeH265ReferenceModifications.createSafe(memGetAddress(struct + VkVideoEncodeH265VclFrameInfoEXT.PSTDREFERENCEFINALLISTS)); }
    /** Unsafe version of {@link #naluSliceSegmentEntryCount}. */
    public static int nnaluSliceSegmentEntryCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265VclFrameInfoEXT.NALUSLICESEGMENTENTRYCOUNT); }
    /** Unsafe version of {@link #pNaluSliceSegmentEntries}. */
    public static VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer npNaluSliceSegmentEntries(long struct) { return VkVideoEncodeH265NaluSliceSegmentInfoEXT.create(memGetAddress(struct + VkVideoEncodeH265VclFrameInfoEXT.PNALUSLICESEGMENTENTRIES), nnaluSliceSegmentEntryCount(struct)); }
    /** Unsafe version of {@link #pStdPictureInfo}. */
    public static StdVideoEncodeH265PictureInfo npStdPictureInfo(long struct) { return StdVideoEncodeH265PictureInfo.create(memGetAddress(struct + VkVideoEncodeH265VclFrameInfoEXT.PSTDPICTUREINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265VclFrameInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265VclFrameInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #pStdReferenceFinalLists(StdVideoEncodeH265ReferenceModifications) pStdReferenceFinalLists}. */
    public static void npStdReferenceFinalLists(long struct, @Nullable StdVideoEncodeH265ReferenceModifications value) { memPutAddress(struct + VkVideoEncodeH265VclFrameInfoEXT.PSTDREFERENCEFINALLISTS, memAddressSafe(value)); }
    /** Sets the specified value to the {@code naluSliceSegmentEntryCount} field of the specified {@code struct}. */
    public static void nnaluSliceSegmentEntryCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265VclFrameInfoEXT.NALUSLICESEGMENTENTRYCOUNT, value); }
    /** Unsafe version of {@link #pNaluSliceSegmentEntries(VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer) pNaluSliceSegmentEntries}. */
    public static void npNaluSliceSegmentEntries(long struct, VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer value) { memPutAddress(struct + VkVideoEncodeH265VclFrameInfoEXT.PNALUSLICESEGMENTENTRIES, value.address()); nnaluSliceSegmentEntryCount(struct, value.remaining()); }
    /** Unsafe version of {@link #pStdPictureInfo(StdVideoEncodeH265PictureInfo) pStdPictureInfo}. */
    public static void npStdPictureInfo(long struct, StdVideoEncodeH265PictureInfo value) { memPutAddress(struct + VkVideoEncodeH265VclFrameInfoEXT.PSTDPICTUREINFO, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pStdReferenceFinalLists = memGetAddress(struct + VkVideoEncodeH265VclFrameInfoEXT.PSTDREFERENCEFINALLISTS);
        if (pStdReferenceFinalLists != NULL) {
            StdVideoEncodeH265ReferenceModifications.validate(pStdReferenceFinalLists);
        }
        int naluSliceSegmentEntryCount = nnaluSliceSegmentEntryCount(struct);
        long pNaluSliceSegmentEntries = memGetAddress(struct + VkVideoEncodeH265VclFrameInfoEXT.PNALUSLICESEGMENTENTRIES);
        check(pNaluSliceSegmentEntries);
        validate(pNaluSliceSegmentEntries, naluSliceSegmentEntryCount, VkVideoEncodeH265NaluSliceSegmentInfoEXT.SIZEOF, VkVideoEncodeH265NaluSliceSegmentInfoEXT::validate);
        check(memGetAddress(struct + VkVideoEncodeH265VclFrameInfoEXT.PSTDPICTUREINFO));
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265VclFrameInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265VclFrameInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265VclFrameInfoEXT ELEMENT_FACTORY = VkVideoEncodeH265VclFrameInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265VclFrameInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265VclFrameInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH265VclFrameInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265VclFrameInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265VclFrameInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265VclFrameInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265VclFrameInfoEXT.npNext(address()); }
        /** @return a {@link StdVideoEncodeH265ReferenceModifications} view of the struct pointed to by the {@link VkVideoEncodeH265VclFrameInfoEXT#pStdReferenceFinalLists} field. */
        @Nullable
        @NativeType("StdVideoEncodeH265ReferenceModifications const *")
        public StdVideoEncodeH265ReferenceModifications pStdReferenceFinalLists() { return VkVideoEncodeH265VclFrameInfoEXT.npStdReferenceFinalLists(address()); }
        /** @return the value of the {@link VkVideoEncodeH265VclFrameInfoEXT#naluSliceSegmentEntryCount} field. */
        @NativeType("uint32_t")
        public int naluSliceSegmentEntryCount() { return VkVideoEncodeH265VclFrameInfoEXT.nnaluSliceSegmentEntryCount(address()); }
        /** @return a {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH265VclFrameInfoEXT#pNaluSliceSegmentEntries} field. */
        @NativeType("VkVideoEncodeH265NaluSliceSegmentInfoEXT const *")
        public VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer pNaluSliceSegmentEntries() { return VkVideoEncodeH265VclFrameInfoEXT.npNaluSliceSegmentEntries(address()); }
        /** @return a {@link StdVideoEncodeH265PictureInfo} view of the struct pointed to by the {@link VkVideoEncodeH265VclFrameInfoEXT#pStdPictureInfo} field. */
        @NativeType("StdVideoEncodeH265PictureInfo const *")
        public StdVideoEncodeH265PictureInfo pStdPictureInfo() { return VkVideoEncodeH265VclFrameInfoEXT.npStdPictureInfo(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265VclFrameInfoEXT#sType} field. */
        public VkVideoEncodeH265VclFrameInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265VclFrameInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_VCL_FRAME_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_VCL_FRAME_INFO_EXT} value to the {@link VkVideoEncodeH265VclFrameInfoEXT#sType} field. */
        public VkVideoEncodeH265VclFrameInfoEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_VCL_FRAME_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH265VclFrameInfoEXT#pNext} field. */
        public VkVideoEncodeH265VclFrameInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265VclFrameInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH265ReferenceModifications} to the {@link VkVideoEncodeH265VclFrameInfoEXT#pStdReferenceFinalLists} field. */
        public VkVideoEncodeH265VclFrameInfoEXT.Buffer pStdReferenceFinalLists(@Nullable @NativeType("StdVideoEncodeH265ReferenceModifications const *") StdVideoEncodeH265ReferenceModifications value) { VkVideoEncodeH265VclFrameInfoEXT.npStdReferenceFinalLists(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer} to the {@link VkVideoEncodeH265VclFrameInfoEXT#pNaluSliceSegmentEntries} field. */
        public VkVideoEncodeH265VclFrameInfoEXT.Buffer pNaluSliceSegmentEntries(@NativeType("VkVideoEncodeH265NaluSliceSegmentInfoEXT const *") VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer value) { VkVideoEncodeH265VclFrameInfoEXT.npNaluSliceSegmentEntries(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH265PictureInfo} to the {@link VkVideoEncodeH265VclFrameInfoEXT#pStdPictureInfo} field. */
        public VkVideoEncodeH265VclFrameInfoEXT.Buffer pStdPictureInfo(@NativeType("StdVideoEncodeH265PictureInfo const *") StdVideoEncodeH265PictureInfo value) { VkVideoEncodeH265VclFrameInfoEXT.npStdPictureInfo(address(), value); return this; }

    }

}