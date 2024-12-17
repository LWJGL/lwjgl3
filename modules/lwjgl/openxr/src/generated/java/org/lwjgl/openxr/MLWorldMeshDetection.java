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

public class MLWorldMeshDetection {

    public static final int XR_ML_world_mesh_detection_SPEC_VERSION = 1;

    public static final String XR_ML_WORLD_MESH_DETECTION_EXTENSION_NAME = "XR_ML_world_mesh_detection";

    public static final int XR_OBJECT_TYPE_WORLD_MESH_DETECTOR_ML = 1000474000;

    public static final int
        XR_ERROR_WORLD_MESH_DETECTOR_PERMISSION_DENIED_ML   = -1000474000,
        XR_ERROR_WORLD_MESH_DETECTOR_SPACE_NOT_LOCATABLE_ML = -1000474001;

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

    public static final int
        XR_WORLD_MESH_DETECTOR_POINT_CLOUD_BIT_ML        = 0x1,
        XR_WORLD_MESH_DETECTOR_COMPUTE_NORMALS_BIT_ML    = 0x2,
        XR_WORLD_MESH_DETECTOR_COMPUTE_CONFIDENCE_BIT_ML = 0x4,
        XR_WORLD_MESH_DETECTOR_PLANARIZE_BIT_ML          = 0x8,
        XR_WORLD_MESH_DETECTOR_REMOVE_MESH_SKIRT_BIT_ML  = 0x10,
        XR_WORLD_MESH_DETECTOR_INDEX_ORDER_CW_BIT_ML     = 0x20;

    public static final int
        XR_WORLD_MESH_DETECTOR_LOD_MINIMUM_ML = 0,
        XR_WORLD_MESH_DETECTOR_LOD_MEDIUM_ML  = 1,
        XR_WORLD_MESH_DETECTOR_LOD_MAXIMUM_ML = 2;

    public static final int
        XR_WORLD_MESH_BLOCK_STATUS_NEW_ML       = 0,
        XR_WORLD_MESH_BLOCK_STATUS_UPDATED_ML   = 1,
        XR_WORLD_MESH_BLOCK_STATUS_DELETED_ML   = 2,
        XR_WORLD_MESH_BLOCK_STATUS_UNCHANGED_ML = 3;

    public static final int
        XR_WORLD_MESH_BLOCK_RESULT_SUCCESS_ML        = 0,
        XR_WORLD_MESH_BLOCK_RESULT_FAILED_ML         = 1,
        XR_WORLD_MESH_BLOCK_RESULT_PENDING_ML        = 2,
        XR_WORLD_MESH_BLOCK_RESULT_PARTIAL_UPDATE_ML = 3;

