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
 * Structure specifies H.264 encode slice NALU parameters.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code pStdReferenceFinalLists} is not {@code NULL}, {@code pStdReferenceFinalLists} <b>must</b> be a valid pointer to a valid {@code StdVideoEncodeH264ReferenceListsInfo} value</li>
 * <li>{@code pStdSliceHeader} <b>must</b> be a valid pointer to a valid {@code StdVideoEncodeH264SliceHeader} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH264VclFrameInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH264NaluSliceInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #mbCount};
 *     {@link StdVideoEncodeH264ReferenceListsInfo StdVideoEncodeH264ReferenceListsInfo} const * {@link #pStdReferenceFinalLists};
 *     {@link StdVideoEncodeH264SliceHeader StdVideoEncodeH264SliceHeader} const * {@link #pStdSliceHeader};
 * }</code></pre>
 */
public class VkVideoEncodeH264NaluSliceInfoEXT extends Struct<VkVideoEncodeH264NaluSliceInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MBCOUNT,
        PSTDREFERENCEFINALLISTS,
        PSTDSLICEHEADER;

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
        MBCOUNT = layout.offsetof(2);
        PSTDREFERENCEFINALLISTS = layout.offsetof(3);
        PSTDSLICEHEADER = layout.offsetof(4);
    }

    protected VkVideoEncodeH264NaluSliceInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH264NaluSliceInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264NaluSliceInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH264NaluSliceInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264NaluSliceInfoEXT(ByteBuffer container) {
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
    /** the number of macroblocks in this slice. */
    @NativeType("uint32_t")
    public int mbCount() { return nmbCount(address()); }
    /** {@code NULL} or a pointer to a {@code StdVideoEncodeH264ReferenceListsInfo} structure specifying the reference lists to be used for the current slice. If {@code pStdReferenceFinalLists} is not {@code NULL}, these reference lists override the reference lists provided in {@link VkVideoEncodeH264VclFrameInfoEXT}{@code ::pStdReferenceFinalLists}. */
    @Nullable
    @NativeType("StdVideoEncodeH264ReferenceListsInfo const *")
    public StdVideoEncodeH264ReferenceListsInfo pStdReferenceFinalLists() { return npStdReferenceFinalLists(address()); }
    /** a pointer to a {@code StdVideoEncodeH264SliceHeader} structure specifying the slice header for the current slice. */
    @NativeType("StdVideoEncodeH264SliceHeader const *")
    public StdVideoEncodeH264SliceHeader pStdSliceHeader() { return npStdSliceHeader(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH264NaluSliceInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH264NaluSliceInfoEXT sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH264NaluSliceInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #mbCount} field. */
    public VkVideoEncodeH264NaluSliceInfoEXT mbCount(@NativeType("uint32_t") int value) { nmbCount(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264ReferenceListsInfo} to the {@link #pStdReferenceFinalLists} field. */
    public VkVideoEncodeH264NaluSliceInfoEXT pStdReferenceFinalLists(@Nullable @NativeType("StdVideoEncodeH264ReferenceListsInfo const *") StdVideoEncodeH264ReferenceListsInfo value) { npStdReferenceFinalLists(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264SliceHeader} to the {@link #pStdSliceHeader} field. */
    public VkVideoEncodeH264NaluSliceInfoEXT pStdSliceHeader(@NativeType("StdVideoEncodeH264SliceHeader const *") StdVideoEncodeH264SliceHeader value) { npStdSliceHeader(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264NaluSliceInfoEXT set(
        int sType,
        long pNext,
        int mbCount,
        @Nullable StdVideoEncodeH264ReferenceListsInfo pStdReferenceFinalLists,
        StdVideoEncodeH264SliceHeader pStdSliceHeader
    ) {
        sType(sType);
        pNext(pNext);
        mbCount(mbCount);
        pStdReferenceFinalLists(pStdReferenceFinalLists);
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
    public VkVideoEncodeH264NaluSliceInfoEXT set(VkVideoEncodeH264NaluSliceInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264NaluSliceInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264NaluSliceInfoEXT malloc() {
        return new VkVideoEncodeH264NaluSliceInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264NaluSliceInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264NaluSliceInfoEXT calloc() {
        return new VkVideoEncodeH264NaluSliceInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264NaluSliceInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264NaluSliceInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264NaluSliceInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264NaluSliceInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH264NaluSliceInfoEXT create(long address) {
        return new VkVideoEncodeH264NaluSliceInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264NaluSliceInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH264NaluSliceInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264NaluSliceInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264NaluSliceInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264NaluSliceInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264NaluSliceInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264NaluSliceInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264NaluSliceInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH264NaluSliceInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264NaluSliceInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264NaluSliceInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264NaluSliceInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264NaluSliceInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH264NaluSliceInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264NaluSliceInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264NaluSliceInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH264NaluSliceInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264NaluSliceInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264NaluSliceInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264NaluSliceInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264NaluSliceInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264NaluSliceInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264NaluSliceInfoEXT.PNEXT); }
    /** Unsafe version of {@link #mbCount}. */
    public static int nmbCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264NaluSliceInfoEXT.MBCOUNT); }
    /** Unsafe version of {@link #pStdReferenceFinalLists}. */
    @Nullable public static StdVideoEncodeH264ReferenceListsInfo npStdReferenceFinalLists(long struct) { return StdVideoEncodeH264ReferenceListsInfo.createSafe(memGetAddress(struct + VkVideoEncodeH264NaluSliceInfoEXT.PSTDREFERENCEFINALLISTS)); }
    /** Unsafe version of {@link #pStdSliceHeader}. */
    public static StdVideoEncodeH264SliceHeader npStdSliceHeader(long struct) { return StdVideoEncodeH264SliceHeader.create(memGetAddress(struct + VkVideoEncodeH264NaluSliceInfoEXT.PSTDSLICEHEADER)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264NaluSliceInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264NaluSliceInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #mbCount(int) mbCount}. */
    public static void nmbCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264NaluSliceInfoEXT.MBCOUNT, value); }
    /** Unsafe version of {@link #pStdReferenceFinalLists(StdVideoEncodeH264ReferenceListsInfo) pStdReferenceFinalLists}. */
    public static void npStdReferenceFinalLists(long struct, @Nullable StdVideoEncodeH264ReferenceListsInfo value) { memPutAddress(struct + VkVideoEncodeH264NaluSliceInfoEXT.PSTDREFERENCEFINALLISTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pStdSliceHeader(StdVideoEncodeH264SliceHeader) pStdSliceHeader}. */
    public static void npStdSliceHeader(long struct, StdVideoEncodeH264SliceHeader value) { memPutAddress(struct + VkVideoEncodeH264NaluSliceInfoEXT.PSTDSLICEHEADER, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pStdReferenceFinalLists = memGetAddress(struct + VkVideoEncodeH264NaluSliceInfoEXT.PSTDREFERENCEFINALLISTS);
        if (pStdReferenceFinalLists != NULL) {
            StdVideoEncodeH264ReferenceListsInfo.validate(pStdReferenceFinalLists);
        }
        long pStdSliceHeader = memGetAddress(struct + VkVideoEncodeH264NaluSliceInfoEXT.PSTDSLICEHEADER);
        check(pStdSliceHeader);
        StdVideoEncodeH264SliceHeader.validate(pStdSliceHeader);
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264NaluSliceInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264NaluSliceInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264NaluSliceInfoEXT ELEMENT_FACTORY = VkVideoEncodeH264NaluSliceInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264NaluSliceInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264NaluSliceInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH264NaluSliceInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH264NaluSliceInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264NaluSliceInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH264NaluSliceInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264NaluSliceInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH264NaluSliceInfoEXT#mbCount} field. */
        @NativeType("uint32_t")
        public int mbCount() { return VkVideoEncodeH264NaluSliceInfoEXT.nmbCount(address()); }
        /** @return a {@link StdVideoEncodeH264ReferenceListsInfo} view of the struct pointed to by the {@link VkVideoEncodeH264NaluSliceInfoEXT#pStdReferenceFinalLists} field. */
        @Nullable
        @NativeType("StdVideoEncodeH264ReferenceListsInfo const *")
        public StdVideoEncodeH264ReferenceListsInfo pStdReferenceFinalLists() { return VkVideoEncodeH264NaluSliceInfoEXT.npStdReferenceFinalLists(address()); }
        /** @return a {@link StdVideoEncodeH264SliceHeader} view of the struct pointed to by the {@link VkVideoEncodeH264NaluSliceInfoEXT#pStdSliceHeader} field. */
        @NativeType("StdVideoEncodeH264SliceHeader const *")
        public StdVideoEncodeH264SliceHeader pStdSliceHeader() { return VkVideoEncodeH264NaluSliceInfoEXT.npStdSliceHeader(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH264NaluSliceInfoEXT#sType} field. */
        public VkVideoEncodeH264NaluSliceInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264NaluSliceInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_INFO_EXT} value to the {@link VkVideoEncodeH264NaluSliceInfoEXT#sType} field. */
        public VkVideoEncodeH264NaluSliceInfoEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH264NaluSliceInfoEXT#pNext} field. */
        public VkVideoEncodeH264NaluSliceInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264NaluSliceInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264NaluSliceInfoEXT#mbCount} field. */
        public VkVideoEncodeH264NaluSliceInfoEXT.Buffer mbCount(@NativeType("uint32_t") int value) { VkVideoEncodeH264NaluSliceInfoEXT.nmbCount(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264ReferenceListsInfo} to the {@link VkVideoEncodeH264NaluSliceInfoEXT#pStdReferenceFinalLists} field. */
        public VkVideoEncodeH264NaluSliceInfoEXT.Buffer pStdReferenceFinalLists(@Nullable @NativeType("StdVideoEncodeH264ReferenceListsInfo const *") StdVideoEncodeH264ReferenceListsInfo value) { VkVideoEncodeH264NaluSliceInfoEXT.npStdReferenceFinalLists(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264SliceHeader} to the {@link VkVideoEncodeH264NaluSliceInfoEXT#pStdSliceHeader} field. */
        public VkVideoEncodeH264NaluSliceInfoEXT.Buffer pStdSliceHeader(@NativeType("StdVideoEncodeH264SliceHeader const *") StdVideoEncodeH264SliceHeader value) { VkVideoEncodeH264NaluSliceInfoEXT.npStdSliceHeader(address(), value); return this; }

    }

}