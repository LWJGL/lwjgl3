/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val VARJO_view_offset = "VARJOViewOffset".nativeClassXR("VARJO_view_offset", type = "instance", postfix = "VARJO") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "VARJO_view_offset_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "VARJO_VIEW_OFFSET_EXTENSION_NAME".."XR_VARJO_view_offset"
    )

    XrResult(
        "SetViewOffsetVARJO",
        """
        Set view offest.

        <h5>C Specification</h5>
        The #SetViewOffsetVARJO() function is defined as:

        <pre><code>
￿XrResult  xrSetViewOffsetVARJO(
￿    XrSession                                   session,
￿    float                                       offset);</code></pre>

        <h5>Description</h5>
        The #SetViewOffsetVARJO() function takes a float between 0.0 and 1.0. 0.0 means the pose returned by #LocateViews() will be at the eye location, a value of 1.0 means the pose will be at the camera location. A value between 0.0 and 1.0 will interpolate the pose to be in between the eye and the camera location. A value less than 0.0 or more than 1.0 will fail and return error #ERROR_VALIDATION_FAILURE.

        Note that by default the offset is set to 0 if the pass-through cameras are not active, a.k.a. in VR (#ENVIRONMENT_BLEND_MODE_OPAQUE), and 1 if the cameras are active, a.k.a. in MR (#ENVIRONMENT_BLEND_MODE_ALPHA_BLEND or #ENVIRONMENT_BLEND_MODE_ADDITIVE).

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link VARJOViewOffset XR_VARJO_view_offset} extension <b>must</b> be enabled prior to calling #SetViewOffsetVARJO()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <b>Version History</b>

        <ul>
            <li>
                Revision 1, 2022-02-08 (Remi Arnaud)
                <ul>
                    <li>extension specification</li>
                </ul>
            </li>
        </ul>
        """,

        XrSession("session", "an {@code XrSession} handle previously created with #CreateSession()."),
        float("offset", "the view offset to be applied. Must be between 0 and 1.")
    )
}