    protected MLWorldMeshDetection() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateWorldMeshDetectorML ] ---

    /** {@code XrResult xrCreateWorldMeshDetectorML(XrSession session, XrWorldMeshDetectorCreateInfoML const * createInfo, XrWorldMeshDetectorML * detector)} */
    public static int nxrCreateWorldMeshDetectorML(XrSession session, long createInfo, long detector) {
        long __functionAddress = session.getCapabilities().xrCreateWorldMeshDetectorML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, detector, __functionAddress);
    }

    /** {@code XrResult xrCreateWorldMeshDetectorML(XrSession session, XrWorldMeshDetectorCreateInfoML const * createInfo, XrWorldMeshDetectorML * detector)} */
    @NativeType("XrResult")
    public static int xrCreateWorldMeshDetectorML(XrSession session, @NativeType("XrWorldMeshDetectorCreateInfoML const *") XrWorldMeshDetectorCreateInfoML createInfo, @NativeType("XrWorldMeshDetectorML *") PointerBuffer detector) {
        if (CHECKS) {
            check(detector, 1);
        }
        return nxrCreateWorldMeshDetectorML(session, createInfo.address(), memAddress(detector));
    }

    // --- [ xrDestroyWorldMeshDetectorML ] ---

    /** {@code XrResult xrDestroyWorldMeshDetectorML(XrWorldMeshDetectorML detector)} */
    @NativeType("XrResult")
    public static int xrDestroyWorldMeshDetectorML(XrWorldMeshDetectorML detector) {
        long __functionAddress = detector.getCapabilities().xrDestroyWorldMeshDetectorML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(detector.address(), __functionAddress);
    }

    // --- [ xrRequestWorldMeshStateAsyncML ] ---

    /** {@code XrResult xrRequestWorldMeshStateAsyncML(XrWorldMeshDetectorML detector, XrWorldMeshStateRequestInfoML const * stateRequest, XrFutureEXT * future)} */
    public static int nxrRequestWorldMeshStateAsyncML(XrWorldMeshDetectorML detector, long stateRequest, long future) {
        long __functionAddress = detector.getCapabilities().xrRequestWorldMeshStateAsyncML;
        if (CHECKS) {
            check(__functionAddress);
            XrWorldMeshStateRequestInfoML.validate(stateRequest);
        }
        return callPPPI(detector.address(), stateRequest, future, __functionAddress);
    }

    /** {@code XrResult xrRequestWorldMeshStateAsyncML(XrWorldMeshDetectorML detector, XrWorldMeshStateRequestInfoML const * stateRequest, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrRequestWorldMeshStateAsyncML(XrWorldMeshDetectorML detector, @NativeType("XrWorldMeshStateRequestInfoML const *") XrWorldMeshStateRequestInfoML stateRequest, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrRequestWorldMeshStateAsyncML(detector, stateRequest.address(), memAddress(future));
    }

    // --- [ xrRequestWorldMeshStateCompleteML ] ---

    /** {@code XrResult xrRequestWorldMeshStateCompleteML(XrWorldMeshDetectorML detector, XrFutureEXT future, XrWorldMeshStateRequestCompletionML * completion)} */
    public static int nxrRequestWorldMeshStateCompleteML(XrWorldMeshDetectorML detector, long future, long completion) {
        long __functionAddress = detector.getCapabilities().xrRequestWorldMeshStateCompleteML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(detector.address(), future, completion, __functionAddress);
    }

    /** {@code XrResult xrRequestWorldMeshStateCompleteML(XrWorldMeshDetectorML detector, XrFutureEXT future, XrWorldMeshStateRequestCompletionML * completion)} */
    @NativeType("XrResult")
    public static int xrRequestWorldMeshStateCompleteML(XrWorldMeshDetectorML detector, @NativeType("XrFutureEXT") long future, @NativeType("XrWorldMeshStateRequestCompletionML *") XrWorldMeshStateRequestCompletionML completion) {
        return nxrRequestWorldMeshStateCompleteML(detector, future, completion.address());
    }

    // --- [ xrGetWorldMeshBufferRecommendSizeML ] ---

    /** {@code XrResult xrGetWorldMeshBufferRecommendSizeML(XrWorldMeshDetectorML detector, XrWorldMeshBufferRecommendedSizeInfoML const * sizeInfo, XrWorldMeshBufferSizeML * size)} */
    public static int nxrGetWorldMeshBufferRecommendSizeML(XrWorldMeshDetectorML detector, long sizeInfo, long size) {
        long __functionAddress = detector.getCapabilities().xrGetWorldMeshBufferRecommendSizeML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(detector.address(), sizeInfo, size, __functionAddress);
    }

    /** {@code XrResult xrGetWorldMeshBufferRecommendSizeML(XrWorldMeshDetectorML detector, XrWorldMeshBufferRecommendedSizeInfoML const * sizeInfo, XrWorldMeshBufferSizeML * size)} */
    @NativeType("XrResult")
    public static int xrGetWorldMeshBufferRecommendSizeML(XrWorldMeshDetectorML detector, @NativeType("XrWorldMeshBufferRecommendedSizeInfoML const *") XrWorldMeshBufferRecommendedSizeInfoML sizeInfo, @NativeType("XrWorldMeshBufferSizeML *") XrWorldMeshBufferSizeML size) {
        return nxrGetWorldMeshBufferRecommendSizeML(detector, sizeInfo.address(), size.address());
    }

    // --- [ xrAllocateWorldMeshBufferML ] ---

    /** {@code XrResult xrAllocateWorldMeshBufferML(XrWorldMeshDetectorML detector, XrWorldMeshBufferSizeML const * size, XrWorldMeshBufferML * buffer)} */
    public static int nxrAllocateWorldMeshBufferML(XrWorldMeshDetectorML detector, long size, long buffer) {
        long __functionAddress = detector.getCapabilities().xrAllocateWorldMeshBufferML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(detector.address(), size, buffer, __functionAddress);
    }

    /** {@code XrResult xrAllocateWorldMeshBufferML(XrWorldMeshDetectorML detector, XrWorldMeshBufferSizeML const * size, XrWorldMeshBufferML * buffer)} */
    @NativeType("XrResult")
    public static int xrAllocateWorldMeshBufferML(XrWorldMeshDetectorML detector, @NativeType("XrWorldMeshBufferSizeML const *") XrWorldMeshBufferSizeML size, @NativeType("XrWorldMeshBufferML *") XrWorldMeshBufferML buffer) {
        return nxrAllocateWorldMeshBufferML(detector, size.address(), buffer.address());
    }

    // --- [ xrFreeWorldMeshBufferML ] ---

    /** {@code XrResult xrFreeWorldMeshBufferML(XrWorldMeshDetectorML detector, XrWorldMeshBufferML const * buffer)} */
    public static int nxrFreeWorldMeshBufferML(XrWorldMeshDetectorML detector, long buffer) {
        long __functionAddress = detector.getCapabilities().xrFreeWorldMeshBufferML;
        if (CHECKS) {
            check(__functionAddress);
            XrWorldMeshBufferML.validate(buffer);
        }
        return callPPI(detector.address(), buffer, __functionAddress);
    }

    /** {@code XrResult xrFreeWorldMeshBufferML(XrWorldMeshDetectorML detector, XrWorldMeshBufferML const * buffer)} */
    @NativeType("XrResult")
    public static int xrFreeWorldMeshBufferML(XrWorldMeshDetectorML detector, @NativeType("XrWorldMeshBufferML const *") XrWorldMeshBufferML buffer) {
        return nxrFreeWorldMeshBufferML(detector, buffer.address());
    }

    // --- [ xrRequestWorldMeshAsyncML ] ---

    /** {@code XrResult xrRequestWorldMeshAsyncML(XrWorldMeshDetectorML detector, XrWorldMeshGetInfoML const * getInfo, XrWorldMeshBufferML * buffer, XrFutureEXT * future)} */
    public static int nxrRequestWorldMeshAsyncML(XrWorldMeshDetectorML detector, long getInfo, long buffer, long future) {
        long __functionAddress = detector.getCapabilities().xrRequestWorldMeshAsyncML;
        if (CHECKS) {
            check(__functionAddress);
            XrWorldMeshGetInfoML.validate(getInfo);
        }
        return callPPPPI(detector.address(), getInfo, buffer, future, __functionAddress);
    }

    /** {@code XrResult xrRequestWorldMeshAsyncML(XrWorldMeshDetectorML detector, XrWorldMeshGetInfoML const * getInfo, XrWorldMeshBufferML * buffer, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrRequestWorldMeshAsyncML(XrWorldMeshDetectorML detector, @NativeType("XrWorldMeshGetInfoML const *") XrWorldMeshGetInfoML getInfo, @NativeType("XrWorldMeshBufferML *") XrWorldMeshBufferML buffer, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrRequestWorldMeshAsyncML(detector, getInfo.address(), buffer.address(), memAddress(future));
    }

    // --- [ xrRequestWorldMeshCompleteML ] ---

    /** {@code XrResult xrRequestWorldMeshCompleteML(XrWorldMeshDetectorML detector, XrWorldMeshRequestCompletionInfoML const * completionInfo, XrFutureEXT future, XrWorldMeshRequestCompletionML * completion)} */
    public static int nxrRequestWorldMeshCompleteML(XrWorldMeshDetectorML detector, long completionInfo, long future, long completion) {
        long __functionAddress = detector.getCapabilities().xrRequestWorldMeshCompleteML;
        if (CHECKS) {
            check(__functionAddress);
            XrWorldMeshRequestCompletionInfoML.validate(completionInfo);
        }
        return callPPJPI(detector.address(), completionInfo, future, completion, __functionAddress);
    }

    /** {@code XrResult xrRequestWorldMeshCompleteML(XrWorldMeshDetectorML detector, XrWorldMeshRequestCompletionInfoML const * completionInfo, XrFutureEXT future, XrWorldMeshRequestCompletionML * completion)} */
    @NativeType("XrResult")
    public static int xrRequestWorldMeshCompleteML(XrWorldMeshDetectorML detector, @NativeType("XrWorldMeshRequestCompletionInfoML const *") XrWorldMeshRequestCompletionInfoML completionInfo, @NativeType("XrFutureEXT") long future, @NativeType("XrWorldMeshRequestCompletionML *") XrWorldMeshRequestCompletionML completion) {
        return nxrRequestWorldMeshCompleteML(detector, completionInfo.address(), future, completion.address());
    }

}