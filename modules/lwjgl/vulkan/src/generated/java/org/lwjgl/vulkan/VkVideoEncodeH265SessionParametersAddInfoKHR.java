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
 * Structure specifies H.265 encoder parameter set information.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure <b>can</b> be specified in the following places:</p>
 * 
 * <ul>
 * <li>In the {@code pParametersAddInfo} member of the {@link VkVideoEncodeH265SessionParametersCreateInfoKHR} structure specified in the {@code pNext} chain of {@link VkVideoSessionParametersCreateInfoKHR} used to create a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-session-parameters">video session parameters</a> object. In this case, if the video codec operation the video session parameters object is created with is {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, then it defines the set of initial parameters to add to the created object (see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#creating-video-session-parameters">Creating Video Session Parameters</a>).</li>
 * <li>In the {@code pNext} chain of {@link VkVideoSessionParametersUpdateInfoKHR}. In this case, if the video codec operation the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-session-parameters">video session parameters</a> object to be updated was created with is {@link KHRVideoEncodeH265#VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR}, then it defines the set of parameters to add to it (see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-session-parameters-update">Updating Video Session Parameters</a>).</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR}</li>
 * <li>If {@code stdVPSCount} is not 0, and {@code pStdVPSs} is not {@code NULL}, {@code pStdVPSs} <b>must</b> be a valid pointer to an array of {@code stdVPSCount} {@code StdVideoH265VideoParameterSet} values</li>
 * <li>If {@code stdSPSCount} is not 0, and {@code pStdSPSs} is not {@code NULL}, {@code pStdSPSs} <b>must</b> be a valid pointer to an array of {@code stdSPSCount} {@code StdVideoH265SequenceParameterSet} values</li>
 * <li>If {@code stdPPSCount} is not 0, and {@code pStdPPSs} is not {@code NULL}, {@code pStdPPSs} <b>must</b> be a valid pointer to an array of {@code stdPPSCount} {@code StdVideoH265PictureParameterSet} values</li>
 * </ul>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The {@code vps_video_parameter_set_id} member of each {@code StdVideoH265VideoParameterSet} structure specified in the elements of {@code pStdVPSs} <b>must</b> be unique within {@code pStdVPSs}</li>
 * <li>The pair constructed from the {@code sps_video_parameter_set_id} and {@code sps_seq_parameter_set_id} members of each {@code StdVideoH265SequenceParameterSet} structure specified in the elements of {@code pStdSPSs} <b>must</b> be unique within {@code pStdSPSs}</li>
 * <li>The triplet constructed from the {@code sps_video_parameter_set_id}, {@code pps_seq_parameter_set_id}, and {@code pps_pic_parameter_set_id} members of each {@code StdVideoH265PictureParameterSet} structure specified in the elements of {@code pStdPPSs} <b>must</b> be unique within {@code pStdPPSs}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH265SessionParametersCreateInfoKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265SessionParametersAddInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #stdVPSCount};
 *     {@link StdVideoH265VideoParameterSet StdVideoH265VideoParameterSet} const * {@link #pStdVPSs};
 *     uint32_t {@link #stdSPSCount};
 *     {@link StdVideoH265SequenceParameterSet StdVideoH265SequenceParameterSet} const * {@link #pStdSPSs};
 *     uint32_t {@link #stdPPSCount};
 *     {@link StdVideoH265PictureParameterSet StdVideoH265PictureParameterSet} const * {@link #pStdPPSs};
 * }</code></pre>
 */
public class VkVideoEncodeH265SessionParametersAddInfoKHR extends Struct<VkVideoEncodeH265SessionParametersAddInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STDVPSCOUNT,
        PSTDVPSS,
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
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STDVPSCOUNT = layout.offsetof(2);
        PSTDVPSS = layout.offsetof(3);
        STDSPSCOUNT = layout.offsetof(4);
        PSTDSPSS = layout.offsetof(5);
        STDPPSCOUNT = layout.offsetof(6);
        PSTDPPSS = layout.offsetof(7);
    }

    protected VkVideoEncodeH265SessionParametersAddInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265SessionParametersAddInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265SessionParametersAddInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265SessionParametersAddInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265SessionParametersAddInfoKHR(ByteBuffer container) {
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
    /** the number of elements in the {@code pStdVPSs} array. */
    @NativeType("uint32_t")
    public int stdVPSCount() { return nstdVPSCount(address()); }
    /** a pointer to an array of {@code StdVideoH265VideoParameterSet} structures describing the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-vps">H.265 VPS</a> entries to add. */
    @NativeType("StdVideoH265VideoParameterSet const *")
    public StdVideoH265VideoParameterSet.@Nullable Buffer pStdVPSs() { return npStdVPSs(address()); }
    /** the number of elements in the {@code pStdSPSs} array. */
    @NativeType("uint32_t")
    public int stdSPSCount() { return nstdSPSCount(address()); }
    /** a pointer to an array of {@code StdVideoH265SequenceParameterSet} structures describing the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-sps">H.265 SPS</a> entries to add. */
    @NativeType("StdVideoH265SequenceParameterSet const *")
    public StdVideoH265SequenceParameterSet.@Nullable Buffer pStdSPSs() { return npStdSPSs(address()); }
    /** the number of elements in the {@code pStdPPSs} array. */
    @NativeType("uint32_t")
    public int stdPPSCount() { return nstdPPSCount(address()); }
    /** a pointer to an array of {@code StdVideoH265PictureParameterSet} structures describing the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-pps">H.265 PPS</a> entries to add. */
    @NativeType("StdVideoH265PictureParameterSet const *")
    public StdVideoH265PictureParameterSet.@Nullable Buffer pStdPPSs() { return npStdPPSs(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265SessionParametersAddInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeH265SessionParametersAddInfoKHR sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265SessionParametersAddInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #stdVPSCount} field. */
    public VkVideoEncodeH265SessionParametersAddInfoKHR stdVPSCount(@NativeType("uint32_t") int value) { nstdVPSCount(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH265VideoParameterSet.Buffer} to the {@link #pStdVPSs} field. */
    public VkVideoEncodeH265SessionParametersAddInfoKHR pStdVPSs(@NativeType("StdVideoH265VideoParameterSet const *") StdVideoH265VideoParameterSet.@Nullable Buffer value) { npStdVPSs(address(), value); return this; }
    /** Sets the specified value to the {@link #stdSPSCount} field. */
    public VkVideoEncodeH265SessionParametersAddInfoKHR stdSPSCount(@NativeType("uint32_t") int value) { nstdSPSCount(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH265SequenceParameterSet.Buffer} to the {@link #pStdSPSs} field. */
    public VkVideoEncodeH265SessionParametersAddInfoKHR pStdSPSs(@NativeType("StdVideoH265SequenceParameterSet const *") StdVideoH265SequenceParameterSet.@Nullable Buffer value) { npStdSPSs(address(), value); return this; }
    /** Sets the specified value to the {@link #stdPPSCount} field. */
    public VkVideoEncodeH265SessionParametersAddInfoKHR stdPPSCount(@NativeType("uint32_t") int value) { nstdPPSCount(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH265PictureParameterSet.Buffer} to the {@link #pStdPPSs} field. */
    public VkVideoEncodeH265SessionParametersAddInfoKHR pStdPPSs(@NativeType("StdVideoH265PictureParameterSet const *") StdVideoH265PictureParameterSet.@Nullable Buffer value) { npStdPPSs(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265SessionParametersAddInfoKHR set(
        int sType,
        long pNext,
        int stdVPSCount,
        StdVideoH265VideoParameterSet.@Nullable Buffer pStdVPSs,
        int stdSPSCount,
        StdVideoH265SequenceParameterSet.@Nullable Buffer pStdSPSs,
        int stdPPSCount,
        StdVideoH265PictureParameterSet.@Nullable Buffer pStdPPSs
    ) {
        sType(sType);
        pNext(pNext);
        stdVPSCount(stdVPSCount);
        pStdVPSs(pStdVPSs);
        stdSPSCount(stdSPSCount);
        pStdSPSs(pStdSPSs);
        stdPPSCount(stdPPSCount);
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
    public VkVideoEncodeH265SessionParametersAddInfoKHR set(VkVideoEncodeH265SessionParametersAddInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265SessionParametersAddInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265SessionParametersAddInfoKHR malloc() {
        return new VkVideoEncodeH265SessionParametersAddInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionParametersAddInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265SessionParametersAddInfoKHR calloc() {
        return new VkVideoEncodeH265SessionParametersAddInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionParametersAddInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265SessionParametersAddInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265SessionParametersAddInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionParametersAddInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeH265SessionParametersAddInfoKHR create(long address) {
        return new VkVideoEncodeH265SessionParametersAddInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH265SessionParametersAddInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265SessionParametersAddInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersAddInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersAddInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersAddInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersAddInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersAddInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersAddInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265SessionParametersAddInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersAddInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH265SessionParametersAddInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265SessionParametersAddInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265SessionParametersAddInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersAddInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265SessionParametersAddInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265SessionParametersAddInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersAddInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersAddInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersAddInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersAddInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersAddInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeH265SessionParametersAddInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265SessionParametersAddInfoKHR.PNEXT); }
    /** Unsafe version of {@link #stdVPSCount}. */
    public static int nstdVPSCount(long struct) { return memGetInt(struct + VkVideoEncodeH265SessionParametersAddInfoKHR.STDVPSCOUNT); }
    /** Unsafe version of {@link #pStdVPSs}. */
    public static StdVideoH265VideoParameterSet.@Nullable Buffer npStdVPSs(long struct) { return StdVideoH265VideoParameterSet.createSafe(memGetAddress(struct + VkVideoEncodeH265SessionParametersAddInfoKHR.PSTDVPSS), nstdVPSCount(struct)); }
    /** Unsafe version of {@link #stdSPSCount}. */
    public static int nstdSPSCount(long struct) { return memGetInt(struct + VkVideoEncodeH265SessionParametersAddInfoKHR.STDSPSCOUNT); }
    /** Unsafe version of {@link #pStdSPSs}. */
    public static StdVideoH265SequenceParameterSet.@Nullable Buffer npStdSPSs(long struct) { return StdVideoH265SequenceParameterSet.createSafe(memGetAddress(struct + VkVideoEncodeH265SessionParametersAddInfoKHR.PSTDSPSS), nstdSPSCount(struct)); }
    /** Unsafe version of {@link #stdPPSCount}. */
    public static int nstdPPSCount(long struct) { return memGetInt(struct + VkVideoEncodeH265SessionParametersAddInfoKHR.STDPPSCOUNT); }
    /** Unsafe version of {@link #pStdPPSs}. */
    public static StdVideoH265PictureParameterSet.@Nullable Buffer npStdPPSs(long struct) { return StdVideoH265PictureParameterSet.createSafe(memGetAddress(struct + VkVideoEncodeH265SessionParametersAddInfoKHR.PSTDPPSS), nstdPPSCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeH265SessionParametersAddInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265SessionParametersAddInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code stdVPSCount} field of the specified {@code struct}. */
    public static void nstdVPSCount(long struct, int value) { memPutInt(struct + VkVideoEncodeH265SessionParametersAddInfoKHR.STDVPSCOUNT, value); }
    /** Unsafe version of {@link #pStdVPSs(StdVideoH265VideoParameterSet.Buffer) pStdVPSs}. */
    public static void npStdVPSs(long struct, StdVideoH265VideoParameterSet.@Nullable Buffer value) { memPutAddress(struct + VkVideoEncodeH265SessionParametersAddInfoKHR.PSTDVPSS, memAddressSafe(value)); if (value != null) { nstdVPSCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code stdSPSCount} field of the specified {@code struct}. */
    public static void nstdSPSCount(long struct, int value) { memPutInt(struct + VkVideoEncodeH265SessionParametersAddInfoKHR.STDSPSCOUNT, value); }
    /** Unsafe version of {@link #pStdSPSs(StdVideoH265SequenceParameterSet.Buffer) pStdSPSs}. */
    public static void npStdSPSs(long struct, StdVideoH265SequenceParameterSet.@Nullable Buffer value) { memPutAddress(struct + VkVideoEncodeH265SessionParametersAddInfoKHR.PSTDSPSS, memAddressSafe(value)); if (value != null) { nstdSPSCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code stdPPSCount} field of the specified {@code struct}. */
    public static void nstdPPSCount(long struct, int value) { memPutInt(struct + VkVideoEncodeH265SessionParametersAddInfoKHR.STDPPSCOUNT, value); }
    /** Unsafe version of {@link #pStdPPSs(StdVideoH265PictureParameterSet.Buffer) pStdPPSs}. */
    public static void npStdPPSs(long struct, StdVideoH265PictureParameterSet.@Nullable Buffer value) { memPutAddress(struct + VkVideoEncodeH265SessionParametersAddInfoKHR.PSTDPPSS, memAddressSafe(value)); if (value != null) { nstdPPSCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265SessionParametersAddInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265SessionParametersAddInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265SessionParametersAddInfoKHR ELEMENT_FACTORY = VkVideoEncodeH265SessionParametersAddInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265SessionParametersAddInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265SessionParametersAddInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH265SessionParametersAddInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265SessionParametersAddInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265SessionParametersAddInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersAddInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265SessionParametersAddInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersAddInfoKHR#stdVPSCount} field. */
        @NativeType("uint32_t")
        public int stdVPSCount() { return VkVideoEncodeH265SessionParametersAddInfoKHR.nstdVPSCount(address()); }
        /** @return a {@link StdVideoH265VideoParameterSet.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH265SessionParametersAddInfoKHR#pStdVPSs} field. */
        @NativeType("StdVideoH265VideoParameterSet const *")
        public StdVideoH265VideoParameterSet.@Nullable Buffer pStdVPSs() { return VkVideoEncodeH265SessionParametersAddInfoKHR.npStdVPSs(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersAddInfoKHR#stdSPSCount} field. */
        @NativeType("uint32_t")
        public int stdSPSCount() { return VkVideoEncodeH265SessionParametersAddInfoKHR.nstdSPSCount(address()); }
        /** @return a {@link StdVideoH265SequenceParameterSet.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH265SessionParametersAddInfoKHR#pStdSPSs} field. */
        @NativeType("StdVideoH265SequenceParameterSet const *")
        public StdVideoH265SequenceParameterSet.@Nullable Buffer pStdSPSs() { return VkVideoEncodeH265SessionParametersAddInfoKHR.npStdSPSs(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersAddInfoKHR#stdPPSCount} field. */
        @NativeType("uint32_t")
        public int stdPPSCount() { return VkVideoEncodeH265SessionParametersAddInfoKHR.nstdPPSCount(address()); }
        /** @return a {@link StdVideoH265PictureParameterSet.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH265SessionParametersAddInfoKHR#pStdPPSs} field. */
        @NativeType("StdVideoH265PictureParameterSet const *")
        public StdVideoH265PictureParameterSet.@Nullable Buffer pStdPPSs() { return VkVideoEncodeH265SessionParametersAddInfoKHR.npStdPPSs(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersAddInfoKHR#sType} field. */
        public VkVideoEncodeH265SessionParametersAddInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265SessionParametersAddInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR} value to the {@link VkVideoEncodeH265SessionParametersAddInfoKHR#sType} field. */
        public VkVideoEncodeH265SessionParametersAddInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersAddInfoKHR#pNext} field. */
        public VkVideoEncodeH265SessionParametersAddInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265SessionParametersAddInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersAddInfoKHR#stdVPSCount} field. */
        public VkVideoEncodeH265SessionParametersAddInfoKHR.Buffer stdVPSCount(@NativeType("uint32_t") int value) { VkVideoEncodeH265SessionParametersAddInfoKHR.nstdVPSCount(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH265VideoParameterSet.Buffer} to the {@link VkVideoEncodeH265SessionParametersAddInfoKHR#pStdVPSs} field. */
        public VkVideoEncodeH265SessionParametersAddInfoKHR.Buffer pStdVPSs(@NativeType("StdVideoH265VideoParameterSet const *") StdVideoH265VideoParameterSet.@Nullable Buffer value) { VkVideoEncodeH265SessionParametersAddInfoKHR.npStdVPSs(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersAddInfoKHR#stdSPSCount} field. */
        public VkVideoEncodeH265SessionParametersAddInfoKHR.Buffer stdSPSCount(@NativeType("uint32_t") int value) { VkVideoEncodeH265SessionParametersAddInfoKHR.nstdSPSCount(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH265SequenceParameterSet.Buffer} to the {@link VkVideoEncodeH265SessionParametersAddInfoKHR#pStdSPSs} field. */
        public VkVideoEncodeH265SessionParametersAddInfoKHR.Buffer pStdSPSs(@NativeType("StdVideoH265SequenceParameterSet const *") StdVideoH265SequenceParameterSet.@Nullable Buffer value) { VkVideoEncodeH265SessionParametersAddInfoKHR.npStdSPSs(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersAddInfoKHR#stdPPSCount} field. */
        public VkVideoEncodeH265SessionParametersAddInfoKHR.Buffer stdPPSCount(@NativeType("uint32_t") int value) { VkVideoEncodeH265SessionParametersAddInfoKHR.nstdPPSCount(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH265PictureParameterSet.Buffer} to the {@link VkVideoEncodeH265SessionParametersAddInfoKHR#pStdPPSs} field. */
        public VkVideoEncodeH265SessionParametersAddInfoKHR.Buffer pStdPPSs(@NativeType("StdVideoH265PictureParameterSet const *") StdVideoH265PictureParameterSet.@Nullable Buffer value) { VkVideoEncodeH265SessionParametersAddInfoKHR.npStdPPSs(address(), value); return this; }

    }

}