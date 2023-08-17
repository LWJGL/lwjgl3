/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_EXT_hand_tracking_data_source">XR_EXT_hand_tracking_data_source</a> extension.
 * 
 * <p>This extension augments the {@link EXTHandTracking XR_EXT_hand_tracking} extension.</p>
 * 
 * <p>Runtimes <b>may</b> support a variety of data sources for hand joint data for {@link EXTHandTracking XR_EXT_hand_tracking}, and some runtimes and devices <b>may</b> use joint data from multiple sources. This extension allows an application and the runtime to communicate about and make use of those data sources in a cooperative manner.</p>
 * 
 * <p>This extension allows the application to specify the data sources that it wants data from when creating a hand tracking handle, and allows the runtime to specify the currently active data source.</p>
 * 
 * <p>The application <b>must</b> enable the {@link EXTHandTracking XR_EXT_hand_tracking} extension in order to use this extension.</p>
 */
public final class EXTHandTrackingDataSource {

    /** The extension specification version. */
    public static final int XR_EXT_hand_tracking_data_source_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_EXT_HAND_TRACKING_DATA_SOURCE_EXTENSION_NAME = "XR_EXT_hand_tracking_data_source";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_HAND_TRACKING_DATA_SOURCE_INFO_EXT TYPE_HAND_TRACKING_DATA_SOURCE_INFO_EXT}</li>
     * <li>{@link #XR_TYPE_HAND_TRACKING_DATA_SOURCE_STATE_EXT TYPE_HAND_TRACKING_DATA_SOURCE_STATE_EXT}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_HAND_TRACKING_DATA_SOURCE_INFO_EXT  = 1000428000,
        XR_TYPE_HAND_TRACKING_DATA_SOURCE_STATE_EXT = 1000428001;

    /**
     * XrHandTrackingDataSourceEXT - Describes the hand tracking data source.
     * 
     * <h5>Description</h5>
     * 
     * <p>The application <b>can</b> use {@code XrHandTrackingDataSourceEXT} with {@link XrHandTrackingDataSourceInfoEXT} when calling {@link EXTHandTracking#xrCreateHandTrackerEXT CreateHandTrackerEXT} to tell the runtime all supported data sources for the application for the hand tracking inputs.</p>
     * 
     * <p>The application <b>can</b> use it with {@link XrHandTrackingDataSourceStateEXT} when calling {@link EXTHandTracking#xrLocateHandJointsEXT LocateHandJointsEXT} to inspect what data source the runtime used for the returned hand joint locations.</p>
     * 
     * <p>If the {@link EXTHandJointsMotionRange XR_EXT_hand_joints_motion_range} extension is supported by the runtime and the data source is {@link #XR_HAND_TRACKING_DATA_SOURCE_CONTROLLER_EXT HAND_TRACKING_DATA_SOURCE_CONTROLLER_EXT}, then it is expected that application will use that extension when retrieving hand joint poses.</p>
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_HAND_TRACKING_DATA_SOURCE_UNOBSTRUCTED_EXT HAND_TRACKING_DATA_SOURCE_UNOBSTRUCTED_EXT} - This data source value indicates that the hand tracking data source supports using individual fingers and joints separately. Examples of such sources include optical hand tracking, data gloves, or motion capture devices.</li>
     * <li>{@link #XR_HAND_TRACKING_DATA_SOURCE_CONTROLLER_EXT HAND_TRACKING_DATA_SOURCE_CONTROLLER_EXT} - This data source value indicates that the hand tracking data source is a motion controller. The runtime <b>must</b> not supply this data source if the controller providing the data is not actively held in the user’s hand, but <b>may</b> still provide data if the runtime is unable to detect if the controller is not in the user’s hand, or a user selected policy changes this behavior. Unless specified otherwise by another extension, data returned from {@link #XR_HAND_TRACKING_DATA_SOURCE_CONTROLLER_EXT HAND_TRACKING_DATA_SOURCE_CONTROLLER_EXT} <b>must</b> behave as {@link EXTHandJointsMotionRange#XR_HAND_JOINTS_MOTION_RANGE_UNOBSTRUCTED_EXT HAND_JOINTS_MOTION_RANGE_UNOBSTRUCTED_EXT}.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrHandTrackingDataSourceInfoEXT}, {@link XrHandTrackingDataSourceStateEXT}, {@link EXTHandTracking#xrCreateHandTrackerEXT CreateHandTrackerEXT}, {@link EXTHandTracking#xrLocateHandJointsEXT LocateHandJointsEXT}</p>
     */
    public static final int
        XR_HAND_TRACKING_DATA_SOURCE_UNOBSTRUCTED_EXT = 1,
        XR_HAND_TRACKING_DATA_SOURCE_CONTROLLER_EXT   = 2;

    private EXTHandTrackingDataSource() {}

}