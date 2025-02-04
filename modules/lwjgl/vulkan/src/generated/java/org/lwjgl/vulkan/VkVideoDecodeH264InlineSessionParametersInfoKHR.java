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
 * struct VkVideoDecodeH264InlineSessionParametersInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link StdVideoH264SequenceParameterSet StdVideoH264SequenceParameterSet} const * pStdSPS;
 *     {@link StdVideoH264PictureParameterSet StdVideoH264PictureParameterSet} const * pStdPPS;
 * }}</pre>
 */
public class VkVideoDecodeH264InlineSessionParametersInfoKHR extends Struct<VkVideoDecodeH264InlineSessionParametersInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PSTDSPS,
        PSTDPPS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDSPS = layout.offsetof(2);
        PSTDPPS = layout.offsetof(3);
    }

    protected VkVideoDecodeH264InlineSessionParametersInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoDecodeH264InlineSessionParametersInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoDecodeH264InlineSessionParametersInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoDecodeH264InlineSessionParametersInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeH264InlineSessionParametersInfoKHR(ByteBuffer container) {
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
    /** @return a {@link StdVideoH264SequenceParameterSet} view of the struct pointed to by the {@code pStdSPS} field. */
    @NativeType("StdVideoH264SequenceParameterSet const *")
    public @Nullable StdVideoH264SequenceParameterSet pStdSPS() { return npStdSPS(address()); }
    /** @return a {@link StdVideoH264PictureParameterSet} view of the struct pointed to by the {@code pStdPPS} field. */
    @NativeType("StdVideoH264PictureParameterSet const *")
    public @Nullable StdVideoH264PictureParameterSet pStdPPS() { return npStdPPS(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoDecodeH264InlineSessionParametersInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoMaintenance2#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_INLINE_SESSION_PARAMETERS_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_INLINE_SESSION_PARAMETERS_INFO_KHR} value to the {@code sType} field. */
    public VkVideoDecodeH264InlineSessionParametersInfoKHR sType$Default() { return sType(KHRVideoMaintenance2.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_INLINE_SESSION_PARAMETERS_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoDecodeH264InlineSessionParametersInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH264SequenceParameterSet} to the {@code pStdSPS} field. */
    public VkVideoDecodeH264InlineSessionParametersInfoKHR pStdSPS(@Nullable @NativeType("StdVideoH264SequenceParameterSet const *") StdVideoH264SequenceParameterSet value) { npStdSPS(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH264PictureParameterSet} to the {@code pStdPPS} field. */
    public VkVideoDecodeH264InlineSessionParametersInfoKHR pStdPPS(@Nullable @NativeType("StdVideoH264PictureParameterSet const *") StdVideoH264PictureParameterSet value) { npStdPPS(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeH264InlineSessionParametersInfoKHR set(
        int sType,
        long pNext,
        @Nullable StdVideoH264SequenceParameterSet pStdSPS,
        @Nullable StdVideoH264PictureParameterSet pStdPPS
    ) {
        sType(sType);
        pNext(pNext);
        pStdSPS(pStdSPS);
        pStdPPS(pStdPPS);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoDecodeH264InlineSessionParametersInfoKHR set(VkVideoDecodeH264InlineSessionParametersInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeH264InlineSessionParametersInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264InlineSessionParametersInfoKHR malloc() {
        return new VkVideoDecodeH264InlineSessionParametersInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeH264InlineSessionParametersInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264InlineSessionParametersInfoKHR calloc() {
        return new VkVideoDecodeH264InlineSessionParametersInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeH264InlineSessionParametersInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeH264InlineSessionParametersInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeH264InlineSessionParametersInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeH264InlineSessionParametersInfoKHR} instance for the specified memory address. */
    public static VkVideoDecodeH264InlineSessionParametersInfoKHR create(long address) {
        return new VkVideoDecodeH264InlineSessionParametersInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoDecodeH264InlineSessionParametersInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoDecodeH264InlineSessionParametersInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264InlineSessionParametersInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264InlineSessionParametersInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264InlineSessionParametersInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264InlineSessionParametersInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264InlineSessionParametersInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264InlineSessionParametersInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoDecodeH264InlineSessionParametersInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264InlineSessionParametersInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoDecodeH264InlineSessionParametersInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeH264InlineSessionParametersInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264InlineSessionParametersInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeH264InlineSessionParametersInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoDecodeH264InlineSessionParametersInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264InlineSessionParametersInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeH264InlineSessionParametersInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264InlineSessionParametersInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264InlineSessionParametersInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264InlineSessionParametersInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264InlineSessionParametersInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoDecodeH264InlineSessionParametersInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeH264InlineSessionParametersInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pStdSPS}. */
    public static @Nullable StdVideoH264SequenceParameterSet npStdSPS(long struct) { return StdVideoH264SequenceParameterSet.createSafe(memGetAddress(struct + VkVideoDecodeH264InlineSessionParametersInfoKHR.PSTDSPS)); }
    /** Unsafe version of {@link #pStdPPS}. */
    public static @Nullable StdVideoH264PictureParameterSet npStdPPS(long struct) { return StdVideoH264PictureParameterSet.createSafe(memGetAddress(struct + VkVideoDecodeH264InlineSessionParametersInfoKHR.PSTDPPS)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoDecodeH264InlineSessionParametersInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeH264InlineSessionParametersInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pStdSPS(StdVideoH264SequenceParameterSet) pStdSPS}. */
    public static void npStdSPS(long struct, @Nullable StdVideoH264SequenceParameterSet value) { memPutAddress(struct + VkVideoDecodeH264InlineSessionParametersInfoKHR.PSTDSPS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pStdPPS(StdVideoH264PictureParameterSet) pStdPPS}. */
    public static void npStdPPS(long struct, @Nullable StdVideoH264PictureParameterSet value) { memPutAddress(struct + VkVideoDecodeH264InlineSessionParametersInfoKHR.PSTDPPS, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pStdSPS = memGetAddress(struct + VkVideoDecodeH264InlineSessionParametersInfoKHR.PSTDSPS);
        if (pStdSPS != NULL) {
            StdVideoH264SequenceParameterSet.validate(pStdSPS);
        }
        long pStdPPS = memGetAddress(struct + VkVideoDecodeH264InlineSessionParametersInfoKHR.PSTDPPS);
        if (pStdPPS != NULL) {
            StdVideoH264PictureParameterSet.validate(pStdPPS);
        }
    }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeH264InlineSessionParametersInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeH264InlineSessionParametersInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoDecodeH264InlineSessionParametersInfoKHR ELEMENT_FACTORY = VkVideoDecodeH264InlineSessionParametersInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeH264InlineSessionParametersInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeH264InlineSessionParametersInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoDecodeH264InlineSessionParametersInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeH264InlineSessionParametersInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeH264InlineSessionParametersInfoKHR.npNext(address()); }
        /** @return a {@link StdVideoH264SequenceParameterSet} view of the struct pointed to by the {@code pStdSPS} field. */
        @NativeType("StdVideoH264SequenceParameterSet const *")
        public @Nullable StdVideoH264SequenceParameterSet pStdSPS() { return VkVideoDecodeH264InlineSessionParametersInfoKHR.npStdSPS(address()); }
        /** @return a {@link StdVideoH264PictureParameterSet} view of the struct pointed to by the {@code pStdPPS} field. */
        @NativeType("StdVideoH264PictureParameterSet const *")
        public @Nullable StdVideoH264PictureParameterSet pStdPPS() { return VkVideoDecodeH264InlineSessionParametersInfoKHR.npStdPPS(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoDecodeH264InlineSessionParametersInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeH264InlineSessionParametersInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoMaintenance2#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_INLINE_SESSION_PARAMETERS_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_INLINE_SESSION_PARAMETERS_INFO_KHR} value to the {@code sType} field. */
        public VkVideoDecodeH264InlineSessionParametersInfoKHR.Buffer sType$Default() { return sType(KHRVideoMaintenance2.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_INLINE_SESSION_PARAMETERS_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoDecodeH264InlineSessionParametersInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeH264InlineSessionParametersInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH264SequenceParameterSet} to the {@code pStdSPS} field. */
        public VkVideoDecodeH264InlineSessionParametersInfoKHR.Buffer pStdSPS(@Nullable @NativeType("StdVideoH264SequenceParameterSet const *") StdVideoH264SequenceParameterSet value) { VkVideoDecodeH264InlineSessionParametersInfoKHR.npStdSPS(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH264PictureParameterSet} to the {@code pStdPPS} field. */
        public VkVideoDecodeH264InlineSessionParametersInfoKHR.Buffer pStdPPS(@Nullable @NativeType("StdVideoH264PictureParameterSet const *") StdVideoH264PictureParameterSet value) { VkVideoDecodeH264InlineSessionParametersInfoKHR.npStdPPS(address(), value); return this; }

    }

}