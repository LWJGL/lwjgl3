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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying H.264 encode capabilities.
 * 
 * <h5>Description</h5>
 * 
 * <p>When {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} is called to query the capabilities with parameter {@code videoCodecOperation} specified as {@link EXTVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT}, a {@link VkVideoEncodeH264CapabilitiesEXT} structure <b>can</b> be chained to {@link VkVideoCapabilitiesKHR} to retrieve H.264 extension specific capabilities.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH264CapabilitiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkVideoEncodeH264CapabilityFlagsEXT {@link #flags};
 *     uint32_t {@link #maxPPictureL0ReferenceCount};
 *     uint32_t {@link #maxBPictureL0ReferenceCount};
 *     uint32_t {@link #maxL1ReferenceCount};
 *     VkBool32 {@link #motionVectorsOverPicBoundariesFlag};
 *     uint32_t {@link #maxBytesPerPicDenom};
 *     uint32_t {@link #maxBitsPerMbDenom};
 *     uint32_t {@link #log2MaxMvLengthHorizontal};
 *     uint32_t {@link #log2MaxMvLengthVertical};
 * }</code></pre>
 */
public class VkVideoEncodeH264CapabilitiesEXT extends Struct<VkVideoEncodeH264CapabilitiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        MAXPPICTUREL0REFERENCECOUNT,
        MAXBPICTUREL0REFERENCECOUNT,
        MAXL1REFERENCECOUNT,
        MOTIONVECTORSOVERPICBOUNDARIESFLAG,
        MAXBYTESPERPICDENOM,
        MAXBITSPERMBDENOM,
        LOG2MAXMVLENGTHHORIZONTAL,
        LOG2MAXMVLENGTHVERTICAL;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        MAXPPICTUREL0REFERENCECOUNT = layout.offsetof(3);
        MAXBPICTUREL0REFERENCECOUNT = layout.offsetof(4);
        MAXL1REFERENCECOUNT = layout.offsetof(5);
        MOTIONVECTORSOVERPICBOUNDARIESFLAG = layout.offsetof(6);
        MAXBYTESPERPICDENOM = layout.offsetof(7);
        MAXBITSPERMBDENOM = layout.offsetof(8);
        LOG2MAXMVLENGTHHORIZONTAL = layout.offsetof(9);
        LOG2MAXMVLENGTHVERTICAL = layout.offsetof(10);
    }

    protected VkVideoEncodeH264CapabilitiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH264CapabilitiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264CapabilitiesEXT(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH264CapabilitiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264CapabilitiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkVideoEncodeH264CapabilityFlagBitsEXT} describing supported encoding tools. */
    @NativeType("VkVideoEncodeH264CapabilityFlagsEXT")
    public int flags() { return nflags(address()); }
    /** reports the maximum number of reference pictures the implementation supports in the reference list L0 for P pictures. */
    @NativeType("uint32_t")
    public int maxPPictureL0ReferenceCount() { return nmaxPPictureL0ReferenceCount(address()); }
    /** reports the maximum number of reference pictures the implementation supports in the reference list L0 for B pictures. The reported value is 0 if encoding of B pictures is not supported. */
    @NativeType("uint32_t")
    public int maxBPictureL0ReferenceCount() { return nmaxBPictureL0ReferenceCount(address()); }
    /** reports the maximum number of reference pictures the implementation supports in the reference list L1 if encoding of B pictures is supported. The reported value is 0 if encoding of B pictures is not supported. */
    @NativeType("uint32_t")
    public int maxL1ReferenceCount() { return nmaxL1ReferenceCount(address()); }
    /** if {@link VK10#VK_TRUE TRUE}, indicates motion_vectors_over_pic_boundaries_flag will be enabled if bitstream_restriction_flag is enabled in StdVideoH264SpsVuiFlags. */
    @NativeType("VkBool32")
    public boolean motionVectorsOverPicBoundariesFlag() { return nmotionVectorsOverPicBoundariesFlag(address()) != 0; }
    /** reports the value that will be used for max_bytes_per_pic_denom if bitstream_restriction_flag is enabled in StdVideoH264SpsVuiFlags. */
    @NativeType("uint32_t")
    public int maxBytesPerPicDenom() { return nmaxBytesPerPicDenom(address()); }
    /** reports the value that will be used for max_bits_per_mb_denom if bitstream_restriction_flag is enabled in StdVideoH264SpsVuiFlags. */
    @NativeType("uint32_t")
    public int maxBitsPerMbDenom() { return nmaxBitsPerMbDenom(address()); }
    /** reports the value that will be used for log2_max_mv_length_horizontal if bitstream_restriction_flag is enabled in StdVideoH264SpsVuiFlags. */
    @NativeType("uint32_t")
    public int log2MaxMvLengthHorizontal() { return nlog2MaxMvLengthHorizontal(address()); }
    /** reports the value that will be used for log2_max_mv_length_vertical if bitstream_restriction_flag is enabled in StdVideoH264SpsVuiFlags. */
    @NativeType("uint32_t")
    public int log2MaxMvLengthVertical() { return nlog2MaxMvLengthVertical(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH264CapabilitiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH264CapabilitiesEXT sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH264CapabilitiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264CapabilitiesEXT set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH264CapabilitiesEXT set(VkVideoEncodeH264CapabilitiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264CapabilitiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264CapabilitiesEXT malloc() {
        return new VkVideoEncodeH264CapabilitiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264CapabilitiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264CapabilitiesEXT calloc() {
        return new VkVideoEncodeH264CapabilitiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264CapabilitiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264CapabilitiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264CapabilitiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264CapabilitiesEXT} instance for the specified memory address. */
    public static VkVideoEncodeH264CapabilitiesEXT create(long address) {
        return new VkVideoEncodeH264CapabilitiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264CapabilitiesEXT createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH264CapabilitiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264CapabilitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264CapabilitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264CapabilitiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH264CapabilitiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264CapabilitiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264CapabilitiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264CapabilitiesEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH264CapabilitiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264CapabilitiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264CapabilitiesEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH264CapabilitiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264CapabilitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264CapabilitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264CapabilitiesEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.FLAGS); }
    /** Unsafe version of {@link #maxPPictureL0ReferenceCount}. */
    public static int nmaxPPictureL0ReferenceCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.MAXPPICTUREL0REFERENCECOUNT); }
    /** Unsafe version of {@link #maxBPictureL0ReferenceCount}. */
    public static int nmaxBPictureL0ReferenceCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.MAXBPICTUREL0REFERENCECOUNT); }
    /** Unsafe version of {@link #maxL1ReferenceCount}. */
    public static int nmaxL1ReferenceCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.MAXL1REFERENCECOUNT); }
    /** Unsafe version of {@link #motionVectorsOverPicBoundariesFlag}. */
    public static int nmotionVectorsOverPicBoundariesFlag(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.MOTIONVECTORSOVERPICBOUNDARIESFLAG); }
    /** Unsafe version of {@link #maxBytesPerPicDenom}. */
    public static int nmaxBytesPerPicDenom(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.MAXBYTESPERPICDENOM); }
    /** Unsafe version of {@link #maxBitsPerMbDenom}. */
    public static int nmaxBitsPerMbDenom(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.MAXBITSPERMBDENOM); }
    /** Unsafe version of {@link #log2MaxMvLengthHorizontal}. */
    public static int nlog2MaxMvLengthHorizontal(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.LOG2MAXMVLENGTHHORIZONTAL); }
    /** Unsafe version of {@link #log2MaxMvLengthVertical}. */
    public static int nlog2MaxMvLengthVertical(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.LOG2MAXMVLENGTHVERTICAL); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264CapabilitiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264CapabilitiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264CapabilitiesEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264CapabilitiesEXT ELEMENT_FACTORY = VkVideoEncodeH264CapabilitiesEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264CapabilitiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264CapabilitiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH264CapabilitiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264CapabilitiesEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoEncodeH264CapabilitiesEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#flags} field. */
        @NativeType("VkVideoEncodeH264CapabilityFlagsEXT")
        public int flags() { return VkVideoEncodeH264CapabilitiesEXT.nflags(address()); }
        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#maxPPictureL0ReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxPPictureL0ReferenceCount() { return VkVideoEncodeH264CapabilitiesEXT.nmaxPPictureL0ReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#maxBPictureL0ReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxBPictureL0ReferenceCount() { return VkVideoEncodeH264CapabilitiesEXT.nmaxBPictureL0ReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#maxL1ReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxL1ReferenceCount() { return VkVideoEncodeH264CapabilitiesEXT.nmaxL1ReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#motionVectorsOverPicBoundariesFlag} field. */
        @NativeType("VkBool32")
        public boolean motionVectorsOverPicBoundariesFlag() { return VkVideoEncodeH264CapabilitiesEXT.nmotionVectorsOverPicBoundariesFlag(address()) != 0; }
        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#maxBytesPerPicDenom} field. */
        @NativeType("uint32_t")
        public int maxBytesPerPicDenom() { return VkVideoEncodeH264CapabilitiesEXT.nmaxBytesPerPicDenom(address()); }
        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#maxBitsPerMbDenom} field. */
        @NativeType("uint32_t")
        public int maxBitsPerMbDenom() { return VkVideoEncodeH264CapabilitiesEXT.nmaxBitsPerMbDenom(address()); }
        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#log2MaxMvLengthHorizontal} field. */
        @NativeType("uint32_t")
        public int log2MaxMvLengthHorizontal() { return VkVideoEncodeH264CapabilitiesEXT.nlog2MaxMvLengthHorizontal(address()); }
        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#log2MaxMvLengthVertical} field. */
        @NativeType("uint32_t")
        public int log2MaxMvLengthVertical() { return VkVideoEncodeH264CapabilitiesEXT.nlog2MaxMvLengthVertical(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH264CapabilitiesEXT#sType} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264CapabilitiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_EXT} value to the {@link VkVideoEncodeH264CapabilitiesEXT#sType} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH264CapabilitiesEXT#pNext} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer pNext(@NativeType("void *") long value) { VkVideoEncodeH264CapabilitiesEXT.npNext(address(), value); return this; }

    }

}