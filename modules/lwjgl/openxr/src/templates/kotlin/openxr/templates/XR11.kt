/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val XR11 = "XR11".nativeClass(Module.OPENXR, "XR11", prefix = "XR", binding = XR_BINDING_INSTANCE) {
    documentation =
        """
        The core OpenXR 1.1 functionality.
        """

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_EXTENSION_DEPENDENCY_NOT_ENABLED".."-1000710001",
        "ERROR_PERMISSION_INSUFFICIENT".."-1000710000"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SPACES_LOCATE_INFO".."1000471000",
        "TYPE_SPACE_LOCATIONS".."1000471001",
        "TYPE_SPACE_VELOCITIES".."1000471002"
    )

    EnumConstant(
        "Extends {@code XrReferenceSpaceType}.",

        "REFERENCE_SPACE_TYPE_LOCAL_FLOOR".."1000426000"
    )

    EnumConstant(
        "Extends {@code XrViewConfigurationType}.",

        "VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO_WITH_FOVEATED_INSET".."1000037000"
    )

    // Promoted from XR_KHR_locate_spaces

    XrResult(
        "LocateSpaces",
        """
        Locate an array of spaces.

        <h5>C Specification</h5>
        Applications <b>can</b> use #LocateSpaces() function to locate an array of spaces.

        The #LocateSpaces() function is defined as:

        <pre><code>
￿XrResult xrLocateSpaces(
￿    XrSession                                   session,
￿    const XrSpacesLocateInfo*                   locateInfo,
￿    XrSpaceLocations*                           spaceLocations);</code></pre>

        <h5>Description</h5>
        #LocateSpaces() provides the physical location of one or more spaces in a base space at a specified time, if currently known by the runtime.

        The ##XrSpacesLocateInfo{@code ::time}, the ##XrSpacesLocateInfo{@code ::baseSpace}, and each space in ##XrSpacesLocateInfo{@code ::spaces}, in the {@code locateInfo} parameter, all follow the same specifics as the corresponding inputs to the #LocateSpace() function.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code locateInfo} <b>must</b> be a pointer to a valid ##XrSpacesLocateInfo structure</li>
            <li>{@code spaceLocations} <b>must</b> be a pointer to an ##XrSpaceLocations structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_SIZE_INSUFFICIENT</li>
                <li>#ERROR_TIME_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpaceLocations, ##XrSpacesLocateInfo
        """,

        XrSession("session", "an {@code XrSession} handle previously created with #CreateSession()."),
        XrSpacesLocateInfo.const.p("locateInfo", "a pointer to an ##XrSpacesLocateInfo that provides the input information to locate spaces."),
        XrSpaceLocations.p("spaceLocations", "a pointer to an ##XrSpaceLocations for the runtime to return the locations of the specified spaces in the base space.")
    )

}