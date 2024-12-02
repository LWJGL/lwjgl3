/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifies H.265 encoder parameter set information.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR}</li>
 * <li>If {@code pParametersAddInfo} is not {@code NULL}, {@code pParametersAddInfo} <b>must</b> be a valid pointer to a valid {@link VkVideoEncodeH265SessionParametersAddInfoKHR} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH265SessionParametersAddInfoKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265SessionParametersCreateInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #maxStdVPSCount};
 *     uint32_t {@link #maxStdSPSCount};
 *     uint32_t {@link #maxStdPPSCount};
 *     {@link VkVideoEncodeH265SessionParametersAddInfoKHR VkVideoEncodeH265SessionParametersAddInfoKHR} const * {@link #pParametersAddInfo};
 * }</code></pre>
 */
public class VkVideoEncodeH265SessionParametersCreateInfoKHR extends Struct<VkVideoEncodeH265SessionParametersCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXSTDVPSCOUNT,
        MAXSTDSPSCOUNT,
        MAXSTDPPSCOUNT,
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
        MAXSTDVPSCOUNT = layout.offsetof(2);
        MAXSTDSPSCOUNT = layout.offsetof(3);
        MAXSTDPPSCOUNT = layout.offsetof(4);
        PPARAMETERSADDINFO = layout.offsetof(5);
    }

    protected VkVideoEncodeH265SessionParametersCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265SessionParametersCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265SessionParametersCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265SessionParametersCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265SessionParametersCreateInfoKHR(ByteBuffer container) {
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
    /** the maximum number of <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-vps">H.265 VPS</a> entries the created {@code VkVideoSessionParametersKHR} <b>can</b> contain. */
    @NativeType("uint32_t")
    public int maxStdVPSCount() { return nmaxStdVPSCount(address()); }
    /** the maximum number of <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-sps">H.265 SPS</a> entries the created {@code VkVideoSessionParametersKHR} <b>can</b> contain. */
    @NativeType("uint32_t")
    public int maxStdSPSCount() { return nmaxStdSPSCount(address()); }
    /** the maximum number of <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-pps">H.265 PPS</a> entries the created {@code VkVideoSessionParametersKHR} <b>can</b> contain. */
    @NativeType("uint32_t")
    public int maxStdPPSCount() { return nmaxStdPPSCount(address()); }
    /** {@code NULL} or a pointer to a {@link VkVideoEncodeH265SessionParametersAddInfoKHR} structure specifying H.265 parameters to add upon object creation. */
    @NativeType("VkVideoEncodeH265SessionParametersAddInfoKHR const *")
    public @Nullable VkVideoEncodeH265SessionParametersAddInfoKHR pParametersAddInfo() { return npParametersAddInfo(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265SessionParametersCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeH265SessionParametersCreateInfoKHR sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265SessionParametersCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #maxStdVPSCount} field. */
    public VkVideoEncodeH265SessionParametersCreateInfoKHR maxStdVPSCount(@NativeType("uint32_t") int value) { nmaxStdVPSCount(address(), value); return this; }
    /** Sets the specified value to the {@link #maxStdSPSCount} field. */
    public VkVideoEncodeH265SessionParametersCreateInfoKHR maxStdSPSCount(@NativeType("uint32_t") int value) { nmaxStdSPSCount(address(), value); return this; }
    /** Sets the specified value to the {@link #maxStdPPSCount} field. */
    public VkVideoEncodeH265SessionParametersCreateInfoKHR maxStdPPSCount(@NativeType("uint32_t") int value) { nmaxStdPPSCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH265SessionParametersAddInfoKHR} to the {@link #pParametersAddInfo} field. */
    public VkVideoEncodeH265SessionParametersCreateInfoKHR pParametersAddInfo(@Nullable @NativeType("VkVideoEncodeH265SessionParametersAddInfoKHR const *") VkVideoEncodeH265SessionParametersAddInfoKHR value) { npParametersAddInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265SessionParametersCreateInfoKHR set(
        int sType,
        long pNext,
        int maxStdVPSCount,
        int maxStdSPSCount,
        int maxStdPPSCount,
        @Nullable VkVideoEncodeH265SessionParametersAddInfoKHR pParametersAddInfo
    ) {
        sType(sType);
        pNext(pNext);
        maxStdVPSCount(maxStdVPSCount);
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
    public VkVideoEncodeH265SessionParametersCreateInfoKHR set(VkVideoEncodeH265SessionParametersCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265SessionParametersCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265SessionParametersCreateInfoKHR malloc() {
        return new VkVideoEncodeH265SessionParametersCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionParametersCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265SessionParametersCreateInfoKHR calloc() {
        return new VkVideoEncodeH265SessionParametersCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionParametersCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265SessionParametersCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265SessionParametersCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265SessionParametersCreateInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeH265SessionParametersCreateInfoKHR create(long address) {
        return new VkVideoEncodeH265SessionParametersCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH265SessionParametersCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265SessionParametersCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265SessionParametersCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH265SessionParametersCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265SessionParametersCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265SessionParametersCreateInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265SessionParametersCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265SessionParametersCreateInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265SessionParametersCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265SessionParametersCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeH265SessionParametersCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265SessionParametersCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #maxStdVPSCount}. */
    public static int nmaxStdVPSCount(long struct) { return memGetInt(struct + VkVideoEncodeH265SessionParametersCreateInfoKHR.MAXSTDVPSCOUNT); }
    /** Unsafe version of {@link #maxStdSPSCount}. */
    public static int nmaxStdSPSCount(long struct) { return memGetInt(struct + VkVideoEncodeH265SessionParametersCreateInfoKHR.MAXSTDSPSCOUNT); }
    /** Unsafe version of {@link #maxStdPPSCount}. */
    public static int nmaxStdPPSCount(long struct) { return memGetInt(struct + VkVideoEncodeH265SessionParametersCreateInfoKHR.MAXSTDPPSCOUNT); }
    /** Unsafe version of {@link #pParametersAddInfo}. */
    public static @Nullable VkVideoEncodeH265SessionParametersAddInfoKHR npParametersAddInfo(long struct) { return VkVideoEncodeH265SessionParametersAddInfoKHR.createSafe(memGetAddress(struct + VkVideoEncodeH265SessionParametersCreateInfoKHR.PPARAMETERSADDINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeH265SessionParametersCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265SessionParametersCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #maxStdVPSCount(int) maxStdVPSCount}. */
    public static void nmaxStdVPSCount(long struct, int value) { memPutInt(struct + VkVideoEncodeH265SessionParametersCreateInfoKHR.MAXSTDVPSCOUNT, value); }
    /** Unsafe version of {@link #maxStdSPSCount(int) maxStdSPSCount}. */
    public static void nmaxStdSPSCount(long struct, int value) { memPutInt(struct + VkVideoEncodeH265SessionParametersCreateInfoKHR.MAXSTDSPSCOUNT, value); }
    /** Unsafe version of {@link #maxStdPPSCount(int) maxStdPPSCount}. */
    public static void nmaxStdPPSCount(long struct, int value) { memPutInt(struct + VkVideoEncodeH265SessionParametersCreateInfoKHR.MAXSTDPPSCOUNT, value); }
    /** Unsafe version of {@link #pParametersAddInfo(VkVideoEncodeH265SessionParametersAddInfoKHR) pParametersAddInfo}. */
    public static void npParametersAddInfo(long struct, @Nullable VkVideoEncodeH265SessionParametersAddInfoKHR value) { memPutAddress(struct + VkVideoEncodeH265SessionParametersCreateInfoKHR.PPARAMETERSADDINFO, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265SessionParametersCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265SessionParametersCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265SessionParametersCreateInfoKHR ELEMENT_FACTORY = VkVideoEncodeH265SessionParametersCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265SessionParametersCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265SessionParametersCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkVideoEncodeH265SessionParametersCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265SessionParametersCreateInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265SessionParametersCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersCreateInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265SessionParametersCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersCreateInfoKHR#maxStdVPSCount} field. */
        @NativeType("uint32_t")
        public int maxStdVPSCount() { return VkVideoEncodeH265SessionParametersCreateInfoKHR.nmaxStdVPSCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersCreateInfoKHR#maxStdSPSCount} field. */
        @NativeType("uint32_t")
        public int maxStdSPSCount() { return VkVideoEncodeH265SessionParametersCreateInfoKHR.nmaxStdSPSCount(address()); }
        /** @return the value of the {@link VkVideoEncodeH265SessionParametersCreateInfoKHR#maxStdPPSCount} field. */
        @NativeType("uint32_t")
        public int maxStdPPSCount() { return VkVideoEncodeH265SessionParametersCreateInfoKHR.nmaxStdPPSCount(address()); }
        /** @return a {@link VkVideoEncodeH265SessionParametersAddInfoKHR} view of the struct pointed to by the {@link VkVideoEncodeH265SessionParametersCreateInfoKHR#pParametersAddInfo} field. */
        @NativeType("VkVideoEncodeH265SessionParametersAddInfoKHR const *")
        public @Nullable VkVideoEncodeH265SessionParametersAddInfoKHR pParametersAddInfo() { return VkVideoEncodeH265SessionParametersCreateInfoKHR.npParametersAddInfo(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersCreateInfoKHR#sType} field. */
        public VkVideoEncodeH265SessionParametersCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265SessionParametersCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR} value to the {@link VkVideoEncodeH265SessionParametersCreateInfoKHR#sType} field. */
        public VkVideoEncodeH265SessionParametersCreateInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersCreateInfoKHR#pNext} field. */
        public VkVideoEncodeH265SessionParametersCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265SessionParametersCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersCreateInfoKHR#maxStdVPSCount} field. */
        public VkVideoEncodeH265SessionParametersCreateInfoKHR.Buffer maxStdVPSCount(@NativeType("uint32_t") int value) { VkVideoEncodeH265SessionParametersCreateInfoKHR.nmaxStdVPSCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersCreateInfoKHR#maxStdSPSCount} field. */
        public VkVideoEncodeH265SessionParametersCreateInfoKHR.Buffer maxStdSPSCount(@NativeType("uint32_t") int value) { VkVideoEncodeH265SessionParametersCreateInfoKHR.nmaxStdSPSCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265SessionParametersCreateInfoKHR#maxStdPPSCount} field. */
        public VkVideoEncodeH265SessionParametersCreateInfoKHR.Buffer maxStdPPSCount(@NativeType("uint32_t") int value) { VkVideoEncodeH265SessionParametersCreateInfoKHR.nmaxStdPPSCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH265SessionParametersAddInfoKHR} to the {@link VkVideoEncodeH265SessionParametersCreateInfoKHR#pParametersAddInfo} field. */
        public VkVideoEncodeH265SessionParametersCreateInfoKHR.Buffer pParametersAddInfo(@Nullable @NativeType("VkVideoEncodeH265SessionParametersAddInfoKHR const *") VkVideoEncodeH265SessionParametersAddInfoKHR value) { VkVideoEncodeH265SessionParametersCreateInfoKHR.npParametersAddInfo(address(), value); return this; }

    }

}