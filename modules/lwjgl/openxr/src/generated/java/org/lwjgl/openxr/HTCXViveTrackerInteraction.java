/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_HTCX_vive_tracker_interaction">XR_HTCX_vive_tracker_interaction</a> extension.
 * 
 * <p>This extension defines a new interaction profile for HTC VIVE Tracker. HTC VIVE Tracker is a generic tracked device which can be attached to anything to make them trackable. For example, it can be attached to user’s hands or feet to track the motion of human body. It can also be attached to any other devices the user wants to track and interact with.</p>
 * 
 * <p>In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into {@link XR10#xrCreateInstance CreateInstance} via the {@link XrInstanceCreateInfo} {@code enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#extensions">extensions</a> section.</p>
 * 
 * <p>This extension allows:</p>
 * 
 * <ul>
 * <li>An application to enumerate the subpaths of all current connected VIVE trackers.</li>
 * <li>An application to receive notification of the top level paths of a VIVE tracker when it is connected.</li>
 * </ul>
 * 
 * <p>The paths of a VIVE tracker contains two paths below:</p>
 * 
 * <ul>
 * <li>VIVE tracker persistent path indicate a specific tracker whose lifetime lasts longer than an instance, which means it <b>must</b> not change during its hardware lifetime. The format of this path string is unspecified and should be treated as an opaque string.</li>
 * <li>VIVE tracker role path <b>may</b> be constructed as "/user/vive_tracker_htcx/role/<em>ROLE_VALUE</em>", where <em>ROLE_VALUE</em> takes one of the following values. The role path <b>may</b> be assigned from the tool provided by the runtime and is {@link XR10#XR_NULL_PATH NULL_PATH} if it has not been assigned. If this role path refers to more than one tracker, the runtime <b>should</b> choose one of them to be currently active. The role path <b>may</b> be changed during the lifetime of instance. Whenever it is changed, the runtime <b>must</b> send event {@link #XR_TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX} to provide the new role path of that tracker.
 * 
 * <dl>
 * <dt>ROLE_VALUE</dt>
 * <dd><ul>
 * <li>{@code XR_NULL_PATH}</li>
 * <li>{@code handheld_object}</li>
 * <li>{@code left_foot}</li>
 * <li>{@code right_foot}</li>
 * <li>{@code left_shoulder}</li>
 * <li>{@code right_shoulder}</li>
 * <li>{@code left_elbow}</li>
 * <li>{@code right_elbow}</li>
 * <li>{@code left_knee}</li>
 * <li>{@code right_knee}</li>
 * <li>{@code left_wrist} (rev: 3)</li>
 * <li>{@code right_wrist} (rev: 3)</li>
 * <li>{@code left_ankle} (rev: 3)</li>
 * <li>{@code right_ankle} (rev: 3)</li>
 * <li>{@code waist}</li>
 * <li>{@code chest}</li>
 * <li>{@code camera}</li>
 * <li>{@code keyboard}</li>
 * </ul></dd>
 * </dl>
 * </li>
 * <li>Either the persistent path or the role path can be be passed as a subaction path to indicate a specific tracker. For example, {@link XrActionCreateInfo}{@code ::subactionPath} into function {@link XR10#xrCreateAction CreateAction} or {@link XrActionSpaceCreateInfo}{@code ::subactionPath} into function {@link XR10#xrCreateActionSpace CreateActionSpace}. Please see Example 1 below.</li>
 * </ul>
 * 
 * <p><a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#input-suggested-bindings">As with other controllers</a>, if a VIVE tracker is connected and bound to a top-level user path, or disconnected while bound to top-level user path, the runtime <b>must</b> send event {@link XR10#XR_TYPE_EVENT_DATA_INTERACTION_PROFILE_CHANGED TYPE_EVENT_DATA_INTERACTION_PROFILE_CHANGED}, and the application <b>may</b> call {@link XR10#xrGetCurrentInteractionProfile GetCurrentInteractionProfile} to check if the tracker is active or not.</p>
 * 
 * <p>The device that a tracker is attached to probably has a different motion model than what the tracker assumes. The motion tracking might not be as expected in this case.</p>
 */
public class HTCXViveTrackerInteraction {

    /** The extension specification version. */
    public static final int XR_HTCX_vive_tracker_interaction_SPEC_VERSION = 3;

    /** The extension name. */
    public static final String XR_HTCX_VIVE_TRACKER_INTERACTION_EXTENSION_NAME = "XR_HTCX_vive_tracker_interaction";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_VIVE_TRACKER_PATHS_HTCX TYPE_VIVE_TRACKER_PATHS_HTCX}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_VIVE_TRACKER_PATHS_HTCX                = 1000103000,
        XR_TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX = 1000103001;

    protected HTCXViveTrackerInteraction() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateViveTrackerPathsHTCX ] ---

    /**
     * Unsafe version of: {@link #xrEnumerateViveTrackerPathsHTCX EnumerateViveTrackerPathsHTCX}
     *
     * @param pathsCapacityInput the capacity of the {@code viveTrackerPaths}, or 0 to retrieve the required capacity.
     */
    public static int nxrEnumerateViveTrackerPathsHTCX(XrInstance instance, int pathsCapacityInput, long pathsCountOutput, long viveTrackerPaths) {
        long __functionAddress = instance.getCapabilities().xrEnumerateViveTrackerPathsHTCX;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(instance.address(), pathsCapacityInput, pathsCountOutput, viveTrackerPaths, __functionAddress);
    }

    /**
     * Enumerates all connected VIVE trackers.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrEnumerateViveTrackerPathsHTCX EnumerateViveTrackerPathsHTCX} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrEnumerateViveTrackerPathsHTCX(
     *     XrInstance                                  instance,
     *     uint32_t                                    pathsCapacityInput,
     *     uint32_t*                                   pathsCountOutput,
     *     XrViveTrackerPathsHTCX*                     viveTrackerPaths);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrEnumerateViveTrackerPathsHTCX EnumerateViveTrackerPathsHTCX} enumerates all connected VIVE trackers to retrieve their paths under current instance.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link HTCXViveTrackerInteraction XR_HTCX_vive_tracker_interaction} extension <b>must</b> be enabled prior to calling {@link #xrEnumerateViveTrackerPathsHTCX EnumerateViveTrackerPathsHTCX}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code pathsCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code pathsCapacityInput} is not 0, {@code viveTrackerPaths} <b>must</b> be a pointer to an array of {@code pathsCapacityInput} {@link XrViveTrackerPathsHTCX} structures</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrViveTrackerPathsHTCX}</p>
     *
     * @param instance         an instance previously created.
     * @param pathsCountOutput a pointer to the count of {@link XrViveTrackerPathsHTCX} {@code viveTrackerPaths} written, or a pointer to the required capacity in the case that {@code pathsCapacityInput} is insufficient.
     * @param viveTrackerPaths a pointer to an array of {@link XrViveTrackerPathsHTCX} VIVE tracker paths, but <b>can</b> be {@code NULL} if {@code pathsCapacityInput} is 0.
     */
    @NativeType("XrResult")
    public static int xrEnumerateViveTrackerPathsHTCX(XrInstance instance, @NativeType("uint32_t *") IntBuffer pathsCountOutput, @Nullable @NativeType("XrViveTrackerPathsHTCX *") XrViveTrackerPathsHTCX.Buffer viveTrackerPaths) {
        if (CHECKS) {
            check(pathsCountOutput, 1);
        }
        return nxrEnumerateViveTrackerPathsHTCX(instance, remainingSafe(viveTrackerPaths), memAddress(pathsCountOutput), memAddressSafe(viveTrackerPaths));
    }

}