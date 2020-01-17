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
 * Structure specifying parameters of a newly created framebuffer.
 * 
 * <h5>Description</h5>
 * 
 * <p>Applications <b>must</b> ensure that all accesses to memory that backs image subresources used as attachments in a given renderpass instance either happen-before the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#renderpass-load-store-ops">load operations</a> for those attachments, or happen-after the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#renderpass-load-store-ops">store operations</a> for those attachments.</p>
 * 
 * <p>For depth/stencil attachments, each aspect <b>can</b> be used separately as attachments and non-attachments as long as the non-attachment accesses are also via an image subresource in either the {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL} layout or the {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL} layout, and the attachment resource uses whichever of those two layouts the image accesses do not. Use of non-attachment aspects in this case is only well defined if the attachment is used in the subpass where the non-attachment access is being made, or the layout of the image subresource is constant throughout the entire render pass instance, including the {@code initialLayout} and {@code finalLayout}.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>These restrictions mean that the render pass has full knowledge of all uses of all of the attachments, so that the implementation is able to make correct decisions about when and how to perform layout transitions, when to overlap execution of subpasses, etc.</p>
 * </div>
 * 
 * <p>It is legal for a subpass to use no color or depth/stencil attachments, and rather use shader side effects such as image stores and atomics to produce an output. In this case, the subpass continues to use the {@code width}, {@code height}, and {@code layers} of the framebuffer to define the dimensions of the rendering area, and the {@code rasterizationSamples} from each pipeline's {@link VkPipelineMultisampleStateCreateInfo} to define the number of samples used in rasterization; however, if {@link VkPhysicalDeviceFeatures}{@code ::variableMultisampleRate} is {@link VK10#VK_FALSE FALSE}, then all pipelines to be bound with a given zero-attachment subpass <b>must</b> have the same value for {@link VkPipelineMultisampleStateCreateInfo}{@code ::rasterizationSamples}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code attachmentCount} <b>must</b> be equal to the attachment count specified in {@code renderPass}</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, and {@code attachmentCount} is not 0, {@code pAttachments} must be a valid pointer to an array of {@code attachmentCount} valid {@code VkImageView} handles</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of {@code pAttachments} that is used as a color attachment or resolve attachment by {@code renderPass} <b>must</b> have been created with a {@code usage} value including {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of {@code pAttachments} that is used as a depth/stencil attachment by {@code renderPass} <b>must</b> have been created with a {@code usage} value including {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of {@code pAttachments} that is used as a depth/stencil resolve attachment by {@code renderPass} <b>must</b> have been created with a {@code usage} value including {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of {@code pAttachments} that is used as an input attachment by {@code renderPass} <b>must</b> have been created with a {@code usage} value including {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}</li>
 * <li>Each element of {@code pAttachments} that is used as a fragment density map attachment by {@code renderPass} <b>must</b> not have been created with a {@code flags} value including {@link EXTFragmentDensityMap#VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT IMAGE_CREATE_SUBSAMPLED_BIT_EXT}.</li>
 * <li>If {@code renderPass} has a fragment density map attachment and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-nonsubsampledimages">non-subsample image feature</a> is not enabled, each element of {@code pAttachments} <b>must</b> have been created with a {@code flags} value including {@link EXTFragmentDensityMap#VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT IMAGE_CREATE_SUBSAMPLED_BIT_EXT} unless that element is the fragment density map attachment.</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of {@code pAttachments} <b>must</b> have been created with a {@code VkFormat} value that matches the {@code VkFormat} specified by the corresponding {@link VkAttachmentDescription} in {@code renderPass}</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of {@code pAttachments} <b>must</b> have been created with a {@code samples} value that matches the {@code samples} value specified by the corresponding {@link VkAttachmentDescription} in {@code renderPass}</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of {@code pAttachments} <b>must</b> have dimensions at least as large as the corresponding framebuffer dimension except for any element that is referenced by {@code fragmentDensityMapAttachment}</li>
 * <li>If {@code renderPass} was specified with non-zero view masks, each element of {@code pAttachments} that is not referenced by {@code fragmentDensityMapAttachment} <b>must</b> have a {@code layerCount} greater than the index of the most significant bit set in any of those view masks</li>
 * <li>If {@code renderPass} was specified with non-zero view masks, each element of {@code pAttachments} that is referenced by {@code fragmentDensityMapAttachment} <b>must</b> have a {@code layerCount} equal to 1 or greater than the index of the most significant bit set in any of those view masks</li>
 * <li>If {@code renderPass} was not specified with non-zero view masks, each element of {@code pAttachments} that is referenced by {@code fragmentDensityMapAttachment} <b>must</b> have a {@code layerCount} equal to 1</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, an element of {@code pAttachments} that is referenced by {@code fragmentDensityMapAttachment} <b>must</b> have a width at least as large as {@code ceil(width / maxFragmentDensityTexelSize.width)}</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, an element of {@code pAttachments} that is referenced by {@code fragmentDensityMapAttachment} <b>must</b> have a height at least as large as {@code ceil(height / maxFragmentDensityTexelSize.height)}</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of {@code pAttachments} <b>must</b> only specify a single mip level</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of {@code pAttachments} <b>must</b> have been created with the identity swizzle</li>
 * <li>{@code width} <b>must</b> be greater than 0.</li>
 * <li>{@code width} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxFramebufferWidth}</li>
 * <li>{@code height} <b>must</b> be greater than 0.</li>
 * <li>{@code height} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxFramebufferHeight}</li>
 * <li>{@code layers} <b>must</b> be greater than 0.</li>
 * <li>{@code layers} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxFramebufferLayers}</li>
 * <li>If {@code renderPass} was specified with non-zero view masks, {@code layers} <b>must</b> be 1</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, each element of {@code pAttachments} that is a 2D or 2D array image view taken from a 3D image <b>must</b> not be a depth/stencil format</li>
 * <li>If {@code flags} does not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, and {@code attachmentCount} is not 0, {@code pAttachments} <b>must</b> be a valid pointer to an array of {@code attachmentCount} valid {@code VkImageView} handles</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-imagelessFramebuffer">imageless framebuffer</a> feature is not enabled, {@code flags} <b>must</b> not include {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}</li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code pNext} chain <b>must</b> include a {@link VkFramebufferAttachmentsCreateInfo} structure</li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code attachmentImageInfoCount} member of a {@link VkFramebufferAttachmentsCreateInfo} structure included in the {@code pNext} chain <b>must</b> be equal to either zero or {@code attachmentCount}</li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code width} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure included in the {@code pNext} chain <b>must</b> be greater than or equal to {@code width}, except for any element that is referenced by {@link VkRenderPassFragmentDensityMapCreateInfoEXT}{@code ::fragmentDensityMapAttachment} in {@code renderPass}</li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code height} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure included in the {@code pNext} chain <b>must</b> be greater than or equal to {@code height}, except for any element that is referenced by {@link VkRenderPassFragmentDensityMapCreateInfoEXT}{@code ::fragmentDensityMapAttachment} in {@code renderPass}</li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code width} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure included in the {@code pNext} chain that is referenced by {@link VkRenderPassFragmentDensityMapCreateInfoEXT}{@code ::fragmentDensityMapAttachment} in {@code renderPass} <b>must</b> be greater than or equal to {@code ceil(width / maxFragmentDensityTexelSize.width)}</li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code height} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure included in the {@code pNext} chain that is referenced by {@link VkRenderPassFragmentDensityMapCreateInfoEXT}{@code ::fragmentDensityMapAttachment} in {@code renderPass} <b>must</b> be greater than or equal to {@code ceil(height / maxFragmentDensityTexelSize.height)}</li>
 * <li>If multiview is enabled for {@code renderPass}, and {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code layerCount} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure included in the {@code pNext} chain <b>must</b> be greater than the maximum bit index set in the view mask in the subpasses in which it is used in {@code renderPass}</li>
 * <li>If multiview is not enabled for {@code renderPass}, and {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code layerCount} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure included in the {@code pNext} chain <b>must</b> be greater than or equal to {@code layers}</li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code usage} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure included in the {@code pNext} chain that refers to an attachment used as a color attachment or resolve attachment by {@code renderPass} <b>must</b> include {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}</li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code usage} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure included in the {@code pNext} chain that refers to an attachment used as a depth/stencil attachment by {@code renderPass} <b>must</b> include {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code usage} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure included in the {@code pNext} chain that refers to an attachment used as a depth/stencil resolve attachment by {@code renderPass} <b>must</b> include {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, the {@code usage} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure included in the {@code pNext} chain that refers to an attachment used as an input attachment by {@code renderPass} <b>must</b> include {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}</li>
 * <li>If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, at least one element of the {@code pViewFormats} member of any element of the {@code pAttachmentImageInfos} member of a {@link VkFramebufferAttachmentsCreateInfo} structure included in the {@code pNext} chain <b>must</b> be equal to the corresponding value of {@link VkAttachmentDescription}{@code ::format} used to create {@code renderPass}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkFramebufferAttachmentsCreateInfo}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkFramebufferCreateFlagBits} values</li>
 * <li>{@code renderPass} <b>must</b> be a valid {@code VkRenderPass} handle</li>
 * <li>Both of {@code renderPass}, and the elements of {@code pAttachments} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkCreateFramebuffer CreateFramebuffer}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; a bitmask of {@code VkFramebufferCreateFlagBits}</li>
 * <li>{@code renderPass} &ndash; a render pass defining what render passes the framebuffer will be compatible with. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#renderpass-compatibility">Render Pass Compatibility</a> for details.</li>
 * <li>{@code attachmentCount} &ndash; the number of attachments.</li>
 * <li>{@code pAttachments} &ndash; a pointer to an array of {@code VkImageView} handles, each of which will be used as the corresponding attachment in a render pass instance. If {@code flags} includes {@link VK12#VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT FRAMEBUFFER_CREATE_IMAGELESS_BIT}, this parameter is ignored.</li>
 * <li>{@code width} &ndash; {@code width}, {@code height} and {@code layers} define the dimensions of the framebuffer. If the render pass uses multiview, then {@code layers} <b>must</b> be one and each attachment requires a number of layers that is greater than the maximum bit index set in the view mask in the subpasses in which it is used.</li>
 * <li>{@code height} &ndash; see {@code width}</li>
 * <li>{@code layers} &ndash; see {@code width}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkFramebufferCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkFramebufferCreateFlags flags;
 *     VkRenderPass renderPass;
 *     uint32_t attachmentCount;
 *     VkImageView const * pAttachments;
 *     uint32_t width;
 *     uint32_t height;
 *     uint32_t layers;
 * }</code></pre>
 */
