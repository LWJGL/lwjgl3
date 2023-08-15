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
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_EXT}</li>
 * <li>{@code pNaluSliceEntries} <b>must</b> be a valid pointer to an array of {@code naluSliceEntryCount} valid {@link VkVideoEncodeH264NaluSliceInfoEXT} structures</li>
 * <li>{@code pStdPictureInfo} <b>must</b> be a valid pointer to a valid {@code StdVideoEncodeH264PictureInfo} value</li>
 * <li>{@code naluSliceEntryCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH264NaluSliceInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH264PictureInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #naluSliceEntryCount};
 *     {@link VkVideoEncodeH264NaluSliceInfoEXT VkVideoEncodeH264NaluSliceInfoEXT} const * {@link #pNaluSliceEntries};
 *     {@link StdVideoEncodeH264PictureInfo StdVideoEncodeH264PictureInfo} const * {@link #pStdPictureInfo};
 *     VkBool32 {@link #generatePrefixNalu};
 * }</code></pre>
 */
public class VkVideoEncodeH264PictureInfoEXT extends Struct<VkVideoEncodeH264PictureInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        NALUSLICEENTRYCOUNT,
        PNALUSLICEENTRIES,
        PSTDPICTUREINFO,
        GENERATEPREFIXNALU;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        NALUSLICEENTRYCOUNT = layout.offsetof(2);
        PNALUSLICEENTRIES = layout.offsetof(3);
        PSTDPICTUREINFO = layout.offsetof(4);
        GENERATEPREFIXNALU = layout.offsetof(5);
    }

    protected VkVideoEncodeH264PictureInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH264PictureInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264PictureInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH264PictureInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264PictureInfoEXT(ByteBuffer container) {
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
    /** the number of slice NALUs in the frame. */
    @NativeType("uint32_t")
    public int naluSliceEntryCount() { return nnaluSliceEntryCount(address()); }
    /** a pointer to an array of {@code naluSliceEntryCount} {@link VkVideoEncodeH264NaluSliceInfoEXT} structures specifying the division of the current picture into slices and the properties of these slices. This is an ordered sequence; the NALUs are generated consecutively in {@link VkVideoEncodeInfoKHR}{@code ::dstBuffer} in the same order as in this array. */
    @NativeType("VkVideoEncodeH264NaluSliceInfoEXT const *")
    public VkVideoEncodeH264NaluSliceInfoEXT.Buffer pNaluSliceEntries() { return npNaluSliceEntries(address()); }
    /** a pointer to a {@code StdVideoEncodeH264PictureInfo} structure specifying the syntax and other codec-specific information from the H.264 specification associated with this picture. The information provided <b>must</b> reflect the decoded picture marking operations that are applicable to this frame. */
    @NativeType("StdVideoEncodeH264PictureInfo const *")
    public StdVideoEncodeH264PictureInfo pStdPictureInfo() { return npStdPictureInfo(address()); }
    /** controls whether prefix NALUs are generated before slice NALUs into the target bitstream. */
    @NativeType("VkBool32")
    public boolean generatePrefixNalu() { return ngeneratePrefixNalu(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH264PictureInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH264PictureInfoEXT sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH264PictureInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH264NaluSliceInfoEXT.Buffer} to the {@link #pNaluSliceEntries} field. */
    public VkVideoEncodeH264PictureInfoEXT pNaluSliceEntries(@NativeType("VkVideoEncodeH264NaluSliceInfoEXT const *") VkVideoEncodeH264NaluSliceInfoEXT.Buffer value) { npNaluSliceEntries(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264PictureInfo} to the {@link #pStdPictureInfo} field. */
    public VkVideoEncodeH264PictureInfoEXT pStdPictureInfo(@NativeType("StdVideoEncodeH264PictureInfo const *") StdVideoEncodeH264PictureInfo value) { npStdPictureInfo(address(), value); return this; }
    /** Sets the specified value to the {@link #generatePrefixNalu} field. */
    public VkVideoEncodeH264PictureInfoEXT generatePrefixNalu(@NativeType("VkBool32") boolean value) { ngeneratePrefixNalu(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264PictureInfoEXT set(
        int sType,
        long pNext,
        VkVideoEncodeH264NaluSliceInfoEXT.Buffer pNaluSliceEntries,
        StdVideoEncodeH264PictureInfo pStdPictureInfo,
        boolean generatePrefixNalu
    ) {
        sType(sType);
        pNext(pNext);
        pNaluSliceEntries(pNaluSliceEntries);
        pStdPictureInfo(pStdPictureInfo);
        generatePrefixNalu(generatePrefixNalu);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH264PictureInfoEXT set(VkVideoEncodeH264PictureInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264PictureInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264PictureInfoEXT malloc() {
        return new VkVideoEncodeH264PictureInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264PictureInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264PictureInfoEXT calloc() {
        return new VkVideoEncodeH264PictureInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264PictureInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264PictureInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264PictureInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264PictureInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH264PictureInfoEXT create(long address) {
        return new VkVideoEncodeH264PictureInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264PictureInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH264PictureInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264PictureInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264PictureInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264PictureInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264PictureInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264PictureInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264PictureInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH264PictureInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264PictureInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264PictureInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264PictureInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264PictureInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH264PictureInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264PictureInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264PictureInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH264PictureInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264PictureInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264PictureInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264PictureInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264PictureInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264PictureInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264PictureInfoEXT.PNEXT); }
    /** Unsafe version of {@link #naluSliceEntryCount}. */
    public static int nnaluSliceEntryCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264PictureInfoEXT.NALUSLICEENTRYCOUNT); }
    /** Unsafe version of {@link #pNaluSliceEntries}. */
    public static VkVideoEncodeH264NaluSliceInfoEXT.Buffer npNaluSliceEntries(long struct) { return VkVideoEncodeH264NaluSliceInfoEXT.create(memGetAddress(struct + VkVideoEncodeH264PictureInfoEXT.PNALUSLICEENTRIES), nnaluSliceEntryCount(struct)); }
    /** Unsafe version of {@link #pStdPictureInfo}. */
    public static StdVideoEncodeH264PictureInfo npStdPictureInfo(long struct) { return StdVideoEncodeH264PictureInfo.create(memGetAddress(struct + VkVideoEncodeH264PictureInfoEXT.PSTDPICTUREINFO)); }
    /** Unsafe version of {@link #generatePrefixNalu}. */
    public static int ngeneratePrefixNalu(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264PictureInfoEXT.GENERATEPREFIXNALU); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264PictureInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264PictureInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code naluSliceEntryCount} field of the specified {@code struct}. */
    public static void nnaluSliceEntryCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264PictureInfoEXT.NALUSLICEENTRYCOUNT, value); }
    /** Unsafe version of {@link #pNaluSliceEntries(VkVideoEncodeH264NaluSliceInfoEXT.Buffer) pNaluSliceEntries}. */
    public static void npNaluSliceEntries(long struct, VkVideoEncodeH264NaluSliceInfoEXT.Buffer value) { memPutAddress(struct + VkVideoEncodeH264PictureInfoEXT.PNALUSLICEENTRIES, value.address()); nnaluSliceEntryCount(struct, value.remaining()); }
    /** Unsafe version of {@link #pStdPictureInfo(StdVideoEncodeH264PictureInfo) pStdPictureInfo}. */
    public static void npStdPictureInfo(long struct, StdVideoEncodeH264PictureInfo value) { memPutAddress(struct + VkVideoEncodeH264PictureInfoEXT.PSTDPICTUREINFO, value.address()); }
    /** Unsafe version of {@link #generatePrefixNalu(boolean) generatePrefixNalu}. */
    public static void ngeneratePrefixNalu(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264PictureInfoEXT.GENERATEPREFIXNALU, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int naluSliceEntryCount = nnaluSliceEntryCount(struct);
        long pNaluSliceEntries = memGetAddress(struct + VkVideoEncodeH264PictureInfoEXT.PNALUSLICEENTRIES);
        check(pNaluSliceEntries);
        validate(pNaluSliceEntries, naluSliceEntryCount, VkVideoEncodeH264NaluSliceInfoEXT.SIZEOF, VkVideoEncodeH264NaluSliceInfoEXT::validate);
        long pStdPictureInfo = memGetAddress(struct + VkVideoEncodeH264PictureInfoEXT.PSTDPICTUREINFO);
        check(pStdPictureInfo);
        StdVideoEncodeH264PictureInfo.validate(pStdPictureInfo);
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264PictureInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264PictureInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264PictureInfoEXT ELEMENT_FACTORY = VkVideoEncodeH264PictureInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264PictureInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264PictureInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH264PictureInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH264PictureInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264PictureInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH264PictureInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264PictureInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH264PictureInfoEXT#naluSliceEntryCount} field. */
        @NativeType("uint32_t")
        public int naluSliceEntryCount() { return VkVideoEncodeH264PictureInfoEXT.nnaluSliceEntryCount(address()); }
        /** @return a {@link VkVideoEncodeH264NaluSliceInfoEXT.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH264PictureInfoEXT#pNaluSliceEntries} field. */
        @NativeType("VkVideoEncodeH264NaluSliceInfoEXT const *")
        public VkVideoEncodeH264NaluSliceInfoEXT.Buffer pNaluSliceEntries() { return VkVideoEncodeH264PictureInfoEXT.npNaluSliceEntries(address()); }
        /** @return a {@link StdVideoEncodeH264PictureInfo} view of the struct pointed to by the {@link VkVideoEncodeH264PictureInfoEXT#pStdPictureInfo} field. */
        @NativeType("StdVideoEncodeH264PictureInfo const *")
        public StdVideoEncodeH264PictureInfo pStdPictureInfo() { return VkVideoEncodeH264PictureInfoEXT.npStdPictureInfo(address()); }
        /** @return the value of the {@link VkVideoEncodeH264PictureInfoEXT#generatePrefixNalu} field. */
        @NativeType("VkBool32")
        public boolean generatePrefixNalu() { return VkVideoEncodeH264PictureInfoEXT.ngeneratePrefixNalu(address()) != 0; }

        /** Sets the specified value to the {@link VkVideoEncodeH264PictureInfoEXT#sType} field. */
        public VkVideoEncodeH264PictureInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264PictureInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_EXT} value to the {@link VkVideoEncodeH264PictureInfoEXT#sType} field. */
        public VkVideoEncodeH264PictureInfoEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH264PictureInfoEXT#pNext} field. */
        public VkVideoEncodeH264PictureInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264PictureInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH264NaluSliceInfoEXT.Buffer} to the {@link VkVideoEncodeH264PictureInfoEXT#pNaluSliceEntries} field. */
        public VkVideoEncodeH264PictureInfoEXT.Buffer pNaluSliceEntries(@NativeType("VkVideoEncodeH264NaluSliceInfoEXT const *") VkVideoEncodeH264NaluSliceInfoEXT.Buffer value) { VkVideoEncodeH264PictureInfoEXT.npNaluSliceEntries(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264PictureInfo} to the {@link VkVideoEncodeH264PictureInfoEXT#pStdPictureInfo} field. */
        public VkVideoEncodeH264PictureInfoEXT.Buffer pStdPictureInfo(@NativeType("StdVideoEncodeH264PictureInfo const *") StdVideoEncodeH264PictureInfo value) { VkVideoEncodeH264PictureInfoEXT.npStdPictureInfo(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264PictureInfoEXT#generatePrefixNalu} field. */
        public VkVideoEncodeH264PictureInfoEXT.Buffer generatePrefixNalu(@NativeType("VkBool32") boolean value) { VkVideoEncodeH264PictureInfoEXT.ngeneratePrefixNalu(address(), value ? 1 : 0); return this; }

    }

}