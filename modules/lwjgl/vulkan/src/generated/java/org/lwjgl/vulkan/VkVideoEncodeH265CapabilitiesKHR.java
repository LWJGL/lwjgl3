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

import org.lwjgl.vulkan.video.*;

/**
 * <pre>{@code
 * struct VkVideoEncodeH265CapabilitiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkVideoEncodeH265CapabilityFlagsKHR flags;
 *     StdVideoH265LevelIdc maxLevelIdc;
 *     uint32_t maxSliceSegmentCount;
 *     {@link VkExtent2D VkExtent2D} maxTiles;
 *     VkVideoEncodeH265CtbSizeFlagsKHR ctbSizes;
 *     VkVideoEncodeH265TransformBlockSizeFlagsKHR transformBlockSizes;
 *     uint32_t maxPPictureL0ReferenceCount;
 *     uint32_t maxBPictureL0ReferenceCount;
 *     uint32_t maxL1ReferenceCount;
 *     uint32_t maxSubLayerCount;
 *     VkBool32 expectDyadicTemporalSubLayerPattern;
 *     int32_t minQp;
 *     int32_t maxQp;
 *     VkBool32 prefersGopRemainingFrames;
 *     VkBool32 requiresGopRemainingFrames;
 *     VkVideoEncodeH265StdFlagsKHR stdSyntaxFlags;
 * }}</pre>
 */
