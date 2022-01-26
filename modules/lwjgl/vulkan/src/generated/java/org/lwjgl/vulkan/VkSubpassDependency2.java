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
 * Structure specifying a subpass dependency.
 * 
 * <h5>Description</h5>
 * 
 * <p>Parameters defined by this structure with the same name as those in {@link VkSubpassDependency} have the identical effect to those parameters.</p>
 * 
 * <p>{@code viewOffset} has the same effect for the described subpass dependency as {@link VkRenderPassMultiviewCreateInfo}{@code ::pViewOffsets} has on each corresponding subpass dependency.</p>
 * 
 * <p>If a {@link VkMemoryBarrier2} is included in the {@code pNext} chain, {@code srcStageMask}, {@code dstStageMask}, {@code srcAccessMask}, and {@code dstAccessMask} parameters are ignored. The synchronization and access scopes instead are defined by the parameters of {@link VkMemoryBarrier2}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-geometryShader">geometry shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link VK10#VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link VK10#VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT} or {@link VK10#VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-conditionalRendering">conditional rendering</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link EXTConditionalRendering#VK_PIPELINE_STAGE_CONDITIONAL_RENDERING_BIT_EXT PIPELINE_STAGE_CONDITIONAL_RENDERING_BIT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-fragmentDensityMap">fragment density map</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link EXTFragmentDensityMap#VK_PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-transformFeedback">transform feedback</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link EXTTransformFeedback#VK_PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-meshShader">mesh shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link NVMeshShader#VK_PIPELINE_STAGE_MESH_SHADER_BIT_NV PIPELINE_STAGE_MESH_SHADER_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-taskShader">task shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link NVMeshShader#VK_PIPELINE_STAGE_TASK_SHADER_BIT_NV PIPELINE_STAGE_TASK_SHADER_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-shadingRateImage">shading rate image</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link NVShadingRateImage#VK_PIPELINE_STAGE_SHADING_RATE_IMAGE_BIT_NV PIPELINE_STAGE_SHADING_RATE_IMAGE_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature is not enabled, {@code srcStageMask} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-geometryShader">geometry shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link VK10#VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link VK10#VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT} or {@link VK10#VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-conditionalRendering">conditional rendering</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link EXTConditionalRendering#VK_PIPELINE_STAGE_CONDITIONAL_RENDERING_BIT_EXT PIPELINE_STAGE_CONDITIONAL_RENDERING_BIT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-fragmentDensityMap">fragment density map</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link EXTFragmentDensityMap#VK_PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-transformFeedback">transform feedback</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link EXTTransformFeedback#VK_PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-meshShader">mesh shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link NVMeshShader#VK_PIPELINE_STAGE_MESH_SHADER_BIT_NV PIPELINE_STAGE_MESH_SHADER_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-taskShader">task shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link NVMeshShader#VK_PIPELINE_STAGE_TASK_SHADER_BIT_NV PIPELINE_STAGE_TASK_SHADER_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-shadingRateImage">shading rate image</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link NVShadingRateImage#VK_PIPELINE_STAGE_SHADING_RATE_IMAGE_BIT_NV PIPELINE_STAGE_SHADING_RATE_IMAGE_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature is not enabled, {@code dstStageMask} <b>must</b> not be 0</li>
 * <li>{@code srcSubpass} <b>must</b> be less than or equal to {@code dstSubpass}, unless one of them is {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}, to avoid cyclic dependencies and ensure a valid execution order</li>
 * <li>{@code srcSubpass} and {@code dstSubpass} <b>must</b> not both be equal to {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}</li>
 * <li>If {@code srcSubpass} is equal to {@code dstSubpass} and not all of the stages in {@code srcStageMask} and {@code dstStageMask} are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-framebuffer-regions">framebuffer-space stages</a>, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages-order">logically latest</a> pipeline stage in {@code srcStageMask} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages-order">logically earlier</a> than or equal to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages-order">logically earliest</a> pipeline stage in {@code dstStageMask}</li>
 * <li>Any access flag included in {@code srcAccessMask} <b>must</b> be supported by one of the pipeline stages in {@code srcStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-types-supported">table of supported access types</a></li>
 * <li>Any access flag included in {@code dstAccessMask} <b>must</b> be supported by one of the pipeline stages in {@code dstStageMask}, as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-types-supported">table of supported access types</a></li>
 * <li>If {@code dependencyFlags} includes {@link VK11#VK_DEPENDENCY_VIEW_LOCAL_BIT DEPENDENCY_VIEW_LOCAL_BIT}, {@code srcSubpass} <b>must</b> not be equal to {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}</li>
 * <li>If {@code dependencyFlags} includes {@link VK11#VK_DEPENDENCY_VIEW_LOCAL_BIT DEPENDENCY_VIEW_LOCAL_BIT}, {@code dstSubpass} <b>must</b> not be equal to {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}</li>
 * <li>If {@code srcSubpass} equals {@code dstSubpass}, and {@code srcStageMask} and {@code dstStageMask} both include a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-framebuffer-regions">framebuffer-space stage</a>, then {@code dependencyFlags} <b>must</b> include {@link VK10#VK_DEPENDENCY_BY_REGION_BIT DEPENDENCY_BY_REGION_BIT}</li>
 * <li>If {@code viewOffset} is not equal to 0, {@code srcSubpass} <b>must</b> not be equal to {@code dstSubpass}</li>
 * <li>If {@code dependencyFlags} does not include {@link VK11#VK_DEPENDENCY_VIEW_LOCAL_BIT DEPENDENCY_VIEW_LOCAL_BIT}, {@code viewOffset} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2 STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkMemoryBarrier2}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code srcStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
 * <li>{@code dstStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
 * <li>{@code srcAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits} values</li>
 * <li>{@code dstAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits} values</li>
 * <li>{@code dependencyFlags} <b>must</b> be a valid combination of {@code VkDependencyFlagBits} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRenderPassCreateInfo2}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubpassDependency2 {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #srcSubpass};
 *     uint32_t {@link #dstSubpass};
 *     VkPipelineStageFlags {@link #srcStageMask};
 *     VkPipelineStageFlags {@link #dstStageMask};
 *     VkAccessFlags {@link #srcAccessMask};
 *     VkAccessFlags {@link #dstAccessMask};
 *     VkDependencyFlags {@link #dependencyFlags};
 *     int32_t {@link #viewOffset};
 * }</code></pre>
 */
public class VkSubpassDependency2 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCSUBPASS,
        DSTSUBPASS,
        SRCSTAGEMASK,
        DSTSTAGEMASK,
        SRCACCESSMASK,
        DSTACCESSMASK,
        DEPENDENCYFLAGS,
        VIEWOFFSET;

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
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSUBPASS = layout.offsetof(2);
        DSTSUBPASS = layout.offsetof(3);
        SRCSTAGEMASK = layout.offsetof(4);
        DSTSTAGEMASK = layout.offsetof(5);
        SRCACCESSMASK = layout.offsetof(6);
        DSTACCESSMASK = layout.offsetof(7);
        DEPENDENCYFLAGS = layout.offsetof(8);
        VIEWOFFSET = layout.offsetof(9);
    }

    /**
     * Creates a {@code VkSubpassDependency2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassDependency2(ByteBuffer container) {
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
    /** the subpass index of the first subpass in the dependency, or {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}. */
    @NativeType("uint32_t")
    public int srcSubpass() { return nsrcSubpass(address()); }
    /** the subpass index of the second subpass in the dependency, or {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}. */
    @NativeType("uint32_t")
    public int dstSubpass() { return ndstSubpass(address()); }
    /** a bitmask of {@code VkPipelineStageFlagBits} specifying the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages-masks">source stage mask</a>. */
    @NativeType("VkPipelineStageFlags")
    public int srcStageMask() { return nsrcStageMask(address()); }
    /** a bitmask of {@code VkPipelineStageFlagBits} specifying the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages-masks">destination stage mask</a> */
    @NativeType("VkPipelineStageFlags")
    public int dstStageMask() { return ndstStageMask(address()); }
    /** a bitmask of {@code VkAccessFlagBits} specifying a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-masks">source access mask</a>. */
    @NativeType("VkAccessFlags")
    public int srcAccessMask() { return nsrcAccessMask(address()); }
    /** a bitmask of {@code VkAccessFlagBits} specifying a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-masks">destination access mask</a>. */
    @NativeType("VkAccessFlags")
    public int dstAccessMask() { return ndstAccessMask(address()); }
    /** a bitmask of {@code VkDependencyFlagBits}. */
    @NativeType("VkDependencyFlags")
    public int dependencyFlags() { return ndependencyFlags(address()); }
    /** controls which views in the source subpass the views in the destination subpass depend on. */
    @NativeType("int32_t")
    public int viewOffset() { return nviewOffset(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSubpassDependency2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2 STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2} value to the {@link #sType} field. */
    public VkSubpassDependency2 sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSubpassDependency2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkMemoryBarrier2} value to the {@code pNext} chain. */
    public VkSubpassDependency2 pNext(VkMemoryBarrier2 value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMemoryBarrier2KHR} value to the {@code pNext} chain. */
    public VkSubpassDependency2 pNext(VkMemoryBarrier2KHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #srcSubpass} field. */
    public VkSubpassDependency2 srcSubpass(@NativeType("uint32_t") int value) { nsrcSubpass(address(), value); return this; }
    /** Sets the specified value to the {@link #dstSubpass} field. */
    public VkSubpassDependency2 dstSubpass(@NativeType("uint32_t") int value) { ndstSubpass(address(), value); return this; }
    /** Sets the specified value to the {@link #srcStageMask} field. */
    public VkSubpassDependency2 srcStageMask(@NativeType("VkPipelineStageFlags") int value) { nsrcStageMask(address(), value); return this; }
    /** Sets the specified value to the {@link #dstStageMask} field. */
    public VkSubpassDependency2 dstStageMask(@NativeType("VkPipelineStageFlags") int value) { ndstStageMask(address(), value); return this; }
    /** Sets the specified value to the {@link #srcAccessMask} field. */
    public VkSubpassDependency2 srcAccessMask(@NativeType("VkAccessFlags") int value) { nsrcAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@link #dstAccessMask} field. */
    public VkSubpassDependency2 dstAccessMask(@NativeType("VkAccessFlags") int value) { ndstAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@link #dependencyFlags} field. */
    public VkSubpassDependency2 dependencyFlags(@NativeType("VkDependencyFlags") int value) { ndependencyFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #viewOffset} field. */
    public VkSubpassDependency2 viewOffset(@NativeType("int32_t") int value) { nviewOffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubpassDependency2 set(
        int sType,
        long pNext,
        int srcSubpass,
        int dstSubpass,
        int srcStageMask,
        int dstStageMask,
        int srcAccessMask,
        int dstAccessMask,
        int dependencyFlags,
        int viewOffset
    ) {
        sType(sType);
        pNext(pNext);
        srcSubpass(srcSubpass);
        dstSubpass(dstSubpass);
        srcStageMask(srcStageMask);
        dstStageMask(dstStageMask);
        srcAccessMask(srcAccessMask);
        dstAccessMask(dstAccessMask);
        dependencyFlags(dependencyFlags);
        viewOffset(viewOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubpassDependency2 set(VkSubpassDependency2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubpassDependency2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassDependency2 malloc() {
        return wrap(VkSubpassDependency2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSubpassDependency2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassDependency2 calloc() {
        return wrap(VkSubpassDependency2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSubpassDependency2} instance allocated with {@link BufferUtils}. */
    public static VkSubpassDependency2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSubpassDependency2.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSubpassDependency2} instance for the specified memory address. */
    public static VkSubpassDependency2 create(long address) {
        return wrap(VkSubpassDependency2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassDependency2 createSafe(long address) {
        return address == NULL ? null : wrap(VkSubpassDependency2.class, address);
    }

    /**
     * Returns a new {@link VkSubpassDependency2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDependency2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDependency2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSubpassDependency2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassDependency2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkSubpassDependency2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDependency2 malloc(MemoryStack stack) {
        return wrap(VkSubpassDependency2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSubpassDependency2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDependency2 calloc(MemoryStack stack) {
        return wrap(VkSubpassDependency2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubpassDependency2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDependency2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDependency2.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDependency2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubpassDependency2.PNEXT); }
    /** Unsafe version of {@link #srcSubpass}. */
    public static int nsrcSubpass(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDependency2.SRCSUBPASS); }
    /** Unsafe version of {@link #dstSubpass}. */
    public static int ndstSubpass(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDependency2.DSTSUBPASS); }
    /** Unsafe version of {@link #srcStageMask}. */
    public static int nsrcStageMask(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDependency2.SRCSTAGEMASK); }
    /** Unsafe version of {@link #dstStageMask}. */
    public static int ndstStageMask(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDependency2.DSTSTAGEMASK); }
    /** Unsafe version of {@link #srcAccessMask}. */
    public static int nsrcAccessMask(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDependency2.SRCACCESSMASK); }
    /** Unsafe version of {@link #dstAccessMask}. */
    public static int ndstAccessMask(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDependency2.DSTACCESSMASK); }
    /** Unsafe version of {@link #dependencyFlags}. */
    public static int ndependencyFlags(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDependency2.DEPENDENCYFLAGS); }
    /** Unsafe version of {@link #viewOffset}. */
    public static int nviewOffset(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDependency2.VIEWOFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDependency2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubpassDependency2.PNEXT, value); }
    /** Unsafe version of {@link #srcSubpass(int) srcSubpass}. */
    public static void nsrcSubpass(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDependency2.SRCSUBPASS, value); }
    /** Unsafe version of {@link #dstSubpass(int) dstSubpass}. */
    public static void ndstSubpass(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDependency2.DSTSUBPASS, value); }
    /** Unsafe version of {@link #srcStageMask(int) srcStageMask}. */
    public static void nsrcStageMask(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDependency2.SRCSTAGEMASK, value); }
    /** Unsafe version of {@link #dstStageMask(int) dstStageMask}. */
    public static void ndstStageMask(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDependency2.DSTSTAGEMASK, value); }
    /** Unsafe version of {@link #srcAccessMask(int) srcAccessMask}. */
    public static void nsrcAccessMask(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDependency2.SRCACCESSMASK, value); }
    /** Unsafe version of {@link #dstAccessMask(int) dstAccessMask}. */
    public static void ndstAccessMask(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDependency2.DSTACCESSMASK, value); }
    /** Unsafe version of {@link #dependencyFlags(int) dependencyFlags}. */
    public static void ndependencyFlags(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDependency2.DEPENDENCYFLAGS, value); }
    /** Unsafe version of {@link #viewOffset(int) viewOffset}. */
    public static void nviewOffset(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDependency2.VIEWOFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkSubpassDependency2} structs. */
    public static class Buffer extends StructBuffer<VkSubpassDependency2, Buffer> implements NativeResource {

        private static final VkSubpassDependency2 ELEMENT_FACTORY = VkSubpassDependency2.create(-1L);

        /**
         * Creates a new {@code VkSubpassDependency2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassDependency2#SIZEOF}, and its mark will be undefined.
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
        protected VkSubpassDependency2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSubpassDependency2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubpassDependency2.nsType(address()); }
        /** @return the value of the {@link VkSubpassDependency2#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSubpassDependency2.npNext(address()); }
        /** @return the value of the {@link VkSubpassDependency2#srcSubpass} field. */
        @NativeType("uint32_t")
        public int srcSubpass() { return VkSubpassDependency2.nsrcSubpass(address()); }
        /** @return the value of the {@link VkSubpassDependency2#dstSubpass} field. */
        @NativeType("uint32_t")
        public int dstSubpass() { return VkSubpassDependency2.ndstSubpass(address()); }
        /** @return the value of the {@link VkSubpassDependency2#srcStageMask} field. */
        @NativeType("VkPipelineStageFlags")
        public int srcStageMask() { return VkSubpassDependency2.nsrcStageMask(address()); }
        /** @return the value of the {@link VkSubpassDependency2#dstStageMask} field. */
        @NativeType("VkPipelineStageFlags")
        public int dstStageMask() { return VkSubpassDependency2.ndstStageMask(address()); }
        /** @return the value of the {@link VkSubpassDependency2#srcAccessMask} field. */
        @NativeType("VkAccessFlags")
        public int srcAccessMask() { return VkSubpassDependency2.nsrcAccessMask(address()); }
        /** @return the value of the {@link VkSubpassDependency2#dstAccessMask} field. */
        @NativeType("VkAccessFlags")
        public int dstAccessMask() { return VkSubpassDependency2.ndstAccessMask(address()); }
        /** @return the value of the {@link VkSubpassDependency2#dependencyFlags} field. */
        @NativeType("VkDependencyFlags")
        public int dependencyFlags() { return VkSubpassDependency2.ndependencyFlags(address()); }
        /** @return the value of the {@link VkSubpassDependency2#viewOffset} field. */
        @NativeType("int32_t")
        public int viewOffset() { return VkSubpassDependency2.nviewOffset(address()); }

        /** Sets the specified value to the {@link VkSubpassDependency2#sType} field. */
        public VkSubpassDependency2.Buffer sType(@NativeType("VkStructureType") int value) { VkSubpassDependency2.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2 STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2} value to the {@link VkSubpassDependency2#sType} field. */
        public VkSubpassDependency2.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2); }
        /** Sets the specified value to the {@link VkSubpassDependency2#pNext} field. */
        public VkSubpassDependency2.Buffer pNext(@NativeType("void const *") long value) { VkSubpassDependency2.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkMemoryBarrier2} value to the {@code pNext} chain. */
        public VkSubpassDependency2.Buffer pNext(VkMemoryBarrier2 value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMemoryBarrier2KHR} value to the {@code pNext} chain. */
        public VkSubpassDependency2.Buffer pNext(VkMemoryBarrier2KHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkSubpassDependency2#srcSubpass} field. */
        public VkSubpassDependency2.Buffer srcSubpass(@NativeType("uint32_t") int value) { VkSubpassDependency2.nsrcSubpass(address(), value); return this; }
        /** Sets the specified value to the {@link VkSubpassDependency2#dstSubpass} field. */
        public VkSubpassDependency2.Buffer dstSubpass(@NativeType("uint32_t") int value) { VkSubpassDependency2.ndstSubpass(address(), value); return this; }
        /** Sets the specified value to the {@link VkSubpassDependency2#srcStageMask} field. */
        public VkSubpassDependency2.Buffer srcStageMask(@NativeType("VkPipelineStageFlags") int value) { VkSubpassDependency2.nsrcStageMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkSubpassDependency2#dstStageMask} field. */
        public VkSubpassDependency2.Buffer dstStageMask(@NativeType("VkPipelineStageFlags") int value) { VkSubpassDependency2.ndstStageMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkSubpassDependency2#srcAccessMask} field. */
        public VkSubpassDependency2.Buffer srcAccessMask(@NativeType("VkAccessFlags") int value) { VkSubpassDependency2.nsrcAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkSubpassDependency2#dstAccessMask} field. */
        public VkSubpassDependency2.Buffer dstAccessMask(@NativeType("VkAccessFlags") int value) { VkSubpassDependency2.ndstAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkSubpassDependency2#dependencyFlags} field. */
        public VkSubpassDependency2.Buffer dependencyFlags(@NativeType("VkDependencyFlags") int value) { VkSubpassDependency2.ndependencyFlags(address(), value); return this; }
        /** Sets the specified value to the {@link VkSubpassDependency2#viewOffset} field. */
        public VkSubpassDependency2.Buffer viewOffset(@NativeType("int32_t") int value) { VkSubpassDependency2.nviewOffset(address(), value); return this; }

    }

}