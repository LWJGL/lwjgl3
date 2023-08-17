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
 * Structure specifies H.265 DPB information when decoding a frame.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure is specified in the {@code pNext} chain of {@link VkVideoDecodeInfoKHR}{@code ::pSetupReferenceSlot}, if not {@code NULL}, and the {@code pNext} chain of the elements of {@link VkVideoDecodeInfoKHR}{@code ::pReferenceSlots} to specify the codec-specific reference picture information for an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h265">H.265 decode operation</a>.</p>
 * 
 * <dl>
 * <dt>Active Reference Picture Information</dt>
 * <dd><ul>
 * <li>The image subregion used is determined according to the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h265-picture-data-access">H.265 Decode Picture Data Access</a> section.</li>
 * <li>The reference picture is associated with the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slot</a> index specified in the {@code slotIndex} member of the corresponding element of {@link VkVideoDecodeInfoKHR}{@code ::pReferenceSlots}.</li>
 * <li>The reference picture is associated with the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h265-reference-info">H.265 reference information</a> provided in {@code pStdReferenceInfo}.</li>
 * </ul></dd>
 * </dl>
 * 
 * <dl>
 * <dt>Reconstructed Picture Information</dt>
 * <dd><ul>
 * <li>The image subregion used is determined according to the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h265-picture-data-access">H.265 Decode Picture Data Access</a> section.</li>
 * <li>The reconstructed picture is used to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot-states">activate</a> the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slot</a> with the index specified in {@link VkVideoDecodeInfoKHR}{@code ::pSetupReferenceSlot→slotIndex}.</li>
 * <li>The reconstructed picture is associated with the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h265-reference-info">H.265 reference information</a> provided in {@code pStdReferenceInfo}.</li>
 * </ul></dd>
 * </dl>
 * 
 * <dl>
 * <dt>Std Reference Information</dt>
 * <dd><ul>
 * <li>{@code flags.used_for_long_term_reference} is used to indicate whether the picture is marked as “used for long-term reference” as defined in section 8.3.2 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>;</li>
 * <li>{@code flags.unused_for_reference} is used to indicate whether the picture is marked as “unused for reference” as defined in section 8.3.2 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>;</li>
 * <li>all other members are interpreted as defined in section 8.3 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>.</li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoDecodeH265#VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_DPB_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H265_DPB_SLOT_INFO_KHR}</li>
 * <li>{@code pStdReferenceInfo} <b>must</b> be a valid pointer to a valid {@code StdVideoDecodeH265ReferenceInfo} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoDecodeH265DpbSlotInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link StdVideoDecodeH265ReferenceInfo StdVideoDecodeH265ReferenceInfo} const * {@link #pStdReferenceInfo};
 * }</code></pre>
 */
public class VkVideoDecodeH265DpbSlotInfoKHR extends Struct<VkVideoDecodeH265DpbSlotInfoKHR> implements NativeResource {

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

