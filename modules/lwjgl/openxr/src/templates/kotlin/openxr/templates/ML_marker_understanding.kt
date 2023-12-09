/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ML_marker_understanding = "MLMarkerUnderstanding".nativeClassXR("ML_marker_understanding", type = "instance", postfix = "ML") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_ML_marker_understanding">XR_ML_marker_understanding</a> extension.

        This extension <b>can</b> be used to track and query fiducial markers like QR codes, AprilTag markers, and ArUco markers, and detect, but not locate, 1D barcodes like Code 128, UPC-A.

        <h5>Permissions</h5>
        Android applications <b>must</b> have the {@code com.magicleap.permission.MARKER_TRACKING} permission listed in their manifest to use this extension. (protection level: normal)
        """

    IntConstant(
        "The extension specification version.",

        "ML_marker_understanding_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "ML_MARKER_UNDERSTANDING_EXTENSION_NAME".."XR_ML_marker_understanding"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_MARKER_DETECTOR_ML".."1000138000"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SYSTEM_MARKER_UNDERSTANDING_PROPERTIES_ML".."1000138000",
        "TYPE_MARKER_DETECTOR_CREATE_INFO_ML".."1000138001",
        "TYPE_MARKER_DETECTOR_ARUCO_INFO_ML".."1000138002",
        "TYPE_MARKER_DETECTOR_SIZE_INFO_ML".."1000138003",
        "TYPE_MARKER_DETECTOR_APRIL_TAG_INFO_ML".."1000138004",
        "TYPE_MARKER_DETECTOR_CUSTOM_PROFILE_INFO_ML".."1000138005",
        "TYPE_MARKER_DETECTOR_SNAPSHOT_INFO_ML".."1000138006",
        "TYPE_MARKER_DETECTOR_STATE_ML".."1000138007",
        "TYPE_MARKER_SPACE_CREATE_INFO_ML".."1000138008"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_MARKER_DETECTOR_PERMISSION_DENIED_ML".."-1000138000",
        "ERROR_MARKER_DETECTOR_LOCATE_FAILED_ML".."-1000138001",
        "ERROR_MARKER_DETECTOR_INVALID_DATA_QUERY_ML".."-1000138002",
        "ERROR_MARKER_DETECTOR_INVALID_CREATE_INFO_ML".."-1000138003",
        "ERROR_MARKER_INVALID_ML".."-1000138004"
    )

    EnumConstant(
        """
        XrMarkerDetectorProfileML - The possible premade profiles for an {@code XrMarkerDetectorML}

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#MARKER_DETECTOR_PROFILE_DEFAULT_ML — Tracker profile that covers standard use cases. If this does not suite the needs of the application try the other profiles listed below.</li>
            <li>#MARKER_DETECTOR_PROFILE_SPEED_ML — Optimized for speed. Use this profile to reduce the compute load and increase detection/tracker speed. This can result in low accuracy poses.</li>
            <li>#MARKER_DETECTOR_PROFILE_ACCURACY_ML — Optimized for accuracy. Use this profile to optimize for accurate marker poses. This can cause increased load on the compute.</li>
            <li>#MARKER_DETECTOR_PROFILE_SMALL_TARGETS_ML — Optimized for small targets. Use this profile to optimize for markers that are small or for larger markers that need to be detected from afar.</li>
            <li>#MARKER_DETECTOR_PROFILE_LARGE_FOV_ML — Optimized for FoV. Use this profile to be able to detect markers across a larger FoV. The marker tracker system will attempt to use multiple cameras to detect the markers.</li>
            <li>#MARKER_DETECTOR_PROFILE_CUSTOM_ML — Custom Tracker Profile. The application can define a custom tracker profile. See ##XrMarkerDetectorCustomProfileInfoML for more details.</li>
        </ul>

        <h5>See Also</h5>
        ##XrMarkerDetectorCreateInfoML
        """,

        "MARKER_DETECTOR_PROFILE_DEFAULT_ML".."0",
        "MARKER_DETECTOR_PROFILE_SPEED_ML".."1",
        "MARKER_DETECTOR_PROFILE_ACCURACY_ML".."2",
        "MARKER_DETECTOR_PROFILE_SMALL_TARGETS_ML".."3",
        "MARKER_DETECTOR_PROFILE_LARGE_FOV_ML".."4",
        "MARKER_DETECTOR_PROFILE_CUSTOM_ML".."5"
    )

    EnumConstant(
        """
        XrMarkerTypeML - The type of marker to be tracked by an {@code XrMarkerDetectorML}

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#MARKER_TYPE_ARUCO_ML — Aruco Marker detection and localization. The marker id of the Aruco marker is available via #GetMarkerNumberML().</li>
            <li>#MARKER_TYPE_APRIL_TAG_ML — AprilTag detection and localization. The marker id of the AprilTags is available via #GetMarkerNumberML().</li>
            <li>#MARKER_TYPE_QR_ML — QR code detection and localization. The contents of the QR code is available via #GetMarkerStringML().</li>
            <li>#MARKER_TYPE_EAN_13_ML — EAN-13, detection only, not locatable. The contents of the barcode is available via #GetMarkerStringML().</li>
            <li>#MARKER_TYPE_UPC_A_ML — UPC-A, detection only, not locatable. The contents of the barcode is available via #GetMarkerStringML().</li>
            <li>#MARKER_TYPE_CODE_128_ML — Code 128, detection only, not locatable. The contents of the barcode is available via #GetMarkerStringML().</li>
        </ul>

        <h5>See Also</h5>
        ##XrMarkerDetectorCreateInfoML
        """,

        "MARKER_TYPE_ARUCO_ML".."0",
        "MARKER_TYPE_APRIL_TAG_ML".."1",
        "MARKER_TYPE_QR_ML".."2",
        "MARKER_TYPE_EAN_13_ML".."3",
        "MARKER_TYPE_UPC_A_ML".."4",
        "MARKER_TYPE_CODE_128_ML".."5"
    )

    EnumConstant(
        """
        XrMarkerArucoDictML - ArUco dictionaries

        <h5>Description</h5>
        Supported predefined ArUco dictionary:

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#MARKER_ARUCO_DICT_4X4_50_ML — 4 by 4 pixel Aruco marker dictionary with 50 IDs.</li>
            <li>#MARKER_ARUCO_DICT_4X4_100_ML — 4 by 4 pixel Aruco marker dictionary with 100 IDs.</li>
            <li>#MARKER_ARUCO_DICT_4X4_250_ML — 4 by 4 pixel Aruco marker dictionary with 250 IDs.</li>
            <li>#MARKER_ARUCO_DICT_4X4_1000_ML — 4 by 4 pixel Aruco marker dictionary with 1000 IDs.</li>
            <li>#MARKER_ARUCO_DICT_5X5_50_ML — 5 by 5 pixel Aruco marker dictionary with 50 IDs.</li>
            <li>#MARKER_ARUCO_DICT_5X5_100_ML — 5 by 5 pixel Aruco marker dictionary with 100 IDs.</li>
            <li>#MARKER_ARUCO_DICT_5X5_250_ML — 5 by 5 pixel Aruco marker dictionary with 250 IDs.</li>
            <li>#MARKER_ARUCO_DICT_5X5_1000_ML — 5 by 5 pixel Aruco marker dictionary with 1000 IDs.</li>
            <li>#MARKER_ARUCO_DICT_6X6_50_ML — 6 by 6 pixel Aruco marker dictionary with 50 IDs.</li>
            <li>#MARKER_ARUCO_DICT_6X6_100_ML — 6 by 6 pixel Aruco marker dictionary with 100 IDs.</li>
            <li>#MARKER_ARUCO_DICT_6X6_250_ML — 6 by 6 pixel Aruco marker dictionary with 250 IDs.</li>
            <li>#MARKER_ARUCO_DICT_6X6_1000_ML — 6 by 6 pixel Aruco marker dictionary with 1000 IDs.</li>
            <li>#MARKER_ARUCO_DICT_7X7_50_ML — 7 by 7 pixel Aruco marker dictionary with 50 IDs.</li>
            <li>#MARKER_ARUCO_DICT_7X7_100_ML — 7 by 7 pixel Aruco marker dictionary with 100 IDs.</li>
            <li>#MARKER_ARUCO_DICT_7X7_250_ML — 7 by 7 pixel Aruco marker dictionary with 250 IDs.</li>
            <li>#MARKER_ARUCO_DICT_7X7_1000_ML — 7 by 7 pixel Aruco marker dictionary with 1000 IDs.</li>
        </ul>

        <h5>See Also</h5>
        ##XrMarkerDetectorArucoInfoML
        """,

        "MARKER_ARUCO_DICT_4X4_50_ML".."0",
        "MARKER_ARUCO_DICT_4X4_100_ML".."1",
        "MARKER_ARUCO_DICT_4X4_250_ML".."2",
        "MARKER_ARUCO_DICT_4X4_1000_ML".."3",
        "MARKER_ARUCO_DICT_5X5_50_ML".."4",
        "MARKER_ARUCO_DICT_5X5_100_ML".."5",
        "MARKER_ARUCO_DICT_5X5_250_ML".."6",
        "MARKER_ARUCO_DICT_5X5_1000_ML".."7",
        "MARKER_ARUCO_DICT_6X6_50_ML".."8",
        "MARKER_ARUCO_DICT_6X6_100_ML".."9",
        "MARKER_ARUCO_DICT_6X6_250_ML".."10",
        "MARKER_ARUCO_DICT_6X6_1000_ML".."11",
        "MARKER_ARUCO_DICT_7X7_50_ML".."12",
        "MARKER_ARUCO_DICT_7X7_100_ML".."13",
        "MARKER_ARUCO_DICT_7X7_250_ML".."14",
        "MARKER_ARUCO_DICT_7X7_1000_ML".."15"
    )

    EnumConstant(
        """
        XrMarkerAprilTagDictML - AprilTag dictionaries

        <h5>Description</h5>
        Supported predefined AprilTag dictionary:

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#MARKER_APRIL_TAG_DICT_16H5_ML — 4 by 4 bits, minimum Hamming distance between any two codes = 5, 30 codes.</li>
            <li>#MARKER_APRIL_TAG_DICT_25H9_ML — 5 by 5 bits, minimum Hamming distance between any two codes = 9, 35 codes.</li>
            <li>#MARKER_APRIL_TAG_DICT_36H10_ML — 6 by 6 bits, minimum Hamming distance between any two codes = 10, 2320 codes.</li>
            <li>#MARKER_APRIL_TAG_DICT_36H11_ML — 6 by 6 bits, minimum Hamming distance between any two codes = 11, 587 codes.</li>
        </ul>

        <h5>See Also</h5>
        ##XrMarkerDetectorAprilTagInfoML
        """,

        "MARKER_APRIL_TAG_DICT_16H5_ML".."0",
        "MARKER_APRIL_TAG_DICT_25H9_ML".."1",
        "MARKER_APRIL_TAG_DICT_36H10_ML".."2",
        "MARKER_APRIL_TAG_DICT_36H11_ML".."3"
    )

    EnumConstant(
        """
        XrMarkerDetectorFpsML - Framerate hint used with a custom profile

        <h5>Description</h5>
        Used to hint to the back-end the max frames per second that <b>should</b> be analyzed.

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#MARKER_DETECTOR_FPS_LOW_ML — Low FPS.</li>
            <li>#MARKER_DETECTOR_FPS_MEDIUM_ML — Medium FPS.</li>
            <li>#MARKER_DETECTOR_FPS_HIGH_ML — High FPS.</li>
            <li>#MARKER_DETECTOR_FPS_MAX_ML — Max possible FPS.</li>
        </ul>

        <h5>See Also</h5>
        ##XrMarkerDetectorCustomProfileInfoML
        """,

        "MARKER_DETECTOR_FPS_LOW_ML".."0",
        "MARKER_DETECTOR_FPS_MEDIUM_ML".."1",
        "MARKER_DETECTOR_FPS_HIGH_ML".."2",
        "MARKER_DETECTOR_FPS_MAX_ML".."3"
    )

    EnumConstant(
        """
        XrMarkerDetectorResolutionML - Resolution hint used with a custom profile

        <h5>Description</h5>
        Used to hint to the back-end the resolution that <b>should</b> be used. CPU load is a combination of chosen {@code XrMarkerTypeML}, {@code XrMarkerDetectorFpsML}, and {@code XrMarkerDetectorResolutionML}.

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#MARKER_DETECTOR_RESOLUTION_LOW_ML — Low Resolution.</li>
            <li>#MARKER_DETECTOR_RESOLUTION_MEDIUM_ML — Medium Resolution.</li>
            <li>#MARKER_DETECTOR_RESOLUTION_HIGH_ML — High Resolution.</li>
        </ul>

        <h5>See Also</h5>
        ##XrMarkerDetectorCustomProfileInfoML
        """,

        "MARKER_DETECTOR_RESOLUTION_LOW_ML".."0",
        "MARKER_DETECTOR_RESOLUTION_MEDIUM_ML".."1",
        "MARKER_DETECTOR_RESOLUTION_HIGH_ML".."2"
    )

    EnumConstant(
        """
        XrMarkerDetectorCameraML - Camera hint

        <h5>Description</h5>
        The {@code XrMarkerDetectorCameraML} enum values are used to hint to the camera that <b>should</b> be used. This is set in the ##XrMarkerDetectorCustomProfileInfoML.

        The RGB camera has a higher resolution than world cameras and is better suited for use cases where the target to be tracked is small or needs to be detected from far away.

        #MARKER_DETECTOR_CAMERA_WORLD_CAMERAS_ML make use of multiple cameras to improve accuracy and increase the FoV for detection.

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#MARKER_DETECTOR_CAMERA_RGB_CAMERA_ML — Single RGB camera.</li>
            <li>#MARKER_DETECTOR_CAMERA_WORLD_CAMERAS_ML — One or more world cameras.</li>
        </ul>

        <h5>See Also</h5>
        ##XrMarkerDetectorCustomProfileInfoML
        """,

        "MARKER_DETECTOR_CAMERA_RGB_CAMERA_ML".."0",
        "MARKER_DETECTOR_CAMERA_WORLD_CAMERAS_ML".."1"
    )

    EnumConstant(
        """
        XrMarkerDetectorCornerRefineMethodML - Corner Refinement Method.

        <h5>Description</h5>
        The ArUco/AprilTag detector comes with several corner refinement methods. Choosing the right corner refinement method has an impact on the accuracy and speed trade-off that comes with each detection pipeline.

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#MARKER_DETECTOR_CORNER_REFINE_METHOD_NONE_ML — No refinement. Inaccurate corners.</li>
            <li>#MARKER_DETECTOR_CORNER_REFINE_METHOD_SUBPIX_ML — Subpixel refinement. Corners have subpixel coordinates. High detection rate, very fast, reasonable accuracy.</li>
            <li>#MARKER_DETECTOR_CORNER_REFINE_METHOD_CONTOUR_ML — Contour refinement. High detection rate, fast, reasonable accuracy.</li>
            <li>#MARKER_DETECTOR_CORNER_REFINE_METHOD_APRIL_TAG_ML — AprilTag refinement. Reasonable detection rate, slowest, but very accurate. Only valid with AprilTags.</li>
        </ul>

        <h5>See Also</h5>
        ##XrMarkerDetectorCustomProfileInfoML
        """,

        "MARKER_DETECTOR_CORNER_REFINE_METHOD_NONE_ML".."0",
        "MARKER_DETECTOR_CORNER_REFINE_METHOD_SUBPIX_ML".."1",
        "MARKER_DETECTOR_CORNER_REFINE_METHOD_CONTOUR_ML".."2",
        "MARKER_DETECTOR_CORNER_REFINE_METHOD_APRIL_TAG_ML".."3"
    )

    EnumConstant(
        """
        XrMarkerDetectorFullAnalysisIntervalML - Full Frame Analysis Time Interval.

        <h5>Description</h5>
        In order to improve performance, the detectors do not always run on the full frame. Full frame analysis is however necessary to detect new markers that were not detected before. Use this option to control how often the detector <b>should</b> detect new markers and its impact on tracking performance.

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_MAX_ML — Detector analyzes every frame fully.</li>
            <li>#MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_FAST_ML — Detector analyzes frame fully very often.</li>
            <li>#MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_MEDIUM_ML — Detector analyzes frame fully a few times per second.</li>
            <li>#MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_SLOW_ML — Detector analyzes frame fully about every second.</li>
        </ul>

        <h5>See Also</h5>
        ##XrMarkerDetectorCustomProfileInfoML
        """,

        "MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_MAX_ML".."0",
        "MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_FAST_ML".."1",
        "MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_MEDIUM_ML".."2",
        "MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_SLOW_ML".."3"
    )

    EnumConstant(
        """
        XrMarkerDetectorStatusML - Detector states

        <h5>Description</h5>
        The {@code XrMarkerDetectorStatusML} enumeration describes the current state of the marker detector. It is queried via #GetMarkerDetectorStateML() to determine if the marker tracker is currently available for inspection.

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#MARKER_DETECTOR_STATUS_PENDING_ML — The marker detector is working on a new snapshot.</li>
            <li>#MARKER_DETECTOR_STATUS_READY_ML — The marker detector is ready to be inspected.</li>
            <li>#MARKER_DETECTOR_STATUS_ERROR_ML — The marker detector has encountered a fatal error.</li>
        </ul>

        <h5>See Also</h5>
        ##XrMarkerDetectorStateML, #GetMarkerDetectorStateML()
        """,

        "MARKER_DETECTOR_STATUS_PENDING_ML".."0",
        "MARKER_DETECTOR_STATUS_READY_ML".."1",
        "MARKER_DETECTOR_STATUS_ERROR_ML".."2"
    )

    XrResult(
        "CreateMarkerDetectorML",
        """
        Create a marker detection handle.

        <h5>C Specification</h5>
        The #CreateMarkerDetectorML() function is defined as:

        <pre><code>
