/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRLocateSpaces {

    public static final int XR_KHR_locate_spaces_SPEC_VERSION = 1;

    public static final String XR_KHR_LOCATE_SPACES_EXTENSION_NAME = "XR_KHR_locate_spaces";

    public static final int
        XR_TYPE_SPACES_LOCATE_INFO_KHR = 1000471000,
        XR_TYPE_SPACE_LOCATIONS_KHR    = 1000471001,
        XR_TYPE_SPACE_VELOCITIES_KHR   = 1000471002;

    protected KHRLocateSpaces() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrLocateSpacesKHR ] ---

    /** {@code XrResult xrLocateSpacesKHR(XrSession session, XrSpacesLocateInfo const * locateInfo, XrSpaceLocations * spaceLocations)} */
    public static int nxrLocateSpacesKHR(XrSession session, long locateInfo, long spaceLocations) {
        long __functionAddress = session.getCapabilities().xrLocateSpacesKHR;
        if (CHECKS) {
            check(__functionAddress);
            XrSpacesLocateInfo.validate(locateInfo);
        }
        return callPPPI(session.address(), locateInfo, spaceLocations, __functionAddress);
    }

    /** {@code XrResult xrLocateSpacesKHR(XrSession session, XrSpacesLocateInfo const * locateInfo, XrSpaceLocations * spaceLocations)} */
    @NativeType("XrResult")
    public static int xrLocateSpacesKHR(XrSession session, @NativeType("XrSpacesLocateInfo const *") XrSpacesLocateInfo locateInfo, @NativeType("XrSpaceLocations *") XrSpaceLocations spaceLocations) {
        return nxrLocateSpacesKHR(session, locateInfo.address(), spaceLocations.address());
    }

}