    protected VkVideoDecodeH265DpbSlotInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoDecodeH265DpbSlotInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoDecodeH265DpbSlotInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoDecodeH265DpbSlotInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeH265DpbSlotInfoKHR(ByteBuffer container) {
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
    /** a pointer to a {@code StdVideoDecodeH265ReferenceInfo} structure specifying reference picture information described in section 8.3 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>. */
    @NativeType("StdVideoDecodeH265ReferenceInfo const *")
    public StdVideoDecodeH265ReferenceInfo pStdReferenceInfo() { return npStdReferenceInfo(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoDecodeH265DpbSlotInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoDecodeH265#VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_DPB_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H265_DPB_SLOT_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoDecodeH265DpbSlotInfoKHR sType$Default() { return sType(KHRVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_DPB_SLOT_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoDecodeH265DpbSlotInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoDecodeH265ReferenceInfo} to the {@link #pStdReferenceInfo} field. */
    public VkVideoDecodeH265DpbSlotInfoKHR pStdReferenceInfo(@NativeType("StdVideoDecodeH265ReferenceInfo const *") StdVideoDecodeH265ReferenceInfo value) { npStdReferenceInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeH265DpbSlotInfoKHR set(
        int sType,
        long pNext,
        StdVideoDecodeH265ReferenceInfo pStdReferenceInfo
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
    public VkVideoDecodeH265DpbSlotInfoKHR set(VkVideoDecodeH265DpbSlotInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeH265DpbSlotInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH265DpbSlotInfoKHR malloc() {
        return new VkVideoDecodeH265DpbSlotInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeH265DpbSlotInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH265DpbSlotInfoKHR calloc() {
        return new VkVideoDecodeH265DpbSlotInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeH265DpbSlotInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeH265DpbSlotInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeH265DpbSlotInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeH265DpbSlotInfoKHR} instance for the specified memory address. */
    public static VkVideoDecodeH265DpbSlotInfoKHR create(long address) {
        return new VkVideoDecodeH265DpbSlotInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH265DpbSlotInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoDecodeH265DpbSlotInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265DpbSlotInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265DpbSlotInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265DpbSlotInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265DpbSlotInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265DpbSlotInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265DpbSlotInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoDecodeH265DpbSlotInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265DpbSlotInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH265DpbSlotInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeH265DpbSlotInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH265DpbSlotInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeH265DpbSlotInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoDecodeH265DpbSlotInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH265DpbSlotInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeH265DpbSlotInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265DpbSlotInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265DpbSlotInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265DpbSlotInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265DpbSlotInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH265DpbSlotInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeH265DpbSlotInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pStdReferenceInfo}. */
    public static StdVideoDecodeH265ReferenceInfo npStdReferenceInfo(long struct) { return StdVideoDecodeH265ReferenceInfo.create(memGetAddress(struct + VkVideoDecodeH265DpbSlotInfoKHR.PSTDREFERENCEINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH265DpbSlotInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeH265DpbSlotInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pStdReferenceInfo(StdVideoDecodeH265ReferenceInfo) pStdReferenceInfo}. */
    public static void npStdReferenceInfo(long struct, StdVideoDecodeH265ReferenceInfo value) { memPutAddress(struct + VkVideoDecodeH265DpbSlotInfoKHR.PSTDREFERENCEINFO, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkVideoDecodeH265DpbSlotInfoKHR.PSTDREFERENCEINFO));
    }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeH265DpbSlotInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeH265DpbSlotInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoDecodeH265DpbSlotInfoKHR ELEMENT_FACTORY = VkVideoDecodeH265DpbSlotInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeH265DpbSlotInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeH265DpbSlotInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoDecodeH265DpbSlotInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoDecodeH265DpbSlotInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeH265DpbSlotInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoDecodeH265DpbSlotInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeH265DpbSlotInfoKHR.npNext(address()); }
        /** @return a {@link StdVideoDecodeH265ReferenceInfo} view of the struct pointed to by the {@link VkVideoDecodeH265DpbSlotInfoKHR#pStdReferenceInfo} field. */
        @NativeType("StdVideoDecodeH265ReferenceInfo const *")
        public StdVideoDecodeH265ReferenceInfo pStdReferenceInfo() { return VkVideoDecodeH265DpbSlotInfoKHR.npStdReferenceInfo(address()); }

        /** Sets the specified value to the {@link VkVideoDecodeH265DpbSlotInfoKHR#sType} field. */
        public VkVideoDecodeH265DpbSlotInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeH265DpbSlotInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoDecodeH265#VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_DPB_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H265_DPB_SLOT_INFO_KHR} value to the {@link VkVideoDecodeH265DpbSlotInfoKHR#sType} field. */
        public VkVideoDecodeH265DpbSlotInfoKHR.Buffer sType$Default() { return sType(KHRVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_DPB_SLOT_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoDecodeH265DpbSlotInfoKHR#pNext} field. */
        public VkVideoDecodeH265DpbSlotInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeH265DpbSlotInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoDecodeH265ReferenceInfo} to the {@link VkVideoDecodeH265DpbSlotInfoKHR#pStdReferenceInfo} field. */
        public VkVideoDecodeH265DpbSlotInfoKHR.Buffer pStdReferenceInfo(@NativeType("StdVideoDecodeH265ReferenceInfo const *") StdVideoDecodeH265ReferenceInfo value) { VkVideoDecodeH265DpbSlotInfoKHR.npStdReferenceInfo(address(), value); return this; }

    }

}