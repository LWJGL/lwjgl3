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
 * Structure specifying a subpass description.
 * 
 * <h5>Description</h5>
 * 
 * <p>Each element of the {@code pInputAttachments} array corresponds to an input attachment index in a fragment shader, i.e. if a shader declares an image variable decorated with a {@code InputAttachmentIndex} value of <b>X</b>, then it uses the attachment provided in {@code pInputAttachments}[<b>X</b>]. Input attachments <b>must</b> also be bound to the pipeline in a descriptor set. If the {@code attachment} member of any element of {@code pInputAttachments} is {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, the application <b>must</b> not read from the corresponding input attachment index. Fragment shaders <b>can</b> use subpass input variables to access the contents of an input attachment at the fragment’s (x, y, layer) framebuffer coordinates. Input attachments <b>must</b> not be used by any subpasses within a render pass that enables <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vertexpostproc-renderpass-transform">render pass transform</a>.</p>
 * 
 * <p>Each element of the {@code pColorAttachments} array corresponds to an output location in the shader, i.e. if the shader declares an output variable decorated with a {@code Location} value of <b>X</b>, then it uses the attachment provided in {@code pColorAttachments}[<b>X</b>]. If the {@code attachment} member of any element of {@code pColorAttachments} is {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, or if <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#framebuffer-color-write-enable">Color Write Enable</a> has been disabled for the corresponding attachment index, then writes to the corresponding location by a fragment shader are discarded.</p>
 * 
 * <p>If {@code flags} does not include {@link QCOMRenderPassShaderResolve#VK_SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM}, and if {@code pResolveAttachments} is not {@code NULL}, each of its elements corresponds to a color attachment (the element in {@code pColorAttachments} at the same index), and a multisample resolve operation is defined for each attachment. At the end of each subpass, multisample resolve operations read the subpass’s color attachments, and resolve the samples for each pixel within the render area to the same pixel location in the corresponding resolve attachments, unless the resolve attachment index is {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}.</p>
 * 
 * <p>Similarly, if {@code flags} does not include {@link QCOMRenderPassShaderResolve#VK_SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM}, and {@link VkSubpassDescriptionDepthStencilResolve}{@code ::pDepthStencilResolveAttachment} is not {@code NULL} and does not have the value {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, it corresponds to the depth/stencil attachment in {@code pDepthStencilAttachment}, and multisample resolve operations for depth and stencil are defined by {@link VkSubpassDescriptionDepthStencilResolve}{@code ::depthResolveMode} and {@link VkSubpassDescriptionDepthStencilResolve}{@code ::stencilResolveMode}, respectively. At the end of each subpass, multisample resolve operations read the subpass’s depth/stencil attachment, and resolve the samples for each pixel to the same pixel location in the corresponding resolve attachment. If {@link VkSubpassDescriptionDepthStencilResolve}{@code ::depthResolveMode} is {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}, then the depth component of the resolve attachment is not written to and its contents are preserved. Similarly, if {@link VkSubpassDescriptionDepthStencilResolve}{@code ::stencilResolveMode} is {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}, then the stencil component of the resolve attachment is not written to and its contents are preserved. {@link VkSubpassDescriptionDepthStencilResolve}{@code ::depthResolveMode} is ignored if the {@code VkFormat} of the {@code pDepthStencilResolveAttachment} does not have a depth component. Similarly, {@link VkSubpassDescriptionDepthStencilResolve}{@code ::stencilResolveMode} is ignored if the {@code VkFormat} of the {@code pDepthStencilResolveAttachment} does not have a stencil component.</p>
 * 
 * <p>If the image subresource range referenced by the depth/stencil attachment is created with {@link EXTSampleLocations#VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT}, then the multisample resolve operation uses the sample locations state specified in the {@code sampleLocationsInfo} member of the element of the {@link VkRenderPassSampleLocationsBeginInfoEXT}{@code ::pPostSubpassSampleLocations} for the subpass.</p>
 * 
 * <p>If {@code pDepthStencilAttachment} is {@code NULL}, or if its attachment index is {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, it indicates that no depth/stencil attachment will be used in the subpass.</p>
 * 
 * <p>The contents of an attachment within the render area become undefined at the start of a subpass <b>S</b> if all of the following conditions are true:</p>
 * 
 * <ul>
 * <li>The attachment is used as a color, depth/stencil, or resolve attachment in any subpass in the render pass.</li>
 * <li>There is a subpass <b>S<sub>1</sub></b> that uses or preserves the attachment, and a subpass dependency from <b>S<sub>1</sub></b> to <b>S</b>.</li>
 * <li>The attachment is not used or preserved in subpass <b>S</b>.</li>
 * </ul>
 * 
 * <p>In addition, the contents of an attachment within the render area become undefined at the start of a subpass <b>S</b> if all of the following conditions are true:</p>
 * 
 * <ul>
 * <li>{@link QCOMRenderPassShaderResolve#VK_SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM} is set.</li>
 * <li>The attachment is used as a color or depth/stencil in the subpass.</li>
 * </ul>
 * 
 * <p>Once the contents of an attachment become undefined in subpass <b>S</b>, they remain undefined for subpasses in subpass dependency chains starting with subpass <b>S</b> until they are written again. However, they remain valid for subpasses in other subpass dependency chains starting with subpass <b>S<sub>1</sub></b> if those subpasses use or preserve the attachment.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code pipelineBindPoint} <b>must</b> be {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} or {@link HUAWEISubpassShading#VK_PIPELINE_BIND_POINT_SUBPASS_SHADING_HUAWEI PIPELINE_BIND_POINT_SUBPASS_SHADING_HUAWEI}</li>
 * <li>{@code colorAttachmentCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxColorAttachments}</li>
 * <li>If the first use of an attachment in this render pass is as an input attachment, and the attachment is not also used as a color or depth/stencil attachment in the same subpass, then {@code loadOp} <b>must</b> not be {@link VK10#VK_ATTACHMENT_LOAD_OP_CLEAR ATTACHMENT_LOAD_OP_CLEAR}</li>
 * <li>If {@code pResolveAttachments} is not {@code NULL}, for each resolve attachment that is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, the corresponding color attachment <b>must</b> not be {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>If {@code pResolveAttachments} is not {@code NULL}, for each resolve attachment that is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, the corresponding color attachment <b>must</b> not have a sample count of {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>If {@code pResolveAttachments} is not {@code NULL}, each resolve attachment that is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> have a sample count of {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>If {@code pResolveAttachments} is not {@code NULL}, each resolve attachment that is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> have the same {@code VkFormat} as its corresponding color attachment</li>
 * <li>All attachments in {@code pColorAttachments} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> have the same sample count</li>
 * <li>All attachments in {@code pInputAttachments} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> have image formats whose <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#potential-format-features">potential format features</a> contain at least {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT} or {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>All attachments in {@code pColorAttachments} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> have image formats whose <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#potential-format-features">potential format features</a> contain {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT}</li>
 * <li>All attachments in {@code pResolveAttachments} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> have image formats whose <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#potential-format-features">potential format features</a> contain {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BIT}</li>
 * <li>If {@code pDepthStencilAttachment} is not {@code NULL} and the attachment is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} then it <b>must</b> have an image format whose <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#potential-format-features">potential format features</a> contain {@link VK10#VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-linearColorAttachment">{@code linearColorAttachment}</a> feature is enabled and the image is created with {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, all attachments in {@code pInputAttachments} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> have image formats whose <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#potential-format-features">potential format features</a> <b>must</b> contain {@link NVLinearColorAttachment#VK_FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-linearColorAttachment">{@code linearColorAttachment}</a> feature is enabled and the image is created with {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, all attachments in {@code pColorAttachments} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> have image formats whose <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#potential-format-features">potential format features</a> <b>must</b> contain {@link NVLinearColorAttachment#VK_FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-linearColorAttachment">{@code linearColorAttachment}</a> feature is enabled and the image is created with {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}, all attachments in {@code pResolveAttachments} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> have image formats whose <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#potential-format-features">potential format features</a> <b>must</b> contain {@link NVLinearColorAttachment#VK_FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV}</li>
 * <li>If the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} extension is enabled, and all attachments in {@code pColorAttachments} that are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} <b>must</b> have a sample count that is smaller than or equal to the sample count of {@code pDepthStencilAttachment} if it is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>If neither the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} nor the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extensions are enabled, and if {@code pDepthStencilAttachment} is not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED} and any attachments in {@code pColorAttachments} are not {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}, they <b>must</b> have the same sample count</li>
 * <li>Each element of {@code pPreserveAttachments} <b>must</b> not be {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>Each element of {@code pPreserveAttachments} <b>must</b> not also be an element of any other member of the subpass description</li>
 * <li>If any attachment is used by more than one {@link VkAttachmentReference} member, then each use <b>must</b> use the same {@code layout}</li>
 * <li>Each attachment <b>must</b> follow the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#attachment-type-imagelayout">image layout requirements</a> specified for its attachment type</li>
 * <li>If {@code flags} includes {@link NVXMultiviewPerViewAttributes#VK_SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX}, it <b>must</b> also include {@link NVXMultiviewPerViewAttributes#VK_SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX}</li>
 * <li>If {@code flags} includes {@link QCOMRenderPassShaderResolve#VK_SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM}, and if {@code pResolveAttachments} is not {@code NULL}, then each resolve attachment <b>must</b> be {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>If {@code flags} includes {@link QCOMRenderPassShaderResolve#VK_SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM}, then the subpass <b>must</b> be the last subpass in a subpass dependency chain</li>
 * <li>If the render pass is created with {@link QCOMRenderPassTransform#VK_RENDER_PASS_CREATE_TRANSFORM_BIT_QCOM RENDER_PASS_CREATE_TRANSFORM_BIT_QCOM} each of the elements of {@code pInputAttachments} <b>must</b> be {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}</li>
 * <li>{@code pDepthStencilAttachment} and {@code pColorAttachments} must not contain references to the same attachment</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkSubpassDescriptionFlagBits} values</li>
 * <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
 * <li>If {@code inputAttachmentCount} is not 0, {@code pInputAttachments} <b>must</b> be a valid pointer to an array of {@code inputAttachmentCount} valid {@link VkAttachmentReference} structures</li>
 * <li>If {@code colorAttachmentCount} is not 0, {@code pColorAttachments} <b>must</b> be a valid pointer to an array of {@code colorAttachmentCount} valid {@link VkAttachmentReference} structures</li>
 * <li>If {@code colorAttachmentCount} is not 0, and {@code pResolveAttachments} is not {@code NULL}, {@code pResolveAttachments} <b>must</b> be a valid pointer to an array of {@code colorAttachmentCount} valid {@link VkAttachmentReference} structures</li>
 * <li>If {@code pDepthStencilAttachment} is not {@code NULL}, {@code pDepthStencilAttachment} <b>must</b> be a valid pointer to a valid {@link VkAttachmentReference} structure</li>
 * <li>If {@code preserveAttachmentCount} is not 0, {@code pPreserveAttachments} <b>must</b> be a valid pointer to an array of {@code preserveAttachmentCount} {@code uint32_t} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAttachmentReference}, {@link VkRenderPassCreateInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubpassDescription {
 *     VkSubpassDescriptionFlags {@link #flags};
 *     VkPipelineBindPoint {@link #pipelineBindPoint};
 *     uint32_t {@link #inputAttachmentCount};
 *     {@link VkAttachmentReference VkAttachmentReference} const * {@link #pInputAttachments};
 *     uint32_t {@link #colorAttachmentCount};
 *     {@link VkAttachmentReference VkAttachmentReference} const * {@link #pColorAttachments};
 *     {@link VkAttachmentReference VkAttachmentReference} const * {@link #pResolveAttachments};
 *     {@link VkAttachmentReference VkAttachmentReference} const * {@link #pDepthStencilAttachment};
 *     uint32_t {@link #preserveAttachmentCount};
 *     uint32_t const * {@link #pPreserveAttachments};
 * }</code></pre>
 */
public class VkSubpassDescription extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        PIPELINEBINDPOINT,
        INPUTATTACHMENTCOUNT,
        PINPUTATTACHMENTS,
        COLORATTACHMENTCOUNT,
        PCOLORATTACHMENTS,
        PRESOLVEATTACHMENTS,
        PDEPTHSTENCILATTACHMENT,
        PRESERVEATTACHMENTCOUNT,
        PPRESERVEATTACHMENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        PIPELINEBINDPOINT = layout.offsetof(1);
        INPUTATTACHMENTCOUNT = layout.offsetof(2);
        PINPUTATTACHMENTS = layout.offsetof(3);
        COLORATTACHMENTCOUNT = layout.offsetof(4);
        PCOLORATTACHMENTS = layout.offsetof(5);
        PRESOLVEATTACHMENTS = layout.offsetof(6);
        PDEPTHSTENCILATTACHMENT = layout.offsetof(7);
        PRESERVEATTACHMENTCOUNT = layout.offsetof(8);
        PPRESERVEATTACHMENTS = layout.offsetof(9);
    }

    /**
     * Creates a {@code VkSubpassDescription} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassDescription(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a bitmask of {@code VkSubpassDescriptionFlagBits} specifying usage of the subpass. */
    @NativeType("VkSubpassDescriptionFlags")
    public int flags() { return nflags(address()); }
    /** a {@code VkPipelineBindPoint} value specifying the pipeline type supported for this subpass. */
    @NativeType("VkPipelineBindPoint")
    public int pipelineBindPoint() { return npipelineBindPoint(address()); }
    /** the number of input attachments. */
    @NativeType("uint32_t")
    public int inputAttachmentCount() { return ninputAttachmentCount(address()); }
    /** a pointer to an array of {@link VkAttachmentReference} structures defining the input attachments for this subpass and their layouts. */
    @Nullable
    @NativeType("VkAttachmentReference const *")
    public VkAttachmentReference.Buffer pInputAttachments() { return npInputAttachments(address()); }
    /** the number of color attachments. */
    @NativeType("uint32_t")
    public int colorAttachmentCount() { return ncolorAttachmentCount(address()); }
    /** a pointer to an array of {@code colorAttachmentCount} {@link VkAttachmentReference} structures defining the color attachments for this subpass and their layouts. */
    @Nullable
    @NativeType("VkAttachmentReference const *")
    public VkAttachmentReference.Buffer pColorAttachments() { return npColorAttachments(address()); }
    /** {@code NULL} or a pointer to an array of {@code colorAttachmentCount} {@link VkAttachmentReference} structures defining the resolve attachments for this subpass and their layouts. */
    @Nullable
    @NativeType("VkAttachmentReference const *")
    public VkAttachmentReference.Buffer pResolveAttachments() { return npResolveAttachments(address()); }
    /** a pointer to a {@link VkAttachmentReference} structure specifying the depth/stencil attachment for this subpass and its layout. */
    @Nullable
    @NativeType("VkAttachmentReference const *")
    public VkAttachmentReference pDepthStencilAttachment() { return npDepthStencilAttachment(address()); }
    /** the number of preserved attachments. */
    @NativeType("uint32_t")
    public int preserveAttachmentCount() { return npreserveAttachmentCount(address()); }
    /** a pointer to an array of {@code preserveAttachmentCount} render pass attachment indices identifying attachments that are not used by this subpass, but whose contents <b>must</b> be preserved throughout the subpass. */
    @Nullable
    @NativeType("uint32_t const *")
    public IntBuffer pPreserveAttachments() { return npPreserveAttachments(address()); }

    /** Sets the specified value to the {@link #flags} field. */
    public VkSubpassDescription flags(@NativeType("VkSubpassDescriptionFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #pipelineBindPoint} field. */
    public VkSubpassDescription pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { npipelineBindPoint(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference.Buffer} to the {@link #pInputAttachments} field. */
    public VkSubpassDescription pInputAttachments(@Nullable @NativeType("VkAttachmentReference const *") VkAttachmentReference.Buffer value) { npInputAttachments(address(), value); return this; }
    /** Sets the specified value to the {@link #colorAttachmentCount} field. */
    public VkSubpassDescription colorAttachmentCount(@NativeType("uint32_t") int value) { ncolorAttachmentCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference.Buffer} to the {@link #pColorAttachments} field. */
    public VkSubpassDescription pColorAttachments(@Nullable @NativeType("VkAttachmentReference const *") VkAttachmentReference.Buffer value) { npColorAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference.Buffer} to the {@link #pResolveAttachments} field. */
    public VkSubpassDescription pResolveAttachments(@Nullable @NativeType("VkAttachmentReference const *") VkAttachmentReference.Buffer value) { npResolveAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference} to the {@link #pDepthStencilAttachment} field. */
    public VkSubpassDescription pDepthStencilAttachment(@Nullable @NativeType("VkAttachmentReference const *") VkAttachmentReference value) { npDepthStencilAttachment(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pPreserveAttachments} field. */
    public VkSubpassDescription pPreserveAttachments(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npPreserveAttachments(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubpassDescription set(
        int flags,
        int pipelineBindPoint,
        @Nullable VkAttachmentReference.Buffer pInputAttachments,
        int colorAttachmentCount,
        @Nullable VkAttachmentReference.Buffer pColorAttachments,
        @Nullable VkAttachmentReference.Buffer pResolveAttachments,
        @Nullable VkAttachmentReference pDepthStencilAttachment,
        @Nullable IntBuffer pPreserveAttachments
    ) {
        flags(flags);
        pipelineBindPoint(pipelineBindPoint);
        pInputAttachments(pInputAttachments);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachments(pColorAttachments);
        pResolveAttachments(pResolveAttachments);
        pDepthStencilAttachment(pDepthStencilAttachment);
        pPreserveAttachments(pPreserveAttachments);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubpassDescription set(VkSubpassDescription src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubpassDescription} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassDescription malloc() {
        return wrap(VkSubpassDescription.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSubpassDescription} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassDescription calloc() {
        return wrap(VkSubpassDescription.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSubpassDescription} instance allocated with {@link BufferUtils}. */
    public static VkSubpassDescription create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSubpassDescription.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSubpassDescription} instance for the specified memory address. */
    public static VkSubpassDescription create(long address) {
        return wrap(VkSubpassDescription.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassDescription createSafe(long address) {
        return address == NULL ? null : wrap(VkSubpassDescription.class, address);
    }

    /**
     * Returns a new {@link VkSubpassDescription.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescription.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescription.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSubpassDescription.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassDescription.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescription mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescription callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescription mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescription callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescription.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescription.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescription.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubpassDescription.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSubpassDescription} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDescription malloc(MemoryStack stack) {
        return wrap(VkSubpassDescription.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSubpassDescription} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDescription calloc(MemoryStack stack) {
        return wrap(VkSubpassDescription.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubpassDescription.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescription.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescription.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDescription.FLAGS); }
    /** Unsafe version of {@link #pipelineBindPoint}. */
    public static int npipelineBindPoint(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDescription.PIPELINEBINDPOINT); }
    /** Unsafe version of {@link #inputAttachmentCount}. */
    public static int ninputAttachmentCount(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDescription.INPUTATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pInputAttachments}. */
    @Nullable public static VkAttachmentReference.Buffer npInputAttachments(long struct) { return VkAttachmentReference.createSafe(memGetAddress(struct + VkSubpassDescription.PINPUTATTACHMENTS), ninputAttachmentCount(struct)); }
    /** Unsafe version of {@link #colorAttachmentCount}. */
    public static int ncolorAttachmentCount(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDescription.COLORATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pColorAttachments}. */
    @Nullable public static VkAttachmentReference.Buffer npColorAttachments(long struct) { return VkAttachmentReference.createSafe(memGetAddress(struct + VkSubpassDescription.PCOLORATTACHMENTS), ncolorAttachmentCount(struct)); }
    /** Unsafe version of {@link #pResolveAttachments}. */
    @Nullable public static VkAttachmentReference.Buffer npResolveAttachments(long struct) { return VkAttachmentReference.createSafe(memGetAddress(struct + VkSubpassDescription.PRESOLVEATTACHMENTS), ncolorAttachmentCount(struct)); }
    /** Unsafe version of {@link #pDepthStencilAttachment}. */
    @Nullable public static VkAttachmentReference npDepthStencilAttachment(long struct) { return VkAttachmentReference.createSafe(memGetAddress(struct + VkSubpassDescription.PDEPTHSTENCILATTACHMENT)); }
    /** Unsafe version of {@link #preserveAttachmentCount}. */
    public static int npreserveAttachmentCount(long struct) { return UNSAFE.getInt(null, struct + VkSubpassDescription.PRESERVEATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pPreserveAttachments() pPreserveAttachments}. */
    @Nullable public static IntBuffer npPreserveAttachments(long struct) { return memIntBufferSafe(memGetAddress(struct + VkSubpassDescription.PPRESERVEATTACHMENTS), npreserveAttachmentCount(struct)); }

    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDescription.FLAGS, value); }
    /** Unsafe version of {@link #pipelineBindPoint(int) pipelineBindPoint}. */
    public static void npipelineBindPoint(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDescription.PIPELINEBINDPOINT, value); }
    /** Sets the specified value to the {@code inputAttachmentCount} field of the specified {@code struct}. */
    public static void ninputAttachmentCount(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDescription.INPUTATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pInputAttachments(VkAttachmentReference.Buffer) pInputAttachments}. */
    public static void npInputAttachments(long struct, @Nullable VkAttachmentReference.Buffer value) { memPutAddress(struct + VkSubpassDescription.PINPUTATTACHMENTS, memAddressSafe(value)); ninputAttachmentCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code colorAttachmentCount} field of the specified {@code struct}. */
    public static void ncolorAttachmentCount(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDescription.COLORATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pColorAttachments(VkAttachmentReference.Buffer) pColorAttachments}. */
    public static void npColorAttachments(long struct, @Nullable VkAttachmentReference.Buffer value) { memPutAddress(struct + VkSubpassDescription.PCOLORATTACHMENTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pResolveAttachments(VkAttachmentReference.Buffer) pResolveAttachments}. */
    public static void npResolveAttachments(long struct, @Nullable VkAttachmentReference.Buffer value) { memPutAddress(struct + VkSubpassDescription.PRESOLVEATTACHMENTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pDepthStencilAttachment(VkAttachmentReference) pDepthStencilAttachment}. */
    public static void npDepthStencilAttachment(long struct, @Nullable VkAttachmentReference value) { memPutAddress(struct + VkSubpassDescription.PDEPTHSTENCILATTACHMENT, memAddressSafe(value)); }
    /** Sets the specified value to the {@code preserveAttachmentCount} field of the specified {@code struct}. */
    public static void npreserveAttachmentCount(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassDescription.PRESERVEATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pPreserveAttachments(IntBuffer) pPreserveAttachments}. */
    public static void npPreserveAttachments(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkSubpassDescription.PPRESERVEATTACHMENTS, memAddressSafe(value)); npreserveAttachmentCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ninputAttachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkSubpassDescription.PINPUTATTACHMENTS));
        }
        if (ncolorAttachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkSubpassDescription.PCOLORATTACHMENTS));
        }
        if (npreserveAttachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkSubpassDescription.PPRESERVEATTACHMENTS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkSubpassDescription} structs. */
    public static class Buffer extends StructBuffer<VkSubpassDescription, Buffer> implements NativeResource {

        private static final VkSubpassDescription ELEMENT_FACTORY = VkSubpassDescription.create(-1L);

        /**
         * Creates a new {@code VkSubpassDescription.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassDescription#SIZEOF}, and its mark will be undefined.
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
        protected VkSubpassDescription getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSubpassDescription#flags} field. */
        @NativeType("VkSubpassDescriptionFlags")
        public int flags() { return VkSubpassDescription.nflags(address()); }
        /** @return the value of the {@link VkSubpassDescription#pipelineBindPoint} field. */
        @NativeType("VkPipelineBindPoint")
        public int pipelineBindPoint() { return VkSubpassDescription.npipelineBindPoint(address()); }
        /** @return the value of the {@link VkSubpassDescription#inputAttachmentCount} field. */
        @NativeType("uint32_t")
        public int inputAttachmentCount() { return VkSubpassDescription.ninputAttachmentCount(address()); }
        /** @return a {@link VkAttachmentReference.Buffer} view of the struct array pointed to by the {@link VkSubpassDescription#pInputAttachments} field. */
        @Nullable
        @NativeType("VkAttachmentReference const *")
        public VkAttachmentReference.Buffer pInputAttachments() { return VkSubpassDescription.npInputAttachments(address()); }
        /** @return the value of the {@link VkSubpassDescription#colorAttachmentCount} field. */
        @NativeType("uint32_t")
        public int colorAttachmentCount() { return VkSubpassDescription.ncolorAttachmentCount(address()); }
        /** @return a {@link VkAttachmentReference.Buffer} view of the struct array pointed to by the {@link VkSubpassDescription#pColorAttachments} field. */
        @Nullable
        @NativeType("VkAttachmentReference const *")
        public VkAttachmentReference.Buffer pColorAttachments() { return VkSubpassDescription.npColorAttachments(address()); }
        /** @return a {@link VkAttachmentReference.Buffer} view of the struct array pointed to by the {@link VkSubpassDescription#pResolveAttachments} field. */
        @Nullable
        @NativeType("VkAttachmentReference const *")
        public VkAttachmentReference.Buffer pResolveAttachments() { return VkSubpassDescription.npResolveAttachments(address()); }
        /** @return a {@link VkAttachmentReference} view of the struct pointed to by the {@link VkSubpassDescription#pDepthStencilAttachment} field. */
        @Nullable
        @NativeType("VkAttachmentReference const *")
        public VkAttachmentReference pDepthStencilAttachment() { return VkSubpassDescription.npDepthStencilAttachment(address()); }
        /** @return the value of the {@link VkSubpassDescription#preserveAttachmentCount} field. */
        @NativeType("uint32_t")
        public int preserveAttachmentCount() { return VkSubpassDescription.npreserveAttachmentCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkSubpassDescription#pPreserveAttachments} field. */
        @Nullable
        @NativeType("uint32_t const *")
        public IntBuffer pPreserveAttachments() { return VkSubpassDescription.npPreserveAttachments(address()); }

        /** Sets the specified value to the {@link VkSubpassDescription#flags} field. */
        public VkSubpassDescription.Buffer flags(@NativeType("VkSubpassDescriptionFlags") int value) { VkSubpassDescription.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkSubpassDescription#pipelineBindPoint} field. */
        public VkSubpassDescription.Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { VkSubpassDescription.npipelineBindPoint(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference.Buffer} to the {@link VkSubpassDescription#pInputAttachments} field. */
        public VkSubpassDescription.Buffer pInputAttachments(@Nullable @NativeType("VkAttachmentReference const *") VkAttachmentReference.Buffer value) { VkSubpassDescription.npInputAttachments(address(), value); return this; }
        /** Sets the specified value to the {@link VkSubpassDescription#colorAttachmentCount} field. */
        public VkSubpassDescription.Buffer colorAttachmentCount(@NativeType("uint32_t") int value) { VkSubpassDescription.ncolorAttachmentCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference.Buffer} to the {@link VkSubpassDescription#pColorAttachments} field. */
        public VkSubpassDescription.Buffer pColorAttachments(@Nullable @NativeType("VkAttachmentReference const *") VkAttachmentReference.Buffer value) { VkSubpassDescription.npColorAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference.Buffer} to the {@link VkSubpassDescription#pResolveAttachments} field. */
        public VkSubpassDescription.Buffer pResolveAttachments(@Nullable @NativeType("VkAttachmentReference const *") VkAttachmentReference.Buffer value) { VkSubpassDescription.npResolveAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference} to the {@link VkSubpassDescription#pDepthStencilAttachment} field. */
        public VkSubpassDescription.Buffer pDepthStencilAttachment(@Nullable @NativeType("VkAttachmentReference const *") VkAttachmentReference value) { VkSubpassDescription.npDepthStencilAttachment(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkSubpassDescription#pPreserveAttachments} field. */
        public VkSubpassDescription.Buffer pPreserveAttachments(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkSubpassDescription.npPreserveAttachments(address(), value); return this; }

    }

}