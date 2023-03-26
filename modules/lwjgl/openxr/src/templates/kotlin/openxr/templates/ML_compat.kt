/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ML_compat = "MLCompat".nativeClassXR("ML_compat", type = "instance", postfix = "ML") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_ML_compat">XR_ML_compat</a> extension.

        This extension provides functionality to facilitate transitioning from Magic Leap SDK to OpenXR SDK, most notably interoperability between Coordinate Frame UUIDs and {@code XrSpace}.
        """

    IntConstant(
        "The extension specification version.",

        "ML_compat_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "ML_COMPAT_EXTENSION_NAME".."XR_ML_compat"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_COORDINATE_SPACE_CREATE_INFO_ML".."1000137000"
    )

    XrResult(
        "CreateSpaceFromCoordinateFrameUIDML",
        """
        Creates a space based on a cfuid.

        <h5>C Specification</h5>
        The #CreateSpaceFromCoordinateFrameUIDML() function is defined as:

        <pre><code>
￿XrResult xrCreateSpaceFromCoordinateFrameUIDML(
￿    XrSession                                   session,
￿    const XrCoordinateSpaceCreateInfoML *       createInfo,
￿    XrSpace*                                    space);</code></pre>

        <h5>Description</h5>
        The service that created the underlying ##XrCoordinateSpaceCreateInfoML{@code ::cfuid} <b>must</b> remain active for the lifetime of the {@code XrSpace}. If #LocateSpace() is called on a space created from a {@code cfuid} from a no-longer-active service, the runtime <b>may</b> set ##XrSpaceLocation{@code ::locationFlags} to 0.

        {@code XrSpace} handles are destroyed using #DestroySpace().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLCompat XR_ML_compat} extension <b>must</b> be enabled prior to calling #CreateSpaceFromCoordinateFrameUIDML()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrCoordinateSpaceCreateInfoML structure</li>
            <li>{@code space} <b>must</b> be a pointer to an {@code XrSpace} handle</li>
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
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_POSE_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrCoordinateSpaceCreateInfoML
        """,

        XrSession("session", "a handle to an {@code XrSession} previously created with #CreateSession()."),
        XrCoordinateSpaceCreateInfoML.const.p("createInfo", "the ##XrCoordinateSpaceCreateInfoML used to specify the space."),
        Check(1)..XrSpace.p("space", "the returned space handle.")
    )
}