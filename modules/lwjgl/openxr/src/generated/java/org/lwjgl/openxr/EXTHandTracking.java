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

/** The EXT_hand_tracking extension. */
public class EXTHandTracking {

    /** The extension specification version. */
    public static final int XR_EXT_hand_tracking_SPEC_VERSION = 4;

    /** The extension name. */
    public static final String XR_EXT_HAND_TRACKING_EXTENSION_NAME = "XR_EXT_hand_tracking";

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_HAND_TRACKER_EXT = 1000051000;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SYSTEM_HAND_TRACKING_PROPERTIES_EXT TYPE_SYSTEM_HAND_TRACKING_PROPERTIES_EXT}</li>
     * <li>{@link #XR_TYPE_HAND_TRACKER_CREATE_INFO_EXT TYPE_HAND_TRACKER_CREATE_INFO_EXT}</li>
     * <li>{@link #XR_TYPE_HAND_JOINTS_LOCATE_INFO_EXT TYPE_HAND_JOINTS_LOCATE_INFO_EXT}</li>
     * <li>{@link #XR_TYPE_HAND_JOINT_LOCATIONS_EXT TYPE_HAND_JOINT_LOCATIONS_EXT}</li>
     * <li>{@link #XR_TYPE_HAND_JOINT_VELOCITIES_EXT TYPE_HAND_JOINT_VELOCITIES_EXT}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SYSTEM_HAND_TRACKING_PROPERTIES_EXT = 1000051000,
        XR_TYPE_HAND_TRACKER_CREATE_INFO_EXT        = 1000051001,
        XR_TYPE_HAND_JOINTS_LOCATE_INFO_EXT         = 1000051002,
        XR_TYPE_HAND_JOINT_LOCATIONS_EXT            = 1000051003,
        XR_TYPE_HAND_JOINT_VELOCITIES_EXT           = 1000051004;

    /**
     * XrHandEXT - Describes which hand the tracker is tracking.
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_HAND_LEFT_EXT HAND_LEFT_EXT} specifies the hand tracker will be tracking the user’s left hand.</li>
     * <li>{@link #XR_HAND_RIGHT_EXT HAND_RIGHT_EXT} specifies the hand tracker will be tracking the user’s right hand.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrHandTrackerCreateInfoEXT}</p>
     */
    public static final int
        XR_HAND_LEFT_EXT  = 1,
        XR_HAND_RIGHT_EXT = 2;

    /**
     * XrHandJointEXT - The name of hand joints that can be tracked
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrHandCapsuleFB}, {@link XrHandTrackingMeshFB}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_HAND_JOINT_PALM_EXT HAND_JOINT_PALM_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_WRIST_EXT HAND_JOINT_WRIST_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_THUMB_METACARPAL_EXT HAND_JOINT_THUMB_METACARPAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_THUMB_PROXIMAL_EXT HAND_JOINT_THUMB_PROXIMAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_THUMB_DISTAL_EXT HAND_JOINT_THUMB_DISTAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_THUMB_TIP_EXT HAND_JOINT_THUMB_TIP_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_INDEX_METACARPAL_EXT HAND_JOINT_INDEX_METACARPAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_INDEX_PROXIMAL_EXT HAND_JOINT_INDEX_PROXIMAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_INDEX_INTERMEDIATE_EXT HAND_JOINT_INDEX_INTERMEDIATE_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_INDEX_DISTAL_EXT HAND_JOINT_INDEX_DISTAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_INDEX_TIP_EXT HAND_JOINT_INDEX_TIP_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_MIDDLE_METACARPAL_EXT HAND_JOINT_MIDDLE_METACARPAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_MIDDLE_PROXIMAL_EXT HAND_JOINT_MIDDLE_PROXIMAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_MIDDLE_INTERMEDIATE_EXT HAND_JOINT_MIDDLE_INTERMEDIATE_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_MIDDLE_DISTAL_EXT HAND_JOINT_MIDDLE_DISTAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_MIDDLE_TIP_EXT HAND_JOINT_MIDDLE_TIP_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_RING_METACARPAL_EXT HAND_JOINT_RING_METACARPAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_RING_PROXIMAL_EXT HAND_JOINT_RING_PROXIMAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_RING_INTERMEDIATE_EXT HAND_JOINT_RING_INTERMEDIATE_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_RING_DISTAL_EXT HAND_JOINT_RING_DISTAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_RING_TIP_EXT HAND_JOINT_RING_TIP_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_LITTLE_METACARPAL_EXT HAND_JOINT_LITTLE_METACARPAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_LITTLE_PROXIMAL_EXT HAND_JOINT_LITTLE_PROXIMAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_LITTLE_INTERMEDIATE_EXT HAND_JOINT_LITTLE_INTERMEDIATE_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_LITTLE_DISTAL_EXT HAND_JOINT_LITTLE_DISTAL_EXT}</li>
     * <li>{@link #XR_HAND_JOINT_LITTLE_TIP_EXT HAND_JOINT_LITTLE_TIP_EXT}</li>
     * </ul>
     */
    public static final int
        XR_HAND_JOINT_PALM_EXT                = 0,
        XR_HAND_JOINT_WRIST_EXT               = 1,
        XR_HAND_JOINT_THUMB_METACARPAL_EXT    = 2,
        XR_HAND_JOINT_THUMB_PROXIMAL_EXT      = 3,
        XR_HAND_JOINT_THUMB_DISTAL_EXT        = 4,
        XR_HAND_JOINT_THUMB_TIP_EXT           = 5,
        XR_HAND_JOINT_INDEX_METACARPAL_EXT    = 6,
        XR_HAND_JOINT_INDEX_PROXIMAL_EXT      = 7,
        XR_HAND_JOINT_INDEX_INTERMEDIATE_EXT  = 8,
        XR_HAND_JOINT_INDEX_DISTAL_EXT        = 9,
        XR_HAND_JOINT_INDEX_TIP_EXT           = 10,
        XR_HAND_JOINT_MIDDLE_METACARPAL_EXT   = 11,
        XR_HAND_JOINT_MIDDLE_PROXIMAL_EXT     = 12,
        XR_HAND_JOINT_MIDDLE_INTERMEDIATE_EXT = 13,
        XR_HAND_JOINT_MIDDLE_DISTAL_EXT       = 14,
        XR_HAND_JOINT_MIDDLE_TIP_EXT          = 15,
        XR_HAND_JOINT_RING_METACARPAL_EXT     = 16,
        XR_HAND_JOINT_RING_PROXIMAL_EXT       = 17,
        XR_HAND_JOINT_RING_INTERMEDIATE_EXT   = 18,
        XR_HAND_JOINT_RING_DISTAL_EXT         = 19,
        XR_HAND_JOINT_RING_TIP_EXT            = 20,
        XR_HAND_JOINT_LITTLE_METACARPAL_EXT   = 21,
        XR_HAND_JOINT_LITTLE_PROXIMAL_EXT     = 22,
        XR_HAND_JOINT_LITTLE_INTERMEDIATE_EXT = 23,
        XR_HAND_JOINT_LITTLE_DISTAL_EXT       = 24,
        XR_HAND_JOINT_LITTLE_TIP_EXT          = 25;

    /**
     * XrHandJointSetEXT - The set of hand joints to track.
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_HAND_JOINT_SET_DEFAULT_EXT HAND_JOINT_SET_DEFAULT_EXT} indicates that the created {@code XrHandTrackerEXT} tracks the set of hand joints described by {@code XrHandJointEXT} enum, i.e. the {@link #xrLocateHandJointsEXT LocateHandJointsEXT} function returns an array of joint locations with the count of {@link #XR_HAND_JOINT_COUNT_EXT HAND_JOINT_COUNT_EXT} and can be indexed using {@code XrHandJointEXT}.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrHandTrackerCreateInfoEXT}</p>
     */
    public static final int XR_HAND_JOINT_SET_DEFAULT_EXT = 0;

    /** API Constants */
    public static final int XR_HAND_JOINT_COUNT_EXT = 26;

    protected EXTHandTracking() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateHandTrackerEXT ] ---

    /** Unsafe version of: {@link #xrCreateHandTrackerEXT CreateHandTrackerEXT} */
    public static int nxrCreateHandTrackerEXT(XrSession session, long createInfo, long handTracker) {
        long __functionAddress = session.getCapabilities().xrCreateHandTrackerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, handTracker, __functionAddress);
    }

    /**
     * Create a hand joints handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>An application can create an {@code XrHandTrackerEXT} handle using {@link #xrCreateHandTrackerEXT CreateHandTrackerEXT} function.</p>
     * 
     * <pre><code>
     * XrResult xrCreateHandTrackerEXT(
     *     XrSession                                   session,
     *     const XrHandTrackerCreateInfoEXT*           createInfo,
     *     XrHandTrackerEXT*                           handTracker);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTHandTracking XR_EXT_hand_tracking} extension <b>must</b> be enabled prior to calling {@link #xrCreateHandTrackerEXT CreateHandTrackerEXT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrHandTrackerCreateInfoEXT} structure</li>
     * <li>{@code handTracker} <b>must</b> be a pointer to an {@code XrHandTrackerEXT} handle</li>
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
     * <p>If the system does not support hand tracking, runtime <b>must</b> return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} from {@link #xrCreateHandTrackerEXT CreateHandTrackerEXT}. In this case, the runtime <b>must</b> return {@link XR10#XR_FALSE FALSE} for {@code supportsHandTracking} in {@link XrSystemHandTrackingPropertiesEXT} when the function {@link XR10#xrGetSystemProperties GetSystemProperties} is called, so that the application <b>can</b> avoid creating a hand tracker.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrHandTrackerCreateInfoEXT}</p>
     *
     * @param session     an {@code XrSession} in which the hand tracker will be active.
     * @param createInfo  the {@link XrHandTrackerCreateInfoEXT} used to specify the hand tracker.
     * @param handTracker the returned {@code XrHandTrackerEXT} handle.
     */
    @NativeType("XrResult")
    public static int xrCreateHandTrackerEXT(XrSession session, @NativeType("XrHandTrackerCreateInfoEXT const *") XrHandTrackerCreateInfoEXT createInfo, @NativeType("XrHandTrackerEXT *") PointerBuffer handTracker) {
        if (CHECKS) {
            check(handTracker, 1);
        }
        return nxrCreateHandTrackerEXT(session, createInfo.address(), memAddress(handTracker));
    }

    // --- [ xrDestroyHandTrackerEXT ] ---

    /**
     * Destroy a hand joints handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>{@link #xrDestroyHandTrackerEXT DestroyHandTrackerEXT} function releases the {@code handTracker} and the underlying resources when finished with hand tracking experiences.</p>
     * 
     * <pre><code>
     * XrResult xrDestroyHandTrackerEXT(
     *     XrHandTrackerEXT                            handTracker);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTHandTracking XR_EXT_hand_tracking} extension <b>must</b> be enabled prior to calling {@link #xrDestroyHandTrackerEXT DestroyHandTrackerEXT}</li>
     * <li>{@code handTracker} <b>must</b> be a valid {@code XrHandTrackerEXT} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code handTracker}, and any child handles, <b>must</b> be externally synchronized</li>
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
     * @param handTracker an {@code XrHandTrackerEXT} previously created by {@link #xrCreateHandTrackerEXT CreateHandTrackerEXT}.
     */
    @NativeType("XrResult")
    public static int xrDestroyHandTrackerEXT(XrHandTrackerEXT handTracker) {
        long __functionAddress = handTracker.getCapabilities().xrDestroyHandTrackerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(handTracker.address(), __functionAddress);
    }

    // --- [ xrLocateHandJointsEXT ] ---

    /** Unsafe version of: {@link #xrLocateHandJointsEXT LocateHandJointsEXT} */
    public static int nxrLocateHandJointsEXT(XrHandTrackerEXT handTracker, long locateInfo, long locations) {
        long __functionAddress = handTracker.getCapabilities().xrLocateHandJointsEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrHandJointsLocateInfoEXT.validate(locateInfo);
        }
        return callPPPI(handTracker.address(), locateInfo, locations, __functionAddress);
    }

    /**
     * Locate hand joint locations.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrLocateHandJointsEXT LocateHandJointsEXT} function locates an array of hand joints to a base space at given time.</p>
     * 
     * <pre><code>
     * XrResult xrLocateHandJointsEXT(
     *     XrHandTrackerEXT                            handTracker,
     *     const XrHandJointsLocateInfoEXT*            locateInfo,
     *     XrHandJointLocationsEXT*                    locations);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTHandTracking XR_EXT_hand_tracking} extension <b>must</b> be enabled prior to calling {@link #xrLocateHandJointsEXT LocateHandJointsEXT}</li>
     * <li>{@code handTracker} <b>must</b> be a valid {@code XrHandTrackerEXT} handle</li>
     * <li>{@code locateInfo} <b>must</b> be a pointer to a valid {@link XrHandJointsLocateInfoEXT} structure</li>
     * <li>{@code locations} <b>must</b> be a pointer to an {@link XrHandJointLocationsEXT} structure</li>
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
     * <p>{@link XrHandJointLocationsEXT}, {@link XrHandJointsLocateInfoEXT}</p>
     *
     * @param handTracker an {@code XrHandTrackerEXT} previously created by {@link #xrCreateHandTrackerEXT CreateHandTrackerEXT}.
     * @param locateInfo  a pointer to {@link XrHandJointsLocateInfoEXT} describing information to locate hand joints.
     * @param locations   a pointer to {@link XrHandJointLocationsEXT} receiving the returned hand joint locations.
     */
    @NativeType("XrResult")
    public static int xrLocateHandJointsEXT(XrHandTrackerEXT handTracker, @NativeType("XrHandJointsLocateInfoEXT const *") XrHandJointsLocateInfoEXT locateInfo, @NativeType("XrHandJointLocationsEXT *") XrHandJointLocationsEXT locations) {
        return nxrLocateHandJointsEXT(handTracker, locateInfo.address(), locations.address());
    }

}