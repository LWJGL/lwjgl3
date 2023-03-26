/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_body_tracking = "FBBodyTracking".nativeClassXR("FB_body_tracking", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_body_tracking">XR_FB_body_tracking</a> extension.

        This extension enables applications to locate the individual body joints that represent the estimated position of the user of the device. It enables applications to render the upper body in XR experiences.
        """

    IntConstant(
        "The extension specification version.",

        "FB_body_tracking_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_BODY_TRACKING_EXTENSION_NAME".."XR_FB_body_tracking"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_BODY_TRACKER_FB".."1000076000"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_BODY_TRACKER_CREATE_INFO_FB".."1000076001",
        "TYPE_BODY_JOINTS_LOCATE_INFO_FB".."1000076002",
        "TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_FB".."1000076004",
        "TYPE_BODY_JOINT_LOCATIONS_FB".."1000076005",
        "TYPE_BODY_SKELETON_FB".."1000076006"
    )

    EnumConstant(
        """
        XrBodyJointFB - The name of body joints that can be tracked

        <h5>Description</h5>
        The backward (+Z) direction is parallel to the corresponding bone and points away from the finger tip. The up (+Y) direction is pointing out of the back of and perpendicular to the corresponding finger nail at the fully opened hand pose. The X direction is perpendicular to Y and Z and follows the right hand rule.

        The wrist joint is located at the pivot point of the wrist, which is location invariant when twisting the hand without moving the forearm. The backward (+Z) direction is parallel to the line from wrist joint to middle finger metacarpal joint, and points away from the finger tips. The up (+Y) direction points out towards back of the hand and perpendicular to the skin at wrist. The X direction is perpendicular to the Y and Z directions and follows the right hand rule.

        The palm joint is located at the center of the middle finger’s metacarpal bone. The backward (+Z) direction is parallel to the middle finger’s metacarpal bone, and points away from the finger tips. The up (+Y) direction is perpendicular to palm surface and pointing towards the back of the hand. The X direction is perpendicular to the Y and Z directions and follows the right hand rule.

        Body skeleton has the full set of body joints (e.g. defined by {@code XrBodyJointFB}), organized in a hierarchy with a default T-shape body pose.

        The purpose of the skeleton is to provide data about the body size. Coordinates are relative to each other, so there is no any relation to any space.

        The calculation of the body size <b>may</b> be updated during a session. Each time the calculation of the size is changed, {@code skeletonChangedCount} of ##XrBodyJointLocationsFB is changed to indicate that a new skeleton <b>may</b> be retrieved.
        """,

        "BODY_JOINT_ROOT_FB".."0",
        "BODY_JOINT_HIPS_FB".."1",
        "BODY_JOINT_SPINE_LOWER_FB".."2",
        "BODY_JOINT_SPINE_MIDDLE_FB".."3",
        "BODY_JOINT_SPINE_UPPER_FB".."4",
        "BODY_JOINT_CHEST_FB".."5",
        "BODY_JOINT_NECK_FB".."6",
        "BODY_JOINT_HEAD_FB".."7",
        "BODY_JOINT_LEFT_SHOULDER_FB".."8",
        "BODY_JOINT_LEFT_SCAPULA_FB".."9",
        "BODY_JOINT_LEFT_ARM_UPPER_FB".."10",
        "BODY_JOINT_LEFT_ARM_LOWER_FB".."11",
        "BODY_JOINT_LEFT_HAND_WRIST_TWIST_FB".."12",
        "BODY_JOINT_RIGHT_SHOULDER_FB".."13",
        "BODY_JOINT_RIGHT_SCAPULA_FB".."14",
        "BODY_JOINT_RIGHT_ARM_UPPER_FB".."15",
        "BODY_JOINT_RIGHT_ARM_LOWER_FB".."16",
        "BODY_JOINT_RIGHT_HAND_WRIST_TWIST_FB".."17",
        "BODY_JOINT_LEFT_HAND_PALM_FB".."18",
        "BODY_JOINT_LEFT_HAND_WRIST_FB".."19",
        "BODY_JOINT_LEFT_HAND_THUMB_METACARPAL_FB".."20",
        "BODY_JOINT_LEFT_HAND_THUMB_PROXIMAL_FB".."21",
        "BODY_JOINT_LEFT_HAND_THUMB_DISTAL_FB".."22",
        "BODY_JOINT_LEFT_HAND_THUMB_TIP_FB".."23",
        "BODY_JOINT_LEFT_HAND_INDEX_METACARPAL_FB".."24",
        "BODY_JOINT_LEFT_HAND_INDEX_PROXIMAL_FB".."25",
        "BODY_JOINT_LEFT_HAND_INDEX_INTERMEDIATE_FB".."26",
        "BODY_JOINT_LEFT_HAND_INDEX_DISTAL_FB".."27",
        "BODY_JOINT_LEFT_HAND_INDEX_TIP_FB".."28",
        "BODY_JOINT_LEFT_HAND_MIDDLE_METACARPAL_FB".."29",
        "BODY_JOINT_LEFT_HAND_MIDDLE_PROXIMAL_FB".."30",
        "BODY_JOINT_LEFT_HAND_MIDDLE_INTERMEDIATE_FB".."31",
        "BODY_JOINT_LEFT_HAND_MIDDLE_DISTAL_FB".."32",
        "BODY_JOINT_LEFT_HAND_MIDDLE_TIP_FB".."33",
        "BODY_JOINT_LEFT_HAND_RING_METACARPAL_FB".."34",
        "BODY_JOINT_LEFT_HAND_RING_PROXIMAL_FB".."35",
        "BODY_JOINT_LEFT_HAND_RING_INTERMEDIATE_FB".."36",
        "BODY_JOINT_LEFT_HAND_RING_DISTAL_FB".."37",
        "BODY_JOINT_LEFT_HAND_RING_TIP_FB".."38",
        "BODY_JOINT_LEFT_HAND_LITTLE_METACARPAL_FB".."39",
        "BODY_JOINT_LEFT_HAND_LITTLE_PROXIMAL_FB".."40",
        "BODY_JOINT_LEFT_HAND_LITTLE_INTERMEDIATE_FB".."41",
        "BODY_JOINT_LEFT_HAND_LITTLE_DISTAL_FB".."42",
        "BODY_JOINT_LEFT_HAND_LITTLE_TIP_FB".."43",
        "BODY_JOINT_RIGHT_HAND_PALM_FB".."44",
        "BODY_JOINT_RIGHT_HAND_WRIST_FB".."45",
        "BODY_JOINT_RIGHT_HAND_THUMB_METACARPAL_FB".."46",
        "BODY_JOINT_RIGHT_HAND_THUMB_PROXIMAL_FB".."47",
        "BODY_JOINT_RIGHT_HAND_THUMB_DISTAL_FB".."48",
        "BODY_JOINT_RIGHT_HAND_THUMB_TIP_FB".."49",
        "BODY_JOINT_RIGHT_HAND_INDEX_METACARPAL_FB".."50",
        "BODY_JOINT_RIGHT_HAND_INDEX_PROXIMAL_FB".."51",
        "BODY_JOINT_RIGHT_HAND_INDEX_INTERMEDIATE_FB".."52",
        "BODY_JOINT_RIGHT_HAND_INDEX_DISTAL_FB".."53",
        "BODY_JOINT_RIGHT_HAND_INDEX_TIP_FB".."54",
        "BODY_JOINT_RIGHT_HAND_MIDDLE_METACARPAL_FB".."55",
        "BODY_JOINT_RIGHT_HAND_MIDDLE_PROXIMAL_FB".."56",
        "BODY_JOINT_RIGHT_HAND_MIDDLE_INTERMEDIATE_FB".."57",
        "BODY_JOINT_RIGHT_HAND_MIDDLE_DISTAL_FB".."58",
        "BODY_JOINT_RIGHT_HAND_MIDDLE_TIP_FB".."59",
        "BODY_JOINT_RIGHT_HAND_RING_METACARPAL_FB".."60",
        "BODY_JOINT_RIGHT_HAND_RING_PROXIMAL_FB".."61",
        "BODY_JOINT_RIGHT_HAND_RING_INTERMEDIATE_FB".."62",
        "BODY_JOINT_RIGHT_HAND_RING_DISTAL_FB".."63",
        "BODY_JOINT_RIGHT_HAND_RING_TIP_FB".."64",
        "BODY_JOINT_RIGHT_HAND_LITTLE_METACARPAL_FB".."65",
        "BODY_JOINT_RIGHT_HAND_LITTLE_PROXIMAL_FB".."66",
        "BODY_JOINT_RIGHT_HAND_LITTLE_INTERMEDIATE_FB".."67",
        "BODY_JOINT_RIGHT_HAND_LITTLE_DISTAL_FB".."68",
        "BODY_JOINT_RIGHT_HAND_LITTLE_TIP_FB".."69",
        "BODY_JOINT_COUNT_FB".."70",
        "BODY_JOINT_NONE_FB".."-1"
    )

    EnumConstant(
        """
        XrBodyJointSetFB - The set of body joints to track.

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#BODY_JOINT_SET_DEFAULT_FB — Indicates that the created {@code XrBodyTrackerFB} tracks the set of body joints described by {@code XrBodyJointFB} enum, i.e. the #LocateBodyJointsFB() function returns an array of joint locations with the count of #BODY_JOINT_COUNT_FB and can be indexed using {@code XrBodyJointFB}.</li>
        </ul>

        <h5>See Also</h5>
        ##XrBodyTrackerCreateInfoFB
        """,

        "BODY_JOINT_SET_DEFAULT_FB".."0"
    )

    XrResult(
        "CreateBodyTrackerFB",
        """
        Create a body joints handle.

        <h5>C Specification</h5>
        An application <b>can</b> create an {@code XrBodyTrackerFB} handle using #CreateBodyTrackerFB() function.

        <pre><code>
￿XrResult xrCreateBodyTrackerFB(
￿    XrSession                                   session,
￿    const XrBodyTrackerCreateInfoFB*            createInfo,
￿    XrBodyTrackerFB*                            bodyTracker);</code></pre>

        <h5>Description</h5>
        If the system does not support body tracking, the runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED from #CreateBodyTrackerFB(). In this case, the runtime <b>must</b> return #FALSE for {@code supportsBodyTracking} in ##XrSystemBodyTrackingPropertiesFB when the function #GetSystemProperties() is called, so that the application <b>can</b> avoid creating a body tracker.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBBodyTracking XR_FB_body_tracking} extension <b>must</b> be enabled prior to calling #CreateBodyTrackerFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrBodyTrackerCreateInfoFB structure</li>
            <li>{@code bodyTracker} <b>must</b> be a pointer to an {@code XrBodyTrackerFB} handle</li>
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
        ##XrBodyTrackerCreateInfoFB
        """,

        XrSession("session", "an {@code XrSession} in which the body tracker will be active."),
        XrBodyTrackerCreateInfoFB.const.p("createInfo", "the ##XrBodyTrackerCreateInfoFB used to specify the body tracker."),
        Check(1)..XrBodyTrackerFB.p("bodyTracker", "the returned {@code XrBodyTrackerFB} handle.")
    )

    XrResult(
        "DestroyBodyTrackerFB",
        """
        Destroy a body joints handle.

        <h5>C Specification</h5>
        #DestroyBodyTrackerFB() function releases the {@code bodyTracker} and the underlying resources when the body tracking experience is over.

        <pre><code>
￿XrResult xrDestroyBodyTrackerFB(
￿    XrBodyTrackerFB                             bodyTracker);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBBodyTracking XR_FB_body_tracking} extension <b>must</b> be enabled prior to calling #DestroyBodyTrackerFB()</li>
            <li>{@code bodyTracker} <b>must</b> be a valid {@code XrBodyTrackerFB} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code bodyTracker}, and any child handles, <b>must</b> be externally synchronized</li>
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

        XrBodyTrackerFB("bodyTracker", "an {@code XrBodyTrackerFB} previously created by #CreateBodyTrackerFB().")
    )

    XrResult(
        "LocateBodyJointsFB",
        """
        Locate body joint locations.

        <h5>C Specification</h5>
        The #LocateBodyJointsFB() function locates an array of body joints to a base space at a given time.

        <pre><code>
￿XrResult xrLocateBodyJointsFB(
￿    XrBodyTrackerFB                             bodyTracker,
￿    const XrBodyJointsLocateInfoFB*             locateInfo,
￿    XrBodyJointLocationsFB*                     locations);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBBodyTracking XR_FB_body_tracking} extension <b>must</b> be enabled prior to calling #LocateBodyJointsFB()</li>
            <li>{@code bodyTracker} <b>must</b> be a valid {@code XrBodyTrackerFB} handle</li>
            <li>{@code locateInfo} <b>must</b> be a pointer to a valid ##XrBodyJointsLocateInfoFB structure</li>
            <li>{@code locations} <b>must</b> be a pointer to an ##XrBodyJointLocationsFB structure</li>
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
        ##XrBodyJointLocationsFB, ##XrBodyJointsLocateInfoFB
        """,

        XrBodyTrackerFB("bodyTracker", "an {@code XrBodyTrackerFB} previously created by #CreateBodyTrackerFB()."),
        XrBodyJointsLocateInfoFB.const.p("locateInfo", "a pointer to ##XrBodyJointsLocateInfoFB describing information to locate body joints."),
        XrBodyJointLocationsFB.p("locations", "a pointer to ##XrBodyJointLocationsFB receiving the returned body joint locations.")
    )

    XrResult(
        "GetBodySkeletonFB",
        """
        Retrieve body skeleton.

        <h5>C Specification</h5>
        The #GetBodySkeletonFB() function returns the body skeleton in T-pose.

        <pre><code>
￿XrResult xrGetBodySkeletonFB(
￿    XrBodyTrackerFB                             bodyTracker,
￿    XrBodySkeletonFB*                           skeleton);</code></pre>

        <h5>Description</h5>
        This function <b>can</b> be used to query the skeleton scale and proportions in conjunction with ##XrBodyJointLocationsFB{@code ::skeletonChangedCount}. ##XrBodyJointLocationsFB{@code ::skeletonChangedCount} is incremented whenever the tracking auto-calibrates the user skeleton scale and proportions.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBBodyTracking XR_FB_body_tracking} extension <b>must</b> be enabled prior to calling #GetBodySkeletonFB()</li>
            <li>{@code bodyTracker} <b>must</b> be a valid {@code XrBodyTrackerFB} handle</li>
            <li>{@code skeleton} <b>must</b> be a pointer to an ##XrBodySkeletonFB structure</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrBodySkeletonFB
        """,

        XrBodyTrackerFB("bodyTracker", "an {@code XrBodyTrackerFB} previously created by #CreateBodyTrackerFB()."),
        XrBodySkeletonFB.p("skeleton", "a pointer to ##XrBodySkeletonFB receiving the returned body skeleton hierarchy.")
    )
}