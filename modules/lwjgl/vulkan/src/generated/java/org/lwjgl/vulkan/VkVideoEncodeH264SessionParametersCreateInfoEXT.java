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
 * Structure specifies H.264 encoder parameter set information.
 * 
 * <h5>Description</h5>
 * 
 * <p>A {@link VkVideoEncodeH264SessionParametersCreateInfoEXT} structure holding one H.264 SPS and at least one H.264 PPS paramater set <b>must</b> be chained to {@link VkVideoSessionParametersCreateInfoKHR} when calling {@link KHRVideoQueue#vkCreateVideoSessionParametersKHR CreateVideoSessionParametersKHR} to store these parameter set(s) with the encoder parameter set object for later reference. The provided H.264 SPS/PPS parameters <b>must</b> be within the limits specified during encoder creation for the encoder specified in {@link VkVideoSessionParametersCreateInfoKHR}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_CREATE_INFO_EXT}</li>
 * <li>If {@code pParametersAddInfo} is not {@code NULL}, {@code pParametersAddInfo} <b>must</b> be a valid pointer to a valid {@link VkVideoEncodeH264SessionParametersAddInfoEXT} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH264SessionParametersAddInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH264SessionParametersCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #maxSpsStdCount};
 *     uint32_t {@link #maxPpsStdCount};
 *     {@link VkVideoEncodeH264SessionParametersAddInfoEXT VkVideoEncodeH264SessionParametersAddInfoEXT} const * {@link #pParametersAddInfo};
 * }</code></pre>
 */
public class VkVideoEncodeH264SessionParametersCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXSPSSTDCOUNT,
        MAXPPSSTDCOUNT,
        PPARAMETERSADDINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXSPSSTDCOUNT = layout.offsetof(2);
        MAXPPSSTDCOUNT = layout.offsetof(3);
        PPARAMETERSADDINFO = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkVideoEncodeH264SessionParametersCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264SessionParametersCreateInfoEXT(ByteBuffer container) {
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
    /** the maximum number of SPS parameters that the {@code VkVideoSessionParametersKHR} can contain. */
    @NativeType("uint32_t")
    public int maxSpsStdCount() { return nmaxSpsStdCount(address()); }
    /** the maximum number of PPS parameters that the {@code VkVideoSessionParametersKHR} can contain. */
    @NativeType("uint32_t")
    public int maxPpsStdCount() { return nmaxPpsStdCount(address()); }
    /** {@code NULL} or a pointer to a {@link VkVideoEncodeH264SessionParametersAddInfoEXT} structure specifying H.264 parameters to add upon object creation. */
    @Nullable
    @NativeType("VkVideoEncodeH264SessionParametersAddInfoEXT const *")
    public VkVideoEncodeH264SessionParametersAddInfoEXT pParametersAddInfo() { return npParametersAddInfo(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH264SessionParametersCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH264SessionParametersCreateInfoEXT sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH264SessionParametersCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #maxSpsStdCount} field. */
    public VkVideoEncodeH264SessionParametersCreateInfoEXT maxSpsStdCount(@NativeType("uint32_t") int value) { nmaxSpsStdCount(address(), value); return this; }
    /** Sets the specified value to the {@link #maxPpsStdCount} field. */
    public VkVideoEncodeH264SessionParametersCreateInfoEXT maxPpsStdCount(@NativeType("uint32_t") int value) { nmaxPpsStdCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH264SessionParametersAddInfoEXT} to the {@link #pParametersAddInfo} field. */
    public VkVideoEncodeH264SessionParametersCreateInfoEXT pParametersAddInfo(@Nullable @NativeType("VkVideoEncodeH264SessionParametersAddInfoEXT const *") VkVideoEncodeH264SessionParametersAddInfoEXT value) { npParametersAddInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264SessionParametersCreateInfoEXT set(
        int sType,
        long pNext,
        int maxSpsStdCount,
        int maxPpsStdCount,
        @Nullable VkVideoEncodeH264SessionParametersAddInfoEXT pParametersAddInfo
    ) {
        sType(sType);
        pNext(pNext);
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
    public VkVideoEncodeH264SessionParametersCreateInfoEXT set(VkVideoEncodeH264SessionParametersCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264SessionParametersCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264SessionParametersCreateInfoEXT malloc() {
        return wrap(VkVideoEncodeH264SessionParametersCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH264SessionParametersCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264SessionParametersCreateInfoEXT calloc() {
        return wrap(VkVideoEncodeH264SessionParametersCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH264SessionParametersCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264SessionParametersCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeH264SessionParametersCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264SessionParametersCreateInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH264SessionParametersCreateInfoEXT create(long address) {
        return wrap(VkVideoEncodeH264SessionParametersCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264SessionParametersCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeH264SessionParametersCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeH264SessionParametersCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH264SessionParametersCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264SessionParametersCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264SessionParametersCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH264SessionParametersCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeH264SessionParametersCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264SessionParametersCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH264SessionParametersCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264SessionParametersCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264SessionParametersCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #maxSpsStdCount}. */
    public static int nmaxSpsStdCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264SessionParametersCreateInfoEXT.MAXSPSSTDCOUNT); }
    /** Unsafe version of {@link #maxPpsStdCount}. */
    public static int nmaxPpsStdCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH264SessionParametersCreateInfoEXT.MAXPPSSTDCOUNT); }
    /** Unsafe version of {@link #pParametersAddInfo}. */
    @Nullable public static VkVideoEncodeH264SessionParametersAddInfoEXT npParametersAddInfo(long struct) { return VkVideoEncodeH264SessionParametersAddInfoEXT.createSafe(memGetAddress(struct + VkVideoEncodeH264SessionParametersCreateInfoEXT.PPARAMETERSADDINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264SessionParametersCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264SessionParametersCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #maxSpsStdCount(int) maxSpsStdCount}. */
    public static void nmaxSpsStdCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264SessionParametersCreateInfoEXT.MAXSPSSTDCOUNT, value); }
    /** Unsafe version of {@link #maxPpsStdCount(int) maxPpsStdCount}. */
    public static void nmaxPpsStdCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH264SessionParametersCreateInfoEXT.MAXPPSSTDCOUNT, value); }
    /** Unsafe version of {@link #pParametersAddInfo(VkVideoEncodeH264SessionParametersAddInfoEXT) pParametersAddInfo}. */
    public static void npParametersAddInfo(long struct, @Nullable VkVideoEncodeH264SessionParametersAddInfoEXT value) { memPutAddress(struct + VkVideoEncodeH264SessionParametersCreateInfoEXT.PPARAMETERSADDINFO, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264SessionParametersCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264SessionParametersCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264SessionParametersCreateInfoEXT ELEMENT_FACTORY = VkVideoEncodeH264SessionParametersCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264SessionParametersCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264SessionParametersCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoEncodeH264SessionParametersCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH264SessionParametersCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264SessionParametersCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH264SessionParametersCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264SessionParametersCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH264SessionParametersCreateInfoEXT#maxSpsStdCount} field. */
        @NativeType("uint32_t")
        public int maxSpsStdCount() { return VkVideoEncodeH264SessionParametersCreateInfoEXT.nmaxSpsStdCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH264SessionParametersCreateInfoEXT#maxPpsStdCount} field. */
        @NativeType("uint32_t")
        public int maxPpsStdCount() { return VkVideoEncodeH264SessionParametersCreateInfoEXT.nmaxPpsStdCount(address()); }
        /** @return a {@link VkVideoEncodeH264SessionParametersAddInfoEXT} view of the struct pointed to by the {@link VkVideoEncodeH264SessionParametersCreateInfoEXT#pParametersAddInfo} field. */
        @Nullable
        @NativeType("VkVideoEncodeH264SessionParametersAddInfoEXT const *")
        public VkVideoEncodeH264SessionParametersAddInfoEXT pParametersAddInfo() { return VkVideoEncodeH264SessionParametersCreateInfoEXT.npParametersAddInfo(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH264SessionParametersCreateInfoEXT#sType} field. */
        public VkVideoEncodeH264SessionParametersCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264SessionParametersCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_CREATE_INFO_EXT} value to the {@link VkVideoEncodeH264SessionParametersCreateInfoEXT#sType} field. */
        public VkVideoEncodeH264SessionParametersCreateInfoEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH264SessionParametersCreateInfoEXT#pNext} field. */
        public VkVideoEncodeH264SessionParametersCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264SessionParametersCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264SessionParametersCreateInfoEXT#maxSpsStdCount} field. */
        public VkVideoEncodeH264SessionParametersCreateInfoEXT.Buffer maxSpsStdCount(@NativeType("uint32_t") int value) { VkVideoEncodeH264SessionParametersCreateInfoEXT.nmaxSpsStdCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH264SessionParametersCreateInfoEXT#maxPpsStdCount} field. */
        public VkVideoEncodeH264SessionParametersCreateInfoEXT.Buffer maxPpsStdCount(@NativeType("uint32_t") int value) { VkVideoEncodeH264SessionParametersCreateInfoEXT.nmaxPpsStdCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH264SessionParametersAddInfoEXT} to the {@link VkVideoEncodeH264SessionParametersCreateInfoEXT#pParametersAddInfo} field. */
        public VkVideoEncodeH264SessionParametersCreateInfoEXT.Buffer pParametersAddInfo(@Nullable @NativeType("VkVideoEncodeH264SessionParametersAddInfoEXT const *") VkVideoEncodeH264SessionParametersAddInfoEXT value) { VkVideoEncodeH264SessionParametersCreateInfoEXT.npParametersAddInfo(address(), value); return this; }

    }

}