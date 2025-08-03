/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkVideoEncodeInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkVideoEncodeFlagsKHR flags;
 *     VkBuffer dstBuffer;
 *     VkDeviceSize dstBufferOffset;
 *     VkDeviceSize dstBufferRange;
 *     {@link VkVideoPictureResourceInfoKHR VkVideoPictureResourceInfoKHR} srcPictureResource;
 *     {@link VkVideoReferenceSlotInfoKHR VkVideoReferenceSlotInfoKHR} const * pSetupReferenceSlot;
 *     uint32_t referenceSlotCount;
 *     {@link VkVideoReferenceSlotInfoKHR VkVideoReferenceSlotInfoKHR} const * pReferenceSlots;
 *     uint32_t precedingExternallyEncodedBytes;
 * }}</pre>
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkVideoEncodeFlagsKHR")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code dstBuffer} field. */
    @NativeType("VkBuffer")
    public long dstBuffer() { return ndstBuffer(address()); }
    /** @return the value of the {@code dstBufferOffset} field. */
    @NativeType("VkDeviceSize")
    public long dstBufferOffset() { return ndstBufferOffset(address()); }
    /** @return the value of the {@code dstBufferRange} field. */
    @NativeType("VkDeviceSize")
    public long dstBufferRange() { return ndstBufferRange(address()); }
    /** @return a {@link VkVideoPictureResourceInfoKHR} view of the {@code srcPictureResource} field. */
    public VkVideoPictureResourceInfoKHR srcPictureResource() { return nsrcPictureResource(address()); }
    /** @return a {@link VkVideoReferenceSlotInfoKHR} view of the struct pointed to by the {@code pSetupReferenceSlot} field. */
    @NativeType("VkVideoReferenceSlotInfoKHR const *")
    public @Nullable VkVideoReferenceSlotInfoKHR pSetupReferenceSlot() { return npSetupReferenceSlot(address()); }
    /** @return the value of the {@code referenceSlotCount} field. */
    @NativeType("uint32_t")
    public int referenceSlotCount() { return nreferenceSlotCount(address()); }
    /** @return a {@link VkVideoReferenceSlotInfoKHR.Buffer} view of the struct array pointed to by the {@code pReferenceSlots} field. */
    @NativeType("VkVideoReferenceSlotInfoKHR const *")
    public VkVideoReferenceSlotInfoKHR.@Nullable Buffer pReferenceSlots() { return npReferenceSlots(address()); }
    /** @return the value of the {@code precedingExternallyEncodedBytes} field. */
    @NativeType("uint32_t")
    public int precedingExternallyEncodedBytes() { return nprecedingExternallyEncodedBytes(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR} value to the {@code sType} field. */
    public VkVideoEncodeInfoKHR sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoEncodeAV1PictureInfoKHR} value to the {@code pNext} chain. */
    public VkVideoEncodeInfoKHR pNext(VkVideoEncodeAV1PictureInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH264PictureInfoKHR} value to the {@code pNext} chain. */
    public VkVideoEncodeInfoKHR pNext(VkVideoEncodeH264PictureInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265PictureInfoKHR} value to the {@code pNext} chain. */
    public VkVideoEncodeInfoKHR pNext(VkVideoEncodeH265PictureInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeIntraRefreshInfoKHR} value to the {@code pNext} chain. */
    public VkVideoEncodeInfoKHR pNext(VkVideoEncodeIntraRefreshInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeQuantizationMapInfoKHR} value to the {@code pNext} chain. */
    public VkVideoEncodeInfoKHR pNext(VkVideoEncodeQuantizationMapInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoInlineQueryInfoKHR} value to the {@code pNext} chain. */
    public VkVideoEncodeInfoKHR pNext(VkVideoInlineQueryInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkVideoEncodeInfoKHR flags(@NativeType("VkVideoEncodeFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code dstBuffer} field. */
    public VkVideoEncodeInfoKHR dstBuffer(@NativeType("VkBuffer") long value) { ndstBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code dstBufferOffset} field. */
    public VkVideoEncodeInfoKHR dstBufferOffset(@NativeType("VkDeviceSize") long value) { ndstBufferOffset(address(), value); return this; }
    /** Sets the specified value to the {@code dstBufferRange} field. */
    public VkVideoEncodeInfoKHR dstBufferRange(@NativeType("VkDeviceSize") long value) { ndstBufferRange(address(), value); return this; }
    /** Copies the specified {@link VkVideoPictureResourceInfoKHR} to the {@code srcPictureResource} field. */
    public VkVideoEncodeInfoKHR srcPictureResource(VkVideoPictureResourceInfoKHR value) { nsrcPictureResource(address(), value); return this; }
    /** Passes the {@code srcPictureResource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkVideoEncodeInfoKHR srcPictureResource(java.util.function.Consumer<VkVideoPictureResourceInfoKHR> consumer) { consumer.accept(srcPictureResource()); return this; }
    /** Sets the address of the specified {@link VkVideoReferenceSlotInfoKHR} to the {@code pSetupReferenceSlot} field. */
    public VkVideoEncodeInfoKHR pSetupReferenceSlot(@Nullable @NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR value) { npSetupReferenceSlot(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoReferenceSlotInfoKHR.Buffer} to the {@code pReferenceSlots} field. */
    public VkVideoEncodeInfoKHR pReferenceSlots(@NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR.@Nullable Buffer value) { npReferenceSlots(address(), value); return this; }
    /** Sets the specified value to the {@code precedingExternallyEncodedBytes} field. */
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
        VkVideoReferenceSlotInfoKHR.@Nullable Buffer pReferenceSlots,
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
    public static @Nullable VkVideoEncodeInfoKHR createSafe(long address) {
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
    public static VkVideoEncodeInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
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
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkVideoEncodeInfoKHR.FLAGS); }
    /** Unsafe version of {@link #dstBuffer}. */
    public static long ndstBuffer(long struct) { return memGetLong(struct + VkVideoEncodeInfoKHR.DSTBUFFER); }
    /** Unsafe version of {@link #dstBufferOffset}. */
    public static long ndstBufferOffset(long struct) { return memGetLong(struct + VkVideoEncodeInfoKHR.DSTBUFFEROFFSET); }
    /** Unsafe version of {@link #dstBufferRange}. */
    public static long ndstBufferRange(long struct) { return memGetLong(struct + VkVideoEncodeInfoKHR.DSTBUFFERRANGE); }
    /** Unsafe version of {@link #srcPictureResource}. */
    public static VkVideoPictureResourceInfoKHR nsrcPictureResource(long struct) { return VkVideoPictureResourceInfoKHR.create(struct + VkVideoEncodeInfoKHR.SRCPICTURERESOURCE); }
    /** Unsafe version of {@link #pSetupReferenceSlot}. */
    public static @Nullable VkVideoReferenceSlotInfoKHR npSetupReferenceSlot(long struct) { return VkVideoReferenceSlotInfoKHR.createSafe(memGetAddress(struct + VkVideoEncodeInfoKHR.PSETUPREFERENCESLOT)); }
    /** Unsafe version of {@link #referenceSlotCount}. */
    public static int nreferenceSlotCount(long struct) { return memGetInt(struct + VkVideoEncodeInfoKHR.REFERENCESLOTCOUNT); }
    /** Unsafe version of {@link #pReferenceSlots}. */
    public static VkVideoReferenceSlotInfoKHR.@Nullable Buffer npReferenceSlots(long struct) { return VkVideoReferenceSlotInfoKHR.createSafe(memGetAddress(struct + VkVideoEncodeInfoKHR.PREFERENCESLOTS), nreferenceSlotCount(struct)); }
    /** Unsafe version of {@link #precedingExternallyEncodedBytes}. */
    public static int nprecedingExternallyEncodedBytes(long struct) { return memGetInt(struct + VkVideoEncodeInfoKHR.PRECEDINGEXTERNALLYENCODEDBYTES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkVideoEncodeInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #dstBuffer(long) dstBuffer}. */
    public static void ndstBuffer(long struct, long value) { memPutLong(struct + VkVideoEncodeInfoKHR.DSTBUFFER, value); }
    /** Unsafe version of {@link #dstBufferOffset(long) dstBufferOffset}. */
    public static void ndstBufferOffset(long struct, long value) { memPutLong(struct + VkVideoEncodeInfoKHR.DSTBUFFEROFFSET, value); }
    /** Unsafe version of {@link #dstBufferRange(long) dstBufferRange}. */
    public static void ndstBufferRange(long struct, long value) { memPutLong(struct + VkVideoEncodeInfoKHR.DSTBUFFERRANGE, value); }
    /** Unsafe version of {@link #srcPictureResource(VkVideoPictureResourceInfoKHR) srcPictureResource}. */
    public static void nsrcPictureResource(long struct, VkVideoPictureResourceInfoKHR value) { memCopy(value.address(), struct + VkVideoEncodeInfoKHR.SRCPICTURERESOURCE, VkVideoPictureResourceInfoKHR.SIZEOF); }
    /** Unsafe version of {@link #pSetupReferenceSlot(VkVideoReferenceSlotInfoKHR) pSetupReferenceSlot}. */
    public static void npSetupReferenceSlot(long struct, @Nullable VkVideoReferenceSlotInfoKHR value) { memPutAddress(struct + VkVideoEncodeInfoKHR.PSETUPREFERENCESLOT, memAddressSafe(value)); }
    /** Sets the specified value to the {@code referenceSlotCount} field of the specified {@code struct}. */
    public static void nreferenceSlotCount(long struct, int value) { memPutInt(struct + VkVideoEncodeInfoKHR.REFERENCESLOTCOUNT, value); }
    /** Unsafe version of {@link #pReferenceSlots(VkVideoReferenceSlotInfoKHR.Buffer) pReferenceSlots}. */
    public static void npReferenceSlots(long struct, VkVideoReferenceSlotInfoKHR.@Nullable Buffer value) { memPutAddress(struct + VkVideoEncodeInfoKHR.PREFERENCESLOTS, memAddressSafe(value)); nreferenceSlotCount(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #precedingExternallyEncodedBytes(int) precedingExternallyEncodedBytes}. */
    public static void nprecedingExternallyEncodedBytes(long struct, int value) { memPutInt(struct + VkVideoEncodeInfoKHR.PRECEDINGEXTERNALLYENCODEDBYTES, value); }

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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkVideoEncodeInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeInfoKHR.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkVideoEncodeFlagsKHR")
        public int flags() { return VkVideoEncodeInfoKHR.nflags(address()); }
        /** @return the value of the {@code dstBuffer} field. */
        @NativeType("VkBuffer")
        public long dstBuffer() { return VkVideoEncodeInfoKHR.ndstBuffer(address()); }
        /** @return the value of the {@code dstBufferOffset} field. */
        @NativeType("VkDeviceSize")
        public long dstBufferOffset() { return VkVideoEncodeInfoKHR.ndstBufferOffset(address()); }
        /** @return the value of the {@code dstBufferRange} field. */
        @NativeType("VkDeviceSize")
        public long dstBufferRange() { return VkVideoEncodeInfoKHR.ndstBufferRange(address()); }
        /** @return a {@link VkVideoPictureResourceInfoKHR} view of the {@code srcPictureResource} field. */
        public VkVideoPictureResourceInfoKHR srcPictureResource() { return VkVideoEncodeInfoKHR.nsrcPictureResource(address()); }
        /** @return a {@link VkVideoReferenceSlotInfoKHR} view of the struct pointed to by the {@code pSetupReferenceSlot} field. */
        @NativeType("VkVideoReferenceSlotInfoKHR const *")
        public @Nullable VkVideoReferenceSlotInfoKHR pSetupReferenceSlot() { return VkVideoEncodeInfoKHR.npSetupReferenceSlot(address()); }
        /** @return the value of the {@code referenceSlotCount} field. */
        @NativeType("uint32_t")
        public int referenceSlotCount() { return VkVideoEncodeInfoKHR.nreferenceSlotCount(address()); }
        /** @return a {@link VkVideoReferenceSlotInfoKHR.Buffer} view of the struct array pointed to by the {@code pReferenceSlots} field. */
        @NativeType("VkVideoReferenceSlotInfoKHR const *")
        public VkVideoReferenceSlotInfoKHR.@Nullable Buffer pReferenceSlots() { return VkVideoEncodeInfoKHR.npReferenceSlots(address()); }
        /** @return the value of the {@code precedingExternallyEncodedBytes} field. */
        @NativeType("uint32_t")
        public int precedingExternallyEncodedBytes() { return VkVideoEncodeInfoKHR.nprecedingExternallyEncodedBytes(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR} value to the {@code sType} field. */
        public VkVideoEncodeInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoEncodeAV1PictureInfoKHR} value to the {@code pNext} chain. */
        public VkVideoEncodeInfoKHR.Buffer pNext(VkVideoEncodeAV1PictureInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH264PictureInfoKHR} value to the {@code pNext} chain. */
        public VkVideoEncodeInfoKHR.Buffer pNext(VkVideoEncodeH264PictureInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265PictureInfoKHR} value to the {@code pNext} chain. */
        public VkVideoEncodeInfoKHR.Buffer pNext(VkVideoEncodeH265PictureInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeIntraRefreshInfoKHR} value to the {@code pNext} chain. */
        public VkVideoEncodeInfoKHR.Buffer pNext(VkVideoEncodeIntraRefreshInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeQuantizationMapInfoKHR} value to the {@code pNext} chain. */
        public VkVideoEncodeInfoKHR.Buffer pNext(VkVideoEncodeQuantizationMapInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoInlineQueryInfoKHR} value to the {@code pNext} chain. */
        public VkVideoEncodeInfoKHR.Buffer pNext(VkVideoInlineQueryInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkVideoEncodeInfoKHR.Buffer flags(@NativeType("VkVideoEncodeFlagsKHR") int value) { VkVideoEncodeInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code dstBuffer} field. */
        public VkVideoEncodeInfoKHR.Buffer dstBuffer(@NativeType("VkBuffer") long value) { VkVideoEncodeInfoKHR.ndstBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code dstBufferOffset} field. */
        public VkVideoEncodeInfoKHR.Buffer dstBufferOffset(@NativeType("VkDeviceSize") long value) { VkVideoEncodeInfoKHR.ndstBufferOffset(address(), value); return this; }
        /** Sets the specified value to the {@code dstBufferRange} field. */
        public VkVideoEncodeInfoKHR.Buffer dstBufferRange(@NativeType("VkDeviceSize") long value) { VkVideoEncodeInfoKHR.ndstBufferRange(address(), value); return this; }
        /** Copies the specified {@link VkVideoPictureResourceInfoKHR} to the {@code srcPictureResource} field. */
        public VkVideoEncodeInfoKHR.Buffer srcPictureResource(VkVideoPictureResourceInfoKHR value) { VkVideoEncodeInfoKHR.nsrcPictureResource(address(), value); return this; }
        /** Passes the {@code srcPictureResource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkVideoEncodeInfoKHR.Buffer srcPictureResource(java.util.function.Consumer<VkVideoPictureResourceInfoKHR> consumer) { consumer.accept(srcPictureResource()); return this; }
        /** Sets the address of the specified {@link VkVideoReferenceSlotInfoKHR} to the {@code pSetupReferenceSlot} field. */
        public VkVideoEncodeInfoKHR.Buffer pSetupReferenceSlot(@Nullable @NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR value) { VkVideoEncodeInfoKHR.npSetupReferenceSlot(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoReferenceSlotInfoKHR.Buffer} to the {@code pReferenceSlots} field. */
        public VkVideoEncodeInfoKHR.Buffer pReferenceSlots(@NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR.@Nullable Buffer value) { VkVideoEncodeInfoKHR.npReferenceSlots(address(), value); return this; }
        /** Sets the specified value to the {@code precedingExternallyEncodedBytes} field. */
        public VkVideoEncodeInfoKHR.Buffer precedingExternallyEncodedBytes(@NativeType("uint32_t") int value) { VkVideoEncodeInfoKHR.nprecedingExternallyEncodedBytes(address(), value); return this; }

    }

}