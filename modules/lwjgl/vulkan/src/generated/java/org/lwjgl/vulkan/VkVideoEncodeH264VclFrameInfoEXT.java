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
 * Structure specifies H.264 encode frame parameters.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_VCL_FRAME_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_VCL_FRAME_INFO_EXT}</li>
 * <li>If {@code pReferenceFinalLists} is not {@code NULL}, {@code pReferenceFinalLists} <b>must</b> be a valid pointer to a valid {@link VkVideoEncodeH264ReferenceListsEXT} structure</li>
 * <li>{@code pNaluSliceEntries} <b>must</b> be a valid pointer to an array of {@code naluSliceEntryCount} valid {@link VkVideoEncodeH264NaluSliceEXT} structures</li>
 * <li>{@code pCurrentPictureInfo} <b>must</b> be a valid pointer to a valid {@code StdVideoEncodeH264PictureInfo} value</li>
 * <li>{@code naluSliceEntryCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH264NaluSliceEXT}, {@link VkVideoEncodeH264ReferenceListsEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH264VclFrameInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link VkVideoEncodeH264ReferenceListsEXT VkVideoEncodeH264ReferenceListsEXT} const * {@link #pReferenceFinalLists};
 *     uint32_t {@link #naluSliceEntryCount};
 *     {@link VkVideoEncodeH264NaluSliceEXT VkVideoEncodeH264NaluSliceEXT} const * {@link #pNaluSliceEntries};
 *     {@link StdVideoEncodeH264PictureInfo StdVideoEncodeH264PictureInfo} const * {@link #pCurrentPictureInfo};
 * }</code></pre>
 */
public class VkVideoEncodeH264VclFrameInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PREFERENCEFINALLISTS,
        NALUSLICEENTRYCOUNT,
        PNALUSLICEENTRIES,
        PCURRENTPICTUREINFO;

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
        PREFERENCEFINALLISTS = layout.offsetof(2);
        NALUSLICEENTRYCOUNT = layout.offsetof(3);
        PNALUSLICEENTRIES = layout.offsetof(4);
        PCURRENTPICTUREINFO = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkVideoEncodeH264VclFrameInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264VclFrameInfoEXT(ByteBuffer container) {
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
    /** {@code NULL} or a pointer to a {@link VkVideoEncodeH264ReferenceListsEXT} structure specifying the reference lists to be used for the current picture. */
    @Nullable
    @NativeType("VkVideoEncodeH264ReferenceListsEXT const *")
    public VkVideoEncodeH264ReferenceListsEXT pReferenceFinalLists() { return npReferenceFinalLists(address()); }
    /** the number of slice NALUs in the frame. */
    @NativeType("uint32_t")
    public int naluSliceEntryCount() { return nnaluSliceEntryCount(address()); }
    /** a pointer to an array of {@code naluSliceEntryCount} {@link VkVideoEncodeH264NaluSliceEXT} structures specifying the division of the current picture into slices and the properties of these slices. This is an ordered sequence; the NALUs are generated consecutively in {@link VkVideoEncodeInfoKHR}{@code ::dstBitstreamBuffer} in the same order as in this array. */
    @NativeType("VkVideoEncodeH264NaluSliceEXT const *")
    public VkVideoEncodeH264NaluSliceEXT.Buffer pNaluSliceEntries() { return npNaluSliceEntries(address()); }
    /** a pointer to a {@code StdVideoEncodeH264PictureInfo} structure specifying the syntax and other codec-specific information from the H.264 specification associated with this picture. The information provided <b>must</b> reflect the decoded picture marking operations that are applicable to this frame. */
    @NativeType("StdVideoEncodeH264PictureInfo const *")
    public StdVideoEncodeH264PictureInfo pCurrentPictureInfo() { return npCurrentPictureInfo(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH264VclFrameInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_VCL_FRAME_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_VCL_FRAME_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH264VclFrameInfoEXT sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_VCL_FRAME_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH264VclFrameInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH264ReferenceListsEXT} to the {@link #pReferenceFinalLists} field. */
    public VkVideoEncodeH264VclFrameInfoEXT pReferenceFinalLists(@Nullable @NativeType("VkVideoEncodeH264ReferenceListsEXT const *") VkVideoEncodeH264ReferenceListsEXT value) { npReferenceFinalLists(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH264NaluSliceEXT.Buffer} to the {@link #pNaluSliceEntries} field. */
    public VkVideoEncodeH264VclFrameInfoEXT pNaluSliceEntries(@NativeType("VkVideoEncodeH264NaluSliceEXT const *") VkVideoEncodeH264NaluSliceEXT.Buffer value) { npNaluSliceEntries(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264PictureInfo} to the {@link #pCurrentPictureInfo} field. */
    public VkVideoEncodeH264VclFrameInfoEXT pCurrentPictureInfo(@NativeType("StdVideoEncodeH264PictureInfo const *") StdVideoEncodeH264PictureInfo value) { npCurrentPictureInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264VclFrameInfoEXT set(
        int sType,
        long pNext,
        @Nullable VkVideoEncodeH264ReferenceListsEXT pReferenceFinalLists,
        VkVideoEncodeH264NaluSliceEXT.Buffer pNaluSliceEntries,
        StdVideoEncodeH264PictureInfo pCurrentPictureInfo
    ) {
        sType(sType);
        pNext(pNext);
        pReferenceFinalLists(pReferenceFinalLists);
        pNaluSliceEntries(pNaluSliceEntries);
        pCurrentPictureInfo(pCurrentPictureInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH264VclFrameInfoEXT set(VkVideoEncodeH264VclFrameInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264VclFrameInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264VclFrameInfoEXT malloc() {
        return wrap(VkVideoEncodeH264VclFrameInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH264VclFrameInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264VclFrameInfoEXT calloc() {
        return wrap(VkVideoEncodeH264VclFrameInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH264VclFrameInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264VclFrameInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeH264VclFrameInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264VclFrameInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH264VclFrameInfoEXT create(long address) {
        return wrap(VkVideoEncodeH264VclFrameInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264VclFrameInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeH264VclFrameInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264VclFrameInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264VclFrameInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264VclFrameInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264VclFrameInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264VclFrameInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264VclFrameInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeH264VclFrameInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264VclFrameInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264VclFrameInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264VclFrameInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264VclFrameInfoEXT malloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH264VclFrameInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeH264VclFrameInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264VclFrameInfoEXT calloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH264VclFrameInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeH264VclFrameInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264VclFrameInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264VclFrameInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264VclFrameInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264VclFrameInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PNEXT); }
    /** Unsafe version of {@link #pReferenceFinalLists}. */
    @Nullable public static VkVideoEncodeH264ReferenceListsEXT npReferenceFinalLists(long struct) { return VkVideoEncodeH264ReferenceListsEXT.createSafe(memGetAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PREFERENCEFINALLISTS)); }
    /** Unsafe version of {@link #naluSliceEntryCount}. */
    public static int nnaluSliceEntryCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264VclFrameInfoEXT.NALUSLICEENTRYCOUNT); }
    /** Unsafe version of {@link #pNaluSliceEntries}. */
    public static VkVideoEncodeH264NaluSliceEXT.Buffer npNaluSliceEntries(long struct) { return VkVideoEncodeH264NaluSliceEXT.create(memGetAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PNALUSLICEENTRIES), nnaluSliceEntryCount(struct)); }
    /** Unsafe version of {@link #pCurrentPictureInfo}. */
    public static StdVideoEncodeH264PictureInfo npCurrentPictureInfo(long struct) { return StdVideoEncodeH264PictureInfo.create(memGetAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PCURRENTPICTUREINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264VclFrameInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #pReferenceFinalLists(VkVideoEncodeH264ReferenceListsEXT) pReferenceFinalLists}. */
    public static void npReferenceFinalLists(long struct, @Nullable VkVideoEncodeH264ReferenceListsEXT value) { memPutAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PREFERENCEFINALLISTS, memAddressSafe(value)); }
    /** Sets the specified value to the {@code naluSliceEntryCount} field of the specified {@code struct}. */
    public static void nnaluSliceEntryCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264VclFrameInfoEXT.NALUSLICEENTRYCOUNT, value); }
    /** Unsafe version of {@link #pNaluSliceEntries(VkVideoEncodeH264NaluSliceEXT.Buffer) pNaluSliceEntries}. */
    public static void npNaluSliceEntries(long struct, VkVideoEncodeH264NaluSliceEXT.Buffer value) { memPutAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PNALUSLICEENTRIES, value.address()); nnaluSliceEntryCount(struct, value.remaining()); }
    /** Unsafe version of {@link #pCurrentPictureInfo(StdVideoEncodeH264PictureInfo) pCurrentPictureInfo}. */
    public static void npCurrentPictureInfo(long struct, StdVideoEncodeH264PictureInfo value) { memPutAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PCURRENTPICTUREINFO, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pReferenceFinalLists = memGetAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PREFERENCEFINALLISTS);
        if (pReferenceFinalLists != NULL) {
            VkVideoEncodeH264ReferenceListsEXT.validate(pReferenceFinalLists);
        }
        int naluSliceEntryCount = nnaluSliceEntryCount(struct);
        long pNaluSliceEntries = memGetAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PNALUSLICEENTRIES);
        check(pNaluSliceEntries);
        validate(pNaluSliceEntries, naluSliceEntryCount, VkVideoEncodeH264NaluSliceEXT.SIZEOF, VkVideoEncodeH264NaluSliceEXT::validate);
        check(memGetAddress(struct + VkVideoEncodeH264VclFrameInfoEXT.PCURRENTPICTUREINFO));
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264VclFrameInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264VclFrameInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264VclFrameInfoEXT ELEMENT_FACTORY = VkVideoEncodeH264VclFrameInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264VclFrameInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264VclFrameInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoEncodeH264VclFrameInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH264VclFrameInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264VclFrameInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH264VclFrameInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264VclFrameInfoEXT.npNext(address()); }
        /** @return a {@link VkVideoEncodeH264ReferenceListsEXT} view of the struct pointed to by the {@link VkVideoEncodeH264VclFrameInfoEXT#pReferenceFinalLists} field. */
        @Nullable
        @NativeType("VkVideoEncodeH264ReferenceListsEXT const *")
        public VkVideoEncodeH264ReferenceListsEXT pReferenceFinalLists() { return VkVideoEncodeH264VclFrameInfoEXT.npReferenceFinalLists(address()); }
        /** @return the value of the {@link VkVideoEncodeH264VclFrameInfoEXT#naluSliceEntryCount} field. */
        @NativeType("uint32_t")
        public int naluSliceEntryCount() { return VkVideoEncodeH264VclFrameInfoEXT.nnaluSliceEntryCount(address()); }
        /** @return a {@link VkVideoEncodeH264NaluSliceEXT.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH264VclFrameInfoEXT#pNaluSliceEntries} field. */
        @NativeType("VkVideoEncodeH264NaluSliceEXT const *")
        public VkVideoEncodeH264NaluSliceEXT.Buffer pNaluSliceEntries() { return VkVideoEncodeH264VclFrameInfoEXT.npNaluSliceEntries(address()); }
        /** @return a {@link StdVideoEncodeH264PictureInfo} view of the struct pointed to by the {@link VkVideoEncodeH264VclFrameInfoEXT#pCurrentPictureInfo} field. */
        @NativeType("StdVideoEncodeH264PictureInfo const *")
        public StdVideoEncodeH264PictureInfo pCurrentPictureInfo() { return VkVideoEncodeH264VclFrameInfoEXT.npCurrentPictureInfo(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH264VclFrameInfoEXT#sType} field. */
        public VkVideoEncodeH264VclFrameInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264VclFrameInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_VCL_FRAME_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_VCL_FRAME_INFO_EXT} value to the {@link VkVideoEncodeH264VclFrameInfoEXT#sType} field. */
        public VkVideoEncodeH264VclFrameInfoEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_VCL_FRAME_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH264VclFrameInfoEXT#pNext} field. */
        public VkVideoEncodeH264VclFrameInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264VclFrameInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH264ReferenceListsEXT} to the {@link VkVideoEncodeH264VclFrameInfoEXT#pReferenceFinalLists} field. */
        public VkVideoEncodeH264VclFrameInfoEXT.Buffer pReferenceFinalLists(@Nullable @NativeType("VkVideoEncodeH264ReferenceListsEXT const *") VkVideoEncodeH264ReferenceListsEXT value) { VkVideoEncodeH264VclFrameInfoEXT.npReferenceFinalLists(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH264NaluSliceEXT.Buffer} to the {@link VkVideoEncodeH264VclFrameInfoEXT#pNaluSliceEntries} field. */
        public VkVideoEncodeH264VclFrameInfoEXT.Buffer pNaluSliceEntries(@NativeType("VkVideoEncodeH264NaluSliceEXT const *") VkVideoEncodeH264NaluSliceEXT.Buffer value) { VkVideoEncodeH264VclFrameInfoEXT.npNaluSliceEntries(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264PictureInfo} to the {@link VkVideoEncodeH264VclFrameInfoEXT#pCurrentPictureInfo} field. */
        public VkVideoEncodeH264VclFrameInfoEXT.Buffer pCurrentPictureInfo(@NativeType("StdVideoEncodeH264PictureInfo const *") StdVideoEncodeH264PictureInfo value) { VkVideoEncodeH264VclFrameInfoEXT.npCurrentPictureInfo(address(), value); return this; }

    }

}