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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.video.*;

/**
 * Structure specifies H.264 encode frame parameters.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure is specified in the {@code pNext} chain of the {@link VkVideoEncodeInfoKHR} structure passed to {@link KHRVideoEncodeQueue#vkCmdEncodeVideoKHR CmdEncodeVideoKHR} to specify the codec-specific picture information for an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h264">H.264 encode operation</a>.</p>
 * 
 * <dl>
 * <dt>Encode Input Picture Information</dt>
 * <dd><ul>
 * <li>The image subregion used is determined according to the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h264-picture-data-access">H.264 Encode Picture Data Access</a> section.</li>
 * <li>The encode input picture is associated with the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h264-picture-info">H.264 picture information</a> provided in {@code pStdPictureInfo}.</li>
 * </ul></dd>
 * </dl>
 * 
 * <dl>
 * <dt>Std Picture Information</dt>
 * <dd><ul>
 * <li>{@code flags.reserved} and {@code reserved1} are used only for padding purposes and are otherwise ignored;</li>
 * <li>{@code flags.IdrPicFlag} as defined in section 7.4.1 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#itu-t-h264">ITU-T H.264 Specification</a>;</li>
 * <li>{@code flags.is_reference} as defined in section 3.136 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#itu-t-h264">ITU-T H.264 Specification</a>;</li>
 * <li>{@code seq_parameter_set_id} and {@code pic_parameter_set_id} are used to identify the active parameter sets, as described below;</li>
 * <li>{@code primary_pic_type} as defined in section 7.4.2 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#itu-t-h264">ITU-T H.264 Specification</a>;</li>
 * <li>{@code PicOrderCnt} as defined in section 8.2 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#itu-t-h264">ITU-T H.264 Specification</a>;</li>
 * <li>{@code temporal_id} as defined in section G.7.4.1.1 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#itu-t-h264">ITU-T H.264 Specification</a>;</li>
 * <li>if {@code pRefLists} is not {@code NULL}, then it is a pointer to a {@code StdVideoEncodeH264ReferenceListsInfo} structure that is interpreted as follows:
 * 
 * <ul>
 * <li>{@code flags.reserved} is used only for padding purposes and is otherwise ignored;</li>
 * <li>{@code ref_pic_list_modification_flag_l0} and {@code ref_pic_list_modification_flag_l1} as defined in section 7.4.3.1 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#itu-t-h264">ITU-T H.264 Specification</a>;</li>
 * <li>{@code num_ref_idx_l0_active_minus1} and {@code num_ref_idx_l1_active_minus1} as defined in section 7.4.3 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#itu-t-h264">ITU-T H.264 Specification</a>;</li>
 * <li>{@code RefPicList0} and {@code RefPicList1} as defined in section 8.2.4 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#itu-t-h264">ITU-T H.264 Specification</a> where each element of these arrays either identifies an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-active-reference-picture-info">active reference picture</a> using its <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dpb-slot">DPB slot</a> index or contains the value {@code STD_VIDEO_H264_NO_REFERENCE_PICTURE} to indicate “no reference picture”;</li>
 * <li>if {@code refList0ModOpCount} is not zero, then {@code pRefList0ModOperations} is a pointer to an array of {@code refList0ModOpCount} number of {@code StdVideoEncodeH264RefListModEntry} structures specifying the modification parameters for the reference list L0 as defined in section 7.4.3.1 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#itu-t-h264">ITU-T H.264 Specification</a>;</li>
 * <li>if {@code refList1ModOpCount} is not zero, then {@code pRefList1ModOperations} is a pointer to an array of {@code refList1ModOpCount} number of {@code StdVideoEncodeH264RefListModEntry} structures specifying the modification parameters for the reference list L1 as defined in section 7.4.3.1 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#itu-t-h264">ITU-T H.264 Specification</a>;</li>
 * <li>if {@code refPicMarkingOpCount} is not zero, then {@code refPicMarkingOperations} is a pointer to an array of {@code refPicMarkingOpCount} number of {@code StdVideoEncodeH264RefPicMarkingEntry} structures specifying the reference picture marking parameters as defined in section 7.4.3.3 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#itu-t-h264">ITU-T H.264 Specification</a>;</li>
 * </ul>
 * </li>
 * <li>all other members are interpreted as defined in section 7.4.3 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#itu-t-h264">ITU-T H.264 Specification</a>.</li>
 * </ul></dd>
 * </dl>
 * 
 * <p>Reference picture setup is controlled by the value of {@code StdVideoEncodeH264PictureInfo}{@code ::flags.is_reference}. If it is set and a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-reconstructed-picture-info">reconstructed picture</a> is specified, then the latter is used as the target of picture reconstruction to <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dpb-slot-states">activate</a> the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dpb-slot">DPB slot</a> specified in {@code pEncodeInfo→pSetupReferenceSlot→slotIndex}. If {@code StdVideoEncodeH264PictureInfo}{@code ::flags.is_reference} is not set, but a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-reconstructed-picture-info">reconstructed picture</a> is specified, then the corresponding picture reference associated with the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dpb-slot">DPB slot</a> is invalidated, as described in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dpb-slot-states">DPB Slot States</a> section.</p>
 * 
 * <dl>
 * <dt>Active Parameter Sets</dt>
 * <dd><ul>
 * <li>The <em>active SPS</em> is the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h264-sps">SPS</a> identified by the key specified in {@code StdVideoEncodeH264PictureInfo}{@code ::seq_parameter_set_id}.</li>
 * <li>The <em>active PPS</em> is the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h264-pps">PPS</a> identified by the key specified by the pair constructed from {@code StdVideoEncodeH264PictureInfo}{@code ::seq_parameter_set_id} and {@code StdVideoEncodeH264PictureInfo}{@code ::pic_parameter_set_id}.</li>
 * </ul></dd>
 * </dl>
 * 
 * <p>H.264 encoding uses <em>explicit weighted sample prediction</em> for a slice, as defined in section 8.4.2.3 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#itu-t-h264">ITU-T H.264 Specification</a>, if any of the following conditions are true for the active <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h264-pps">PPS</a> and the {@code pStdSliceHeader} member of the corresponding element of {@code pNaluSliceEntries}:</p>
 * 
 * <ul>
 * <li>{@code pStdSliceHeader→slice_type} is {@code STD_VIDEO_H264_SLICE_TYPE_P} and {@code weighted_pred_flag} is enabled in the active PPS.</li>
 * <li>{@code pStdSliceHeader→slice_type} is {@code STD_VIDEO_H264_SLICE_TYPE_B} and {@code weighted_bipred_idc} in the active PPS equals {@code STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_EXPLICIT}.</li>
 * </ul>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code naluSliceEntryCount} <b>must</b> be between 1 and {@link VkVideoEncodeH264CapabilitiesKHR}{@code ::maxSliceCount}, inclusive, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the used video profile</li>
 * <li>If {@link VkVideoEncodeH264CapabilitiesKHR}{@code ::flags}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the used video profile, does not include {@link KHRVideoEncodeH264#VK_VIDEO_ENCODE_H264_CAPABILITY_GENERATE_PREFIX_NALU_BIT_KHR VIDEO_ENCODE_H264_CAPABILITY_GENERATE_PREFIX_NALU_BIT_KHR}, then {@code generatePrefixNalu} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If {@link VkVideoEncodeH264CapabilitiesKHR}{@code ::flags}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the used video profile, does not include {@link KHRVideoEncodeH264#VK_VIDEO_ENCODE_H264_CAPABILITY_PREDICTION_WEIGHT_TABLE_GENERATED_BIT_KHR VIDEO_ENCODE_H264_CAPABILITY_PREDICTION_WEIGHT_TABLE_GENERATED_BIT_KHR} and the slice corresponding to any element of {@code pNaluSliceEntries} uses <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h264-weighted-pred">explicit weighted sample prediction</a>, then {@link VkVideoEncodeH264NaluSliceInfoKHR}{@code ::pStdSliceHeader→pWeightTable} <b>must</b> not be {@code NULL} for that element of {@code pNaluSliceEntries}</li>
 * <li>If {@link VkVideoEncodeH264CapabilitiesKHR}{@code ::flags}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the used video profile, does not include {@link KHRVideoEncodeH264#VK_VIDEO_ENCODE_H264_CAPABILITY_DIFFERENT_SLICE_TYPE_BIT_KHR VIDEO_ENCODE_H264_CAPABILITY_DIFFERENT_SLICE_TYPE_BIT_KHR}, then {@link VkVideoEncodeH264NaluSliceInfoKHR}{@code ::pStdSliceHeader→slice_type} <b>must</b> be identical for all elements of {@code pNaluSliceEntries}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_KHR}</li>
 * <li>{@code pNaluSliceEntries} <b>must</b> be a valid pointer to an array of {@code naluSliceEntryCount} valid {@link VkVideoEncodeH264NaluSliceInfoKHR} structures</li>
 * <li>{@code pStdPictureInfo} <b>must</b> be a valid pointer to a valid {@code StdVideoEncodeH264PictureInfo} value</li>
 * <li>{@code naluSliceEntryCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH264NaluSliceInfoKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH264PictureInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #naluSliceEntryCount};
 *     {@link VkVideoEncodeH264NaluSliceInfoKHR VkVideoEncodeH264NaluSliceInfoKHR} const * {@link #pNaluSliceEntries};
 *     {@link StdVideoEncodeH264PictureInfo StdVideoEncodeH264PictureInfo} const * {@link #pStdPictureInfo};
 *     VkBool32 {@link #generatePrefixNalu};
 * }</code></pre>
 */
