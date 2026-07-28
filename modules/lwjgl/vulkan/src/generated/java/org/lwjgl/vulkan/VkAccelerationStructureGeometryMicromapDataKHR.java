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
 * struct VkAccelerationStructureGeometryMicromapDataKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t usageCountsCount;
 *     {@link VkMicromapUsageKHR VkMicromapUsageKHR} const * pUsageCounts;
 *     {@link VkMicromapUsageKHR VkMicromapUsageKHR} const * const * ppUsageCounts;
 *     VkDeviceAddress data;
 *     VkDeviceAddress triangleArray;
 *     VkDeviceSize triangleArrayStride;
 * }</code></pre>
 */
public class VkAccelerationStructureGeometryMicromapDataKHR extends Struct<VkAccelerationStructureGeometryMicromapDataKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        USAGECOUNTSCOUNT,
        PUSAGECOUNTS,
        PPUSAGECOUNTS,
        DATA,
        TRIANGLEARRAY,
        TRIANGLEARRAYSTRIDE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        USAGECOUNTSCOUNT = layout.offsetof(2);
        PUSAGECOUNTS = layout.offsetof(3);
        PPUSAGECOUNTS = layout.offsetof(4);
        DATA = layout.offsetof(5);
        TRIANGLEARRAY = layout.offsetof(6);
        TRIANGLEARRAYSTRIDE = layout.offsetof(7);
    }

    protected VkAccelerationStructureGeometryMicromapDataKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureGeometryMicromapDataKHR create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureGeometryMicromapDataKHR(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureGeometryMicromapDataKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureGeometryMicromapDataKHR(ByteBuffer container) {
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
    /** @return the value of the {@code usageCountsCount} field. */
    @NativeType("uint32_t")
    public int usageCountsCount() { return nusageCountsCount(address()); }
    /** @return a {@link VkMicromapUsageKHR.Buffer} view of the struct array pointed to by the {@code pUsageCounts} field. */
    @NativeType("VkMicromapUsageKHR const *")
    public VkMicromapUsageKHR.@Nullable Buffer pUsageCounts() { return npUsageCounts(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code ppUsageCounts} field. */
    @NativeType("VkMicromapUsageKHR const * const *")
    public @Nullable PointerBuffer ppUsageCounts() { return nppUsageCounts(address()); }
    /** @return the value of the {@code data} field. */
    @NativeType("VkDeviceAddress")
    public long data() { return ndata(address()); }
    /** @return the value of the {@code triangleArray} field. */
    @NativeType("VkDeviceAddress")
    public long triangleArray() { return ntriangleArray(address()); }
    /** @return the value of the {@code triangleArrayStride} field. */
    @NativeType("VkDeviceSize")
    public long triangleArrayStride() { return ntriangleArrayStride(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAccelerationStructureGeometryMicromapDataKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHROpacityMicromap#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MICROMAP_DATA_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MICROMAP_DATA_KHR} value to the {@code sType} field. */
    public VkAccelerationStructureGeometryMicromapDataKHR sType$Default() { return sType(KHROpacityMicromap.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MICROMAP_DATA_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAccelerationStructureGeometryMicromapDataKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code usageCountsCount} field. */
    public VkAccelerationStructureGeometryMicromapDataKHR usageCountsCount(@NativeType("uint32_t") int value) { nusageCountsCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkMicromapUsageKHR.Buffer} to the {@code pUsageCounts} field. */
    public VkAccelerationStructureGeometryMicromapDataKHR pUsageCounts(@NativeType("VkMicromapUsageKHR const *") VkMicromapUsageKHR.@Nullable Buffer value) { npUsageCounts(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code ppUsageCounts} field. */
    public VkAccelerationStructureGeometryMicromapDataKHR ppUsageCounts(@Nullable @NativeType("VkMicromapUsageKHR const * const *") PointerBuffer value) { nppUsageCounts(address(), value); return this; }
    /** Sets the specified value to the {@code data} field. */
    public VkAccelerationStructureGeometryMicromapDataKHR data(@NativeType("VkDeviceAddress") long value) { ndata(address(), value); return this; }
    /** Sets the specified value to the {@code triangleArray} field. */
    public VkAccelerationStructureGeometryMicromapDataKHR triangleArray(@NativeType("VkDeviceAddress") long value) { ntriangleArray(address(), value); return this; }
    /** Sets the specified value to the {@code triangleArrayStride} field. */
    public VkAccelerationStructureGeometryMicromapDataKHR triangleArrayStride(@NativeType("VkDeviceSize") long value) { ntriangleArrayStride(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureGeometryMicromapDataKHR set(
        int sType,
        long pNext,
        int usageCountsCount,
        VkMicromapUsageKHR.@Nullable Buffer pUsageCounts,
        @Nullable PointerBuffer ppUsageCounts,
        long data,
        long triangleArray,
        long triangleArrayStride
    ) {
        sType(sType);
        pNext(pNext);
        usageCountsCount(usageCountsCount);
        pUsageCounts(pUsageCounts);
        ppUsageCounts(ppUsageCounts);
        data(data);
        triangleArray(triangleArray);
        triangleArrayStride(triangleArrayStride);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureGeometryMicromapDataKHR set(VkAccelerationStructureGeometryMicromapDataKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureGeometryMicromapDataKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureGeometryMicromapDataKHR malloc() {
        return new VkAccelerationStructureGeometryMicromapDataKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureGeometryMicromapDataKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureGeometryMicromapDataKHR calloc() {
        return new VkAccelerationStructureGeometryMicromapDataKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureGeometryMicromapDataKHR} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureGeometryMicromapDataKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureGeometryMicromapDataKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureGeometryMicromapDataKHR} instance for the specified memory address. */
    public static VkAccelerationStructureGeometryMicromapDataKHR create(long address) {
        return new VkAccelerationStructureGeometryMicromapDataKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAccelerationStructureGeometryMicromapDataKHR createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureGeometryMicromapDataKHR(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryMicromapDataKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryMicromapDataKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryMicromapDataKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryMicromapDataKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryMicromapDataKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryMicromapDataKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureGeometryMicromapDataKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryMicromapDataKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAccelerationStructureGeometryMicromapDataKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureGeometryMicromapDataKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureGeometryMicromapDataKHR malloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometryMicromapDataKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureGeometryMicromapDataKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureGeometryMicromapDataKHR calloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometryMicromapDataKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryMicromapDataKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryMicromapDataKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryMicromapDataKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryMicromapDataKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAccelerationStructureGeometryMicromapDataKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureGeometryMicromapDataKHR.PNEXT); }
    /** Unsafe version of {@link #usageCountsCount}. */
    public static int nusageCountsCount(long struct) { return memGetInt(struct + VkAccelerationStructureGeometryMicromapDataKHR.USAGECOUNTSCOUNT); }
    /** Unsafe version of {@link #pUsageCounts}. */
    public static VkMicromapUsageKHR.@Nullable Buffer npUsageCounts(long struct) { return VkMicromapUsageKHR.createSafe(memGetAddress(struct + VkAccelerationStructureGeometryMicromapDataKHR.PUSAGECOUNTS), nusageCountsCount(struct)); }
    /** Unsafe version of {@link #ppUsageCounts() ppUsageCounts}. */
    public static @Nullable PointerBuffer nppUsageCounts(long struct) { return memPointerBufferSafe(memGetAddress(struct + VkAccelerationStructureGeometryMicromapDataKHR.PPUSAGECOUNTS), nusageCountsCount(struct)); }
    /** Unsafe version of {@link #data}. */
    public static long ndata(long struct) { return memGetLong(struct + VkAccelerationStructureGeometryMicromapDataKHR.DATA); }
    /** Unsafe version of {@link #triangleArray}. */
    public static long ntriangleArray(long struct) { return memGetLong(struct + VkAccelerationStructureGeometryMicromapDataKHR.TRIANGLEARRAY); }
    /** Unsafe version of {@link #triangleArrayStride}. */
    public static long ntriangleArrayStride(long struct) { return memGetLong(struct + VkAccelerationStructureGeometryMicromapDataKHR.TRIANGLEARRAYSTRIDE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAccelerationStructureGeometryMicromapDataKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureGeometryMicromapDataKHR.PNEXT, value); }
    /** Sets the specified value to the {@code usageCountsCount} field of the specified {@code struct}. */
    public static void nusageCountsCount(long struct, int value) { memPutInt(struct + VkAccelerationStructureGeometryMicromapDataKHR.USAGECOUNTSCOUNT, value); }
    /** Unsafe version of {@link #pUsageCounts(VkMicromapUsageKHR.Buffer) pUsageCounts}. */
    public static void npUsageCounts(long struct, VkMicromapUsageKHR.@Nullable Buffer value) { memPutAddress(struct + VkAccelerationStructureGeometryMicromapDataKHR.PUSAGECOUNTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #ppUsageCounts(PointerBuffer) ppUsageCounts}. */
    public static void nppUsageCounts(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + VkAccelerationStructureGeometryMicromapDataKHR.PPUSAGECOUNTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #data(long) data}. */
    public static void ndata(long struct, long value) { memPutLong(struct + VkAccelerationStructureGeometryMicromapDataKHR.DATA, value); }
    /** Unsafe version of {@link #triangleArray(long) triangleArray}. */
    public static void ntriangleArray(long struct, long value) { memPutLong(struct + VkAccelerationStructureGeometryMicromapDataKHR.TRIANGLEARRAY, value); }
    /** Unsafe version of {@link #triangleArrayStride(long) triangleArrayStride}. */
    public static void ntriangleArrayStride(long struct, long value) { memPutLong(struct + VkAccelerationStructureGeometryMicromapDataKHR.TRIANGLEARRAYSTRIDE, value); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureGeometryMicromapDataKHR} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureGeometryMicromapDataKHR, Buffer> implements NativeResource {

        private static final VkAccelerationStructureGeometryMicromapDataKHR ELEMENT_FACTORY = VkAccelerationStructureGeometryMicromapDataKHR.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureGeometryMicromapDataKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureGeometryMicromapDataKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureGeometryMicromapDataKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureGeometryMicromapDataKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureGeometryMicromapDataKHR.npNext(address()); }
        /** @return the value of the {@code usageCountsCount} field. */
        @NativeType("uint32_t")
        public int usageCountsCount() { return VkAccelerationStructureGeometryMicromapDataKHR.nusageCountsCount(address()); }
        /** @return a {@link VkMicromapUsageKHR.Buffer} view of the struct array pointed to by the {@code pUsageCounts} field. */
        @NativeType("VkMicromapUsageKHR const *")
        public VkMicromapUsageKHR.@Nullable Buffer pUsageCounts() { return VkAccelerationStructureGeometryMicromapDataKHR.npUsageCounts(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code ppUsageCounts} field. */
        @NativeType("VkMicromapUsageKHR const * const *")
        public @Nullable PointerBuffer ppUsageCounts() { return VkAccelerationStructureGeometryMicromapDataKHR.nppUsageCounts(address()); }
        /** @return the value of the {@code data} field. */
        @NativeType("VkDeviceAddress")
        public long data() { return VkAccelerationStructureGeometryMicromapDataKHR.ndata(address()); }
        /** @return the value of the {@code triangleArray} field. */
        @NativeType("VkDeviceAddress")
        public long triangleArray() { return VkAccelerationStructureGeometryMicromapDataKHR.ntriangleArray(address()); }
        /** @return the value of the {@code triangleArrayStride} field. */
        @NativeType("VkDeviceSize")
        public long triangleArrayStride() { return VkAccelerationStructureGeometryMicromapDataKHR.ntriangleArrayStride(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAccelerationStructureGeometryMicromapDataKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureGeometryMicromapDataKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHROpacityMicromap#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MICROMAP_DATA_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MICROMAP_DATA_KHR} value to the {@code sType} field. */
        public VkAccelerationStructureGeometryMicromapDataKHR.Buffer sType$Default() { return sType(KHROpacityMicromap.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MICROMAP_DATA_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAccelerationStructureGeometryMicromapDataKHR.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureGeometryMicromapDataKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code usageCountsCount} field. */
        public VkAccelerationStructureGeometryMicromapDataKHR.Buffer usageCountsCount(@NativeType("uint32_t") int value) { VkAccelerationStructureGeometryMicromapDataKHR.nusageCountsCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkMicromapUsageKHR.Buffer} to the {@code pUsageCounts} field. */
        public VkAccelerationStructureGeometryMicromapDataKHR.Buffer pUsageCounts(@NativeType("VkMicromapUsageKHR const *") VkMicromapUsageKHR.@Nullable Buffer value) { VkAccelerationStructureGeometryMicromapDataKHR.npUsageCounts(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code ppUsageCounts} field. */
        public VkAccelerationStructureGeometryMicromapDataKHR.Buffer ppUsageCounts(@Nullable @NativeType("VkMicromapUsageKHR const * const *") PointerBuffer value) { VkAccelerationStructureGeometryMicromapDataKHR.nppUsageCounts(address(), value); return this; }
        /** Sets the specified value to the {@code data} field. */
        public VkAccelerationStructureGeometryMicromapDataKHR.Buffer data(@NativeType("VkDeviceAddress") long value) { VkAccelerationStructureGeometryMicromapDataKHR.ndata(address(), value); return this; }
        /** Sets the specified value to the {@code triangleArray} field. */
        public VkAccelerationStructureGeometryMicromapDataKHR.Buffer triangleArray(@NativeType("VkDeviceAddress") long value) { VkAccelerationStructureGeometryMicromapDataKHR.ntriangleArray(address(), value); return this; }
        /** Sets the specified value to the {@code triangleArrayStride} field. */
        public VkAccelerationStructureGeometryMicromapDataKHR.Buffer triangleArrayStride(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureGeometryMicromapDataKHR.ntriangleArrayStride(address(), value); return this; }

    }

}