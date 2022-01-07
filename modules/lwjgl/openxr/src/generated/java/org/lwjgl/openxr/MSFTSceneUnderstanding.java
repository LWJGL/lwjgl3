/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The MSFT_scene_understanding extension. */
public class MSFTSceneUnderstanding {

    /** The extension specification version. */
    public static final int XR_MSFT_scene_understanding_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_MSFT_SCENE_UNDERSTANDING_EXTENSION_NAME = "XR_MSFT_scene_understanding";

    /**
     * Extends {@code XrObjectType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_OBJECT_TYPE_SCENE_OBSERVER_MSFT OBJECT_TYPE_SCENE_OBSERVER_MSFT}</li>
     * <li>{@link #XR_OBJECT_TYPE_SCENE_MSFT OBJECT_TYPE_SCENE_MSFT}</li>
     * </ul>
     */
    public static final int
        XR_OBJECT_TYPE_SCENE_OBSERVER_MSFT = 1000097000,
        XR_OBJECT_TYPE_SCENE_MSFT          = 1000097001;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SCENE_OBSERVER_CREATE_INFO_MSFT TYPE_SCENE_OBSERVER_CREATE_INFO_MSFT}</li>
     * <li>{@link #XR_TYPE_SCENE_CREATE_INFO_MSFT TYPE_SCENE_CREATE_INFO_MSFT}</li>
     * <li>{@link #XR_TYPE_NEW_SCENE_COMPUTE_INFO_MSFT TYPE_NEW_SCENE_COMPUTE_INFO_MSFT}</li>
     * <li>{@link #XR_TYPE_VISUAL_MESH_COMPUTE_LOD_INFO_MSFT TYPE_VISUAL_MESH_COMPUTE_LOD_INFO_MSFT}</li>
     * <li>{@link #XR_TYPE_SCENE_COMPONENTS_MSFT TYPE_SCENE_COMPONENTS_MSFT}</li>
     * <li>{@link #XR_TYPE_SCENE_COMPONENTS_GET_INFO_MSFT TYPE_SCENE_COMPONENTS_GET_INFO_MSFT}</li>
     * <li>{@link #XR_TYPE_SCENE_COMPONENT_LOCATIONS_MSFT TYPE_SCENE_COMPONENT_LOCATIONS_MSFT}</li>
     * <li>{@link #XR_TYPE_SCENE_COMPONENTS_LOCATE_INFO_MSFT TYPE_SCENE_COMPONENTS_LOCATE_INFO_MSFT}</li>
     * <li>{@link #XR_TYPE_SCENE_OBJECTS_MSFT TYPE_SCENE_OBJECTS_MSFT}</li>
     * <li>{@link #XR_TYPE_SCENE_COMPONENT_PARENT_FILTER_INFO_MSFT TYPE_SCENE_COMPONENT_PARENT_FILTER_INFO_MSFT}</li>
     * <li>{@link #XR_TYPE_SCENE_OBJECT_TYPES_FILTER_INFO_MSFT TYPE_SCENE_OBJECT_TYPES_FILTER_INFO_MSFT}</li>
     * <li>{@link #XR_TYPE_SCENE_PLANES_MSFT TYPE_SCENE_PLANES_MSFT}</li>
     * <li>{@link #XR_TYPE_SCENE_PLANE_ALIGNMENT_FILTER_INFO_MSFT TYPE_SCENE_PLANE_ALIGNMENT_FILTER_INFO_MSFT}</li>
     * <li>{@link #XR_TYPE_SCENE_MESHES_MSFT TYPE_SCENE_MESHES_MSFT}</li>
     * <li>{@link #XR_TYPE_SCENE_MESH_BUFFERS_GET_INFO_MSFT TYPE_SCENE_MESH_BUFFERS_GET_INFO_MSFT}</li>
     * <li>{@link #XR_TYPE_SCENE_MESH_BUFFERS_MSFT TYPE_SCENE_MESH_BUFFERS_MSFT}</li>
     * <li>{@link #XR_TYPE_SCENE_MESH_VERTEX_BUFFER_MSFT TYPE_SCENE_MESH_VERTEX_BUFFER_MSFT}</li>
     * <li>{@link #XR_TYPE_SCENE_MESH_INDICES_UINT32_MSFT TYPE_SCENE_MESH_INDICES_UINT32_MSFT}</li>
     * <li>{@link #XR_TYPE_SCENE_MESH_INDICES_UINT16_MSFT TYPE_SCENE_MESH_INDICES_UINT16_MSFT}</li>
     * </ul>
     */
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

    /**
     * Extends {@code XrResult}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_ERROR_COMPUTE_NEW_SCENE_NOT_COMPLETED_MSFT ERROR_COMPUTE_NEW_SCENE_NOT_COMPLETED_MSFT}</li>
     * <li>{@link #XR_ERROR_SCENE_COMPONENT_ID_INVALID_MSFT ERROR_SCENE_COMPONENT_ID_INVALID_MSFT}</li>
     * <li>{@link #XR_ERROR_SCENE_COMPONENT_TYPE_MISMATCH_MSFT ERROR_SCENE_COMPONENT_TYPE_MISMATCH_MSFT}</li>
     * <li>{@link #XR_ERROR_SCENE_MESH_BUFFER_ID_INVALID_MSFT ERROR_SCENE_MESH_BUFFER_ID_INVALID_MSFT}</li>
     * <li>{@link #XR_ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT}</li>
     * <li>{@link #XR_ERROR_SCENE_COMPUTE_CONSISTENCY_MISMATCH_MSFT ERROR_SCENE_COMPUTE_CONSISTENCY_MISMATCH_MSFT}</li>
     * </ul>
     */
    public static final int
        XR_ERROR_COMPUTE_NEW_SCENE_NOT_COMPLETED_MSFT    = -1000097000,
        XR_ERROR_SCENE_COMPONENT_ID_INVALID_MSFT         = -1000097001,
        XR_ERROR_SCENE_COMPONENT_TYPE_MISMATCH_MSFT      = -1000097002,
        XR_ERROR_SCENE_MESH_BUFFER_ID_INVALID_MSFT       = -1000097003,
        XR_ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT = -1000097004,
        XR_ERROR_SCENE_COMPUTE_CONSISTENCY_MISMATCH_MSFT = -1000097005;

    /**
     * XrSceneComputeFeatureMSFT - Scene compute feature
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_SCENE_COMPUTE_FEATURE_PLANE_MSFT SCENE_COMPUTE_FEATURE_PLANE_MSFT} specifies that plane data for objects should be included in the resulting scene.</li>
     * <li>{@link #XR_SCENE_COMPUTE_FEATURE_PLANE_MESH_MSFT SCENE_COMPUTE_FEATURE_PLANE_MESH_MSFT} specifies that planar meshes for objects should be included in the resulting scene.</li>
     * <li>{@link #XR_SCENE_COMPUTE_FEATURE_VISUAL_MESH_MSFT SCENE_COMPUTE_FEATURE_VISUAL_MESH_MSFT} specifies that 3D visualization meshes for objects should be included in the resulting scene.</li>
     * <li>{@link #XR_SCENE_COMPUTE_FEATURE_COLLIDER_MESH_MSFT SCENE_COMPUTE_FEATURE_COLLIDER_MESH_MSFT} specifies that 3D collider meshes for objects should be included in the resulting scene.</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Applications wanting to use the scene for analysis, or in a physics simulation should set {@code consistency} to {@link #XR_SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_COMPLETE_MSFT SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_COMPLETE_MSFT} in order to avoid physics objects falling through the gaps and escaping the scene.</p>
     * 
     * <p>Setting {@code consistency} to {@link #XR_SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_INCOMPLETE_FAST_MSFT SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_INCOMPLETE_FAST_MSFT} might speed up the compute but it will result in gaps in the scene.</p>
     * 
     * <p>Setting {@code consistency} to {@link #XR_SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT} should be done when the resulting mesh will only be used to occlude virtual objects that are behind real-world surfaces. This mode will be most efficient and have the lowest-latency, but will return meshes less suitable for analysis or visualization.</p>
     * </div>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrNewSceneComputeInfoMSFT}, {@link #xrComputeNewSceneMSFT ComputeNewSceneMSFT}, {@link #xrEnumerateSceneComputeFeaturesMSFT EnumerateSceneComputeFeaturesMSFT}</p>
     */
    public static final int
        XR_SCENE_COMPUTE_FEATURE_PLANE_MSFT         = 1,
        XR_SCENE_COMPUTE_FEATURE_PLANE_MESH_MSFT    = 2,
        XR_SCENE_COMPUTE_FEATURE_VISUAL_MESH_MSFT   = 3,
        XR_SCENE_COMPUTE_FEATURE_COLLIDER_MESH_MSFT = 4;

    /**
     * XrSceneComputeConsistencyMSFT - Scene compute consistency
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_COMPLETE_MSFT SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_COMPLETE_MSFT}. The runtime <b>must</b> return a scene that is a consistent and complete snapshot of the environment, inferring the size and shape of objects as needed where the objects were not directly observed, in order to generate a watertight representation of the scene.</li>
     * <li>{@link #XR_SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_INCOMPLETE_FAST_MSFT SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_INCOMPLETE_FAST_MSFT}. The runtime <b>must</b> return a consistent snapshot of the scene with meshes that do not overlap adjacent meshes at their edges, but <b>may</b> skip returning objects with {@code XrSceneObjectTypeMSFT} of {@link #XR_SCENE_OBJECT_TYPE_INFERRED_MSFT SCENE_OBJECT_TYPE_INFERRED_MSFT} in order to return the scene faster.</li>
     * <li>{@link #XR_SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT}. The runtime <b>may</b> react to this value by computing scenes more quickly and reusing existing mesh buffer IDs more often to minimize app overhead, with potential tradeoffs such as returning meshes that are not watertight, meshes that overlap adjacent meshes at their edges to allow partial updates in the future, or other reductions in mesh quality that are less observable when mesh is used for occlusion only.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrNewSceneComputeInfoMSFT}, {@link #xrComputeNewSceneMSFT ComputeNewSceneMSFT}</p>
     */
    public static final int
        XR_SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_COMPLETE_MSFT        = 1,
        XR_SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_INCOMPLETE_FAST_MSFT = 2,
        XR_SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT      = 3;

    /**
     * XrMeshComputeLodMSFT - Mesh compute level of detail enumeration
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_MESH_COMPUTE_LOD_COARSE_MSFT MESH_COMPUTE_LOD_COARSE_MSFT}. Coarse mesh compute level of detail will generate roughly 100 triangles per cubic meter.</li>
     * <li>{@link #XR_MESH_COMPUTE_LOD_MEDIUM_MSFT MESH_COMPUTE_LOD_MEDIUM_MSFT}. Medium mesh compute level of detail will generate roughly 400 triangles per cubic meter.</li>
     * <li>{@link #XR_MESH_COMPUTE_LOD_FINE_MSFT MESH_COMPUTE_LOD_FINE_MSFT}. Fine mesh compute level of detail will generate roughly 2000 triangles per cubic meter.</li>
     * <li>{@link #XR_MESH_COMPUTE_LOD_UNLIMITED_MSFT MESH_COMPUTE_LOD_UNLIMITED_MSFT}. Unlimited mesh compute level of detail. There is no guarantee as to the number of triangles returned.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrVisualMeshComputeLodInfoMSFT}</p>
     */
    public static final int
        XR_MESH_COMPUTE_LOD_COARSE_MSFT    = 1,
        XR_MESH_COMPUTE_LOD_MEDIUM_MSFT    = 2,
        XR_MESH_COMPUTE_LOD_FINE_MSFT      = 3,
        XR_MESH_COMPUTE_LOD_UNLIMITED_MSFT = 4;

    /**
     * XrSceneComponentTypeMSFT - Scene component type
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_SCENE_COMPONENT_TYPE_INVALID_MSFT SCENE_COMPONENT_TYPE_INVALID_MSFT} indicates an invalid scene component type.</li>
     * <li>{@link #XR_SCENE_COMPONENT_TYPE_OBJECT_MSFT SCENE_COMPONENT_TYPE_OBJECT_MSFT} indicates a discrete object detected in the world, such as a wall, floor, ceiling or table. Scene objects then provide their geometric representations such as planes and meshes as child scene components with the types below.</li>
     * <li>{@link #XR_SCENE_COMPONENT_TYPE_PLANE_MSFT SCENE_COMPONENT_TYPE_PLANE_MSFT} indicates a flat 2D representation of a surface in the world, such as a wall, floor, ceiling or table.</li>
     * <li>{@link #XR_SCENE_COMPONENT_TYPE_VISUAL_MESH_MSFT SCENE_COMPONENT_TYPE_VISUAL_MESH_MSFT} indicates a visual mesh representation of an object in the world, optimized for visual quality when directly rendering a wireframe or other mesh visualization to the user. Visual mesh can also be used for rendering the silhouettes of objects. Applications can request varying levels of detail for visual meshes when calling {@link #xrComputeNewSceneMSFT ComputeNewSceneMSFT} using {@link XrVisualMeshComputeLodInfoMSFT}.</li>
     * <li>{@link #XR_SCENE_COMPONENT_TYPE_COLLIDER_MESH_MSFT SCENE_COMPONENT_TYPE_COLLIDER_MESH_MSFT} indicates a collider mesh representation of an object in the world, optimized to maintain the silhouette of an object while reducing detail on mostly-flat surfaces. Collider mesh is useful when calculating physics collisions or when rendering silhouettes of objects for occlusion.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSceneComponentMSFT}, {@link XrSceneComponentsGetInfoMSFT}</p>
     */
    public static final int
        XR_SCENE_COMPONENT_TYPE_INVALID_MSFT       = -1,
        XR_SCENE_COMPONENT_TYPE_OBJECT_MSFT        = 1,
        XR_SCENE_COMPONENT_TYPE_PLANE_MSFT         = 2,
        XR_SCENE_COMPONENT_TYPE_VISUAL_MESH_MSFT   = 3,
        XR_SCENE_COMPONENT_TYPE_COLLIDER_MESH_MSFT = 4;

    /**
     * XrSceneObjectTypeMSFT - Scene object type
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_SCENE_OBJECT_TYPE_UNCATEGORIZED_MSFT SCENE_OBJECT_TYPE_UNCATEGORIZED_MSFT}. This scene object has yet to be classified and assigned a type. This should not be confused with background, as this object could be anything; the system has just not come up with a strong enough classification for it yet.</li>
     * <li>{@link #XR_SCENE_OBJECT_TYPE_BACKGROUND_MSFT SCENE_OBJECT_TYPE_BACKGROUND_MSFT}. The scene object is known to be not one of the other recognized types of scene object. This class should not be confused with uncategorized where background is known not to be wall/floor/ceiling etc. while uncategorized is not yet categorized.</li>
     * <li>{@link #XR_SCENE_OBJECT_TYPE_WALL_MSFT SCENE_OBJECT_TYPE_WALL_MSFT}. A physical wall. Walls are assumed to be immovable environmental structures.</li>
     * <li>{@link #XR_SCENE_OBJECT_TYPE_FLOOR_MSFT SCENE_OBJECT_TYPE_FLOOR_MSFT}. Floors are any surfaces on which one can walk. Note: stairs are not floors. Also note, that floors assume any walkable surface and therefore there is no explicit assumption of a singular floor. Multi-level structures, ramps, etc. should all classify as floor.</li>
     * <li>{@link #XR_SCENE_OBJECT_TYPE_CEILING_MSFT SCENE_OBJECT_TYPE_CEILING_MSFT}. The upper surface of a room.</li>
     * <li>{@link #XR_SCENE_OBJECT_TYPE_PLATFORM_MSFT SCENE_OBJECT_TYPE_PLATFORM_MSFT}. A large flat surface on which you could place holograms. These tend to represent tables, countertops, and other large horizontal surfaces.</li>
     * <li>{@link #XR_SCENE_OBJECT_TYPE_INFERRED_MSFT SCENE_OBJECT_TYPE_INFERRED_MSFT}. An imaginary object that was added to the scene in order to make the scene watertight and avoid gaps.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrNewSceneComputeInfoMSFT}, {@link XrSceneObjectMSFT}, {@link XrSceneObjectTypesFilterInfoMSFT}</p>
     */
    public static final int
        XR_SCENE_OBJECT_TYPE_UNCATEGORIZED_MSFT = -1,
        XR_SCENE_OBJECT_TYPE_BACKGROUND_MSFT    = 1,
        XR_SCENE_OBJECT_TYPE_WALL_MSFT          = 2,
        XR_SCENE_OBJECT_TYPE_FLOOR_MSFT         = 3,
        XR_SCENE_OBJECT_TYPE_CEILING_MSFT       = 4,
        XR_SCENE_OBJECT_TYPE_PLATFORM_MSFT      = 5,
        XR_SCENE_OBJECT_TYPE_INFERRED_MSFT      = 6;

    /**
     * XrScenePlaneAlignmentTypeMSFT - Scene plane alignment type
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_SCENE_PLANE_ALIGNMENT_TYPE_NON_ORTHOGONAL_MSFT SCENE_PLANE_ALIGNMENT_TYPE_NON_ORTHOGONAL_MSFT} means the plane’s normal is not orthogonal or parallel to the gravity direction.</li>
     * <li>{@link #XR_SCENE_PLANE_ALIGNMENT_TYPE_HORIZONTAL_MSFT SCENE_PLANE_ALIGNMENT_TYPE_HORIZONTAL_MSFT} means the plane’s normal is roughly parallel to the gravity direction.</li>
     * <li>{@link #XR_SCENE_PLANE_ALIGNMENT_TYPE_VERTICAL_MSFT SCENE_PLANE_ALIGNMENT_TYPE_VERTICAL_MSFT} means the plane’s normal is roughly orthogonal to the gravity direction.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrScenePlaneAlignmentFilterInfoMSFT}, {@link XrScenePlaneMSFT}</p>
     */
    public static final int
        XR_SCENE_PLANE_ALIGNMENT_TYPE_NON_ORTHOGONAL_MSFT = 0,
        XR_SCENE_PLANE_ALIGNMENT_TYPE_HORIZONTAL_MSFT     = 1,
        XR_SCENE_PLANE_ALIGNMENT_TYPE_VERTICAL_MSFT       = 2;

    /**
     * XrSceneComputeStateMSFT - Scene compute state type
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_SCENE_COMPUTE_STATE_NONE_MSFT SCENE_COMPUTE_STATE_NONE_MSFT} indicates that no scene is available, and that a scene is not being computed. The application <b>may</b> call {@link #xrComputeNewSceneMSFT ComputeNewSceneMSFT} to start computing a scene.</li>
     * <li>{@link #XR_SCENE_COMPUTE_STATE_UPDATING_MSFT SCENE_COMPUTE_STATE_UPDATING_MSFT} indicates that a new scene is being computed. Calling {@link #xrCreateSceneMSFT CreateSceneMSFT} or {@link #xrComputeNewSceneMSFT ComputeNewSceneMSFT} <b>must</b> return the error {@link #XR_ERROR_COMPUTE_NEW_SCENE_NOT_COMPLETED_MSFT ERROR_COMPUTE_NEW_SCENE_NOT_COMPLETED_MSFT}.</li>
     * <li>{@link #XR_SCENE_COMPUTE_STATE_COMPLETED_MSFT SCENE_COMPUTE_STATE_COMPLETED_MSFT} indicates that a new scene has completed computing. The application <b>may</b> call {@link #xrCreateSceneMSFT CreateSceneMSFT} to get the results of the query or the application <b>may</b> call {@link #xrComputeNewSceneMSFT ComputeNewSceneMSFT} to start computing a new scene.</li>
     * <li>{@link #XR_SCENE_COMPUTE_STATE_COMPLETED_WITH_ERROR_MSFT SCENE_COMPUTE_STATE_COMPLETED_WITH_ERROR_MSFT} indicates that the new scene computation completed with an error. Calling {@link #xrCreateSceneMSFT CreateSceneMSFT} <b>must</b> return a valid {@code XrSceneMSFT} handle but calling {@link #xrGetSceneComponentsMSFT GetSceneComponentsMSFT} with that handle <b>must</b> return zero scene components. The runtime <b>must</b> allow the application to call {@link #xrComputeNewSceneMSFT ComputeNewSceneMSFT} to try computing a scene again, even if the last call to {@link #xrComputeNewSceneMSFT ComputeNewSceneMSFT} resulted in {@link #XR_SCENE_COMPUTE_STATE_COMPLETED_WITH_ERROR_MSFT SCENE_COMPUTE_STATE_COMPLETED_WITH_ERROR_MSFT}.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrGetSceneComputeStateMSFT GetSceneComputeStateMSFT}</p>
     */
    public static final int
        XR_SCENE_COMPUTE_STATE_NONE_MSFT                 = 0,
        XR_SCENE_COMPUTE_STATE_UPDATING_MSFT             = 1,
        XR_SCENE_COMPUTE_STATE_COMPLETED_MSFT            = 2,
        XR_SCENE_COMPUTE_STATE_COMPLETED_WITH_ERROR_MSFT = 3;

    protected MSFTSceneUnderstanding() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateSceneComputeFeaturesMSFT ] ---

    /**
     * Unsafe version of: {@link #xrEnumerateSceneComputeFeaturesMSFT EnumerateSceneComputeFeaturesMSFT}
     *
     * @param featureCapacityInput the capacity of the array, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrEnumerateSceneComputeFeaturesMSFT(XrInstance instance, long systemId, int featureCapacityInput, long featureCountOutput, long features) {
        long __functionAddress = instance.getCapabilities().xrEnumerateSceneComputeFeaturesMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(instance.address(), systemId, featureCapacityInput, featureCountOutput, features, __functionAddress);
    }

    /**
     * Enumerates scene compute features.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrEnumerateSceneComputeFeaturesMSFT EnumerateSceneComputeFeaturesMSFT} function enumerates the supported scene compute features of the given system.</p>
     * 
     * <p>This function follows the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#buffer-size-parameters">two-call idiom</a> for filling the {@code features} array.</p>
     * 
     * <pre><code>
     * XrResult xrEnumerateSceneComputeFeaturesMSFT(
     *     XrInstance                                  instance,
     *     XrSystemId                                  systemId,
     *     uint32_t                                    featureCapacityInput,
     *     uint32_t*                                   featureCountOutput,
     *     XrSceneComputeFeatureMSFT*                  features);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to calling {@link #xrEnumerateSceneComputeFeaturesMSFT EnumerateSceneComputeFeaturesMSFT}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code featureCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code featureCapacityInput} is not 0, {@code features} <b>must</b> be a pointer to an array of {@code featureCapacityInput} {@code XrSceneComputeFeatureMSFT} values</li>
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
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * <li>{@link XR10#XR_ERROR_SYSTEM_INVALID ERROR_SYSTEM_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrComputeNewSceneMSFT ComputeNewSceneMSFT}</p>
     *
     * @param instance           a handle to an {@code XrInstance}.
     * @param systemId           the {@code XrSystemId} whose scene compute features will be enumerated.
     * @param featureCountOutput a pointer to the count of scene compute features, or a pointer to the required capacity in the case that {@code featureCapacityInput} is 0.
     * @param features           an array of {@code XrSceneComputeFeatureMSFT}.
     */
    @NativeType("XrResult")
    public static int xrEnumerateSceneComputeFeaturesMSFT(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("uint32_t *") IntBuffer featureCountOutput, @Nullable @NativeType("XrSceneComputeFeatureMSFT *") IntBuffer features) {
        if (CHECKS) {
            check(featureCountOutput, 1);
        }
        return nxrEnumerateSceneComputeFeaturesMSFT(instance, systemId, remainingSafe(features), memAddress(featureCountOutput), memAddressSafe(features));
    }

    // --- [ xrCreateSceneObserverMSFT ] ---

    /** Unsafe version of: {@link #xrCreateSceneObserverMSFT CreateSceneObserverMSFT} */
    public static int nxrCreateSceneObserverMSFT(XrSession session, long createInfo, long sceneObserver) {
        long __functionAddress = session.getCapabilities().xrCreateSceneObserverMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, sceneObserver, __functionAddress);
    }

    /**
     * Create a scene observer handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>An {@code XrSceneObserverMSFT} handle is created using {@link #xrCreateSceneObserverMSFT CreateSceneObserverMSFT}.</p>
     * 
     * <pre><code>
     * XrResult xrCreateSceneObserverMSFT(
     *     XrSession                                   session,
     *     const XrSceneObserverCreateInfoMSFT*        createInfo,
     *     XrSceneObserverMSFT*                        sceneObserver);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to calling {@link #xrCreateSceneObserverMSFT CreateSceneObserverMSFT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>If {@code createInfo} is not {@code NULL}, {@code createInfo} <b>must</b> be a pointer to a valid {@link XrSceneObserverCreateInfoMSFT} structure</li>
     * <li>{@code sceneObserver} <b>must</b> be a pointer to an {@code XrSceneObserverMSFT} handle</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSceneObserverCreateInfoMSFT}, {@link #xrDestroySceneObserverMSFT DestroySceneObserverMSFT}</p>
     *
     * @param session       an {@code XrSession} in which the scene observer will be active.
     * @param createInfo    exists for extensibility purposes, it is {@code NULL} or a pointer to a valid {@link XrSceneObserverCreateInfoMSFT} structure.
     * @param sceneObserver the returned {@code XrSceneObserverMSFT} handle.
     */
    @NativeType("XrResult")
    public static int xrCreateSceneObserverMSFT(XrSession session, @Nullable @NativeType("XrSceneObserverCreateInfoMSFT const *") XrSceneObserverCreateInfoMSFT createInfo, @NativeType("XrSceneObserverMSFT *") PointerBuffer sceneObserver) {
        if (CHECKS) {
            check(sceneObserver, 1);
        }
        return nxrCreateSceneObserverMSFT(session, memAddressSafe(createInfo), memAddress(sceneObserver));
    }

    // --- [ xrDestroySceneObserverMSFT ] ---

    /**
     * Destroy a scene observer handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroySceneObserverMSFT DestroySceneObserverMSFT} function releases the {@code sceneObserver} and the underlying resources.</p>
     * 
     * <pre><code>
     * XrResult xrDestroySceneObserverMSFT(
     *     XrSceneObserverMSFT                         sceneObserver);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to calling {@link #xrDestroySceneObserverMSFT DestroySceneObserverMSFT}</li>
     * <li>{@code sceneObserver} <b>must</b> be a valid {@code XrSceneObserverMSFT} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code sceneObserver}, and any child handles, <b>must</b> be externally synchronized</li>
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
     * <p>{@link #xrCreateSceneObserverMSFT CreateSceneObserverMSFT}</p>
     *
     * @param sceneObserver an {@code XrSceneObserverMSFT} previously created by {@link #xrCreateSceneObserverMSFT CreateSceneObserverMSFT}.
     */
    @NativeType("XrResult")
    public static int xrDestroySceneObserverMSFT(XrSceneObserverMSFT sceneObserver) {
        long __functionAddress = sceneObserver.getCapabilities().xrDestroySceneObserverMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(sceneObserver.address(), __functionAddress);
    }

    // --- [ xrCreateSceneMSFT ] ---

    /** Unsafe version of: {@link #xrCreateSceneMSFT CreateSceneMSFT} */
    public static int nxrCreateSceneMSFT(XrSceneObserverMSFT sceneObserver, long createInfo, long scene) {
        long __functionAddress = sceneObserver.getCapabilities().xrCreateSceneMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(sceneObserver.address(), createInfo, scene, __functionAddress);
    }

    /**
     * Create a scene handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateSceneMSFT CreateSceneMSFT} functions creates an {@code XrSceneMSFT} handle. It can only be called after {@link #xrGetSceneComputeStateMSFT GetSceneComputeStateMSFT} returns {@link #XR_SCENE_COMPUTE_STATE_COMPLETED_MSFT SCENE_COMPUTE_STATE_COMPLETED_MSFT} to indicate that the asynchronous operation has completed. The {@code XrSceneMSFT} handle manages the collection of scene components that represents the detected objects found during the query.</p>
     * 
     * <p>After an {@code XrSceneMSFT} handle is created, the handle and associated data <b>must</b> remain valid until destroyed, even after {@link #xrCreateSceneMSFT CreateSceneMSFT} is called again to create the next scene. The runtime <b>must</b> keep alive any component data and mesh buffers relating to this historical scene until its handle is destroyed.</p>
     * 
     * <pre><code>
     * XrResult xrCreateSceneMSFT(
     *     XrSceneObserverMSFT                         sceneObserver,
     *     const XrSceneCreateInfoMSFT*                createInfo,
     *     XrSceneMSFT*                                scene);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to calling {@link #xrCreateSceneMSFT CreateSceneMSFT}</li>
     * <li>{@code sceneObserver} <b>must</b> be a valid {@code XrSceneObserverMSFT} handle</li>
     * <li>If {@code createInfo} is not {@code NULL}, {@code createInfo} <b>must</b> be a pointer to a valid {@link XrSceneCreateInfoMSFT} structure</li>
     * <li>{@code scene} <b>must</b> be a pointer to an {@code XrSceneMSFT} handle</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <p>Calling {@link #xrCreateSceneMSFT CreateSceneMSFT} when {@link #xrGetSceneComputeStateMSFT GetSceneComputeStateMSFT} returns {@link #XR_SCENE_COMPUTE_STATE_NONE_MSFT SCENE_COMPUTE_STATE_NONE_MSFT} or {@link #XR_SCENE_COMPUTE_STATE_UPDATING_MSFT SCENE_COMPUTE_STATE_UPDATING_MSFT} <b>must</b> return the error {@link #XR_ERROR_COMPUTE_NEW_SCENE_NOT_COMPLETED_MSFT ERROR_COMPUTE_NEW_SCENE_NOT_COMPLETED_MSFT}.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSceneCreateInfoMSFT}, {@link #xrDestroySceneMSFT DestroySceneMSFT}</p>
     *
     * @param sceneObserver a handle to an {@code XrSceneObserverMSFT}.
     * @param createInfo    exists for extensibility purposes, it is {@code NULL} or a pointer to a valid {@link XrSceneCreateInfoMSFT} structure.
     * @param scene         the returned {@code XrSceneMSFT} handle.
     */
    @NativeType("XrResult")
    public static int xrCreateSceneMSFT(XrSceneObserverMSFT sceneObserver, @Nullable @NativeType("XrSceneCreateInfoMSFT const *") XrSceneCreateInfoMSFT createInfo, @NativeType("XrSceneMSFT *") PointerBuffer scene) {
        if (CHECKS) {
            check(scene, 1);
        }
        return nxrCreateSceneMSFT(sceneObserver, memAddressSafe(createInfo), memAddress(scene));
    }

    // --- [ xrDestroySceneMSFT ] ---

    /**
     * Destroy a scene handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroySceneMSFT DestroySceneMSFT} function releases the {@code scene} and the underlying resources.</p>
     * 
     * <pre><code>
     * XrResult xrDestroySceneMSFT(
     *     XrSceneMSFT                                 scene);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to calling {@link #xrDestroySceneMSFT DestroySceneMSFT}</li>
     * <li>{@code scene} <b>must</b> be a valid {@code XrSceneMSFT} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code scene}, and any child handles, <b>must</b> be externally synchronized</li>
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
     * <p>{@link #xrCreateSceneMSFT CreateSceneMSFT}</p>
     *
     * @param scene an {@code XrSceneMSFT} previously created by {@link #xrCreateSceneMSFT CreateSceneMSFT}.
     */
    @NativeType("XrResult")
    public static int xrDestroySceneMSFT(XrSceneMSFT scene) {
        long __functionAddress = scene.getCapabilities().xrDestroySceneMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(scene.address(), __functionAddress);
    }

    // --- [ xrComputeNewSceneMSFT ] ---

    /** Unsafe version of: {@link #xrComputeNewSceneMSFT ComputeNewSceneMSFT} */
    public static int nxrComputeNewSceneMSFT(XrSceneObserverMSFT sceneObserver, long computeInfo) {
        long __functionAddress = sceneObserver.getCapabilities().xrComputeNewSceneMSFT;
        if (CHECKS) {
            check(__functionAddress);
            XrNewSceneComputeInfoMSFT.validate(computeInfo);
        }
        return callPPI(sceneObserver.address(), computeInfo, __functionAddress);
    }

    /**
     * Compute new scene.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrComputeNewSceneMSFT ComputeNewSceneMSFT} function begins the compute of a new scene and the runtime <b>must</b> return quickly without waiting for the compute to complete. The application <b>should</b> use {@link #xrGetSceneComputeStateMSFT GetSceneComputeStateMSFT} to inspect the compute status.</p>
     * 
     * <p>The application <b>can</b> control the compute features by passing a list of {@code XrSceneComputeFeatureMSFT} via {@link XrNewSceneComputeInfoMSFT}{@code ::requestedFeatures}.</p>
     * 
     * <ul>
     * <li>If {@link #XR_SCENE_COMPUTE_FEATURE_PLANE_MSFT SCENE_COMPUTE_FEATURE_PLANE_MSFT} is passed, but {@link #XR_SCENE_COMPUTE_FEATURE_PLANE_MESH_MSFT SCENE_COMPUTE_FEATURE_PLANE_MESH_MSFT} is not passed, then:
     * 
     * <ul>
     * <li>The application <b>may</b> be able to read {@link #XR_SCENE_COMPONENT_TYPE_PLANE_MSFT SCENE_COMPONENT_TYPE_PLANE_MSFT} and {@link #XR_SCENE_COMPONENT_TYPE_OBJECT_MSFT SCENE_COMPONENT_TYPE_OBJECT_MSFT} scene components from the resulting {@code XrSceneMSFT} handle.</li>
     * <li>{@link XrScenePlaneMSFT}{@code ::meshBufferId} <b>must</b> be zero to indicate that the plane scene component does not have a mesh buffer available to read.</li>
     * </ul>
     * </li>
     * <li>If {@link #XR_SCENE_COMPUTE_FEATURE_PLANE_MSFT SCENE_COMPUTE_FEATURE_PLANE_MSFT} and {@link #XR_SCENE_COMPUTE_FEATURE_PLANE_MESH_MSFT SCENE_COMPUTE_FEATURE_PLANE_MESH_MSFT} are passed, then:
     * 
     * <ul>
     * <li>the application <b>may</b> be able to read {@link #XR_SCENE_COMPONENT_TYPE_PLANE_MSFT SCENE_COMPONENT_TYPE_PLANE_MSFT} and {@link #XR_SCENE_COMPONENT_TYPE_OBJECT_MSFT SCENE_COMPONENT_TYPE_OBJECT_MSFT} scene components from the resulting {@code XrSceneMSFT} handle</li>
     * <li>{@link XrScenePlaneMSFT}{@code ::meshBufferId} <b>may</b> contain a non-zero mesh buffer identifier to indicate that the plane scene component has a mesh buffer available to read.</li>
     * </ul>
     * </li>
     * <li>If {@link #XR_SCENE_COMPUTE_FEATURE_VISUAL_MESH_MSFT SCENE_COMPUTE_FEATURE_VISUAL_MESH_MSFT} is passed then:
     * 
     * <ul>
     * <li>the application <b>may</b> be able to read {@link #XR_SCENE_COMPONENT_TYPE_VISUAL_MESH_MSFT SCENE_COMPONENT_TYPE_VISUAL_MESH_MSFT} and {@link #XR_SCENE_COMPONENT_TYPE_OBJECT_MSFT SCENE_COMPONENT_TYPE_OBJECT_MSFT} scene components from the resulting {@code XrSceneMSFT} handle.</li>
     * </ul>
     * </li>
     * <li>If {@link #XR_SCENE_COMPUTE_FEATURE_COLLIDER_MESH_MSFT SCENE_COMPUTE_FEATURE_COLLIDER_MESH_MSFT} is passed then:
     * 
     * <ul>
     * <li>the application <b>may</b> be able to read {@link #XR_SCENE_COMPONENT_TYPE_COLLIDER_MESH_MSFT SCENE_COMPONENT_TYPE_COLLIDER_MESH_MSFT} and {@link #XR_SCENE_COMPONENT_TYPE_OBJECT_MSFT SCENE_COMPONENT_TYPE_OBJECT_MSFT} scene components from the resulting {@code XrSceneMSFT} handle.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <pre><code>
     * XrResult xrComputeNewSceneMSFT(
     *     XrSceneObserverMSFT                         sceneObserver,
     *     const XrNewSceneComputeInfoMSFT*            computeInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The runtime <b>must</b> return {@link #XR_ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT} if incompatible features were passed or no compatible features were passed.</p>
     * 
     * <p>The runtime <b>must</b> return {@link #XR_ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT} if {@link #XR_SCENE_COMPUTE_FEATURE_PLANE_MESH_MSFT SCENE_COMPUTE_FEATURE_PLANE_MESH_MSFT} was passed but {@link #XR_SCENE_COMPUTE_FEATURE_PLANE_MSFT SCENE_COMPUTE_FEATURE_PLANE_MSFT} was not passed.</p>
     * 
     * <p>The runtime <b>must</b> return {@link #XR_ERROR_COMPUTE_NEW_SCENE_NOT_COMPLETED_MSFT ERROR_COMPUTE_NEW_SCENE_NOT_COMPLETED_MSFT} if {@link #xrComputeNewSceneMSFT ComputeNewSceneMSFT} is called while the scene computation is in progress.</p>
     * 
     * <p>An application that wishes to use {@link #XR_SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT} <b>must</b> create an {@code XrSceneObserverMSFT} handle that passes neither {@link #XR_SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_COMPLETE_MSFT SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_COMPLETE_MSFT} nor {@link #XR_SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_INCOMPLETE_FAST_MSFT SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_INCOMPLETE_FAST_MSFT} to {@link #xrComputeNewSceneMSFT ComputeNewSceneMSFT} for the lifetime of that {@code XrSceneObserverMSFT} handle. This allows the runtime to return occlusion mesh at a different cadence than non-occlusion mesh or planes.</p>
     * 
     * <ul>
     * <li>The runtime <b>must</b> return {@link #XR_ERROR_SCENE_COMPUTE_CONSISTENCY_MISMATCH_MSFT ERROR_SCENE_COMPUTE_CONSISTENCY_MISMATCH_MSFT} if:
     * 
     * <ul>
     * <li>{@link #XR_SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT} is passed to {@link #xrComputeNewSceneMSFT ComputeNewSceneMSFT} <b>and</b></li>
     * <li>a previous call to {@link #xrComputeNewSceneMSFT ComputeNewSceneMSFT} did not pass {@link #XR_SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT} for the same {@code XrSceneObserverMSFT} handle.</li>
     * </ul>
     * </li>
     * <li>The runtime <b>must</b> return {@link #XR_ERROR_SCENE_COMPUTE_CONSISTENCY_MISMATCH_MSFT ERROR_SCENE_COMPUTE_CONSISTENCY_MISMATCH_MSFT} if:
     * 
     * <ul>
     * <li>{@link #XR_SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT} is not passed to {@link #xrComputeNewSceneMSFT ComputeNewSceneMSFT} <b>and</b></li>
     * <li>a previous call to {@link #xrComputeNewSceneMSFT ComputeNewSceneMSFT} did pass {@link #XR_SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT} for the same {@code XrSceneObserverMSFT} handle.</li>
     * </ul>
     * </li>
     * <li>The runtime <b>must</b> return {@link #XR_ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT} if:
     * 
     * <ul>
     * <li>{@link #XR_SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT} is passed to {@link #xrComputeNewSceneMSFT ComputeNewSceneMSFT} <b>and</b></li>
     * <li>neither {@link #XR_SCENE_COMPUTE_FEATURE_VISUAL_MESH_MSFT SCENE_COMPUTE_FEATURE_VISUAL_MESH_MSFT} nor {@link #XR_SCENE_COMPUTE_FEATURE_COLLIDER_MESH_MSFT SCENE_COMPUTE_FEATURE_COLLIDER_MESH_MSFT} are also passed.</li>
     * </ul>
     * </li>
     * <li>The runtime <b>must</b> return {@link #XR_ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT} if:
     * 
     * <ul>
     * <li>{@link #XR_SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT} is passed to {@link #xrComputeNewSceneMSFT ComputeNewSceneMSFT} <b>and</b></li>
     * <li>at least one of {@link MSFTSceneUnderstandingSerialization#XR_SCENE_COMPUTE_FEATURE_SERIALIZE_SCENE_MSFT SCENE_COMPUTE_FEATURE_SERIALIZE_SCENE_MSFT}, {@link #XR_SCENE_COMPUTE_FEATURE_PLANE_MSFT SCENE_COMPUTE_FEATURE_PLANE_MSFT}, {@link #XR_SCENE_COMPUTE_FEATURE_PLANE_MESH_MSFT SCENE_COMPUTE_FEATURE_PLANE_MESH_MSFT}, or {@link MSFTSceneUnderstandingSerialization#XR_SCENE_COMPUTE_FEATURE_SERIALIZE_SCENE_MSFT SCENE_COMPUTE_FEATURE_SERIALIZE_SCENE_MSFT} are also passed.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to calling {@link #xrComputeNewSceneMSFT ComputeNewSceneMSFT}</li>
     * <li>{@code sceneObserver} <b>must</b> be a valid {@code XrSceneObserverMSFT} handle</li>
     * <li>{@code computeInfo} <b>must</b> be a pointer to a valid {@link XrNewSceneComputeInfoMSFT} structure</li>
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
     * <li>{@link XR10#XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_POSE_INVALID ERROR_POSE_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrNewSceneComputeInfoMSFT}, {@link #xrEnumerateSceneComputeFeaturesMSFT EnumerateSceneComputeFeaturesMSFT}</p>
     *
     * @param sceneObserver a handle to an {@code XrSceneObserverMSFT}.
     * @param computeInfo   a pointer to an {@link XrNewSceneComputeInfoMSFT} structure.
     */
    @NativeType("XrResult")
    public static int xrComputeNewSceneMSFT(XrSceneObserverMSFT sceneObserver, @NativeType("XrNewSceneComputeInfoMSFT const *") XrNewSceneComputeInfoMSFT computeInfo) {
        return nxrComputeNewSceneMSFT(sceneObserver, computeInfo.address());
    }

    // --- [ xrGetSceneComputeStateMSFT ] ---

    /** Unsafe version of: {@link #xrGetSceneComputeStateMSFT GetSceneComputeStateMSFT} */
    public static int nxrGetSceneComputeStateMSFT(XrSceneObserverMSFT sceneObserver, long state) {
        long __functionAddress = sceneObserver.getCapabilities().xrGetSceneComputeStateMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(sceneObserver.address(), state, __functionAddress);
    }

    /**
     * Get the scene compute state.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>An application <b>can</b> inspect the completion of the compute by polling {@link #xrGetSceneComputeStateMSFT GetSceneComputeStateMSFT}. This function <b>should</b> typically be called once per frame per {@code XrSceneObserverMSFT}.</p>
     * 
     * <pre><code>
     * XrResult xrGetSceneComputeStateMSFT(
     *     XrSceneObserverMSFT                         sceneObserver,
     *     XrSceneComputeStateMSFT*                    state);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to calling {@link #xrGetSceneComputeStateMSFT GetSceneComputeStateMSFT}</li>
     * <li>{@code sceneObserver} <b>must</b> be a valid {@code XrSceneObserverMSFT} handle</li>
     * <li>{@code state} <b>must</b> be a pointer to an {@code XrSceneComputeStateMSFT} value</li>
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
     * @param sceneObserver a handle to an {@code XrSceneObserverMSFT}.
     * @param state         the returned {@code XrSceneComputeStateMSFT} value.
     */
    @NativeType("XrResult")
    public static int xrGetSceneComputeStateMSFT(XrSceneObserverMSFT sceneObserver, @NativeType("XrSceneComputeStateMSFT *") IntBuffer state) {
        if (CHECKS) {
            check(state, 1);
        }
        return nxrGetSceneComputeStateMSFT(sceneObserver, memAddress(state));
    }

    // --- [ xrGetSceneComponentsMSFT ] ---

    /** Unsafe version of: {@link #xrGetSceneComponentsMSFT GetSceneComponentsMSFT} */
    public static int nxrGetSceneComponentsMSFT(XrSceneMSFT scene, long getInfo, long components) {
        long __functionAddress = scene.getCapabilities().xrGetSceneComponentsMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(scene.address(), getInfo, components, __functionAddress);
    }

    /**
     * Get scene components from a scene.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Scene components are read from an {@code XrSceneMSFT} using {@link #xrGetSceneComponentsMSFT GetSceneComponentsMSFT} and passing one {@code XrSceneComponentTypeMSFT}. This function follows the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#buffer-size-parameters">two-call idiom</a> for filling multiple buffers in a struct. Different scene component types <b>may</b> have additional properties that <b>can</b> be read by chaining additional structures to {@link XrSceneComponentsMSFT}. Those additional structures <b>must</b> have an array size that is at least as large as {@link XrSceneComponentsMSFT}::componentCapacityInput, otherwise the runtime <b>must</b> return {@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}.</p>
     * 
     * <ul>
     * <li>If {@link #XR_SCENE_COMPONENT_TYPE_OBJECT_MSFT SCENE_COMPONENT_TYPE_OBJECT_MSFT} is passed to {@link #xrGetSceneComponentsMSFT GetSceneComponentsMSFT}, then {@link XrSceneObjectsMSFT} may be included in the {@link XrSceneComponentsMSFT}{@code ::next} chain.</li>
     * <li>If {@link #XR_SCENE_COMPONENT_TYPE_PLANE_MSFT SCENE_COMPONENT_TYPE_PLANE_MSFT} is passed to {@link #xrGetSceneComponentsMSFT GetSceneComponentsMSFT}, then {@link XrScenePlanesMSFT} may be included in the {@link XrSceneComponentsMSFT}{@code ::next} chain.</li>
     * <li>If {@link #XR_SCENE_COMPONENT_TYPE_VISUAL_MESH_MSFT SCENE_COMPONENT_TYPE_VISUAL_MESH_MSFT} or {@link #XR_SCENE_COMPONENT_TYPE_COLLIDER_MESH_MSFT SCENE_COMPONENT_TYPE_COLLIDER_MESH_MSFT} are passed to {@link #xrGetSceneComponentsMSFT GetSceneComponentsMSFT}, then {@link XrSceneMeshesMSFT} may be included in the {@link XrSceneComponentsMSFT}{@code ::next} chain.</li>
     * </ul>
     * 
     * <pre><code>
     * XrResult xrGetSceneComponentsMSFT(
     *     XrSceneMSFT                                 scene,
     *     const XrSceneComponentsGetInfoMSFT*         getInfo,
     *     XrSceneComponentsMSFT*                      components);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to calling {@link #xrGetSceneComponentsMSFT GetSceneComponentsMSFT}</li>
     * <li>{@code scene} <b>must</b> be a valid {@code XrSceneMSFT} handle</li>
     * <li>{@code getInfo} <b>must</b> be a pointer to a valid {@link XrSceneComponentsGetInfoMSFT} structure</li>
     * <li>{@code components} <b>must</b> be a pointer to an {@link XrSceneComponentsMSFT} structure</li>
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
     * <li>{@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSceneComponentsGetInfoMSFT}, {@link XrSceneComponentsMSFT}</p>
     *
     * @param scene      an {@code XrSceneMSFT} previously created by {@link #xrCreateSceneMSFT CreateSceneMSFT}.
     * @param getInfo    a pointer to an {@link XrSceneComponentsGetInfoMSFT} structure.
     * @param components the {@link XrSceneComponentsMSFT} output structure.
     */
    @NativeType("XrResult")
    public static int xrGetSceneComponentsMSFT(XrSceneMSFT scene, @NativeType("XrSceneComponentsGetInfoMSFT const *") XrSceneComponentsGetInfoMSFT getInfo, @NativeType("XrSceneComponentsMSFT *") XrSceneComponentsMSFT components) {
        return nxrGetSceneComponentsMSFT(scene, getInfo.address(), components.address());
    }

    // --- [ xrLocateSceneComponentsMSFT ] ---

    /** Unsafe version of: {@link #xrLocateSceneComponentsMSFT LocateSceneComponentsMSFT} */
    public static int nxrLocateSceneComponentsMSFT(XrSceneMSFT scene, long locateInfo, long locations) {
        long __functionAddress = scene.getCapabilities().xrLocateSceneComponentsMSFT;
        if (CHECKS) {
            check(__functionAddress);
            XrSceneComponentsLocateInfoMSFT.validate(locateInfo);
        }
        return callPPPI(scene.address(), locateInfo, locations, __functionAddress);
    }

    /**
     * Locate scene components.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrLocateSceneComponentsMSFT LocateSceneComponentsMSFT} function locates an array of scene components to a base space at a given time.</p>
     * 
     * <pre><code>
     * XrResult xrLocateSceneComponentsMSFT(
     *     XrSceneMSFT                                 scene,
     *     const XrSceneComponentsLocateInfoMSFT*      locateInfo,
     *     XrSceneComponentLocationsMSFT*              locations);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The runtime <b>must</b> return {@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT} if {@link XrSceneComponentLocationsMSFT}{@code ::locationCount} is less than {@link XrSceneComponentsLocateInfoMSFT}{@code ::componentIdCount}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Similar to {@link XR10#xrLocateSpace LocateSpace}, apps should call {@link #xrLocateSceneComponentsMSFT LocateSceneComponentsMSFT} each frame because the location returned by {@link #xrLocateSceneComponentsMSFT LocateSceneComponentsMSFT} in later frames may change over time as the target space or the scene components may refine their locations.</p>
     * </div>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to calling {@link #xrLocateSceneComponentsMSFT LocateSceneComponentsMSFT}</li>
     * <li>{@code scene} <b>must</b> be a valid {@code XrSceneMSFT} handle</li>
     * <li>{@code locateInfo} <b>must</b> be a pointer to a valid {@link XrSceneComponentsLocateInfoMSFT} structure</li>
     * <li>{@code locations} <b>must</b> be a pointer to an {@link XrSceneComponentLocationsMSFT} structure</li>
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
     * <li>{@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * <li>{@link XR10#XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSceneComponentLocationsMSFT}, {@link XrSceneComponentsLocateInfoMSFT}</p>
     *
     * @param scene      a handle to an {@code XrSceneMSFT}.
     * @param locateInfo a pointer to {@link XrSceneComponentsLocateInfoMSFT} describing information to locate scene components.
     * @param locations  a pointer to {@link XrSceneComponentLocationsMSFT} receiving the returned scene component locations.
     */
    @NativeType("XrResult")
    public static int xrLocateSceneComponentsMSFT(XrSceneMSFT scene, @NativeType("XrSceneComponentsLocateInfoMSFT const *") XrSceneComponentsLocateInfoMSFT locateInfo, @NativeType("XrSceneComponentLocationsMSFT *") XrSceneComponentLocationsMSFT locations) {
        return nxrLocateSceneComponentsMSFT(scene, locateInfo.address(), locations.address());
    }

    // --- [ xrGetSceneMeshBuffersMSFT ] ---

    /** Unsafe version of: {@link #xrGetSceneMeshBuffersMSFT GetSceneMeshBuffersMSFT} */
    public static int nxrGetSceneMeshBuffersMSFT(XrSceneMSFT scene, long getInfo, long buffers) {
        long __functionAddress = scene.getCapabilities().xrGetSceneMeshBuffersMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(scene.address(), getInfo, buffers, __functionAddress);
    }

    /**
     * Get scene mesh buffers.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetSceneMeshBuffersMSFT GetSceneMeshBuffersMSFT} function retrieves the scene mesh vertex buffer and index buffer for the given scene mesh buffer identifier.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Applications may use the scene mesh buffer identifier as a key to cache the vertices and indices of a mesh for reuse within an {@code XrSceneMSFT} or across multiple {@code XrSceneMSFT} for the same {@code XrSession}.</p>
     * 
     * <p>Applications can avoid unnecessarily calling {@link #xrGetSceneMeshBuffersMSFT GetSceneMeshBuffersMSFT} for a scene component if {@link XrSceneComponentMSFT}{@code ::updateTime} is equal to the {@link XrSceneComponentMSFT}{@code ::updateTime} value in the previous {@code XrSceneMSFT}. A scene component is uniquely identified by {@link XrUuidMSFT}.</p>
     * </div>
     * 
     * <p>This function follows the two-call idiom for filling multiple buffers in a struct.</p>
     * 
     * <p>The {@link #xrGetSceneMeshBuffersMSFT GetSceneMeshBuffersMSFT} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetSceneMeshBuffersMSFT(
     *     XrSceneMSFT                                 scene,
     *     const XrSceneMeshBuffersGetInfoMSFT*        getInfo,
     *     XrSceneMeshBuffersMSFT*                     buffers);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Applications <b>can</b> request the vertex buffer of the mesh by including {@link XrSceneMeshVertexBufferMSFT} in the {@link XrSceneMeshBuffersMSFT}{@code ::next} chain. Runtimes <b>must</b> support requesting a 32-bit index buffer and <b>may</b> support requesting a 16-bit index buffer. Applications <b>can</b> request a 32-bit index buffer by including {@link XrSceneMeshIndicesUint32MSFT} in the {@link XrSceneMeshBuffersMSFT}{@code ::next} chain. Applications <b>can</b> request a 16-bit index buffer by including {@link XrSceneMeshIndicesUint16MSFT} in the {@link XrSceneMeshBuffersMSFT}{@code ::next} chain. If the runtime for the given scene mesh buffer does not support requesting a 16-bit index buffer then {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} <b>must</b> be returned. The runtime <b>must</b> support reading a 16-bit index buffer for the given scene mesh buffer if {@link XrScenePlaneMSFT}:supportsIndicesUint16 or {@link XrSceneMeshMSFT}:supportsIndicesUint16 are {@link XR10#XR_TRUE TRUE} for the scene component that contained that scene mesh buffer identifier.</p>
     * 
     * <p>The runtime <b>must</b> return {@link #XR_ERROR_SCENE_MESH_BUFFER_ID_INVALID_MSFT ERROR_SCENE_MESH_BUFFER_ID_INVALID_MSFT} if none of the scene components in the given {@code XrSceneMSFT} contain {@link XrSceneMeshBuffersGetInfoMSFT}{@code ::meshBufferId}. The runtime <b>must</b> return {@link #XR_ERROR_SCENE_MESH_BUFFER_ID_INVALID_MSFT ERROR_SCENE_MESH_BUFFER_ID_INVALID_MSFT} if {@link XrSceneMeshBuffersGetInfoMSFT}{@code ::meshBufferId} is zero. The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if both {@link XrSceneMeshIndicesUint32MSFT} and {@link XrSceneMeshIndicesUint16MSFT} are included in the {@link XrSceneMeshBuffersMSFT}{@code ::next} chain. The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if the {@link XrSceneMeshBuffersMSFT}{@code ::next} does not contain at least one of {@link XrSceneMeshVertexBufferMSFT}, {@link XrSceneMeshIndicesUint32MSFT} or {@link XrSceneMeshIndicesUint16MSFT}.</p>
     * 
     * <p>The runtime <b>must</b> return the same vertices and indices for a given scene mesh buffer identifier and {@code XrSession}. A runtime <b>may</b> return zero vertices and indices if the underlying mesh data is no longer available.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to calling {@link #xrGetSceneMeshBuffersMSFT GetSceneMeshBuffersMSFT}</li>
     * <li>{@code scene} <b>must</b> be a valid {@code XrSceneMSFT} handle</li>
     * <li>{@code getInfo} <b>must</b> be a pointer to a valid {@link XrSceneMeshBuffersGetInfoMSFT} structure</li>
     * <li>{@code buffers} <b>must</b> be a pointer to an {@link XrSceneMeshBuffersMSFT} structure</li>
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
     * <li>{@link #XR_ERROR_SCENE_COMPONENT_ID_INVALID_MSFT ERROR_SCENE_COMPONENT_ID_INVALID_MSFT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSceneMeshBuffersGetInfoMSFT}, {@link XrSceneMeshBuffersMSFT}</p>
     *
     * @param scene   an {@code XrSceneMSFT} previously created by {@link #xrCreateSceneMSFT CreateSceneMSFT}.
     * @param getInfo a pointer to an {@link XrSceneMeshBuffersGetInfoMSFT} structure.
     * @param buffers a pointer to an {@link XrSceneMeshBuffersMSFT} structure for reading a scene mesh buffer.
     */
    @NativeType("XrResult")
    public static int xrGetSceneMeshBuffersMSFT(XrSceneMSFT scene, @NativeType("XrSceneMeshBuffersGetInfoMSFT const *") XrSceneMeshBuffersGetInfoMSFT getInfo, @NativeType("XrSceneMeshBuffersMSFT *") XrSceneMeshBuffersMSFT buffers) {
        return nxrGetSceneMeshBuffersMSFT(scene, getInfo.address(), buffers.address());
    }

}