/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_plane_detection = "EXTPlaneDetection".nativeClassXR("EXT_plane_detection", type = "instance", postfix = "EXT") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_EXT_plane_detection">XR_EXT_plane_detection</a> extension.

        This extension enables applications to detect planes in the scene.
        """

    IntConstant(
        "The extension specification version.",

        "EXT_plane_detection_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_PLANE_DETECTION_EXTENSION_NAME".."XR_EXT_plane_detection"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_SPACE_NOT_LOCATABLE_EXT".."-1000429000",
        "ERROR_PLANE_DETECTION_PERMISSION_DENIED_EXT".."-1000429001"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_PLANE_DETECTOR_EXT".."1000429000"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_PLANE_DETECTOR_CREATE_INFO_EXT".."1000429001",
        "TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT".."1000429002",
        "TYPE_PLANE_DETECTOR_GET_INFO_EXT".."1000429003",
        "TYPE_PLANE_DETECTOR_LOCATIONS_EXT".."1000429004",
        "TYPE_PLANE_DETECTOR_LOCATION_EXT".."1000429005",
        "TYPE_PLANE_DETECTOR_POLYGON_BUFFER_EXT".."1000429006",
        "TYPE_SYSTEM_PLANE_DETECTION_PROPERTIES_EXT".."1000429007"
    )

    EnumConstant(
        """
        XrPlaneDetectionCapabilityFlagBitsEXT - Feature Flag Bits

        <h5>Description</h5>
        The flag bits have the following meanings:

        <h5>Flag Descriptions</h5>
        <ul>
            <li>#PLANE_DETECTION_CAPABILITY_PLANE_DETECTION_BIT_EXT — plane detection is supported</li>
            <li>#PLANE_DETECTION_CAPABILITY_PLANE_HOLES_BIT_EXT — polygon buffers for holes in planes can be generated</li>
            <li>#PLANE_DETECTION_CAPABILITY_SEMANTIC_CEILING_BIT_EXT — plane detection supports ceiling semantic classification</li>
            <li>#PLANE_DETECTION_CAPABILITY_SEMANTIC_FLOOR_BIT_EXT — plane detection supports floor semantic classification</li>
            <li>#PLANE_DETECTION_CAPABILITY_SEMANTIC_WALL_BIT_EXT — plane detection supports wall semantic classification</li>
            <li>#PLANE_DETECTION_CAPABILITY_SEMANTIC_PLATFORM_BIT_EXT — plane detection supports platform semantic classification (for example table tops)</li>
            <li>#PLANE_DETECTION_CAPABILITY_ORIENTATION_BIT_EXT — plane detection supports plane orientation classification. If not supported planes are always classified as ARBITRARY.</li>
        </ul>
        """,

        "PLANE_DETECTION_CAPABILITY_PLANE_DETECTION_BIT_EXT".enum(0x00000001),
        "PLANE_DETECTION_CAPABILITY_PLANE_HOLES_BIT_EXT".enum(0x00000002),
        "PLANE_DETECTION_CAPABILITY_SEMANTIC_CEILING_BIT_EXT".enum(0x00000004),
        "PLANE_DETECTION_CAPABILITY_SEMANTIC_FLOOR_BIT_EXT".enum(0x00000008),
        "PLANE_DETECTION_CAPABILITY_SEMANTIC_WALL_BIT_EXT".enum(0x00000010),
        "PLANE_DETECTION_CAPABILITY_SEMANTIC_PLATFORM_BIT_EXT".enum(0x00000020),
        "PLANE_DETECTION_CAPABILITY_ORIENTATION_BIT_EXT".enum(0x00000040)
    )

    EnumConstant(
        """
        XrPlaneDetectorFlagBitsEXT - Plane Detector flags

        <h5>Description</h5>
        The flag bits have the following meanings:

        <h5>Flag Descriptions</h5>
        <ul>
            <li>#PLANE_DETECTOR_ENABLE_CONTOUR_BIT_EXT — populate the plane contour information</li>
        </ul>
        """,

        "PLANE_DETECTOR_ENABLE_CONTOUR_BIT_EXT".enum(0x00000001)
    )

    EnumConstant(
        """
        XrPlaneDetectorOrientationEXT - Orientation of the detected plane (upward, downward…​)

        <h5>Description</h5>
        The enums have the following meanings:

        <table class="lwjgl">
            <thead><tr><th>Enum</th><th>Description</th></tr></thead>
            <tbody>
                <tr><td>#PLANE_DETECTOR_ORIENTATION_HORIZONTAL_UPWARD_EXT</td><td>The detected plane is horizontal and faces upward (e.g. floor).</td></tr>
                <tr><td>#PLANE_DETECTOR_ORIENTATION_HORIZONTAL_DOWNWARD_EXT</td><td>The detected plane is horizontal and faces downward (e.g. ceiling).</td></tr>
                <tr><td>#PLANE_DETECTOR_ORIENTATION_VERTICAL_EXT</td><td>The detected plane is vertical (e.g. wall).</td></tr>
                <tr><td>#PLANE_DETECTOR_ORIENTATION_ARBITRARY_EXT</td><td>The detected plane has an arbitrary, non-vertical and non-horizontal orientation.</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        ##XrPlaneDetectorBeginInfoEXT, ##XrPlaneDetectorLocationEXT, #GetPlaneDetectionsEXT()
        """,

        "PLANE_DETECTOR_ORIENTATION_HORIZONTAL_UPWARD_EXT".."0",
        "PLANE_DETECTOR_ORIENTATION_HORIZONTAL_DOWNWARD_EXT".."1",
        "PLANE_DETECTOR_ORIENTATION_VERTICAL_EXT".."2",
        "PLANE_DETECTOR_ORIENTATION_ARBITRARY_EXT".."3"
    )

    EnumConstant(
        """
        XrPlaneDetectorSemanticTypeEXT - Type of the detected plane (upward, downward…​)

        <h5>Description</h5>
        The enums have the following meanings:

        <table class="lwjgl">
            <thead><tr><th>Enum</th><th>Description</th></tr></thead>
            <tbody>
                <tr><td>#PLANE_DETECTOR_SEMANTIC_TYPE_UNDEFINED_EXT</td><td>The runtime was unable to classify this plane.</td></tr>
                <tr><td>#PLANE_DETECTOR_SEMANTIC_TYPE_CEILING_EXT</td><td>The detected plane is a ceiling.</td></tr>
                <tr><td>#PLANE_DETECTOR_SEMANTIC_TYPE_FLOOR_EXT</td><td>The detected plane is a floor.</td></tr>
                <tr><td>#PLANE_DETECTOR_SEMANTIC_TYPE_WALL_EXT</td><td>The detected plane is a wall.</td></tr>
                <tr><td>#PLANE_DETECTOR_SEMANTIC_TYPE_PLATFORM_EXT</td><td>The detected plane is a platform, like a table.</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        ##XrPlaneDetectorBeginInfoEXT, ##XrPlaneDetectorLocationEXT, #GetPlaneDetectionsEXT()
        """,

        "PLANE_DETECTOR_SEMANTIC_TYPE_UNDEFINED_EXT".."0",
        "PLANE_DETECTOR_SEMANTIC_TYPE_CEILING_EXT".."1",
        "PLANE_DETECTOR_SEMANTIC_TYPE_FLOOR_EXT".."2",
        "PLANE_DETECTOR_SEMANTIC_TYPE_WALL_EXT".."3",
        "PLANE_DETECTOR_SEMANTIC_TYPE_PLATFORM_EXT".."4"
    )

    EnumConstant(
        """
        XrPlaneDetectionStateEXT - Plane Detection State

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#PLANE_DETECTION_STATE_NONE_EXT - The plane detector is not actively looking for planes; call #BeginPlaneDetectionEXT() to start detection.</li>
            <li>#PLANE_DETECTION_STATE_PENDING_EXT - This plane detector is currently looking for planes but not yet ready with results; call #GetPlaneDetectionsEXT() again, or call #BeginPlaneDetectionEXT() to restart with new filter parameters.</li>
            <li>#PLANE_DETECTION_STATE_DONE_EXT - This plane detector has finished and results <b>may</b> now be retrieved. The results are valid until #BeginPlaneDetectionEXT() or #DestroyPlaneDetectorEXT() are called.</li>
            <li>#PLANE_DETECTION_STATE_ERROR_EXT - An error occurred. The query <b>may</b> be tried again.</li>
            <li>#PLANE_DETECTION_STATE_FATAL_EXT - An error occurred. The query <b>must</b> not be tried again.</li>
        </ul>

        <h5>See Also</h5>
        #GetPlaneDetectionStateEXT(), #GetPlaneDetectionsEXT()
        """,

        "PLANE_DETECTION_STATE_NONE_EXT".."0",
        "PLANE_DETECTION_STATE_PENDING_EXT".."1",
        "PLANE_DETECTION_STATE_DONE_EXT".."2",
        "PLANE_DETECTION_STATE_ERROR_EXT".."3",
        "PLANE_DETECTION_STATE_FATAL_EXT".."4"
    )

    XrResult(
        "CreatePlaneDetectorEXT",
        """
        Create a plane detection handle.

        <h5>C Specification</h5>
        The #CreatePlaneDetectorEXT() function is defined as:

        <pre><code>
