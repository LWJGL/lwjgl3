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
 * struct VkPresentIdKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t swapchainCount;
 *     uint64_t const * pPresentIds;
 * }}</pre>
 */
public class VkPresentIdKHR extends Struct<VkPresentIdKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SWAPCHAINCOUNT,
        PPRESENTIDS;

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
        PPRESENTIDS = layout.offsetof(3);
    }

    protected VkPresentIdKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPresentIdKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPresentIdKHR(address, container);
    }

    /**
     * Creates a {@code VkPresentIdKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPresentIdKHR(ByteBuffer container) {
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
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pPresentIds} field. */
    @NativeType("uint64_t const *")
    public @Nullable LongBuffer pPresentIds() { return npPresentIds(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPresentIdKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPresentId#VK_STRUCTURE_TYPE_PRESENT_ID_KHR STRUCTURE_TYPE_PRESENT_ID_KHR} value to the {@code sType} field. */
    public VkPresentIdKHR sType$Default() { return sType(KHRPresentId.VK_STRUCTURE_TYPE_PRESENT_ID_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPresentIdKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code swapchainCount} field. */
    public VkPresentIdKHR swapchainCount(@NativeType("uint32_t") int value) { nswapchainCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pPresentIds} field. */
    public VkPresentIdKHR pPresentIds(@Nullable @NativeType("uint64_t const *") LongBuffer value) { npPresentIds(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPresentIdKHR set(
        int sType,
        long pNext,
        int swapchainCount,
        @Nullable LongBuffer pPresentIds
    ) {
        sType(sType);
        pNext(pNext);
        swapchainCount(swapchainCount);
        pPresentIds(pPresentIds);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPresentIdKHR set(VkPresentIdKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPresentIdKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPresentIdKHR malloc() {
        return new VkPresentIdKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPresentIdKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPresentIdKHR calloc() {
        return new VkPresentIdKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPresentIdKHR} instance allocated with {@link BufferUtils}. */
    public static VkPresentIdKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPresentIdKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPresentIdKHR} instance for the specified memory address. */
    public static VkPresentIdKHR create(long address) {
        return new VkPresentIdKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPresentIdKHR createSafe(long address) {
        return address == NULL ? null : new VkPresentIdKHR(address, null);
    }

    /**
     * Returns a new {@link VkPresentIdKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentIdKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPresentIdKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentIdKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentIdKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentIdKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPresentIdKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPresentIdKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPresentIdKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPresentIdKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentIdKHR malloc(MemoryStack stack) {
        return new VkPresentIdKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPresentIdKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentIdKHR calloc(MemoryStack stack) {
        return new VkPresentIdKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPresentIdKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentIdKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentIdKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentIdKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPresentIdKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPresentIdKHR.PNEXT); }
    /** Unsafe version of {@link #swapchainCount}. */
    public static int nswapchainCount(long struct) { return memGetInt(struct + VkPresentIdKHR.SWAPCHAINCOUNT); }
    /** Unsafe version of {@link #pPresentIds() pPresentIds}. */
    public static @Nullable LongBuffer npPresentIds(long struct) { return memLongBufferSafe(memGetAddress(struct + VkPresentIdKHR.PPRESENTIDS), nswapchainCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPresentIdKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPresentIdKHR.PNEXT, value); }
    /** Sets the specified value to the {@code swapchainCount} field of the specified {@code struct}. */
    public static void nswapchainCount(long struct, int value) { memPutInt(struct + VkPresentIdKHR.SWAPCHAINCOUNT, value); }
    /** Unsafe version of {@link #pPresentIds(LongBuffer) pPresentIds}. */
    public static void npPresentIds(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkPresentIdKHR.PPRESENTIDS, memAddressSafe(value)); if (value != null) { nswapchainCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkPresentIdKHR} structs. */
    public static class Buffer extends StructBuffer<VkPresentIdKHR, Buffer> implements NativeResource {

        private static final VkPresentIdKHR ELEMENT_FACTORY = VkPresentIdKHR.create(-1L);

        /**
         * Creates a new {@code VkPresentIdKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPresentIdKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPresentIdKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPresentIdKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPresentIdKHR.npNext(address()); }
        /** @return the value of the {@code swapchainCount} field. */
        @NativeType("uint32_t")
        public int swapchainCount() { return VkPresentIdKHR.nswapchainCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pPresentIds} field. */
        @NativeType("uint64_t const *")
        public @Nullable LongBuffer pPresentIds() { return VkPresentIdKHR.npPresentIds(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPresentIdKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPresentIdKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPresentId#VK_STRUCTURE_TYPE_PRESENT_ID_KHR STRUCTURE_TYPE_PRESENT_ID_KHR} value to the {@code sType} field. */
        public VkPresentIdKHR.Buffer sType$Default() { return sType(KHRPresentId.VK_STRUCTURE_TYPE_PRESENT_ID_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPresentIdKHR.Buffer pNext(@NativeType("void const *") long value) { VkPresentIdKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code swapchainCount} field. */
        public VkPresentIdKHR.Buffer swapchainCount(@NativeType("uint32_t") int value) { VkPresentIdKHR.nswapchainCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pPresentIds} field. */
        public VkPresentIdKHR.Buffer pPresentIds(@Nullable @NativeType("uint64_t const *") LongBuffer value) { VkPresentIdKHR.npPresentIds(address(), value); return this; }

    }

}