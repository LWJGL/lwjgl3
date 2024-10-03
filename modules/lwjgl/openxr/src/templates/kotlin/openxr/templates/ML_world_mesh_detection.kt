/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ML_world_mesh_detection = "MLWorldMeshDetection".nativeClassXR("ML_world_mesh_detection", type = "instance", postfix = "ML") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#XR_ML_world_mesh_detection">XR_ML_world_mesh_detection</a> extension.

        This extension provides the functionality to detect the world mesh.
        """

    IntConstant(
        "The extension specification version.",

        "ML_world_mesh_detection_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "ML_WORLD_MESH_DETECTION_EXTENSION_NAME".."XR_ML_world_mesh_detection"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_WORLD_MESH_DETECTOR_ML".."1000474000"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_WORLD_MESH_DETECTOR_PERMISSION_DENIED_ML".."-1000474000",
        "ERROR_WORLD_MESH_DETECTOR_SPACE_NOT_LOCATABLE_ML".."-1000474001"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_WORLD_MESH_DETECTOR_CREATE_INFO_ML".."1000474001",
        "TYPE_WORLD_MESH_STATE_REQUEST_INFO_ML".."1000474002",
        "TYPE_WORLD_MESH_BLOCK_STATE_ML".."1000474003",
        "TYPE_WORLD_MESH_STATE_REQUEST_COMPLETION_ML".."1000474004",
        "TYPE_WORLD_MESH_BUFFER_RECOMMENDED_SIZE_INFO_ML".."1000474005",
        "TYPE_WORLD_MESH_BUFFER_SIZE_ML".."1000474006",
        "TYPE_WORLD_MESH_BUFFER_ML".."1000474007",
        "TYPE_WORLD_MESH_BLOCK_REQUEST_ML".."1000474008",
        "TYPE_WORLD_MESH_GET_INFO_ML".."1000474009",
        "TYPE_WORLD_MESH_BLOCK_ML".."1000474010",
        "TYPE_WORLD_MESH_REQUEST_COMPLETION_ML".."1000474011",
        "TYPE_WORLD_MESH_REQUEST_COMPLETION_INFO_ML".."1000474012"
    )

    EnumConstant(
        """
        XrWorldMeshDetectorFlagBitsML - The world meshing detector flags.

        <h5>Flag Descriptions</h5>
        <ul>
            <li>#WORLD_MESH_DETECTOR_POINT_CLOUD_BIT_ML — If set, will return a point cloud instead of a triangle mesh.</li>
            <li>#WORLD_MESH_DETECTOR_COMPUTE_NORMALS_BIT_ML — If set, the system will compute the normals for the triangle vertices.</li>
            <li>#WORLD_MESH_DETECTOR_COMPUTE_CONFIDENCE_BIT_ML — If set, the system will compute the confidence values.</li>
            <li>#WORLD_MESH_DETECTOR_PLANARIZE_BIT_ML — If set, the system will planarize the returned mesh (planar regions will be smoothed out).</li>
            <li>#WORLD_MESH_DETECTOR_REMOVE_MESH_SKIRT_BIT_ML — If set, the mesh skirt (overlapping area between two mesh blocks) will be removed.</li>
            <li>#WORLD_MESH_DETECTOR_INDEX_ORDER_CW_BIT_ML — If set, winding order of indices will be be changed from counter clockwise to clockwise.</li>
        </ul>
        """,

        "WORLD_MESH_DETECTOR_POINT_CLOUD_BIT_ML".enum(0x00000001),
        "WORLD_MESH_DETECTOR_COMPUTE_NORMALS_BIT_ML".enum(0x00000002),
        "WORLD_MESH_DETECTOR_COMPUTE_CONFIDENCE_BIT_ML".enum(0x00000004),
        "WORLD_MESH_DETECTOR_PLANARIZE_BIT_ML".enum(0x00000008),
        "WORLD_MESH_DETECTOR_REMOVE_MESH_SKIRT_BIT_ML".enum(0x00000010),
        "WORLD_MESH_DETECTOR_INDEX_ORDER_CW_BIT_ML".enum(0x00000020)
    )

    EnumConstant(
        """
        XrWorldMeshDetectorLodML - Mesh Levels Of Detail.

        <h5>Description</h5>
        <table class="lwjgl">
            <thead><tr><th>Enum</th><th>Description</th></tr></thead>
            <tbody>
                <tr><td>#WORLD_MESH_DETECTOR_LOD_MINIMUM_ML</td><td>Minimum Level of Detail (LOD) for the mesh.</td></tr>
                <tr><td>#WORLD_MESH_DETECTOR_LOD_MEDIUM_ML</td><td>Medium Level of Detail (LOD) for the mesh.</td></tr>
                <tr><td>#WORLD_MESH_DETECTOR_LOD_MAXIMUM_ML</td><td>Maximum Level of Detail (LOD) for the mesh.</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        ##XrWorldMeshBlockML, ##XrWorldMeshBlockRequestML
        """,

        "WORLD_MESH_DETECTOR_LOD_MINIMUM_ML".."0",
        "WORLD_MESH_DETECTOR_LOD_MEDIUM_ML".."1",
        "WORLD_MESH_DETECTOR_LOD_MAXIMUM_ML".."2"
    )

    EnumConstant(
        """
        XrWorldMeshBlockStatusML - The mesh block status.

        <h5>Description</h5>
        <table class="lwjgl">
            <thead><tr><th>Enum</th><th>Description</th></tr></thead>
            <tbody>
                <tr><td>#WORLD_MESH_BLOCK_STATUS_NEW_ML</td><td>The mesh block has been created.</td></tr>
                <tr><td>#WORLD_MESH_BLOCK_STATUS_UPDATED_ML</td><td>The mesh block has been updated.</td></tr>
                <tr><td>#WORLD_MESH_BLOCK_STATUS_DELETED_ML</td><td>The mesh block has been deleted.</td></tr>
                <tr><td>#WORLD_MESH_BLOCK_STATUS_UNCHANGED_ML</td><td>The mesh block is unchanged.</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        ##XrWorldMeshBlockStateML
        """,

        "WORLD_MESH_BLOCK_STATUS_NEW_ML".."0",
        "WORLD_MESH_BLOCK_STATUS_UPDATED_ML".."1",
        "WORLD_MESH_BLOCK_STATUS_DELETED_ML".."2",
        "WORLD_MESH_BLOCK_STATUS_UNCHANGED_ML".."3"
    )

    EnumConstant(
        """
        XrWorldMeshBlockResultML - The mesh block result values.

        <h5>Description</h5>
        <table class="lwjgl">
            <thead><tr><th>Enum</th><th>Description</th></tr></thead>
            <tbody>
                <tr><td>#WORLD_MESH_BLOCK_RESULT_SUCCESS_ML</td><td>Mesh request has succeeded.</td></tr>
                <tr><td>#WORLD_MESH_BLOCK_RESULT_FAILED_ML</td><td>Mesh request has failed.</td></tr>
                <tr><td>#WORLD_MESH_BLOCK_RESULT_PENDING_ML</td><td>Mesh request is pending.</td></tr>
                <tr><td>#WORLD_MESH_BLOCK_RESULT_PARTIAL_UPDATE_ML</td><td>There are partial updates on the mesh request.</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        ##XrWorldMeshBlockML
        """,

        "WORLD_MESH_BLOCK_RESULT_SUCCESS_ML".."0",
        "WORLD_MESH_BLOCK_RESULT_FAILED_ML".."1",
        "WORLD_MESH_BLOCK_RESULT_PENDING_ML".."2",
        "WORLD_MESH_BLOCK_RESULT_PARTIAL_UPDATE_ML".."3"
    )

    XrResult(
        "CreateWorldMeshDetectorML",
        """
        Create a world mesh detector.

        <h5>C Specification</h5>
        The #CreateWorldMeshDetectorML() function is defined as:

        <pre><code>
