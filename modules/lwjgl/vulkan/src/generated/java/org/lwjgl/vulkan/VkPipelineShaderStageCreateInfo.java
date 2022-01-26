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
 * Structure specifying parameters of a newly created pipeline shader stage.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-geometryShader">geometry shaders</a> feature is not enabled, {@code stage} <b>must</b> not be {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code stage} <b>must</b> not be {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT} or {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-meshShader">mesh shader</a> feature is not enabled, {@code stage} <b>must</b> not be {@link NVMeshShader#VK_SHADER_STAGE_MESH_BIT_NV SHADER_STAGE_MESH_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-taskShader">task shader</a> feature is not enabled, {@code stage} <b>must</b> not be {@link NVMeshShader#VK_SHADER_STAGE_TASK_BIT_NV SHADER_STAGE_TASK_BIT_NV}</li>
 * <li>{@code stage} <b>must</b> not be {@link VK10#VK_SHADER_STAGE_ALL_GRAPHICS SHADER_STAGE_ALL_GRAPHICS}, or {@link VK10#VK_SHADER_STAGE_ALL SHADER_STAGE_ALL}</li>
 * <li>{@code pName} <b>must</b> be the name of an {@code OpEntryPoint} in {@code module} with an execution model that matches {@code stage}</li>
 * <li>If the identified entry point includes any variable in its interface that is declared with the {@code ClipDistance} {@code BuiltIn} decoration, that variable <b>must</b> not have an array size greater than {@link VkPhysicalDeviceLimits}{@code ::maxClipDistances}</li>
 * <li>If the identified entry point includes any variable in its interface that is declared with the {@code CullDistance} {@code BuiltIn} decoration, that variable <b>must</b> not have an array size greater than {@link VkPhysicalDeviceLimits}{@code ::maxCullDistances}</li>
 * <li>If the identified entry point includes any variables in its interface that are declared with the {@code ClipDistance} or {@code CullDistance} {@code BuiltIn} decoration, those variables <b>must</b> not have array sizes which sum to more than {@link VkPhysicalDeviceLimits}{@code ::maxCombinedClipAndCullDistances}</li>
 * <li>If the identified entry point includes any variable in its interface that is declared with the {@code SampleMask} {@code BuiltIn} decoration, that variable <b>must</b> not have an array size greater than {@link VkPhysicalDeviceLimits}{@code ::maxSampleMaskWords}</li>
 * <li>If {@code stage} is {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT}, the identified entry point <b>must</b> not include any input variable in its interface that is decorated with {@code CullDistance}</li>
 * <li>If {@code stage} is {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT} or {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}, and the identified entry point has an {@code OpExecutionMode} instruction specifying a patch size with {@code OutputVertices}, the patch size <b>must</b> be greater than 0 and less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxTessellationPatchSize}</li>
 * <li>If {@code stage} is {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}, the identified entry point <b>must</b> have an {@code OpExecutionMode} instruction specifying a maximum output vertex count that is greater than 0 and less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxGeometryOutputVertices}</li>
 * <li>If {@code stage} is {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT}, the identified entry point <b>must</b> have an {@code OpExecutionMode} instruction specifying an invocation count that is greater than 0 and less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxGeometryShaderInvocations}</li>
 * <li>If {@code stage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader stage</a>, and the identified entry point writes to {@code Layer} for any primitive, it <b>must</b> write the same value to {@code Layer} for all vertices of a given primitive</li>
 * <li>If {@code stage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader stage</a>, and the identified entry point writes to {@code ViewportIndex} for any primitive, it <b>must</b> write the same value to {@code ViewportIndex} for all vertices of a given primitive</li>
 * <li>If {@code stage} is {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}, the identified entry point <b>must</b> not include any output variables in its interface decorated with {@code CullDistance}</li>
 * <li>If {@code stage} is {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}, and the identified entry point writes to {@code FragDepth} in any execution path, it <b>must</b> write to {@code FragDepth} in all execution paths</li>
 * <li>If {@code stage} is {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}, and the identified entry point writes to {@code FragStencilRefEXT} in any execution path, it <b>must</b> write to {@code FragStencilRefEXT} in all execution paths</li>
 * <li>If {@code stage} is {@link NVMeshShader#VK_SHADER_STAGE_MESH_BIT_NV SHADER_STAGE_MESH_BIT_NV}, the identified entry point <b>must</b> have an {@code OpExecutionMode} instruction specifying a maximum output vertex count, {@code OutputVertices}, that is greater than 0 and less than or equal to {@link VkPhysicalDeviceMeshShaderPropertiesNV}{@code ::maxMeshOutputVertices}</li>
 * <li>If {@code stage} is {@link NVMeshShader#VK_SHADER_STAGE_MESH_BIT_NV SHADER_STAGE_MESH_BIT_NV}, the identified entry point <b>must</b> have an {@code OpExecutionMode} instruction specifying a maximum output primitive count, {@code OutputPrimitivesNV}, that is greater than 0 and less than or equal to {@link VkPhysicalDeviceMeshShaderPropertiesNV}{@code ::maxMeshOutputPrimitives}</li>
 * <li>If {@code flags} has the {@link VK13#VK_PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT} flag set, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-subgroupSizeControl">{@code subgroupSizeControl}</a> feature <b>must</b> be enabled</li>
 * <li>If {@code flags} has the {@link VK13#VK_PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT} flag set, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-computeFullSubgroups">{@code computeFullSubgroups}</a> feature <b>must</b> be enabled</li>
 * <li>If a {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} structure is included in the {@code pNext} chain, {@code flags} <b>must</b> not have the {@link VK13#VK_PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT} flag set</li>
 * <li>If a {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} structure is included in the {@code pNext} chain, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-subgroupSizeControl">{@code subgroupSizeControl}</a> feature <b>must</b> be enabled, and {@code stage} <b>must</b> be a valid bit specified in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-requiredSubgroupSizeStages">{@code requiredSubgroupSizeStages}</a></li>
 * <li>If a {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} structure is included in the {@code pNext} chain and {@code stage} is {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT}, the local workgroup size of the shader <b>must</b> be less than or equal to the product of {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo}{@code ::requiredSubgroupSize} and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxComputeWorkgroupSubgroups">{@code maxComputeWorkgroupSubgroups}</a></li>
 * <li>If a {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} structure is included in the {@code pNext} chain, and {@code flags} has the {@link VK13#VK_PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT} flag set, the local workgroup size in the X dimension of the pipeline <b>must</b> be a multiple of {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo}{@code ::requiredSubgroupSize}</li>
 * <li>If {@code flags} has both the {@link VK13#VK_PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT} and {@link VK13#VK_PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT} flags set, the local workgroup size in the X dimension of the pipeline <b>must</b> be a multiple of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxSubgroupSize">{@code maxSubgroupSize}</a></li>
 * <li>If {@code flags} has the {@link VK13#VK_PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT} flag set and {@code flags} does not have the {@link VK13#VK_PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT} flag set and no {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} structure is included in the {@code pNext} chain, the local workgroup size in the X dimension of the pipeline <b>must</b> be a multiple of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-subgroup-size">{@code subgroupSize}</a></li>
 * <li>The SPIR-V code that was used to create {@code module} <b>must</b> be valid as described by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#spirv-spec">Khronos SPIR-V Specification</a> after applying the specializations provided in {@code pSpecializationInfo}, if any, and then converting all specialization constants into fixed constants</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkPipelineShaderStageCreateFlagBits} values</li>
 * <li>{@code stage} <b>must</b> be a valid {@code VkShaderStageFlagBits} value</li>
 * <li>{@code module} <b>must</b> be a valid {@code VkShaderModule} handle</li>
 * <li>{@code pName} <b>must</b> be a null-terminated UTF-8 string</li>
 * <li>If {@code pSpecializationInfo} is not {@code NULL}, {@code pSpecializationInfo} <b>must</b> be a valid pointer to a valid {@link VkSpecializationInfo} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkComputePipelineCreateInfo}, {@link VkGraphicsPipelineCreateInfo}, {@link VkGraphicsShaderGroupCreateInfoNV}, {@link VkRayTracingPipelineCreateInfoKHR}, {@link VkRayTracingPipelineCreateInfoNV}, {@link VkSpecializationInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineShaderStageCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineShaderStageCreateFlags {@link #flags};
 *     VkShaderStageFlagBits {@link #stage};
 *     VkShaderModule {@link #module};
 *     char const * {@link #pName};
 *     {@link VkSpecializationInfo VkSpecializationInfo} const * {@link #pSpecializationInfo};
 * }</code></pre>
 */
public class VkPipelineShaderStageCreateInfo extends Struct implements NativeResource {

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
        MODULE,
        PNAME,
        PSPECIALIZATIONINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        STAGE = layout.offsetof(3);
        MODULE = layout.offsetof(4);
        PNAME = layout.offsetof(5);
        PSPECIALIZATIONINFO = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkPipelineShaderStageCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineShaderStageCreateInfo(ByteBuffer container) {
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
    /** a bitmask of {@code VkPipelineShaderStageCreateFlagBits} specifying how the pipeline shader stage will be generated. */
    @NativeType("VkPipelineShaderStageCreateFlags")
    public int flags() { return nflags(address()); }
    /** a {@code VkShaderStageFlagBits} value specifying a single pipeline stage. */
    @NativeType("VkShaderStageFlagBits")
    public int stage() { return nstage(address()); }
    /** a {@code VkShaderModule} object containing the shader for this stage. */
    @NativeType("VkShaderModule")
    public long module() { return nmodule(address()); }
    /** a pointer to a null-terminated UTF-8 string specifying the entry point name of the shader for this stage. */
    @NativeType("char const *")
    public ByteBuffer pName() { return npName(address()); }
    /** a pointer to a null-terminated UTF-8 string specifying the entry point name of the shader for this stage. */
    @NativeType("char const *")
    public String pNameString() { return npNameString(address()); }
    /** a pointer to a {@link VkSpecializationInfo} structure, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-specialization-constants">Specialization Constants</a>, or {@code NULL}. */
    @Nullable
    @NativeType("VkSpecializationInfo const *")
    public VkSpecializationInfo pSpecializationInfo() { return npSpecializationInfo(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineShaderStageCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO} value to the {@link #sType} field. */
    public VkPipelineShaderStageCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineShaderStageCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} value to the {@code pNext} chain. */
    public VkPipelineShaderStageCreateInfo pNext(VkPipelineShaderStageRequiredSubgroupSizeCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT} value to the {@code pNext} chain. */
    public VkPipelineShaderStageCreateInfo pNext(VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkPipelineShaderStageCreateInfo flags(@NativeType("VkPipelineShaderStageCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #stage} field. */
    public VkPipelineShaderStageCreateInfo stage(@NativeType("VkShaderStageFlagBits") int value) { nstage(address(), value); return this; }
    /** Sets the specified value to the {@link #module} field. */
    public VkPipelineShaderStageCreateInfo module(@NativeType("VkShaderModule") long value) { nmodule(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #pName} field. */
    public VkPipelineShaderStageCreateInfo pName(@NativeType("char const *") ByteBuffer value) { npName(address(), value); return this; }
    /** Sets the address of the specified {@link VkSpecializationInfo} to the {@link #pSpecializationInfo} field. */
    public VkPipelineShaderStageCreateInfo pSpecializationInfo(@Nullable @NativeType("VkSpecializationInfo const *") VkSpecializationInfo value) { npSpecializationInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineShaderStageCreateInfo set(
        int sType,
        long pNext,
        int flags,
        int stage,
        long module,
        ByteBuffer pName,
        @Nullable VkSpecializationInfo pSpecializationInfo
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        stage(stage);
        module(module);
        pName(pName);
        pSpecializationInfo(pSpecializationInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineShaderStageCreateInfo set(VkPipelineShaderStageCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineShaderStageCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineShaderStageCreateInfo malloc() {
        return wrap(VkPipelineShaderStageCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineShaderStageCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineShaderStageCreateInfo calloc() {
        return wrap(VkPipelineShaderStageCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineShaderStageCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineShaderStageCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineShaderStageCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineShaderStageCreateInfo} instance for the specified memory address. */
    public static VkPipelineShaderStageCreateInfo create(long address) {
        return wrap(VkPipelineShaderStageCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineShaderStageCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineShaderStageCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineShaderStageCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineShaderStageCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineShaderStageCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineShaderStageCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineShaderStageCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineShaderStageCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineShaderStageCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineShaderStageCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineShaderStageCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineShaderStageCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineShaderStageCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineShaderStageCreateInfo malloc(MemoryStack stack) {
        return wrap(VkPipelineShaderStageCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineShaderStageCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineShaderStageCreateInfo calloc(MemoryStack stack) {
        return wrap(VkPipelineShaderStageCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineShaderStageCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineShaderStageCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineShaderStageCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkPipelineShaderStageCreateInfo.FLAGS); }
    /** Unsafe version of {@link #stage}. */
    public static int nstage(long struct) { return UNSAFE.getInt(null, struct + VkPipelineShaderStageCreateInfo.STAGE); }
    /** Unsafe version of {@link #module}. */
    public static long nmodule(long struct) { return UNSAFE.getLong(null, struct + VkPipelineShaderStageCreateInfo.MODULE); }
    /** Unsafe version of {@link #pName}. */
    public static ByteBuffer npName(long struct) { return memByteBufferNT1(memGetAddress(struct + VkPipelineShaderStageCreateInfo.PNAME)); }
    /** Unsafe version of {@link #pNameString}. */
    public static String npNameString(long struct) { return memUTF8(memGetAddress(struct + VkPipelineShaderStageCreateInfo.PNAME)); }
    /** Unsafe version of {@link #pSpecializationInfo}. */
    @Nullable public static VkSpecializationInfo npSpecializationInfo(long struct) { return VkSpecializationInfo.createSafe(memGetAddress(struct + VkPipelineShaderStageCreateInfo.PSPECIALIZATIONINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineShaderStageCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineShaderStageCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineShaderStageCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #stage(int) stage}. */
    public static void nstage(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineShaderStageCreateInfo.STAGE, value); }
    /** Unsafe version of {@link #module(long) module}. */
    public static void nmodule(long struct, long value) { UNSAFE.putLong(null, struct + VkPipelineShaderStageCreateInfo.MODULE, value); }
    /** Unsafe version of {@link #pName(ByteBuffer) pName}. */
    public static void npName(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + VkPipelineShaderStageCreateInfo.PNAME, memAddress(value));
    }
    /** Unsafe version of {@link #pSpecializationInfo(VkSpecializationInfo) pSpecializationInfo}. */
    public static void npSpecializationInfo(long struct, @Nullable VkSpecializationInfo value) { memPutAddress(struct + VkPipelineShaderStageCreateInfo.PSPECIALIZATIONINFO, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkPipelineShaderStageCreateInfo.PNAME));
        long pSpecializationInfo = memGetAddress(struct + VkPipelineShaderStageCreateInfo.PSPECIALIZATIONINFO);
        if (pSpecializationInfo != NULL) {
            VkSpecializationInfo.validate(pSpecializationInfo);
        }
    }

    // -----------------------------------

    /** An array of {@link VkPipelineShaderStageCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineShaderStageCreateInfo, Buffer> implements NativeResource {

        private static final VkPipelineShaderStageCreateInfo ELEMENT_FACTORY = VkPipelineShaderStageCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPipelineShaderStageCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineShaderStageCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineShaderStageCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineShaderStageCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineShaderStageCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkPipelineShaderStageCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineShaderStageCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkPipelineShaderStageCreateInfo#flags} field. */
        @NativeType("VkPipelineShaderStageCreateFlags")
        public int flags() { return VkPipelineShaderStageCreateInfo.nflags(address()); }
        /** @return the value of the {@link VkPipelineShaderStageCreateInfo#stage} field. */
        @NativeType("VkShaderStageFlagBits")
        public int stage() { return VkPipelineShaderStageCreateInfo.nstage(address()); }
        /** @return the value of the {@link VkPipelineShaderStageCreateInfo#module} field. */
        @NativeType("VkShaderModule")
        public long module() { return VkPipelineShaderStageCreateInfo.nmodule(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link VkPipelineShaderStageCreateInfo#pName} field. */
        @NativeType("char const *")
        public ByteBuffer pName() { return VkPipelineShaderStageCreateInfo.npName(address()); }
        /** @return the null-terminated string pointed to by the {@link VkPipelineShaderStageCreateInfo#pName} field. */
        @NativeType("char const *")
        public String pNameString() { return VkPipelineShaderStageCreateInfo.npNameString(address()); }
        /** @return a {@link VkSpecializationInfo} view of the struct pointed to by the {@link VkPipelineShaderStageCreateInfo#pSpecializationInfo} field. */
        @Nullable
        @NativeType("VkSpecializationInfo const *")
        public VkSpecializationInfo pSpecializationInfo() { return VkPipelineShaderStageCreateInfo.npSpecializationInfo(address()); }

        /** Sets the specified value to the {@link VkPipelineShaderStageCreateInfo#sType} field. */
        public VkPipelineShaderStageCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineShaderStageCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO} value to the {@link VkPipelineShaderStageCreateInfo#sType} field. */
        public VkPipelineShaderStageCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO); }
        /** Sets the specified value to the {@link VkPipelineShaderStageCreateInfo#pNext} field. */
        public VkPipelineShaderStageCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPipelineShaderStageCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} value to the {@code pNext} chain. */
        public VkPipelineShaderStageCreateInfo.Buffer pNext(VkPipelineShaderStageRequiredSubgroupSizeCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT} value to the {@code pNext} chain. */
        public VkPipelineShaderStageCreateInfo.Buffer pNext(VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkPipelineShaderStageCreateInfo#flags} field. */
        public VkPipelineShaderStageCreateInfo.Buffer flags(@NativeType("VkPipelineShaderStageCreateFlags") int value) { VkPipelineShaderStageCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineShaderStageCreateInfo#stage} field. */
        public VkPipelineShaderStageCreateInfo.Buffer stage(@NativeType("VkShaderStageFlagBits") int value) { VkPipelineShaderStageCreateInfo.nstage(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineShaderStageCreateInfo#module} field. */
        public VkPipelineShaderStageCreateInfo.Buffer module(@NativeType("VkShaderModule") long value) { VkPipelineShaderStageCreateInfo.nmodule(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link VkPipelineShaderStageCreateInfo#pName} field. */
        public VkPipelineShaderStageCreateInfo.Buffer pName(@NativeType("char const *") ByteBuffer value) { VkPipelineShaderStageCreateInfo.npName(address(), value); return this; }
        /** Sets the address of the specified {@link VkSpecializationInfo} to the {@link VkPipelineShaderStageCreateInfo#pSpecializationInfo} field. */
        public VkPipelineShaderStageCreateInfo.Buffer pSpecializationInfo(@Nullable @NativeType("VkSpecializationInfo const *") VkSpecializationInfo value) { VkPipelineShaderStageCreateInfo.npSpecializationInfo(address(), value); return this; }

    }

}