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
 * Structure specifies H.264 decoder parameter set information.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure <b>can</b> be specified in the following places:</p>
 * 
 * <ul>
 * <li>In the {@code pParametersAddInfo} member of the {@link VkVideoDecodeH264SessionParametersCreateInfoKHR} structure specified in the {@code pNext} chain of {@link VkVideoSessionParametersCreateInfoKHR} used to create a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-session-parameters">video session parameters</a> object. In this case, if the video codec operation the video session parameters object is created with is {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR}, then it defines the set of initial parameters to add to the created object (see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#creating-video-session-parameters">Creating Video Session Parameters</a>).</li>
 * <li>In the {@code pNext} chain of {@link VkVideoSessionParametersUpdateInfoKHR}. In this case, if the video codec operation the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-session-parameters">video session parameters</a> object to be updated was created with is {@link KHRVideoDecodeH264#VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR}, then it defines the set of parameters to add to it (see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-session-parameters-update">Updating Video Session Parameters</a>).</li>
 * </ul>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The {@code seq_parameter_set_id} member of each {@code StdVideoH264SequenceParameterSet} structure specified in the elements of {@code pStdSPSs} <b>must</b> be unique within {@code pStdSPSs}</li>
 * <li>The pair constructed from the {@code seq_parameter_set_id} and {@code pic_parameter_set_id} members of each {@code StdVideoH264PictureParameterSet} structure specified in the elements of {@code pStdPPSs} <b>must</b> be unique within {@code pStdPPSs}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR}</li>
 * <li>If {@code stdSPSCount} is not 0, {@code pStdSPSs} <b>must</b> be a valid pointer to an array of {@code stdSPSCount} {@code StdVideoH264SequenceParameterSet} values</li>
 * <li>If {@code stdPPSCount} is not 0, {@code pStdPPSs} <b>must</b> be a valid pointer to an array of {@code stdPPSCount} {@code StdVideoH264PictureParameterSet} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoDecodeH264SessionParametersCreateInfoKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoDecodeH264SessionParametersAddInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #stdSPSCount};
 *     {@link StdVideoH264SequenceParameterSet StdVideoH264SequenceParameterSet} const * {@link #pStdSPSs};
 *     uint32_t {@link #stdPPSCount};
 *     {@link StdVideoH264PictureParameterSet StdVideoH264PictureParameterSet} const * {@link #pStdPPSs};
 * }</code></pre>
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

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the number of elements in the {@code pStdSPSs} array. */
    @NativeType("uint32_t")
    public int stdSPSCount() { return nstdSPSCount(address()); }
    /** a pointer to an array of {@code StdVideoH264SequenceParameterSet} structures describing the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-sps">H.264 SPS</a> entries to add. */
    @Nullable
    @NativeType("StdVideoH264SequenceParameterSet const *")
    public StdVideoH264SequenceParameterSet.Buffer pStdSPSs() { return npStdSPSs(address()); }
    /** the number of elements in the {@code pStdPPSs} array. */
    @NativeType("uint32_t")
    public int stdPPSCount() { return nstdPPSCount(address()); }
    /** a pointer to an array of {@code StdVideoH264PictureParameterSet} structures describing the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-pps">H.264 PPS</a> entries to add. */
    @Nullable
    @NativeType("StdVideoH264PictureParameterSet const *")
    public StdVideoH264PictureParameterSet.Buffer pStdPPSs() { return npStdPPSs(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoDecodeH264SessionParametersAddInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoDecodeH264SessionParametersAddInfoKHR sType$Default() { return sType(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoDecodeH264SessionParametersAddInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH264SequenceParameterSet.Buffer} to the {@link #pStdSPSs} field. */
    public VkVideoDecodeH264SessionParametersAddInfoKHR pStdSPSs(@Nullable @NativeType("StdVideoH264SequenceParameterSet const *") StdVideoH264SequenceParameterSet.Buffer value) { npStdSPSs(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH264PictureParameterSet.Buffer} to the {@link #pStdPPSs} field. */
    public VkVideoDecodeH264SessionParametersAddInfoKHR pStdPPSs(@Nullable @NativeType("StdVideoH264PictureParameterSet const *") StdVideoH264PictureParameterSet.Buffer value) { npStdPPSs(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeH264SessionParametersAddInfoKHR set(
        int sType,
        long pNext,
        @Nullable StdVideoH264SequenceParameterSet.Buffer pStdSPSs,
        @Nullable StdVideoH264PictureParameterSet.Buffer pStdPPSs
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
    @Nullable
    public static VkVideoDecodeH264SessionParametersAddInfoKHR createSafe(long address) {
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
    @Nullable
    public static VkVideoDecodeH264SessionParametersAddInfoKHR.Buffer createSafe(long address, int capacity) {
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
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264SessionParametersAddInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeH264SessionParametersAddInfoKHR.PNEXT); }
    /** Unsafe version of {@link #stdSPSCount}. */
    public static int nstdSPSCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264SessionParametersAddInfoKHR.STDSPSCOUNT); }
    /** Unsafe version of {@link #pStdSPSs}. */
    @Nullable public static StdVideoH264SequenceParameterSet.Buffer npStdSPSs(long struct) { return StdVideoH264SequenceParameterSet.createSafe(memGetAddress(struct + VkVideoDecodeH264SessionParametersAddInfoKHR.PSTDSPSS), nstdSPSCount(struct)); }
    /** Unsafe version of {@link #stdPPSCount}. */
    public static int nstdPPSCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264SessionParametersAddInfoKHR.STDPPSCOUNT); }
    /** Unsafe version of {@link #pStdPPSs}. */
    @Nullable public static StdVideoH264PictureParameterSet.Buffer npStdPPSs(long struct) { return StdVideoH264PictureParameterSet.createSafe(memGetAddress(struct + VkVideoDecodeH264SessionParametersAddInfoKHR.PSTDPPSS), nstdPPSCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264SessionParametersAddInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeH264SessionParametersAddInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code stdSPSCount} field of the specified {@code struct}. */
    public static void nstdSPSCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264SessionParametersAddInfoKHR.STDSPSCOUNT, value); }
    /** Unsafe version of {@link #pStdSPSs(StdVideoH264SequenceParameterSet.Buffer) pStdSPSs}. */
    public static void npStdSPSs(long struct, @Nullable StdVideoH264SequenceParameterSet.Buffer value) { memPutAddress(struct + VkVideoDecodeH264SessionParametersAddInfoKHR.PSTDSPSS, memAddressSafe(value)); nstdSPSCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code stdPPSCount} field of the specified {@code struct}. */
    public static void nstdPPSCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264SessionParametersAddInfoKHR.STDPPSCOUNT, value); }
    /** Unsafe version of {@link #pStdPPSs(StdVideoH264PictureParameterSet.Buffer) pStdPPSs}. */
    public static void npStdPPSs(long struct, @Nullable StdVideoH264PictureParameterSet.Buffer value) { memPutAddress(struct + VkVideoDecodeH264SessionParametersAddInfoKHR.PSTDPPSS, memAddressSafe(value)); nstdPPSCount(struct, value == null ? 0 : value.remaining()); }

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
        protected VkVideoDecodeH264SessionParametersAddInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoDecodeH264SessionParametersAddInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeH264SessionParametersAddInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoDecodeH264SessionParametersAddInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeH264SessionParametersAddInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoDecodeH264SessionParametersAddInfoKHR#stdSPSCount} field. */
        @NativeType("uint32_t")
        public int stdSPSCount() { return VkVideoDecodeH264SessionParametersAddInfoKHR.nstdSPSCount(address()); }
        /** @return a {@link StdVideoH264SequenceParameterSet.Buffer} view of the struct array pointed to by the {@link VkVideoDecodeH264SessionParametersAddInfoKHR#pStdSPSs} field. */
        @Nullable
        @NativeType("StdVideoH264SequenceParameterSet const *")
        public StdVideoH264SequenceParameterSet.Buffer pStdSPSs() { return VkVideoDecodeH264SessionParametersAddInfoKHR.npStdSPSs(address()); }
        /** @return the value of the {@link VkVideoDecodeH264SessionParametersAddInfoKHR#stdPPSCount} field. */
        @NativeType("uint32_t")
        public int stdPPSCount() { return VkVideoDecodeH264SessionParametersAddInfoKHR.nstdPPSCount(address()); }
        /** @return a {@link StdVideoH264PictureParameterSet.Buffer} view of the struct array pointed to by the {@link VkVideoDecodeH264SessionParametersAddInfoKHR#pStdPPSs} field. */
        @Nullable
        @NativeType("StdVideoH264PictureParameterSet const *")
        public StdVideoH264PictureParameterSet.Buffer pStdPPSs() { return VkVideoDecodeH264SessionParametersAddInfoKHR.npStdPPSs(address()); }

        /** Sets the specified value to the {@link VkVideoDecodeH264SessionParametersAddInfoKHR#sType} field. */
        public VkVideoDecodeH264SessionParametersAddInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeH264SessionParametersAddInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR} value to the {@link VkVideoDecodeH264SessionParametersAddInfoKHR#sType} field. */
        public VkVideoDecodeH264SessionParametersAddInfoKHR.Buffer sType$Default() { return sType(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoDecodeH264SessionParametersAddInfoKHR#pNext} field. */
        public VkVideoDecodeH264SessionParametersAddInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeH264SessionParametersAddInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH264SequenceParameterSet.Buffer} to the {@link VkVideoDecodeH264SessionParametersAddInfoKHR#pStdSPSs} field. */
        public VkVideoDecodeH264SessionParametersAddInfoKHR.Buffer pStdSPSs(@Nullable @NativeType("StdVideoH264SequenceParameterSet const *") StdVideoH264SequenceParameterSet.Buffer value) { VkVideoDecodeH264SessionParametersAddInfoKHR.npStdSPSs(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH264PictureParameterSet.Buffer} to the {@link VkVideoDecodeH264SessionParametersAddInfoKHR#pStdPPSs} field. */
        public VkVideoDecodeH264SessionParametersAddInfoKHR.Buffer pStdPPSs(@Nullable @NativeType("StdVideoH264PictureParameterSet const *") StdVideoH264PictureParameterSet.Buffer value) { VkVideoDecodeH264SessionParametersAddInfoKHR.npStdPPSs(address(), value); return this; }

    }

}