￿XrResult xrCreateMarkerDetectorML(
￿    XrSession                                   session,
￿    const XrMarkerDetectorCreateInfoML*         createInfo,
￿    XrMarkerDetectorML*                         markerDetector);</code></pre>

        <h5>Description</h5>
        If a runtime is unable to create a marker detector due to some internal limit, the runtime <b>must</b> return #ERROR_LIMIT_REACHED.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLMarkerUnderstanding XR_ML_marker_understanding} extension <b>must</b> be enabled prior to calling #CreateMarkerDetectorML()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrMarkerDetectorCreateInfoML structure</li>
            <li>{@code markerDetector} <b>must</b> be a pointer to an {@code XrMarkerDetectorML} handle</li>
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
                <li>#ERROR_MARKER_DETECTOR_PERMISSION_DENIED_ML</li>
                <li>#ERROR_MARKER_DETECTOR_INVALID_CREATE_INFO_ML</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrMarkerDetectorCreateInfoML, #DestroyMarkerDetectorML(), #GetMarkerDetectorStateML(), #GetMarkersML(), #SnapshotMarkerDetectorML()
        """,

        XrSession("session", ""),
        XrMarkerDetectorCreateInfoML.const.p("createInfo", ""),
        Check(1)..XrMarkerDetectorML.p("markerDetector", "")
    )

    XrResult(
        "DestroyMarkerDetectorML",
        """
        Destroy a marker detection handle.

        <h5>C Specification</h5>
        The #DestroyMarkerDetectorML() function is defined as:

        <pre><code>
