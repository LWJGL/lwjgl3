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
 * Structure describing H.265 encode capabilities.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_KHR}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265CapabilitiesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkVideoEncodeH265CapabilityFlagsKHR {@link #flags};
 *     StdVideoH265LevelIdc {@link #maxLevelIdc};
 *     uint32_t {@link #maxSliceSegmentCount};
 *     {@link VkExtent2D VkExtent2D} {@link #maxTiles};
 *     VkVideoEncodeH265CtbSizeFlagsKHR {@link #ctbSizes};
 *     VkVideoEncodeH265TransformBlockSizeFlagsKHR {@link #transformBlockSizes};
 *     uint32_t {@link #maxPPictureL0ReferenceCount};
 *     uint32_t {@link #maxBPictureL0ReferenceCount};
 *     uint32_t {@link #maxL1ReferenceCount};
 *     uint32_t {@link #maxSubLayerCount};
 *     VkBool32 {@link #expectDyadicTemporalSubLayerPattern};
 *     int32_t {@link #minQp};
 *     int32_t {@link #maxQp};
 *     VkBool32 {@link #prefersGopRemainingFrames};
 *     VkBool32 {@link #requiresGopRemainingFrames};
 *     VkVideoEncodeH265StdFlagsKHR {@link #stdSyntaxFlags};
 * }</code></pre>
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

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkVideoEncodeH265CapabilityFlagBitsKHR} indicating supported H.265 encoding capabilities. */
    @NativeType("VkVideoEncodeH265CapabilityFlagsKHR")
    public int flags() { return nflags(address()); }
    /** a {@code StdVideoH265LevelIdc} value indicating the maximum H.265 level supported by the profile, where enum constant {@code STD_VIDEO_H265_LEVEL_IDC_&lt;major&gt;_&lt;minor&gt;} identifies H.265 level {@code &lt;major&gt;.&lt;minor&gt;} as defined in section A.4 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>. */
    @NativeType("StdVideoH265LevelIdc")
    public int maxLevelIdc() { return nmaxLevelIdc(address()); }
    /** indicates the maximum number of slice segments that <b>can</b> be encoded for a single picture. Further restrictions <b>may</b> apply to the number of slice segments that <b>can</b> be encoded for a single picture depending on other capabilities and codec-specific rules. */
    @NativeType("uint32_t")
    public int maxSliceSegmentCount() { return nmaxSliceSegmentCount(address()); }
    /** indicates the maximum number of H.265 tile columns and rows, as defined in sections 3.175 and 3.176 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a> that <b>can</b> be encoded for a single picture. Further restrictions <b>may</b> apply to the number of H.265 tiles that <b>can</b> be encoded for a single picture depending on other capabilities and codec-specific rules. */
    public VkExtent2D maxTiles() { return nmaxTiles(address()); }
    /** a bitmask of {@code VkVideoEncodeH265CtbSizeFlagBitsKHR} describing the supported CTB sizes. */
    @NativeType("VkVideoEncodeH265CtbSizeFlagsKHR")
    public int ctbSizes() { return nctbSizes(address()); }
    /** a bitmask of {@code VkVideoEncodeH265TransformBlockSizeFlagBitsKHR} describing the supported transform block sizes. */
    @NativeType("VkVideoEncodeH265TransformBlockSizeFlagsKHR")
    public int transformBlockSizes() { return ntransformBlockSizes(address()); }
    /**
     * indicates the maximum number of reference pictures the implementation supports in the reference list L0 for <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-p-pic">P pictures</a>.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>As implementations <b>may</b> <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-overrides">override</a> the reference lists, {@code maxPPictureL0ReferenceCount} does not limit the number of elements that the application <b>can</b> specify in the L0 reference list for P pictures. However, if {@code maxPPictureL0ReferenceCount} is zero, then the use of P pictures is not allowed. In case of H.265 encoding, pictures <b>can</b> be encoded using only forward prediction even if P pictures are not supported, as the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a> supports <em>generalized P &amp; B frames</em> (also known as low delay B frames) whereas B frames <b>can</b> refer to past frames through both the L0 and L1 reference lists.</p>
     * </div>
     */
    @NativeType("uint32_t")
    public int maxPPictureL0ReferenceCount() { return nmaxPPictureL0ReferenceCount(address()); }
    /** indicates the maximum number of reference pictures the implementation supports in the reference list L0 for <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-b-pic">B pictures</a>. */
    @NativeType("uint32_t")
    public int maxBPictureL0ReferenceCount() { return nmaxBPictureL0ReferenceCount(address()); }
    /**
     * indicates the maximum number of reference pictures the implementation supports in the reference list L1 if encoding of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-b-pic">B pictures</a> is supported.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>As implementations <b>may</b> <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-overrides">override</a> the reference lists, {@code maxBPictureL0ReferenceCount} and {@code maxL1ReferenceCount} does not limit the number of elements that the application <b>can</b> specify in the L0 and L1 reference lists for B pictures. However, if {@code maxBPictureL0ReferenceCount} and {@code maxL1ReferenceCount} are both zero, then the use of B pictures is not allowed.</p>
     * </div>
     */
    @NativeType("uint32_t")
    public int maxL1ReferenceCount() { return nmaxL1ReferenceCount(address()); }
    /** indicates the maximum number of H.265 sub-layers supported by the implementation. */
    @NativeType("uint32_t")
    public int maxSubLayerCount() { return nmaxSubLayerCount(address()); }
    /** indicates that the implementation’s rate control algorithms expect the application to use a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-layer-pattern-dyadic">dyadic temporal sub-layer pattern</a> when encoding multiple temporal sub-layers. */
    @NativeType("VkBool32")
    public boolean expectDyadicTemporalSubLayerPattern() { return nexpectDyadicTemporalSubLayerPattern(address()) != 0; }
    /** indicates the minimum QP value supported. */
    @NativeType("int32_t")
    public int minQp() { return nminQp(address()); }
    /** indicates the maximum QP value supported. */
    @NativeType("int32_t")
    public int maxQp() { return nmaxQp(address()); }
    /** indicates that the implementation’s rate control algorithm prefers the application to specify the number of frames of each type <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-gop-remaining-frames">remaining</a> in the current <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-gop">group of pictures</a> when beginning a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-coding-scope">video coding scope</a>. */
    @NativeType("VkBool32")
    public boolean prefersGopRemainingFrames() { return nprefersGopRemainingFrames(address()) != 0; }
    /** indicates that the implementation’s rate control algorithm requires the application to specify the number of frames of each type <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-gop-remaining-frames">remaining</a> in the current <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-gop">group of pictures</a> when beginning a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-coding-scope">video coding scope</a>. */
    @NativeType("VkBool32")
    public boolean requiresGopRemainingFrames() { return nrequiresGopRemainingFrames(address()) != 0; }
    /** a bitmask of {@code VkVideoEncodeH265StdFlagBitsKHR} indicating capabilities related to H.265 syntax elements. */
    @NativeType("VkVideoEncodeH265StdFlagsKHR")
    public int stdSyntaxFlags() { return nstdSyntaxFlags(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265CapabilitiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeH265CapabilitiesKHR sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
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

        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265CapabilitiesKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoEncodeH265CapabilitiesKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesKHR#flags} field. */
        @NativeType("VkVideoEncodeH265CapabilityFlagsKHR")
        public int flags() { return VkVideoEncodeH265CapabilitiesKHR.nflags(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesKHR#maxLevelIdc} field. */
        @NativeType("StdVideoH265LevelIdc")
        public int maxLevelIdc() { return VkVideoEncodeH265CapabilitiesKHR.nmaxLevelIdc(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesKHR#maxSliceSegmentCount} field. */
        @NativeType("uint32_t")
        public int maxSliceSegmentCount() { return VkVideoEncodeH265CapabilitiesKHR.nmaxSliceSegmentCount(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoEncodeH265CapabilitiesKHR#maxTiles} field. */
        public VkExtent2D maxTiles() { return VkVideoEncodeH265CapabilitiesKHR.nmaxTiles(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesKHR#ctbSizes} field. */
        @NativeType("VkVideoEncodeH265CtbSizeFlagsKHR")
        public int ctbSizes() { return VkVideoEncodeH265CapabilitiesKHR.nctbSizes(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesKHR#transformBlockSizes} field. */
        @NativeType("VkVideoEncodeH265TransformBlockSizeFlagsKHR")
        public int transformBlockSizes() { return VkVideoEncodeH265CapabilitiesKHR.ntransformBlockSizes(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesKHR#maxPPictureL0ReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxPPictureL0ReferenceCount() { return VkVideoEncodeH265CapabilitiesKHR.nmaxPPictureL0ReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesKHR#maxBPictureL0ReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxBPictureL0ReferenceCount() { return VkVideoEncodeH265CapabilitiesKHR.nmaxBPictureL0ReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesKHR#maxL1ReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxL1ReferenceCount() { return VkVideoEncodeH265CapabilitiesKHR.nmaxL1ReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesKHR#maxSubLayerCount} field. */
        @NativeType("uint32_t")
        public int maxSubLayerCount() { return VkVideoEncodeH265CapabilitiesKHR.nmaxSubLayerCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesKHR#expectDyadicTemporalSubLayerPattern} field. */
        @NativeType("VkBool32")
        public boolean expectDyadicTemporalSubLayerPattern() { return VkVideoEncodeH265CapabilitiesKHR.nexpectDyadicTemporalSubLayerPattern(address()) != 0; }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesKHR#minQp} field. */
        @NativeType("int32_t")
        public int minQp() { return VkVideoEncodeH265CapabilitiesKHR.nminQp(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesKHR#maxQp} field. */
        @NativeType("int32_t")
        public int maxQp() { return VkVideoEncodeH265CapabilitiesKHR.nmaxQp(address()); }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesKHR#prefersGopRemainingFrames} field. */
        @NativeType("VkBool32")
        public boolean prefersGopRemainingFrames() { return VkVideoEncodeH265CapabilitiesKHR.nprefersGopRemainingFrames(address()) != 0; }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesKHR#requiresGopRemainingFrames} field. */
        @NativeType("VkBool32")
        public boolean requiresGopRemainingFrames() { return VkVideoEncodeH265CapabilitiesKHR.nrequiresGopRemainingFrames(address()) != 0; }
        /** @return the value of the {@link VkVideoEncodeH265CapabilitiesKHR#stdSyntaxFlags} field. */
        @NativeType("VkVideoEncodeH265StdFlagsKHR")
        public int stdSyntaxFlags() { return VkVideoEncodeH265CapabilitiesKHR.nstdSyntaxFlags(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesKHR#sType} field. */
        public VkVideoEncodeH265CapabilitiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265CapabilitiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_KHR} value to the {@link VkVideoEncodeH265CapabilitiesKHR#sType} field. */
        public VkVideoEncodeH265CapabilitiesKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeH265CapabilitiesKHR#pNext} field. */
        public VkVideoEncodeH265CapabilitiesKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoEncodeH265CapabilitiesKHR.npNext(address(), value); return this; }

    }

}