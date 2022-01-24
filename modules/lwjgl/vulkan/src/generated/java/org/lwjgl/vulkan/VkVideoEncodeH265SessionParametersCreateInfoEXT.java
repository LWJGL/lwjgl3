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

/**
 * Structure specifies H.265 encoder parameter set info.
 * 
 * <h5>Description</h5>
 * 
 * <p>When a {@code VkVideoSessionParametersKHR} object contains {@code maxVpsStdCount} {@code StdVideoH265VideoParameterSet} entries, no additional {@code StdVideoH265VideoParameterSet} entries can be added to it, and {@link VK10#VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS} will be returned if an attempt is made to add these entries. When a {@code VkVideoSessionParametersKHR} object contains {@code maxSpsStdCount} {@code StdVideoH265SequenceParameterSet} entries, no additional {@code StdVideoH265SequenceParameterSet} entries can be added to it, and {@link VK10#VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS} will be returned if an attempt is made to add these entries. When a {@code VkVideoSessionParametersKHR} object contains {@code maxPpsStdCount} {@code StdVideoH265PictureParameterSet} entries, no additional {@code StdVideoH265PictureParameterSet} entries can be added to it, and {@link VK10#VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS} will be returned if an attempt is made to add these entries.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_CREATE_INFO_EXT}</li>
 * <li>If {@code pParametersAddInfo} is not {@code NULL}, {@code pParametersAddInfo} <b>must</b> be a valid pointer to a valid {@link VkVideoEncodeH265SessionParametersAddInfoEXT} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH265SessionParametersAddInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265SessionParametersCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #maxVpsStdCount};
 *     uint32_t {@link #maxSpsStdCount};
 *     uint32_t {@link #maxPpsStdCount};
 *     {@link VkVideoEncodeH265SessionParametersAddInfoEXT VkVideoEncodeH265SessionParametersAddInfoEXT} const * {@link #pParametersAddInfo};
 * }</code></pre>
 */
