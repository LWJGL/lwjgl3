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
 * Structure specifies H.265 picture information when decoding a frame.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure is specified in the {@code pNext} chain of the {@link VkVideoDecodeInfoKHR} structure passed to {@link KHRVideoDecodeQueue#vkCmdDecodeVideoKHR CmdDecodeVideoKHR} to specify the codec-specific picture information for an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h265">H.265 decode operation</a>.</p>
 * 
 * <dl>
 * <dt>Decode Output Picture Information</dt>
 * <dd><ul>
 * <li>The image subregion used is determined according to the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h265-picture-data-access">H.265 Decode Picture Data Access</a> section.</li>
 * <li>The decode output picture is associated with the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h265-picture-info">H.265 picture information</a> provided in {@code pStdPictureInfo}.</li>
 * </ul></dd>
 * </dl>
 * 
 * <dl>
 * <dt>Std Picture Information</dt>
 * <dd><ul>
 * <li>{@code reserved} is used only for padding purposes and is otherwise ignored;</li>
 * <li>{@code flags.IrapPicFlag} as defined in section 3.73 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>;</li>
 * <li>{@code flags.IdrPicFlag} as defined in section 3.67 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>;</li>
 * <li>{@code flags.IsReference} as defined in section 3.132 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>;</li>
 * <li>{@code sps_video_parameter_set_id}, {@code pps_seq_parameter_set_id}, and {@code pps_pic_parameter_set_id} are used to identify the active parameter sets, as described below;</li>
 * <li>{@code PicOrderCntVal} as defined in section 8.3.1 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>;</li>
 * <li>{@code NumBitsForSTRefPicSetInSlice} is the number of bits used in {@code st_ref_pic_set} when {@code short_term_ref_pic_set_sps_flag} is 0, or 0 otherwise, as defined in sections 7.4.7 and 7.4.8 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>;</li>
 * <li>{@code NumDeltaPocsOfRefRpsIdx} is the value of {@code NumDeltaPocs[RefRpsIdx]} when {@code short_term_ref_pic_set_sps_flag} is 1, or 0 otherwise, as defined in sections 7.4.7 and 7.4.8 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>;</li>
 * <li>{@code RefPicSetStCurrBefore}, {@code RefPicSetStCurrAfter}, and {@code RefPicSetLtCurr} are interpreted as defined in section 8.3.2 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a> where each element of these arrays either identifies an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-active-reference-picture-info">active reference picture</a> using its <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slot</a> index or contains the value 0xFF to indicate "no reference picture";</li>
 * <li>all other members are interpreted as defined in section 8.3.2 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>.</li>
 * </ul></dd>
 * <dt>Active Parameter Sets</dt>
 * <dd><ul>
 * <li>The <em>active VPS</em> is the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h265-vps">VPS</a> identified by the key specified in {@code StdVideoDecodeH265PictureInfo}{@code ::sps_video_parameter_set_id}.</li>
 * <li>The <em>active SPS</em> is the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h265-sps">SPS</a> identified by the key specified by the pair constructed from {@code StdVideoDecodeH265PictureInfo}{@code ::sps_video_parameter_set_id} and {@code StdVideoDecodeH265PictureInfo}{@code ::pps_seq_parameter_set_id}.</li>
 * <li>The <em>active PPS</em> is the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h265-pps">PPS</a> identified by the key specified by the triplet constructed from {@code StdVideoDecodeH265PictureInfo}{@code ::sps_video_parameter_set_id}, {@code StdVideoDecodeH265PictureInfo}{@code ::pps_seq_parameter_set_id}, and {@code StdVideoDecodeH265PictureInfo}{@code ::pps_pic_parameter_set_id}.</li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoDecodeH265#VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_KHR}</li>
 * <li>{@code pStdPictureInfo} <b>must</b> be a valid pointer to a valid {@code StdVideoDecodeH265PictureInfo} value</li>
 * <li>{@code pSliceSegmentOffsets} <b>must</b> be a valid pointer to an array of {@code sliceSegmentCount} {@code uint32_t} values</li>
 * <li>{@code sliceSegmentCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoDecodeH265PictureInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link StdVideoDecodeH265PictureInfo StdVideoDecodeH265PictureInfo} const * {@link #pStdPictureInfo};
 *     uint32_t {@link #sliceSegmentCount};
 *     uint32_t const * {@link #pSliceSegmentOffsets};
 * }</code></pre>
 */
public class VkVideoDecodeH265PictureInfoKHR extends Struct<VkVideoDecodeH265PictureInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PSTDPICTUREINFO,
        SLICESEGMENTCOUNT,
        PSLICESEGMENTOFFSETS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDPICTUREINFO = layout.offsetof(2);
        SLICESEGMENTCOUNT = layout.offsetof(3);
        PSLICESEGMENTOFFSETS = layout.offsetof(4);
    }

    protected VkVideoDecodeH265PictureInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoDecodeH265PictureInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoDecodeH265PictureInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoDecodeH265PictureInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeH265PictureInfoKHR(ByteBuffer container) {
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
    /** a pointer to a {@code StdVideoDecodeH265PictureInfo} structure specifying <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h265-picture-info">H.265 picture information</a>. */
    @NativeType("StdVideoDecodeH265PictureInfo const *")
    public StdVideoDecodeH265PictureInfo pStdPictureInfo() { return npStdPictureInfo(address()); }
    /** the number of elements in {@code pSliceSegmentOffsets}. */
    @NativeType("uint32_t")
    public int sliceSegmentCount() { return nsliceSegmentCount(address()); }
    /** a pointer to an array of {@code sliceSegmentCount} offsets specifying the start offset of the slice segments of the picture within the video bitstream buffer range specified in {@link VkVideoDecodeInfoKHR}. */
    @NativeType("uint32_t const *")
    public IntBuffer pSliceSegmentOffsets() { return npSliceSegmentOffsets(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoDecodeH265PictureInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoDecodeH265#VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoDecodeH265PictureInfoKHR sType$Default() { return sType(KHRVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoDecodeH265PictureInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoDecodeH265PictureInfo} to the {@link #pStdPictureInfo} field. */
    public VkVideoDecodeH265PictureInfoKHR pStdPictureInfo(@NativeType("StdVideoDecodeH265PictureInfo const *") StdVideoDecodeH265PictureInfo value) { npStdPictureInfo(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pSliceSegmentOffsets} field. */
    public VkVideoDecodeH265PictureInfoKHR pSliceSegmentOffsets(@NativeType("uint32_t const *") IntBuffer value) { npSliceSegmentOffsets(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeH265PictureInfoKHR set(
        int sType,
        long pNext,
        StdVideoDecodeH265PictureInfo pStdPictureInfo,
        IntBuffer pSliceSegmentOffsets
    ) {
        sType(sType);
        pNext(pNext);
        pStdPictureInfo(pStdPictureInfo);
        pSliceSegmentOffsets(pSliceSegmentOffsets);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoDecodeH265PictureInfoKHR set(VkVideoDecodeH265PictureInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeH265PictureInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH265PictureInfoKHR malloc() {
        return new VkVideoDecodeH265PictureInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeH265PictureInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH265PictureInfoKHR calloc() {
        return new VkVideoDecodeH265PictureInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeH265PictureInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeH265PictureInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeH265PictureInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeH265PictureInfoKHR} instance for the specified memory address. */
    public static VkVideoDecodeH265PictureInfoKHR create(long address) {
        return new VkVideoDecodeH265PictureInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH265PictureInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoDecodeH265PictureInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265PictureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265PictureInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265PictureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265PictureInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265PictureInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265PictureInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoDecodeH265PictureInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265PictureInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH265PictureInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeH265PictureInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH265PictureInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeH265PictureInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoDecodeH265PictureInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH265PictureInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeH265PictureInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265PictureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265PictureInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265PictureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265PictureInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH265PictureInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeH265PictureInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pStdPictureInfo}. */
    public static StdVideoDecodeH265PictureInfo npStdPictureInfo(long struct) { return StdVideoDecodeH265PictureInfo.create(memGetAddress(struct + VkVideoDecodeH265PictureInfoKHR.PSTDPICTUREINFO)); }
    /** Unsafe version of {@link #sliceSegmentCount}. */
    public static int nsliceSegmentCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH265PictureInfoKHR.SLICESEGMENTCOUNT); }
    /** Unsafe version of {@link #pSliceSegmentOffsets() pSliceSegmentOffsets}. */
    public static IntBuffer npSliceSegmentOffsets(long struct) { return memIntBuffer(memGetAddress(struct + VkVideoDecodeH265PictureInfoKHR.PSLICESEGMENTOFFSETS), nsliceSegmentCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH265PictureInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeH265PictureInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pStdPictureInfo(StdVideoDecodeH265PictureInfo) pStdPictureInfo}. */
    public static void npStdPictureInfo(long struct, StdVideoDecodeH265PictureInfo value) { memPutAddress(struct + VkVideoDecodeH265PictureInfoKHR.PSTDPICTUREINFO, value.address()); }
    /** Sets the specified value to the {@code sliceSegmentCount} field of the specified {@code struct}. */
    public static void nsliceSegmentCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH265PictureInfoKHR.SLICESEGMENTCOUNT, value); }
    /** Unsafe version of {@link #pSliceSegmentOffsets(IntBuffer) pSliceSegmentOffsets}. */
    public static void npSliceSegmentOffsets(long struct, IntBuffer value) { memPutAddress(struct + VkVideoDecodeH265PictureInfoKHR.PSLICESEGMENTOFFSETS, memAddress(value)); nsliceSegmentCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkVideoDecodeH265PictureInfoKHR.PSTDPICTUREINFO));
        check(memGetAddress(struct + VkVideoDecodeH265PictureInfoKHR.PSLICESEGMENTOFFSETS));
    }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeH265PictureInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeH265PictureInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoDecodeH265PictureInfoKHR ELEMENT_FACTORY = VkVideoDecodeH265PictureInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeH265PictureInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeH265PictureInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoDecodeH265PictureInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoDecodeH265PictureInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeH265PictureInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoDecodeH265PictureInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeH265PictureInfoKHR.npNext(address()); }
        /** @return a {@link StdVideoDecodeH265PictureInfo} view of the struct pointed to by the {@link VkVideoDecodeH265PictureInfoKHR#pStdPictureInfo} field. */
        @NativeType("StdVideoDecodeH265PictureInfo const *")
        public StdVideoDecodeH265PictureInfo pStdPictureInfo() { return VkVideoDecodeH265PictureInfoKHR.npStdPictureInfo(address()); }
        /** @return the value of the {@link VkVideoDecodeH265PictureInfoKHR#sliceSegmentCount} field. */
        @NativeType("uint32_t")
        public int sliceSegmentCount() { return VkVideoDecodeH265PictureInfoKHR.nsliceSegmentCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkVideoDecodeH265PictureInfoKHR#pSliceSegmentOffsets} field. */
        @NativeType("uint32_t const *")
        public IntBuffer pSliceSegmentOffsets() { return VkVideoDecodeH265PictureInfoKHR.npSliceSegmentOffsets(address()); }

        /** Sets the specified value to the {@link VkVideoDecodeH265PictureInfoKHR#sType} field. */
        public VkVideoDecodeH265PictureInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeH265PictureInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoDecodeH265#VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_KHR} value to the {@link VkVideoDecodeH265PictureInfoKHR#sType} field. */
        public VkVideoDecodeH265PictureInfoKHR.Buffer sType$Default() { return sType(KHRVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoDecodeH265PictureInfoKHR#pNext} field. */
        public VkVideoDecodeH265PictureInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeH265PictureInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoDecodeH265PictureInfo} to the {@link VkVideoDecodeH265PictureInfoKHR#pStdPictureInfo} field. */
        public VkVideoDecodeH265PictureInfoKHR.Buffer pStdPictureInfo(@NativeType("StdVideoDecodeH265PictureInfo const *") StdVideoDecodeH265PictureInfo value) { VkVideoDecodeH265PictureInfoKHR.npStdPictureInfo(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkVideoDecodeH265PictureInfoKHR#pSliceSegmentOffsets} field. */
        public VkVideoDecodeH265PictureInfoKHR.Buffer pSliceSegmentOffsets(@NativeType("uint32_t const *") IntBuffer value) { VkVideoDecodeH265PictureInfoKHR.npSliceSegmentOffsets(address(), value); return this; }

    }

}