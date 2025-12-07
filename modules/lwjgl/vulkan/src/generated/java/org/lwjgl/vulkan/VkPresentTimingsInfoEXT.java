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
 * <pre><code>
 * struct VkPresentTimingsInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t swapchainCount;
 *     {@link VkPresentTimingInfoEXT VkPresentTimingInfoEXT} const * pTimingInfos;
 * }</code></pre>
 */
public class VkPresentTimingsInfoEXT extends Struct<VkPresentTimingsInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SWAPCHAINCOUNT,
        PTIMINGINFOS;

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
        PTIMINGINFOS = layout.offsetof(3);
    }

    protected VkPresentTimingsInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPresentTimingsInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPresentTimingsInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkPresentTimingsInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPresentTimingsInfoEXT(ByteBuffer container) {
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
    /** @return a {@link VkPresentTimingInfoEXT.Buffer} view of the struct array pointed to by the {@code pTimingInfos} field. */
    @NativeType("VkPresentTimingInfoEXT const *")
    public VkPresentTimingInfoEXT.@Nullable Buffer pTimingInfos() { return npTimingInfos(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPresentTimingsInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTPresentTiming#VK_STRUCTURE_TYPE_PRESENT_TIMINGS_INFO_EXT STRUCTURE_TYPE_PRESENT_TIMINGS_INFO_EXT} value to the {@code sType} field. */
    public VkPresentTimingsInfoEXT sType$Default() { return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_PRESENT_TIMINGS_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPresentTimingsInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code swapchainCount} field. */
    public VkPresentTimingsInfoEXT swapchainCount(@NativeType("uint32_t") int value) { nswapchainCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkPresentTimingInfoEXT.Buffer} to the {@code pTimingInfos} field. */
    public VkPresentTimingsInfoEXT pTimingInfos(@NativeType("VkPresentTimingInfoEXT const *") VkPresentTimingInfoEXT.@Nullable Buffer value) { npTimingInfos(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPresentTimingsInfoEXT set(
        int sType,
        long pNext,
        int swapchainCount,
        VkPresentTimingInfoEXT.@Nullable Buffer pTimingInfos
    ) {
        sType(sType);
        pNext(pNext);
        swapchainCount(swapchainCount);
        pTimingInfos(pTimingInfos);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPresentTimingsInfoEXT set(VkPresentTimingsInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPresentTimingsInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPresentTimingsInfoEXT malloc() {
        return new VkPresentTimingsInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPresentTimingsInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPresentTimingsInfoEXT calloc() {
        return new VkPresentTimingsInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPresentTimingsInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPresentTimingsInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPresentTimingsInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPresentTimingsInfoEXT} instance for the specified memory address. */
    public static VkPresentTimingsInfoEXT create(long address) {
        return new VkPresentTimingsInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPresentTimingsInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkPresentTimingsInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkPresentTimingsInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentTimingsInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPresentTimingsInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentTimingsInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentTimingsInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentTimingsInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPresentTimingsInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPresentTimingsInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPresentTimingsInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPresentTimingsInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentTimingsInfoEXT malloc(MemoryStack stack) {
        return new VkPresentTimingsInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPresentTimingsInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentTimingsInfoEXT calloc(MemoryStack stack) {
        return new VkPresentTimingsInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPresentTimingsInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentTimingsInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentTimingsInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentTimingsInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPresentTimingsInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPresentTimingsInfoEXT.PNEXT); }
    /** Unsafe version of {@link #swapchainCount}. */
    public static int nswapchainCount(long struct) { return memGetInt(struct + VkPresentTimingsInfoEXT.SWAPCHAINCOUNT); }
    /** Unsafe version of {@link #pTimingInfos}. */
    public static VkPresentTimingInfoEXT.@Nullable Buffer npTimingInfos(long struct) { return VkPresentTimingInfoEXT.createSafe(memGetAddress(struct + VkPresentTimingsInfoEXT.PTIMINGINFOS), nswapchainCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPresentTimingsInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPresentTimingsInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code swapchainCount} field of the specified {@code struct}. */
    public static void nswapchainCount(long struct, int value) { memPutInt(struct + VkPresentTimingsInfoEXT.SWAPCHAINCOUNT, value); }
    /** Unsafe version of {@link #pTimingInfos(VkPresentTimingInfoEXT.Buffer) pTimingInfos}. */
    public static void npTimingInfos(long struct, VkPresentTimingInfoEXT.@Nullable Buffer value) { memPutAddress(struct + VkPresentTimingsInfoEXT.PTIMINGINFOS, memAddressSafe(value)); if (value != null) { nswapchainCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkPresentTimingsInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPresentTimingsInfoEXT, Buffer> implements NativeResource {

        private static final VkPresentTimingsInfoEXT ELEMENT_FACTORY = VkPresentTimingsInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPresentTimingsInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPresentTimingsInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPresentTimingsInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPresentTimingsInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPresentTimingsInfoEXT.npNext(address()); }
        /** @return the value of the {@code swapchainCount} field. */
        @NativeType("uint32_t")
        public int swapchainCount() { return VkPresentTimingsInfoEXT.nswapchainCount(address()); }
        /** @return a {@link VkPresentTimingInfoEXT.Buffer} view of the struct array pointed to by the {@code pTimingInfos} field. */
        @NativeType("VkPresentTimingInfoEXT const *")
        public VkPresentTimingInfoEXT.@Nullable Buffer pTimingInfos() { return VkPresentTimingsInfoEXT.npTimingInfos(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPresentTimingsInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPresentTimingsInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTPresentTiming#VK_STRUCTURE_TYPE_PRESENT_TIMINGS_INFO_EXT STRUCTURE_TYPE_PRESENT_TIMINGS_INFO_EXT} value to the {@code sType} field. */
        public VkPresentTimingsInfoEXT.Buffer sType$Default() { return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_PRESENT_TIMINGS_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPresentTimingsInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPresentTimingsInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code swapchainCount} field. */
        public VkPresentTimingsInfoEXT.Buffer swapchainCount(@NativeType("uint32_t") int value) { VkPresentTimingsInfoEXT.nswapchainCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkPresentTimingInfoEXT.Buffer} to the {@code pTimingInfos} field. */
        public VkPresentTimingsInfoEXT.Buffer pTimingInfos(@NativeType("VkPresentTimingInfoEXT const *") VkPresentTimingInfoEXT.@Nullable Buffer value) { VkPresentTimingsInfoEXT.npTimingInfos(address(), value); return this; }

    }

}