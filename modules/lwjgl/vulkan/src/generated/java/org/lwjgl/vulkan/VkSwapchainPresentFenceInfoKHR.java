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
 * struct VkSwapchainPresentFenceInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t swapchainCount;
 *     VkFence const * pFences;
 * }}</pre>
 */
public class VkSwapchainPresentFenceInfoKHR extends Struct<VkSwapchainPresentFenceInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SWAPCHAINCOUNT,
        PFENCES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAINCOUNT = layout.offsetof(2);
        PFENCES = layout.offsetof(3);
    }

    protected VkSwapchainPresentFenceInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSwapchainPresentFenceInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkSwapchainPresentFenceInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkSwapchainPresentFenceInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSwapchainPresentFenceInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code swapchainCount} field. */
    @NativeType("uint32_t")
    public int swapchainCount() { return nswapchainCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pFences} field. */
    @NativeType("VkFence const *")
    public @Nullable LongBuffer pFences() { return npFences(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSwapchainPresentFenceInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRSwapchainMaintenance1#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_KHR STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_KHR} value to the {@code sType} field. */
    public VkSwapchainPresentFenceInfoKHR sType$Default() { return sType(KHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSwapchainPresentFenceInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code swapchainCount} field. */
    public VkSwapchainPresentFenceInfoKHR swapchainCount(@NativeType("uint32_t") int value) { nswapchainCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pFences} field. */
    public VkSwapchainPresentFenceInfoKHR pFences(@Nullable @NativeType("VkFence const *") LongBuffer value) { npFences(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSwapchainPresentFenceInfoKHR set(
        int sType,
        long pNext,
        int swapchainCount,
        @Nullable LongBuffer pFences
    ) {
        sType(sType);
        pNext(pNext);
        swapchainCount(swapchainCount);
        pFences(pFences);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSwapchainPresentFenceInfoKHR set(VkSwapchainPresentFenceInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSwapchainPresentFenceInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSwapchainPresentFenceInfoKHR malloc() {
        return new VkSwapchainPresentFenceInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainPresentFenceInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSwapchainPresentFenceInfoKHR calloc() {
        return new VkSwapchainPresentFenceInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainPresentFenceInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkSwapchainPresentFenceInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainPresentFenceInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkSwapchainPresentFenceInfoKHR} instance for the specified memory address. */
    public static VkSwapchainPresentFenceInfoKHR create(long address) {
        return new VkSwapchainPresentFenceInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSwapchainPresentFenceInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkSwapchainPresentFenceInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkSwapchainPresentFenceInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentFenceInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentFenceInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentFenceInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentFenceInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentFenceInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSwapchainPresentFenceInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentFenceInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSwapchainPresentFenceInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSwapchainPresentFenceInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainPresentFenceInfoKHR malloc(MemoryStack stack) {
        return new VkSwapchainPresentFenceInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSwapchainPresentFenceInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainPresentFenceInfoKHR calloc(MemoryStack stack) {
        return new VkSwapchainPresentFenceInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSwapchainPresentFenceInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentFenceInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentFenceInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentFenceInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSwapchainPresentFenceInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSwapchainPresentFenceInfoKHR.PNEXT); }
    /** Unsafe version of {@link #swapchainCount}. */
    public static int nswapchainCount(long struct) { return memGetInt(struct + VkSwapchainPresentFenceInfoKHR.SWAPCHAINCOUNT); }
    /** Unsafe version of {@link #pFences() pFences}. */
    public static @Nullable LongBuffer npFences(long struct) { return memLongBufferSafe(memGetAddress(struct + VkSwapchainPresentFenceInfoKHR.PFENCES), nswapchainCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSwapchainPresentFenceInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSwapchainPresentFenceInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code swapchainCount} field of the specified {@code struct}. */
    public static void nswapchainCount(long struct, int value) { memPutInt(struct + VkSwapchainPresentFenceInfoKHR.SWAPCHAINCOUNT, value); }
    /** Unsafe version of {@link #pFences(LongBuffer) pFences}. */
    public static void npFences(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkSwapchainPresentFenceInfoKHR.PFENCES, memAddressSafe(value)); if (value != null) { nswapchainCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkSwapchainPresentFenceInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkSwapchainPresentFenceInfoKHR, Buffer> implements NativeResource {

        private static final VkSwapchainPresentFenceInfoKHR ELEMENT_FACTORY = VkSwapchainPresentFenceInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkSwapchainPresentFenceInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSwapchainPresentFenceInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSwapchainPresentFenceInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSwapchainPresentFenceInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSwapchainPresentFenceInfoKHR.npNext(address()); }
        /** @return the value of the {@code swapchainCount} field. */
        @NativeType("uint32_t")
        public int swapchainCount() { return VkSwapchainPresentFenceInfoKHR.nswapchainCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pFences} field. */
        @NativeType("VkFence const *")
        public @Nullable LongBuffer pFences() { return VkSwapchainPresentFenceInfoKHR.npFences(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSwapchainPresentFenceInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSwapchainPresentFenceInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRSwapchainMaintenance1#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_KHR STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_KHR} value to the {@code sType} field. */
        public VkSwapchainPresentFenceInfoKHR.Buffer sType$Default() { return sType(KHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSwapchainPresentFenceInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkSwapchainPresentFenceInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code swapchainCount} field. */
        public VkSwapchainPresentFenceInfoKHR.Buffer swapchainCount(@NativeType("uint32_t") int value) { VkSwapchainPresentFenceInfoKHR.nswapchainCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pFences} field. */
        public VkSwapchainPresentFenceInfoKHR.Buffer pFences(@Nullable @NativeType("VkFence const *") LongBuffer value) { VkSwapchainPresentFenceInfoKHR.npFences(address(), value); return this; }

    }

}