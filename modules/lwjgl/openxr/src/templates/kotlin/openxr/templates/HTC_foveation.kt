/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val HTC_foveation = "HTCFoveation".nativeClassXR("HTC_foveation", type = "instance", postfix = "HTC") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_HTC_foveation">XR_HTC_foveation</a> extension.

        This extension enables an application to gain rendering performance improvement by reducing the pixel density of areas in the peripheral vision. The areas near the focal point still sustains the original pixel density than periphery.

        The application <b>can</b> use this extension in the following steps:

        <ul>
            <li>Create an ##XrFoveationApplyInfoHTC structure with the desired foveation configurations.</li>
            <li>Apply the foveation configuration by calling #ApplyFoveationHTC() with desired ##XrFoveationApplyInfoHTC.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This extension is recommended for {@code XrSession} whose {@code XrViewConfigurationType} is #VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO.
        </div>
        """

    IntConstant(
        "The extension specification version.",

        "HTC_foveation_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "HTC_FOVEATION_EXTENSION_NAME".."XR_HTC_foveation"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_FOVEATION_APPLY_INFO_HTC".."1000318000",
        "TYPE_FOVEATION_DYNAMIC_MODE_INFO_HTC".."1000318001",
        "TYPE_FOVEATION_CUSTOM_MODE_INFO_HTC".."1000318002"
    )

    EnumConstant(
        """
        XrFoveationModeHTC - Foveation mode

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#FOVEATION_MODE_DISABLE_HTC — No foveation</li>
            <li>#FOVEATION_MODE_FIXED_HTC — Apply system default setting with fixed clear FOV and periphery quality.</li>
            <li>#FOVEATION_MODE_DYNAMIC_HTC — Allow system to set foveation dynamically according realtime system metric or other extensions.</li>
            <li>#FOVEATION_MODE_CUSTOM_HTC — Allow application to set foveation with desired clear FOV, periphery quality, and focal center offset.</li>
        </ul>

        <h5>See Also</h5>
        ##XrFoveationApplyInfoHTC
        """,

        "FOVEATION_MODE_DISABLE_HTC".."0",
        "FOVEATION_MODE_FIXED_HTC".."1",
        "FOVEATION_MODE_DYNAMIC_HTC".."2",
        "FOVEATION_MODE_CUSTOM_HTC".."3"
    )

    EnumConstant(
        """
        XrFoveationLevelHTC - The pixel density drop level of periphery area

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#FOVEATION_LEVEL_NONE_HTC — No foveation</li>
            <li>#FOVEATION_LEVEL_LOW_HTC — Light periphery pixel density drop and lower performance gain.</li>
            <li>#FOVEATION_LEVEL_MEDIUM_HTC — Medium periphery pixel density drop and medium performance gain</li>
            <li>#FOVEATION_LEVEL_HIGH_HTC — Heavy periphery pixel density drop and higher performance gain</li>
        </ul>

        <h5>See Also</h5>
        ##XrFoveationConfigurationHTC
        """,

        "FOVEATION_LEVEL_NONE_HTC".."0",
        "FOVEATION_LEVEL_LOW_HTC".."1",
        "FOVEATION_LEVEL_MEDIUM_HTC".."2",
        "FOVEATION_LEVEL_HIGH_HTC".."3"
    )

    EnumConstant(
        """
        XrFoveationDynamicFlagBitsHTC - Features allow to change in dynamic mode

        <h5>Flag Descriptions</h5>
        <ul>
            <li>#FOVEATION_DYNAMIC_LEVEL_ENABLED_BIT_HTC — Allow system to set periphery pixel density dynamically.</li>
            <li>#FOVEATION_DYNAMIC_CLEAR_FOV_ENABLED_BIT_HTC — Allow system to set clear FOV degree dynamically.</li>
            <li>#FOVEATION_DYNAMIC_FOCAL_CENTER_OFFSET_ENABLED_BIT_HTC — Allow system to set focal center offset dynamically.</li>
        </ul>
        """,

        "FOVEATION_DYNAMIC_LEVEL_ENABLED_BIT_HTC".enum(0x00000001),
        "FOVEATION_DYNAMIC_CLEAR_FOV_ENABLED_BIT_HTC".enum(0x00000002),
        "FOVEATION_DYNAMIC_FOCAL_CENTER_OFFSET_ENABLED_BIT_HTC".enum(0x00000004)
    )

    XrResult(
        "ApplyFoveationHTC",
        """
        Apply foveation config to system.

        <h5>C Specification</h5>
        The #ApplyFoveationHTC() function is defined as:

        <pre><code>
￿XrResult xrApplyFoveationHTC(
￿    XrSession                                   session,
￿    const XrFoveationApplyInfoHTC*              applyInfo);</code></pre>

        <h5>Description</h5>
        The foveation configuration will be applied after this call, and the state will persist until the next call to #ApplyFoveationHTC() or the end of this {@code XrSession}, whichever comes first. You <b>should</b> not call #ApplyFoveationHTC() during rendering to target image layer ##XrSwapchainSubImage in render loop.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCFoveation XR_HTC_foveation} extension <b>must</b> be enabled prior to calling #ApplyFoveationHTC()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code applyInfo} <b>must</b> be a pointer to a valid ##XrFoveationApplyInfoHTC structure</li>
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
                <li>#ERROR_LIMIT_REACHED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrFoveationApplyInfoHTC
        """,

        XrSession("session", "a handle to an {@code XrSession} in which the foveation will apply to."),
        XrFoveationApplyInfoHTC.const.p("applyInfo", "a pointer to an ##XrFoveationApplyInfoHTC structure containing information about the foveation configuration and applied ##XrSwapchainSubImage.")
    )
}