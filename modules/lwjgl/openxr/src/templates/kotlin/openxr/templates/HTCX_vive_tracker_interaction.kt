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
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_HTCX_vive_tracker_interaction">XR_HTCX_vive_tracker_interaction</a> extension.

        This extension defines a new interaction profile for HTC VIVE Tracker. HTC VIVE Tracker is a generic tracked device which can be attached to anything to make them trackable. For example, it can be attached to user’s hands or feet to track the motion of human body. It can also be attached to any other devices the user wants to track and interact with.

        In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into #CreateInstance() via the ##XrInstanceCreateInfo {@code enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#extensions">extensions</a> section.

        This extension allows:

        <ul>
            <li>An application to enumerate the subpaths of all current connected VIVE trackers.</li>
            <li>An application to receive notification of the top level paths of a VIVE tracker when it is connected.</li>
        </ul>

        The paths of a VIVE tracker contains two paths below:

        <ul>
            <li>VIVE tracker persistent path indicate a specific tracker whose lifetime lasts longer than an instance, which means it <b>must</b> not change during its hardware lifetime. The format of this path string is unspecified and should be treated as an opaque string.</li>
            <li>
                VIVE tracker role path <b>may</b> be constructed as "/user/vive_tracker_htcx/role/<em>ROLE_VALUE</em>", where <em>ROLE_VALUE</em> takes one of the following values. The role path <b>may</b> be assigned from the tool provided by the runtime and is #NULL_PATH if it has not been assigned. If this role path refers to more than one tracker, the runtime <b>should</b> choose one of them to be currently active. The role path <b>may</b> be changed during the lifetime of instance. Whenever it is changed, the runtime <b>must</b> send event #TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX to provide the new role path of that tracker.
                <dl>
            <dt>ROLE_VALUE</dt>
                    <dd><ul>
                        <li>{@code XR_NULL_PATH}</li>
                        <li>{@code handheld_object}</li>
                        <li>{@code left_foot}</li>
                        <li>{@code right_foot}</li>
                        <li>{@code left_shoulder}</li>
                        <li>{@code right_shoulder}</li>
                        <li>{@code left_elbow}</li>
                        <li>{@code right_elbow}</li>
                        <li>{@code left_knee}</li>
                        <li>{@code right_knee}</li>
                        <li>{@code left_wrist} (rev: 3)</li>
                        <li>{@code right_wrist} (rev: 3)</li>
                        <li>{@code left_ankle} (rev: 3)</li>
                        <li>{@code right_ankle} (rev: 3)</li>
                        <li>{@code waist}</li>
                        <li>{@code chest}</li>
                        <li>{@code camera}</li>
                        <li>{@code keyboard}</li>
                    </ul></dd>
                </dl>
            </li>
            <li>Either the persistent path or the role path can be be passed as a subaction path to indicate a specific tracker. For example, ##XrActionCreateInfo{@code ::subactionPath} into function #CreateAction() or ##XrActionSpaceCreateInfo{@code ::subactionPath} into function #CreateActionSpace(). Please see Example 1 below.</li>
        </ul>

        <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#input-suggested-bindings">As with other controllers</a>, if a VIVE tracker is connected and bound to a top-level user path, or disconnected while bound to top-level user path, the runtime <b>must</b> send event #TYPE_EVENT_DATA_INTERACTION_PROFILE_CHANGED, and the application <b>may</b> call #GetCurrentInteractionProfile() to check if the tracker is active or not.

        The device that a tracker is attached to probably has a different motion model than what the tracker assumes. The motion tracking might not be as expected in this case.
        """

    IntConstant(
        "The extension specification version.",

        "HTCX_vive_tracker_interaction_SPEC_VERSION".."3"
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
        Check(1)..uint32_t.p("pathsCountOutput", "a pointer to the count of ##XrViveTrackerPathsHTCX {@code viveTrackerPaths} written, or a pointer to the required capacity in the case that {@code pathsCapacityInput} is insufficient."),
        nullable..XrViveTrackerPathsHTCX.p("viveTrackerPaths", "a pointer to an array of ##XrViveTrackerPathsHTCX VIVE tracker paths, but <b>can</b> be {@code NULL} if {@code pathsCapacityInput} is 0.")
    )
}