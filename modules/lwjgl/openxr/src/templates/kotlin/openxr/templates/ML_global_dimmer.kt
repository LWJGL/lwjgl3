/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ML_global_dimmer = "MLGlobalDimmer".nativeClassXR("ML_global_dimmer", type = "instance", postfix = "ML") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_ML_global_dimmer">XR_ML_global_dimmer</a> extension.

        This extension provides control over the global dimmer panel of the Magic Leap 2. The Global Dimming™ feature dims the entire display without dimming digital content to make text and images more solid and precise.

        Note that when using the #ENVIRONMENT_BLEND_MODE_ALPHA_BLEND mode the alpha channel of the color swapchain image is combined with the global dimmer value. The global dimmer however is able to address the whole panel whereas the alpha channel covers the video addressable portion.
        """

    IntConstant(
        "The extension specification version.",

        "ML_global_dimmer_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "ML_GLOBAL_DIMMER_EXTENSION_NAME".."XR_ML_global_dimmer"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_GLOBAL_DIMMER_FRAME_END_INFO_ML".."1000136000"
    )

    EnumConstant(
        """
        XrGlobalDimmerFrameEndInfoFlagBitsML - XrGlobalDimmerFrameEndInfoFlagBitsML

        <h5>Description</h5>
        The flag bits have the following meanings:

        <h5>Flag Descriptions</h5>
        <ul>
            <li>#GLOBAL_DIMMER_FRAME_END_INFO_ENABLED_BIT_ML — Indicates that the global dimmer <b>should</b> be enabled and controlled by ##XrGlobalDimmerFrameEndInfoML{@code ::dimmerValue}.</li>
        </ul>

        <h5>See Also</h5>
        ##XrGlobalDimmerFrameEndInfoML, #EndFrame()
        """,

        "GLOBAL_DIMMER_FRAME_END_INFO_ENABLED_BIT_ML".enum(0x00000001)
    )
}