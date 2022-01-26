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
 * Structure to chain codec-specific structures to.
 * 
 * <h5>Description</h5>
 * 
 * <p>Multiple {@link KHRVideoEncodeQueue#vkCmdEncodeVideoKHR CmdEncodeVideoKHR} commands <b>may</b> be recorded within a Vulkan Video Encode Context. The execution of each {@link KHRVideoEncodeQueue#vkCmdEncodeVideoKHR CmdEncodeVideoKHR} command will result in generating codec-specific bitstream units. These bitstream units are generated consecutively into the bitstream buffer specified in {@code dstBitstreamBuffer} of a {@link VkVideoEncodeInfoKHR} structure within the {@link KHRVideoQueue#vkCmdBeginVideoCodingKHR CmdBeginVideoCodingKHR} command. The produced bitstream is the sum of all these bitstream units, including any padding between the bitstream units. Any bitstream padding <b>must</b> be filled with data compliant to the codec standard so as not to cause any syntax errors during decoding of the bitstream units with the padding included. The range of the bitstream buffer written <b>can</b> be queried via <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#queries-video-encode-bitstream-buffer-range">video encode bitstream buffer range queries</a>.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkVideoEncodeH264EmitPictureParametersEXT}, {@link VkVideoEncodeH264VclFrameInfoEXT}, {@link VkVideoEncodeH265EmitPictureParametersEXT}, or {@link VkVideoEncodeH265VclFrameInfoEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkVideoEncodeFlagBitsKHR} values</li>
 * <li>{@code dstBitstreamBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>{@code srcPictureResource} <b>must</b> be a valid {@link VkVideoPictureResourceKHR} structure</li>
 * <li>{@code pSetupReferenceSlot} <b>must</b> be a valid pointer to a valid {@link VkVideoReferenceSlotKHR} structure</li>
 * <li>If {@code referenceSlotCount} is not 0, {@code pReferenceSlots} <b>must</b> be a valid pointer to an array of {@code referenceSlotCount} valid {@link VkVideoReferenceSlotKHR} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}, {@link VkVideoPictureResourceKHR}, {@link VkVideoReferenceSlotKHR}, {@link KHRVideoEncodeQueue#vkCmdEncodeVideoKHR CmdEncodeVideoKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoEncodeFlagsKHR {@link #flags};
 *     uint32_t {@link #qualityLevel};
 *     {@link VkExtent2D VkExtent2D} {@link #codedExtent};
 *     VkBuffer {@link #dstBitstreamBuffer};
 *     VkDeviceSize {@link #dstBitstreamBufferOffset};
 *     VkDeviceSize {@link #dstBitstreamBufferMaxRange};
 *     {@link VkVideoPictureResourceKHR VkVideoPictureResourceKHR} {@link #srcPictureResource};
 *     {@link VkVideoReferenceSlotKHR VkVideoReferenceSlotKHR} const * {@link #pSetupReferenceSlot};
 *     uint32_t {@link #referenceSlotCount};
 *     {@link VkVideoReferenceSlotKHR VkVideoReferenceSlotKHR} const * {@link #pReferenceSlots};
 *     uint32_t {@link #precedingExternallyEncodedBytes};
 * }</code></pre>
 */
public class VkVideoEncodeInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        QUALITYLEVEL,
        CODEDEXTENT,
        DSTBITSTREAMBUFFER,
        DSTBITSTREAMBUFFEROFFSET,
        DSTBITSTREAMBUFFERMAXRANGE,
        SRCPICTURERESOURCE,
        PSETUPREFERENCESLOT,
        REFERENCESLOTCOUNT,
        PREFERENCESLOTS,
        PRECEDINGEXTERNALLYENCODEDBYTES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(8),
            __member(8),
            __member(8),
            __member(VkVideoPictureResourceKHR.SIZEOF, VkVideoPictureResourceKHR.ALIGNOF),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        QUALITYLEVEL = layout.offsetof(3);
        CODEDEXTENT = layout.offsetof(4);
        DSTBITSTREAMBUFFER = layout.offsetof(5);
        DSTBITSTREAMBUFFEROFFSET = layout.offsetof(6);
        DSTBITSTREAMBUFFERMAXRANGE = layout.offsetof(7);
        SRCPICTURERESOURCE = layout.offsetof(8);
        PSETUPREFERENCESLOT = layout.offsetof(9);
        REFERENCESLOTCOUNT = layout.offsetof(10);
        PREFERENCESLOTS = layout.offsetof(11);
        PRECEDINGEXTERNALLYENCODEDBYTES = layout.offsetof(12);
    }

    /**
     * Creates a {@code VkVideoEncodeInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** a pointer to a structure extending this structure. A codec-specific extension structure <b>must</b> be chained to specify what bitstream unit to generate with this encode operation. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkVideoEncodeFlagBitsKHR} specifying encode flags, and is reserved for future versions of this specification. */
    @NativeType("VkVideoEncodeFlagsKHR")
    public int flags() { return nflags(address()); }
    /** the coding quality level of the encoding. It is defined by the codec-specific extensions. */
    @NativeType("uint32_t")
    public int qualityLevel() { return nqualityLevel(address()); }
    /** the coded size of the encode operations. */
    public VkExtent2D codedExtent() { return ncodedExtent(address()); }
    /** the buffer where the encoded bitstream output will be produced. */
    @NativeType("VkBuffer")
    public long dstBitstreamBuffer() { return ndstBitstreamBuffer(address()); }
    /** the offset in the {@code dstBitstreamBuffer} where the encoded bitstream output will start. {@code dstBitstreamBufferOffset}’s value <b>must</b> be aligned to {@link VkVideoCapabilitiesKHR}{@code ::minBitstreamBufferOffsetAlignment}, as reported by the implementation. */
    @NativeType("VkDeviceSize")
    public long dstBitstreamBufferOffset() { return ndstBitstreamBufferOffset(address()); }
    /** the maximum size of the {@code dstBitstreamBuffer} that can be used while the encoded bitstream output is produced. {@code dstBitstreamBufferMaxRange}’s value <b>must</b> be aligned to {@link VkVideoCapabilitiesKHR}{@code ::minBitstreamBufferSizeAlignment}, as reported by the implementation. */
    @NativeType("VkDeviceSize")
    public long dstBitstreamBufferMaxRange() { return ndstBitstreamBufferMaxRange(address()); }
    /** the Picture Resource of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#input-encode-picture">Input Picture</a> to be encoded by the operation. */
    public VkVideoPictureResourceKHR srcPictureResource() { return nsrcPictureResource(address()); }
    /** a pointer to a {@link VkVideoReferenceSlotKHR} structure used for generating a reconstructed reference slot and Picture Resource. {@code pSetupReferenceSlot→slotIndex} specifies the slot index number to use as a target for producing the Reconstructed (DPB) data. {@code pSetupReferenceSlot} <b>must</b> be one of the entries provided in {@link VkVideoBeginCodingInfoKHR} via the {@code pReferenceSlots} within the {@link KHRVideoQueue#vkCmdBeginVideoCodingKHR CmdBeginVideoCodingKHR} command that established the Vulkan Video Encode Context for this command. */
    @NativeType("VkVideoReferenceSlotKHR const *")
    public VkVideoReferenceSlotKHR pSetupReferenceSlot() { return npSetupReferenceSlot(address()); }
    /** the number of Reconstructed Reference Pictures that will be used when this encoding operation is executing. */
    @NativeType("uint32_t")
    public int referenceSlotCount() { return nreferenceSlotCount(address()); }
    /** {@code NULL} or a pointer to an array of {@link VkVideoReferenceSlotKHR} structures that will be used when this encoding operation is executing. Each entry in {@code pReferenceSlots} <b>must</b> be one of the entries provided in {@link VkVideoBeginCodingInfoKHR} via the {@code pReferenceSlots} within the {@link KHRVideoQueue#vkCmdBeginVideoCodingKHR CmdBeginVideoCodingKHR} command that established the Vulkan Video Encode Context for this command. */
    @Nullable
    @NativeType("VkVideoReferenceSlotKHR const *")
    public VkVideoReferenceSlotKHR.Buffer pReferenceSlots() { return npReferenceSlots(address()); }
    /** the number of bytes externally encoded for insertion in the active video encode session overall bitstream prior to the bitstream that will be generated by the implementation for this instance of {@link VkVideoEncodeInfoKHR}. Valid when {@link VkVideoEncodeRateControlInfoKHR}{@code ::rateControlMode} is not {@link KHRVideoEncodeQueue#VK_VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR}. The value provided is used to update the implementation’s rate control algorithm for the rate control layer this instance of {@link VkVideoEncodeInfoKHR} belongs to, by accounting for the bitrate budget consumed by these externally encoded bytes. See {@link VkVideoEncodeRateControlInfoKHR} for additional information about encode rate control. */
    @NativeType("uint32_t")
    public int precedingExternallyEncodedBytes() { return nprecedingExternallyEncodedBytes(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeInfoKHR sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoEncodeH264EmitPictureParametersEXT} value to the {@code pNext} chain. */
    public VkVideoEncodeInfoKHR pNext(VkVideoEncodeH264EmitPictureParametersEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH264VclFrameInfoEXT} value to the {@code pNext} chain. */
    public VkVideoEncodeInfoKHR pNext(VkVideoEncodeH264VclFrameInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265EmitPictureParametersEXT} value to the {@code pNext} chain. */
    public VkVideoEncodeInfoKHR pNext(VkVideoEncodeH265EmitPictureParametersEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265VclFrameInfoEXT} value to the {@code pNext} chain. */
    public VkVideoEncodeInfoKHR pNext(VkVideoEncodeH265VclFrameInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkVideoEncodeInfoKHR flags(@NativeType("VkVideoEncodeFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #qualityLevel} field. */
    public VkVideoEncodeInfoKHR qualityLevel(@NativeType("uint32_t") int value) { nqualityLevel(address(), value); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@link #codedExtent} field. */
    public VkVideoEncodeInfoKHR codedExtent(VkExtent2D value) { ncodedExtent(address(), value); return this; }
    /** Passes the {@link #codedExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeInfoKHR codedExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(codedExtent()); return this; }
    /** Sets the specified value to the {@link #dstBitstreamBuffer} field. */
    public VkVideoEncodeInfoKHR dstBitstreamBuffer(@NativeType("VkBuffer") long value) { ndstBitstreamBuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #dstBitstreamBufferOffset} field. */
    public VkVideoEncodeInfoKHR dstBitstreamBufferOffset(@NativeType("VkDeviceSize") long value) { ndstBitstreamBufferOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #dstBitstreamBufferMaxRange} field. */
    public VkVideoEncodeInfoKHR dstBitstreamBufferMaxRange(@NativeType("VkDeviceSize") long value) { ndstBitstreamBufferMaxRange(address(), value); return this; }
    /** Copies the specified {@link VkVideoPictureResourceKHR} to the {@link #srcPictureResource} field. */
    public VkVideoEncodeInfoKHR srcPictureResource(VkVideoPictureResourceKHR value) { nsrcPictureResource(address(), value); return this; }
    /** Passes the {@link #srcPictureResource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeInfoKHR srcPictureResource(java.util.function.Consumer<VkVideoPictureResourceKHR> consumer) { consumer.accept(srcPictureResource()); return this; }
    /** Sets the address of the specified {@link VkVideoReferenceSlotKHR} to the {@link #pSetupReferenceSlot} field. */
    public VkVideoEncodeInfoKHR pSetupReferenceSlot(@NativeType("VkVideoReferenceSlotKHR const *") VkVideoReferenceSlotKHR value) { npSetupReferenceSlot(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoReferenceSlotKHR.Buffer} to the {@link #pReferenceSlots} field. */
    public VkVideoEncodeInfoKHR pReferenceSlots(@Nullable @NativeType("VkVideoReferenceSlotKHR const *") VkVideoReferenceSlotKHR.Buffer value) { npReferenceSlots(address(), value); return this; }
    /** Sets the specified value to the {@link #precedingExternallyEncodedBytes} field. */
    public VkVideoEncodeInfoKHR precedingExternallyEncodedBytes(@NativeType("uint32_t") int value) { nprecedingExternallyEncodedBytes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeInfoKHR set(
        int sType,
        long pNext,
        int flags,
        int qualityLevel,
        VkExtent2D codedExtent,
        long dstBitstreamBuffer,
        long dstBitstreamBufferOffset,
        long dstBitstreamBufferMaxRange,
        VkVideoPictureResourceKHR srcPictureResource,
        VkVideoReferenceSlotKHR pSetupReferenceSlot,
        @Nullable VkVideoReferenceSlotKHR.Buffer pReferenceSlots,
        int precedingExternallyEncodedBytes
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        qualityLevel(qualityLevel);
        codedExtent(codedExtent);
        dstBitstreamBuffer(dstBitstreamBuffer);
        dstBitstreamBufferOffset(dstBitstreamBufferOffset);
        dstBitstreamBufferMaxRange(dstBitstreamBufferMaxRange);
        srcPictureResource(srcPictureResource);
        pSetupReferenceSlot(pSetupReferenceSlot);
        pReferenceSlots(pReferenceSlots);
        precedingExternallyEncodedBytes(precedingExternallyEncodedBytes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeInfoKHR set(VkVideoEncodeInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeInfoKHR malloc() {
        return wrap(VkVideoEncodeInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeInfoKHR calloc() {
        return wrap(VkVideoEncodeInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeInfoKHR create(long address) {
        return wrap(VkVideoEncodeInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeInfoKHR malloc(MemoryStack stack) {
        return wrap(VkVideoEncodeInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeInfoKHR calloc(MemoryStack stack) {
        return wrap(VkVideoEncodeInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeInfoKHR.FLAGS); }
    /** Unsafe version of {@link #qualityLevel}. */
    public static int nqualityLevel(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeInfoKHR.QUALITYLEVEL); }
    /** Unsafe version of {@link #codedExtent}. */
    public static VkExtent2D ncodedExtent(long struct) { return VkExtent2D.create(struct + VkVideoEncodeInfoKHR.CODEDEXTENT); }
    /** Unsafe version of {@link #dstBitstreamBuffer}. */
    public static long ndstBitstreamBuffer(long struct) { return UNSAFE.getLong(null, struct + VkVideoEncodeInfoKHR.DSTBITSTREAMBUFFER); }
    /** Unsafe version of {@link #dstBitstreamBufferOffset}. */
    public static long ndstBitstreamBufferOffset(long struct) { return UNSAFE.getLong(null, struct + VkVideoEncodeInfoKHR.DSTBITSTREAMBUFFEROFFSET); }
    /** Unsafe version of {@link #dstBitstreamBufferMaxRange}. */
    public static long ndstBitstreamBufferMaxRange(long struct) { return UNSAFE.getLong(null, struct + VkVideoEncodeInfoKHR.DSTBITSTREAMBUFFERMAXRANGE); }
    /** Unsafe version of {@link #srcPictureResource}. */
    public static VkVideoPictureResourceKHR nsrcPictureResource(long struct) { return VkVideoPictureResourceKHR.create(struct + VkVideoEncodeInfoKHR.SRCPICTURERESOURCE); }
    /** Unsafe version of {@link #pSetupReferenceSlot}. */
    public static VkVideoReferenceSlotKHR npSetupReferenceSlot(long struct) { return VkVideoReferenceSlotKHR.create(memGetAddress(struct + VkVideoEncodeInfoKHR.PSETUPREFERENCESLOT)); }
    /** Unsafe version of {@link #referenceSlotCount}. */
    public static int nreferenceSlotCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeInfoKHR.REFERENCESLOTCOUNT); }
    /** Unsafe version of {@link #pReferenceSlots}. */
    @Nullable public static VkVideoReferenceSlotKHR.Buffer npReferenceSlots(long struct) { return VkVideoReferenceSlotKHR.createSafe(memGetAddress(struct + VkVideoEncodeInfoKHR.PREFERENCESLOTS), nreferenceSlotCount(struct)); }
    /** Unsafe version of {@link #precedingExternallyEncodedBytes}. */
    public static int nprecedingExternallyEncodedBytes(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeInfoKHR.PRECEDINGEXTERNALLYENCODEDBYTES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #qualityLevel(int) qualityLevel}. */
    public static void nqualityLevel(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeInfoKHR.QUALITYLEVEL, value); }
    /** Unsafe version of {@link #codedExtent(VkExtent2D) codedExtent}. */
    public static void ncodedExtent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkVideoEncodeInfoKHR.CODEDEXTENT, VkExtent2D.SIZEOF); }
    /** Unsafe version of {@link #dstBitstreamBuffer(long) dstBitstreamBuffer}. */
    public static void ndstBitstreamBuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkVideoEncodeInfoKHR.DSTBITSTREAMBUFFER, value); }
    /** Unsafe version of {@link #dstBitstreamBufferOffset(long) dstBitstreamBufferOffset}. */
    public static void ndstBitstreamBufferOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkVideoEncodeInfoKHR.DSTBITSTREAMBUFFEROFFSET, value); }
    /** Unsafe version of {@link #dstBitstreamBufferMaxRange(long) dstBitstreamBufferMaxRange}. */
    public static void ndstBitstreamBufferMaxRange(long struct, long value) { UNSAFE.putLong(null, struct + VkVideoEncodeInfoKHR.DSTBITSTREAMBUFFERMAXRANGE, value); }
    /** Unsafe version of {@link #srcPictureResource(VkVideoPictureResourceKHR) srcPictureResource}. */
    public static void nsrcPictureResource(long struct, VkVideoPictureResourceKHR value) { memCopy(value.address(), struct + VkVideoEncodeInfoKHR.SRCPICTURERESOURCE, VkVideoPictureResourceKHR.SIZEOF); }
    /** Unsafe version of {@link #pSetupReferenceSlot(VkVideoReferenceSlotKHR) pSetupReferenceSlot}. */
    public static void npSetupReferenceSlot(long struct, VkVideoReferenceSlotKHR value) { memPutAddress(struct + VkVideoEncodeInfoKHR.PSETUPREFERENCESLOT, value.address()); }
    /** Sets the specified value to the {@code referenceSlotCount} field of the specified {@code struct}. */
    public static void nreferenceSlotCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeInfoKHR.REFERENCESLOTCOUNT, value); }
    /** Unsafe version of {@link #pReferenceSlots(VkVideoReferenceSlotKHR.Buffer) pReferenceSlots}. */
    public static void npReferenceSlots(long struct, @Nullable VkVideoReferenceSlotKHR.Buffer value) { memPutAddress(struct + VkVideoEncodeInfoKHR.PREFERENCESLOTS, memAddressSafe(value)); nreferenceSlotCount(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #precedingExternallyEncodedBytes(int) precedingExternallyEncodedBytes}. */
    public static void nprecedingExternallyEncodedBytes(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeInfoKHR.PRECEDINGEXTERNALLYENCODEDBYTES, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pSetupReferenceSlot = memGetAddress(struct + VkVideoEncodeInfoKHR.PSETUPREFERENCESLOT);
        check(pSetupReferenceSlot);
        VkVideoReferenceSlotKHR.validate(pSetupReferenceSlot);
        int referenceSlotCount = nreferenceSlotCount(struct);
        if (referenceSlotCount != 0) {
            long pReferenceSlots = memGetAddress(struct + VkVideoEncodeInfoKHR.PREFERENCESLOTS);
            check(pReferenceSlots);
            validate(pReferenceSlots, referenceSlotCount, VkVideoReferenceSlotKHR.SIZEOF, VkVideoReferenceSlotKHR::validate);
        }
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeInfoKHR ELEMENT_FACTORY = VkVideoEncodeInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoEncodeInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeInfoKHR#flags} field. */
        @NativeType("VkVideoEncodeFlagsKHR")
        public int flags() { return VkVideoEncodeInfoKHR.nflags(address()); }
        /** @return the value of the {@link VkVideoEncodeInfoKHR#qualityLevel} field. */
        @NativeType("uint32_t")
        public int qualityLevel() { return VkVideoEncodeInfoKHR.nqualityLevel(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoEncodeInfoKHR#codedExtent} field. */
        public VkExtent2D codedExtent() { return VkVideoEncodeInfoKHR.ncodedExtent(address()); }
        /** @return the value of the {@link VkVideoEncodeInfoKHR#dstBitstreamBuffer} field. */
        @NativeType("VkBuffer")
        public long dstBitstreamBuffer() { return VkVideoEncodeInfoKHR.ndstBitstreamBuffer(address()); }
        /** @return the value of the {@link VkVideoEncodeInfoKHR#dstBitstreamBufferOffset} field. */
        @NativeType("VkDeviceSize")
        public long dstBitstreamBufferOffset() { return VkVideoEncodeInfoKHR.ndstBitstreamBufferOffset(address()); }
        /** @return the value of the {@link VkVideoEncodeInfoKHR#dstBitstreamBufferMaxRange} field. */
        @NativeType("VkDeviceSize")
        public long dstBitstreamBufferMaxRange() { return VkVideoEncodeInfoKHR.ndstBitstreamBufferMaxRange(address()); }
        /** @return a {@link VkVideoPictureResourceKHR} view of the {@link VkVideoEncodeInfoKHR#srcPictureResource} field. */
        public VkVideoPictureResourceKHR srcPictureResource() { return VkVideoEncodeInfoKHR.nsrcPictureResource(address()); }
        /** @return a {@link VkVideoReferenceSlotKHR} view of the struct pointed to by the {@link VkVideoEncodeInfoKHR#pSetupReferenceSlot} field. */
        @NativeType("VkVideoReferenceSlotKHR const *")
        public VkVideoReferenceSlotKHR pSetupReferenceSlot() { return VkVideoEncodeInfoKHR.npSetupReferenceSlot(address()); }
        /** @return the value of the {@link VkVideoEncodeInfoKHR#referenceSlotCount} field. */
        @NativeType("uint32_t")
        public int referenceSlotCount() { return VkVideoEncodeInfoKHR.nreferenceSlotCount(address()); }
        /** @return a {@link VkVideoReferenceSlotKHR.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeInfoKHR#pReferenceSlots} field. */
        @Nullable
        @NativeType("VkVideoReferenceSlotKHR const *")
        public VkVideoReferenceSlotKHR.Buffer pReferenceSlots() { return VkVideoEncodeInfoKHR.npReferenceSlots(address()); }
        /** @return the value of the {@link VkVideoEncodeInfoKHR#precedingExternallyEncodedBytes} field. */
        @NativeType("uint32_t")
        public int precedingExternallyEncodedBytes() { return VkVideoEncodeInfoKHR.nprecedingExternallyEncodedBytes(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeInfoKHR#sType} field. */
        public VkVideoEncodeInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR} value to the {@link VkVideoEncodeInfoKHR#sType} field. */
        public VkVideoEncodeInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeInfoKHR#pNext} field. */
        public VkVideoEncodeInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoEncodeH264EmitPictureParametersEXT} value to the {@code pNext} chain. */
        public VkVideoEncodeInfoKHR.Buffer pNext(VkVideoEncodeH264EmitPictureParametersEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH264VclFrameInfoEXT} value to the {@code pNext} chain. */
        public VkVideoEncodeInfoKHR.Buffer pNext(VkVideoEncodeH264VclFrameInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265EmitPictureParametersEXT} value to the {@code pNext} chain. */
        public VkVideoEncodeInfoKHR.Buffer pNext(VkVideoEncodeH265EmitPictureParametersEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265VclFrameInfoEXT} value to the {@code pNext} chain. */
        public VkVideoEncodeInfoKHR.Buffer pNext(VkVideoEncodeH265VclFrameInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkVideoEncodeInfoKHR#flags} field. */
        public VkVideoEncodeInfoKHR.Buffer flags(@NativeType("VkVideoEncodeFlagsKHR") int value) { VkVideoEncodeInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeInfoKHR#qualityLevel} field. */
        public VkVideoEncodeInfoKHR.Buffer qualityLevel(@NativeType("uint32_t") int value) { VkVideoEncodeInfoKHR.nqualityLevel(address(), value); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@link VkVideoEncodeInfoKHR#codedExtent} field. */
        public VkVideoEncodeInfoKHR.Buffer codedExtent(VkExtent2D value) { VkVideoEncodeInfoKHR.ncodedExtent(address(), value); return this; }
        /** Passes the {@link VkVideoEncodeInfoKHR#codedExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeInfoKHR.Buffer codedExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(codedExtent()); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeInfoKHR#dstBitstreamBuffer} field. */
        public VkVideoEncodeInfoKHR.Buffer dstBitstreamBuffer(@NativeType("VkBuffer") long value) { VkVideoEncodeInfoKHR.ndstBitstreamBuffer(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeInfoKHR#dstBitstreamBufferOffset} field. */
        public VkVideoEncodeInfoKHR.Buffer dstBitstreamBufferOffset(@NativeType("VkDeviceSize") long value) { VkVideoEncodeInfoKHR.ndstBitstreamBufferOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeInfoKHR#dstBitstreamBufferMaxRange} field. */
        public VkVideoEncodeInfoKHR.Buffer dstBitstreamBufferMaxRange(@NativeType("VkDeviceSize") long value) { VkVideoEncodeInfoKHR.ndstBitstreamBufferMaxRange(address(), value); return this; }
        /** Copies the specified {@link VkVideoPictureResourceKHR} to the {@link VkVideoEncodeInfoKHR#srcPictureResource} field. */
        public VkVideoEncodeInfoKHR.Buffer srcPictureResource(VkVideoPictureResourceKHR value) { VkVideoEncodeInfoKHR.nsrcPictureResource(address(), value); return this; }
        /** Passes the {@link VkVideoEncodeInfoKHR#srcPictureResource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeInfoKHR.Buffer srcPictureResource(java.util.function.Consumer<VkVideoPictureResourceKHR> consumer) { consumer.accept(srcPictureResource()); return this; }
        /** Sets the address of the specified {@link VkVideoReferenceSlotKHR} to the {@link VkVideoEncodeInfoKHR#pSetupReferenceSlot} field. */
        public VkVideoEncodeInfoKHR.Buffer pSetupReferenceSlot(@NativeType("VkVideoReferenceSlotKHR const *") VkVideoReferenceSlotKHR value) { VkVideoEncodeInfoKHR.npSetupReferenceSlot(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoReferenceSlotKHR.Buffer} to the {@link VkVideoEncodeInfoKHR#pReferenceSlots} field. */
        public VkVideoEncodeInfoKHR.Buffer pReferenceSlots(@Nullable @NativeType("VkVideoReferenceSlotKHR const *") VkVideoReferenceSlotKHR.Buffer value) { VkVideoEncodeInfoKHR.npReferenceSlots(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeInfoKHR#precedingExternallyEncodedBytes} field. */
        public VkVideoEncodeInfoKHR.Buffer precedingExternallyEncodedBytes(@NativeType("uint32_t") int value) { VkVideoEncodeInfoKHR.nprecedingExternallyEncodedBytes(address(), value); return this; }

    }

}