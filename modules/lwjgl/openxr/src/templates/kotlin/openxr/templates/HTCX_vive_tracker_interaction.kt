/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val HTCX_vive_tracker_interaction = "HTCXViveTrackerInteraction".nativeClassXR("HTCX_vive_tracker_interaction", type = "instance", postfix = "HTCX") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "HTCX_vive_tracker_interaction_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "HTCX_VIVE_TRACKER_INTERACTION_EXTENSION_NAME".."XR_HTCX_vive_tracker_interaction"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_VIVE_TRACKER_PATHS_HTCX".."1000103000",
        "TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX".."1000103001"
    )

    XrResult(
        "EnumerateViveTrackerPathsHTCX",
        """
        Enumerates all connected VIVE trackers.

        <h5>C Specification</h5>
        The #EnumerateViveTrackerPathsHTCX() function is defined as:

        <pre><code>
￿XrResult xrEnumerateViveTrackerPathsHTCX(
￿    XrInstance                                  instance,
￿    uint32_t                                    pathsCapacityInput,
￿    uint32_t*                                   pathsCountOutput,
￿    XrViveTrackerPathsHTCX*                     viveTrackerPaths);</code></pre>

        <h5>Description</h5>
        #EnumerateViveTrackerPathsHTCX() enumerates all connected VIVE trackers to retrieve their paths under current instance.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCXViveTrackerInteraction XR_HTCX_vive_tracker_interaction} extension <b>must</b> be enabled prior to calling #EnumerateViveTrackerPathsHTCX()</li>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code pathsCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code pathsCapacityInput} is not 0, {@code viveTrackerPaths} <b>must</b> be a pointer to an array of {@code pathsCapacityInput} ##XrViveTrackerPathsHTCX structures</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SIZE_INSUFFICIENT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrViveTrackerPathsHTCX
        """,

        XrInstance("instance", "an instance previously created."),
        AutoSize("viveTrackerPaths")..uint32_t("pathsCapacityInput", "the capacity of the {@code viveTrackerPaths}, or 0 to retrieve the required capacity."),
        Check(1)..uint32_t.p("pathsCountOutput", "a pointer to the count of ##XrViveTrackerPathsHTCX {@code viveTrackerPaths} written, or a pointer to the required capacity in the case that {@code pathsCapacityInput} is 0."),
        nullable..XrViveTrackerPathsHTCX.p("viveTrackerPaths", "a pointer to an array of ##XrViveTrackerPathsHTCX VIVE tracker paths, but <b>can</b> be {@code NULL} if {@code pathsCapacityInput} is 0.")
    )
}