/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val VARJO_environment_depth_estimation = "VARJOEnvironmentDepthEstimation".nativeClassXR("VARJO_environment_depth_estimation", type = "instance", postfix = "VARJO") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "VARJO_environment_depth_estimation_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "VARJO_ENVIRONMENT_DEPTH_ESTIMATION_EXTENSION_NAME".."XR_VARJO_environment_depth_estimation"
    )

    XrResult(
        "SetEnvironmentDepthEstimationVARJO",
        """
        Enable or disable environment depth estimation functionality.

        <h5>C Specification</h5>
        The #SetEnvironmentDepthEstimationVARJO() function is defined as:

        <pre><code>
￿XrResult xrSetEnvironmentDepthEstimationVARJO(
￿    XrSession                                   session,
￿    XrBool32                                    enabled);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link VARJOEnvironmentDepthEstimation XR_VARJO_environment_depth_estimation} extension <b>must</b> be enabled prior to calling #SetEnvironmentDepthEstimationVARJO()</li>
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
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>
        """,

        XrSession("session", "an {@code XrSession} handle previously created with #CreateSession()."),
        XrBool32("enabled", "a boolean that specifies whether depth estimation functionality should be activated. Compositor will disable depth estimation functionality if environment blend mode is not #ENVIRONMENT_BLEND_MODE_ALPHA_BLEND and will enable the functionality when environment blend mode is set to #ENVIRONMENT_BLEND_MODE_ALPHA_BLEND.")
    )
}