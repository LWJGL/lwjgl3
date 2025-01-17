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

public class MSFTSceneUnderstanding {

    public static final int XR_MSFT_scene_understanding_SPEC_VERSION = 2;

    public static final String XR_MSFT_SCENE_UNDERSTANDING_EXTENSION_NAME = "XR_MSFT_scene_understanding";

    public static final int
        XR_OBJECT_TYPE_SCENE_OBSERVER_MSFT = 1000097000,
        XR_OBJECT_TYPE_SCENE_MSFT          = 1000097001;

    public static final int
        XR_TYPE_SCENE_OBSERVER_CREATE_INFO_MSFT         = 1000097000,
        XR_TYPE_SCENE_CREATE_INFO_MSFT                  = 1000097001,
        XR_TYPE_NEW_SCENE_COMPUTE_INFO_MSFT             = 1000097002,
        XR_TYPE_VISUAL_MESH_COMPUTE_LOD_INFO_MSFT       = 1000097003,
        XR_TYPE_SCENE_COMPONENTS_MSFT                   = 1000097004,
        XR_TYPE_SCENE_COMPONENTS_GET_INFO_MSFT          = 1000097005,
        XR_TYPE_SCENE_COMPONENT_LOCATIONS_MSFT          = 1000097006,
        XR_TYPE_SCENE_COMPONENTS_LOCATE_INFO_MSFT       = 1000097007,
        XR_TYPE_SCENE_OBJECTS_MSFT                      = 1000097008,
        XR_TYPE_SCENE_COMPONENT_PARENT_FILTER_INFO_MSFT = 1000097009,
        XR_TYPE_SCENE_OBJECT_TYPES_FILTER_INFO_MSFT     = 1000097010,
        XR_TYPE_SCENE_PLANES_MSFT                       = 1000097011,
        XR_TYPE_SCENE_PLANE_ALIGNMENT_FILTER_INFO_MSFT  = 1000097012,
        XR_TYPE_SCENE_MESHES_MSFT                       = 1000097013,
        XR_TYPE_SCENE_MESH_BUFFERS_GET_INFO_MSFT        = 1000097014,
        XR_TYPE_SCENE_MESH_BUFFERS_MSFT                 = 1000097015,
        XR_TYPE_SCENE_MESH_VERTEX_BUFFER_MSFT           = 1000097016,
        XR_TYPE_SCENE_MESH_INDICES_UINT32_MSFT          = 1000097017,
        XR_TYPE_SCENE_MESH_INDICES_UINT16_MSFT          = 1000097018;

    public static final int
        XR_ERROR_COMPUTE_NEW_SCENE_NOT_COMPLETED_MSFT    = -1000097000,
        XR_ERROR_SCENE_COMPONENT_ID_INVALID_MSFT         = -1000097001,
        XR_ERROR_SCENE_COMPONENT_TYPE_MISMATCH_MSFT      = -1000097002,
        XR_ERROR_SCENE_MESH_BUFFER_ID_INVALID_MSFT       = -1000097003,
        XR_ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT = -1000097004,
        XR_ERROR_SCENE_COMPUTE_CONSISTENCY_MISMATCH_MSFT = -1000097005;

    public static final int
        XR_SCENE_COMPUTE_FEATURE_PLANE_MSFT         = 1,
        XR_SCENE_COMPUTE_FEATURE_PLANE_MESH_MSFT    = 2,
        XR_SCENE_COMPUTE_FEATURE_VISUAL_MESH_MSFT   = 3,
        XR_SCENE_COMPUTE_FEATURE_COLLIDER_MESH_MSFT = 4;

    public static final int
        XR_SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_COMPLETE_MSFT        = 1,
        XR_SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_INCOMPLETE_FAST_MSFT = 2,
        XR_SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT      = 3;

    public static final int
        XR_MESH_COMPUTE_LOD_COARSE_MSFT    = 1,
        XR_MESH_COMPUTE_LOD_MEDIUM_MSFT    = 2,
        XR_MESH_COMPUTE_LOD_FINE_MSFT      = 3,
        XR_MESH_COMPUTE_LOD_UNLIMITED_MSFT = 4;

