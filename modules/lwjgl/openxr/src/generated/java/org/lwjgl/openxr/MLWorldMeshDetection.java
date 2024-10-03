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
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#XR_ML_world_mesh_detection">XR_ML_world_mesh_detection</a> extension.
 * 
 * <p>This extension provides the functionality to detect the world mesh.</p>
 */
public class MLWorldMeshDetection {

    /** The extension specification version. */
    public static final int XR_ML_world_mesh_detection_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_ML_WORLD_MESH_DETECTION_EXTENSION_NAME = "XR_ML_world_mesh_detection";

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_WORLD_MESH_DETECTOR_ML = 1000474000;

    /**
     * Extends {@code XrResult}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_ERROR_WORLD_MESH_DETECTOR_PERMISSION_DENIED_ML ERROR_WORLD_MESH_DETECTOR_PERMISSION_DENIED_ML}</li>
     * <li>{@link #XR_ERROR_WORLD_MESH_DETECTOR_SPACE_NOT_LOCATABLE_ML ERROR_WORLD_MESH_DETECTOR_SPACE_NOT_LOCATABLE_ML}</li>
     * </ul>
     */
    public static final int
        XR_ERROR_WORLD_MESH_DETECTOR_PERMISSION_DENIED_ML   = -1000474000,
        XR_ERROR_WORLD_MESH_DETECTOR_SPACE_NOT_LOCATABLE_ML = -1000474001;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_WORLD_MESH_DETECTOR_CREATE_INFO_ML TYPE_WORLD_MESH_DETECTOR_CREATE_INFO_ML}</li>
     * <li>{@link #XR_TYPE_WORLD_MESH_STATE_REQUEST_INFO_ML TYPE_WORLD_MESH_STATE_REQUEST_INFO_ML}</li>
     * <li>{@link #XR_TYPE_WORLD_MESH_BLOCK_STATE_ML TYPE_WORLD_MESH_BLOCK_STATE_ML}</li>
     * <li>{@link #XR_TYPE_WORLD_MESH_STATE_REQUEST_COMPLETION_ML TYPE_WORLD_MESH_STATE_REQUEST_COMPLETION_ML}</li>
     * <li>{@link #XR_TYPE_WORLD_MESH_BUFFER_RECOMMENDED_SIZE_INFO_ML TYPE_WORLD_MESH_BUFFER_RECOMMENDED_SIZE_INFO_ML}</li>
     * <li>{@link #XR_TYPE_WORLD_MESH_BUFFER_SIZE_ML TYPE_WORLD_MESH_BUFFER_SIZE_ML}</li>
     * <li>{@link #XR_TYPE_WORLD_MESH_BUFFER_ML TYPE_WORLD_MESH_BUFFER_ML}</li>
     * <li>{@link #XR_TYPE_WORLD_MESH_BLOCK_REQUEST_ML TYPE_WORLD_MESH_BLOCK_REQUEST_ML}</li>
     * <li>{@link #XR_TYPE_WORLD_MESH_GET_INFO_ML TYPE_WORLD_MESH_GET_INFO_ML}</li>
     * <li>{@link #XR_TYPE_WORLD_MESH_BLOCK_ML TYPE_WORLD_MESH_BLOCK_ML}</li>
     * <li>{@link #XR_TYPE_WORLD_MESH_REQUEST_COMPLETION_ML TYPE_WORLD_MESH_REQUEST_COMPLETION_ML}</li>
     * <li>{@link #XR_TYPE_WORLD_MESH_REQUEST_COMPLETION_INFO_ML TYPE_WORLD_MESH_REQUEST_COMPLETION_INFO_ML}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_WORLD_MESH_DETECTOR_CREATE_INFO_ML         = 1000474001,
        XR_TYPE_WORLD_MESH_STATE_REQUEST_INFO_ML           = 1000474002,
        XR_TYPE_WORLD_MESH_BLOCK_STATE_ML                  = 1000474003,
        XR_TYPE_WORLD_MESH_STATE_REQUEST_COMPLETION_ML     = 1000474004,
        XR_TYPE_WORLD_MESH_BUFFER_RECOMMENDED_SIZE_INFO_ML = 1000474005,
        XR_TYPE_WORLD_MESH_BUFFER_SIZE_ML                  = 1000474006,
        XR_TYPE_WORLD_MESH_BUFFER_ML                       = 1000474007,
        XR_TYPE_WORLD_MESH_BLOCK_REQUEST_ML                = 1000474008,
        XR_TYPE_WORLD_MESH_GET_INFO_ML                     = 1000474009,
        XR_TYPE_WORLD_MESH_BLOCK_ML                        = 1000474010,
        XR_TYPE_WORLD_MESH_REQUEST_COMPLETION_ML           = 1000474011,
        XR_TYPE_WORLD_MESH_REQUEST_COMPLETION_INFO_ML      = 1000474012;

    /**
     * XrWorldMeshDetectorFlagBitsML - The world meshing detector flags.
     * 
     * <h5>Flag Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_WORLD_MESH_DETECTOR_POINT_CLOUD_BIT_ML WORLD_MESH_DETECTOR_POINT_CLOUD_BIT_ML} — If set, will return a point cloud instead of a triangle mesh.</li>
     * <li>{@link #XR_WORLD_MESH_DETECTOR_COMPUTE_NORMALS_BIT_ML WORLD_MESH_DETECTOR_COMPUTE_NORMALS_BIT_ML} — If set, the system will compute the normals for the triangle vertices.</li>
     * <li>{@link #XR_WORLD_MESH_DETECTOR_COMPUTE_CONFIDENCE_BIT_ML WORLD_MESH_DETECTOR_COMPUTE_CONFIDENCE_BIT_ML} — If set, the system will compute the confidence values.</li>
     * <li>{@link #XR_WORLD_MESH_DETECTOR_PLANARIZE_BIT_ML WORLD_MESH_DETECTOR_PLANARIZE_BIT_ML} — If set, the system will planarize the returned mesh (planar regions will be smoothed out).</li>
     * <li>{@link #XR_WORLD_MESH_DETECTOR_REMOVE_MESH_SKIRT_BIT_ML WORLD_MESH_DETECTOR_REMOVE_MESH_SKIRT_BIT_ML} — If set, the mesh skirt (overlapping area between two mesh blocks) will be removed.</li>
     * <li>{@link #XR_WORLD_MESH_DETECTOR_INDEX_ORDER_CW_BIT_ML WORLD_MESH_DETECTOR_INDEX_ORDER_CW_BIT_ML} — If set, winding order of indices will be be changed from counter clockwise to clockwise.</li>
     * </ul>
     */
    public static final int
        XR_WORLD_MESH_DETECTOR_POINT_CLOUD_BIT_ML        = 0x1,
        XR_WORLD_MESH_DETECTOR_COMPUTE_NORMALS_BIT_ML    = 0x2,
        XR_WORLD_MESH_DETECTOR_COMPUTE_CONFIDENCE_BIT_ML = 0x4,
        XR_WORLD_MESH_DETECTOR_PLANARIZE_BIT_ML          = 0x8,
        XR_WORLD_MESH_DETECTOR_REMOVE_MESH_SKIRT_BIT_ML  = 0x10,
        XR_WORLD_MESH_DETECTOR_INDEX_ORDER_CW_BIT_ML     = 0x20;

    /**
     * XrWorldMeshDetectorLodML - Mesh Levels Of Detail.
     * 
     * <h5>Description</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>Enum</th><th>Description</th></tr></thead>
     * <tbody>
     * <tr><td>{@link #XR_WORLD_MESH_DETECTOR_LOD_MINIMUM_ML WORLD_MESH_DETECTOR_LOD_MINIMUM_ML}</td><td>Minimum Level of Detail (LOD) for the mesh.</td></tr>
     * <tr><td>{@link #XR_WORLD_MESH_DETECTOR_LOD_MEDIUM_ML WORLD_MESH_DETECTOR_LOD_MEDIUM_ML}</td><td>Medium Level of Detail (LOD) for the mesh.</td></tr>
     * <tr><td>{@link #XR_WORLD_MESH_DETECTOR_LOD_MAXIMUM_ML WORLD_MESH_DETECTOR_LOD_MAXIMUM_ML}</td><td>Maximum Level of Detail (LOD) for the mesh.</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrWorldMeshBlockML}, {@link XrWorldMeshBlockRequestML}</p>
     */
    public static final int
        XR_WORLD_MESH_DETECTOR_LOD_MINIMUM_ML = 0,
        XR_WORLD_MESH_DETECTOR_LOD_MEDIUM_ML  = 1,
        XR_WORLD_MESH_DETECTOR_LOD_MAXIMUM_ML = 2;

    /**
     * XrWorldMeshBlockStatusML - The mesh block status.
     * 
     * <h5>Description</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>Enum</th><th>Description</th></tr></thead>
     * <tbody>
     * <tr><td>{@link #XR_WORLD_MESH_BLOCK_STATUS_NEW_ML WORLD_MESH_BLOCK_STATUS_NEW_ML}</td><td>The mesh block has been created.</td></tr>
     * <tr><td>{@link #XR_WORLD_MESH_BLOCK_STATUS_UPDATED_ML WORLD_MESH_BLOCK_STATUS_UPDATED_ML}</td><td>The mesh block has been updated.</td></tr>
     * <tr><td>{@link #XR_WORLD_MESH_BLOCK_STATUS_DELETED_ML WORLD_MESH_BLOCK_STATUS_DELETED_ML}</td><td>The mesh block has been deleted.</td></tr>
     * <tr><td>{@link #XR_WORLD_MESH_BLOCK_STATUS_UNCHANGED_ML WORLD_MESH_BLOCK_STATUS_UNCHANGED_ML}</td><td>The mesh block is unchanged.</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrWorldMeshBlockStateML}</p>
     */
    public static final int
        XR_WORLD_MESH_BLOCK_STATUS_NEW_ML       = 0,
        XR_WORLD_MESH_BLOCK_STATUS_UPDATED_ML   = 1,
        XR_WORLD_MESH_BLOCK_STATUS_DELETED_ML   = 2,
        XR_WORLD_MESH_BLOCK_STATUS_UNCHANGED_ML = 3;

    /**
     * XrWorldMeshBlockResultML - The mesh block result values.
     * 
     * <h5>Description</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>Enum</th><th>Description</th></tr></thead>
     * <tbody>
     * <tr><td>{@link #XR_WORLD_MESH_BLOCK_RESULT_SUCCESS_ML WORLD_MESH_BLOCK_RESULT_SUCCESS_ML}</td><td>Mesh request has succeeded.</td></tr>
     * <tr><td>{@link #XR_WORLD_MESH_BLOCK_RESULT_FAILED_ML WORLD_MESH_BLOCK_RESULT_FAILED_ML}</td><td>Mesh request has failed.</td></tr>
     * <tr><td>{@link #XR_WORLD_MESH_BLOCK_RESULT_PENDING_ML WORLD_MESH_BLOCK_RESULT_PENDING_ML}</td><td>Mesh request is pending.</td></tr>
     * <tr><td>{@link #XR_WORLD_MESH_BLOCK_RESULT_PARTIAL_UPDATE_ML WORLD_MESH_BLOCK_RESULT_PARTIAL_UPDATE_ML}</td><td>There are partial updates on the mesh request.</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrWorldMeshBlockML}</p>
     */
    public static final int
        XR_WORLD_MESH_BLOCK_RESULT_SUCCESS_ML        = 0,
        XR_WORLD_MESH_BLOCK_RESULT_FAILED_ML         = 1,
        XR_WORLD_MESH_BLOCK_RESULT_PENDING_ML        = 2,
        XR_WORLD_MESH_BLOCK_RESULT_PARTIAL_UPDATE_ML = 3;

    protected MLWorldMeshDetection() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateWorldMeshDetectorML ] ---

    /** Unsafe version of: {@link #xrCreateWorldMeshDetectorML CreateWorldMeshDetectorML} */
    public static int nxrCreateWorldMeshDetectorML(XrSession session, long createInfo, long detector) {
        long __functionAddress = session.getCapabilities().xrCreateWorldMeshDetectorML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, detector, __functionAddress);
    }

    /**
     * Create a world mesh detector.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateWorldMeshDetectorML CreateWorldMeshDetectorML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateWorldMeshDetectorML(
     *     XrSession                                   session,
     *     const XrWorldMeshDetectorCreateInfoML*      createInfo,
     *     XrWorldMeshDetectorML*                      detector);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLWorldMeshDetection XR_ML_world_mesh_detection} extension <b>must</b> be enabled prior to calling {@link #xrCreateWorldMeshDetectorML CreateWorldMeshDetectorML}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrWorldMeshDetectorCreateInfoML} structure</li>
     * <li>{@code detector} <b>must</b> be a pointer to an {@code XrWorldMeshDetectorML} handle</li>
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
     * <li>{@link #XR_ERROR_WORLD_MESH_DETECTOR_PERMISSION_DENIED_ML ERROR_WORLD_MESH_DETECTOR_PERMISSION_DENIED_ML}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrWorldMeshDetectorCreateInfoML}</p>
     *
     * @param session    a handle to an {@code XrSession}.
     * @param createInfo a pointer to an {@link XrWorldMeshDetectorCreateInfoML} structure.
     * @param detector   a pointer to {@code XrWorldMeshDetectorML}, returned by the runtime.
     */
    @NativeType("XrResult")
    public static int xrCreateWorldMeshDetectorML(XrSession session, @NativeType("XrWorldMeshDetectorCreateInfoML const *") XrWorldMeshDetectorCreateInfoML createInfo, @NativeType("XrWorldMeshDetectorML *") PointerBuffer detector) {
        if (CHECKS) {
            check(detector, 1);
        }
        return nxrCreateWorldMeshDetectorML(session, createInfo.address(), memAddress(detector));
    }

    // --- [ xrDestroyWorldMeshDetectorML ] ---

    /**
     * Destroy a world mesh detector.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroyWorldMeshDetectorML DestroyWorldMeshDetectorML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDestroyWorldMeshDetectorML(
     *     XrWorldMeshDetectorML                       detector);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLWorldMeshDetection XR_ML_world_mesh_detection} extension <b>must</b> be enabled prior to calling {@link #xrDestroyWorldMeshDetectorML DestroyWorldMeshDetectorML}</li>
     * <li>{@code detector} <b>must</b> be a valid {@code XrWorldMeshDetectorML} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code detector}, and any child handles, <b>must</b> be externally synchronized</li>
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
     * @param detector the {@code XrWorldMeshDetectorML} to destroy.
     */
    @NativeType("XrResult")
    public static int xrDestroyWorldMeshDetectorML(XrWorldMeshDetectorML detector) {
        long __functionAddress = detector.getCapabilities().xrDestroyWorldMeshDetectorML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(detector.address(), __functionAddress);
    }

    // --- [ xrRequestWorldMeshStateAsyncML ] ---

    /** Unsafe version of: {@link #xrRequestWorldMeshStateAsyncML RequestWorldMeshStateAsyncML} */
    public static int nxrRequestWorldMeshStateAsyncML(XrWorldMeshDetectorML detector, long stateRequest, long future) {
        long __functionAddress = detector.getCapabilities().xrRequestWorldMeshStateAsyncML;
        if (CHECKS) {
            check(__functionAddress);
            XrWorldMeshStateRequestInfoML.validate(stateRequest);
        }
        return callPPPI(detector.address(), stateRequest, future, __functionAddress);
    }

    /**
     * Request the current mesh block state.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrRequestWorldMeshStateAsyncML RequestWorldMeshStateAsyncML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrRequestWorldMeshStateAsyncML(
     *     XrWorldMeshDetectorML                       detector,
     *     const XrWorldMeshStateRequestInfoML*        stateRequest,
     *     XrFutureEXT*                                future);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLWorldMeshDetection XR_ML_world_mesh_detection} extension <b>must</b> be enabled prior to calling {@link #xrRequestWorldMeshStateAsyncML RequestWorldMeshStateAsyncML}</li>
     * <li>{@code detector} <b>must</b> be a valid {@code XrWorldMeshDetectorML} handle</li>
     * <li>{@code stateRequest} <b>must</b> be a pointer to a valid {@link XrWorldMeshStateRequestInfoML} structure</li>
     * <li>{@code future} <b>must</b> be a pointer to an {@code XrFutureEXT} value</li>
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
     * <li>{@link #XR_ERROR_WORLD_MESH_DETECTOR_SPACE_NOT_LOCATABLE_ML ERROR_WORLD_MESH_DETECTOR_SPACE_NOT_LOCATABLE_ML}</li>
     * <li>{@link XR10#XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_POSE_INVALID ERROR_POSE_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrWorldMeshStateRequestInfoML}</p>
     *
     * @param detector     the {@code XrWorldMeshDetectorML} to use.
     * @param stateRequest the {@link XrWorldMeshStateRequestInfoML} request information.
     * @param future       a pointer to a runtime created {@code XrFutureEXT}.
     */
    @NativeType("XrResult")
    public static int xrRequestWorldMeshStateAsyncML(XrWorldMeshDetectorML detector, @NativeType("XrWorldMeshStateRequestInfoML const *") XrWorldMeshStateRequestInfoML stateRequest, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrRequestWorldMeshStateAsyncML(detector, stateRequest.address(), memAddress(future));
    }

    // --- [ xrRequestWorldMeshStateCompleteML ] ---

    /** Unsafe version of: {@link #xrRequestWorldMeshStateCompleteML RequestWorldMeshStateCompleteML} */
    public static int nxrRequestWorldMeshStateCompleteML(XrWorldMeshDetectorML detector, long future, long completion) {
        long __functionAddress = detector.getCapabilities().xrRequestWorldMeshStateCompleteML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(detector.address(), future, completion, __functionAddress);
    }

    /**
     * Completes the current mesh block state query.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrRequestWorldMeshStateCompleteML RequestWorldMeshStateCompleteML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrRequestWorldMeshStateCompleteML(
     *     XrWorldMeshDetectorML                       detector,
     *     XrFutureEXT                                 future,
     *     XrWorldMeshStateRequestCompletionML*        completion);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLWorldMeshDetection XR_ML_world_mesh_detection} extension <b>must</b> be enabled prior to calling {@link #xrRequestWorldMeshStateCompleteML RequestWorldMeshStateCompleteML}</li>
     * <li>{@code detector} <b>must</b> be a valid {@code XrWorldMeshDetectorML} handle</li>
     * <li>{@code completion} <b>must</b> be a pointer to an {@link XrWorldMeshStateRequestCompletionML} structure</li>
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
     * <li>{@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * <li>{@link EXTFuture#XR_ERROR_FUTURE_PENDING_EXT ERROR_FUTURE_PENDING_EXT}</li>
     * <li>{@link EXTFuture#XR_ERROR_FUTURE_INVALID_EXT ERROR_FUTURE_INVALID_EXT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrWorldMeshStateRequestCompletionML}</p>
     *
     * @param detector   the {@code XrWorldMeshDetectorML} to use.
     * @param future     a the {@code XrFutureEXT} to complete.
     * @param completion a pointer to the {@link XrWorldMeshStateRequestCompletionML} structure.
     */
    @NativeType("XrResult")
    public static int xrRequestWorldMeshStateCompleteML(XrWorldMeshDetectorML detector, @NativeType("XrFutureEXT") long future, @NativeType("XrWorldMeshStateRequestCompletionML *") XrWorldMeshStateRequestCompletionML completion) {
        return nxrRequestWorldMeshStateCompleteML(detector, future, completion.address());
    }

    // --- [ xrGetWorldMeshBufferRecommendSizeML ] ---

    /** Unsafe version of: {@link #xrGetWorldMeshBufferRecommendSizeML GetWorldMeshBufferRecommendSizeML} */
    public static int nxrGetWorldMeshBufferRecommendSizeML(XrWorldMeshDetectorML detector, long sizeInfo, long size) {
        long __functionAddress = detector.getCapabilities().xrGetWorldMeshBufferRecommendSizeML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(detector.address(), sizeInfo, size, __functionAddress);
    }

    /**
     * Allocates memory.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetWorldMeshBufferRecommendSizeML GetWorldMeshBufferRecommendSizeML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetWorldMeshBufferRecommendSizeML(
     *     XrWorldMeshDetectorML                       detector,
     *     const XrWorldMeshBufferRecommendedSizeInfoML* sizeInfo,
     *     XrWorldMeshBufferSizeML*                    size);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Errata: This function is called {@code xrGetWorldMeshBufferRecommendSizeML} rather than the expected {@code xrGetWorldMeshBufferRecommendedSizeML}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLWorldMeshDetection XR_ML_world_mesh_detection} extension <b>must</b> be enabled prior to calling {@link #xrGetWorldMeshBufferRecommendSizeML GetWorldMeshBufferRecommendSizeML}</li>
     * <li>{@code detector} <b>must</b> be a valid {@code XrWorldMeshDetectorML} handle</li>
     * <li>{@code sizeInfo} <b>must</b> be a pointer to a valid {@link XrWorldMeshBufferRecommendedSizeInfoML} structure</li>
     * <li>{@code size} <b>must</b> be a pointer to an {@link XrWorldMeshBufferSizeML} structure</li>
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
     * <p>{@link XrWorldMeshBufferRecommendedSizeInfoML}, {@link XrWorldMeshBufferSizeML}, {@link #xrFreeWorldMeshBufferML FreeWorldMeshBufferML}</p>
     *
     * @param detector the {@code XrWorldMeshDetectorML} to use.
     * @param sizeInfo a pointer to an {@link XrWorldMeshBufferRecommendedSizeInfoML} structure.
     * @param size     the {@link XrWorldMeshBufferSizeML}, this will be filled by the runtime with the size to allocate for the {@link #xrRequestWorldMeshAsyncML RequestWorldMeshAsyncML} function. {@code size} <b>must</b> be larger than 0.
     */
    @NativeType("XrResult")
    public static int xrGetWorldMeshBufferRecommendSizeML(XrWorldMeshDetectorML detector, @NativeType("XrWorldMeshBufferRecommendedSizeInfoML const *") XrWorldMeshBufferRecommendedSizeInfoML sizeInfo, @NativeType("XrWorldMeshBufferSizeML *") XrWorldMeshBufferSizeML size) {
        return nxrGetWorldMeshBufferRecommendSizeML(detector, sizeInfo.address(), size.address());
    }

    // --- [ xrAllocateWorldMeshBufferML ] ---

    /** Unsafe version of: {@link #xrAllocateWorldMeshBufferML AllocateWorldMeshBufferML} */
    public static int nxrAllocateWorldMeshBufferML(XrWorldMeshDetectorML detector, long size, long buffer) {
        long __functionAddress = detector.getCapabilities().xrAllocateWorldMeshBufferML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(detector.address(), size, buffer, __functionAddress);
    }

    /**
     * Allocates memory.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrAllocateWorldMeshBufferML AllocateWorldMeshBufferML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrAllocateWorldMeshBufferML(
     *     XrWorldMeshDetectorML                       detector,
     *     const XrWorldMeshBufferSizeML*              size,
     *     XrWorldMeshBufferML*                        buffer);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLWorldMeshDetection XR_ML_world_mesh_detection} extension <b>must</b> be enabled prior to calling {@link #xrAllocateWorldMeshBufferML AllocateWorldMeshBufferML}</li>
     * <li>{@code detector} <b>must</b> be a valid {@code XrWorldMeshDetectorML} handle</li>
     * <li>{@code size} <b>must</b> be a pointer to a valid {@link XrWorldMeshBufferSizeML} structure</li>
     * <li>{@code buffer} <b>must</b> be a pointer to an {@link XrWorldMeshBufferML} structure</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrWorldMeshBufferML}, {@link XrWorldMeshBufferSizeML}, {@link #xrFreeWorldMeshBufferML FreeWorldMeshBufferML}</p>
     *
     * @param detector the {@code XrWorldMeshDetectorML} to use.
     * @param size     the {@link XrWorldMeshBufferSizeML} request information previously retrieved via {@link #xrGetWorldMeshBufferRecommendSizeML GetWorldMeshBufferRecommendSizeML}.
     * @param buffer   a pointer to an {@link XrWorldMeshBufferML} that will be filled by the runtime with a pointer to a memory block and size of the buffer.
     */
    @NativeType("XrResult")
    public static int xrAllocateWorldMeshBufferML(XrWorldMeshDetectorML detector, @NativeType("XrWorldMeshBufferSizeML const *") XrWorldMeshBufferSizeML size, @NativeType("XrWorldMeshBufferML *") XrWorldMeshBufferML buffer) {
        return nxrAllocateWorldMeshBufferML(detector, size.address(), buffer.address());
    }

    // --- [ xrFreeWorldMeshBufferML ] ---

    /** Unsafe version of: {@link #xrFreeWorldMeshBufferML FreeWorldMeshBufferML} */
    public static int nxrFreeWorldMeshBufferML(XrWorldMeshDetectorML detector, long buffer) {
        long __functionAddress = detector.getCapabilities().xrFreeWorldMeshBufferML;
        if (CHECKS) {
            check(__functionAddress);
            XrWorldMeshBufferML.validate(buffer);
        }
        return callPPI(detector.address(), buffer, __functionAddress);
    }

    /**
     * Frees memory.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrFreeWorldMeshBufferML FreeWorldMeshBufferML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrFreeWorldMeshBufferML(
     *     XrWorldMeshDetectorML                       detector,
     *     const XrWorldMeshBufferML*                  buffer);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLWorldMeshDetection XR_ML_world_mesh_detection} extension <b>must</b> be enabled prior to calling {@link #xrFreeWorldMeshBufferML FreeWorldMeshBufferML}</li>
     * <li>{@code detector} <b>must</b> be a valid {@code XrWorldMeshDetectorML} handle</li>
     * <li>{@code buffer} <b>must</b> be a pointer to a valid {@link XrWorldMeshBufferML} structure</li>
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
     * <p>{@link XrWorldMeshBufferML}, {@link #xrAllocateWorldMeshBufferML AllocateWorldMeshBufferML}</p>
     *
     * @param detector the {@code XrWorldMeshDetectorML} to use.
     * @param buffer   a pointer to {@link XrWorldMeshBufferML} to be freed.
     */
    @NativeType("XrResult")
    public static int xrFreeWorldMeshBufferML(XrWorldMeshDetectorML detector, @NativeType("XrWorldMeshBufferML const *") XrWorldMeshBufferML buffer) {
        return nxrFreeWorldMeshBufferML(detector, buffer.address());
    }

    // --- [ xrRequestWorldMeshAsyncML ] ---

    /** Unsafe version of: {@link #xrRequestWorldMeshAsyncML RequestWorldMeshAsyncML} */
    public static int nxrRequestWorldMeshAsyncML(XrWorldMeshDetectorML detector, long getInfo, long buffer, long future) {
        long __functionAddress = detector.getCapabilities().xrRequestWorldMeshAsyncML;
        if (CHECKS) {
            check(__functionAddress);
            XrWorldMeshGetInfoML.validate(getInfo);
        }
        return callPPPPI(detector.address(), getInfo, buffer, future, __functionAddress);
    }

    /**
     * Retrieve mesh vertex data.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrRequestWorldMeshAsyncML RequestWorldMeshAsyncML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrRequestWorldMeshAsyncML(
     *     XrWorldMeshDetectorML                       detector,
     *     const XrWorldMeshGetInfoML*                 getInfo,
     *     XrWorldMeshBufferML*                        buffer,
     *     XrFutureEXT*                                future);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLWorldMeshDetection XR_ML_world_mesh_detection} extension <b>must</b> be enabled prior to calling {@link #xrRequestWorldMeshAsyncML RequestWorldMeshAsyncML}</li>
     * <li>{@code detector} <b>must</b> be a valid {@code XrWorldMeshDetectorML} handle</li>
     * <li>{@code getInfo} <b>must</b> be a pointer to a valid {@link XrWorldMeshGetInfoML} structure</li>
     * <li>{@code buffer} <b>must</b> be a pointer to an {@link XrWorldMeshBufferML} structure</li>
     * <li>{@code future} <b>must</b> be a pointer to an {@code XrFutureEXT} value</li>
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
     * <p>{@link XrWorldMeshBufferML}, {@link XrWorldMeshGetInfoML}, {@link #xrRequestWorldMeshCompleteML RequestWorldMeshCompleteML}</p>
     *
     * @param detector the {@code XrWorldMeshDetectorML} to use.
     * @param getInfo  a pointer to an {@link XrWorldMeshGetInfoML} structure.
     * @param buffer   a pointer to an {@link XrWorldMeshBufferML} to be used. This buffer <b>must</b> be kept available for the duration of the request and for however long the application needs access to the vertex buffer.
     * @param future   a pointer to an {@code XrFutureEXT} to be filled by the runtime.
     */
    @NativeType("XrResult")
    public static int xrRequestWorldMeshAsyncML(XrWorldMeshDetectorML detector, @NativeType("XrWorldMeshGetInfoML const *") XrWorldMeshGetInfoML getInfo, @NativeType("XrWorldMeshBufferML *") XrWorldMeshBufferML buffer, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrRequestWorldMeshAsyncML(detector, getInfo.address(), buffer.address(), memAddress(future));
    }

    // --- [ xrRequestWorldMeshCompleteML ] ---

    /** Unsafe version of: {@link #xrRequestWorldMeshCompleteML RequestWorldMeshCompleteML} */
    public static int nxrRequestWorldMeshCompleteML(XrWorldMeshDetectorML detector, long completionInfo, long future, long completion) {
        long __functionAddress = detector.getCapabilities().xrRequestWorldMeshCompleteML;
        if (CHECKS) {
            check(__functionAddress);
            XrWorldMeshRequestCompletionInfoML.validate(completionInfo);
        }
        return callPPJPI(detector.address(), completionInfo, future, completion, __functionAddress);
    }

    /**
     * Retrieve mesh vertex data.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrRequestWorldMeshCompleteML RequestWorldMeshCompleteML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrRequestWorldMeshCompleteML(
     *     XrWorldMeshDetectorML                       detector,
     *     const XrWorldMeshRequestCompletionInfoML*   completionInfo,
     *     XrFutureEXT                                 future,
     *     XrWorldMeshRequestCompletionML*             completion);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLWorldMeshDetection XR_ML_world_mesh_detection} extension <b>must</b> be enabled prior to calling {@link #xrRequestWorldMeshCompleteML RequestWorldMeshCompleteML}</li>
     * <li>{@code detector} <b>must</b> be a valid {@code XrWorldMeshDetectorML} handle</li>
     * <li>{@code completionInfo} <b>must</b> be a pointer to a valid {@link XrWorldMeshRequestCompletionInfoML} structure</li>
     * <li>{@code completion} <b>must</b> be a pointer to an {@link XrWorldMeshRequestCompletionML} structure</li>
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
     * <li>{@link #XR_ERROR_WORLD_MESH_DETECTOR_SPACE_NOT_LOCATABLE_ML ERROR_WORLD_MESH_DETECTOR_SPACE_NOT_LOCATABLE_ML}</li>
     * <li>{@link XR10#XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}</li>
     * <li>{@link EXTFuture#XR_ERROR_FUTURE_PENDING_EXT ERROR_FUTURE_PENDING_EXT}</li>
     * <li>{@link EXTFuture#XR_ERROR_FUTURE_INVALID_EXT ERROR_FUTURE_INVALID_EXT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrWorldMeshRequestCompletionInfoML}, {@link XrWorldMeshRequestCompletionML}, {@link #xrRequestWorldMeshAsyncML RequestWorldMeshAsyncML}</p>
     *
     * @param detector       the {@code XrWorldMeshDetectorML} to use.
     * @param completionInfo a pointer to {@link XrWorldMeshRequestCompletionInfoML}.
     * @param future         an {@code XrFutureEXT} to complete.
     * @param completion     a pointer to {@link XrWorldMeshRequestCompletionML} containing the completion result.
     */
    @NativeType("XrResult")
    public static int xrRequestWorldMeshCompleteML(XrWorldMeshDetectorML detector, @NativeType("XrWorldMeshRequestCompletionInfoML const *") XrWorldMeshRequestCompletionInfoML completionInfo, @NativeType("XrFutureEXT") long future, @NativeType("XrWorldMeshRequestCompletionML *") XrWorldMeshRequestCompletionML completion) {
        return nxrRequestWorldMeshCompleteML(detector, completionInfo.address(), future, completion.address());
    }

}