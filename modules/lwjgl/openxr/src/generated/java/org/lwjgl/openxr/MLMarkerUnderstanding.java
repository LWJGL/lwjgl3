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

public class MLMarkerUnderstanding {

    public static final int XR_ML_marker_understanding_SPEC_VERSION = 1;

    public static final String XR_ML_MARKER_UNDERSTANDING_EXTENSION_NAME = "XR_ML_marker_understanding";

    public static final int XR_OBJECT_TYPE_MARKER_DETECTOR_ML = 1000138000;

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

    public static final int
        XR_ERROR_MARKER_DETECTOR_PERMISSION_DENIED_ML   = -1000138000,
        XR_ERROR_MARKER_DETECTOR_LOCATE_FAILED_ML       = -1000138001,
        XR_ERROR_MARKER_DETECTOR_INVALID_DATA_QUERY_ML  = -1000138002,
        XR_ERROR_MARKER_DETECTOR_INVALID_CREATE_INFO_ML = -1000138003,
        XR_ERROR_MARKER_INVALID_ML                      = -1000138004;

    public static final int
        XR_MARKER_DETECTOR_PROFILE_DEFAULT_ML       = 0,
        XR_MARKER_DETECTOR_PROFILE_SPEED_ML         = 1,
        XR_MARKER_DETECTOR_PROFILE_ACCURACY_ML      = 2,
        XR_MARKER_DETECTOR_PROFILE_SMALL_TARGETS_ML = 3,
        XR_MARKER_DETECTOR_PROFILE_LARGE_FOV_ML     = 4,
        XR_MARKER_DETECTOR_PROFILE_CUSTOM_ML        = 5;

    public static final int
        XR_MARKER_TYPE_ARUCO_ML     = 0,
        XR_MARKER_TYPE_APRIL_TAG_ML = 1,
        XR_MARKER_TYPE_QR_ML        = 2,
        XR_MARKER_TYPE_EAN_13_ML    = 3,
        XR_MARKER_TYPE_UPC_A_ML     = 4,
        XR_MARKER_TYPE_CODE_128_ML  = 5;

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

    public static final int
        XR_MARKER_APRIL_TAG_DICT_16H5_ML  = 0,
        XR_MARKER_APRIL_TAG_DICT_25H9_ML  = 1,
        XR_MARKER_APRIL_TAG_DICT_36H10_ML = 2,
        XR_MARKER_APRIL_TAG_DICT_36H11_ML = 3;

    public static final int
        XR_MARKER_DETECTOR_FPS_LOW_ML    = 0,
        XR_MARKER_DETECTOR_FPS_MEDIUM_ML = 1,
        XR_MARKER_DETECTOR_FPS_HIGH_ML   = 2,
        XR_MARKER_DETECTOR_FPS_MAX_ML    = 3;

    public static final int
        XR_MARKER_DETECTOR_RESOLUTION_LOW_ML    = 0,
        XR_MARKER_DETECTOR_RESOLUTION_MEDIUM_ML = 1,
        XR_MARKER_DETECTOR_RESOLUTION_HIGH_ML   = 2;

    public static final int
        XR_MARKER_DETECTOR_CAMERA_RGB_CAMERA_ML    = 0,
        XR_MARKER_DETECTOR_CAMERA_WORLD_CAMERAS_ML = 1;

    public static final int
        XR_MARKER_DETECTOR_CORNER_REFINE_METHOD_NONE_ML      = 0,
        XR_MARKER_DETECTOR_CORNER_REFINE_METHOD_SUBPIX_ML    = 1,
        XR_MARKER_DETECTOR_CORNER_REFINE_METHOD_CONTOUR_ML   = 2,
        XR_MARKER_DETECTOR_CORNER_REFINE_METHOD_APRIL_TAG_ML = 3;

    public static final int
        XR_MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_MAX_ML    = 0,
        XR_MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_FAST_ML   = 1,
        XR_MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_MEDIUM_ML = 2,
        XR_MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_SLOW_ML   = 3;

    public static final int
        XR_MARKER_DETECTOR_STATUS_PENDING_ML = 0,
        XR_MARKER_DETECTOR_STATUS_READY_ML   = 1,
        XR_MARKER_DETECTOR_STATUS_ERROR_ML   = 2;

