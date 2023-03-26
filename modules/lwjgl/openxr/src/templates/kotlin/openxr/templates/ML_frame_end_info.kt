/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ML_frame_end_info = "MLFrameEndInfo".nativeClassXR("ML_frame_end_info", type = "instance", postfix = "ML") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_ML_frame_end_info">XR_ML_frame_end_info</a> extension.

        This extension provides access to Magic Leap specific extensions to frame settings like focus distance, vignette, and protection.
        """

    IntConstant(
        "The extension specification version.",

        "ML_frame_end_info_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "ML_FRAME_END_INFO_EXTENSION_NAME".."XR_ML_frame_end_info"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_FRAME_END_INFO_ML".."1000135000"
    )

    EnumConstant(
        """
        XrFrameEndInfoFlagBitsML - XrFrameEndInfoFlagBitsML

        <h5>Description</h5>
        The flag bits have the following meanings:

        <h5>Flag Descriptions</h5>
        <ul>
            <li>#FRAME_END_INFO_PROTECTED_BIT_ML — Indicates that the content for this frame is protected and should not be recorded or captured outside the graphics system.</li>
            <li>#FRAME_END_INFO_VIGNETTE_BIT_ML — Indicates that a soft fade to transparent should be added to the frame in the compositor to blend any hard edges at the FOV limits.</li>
        </ul>

        <h5>See Also</h5>
        ##XrFrameEndInfoML, #EndFrame()
        """,

        "FRAME_END_INFO_PROTECTED_BIT_ML".enum(0x00000001),
        "FRAME_END_INFO_VIGNETTE_BIT_ML".enum(0x00000002)
    )
}