￿XrResult xrDestroyMarkerDetectorML(
￿    XrMarkerDetectorML                          markerDetector);</code></pre>

        <h5>Description</h5>
        Destroy a marker detection handle.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLMarkerUnderstanding XR_ML_marker_understanding} extension <b>must</b> be enabled prior to calling #DestroyMarkerDetectorML()</li>
            <li>{@code markerDetector} <b>must</b> be a valid {@code XrMarkerDetectorML} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code markerDetector}, and any child handles, <b>must</b> be externally synchronized</li>
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
        #CreateMarkerDetectorML()
        """,

        XrMarkerDetectorML("markerDetector", "object to destroy.")
    )

    XrResult(
        "SnapshotMarkerDetectorML",
        """
        Request a snapshot from the marker detector.

        <h5>C Specification</h5>
        The #SnapshotMarkerDetectorML() function is defined as:

        <pre><code>
￿XrResult xrSnapshotMarkerDetectorML(
￿    XrMarkerDetectorML                          markerDetector,
￿    XrMarkerDetectorSnapshotInfoML*             snapshotInfo);</code></pre>

        <h5>Description</h5>
        Collects the latest marker detector state and makes it ready for inspection. This function only snapshots the non-pose state of markers. Once called, and if a new snapshot is not yet available a runtime <b>must</b> set the state of the marker detector to #MARKER_DETECTOR_STATUS_PENDING_ML. If a new state is available the runtime <b>must</b> set the state to #MARKER_DETECTOR_STATUS_READY_ML. If an error occurred the runtime <b>must</b> set the state to #MARKER_DETECTOR_STATUS_ERROR_ML. The application <b>may</b> attempt the snapshot again.

        Once the application has inspected the state it is interested in it <b>can</b> call this function again and the state is set to #MARKER_DETECTOR_STATUS_PENDING_ML until a new state has been snapshotted. After each snapshot, only the currently detected markers are available for inspection, though the same marker <b>may</b> repeatedly be detected across snapshots.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLMarkerUnderstanding XR_ML_marker_understanding} extension <b>must</b> be enabled prior to calling #SnapshotMarkerDetectorML()</li>
            <li>{@code markerDetector} <b>must</b> be a valid {@code XrMarkerDetectorML} handle</li>
            <li>{@code snapshotInfo} <b>must</b> be a pointer to an ##XrMarkerDetectorSnapshotInfoML structure</li>
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
        ##XrMarkerDetectorSnapshotInfoML
        """,

        XrMarkerDetectorML("markerDetector", "object to issue a snapshot request to."),
        XrMarkerDetectorSnapshotInfoML.p("snapshotInfo", "a pointer to ##XrMarkerDetectorSnapshotInfoML containing marker snapshot parameters.")
    )

    XrResult(
        "GetMarkerDetectorStateML",
        """
        Get the current state of the marker detector.

        <h5>C Specification</h5>
        The #GetMarkerDetectorStateML() function is defined as:

        <pre><code>