￿XrResult xrCreatePlaneDetectorEXT(
￿    XrSession                                   session,
￿    const XrPlaneDetectorCreateInfoEXT*         createInfo,
￿    XrPlaneDetectorEXT*                         planeDetector);</code></pre>

        <h5>Description</h5>
        An application creates an {@code XrPlaneDetectorEXT} handle using #CreatePlaneDetectorEXT() function.

        If the system does not support plane detection, the runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED from #CreatePlaneDetectorEXT().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTPlaneDetection XR_EXT_plane_detection} extension <b>must</b> be enabled prior to calling #CreatePlaneDetectorEXT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrPlaneDetectorCreateInfoEXT structure</li>
            <li>{@code planeDetector} <b>must</b> be a pointer to an {@code XrPlaneDetectorEXT} handle</li>
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
                <li>#ERROR_PLANE_DETECTION_PERMISSION_DENIED_EXT</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrPlaneDetectorCreateInfoEXT, #BeginPlaneDetectionEXT(), #DestroyPlaneDetectorEXT()
        """,

        XrSession("session", "an {@code XrSession} in which the plane detection will be active."),
        XrPlaneDetectorCreateInfoEXT.const.p("createInfo", "the ##XrPlaneDetectorCreateInfoEXT used to specify the plane detection."),
        Check(1)..XrPlaneDetectorEXT.p("planeDetector", "the returned {@code XrPlaneDetectorEXT} handle.")
    )

    XrResult(
        "DestroyPlaneDetectorEXT",
        """
        Destroy a plane detection handle.

        <h5>C Specification</h5>
        The #DestroyPlaneDetectorEXT() function is defined as:

        <pre><code>
