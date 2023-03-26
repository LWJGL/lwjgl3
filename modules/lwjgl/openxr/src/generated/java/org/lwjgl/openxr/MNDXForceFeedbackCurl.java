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
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_MNDX_force_feedback_curl">XR_MNDX_force_feedback_curl</a> extension.
 * 
 * <p>This extension provides APIs for force feedback devices capable of restricting physical movement in a single direction along a single dimension.</p>
 * 
 * <p>The intended use for this extension is to provide simple force feedback capabilities to restrict finger movement for VR Gloves.</p>
 * 
 * <p>The application <b>must</b> also enable the {@link EXTHandTracking XR_EXT_hand_tracking} extension in order to use this extension.</p>
 */
public class MNDXForceFeedbackCurl {

    /** The extension specification version. */
    public static final int XR_MNDX_force_feedback_curl_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_MNDX_FORCE_FEEDBACK_CURL_EXTENSION_NAME = "XR_MNDX_force_feedback_curl";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SYSTEM_FORCE_FEEDBACK_CURL_PROPERTIES_MNDX TYPE_SYSTEM_FORCE_FEEDBACK_CURL_PROPERTIES_MNDX}</li>
     * <li>{@link #XR_TYPE_FORCE_FEEDBACK_CURL_APPLY_LOCATIONS_MNDX TYPE_FORCE_FEEDBACK_CURL_APPLY_LOCATIONS_MNDX}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SYSTEM_FORCE_FEEDBACK_CURL_PROPERTIES_MNDX = 1000375000,
        XR_TYPE_FORCE_FEEDBACK_CURL_APPLY_LOCATIONS_MNDX   = 1000375001;

    /**
     * XrForceFeedbackCurlLocationMNDX - Describes which location to apply force feedback
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_FORCE_FEEDBACK_CURL_LOCATION_THUMB_CURL_MNDX FORCE_FEEDBACK_CURL_LOCATION_THUMB_CURL_MNDX} — force feedback for thumb curl</li>
     * <li>{@link #XR_FORCE_FEEDBACK_CURL_LOCATION_INDEX_CURL_MNDX FORCE_FEEDBACK_CURL_LOCATION_INDEX_CURL_MNDX} — force feedback for index finger curl</li>
     * <li>{@link #XR_FORCE_FEEDBACK_CURL_LOCATION_MIDDLE_CURL_MNDX FORCE_FEEDBACK_CURL_LOCATION_MIDDLE_CURL_MNDX} — force feedback for middle finger curl</li>
     * <li>{@link #XR_FORCE_FEEDBACK_CURL_LOCATION_RING_CURL_MNDX FORCE_FEEDBACK_CURL_LOCATION_RING_CURL_MNDX} — force feedback for ring finger curl</li>
     * <li>{@link #XR_FORCE_FEEDBACK_CURL_LOCATION_LITTLE_CURL_MNDX FORCE_FEEDBACK_CURL_LOCATION_LITTLE_CURL_MNDX} — force feedback for little finger curl</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrForceFeedbackCurlApplyLocationMNDX}</p>
     */
    public static final int
        XR_FORCE_FEEDBACK_CURL_LOCATION_THUMB_CURL_MNDX  = 0,
        XR_FORCE_FEEDBACK_CURL_LOCATION_INDEX_CURL_MNDX  = 1,
        XR_FORCE_FEEDBACK_CURL_LOCATION_MIDDLE_CURL_MNDX = 2,
        XR_FORCE_FEEDBACK_CURL_LOCATION_RING_CURL_MNDX   = 3,
        XR_FORCE_FEEDBACK_CURL_LOCATION_LITTLE_CURL_MNDX = 4;

    protected MNDXForceFeedbackCurl() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrApplyForceFeedbackCurlMNDX ] ---

    /** Unsafe version of: {@link #xrApplyForceFeedbackCurlMNDX ApplyForceFeedbackCurlMNDX} */
    public static int nxrApplyForceFeedbackCurlMNDX(XrHandTrackerEXT handTracker, long locations) {
        long __functionAddress = handTracker.getCapabilities().xrApplyForceFeedbackCurlMNDX;
        if (CHECKS) {
            check(__functionAddress);
            XrForceFeedbackCurlApplyLocationsMNDX.validate(locations);
        }
        return callPPI(handTracker.address(), locations, __functionAddress);
    }

    /**
     * Applies force feedback to a set of locations.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrApplyForceFeedbackCurlMNDX ApplyForceFeedbackCurlMNDX} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrApplyForceFeedbackCurlMNDX(
     *     XrHandTrackerEXT                            handTracker,
     *     const XrForceFeedbackCurlApplyLocationsMNDX* locations);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrApplyForceFeedbackCurlMNDX ApplyForceFeedbackCurlMNDX} function applies force feedback to the set locations listed in {@link XrForceFeedbackCurlApplyLocationsMNDX}.</p>
     * 
     * <p>{@link #xrApplyForceFeedbackCurlMNDX ApplyForceFeedbackCurlMNDX} <b>should</b> be called every time an application wishes to update a set of force feedback locations.</p>
     * 
     * <p>Submits a request for force feedback for a set of locations. The runtime <b>should</b> deliver this request to the {@code handTracker} device. If the {@code handTracker} device is not available, the runtime <b>may</b> ignore this request for force feedback.</p>
     * 
     * <p>If the session associated with {@code handTracker} is not focused, the runtime <b>must</b> return {@link XR10#XR_SESSION_NOT_FOCUSED SESSION_NOT_FOCUSED}, and not apply force feedback.</p>
     * 
     * <p>When an application submits force feedback for a set of locations, the runtime <b>must</b> update the set of locations to that specified by the application. A runtime <b>must</b> set any locations not specified by the application when submitting force feedback to 0.</p>
     * 
     * <p>The runtime <b>may</b> discontinue force feedback if the application that set it loses focus. An application <b>should</b> call the function again after regaining focus if force feedback is still desired.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MNDXForceFeedbackCurl XR_MNDX_force_feedback_curl} extension <b>must</b> be enabled prior to calling {@link #xrApplyForceFeedbackCurlMNDX ApplyForceFeedbackCurlMNDX}</li>
     * <li>{@code handTracker} <b>must</b> be a valid {@code XrHandTrackerEXT} handle</li>
     * <li>{@code locations} <b>must</b> be a pointer to a valid {@link XrForceFeedbackCurlApplyLocationsMNDX} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * <li>{@link XR10#XR_SESSION_NOT_FOCUSED SESSION_NOT_FOCUSED}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrForceFeedbackCurlApplyLocationsMNDX}</p>
     *
     * @param handTracker an {@code XrHandTrackerEXT} handle previously created with {@link EXTHandTracking#xrCreateHandTrackerEXT CreateHandTrackerEXT}.
     * @param locations   an {@link XrForceFeedbackCurlApplyLocationsMNDX} containing a set of locations to apply force feedback to.
     */
    @NativeType("XrResult")
    public static int xrApplyForceFeedbackCurlMNDX(XrHandTrackerEXT handTracker, @NativeType("XrForceFeedbackCurlApplyLocationsMNDX const *") XrForceFeedbackCurlApplyLocationsMNDX locations) {
        return nxrApplyForceFeedbackCurlMNDX(handTracker, locations.address());
    }

}