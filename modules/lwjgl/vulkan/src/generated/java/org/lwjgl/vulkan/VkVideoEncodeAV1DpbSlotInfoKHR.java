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
 * Structure specifies AV1 encode DPB picture information.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure is specified in the {@code pNext} chain of {@link VkVideoEncodeInfoKHR}{@code ::pSetupReferenceSlot}, if not {@code NULL}, and the {@code pNext} chain of the elements of {@link VkVideoEncodeInfoKHR}{@code ::pReferenceSlots} to specify the codec-specific reference picture information for an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1">AV1 encode operation</a>.</p>
 * 
 * <dl>
 * <dt>Active Reference Picture Information</dt>
 * <dd><ul>
 * <li>The image subregion used is determined according to the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-picture-data-access">AV1 Encode Picture Data Access</a> section.</li>
 * <li>The reference picture is associated with the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dpb-slot">DPB slot</a> index specified in the {@code slotIndex} member of the corresponding element of {@link VkVideoEncodeInfoKHR}{@code ::pReferenceSlots}.</li>
 * <li>The reference picture is associated with the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-reference-info">AV1 reference information</a> provided in {@code pStdReferenceInfo}.</li>
 * </ul></dd>
 * </dl>
 * 
 * <dl>
 * <dt>Reconstructed Picture Information</dt>
 * <dd><ul>
 * <li>The image subregion used is determined according to the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-picture-data-access">AV1 Encode Picture Data Access</a> section.</li>
 * <li>If <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-ref-pic-setup">reference picture setup</a> is requested, then the reconstructed picture is used to <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dpb-slot-states">activate</a> the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#dpb-slot">DPB slot</a> with the index specified in {@link VkVideoEncodeInfoKHR}{@code ::pSetupReferenceSlot→slotIndex}.</li>
 * <li>The reconstructed picture is associated with the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-reference-info">AV1 reference information</a> provided in {@code pStdReferenceInfo}.</li>
 * </ul></dd>
 * </dl>
 * 
 * <dl>
 * <dt>Std Reference Information</dt>
 * <dd><ul>
 * <li>{@code flags.reserved} and {@code reserved1} are used only for padding purposes and are otherwise ignored;</li>
 * <li>{@code flags.disable_frame_end_update_cdf} is interpreted as defined in section 6.8.2 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>{@code flags.segmentation_enabled} is interpreted as defined in section 6.8.13 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>{@code RefFrameId} is interpreted as the element of the {@code RefFrameId} array defined in section 6.8.2 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a> corresponding to the reference frame;</li>
 * <li>{@code frame_type} is interpreted as defined in section 6.8.2 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>{@code OrderHint} is interpreted as defined in section 6.8.2 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>;</li>
 * <li>{@code pExtensionHeader} is {@code NULL} or a pointer to a {@code StdVideoEncodeAV1ExtensionHeader} structure whose {@code temporal_id} and {@code spatial_id} members specify the temporal and spatial layer ID of the reference frame, respectively.</li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_DPB_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_DPB_SLOT_INFO_KHR}</li>
 * <li>{@code pStdReferenceInfo} <b>must</b> be a valid pointer to a valid {@code StdVideoEncodeAV1ReferenceInfo} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeAV1DpbSlotInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link StdVideoEncodeAV1ReferenceInfo StdVideoEncodeAV1ReferenceInfo} const * {@link #pStdReferenceInfo};
 * }</code></pre>
 */
public class VkVideoEncodeAV1DpbSlotInfoKHR extends Struct<VkVideoEncodeAV1DpbSlotInfoKHR> implements NativeResource {

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

