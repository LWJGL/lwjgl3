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
 * struct VkVideoEncodeRateControlLayerInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint64_t averageBitrate;
 *     uint64_t maxBitrate;
 *     uint32_t frameRateNumerator;
 *     uint32_t frameRateDenominator;
 * }}</pre>
 */
public class VkVideoEncodeRateControlLayerInfoKHR extends Struct<VkVideoEncodeRateControlLayerInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        AVERAGEBITRATE,
        MAXBITRATE,
        FRAMERATENUMERATOR,
        FRAMERATEDENOMINATOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        AVERAGEBITRATE = layout.offsetof(2);
        MAXBITRATE = layout.offsetof(3);
        FRAMERATENUMERATOR = layout.offsetof(4);
        FRAMERATEDENOMINATOR = layout.offsetof(5);
    }

    protected VkVideoEncodeRateControlLayerInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeRateControlLayerInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeRateControlLayerInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeRateControlLayerInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeRateControlLayerInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code averageBitrate} field. */
    @NativeType("uint64_t")
    public long averageBitrate() { return naverageBitrate(address()); }
    /** @return the value of the {@code maxBitrate} field. */
    @NativeType("uint64_t")
    public long maxBitrate() { return nmaxBitrate(address()); }
    /** @return the value of the {@code frameRateNumerator} field. */
    @NativeType("uint32_t")
    public int frameRateNumerator() { return nframeRateNumerator(address()); }
    /** @return the value of the {@code frameRateDenominator} field. */
    @NativeType("uint32_t")
    public int frameRateDenominator() { return nframeRateDenominator(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeRateControlLayerInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR} value to the {@code sType} field. */
    public VkVideoEncodeRateControlLayerInfoKHR sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeRateControlLayerInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoEncodeAV1RateControlLayerInfoKHR} value to the {@code pNext} chain. */
    public VkVideoEncodeRateControlLayerInfoKHR pNext(VkVideoEncodeAV1RateControlLayerInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH264RateControlLayerInfoKHR} value to the {@code pNext} chain. */
    public VkVideoEncodeRateControlLayerInfoKHR pNext(VkVideoEncodeH264RateControlLayerInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265RateControlLayerInfoKHR} value to the {@code pNext} chain. */
    public VkVideoEncodeRateControlLayerInfoKHR pNext(VkVideoEncodeH265RateControlLayerInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code averageBitrate} field. */
    public VkVideoEncodeRateControlLayerInfoKHR averageBitrate(@NativeType("uint64_t") long value) { naverageBitrate(address(), value); return this; }
    /** Sets the specified value to the {@code maxBitrate} field. */
    public VkVideoEncodeRateControlLayerInfoKHR maxBitrate(@NativeType("uint64_t") long value) { nmaxBitrate(address(), value); return this; }
    /** Sets the specified value to the {@code frameRateNumerator} field. */
    public VkVideoEncodeRateControlLayerInfoKHR frameRateNumerator(@NativeType("uint32_t") int value) { nframeRateNumerator(address(), value); return this; }
    /** Sets the specified value to the {@code frameRateDenominator} field. */
    public VkVideoEncodeRateControlLayerInfoKHR frameRateDenominator(@NativeType("uint32_t") int value) { nframeRateDenominator(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeRateControlLayerInfoKHR set(
        int sType,
        long pNext,
        long averageBitrate,
        long maxBitrate,
        int frameRateNumerator,
        int frameRateDenominator
    ) {
        sType(sType);
        pNext(pNext);
        averageBitrate(averageBitrate);
        maxBitrate(maxBitrate);
        frameRateNumerator(frameRateNumerator);
        frameRateDenominator(frameRateDenominator);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeRateControlLayerInfoKHR set(VkVideoEncodeRateControlLayerInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeRateControlLayerInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeRateControlLayerInfoKHR malloc() {
        return new VkVideoEncodeRateControlLayerInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeRateControlLayerInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeRateControlLayerInfoKHR calloc() {
        return new VkVideoEncodeRateControlLayerInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeRateControlLayerInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeRateControlLayerInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeRateControlLayerInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeRateControlLayerInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeRateControlLayerInfoKHR create(long address) {
        return new VkVideoEncodeRateControlLayerInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeRateControlLayerInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeRateControlLayerInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeRateControlLayerInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRateControlLayerInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeRateControlLayerInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRateControlLayerInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeRateControlLayerInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRateControlLayerInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeRateControlLayerInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRateControlLayerInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeRateControlLayerInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeRateControlLayerInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeRateControlLayerInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeRateControlLayerInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeRateControlLayerInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeRateControlLayerInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeRateControlLayerInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeRateControlLayerInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRateControlLayerInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeRateControlLayerInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeRateControlLayerInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeRateControlLayerInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeRateControlLayerInfoKHR.PNEXT); }
    /** Unsafe version of {@link #averageBitrate}. */
    public static long naverageBitrate(long struct) { return memGetLong(struct + VkVideoEncodeRateControlLayerInfoKHR.AVERAGEBITRATE); }
    /** Unsafe version of {@link #maxBitrate}. */
    public static long nmaxBitrate(long struct) { return memGetLong(struct + VkVideoEncodeRateControlLayerInfoKHR.MAXBITRATE); }
    /** Unsafe version of {@link #frameRateNumerator}. */
    public static int nframeRateNumerator(long struct) { return memGetInt(struct + VkVideoEncodeRateControlLayerInfoKHR.FRAMERATENUMERATOR); }
    /** Unsafe version of {@link #frameRateDenominator}. */
    public static int nframeRateDenominator(long struct) { return memGetInt(struct + VkVideoEncodeRateControlLayerInfoKHR.FRAMERATEDENOMINATOR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeRateControlLayerInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeRateControlLayerInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #averageBitrate(long) averageBitrate}. */
    public static void naverageBitrate(long struct, long value) { memPutLong(struct + VkVideoEncodeRateControlLayerInfoKHR.AVERAGEBITRATE, value); }
    /** Unsafe version of {@link #maxBitrate(long) maxBitrate}. */
    public static void nmaxBitrate(long struct, long value) { memPutLong(struct + VkVideoEncodeRateControlLayerInfoKHR.MAXBITRATE, value); }
    /** Unsafe version of {@link #frameRateNumerator(int) frameRateNumerator}. */
    public static void nframeRateNumerator(long struct, int value) { memPutInt(struct + VkVideoEncodeRateControlLayerInfoKHR.FRAMERATENUMERATOR, value); }
    /** Unsafe version of {@link #frameRateDenominator(int) frameRateDenominator}. */
    public static void nframeRateDenominator(long struct, int value) { memPutInt(struct + VkVideoEncodeRateControlLayerInfoKHR.FRAMERATEDENOMINATOR, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeRateControlLayerInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeRateControlLayerInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeRateControlLayerInfoKHR ELEMENT_FACTORY = VkVideoEncodeRateControlLayerInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeRateControlLayerInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeRateControlLayerInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeRateControlLayerInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeRateControlLayerInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeRateControlLayerInfoKHR.npNext(address()); }
        /** @return the value of the {@code averageBitrate} field. */
        @NativeType("uint64_t")
        public long averageBitrate() { return VkVideoEncodeRateControlLayerInfoKHR.naverageBitrate(address()); }
        /** @return the value of the {@code maxBitrate} field. */
        @NativeType("uint64_t")
        public long maxBitrate() { return VkVideoEncodeRateControlLayerInfoKHR.nmaxBitrate(address()); }
        /** @return the value of the {@code frameRateNumerator} field. */
        @NativeType("uint32_t")
        public int frameRateNumerator() { return VkVideoEncodeRateControlLayerInfoKHR.nframeRateNumerator(address()); }
        /** @return the value of the {@code frameRateDenominator} field. */
        @NativeType("uint32_t")
        public int frameRateDenominator() { return VkVideoEncodeRateControlLayerInfoKHR.nframeRateDenominator(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeRateControlLayerInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeRateControlLayerInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR} value to the {@code sType} field. */
        public VkVideoEncodeRateControlLayerInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeRateControlLayerInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeRateControlLayerInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoEncodeAV1RateControlLayerInfoKHR} value to the {@code pNext} chain. */
        public VkVideoEncodeRateControlLayerInfoKHR.Buffer pNext(VkVideoEncodeAV1RateControlLayerInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH264RateControlLayerInfoKHR} value to the {@code pNext} chain. */
        public VkVideoEncodeRateControlLayerInfoKHR.Buffer pNext(VkVideoEncodeH264RateControlLayerInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265RateControlLayerInfoKHR} value to the {@code pNext} chain. */
        public VkVideoEncodeRateControlLayerInfoKHR.Buffer pNext(VkVideoEncodeH265RateControlLayerInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code averageBitrate} field. */
        public VkVideoEncodeRateControlLayerInfoKHR.Buffer averageBitrate(@NativeType("uint64_t") long value) { VkVideoEncodeRateControlLayerInfoKHR.naverageBitrate(address(), value); return this; }
        /** Sets the specified value to the {@code maxBitrate} field. */
        public VkVideoEncodeRateControlLayerInfoKHR.Buffer maxBitrate(@NativeType("uint64_t") long value) { VkVideoEncodeRateControlLayerInfoKHR.nmaxBitrate(address(), value); return this; }
        /** Sets the specified value to the {@code frameRateNumerator} field. */
        public VkVideoEncodeRateControlLayerInfoKHR.Buffer frameRateNumerator(@NativeType("uint32_t") int value) { VkVideoEncodeRateControlLayerInfoKHR.nframeRateNumerator(address(), value); return this; }
        /** Sets the specified value to the {@code frameRateDenominator} field. */
        public VkVideoEncodeRateControlLayerInfoKHR.Buffer frameRateDenominator(@NativeType("uint32_t") int value) { VkVideoEncodeRateControlLayerInfoKHR.nframeRateDenominator(address(), value); return this; }

    }

}