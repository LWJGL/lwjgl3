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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.video.*;

/**
 * Structure specifies H.264 encoder parameter set information.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The values of {@code stdSPSCount} and {@code stdPPSCount} <b>must</b> be less than or equal to the values of {@code maxStdSPSCount} and {@code maxStdPPSCount}, respectively</li>
 * <li>When the {@code maxStdSPSCount} number of parameters of type StdVideoH264SequenceParameterSet in the Video Session Parameters object is reached, no additional parameters of that type can be added to the object. {@link VK10#VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS} will be returned if an attempt is made to add additional data to this object at this point</li>
 * <li>When the {@code maxStdPPSCount} number of parameters of type StdVideoH264PictureParameterSet in the Video Session Parameters object is reached, no additional parameters of that type can be added to the object. {@link VK10#VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS} will be returned if an attempt is made to add additional data to this object at this point</li>
 * <li>Each entry to be added <b>must</b> have a unique, to the rest of the parameter array entries and the existing parameters in the Video Session Parameters Object that is being updated, SPS-PPS IDs</li>
 * <li>Parameter entries that already exist in Video Session Parameters object with a particular SPS-PPS IDs <b>cannot</b> be replaced nor updated</li>
 * <li>When creating a new object using a Video Session Parameters as a template, the array’s parameters with the same SPS-PPS IDs as the ones from the template take precedence</li>
 * <li>SPS/PPS parameters <b>must</b> comply with the limits specified in {@link VkVideoSessionCreateInfoKHR} during Video Session creation</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT}</li>
 * <li>If {@code stdSPSCount} is not 0, and {@code pStdSPSs} is not {@code NULL}, {@code pStdSPSs} <b>must</b> be a valid pointer to an array of {@code stdSPSCount} {@code StdVideoH264SequenceParameterSet} values</li>
 * <li>If {@code stdPPSCount} is not 0, and {@code pStdPPSs} is not {@code NULL}, {@code pStdPPSs} <b>must</b> be a valid pointer to an array of {@code stdPPSCount} {@code StdVideoH264PictureParameterSet} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH264SessionParametersCreateInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH264SessionParametersAddInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #stdSPSCount};
 *     {@link StdVideoH264SequenceParameterSet StdVideoH264SequenceParameterSet} const * {@link #pStdSPSs};
 *     uint32_t {@link #stdPPSCount};
 *     {@link StdVideoH264PictureParameterSet StdVideoH264PictureParameterSet} const * {@link #pStdPPSs};
 * }</code></pre>
 */
public class VkVideoEncodeH264SessionParametersAddInfoEXT extends Struct<VkVideoEncodeH264SessionParametersAddInfoEXT> implements NativeResource {

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

