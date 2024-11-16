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
 * Structure specifying parameters of a newly created compute pipeline.
 * 
 * <h5>Description</h5>
 * 
 * <p>The parameters {@code basePipelineHandle} and {@code basePipelineIndex} are described in more detail in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-pipeline-derivatives">Pipeline Derivatives</a>.</p>
 * 
 * <p>If the {@code pNext} chain includes a {@link VkPipelineCreateFlags2CreateInfoKHR} structure, {@link VkPipelineCreateFlags2CreateInfoKHR}{@code ::flags} from that structure is used instead of {@code flags} from this structure.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the {@code pNext} chain does not include a {@link VkPipelineCreateFlags2CreateInfoKHR} structure, {@code flags} <b>must</b> be a valid combination of {@code VkPipelineCreateFlagBits} values</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineIndex} is -1, {@code basePipelineHandle} <b>must</b> be a valid compute {@code VkPipeline} handle</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineHandle} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code basePipelineIndex} <b>must</b> be a valid index into the calling command’s {@code pCreateInfos} parameter</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, {@code basePipelineIndex} <b>must</b> be -1 or {@code basePipelineHandle} <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If a push constant block is declared in a shader, a push constant range in {@code layout} <b>must</b> match the shader stage</li>
 * <li>If a push constant block is declared in a shader, the block must be contained inside the push constant range in {@code layout} that matches the stage</li>
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
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-deviceGeneratedComputePipelines">{@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV}{@code ::deviceGeneratedComputePipelines}</a> is not enabled, {@code flags} <b>must</b> not include {@link NVDeviceGeneratedCommands#VK_PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV}</li>
 * <li>If {@code flags} includes {@link NVDeviceGeneratedCommands#VK_PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV}, then the {@code pNext} chain <b>must</b> include a pointer to a valid instance of {@link VkComputePipelineIndirectBufferInfoNV} specifying the address where the pipeline’s metadata will be saved</li>
 * <li>If {@code flags} includes {@link EXTDeviceGeneratedCommands#VK_PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_EXT PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_EXT}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-deviceGeneratedCommandsEXT">{@code deviceGeneratedCommands}</a> feature <b>must</b> be enabled</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineCreationCacheControl">{@code pipelineCreationCacheControl}</a> feature is not enabled, {@code flags} <b>must</b> not include {@link VK13#VK_PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT} or {@link VK13#VK_PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT}</li>
 * <li>The {@code stage} member of {@code stage} <b>must</b> be {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT}</li>
 * <li>The shader code for the entry point identified by {@code stage} and the rest of the state identified by this structure <b>must</b> adhere to the pipeline linking rules described in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces">Shader Interfaces</a> chapter</li>
 * <li>The number of resources in {@code layout} accessible to the compute shader stage <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxPerStageResources}</li>
 * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderEnqueue">{@code shaderEnqueue}</a> is not enabled, {@code flags} <b>must</b> not include {@link KHRPipelineLibrary#VK_PIPELINE_CREATE_LIBRARY_BIT_KHR PIPELINE_CREATE_LIBRARY_BIT_KHR}</li>
 * <li>If {@code flags} does not include {@link KHRPipelineLibrary#VK_PIPELINE_CREATE_LIBRARY_BIT_KHR PIPELINE_CREATE_LIBRARY_BIT_KHR}, the shader specified by {@code stage} <b>must</b> not declare the {@code ShaderEnqueueAMDX} capability</li>
 * <li>If {@link VkPipelineCreationFeedbackCreateInfo}{@code ::pipelineStageCreationFeedbackCount} is not 0, it <b>must</b> be 1</li>
 * <li>{@code flags} <b>must</b> not include {@link EXTOpacityMicromap#VK_PIPELINE_CREATE_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT PIPELINE_CREATE_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT}</li>
 * <li>{@code flags} <b>must</b> not include {@link NVDisplacementMicromap#VK_PIPELINE_CREATE_RAY_TRACING_DISPLACEMENT_MICROMAP_BIT_NV PIPELINE_CREATE_RAY_TRACING_DISPLACEMENT_MICROMAP_BIT_NV}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkComputePipelineIndirectBufferInfoNV}, {@link VkPipelineBinaryInfoKHR}, {@link VkPipelineCompilerControlCreateInfoAMD}, {@link VkPipelineCreateFlags2CreateInfoKHR}, {@link VkPipelineCreationFeedbackCreateInfo}, {@link VkPipelineRobustnessCreateInfoEXT}, or {@link VkSubpassShadingPipelineCreateInfoHUAWEI}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code stage} <b>must</b> be a valid {@link VkPipelineShaderStageCreateInfo} structure</li>
 * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
 * <li>Both of {@code basePipelineHandle}, and {@code layout} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPipelineShaderStageCreateInfo}, {@link VK10#vkCreateComputePipelines CreateComputePipelines}, {@link NVDeviceGeneratedCommandsCompute#vkGetPipelineIndirectMemoryRequirementsNV GetPipelineIndirectMemoryRequirementsNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkComputePipelineCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineCreateFlags {@link #flags};
 *     {@link VkPipelineShaderStageCreateInfo VkPipelineShaderStageCreateInfo} {@link #stage};
 *     VkPipelineLayout {@link #layout};
 *     VkPipeline {@link #basePipelineHandle};
 *     int32_t {@link #basePipelineIndex};
 * }</code></pre>
 */
public class VkComputePipelineCreateInfo extends Struct<VkComputePipelineCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        STAGE,
        LAYOUT,
        BASEPIPELINEHANDLE,
        BASEPIPELINEINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkPipelineShaderStageCreateInfo.SIZEOF, VkPipelineShaderStageCreateInfo.ALIGNOF),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        STAGE = layout.offsetof(3);
        LAYOUT = layout.offsetof(4);
        BASEPIPELINEHANDLE = layout.offsetof(5);
        BASEPIPELINEINDEX = layout.offsetof(6);
    }

    protected VkComputePipelineCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkComputePipelineCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkComputePipelineCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkComputePipelineCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkComputePipelineCreateInfo(ByteBuffer container) {
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
    /** a {@link VkPipelineShaderStageCreateInfo} structure describing the compute shader. */
    public VkPipelineShaderStageCreateInfo stage() { return nstage(address()); }
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
    public VkComputePipelineCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO} value to the {@link #sType} field. */
    public VkComputePipelineCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkComputePipelineCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkComputePipelineIndirectBufferInfoNV} value to the {@code pNext} chain. */
    public VkComputePipelineCreateInfo pNext(VkComputePipelineIndirectBufferInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineBinaryInfoKHR} value to the {@code pNext} chain. */
    public VkComputePipelineCreateInfo pNext(VkPipelineBinaryInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCompilerControlCreateInfoAMD} value to the {@code pNext} chain. */
    public VkComputePipelineCreateInfo pNext(VkPipelineCompilerControlCreateInfoAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreateFlags2CreateInfoKHR} value to the {@code pNext} chain. */
    public VkComputePipelineCreateInfo pNext(VkPipelineCreateFlags2CreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfo} value to the {@code pNext} chain. */
    public VkComputePipelineCreateInfo pNext(VkPipelineCreationFeedbackCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
    public VkComputePipelineCreateInfo pNext(VkPipelineCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineRobustnessCreateInfoEXT} value to the {@code pNext} chain. */
    public VkComputePipelineCreateInfo pNext(VkPipelineRobustnessCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSubpassShadingPipelineCreateInfoHUAWEI} value to the {@code pNext} chain. */
    public VkComputePipelineCreateInfo pNext(VkSubpassShadingPipelineCreateInfoHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkComputePipelineCreateInfo flags(@NativeType("VkPipelineCreateFlags") int value) { nflags(address(), value); return this; }
    /** Copies the specified {@link VkPipelineShaderStageCreateInfo} to the {@link #stage} field. */
    public VkComputePipelineCreateInfo stage(VkPipelineShaderStageCreateInfo value) { nstage(address(), value); return this; }
    /** Passes the {@link #stage} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkComputePipelineCreateInfo stage(java.util.function.Consumer<VkPipelineShaderStageCreateInfo> consumer) { consumer.accept(stage()); return this; }
    /** Sets the specified value to the {@link #layout} field. */
    public VkComputePipelineCreateInfo layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@link #basePipelineHandle} field. */
    public VkComputePipelineCreateInfo basePipelineHandle(@NativeType("VkPipeline") long value) { nbasePipelineHandle(address(), value); return this; }
    /** Sets the specified value to the {@link #basePipelineIndex} field. */
    public VkComputePipelineCreateInfo basePipelineIndex(@NativeType("int32_t") int value) { nbasePipelineIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkComputePipelineCreateInfo set(
        int sType,
        long pNext,
        int flags,
        VkPipelineShaderStageCreateInfo stage,
        long layout,
        long basePipelineHandle,
        int basePipelineIndex
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        stage(stage);
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
    public VkComputePipelineCreateInfo set(VkComputePipelineCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkComputePipelineCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkComputePipelineCreateInfo malloc() {
        return new VkComputePipelineCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkComputePipelineCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkComputePipelineCreateInfo calloc() {
        return new VkComputePipelineCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkComputePipelineCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkComputePipelineCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkComputePipelineCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkComputePipelineCreateInfo} instance for the specified memory address. */
    public static VkComputePipelineCreateInfo create(long address) {
        return new VkComputePipelineCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkComputePipelineCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkComputePipelineCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkComputePipelineCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkComputePipelineCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkComputePipelineCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkComputePipelineCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkComputePipelineCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkComputePipelineCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkComputePipelineCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkComputePipelineCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkComputePipelineCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkComputePipelineCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkComputePipelineCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkComputePipelineCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkComputePipelineCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkComputePipelineCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkComputePipelineCreateInfo malloc(MemoryStack stack) {
        return new VkComputePipelineCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkComputePipelineCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkComputePipelineCreateInfo calloc(MemoryStack stack) {
        return new VkComputePipelineCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkComputePipelineCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkComputePipelineCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkComputePipelineCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkComputePipelineCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkComputePipelineCreateInfo.FLAGS); }
    /** Unsafe version of {@link #stage}. */
    public static VkPipelineShaderStageCreateInfo nstage(long struct) { return VkPipelineShaderStageCreateInfo.create(struct + VkComputePipelineCreateInfo.STAGE); }
    /** Unsafe version of {@link #layout}. */
    public static long nlayout(long struct) { return memGetLong(struct + VkComputePipelineCreateInfo.LAYOUT); }
    /** Unsafe version of {@link #basePipelineHandle}. */
    public static long nbasePipelineHandle(long struct) { return memGetLong(struct + VkComputePipelineCreateInfo.BASEPIPELINEHANDLE); }
    /** Unsafe version of {@link #basePipelineIndex}. */
    public static int nbasePipelineIndex(long struct) { return memGetInt(struct + VkComputePipelineCreateInfo.BASEPIPELINEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkComputePipelineCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkComputePipelineCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkComputePipelineCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #stage(VkPipelineShaderStageCreateInfo) stage}. */
    public static void nstage(long struct, VkPipelineShaderStageCreateInfo value) { memCopy(value.address(), struct + VkComputePipelineCreateInfo.STAGE, VkPipelineShaderStageCreateInfo.SIZEOF); }
    /** Unsafe version of {@link #layout(long) layout}. */
    public static void nlayout(long struct, long value) { memPutLong(struct + VkComputePipelineCreateInfo.LAYOUT, value); }
    /** Unsafe version of {@link #basePipelineHandle(long) basePipelineHandle}. */
    public static void nbasePipelineHandle(long struct, long value) { memPutLong(struct + VkComputePipelineCreateInfo.BASEPIPELINEHANDLE, value); }
    /** Unsafe version of {@link #basePipelineIndex(int) basePipelineIndex}. */
    public static void nbasePipelineIndex(long struct, int value) { memPutInt(struct + VkComputePipelineCreateInfo.BASEPIPELINEINDEX, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        VkPipelineShaderStageCreateInfo.validate(struct + VkComputePipelineCreateInfo.STAGE);
    }

    // -----------------------------------

    /** An array of {@link VkComputePipelineCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkComputePipelineCreateInfo, Buffer> implements NativeResource {

        private static final VkComputePipelineCreateInfo ELEMENT_FACTORY = VkComputePipelineCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkComputePipelineCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkComputePipelineCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkComputePipelineCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkComputePipelineCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkComputePipelineCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkComputePipelineCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkComputePipelineCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkComputePipelineCreateInfo#flags} field. */
        @NativeType("VkPipelineCreateFlags")
        public int flags() { return VkComputePipelineCreateInfo.nflags(address()); }
        /** @return a {@link VkPipelineShaderStageCreateInfo} view of the {@link VkComputePipelineCreateInfo#stage} field. */
        public VkPipelineShaderStageCreateInfo stage() { return VkComputePipelineCreateInfo.nstage(address()); }
        /** @return the value of the {@link VkComputePipelineCreateInfo#layout} field. */
        @NativeType("VkPipelineLayout")
        public long layout() { return VkComputePipelineCreateInfo.nlayout(address()); }
        /** @return the value of the {@link VkComputePipelineCreateInfo#basePipelineHandle} field. */
        @NativeType("VkPipeline")
        public long basePipelineHandle() { return VkComputePipelineCreateInfo.nbasePipelineHandle(address()); }
        /** @return the value of the {@link VkComputePipelineCreateInfo#basePipelineIndex} field. */
        @NativeType("int32_t")
        public int basePipelineIndex() { return VkComputePipelineCreateInfo.nbasePipelineIndex(address()); }

        /** Sets the specified value to the {@link VkComputePipelineCreateInfo#sType} field. */
        public VkComputePipelineCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkComputePipelineCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO} value to the {@link VkComputePipelineCreateInfo#sType} field. */
        public VkComputePipelineCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO); }
        /** Sets the specified value to the {@link VkComputePipelineCreateInfo#pNext} field. */
        public VkComputePipelineCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkComputePipelineCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkComputePipelineIndirectBufferInfoNV} value to the {@code pNext} chain. */
        public VkComputePipelineCreateInfo.Buffer pNext(VkComputePipelineIndirectBufferInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineBinaryInfoKHR} value to the {@code pNext} chain. */
        public VkComputePipelineCreateInfo.Buffer pNext(VkPipelineBinaryInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCompilerControlCreateInfoAMD} value to the {@code pNext} chain. */
        public VkComputePipelineCreateInfo.Buffer pNext(VkPipelineCompilerControlCreateInfoAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreateFlags2CreateInfoKHR} value to the {@code pNext} chain. */
        public VkComputePipelineCreateInfo.Buffer pNext(VkPipelineCreateFlags2CreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfo} value to the {@code pNext} chain. */
        public VkComputePipelineCreateInfo.Buffer pNext(VkPipelineCreationFeedbackCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
        public VkComputePipelineCreateInfo.Buffer pNext(VkPipelineCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineRobustnessCreateInfoEXT} value to the {@code pNext} chain. */
        public VkComputePipelineCreateInfo.Buffer pNext(VkPipelineRobustnessCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSubpassShadingPipelineCreateInfoHUAWEI} value to the {@code pNext} chain. */
        public VkComputePipelineCreateInfo.Buffer pNext(VkSubpassShadingPipelineCreateInfoHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkComputePipelineCreateInfo#flags} field. */
        public VkComputePipelineCreateInfo.Buffer flags(@NativeType("VkPipelineCreateFlags") int value) { VkComputePipelineCreateInfo.nflags(address(), value); return this; }
        /** Copies the specified {@link VkPipelineShaderStageCreateInfo} to the {@link VkComputePipelineCreateInfo#stage} field. */
        public VkComputePipelineCreateInfo.Buffer stage(VkPipelineShaderStageCreateInfo value) { VkComputePipelineCreateInfo.nstage(address(), value); return this; }
        /** Passes the {@link VkComputePipelineCreateInfo#stage} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkComputePipelineCreateInfo.Buffer stage(java.util.function.Consumer<VkPipelineShaderStageCreateInfo> consumer) { consumer.accept(stage()); return this; }
        /** Sets the specified value to the {@link VkComputePipelineCreateInfo#layout} field. */
        public VkComputePipelineCreateInfo.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkComputePipelineCreateInfo.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkComputePipelineCreateInfo#basePipelineHandle} field. */
        public VkComputePipelineCreateInfo.Buffer basePipelineHandle(@NativeType("VkPipeline") long value) { VkComputePipelineCreateInfo.nbasePipelineHandle(address(), value); return this; }
        /** Sets the specified value to the {@link VkComputePipelineCreateInfo#basePipelineIndex} field. */
        public VkComputePipelineCreateInfo.Buffer basePipelineIndex(@NativeType("int32_t") int value) { VkComputePipelineCreateInfo.nbasePipelineIndex(address(), value); return this; }

    }

}