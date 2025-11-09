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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkRenderPassPerformanceCountersByRegionBeginInfoARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t counterAddressCount;
 *     VkDeviceAddress const * pCounterAddresses;
 *     VkBool32 serializeRegions;
 *     uint32_t counterIndexCount;
 *     uint32_t * pCounterIndices;
 * }}</pre>
 */
public class VkRenderPassPerformanceCountersByRegionBeginInfoARM extends Struct<VkRenderPassPerformanceCountersByRegionBeginInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COUNTERADDRESSCOUNT,
        PCOUNTERADDRESSES,
        SERIALIZEREGIONS,
        COUNTERINDEXCOUNT,
        PCOUNTERINDICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
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
        COUNTERADDRESSCOUNT = layout.offsetof(2);
        PCOUNTERADDRESSES = layout.offsetof(3);
        SERIALIZEREGIONS = layout.offsetof(4);
        COUNTERINDEXCOUNT = layout.offsetof(5);
        PCOUNTERINDICES = layout.offsetof(6);
    }

    protected VkRenderPassPerformanceCountersByRegionBeginInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderPassPerformanceCountersByRegionBeginInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkRenderPassPerformanceCountersByRegionBeginInfoARM(address, container);
    }

    /**
     * Creates a {@code VkRenderPassPerformanceCountersByRegionBeginInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code counterAddressCount} field. */
    @NativeType("uint32_t")
    public int counterAddressCount() { return ncounterAddressCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pCounterAddresses} field. */
    @NativeType("VkDeviceAddress const *")
    public LongBuffer pCounterAddresses(int capacity) { return npCounterAddresses(address(), capacity); }
    /** @return the value of the {@code serializeRegions} field. */
    @NativeType("VkBool32")
    public boolean serializeRegions() { return nserializeRegions(address()) != 0; }
    /** @return the value of the {@code counterIndexCount} field. */
    @NativeType("uint32_t")
    public int counterIndexCount() { return ncounterIndexCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pCounterIndices} field. */
    @NativeType("uint32_t *")
    public IntBuffer pCounterIndices(int capacity) { return npCounterIndices(address(), capacity); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMPerformanceCountersByRegion#VK_STRUCTURE_TYPE_RENDER_PASS_PERFORMANCE_COUNTERS_BY_REGION_BEGIN_INFO_ARM STRUCTURE_TYPE_RENDER_PASS_PERFORMANCE_COUNTERS_BY_REGION_BEGIN_INFO_ARM} value to the {@code sType} field. */
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM sType$Default() { return sType(ARMPerformanceCountersByRegion.VK_STRUCTURE_TYPE_RENDER_PASS_PERFORMANCE_COUNTERS_BY_REGION_BEGIN_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code counterAddressCount} field. */
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM counterAddressCount(@NativeType("uint32_t") int value) { ncounterAddressCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pCounterAddresses} field. */
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM pCounterAddresses(@NativeType("VkDeviceAddress const *") LongBuffer value) { npCounterAddresses(address(), value); return this; }
    /** Sets the specified value to the {@code serializeRegions} field. */
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM serializeRegions(@NativeType("VkBool32") boolean value) { nserializeRegions(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code counterIndexCount} field. */
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM counterIndexCount(@NativeType("uint32_t") int value) { ncounterIndexCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pCounterIndices} field. */
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM pCounterIndices(@NativeType("uint32_t *") IntBuffer value) { npCounterIndices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM set(
        int sType,
        long pNext,
        int counterAddressCount,
        LongBuffer pCounterAddresses,
        boolean serializeRegions,
        int counterIndexCount,
        IntBuffer pCounterIndices
    ) {
        sType(sType);
        pNext(pNext);
        counterAddressCount(counterAddressCount);
        pCounterAddresses(pCounterAddresses);
        serializeRegions(serializeRegions);
        counterIndexCount(counterIndexCount);
        pCounterIndices(pCounterIndices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM set(VkRenderPassPerformanceCountersByRegionBeginInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassPerformanceCountersByRegionBeginInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM malloc() {
        return new VkRenderPassPerformanceCountersByRegionBeginInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassPerformanceCountersByRegionBeginInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM calloc() {
        return new VkRenderPassPerformanceCountersByRegionBeginInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassPerformanceCountersByRegionBeginInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassPerformanceCountersByRegionBeginInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassPerformanceCountersByRegionBeginInfoARM} instance for the specified memory address. */
    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM create(long address) {
        return new VkRenderPassPerformanceCountersByRegionBeginInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRenderPassPerformanceCountersByRegionBeginInfoARM createSafe(long address) {
        return address == NULL ? null : new VkRenderPassPerformanceCountersByRegionBeginInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkRenderPassPerformanceCountersByRegionBeginInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassPerformanceCountersByRegionBeginInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassPerformanceCountersByRegionBeginInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderPassPerformanceCountersByRegionBeginInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRenderPassPerformanceCountersByRegionBeginInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM malloc(MemoryStack stack) {
        return new VkRenderPassPerformanceCountersByRegionBeginInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderPassPerformanceCountersByRegionBeginInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM calloc(MemoryStack stack) {
        return new VkRenderPassPerformanceCountersByRegionBeginInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderPassPerformanceCountersByRegionBeginInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassPerformanceCountersByRegionBeginInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRenderPassPerformanceCountersByRegionBeginInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassPerformanceCountersByRegionBeginInfoARM.PNEXT); }
    /** Unsafe version of {@link #counterAddressCount}. */
    public static int ncounterAddressCount(long struct) { return memGetInt(struct + VkRenderPassPerformanceCountersByRegionBeginInfoARM.COUNTERADDRESSCOUNT); }
    /** Unsafe version of {@link #pCounterAddresses(int) pCounterAddresses}. */
    public static LongBuffer npCounterAddresses(long struct, int capacity) { return memLongBuffer(memGetAddress(struct + VkRenderPassPerformanceCountersByRegionBeginInfoARM.PCOUNTERADDRESSES), capacity); }
    /** Unsafe version of {@link #serializeRegions}. */
    public static int nserializeRegions(long struct) { return memGetInt(struct + VkRenderPassPerformanceCountersByRegionBeginInfoARM.SERIALIZEREGIONS); }
    /** Unsafe version of {@link #counterIndexCount}. */
    public static int ncounterIndexCount(long struct) { return memGetInt(struct + VkRenderPassPerformanceCountersByRegionBeginInfoARM.COUNTERINDEXCOUNT); }
    /** Unsafe version of {@link #pCounterIndices(int) pCounterIndices}. */
    public static IntBuffer npCounterIndices(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + VkRenderPassPerformanceCountersByRegionBeginInfoARM.PCOUNTERINDICES), capacity); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderPassPerformanceCountersByRegionBeginInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassPerformanceCountersByRegionBeginInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #counterAddressCount(int) counterAddressCount}. */
    public static void ncounterAddressCount(long struct, int value) { memPutInt(struct + VkRenderPassPerformanceCountersByRegionBeginInfoARM.COUNTERADDRESSCOUNT, value); }
    /** Unsafe version of {@link #pCounterAddresses(LongBuffer) pCounterAddresses}. */
    public static void npCounterAddresses(long struct, LongBuffer value) { memPutAddress(struct + VkRenderPassPerformanceCountersByRegionBeginInfoARM.PCOUNTERADDRESSES, memAddress(value)); }
    /** Unsafe version of {@link #serializeRegions(boolean) serializeRegions}. */
    public static void nserializeRegions(long struct, int value) { memPutInt(struct + VkRenderPassPerformanceCountersByRegionBeginInfoARM.SERIALIZEREGIONS, value); }
    /** Unsafe version of {@link #counterIndexCount(int) counterIndexCount}. */
    public static void ncounterIndexCount(long struct, int value) { memPutInt(struct + VkRenderPassPerformanceCountersByRegionBeginInfoARM.COUNTERINDEXCOUNT, value); }
    /** Unsafe version of {@link #pCounterIndices(IntBuffer) pCounterIndices}. */
    public static void npCounterIndices(long struct, IntBuffer value) { memPutAddress(struct + VkRenderPassPerformanceCountersByRegionBeginInfoARM.PCOUNTERINDICES, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkRenderPassPerformanceCountersByRegionBeginInfoARM.PCOUNTERADDRESSES));
        check(memGetAddress(struct + VkRenderPassPerformanceCountersByRegionBeginInfoARM.PCOUNTERINDICES));
    }

    // -----------------------------------

    /** An array of {@link VkRenderPassPerformanceCountersByRegionBeginInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassPerformanceCountersByRegionBeginInfoARM, Buffer> implements NativeResource {

        private static final VkRenderPassPerformanceCountersByRegionBeginInfoARM ELEMENT_FACTORY = VkRenderPassPerformanceCountersByRegionBeginInfoARM.create(-1L);

        /**
         * Creates a new {@code VkRenderPassPerformanceCountersByRegionBeginInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassPerformanceCountersByRegionBeginInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderPassPerformanceCountersByRegionBeginInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassPerformanceCountersByRegionBeginInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkRenderPassPerformanceCountersByRegionBeginInfoARM.npNext(address()); }
        /** @return the value of the {@code counterAddressCount} field. */
        @NativeType("uint32_t")
        public int counterAddressCount() { return VkRenderPassPerformanceCountersByRegionBeginInfoARM.ncounterAddressCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pCounterAddresses} field. */
        @NativeType("VkDeviceAddress const *")
        public LongBuffer pCounterAddresses(int capacity) { return VkRenderPassPerformanceCountersByRegionBeginInfoARM.npCounterAddresses(address(), capacity); }
        /** @return the value of the {@code serializeRegions} field. */
        @NativeType("VkBool32")
        public boolean serializeRegions() { return VkRenderPassPerformanceCountersByRegionBeginInfoARM.nserializeRegions(address()) != 0; }
        /** @return the value of the {@code counterIndexCount} field. */
        @NativeType("uint32_t")
        public int counterIndexCount() { return VkRenderPassPerformanceCountersByRegionBeginInfoARM.ncounterIndexCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pCounterIndices} field. */
        @NativeType("uint32_t *")
        public IntBuffer pCounterIndices(int capacity) { return VkRenderPassPerformanceCountersByRegionBeginInfoARM.npCounterIndices(address(), capacity); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderPassPerformanceCountersByRegionBeginInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassPerformanceCountersByRegionBeginInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMPerformanceCountersByRegion#VK_STRUCTURE_TYPE_RENDER_PASS_PERFORMANCE_COUNTERS_BY_REGION_BEGIN_INFO_ARM STRUCTURE_TYPE_RENDER_PASS_PERFORMANCE_COUNTERS_BY_REGION_BEGIN_INFO_ARM} value to the {@code sType} field. */
        public VkRenderPassPerformanceCountersByRegionBeginInfoARM.Buffer sType$Default() { return sType(ARMPerformanceCountersByRegion.VK_STRUCTURE_TYPE_RENDER_PASS_PERFORMANCE_COUNTERS_BY_REGION_BEGIN_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRenderPassPerformanceCountersByRegionBeginInfoARM.Buffer pNext(@NativeType("void *") long value) { VkRenderPassPerformanceCountersByRegionBeginInfoARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code counterAddressCount} field. */
        public VkRenderPassPerformanceCountersByRegionBeginInfoARM.Buffer counterAddressCount(@NativeType("uint32_t") int value) { VkRenderPassPerformanceCountersByRegionBeginInfoARM.ncounterAddressCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pCounterAddresses} field. */
        public VkRenderPassPerformanceCountersByRegionBeginInfoARM.Buffer pCounterAddresses(@NativeType("VkDeviceAddress const *") LongBuffer value) { VkRenderPassPerformanceCountersByRegionBeginInfoARM.npCounterAddresses(address(), value); return this; }
        /** Sets the specified value to the {@code serializeRegions} field. */
        public VkRenderPassPerformanceCountersByRegionBeginInfoARM.Buffer serializeRegions(@NativeType("VkBool32") boolean value) { VkRenderPassPerformanceCountersByRegionBeginInfoARM.nserializeRegions(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code counterIndexCount} field. */
        public VkRenderPassPerformanceCountersByRegionBeginInfoARM.Buffer counterIndexCount(@NativeType("uint32_t") int value) { VkRenderPassPerformanceCountersByRegionBeginInfoARM.ncounterIndexCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pCounterIndices} field. */
        public VkRenderPassPerformanceCountersByRegionBeginInfoARM.Buffer pCounterIndices(@NativeType("uint32_t *") IntBuffer value) { VkRenderPassPerformanceCountersByRegionBeginInfoARM.npCounterIndices(address(), value); return this; }

    }

}