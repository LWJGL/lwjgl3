/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_passthrough_preferences = "METAPassthroughPreferences".nativeClassXR("META_passthrough_preferences", type = "instance", postfix = "META") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_META_passthrough_preferences">XR_META_passthrough_preferences</a> extension.

        This extension provides applications with access to system preferences concerning passthrough. For more information on how applications can control the display of passthrough, see {@link FBPassthrough XR_FB_passthrough}.
        """

    IntConstant(
        "The extension specification version.",

        "META_passthrough_preferences_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "META_PASSTHROUGH_PREFERENCES_EXTENSION_NAME".."XR_META_passthrough_preferences"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_PASSTHROUGH_PREFERENCES_META".."1000217000"
    )

    EnumConstant(
        """
        XrPassthroughPreferenceFlagBitsMETA - XrPassthroughPreferenceFlagBitsMETA

        <h5>Flag Descriptions</h5>
        <ul>
            <li>#PASSTHROUGH_PREFERENCE_DEFAULT_TO_ACTIVE_BIT_META — Indicates that the runtime recommends apps to default to a mixed reality experience with passthrough (if supported).</li>
        </ul>
        """,

        "PASSTHROUGH_PREFERENCE_DEFAULT_TO_ACTIVE_BIT_META".enum(0x00000001)
    )

    XrResult(
        "GetPassthroughPreferencesMETA",
        """
        Get passthrough preferences.

        <h5>C Specification</h5>
        The #GetPassthroughPreferencesMETA() function is defined as:

        <pre><code>
￿XrResult xrGetPassthroughPreferencesMETA(
￿    XrSession                                   session,
￿    XrPassthroughPreferencesMETA*               preferences);</code></pre>

        <h5>Description</h5>
        An application <b>can</b> call #GetPassthroughPreferencesMETA() to retrieve passthrough-related preferences from the system.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAPassthroughPreferences XR_META_passthrough_preferences} extension <b>must</b> be enabled prior to calling #GetPassthroughPreferencesMETA()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code preferences} <b>must</b> be a pointer to an ##XrPassthroughPreferencesMETA structure</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrPassthroughPreferencesMETA
        """,

        XrSession("session", "the {@code XrSession}."),
        XrPassthroughPreferencesMETA.p("preferences", "points to an instance of ##XrPassthroughPreferencesMETA structure, that will be filled with returned information")
    )
}