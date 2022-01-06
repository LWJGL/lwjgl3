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

/** The HTCX_vive_tracker_interaction extension. */
public class HTCXViveTrackerInteraction {

    /** The extension specification version. */
    public static final int XR_HTCX_vive_tracker_interaction_SPEC_VERSION = 1;

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
     * @param pathsCountOutput a pointer to the count of {@link XrViveTrackerPathsHTCX} {@code viveTrackerPaths} written, or a pointer to the required capacity in the case that {@code pathsCapacityInput} is 0.
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