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
 * struct VkVideoEncodeH265QualityLevelPropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkVideoEncodeH265RateControlFlagsKHR preferredRateControlFlags;
 *     uint32_t preferredGopFrameCount;
 *     uint32_t preferredIdrPeriod;
 *     uint32_t preferredConsecutiveBFrameCount;
 *     uint32_t preferredSubLayerCount;
 *     {@link VkVideoEncodeH265QpKHR VkVideoEncodeH265QpKHR} preferredConstantQp;
 *     uint32_t preferredMaxL0ReferenceCount;
 *     uint32_t preferredMaxL1ReferenceCount;
 * }}</pre>
 */
public class VkVideoEncodeH265QualityLevelPropertiesKHR extends Struct<VkVideoEncodeH265QualityLevelPropertiesKHR> implements NativeResource {

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
        PREFERREDIDRPERIOD,
        PREFERREDCONSECUTIVEBFRAMECOUNT,
        PREFERREDSUBLAYERCOUNT,
        PREFERREDCONSTANTQP,
        PREFERREDMAXL0REFERENCECOUNT,
        PREFERREDMAXL1REFERENCECOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(VkVideoEncodeH265QpKHR.SIZEOF, VkVideoEncodeH265QpKHR.ALIGNOF),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PREFERREDRATECONTROLFLAGS = layout.offsetof(2);
        PREFERREDGOPFRAMECOUNT = layout.offsetof(3);
        PREFERREDIDRPERIOD = layout.offsetof(4);
        PREFERREDCONSECUTIVEBFRAMECOUNT = layout.offsetof(5);
        PREFERREDSUBLAYERCOUNT = layout.offsetof(6);
        PREFERREDCONSTANTQP = layout.offsetof(7);
        PREFERREDMAXL0REFERENCECOUNT = layout.offsetof(8);
        PREFERREDMAXL1REFERENCECOUNT = layout.offsetof(9);
    }

    protected VkVideoEncodeH265QualityLevelPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265QualityLevelPropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265QualityLevelPropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265QualityLevelPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265QualityLevelPropertiesKHR(ByteBuffer container) {
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
    @NativeType("VkVideoEncodeH265RateControlFlagsKHR")
    public int preferredRateControlFlags() { return npreferredRateControlFlags(address()); }
    /** @return the value of the {@code preferredGopFrameCount} field. */
    @NativeType("uint32_t")
    public int preferredGopFrameCount() { return npreferredGopFrameCount(address()); }
    /** @return the value of the {@code preferredIdrPeriod} field. */
    @NativeType("uint32_t")
    public int preferredIdrPeriod() { return npreferredIdrPeriod(address()); }
    /** @return the value of the {@code preferredConsecutiveBFrameCount} field. */
    @NativeType("uint32_t")
    public int preferredConsecutiveBFrameCount() { return npreferredConsecutiveBFrameCount(address()); }
    /** @return the value of the {@code preferredSubLayerCount} field. */
    @NativeType("uint32_t")
    public int preferredSubLayerCount() { return npreferredSubLayerCount(address()); }
    /** @return a {@link VkVideoEncodeH265QpKHR} view of the {@code preferredConstantQp} field. */
    public VkVideoEncodeH265QpKHR preferredConstantQp() { return npreferredConstantQp(address()); }
    /** @return the value of the {@code preferredMaxL0ReferenceCount} field. */
    @NativeType("uint32_t")
    public int preferredMaxL0ReferenceCount() { return npreferredMaxL0ReferenceCount(address()); }
    /** @return the value of the {@code preferredMaxL1ReferenceCount} field. */
    @NativeType("uint32_t")
    public int preferredMaxL1ReferenceCount() { return npreferredMaxL1ReferenceCount(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeH265QualityLevelPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_QUALITY_LEVEL_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_QUALITY_LEVEL_PROPERTIES_KHR} value to the {@code sType} field. */
    public VkVideoEncodeH265QualityLevelPropertiesKHR sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_QUALITY_LEVEL_PROPERTIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeH265QualityLevelPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265QualityLevelPropertiesKHR set(
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
    public VkVideoEncodeH265QualityLevelPropertiesKHR set(VkVideoEncodeH265QualityLevelPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265QualityLevelPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265QualityLevelPropertiesKHR malloc() {
        return new VkVideoEncodeH265QualityLevelPropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265QualityLevelPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265QualityLevelPropertiesKHR calloc() {
        return new VkVideoEncodeH265QualityLevelPropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265QualityLevelPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265QualityLevelPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265QualityLevelPropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265QualityLevelPropertiesKHR} instance for the specified memory address. */
    public static VkVideoEncodeH265QualityLevelPropertiesKHR create(long address) {
        return new VkVideoEncodeH265QualityLevelPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH265QualityLevelPropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265QualityLevelPropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265QualityLevelPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265QualityLevelPropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265QualityLevelPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265QualityLevelPropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265QualityLevelPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265QualityLevelPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265QualityLevelPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265QualityLevelPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH265QualityLevelPropertiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265QualityLevelPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265QualityLevelPropertiesKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265QualityLevelPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265QualityLevelPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265QualityLevelPropertiesKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265QualityLevelPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265QualityLevelPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265QualityLevelPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265QualityLevelPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265QualityLevelPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeH265QualityLevelPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265QualityLevelPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #preferredRateControlFlags}. */
    public static int npreferredRateControlFlags(long struct) { return memGetInt(struct + VkVideoEncodeH265QualityLevelPropertiesKHR.PREFERREDRATECONTROLFLAGS); }
    /** Unsafe version of {@link #preferredGopFrameCount}. */
    public static int npreferredGopFrameCount(long struct) { return memGetInt(struct + VkVideoEncodeH265QualityLevelPropertiesKHR.PREFERREDGOPFRAMECOUNT); }
    /** Unsafe version of {@link #preferredIdrPeriod}. */
    public static int npreferredIdrPeriod(long struct) { return memGetInt(struct + VkVideoEncodeH265QualityLevelPropertiesKHR.PREFERREDIDRPERIOD); }
    /** Unsafe version of {@link #preferredConsecutiveBFrameCount}. */
    public static int npreferredConsecutiveBFrameCount(long struct) { return memGetInt(struct + VkVideoEncodeH265QualityLevelPropertiesKHR.PREFERREDCONSECUTIVEBFRAMECOUNT); }
    /** Unsafe version of {@link #preferredSubLayerCount}. */
    public static int npreferredSubLayerCount(long struct) { return memGetInt(struct + VkVideoEncodeH265QualityLevelPropertiesKHR.PREFERREDSUBLAYERCOUNT); }
    /** Unsafe version of {@link #preferredConstantQp}. */
    public static VkVideoEncodeH265QpKHR npreferredConstantQp(long struct) { return VkVideoEncodeH265QpKHR.create(struct + VkVideoEncodeH265QualityLevelPropertiesKHR.PREFERREDCONSTANTQP); }
    /** Unsafe version of {@link #preferredMaxL0ReferenceCount}. */
    public static int npreferredMaxL0ReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeH265QualityLevelPropertiesKHR.PREFERREDMAXL0REFERENCECOUNT); }
    /** Unsafe version of {@link #preferredMaxL1ReferenceCount}. */
    public static int npreferredMaxL1ReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeH265QualityLevelPropertiesKHR.PREFERREDMAXL1REFERENCECOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeH265QualityLevelPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265QualityLevelPropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265QualityLevelPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265QualityLevelPropertiesKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265QualityLevelPropertiesKHR ELEMENT_FACTORY = VkVideoEncodeH265QualityLevelPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265QualityLevelPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265QualityLevelPropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH265QualityLevelPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265QualityLevelPropertiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoEncodeH265QualityLevelPropertiesKHR.npNext(address()); }
        /** @return the value of the {@code preferredRateControlFlags} field. */
        @NativeType("VkVideoEncodeH265RateControlFlagsKHR")
        public int preferredRateControlFlags() { return VkVideoEncodeH265QualityLevelPropertiesKHR.npreferredRateControlFlags(address()); }
        /** @return the value of the {@code preferredGopFrameCount} field. */
        @NativeType("uint32_t")
        public int preferredGopFrameCount() { return VkVideoEncodeH265QualityLevelPropertiesKHR.npreferredGopFrameCount(address()); }
        /** @return the value of the {@code preferredIdrPeriod} field. */
        @NativeType("uint32_t")
        public int preferredIdrPeriod() { return VkVideoEncodeH265QualityLevelPropertiesKHR.npreferredIdrPeriod(address()); }
        /** @return the value of the {@code preferredConsecutiveBFrameCount} field. */
        @NativeType("uint32_t")
        public int preferredConsecutiveBFrameCount() { return VkVideoEncodeH265QualityLevelPropertiesKHR.npreferredConsecutiveBFrameCount(address()); }
        /** @return the value of the {@code preferredSubLayerCount} field. */
        @NativeType("uint32_t")
        public int preferredSubLayerCount() { return VkVideoEncodeH265QualityLevelPropertiesKHR.npreferredSubLayerCount(address()); }
        /** @return a {@link VkVideoEncodeH265QpKHR} view of the {@code preferredConstantQp} field. */
        public VkVideoEncodeH265QpKHR preferredConstantQp() { return VkVideoEncodeH265QualityLevelPropertiesKHR.npreferredConstantQp(address()); }
        /** @return the value of the {@code preferredMaxL0ReferenceCount} field. */
        @NativeType("uint32_t")
        public int preferredMaxL0ReferenceCount() { return VkVideoEncodeH265QualityLevelPropertiesKHR.npreferredMaxL0ReferenceCount(address()); }
        /** @return the value of the {@code preferredMaxL1ReferenceCount} field. */
        @NativeType("uint32_t")
        public int preferredMaxL1ReferenceCount() { return VkVideoEncodeH265QualityLevelPropertiesKHR.npreferredMaxL1ReferenceCount(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeH265QualityLevelPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_QUALITY_LEVEL_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_QUALITY_LEVEL_PROPERTIES_KHR} value to the {@code sType} field. */
        public VkVideoEncodeH265QualityLevelPropertiesKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_QUALITY_LEVEL_PROPERTIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeH265QualityLevelPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoEncodeH265QualityLevelPropertiesKHR.npNext(address(), value); return this; }

    }

}