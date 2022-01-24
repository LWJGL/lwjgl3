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
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_DPB_SLOT_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_DPB_SLOT_INFO_EXT}</li>
 * <li>{@code pStdReferenceInfo} <b>must</b> be a valid pointer to a valid {@code StdVideoDecodeH264ReferenceInfo} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoDecodeH264DpbSlotInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * pNext;
 *     {@link StdVideoDecodeH264ReferenceInfo StdVideoDecodeH264ReferenceInfo} const * {@link #pStdReferenceInfo};
 * }</code></pre>
 */
public class VkVideoDecodeH264DpbSlotInfoEXT extends Struct implements NativeResource {

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

    /**
     * Creates a {@code VkVideoDecodeH264DpbSlotInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeH264DpbSlotInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a pointer to a {@code StdVideoDecodeH264ReferenceInfo} structure specifying the codec standard specific picture reference information from the H.264 specification. */
    @NativeType("StdVideoDecodeH264ReferenceInfo const *")
    public StdVideoDecodeH264ReferenceInfo pStdReferenceInfo() { return npStdReferenceInfo(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoDecodeH264DpbSlotInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_DPB_SLOT_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_DPB_SLOT_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoDecodeH264DpbSlotInfoEXT sType$Default() { return sType(EXTVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_DPB_SLOT_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoDecodeH264DpbSlotInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoDecodeH264ReferenceInfo} to the {@link #pStdReferenceInfo} field. */
    public VkVideoDecodeH264DpbSlotInfoEXT pStdReferenceInfo(@NativeType("StdVideoDecodeH264ReferenceInfo const *") StdVideoDecodeH264ReferenceInfo value) { npStdReferenceInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeH264DpbSlotInfoEXT set(
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
    public VkVideoDecodeH264DpbSlotInfoEXT set(VkVideoDecodeH264DpbSlotInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeH264DpbSlotInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264DpbSlotInfoEXT malloc() {
        return wrap(VkVideoDecodeH264DpbSlotInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeH264DpbSlotInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264DpbSlotInfoEXT calloc() {
        return wrap(VkVideoDecodeH264DpbSlotInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeH264DpbSlotInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeH264DpbSlotInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoDecodeH264DpbSlotInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeH264DpbSlotInfoEXT} instance for the specified memory address. */
    public static VkVideoDecodeH264DpbSlotInfoEXT create(long address) {
        return wrap(VkVideoDecodeH264DpbSlotInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH264DpbSlotInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoDecodeH264DpbSlotInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264DpbSlotInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264DpbSlotInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264DpbSlotInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264DpbSlotInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264DpbSlotInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264DpbSlotInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoDecodeH264DpbSlotInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264DpbSlotInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH264DpbSlotInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeH264DpbSlotInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264DpbSlotInfoEXT malloc(MemoryStack stack) {
        return wrap(VkVideoDecodeH264DpbSlotInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoDecodeH264DpbSlotInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264DpbSlotInfoEXT calloc(MemoryStack stack) {
        return wrap(VkVideoDecodeH264DpbSlotInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoDecodeH264DpbSlotInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264DpbSlotInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264DpbSlotInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264DpbSlotInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264DpbSlotInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeH264DpbSlotInfoEXT.PNEXT); }
    /** Unsafe version of {@link #pStdReferenceInfo}. */
    public static StdVideoDecodeH264ReferenceInfo npStdReferenceInfo(long struct) { return StdVideoDecodeH264ReferenceInfo.create(memGetAddress(struct + VkVideoDecodeH264DpbSlotInfoEXT.PSTDREFERENCEINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264DpbSlotInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeH264DpbSlotInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #pStdReferenceInfo(StdVideoDecodeH264ReferenceInfo) pStdReferenceInfo}. */
    public static void npStdReferenceInfo(long struct, StdVideoDecodeH264ReferenceInfo value) { memPutAddress(struct + VkVideoDecodeH264DpbSlotInfoEXT.PSTDREFERENCEINFO, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkVideoDecodeH264DpbSlotInfoEXT.PSTDREFERENCEINFO));
    }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeH264DpbSlotInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeH264DpbSlotInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoDecodeH264DpbSlotInfoEXT ELEMENT_FACTORY = VkVideoDecodeH264DpbSlotInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeH264DpbSlotInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeH264DpbSlotInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoDecodeH264DpbSlotInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoDecodeH264DpbSlotInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeH264DpbSlotInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeH264DpbSlotInfoEXT.npNext(address()); }
        /** @return a {@link StdVideoDecodeH264ReferenceInfo} view of the struct pointed to by the {@link VkVideoDecodeH264DpbSlotInfoEXT#pStdReferenceInfo} field. */
        @NativeType("StdVideoDecodeH264ReferenceInfo const *")
        public StdVideoDecodeH264ReferenceInfo pStdReferenceInfo() { return VkVideoDecodeH264DpbSlotInfoEXT.npStdReferenceInfo(address()); }

        /** Sets the specified value to the {@link VkVideoDecodeH264DpbSlotInfoEXT#sType} field. */
        public VkVideoDecodeH264DpbSlotInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeH264DpbSlotInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_DPB_SLOT_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_DPB_SLOT_INFO_EXT} value to the {@link VkVideoDecodeH264DpbSlotInfoEXT#sType} field. */
        public VkVideoDecodeH264DpbSlotInfoEXT.Buffer sType$Default() { return sType(EXTVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_DPB_SLOT_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoDecodeH264DpbSlotInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeH264DpbSlotInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoDecodeH264ReferenceInfo} to the {@link VkVideoDecodeH264DpbSlotInfoEXT#pStdReferenceInfo} field. */
        public VkVideoDecodeH264DpbSlotInfoEXT.Buffer pStdReferenceInfo(@NativeType("StdVideoDecodeH264ReferenceInfo const *") StdVideoDecodeH264ReferenceInfo value) { VkVideoDecodeH264DpbSlotInfoEXT.npStdReferenceInfo(address(), value); return this; }

    }

}