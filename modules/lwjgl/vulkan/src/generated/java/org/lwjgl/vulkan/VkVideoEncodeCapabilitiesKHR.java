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
 * struct VkVideoEncodeCapabilitiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkVideoEncodeCapabilityFlagsKHR flags;
 *     VkVideoEncodeRateControlModeFlagsKHR rateControlModes;
 *     uint32_t maxRateControlLayers;
 *     uint64_t maxBitrate;
 *     uint32_t maxQualityLevels;
 *     {@link VkExtent2D VkExtent2D} encodeInputPictureGranularity;
 *     VkVideoEncodeFeedbackFlagsKHR supportedEncodeFeedbackFlags;
 * }}</pre>
 */
public class VkVideoEncodeCapabilitiesKHR extends Struct<VkVideoEncodeCapabilitiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        RATECONTROLMODES,
        MAXRATECONTROLLAYERS,
        MAXBITRATE,
        MAXQUALITYLEVELS,
        ENCODEINPUTPICTUREGRANULARITY,
        SUPPORTEDENCODEFEEDBACKFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        RATECONTROLMODES = layout.offsetof(3);
        MAXRATECONTROLLAYERS = layout.offsetof(4);
        MAXBITRATE = layout.offsetof(5);
        MAXQUALITYLEVELS = layout.offsetof(6);
        ENCODEINPUTPICTUREGRANULARITY = layout.offsetof(7);
        SUPPORTEDENCODEFEEDBACKFLAGS = layout.offsetof(8);
    }

    protected VkVideoEncodeCapabilitiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeCapabilitiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeCapabilitiesKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeCapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeCapabilitiesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkVideoEncodeCapabilityFlagsKHR")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code rateControlModes} field. */
    @NativeType("VkVideoEncodeRateControlModeFlagsKHR")
    public int rateControlModes() { return nrateControlModes(address()); }
    /** @return the value of the {@code maxRateControlLayers} field. */
    @NativeType("uint32_t")
    public int maxRateControlLayers() { return nmaxRateControlLayers(address()); }
    /** @return the value of the {@code maxBitrate} field. */
    @NativeType("uint64_t")
    public long maxBitrate() { return nmaxBitrate(address()); }
    /** @return the value of the {@code maxQualityLevels} field. */
    @NativeType("uint32_t")
    public int maxQualityLevels() { return nmaxQualityLevels(address()); }
    /** @return a {@link VkExtent2D} view of the {@code encodeInputPictureGranularity} field. */
    public VkExtent2D encodeInputPictureGranularity() { return nencodeInputPictureGranularity(address()); }
    /** @return the value of the {@code supportedEncodeFeedbackFlags} field. */
    @NativeType("VkVideoEncodeFeedbackFlagsKHR")
    public int supportedEncodeFeedbackFlags() { return nsupportedEncodeFeedbackFlags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeCapabilitiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR} value to the {@code sType} field. */
    public VkVideoEncodeCapabilitiesKHR sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeCapabilitiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeCapabilitiesKHR set(
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
    public VkVideoEncodeCapabilitiesKHR set(VkVideoEncodeCapabilitiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeCapabilitiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeCapabilitiesKHR malloc() {
        return new VkVideoEncodeCapabilitiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeCapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeCapabilitiesKHR calloc() {
        return new VkVideoEncodeCapabilitiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeCapabilitiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeCapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeCapabilitiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeCapabilitiesKHR} instance for the specified memory address. */
    public static VkVideoEncodeCapabilitiesKHR create(long address) {
        return new VkVideoEncodeCapabilitiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeCapabilitiesKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeCapabilitiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeCapabilitiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeCapabilitiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeCapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeCapabilitiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeCapabilitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeCapabilitiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeCapabilitiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeCapabilitiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeCapabilitiesKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeCapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeCapabilitiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeCapabilitiesKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeCapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeCapabilitiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeCapabilitiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeCapabilitiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeCapabilitiesKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkVideoEncodeCapabilitiesKHR.FLAGS); }
    /** Unsafe version of {@link #rateControlModes}. */
    public static int nrateControlModes(long struct) { return memGetInt(struct + VkVideoEncodeCapabilitiesKHR.RATECONTROLMODES); }
    /** Unsafe version of {@link #maxRateControlLayers}. */
    public static int nmaxRateControlLayers(long struct) { return memGetInt(struct + VkVideoEncodeCapabilitiesKHR.MAXRATECONTROLLAYERS); }
    /** Unsafe version of {@link #maxBitrate}. */
    public static long nmaxBitrate(long struct) { return memGetLong(struct + VkVideoEncodeCapabilitiesKHR.MAXBITRATE); }
    /** Unsafe version of {@link #maxQualityLevels}. */
    public static int nmaxQualityLevels(long struct) { return memGetInt(struct + VkVideoEncodeCapabilitiesKHR.MAXQUALITYLEVELS); }
    /** Unsafe version of {@link #encodeInputPictureGranularity}. */
    public static VkExtent2D nencodeInputPictureGranularity(long struct) { return VkExtent2D.create(struct + VkVideoEncodeCapabilitiesKHR.ENCODEINPUTPICTUREGRANULARITY); }
    /** Unsafe version of {@link #supportedEncodeFeedbackFlags}. */
    public static int nsupportedEncodeFeedbackFlags(long struct) { return memGetInt(struct + VkVideoEncodeCapabilitiesKHR.SUPPORTEDENCODEFEEDBACKFLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeCapabilitiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeCapabilitiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeCapabilitiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeCapabilitiesKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeCapabilitiesKHR ELEMENT_FACTORY = VkVideoEncodeCapabilitiesKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeCapabilitiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeCapabilitiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeCapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeCapabilitiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoEncodeCapabilitiesKHR.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkVideoEncodeCapabilityFlagsKHR")
        public int flags() { return VkVideoEncodeCapabilitiesKHR.nflags(address()); }
        /** @return the value of the {@code rateControlModes} field. */
        @NativeType("VkVideoEncodeRateControlModeFlagsKHR")
        public int rateControlModes() { return VkVideoEncodeCapabilitiesKHR.nrateControlModes(address()); }
        /** @return the value of the {@code maxRateControlLayers} field. */
        @NativeType("uint32_t")
        public int maxRateControlLayers() { return VkVideoEncodeCapabilitiesKHR.nmaxRateControlLayers(address()); }
        /** @return the value of the {@code maxBitrate} field. */
        @NativeType("uint64_t")
        public long maxBitrate() { return VkVideoEncodeCapabilitiesKHR.nmaxBitrate(address()); }
        /** @return the value of the {@code maxQualityLevels} field. */
        @NativeType("uint32_t")
        public int maxQualityLevels() { return VkVideoEncodeCapabilitiesKHR.nmaxQualityLevels(address()); }
        /** @return a {@link VkExtent2D} view of the {@code encodeInputPictureGranularity} field. */
        public VkExtent2D encodeInputPictureGranularity() { return VkVideoEncodeCapabilitiesKHR.nencodeInputPictureGranularity(address()); }
        /** @return the value of the {@code supportedEncodeFeedbackFlags} field. */
        @NativeType("VkVideoEncodeFeedbackFlagsKHR")
        public int supportedEncodeFeedbackFlags() { return VkVideoEncodeCapabilitiesKHR.nsupportedEncodeFeedbackFlags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeCapabilitiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeCapabilitiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR} value to the {@code sType} field. */
        public VkVideoEncodeCapabilitiesKHR.Buffer sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeCapabilitiesKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoEncodeCapabilitiesKHR.npNext(address(), value); return this; }

    }

}