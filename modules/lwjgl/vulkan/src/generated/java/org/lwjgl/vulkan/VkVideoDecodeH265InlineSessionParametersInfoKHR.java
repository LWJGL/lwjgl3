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
 * struct VkVideoDecodeH265InlineSessionParametersInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link StdVideoH265VideoParameterSet StdVideoH265VideoParameterSet} const * pStdVPS;
 *     {@link StdVideoH265SequenceParameterSet StdVideoH265SequenceParameterSet} const * pStdSPS;
 *     {@link StdVideoH265PictureParameterSet StdVideoH265PictureParameterSet} const * pStdPPS;
 * }}</pre>
 */
public class VkVideoDecodeH265InlineSessionParametersInfoKHR extends Struct<VkVideoDecodeH265InlineSessionParametersInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PSTDVPS,
        PSTDSPS,
        PSTDPPS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDVPS = layout.offsetof(2);
        PSTDSPS = layout.offsetof(3);
        PSTDPPS = layout.offsetof(4);
    }

    protected VkVideoDecodeH265InlineSessionParametersInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoDecodeH265InlineSessionParametersInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoDecodeH265InlineSessionParametersInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoDecodeH265InlineSessionParametersInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeH265InlineSessionParametersInfoKHR(ByteBuffer container) {
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
    /** @return a {@link StdVideoH265VideoParameterSet} view of the struct pointed to by the {@code pStdVPS} field. */
    @NativeType("StdVideoH265VideoParameterSet const *")
    public @Nullable StdVideoH265VideoParameterSet pStdVPS() { return npStdVPS(address()); }
    /** @return a {@link StdVideoH265SequenceParameterSet} view of the struct pointed to by the {@code pStdSPS} field. */
    @NativeType("StdVideoH265SequenceParameterSet const *")
    public @Nullable StdVideoH265SequenceParameterSet pStdSPS() { return npStdSPS(address()); }
    /** @return a {@link StdVideoH265PictureParameterSet} view of the struct pointed to by the {@code pStdPPS} field. */
    @NativeType("StdVideoH265PictureParameterSet const *")
    public @Nullable StdVideoH265PictureParameterSet pStdPPS() { return npStdPPS(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoDecodeH265InlineSessionParametersInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoMaintenance2#VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_INLINE_SESSION_PARAMETERS_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H265_INLINE_SESSION_PARAMETERS_INFO_KHR} value to the {@code sType} field. */
    public VkVideoDecodeH265InlineSessionParametersInfoKHR sType$Default() { return sType(KHRVideoMaintenance2.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_INLINE_SESSION_PARAMETERS_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoDecodeH265InlineSessionParametersInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH265VideoParameterSet} to the {@code pStdVPS} field. */
    public VkVideoDecodeH265InlineSessionParametersInfoKHR pStdVPS(@Nullable @NativeType("StdVideoH265VideoParameterSet const *") StdVideoH265VideoParameterSet value) { npStdVPS(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH265SequenceParameterSet} to the {@code pStdSPS} field. */
    public VkVideoDecodeH265InlineSessionParametersInfoKHR pStdSPS(@Nullable @NativeType("StdVideoH265SequenceParameterSet const *") StdVideoH265SequenceParameterSet value) { npStdSPS(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH265PictureParameterSet} to the {@code pStdPPS} field. */
    public VkVideoDecodeH265InlineSessionParametersInfoKHR pStdPPS(@Nullable @NativeType("StdVideoH265PictureParameterSet const *") StdVideoH265PictureParameterSet value) { npStdPPS(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeH265InlineSessionParametersInfoKHR set(
        int sType,
        long pNext,
        @Nullable StdVideoH265VideoParameterSet pStdVPS,
        @Nullable StdVideoH265SequenceParameterSet pStdSPS,
        @Nullable StdVideoH265PictureParameterSet pStdPPS
    ) {
        sType(sType);
        pNext(pNext);
        pStdVPS(pStdVPS);
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
    public VkVideoDecodeH265InlineSessionParametersInfoKHR set(VkVideoDecodeH265InlineSessionParametersInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeH265InlineSessionParametersInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH265InlineSessionParametersInfoKHR malloc() {
        return new VkVideoDecodeH265InlineSessionParametersInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeH265InlineSessionParametersInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH265InlineSessionParametersInfoKHR calloc() {
        return new VkVideoDecodeH265InlineSessionParametersInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeH265InlineSessionParametersInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeH265InlineSessionParametersInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeH265InlineSessionParametersInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeH265InlineSessionParametersInfoKHR} instance for the specified memory address. */
    public static VkVideoDecodeH265InlineSessionParametersInfoKHR create(long address) {
        return new VkVideoDecodeH265InlineSessionParametersInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoDecodeH265InlineSessionParametersInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoDecodeH265InlineSessionParametersInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265InlineSessionParametersInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265InlineSessionParametersInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265InlineSessionParametersInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265InlineSessionParametersInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265InlineSessionParametersInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265InlineSessionParametersInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoDecodeH265InlineSessionParametersInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265InlineSessionParametersInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoDecodeH265InlineSessionParametersInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeH265InlineSessionParametersInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH265InlineSessionParametersInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeH265InlineSessionParametersInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoDecodeH265InlineSessionParametersInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH265InlineSessionParametersInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeH265InlineSessionParametersInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265InlineSessionParametersInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265InlineSessionParametersInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265InlineSessionParametersInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265InlineSessionParametersInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoDecodeH265InlineSessionParametersInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeH265InlineSessionParametersInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pStdVPS}. */
    public static @Nullable StdVideoH265VideoParameterSet npStdVPS(long struct) { return StdVideoH265VideoParameterSet.createSafe(memGetAddress(struct + VkVideoDecodeH265InlineSessionParametersInfoKHR.PSTDVPS)); }
    /** Unsafe version of {@link #pStdSPS}. */
    public static @Nullable StdVideoH265SequenceParameterSet npStdSPS(long struct) { return StdVideoH265SequenceParameterSet.createSafe(memGetAddress(struct + VkVideoDecodeH265InlineSessionParametersInfoKHR.PSTDSPS)); }
    /** Unsafe version of {@link #pStdPPS}. */
    public static @Nullable StdVideoH265PictureParameterSet npStdPPS(long struct) { return StdVideoH265PictureParameterSet.createSafe(memGetAddress(struct + VkVideoDecodeH265InlineSessionParametersInfoKHR.PSTDPPS)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoDecodeH265InlineSessionParametersInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeH265InlineSessionParametersInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pStdVPS(StdVideoH265VideoParameterSet) pStdVPS}. */
    public static void npStdVPS(long struct, @Nullable StdVideoH265VideoParameterSet value) { memPutAddress(struct + VkVideoDecodeH265InlineSessionParametersInfoKHR.PSTDVPS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pStdSPS(StdVideoH265SequenceParameterSet) pStdSPS}. */
    public static void npStdSPS(long struct, @Nullable StdVideoH265SequenceParameterSet value) { memPutAddress(struct + VkVideoDecodeH265InlineSessionParametersInfoKHR.PSTDSPS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pStdPPS(StdVideoH265PictureParameterSet) pStdPPS}. */
    public static void npStdPPS(long struct, @Nullable StdVideoH265PictureParameterSet value) { memPutAddress(struct + VkVideoDecodeH265InlineSessionParametersInfoKHR.PSTDPPS, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pStdVPS = memGetAddress(struct + VkVideoDecodeH265InlineSessionParametersInfoKHR.PSTDVPS);
        if (pStdVPS != NULL) {
            StdVideoH265VideoParameterSet.validate(pStdVPS);
        }
        long pStdSPS = memGetAddress(struct + VkVideoDecodeH265InlineSessionParametersInfoKHR.PSTDSPS);
        if (pStdSPS != NULL) {
            StdVideoH265SequenceParameterSet.validate(pStdSPS);
        }
        long pStdPPS = memGetAddress(struct + VkVideoDecodeH265InlineSessionParametersInfoKHR.PSTDPPS);
        if (pStdPPS != NULL) {
            StdVideoH265PictureParameterSet.validate(pStdPPS);
        }
    }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeH265InlineSessionParametersInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeH265InlineSessionParametersInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoDecodeH265InlineSessionParametersInfoKHR ELEMENT_FACTORY = VkVideoDecodeH265InlineSessionParametersInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeH265InlineSessionParametersInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeH265InlineSessionParametersInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoDecodeH265InlineSessionParametersInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeH265InlineSessionParametersInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeH265InlineSessionParametersInfoKHR.npNext(address()); }
        /** @return a {@link StdVideoH265VideoParameterSet} view of the struct pointed to by the {@code pStdVPS} field. */
        @NativeType("StdVideoH265VideoParameterSet const *")
        public @Nullable StdVideoH265VideoParameterSet pStdVPS() { return VkVideoDecodeH265InlineSessionParametersInfoKHR.npStdVPS(address()); }
        /** @return a {@link StdVideoH265SequenceParameterSet} view of the struct pointed to by the {@code pStdSPS} field. */
        @NativeType("StdVideoH265SequenceParameterSet const *")
        public @Nullable StdVideoH265SequenceParameterSet pStdSPS() { return VkVideoDecodeH265InlineSessionParametersInfoKHR.npStdSPS(address()); }
        /** @return a {@link StdVideoH265PictureParameterSet} view of the struct pointed to by the {@code pStdPPS} field. */
        @NativeType("StdVideoH265PictureParameterSet const *")
        public @Nullable StdVideoH265PictureParameterSet pStdPPS() { return VkVideoDecodeH265InlineSessionParametersInfoKHR.npStdPPS(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoDecodeH265InlineSessionParametersInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeH265InlineSessionParametersInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoMaintenance2#VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_INLINE_SESSION_PARAMETERS_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H265_INLINE_SESSION_PARAMETERS_INFO_KHR} value to the {@code sType} field. */
        public VkVideoDecodeH265InlineSessionParametersInfoKHR.Buffer sType$Default() { return sType(KHRVideoMaintenance2.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_INLINE_SESSION_PARAMETERS_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoDecodeH265InlineSessionParametersInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeH265InlineSessionParametersInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH265VideoParameterSet} to the {@code pStdVPS} field. */
        public VkVideoDecodeH265InlineSessionParametersInfoKHR.Buffer pStdVPS(@Nullable @NativeType("StdVideoH265VideoParameterSet const *") StdVideoH265VideoParameterSet value) { VkVideoDecodeH265InlineSessionParametersInfoKHR.npStdVPS(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH265SequenceParameterSet} to the {@code pStdSPS} field. */
        public VkVideoDecodeH265InlineSessionParametersInfoKHR.Buffer pStdSPS(@Nullable @NativeType("StdVideoH265SequenceParameterSet const *") StdVideoH265SequenceParameterSet value) { VkVideoDecodeH265InlineSessionParametersInfoKHR.npStdSPS(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH265PictureParameterSet} to the {@code pStdPPS} field. */
        public VkVideoDecodeH265InlineSessionParametersInfoKHR.Buffer pStdPPS(@Nullable @NativeType("StdVideoH265PictureParameterSet const *") StdVideoH265PictureParameterSet value) { VkVideoDecodeH265InlineSessionParametersInfoKHR.npStdPPS(address(), value); return this; }

    }

}