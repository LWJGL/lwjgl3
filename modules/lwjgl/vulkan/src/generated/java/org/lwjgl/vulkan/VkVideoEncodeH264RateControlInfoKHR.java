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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkVideoEncodeH264RateControlInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkVideoEncodeH264RateControlFlagsKHR flags;
 *     uint32_t gopFrameCount;
 *     uint32_t idrPeriod;
 *     uint32_t consecutiveBFrameCount;
 *     uint32_t temporalLayerCount;
 * }}</pre>
 */
public class VkVideoEncodeH264RateControlInfoKHR extends Struct<VkVideoEncodeH264RateControlInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        GOPFRAMECOUNT,
        IDRPERIOD,
        CONSECUTIVEBFRAMECOUNT,
        TEMPORALLAYERCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        GOPFRAMECOUNT = layout.offsetof(3);
        IDRPERIOD = layout.offsetof(4);
        CONSECUTIVEBFRAMECOUNT = layout.offsetof(5);
        TEMPORALLAYERCOUNT = layout.offsetof(6);
    }

    protected VkVideoEncodeH264RateControlInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH264RateControlInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264RateControlInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH264RateControlInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264RateControlInfoKHR(ByteBuffer container) {
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
    @NativeType("VkVideoEncodeH264RateControlFlagsKHR")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code gopFrameCount} field. */
    @NativeType("uint32_t")
    public int gopFrameCount() { return ngopFrameCount(address()); }
    /** @return the value of the {@code idrPeriod} field. */
    @NativeType("uint32_t")
    public int idrPeriod() { return nidrPeriod(address()); }
    /** @return the value of the {@code consecutiveBFrameCount} field. */
    @NativeType("uint32_t")
    public int consecutiveBFrameCount() { return nconsecutiveBFrameCount(address()); }
    /** @return the value of the {@code temporalLayerCount} field. */
    @NativeType("uint32_t")
    public int temporalLayerCount() { return ntemporalLayerCount(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeH264RateControlInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_INFO_KHR} value to the {@code sType} field. */
    public VkVideoEncodeH264RateControlInfoKHR sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeH264RateControlInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkVideoEncodeH264RateControlInfoKHR flags(@NativeType("VkVideoEncodeH264RateControlFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code gopFrameCount} field. */
    public VkVideoEncodeH264RateControlInfoKHR gopFrameCount(@NativeType("uint32_t") int value) { ngopFrameCount(address(), value); return this; }
    /** Sets the specified value to the {@code idrPeriod} field. */
    public VkVideoEncodeH264RateControlInfoKHR idrPeriod(@NativeType("uint32_t") int value) { nidrPeriod(address(), value); return this; }
    /** Sets the specified value to the {@code consecutiveBFrameCount} field. */
    public VkVideoEncodeH264RateControlInfoKHR consecutiveBFrameCount(@NativeType("uint32_t") int value) { nconsecutiveBFrameCount(address(), value); return this; }
    /** Sets the specified value to the {@code temporalLayerCount} field. */
    public VkVideoEncodeH264RateControlInfoKHR temporalLayerCount(@NativeType("uint32_t") int value) { ntemporalLayerCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264RateControlInfoKHR set(
        int sType,
        long pNext,
        int flags,
        int gopFrameCount,
        int idrPeriod,
        int consecutiveBFrameCount,
        int temporalLayerCount
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        gopFrameCount(gopFrameCount);
        idrPeriod(idrPeriod);
        consecutiveBFrameCount(consecutiveBFrameCount);
        temporalLayerCount(temporalLayerCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH264RateControlInfoKHR set(VkVideoEncodeH264RateControlInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264RateControlInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264RateControlInfoKHR malloc() {
        return new VkVideoEncodeH264RateControlInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264RateControlInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264RateControlInfoKHR calloc() {
        return new VkVideoEncodeH264RateControlInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264RateControlInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264RateControlInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264RateControlInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264RateControlInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeH264RateControlInfoKHR create(long address) {
        return new VkVideoEncodeH264RateControlInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH264RateControlInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH264RateControlInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264RateControlInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264RateControlInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264RateControlInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264RateControlInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264RateControlInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264RateControlInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH264RateControlInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264RateControlInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH264RateControlInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264RateControlInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264RateControlInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH264RateControlInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264RateControlInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264RateControlInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH264RateControlInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264RateControlInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264RateControlInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264RateControlInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264RateControlInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeH264RateControlInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264RateControlInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkVideoEncodeH264RateControlInfoKHR.FLAGS); }
    /** Unsafe version of {@link #gopFrameCount}. */
    public static int ngopFrameCount(long struct) { return memGetInt(struct + VkVideoEncodeH264RateControlInfoKHR.GOPFRAMECOUNT); }
    /** Unsafe version of {@link #idrPeriod}. */
    public static int nidrPeriod(long struct) { return memGetInt(struct + VkVideoEncodeH264RateControlInfoKHR.IDRPERIOD); }
    /** Unsafe version of {@link #consecutiveBFrameCount}. */
    public static int nconsecutiveBFrameCount(long struct) { return memGetInt(struct + VkVideoEncodeH264RateControlInfoKHR.CONSECUTIVEBFRAMECOUNT); }
    /** Unsafe version of {@link #temporalLayerCount}. */
    public static int ntemporalLayerCount(long struct) { return memGetInt(struct + VkVideoEncodeH264RateControlInfoKHR.TEMPORALLAYERCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeH264RateControlInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264RateControlInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkVideoEncodeH264RateControlInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #gopFrameCount(int) gopFrameCount}. */
    public static void ngopFrameCount(long struct, int value) { memPutInt(struct + VkVideoEncodeH264RateControlInfoKHR.GOPFRAMECOUNT, value); }
    /** Unsafe version of {@link #idrPeriod(int) idrPeriod}. */
    public static void nidrPeriod(long struct, int value) { memPutInt(struct + VkVideoEncodeH264RateControlInfoKHR.IDRPERIOD, value); }
    /** Unsafe version of {@link #consecutiveBFrameCount(int) consecutiveBFrameCount}. */
    public static void nconsecutiveBFrameCount(long struct, int value) { memPutInt(struct + VkVideoEncodeH264RateControlInfoKHR.CONSECUTIVEBFRAMECOUNT, value); }
    /** Unsafe version of {@link #temporalLayerCount(int) temporalLayerCount}. */
    public static void ntemporalLayerCount(long struct, int value) { memPutInt(struct + VkVideoEncodeH264RateControlInfoKHR.TEMPORALLAYERCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264RateControlInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264RateControlInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264RateControlInfoKHR ELEMENT_FACTORY = VkVideoEncodeH264RateControlInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264RateControlInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264RateControlInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH264RateControlInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264RateControlInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264RateControlInfoKHR.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkVideoEncodeH264RateControlFlagsKHR")
        public int flags() { return VkVideoEncodeH264RateControlInfoKHR.nflags(address()); }
        /** @return the value of the {@code gopFrameCount} field. */
        @NativeType("uint32_t")
        public int gopFrameCount() { return VkVideoEncodeH264RateControlInfoKHR.ngopFrameCount(address()); }
        /** @return the value of the {@code idrPeriod} field. */
        @NativeType("uint32_t")
        public int idrPeriod() { return VkVideoEncodeH264RateControlInfoKHR.nidrPeriod(address()); }
        /** @return the value of the {@code consecutiveBFrameCount} field. */
        @NativeType("uint32_t")
        public int consecutiveBFrameCount() { return VkVideoEncodeH264RateControlInfoKHR.nconsecutiveBFrameCount(address()); }
        /** @return the value of the {@code temporalLayerCount} field. */
        @NativeType("uint32_t")
        public int temporalLayerCount() { return VkVideoEncodeH264RateControlInfoKHR.ntemporalLayerCount(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeH264RateControlInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264RateControlInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_INFO_KHR} value to the {@code sType} field. */
        public VkVideoEncodeH264RateControlInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeH264RateControlInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264RateControlInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkVideoEncodeH264RateControlInfoKHR.Buffer flags(@NativeType("VkVideoEncodeH264RateControlFlagsKHR") int value) { VkVideoEncodeH264RateControlInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code gopFrameCount} field. */
        public VkVideoEncodeH264RateControlInfoKHR.Buffer gopFrameCount(@NativeType("uint32_t") int value) { VkVideoEncodeH264RateControlInfoKHR.ngopFrameCount(address(), value); return this; }
        /** Sets the specified value to the {@code idrPeriod} field. */
        public VkVideoEncodeH264RateControlInfoKHR.Buffer idrPeriod(@NativeType("uint32_t") int value) { VkVideoEncodeH264RateControlInfoKHR.nidrPeriod(address(), value); return this; }
        /** Sets the specified value to the {@code consecutiveBFrameCount} field. */
        public VkVideoEncodeH264RateControlInfoKHR.Buffer consecutiveBFrameCount(@NativeType("uint32_t") int value) { VkVideoEncodeH264RateControlInfoKHR.nconsecutiveBFrameCount(address(), value); return this; }
        /** Sets the specified value to the {@code temporalLayerCount} field. */
        public VkVideoEncodeH264RateControlInfoKHR.Buffer temporalLayerCount(@NativeType("uint32_t") int value) { VkVideoEncodeH264RateControlInfoKHR.ntemporalLayerCount(address(), value); return this; }

    }

}