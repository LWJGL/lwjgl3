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
 * struct VkVideoEncodeAV1QualityLevelPropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkVideoEncodeAV1RateControlFlagsKHR preferredRateControlFlags;
 *     uint32_t preferredGopFrameCount;
 *     uint32_t preferredKeyFramePeriod;
 *     uint32_t preferredConsecutiveBipredictiveFrameCount;
 *     uint32_t preferredTemporalLayerCount;
 *     {@link VkVideoEncodeAV1QIndexKHR VkVideoEncodeAV1QIndexKHR} preferredConstantQIndex;
 *     uint32_t preferredMaxSingleReferenceCount;
 *     uint32_t preferredSingleReferenceNameMask;
 *     uint32_t preferredMaxUnidirectionalCompoundReferenceCount;
 *     uint32_t preferredMaxUnidirectionalCompoundGroup1ReferenceCount;
 *     uint32_t preferredUnidirectionalCompoundReferenceNameMask;
 *     uint32_t preferredMaxBidirectionalCompoundReferenceCount;
 *     uint32_t preferredMaxBidirectionalCompoundGroup1ReferenceCount;
 *     uint32_t preferredMaxBidirectionalCompoundGroup2ReferenceCount;
 *     uint32_t preferredBidirectionalCompoundReferenceNameMask;
 * }}</pre>
 */
