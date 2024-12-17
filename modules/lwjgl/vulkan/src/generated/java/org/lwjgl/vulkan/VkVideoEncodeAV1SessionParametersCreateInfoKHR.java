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
 * struct VkVideoEncodeAV1SessionParametersCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link StdVideoAV1SequenceHeader StdVideoAV1SequenceHeader} const * pStdSequenceHeader;
 *     {@link StdVideoEncodeAV1DecoderModelInfo StdVideoEncodeAV1DecoderModelInfo} const * pStdDecoderModelInfo;
 *     uint32_t stdOperatingPointCount;
 *     {@link StdVideoEncodeAV1OperatingPointInfo StdVideoEncodeAV1OperatingPointInfo} const * pStdOperatingPoints;
 * }}</pre>
 */
public class VkVideoEncodeAV1SessionParametersCreateInfoKHR extends Struct<VkVideoEncodeAV1SessionParametersCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PSTDSEQUENCEHEADER,
        PSTDDECODERMODELINFO,
        STDOPERATINGPOINTCOUNT,
        PSTDOPERATINGPOINTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDSEQUENCEHEADER = layout.offsetof(2);
        PSTDDECODERMODELINFO = layout.offsetof(3);
        STDOPERATINGPOINTCOUNT = layout.offsetof(4);
        PSTDOPERATINGPOINTS = layout.offsetof(5);
    }

    protected VkVideoEncodeAV1SessionParametersCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeAV1SessionParametersCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeAV1SessionParametersCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR(ByteBuffer container) {
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
    /** @return a {@link StdVideoAV1SequenceHeader} view of the struct pointed to by the {@code pStdSequenceHeader} field. */
    @NativeType("StdVideoAV1SequenceHeader const *")
    public StdVideoAV1SequenceHeader pStdSequenceHeader() { return npStdSequenceHeader(address()); }
    /** @return a {@link StdVideoEncodeAV1DecoderModelInfo} view of the struct pointed to by the {@code pStdDecoderModelInfo} field. */
    @NativeType("StdVideoEncodeAV1DecoderModelInfo const *")
    public @Nullable StdVideoEncodeAV1DecoderModelInfo pStdDecoderModelInfo() { return npStdDecoderModelInfo(address()); }
    /** @return the value of the {@code stdOperatingPointCount} field. */
    @NativeType("uint32_t")
    public int stdOperatingPointCount() { return nstdOperatingPointCount(address()); }
    /** @return a {@link StdVideoEncodeAV1OperatingPointInfo.Buffer} view of the struct array pointed to by the {@code pStdOperatingPoints} field. */
    @NativeType("StdVideoEncodeAV1OperatingPointInfo const *")
    public StdVideoEncodeAV1OperatingPointInfo.@Nullable Buffer pStdOperatingPoints() { return npStdOperatingPoints(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR} value to the {@code sType} field. */
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR sType$Default() { return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoAV1SequenceHeader} to the {@code pStdSequenceHeader} field. */
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pStdSequenceHeader(@NativeType("StdVideoAV1SequenceHeader const *") StdVideoAV1SequenceHeader value) { npStdSequenceHeader(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeAV1DecoderModelInfo} to the {@code pStdDecoderModelInfo} field. */
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pStdDecoderModelInfo(@Nullable @NativeType("StdVideoEncodeAV1DecoderModelInfo const *") StdVideoEncodeAV1DecoderModelInfo value) { npStdDecoderModelInfo(address(), value); return this; }
    /** Sets the specified value to the {@code stdOperatingPointCount} field. */
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR stdOperatingPointCount(@NativeType("uint32_t") int value) { nstdOperatingPointCount(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeAV1OperatingPointInfo.Buffer} to the {@code pStdOperatingPoints} field. */
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pStdOperatingPoints(@NativeType("StdVideoEncodeAV1OperatingPointInfo const *") StdVideoEncodeAV1OperatingPointInfo.@Nullable Buffer value) { npStdOperatingPoints(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR set(
        int sType,
        long pNext,
        StdVideoAV1SequenceHeader pStdSequenceHeader,
        @Nullable StdVideoEncodeAV1DecoderModelInfo pStdDecoderModelInfo,
        int stdOperatingPointCount,
        StdVideoEncodeAV1OperatingPointInfo.@Nullable Buffer pStdOperatingPoints
    ) {
        sType(sType);
        pNext(pNext);
        pStdSequenceHeader(pStdSequenceHeader);
        pStdDecoderModelInfo(pStdDecoderModelInfo);
        stdOperatingPointCount(stdOperatingPointCount);
        pStdOperatingPoints(pStdOperatingPoints);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR set(VkVideoEncodeAV1SessionParametersCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeAV1SessionParametersCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR malloc() {
        return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1SessionParametersCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR calloc() {
        return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1SessionParametersCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeAV1SessionParametersCreateInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR create(long address) {
        return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeAV1SessionParametersCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeAV1SessionParametersCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1SessionParametersCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1SessionParametersCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1SessionParametersCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeAV1SessionParametersCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1SessionParametersCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1SessionParametersCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1SessionParametersCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1SessionParametersCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeAV1SessionParametersCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeAV1SessionParametersCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pStdSequenceHeader}. */
    public static StdVideoAV1SequenceHeader npStdSequenceHeader(long struct) { return StdVideoAV1SequenceHeader.create(memGetAddress(struct + VkVideoEncodeAV1SessionParametersCreateInfoKHR.PSTDSEQUENCEHEADER)); }
    /** Unsafe version of {@link #pStdDecoderModelInfo}. */
    public static @Nullable StdVideoEncodeAV1DecoderModelInfo npStdDecoderModelInfo(long struct) { return StdVideoEncodeAV1DecoderModelInfo.createSafe(memGetAddress(struct + VkVideoEncodeAV1SessionParametersCreateInfoKHR.PSTDDECODERMODELINFO)); }
    /** Unsafe version of {@link #stdOperatingPointCount}. */
    public static int nstdOperatingPointCount(long struct) { return memGetInt(struct + VkVideoEncodeAV1SessionParametersCreateInfoKHR.STDOPERATINGPOINTCOUNT); }
    /** Unsafe version of {@link #pStdOperatingPoints}. */
    public static StdVideoEncodeAV1OperatingPointInfo.@Nullable Buffer npStdOperatingPoints(long struct) { return StdVideoEncodeAV1OperatingPointInfo.createSafe(memGetAddress(struct + VkVideoEncodeAV1SessionParametersCreateInfoKHR.PSTDOPERATINGPOINTS), nstdOperatingPointCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1SessionParametersCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeAV1SessionParametersCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pStdSequenceHeader(StdVideoAV1SequenceHeader) pStdSequenceHeader}. */
    public static void npStdSequenceHeader(long struct, StdVideoAV1SequenceHeader value) { memPutAddress(struct + VkVideoEncodeAV1SessionParametersCreateInfoKHR.PSTDSEQUENCEHEADER, value.address()); }
    /** Unsafe version of {@link #pStdDecoderModelInfo(StdVideoEncodeAV1DecoderModelInfo) pStdDecoderModelInfo}. */
    public static void npStdDecoderModelInfo(long struct, @Nullable StdVideoEncodeAV1DecoderModelInfo value) { memPutAddress(struct + VkVideoEncodeAV1SessionParametersCreateInfoKHR.PSTDDECODERMODELINFO, memAddressSafe(value)); }
    /** Sets the specified value to the {@code stdOperatingPointCount} field of the specified {@code struct}. */
    public static void nstdOperatingPointCount(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1SessionParametersCreateInfoKHR.STDOPERATINGPOINTCOUNT, value); }
    /** Unsafe version of {@link #pStdOperatingPoints(StdVideoEncodeAV1OperatingPointInfo.Buffer) pStdOperatingPoints}. */
    public static void npStdOperatingPoints(long struct, StdVideoEncodeAV1OperatingPointInfo.@Nullable Buffer value) { memPutAddress(struct + VkVideoEncodeAV1SessionParametersCreateInfoKHR.PSTDOPERATINGPOINTS, memAddressSafe(value)); if (value != null) { nstdOperatingPointCount(struct, value.remaining()); } }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pStdSequenceHeader = memGetAddress(struct + VkVideoEncodeAV1SessionParametersCreateInfoKHR.PSTDSEQUENCEHEADER);
        check(pStdSequenceHeader);
        StdVideoAV1SequenceHeader.validate(pStdSequenceHeader);
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeAV1SessionParametersCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1SessionParametersCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeAV1SessionParametersCreateInfoKHR ELEMENT_FACTORY = VkVideoEncodeAV1SessionParametersCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeAV1SessionParametersCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeAV1SessionParametersCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeAV1SessionParametersCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeAV1SessionParametersCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeAV1SessionParametersCreateInfoKHR.npNext(address()); }
        /** @return a {@link StdVideoAV1SequenceHeader} view of the struct pointed to by the {@code pStdSequenceHeader} field. */
        @NativeType("StdVideoAV1SequenceHeader const *")
        public StdVideoAV1SequenceHeader pStdSequenceHeader() { return VkVideoEncodeAV1SessionParametersCreateInfoKHR.npStdSequenceHeader(address()); }
        /** @return a {@link StdVideoEncodeAV1DecoderModelInfo} view of the struct pointed to by the {@code pStdDecoderModelInfo} field. */
        @NativeType("StdVideoEncodeAV1DecoderModelInfo const *")
        public @Nullable StdVideoEncodeAV1DecoderModelInfo pStdDecoderModelInfo() { return VkVideoEncodeAV1SessionParametersCreateInfoKHR.npStdDecoderModelInfo(address()); }
        /** @return the value of the {@code stdOperatingPointCount} field. */
        @NativeType("uint32_t")
        public int stdOperatingPointCount() { return VkVideoEncodeAV1SessionParametersCreateInfoKHR.nstdOperatingPointCount(address()); }
        /** @return a {@link StdVideoEncodeAV1OperatingPointInfo.Buffer} view of the struct array pointed to by the {@code pStdOperatingPoints} field. */
        @NativeType("StdVideoEncodeAV1OperatingPointInfo const *")
        public StdVideoEncodeAV1OperatingPointInfo.@Nullable Buffer pStdOperatingPoints() { return VkVideoEncodeAV1SessionParametersCreateInfoKHR.npStdOperatingPoints(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeAV1SessionParametersCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeAV1SessionParametersCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR} value to the {@code sType} field. */
        public VkVideoEncodeAV1SessionParametersCreateInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeAV1SessionParametersCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeAV1SessionParametersCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoAV1SequenceHeader} to the {@code pStdSequenceHeader} field. */
        public VkVideoEncodeAV1SessionParametersCreateInfoKHR.Buffer pStdSequenceHeader(@NativeType("StdVideoAV1SequenceHeader const *") StdVideoAV1SequenceHeader value) { VkVideoEncodeAV1SessionParametersCreateInfoKHR.npStdSequenceHeader(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeAV1DecoderModelInfo} to the {@code pStdDecoderModelInfo} field. */
        public VkVideoEncodeAV1SessionParametersCreateInfoKHR.Buffer pStdDecoderModelInfo(@Nullable @NativeType("StdVideoEncodeAV1DecoderModelInfo const *") StdVideoEncodeAV1DecoderModelInfo value) { VkVideoEncodeAV1SessionParametersCreateInfoKHR.npStdDecoderModelInfo(address(), value); return this; }
        /** Sets the specified value to the {@code stdOperatingPointCount} field. */
        public VkVideoEncodeAV1SessionParametersCreateInfoKHR.Buffer stdOperatingPointCount(@NativeType("uint32_t") int value) { VkVideoEncodeAV1SessionParametersCreateInfoKHR.nstdOperatingPointCount(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeAV1OperatingPointInfo.Buffer} to the {@code pStdOperatingPoints} field. */
        public VkVideoEncodeAV1SessionParametersCreateInfoKHR.Buffer pStdOperatingPoints(@NativeType("StdVideoEncodeAV1OperatingPointInfo const *") StdVideoEncodeAV1OperatingPointInfo.@Nullable Buffer value) { VkVideoEncodeAV1SessionParametersCreateInfoKHR.npStdOperatingPoints(address(), value); return this; }

    }

}