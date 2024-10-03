/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val HTC_body_tracking = "HTCBodyTracking".nativeClassXR("HTC_body_tracking", type = "instance", postfix = "HTC") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#XR_HTC_body_tracking">XR_HTC_body_tracking</a> extension.

        This extension allows an application to locate the user’s individual body joints. It enables applications to render the full body in XR experience.
        """

    IntConstant(
        "The extension specification version.",

        "HTC_body_tracking_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "HTC_BODY_TRACKING_EXTENSION_NAME".."XR_HTC_body_tracking"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_BODY_TRACKER_HTC".."1000320000"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_HTC".."1000320000",
        "TYPE_BODY_TRACKER_CREATE_INFO_HTC".."1000320001",
        "TYPE_BODY_JOINTS_LOCATE_INFO_HTC".."1000320002",
        "TYPE_BODY_JOINT_LOCATIONS_HTC".."1000320003",
        "TYPE_BODY_SKELETON_HTC".."1000320004"
    )

    EnumConstant(
        """
        XrBodyJointHTC - Indices for body joint names

        <h5>Description</h5>
        It is used to index into a joint location array when the joint set in use ({@code XrBodyJointSetHTC}) is #BODY_JOINT_SET_FULL_HTC.

        This extension defines 26 joints for body tracking: 6 joints for the torso, 5 joints for each arm, 4 joints for each leg, and the other 2 joints for the head and neck. The definitions of these joints are based on human skeletal joints.

        As shown in the figure below, the following conventions are stated with a T-shape body pose in which the palms are facing down to the ground.

        The right direction (+X) is pointing from left hand to right hand in T-pose.

        The up direction (+Y) is pointing from foot to head in T-pose.

        The Z direction is perpendicular to X and Y and follows the right hand rule in T-pose.

        <h5>See Also</h5>
        #BODY_JOINT_COUNT_HTC
        """,

        "BODY_JOINT_PELVIS_HTC".."0",
        "BODY_JOINT_LEFT_HIP_HTC".."1",
        "BODY_JOINT_LEFT_KNEE_HTC".."2",
        "BODY_JOINT_LEFT_ANKLE_HTC".."3",
        "BODY_JOINT_LEFT_FEET_HTC".."4",
        "BODY_JOINT_RIGHT_HIP_HTC".."5",
        "BODY_JOINT_RIGHT_KNEE_HTC".."6",
        "BODY_JOINT_RIGHT_ANKLE_HTC".."7",
        "BODY_JOINT_RIGHT_FEET_HTC".."8",
        "BODY_JOINT_WAIST_HTC".."9",
        "BODY_JOINT_SPINE_LOWER_HTC".."10",
        "BODY_JOINT_SPINE_MIDDLE_HTC".."11",
        "BODY_JOINT_SPINE_HIGH_HTC".."12",
        "BODY_JOINT_CHEST_HTC".."13",
        "BODY_JOINT_NECK_HTC".."14",
        "BODY_JOINT_HEAD_HTC".."15",
        "BODY_JOINT_LEFT_CLAVICLE_HTC".."16",
        "BODY_JOINT_LEFT_SCAPULA_HTC".."17",
        "BODY_JOINT_LEFT_ARM_HTC".."18",
        "BODY_JOINT_LEFT_ELBOW_HTC".."19",
        "BODY_JOINT_LEFT_WRIST_HTC".."20",
        "BODY_JOINT_RIGHT_CLAVICLE_HTC".."21",
        "BODY_JOINT_RIGHT_SCAPULA_HTC".."22",
        "BODY_JOINT_RIGHT_ARM_HTC".."23",
        "BODY_JOINT_RIGHT_ELBOW_HTC".."24",
        "BODY_JOINT_RIGHT_WRIST_HTC".."25"
    )

    EnumConstant(
        """
        XrBodyJointSetHTC - The set of body joints to track.

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#BODY_JOINT_SET_FULL_HTC indicates that the created {@code XrBodyTrackerHTC} tracks the set of body joints described by {@code XrBodyJointHTC} enum, i.e. the #LocateBodyJointsHTC() function returns an array of joint locations with the count of #BODY_JOINT_COUNT_HTC and is indexed using {@code XrBodyJointHTC}.</li>
        </ul>

        The {@code XrBodyJointSetHTC} enumeration describes the set of body joints to track when creating an {@code XrBodyTrackerHTC}.

        <h5>See Also</h5>
        ##XrBodyTrackerCreateInfoHTC
        """,

        "BODY_JOINT_SET_FULL_HTC".."0"
    )

    EnumConstant(
        """
        XrBodyJointConfidenceHTC - The confidence level for the returned body joint pose.

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#BODY_JOINT_CONFIDENCE_NONE_HTC — No confidence for the returned body joint pose.</li>
            <li>#BODY_JOINT_CONFIDENCE_LOW_HTC — Low confience for the returned body joint pose. It indicates some of the body joints may not be tracked.</li>
            <li>#BODY_JOINT_CONFIDENCE_HIGH_HTC — High confidence for the returned body joint pose. It indicates almost all of the critical body joints are tracked.</li>
        </ul>

        The {@code XrBodyJointConfidenceHTC} enumeration describes the confidence level for the returned body joint pose.

        <h5>See Also</h5>
        ##XrBodyJointLocationsHTC
        """,

        "BODY_JOINT_CONFIDENCE_NONE_HTC".."0",
        "BODY_JOINT_CONFIDENCE_LOW_HTC".."1",
        "BODY_JOINT_CONFIDENCE_HIGH_HTC".."2"
    )

    XrResult(
        "CreateBodyTrackerHTC",
        """
        Create a body tracker handle.

        <h5>C Specification</h5>
        The #CreateBodyTrackerHTC() function is defined as

        <pre><code>
