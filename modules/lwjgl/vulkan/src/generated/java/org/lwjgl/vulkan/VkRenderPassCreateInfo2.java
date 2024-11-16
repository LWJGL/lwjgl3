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
 * Structure specifying parameters of a newly created render pass.
 * 
 * <h5>Description</h5>
 * 
 * <p>Parameters defined by this structure with the same name as those in {@link VkRenderPassCreateInfo} have the identical effect to those parameters; the child structures are variants of those used in {@link VkRenderPassCreateInfo} which add {@code sType} and {@code pNext} parameters, allowing them to be extended.</p>
 * 
 * <p>If the {@link VkSubpassDescription2}{@code ::viewMask} member of any element of {@code pSubpasses} is not zero, <em>multiview</em> functionality is considered to be enabled for this render pass.</p>
 * 
 * <p>{@code correlatedViewMaskCount} and {@code pCorrelatedViewMasks} have the same effect as {@link VkRenderPassMultiviewCreateInfo}{@code ::correlationMaskCount} and {@link VkRenderPassMultiviewCreateInfo}{@code ::pCorrelationMasks}, respectively.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If any two subpasses operate on attachments with overlapping ranges of the same {@code VkDeviceMemory} object, and at least one subpass writes to that area of {@code VkDeviceMemory}, a subpass dependency <b>must</b> be included (either directly or via some intermediate subpasses) between them</li>
 * <li>If the {@code attachment} member of any element of {@code pInputAttachments}, {@code pColorAttachments}, {@code pResolveAttachments} or {@code pDepthStencilAttachment}, or the attachment indexed by any element of {@code pPreserveAttachments} in any element of {@code pSubpasses} is bound to a range of a {@code VkDeviceMemory} object that overlaps with any other attachment in any subpass (including the same subpass), the {@link VkAttachmentDescription2} structures describing them <b>must</b> include {@link VK10#VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT} in {@code flags}</li>
 * <li>If the {@code attachment} member of any element of {@code pInputAttachments}, {@code pColorAttachments}, {@code pResolveAttachments} or {@code pDepthStencilAttachment}, or any element of {@code pPreserveAttachments} in any element of {@code pSubpasses} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, then it <b>must</b> be less than {@code attachmentCount}</li>
 * <li>If the pNext chain includes a {@link VkRenderPassFragmentDensityMapCreateInfoEXT} structure and the {@code fragmentDensityMapAttachment} member is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, then {@code attachment} <b>must</b> be less than {@code attachmentCount}</li>
 * <li>If the {@code pSubpasses} pNext chain includes a {@link VkSubpassDescriptionDepthStencilResolve} structure and the {@code pDepthStencilResolveAttachment} member is not {@code NULL} and does not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, then {@code attachment} <b>must</b> be less than {@code attachmentCount}</li>
 * <li>For any member of {@code pAttachments} with a {@code loadOp} equal to {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}, the first use of that attachment <b>must</b> not specify a {@code layout} equal to {@link VK10#VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, or {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}</li>
 * <li>For any member of {@code pAttachments} with a {@code stencilLoadOp} equal to {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}, the first use of that attachment <b>must</b> not specify a {@code layout} equal to {@link VK10#VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, or {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>For any element of {@code pDependencies}, if the {@code srcSubpass} is not {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}, all stage flags included in the {@code srcStageMask} member of that dependency <b>must</b> be a pipeline stage supported by the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages-types">pipeline</a> identified by the {@code pipelineBindPoint} member of the source subpass</li>
 * <li>For any element of {@code pDependencies}, if the {@code dstSubpass} is not {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}, all stage flags included in the {@code dstStageMask} member of that dependency <b>must</b> be a pipeline stage supported by the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages-types">pipeline</a> identified by the {@code pipelineBindPoint} member of the destination subpass</li>
 * <li>The set of bits included in any element of {@code pCorrelatedViewMasks} <b>must</b> not overlap with the set of bits included in any other element of {@code pCorrelatedViewMasks}</li>
 * <li>If the {@link VkSubpassDescription2}{@code ::viewMask} member of all elements of {@code pSubpasses} is 0, {@code correlatedViewMaskCount} <b>must</b> be 0</li>
 * <li>The {@link VkSubpassDescription2}{@code ::viewMask} member of all elements of {@code pSubpasses} <b>must</b> either all be 0, or all not be 0</li>
 * <li>If the {@link VkSubpassDescription2}{@code ::viewMask} member of all elements of {@code pSubpasses} is 0, the {@code dependencyFlags} member of any element of {@code pDependencies} <b>must</b> not include {@link VK11#VK_DEPENDENCY_VIEW_LOCAL_BIT DEPENDENCY_VIEW_LOCAL_BIT}</li>
 * <li>For any element of {@code pDependencies} where its {@code srcSubpass} member equals its {@code dstSubpass} member, if the {@code viewMask} member of the corresponding element of {@code pSubpasses} includes more than one bit, its {@code dependencyFlags} member <b>must</b> include {@link VK11#VK_DEPENDENCY_VIEW_LOCAL_BIT DEPENDENCY_VIEW_LOCAL_BIT}</li>
 * <li>If the {@code attachment} member of any element of the {@code pInputAttachments} member of any element of {@code pSubpasses} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, the {@code aspectMask} member of that element of {@code pInputAttachments} <b>must</b> only include aspects that are present in images of the format specified by the element of {@code pAttachments} specified by {@code attachment}</li>
 * <li>The {@code srcSubpass} member of each element of {@code pDependencies} <b>must</b> be less than {@code subpassCount}</li>
 * <li>The {@code dstSubpass} member of each element of {@code pDependencies} <b>must</b> be less than {@code subpassCount}</li>
 * <li>If any element of {@code pAttachments} is used as a fragment shading rate attachment in any subpass, it <b>must</b> not be used as any other attachment in the render pass</li>
 * <li>If any element of {@code pAttachments} is used as a fragment shading rate attachment, the {@code loadOp} for that attachment <b>must</b> not be {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}</li>
 * <li>If {@code flags} includes {@link QCOMRenderPassTransform#VK_RENDER_PASS_CREATE_TRANSFORM_BIT_QCOM RENDER_PASS_CREATE_TRANSFORM_BIT_QCOM}, an element of {@code pSubpasses} includes an instance of {@link VkFragmentShadingRateAttachmentInfoKHR} in its {@code pNext} chain, and the {@code pFragmentShadingRateAttachment} member of that structure is not equal to {@code NULL}, the {@code attachment} member of {@code pFragmentShadingRateAttachment} <b>must</b> be {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>If any element of {@code pAttachments} is used as a fragment shading rate attachment in any subpass, it <b>must</b> have an image format whose <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#potential-format-features">potential format features</a> contain {@link KHRFragmentShadingRate#VK_FORMAT_FEATURE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR FORMAT_FEATURE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR}</li>
 * <li>If the pipeline is being created with fragment shader state, and the {@code {@link QCOMRenderPassShaderResolve VK_QCOM_render_pass_shader_resolve} extension} is enabled, and if subpass has any input attachments, and if the subpass description contains {@link QCOMRenderPassShaderResolve#VK_SUBPASS_DESCRIPTION_FRAGMENT_REGION_BIT_QCOM SUBPASS_DESCRIPTION_FRAGMENT_REGION_BIT_QCOM}, then the sample count of the input attachments <b>must</b> equal {@code rasterizationSamples}</li>
 * <li>If the pipeline is being created with fragment shader state, and the {@link QCOMRenderPassShaderResolve VK_QCOM_render_pass_shader_resolve} extension is enabled, and if the subpass description contains {@link QCOMRenderPassShaderResolve#VK_SUBPASS_DESCRIPTION_FRAGMENT_REGION_BIT_QCOM SUBPASS_DESCRIPTION_FRAGMENT_REGION_BIT_QCOM}, then {@code sampleShadingEnable} <b>must</b> be false</li>
 * <li>If {@code flags} includes {@link QCOMRenderPassShaderResolve#VK_SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM}, and if {@code pResolveAttachments} is not {@code NULL}, then each resolve attachment <b>must</b> be {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>If {@code flags} includes {@link QCOMRenderPassShaderResolve#VK_SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM}, and if {@code pDepthStencilResolveAttachment} is not {@code NULL}, then the depth/stencil resolve attachment <b>must</b> be {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>If {@code flags} includes {@link QCOMRenderPassShaderResolve#VK_SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM}, then the subpass <b>must</b> be the last subpass in a subpass dependency chain</li>
 * <li>If the {@code attachment} member of the {@code pDepthStencilAttachment} member of an element of {@code pSubpasses} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, the {@code layout} member of that same structure is either {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, and the {@code pNext} chain of that structure does not include a {@link VkAttachmentReferenceStencilLayout} structure, then the element of {@code pAttachments} with an index equal to {@code attachment} <b>must</b> not have a {@code format} that includes both depth and stencil components</li>
 * <li>If the {@code attachment} member of the {@code pDepthStencilAttachment} member of an element of {@code pSubpasses} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} and the {@code layout} member of that same structure is either {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}, then the element of {@code pAttachments} with an index equal to {@code attachment} <b>must</b> have a {@code format} that includes only a stencil component</li>
 * <li>If the {@code attachment} member of the {@code pDepthStencilAttachment} member of an element of {@code pSubpasses} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} and the {@code layout} member of that same structure is either {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, then the element of {@code pAttachments} with an index equal to {@code attachment} <b>must</b> not have a {@code format} that includes only a stencil component</li>
 * <li>If any element of {@code pResolveAttachments} of any element of {@code pSubpasses} references an attachment description with a format of {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}, {@link VkRenderPassFragmentDensityMapCreateInfoEXT}{@code ::fragmentDensityMapAttachment→attachment} <b>must</b> be {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2 STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkRenderPassCreationControlEXT}, {@link VkRenderPassCreationFeedbackCreateInfoEXT}, or {@link VkRenderPassFragmentDensityMapCreateInfoEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkRenderPassCreateFlagBits} values</li>
 * <li>If {@code attachmentCount} is not 0, {@code pAttachments} <b>must</b> be a valid pointer to an array of {@code attachmentCount} valid {@link VkAttachmentDescription2} structures</li>
 * <li>{@code pSubpasses} <b>must</b> be a valid pointer to an array of {@code subpassCount} valid {@link VkSubpassDescription2} structures</li>
 * <li>If {@code dependencyCount} is not 0, {@code pDependencies} <b>must</b> be a valid pointer to an array of {@code dependencyCount} valid {@link VkSubpassDependency2} structures</li>
 * <li>If {@code correlatedViewMaskCount} is not 0, {@code pCorrelatedViewMasks} <b>must</b> be a valid pointer to an array of {@code correlatedViewMaskCount} {@code uint32_t} values</li>
 * <li>{@code subpassCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAttachmentDescription2}, {@link VkSubpassDependency2}, {@link VkSubpassDescription2}, {@link VK12#vkCreateRenderPass2 CreateRenderPass2}, {@link KHRCreateRenderpass2#vkCreateRenderPass2KHR CreateRenderPass2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderPassCreateInfo2 {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkRenderPassCreateFlags {@link #flags};
 *     uint32_t {@link #attachmentCount};
 *     {@link VkAttachmentDescription2 VkAttachmentDescription2} const * {@link #pAttachments};
 *     uint32_t {@link #subpassCount};
 *     {@link VkSubpassDescription2 VkSubpassDescription2} const * {@link #pSubpasses};
 *     uint32_t {@link #dependencyCount};
 *     {@link VkSubpassDependency2 VkSubpassDependency2} const * {@link #pDependencies};
 *     uint32_t {@link #correlatedViewMaskCount};
 *     uint32_t const * {@link #pCorrelatedViewMasks};
 * }</code></pre>
 */
public class VkRenderPassCreateInfo2 extends Struct<VkRenderPassCreateInfo2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        ATTACHMENTCOUNT,
        PATTACHMENTS,
        SUBPASSCOUNT,
        PSUBPASSES,
        DEPENDENCYCOUNT,
        PDEPENDENCIES,
        CORRELATEDVIEWMASKCOUNT,
        PCORRELATEDVIEWMASKS;

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
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        ATTACHMENTCOUNT = layout.offsetof(3);
        PATTACHMENTS = layout.offsetof(4);
        SUBPASSCOUNT = layout.offsetof(5);
        PSUBPASSES = layout.offsetof(6);
        DEPENDENCYCOUNT = layout.offsetof(7);
        PDEPENDENCIES = layout.offsetof(8);
        CORRELATEDVIEWMASKCOUNT = layout.offsetof(9);
        PCORRELATEDVIEWMASKS = layout.offsetof(10);
    }

    protected VkRenderPassCreateInfo2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderPassCreateInfo2 create(long address, @Nullable ByteBuffer container) {
        return new VkRenderPassCreateInfo2(address, container);
    }

    /**
     * Creates a {@code VkRenderPassCreateInfo2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassCreateInfo2(ByteBuffer container) {
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
    /** reserved for future use. */
    @NativeType("VkRenderPassCreateFlags")
    public int flags() { return nflags(address()); }
    /** the number of attachments used by this render pass. */
    @NativeType("uint32_t")
    public int attachmentCount() { return nattachmentCount(address()); }
    /** a pointer to an array of {@code attachmentCount} {@link VkAttachmentDescription2} structures describing the attachments used by the render pass. */
    @NativeType("VkAttachmentDescription2 const *")
    public VkAttachmentDescription2.@Nullable Buffer pAttachments() { return npAttachments(address()); }
    /** the number of subpasses to create. */
    @NativeType("uint32_t")
    public int subpassCount() { return nsubpassCount(address()); }
    /** a pointer to an array of {@code subpassCount} {@link VkSubpassDescription2} structures describing each subpass. */
    @NativeType("VkSubpassDescription2 const *")
    public VkSubpassDescription2.Buffer pSubpasses() { return npSubpasses(address()); }
    /** the number of dependencies between pairs of subpasses. */
    @NativeType("uint32_t")
    public int dependencyCount() { return ndependencyCount(address()); }
    /** a pointer to an array of {@code dependencyCount} {@link VkSubpassDependency2} structures describing dependencies between pairs of subpasses. */
    @NativeType("VkSubpassDependency2 const *")
    public VkSubpassDependency2.@Nullable Buffer pDependencies() { return npDependencies(address()); }
    /** the number of correlation masks. */
    @NativeType("uint32_t")
    public int correlatedViewMaskCount() { return ncorrelatedViewMaskCount(address()); }
    /** a pointer to an array of view masks indicating sets of views that <b>may</b> be more efficient to render concurrently. */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pCorrelatedViewMasks() { return npCorrelatedViewMasks(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkRenderPassCreateInfo2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2 STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2} value to the {@link #sType} field. */
    public VkRenderPassCreateInfo2 sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkRenderPassCreateInfo2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkRenderPassCreationControlEXT} value to the {@code pNext} chain. */
    public VkRenderPassCreateInfo2 pNext(VkRenderPassCreationControlEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderPassCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
    public VkRenderPassCreateInfo2 pNext(VkRenderPassCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkRenderPassFragmentDensityMapCreateInfoEXT} value to the {@code pNext} chain. */
    public VkRenderPassCreateInfo2 pNext(VkRenderPassFragmentDensityMapCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkRenderPassCreateInfo2 flags(@NativeType("VkRenderPassCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentDescription2.Buffer} to the {@link #pAttachments} field. */
    public VkRenderPassCreateInfo2 pAttachments(@NativeType("VkAttachmentDescription2 const *") VkAttachmentDescription2.@Nullable Buffer value) { npAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkSubpassDescription2.Buffer} to the {@link #pSubpasses} field. */
    public VkRenderPassCreateInfo2 pSubpasses(@NativeType("VkSubpassDescription2 const *") VkSubpassDescription2.Buffer value) { npSubpasses(address(), value); return this; }
    /** Sets the address of the specified {@link VkSubpassDependency2.Buffer} to the {@link #pDependencies} field. */
    public VkRenderPassCreateInfo2 pDependencies(@NativeType("VkSubpassDependency2 const *") VkSubpassDependency2.@Nullable Buffer value) { npDependencies(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pCorrelatedViewMasks} field. */
    public VkRenderPassCreateInfo2 pCorrelatedViewMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npCorrelatedViewMasks(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassCreateInfo2 set(
        int sType,
        long pNext,
        int flags,
        VkAttachmentDescription2.@Nullable Buffer pAttachments,
        VkSubpassDescription2.Buffer pSubpasses,
        VkSubpassDependency2.@Nullable Buffer pDependencies,
        @Nullable IntBuffer pCorrelatedViewMasks
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pAttachments(pAttachments);
        pSubpasses(pSubpasses);
        pDependencies(pDependencies);
        pCorrelatedViewMasks(pCorrelatedViewMasks);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassCreateInfo2 set(VkRenderPassCreateInfo2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassCreateInfo2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassCreateInfo2 malloc() {
        return new VkRenderPassCreateInfo2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassCreateInfo2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassCreateInfo2 calloc() {
        return new VkRenderPassCreateInfo2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassCreateInfo2} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassCreateInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassCreateInfo2(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassCreateInfo2} instance for the specified memory address. */
    public static VkRenderPassCreateInfo2 create(long address) {
        return new VkRenderPassCreateInfo2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRenderPassCreateInfo2 createSafe(long address) {
        return address == NULL ? null : new VkRenderPassCreateInfo2(address, null);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderPassCreateInfo2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRenderPassCreateInfo2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRenderPassCreateInfo2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassCreateInfo2 malloc(MemoryStack stack) {
        return new VkRenderPassCreateInfo2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderPassCreateInfo2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassCreateInfo2 calloc(MemoryStack stack) {
        return new VkRenderPassCreateInfo2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreateInfo2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreateInfo2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRenderPassCreateInfo2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassCreateInfo2.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkRenderPassCreateInfo2.FLAGS); }
    /** Unsafe version of {@link #attachmentCount}. */
    public static int nattachmentCount(long struct) { return memGetInt(struct + VkRenderPassCreateInfo2.ATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pAttachments}. */
    public static VkAttachmentDescription2.@Nullable Buffer npAttachments(long struct) { return VkAttachmentDescription2.createSafe(memGetAddress(struct + VkRenderPassCreateInfo2.PATTACHMENTS), nattachmentCount(struct)); }
    /** Unsafe version of {@link #subpassCount}. */
    public static int nsubpassCount(long struct) { return memGetInt(struct + VkRenderPassCreateInfo2.SUBPASSCOUNT); }
    /** Unsafe version of {@link #pSubpasses}. */
    public static VkSubpassDescription2.Buffer npSubpasses(long struct) { return VkSubpassDescription2.create(memGetAddress(struct + VkRenderPassCreateInfo2.PSUBPASSES), nsubpassCount(struct)); }
    /** Unsafe version of {@link #dependencyCount}. */
    public static int ndependencyCount(long struct) { return memGetInt(struct + VkRenderPassCreateInfo2.DEPENDENCYCOUNT); }
    /** Unsafe version of {@link #pDependencies}. */
    public static VkSubpassDependency2.@Nullable Buffer npDependencies(long struct) { return VkSubpassDependency2.createSafe(memGetAddress(struct + VkRenderPassCreateInfo2.PDEPENDENCIES), ndependencyCount(struct)); }
    /** Unsafe version of {@link #correlatedViewMaskCount}. */
    public static int ncorrelatedViewMaskCount(long struct) { return memGetInt(struct + VkRenderPassCreateInfo2.CORRELATEDVIEWMASKCOUNT); }
    /** Unsafe version of {@link #pCorrelatedViewMasks() pCorrelatedViewMasks}. */
    public static @Nullable IntBuffer npCorrelatedViewMasks(long struct) { return memIntBufferSafe(memGetAddress(struct + VkRenderPassCreateInfo2.PCORRELATEDVIEWMASKS), ncorrelatedViewMaskCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassCreateInfo2.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo2.FLAGS, value); }
    /** Sets the specified value to the {@code attachmentCount} field of the specified {@code struct}. */
    public static void nattachmentCount(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo2.ATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pAttachments(VkAttachmentDescription2.Buffer) pAttachments}. */
    public static void npAttachments(long struct, VkAttachmentDescription2.@Nullable Buffer value) { memPutAddress(struct + VkRenderPassCreateInfo2.PATTACHMENTS, memAddressSafe(value)); nattachmentCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code subpassCount} field of the specified {@code struct}. */
    public static void nsubpassCount(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo2.SUBPASSCOUNT, value); }
    /** Unsafe version of {@link #pSubpasses(VkSubpassDescription2.Buffer) pSubpasses}. */
    public static void npSubpasses(long struct, VkSubpassDescription2.Buffer value) { memPutAddress(struct + VkRenderPassCreateInfo2.PSUBPASSES, value.address()); nsubpassCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code dependencyCount} field of the specified {@code struct}. */
    public static void ndependencyCount(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo2.DEPENDENCYCOUNT, value); }
    /** Unsafe version of {@link #pDependencies(VkSubpassDependency2.Buffer) pDependencies}. */
    public static void npDependencies(long struct, VkSubpassDependency2.@Nullable Buffer value) { memPutAddress(struct + VkRenderPassCreateInfo2.PDEPENDENCIES, memAddressSafe(value)); ndependencyCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code correlatedViewMaskCount} field of the specified {@code struct}. */
    public static void ncorrelatedViewMaskCount(long struct, int value) { memPutInt(struct + VkRenderPassCreateInfo2.CORRELATEDVIEWMASKCOUNT, value); }
    /** Unsafe version of {@link #pCorrelatedViewMasks(IntBuffer) pCorrelatedViewMasks}. */
    public static void npCorrelatedViewMasks(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkRenderPassCreateInfo2.PCORRELATEDVIEWMASKS, memAddressSafe(value)); ncorrelatedViewMaskCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nattachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderPassCreateInfo2.PATTACHMENTS));
        }
        int subpassCount = nsubpassCount(struct);
        long pSubpasses = memGetAddress(struct + VkRenderPassCreateInfo2.PSUBPASSES);
        check(pSubpasses);
        validate(pSubpasses, subpassCount, VkSubpassDescription2.SIZEOF, VkSubpassDescription2::validate);
        if (ndependencyCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderPassCreateInfo2.PDEPENDENCIES));
        }
        if (ncorrelatedViewMaskCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderPassCreateInfo2.PCORRELATEDVIEWMASKS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkRenderPassCreateInfo2} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassCreateInfo2, Buffer> implements NativeResource {

        private static final VkRenderPassCreateInfo2 ELEMENT_FACTORY = VkRenderPassCreateInfo2.create(-1L);

        /**
         * Creates a new {@code VkRenderPassCreateInfo2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassCreateInfo2#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderPassCreateInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkRenderPassCreateInfo2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassCreateInfo2.nsType(address()); }
        /** @return the value of the {@link VkRenderPassCreateInfo2#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassCreateInfo2.npNext(address()); }
        /** @return the value of the {@link VkRenderPassCreateInfo2#flags} field. */
        @NativeType("VkRenderPassCreateFlags")
        public int flags() { return VkRenderPassCreateInfo2.nflags(address()); }
        /** @return the value of the {@link VkRenderPassCreateInfo2#attachmentCount} field. */
        @NativeType("uint32_t")
        public int attachmentCount() { return VkRenderPassCreateInfo2.nattachmentCount(address()); }
        /** @return a {@link VkAttachmentDescription2.Buffer} view of the struct array pointed to by the {@link VkRenderPassCreateInfo2#pAttachments} field. */
        @NativeType("VkAttachmentDescription2 const *")
        public VkAttachmentDescription2.@Nullable Buffer pAttachments() { return VkRenderPassCreateInfo2.npAttachments(address()); }
        /** @return the value of the {@link VkRenderPassCreateInfo2#subpassCount} field. */
        @NativeType("uint32_t")
        public int subpassCount() { return VkRenderPassCreateInfo2.nsubpassCount(address()); }
        /** @return a {@link VkSubpassDescription2.Buffer} view of the struct array pointed to by the {@link VkRenderPassCreateInfo2#pSubpasses} field. */
        @NativeType("VkSubpassDescription2 const *")
        public VkSubpassDescription2.Buffer pSubpasses() { return VkRenderPassCreateInfo2.npSubpasses(address()); }
        /** @return the value of the {@link VkRenderPassCreateInfo2#dependencyCount} field. */
        @NativeType("uint32_t")
        public int dependencyCount() { return VkRenderPassCreateInfo2.ndependencyCount(address()); }
        /** @return a {@link VkSubpassDependency2.Buffer} view of the struct array pointed to by the {@link VkRenderPassCreateInfo2#pDependencies} field. */
        @NativeType("VkSubpassDependency2 const *")
        public VkSubpassDependency2.@Nullable Buffer pDependencies() { return VkRenderPassCreateInfo2.npDependencies(address()); }
        /** @return the value of the {@link VkRenderPassCreateInfo2#correlatedViewMaskCount} field. */
        @NativeType("uint32_t")
        public int correlatedViewMaskCount() { return VkRenderPassCreateInfo2.ncorrelatedViewMaskCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkRenderPassCreateInfo2#pCorrelatedViewMasks} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pCorrelatedViewMasks() { return VkRenderPassCreateInfo2.npCorrelatedViewMasks(address()); }

        /** Sets the specified value to the {@link VkRenderPassCreateInfo2#sType} field. */
        public VkRenderPassCreateInfo2.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassCreateInfo2.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2 STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2} value to the {@link VkRenderPassCreateInfo2#sType} field. */
        public VkRenderPassCreateInfo2.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2); }
        /** Sets the specified value to the {@link VkRenderPassCreateInfo2#pNext} field. */
        public VkRenderPassCreateInfo2.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassCreateInfo2.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkRenderPassCreationControlEXT} value to the {@code pNext} chain. */
        public VkRenderPassCreateInfo2.Buffer pNext(VkRenderPassCreationControlEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderPassCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
        public VkRenderPassCreateInfo2.Buffer pNext(VkRenderPassCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkRenderPassFragmentDensityMapCreateInfoEXT} value to the {@code pNext} chain. */
        public VkRenderPassCreateInfo2.Buffer pNext(VkRenderPassFragmentDensityMapCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkRenderPassCreateInfo2#flags} field. */
        public VkRenderPassCreateInfo2.Buffer flags(@NativeType("VkRenderPassCreateFlags") int value) { VkRenderPassCreateInfo2.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentDescription2.Buffer} to the {@link VkRenderPassCreateInfo2#pAttachments} field. */
        public VkRenderPassCreateInfo2.Buffer pAttachments(@NativeType("VkAttachmentDescription2 const *") VkAttachmentDescription2.@Nullable Buffer value) { VkRenderPassCreateInfo2.npAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkSubpassDescription2.Buffer} to the {@link VkRenderPassCreateInfo2#pSubpasses} field. */
        public VkRenderPassCreateInfo2.Buffer pSubpasses(@NativeType("VkSubpassDescription2 const *") VkSubpassDescription2.Buffer value) { VkRenderPassCreateInfo2.npSubpasses(address(), value); return this; }
        /** Sets the address of the specified {@link VkSubpassDependency2.Buffer} to the {@link VkRenderPassCreateInfo2#pDependencies} field. */
        public VkRenderPassCreateInfo2.Buffer pDependencies(@NativeType("VkSubpassDependency2 const *") VkSubpassDependency2.@Nullable Buffer value) { VkRenderPassCreateInfo2.npDependencies(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkRenderPassCreateInfo2#pCorrelatedViewMasks} field. */
        public VkRenderPassCreateInfo2.Buffer pCorrelatedViewMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkRenderPassCreateInfo2.npCorrelatedViewMasks(address(), value); return this; }

    }

}