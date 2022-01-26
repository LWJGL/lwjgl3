/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * This extension provides the ability to use <em>DRM format modifiers</em> with images, enabling Vulkan to better integrate with the Linux ecosystem of graphics, video, and display APIs.
 * 
 * <p>Its functionality closely overlaps with {@code EGL_EXT_image_dma_buf_import_modifiers}<sup><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VK_EXT_image_drm_format_modifier-fn2">2</a></sup> and {@code EGL_MESA_image_dma_buf_export}<sup><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VK_EXT_image_drm_format_modifier-fn3">3</a></sup>. Unlike the EGL extensions, this extension does not require the use of a specific handle type (such as a dma_buf) for external memory and provides more explicit control of image creation.</p>
 * 
 * <h5>Introduction to DRM Format Modifiers</h5>
 * 
 * <p>A <em>DRM format modifier</em> is a 64-bit, vendor-prefixed, semi-opaque unsigned integer. Most <em>modifiers</em> represent a concrete, vendor-specific tiling format for images. Some exceptions are {@code DRM_FORMAT_MOD_LINEAR} (which is not vendor-specific); {@code DRM_FORMAT_MOD_NONE} (which is an alias of {@code DRM_FORMAT_MOD_LINEAR} due to historical accident); and {@code DRM_FORMAT_MOD_INVALID} (which does not represent a tiling format). The <em>modifier’s</em> vendor prefix consists of the 8 most significant bits. The canonical list of <em>modifiers</em> and vendor prefixes is found in <a target="_blank" href="https://git.kernel.org/pub/scm/linux/kernel/git/torvalds/linux.git/tree/include/uapi/drm/drm_fourcc.h">{@code drm_fourcc.h}</a> in the Linux kernel source. The other dominant source of <em>modifiers</em> are vendor kernel trees.</p>
 * 
 * <p>One goal of <em>modifiers</em> in the Linux ecosystem is to enumerate for each vendor a reasonably sized set of tiling formats that are appropriate for images shared across processes, APIs, and/or devices, where each participating component may possibly be from different vendors. A non-goal is to enumerate all tiling formats supported by all vendors. Some tiling formats used internally by vendors are inappropriate for sharing; no <em>modifiers</em> should be assigned to such tiling formats.</p>
 * 
 * <p>Modifier values typically do not <em>describe</em> memory layouts. More precisely, a <em>modifier</em>'s lower 56 bits usually have no structure. Instead, modifiers <em>name</em> memory layouts; they name a small set of vendor-preferred layouts for image sharing. As a consequence, in each vendor namespace the modifier values are often sequentially allocated starting at 1.</p>
 * 
 * <p>Each <em>modifier</em> is usually supported by a single vendor and its name matches the pattern {@code {VENDOR}_FORMAT_MOD_*} or {@code DRM_FORMAT_MOD_{VENDOR}_*}. Examples are {@code I915_FORMAT_MOD_X_TILED} and {@code DRM_FORMAT_MOD_BROADCOM_VC4_T_TILED}. An exception is {@code DRM_FORMAT_MOD_LINEAR}, which is supported by most vendors.</p>
 * 
 * <p>Many APIs in Linux use <em>modifiers</em> to negotiate and specify the memory layout of shared images. For example, a Wayland compositor and Wayland client may, by relaying <em>modifiers</em> over the Wayland protocol {@code zwp_linux_dmabuf_v1}, negotiate a vendor-specific tiling format for a shared {@code wl_buffer}. The client may allocate the underlying memory for the {@code wl_buffer} with GBM, providing the chosen <em>modifier</em> to {@code gbm_bo_create_with_modifiers}. The client may then import the {@code wl_buffer} into Vulkan for producing image content, providing the resource’s dma_buf to {@link VkImportMemoryFdInfoKHR} and its <em>modifier</em> to {@link VkImageDrmFormatModifierExplicitCreateInfoEXT}. The compositor may then import the {@code wl_buffer} into OpenGL for sampling, providing the resource’s dma_buf and <em>modifier</em> to {@code eglCreateImage}. The compositor may also bypass OpenGL and submit the {@code wl_buffer} directly to the kernel’s display API, providing the dma_buf and <em>modifier</em> through {@code drm_mode_fb_cmd2}.</p>
 * 
 * <h5>Format Translation</h5>
 * 
 * <p><em>Modifier</em>-capable APIs often pair <em>modifiers</em> with DRM formats, which are defined in <a target="_blank" href="https://git.kernel.org/pub/scm/linux/kernel/git/torvalds/linux.git/tree/include/uapi/drm/drm_fourcc.h">{@code drm_fourcc.h}</a>. However, {@code VK_EXT_image_drm_format_modifier} uses {@code VkFormat} instead of DRM formats. The application must convert between {@code VkFormat} and DRM format when it sends or receives a DRM format to or from an external API.</p>
 * 
 * <p>The mapping from {@code VkFormat} to DRM format is lossy. Therefore, when receiving a DRM format from an external API, often the application must use information from the external API to accurately map the DRM format to a {@code VkFormat}. For example, DRM formats do not distinguish between RGB and sRGB (as of 2018-03-28); external information is required to identify the image’s colorspace.</p>
 * 
 * <p>The mapping between {@code VkFormat} and DRM format is also incomplete. For some DRM formats there exist no corresponding Vulkan format, and for some Vulkan formats there exist no corresponding DRM format.</p>
 * 
 * <h5>Usage Patterns</h5>
 * 
 * <p>Three primary usage patterns are intended for this extension:</p>
 * 
 * <ul>
 * <li><b>Negotiation.</b> The application negotiates with <em>modifier</em>-aware, external components to determine sets of image creation parameters supported among all components.
 * In the Linux ecosystem, the negotiation usually assumes the image is a 2D, single-sampled, non-mipmapped, non-array image; this extension permits that assumption but does not require it. The result of the negotiation usually resembles a set of tuples such as <em>(drmFormat, drmFormatModifier)</em>, where each participating component supports all tuples in the set.
 * 
 * <p>Many details of this negotiation—such as the protocol used during negotiation, the set of image creation parameters expressable in the protocol, and how the protocol chooses which process and which API will create the image—are outside the scope of this specification.</p>
 * 
 * <p>In this extension, {@link VK11#vkGetPhysicalDeviceFormatProperties2 GetPhysicalDeviceFormatProperties2} with {@link VkDrmFormatModifierPropertiesListEXT} serves a primary role during the negotiation, and {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2} with {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT} serves a secondary role.</p>
 * </li>
 * <li><b>Import.</b> The application imports an image with a <em>modifier</em>.
 * In this pattern, the application receives from an external source the image’s memory and its creation parameters, which are often the result of the negotiation described above. Some image creation parameters are implicitly defined by the external source; for example, {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} is often assumed. Some image creation parameters are usually explicit, such as the image’s {@code format}, {@code drmFormatModifier}, and {@code extent}; and each plane’s {@code offset} and {@code rowPitch}.
 * 
 * <p>Before creating the image, the application first verifies that the physical device supports the received creation parameters by querying {@link VK11#vkGetPhysicalDeviceFormatProperties2 GetPhysicalDeviceFormatProperties2} with {@link VkDrmFormatModifierPropertiesListEXT} and {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2} with {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT}. Then the application creates the image by chaining {@link VkImageDrmFormatModifierExplicitCreateInfoEXT} and {@link VkExternalMemoryImageCreateInfo} onto {@link VkImageCreateInfo}.</p>
 * </li>
 * <li><b>Export.</b> The application creates an image and allocates its memory. Then the application exports to <em>modifier</em>-aware consumers the image’s memory handles; its creation parameters; its <em>modifier</em>; and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkSubresourceLayout">{@code offset}</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkSubresourceLayout">{@code size}</a>, and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkSubresourceLayout">{@code rowPitch}</a> of each <em>memory plane</em>.
 * In this pattern, the Vulkan device is the authority for the image; it is the allocator of the image’s memory and the decider of the image’s creation parameters. When choosing the image’s creation parameters, the application usually chooses a tuple <em>(format, drmFormatModifier)</em> from the result of the negotiation described above. The negotiation’s result often contains multiple tuples that share the same format but differ in their <em>modifier</em>. In this case, the application should defer the choice of the image’s <em>modifier</em> to the Vulkan implementation by providing all such <em>modifiers</em> to {@link VkImageDrmFormatModifierListCreateInfoEXT}{@code ::pDrmFormatModifiers}; and the implementation should choose from {@code pDrmFormatModifiers} the optimal <em>modifier</em> in consideration with the other image parameters.
 * 
 * <p>The application creates the image by chaining {@link VkImageDrmFormatModifierListCreateInfoEXT} and {@link VkExternalMemoryImageCreateInfo} onto {@link VkImageCreateInfo}. The protocol and APIs by which the application will share the image with external consumers will likely determine the value of {@link VkExternalMemoryImageCreateInfo}{@code ::handleTypes}. The implementation chooses for the image an optimal <em>modifier</em> from {@link VkImageDrmFormatModifierListCreateInfoEXT}{@code ::pDrmFormatModifiers}. The application then queries the implementation-chosen <em>modifier</em> with {@link #vkGetImageDrmFormatModifierPropertiesEXT GetImageDrmFormatModifierPropertiesEXT}, and queries the memory layout of each plane with {@link VK10#vkGetImageSubresourceLayout GetImageSubresourceLayout}.</p>
 * 
 * <p>The application then allocates the image’s memory with {@link VkMemoryAllocateInfo}, adding chained extending structures for external memory; binds it to the image; and exports the memory, for example, with {@link KHRExternalMemoryFd#vkGetMemoryFdKHR GetMemoryFdKHR}.</p>
 * 
 * <p>Finally, the application sends the image’s creation parameters, its <em>modifier</em>, its per-plane memory layout, and the exported memory handle to the external consumers. The details of how the application transmits this information to external consumers is outside the scope of this specification.</p>
 * </li>
 * </ul>
 * 
 * <h5>Prior Art</h5>
 * 
 * <p>Extension {@code EGL_EXT_image_dma_buf_import}<sup><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VK_EXT_image_drm_format_modifier-fn1">1</a></sup> introduced the ability to create an {@code EGLImage} by importing for each plane a dma_buf, offset, and row pitch.</p>
 * 
 * <p>Later, extension {@code EGL_EXT_image_dma_buf_import_modifiers}<sup><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VK_EXT_image_drm_format_modifier-fn2">2</a></sup> introduced the ability to query which combination of formats and <em>modifiers</em> the implementation supports and to specify <em>modifiers</em> during creation of the {@code EGLImage}.</p>
 * 
 * <p>Extension {@code EGL_MESA_image_dma_buf_export}<sup><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VK_EXT_image_drm_format_modifier-fn3">3</a></sup> is the inverse of {@code EGL_EXT_image_dma_buf_import_modifiers}.</p>
 * 
 * <p>The Linux kernel modesetting API (KMS), when configuring the display’s framebuffer with {@code struct drm_mode_fb_cmd2}<sup><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VK_EXT_image_drm_format_modifier-fn4">4</a></sup>, allows one to specify the frambuffer’s <em>modifier</em> as well as a per-plane memory handle, offset, and row pitch.</p>
 * 
 * <p>GBM, a graphics buffer manager for Linux, allows creation of a {@code gbm_bo} (that is, a graphics <em>buffer object</em>) by importing data similar to that in {@code EGL_EXT_image_dma_buf_import_modifiers}<sup><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VK_EXT_image_drm_format_modifier-fn1">1</a></sup>; and symmetrically allows exporting the same data from the {@code gbm_bo}. See the references to <em>modifier</em> and <em>plane</em> in {@code gbm.h}<sup><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VK_EXT_image_drm_format_modifier-fn5">5</a></sup>.</p>
 * 
 * <h5>VK_EXT_image_drm_format_modifier</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_image_drm_format_modifier}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>159</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRBindMemory2 VK_KHR_bind_memory2}</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * <li>Requires {@link KHRImageFormatList VK_KHR_image_format_list}</li>
 * <li>Requires {@link KHRSamplerYcbcrConversion VK_KHR_sampler_ycbcr_conversion}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Chad Versace <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_image_drm_format_modifier]%20@chadversary%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_image_drm_format_modifier%20extension%3E%3E">chadversary</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-09-30</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Antoine Labour, Google</li>
 * <li>Bas Nieuwenhuizen, Google</li>
 * <li>Chad Versace, Google</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Jőrg Wagner, ARM</li>
 * <li>Kristian Høgsberg Kristensen, Google</li>
 * <li>Ray Smith, ARM</li>
 * </ul></dd>
 * </dl>
 */
public class EXTImageDrmFormatModifier {

    /** The extension specification version. */
    public static final int VK_EXT_IMAGE_DRM_FORMAT_MODIFIER_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_EXT_IMAGE_DRM_FORMAT_MODIFIER_EXTENSION_NAME = "VK_EXT_image_drm_format_modifier";

    /** Extends {@code VkResult}. */
    public static final int VK_ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT_EXT = -1000158000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT            = 1000158000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT = 1000158002,
        VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT     = 1000158003,
        VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT = 1000158004,
        VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT           = 1000158005;

    /** Extends {@code VkImageTiling}. */
    public static final int VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT = 1000158000;

    /**
     * Extends {@code VkImageAspectFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_IMAGE_ASPECT_MEMORY_PLANE_0_BIT_EXT IMAGE_ASPECT_MEMORY_PLANE_0_BIT_EXT}</li>
     * <li>{@link #VK_IMAGE_ASPECT_MEMORY_PLANE_1_BIT_EXT IMAGE_ASPECT_MEMORY_PLANE_1_BIT_EXT}</li>
     * <li>{@link #VK_IMAGE_ASPECT_MEMORY_PLANE_2_BIT_EXT IMAGE_ASPECT_MEMORY_PLANE_2_BIT_EXT}</li>
     * <li>{@link #VK_IMAGE_ASPECT_MEMORY_PLANE_3_BIT_EXT IMAGE_ASPECT_MEMORY_PLANE_3_BIT_EXT}</li>
     * </ul>
     */
    public static final int
        VK_IMAGE_ASPECT_MEMORY_PLANE_0_BIT_EXT = 0x80,
        VK_IMAGE_ASPECT_MEMORY_PLANE_1_BIT_EXT = 0x100,
        VK_IMAGE_ASPECT_MEMORY_PLANE_2_BIT_EXT = 0x200,
        VK_IMAGE_ASPECT_MEMORY_PLANE_3_BIT_EXT = 0x400;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_2_EXT = 1000158006;

    protected EXTImageDrmFormatModifier() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetImageDrmFormatModifierPropertiesEXT ] ---

    /** Unsafe version of: {@link #vkGetImageDrmFormatModifierPropertiesEXT GetImageDrmFormatModifierPropertiesEXT} */
    public static int nvkGetImageDrmFormatModifierPropertiesEXT(VkDevice device, long image, long pProperties) {
        long __functionAddress = device.getCapabilities().vkGetImageDrmFormatModifierPropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), image, pProperties, __functionAddress);
    }

    /**
     * Returns an image’s DRM format modifier.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>If an image was created with {@link #VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT}, then the image has a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#glossary-drm-format-modifier">Linux DRM format modifier</a>. To query the <em>modifier</em>, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetImageDrmFormatModifierPropertiesEXT(
     *     VkDevice                                    device,
     *     VkImage                                     image,
     *     VkImageDrmFormatModifierPropertiesEXT*      pProperties);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code image} <b>must</b> have been created with {@link VkImageCreateInfo tiling} equal to {@link #VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
     * <li>{@code pProperties} <b>must</b> be a valid pointer to a {@link VkImageDrmFormatModifierPropertiesEXT} structure</li>
     * <li>{@code image} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkImageDrmFormatModifierPropertiesEXT}</p>
     *
     * @param device      the logical device that owns the image.
     * @param image       the queried image.
     * @param pProperties a pointer to a {@link VkImageDrmFormatModifierPropertiesEXT} structure in which properties of the image’s <em>DRM format modifier</em> are returned.
     */
    @NativeType("VkResult")
    public static int vkGetImageDrmFormatModifierPropertiesEXT(VkDevice device, @NativeType("VkImage") long image, @NativeType("VkImageDrmFormatModifierPropertiesEXT *") VkImageDrmFormatModifierPropertiesEXT pProperties) {
        return nvkGetImageDrmFormatModifierPropertiesEXT(device, image, pProperties.address());
    }

}