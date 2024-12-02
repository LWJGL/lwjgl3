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
 * Structure describing AV1 encode capabilities.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code singleReferenceNameMask}, {@code unidirectionalCompoundReferenceNameMask}, and {@code bidirectionalCompoundReferenceNameMask} are encoded such that when bit index <code>i</code> is set, it indicates support for the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-reference-names">AV1 reference name</a> <code>STD_VIDEO_AV1_REFERENCE_NAME_LAST_FRAME + i</code>.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>These masks indicate which elements of the {@code referenceNameSlotIndices} member of {@link VkVideoEncodeAV1PictureInfoKHR} are supported to be used by the implementation. It is important to note that both the bits of these masks and the elements of {@code referenceNameSlotIndices} are indexed such that the first value specifies the support bit and DPB slot index, respectively, for the AV1 reference name {@code STD_VIDEO_AV1_REFERENCE_NAME_LAST_FRAME} (i.e. there is no bit or element for {@code STD_VIDEO_AV1_REFERENCE_NAME_INTRA_FRAME}).</p>
 * </div>
 * 
 * <p>{@code codedPictureAlignment} provides information about implementation limitations to encode arbitrary resolutions. In particular, some implementations <b>may</b> not be able to generate bitstreams aligned to the requirements of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a> (8x8). In such cases, the implementation <b>may</b> <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-resolution-override">override the width and height of the bitstream</a>, in order to produce a bitstream compliant to the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>. If such an override occurs, the encoded resolution of the coded picture is enlargened, with the texel values used for the texel coordinates outside of the bounds of the {@code codedExtent} of the encode input picture resource being first governed by the rules regarding the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-input-picture-granularity">encode input picture granularity</a>. Any texel values outside of the region described by the encode input picture granularity are implementation-defined. Implementations <b>should</b> use well-defined values to minimize impact on the produced encoded content.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>This capability does not impose additional application requirements. However, these overrides change the effective resolution of the bitstream and add padding pixels. Applications sensitive to such overrides <b>can</b> use this capability and the corresponding <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-resolution-override">override behavior</a> to compute the cropping needed to reproduce the original input of the encoding and transmit it in a side channel (i.e. by using cropping fields available in a container). Additionally, applications <b>can</b> explicitly consider this alignment in their coded extent, to avoid implementation-defined texel values being included in the encoded content.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_CAPABILITIES_KHR}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeAV1CapabilitiesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkVideoEncodeAV1CapabilityFlagsKHR {@link #flags};
 *     StdVideoAV1Level {@link #maxLevel};
 *     {@link VkExtent2D VkExtent2D} {@link #codedPictureAlignment};
 *     {@link VkExtent2D VkExtent2D} {@link #maxTiles};
 *     {@link VkExtent2D VkExtent2D} {@link #minTileSize};
 *     {@link VkExtent2D VkExtent2D} {@link #maxTileSize};
 *     VkVideoEncodeAV1SuperblockSizeFlagsKHR {@link #superblockSizes};
 *     uint32_t {@link #maxSingleReferenceCount};
 *     uint32_t {@link #singleReferenceNameMask};
 *     uint32_t {@link #maxUnidirectionalCompoundReferenceCount};
 *     uint32_t {@link #maxUnidirectionalCompoundGroup1ReferenceCount};
 *     uint32_t {@link #unidirectionalCompoundReferenceNameMask};
 *     uint32_t {@link #maxBidirectionalCompoundReferenceCount};
 *     uint32_t {@link #maxBidirectionalCompoundGroup1ReferenceCount};
 *     uint32_t {@link #maxBidirectionalCompoundGroup2ReferenceCount};
 *     uint32_t {@link #bidirectionalCompoundReferenceNameMask};
 *     uint32_t {@link #maxTemporalLayerCount};
 *     uint32_t {@link #maxSpatialLayerCount};
 *     uint32_t {@link #maxOperatingPoints};
 *     uint32_t {@link #minQIndex};
 *     uint32_t {@link #maxQIndex};
 *     VkBool32 {@link #prefersGopRemainingFrames};
 *     VkBool32 {@link #requiresGopRemainingFrames};
 *     VkVideoEncodeAV1StdFlagsKHR {@link #stdSyntaxFlags};
 * }</code></pre>
 */
public class VkVideoEncodeAV1CapabilitiesKHR extends Struct<VkVideoEncodeAV1CapabilitiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        MAXLEVEL,
        CODEDPICTUREALIGNMENT,
        MAXTILES,
        MINTILESIZE,
        MAXTILESIZE,
        SUPERBLOCKSIZES,
        MAXSINGLEREFERENCECOUNT,
        SINGLEREFERENCENAMEMASK,
        MAXUNIDIRECTIONALCOMPOUNDREFERENCECOUNT,
        MAXUNIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT,
        UNIDIRECTIONALCOMPOUNDREFERENCENAMEMASK,
        MAXBIDIRECTIONALCOMPOUNDREFERENCECOUNT,
        MAXBIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT,
        MAXBIDIRECTIONALCOMPOUNDGROUP2REFERENCECOUNT,
        BIDIRECTIONALCOMPOUNDREFERENCENAMEMASK,
        MAXTEMPORALLAYERCOUNT,
        MAXSPATIALLAYERCOUNT,
        MAXOPERATINGPOINTS,
        MINQINDEX,
        MAXQINDEX,
        PREFERSGOPREMAININGFRAMES,
        REQUIRESGOPREMAININGFRAMES,
        STDSYNTAXFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
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
        MAXLEVEL = layout.offsetof(3);
        CODEDPICTUREALIGNMENT = layout.offsetof(4);
        MAXTILES = layout.offsetof(5);
        MINTILESIZE = layout.offsetof(6);
        MAXTILESIZE = layout.offsetof(7);
        SUPERBLOCKSIZES = layout.offsetof(8);
        MAXSINGLEREFERENCECOUNT = layout.offsetof(9);
        SINGLEREFERENCENAMEMASK = layout.offsetof(10);
        MAXUNIDIRECTIONALCOMPOUNDREFERENCECOUNT = layout.offsetof(11);
        MAXUNIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT = layout.offsetof(12);
        UNIDIRECTIONALCOMPOUNDREFERENCENAMEMASK = layout.offsetof(13);
        MAXBIDIRECTIONALCOMPOUNDREFERENCECOUNT = layout.offsetof(14);
        MAXBIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT = layout.offsetof(15);
        MAXBIDIRECTIONALCOMPOUNDGROUP2REFERENCECOUNT = layout.offsetof(16);
        BIDIRECTIONALCOMPOUNDREFERENCENAMEMASK = layout.offsetof(17);
        MAXTEMPORALLAYERCOUNT = layout.offsetof(18);
        MAXSPATIALLAYERCOUNT = layout.offsetof(19);
        MAXOPERATINGPOINTS = layout.offsetof(20);
        MINQINDEX = layout.offsetof(21);
        MAXQINDEX = layout.offsetof(22);
        PREFERSGOPREMAININGFRAMES = layout.offsetof(23);
        REQUIRESGOPREMAININGFRAMES = layout.offsetof(24);
        STDSYNTAXFLAGS = layout.offsetof(25);
    }

    protected VkVideoEncodeAV1CapabilitiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeAV1CapabilitiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeAV1CapabilitiesKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeAV1CapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeAV1CapabilitiesKHR(ByteBuffer container) {
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
    /** a bitmask of {@code VkVideoEncodeAV1CapabilityFlagBitsKHR} indicating supported AV1 encoding capabilities. */
    @NativeType("VkVideoEncodeAV1CapabilityFlagsKHR")
    public int flags() { return nflags(address()); }
    /** a {@code StdVideoAV1Level} value indicating the maximum AV1 level supported by the profile, as defined in section A.3 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>. */
    @NativeType("StdVideoAV1Level")
    public int maxLevel() { return nmaxLevel(address()); }
    /** indicates the alignment at which the implementation will code pictures. This capability does not impose any valid usage constraints on the application. However, depending on the {@code codedExtent} of the encode input picture resource, this capability <b>may</b> result in a change of the resolution of the encoded picture, as described in more detail below. */
    public VkExtent2D codedPictureAlignment() { return ncodedPictureAlignment(address()); }
    /** indicates the maximum number of AV1 tile columns and rows the implementation supports. */
    public VkExtent2D maxTiles() { return nmaxTiles(address()); }
    /** indicates the minimum extent of individual AV1 tiles the implementation supports. */
    public VkExtent2D minTileSize() { return nminTileSize(address()); }
    /** indicates the maximum extent of individual AV1 tiles the implementation supports. */
    public VkExtent2D maxTileSize() { return nmaxTileSize(address()); }
    /** a bitmask of {@code VkVideoEncodeAV1SuperblockSizeFlagBitsKHR} values indicating the supported AV1 superblock sizes. */
    @NativeType("VkVideoEncodeAV1SuperblockSizeFlagsKHR")
    public int superblockSizes() { return nsuperblockSizes(address()); }
    /** indicates the maximum number of reference pictures the implementation supports when using <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-prediction-modes">single reference prediction mode</a>. */
    @NativeType("uint32_t")
    public int maxSingleReferenceCount() { return nmaxSingleReferenceCount(address()); }
    /** a bitmask of supported <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-reference-names">AV1 reference names</a> when using <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-prediction-modes">single reference prediction mode</a>. */
    @NativeType("uint32_t")
    public int singleReferenceNameMask() { return nsingleReferenceNameMask(address()); }
    /** indicates the maximum number of reference pictures the implementation supports when using <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-prediction-modes">unidirectional compound prediction mode</a>. */
    @NativeType("uint32_t")
    public int maxUnidirectionalCompoundReferenceCount() { return nmaxUnidirectionalCompoundReferenceCount(address()); }
    /** indicates the maximum number of reference pictures the implementation supports when using <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-prediction-modes">unidirectional compound prediction mode</a> from reference frame group 1, as defined in section 6.10.24 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>. */
    @NativeType("uint32_t")
    public int maxUnidirectionalCompoundGroup1ReferenceCount() { return nmaxUnidirectionalCompoundGroup1ReferenceCount(address()); }
    /** a bitmask of supported <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-reference-names">AV1 reference names</a> when using <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-prediction-modes">unidirectional compound prediction mode</a>. */
    @NativeType("uint32_t")
    public int unidirectionalCompoundReferenceNameMask() { return nunidirectionalCompoundReferenceNameMask(address()); }
    /** indicates the maximum number of reference pictures the implementation supports when using <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-prediction-modes">bidirectional compound prediction mode</a>. */
    @NativeType("uint32_t")
    public int maxBidirectionalCompoundReferenceCount() { return nmaxBidirectionalCompoundReferenceCount(address()); }
    /** indicates the maximum number of reference pictures the implementation supports when using <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-prediction-modes">bidirectional compound prediction mode</a> from reference frame group 1, as defined in section 6.10.24 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>. */
    @NativeType("uint32_t")
    public int maxBidirectionalCompoundGroup1ReferenceCount() { return nmaxBidirectionalCompoundGroup1ReferenceCount(address()); }
    /** indicates the maximum number of reference pictures the implementation supports when using <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-prediction-modes">bidirectional compound prediction mode</a> from reference frame group 2, as defined in section 6.10.24 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>. */
    @NativeType("uint32_t")
    public int maxBidirectionalCompoundGroup2ReferenceCount() { return nmaxBidirectionalCompoundGroup2ReferenceCount(address()); }
    /** a bitmask of supported <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-reference-names">AV1 reference names</a> when using <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-prediction-modes">bidirectional compound prediction mode</a>. */
    @NativeType("uint32_t")
    public int bidirectionalCompoundReferenceNameMask() { return nbidirectionalCompoundReferenceNameMask(address()); }
    /** indicates the maximum number of AV1 temporal layers supported by the implementation. */
    @NativeType("uint32_t")
    public int maxTemporalLayerCount() { return nmaxTemporalLayerCount(address()); }
    /** indicates the maximum number of AV1 spatial layers supported by the implementation. */
    @NativeType("uint32_t")
    public int maxSpatialLayerCount() { return nmaxSpatialLayerCount(address()); }
    /** indicates the maximum number of AV1 operating points supported by the implementation. */
    @NativeType("uint32_t")
    public int maxOperatingPoints() { return nmaxOperatingPoints(address()); }
    /** indicates the minimum quantizer index value supported. */
    @NativeType("uint32_t")
    public int minQIndex() { return nminQIndex(address()); }
    /** indicates the maximum quantizer index value supported. */
    @NativeType("uint32_t")
    public int maxQIndex() { return nmaxQIndex(address()); }
    /** indicates that the implementation’s rate control algorithm prefers the application to specify the number of frames in each <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-rate-control-group">AV1 rate control group</a> <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-gop-remaining-frames">remaining</a> in the current <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-gop">group of pictures</a> when beginning a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#video-coding-scope">video coding scope</a>. */
    @NativeType("VkBool32")
    public boolean prefersGopRemainingFrames() { return nprefersGopRemainingFrames(address()) != 0; }
    /** indicates that the implementation’s rate control algorithm requires the application to specify the number of frames in each <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-rate-control-group">AV1 rate control group</a> <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-gop-remaining-frames">remaining</a> in the current <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-gop">group of pictures</a> when beginning a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#video-coding-scope">video coding scope</a>. */
    @NativeType("VkBool32")
    public boolean requiresGopRemainingFrames() { return nrequiresGopRemainingFrames(address()) != 0; }
    /** a bitmask of {@code VkVideoEncodeAV1StdFlagBitsKHR} indicating capabilities related to AV1 syntax elements. */
    @NativeType("VkVideoEncodeAV1StdFlagsKHR")
    public int stdSyntaxFlags() { return nstdSyntaxFlags(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeAV1CapabilitiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_CAPABILITIES_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeAV1CapabilitiesKHR sType$Default() { return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_CAPABILITIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeAV1CapabilitiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeAV1CapabilitiesKHR set(
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
    public VkVideoEncodeAV1CapabilitiesKHR set(VkVideoEncodeAV1CapabilitiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeAV1CapabilitiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1CapabilitiesKHR malloc() {
        return new VkVideoEncodeAV1CapabilitiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1CapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1CapabilitiesKHR calloc() {
        return new VkVideoEncodeAV1CapabilitiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1CapabilitiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeAV1CapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1CapabilitiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeAV1CapabilitiesKHR} instance for the specified memory address. */
    public static VkVideoEncodeAV1CapabilitiesKHR create(long address) {
        return new VkVideoEncodeAV1CapabilitiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeAV1CapabilitiesKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeAV1CapabilitiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1CapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1CapabilitiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1CapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1CapabilitiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1CapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1CapabilitiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeAV1CapabilitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1CapabilitiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeAV1CapabilitiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1CapabilitiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1CapabilitiesKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1CapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1CapabilitiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1CapabilitiesKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1CapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1CapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1CapabilitiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1CapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1CapabilitiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeAV1CapabilitiesKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.FLAGS); }
    /** Unsafe version of {@link #maxLevel}. */
    public static int nmaxLevel(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXLEVEL); }
    /** Unsafe version of {@link #codedPictureAlignment}. */
    public static VkExtent2D ncodedPictureAlignment(long struct) { return VkExtent2D.create(struct + VkVideoEncodeAV1CapabilitiesKHR.CODEDPICTUREALIGNMENT); }
    /** Unsafe version of {@link #maxTiles}. */
    public static VkExtent2D nmaxTiles(long struct) { return VkExtent2D.create(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXTILES); }
    /** Unsafe version of {@link #minTileSize}. */
    public static VkExtent2D nminTileSize(long struct) { return VkExtent2D.create(struct + VkVideoEncodeAV1CapabilitiesKHR.MINTILESIZE); }
    /** Unsafe version of {@link #maxTileSize}. */
    public static VkExtent2D nmaxTileSize(long struct) { return VkExtent2D.create(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXTILESIZE); }
    /** Unsafe version of {@link #superblockSizes}. */
    public static int nsuperblockSizes(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.SUPERBLOCKSIZES); }
    /** Unsafe version of {@link #maxSingleReferenceCount}. */
    public static int nmaxSingleReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXSINGLEREFERENCECOUNT); }
    /** Unsafe version of {@link #singleReferenceNameMask}. */
    public static int nsingleReferenceNameMask(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.SINGLEREFERENCENAMEMASK); }
    /** Unsafe version of {@link #maxUnidirectionalCompoundReferenceCount}. */
    public static int nmaxUnidirectionalCompoundReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXUNIDIRECTIONALCOMPOUNDREFERENCECOUNT); }
    /** Unsafe version of {@link #maxUnidirectionalCompoundGroup1ReferenceCount}. */
    public static int nmaxUnidirectionalCompoundGroup1ReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXUNIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT); }
    /** Unsafe version of {@link #unidirectionalCompoundReferenceNameMask}. */
    public static int nunidirectionalCompoundReferenceNameMask(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.UNIDIRECTIONALCOMPOUNDREFERENCENAMEMASK); }
    /** Unsafe version of {@link #maxBidirectionalCompoundReferenceCount}. */
    public static int nmaxBidirectionalCompoundReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXBIDIRECTIONALCOMPOUNDREFERENCECOUNT); }
    /** Unsafe version of {@link #maxBidirectionalCompoundGroup1ReferenceCount}. */
    public static int nmaxBidirectionalCompoundGroup1ReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXBIDIRECTIONALCOMPOUNDGROUP1REFERENCECOUNT); }
    /** Unsafe version of {@link #maxBidirectionalCompoundGroup2ReferenceCount}. */
    public static int nmaxBidirectionalCompoundGroup2ReferenceCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXBIDIRECTIONALCOMPOUNDGROUP2REFERENCECOUNT); }
    /** Unsafe version of {@link #bidirectionalCompoundReferenceNameMask}. */
    public static int nbidirectionalCompoundReferenceNameMask(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.BIDIRECTIONALCOMPOUNDREFERENCENAMEMASK); }
    /** Unsafe version of {@link #maxTemporalLayerCount}. */
    public static int nmaxTemporalLayerCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXTEMPORALLAYERCOUNT); }
    /** Unsafe version of {@link #maxSpatialLayerCount}. */
    public static int nmaxSpatialLayerCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXSPATIALLAYERCOUNT); }
    /** Unsafe version of {@link #maxOperatingPoints}. */
    public static int nmaxOperatingPoints(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXOPERATINGPOINTS); }
    /** Unsafe version of {@link #minQIndex}. */
    public static int nminQIndex(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.MINQINDEX); }
    /** Unsafe version of {@link #maxQIndex}. */
    public static int nmaxQIndex(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.MAXQINDEX); }
    /** Unsafe version of {@link #prefersGopRemainingFrames}. */
    public static int nprefersGopRemainingFrames(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.PREFERSGOPREMAININGFRAMES); }
    /** Unsafe version of {@link #requiresGopRemainingFrames}. */
    public static int nrequiresGopRemainingFrames(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.REQUIRESGOPREMAININGFRAMES); }
    /** Unsafe version of {@link #stdSyntaxFlags}. */
    public static int nstdSyntaxFlags(long struct) { return memGetInt(struct + VkVideoEncodeAV1CapabilitiesKHR.STDSYNTAXFLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1CapabilitiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeAV1CapabilitiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeAV1CapabilitiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1CapabilitiesKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeAV1CapabilitiesKHR ELEMENT_FACTORY = VkVideoEncodeAV1CapabilitiesKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeAV1CapabilitiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeAV1CapabilitiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeAV1CapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeAV1CapabilitiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeAV1CapabilitiesKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1CapabilitiesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoEncodeAV1CapabilitiesKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1CapabilitiesKHR#flags} field. */
        @NativeType("VkVideoEncodeAV1CapabilityFlagsKHR")
        public int flags() { return VkVideoEncodeAV1CapabilitiesKHR.nflags(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1CapabilitiesKHR#maxLevel} field. */
        @NativeType("StdVideoAV1Level")
        public int maxLevel() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxLevel(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoEncodeAV1CapabilitiesKHR#codedPictureAlignment} field. */
        public VkExtent2D codedPictureAlignment() { return VkVideoEncodeAV1CapabilitiesKHR.ncodedPictureAlignment(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoEncodeAV1CapabilitiesKHR#maxTiles} field. */
        public VkExtent2D maxTiles() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxTiles(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoEncodeAV1CapabilitiesKHR#minTileSize} field. */
        public VkExtent2D minTileSize() { return VkVideoEncodeAV1CapabilitiesKHR.nminTileSize(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkVideoEncodeAV1CapabilitiesKHR#maxTileSize} field. */
        public VkExtent2D maxTileSize() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxTileSize(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1CapabilitiesKHR#superblockSizes} field. */
        @NativeType("VkVideoEncodeAV1SuperblockSizeFlagsKHR")
        public int superblockSizes() { return VkVideoEncodeAV1CapabilitiesKHR.nsuperblockSizes(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1CapabilitiesKHR#maxSingleReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxSingleReferenceCount() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxSingleReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1CapabilitiesKHR#singleReferenceNameMask} field. */
        @NativeType("uint32_t")
        public int singleReferenceNameMask() { return VkVideoEncodeAV1CapabilitiesKHR.nsingleReferenceNameMask(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1CapabilitiesKHR#maxUnidirectionalCompoundReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxUnidirectionalCompoundReferenceCount() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxUnidirectionalCompoundReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1CapabilitiesKHR#maxUnidirectionalCompoundGroup1ReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxUnidirectionalCompoundGroup1ReferenceCount() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxUnidirectionalCompoundGroup1ReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1CapabilitiesKHR#unidirectionalCompoundReferenceNameMask} field. */
        @NativeType("uint32_t")
        public int unidirectionalCompoundReferenceNameMask() { return VkVideoEncodeAV1CapabilitiesKHR.nunidirectionalCompoundReferenceNameMask(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1CapabilitiesKHR#maxBidirectionalCompoundReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxBidirectionalCompoundReferenceCount() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxBidirectionalCompoundReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1CapabilitiesKHR#maxBidirectionalCompoundGroup1ReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxBidirectionalCompoundGroup1ReferenceCount() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxBidirectionalCompoundGroup1ReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1CapabilitiesKHR#maxBidirectionalCompoundGroup2ReferenceCount} field. */
        @NativeType("uint32_t")
        public int maxBidirectionalCompoundGroup2ReferenceCount() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxBidirectionalCompoundGroup2ReferenceCount(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1CapabilitiesKHR#bidirectionalCompoundReferenceNameMask} field. */
        @NativeType("uint32_t")
        public int bidirectionalCompoundReferenceNameMask() { return VkVideoEncodeAV1CapabilitiesKHR.nbidirectionalCompoundReferenceNameMask(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1CapabilitiesKHR#maxTemporalLayerCount} field. */
        @NativeType("uint32_t")
        public int maxTemporalLayerCount() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxTemporalLayerCount(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1CapabilitiesKHR#maxSpatialLayerCount} field. */
        @NativeType("uint32_t")
        public int maxSpatialLayerCount() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxSpatialLayerCount(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1CapabilitiesKHR#maxOperatingPoints} field. */
        @NativeType("uint32_t")
        public int maxOperatingPoints() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxOperatingPoints(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1CapabilitiesKHR#minQIndex} field. */
        @NativeType("uint32_t")
        public int minQIndex() { return VkVideoEncodeAV1CapabilitiesKHR.nminQIndex(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1CapabilitiesKHR#maxQIndex} field. */
        @NativeType("uint32_t")
        public int maxQIndex() { return VkVideoEncodeAV1CapabilitiesKHR.nmaxQIndex(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1CapabilitiesKHR#prefersGopRemainingFrames} field. */
        @NativeType("VkBool32")
        public boolean prefersGopRemainingFrames() { return VkVideoEncodeAV1CapabilitiesKHR.nprefersGopRemainingFrames(address()) != 0; }
        /** @return the value of the {@link VkVideoEncodeAV1CapabilitiesKHR#requiresGopRemainingFrames} field. */
        @NativeType("VkBool32")
        public boolean requiresGopRemainingFrames() { return VkVideoEncodeAV1CapabilitiesKHR.nrequiresGopRemainingFrames(address()) != 0; }
        /** @return the value of the {@link VkVideoEncodeAV1CapabilitiesKHR#stdSyntaxFlags} field. */
        @NativeType("VkVideoEncodeAV1StdFlagsKHR")
        public int stdSyntaxFlags() { return VkVideoEncodeAV1CapabilitiesKHR.nstdSyntaxFlags(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeAV1CapabilitiesKHR#sType} field. */
        public VkVideoEncodeAV1CapabilitiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeAV1CapabilitiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_CAPABILITIES_KHR} value to the {@link VkVideoEncodeAV1CapabilitiesKHR#sType} field. */
        public VkVideoEncodeAV1CapabilitiesKHR.Buffer sType$Default() { return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_CAPABILITIES_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeAV1CapabilitiesKHR#pNext} field. */
        public VkVideoEncodeAV1CapabilitiesKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoEncodeAV1CapabilitiesKHR.npNext(address(), value); return this; }

    }

}