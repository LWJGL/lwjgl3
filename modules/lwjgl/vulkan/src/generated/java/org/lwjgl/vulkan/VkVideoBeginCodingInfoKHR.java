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

/**
 * Structure specifying video coding scope begin information.
 * 
 * <h5>Description</h5>
 * 
 * <p>Limiting values are defined below that are referenced by the relevant valid usage statements of this structure.</p>
 * 
 * <ul>
 * <li>Let {@code VkOffset2D codedOffsetGranularity} be the minimum alignment requirement for the coded offset of video picture resources. Unless otherwise defined, the value of the {@code x} and {@code y} members of {@code codedOffsetGranularity} are 0.
 * 
 * <ul>
 * <li>If {@code videoSession} was created with an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-profile">H.264 decode profile</a> with a {@link VkVideoDecodeH264ProfileInfoKHR}{@code ::pictureLayout} of {@link KHRVideoDecodeH264#VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_SEPARATE_PLANES_BIT_KHR VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_SEPARATE_PLANES_BIT_KHR}, then {@code codedOffsetGranularity} is equal to {@link VkVideoDecodeH264CapabilitiesKHR}{@code ::fieldOffsetGranularity}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for that video profile.</li>
 * </ul>
 * </li>
 * </ul>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code videoSession} <b>must</b> have memory bound to all of its memory bindings returned by {@link KHRVideoQueue#vkGetVideoSessionMemoryRequirementsKHR GetVideoSessionMemoryRequirementsKHR} for {@code videoSession}</li>
 * <li>Each non-negative {@link VkVideoReferenceSlotInfoKHR}{@code ::slotIndex} specified in the elements of {@code pReferenceSlots} <b>must</b> be less than the {@link VkVideoSessionCreateInfoKHR}{@code ::maxDpbSlots} specified when {@code videoSession} was created</li>
 * <li>Each video picture resource corresponding to any non-{@code NULL} {@code pPictureResource} member specified in the elements of {@code pReferenceSlots} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-picture-resource-uniqueness">unique</a> within {@code pReferenceSlots}</li>
 * <li>If the {@code pPictureResource} member of any element of {@code pReferenceSlots} is not {@code NULL}, then the image view specified in {@code pPictureResource→imageViewBinding} for that element <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-profile-compatibility">compatible</a> with the video profile {@code videoSession} was created with</li>
 * <li>If the {@code pPictureResource} member of any element of {@code pReferenceSlots} is not {@code NULL}, then the format of the image view specified in {@code pPictureResource→imageViewBinding} for that element <b>must</b> match the {@link VkVideoSessionCreateInfoKHR}{@code ::referencePictureFormat} {@code videoSession} was created with</li>
 * <li>If the {@code pPictureResource} member of any element of {@code pReferenceSlots} is not {@code NULL}, then its {@code codedOffset} member <b>must</b> be an integer multiple of {@code codedOffsetGranularity}</li>
 * <li>If the {@code pPictureResource} member of any element of {@code pReferenceSlots} is not {@code NULL}, then its {@code codedExtent} member <b>must</b> be between {@code minCodedExtent} and {@code maxCodedExtent}, inclusive, {@code videoSession} was created with</li>
 * <li>If {@link VkVideoCapabilitiesKHR}{@code ::flags} does not include {@link KHRVideoQueue#VK_VIDEO_CAPABILITY_SEPARATE_REFERENCE_IMAGES_BIT_KHR VIDEO_CAPABILITY_SEPARATE_REFERENCE_IMAGES_BIT_KHR}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the video profile {@code videoSession} was created with, then {@code pPictureResource→imageViewBinding} of all elements of {@code pReferenceSlots} with a non-{@code NULL} {@code pPictureResource} member <b>must</b> specify image views created from the same image</li>
 * <li>If {@code videoSession} was created with a decode operation and the {@code slotIndex} member of any element of {@code pReferenceSlots} is not negative, then the image view specified in {@code pPictureResource→imageViewBinding} for that element <b>must</b> have been created with {@link KHRVideoDecodeQueue#VK_IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR}</li>
 * <li>If {@code videoSession} was created with an encode operation and the {@code slotIndex} member of any element of {@code pReferenceSlots} is not negative, then the image view specified in {@code pPictureResource→imageViewBinding} for that element <b>must</b> have been created with {@link KHRVideoEncodeQueue#VK_IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR}</li>
 * <li>If {@code videoSession} was created with the video codec operation {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR}, then {@code videoSessionParameters} <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code videoSession} was created with the video codec operation {@link KHRVideoDecodeH265#VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR}, then {@code videoSessionParameters} <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code videoSession} was created with the video codec operation {@link EXTVideoEncodeH264#VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT}, then {@code videoSessionParameters} <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code videoSession} was created with the video codec operation {@link EXTVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT}, then {@code videoSessionParameters} <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code videoSessionParameters} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> have been created with {@code videoSession} specified in {@link VkVideoSessionParametersCreateInfoKHR}{@code ::videoSession}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkVideoEncodeH264GopRemainingFrameInfoEXT}, {@link VkVideoEncodeH264RateControlInfoEXT}, {@link VkVideoEncodeH265GopRemainingFrameInfoEXT}, {@link VkVideoEncodeH265RateControlInfoEXT}, or {@link VkVideoEncodeRateControlInfoKHR}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code videoSession} <b>must</b> be a valid {@code VkVideoSessionKHR} handle</li>
 * <li>If {@code videoSessionParameters} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code videoSessionParameters} <b>must</b> be a valid {@code VkVideoSessionParametersKHR} handle</li>
 * <li>If {@code referenceSlotCount} is not 0, {@code pReferenceSlots} <b>must</b> be a valid pointer to an array of {@code referenceSlotCount} valid {@link VkVideoReferenceSlotInfoKHR} structures</li>
 * <li>If {@code videoSessionParameters} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code videoSession}</li>
 * <li>Both of {@code videoSession}, and {@code videoSessionParameters} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoReferenceSlotInfoKHR}, {@link KHRVideoQueue#vkCmdBeginVideoCodingKHR CmdBeginVideoCodingKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoBeginCodingInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoBeginCodingFlagsKHR {@link #flags};
 *     VkVideoSessionKHR {@link #videoSession};
 *     VkVideoSessionParametersKHR {@link #videoSessionParameters};
 *     uint32_t {@link #referenceSlotCount};
 *     {@link VkVideoReferenceSlotInfoKHR VkVideoReferenceSlotInfoKHR} const * {@link #pReferenceSlots};
 * }</code></pre>
 */
