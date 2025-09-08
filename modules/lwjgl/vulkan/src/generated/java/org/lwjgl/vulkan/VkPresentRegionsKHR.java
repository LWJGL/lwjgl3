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
 * struct VkPresentRegionsKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t swapchainCount;
 *     {@link VkPresentRegionKHR VkPresentRegionKHR} const * pRegions;
 * }</code></pre>
 */
public class VkPresentRegionsKHR extends Struct<VkPresentRegionsKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SWAPCHAINCOUNT,
        PREGIONS;

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
        PREGIONS = layout.offsetof(3);
    }

    protected VkPresentRegionsKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPresentRegionsKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPresentRegionsKHR(address, container);
    }

    /**
     * Creates a {@code VkPresentRegionsKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPresentRegionsKHR(ByteBuffer container) {
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
    /** @return a {@link VkPresentRegionKHR.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
    @NativeType("VkPresentRegionKHR const *")
    public VkPresentRegionKHR.@Nullable Buffer pRegions() { return npRegions(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPresentRegionsKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRIncrementalPresent#VK_STRUCTURE_TYPE_PRESENT_REGIONS_KHR STRUCTURE_TYPE_PRESENT_REGIONS_KHR} value to the {@code sType} field. */
    public VkPresentRegionsKHR sType$Default() { return sType(KHRIncrementalPresent.VK_STRUCTURE_TYPE_PRESENT_REGIONS_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPresentRegionsKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code swapchainCount} field. */
    public VkPresentRegionsKHR swapchainCount(@NativeType("uint32_t") int value) { nswapchainCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkPresentRegionKHR.Buffer} to the {@code pRegions} field. */
    public VkPresentRegionsKHR pRegions(@NativeType("VkPresentRegionKHR const *") VkPresentRegionKHR.@Nullable Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPresentRegionsKHR set(
        int sType,
        long pNext,
        int swapchainCount,
        VkPresentRegionKHR.@Nullable Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        swapchainCount(swapchainCount);
        pRegions(pRegions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPresentRegionsKHR set(VkPresentRegionsKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPresentRegionsKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPresentRegionsKHR malloc() {
        return new VkPresentRegionsKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPresentRegionsKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPresentRegionsKHR calloc() {
        return new VkPresentRegionsKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPresentRegionsKHR} instance allocated with {@link BufferUtils}. */
    public static VkPresentRegionsKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPresentRegionsKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPresentRegionsKHR} instance for the specified memory address. */
    public static VkPresentRegionsKHR create(long address) {
        return new VkPresentRegionsKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPresentRegionsKHR createSafe(long address) {
        return address == NULL ? null : new VkPresentRegionsKHR(address, null);
    }

    /**
     * Returns a new {@link VkPresentRegionsKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentRegionsKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPresentRegionsKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentRegionsKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentRegionsKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentRegionsKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPresentRegionsKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPresentRegionsKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPresentRegionsKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPresentRegionsKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPresentRegionsKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPresentRegionsKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPresentRegionsKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPresentRegionsKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPresentRegionsKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPresentRegionsKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPresentRegionsKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPresentRegionsKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentRegionsKHR malloc(MemoryStack stack) {
        return new VkPresentRegionsKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPresentRegionsKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentRegionsKHR calloc(MemoryStack stack) {
        return new VkPresentRegionsKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPresentRegionsKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentRegionsKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentRegionsKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentRegionsKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPresentRegionsKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPresentRegionsKHR.PNEXT); }
    /** Unsafe version of {@link #swapchainCount}. */
    public static int nswapchainCount(long struct) { return memGetInt(struct + VkPresentRegionsKHR.SWAPCHAINCOUNT); }
    /** Unsafe version of {@link #pRegions}. */
    public static VkPresentRegionKHR.@Nullable Buffer npRegions(long struct) { return VkPresentRegionKHR.createSafe(memGetAddress(struct + VkPresentRegionsKHR.PREGIONS), nswapchainCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPresentRegionsKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPresentRegionsKHR.PNEXT, value); }
    /** Sets the specified value to the {@code swapchainCount} field of the specified {@code struct}. */
    public static void nswapchainCount(long struct, int value) { memPutInt(struct + VkPresentRegionsKHR.SWAPCHAINCOUNT, value); }
    /** Unsafe version of {@link #pRegions(VkPresentRegionKHR.Buffer) pRegions}. */
    public static void npRegions(long struct, VkPresentRegionKHR.@Nullable Buffer value) { memPutAddress(struct + VkPresentRegionsKHR.PREGIONS, memAddressSafe(value)); if (value != null) { nswapchainCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkPresentRegionsKHR} structs. */
    public static class Buffer extends StructBuffer<VkPresentRegionsKHR, Buffer> implements NativeResource {

        private static final VkPresentRegionsKHR ELEMENT_FACTORY = VkPresentRegionsKHR.create(-1L);

        /**
         * Creates a new {@code VkPresentRegionsKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPresentRegionsKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPresentRegionsKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPresentRegionsKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPresentRegionsKHR.npNext(address()); }
        /** @return the value of the {@code swapchainCount} field. */
        @NativeType("uint32_t")
        public int swapchainCount() { return VkPresentRegionsKHR.nswapchainCount(address()); }
        /** @return a {@link VkPresentRegionKHR.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
        @NativeType("VkPresentRegionKHR const *")
        public VkPresentRegionKHR.@Nullable Buffer pRegions() { return VkPresentRegionsKHR.npRegions(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPresentRegionsKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPresentRegionsKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRIncrementalPresent#VK_STRUCTURE_TYPE_PRESENT_REGIONS_KHR STRUCTURE_TYPE_PRESENT_REGIONS_KHR} value to the {@code sType} field. */
        public VkPresentRegionsKHR.Buffer sType$Default() { return sType(KHRIncrementalPresent.VK_STRUCTURE_TYPE_PRESENT_REGIONS_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPresentRegionsKHR.Buffer pNext(@NativeType("void const *") long value) { VkPresentRegionsKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code swapchainCount} field. */
        public VkPresentRegionsKHR.Buffer swapchainCount(@NativeType("uint32_t") int value) { VkPresentRegionsKHR.nswapchainCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkPresentRegionKHR.Buffer} to the {@code pRegions} field. */
        public VkPresentRegionsKHR.Buffer pRegions(@NativeType("VkPresentRegionKHR const *") VkPresentRegionKHR.@Nullable Buffer value) { VkPresentRegionsKHR.npRegions(address(), value); return this; }

    }

}