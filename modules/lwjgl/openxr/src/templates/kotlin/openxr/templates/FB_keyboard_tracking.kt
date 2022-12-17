/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_keyboard_tracking = "FBKeyboardTracking".nativeClassXR("FB_keyboard_tracking", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_keyboard_tracking">XR_FB_keyboard_tracking</a> extension.

        This extension allows the application to query the system for a supported trackable keyboard type and obtain an {@code XrSpace} handle to track it. It also provides relevant metadata about the keyboard itself, including bounds and a human readable identifier.
        """

    IntConstant(
        "The extension specification version.",

        "FB_keyboard_tracking_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_KEYBOARD_TRACKING_EXTENSION_NAME".."XR_FB_keyboard_tracking"
    )

    EnumConstant(
        "XR_MAX_KEYBOARD_TRACKING_NAME_SIZE_FB",

        "MAX_KEYBOARD_TRACKING_NAME_SIZE_FB".."128"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_KEYBOARD_SPACE_CREATE_INFO_FB".."1000116009",
        "TYPE_KEYBOARD_TRACKING_QUERY_FB".."1000116004",
        "TYPE_SYSTEM_KEYBOARD_TRACKING_PROPERTIES_FB".."1000116002"
    )

    EnumConstant(
        """
        XrKeyboardTrackingFlagBitsFB - XrKeyboardTrackingFlagBitsFB

        <h5>Flag Descriptions</h5>
        <ul>
            <li>#KEYBOARD_TRACKING_EXISTS_BIT_FB — indicates that the system has a physically tracked keyboard to report.  If not set then no other bits should be considered to be valid or meaningful.  If set either XR_KEYBOARD_TRACKING_LOCAL_BIT_FB or XR_KEYBOARD_TRACKING_REMOTE_BIT_FB must also be set.</li>
            <li>#KEYBOARD_TRACKING_LOCAL_BIT_FB — indicates that the physically tracked keyboard is intended to be used in a local pairing with the system.  Mutally exclusive with XR_KEYBOARD_TRACKING_REMOTE_BIT_FB.</li>
            <li>#KEYBOARD_TRACKING_REMOTE_BIT_FB — indicates that the physically tracked keyboard is intended to be used while paired to a separate remote computing device. Mutally exclusive with XR_KEYBOARD_TRACKING_LOCAL_BIT_FB.</li>
            <li>#KEYBOARD_TRACKING_CONNECTED_BIT_FB — indicates that the physically tracked keyboard is actively connected to the headset and capable of sending key data</li>
        </ul>
        """,

        "KEYBOARD_TRACKING_EXISTS_BIT_FB".enum(0x00000001),
        "KEYBOARD_TRACKING_LOCAL_BIT_FB".enum(0x00000002),
        "KEYBOARD_TRACKING_REMOTE_BIT_FB".enum(0x00000004),
        "KEYBOARD_TRACKING_CONNECTED_BIT_FB".enum(0x00000008)
    )

    EnumConstant(
        """
        XrKeyboardTrackingQueryFlagBitsFB - XrKeyboardTrackingQueryFlagBitsFB

        <h5>Flag Descriptions</h5>
        <ul>
            <li>#KEYBOARD_TRACKING_QUERY_LOCAL_BIT_FB — indicates the query is for the physically tracked keyboard that is intended to be used in a local pairing with the System. Mutally exclusive with XR_KEYBOARD_TRACKING_QUERY_REMOTE_BIT_FB.</li>
            <li>#KEYBOARD_TRACKING_QUERY_REMOTE_BIT_FB — indicates the query is for the physically tracked keyboard that may be connected to a separate remote computing device. Mutally exclusive with XR_KEYBOARD_TRACKING_QUERY_LOCAL_BIT_FB.</li>
        </ul>
        """,

        "KEYBOARD_TRACKING_QUERY_LOCAL_BIT_FB".enum(0x00000002),
        "KEYBOARD_TRACKING_QUERY_REMOTE_BIT_FB".enum(0x00000004)
    )

    XrResult(
        "QuerySystemTrackedKeyboardFB",
        """
        Queries the system keyboard.

        <h5>C Specification</h5>
        The #QuerySystemTrackedKeyboardFB() function is defined as:

        <pre><code>
￿XrResult xrQuerySystemTrackedKeyboardFB(
￿    XrSession                                   session,
￿    const XrKeyboardTrackingQueryFB*            queryInfo,
￿    XrKeyboardTrackingDescriptionFB*            keyboard);</code></pre>

        <h5>Description</h5>
        The #QuerySystemTrackedKeyboardFB() function populates an ##XrKeyboardTrackingDescriptionFB structure with enough information to describe a keyboard that the system can locate.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBKeyboardTracking XR_FB_keyboard_tracking} extension <b>must</b> be enabled prior to calling #QuerySystemTrackedKeyboardFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code queryInfo} <b>must</b> be a pointer to a valid ##XrKeyboardTrackingQueryFB structure</li>
            <li>{@code keyboard} <b>must</b> be a pointer to an ##XrKeyboardTrackingDescriptionFB structure</li>
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
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrKeyboardTrackingDescriptionFB, ##XrKeyboardTrackingQueryFB
        """,

        XrSession("session", "the session that will be associated with a keyboard space."),
        XrKeyboardTrackingQueryFB.const.p("queryInfo", "the ##XrKeyboardTrackingQueryFB that describes the type of keyboard to return. queryInfo must have either #KEYBOARD_TRACKING_QUERY_LOCAL_BIT_FB or #KEYBOARD_TRACKING_QUERY_REMOTE_BIT_FB set."),
        XrKeyboardTrackingDescriptionFB.p("keyboard", "the ##XrKeyboardTrackingDescriptionFB output structure.")
    )

    XrResult(
        "CreateKeyboardSpaceFB",
        """
        Create a foveation profile.

        <h5>C Specification</h5>
        The #CreateKeyboardSpaceFB() function is defined as:

        <pre><code>
￿XrResult xrCreateKeyboardSpaceFB(
￿    XrSession                                   session,
￿    const XrKeyboardSpaceCreateInfoFB*          createInfo,
￿    XrSpace*                                    keyboardSpace);</code></pre>

        <h5>Description</h5>
        The #CreateKeyboardSpaceFB() function returns an {@code XrSpace} that can be used to locate a physical keyboard in space. The origin of the created {@code XrSpace} is located in the center of the bounding box in the x and z axes, and at the top of the y axis (meaning the keyboard is located entirely in negative y).

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBKeyboardTracking XR_FB_keyboard_tracking} extension <b>must</b> be enabled prior to calling #CreateKeyboardSpaceFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrKeyboardSpaceCreateInfoFB structure</li>
            <li>{@code keyboardSpace} <b>must</b> be a pointer to an {@code XrSpace} handle</li>
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
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrKeyboardSpaceCreateInfoFB
        """,

        XrSession("session", "the session that will be associated with the returned keyboard space."),
        XrKeyboardSpaceCreateInfoFB.const.p("createInfo", "the ##XrKeyboardSpaceCreateInfoFB that describes the type of keyboard to track."),
        Check(1)..XrSpace.p("keyboardSpace", "the {@code XrSpace} output structure.")
    )
}