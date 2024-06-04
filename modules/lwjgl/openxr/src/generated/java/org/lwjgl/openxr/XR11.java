/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

import static org.lwjgl.openxr.XR10.*;

/**
 * The core OpenXR 1.1 functionality.
 * 
 * <p>OpenXR version 1.1 <em>promoted</em> a number of key extensions into the core API:</p>
 * 
 * <ul>
 * <li>{@link KHRLocateSpaces KHR_locate_spaces}</li>
 * <li>{@link KHRMaintenance1 KHR_maintenance1}</li>
 * <li>{@link EXTHPMixedRealityController EXT_hp_mixed_reality_controller}</li>
 * <li>{@link EXTLocalFloor EXT_local_floor}</li>
 * <li>{@link EXTPalmPose EXT_palm_pose}</li>
 * <li>{@link EXTSamsungOdysseyController EXT_samsung_odyssey_controller}</li>
 * <li>{@link EXTUUIUD EXT_uuid}</li>
 * <li>{@link BDControllerInteraction BD_controller_interaction}</li>
 * <li>{@link HTCViveCosmosControllerInteraction HTC_vive_cosmos_controller_interaction}</li>
 * <li>{@link HTCViveFocus3ControllerInteraction HTC_vive_focus3_controller_interaction}</li>
 * <li>{@link MLMl2ControllerInteraction ML_ml2_controller_interaction}</li>
 * <li>{@link VARJOQuadViews VARJO_quad_views}</li>
 * </ul>
 */
public class XR11 {

    /**
     * Extends {@code XrResult}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_ERROR_EXTENSION_DEPENDENCY_NOT_ENABLED ERROR_EXTENSION_DEPENDENCY_NOT_ENABLED}</li>
     * <li>{@link #XR_ERROR_PERMISSION_INSUFFICIENT ERROR_PERMISSION_INSUFFICIENT}</li>
     * </ul>
     */
    public static final int
        XR_ERROR_EXTENSION_DEPENDENCY_NOT_ENABLED = -1000710001,
        XR_ERROR_PERMISSION_INSUFFICIENT          = -1000710000;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SPACES_LOCATE_INFO TYPE_SPACES_LOCATE_INFO}</li>
     * <li>{@link #XR_TYPE_SPACE_LOCATIONS TYPE_SPACE_LOCATIONS}</li>
     * <li>{@link #XR_TYPE_SPACE_VELOCITIES TYPE_SPACE_VELOCITIES}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SPACES_LOCATE_INFO = 1000471000,
        XR_TYPE_SPACE_LOCATIONS    = 1000471001,
        XR_TYPE_SPACE_VELOCITIES   = 1000471002;

    /** Extends {@code XrReferenceSpaceType}. */
    public static final int XR_REFERENCE_SPACE_TYPE_LOCAL_FLOOR = 1000426000;

    /** Extends {@code XrViewConfigurationType}. */
    public static final int XR_VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO_WITH_FOVEATED_INSET = 1000037000;

    /**
     * The version of the OpenXR 1.1 API.
     * 
     * <p>The "major" and "minor" components are always 1.1, while the "patch" component matches {@link XR10#XR_CURRENT_API_VERSION CURRENT_API_VERSION}.</p>
     */
    public static final long XR_API_VERSION_1_1 = XR_MAKE_VERSION(1, 1, XR_VERSION_PATCH(XR_CURRENT_API_VERSION));

    protected XR11() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrLocateSpaces ] ---

    /** Unsafe version of: {@link #xrLocateSpaces LocateSpaces} */
    public static int nxrLocateSpaces(XrSession session, long locateInfo, long spaceLocations) {
        long __functionAddress = session.getCapabilities().xrLocateSpaces;
        if (CHECKS) {
            check(__functionAddress);
            XrSpacesLocateInfo.validate(locateInfo);
        }
        return callPPPI(session.address(), locateInfo, spaceLocations, __functionAddress);
    }

    /**
     * Locate an array of spaces.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Applications <b>can</b> use {@link #xrLocateSpaces LocateSpaces} function to locate an array of spaces.</p>
     * 
     * <p>The {@link #xrLocateSpaces LocateSpaces} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrLocateSpaces(
     *     XrSession                                   session,
     *     const XrSpacesLocateInfo*                   locateInfo,
     *     XrSpaceLocations*                           spaceLocations);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrLocateSpaces LocateSpaces} provides the physical location of one or more spaces in a base space at a specified time, if currently known by the runtime.</p>
     * 
     * <p>The {@link XrSpacesLocateInfo}{@code ::time}, the {@link XrSpacesLocateInfo}{@code ::baseSpace}, and each space in {@link XrSpacesLocateInfo}{@code ::spaces}, in the {@code locateInfo} parameter, all follow the same specifics as the corresponding inputs to the {@link XR10#xrLocateSpace LocateSpace} function.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code locateInfo} <b>must</b> be a pointer to a valid {@link XrSpacesLocateInfo} structure</li>
     * <li>{@code spaceLocations} <b>must</b> be a pointer to an {@link XrSpaceLocations} structure</li>
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
     * <li>{@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * <li>{@link XR10#XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpaceLocations}, {@link XrSpacesLocateInfo}</p>
     *
     * @param session        an {@code XrSession} handle previously created with {@link XR10#xrCreateSession CreateSession}.
     * @param locateInfo     a pointer to an {@link XrSpacesLocateInfo} that provides the input information to locate spaces.
     * @param spaceLocations a pointer to an {@link XrSpaceLocations} for the runtime to return the locations of the specified spaces in the base space.
     */
    @NativeType("XrResult")
    public static int xrLocateSpaces(XrSession session, @NativeType("XrSpacesLocateInfo const *") XrSpacesLocateInfo locateInfo, @NativeType("XrSpaceLocations *") XrSpaceLocations spaceLocations) {
        return nxrLocateSpaces(session, locateInfo.address(), spaceLocations.address());
    }

}