￿XrResult xrCreateBodyTrackerHTC(
￿    XrSession                                   session,
￿    const XrBodyTrackerCreateInfoHTC*           createInfo,
￿    XrBodyTrackerHTC*                           bodyTracker);</code></pre>

        <h5>Description</h5>
        An application <b>can</b> create an {@code XrBodyTrackerHTC} handle using #CreateBodyTrackerHTC().

        If the system does not support body tracking, the runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED from #CreateBodyTrackerHTC(). In this case, the runtime <b>must</b> return #FALSE for ##XrSystemBodyTrackingPropertiesHTC{@code ::supportsBodyTracking} in ##XrSystemBodyTrackingPropertiesHTC when the function #GetSystemProperties() is called, so that the application avoids creating a body tracker.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCBodyTracking XR_HTC_body_tracking} extension <b>must</b> be enabled prior to calling #CreateBodyTrackerHTC()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrBodyTrackerCreateInfoHTC structure</li>
            <li>{@code bodyTracker} <b>must</b> be a pointer to an {@code XrBodyTrackerHTC} handle</li>
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
        ##XrBodyTrackerCreateInfoHTC, #DestroyBodyTrackerHTC()
        """,

        XrSession("session", "an {@code XrSession} in which the body tracking will be active."),
        XrBodyTrackerCreateInfoHTC.const.p("createInfo", "the ##XrBodyTrackerCreateInfoHTC is used to specify the set of body joints."),
        Check(1)..XrBodyTrackerHTC.p("bodyTracker", "the returned {@code XrBodyTrackerHTC} handle.")
    )

    XrResult(
        "DestroyBodyTrackerHTC",
        """
        Destroy a body tracker handle.

        <h5>C Specification</h5>
        The #DestroyBodyTrackerHTC() function is defined as:

        <pre><code>
￿XrResult xrDestroyBodyTrackerHTC(
￿    XrBodyTrackerHTC                            bodyTracker);</code></pre>

        <h5>Description</h5>
        #DestroyBodyTrackerHTC() releases the {@code bodyTracker} and the underlying resources when finished with body tracking experiences.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCBodyTracking XR_HTC_body_tracking} extension <b>must</b> be enabled prior to calling #DestroyBodyTrackerHTC()</li>
            <li>{@code bodyTracker} <b>must</b> be a valid {@code XrBodyTrackerHTC} handle</li>
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

        <h5>See Also</h5>
        #CreateBodyTrackerHTC()
        """,

        XrBodyTrackerHTC("bodyTracker", "an {@code XrBodyTrackerHTC} previously created by #CreateBodyTrackerHTC().")
    )

    XrResult(
        "LocateBodyJointsHTC",
        """
        Locate the individual body joints.

        <h5>C Specification</h5>
        The #LocateBodyJointsHTC() function is defined as:

        <pre><code>