public class VkVideoEncodeH265CapabilitiesKHR extends Struct<VkVideoEncodeH265CapabilitiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        MAXLEVELIDC,
        MAXSLICESEGMENTCOUNT,
        MAXTILES,
        CTBSIZES,
        TRANSFORMBLOCKSIZES,
        MAXPPICTUREL0REFERENCECOUNT,
        MAXBPICTUREL0REFERENCECOUNT,
        MAXL1REFERENCECOUNT,
        MAXSUBLAYERCOUNT,
        EXPECTDYADICTEMPORALSUBLAYERPATTERN,
        MINQP,
        MAXQP,
        PREFERSGOPREMAININGFRAMES,
        REQUIRESGOPREMAININGFRAMES,
        STDSYNTAXFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
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
        FLAGS = layout.offsetof(2);
        MAXLEVELIDC = layout.offsetof(3);
        MAXSLICESEGMENTCOUNT = layout.offsetof(4);
        MAXTILES = layout.offsetof(5);
        CTBSIZES = layout.offsetof(6);
        TRANSFORMBLOCKSIZES = layout.offsetof(7);
        MAXPPICTUREL0REFERENCECOUNT = layout.offsetof(8);
        MAXBPICTUREL0REFERENCECOUNT = layout.offsetof(9);
        MAXL1REFERENCECOUNT = layout.offsetof(10);
        MAXSUBLAYERCOUNT = layout.offsetof(11);
        EXPECTDYADICTEMPORALSUBLAYERPATTERN = layout.offsetof(12);
        MINQP = layout.offsetof(13);
        MAXQP = layout.offsetof(14);
        PREFERSGOPREMAININGFRAMES = layout.offsetof(15);
        REQUIRESGOPREMAININGFRAMES = layout.offsetof(16);
        STDSYNTAXFLAGS = layout.offsetof(17);
    }

    protected VkVideoEncodeH265CapabilitiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265CapabilitiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265CapabilitiesKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265CapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265CapabilitiesKHR(ByteBuffer container) {
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
    @NativeType("VkVideoEncodeH265CapabilityFlagsKHR")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code maxLevelIdc} field. */
    @NativeType("StdVideoH265LevelIdc")
    public int maxLevelIdc() { return nmaxLevelIdc(address()); }
    /** @return the value of the {@code maxSliceSegmentCount} field. */
    @NativeType("uint32_t")
    public int maxSliceSegmentCount() { return nmaxSliceSegmentCount(address()); }
    /** @return a {@link VkExtent2D} view of the {@code maxTiles} field. */
    public VkExtent2D maxTiles() { return nmaxTiles(address()); }
    /** @return the value of the {@code ctbSizes} field. */
    @NativeType("VkVideoEncodeH265CtbSizeFlagsKHR")
    public int ctbSizes() { return nctbSizes(address()); }
    /** @return the value of the {@code transformBlockSizes} field. */
    @NativeType("VkVideoEncodeH265TransformBlockSizeFlagsKHR")
    public int transformBlockSizes() { return ntransformBlockSizes(address()); }
    /** @return the value of the {@code maxPPictureL0ReferenceCount} field. */
    @NativeType("uint32_t")
    public int maxPPictureL0ReferenceCount() { return nmaxPPictureL0ReferenceCount(address()); }
    /** @return the value of the {@code maxBPictureL0ReferenceCount} field. */
    @NativeType("uint32_t")
    public int maxBPictureL0ReferenceCount() { return nmaxBPictureL0ReferenceCount(address()); }
    /** @return the value of the {@code maxL1ReferenceCount} field. */
    @NativeType("uint32_t")
    public int maxL1ReferenceCount() { return nmaxL1ReferenceCount(address()); }
    /** @return the value of the {@code maxSubLayerCount} field. */
    @NativeType("uint32_t")
    public int maxSubLayerCount() { return nmaxSubLayerCount(address()); }
    /** @return the value of the {@code expectDyadicTemporalSubLayerPattern} field. */
    @NativeType("VkBool32")
    public boolean expectDyadicTemporalSubLayerPattern() { return nexpectDyadicTemporalSubLayerPattern(address()) != 0; }
    /** @return the value of the {@code minQp} field. */
    @NativeType("int32_t")
    public int minQp() { return nminQp(address()); }
    /** @return the value of the {@code maxQp} field. */
    @NativeType("int32_t")
    public int maxQp() { return nmaxQp(address()); }
    /** @return the value of the {@code prefersGopRemainingFrames} field. */
    @NativeType("VkBool32")
    public boolean prefersGopRemainingFrames() { return nprefersGopRemainingFrames(address()) != 0; }
    /** @return the value of the {@code requiresGopRemainingFrames} field. */
    @NativeType("VkBool32")
    public boolean requiresGopRemainingFrames() { return nrequiresGopRemainingFrames(address()) != 0; }
    /** @return the value of the {@code stdSyntaxFlags} field. */
    @NativeType("VkVideoEncodeH265StdFlagsKHR")
    public int stdSyntaxFlags() { return nstdSyntaxFlags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeH265CapabilitiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_KHR} value to the {@code sType} field. */
    public VkVideoEncodeH265CapabilitiesKHR sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeH265CapabilitiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265CapabilitiesKHR set(
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
    public VkVideoEncodeH265CapabilitiesKHR set(VkVideoEncodeH265CapabilitiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265CapabilitiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265CapabilitiesKHR malloc() {
        return new VkVideoEncodeH265CapabilitiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265CapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265CapabilitiesKHR calloc() {
        return new VkVideoEncodeH265CapabilitiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265CapabilitiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265CapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265CapabilitiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265CapabilitiesKHR} instance for the specified memory address. */
    public static VkVideoEncodeH265CapabilitiesKHR create(long address) {
        return new VkVideoEncodeH265CapabilitiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH265CapabilitiesKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265CapabilitiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265CapabilitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH265CapabilitiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265CapabilitiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265CapabilitiesKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265CapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265CapabilitiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265CapabilitiesKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265CapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeH265CapabilitiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265CapabilitiesKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkVideoEncodeH265CapabilitiesKHR.FLAGS); }
    /** Unsafe version of {@link #maxLevelIdc}. */
    public static int nmaxLevelIdc(long struct) { return memGetInt(struct + VkVideoEncodeH265CapabilitiesKHR.MAXLEVELIDC); }
    /** Unsafe version of {@link #maxSliceSegmentCount}. */
    public static int nmaxSliceSegmentCount(long struct) { return memGetInt(struct + VkVideoEncodeH265CapabilitiesKHR.MAXSLICESEGMENTCOUNT); }
    /** Unsafe version of {@link #maxTiles}. */
    public static VkExtent2D nmaxTiles(long struct) { return VkExtent2D.create(struct + VkVideoEncodeH265CapabilitiesKHR.MAXTILES); }
    /** Unsafe version of {@link #ctbSizes}. */
    public static int nctbSizes(long struct) { return memGetInt(struct + VkVideoEncodeH265CapabilitiesKHR.CTBSIZES); }
    /** Unsafe version of {@link #transformBlockSizes}. */
    public static int ntransformBlockSizes(long struct) { return memGetInt(struct + VkVideoEncodeH265CapabilitiesKHR.TRANSFORMBLOCKSIZES); }
    /** Unsafe version of {@link #maxPPictureL0ReferenceCount}. */
    public static int nmaxPPictureL0ReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeH265CapabilitiesKHR.MAXPPICTUREL0REFERENCECOUNT); }
    /** Unsafe version of {@link #maxBPictureL0ReferenceCount}. */
    public static int nmaxBPictureL0ReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeH265CapabilitiesKHR.MAXBPICTUREL0REFERENCECOUNT); }
    /** Unsafe version of {@link #maxL1ReferenceCount}. */
    public static int nmaxL1ReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeH265CapabilitiesKHR.MAXL1REFERENCECOUNT); }
    /** Unsafe version of {@link #maxSubLayerCount}. */
    public static int nmaxSubLayerCount(long struct) { return memGetInt(struct + VkVideoEncodeH265CapabilitiesKHR.MAXSUBLAYERCOUNT); }
    /** Unsafe version of {@link #expectDyadicTemporalSubLayerPattern}. */
    public static int nexpectDyadicTemporalSubLayerPattern(long struct) { return memGetInt(struct + VkVideoEncodeH265CapabilitiesKHR.EXPECTDYADICTEMPORALSUBLAYERPATTERN); }
    /** Unsafe version of {@link #minQp}. */
    public static int nminQp(long struct) { return memGetInt(struct + VkVideoEncodeH265CapabilitiesKHR.MINQP); }
    /** Unsafe version of {@link #maxQp}. */
    public static int nmaxQp(long struct) { return memGetInt(struct + VkVideoEncodeH265CapabilitiesKHR.MAXQP); }
    /** Unsafe version of {@link #prefersGopRemainingFrames}. */
    public static int nprefersGopRemainingFrames(long struct) { return memGetInt(struct + VkVideoEncodeH265CapabilitiesKHR.PREFERSGOPREMAININGFRAMES); }
    /** Unsafe version of {@link #requiresGopRemainingFrames}. */
    public static int nrequiresGopRemainingFrames(long struct) { return memGetInt(struct + VkVideoEncodeH265CapabilitiesKHR.REQUIRESGOPREMAININGFRAMES); }
    /** Unsafe version of {@link #stdSyntaxFlags}. */
    public static int nstdSyntaxFlags(long struct) { return memGetInt(struct + VkVideoEncodeH265CapabilitiesKHR.STDSYNTAXFLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeH265CapabilitiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265CapabilitiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265CapabilitiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265CapabilitiesKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265CapabilitiesKHR ELEMENT_FACTORY = VkVideoEncodeH265CapabilitiesKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265CapabilitiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265CapabilitiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH265CapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265CapabilitiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoEncodeH265CapabilitiesKHR.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkVideoEncodeH265CapabilityFlagsKHR")
        public int flags() { return VkVideoEncodeH265CapabilitiesKHR.nflags(address()); }
        /** @return the value of the {@code maxLevelIdc} field. */
        @NativeType("StdVideoH265LevelIdc")
        public int maxLevelIdc() { return VkVideoEncodeH265CapabilitiesKHR.nmaxLevelIdc(address()); }
        /** @return the value of the {@code maxSliceSegmentCount} field. */
        @NativeType("uint32_t")
        public int maxSliceSegmentCount() { return VkVideoEncodeH265CapabilitiesKHR.nmaxSliceSegmentCount(address()); }
        /** @return a {@link VkExtent2D} view of the {@code maxTiles} field. */
        public VkExtent2D maxTiles() { return VkVideoEncodeH265CapabilitiesKHR.nmaxTiles(address()); }
        /** @return the value of the {@code ctbSizes} field. */
        @NativeType("VkVideoEncodeH265CtbSizeFlagsKHR")
        public int ctbSizes() { return VkVideoEncodeH265CapabilitiesKHR.nctbSizes(address()); }
        /** @return the value of the {@code transformBlockSizes} field. */
        @NativeType("VkVideoEncodeH265TransformBlockSizeFlagsKHR")
        public int transformBlockSizes() { return VkVideoEncodeH265CapabilitiesKHR.ntransformBlockSizes(address()); }
        /** @return the value of the {@code maxPPictureL0ReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxPPictureL0ReferenceCount() { return VkVideoEncodeH265CapabilitiesKHR.nmaxPPictureL0ReferenceCount(address()); }
        /** @return the value of the {@code maxBPictureL0ReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxBPictureL0ReferenceCount() { return VkVideoEncodeH265CapabilitiesKHR.nmaxBPictureL0ReferenceCount(address()); }
        /** @return the value of the {@code maxL1ReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxL1ReferenceCount() { return VkVideoEncodeH265CapabilitiesKHR.nmaxL1ReferenceCount(address()); }
        /** @return the value of the {@code maxSubLayerCount} field. */
        @NativeType("uint32_t")
        public int maxSubLayerCount() { return VkVideoEncodeH265CapabilitiesKHR.nmaxSubLayerCount(address()); }
        /** @return the value of the {@code expectDyadicTemporalSubLayerPattern} field. */
        @NativeType("VkBool32")
        public boolean expectDyadicTemporalSubLayerPattern() { return VkVideoEncodeH265CapabilitiesKHR.nexpectDyadicTemporalSubLayerPattern(address()) != 0; }
        /** @return the value of the {@code minQp} field. */
        @NativeType("int32_t")
        public int minQp() { return VkVideoEncodeH265CapabilitiesKHR.nminQp(address()); }
        /** @return the value of the {@code maxQp} field. */
        @NativeType("int32_t")
        public int maxQp() { return VkVideoEncodeH265CapabilitiesKHR.nmaxQp(address()); }
        /** @return the value of the {@code prefersGopRemainingFrames} field. */
        @NativeType("VkBool32")
        public boolean prefersGopRemainingFrames() { return VkVideoEncodeH265CapabilitiesKHR.nprefersGopRemainingFrames(address()) != 0; }
        /** @return the value of the {@code requiresGopRemainingFrames} field. */
        @NativeType("VkBool32")
        public boolean requiresGopRemainingFrames() { return VkVideoEncodeH265CapabilitiesKHR.nrequiresGopRemainingFrames(address()) != 0; }
        /** @return the value of the {@code stdSyntaxFlags} field. */
        @NativeType("VkVideoEncodeH265StdFlagsKHR")
        public int stdSyntaxFlags() { return VkVideoEncodeH265CapabilitiesKHR.nstdSyntaxFlags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeH265CapabilitiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265CapabilitiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_KHR} value to the {@code sType} field. */
        public VkVideoEncodeH265CapabilitiesKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeH265CapabilitiesKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoEncodeH265CapabilitiesKHR.npNext(address(), value); return this; }

    }

}