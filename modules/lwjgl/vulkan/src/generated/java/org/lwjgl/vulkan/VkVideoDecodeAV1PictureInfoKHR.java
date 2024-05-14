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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.video.*;

import static org.lwjgl.vulkan.KHRVideoDecodeAV1.*;

/**
 * Structure specifies AV1 picture information when decoding a frame.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure is specified in the {@code pNext} chain of the {@link VkVideoDecodeInfoKHR} structure passed to {@link KHRVideoDecodeQueue#vkCmdDecodeVideoKHR CmdDecodeVideoKHR} to specify the codec-specific picture information for an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-av1">AV1 decode operation</a>.</p>
 * 
 * <dl>
 * <dt>Decode Output Picture Information</dt>
 * <dd><ul>
 * <li>The image subregion used is determined according to the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-av1-picture-data-access">AV1 Decode Picture Data Access</a> section.</li>
 * <li>The decode output picture is associated with the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-av1-picture-info">AV1 picture information</a> provided in {@code pStdPictureInfo}.</li>
 * </ul></dd>
 * </dl>
 * 
 * <dl>
 * <dt>Std Picture Information</dt>
 * <dd><ul>
 * <li>{@code flags.reserved}, {@code reserved1}, and {@code reserved2} are used only for padding purposes and are otherwise ignored;</li>
 * <li>{@code flags.apply_grain} indicates that film grain is enabled for the decoded picture, as defined in section 6.8.20 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>{@code tg_start} and {@code tg_end} are interpreted as defined in section 6.10.1 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>{@code OrderHint}, {@code OrderHints}, and {@code expectedFrameId} are interpreted as defined in section 6.8.2 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>the {@code StdVideoAV1TileInfo} structure pointed to by {@code pTileInfo} is interpreted as follows:
 * 
 * <ul>
 * <li>{@code flags.reserved} and {@code reserved1} are used only for padding purposes and are otherwise ignored;</li>
 * <li>{@code pMiColStarts} is a pointer to an array of {@code TileCols} number of unsigned integers that corresponds to {@code MiColStarts} defined in section 6.8.14 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>{@code pMiRowStarts} is a pointer to an array of {@code TileRows} number of unsigned integers that corresponds to {@code MiRowStarts} defined in section 6.8.14 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>{@code pWidthInSbsMinus1} is a pointer to an array of {@code TileCols} number of unsigned integers that corresponds to {@code width_in_sbs_minus_1} defined in section 6.8.14 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>{@code pHeightInSbsMinus1} is a pointer to an array of {@code TileRows} number of unsigned integers that corresponds to {@code height_in_sbs_minus_1} defined in section 6.8.14 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>all other members of {@code StdVideoAV1TileInfo} are interpreted as defined in section 6.8.14 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * </ul>
 * </li>
 * <li>the {@code StdVideoAV1Quantization} structure pointed to by {@code pQuantization} is interpreted as follows:
 * 
 * <ul>
 * <li>{@code flags.reserved} is used only for padding purposes and is otherwise ignored;</li>
 * <li>all other members of {@code StdVideoAV1Quantization} are interpreted as defined in section 6.8.11 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * </ul>
 * </li>
 * <li>if {@code flags.segmentation_enabled} is set, then the {@code StdVideoAV1Segmentation} structure pointed to by {@code pSegmentation} is interpreted as follows:
 * 
 * <ul>
 * <li>the elements of {@code FeatureEnabled} are bitmasks where bit index <code>j</code> of element <code>i</code> corresponds to {@code FeatureEnabled[i][j]} as defined in section 6.8.13 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>{@code FeatureData} is interpreted as defined in section 6.8.13 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * </ul>
 * </li>
 * <li>the {@code StdVideoAV1LoopFilter} structure pointed to by {@code pLoopFilter} is interpreted as follows:
 * 
 * <ul>
 * <li>{@code flags.reserved} is used only for padding purposes and is otherwise ignored;</li>
 * <li>{@code update_ref_delta} is a bitmask where bit index <code>i</code> is interpreted as the value of {@code update_ref_delta} corresponding to element <code>i</code> of {@code loop_filter_ref_deltas} as defined in section 6.8.10 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>{@code update_mode_delta} is a bitmask where bit index <code>i</code> is interpreted as the value of {@code update_mode_delta} corresponding to element <code>i</code> of {@code loop_filter_mode_deltas} as defined in section 6.8.10 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>all other members of {@code StdVideoAV1LoopFilter} are interpreted as defined in section 6.8.10 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * </ul>
 * </li>
 * <li>if {@code flags.enable_cdef} is set in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-av1-active-sequence-header">active sequence header</a>, then the members of the {@code StdVideoAV1CDEF} structure pointed to by {@code pCDEF} are interpreted as follows:
 * 
 * <ul>
 * <li>{@code cdef_y_sec_strength} and {@code cdef_uv_sec_strength} are the bitstream values of the corresponding syntax elements defined in section 5.9.19 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>all other members of {@code StdVideoAV1CDEF} are interpreted as defined in section 6.10.14 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * </ul>
 * </li>
 * <li>the {@code StdVideoAV1LoopRestoration} structure pointed to by {@code pLoopRestoration} is interpreted as follows:
 * 
 * <ul>
 * <li>{@code LoopRestorationSize}[{@code plane}] is interpreted as <code>log2(size) - 5</code>, where {@code size} is the value of {@code LoopRestorationSize}[{@code plane}] as defined in section 6.10.15 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>.</li>
 * <li>all other members of {@code StdVideoAV1LoopRestoration} are defined as in section 6.10.15 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * </ul>
 * </li>
 * <li>the members of the {@code StdVideoAV1GlobalMotion} structure provided in {@code global_motion} are interpreted as defined in section 7.10 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>if {@code flags.film_grain_params_present} is set in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-av1-active-sequence-header">active sequence header</a>, then the {@code StdVideoAV1FilmGrain} structure pointed to by {@code pFilmGrain} is interpreted as follows:
 * 
 * <ul>
 * <li>{@code flags.reserved} is used only for padding purposes and is otherwise ignored;</li>
 * <li>all other members of {@code StdVideoAV1FilmGrain} are interpreted as defined in section 6.8.20 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * </ul>
 * </li>
 * <li>all other members are interpreted as defined in section 6.8 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>.</li>
 * </ul></dd>
 * </dl>
 * 
 * <p>When <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-av1-film-grain">film grain is enabled</a> for the decoded frame, the {@code flags.update_grain} and {@code film_grain_params_ref_idx} values specified in {@code StdVideoAV1FilmGrain} are ignored by AV1 decode operations and the {@code load_grain_params} function, as defined in section 6.8.20 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>, is not executed. Instead, the application is responsible for specifying the effective film grain parameters for the frame in {@code StdVideoAV1FilmGrain}.</p>
 * 
 * <p>When <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-av1-film-grain">film grain is enabled</a> for the decoded frame, the application is required to specify a different decode output picture resource in {@link VkVideoDecodeInfoKHR}{@code ::dstPictureResource} compared to the reconstructed picture specified in {@link VkVideoDecodeInfoKHR}{@code ::pSetupReferenceSlot→pPictureResource} even if the implementation does not report support for {@link KHRVideoDecodeQueue#VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR} in {@link VkVideoDecodeCapabilitiesKHR}{@code ::flags} for the video decode profile.</p>
 * 
 * <p>Reference picture setup is controlled by the value of {@code StdVideoDecodeAV1PictureInfo}{@code ::refresh_frame_flags}. If it is not zero and a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-reconstructed-picture-info">reconstructed picture</a> is specified, then the latter is used as the target of picture reconstruction to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot-states">activate</a> the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slot</a> specified in {@code pDecodeInfo→pSetupReferenceSlot→slotIndex}. If {@code StdVideoDecodeAV1PictureInfo}{@code ::refresh_frame_flags} is zero, but a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-reconstructed-picture-info">reconstructed picture</a> is specified, then the corresponding picture reference associated with the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slot</a> is invalidated, as described in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot-states">DPB Slot States</a> section.</p>
 * 
 * <dl>
 * <dt>Active Parameter Sets</dt>
 * <dd>The <em>active sequence header</em> is the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-av1-sequence-header">AV1 sequence header</a> stored in the bound video session parameters object.</dd>
 * </dl>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoDecodeAV1#VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_AV1_PICTURE_INFO_KHR}</li>
 * <li>{@code pStdPictureInfo} <b>must</b> be a valid pointer to a valid {@code StdVideoDecodeAV1PictureInfo} value</li>
 * <li>{@code pTileOffsets} <b>must</b> be a valid pointer to an array of {@code tileCount} {@code uint32_t} values</li>
 * <li>{@code pTileSizes} <b>must</b> be a valid pointer to an array of {@code tileCount} {@code uint32_t} values</li>
 * <li>{@code tileCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoDecodeAV1PictureInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link StdVideoDecodeAV1PictureInfo StdVideoDecodeAV1PictureInfo} const * {@link #pStdPictureInfo};
 *     int32_t {@link #referenceNameSlotIndices}[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR];
 *     uint32_t {@link #frameHeaderOffset};
 *     uint32_t {@link #tileCount};
 *     uint32_t const * {@link #pTileOffsets};
 *     uint32_t const * {@link #pTileSizes};
 * }</code></pre>
 */
