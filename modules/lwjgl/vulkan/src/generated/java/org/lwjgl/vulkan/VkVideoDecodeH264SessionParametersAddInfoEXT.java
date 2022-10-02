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
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The values of {@code stdSPSCount} and {@code stdPPSCount} <b>must</b> be less than or equal to the values of {@code maxStdSPSCount} and {@code maxStdPPSCount}, respectively</li>
 * <li>When the {@code maxStdSPSCount} number of parameters of type StdVideoH264SequenceParameterSet in the Video Session Parameters object is reached, no additional parameters of that type can be added to this object. {@link VK10#VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS} will be returned if an attempt is made to add additional data to this object at this point</li>
 * <li>When the {@code maxStdPPSCount} number of parameters of type StdVideoH264PictureParameterSet in the Video Session Parameters object is reached, no additional parameters of that type can be added to this object. {@link VK10#VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS} will be returned if an attempt is made to add additional data to this object at this point</li>
 * <li>Each entry to be added <b>must</b> have a unique, to the rest of the parameter array entries and the existing parameters in the Video Session Parameters Object that is being updated, SPS-PPS IDs</li>
 * <li>Parameter entries that already exist in Video Session Parameters object with a particular SPS-PPS IDs <b>cannot</b> be replaced nor updated</li>
 * <li>When creating a new object using a Video Session Parameters as a template, the array’s parameters with the same SPS-PPS IDs as the ones from the template take precedence</li>
 * <li>SPS/PPS parameters <b>must</b> comply with the limits specified in {@link VkVideoSessionCreateInfoKHR} during Video Session creation</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT}</li>
 * <li>If {@code stdSPSCount} is not 0, {@code pStdSPSs} <b>must</b> be a valid pointer to an array of {@code stdSPSCount} {@code StdVideoH264SequenceParameterSet} values</li>
 * <li>If {@code stdPPSCount} is not 0, {@code pStdPPSs} <b>must</b> be a valid pointer to an array of {@code stdPPSCount} {@code StdVideoH264PictureParameterSet} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoDecodeH264SessionParametersCreateInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoDecodeH264SessionParametersAddInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #stdSPSCount};
 *     {@link StdVideoH264SequenceParameterSet StdVideoH264SequenceParameterSet} const * {@link #pStdSPSs};
 *     uint32_t {@link #stdPPSCount};
 *     {@link StdVideoH264PictureParameterSet StdVideoH264PictureParameterSet} const * {@link #pStdPPSs};
 * }</code></pre>
 */
public class VkVideoDecodeH264SessionParametersAddInfoEXT extends Struct implements NativeResource {

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

    /**
     * Creates a {@code VkVideoDecodeH264SessionParametersAddInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeH264SessionParametersAddInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the number of SPS elements in {@code pStdSPSs}. Its value <b>must</b> be less than or equal to the value of {@code maxStdSPSCount}. */
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
    public VkVideoDecodeH264SessionParametersAddInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoDecodeH264SessionParametersAddInfoEXT sType$Default() { return sType(EXTVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoDecodeH264SessionParametersAddInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH264SequenceParameterSet.Buffer} to the {@link #pStdSPSs} field. */
    public VkVideoDecodeH264SessionParametersAddInfoEXT pStdSPSs(@Nullable @NativeType("StdVideoH264SequenceParameterSet const *") StdVideoH264SequenceParameterSet.Buffer value) { npStdSPSs(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH264PictureParameterSet.Buffer} to the {@link #pStdPPSs} field. */
    public VkVideoDecodeH264SessionParametersAddInfoEXT pStdPPSs(@Nullable @NativeType("StdVideoH264PictureParameterSet const *") StdVideoH264PictureParameterSet.Buffer value) { npStdPPSs(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeH264SessionParametersAddInfoEXT set(
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
    public VkVideoDecodeH264SessionParametersAddInfoEXT set(VkVideoDecodeH264SessionParametersAddInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeH264SessionParametersAddInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264SessionParametersAddInfoEXT malloc() {
        return wrap(VkVideoDecodeH264SessionParametersAddInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeH264SessionParametersAddInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264SessionParametersAddInfoEXT calloc() {
        return wrap(VkVideoDecodeH264SessionParametersAddInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeH264SessionParametersAddInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeH264SessionParametersAddInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoDecodeH264SessionParametersAddInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeH264SessionParametersAddInfoEXT} instance for the specified memory address. */
    public static VkVideoDecodeH264SessionParametersAddInfoEXT create(long address) {
        return wrap(VkVideoDecodeH264SessionParametersAddInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH264SessionParametersAddInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoDecodeH264SessionParametersAddInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionParametersAddInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionParametersAddInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionParametersAddInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionParametersAddInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionParametersAddInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionParametersAddInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoDecodeH264SessionParametersAddInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionParametersAddInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH264SessionParametersAddInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeH264SessionParametersAddInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264SessionParametersAddInfoEXT malloc(MemoryStack stack) {
        return wrap(VkVideoDecodeH264SessionParametersAddInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoDecodeH264SessionParametersAddInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264SessionParametersAddInfoEXT calloc(MemoryStack stack) {
        return wrap(VkVideoDecodeH264SessionParametersAddInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionParametersAddInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionParametersAddInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionParametersAddInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionParametersAddInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264SessionParametersAddInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeH264SessionParametersAddInfoEXT.PNEXT); }
    /** Unsafe version of {@link #stdSPSCount}. */
    public static int nstdSPSCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264SessionParametersAddInfoEXT.STDSPSCOUNT); }
    /** Unsafe version of {@link #pStdSPSs}. */
    @Nullable public static StdVideoH264SequenceParameterSet.Buffer npStdSPSs(long struct) { return StdVideoH264SequenceParameterSet.createSafe(memGetAddress(struct + VkVideoDecodeH264SessionParametersAddInfoEXT.PSTDSPSS), nstdSPSCount(struct)); }
    /** Unsafe version of {@link #stdPPSCount}. */
    public static int nstdPPSCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264SessionParametersAddInfoEXT.STDPPSCOUNT); }
    /** Unsafe version of {@link #pStdPPSs}. */
    @Nullable public static StdVideoH264PictureParameterSet.Buffer npStdPPSs(long struct) { return StdVideoH264PictureParameterSet.createSafe(memGetAddress(struct + VkVideoDecodeH264SessionParametersAddInfoEXT.PSTDPPSS), nstdPPSCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264SessionParametersAddInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeH264SessionParametersAddInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code stdSPSCount} field of the specified {@code struct}. */
    public static void nstdSPSCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264SessionParametersAddInfoEXT.STDSPSCOUNT, value); }
    /** Unsafe version of {@link #pStdSPSs(StdVideoH264SequenceParameterSet.Buffer) pStdSPSs}. */
    public static void npStdSPSs(long struct, @Nullable StdVideoH264SequenceParameterSet.Buffer value) { memPutAddress(struct + VkVideoDecodeH264SessionParametersAddInfoEXT.PSTDSPSS, memAddressSafe(value)); nstdSPSCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code stdPPSCount} field of the specified {@code struct}. */
    public static void nstdPPSCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264SessionParametersAddInfoEXT.STDPPSCOUNT, value); }
    /** Unsafe version of {@link #pStdPPSs(StdVideoH264PictureParameterSet.Buffer) pStdPPSs}. */
    public static void npStdPPSs(long struct, @Nullable StdVideoH264PictureParameterSet.Buffer value) { memPutAddress(struct + VkVideoDecodeH264SessionParametersAddInfoEXT.PSTDPPSS, memAddressSafe(value)); nstdPPSCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int stdSPSCount = nstdSPSCount(struct);
        if (stdSPSCount != 0) {
            long pStdSPSs = memGetAddress(struct + VkVideoDecodeH264SessionParametersAddInfoEXT.PSTDSPSS);
            check(pStdSPSs);
            validate(pStdSPSs, stdSPSCount, StdVideoH264SequenceParameterSet.SIZEOF, StdVideoH264SequenceParameterSet::validate);
        }
        int stdPPSCount = nstdPPSCount(struct);
        if (stdPPSCount != 0) {
            long pStdPPSs = memGetAddress(struct + VkVideoDecodeH264SessionParametersAddInfoEXT.PSTDPPSS);
            check(pStdPPSs);
            validate(pStdPPSs, stdPPSCount, StdVideoH264PictureParameterSet.SIZEOF, StdVideoH264PictureParameterSet::validate);
        }
    }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeH264SessionParametersAddInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeH264SessionParametersAddInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoDecodeH264SessionParametersAddInfoEXT ELEMENT_FACTORY = VkVideoDecodeH264SessionParametersAddInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeH264SessionParametersAddInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeH264SessionParametersAddInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoDecodeH264SessionParametersAddInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoDecodeH264SessionParametersAddInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeH264SessionParametersAddInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoDecodeH264SessionParametersAddInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeH264SessionParametersAddInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoDecodeH264SessionParametersAddInfoEXT#stdSPSCount} field. */
        @NativeType("uint32_t")
        public int stdSPSCount() { return VkVideoDecodeH264SessionParametersAddInfoEXT.nstdSPSCount(address()); }
        /** @return a {@link StdVideoH264SequenceParameterSet.Buffer} view of the struct array pointed to by the {@link VkVideoDecodeH264SessionParametersAddInfoEXT#pStdSPSs} field. */
        @Nullable
        @NativeType("StdVideoH264SequenceParameterSet const *")
        public StdVideoH264SequenceParameterSet.Buffer pStdSPSs() { return VkVideoDecodeH264SessionParametersAddInfoEXT.npStdSPSs(address()); }
        /** @return the value of the {@link VkVideoDecodeH264SessionParametersAddInfoEXT#stdPPSCount} field. */
        @NativeType("uint32_t")
        public int stdPPSCount() { return VkVideoDecodeH264SessionParametersAddInfoEXT.nstdPPSCount(address()); }
        /** @return a {@link StdVideoH264PictureParameterSet.Buffer} view of the struct array pointed to by the {@link VkVideoDecodeH264SessionParametersAddInfoEXT#pStdPPSs} field. */
        @Nullable
        @NativeType("StdVideoH264PictureParameterSet const *")
        public StdVideoH264PictureParameterSet.Buffer pStdPPSs() { return VkVideoDecodeH264SessionParametersAddInfoEXT.npStdPPSs(address()); }

        /** Sets the specified value to the {@link VkVideoDecodeH264SessionParametersAddInfoEXT#sType} field. */
        public VkVideoDecodeH264SessionParametersAddInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeH264SessionParametersAddInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT} value to the {@link VkVideoDecodeH264SessionParametersAddInfoEXT#sType} field. */
        public VkVideoDecodeH264SessionParametersAddInfoEXT.Buffer sType$Default() { return sType(EXTVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoDecodeH264SessionParametersAddInfoEXT#pNext} field. */
        public VkVideoDecodeH264SessionParametersAddInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeH264SessionParametersAddInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH264SequenceParameterSet.Buffer} to the {@link VkVideoDecodeH264SessionParametersAddInfoEXT#pStdSPSs} field. */
        public VkVideoDecodeH264SessionParametersAddInfoEXT.Buffer pStdSPSs(@Nullable @NativeType("StdVideoH264SequenceParameterSet const *") StdVideoH264SequenceParameterSet.Buffer value) { VkVideoDecodeH264SessionParametersAddInfoEXT.npStdSPSs(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH264PictureParameterSet.Buffer} to the {@link VkVideoDecodeH264SessionParametersAddInfoEXT#pStdPPSs} field. */
        public VkVideoDecodeH264SessionParametersAddInfoEXT.Buffer pStdPPSs(@Nullable @NativeType("StdVideoH264PictureParameterSet const *") StdVideoH264PictureParameterSet.Buffer value) { VkVideoDecodeH264SessionParametersAddInfoEXT.npStdPPSs(address(), value); return this; }

    }

}