￿XrResult xrGetMarkerDetectorStateML(
￿    XrMarkerDetectorML                          markerDetector,
￿    XrMarkerDetectorStateML*                    state);</code></pre>

        <h5>Description</h5>
        #GetMarkerDetectorStateML() is used after calling #SnapshotMarkerDetectorML() to check the current status of the snapshot in progress. When ##XrMarkerDetectorStateML{@code ::state} == #MARKER_DETECTOR_STATUS_READY_ML, the detector is ready to be queried, while #MARKER_DETECTOR_STATUS_PENDING_ML indicates the snapshot is still in progress. #MARKER_DETECTOR_STATUS_ERROR_ML indicates that the runtime has encountered an error getting a snapshot for the requested detector, which <b>may</b> require user intervention to solve.

        If #SnapshotMarkerDetectorML() has not yet been called for the {@code markerDetector}, the runtime <b>must</b> return #ERROR_CALL_ORDER_INVALID.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLMarkerUnderstanding XR_ML_marker_understanding} extension <b>must</b> be enabled prior to calling #GetMarkerDetectorStateML()</li>
            <li>{@code markerDetector} <b>must</b> be a valid {@code XrMarkerDetectorML} handle</li>
            <li>{@code state} <b>must</b> be a pointer to an ##XrMarkerDetectorStateML structure</li>
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
                <li>#ERROR_CALL_ORDER_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrMarkerDetectorStateML
        """,

        XrMarkerDetectorML("markerDetector", "object to retrieve state information from."),
        XrMarkerDetectorStateML.p("state", "points to an ##XrMarkerDetectorStateML in which the current state of the marker detector is returned.")
    )

    XrResult(
        "GetMarkersML",
        """
        Examine marker detection snapshot.

        <h5>C Specification</h5>
        The #GetMarkersML() function is defined as:

        <pre><code>
