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
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_META_passthrough_preferences">XR_META_passthrough_preferences</a> extension.
 * 
 * <p>This extension provides applications with access to system preferences concerning passthrough. For more information on how applications can control the display of passthrough, see {@link FBPassthrough XR_FB_passthrough}.</p>
 */
public class METAPassthroughPreferences {

    /** The extension specification version. */
    public static final int XR_META_passthrough_preferences_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_META_PASSTHROUGH_PREFERENCES_EXTENSION_NAME = "XR_META_passthrough_preferences";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_PASSTHROUGH_PREFERENCES_META = 1000217000;

    /**
     * XrPassthroughPreferenceFlagBitsMETA - XrPassthroughPreferenceFlagBitsMETA
     * 
     * <h5>Flag Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_PASSTHROUGH_PREFERENCE_DEFAULT_TO_ACTIVE_BIT_META PASSTHROUGH_PREFERENCE_DEFAULT_TO_ACTIVE_BIT_META} — Indicates that the runtime recommends apps to default to a mixed reality experience with passthrough (if supported).</li>
     * </ul>
     */
    public static final int XR_PASSTHROUGH_PREFERENCE_DEFAULT_TO_ACTIVE_BIT_META = 0x1;

    protected METAPassthroughPreferences() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetPassthroughPreferencesMETA ] ---

    /** Unsafe version of: {@link #xrGetPassthroughPreferencesMETA GetPassthroughPreferencesMETA} */
    public static int nxrGetPassthroughPreferencesMETA(XrSession session, long preferences) {
        long __functionAddress = session.getCapabilities().xrGetPassthroughPreferencesMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), preferences, __functionAddress);
    }

    /**
     * Get passthrough preferences.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetPassthroughPreferencesMETA GetPassthroughPreferencesMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetPassthroughPreferencesMETA(
     *     XrSession                                   session,
     *     XrPassthroughPreferencesMETA*               preferences);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>An application <b>can</b> call {@link #xrGetPassthroughPreferencesMETA GetPassthroughPreferencesMETA} to retrieve passthrough-related preferences from the system.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METAPassthroughPreferences XR_META_passthrough_preferences} extension <b>must</b> be enabled prior to calling {@link #xrGetPassthroughPreferencesMETA GetPassthroughPreferencesMETA}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code preferences} <b>must</b> be a pointer to an {@link XrPassthroughPreferencesMETA} structure</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrPassthroughPreferencesMETA}</p>
     *
     * @param session     the {@code XrSession}.
     * @param preferences points to an instance of {@link XrPassthroughPreferencesMETA} structure, that will be filled with returned information
     */
    @NativeType("XrResult")
    public static int xrGetPassthroughPreferencesMETA(XrSession session, @NativeType("XrPassthroughPreferencesMETA *") XrPassthroughPreferencesMETA preferences) {
        return nxrGetPassthroughPreferencesMETA(session, preferences.address());
    }

}