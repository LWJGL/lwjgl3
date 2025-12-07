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
 * struct VkPastPresentationTimingInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPastPresentationTimingFlagsEXT flags;
 *     VkSwapchainKHR swapchain;
 * }}</pre>
 */
public class VkPastPresentationTimingInfoEXT extends Struct<VkPastPresentationTimingInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        SWAPCHAIN;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SWAPCHAIN = layout.offsetof(3);
    }

    protected VkPastPresentationTimingInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPastPresentationTimingInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPastPresentationTimingInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkPastPresentationTimingInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPastPresentationTimingInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkPastPresentationTimingFlagsEXT")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code swapchain} field. */
    @NativeType("VkSwapchainKHR")
    public long swapchain() { return nswapchain(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPastPresentationTimingInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTPresentTiming#VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_INFO_EXT STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_INFO_EXT} value to the {@code sType} field. */
    public VkPastPresentationTimingInfoEXT sType$Default() { return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPastPresentationTimingInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkPastPresentationTimingInfoEXT flags(@NativeType("VkPastPresentationTimingFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code swapchain} field. */
    public VkPastPresentationTimingInfoEXT swapchain(@NativeType("VkSwapchainKHR") long value) { nswapchain(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPastPresentationTimingInfoEXT set(
        int sType,
        long pNext,
        int flags,
        long swapchain
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        swapchain(swapchain);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPastPresentationTimingInfoEXT set(VkPastPresentationTimingInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPastPresentationTimingInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPastPresentationTimingInfoEXT malloc() {
        return new VkPastPresentationTimingInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPastPresentationTimingInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPastPresentationTimingInfoEXT calloc() {
        return new VkPastPresentationTimingInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPastPresentationTimingInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPastPresentationTimingInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPastPresentationTimingInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPastPresentationTimingInfoEXT} instance for the specified memory address. */
    public static VkPastPresentationTimingInfoEXT create(long address) {
        return new VkPastPresentationTimingInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPastPresentationTimingInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkPastPresentationTimingInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPastPresentationTimingInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPastPresentationTimingInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPastPresentationTimingInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPastPresentationTimingInfoEXT malloc(MemoryStack stack) {
        return new VkPastPresentationTimingInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPastPresentationTimingInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPastPresentationTimingInfoEXT calloc(MemoryStack stack) {
        return new VkPastPresentationTimingInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPastPresentationTimingInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPastPresentationTimingInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPastPresentationTimingInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkPastPresentationTimingInfoEXT.FLAGS); }
    /** Unsafe version of {@link #swapchain}. */
    public static long nswapchain(long struct) { return memGetLong(struct + VkPastPresentationTimingInfoEXT.SWAPCHAIN); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPastPresentationTimingInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPastPresentationTimingInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkPastPresentationTimingInfoEXT.FLAGS, value); }
    /** Unsafe version of {@link #swapchain(long) swapchain}. */
    public static void nswapchain(long struct, long value) { memPutLong(struct + VkPastPresentationTimingInfoEXT.SWAPCHAIN, value); }

    // -----------------------------------

    /** An array of {@link VkPastPresentationTimingInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPastPresentationTimingInfoEXT, Buffer> implements NativeResource {

        private static final VkPastPresentationTimingInfoEXT ELEMENT_FACTORY = VkPastPresentationTimingInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPastPresentationTimingInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPastPresentationTimingInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPastPresentationTimingInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPastPresentationTimingInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPastPresentationTimingInfoEXT.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkPastPresentationTimingFlagsEXT")
        public int flags() { return VkPastPresentationTimingInfoEXT.nflags(address()); }
        /** @return the value of the {@code swapchain} field. */
        @NativeType("VkSwapchainKHR")
        public long swapchain() { return VkPastPresentationTimingInfoEXT.nswapchain(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPastPresentationTimingInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPastPresentationTimingInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTPresentTiming#VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_INFO_EXT STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_INFO_EXT} value to the {@code sType} field. */
        public VkPastPresentationTimingInfoEXT.Buffer sType$Default() { return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPastPresentationTimingInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPastPresentationTimingInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkPastPresentationTimingInfoEXT.Buffer flags(@NativeType("VkPastPresentationTimingFlagsEXT") int value) { VkPastPresentationTimingInfoEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code swapchain} field. */
        public VkPastPresentationTimingInfoEXT.Buffer swapchain(@NativeType("VkSwapchainKHR") long value) { VkPastPresentationTimingInfoEXT.nswapchain(address(), value); return this; }

    }

}