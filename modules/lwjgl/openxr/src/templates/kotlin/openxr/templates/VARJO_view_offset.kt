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
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_VARJO_view_offset">XR_VARJO_view_offset</a> extension.

        Varjo headsets use video pass-through cameras to create the mixed reality (MR) image. The cameras are located around 10 cm (3.9 inches) in front of the user’s eyes, which leads to an offset in depth perception so that real-world objects in the video pass-through image appear larger than they are in real life. The image below gives a visualization of the difference between what the camera sees and what the user would see in real life.

        

        This magnification effect is pronounced for objects that are close to the user – for example, their hands may appear unnaturally large in the image. The effect decreases with distance, so that objects at a distance of 2 meters already appear close to their actual size, and the sizes eventually converge at infinity. Note that while the objects' sizes may differ, their geometry, relative sizes, locations, etc. remain accurate. The extent of the magnification effect ultimately depends both on the application itself and the user’s physiology, as the human visual system is highly adaptive in this type of setting.

        When blending the video pass-through image with virtual content, it is important that their relative geometries – position, size, and disparity – match one another. To achieve this, Varjo’s runtime automatically places the virtual reality cameras in the same position as the physical cameras when the video pass-through feature is enabled (see #ENVIRONMENT_BLEND_MODE_ALPHA_BLEND). This allows virtual and real-world content to appear at the same distance and on the same plane when viewed together. While this can be observed as an apparent jump in the location of virtual objects compared to VR-only content, this does not cause any distortion in the object geometry or location; it is only the viewer’s location that changes.

        In some cases, moving the VR content to match the real-world position may not be desirable. This extension enable the application to control where the VR content is rendered from the location of the user’s eyes while the video pass-through image uses the camera locations. For example, if the virtual object is close the user, or if the application is switching between VR and MR modes. Offset values between 0.0 and 1.0 are supported. You can use this to create a smooth, animated transition between the two rendering positions in case you need to change from one to the other during a session.
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