￿XrResult xrDestroyPlaneDetectorEXT(
￿    XrPlaneDetectorEXT                          planeDetector);</code></pre>

        <h5>Description</h5>
        #DestroyPlaneDetectorEXT() function releases the {@code planeDetector} and the underlying resources when finished with plane detection experiences.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTPlaneDetection XR_EXT_plane_detection} extension <b>must</b> be enabled prior to calling #DestroyPlaneDetectorEXT()</li>
            <li>{@code planeDetector} <b>must</b> be a valid {@code XrPlaneDetectorEXT} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code planeDetector}, and any child handles, <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #CreatePlaneDetectorEXT()
        """,

        XrPlaneDetectorEXT("planeDetector", "an {@code XrPlaneDetectorEXT} previously created by #CreatePlaneDetectorEXT().")
    )

    XrResult(
        "BeginPlaneDetectionEXT",
        """
        Detect planes.

        <h5>C Specification</h5>
        The #BeginPlaneDetectionEXT() function is defined as:

        <pre><code>
￿XrResult xrBeginPlaneDetectionEXT(
￿    XrPlaneDetectorEXT                          planeDetector,
￿    const XrPlaneDetectorBeginInfoEXT*          beginInfo);</code></pre>

        <h5>Description</h5>
        The #BeginPlaneDetectionEXT() function begins the detection of planes in the scene. Detecting planes in a scene is an asynchronous operation. #GetPlaneDetectionStateEXT() <b>can</b> be used to determine if the query has finished. Once it has finished the results <b>may</b> be retrieved via #GetPlaneDetectionsEXT(). If a detection has already been started on a plane detector handle, calling #BeginPlaneDetectionEXT() again on the same handle will cancel the operation in progress and start a new detection with the new filter parameters.

        The bounding volume is resolved and fixed relative to LOCAL space at the time of the call to #BeginPlaneDetectionEXT() using ##XrPlaneDetectorBeginInfoEXT{@code ::baseSpace}, ##XrPlaneDetectorBeginInfoEXT{@code ::time}, ##XrPlaneDetectorBeginInfoEXT{@code ::boundingBoxPose} and ##XrPlaneDetectorBeginInfoEXT{@code ::boundingBoxExtent}. The runtime <b>must</b> resolve the location defined by {@code baseSpace} at the time of the call. The ##XrPlaneDetectorBeginInfoEXT{@code ::boundingBoxPose} is the pose of the center of the box defined by ##XrPlaneDetectorBeginInfoEXT{@code ::boundingBoxExtent}.

        The runtime <b>must</b> return #ERROR_SPACE_NOT_LOCATABLE_EXT if the {@code baseSpace} is not locatable at the time of the call.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTPlaneDetection XR_EXT_plane_detection} extension <b>must</b> be enabled prior to calling #BeginPlaneDetectionEXT()</li>
            <li>{@code planeDetector} <b>must</b> be a valid {@code XrPlaneDetectorEXT} handle</li>
            <li>{@code beginInfo} <b>must</b> be a pointer to a valid ##XrPlaneDetectorBeginInfoEXT structure</li>
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
                <li>#ERROR_TIME_INVALID</li>
                <li>#ERROR_SPACE_NOT_LOCATABLE_EXT</li>
                <li>#ERROR_POSE_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrPlaneDetectorBeginInfoEXT, ##XrPlaneDetectorGetInfoEXT, #GetPlaneDetectionsEXT()
        """,

        XrPlaneDetectorEXT("planeDetector", "an {@code XrPlaneDetectorEXT} previously created by #CreatePlaneDetectorEXT()."),
        XrPlaneDetectorBeginInfoEXT.const.p("beginInfo", "a pointer to ##XrPlaneDetectorBeginInfoEXT containing plane detection parameters.")
    )

    XrResult(
        "GetPlaneDetectionStateEXT",
        """
        Get the state of the plane detection pass.

        <h5>C Specification</h5>
        The #GetPlaneDetectionStateEXT() function is defined as:

        <pre><code>
