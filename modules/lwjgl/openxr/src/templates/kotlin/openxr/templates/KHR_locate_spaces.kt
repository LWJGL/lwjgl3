/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_locate_spaces = "KHRLocateSpaces".nativeClassXR("KHR_locate_spaces", type = "instance", postfix = "KHR") {
    IntConstant(
        "KHR_locate_spaces_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_LOCATE_SPACES_EXTENSION_NAME".."XR_KHR_locate_spaces"
    )

    EnumConstant(
        "TYPE_SPACES_LOCATE_INFO_KHR".."1000471000",
        "TYPE_SPACE_LOCATIONS_KHR".."1000471001",
        "TYPE_SPACE_VELOCITIES_KHR".."1000471002"
    )

    XrResult(
        "LocateSpacesKHR",

        XrSession("session"),
        XrSpacesLocateInfo.const.p("locateInfo"),
        XrSpaceLocations.p("spaceLocations")
    )
}