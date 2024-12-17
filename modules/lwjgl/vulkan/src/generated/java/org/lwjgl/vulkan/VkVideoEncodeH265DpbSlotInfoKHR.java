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
 * <pre>{@code
 * struct VkVideoEncodeH265DpbSlotInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link StdVideoEncodeH265ReferenceInfo StdVideoEncodeH265ReferenceInfo} const * pStdReferenceInfo;
 * }}</pre>
 */
public class VkVideoEncodeH265DpbSlotInfoKHR extends Struct<VkVideoEncodeH265DpbSlotInfoKHR> implements NativeResource {

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

    protected VkVideoEncodeH265DpbSlotInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265DpbSlotInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265DpbSlotInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265DpbSlotInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265DpbSlotInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return a {@link StdVideoEncodeH265ReferenceInfo} view of the struct pointed to by the {@code pStdReferenceInfo} field. */
    @NativeType("StdVideoEncodeH265ReferenceInfo const *")
    public StdVideoEncodeH265ReferenceInfo pStdReferenceInfo() { return npStdReferenceInfo(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeH265DpbSlotInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_DPB_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_DPB_SLOT_INFO_KHR} value to the {@code sType} field. */
    public VkVideoEncodeH265DpbSlotInfoKHR sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_DPB_SLOT_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeH265DpbSlotInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH265ReferenceInfo} to the {@code pStdReferenceInfo} field. */
    public VkVideoEncodeH265DpbSlotInfoKHR pStdReferenceInfo(@NativeType("StdVideoEncodeH265ReferenceInfo const *") StdVideoEncodeH265ReferenceInfo value) { npStdReferenceInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265DpbSlotInfoKHR set(
        int sType,
        long pNext,
        StdVideoEncodeH265ReferenceInfo pStdReferenceInfo
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
    public VkVideoEncodeH265DpbSlotInfoKHR set(VkVideoEncodeH265DpbSlotInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265DpbSlotInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265DpbSlotInfoKHR malloc() {
        return new VkVideoEncodeH265DpbSlotInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265DpbSlotInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265DpbSlotInfoKHR calloc() {
        return new VkVideoEncodeH265DpbSlotInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265DpbSlotInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265DpbSlotInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265DpbSlotInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265DpbSlotInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeH265DpbSlotInfoKHR create(long address) {
        return new VkVideoEncodeH265DpbSlotInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH265DpbSlotInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265DpbSlotInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265DpbSlotInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265DpbSlotInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265DpbSlotInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265DpbSlotInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265DpbSlotInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265DpbSlotInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265DpbSlotInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265DpbSlotInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH265DpbSlotInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265DpbSlotInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265DpbSlotInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265DpbSlotInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265DpbSlotInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265DpbSlotInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265DpbSlotInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265DpbSlotInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265DpbSlotInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265DpbSlotInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265DpbSlotInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeH265DpbSlotInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265DpbSlotInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pStdReferenceInfo}. */
    public static StdVideoEncodeH265ReferenceInfo npStdReferenceInfo(long struct) { return StdVideoEncodeH265ReferenceInfo.create(memGetAddress(struct + VkVideoEncodeH265DpbSlotInfoKHR.PSTDREFERENCEINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeH265DpbSlotInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265DpbSlotInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pStdReferenceInfo(StdVideoEncodeH265ReferenceInfo) pStdReferenceInfo}. */
    public static void npStdReferenceInfo(long struct, StdVideoEncodeH265ReferenceInfo value) { memPutAddress(struct + VkVideoEncodeH265DpbSlotInfoKHR.PSTDREFERENCEINFO, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkVideoEncodeH265DpbSlotInfoKHR.PSTDREFERENCEINFO));
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265DpbSlotInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265DpbSlotInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265DpbSlotInfoKHR ELEMENT_FACTORY = VkVideoEncodeH265DpbSlotInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265DpbSlotInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265DpbSlotInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH265DpbSlotInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265DpbSlotInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265DpbSlotInfoKHR.npNext(address()); }
        /** @return a {@link StdVideoEncodeH265ReferenceInfo} view of the struct pointed to by the {@code pStdReferenceInfo} field. */
        @NativeType("StdVideoEncodeH265ReferenceInfo const *")
        public StdVideoEncodeH265ReferenceInfo pStdReferenceInfo() { return VkVideoEncodeH265DpbSlotInfoKHR.npStdReferenceInfo(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeH265DpbSlotInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265DpbSlotInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_DPB_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_DPB_SLOT_INFO_KHR} value to the {@code sType} field. */
        public VkVideoEncodeH265DpbSlotInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_DPB_SLOT_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeH265DpbSlotInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265DpbSlotInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH265ReferenceInfo} to the {@code pStdReferenceInfo} field. */
        public VkVideoEncodeH265DpbSlotInfoKHR.Buffer pStdReferenceInfo(@NativeType("StdVideoEncodeH265ReferenceInfo const *") StdVideoEncodeH265ReferenceInfo value) { VkVideoEncodeH265DpbSlotInfoKHR.npStdReferenceInfo(address(), value); return this; }

    }

}