￿XrResult xrGetPlaneDetectionStateEXT(
￿    XrPlaneDetectorEXT                          planeDetector,
￿    XrPlaneDetectionStateEXT*                   state);</code></pre>

        <h5>Description</h5>
        The #GetPlaneDetectionStateEXT() function retrieves the state of the plane query and <b>must</b> be called before calling #GetPlaneDetectionsEXT().

        If the plane detection has not yet finished {@code state} <b>must</b> be #PLANE_DETECTION_STATE_PENDING_EXT. If the plane detection has finished {@code state} <b>must</b> be #PLANE_DETECTION_STATE_DONE_EXT. If no plane detection was previously started #PLANE_DETECTION_STATE_NONE_EXT <b>must</b> be returned. For all three states the function <b>must</b> return #SUCCESS.

        When a query error occurs the function <b>must</b> return #SUCCESS and the appropriate error state value <b>must</b> be set.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTPlaneDetection XR_EXT_plane_detection} extension <b>must</b> be enabled prior to calling #GetPlaneDetectionStateEXT()</li>
            <li>{@code planeDetector} <b>must</b> be a valid {@code XrPlaneDetectorEXT} handle</li>
            <li>{@code state} <b>must</b> be a pointer to an {@code XrPlaneDetectionStateEXT} value</li>
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
        #BeginPlaneDetectionEXT()
        """,

        XrPlaneDetectorEXT("planeDetector", "an {@code XrPlaneDetectorEXT} previously created by #CreatePlaneDetectorEXT()."),
        Check(1)..XrPlaneDetectionStateEXT.p("state", "a pointer to {@code XrPlaneDetectionStateEXT}.")
    )

    XrResult(
        "GetPlaneDetectionsEXT",
        """
        Get the detected planes.

        <h5>C Specification</h5>
        The #GetPlaneDetectionsEXT() function is defined as:

        <pre><code>