￿XrResult xrCreateWorldMeshDetectorML(
￿    XrSession                                   session,
￿    const XrWorldMeshDetectorCreateInfoML*      createInfo,
￿    XrWorldMeshDetectorML*                      detector);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLWorldMeshDetection XR_ML_world_mesh_detection} extension <b>must</b> be enabled prior to calling #CreateWorldMeshDetectorML()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrWorldMeshDetectorCreateInfoML structure</li>
            <li>{@code detector} <b>must</b> be a pointer to an {@code XrWorldMeshDetectorML} handle</li>
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
                <li>#ERROR_WORLD_MESH_DETECTOR_PERMISSION_DENIED_ML</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrWorldMeshDetectorCreateInfoML
        """,

        XrSession("session", "a handle to an {@code XrSession}."),
        XrWorldMeshDetectorCreateInfoML.const.p("createInfo", "a pointer to an ##XrWorldMeshDetectorCreateInfoML structure."),
        Check(1)..XrWorldMeshDetectorML.p("detector", "a pointer to {@code XrWorldMeshDetectorML}, returned by the runtime.")
    )

    XrResult(
        "DestroyWorldMeshDetectorML",
        """
        Destroy a world mesh detector.

        <h5>C Specification</h5>
        The #DestroyWorldMeshDetectorML() function is defined as:

        <pre><code>
