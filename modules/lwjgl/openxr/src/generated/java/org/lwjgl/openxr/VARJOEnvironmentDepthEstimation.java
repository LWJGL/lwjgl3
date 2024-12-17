/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class VARJOEnvironmentDepthEstimation {

    public static final int XR_VARJO_environment_depth_estimation_SPEC_VERSION = 1;

    public static final String XR_VARJO_ENVIRONMENT_DEPTH_ESTIMATION_EXTENSION_NAME = "XR_VARJO_environment_depth_estimation";

    protected VARJOEnvironmentDepthEstimation() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSetEnvironmentDepthEstimationVARJO ] ---

    /** {@code XrResult xrSetEnvironmentDepthEstimationVARJO(XrSession session, XrBool32 enabled)} */
    @NativeType("XrResult")
    public static int xrSetEnvironmentDepthEstimationVARJO(XrSession session, @NativeType("XrBool32") boolean enabled) {
        long __functionAddress = session.getCapabilities().xrSetEnvironmentDepthEstimationVARJO;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(session.address(), enabled ? 1 : 0, __functionAddress);
    }

}