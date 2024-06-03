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

/**
 * Structure specifies AV1 DPB information when decoding a frame.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure is specified in the {@code pNext} chain of {@link VkVideoDecodeInfoKHR}{@code ::pSetupReferenceSlot}, if not {@code NULL}, and the {@code pNext} chain of the elements of {@link VkVideoDecodeInfoKHR}{@code ::pReferenceSlots} to specify the codec-specific reference picture information for an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-av1">AV1 decode operation</a>.</p>
 * 
 * <dl>
 * <dt>Active Reference Picture Information</dt>
 * <dd><ul>
 * <li>The image subregion used is determined according to the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-av1-picture-data-access">AV1 Decode Picture Data Access</a> section.</li>
 * <li>The reference picture is associated with the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slot</a> index specified in the {@code slotIndex} member of the corresponding element of {@link VkVideoDecodeInfoKHR}{@code ::pReferenceSlots}.</li>
 * <li>The reference picture is associated with the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-av1-reference-info">AV1 reference information</a> provided in {@code pStdReferenceInfo}.</li>
 * </ul></dd>
 * </dl>
 * 
 * <dl>
 * <dt>Reconstructed Picture Information</dt>
 * <dd><ul>
 * <li>The image subregion used is determined according to the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-av1-picture-data-access">AV1 Decode Picture Data Access</a> section.</li>
 * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-av1-ref-pic-setup">reference picture setup</a> is requested, then the reconstructed picture is used to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot-states">activate</a> the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slot</a> with the index specified in {@link VkVideoDecodeInfoKHR}{@code ::pSetupReferenceSlot→slotIndex}.</li>
 * <li>The reconstructed picture is associated with the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-av1-reference-info">AV1 reference information</a> provided in {@code pStdReferenceInfo}.</li>
 * </ul></dd>
 * </dl>
 * 
 * <dl>
 * <dt>Std Reference Information</dt>
 * <dd><ul>
 * <li>{@code flags.reserved} and {@code reserved1} are used only for padding purposes and are otherwise ignored;</li>
 * <li>{@code flags.disable_frame_end_update_cdf} is interpreted as defined in section 6.8.2 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>{@code flags.segmentation_enabled} is interpreted as defined in section 6.8.13 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>{@code frame_type} is interpreted as defined in section 6.8.2 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>;
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The {@code frame_type} member is defined with the type {@code uint8_t}, but it takes the same values defined in the {@code StdVideoAV1FrameType} enumeration type as {@code StdVideoDecodeAV1PictureInfo}{@code ::frame_type}.</p>
 * </div>
 * </li>
 * <li>{@code RefFrameSignBias} is a bitmask where bit index <code>i</code> corresponds to {@code RefFrameSignBias[i]} as defined in section 6.8.2 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>{@code OrderHint} is interpreted as defined in section 6.8.2 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>{@code SavedOrderHints} is interpreted as defined in section 7.20 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#aomedia-av1">AV1 Specification</a>.
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>When the AV1 reference information is provided for the reconstructed picture, certain parameters (e.g. {@code frame_type}) are specified both in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-av1-picture-info">AV1 picture information</a> and in the AV1 reference information. This is necessary because unlike the AV1 picture information, which is only used for the purposes of the video decode operation in question, the AV1 reference information specified for the reconstructed picture <b>may</b> be associated with the activated DPB slot, meaning that some implementations <b>may</b> maintain it as part of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#reference-metadata">reference picture metadata</a> corresponding to the video picture resource associated with the DPB slot. When the AV1 reference information is provided for an active reference picture, the specified parameters correspond to the parameters specified when the DPB slot was activated (set up) with the reference picture, as usual, in order to communicate these parameters for implementations that do not maintain any subset of these parameters as part of the DPB slot’s <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#reference-metadata">reference picture metadata</a>.</p>
 * </div>
 * </li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoDecodeAV1#VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_DPB_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_AV1_DPB_SLOT_INFO_KHR}</li>
 * <li>{@code pStdReferenceInfo} <b>must</b> be a valid pointer to a valid {@code StdVideoDecodeAV1ReferenceInfo} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoDecodeAV1DpbSlotInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link StdVideoDecodeAV1ReferenceInfo StdVideoDecodeAV1ReferenceInfo} const * {@link #pStdReferenceInfo};
 * }</code></pre>
 */
