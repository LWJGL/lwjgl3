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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.video.*;

/**
 * Structure specifying H.265 encode capabilities.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265CapabilitiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkVideoEncodeH265CapabilityFlagsEXT {@link #flags};
 *     StdVideoH265LevelIdc {@link #maxLevelIdc};
 *     uint32_t {@link #maxSliceSegmentCount};
 *     {@link VkExtent2D VkExtent2D} {@link #maxTiles};
 *     VkVideoEncodeH265CtbSizeFlagsEXT {@link #ctbSizes};
 *     VkVideoEncodeH265TransformBlockSizeFlagsEXT {@link #transformBlockSizes};
 *     uint32_t {@link #maxPPictureL0ReferenceCount};
 *     uint32_t {@link #maxBPictureL0ReferenceCount};
 *     uint32_t {@link #maxL1ReferenceCount};
 *     uint32_t {@link #maxSubLayerCount};
 *     VkBool32 {@link #expectDyadicTemporalSubLayerPattern};
 *     int32_t {@link #minQp};
 *     int32_t {@link #maxQp};
 *     VkBool32 {@link #prefersGopRemainingFrames};
 *     VkBool32 {@link #requiresGopRemainingFrames};
 *     VkVideoEncodeH265StdFlagsEXT {@link #stdSyntaxFlags};
 * }</code></pre>
 */
public class VkVideoEncodeH265CapabilitiesEXT extends Struct<VkVideoEncodeH265CapabilitiesEXT> implements NativeResource {

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

