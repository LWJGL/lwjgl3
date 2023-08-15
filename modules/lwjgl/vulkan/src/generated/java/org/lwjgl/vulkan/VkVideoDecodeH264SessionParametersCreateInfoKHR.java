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
 * <li>{@code sType} <b>must</b> be {@link KHRVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR}</li>
 * <li>If {@code pParametersAddInfo} is not {@code NULL}, {@code pParametersAddInfo} <b>must</b> be a valid pointer to a valid {@link VkVideoDecodeH264SessionParametersAddInfoKHR} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoDecodeH264SessionParametersAddInfoKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoDecodeH264SessionParametersCreateInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #maxStdSPSCount};
 *     uint32_t {@link #maxStdPPSCount};
 *     {@link VkVideoDecodeH264SessionParametersAddInfoKHR VkVideoDecodeH264SessionParametersAddInfoKHR} const * {@link #pParametersAddInfo};
 * }</code></pre>
 */
public class VkVideoDecodeH264SessionParametersCreateInfoKHR extends Struct<VkVideoDecodeH264SessionParametersCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXSTDSPSCOUNT,
        MAXSTDPPSCOUNT,
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
        MAXSTDSPSCOUNT = layout.offsetof(2);
        MAXSTDPPSCOUNT = layout.offsetof(3);
        PPARAMETERSADDINFO = layout.offsetof(4);
    }

    protected VkVideoDecodeH264SessionParametersCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoDecodeH264SessionParametersCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoDecodeH264SessionParametersCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoDecodeH264SessionParametersCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeH264SessionParametersCreateInfoKHR(ByteBuffer container) {
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
    /** the maximum number of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-sps">H.264 SPS</a> entries the created {@code VkVideoSessionParametersKHR} <b>can</b> contain. */
    @NativeType("uint32_t")
    public int maxStdSPSCount() { return nmaxStdSPSCount(address()); }
    /** the maximum number of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#decode-h264-pps">H.264 PPS</a> entries the created {@code VkVideoSessionParametersKHR} <b>can</b> contain. */
    @NativeType("uint32_t")
    public int maxStdPPSCount() { return nmaxStdPPSCount(address()); }
    /** {@code NULL} or a pointer to a {@link VkVideoDecodeH264SessionParametersAddInfoKHR} structure specifying H.264 parameters to add upon object creation. */
    @Nullable
    @NativeType("VkVideoDecodeH264SessionParametersAddInfoKHR const *")
    public VkVideoDecodeH264SessionParametersAddInfoKHR pParametersAddInfo() { return npParametersAddInfo(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoDecodeH264SessionParametersCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoDecodeH264SessionParametersCreateInfoKHR sType$Default() { return sType(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoDecodeH264SessionParametersCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #maxStdSPSCount} field. */
    public VkVideoDecodeH264SessionParametersCreateInfoKHR maxStdSPSCount(@NativeType("uint32_t") int value) { nmaxStdSPSCount(address(), value); return this; }
    /** Sets the specified value to the {@link #maxStdPPSCount} field. */
    public VkVideoDecodeH264SessionParametersCreateInfoKHR maxStdPPSCount(@NativeType("uint32_t") int value) { nmaxStdPPSCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoDecodeH264SessionParametersAddInfoKHR} to the {@link #pParametersAddInfo} field. */
    public VkVideoDecodeH264SessionParametersCreateInfoKHR pParametersAddInfo(@Nullable @NativeType("VkVideoDecodeH264SessionParametersAddInfoKHR const *") VkVideoDecodeH264SessionParametersAddInfoKHR value) { npParametersAddInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeH264SessionParametersCreateInfoKHR set(
        int sType,
        long pNext,
        int maxStdSPSCount,
        int maxStdPPSCount,
        @Nullable VkVideoDecodeH264SessionParametersAddInfoKHR pParametersAddInfo
    ) {
        sType(sType);
        pNext(pNext);
        maxStdSPSCount(maxStdSPSCount);
        maxStdPPSCount(maxStdPPSCount);
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
    public VkVideoDecodeH264SessionParametersCreateInfoKHR set(VkVideoDecodeH264SessionParametersCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeH264SessionParametersCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264SessionParametersCreateInfoKHR malloc() {
        return new VkVideoDecodeH264SessionParametersCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeH264SessionParametersCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeH264SessionParametersCreateInfoKHR calloc() {
        return new VkVideoDecodeH264SessionParametersCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeH264SessionParametersCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeH264SessionParametersCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeH264SessionParametersCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeH264SessionParametersCreateInfoKHR} instance for the specified memory address. */
    public static VkVideoDecodeH264SessionParametersCreateInfoKHR create(long address) {
        return new VkVideoDecodeH264SessionParametersCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH264SessionParametersCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoDecodeH264SessionParametersCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionParametersCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionParametersCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionParametersCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionParametersCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionParametersCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionParametersCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoDecodeH264SessionParametersCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionParametersCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeH264SessionParametersCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeH264SessionParametersCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264SessionParametersCreateInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeH264SessionParametersCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoDecodeH264SessionParametersCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeH264SessionParametersCreateInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeH264SessionParametersCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionParametersCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionParametersCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeH264SessionParametersCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeH264SessionParametersCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264SessionParametersCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeH264SessionParametersCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #maxStdSPSCount}. */
    public static int nmaxStdSPSCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264SessionParametersCreateInfoKHR.MAXSTDSPSCOUNT); }
    /** Unsafe version of {@link #maxStdPPSCount}. */
    public static int nmaxStdPPSCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeH264SessionParametersCreateInfoKHR.MAXSTDPPSCOUNT); }
    /** Unsafe version of {@link #pParametersAddInfo}. */
    @Nullable public static VkVideoDecodeH264SessionParametersAddInfoKHR npParametersAddInfo(long struct) { return VkVideoDecodeH264SessionParametersAddInfoKHR.createSafe(memGetAddress(struct + VkVideoDecodeH264SessionParametersCreateInfoKHR.PPARAMETERSADDINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264SessionParametersCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeH264SessionParametersCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #maxStdSPSCount(int) maxStdSPSCount}. */
    public static void nmaxStdSPSCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264SessionParametersCreateInfoKHR.MAXSTDSPSCOUNT, value); }
    /** Unsafe version of {@link #maxStdPPSCount(int) maxStdPPSCount}. */
    public static void nmaxStdPPSCount(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeH264SessionParametersCreateInfoKHR.MAXSTDPPSCOUNT, value); }
    /** Unsafe version of {@link #pParametersAddInfo(VkVideoDecodeH264SessionParametersAddInfoKHR) pParametersAddInfo}. */
    public static void npParametersAddInfo(long struct, @Nullable VkVideoDecodeH264SessionParametersAddInfoKHR value) { memPutAddress(struct + VkVideoDecodeH264SessionParametersCreateInfoKHR.PPARAMETERSADDINFO, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pParametersAddInfo = memGetAddress(struct + VkVideoDecodeH264SessionParametersCreateInfoKHR.PPARAMETERSADDINFO);
        if (pParametersAddInfo != NULL) {
            VkVideoDecodeH264SessionParametersAddInfoKHR.validate(pParametersAddInfo);
        }
    }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeH264SessionParametersCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeH264SessionParametersCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoDecodeH264SessionParametersCreateInfoKHR ELEMENT_FACTORY = VkVideoDecodeH264SessionParametersCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeH264SessionParametersCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeH264SessionParametersCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoDecodeH264SessionParametersCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoDecodeH264SessionParametersCreateInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeH264SessionParametersCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoDecodeH264SessionParametersCreateInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeH264SessionParametersCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoDecodeH264SessionParametersCreateInfoKHR#maxStdSPSCount} field. */
        @NativeType("uint32_t")
        public int maxStdSPSCount() { return VkVideoDecodeH264SessionParametersCreateInfoKHR.nmaxStdSPSCount(address()); }
        /** @return the value of the {@link VkVideoDecodeH264SessionParametersCreateInfoKHR#maxStdPPSCount} field. */
        @NativeType("uint32_t")
        public int maxStdPPSCount() { return VkVideoDecodeH264SessionParametersCreateInfoKHR.nmaxStdPPSCount(address()); }
        /** @return a {@link VkVideoDecodeH264SessionParametersAddInfoKHR} view of the struct pointed to by the {@link VkVideoDecodeH264SessionParametersCreateInfoKHR#pParametersAddInfo} field. */
        @Nullable
        @NativeType("VkVideoDecodeH264SessionParametersAddInfoKHR const *")
        public VkVideoDecodeH264SessionParametersAddInfoKHR pParametersAddInfo() { return VkVideoDecodeH264SessionParametersCreateInfoKHR.npParametersAddInfo(address()); }

        /** Sets the specified value to the {@link VkVideoDecodeH264SessionParametersCreateInfoKHR#sType} field. */
        public VkVideoDecodeH264SessionParametersCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeH264SessionParametersCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoDecodeH264#VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR} value to the {@link VkVideoDecodeH264SessionParametersCreateInfoKHR#sType} field. */
        public VkVideoDecodeH264SessionParametersCreateInfoKHR.Buffer sType$Default() { return sType(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoDecodeH264SessionParametersCreateInfoKHR#pNext} field. */
        public VkVideoDecodeH264SessionParametersCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeH264SessionParametersCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoDecodeH264SessionParametersCreateInfoKHR#maxStdSPSCount} field. */
        public VkVideoDecodeH264SessionParametersCreateInfoKHR.Buffer maxStdSPSCount(@NativeType("uint32_t") int value) { VkVideoDecodeH264SessionParametersCreateInfoKHR.nmaxStdSPSCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoDecodeH264SessionParametersCreateInfoKHR#maxStdPPSCount} field. */
        public VkVideoDecodeH264SessionParametersCreateInfoKHR.Buffer maxStdPPSCount(@NativeType("uint32_t") int value) { VkVideoDecodeH264SessionParametersCreateInfoKHR.nmaxStdPPSCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoDecodeH264SessionParametersAddInfoKHR} to the {@link VkVideoDecodeH264SessionParametersCreateInfoKHR#pParametersAddInfo} field. */
        public VkVideoDecodeH264SessionParametersCreateInfoKHR.Buffer pParametersAddInfo(@Nullable @NativeType("VkVideoDecodeH264SessionParametersAddInfoKHR const *") VkVideoDecodeH264SessionParametersAddInfoKHR value) { VkVideoDecodeH264SessionParametersCreateInfoKHR.npParametersAddInfo(address(), value); return this; }

    }

}