public class VkVideoEncodeH265SessionParametersCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXVPSSTDCOUNT,
        MAXSPSSTDCOUNT,
        MAXPPSSTDCOUNT,
        PPARAMETERSADDINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXVPSSTDCOUNT = layout.offsetof(2);
        MAXSPSSTDCOUNT = layout.offsetof(3);
        MAXPPSSTDCOUNT = layout.offsetof(4);
        PPARAMETERSADDINFO = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkVideoEncodeH265SessionParametersCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265SessionParametersCreateInfoEXT(ByteBuffer container) {
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
    /** the maximum number of entries of type {@code StdVideoH265VideoParameterSet} within {@code VkVideoSessionParametersKHR}. */
    @NativeType("uint32_t")
    public int maxVpsStdCount() { return nmaxVpsStdCount(address()); }
    /** the maximum number of entries of type {@code StdVideoH265SequenceParameterSet} within {@code VkVideoSessionParametersKHR}. */
    @NativeType("uint32_t")
    public int maxSpsStdCount() { return nmaxSpsStdCount(address()); }
    /** the maximum number of entries of type {@code StdVideoH265PictureParameterSet} within {@code VkVideoSessionParametersKHR}. */
    @NativeType("uint32_t")
    public int maxPpsStdCount() { return nmaxPpsStdCount(address()); }
    /** {@code NULL} or a pointer to a {@link VkVideoEncodeH265SessionParametersAddInfoEXT} structure specifying the video session parameters to add upon creation of this object. */
    @Nullable
    @NativeType("VkVideoEncodeH265SessionParametersAddInfoEXT const *")
    public VkVideoEncodeH265SessionParametersAddInfoEXT pParametersAddInfo() { return npParametersAddInfo(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265SessionParametersCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH265SessionParametersCreateInfoEXT sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265SessionParametersCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #maxVpsStdCount} field. */
    public VkVideoEncodeH265SessionParametersCreateInfoEXT maxVpsStdCount(@NativeType("uint32_t") int value) { nmaxVpsStdCount(address(), value); return this; }
    /** Sets the specified value to the {@link #maxSpsStdCount} field. */
    public VkVideoEncodeH265SessionParametersCreateInfoEXT maxSpsStdCount(@NativeType("uint32_t") int value) { nmaxSpsStdCount(address(), value); return this; }
    /** Sets the specified value to the {@link #maxPpsStdCount} field. */
    public VkVideoEncodeH265SessionParametersCreateInfoEXT maxPpsStdCount(@NativeType("uint32_t") int value) { nmaxPpsStdCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH265SessionParametersAddInfoEXT} to the {@link #pParametersAddInfo} field. */
    public VkVideoEncodeH265SessionParametersCreateInfoEXT pParametersAddInfo(@Nullable @NativeType("VkVideoEncodeH265SessionParametersAddInfoEXT const *") VkVideoEncodeH265SessionParametersAddInfoEXT value) { npParametersAddInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265SessionParametersCreateInfoEXT set(
        int sType,
        long pNext,
        int maxVpsStdCount,
        int maxSpsStdCount,
        int maxPpsStdCount,
        @Nullable VkVideoEncodeH265SessionParametersAddInfoEXT pParametersAddInfo
    ) {
        sType(sType);
        pNext(pNext);
        maxVpsStdCount(maxVpsStdCount);
        maxSpsStdCount(maxSpsStdCount);
        maxPpsStdCount(maxPpsStdCount);
        pParametersAddInfo(pParametersAddInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH265SessionParametersCreateInfoEXT set(VkVideoEncodeH265SessionParametersCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265SessionParametersCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265SessionParametersCreateInfoEXT malloc() {
        return wrap(VkVideoEncodeH265SessionParametersCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH265SessionParametersCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265SessionParametersCreateInfoEXT calloc() {
        return wrap(VkVideoEncodeH265SessionParametersCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH265SessionParametersCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265SessionParametersCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeH265SessionParametersCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionParametersCreateInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH265SessionParametersCreateInfoEXT create(long address) {
        return wrap(VkVideoEncodeH265SessionParametersCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265SessionParametersCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeH265SessionParametersCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeH265SessionParametersCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265SessionParametersCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265SessionParametersCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265SessionParametersCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH265SessionParametersCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeH265SessionParametersCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265SessionParametersCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH265SessionParametersCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265SessionParametersCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265SessionParametersCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #maxVpsStdCount}. */
    public static int nmaxVpsStdCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265SessionParametersCreateInfoEXT.MAXVPSSTDCOUNT); }
    /** Unsafe version of {@link #maxSpsStdCount}. */
    public static int nmaxSpsStdCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265SessionParametersCreateInfoEXT.MAXSPSSTDCOUNT); }
    /** Unsafe version of {@link #maxPpsStdCount}. */
    public static int nmaxPpsStdCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265SessionParametersCreateInfoEXT.MAXPPSSTDCOUNT); }
    /** Unsafe version of {@link #pParametersAddInfo}. */
    @Nullable public static VkVideoEncodeH265SessionParametersAddInfoEXT npParametersAddInfo(long struct) { return VkVideoEncodeH265SessionParametersAddInfoEXT.createSafe(memGetAddress(struct + VkVideoEncodeH265SessionParametersCreateInfoEXT.PPARAMETERSADDINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265SessionParametersCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265SessionParametersCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #maxVpsStdCount(int) maxVpsStdCount}. */
    public static void nmaxVpsStdCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265SessionParametersCreateInfoEXT.MAXVPSSTDCOUNT, value); }
    /** Unsafe version of {@link #maxSpsStdCount(int) maxSpsStdCount}. */
    public static void nmaxSpsStdCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265SessionParametersCreateInfoEXT.MAXSPSSTDCOUNT, value); }
    /** Unsafe version of {@link #maxPpsStdCount(int) maxPpsStdCount}. */
    public static void nmaxPpsStdCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265SessionParametersCreateInfoEXT.MAXPPSSTDCOUNT, value); }
    /** Unsafe version of {@link #pParametersAddInfo(VkVideoEncodeH265SessionParametersAddInfoEXT) pParametersAddInfo}. */
    public static void npParametersAddInfo(long struct, @Nullable VkVideoEncodeH265SessionParametersAddInfoEXT value) { memPutAddress(struct + VkVideoEncodeH265SessionParametersCreateInfoEXT.PPARAMETERSADDINFO, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265SessionParametersCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265SessionParametersCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265SessionParametersCreateInfoEXT ELEMENT_FACTORY = VkVideoEncodeH265SessionParametersCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265SessionParametersCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265SessionParametersCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoEncodeH265SessionParametersCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265SessionParametersCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265SessionParametersCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265SessionParametersCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersCreateInfoEXT#maxVpsStdCount} field. */
        @NativeType("uint32_t")
        public int maxVpsStdCount() { return VkVideoEncodeH265SessionParametersCreateInfoEXT.nmaxVpsStdCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersCreateInfoEXT#maxSpsStdCount} field. */
        @NativeType("uint32_t")
        public int maxSpsStdCount() { return VkVideoEncodeH265SessionParametersCreateInfoEXT.nmaxSpsStdCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersCreateInfoEXT#maxPpsStdCount} field. */
        @NativeType("uint32_t")
        public int maxPpsStdCount() { return VkVideoEncodeH265SessionParametersCreateInfoEXT.nmaxPpsStdCount(address()); }
        /** @return a {@link VkVideoEncodeH265SessionParametersAddInfoEXT} view of the struct pointed to by the {@link VkVideoEncodeH265SessionParametersCreateInfoEXT#pParametersAddInfo} field. */
        @Nullable
        @NativeType("VkVideoEncodeH265SessionParametersAddInfoEXT const *")
        public VkVideoEncodeH265SessionParametersAddInfoEXT pParametersAddInfo() { return VkVideoEncodeH265SessionParametersCreateInfoEXT.npParametersAddInfo(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersCreateInfoEXT#sType} field. */
        public VkVideoEncodeH265SessionParametersCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265SessionParametersCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_CREATE_INFO_EXT} value to the {@link VkVideoEncodeH265SessionParametersCreateInfoEXT#sType} field. */
        public VkVideoEncodeH265SessionParametersCreateInfoEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersCreateInfoEXT#pNext} field. */
        public VkVideoEncodeH265SessionParametersCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265SessionParametersCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersCreateInfoEXT#maxVpsStdCount} field. */
        public VkVideoEncodeH265SessionParametersCreateInfoEXT.Buffer maxVpsStdCount(@NativeType("uint32_t") int value) { VkVideoEncodeH265SessionParametersCreateInfoEXT.nmaxVpsStdCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersCreateInfoEXT#maxSpsStdCount} field. */
        public VkVideoEncodeH265SessionParametersCreateInfoEXT.Buffer maxSpsStdCount(@NativeType("uint32_t") int value) { VkVideoEncodeH265SessionParametersCreateInfoEXT.nmaxSpsStdCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersCreateInfoEXT#maxPpsStdCount} field. */
        public VkVideoEncodeH265SessionParametersCreateInfoEXT.Buffer maxPpsStdCount(@NativeType("uint32_t") int value) { VkVideoEncodeH265SessionParametersCreateInfoEXT.nmaxPpsStdCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH265SessionParametersAddInfoEXT} to the {@link VkVideoEncodeH265SessionParametersCreateInfoEXT#pParametersAddInfo} field. */
        public VkVideoEncodeH265SessionParametersCreateInfoEXT.Buffer pParametersAddInfo(@Nullable @NativeType("VkVideoEncodeH265SessionParametersAddInfoEXT const *") VkVideoEncodeH265SessionParametersAddInfoEXT value) { VkVideoEncodeH265SessionParametersCreateInfoEXT.npParametersAddInfo(address(), value); return this; }

    }

}