    protected VkVideoEncodeH264SessionParametersAddInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH264SessionParametersAddInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264SessionParametersAddInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH264SessionParametersAddInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264SessionParametersAddInfoEXT(ByteBuffer container) {
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
    /** the number of SPS elements in the {@code pStdSPSs}. Its value <b>must</b> be less than or equal to the value of {@code maxStdSPSCount}. */
    @NativeType("uint32_t")
    public int stdSPSCount() { return nstdSPSCount(address()); }
    /** a pointer to an array of {@code StdVideoH264SequenceParameterSet} structures representing H.264 sequence parameter sets. Each element of the array <b>must</b> have a unique H.264 SPS ID. */
    @Nullable
    @NativeType("StdVideoH264SequenceParameterSet const *")
    public StdVideoH264SequenceParameterSet.Buffer pStdSPSs() { return npStdSPSs(address()); }
    /** the number of PPS provided in {@code pStdPPSs}. Its value <b>must</b> be less than or equal to the value of {@code maxStdPPSCount}. */
    @NativeType("uint32_t")
    public int stdPPSCount() { return nstdPPSCount(address()); }
    /** a pointer to an array of {@code StdVideoH264PictureParameterSet} structures representing H.264 picture parameter sets. Each element of the array <b>must</b> have a unique H.264 SPS-PPS ID pair. */
    @Nullable
    @NativeType("StdVideoH264PictureParameterSet const *")
    public StdVideoH264PictureParameterSet.Buffer pStdPPSs() { return npStdPPSs(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH264SessionParametersAddInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH264SessionParametersAddInfoEXT sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH264SessionParametersAddInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #stdSPSCount} field. */
    public VkVideoEncodeH264SessionParametersAddInfoEXT stdSPSCount(@NativeType("uint32_t") int value) { nstdSPSCount(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH264SequenceParameterSet.Buffer} to the {@link #pStdSPSs} field. */
    public VkVideoEncodeH264SessionParametersAddInfoEXT pStdSPSs(@Nullable @NativeType("StdVideoH264SequenceParameterSet const *") StdVideoH264SequenceParameterSet.Buffer value) { npStdSPSs(address(), value); return this; }
    /** Sets the specified value to the {@link #stdPPSCount} field. */
    public VkVideoEncodeH264SessionParametersAddInfoEXT stdPPSCount(@NativeType("uint32_t") int value) { nstdPPSCount(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH264PictureParameterSet.Buffer} to the {@link #pStdPPSs} field. */
    public VkVideoEncodeH264SessionParametersAddInfoEXT pStdPPSs(@Nullable @NativeType("StdVideoH264PictureParameterSet const *") StdVideoH264PictureParameterSet.Buffer value) { npStdPPSs(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264SessionParametersAddInfoEXT set(
        int sType,
        long pNext,
        int stdSPSCount,
        @Nullable StdVideoH264SequenceParameterSet.Buffer pStdSPSs,
        int stdPPSCount,
        @Nullable StdVideoH264PictureParameterSet.Buffer pStdPPSs
    ) {
        sType(sType);
        pNext(pNext);
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
    public VkVideoEncodeH264SessionParametersAddInfoEXT set(VkVideoEncodeH264SessionParametersAddInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264SessionParametersAddInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264SessionParametersAddInfoEXT malloc() {
        return new VkVideoEncodeH264SessionParametersAddInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264SessionParametersAddInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264SessionParametersAddInfoEXT calloc() {
        return new VkVideoEncodeH264SessionParametersAddInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264SessionParametersAddInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264SessionParametersAddInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264SessionParametersAddInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264SessionParametersAddInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH264SessionParametersAddInfoEXT create(long address) {
        return new VkVideoEncodeH264SessionParametersAddInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264SessionParametersAddInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH264SessionParametersAddInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264SessionParametersAddInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264SessionParametersAddInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionParametersAddInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264SessionParametersAddInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264SessionParametersAddInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionParametersAddInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264SessionParametersAddInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264SessionParametersAddInfoEXT.PNEXT); }
    /** Unsafe version of {@link #stdSPSCount}. */
    public static int nstdSPSCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264SessionParametersAddInfoEXT.STDSPSCOUNT); }
    /** Unsafe version of {@link #pStdSPSs}. */
    @Nullable public static StdVideoH264SequenceParameterSet.Buffer npStdSPSs(long struct) { return StdVideoH264SequenceParameterSet.createSafe(memGetAddress(struct + VkVideoEncodeH264SessionParametersAddInfoEXT.PSTDSPSS), nstdSPSCount(struct)); }
    /** Unsafe version of {@link #stdPPSCount}. */
    public static int nstdPPSCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264SessionParametersAddInfoEXT.STDPPSCOUNT); }
    /** Unsafe version of {@link #pStdPPSs}. */
    @Nullable public static StdVideoH264PictureParameterSet.Buffer npStdPPSs(long struct) { return StdVideoH264PictureParameterSet.createSafe(memGetAddress(struct + VkVideoEncodeH264SessionParametersAddInfoEXT.PSTDPPSS), nstdPPSCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264SessionParametersAddInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264SessionParametersAddInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code stdSPSCount} field of the specified {@code struct}. */
    public static void nstdSPSCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264SessionParametersAddInfoEXT.STDSPSCOUNT, value); }
    /** Unsafe version of {@link #pStdSPSs(StdVideoH264SequenceParameterSet.Buffer) pStdSPSs}. */
    public static void npStdSPSs(long struct, @Nullable StdVideoH264SequenceParameterSet.Buffer value) { memPutAddress(struct + VkVideoEncodeH264SessionParametersAddInfoEXT.PSTDSPSS, memAddressSafe(value)); if (value != null) { nstdSPSCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code stdPPSCount} field of the specified {@code struct}. */
    public static void nstdPPSCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264SessionParametersAddInfoEXT.STDPPSCOUNT, value); }
    /** Unsafe version of {@link #pStdPPSs(StdVideoH264PictureParameterSet.Buffer) pStdPPSs}. */
    public static void npStdPPSs(long struct, @Nullable StdVideoH264PictureParameterSet.Buffer value) { memPutAddress(struct + VkVideoEncodeH264SessionParametersAddInfoEXT.PSTDPPSS, memAddressSafe(value)); if (value != null) { nstdPPSCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264SessionParametersAddInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264SessionParametersAddInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264SessionParametersAddInfoEXT ELEMENT_FACTORY = VkVideoEncodeH264SessionParametersAddInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264SessionParametersAddInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH264SessionParametersAddInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH264SessionParametersAddInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264SessionParametersAddInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH264SessionParametersAddInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264SessionParametersAddInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH264SessionParametersAddInfoEXT#stdSPSCount} field. */
        @NativeType("uint32_t")
        public int stdSPSCount() { return VkVideoEncodeH264SessionParametersAddInfoEXT.nstdSPSCount(address()); }
        /** @return a {@link StdVideoH264SequenceParameterSet.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH264SessionParametersAddInfoEXT#pStdSPSs} field. */
        @Nullable
        @NativeType("StdVideoH264SequenceParameterSet const *")
        public StdVideoH264SequenceParameterSet.Buffer pStdSPSs() { return VkVideoEncodeH264SessionParametersAddInfoEXT.npStdSPSs(address()); }
        /** @return the value of the {@link VkVideoEncodeH264SessionParametersAddInfoEXT#stdPPSCount} field. */
        @NativeType("uint32_t")
        public int stdPPSCount() { return VkVideoEncodeH264SessionParametersAddInfoEXT.nstdPPSCount(address()); }
        /** @return a {@link StdVideoH264PictureParameterSet.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH264SessionParametersAddInfoEXT#pStdPPSs} field. */
        @Nullable
        @NativeType("StdVideoH264PictureParameterSet const *")
        public StdVideoH264PictureParameterSet.Buffer pStdPPSs() { return VkVideoEncodeH264SessionParametersAddInfoEXT.npStdPPSs(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH264SessionParametersAddInfoEXT#sType} field. */
        public VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264SessionParametersAddInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT} value to the {@link VkVideoEncodeH264SessionParametersAddInfoEXT#sType} field. */
        public VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH264SessionParametersAddInfoEXT#pNext} field. */
        public VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264SessionParametersAddInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264SessionParametersAddInfoEXT#stdSPSCount} field. */
        public VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer stdSPSCount(@NativeType("uint32_t") int value) { VkVideoEncodeH264SessionParametersAddInfoEXT.nstdSPSCount(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH264SequenceParameterSet.Buffer} to the {@link VkVideoEncodeH264SessionParametersAddInfoEXT#pStdSPSs} field. */
        public VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer pStdSPSs(@Nullable @NativeType("StdVideoH264SequenceParameterSet const *") StdVideoH264SequenceParameterSet.Buffer value) { VkVideoEncodeH264SessionParametersAddInfoEXT.npStdSPSs(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264SessionParametersAddInfoEXT#stdPPSCount} field. */
        public VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer stdPPSCount(@NativeType("uint32_t") int value) { VkVideoEncodeH264SessionParametersAddInfoEXT.nstdPPSCount(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH264PictureParameterSet.Buffer} to the {@link VkVideoEncodeH264SessionParametersAddInfoEXT#pStdPPSs} field. */
        public VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer pStdPPSs(@Nullable @NativeType("StdVideoH264PictureParameterSet const *") StdVideoH264PictureParameterSet.Buffer value) { VkVideoEncodeH264SessionParametersAddInfoEXT.npStdPPSs(address(), value); return this; }

    }

}