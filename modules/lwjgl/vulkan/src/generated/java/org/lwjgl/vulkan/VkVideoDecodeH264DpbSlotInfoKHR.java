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
 * Structure specifies H.264 decode DPB picture information.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure is specified in the {@code pNext} chain of {@link VkVideoDecodeInfoKHR}{@code ::pSetupReferenceSlot}, if not {@code NULL}, and the {@code pNext} chain of the elements of {@link VkVideoDecodeInfoKHR}{@code ::pReferenceSlots} to specify the codec-specific reference picture information for an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264">H.264 decode operation</a>.</p>
 * 
 * <dl>
 * <dt>Active Reference Picture Information</dt>
 * <dd><ul>
 * <li>If neither {@code pStdReferenceInfo→flags.top_field_flag} nor {@code pStdReferenceInfo→flags.bottom_field_flag} is set, then the picture is added as a frame reference to the list of active reference pictures.</li>
 * <li>If {@code pStdReferenceInfo→flags.top_field_flag} is set, then the picture is added as a top field reference to the list of active reference pictures.</li>
 * <li>If {@code pStdReferenceInfo→flags.bottom_field_flag} is set, then the picture is added as a bottom field reference to the list of active reference pictures.</li>
 * <li>For each added reference picture, the corresponding image subregion used is determined according to the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-picture-data-access">H.264 Decode Picture Data Access</a> section.</li>
 * <li>Each added reference picture is associated with the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slot</a> index specified in the {@code slotIndex} member of the corresponding element of {@link VkVideoDecodeInfoKHR}{@code ::pReferenceSlots}.</li>
 * <li>Each added reference picture is associated with the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-reference-info">H.264 reference information</a> provided in {@code pStdReferenceInfo}.</li>
 * </ul></dd>
 * </dl>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>When both the top and bottom field of an interlaced frame currently associated with a DPB slot is intended to be used as an active reference picture and both fields are stored in the same image subregion (which is the case when using {@link KHRVideoDecodeH264#VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_INTERLEAVED_LINES_BIT_KHR VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_INTERLEAVED_LINES_BIT_KHR} which stores the two fields at even and odd scanlines of the same image subregion), both references have to be provided through a single {@link VkVideoReferenceSlotInfoKHR} structure that has both {@code flags.top_field_flag} and {@code flags.bottom_field_flag} set in the {@code StdVideoDecodeH264ReferenceInfo} structure pointed to by the {@code pStdReferenceInfo} member of the {@link VkVideoDecodeH264DpbSlotInfoKHR} structure included in the corresponding {@link VkVideoReferenceSlotInfoKHR} structure’s {@code pNext} chain. However, this approach can only be used when both fields are stored in the same image subregion. If that is not the case (e.g. when using {@link KHRVideoDecodeH264#VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_SEPARATE_PLANES_BIT_KHR VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_SEPARATE_PLANES_BIT_KHR} which requires separate {@code codedOffset} values for the two fields and also allows storing the two fields of a frame in separate image layers or entirely separate images), then a separate {@link VkVideoReferenceSlotInfoKHR} structure needs to be provided for referencing the two fields, each only setting one of {@code flags.top_field_flag} or {@code flags.bottom_field_flag}, and providing the appropriate video picture resource information in {@link VkVideoReferenceSlotInfoKHR}{@code ::pPictureResource}.</p>
 * </div>
 * 
 * <dl>
 * <dt>Reconstructed Picture Information</dt>
 * <dd><ul>
 * <li>If neither {@code pStdReferenceInfo→flags.top_field_flag} nor {@code pStdReferenceInfo→flags.bottom_field_flag} is set, then the picture represents a frame.</li>
 * <li>If {@code pStdReferenceInfo→flags.top_field_flag} is set, then the picture represents a field, specifically, the top field of the frame.</li>
 * <li>If {@code pStdReferenceInfo→flags.bottom_field_flag} is set, then the picture represents a field, specifically, the bottom field of the frame.</li>
 * <li>The image subregion used is determined according to the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-picture-data-access">H.264 Decode Picture Data Access</a> section.</li>
 * <li>The reconstructed picture is used to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot-states">activate</a> the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slot</a> with the index specified in {@link VkVideoDecodeInfoKHR}{@code ::pSetupReferenceSlot→slotIndex}.</li>
 * <li>The reconstructed picture is associated with the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-reference-info">H.264 reference information</a> provided in {@code pStdReferenceInfo}.</li>
 * </ul></dd>
 * </dl>
 * 
 * <dl>
 * <dt>Std Reference Information</dt>
 * <dd><ul>
 * <li>{@code flags.top_field_flag} is used to indicate whether the reference is used as top field reference;</li>
 * <li>{@code flags.bottom_field_flag} is used to indicate whether the reference is used as bottom field reference;</li>
 * <li>{@code flags.used_for_long_term_reference} is used to indicate whether the picture is marked as “used for long-term reference” as defined in section 8.2.5.1 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h264">ITU-T H.264 Specification</a>;</li>
 * <li>{@code flags.is_non_existing} is used to indicate whether the picture is marked as “non-existing” as defined in section 8.2.5.2 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h264">ITU-T H.264 Specification</a>;</li>
 * <li>all other members are interpreted as defined in section 8.2 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h264">ITU-T H.264 Specification</a>.</li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_DPB_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_DPB_SLOT_INFO_KHR}</li>
 * <li>{@code pStdReferenceInfo} <b>must</b> be a valid pointer to a valid {@code StdVideoDecodeH264ReferenceInfo} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoDecodeH264DpbSlotInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link StdVideoDecodeH264ReferenceInfo StdVideoDecodeH264ReferenceInfo} const * {@link #pStdReferenceInfo};
 * }</code></pre>
 */
public class VkVideoDecodeH264DpbSlotInfoKHR extends Struct<VkVideoDecodeH264DpbSlotInfoKHR> implements NativeResource {

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

    protected VkVideoDecodeH264DpbSlotInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoDecodeH264DpbSlotInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoDecodeH264DpbSlotInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoDecodeH264DpbSlotInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeH264DpbSlotInfoKHR(ByteBuffer container) {
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
    /** a pointer to a {@code StdVideoDecodeH264ReferenceInfo} structure specifying <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-reference-info">H.264 reference information</a>. */
    @NativeType("StdVideoDecodeH264ReferenceInfo const *")
    public StdVideoDecodeH264ReferenceInfo pStdReferenceInfo() { return npStdReferenceInfo(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoDecodeH264DpbSlotInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_DPB_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_DPB_SLOT_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoDecodeH264DpbSlotInfoKHR sType$Default() { return sType(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_DPB_SLOT_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoDecodeH264DpbSlotInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoDecodeH264ReferenceInfo} to the {@link #pStdReferenceInfo} field. */
    public VkVideoDecodeH264DpbSlotInfoKHR pStdReferenceInfo(@NativeType("StdVideoDecodeH264ReferenceInfo const *") StdVideoDecodeH264ReferenceInfo value) { npStdReferenceInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeH264DpbSlotInfoKHR set(
        int sType,
        long pNext,
        StdVideoDecodeH264ReferenceInfo pStdReferenceInfo
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
    public VkVideoDecodeH264DpbSlotInfoKHR set(VkVideoDecodeH264DpbSlotInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeH264DpbSlotInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264DpbSlotInfoKHR malloc() {
        return new VkVideoDecodeH264DpbSlotInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeH264DpbSlotInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264DpbSlotInfoKHR calloc() {
        return new VkVideoDecodeH264DpbSlotInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeH264DpbSlotInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeH264DpbSlotInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeH264DpbSlotInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeH264DpbSlotInfoKHR} instance for the specified memory address. */
    public static VkVideoDecodeH264DpbSlotInfoKHR create(long address) {
        return new VkVideoDecodeH264DpbSlotInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH264DpbSlotInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoDecodeH264DpbSlotInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264DpbSlotInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264DpbSlotInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264DpbSlotInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264DpbSlotInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264DpbSlotInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264DpbSlotInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoDecodeH264DpbSlotInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264DpbSlotInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH264DpbSlotInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeH264DpbSlotInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264DpbSlotInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeH264DpbSlotInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoDecodeH264DpbSlotInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264DpbSlotInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeH264DpbSlotInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264DpbSlotInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264DpbSlotInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264DpbSlotInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264DpbSlotInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264DpbSlotInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeH264DpbSlotInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pStdReferenceInfo}. */
    public static StdVideoDecodeH264ReferenceInfo npStdReferenceInfo(long struct) { return StdVideoDecodeH264ReferenceInfo.create(memGetAddress(struct + VkVideoDecodeH264DpbSlotInfoKHR.PSTDREFERENCEINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264DpbSlotInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeH264DpbSlotInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pStdReferenceInfo(StdVideoDecodeH264ReferenceInfo) pStdReferenceInfo}. */
    public static void npStdReferenceInfo(long struct, StdVideoDecodeH264ReferenceInfo value) { memPutAddress(struct + VkVideoDecodeH264DpbSlotInfoKHR.PSTDREFERENCEINFO, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkVideoDecodeH264DpbSlotInfoKHR.PSTDREFERENCEINFO));
    }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeH264DpbSlotInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeH264DpbSlotInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoDecodeH264DpbSlotInfoKHR ELEMENT_FACTORY = VkVideoDecodeH264DpbSlotInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeH264DpbSlotInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeH264DpbSlotInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoDecodeH264DpbSlotInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoDecodeH264DpbSlotInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeH264DpbSlotInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoDecodeH264DpbSlotInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeH264DpbSlotInfoKHR.npNext(address()); }
        /** @return a {@link StdVideoDecodeH264ReferenceInfo} view of the struct pointed to by the {@link VkVideoDecodeH264DpbSlotInfoKHR#pStdReferenceInfo} field. */
        @NativeType("StdVideoDecodeH264ReferenceInfo const *")
        public StdVideoDecodeH264ReferenceInfo pStdReferenceInfo() { return VkVideoDecodeH264DpbSlotInfoKHR.npStdReferenceInfo(address()); }

        /** Sets the specified value to the {@link VkVideoDecodeH264DpbSlotInfoKHR#sType} field. */
        public VkVideoDecodeH264DpbSlotInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeH264DpbSlotInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_DPB_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_DPB_SLOT_INFO_KHR} value to the {@link VkVideoDecodeH264DpbSlotInfoKHR#sType} field. */
        public VkVideoDecodeH264DpbSlotInfoKHR.Buffer sType$Default() { return sType(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_DPB_SLOT_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoDecodeH264DpbSlotInfoKHR#pNext} field. */
        public VkVideoDecodeH264DpbSlotInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeH264DpbSlotInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoDecodeH264ReferenceInfo} to the {@link VkVideoDecodeH264DpbSlotInfoKHR#pStdReferenceInfo} field. */
        public VkVideoDecodeH264DpbSlotInfoKHR.Buffer pStdReferenceInfo(@NativeType("StdVideoDecodeH264ReferenceInfo const *") StdVideoDecodeH264ReferenceInfo value) { VkVideoDecodeH264DpbSlotInfoKHR.npStdReferenceInfo(address(), value); return this; }

    }

}