￿XrResult xrGetMarkersML(
￿    XrMarkerDetectorML                          markerDetector,
￿    uint32_t                                    markerCapacityInput,
￿    uint32_t*                                   markerCountOutput,
￿    XrMarkerML*                                 markers);</code></pre>

        <h5>Description</h5>
        Get the list of current snapshotted marker atoms, <b>must</b> only be called when the state of the detector is #MARKER_DETECTOR_STATUS_READY_ML.

        If #GetMarkerDetectorStateML() has not been called and returned #MARKER_DETECTOR_STATUS_READY_ML since the last invocation of #SnapshotMarkerDetectorML(), the runtime <b>must</b> return #ERROR_CALL_ORDER_INVALID.

        The returned atoms are only valid while in the #MARKER_DETECTOR_STATUS_READY_ML state. The runtime <b>must</b> return the same atom value for the same uniquely identifiable marker across successive snapshots. It is unspecified what happens if the detector is observing two markers with the same identification patterns.

        Assuming the same set of markers are in view across several snapshots, the runtime <b>should</b> return the same set of atoms. An application <b>can</b> use the list of atoms as a simple test for if a particular marker has gone in or out of view.

        Note that {@code XrMarkerML} atoms are only usable with the {@code XrMarkerDetectorML} that returned them.

        This function follows the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#buffer-size-parameters">two-call idiom</a> for filling the {@code markers}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLMarkerUnderstanding XR_ML_marker_understanding} extension <b>must</b> be enabled prior to calling #GetMarkersML()</li>
            <li>{@code markerDetector} <b>must</b> be a valid {@code XrMarkerDetectorML} handle</li>
            <li>{@code markerCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code markerCapacityInput} is not 0, {@code markers} <b>must</b> be a pointer to an array of {@code markerCapacityInput} {@code XrMarkerML} values</li>
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
                <li>#ERROR_CALL_ORDER_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #CreateMarkerSpaceML(), #GetMarkerNumberML(), #GetMarkerReprojectionErrorML(), #GetMarkerStringML()
        """,

        XrMarkerDetectorML("markerDetector", "the detector object to retrieve marker information from."),
        AutoSize("markers")..uint32_t("markerCapacityInput", "the capacity of the {@code markers} array or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("markerCountOutput", "filled in by the runtime with the count of marker atoms written or the required capacity in the case that {@code markerCapacityInput} is insufficient."),
        nullable..XrMarkerML.p("markers", "a pointer to an array of {@code XrMarkerML} atoms, but <b>can</b> be {@code NULL} if propertyCapacityInput is 0.")
    )

    XrResult(
        "GetMarkerReprojectionErrorML",
        """
        Get the reprojection error of a marker.

        <h5>C Specification</h5>
        The #GetMarkerReprojectionErrorML() function is defined as:

        <pre><code>
