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
 * Structure specifying encode capabilities.
 * 
 * <h5>Description</h5>
 * 
 * <p>Implementations <b>must</b> include support for at least {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_BUFFER_OFFSET_BIT_KHR VIDEO_ENCODE_FEEDBACK_BITSTREAM_BUFFER_OFFSET_BIT_KHR} and {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_BYTES_WRITTEN_BIT_KHR VIDEO_ENCODE_FEEDBACK_BITSTREAM_BYTES_WRITTEN_BIT_KHR} in {@code supportedEncodeFeedbackFlags}.</p>
 * 
 * <p>The input content and encode resolution (specified in {@link VkVideoEncodeInfoKHR}{@code ::codedExtent}) may not be aligned with the codec-specific coding block size. For example, the input content may be 1920x1080 and the coding block size may be 16x16 pixel blocks. In this example, the content is horizontally aligned with the coding block size, but not vertically aligned with the coding block size. Encoding of the last row of blocks may be impacted by contents of the input image in pixel rows 1081 to 1088 (the next vertical alignment with the coding block size). In general, to ensure efficient encoding for the last row/column of blocks, and/or to ensure consistent encoding results between repeated encoding of the same input content, these extra pixel rows/columns should be filled to known values up to the coding block size alignment before encoding operations are performed. Some implementations support performing auto-fill of unaligned pixels beyond a specific alignment for the purposes of encoding, which is reported in {@code encodeInputPictureGranularity}. For example, if an implementation reports 1x1 in {@code encodeInputPictureGranularity}, then the implementation will perform auto-fill for any unaligned pixels beyond the encode resolution up to the next coding block size. For a coding block size of 16x16, if the implementation reports 16x16 in {@code encodeInputPictureGranularity}, then it is the application’s responsibility to fill any unaligned pixels, if desired. When the application does not fill these unaligned pixels, there <b>may</b> be an impact on the encoding efficiency but there will be no effect on the validity of the generated bitstream. If the implementation reports 8x8 in {@code encodeInputPictureGranularity}, then for the 1920x1080 example, since the content is aligned to 8 pixels vertically, the implementation will auto-fill pixel rows 1081 to 1088 (up to the 16x16 coding block size in the example). The auto-fill value(s) are implementation-specific. The auto-fill value(s) are not written to the input image memory, but are used as part of the encoding operation on the input image.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeCapabilitiesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkVideoEncodeCapabilityFlagsKHR {@link #flags};
 *     VkVideoEncodeRateControlModeFlagsKHR {@link #rateControlModes};
 *     uint32_t {@link #maxRateControlLayers};
 *     uint64_t {@link #maxBitrate};
 *     uint32_t {@link #maxQualityLevels};
 *     {@link VkExtent2D VkExtent2D} {@link #encodeInputPictureGranularity};
 *     VkVideoEncodeFeedbackFlagsKHR {@link #supportedEncodeFeedbackFlags};
 * }</code></pre>
 */
public class VkVideoEncodeCapabilitiesKHR extends Struct<VkVideoEncodeCapabilitiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        RATECONTROLMODES,
        MAXRATECONTROLLAYERS,
        MAXBITRATE,
        MAXQUALITYLEVELS,
        ENCODEINPUTPICTUREGRANULARITY,
        SUPPORTEDENCODEFEEDBACKFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        RATECONTROLMODES = layout.offsetof(3);
        MAXRATECONTROLLAYERS = layout.offsetof(4);
        MAXBITRATE = layout.offsetof(5);
        MAXQUALITYLEVELS = layout.offsetof(6);
        ENCODEINPUTPICTUREGRANULARITY = layout.offsetof(7);
        SUPPORTEDENCODEFEEDBACKFLAGS = layout.offsetof(8);
    }

    protected VkVideoEncodeCapabilitiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeCapabilitiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeCapabilitiesKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeCapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeCapabilitiesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkVideoEncodeCapabilityFlagBitsKHR} describing supported encoding features. */
    @NativeType("VkVideoEncodeCapabilityFlagsKHR")
    public int flags() { return nflags(address()); }
    /** a bitmask of {@code VkVideoEncodeRateControlModeFlagBitsKHR} indicating supported rate control modes. */
    @NativeType("VkVideoEncodeRateControlModeFlagsKHR")
    public int rateControlModes() { return nrateControlModes(address()); }
    /** indicates the maximum number of rate control layers supported. */
    @NativeType("uint32_t")
    public int maxRateControlLayers() { return nmaxRateControlLayers(address()); }
    /** indicates the maximum supported bitrate. */
    @NativeType("uint64_t")
    public long maxBitrate() { return nmaxBitrate(address()); }
    /** indicates the number of discrete video encode quality levels supported. Implementations <b>must</b> report at least 1. */
    @NativeType("uint32_t")
    public int maxQualityLevels() { return nmaxQualityLevels(address()); }
    /** indicates the granularity at which <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-input-picture">encode input picture</a> data is encoded. */
    public VkExtent2D encodeInputPictureGranularity() { return nencodeInputPictureGranularity(address()); }
    /** a bitmask of {@code VkVideoEncodeFeedbackFlagBitsKHR} values specifying the supported flags for <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#queries-video-encode-feedback">video encode feedback queries</a>. */
    @NativeType("VkVideoEncodeFeedbackFlagsKHR")
    public int supportedEncodeFeedbackFlags() { return nsupportedEncodeFeedbackFlags(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeCapabilitiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeCapabilitiesKHR sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeCapabilitiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeCapabilitiesKHR set(
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
    public VkVideoEncodeCapabilitiesKHR set(VkVideoEncodeCapabilitiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeCapabilitiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeCapabilitiesKHR malloc() {
        return new VkVideoEncodeCapabilitiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeCapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeCapabilitiesKHR calloc() {
        return new VkVideoEncodeCapabilitiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeCapabilitiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeCapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeCapabilitiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeCapabilitiesKHR} instance for the specified memory address. */
    public static VkVideoEncodeCapabilitiesKHR create(long address) {
        return new VkVideoEncodeCapabilitiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeCapabilitiesKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeCapabilitiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeCapabilitiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeCapabilitiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeCapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeCapabilitiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeCapabilitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeCapabilitiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeCapabilitiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeCapabilitiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeCapabilitiesKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeCapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeCapabilitiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeCapabilitiesKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeCapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeCapabilitiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeCapabilitiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeCapabilitiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeCapabilitiesKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeCapabilitiesKHR.FLAGS); }
    /** Unsafe version of {@link #rateControlModes}. */
    public static int nrateControlModes(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeCapabilitiesKHR.RATECONTROLMODES); }
    /** Unsafe version of {@link #maxRateControlLayers}. */
    public static int nmaxRateControlLayers(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeCapabilitiesKHR.MAXRATECONTROLLAYERS); }
    /** Unsafe version of {@link #maxBitrate}. */
    public static long nmaxBitrate(long struct) { return UNSAFE.getLong(null, struct + VkVideoEncodeCapabilitiesKHR.MAXBITRATE); }
    /** Unsafe version of {@link #maxQualityLevels}. */
    public static int nmaxQualityLevels(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeCapabilitiesKHR.MAXQUALITYLEVELS); }
    /** Unsafe version of {@link #encodeInputPictureGranularity}. */
    public static VkExtent2D nencodeInputPictureGranularity(long struct) { return VkExtent2D.create(struct + VkVideoEncodeCapabilitiesKHR.ENCODEINPUTPICTUREGRANULARITY); }
    /** Unsafe version of {@link #supportedEncodeFeedbackFlags}. */
    public static int nsupportedEncodeFeedbackFlags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeCapabilitiesKHR.SUPPORTEDENCODEFEEDBACKFLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeCapabilitiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeCapabilitiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeCapabilitiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeCapabilitiesKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeCapabilitiesKHR ELEMENT_FACTORY = VkVideoEncodeCapabilitiesKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeCapabilitiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeCapabilitiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeCapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeCapabilitiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeCapabilitiesKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeCapabilitiesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoEncodeCapabilitiesKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeCapabilitiesKHR#flags} field. */
        @NativeType("VkVideoEncodeCapabilityFlagsKHR")
        public int flags() { return VkVideoEncodeCapabilitiesKHR.nflags(address()); }
        /** @return the value of the {@link VkVideoEncodeCapabilitiesKHR#rateControlModes} field. */
        @NativeType("VkVideoEncodeRateControlModeFlagsKHR")
        public int rateControlModes() { return VkVideoEncodeCapabilitiesKHR.nrateControlModes(address()); }
        /** @return the value of the {@link VkVideoEncodeCapabilitiesKHR#maxRateControlLayers} field. */
        @NativeType("uint32_t")
        public int maxRateControlLayers() { return VkVideoEncodeCapabilitiesKHR.nmaxRateControlLayers(address()); }
        /** @return the value of the {@link VkVideoEncodeCapabilitiesKHR#maxBitrate} field. */
        @NativeType("uint64_t")
        public long maxBitrate() { return VkVideoEncodeCapabilitiesKHR.nmaxBitrate(address()); }
        /** @return the value of the {@link VkVideoEncodeCapabilitiesKHR#maxQualityLevels} field. */
        @NativeType("uint32_t")
        public int maxQualityLevels() { return VkVideoEncodeCapabilitiesKHR.nmaxQualityLevels(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoEncodeCapabilitiesKHR#encodeInputPictureGranularity} field. */
        public VkExtent2D encodeInputPictureGranularity() { return VkVideoEncodeCapabilitiesKHR.nencodeInputPictureGranularity(address()); }
        /** @return the value of the {@link VkVideoEncodeCapabilitiesKHR#supportedEncodeFeedbackFlags} field. */
        @NativeType("VkVideoEncodeFeedbackFlagsKHR")
        public int supportedEncodeFeedbackFlags() { return VkVideoEncodeCapabilitiesKHR.nsupportedEncodeFeedbackFlags(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeCapabilitiesKHR#sType} field. */
        public VkVideoEncodeCapabilitiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeCapabilitiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR} value to the {@link VkVideoEncodeCapabilitiesKHR#sType} field. */
        public VkVideoEncodeCapabilitiesKHR.Buffer sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeCapabilitiesKHR#pNext} field. */
        public VkVideoEncodeCapabilitiesKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoEncodeCapabilitiesKHR.npNext(address(), value); return this; }

    }

}