￿XrResult xrDestroyWorldMeshDetectorML(
￿    XrWorldMeshDetectorML                       detector);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLWorldMeshDetection XR_ML_world_mesh_detection} extension <b>must</b> be enabled prior to calling #DestroyWorldMeshDetectorML()</li>
            <li>{@code detector} <b>must</b> be a valid {@code XrWorldMeshDetectorML} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code detector}, and any child handles, <b>must</b> be externally synchronized</li>
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
        """,

        XrWorldMeshDetectorML("detector", "the {@code XrWorldMeshDetectorML} to destroy.")
    )

    XrResult(
        "RequestWorldMeshStateAsyncML",
        """
        Request the current mesh block state.

        <h5>C Specification</h5>
        The #RequestWorldMeshStateAsyncML() function is defined as:

        <pre><code>
￿XrResult xrRequestWorldMeshStateAsyncML(
￿    XrWorldMeshDetectorML                       detector,
￿    const XrWorldMeshStateRequestInfoML*        stateRequest,
￿    XrFutureEXT*                                future);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLWorldMeshDetection XR_ML_world_mesh_detection} extension <b>must</b> be enabled prior to calling #RequestWorldMeshStateAsyncML()</li>
            <li>{@code detector} <b>must</b> be a valid {@code XrWorldMeshDetectorML} handle</li>
            <li>{@code stateRequest} <b>must</b> be a pointer to a valid ##XrWorldMeshStateRequestInfoML structure</li>
            <li>{@code future} <b>must</b> be a pointer to an {@code XrFutureEXT} value</li>
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
                <li>#ERROR_WORLD_MESH_DETECTOR_SPACE_NOT_LOCATABLE_ML</li>
                <li>#ERROR_TIME_INVALID</li>
                <li>#ERROR_POSE_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrWorldMeshStateRequestInfoML
        """,

        XrWorldMeshDetectorML("detector", "the {@code XrWorldMeshDetectorML} to use."),
        XrWorldMeshStateRequestInfoML.const.p("stateRequest", "the ##XrWorldMeshStateRequestInfoML request information."),
        Check(1)..XrFutureEXT.p("future", "a pointer to a runtime created {@code XrFutureEXT}.")
    )

    XrResult(
        "RequestWorldMeshStateCompleteML",
        """
        Completes the current mesh block state query.

        <h5>C Specification</h5>
        The #RequestWorldMeshStateCompleteML() function is defined as:

        <pre><code>
￿XrResult xrRequestWorldMeshStateCompleteML(
￿    XrWorldMeshDetectorML                       detector,
￿    XrFutureEXT                                 future,
￿    XrWorldMeshStateRequestCompletionML*        completion);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLWorldMeshDetection XR_ML_world_mesh_detection} extension <b>must</b> be enabled prior to calling #RequestWorldMeshStateCompleteML()</li>
            <li>{@code detector} <b>must</b> be a valid {@code XrWorldMeshDetectorML} handle</li>
            <li>{@code completion} <b>must</b> be a pointer to an ##XrWorldMeshStateRequestCompletionML structure</li>
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
                <li>#ERROR_SIZE_INSUFFICIENT</li>
                <li>#ERROR_FUTURE_PENDING_EXT</li>
                <li>#ERROR_FUTURE_INVALID_EXT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrWorldMeshStateRequestCompletionML
        """,

        XrWorldMeshDetectorML("detector", "the {@code XrWorldMeshDetectorML} to use."),
        XrFutureEXT("future", "a the {@code XrFutureEXT} to complete."),
        XrWorldMeshStateRequestCompletionML.p("completion", "a pointer to the ##XrWorldMeshStateRequestCompletionML structure.")
    )

    XrResult(
        "GetWorldMeshBufferRecommendSizeML",
        """
        Allocates memory.

        <h5>C Specification</h5>
        The #GetWorldMeshBufferRecommendSizeML() function is defined as:

        <pre><code>