￿XrResult xrGetMarkerReprojectionErrorML(
￿    XrMarkerDetectorML                          markerDetector,
￿    XrMarkerML                                  marker,
￿    float*                                      reprojectionErrorMeters);</code></pre>

        <h5>Description</h5>
        Get the reprojection error of a marker, only available for certain types of markers. <b>must</b> only be called when the state of the detector is #MARKER_DETECTOR_STATUS_READY_ML.

        If #GetMarkerDetectorStateML() has not been called and returned #MARKER_DETECTOR_STATUS_READY_ML since the last invocation of #SnapshotMarkerDetectorML(), the runtime <b>must</b> return #ERROR_CALL_ORDER_INVALID.

        A high reprojection error means that the estimated pose of the marker does not match well with the 2D detection on the processed video frame and thus the pose <b>may</b> be inaccurate. The error is given in meters, representing the displacement between real marker and its estimated pose. This means this is a normalized number, independent of marker distance or length.

        The runtime <b>must</b> return #ERROR_MARKER_INVALID_ML if the marker atom is invalid.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLMarkerUnderstanding XR_ML_marker_understanding} extension <b>must</b> be enabled prior to calling #GetMarkerReprojectionErrorML()</li>
            <li>{@code markerDetector} <b>must</b> be a valid {@code XrMarkerDetectorML} handle</li>
            <li>{@code reprojectionErrorMeters} <b>must</b> be a pointer to a {@code float} value</li>
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
                <li>#ERROR_MARKER_INVALID_ML</li>
                <li>#ERROR_CALL_ORDER_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #GetMarkersML()
        """,

        XrMarkerDetectorML("markerDetector", "the detector object to retrieve marker information from."),
        XrMarkerML("marker", "the marker atom to be examined."),
        Check(1)..float.p("reprojectionErrorMeters", "points to a {@code float} in which the estimated reprojection error in meters is returned.")
    )

    XrResult(
        "GetMarkerLengthML",
        """
        Query for the length of a marker.

        <h5>C Specification</h5>
        The #GetMarkerLengthML() function is defined as:

        <pre><code>
