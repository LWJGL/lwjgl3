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
 * struct VkVideoDecodeH264SessionParametersAddInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t stdSPSCount;
 *     {@link StdVideoH264SequenceParameterSet StdVideoH264SequenceParameterSet} const * pStdSPSs;
 *     uint32_t stdPPSCount;
 *     {@link StdVideoH264PictureParameterSet StdVideoH264PictureParameterSet} const * pStdPPSs;
 * }}</pre>
 */
public class VkVideoDecodeH264SessionParametersAddInfoKHR extends Struct<VkVideoDecodeH264SessionParametersAddInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STDSPSCOUNT,
        PSTDSPSS,
        STDPPSCOUNT,
        PSTDPPSS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STDSPSCOUNT = layout.offsetof(2);
        PSTDSPSS = layout.offsetof(3);
        STDPPSCOUNT = layout.offsetof(4);
        PSTDPPSS = layout.offsetof(5);
    }

    protected VkVideoDecodeH264SessionParametersAddInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoDecodeH264SessionParametersAddInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoDecodeH264SessionParametersAddInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoDecodeH264SessionParametersAddInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeH264SessionParametersAddInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code stdSPSCount} field. */
    @NativeType("uint32_t")
    public int stdSPSCount() { return nstdSPSCount(address()); }
    /** @return a {@link StdVideoH264SequenceParameterSet.Buffer} view of the struct array pointed to by the {@code pStdSPSs} field. */
    @NativeType("StdVideoH264SequenceParameterSet const *")
    public StdVideoH264SequenceParameterSet.@Nullable Buffer pStdSPSs() { return npStdSPSs(address()); }
    /** @return the value of the {@code stdPPSCount} field. */
    @NativeType("uint32_t")
    public int stdPPSCount() { return nstdPPSCount(address()); }
    /** @return a {@link StdVideoH264PictureParameterSet.Buffer} view of the struct array pointed to by the {@code pStdPPSs} field. */
    @NativeType("StdVideoH264PictureParameterSet const *")
    public StdVideoH264PictureParameterSet.@Nullable Buffer pStdPPSs() { return npStdPPSs(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoDecodeH264SessionParametersAddInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR} value to the {@code sType} field. */
    public VkVideoDecodeH264SessionParametersAddInfoKHR sType$Default() { return sType(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoDecodeH264SessionParametersAddInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH264SequenceParameterSet.Buffer} to the {@code pStdSPSs} field. */
    public VkVideoDecodeH264SessionParametersAddInfoKHR pStdSPSs(@NativeType("StdVideoH264SequenceParameterSet const *") StdVideoH264SequenceParameterSet.@Nullable Buffer value) { npStdSPSs(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH264PictureParameterSet.Buffer} to the {@code pStdPPSs} field. */
    public VkVideoDecodeH264SessionParametersAddInfoKHR pStdPPSs(@NativeType("StdVideoH264PictureParameterSet const *") StdVideoH264PictureParameterSet.@Nullable Buffer value) { npStdPPSs(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeH264SessionParametersAddInfoKHR set(
        int sType,
        long pNext,
        StdVideoH264SequenceParameterSet.@Nullable Buffer pStdSPSs,
        StdVideoH264PictureParameterSet.@Nullable Buffer pStdPPSs
    ) {
        sType(sType);
        pNext(pNext);
        pStdSPSs(pStdSPSs);
        pStdPPSs(pStdPPSs);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoDecodeH264SessionParametersAddInfoKHR set(VkVideoDecodeH264SessionParametersAddInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeH264SessionParametersAddInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264SessionParametersAddInfoKHR malloc() {
        return new VkVideoDecodeH264SessionParametersAddInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeH264SessionParametersAddInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264SessionParametersAddInfoKHR calloc() {
        return new VkVideoDecodeH264SessionParametersAddInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeH264SessionParametersAddInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeH264SessionParametersAddInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeH264SessionParametersAddInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeH264SessionParametersAddInfoKHR} instance for the specified memory address. */
    public static VkVideoDecodeH264SessionParametersAddInfoKHR create(long address) {
        return new VkVideoDecodeH264SessionParametersAddInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoDecodeH264SessionParametersAddInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoDecodeH264SessionParametersAddInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionParametersAddInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionParametersAddInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionParametersAddInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionParametersAddInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionParametersAddInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionParametersAddInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoDecodeH264SessionParametersAddInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionParametersAddInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoDecodeH264SessionParametersAddInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeH264SessionParametersAddInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264SessionParametersAddInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeH264SessionParametersAddInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoDecodeH264SessionParametersAddInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264SessionParametersAddInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeH264SessionParametersAddInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionParametersAddInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionParametersAddInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionParametersAddInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionParametersAddInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoDecodeH264SessionParametersAddInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeH264SessionParametersAddInfoKHR.PNEXT); }
    /** Unsafe version of {@link #stdSPSCount}. */
    public static int nstdSPSCount(long struct) { return memGetInt(struct + VkVideoDecodeH264SessionParametersAddInfoKHR.STDSPSCOUNT); }
    /** Unsafe version of {@link #pStdSPSs}. */
    public static StdVideoH264SequenceParameterSet.@Nullable Buffer npStdSPSs(long struct) { return StdVideoH264SequenceParameterSet.createSafe(memGetAddress(struct + VkVideoDecodeH264SessionParametersAddInfoKHR.PSTDSPSS), nstdSPSCount(struct)); }
    /** Unsafe version of {@link #stdPPSCount}. */
    public static int nstdPPSCount(long struct) { return memGetInt(struct + VkVideoDecodeH264SessionParametersAddInfoKHR.STDPPSCOUNT); }
    /** Unsafe version of {@link #pStdPPSs}. */
    public static StdVideoH264PictureParameterSet.@Nullable Buffer npStdPPSs(long struct) { return StdVideoH264PictureParameterSet.createSafe(memGetAddress(struct + VkVideoDecodeH264SessionParametersAddInfoKHR.PSTDPPSS), nstdPPSCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoDecodeH264SessionParametersAddInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeH264SessionParametersAddInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code stdSPSCount} field of the specified {@code struct}. */
    public static void nstdSPSCount(long struct, int value) { memPutInt(struct + VkVideoDecodeH264SessionParametersAddInfoKHR.STDSPSCOUNT, value); }
    /** Unsafe version of {@link #pStdSPSs(StdVideoH264SequenceParameterSet.Buffer) pStdSPSs}. */
    public static void npStdSPSs(long struct, StdVideoH264SequenceParameterSet.@Nullable Buffer value) { memPutAddress(struct + VkVideoDecodeH264SessionParametersAddInfoKHR.PSTDSPSS, memAddressSafe(value)); nstdSPSCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code stdPPSCount} field of the specified {@code struct}. */
    public static void nstdPPSCount(long struct, int value) { memPutInt(struct + VkVideoDecodeH264SessionParametersAddInfoKHR.STDPPSCOUNT, value); }
    /** Unsafe version of {@link #pStdPPSs(StdVideoH264PictureParameterSet.Buffer) pStdPPSs}. */
    public static void npStdPPSs(long struct, StdVideoH264PictureParameterSet.@Nullable Buffer value) { memPutAddress(struct + VkVideoDecodeH264SessionParametersAddInfoKHR.PSTDPPSS, memAddressSafe(value)); nstdPPSCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int stdSPSCount = nstdSPSCount(struct);
        if (stdSPSCount != 0) {
            long pStdSPSs = memGetAddress(struct + VkVideoDecodeH264SessionParametersAddInfoKHR.PSTDSPSS);
            check(pStdSPSs);
            validate(pStdSPSs, stdSPSCount, StdVideoH264SequenceParameterSet.SIZEOF, StdVideoH264SequenceParameterSet::validate);
        }
        int stdPPSCount = nstdPPSCount(struct);
        if (stdPPSCount != 0) {
            long pStdPPSs = memGetAddress(struct + VkVideoDecodeH264SessionParametersAddInfoKHR.PSTDPPSS);
            check(pStdPPSs);
            validate(pStdPPSs, stdPPSCount, StdVideoH264PictureParameterSet.SIZEOF, StdVideoH264PictureParameterSet::validate);
        }
    }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeH264SessionParametersAddInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeH264SessionParametersAddInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoDecodeH264SessionParametersAddInfoKHR ELEMENT_FACTORY = VkVideoDecodeH264SessionParametersAddInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeH264SessionParametersAddInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeH264SessionParametersAddInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoDecodeH264SessionParametersAddInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeH264SessionParametersAddInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeH264SessionParametersAddInfoKHR.npNext(address()); }
        /** @return the value of the {@code stdSPSCount} field. */
        @NativeType("uint32_t")
        public int stdSPSCount() { return VkVideoDecodeH264SessionParametersAddInfoKHR.nstdSPSCount(address()); }
        /** @return a {@link StdVideoH264SequenceParameterSet.Buffer} view of the struct array pointed to by the {@code pStdSPSs} field. */
        @NativeType("StdVideoH264SequenceParameterSet const *")
        public StdVideoH264SequenceParameterSet.@Nullable Buffer pStdSPSs() { return VkVideoDecodeH264SessionParametersAddInfoKHR.npStdSPSs(address()); }
        /** @return the value of the {@code stdPPSCount} field. */
        @NativeType("uint32_t")
        public int stdPPSCount() { return VkVideoDecodeH264SessionParametersAddInfoKHR.nstdPPSCount(address()); }
        /** @return a {@link StdVideoH264PictureParameterSet.Buffer} view of the struct array pointed to by the {@code pStdPPSs} field. */
        @NativeType("StdVideoH264PictureParameterSet const *")
        public StdVideoH264PictureParameterSet.@Nullable Buffer pStdPPSs() { return VkVideoDecodeH264SessionParametersAddInfoKHR.npStdPPSs(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoDecodeH264SessionParametersAddInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeH264SessionParametersAddInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR} value to the {@code sType} field. */
        public VkVideoDecodeH264SessionParametersAddInfoKHR.Buffer sType$Default() { return sType(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoDecodeH264SessionParametersAddInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeH264SessionParametersAddInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH264SequenceParameterSet.Buffer} to the {@code pStdSPSs} field. */
        public VkVideoDecodeH264SessionParametersAddInfoKHR.Buffer pStdSPSs(@NativeType("StdVideoH264SequenceParameterSet const *") StdVideoH264SequenceParameterSet.@Nullable Buffer value) { VkVideoDecodeH264SessionParametersAddInfoKHR.npStdSPSs(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH264PictureParameterSet.Buffer} to the {@code pStdPPSs} field. */
        public VkVideoDecodeH264SessionParametersAddInfoKHR.Buffer pStdPPSs(@NativeType("StdVideoH264PictureParameterSet const *") StdVideoH264PictureParameterSet.@Nullable Buffer value) { VkVideoDecodeH264SessionParametersAddInfoKHR.npStdPPSs(address(), value); return this; }

    }

}