￿XrResult xrGetWorldMeshBufferRecommendSizeML(
￿    XrWorldMeshDetectorML                       detector,
￿    const XrWorldMeshBufferRecommendedSizeInfoML* sizeInfo,
￿    XrWorldMeshBufferSizeML*                    size);</code></pre>

        <h5>Description</h5>
        Errata: This function is called {@code xrGetWorldMeshBufferRecommendSizeML} rather than the expected {@code xrGetWorldMeshBufferRecommendedSizeML}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLWorldMeshDetection XR_ML_world_mesh_detection} extension <b>must</b> be enabled prior to calling #GetWorldMeshBufferRecommendSizeML()</li>
            <li>{@code detector} <b>must</b> be a valid {@code XrWorldMeshDetectorML} handle</li>
            <li>{@code sizeInfo} <b>must</b> be a pointer to a valid ##XrWorldMeshBufferRecommendedSizeInfoML structure</li>
            <li>{@code size} <b>must</b> be a pointer to an ##XrWorldMeshBufferSizeML structure</li>
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
        ##XrWorldMeshBufferRecommendedSizeInfoML, ##XrWorldMeshBufferSizeML, #FreeWorldMeshBufferML()
        """,

        XrWorldMeshDetectorML("detector", "the {@code XrWorldMeshDetectorML} to use."),
        XrWorldMeshBufferRecommendedSizeInfoML.const.p("sizeInfo", "a pointer to an ##XrWorldMeshBufferRecommendedSizeInfoML structure."),
        XrWorldMeshBufferSizeML.p("size", "the ##XrWorldMeshBufferSizeML, this will be filled by the runtime with the size to allocate for the #RequestWorldMeshAsyncML() function. {@code size} <b>must</b> be larger than 0.")
    )

    XrResult(
        "AllocateWorldMeshBufferML",
        """
        Allocates memory.

        <h5>C Specification</h5>
        The #AllocateWorldMeshBufferML() function is defined as:

        <pre><code>
￿XrResult xrAllocateWorldMeshBufferML(
￿    XrWorldMeshDetectorML                       detector,
￿    const XrWorldMeshBufferSizeML*              size,
￿    XrWorldMeshBufferML*                        buffer);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLWorldMeshDetection XR_ML_world_mesh_detection} extension <b>must</b> be enabled prior to calling #AllocateWorldMeshBufferML()</li>
            <li>{@code detector} <b>must</b> be a valid {@code XrWorldMeshDetectorML} handle</li>
            <li>{@code size} <b>must</b> be a pointer to a valid ##XrWorldMeshBufferSizeML structure</li>
            <li>{@code buffer} <b>must</b> be a pointer to an ##XrWorldMeshBufferML structure</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrWorldMeshBufferML, ##XrWorldMeshBufferSizeML, #FreeWorldMeshBufferML()
        """,

        XrWorldMeshDetectorML("detector", "the {@code XrWorldMeshDetectorML} to use."),
        XrWorldMeshBufferSizeML.const.p("size", "the ##XrWorldMeshBufferSizeML request information previously retrieved via #GetWorldMeshBufferRecommendSizeML()."),
        XrWorldMeshBufferML.p("buffer", "a pointer to an ##XrWorldMeshBufferML that will be filled by the runtime with a pointer to a memory block and size of the buffer.")
    )

    XrResult(
        "FreeWorldMeshBufferML",
        """
        Frees memory.

        <h5>C Specification</h5>
        The #FreeWorldMeshBufferML() function is defined as:

        <pre><code>
