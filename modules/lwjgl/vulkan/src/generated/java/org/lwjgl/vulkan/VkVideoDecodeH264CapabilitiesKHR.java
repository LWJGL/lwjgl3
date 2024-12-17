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
 * <pre>{@code
 * struct VkVideoDecodeH264CapabilitiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     StdVideoH264LevelIdc maxLevelIdc;
 *     {@link VkOffset2D VkOffset2D} fieldOffsetGranularity;
 * }}</pre>
 */
public class VkVideoDecodeH264CapabilitiesKHR extends Struct<VkVideoDecodeH264CapabilitiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXLEVELIDC,
        FIELDOFFSETGRANULARITY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXLEVELIDC = layout.offsetof(2);
        FIELDOFFSETGRANULARITY = layout.offsetof(3);
    }

    protected VkVideoDecodeH264CapabilitiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoDecodeH264CapabilitiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoDecodeH264CapabilitiesKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoDecodeH264CapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeH264CapabilitiesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code maxLevelIdc} field. */
    @NativeType("StdVideoH264LevelIdc")
    public int maxLevelIdc() { return nmaxLevelIdc(address()); }
    /** @return a {@link VkOffset2D} view of the {@code fieldOffsetGranularity} field. */
    public VkOffset2D fieldOffsetGranularity() { return nfieldOffsetGranularity(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoDecodeH264CapabilitiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_KHR} value to the {@code sType} field. */
    public VkVideoDecodeH264CapabilitiesKHR sType$Default() { return sType(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoDecodeH264CapabilitiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeH264CapabilitiesKHR set(
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
    public VkVideoDecodeH264CapabilitiesKHR set(VkVideoDecodeH264CapabilitiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeH264CapabilitiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264CapabilitiesKHR malloc() {
        return new VkVideoDecodeH264CapabilitiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeH264CapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264CapabilitiesKHR calloc() {
        return new VkVideoDecodeH264CapabilitiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeH264CapabilitiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeH264CapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeH264CapabilitiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeH264CapabilitiesKHR} instance for the specified memory address. */
    public static VkVideoDecodeH264CapabilitiesKHR create(long address) {
        return new VkVideoDecodeH264CapabilitiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoDecodeH264CapabilitiesKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoDecodeH264CapabilitiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264CapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264CapabilitiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264CapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264CapabilitiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264CapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264CapabilitiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoDecodeH264CapabilitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264CapabilitiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoDecodeH264CapabilitiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeH264CapabilitiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264CapabilitiesKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeH264CapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoDecodeH264CapabilitiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264CapabilitiesKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeH264CapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264CapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264CapabilitiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264CapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264CapabilitiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoDecodeH264CapabilitiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeH264CapabilitiesKHR.PNEXT); }
    /** Unsafe version of {@link #maxLevelIdc}. */
    public static int nmaxLevelIdc(long struct) { return memGetInt(struct + VkVideoDecodeH264CapabilitiesKHR.MAXLEVELIDC); }
    /** Unsafe version of {@link #fieldOffsetGranularity}. */
    public static VkOffset2D nfieldOffsetGranularity(long struct) { return VkOffset2D.create(struct + VkVideoDecodeH264CapabilitiesKHR.FIELDOFFSETGRANULARITY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoDecodeH264CapabilitiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeH264CapabilitiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeH264CapabilitiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeH264CapabilitiesKHR, Buffer> implements NativeResource {

        private static final VkVideoDecodeH264CapabilitiesKHR ELEMENT_FACTORY = VkVideoDecodeH264CapabilitiesKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeH264CapabilitiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeH264CapabilitiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoDecodeH264CapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeH264CapabilitiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoDecodeH264CapabilitiesKHR.npNext(address()); }
        /** @return the value of the {@code maxLevelIdc} field. */
        @NativeType("StdVideoH264LevelIdc")
        public int maxLevelIdc() { return VkVideoDecodeH264CapabilitiesKHR.nmaxLevelIdc(address()); }
        /** @return a {@link VkOffset2D} view of the {@code fieldOffsetGranularity} field. */
        public VkOffset2D fieldOffsetGranularity() { return VkVideoDecodeH264CapabilitiesKHR.nfieldOffsetGranularity(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoDecodeH264CapabilitiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeH264CapabilitiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_KHR} value to the {@code sType} field. */
        public VkVideoDecodeH264CapabilitiesKHR.Buffer sType$Default() { return sType(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_CAPABILITIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoDecodeH264CapabilitiesKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoDecodeH264CapabilitiesKHR.npNext(address(), value); return this; }

    }

}