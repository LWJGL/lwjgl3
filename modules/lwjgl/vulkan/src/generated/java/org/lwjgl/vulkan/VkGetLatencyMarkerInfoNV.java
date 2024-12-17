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
 * struct VkGetLatencyMarkerInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t timingCount;
 *     {@link VkLatencyTimingsFrameReportNV VkLatencyTimingsFrameReportNV} * pTimings;
 * }}</pre>
 */
public class VkGetLatencyMarkerInfoNV extends Struct<VkGetLatencyMarkerInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TIMINGCOUNT,
        PTIMINGS;

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
        TIMINGCOUNT = layout.offsetof(2);
        PTIMINGS = layout.offsetof(3);
    }

    protected VkGetLatencyMarkerInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkGetLatencyMarkerInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkGetLatencyMarkerInfoNV(address, container);
    }

    /**
     * Creates a {@code VkGetLatencyMarkerInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGetLatencyMarkerInfoNV(ByteBuffer container) {
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
    /** @return the value of the {@code timingCount} field. */
    @NativeType("uint32_t")
    public int timingCount() { return ntimingCount(address()); }
    /** @return a {@link VkLatencyTimingsFrameReportNV.Buffer} view of the struct array pointed to by the {@code pTimings} field. */
    @NativeType("VkLatencyTimingsFrameReportNV *")
    public VkLatencyTimingsFrameReportNV.@Nullable Buffer pTimings() { return npTimings(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkGetLatencyMarkerInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVLowLatency2#VK_STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV} value to the {@code sType} field. */
    public VkGetLatencyMarkerInfoNV sType$Default() { return sType(NVLowLatency2.VK_STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkGetLatencyMarkerInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code timingCount} field. */
    public VkGetLatencyMarkerInfoNV timingCount(@NativeType("uint32_t") int value) { ntimingCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkLatencyTimingsFrameReportNV.Buffer} to the {@code pTimings} field. */
    public VkGetLatencyMarkerInfoNV pTimings(@NativeType("VkLatencyTimingsFrameReportNV *") VkLatencyTimingsFrameReportNV.@Nullable Buffer value) { npTimings(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGetLatencyMarkerInfoNV set(
        int sType,
        long pNext,
        int timingCount,
        VkLatencyTimingsFrameReportNV.@Nullable Buffer pTimings
    ) {
        sType(sType);
        pNext(pNext);
        timingCount(timingCount);
        pTimings(pTimings);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkGetLatencyMarkerInfoNV set(VkGetLatencyMarkerInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGetLatencyMarkerInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGetLatencyMarkerInfoNV malloc() {
        return new VkGetLatencyMarkerInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkGetLatencyMarkerInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGetLatencyMarkerInfoNV calloc() {
        return new VkGetLatencyMarkerInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkGetLatencyMarkerInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkGetLatencyMarkerInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGetLatencyMarkerInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkGetLatencyMarkerInfoNV} instance for the specified memory address. */
    public static VkGetLatencyMarkerInfoNV create(long address) {
        return new VkGetLatencyMarkerInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkGetLatencyMarkerInfoNV createSafe(long address) {
        return address == NULL ? null : new VkGetLatencyMarkerInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkGetLatencyMarkerInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGetLatencyMarkerInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGetLatencyMarkerInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGetLatencyMarkerInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGetLatencyMarkerInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGetLatencyMarkerInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkGetLatencyMarkerInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGetLatencyMarkerInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkGetLatencyMarkerInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkGetLatencyMarkerInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGetLatencyMarkerInfoNV malloc(MemoryStack stack) {
        return new VkGetLatencyMarkerInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkGetLatencyMarkerInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGetLatencyMarkerInfoNV calloc(MemoryStack stack) {
        return new VkGetLatencyMarkerInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkGetLatencyMarkerInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGetLatencyMarkerInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGetLatencyMarkerInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGetLatencyMarkerInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkGetLatencyMarkerInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGetLatencyMarkerInfoNV.PNEXT); }
    /** Unsafe version of {@link #timingCount}. */
    public static int ntimingCount(long struct) { return memGetInt(struct + VkGetLatencyMarkerInfoNV.TIMINGCOUNT); }
    /** Unsafe version of {@link #pTimings}. */
    public static VkLatencyTimingsFrameReportNV.@Nullable Buffer npTimings(long struct) { return VkLatencyTimingsFrameReportNV.createSafe(memGetAddress(struct + VkGetLatencyMarkerInfoNV.PTIMINGS), ntimingCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkGetLatencyMarkerInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGetLatencyMarkerInfoNV.PNEXT, value); }
    /** Sets the specified value to the {@code timingCount} field of the specified {@code struct}. */
    public static void ntimingCount(long struct, int value) { memPutInt(struct + VkGetLatencyMarkerInfoNV.TIMINGCOUNT, value); }
    /** Unsafe version of {@link #pTimings(VkLatencyTimingsFrameReportNV.Buffer) pTimings}. */
    public static void npTimings(long struct, VkLatencyTimingsFrameReportNV.@Nullable Buffer value) { memPutAddress(struct + VkGetLatencyMarkerInfoNV.PTIMINGS, memAddressSafe(value)); if (value != null) { ntimingCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkGetLatencyMarkerInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkGetLatencyMarkerInfoNV, Buffer> implements NativeResource {

        private static final VkGetLatencyMarkerInfoNV ELEMENT_FACTORY = VkGetLatencyMarkerInfoNV.create(-1L);

        /**
         * Creates a new {@code VkGetLatencyMarkerInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGetLatencyMarkerInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkGetLatencyMarkerInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGetLatencyMarkerInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGetLatencyMarkerInfoNV.npNext(address()); }
        /** @return the value of the {@code timingCount} field. */
        @NativeType("uint32_t")
        public int timingCount() { return VkGetLatencyMarkerInfoNV.ntimingCount(address()); }
        /** @return a {@link VkLatencyTimingsFrameReportNV.Buffer} view of the struct array pointed to by the {@code pTimings} field. */
        @NativeType("VkLatencyTimingsFrameReportNV *")
        public VkLatencyTimingsFrameReportNV.@Nullable Buffer pTimings() { return VkGetLatencyMarkerInfoNV.npTimings(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkGetLatencyMarkerInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkGetLatencyMarkerInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVLowLatency2#VK_STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV} value to the {@code sType} field. */
        public VkGetLatencyMarkerInfoNV.Buffer sType$Default() { return sType(NVLowLatency2.VK_STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkGetLatencyMarkerInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkGetLatencyMarkerInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code timingCount} field. */
        public VkGetLatencyMarkerInfoNV.Buffer timingCount(@NativeType("uint32_t") int value) { VkGetLatencyMarkerInfoNV.ntimingCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkLatencyTimingsFrameReportNV.Buffer} to the {@code pTimings} field. */
        public VkGetLatencyMarkerInfoNV.Buffer pTimings(@NativeType("VkLatencyTimingsFrameReportNV *") VkLatencyTimingsFrameReportNV.@Nullable Buffer value) { VkGetLatencyMarkerInfoNV.npTimings(address(), value); return this; }

    }

}