    protected VkVideoEncodeAV1DpbSlotInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeAV1DpbSlotInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeAV1DpbSlotInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeAV1DpbSlotInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeAV1DpbSlotInfoKHR(ByteBuffer container) {
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
    /** a pointer to a {@code StdVideoEncodeAV1ReferenceInfo} structure specifying <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-reference-info">AV1 reference information</a>. */
    @NativeType("StdVideoEncodeAV1ReferenceInfo const *")
    public StdVideoEncodeAV1ReferenceInfo pStdReferenceInfo() { return npStdReferenceInfo(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeAV1DpbSlotInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_DPB_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_DPB_SLOT_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeAV1DpbSlotInfoKHR sType$Default() { return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_DPB_SLOT_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeAV1DpbSlotInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeAV1ReferenceInfo} to the {@link #pStdReferenceInfo} field. */
    public VkVideoEncodeAV1DpbSlotInfoKHR pStdReferenceInfo(@NativeType("StdVideoEncodeAV1ReferenceInfo const *") StdVideoEncodeAV1ReferenceInfo value) { npStdReferenceInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeAV1DpbSlotInfoKHR set(
        int sType,
        long pNext,
        StdVideoEncodeAV1ReferenceInfo pStdReferenceInfo
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
    public VkVideoEncodeAV1DpbSlotInfoKHR set(VkVideoEncodeAV1DpbSlotInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeAV1DpbSlotInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1DpbSlotInfoKHR malloc() {
        return new VkVideoEncodeAV1DpbSlotInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1DpbSlotInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1DpbSlotInfoKHR calloc() {
        return new VkVideoEncodeAV1DpbSlotInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1DpbSlotInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeAV1DpbSlotInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1DpbSlotInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeAV1DpbSlotInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeAV1DpbSlotInfoKHR create(long address) {
        return new VkVideoEncodeAV1DpbSlotInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeAV1DpbSlotInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeAV1DpbSlotInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1DpbSlotInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1DpbSlotInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1DpbSlotInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1DpbSlotInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1DpbSlotInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1DpbSlotInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeAV1DpbSlotInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1DpbSlotInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeAV1DpbSlotInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1DpbSlotInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1DpbSlotInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1DpbSlotInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1DpbSlotInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1DpbSlotInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1DpbSlotInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1DpbSlotInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1DpbSlotInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1DpbSlotInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1DpbSlotInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeAV1DpbSlotInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeAV1DpbSlotInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pStdReferenceInfo}. */
    public static StdVideoEncodeAV1ReferenceInfo npStdReferenceInfo(long struct) { return StdVideoEncodeAV1ReferenceInfo.create(memGetAddress(struct + VkVideoEncodeAV1DpbSlotInfoKHR.PSTDREFERENCEINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1DpbSlotInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeAV1DpbSlotInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pStdReferenceInfo(StdVideoEncodeAV1ReferenceInfo) pStdReferenceInfo}. */
    public static void npStdReferenceInfo(long struct, StdVideoEncodeAV1ReferenceInfo value) { memPutAddress(struct + VkVideoEncodeAV1DpbSlotInfoKHR.PSTDREFERENCEINFO, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pStdReferenceInfo = memGetAddress(struct + VkVideoEncodeAV1DpbSlotInfoKHR.PSTDREFERENCEINFO);
        check(pStdReferenceInfo);
        StdVideoEncodeAV1ReferenceInfo.validate(pStdReferenceInfo);
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeAV1DpbSlotInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1DpbSlotInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeAV1DpbSlotInfoKHR ELEMENT_FACTORY = VkVideoEncodeAV1DpbSlotInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeAV1DpbSlotInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeAV1DpbSlotInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeAV1DpbSlotInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeAV1DpbSlotInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeAV1DpbSlotInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeAV1DpbSlotInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeAV1DpbSlotInfoKHR.npNext(address()); }
        /** @return a {@link StdVideoEncodeAV1ReferenceInfo} view of the struct pointed to by the {@link VkVideoEncodeAV1DpbSlotInfoKHR#pStdReferenceInfo} field. */
        @NativeType("StdVideoEncodeAV1ReferenceInfo const *")
        public StdVideoEncodeAV1ReferenceInfo pStdReferenceInfo() { return VkVideoEncodeAV1DpbSlotInfoKHR.npStdReferenceInfo(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeAV1DpbSlotInfoKHR#sType} field. */
        public VkVideoEncodeAV1DpbSlotInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeAV1DpbSlotInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_DPB_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_DPB_SLOT_INFO_KHR} value to the {@link VkVideoEncodeAV1DpbSlotInfoKHR#sType} field. */
        public VkVideoEncodeAV1DpbSlotInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_DPB_SLOT_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeAV1DpbSlotInfoKHR#pNext} field. */
        public VkVideoEncodeAV1DpbSlotInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeAV1DpbSlotInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeAV1ReferenceInfo} to the {@link VkVideoEncodeAV1DpbSlotInfoKHR#pStdReferenceInfo} field. */
        public VkVideoEncodeAV1DpbSlotInfoKHR.Buffer pStdReferenceInfo(@NativeType("StdVideoEncodeAV1ReferenceInfo const *") StdVideoEncodeAV1ReferenceInfo value) { VkVideoEncodeAV1DpbSlotInfoKHR.npStdReferenceInfo(address(), value); return this; }

    }

}