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
 * Structure specifying a video profile.
 * 
 * <h5>Description</h5>
 * 
 * <p>Video profiles are provided as input to video capability queries such as {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} or {@link KHRVideoQueue#vkGetPhysicalDeviceVideoFormatPropertiesKHR GetPhysicalDeviceVideoFormatPropertiesKHR}, as well as when creating resources to be used by video coding operations such as images, buffers, query pools, and video sessions.</p>
 * 
 * <p>The full description of a video profile is specified by an instance of this structure, and the codec-specific and auxiliary structures provided in its {@code pNext} chain.</p>
 * 
 * <p>When this structure is specified as an input parameter to {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR}, or through the {@code pProfiles} member of an {@link VkVideoProfileListInfoKHR} structure in the {@code pNext} chain of the input parameter of a query command such as {@link KHRVideoQueue#vkGetPhysicalDeviceVideoFormatPropertiesKHR GetPhysicalDeviceVideoFormatPropertiesKHR} or {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2}, the following error codes indicate specific causes of the failure of the query operation:</p>
 * 
 * <ul>
 * <li>{@link KHRVideoQueue#VK_ERROR_VIDEO_PICTURE_LAYOUT_NOT_SUPPORTED_KHR ERROR_VIDEO_PICTURE_LAYOUT_NOT_SUPPORTED_KHR} indicates that the requested video picture layout (e.g. through the {@code pictureLayout} member of a {@link VkVideoDecodeH264ProfileInfoKHR} structure included in the {@code pNext} chain of {@link VkVideoProfileInfoKHR}) is not supported.</li>
 * <li>{@link KHRVideoQueue#VK_ERROR_VIDEO_PROFILE_OPERATION_NOT_SUPPORTED_KHR ERROR_VIDEO_PROFILE_OPERATION_NOT_SUPPORTED_KHR} indicates that a video profile operation specified by {@code videoCodecOperation} is not supported.</li>
 * <li>{@link KHRVideoQueue#VK_ERROR_VIDEO_PROFILE_FORMAT_NOT_SUPPORTED_KHR ERROR_VIDEO_PROFILE_FORMAT_NOT_SUPPORTED_KHR} indicates that video format parameters specified by {@code chromaSubsampling}, {@code lumaBitDepth}, or {@code chromaBitDepth} are not supported.</li>
 * <li>{@link KHRVideoQueue#VK_ERROR_VIDEO_PROFILE_CODEC_NOT_SUPPORTED_KHR ERROR_VIDEO_PROFILE_CODEC_NOT_SUPPORTED_KHR} indicates that the codec-specific parameters corresponding to the video codec operation are not supported.</li>
 * </ul>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code chromaSubsampling} <b>must</b> have a single bit set</li>
 * <li>{@code lumaBitDepth} <b>must</b> have a single bit set</li>
 * <li>If {@code chromaSubsampling} is not {@link KHRVideoQueue#VK_VIDEO_CHROMA_SUBSAMPLING_MONOCHROME_BIT_KHR VIDEO_CHROMA_SUBSAMPLING_MONOCHROME_BIT_KHR}, then {@code chromaBitDepth} <b>must</b> have a single bit set</li>
 * <li>If {@code videoCodecOperation} is {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR}, then the {@code pNext} chain <b>must</b> include a {@link VkVideoDecodeH264ProfileInfoKHR} structure</li>
 * <li>If {@code videoCodecOperation} is {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR}, then the {@code pNext} chain <b>must</b> include a {@link VkVideoDecodeH265ProfileInfoKHR} structure</li>
 * <li>If {@code videoCodecOperation} is {@link EXTVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT}, then the {@code pNext} chain <b>must</b> include a {@link VkVideoEncodeH264ProfileInfoEXT} structure</li>
 * <li>If {@code videoCodecOperation} is {@link EXTVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT}, then the {@code pNext} chain <b>must</b> include a {@link VkVideoEncodeH265ProfileInfoEXT} structure</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_PROFILE_INFO_KHR STRUCTURE_TYPE_VIDEO_PROFILE_INFO_KHR}</li>
 * <li>{@code videoCodecOperation} <b>must</b> be a valid {@code VkVideoCodecOperationFlagBitsKHR} value</li>
 * <li>{@code chromaSubsampling} <b>must</b> be a valid combination of {@code VkVideoChromaSubsamplingFlagBitsKHR} values</li>
 * <li>{@code chromaSubsampling} <b>must</b> not be 0</li>
 * <li>{@code lumaBitDepth} <b>must</b> be a valid combination of {@code VkVideoComponentBitDepthFlagBitsKHR} values</li>
 * <li>{@code lumaBitDepth} <b>must</b> not be 0</li>
 * <li>{@code chromaBitDepth} <b>must</b> be a valid combination of {@code VkVideoComponentBitDepthFlagBitsKHR} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR}, {@link VkVideoProfileListInfoKHR}, {@link VkVideoSessionCreateInfoKHR}, {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoProfileInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoCodecOperationFlagBitsKHR {@link #videoCodecOperation};
 *     VkVideoChromaSubsamplingFlagsKHR {@link #chromaSubsampling};
 *     VkVideoComponentBitDepthFlagsKHR {@link #lumaBitDepth};
 *     VkVideoComponentBitDepthFlagsKHR {@link #chromaBitDepth};
 * }</code></pre>
 */
public class VkVideoProfileInfoKHR extends Struct<VkVideoProfileInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VIDEOCODECOPERATION,
        CHROMASUBSAMPLING,
        LUMABITDEPTH,
        CHROMABITDEPTH;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VIDEOCODECOPERATION = layout.offsetof(2);
        CHROMASUBSAMPLING = layout.offsetof(3);
        LUMABITDEPTH = layout.offsetof(4);
        CHROMABITDEPTH = layout.offsetof(5);
    }

    protected VkVideoProfileInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoProfileInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoProfileInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoProfileInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoProfileInfoKHR(ByteBuffer container) {
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
    /** a {@code VkVideoCodecOperationFlagBitsKHR} value specifying a video codec operation. */
    @NativeType("VkVideoCodecOperationFlagBitsKHR")
    public int videoCodecOperation() { return nvideoCodecOperation(address()); }
    /** a bitmask of {@code VkVideoChromaSubsamplingFlagBitsKHR} specifying video chroma subsampling information. */
    @NativeType("VkVideoChromaSubsamplingFlagsKHR")
    public int chromaSubsampling() { return nchromaSubsampling(address()); }
    /** a bitmask of {@code VkVideoComponentBitDepthFlagBitsKHR} specifying video luma bit depth information. */
    @NativeType("VkVideoComponentBitDepthFlagsKHR")
    public int lumaBitDepth() { return nlumaBitDepth(address()); }
    /** a bitmask of {@code VkVideoComponentBitDepthFlagBitsKHR} specifying video chroma bit depth information. */
    @NativeType("VkVideoComponentBitDepthFlagsKHR")
    public int chromaBitDepth() { return nchromaBitDepth(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoProfileInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_PROFILE_INFO_KHR STRUCTURE_TYPE_VIDEO_PROFILE_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoProfileInfoKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_PROFILE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoProfileInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoDecodeH264ProfileInfoKHR} value to the {@code pNext} chain. */
    public VkVideoProfileInfoKHR pNext(VkVideoDecodeH264ProfileInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeH265ProfileInfoKHR} value to the {@code pNext} chain. */
    public VkVideoProfileInfoKHR pNext(VkVideoDecodeH265ProfileInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeUsageInfoKHR} value to the {@code pNext} chain. */
    public VkVideoProfileInfoKHR pNext(VkVideoDecodeUsageInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH264ProfileInfoEXT} value to the {@code pNext} chain. */
    public VkVideoProfileInfoKHR pNext(VkVideoEncodeH264ProfileInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265ProfileInfoEXT} value to the {@code pNext} chain. */
    public VkVideoProfileInfoKHR pNext(VkVideoEncodeH265ProfileInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeUsageInfoKHR} value to the {@code pNext} chain. */
    public VkVideoProfileInfoKHR pNext(VkVideoEncodeUsageInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #videoCodecOperation} field. */
    public VkVideoProfileInfoKHR videoCodecOperation(@NativeType("VkVideoCodecOperationFlagBitsKHR") int value) { nvideoCodecOperation(address(), value); return this; }
    /** Sets the specified value to the {@link #chromaSubsampling} field. */
    public VkVideoProfileInfoKHR chromaSubsampling(@NativeType("VkVideoChromaSubsamplingFlagsKHR") int value) { nchromaSubsampling(address(), value); return this; }
    /** Sets the specified value to the {@link #lumaBitDepth} field. */
    public VkVideoProfileInfoKHR lumaBitDepth(@NativeType("VkVideoComponentBitDepthFlagsKHR") int value) { nlumaBitDepth(address(), value); return this; }
    /** Sets the specified value to the {@link #chromaBitDepth} field. */
    public VkVideoProfileInfoKHR chromaBitDepth(@NativeType("VkVideoComponentBitDepthFlagsKHR") int value) { nchromaBitDepth(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoProfileInfoKHR set(
        int sType,
        long pNext,
        int videoCodecOperation,
        int chromaSubsampling,
        int lumaBitDepth,
        int chromaBitDepth
    ) {
        sType(sType);
        pNext(pNext);
        videoCodecOperation(videoCodecOperation);
        chromaSubsampling(chromaSubsampling);
        lumaBitDepth(lumaBitDepth);
        chromaBitDepth(chromaBitDepth);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoProfileInfoKHR set(VkVideoProfileInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoProfileInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoProfileInfoKHR malloc() {
        return new VkVideoProfileInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoProfileInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoProfileInfoKHR calloc() {
        return new VkVideoProfileInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoProfileInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoProfileInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoProfileInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoProfileInfoKHR} instance for the specified memory address. */
    public static VkVideoProfileInfoKHR create(long address) {
        return new VkVideoProfileInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoProfileInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoProfileInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoProfileInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoProfileInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoProfileInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoProfileInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoProfileInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoProfileInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoProfileInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoProfileInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoProfileInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoProfileInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoProfileInfoKHR malloc(MemoryStack stack) {
        return new VkVideoProfileInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoProfileInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoProfileInfoKHR calloc(MemoryStack stack) {
        return new VkVideoProfileInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoProfileInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoProfileInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoProfileInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoProfileInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoProfileInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoProfileInfoKHR.PNEXT); }
    /** Unsafe version of {@link #videoCodecOperation}. */
    public static int nvideoCodecOperation(long struct) { return UNSAFE.getInt(null, struct + VkVideoProfileInfoKHR.VIDEOCODECOPERATION); }
    /** Unsafe version of {@link #chromaSubsampling}. */
    public static int nchromaSubsampling(long struct) { return UNSAFE.getInt(null, struct + VkVideoProfileInfoKHR.CHROMASUBSAMPLING); }
    /** Unsafe version of {@link #lumaBitDepth}. */
    public static int nlumaBitDepth(long struct) { return UNSAFE.getInt(null, struct + VkVideoProfileInfoKHR.LUMABITDEPTH); }
    /** Unsafe version of {@link #chromaBitDepth}. */
    public static int nchromaBitDepth(long struct) { return UNSAFE.getInt(null, struct + VkVideoProfileInfoKHR.CHROMABITDEPTH); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoProfileInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoProfileInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #videoCodecOperation(int) videoCodecOperation}. */
    public static void nvideoCodecOperation(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoProfileInfoKHR.VIDEOCODECOPERATION, value); }
    /** Unsafe version of {@link #chromaSubsampling(int) chromaSubsampling}. */
    public static void nchromaSubsampling(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoProfileInfoKHR.CHROMASUBSAMPLING, value); }
    /** Unsafe version of {@link #lumaBitDepth(int) lumaBitDepth}. */
    public static void nlumaBitDepth(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoProfileInfoKHR.LUMABITDEPTH, value); }
    /** Unsafe version of {@link #chromaBitDepth(int) chromaBitDepth}. */
    public static void nchromaBitDepth(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoProfileInfoKHR.CHROMABITDEPTH, value); }

    // -----------------------------------

    /** An array of {@link VkVideoProfileInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoProfileInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoProfileInfoKHR ELEMENT_FACTORY = VkVideoProfileInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoProfileInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoProfileInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoProfileInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoProfileInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoProfileInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoProfileInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoProfileInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoProfileInfoKHR#videoCodecOperation} field. */
        @NativeType("VkVideoCodecOperationFlagBitsKHR")
        public int videoCodecOperation() { return VkVideoProfileInfoKHR.nvideoCodecOperation(address()); }
        /** @return the value of the {@link VkVideoProfileInfoKHR#chromaSubsampling} field. */
        @NativeType("VkVideoChromaSubsamplingFlagsKHR")
        public int chromaSubsampling() { return VkVideoProfileInfoKHR.nchromaSubsampling(address()); }
        /** @return the value of the {@link VkVideoProfileInfoKHR#lumaBitDepth} field. */
        @NativeType("VkVideoComponentBitDepthFlagsKHR")
        public int lumaBitDepth() { return VkVideoProfileInfoKHR.nlumaBitDepth(address()); }
        /** @return the value of the {@link VkVideoProfileInfoKHR#chromaBitDepth} field. */
        @NativeType("VkVideoComponentBitDepthFlagsKHR")
        public int chromaBitDepth() { return VkVideoProfileInfoKHR.nchromaBitDepth(address()); }

        /** Sets the specified value to the {@link VkVideoProfileInfoKHR#sType} field. */
        public VkVideoProfileInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoProfileInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_PROFILE_INFO_KHR STRUCTURE_TYPE_VIDEO_PROFILE_INFO_KHR} value to the {@link VkVideoProfileInfoKHR#sType} field. */
        public VkVideoProfileInfoKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_PROFILE_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoProfileInfoKHR#pNext} field. */
        public VkVideoProfileInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoProfileInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoDecodeH264ProfileInfoKHR} value to the {@code pNext} chain. */
        public VkVideoProfileInfoKHR.Buffer pNext(VkVideoDecodeH264ProfileInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeH265ProfileInfoKHR} value to the {@code pNext} chain. */
        public VkVideoProfileInfoKHR.Buffer pNext(VkVideoDecodeH265ProfileInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeUsageInfoKHR} value to the {@code pNext} chain. */
        public VkVideoProfileInfoKHR.Buffer pNext(VkVideoDecodeUsageInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH264ProfileInfoEXT} value to the {@code pNext} chain. */
        public VkVideoProfileInfoKHR.Buffer pNext(VkVideoEncodeH264ProfileInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265ProfileInfoEXT} value to the {@code pNext} chain. */
        public VkVideoProfileInfoKHR.Buffer pNext(VkVideoEncodeH265ProfileInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeUsageInfoKHR} value to the {@code pNext} chain. */
        public VkVideoProfileInfoKHR.Buffer pNext(VkVideoEncodeUsageInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkVideoProfileInfoKHR#videoCodecOperation} field. */
        public VkVideoProfileInfoKHR.Buffer videoCodecOperation(@NativeType("VkVideoCodecOperationFlagBitsKHR") int value) { VkVideoProfileInfoKHR.nvideoCodecOperation(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoProfileInfoKHR#chromaSubsampling} field. */
        public VkVideoProfileInfoKHR.Buffer chromaSubsampling(@NativeType("VkVideoChromaSubsamplingFlagsKHR") int value) { VkVideoProfileInfoKHR.nchromaSubsampling(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoProfileInfoKHR#lumaBitDepth} field. */
        public VkVideoProfileInfoKHR.Buffer lumaBitDepth(@NativeType("VkVideoComponentBitDepthFlagsKHR") int value) { VkVideoProfileInfoKHR.nlumaBitDepth(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoProfileInfoKHR#chromaBitDepth} field. */
        public VkVideoProfileInfoKHR.Buffer chromaBitDepth(@NativeType("VkVideoComponentBitDepthFlagsKHR") int value) { VkVideoProfileInfoKHR.nchromaBitDepth(address(), value); return this; }

    }

}