/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val XR11 = "XR11".nativeClass(Module.OPENXR, "XR11", prefix = "XR", binding = XR_BINDING_INSTANCE) {
    EnumConstant(
        "ERROR_PERMISSION_INSUFFICIENT".."-1000710000",
        "ERROR_EXTENSION_DEPENDENCY_NOT_ENABLED".."-1000710001"
    )

    EnumConstant(
        "TYPE_SPACES_LOCATE_INFO".."1000471000",
        "TYPE_SPACE_LOCATIONS".."1000471001",
        "TYPE_SPACE_VELOCITIES".."1000471002"
    )

    EnumConstant(
        "REFERENCE_SPACE_TYPE_LOCAL_FLOOR".."1000426000"
    )

    EnumConstant(
        "VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO_WITH_FOVEATED_INSET".."1000037000"
    )

    // Promoted from XR_KHR_locate_spaces

    XrResult(
        "LocateSpaces",

        XrSession("session"),
        XrSpacesLocateInfo.const.p("locateInfo"),
        XrSpaceLocations.p("spaceLocations")
    )

}