￿XrResult xrLocateBodyJointsHTC(
￿    XrBodyTrackerHTC                            bodyTracker,
￿    const XrBodyJointsLocateInfoHTC*            locateInfo,
￿    XrBodyJointLocationsHTC*                    locations);</code></pre>

        <h5>Description</h5>
        The #LocateBodyJointsHTC() function locates an array of body joints relative to a base space at a given time.

        If ##XrBodyJointLocationsHTC{@code ::jointLocationCount} does not match the value associated with the supplied {@code XrBodyJointSetHTC} value, the runtime <b>must</b> return #ERROR_VALIDATION_FAILURE.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCBodyTracking XR_HTC_body_tracking} extension <b>must</b> be enabled prior to calling #LocateBodyJointsHTC()</li>
            <li>{@code bodyTracker} <b>must</b> be a valid {@code XrBodyTrackerHTC} handle</li>
            <li>{@code locateInfo} <b>must</b> be a pointer to a valid ##XrBodyJointsLocateInfoHTC structure</li>
            <li>{@code locations} <b>must</b> be a pointer to an ##XrBodyJointLocationsHTC structure</li>
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
        ##XrBodyJointLocationsHTC, ##XrBodyJointsLocateInfoHTC
        """,

        XrBodyTrackerHTC("bodyTracker", "an {@code XrBodyTrackerHTC} previously created by #CreateBodyTrackerHTC()."),
        XrBodyJointsLocateInfoHTC.const.p("locateInfo", "a pointer to ##XrBodyJointsLocateInfoHTC describing information to locate body joints."),
        XrBodyJointLocationsHTC.p("locations", "a pointer to ##XrBodyJointLocationsHTC receiving the returned body joint locations.")
    )

    XrResult(
        "GetBodySkeletonHTC",
        """
        Retrieve body skeleton.

        <h5>C Specification</h5>
        The #GetBodySkeletonHTC() function is defined as:

        <pre><code>
￿XrResult xrGetBodySkeletonHTC(
￿    XrBodyTrackerHTC                            bodyTracker,
￿    XrSpace                                     baseSpace,
￿    uint32_t                                    skeletonGenerationId,
￿    XrBodySkeletonHTC*                          skeleton);</code></pre>

        <h5>Description</h5>
        The #GetBodySkeletonHTC() function returns the body skeleton in T-pose. This function <b>can</b> be used to get body skeleton and infer the skeleton scale and proportions in conjunction with ##XrBodyJointLocationsHTC{@code ::skeletonGenerationId}. ##XrBodyJointLocationsHTC{@code ::skeletonGenerationId} is generated when the tracking auto-calibrates the user skeleton scale and proportions.

        If the application supplies a {@code skeletonGenerationId} that does not match any value returned in ##XrBodyJointLocationsHTC{@code ::skeletonGenerationId} during the current session, the runtime <b>must</b> return #ERROR_VALIDATION_FAILURE.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCBodyTracking XR_HTC_body_tracking} extension <b>must</b> be enabled prior to calling #GetBodySkeletonHTC()</li>
            <li>{@code bodyTracker} <b>must</b> be a valid {@code XrBodyTrackerHTC} handle</li>
            <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code skeleton} <b>must</b> be a pointer to an ##XrBodySkeletonHTC structure</li>
            <li>Both of {@code baseSpace} and {@code bodyTracker} <b>must</b> have been created, allocated, or retrieved from the same {@code XrSession}</li>
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
        ##XrBodySkeletonHTC
        """,

        XrBodyTrackerHTC("bodyTracker", "an {@code XrBodyTrackerHTC} previously created by #CreateBodyTrackerHTC()."),
        XrSpace("baseSpace", "an {@code XrSpace} within which the returned body skeleton in T-pose will be represented."),
        uint32_t("skeletonGenerationId", "the skeleton id of the skeleton."),
        XrBodySkeletonHTC.p("skeleton", "a pointer to ##XrBodySkeletonHTC receiving the returned body skeleton.")
    )
}