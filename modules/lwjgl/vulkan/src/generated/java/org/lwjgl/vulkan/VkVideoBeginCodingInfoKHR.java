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
 * struct VkVideoBeginCodingInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkVideoBeginCodingFlagsKHR flags;
 *     VkVideoSessionKHR videoSession;
 *     VkVideoSessionParametersKHR videoSessionParameters;
 *     uint32_t referenceSlotCount;
 *     {@link VkVideoReferenceSlotInfoKHR VkVideoReferenceSlotInfoKHR} const * pReferenceSlots;
 * }}</pre>
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkVideoBeginCodingFlagsKHR")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code videoSession} field. */
    @NativeType("VkVideoSessionKHR")
    public long videoSession() { return nvideoSession(address()); }
    /** @return the value of the {@code videoSessionParameters} field. */
    @NativeType("VkVideoSessionParametersKHR")
    public long videoSessionParameters() { return nvideoSessionParameters(address()); }
    /** @return the value of the {@code referenceSlotCount} field. */
    @NativeType("uint32_t")
    public int referenceSlotCount() { return nreferenceSlotCount(address()); }
    /** @return a {@link VkVideoReferenceSlotInfoKHR.Buffer} view of the struct array pointed to by the {@code pReferenceSlots} field. */
    @NativeType("VkVideoReferenceSlotInfoKHR const *")
    public VkVideoReferenceSlotInfoKHR.@Nullable Buffer pReferenceSlots() { return npReferenceSlots(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoBeginCodingInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR} value to the {@code sType} field. */
    public VkVideoBeginCodingInfoKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoBeginCodingInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR} value to the {@code pNext} chain. */
    public VkVideoBeginCodingInfoKHR pNext(VkVideoEncodeAV1GopRemainingFrameInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeAV1RateControlInfoKHR} value to the {@code pNext} chain. */
    public VkVideoBeginCodingInfoKHR pNext(VkVideoEncodeAV1RateControlInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH264GopRemainingFrameInfoKHR} value to the {@code pNext} chain. */
    public VkVideoBeginCodingInfoKHR pNext(VkVideoEncodeH264GopRemainingFrameInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH264RateControlInfoKHR} value to the {@code pNext} chain. */
    public VkVideoBeginCodingInfoKHR pNext(VkVideoEncodeH264RateControlInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265GopRemainingFrameInfoKHR} value to the {@code pNext} chain. */
    public VkVideoBeginCodingInfoKHR pNext(VkVideoEncodeH265GopRemainingFrameInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265RateControlInfoKHR} value to the {@code pNext} chain. */
    public VkVideoBeginCodingInfoKHR pNext(VkVideoEncodeH265RateControlInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeRateControlInfoKHR} value to the {@code pNext} chain. */
    public VkVideoBeginCodingInfoKHR pNext(VkVideoEncodeRateControlInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkVideoBeginCodingInfoKHR flags(@NativeType("VkVideoBeginCodingFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code videoSession} field. */
    public VkVideoBeginCodingInfoKHR videoSession(@NativeType("VkVideoSessionKHR") long value) { nvideoSession(address(), value); return this; }
    /** Sets the specified value to the {@code videoSessionParameters} field. */
    public VkVideoBeginCodingInfoKHR videoSessionParameters(@NativeType("VkVideoSessionParametersKHR") long value) { nvideoSessionParameters(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoReferenceSlotInfoKHR.Buffer} to the {@code pReferenceSlots} field. */
    public VkVideoBeginCodingInfoKHR pReferenceSlots(@NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR.@Nullable Buffer value) { npReferenceSlots(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoBeginCodingInfoKHR set(
        int sType,
        long pNext,
        int flags,
        long videoSession,
        long videoSessionParameters,
        VkVideoReferenceSlotInfoKHR.@Nullable Buffer pReferenceSlots
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
    public static @Nullable VkVideoBeginCodingInfoKHR createSafe(long address) {
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
    public static VkVideoBeginCodingInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
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
    public static int nsType(long struct) { return memGetInt(struct + VkVideoBeginCodingInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoBeginCodingInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkVideoBeginCodingInfoKHR.FLAGS); }
    /** Unsafe version of {@link #videoSession}. */
    public static long nvideoSession(long struct) { return memGetLong(struct + VkVideoBeginCodingInfoKHR.VIDEOSESSION); }
    /** Unsafe version of {@link #videoSessionParameters}. */
    public static long nvideoSessionParameters(long struct) { return memGetLong(struct + VkVideoBeginCodingInfoKHR.VIDEOSESSIONPARAMETERS); }
    /** Unsafe version of {@link #referenceSlotCount}. */
    public static int nreferenceSlotCount(long struct) { return memGetInt(struct + VkVideoBeginCodingInfoKHR.REFERENCESLOTCOUNT); }
    /** Unsafe version of {@link #pReferenceSlots}. */
    public static VkVideoReferenceSlotInfoKHR.@Nullable Buffer npReferenceSlots(long struct) { return VkVideoReferenceSlotInfoKHR.createSafe(memGetAddress(struct + VkVideoBeginCodingInfoKHR.PREFERENCESLOTS), nreferenceSlotCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoBeginCodingInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoBeginCodingInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkVideoBeginCodingInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #videoSession(long) videoSession}. */
    public static void nvideoSession(long struct, long value) { memPutLong(struct + VkVideoBeginCodingInfoKHR.VIDEOSESSION, value); }
    /** Unsafe version of {@link #videoSessionParameters(long) videoSessionParameters}. */
    public static void nvideoSessionParameters(long struct, long value) { memPutLong(struct + VkVideoBeginCodingInfoKHR.VIDEOSESSIONPARAMETERS, value); }
    /** Sets the specified value to the {@code referenceSlotCount} field of the specified {@code struct}. */
    public static void nreferenceSlotCount(long struct, int value) { memPutInt(struct + VkVideoBeginCodingInfoKHR.REFERENCESLOTCOUNT, value); }
    /** Unsafe version of {@link #pReferenceSlots(VkVideoReferenceSlotInfoKHR.Buffer) pReferenceSlots}. */
    public static void npReferenceSlots(long struct, VkVideoReferenceSlotInfoKHR.@Nullable Buffer value) { memPutAddress(struct + VkVideoBeginCodingInfoKHR.PREFERENCESLOTS, memAddressSafe(value)); nreferenceSlotCount(struct, value == null ? 0 : value.remaining()); }

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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkVideoBeginCodingInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoBeginCodingInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoBeginCodingInfoKHR.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkVideoBeginCodingFlagsKHR")
        public int flags() { return VkVideoBeginCodingInfoKHR.nflags(address()); }
        /** @return the value of the {@code videoSession} field. */
        @NativeType("VkVideoSessionKHR")
        public long videoSession() { return VkVideoBeginCodingInfoKHR.nvideoSession(address()); }
        /** @return the value of the {@code videoSessionParameters} field. */
        @NativeType("VkVideoSessionParametersKHR")
        public long videoSessionParameters() { return VkVideoBeginCodingInfoKHR.nvideoSessionParameters(address()); }
        /** @return the value of the {@code referenceSlotCount} field. */
        @NativeType("uint32_t")
        public int referenceSlotCount() { return VkVideoBeginCodingInfoKHR.nreferenceSlotCount(address()); }
        /** @return a {@link VkVideoReferenceSlotInfoKHR.Buffer} view of the struct array pointed to by the {@code pReferenceSlots} field. */
        @NativeType("VkVideoReferenceSlotInfoKHR const *")
        public VkVideoReferenceSlotInfoKHR.@Nullable Buffer pReferenceSlots() { return VkVideoBeginCodingInfoKHR.npReferenceSlots(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoBeginCodingInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoBeginCodingInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR} value to the {@code sType} field. */
        public VkVideoBeginCodingInfoKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoBeginCodingInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoBeginCodingInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR} value to the {@code pNext} chain. */
        public VkVideoBeginCodingInfoKHR.Buffer pNext(VkVideoEncodeAV1GopRemainingFrameInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeAV1RateControlInfoKHR} value to the {@code pNext} chain. */
        public VkVideoBeginCodingInfoKHR.Buffer pNext(VkVideoEncodeAV1RateControlInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH264GopRemainingFrameInfoKHR} value to the {@code pNext} chain. */
        public VkVideoBeginCodingInfoKHR.Buffer pNext(VkVideoEncodeH264GopRemainingFrameInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH264RateControlInfoKHR} value to the {@code pNext} chain. */
        public VkVideoBeginCodingInfoKHR.Buffer pNext(VkVideoEncodeH264RateControlInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265GopRemainingFrameInfoKHR} value to the {@code pNext} chain. */
        public VkVideoBeginCodingInfoKHR.Buffer pNext(VkVideoEncodeH265GopRemainingFrameInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265RateControlInfoKHR} value to the {@code pNext} chain. */
        public VkVideoBeginCodingInfoKHR.Buffer pNext(VkVideoEncodeH265RateControlInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeRateControlInfoKHR} value to the {@code pNext} chain. */
        public VkVideoBeginCodingInfoKHR.Buffer pNext(VkVideoEncodeRateControlInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkVideoBeginCodingInfoKHR.Buffer flags(@NativeType("VkVideoBeginCodingFlagsKHR") int value) { VkVideoBeginCodingInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code videoSession} field. */
        public VkVideoBeginCodingInfoKHR.Buffer videoSession(@NativeType("VkVideoSessionKHR") long value) { VkVideoBeginCodingInfoKHR.nvideoSession(address(), value); return this; }
        /** Sets the specified value to the {@code videoSessionParameters} field. */
        public VkVideoBeginCodingInfoKHR.Buffer videoSessionParameters(@NativeType("VkVideoSessionParametersKHR") long value) { VkVideoBeginCodingInfoKHR.nvideoSessionParameters(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoReferenceSlotInfoKHR.Buffer} to the {@code pReferenceSlots} field. */
        public VkVideoBeginCodingInfoKHR.Buffer pReferenceSlots(@NativeType("VkVideoReferenceSlotInfoKHR const *") VkVideoReferenceSlotInfoKHR.@Nullable Buffer value) { VkVideoBeginCodingInfoKHR.npReferenceSlots(address(), value); return this; }

    }

}