    protected VkVideoEncodeH265CapabilitiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265CapabilitiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265CapabilitiesEXT(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265CapabilitiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265CapabilitiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkVideoEncodeH265CapabilityFlagBitsEXT} indicating supported H.265 encoding capabilities. */
    @NativeType("VkVideoEncodeH265CapabilityFlagsEXT")
    public int flags() { return nflags(address()); }
    /** a {@code StdVideoH265LevelIdc} value indicating the maximum H.265 level supported. */
    @NativeType("StdVideoH265LevelIdc")
    public int maxLevelIdc() { return nmaxLevelIdc(address()); }
    /** indicates the maximum number of slice segments that <b>can</b> be encoded for a single picture. Further restrictions <b>may</b> apply to the number of slice segments that <b>can</b> be encoded for a single picture depending on other capabilities and codec-specific rules. */
    @NativeType("uint32_t")
    public int maxSliceSegmentCount() { return nmaxSliceSegmentCount(address()); }
    /** indicates the maximum number of H.265 tile columns and rows that <b>can</b> be encoded for a single picture. Further restrictions <b>may</b> apply to the number of H.265 tiles that <b>can</b> be encoded for a single picture depending on other capabilities and codec-specific rules. */
    public VkExtent2D maxTiles() { return nmaxTiles(address()); }
    /** a bitmask of {@code VkVideoEncodeH265CtbSizeFlagBitsEXT} describing the supported CTB sizes. */
    @NativeType("VkVideoEncodeH265CtbSizeFlagsEXT")
    public int ctbSizes() { return nctbSizes(address()); }
    /** a bitmask of {@code VkVideoEncodeH265TransformBlockSizeFlagBitsEXT} describing the supported transform block sizes. */
    @NativeType("VkVideoEncodeH265TransformBlockSizeFlagsEXT")
    public int transformBlockSizes() { return ntransformBlockSizes(address()); }
    /** indicates the maximum number of reference pictures the implementation supports in the reference list L0 for P pictures. */
    @NativeType("uint32_t")
    public int maxPPictureL0ReferenceCount() { return nmaxPPictureL0ReferenceCount(address()); }
    /** indicates the maximum number of reference pictures the implementation supports in the reference list L0 for B pictures. The reported value is 0 if encoding of B pictures is not supported. */
    @NativeType("uint32_t")
    public int maxBPictureL0ReferenceCount() { return nmaxBPictureL0ReferenceCount(address()); }
    /** indicates the maximum number of reference pictures the implementation supports in the reference list L1 if encoding of B pictures is supported. The reported value is 0 if encoding of B pictures is not supported. */
    @NativeType("uint32_t")
    public int maxL1ReferenceCount() { return nmaxL1ReferenceCount(address()); }
    /** indicates the maximum number of H.265 sub-layers supported by the implementation. */
    @NativeType("uint32_t")
    public int maxSubLayerCount() { return nmaxSubLayerCount(address()); }
    /** indicates that the implementation’s rate control algorithms expect the application to use a dyadic temporal sub-layer pattern when encoding multiple temporal sub-layers. */
    @NativeType("VkBool32")
    public boolean expectDyadicTemporalSubLayerPattern() { return nexpectDyadicTemporalSubLayerPattern(address()) != 0; }
    /** indicates the minimum QP value supported. */
    @NativeType("int32_t")
    public int minQp() { return nminQp(address()); }
    /** indicates the maximum QP value supported. */
    @NativeType("int32_t")
    public int maxQp() { return nmaxQp(address()); }
    /** indicates that the implementation’s rate control algorithm prefers the application to specify the number of frames of each type remaining in the current group of pictures. */
    @NativeType("VkBool32")
    public boolean prefersGopRemainingFrames() { return nprefersGopRemainingFrames(address()) != 0; }
    /** indicates that the implementation’s rate control algorithm requires the application to specify the number of frames of each type remaining in the current group of pictures. */
    @NativeType("VkBool32")
    public boolean requiresGopRemainingFrames() { return nrequiresGopRemainingFrames(address()) != 0; }
    /** a bitmask of {@code VkVideoEncodeH265StdFlagBitsEXT} indicating capabilities related to H.265 syntax elements. */
    @NativeType("VkVideoEncodeH265StdFlagsEXT")
    public int stdSyntaxFlags() { return nstdSyntaxFlags(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265CapabilitiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH265CapabilitiesEXT sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265CapabilitiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265CapabilitiesEXT set(
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
    public VkVideoEncodeH265CapabilitiesEXT set(VkVideoEncodeH265CapabilitiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265CapabilitiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265CapabilitiesEXT malloc() {
        return new VkVideoEncodeH265CapabilitiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265CapabilitiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265CapabilitiesEXT calloc() {
        return new VkVideoEncodeH265CapabilitiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265CapabilitiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265CapabilitiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265CapabilitiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265CapabilitiesEXT} instance for the specified memory address. */
    public static VkVideoEncodeH265CapabilitiesEXT create(long address) {
        return new VkVideoEncodeH265CapabilitiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265CapabilitiesEXT createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265CapabilitiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265CapabilitiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265CapabilitiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265CapabilitiesEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH265CapabilitiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265CapabilitiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265CapabilitiesEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH265CapabilitiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265CapabilitiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265CapabilitiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265CapabilitiesEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.FLAGS); }
    /** Unsafe version of {@link #maxLevelIdc}. */
    public static int nmaxLevelIdc(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXLEVELIDC); }
    /** Unsafe version of {@link #maxSliceSegmentCount}. */
    public static int nmaxSliceSegmentCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXSLICESEGMENTCOUNT); }
    /** Unsafe version of {@link #maxTiles}. */
    public static VkExtent2D nmaxTiles(long struct) { return VkExtent2D.create(struct + VkVideoEncodeH265CapabilitiesEXT.MAXTILES); }
    /** Unsafe version of {@link #ctbSizes}. */
    public static int nctbSizes(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.CTBSIZES); }
    /** Unsafe version of {@link #transformBlockSizes}. */
    public static int ntransformBlockSizes(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.TRANSFORMBLOCKSIZES); }
    /** Unsafe version of {@link #maxPPictureL0ReferenceCount}. */
    public static int nmaxPPictureL0ReferenceCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXPPICTUREL0REFERENCECOUNT); }
    /** Unsafe version of {@link #maxBPictureL0ReferenceCount}. */
    public static int nmaxBPictureL0ReferenceCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXBPICTUREL0REFERENCECOUNT); }
    /** Unsafe version of {@link #maxL1ReferenceCount}. */
    public static int nmaxL1ReferenceCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXL1REFERENCECOUNT); }
    /** Unsafe version of {@link #maxSubLayerCount}. */
    public static int nmaxSubLayerCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXSUBLAYERCOUNT); }
    /** Unsafe version of {@link #expectDyadicTemporalSubLayerPattern}. */
    public static int nexpectDyadicTemporalSubLayerPattern(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.EXPECTDYADICTEMPORALSUBLAYERPATTERN); }
    /** Unsafe version of {@link #minQp}. */
    public static int nminQp(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.MINQP); }
    /** Unsafe version of {@link #maxQp}. */
    public static int nmaxQp(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.MAXQP); }
    /** Unsafe version of {@link #prefersGopRemainingFrames}. */
    public static int nprefersGopRemainingFrames(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.PREFERSGOPREMAININGFRAMES); }
    /** Unsafe version of {@link #requiresGopRemainingFrames}. */
    public static int nrequiresGopRemainingFrames(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.REQUIRESGOPREMAININGFRAMES); }
    /** Unsafe version of {@link #stdSyntaxFlags}. */
    public static int nstdSyntaxFlags(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.STDSYNTAXFLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265CapabilitiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265CapabilitiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265CapabilitiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265CapabilitiesEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265CapabilitiesEXT ELEMENT_FACTORY = VkVideoEncodeH265CapabilitiesEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265CapabilitiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265CapabilitiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH265CapabilitiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265CapabilitiesEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoEncodeH265CapabilitiesEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#flags} field. */
        @NativeType("VkVideoEncodeH265CapabilityFlagsEXT")
        public int flags() { return VkVideoEncodeH265CapabilitiesEXT.nflags(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxLevelIdc} field. */
        @NativeType("StdVideoH265LevelIdc")
        public int maxLevelIdc() { return VkVideoEncodeH265CapabilitiesEXT.nmaxLevelIdc(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxSliceSegmentCount} field. */
        @NativeType("uint32_t")
        public int maxSliceSegmentCount() { return VkVideoEncodeH265CapabilitiesEXT.nmaxSliceSegmentCount(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoEncodeH265CapabilitiesEXT#maxTiles} field. */
        public VkExtent2D maxTiles() { return VkVideoEncodeH265CapabilitiesEXT.nmaxTiles(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#ctbSizes} field. */
        @NativeType("VkVideoEncodeH265CtbSizeFlagsEXT")
        public int ctbSizes() { return VkVideoEncodeH265CapabilitiesEXT.nctbSizes(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#transformBlockSizes} field. */
        @NativeType("VkVideoEncodeH265TransformBlockSizeFlagsEXT")
        public int transformBlockSizes() { return VkVideoEncodeH265CapabilitiesEXT.ntransformBlockSizes(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxPPictureL0ReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxPPictureL0ReferenceCount() { return VkVideoEncodeH265CapabilitiesEXT.nmaxPPictureL0ReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxBPictureL0ReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxBPictureL0ReferenceCount() { return VkVideoEncodeH265CapabilitiesEXT.nmaxBPictureL0ReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxL1ReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxL1ReferenceCount() { return VkVideoEncodeH265CapabilitiesEXT.nmaxL1ReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxSubLayerCount} field. */
        @NativeType("uint32_t")
        public int maxSubLayerCount() { return VkVideoEncodeH265CapabilitiesEXT.nmaxSubLayerCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#expectDyadicTemporalSubLayerPattern} field. */
        @NativeType("VkBool32")
        public boolean expectDyadicTemporalSubLayerPattern() { return VkVideoEncodeH265CapabilitiesEXT.nexpectDyadicTemporalSubLayerPattern(address()) != 0; }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#minQp} field. */
        @NativeType("int32_t")
        public int minQp() { return VkVideoEncodeH265CapabilitiesEXT.nminQp(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#maxQp} field. */
        @NativeType("int32_t")
        public int maxQp() { return VkVideoEncodeH265CapabilitiesEXT.nmaxQp(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#prefersGopRemainingFrames} field. */
        @NativeType("VkBool32")
        public boolean prefersGopRemainingFrames() { return VkVideoEncodeH265CapabilitiesEXT.nprefersGopRemainingFrames(address()) != 0; }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#requiresGopRemainingFrames} field. */
        @NativeType("VkBool32")
        public boolean requiresGopRemainingFrames() { return VkVideoEncodeH265CapabilitiesEXT.nrequiresGopRemainingFrames(address()) != 0; }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesEXT#stdSyntaxFlags} field. */
        @NativeType("VkVideoEncodeH265StdFlagsEXT")
        public int stdSyntaxFlags() { return VkVideoEncodeH265CapabilitiesEXT.nstdSyntaxFlags(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#sType} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265CapabilitiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT} value to the {@link VkVideoEncodeH265CapabilitiesEXT#sType} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesEXT#pNext} field. */
        public VkVideoEncodeH265CapabilitiesEXT.Buffer pNext(@NativeType("void *") long value) { VkVideoEncodeH265CapabilitiesEXT.npNext(address(), value); return this; }

    }

}