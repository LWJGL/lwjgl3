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
 * <pre><code>
 * struct VkGpaSampleBeginInfoAMD {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkGpaSampleTypeAMD sampleType;
 *     VkBool32 sampleInternalOperations;
 *     VkBool32 cacheFlushOnCounterCollection;
 *     VkBool32 sqShaderMaskEnable;
 *     VkGpaSqShaderStageFlagsAMD sqShaderMask;
 *     uint32_t perfCounterCount;
 *     {@link VkGpaPerfCounterAMD VkGpaPerfCounterAMD} const * pPerfCounters;
 *     uint32_t streamingPerfTraceSampleInterval;
 *     VkDeviceSize perfCounterDeviceMemoryLimit;
 *     VkBool32 sqThreadTraceEnable;
 *     VkBool32 sqThreadTraceSuppressInstructionTokens;
 *     VkDeviceSize sqThreadTraceDeviceMemoryLimit;
 *     VkPipelineStageFlags timingPreSample;
 *     VkPipelineStageFlags timingPostSample;
 * }</code></pre>
 */
public class VkGpaSampleBeginInfoAMD extends Struct<VkGpaSampleBeginInfoAMD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SAMPLETYPE,
        SAMPLEINTERNALOPERATIONS,
        CACHEFLUSHONCOUNTERCOLLECTION,
        SQSHADERMASKENABLE,
        SQSHADERMASK,
        PERFCOUNTERCOUNT,
        PPERFCOUNTERS,
        STREAMINGPERFTRACESAMPLEINTERVAL,
        PERFCOUNTERDEVICEMEMORYLIMIT,
        SQTHREADTRACEENABLE,
        SQTHREADTRACESUPPRESSINSTRUCTIONTOKENS,
        SQTHREADTRACEDEVICEMEMORYLIMIT,
        TIMINGPRESAMPLE,
        TIMINGPOSTSAMPLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SAMPLETYPE = layout.offsetof(2);
        SAMPLEINTERNALOPERATIONS = layout.offsetof(3);
        CACHEFLUSHONCOUNTERCOLLECTION = layout.offsetof(4);
        SQSHADERMASKENABLE = layout.offsetof(5);
        SQSHADERMASK = layout.offsetof(6);
        PERFCOUNTERCOUNT = layout.offsetof(7);
        PPERFCOUNTERS = layout.offsetof(8);
        STREAMINGPERFTRACESAMPLEINTERVAL = layout.offsetof(9);
        PERFCOUNTERDEVICEMEMORYLIMIT = layout.offsetof(10);
        SQTHREADTRACEENABLE = layout.offsetof(11);
        SQTHREADTRACESUPPRESSINSTRUCTIONTOKENS = layout.offsetof(12);
        SQTHREADTRACEDEVICEMEMORYLIMIT = layout.offsetof(13);
        TIMINGPRESAMPLE = layout.offsetof(14);
        TIMINGPOSTSAMPLE = layout.offsetof(15);
    }

    protected VkGpaSampleBeginInfoAMD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkGpaSampleBeginInfoAMD create(long address, @Nullable ByteBuffer container) {
        return new VkGpaSampleBeginInfoAMD(address, container);
    }

    /**
     * Creates a {@code VkGpaSampleBeginInfoAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGpaSampleBeginInfoAMD(ByteBuffer container) {
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
    /** @return the value of the {@code sampleType} field. */
    @NativeType("VkGpaSampleTypeAMD")
    public int sampleType() { return nsampleType(address()); }
    /** @return the value of the {@code sampleInternalOperations} field. */
    @NativeType("VkBool32")
    public boolean sampleInternalOperations() { return nsampleInternalOperations(address()) != 0; }
    /** @return the value of the {@code cacheFlushOnCounterCollection} field. */
    @NativeType("VkBool32")
    public boolean cacheFlushOnCounterCollection() { return ncacheFlushOnCounterCollection(address()) != 0; }
    /** @return the value of the {@code sqShaderMaskEnable} field. */
    @NativeType("VkBool32")
    public boolean sqShaderMaskEnable() { return nsqShaderMaskEnable(address()) != 0; }
    /** @return the value of the {@code sqShaderMask} field. */
    @NativeType("VkGpaSqShaderStageFlagsAMD")
    public int sqShaderMask() { return nsqShaderMask(address()); }
    /** @return the value of the {@code perfCounterCount} field. */
    @NativeType("uint32_t")
    public int perfCounterCount() { return nperfCounterCount(address()); }
    /** @return a {@link VkGpaPerfCounterAMD.Buffer} view of the struct array pointed to by the {@code pPerfCounters} field. */
    @NativeType("VkGpaPerfCounterAMD const *")
    public VkGpaPerfCounterAMD.Buffer pPerfCounters() { return npPerfCounters(address()); }
    /** @return the value of the {@code streamingPerfTraceSampleInterval} field. */
    @NativeType("uint32_t")
    public int streamingPerfTraceSampleInterval() { return nstreamingPerfTraceSampleInterval(address()); }
    /** @return the value of the {@code perfCounterDeviceMemoryLimit} field. */
    @NativeType("VkDeviceSize")
    public long perfCounterDeviceMemoryLimit() { return nperfCounterDeviceMemoryLimit(address()); }
    /** @return the value of the {@code sqThreadTraceEnable} field. */
    @NativeType("VkBool32")
    public boolean sqThreadTraceEnable() { return nsqThreadTraceEnable(address()) != 0; }
    /** @return the value of the {@code sqThreadTraceSuppressInstructionTokens} field. */
    @NativeType("VkBool32")
    public boolean sqThreadTraceSuppressInstructionTokens() { return nsqThreadTraceSuppressInstructionTokens(address()) != 0; }
    /** @return the value of the {@code sqThreadTraceDeviceMemoryLimit} field. */
    @NativeType("VkDeviceSize")
    public long sqThreadTraceDeviceMemoryLimit() { return nsqThreadTraceDeviceMemoryLimit(address()); }
    /** @return the value of the {@code timingPreSample} field. */
    @NativeType("VkPipelineStageFlags")
    public int timingPreSample() { return ntimingPreSample(address()); }
    /** @return the value of the {@code timingPostSample} field. */
    @NativeType("VkPipelineStageFlags")
    public int timingPostSample() { return ntimingPostSample(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkGpaSampleBeginInfoAMD sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDGpaInterface#VK_STRUCTURE_TYPE_GPA_SAMPLE_BEGIN_INFO_AMD STRUCTURE_TYPE_GPA_SAMPLE_BEGIN_INFO_AMD} value to the {@code sType} field. */
    public VkGpaSampleBeginInfoAMD sType$Default() { return sType(AMDGpaInterface.VK_STRUCTURE_TYPE_GPA_SAMPLE_BEGIN_INFO_AMD); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkGpaSampleBeginInfoAMD pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code sampleType} field. */
    public VkGpaSampleBeginInfoAMD sampleType(@NativeType("VkGpaSampleTypeAMD") int value) { nsampleType(address(), value); return this; }
    /** Sets the specified value to the {@code sampleInternalOperations} field. */
    public VkGpaSampleBeginInfoAMD sampleInternalOperations(@NativeType("VkBool32") boolean value) { nsampleInternalOperations(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code cacheFlushOnCounterCollection} field. */
    public VkGpaSampleBeginInfoAMD cacheFlushOnCounterCollection(@NativeType("VkBool32") boolean value) { ncacheFlushOnCounterCollection(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sqShaderMaskEnable} field. */
    public VkGpaSampleBeginInfoAMD sqShaderMaskEnable(@NativeType("VkBool32") boolean value) { nsqShaderMaskEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sqShaderMask} field. */
    public VkGpaSampleBeginInfoAMD sqShaderMask(@NativeType("VkGpaSqShaderStageFlagsAMD") int value) { nsqShaderMask(address(), value); return this; }
    /** Sets the address of the specified {@link VkGpaPerfCounterAMD.Buffer} to the {@code pPerfCounters} field. */
    public VkGpaSampleBeginInfoAMD pPerfCounters(@NativeType("VkGpaPerfCounterAMD const *") VkGpaPerfCounterAMD.Buffer value) { npPerfCounters(address(), value); return this; }
    /** Sets the specified value to the {@code streamingPerfTraceSampleInterval} field. */
    public VkGpaSampleBeginInfoAMD streamingPerfTraceSampleInterval(@NativeType("uint32_t") int value) { nstreamingPerfTraceSampleInterval(address(), value); return this; }
    /** Sets the specified value to the {@code perfCounterDeviceMemoryLimit} field. */
    public VkGpaSampleBeginInfoAMD perfCounterDeviceMemoryLimit(@NativeType("VkDeviceSize") long value) { nperfCounterDeviceMemoryLimit(address(), value); return this; }
    /** Sets the specified value to the {@code sqThreadTraceEnable} field. */
    public VkGpaSampleBeginInfoAMD sqThreadTraceEnable(@NativeType("VkBool32") boolean value) { nsqThreadTraceEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sqThreadTraceSuppressInstructionTokens} field. */
    public VkGpaSampleBeginInfoAMD sqThreadTraceSuppressInstructionTokens(@NativeType("VkBool32") boolean value) { nsqThreadTraceSuppressInstructionTokens(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sqThreadTraceDeviceMemoryLimit} field. */
    public VkGpaSampleBeginInfoAMD sqThreadTraceDeviceMemoryLimit(@NativeType("VkDeviceSize") long value) { nsqThreadTraceDeviceMemoryLimit(address(), value); return this; }
    /** Sets the specified value to the {@code timingPreSample} field. */
    public VkGpaSampleBeginInfoAMD timingPreSample(@NativeType("VkPipelineStageFlags") int value) { ntimingPreSample(address(), value); return this; }
    /** Sets the specified value to the {@code timingPostSample} field. */
    public VkGpaSampleBeginInfoAMD timingPostSample(@NativeType("VkPipelineStageFlags") int value) { ntimingPostSample(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGpaSampleBeginInfoAMD set(
        int sType,
        long pNext,
        int sampleType,
        boolean sampleInternalOperations,
        boolean cacheFlushOnCounterCollection,
        boolean sqShaderMaskEnable,
        int sqShaderMask,
        VkGpaPerfCounterAMD.Buffer pPerfCounters,
        int streamingPerfTraceSampleInterval,
        long perfCounterDeviceMemoryLimit,
        boolean sqThreadTraceEnable,
        boolean sqThreadTraceSuppressInstructionTokens,
        long sqThreadTraceDeviceMemoryLimit,
        int timingPreSample,
        int timingPostSample
    ) {
        sType(sType);
        pNext(pNext);
        sampleType(sampleType);
        sampleInternalOperations(sampleInternalOperations);
        cacheFlushOnCounterCollection(cacheFlushOnCounterCollection);
        sqShaderMaskEnable(sqShaderMaskEnable);
        sqShaderMask(sqShaderMask);
        pPerfCounters(pPerfCounters);
        streamingPerfTraceSampleInterval(streamingPerfTraceSampleInterval);
        perfCounterDeviceMemoryLimit(perfCounterDeviceMemoryLimit);
        sqThreadTraceEnable(sqThreadTraceEnable);
        sqThreadTraceSuppressInstructionTokens(sqThreadTraceSuppressInstructionTokens);
        sqThreadTraceDeviceMemoryLimit(sqThreadTraceDeviceMemoryLimit);
        timingPreSample(timingPreSample);
        timingPostSample(timingPostSample);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkGpaSampleBeginInfoAMD set(VkGpaSampleBeginInfoAMD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGpaSampleBeginInfoAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGpaSampleBeginInfoAMD malloc() {
        return new VkGpaSampleBeginInfoAMD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkGpaSampleBeginInfoAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGpaSampleBeginInfoAMD calloc() {
        return new VkGpaSampleBeginInfoAMD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkGpaSampleBeginInfoAMD} instance allocated with {@link BufferUtils}. */
    public static VkGpaSampleBeginInfoAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGpaSampleBeginInfoAMD(memAddress(container), container);
    }

    /** Returns a new {@code VkGpaSampleBeginInfoAMD} instance for the specified memory address. */
    public static VkGpaSampleBeginInfoAMD create(long address) {
        return new VkGpaSampleBeginInfoAMD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkGpaSampleBeginInfoAMD createSafe(long address) {
        return address == NULL ? null : new VkGpaSampleBeginInfoAMD(address, null);
    }

    /**
     * Returns a new {@link VkGpaSampleBeginInfoAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGpaSampleBeginInfoAMD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGpaSampleBeginInfoAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGpaSampleBeginInfoAMD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGpaSampleBeginInfoAMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGpaSampleBeginInfoAMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkGpaSampleBeginInfoAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGpaSampleBeginInfoAMD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkGpaSampleBeginInfoAMD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkGpaSampleBeginInfoAMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGpaSampleBeginInfoAMD malloc(MemoryStack stack) {
        return new VkGpaSampleBeginInfoAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkGpaSampleBeginInfoAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGpaSampleBeginInfoAMD calloc(MemoryStack stack) {
        return new VkGpaSampleBeginInfoAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkGpaSampleBeginInfoAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGpaSampleBeginInfoAMD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGpaSampleBeginInfoAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGpaSampleBeginInfoAMD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkGpaSampleBeginInfoAMD.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGpaSampleBeginInfoAMD.PNEXT); }
    /** Unsafe version of {@link #sampleType}. */
    public static int nsampleType(long struct) { return memGetInt(struct + VkGpaSampleBeginInfoAMD.SAMPLETYPE); }
    /** Unsafe version of {@link #sampleInternalOperations}. */
    public static int nsampleInternalOperations(long struct) { return memGetInt(struct + VkGpaSampleBeginInfoAMD.SAMPLEINTERNALOPERATIONS); }
    /** Unsafe version of {@link #cacheFlushOnCounterCollection}. */
    public static int ncacheFlushOnCounterCollection(long struct) { return memGetInt(struct + VkGpaSampleBeginInfoAMD.CACHEFLUSHONCOUNTERCOLLECTION); }
    /** Unsafe version of {@link #sqShaderMaskEnable}. */
    public static int nsqShaderMaskEnable(long struct) { return memGetInt(struct + VkGpaSampleBeginInfoAMD.SQSHADERMASKENABLE); }
    /** Unsafe version of {@link #sqShaderMask}. */
    public static int nsqShaderMask(long struct) { return memGetInt(struct + VkGpaSampleBeginInfoAMD.SQSHADERMASK); }
    /** Unsafe version of {@link #perfCounterCount}. */
    public static int nperfCounterCount(long struct) { return memGetInt(struct + VkGpaSampleBeginInfoAMD.PERFCOUNTERCOUNT); }
    /** Unsafe version of {@link #pPerfCounters}. */
    public static VkGpaPerfCounterAMD.Buffer npPerfCounters(long struct) { return VkGpaPerfCounterAMD.create(memGetAddress(struct + VkGpaSampleBeginInfoAMD.PPERFCOUNTERS), nperfCounterCount(struct)); }
    /** Unsafe version of {@link #streamingPerfTraceSampleInterval}. */
    public static int nstreamingPerfTraceSampleInterval(long struct) { return memGetInt(struct + VkGpaSampleBeginInfoAMD.STREAMINGPERFTRACESAMPLEINTERVAL); }
    /** Unsafe version of {@link #perfCounterDeviceMemoryLimit}. */
    public static long nperfCounterDeviceMemoryLimit(long struct) { return memGetLong(struct + VkGpaSampleBeginInfoAMD.PERFCOUNTERDEVICEMEMORYLIMIT); }
    /** Unsafe version of {@link #sqThreadTraceEnable}. */
    public static int nsqThreadTraceEnable(long struct) { return memGetInt(struct + VkGpaSampleBeginInfoAMD.SQTHREADTRACEENABLE); }
    /** Unsafe version of {@link #sqThreadTraceSuppressInstructionTokens}. */
    public static int nsqThreadTraceSuppressInstructionTokens(long struct) { return memGetInt(struct + VkGpaSampleBeginInfoAMD.SQTHREADTRACESUPPRESSINSTRUCTIONTOKENS); }
    /** Unsafe version of {@link #sqThreadTraceDeviceMemoryLimit}. */
    public static long nsqThreadTraceDeviceMemoryLimit(long struct) { return memGetLong(struct + VkGpaSampleBeginInfoAMD.SQTHREADTRACEDEVICEMEMORYLIMIT); }
    /** Unsafe version of {@link #timingPreSample}. */
    public static int ntimingPreSample(long struct) { return memGetInt(struct + VkGpaSampleBeginInfoAMD.TIMINGPRESAMPLE); }
    /** Unsafe version of {@link #timingPostSample}. */
    public static int ntimingPostSample(long struct) { return memGetInt(struct + VkGpaSampleBeginInfoAMD.TIMINGPOSTSAMPLE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkGpaSampleBeginInfoAMD.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGpaSampleBeginInfoAMD.PNEXT, value); }
    /** Unsafe version of {@link #sampleType(int) sampleType}. */
    public static void nsampleType(long struct, int value) { memPutInt(struct + VkGpaSampleBeginInfoAMD.SAMPLETYPE, value); }
    /** Unsafe version of {@link #sampleInternalOperations(boolean) sampleInternalOperations}. */
    public static void nsampleInternalOperations(long struct, int value) { memPutInt(struct + VkGpaSampleBeginInfoAMD.SAMPLEINTERNALOPERATIONS, value); }
    /** Unsafe version of {@link #cacheFlushOnCounterCollection(boolean) cacheFlushOnCounterCollection}. */
    public static void ncacheFlushOnCounterCollection(long struct, int value) { memPutInt(struct + VkGpaSampleBeginInfoAMD.CACHEFLUSHONCOUNTERCOLLECTION, value); }
    /** Unsafe version of {@link #sqShaderMaskEnable(boolean) sqShaderMaskEnable}. */
    public static void nsqShaderMaskEnable(long struct, int value) { memPutInt(struct + VkGpaSampleBeginInfoAMD.SQSHADERMASKENABLE, value); }
    /** Unsafe version of {@link #sqShaderMask(int) sqShaderMask}. */
    public static void nsqShaderMask(long struct, int value) { memPutInt(struct + VkGpaSampleBeginInfoAMD.SQSHADERMASK, value); }
    /** Sets the specified value to the {@code perfCounterCount} field of the specified {@code struct}. */
    public static void nperfCounterCount(long struct, int value) { memPutInt(struct + VkGpaSampleBeginInfoAMD.PERFCOUNTERCOUNT, value); }
    /** Unsafe version of {@link #pPerfCounters(VkGpaPerfCounterAMD.Buffer) pPerfCounters}. */
    public static void npPerfCounters(long struct, VkGpaPerfCounterAMD.Buffer value) { memPutAddress(struct + VkGpaSampleBeginInfoAMD.PPERFCOUNTERS, value.address()); nperfCounterCount(struct, value.remaining()); }
    /** Unsafe version of {@link #streamingPerfTraceSampleInterval(int) streamingPerfTraceSampleInterval}. */
    public static void nstreamingPerfTraceSampleInterval(long struct, int value) { memPutInt(struct + VkGpaSampleBeginInfoAMD.STREAMINGPERFTRACESAMPLEINTERVAL, value); }
    /** Unsafe version of {@link #perfCounterDeviceMemoryLimit(long) perfCounterDeviceMemoryLimit}. */
    public static void nperfCounterDeviceMemoryLimit(long struct, long value) { memPutLong(struct + VkGpaSampleBeginInfoAMD.PERFCOUNTERDEVICEMEMORYLIMIT, value); }
    /** Unsafe version of {@link #sqThreadTraceEnable(boolean) sqThreadTraceEnable}. */
    public static void nsqThreadTraceEnable(long struct, int value) { memPutInt(struct + VkGpaSampleBeginInfoAMD.SQTHREADTRACEENABLE, value); }
    /** Unsafe version of {@link #sqThreadTraceSuppressInstructionTokens(boolean) sqThreadTraceSuppressInstructionTokens}. */
    public static void nsqThreadTraceSuppressInstructionTokens(long struct, int value) { memPutInt(struct + VkGpaSampleBeginInfoAMD.SQTHREADTRACESUPPRESSINSTRUCTIONTOKENS, value); }
    /** Unsafe version of {@link #sqThreadTraceDeviceMemoryLimit(long) sqThreadTraceDeviceMemoryLimit}. */
    public static void nsqThreadTraceDeviceMemoryLimit(long struct, long value) { memPutLong(struct + VkGpaSampleBeginInfoAMD.SQTHREADTRACEDEVICEMEMORYLIMIT, value); }
    /** Unsafe version of {@link #timingPreSample(int) timingPreSample}. */
    public static void ntimingPreSample(long struct, int value) { memPutInt(struct + VkGpaSampleBeginInfoAMD.TIMINGPRESAMPLE, value); }
    /** Unsafe version of {@link #timingPostSample(int) timingPostSample}. */
    public static void ntimingPostSample(long struct, int value) { memPutInt(struct + VkGpaSampleBeginInfoAMD.TIMINGPOSTSAMPLE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkGpaSampleBeginInfoAMD.PPERFCOUNTERS));
    }

    // -----------------------------------

    /** An array of {@link VkGpaSampleBeginInfoAMD} structs. */
    public static class Buffer extends StructBuffer<VkGpaSampleBeginInfoAMD, Buffer> implements NativeResource {

        private static final VkGpaSampleBeginInfoAMD ELEMENT_FACTORY = VkGpaSampleBeginInfoAMD.create(-1L);

        /**
         * Creates a new {@code VkGpaSampleBeginInfoAMD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGpaSampleBeginInfoAMD#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkGpaSampleBeginInfoAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGpaSampleBeginInfoAMD.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGpaSampleBeginInfoAMD.npNext(address()); }
        /** @return the value of the {@code sampleType} field. */
        @NativeType("VkGpaSampleTypeAMD")
        public int sampleType() { return VkGpaSampleBeginInfoAMD.nsampleType(address()); }
        /** @return the value of the {@code sampleInternalOperations} field. */
        @NativeType("VkBool32")
        public boolean sampleInternalOperations() { return VkGpaSampleBeginInfoAMD.nsampleInternalOperations(address()) != 0; }
        /** @return the value of the {@code cacheFlushOnCounterCollection} field. */
        @NativeType("VkBool32")
        public boolean cacheFlushOnCounterCollection() { return VkGpaSampleBeginInfoAMD.ncacheFlushOnCounterCollection(address()) != 0; }
        /** @return the value of the {@code sqShaderMaskEnable} field. */
        @NativeType("VkBool32")
        public boolean sqShaderMaskEnable() { return VkGpaSampleBeginInfoAMD.nsqShaderMaskEnable(address()) != 0; }
        /** @return the value of the {@code sqShaderMask} field. */
        @NativeType("VkGpaSqShaderStageFlagsAMD")
        public int sqShaderMask() { return VkGpaSampleBeginInfoAMD.nsqShaderMask(address()); }
        /** @return the value of the {@code perfCounterCount} field. */
        @NativeType("uint32_t")
        public int perfCounterCount() { return VkGpaSampleBeginInfoAMD.nperfCounterCount(address()); }
        /** @return a {@link VkGpaPerfCounterAMD.Buffer} view of the struct array pointed to by the {@code pPerfCounters} field. */
        @NativeType("VkGpaPerfCounterAMD const *")
        public VkGpaPerfCounterAMD.Buffer pPerfCounters() { return VkGpaSampleBeginInfoAMD.npPerfCounters(address()); }
        /** @return the value of the {@code streamingPerfTraceSampleInterval} field. */
        @NativeType("uint32_t")
        public int streamingPerfTraceSampleInterval() { return VkGpaSampleBeginInfoAMD.nstreamingPerfTraceSampleInterval(address()); }
        /** @return the value of the {@code perfCounterDeviceMemoryLimit} field. */
        @NativeType("VkDeviceSize")
        public long perfCounterDeviceMemoryLimit() { return VkGpaSampleBeginInfoAMD.nperfCounterDeviceMemoryLimit(address()); }
        /** @return the value of the {@code sqThreadTraceEnable} field. */
        @NativeType("VkBool32")
        public boolean sqThreadTraceEnable() { return VkGpaSampleBeginInfoAMD.nsqThreadTraceEnable(address()) != 0; }
        /** @return the value of the {@code sqThreadTraceSuppressInstructionTokens} field. */
        @NativeType("VkBool32")
        public boolean sqThreadTraceSuppressInstructionTokens() { return VkGpaSampleBeginInfoAMD.nsqThreadTraceSuppressInstructionTokens(address()) != 0; }
        /** @return the value of the {@code sqThreadTraceDeviceMemoryLimit} field. */
        @NativeType("VkDeviceSize")
        public long sqThreadTraceDeviceMemoryLimit() { return VkGpaSampleBeginInfoAMD.nsqThreadTraceDeviceMemoryLimit(address()); }
        /** @return the value of the {@code timingPreSample} field. */
        @NativeType("VkPipelineStageFlags")
        public int timingPreSample() { return VkGpaSampleBeginInfoAMD.ntimingPreSample(address()); }
        /** @return the value of the {@code timingPostSample} field. */
        @NativeType("VkPipelineStageFlags")
        public int timingPostSample() { return VkGpaSampleBeginInfoAMD.ntimingPostSample(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkGpaSampleBeginInfoAMD.Buffer sType(@NativeType("VkStructureType") int value) { VkGpaSampleBeginInfoAMD.nsType(address(), value); return this; }
        /** Sets the {@link AMDGpaInterface#VK_STRUCTURE_TYPE_GPA_SAMPLE_BEGIN_INFO_AMD STRUCTURE_TYPE_GPA_SAMPLE_BEGIN_INFO_AMD} value to the {@code sType} field. */
        public VkGpaSampleBeginInfoAMD.Buffer sType$Default() { return sType(AMDGpaInterface.VK_STRUCTURE_TYPE_GPA_SAMPLE_BEGIN_INFO_AMD); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkGpaSampleBeginInfoAMD.Buffer pNext(@NativeType("void const *") long value) { VkGpaSampleBeginInfoAMD.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code sampleType} field. */
        public VkGpaSampleBeginInfoAMD.Buffer sampleType(@NativeType("VkGpaSampleTypeAMD") int value) { VkGpaSampleBeginInfoAMD.nsampleType(address(), value); return this; }
        /** Sets the specified value to the {@code sampleInternalOperations} field. */
        public VkGpaSampleBeginInfoAMD.Buffer sampleInternalOperations(@NativeType("VkBool32") boolean value) { VkGpaSampleBeginInfoAMD.nsampleInternalOperations(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code cacheFlushOnCounterCollection} field. */
        public VkGpaSampleBeginInfoAMD.Buffer cacheFlushOnCounterCollection(@NativeType("VkBool32") boolean value) { VkGpaSampleBeginInfoAMD.ncacheFlushOnCounterCollection(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sqShaderMaskEnable} field. */
        public VkGpaSampleBeginInfoAMD.Buffer sqShaderMaskEnable(@NativeType("VkBool32") boolean value) { VkGpaSampleBeginInfoAMD.nsqShaderMaskEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sqShaderMask} field. */
        public VkGpaSampleBeginInfoAMD.Buffer sqShaderMask(@NativeType("VkGpaSqShaderStageFlagsAMD") int value) { VkGpaSampleBeginInfoAMD.nsqShaderMask(address(), value); return this; }
        /** Sets the address of the specified {@link VkGpaPerfCounterAMD.Buffer} to the {@code pPerfCounters} field. */
        public VkGpaSampleBeginInfoAMD.Buffer pPerfCounters(@NativeType("VkGpaPerfCounterAMD const *") VkGpaPerfCounterAMD.Buffer value) { VkGpaSampleBeginInfoAMD.npPerfCounters(address(), value); return this; }
        /** Sets the specified value to the {@code streamingPerfTraceSampleInterval} field. */
        public VkGpaSampleBeginInfoAMD.Buffer streamingPerfTraceSampleInterval(@NativeType("uint32_t") int value) { VkGpaSampleBeginInfoAMD.nstreamingPerfTraceSampleInterval(address(), value); return this; }
        /** Sets the specified value to the {@code perfCounterDeviceMemoryLimit} field. */
        public VkGpaSampleBeginInfoAMD.Buffer perfCounterDeviceMemoryLimit(@NativeType("VkDeviceSize") long value) { VkGpaSampleBeginInfoAMD.nperfCounterDeviceMemoryLimit(address(), value); return this; }
        /** Sets the specified value to the {@code sqThreadTraceEnable} field. */
        public VkGpaSampleBeginInfoAMD.Buffer sqThreadTraceEnable(@NativeType("VkBool32") boolean value) { VkGpaSampleBeginInfoAMD.nsqThreadTraceEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sqThreadTraceSuppressInstructionTokens} field. */
        public VkGpaSampleBeginInfoAMD.Buffer sqThreadTraceSuppressInstructionTokens(@NativeType("VkBool32") boolean value) { VkGpaSampleBeginInfoAMD.nsqThreadTraceSuppressInstructionTokens(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sqThreadTraceDeviceMemoryLimit} field. */
        public VkGpaSampleBeginInfoAMD.Buffer sqThreadTraceDeviceMemoryLimit(@NativeType("VkDeviceSize") long value) { VkGpaSampleBeginInfoAMD.nsqThreadTraceDeviceMemoryLimit(address(), value); return this; }
        /** Sets the specified value to the {@code timingPreSample} field. */
        public VkGpaSampleBeginInfoAMD.Buffer timingPreSample(@NativeType("VkPipelineStageFlags") int value) { VkGpaSampleBeginInfoAMD.ntimingPreSample(address(), value); return this; }
        /** Sets the specified value to the {@code timingPostSample} field. */
        public VkGpaSampleBeginInfoAMD.Buffer timingPostSample(@NativeType("VkPipelineStageFlags") int value) { VkGpaSampleBeginInfoAMD.ntimingPostSample(address(), value); return this; }

    }

}