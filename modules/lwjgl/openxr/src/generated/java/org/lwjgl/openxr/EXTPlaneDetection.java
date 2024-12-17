/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTPlaneDetection {

    public static final int XR_EXT_plane_detection_SPEC_VERSION = 2;

    public static final String XR_EXT_PLANE_DETECTION_EXTENSION_NAME = "XR_EXT_plane_detection";

    public static final int
        XR_ERROR_SPACE_NOT_LOCATABLE_EXT               = -1000429000,
        XR_ERROR_PLANE_DETECTION_PERMISSION_DENIED_EXT = -1000429001;

    public static final int XR_OBJECT_TYPE_PLANE_DETECTOR_EXT = 1000429000;

    public static final int
        XR_TYPE_PLANE_DETECTOR_CREATE_INFO_EXT        = 1000429001,
        XR_TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT         = 1000429002,
        XR_TYPE_PLANE_DETECTOR_GET_INFO_EXT           = 1000429003,
        XR_TYPE_PLANE_DETECTOR_LOCATIONS_EXT          = 1000429004,
        XR_TYPE_PLANE_DETECTOR_LOCATION_EXT           = 1000429005,
        XR_TYPE_PLANE_DETECTOR_POLYGON_BUFFER_EXT     = 1000429006,
        XR_TYPE_SYSTEM_PLANE_DETECTION_PROPERTIES_EXT = 1000429007;

    public static final int
        XR_PLANE_DETECTION_CAPABILITY_PLANE_DETECTION_BIT_EXT   = 0x1,
        XR_PLANE_DETECTION_CAPABILITY_PLANE_HOLES_BIT_EXT       = 0x2,
        XR_PLANE_DETECTION_CAPABILITY_SEMANTIC_CEILING_BIT_EXT  = 0x4,
        XR_PLANE_DETECTION_CAPABILITY_SEMANTIC_FLOOR_BIT_EXT    = 0x8,
        XR_PLANE_DETECTION_CAPABILITY_SEMANTIC_WALL_BIT_EXT     = 0x10,
        XR_PLANE_DETECTION_CAPABILITY_SEMANTIC_PLATFORM_BIT_EXT = 0x20,
        XR_PLANE_DETECTION_CAPABILITY_ORIENTATION_BIT_EXT       = 0x40;

    public static final int XR_PLANE_DETECTOR_ENABLE_CONTOUR_BIT_EXT = 0x1;

    public static final int
        XR_PLANE_DETECTOR_ORIENTATION_HORIZONTAL_UPWARD_EXT   = 0,
        XR_PLANE_DETECTOR_ORIENTATION_HORIZONTAL_DOWNWARD_EXT = 1,
        XR_PLANE_DETECTOR_ORIENTATION_VERTICAL_EXT            = 2,
        XR_PLANE_DETECTOR_ORIENTATION_ARBITRARY_EXT           = 3;

    public static final int
        XR_PLANE_DETECTOR_SEMANTIC_TYPE_UNDEFINED_EXT = 0,
        XR_PLANE_DETECTOR_SEMANTIC_TYPE_CEILING_EXT   = 1,
        XR_PLANE_DETECTOR_SEMANTIC_TYPE_FLOOR_EXT     = 2,
        XR_PLANE_DETECTOR_SEMANTIC_TYPE_WALL_EXT      = 3,
        XR_PLANE_DETECTOR_SEMANTIC_TYPE_PLATFORM_EXT  = 4;

    public static final int
        XR_PLANE_DETECTION_STATE_NONE_EXT    = 0,
        XR_PLANE_DETECTION_STATE_PENDING_EXT = 1,
        XR_PLANE_DETECTION_STATE_DONE_EXT    = 2,
        XR_PLANE_DETECTION_STATE_ERROR_EXT   = 3,
        XR_PLANE_DETECTION_STATE_FATAL_EXT   = 4;

    protected EXTPlaneDetection() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreatePlaneDetectorEXT ] ---

    /** {@code XrResult xrCreatePlaneDetectorEXT(XrSession session, XrPlaneDetectorCreateInfoEXT const * createInfo, XrPlaneDetectorEXT * planeDetector)} */
    public static int nxrCreatePlaneDetectorEXT(XrSession session, long createInfo, long planeDetector) {
        long __functionAddress = session.getCapabilities().xrCreatePlaneDetectorEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, planeDetector, __functionAddress);
    }

    /** {@code XrResult xrCreatePlaneDetectorEXT(XrSession session, XrPlaneDetectorCreateInfoEXT const * createInfo, XrPlaneDetectorEXT * planeDetector)} */
    @NativeType("XrResult")
    public static int xrCreatePlaneDetectorEXT(XrSession session, @NativeType("XrPlaneDetectorCreateInfoEXT const *") XrPlaneDetectorCreateInfoEXT createInfo, @NativeType("XrPlaneDetectorEXT *") PointerBuffer planeDetector) {
        if (CHECKS) {
            check(planeDetector, 1);
        }
        return nxrCreatePlaneDetectorEXT(session, createInfo.address(), memAddress(planeDetector));
    }

    // --- [ xrDestroyPlaneDetectorEXT ] ---

    /** {@code XrResult xrDestroyPlaneDetectorEXT(XrPlaneDetectorEXT planeDetector)} */
    @NativeType("XrResult")
    public static int xrDestroyPlaneDetectorEXT(XrPlaneDetectorEXT planeDetector) {
        long __functionAddress = planeDetector.getCapabilities().xrDestroyPlaneDetectorEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(planeDetector.address(), __functionAddress);
    }

    // --- [ xrBeginPlaneDetectionEXT ] ---

    /** {@code XrResult xrBeginPlaneDetectionEXT(XrPlaneDetectorEXT planeDetector, XrPlaneDetectorBeginInfoEXT const * beginInfo)} */
    public static int nxrBeginPlaneDetectionEXT(XrPlaneDetectorEXT planeDetector, long beginInfo) {
        long __functionAddress = planeDetector.getCapabilities().xrBeginPlaneDetectionEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrPlaneDetectorBeginInfoEXT.validate(beginInfo);
        }
        return callPPI(planeDetector.address(), beginInfo, __functionAddress);
    }

    /** {@code XrResult xrBeginPlaneDetectionEXT(XrPlaneDetectorEXT planeDetector, XrPlaneDetectorBeginInfoEXT const * beginInfo)} */
    @NativeType("XrResult")
    public static int xrBeginPlaneDetectionEXT(XrPlaneDetectorEXT planeDetector, @NativeType("XrPlaneDetectorBeginInfoEXT const *") XrPlaneDetectorBeginInfoEXT beginInfo) {
        return nxrBeginPlaneDetectionEXT(planeDetector, beginInfo.address());
    }

    // --- [ xrGetPlaneDetectionStateEXT ] ---

    /** {@code XrResult xrGetPlaneDetectionStateEXT(XrPlaneDetectorEXT planeDetector, XrPlaneDetectionStateEXT * state)} */
    public static int nxrGetPlaneDetectionStateEXT(XrPlaneDetectorEXT planeDetector, long state) {
        long __functionAddress = planeDetector.getCapabilities().xrGetPlaneDetectionStateEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(planeDetector.address(), state, __functionAddress);
    }

    /** {@code XrResult xrGetPlaneDetectionStateEXT(XrPlaneDetectorEXT planeDetector, XrPlaneDetectionStateEXT * state)} */
    @NativeType("XrResult")
    public static int xrGetPlaneDetectionStateEXT(XrPlaneDetectorEXT planeDetector, @NativeType("XrPlaneDetectionStateEXT *") IntBuffer state) {
        if (CHECKS) {
            check(state, 1);
        }
        return nxrGetPlaneDetectionStateEXT(planeDetector, memAddress(state));
    }

    // --- [ xrGetPlaneDetectionsEXT ] ---

    /** {@code XrResult xrGetPlaneDetectionsEXT(XrPlaneDetectorEXT planeDetector, XrPlaneDetectorGetInfoEXT const * info, XrPlaneDetectorLocationsEXT * locations)} */
    public static int nxrGetPlaneDetectionsEXT(XrPlaneDetectorEXT planeDetector, long info, long locations) {
        long __functionAddress = planeDetector.getCapabilities().xrGetPlaneDetectionsEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrPlaneDetectorGetInfoEXT.validate(info);
        }
        return callPPPI(planeDetector.address(), info, locations, __functionAddress);
    }

    /** {@code XrResult xrGetPlaneDetectionsEXT(XrPlaneDetectorEXT planeDetector, XrPlaneDetectorGetInfoEXT const * info, XrPlaneDetectorLocationsEXT * locations)} */
    @NativeType("XrResult")
    public static int xrGetPlaneDetectionsEXT(XrPlaneDetectorEXT planeDetector, @NativeType("XrPlaneDetectorGetInfoEXT const *") XrPlaneDetectorGetInfoEXT info, @NativeType("XrPlaneDetectorLocationsEXT *") XrPlaneDetectorLocationsEXT locations) {
        return nxrGetPlaneDetectionsEXT(planeDetector, info.address(), locations.address());
    }

    // --- [ xrGetPlanePolygonBufferEXT ] ---

    /** {@code XrResult xrGetPlanePolygonBufferEXT(XrPlaneDetectorEXT planeDetector, uint64_t planeId, uint32_t polygonBufferIndex, XrPlaneDetectorPolygonBufferEXT * polygonBuffer)} */
    public static int nxrGetPlanePolygonBufferEXT(XrPlaneDetectorEXT planeDetector, long planeId, int polygonBufferIndex, long polygonBuffer) {
        long __functionAddress = planeDetector.getCapabilities().xrGetPlanePolygonBufferEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(planeDetector.address(), planeId, polygonBufferIndex, polygonBuffer, __functionAddress);
    }

    /** {@code XrResult xrGetPlanePolygonBufferEXT(XrPlaneDetectorEXT planeDetector, uint64_t planeId, uint32_t polygonBufferIndex, XrPlaneDetectorPolygonBufferEXT * polygonBuffer)} */
    @NativeType("XrResult")
    public static int xrGetPlanePolygonBufferEXT(XrPlaneDetectorEXT planeDetector, @NativeType("uint64_t") long planeId, @NativeType("uint32_t") int polygonBufferIndex, @NativeType("XrPlaneDetectorPolygonBufferEXT *") XrPlaneDetectorPolygonBufferEXT polygonBuffer) {
        return nxrGetPlanePolygonBufferEXT(planeDetector, planeId, polygonBufferIndex, polygonBuffer.address());
    }

}