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
 * struct VkPresentId2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t swapchainCount;
 *     uint64_t const * pPresentIds;
 * }}</pre>
 */
public class VkPresentId2KHR extends Struct<VkPresentId2KHR> implements NativeResource {

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

    protected VkPresentId2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPresentId2KHR create(long address, @Nullable ByteBuffer container) {
        return new VkPresentId2KHR(address, container);
    }

    /**
     * Creates a {@code VkPresentId2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPresentId2KHR(ByteBuffer container) {
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
    public VkPresentId2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPresentId2#VK_STRUCTURE_TYPE_PRESENT_ID_2_KHR STRUCTURE_TYPE_PRESENT_ID_2_KHR} value to the {@code sType} field. */
    public VkPresentId2KHR sType$Default() { return sType(KHRPresentId2.VK_STRUCTURE_TYPE_PRESENT_ID_2_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPresentId2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code swapchainCount} field. */
    public VkPresentId2KHR swapchainCount(@NativeType("uint32_t") int value) { nswapchainCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pPresentIds} field. */
    public VkPresentId2KHR pPresentIds(@Nullable @NativeType("uint64_t const *") LongBuffer value) { npPresentIds(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPresentId2KHR set(
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
    public VkPresentId2KHR set(VkPresentId2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPresentId2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPresentId2KHR malloc() {
        return new VkPresentId2KHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPresentId2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPresentId2KHR calloc() {
        return new VkPresentId2KHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPresentId2KHR} instance allocated with {@link BufferUtils}. */
    public static VkPresentId2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPresentId2KHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPresentId2KHR} instance for the specified memory address. */
    public static VkPresentId2KHR create(long address) {
        return new VkPresentId2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPresentId2KHR createSafe(long address) {
        return address == NULL ? null : new VkPresentId2KHR(address, null);
    }

    /**
     * Returns a new {@link VkPresentId2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentId2KHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPresentId2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentId2KHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentId2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentId2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPresentId2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPresentId2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPresentId2KHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPresentId2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentId2KHR malloc(MemoryStack stack) {
        return new VkPresentId2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPresentId2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentId2KHR calloc(MemoryStack stack) {
        return new VkPresentId2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPresentId2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentId2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentId2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentId2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPresentId2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPresentId2KHR.PNEXT); }
    /** Unsafe version of {@link #swapchainCount}. */
    public static int nswapchainCount(long struct) { return memGetInt(struct + VkPresentId2KHR.SWAPCHAINCOUNT); }
    /** Unsafe version of {@link #pPresentIds() pPresentIds}. */
    public static @Nullable LongBuffer npPresentIds(long struct) { return memLongBufferSafe(memGetAddress(struct + VkPresentId2KHR.PPRESENTIDS), nswapchainCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPresentId2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPresentId2KHR.PNEXT, value); }
    /** Sets the specified value to the {@code swapchainCount} field of the specified {@code struct}. */
    public static void nswapchainCount(long struct, int value) { memPutInt(struct + VkPresentId2KHR.SWAPCHAINCOUNT, value); }
    /** Unsafe version of {@link #pPresentIds(LongBuffer) pPresentIds}. */
    public static void npPresentIds(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkPresentId2KHR.PPRESENTIDS, memAddressSafe(value)); if (value != null) { nswapchainCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkPresentId2KHR} structs. */
    public static class Buffer extends StructBuffer<VkPresentId2KHR, Buffer> implements NativeResource {

        private static final VkPresentId2KHR ELEMENT_FACTORY = VkPresentId2KHR.create(-1L);

        /**
         * Creates a new {@code VkPresentId2KHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPresentId2KHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPresentId2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPresentId2KHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPresentId2KHR.npNext(address()); }
        /** @return the value of the {@code swapchainCount} field. */
        @NativeType("uint32_t")
        public int swapchainCount() { return VkPresentId2KHR.nswapchainCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pPresentIds} field. */
        @NativeType("uint64_t const *")
        public @Nullable LongBuffer pPresentIds() { return VkPresentId2KHR.npPresentIds(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPresentId2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPresentId2KHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPresentId2#VK_STRUCTURE_TYPE_PRESENT_ID_2_KHR STRUCTURE_TYPE_PRESENT_ID_2_KHR} value to the {@code sType} field. */
        public VkPresentId2KHR.Buffer sType$Default() { return sType(KHRPresentId2.VK_STRUCTURE_TYPE_PRESENT_ID_2_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPresentId2KHR.Buffer pNext(@NativeType("void const *") long value) { VkPresentId2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code swapchainCount} field. */
        public VkPresentId2KHR.Buffer swapchainCount(@NativeType("uint32_t") int value) { VkPresentId2KHR.nswapchainCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pPresentIds} field. */
        public VkPresentId2KHR.Buffer pPresentIds(@Nullable @NativeType("uint64_t const *") LongBuffer value) { VkPresentId2KHR.npPresentIds(address(), value); return this; }

    }

}