/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_hand_tracking = "EXTHandTracking".nativeClassXR("EXT_hand_tracking", type = "instance", postfix = "EXT") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "EXT_hand_tracking_SPEC_VERSION".."4"
    )

    StringConstant(
        "The extension name.",

        "EXT_HAND_TRACKING_EXTENSION_NAME".."XR_EXT_hand_tracking"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_HAND_TRACKER_EXT".."1000051000"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SYSTEM_HAND_TRACKING_PROPERTIES_EXT".."1000051000",
        "TYPE_HAND_TRACKER_CREATE_INFO_EXT".."1000051001",
        "TYPE_HAND_JOINTS_LOCATE_INFO_EXT".."1000051002",
        "TYPE_HAND_JOINT_LOCATIONS_EXT".."1000051003",
        "TYPE_HAND_JOINT_VELOCITIES_EXT".."1000051004"
    )

    EnumConstant(
        """
        XrHandEXT - Describes which hand the tracker is tracking.

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#HAND_LEFT_EXT specifies the hand tracker will be tracking the user’s left hand.</li>
            <li>#HAND_RIGHT_EXT specifies the hand tracker will be tracking the user’s right hand.</li>
        </ul>

        <h5>See Also</h5>
        ##XrHandTrackerCreateInfoEXT
        """,

        "HAND_LEFT_EXT".."1",
        "HAND_RIGHT_EXT".."2"
    )

    EnumConstant(
        """
        XrHandJointEXT - The name of hand joints that can be tracked

        <h5>See Also</h5>
        ##XrHandCapsuleFB, ##XrHandTrackingMeshFB
        """,

        "HAND_JOINT_PALM_EXT".."0",
        "HAND_JOINT_WRIST_EXT".."1",
        "HAND_JOINT_THUMB_METACARPAL_EXT".."2",
        "HAND_JOINT_THUMB_PROXIMAL_EXT".."3",
        "HAND_JOINT_THUMB_DISTAL_EXT".."4",
        "HAND_JOINT_THUMB_TIP_EXT".."5",
        "HAND_JOINT_INDEX_METACARPAL_EXT".."6",
        "HAND_JOINT_INDEX_PROXIMAL_EXT".."7",
        "HAND_JOINT_INDEX_INTERMEDIATE_EXT".."8",
        "HAND_JOINT_INDEX_DISTAL_EXT".."9",
        "HAND_JOINT_INDEX_TIP_EXT".."10",
        "HAND_JOINT_MIDDLE_METACARPAL_EXT".."11",
        "HAND_JOINT_MIDDLE_PROXIMAL_EXT".."12",
        "HAND_JOINT_MIDDLE_INTERMEDIATE_EXT".."13",
        "HAND_JOINT_MIDDLE_DISTAL_EXT".."14",
        "HAND_JOINT_MIDDLE_TIP_EXT".."15",
        "HAND_JOINT_RING_METACARPAL_EXT".."16",
        "HAND_JOINT_RING_PROXIMAL_EXT".."17",
        "HAND_JOINT_RING_INTERMEDIATE_EXT".."18",
        "HAND_JOINT_RING_DISTAL_EXT".."19",
        "HAND_JOINT_RING_TIP_EXT".."20",
        "HAND_JOINT_LITTLE_METACARPAL_EXT".."21",
        "HAND_JOINT_LITTLE_PROXIMAL_EXT".."22",
        "HAND_JOINT_LITTLE_INTERMEDIATE_EXT".."23",
        "HAND_JOINT_LITTLE_DISTAL_EXT".."24",
        "HAND_JOINT_LITTLE_TIP_EXT".."25"
    )

    EnumConstant(
        """
        XrHandJointSetEXT - The set of hand joints to track.

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#HAND_JOINT_SET_DEFAULT_EXT indicates that the created {@code XrHandTrackerEXT} tracks the set of hand joints described by {@code XrHandJointEXT} enum, i.e. the #LocateHandJointsEXT() function returns an array of joint locations with the count of #HAND_JOINT_COUNT_EXT and can be indexed using {@code XrHandJointEXT}.</li>
        </ul>

        <h5>See Also</h5>
        ##XrHandTrackerCreateInfoEXT
        """,

        "HAND_JOINT_SET_DEFAULT_EXT".."0"
    )

    XrResult(
        "CreateHandTrackerEXT",
        """
        Create a hand joints handle.

        <h5>C Specification</h5>
        An application can create an {@code XrHandTrackerEXT} handle using #CreateHandTrackerEXT() function.

        <pre><code>
￿XrResult xrCreateHandTrackerEXT(
￿    XrSession                                   session,
￿    const XrHandTrackerCreateInfoEXT*           createInfo,
￿    XrHandTrackerEXT*                           handTracker);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTHandTracking XR_EXT_hand_tracking} extension <b>must</b> be enabled prior to calling #CreateHandTrackerEXT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrHandTrackerCreateInfoEXT structure</li>
            <li>{@code handTracker} <b>must</b> be a pointer to an {@code XrHandTrackerEXT} handle</li>
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

        If the system does not support hand tracking, runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED from #CreateHandTrackerEXT(). In this case, the runtime <b>must</b> return #FALSE for {@code supportsHandTracking} in ##XrSystemHandTrackingPropertiesEXT when the function #GetSystemProperties() is called, so that the application <b>can</b> avoid creating a hand tracker.

        <h5>See Also</h5>
        ##XrHandTrackerCreateInfoEXT
        """,

        XrSession("session", "an {@code XrSession} in which the hand tracker will be active."),
        XrHandTrackerCreateInfoEXT.const.p("createInfo", "the ##XrHandTrackerCreateInfoEXT used to specify the hand tracker."),
        Check(1)..XrHandTrackerEXT.p("handTracker", "the returned {@code XrHandTrackerEXT} handle.")
    )

    XrResult(
        "DestroyHandTrackerEXT",
        """
        Destroy a hand joints handle.

        <h5>C Specification</h5>
        #DestroyHandTrackerEXT() function releases the {@code handTracker} and the underlying resources when finished with hand tracking experiences.

        <pre><code>
￿XrResult xrDestroyHandTrackerEXT(
￿    XrHandTrackerEXT                            handTracker);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTHandTracking XR_EXT_hand_tracking} extension <b>must</b> be enabled prior to calling #DestroyHandTrackerEXT()</li>
            <li>{@code handTracker} <b>must</b> be a valid {@code XrHandTrackerEXT} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code handTracker}, and any child handles, <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_HANDLE_INVALID</li>
            </ul></dd>
        </dl>
        """,

        XrHandTrackerEXT("handTracker", "an {@code XrHandTrackerEXT} previously created by #CreateHandTrackerEXT().")
    )

    XrResult(
        "LocateHandJointsEXT",
        """
        Locate hand joint locations.

        <h5>C Specification</h5>
        The #LocateHandJointsEXT() function locates an array of hand joints to a base space at given time.

        <pre><code>
￿XrResult xrLocateHandJointsEXT(
￿    XrHandTrackerEXT                            handTracker,
￿    const XrHandJointsLocateInfoEXT*            locateInfo,
￿    XrHandJointLocationsEXT*                    locations);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTHandTracking XR_EXT_hand_tracking} extension <b>must</b> be enabled prior to calling #LocateHandJointsEXT()</li>
            <li>{@code handTracker} <b>must</b> be a valid {@code XrHandTrackerEXT} handle</li>
            <li>{@code locateInfo} <b>must</b> be a pointer to a valid ##XrHandJointsLocateInfoEXT structure</li>
            <li>{@code locations} <b>must</b> be a pointer to an ##XrHandJointLocationsEXT structure</li>
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
                <li>#ERROR_TIME_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrHandJointLocationsEXT, ##XrHandJointsLocateInfoEXT
        """,

        XrHandTrackerEXT("handTracker", "an {@code XrHandTrackerEXT} previously created by #CreateHandTrackerEXT()."),
        XrHandJointsLocateInfoEXT.const.p("locateInfo", "a pointer to ##XrHandJointsLocateInfoEXT describing information to locate hand joints."),
        XrHandJointLocationsEXT.p("locations", "a pointer to ##XrHandJointLocationsEXT receiving the returned hand joint locations.")
    )
}