public class VkVideoEncodeH264PictureInfoKHR extends Struct<VkVideoEncodeH264PictureInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        NALUSLICEENTRYCOUNT,
        PNALUSLICEENTRIES,
        PSTDPICTUREINFO,
        GENERATEPREFIXNALU;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        NALUSLICEENTRYCOUNT = layout.offsetof(2);
        PNALUSLICEENTRIES = layout.offsetof(3);
        PSTDPICTUREINFO = layout.offsetof(4);
        GENERATEPREFIXNALU = layout.offsetof(5);
    }

    protected VkVideoEncodeH264PictureInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH264PictureInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264PictureInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH264PictureInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264PictureInfoKHR(ByteBuffer container) {
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
    /** the number of elements in {@code pNaluSliceEntries}. */
    @NativeType("uint32_t")
    public int naluSliceEntryCount() { return nnaluSliceEntryCount(address()); }
    /** a pointer to an array of {@code naluSliceEntryCount} {@link VkVideoEncodeH264NaluSliceInfoKHR} structures specifying the parameters of the individual H.264 slices to encode for the input picture. */
    @NativeType("VkVideoEncodeH264NaluSliceInfoKHR const *")
    public VkVideoEncodeH264NaluSliceInfoKHR.Buffer pNaluSliceEntries() { return npNaluSliceEntries(address()); }
    /** a pointer to a {@code StdVideoEncodeH264PictureInfo} structure specifying <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h264-picture-info">H.264 picture information</a>. */
    @NativeType("StdVideoEncodeH264PictureInfo const *")
    public StdVideoEncodeH264PictureInfo pStdPictureInfo() { return npStdPictureInfo(address()); }
    /** controls whether prefix NALUs are generated before slice NALUs into the target bitstream, as defined in sections 7.3.2.12 and 7.4.2.12 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#itu-t-h264">ITU-T H.264 Specification</a>. */
    @NativeType("VkBool32")
    public boolean generatePrefixNalu() { return ngeneratePrefixNalu(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH264PictureInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeH264PictureInfoKHR sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH264PictureInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH264NaluSliceInfoKHR.Buffer} to the {@link #pNaluSliceEntries} field. */
    public VkVideoEncodeH264PictureInfoKHR pNaluSliceEntries(@NativeType("VkVideoEncodeH264NaluSliceInfoKHR const *") VkVideoEncodeH264NaluSliceInfoKHR.Buffer value) { npNaluSliceEntries(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264PictureInfo} to the {@link #pStdPictureInfo} field. */
    public VkVideoEncodeH264PictureInfoKHR pStdPictureInfo(@NativeType("StdVideoEncodeH264PictureInfo const *") StdVideoEncodeH264PictureInfo value) { npStdPictureInfo(address(), value); return this; }
    /** Sets the specified value to the {@link #generatePrefixNalu} field. */
    public VkVideoEncodeH264PictureInfoKHR generatePrefixNalu(@NativeType("VkBool32") boolean value) { ngeneratePrefixNalu(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264PictureInfoKHR set(
        int sType,
        long pNext,
        VkVideoEncodeH264NaluSliceInfoKHR.Buffer pNaluSliceEntries,
        StdVideoEncodeH264PictureInfo pStdPictureInfo,
        boolean generatePrefixNalu
    ) {
        sType(sType);
        pNext(pNext);
        pNaluSliceEntries(pNaluSliceEntries);
        pStdPictureInfo(pStdPictureInfo);
        generatePrefixNalu(generatePrefixNalu);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH264PictureInfoKHR set(VkVideoEncodeH264PictureInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264PictureInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264PictureInfoKHR malloc() {
        return new VkVideoEncodeH264PictureInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264PictureInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264PictureInfoKHR calloc() {
        return new VkVideoEncodeH264PictureInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264PictureInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264PictureInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264PictureInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264PictureInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeH264PictureInfoKHR create(long address) {
        return new VkVideoEncodeH264PictureInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH264PictureInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH264PictureInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264PictureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264PictureInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264PictureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264PictureInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264PictureInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264PictureInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH264PictureInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264PictureInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH264PictureInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264PictureInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264PictureInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH264PictureInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264PictureInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264PictureInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH264PictureInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264PictureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264PictureInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264PictureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264PictureInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeH264PictureInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264PictureInfoKHR.PNEXT); }
    /** Unsafe version of {@link #naluSliceEntryCount}. */
    public static int nnaluSliceEntryCount(long struct) { return memGetInt(struct + VkVideoEncodeH264PictureInfoKHR.NALUSLICEENTRYCOUNT); }
    /** Unsafe version of {@link #pNaluSliceEntries}. */
    public static VkVideoEncodeH264NaluSliceInfoKHR.Buffer npNaluSliceEntries(long struct) { return VkVideoEncodeH264NaluSliceInfoKHR.create(memGetAddress(struct + VkVideoEncodeH264PictureInfoKHR.PNALUSLICEENTRIES), nnaluSliceEntryCount(struct)); }
    /** Unsafe version of {@link #pStdPictureInfo}. */
    public static StdVideoEncodeH264PictureInfo npStdPictureInfo(long struct) { return StdVideoEncodeH264PictureInfo.create(memGetAddress(struct + VkVideoEncodeH264PictureInfoKHR.PSTDPICTUREINFO)); }
    /** Unsafe version of {@link #generatePrefixNalu}. */
    public static int ngeneratePrefixNalu(long struct) { return memGetInt(struct + VkVideoEncodeH264PictureInfoKHR.GENERATEPREFIXNALU); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeH264PictureInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264PictureInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code naluSliceEntryCount} field of the specified {@code struct}. */
    public static void nnaluSliceEntryCount(long struct, int value) { memPutInt(struct + VkVideoEncodeH264PictureInfoKHR.NALUSLICEENTRYCOUNT, value); }
    /** Unsafe version of {@link #pNaluSliceEntries(VkVideoEncodeH264NaluSliceInfoKHR.Buffer) pNaluSliceEntries}. */
    public static void npNaluSliceEntries(long struct, VkVideoEncodeH264NaluSliceInfoKHR.Buffer value) { memPutAddress(struct + VkVideoEncodeH264PictureInfoKHR.PNALUSLICEENTRIES, value.address()); nnaluSliceEntryCount(struct, value.remaining()); }
    /** Unsafe version of {@link #pStdPictureInfo(StdVideoEncodeH264PictureInfo) pStdPictureInfo}. */
    public static void npStdPictureInfo(long struct, StdVideoEncodeH264PictureInfo value) { memPutAddress(struct + VkVideoEncodeH264PictureInfoKHR.PSTDPICTUREINFO, value.address()); }
    /** Unsafe version of {@link #generatePrefixNalu(boolean) generatePrefixNalu}. */
    public static void ngeneratePrefixNalu(long struct, int value) { memPutInt(struct + VkVideoEncodeH264PictureInfoKHR.GENERATEPREFIXNALU, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int naluSliceEntryCount = nnaluSliceEntryCount(struct);
        long pNaluSliceEntries = memGetAddress(struct + VkVideoEncodeH264PictureInfoKHR.PNALUSLICEENTRIES);
        check(pNaluSliceEntries);
        validate(pNaluSliceEntries, naluSliceEntryCount, VkVideoEncodeH264NaluSliceInfoKHR.SIZEOF, VkVideoEncodeH264NaluSliceInfoKHR::validate);
        long pStdPictureInfo = memGetAddress(struct + VkVideoEncodeH264PictureInfoKHR.PSTDPICTUREINFO);
        check(pStdPictureInfo);
        StdVideoEncodeH264PictureInfo.validate(pStdPictureInfo);
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264PictureInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264PictureInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264PictureInfoKHR ELEMENT_FACTORY = VkVideoEncodeH264PictureInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264PictureInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264PictureInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH264PictureInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH264PictureInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264PictureInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH264PictureInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264PictureInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH264PictureInfoKHR#naluSliceEntryCount} field. */
        @NativeType("uint32_t")
        public int naluSliceEntryCount() { return VkVideoEncodeH264PictureInfoKHR.nnaluSliceEntryCount(address()); }
        /** @return a {@link VkVideoEncodeH264NaluSliceInfoKHR.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH264PictureInfoKHR#pNaluSliceEntries} field. */
        @NativeType("VkVideoEncodeH264NaluSliceInfoKHR const *")
        public VkVideoEncodeH264NaluSliceInfoKHR.Buffer pNaluSliceEntries() { return VkVideoEncodeH264PictureInfoKHR.npNaluSliceEntries(address()); }
        /** @return a {@link StdVideoEncodeH264PictureInfo} view of the struct pointed to by the {@link VkVideoEncodeH264PictureInfoKHR#pStdPictureInfo} field. */
        @NativeType("StdVideoEncodeH264PictureInfo const *")
        public StdVideoEncodeH264PictureInfo pStdPictureInfo() { return VkVideoEncodeH264PictureInfoKHR.npStdPictureInfo(address()); }
        /** @return the value of the {@link VkVideoEncodeH264PictureInfoKHR#generatePrefixNalu} field. */
        @NativeType("VkBool32")
        public boolean generatePrefixNalu() { return VkVideoEncodeH264PictureInfoKHR.ngeneratePrefixNalu(address()) != 0; }

        /** Sets the specified value to the {@link VkVideoEncodeH264PictureInfoKHR#sType} field. */
        public VkVideoEncodeH264PictureInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264PictureInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_KHR} value to the {@link VkVideoEncodeH264PictureInfoKHR#sType} field. */
        public VkVideoEncodeH264PictureInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeH264PictureInfoKHR#pNext} field. */
        public VkVideoEncodeH264PictureInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264PictureInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH264NaluSliceInfoKHR.Buffer} to the {@link VkVideoEncodeH264PictureInfoKHR#pNaluSliceEntries} field. */
        public VkVideoEncodeH264PictureInfoKHR.Buffer pNaluSliceEntries(@NativeType("VkVideoEncodeH264NaluSliceInfoKHR const *") VkVideoEncodeH264NaluSliceInfoKHR.Buffer value) { VkVideoEncodeH264PictureInfoKHR.npNaluSliceEntries(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264PictureInfo} to the {@link VkVideoEncodeH264PictureInfoKHR#pStdPictureInfo} field. */
        public VkVideoEncodeH264PictureInfoKHR.Buffer pStdPictureInfo(@NativeType("StdVideoEncodeH264PictureInfo const *") StdVideoEncodeH264PictureInfo value) { VkVideoEncodeH264PictureInfoKHR.npStdPictureInfo(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264PictureInfoKHR#generatePrefixNalu} field. */
        public VkVideoEncodeH264PictureInfoKHR.Buffer generatePrefixNalu(@NativeType("VkBool32") boolean value) { VkVideoEncodeH264PictureInfoKHR.ngeneratePrefixNalu(address(), value ? 1 : 0); return this; }

    }

}