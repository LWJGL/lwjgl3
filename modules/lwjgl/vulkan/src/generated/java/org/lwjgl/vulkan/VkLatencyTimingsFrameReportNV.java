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
 * struct VkLatencyTimingsFrameReportNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint64_t presentID;
 *     uint64_t inputSampleTimeUs;
 *     uint64_t simStartTimeUs;
 *     uint64_t simEndTimeUs;
 *     uint64_t renderSubmitStartTimeUs;
 *     uint64_t renderSubmitEndTimeUs;
 *     uint64_t presentStartTimeUs;
 *     uint64_t presentEndTimeUs;
 *     uint64_t driverStartTimeUs;
 *     uint64_t driverEndTimeUs;
 *     uint64_t osRenderQueueStartTimeUs;
 *     uint64_t osRenderQueueEndTimeUs;
 *     uint64_t gpuRenderStartTimeUs;
 *     uint64_t gpuRenderEndTimeUs;
 * }}</pre>
 */
public class VkLatencyTimingsFrameReportNV extends Struct<VkLatencyTimingsFrameReportNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESENTID,
        INPUTSAMPLETIMEUS,
        SIMSTARTTIMEUS,
        SIMENDTIMEUS,
        RENDERSUBMITSTARTTIMEUS,
        RENDERSUBMITENDTIMEUS,
        PRESENTSTARTTIMEUS,
        PRESENTENDTIMEUS,
        DRIVERSTARTTIMEUS,
        DRIVERENDTIMEUS,
        OSRENDERQUEUESTARTTIMEUS,
        OSRENDERQUEUEENDTIMEUS,
        GPURENDERSTARTTIMEUS,
        GPURENDERENDTIMEUS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTID = layout.offsetof(2);
        INPUTSAMPLETIMEUS = layout.offsetof(3);
        SIMSTARTTIMEUS = layout.offsetof(4);
        SIMENDTIMEUS = layout.offsetof(5);
        RENDERSUBMITSTARTTIMEUS = layout.offsetof(6);
        RENDERSUBMITENDTIMEUS = layout.offsetof(7);
        PRESENTSTARTTIMEUS = layout.offsetof(8);
        PRESENTENDTIMEUS = layout.offsetof(9);
        DRIVERSTARTTIMEUS = layout.offsetof(10);
        DRIVERENDTIMEUS = layout.offsetof(11);
        OSRENDERQUEUESTARTTIMEUS = layout.offsetof(12);
        OSRENDERQUEUEENDTIMEUS = layout.offsetof(13);
        GPURENDERSTARTTIMEUS = layout.offsetof(14);
        GPURENDERENDTIMEUS = layout.offsetof(15);
    }

    protected VkLatencyTimingsFrameReportNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkLatencyTimingsFrameReportNV create(long address, @Nullable ByteBuffer container) {
        return new VkLatencyTimingsFrameReportNV(address, container);
    }

    /**
     * Creates a {@code VkLatencyTimingsFrameReportNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkLatencyTimingsFrameReportNV(ByteBuffer container) {
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
    /** @return the value of the {@code presentID} field. */
    @NativeType("uint64_t")
    public long presentID() { return npresentID(address()); }
    /** @return the value of the {@code inputSampleTimeUs} field. */
    @NativeType("uint64_t")
    public long inputSampleTimeUs() { return ninputSampleTimeUs(address()); }
    /** @return the value of the {@code simStartTimeUs} field. */
    @NativeType("uint64_t")
    public long simStartTimeUs() { return nsimStartTimeUs(address()); }
    /** @return the value of the {@code simEndTimeUs} field. */
    @NativeType("uint64_t")
    public long simEndTimeUs() { return nsimEndTimeUs(address()); }
    /** @return the value of the {@code renderSubmitStartTimeUs} field. */
    @NativeType("uint64_t")
    public long renderSubmitStartTimeUs() { return nrenderSubmitStartTimeUs(address()); }
    /** @return the value of the {@code renderSubmitEndTimeUs} field. */
    @NativeType("uint64_t")
    public long renderSubmitEndTimeUs() { return nrenderSubmitEndTimeUs(address()); }
    /** @return the value of the {@code presentStartTimeUs} field. */
    @NativeType("uint64_t")
    public long presentStartTimeUs() { return npresentStartTimeUs(address()); }
    /** @return the value of the {@code presentEndTimeUs} field. */
    @NativeType("uint64_t")
    public long presentEndTimeUs() { return npresentEndTimeUs(address()); }
    /** @return the value of the {@code driverStartTimeUs} field. */
    @NativeType("uint64_t")
    public long driverStartTimeUs() { return ndriverStartTimeUs(address()); }
    /** @return the value of the {@code driverEndTimeUs} field. */
    @NativeType("uint64_t")
    public long driverEndTimeUs() { return ndriverEndTimeUs(address()); }
    /** @return the value of the {@code osRenderQueueStartTimeUs} field. */
    @NativeType("uint64_t")
    public long osRenderQueueStartTimeUs() { return nosRenderQueueStartTimeUs(address()); }
    /** @return the value of the {@code osRenderQueueEndTimeUs} field. */
    @NativeType("uint64_t")
    public long osRenderQueueEndTimeUs() { return nosRenderQueueEndTimeUs(address()); }
    /** @return the value of the {@code gpuRenderStartTimeUs} field. */
    @NativeType("uint64_t")
    public long gpuRenderStartTimeUs() { return ngpuRenderStartTimeUs(address()); }
    /** @return the value of the {@code gpuRenderEndTimeUs} field. */
    @NativeType("uint64_t")
    public long gpuRenderEndTimeUs() { return ngpuRenderEndTimeUs(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkLatencyTimingsFrameReportNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVLowLatency2#VK_STRUCTURE_TYPE_LATENCY_TIMINGS_FRAME_REPORT_NV STRUCTURE_TYPE_LATENCY_TIMINGS_FRAME_REPORT_NV} value to the {@code sType} field. */
    public VkLatencyTimingsFrameReportNV sType$Default() { return sType(NVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_TIMINGS_FRAME_REPORT_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkLatencyTimingsFrameReportNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkLatencyTimingsFrameReportNV set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkLatencyTimingsFrameReportNV set(VkLatencyTimingsFrameReportNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkLatencyTimingsFrameReportNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkLatencyTimingsFrameReportNV malloc() {
        return new VkLatencyTimingsFrameReportNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkLatencyTimingsFrameReportNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkLatencyTimingsFrameReportNV calloc() {
        return new VkLatencyTimingsFrameReportNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkLatencyTimingsFrameReportNV} instance allocated with {@link BufferUtils}. */
    public static VkLatencyTimingsFrameReportNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkLatencyTimingsFrameReportNV(memAddress(container), container);
    }

    /** Returns a new {@code VkLatencyTimingsFrameReportNV} instance for the specified memory address. */
    public static VkLatencyTimingsFrameReportNV create(long address) {
        return new VkLatencyTimingsFrameReportNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkLatencyTimingsFrameReportNV createSafe(long address) {
        return address == NULL ? null : new VkLatencyTimingsFrameReportNV(address, null);
    }

    /**
     * Returns a new {@link VkLatencyTimingsFrameReportNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkLatencyTimingsFrameReportNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkLatencyTimingsFrameReportNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkLatencyTimingsFrameReportNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkLatencyTimingsFrameReportNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkLatencyTimingsFrameReportNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkLatencyTimingsFrameReportNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkLatencyTimingsFrameReportNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkLatencyTimingsFrameReportNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkLatencyTimingsFrameReportNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkLatencyTimingsFrameReportNV malloc(MemoryStack stack) {
        return new VkLatencyTimingsFrameReportNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkLatencyTimingsFrameReportNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkLatencyTimingsFrameReportNV calloc(MemoryStack stack) {
        return new VkLatencyTimingsFrameReportNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkLatencyTimingsFrameReportNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkLatencyTimingsFrameReportNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkLatencyTimingsFrameReportNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkLatencyTimingsFrameReportNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkLatencyTimingsFrameReportNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkLatencyTimingsFrameReportNV.PNEXT); }
    /** Unsafe version of {@link #presentID}. */
    public static long npresentID(long struct) { return memGetLong(struct + VkLatencyTimingsFrameReportNV.PRESENTID); }
    /** Unsafe version of {@link #inputSampleTimeUs}. */
    public static long ninputSampleTimeUs(long struct) { return memGetLong(struct + VkLatencyTimingsFrameReportNV.INPUTSAMPLETIMEUS); }
    /** Unsafe version of {@link #simStartTimeUs}. */
    public static long nsimStartTimeUs(long struct) { return memGetLong(struct + VkLatencyTimingsFrameReportNV.SIMSTARTTIMEUS); }
    /** Unsafe version of {@link #simEndTimeUs}. */
    public static long nsimEndTimeUs(long struct) { return memGetLong(struct + VkLatencyTimingsFrameReportNV.SIMENDTIMEUS); }
    /** Unsafe version of {@link #renderSubmitStartTimeUs}. */
    public static long nrenderSubmitStartTimeUs(long struct) { return memGetLong(struct + VkLatencyTimingsFrameReportNV.RENDERSUBMITSTARTTIMEUS); }
    /** Unsafe version of {@link #renderSubmitEndTimeUs}. */
    public static long nrenderSubmitEndTimeUs(long struct) { return memGetLong(struct + VkLatencyTimingsFrameReportNV.RENDERSUBMITENDTIMEUS); }
    /** Unsafe version of {@link #presentStartTimeUs}. */
    public static long npresentStartTimeUs(long struct) { return memGetLong(struct + VkLatencyTimingsFrameReportNV.PRESENTSTARTTIMEUS); }
    /** Unsafe version of {@link #presentEndTimeUs}. */
    public static long npresentEndTimeUs(long struct) { return memGetLong(struct + VkLatencyTimingsFrameReportNV.PRESENTENDTIMEUS); }
    /** Unsafe version of {@link #driverStartTimeUs}. */
    public static long ndriverStartTimeUs(long struct) { return memGetLong(struct + VkLatencyTimingsFrameReportNV.DRIVERSTARTTIMEUS); }
    /** Unsafe version of {@link #driverEndTimeUs}. */
    public static long ndriverEndTimeUs(long struct) { return memGetLong(struct + VkLatencyTimingsFrameReportNV.DRIVERENDTIMEUS); }
    /** Unsafe version of {@link #osRenderQueueStartTimeUs}. */
    public static long nosRenderQueueStartTimeUs(long struct) { return memGetLong(struct + VkLatencyTimingsFrameReportNV.OSRENDERQUEUESTARTTIMEUS); }
    /** Unsafe version of {@link #osRenderQueueEndTimeUs}. */
    public static long nosRenderQueueEndTimeUs(long struct) { return memGetLong(struct + VkLatencyTimingsFrameReportNV.OSRENDERQUEUEENDTIMEUS); }
    /** Unsafe version of {@link #gpuRenderStartTimeUs}. */
    public static long ngpuRenderStartTimeUs(long struct) { return memGetLong(struct + VkLatencyTimingsFrameReportNV.GPURENDERSTARTTIMEUS); }
    /** Unsafe version of {@link #gpuRenderEndTimeUs}. */
    public static long ngpuRenderEndTimeUs(long struct) { return memGetLong(struct + VkLatencyTimingsFrameReportNV.GPURENDERENDTIMEUS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkLatencyTimingsFrameReportNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkLatencyTimingsFrameReportNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkLatencyTimingsFrameReportNV} structs. */
    public static class Buffer extends StructBuffer<VkLatencyTimingsFrameReportNV, Buffer> implements NativeResource {

        private static final VkLatencyTimingsFrameReportNV ELEMENT_FACTORY = VkLatencyTimingsFrameReportNV.create(-1L);

        /**
         * Creates a new {@code VkLatencyTimingsFrameReportNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkLatencyTimingsFrameReportNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkLatencyTimingsFrameReportNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkLatencyTimingsFrameReportNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkLatencyTimingsFrameReportNV.npNext(address()); }
        /** @return the value of the {@code presentID} field. */
        @NativeType("uint64_t")
        public long presentID() { return VkLatencyTimingsFrameReportNV.npresentID(address()); }
        /** @return the value of the {@code inputSampleTimeUs} field. */
        @NativeType("uint64_t")
        public long inputSampleTimeUs() { return VkLatencyTimingsFrameReportNV.ninputSampleTimeUs(address()); }
        /** @return the value of the {@code simStartTimeUs} field. */
        @NativeType("uint64_t")
        public long simStartTimeUs() { return VkLatencyTimingsFrameReportNV.nsimStartTimeUs(address()); }
        /** @return the value of the {@code simEndTimeUs} field. */
        @NativeType("uint64_t")
        public long simEndTimeUs() { return VkLatencyTimingsFrameReportNV.nsimEndTimeUs(address()); }
        /** @return the value of the {@code renderSubmitStartTimeUs} field. */
        @NativeType("uint64_t")
        public long renderSubmitStartTimeUs() { return VkLatencyTimingsFrameReportNV.nrenderSubmitStartTimeUs(address()); }
        /** @return the value of the {@code renderSubmitEndTimeUs} field. */
        @NativeType("uint64_t")
        public long renderSubmitEndTimeUs() { return VkLatencyTimingsFrameReportNV.nrenderSubmitEndTimeUs(address()); }
        /** @return the value of the {@code presentStartTimeUs} field. */
        @NativeType("uint64_t")
        public long presentStartTimeUs() { return VkLatencyTimingsFrameReportNV.npresentStartTimeUs(address()); }
        /** @return the value of the {@code presentEndTimeUs} field. */
        @NativeType("uint64_t")
        public long presentEndTimeUs() { return VkLatencyTimingsFrameReportNV.npresentEndTimeUs(address()); }
        /** @return the value of the {@code driverStartTimeUs} field. */
        @NativeType("uint64_t")
        public long driverStartTimeUs() { return VkLatencyTimingsFrameReportNV.ndriverStartTimeUs(address()); }
        /** @return the value of the {@code driverEndTimeUs} field. */
        @NativeType("uint64_t")
        public long driverEndTimeUs() { return VkLatencyTimingsFrameReportNV.ndriverEndTimeUs(address()); }
        /** @return the value of the {@code osRenderQueueStartTimeUs} field. */
        @NativeType("uint64_t")
        public long osRenderQueueStartTimeUs() { return VkLatencyTimingsFrameReportNV.nosRenderQueueStartTimeUs(address()); }
        /** @return the value of the {@code osRenderQueueEndTimeUs} field. */
        @NativeType("uint64_t")
        public long osRenderQueueEndTimeUs() { return VkLatencyTimingsFrameReportNV.nosRenderQueueEndTimeUs(address()); }
        /** @return the value of the {@code gpuRenderStartTimeUs} field. */
        @NativeType("uint64_t")
        public long gpuRenderStartTimeUs() { return VkLatencyTimingsFrameReportNV.ngpuRenderStartTimeUs(address()); }
        /** @return the value of the {@code gpuRenderEndTimeUs} field. */
        @NativeType("uint64_t")
        public long gpuRenderEndTimeUs() { return VkLatencyTimingsFrameReportNV.ngpuRenderEndTimeUs(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkLatencyTimingsFrameReportNV.Buffer sType(@NativeType("VkStructureType") int value) { VkLatencyTimingsFrameReportNV.nsType(address(), value); return this; }
        /** Sets the {@link NVLowLatency2#VK_STRUCTURE_TYPE_LATENCY_TIMINGS_FRAME_REPORT_NV STRUCTURE_TYPE_LATENCY_TIMINGS_FRAME_REPORT_NV} value to the {@code sType} field. */
        public VkLatencyTimingsFrameReportNV.Buffer sType$Default() { return sType(NVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_TIMINGS_FRAME_REPORT_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkLatencyTimingsFrameReportNV.Buffer pNext(@NativeType("void const *") long value) { VkLatencyTimingsFrameReportNV.npNext(address(), value); return this; }

    }

}