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
 * Structure specifies H.264 encode DPB picture information.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure is specified in the {@code pNext} chain of {@link VkVideoEncodeInfoKHR}{@code ::pSetupReferenceSlot}, if not {@code NULL}, and the {@code pNext} chain of the elements of {@link VkVideoEncodeInfoKHR}{@code ::pReferenceSlots} to specify the codec-specific reference picture information for an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h264">H.264 encode operation</a>.</p>
 * 
 * <dl>
 * <dt>Active Reference Picture Information</dt>
 * <dd><ul>
 * <li>The image subregion used is determined according to the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h264-picture-data-access">H.264 Encode Picture Data Access</a> section.</li>
 * <li>The reference picture is associated with the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slot</a> index specified in the {@code slotIndex} member of the corresponding element of {@link VkVideoEncodeInfoKHR}{@code ::pReferenceSlots}.</li>
 * <li>The reference picture is associated with the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h264-reference-info">H.264 reference information</a> provided in {@code pStdReferenceInfo}.</li>
 * </ul></dd>
 * </dl>
 * 
 * <dl>
 * <dt>Reconstructed Picture Information</dt>
 * <dd><ul>
 * <li>The image subregion used is determined according to the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h264-picture-data-access">H.264 Encode Picture Data Access</a> section.</li>
 * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h264-ref-pic-setup">reference picture setup</a> is requested, then the reconstructed picture is used to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot-states">activate</a> the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slot</a> with the index specified in {@link VkVideoEncodeInfoKHR}{@code ::pSetupReferenceSlot→slotIndex}.</li>
 * <li>The reconstructed picture is associated with the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h264-reference-info">H.264 reference information</a> provided in {@code pStdReferenceInfo}.</li>
 * </ul></dd>
 * </dl>
 * 
 * <dl>
 * <dt>Std Reference Information</dt>
 * <dd><ul>
 * <li>{@code flags.reserved} is used only for padding purposes and is otherwise ignored;</li>
 * <li>{@code flags.used_for_long_term_reference} is used to indicate whether the picture is marked as “used for long-term reference” as defined in section 8.2.5.1 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h264">ITU-T H.264 Specification</a>;</li>
 * <li>{@code primary_pic_type} as defined in section 7.4.2 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h264">ITU-T H.264 Specification</a>;</li>
 * <li>{@code long_term_pic_num} and {@code long_term_frame_idx} as defined in section 7.4.3 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h264">ITU-T H.264 Specification</a>;</li>
 * <li>{@code temporal_id} as defined in section G.7.4.1.1 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h264">ITU-T H.264 Specification</a>;</li>
 * <li>all other members are interpreted as defined in section 8.2 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h264">ITU-T H.264 Specification</a>.</li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_DPB_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_DPB_SLOT_INFO_KHR}</li>
 * <li>{@code pStdReferenceInfo} <b>must</b> be a valid pointer to a valid {@code StdVideoEncodeH264ReferenceInfo} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH264DpbSlotInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link StdVideoEncodeH264ReferenceInfo StdVideoEncodeH264ReferenceInfo} const * {@link #pStdReferenceInfo};
 * }</code></pre>
 */
public class VkVideoEncodeH264DpbSlotInfoKHR extends Struct<VkVideoEncodeH264DpbSlotInfoKHR> implements NativeResource {

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

