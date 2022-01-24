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
 * Structure specifies H.265 decoder parameter set information.
 * 
 * <h5>Description</h5>
 * 
 * <p>A {@link VkVideoDecodeH265SessionParametersCreateInfoEXT} structure holding one H.265 SPS and at least one H.265 PPS paramater set <b>must</b> be chained to {@link VkVideoSessionParametersCreateInfoKHR} when calling {@code vkCreateVideoSessionParametersKHR} to store these parameter set(s) with the decoder parameter set object for later reference. The provided H.265 SPS/PPS parameters <b>must</b> be within the limits specified during decoder creation for the decoder specified in {@link VkVideoSessionParametersCreateInfoKHR}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoDecodeH265#VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_EXT}</li>
 * <li>If {@code pParametersAddInfo} is not {@code NULL}, {@code pParametersAddInfo} <b>must</b> be a valid pointer to a valid {@link VkVideoDecodeH265SessionParametersAddInfoEXT} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoDecodeH265SessionParametersAddInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoDecodeH265SessionParametersCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #maxSpsStdCount};
 *     uint32_t {@link #maxPpsStdCount};
 *     {@link VkVideoDecodeH265SessionParametersAddInfoEXT VkVideoDecodeH265SessionParametersAddInfoEXT} const * {@link #pParametersAddInfo};
 * }</code></pre>
 */
public class VkVideoDecodeH265SessionParametersCreateInfoEXT extends Struct implements NativeResource {

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
     * Creates a {@code VkVideoDecodeH265SessionParametersCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeH265SessionParametersCreateInfoEXT(ByteBuffer container) {
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
    /** {@code NULL} or a pointer to a {@link VkVideoDecodeH265SessionParametersAddInfoEXT} structure specifying H.265 parameters to add upon object creation. */
    @Nullable
    @NativeType("VkVideoDecodeH265SessionParametersAddInfoEXT const *")
    public VkVideoDecodeH265SessionParametersAddInfoEXT pParametersAddInfo() { return npParametersAddInfo(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoDecodeH265SessionParametersCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoDecodeH265#VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoDecodeH265SessionParametersCreateInfoEXT sType$Default() { return sType(EXTVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoDecodeH265SessionParametersCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #maxSpsStdCount} field. */
    public VkVideoDecodeH265SessionParametersCreateInfoEXT maxSpsStdCount(@NativeType("uint32_t") int value) { nmaxSpsStdCount(address(), value); return this; }
    /** Sets the specified value to the {@link #maxPpsStdCount} field. */
    public VkVideoDecodeH265SessionParametersCreateInfoEXT maxPpsStdCount(@NativeType("uint32_t") int value) { nmaxPpsStdCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoDecodeH265SessionParametersAddInfoEXT} to the {@link #pParametersAddInfo} field. */
    public VkVideoDecodeH265SessionParametersCreateInfoEXT pParametersAddInfo(@Nullable @NativeType("VkVideoDecodeH265SessionParametersAddInfoEXT const *") VkVideoDecodeH265SessionParametersAddInfoEXT value) { npParametersAddInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeH265SessionParametersCreateInfoEXT set(
        int sType,
        long pNext,
        int maxSpsStdCount,
        int maxPpsStdCount,
        @Nullable VkVideoDecodeH265SessionParametersAddInfoEXT pParametersAddInfo
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
    public VkVideoDecodeH265SessionParametersCreateInfoEXT set(VkVideoDecodeH265SessionParametersCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeH265SessionParametersCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH265SessionParametersCreateInfoEXT malloc() {
        return wrap(VkVideoDecodeH265SessionParametersCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeH265SessionParametersCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH265SessionParametersCreateInfoEXT calloc() {
        return wrap(VkVideoDecodeH265SessionParametersCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeH265SessionParametersCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeH265SessionParametersCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoDecodeH265SessionParametersCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeH265SessionParametersCreateInfoEXT} instance for the specified memory address. */
    public static VkVideoDecodeH265SessionParametersCreateInfoEXT create(long address) {
        return wrap(VkVideoDecodeH265SessionParametersCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH265SessionParametersCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoDecodeH265SessionParametersCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265SessionParametersCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265SessionParametersCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265SessionParametersCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265SessionParametersCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265SessionParametersCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265SessionParametersCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoDecodeH265SessionParametersCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265SessionParametersCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH265SessionParametersCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeH265SessionParametersCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH265SessionParametersCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkVideoDecodeH265SessionParametersCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoDecodeH265SessionParametersCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH265SessionParametersCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkVideoDecodeH265SessionParametersCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoDecodeH265SessionParametersCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265SessionParametersCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH265SessionParametersCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH265SessionParametersCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH265SessionParametersCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeH265SessionParametersCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #maxSpsStdCount}. */
    public static int nmaxSpsStdCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH265SessionParametersCreateInfoEXT.MAXSPSSTDCOUNT); }
    /** Unsafe version of {@link #maxPpsStdCount}. */
    public static int nmaxPpsStdCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH265SessionParametersCreateInfoEXT.MAXPPSSTDCOUNT); }
    /** Unsafe version of {@link #pParametersAddInfo}. */
    @Nullable public static VkVideoDecodeH265SessionParametersAddInfoEXT npParametersAddInfo(long struct) { return VkVideoDecodeH265SessionParametersAddInfoEXT.createSafe(memGetAddress(struct + VkVideoDecodeH265SessionParametersCreateInfoEXT.PPARAMETERSADDINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH265SessionParametersCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeH265SessionParametersCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #maxSpsStdCount(int) maxSpsStdCount}. */
    public static void nmaxSpsStdCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH265SessionParametersCreateInfoEXT.MAXSPSSTDCOUNT, value); }
    /** Unsafe version of {@link #maxPpsStdCount(int) maxPpsStdCount}. */
    public static void nmaxPpsStdCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH265SessionParametersCreateInfoEXT.MAXPPSSTDCOUNT, value); }
    /** Unsafe version of {@link #pParametersAddInfo(VkVideoDecodeH265SessionParametersAddInfoEXT) pParametersAddInfo}. */
    public static void npParametersAddInfo(long struct, @Nullable VkVideoDecodeH265SessionParametersAddInfoEXT value) { memPutAddress(struct + VkVideoDecodeH265SessionParametersCreateInfoEXT.PPARAMETERSADDINFO, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeH265SessionParametersCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeH265SessionParametersCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoDecodeH265SessionParametersCreateInfoEXT ELEMENT_FACTORY = VkVideoDecodeH265SessionParametersCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeH265SessionParametersCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeH265SessionParametersCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoDecodeH265SessionParametersCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoDecodeH265SessionParametersCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeH265SessionParametersCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoDecodeH265SessionParametersCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeH265SessionParametersCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoDecodeH265SessionParametersCreateInfoEXT#maxSpsStdCount} field. */
        @NativeType("uint32_t")
        public int maxSpsStdCount() { return VkVideoDecodeH265SessionParametersCreateInfoEXT.nmaxSpsStdCount(address()); }
        /** @return the value of the {@link VkVideoDecodeH265SessionParametersCreateInfoEXT#maxPpsStdCount} field. */
        @NativeType("uint32_t")
        public int maxPpsStdCount() { return VkVideoDecodeH265SessionParametersCreateInfoEXT.nmaxPpsStdCount(address()); }
        /** @return a {@link VkVideoDecodeH265SessionParametersAddInfoEXT} view of the struct pointed to by the {@link VkVideoDecodeH265SessionParametersCreateInfoEXT#pParametersAddInfo} field. */
        @Nullable
        @NativeType("VkVideoDecodeH265SessionParametersAddInfoEXT const *")
        public VkVideoDecodeH265SessionParametersAddInfoEXT pParametersAddInfo() { return VkVideoDecodeH265SessionParametersCreateInfoEXT.npParametersAddInfo(address()); }

        /** Sets the specified value to the {@link VkVideoDecodeH265SessionParametersCreateInfoEXT#sType} field. */
        public VkVideoDecodeH265SessionParametersCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeH265SessionParametersCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoDecodeH265#VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_EXT} value to the {@link VkVideoDecodeH265SessionParametersCreateInfoEXT#sType} field. */
        public VkVideoDecodeH265SessionParametersCreateInfoEXT.Buffer sType$Default() { return sType(EXTVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoDecodeH265SessionParametersCreateInfoEXT#pNext} field. */
        public VkVideoDecodeH265SessionParametersCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeH265SessionParametersCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoDecodeH265SessionParametersCreateInfoEXT#maxSpsStdCount} field. */
        public VkVideoDecodeH265SessionParametersCreateInfoEXT.Buffer maxSpsStdCount(@NativeType("uint32_t") int value) { VkVideoDecodeH265SessionParametersCreateInfoEXT.nmaxSpsStdCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoDecodeH265SessionParametersCreateInfoEXT#maxPpsStdCount} field. */
        public VkVideoDecodeH265SessionParametersCreateInfoEXT.Buffer maxPpsStdCount(@NativeType("uint32_t") int value) { VkVideoDecodeH265SessionParametersCreateInfoEXT.nmaxPpsStdCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoDecodeH265SessionParametersAddInfoEXT} to the {@link VkVideoDecodeH265SessionParametersCreateInfoEXT#pParametersAddInfo} field. */
        public VkVideoDecodeH265SessionParametersCreateInfoEXT.Buffer pParametersAddInfo(@Nullable @NativeType("VkVideoDecodeH265SessionParametersAddInfoEXT const *") VkVideoDecodeH265SessionParametersAddInfoEXT value) { VkVideoDecodeH265SessionParametersCreateInfoEXT.npParametersAddInfo(address(), value); return this; }

    }

}