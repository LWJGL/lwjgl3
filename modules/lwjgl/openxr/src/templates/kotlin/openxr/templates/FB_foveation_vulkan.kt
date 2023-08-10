/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_foveation_vulkan = "FBFoveationVulkan".nativeClassXR("FB_foveation_vulkan", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_foveation_vulkan">XR_FB_foveation_vulkan</a> extension.

        The Vulkan graphics API requires an image to be applied to the swapchain to apply a foveation pattern.

        This extension allows:

        <ul>
            <li>An application to obtain foveation textures or constructs needed for foveated rendering in Vulkan.</li>
        </ul>

        In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into #CreateInstance() via the ##XrInstanceCreateInfo {@code enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#extensions">extensions</a> section.
        """

    IntConstant(
        "The extension specification version.",

        "FB_foveation_vulkan_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_FOVEATION_VULKAN_EXTENSION_NAME".."XR_FB_foveation_vulkan"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SWAPCHAIN_IMAGE_FOVEATION_VULKAN_FB".."1000160000"
    )
}