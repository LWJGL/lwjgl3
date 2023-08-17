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
 * <p>The coded size of the encode operation is specified in {@code codedExtent} of {@code srcPictureResource}.</p>
 * 
 * <p>Multiple {@link KHRVideoEncodeQueue#vkCmdEncodeVideoKHR CmdEncodeVideoKHR} commands <b>may</b> be recorded within a Vulkan Video Encode Context. The execution of each {@link KHRVideoEncodeQueue#vkCmdEncodeVideoKHR CmdEncodeVideoKHR} command will result in generating codec-specific bitstream units. These bitstream units are generated consecutively into the bitstream buffer specified in {@code dstBuffer} of a {@link VkVideoEncodeInfoKHR} structure within the {@link KHRVideoQueue#vkCmdBeginVideoCodingKHR CmdBeginVideoCodingKHR} command. The produced bitstream is the sum of all these bitstream units, including any padding between the bitstream units. Any bitstream padding <b>must</b> be filled with data compliant to the codec standard so as not to cause any syntax errors during decoding of the bitstream units with the padding included. The range of the bitstream buffer written <b>can</b> be queried via <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#queries-video-encode-feedback">video encode feedback queries</a>.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The bound video session <b>must</b> not be in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-session-uninitialized">uninitialized</a> state at the time the command is executed on the device</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkVideoEncodeH264PictureInfoEXT} or {@link VkVideoEncodeH265PictureInfoEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>{@code srcPictureResource} <b>must</b> be a valid {@link VkVideoPictureResourceInfoKHR} structure</li>
 * <li>If {@code pSetupReferenceSlot} is not {@code NULL}, {@code pSetupReferenceSlot} <b>must</b> be a valid pointer to a valid {@link VkVideoReferenceSlotInfoKHR} structure</li>
 * <li>If {@code referenceSlotCount} is not 0, {@code pReferenceSlots} <b>must</b> be a valid pointer to an array of {@code referenceSlotCount} valid {@link VkVideoReferenceSlotInfoKHR} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoPictureResourceInfoKHR}, {@link VkVideoReferenceSlotInfoKHR}, {@link KHRVideoEncodeQueue#vkCmdEncodeVideoKHR CmdEncodeVideoKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoEncodeFlagsKHR {@link #flags};
 *     VkBuffer {@link #dstBuffer};
 *     VkDeviceSize {@link #dstBufferOffset};
 *     VkDeviceSize {@link #dstBufferRange};
 *     {@link VkVideoPictureResourceInfoKHR VkVideoPictureResourceInfoKHR} {@link #srcPictureResource};
 *     {@link VkVideoReferenceSlotInfoKHR VkVideoReferenceSlotInfoKHR} const * {@link #pSetupReferenceSlot};
 *     uint32_t {@link #referenceSlotCount};
 *     {@link VkVideoReferenceSlotInfoKHR VkVideoReferenceSlotInfoKHR} const * {@link #pReferenceSlots};
 *     uint32_t {@link #precedingExternallyEncodedBytes};
 * }</code></pre>
 */
public class VkVideoEncodeInfoKHR extends Struct<VkVideoEncodeInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        DSTBUFFER,
        DSTBUFFEROFFSET,
        DSTBUFFERRANGE,
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
            __member(8),
            __member(8),
            __member(8),
            __member(VkVideoPictureResourceInfoKHR.SIZEOF, VkVideoPictureResourceInfoKHR.ALIGNOF),
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
        DSTBUFFER = layout.offsetof(3);
        DSTBUFFEROFFSET = layout.offsetof(4);
        DSTBUFFERRANGE = layout.offsetof(5);
        SRCPICTURERESOURCE = layout.offsetof(6);
        PSETUPREFERENCESLOT = layout.offsetof(7);
        REFERENCESLOTCOUNT = layout.offsetof(8);
        PREFERENCESLOTS = layout.offsetof(9);
        PRECEDINGEXTERNALLYENCODEDBYTES = layout.offsetof(10);
    }

    protected VkVideoEncodeInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeInfoKHR(address, container);
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

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** a pointer to a structure extending this structure. A codec-specific extension structure <b>must</b> be chained to specify what bitstream unit to generate with this encode operation. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** reserved for future use. */
    @NativeType("VkVideoEncodeFlagsKHR")
    public int flags() { return nflags(address()); }
    /** the destination video bitstream buffer to write the encoded bitstream to. */
    @NativeType("VkBuffer")
    public long dstBuffer() { return ndstBuffer(address()); }
    /** the starting offset in bytes from the start of {@code dstBuffer} to write the encoded bitstream to. {@code dstBufferOffset}’s value <b>must</b> be aligned to {@link VkVideoCapabilitiesKHR}{@code ::minBitstreamBufferOffsetAlignment}, as reported by the implementation. */
    @NativeType("VkDeviceSize")
    public long dstBufferOffset() { return ndstBufferOffset(address()); }
    /** the maximum size in bytes of the encoded bitstream written to {@code dstBuffer}, starting from {@code dstBufferOffset}. {@code dstBufferRange}’s value <b>must</b> be aligned to {@link VkVideoCapabilitiesKHR}{@code ::minBitstreamBufferSizeAlignment}, as reported by the implementation. */
    @NativeType("VkDeviceSize")
    public long dstBufferRange() { return ndstBufferRange(address()); }
    /** the Picture Resource of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-input-picture">Input Picture</a> to be encoded by the operation. */
    public VkVideoPictureResourceInfoKHR srcPictureResource() { return nsrcPictureResource(address()); }
    /** a pointer to a {@link VkVideoReferenceSlotInfoKHR} structure used for generating a reconstructed reference slot and Picture Resource. {@code pSetupReferenceSlot→slotIndex} specifies the slot index number to use as a target for producing the Reconstructed (DPB) data. {@code pSetupReferenceSlot} <b>must</b> be one of the entries provided in {@link VkVideoBeginCodingInfoKHR} via the {@code pReferenceSlots} within the {@link KHRVideoQueue#vkCmdBeginVideoCodingKHR CmdBeginVideoCodingKHR} command that established the Vulkan Video Encode Context for this command. */
    @Nullable
    @NativeType("VkVideoReferenceSlotInfoKHR const *")
    public VkVideoReferenceSlotInfoKHR pSetupReferenceSlot() { return npSetupReferenceSlot(address()); }
    /** the number of Reconstructed Reference Pictures that will be used when this encoding operation is executing. */
    @NativeType("uint32_t")
    public int referenceSlotCount() { return nreferenceSlotCount(address()); }
    /** {@code NULL} or a pointer to an array of {@link VkVideoReferenceSlotInfoKHR} structures that will be used when this encoding operation is executing. Each entry in {@code pReferenceSlots} <b>must</b> be one of the entries provided in {@link VkVideoBeginCodingInfoKHR} via the {@code pReferenceSlots} within the {@link KHRVideoQueue#vkCmdBeginVideoCodingKHR CmdBeginVideoCodingKHR} command that established the Vulkan Video Encode Context for this command. */
    @Nullable
    @NativeType("VkVideoReferenceSlotInfoKHR const *")
    public VkVideoReferenceSlotInfoKHR.Buffer pReferenceSlots() { return npReferenceSlots(address()); }
    /** the number of bytes externally encoded for insertion in the active video encode session overall bitstream prior to the bitstream that will be generated by the implementation for this instance of {@link VkVideoEncodeInfoKHR}. The value provided is used to update the implementation’s rate control algorithm for the rate control layer this instance of {@link VkVideoEncodeInfoKHR} belongs to, by accounting for the bitrate budget consumed by these externally encoded bytes. See {@link VkVideoEncodeRateControlInfoKHR} for additional information about encode rate control. */
    @NativeType("uint32_t")
    public int precedingExternallyEncodedBytes() { return nprecedingExternallyEncodedBytes(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeInfoKHR sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoEncodeH264PictureInfoEXT} value to the {@code pNext} chain. */
    public VkVideoEncodeInfoKHR pNext(VkVideoEncodeH264PictureInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265PictureInfoEXT} value to the {@code pNext} chain. */
    public VkVideoEncodeInfoKHR pNext(VkVideoEncodeH265PictureInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkVideoEncodeInfoKHR flags(@NativeType("VkVideoEncodeFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #dstBuffer} field. */
    public VkVideoEncodeInfoKHR dstBuffer(@NativeType("VkBuffer") long value) { ndstBuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #dstBufferOffset} field. */
    public VkVideoEncodeInfoKHR dstBufferOffset(@NativeType("VkDeviceSize") long value) { ndstBufferOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #dstBufferRange} field. */
    public VkVideoEncodeInfoKHR dstBufferRange(@NativeType("VkDeviceSize") long value) { ndstBufferRange(address(), value); return this; }
    /** Copies the specified {@link VkVideoPictureResourceInfoKHR} to the {@link #srcPictureResource} field. */
    public VkVideoEncodeInfoKHR srcPictureResource(VkVideoPictureResourceInfoKHR value) { nsrcPictureResource(address(), value); return this; }
    /** Passes the {@link #srcPictureResource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeInfoKHR srcPictureResource(java.util.function.Consumer<VkVideoPictureResourceInfoKHR> consumer) { consumer.accept(srcPictureResource()); return this; }
    /** Sets the address of the specified {@link VkVideoReferenceSlotInfoKHR} to the {@link #pSetupReferenceSlot} field. */
    public VkVideoEncodeInfoKHR pSetupReferenceSlot(@Nullable @NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR value) { npSetupReferenceSlot(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoReferenceSlotInfoKHR.Buffer} to the {@link #pReferenceSlots} field. */
    public VkVideoEncodeInfoKHR pReferenceSlots(@Nullable @NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR.Buffer value) { npReferenceSlots(address(), value); return this; }
    /** Sets the specified value to the {@link #precedingExternallyEncodedBytes} field. */
    public VkVideoEncodeInfoKHR precedingExternallyEncodedBytes(@NativeType("uint32_t") int value) { nprecedingExternallyEncodedBytes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeInfoKHR set(
        int sType,
        long pNext,
        int flags,
        long dstBuffer,
        long dstBufferOffset,
        long dstBufferRange,
        VkVideoPictureResourceInfoKHR srcPictureResource,
        @Nullable VkVideoReferenceSlotInfoKHR pSetupReferenceSlot,
        @Nullable VkVideoReferenceSlotInfoKHR.Buffer pReferenceSlots,
        int precedingExternallyEncodedBytes
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        dstBuffer(dstBuffer);
        dstBufferOffset(dstBufferOffset);
        dstBufferRange(dstBufferRange);
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
        return new VkVideoEncodeInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeInfoKHR calloc() {
        return new VkVideoEncodeInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeInfoKHR create(long address) {
        return new VkVideoEncodeInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeInfoKHR.FLAGS); }
    /** Unsafe version of {@link #dstBuffer}. */
    public static long ndstBuffer(long struct) { return UNSAFE.getLong(null, struct + VkVideoEncodeInfoKHR.DSTBUFFER); }
    /** Unsafe version of {@link #dstBufferOffset}. */
    public static long ndstBufferOffset(long struct) { return UNSAFE.getLong(null, struct + VkVideoEncodeInfoKHR.DSTBUFFEROFFSET); }
    /** Unsafe version of {@link #dstBufferRange}. */
    public static long ndstBufferRange(long struct) { return UNSAFE.getLong(null, struct + VkVideoEncodeInfoKHR.DSTBUFFERRANGE); }
    /** Unsafe version of {@link #srcPictureResource}. */
    public static VkVideoPictureResourceInfoKHR nsrcPictureResource(long struct) { return VkVideoPictureResourceInfoKHR.create(struct + VkVideoEncodeInfoKHR.SRCPICTURERESOURCE); }
    /** Unsafe version of {@link #pSetupReferenceSlot}. */
    @Nullable public static VkVideoReferenceSlotInfoKHR npSetupReferenceSlot(long struct) { return VkVideoReferenceSlotInfoKHR.createSafe(memGetAddress(struct + VkVideoEncodeInfoKHR.PSETUPREFERENCESLOT)); }
    /** Unsafe version of {@link #referenceSlotCount}. */
    public static int nreferenceSlotCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeInfoKHR.REFERENCESLOTCOUNT); }
    /** Unsafe version of {@link #pReferenceSlots}. */
    @Nullable public static VkVideoReferenceSlotInfoKHR.Buffer npReferenceSlots(long struct) { return VkVideoReferenceSlotInfoKHR.createSafe(memGetAddress(struct + VkVideoEncodeInfoKHR.PREFERENCESLOTS), nreferenceSlotCount(struct)); }
    /** Unsafe version of {@link #precedingExternallyEncodedBytes}. */
    public static int nprecedingExternallyEncodedBytes(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeInfoKHR.PRECEDINGEXTERNALLYENCODEDBYTES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #dstBuffer(long) dstBuffer}. */
    public static void ndstBuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkVideoEncodeInfoKHR.DSTBUFFER, value); }
    /** Unsafe version of {@link #dstBufferOffset(long) dstBufferOffset}. */
    public static void ndstBufferOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkVideoEncodeInfoKHR.DSTBUFFEROFFSET, value); }
    /** Unsafe version of {@link #dstBufferRange(long) dstBufferRange}. */
    public static void ndstBufferRange(long struct, long value) { UNSAFE.putLong(null, struct + VkVideoEncodeInfoKHR.DSTBUFFERRANGE, value); }
    /** Unsafe version of {@link #srcPictureResource(VkVideoPictureResourceInfoKHR) srcPictureResource}. */
    public static void nsrcPictureResource(long struct, VkVideoPictureResourceInfoKHR value) { memCopy(value.address(), struct + VkVideoEncodeInfoKHR.SRCPICTURERESOURCE, VkVideoPictureResourceInfoKHR.SIZEOF); }
    /** Unsafe version of {@link #pSetupReferenceSlot(VkVideoReferenceSlotInfoKHR) pSetupReferenceSlot}. */
    public static void npSetupReferenceSlot(long struct, @Nullable VkVideoReferenceSlotInfoKHR value) { memPutAddress(struct + VkVideoEncodeInfoKHR.PSETUPREFERENCESLOT, memAddressSafe(value)); }
    /** Sets the specified value to the {@code referenceSlotCount} field of the specified {@code struct}. */
    public static void nreferenceSlotCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeInfoKHR.REFERENCESLOTCOUNT, value); }
    /** Unsafe version of {@link #pReferenceSlots(VkVideoReferenceSlotInfoKHR.Buffer) pReferenceSlots}. */
    public static void npReferenceSlots(long struct, @Nullable VkVideoReferenceSlotInfoKHR.Buffer value) { memPutAddress(struct + VkVideoEncodeInfoKHR.PREFERENCESLOTS, memAddressSafe(value)); nreferenceSlotCount(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #precedingExternallyEncodedBytes(int) precedingExternallyEncodedBytes}. */
    public static void nprecedingExternallyEncodedBytes(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeInfoKHR.PRECEDINGEXTERNALLYENCODEDBYTES, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nreferenceSlotCount(struct) != 0) {
            check(memGetAddress(struct + VkVideoEncodeInfoKHR.PREFERENCESLOTS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeInfoKHR ELEMENT_FACTORY = VkVideoEncodeInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        /** @return the value of the {@link VkVideoEncodeInfoKHR#dstBuffer} field. */
        @NativeType("VkBuffer")
        public long dstBuffer() { return VkVideoEncodeInfoKHR.ndstBuffer(address()); }
        /** @return the value of the {@link VkVideoEncodeInfoKHR#dstBufferOffset} field. */
        @NativeType("VkDeviceSize")
        public long dstBufferOffset() { return VkVideoEncodeInfoKHR.ndstBufferOffset(address()); }
        /** @return the value of the {@link VkVideoEncodeInfoKHR#dstBufferRange} field. */
        @NativeType("VkDeviceSize")
        public long dstBufferRange() { return VkVideoEncodeInfoKHR.ndstBufferRange(address()); }
        /** @return a {@link VkVideoPictureResourceInfoKHR} view of the {@link VkVideoEncodeInfoKHR#srcPictureResource} field. */
        public VkVideoPictureResourceInfoKHR srcPictureResource() { return VkVideoEncodeInfoKHR.nsrcPictureResource(address()); }
        /** @return a {@link VkVideoReferenceSlotInfoKHR} view of the struct pointed to by the {@link VkVideoEncodeInfoKHR#pSetupReferenceSlot} field. */
        @Nullable
        @NativeType("VkVideoReferenceSlotInfoKHR const *")
        public VkVideoReferenceSlotInfoKHR pSetupReferenceSlot() { return VkVideoEncodeInfoKHR.npSetupReferenceSlot(address()); }
        /** @return the value of the {@link VkVideoEncodeInfoKHR#referenceSlotCount} field. */
        @NativeType("uint32_t")
        public int referenceSlotCount() { return VkVideoEncodeInfoKHR.nreferenceSlotCount(address()); }
        /** @return a {@link VkVideoReferenceSlotInfoKHR.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeInfoKHR#pReferenceSlots} field. */
        @Nullable
        @NativeType("VkVideoReferenceSlotInfoKHR const *")
        public VkVideoReferenceSlotInfoKHR.Buffer pReferenceSlots() { return VkVideoEncodeInfoKHR.npReferenceSlots(address()); }
        /** @return the value of the {@link VkVideoEncodeInfoKHR#precedingExternallyEncodedBytes} field. */
        @NativeType("uint32_t")
        public int precedingExternallyEncodedBytes() { return VkVideoEncodeInfoKHR.nprecedingExternallyEncodedBytes(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeInfoKHR#sType} field. */
        public VkVideoEncodeInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR} value to the {@link VkVideoEncodeInfoKHR#sType} field. */
        public VkVideoEncodeInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeInfoKHR#pNext} field. */
        public VkVideoEncodeInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoEncodeH264PictureInfoEXT} value to the {@code pNext} chain. */
        public VkVideoEncodeInfoKHR.Buffer pNext(VkVideoEncodeH264PictureInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265PictureInfoEXT} value to the {@code pNext} chain. */
        public VkVideoEncodeInfoKHR.Buffer pNext(VkVideoEncodeH265PictureInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkVideoEncodeInfoKHR#flags} field. */
        public VkVideoEncodeInfoKHR.Buffer flags(@NativeType("VkVideoEncodeFlagsKHR") int value) { VkVideoEncodeInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeInfoKHR#dstBuffer} field. */
        public VkVideoEncodeInfoKHR.Buffer dstBuffer(@NativeType("VkBuffer") long value) { VkVideoEncodeInfoKHR.ndstBuffer(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeInfoKHR#dstBufferOffset} field. */
        public VkVideoEncodeInfoKHR.Buffer dstBufferOffset(@NativeType("VkDeviceSize") long value) { VkVideoEncodeInfoKHR.ndstBufferOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeInfoKHR#dstBufferRange} field. */
        public VkVideoEncodeInfoKHR.Buffer dstBufferRange(@NativeType("VkDeviceSize") long value) { VkVideoEncodeInfoKHR.ndstBufferRange(address(), value); return this; }
        /** Copies the specified {@link VkVideoPictureResourceInfoKHR} to the {@link VkVideoEncodeInfoKHR#srcPictureResource} field. */
        public VkVideoEncodeInfoKHR.Buffer srcPictureResource(VkVideoPictureResourceInfoKHR value) { VkVideoEncodeInfoKHR.nsrcPictureResource(address(), value); return this; }
        /** Passes the {@link VkVideoEncodeInfoKHR#srcPictureResource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeInfoKHR.Buffer srcPictureResource(java.util.function.Consumer<VkVideoPictureResourceInfoKHR> consumer) { consumer.accept(srcPictureResource()); return this; }
        /** Sets the address of the specified {@link VkVideoReferenceSlotInfoKHR} to the {@link VkVideoEncodeInfoKHR#pSetupReferenceSlot} field. */
        public VkVideoEncodeInfoKHR.Buffer pSetupReferenceSlot(@Nullable @NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR value) { VkVideoEncodeInfoKHR.npSetupReferenceSlot(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoReferenceSlotInfoKHR.Buffer} to the {@link VkVideoEncodeInfoKHR#pReferenceSlots} field. */
        public VkVideoEncodeInfoKHR.Buffer pReferenceSlots(@Nullable @NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR.Buffer value) { VkVideoEncodeInfoKHR.npReferenceSlots(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeInfoKHR#precedingExternallyEncodedBytes} field. */
        public VkVideoEncodeInfoKHR.Buffer precedingExternallyEncodedBytes(@NativeType("uint32_t") int value) { VkVideoEncodeInfoKHR.nprecedingExternallyEncodedBytes(address(), value); return this; }

    }

}