public class VkVideoDecodeAV1PictureInfoKHR extends Struct<VkVideoDecodeAV1PictureInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PSTDPICTUREINFO,
        REFERENCENAMESLOTINDICES,
        FRAMEHEADEROFFSET,
        TILECOUNT,
        PTILEOFFSETS,
        PTILESIZES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __array(4, VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDPICTUREINFO = layout.offsetof(2);
        REFERENCENAMESLOTINDICES = layout.offsetof(3);
        FRAMEHEADEROFFSET = layout.offsetof(4);
        TILECOUNT = layout.offsetof(5);
        PTILEOFFSETS = layout.offsetof(6);
        PTILESIZES = layout.offsetof(7);
    }

    protected VkVideoDecodeAV1PictureInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoDecodeAV1PictureInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoDecodeAV1PictureInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoDecodeAV1PictureInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeAV1PictureInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a pointer to a {@code StdVideoDecodeAV1PictureInfo} structure specifying <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-av1-picture-info">AV1 picture information</a>. */
    @NativeType("StdVideoDecodeAV1PictureInfo const *")
    public StdVideoDecodeAV1PictureInfo pStdPictureInfo() { return npStdPictureInfo(address()); }
    /** an array of seven ({@link KHRVideoDecodeAV1#VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR}, which is equal to the Video Std definition {@code STD_VIDEO_AV1_REFS_PER_FRAME}) signed integer values specifying the index of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slot</a> or a negative integer value for each <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-av1-reference-names">AV1 reference name</a> used for inter coding. In particular, the DPB slot index for the AV1 reference name {@code frame} is specified in {@code referenceNameSlotIndices}[{@code frame} - {@code STD_VIDEO_AV1_REFERENCE_NAME_LAST_FRAME}]. */
    @NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]")
    public IntBuffer referenceNameSlotIndices() { return nreferenceNameSlotIndices(address()); }
    /** an array of seven ({@link KHRVideoDecodeAV1#VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR}, which is equal to the Video Std definition {@code STD_VIDEO_AV1_REFS_PER_FRAME}) signed integer values specifying the index of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slot</a> or a negative integer value for each <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-av1-reference-names">AV1 reference name</a> used for inter coding. In particular, the DPB slot index for the AV1 reference name {@code frame} is specified in {@code referenceNameSlotIndices}[{@code frame} - {@code STD_VIDEO_AV1_REFERENCE_NAME_LAST_FRAME}]. */
    @NativeType("int32_t")
    public int referenceNameSlotIndices(int index) { return nreferenceNameSlotIndices(address(), index); }
    /** the byte offset of the AV1 frame header OBU, as defined in section 5.9 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>, within the video bitstream buffer range specified in {@link VkVideoDecodeInfoKHR}. */
    @NativeType("uint32_t")
    public int frameHeaderOffset() { return nframeHeaderOffset(address()); }
    /** the number of elements in {@code pTileOffsets} and {@code pTileSizes}. */
    @NativeType("uint32_t")
    public int tileCount() { return ntileCount(address()); }
    /** a pointer to an array of {@code tileCount} integers specifying the byte offset of the tiles of the picture within the video bitstream buffer range specified in {@link VkVideoDecodeInfoKHR}. */
    @NativeType("uint32_t const *")
    public IntBuffer pTileOffsets() { return npTileOffsets(address()); }
    /** a pointer to an array of {@code tileCount} integers specifying the byte size of the tiles of the picture within the video bitstream buffer range specified in {@link VkVideoDecodeInfoKHR}. */
    @NativeType("uint32_t const *")
    public IntBuffer pTileSizes() { return npTileSizes(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoDecodeAV1PictureInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoDecodeAV1#VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_AV1_PICTURE_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoDecodeAV1PictureInfoKHR sType$Default() { return sType(KHRVideoDecodeAV1.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_PICTURE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoDecodeAV1PictureInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoDecodeAV1PictureInfo} to the {@link #pStdPictureInfo} field. */
    public VkVideoDecodeAV1PictureInfoKHR pStdPictureInfo(@NativeType("StdVideoDecodeAV1PictureInfo const *") StdVideoDecodeAV1PictureInfo value) { npStdPictureInfo(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@link #referenceNameSlotIndices} field. */
    public VkVideoDecodeAV1PictureInfoKHR referenceNameSlotIndices(@NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") IntBuffer value) { nreferenceNameSlotIndices(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #referenceNameSlotIndices} field. */
    public VkVideoDecodeAV1PictureInfoKHR referenceNameSlotIndices(int index, @NativeType("int32_t") int value) { nreferenceNameSlotIndices(address(), index, value); return this; }
    /** Sets the specified value to the {@link #frameHeaderOffset} field. */
    public VkVideoDecodeAV1PictureInfoKHR frameHeaderOffset(@NativeType("uint32_t") int value) { nframeHeaderOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #tileCount} field. */
    public VkVideoDecodeAV1PictureInfoKHR tileCount(@NativeType("uint32_t") int value) { ntileCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pTileOffsets} field. */
    public VkVideoDecodeAV1PictureInfoKHR pTileOffsets(@NativeType("uint32_t const *") IntBuffer value) { npTileOffsets(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pTileSizes} field. */
    public VkVideoDecodeAV1PictureInfoKHR pTileSizes(@NativeType("uint32_t const *") IntBuffer value) { npTileSizes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeAV1PictureInfoKHR set(
        int sType,
        long pNext,
        StdVideoDecodeAV1PictureInfo pStdPictureInfo,
        IntBuffer referenceNameSlotIndices,
        int frameHeaderOffset,
        int tileCount,
        IntBuffer pTileOffsets,
        IntBuffer pTileSizes
    ) {
        sType(sType);
        pNext(pNext);
        pStdPictureInfo(pStdPictureInfo);
        referenceNameSlotIndices(referenceNameSlotIndices);
        frameHeaderOffset(frameHeaderOffset);
        tileCount(tileCount);
        pTileOffsets(pTileOffsets);
        pTileSizes(pTileSizes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoDecodeAV1PictureInfoKHR set(VkVideoDecodeAV1PictureInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeAV1PictureInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeAV1PictureInfoKHR malloc() {
        return new VkVideoDecodeAV1PictureInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeAV1PictureInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeAV1PictureInfoKHR calloc() {
        return new VkVideoDecodeAV1PictureInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeAV1PictureInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeAV1PictureInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeAV1PictureInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeAV1PictureInfoKHR} instance for the specified memory address. */
    public static VkVideoDecodeAV1PictureInfoKHR create(long address) {
        return new VkVideoDecodeAV1PictureInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeAV1PictureInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoDecodeAV1PictureInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1PictureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1PictureInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1PictureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1PictureInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1PictureInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1PictureInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoDecodeAV1PictureInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1PictureInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeAV1PictureInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeAV1PictureInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeAV1PictureInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeAV1PictureInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoDecodeAV1PictureInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeAV1PictureInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeAV1PictureInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1PictureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1PictureInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1PictureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1PictureInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeAV1PictureInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeAV1PictureInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pStdPictureInfo}. */
    public static StdVideoDecodeAV1PictureInfo npStdPictureInfo(long struct) { return StdVideoDecodeAV1PictureInfo.create(memGetAddress(struct + VkVideoDecodeAV1PictureInfoKHR.PSTDPICTUREINFO)); }
    /** Unsafe version of {@link #referenceNameSlotIndices}. */
    public static IntBuffer nreferenceNameSlotIndices(long struct) { return memIntBuffer(struct + VkVideoDecodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES, VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR); }
    /** Unsafe version of {@link #referenceNameSlotIndices(int) referenceNameSlotIndices}. */
    public static int nreferenceNameSlotIndices(long struct, int index) {
        return UNSAFE.getInt(null, struct + VkVideoDecodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES + check(index, VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR) * 4);
    }
    /** Unsafe version of {@link #frameHeaderOffset}. */
    public static int nframeHeaderOffset(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeAV1PictureInfoKHR.FRAMEHEADEROFFSET); }
    /** Unsafe version of {@link #tileCount}. */
    public static int ntileCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeAV1PictureInfoKHR.TILECOUNT); }
    /** Unsafe version of {@link #pTileOffsets() pTileOffsets}. */
    public static IntBuffer npTileOffsets(long struct) { return memIntBuffer(memGetAddress(struct + VkVideoDecodeAV1PictureInfoKHR.PTILEOFFSETS), ntileCount(struct)); }
    /** Unsafe version of {@link #pTileSizes() pTileSizes}. */
    public static IntBuffer npTileSizes(long struct) { return memIntBuffer(memGetAddress(struct + VkVideoDecodeAV1PictureInfoKHR.PTILESIZES), ntileCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeAV1PictureInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeAV1PictureInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pStdPictureInfo(StdVideoDecodeAV1PictureInfo) pStdPictureInfo}. */
    public static void npStdPictureInfo(long struct, StdVideoDecodeAV1PictureInfo value) { memPutAddress(struct + VkVideoDecodeAV1PictureInfoKHR.PSTDPICTUREINFO, value.address()); }
    /** Unsafe version of {@link #referenceNameSlotIndices(IntBuffer) referenceNameSlotIndices}. */
    public static void nreferenceNameSlotIndices(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR); }
        memCopy(memAddress(value), struct + VkVideoDecodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES, value.remaining() * 4);
    }
    /** Unsafe version of {@link #referenceNameSlotIndices(int, int) referenceNameSlotIndices}. */
    public static void nreferenceNameSlotIndices(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + VkVideoDecodeAV1PictureInfoKHR.REFERENCENAMESLOTINDICES + check(index, VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR) * 4, value);
    }
    /** Unsafe version of {@link #frameHeaderOffset(int) frameHeaderOffset}. */
    public static void nframeHeaderOffset(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeAV1PictureInfoKHR.FRAMEHEADEROFFSET, value); }
    /** Sets the specified value to the {@code tileCount} field of the specified {@code struct}. */
    public static void ntileCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeAV1PictureInfoKHR.TILECOUNT, value); }
    /** Unsafe version of {@link #pTileOffsets(IntBuffer) pTileOffsets}. */
    public static void npTileOffsets(long struct, IntBuffer value) { memPutAddress(struct + VkVideoDecodeAV1PictureInfoKHR.PTILEOFFSETS, memAddress(value)); }
    /** Unsafe version of {@link #pTileSizes(IntBuffer) pTileSizes}. */
    public static void npTileSizes(long struct, IntBuffer value) { memPutAddress(struct + VkVideoDecodeAV1PictureInfoKHR.PTILESIZES, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pStdPictureInfo = memGetAddress(struct + VkVideoDecodeAV1PictureInfoKHR.PSTDPICTUREINFO);
        check(pStdPictureInfo);
        StdVideoDecodeAV1PictureInfo.validate(pStdPictureInfo);
        check(memGetAddress(struct + VkVideoDecodeAV1PictureInfoKHR.PTILEOFFSETS));
        check(memGetAddress(struct + VkVideoDecodeAV1PictureInfoKHR.PTILESIZES));
    }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeAV1PictureInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeAV1PictureInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoDecodeAV1PictureInfoKHR ELEMENT_FACTORY = VkVideoDecodeAV1PictureInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeAV1PictureInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeAV1PictureInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoDecodeAV1PictureInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoDecodeAV1PictureInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeAV1PictureInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoDecodeAV1PictureInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeAV1PictureInfoKHR.npNext(address()); }
        /** @return a {@link StdVideoDecodeAV1PictureInfo} view of the struct pointed to by the {@link VkVideoDecodeAV1PictureInfoKHR#pStdPictureInfo} field. */
        @NativeType("StdVideoDecodeAV1PictureInfo const *")
        public StdVideoDecodeAV1PictureInfo pStdPictureInfo() { return VkVideoDecodeAV1PictureInfoKHR.npStdPictureInfo(address()); }
        /** @return a {@link IntBuffer} view of the {@link VkVideoDecodeAV1PictureInfoKHR#referenceNameSlotIndices} field. */
        @NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]")
        public IntBuffer referenceNameSlotIndices() { return VkVideoDecodeAV1PictureInfoKHR.nreferenceNameSlotIndices(address()); }
        /** @return the value at the specified index of the {@link VkVideoDecodeAV1PictureInfoKHR#referenceNameSlotIndices} field. */
        @NativeType("int32_t")
        public int referenceNameSlotIndices(int index) { return VkVideoDecodeAV1PictureInfoKHR.nreferenceNameSlotIndices(address(), index); }
        /** @return the value of the {@link VkVideoDecodeAV1PictureInfoKHR#frameHeaderOffset} field. */
        @NativeType("uint32_t")
        public int frameHeaderOffset() { return VkVideoDecodeAV1PictureInfoKHR.nframeHeaderOffset(address()); }
        /** @return the value of the {@link VkVideoDecodeAV1PictureInfoKHR#tileCount} field. */
        @NativeType("uint32_t")
        public int tileCount() { return VkVideoDecodeAV1PictureInfoKHR.ntileCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkVideoDecodeAV1PictureInfoKHR#pTileOffsets} field. */
        @NativeType("uint32_t const *")
        public IntBuffer pTileOffsets() { return VkVideoDecodeAV1PictureInfoKHR.npTileOffsets(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkVideoDecodeAV1PictureInfoKHR#pTileSizes} field. */
        @NativeType("uint32_t const *")
        public IntBuffer pTileSizes() { return VkVideoDecodeAV1PictureInfoKHR.npTileSizes(address()); }

        /** Sets the specified value to the {@link VkVideoDecodeAV1PictureInfoKHR#sType} field. */
        public VkVideoDecodeAV1PictureInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeAV1PictureInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoDecodeAV1#VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_AV1_PICTURE_INFO_KHR} value to the {@link VkVideoDecodeAV1PictureInfoKHR#sType} field. */
        public VkVideoDecodeAV1PictureInfoKHR.Buffer sType$Default() { return sType(KHRVideoDecodeAV1.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_PICTURE_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoDecodeAV1PictureInfoKHR#pNext} field. */
        public VkVideoDecodeAV1PictureInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeAV1PictureInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoDecodeAV1PictureInfo} to the {@link VkVideoDecodeAV1PictureInfoKHR#pStdPictureInfo} field. */
        public VkVideoDecodeAV1PictureInfoKHR.Buffer pStdPictureInfo(@NativeType("StdVideoDecodeAV1PictureInfo const *") StdVideoDecodeAV1PictureInfo value) { VkVideoDecodeAV1PictureInfoKHR.npStdPictureInfo(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@link VkVideoDecodeAV1PictureInfoKHR#referenceNameSlotIndices} field. */
        public VkVideoDecodeAV1PictureInfoKHR.Buffer referenceNameSlotIndices(@NativeType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") IntBuffer value) { VkVideoDecodeAV1PictureInfoKHR.nreferenceNameSlotIndices(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link VkVideoDecodeAV1PictureInfoKHR#referenceNameSlotIndices} field. */
        public VkVideoDecodeAV1PictureInfoKHR.Buffer referenceNameSlotIndices(int index, @NativeType("int32_t") int value) { VkVideoDecodeAV1PictureInfoKHR.nreferenceNameSlotIndices(address(), index, value); return this; }
        /** Sets the specified value to the {@link VkVideoDecodeAV1PictureInfoKHR#frameHeaderOffset} field. */
        public VkVideoDecodeAV1PictureInfoKHR.Buffer frameHeaderOffset(@NativeType("uint32_t") int value) { VkVideoDecodeAV1PictureInfoKHR.nframeHeaderOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoDecodeAV1PictureInfoKHR#tileCount} field. */
        public VkVideoDecodeAV1PictureInfoKHR.Buffer tileCount(@NativeType("uint32_t") int value) { VkVideoDecodeAV1PictureInfoKHR.ntileCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkVideoDecodeAV1PictureInfoKHR#pTileOffsets} field. */
        public VkVideoDecodeAV1PictureInfoKHR.Buffer pTileOffsets(@NativeType("uint32_t const *") IntBuffer value) { VkVideoDecodeAV1PictureInfoKHR.npTileOffsets(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkVideoDecodeAV1PictureInfoKHR#pTileSizes} field. */
        public VkVideoDecodeAV1PictureInfoKHR.Buffer pTileSizes(@NativeType("uint32_t const *") IntBuffer value) { VkVideoDecodeAV1PictureInfoKHR.npTileSizes(address(), value); return this; }

    }

}