public class VkVideoDecodeAV1DpbSlotInfoKHR extends Struct<VkVideoDecodeAV1DpbSlotInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PSTDREFERENCEINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDREFERENCEINFO = layout.offsetof(2);
    }

    protected VkVideoDecodeAV1DpbSlotInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoDecodeAV1DpbSlotInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoDecodeAV1DpbSlotInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoDecodeAV1DpbSlotInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeAV1DpbSlotInfoKHR(ByteBuffer container) {
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
    /** a pointer to a {@code StdVideoDecodeAV1ReferenceInfo} structure specifying <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-av1-reference-info">AV1 reference information</a>. */
    @NativeType("StdVideoDecodeAV1ReferenceInfo const *")
    public StdVideoDecodeAV1ReferenceInfo pStdReferenceInfo() { return npStdReferenceInfo(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoDecodeAV1DpbSlotInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoDecodeAV1#VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_DPB_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_AV1_DPB_SLOT_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoDecodeAV1DpbSlotInfoKHR sType$Default() { return sType(KHRVideoDecodeAV1.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_DPB_SLOT_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoDecodeAV1DpbSlotInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoDecodeAV1ReferenceInfo} to the {@link #pStdReferenceInfo} field. */
    public VkVideoDecodeAV1DpbSlotInfoKHR pStdReferenceInfo(@NativeType("StdVideoDecodeAV1ReferenceInfo const *") StdVideoDecodeAV1ReferenceInfo value) { npStdReferenceInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeAV1DpbSlotInfoKHR set(
        int sType,
        long pNext,
        StdVideoDecodeAV1ReferenceInfo pStdReferenceInfo
    ) {
        sType(sType);
        pNext(pNext);
        pStdReferenceInfo(pStdReferenceInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoDecodeAV1DpbSlotInfoKHR set(VkVideoDecodeAV1DpbSlotInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeAV1DpbSlotInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeAV1DpbSlotInfoKHR malloc() {
        return new VkVideoDecodeAV1DpbSlotInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeAV1DpbSlotInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeAV1DpbSlotInfoKHR calloc() {
        return new VkVideoDecodeAV1DpbSlotInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeAV1DpbSlotInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeAV1DpbSlotInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeAV1DpbSlotInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeAV1DpbSlotInfoKHR} instance for the specified memory address. */
    public static VkVideoDecodeAV1DpbSlotInfoKHR create(long address) {
        return new VkVideoDecodeAV1DpbSlotInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeAV1DpbSlotInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoDecodeAV1DpbSlotInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1DpbSlotInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1DpbSlotInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1DpbSlotInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1DpbSlotInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1DpbSlotInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1DpbSlotInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoDecodeAV1DpbSlotInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1DpbSlotInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeAV1DpbSlotInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeAV1DpbSlotInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeAV1DpbSlotInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeAV1DpbSlotInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoDecodeAV1DpbSlotInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeAV1DpbSlotInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeAV1DpbSlotInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1DpbSlotInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1DpbSlotInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeAV1DpbSlotInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeAV1DpbSlotInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeAV1DpbSlotInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeAV1DpbSlotInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pStdReferenceInfo}. */
    public static StdVideoDecodeAV1ReferenceInfo npStdReferenceInfo(long struct) { return StdVideoDecodeAV1ReferenceInfo.create(memGetAddress(struct + VkVideoDecodeAV1DpbSlotInfoKHR.PSTDREFERENCEINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeAV1DpbSlotInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeAV1DpbSlotInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pStdReferenceInfo(StdVideoDecodeAV1ReferenceInfo) pStdReferenceInfo}. */
    public static void npStdReferenceInfo(long struct, StdVideoDecodeAV1ReferenceInfo value) { memPutAddress(struct + VkVideoDecodeAV1DpbSlotInfoKHR.PSTDREFERENCEINFO, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkVideoDecodeAV1DpbSlotInfoKHR.PSTDREFERENCEINFO));
    }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeAV1DpbSlotInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeAV1DpbSlotInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoDecodeAV1DpbSlotInfoKHR ELEMENT_FACTORY = VkVideoDecodeAV1DpbSlotInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeAV1DpbSlotInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeAV1DpbSlotInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoDecodeAV1DpbSlotInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoDecodeAV1DpbSlotInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeAV1DpbSlotInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoDecodeAV1DpbSlotInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeAV1DpbSlotInfoKHR.npNext(address()); }
        /** @return a {@link StdVideoDecodeAV1ReferenceInfo} view of the struct pointed to by the {@link VkVideoDecodeAV1DpbSlotInfoKHR#pStdReferenceInfo} field. */
        @NativeType("StdVideoDecodeAV1ReferenceInfo const *")
        public StdVideoDecodeAV1ReferenceInfo pStdReferenceInfo() { return VkVideoDecodeAV1DpbSlotInfoKHR.npStdReferenceInfo(address()); }

        /** Sets the specified value to the {@link VkVideoDecodeAV1DpbSlotInfoKHR#sType} field. */
        public VkVideoDecodeAV1DpbSlotInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeAV1DpbSlotInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoDecodeAV1#VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_DPB_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_AV1_DPB_SLOT_INFO_KHR} value to the {@link VkVideoDecodeAV1DpbSlotInfoKHR#sType} field. */
        public VkVideoDecodeAV1DpbSlotInfoKHR.Buffer sType$Default() { return sType(KHRVideoDecodeAV1.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_DPB_SLOT_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoDecodeAV1DpbSlotInfoKHR#pNext} field. */
        public VkVideoDecodeAV1DpbSlotInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeAV1DpbSlotInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoDecodeAV1ReferenceInfo} to the {@link VkVideoDecodeAV1DpbSlotInfoKHR#pStdReferenceInfo} field. */
        public VkVideoDecodeAV1DpbSlotInfoKHR.Buffer pStdReferenceInfo(@NativeType("StdVideoDecodeAV1ReferenceInfo const *") StdVideoDecodeAV1ReferenceInfo value) { VkVideoDecodeAV1DpbSlotInfoKHR.npStdReferenceInfo(address(), value); return this; }

    }

}