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
 * struct VkSwapchainPresentFenceInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t swapchainCount;
 *     VkFence const * pFences;
 * }}</pre>
 */
public class VkSwapchainPresentFenceInfoEXT extends Struct<VkSwapchainPresentFenceInfoEXT> implements NativeResource {

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

    protected VkSwapchainPresentFenceInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSwapchainPresentFenceInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkSwapchainPresentFenceInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkSwapchainPresentFenceInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSwapchainPresentFenceInfoEXT(ByteBuffer container) {
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
    public VkSwapchainPresentFenceInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTSwapchainMaintenance1#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT} value to the {@code sType} field. */
    public VkSwapchainPresentFenceInfoEXT sType$Default() { return sType(EXTSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSwapchainPresentFenceInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code swapchainCount} field. */
    public VkSwapchainPresentFenceInfoEXT swapchainCount(@NativeType("uint32_t") int value) { nswapchainCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pFences} field. */
    public VkSwapchainPresentFenceInfoEXT pFences(@Nullable @NativeType("VkFence const *") LongBuffer value) { npFences(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSwapchainPresentFenceInfoEXT set(
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
    public VkSwapchainPresentFenceInfoEXT set(VkSwapchainPresentFenceInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSwapchainPresentFenceInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSwapchainPresentFenceInfoEXT malloc() {
        return new VkSwapchainPresentFenceInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainPresentFenceInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSwapchainPresentFenceInfoEXT calloc() {
        return new VkSwapchainPresentFenceInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainPresentFenceInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkSwapchainPresentFenceInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainPresentFenceInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSwapchainPresentFenceInfoEXT} instance for the specified memory address. */
    public static VkSwapchainPresentFenceInfoEXT create(long address) {
        return new VkSwapchainPresentFenceInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSwapchainPresentFenceInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkSwapchainPresentFenceInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkSwapchainPresentFenceInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentFenceInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentFenceInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentFenceInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentFenceInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentFenceInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSwapchainPresentFenceInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentFenceInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSwapchainPresentFenceInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSwapchainPresentFenceInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainPresentFenceInfoEXT malloc(MemoryStack stack) {
        return new VkSwapchainPresentFenceInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSwapchainPresentFenceInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainPresentFenceInfoEXT calloc(MemoryStack stack) {
        return new VkSwapchainPresentFenceInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSwapchainPresentFenceInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentFenceInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentFenceInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentFenceInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSwapchainPresentFenceInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSwapchainPresentFenceInfoEXT.PNEXT); }
    /** Unsafe version of {@link #swapchainCount}. */
    public static int nswapchainCount(long struct) { return memGetInt(struct + VkSwapchainPresentFenceInfoEXT.SWAPCHAINCOUNT); }
    /** Unsafe version of {@link #pFences() pFences}. */
    public static @Nullable LongBuffer npFences(long struct) { return memLongBufferSafe(memGetAddress(struct + VkSwapchainPresentFenceInfoEXT.PFENCES), nswapchainCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSwapchainPresentFenceInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSwapchainPresentFenceInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code swapchainCount} field of the specified {@code struct}. */
    public static void nswapchainCount(long struct, int value) { memPutInt(struct + VkSwapchainPresentFenceInfoEXT.SWAPCHAINCOUNT, value); }
    /** Unsafe version of {@link #pFences(LongBuffer) pFences}. */
    public static void npFences(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkSwapchainPresentFenceInfoEXT.PFENCES, memAddressSafe(value)); if (value != null) { nswapchainCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkSwapchainPresentFenceInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkSwapchainPresentFenceInfoEXT, Buffer> implements NativeResource {

        private static final VkSwapchainPresentFenceInfoEXT ELEMENT_FACTORY = VkSwapchainPresentFenceInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkSwapchainPresentFenceInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSwapchainPresentFenceInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSwapchainPresentFenceInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSwapchainPresentFenceInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSwapchainPresentFenceInfoEXT.npNext(address()); }
        /** @return the value of the {@code swapchainCount} field. */
        @NativeType("uint32_t")
        public int swapchainCount() { return VkSwapchainPresentFenceInfoEXT.nswapchainCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pFences} field. */
        @NativeType("VkFence const *")
        public @Nullable LongBuffer pFences() { return VkSwapchainPresentFenceInfoEXT.npFences(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSwapchainPresentFenceInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSwapchainPresentFenceInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTSwapchainMaintenance1#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT} value to the {@code sType} field. */
        public VkSwapchainPresentFenceInfoEXT.Buffer sType$Default() { return sType(EXTSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSwapchainPresentFenceInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkSwapchainPresentFenceInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code swapchainCount} field. */
        public VkSwapchainPresentFenceInfoEXT.Buffer swapchainCount(@NativeType("uint32_t") int value) { VkSwapchainPresentFenceInfoEXT.nswapchainCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pFences} field. */
        public VkSwapchainPresentFenceInfoEXT.Buffer pFences(@Nullable @NativeType("VkFence const *") LongBuffer value) { VkSwapchainPresentFenceInfoEXT.npFences(address(), value); return this; }

    }

}