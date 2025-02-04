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
 * struct VkRayTracingPipelineCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineCreateFlags flags;
 *     uint32_t stageCount;
 *     {@link VkPipelineShaderStageCreateInfo VkPipelineShaderStageCreateInfo} const * pStages;
 *     uint32_t groupCount;
 *     {@link VkRayTracingShaderGroupCreateInfoKHR VkRayTracingShaderGroupCreateInfoKHR} const * pGroups;
 *     uint32_t maxPipelineRayRecursionDepth;
 *     {@link VkPipelineLibraryCreateInfoKHR VkPipelineLibraryCreateInfoKHR} const * pLibraryInfo;
 *     {@link VkRayTracingPipelineInterfaceCreateInfoKHR VkRayTracingPipelineInterfaceCreateInfoKHR} const * pLibraryInterface;
 *     {@link VkPipelineDynamicStateCreateInfo VkPipelineDynamicStateCreateInfo} const * pDynamicState;
 *     VkPipelineLayout layout;
 *     VkPipeline basePipelineHandle;
 *     int32_t basePipelineIndex;
 * }}</pre>
 */
public class VkRayTracingPipelineCreateInfoKHR extends Struct<VkRayTracingPipelineCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        STAGECOUNT,
        PSTAGES,
        GROUPCOUNT,
        PGROUPS,
        MAXPIPELINERAYRECURSIONDEPTH,
        PLIBRARYINFO,
        PLIBRARYINTERFACE,
        PDYNAMICSTATE,
        LAYOUT,
        BASEPIPELINEHANDLE,
        BASEPIPELINEINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        STAGECOUNT = layout.offsetof(3);
        PSTAGES = layout.offsetof(4);
        GROUPCOUNT = layout.offsetof(5);
        PGROUPS = layout.offsetof(6);
        MAXPIPELINERAYRECURSIONDEPTH = layout.offsetof(7);
        PLIBRARYINFO = layout.offsetof(8);
        PLIBRARYINTERFACE = layout.offsetof(9);
        PDYNAMICSTATE = layout.offsetof(10);
        LAYOUT = layout.offsetof(11);
        BASEPIPELINEHANDLE = layout.offsetof(12);
        BASEPIPELINEINDEX = layout.offsetof(13);
    }

    protected VkRayTracingPipelineCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRayTracingPipelineCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkRayTracingPipelineCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkRayTracingPipelineCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRayTracingPipelineCreateInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkPipelineCreateFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code stageCount} field. */
    @NativeType("uint32_t")
    public int stageCount() { return nstageCount(address()); }
    /** @return a {@link VkPipelineShaderStageCreateInfo.Buffer} view of the struct array pointed to by the {@code pStages} field. */
    @NativeType("VkPipelineShaderStageCreateInfo const *")
    public VkPipelineShaderStageCreateInfo.@Nullable Buffer pStages() { return npStages(address()); }
    /** @return the value of the {@code groupCount} field. */
    @NativeType("uint32_t")
    public int groupCount() { return ngroupCount(address()); }
    /** @return a {@link VkRayTracingShaderGroupCreateInfoKHR.Buffer} view of the struct array pointed to by the {@code pGroups} field. */
    @NativeType("VkRayTracingShaderGroupCreateInfoKHR const *")
    public VkRayTracingShaderGroupCreateInfoKHR.@Nullable Buffer pGroups() { return npGroups(address()); }
    /** @return the value of the {@code maxPipelineRayRecursionDepth} field. */
    @NativeType("uint32_t")
    public int maxPipelineRayRecursionDepth() { return nmaxPipelineRayRecursionDepth(address()); }
    /** @return a {@link VkPipelineLibraryCreateInfoKHR} view of the struct pointed to by the {@code pLibraryInfo} field. */
    @NativeType("VkPipelineLibraryCreateInfoKHR const *")
    public @Nullable VkPipelineLibraryCreateInfoKHR pLibraryInfo() { return npLibraryInfo(address()); }
    /** @return a {@link VkRayTracingPipelineInterfaceCreateInfoKHR} view of the struct pointed to by the {@code pLibraryInterface} field. */
    @NativeType("VkRayTracingPipelineInterfaceCreateInfoKHR const *")
    public @Nullable VkRayTracingPipelineInterfaceCreateInfoKHR pLibraryInterface() { return npLibraryInterface(address()); }
    /** @return a {@link VkPipelineDynamicStateCreateInfo} view of the struct pointed to by the {@code pDynamicState} field. */
    @NativeType("VkPipelineDynamicStateCreateInfo const *")
    public @Nullable VkPipelineDynamicStateCreateInfo pDynamicState() { return npDynamicState(address()); }
    /** @return the value of the {@code layout} field. */
    @NativeType("VkPipelineLayout")
    public long layout() { return nlayout(address()); }
    /** @return the value of the {@code basePipelineHandle} field. */
    @NativeType("VkPipeline")
    public long basePipelineHandle() { return nbasePipelineHandle(address()); }
    /** @return the value of the {@code basePipelineIndex} field. */
    @NativeType("int32_t")
    public int basePipelineIndex() { return nbasePipelineIndex(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRayTracingPipelineCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRRayTracingPipeline#VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR} value to the {@code sType} field. */
    public VkRayTracingPipelineCreateInfoKHR sType$Default() { return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRayTracingPipelineCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPipelineBinaryInfoKHR} value to the {@code pNext} chain. */
    public VkRayTracingPipelineCreateInfoKHR pNext(VkPipelineBinaryInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreateFlags2CreateInfo} value to the {@code pNext} chain. */
    public VkRayTracingPipelineCreateInfoKHR pNext(VkPipelineCreateFlags2CreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreateFlags2CreateInfoKHR} value to the {@code pNext} chain. */
    public VkRayTracingPipelineCreateInfoKHR pNext(VkPipelineCreateFlags2CreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfo} value to the {@code pNext} chain. */
    public VkRayTracingPipelineCreateInfoKHR pNext(VkPipelineCreationFeedbackCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
    public VkRayTracingPipelineCreateInfoKHR pNext(VkPipelineCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineRobustnessCreateInfo} value to the {@code pNext} chain. */
    public VkRayTracingPipelineCreateInfoKHR pNext(VkPipelineRobustnessCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineRobustnessCreateInfoEXT} value to the {@code pNext} chain. */
    public VkRayTracingPipelineCreateInfoKHR pNext(VkPipelineRobustnessCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV} value to the {@code pNext} chain. */
    public VkRayTracingPipelineCreateInfoKHR pNext(VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkRayTracingPipelineCreateInfoKHR flags(@NativeType("VkPipelineCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineShaderStageCreateInfo.Buffer} to the {@code pStages} field. */
    public VkRayTracingPipelineCreateInfoKHR pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.@Nullable Buffer value) { npStages(address(), value); return this; }
    /** Sets the address of the specified {@link VkRayTracingShaderGroupCreateInfoKHR.Buffer} to the {@code pGroups} field. */
    public VkRayTracingPipelineCreateInfoKHR pGroups(@NativeType("VkRayTracingShaderGroupCreateInfoKHR const *") VkRayTracingShaderGroupCreateInfoKHR.@Nullable Buffer value) { npGroups(address(), value); return this; }
    /** Sets the specified value to the {@code maxPipelineRayRecursionDepth} field. */
    public VkRayTracingPipelineCreateInfoKHR maxPipelineRayRecursionDepth(@NativeType("uint32_t") int value) { nmaxPipelineRayRecursionDepth(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineLibraryCreateInfoKHR} to the {@code pLibraryInfo} field. */
    public VkRayTracingPipelineCreateInfoKHR pLibraryInfo(@Nullable @NativeType("VkPipelineLibraryCreateInfoKHR const *") VkPipelineLibraryCreateInfoKHR value) { npLibraryInfo(address(), value); return this; }
    /** Sets the address of the specified {@link VkRayTracingPipelineInterfaceCreateInfoKHR} to the {@code pLibraryInterface} field. */
    public VkRayTracingPipelineCreateInfoKHR pLibraryInterface(@Nullable @NativeType("VkRayTracingPipelineInterfaceCreateInfoKHR const *") VkRayTracingPipelineInterfaceCreateInfoKHR value) { npLibraryInterface(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineDynamicStateCreateInfo} to the {@code pDynamicState} field. */
    public VkRayTracingPipelineCreateInfoKHR pDynamicState(@Nullable @NativeType("VkPipelineDynamicStateCreateInfo const *") VkPipelineDynamicStateCreateInfo value) { npDynamicState(address(), value); return this; }
    /** Sets the specified value to the {@code layout} field. */
    public VkRayTracingPipelineCreateInfoKHR layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@code basePipelineHandle} field. */
    public VkRayTracingPipelineCreateInfoKHR basePipelineHandle(@NativeType("VkPipeline") long value) { nbasePipelineHandle(address(), value); return this; }
    /** Sets the specified value to the {@code basePipelineIndex} field. */
    public VkRayTracingPipelineCreateInfoKHR basePipelineIndex(@NativeType("int32_t") int value) { nbasePipelineIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRayTracingPipelineCreateInfoKHR set(
        int sType,
        long pNext,
        int flags,
        VkPipelineShaderStageCreateInfo.@Nullable Buffer pStages,
        VkRayTracingShaderGroupCreateInfoKHR.@Nullable Buffer pGroups,
        int maxPipelineRayRecursionDepth,
        @Nullable VkPipelineLibraryCreateInfoKHR pLibraryInfo,
        @Nullable VkRayTracingPipelineInterfaceCreateInfoKHR pLibraryInterface,
        @Nullable VkPipelineDynamicStateCreateInfo pDynamicState,
        long layout,
        long basePipelineHandle,
        int basePipelineIndex
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pStages(pStages);
        pGroups(pGroups);
        maxPipelineRayRecursionDepth(maxPipelineRayRecursionDepth);
        pLibraryInfo(pLibraryInfo);
        pLibraryInterface(pLibraryInterface);
        pDynamicState(pDynamicState);
        layout(layout);
        basePipelineHandle(basePipelineHandle);
        basePipelineIndex(basePipelineIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRayTracingPipelineCreateInfoKHR set(VkRayTracingPipelineCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRayTracingPipelineCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRayTracingPipelineCreateInfoKHR malloc() {
        return new VkRayTracingPipelineCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRayTracingPipelineCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRayTracingPipelineCreateInfoKHR calloc() {
        return new VkRayTracingPipelineCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRayTracingPipelineCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkRayTracingPipelineCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRayTracingPipelineCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkRayTracingPipelineCreateInfoKHR} instance for the specified memory address. */
    public static VkRayTracingPipelineCreateInfoKHR create(long address) {
        return new VkRayTracingPipelineCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRayTracingPipelineCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkRayTracingPipelineCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRayTracingPipelineCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRayTracingPipelineCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRayTracingPipelineCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRayTracingPipelineCreateInfoKHR malloc(MemoryStack stack) {
        return new VkRayTracingPipelineCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRayTracingPipelineCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRayTracingPipelineCreateInfoKHR calloc(MemoryStack stack) {
        return new VkRayTracingPipelineCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRayTracingPipelineCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRayTracingPipelineCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkRayTracingPipelineCreateInfoKHR.FLAGS); }
    /** Unsafe version of {@link #stageCount}. */
    public static int nstageCount(long struct) { return memGetInt(struct + VkRayTracingPipelineCreateInfoKHR.STAGECOUNT); }
    /** Unsafe version of {@link #pStages}. */
    public static VkPipelineShaderStageCreateInfo.@Nullable Buffer npStages(long struct) { return VkPipelineShaderStageCreateInfo.createSafe(memGetAddress(struct + VkRayTracingPipelineCreateInfoKHR.PSTAGES), nstageCount(struct)); }
    /** Unsafe version of {@link #groupCount}. */
    public static int ngroupCount(long struct) { return memGetInt(struct + VkRayTracingPipelineCreateInfoKHR.GROUPCOUNT); }
    /** Unsafe version of {@link #pGroups}. */
    public static VkRayTracingShaderGroupCreateInfoKHR.@Nullable Buffer npGroups(long struct) { return VkRayTracingShaderGroupCreateInfoKHR.createSafe(memGetAddress(struct + VkRayTracingPipelineCreateInfoKHR.PGROUPS), ngroupCount(struct)); }
    /** Unsafe version of {@link #maxPipelineRayRecursionDepth}. */
    public static int nmaxPipelineRayRecursionDepth(long struct) { return memGetInt(struct + VkRayTracingPipelineCreateInfoKHR.MAXPIPELINERAYRECURSIONDEPTH); }
    /** Unsafe version of {@link #pLibraryInfo}. */
    public static @Nullable VkPipelineLibraryCreateInfoKHR npLibraryInfo(long struct) { return VkPipelineLibraryCreateInfoKHR.createSafe(memGetAddress(struct + VkRayTracingPipelineCreateInfoKHR.PLIBRARYINFO)); }
    /** Unsafe version of {@link #pLibraryInterface}. */
    public static @Nullable VkRayTracingPipelineInterfaceCreateInfoKHR npLibraryInterface(long struct) { return VkRayTracingPipelineInterfaceCreateInfoKHR.createSafe(memGetAddress(struct + VkRayTracingPipelineCreateInfoKHR.PLIBRARYINTERFACE)); }
    /** Unsafe version of {@link #pDynamicState}. */
    public static @Nullable VkPipelineDynamicStateCreateInfo npDynamicState(long struct) { return VkPipelineDynamicStateCreateInfo.createSafe(memGetAddress(struct + VkRayTracingPipelineCreateInfoKHR.PDYNAMICSTATE)); }
    /** Unsafe version of {@link #layout}. */
    public static long nlayout(long struct) { return memGetLong(struct + VkRayTracingPipelineCreateInfoKHR.LAYOUT); }
    /** Unsafe version of {@link #basePipelineHandle}. */
    public static long nbasePipelineHandle(long struct) { return memGetLong(struct + VkRayTracingPipelineCreateInfoKHR.BASEPIPELINEHANDLE); }
    /** Unsafe version of {@link #basePipelineIndex}. */
    public static int nbasePipelineIndex(long struct) { return memGetInt(struct + VkRayTracingPipelineCreateInfoKHR.BASEPIPELINEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRayTracingPipelineCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRayTracingPipelineCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkRayTracingPipelineCreateInfoKHR.FLAGS, value); }
    /** Sets the specified value to the {@code stageCount} field of the specified {@code struct}. */
    public static void nstageCount(long struct, int value) { memPutInt(struct + VkRayTracingPipelineCreateInfoKHR.STAGECOUNT, value); }
    /** Unsafe version of {@link #pStages(VkPipelineShaderStageCreateInfo.Buffer) pStages}. */
    public static void npStages(long struct, VkPipelineShaderStageCreateInfo.@Nullable Buffer value) { memPutAddress(struct + VkRayTracingPipelineCreateInfoKHR.PSTAGES, memAddressSafe(value)); nstageCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code groupCount} field of the specified {@code struct}. */
    public static void ngroupCount(long struct, int value) { memPutInt(struct + VkRayTracingPipelineCreateInfoKHR.GROUPCOUNT, value); }
    /** Unsafe version of {@link #pGroups(VkRayTracingShaderGroupCreateInfoKHR.Buffer) pGroups}. */
    public static void npGroups(long struct, VkRayTracingShaderGroupCreateInfoKHR.@Nullable Buffer value) { memPutAddress(struct + VkRayTracingPipelineCreateInfoKHR.PGROUPS, memAddressSafe(value)); ngroupCount(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #maxPipelineRayRecursionDepth(int) maxPipelineRayRecursionDepth}. */
    public static void nmaxPipelineRayRecursionDepth(long struct, int value) { memPutInt(struct + VkRayTracingPipelineCreateInfoKHR.MAXPIPELINERAYRECURSIONDEPTH, value); }
    /** Unsafe version of {@link #pLibraryInfo(VkPipelineLibraryCreateInfoKHR) pLibraryInfo}. */
    public static void npLibraryInfo(long struct, @Nullable VkPipelineLibraryCreateInfoKHR value) { memPutAddress(struct + VkRayTracingPipelineCreateInfoKHR.PLIBRARYINFO, memAddressSafe(value)); }
    /** Unsafe version of {@link #pLibraryInterface(VkRayTracingPipelineInterfaceCreateInfoKHR) pLibraryInterface}. */
    public static void npLibraryInterface(long struct, @Nullable VkRayTracingPipelineInterfaceCreateInfoKHR value) { memPutAddress(struct + VkRayTracingPipelineCreateInfoKHR.PLIBRARYINTERFACE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pDynamicState(VkPipelineDynamicStateCreateInfo) pDynamicState}. */
    public static void npDynamicState(long struct, @Nullable VkPipelineDynamicStateCreateInfo value) { memPutAddress(struct + VkRayTracingPipelineCreateInfoKHR.PDYNAMICSTATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #layout(long) layout}. */
    public static void nlayout(long struct, long value) { memPutLong(struct + VkRayTracingPipelineCreateInfoKHR.LAYOUT, value); }
    /** Unsafe version of {@link #basePipelineHandle(long) basePipelineHandle}. */
    public static void nbasePipelineHandle(long struct, long value) { memPutLong(struct + VkRayTracingPipelineCreateInfoKHR.BASEPIPELINEHANDLE, value); }
    /** Unsafe version of {@link #basePipelineIndex(int) basePipelineIndex}. */
    public static void nbasePipelineIndex(long struct, int value) { memPutInt(struct + VkRayTracingPipelineCreateInfoKHR.BASEPIPELINEINDEX, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int stageCount = nstageCount(struct);
        if (stageCount != 0) {
            long pStages = memGetAddress(struct + VkRayTracingPipelineCreateInfoKHR.PSTAGES);
            check(pStages);
            validate(pStages, stageCount, VkPipelineShaderStageCreateInfo.SIZEOF, VkPipelineShaderStageCreateInfo::validate);
        }
        if (ngroupCount(struct) != 0) {
            check(memGetAddress(struct + VkRayTracingPipelineCreateInfoKHR.PGROUPS));
        }
        long pLibraryInfo = memGetAddress(struct + VkRayTracingPipelineCreateInfoKHR.PLIBRARYINFO);
        if (pLibraryInfo != NULL) {
            VkPipelineLibraryCreateInfoKHR.validate(pLibraryInfo);
        }
        long pDynamicState = memGetAddress(struct + VkRayTracingPipelineCreateInfoKHR.PDYNAMICSTATE);
        if (pDynamicState != NULL) {
            VkPipelineDynamicStateCreateInfo.validate(pDynamicState);
        }
    }

    // -----------------------------------

    /** An array of {@link VkRayTracingPipelineCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkRayTracingPipelineCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkRayTracingPipelineCreateInfoKHR ELEMENT_FACTORY = VkRayTracingPipelineCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkRayTracingPipelineCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRayTracingPipelineCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRayTracingPipelineCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRayTracingPipelineCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRayTracingPipelineCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkPipelineCreateFlags")
        public int flags() { return VkRayTracingPipelineCreateInfoKHR.nflags(address()); }
        /** @return the value of the {@code stageCount} field. */
        @NativeType("uint32_t")
        public int stageCount() { return VkRayTracingPipelineCreateInfoKHR.nstageCount(address()); }
        /** @return a {@link VkPipelineShaderStageCreateInfo.Buffer} view of the struct array pointed to by the {@code pStages} field. */
        @NativeType("VkPipelineShaderStageCreateInfo const *")
        public VkPipelineShaderStageCreateInfo.@Nullable Buffer pStages() { return VkRayTracingPipelineCreateInfoKHR.npStages(address()); }
        /** @return the value of the {@code groupCount} field. */
        @NativeType("uint32_t")
        public int groupCount() { return VkRayTracingPipelineCreateInfoKHR.ngroupCount(address()); }
        /** @return a {@link VkRayTracingShaderGroupCreateInfoKHR.Buffer} view of the struct array pointed to by the {@code pGroups} field. */
        @NativeType("VkRayTracingShaderGroupCreateInfoKHR const *")
        public VkRayTracingShaderGroupCreateInfoKHR.@Nullable Buffer pGroups() { return VkRayTracingPipelineCreateInfoKHR.npGroups(address()); }
        /** @return the value of the {@code maxPipelineRayRecursionDepth} field. */
        @NativeType("uint32_t")
        public int maxPipelineRayRecursionDepth() { return VkRayTracingPipelineCreateInfoKHR.nmaxPipelineRayRecursionDepth(address()); }
        /** @return a {@link VkPipelineLibraryCreateInfoKHR} view of the struct pointed to by the {@code pLibraryInfo} field. */
        @NativeType("VkPipelineLibraryCreateInfoKHR const *")
        public @Nullable VkPipelineLibraryCreateInfoKHR pLibraryInfo() { return VkRayTracingPipelineCreateInfoKHR.npLibraryInfo(address()); }
        /** @return a {@link VkRayTracingPipelineInterfaceCreateInfoKHR} view of the struct pointed to by the {@code pLibraryInterface} field. */
        @NativeType("VkRayTracingPipelineInterfaceCreateInfoKHR const *")
        public @Nullable VkRayTracingPipelineInterfaceCreateInfoKHR pLibraryInterface() { return VkRayTracingPipelineCreateInfoKHR.npLibraryInterface(address()); }
        /** @return a {@link VkPipelineDynamicStateCreateInfo} view of the struct pointed to by the {@code pDynamicState} field. */
        @NativeType("VkPipelineDynamicStateCreateInfo const *")
        public @Nullable VkPipelineDynamicStateCreateInfo pDynamicState() { return VkRayTracingPipelineCreateInfoKHR.npDynamicState(address()); }
        /** @return the value of the {@code layout} field. */
        @NativeType("VkPipelineLayout")
        public long layout() { return VkRayTracingPipelineCreateInfoKHR.nlayout(address()); }
        /** @return the value of the {@code basePipelineHandle} field. */
        @NativeType("VkPipeline")
        public long basePipelineHandle() { return VkRayTracingPipelineCreateInfoKHR.nbasePipelineHandle(address()); }
        /** @return the value of the {@code basePipelineIndex} field. */
        @NativeType("int32_t")
        public int basePipelineIndex() { return VkRayTracingPipelineCreateInfoKHR.nbasePipelineIndex(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkRayTracingPipelineCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRRayTracingPipeline#VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR} value to the {@code sType} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer sType$Default() { return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkRayTracingPipelineCreateInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPipelineBinaryInfoKHR} value to the {@code pNext} chain. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pNext(VkPipelineBinaryInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreateFlags2CreateInfo} value to the {@code pNext} chain. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pNext(VkPipelineCreateFlags2CreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreateFlags2CreateInfoKHR} value to the {@code pNext} chain. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pNext(VkPipelineCreateFlags2CreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfo} value to the {@code pNext} chain. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pNext(VkPipelineCreationFeedbackCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pNext(VkPipelineCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineRobustnessCreateInfo} value to the {@code pNext} chain. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pNext(VkPipelineRobustnessCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineRobustnessCreateInfoEXT} value to the {@code pNext} chain. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pNext(VkPipelineRobustnessCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV} value to the {@code pNext} chain. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pNext(VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer flags(@NativeType("VkPipelineCreateFlags") int value) { VkRayTracingPipelineCreateInfoKHR.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineShaderStageCreateInfo.Buffer} to the {@code pStages} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.@Nullable Buffer value) { VkRayTracingPipelineCreateInfoKHR.npStages(address(), value); return this; }
        /** Sets the address of the specified {@link VkRayTracingShaderGroupCreateInfoKHR.Buffer} to the {@code pGroups} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pGroups(@NativeType("VkRayTracingShaderGroupCreateInfoKHR const *") VkRayTracingShaderGroupCreateInfoKHR.@Nullable Buffer value) { VkRayTracingPipelineCreateInfoKHR.npGroups(address(), value); return this; }
        /** Sets the specified value to the {@code maxPipelineRayRecursionDepth} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer maxPipelineRayRecursionDepth(@NativeType("uint32_t") int value) { VkRayTracingPipelineCreateInfoKHR.nmaxPipelineRayRecursionDepth(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineLibraryCreateInfoKHR} to the {@code pLibraryInfo} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pLibraryInfo(@Nullable @NativeType("VkPipelineLibraryCreateInfoKHR const *") VkPipelineLibraryCreateInfoKHR value) { VkRayTracingPipelineCreateInfoKHR.npLibraryInfo(address(), value); return this; }
        /** Sets the address of the specified {@link VkRayTracingPipelineInterfaceCreateInfoKHR} to the {@code pLibraryInterface} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pLibraryInterface(@Nullable @NativeType("VkRayTracingPipelineInterfaceCreateInfoKHR const *") VkRayTracingPipelineInterfaceCreateInfoKHR value) { VkRayTracingPipelineCreateInfoKHR.npLibraryInterface(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineDynamicStateCreateInfo} to the {@code pDynamicState} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer pDynamicState(@Nullable @NativeType("VkPipelineDynamicStateCreateInfo const *") VkPipelineDynamicStateCreateInfo value) { VkRayTracingPipelineCreateInfoKHR.npDynamicState(address(), value); return this; }
        /** Sets the specified value to the {@code layout} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkRayTracingPipelineCreateInfoKHR.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@code basePipelineHandle} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer basePipelineHandle(@NativeType("VkPipeline") long value) { VkRayTracingPipelineCreateInfoKHR.nbasePipelineHandle(address(), value); return this; }
        /** Sets the specified value to the {@code basePipelineIndex} field. */
        public VkRayTracingPipelineCreateInfoKHR.Buffer basePipelineIndex(@NativeType("int32_t") int value) { VkRayTracingPipelineCreateInfoKHR.nbasePipelineIndex(address(), value); return this; }

    }

}