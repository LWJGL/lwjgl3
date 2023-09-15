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
 * Structure specifies H.265 encoder parameter set info.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_EXT}</li>
 * <li>If {@code stdVPSCount} is not 0, and {@code pStdVPSs} is not {@code NULL}, {@code pStdVPSs} <b>must</b> be a valid pointer to an array of {@code stdVPSCount} {@code StdVideoH265VideoParameterSet} values</li>
 * <li>If {@code stdSPSCount} is not 0, and {@code pStdSPSs} is not {@code NULL}, {@code pStdSPSs} <b>must</b> be a valid pointer to an array of {@code stdSPSCount} {@code StdVideoH265SequenceParameterSet} values</li>
 * <li>If {@code stdPPSCount} is not 0, and {@code pStdPPSs} is not {@code NULL}, {@code pStdPPSs} <b>must</b> be a valid pointer to an array of {@code stdPPSCount} {@code StdVideoH265PictureParameterSet} values</li>
 * </ul>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The values of {@code stdVPSCount}, {@code stdSPSCount} and {@code stdPPSCount} <b>must</b> be less than or equal to the values of {@link VkVideoEncodeH265SessionParametersCreateInfoEXT}{@code ::maxStdVPSCount}, {@link VkVideoEncodeH265SessionParametersCreateInfoEXT}:{@code maxStdSPSCount}, and {@link VkVideoEncodeH265SessionParametersCreateInfoEXT}:{@code maxStdPPSCount}, respectively</li>
 * <li>Each {@code StdVideoH265VideoParameterSet} entry in {@code pStdVPSs} <b>must</b> have a unique H.265 VPS ID</li>
 * <li>Each {@code StdVideoH265SequenceParameterSet} entry in {@code pStdSPSs} <b>must</b> have a unique H.265 VPS-SPS ID pair</li>
 * <li>Each {@code StdVideoH265PictureParameterSet} entry in {@code pStdPPSs} <b>must</b> have a unique H.265 VPS-SPS-PPS ID tuple</li>
 * <li>Each entry to be added <b>must</b> have a unique, to the rest of the parameter array entries and the existing parameters in the Video Session Parameters Object that is being updated, VPS-SPS-PPS IDs</li>
 * <li>Parameter entries that already exist in Video Session Parameters object with a particular VPS-SPS-PPS IDs <b>must</b> not be replaced nor updated</li>
 * <li>When creating a new object using a Video Session Parameters as a template, the array’s parameters with the same VPS-SPS-PPS IDs as the ones from the template take precedence</li>
 * <li>VPS/SPS/PPS parameters <b>must</b> comply with the limits specified in {@link VkVideoSessionCreateInfoKHR} during Video Session creation</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH265SessionParametersCreateInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265SessionParametersAddInfoEXT {
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
public class VkVideoEncodeH265SessionParametersAddInfoEXT extends Struct<VkVideoEncodeH265SessionParametersAddInfoEXT> implements NativeResource {

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

    protected VkVideoEncodeH265SessionParametersAddInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265SessionParametersAddInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265SessionParametersAddInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265SessionParametersAddInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265SessionParametersAddInfoEXT(ByteBuffer container) {
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
    /** the number of VPS elements in {@code pStdVPSs}. */
    @NativeType("uint32_t")
    public int stdVPSCount() { return nstdVPSCount(address()); }
    /** a pointer to an array of {@code stdVPSCount} {@code StdVideoH265VideoParameterSet} structures representing H.265 video parameter sets. */
    @Nullable
    @NativeType("StdVideoH265VideoParameterSet const *")
    public StdVideoH265VideoParameterSet.Buffer pStdVPSs() { return npStdVPSs(address()); }
    /** the number of SPS elements in {@code pStdSPSs}. */
    @NativeType("uint32_t")
    public int stdSPSCount() { return nstdSPSCount(address()); }
    /** a pointer to an array of {@code stdSPSCount} {@code StdVideoH265SequenceParameterSet} structures representing H.265 sequence parameter sets. */
    @Nullable
    @NativeType("StdVideoH265SequenceParameterSet const *")
    public StdVideoH265SequenceParameterSet.Buffer pStdSPSs() { return npStdSPSs(address()); }
    /** the number of PPS elements in {@code pStdPPSs}. */
    @NativeType("uint32_t")
    public int stdPPSCount() { return nstdPPSCount(address()); }
    /** a pointer to an array of {@code stdPPSCount} {@code StdVideoH265PictureParameterSet} structures representing H.265 picture parameter sets. */
    @Nullable
    @NativeType("StdVideoH265PictureParameterSet const *")
    public StdVideoH265PictureParameterSet.Buffer pStdPPSs() { return npStdPPSs(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265SessionParametersAddInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH265SessionParametersAddInfoEXT sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265SessionParametersAddInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #stdVPSCount} field. */
    public VkVideoEncodeH265SessionParametersAddInfoEXT stdVPSCount(@NativeType("uint32_t") int value) { nstdVPSCount(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH265VideoParameterSet.Buffer} to the {@link #pStdVPSs} field. */
    public VkVideoEncodeH265SessionParametersAddInfoEXT pStdVPSs(@Nullable @NativeType("StdVideoH265VideoParameterSet const *") StdVideoH265VideoParameterSet.Buffer value) { npStdVPSs(address(), value); return this; }
    /** Sets the specified value to the {@link #stdSPSCount} field. */
    public VkVideoEncodeH265SessionParametersAddInfoEXT stdSPSCount(@NativeType("uint32_t") int value) { nstdSPSCount(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH265SequenceParameterSet.Buffer} to the {@link #pStdSPSs} field. */
    public VkVideoEncodeH265SessionParametersAddInfoEXT pStdSPSs(@Nullable @NativeType("StdVideoH265SequenceParameterSet const *") StdVideoH265SequenceParameterSet.Buffer value) { npStdSPSs(address(), value); return this; }
    /** Sets the specified value to the {@link #stdPPSCount} field. */
    public VkVideoEncodeH265SessionParametersAddInfoEXT stdPPSCount(@NativeType("uint32_t") int value) { nstdPPSCount(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH265PictureParameterSet.Buffer} to the {@link #pStdPPSs} field. */
    public VkVideoEncodeH265SessionParametersAddInfoEXT pStdPPSs(@Nullable @NativeType("StdVideoH265PictureParameterSet const *") StdVideoH265PictureParameterSet.Buffer value) { npStdPPSs(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265SessionParametersAddInfoEXT set(
        int sType,
        long pNext,
        int stdVPSCount,
        @Nullable StdVideoH265VideoParameterSet.Buffer pStdVPSs,
        int stdSPSCount,
        @Nullable StdVideoH265SequenceParameterSet.Buffer pStdSPSs,
        int stdPPSCount,
        @Nullable StdVideoH265PictureParameterSet.Buffer pStdPPSs
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
    public VkVideoEncodeH265SessionParametersAddInfoEXT set(VkVideoEncodeH265SessionParametersAddInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265SessionParametersAddInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265SessionParametersAddInfoEXT malloc() {
        return new VkVideoEncodeH265SessionParametersAddInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionParametersAddInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265SessionParametersAddInfoEXT calloc() {
        return new VkVideoEncodeH265SessionParametersAddInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionParametersAddInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265SessionParametersAddInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265SessionParametersAddInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionParametersAddInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH265SessionParametersAddInfoEXT create(long address) {
        return new VkVideoEncodeH265SessionParametersAddInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265SessionParametersAddInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265SessionParametersAddInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersAddInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersAddInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersAddInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersAddInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersAddInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersAddInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265SessionParametersAddInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersAddInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265SessionParametersAddInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265SessionParametersAddInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265SessionParametersAddInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersAddInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265SessionParametersAddInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265SessionParametersAddInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersAddInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersAddInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersAddInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersAddInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersAddInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265SessionParametersAddInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265SessionParametersAddInfoEXT.PNEXT); }
    /** Unsafe version of {@link #stdVPSCount}. */
    public static int nstdVPSCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265SessionParametersAddInfoEXT.STDVPSCOUNT); }
    /** Unsafe version of {@link #pStdVPSs}. */
    @Nullable public static StdVideoH265VideoParameterSet.Buffer npStdVPSs(long struct) { return StdVideoH265VideoParameterSet.createSafe(memGetAddress(struct + VkVideoEncodeH265SessionParametersAddInfoEXT.PSTDVPSS), nstdVPSCount(struct)); }
    /** Unsafe version of {@link #stdSPSCount}. */
    public static int nstdSPSCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265SessionParametersAddInfoEXT.STDSPSCOUNT); }
    /** Unsafe version of {@link #pStdSPSs}. */
    @Nullable public static StdVideoH265SequenceParameterSet.Buffer npStdSPSs(long struct) { return StdVideoH265SequenceParameterSet.createSafe(memGetAddress(struct + VkVideoEncodeH265SessionParametersAddInfoEXT.PSTDSPSS), nstdSPSCount(struct)); }
    /** Unsafe version of {@link #stdPPSCount}. */
    public static int nstdPPSCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265SessionParametersAddInfoEXT.STDPPSCOUNT); }
    /** Unsafe version of {@link #pStdPPSs}. */
    @Nullable public static StdVideoH265PictureParameterSet.Buffer npStdPPSs(long struct) { return StdVideoH265PictureParameterSet.createSafe(memGetAddress(struct + VkVideoEncodeH265SessionParametersAddInfoEXT.PSTDPPSS), nstdPPSCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265SessionParametersAddInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265SessionParametersAddInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code stdVPSCount} field of the specified {@code struct}. */
    public static void nstdVPSCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265SessionParametersAddInfoEXT.STDVPSCOUNT, value); }
    /** Unsafe version of {@link #pStdVPSs(StdVideoH265VideoParameterSet.Buffer) pStdVPSs}. */
    public static void npStdVPSs(long struct, @Nullable StdVideoH265VideoParameterSet.Buffer value) { memPutAddress(struct + VkVideoEncodeH265SessionParametersAddInfoEXT.PSTDVPSS, memAddressSafe(value)); if (value != null) { nstdVPSCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code stdSPSCount} field of the specified {@code struct}. */
    public static void nstdSPSCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265SessionParametersAddInfoEXT.STDSPSCOUNT, value); }
    /** Unsafe version of {@link #pStdSPSs(StdVideoH265SequenceParameterSet.Buffer) pStdSPSs}. */
    public static void npStdSPSs(long struct, @Nullable StdVideoH265SequenceParameterSet.Buffer value) { memPutAddress(struct + VkVideoEncodeH265SessionParametersAddInfoEXT.PSTDSPSS, memAddressSafe(value)); if (value != null) { nstdSPSCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code stdPPSCount} field of the specified {@code struct}. */
    public static void nstdPPSCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265SessionParametersAddInfoEXT.STDPPSCOUNT, value); }
    /** Unsafe version of {@link #pStdPPSs(StdVideoH265PictureParameterSet.Buffer) pStdPPSs}. */
    public static void npStdPPSs(long struct, @Nullable StdVideoH265PictureParameterSet.Buffer value) { memPutAddress(struct + VkVideoEncodeH265SessionParametersAddInfoEXT.PSTDPPSS, memAddressSafe(value)); if (value != null) { nstdPPSCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265SessionParametersAddInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265SessionParametersAddInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265SessionParametersAddInfoEXT ELEMENT_FACTORY = VkVideoEncodeH265SessionParametersAddInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265SessionParametersAddInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265SessionParametersAddInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH265SessionParametersAddInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265SessionParametersAddInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265SessionParametersAddInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersAddInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265SessionParametersAddInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersAddInfoEXT#stdVPSCount} field. */
        @NativeType("uint32_t")
        public int stdVPSCount() { return VkVideoEncodeH265SessionParametersAddInfoEXT.nstdVPSCount(address()); }
        /** @return a {@link StdVideoH265VideoParameterSet.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH265SessionParametersAddInfoEXT#pStdVPSs} field. */
        @Nullable
        @NativeType("StdVideoH265VideoParameterSet const *")
        public StdVideoH265VideoParameterSet.Buffer pStdVPSs() { return VkVideoEncodeH265SessionParametersAddInfoEXT.npStdVPSs(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersAddInfoEXT#stdSPSCount} field. */
        @NativeType("uint32_t")
        public int stdSPSCount() { return VkVideoEncodeH265SessionParametersAddInfoEXT.nstdSPSCount(address()); }
        /** @return a {@link StdVideoH265SequenceParameterSet.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH265SessionParametersAddInfoEXT#pStdSPSs} field. */
        @Nullable
        @NativeType("StdVideoH265SequenceParameterSet const *")
        public StdVideoH265SequenceParameterSet.Buffer pStdSPSs() { return VkVideoEncodeH265SessionParametersAddInfoEXT.npStdSPSs(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersAddInfoEXT#stdPPSCount} field. */
        @NativeType("uint32_t")
        public int stdPPSCount() { return VkVideoEncodeH265SessionParametersAddInfoEXT.nstdPPSCount(address()); }
        /** @return a {@link StdVideoH265PictureParameterSet.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH265SessionParametersAddInfoEXT#pStdPPSs} field. */
        @Nullable
        @NativeType("StdVideoH265PictureParameterSet const *")
        public StdVideoH265PictureParameterSet.Buffer pStdPPSs() { return VkVideoEncodeH265SessionParametersAddInfoEXT.npStdPPSs(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersAddInfoEXT#sType} field. */
        public VkVideoEncodeH265SessionParametersAddInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265SessionParametersAddInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_EXT} value to the {@link VkVideoEncodeH265SessionParametersAddInfoEXT#sType} field. */
        public VkVideoEncodeH265SessionParametersAddInfoEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersAddInfoEXT#pNext} field. */
        public VkVideoEncodeH265SessionParametersAddInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265SessionParametersAddInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersAddInfoEXT#stdVPSCount} field. */
        public VkVideoEncodeH265SessionParametersAddInfoEXT.Buffer stdVPSCount(@NativeType("uint32_t") int value) { VkVideoEncodeH265SessionParametersAddInfoEXT.nstdVPSCount(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH265VideoParameterSet.Buffer} to the {@link VkVideoEncodeH265SessionParametersAddInfoEXT#pStdVPSs} field. */
        public VkVideoEncodeH265SessionParametersAddInfoEXT.Buffer pStdVPSs(@Nullable @NativeType("StdVideoH265VideoParameterSet const *") StdVideoH265VideoParameterSet.Buffer value) { VkVideoEncodeH265SessionParametersAddInfoEXT.npStdVPSs(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersAddInfoEXT#stdSPSCount} field. */
        public VkVideoEncodeH265SessionParametersAddInfoEXT.Buffer stdSPSCount(@NativeType("uint32_t") int value) { VkVideoEncodeH265SessionParametersAddInfoEXT.nstdSPSCount(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH265SequenceParameterSet.Buffer} to the {@link VkVideoEncodeH265SessionParametersAddInfoEXT#pStdSPSs} field. */
        public VkVideoEncodeH265SessionParametersAddInfoEXT.Buffer pStdSPSs(@Nullable @NativeType("StdVideoH265SequenceParameterSet const *") StdVideoH265SequenceParameterSet.Buffer value) { VkVideoEncodeH265SessionParametersAddInfoEXT.npStdSPSs(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersAddInfoEXT#stdPPSCount} field. */
        public VkVideoEncodeH265SessionParametersAddInfoEXT.Buffer stdPPSCount(@NativeType("uint32_t") int value) { VkVideoEncodeH265SessionParametersAddInfoEXT.nstdPPSCount(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH265PictureParameterSet.Buffer} to the {@link VkVideoEncodeH265SessionParametersAddInfoEXT#pStdPPSs} field. */
        public VkVideoEncodeH265SessionParametersAddInfoEXT.Buffer pStdPPSs(@Nullable @NativeType("StdVideoH265PictureParameterSet const *") StdVideoH265PictureParameterSet.Buffer value) { VkVideoEncodeH265SessionParametersAddInfoEXT.npStdPPSs(address(), value); return this; }

    }

}