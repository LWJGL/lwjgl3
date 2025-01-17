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

public class XR11 {

    public static final int
        XR_ERROR_PERMISSION_INSUFFICIENT          = -1000710000,
        XR_ERROR_EXTENSION_DEPENDENCY_NOT_ENABLED = -1000710001;

    public static final int
        XR_TYPE_SPACES_LOCATE_INFO = 1000471000,
        XR_TYPE_SPACE_LOCATIONS    = 1000471001,
        XR_TYPE_SPACE_VELOCITIES   = 1000471002;

    public static final int XR_REFERENCE_SPACE_TYPE_LOCAL_FLOOR = 1000426000;

    public static final int XR_VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO_WITH_FOVEATED_INSET = 1000037000;

    public static final long XR_API_VERSION_1_1 = XR_MAKE_VERSION(1, 1, XR_VERSION_PATCH(XR_CURRENT_API_VERSION));

    public static final int XR_UUID_SIZE = 16;

    protected XR11() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrLocateSpaces ] ---

    /** {@code XrResult xrLocateSpaces(XrSession session, XrSpacesLocateInfo const * locateInfo, XrSpaceLocations * spaceLocations)} */
    public static int nxrLocateSpaces(XrSession session, long locateInfo, long spaceLocations) {
        long __functionAddress = session.getCapabilities().xrLocateSpaces;
        if (CHECKS) {
            check(__functionAddress);
            XrSpacesLocateInfo.validate(locateInfo);
        }
        return callPPPI(session.address(), locateInfo, spaceLocations, __functionAddress);
    }

    /** {@code XrResult xrLocateSpaces(XrSession session, XrSpacesLocateInfo const * locateInfo, XrSpaceLocations * spaceLocations)} */
    @NativeType("XrResult")
    public static int xrLocateSpaces(XrSession session, @NativeType("XrSpacesLocateInfo const *") XrSpacesLocateInfo locateInfo, @NativeType("XrSpaceLocations *") XrSpaceLocations spaceLocations) {
        return nxrLocateSpaces(session, locateInfo.address(), spaceLocations.address());
    }

}