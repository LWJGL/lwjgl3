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
 * Structure specifying parameters of decoding a frame.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoDecodeQueue#VK_STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkVideoDecodeH264PictureInfoEXT} or {@link VkVideoDecodeH265PictureInfoEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkVideoDecodeFlagBitsKHR} values</li>
 * <li>{@code srcBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>{@code dstPictureResource} <b>must</b> be a valid {@link VkVideoPictureResourceKHR} structure</li>
 * <li>{@code pSetupReferenceSlot} <b>must</b> be a valid pointer to a valid {@link VkVideoReferenceSlotKHR} structure</li>
 * <li>If {@code referenceSlotCount} is not 0, {@code pReferenceSlots} <b>must</b> be a valid pointer to an array of {@code referenceSlotCount} valid {@link VkVideoReferenceSlotKHR} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}, {@link VkOffset2D}, {@link VkVideoPictureResourceKHR}, {@link VkVideoReferenceSlotKHR}, {@link KHRVideoDecodeQueue#vkCmdDecodeVideoKHR CmdDecodeVideoKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoDecodeInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoDecodeFlagsKHR {@link #flags};
 *     {@link VkOffset2D VkOffset2D} {@link #codedOffset};
 *     {@link VkExtent2D VkExtent2D} {@link #codedExtent};
 *     VkBuffer {@link #srcBuffer};
 *     VkDeviceSize {@link #srcBufferOffset};
 *     VkDeviceSize {@link #srcBufferRange};
 *     {@link VkVideoPictureResourceKHR VkVideoPictureResourceKHR} {@link #dstPictureResource};
 *     {@link VkVideoReferenceSlotKHR VkVideoReferenceSlotKHR} const * {@link #pSetupReferenceSlot};
 *     uint32_t {@link #referenceSlotCount};
 *     {@link VkVideoReferenceSlotKHR VkVideoReferenceSlotKHR} const * {@link #pReferenceSlots};
 * }</code></pre>
 */
public class VkVideoDecodeInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        CODEDOFFSET,
        CODEDEXTENT,
        SRCBUFFER,
        SRCBUFFEROFFSET,
        SRCBUFFERRANGE,
        DSTPICTURERESOURCE,
        PSETUPREFERENCESLOT,
        REFERENCESLOTCOUNT,
        PREFERENCESLOTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(8),
            __member(8),
            __member(8),
            __member(VkVideoPictureResourceKHR.SIZEOF, VkVideoPictureResourceKHR.ALIGNOF),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        CODEDOFFSET = layout.offsetof(3);
        CODEDEXTENT = layout.offsetof(4);
        SRCBUFFER = layout.offsetof(5);
        SRCBUFFEROFFSET = layout.offsetof(6);
        SRCBUFFERRANGE = layout.offsetof(7);
        DSTPICTURERESOURCE = layout.offsetof(8);
        PSETUPREFERENCESLOT = layout.offsetof(9);
        REFERENCESLOTCOUNT = layout.offsetof(10);
        PREFERENCESLOTS = layout.offsetof(11);
    }

    /**
     * Creates a {@code VkVideoDecodeInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. All the codec specific structures related to each frame(picture parameters, quantization matrix, etc.) <b>must</b> be chained here and pass to decode session with the function call {@link KHRVideoDecodeQueue#vkCmdDecodeVideoKHR CmdDecodeVideoKHR}. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkVideoDecodeFlagBitsKHR} specifying decode flags, reserved for future versions of this specification. */
    @NativeType("VkVideoDecodeFlagsKHR")
    public int flags() { return nflags(address()); }
    /** the coded offset of the decode operations. The purpose of this field is interpreted based on the codec extension. When decoding content in H.264 field mode, the {@code codedOffset} specifies the line or picture field’s offset within the image. */
    public VkOffset2D codedOffset() { return ncodedOffset(address()); }
    /** the coded size of the decode operations. */
    public VkExtent2D codedExtent() { return ncodedExtent(address()); }
    /** the source buffer that holds the encoded bitstream. */
    @NativeType("VkBuffer")
    public long srcBuffer() { return nsrcBuffer(address()); }
    /** the buffer offset where the valid encoded bitstream starts in srcBuffer. It <b>must</b> meet the alignment requirement {@code minBitstreamBufferOffsetAlignment} within {@link VkVideoCapabilitiesKHR} queried with the {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} function. */
    @NativeType("VkDeviceSize")
    public long srcBufferOffset() { return nsrcBufferOffset(address()); }
    /** the size of the srcBuffer with valid encoded bitstream, starting from {@code srcBufferOffset}. It <b>must</b> meet the alignment requirement {@code minBitstreamBufferSizeAlignment} within {@link VkVideoCapabilitiesKHR} queried with the {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} function. */
    @NativeType("VkDeviceSize")
    public long srcBufferRange() { return nsrcBufferRange(address()); }
    /** the destination <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#decoded-output-picture">Decoded Output Picture</a> Resource. */
    public VkVideoPictureResourceKHR dstPictureResource() { return ndstPictureResource(address()); }
    /** {@code NULL} or a pointer to a {@link VkVideoReferenceSlotKHR} structure used for generating a DPB reference slot and Picture Resource. {@code pSetupReferenceSlot→slotIndex} specifies the slot index number to use as a target for producing the DPB data. {@code slotIndex} <b>must</b> reference a valid entry as specified in {@link VkVideoBeginCodingInfoKHR} via the {@code pReferenceSlots} within the {@link KHRVideoQueue#vkCmdBeginVideoCodingKHR CmdBeginVideoCodingKHR} command that established the Vulkan Video Decode Context for this command. */
    @NativeType("VkVideoReferenceSlotKHR const *")
    public VkVideoReferenceSlotKHR pSetupReferenceSlot() { return npSetupReferenceSlot(address()); }
    /** the number of the DPB Reference Pictures that will be used when this decoding operation is executing. */
    @NativeType("uint32_t")
    public int referenceSlotCount() { return nreferenceSlotCount(address()); }
    /** a pointer to an array of {@link VkVideoReferenceSlotKHR} structures specifying the DPB Reference pictures that will be used when this decoding operation is executing. */
    @Nullable
    @NativeType("VkVideoReferenceSlotKHR const *")
    public VkVideoReferenceSlotKHR.Buffer pReferenceSlots() { return npReferenceSlots(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoDecodeInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoDecodeQueue#VK_STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoDecodeInfoKHR sType$Default() { return sType(KHRVideoDecodeQueue.VK_STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoDecodeInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoDecodeH264PictureInfoEXT} value to the {@code pNext} chain. */
    public VkVideoDecodeInfoKHR pNext(VkVideoDecodeH264PictureInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeH265PictureInfoEXT} value to the {@code pNext} chain. */
    public VkVideoDecodeInfoKHR pNext(VkVideoDecodeH265PictureInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkVideoDecodeInfoKHR flags(@NativeType("VkVideoDecodeFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Copies the specified {@link VkOffset2D} to the {@link #codedOffset} field. */
    public VkVideoDecodeInfoKHR codedOffset(VkOffset2D value) { ncodedOffset(address(), value); return this; }
    /** Passes the {@link #codedOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoDecodeInfoKHR codedOffset(java.util.function.Consumer<VkOffset2D> consumer) { consumer.accept(codedOffset()); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@link #codedExtent} field. */
    public VkVideoDecodeInfoKHR codedExtent(VkExtent2D value) { ncodedExtent(address(), value); return this; }
    /** Passes the {@link #codedExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoDecodeInfoKHR codedExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(codedExtent()); return this; }
    /** Sets the specified value to the {@link #srcBuffer} field. */
    public VkVideoDecodeInfoKHR srcBuffer(@NativeType("VkBuffer") long value) { nsrcBuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #srcBufferOffset} field. */
    public VkVideoDecodeInfoKHR srcBufferOffset(@NativeType("VkDeviceSize") long value) { nsrcBufferOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #srcBufferRange} field. */
    public VkVideoDecodeInfoKHR srcBufferRange(@NativeType("VkDeviceSize") long value) { nsrcBufferRange(address(), value); return this; }
    /** Copies the specified {@link VkVideoPictureResourceKHR} to the {@link #dstPictureResource} field. */
    public VkVideoDecodeInfoKHR dstPictureResource(VkVideoPictureResourceKHR value) { ndstPictureResource(address(), value); return this; }
    /** Passes the {@link #dstPictureResource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoDecodeInfoKHR dstPictureResource(java.util.function.Consumer<VkVideoPictureResourceKHR> consumer) { consumer.accept(dstPictureResource()); return this; }
    /** Sets the address of the specified {@link VkVideoReferenceSlotKHR} to the {@link #pSetupReferenceSlot} field. */
    public VkVideoDecodeInfoKHR pSetupReferenceSlot(@NativeType("VkVideoReferenceSlotKHR const *") VkVideoReferenceSlotKHR value) { npSetupReferenceSlot(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoReferenceSlotKHR.Buffer} to the {@link #pReferenceSlots} field. */
    public VkVideoDecodeInfoKHR pReferenceSlots(@Nullable @NativeType("VkVideoReferenceSlotKHR const *") VkVideoReferenceSlotKHR.Buffer value) { npReferenceSlots(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeInfoKHR set(
        int sType,
        long pNext,
        int flags,
        VkOffset2D codedOffset,
        VkExtent2D codedExtent,
        long srcBuffer,
        long srcBufferOffset,
        long srcBufferRange,
        VkVideoPictureResourceKHR dstPictureResource,
        VkVideoReferenceSlotKHR pSetupReferenceSlot,
        @Nullable VkVideoReferenceSlotKHR.Buffer pReferenceSlots
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        codedOffset(codedOffset);
        codedExtent(codedExtent);
        srcBuffer(srcBuffer);
        srcBufferOffset(srcBufferOffset);
        srcBufferRange(srcBufferRange);
        dstPictureResource(dstPictureResource);
        pSetupReferenceSlot(pSetupReferenceSlot);
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
    public VkVideoDecodeInfoKHR set(VkVideoDecodeInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeInfoKHR malloc() {
        return wrap(VkVideoDecodeInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeInfoKHR calloc() {
        return wrap(VkVideoDecodeInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoDecodeInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeInfoKHR} instance for the specified memory address. */
    public static VkVideoDecodeInfoKHR create(long address) {
        return wrap(VkVideoDecodeInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoDecodeInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkVideoDecodeInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoDecodeInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeInfoKHR malloc(MemoryStack stack) {
        return wrap(VkVideoDecodeInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoDecodeInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeInfoKHR calloc(MemoryStack stack) {
        return wrap(VkVideoDecodeInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoDecodeInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeInfoKHR.FLAGS); }
    /** Unsafe version of {@link #codedOffset}. */
    public static VkOffset2D ncodedOffset(long struct) { return VkOffset2D.create(struct + VkVideoDecodeInfoKHR.CODEDOFFSET); }
    /** Unsafe version of {@link #codedExtent}. */
    public static VkExtent2D ncodedExtent(long struct) { return VkExtent2D.create(struct + VkVideoDecodeInfoKHR.CODEDEXTENT); }
    /** Unsafe version of {@link #srcBuffer}. */
    public static long nsrcBuffer(long struct) { return UNSAFE.getLong(null, struct + VkVideoDecodeInfoKHR.SRCBUFFER); }
    /** Unsafe version of {@link #srcBufferOffset}. */
    public static long nsrcBufferOffset(long struct) { return UNSAFE.getLong(null, struct + VkVideoDecodeInfoKHR.SRCBUFFEROFFSET); }
    /** Unsafe version of {@link #srcBufferRange}. */
    public static long nsrcBufferRange(long struct) { return UNSAFE.getLong(null, struct + VkVideoDecodeInfoKHR.SRCBUFFERRANGE); }
    /** Unsafe version of {@link #dstPictureResource}. */
    public static VkVideoPictureResourceKHR ndstPictureResource(long struct) { return VkVideoPictureResourceKHR.create(struct + VkVideoDecodeInfoKHR.DSTPICTURERESOURCE); }
    /** Unsafe version of {@link #pSetupReferenceSlot}. */
    public static VkVideoReferenceSlotKHR npSetupReferenceSlot(long struct) { return VkVideoReferenceSlotKHR.create(memGetAddress(struct + VkVideoDecodeInfoKHR.PSETUPREFERENCESLOT)); }
    /** Unsafe version of {@link #referenceSlotCount}. */
    public static int nreferenceSlotCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeInfoKHR.REFERENCESLOTCOUNT); }
    /** Unsafe version of {@link #pReferenceSlots}. */
    @Nullable public static VkVideoReferenceSlotKHR.Buffer npReferenceSlots(long struct) { return VkVideoReferenceSlotKHR.createSafe(memGetAddress(struct + VkVideoDecodeInfoKHR.PREFERENCESLOTS), nreferenceSlotCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #codedOffset(VkOffset2D) codedOffset}. */
    public static void ncodedOffset(long struct, VkOffset2D value) { memCopy(value.address(), struct + VkVideoDecodeInfoKHR.CODEDOFFSET, VkOffset2D.SIZEOF); }
    /** Unsafe version of {@link #codedExtent(VkExtent2D) codedExtent}. */
    public static void ncodedExtent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkVideoDecodeInfoKHR.CODEDEXTENT, VkExtent2D.SIZEOF); }
    /** Unsafe version of {@link #srcBuffer(long) srcBuffer}. */
    public static void nsrcBuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkVideoDecodeInfoKHR.SRCBUFFER, value); }
    /** Unsafe version of {@link #srcBufferOffset(long) srcBufferOffset}. */
    public static void nsrcBufferOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkVideoDecodeInfoKHR.SRCBUFFEROFFSET, value); }
    /** Unsafe version of {@link #srcBufferRange(long) srcBufferRange}. */
    public static void nsrcBufferRange(long struct, long value) { UNSAFE.putLong(null, struct + VkVideoDecodeInfoKHR.SRCBUFFERRANGE, value); }
    /** Unsafe version of {@link #dstPictureResource(VkVideoPictureResourceKHR) dstPictureResource}. */
    public static void ndstPictureResource(long struct, VkVideoPictureResourceKHR value) { memCopy(value.address(), struct + VkVideoDecodeInfoKHR.DSTPICTURERESOURCE, VkVideoPictureResourceKHR.SIZEOF); }
    /** Unsafe version of {@link #pSetupReferenceSlot(VkVideoReferenceSlotKHR) pSetupReferenceSlot}. */
    public static void npSetupReferenceSlot(long struct, VkVideoReferenceSlotKHR value) { memPutAddress(struct + VkVideoDecodeInfoKHR.PSETUPREFERENCESLOT, value.address()); }
    /** Sets the specified value to the {@code referenceSlotCount} field of the specified {@code struct}. */
    public static void nreferenceSlotCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeInfoKHR.REFERENCESLOTCOUNT, value); }
    /** Unsafe version of {@link #pReferenceSlots(VkVideoReferenceSlotKHR.Buffer) pReferenceSlots}. */
    public static void npReferenceSlots(long struct, @Nullable VkVideoReferenceSlotKHR.Buffer value) { memPutAddress(struct + VkVideoDecodeInfoKHR.PREFERENCESLOTS, memAddressSafe(value)); nreferenceSlotCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pSetupReferenceSlot = memGetAddress(struct + VkVideoDecodeInfoKHR.PSETUPREFERENCESLOT);
        check(pSetupReferenceSlot);
        VkVideoReferenceSlotKHR.validate(pSetupReferenceSlot);
        int referenceSlotCount = nreferenceSlotCount(struct);
        if (referenceSlotCount != 0) {
            long pReferenceSlots = memGetAddress(struct + VkVideoDecodeInfoKHR.PREFERENCESLOTS);
            check(pReferenceSlots);
            validate(pReferenceSlots, referenceSlotCount, VkVideoReferenceSlotKHR.SIZEOF, VkVideoReferenceSlotKHR::validate);
        }
    }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoDecodeInfoKHR ELEMENT_FACTORY = VkVideoDecodeInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoDecodeInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoDecodeInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoDecodeInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoDecodeInfoKHR#flags} field. */
        @NativeType("VkVideoDecodeFlagsKHR")
        public int flags() { return VkVideoDecodeInfoKHR.nflags(address()); }
        /** @return a {@link VkOffset2D} view of the {@link VkVideoDecodeInfoKHR#codedOffset} field. */
        public VkOffset2D codedOffset() { return VkVideoDecodeInfoKHR.ncodedOffset(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoDecodeInfoKHR#codedExtent} field. */
        public VkExtent2D codedExtent() { return VkVideoDecodeInfoKHR.ncodedExtent(address()); }
        /** @return the value of the {@link VkVideoDecodeInfoKHR#srcBuffer} field. */
        @NativeType("VkBuffer")
        public long srcBuffer() { return VkVideoDecodeInfoKHR.nsrcBuffer(address()); }
        /** @return the value of the {@link VkVideoDecodeInfoKHR#srcBufferOffset} field. */
        @NativeType("VkDeviceSize")
        public long srcBufferOffset() { return VkVideoDecodeInfoKHR.nsrcBufferOffset(address()); }
        /** @return the value of the {@link VkVideoDecodeInfoKHR#srcBufferRange} field. */
        @NativeType("VkDeviceSize")
        public long srcBufferRange() { return VkVideoDecodeInfoKHR.nsrcBufferRange(address()); }
        /** @return a {@link VkVideoPictureResourceKHR} view of the {@link VkVideoDecodeInfoKHR#dstPictureResource} field. */
        public VkVideoPictureResourceKHR dstPictureResource() { return VkVideoDecodeInfoKHR.ndstPictureResource(address()); }
        /** @return a {@link VkVideoReferenceSlotKHR} view of the struct pointed to by the {@link VkVideoDecodeInfoKHR#pSetupReferenceSlot} field. */
        @NativeType("VkVideoReferenceSlotKHR const *")
        public VkVideoReferenceSlotKHR pSetupReferenceSlot() { return VkVideoDecodeInfoKHR.npSetupReferenceSlot(address()); }
        /** @return the value of the {@link VkVideoDecodeInfoKHR#referenceSlotCount} field. */
        @NativeType("uint32_t")
        public int referenceSlotCount() { return VkVideoDecodeInfoKHR.nreferenceSlotCount(address()); }
        /** @return a {@link VkVideoReferenceSlotKHR.Buffer} view of the struct array pointed to by the {@link VkVideoDecodeInfoKHR#pReferenceSlots} field. */
        @Nullable
        @NativeType("VkVideoReferenceSlotKHR const *")
        public VkVideoReferenceSlotKHR.Buffer pReferenceSlots() { return VkVideoDecodeInfoKHR.npReferenceSlots(address()); }

        /** Sets the specified value to the {@link VkVideoDecodeInfoKHR#sType} field. */
        public VkVideoDecodeInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoDecodeQueue#VK_STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR} value to the {@link VkVideoDecodeInfoKHR#sType} field. */
        public VkVideoDecodeInfoKHR.Buffer sType$Default() { return sType(KHRVideoDecodeQueue.VK_STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoDecodeInfoKHR#pNext} field. */
        public VkVideoDecodeInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoDecodeH264PictureInfoEXT} value to the {@code pNext} chain. */
        public VkVideoDecodeInfoKHR.Buffer pNext(VkVideoDecodeH264PictureInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeH265PictureInfoEXT} value to the {@code pNext} chain. */
        public VkVideoDecodeInfoKHR.Buffer pNext(VkVideoDecodeH265PictureInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkVideoDecodeInfoKHR#flags} field. */
        public VkVideoDecodeInfoKHR.Buffer flags(@NativeType("VkVideoDecodeFlagsKHR") int value) { VkVideoDecodeInfoKHR.nflags(address(), value); return this; }
        /** Copies the specified {@link VkOffset2D} to the {@link VkVideoDecodeInfoKHR#codedOffset} field. */
        public VkVideoDecodeInfoKHR.Buffer codedOffset(VkOffset2D value) { VkVideoDecodeInfoKHR.ncodedOffset(address(), value); return this; }
        /** Passes the {@link VkVideoDecodeInfoKHR#codedOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoDecodeInfoKHR.Buffer codedOffset(java.util.function.Consumer<VkOffset2D> consumer) { consumer.accept(codedOffset()); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@link VkVideoDecodeInfoKHR#codedExtent} field. */
        public VkVideoDecodeInfoKHR.Buffer codedExtent(VkExtent2D value) { VkVideoDecodeInfoKHR.ncodedExtent(address(), value); return this; }
        /** Passes the {@link VkVideoDecodeInfoKHR#codedExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoDecodeInfoKHR.Buffer codedExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(codedExtent()); return this; }
        /** Sets the specified value to the {@link VkVideoDecodeInfoKHR#srcBuffer} field. */
        public VkVideoDecodeInfoKHR.Buffer srcBuffer(@NativeType("VkBuffer") long value) { VkVideoDecodeInfoKHR.nsrcBuffer(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoDecodeInfoKHR#srcBufferOffset} field. */
        public VkVideoDecodeInfoKHR.Buffer srcBufferOffset(@NativeType("VkDeviceSize") long value) { VkVideoDecodeInfoKHR.nsrcBufferOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoDecodeInfoKHR#srcBufferRange} field. */
        public VkVideoDecodeInfoKHR.Buffer srcBufferRange(@NativeType("VkDeviceSize") long value) { VkVideoDecodeInfoKHR.nsrcBufferRange(address(), value); return this; }
        /** Copies the specified {@link VkVideoPictureResourceKHR} to the {@link VkVideoDecodeInfoKHR#dstPictureResource} field. */
        public VkVideoDecodeInfoKHR.Buffer dstPictureResource(VkVideoPictureResourceKHR value) { VkVideoDecodeInfoKHR.ndstPictureResource(address(), value); return this; }
        /** Passes the {@link VkVideoDecodeInfoKHR#dstPictureResource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoDecodeInfoKHR.Buffer dstPictureResource(java.util.function.Consumer<VkVideoPictureResourceKHR> consumer) { consumer.accept(dstPictureResource()); return this; }
        /** Sets the address of the specified {@link VkVideoReferenceSlotKHR} to the {@link VkVideoDecodeInfoKHR#pSetupReferenceSlot} field. */
        public VkVideoDecodeInfoKHR.Buffer pSetupReferenceSlot(@NativeType("VkVideoReferenceSlotKHR const *") VkVideoReferenceSlotKHR value) { VkVideoDecodeInfoKHR.npSetupReferenceSlot(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoReferenceSlotKHR.Buffer} to the {@link VkVideoDecodeInfoKHR#pReferenceSlots} field. */
        public VkVideoDecodeInfoKHR.Buffer pReferenceSlots(@Nullable @NativeType("VkVideoReferenceSlotKHR const *") VkVideoReferenceSlotKHR.Buffer value) { VkVideoDecodeInfoKHR.npReferenceSlots(address(), value); return this; }

    }

}