￿XrResult xrGetMarkerLengthML(
￿    XrMarkerDetectorML                          markerDetector,
￿    XrMarkerML                                  marker,
￿    float*                                      meters);</code></pre>

        <h5>Description</h5>
        Get the size of the marker, defined as the length in meters per side. If the application created the detector while passing in a ##XrMarkerDetectorSizeInfoML, this query <b>may</b> be redundant. #GetMarkerLengthML() is primarily intended to query for a runtime estimated size when an application did not indicate the expected size via ##XrMarkerDetectorSizeInfoML.

        #GetMarkerLengthML() <b>must</b> only be called when the state of the detector is #MARKER_DETECTOR_STATUS_READY_ML. If #GetMarkerDetectorStateML() has not been called and returned #MARKER_DETECTOR_STATUS_READY_ML since the last invocation of #SnapshotMarkerDetectorML(), the runtime <b>must</b> return #ERROR_CALL_ORDER_INVALID.

        The runtime <b>must</b> return #ERROR_MARKER_INVALID_ML if the marker atom is invalid.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLMarkerUnderstanding XR_ML_marker_understanding} extension <b>must</b> be enabled prior to calling #GetMarkerLengthML()</li>
            <li>{@code markerDetector} <b>must</b> be a valid {@code XrMarkerDetectorML} handle</li>
            <li>{@code meters} <b>must</b> be a pointer to a {@code float} value</li>
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
                <li>#ERROR_MARKER_INVALID_ML</li>
                <li>#ERROR_CALL_ORDER_INVALID</li>
            </ul></dd>
        </dl>
        """,

        XrMarkerDetectorML("markerDetector", "the detector object to retrieve marker information from."),
        XrMarkerML("marker", "the marker atom to be examined."),
        Check(1)..float.p("meters", "points to a {@code float} in which the size per side of the queried marker is returned.")
    )

    XrResult(
        "GetMarkerNumberML",
        """
        Get the number of a marker, such as the ArUco ID.

        <h5>C Specification</h5>
        The #GetMarkerNumberML() function is defined as:

        <pre><code>
￿XrResult xrGetMarkerNumberML(
￿    XrMarkerDetectorML                          markerDetector,
￿    XrMarkerML                                  marker,
￿    uint64_t*                                   number);</code></pre>

        <h5>Description</h5>
        Get the numerical value of a marker, such as the ArUco ID. #GetMarkerNumberML() <b>must</b> only be called when the state of the detector is #MARKER_DETECTOR_STATUS_READY_ML. If the marker does not have an associated numerical value, the runtime <b>must</b> return #ERROR_MARKER_DETECTOR_INVALID_DATA_QUERY_ML.

        If #GetMarkerDetectorStateML() has not been called and returned #MARKER_DETECTOR_STATUS_READY_ML since the last invocation of #SnapshotMarkerDetectorML(), the runtime <b>must</b> return #ERROR_CALL_ORDER_INVALID.

        The runtime <b>must</b> return #ERROR_MARKER_INVALID_ML if the marker atom is invalid.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLMarkerUnderstanding XR_ML_marker_understanding} extension <b>must</b> be enabled prior to calling #GetMarkerNumberML()</li>
            <li>{@code markerDetector} <b>must</b> be a valid {@code XrMarkerDetectorML} handle</li>
            <li>{@code number} <b>must</b> be a pointer to a {@code uint64_t} value</li>
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
                <li>#ERROR_MARKER_INVALID_ML</li>
                <li>#ERROR_MARKER_DETECTOR_INVALID_DATA_QUERY_ML</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #GetMarkersML()
        """,

        XrMarkerDetectorML("markerDetector", "the detector object to retrieve marker information from."),
        XrMarkerML("marker", "the marker atom to be examined."),
        Check(1)..uint64_t.p("number", "points to a {@code float} in which the numerical value associated with the marker is returned.")
    )

    XrResult(
        "GetMarkerStringML",
        """
        Get string information from detected marker.

        <h5>C Specification</h5>
        The #GetMarkerStringML() function is defined as:

        <pre><code>