    public static final int
        XR_SCENE_COMPONENT_TYPE_OBJECT_MSFT        = 1,
        XR_SCENE_COMPONENT_TYPE_PLANE_MSFT         = 2,
        XR_SCENE_COMPONENT_TYPE_VISUAL_MESH_MSFT   = 3,
        XR_SCENE_COMPONENT_TYPE_COLLIDER_MESH_MSFT = 4,
        XR_SCENE_COMPONENT_TYPE_INVALID_MSFT       = -1;

    public static final int
        XR_SCENE_OBJECT_TYPE_BACKGROUND_MSFT    = 1,
        XR_SCENE_OBJECT_TYPE_WALL_MSFT          = 2,
        XR_SCENE_OBJECT_TYPE_FLOOR_MSFT         = 3,
        XR_SCENE_OBJECT_TYPE_CEILING_MSFT       = 4,
        XR_SCENE_OBJECT_TYPE_PLATFORM_MSFT      = 5,
        XR_SCENE_OBJECT_TYPE_INFERRED_MSFT      = 6,
        XR_SCENE_OBJECT_TYPE_UNCATEGORIZED_MSFT = -1;

    public static final int
        XR_SCENE_PLANE_ALIGNMENT_TYPE_NON_ORTHOGONAL_MSFT = 0,
        XR_SCENE_PLANE_ALIGNMENT_TYPE_HORIZONTAL_MSFT     = 1,
        XR_SCENE_PLANE_ALIGNMENT_TYPE_VERTICAL_MSFT       = 2;

    public static final int
        XR_SCENE_COMPUTE_STATE_NONE_MSFT                 = 0,
        XR_SCENE_COMPUTE_STATE_UPDATING_MSFT             = 1,
        XR_SCENE_COMPUTE_STATE_COMPLETED_MSFT            = 2,
        XR_SCENE_COMPUTE_STATE_COMPLETED_WITH_ERROR_MSFT = 3;