    protected MLMarkerUnderstanding() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateMarkerDetectorML ] ---

    /** {@code XrResult xrCreateMarkerDetectorML(XrSession session, XrMarkerDetectorCreateInfoML const * createInfo, XrMarkerDetectorML * markerDetector)} */
    public static int nxrCreateMarkerDetectorML(XrSession session, long createInfo, long markerDetector) {
        long __functionAddress = session.getCapabilities().xrCreateMarkerDetectorML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, markerDetector, __functionAddress);
    }

    /** {@code XrResult xrCreateMarkerDetectorML(XrSession session, XrMarkerDetectorCreateInfoML const * createInfo, XrMarkerDetectorML * markerDetector)} */
    @NativeType("XrResult")
    public static int xrCreateMarkerDetectorML(XrSession session, @NativeType("XrMarkerDetectorCreateInfoML const *") XrMarkerDetectorCreateInfoML createInfo, @NativeType("XrMarkerDetectorML *") PointerBuffer markerDetector) {
        if (CHECKS) {
            check(markerDetector, 1);
        }
        return nxrCreateMarkerDetectorML(session, createInfo.address(), memAddress(markerDetector));
    }

    // --- [ xrDestroyMarkerDetectorML ] ---

    /** {@code XrResult xrDestroyMarkerDetectorML(XrMarkerDetectorML markerDetector)} */
    @NativeType("XrResult")
    public static int xrDestroyMarkerDetectorML(XrMarkerDetectorML markerDetector) {
        long __functionAddress = markerDetector.getCapabilities().xrDestroyMarkerDetectorML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(markerDetector.address(), __functionAddress);
    }

    // --- [ xrSnapshotMarkerDetectorML ] ---

    /** {@code XrResult xrSnapshotMarkerDetectorML(XrMarkerDetectorML markerDetector, XrMarkerDetectorSnapshotInfoML * snapshotInfo)} */
    public static int nxrSnapshotMarkerDetectorML(XrMarkerDetectorML markerDetector, long snapshotInfo) {
        long __functionAddress = markerDetector.getCapabilities().xrSnapshotMarkerDetectorML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(markerDetector.address(), snapshotInfo, __functionAddress);
    }

    /** {@code XrResult xrSnapshotMarkerDetectorML(XrMarkerDetectorML markerDetector, XrMarkerDetectorSnapshotInfoML * snapshotInfo)} */
    @NativeType("XrResult")
    public static int xrSnapshotMarkerDetectorML(XrMarkerDetectorML markerDetector, @NativeType("XrMarkerDetectorSnapshotInfoML *") XrMarkerDetectorSnapshotInfoML snapshotInfo) {
        return nxrSnapshotMarkerDetectorML(markerDetector, snapshotInfo.address());
    }

    // --- [ xrGetMarkerDetectorStateML ] ---

    /** {@code XrResult xrGetMarkerDetectorStateML(XrMarkerDetectorML markerDetector, XrMarkerDetectorStateML * state)} */
    public static int nxrGetMarkerDetectorStateML(XrMarkerDetectorML markerDetector, long state) {
        long __functionAddress = markerDetector.getCapabilities().xrGetMarkerDetectorStateML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(markerDetector.address(), state, __functionAddress);
    }

    /** {@code XrResult xrGetMarkerDetectorStateML(XrMarkerDetectorML markerDetector, XrMarkerDetectorStateML * state)} */
    @NativeType("XrResult")
    public static int xrGetMarkerDetectorStateML(XrMarkerDetectorML markerDetector, @NativeType("XrMarkerDetectorStateML *") XrMarkerDetectorStateML state) {
        return nxrGetMarkerDetectorStateML(markerDetector, state.address());
    }

    // --- [ xrGetMarkersML ] ---

    /** {@code XrResult xrGetMarkersML(XrMarkerDetectorML markerDetector, uint32_t markerCapacityInput, uint32_t * markerCountOutput, XrMarkerML * markers)} */
    public static int nxrGetMarkersML(XrMarkerDetectorML markerDetector, int markerCapacityInput, long markerCountOutput, long markers) {
        long __functionAddress = markerDetector.getCapabilities().xrGetMarkersML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(markerDetector.address(), markerCapacityInput, markerCountOutput, markers, __functionAddress);
    }

    /** {@code XrResult xrGetMarkersML(XrMarkerDetectorML markerDetector, uint32_t markerCapacityInput, uint32_t * markerCountOutput, XrMarkerML * markers)} */
    @NativeType("XrResult")
    public static int xrGetMarkersML(XrMarkerDetectorML markerDetector, @NativeType("uint32_t *") IntBuffer markerCountOutput, @NativeType("XrMarkerML *") @Nullable LongBuffer markers) {
        if (CHECKS) {
            check(markerCountOutput, 1);
        }
        return nxrGetMarkersML(markerDetector, remainingSafe(markers), memAddress(markerCountOutput), memAddressSafe(markers));
    }

    // --- [ xrGetMarkerReprojectionErrorML ] ---

    /** {@code XrResult xrGetMarkerReprojectionErrorML(XrMarkerDetectorML markerDetector, XrMarkerML marker, float * reprojectionErrorMeters)} */
    public static int nxrGetMarkerReprojectionErrorML(XrMarkerDetectorML markerDetector, long marker, long reprojectionErrorMeters) {
        long __functionAddress = markerDetector.getCapabilities().xrGetMarkerReprojectionErrorML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(markerDetector.address(), marker, reprojectionErrorMeters, __functionAddress);
    }

    /** {@code XrResult xrGetMarkerReprojectionErrorML(XrMarkerDetectorML markerDetector, XrMarkerML marker, float * reprojectionErrorMeters)} */
    @NativeType("XrResult")
    public static int xrGetMarkerReprojectionErrorML(XrMarkerDetectorML markerDetector, @NativeType("XrMarkerML") long marker, @NativeType("float *") FloatBuffer reprojectionErrorMeters) {
        if (CHECKS) {
            check(reprojectionErrorMeters, 1);
        }
        return nxrGetMarkerReprojectionErrorML(markerDetector, marker, memAddress(reprojectionErrorMeters));
    }

    // --- [ xrGetMarkerLengthML ] ---

    /** {@code XrResult xrGetMarkerLengthML(XrMarkerDetectorML markerDetector, XrMarkerML marker, float * meters)} */
    public static int nxrGetMarkerLengthML(XrMarkerDetectorML markerDetector, long marker, long meters) {
        long __functionAddress = markerDetector.getCapabilities().xrGetMarkerLengthML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(markerDetector.address(), marker, meters, __functionAddress);
    }

    /** {@code XrResult xrGetMarkerLengthML(XrMarkerDetectorML markerDetector, XrMarkerML marker, float * meters)} */
    @NativeType("XrResult")
    public static int xrGetMarkerLengthML(XrMarkerDetectorML markerDetector, @NativeType("XrMarkerML") long marker, @NativeType("float *") FloatBuffer meters) {
        if (CHECKS) {
            check(meters, 1);
        }
        return nxrGetMarkerLengthML(markerDetector, marker, memAddress(meters));
    }

    // --- [ xrGetMarkerNumberML ] ---

    /** {@code XrResult xrGetMarkerNumberML(XrMarkerDetectorML markerDetector, XrMarkerML marker, uint64_t * number)} */
    public static int nxrGetMarkerNumberML(XrMarkerDetectorML markerDetector, long marker, long number) {
        long __functionAddress = markerDetector.getCapabilities().xrGetMarkerNumberML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(markerDetector.address(), marker, number, __functionAddress);
    }

    /** {@code XrResult xrGetMarkerNumberML(XrMarkerDetectorML markerDetector, XrMarkerML marker, uint64_t * number)} */
    @NativeType("XrResult")
    public static int xrGetMarkerNumberML(XrMarkerDetectorML markerDetector, @NativeType("XrMarkerML") long marker, @NativeType("uint64_t *") LongBuffer number) {
        if (CHECKS) {
            check(number, 1);
        }
        return nxrGetMarkerNumberML(markerDetector, marker, memAddress(number));
    }

    // --- [ xrGetMarkerStringML ] ---

    /** {@code XrResult xrGetMarkerStringML(XrMarkerDetectorML markerDetector, XrMarkerML marker, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, char * buffer)} */
    public static int nxrGetMarkerStringML(XrMarkerDetectorML markerDetector, long marker, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = markerDetector.getCapabilities().xrGetMarkerStringML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(markerDetector.address(), marker, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /** {@code XrResult xrGetMarkerStringML(XrMarkerDetectorML markerDetector, XrMarkerML marker, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, char * buffer)} */
    @NativeType("XrResult")
    public static int xrGetMarkerStringML(XrMarkerDetectorML markerDetector, @NativeType("XrMarkerML") long marker, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @NativeType("char *") @Nullable ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrGetMarkerStringML(markerDetector, marker, remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrCreateMarkerSpaceML ] ---

    /** {@code XrResult xrCreateMarkerSpaceML(XrSession session, XrMarkerSpaceCreateInfoML const * createInfo, XrSpace * space)} */
    public static int nxrCreateMarkerSpaceML(XrSession session, long createInfo, long space) {
        long __functionAddress = session.getCapabilities().xrCreateMarkerSpaceML;
        if (CHECKS) {
            check(__functionAddress);
            XrMarkerSpaceCreateInfoML.validate(createInfo);
        }
        return callPPPI(session.address(), createInfo, space, __functionAddress);
    }

    /** {@code XrResult xrCreateMarkerSpaceML(XrSession session, XrMarkerSpaceCreateInfoML const * createInfo, XrSpace * space)} */
    @NativeType("XrResult")
    public static int xrCreateMarkerSpaceML(XrSession session, @NativeType("XrMarkerSpaceCreateInfoML const *") XrMarkerSpaceCreateInfoML createInfo, @NativeType("XrSpace *") PointerBuffer space) {
        if (CHECKS) {
            check(space, 1);
        }
        return nxrCreateMarkerSpaceML(session, createInfo.address(), memAddress(space));
    }

}