    protected VkVideoEncodeH264DpbSlotInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH264DpbSlotInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264DpbSlotInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH264DpbSlotInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264DpbSlotInfoKHR(ByteBuffer container) {
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
    /** a pointer to a {@code StdVideoEncodeH264ReferenceInfo} structure specifying <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h264-reference-info">H.264 reference information</a>. */
    @NativeType("StdVideoEncodeH264ReferenceInfo const *")
    public StdVideoEncodeH264ReferenceInfo pStdReferenceInfo() { return npStdReferenceInfo(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH264DpbSlotInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_DPB_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_DPB_SLOT_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeH264DpbSlotInfoKHR sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_DPB_SLOT_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH264DpbSlotInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264ReferenceInfo} to the {@link #pStdReferenceInfo} field. */
    public VkVideoEncodeH264DpbSlotInfoKHR pStdReferenceInfo(@NativeType("StdVideoEncodeH264ReferenceInfo const *") StdVideoEncodeH264ReferenceInfo value) { npStdReferenceInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264DpbSlotInfoKHR set(
        int sType,
        long pNext,
        StdVideoEncodeH264ReferenceInfo pStdReferenceInfo
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
    public VkVideoEncodeH264DpbSlotInfoKHR set(VkVideoEncodeH264DpbSlotInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264DpbSlotInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264DpbSlotInfoKHR malloc() {
        return new VkVideoEncodeH264DpbSlotInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264DpbSlotInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264DpbSlotInfoKHR calloc() {
        return new VkVideoEncodeH264DpbSlotInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264DpbSlotInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264DpbSlotInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264DpbSlotInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264DpbSlotInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeH264DpbSlotInfoKHR create(long address) {
        return new VkVideoEncodeH264DpbSlotInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264DpbSlotInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH264DpbSlotInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264DpbSlotInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264DpbSlotInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264DpbSlotInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264DpbSlotInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264DpbSlotInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264DpbSlotInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH264DpbSlotInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264DpbSlotInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264DpbSlotInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264DpbSlotInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264DpbSlotInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH264DpbSlotInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264DpbSlotInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264DpbSlotInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH264DpbSlotInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264DpbSlotInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264DpbSlotInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264DpbSlotInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264DpbSlotInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264DpbSlotInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264DpbSlotInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pStdReferenceInfo}. */
    public static StdVideoEncodeH264ReferenceInfo npStdReferenceInfo(long struct) { return StdVideoEncodeH264ReferenceInfo.create(memGetAddress(struct + VkVideoEncodeH264DpbSlotInfoKHR.PSTDREFERENCEINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264DpbSlotInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264DpbSlotInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pStdReferenceInfo(StdVideoEncodeH264ReferenceInfo) pStdReferenceInfo}. */
    public static void npStdReferenceInfo(long struct, StdVideoEncodeH264ReferenceInfo value) { memPutAddress(struct + VkVideoEncodeH264DpbSlotInfoKHR.PSTDREFERENCEINFO, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkVideoEncodeH264DpbSlotInfoKHR.PSTDREFERENCEINFO));
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264DpbSlotInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264DpbSlotInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264DpbSlotInfoKHR ELEMENT_FACTORY = VkVideoEncodeH264DpbSlotInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264DpbSlotInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264DpbSlotInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH264DpbSlotInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH264DpbSlotInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264DpbSlotInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH264DpbSlotInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264DpbSlotInfoKHR.npNext(address()); }
        /** @return a {@link StdVideoEncodeH264ReferenceInfo} view of the struct pointed to by the {@link VkVideoEncodeH264DpbSlotInfoKHR#pStdReferenceInfo} field. */
        @NativeType("StdVideoEncodeH264ReferenceInfo const *")
        public StdVideoEncodeH264ReferenceInfo pStdReferenceInfo() { return VkVideoEncodeH264DpbSlotInfoKHR.npStdReferenceInfo(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH264DpbSlotInfoKHR#sType} field. */
        public VkVideoEncodeH264DpbSlotInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264DpbSlotInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_DPB_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_DPB_SLOT_INFO_KHR} value to the {@link VkVideoEncodeH264DpbSlotInfoKHR#sType} field. */
        public VkVideoEncodeH264DpbSlotInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_DPB_SLOT_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeH264DpbSlotInfoKHR#pNext} field. */
        public VkVideoEncodeH264DpbSlotInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264DpbSlotInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264ReferenceInfo} to the {@link VkVideoEncodeH264DpbSlotInfoKHR#pStdReferenceInfo} field. */
        public VkVideoEncodeH264DpbSlotInfoKHR.Buffer pStdReferenceInfo(@NativeType("StdVideoEncodeH264ReferenceInfo const *") StdVideoEncodeH264ReferenceInfo value) { VkVideoEncodeH264DpbSlotInfoKHR.npStdReferenceInfo(address(), value); return this; }

    }

}