￿XrResult xrGetPlaneDetectionsEXT(
￿    XrPlaneDetectorEXT                          planeDetector,
￿    const XrPlaneDetectorGetInfoEXT*            info,
￿    XrPlaneDetectorLocationsEXT*                locations);</code></pre>

        <h5>Description</h5>
        #GetPlaneDetectionsEXT() <b>must</b> return #ERROR_CALL_ORDER_INVALID if the detector state reported by #GetPlaneDetectionStateEXT() is not #PLANE_DETECTION_STATE_DONE_EXT for the current query started by #BeginPlaneDetectionEXT().

        If the ##XrPlaneDetectorGetInfoEXT::baseSpace is not locatable #ERROR_SPACE_NOT_LOCATABLE_EXT <b>must</b> be returned.

        Once #BeginPlaneDetectionEXT() is called again, the previous results for that handle are no longer available. The application <b>should</b> cache them before calling #BeginPlaneDetectionEXT() again if it needs access to that data while waiting for updated detection results.

        Upon the completion of a detection cycle (#BeginPlaneDetectionEXT(), #GetPlaneDetectionStateEXT() to #GetPlaneDetectionsEXT()) the runtime <b>must</b> keep a snapshot of the plane data and no data <b>may</b> be modified. Calling #GetPlaneDetectionsEXT() multiple times with the same baseSpace and time <b>must</b> return the same plane pose data.

        The current snapshot, if any, <b>must</b> be discarded upon calling #BeginPlaneDetectionEXT().

        If the ##XrEventDataReferenceSpaceChangePending is queued and the changeTime elapsed while the application is holding cached data the application <b>may</b> use the event data to adjusted poses accordingly.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTPlaneDetection XR_EXT_plane_detection} extension <b>must</b> be enabled prior to calling #GetPlaneDetectionsEXT()</li>
            <li>{@code planeDetector} <b>must</b> be a valid {@code XrPlaneDetectorEXT} handle</li>
            <li>{@code info} <b>must</b> be a pointer to a valid ##XrPlaneDetectorGetInfoEXT structure</li>
            <li>{@code locations} <b>must</b> be a pointer to an ##XrPlaneDetectorLocationsEXT structure</li>
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
                <li>#ERROR_TIME_INVALID</li>
                <li>#ERROR_SPACE_NOT_LOCATABLE_EXT</li>
                <li>#ERROR_CALL_ORDER_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrPlaneDetectorGetInfoEXT, ##XrPlaneDetectorLocationsEXT, #BeginPlaneDetectionEXT()
        """,

        XrPlaneDetectorEXT("planeDetector", "an {@code XrPlaneDetectorEXT} previously created by #CreatePlaneDetectorEXT()."),
        XrPlaneDetectorGetInfoEXT.const.p("info", "a pointer to ##XrPlaneDetectorGetInfoEXT."),
        XrPlaneDetectorLocationsEXT.p("locations", "a pointer to ##XrPlaneDetectorLocationsEXT receiving the returned plane locations.")
    )

    XrResult(
        "GetPlanePolygonBufferEXT",
        """
        Gets the plane.

        <h5>C Specification</h5>
        The #GetPlanePolygonBufferEXT() function is defined as:

        <pre><code>
￿XrResult xrGetPlanePolygonBufferEXT(
￿    XrPlaneDetectorEXT                          planeDetector,
￿    uint64_t                                    planeId,
￿    uint32_t                                    polygonBufferIndex,
￿    XrPlaneDetectorPolygonBufferEXT*            polygonBuffer);</code></pre>

        <h5>Description</h5>
        The #GetPlanePolygonBufferEXT() function retrieves the plane’s polygon buffer for the given {@code planeId} and {@code polygonBufferIndex}. Calling #GetPlanePolygonBufferEXT() with {@code polygonBufferIndex} equal to 0 <b>must</b> return the outside contour, if available. Calls with non-zero indices less than ##XrPlaneDetectorLocationEXT{@code ::polygonBufferCount} <b>must</b> return polygons corresponding to holes in the plane. This feature <b>may</b> not be supported by all runtimes, check the ##XrSystemPlaneDetectionPropertiesEXT{@code ::supportedFeatures} for support.

        Outside contour polygon vertices <b>must</b> be ordered in counter clockwise order. Vertices of holes <b>must</b> be ordered in clockwise order. The right-hand rule is used to determine the direction of the normal of this plane. The polygon contour data is relative to the pose of the plane and coplanar with it.

        This function only retrieves polygons, which means that it needs to be converted to a regular mesh to be rendered.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTPlaneDetection XR_EXT_plane_detection} extension <b>must</b> be enabled prior to calling #GetPlanePolygonBufferEXT()</li>
            <li>{@code planeDetector} <b>must</b> be a valid {@code XrPlaneDetectorEXT} handle</li>
            <li>{@code polygonBuffer} <b>must</b> be a pointer to an ##XrPlaneDetectorPolygonBufferEXT structure</li>
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
        ##XrPlaneDetectorPolygonBufferEXT, #GetPlaneDetectionsEXT()
        """,

        XrPlaneDetectorEXT("planeDetector", "an {@code XrPlaneDetectorEXT} previously created by #CreatePlaneDetectorEXT()."),
        uint64_t("planeId", "the ##XrPlaneDetectorLocationEXT{@code ::planeId}."),
        uint32_t("polygonBufferIndex", "the index of the polygon contour buffer to retrieve. This <b>must</b> be a number from 0 to ##XrPlaneDetectorLocationEXT:polygonBufferCount -1. Index 0 retrieves the outside contour, larger indexes retrieve holes in the plane."),
        XrPlaneDetectorPolygonBufferEXT.p("polygonBuffer", "a pointer to ##XrPlaneDetectorPolygonBufferEXT receiving the returned plane polygon buffer.")
    )
}