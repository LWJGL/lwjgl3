/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying parameters of a newly created ray tracing pipeline.
 * 
 * <h5>Description</h5>
 * 
 * <p>The parameters {@code basePipelineHandle} and {@code basePipelineIndex} are described in more detail in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-pipeline-derivatives">Pipeline Derivatives</a>.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineIndex} is {@code -1}, {@code basePipelineHandle} <b>must</b> be a valid handle to a ray tracing {@code VkPipeline}</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineHandle} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code basePipelineIndex} <b>must</b> be a valid index into the calling command’s {@code pCreateInfos} parameter</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineIndex} is not {@code -1}, {@code basePipelineHandle} <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineHandle} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code basePipelineIndex} <b>must</b> be {@code -1}</li>
 * <li>The shader code for the entry points identified by {@code pStages}, and the rest of the state identified by this structure <b>must</b> adhere to the pipeline linking rules described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces">Shader Interfaces</a> chapter</li>
 * <li>{@code layout} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-pipelinelayout-consistency">consistent</a> with all shaders specified in {@code pStages}</li>
 * <li>The number of resources in {@code layout} accessible to each shader stage that is used by the pipeline <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxPerStageResources}</li>
 * <li>{@code flags} <b>must</b> not include {@link NVDeviceGeneratedCommands#VK_PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineCreationCacheControl">{@code pipelineCreationCacheControl}</a> feature is not enabled, {@code flags} <b>must</b> not include {@link VK13#VK_PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT} or {@link VK13#VK_PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT}</li>
 * <li>The {@code stage} member of at least one element of {@code pStages} <b>must</b> be {@link KHRRayTracingPipeline#VK_SHADER_STAGE_RAYGEN_BIT_KHR SHADER_STAGE_RAYGEN_BIT_KHR}</li>
 * <li>{@code flags} <b>must</b> not include {@link KHRPipelineLibrary#VK_PIPELINE_CREATE_LIBRARY_BIT_KHR PIPELINE_CREATE_LIBRARY_BIT_KHR}</li>
 * <li>{@code maxRecursionDepth} <b>must</b> be less than or equal to {@link VkPhysicalDeviceRayTracingPropertiesNV}{@code ::maxRecursionDepth}</li>
 * <li>{@code flags} <b>must</b> not include {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR}</li>
 * <li>{@code flags} <b>must</b> not include {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR}</li>
 * <li>{@code flags} <b>must</b> not include {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR}</li>
 * <li>{@code flags} <b>must</b> not include {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR}</li>
 * <li>{@code flags} <b>must</b> not include {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR}</li>
 * <li>{@code flags} <b>must</b> not include {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR}</li>
 * <li>{@code flags} <b>must</b> not include {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR}</li>
 * <li>{@code flags} <b>must</b> not include {@link NVRayTracingMotionBlur#VK_PIPELINE_CREATE_RAY_TRACING_ALLOW_MOTION_BIT_NV PIPELINE_CREATE_RAY_TRACING_ALLOW_MOTION_BIT_NV}</li>
 * <li>{@code flags} <b>must</b> not include both {@link NVRayTracing#VK_PIPELINE_CREATE_DEFER_COMPILE_BIT_NV PIPELINE_CREATE_DEFER_COMPILE_BIT_NV} and {@link VK13#VK_PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT} at the same time</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVRayTracing#VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkPipelineCreationFeedbackCreateInfo}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkPipelineCreateFlagBits} values</li>
 * <li>{@code pStages} <b>must</b> be a valid pointer to an array of {@code stageCount} valid {@link VkPipelineShaderStageCreateInfo} structures</li>
 * <li>{@code pGroups} <b>must</b> be a valid pointer to an array of {@code groupCount} valid {@link VkRayTracingShaderGroupCreateInfoNV} structures</li>
 * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
 * <li>{@code stageCount} <b>must</b> be greater than 0</li>
 * <li>{@code groupCount} <b>must</b> be greater than 0</li>
 * <li>Both of {@code basePipelineHandle}, and {@code layout} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPipelineShaderStageCreateInfo}, {@link VkRayTracingShaderGroupCreateInfoNV}, {@link NVRayTracing#vkCreateRayTracingPipelinesNV CreateRayTracingPipelinesNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRayTracingPipelineCreateInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineCreateFlags {@link #flags};
 *     uint32_t {@link #stageCount};
 *     {@link VkPipelineShaderStageCreateInfo VkPipelineShaderStageCreateInfo} const * {@link #pStages};
 *     uint32_t {@link #groupCount};
 *     {@link VkRayTracingShaderGroupCreateInfoNV VkRayTracingShaderGroupCreateInfoNV} const * {@link #pGroups};
 *     uint32_t {@link #maxRecursionDepth};
 *     VkPipelineLayout {@link #layout};
 *     VkPipeline {@link #basePipelineHandle};
 *     int32_t {@link #basePipelineIndex};
 * }</code></pre>
 */
public class VkRayTracingPipelineCreateInfoNV extends Struct implements NativeResource {

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
        MAXRECURSIONDEPTH,
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
        MAXRECURSIONDEPTH = layout.offsetof(7);
        LAYOUT = layout.offsetof(8);
        BASEPIPELINEHANDLE = layout.offsetof(9);
        BASEPIPELINEINDEX = layout.offsetof(10);
    }

    /**
     * Creates a {@code VkRayTracingPipelineCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRayTracingPipelineCreateInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkPipelineCreateFlagBits} specifying how the pipeline will be generated. */
    @NativeType("VkPipelineCreateFlags")
    public int flags() { return nflags(address()); }
    /** the number of entries in the {@code pStages} array. */
    @NativeType("uint32_t")
    public int stageCount() { return nstageCount(address()); }
    /** a pointer to an array of {@link VkPipelineShaderStageCreateInfo} structures specifying the set of the shader stages to be included in the ray tracing pipeline. */
    @NativeType("VkPipelineShaderStageCreateInfo const *")
    public VkPipelineShaderStageCreateInfo.Buffer pStages() { return npStages(address()); }
    /** the number of entries in the {@code pGroups} array. */
    @NativeType("uint32_t")
    public int groupCount() { return ngroupCount(address()); }
    /** a pointer to an array of {@link VkRayTracingShaderGroupCreateInfoNV} structures describing the set of the shader stages to be included in each shader group in the ray tracing pipeline. */
    @NativeType("VkRayTracingShaderGroupCreateInfoNV const *")
    public VkRayTracingShaderGroupCreateInfoNV.Buffer pGroups() { return npGroups(address()); }
    /** the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#ray-tracing-recursion-depth">maximum recursion depth</a> of shaders executed by this pipeline. */
    @NativeType("uint32_t")
    public int maxRecursionDepth() { return nmaxRecursionDepth(address()); }
    /** the description of binding locations used by both the pipeline and descriptor sets used with the pipeline. */
    @NativeType("VkPipelineLayout")
    public long layout() { return nlayout(address()); }
    /** a pipeline to derive from. */
    @NativeType("VkPipeline")
    public long basePipelineHandle() { return nbasePipelineHandle(address()); }
    /** an index into the {@code pCreateInfos} parameter to use as a pipeline to derive from. */
    @NativeType("int32_t")
    public int basePipelineIndex() { return nbasePipelineIndex(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkRayTracingPipelineCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV} value to the {@link #sType} field. */
    public VkRayTracingPipelineCreateInfoNV sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkRayTracingPipelineCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfo} value to the {@code pNext} chain. */
    public VkRayTracingPipelineCreateInfoNV pNext(VkPipelineCreationFeedbackCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
    public VkRayTracingPipelineCreateInfoNV pNext(VkPipelineCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkRayTracingPipelineCreateInfoNV flags(@NativeType("VkPipelineCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineShaderStageCreateInfo.Buffer} to the {@link #pStages} field. */
    public VkRayTracingPipelineCreateInfoNV pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.Buffer value) { npStages(address(), value); return this; }
    /** Sets the address of the specified {@link VkRayTracingShaderGroupCreateInfoNV.Buffer} to the {@link #pGroups} field. */
    public VkRayTracingPipelineCreateInfoNV pGroups(@NativeType("VkRayTracingShaderGroupCreateInfoNV const *") VkRayTracingShaderGroupCreateInfoNV.Buffer value) { npGroups(address(), value); return this; }
    /** Sets the specified value to the {@link #maxRecursionDepth} field. */
    public VkRayTracingPipelineCreateInfoNV maxRecursionDepth(@NativeType("uint32_t") int value) { nmaxRecursionDepth(address(), value); return this; }
    /** Sets the specified value to the {@link #layout} field. */
    public VkRayTracingPipelineCreateInfoNV layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@link #basePipelineHandle} field. */
    public VkRayTracingPipelineCreateInfoNV basePipelineHandle(@NativeType("VkPipeline") long value) { nbasePipelineHandle(address(), value); return this; }
    /** Sets the specified value to the {@link #basePipelineIndex} field. */
    public VkRayTracingPipelineCreateInfoNV basePipelineIndex(@NativeType("int32_t") int value) { nbasePipelineIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRayTracingPipelineCreateInfoNV set(
        int sType,
        long pNext,
        int flags,
        VkPipelineShaderStageCreateInfo.Buffer pStages,
        VkRayTracingShaderGroupCreateInfoNV.Buffer pGroups,
        int maxRecursionDepth,
        long layout,
        long basePipelineHandle,
        int basePipelineIndex
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pStages(pStages);
        pGroups(pGroups);
        maxRecursionDepth(maxRecursionDepth);
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
    public VkRayTracingPipelineCreateInfoNV set(VkRayTracingPipelineCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRayTracingPipelineCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRayTracingPipelineCreateInfoNV malloc() {
        return wrap(VkRayTracingPipelineCreateInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkRayTracingPipelineCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRayTracingPipelineCreateInfoNV calloc() {
        return wrap(VkRayTracingPipelineCreateInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkRayTracingPipelineCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkRayTracingPipelineCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkRayTracingPipelineCreateInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkRayTracingPipelineCreateInfoNV} instance for the specified memory address. */
    public static VkRayTracingPipelineCreateInfoNV create(long address) {
        return wrap(VkRayTracingPipelineCreateInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRayTracingPipelineCreateInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkRayTracingPipelineCreateInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineCreateInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineCreateInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkRayTracingPipelineCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineCreateInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRayTracingPipelineCreateInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRayTracingPipelineCreateInfoNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRayTracingPipelineCreateInfoNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRayTracingPipelineCreateInfoNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRayTracingPipelineCreateInfoNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRayTracingPipelineCreateInfoNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRayTracingPipelineCreateInfoNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRayTracingPipelineCreateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRayTracingPipelineCreateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkRayTracingPipelineCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRayTracingPipelineCreateInfoNV malloc(MemoryStack stack) {
        return wrap(VkRayTracingPipelineCreateInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkRayTracingPipelineCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRayTracingPipelineCreateInfoNV calloc(MemoryStack stack) {
        return wrap(VkRayTracingPipelineCreateInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRayTracingPipelineCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkRayTracingPipelineCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRayTracingPipelineCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkRayTracingPipelineCreateInfoNV.FLAGS); }
    /** Unsafe version of {@link #stageCount}. */
    public static int nstageCount(long struct) { return UNSAFE.getInt(null, struct + VkRayTracingPipelineCreateInfoNV.STAGECOUNT); }
    /** Unsafe version of {@link #pStages}. */
    public static VkPipelineShaderStageCreateInfo.Buffer npStages(long struct) { return VkPipelineShaderStageCreateInfo.create(memGetAddress(struct + VkRayTracingPipelineCreateInfoNV.PSTAGES), nstageCount(struct)); }
    /** Unsafe version of {@link #groupCount}. */
    public static int ngroupCount(long struct) { return UNSAFE.getInt(null, struct + VkRayTracingPipelineCreateInfoNV.GROUPCOUNT); }
    /** Unsafe version of {@link #pGroups}. */
    public static VkRayTracingShaderGroupCreateInfoNV.Buffer npGroups(long struct) { return VkRayTracingShaderGroupCreateInfoNV.create(memGetAddress(struct + VkRayTracingPipelineCreateInfoNV.PGROUPS), ngroupCount(struct)); }
    /** Unsafe version of {@link #maxRecursionDepth}. */
    public static int nmaxRecursionDepth(long struct) { return UNSAFE.getInt(null, struct + VkRayTracingPipelineCreateInfoNV.MAXRECURSIONDEPTH); }
    /** Unsafe version of {@link #layout}. */
    public static long nlayout(long struct) { return UNSAFE.getLong(null, struct + VkRayTracingPipelineCreateInfoNV.LAYOUT); }
    /** Unsafe version of {@link #basePipelineHandle}. */
    public static long nbasePipelineHandle(long struct) { return UNSAFE.getLong(null, struct + VkRayTracingPipelineCreateInfoNV.BASEPIPELINEHANDLE); }
    /** Unsafe version of {@link #basePipelineIndex}. */
    public static int nbasePipelineIndex(long struct) { return UNSAFE.getInt(null, struct + VkRayTracingPipelineCreateInfoNV.BASEPIPELINEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkRayTracingPipelineCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRayTracingPipelineCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkRayTracingPipelineCreateInfoNV.FLAGS, value); }
    /** Sets the specified value to the {@code stageCount} field of the specified {@code struct}. */
    public static void nstageCount(long struct, int value) { UNSAFE.putInt(null, struct + VkRayTracingPipelineCreateInfoNV.STAGECOUNT, value); }
    /** Unsafe version of {@link #pStages(VkPipelineShaderStageCreateInfo.Buffer) pStages}. */
    public static void npStages(long struct, VkPipelineShaderStageCreateInfo.Buffer value) { memPutAddress(struct + VkRayTracingPipelineCreateInfoNV.PSTAGES, value.address()); nstageCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code groupCount} field of the specified {@code struct}. */
    public static void ngroupCount(long struct, int value) { UNSAFE.putInt(null, struct + VkRayTracingPipelineCreateInfoNV.GROUPCOUNT, value); }
    /** Unsafe version of {@link #pGroups(VkRayTracingShaderGroupCreateInfoNV.Buffer) pGroups}. */
    public static void npGroups(long struct, VkRayTracingShaderGroupCreateInfoNV.Buffer value) { memPutAddress(struct + VkRayTracingPipelineCreateInfoNV.PGROUPS, value.address()); ngroupCount(struct, value.remaining()); }
    /** Unsafe version of {@link #maxRecursionDepth(int) maxRecursionDepth}. */
    public static void nmaxRecursionDepth(long struct, int value) { UNSAFE.putInt(null, struct + VkRayTracingPipelineCreateInfoNV.MAXRECURSIONDEPTH, value); }
    /** Unsafe version of {@link #layout(long) layout}. */
    public static void nlayout(long struct, long value) { UNSAFE.putLong(null, struct + VkRayTracingPipelineCreateInfoNV.LAYOUT, value); }
    /** Unsafe version of {@link #basePipelineHandle(long) basePipelineHandle}. */
    public static void nbasePipelineHandle(long struct, long value) { UNSAFE.putLong(null, struct + VkRayTracingPipelineCreateInfoNV.BASEPIPELINEHANDLE, value); }
    /** Unsafe version of {@link #basePipelineIndex(int) basePipelineIndex}. */
    public static void nbasePipelineIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkRayTracingPipelineCreateInfoNV.BASEPIPELINEINDEX, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int stageCount = nstageCount(struct);
        long pStages = memGetAddress(struct + VkRayTracingPipelineCreateInfoNV.PSTAGES);
        check(pStages);
        validate(pStages, stageCount, VkPipelineShaderStageCreateInfo.SIZEOF, VkPipelineShaderStageCreateInfo::validate);
        check(memGetAddress(struct + VkRayTracingPipelineCreateInfoNV.PGROUPS));
    }

    // -----------------------------------

    /** An array of {@link VkRayTracingPipelineCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkRayTracingPipelineCreateInfoNV, Buffer> implements NativeResource {

        private static final VkRayTracingPipelineCreateInfoNV ELEMENT_FACTORY = VkRayTracingPipelineCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkRayTracingPipelineCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRayTracingPipelineCreateInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkRayTracingPipelineCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkRayTracingPipelineCreateInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRayTracingPipelineCreateInfoNV.nsType(address()); }
        /** @return the value of the {@link VkRayTracingPipelineCreateInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRayTracingPipelineCreateInfoNV.npNext(address()); }
        /** @return the value of the {@link VkRayTracingPipelineCreateInfoNV#flags} field. */
        @NativeType("VkPipelineCreateFlags")
        public int flags() { return VkRayTracingPipelineCreateInfoNV.nflags(address()); }
        /** @return the value of the {@link VkRayTracingPipelineCreateInfoNV#stageCount} field. */
        @NativeType("uint32_t")
        public int stageCount() { return VkRayTracingPipelineCreateInfoNV.nstageCount(address()); }
        /** @return a {@link VkPipelineShaderStageCreateInfo.Buffer} view of the struct array pointed to by the {@link VkRayTracingPipelineCreateInfoNV#pStages} field. */
        @NativeType("VkPipelineShaderStageCreateInfo const *")
        public VkPipelineShaderStageCreateInfo.Buffer pStages() { return VkRayTracingPipelineCreateInfoNV.npStages(address()); }
        /** @return the value of the {@link VkRayTracingPipelineCreateInfoNV#groupCount} field. */
        @NativeType("uint32_t")
        public int groupCount() { return VkRayTracingPipelineCreateInfoNV.ngroupCount(address()); }
        /** @return a {@link VkRayTracingShaderGroupCreateInfoNV.Buffer} view of the struct array pointed to by the {@link VkRayTracingPipelineCreateInfoNV#pGroups} field. */
        @NativeType("VkRayTracingShaderGroupCreateInfoNV const *")
        public VkRayTracingShaderGroupCreateInfoNV.Buffer pGroups() { return VkRayTracingPipelineCreateInfoNV.npGroups(address()); }
        /** @return the value of the {@link VkRayTracingPipelineCreateInfoNV#maxRecursionDepth} field. */
        @NativeType("uint32_t")
        public int maxRecursionDepth() { return VkRayTracingPipelineCreateInfoNV.nmaxRecursionDepth(address()); }
        /** @return the value of the {@link VkRayTracingPipelineCreateInfoNV#layout} field. */
        @NativeType("VkPipelineLayout")
        public long layout() { return VkRayTracingPipelineCreateInfoNV.nlayout(address()); }
        /** @return the value of the {@link VkRayTracingPipelineCreateInfoNV#basePipelineHandle} field. */
        @NativeType("VkPipeline")
        public long basePipelineHandle() { return VkRayTracingPipelineCreateInfoNV.nbasePipelineHandle(address()); }
        /** @return the value of the {@link VkRayTracingPipelineCreateInfoNV#basePipelineIndex} field. */
        @NativeType("int32_t")
        public int basePipelineIndex() { return VkRayTracingPipelineCreateInfoNV.nbasePipelineIndex(address()); }

        /** Sets the specified value to the {@link VkRayTracingPipelineCreateInfoNV#sType} field. */
        public VkRayTracingPipelineCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkRayTracingPipelineCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV} value to the {@link VkRayTracingPipelineCreateInfoNV#sType} field. */
        public VkRayTracingPipelineCreateInfoNV.Buffer sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV); }
        /** Sets the specified value to the {@link VkRayTracingPipelineCreateInfoNV#pNext} field. */
        public VkRayTracingPipelineCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkRayTracingPipelineCreateInfoNV.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfo} value to the {@code pNext} chain. */
        public VkRayTracingPipelineCreateInfoNV.Buffer pNext(VkPipelineCreationFeedbackCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
        public VkRayTracingPipelineCreateInfoNV.Buffer pNext(VkPipelineCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkRayTracingPipelineCreateInfoNV#flags} field. */
        public VkRayTracingPipelineCreateInfoNV.Buffer flags(@NativeType("VkPipelineCreateFlags") int value) { VkRayTracingPipelineCreateInfoNV.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineShaderStageCreateInfo.Buffer} to the {@link VkRayTracingPipelineCreateInfoNV#pStages} field. */
        public VkRayTracingPipelineCreateInfoNV.Buffer pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.Buffer value) { VkRayTracingPipelineCreateInfoNV.npStages(address(), value); return this; }
        /** Sets the address of the specified {@link VkRayTracingShaderGroupCreateInfoNV.Buffer} to the {@link VkRayTracingPipelineCreateInfoNV#pGroups} field. */
        public VkRayTracingPipelineCreateInfoNV.Buffer pGroups(@NativeType("VkRayTracingShaderGroupCreateInfoNV const *") VkRayTracingShaderGroupCreateInfoNV.Buffer value) { VkRayTracingPipelineCreateInfoNV.npGroups(address(), value); return this; }
        /** Sets the specified value to the {@link VkRayTracingPipelineCreateInfoNV#maxRecursionDepth} field. */
        public VkRayTracingPipelineCreateInfoNV.Buffer maxRecursionDepth(@NativeType("uint32_t") int value) { VkRayTracingPipelineCreateInfoNV.nmaxRecursionDepth(address(), value); return this; }
        /** Sets the specified value to the {@link VkRayTracingPipelineCreateInfoNV#layout} field. */
        public VkRayTracingPipelineCreateInfoNV.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkRayTracingPipelineCreateInfoNV.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkRayTracingPipelineCreateInfoNV#basePipelineHandle} field. */
        public VkRayTracingPipelineCreateInfoNV.Buffer basePipelineHandle(@NativeType("VkPipeline") long value) { VkRayTracingPipelineCreateInfoNV.nbasePipelineHandle(address(), value); return this; }
        /** Sets the specified value to the {@link VkRayTracingPipelineCreateInfoNV#basePipelineIndex} field. */
        public VkRayTracingPipelineCreateInfoNV.Buffer basePipelineIndex(@NativeType("int32_t") int value) { VkRayTracingPipelineCreateInfoNV.nbasePipelineIndex(address(), value); return this; }

    }

}