￿XrResult xrGetMarkerStringML(
￿    XrMarkerDetectorML                          markerDetector,
￿    XrMarkerML                                  marker,
￿    uint32_t                                    bufferCapacityInput,
￿    uint32_t*                                   bufferCountOutput,
￿    char*                                       buffer);</code></pre>

        <h5>Description</h5>
        Get the string value of a marker, such as the QR encoded string. #CreateMarkerSpaceML() <b>must</b> only be called when the state of the detector is #MARKER_DETECTOR_STATUS_READY_ML.

        If the marker does not have an associated string value, the runtime <b>must</b> return #ERROR_MARKER_DETECTOR_INVALID_DATA_QUERY_ML.

        If #GetMarkerDetectorStateML() has not been called and returned #MARKER_DETECTOR_STATUS_READY_ML since the last invocation of #SnapshotMarkerDetectorML(), the runtime <b>must</b> return #ERROR_CALL_ORDER_INVALID.

        This function follows the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#buffer-size-parameters">two-call idiom</a> for filling the {@code buffer}.

        The runtime <b>must</b> return #ERROR_MARKER_INVALID_ML if the marker atom is invalid.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLMarkerUnderstanding XR_ML_marker_understanding} extension <b>must</b> be enabled prior to calling #GetMarkerStringML()</li>
            <li>{@code markerDetector} <b>must</b> be a valid {@code XrMarkerDetectorML} handle</li>
            <li>{@code bufferCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code bufferCapacityInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferCapacityInput} char values</li>
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
                <li>#ERROR_MARKER_INVALID_ML</li>
                <li>#ERROR_MARKER_DETECTOR_INVALID_DATA_QUERY_ML</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #GetMarkersML()
        """,

        XrMarkerDetectorML("markerDetector", "the detector object to retrieve marker information from."),
        XrMarkerML("marker", "the marker atom to be examined."),
        AutoSize("buffer")..uint32_t("bufferCapacityInput", "the capacity of the buffer, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("bufferCountOutput", "a pointer to the count of characters written to buffer (including the terminating '\\0'), or a pointer to the required capacity in the case that bufferCapacityInput is insufficient."),
        nullable..char.p("buffer", "a pointer to an application-allocated buffer that <b>should</b> be filled with the QR code’s contents. It <b>can</b> be NULL if bufferCapacityInput is 0.")
    )

    XrResult(
        "CreateMarkerSpaceML",
        """
        Create an XrSpace to track a marker spatially.

        <h5>C Specification</h5>
        The #CreateMarkerSpaceML() function is defined as:

        <pre><code>
￿XrResult xrCreateMarkerSpaceML(
￿    XrSession                                   session,
￿    const XrMarkerSpaceCreateInfoML*            createInfo,
￿    XrSpace*                                    space);</code></pre>

        <h5>Description</h5>
        Creates an {@code XrSpace} from a currently snapshotted marker. The space <b>may</b> still be used even if the marker is later not in the FOV, or even if the marker detector has been destroyed. In such a scenario, the #SPACE_LOCATION_ORIENTATION_TRACKED_BIT and #SPACE_LOCATION_POSITION_TRACKED_BIT <b>must</b> be false, but #SPACE_LOCATION_POSITION_VALID_BIT and #SPACE_LOCATION_ORIENTATION_VALID_BIT <b>may</b> be set as appropriate to the last known location.

        Once an application has created a space, it <b>may</b> stop calling #SnapshotMarkerDetectorML(), and the position of the marker <b>must</b> still be updated by the runtime whenever it is aware of a more up to date location.

        If a runtime is unable to spatially locate a snapshotted marker, it <b>may</b> return #ERROR_MARKER_DETECTOR_LOCATE_FAILED_ML. This is most likely to happen if significant time has passed since the snapshot of markers was acquired, and the marker in question is no longer in the user’s FOV. Thus, an application <b>should</b> call #CreateMarkerSpaceML() immediately after examining a snapshot, but <b>should</b> also be prepared to try again if needed.

        <b>must</b> only be called when the state of the detector is #MARKER_DETECTOR_STATUS_READY_ML.

        If #GetMarkerDetectorStateML() has not been called and returned #MARKER_DETECTOR_STATUS_READY_ML since the last invocation of #SnapshotMarkerDetectorML(), the runtime <b>must</b> return #ERROR_CALL_ORDER_INVALID.

        {@code session} must be the same session that created the ##XrMarkerSpaceCreateInfoML{@code ::markerDetector}, else the runtime <b>must</b> return #ERROR_HANDLE_INVALID.

        The runtime <b>must</b> return #ERROR_MARKER_INVALID_ML if the marker atom is invalid.

        The {@code XrSpace} origin <b>must</b> be located at the marker’s center. The X-Y plane of the {@code XrSpace} <b>must</b> be aligned with the plane of the marker with the positive Z axis coming out of the marker face.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLMarkerUnderstanding XR_ML_marker_understanding} extension <b>must</b> be enabled prior to calling #CreateMarkerSpaceML()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrMarkerSpaceCreateInfoML structure</li>
            <li>{@code space} <b>must</b> be a pointer to an {@code XrSpace} handle</li>
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
                <li>#ERROR_MARKER_INVALID_ML</li>
                <li>#ERROR_MARKER_DETECTOR_LOCATE_FAILED_ML</li>
                <li>#ERROR_CALL_ORDER_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrMarkerSpaceCreateInfoML, #GetMarkersML()
        """,

        XrSession("session", "the session that will own the created space."),
        XrMarkerSpaceCreateInfoML.const.p("createInfo", "a pointer to the ##XrMarkerSpaceCreateInfoML used to specify the space creation parameters."),
        Check(1)..XrSpace.p("space", "points to an {@code XrSpace} handle in which the resulting space is returned.")
    )
}