public class VkFramebufferCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        RENDERPASS,
        ATTACHMENTCOUNT,
        PATTACHMENTS,
        WIDTH,
        HEIGHT,
        LAYERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        RENDERPASS = layout.offsetof(3);
        ATTACHMENTCOUNT = layout.offsetof(4);
        PATTACHMENTS = layout.offsetof(5);
        WIDTH = layout.offsetof(6);
        HEIGHT = layout.offsetof(7);
        LAYERS = layout.offsetof(8);
    }

    /**
     * Creates a {@code VkFramebufferCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkFramebufferCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkFramebufferCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code renderPass} field. */
    @NativeType("VkRenderPass")
    public long renderPass() { return nrenderPass(address()); }
    /** Returns the value of the {@code attachmentCount} field. */
    @NativeType("uint32_t")
    public int attachmentCount() { return nattachmentCount(address()); }
    /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pAttachments} field. */
    @Nullable
    @NativeType("VkImageView const *")
    public LongBuffer pAttachments() { return npAttachments(address()); }
    /** Returns the value of the {@code width} field. */
    @NativeType("uint32_t")
    public int width() { return nwidth(address()); }
    /** Returns the value of the {@code height} field. */
    @NativeType("uint32_t")
    public int height() { return nheight(address()); }
    /** Returns the value of the {@code layers} field. */
    @NativeType("uint32_t")
    public int layers() { return nlayers(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkFramebufferCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkFramebufferCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkFramebufferCreateInfo flags(@NativeType("VkFramebufferCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code renderPass} field. */
    public VkFramebufferCreateInfo renderPass(@NativeType("VkRenderPass") long value) { nrenderPass(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pAttachments} field. */
    public VkFramebufferCreateInfo pAttachments(@Nullable @NativeType("VkImageView const *") LongBuffer value) { npAttachments(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public VkFramebufferCreateInfo width(@NativeType("uint32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public VkFramebufferCreateInfo height(@NativeType("uint32_t") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code layers} field. */
    public VkFramebufferCreateInfo layers(@NativeType("uint32_t") int value) { nlayers(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkFramebufferCreateInfo set(
        int sType,
        long pNext,
        int flags,
        long renderPass,
        @Nullable LongBuffer pAttachments,
        int width,
        int height,
        int layers
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        renderPass(renderPass);
        pAttachments(pAttachments);
        width(width);
        height(height);
        layers(layers);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkFramebufferCreateInfo set(VkFramebufferCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkFramebufferCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkFramebufferCreateInfo malloc() {
        return wrap(VkFramebufferCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkFramebufferCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFramebufferCreateInfo calloc() {
        return wrap(VkFramebufferCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkFramebufferCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkFramebufferCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkFramebufferCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkFramebufferCreateInfo} instance for the specified memory address. */
    public static VkFramebufferCreateInfo create(long address) {
        return wrap(VkFramebufferCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFramebufferCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkFramebufferCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkFramebufferCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkFramebufferCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFramebufferCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFramebufferCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkFramebufferCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkFramebufferCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkFramebufferCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkFramebufferCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkFramebufferCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFramebufferCreateInfo mallocStack(MemoryStack stack) {
        return wrap(VkFramebufferCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkFramebufferCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFramebufferCreateInfo callocStack(MemoryStack stack) {
        return wrap(VkFramebufferCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkFramebufferCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkFramebufferCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkFramebufferCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFramebufferCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFramebufferCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkFramebufferCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferCreateInfo.FLAGS); }
    /** Unsafe version of {@link #renderPass}. */
    public static long nrenderPass(long struct) { return UNSAFE.getLong(null, struct + VkFramebufferCreateInfo.RENDERPASS); }
    /** Unsafe version of {@link #attachmentCount}. */
    public static int nattachmentCount(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferCreateInfo.ATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pAttachments() pAttachments}. */
    @Nullable public static LongBuffer npAttachments(long struct) { return memLongBufferSafe(memGetAddress(struct + VkFramebufferCreateInfo.PATTACHMENTS), nattachmentCount(struct)); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferCreateInfo.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferCreateInfo.HEIGHT); }
    /** Unsafe version of {@link #layers}. */
    public static int nlayers(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferCreateInfo.LAYERS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkFramebufferCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #renderPass(long) renderPass}. */
    public static void nrenderPass(long struct, long value) { UNSAFE.putLong(null, struct + VkFramebufferCreateInfo.RENDERPASS, value); }
    /** Sets the specified value to the {@code attachmentCount} field of the specified {@code struct}. */
    public static void nattachmentCount(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferCreateInfo.ATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pAttachments(LongBuffer) pAttachments}. */
    public static void npAttachments(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkFramebufferCreateInfo.PATTACHMENTS, memAddressSafe(value)); nattachmentCount(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferCreateInfo.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferCreateInfo.HEIGHT, value); }
    /** Unsafe version of {@link #layers(int) layers}. */
    public static void nlayers(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferCreateInfo.LAYERS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nattachmentCount(struct) != 0) {
            check(memGetAddress(struct + VkFramebufferCreateInfo.PATTACHMENTS));
        }
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkFramebufferCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkFramebufferCreateInfo, Buffer> implements NativeResource {

        private static final VkFramebufferCreateInfo ELEMENT_FACTORY = VkFramebufferCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkFramebufferCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFramebufferCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkFramebufferCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkFramebufferCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkFramebufferCreateInfo.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkFramebufferCreateFlags")
        public int flags() { return VkFramebufferCreateInfo.nflags(address()); }
        /** Returns the value of the {@code renderPass} field. */
        @NativeType("VkRenderPass")
        public long renderPass() { return VkFramebufferCreateInfo.nrenderPass(address()); }
        /** Returns the value of the {@code attachmentCount} field. */
        @NativeType("uint32_t")
        public int attachmentCount() { return VkFramebufferCreateInfo.nattachmentCount(address()); }
        /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pAttachments} field. */
        @Nullable
        @NativeType("VkImageView const *")
        public LongBuffer pAttachments() { return VkFramebufferCreateInfo.npAttachments(address()); }
        /** Returns the value of the {@code width} field. */
        @NativeType("uint32_t")
        public int width() { return VkFramebufferCreateInfo.nwidth(address()); }
        /** Returns the value of the {@code height} field. */
        @NativeType("uint32_t")
        public int height() { return VkFramebufferCreateInfo.nheight(address()); }
        /** Returns the value of the {@code layers} field. */
        @NativeType("uint32_t")
        public int layers() { return VkFramebufferCreateInfo.nlayers(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkFramebufferCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkFramebufferCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkFramebufferCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkFramebufferCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkFramebufferCreateInfo.Buffer flags(@NativeType("VkFramebufferCreateFlags") int value) { VkFramebufferCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code renderPass} field. */
        public VkFramebufferCreateInfo.Buffer renderPass(@NativeType("VkRenderPass") long value) { VkFramebufferCreateInfo.nrenderPass(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pAttachments} field. */
        public VkFramebufferCreateInfo.Buffer pAttachments(@Nullable @NativeType("VkImageView const *") LongBuffer value) { VkFramebufferCreateInfo.npAttachments(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public VkFramebufferCreateInfo.Buffer width(@NativeType("uint32_t") int value) { VkFramebufferCreateInfo.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public VkFramebufferCreateInfo.Buffer height(@NativeType("uint32_t") int value) { VkFramebufferCreateInfo.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code layers} field. */
        public VkFramebufferCreateInfo.Buffer layers(@NativeType("uint32_t") int value) { VkFramebufferCreateInfo.nlayers(address(), value); return this; }

    }

}