￿XrResult xrFreeWorldMeshBufferML(
￿    XrWorldMeshDetectorML                       detector,
￿    const XrWorldMeshBufferML*                  buffer);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLWorldMeshDetection XR_ML_world_mesh_detection} extension <b>must</b> be enabled prior to calling #FreeWorldMeshBufferML()</li>
            <li>{@code detector} <b>must</b> be a valid {@code XrWorldMeshDetectorML} handle</li>
            <li>{@code buffer} <b>must</b> be a pointer to a valid ##XrWorldMeshBufferML structure</li>
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
        ##XrWorldMeshBufferML, #AllocateWorldMeshBufferML()
        """,

        XrWorldMeshDetectorML("detector", "the {@code XrWorldMeshDetectorML} to use."),
        XrWorldMeshBufferML.const.p("buffer", "a pointer to ##XrWorldMeshBufferML to be freed.")
    )

    XrResult(
        "RequestWorldMeshAsyncML",
        """
        Retrieve mesh vertex data.

        <h5>C Specification</h5>
        The #RequestWorldMeshAsyncML() function is defined as:

        <pre><code>
￿XrResult xrRequestWorldMeshAsyncML(
￿    XrWorldMeshDetectorML                       detector,
￿    const XrWorldMeshGetInfoML*                 getInfo,
￿    XrWorldMeshBufferML*                        buffer,
￿    XrFutureEXT*                                future);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLWorldMeshDetection XR_ML_world_mesh_detection} extension <b>must</b> be enabled prior to calling #RequestWorldMeshAsyncML()</li>
            <li>{@code detector} <b>must</b> be a valid {@code XrWorldMeshDetectorML} handle</li>
            <li>{@code getInfo} <b>must</b> be a pointer to a valid ##XrWorldMeshGetInfoML structure</li>
            <li>{@code buffer} <b>must</b> be a pointer to an ##XrWorldMeshBufferML structure</li>
            <li>{@code future} <b>must</b> be a pointer to an {@code XrFutureEXT} value</li>
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
        ##XrWorldMeshBufferML, ##XrWorldMeshGetInfoML, #RequestWorldMeshCompleteML()
        """,

        XrWorldMeshDetectorML("detector", "the {@code XrWorldMeshDetectorML} to use."),
        XrWorldMeshGetInfoML.const.p("getInfo", "a pointer to an ##XrWorldMeshGetInfoML structure."),
        XrWorldMeshBufferML.p("buffer", "a pointer to an ##XrWorldMeshBufferML to be used. This buffer <b>must</b> be kept available for the duration of the request and for however long the application needs access to the vertex buffer."),
        Check(1)..XrFutureEXT.p("future", "a pointer to an {@code XrFutureEXT} to be filled by the runtime.")
    )

    XrResult(
        "RequestWorldMeshCompleteML",
        """
        Retrieve mesh vertex data.

        <h5>C Specification</h5>
        The #RequestWorldMeshCompleteML() function is defined as:

        <pre><code>
￿XrResult xrRequestWorldMeshCompleteML(
￿    XrWorldMeshDetectorML                       detector,
￿    const XrWorldMeshRequestCompletionInfoML*   completionInfo,
￿    XrFutureEXT                                 future,
￿    XrWorldMeshRequestCompletionML*             completion);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLWorldMeshDetection XR_ML_world_mesh_detection} extension <b>must</b> be enabled prior to calling #RequestWorldMeshCompleteML()</li>
            <li>{@code detector} <b>must</b> be a valid {@code XrWorldMeshDetectorML} handle</li>
            <li>{@code completionInfo} <b>must</b> be a pointer to a valid ##XrWorldMeshRequestCompletionInfoML structure</li>
            <li>{@code completion} <b>must</b> be a pointer to an ##XrWorldMeshRequestCompletionML structure</li>
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
                <li>#ERROR_WORLD_MESH_DETECTOR_SPACE_NOT_LOCATABLE_ML</li>
                <li>#ERROR_TIME_INVALID</li>
                <li>#ERROR_FUTURE_PENDING_EXT</li>
                <li>#ERROR_FUTURE_INVALID_EXT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrWorldMeshRequestCompletionInfoML, ##XrWorldMeshRequestCompletionML, #RequestWorldMeshAsyncML()
        """,

        XrWorldMeshDetectorML("detector", "the {@code XrWorldMeshDetectorML} to use."),
        XrWorldMeshRequestCompletionInfoML.const.p("completionInfo", "a pointer to ##XrWorldMeshRequestCompletionInfoML."),
        XrFutureEXT("future", "an {@code XrFutureEXT} to complete."),
        XrWorldMeshRequestCompletionML.p("completion", "a pointer to ##XrWorldMeshRequestCompletionML containing the completion result.")
    )
}