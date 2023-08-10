/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_swapchain_update_state_opengl_es = "FBSwapchainUpdateStateOpenGLES".nativeClassXR("FB_swapchain_update_state_opengl_es", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_swapchain_update_state_opengl_es">XR_FB_swapchain_update_state_opengl_es</a> extension.

        This extension enables the application to modify and query OpenGL ES-specific mutable state associated with a swapchain, examples include:

        <ul>
            <li>On platforms where composition runs in a separate process from the application, swapchains must be created in a cross-process friendly way. In such cases, the texture image memory may be shared between processes, but the texture state may not; and, an explicit mechanism to synchronize this texture state between the application and the compositor is required.</li>
        </ul>

        In order to enable the functionality of this extension, the application <b>must</b> pass the name of the extension into #CreateInstance() via the ##XrInstanceCreateInfo {@code enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#extensions">extensions</a> section.
        """

    IntConstant(
        "The extension specification version.",

        "FB_swapchain_update_state_opengl_es_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_SWAPCHAIN_UPDATE_STATE_OPENGL_ES_EXTENSION_NAME".."XR_FB_swapchain_update_state_opengl_es"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SWAPCHAIN_STATE_SAMPLER_OPENGL_ES_FB".."1000162000"
    )
}