public class VkVideoBeginCodingInfoKHR extends Struct<VkVideoBeginCodingInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        VIDEOSESSION,
        VIDEOSESSIONPARAMETERS,
        REFERENCESLOTCOUNT,
        PREFERENCESLOTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        VIDEOSESSION = layout.offsetof(3);
        VIDEOSESSIONPARAMETERS = layout.offsetof(4);
        REFERENCESLOTCOUNT = layout.offsetof(5);
        PREFERENCESLOTS = layout.offsetof(6);
    }

    protected VkVideoBeginCodingInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoBeginCodingInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoBeginCodingInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoBeginCodingInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoBeginCodingInfoKHR(ByteBuffer container) {
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
    /** reserved for future use. */
    @NativeType("VkVideoBeginCodingFlagsKHR")
    public int flags() { return nflags(address()); }
    /** the video session object to be bound for the processing of the video commands. */
    @NativeType("VkVideoSessionKHR")
    public long videoSession() { return nvideoSession(address()); }
    /** {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a handle of a {@code VkVideoSessionParametersKHR} object to be used for the processing of the video commands. If {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then no video session parameters object is bound for the duration of the video coding scope. */
    @NativeType("VkVideoSessionParametersKHR")
    public long videoSessionParameters() { return nvideoSessionParameters(address()); }
    /** the number of elements in the {@code pReferenceSlots} array. */
    @NativeType("uint32_t")
    public int referenceSlotCount() { return nreferenceSlotCount(address()); }
    /** a pointer to an array of {@link VkVideoReferenceSlotInfoKHR} structures specifying the information used to determine the set of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#bound-reference-picture-resources">bound reference picture resources</a> for the video coding scope and their initial association with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slot</a> indices. */
    @Nullable
    @NativeType("VkVideoReferenceSlotInfoKHR const *")
    public VkVideoReferenceSlotInfoKHR.Buffer pReferenceSlots() { return npReferenceSlots(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoBeginCodingInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoBeginCodingInfoKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoBeginCodingInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoEncodeH264GopRemainingFrameInfoEXT} value to the {@code pNext} chain. */
    public VkVideoBeginCodingInfoKHR pNext(VkVideoEncodeH264GopRemainingFrameInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH264RateControlInfoEXT} value to the {@code pNext} chain. */
    public VkVideoBeginCodingInfoKHR pNext(VkVideoEncodeH264RateControlInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265GopRemainingFrameInfoEXT} value to the {@code pNext} chain. */
    public VkVideoBeginCodingInfoKHR pNext(VkVideoEncodeH265GopRemainingFrameInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265RateControlInfoEXT} value to the {@code pNext} chain. */
    public VkVideoBeginCodingInfoKHR pNext(VkVideoEncodeH265RateControlInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeRateControlInfoKHR} value to the {@code pNext} chain. */
    public VkVideoBeginCodingInfoKHR pNext(VkVideoEncodeRateControlInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkVideoBeginCodingInfoKHR flags(@NativeType("VkVideoBeginCodingFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #videoSession} field. */
    public VkVideoBeginCodingInfoKHR videoSession(@NativeType("VkVideoSessionKHR") long value) { nvideoSession(address(), value); return this; }
    /** Sets the specified value to the {@link #videoSessionParameters} field. */
    public VkVideoBeginCodingInfoKHR videoSessionParameters(@NativeType("VkVideoSessionParametersKHR") long value) { nvideoSessionParameters(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoReferenceSlotInfoKHR.Buffer} to the {@link #pReferenceSlots} field. */
    public VkVideoBeginCodingInfoKHR pReferenceSlots(@Nullable @NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR.Buffer value) { npReferenceSlots(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoBeginCodingInfoKHR set(
        int sType,
        long pNext,
        int flags,
        long videoSession,
        long videoSessionParameters,
        @Nullable VkVideoReferenceSlotInfoKHR.Buffer pReferenceSlots
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        videoSession(videoSession);
        videoSessionParameters(videoSessionParameters);
        pReferenceSlots(pReferenceSlots);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoBeginCodingInfoKHR set(VkVideoBeginCodingInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoBeginCodingInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoBeginCodingInfoKHR malloc() {
        return new VkVideoBeginCodingInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoBeginCodingInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoBeginCodingInfoKHR calloc() {
        return new VkVideoBeginCodingInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoBeginCodingInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoBeginCodingInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoBeginCodingInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoBeginCodingInfoKHR} instance for the specified memory address. */
    public static VkVideoBeginCodingInfoKHR create(long address) {
        return new VkVideoBeginCodingInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoBeginCodingInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoBeginCodingInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoBeginCodingInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoBeginCodingInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoBeginCodingInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoBeginCodingInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoBeginCodingInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoBeginCodingInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoBeginCodingInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoBeginCodingInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoBeginCodingInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoBeginCodingInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoBeginCodingInfoKHR malloc(MemoryStack stack) {
        return new VkVideoBeginCodingInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoBeginCodingInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoBeginCodingInfoKHR calloc(MemoryStack stack) {
        return new VkVideoBeginCodingInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoBeginCodingInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoBeginCodingInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoBeginCodingInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoBeginCodingInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoBeginCodingInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoBeginCodingInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkVideoBeginCodingInfoKHR.FLAGS); }
    /** Unsafe version of {@link #videoSession}. */
    public static long nvideoSession(long struct) { return UNSAFE.getLong(null, struct + VkVideoBeginCodingInfoKHR.VIDEOSESSION); }
    /** Unsafe version of {@link #videoSessionParameters}. */
    public static long nvideoSessionParameters(long struct) { return UNSAFE.getLong(null, struct + VkVideoBeginCodingInfoKHR.VIDEOSESSIONPARAMETERS); }
    /** Unsafe version of {@link #referenceSlotCount}. */
    public static int nreferenceSlotCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoBeginCodingInfoKHR.REFERENCESLOTCOUNT); }
    /** Unsafe version of {@link #pReferenceSlots}. */
    @Nullable public static VkVideoReferenceSlotInfoKHR.Buffer npReferenceSlots(long struct) { return VkVideoReferenceSlotInfoKHR.createSafe(memGetAddress(struct + VkVideoBeginCodingInfoKHR.PREFERENCESLOTS), nreferenceSlotCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoBeginCodingInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoBeginCodingInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoBeginCodingInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #videoSession(long) videoSession}. */
    public static void nvideoSession(long struct, long value) { UNSAFE.putLong(null, struct + VkVideoBeginCodingInfoKHR.VIDEOSESSION, value); }
    /** Unsafe version of {@link #videoSessionParameters(long) videoSessionParameters}. */
    public static void nvideoSessionParameters(long struct, long value) { UNSAFE.putLong(null, struct + VkVideoBeginCodingInfoKHR.VIDEOSESSIONPARAMETERS, value); }
    /** Sets the specified value to the {@code referenceSlotCount} field of the specified {@code struct}. */
    public static void nreferenceSlotCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoBeginCodingInfoKHR.REFERENCESLOTCOUNT, value); }
    /** Unsafe version of {@link #pReferenceSlots(VkVideoReferenceSlotInfoKHR.Buffer) pReferenceSlots}. */
    public static void npReferenceSlots(long struct, @Nullable VkVideoReferenceSlotInfoKHR.Buffer value) { memPutAddress(struct + VkVideoBeginCodingInfoKHR.PREFERENCESLOTS, memAddressSafe(value)); nreferenceSlotCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nreferenceSlotCount(struct) != 0) {
            check(memGetAddress(struct + VkVideoBeginCodingInfoKHR.PREFERENCESLOTS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkVideoBeginCodingInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoBeginCodingInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoBeginCodingInfoKHR ELEMENT_FACTORY = VkVideoBeginCodingInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoBeginCodingInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoBeginCodingInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoBeginCodingInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoBeginCodingInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoBeginCodingInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoBeginCodingInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoBeginCodingInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoBeginCodingInfoKHR#flags} field. */
        @NativeType("VkVideoBeginCodingFlagsKHR")
        public int flags() { return VkVideoBeginCodingInfoKHR.nflags(address()); }
        /** @return the value of the {@link VkVideoBeginCodingInfoKHR#videoSession} field. */
        @NativeType("VkVideoSessionKHR")
        public long videoSession() { return VkVideoBeginCodingInfoKHR.nvideoSession(address()); }
        /** @return the value of the {@link VkVideoBeginCodingInfoKHR#videoSessionParameters} field. */
        @NativeType("VkVideoSessionParametersKHR")
        public long videoSessionParameters() { return VkVideoBeginCodingInfoKHR.nvideoSessionParameters(address()); }
        /** @return the value of the {@link VkVideoBeginCodingInfoKHR#referenceSlotCount} field. */
        @NativeType("uint32_t")
        public int referenceSlotCount() { return VkVideoBeginCodingInfoKHR.nreferenceSlotCount(address()); }
        /** @return a {@link VkVideoReferenceSlotInfoKHR.Buffer} view of the struct array pointed to by the {@link VkVideoBeginCodingInfoKHR#pReferenceSlots} field. */
        @Nullable
        @NativeType("VkVideoReferenceSlotInfoKHR const *")
        public VkVideoReferenceSlotInfoKHR.Buffer pReferenceSlots() { return VkVideoBeginCodingInfoKHR.npReferenceSlots(address()); }

        /** Sets the specified value to the {@link VkVideoBeginCodingInfoKHR#sType} field. */
        public VkVideoBeginCodingInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoBeginCodingInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR} value to the {@link VkVideoBeginCodingInfoKHR#sType} field. */
        public VkVideoBeginCodingInfoKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoBeginCodingInfoKHR#pNext} field. */
        public VkVideoBeginCodingInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoBeginCodingInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoEncodeH264GopRemainingFrameInfoEXT} value to the {@code pNext} chain. */
        public VkVideoBeginCodingInfoKHR.Buffer pNext(VkVideoEncodeH264GopRemainingFrameInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH264RateControlInfoEXT} value to the {@code pNext} chain. */
        public VkVideoBeginCodingInfoKHR.Buffer pNext(VkVideoEncodeH264RateControlInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265GopRemainingFrameInfoEXT} value to the {@code pNext} chain. */
        public VkVideoBeginCodingInfoKHR.Buffer pNext(VkVideoEncodeH265GopRemainingFrameInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265RateControlInfoEXT} value to the {@code pNext} chain. */
        public VkVideoBeginCodingInfoKHR.Buffer pNext(VkVideoEncodeH265RateControlInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeRateControlInfoKHR} value to the {@code pNext} chain. */
        public VkVideoBeginCodingInfoKHR.Buffer pNext(VkVideoEncodeRateControlInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkVideoBeginCodingInfoKHR#flags} field. */
        public VkVideoBeginCodingInfoKHR.Buffer flags(@NativeType("VkVideoBeginCodingFlagsKHR") int value) { VkVideoBeginCodingInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoBeginCodingInfoKHR#videoSession} field. */
        public VkVideoBeginCodingInfoKHR.Buffer videoSession(@NativeType("VkVideoSessionKHR") long value) { VkVideoBeginCodingInfoKHR.nvideoSession(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoBeginCodingInfoKHR#videoSessionParameters} field. */
        public VkVideoBeginCodingInfoKHR.Buffer videoSessionParameters(@NativeType("VkVideoSessionParametersKHR") long value) { VkVideoBeginCodingInfoKHR.nvideoSessionParameters(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoReferenceSlotInfoKHR.Buffer} to the {@link VkVideoBeginCodingInfoKHR#pReferenceSlots} field. */
        public VkVideoBeginCodingInfoKHR.Buffer pReferenceSlots(@Nullable @NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR.Buffer value) { VkVideoBeginCodingInfoKHR.npReferenceSlots(address(), value); return this; }

    }

}