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
 * <pre>{@code
 * struct VkVideoEncodeH264SessionParametersCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t maxStdSPSCount;
 *     uint32_t maxStdPPSCount;
 *     {@link VkVideoEncodeH264SessionParametersAddInfoKHR VkVideoEncodeH264SessionParametersAddInfoKHR} const * pParametersAddInfo;
 * }}</pre>
 */
public class VkVideoEncodeH264SessionParametersCreateInfoKHR extends Struct<VkVideoEncodeH264SessionParametersCreateInfoKHR> implements NativeResource {

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

    protected VkVideoEncodeH264SessionParametersCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH264SessionParametersCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264SessionParametersCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH264SessionParametersCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264SessionParametersCreateInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code maxStdSPSCount} field. */
    @NativeType("uint32_t")
    public int maxStdSPSCount() { return nmaxStdSPSCount(address()); }
    /** @return the value of the {@code maxStdPPSCount} field. */
    @NativeType("uint32_t")
    public int maxStdPPSCount() { return nmaxStdPPSCount(address()); }
    /** @return a {@link VkVideoEncodeH264SessionParametersAddInfoKHR} view of the struct pointed to by the {@code pParametersAddInfo} field. */
    @NativeType("VkVideoEncodeH264SessionParametersAddInfoKHR const *")
    public @Nullable VkVideoEncodeH264SessionParametersAddInfoKHR pParametersAddInfo() { return npParametersAddInfo(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeH264SessionParametersCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR} value to the {@code sType} field. */
    public VkVideoEncodeH264SessionParametersCreateInfoKHR sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeH264SessionParametersCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code maxStdSPSCount} field. */
    public VkVideoEncodeH264SessionParametersCreateInfoKHR maxStdSPSCount(@NativeType("uint32_t") int value) { nmaxStdSPSCount(address(), value); return this; }
    /** Sets the specified value to the {@code maxStdPPSCount} field. */
    public VkVideoEncodeH264SessionParametersCreateInfoKHR maxStdPPSCount(@NativeType("uint32_t") int value) { nmaxStdPPSCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH264SessionParametersAddInfoKHR} to the {@code pParametersAddInfo} field. */
    public VkVideoEncodeH264SessionParametersCreateInfoKHR pParametersAddInfo(@Nullable @NativeType("VkVideoEncodeH264SessionParametersAddInfoKHR const *") VkVideoEncodeH264SessionParametersAddInfoKHR value) { npParametersAddInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264SessionParametersCreateInfoKHR set(
        int sType,
        long pNext,
        int maxStdSPSCount,
        int maxStdPPSCount,
        @Nullable VkVideoEncodeH264SessionParametersAddInfoKHR pParametersAddInfo
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
    public VkVideoEncodeH264SessionParametersCreateInfoKHR set(VkVideoEncodeH264SessionParametersCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264SessionParametersCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264SessionParametersCreateInfoKHR malloc() {
        return new VkVideoEncodeH264SessionParametersCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264SessionParametersCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264SessionParametersCreateInfoKHR calloc() {
        return new VkVideoEncodeH264SessionParametersCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264SessionParametersCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264SessionParametersCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264SessionParametersCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264SessionParametersCreateInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeH264SessionParametersCreateInfoKHR create(long address) {
        return new VkVideoEncodeH264SessionParametersCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH264SessionParametersCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH264SessionParametersCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH264SessionParametersCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH264SessionParametersCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264SessionParametersCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264SessionParametersCreateInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionParametersCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264SessionParametersCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264SessionParametersCreateInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionParametersCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264SessionParametersCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264SessionParametersCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeH264SessionParametersCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH264SessionParametersCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #maxStdSPSCount}. */
    public static int nmaxStdSPSCount(long struct) { return memGetInt(struct + VkVideoEncodeH264SessionParametersCreateInfoKHR.MAXSTDSPSCOUNT); }
    /** Unsafe version of {@link #maxStdPPSCount}. */
    public static int nmaxStdPPSCount(long struct) { return memGetInt(struct + VkVideoEncodeH264SessionParametersCreateInfoKHR.MAXSTDPPSCOUNT); }
    /** Unsafe version of {@link #pParametersAddInfo}. */
    public static @Nullable VkVideoEncodeH264SessionParametersAddInfoKHR npParametersAddInfo(long struct) { return VkVideoEncodeH264SessionParametersAddInfoKHR.createSafe(memGetAddress(struct + VkVideoEncodeH264SessionParametersCreateInfoKHR.PPARAMETERSADDINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeH264SessionParametersCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH264SessionParametersCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #maxStdSPSCount(int) maxStdSPSCount}. */
    public static void nmaxStdSPSCount(long struct, int value) { memPutInt(struct + VkVideoEncodeH264SessionParametersCreateInfoKHR.MAXSTDSPSCOUNT, value); }
    /** Unsafe version of {@link #maxStdPPSCount(int) maxStdPPSCount}. */
    public static void nmaxStdPPSCount(long struct, int value) { memPutInt(struct + VkVideoEncodeH264SessionParametersCreateInfoKHR.MAXSTDPPSCOUNT, value); }
    /** Unsafe version of {@link #pParametersAddInfo(VkVideoEncodeH264SessionParametersAddInfoKHR) pParametersAddInfo}. */
    public static void npParametersAddInfo(long struct, @Nullable VkVideoEncodeH264SessionParametersAddInfoKHR value) { memPutAddress(struct + VkVideoEncodeH264SessionParametersCreateInfoKHR.PPARAMETERSADDINFO, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264SessionParametersCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264SessionParametersCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264SessionParametersCreateInfoKHR ELEMENT_FACTORY = VkVideoEncodeH264SessionParametersCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264SessionParametersCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264SessionParametersCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH264SessionParametersCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH264SessionParametersCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH264SessionParametersCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@code maxStdSPSCount} field. */
        @NativeType("uint32_t")
        public int maxStdSPSCount() { return VkVideoEncodeH264SessionParametersCreateInfoKHR.nmaxStdSPSCount(address()); }
        /** @return the value of the {@code maxStdPPSCount} field. */
        @NativeType("uint32_t")
        public int maxStdPPSCount() { return VkVideoEncodeH264SessionParametersCreateInfoKHR.nmaxStdPPSCount(address()); }
        /** @return a {@link VkVideoEncodeH264SessionParametersAddInfoKHR} view of the struct pointed to by the {@code pParametersAddInfo} field. */
        @NativeType("VkVideoEncodeH264SessionParametersAddInfoKHR const *")
        public @Nullable VkVideoEncodeH264SessionParametersAddInfoKHR pParametersAddInfo() { return VkVideoEncodeH264SessionParametersCreateInfoKHR.npParametersAddInfo(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeH264SessionParametersCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH264SessionParametersCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH264#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR} value to the {@code sType} field. */
        public VkVideoEncodeH264SessionParametersCreateInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeH264SessionParametersCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH264SessionParametersCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code maxStdSPSCount} field. */
        public VkVideoEncodeH264SessionParametersCreateInfoKHR.Buffer maxStdSPSCount(@NativeType("uint32_t") int value) { VkVideoEncodeH264SessionParametersCreateInfoKHR.nmaxStdSPSCount(address(), value); return this; }
        /** Sets the specified value to the {@code maxStdPPSCount} field. */
        public VkVideoEncodeH264SessionParametersCreateInfoKHR.Buffer maxStdPPSCount(@NativeType("uint32_t") int value) { VkVideoEncodeH264SessionParametersCreateInfoKHR.nmaxStdPPSCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH264SessionParametersAddInfoKHR} to the {@code pParametersAddInfo} field. */
        public VkVideoEncodeH264SessionParametersCreateInfoKHR.Buffer pParametersAddInfo(@Nullable @NativeType("VkVideoEncodeH264SessionParametersAddInfoKHR const *") VkVideoEncodeH264SessionParametersAddInfoKHR value) { VkVideoEncodeH264SessionParametersCreateInfoKHR.npParametersAddInfo(address(), value); return this; }

    }

}