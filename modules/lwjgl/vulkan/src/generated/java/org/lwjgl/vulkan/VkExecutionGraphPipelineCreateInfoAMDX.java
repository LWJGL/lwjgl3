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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying parameters of a newly created execution graph pipeline.
 * 
 * <h5>Description</h5>
 * 
 * <p>The parameters {@code basePipelineHandle} and {@code basePipelineIndex} are described in more detail in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-pipeline-derivatives">Pipeline Derivatives</a>.</p>
 * 
 * <p>Each shader stage provided when creating an execution graph pipeline (including those in libraries) is associated with a name and an index, determined by the inclusion or omission of a {@link VkPipelineShaderStageNodeCreateInfoAMDX} structure in its {@code pNext} chain.</p>
 * 
 * <p>In addition to the shader name and index, an internal "node index" is also generated for each node, which can be queried with {@link AMDXShaderEnqueue#vkGetExecutionGraphPipelineNodeIndexAMDX GetExecutionGraphPipelineNodeIndexAMDX}, and is used exclusively for initial dispatch of an execution graph.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineIndex} is -1, {@code basePipelineHandle} <b>must</b> be a valid execution graph {@code VkPipeline} handle</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineHandle} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code basePipelineIndex} <b>must</b> be a valid index into the calling command’s {@code pCreateInfos} parameter</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, {@code basePipelineIndex} <b>must</b> be -1 or {@code basePipelineHandle} <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If a push constant block is declared in a shader, a push constant range in {@code layout} <b>must</b> match both the shader stage and range</li>
 * <li>If a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces-resources">resource variables</a> is declared in a shader, a descriptor slot in {@code layout} <b>must</b> match the shader stage</li>
 * <li>If a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces-resources">resource variables</a> is declared in a shader, and the descriptor type is not {@link EXTMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_EXT DESCRIPTOR_TYPE_MUTABLE_EXT}, a descriptor slot in {@code layout} <b>must</b> match the descriptor type</li>
 * <li>If a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces-resources">resource variables</a> is declared in a shader as an array, a descriptor slot in {@code layout} <b>must</b> match the descriptor count</li>
 * </ul>
 * 
 * <ul>
 * <li>{@code flags} <b>must</b> not include {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR}</li>
 * <li>{@code flags} <b>must</b> not include {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR}</li>
 * <li>{@code flags} <b>must</b> not include {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR}</li>
 * <li>{@code flags} <b>must</b> not include {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR}</li>
 * <li>{@code flags} <b>must</b> not include {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR}</li>
 * <li>{@code flags} <b>must</b> not include {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR}</li>
 * <li>{@code flags} <b>must</b> not include {@link KHRRayTracingPipeline#VK_PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR}</li>
 * <li>{@code flags} <b>must</b> not include {@link NVRayTracingMotionBlur#VK_PIPELINE_CREATE_RAY_TRACING_ALLOW_MOTION_BIT_NV PIPELINE_CREATE_RAY_TRACING_ALLOW_MOTION_BIT_NV}</li>
 * <li>If {@code flags} includes {@link NVDeviceGeneratedCommands#VK_PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-deviceGeneratedComputePipelines">{@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV}{@code ::deviceGeneratedComputePipelines}</a> feature <b>must</b> be enabled</li>
 * <li>If {@code flags} includes {@link NVDeviceGeneratedCommands#VK_PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV}, then the {@code pNext} chain <b>must</b> include a pointer to a valid instance of {@link VkComputePipelineIndirectBufferInfoNV} specifying the address where the pipeline’s metadata will be saved</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineCreationCacheControl">{@code pipelineCreationCacheControl}</a> feature is not enabled, {@code flags} <b>must</b> not include {@link VK13#VK_PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT} or {@link VK13#VK_PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT}</li>
 * <li>The {@code stage} member of any element of {@code pStages} <b>must</b> be {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT}</li>
 * <li>The shader code for the entry point identified by each element of {@code pStages} and the rest of the state identified by this structure <b>must</b> adhere to the pipeline linking rules described in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces">Shader Interfaces</a> chapter</li>
 * <li>{@code layout} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-pipelinelayout-consistency">consistent</a> with the layout of the shaders specified in {@code pStages}</li>
 * <li>If {@code pLibraryInfo} is not {@code NULL}, each element of its {@code pLibraries} member <b>must</b> have been created with a {@code layout} that is compatible with the {@code layout} in this pipeline</li>
 * <li>The number of resources in {@code layout} accessible to each shader stage that is used by the pipeline <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxPerStageResources}</li>
 * <li>If {@code pLibraryInfo} is not {@code NULL}, each element of {@code pLibraryInfo→libraries} <b>must</b> be either a compute pipeline or an execution graph pipeline</li>
 * <li>There <b>must</b> be no two nodes in the pipeline that share both the same shader name and index, as specified by {@link VkPipelineShaderStageNodeCreateInfoAMDX}</li>
 * <li>There <b>must</b> be no two nodes in the pipeline that share the same shader name and have input payload declarations with different sizes</li>
 * <li>There <b>must</b> be no two nodes in the pipeline that share the same name but have different execution models</li>
 * <li>There <b>must</b> be no two nodes in the pipeline that share the same name where one includes {@code CoalescedInputCountAMDX} and the other does not</li>
 * <li>There <b>must</b> be no two nodes in the pipeline that share the same name where one includes {@code StaticNumWorkgroupsAMDX} and the other does not</li>
 * <li>If an output payload declared in any shader in the pipeline has a {@code PayloadNodeNameAMDX} decoration with a {@code Node} {@code Name} that matches the shader name of any other node in the graph, the size of the output payload <b>must</b> match the size of the input payload in the matching node</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link AMDXShaderEnqueue#VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkPipelineCompilerControlCreateInfoAMD} or {@link VkPipelineCreationFeedbackCreateInfo}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkPipelineCreateFlagBits} values</li>
 * <li>If {@code stageCount} is not 0, and {@code pStages} is not {@code NULL}, {@code pStages} <b>must</b> be a valid pointer to an array of {@code stageCount} valid {@link VkPipelineShaderStageCreateInfo} structures</li>
 * <li>If {@code pLibraryInfo} is not {@code NULL}, {@code pLibraryInfo} <b>must</b> be a valid pointer to a valid {@link VkPipelineLibraryCreateInfoKHR} structure</li>
 * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
 * <li>Both of {@code basePipelineHandle}, and {@code layout} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPipelineLibraryCreateInfoKHR}, {@link VkPipelineShaderStageCreateInfo}, {@link AMDXShaderEnqueue#vkCreateExecutionGraphPipelinesAMDX CreateExecutionGraphPipelinesAMDX}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExecutionGraphPipelineCreateInfoAMDX {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineCreateFlags {@link #flags};
 *     uint32_t {@link #stageCount};
 *     {@link VkPipelineShaderStageCreateInfo VkPipelineShaderStageCreateInfo} const * {@link #pStages};
 *     {@link VkPipelineLibraryCreateInfoKHR VkPipelineLibraryCreateInfoKHR} const * {@link #pLibraryInfo};
 *     VkPipelineLayout {@link #layout};
 *     VkPipeline {@link #basePipelineHandle};
 *     int32_t {@link #basePipelineIndex};
 * }</code></pre>
 */
public class VkExecutionGraphPipelineCreateInfoAMDX extends Struct<VkExecutionGraphPipelineCreateInfoAMDX> implements NativeResource {

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
        PLIBRARYINFO,
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
        PLIBRARYINFO = layout.offsetof(5);
        LAYOUT = layout.offsetof(6);
        BASEPIPELINEHANDLE = layout.offsetof(7);
        BASEPIPELINEINDEX = layout.offsetof(8);
    }

    protected VkExecutionGraphPipelineCreateInfoAMDX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExecutionGraphPipelineCreateInfoAMDX create(long address, @Nullable ByteBuffer container) {
        return new VkExecutionGraphPipelineCreateInfoAMDX(address, container);
    }

    /**
     * Creates a {@code VkExecutionGraphPipelineCreateInfoAMDX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExecutionGraphPipelineCreateInfoAMDX(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
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
    /** a pointer to an array of {@code stageCount} {@link VkPipelineShaderStageCreateInfo} structures describing the set of the shader stages to be included in the execution graph pipeline. */
    @Nullable
    @NativeType("VkPipelineShaderStageCreateInfo const *")
    public VkPipelineShaderStageCreateInfo.Buffer pStages() { return npStages(address()); }
    /** a pointer to a {@link VkPipelineLibraryCreateInfoKHR} structure defining pipeline libraries to include. */
    @Nullable
    @NativeType("VkPipelineLibraryCreateInfoKHR const *")
    public VkPipelineLibraryCreateInfoKHR pLibraryInfo() { return npLibraryInfo(address()); }
    /** the description of binding locations used by both the pipeline and descriptor sets used with the pipeline. */
    @NativeType("VkPipelineLayout")
    public long layout() { return nlayout(address()); }
    /** a pipeline to derive from */
    @NativeType("VkPipeline")
    public long basePipelineHandle() { return nbasePipelineHandle(address()); }
    /** an index into the {@code pCreateInfos} parameter to use as a pipeline to derive from */
    @NativeType("int32_t")
    public int basePipelineIndex() { return nbasePipelineIndex(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkExecutionGraphPipelineCreateInfoAMDX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDXShaderEnqueue#VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX} value to the {@link #sType} field. */
    public VkExecutionGraphPipelineCreateInfoAMDX sType$Default() { return sType(AMDXShaderEnqueue.VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkExecutionGraphPipelineCreateInfoAMDX pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPipelineCompilerControlCreateInfoAMD} value to the {@code pNext} chain. */
    public VkExecutionGraphPipelineCreateInfoAMDX pNext(VkPipelineCompilerControlCreateInfoAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfo} value to the {@code pNext} chain. */
    public VkExecutionGraphPipelineCreateInfoAMDX pNext(VkPipelineCreationFeedbackCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
    public VkExecutionGraphPipelineCreateInfoAMDX pNext(VkPipelineCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkExecutionGraphPipelineCreateInfoAMDX flags(@NativeType("VkPipelineCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #stageCount} field. */
    public VkExecutionGraphPipelineCreateInfoAMDX stageCount(@NativeType("uint32_t") int value) { nstageCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineShaderStageCreateInfo.Buffer} to the {@link #pStages} field. */
    public VkExecutionGraphPipelineCreateInfoAMDX pStages(@Nullable @NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.Buffer value) { npStages(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineLibraryCreateInfoKHR} to the {@link #pLibraryInfo} field. */
    public VkExecutionGraphPipelineCreateInfoAMDX pLibraryInfo(@Nullable @NativeType("VkPipelineLibraryCreateInfoKHR const *") VkPipelineLibraryCreateInfoKHR value) { npLibraryInfo(address(), value); return this; }
    /** Sets the specified value to the {@link #layout} field. */
    public VkExecutionGraphPipelineCreateInfoAMDX layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@link #basePipelineHandle} field. */
    public VkExecutionGraphPipelineCreateInfoAMDX basePipelineHandle(@NativeType("VkPipeline") long value) { nbasePipelineHandle(address(), value); return this; }
    /** Sets the specified value to the {@link #basePipelineIndex} field. */
    public VkExecutionGraphPipelineCreateInfoAMDX basePipelineIndex(@NativeType("int32_t") int value) { nbasePipelineIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExecutionGraphPipelineCreateInfoAMDX set(
        int sType,
        long pNext,
        int flags,
        int stageCount,
        @Nullable VkPipelineShaderStageCreateInfo.Buffer pStages,
        @Nullable VkPipelineLibraryCreateInfoKHR pLibraryInfo,
        long layout,
        long basePipelineHandle,
        int basePipelineIndex
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        stageCount(stageCount);
        pStages(pStages);
        pLibraryInfo(pLibraryInfo);
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
    public VkExecutionGraphPipelineCreateInfoAMDX set(VkExecutionGraphPipelineCreateInfoAMDX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExecutionGraphPipelineCreateInfoAMDX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExecutionGraphPipelineCreateInfoAMDX malloc() {
        return new VkExecutionGraphPipelineCreateInfoAMDX(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExecutionGraphPipelineCreateInfoAMDX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExecutionGraphPipelineCreateInfoAMDX calloc() {
        return new VkExecutionGraphPipelineCreateInfoAMDX(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExecutionGraphPipelineCreateInfoAMDX} instance allocated with {@link BufferUtils}. */
    public static VkExecutionGraphPipelineCreateInfoAMDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExecutionGraphPipelineCreateInfoAMDX(memAddress(container), container);
    }

    /** Returns a new {@code VkExecutionGraphPipelineCreateInfoAMDX} instance for the specified memory address. */
    public static VkExecutionGraphPipelineCreateInfoAMDX create(long address) {
        return new VkExecutionGraphPipelineCreateInfoAMDX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExecutionGraphPipelineCreateInfoAMDX createSafe(long address) {
        return address == NULL ? null : new VkExecutionGraphPipelineCreateInfoAMDX(address, null);
    }

    /**
     * Returns a new {@link VkExecutionGraphPipelineCreateInfoAMDX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExecutionGraphPipelineCreateInfoAMDX.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExecutionGraphPipelineCreateInfoAMDX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExecutionGraphPipelineCreateInfoAMDX.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExecutionGraphPipelineCreateInfoAMDX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExecutionGraphPipelineCreateInfoAMDX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExecutionGraphPipelineCreateInfoAMDX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExecutionGraphPipelineCreateInfoAMDX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExecutionGraphPipelineCreateInfoAMDX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkExecutionGraphPipelineCreateInfoAMDX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExecutionGraphPipelineCreateInfoAMDX malloc(MemoryStack stack) {
        return new VkExecutionGraphPipelineCreateInfoAMDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExecutionGraphPipelineCreateInfoAMDX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExecutionGraphPipelineCreateInfoAMDX calloc(MemoryStack stack) {
        return new VkExecutionGraphPipelineCreateInfoAMDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExecutionGraphPipelineCreateInfoAMDX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExecutionGraphPipelineCreateInfoAMDX.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExecutionGraphPipelineCreateInfoAMDX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExecutionGraphPipelineCreateInfoAMDX.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkExecutionGraphPipelineCreateInfoAMDX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExecutionGraphPipelineCreateInfoAMDX.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkExecutionGraphPipelineCreateInfoAMDX.FLAGS); }
    /** Unsafe version of {@link #stageCount}. */
    public static int nstageCount(long struct) { return UNSAFE.getInt(null, struct + VkExecutionGraphPipelineCreateInfoAMDX.STAGECOUNT); }
    /** Unsafe version of {@link #pStages}. */
    @Nullable public static VkPipelineShaderStageCreateInfo.Buffer npStages(long struct) { return VkPipelineShaderStageCreateInfo.createSafe(memGetAddress(struct + VkExecutionGraphPipelineCreateInfoAMDX.PSTAGES), nstageCount(struct)); }
    /** Unsafe version of {@link #pLibraryInfo}. */
    @Nullable public static VkPipelineLibraryCreateInfoKHR npLibraryInfo(long struct) { return VkPipelineLibraryCreateInfoKHR.createSafe(memGetAddress(struct + VkExecutionGraphPipelineCreateInfoAMDX.PLIBRARYINFO)); }
    /** Unsafe version of {@link #layout}. */
    public static long nlayout(long struct) { return UNSAFE.getLong(null, struct + VkExecutionGraphPipelineCreateInfoAMDX.LAYOUT); }
    /** Unsafe version of {@link #basePipelineHandle}. */
    public static long nbasePipelineHandle(long struct) { return UNSAFE.getLong(null, struct + VkExecutionGraphPipelineCreateInfoAMDX.BASEPIPELINEHANDLE); }
    /** Unsafe version of {@link #basePipelineIndex}. */
    public static int nbasePipelineIndex(long struct) { return UNSAFE.getInt(null, struct + VkExecutionGraphPipelineCreateInfoAMDX.BASEPIPELINEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkExecutionGraphPipelineCreateInfoAMDX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExecutionGraphPipelineCreateInfoAMDX.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkExecutionGraphPipelineCreateInfoAMDX.FLAGS, value); }
    /** Sets the specified value to the {@code stageCount} field of the specified {@code struct}. */
    public static void nstageCount(long struct, int value) { UNSAFE.putInt(null, struct + VkExecutionGraphPipelineCreateInfoAMDX.STAGECOUNT, value); }
    /** Unsafe version of {@link #pStages(VkPipelineShaderStageCreateInfo.Buffer) pStages}. */
    public static void npStages(long struct, @Nullable VkPipelineShaderStageCreateInfo.Buffer value) { memPutAddress(struct + VkExecutionGraphPipelineCreateInfoAMDX.PSTAGES, memAddressSafe(value)); if (value != null) { nstageCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #pLibraryInfo(VkPipelineLibraryCreateInfoKHR) pLibraryInfo}. */
    public static void npLibraryInfo(long struct, @Nullable VkPipelineLibraryCreateInfoKHR value) { memPutAddress(struct + VkExecutionGraphPipelineCreateInfoAMDX.PLIBRARYINFO, memAddressSafe(value)); }
    /** Unsafe version of {@link #layout(long) layout}. */
    public static void nlayout(long struct, long value) { UNSAFE.putLong(null, struct + VkExecutionGraphPipelineCreateInfoAMDX.LAYOUT, value); }
    /** Unsafe version of {@link #basePipelineHandle(long) basePipelineHandle}. */
    public static void nbasePipelineHandle(long struct, long value) { UNSAFE.putLong(null, struct + VkExecutionGraphPipelineCreateInfoAMDX.BASEPIPELINEHANDLE, value); }
    /** Unsafe version of {@link #basePipelineIndex(int) basePipelineIndex}. */
    public static void nbasePipelineIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkExecutionGraphPipelineCreateInfoAMDX.BASEPIPELINEINDEX, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pLibraryInfo = memGetAddress(struct + VkExecutionGraphPipelineCreateInfoAMDX.PLIBRARYINFO);
        if (pLibraryInfo != NULL) {
            VkPipelineLibraryCreateInfoKHR.validate(pLibraryInfo);
        }
    }

    // -----------------------------------

    /** An array of {@link VkExecutionGraphPipelineCreateInfoAMDX} structs. */
    public static class Buffer extends StructBuffer<VkExecutionGraphPipelineCreateInfoAMDX, Buffer> implements NativeResource {

        private static final VkExecutionGraphPipelineCreateInfoAMDX ELEMENT_FACTORY = VkExecutionGraphPipelineCreateInfoAMDX.create(-1L);

        /**
         * Creates a new {@code VkExecutionGraphPipelineCreateInfoAMDX.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExecutionGraphPipelineCreateInfoAMDX#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkExecutionGraphPipelineCreateInfoAMDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkExecutionGraphPipelineCreateInfoAMDX#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExecutionGraphPipelineCreateInfoAMDX.nsType(address()); }
        /** @return the value of the {@link VkExecutionGraphPipelineCreateInfoAMDX#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkExecutionGraphPipelineCreateInfoAMDX.npNext(address()); }
        /** @return the value of the {@link VkExecutionGraphPipelineCreateInfoAMDX#flags} field. */
        @NativeType("VkPipelineCreateFlags")
        public int flags() { return VkExecutionGraphPipelineCreateInfoAMDX.nflags(address()); }
        /** @return the value of the {@link VkExecutionGraphPipelineCreateInfoAMDX#stageCount} field. */
        @NativeType("uint32_t")
        public int stageCount() { return VkExecutionGraphPipelineCreateInfoAMDX.nstageCount(address()); }
        /** @return a {@link VkPipelineShaderStageCreateInfo.Buffer} view of the struct array pointed to by the {@link VkExecutionGraphPipelineCreateInfoAMDX#pStages} field. */
        @Nullable
        @NativeType("VkPipelineShaderStageCreateInfo const *")
        public VkPipelineShaderStageCreateInfo.Buffer pStages() { return VkExecutionGraphPipelineCreateInfoAMDX.npStages(address()); }
        /** @return a {@link VkPipelineLibraryCreateInfoKHR} view of the struct pointed to by the {@link VkExecutionGraphPipelineCreateInfoAMDX#pLibraryInfo} field. */
        @Nullable
        @NativeType("VkPipelineLibraryCreateInfoKHR const *")
        public VkPipelineLibraryCreateInfoKHR pLibraryInfo() { return VkExecutionGraphPipelineCreateInfoAMDX.npLibraryInfo(address()); }
        /** @return the value of the {@link VkExecutionGraphPipelineCreateInfoAMDX#layout} field. */
        @NativeType("VkPipelineLayout")
        public long layout() { return VkExecutionGraphPipelineCreateInfoAMDX.nlayout(address()); }
        /** @return the value of the {@link VkExecutionGraphPipelineCreateInfoAMDX#basePipelineHandle} field. */
        @NativeType("VkPipeline")
        public long basePipelineHandle() { return VkExecutionGraphPipelineCreateInfoAMDX.nbasePipelineHandle(address()); }
        /** @return the value of the {@link VkExecutionGraphPipelineCreateInfoAMDX#basePipelineIndex} field. */
        @NativeType("int32_t")
        public int basePipelineIndex() { return VkExecutionGraphPipelineCreateInfoAMDX.nbasePipelineIndex(address()); }

        /** Sets the specified value to the {@link VkExecutionGraphPipelineCreateInfoAMDX#sType} field. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer sType(@NativeType("VkStructureType") int value) { VkExecutionGraphPipelineCreateInfoAMDX.nsType(address(), value); return this; }
        /** Sets the {@link AMDXShaderEnqueue#VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX} value to the {@link VkExecutionGraphPipelineCreateInfoAMDX#sType} field. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer sType$Default() { return sType(AMDXShaderEnqueue.VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX); }
        /** Sets the specified value to the {@link VkExecutionGraphPipelineCreateInfoAMDX#pNext} field. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer pNext(@NativeType("void const *") long value) { VkExecutionGraphPipelineCreateInfoAMDX.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPipelineCompilerControlCreateInfoAMD} value to the {@code pNext} chain. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer pNext(VkPipelineCompilerControlCreateInfoAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfo} value to the {@code pNext} chain. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer pNext(VkPipelineCreationFeedbackCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer pNext(VkPipelineCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkExecutionGraphPipelineCreateInfoAMDX#flags} field. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer flags(@NativeType("VkPipelineCreateFlags") int value) { VkExecutionGraphPipelineCreateInfoAMDX.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkExecutionGraphPipelineCreateInfoAMDX#stageCount} field. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer stageCount(@NativeType("uint32_t") int value) { VkExecutionGraphPipelineCreateInfoAMDX.nstageCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineShaderStageCreateInfo.Buffer} to the {@link VkExecutionGraphPipelineCreateInfoAMDX#pStages} field. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer pStages(@Nullable @NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.Buffer value) { VkExecutionGraphPipelineCreateInfoAMDX.npStages(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineLibraryCreateInfoKHR} to the {@link VkExecutionGraphPipelineCreateInfoAMDX#pLibraryInfo} field. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer pLibraryInfo(@Nullable @NativeType("VkPipelineLibraryCreateInfoKHR const *") VkPipelineLibraryCreateInfoKHR value) { VkExecutionGraphPipelineCreateInfoAMDX.npLibraryInfo(address(), value); return this; }
        /** Sets the specified value to the {@link VkExecutionGraphPipelineCreateInfoAMDX#layout} field. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkExecutionGraphPipelineCreateInfoAMDX.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkExecutionGraphPipelineCreateInfoAMDX#basePipelineHandle} field. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer basePipelineHandle(@NativeType("VkPipeline") long value) { VkExecutionGraphPipelineCreateInfoAMDX.nbasePipelineHandle(address(), value); return this; }
        /** Sets the specified value to the {@link VkExecutionGraphPipelineCreateInfoAMDX#basePipelineIndex} field. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer basePipelineIndex(@NativeType("int32_t") int value) { VkExecutionGraphPipelineCreateInfoAMDX.nbasePipelineIndex(address(), value); return this; }

    }

}