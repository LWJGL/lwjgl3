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
 * <li>{@code inputModeFlags} <b>must</b> be a valid combination of {@code VkVideoEncodeH264InputModeFlagBitsEXT} values</li>
 * <li>{@code inputModeFlags} <b>must</b> not be 0</li>
 * <li>{@code outputModeFlags} <b>must</b> be a valid combination of {@code VkVideoEncodeH264OutputModeFlagBitsEXT} values</li>
 * <li>{@code outputModeFlags} <b>must</b> not be 0</li>
 * <li>{@code stdExtensionVersion} <b>must</b> be a valid {@link VkExtensionProperties} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtensionProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH264CapabilitiesEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoEncodeH264CapabilityFlagsEXT {@link #flags};
 *     VkVideoEncodeH264InputModeFlagsEXT {@link #inputModeFlags};
 *     VkVideoEncodeH264OutputModeFlagsEXT {@link #outputModeFlags};
 *     uint8_t {@link #maxPPictureL0ReferenceCount};
 *     uint8_t {@link #maxBPictureL0ReferenceCount};
 *     uint8_t {@link #maxL1ReferenceCount};
 *     VkBool32 {@link #motionVectorsOverPicBoundariesFlag};
 *     uint32_t {@link #maxBytesPerPicDenom};
 *     uint32_t {@link #maxBitsPerMbDenom};
 *     uint32_t {@link #log2MaxMvLengthHorizontal};
 *     uint32_t {@link #log2MaxMvLengthVertical};
 *     {@link VkExtensionProperties VkExtensionProperties} {@link #stdExtensionVersion};
 * }</code></pre>
 */
public class VkVideoEncodeH264CapabilitiesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        INPUTMODEFLAGS,
        OUTPUTMODEFLAGS,
        MAXPPICTUREL0REFERENCECOUNT,
        MAXBPICTUREL0REFERENCECOUNT,
        MAXL1REFERENCECOUNT,
        MOTIONVECTORSOVERPICBOUNDARIESFLAG,
        MAXBYTESPERPICDENOM,
        MAXBITSPERMBDENOM,
        LOG2MAXMVLENGTHHORIZONTAL,
        LOG2MAXMVLENGTHVERTICAL,
        STDEXTENSIONVERSION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(VkExtensionProperties.SIZEOF, VkExtensionProperties.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        INPUTMODEFLAGS = layout.offsetof(3);
        OUTPUTMODEFLAGS = layout.offsetof(4);
        MAXPPICTUREL0REFERENCECOUNT = layout.offsetof(5);
        MAXBPICTUREL0REFERENCECOUNT = layout.offsetof(6);
        MAXL1REFERENCECOUNT = layout.offsetof(7);
        MOTIONVECTORSOVERPICBOUNDARIESFLAG = layout.offsetof(8);
        MAXBYTESPERPICDENOM = layout.offsetof(9);
        MAXBITSPERMBDENOM = layout.offsetof(10);
        LOG2MAXMVLENGTHHORIZONTAL = layout.offsetof(11);
        LOG2MAXMVLENGTHVERTICAL = layout.offsetof(12);
        STDEXTENSIONVERSION = layout.offsetof(13);
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
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkVideoEncodeH264CapabilityFlagBitsEXT} describing supported encoding tools. */
    @NativeType("VkVideoEncodeH264CapabilityFlagsEXT")
    public int flags() { return nflags(address()); }
    /** a bitmask of {@code VkVideoEncodeH264InputModeFlagBitsEXT} describing supported command buffer input granularities/modes. */
    @NativeType("VkVideoEncodeH264InputModeFlagsEXT")
    public int inputModeFlags() { return ninputModeFlags(address()); }
    /** a bitmask of {@code VkVideoEncodeH264OutputModeFlagBitsEXT} describing supported output (bitstream size reporting) granularities/modes. */
    @NativeType("VkVideoEncodeH264OutputModeFlagsEXT")
    public int outputModeFlags() { return noutputModeFlags(address()); }
    /** reports the maximum number of reference pictures the implementation supports in the reference list L0 for P pictures. */
    @NativeType("uint8_t")
    public byte maxPPictureL0ReferenceCount() { return nmaxPPictureL0ReferenceCount(address()); }
    /** reports the maximum number of reference pictures the implementation supports in the reference list L0 for B pictures. The reported value is 0 if encoding of B pictures is not supported. */
    @NativeType("uint8_t")
    public byte maxBPictureL0ReferenceCount() { return nmaxBPictureL0ReferenceCount(address()); }
    /** reports the maximum number of reference pictures the implementation supports in the reference list L1 if encoding of B pictures is supported. The reported value is 0 if encoding of B pictures is not supported. */
    @NativeType("uint8_t")
    public byte maxL1ReferenceCount() { return nmaxL1ReferenceCount(address()); }
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
    /** the specific H.264 extension name and version supported by this implementation. */
    public VkExtensionProperties stdExtensionVersion() { return nstdExtensionVersion(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH264CapabilitiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH264CapabilitiesEXT sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH264CapabilitiesEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkVideoEncodeH264CapabilitiesEXT flags(@NativeType("VkVideoEncodeH264CapabilityFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #inputModeFlags} field. */
    public VkVideoEncodeH264CapabilitiesEXT inputModeFlags(@NativeType("VkVideoEncodeH264InputModeFlagsEXT") int value) { ninputModeFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #outputModeFlags} field. */
    public VkVideoEncodeH264CapabilitiesEXT outputModeFlags(@NativeType("VkVideoEncodeH264OutputModeFlagsEXT") int value) { noutputModeFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #maxPPictureL0ReferenceCount} field. */
    public VkVideoEncodeH264CapabilitiesEXT maxPPictureL0ReferenceCount(@NativeType("uint8_t") byte value) { nmaxPPictureL0ReferenceCount(address(), value); return this; }
    /** Sets the specified value to the {@link #maxBPictureL0ReferenceCount} field. */
    public VkVideoEncodeH264CapabilitiesEXT maxBPictureL0ReferenceCount(@NativeType("uint8_t") byte value) { nmaxBPictureL0ReferenceCount(address(), value); return this; }
    /** Sets the specified value to the {@link #maxL1ReferenceCount} field. */
    public VkVideoEncodeH264CapabilitiesEXT maxL1ReferenceCount(@NativeType("uint8_t") byte value) { nmaxL1ReferenceCount(address(), value); return this; }
    /** Sets the specified value to the {@link #motionVectorsOverPicBoundariesFlag} field. */
    public VkVideoEncodeH264CapabilitiesEXT motionVectorsOverPicBoundariesFlag(@NativeType("VkBool32") boolean value) { nmotionVectorsOverPicBoundariesFlag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #maxBytesPerPicDenom} field. */
    public VkVideoEncodeH264CapabilitiesEXT maxBytesPerPicDenom(@NativeType("uint32_t") int value) { nmaxBytesPerPicDenom(address(), value); return this; }
    /** Sets the specified value to the {@link #maxBitsPerMbDenom} field. */
    public VkVideoEncodeH264CapabilitiesEXT maxBitsPerMbDenom(@NativeType("uint32_t") int value) { nmaxBitsPerMbDenom(address(), value); return this; }
    /** Sets the specified value to the {@link #log2MaxMvLengthHorizontal} field. */
    public VkVideoEncodeH264CapabilitiesEXT log2MaxMvLengthHorizontal(@NativeType("uint32_t") int value) { nlog2MaxMvLengthHorizontal(address(), value); return this; }
    /** Sets the specified value to the {@link #log2MaxMvLengthVertical} field. */
    public VkVideoEncodeH264CapabilitiesEXT log2MaxMvLengthVertical(@NativeType("uint32_t") int value) { nlog2MaxMvLengthVertical(address(), value); return this; }
    /** Copies the specified {@link VkExtensionProperties} to the {@link #stdExtensionVersion} field. */
    public VkVideoEncodeH264CapabilitiesEXT stdExtensionVersion(VkExtensionProperties value) { nstdExtensionVersion(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264CapabilitiesEXT set(
        int sType,
        long pNext,
        int flags,
        int inputModeFlags,
        int outputModeFlags,
        byte maxPPictureL0ReferenceCount,
        byte maxBPictureL0ReferenceCount,
        byte maxL1ReferenceCount,
        boolean motionVectorsOverPicBoundariesFlag,
        int maxBytesPerPicDenom,
        int maxBitsPerMbDenom,
        int log2MaxMvLengthHorizontal,
        int log2MaxMvLengthVertical,
        VkExtensionProperties stdExtensionVersion
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        inputModeFlags(inputModeFlags);
        outputModeFlags(outputModeFlags);
        maxPPictureL0ReferenceCount(maxPPictureL0ReferenceCount);
        maxBPictureL0ReferenceCount(maxBPictureL0ReferenceCount);
        maxL1ReferenceCount(maxL1ReferenceCount);
        motionVectorsOverPicBoundariesFlag(motionVectorsOverPicBoundariesFlag);
        maxBytesPerPicDenom(maxBytesPerPicDenom);
        maxBitsPerMbDenom(maxBitsPerMbDenom);
        log2MaxMvLengthHorizontal(log2MaxMvLengthHorizontal);
        log2MaxMvLengthVertical(log2MaxMvLengthVertical);
        stdExtensionVersion(stdExtensionVersion);

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
        return wrap(VkVideoEncodeH264CapabilitiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH264CapabilitiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264CapabilitiesEXT calloc() {
        return wrap(VkVideoEncodeH264CapabilitiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH264CapabilitiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264CapabilitiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeH264CapabilitiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264CapabilitiesEXT} instance for the specified memory address. */
    public static VkVideoEncodeH264CapabilitiesEXT create(long address) {
        return wrap(VkVideoEncodeH264CapabilitiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264CapabilitiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeH264CapabilitiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264CapabilitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264CapabilitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264CapabilitiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeH264CapabilitiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264CapabilitiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264CapabilitiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264CapabilitiesEXT malloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH264CapabilitiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeH264CapabilitiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264CapabilitiesEXT calloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH264CapabilitiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeH264CapabilitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264CapabilitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264CapabilitiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264CapabilitiesEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.FLAGS); }
    /** Unsafe version of {@link #inputModeFlags}. */
    public static int ninputModeFlags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.INPUTMODEFLAGS); }
    /** Unsafe version of {@link #outputModeFlags}. */
    public static int noutputModeFlags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.OUTPUTMODEFLAGS); }
    /** Unsafe version of {@link #maxPPictureL0ReferenceCount}. */
    public static byte nmaxPPictureL0ReferenceCount(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH264CapabilitiesEXT.MAXPPICTUREL0REFERENCECOUNT); }
    /** Unsafe version of {@link #maxBPictureL0ReferenceCount}. */
    public static byte nmaxBPictureL0ReferenceCount(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH264CapabilitiesEXT.MAXBPICTUREL0REFERENCECOUNT); }
    /** Unsafe version of {@link #maxL1ReferenceCount}. */
    public static byte nmaxL1ReferenceCount(long struct) { return UNSAFE.getByte(null, struct + VkVideoEncodeH264CapabilitiesEXT.MAXL1REFERENCECOUNT); }
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
    /** Unsafe version of {@link #stdExtensionVersion}. */
    public static VkExtensionProperties nstdExtensionVersion(long struct) { return VkExtensionProperties.create(struct + VkVideoEncodeH264CapabilitiesEXT.STDEXTENSIONVERSION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264CapabilitiesEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.FLAGS, value); }
    /** Unsafe version of {@link #inputModeFlags(int) inputModeFlags}. */
    public static void ninputModeFlags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.INPUTMODEFLAGS, value); }
    /** Unsafe version of {@link #outputModeFlags(int) outputModeFlags}. */
    public static void noutputModeFlags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.OUTPUTMODEFLAGS, value); }
    /** Unsafe version of {@link #maxPPictureL0ReferenceCount(byte) maxPPictureL0ReferenceCount}. */
    public static void nmaxPPictureL0ReferenceCount(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH264CapabilitiesEXT.MAXPPICTUREL0REFERENCECOUNT, value); }
    /** Unsafe version of {@link #maxBPictureL0ReferenceCount(byte) maxBPictureL0ReferenceCount}. */
    public static void nmaxBPictureL0ReferenceCount(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH264CapabilitiesEXT.MAXBPICTUREL0REFERENCECOUNT, value); }
    /** Unsafe version of {@link #maxL1ReferenceCount(byte) maxL1ReferenceCount}. */
    public static void nmaxL1ReferenceCount(long struct, byte value) { UNSAFE.putByte(null, struct + VkVideoEncodeH264CapabilitiesEXT.MAXL1REFERENCECOUNT, value); }
    /** Unsafe version of {@link #motionVectorsOverPicBoundariesFlag(boolean) motionVectorsOverPicBoundariesFlag}. */
    public static void nmotionVectorsOverPicBoundariesFlag(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.MOTIONVECTORSOVERPICBOUNDARIESFLAG, value); }
    /** Unsafe version of {@link #maxBytesPerPicDenom(int) maxBytesPerPicDenom}. */
    public static void nmaxBytesPerPicDenom(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.MAXBYTESPERPICDENOM, value); }
    /** Unsafe version of {@link #maxBitsPerMbDenom(int) maxBitsPerMbDenom}. */
    public static void nmaxBitsPerMbDenom(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.MAXBITSPERMBDENOM, value); }
    /** Unsafe version of {@link #log2MaxMvLengthHorizontal(int) log2MaxMvLengthHorizontal}. */
    public static void nlog2MaxMvLengthHorizontal(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.LOG2MAXMVLENGTHHORIZONTAL, value); }
    /** Unsafe version of {@link #log2MaxMvLengthVertical(int) log2MaxMvLengthVertical}. */
    public static void nlog2MaxMvLengthVertical(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264CapabilitiesEXT.LOG2MAXMVLENGTHVERTICAL, value); }
    /** Unsafe version of {@link #stdExtensionVersion(VkExtensionProperties) stdExtensionVersion}. */
    public static void nstdExtensionVersion(long struct, VkExtensionProperties value) { memCopy(value.address(), struct + VkVideoEncodeH264CapabilitiesEXT.STDEXTENSIONVERSION, VkExtensionProperties.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264CapabilitiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264CapabilitiesEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264CapabilitiesEXT ELEMENT_FACTORY = VkVideoEncodeH264CapabilitiesEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264CapabilitiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264CapabilitiesEXT#SIZEOF}, and its mark will be undefined.
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
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264CapabilitiesEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#flags} field. */
        @NativeType("VkVideoEncodeH264CapabilityFlagsEXT")
        public int flags() { return VkVideoEncodeH264CapabilitiesEXT.nflags(address()); }
        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#inputModeFlags} field. */
        @NativeType("VkVideoEncodeH264InputModeFlagsEXT")
        public int inputModeFlags() { return VkVideoEncodeH264CapabilitiesEXT.ninputModeFlags(address()); }
        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#outputModeFlags} field. */
        @NativeType("VkVideoEncodeH264OutputModeFlagsEXT")
        public int outputModeFlags() { return VkVideoEncodeH264CapabilitiesEXT.noutputModeFlags(address()); }
        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#maxPPictureL0ReferenceCount} field. */
        @NativeType("uint8_t")
        public byte maxPPictureL0ReferenceCount() { return VkVideoEncodeH264CapabilitiesEXT.nmaxPPictureL0ReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#maxBPictureL0ReferenceCount} field. */
        @NativeType("uint8_t")
        public byte maxBPictureL0ReferenceCount() { return VkVideoEncodeH264CapabilitiesEXT.nmaxBPictureL0ReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH264CapabilitiesEXT#maxL1ReferenceCount} field. */
        @NativeType("uint8_t")
        public byte maxL1ReferenceCount() { return VkVideoEncodeH264CapabilitiesEXT.nmaxL1ReferenceCount(address()); }
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
        /** @return a {@link VkExtensionProperties} view of the {@link VkVideoEncodeH264CapabilitiesEXT#stdExtensionVersion} field. */
        public VkExtensionProperties stdExtensionVersion() { return VkVideoEncodeH264CapabilitiesEXT.nstdExtensionVersion(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH264CapabilitiesEXT#sType} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264CapabilitiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_EXT} value to the {@link VkVideoEncodeH264CapabilitiesEXT#sType} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH264CapabilitiesEXT#pNext} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264CapabilitiesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264CapabilitiesEXT#flags} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer flags(@NativeType("VkVideoEncodeH264CapabilityFlagsEXT") int value) { VkVideoEncodeH264CapabilitiesEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264CapabilitiesEXT#inputModeFlags} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer inputModeFlags(@NativeType("VkVideoEncodeH264InputModeFlagsEXT") int value) { VkVideoEncodeH264CapabilitiesEXT.ninputModeFlags(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264CapabilitiesEXT#outputModeFlags} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer outputModeFlags(@NativeType("VkVideoEncodeH264OutputModeFlagsEXT") int value) { VkVideoEncodeH264CapabilitiesEXT.noutputModeFlags(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264CapabilitiesEXT#maxPPictureL0ReferenceCount} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer maxPPictureL0ReferenceCount(@NativeType("uint8_t") byte value) { VkVideoEncodeH264CapabilitiesEXT.nmaxPPictureL0ReferenceCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264CapabilitiesEXT#maxBPictureL0ReferenceCount} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer maxBPictureL0ReferenceCount(@NativeType("uint8_t") byte value) { VkVideoEncodeH264CapabilitiesEXT.nmaxBPictureL0ReferenceCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264CapabilitiesEXT#maxL1ReferenceCount} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer maxL1ReferenceCount(@NativeType("uint8_t") byte value) { VkVideoEncodeH264CapabilitiesEXT.nmaxL1ReferenceCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264CapabilitiesEXT#motionVectorsOverPicBoundariesFlag} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer motionVectorsOverPicBoundariesFlag(@NativeType("VkBool32") boolean value) { VkVideoEncodeH264CapabilitiesEXT.nmotionVectorsOverPicBoundariesFlag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264CapabilitiesEXT#maxBytesPerPicDenom} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer maxBytesPerPicDenom(@NativeType("uint32_t") int value) { VkVideoEncodeH264CapabilitiesEXT.nmaxBytesPerPicDenom(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264CapabilitiesEXT#maxBitsPerMbDenom} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer maxBitsPerMbDenom(@NativeType("uint32_t") int value) { VkVideoEncodeH264CapabilitiesEXT.nmaxBitsPerMbDenom(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264CapabilitiesEXT#log2MaxMvLengthHorizontal} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer log2MaxMvLengthHorizontal(@NativeType("uint32_t") int value) { VkVideoEncodeH264CapabilitiesEXT.nlog2MaxMvLengthHorizontal(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264CapabilitiesEXT#log2MaxMvLengthVertical} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer log2MaxMvLengthVertical(@NativeType("uint32_t") int value) { VkVideoEncodeH264CapabilitiesEXT.nlog2MaxMvLengthVertical(address(), value); return this; }
        /** Copies the specified {@link VkExtensionProperties} to the {@link VkVideoEncodeH264CapabilitiesEXT#stdExtensionVersion} field. */
        public VkVideoEncodeH264CapabilitiesEXT.Buffer stdExtensionVersion(VkExtensionProperties value) { VkVideoEncodeH264CapabilitiesEXT.nstdExtensionVersion(address(), value); return this; }

    }

}