/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val HTC_anchor = "HTCAnchor".nativeClassXR("HTC_anchor", type = "instance", postfix = "HTC") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_HTC_anchor">XR_HTC_anchor</a> extension.

        This extension allows an application to create a spatial anchor to track a point in the physical environment. The runtime adjusts the pose of the anchor over time to align it with the real world.
        """

    IntConstant(
        "The extension specification version.",

        "HTC_anchor_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "HTC_ANCHOR_EXTENSION_NAME".."XR_HTC_anchor"
    )

    EnumConstant(
        "XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_HTC",

        "MAX_SPATIAL_ANCHOR_NAME_SIZE_HTC".."256"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SYSTEM_ANCHOR_PROPERTIES_HTC".."1000319000",
        "TYPE_SPATIAL_ANCHOR_CREATE_INFO_HTC".."1000319001"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_NOT_AN_ANCHOR_HTC".."-1000319000"
    )

    XrResult(
        "CreateSpatialAnchorHTC",
        """
        Creates a spatial anchor.

        <h5>C Specification</h5>
        The #CreateSpatialAnchorHTC() function is defined as:

        <pre><code>
￿XrResult xrCreateSpatialAnchorHTC(
￿    XrSession                                   session,
￿    const XrSpatialAnchorCreateInfoHTC*         createInfo,
￿    XrSpace*                                    anchor);</code></pre>

        <h5>Description</h5>
        The #CreateSpatialAnchorHTC() function creates a spatial anchor with specified base space and pose in the space. The anchor is represented by an {@code XrSpace} and its pose can be tracked via #LocateSpace(). Once the anchor is no longer needed, call #DestroySpace() to erase the anchor.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCAnchor XR_HTC_anchor} extension <b>must</b> be enabled prior to calling #CreateSpatialAnchorHTC()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrSpatialAnchorCreateInfoHTC structure</li>
            <li>{@code anchor} <b>must</b> be a pointer to an {@code XrSpace} handle</li>
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
                <li>#ERROR_NAME_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpatialAnchorCreateInfoHTC
        """,

        XrSession("session", "the {@code XrSession} to create the anchor in."),
        XrSpatialAnchorCreateInfoHTC.const.p("createInfo", "the ##XrSpatialAnchorCreateInfoHTC used to specify the anchor."),
        Check(1)..XrSpace.p("anchor", "the returned {@code XrSpace} handle.")
    )

    XrResult(
        "GetSpatialAnchorNameHTC",
        """
        Get name of a spatial anchor.

        <h5>C Specification</h5>
        The #GetSpatialAnchorNameHTC() function is defined as:

        <pre><code>
￿XrResult xrGetSpatialAnchorNameHTC(
￿    XrSpace                                     anchor,
￿    XrSpatialAnchorNameHTC*                     name);</code></pre>

        <h5>Description</h5>
        The #GetSpatialAnchorNameHTC() function gets the name of an anchor. If the provided {@code space} is a valid space handle but was <b>not</b> created with #CreateSpatialAnchorHTC(), the runtime <b>must</b> return #ERROR_NOT_AN_ANCHOR_HTC.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCAnchor XR_HTC_anchor} extension <b>must</b> be enabled prior to calling #GetSpatialAnchorNameHTC()</li>
            <li>{@code anchor} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code name} <b>must</b> be a pointer to an ##XrSpatialAnchorNameHTC structure</li>
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
                <li>#ERROR_NOT_AN_ANCHOR_HTC</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpatialAnchorNameHTC
        """,

        XrSpace("anchor", "the {@code XrSpace} created by #CreateSpatialAnchorHTC()."),
        XrSpatialAnchorNameHTC.p("name", "a pointer to output ##XrSpatialAnchorNameHTC.")
    )
}