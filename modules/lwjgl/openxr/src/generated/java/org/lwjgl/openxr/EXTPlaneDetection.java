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

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_EXT_plane_detection">XR_EXT_plane_detection</a> extension.
 * 
 * <p>This extension enables applications to detect planes in the scene.</p>
 */
public class EXTPlaneDetection {

    /** The extension specification version. */
    public static final int XR_EXT_plane_detection_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_EXT_PLANE_DETECTION_EXTENSION_NAME = "XR_EXT_plane_detection";

    /**
     * Extends {@code XrResult}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_ERROR_SPACE_NOT_LOCATABLE_EXT ERROR_SPACE_NOT_LOCATABLE_EXT}</li>
     * <li>{@link #XR_ERROR_PLANE_DETECTION_PERMISSION_DENIED_EXT ERROR_PLANE_DETECTION_PERMISSION_DENIED_EXT}</li>
     * </ul>
     */
    public static final int
        XR_ERROR_SPACE_NOT_LOCATABLE_EXT               = -1000429000,
        XR_ERROR_PLANE_DETECTION_PERMISSION_DENIED_EXT = -1000429001;

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_PLANE_DETECTOR_EXT = 1000429000;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_PLANE_DETECTOR_CREATE_INFO_EXT TYPE_PLANE_DETECTOR_CREATE_INFO_EXT}</li>
     * <li>{@link #XR_TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT}</li>
     * <li>{@link #XR_TYPE_PLANE_DETECTOR_GET_INFO_EXT TYPE_PLANE_DETECTOR_GET_INFO_EXT}</li>
     * <li>{@link #XR_TYPE_PLANE_DETECTOR_LOCATIONS_EXT TYPE_PLANE_DETECTOR_LOCATIONS_EXT}</li>
     * <li>{@link #XR_TYPE_PLANE_DETECTOR_LOCATION_EXT TYPE_PLANE_DETECTOR_LOCATION_EXT}</li>
     * <li>{@link #XR_TYPE_PLANE_DETECTOR_POLYGON_BUFFER_EXT TYPE_PLANE_DETECTOR_POLYGON_BUFFER_EXT}</li>
     * <li>{@link #XR_TYPE_SYSTEM_PLANE_DETECTION_PROPERTIES_EXT TYPE_SYSTEM_PLANE_DETECTION_PROPERTIES_EXT}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_PLANE_DETECTOR_CREATE_INFO_EXT        = 1000429001,
        XR_TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT         = 1000429002,
        XR_TYPE_PLANE_DETECTOR_GET_INFO_EXT           = 1000429003,
        XR_TYPE_PLANE_DETECTOR_LOCATIONS_EXT          = 1000429004,
        XR_TYPE_PLANE_DETECTOR_LOCATION_EXT           = 1000429005,
        XR_TYPE_PLANE_DETECTOR_POLYGON_BUFFER_EXT     = 1000429006,
        XR_TYPE_SYSTEM_PLANE_DETECTION_PROPERTIES_EXT = 1000429007;

    /**
     * XrPlaneDetectionCapabilityFlagBitsEXT - Feature Flag Bits
     * 
     * <h5>Description</h5>
     * 
     * <p>The flag bits have the following meanings:</p>
     * 
     * <h5>Flag Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_PLANE_DETECTION_CAPABILITY_PLANE_DETECTION_BIT_EXT PLANE_DETECTION_CAPABILITY_PLANE_DETECTION_BIT_EXT} — plane detection is supported</li>
     * <li>{@link #XR_PLANE_DETECTION_CAPABILITY_PLANE_HOLES_BIT_EXT PLANE_DETECTION_CAPABILITY_PLANE_HOLES_BIT_EXT} — polygon buffers for holes in planes can be generated</li>
     * <li>{@link #XR_PLANE_DETECTION_CAPABILITY_SEMANTIC_CEILING_BIT_EXT PLANE_DETECTION_CAPABILITY_SEMANTIC_CEILING_BIT_EXT} — plane detection supports ceiling semantic classification</li>
     * <li>{@link #XR_PLANE_DETECTION_CAPABILITY_SEMANTIC_FLOOR_BIT_EXT PLANE_DETECTION_CAPABILITY_SEMANTIC_FLOOR_BIT_EXT} — plane detection supports floor semantic classification</li>
     * <li>{@link #XR_PLANE_DETECTION_CAPABILITY_SEMANTIC_WALL_BIT_EXT PLANE_DETECTION_CAPABILITY_SEMANTIC_WALL_BIT_EXT} — plane detection supports wall semantic classification</li>
     * <li>{@link #XR_PLANE_DETECTION_CAPABILITY_SEMANTIC_PLATFORM_BIT_EXT PLANE_DETECTION_CAPABILITY_SEMANTIC_PLATFORM_BIT_EXT} — plane detection supports platform semantic classification (for example table tops)</li>
     * <li>{@link #XR_PLANE_DETECTION_CAPABILITY_ORIENTATION_BIT_EXT PLANE_DETECTION_CAPABILITY_ORIENTATION_BIT_EXT} — plane detection supports plane orientation classification. If not supported planes are always classified as ARBITRARY.</li>
     * </ul>
     */
    public static final int
        XR_PLANE_DETECTION_CAPABILITY_PLANE_DETECTION_BIT_EXT   = 0x1,
        XR_PLANE_DETECTION_CAPABILITY_PLANE_HOLES_BIT_EXT       = 0x2,
        XR_PLANE_DETECTION_CAPABILITY_SEMANTIC_CEILING_BIT_EXT  = 0x4,
        XR_PLANE_DETECTION_CAPABILITY_SEMANTIC_FLOOR_BIT_EXT    = 0x8,
        XR_PLANE_DETECTION_CAPABILITY_SEMANTIC_WALL_BIT_EXT     = 0x10,
        XR_PLANE_DETECTION_CAPABILITY_SEMANTIC_PLATFORM_BIT_EXT = 0x20,
        XR_PLANE_DETECTION_CAPABILITY_ORIENTATION_BIT_EXT       = 0x40;

    /**
     * XrPlaneDetectorFlagBitsEXT - Plane Detector flags
     * 
     * <h5>Description</h5>
     * 
     * <p>The flag bits have the following meanings:</p>
     * 
     * <h5>Flag Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_PLANE_DETECTOR_ENABLE_CONTOUR_BIT_EXT PLANE_DETECTOR_ENABLE_CONTOUR_BIT_EXT} — populate the plane contour information</li>
     * </ul>
     */
    public static final int XR_PLANE_DETECTOR_ENABLE_CONTOUR_BIT_EXT = 0x1;

    /**
     * XrPlaneDetectorOrientationEXT - Orientation of the detected plane (upward, downward…​)
     * 
     * <h5>Description</h5>
     * 
     * <p>The enums have the following meanings:</p>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>Enum</th><th>Description</th></tr></thead>
     * <tbody>
     * <tr><td>{@link #XR_PLANE_DETECTOR_ORIENTATION_HORIZONTAL_UPWARD_EXT PLANE_DETECTOR_ORIENTATION_HORIZONTAL_UPWARD_EXT}</td><td>The detected plane is horizontal and faces upward (e.g. floor).</td></tr>
     * <tr><td>{@link #XR_PLANE_DETECTOR_ORIENTATION_HORIZONTAL_DOWNWARD_EXT PLANE_DETECTOR_ORIENTATION_HORIZONTAL_DOWNWARD_EXT}</td><td>The detected plane is horizontal and faces downward (e.g. ceiling).</td></tr>
     * <tr><td>{@link #XR_PLANE_DETECTOR_ORIENTATION_VERTICAL_EXT PLANE_DETECTOR_ORIENTATION_VERTICAL_EXT}</td><td>The detected plane is vertical (e.g. wall).</td></tr>
     * <tr><td>{@link #XR_PLANE_DETECTOR_ORIENTATION_ARBITRARY_EXT PLANE_DETECTOR_ORIENTATION_ARBITRARY_EXT}</td><td>The detected plane has an arbitrary, non-vertical and non-horizontal orientation.</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrPlaneDetectorBeginInfoEXT}, {@link XrPlaneDetectorLocationEXT}, {@link #xrGetPlaneDetectionsEXT GetPlaneDetectionsEXT}</p>
     */
    public static final int
        XR_PLANE_DETECTOR_ORIENTATION_HORIZONTAL_UPWARD_EXT   = 0,
        XR_PLANE_DETECTOR_ORIENTATION_HORIZONTAL_DOWNWARD_EXT = 1,
        XR_PLANE_DETECTOR_ORIENTATION_VERTICAL_EXT            = 2,
        XR_PLANE_DETECTOR_ORIENTATION_ARBITRARY_EXT           = 3;

    /**
     * XrPlaneDetectorSemanticTypeEXT - Type of the detected plane (upward, downward…​)
     * 
     * <h5>Description</h5>
     * 
     * <p>The enums have the following meanings:</p>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>Enum</th><th>Description</th></tr></thead>
     * <tbody>
     * <tr><td>{@link #XR_PLANE_DETECTOR_SEMANTIC_TYPE_UNDEFINED_EXT PLANE_DETECTOR_SEMANTIC_TYPE_UNDEFINED_EXT}</td><td>The runtime was unable to classify this plane.</td></tr>
     * <tr><td>{@link #XR_PLANE_DETECTOR_SEMANTIC_TYPE_CEILING_EXT PLANE_DETECTOR_SEMANTIC_TYPE_CEILING_EXT}</td><td>The detected plane is a ceiling.</td></tr>
     * <tr><td>{@link #XR_PLANE_DETECTOR_SEMANTIC_TYPE_FLOOR_EXT PLANE_DETECTOR_SEMANTIC_TYPE_FLOOR_EXT}</td><td>The detected plane is a floor.</td></tr>
     * <tr><td>{@link #XR_PLANE_DETECTOR_SEMANTIC_TYPE_WALL_EXT PLANE_DETECTOR_SEMANTIC_TYPE_WALL_EXT}</td><td>The detected plane is a wall.</td></tr>
     * <tr><td>{@link #XR_PLANE_DETECTOR_SEMANTIC_TYPE_PLATFORM_EXT PLANE_DETECTOR_SEMANTIC_TYPE_PLATFORM_EXT}</td><td>The detected plane is a platform, like a table.</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrPlaneDetectorBeginInfoEXT}, {@link XrPlaneDetectorLocationEXT}, {@link #xrGetPlaneDetectionsEXT GetPlaneDetectionsEXT}</p>
     */
    public static final int
        XR_PLANE_DETECTOR_SEMANTIC_TYPE_UNDEFINED_EXT = 0,
        XR_PLANE_DETECTOR_SEMANTIC_TYPE_CEILING_EXT   = 1,
        XR_PLANE_DETECTOR_SEMANTIC_TYPE_FLOOR_EXT     = 2,
        XR_PLANE_DETECTOR_SEMANTIC_TYPE_WALL_EXT      = 3,
        XR_PLANE_DETECTOR_SEMANTIC_TYPE_PLATFORM_EXT  = 4;

    /**
     * XrPlaneDetectionStateEXT - Plane Detection State
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_PLANE_DETECTION_STATE_NONE_EXT PLANE_DETECTION_STATE_NONE_EXT} - The plane detector is not actively looking for planes; call {@link #xrBeginPlaneDetectionEXT BeginPlaneDetectionEXT} to start detection.</li>
     * <li>{@link #XR_PLANE_DETECTION_STATE_PENDING_EXT PLANE_DETECTION_STATE_PENDING_EXT} - This plane detector is currently looking for planes but not yet ready with results; call {@link #xrGetPlaneDetectionsEXT GetPlaneDetectionsEXT} again, or call {@link #xrBeginPlaneDetectionEXT BeginPlaneDetectionEXT} to restart with new filter parameters.</li>
     * <li>{@link #XR_PLANE_DETECTION_STATE_DONE_EXT PLANE_DETECTION_STATE_DONE_EXT} - This plane detector has finished and results <b>may</b> now be retrieved. The results are valid until {@link #xrBeginPlaneDetectionEXT BeginPlaneDetectionEXT} or {@link #xrDestroyPlaneDetectorEXT DestroyPlaneDetectorEXT} are called.</li>
     * <li>{@link #XR_PLANE_DETECTION_STATE_ERROR_EXT PLANE_DETECTION_STATE_ERROR_EXT} - An error occurred. The query <b>may</b> be tried again.</li>
     * <li>{@link #XR_PLANE_DETECTION_STATE_FATAL_EXT PLANE_DETECTION_STATE_FATAL_EXT} - An error occurred. The query <b>must</b> not be tried again.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrGetPlaneDetectionStateEXT GetPlaneDetectionStateEXT}, {@link #xrGetPlaneDetectionsEXT GetPlaneDetectionsEXT}</p>
     */
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

    /** Unsafe version of: {@link #xrCreatePlaneDetectorEXT CreatePlaneDetectorEXT} */
    public static int nxrCreatePlaneDetectorEXT(XrSession session, long createInfo, long planeDetector) {
        long __functionAddress = session.getCapabilities().xrCreatePlaneDetectorEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, planeDetector, __functionAddress);
    }

    /**
     * Create a plane detection handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreatePlaneDetectorEXT CreatePlaneDetectorEXT} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreatePlaneDetectorEXT(
     *     XrSession                                   session,
     *     const XrPlaneDetectorCreateInfoEXT*         createInfo,
     *     XrPlaneDetectorEXT*                         planeDetector);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>An application creates an {@code XrPlaneDetectorEXT} handle using {@link #xrCreatePlaneDetectorEXT CreatePlaneDetectorEXT} function.</p>
     * 
     * <p>If the system does not support plane detection, the runtime <b>must</b> return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} from {@link #xrCreatePlaneDetectorEXT CreatePlaneDetectorEXT}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTPlaneDetection XR_EXT_plane_detection} extension <b>must</b> be enabled prior to calling {@link #xrCreatePlaneDetectorEXT CreatePlaneDetectorEXT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrPlaneDetectorCreateInfoEXT} structure</li>
     * <li>{@code planeDetector} <b>must</b> be a pointer to an {@code XrPlaneDetectorEXT} handle</li>
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
     * <li>{@link #XR_ERROR_PLANE_DETECTION_PERMISSION_DENIED_EXT ERROR_PLANE_DETECTION_PERMISSION_DENIED_EXT}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrPlaneDetectorCreateInfoEXT}, {@link #xrBeginPlaneDetectionEXT BeginPlaneDetectionEXT}, {@link #xrDestroyPlaneDetectorEXT DestroyPlaneDetectorEXT}</p>
     *
     * @param session       an {@code XrSession} in which the plane detection will be active.
     * @param createInfo    the {@link XrPlaneDetectorCreateInfoEXT} used to specify the plane detection.
     * @param planeDetector the returned {@code XrPlaneDetectorEXT} handle.
     */
    @NativeType("XrResult")
    public static int xrCreatePlaneDetectorEXT(XrSession session, @NativeType("XrPlaneDetectorCreateInfoEXT const *") XrPlaneDetectorCreateInfoEXT createInfo, @NativeType("XrPlaneDetectorEXT *") PointerBuffer planeDetector) {
        if (CHECKS) {
            check(planeDetector, 1);
        }
        return nxrCreatePlaneDetectorEXT(session, createInfo.address(), memAddress(planeDetector));
    }

    // --- [ xrDestroyPlaneDetectorEXT ] ---

    /**
     * Destroy a plane detection handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroyPlaneDetectorEXT DestroyPlaneDetectorEXT} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDestroyPlaneDetectorEXT(
     *     XrPlaneDetectorEXT                          planeDetector);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrDestroyPlaneDetectorEXT DestroyPlaneDetectorEXT} function releases the {@code planeDetector} and the underlying resources when finished with plane detection experiences.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTPlaneDetection XR_EXT_plane_detection} extension <b>must</b> be enabled prior to calling {@link #xrDestroyPlaneDetectorEXT DestroyPlaneDetectorEXT}</li>
     * <li>{@code planeDetector} <b>must</b> be a valid {@code XrPlaneDetectorEXT} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code planeDetector}, and any child handles, <b>must</b> be externally synchronized</li>
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
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrCreatePlaneDetectorEXT CreatePlaneDetectorEXT}</p>
     *
     * @param planeDetector an {@code XrPlaneDetectorEXT} previously created by {@link #xrCreatePlaneDetectorEXT CreatePlaneDetectorEXT}.
     */
    @NativeType("XrResult")
    public static int xrDestroyPlaneDetectorEXT(XrPlaneDetectorEXT planeDetector) {
        long __functionAddress = planeDetector.getCapabilities().xrDestroyPlaneDetectorEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(planeDetector.address(), __functionAddress);
    }

    // --- [ xrBeginPlaneDetectionEXT ] ---

    /** Unsafe version of: {@link #xrBeginPlaneDetectionEXT BeginPlaneDetectionEXT} */
    public static int nxrBeginPlaneDetectionEXT(XrPlaneDetectorEXT planeDetector, long beginInfo) {
        long __functionAddress = planeDetector.getCapabilities().xrBeginPlaneDetectionEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrPlaneDetectorBeginInfoEXT.validate(beginInfo);
        }
        return callPPI(planeDetector.address(), beginInfo, __functionAddress);
    }

    /**
     * Detect planes.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrBeginPlaneDetectionEXT BeginPlaneDetectionEXT} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrBeginPlaneDetectionEXT(
     *     XrPlaneDetectorEXT                          planeDetector,
     *     const XrPlaneDetectorBeginInfoEXT*          beginInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrBeginPlaneDetectionEXT BeginPlaneDetectionEXT} function begins the detection of planes in the scene. Detecting planes in a scene is an asynchronous operation. {@link #xrGetPlaneDetectionStateEXT GetPlaneDetectionStateEXT} <b>can</b> be used to determine if the query has finished. Once it has finished the results <b>may</b> be retrieved via {@link #xrGetPlaneDetectionsEXT GetPlaneDetectionsEXT}. If a detection has already been started on a plane detector handle, calling {@link #xrBeginPlaneDetectionEXT BeginPlaneDetectionEXT} again on the same handle will cancel the operation in progress and start a new detection with the new filter parameters.</p>
     * 
     * <p>The bounding volume is resolved and fixed relative to LOCAL space at the time of the call to {@link #xrBeginPlaneDetectionEXT BeginPlaneDetectionEXT} using {@link XrPlaneDetectorBeginInfoEXT}{@code ::baseSpace}, {@link XrPlaneDetectorBeginInfoEXT}{@code ::time}, {@link XrPlaneDetectorBeginInfoEXT}{@code ::boundingBoxPose} and {@link XrPlaneDetectorBeginInfoEXT}{@code ::boundingBoxExtent}. The runtime <b>must</b> resolve the location defined by {@code baseSpace} at the time of the call. The {@link XrPlaneDetectorBeginInfoEXT}{@code ::boundingBoxPose} is the pose of the center of the box defined by {@link XrPlaneDetectorBeginInfoEXT}{@code ::boundingBoxExtent}.</p>
     * 
     * <p>The runtime <b>must</b> return {@link #XR_ERROR_SPACE_NOT_LOCATABLE_EXT ERROR_SPACE_NOT_LOCATABLE_EXT} if the {@code baseSpace} is not locatable at the time of the call.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTPlaneDetection XR_EXT_plane_detection} extension <b>must</b> be enabled prior to calling {@link #xrBeginPlaneDetectionEXT BeginPlaneDetectionEXT}</li>
     * <li>{@code planeDetector} <b>must</b> be a valid {@code XrPlaneDetectorEXT} handle</li>
     * <li>{@code beginInfo} <b>must</b> be a pointer to a valid {@link XrPlaneDetectorBeginInfoEXT} structure</li>
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
     * <li>{@link #XR_ERROR_SPACE_NOT_LOCATABLE_EXT ERROR_SPACE_NOT_LOCATABLE_EXT}</li>
     * <li>{@link XR10#XR_ERROR_POSE_INVALID ERROR_POSE_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrPlaneDetectorBeginInfoEXT}, {@link XrPlaneDetectorGetInfoEXT}, {@link #xrGetPlaneDetectionsEXT GetPlaneDetectionsEXT}</p>
     *
     * @param planeDetector an {@code XrPlaneDetectorEXT} previously created by {@link #xrCreatePlaneDetectorEXT CreatePlaneDetectorEXT}.
     * @param beginInfo     a pointer to {@link XrPlaneDetectorBeginInfoEXT} containing plane detection parameters.
     */
    @NativeType("XrResult")
    public static int xrBeginPlaneDetectionEXT(XrPlaneDetectorEXT planeDetector, @NativeType("XrPlaneDetectorBeginInfoEXT const *") XrPlaneDetectorBeginInfoEXT beginInfo) {
        return nxrBeginPlaneDetectionEXT(planeDetector, beginInfo.address());
    }

    // --- [ xrGetPlaneDetectionStateEXT ] ---

    /** Unsafe version of: {@link #xrGetPlaneDetectionStateEXT GetPlaneDetectionStateEXT} */
    public static int nxrGetPlaneDetectionStateEXT(XrPlaneDetectorEXT planeDetector, long state) {
        long __functionAddress = planeDetector.getCapabilities().xrGetPlaneDetectionStateEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(planeDetector.address(), state, __functionAddress);
    }

    /**
     * Get the state of the plane detection pass.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetPlaneDetectionStateEXT GetPlaneDetectionStateEXT} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetPlaneDetectionStateEXT(
     *     XrPlaneDetectorEXT                          planeDetector,
     *     XrPlaneDetectionStateEXT*                   state);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrGetPlaneDetectionStateEXT GetPlaneDetectionStateEXT} function retrieves the state of the plane query and <b>must</b> be called before calling {@link #xrGetPlaneDetectionsEXT GetPlaneDetectionsEXT}.</p>
     * 
     * <p>If the plane detection has not yet finished {@code state} <b>must</b> be {@link #XR_PLANE_DETECTION_STATE_PENDING_EXT PLANE_DETECTION_STATE_PENDING_EXT}. If the plane detection has finished {@code state} <b>must</b> be {@link #XR_PLANE_DETECTION_STATE_DONE_EXT PLANE_DETECTION_STATE_DONE_EXT}. If no plane detection was previously started {@link #XR_PLANE_DETECTION_STATE_NONE_EXT PLANE_DETECTION_STATE_NONE_EXT} <b>must</b> be returned. For all three states the function <b>must</b> return {@link XR10#XR_SUCCESS SUCCESS}.</p>
     * 
     * <p>When a query error occurs the function <b>must</b> return {@link XR10#XR_SUCCESS SUCCESS} and the appropriate error state value <b>must</b> be set.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTPlaneDetection XR_EXT_plane_detection} extension <b>must</b> be enabled prior to calling {@link #xrGetPlaneDetectionStateEXT GetPlaneDetectionStateEXT}</li>
     * <li>{@code planeDetector} <b>must</b> be a valid {@code XrPlaneDetectorEXT} handle</li>
     * <li>{@code state} <b>must</b> be a pointer to an {@code XrPlaneDetectionStateEXT} value</li>
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
     * <p>{@link #xrBeginPlaneDetectionEXT BeginPlaneDetectionEXT}</p>
     *
     * @param planeDetector an {@code XrPlaneDetectorEXT} previously created by {@link #xrCreatePlaneDetectorEXT CreatePlaneDetectorEXT}.
     * @param state         a pointer to {@code XrPlaneDetectionStateEXT}.
     */
    @NativeType("XrResult")
    public static int xrGetPlaneDetectionStateEXT(XrPlaneDetectorEXT planeDetector, @NativeType("XrPlaneDetectionStateEXT *") IntBuffer state) {
        if (CHECKS) {
            check(state, 1);
        }
        return nxrGetPlaneDetectionStateEXT(planeDetector, memAddress(state));
    }

    // --- [ xrGetPlaneDetectionsEXT ] ---

    /** Unsafe version of: {@link #xrGetPlaneDetectionsEXT GetPlaneDetectionsEXT} */
    public static int nxrGetPlaneDetectionsEXT(XrPlaneDetectorEXT planeDetector, long info, long locations) {
        long __functionAddress = planeDetector.getCapabilities().xrGetPlaneDetectionsEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrPlaneDetectorGetInfoEXT.validate(info);
        }
        return callPPPI(planeDetector.address(), info, locations, __functionAddress);
    }

    /**
     * Get the detected planes.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetPlaneDetectionsEXT GetPlaneDetectionsEXT} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetPlaneDetectionsEXT(
     *     XrPlaneDetectorEXT                          planeDetector,
     *     const XrPlaneDetectorGetInfoEXT*            info,
     *     XrPlaneDetectorLocationsEXT*                locations);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrGetPlaneDetectionsEXT GetPlaneDetectionsEXT} <b>must</b> return {@link XR10#XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID} if the detector state reported by {@link #xrGetPlaneDetectionStateEXT GetPlaneDetectionStateEXT} is not {@link #XR_PLANE_DETECTION_STATE_DONE_EXT PLANE_DETECTION_STATE_DONE_EXT} for the current query started by {@link #xrBeginPlaneDetectionEXT BeginPlaneDetectionEXT}.</p>
     * 
     * <p>If the {@link XrPlaneDetectorGetInfoEXT}::baseSpace is not locatable {@link #XR_ERROR_SPACE_NOT_LOCATABLE_EXT ERROR_SPACE_NOT_LOCATABLE_EXT} <b>must</b> be returned.</p>
     * 
     * <p>Once {@link #xrBeginPlaneDetectionEXT BeginPlaneDetectionEXT} is called again, the previous results for that handle are no longer available. The application <b>should</b> cache them before calling {@link #xrBeginPlaneDetectionEXT BeginPlaneDetectionEXT} again if it needs access to that data while waiting for updated detection results.</p>
     * 
     * <p>Upon the completion of a detection cycle ({@link #xrBeginPlaneDetectionEXT BeginPlaneDetectionEXT}, {@link #xrGetPlaneDetectionStateEXT GetPlaneDetectionStateEXT} to {@link #xrGetPlaneDetectionsEXT GetPlaneDetectionsEXT}) the runtime <b>must</b> keep a snapshot of the plane data and no data <b>may</b> be modified. Calling {@link #xrGetPlaneDetectionsEXT GetPlaneDetectionsEXT} multiple times with the same baseSpace and time <b>must</b> return the same plane pose data.</p>
     * 
     * <p>The current snapshot, if any, <b>must</b> be discarded upon calling {@link #xrBeginPlaneDetectionEXT BeginPlaneDetectionEXT}.</p>
     * 
     * <p>If the {@link XrEventDataReferenceSpaceChangePending} is queued and the changeTime elapsed while the application is holding cached data the application <b>may</b> use the event data to adjusted poses accordingly.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTPlaneDetection XR_EXT_plane_detection} extension <b>must</b> be enabled prior to calling {@link #xrGetPlaneDetectionsEXT GetPlaneDetectionsEXT}</li>
     * <li>{@code planeDetector} <b>must</b> be a valid {@code XrPlaneDetectorEXT} handle</li>
     * <li>{@code info} <b>must</b> be a pointer to a valid {@link XrPlaneDetectorGetInfoEXT} structure</li>
     * <li>{@code locations} <b>must</b> be a pointer to an {@link XrPlaneDetectorLocationsEXT} structure</li>
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
     * <li>{@link #XR_ERROR_SPACE_NOT_LOCATABLE_EXT ERROR_SPACE_NOT_LOCATABLE_EXT}</li>
     * <li>{@link XR10#XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrPlaneDetectorGetInfoEXT}, {@link XrPlaneDetectorLocationsEXT}, {@link #xrBeginPlaneDetectionEXT BeginPlaneDetectionEXT}</p>
     *
     * @param planeDetector an {@code XrPlaneDetectorEXT} previously created by {@link #xrCreatePlaneDetectorEXT CreatePlaneDetectorEXT}.
     * @param info          a pointer to {@link XrPlaneDetectorGetInfoEXT}.
     * @param locations     a pointer to {@link XrPlaneDetectorLocationsEXT} receiving the returned plane locations.
     */
    @NativeType("XrResult")
    public static int xrGetPlaneDetectionsEXT(XrPlaneDetectorEXT planeDetector, @NativeType("XrPlaneDetectorGetInfoEXT const *") XrPlaneDetectorGetInfoEXT info, @NativeType("XrPlaneDetectorLocationsEXT *") XrPlaneDetectorLocationsEXT locations) {
        return nxrGetPlaneDetectionsEXT(planeDetector, info.address(), locations.address());
    }

    // --- [ xrGetPlanePolygonBufferEXT ] ---

    /** Unsafe version of: {@link #xrGetPlanePolygonBufferEXT GetPlanePolygonBufferEXT} */
    public static int nxrGetPlanePolygonBufferEXT(XrPlaneDetectorEXT planeDetector, long planeId, int polygonBufferIndex, long polygonBuffer) {
        long __functionAddress = planeDetector.getCapabilities().xrGetPlanePolygonBufferEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(planeDetector.address(), planeId, polygonBufferIndex, polygonBuffer, __functionAddress);
    }

    /**
     * Gets the plane.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetPlanePolygonBufferEXT GetPlanePolygonBufferEXT} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetPlanePolygonBufferEXT(
     *     XrPlaneDetectorEXT                          planeDetector,
     *     uint64_t                                    planeId,
     *     uint32_t                                    polygonBufferIndex,
     *     XrPlaneDetectorPolygonBufferEXT*            polygonBuffer);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrGetPlanePolygonBufferEXT GetPlanePolygonBufferEXT} function retrieves the plane’s polygon buffer for the given {@code planeId} and {@code polygonBufferIndex}. Calling {@link #xrGetPlanePolygonBufferEXT GetPlanePolygonBufferEXT} with {@code polygonBufferIndex} equal to 0 <b>must</b> return the outside contour, if available. Calls with non-zero indices less than {@link XrPlaneDetectorLocationEXT}{@code ::polygonBufferCount} <b>must</b> return polygons corresponding to holes in the plane. This feature <b>may</b> not be supported by all runtimes, check the {@link XrSystemPlaneDetectionPropertiesEXT}{@code ::supportedFeatures} for support.</p>
     * 
     * <p>Outside contour polygon vertices <b>must</b> be ordered in counter clockwise order. Vertices of holes <b>must</b> be ordered in clockwise order. The right-hand rule is used to determine the direction of the normal of this plane. The polygon contour data is relative to the pose of the plane and coplanar with it.</p>
     * 
     * <p>This function only retrieves polygons, which means that it needs to be converted to a regular mesh to be rendered.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link EXTPlaneDetection XR_EXT_plane_detection} extension <b>must</b> be enabled prior to calling {@link #xrGetPlanePolygonBufferEXT GetPlanePolygonBufferEXT}</li>
     * <li>{@code planeDetector} <b>must</b> be a valid {@code XrPlaneDetectorEXT} handle</li>
     * <li>{@code polygonBuffer} <b>must</b> be a pointer to an {@link XrPlaneDetectorPolygonBufferEXT} structure</li>
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
     * <p>{@link XrPlaneDetectorPolygonBufferEXT}, {@link #xrGetPlaneDetectionsEXT GetPlaneDetectionsEXT}</p>
     *
     * @param planeDetector      an {@code XrPlaneDetectorEXT} previously created by {@link #xrCreatePlaneDetectorEXT CreatePlaneDetectorEXT}.
     * @param planeId            the {@link XrPlaneDetectorLocationEXT}{@code ::planeId}.
     * @param polygonBufferIndex the index of the polygon contour buffer to retrieve. This <b>must</b> be a number from 0 to {@link XrPlaneDetectorLocationEXT}:polygonBufferCount -1. Index 0 retrieves the outside contour, larger indexes retrieve holes in the plane.
     * @param polygonBuffer      a pointer to {@link XrPlaneDetectorPolygonBufferEXT} receiving the returned plane polygon buffer.
     */
    @NativeType("XrResult")
    public static int xrGetPlanePolygonBufferEXT(XrPlaneDetectorEXT planeDetector, @NativeType("uint64_t") long planeId, @NativeType("uint32_t") int polygonBufferIndex, @NativeType("XrPlaneDetectorPolygonBufferEXT *") XrPlaneDetectorPolygonBufferEXT polygonBuffer) {
        return nxrGetPlanePolygonBufferEXT(planeDetector, planeId, polygonBufferIndex, polygonBuffer.address());
    }

}