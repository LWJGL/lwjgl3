/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_locate_spaces = "KHRLocateSpaces".nativeClassXR("KHR_locate_spaces", type = "instance", postfix = "KHR") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#XR_KHR_locate_spaces">XR_KHR_locate_spaces</a> extension.

        This extension introduces the #LocateSpacesKHR() function, which enables applications to locate an array of spaces in a single function call. Runtimes <b>may</b> provide performance benefits for applications that use many spaces.

        Compared to the #LocateSpace() function, the new #LocateSpacesKHR() function also provides extensible input parameters for future extensions to extend using additional chained structures.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_locate_spaces_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_LOCATE_SPACES_EXTENSION_NAME".."XR_KHR_locate_spaces"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SPACES_LOCATE_INFO_KHR".."1000471000",
        "TYPE_SPACE_LOCATIONS_KHR".."1000471001",
        "TYPE_SPACE_VELOCITIES_KHR".."1000471002"
    )

    XrResult(
        "LocateSpacesKHR",
        "See #LocateSpaces().",

        XrSession("session", "an {@code XrSession} handle previously created with #CreateSession()."),
        XrSpacesLocateInfo.const.p("locateInfo", "a pointer to an ##XrSpacesLocateInfo that provides the input information to locate spaces."),
        XrSpaceLocations.p("spaceLocations", "a pointer to an ##XrSpaceLocations for the runtime to return the locations of the specified spaces in the base space.")
    )
}