public class VkVideoEncodeAV1QualityLevelPropertiesKHR extends Struct<VkVideoEncodeAV1QualityLevelPropertiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PREFERREDRATECONTROLFLAGS,
        PREFERREDGOPFRAMECOUNT,
        PREFERREDKEYFRAMEPERIOD,
        PREFERREDCONSECUTIVEBIPREDICTIVEFRAMECOUNT,
        PREFERREDTEMPORALLAYERCOUNT,
        PREFERREDCONSTANTQINDEX,
        PREFERREDMAXSINGLEREFERENCECOUNT,
        PREFERREDSINGLEREFERENCENAMEMASK,
        PREFERREDMAXUNIDIRECTIONALCOMPOUNDREFERENCECOUNT,
        PREFERREDMAXUNIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT,
        PREFERREDUNIDIRECTIONALCOMPOUNDREFERENCENAMEMASK,
        PREFERREDMAXBIDIRECTIONALCOMPOUNDREFERENCECOUNT,
        PREFERREDMAXBIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT,
        PREFERREDMAXBIDIRECTIONALCOMPOUNDGROUP2REFERENCECOUNT,
        PREFERREDBIDIRECTIONALCOMPOUNDREFERENCENAMEMASK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(VkVideoEncodeAV1QIndexKHR.SIZEOF, VkVideoEncodeAV1QIndexKHR.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
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
        PREFERREDRATECONTROLFLAGS = layout.offsetof(2);
        PREFERREDGOPFRAMECOUNT = layout.offsetof(3);
        PREFERREDKEYFRAMEPERIOD = layout.offsetof(4);
        PREFERREDCONSECUTIVEBIPREDICTIVEFRAMECOUNT = layout.offsetof(5);
        PREFERREDTEMPORALLAYERCOUNT = layout.offsetof(6);
        PREFERREDCONSTANTQINDEX = layout.offsetof(7);
        PREFERREDMAXSINGLEREFERENCECOUNT = layout.offsetof(8);
        PREFERREDSINGLEREFERENCENAMEMASK = layout.offsetof(9);
        PREFERREDMAXUNIDIRECTIONALCOMPOUNDREFERENCECOUNT = layout.offsetof(10);
        PREFERREDMAXUNIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT = layout.offsetof(11);
        PREFERREDUNIDIRECTIONALCOMPOUNDREFERENCENAMEMASK = layout.offsetof(12);
        PREFERREDMAXBIDIRECTIONALCOMPOUNDREFERENCECOUNT = layout.offsetof(13);
        PREFERREDMAXBIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT = layout.offsetof(14);
        PREFERREDMAXBIDIRECTIONALCOMPOUNDGROUP2REFERENCECOUNT = layout.offsetof(15);
        PREFERREDBIDIRECTIONALCOMPOUNDREFERENCENAMEMASK = layout.offsetof(16);
    }

    protected VkVideoEncodeAV1QualityLevelPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeAV1QualityLevelPropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeAV1QualityLevelPropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeAV1QualityLevelPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeAV1QualityLevelPropertiesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code preferredRateControlFlags} field. */
    @NativeType("VkVideoEncodeAV1RateControlFlagsKHR")
    public int preferredRateControlFlags() { return npreferredRateControlFlags(address()); }
    /** @return the value of the {@code preferredGopFrameCount} field. */
    @NativeType("uint32_t")
    public int preferredGopFrameCount() { return npreferredGopFrameCount(address()); }
    /** @return the value of the {@code preferredKeyFramePeriod} field. */
    @NativeType("uint32_t")
    public int preferredKeyFramePeriod() { return npreferredKeyFramePeriod(address()); }
    /** @return the value of the {@code preferredConsecutiveBipredictiveFrameCount} field. */
    @NativeType("uint32_t")
    public int preferredConsecutiveBipredictiveFrameCount() { return npreferredConsecutiveBipredictiveFrameCount(address()); }
    /** @return the value of the {@code preferredTemporalLayerCount} field. */
    @NativeType("uint32_t")
    public int preferredTemporalLayerCount() { return npreferredTemporalLayerCount(address()); }
    /** @return a {@link VkVideoEncodeAV1QIndexKHR} view of the {@code preferredConstantQIndex} field. */
    public VkVideoEncodeAV1QIndexKHR preferredConstantQIndex() { return npreferredConstantQIndex(address()); }
    /** @return the value of the {@code preferredMaxSingleReferenceCount} field. */
    @NativeType("uint32_t")
    public int preferredMaxSingleReferenceCount() { return npreferredMaxSingleReferenceCount(address()); }
    /** @return the value of the {@code preferredSingleReferenceNameMask} field. */
    @NativeType("uint32_t")
    public int preferredSingleReferenceNameMask() { return npreferredSingleReferenceNameMask(address()); }
    /** @return the value of the {@code preferredMaxUnidirectionalCompoundReferenceCount} field. */
    @NativeType("uint32_t")
    public int preferredMaxUnidirectionalCompoundReferenceCount() { return npreferredMaxUnidirectionalCompoundReferenceCount(address()); }
    /** @return the value of the {@code preferredMaxUnidirectionalCompoundGroup1ReferenceCount} field. */
    @NativeType("uint32_t")
    public int preferredMaxUnidirectionalCompoundGroup1ReferenceCount() { return npreferredMaxUnidirectionalCompoundGroup1ReferenceCount(address()); }
    /** @return the value of the {@code preferredUnidirectionalCompoundReferenceNameMask} field. */
    @NativeType("uint32_t")
    public int preferredUnidirectionalCompoundReferenceNameMask() { return npreferredUnidirectionalCompoundReferenceNameMask(address()); }
    /** @return the value of the {@code preferredMaxBidirectionalCompoundReferenceCount} field. */
    @NativeType("uint32_t")
    public int preferredMaxBidirectionalCompoundReferenceCount() { return npreferredMaxBidirectionalCompoundReferenceCount(address()); }
    /** @return the value of the {@code preferredMaxBidirectionalCompoundGroup1ReferenceCount} field. */
    @NativeType("uint32_t")
    public int preferredMaxBidirectionalCompoundGroup1ReferenceCount() { return npreferredMaxBidirectionalCompoundGroup1ReferenceCount(address()); }
    /** @return the value of the {@code preferredMaxBidirectionalCompoundGroup2ReferenceCount} field. */
    @NativeType("uint32_t")
    public int preferredMaxBidirectionalCompoundGroup2ReferenceCount() { return npreferredMaxBidirectionalCompoundGroup2ReferenceCount(address()); }
    /** @return the value of the {@code preferredBidirectionalCompoundReferenceNameMask} field. */
    @NativeType("uint32_t")
    public int preferredBidirectionalCompoundReferenceNameMask() { return npreferredBidirectionalCompoundReferenceNameMask(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeAV1QualityLevelPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_QUALITY_LEVEL_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_QUALITY_LEVEL_PROPERTIES_KHR} value to the {@code sType} field. */
    public VkVideoEncodeAV1QualityLevelPropertiesKHR sType$Default() { return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_QUALITY_LEVEL_PROPERTIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeAV1QualityLevelPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeAV1QualityLevelPropertiesKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeAV1QualityLevelPropertiesKHR set(VkVideoEncodeAV1QualityLevelPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeAV1QualityLevelPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR malloc() {
        return new VkVideoEncodeAV1QualityLevelPropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1QualityLevelPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR calloc() {
        return new VkVideoEncodeAV1QualityLevelPropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1QualityLevelPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1QualityLevelPropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeAV1QualityLevelPropertiesKHR} instance for the specified memory address. */
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR create(long address) {
        return new VkVideoEncodeAV1QualityLevelPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeAV1QualityLevelPropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeAV1QualityLevelPropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1QualityLevelPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1QualityLevelPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1QualityLevelPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeAV1QualityLevelPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1QualityLevelPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1QualityLevelPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1QualityLevelPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1QualityLevelPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1QualityLevelPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1QualityLevelPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeAV1QualityLevelPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeAV1QualityLevelPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #preferredRateControlFlags}. */
    public static int npreferredRateControlFlags(long struct) { return memGetInt(struct + VkVideoEncodeAV1QualityLevelPropertiesKHR.PREFERREDRATECONTROLFLAGS); }
    /** Unsafe version of {@link #preferredGopFrameCount}. */
    public static int npreferredGopFrameCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1QualityLevelPropertiesKHR.PREFERREDGOPFRAMECOUNT); }
    /** Unsafe version of {@link #preferredKeyFramePeriod}. */
    public static int npreferredKeyFramePeriod(long struct) { return memGetInt(struct + VkVideoEncodeAV1QualityLevelPropertiesKHR.PREFERREDKEYFRAMEPERIOD); }
    /** Unsafe version of {@link #preferredConsecutiveBipredictiveFrameCount}. */
    public static int npreferredConsecutiveBipredictiveFrameCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1QualityLevelPropertiesKHR.PREFERREDCONSECUTIVEBIPREDICTIVEFRAMECOUNT); }
    /** Unsafe version of {@link #preferredTemporalLayerCount}. */
    public static int npreferredTemporalLayerCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1QualityLevelPropertiesKHR.PREFERREDTEMPORALLAYERCOUNT); }
    /** Unsafe version of {@link #preferredConstantQIndex}. */
    public static VkVideoEncodeAV1QIndexKHR npreferredConstantQIndex(long struct) { return VkVideoEncodeAV1QIndexKHR.create(struct + VkVideoEncodeAV1QualityLevelPropertiesKHR.PREFERREDCONSTANTQINDEX); }
    /** Unsafe version of {@link #preferredMaxSingleReferenceCount}. */
    public static int npreferredMaxSingleReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1QualityLevelPropertiesKHR.PREFERREDMAXSINGLEREFERENCECOUNT); }
    /** Unsafe version of {@link #preferredSingleReferenceNameMask}. */
    public static int npreferredSingleReferenceNameMask(long struct) { return memGetInt(struct + VkVideoEncodeAV1QualityLevelPropertiesKHR.PREFERREDSINGLEREFERENCENAMEMASK); }
    /** Unsafe version of {@link #preferredMaxUnidirectionalCompoundReferenceCount}. */
    public static int npreferredMaxUnidirectionalCompoundReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1QualityLevelPropertiesKHR.PREFERREDMAXUNIDIRECTIONALCOMPOUNDREFERENCECOUNT); }
    /** Unsafe version of {@link #preferredMaxUnidirectionalCompoundGroup1ReferenceCount}. */
    public static int npreferredMaxUnidirectionalCompoundGroup1ReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1QualityLevelPropertiesKHR.PREFERREDMAXUNIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT); }
    /** Unsafe version of {@link #preferredUnidirectionalCompoundReferenceNameMask}. */
    public static int npreferredUnidirectionalCompoundReferenceNameMask(long struct) { return memGetInt(struct + VkVideoEncodeAV1QualityLevelPropertiesKHR.PREFERREDUNIDIRECTIONALCOMPOUNDREFERENCENAMEMASK); }
    /** Unsafe version of {@link #preferredMaxBidirectionalCompoundReferenceCount}. */
    public static int npreferredMaxBidirectionalCompoundReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1QualityLevelPropertiesKHR.PREFERREDMAXBIDIRECTIONALCOMPOUNDREFERENCECOUNT); }
    /** Unsafe version of {@link #preferredMaxBidirectionalCompoundGroup1ReferenceCount}. */
    public static int npreferredMaxBidirectionalCompoundGroup1ReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1QualityLevelPropertiesKHR.PREFERREDMAXBIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT); }
    /** Unsafe version of {@link #preferredMaxBidirectionalCompoundGroup2ReferenceCount}. */
    public static int npreferredMaxBidirectionalCompoundGroup2ReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1QualityLevelPropertiesKHR.PREFERREDMAXBIDIRECTIONALCOMPOUNDGROUP2REFERENCECOUNT); }
    /** Unsafe version of {@link #preferredBidirectionalCompoundReferenceNameMask}. */
    public static int npreferredBidirectionalCompoundReferenceNameMask(long struct) { return memGetInt(struct + VkVideoEncodeAV1QualityLevelPropertiesKHR.PREFERREDBIDIRECTIONALCOMPOUNDREFERENCENAMEMASK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1QualityLevelPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeAV1QualityLevelPropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeAV1QualityLevelPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1QualityLevelPropertiesKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeAV1QualityLevelPropertiesKHR ELEMENT_FACTORY = VkVideoEncodeAV1QualityLevelPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeAV1QualityLevelPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeAV1QualityLevelPropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeAV1QualityLevelPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.npNext(address()); }
        /** @return the value of the {@code preferredRateControlFlags} field. */
        @NativeType("VkVideoEncodeAV1RateControlFlagsKHR")
        public int preferredRateControlFlags() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredRateControlFlags(address()); }
        /** @return the value of the {@code preferredGopFrameCount} field. */
        @NativeType("uint32_t")
        public int preferredGopFrameCount() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredGopFrameCount(address()); }
        /** @return the value of the {@code preferredKeyFramePeriod} field. */
        @NativeType("uint32_t")
        public int preferredKeyFramePeriod() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredKeyFramePeriod(address()); }
        /** @return the value of the {@code preferredConsecutiveBipredictiveFrameCount} field. */
        @NativeType("uint32_t")
        public int preferredConsecutiveBipredictiveFrameCount() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredConsecutiveBipredictiveFrameCount(address()); }
        /** @return the value of the {@code preferredTemporalLayerCount} field. */
        @NativeType("uint32_t")
        public int preferredTemporalLayerCount() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredTemporalLayerCount(address()); }
        /** @return a {@link VkVideoEncodeAV1QIndexKHR} view of the {@code preferredConstantQIndex} field. */
        public VkVideoEncodeAV1QIndexKHR preferredConstantQIndex() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredConstantQIndex(address()); }
        /** @return the value of the {@code preferredMaxSingleReferenceCount} field. */
        @NativeType("uint32_t")
        public int preferredMaxSingleReferenceCount() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredMaxSingleReferenceCount(address()); }
        /** @return the value of the {@code preferredSingleReferenceNameMask} field. */
        @NativeType("uint32_t")
        public int preferredSingleReferenceNameMask() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredSingleReferenceNameMask(address()); }
        /** @return the value of the {@code preferredMaxUnidirectionalCompoundReferenceCount} field. */
        @NativeType("uint32_t")
        public int preferredMaxUnidirectionalCompoundReferenceCount() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredMaxUnidirectionalCompoundReferenceCount(address()); }
        /** @return the value of the {@code preferredMaxUnidirectionalCompoundGroup1ReferenceCount} field. */
        @NativeType("uint32_t")
        public int preferredMaxUnidirectionalCompoundGroup1ReferenceCount() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredMaxUnidirectionalCompoundGroup1ReferenceCount(address()); }
        /** @return the value of the {@code preferredUnidirectionalCompoundReferenceNameMask} field. */
        @NativeType("uint32_t")
        public int preferredUnidirectionalCompoundReferenceNameMask() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredUnidirectionalCompoundReferenceNameMask(address()); }
        /** @return the value of the {@code preferredMaxBidirectionalCompoundReferenceCount} field. */
        @NativeType("uint32_t")
        public int preferredMaxBidirectionalCompoundReferenceCount() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredMaxBidirectionalCompoundReferenceCount(address()); }
        /** @return the value of the {@code preferredMaxBidirectionalCompoundGroup1ReferenceCount} field. */
        @NativeType("uint32_t")
        public int preferredMaxBidirectionalCompoundGroup1ReferenceCount() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredMaxBidirectionalCompoundGroup1ReferenceCount(address()); }
        /** @return the value of the {@code preferredMaxBidirectionalCompoundGroup2ReferenceCount} field. */
        @NativeType("uint32_t")
        public int preferredMaxBidirectionalCompoundGroup2ReferenceCount() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredMaxBidirectionalCompoundGroup2ReferenceCount(address()); }
        /** @return the value of the {@code preferredBidirectionalCompoundReferenceNameMask} field. */
        @NativeType("uint32_t")
        public int preferredBidirectionalCompoundReferenceNameMask() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.npreferredBidirectionalCompoundReferenceNameMask(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeAV1QualityLevelPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_QUALITY_LEVEL_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_QUALITY_LEVEL_PROPERTIES_KHR} value to the {@code sType} field. */
        public VkVideoEncodeAV1QualityLevelPropertiesKHR.Buffer sType$Default() { return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_QUALITY_LEVEL_PROPERTIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeAV1QualityLevelPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.npNext(address(), value); return this; }

    }

}