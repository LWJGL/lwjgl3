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
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_VARJO_environment_depth_estimation">XR_VARJO_environment_depth_estimation</a> extension.

        This extension provides a mechanism for enabling depth estimation of the environment in the runtime-supplied compositor. This is an extension to #ENVIRONMENT_BLEND_MODE_ALPHA_BLEND mode to not only use the color but also depth for composition of the final image.

        Mixed reality applications might want to mix real and virtual content based on the depth information for proper occlusion. XR hardware and runtime may offer various ways to estimate the depth of the environment inside the compositor. When this estimation is enabled, the compositor can generate properly occluded final image when layers are submitted with depth information (both {@link KHRCompositionLayerDepth XR_KHR_composition_layer_depth} and {@link VARJOCompositionLayerDepthTest XR_VARJO_composition_layer_depth_test}).

        This extension defines a new function, #SetEnvironmentDepthEstimationVARJO(), which <b>can</b> be used to toggle environment depth estimation in the compositor. Toggling depth estimation is an asynchronous operation and the feature <b>may</b> not be activated immediately. Function can be called immediately after the session is created. Composition of the environment layer follows the rules as described in {@link VARJOCompositionLayerDepthTest XR_VARJO_composition_layer_depth_test}.
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