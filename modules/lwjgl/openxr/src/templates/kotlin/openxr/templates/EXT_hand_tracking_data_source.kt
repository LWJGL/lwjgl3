/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_hand_tracking_data_source = "EXTHandTrackingDataSource".nativeClassXR("EXT_hand_tracking_data_source", type = "instance", postfix = "EXT") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_EXT_hand_tracking_data_source">XR_EXT_hand_tracking_data_source</a> extension.

        This extension augments the {@link EXTHandTracking XR_EXT_hand_tracking} extension.

        Runtimes <b>may</b> support a variety of data sources for hand joint data for {@link EXTHandTracking XR_EXT_hand_tracking}, and some runtimes and devices <b>may</b> use joint data from multiple sources. This extension allows an application and the runtime to communicate about and make use of those data sources in a cooperative manner.

        This extension allows the application to specify the data sources that it wants data from when creating a hand tracking handle, and allows the runtime to specify the currently active data source.

        The application <b>must</b> enable the {@link EXTHandTracking XR_EXT_hand_tracking} extension in order to use this extension.
        """

    IntConstant(
        "The extension specification version.",

        "EXT_hand_tracking_data_source_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_HAND_TRACKING_DATA_SOURCE_EXTENSION_NAME".."XR_EXT_hand_tracking_data_source"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_HAND_TRACKING_DATA_SOURCE_INFO_EXT".."1000428000",
        "TYPE_HAND_TRACKING_DATA_SOURCE_STATE_EXT".."1000428001"
    )

    EnumConstant(
        """
        XrHandTrackingDataSourceEXT - Describes the hand tracking data source.

        <h5>Description</h5>
        The application <b>can</b> use {@code XrHandTrackingDataSourceEXT} with ##XrHandTrackingDataSourceInfoEXT when calling #CreateHandTrackerEXT() to tell the runtime all supported data sources for the application for the hand tracking inputs.

        The application <b>can</b> use it with ##XrHandTrackingDataSourceStateEXT when calling #LocateHandJointsEXT() to inspect what data source the runtime used for the returned hand joint locations.

        If the {@link EXTHandJointsMotionRange XR_EXT_hand_joints_motion_range} extension is supported by the runtime and the data source is #HAND_TRACKING_DATA_SOURCE_CONTROLLER_EXT, then it is expected that application will use that extension when retrieving hand joint poses.

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#HAND_TRACKING_DATA_SOURCE_UNOBSTRUCTED_EXT - This data source value indicates that the hand tracking data source supports using individual fingers and joints separately. Examples of such sources include optical hand tracking, data gloves, or motion capture devices.</li>
            <li>#HAND_TRACKING_DATA_SOURCE_CONTROLLER_EXT - This data source value indicates that the hand tracking data source is a motion controller. The runtime <b>must</b> not supply this data source if the controller providing the data is not actively held in the user’s hand, but <b>may</b> still provide data if the runtime is unable to detect if the controller is not in the user’s hand, or a user selected policy changes this behavior. Unless specified otherwise by another extension, data returned from #HAND_TRACKING_DATA_SOURCE_CONTROLLER_EXT <b>must</b> behave as #HAND_JOINTS_MOTION_RANGE_UNOBSTRUCTED_EXT.</li>
        </ul>

        <h5>See Also</h5>
        ##XrHandTrackingDataSourceInfoEXT, ##XrHandTrackingDataSourceStateEXT, #CreateHandTrackerEXT(), #LocateHandJointsEXT()
        """,

        "HAND_TRACKING_DATA_SOURCE_UNOBSTRUCTED_EXT".."1",
        "HAND_TRACKING_DATA_SOURCE_CONTROLLER_EXT".."2"
    )
}