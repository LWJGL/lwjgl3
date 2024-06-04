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
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#XR_KHR_locate_spaces">XR_KHR_locate_spaces</a> extension.
 * 
 * <p>This extension introduces the {@link #xrLocateSpacesKHR LocateSpacesKHR} function, which enables applications to locate an array of spaces in a single function call. Runtimes <b>may</b> provide performance benefits for applications that use many spaces.</p>
 * 
 * <p>Compared to the {@link XR10#xrLocateSpace LocateSpace} function, the new {@link #xrLocateSpacesKHR LocateSpacesKHR} function also provides extensible input parameters for future extensions to extend using additional chained structures.</p>
 */
public class KHRLocateSpaces {

    /** The extension specification version. */
    public static final int XR_KHR_locate_spaces_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_KHR_LOCATE_SPACES_EXTENSION_NAME = "XR_KHR_locate_spaces";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SPACES_LOCATE_INFO_KHR TYPE_SPACES_LOCATE_INFO_KHR}</li>
     * <li>{@link #XR_TYPE_SPACE_LOCATIONS_KHR TYPE_SPACE_LOCATIONS_KHR}</li>
     * <li>{@link #XR_TYPE_SPACE_VELOCITIES_KHR TYPE_SPACE_VELOCITIES_KHR}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SPACES_LOCATE_INFO_KHR = 1000471000,
        XR_TYPE_SPACE_LOCATIONS_KHR    = 1000471001,
        XR_TYPE_SPACE_VELOCITIES_KHR   = 1000471002;

    protected KHRLocateSpaces() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrLocateSpacesKHR ] ---

    /** Unsafe version of: {@link #xrLocateSpacesKHR LocateSpacesKHR} */
    public static int nxrLocateSpacesKHR(XrSession session, long locateInfo, long spaceLocations) {
        long __functionAddress = session.getCapabilities().xrLocateSpacesKHR;
        if (CHECKS) {
            check(__functionAddress);
            XrSpacesLocateInfo.validate(locateInfo);
        }
        return callPPPI(session.address(), locateInfo, spaceLocations, __functionAddress);
    }

    /**
     * See {@link XR11#xrLocateSpaces LocateSpaces}.
     *
     * @param session        an {@code XrSession} handle previously created with {@link XR10#xrCreateSession CreateSession}.
     * @param locateInfo     a pointer to an {@link XrSpacesLocateInfo} that provides the input information to locate spaces.
     * @param spaceLocations a pointer to an {@link XrSpaceLocations} for the runtime to return the locations of the specified spaces in the base space.
     */
    @NativeType("XrResult")
    public static int xrLocateSpacesKHR(XrSession session, @NativeType("XrSpacesLocateInfo const *") XrSpacesLocateInfo locateInfo, @NativeType("XrSpaceLocations *") XrSpaceLocations spaceLocations) {
        return nxrLocateSpacesKHR(session, locateInfo.address(), spaceLocations.address());
    }

}