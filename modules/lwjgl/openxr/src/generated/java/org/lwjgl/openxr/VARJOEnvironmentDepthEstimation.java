/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_VARJO_environment_depth_estimation">XR_VARJO_environment_depth_estimation</a> extension.
 * 
 * <p>This extension provides a mechanism for enabling depth estimation of the environment in the runtime-supplied compositor. This is an extension to {@link XR10#XR_ENVIRONMENT_BLEND_MODE_ALPHA_BLEND ENVIRONMENT_BLEND_MODE_ALPHA_BLEND} mode to not only use the color but also depth for composition of the final image.</p>
 * 
 * <p>Mixed reality applications might want to mix real and virtual content based on the depth information for proper occlusion. XR hardware and runtime may offer various ways to estimate the depth of the environment inside the compositor. When this estimation is enabled, the compositor can generate properly occluded final image when layers are submitted with depth information (both {@link KHRCompositionLayerDepth XR_KHR_composition_layer_depth} and {@link VARJOCompositionLayerDepthTest XR_VARJO_composition_layer_depth_test}).</p>
 * 
 * <p>This extension defines a new function, {@link #xrSetEnvironmentDepthEstimationVARJO SetEnvironmentDepthEstimationVARJO}, which <b>can</b> be used to toggle environment depth estimation in the compositor. Toggling depth estimation is an asynchronous operation and the feature <b>may</b> not be activated immediately. Function can be called immediately after the session is created. Composition of the environment layer follows the rules as described in {@link VARJOCompositionLayerDepthTest XR_VARJO_composition_layer_depth_test}.</p>
 */
public class VARJOEnvironmentDepthEstimation {

    /** The extension specification version. */
    public static final int XR_VARJO_environment_depth_estimation_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_VARJO_ENVIRONMENT_DEPTH_ESTIMATION_EXTENSION_NAME = "XR_VARJO_environment_depth_estimation";

    protected VARJOEnvironmentDepthEstimation() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSetEnvironmentDepthEstimationVARJO ] ---

    /**
     * Enable or disable environment depth estimation functionality.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrSetEnvironmentDepthEstimationVARJO SetEnvironmentDepthEstimationVARJO} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrSetEnvironmentDepthEstimationVARJO(
     *     XrSession                                   session,
     *     XrBool32                                    enabled);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link VARJOEnvironmentDepthEstimation XR_VARJO_environment_depth_estimation} extension <b>must</b> be enabled prior to calling {@link #xrSetEnvironmentDepthEstimationVARJO SetEnvironmentDepthEstimationVARJO}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     *
     * @param session an {@code XrSession} handle previously created with {@link XR10#xrCreateSession CreateSession}.
     * @param enabled a boolean that specifies whether depth estimation functionality should be activated. Compositor will disable depth estimation functionality if environment blend mode is not {@link XR10#XR_ENVIRONMENT_BLEND_MODE_ALPHA_BLEND ENVIRONMENT_BLEND_MODE_ALPHA_BLEND} and will enable the functionality when environment blend mode is set to {@link XR10#XR_ENVIRONMENT_BLEND_MODE_ALPHA_BLEND ENVIRONMENT_BLEND_MODE_ALPHA_BLEND}.
     */
    @NativeType("XrResult")
    public static int xrSetEnvironmentDepthEstimationVARJO(XrSession session, @NativeType("XrBool32") boolean enabled) {
        long __functionAddress = session.getCapabilities().xrSetEnvironmentDepthEstimationVARJO;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(session.address(), enabled ? 1 : 0, __functionAddress);
    }

}