    protected MSFTSceneUnderstanding() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateSceneComputeFeaturesMSFT ] ---

    /** {@code XrResult xrEnumerateSceneComputeFeaturesMSFT(XrInstance instance, XrSystemId systemId, uint32_t featureCapacityInput, uint32_t * featureCountOutput, XrSceneComputeFeatureMSFT * features)} */
    public static int nxrEnumerateSceneComputeFeaturesMSFT(XrInstance instance, long systemId, int featureCapacityInput, long featureCountOutput, long features) {
        long __functionAddress = instance.getCapabilities().xrEnumerateSceneComputeFeaturesMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(instance.address(), systemId, featureCapacityInput, featureCountOutput, features, __functionAddress);
    }

    /** {@code XrResult xrEnumerateSceneComputeFeaturesMSFT(XrInstance instance, XrSystemId systemId, uint32_t featureCapacityInput, uint32_t * featureCountOutput, XrSceneComputeFeatureMSFT * features)} */
    @NativeType("XrResult")
    public static int xrEnumerateSceneComputeFeaturesMSFT(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("uint32_t *") IntBuffer featureCountOutput, @NativeType("XrSceneComputeFeatureMSFT *") @Nullable IntBuffer features) {
        if (CHECKS) {
            check(featureCountOutput, 1);
        }
        return nxrEnumerateSceneComputeFeaturesMSFT(instance, systemId, remainingSafe(features), memAddress(featureCountOutput), memAddressSafe(features));
    }

    // --- [ xrCreateSceneObserverMSFT ] ---

    /** {@code XrResult xrCreateSceneObserverMSFT(XrSession session, XrSceneObserverCreateInfoMSFT const * createInfo, XrSceneObserverMSFT * sceneObserver)} */
    public static int nxrCreateSceneObserverMSFT(XrSession session, long createInfo, long sceneObserver) {
        long __functionAddress = session.getCapabilities().xrCreateSceneObserverMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, sceneObserver, __functionAddress);
    }

    /** {@code XrResult xrCreateSceneObserverMSFT(XrSession session, XrSceneObserverCreateInfoMSFT const * createInfo, XrSceneObserverMSFT * sceneObserver)} */
    @NativeType("XrResult")
    public static int xrCreateSceneObserverMSFT(XrSession session, @NativeType("XrSceneObserverCreateInfoMSFT const *") @Nullable XrSceneObserverCreateInfoMSFT createInfo, @NativeType("XrSceneObserverMSFT *") PointerBuffer sceneObserver) {
        if (CHECKS) {
            check(sceneObserver, 1);
        }
        return nxrCreateSceneObserverMSFT(session, memAddressSafe(createInfo), memAddress(sceneObserver));
    }

    // --- [ xrDestroySceneObserverMSFT ] ---

    /** {@code XrResult xrDestroySceneObserverMSFT(XrSceneObserverMSFT sceneObserver)} */
    @NativeType("XrResult")
    public static int xrDestroySceneObserverMSFT(XrSceneObserverMSFT sceneObserver) {
        long __functionAddress = sceneObserver.getCapabilities().xrDestroySceneObserverMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(sceneObserver.address(), __functionAddress);
    }

    // --- [ xrCreateSceneMSFT ] ---

    /** {@code XrResult xrCreateSceneMSFT(XrSceneObserverMSFT sceneObserver, XrSceneCreateInfoMSFT const * createInfo, XrSceneMSFT * scene)} */
    public static int nxrCreateSceneMSFT(XrSceneObserverMSFT sceneObserver, long createInfo, long scene) {
        long __functionAddress = sceneObserver.getCapabilities().xrCreateSceneMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(sceneObserver.address(), createInfo, scene, __functionAddress);
    }

    /** {@code XrResult xrCreateSceneMSFT(XrSceneObserverMSFT sceneObserver, XrSceneCreateInfoMSFT const * createInfo, XrSceneMSFT * scene)} */
    @NativeType("XrResult")
    public static int xrCreateSceneMSFT(XrSceneObserverMSFT sceneObserver, @NativeType("XrSceneCreateInfoMSFT const *") @Nullable XrSceneCreateInfoMSFT createInfo, @NativeType("XrSceneMSFT *") PointerBuffer scene) {
        if (CHECKS) {
            check(scene, 1);
        }
        return nxrCreateSceneMSFT(sceneObserver, memAddressSafe(createInfo), memAddress(scene));
    }

    // --- [ xrDestroySceneMSFT ] ---

    /** {@code XrResult xrDestroySceneMSFT(XrSceneMSFT scene)} */
    @NativeType("XrResult")
    public static int xrDestroySceneMSFT(XrSceneMSFT scene) {
        long __functionAddress = scene.getCapabilities().xrDestroySceneMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(scene.address(), __functionAddress);
    }

    // --- [ xrComputeNewSceneMSFT ] ---

    /** {@code XrResult xrComputeNewSceneMSFT(XrSceneObserverMSFT sceneObserver, XrNewSceneComputeInfoMSFT const * computeInfo)} */
    public static int nxrComputeNewSceneMSFT(XrSceneObserverMSFT sceneObserver, long computeInfo) {
        long __functionAddress = sceneObserver.getCapabilities().xrComputeNewSceneMSFT;
        if (CHECKS) {
            check(__functionAddress);
            XrNewSceneComputeInfoMSFT.validate(computeInfo);
        }
        return callPPI(sceneObserver.address(), computeInfo, __functionAddress);
    }

    /** {@code XrResult xrComputeNewSceneMSFT(XrSceneObserverMSFT sceneObserver, XrNewSceneComputeInfoMSFT const * computeInfo)} */
    @NativeType("XrResult")
    public static int xrComputeNewSceneMSFT(XrSceneObserverMSFT sceneObserver, @NativeType("XrNewSceneComputeInfoMSFT const *") XrNewSceneComputeInfoMSFT computeInfo) {
        return nxrComputeNewSceneMSFT(sceneObserver, computeInfo.address());
    }

    // --- [ xrGetSceneComputeStateMSFT ] ---

    /** {@code XrResult xrGetSceneComputeStateMSFT(XrSceneObserverMSFT sceneObserver, XrSceneComputeStateMSFT * state)} */
    public static int nxrGetSceneComputeStateMSFT(XrSceneObserverMSFT sceneObserver, long state) {
        long __functionAddress = sceneObserver.getCapabilities().xrGetSceneComputeStateMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(sceneObserver.address(), state, __functionAddress);
    }

    /** {@code XrResult xrGetSceneComputeStateMSFT(XrSceneObserverMSFT sceneObserver, XrSceneComputeStateMSFT * state)} */
    @NativeType("XrResult")
    public static int xrGetSceneComputeStateMSFT(XrSceneObserverMSFT sceneObserver, @NativeType("XrSceneComputeStateMSFT *") IntBuffer state) {
        if (CHECKS) {
            check(state, 1);
        }
        return nxrGetSceneComputeStateMSFT(sceneObserver, memAddress(state));
    }

    // --- [ xrGetSceneComponentsMSFT ] ---

    /** {@code XrResult xrGetSceneComponentsMSFT(XrSceneMSFT scene, XrSceneComponentsGetInfoMSFT const * getInfo, XrSceneComponentsMSFT * components)} */
    public static int nxrGetSceneComponentsMSFT(XrSceneMSFT scene, long getInfo, long components) {
        long __functionAddress = scene.getCapabilities().xrGetSceneComponentsMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(scene.address(), getInfo, components, __functionAddress);
    }

    /** {@code XrResult xrGetSceneComponentsMSFT(XrSceneMSFT scene, XrSceneComponentsGetInfoMSFT const * getInfo, XrSceneComponentsMSFT * components)} */
    @NativeType("XrResult")
    public static int xrGetSceneComponentsMSFT(XrSceneMSFT scene, @NativeType("XrSceneComponentsGetInfoMSFT const *") XrSceneComponentsGetInfoMSFT getInfo, @NativeType("XrSceneComponentsMSFT *") XrSceneComponentsMSFT components) {
        return nxrGetSceneComponentsMSFT(scene, getInfo.address(), components.address());
    }

    // --- [ xrLocateSceneComponentsMSFT ] ---

    /** {@code XrResult xrLocateSceneComponentsMSFT(XrSceneMSFT scene, XrSceneComponentsLocateInfoMSFT const * locateInfo, XrSceneComponentLocationsMSFT * locations)} */
    public static int nxrLocateSceneComponentsMSFT(XrSceneMSFT scene, long locateInfo, long locations) {
        long __functionAddress = scene.getCapabilities().xrLocateSceneComponentsMSFT;
        if (CHECKS) {
            check(__functionAddress);
            XrSceneComponentsLocateInfoMSFT.validate(locateInfo);
        }
        return callPPPI(scene.address(), locateInfo, locations, __functionAddress);
    }

    /** {@code XrResult xrLocateSceneComponentsMSFT(XrSceneMSFT scene, XrSceneComponentsLocateInfoMSFT const * locateInfo, XrSceneComponentLocationsMSFT * locations)} */
    @NativeType("XrResult")
    public static int xrLocateSceneComponentsMSFT(XrSceneMSFT scene, @NativeType("XrSceneComponentsLocateInfoMSFT const *") XrSceneComponentsLocateInfoMSFT locateInfo, @NativeType("XrSceneComponentLocationsMSFT *") XrSceneComponentLocationsMSFT locations) {
        return nxrLocateSceneComponentsMSFT(scene, locateInfo.address(), locations.address());
    }

    // --- [ xrGetSceneMeshBuffersMSFT ] ---

    /** {@code XrResult xrGetSceneMeshBuffersMSFT(XrSceneMSFT scene, XrSceneMeshBuffersGetInfoMSFT const * getInfo, XrSceneMeshBuffersMSFT * buffers)} */
    public static int nxrGetSceneMeshBuffersMSFT(XrSceneMSFT scene, long getInfo, long buffers) {
        long __functionAddress = scene.getCapabilities().xrGetSceneMeshBuffersMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(scene.address(), getInfo, buffers, __functionAddress);
    }

    /** {@code XrResult xrGetSceneMeshBuffersMSFT(XrSceneMSFT scene, XrSceneMeshBuffersGetInfoMSFT const * getInfo, XrSceneMeshBuffersMSFT * buffers)} */
    @NativeType("XrResult")
    public static int xrGetSceneMeshBuffersMSFT(XrSceneMSFT scene, @NativeType("XrSceneMeshBuffersGetInfoMSFT const *") XrSceneMeshBuffersGetInfoMSFT getInfo, @NativeType("XrSceneMeshBuffersMSFT *") XrSceneMeshBuffersMSFT buffers) {
        return nxrGetSceneMeshBuffersMSFT(scene, getInfo.address(), buffers.address());
    }

}