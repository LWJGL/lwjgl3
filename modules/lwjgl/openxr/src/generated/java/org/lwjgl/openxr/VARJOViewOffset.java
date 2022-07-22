/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** The VARJO_view_offset extension. */
public class VARJOViewOffset {

    /** The extension specification version. */
    public static final int XR_VARJO_view_offset_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_VARJO_VIEW_OFFSET_EXTENSION_NAME = "XR_VARJO_view_offset";

    protected VARJOViewOffset() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSetViewOffsetVARJO ] ---

    /**
     * Set view offest.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrSetViewOffsetVARJO SetViewOffsetVARJO} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult  xrSetViewOffsetVARJO(
     *     XrSession                                   session,
     *     float                                       offset);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrSetViewOffsetVARJO SetViewOffsetVARJO} function takes a float between 0.0 and 1.0. 0.0 means the pose returned by {@link XR10#xrLocateViews LocateViews} will be at the eye location, a value of 1.0 means the pose will be at the camera location. A value between 0.0 and 1.0 will interpolate the pose to be in between the eye and the camera location. A value less than 0.0 or more than 1.0 will fail and return error {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}.</p>
     * 
     * <p>Note that by default the offset is set to 0 if the pass-through cameras are not active, a.k.a. in VR ({@link XR10#XR_ENVIRONMENT_BLEND_MODE_OPAQUE ENVIRONMENT_BLEND_MODE_OPAQUE}), and 1 if the cameras are active, a.k.a. in MR ({@link XR10#XR_ENVIRONMENT_BLEND_MODE_ALPHA_BLEND ENVIRONMENT_BLEND_MODE_ALPHA_BLEND} or {@link XR10#XR_ENVIRONMENT_BLEND_MODE_ADDITIVE ENVIRONMENT_BLEND_MODE_ADDITIVE}).</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link VARJOViewOffset XR_VARJO_view_offset} extension <b>must</b> be enabled prior to calling {@link #xrSetViewOffsetVARJO SetViewOffsetVARJO}</li>
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
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <p><b>Version History</b></p>
     * 
     * <ul>
     * <li>Revision 1, 2022-02-08 (Remi Arnaud)
     * 
     * <ul>
     * <li>extension specification</li>
     * </ul>
     * </li>
     * </ul>
     *
     * @param session an {@code XrSession} handle previously created with {@link XR10#xrCreateSession CreateSession}.
     * @param offset  the view offset to be applied. Must be between 0 and 1.
     */
    @NativeType("XrResult")
    public static int xrSetViewOffsetVARJO(XrSession session, float offset) {
        long __functionAddress = session.getCapabilities().xrSetViewOffsetVARJO;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(session.address(), offset, __functionAddress);
    }

}