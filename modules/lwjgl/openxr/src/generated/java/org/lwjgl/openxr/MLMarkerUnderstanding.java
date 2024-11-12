/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#XR_ML_marker_understanding">XR_ML_marker_understanding</a> extension.
 * 
 * <p>This extension <b>can</b> be used to track and query fiducial markers like QR codes, AprilTag markers, and ArUco markers, and detect, but not locate, 1D barcodes like Code 128, UPC-A.</p>
 * 
 * <h5>Permissions</h5>
 * 
 * <p>Android applications <b>must</b> have the {@code com.magicleap.permission.MARKER_TRACKING} permission listed in their manifest to use this extension. (protection level: normal)</p>
 */
public class MLMarkerUnderstanding {

    /** The extension specification version. */
    public static final int XR_ML_marker_understanding_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_ML_MARKER_UNDERSTANDING_EXTENSION_NAME = "XR_ML_marker_understanding";

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_MARKER_DETECTOR_ML = 1000138000;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SYSTEM_MARKER_UNDERSTANDING_PROPERTIES_ML TYPE_SYSTEM_MARKER_UNDERSTANDING_PROPERTIES_ML}</li>
     * <li>{@link #XR_TYPE_MARKER_DETECTOR_CREATE_INFO_ML TYPE_MARKER_DETECTOR_CREATE_INFO_ML}</li>
     * <li>{@link #XR_TYPE_MARKER_DETECTOR_ARUCO_INFO_ML TYPE_MARKER_DETECTOR_ARUCO_INFO_ML}</li>
     * <li>{@link #XR_TYPE_MARKER_DETECTOR_SIZE_INFO_ML TYPE_MARKER_DETECTOR_SIZE_INFO_ML}</li>
     * <li>{@link #XR_TYPE_MARKER_DETECTOR_APRIL_TAG_INFO_ML TYPE_MARKER_DETECTOR_APRIL_TAG_INFO_ML}</li>
     * <li>{@link #XR_TYPE_MARKER_DETECTOR_CUSTOM_PROFILE_INFO_ML TYPE_MARKER_DETECTOR_CUSTOM_PROFILE_INFO_ML}</li>
     * <li>{@link #XR_TYPE_MARKER_DETECTOR_SNAPSHOT_INFO_ML TYPE_MARKER_DETECTOR_SNAPSHOT_INFO_ML}</li>
     * <li>{@link #XR_TYPE_MARKER_DETECTOR_STATE_ML TYPE_MARKER_DETECTOR_STATE_ML}</li>
     * <li>{@link #XR_TYPE_MARKER_SPACE_CREATE_INFO_ML TYPE_MARKER_SPACE_CREATE_INFO_ML}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SYSTEM_MARKER_UNDERSTANDING_PROPERTIES_ML = 1000138000,
        XR_TYPE_MARKER_DETECTOR_CREATE_INFO_ML            = 1000138001,
        XR_TYPE_MARKER_DETECTOR_ARUCO_INFO_ML             = 1000138002,
        XR_TYPE_MARKER_DETECTOR_SIZE_INFO_ML              = 1000138003,
        XR_TYPE_MARKER_DETECTOR_APRIL_TAG_INFO_ML         = 1000138004,
        XR_TYPE_MARKER_DETECTOR_CUSTOM_PROFILE_INFO_ML    = 1000138005,
        XR_TYPE_MARKER_DETECTOR_SNAPSHOT_INFO_ML          = 1000138006,
        XR_TYPE_MARKER_DETECTOR_STATE_ML                  = 1000138007,
        XR_TYPE_MARKER_SPACE_CREATE_INFO_ML               = 1000138008;

    /**
     * Extends {@code XrResult}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_ERROR_MARKER_DETECTOR_PERMISSION_DENIED_ML ERROR_MARKER_DETECTOR_PERMISSION_DENIED_ML}</li>
     * <li>{@link #XR_ERROR_MARKER_DETECTOR_LOCATE_FAILED_ML ERROR_MARKER_DETECTOR_LOCATE_FAILED_ML}</li>
     * <li>{@link #XR_ERROR_MARKER_DETECTOR_INVALID_DATA_QUERY_ML ERROR_MARKER_DETECTOR_INVALID_DATA_QUERY_ML}</li>
     * <li>{@link #XR_ERROR_MARKER_DETECTOR_INVALID_CREATE_INFO_ML ERROR_MARKER_DETECTOR_INVALID_CREATE_INFO_ML}</li>
     * <li>{@link #XR_ERROR_MARKER_INVALID_ML ERROR_MARKER_INVALID_ML}</li>
     * </ul>
     */
    public static final int
        XR_ERROR_MARKER_DETECTOR_PERMISSION_DENIED_ML   = -1000138000,
        XR_ERROR_MARKER_DETECTOR_LOCATE_FAILED_ML       = -1000138001,
        XR_ERROR_MARKER_DETECTOR_INVALID_DATA_QUERY_ML  = -1000138002,
        XR_ERROR_MARKER_DETECTOR_INVALID_CREATE_INFO_ML = -1000138003,
        XR_ERROR_MARKER_INVALID_ML                      = -1000138004;

    /**
     * XrMarkerDetectorProfileML - The possible premade profiles for an {@code XrMarkerDetectorML}
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_MARKER_DETECTOR_PROFILE_DEFAULT_ML MARKER_DETECTOR_PROFILE_DEFAULT_ML} — Tracker profile that covers standard use cases. If this does not suite the needs of the application try the other profiles listed below.</li>
     * <li>{@link #XR_MARKER_DETECTOR_PROFILE_SPEED_ML MARKER_DETECTOR_PROFILE_SPEED_ML} — Optimized for speed. Use this profile to reduce the compute load and increase detection/tracker speed. This can result in low accuracy poses.</li>
     * <li>{@link #XR_MARKER_DETECTOR_PROFILE_ACCURACY_ML MARKER_DETECTOR_PROFILE_ACCURACY_ML} — Optimized for accuracy. Use this profile to optimize for accurate marker poses. This can cause increased load on the compute.</li>
     * <li>{@link #XR_MARKER_DETECTOR_PROFILE_SMALL_TARGETS_ML MARKER_DETECTOR_PROFILE_SMALL_TARGETS_ML} — Optimized for small targets. Use this profile to optimize for markers that are small or for larger markers that need to be detected from afar.</li>
     * <li>{@link #XR_MARKER_DETECTOR_PROFILE_LARGE_FOV_ML MARKER_DETECTOR_PROFILE_LARGE_FOV_ML} — Optimized for FoV. Use this profile to be able to detect markers across a larger FoV. The marker tracker system will attempt to use multiple cameras to detect the markers.</li>
     * <li>{@link #XR_MARKER_DETECTOR_PROFILE_CUSTOM_ML MARKER_DETECTOR_PROFILE_CUSTOM_ML} — Custom Tracker Profile. The application can define a custom tracker profile. See {@link XrMarkerDetectorCustomProfileInfoML} for more details.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrMarkerDetectorCreateInfoML}</p>
     */
    public static final int
        XR_MARKER_DETECTOR_PROFILE_DEFAULT_ML       = 0,
        XR_MARKER_DETECTOR_PROFILE_SPEED_ML         = 1,
        XR_MARKER_DETECTOR_PROFILE_ACCURACY_ML      = 2,
        XR_MARKER_DETECTOR_PROFILE_SMALL_TARGETS_ML = 3,
        XR_MARKER_DETECTOR_PROFILE_LARGE_FOV_ML     = 4,
        XR_MARKER_DETECTOR_PROFILE_CUSTOM_ML        = 5;

    /**
     * XrMarkerTypeML - The type of marker to be tracked by an {@code XrMarkerDetectorML}
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_MARKER_TYPE_ARUCO_ML MARKER_TYPE_ARUCO_ML} — Aruco Marker detection and localization. The marker id of the Aruco marker is available via {@link #xrGetMarkerNumberML GetMarkerNumberML}.</li>
     * <li>{@link #XR_MARKER_TYPE_APRIL_TAG_ML MARKER_TYPE_APRIL_TAG_ML} — AprilTag detection and localization. The marker id of the AprilTags is available via {@link #xrGetMarkerNumberML GetMarkerNumberML}.</li>
     * <li>{@link #XR_MARKER_TYPE_QR_ML MARKER_TYPE_QR_ML} — QR code detection and localization. The contents of the QR code is available via {@link #xrGetMarkerStringML GetMarkerStringML}.</li>
     * <li>{@link #XR_MARKER_TYPE_EAN_13_ML MARKER_TYPE_EAN_13_ML} — EAN-13, detection only, not locatable. The contents of the barcode is available via {@link #xrGetMarkerStringML GetMarkerStringML}.</li>
     * <li>{@link #XR_MARKER_TYPE_UPC_A_ML MARKER_TYPE_UPC_A_ML} — UPC-A, detection only, not locatable. The contents of the barcode is available via {@link #xrGetMarkerStringML GetMarkerStringML}.</li>
     * <li>{@link #XR_MARKER_TYPE_CODE_128_ML MARKER_TYPE_CODE_128_ML} — Code 128, detection only, not locatable. The contents of the barcode is available via {@link #xrGetMarkerStringML GetMarkerStringML}.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrMarkerDetectorCreateInfoML}</p>
     */
    public static final int
        XR_MARKER_TYPE_ARUCO_ML     = 0,
        XR_MARKER_TYPE_APRIL_TAG_ML = 1,
        XR_MARKER_TYPE_QR_ML        = 2,
        XR_MARKER_TYPE_EAN_13_ML    = 3,
        XR_MARKER_TYPE_UPC_A_ML     = 4,
        XR_MARKER_TYPE_CODE_128_ML  = 5;

    /**
     * XrMarkerArucoDictML - ArUco dictionaries
     * 
     * <h5>Description</h5>
     * 
     * <p>Supported predefined ArUco dictionary:</p>
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_MARKER_ARUCO_DICT_4X4_50_ML MARKER_ARUCO_DICT_4X4_50_ML} — 4 by 4 pixel Aruco marker dictionary with 50 IDs.</li>
     * <li>{@link #XR_MARKER_ARUCO_DICT_4X4_100_ML MARKER_ARUCO_DICT_4X4_100_ML} — 4 by 4 pixel Aruco marker dictionary with 100 IDs.</li>
     * <li>{@link #XR_MARKER_ARUCO_DICT_4X4_250_ML MARKER_ARUCO_DICT_4X4_250_ML} — 4 by 4 pixel Aruco marker dictionary with 250 IDs.</li>
     * <li>{@link #XR_MARKER_ARUCO_DICT_4X4_1000_ML MARKER_ARUCO_DICT_4X4_1000_ML} — 4 by 4 pixel Aruco marker dictionary with 1000 IDs.</li>
     * <li>{@link #XR_MARKER_ARUCO_DICT_5X5_50_ML MARKER_ARUCO_DICT_5X5_50_ML} — 5 by 5 pixel Aruco marker dictionary with 50 IDs.</li>
     * <li>{@link #XR_MARKER_ARUCO_DICT_5X5_100_ML MARKER_ARUCO_DICT_5X5_100_ML} — 5 by 5 pixel Aruco marker dictionary with 100 IDs.</li>
     * <li>{@link #XR_MARKER_ARUCO_DICT_5X5_250_ML MARKER_ARUCO_DICT_5X5_250_ML} — 5 by 5 pixel Aruco marker dictionary with 250 IDs.</li>
     * <li>{@link #XR_MARKER_ARUCO_DICT_5X5_1000_ML MARKER_ARUCO_DICT_5X5_1000_ML} — 5 by 5 pixel Aruco marker dictionary with 1000 IDs.</li>
     * <li>{@link #XR_MARKER_ARUCO_DICT_6X6_50_ML MARKER_ARUCO_DICT_6X6_50_ML} — 6 by 6 pixel Aruco marker dictionary with 50 IDs.</li>
     * <li>{@link #XR_MARKER_ARUCO_DICT_6X6_100_ML MARKER_ARUCO_DICT_6X6_100_ML} — 6 by 6 pixel Aruco marker dictionary with 100 IDs.</li>
     * <li>{@link #XR_MARKER_ARUCO_DICT_6X6_250_ML MARKER_ARUCO_DICT_6X6_250_ML} — 6 by 6 pixel Aruco marker dictionary with 250 IDs.</li>
     * <li>{@link #XR_MARKER_ARUCO_DICT_6X6_1000_ML MARKER_ARUCO_DICT_6X6_1000_ML} — 6 by 6 pixel Aruco marker dictionary with 1000 IDs.</li>
     * <li>{@link #XR_MARKER_ARUCO_DICT_7X7_50_ML MARKER_ARUCO_DICT_7X7_50_ML} — 7 by 7 pixel Aruco marker dictionary with 50 IDs.</li>
     * <li>{@link #XR_MARKER_ARUCO_DICT_7X7_100_ML MARKER_ARUCO_DICT_7X7_100_ML} — 7 by 7 pixel Aruco marker dictionary with 100 IDs.</li>
     * <li>{@link #XR_MARKER_ARUCO_DICT_7X7_250_ML MARKER_ARUCO_DICT_7X7_250_ML} — 7 by 7 pixel Aruco marker dictionary with 250 IDs.</li>
     * <li>{@link #XR_MARKER_ARUCO_DICT_7X7_1000_ML MARKER_ARUCO_DICT_7X7_1000_ML} — 7 by 7 pixel Aruco marker dictionary with 1000 IDs.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrMarkerDetectorArucoInfoML}</p>
     */
    public static final int
        XR_MARKER_ARUCO_DICT_4X4_50_ML   = 0,
        XR_MARKER_ARUCO_DICT_4X4_100_ML  = 1,
        XR_MARKER_ARUCO_DICT_4X4_250_ML  = 2,
        XR_MARKER_ARUCO_DICT_4X4_1000_ML = 3,
        XR_MARKER_ARUCO_DICT_5X5_50_ML   = 4,
        XR_MARKER_ARUCO_DICT_5X5_100_ML  = 5,
        XR_MARKER_ARUCO_DICT_5X5_250_ML  = 6,
        XR_MARKER_ARUCO_DICT_5X5_1000_ML = 7,
        XR_MARKER_ARUCO_DICT_6X6_50_ML   = 8,
        XR_MARKER_ARUCO_DICT_6X6_100_ML  = 9,
        XR_MARKER_ARUCO_DICT_6X6_250_ML  = 10,
        XR_MARKER_ARUCO_DICT_6X6_1000_ML = 11,
        XR_MARKER_ARUCO_DICT_7X7_50_ML   = 12,
        XR_MARKER_ARUCO_DICT_7X7_100_ML  = 13,
        XR_MARKER_ARUCO_DICT_7X7_250_ML  = 14,
        XR_MARKER_ARUCO_DICT_7X7_1000_ML = 15;

    /**
     * XrMarkerAprilTagDictML - AprilTag dictionaries
     * 
     * <h5>Description</h5>
     * 
     * <p>Supported predefined AprilTag dictionary:</p>
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_MARKER_APRIL_TAG_DICT_16H5_ML MARKER_APRIL_TAG_DICT_16H5_ML} — 4 by 4 bits, minimum Hamming distance between any two codes = 5, 30 codes.</li>
     * <li>{@link #XR_MARKER_APRIL_TAG_DICT_25H9_ML MARKER_APRIL_TAG_DICT_25H9_ML} — 5 by 5 bits, minimum Hamming distance between any two codes = 9, 35 codes.</li>
     * <li>{@link #XR_MARKER_APRIL_TAG_DICT_36H10_ML MARKER_APRIL_TAG_DICT_36H10_ML} — 6 by 6 bits, minimum Hamming distance between any two codes = 10, 2320 codes.</li>
     * <li>{@link #XR_MARKER_APRIL_TAG_DICT_36H11_ML MARKER_APRIL_TAG_DICT_36H11_ML} — 6 by 6 bits, minimum Hamming distance between any two codes = 11, 587 codes.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrMarkerDetectorAprilTagInfoML}</p>
     */
    public static final int
        XR_MARKER_APRIL_TAG_DICT_16H5_ML  = 0,
        XR_MARKER_APRIL_TAG_DICT_25H9_ML  = 1,
        XR_MARKER_APRIL_TAG_DICT_36H10_ML = 2,
        XR_MARKER_APRIL_TAG_DICT_36H11_ML = 3;

    /**
     * XrMarkerDetectorFpsML - Framerate hint used with a custom profile
     * 
     * <h5>Description</h5>
     * 
     * <p>Used to hint to the back-end the max frames per second that <b>should</b> be analyzed.</p>
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_MARKER_DETECTOR_FPS_LOW_ML MARKER_DETECTOR_FPS_LOW_ML} — Low FPS.</li>
     * <li>{@link #XR_MARKER_DETECTOR_FPS_MEDIUM_ML MARKER_DETECTOR_FPS_MEDIUM_ML} — Medium FPS.</li>
     * <li>{@link #XR_MARKER_DETECTOR_FPS_HIGH_ML MARKER_DETECTOR_FPS_HIGH_ML} — High FPS.</li>
     * <li>{@link #XR_MARKER_DETECTOR_FPS_MAX_ML MARKER_DETECTOR_FPS_MAX_ML} — Max possible FPS.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrMarkerDetectorCustomProfileInfoML}</p>
     */
    public static final int
        XR_MARKER_DETECTOR_FPS_LOW_ML    = 0,
        XR_MARKER_DETECTOR_FPS_MEDIUM_ML = 1,
        XR_MARKER_DETECTOR_FPS_HIGH_ML   = 2,
        XR_MARKER_DETECTOR_FPS_MAX_ML    = 3;

    /**
     * XrMarkerDetectorResolutionML - Resolution hint used with a custom profile
     * 
     * <h5>Description</h5>
     * 
     * <p>Used to hint to the back-end the resolution that <b>should</b> be used. CPU load is a combination of chosen {@code XrMarkerTypeML}, {@code XrMarkerDetectorFpsML}, and {@code XrMarkerDetectorResolutionML}.</p>
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_MARKER_DETECTOR_RESOLUTION_LOW_ML MARKER_DETECTOR_RESOLUTION_LOW_ML} — Low Resolution.</li>
     * <li>{@link #XR_MARKER_DETECTOR_RESOLUTION_MEDIUM_ML MARKER_DETECTOR_RESOLUTION_MEDIUM_ML} — Medium Resolution.</li>
     * <li>{@link #XR_MARKER_DETECTOR_RESOLUTION_HIGH_ML MARKER_DETECTOR_RESOLUTION_HIGH_ML} — High Resolution.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrMarkerDetectorCustomProfileInfoML}</p>
     */
    public static final int
        XR_MARKER_DETECTOR_RESOLUTION_LOW_ML    = 0,
        XR_MARKER_DETECTOR_RESOLUTION_MEDIUM_ML = 1,
        XR_MARKER_DETECTOR_RESOLUTION_HIGH_ML   = 2;

    /**
     * XrMarkerDetectorCameraML - Camera hint
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@code XrMarkerDetectorCameraML} enum values are used to hint to the camera that <b>should</b> be used. This is set in the {@link XrMarkerDetectorCustomProfileInfoML}.</p>
     * 
     * <p>The RGB camera has a higher resolution than world cameras and is better suited for use cases where the target to be tracked is small or needs to be detected from far away.</p>
     * 
     * <p>{@link #XR_MARKER_DETECTOR_CAMERA_WORLD_CAMERAS_ML MARKER_DETECTOR_CAMERA_WORLD_CAMERAS_ML} make use of multiple cameras to improve accuracy and increase the FoV for detection.</p>
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_MARKER_DETECTOR_CAMERA_RGB_CAMERA_ML MARKER_DETECTOR_CAMERA_RGB_CAMERA_ML} — Single RGB camera.</li>
     * <li>{@link #XR_MARKER_DETECTOR_CAMERA_WORLD_CAMERAS_ML MARKER_DETECTOR_CAMERA_WORLD_CAMERAS_ML} — One or more world cameras.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrMarkerDetectorCustomProfileInfoML}</p>
     */
    public static final int
        XR_MARKER_DETECTOR_CAMERA_RGB_CAMERA_ML    = 0,
        XR_MARKER_DETECTOR_CAMERA_WORLD_CAMERAS_ML = 1;

    /**
     * XrMarkerDetectorCornerRefineMethodML - Corner Refinement Method.
     * 
     * <h5>Description</h5>
     * 
     * <p>The ArUco/AprilTag detector comes with several corner refinement methods. Choosing the right corner refinement method has an impact on the accuracy and speed trade-off that comes with each detection pipeline.</p>
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_MARKER_DETECTOR_CORNER_REFINE_METHOD_NONE_ML MARKER_DETECTOR_CORNER_REFINE_METHOD_NONE_ML} — No refinement. Inaccurate corners.</li>
     * <li>{@link #XR_MARKER_DETECTOR_CORNER_REFINE_METHOD_SUBPIX_ML MARKER_DETECTOR_CORNER_REFINE_METHOD_SUBPIX_ML} — Subpixel refinement. Corners have subpixel coordinates. High detection rate, very fast, reasonable accuracy.</li>
     * <li>{@link #XR_MARKER_DETECTOR_CORNER_REFINE_METHOD_CONTOUR_ML MARKER_DETECTOR_CORNER_REFINE_METHOD_CONTOUR_ML} — Contour refinement. High detection rate, fast, reasonable accuracy.</li>
     * <li>{@link #XR_MARKER_DETECTOR_CORNER_REFINE_METHOD_APRIL_TAG_ML MARKER_DETECTOR_CORNER_REFINE_METHOD_APRIL_TAG_ML} — AprilTag refinement. Reasonable detection rate, slowest, but very accurate. Only valid with AprilTags.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrMarkerDetectorCustomProfileInfoML}</p>
     */
    public static final int
        XR_MARKER_DETECTOR_CORNER_REFINE_METHOD_NONE_ML      = 0,
        XR_MARKER_DETECTOR_CORNER_REFINE_METHOD_SUBPIX_ML    = 1,
        XR_MARKER_DETECTOR_CORNER_REFINE_METHOD_CONTOUR_ML   = 2,
        XR_MARKER_DETECTOR_CORNER_REFINE_METHOD_APRIL_TAG_ML = 3;

    /**
     * XrMarkerDetectorFullAnalysisIntervalML - Full Frame Analysis Time Interval.
     * 
     * <h5>Description</h5>
     * 
     * <p>In order to improve performance, the detectors do not always run on the full frame. Full frame analysis is however necessary to detect new markers that were not detected before. Use this option to control how often the detector <b>should</b> detect new markers and its impact on tracking performance.</p>
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_MAX_ML MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_MAX_ML} — Detector analyzes every frame fully.</li>
     * <li>{@link #XR_MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_FAST_ML MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_FAST_ML} — Detector analyzes frame fully very often.</li>
     * <li>{@link #XR_MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_MEDIUM_ML MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_MEDIUM_ML} — Detector analyzes frame fully a few times per second.</li>
     * <li>{@link #XR_MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_SLOW_ML MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_SLOW_ML} — Detector analyzes frame fully about every second.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrMarkerDetectorCustomProfileInfoML}</p>
     */
    public static final int
        XR_MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_MAX_ML    = 0,
        XR_MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_FAST_ML   = 1,
        XR_MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_MEDIUM_ML = 2,
        XR_MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_SLOW_ML   = 3;

    /**
     * XrMarkerDetectorStatusML - Detector states
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@code XrMarkerDetectorStatusML} enumeration describes the current state of the marker detector. It is queried via {@link #xrGetMarkerDetectorStateML GetMarkerDetectorStateML} to determine if the marker tracker is currently available for inspection.</p>
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_MARKER_DETECTOR_STATUS_PENDING_ML MARKER_DETECTOR_STATUS_PENDING_ML} — The marker detector is working on a new snapshot.</li>
     * <li>{@link #XR_MARKER_DETECTOR_STATUS_READY_ML MARKER_DETECTOR_STATUS_READY_ML} — The marker detector is ready to be inspected.</li>
     * <li>{@link #XR_MARKER_DETECTOR_STATUS_ERROR_ML MARKER_DETECTOR_STATUS_ERROR_ML} — The marker detector has encountered a fatal error.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrMarkerDetectorStateML}, {@link #xrGetMarkerDetectorStateML GetMarkerDetectorStateML}</p>
     */
    public static final int
        XR_MARKER_DETECTOR_STATUS_PENDING_ML = 0,
        XR_MARKER_DETECTOR_STATUS_READY_ML   = 1,
        XR_MARKER_DETECTOR_STATUS_ERROR_ML   = 2;

    protected MLMarkerUnderstanding() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateMarkerDetectorML ] ---

    /** Unsafe version of: {@link #xrCreateMarkerDetectorML CreateMarkerDetectorML} */
    public static int nxrCreateMarkerDetectorML(XrSession session, long createInfo, long markerDetector) {
        long __functionAddress = session.getCapabilities().xrCreateMarkerDetectorML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, markerDetector, __functionAddress);
    }

    /**
     * Create a marker detection handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateMarkerDetectorML CreateMarkerDetectorML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateMarkerDetectorML(
     *     XrSession                                   session,
     *     const XrMarkerDetectorCreateInfoML*         createInfo,
     *     XrMarkerDetectorML*                         markerDetector);</code></pre>
     * 
     * <h5>Parameter Descriptions</h5>
     * 
     * <ul>
     * <li>{@code session} is an {@code XrSession} in which the marker detection will be active.</li>
     * <li>{@code createInfo} is the {@link XrMarkerDetectorCreateInfoML} used to specify the marker detection.</li>
     * <li>{@code markerDetector} is the returned {@code XrMarkerDetectorML} handle.</li>
     * </ul>
     * 
     * <h5>Description</h5>
     * 
     * <p>If a runtime is unable to create a marker detector due to some internal limit, the runtime <b>must</b> return {@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLMarkerUnderstanding XR_ML_marker_understanding} extension <b>must</b> be enabled prior to calling {@link #xrCreateMarkerDetectorML CreateMarkerDetectorML}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrMarkerDetectorCreateInfoML} structure</li>
     * <li>{@code markerDetector} <b>must</b> be a pointer to an {@code XrMarkerDetectorML} handle</li>
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
     * <li>{@link #XR_ERROR_MARKER_DETECTOR_PERMISSION_DENIED_ML ERROR_MARKER_DETECTOR_PERMISSION_DENIED_ML}</li>
     * <li>{@link #XR_ERROR_MARKER_DETECTOR_INVALID_CREATE_INFO_ML ERROR_MARKER_DETECTOR_INVALID_CREATE_INFO_ML}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrMarkerDetectorCreateInfoML}, {@link #xrDestroyMarkerDetectorML DestroyMarkerDetectorML}, {@link #xrGetMarkerDetectorStateML GetMarkerDetectorStateML}, {@link #xrGetMarkersML GetMarkersML}, {@link #xrSnapshotMarkerDetectorML SnapshotMarkerDetectorML}</p>
     */
    @NativeType("XrResult")
    public static int xrCreateMarkerDetectorML(XrSession session, @NativeType("XrMarkerDetectorCreateInfoML const *") XrMarkerDetectorCreateInfoML createInfo, @NativeType("XrMarkerDetectorML *") PointerBuffer markerDetector) {
        if (CHECKS) {
            check(markerDetector, 1);
        }
        return nxrCreateMarkerDetectorML(session, createInfo.address(), memAddress(markerDetector));
    }

    // --- [ xrDestroyMarkerDetectorML ] ---

    /**
     * Destroy a marker detection handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroyMarkerDetectorML DestroyMarkerDetectorML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDestroyMarkerDetectorML(
     *     XrMarkerDetectorML                          markerDetector);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Destroy a marker detection handle.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLMarkerUnderstanding XR_ML_marker_understanding} extension <b>must</b> be enabled prior to calling {@link #xrDestroyMarkerDetectorML DestroyMarkerDetectorML}</li>
     * <li>{@code markerDetector} <b>must</b> be a valid {@code XrMarkerDetectorML} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code markerDetector}, and any child handles, <b>must</b> be externally synchronized</li>
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
     * <p>{@link #xrCreateMarkerDetectorML CreateMarkerDetectorML}</p>
     *
     * @param markerDetector object to destroy.
     */
    @NativeType("XrResult")
    public static int xrDestroyMarkerDetectorML(XrMarkerDetectorML markerDetector) {
        long __functionAddress = markerDetector.getCapabilities().xrDestroyMarkerDetectorML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(markerDetector.address(), __functionAddress);
    }

    // --- [ xrSnapshotMarkerDetectorML ] ---

    /** Unsafe version of: {@link #xrSnapshotMarkerDetectorML SnapshotMarkerDetectorML} */
    public static int nxrSnapshotMarkerDetectorML(XrMarkerDetectorML markerDetector, long snapshotInfo) {
        long __functionAddress = markerDetector.getCapabilities().xrSnapshotMarkerDetectorML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(markerDetector.address(), snapshotInfo, __functionAddress);
    }

    /**
     * Request a snapshot from the marker detector.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrSnapshotMarkerDetectorML SnapshotMarkerDetectorML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrSnapshotMarkerDetectorML(
     *     XrMarkerDetectorML                          markerDetector,
     *     XrMarkerDetectorSnapshotInfoML*             snapshotInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Collects the latest marker detector state and makes it ready for inspection. This function only snapshots the non-pose state of markers. Once called, and if a new snapshot is not yet available a runtime <b>must</b> set the state of the marker detector to {@link #XR_MARKER_DETECTOR_STATUS_PENDING_ML MARKER_DETECTOR_STATUS_PENDING_ML}. If a new state is available the runtime <b>must</b> set the state to {@link #XR_MARKER_DETECTOR_STATUS_READY_ML MARKER_DETECTOR_STATUS_READY_ML}. If an error occurred the runtime <b>must</b> set the state to {@link #XR_MARKER_DETECTOR_STATUS_ERROR_ML MARKER_DETECTOR_STATUS_ERROR_ML}. The application <b>may</b> attempt the snapshot again.</p>
     * 
     * <p>Once the application has inspected the state it is interested in it <b>can</b> call this function again and the state is set to {@link #XR_MARKER_DETECTOR_STATUS_PENDING_ML MARKER_DETECTOR_STATUS_PENDING_ML} until a new state has been snapshotted. After each snapshot, only the currently detected markers are available for inspection, though the same marker <b>may</b> repeatedly be detected across snapshots.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLMarkerUnderstanding XR_ML_marker_understanding} extension <b>must</b> be enabled prior to calling {@link #xrSnapshotMarkerDetectorML SnapshotMarkerDetectorML}</li>
     * <li>{@code markerDetector} <b>must</b> be a valid {@code XrMarkerDetectorML} handle</li>
     * <li>{@code snapshotInfo} <b>must</b> be a pointer to an {@link XrMarkerDetectorSnapshotInfoML} structure</li>
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
     * <p>{@link XrMarkerDetectorSnapshotInfoML}</p>
     *
     * @param markerDetector object to issue a snapshot request to.
     * @param snapshotInfo   a pointer to {@link XrMarkerDetectorSnapshotInfoML} containing marker snapshot parameters.
     */
    @NativeType("XrResult")
    public static int xrSnapshotMarkerDetectorML(XrMarkerDetectorML markerDetector, @NativeType("XrMarkerDetectorSnapshotInfoML *") XrMarkerDetectorSnapshotInfoML snapshotInfo) {
        return nxrSnapshotMarkerDetectorML(markerDetector, snapshotInfo.address());
    }

    // --- [ xrGetMarkerDetectorStateML ] ---

    /** Unsafe version of: {@link #xrGetMarkerDetectorStateML GetMarkerDetectorStateML} */
    public static int nxrGetMarkerDetectorStateML(XrMarkerDetectorML markerDetector, long state) {
        long __functionAddress = markerDetector.getCapabilities().xrGetMarkerDetectorStateML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(markerDetector.address(), state, __functionAddress);
    }

    /**
     * Get the current state of the marker detector.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetMarkerDetectorStateML GetMarkerDetectorStateML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetMarkerDetectorStateML(
     *     XrMarkerDetectorML                          markerDetector,
     *     XrMarkerDetectorStateML*                    state);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrGetMarkerDetectorStateML GetMarkerDetectorStateML} is used after calling {@link #xrSnapshotMarkerDetectorML SnapshotMarkerDetectorML} to check the current status of the snapshot in progress. When {@link XrMarkerDetectorStateML}{@code ::state} == {@link #XR_MARKER_DETECTOR_STATUS_READY_ML MARKER_DETECTOR_STATUS_READY_ML}, the detector is ready to be queried, while {@link #XR_MARKER_DETECTOR_STATUS_PENDING_ML MARKER_DETECTOR_STATUS_PENDING_ML} indicates the snapshot is still in progress. {@link #XR_MARKER_DETECTOR_STATUS_ERROR_ML MARKER_DETECTOR_STATUS_ERROR_ML} indicates that the runtime has encountered an error getting a snapshot for the requested detector, which <b>may</b> require user intervention to solve.</p>
     * 
     * <p>If {@link #xrSnapshotMarkerDetectorML SnapshotMarkerDetectorML} has not yet been called for the {@code markerDetector}, the runtime <b>must</b> return {@link XR10#XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLMarkerUnderstanding XR_ML_marker_understanding} extension <b>must</b> be enabled prior to calling {@link #xrGetMarkerDetectorStateML GetMarkerDetectorStateML}</li>
     * <li>{@code markerDetector} <b>must</b> be a valid {@code XrMarkerDetectorML} handle</li>
     * <li>{@code state} <b>must</b> be a pointer to an {@link XrMarkerDetectorStateML} structure</li>
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
     * <li>{@link XR10#XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrMarkerDetectorStateML}</p>
     *
     * @param markerDetector object to retrieve state information from.
     * @param state          points to an {@link XrMarkerDetectorStateML} in which the current state of the marker detector is returned.
     */
    @NativeType("XrResult")
    public static int xrGetMarkerDetectorStateML(XrMarkerDetectorML markerDetector, @NativeType("XrMarkerDetectorStateML *") XrMarkerDetectorStateML state) {
        return nxrGetMarkerDetectorStateML(markerDetector, state.address());
    }

    // --- [ xrGetMarkersML ] ---

    /**
     * Unsafe version of: {@link #xrGetMarkersML GetMarkersML}
     *
     * @param markerCapacityInput the capacity of the {@code markers} array or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrGetMarkersML(XrMarkerDetectorML markerDetector, int markerCapacityInput, long markerCountOutput, long markers) {
        long __functionAddress = markerDetector.getCapabilities().xrGetMarkersML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(markerDetector.address(), markerCapacityInput, markerCountOutput, markers, __functionAddress);
    }

    /**
     * Examine marker detection snapshot.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetMarkersML GetMarkersML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetMarkersML(
     *     XrMarkerDetectorML                          markerDetector,
     *     uint32_t                                    markerCapacityInput,
     *     uint32_t*                                   markerCountOutput,
     *     XrMarkerML*                                 markers);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Get the list of current snapshotted marker atoms, <b>must</b> only be called when the state of the detector is {@link #XR_MARKER_DETECTOR_STATUS_READY_ML MARKER_DETECTOR_STATUS_READY_ML}.</p>
     * 
     * <p>If {@link #xrGetMarkerDetectorStateML GetMarkerDetectorStateML} has not been called and returned {@link #XR_MARKER_DETECTOR_STATUS_READY_ML MARKER_DETECTOR_STATUS_READY_ML} since the last invocation of {@link #xrSnapshotMarkerDetectorML SnapshotMarkerDetectorML}, the runtime <b>must</b> return {@link XR10#XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}.</p>
     * 
     * <p>The returned atoms are only valid while in the {@link #XR_MARKER_DETECTOR_STATUS_READY_ML MARKER_DETECTOR_STATUS_READY_ML} state. The runtime <b>must</b> return the same atom value for the same uniquely identifiable marker across successive snapshots. It is unspecified what happens if the detector is observing two markers with the same identification patterns.</p>
     * 
     * <p>Assuming the same set of markers are in view across several snapshots, the runtime <b>should</b> return the same set of atoms. An application <b>can</b> use the list of atoms as a simple test for if a particular marker has gone in or out of view.</p>
     * 
     * <p>Note that {@code XrMarkerML} atoms are only usable with the {@code XrMarkerDetectorML} that returned them.</p>
     * 
     * <p>This function follows the <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#fundamentals-buffer-size-parameters">two-call idiom</a> for filling the {@code markers}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLMarkerUnderstanding XR_ML_marker_understanding} extension <b>must</b> be enabled prior to calling {@link #xrGetMarkersML GetMarkersML}</li>
     * <li>{@code markerDetector} <b>must</b> be a valid {@code XrMarkerDetectorML} handle</li>
     * <li>{@code markerCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code markerCapacityInput} is not 0, {@code markers} <b>must</b> be a pointer to an array of {@code markerCapacityInput} {@code XrMarkerML} values</li>
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
     * <li>{@link XR10#XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrCreateMarkerSpaceML CreateMarkerSpaceML}, {@link #xrGetMarkerNumberML GetMarkerNumberML}, {@link #xrGetMarkerReprojectionErrorML GetMarkerReprojectionErrorML}, {@link #xrGetMarkerStringML GetMarkerStringML}</p>
     *
     * @param markerDetector    the detector object to retrieve marker information from.
     * @param markerCountOutput filled in by the runtime with the count of marker atoms written or the required capacity in the case that {@code markerCapacityInput} is insufficient.
     * @param markers           a pointer to an array of {@code XrMarkerML} atoms, but <b>can</b> be {@code NULL} if propertyCapacityInput is 0.
     */
    @NativeType("XrResult")
    public static int xrGetMarkersML(XrMarkerDetectorML markerDetector, @NativeType("uint32_t *") IntBuffer markerCountOutput, @NativeType("XrMarkerML *") @Nullable LongBuffer markers) {
        if (CHECKS) {
            check(markerCountOutput, 1);
        }
        return nxrGetMarkersML(markerDetector, remainingSafe(markers), memAddress(markerCountOutput), memAddressSafe(markers));
    }

    // --- [ xrGetMarkerReprojectionErrorML ] ---

    /** Unsafe version of: {@link #xrGetMarkerReprojectionErrorML GetMarkerReprojectionErrorML} */
    public static int nxrGetMarkerReprojectionErrorML(XrMarkerDetectorML markerDetector, long marker, long reprojectionErrorMeters) {
        long __functionAddress = markerDetector.getCapabilities().xrGetMarkerReprojectionErrorML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(markerDetector.address(), marker, reprojectionErrorMeters, __functionAddress);
    }

    /**
     * Get the reprojection error of a marker.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetMarkerReprojectionErrorML GetMarkerReprojectionErrorML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetMarkerReprojectionErrorML(
     *     XrMarkerDetectorML                          markerDetector,
     *     XrMarkerML                                  marker,
     *     float*                                      reprojectionErrorMeters);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Get the reprojection error of a marker, only available for certain types of markers. <b>must</b> only be called when the state of the detector is {@link #XR_MARKER_DETECTOR_STATUS_READY_ML MARKER_DETECTOR_STATUS_READY_ML}.</p>
     * 
     * <p>If {@link #xrGetMarkerDetectorStateML GetMarkerDetectorStateML} has not been called and returned {@link #XR_MARKER_DETECTOR_STATUS_READY_ML MARKER_DETECTOR_STATUS_READY_ML} since the last invocation of {@link #xrSnapshotMarkerDetectorML SnapshotMarkerDetectorML}, the runtime <b>must</b> return {@link XR10#XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}.</p>
     * 
     * <p>A high reprojection error means that the estimated pose of the marker does not match well with the 2D detection on the processed video frame and thus the pose <b>may</b> be inaccurate. The error is given in meters, representing the displacement between real marker and its estimated pose. This means this is a normalized number, independent of marker distance or length.</p>
     * 
     * <p>The runtime <b>must</b> return {@link #XR_ERROR_MARKER_INVALID_ML ERROR_MARKER_INVALID_ML} if the marker atom is invalid.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLMarkerUnderstanding XR_ML_marker_understanding} extension <b>must</b> be enabled prior to calling {@link #xrGetMarkerReprojectionErrorML GetMarkerReprojectionErrorML}</li>
     * <li>{@code markerDetector} <b>must</b> be a valid {@code XrMarkerDetectorML} handle</li>
     * <li>{@code reprojectionErrorMeters} <b>must</b> be a pointer to a {@code float} value</li>
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
     * <li>{@link #XR_ERROR_MARKER_INVALID_ML ERROR_MARKER_INVALID_ML}</li>
     * <li>{@link XR10#XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrGetMarkersML GetMarkersML}</p>
     *
     * @param markerDetector          the detector object to retrieve marker information from.
     * @param marker                  the marker atom to be examined.
     * @param reprojectionErrorMeters points to a {@code float} in which the estimated reprojection error in meters is returned.
     */
    @NativeType("XrResult")
    public static int xrGetMarkerReprojectionErrorML(XrMarkerDetectorML markerDetector, @NativeType("XrMarkerML") long marker, @NativeType("float *") FloatBuffer reprojectionErrorMeters) {
        if (CHECKS) {
            check(reprojectionErrorMeters, 1);
        }
        return nxrGetMarkerReprojectionErrorML(markerDetector, marker, memAddress(reprojectionErrorMeters));
    }

    // --- [ xrGetMarkerLengthML ] ---

    /** Unsafe version of: {@link #xrGetMarkerLengthML GetMarkerLengthML} */
    public static int nxrGetMarkerLengthML(XrMarkerDetectorML markerDetector, long marker, long meters) {
        long __functionAddress = markerDetector.getCapabilities().xrGetMarkerLengthML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(markerDetector.address(), marker, meters, __functionAddress);
    }

    /**
     * Query for the length of a marker.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetMarkerLengthML GetMarkerLengthML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetMarkerLengthML(
     *     XrMarkerDetectorML                          markerDetector,
     *     XrMarkerML                                  marker,
     *     float*                                      meters);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Get the size of the marker, defined as the length in meters per side. If the application created the detector while passing in a {@link XrMarkerDetectorSizeInfoML}, this query <b>may</b> be redundant. {@link #xrGetMarkerLengthML GetMarkerLengthML} is primarily intended to query for a runtime estimated size when an application did not indicate the expected size via {@link XrMarkerDetectorSizeInfoML}.</p>
     * 
     * <p>{@link #xrGetMarkerLengthML GetMarkerLengthML} <b>must</b> only be called when the state of the detector is {@link #XR_MARKER_DETECTOR_STATUS_READY_ML MARKER_DETECTOR_STATUS_READY_ML}. If {@link #xrGetMarkerDetectorStateML GetMarkerDetectorStateML} has not been called and returned {@link #XR_MARKER_DETECTOR_STATUS_READY_ML MARKER_DETECTOR_STATUS_READY_ML} since the last invocation of {@link #xrSnapshotMarkerDetectorML SnapshotMarkerDetectorML}, the runtime <b>must</b> return {@link XR10#XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}.</p>
     * 
     * <p>The runtime <b>must</b> return {@link #XR_ERROR_MARKER_INVALID_ML ERROR_MARKER_INVALID_ML} if the marker atom is invalid.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLMarkerUnderstanding XR_ML_marker_understanding} extension <b>must</b> be enabled prior to calling {@link #xrGetMarkerLengthML GetMarkerLengthML}</li>
     * <li>{@code markerDetector} <b>must</b> be a valid {@code XrMarkerDetectorML} handle</li>
     * <li>{@code meters} <b>must</b> be a pointer to a {@code float} value</li>
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
     * <li>{@link #XR_ERROR_MARKER_INVALID_ML ERROR_MARKER_INVALID_ML}</li>
     * <li>{@link XR10#XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}</li>
     * </ul></dd>
     * </dl>
     *
     * @param markerDetector the detector object to retrieve marker information from.
     * @param marker         the marker atom to be examined.
     * @param meters         points to a {@code float} in which the size per side of the queried marker is returned.
     */
    @NativeType("XrResult")
    public static int xrGetMarkerLengthML(XrMarkerDetectorML markerDetector, @NativeType("XrMarkerML") long marker, @NativeType("float *") FloatBuffer meters) {
        if (CHECKS) {
            check(meters, 1);
        }
        return nxrGetMarkerLengthML(markerDetector, marker, memAddress(meters));
    }

    // --- [ xrGetMarkerNumberML ] ---

    /** Unsafe version of: {@link #xrGetMarkerNumberML GetMarkerNumberML} */
    public static int nxrGetMarkerNumberML(XrMarkerDetectorML markerDetector, long marker, long number) {
        long __functionAddress = markerDetector.getCapabilities().xrGetMarkerNumberML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(markerDetector.address(), marker, number, __functionAddress);
    }

    /**
     * Get the number of a marker, such as the ArUco ID.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetMarkerNumberML GetMarkerNumberML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetMarkerNumberML(
     *     XrMarkerDetectorML                          markerDetector,
     *     XrMarkerML                                  marker,
     *     uint64_t*                                   number);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Get the numerical value of a marker, such as the ArUco ID. {@link #xrGetMarkerNumberML GetMarkerNumberML} <b>must</b> only be called when the state of the detector is {@link #XR_MARKER_DETECTOR_STATUS_READY_ML MARKER_DETECTOR_STATUS_READY_ML}. If the marker does not have an associated numerical value, the runtime <b>must</b> return {@link #XR_ERROR_MARKER_DETECTOR_INVALID_DATA_QUERY_ML ERROR_MARKER_DETECTOR_INVALID_DATA_QUERY_ML}.</p>
     * 
     * <p>If {@link #xrGetMarkerDetectorStateML GetMarkerDetectorStateML} has not been called and returned {@link #XR_MARKER_DETECTOR_STATUS_READY_ML MARKER_DETECTOR_STATUS_READY_ML} since the last invocation of {@link #xrSnapshotMarkerDetectorML SnapshotMarkerDetectorML}, the runtime <b>must</b> return {@link XR10#XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}.</p>
     * 
     * <p>The runtime <b>must</b> return {@link #XR_ERROR_MARKER_INVALID_ML ERROR_MARKER_INVALID_ML} if the marker atom is invalid.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLMarkerUnderstanding XR_ML_marker_understanding} extension <b>must</b> be enabled prior to calling {@link #xrGetMarkerNumberML GetMarkerNumberML}</li>
     * <li>{@code markerDetector} <b>must</b> be a valid {@code XrMarkerDetectorML} handle</li>
     * <li>{@code number} <b>must</b> be a pointer to a {@code uint64_t} value</li>
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
     * <li>{@link #XR_ERROR_MARKER_INVALID_ML ERROR_MARKER_INVALID_ML}</li>
     * <li>{@link #XR_ERROR_MARKER_DETECTOR_INVALID_DATA_QUERY_ML ERROR_MARKER_DETECTOR_INVALID_DATA_QUERY_ML}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrGetMarkersML GetMarkersML}</p>
     *
     * @param markerDetector the detector object to retrieve marker information from.
     * @param marker         the marker atom to be examined.
     * @param number         points to a {@code float} in which the numerical value associated with the marker is returned.
     */
    @NativeType("XrResult")
    public static int xrGetMarkerNumberML(XrMarkerDetectorML markerDetector, @NativeType("XrMarkerML") long marker, @NativeType("uint64_t *") LongBuffer number) {
        if (CHECKS) {
            check(number, 1);
        }
        return nxrGetMarkerNumberML(markerDetector, marker, memAddress(number));
    }

    // --- [ xrGetMarkerStringML ] ---

    /**
     * Unsafe version of: {@link #xrGetMarkerStringML GetMarkerStringML}
     *
     * @param bufferCapacityInput the capacity of the buffer, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrGetMarkerStringML(XrMarkerDetectorML markerDetector, long marker, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = markerDetector.getCapabilities().xrGetMarkerStringML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(markerDetector.address(), marker, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /**
     * Get string information from detected marker.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetMarkerStringML GetMarkerStringML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetMarkerStringML(
     *     XrMarkerDetectorML                          markerDetector,
     *     XrMarkerML                                  marker,
     *     uint32_t                                    bufferCapacityInput,
     *     uint32_t*                                   bufferCountOutput,
     *     char*                                       buffer);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Get the string value of a marker, such as the QR encoded string. {@link #xrCreateMarkerSpaceML CreateMarkerSpaceML} <b>must</b> only be called when the state of the detector is {@link #XR_MARKER_DETECTOR_STATUS_READY_ML MARKER_DETECTOR_STATUS_READY_ML}.</p>
     * 
     * <p>If the marker does not have an associated string value, the runtime <b>must</b> return {@link #XR_ERROR_MARKER_DETECTOR_INVALID_DATA_QUERY_ML ERROR_MARKER_DETECTOR_INVALID_DATA_QUERY_ML}.</p>
     * 
     * <p>If {@link #xrGetMarkerDetectorStateML GetMarkerDetectorStateML} has not been called and returned {@link #XR_MARKER_DETECTOR_STATUS_READY_ML MARKER_DETECTOR_STATUS_READY_ML} since the last invocation of {@link #xrSnapshotMarkerDetectorML SnapshotMarkerDetectorML}, the runtime <b>must</b> return {@link XR10#XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}.</p>
     * 
     * <p>This function follows the <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#fundamentals-buffer-size-parameters">two-call idiom</a> for filling the {@code buffer}.</p>
     * 
     * <p>The runtime <b>must</b> return {@link #XR_ERROR_MARKER_INVALID_ML ERROR_MARKER_INVALID_ML} if the marker atom is invalid.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLMarkerUnderstanding XR_ML_marker_understanding} extension <b>must</b> be enabled prior to calling {@link #xrGetMarkerStringML GetMarkerStringML}</li>
     * <li>{@code markerDetector} <b>must</b> be a valid {@code XrMarkerDetectorML} handle</li>
     * <li>{@code bufferCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code bufferCapacityInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferCapacityInput} char values</li>
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
     * <li>{@link #XR_ERROR_MARKER_INVALID_ML ERROR_MARKER_INVALID_ML}</li>
     * <li>{@link #XR_ERROR_MARKER_DETECTOR_INVALID_DATA_QUERY_ML ERROR_MARKER_DETECTOR_INVALID_DATA_QUERY_ML}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrGetMarkersML GetMarkersML}</p>
     *
     * @param markerDetector    the detector object to retrieve marker information from.
     * @param marker            the marker atom to be examined.
     * @param bufferCountOutput a pointer to the count of characters written to buffer (including the terminating '\0'), or a pointer to the required capacity in the case that bufferCapacityInput is insufficient.
     * @param buffer            a pointer to an application-allocated buffer that <b>should</b> be filled with the QR code’s contents. It <b>can</b> be NULL if bufferCapacityInput is 0.
     */
    @NativeType("XrResult")
    public static int xrGetMarkerStringML(XrMarkerDetectorML markerDetector, @NativeType("XrMarkerML") long marker, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @NativeType("char *") @Nullable ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrGetMarkerStringML(markerDetector, marker, remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrCreateMarkerSpaceML ] ---

    /** Unsafe version of: {@link #xrCreateMarkerSpaceML CreateMarkerSpaceML} */
    public static int nxrCreateMarkerSpaceML(XrSession session, long createInfo, long space) {
        long __functionAddress = session.getCapabilities().xrCreateMarkerSpaceML;
        if (CHECKS) {
            check(__functionAddress);
            XrMarkerSpaceCreateInfoML.validate(createInfo);
        }
        return callPPPI(session.address(), createInfo, space, __functionAddress);
    }

    /**
     * Create an XrSpace to track a marker spatially.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateMarkerSpaceML CreateMarkerSpaceML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateMarkerSpaceML(
     *     XrSession                                   session,
     *     const XrMarkerSpaceCreateInfoML*            createInfo,
     *     XrSpace*                                    space);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Creates an {@code XrSpace} from a currently snapshotted marker. The space <b>may</b> still be used even if the marker is later not in the FOV, or even if the marker detector has been destroyed. In such a scenario, the {@link XR10#XR_SPACE_LOCATION_ORIENTATION_TRACKED_BIT SPACE_LOCATION_ORIENTATION_TRACKED_BIT} and {@link XR10#XR_SPACE_LOCATION_POSITION_TRACKED_BIT SPACE_LOCATION_POSITION_TRACKED_BIT} <b>must</b> be false, but {@link XR10#XR_SPACE_LOCATION_POSITION_VALID_BIT SPACE_LOCATION_POSITION_VALID_BIT} and {@link XR10#XR_SPACE_LOCATION_ORIENTATION_VALID_BIT SPACE_LOCATION_ORIENTATION_VALID_BIT} <b>may</b> be set as appropriate to the last known location.</p>
     * 
     * <p>Once an application has created a space, it <b>may</b> stop calling {@link #xrSnapshotMarkerDetectorML SnapshotMarkerDetectorML}, and the position of the marker <b>must</b> still be updated by the runtime whenever it is aware of a more up to date location.</p>
     * 
     * <p>If a runtime is unable to spatially locate a snapshotted marker, it <b>may</b> return {@link #XR_ERROR_MARKER_DETECTOR_LOCATE_FAILED_ML ERROR_MARKER_DETECTOR_LOCATE_FAILED_ML}. This is most likely to happen if significant time has passed since the snapshot of markers was acquired, and the marker in question is no longer in the user’s FOV. Thus, an application <b>should</b> call {@link #xrCreateMarkerSpaceML CreateMarkerSpaceML} immediately after examining a snapshot, but <b>should</b> also be prepared to try again if needed.</p>
     * 
     * <p><b>must</b> only be called when the state of the detector is {@link #XR_MARKER_DETECTOR_STATUS_READY_ML MARKER_DETECTOR_STATUS_READY_ML}.</p>
     * 
     * <p>If {@link #xrGetMarkerDetectorStateML GetMarkerDetectorStateML} has not been called and returned {@link #XR_MARKER_DETECTOR_STATUS_READY_ML MARKER_DETECTOR_STATUS_READY_ML} since the last invocation of {@link #xrSnapshotMarkerDetectorML SnapshotMarkerDetectorML}, the runtime <b>must</b> return {@link XR10#XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}.</p>
     * 
     * <p>{@code session} must be the same session that created the {@link XrMarkerSpaceCreateInfoML}{@code ::markerDetector}, else the runtime <b>must</b> return {@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}.</p>
     * 
     * <p>The runtime <b>must</b> return {@link #XR_ERROR_MARKER_INVALID_ML ERROR_MARKER_INVALID_ML} if the marker atom is invalid.</p>
     * 
     * <p>The {@code XrSpace} origin <b>must</b> be located at the marker’s center. The X-Y plane of the {@code XrSpace} <b>must</b> be aligned with the plane of the marker with the positive Z axis coming out of the marker face.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLMarkerUnderstanding XR_ML_marker_understanding} extension <b>must</b> be enabled prior to calling {@link #xrCreateMarkerSpaceML CreateMarkerSpaceML}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrMarkerSpaceCreateInfoML} structure</li>
     * <li>{@code space} <b>must</b> be a pointer to an {@code XrSpace} handle</li>
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
     * <li>{@link XR10#XR_ERROR_POSE_INVALID ERROR_POSE_INVALID}</li>
     * <li>{@link #XR_ERROR_MARKER_INVALID_ML ERROR_MARKER_INVALID_ML}</li>
     * <li>{@link #XR_ERROR_MARKER_DETECTOR_LOCATE_FAILED_ML ERROR_MARKER_DETECTOR_LOCATE_FAILED_ML}</li>
     * <li>{@link XR10#XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrMarkerSpaceCreateInfoML}, {@link #xrGetMarkersML GetMarkersML}</p>
     *
     * @param session    the session that will own the created space.
     * @param createInfo a pointer to the {@link XrMarkerSpaceCreateInfoML} used to specify the space creation parameters.
     * @param space      points to an {@code XrSpace} handle in which the resulting space is returned.
     */
    @NativeType("XrResult")
    public static int xrCreateMarkerSpaceML(XrSession session, @NativeType("XrMarkerSpaceCreateInfoML const *") XrMarkerSpaceCreateInfoML createInfo, @NativeType("XrSpace *") PointerBuffer space) {
        if (CHECKS) {
            check(space, 1);
        }
        return nxrCreateMarkerSpaceML(session, createInfo.address(), memAddress(space));
    }

}