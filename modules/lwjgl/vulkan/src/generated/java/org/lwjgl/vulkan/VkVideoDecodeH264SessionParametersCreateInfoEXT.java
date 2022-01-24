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
 * Structure specifies H.264 decoder parameter set information.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_EXT}</li>
 * <li>If {@code pParametersAddInfo} is not {@code NULL}, {@code pParametersAddInfo} <b>must</b> be a valid pointer to a valid {@link VkVideoDecodeH264SessionParametersAddInfoEXT} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoDecodeH264SessionParametersAddInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoDecodeH264SessionParametersCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #maxSpsStdCount};
 *     uint32_t {@link #maxPpsStdCount};
 *     {@link VkVideoDecodeH264SessionParametersAddInfoEXT VkVideoDecodeH264SessionParametersAddInfoEXT} const * {@link #pParametersAddInfo};
 * }</code></pre>
 */
public class VkVideoDecodeH264SessionParametersCreateInfoEXT extends Struct implements NativeResource {

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
     * Creates a {@code VkVideoDecodeH264SessionParametersCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeH264SessionParametersCreateInfoEXT(ByteBuffer container) {
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
    /** {@code NULL} or a pointer to a {@link VkVideoDecodeH264SessionParametersAddInfoEXT} structure specifying H.264 parameters to add upon object creation. */
    @Nullable
    @NativeType("VkVideoDecodeH264SessionParametersAddInfoEXT const *")
    public VkVideoDecodeH264SessionParametersAddInfoEXT pParametersAddInfo() { return npParametersAddInfo(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoDecodeH264SessionParametersCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoDecodeH264SessionParametersCreateInfoEXT sType$Default() { return sType(EXTVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoDecodeH264SessionParametersCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #maxSpsStdCount} field. */
    public VkVideoDecodeH264SessionParametersCreateInfoEXT maxSpsStdCount(@NativeType("uint32_t") int value) { nmaxSpsStdCount(address(), value); return this; }
    /** Sets the specified value to the {@link #maxPpsStdCount} field. */
    public VkVideoDecodeH264SessionParametersCreateInfoEXT maxPpsStdCount(@NativeType("uint32_t") int value) { nmaxPpsStdCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoDecodeH264SessionParametersAddInfoEXT} to the {@link #pParametersAddInfo} field. */
    public VkVideoDecodeH264SessionParametersCreateInfoEXT pParametersAddInfo(@Nullable @NativeType("VkVideoDecodeH264SessionParametersAddInfoEXT const *") VkVideoDecodeH264SessionParametersAddInfoEXT value) { npParametersAddInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeH264SessionParametersCreateInfoEXT set(
        int sType,
        long pNext,
        int maxSpsStdCount,
        int maxPpsStdCount,
        @Nullable VkVideoDecodeH264SessionParametersAddInfoEXT pParametersAddInfo
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
    public VkVideoDecodeH264SessionParametersCreateInfoEXT set(VkVideoDecodeH264SessionParametersCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeH264SessionParametersCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264SessionParametersCreateInfoEXT malloc() {
        return wrap(VkVideoDecodeH264SessionParametersCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeH264SessionParametersCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264SessionParametersCreateInfoEXT calloc() {
        return wrap(VkVideoDecodeH264SessionParametersCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoDecodeH264SessionParametersCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeH264SessionParametersCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoDecodeH264SessionParametersCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeH264SessionParametersCreateInfoEXT} instance for the specified memory address. */
    public static VkVideoDecodeH264SessionParametersCreateInfoEXT create(long address) {
        return wrap(VkVideoDecodeH264SessionParametersCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH264SessionParametersCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoDecodeH264SessionParametersCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionParametersCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionParametersCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionParametersCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionParametersCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionParametersCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionParametersCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoDecodeH264SessionParametersCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionParametersCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH264SessionParametersCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeH264SessionParametersCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264SessionParametersCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkVideoDecodeH264SessionParametersCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoDecodeH264SessionParametersCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264SessionParametersCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkVideoDecodeH264SessionParametersCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionParametersCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionParametersCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionParametersCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionParametersCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264SessionParametersCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeH264SessionParametersCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #maxSpsStdCount}. */
    public static int nmaxSpsStdCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264SessionParametersCreateInfoEXT.MAXSPSSTDCOUNT); }
    /** Unsafe version of {@link #maxPpsStdCount}. */
    public static int nmaxPpsStdCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264SessionParametersCreateInfoEXT.MAXPPSSTDCOUNT); }
    /** Unsafe version of {@link #pParametersAddInfo}. */
    @Nullable public static VkVideoDecodeH264SessionParametersAddInfoEXT npParametersAddInfo(long struct) { return VkVideoDecodeH264SessionParametersAddInfoEXT.createSafe(memGetAddress(struct + VkVideoDecodeH264SessionParametersCreateInfoEXT.PPARAMETERSADDINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264SessionParametersCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeH264SessionParametersCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #maxSpsStdCount(int) maxSpsStdCount}. */
    public static void nmaxSpsStdCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264SessionParametersCreateInfoEXT.MAXSPSSTDCOUNT, value); }
    /** Unsafe version of {@link #maxPpsStdCount(int) maxPpsStdCount}. */
    public static void nmaxPpsStdCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264SessionParametersCreateInfoEXT.MAXPPSSTDCOUNT, value); }
    /** Unsafe version of {@link #pParametersAddInfo(VkVideoDecodeH264SessionParametersAddInfoEXT) pParametersAddInfo}. */
    public static void npParametersAddInfo(long struct, @Nullable VkVideoDecodeH264SessionParametersAddInfoEXT value) { memPutAddress(struct + VkVideoDecodeH264SessionParametersCreateInfoEXT.PPARAMETERSADDINFO, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeH264SessionParametersCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeH264SessionParametersCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoDecodeH264SessionParametersCreateInfoEXT ELEMENT_FACTORY = VkVideoDecodeH264SessionParametersCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeH264SessionParametersCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeH264SessionParametersCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoDecodeH264SessionParametersCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoDecodeH264SessionParametersCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeH264SessionParametersCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoDecodeH264SessionParametersCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeH264SessionParametersCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoDecodeH264SessionParametersCreateInfoEXT#maxSpsStdCount} field. */
        @NativeType("uint32_t")
        public int maxSpsStdCount() { return VkVideoDecodeH264SessionParametersCreateInfoEXT.nmaxSpsStdCount(address()); }
        /** @return the value of the {@link VkVideoDecodeH264SessionParametersCreateInfoEXT#maxPpsStdCount} field. */
        @NativeType("uint32_t")
        public int maxPpsStdCount() { return VkVideoDecodeH264SessionParametersCreateInfoEXT.nmaxPpsStdCount(address()); }
        /** @return a {@link VkVideoDecodeH264SessionParametersAddInfoEXT} view of the struct pointed to by the {@link VkVideoDecodeH264SessionParametersCreateInfoEXT#pParametersAddInfo} field. */
        @Nullable
        @NativeType("VkVideoDecodeH264SessionParametersAddInfoEXT const *")
        public VkVideoDecodeH264SessionParametersAddInfoEXT pParametersAddInfo() { return VkVideoDecodeH264SessionParametersCreateInfoEXT.npParametersAddInfo(address()); }

        /** Sets the specified value to the {@link VkVideoDecodeH264SessionParametersCreateInfoEXT#sType} field. */
        public VkVideoDecodeH264SessionParametersCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeH264SessionParametersCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_EXT STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_EXT} value to the {@link VkVideoDecodeH264SessionParametersCreateInfoEXT#sType} field. */
        public VkVideoDecodeH264SessionParametersCreateInfoEXT.Buffer sType$Default() { return sType(EXTVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoDecodeH264SessionParametersCreateInfoEXT#pNext} field. */
        public VkVideoDecodeH264SessionParametersCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeH264SessionParametersCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoDecodeH264SessionParametersCreateInfoEXT#maxSpsStdCount} field. */
        public VkVideoDecodeH264SessionParametersCreateInfoEXT.Buffer maxSpsStdCount(@NativeType("uint32_t") int value) { VkVideoDecodeH264SessionParametersCreateInfoEXT.nmaxSpsStdCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoDecodeH264SessionParametersCreateInfoEXT#maxPpsStdCount} field. */
        public VkVideoDecodeH264SessionParametersCreateInfoEXT.Buffer maxPpsStdCount(@NativeType("uint32_t") int value) { VkVideoDecodeH264SessionParametersCreateInfoEXT.nmaxPpsStdCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoDecodeH264SessionParametersAddInfoEXT} to the {@link VkVideoDecodeH264SessionParametersCreateInfoEXT#pParametersAddInfo} field. */
        public VkVideoDecodeH264SessionParametersCreateInfoEXT.Buffer pParametersAddInfo(@Nullable @NativeType("VkVideoDecodeH264SessionParametersAddInfoEXT const *") VkVideoDecodeH264SessionParametersAddInfoEXT value) { VkVideoDecodeH264SessionParametersCreateInfoEXT.npParametersAddInfo(address(), value); return this; }

    }

}