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
 * struct VkPresentTimesInfoGOOGLE {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t swapchainCount;
 *     {@link VkPresentTimeGOOGLE VkPresentTimeGOOGLE} const * pTimes;
 * }</code></pre>
 */
public class VkPresentTimesInfoGOOGLE extends Struct<VkPresentTimesInfoGOOGLE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SWAPCHAINCOUNT,
        PTIMES;

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
        PTIMES = layout.offsetof(3);
    }

    protected VkPresentTimesInfoGOOGLE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPresentTimesInfoGOOGLE create(long address, @Nullable ByteBuffer container) {
        return new VkPresentTimesInfoGOOGLE(address, container);
    }

    /**
     * Creates a {@code VkPresentTimesInfoGOOGLE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPresentTimesInfoGOOGLE(ByteBuffer container) {
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
    /** @return a {@link VkPresentTimeGOOGLE.Buffer} view of the struct array pointed to by the {@code pTimes} field. */
    @NativeType("VkPresentTimeGOOGLE const *")
    public VkPresentTimeGOOGLE.@Nullable Buffer pTimes() { return npTimes(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPresentTimesInfoGOOGLE sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link GOOGLEDisplayTiming#VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE} value to the {@code sType} field. */
    public VkPresentTimesInfoGOOGLE sType$Default() { return sType(GOOGLEDisplayTiming.VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPresentTimesInfoGOOGLE pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code swapchainCount} field. */
    public VkPresentTimesInfoGOOGLE swapchainCount(@NativeType("uint32_t") int value) { nswapchainCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkPresentTimeGOOGLE.Buffer} to the {@code pTimes} field. */
    public VkPresentTimesInfoGOOGLE pTimes(@NativeType("VkPresentTimeGOOGLE const *") VkPresentTimeGOOGLE.@Nullable Buffer value) { npTimes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPresentTimesInfoGOOGLE set(
        int sType,
        long pNext,
        int swapchainCount,
        VkPresentTimeGOOGLE.@Nullable Buffer pTimes
    ) {
        sType(sType);
        pNext(pNext);
        swapchainCount(swapchainCount);
        pTimes(pTimes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPresentTimesInfoGOOGLE set(VkPresentTimesInfoGOOGLE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPresentTimesInfoGOOGLE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPresentTimesInfoGOOGLE malloc() {
        return new VkPresentTimesInfoGOOGLE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPresentTimesInfoGOOGLE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPresentTimesInfoGOOGLE calloc() {
        return new VkPresentTimesInfoGOOGLE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPresentTimesInfoGOOGLE} instance allocated with {@link BufferUtils}. */
    public static VkPresentTimesInfoGOOGLE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPresentTimesInfoGOOGLE(memAddress(container), container);
    }

    /** Returns a new {@code VkPresentTimesInfoGOOGLE} instance for the specified memory address. */
    public static VkPresentTimesInfoGOOGLE create(long address) {
        return new VkPresentTimesInfoGOOGLE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPresentTimesInfoGOOGLE createSafe(long address) {
        return address == NULL ? null : new VkPresentTimesInfoGOOGLE(address, null);
    }

    /**
     * Returns a new {@link VkPresentTimesInfoGOOGLE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentTimesInfoGOOGLE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPresentTimesInfoGOOGLE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentTimesInfoGOOGLE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentTimesInfoGOOGLE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentTimesInfoGOOGLE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPresentTimesInfoGOOGLE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPresentTimesInfoGOOGLE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPresentTimesInfoGOOGLE.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPresentTimesInfoGOOGLE mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPresentTimesInfoGOOGLE callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPresentTimesInfoGOOGLE mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPresentTimesInfoGOOGLE callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPresentTimesInfoGOOGLE.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPresentTimesInfoGOOGLE.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPresentTimesInfoGOOGLE.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPresentTimesInfoGOOGLE.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPresentTimesInfoGOOGLE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentTimesInfoGOOGLE malloc(MemoryStack stack) {
        return new VkPresentTimesInfoGOOGLE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPresentTimesInfoGOOGLE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentTimesInfoGOOGLE calloc(MemoryStack stack) {
        return new VkPresentTimesInfoGOOGLE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPresentTimesInfoGOOGLE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentTimesInfoGOOGLE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentTimesInfoGOOGLE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentTimesInfoGOOGLE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPresentTimesInfoGOOGLE.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPresentTimesInfoGOOGLE.PNEXT); }
    /** Unsafe version of {@link #swapchainCount}. */
    public static int nswapchainCount(long struct) { return memGetInt(struct + VkPresentTimesInfoGOOGLE.SWAPCHAINCOUNT); }
    /** Unsafe version of {@link #pTimes}. */
    public static VkPresentTimeGOOGLE.@Nullable Buffer npTimes(long struct) { return VkPresentTimeGOOGLE.createSafe(memGetAddress(struct + VkPresentTimesInfoGOOGLE.PTIMES), nswapchainCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPresentTimesInfoGOOGLE.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPresentTimesInfoGOOGLE.PNEXT, value); }
    /** Sets the specified value to the {@code swapchainCount} field of the specified {@code struct}. */
    public static void nswapchainCount(long struct, int value) { memPutInt(struct + VkPresentTimesInfoGOOGLE.SWAPCHAINCOUNT, value); }
    /** Unsafe version of {@link #pTimes(VkPresentTimeGOOGLE.Buffer) pTimes}. */
    public static void npTimes(long struct, VkPresentTimeGOOGLE.@Nullable Buffer value) { memPutAddress(struct + VkPresentTimesInfoGOOGLE.PTIMES, memAddressSafe(value)); if (value != null) { nswapchainCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkPresentTimesInfoGOOGLE} structs. */
    public static class Buffer extends StructBuffer<VkPresentTimesInfoGOOGLE, Buffer> implements NativeResource {

        private static final VkPresentTimesInfoGOOGLE ELEMENT_FACTORY = VkPresentTimesInfoGOOGLE.create(-1L);

        /**
         * Creates a new {@code VkPresentTimesInfoGOOGLE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPresentTimesInfoGOOGLE#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPresentTimesInfoGOOGLE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPresentTimesInfoGOOGLE.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPresentTimesInfoGOOGLE.npNext(address()); }
        /** @return the value of the {@code swapchainCount} field. */
        @NativeType("uint32_t")
        public int swapchainCount() { return VkPresentTimesInfoGOOGLE.nswapchainCount(address()); }
        /** @return a {@link VkPresentTimeGOOGLE.Buffer} view of the struct array pointed to by the {@code pTimes} field. */
        @NativeType("VkPresentTimeGOOGLE const *")
        public VkPresentTimeGOOGLE.@Nullable Buffer pTimes() { return VkPresentTimesInfoGOOGLE.npTimes(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPresentTimesInfoGOOGLE.Buffer sType(@NativeType("VkStructureType") int value) { VkPresentTimesInfoGOOGLE.nsType(address(), value); return this; }
        /** Sets the {@link GOOGLEDisplayTiming#VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE} value to the {@code sType} field. */
        public VkPresentTimesInfoGOOGLE.Buffer sType$Default() { return sType(GOOGLEDisplayTiming.VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPresentTimesInfoGOOGLE.Buffer pNext(@NativeType("void const *") long value) { VkPresentTimesInfoGOOGLE.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code swapchainCount} field. */
        public VkPresentTimesInfoGOOGLE.Buffer swapchainCount(@NativeType("uint32_t") int value) { VkPresentTimesInfoGOOGLE.nswapchainCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkPresentTimeGOOGLE.Buffer} to the {@code pTimes} field. */
        public VkPresentTimesInfoGOOGLE.Buffer pTimes(@NativeType("VkPresentTimeGOOGLE const *") VkPresentTimeGOOGLE.@Nullable Buffer value) { VkPresentTimesInfoGOOGLE.npTimes(address(), value); return this; }

    }

}