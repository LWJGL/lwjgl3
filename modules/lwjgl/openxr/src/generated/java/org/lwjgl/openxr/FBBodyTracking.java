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
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_body_tracking">XR_FB_body_tracking</a> extension.
 * 
 * <p>This extension enables applications to locate the individual body joints that represent the estimated position of the user of the device. It enables applications to render the upper body in XR experiences.</p>
 */
public class FBBodyTracking {

    /** The extension specification version. */
    public static final int XR_FB_body_tracking_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_BODY_TRACKING_EXTENSION_NAME = "XR_FB_body_tracking";

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_BODY_TRACKER_FB = 1000076000;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_BODY_TRACKER_CREATE_INFO_FB TYPE_BODY_TRACKER_CREATE_INFO_FB}</li>
     * <li>{@link #XR_TYPE_BODY_JOINTS_LOCATE_INFO_FB TYPE_BODY_JOINTS_LOCATE_INFO_FB}</li>
     * <li>{@link #XR_TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_FB TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_FB}</li>
     * <li>{@link #XR_TYPE_BODY_JOINT_LOCATIONS_FB TYPE_BODY_JOINT_LOCATIONS_FB}</li>
     * <li>{@link #XR_TYPE_BODY_SKELETON_FB TYPE_BODY_SKELETON_FB}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_BODY_TRACKER_CREATE_INFO_FB        = 1000076001,
        XR_TYPE_BODY_JOINTS_LOCATE_INFO_FB         = 1000076002,
        XR_TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_FB = 1000076004,
        XR_TYPE_BODY_JOINT_LOCATIONS_FB            = 1000076005,
        XR_TYPE_BODY_SKELETON_FB                   = 1000076006;

    /**
     * XrBodyJointFB - The name of body joints that can be tracked
     * 
     * <h5>Description</h5>
     * 
     * <p>The backward (+Z) direction is parallel to the corresponding bone and points away from the finger tip. The up (+Y) direction is pointing out of the back of and perpendicular to the corresponding finger nail at the fully opened hand pose. The X direction is perpendicular to Y and Z and follows the right hand rule.</p>
     * 
     * <p>The wrist joint is located at the pivot point of the wrist, which is location invariant when twisting the hand without moving the forearm. The backward (+Z) direction is parallel to the line from wrist joint to middle finger metacarpal joint, and points away from the finger tips. The up (+Y) direction points out towards back of the hand and perpendicular to the skin at wrist. The X direction is perpendicular to the Y and Z directions and follows the right hand rule.</p>
     * 
     * <p>The palm joint is located at the center of the middle finger’s metacarpal bone. The backward (+Z) direction is parallel to the middle finger’s metacarpal bone, and points away from the finger tips. The up (+Y) direction is perpendicular to palm surface and pointing towards the back of the hand. The X direction is perpendicular to the Y and Z directions and follows the right hand rule.</p>
     * 
     * <p>Body skeleton has the full set of body joints (e.g. defined by {@code XrBodyJointFB}), organized in a hierarchy with a default T-shape body pose.</p>
     * 
     * <p>The purpose of the skeleton is to provide data about the body size. Coordinates are relative to each other, so there is no any relation to any space.</p>
     * 
     * <p>The calculation of the body size <b>may</b> be updated during a session. Each time the calculation of the size is changed, {@code skeletonChangedCount} of {@link XrBodyJointLocationsFB} is changed to indicate that a new skeleton <b>may</b> be retrieved.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_BODY_JOINT_ROOT_FB BODY_JOINT_ROOT_FB}</li>
     * <li>{@link #XR_BODY_JOINT_HIPS_FB BODY_JOINT_HIPS_FB}</li>
     * <li>{@link #XR_BODY_JOINT_SPINE_LOWER_FB BODY_JOINT_SPINE_LOWER_FB}</li>
     * <li>{@link #XR_BODY_JOINT_SPINE_MIDDLE_FB BODY_JOINT_SPINE_MIDDLE_FB}</li>
     * <li>{@link #XR_BODY_JOINT_SPINE_UPPER_FB BODY_JOINT_SPINE_UPPER_FB}</li>
     * <li>{@link #XR_BODY_JOINT_CHEST_FB BODY_JOINT_CHEST_FB}</li>
     * <li>{@link #XR_BODY_JOINT_NECK_FB BODY_JOINT_NECK_FB}</li>
     * <li>{@link #XR_BODY_JOINT_HEAD_FB BODY_JOINT_HEAD_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_SHOULDER_FB BODY_JOINT_LEFT_SHOULDER_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_SCAPULA_FB BODY_JOINT_LEFT_SCAPULA_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_ARM_UPPER_FB BODY_JOINT_LEFT_ARM_UPPER_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_ARM_LOWER_FB BODY_JOINT_LEFT_ARM_LOWER_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_WRIST_TWIST_FB BODY_JOINT_LEFT_HAND_WRIST_TWIST_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_SHOULDER_FB BODY_JOINT_RIGHT_SHOULDER_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_SCAPULA_FB BODY_JOINT_RIGHT_SCAPULA_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_ARM_UPPER_FB BODY_JOINT_RIGHT_ARM_UPPER_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_ARM_LOWER_FB BODY_JOINT_RIGHT_ARM_LOWER_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_WRIST_TWIST_FB BODY_JOINT_RIGHT_HAND_WRIST_TWIST_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_PALM_FB BODY_JOINT_LEFT_HAND_PALM_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_WRIST_FB BODY_JOINT_LEFT_HAND_WRIST_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_THUMB_METACARPAL_FB BODY_JOINT_LEFT_HAND_THUMB_METACARPAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_THUMB_PROXIMAL_FB BODY_JOINT_LEFT_HAND_THUMB_PROXIMAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_THUMB_DISTAL_FB BODY_JOINT_LEFT_HAND_THUMB_DISTAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_THUMB_TIP_FB BODY_JOINT_LEFT_HAND_THUMB_TIP_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_INDEX_METACARPAL_FB BODY_JOINT_LEFT_HAND_INDEX_METACARPAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_INDEX_PROXIMAL_FB BODY_JOINT_LEFT_HAND_INDEX_PROXIMAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_INDEX_INTERMEDIATE_FB BODY_JOINT_LEFT_HAND_INDEX_INTERMEDIATE_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_INDEX_DISTAL_FB BODY_JOINT_LEFT_HAND_INDEX_DISTAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_INDEX_TIP_FB BODY_JOINT_LEFT_HAND_INDEX_TIP_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_MIDDLE_METACARPAL_FB BODY_JOINT_LEFT_HAND_MIDDLE_METACARPAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_MIDDLE_PROXIMAL_FB BODY_JOINT_LEFT_HAND_MIDDLE_PROXIMAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_MIDDLE_INTERMEDIATE_FB BODY_JOINT_LEFT_HAND_MIDDLE_INTERMEDIATE_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_MIDDLE_DISTAL_FB BODY_JOINT_LEFT_HAND_MIDDLE_DISTAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_MIDDLE_TIP_FB BODY_JOINT_LEFT_HAND_MIDDLE_TIP_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_RING_METACARPAL_FB BODY_JOINT_LEFT_HAND_RING_METACARPAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_RING_PROXIMAL_FB BODY_JOINT_LEFT_HAND_RING_PROXIMAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_RING_INTERMEDIATE_FB BODY_JOINT_LEFT_HAND_RING_INTERMEDIATE_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_RING_DISTAL_FB BODY_JOINT_LEFT_HAND_RING_DISTAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_RING_TIP_FB BODY_JOINT_LEFT_HAND_RING_TIP_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_LITTLE_METACARPAL_FB BODY_JOINT_LEFT_HAND_LITTLE_METACARPAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_LITTLE_PROXIMAL_FB BODY_JOINT_LEFT_HAND_LITTLE_PROXIMAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_LITTLE_INTERMEDIATE_FB BODY_JOINT_LEFT_HAND_LITTLE_INTERMEDIATE_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_LITTLE_DISTAL_FB BODY_JOINT_LEFT_HAND_LITTLE_DISTAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_LEFT_HAND_LITTLE_TIP_FB BODY_JOINT_LEFT_HAND_LITTLE_TIP_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_PALM_FB BODY_JOINT_RIGHT_HAND_PALM_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_WRIST_FB BODY_JOINT_RIGHT_HAND_WRIST_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_THUMB_METACARPAL_FB BODY_JOINT_RIGHT_HAND_THUMB_METACARPAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_THUMB_PROXIMAL_FB BODY_JOINT_RIGHT_HAND_THUMB_PROXIMAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_THUMB_DISTAL_FB BODY_JOINT_RIGHT_HAND_THUMB_DISTAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_THUMB_TIP_FB BODY_JOINT_RIGHT_HAND_THUMB_TIP_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_INDEX_METACARPAL_FB BODY_JOINT_RIGHT_HAND_INDEX_METACARPAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_INDEX_PROXIMAL_FB BODY_JOINT_RIGHT_HAND_INDEX_PROXIMAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_INDEX_INTERMEDIATE_FB BODY_JOINT_RIGHT_HAND_INDEX_INTERMEDIATE_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_INDEX_DISTAL_FB BODY_JOINT_RIGHT_HAND_INDEX_DISTAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_INDEX_TIP_FB BODY_JOINT_RIGHT_HAND_INDEX_TIP_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_MIDDLE_METACARPAL_FB BODY_JOINT_RIGHT_HAND_MIDDLE_METACARPAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_MIDDLE_PROXIMAL_FB BODY_JOINT_RIGHT_HAND_MIDDLE_PROXIMAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_MIDDLE_INTERMEDIATE_FB BODY_JOINT_RIGHT_HAND_MIDDLE_INTERMEDIATE_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_MIDDLE_DISTAL_FB BODY_JOINT_RIGHT_HAND_MIDDLE_DISTAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_MIDDLE_TIP_FB BODY_JOINT_RIGHT_HAND_MIDDLE_TIP_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_RING_METACARPAL_FB BODY_JOINT_RIGHT_HAND_RING_METACARPAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_RING_PROXIMAL_FB BODY_JOINT_RIGHT_HAND_RING_PROXIMAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_RING_INTERMEDIATE_FB BODY_JOINT_RIGHT_HAND_RING_INTERMEDIATE_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_RING_DISTAL_FB BODY_JOINT_RIGHT_HAND_RING_DISTAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_RING_TIP_FB BODY_JOINT_RIGHT_HAND_RING_TIP_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_LITTLE_METACARPAL_FB BODY_JOINT_RIGHT_HAND_LITTLE_METACARPAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_LITTLE_PROXIMAL_FB BODY_JOINT_RIGHT_HAND_LITTLE_PROXIMAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_LITTLE_INTERMEDIATE_FB BODY_JOINT_RIGHT_HAND_LITTLE_INTERMEDIATE_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_LITTLE_DISTAL_FB BODY_JOINT_RIGHT_HAND_LITTLE_DISTAL_FB}</li>
     * <li>{@link #XR_BODY_JOINT_RIGHT_HAND_LITTLE_TIP_FB BODY_JOINT_RIGHT_HAND_LITTLE_TIP_FB}</li>
     * <li>{@link #XR_BODY_JOINT_COUNT_FB BODY_JOINT_COUNT_FB}</li>
     * <li>{@link #XR_BODY_JOINT_NONE_FB BODY_JOINT_NONE_FB}</li>
     * </ul>
     */
    public static final int
        XR_BODY_JOINT_ROOT_FB                           = 0,
        XR_BODY_JOINT_HIPS_FB                           = 1,
        XR_BODY_JOINT_SPINE_LOWER_FB                    = 2,
        XR_BODY_JOINT_SPINE_MIDDLE_FB                   = 3,
        XR_BODY_JOINT_SPINE_UPPER_FB                    = 4,
        XR_BODY_JOINT_CHEST_FB                          = 5,
        XR_BODY_JOINT_NECK_FB                           = 6,
        XR_BODY_JOINT_HEAD_FB                           = 7,
        XR_BODY_JOINT_LEFT_SHOULDER_FB                  = 8,
        XR_BODY_JOINT_LEFT_SCAPULA_FB                   = 9,
        XR_BODY_JOINT_LEFT_ARM_UPPER_FB                 = 10,
        XR_BODY_JOINT_LEFT_ARM_LOWER_FB                 = 11,
        XR_BODY_JOINT_LEFT_HAND_WRIST_TWIST_FB          = 12,
        XR_BODY_JOINT_RIGHT_SHOULDER_FB                 = 13,
        XR_BODY_JOINT_RIGHT_SCAPULA_FB                  = 14,
        XR_BODY_JOINT_RIGHT_ARM_UPPER_FB                = 15,
        XR_BODY_JOINT_RIGHT_ARM_LOWER_FB                = 16,
        XR_BODY_JOINT_RIGHT_HAND_WRIST_TWIST_FB         = 17,
        XR_BODY_JOINT_LEFT_HAND_PALM_FB                 = 18,
        XR_BODY_JOINT_LEFT_HAND_WRIST_FB                = 19,
        XR_BODY_JOINT_LEFT_HAND_THUMB_METACARPAL_FB     = 20,
        XR_BODY_JOINT_LEFT_HAND_THUMB_PROXIMAL_FB       = 21,
        XR_BODY_JOINT_LEFT_HAND_THUMB_DISTAL_FB         = 22,
        XR_BODY_JOINT_LEFT_HAND_THUMB_TIP_FB            = 23,
        XR_BODY_JOINT_LEFT_HAND_INDEX_METACARPAL_FB     = 24,
        XR_BODY_JOINT_LEFT_HAND_INDEX_PROXIMAL_FB       = 25,
        XR_BODY_JOINT_LEFT_HAND_INDEX_INTERMEDIATE_FB   = 26,
        XR_BODY_JOINT_LEFT_HAND_INDEX_DISTAL_FB         = 27,
        XR_BODY_JOINT_LEFT_HAND_INDEX_TIP_FB            = 28,
        XR_BODY_JOINT_LEFT_HAND_MIDDLE_METACARPAL_FB    = 29,
        XR_BODY_JOINT_LEFT_HAND_MIDDLE_PROXIMAL_FB      = 30,
        XR_BODY_JOINT_LEFT_HAND_MIDDLE_INTERMEDIATE_FB  = 31,
        XR_BODY_JOINT_LEFT_HAND_MIDDLE_DISTAL_FB        = 32,
        XR_BODY_JOINT_LEFT_HAND_MIDDLE_TIP_FB           = 33,
        XR_BODY_JOINT_LEFT_HAND_RING_METACARPAL_FB      = 34,
        XR_BODY_JOINT_LEFT_HAND_RING_PROXIMAL_FB        = 35,
        XR_BODY_JOINT_LEFT_HAND_RING_INTERMEDIATE_FB    = 36,
        XR_BODY_JOINT_LEFT_HAND_RING_DISTAL_FB          = 37,
        XR_BODY_JOINT_LEFT_HAND_RING_TIP_FB             = 38,
        XR_BODY_JOINT_LEFT_HAND_LITTLE_METACARPAL_FB    = 39,
        XR_BODY_JOINT_LEFT_HAND_LITTLE_PROXIMAL_FB      = 40,
        XR_BODY_JOINT_LEFT_HAND_LITTLE_INTERMEDIATE_FB  = 41,
        XR_BODY_JOINT_LEFT_HAND_LITTLE_DISTAL_FB        = 42,
        XR_BODY_JOINT_LEFT_HAND_LITTLE_TIP_FB           = 43,
        XR_BODY_JOINT_RIGHT_HAND_PALM_FB                = 44,
        XR_BODY_JOINT_RIGHT_HAND_WRIST_FB               = 45,
        XR_BODY_JOINT_RIGHT_HAND_THUMB_METACARPAL_FB    = 46,
        XR_BODY_JOINT_RIGHT_HAND_THUMB_PROXIMAL_FB      = 47,
        XR_BODY_JOINT_RIGHT_HAND_THUMB_DISTAL_FB        = 48,
        XR_BODY_JOINT_RIGHT_HAND_THUMB_TIP_FB           = 49,
        XR_BODY_JOINT_RIGHT_HAND_INDEX_METACARPAL_FB    = 50,
        XR_BODY_JOINT_RIGHT_HAND_INDEX_PROXIMAL_FB      = 51,
        XR_BODY_JOINT_RIGHT_HAND_INDEX_INTERMEDIATE_FB  = 52,
        XR_BODY_JOINT_RIGHT_HAND_INDEX_DISTAL_FB        = 53,
        XR_BODY_JOINT_RIGHT_HAND_INDEX_TIP_FB           = 54,
        XR_BODY_JOINT_RIGHT_HAND_MIDDLE_METACARPAL_FB   = 55,
        XR_BODY_JOINT_RIGHT_HAND_MIDDLE_PROXIMAL_FB     = 56,
        XR_BODY_JOINT_RIGHT_HAND_MIDDLE_INTERMEDIATE_FB = 57,
        XR_BODY_JOINT_RIGHT_HAND_MIDDLE_DISTAL_FB       = 58,
        XR_BODY_JOINT_RIGHT_HAND_MIDDLE_TIP_FB          = 59,
        XR_BODY_JOINT_RIGHT_HAND_RING_METACARPAL_FB     = 60,
        XR_BODY_JOINT_RIGHT_HAND_RING_PROXIMAL_FB       = 61,
        XR_BODY_JOINT_RIGHT_HAND_RING_INTERMEDIATE_FB   = 62,
        XR_BODY_JOINT_RIGHT_HAND_RING_DISTAL_FB         = 63,
        XR_BODY_JOINT_RIGHT_HAND_RING_TIP_FB            = 64,
        XR_BODY_JOINT_RIGHT_HAND_LITTLE_METACARPAL_FB   = 65,
        XR_BODY_JOINT_RIGHT_HAND_LITTLE_PROXIMAL_FB     = 66,
        XR_BODY_JOINT_RIGHT_HAND_LITTLE_INTERMEDIATE_FB = 67,
        XR_BODY_JOINT_RIGHT_HAND_LITTLE_DISTAL_FB       = 68,
        XR_BODY_JOINT_RIGHT_HAND_LITTLE_TIP_FB          = 69,
        XR_BODY_JOINT_COUNT_FB                          = 70,
        XR_BODY_JOINT_NONE_FB                           = -1;

    /**
     * XrBodyJointSetFB - The set of body joints to track.
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_BODY_JOINT_SET_DEFAULT_FB BODY_JOINT_SET_DEFAULT_FB} — Indicates that the created {@code XrBodyTrackerFB} tracks the set of body joints described by {@code XrBodyJointFB} enum, i.e. the {@link #xrLocateBodyJointsFB LocateBodyJointsFB} function returns an array of joint locations with the count of {@link #XR_BODY_JOINT_COUNT_FB BODY_JOINT_COUNT_FB} and can be indexed using {@code XrBodyJointFB}.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrBodyTrackerCreateInfoFB}</p>
     */
    public static final int XR_BODY_JOINT_SET_DEFAULT_FB = 0;

    protected FBBodyTracking() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateBodyTrackerFB ] ---

    /** Unsafe version of: {@link #xrCreateBodyTrackerFB CreateBodyTrackerFB} */
    public static int nxrCreateBodyTrackerFB(XrSession session, long createInfo, long bodyTracker) {
        long __functionAddress = session.getCapabilities().xrCreateBodyTrackerFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, bodyTracker, __functionAddress);
    }

    /**
     * Create a body joints handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>An application <b>can</b> create an {@code XrBodyTrackerFB} handle using {@link #xrCreateBodyTrackerFB CreateBodyTrackerFB} function.</p>
     * 
     * <pre><code>
     * XrResult xrCreateBodyTrackerFB(
     *     XrSession                                   session,
     *     const XrBodyTrackerCreateInfoFB*            createInfo,
     *     XrBodyTrackerFB*                            bodyTracker);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If the system does not support body tracking, the runtime <b>must</b> return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} from {@link #xrCreateBodyTrackerFB CreateBodyTrackerFB}. In this case, the runtime <b>must</b> return {@link XR10#XR_FALSE FALSE} for {@code supportsBodyTracking} in {@link XrSystemBodyTrackingPropertiesFB} when the function {@link XR10#xrGetSystemProperties GetSystemProperties} is called, so that the application <b>can</b> avoid creating a body tracker.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBBodyTracking XR_FB_body_tracking} extension <b>must</b> be enabled prior to calling {@link #xrCreateBodyTrackerFB CreateBodyTrackerFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrBodyTrackerCreateInfoFB} structure</li>
     * <li>{@code bodyTracker} <b>must</b> be a pointer to an {@code XrBodyTrackerFB} handle</li>
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
     * <p>{@link XrBodyTrackerCreateInfoFB}</p>
     *
     * @param session     an {@code XrSession} in which the body tracker will be active.
     * @param createInfo  the {@link XrBodyTrackerCreateInfoFB} used to specify the body tracker.
     * @param bodyTracker the returned {@code XrBodyTrackerFB} handle.
     */
    @NativeType("XrResult")
    public static int xrCreateBodyTrackerFB(XrSession session, @NativeType("XrBodyTrackerCreateInfoFB const *") XrBodyTrackerCreateInfoFB createInfo, @NativeType("XrBodyTrackerFB *") PointerBuffer bodyTracker) {
        if (CHECKS) {
            check(bodyTracker, 1);
        }
        return nxrCreateBodyTrackerFB(session, createInfo.address(), memAddress(bodyTracker));
    }

    // --- [ xrDestroyBodyTrackerFB ] ---

    /**
     * Destroy a body joints handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>{@link #xrDestroyBodyTrackerFB DestroyBodyTrackerFB} function releases the {@code bodyTracker} and the underlying resources when the body tracking experience is over.</p>
     * 
     * <pre><code>
     * XrResult xrDestroyBodyTrackerFB(
     *     XrBodyTrackerFB                             bodyTracker);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBBodyTracking XR_FB_body_tracking} extension <b>must</b> be enabled prior to calling {@link #xrDestroyBodyTrackerFB DestroyBodyTrackerFB}</li>
     * <li>{@code bodyTracker} <b>must</b> be a valid {@code XrBodyTrackerFB} handle</li>
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
     * @param bodyTracker an {@code XrBodyTrackerFB} previously created by {@link #xrCreateBodyTrackerFB CreateBodyTrackerFB}.
     */
    @NativeType("XrResult")
    public static int xrDestroyBodyTrackerFB(XrBodyTrackerFB bodyTracker) {
        long __functionAddress = bodyTracker.getCapabilities().xrDestroyBodyTrackerFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(bodyTracker.address(), __functionAddress);
    }

    // --- [ xrLocateBodyJointsFB ] ---

    /** Unsafe version of: {@link #xrLocateBodyJointsFB LocateBodyJointsFB} */
    public static int nxrLocateBodyJointsFB(XrBodyTrackerFB bodyTracker, long locateInfo, long locations) {
        long __functionAddress = bodyTracker.getCapabilities().xrLocateBodyJointsFB;
        if (CHECKS) {
            check(__functionAddress);
            XrBodyJointsLocateInfoFB.validate(locateInfo);
        }
        return callPPPI(bodyTracker.address(), locateInfo, locations, __functionAddress);
    }

    /**
     * Locate body joint locations.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrLocateBodyJointsFB LocateBodyJointsFB} function locates an array of body joints to a base space at a given time.</p>
     * 
     * <pre><code>
     * XrResult xrLocateBodyJointsFB(
     *     XrBodyTrackerFB                             bodyTracker,
     *     const XrBodyJointsLocateInfoFB*             locateInfo,
     *     XrBodyJointLocationsFB*                     locations);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBBodyTracking XR_FB_body_tracking} extension <b>must</b> be enabled prior to calling {@link #xrLocateBodyJointsFB LocateBodyJointsFB}</li>
     * <li>{@code bodyTracker} <b>must</b> be a valid {@code XrBodyTrackerFB} handle</li>
     * <li>{@code locateInfo} <b>must</b> be a pointer to a valid {@link XrBodyJointsLocateInfoFB} structure</li>
     * <li>{@code locations} <b>must</b> be a pointer to an {@link XrBodyJointLocationsFB} structure</li>
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
     * <p>{@link XrBodyJointLocationsFB}, {@link XrBodyJointsLocateInfoFB}</p>
     *
     * @param bodyTracker an {@code XrBodyTrackerFB} previously created by {@link #xrCreateBodyTrackerFB CreateBodyTrackerFB}.
     * @param locateInfo  a pointer to {@link XrBodyJointsLocateInfoFB} describing information to locate body joints.
     * @param locations   a pointer to {@link XrBodyJointLocationsFB} receiving the returned body joint locations.
     */
    @NativeType("XrResult")
    public static int xrLocateBodyJointsFB(XrBodyTrackerFB bodyTracker, @NativeType("XrBodyJointsLocateInfoFB const *") XrBodyJointsLocateInfoFB locateInfo, @NativeType("XrBodyJointLocationsFB *") XrBodyJointLocationsFB locations) {
        return nxrLocateBodyJointsFB(bodyTracker, locateInfo.address(), locations.address());
    }

    // --- [ xrGetBodySkeletonFB ] ---

    /** Unsafe version of: {@link #xrGetBodySkeletonFB GetBodySkeletonFB} */
    public static int nxrGetBodySkeletonFB(XrBodyTrackerFB bodyTracker, long skeleton) {
        long __functionAddress = bodyTracker.getCapabilities().xrGetBodySkeletonFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(bodyTracker.address(), skeleton, __functionAddress);
    }

    /**
     * Retrieve body skeleton.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetBodySkeletonFB GetBodySkeletonFB} function returns the body skeleton in T-pose.</p>
     * 
     * <pre><code>
     * XrResult xrGetBodySkeletonFB(
     *     XrBodyTrackerFB                             bodyTracker,
     *     XrBodySkeletonFB*                           skeleton);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This function <b>can</b> be used to query the skeleton scale and proportions in conjunction with {@link XrBodyJointLocationsFB}{@code ::skeletonChangedCount}. {@link XrBodyJointLocationsFB}{@code ::skeletonChangedCount} is incremented whenever the tracking auto-calibrates the user skeleton scale and proportions.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBBodyTracking XR_FB_body_tracking} extension <b>must</b> be enabled prior to calling {@link #xrGetBodySkeletonFB GetBodySkeletonFB}</li>
     * <li>{@code bodyTracker} <b>must</b> be a valid {@code XrBodyTrackerFB} handle</li>
     * <li>{@code skeleton} <b>must</b> be a pointer to an {@link XrBodySkeletonFB} structure</li>
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
     * <p>{@link XrBodySkeletonFB}</p>
     *
     * @param bodyTracker an {@code XrBodyTrackerFB} previously created by {@link #xrCreateBodyTrackerFB CreateBodyTrackerFB}.
     * @param skeleton    a pointer to {@link XrBodySkeletonFB} receiving the returned body skeleton hierarchy.
     */
    @NativeType("XrResult")
    public static int xrGetBodySkeletonFB(XrBodyTrackerFB bodyTracker, @NativeType("XrBodySkeletonFB *") XrBodySkeletonFB skeleton) {
        return nxrGetBodySkeletonFB(bodyTracker, skeleton.address());
    }

}