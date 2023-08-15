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
 * Structure specifying video decode parameters.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code srcBuffer} <b>must</b> have been created with {@link KHRVideoDecodeQueue#VK_BUFFER_USAGE_VIDEO_DECODE_SRC_BIT_KHR BUFFER_USAGE_VIDEO_DECODE_SRC_BIT_KHR} set</li>
 * <li>{@code srcBufferOffset} <b>must</b> be less than the size of {@code srcBuffer}</li>
 * <li>{@code srcBufferRange} <b>must</b> be less than or equal to the size of {@code srcBuffer} minus {@code srcBufferOffset}</li>
 * <li>If {@code pSetupReferenceSlot} is not {@code NULL}, then its {@code slotIndex} member <b>must</b> not be negative</li>
 * <li>If {@code pSetupReferenceSlot} is not {@code NULL}, then its {@code pPictureResource} <b>must</b> not be {@code NULL}</li>
 * <li>The {@code slotIndex} member of each element of {@code pReferenceSlots} <b>must</b> not be negative</li>
 * <li>The {@code pPictureResource} member of each element of {@code pReferenceSlots} <b>must</b> not be {@code NULL}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoDecodeQueue#VK_STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkVideoDecodeH264PictureInfoKHR} or {@link VkVideoDecodeH265PictureInfoKHR}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code srcBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>{@code dstPictureResource} <b>must</b> be a valid {@link VkVideoPictureResourceInfoKHR} structure</li>
 * <li>If {@code pSetupReferenceSlot} is not {@code NULL}, {@code pSetupReferenceSlot} <b>must</b> be a valid pointer to a valid {@link VkVideoReferenceSlotInfoKHR} structure</li>
 * <li>If {@code referenceSlotCount} is not 0, {@code pReferenceSlots} <b>must</b> be a valid pointer to an array of {@code referenceSlotCount} valid {@link VkVideoReferenceSlotInfoKHR} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoPictureResourceInfoKHR}, {@link VkVideoReferenceSlotInfoKHR}, {@link KHRVideoDecodeQueue#vkCmdDecodeVideoKHR CmdDecodeVideoKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoDecodeInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoDecodeFlagsKHR {@link #flags};
 *     VkBuffer {@link #srcBuffer};
 *     VkDeviceSize {@link #srcBufferOffset};
 *     VkDeviceSize {@link #srcBufferRange};
 *     {@link VkVideoPictureResourceInfoKHR VkVideoPictureResourceInfoKHR} {@link #dstPictureResource};
 *     {@link VkVideoReferenceSlotInfoKHR VkVideoReferenceSlotInfoKHR} const * {@link #pSetupReferenceSlot};
 *     uint32_t {@link #referenceSlotCount};
 *     {@link VkVideoReferenceSlotInfoKHR VkVideoReferenceSlotInfoKHR} const * {@link #pReferenceSlots};
 * }</code></pre>
 */
public class VkVideoDecodeInfoKHR extends Struct<VkVideoDecodeInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
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
            __member(8),
            __member(8),
            __member(8),
            __member(VkVideoPictureResourceInfoKHR.SIZEOF, VkVideoPictureResourceInfoKHR.ALIGNOF),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SRCBUFFER = layout.offsetof(3);
        SRCBUFFEROFFSET = layout.offsetof(4);
        SRCBUFFERRANGE = layout.offsetof(5);
        DSTPICTURERESOURCE = layout.offsetof(6);
        PSETUPREFERENCESLOT = layout.offsetof(7);
        REFERENCESLOTCOUNT = layout.offsetof(8);
        PREFERENCESLOTS = layout.offsetof(9);
    }

    protected VkVideoDecodeInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoDecodeInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoDecodeInfoKHR(address, container);
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

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** reserved for future use. */
    @NativeType("VkVideoDecodeFlagsKHR")
    public int flags() { return nflags(address()); }
    /** the source video bitstream buffer to read the encoded bitstream from. */
    @NativeType("VkBuffer")
    public long srcBuffer() { return nsrcBuffer(address()); }
    /** the starting offset in bytes from the start of {@code srcBuffer} to read the encoded bitstream from. */
    @NativeType("VkDeviceSize")
    public long srcBufferOffset() { return nsrcBufferOffset(address()); }
    /** the size in bytes of the encoded bitstream to decode from {@code srcBuffer}, starting from {@code srcBufferOffset}. */
    @NativeType("VkDeviceSize")
    public long srcBufferRange() { return nsrcBufferRange(address()); }
    /** the video picture resource to use as the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-output-picture">decode output picture</a>. */
    public VkVideoPictureResourceInfoKHR dstPictureResource() { return ndstPictureResource(address()); }
    /** {@code NULL} or a pointer to a {@link VkVideoReferenceSlotInfoKHR} structure describing the DPB slot to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot-states">activate</a> and the video picture resource to use as the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#reconstructed-picture">reconstructed picture</a> to activate the DPB slot with. */
    @Nullable
    @NativeType("VkVideoReferenceSlotInfoKHR const *")
    public VkVideoReferenceSlotInfoKHR pSetupReferenceSlot() { return npSetupReferenceSlot(address()); }
    /** the number of elements in the {@code pReferenceSlots} array. */
    @NativeType("uint32_t")
    public int referenceSlotCount() { return nreferenceSlotCount(address()); }
    /** {@code NULL} or a pointer to an array of {@link VkVideoReferenceSlotInfoKHR} structures describing the DPB slots and corresponding <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#reference-picture">reference picture</a> resources to use in this video decode operation (the set of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#active-reference-pictures">active reference pictures</a>). */
    @Nullable
    @NativeType("VkVideoReferenceSlotInfoKHR const *")
    public VkVideoReferenceSlotInfoKHR.Buffer pReferenceSlots() { return npReferenceSlots(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoDecodeInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoDecodeQueue#VK_STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoDecodeInfoKHR sType$Default() { return sType(KHRVideoDecodeQueue.VK_STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoDecodeInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoDecodeH264PictureInfoKHR} value to the {@code pNext} chain. */
    public VkVideoDecodeInfoKHR pNext(VkVideoDecodeH264PictureInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeH265PictureInfoKHR} value to the {@code pNext} chain. */
    public VkVideoDecodeInfoKHR pNext(VkVideoDecodeH265PictureInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkVideoDecodeInfoKHR flags(@NativeType("VkVideoDecodeFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #srcBuffer} field. */
    public VkVideoDecodeInfoKHR srcBuffer(@NativeType("VkBuffer") long value) { nsrcBuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #srcBufferOffset} field. */
    public VkVideoDecodeInfoKHR srcBufferOffset(@NativeType("VkDeviceSize") long value) { nsrcBufferOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #srcBufferRange} field. */
    public VkVideoDecodeInfoKHR srcBufferRange(@NativeType("VkDeviceSize") long value) { nsrcBufferRange(address(), value); return this; }
    /** Copies the specified {@link VkVideoPictureResourceInfoKHR} to the {@link #dstPictureResource} field. */
    public VkVideoDecodeInfoKHR dstPictureResource(VkVideoPictureResourceInfoKHR value) { ndstPictureResource(address(), value); return this; }
    /** Passes the {@link #dstPictureResource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoDecodeInfoKHR dstPictureResource(java.util.function.Consumer<VkVideoPictureResourceInfoKHR> consumer) { consumer.accept(dstPictureResource()); return this; }
    /** Sets the address of the specified {@link VkVideoReferenceSlotInfoKHR} to the {@link #pSetupReferenceSlot} field. */
    public VkVideoDecodeInfoKHR pSetupReferenceSlot(@Nullable @NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR value) { npSetupReferenceSlot(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoReferenceSlotInfoKHR.Buffer} to the {@link #pReferenceSlots} field. */
    public VkVideoDecodeInfoKHR pReferenceSlots(@Nullable @NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR.Buffer value) { npReferenceSlots(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeInfoKHR set(
        int sType,
        long pNext,
        int flags,
        long srcBuffer,
        long srcBufferOffset,
        long srcBufferRange,
        VkVideoPictureResourceInfoKHR dstPictureResource,
        @Nullable VkVideoReferenceSlotInfoKHR pSetupReferenceSlot,
        @Nullable VkVideoReferenceSlotInfoKHR.Buffer pReferenceSlots
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
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
        return new VkVideoDecodeInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeInfoKHR calloc() {
        return new VkVideoDecodeInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeInfoKHR} instance for the specified memory address. */
    public static VkVideoDecodeInfoKHR create(long address) {
        return new VkVideoDecodeInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoDecodeInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoDecodeInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoDecodeInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoDecodeInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoDecodeInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeInfoKHR.FLAGS); }
    /** Unsafe version of {@link #srcBuffer}. */
    public static long nsrcBuffer(long struct) { return UNSAFE.getLong(null, struct + VkVideoDecodeInfoKHR.SRCBUFFER); }
    /** Unsafe version of {@link #srcBufferOffset}. */
    public static long nsrcBufferOffset(long struct) { return UNSAFE.getLong(null, struct + VkVideoDecodeInfoKHR.SRCBUFFEROFFSET); }
    /** Unsafe version of {@link #srcBufferRange}. */
    public static long nsrcBufferRange(long struct) { return UNSAFE.getLong(null, struct + VkVideoDecodeInfoKHR.SRCBUFFERRANGE); }
    /** Unsafe version of {@link #dstPictureResource}. */
    public static VkVideoPictureResourceInfoKHR ndstPictureResource(long struct) { return VkVideoPictureResourceInfoKHR.create(struct + VkVideoDecodeInfoKHR.DSTPICTURERESOURCE); }
    /** Unsafe version of {@link #pSetupReferenceSlot}. */
    @Nullable public static VkVideoReferenceSlotInfoKHR npSetupReferenceSlot(long struct) { return VkVideoReferenceSlotInfoKHR.createSafe(memGetAddress(struct + VkVideoDecodeInfoKHR.PSETUPREFERENCESLOT)); }
    /** Unsafe version of {@link #referenceSlotCount}. */
    public static int nreferenceSlotCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeInfoKHR.REFERENCESLOTCOUNT); }
    /** Unsafe version of {@link #pReferenceSlots}. */
    @Nullable public static VkVideoReferenceSlotInfoKHR.Buffer npReferenceSlots(long struct) { return VkVideoReferenceSlotInfoKHR.createSafe(memGetAddress(struct + VkVideoDecodeInfoKHR.PREFERENCESLOTS), nreferenceSlotCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #srcBuffer(long) srcBuffer}. */
    public static void nsrcBuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkVideoDecodeInfoKHR.SRCBUFFER, value); }
    /** Unsafe version of {@link #srcBufferOffset(long) srcBufferOffset}. */
    public static void nsrcBufferOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkVideoDecodeInfoKHR.SRCBUFFEROFFSET, value); }
    /** Unsafe version of {@link #srcBufferRange(long) srcBufferRange}. */
    public static void nsrcBufferRange(long struct, long value) { UNSAFE.putLong(null, struct + VkVideoDecodeInfoKHR.SRCBUFFERRANGE, value); }
    /** Unsafe version of {@link #dstPictureResource(VkVideoPictureResourceInfoKHR) dstPictureResource}. */
    public static void ndstPictureResource(long struct, VkVideoPictureResourceInfoKHR value) { memCopy(value.address(), struct + VkVideoDecodeInfoKHR.DSTPICTURERESOURCE, VkVideoPictureResourceInfoKHR.SIZEOF); }
    /** Unsafe version of {@link #pSetupReferenceSlot(VkVideoReferenceSlotInfoKHR) pSetupReferenceSlot}. */
    public static void npSetupReferenceSlot(long struct, @Nullable VkVideoReferenceSlotInfoKHR value) { memPutAddress(struct + VkVideoDecodeInfoKHR.PSETUPREFERENCESLOT, memAddressSafe(value)); }
    /** Sets the specified value to the {@code referenceSlotCount} field of the specified {@code struct}. */
    public static void nreferenceSlotCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeInfoKHR.REFERENCESLOTCOUNT, value); }
    /** Unsafe version of {@link #pReferenceSlots(VkVideoReferenceSlotInfoKHR.Buffer) pReferenceSlots}. */
    public static void npReferenceSlots(long struct, @Nullable VkVideoReferenceSlotInfoKHR.Buffer value) { memPutAddress(struct + VkVideoDecodeInfoKHR.PREFERENCESLOTS, memAddressSafe(value)); nreferenceSlotCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nreferenceSlotCount(struct) != 0) {
            check(memGetAddress(struct + VkVideoDecodeInfoKHR.PREFERENCESLOTS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoDecodeInfoKHR ELEMENT_FACTORY = VkVideoDecodeInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        /** @return the value of the {@link VkVideoDecodeInfoKHR#srcBuffer} field. */
        @NativeType("VkBuffer")
        public long srcBuffer() { return VkVideoDecodeInfoKHR.nsrcBuffer(address()); }
        /** @return the value of the {@link VkVideoDecodeInfoKHR#srcBufferOffset} field. */
        @NativeType("VkDeviceSize")
        public long srcBufferOffset() { return VkVideoDecodeInfoKHR.nsrcBufferOffset(address()); }
        /** @return the value of the {@link VkVideoDecodeInfoKHR#srcBufferRange} field. */
        @NativeType("VkDeviceSize")
        public long srcBufferRange() { return VkVideoDecodeInfoKHR.nsrcBufferRange(address()); }
        /** @return a {@link VkVideoPictureResourceInfoKHR} view of the {@link VkVideoDecodeInfoKHR#dstPictureResource} field. */
        public VkVideoPictureResourceInfoKHR dstPictureResource() { return VkVideoDecodeInfoKHR.ndstPictureResource(address()); }
        /** @return a {@link VkVideoReferenceSlotInfoKHR} view of the struct pointed to by the {@link VkVideoDecodeInfoKHR#pSetupReferenceSlot} field. */
        @Nullable
        @NativeType("VkVideoReferenceSlotInfoKHR const *")
        public VkVideoReferenceSlotInfoKHR pSetupReferenceSlot() { return VkVideoDecodeInfoKHR.npSetupReferenceSlot(address()); }
        /** @return the value of the {@link VkVideoDecodeInfoKHR#referenceSlotCount} field. */
        @NativeType("uint32_t")
        public int referenceSlotCount() { return VkVideoDecodeInfoKHR.nreferenceSlotCount(address()); }
        /** @return a {@link VkVideoReferenceSlotInfoKHR.Buffer} view of the struct array pointed to by the {@link VkVideoDecodeInfoKHR#pReferenceSlots} field. */
        @Nullable
        @NativeType("VkVideoReferenceSlotInfoKHR const *")
        public VkVideoReferenceSlotInfoKHR.Buffer pReferenceSlots() { return VkVideoDecodeInfoKHR.npReferenceSlots(address()); }

        /** Sets the specified value to the {@link VkVideoDecodeInfoKHR#sType} field. */
        public VkVideoDecodeInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoDecodeQueue#VK_STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR} value to the {@link VkVideoDecodeInfoKHR#sType} field. */
        public VkVideoDecodeInfoKHR.Buffer sType$Default() { return sType(KHRVideoDecodeQueue.VK_STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoDecodeInfoKHR#pNext} field. */
        public VkVideoDecodeInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoDecodeH264PictureInfoKHR} value to the {@code pNext} chain. */
        public VkVideoDecodeInfoKHR.Buffer pNext(VkVideoDecodeH264PictureInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeH265PictureInfoKHR} value to the {@code pNext} chain. */
        public VkVideoDecodeInfoKHR.Buffer pNext(VkVideoDecodeH265PictureInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkVideoDecodeInfoKHR#flags} field. */
        public VkVideoDecodeInfoKHR.Buffer flags(@NativeType("VkVideoDecodeFlagsKHR") int value) { VkVideoDecodeInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoDecodeInfoKHR#srcBuffer} field. */
        public VkVideoDecodeInfoKHR.Buffer srcBuffer(@NativeType("VkBuffer") long value) { VkVideoDecodeInfoKHR.nsrcBuffer(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoDecodeInfoKHR#srcBufferOffset} field. */
        public VkVideoDecodeInfoKHR.Buffer srcBufferOffset(@NativeType("VkDeviceSize") long value) { VkVideoDecodeInfoKHR.nsrcBufferOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoDecodeInfoKHR#srcBufferRange} field. */
        public VkVideoDecodeInfoKHR.Buffer srcBufferRange(@NativeType("VkDeviceSize") long value) { VkVideoDecodeInfoKHR.nsrcBufferRange(address(), value); return this; }
        /** Copies the specified {@link VkVideoPictureResourceInfoKHR} to the {@link VkVideoDecodeInfoKHR#dstPictureResource} field. */
        public VkVideoDecodeInfoKHR.Buffer dstPictureResource(VkVideoPictureResourceInfoKHR value) { VkVideoDecodeInfoKHR.ndstPictureResource(address(), value); return this; }
        /** Passes the {@link VkVideoDecodeInfoKHR#dstPictureResource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoDecodeInfoKHR.Buffer dstPictureResource(java.util.function.Consumer<VkVideoPictureResourceInfoKHR> consumer) { consumer.accept(dstPictureResource()); return this; }
        /** Sets the address of the specified {@link VkVideoReferenceSlotInfoKHR} to the {@link VkVideoDecodeInfoKHR#pSetupReferenceSlot} field. */
        public VkVideoDecodeInfoKHR.Buffer pSetupReferenceSlot(@Nullable @NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR value) { VkVideoDecodeInfoKHR.npSetupReferenceSlot(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoReferenceSlotInfoKHR.Buffer} to the {@link VkVideoDecodeInfoKHR#pReferenceSlots} field. */
        public VkVideoDecodeInfoKHR.Buffer pReferenceSlots(@Nullable @NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR.Buffer value) { VkVideoDecodeInfoKHR.npReferenceSlots(address(), value); return this; }

    }

}