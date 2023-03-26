/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val VARJO_foveated_rendering = "VARJOFoveatedRendering".nativeClassXR("VARJO_foveated_rendering", type = "instance", postfix = "VARJO") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_VARJO_foveated_rendering">XR_VARJO_foveated_rendering</a> extension.

        Varjo headsets provide extremely high pixel density displays in the center area of the display, blended with a high density display covering the rest of the field of view. If the application has to provide a single image per eye, that would cover the entire field of view, at the highest density it would be extremely resource intensive, and in fact impossible for the most powerful desktop GPUs to render in real time. So instead Varjo introduced the {@link VARJOQuadViews XR_VARJO_quad_views} extension enabling the application to provide two separate images for the two screen areas, resulting in a significant reduction in processing, for pixels that could not even been seen.

        This extension goes a step further by enabling the application to only generate the density that can be seen by the user, which is another big reduction compared to the density that can be displayed, using dedicated eye tracking.

        This extension requires {@link VARJOQuadViews XR_VARJO_quad_views} extension to be enabled.

        An application using this extension to enable foveated rendering will take the following steps to prepare:

        <ul>
            <li>Enable {@link VARJOQuadViews XR_VARJO_quad_views} and {@link VARJOFoveatedRendering XR_VARJO_foveated_rendering} extensions.</li>
            <li>Query system properties in order to determine if system supports foveated rendering.</li>
            <li>Query texture sizes for foveated rendering.</li>
        </ul>

        In the render loop, for each frame, an application using this extension <b>should</b>

        <ul>
            <li>Check if rendering gaze is available using #LocateSpace().</li>
            <li>Enable foveated rendering when #LocateViews() is called.</li>
        </ul>
        """

    IntConstant(
        "The extension specification version.",

        "VARJO_foveated_rendering_SPEC_VERSION".."3"
    )

    StringConstant(
        "The extension name.",

        "VARJO_FOVEATED_RENDERING_EXTENSION_NAME".."XR_VARJO_foveated_rendering"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_VIEW_LOCATE_FOVEATED_RENDERING_VARJO".."1000121000",
        "TYPE_FOVEATED_VIEW_CONFIGURATION_VIEW_VARJO".."1000121001",
        "TYPE_SYSTEM_FOVEATED_RENDERING_PROPERTIES_VARJO".."1000121002"
    )

    EnumConstant(
        "Extends {@code XrReferenceSpaceType}.",

        "REFERENCE_SPACE_TYPE_COMBINED_EYE_VARJO".."1000121000"
    )
}