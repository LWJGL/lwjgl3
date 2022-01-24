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
 * <li>The values of {@code spsStdCount} and {@code ppsStdCount} <b>must</b> be less than or equal to the values of {@code maxSpsStdCount} and {@code maxPpsStdCount}, respectively</li>
 * <li>When the {@code maxSpsStdCount} number of parameters of type StdVideoH264SequenceParameterSet in the Video Session Parameters object is reached, no additional parameters of that type can be added to the object. {@link VK10#VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS} will be returned if an attempt is made to add additional data to this object at this point</li>
 * <li>When the {@code maxPpsStdCount} number of parameters of type StdVideoH264PictureParameterSet in the Video Session Parameters object is reached, no additional parameters of that type can be added to the object. {@link VK10#VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS} will be returned if an attempt is made to add additional data to this object at this point</li>
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
 * <li>If {@code pSpsStd} is not {@code NULL}, {@code pSpsStd} <b>must</b> be a valid pointer to an array of {@code spsStdCount} {@code StdVideoH264SequenceParameterSet} values</li>
 * <li>If {@code pPpsStd} is not {@code NULL}, {@code pPpsStd} <b>must</b> be a valid pointer to an array of {@code ppsStdCount} {@code StdVideoH264PictureParameterSet} values</li>
 * <li>{@code spsStdCount} <b>must</b> be greater than 0</li>
 * <li>{@code ppsStdCount} <b>must</b> be greater than 0</li>
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
 *     uint32_t {@link #spsStdCount};
 *     {@link StdVideoH264SequenceParameterSet StdVideoH264SequenceParameterSet} const * {@link #pSpsStd};
 *     uint32_t {@link #ppsStdCount};
 *     {@link StdVideoH264PictureParameterSet StdVideoH264PictureParameterSet} const * {@link #pPpsStd};
 * }</code></pre>
 */
public class VkVideoEncodeH264SessionParametersAddInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SPSSTDCOUNT,
        PSPSSTD,
        PPSSTDCOUNT,
        PPPSSTD;

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
        SPSSTDCOUNT = layout.offsetof(2);
        PSPSSTD = layout.offsetof(3);
        PPSSTDCOUNT = layout.offsetof(4);
        PPPSSTD = layout.offsetof(5);
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

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the number of SPS elements in the {@code pSpsStd}. Its value <b>must</b> be less than or equal to the value of {@code maxSpsStdCount}. */
    @NativeType("uint32_t")
    public int spsStdCount() { return nspsStdCount(address()); }
    /** a pointer to an array of {@code StdVideoH264SequenceParameterSet} structures representing H.264 sequence parameter sets. Each element of the array <b>must</b> have a unique H.264 SPS ID. */
    @Nullable
    @NativeType("StdVideoH264SequenceParameterSet const *")
    public StdVideoH264SequenceParameterSet.Buffer pSpsStd() { return npSpsStd(address()); }
    /** the number of PPS provided in {@code pPpsStd}. Its value <b>must</b> be less than or equal to the value of {@code maxPpsStdCount}. */
    @NativeType("uint32_t")
    public int ppsStdCount() { return nppsStdCount(address()); }
    /** a pointer to an array of {@code StdVideoH264PictureParameterSet} structures representing H.264 picture parameter sets. Each element of the array <b>must</b> have a unique H.264 SPS-PPS ID pair. */
    @Nullable
    @NativeType("StdVideoH264PictureParameterSet const *")
    public StdVideoH264PictureParameterSet.Buffer pPpsStd() { return npPpsStd(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH264SessionParametersAddInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH264SessionParametersAddInfoEXT sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH264SessionParametersAddInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #spsStdCount} field. */
    public VkVideoEncodeH264SessionParametersAddInfoEXT spsStdCount(@NativeType("uint32_t") int value) { nspsStdCount(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH264SequenceParameterSet.Buffer} to the {@link #pSpsStd} field. */
    public VkVideoEncodeH264SessionParametersAddInfoEXT pSpsStd(@Nullable @NativeType("StdVideoH264SequenceParameterSet const *") StdVideoH264SequenceParameterSet.Buffer value) { npSpsStd(address(), value); return this; }
    /** Sets the specified value to the {@link #ppsStdCount} field. */
    public VkVideoEncodeH264SessionParametersAddInfoEXT ppsStdCount(@NativeType("uint32_t") int value) { nppsStdCount(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH264PictureParameterSet.Buffer} to the {@link #pPpsStd} field. */
    public VkVideoEncodeH264SessionParametersAddInfoEXT pPpsStd(@Nullable @NativeType("StdVideoH264PictureParameterSet const *") StdVideoH264PictureParameterSet.Buffer value) { npPpsStd(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264SessionParametersAddInfoEXT set(
        int sType,
        long pNext,
        int spsStdCount,
        @Nullable StdVideoH264SequenceParameterSet.Buffer pSpsStd,
        int ppsStdCount,
        @Nullable StdVideoH264PictureParameterSet.Buffer pPpsStd
    ) {
        sType(sType);
        pNext(pNext);
        spsStdCount(spsStdCount);
        pSpsStd(pSpsStd);
        ppsStdCount(ppsStdCount);
        pPpsStd(pPpsStd);

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
        return wrap(VkVideoEncodeH264SessionParametersAddInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH264SessionParametersAddInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264SessionParametersAddInfoEXT calloc() {
        return wrap(VkVideoEncodeH264SessionParametersAddInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH264SessionParametersAddInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264SessionParametersAddInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeH264SessionParametersAddInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264SessionParametersAddInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH264SessionParametersAddInfoEXT create(long address) {
        return wrap(VkVideoEncodeH264SessionParametersAddInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264SessionParametersAddInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeH264SessionParametersAddInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264SessionParametersAddInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264SessionParametersAddInfoEXT malloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH264SessionParametersAddInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeH264SessionParametersAddInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264SessionParametersAddInfoEXT calloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH264SessionParametersAddInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264SessionParametersAddInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264SessionParametersAddInfoEXT.PNEXT); }
    /** Unsafe version of {@link #spsStdCount}. */
    public static int nspsStdCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264SessionParametersAddInfoEXT.SPSSTDCOUNT); }
    /** Unsafe version of {@link #pSpsStd}. */
    @Nullable public static StdVideoH264SequenceParameterSet.Buffer npSpsStd(long struct) { return StdVideoH264SequenceParameterSet.createSafe(memGetAddress(struct + VkVideoEncodeH264SessionParametersAddInfoEXT.PSPSSTD), nspsStdCount(struct)); }
    /** Unsafe version of {@link #ppsStdCount}. */
    public static int nppsStdCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264SessionParametersAddInfoEXT.PPSSTDCOUNT); }
    /** Unsafe version of {@link #pPpsStd}. */
    @Nullable public static StdVideoH264PictureParameterSet.Buffer npPpsStd(long struct) { return StdVideoH264PictureParameterSet.createSafe(memGetAddress(struct + VkVideoEncodeH264SessionParametersAddInfoEXT.PPPSSTD), nppsStdCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264SessionParametersAddInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264SessionParametersAddInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code spsStdCount} field of the specified {@code struct}. */
    public static void nspsStdCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264SessionParametersAddInfoEXT.SPSSTDCOUNT, value); }
    /** Unsafe version of {@link #pSpsStd(StdVideoH264SequenceParameterSet.Buffer) pSpsStd}. */
    public static void npSpsStd(long struct, @Nullable StdVideoH264SequenceParameterSet.Buffer value) { memPutAddress(struct + VkVideoEncodeH264SessionParametersAddInfoEXT.PSPSSTD, memAddressSafe(value)); if (value != null) { nspsStdCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code ppsStdCount} field of the specified {@code struct}. */
    public static void nppsStdCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264SessionParametersAddInfoEXT.PPSSTDCOUNT, value); }
    /** Unsafe version of {@link #pPpsStd(StdVideoH264PictureParameterSet.Buffer) pPpsStd}. */
    public static void npPpsStd(long struct, @Nullable StdVideoH264PictureParameterSet.Buffer value) { memPutAddress(struct + VkVideoEncodeH264SessionParametersAddInfoEXT.PPPSSTD, memAddressSafe(value)); if (value != null) { nppsStdCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264SessionParametersAddInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264SessionParametersAddInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264SessionParametersAddInfoEXT ELEMENT_FACTORY = VkVideoEncodeH264SessionParametersAddInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264SessionParametersAddInfoEXT#SIZEOF}, and its mark will be undefined.
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
        /** @return the value of the {@link VkVideoEncodeH264SessionParametersAddInfoEXT#spsStdCount} field. */
        @NativeType("uint32_t")
        public int spsStdCount() { return VkVideoEncodeH264SessionParametersAddInfoEXT.nspsStdCount(address()); }
        /** @return a {@link StdVideoH264SequenceParameterSet.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH264SessionParametersAddInfoEXT#pSpsStd} field. */
        @Nullable
        @NativeType("StdVideoH264SequenceParameterSet const *")
        public StdVideoH264SequenceParameterSet.Buffer pSpsStd() { return VkVideoEncodeH264SessionParametersAddInfoEXT.npSpsStd(address()); }
        /** @return the value of the {@link VkVideoEncodeH264SessionParametersAddInfoEXT#ppsStdCount} field. */
        @NativeType("uint32_t")
        public int ppsStdCount() { return VkVideoEncodeH264SessionParametersAddInfoEXT.nppsStdCount(address()); }
        /** @return a {@link StdVideoH264PictureParameterSet.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH264SessionParametersAddInfoEXT#pPpsStd} field. */
        @Nullable
        @NativeType("StdVideoH264PictureParameterSet const *")
        public StdVideoH264PictureParameterSet.Buffer pPpsStd() { return VkVideoEncodeH264SessionParametersAddInfoEXT.npPpsStd(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH264SessionParametersAddInfoEXT#sType} field. */
        public VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264SessionParametersAddInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT} value to the {@link VkVideoEncodeH264SessionParametersAddInfoEXT#sType} field. */
        public VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH264SessionParametersAddInfoEXT#pNext} field. */
        public VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264SessionParametersAddInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264SessionParametersAddInfoEXT#spsStdCount} field. */
        public VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer spsStdCount(@NativeType("uint32_t") int value) { VkVideoEncodeH264SessionParametersAddInfoEXT.nspsStdCount(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH264SequenceParameterSet.Buffer} to the {@link VkVideoEncodeH264SessionParametersAddInfoEXT#pSpsStd} field. */
        public VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer pSpsStd(@Nullable @NativeType("StdVideoH264SequenceParameterSet const *") StdVideoH264SequenceParameterSet.Buffer value) { VkVideoEncodeH264SessionParametersAddInfoEXT.npSpsStd(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264SessionParametersAddInfoEXT#ppsStdCount} field. */
        public VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer ppsStdCount(@NativeType("uint32_t") int value) { VkVideoEncodeH264SessionParametersAddInfoEXT.nppsStdCount(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH264PictureParameterSet.Buffer} to the {@link VkVideoEncodeH264SessionParametersAddInfoEXT#pPpsStd} field. */
        public VkVideoEncodeH264SessionParametersAddInfoEXT.Buffer pPpsStd(@Nullable @NativeType("StdVideoH264PictureParameterSet const *") StdVideoH264PictureParameterSet.Buffer value) { VkVideoEncodeH264SessionParametersAddInfoEXT.npPpsStd(address(), value); return this; }

    }

}