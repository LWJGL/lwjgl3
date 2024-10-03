/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#XR_HTC_body_tracking">XR_HTC_body_tracking</a> extension.
 * 
 * <p>This extension allows an application to locate the user’s individual body joints. It enables applications to render the full body in XR experience.</p>
 */
public class HTCBodyTracking {

    /** The extension specification version. */
    public static final int XR_HTC_body_tracking_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_HTC_BODY_TRACKING_EXTENSION_NAME = "XR_HTC_body_tracking";

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_BODY_TRACKER_HTC = 1000320000;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_HTC TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_HTC}</li>
     * <li>{@link #XR_TYPE_BODY_TRACKER_CREATE_INFO_HTC TYPE_BODY_TRACKER_CREATE_INFO_HTC}</li>
     * <li>{@link #XR_TYPE_BODY_JOINTS_LOCATE_INFO_HTC TYPE_BODY_JOINTS_LOCATE_INFO_HTC}</li>
     * <li>{@link #XR_TYPE_BODY_JOINT_LOCATIONS_HTC TYPE_BODY_JOINT_LOCATIONS_HTC}</li>
     * <li>{@link #XR_TYPE_BODY_SKELETON_HTC TYPE_BODY_SKELETON_HTC}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_HTC = 1000320000,
        XR_TYPE_BODY_TRACKER_CREATE_INFO_HTC        = 1000320001,
        XR_TYPE_BODY_JOINTS_LOCATE_INFO_HTC         = 1000320002,
        XR_TYPE_BODY_JOINT_LOCATIONS_HTC            = 1000320003,
        XR_TYPE_BODY_SKELETON_HTC                   = 1000320004;

    /**
     * XrBodyJointHTC - Indices for body joint names
     * 
     * <h5>Description</h5>
     * 
     * <p>It is used to index into a joint location array when the joint set in use ({@code XrBodyJointSetHTC}) is {@link #XR_BODY_JOINT_SET_FULL_HTC BODY_JOINT_SET_FULL_HTC}.</p>
     * 
     * <p>This extension defines 26 joints for body tracking: 6 joints for the torso, 5 joints for each arm, 4 joints for each leg, and the other 2 joints for the head and neck. The definitions of these joints are based on human skeletal joints.</p>
     * 
     * <p>As shown in the figure below, the following conventions are stated with a T-shape body pose in which the palms are facing down to the ground.</p>
     * 
     * <p>The right direction (+X) is pointing from left hand to right hand in T-pose.</p>
     * 
     * <p>The up direction (+Y) is pointing from foot to head in T-pose.</p>
     * 
     * <p>The Z direction is perpendicular to X and Y and follows the right hand rule in T-pose.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #XR_BODY_JOINT_COUNT_HTC BODY_JOINT_COUNT_HTC}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_BODY_JOINT_PELVIS_HTC BODY_JOINT_PELVIS_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HIP_HTC BODY_JOINT_LEFT_HIP_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_KNEE_HTC BODY_JOINT_LEFT_KNEE_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_ANKLE_HTC BODY_JOINT_LEFT_ANKLE_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_FEET_HTC BODY_JOINT_LEFT_FEET_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HIP_HTC BODY_JOINT_RIGHT_HIP_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_KNEE_HTC BODY_JOINT_RIGHT_KNEE_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_ANKLE_HTC BODY_JOINT_RIGHT_ANKLE_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_FEET_HTC BODY_JOINT_RIGHT_FEET_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_WAIST_HTC BODY_JOINT_WAIST_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_SPINE_LOWER_HTC BODY_JOINT_SPINE_LOWER_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_SPINE_MIDDLE_HTC BODY_JOINT_SPINE_MIDDLE_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_SPINE_HIGH_HTC BODY_JOINT_SPINE_HIGH_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_CHEST_HTC BODY_JOINT_CHEST_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_NECK_HTC BODY_JOINT_NECK_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_HEAD_HTC BODY_JOINT_HEAD_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_CLAVICLE_HTC BODY_JOINT_LEFT_CLAVICLE_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_SCAPULA_HTC BODY_JOINT_LEFT_SCAPULA_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_ARM_HTC BODY_JOINT_LEFT_ARM_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_ELBOW_HTC BODY_JOINT_LEFT_ELBOW_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_WRIST_HTC BODY_JOINT_LEFT_WRIST_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_CLAVICLE_HTC BODY_JOINT_RIGHT_CLAVICLE_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_SCAPULA_HTC BODY_JOINT_RIGHT_SCAPULA_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_ARM_HTC BODY_JOINT_RIGHT_ARM_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_ELBOW_HTC BODY_JOINT_RIGHT_ELBOW_HTC}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_WRIST_HTC BODY_JOINT_RIGHT_WRIST_HTC}</li>
     * </ul>
     */
    public static final int
        XR_BODY_JOINT_PELVIS_HTC         = 0,
        XR_BODY_JOINT_LEFT_HIP_HTC       = 1,
        XR_BODY_JOINT_LEFT_KNEE_HTC      = 2,
        XR_BODY_JOINT_LEFT_ANKLE_HTC     = 3,
        XR_BODY_JOINT_LEFT_FEET_HTC      = 4,
        XR_BODY_JOINT_RIGHT_HIP_HTC      = 5,
        XR_BODY_JOINT_RIGHT_KNEE_HTC     = 6,
        XR_BODY_JOINT_RIGHT_ANKLE_HTC    = 7,
        XR_BODY_JOINT_RIGHT_FEET_HTC     = 8,
        XR_BODY_JOINT_WAIST_HTC          = 9,
        XR_BODY_JOINT_SPINE_LOWER_HTC    = 10,
        XR_BODY_JOINT_SPINE_MIDDLE_HTC   = 11,
        XR_BODY_JOINT_SPINE_HIGH_HTC     = 12,
        XR_BODY_JOINT_CHEST_HTC          = 13,
        XR_BODY_JOINT_NECK_HTC           = 14,
        XR_BODY_JOINT_HEAD_HTC           = 15,
        XR_BODY_JOINT_LEFT_CLAVICLE_HTC  = 16,
        XR_BODY_JOINT_LEFT_SCAPULA_HTC   = 17,
        XR_BODY_JOINT_LEFT_ARM_HTC       = 18,
        XR_BODY_JOINT_LEFT_ELBOW_HTC     = 19,
        XR_BODY_JOINT_LEFT_WRIST_HTC     = 20,
        XR_BODY_JOINT_RIGHT_CLAVICLE_HTC = 21,
        XR_BODY_JOINT_RIGHT_SCAPULA_HTC  = 22,
        XR_BODY_JOINT_RIGHT_ARM_HTC      = 23,
        XR_BODY_JOINT_RIGHT_ELBOW_HTC    = 24,
        XR_BODY_JOINT_RIGHT_WRIST_HTC    = 25;

    /**
     * XrBodyJointSetHTC - The set of body joints to track.
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_BODY_JOINT_SET_FULL_HTC BODY_JOINT_SET_FULL_HTC} indicates that the created {@code XrBodyTrackerHTC} tracks the set of body joints described by {@code XrBodyJointHTC} enum, i.e. the {@link #xrLocateBodyJointsHTC LocateBodyJointsHTC} function returns an array of joint locations with the count of {@link #XR_BODY_JOINT_COUNT_HTC BODY_JOINT_COUNT_HTC} and is indexed using {@code XrBodyJointHTC}.</li>
     * </ul>
     * 
     * <p>The {@code XrBodyJointSetHTC} enumeration describes the set of body joints to track when creating an {@code XrBodyTrackerHTC}.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrBodyTrackerCreateInfoHTC}</p>
     */
    public static final int XR_BODY_JOINT_SET_FULL_HTC = 0;

    /**
     * XrBodyJointConfidenceHTC - The confidence level for the returned body joint pose.
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_BODY_JOINT_CONFIDENCE_NONE_HTC BODY_JOINT_CONFIDENCE_NONE_HTC} — No confidence for the returned body joint pose.</li>
     * <li>{@link #XR_BODY_JOINT_CONFIDENCE_LOW_HTC BODY_JOINT_CONFIDENCE_LOW_HTC} — Low confience for the returned body joint pose. It indicates some of the body joints may not be tracked.</li>
     * <li>{@link #XR_BODY_JOINT_CONFIDENCE_HIGH_HTC BODY_JOINT_CONFIDENCE_HIGH_HTC} — High confidence for the returned body joint pose. It indicates almost all of the critical body joints are tracked.</li>
     * </ul>
     * 
     * <p>The {@code XrBodyJointConfidenceHTC} enumeration describes the confidence level for the returned body joint pose.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrBodyJointLocationsHTC}</p>
     */
    public static final int
        XR_BODY_JOINT_CONFIDENCE_NONE_HTC = 0,
        XR_BODY_JOINT_CONFIDENCE_LOW_HTC  = 1,
        XR_BODY_JOINT_CONFIDENCE_HIGH_HTC = 2;

    /** API Constants */
    public static final int XR_BODY_JOINT_COUNT_HTC = 0x1A;

    protected HTCBodyTracking() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateBodyTrackerHTC ] ---

    /** Unsafe version of: {@link #xrCreateBodyTrackerHTC CreateBodyTrackerHTC} */
    public static int nxrCreateBodyTrackerHTC(XrSession session, long createInfo, long bodyTracker) {
        long __functionAddress = session.getCapabilities().xrCreateBodyTrackerHTC;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, bodyTracker, __functionAddress);
    }

    /**
     * Create a body tracker handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateBodyTrackerHTC CreateBodyTrackerHTC} function is defined as</p>
     * 
     * <pre><code>
     * XrResult xrCreateBodyTrackerHTC(
     *     XrSession                                   session,
     *     const XrBodyTrackerCreateInfoHTC*           createInfo,
     *     XrBodyTrackerHTC*                           bodyTracker);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>An application <b>can</b> create an {@code XrBodyTrackerHTC} handle using {@link #xrCreateBodyTrackerHTC CreateBodyTrackerHTC}.</p>
     * 
     * <p>If the system does not support body tracking, the runtime <b>must</b> return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} from {@link #xrCreateBodyTrackerHTC CreateBodyTrackerHTC}. In this case, the runtime <b>must</b> return {@link XR10#XR_FALSE FALSE} for {@link XrSystemBodyTrackingPropertiesHTC}{@code ::supportsBodyTracking} in {@link XrSystemBodyTrackingPropertiesHTC} when the function {@link XR10#xrGetSystemProperties GetSystemProperties} is called, so that the application avoids creating a body tracker.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link HTCBodyTracking XR_HTC_body_tracking} extension <b>must</b> be enabled prior to calling {@link #xrCreateBodyTrackerHTC CreateBodyTrackerHTC}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrBodyTrackerCreateInfoHTC} structure</li>
     * <li>{@code bodyTracker} <b>must</b> be a pointer to an {@code XrBodyTrackerHTC} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrBodyTrackerCreateInfoHTC}, {@link #xrDestroyBodyTrackerHTC DestroyBodyTrackerHTC}</p>
     *
     * @param session     an {@code XrSession} in which the body tracking will be active.
     * @param createInfo  the {@link XrBodyTrackerCreateInfoHTC} is used to specify the set of body joints.
     * @param bodyTracker the returned {@code XrBodyTrackerHTC} handle.
     */
    @NativeType("XrResult")
    public static int xrCreateBodyTrackerHTC(XrSession session, @NativeType("XrBodyTrackerCreateInfoHTC const *") XrBodyTrackerCreateInfoHTC createInfo, @NativeType("XrBodyTrackerHTC *") PointerBuffer bodyTracker) {
        if (CHECKS) {
            check(bodyTracker, 1);
        }
        return nxrCreateBodyTrackerHTC(session, createInfo.address(), memAddress(bodyTracker));
    }

    // --- [ xrDestroyBodyTrackerHTC ] ---

    /**
     * Destroy a body tracker handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroyBodyTrackerHTC DestroyBodyTrackerHTC} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDestroyBodyTrackerHTC(
     *     XrBodyTrackerHTC                            bodyTracker);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrDestroyBodyTrackerHTC DestroyBodyTrackerHTC} releases the {@code bodyTracker} and the underlying resources when finished with body tracking experiences.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link HTCBodyTracking XR_HTC_body_tracking} extension <b>must</b> be enabled prior to calling {@link #xrDestroyBodyTrackerHTC DestroyBodyTrackerHTC}</li>
     * <li>{@code bodyTracker} <b>must</b> be a valid {@code XrBodyTrackerHTC} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code bodyTracker}, and any child handles, <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrCreateBodyTrackerHTC CreateBodyTrackerHTC}</p>
     *
     * @param bodyTracker an {@code XrBodyTrackerHTC} previously created by {@link #xrCreateBodyTrackerHTC CreateBodyTrackerHTC}.
     */
    @NativeType("XrResult")
    public static int xrDestroyBodyTrackerHTC(XrBodyTrackerHTC bodyTracker) {
        long __functionAddress = bodyTracker.getCapabilities().xrDestroyBodyTrackerHTC;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(bodyTracker.address(), __functionAddress);
    }

    // --- [ xrLocateBodyJointsHTC ] ---

    /** Unsafe version of: {@link #xrLocateBodyJointsHTC LocateBodyJointsHTC} */
    public static int nxrLocateBodyJointsHTC(XrBodyTrackerHTC bodyTracker, long locateInfo, long locations) {
        long __functionAddress = bodyTracker.getCapabilities().xrLocateBodyJointsHTC;
        if (CHECKS) {
            check(__functionAddress);
            XrBodyJointsLocateInfoHTC.validate(locateInfo);
        }
        return callPPPI(bodyTracker.address(), locateInfo, locations, __functionAddress);
    }

    /**
     * Locate the individual body joints.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrLocateBodyJointsHTC LocateBodyJointsHTC} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrLocateBodyJointsHTC(
     *     XrBodyTrackerHTC                            bodyTracker,
     *     const XrBodyJointsLocateInfoHTC*            locateInfo,
     *     XrBodyJointLocationsHTC*                    locations);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrLocateBodyJointsHTC LocateBodyJointsHTC} function locates an array of body joints relative to a base space at a given time.</p>
     * 
     * <p>If {@link XrBodyJointLocationsHTC}{@code ::jointLocationCount} does not match the value associated with the supplied {@code XrBodyJointSetHTC} value, the runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link HTCBodyTracking XR_HTC_body_tracking} extension <b>must</b> be enabled prior to calling {@link #xrLocateBodyJointsHTC LocateBodyJointsHTC}</li>
     * <li>{@code bodyTracker} <b>must</b> be a valid {@code XrBodyTrackerHTC} handle</li>
     * <li>{@code locateInfo} <b>must</b> be a pointer to a valid {@link XrBodyJointsLocateInfoHTC} structure</li>
     * <li>{@code locations} <b>must</b> be a pointer to an {@link XrBodyJointLocationsHTC} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrBodyJointLocationsHTC}, {@link XrBodyJointsLocateInfoHTC}</p>
     *
     * @param bodyTracker an {@code XrBodyTrackerHTC} previously created by {@link #xrCreateBodyTrackerHTC CreateBodyTrackerHTC}.
     * @param locateInfo  a pointer to {@link XrBodyJointsLocateInfoHTC} describing information to locate body joints.
     * @param locations   a pointer to {@link XrBodyJointLocationsHTC} receiving the returned body joint locations.
     */
    @NativeType("XrResult")
    public static int xrLocateBodyJointsHTC(XrBodyTrackerHTC bodyTracker, @NativeType("XrBodyJointsLocateInfoHTC const *") XrBodyJointsLocateInfoHTC locateInfo, @NativeType("XrBodyJointLocationsHTC *") XrBodyJointLocationsHTC locations) {
        return nxrLocateBodyJointsHTC(bodyTracker, locateInfo.address(), locations.address());
    }

    // --- [ xrGetBodySkeletonHTC ] ---

    /** Unsafe version of: {@link #xrGetBodySkeletonHTC GetBodySkeletonHTC} */
    public static int nxrGetBodySkeletonHTC(XrBodyTrackerHTC bodyTracker, XrSpace baseSpace, int skeletonGenerationId, long skeleton) {
        long __functionAddress = bodyTracker.getCapabilities().xrGetBodySkeletonHTC;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(bodyTracker.address(), baseSpace.address(), skeletonGenerationId, skeleton, __functionAddress);
    }

    /**
     * Retrieve body skeleton.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetBodySkeletonHTC GetBodySkeletonHTC} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetBodySkeletonHTC(
     *     XrBodyTrackerHTC                            bodyTracker,
     *     XrSpace                                     baseSpace,
     *     uint32_t                                    skeletonGenerationId,
     *     XrBodySkeletonHTC*                          skeleton);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrGetBodySkeletonHTC GetBodySkeletonHTC} function returns the body skeleton in T-pose. This function <b>can</b> be used to get body skeleton and infer the skeleton scale and proportions in conjunction with {@link XrBodyJointLocationsHTC}{@code ::skeletonGenerationId}. {@link XrBodyJointLocationsHTC}{@code ::skeletonGenerationId} is generated when the tracking auto-calibrates the user skeleton scale and proportions.</p>
     * 
     * <p>If the application supplies a {@code skeletonGenerationId} that does not match any value returned in {@link XrBodyJointLocationsHTC}{@code ::skeletonGenerationId} during the current session, the runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link HTCBodyTracking XR_HTC_body_tracking} extension <b>must</b> be enabled prior to calling {@link #xrGetBodySkeletonHTC GetBodySkeletonHTC}</li>
     * <li>{@code bodyTracker} <b>must</b> be a valid {@code XrBodyTrackerHTC} handle</li>
     * <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
     * <li>{@code skeleton} <b>must</b> be a pointer to an {@link XrBodySkeletonHTC} structure</li>
     * <li>Both of {@code baseSpace} and {@code bodyTracker} <b>must</b> have been created, allocated, or retrieved from the same {@code XrSession}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrBodySkeletonHTC}</p>
     *
     * @param bodyTracker          an {@code XrBodyTrackerHTC} previously created by {@link #xrCreateBodyTrackerHTC CreateBodyTrackerHTC}.
     * @param baseSpace            an {@code XrSpace} within which the returned body skeleton in T-pose will be represented.
     * @param skeletonGenerationId the skeleton id of the skeleton.
     * @param skeleton             a pointer to {@link XrBodySkeletonHTC} receiving the returned body skeleton.
     */
    @NativeType("XrResult")
    public static int xrGetBodySkeletonHTC(XrBodyTrackerHTC bodyTracker, XrSpace baseSpace, @NativeType("uint32_t") int skeletonGenerationId, @NativeType("XrBodySkeletonHTC *") XrBodySkeletonHTC skeleton) {
        return nxrGetBodySkeletonHTC(bodyTracker, baseSpace, skeletonGenerationId, skeleton.address());
    }

}