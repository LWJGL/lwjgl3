/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** The VARJO_environment_depth_estimation extension. */
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