/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_scene_understanding = "MSFTSceneUnderstanding".nativeClassXR("MSFT_scene_understanding", type = "instance", postfix = "MSFT") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "MSFT_scene_understanding_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "MSFT_SCENE_UNDERSTANDING_EXTENSION_NAME".."XR_MSFT_scene_understanding"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_SCENE_OBSERVER_MSFT".."1000097000",
        "OBJECT_TYPE_SCENE_MSFT".."1000097001"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SCENE_OBSERVER_CREATE_INFO_MSFT".."1000097000",
        "TYPE_SCENE_CREATE_INFO_MSFT".."1000097001",
        "TYPE_NEW_SCENE_COMPUTE_INFO_MSFT".."1000097002",
        "TYPE_VISUAL_MESH_COMPUTE_LOD_INFO_MSFT".."1000097003",
        "TYPE_SCENE_COMPONENTS_MSFT".."1000097004",
        "TYPE_SCENE_COMPONENTS_GET_INFO_MSFT".."1000097005",
        "TYPE_SCENE_COMPONENT_LOCATIONS_MSFT".."1000097006",
        "TYPE_SCENE_COMPONENTS_LOCATE_INFO_MSFT".."1000097007",
        "TYPE_SCENE_OBJECTS_MSFT".."1000097008",
        "TYPE_SCENE_COMPONENT_PARENT_FILTER_INFO_MSFT".."1000097009",
        "TYPE_SCENE_OBJECT_TYPES_FILTER_INFO_MSFT".."1000097010",
        "TYPE_SCENE_PLANES_MSFT".."1000097011",
        "TYPE_SCENE_PLANE_ALIGNMENT_FILTER_INFO_MSFT".."1000097012",
        "TYPE_SCENE_MESHES_MSFT".."1000097013",
        "TYPE_SCENE_MESH_BUFFERS_GET_INFO_MSFT".."1000097014",
        "TYPE_SCENE_MESH_BUFFERS_MSFT".."1000097015",
        "TYPE_SCENE_MESH_VERTEX_BUFFER_MSFT".."1000097016",
        "TYPE_SCENE_MESH_INDICES_UINT32_MSFT".."1000097017",
        "TYPE_SCENE_MESH_INDICES_UINT16_MSFT".."1000097018"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_COMPUTE_NEW_SCENE_NOT_COMPLETED_MSFT".."-1000097000",
        "ERROR_SCENE_COMPONENT_ID_INVALID_MSFT".."-1000097001",
        "ERROR_SCENE_COMPONENT_TYPE_MISMATCH_MSFT".."-1000097002",
        "ERROR_SCENE_MESH_BUFFER_ID_INVALID_MSFT".."-1000097003",
        "ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT".."-1000097004",
        "ERROR_SCENE_COMPUTE_CONSISTENCY_MISMATCH_MSFT".."-1000097005"
    )

    EnumConstant(
        """
        XrSceneComputeFeatureMSFT - Scene compute feature

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#SCENE_COMPUTE_FEATURE_PLANE_MSFT specifies that plane data for objects should be included in the resulting scene.</li>
            <li>#SCENE_COMPUTE_FEATURE_PLANE_MESH_MSFT specifies that planar meshes for objects should be included in the resulting scene.</li>
            <li>#SCENE_COMPUTE_FEATURE_VISUAL_MESH_MSFT specifies that 3D visualization meshes for objects should be included in the resulting scene.</li>
            <li>#SCENE_COMPUTE_FEATURE_COLLIDER_MESH_MSFT specifies that 3D collider meshes for objects should be included in the resulting scene.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications wanting to use the scene for analysis, or in a physics simulation should set {@code consistency} to #SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_COMPLETE_MSFT in order to avoid physics objects falling through the gaps and escaping the scene.

        Setting {@code consistency} to #SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_INCOMPLETE_FAST_MSFT might speed up the compute but it will result in gaps in the scene.

        Setting {@code consistency} to #SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT should be done when the resulting mesh will only be used to occlude virtual objects that are behind real-world surfaces. This mode will be most efficient and have the lowest-latency, but will return meshes less suitable for analysis or visualization.
        </div>

        <h5>See Also</h5>
        ##XrNewSceneComputeInfoMSFT, #ComputeNewSceneMSFT(), #EnumerateSceneComputeFeaturesMSFT()
        """,

        "SCENE_COMPUTE_FEATURE_PLANE_MSFT".."1",
        "SCENE_COMPUTE_FEATURE_PLANE_MESH_MSFT".."2",
        "SCENE_COMPUTE_FEATURE_VISUAL_MESH_MSFT".."3",
        "SCENE_COMPUTE_FEATURE_COLLIDER_MESH_MSFT".."4"
    )

    EnumConstant(
        """
        XrSceneComputeConsistencyMSFT - Scene compute consistency

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_COMPLETE_MSFT. The runtime <b>must</b> return a scene that is a consistent and complete snapshot of the environment, inferring the size and shape of objects as needed where the objects were not directly observed, in order to generate a watertight representation of the scene.</li>
            <li>#SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_INCOMPLETE_FAST_MSFT. The runtime <b>must</b> return a consistent snapshot of the scene with meshes that do not overlap adjacent meshes at their edges, but <b>may</b> skip returning objects with {@code XrSceneObjectTypeMSFT} of #SCENE_OBJECT_TYPE_INFERRED_MSFT in order to return the scene faster.</li>
            <li>#SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT. The runtime <b>may</b> react to this value by computing scenes more quickly and reusing existing mesh buffer IDs more often to minimize app overhead, with potential tradeoffs such as returning meshes that are not watertight, meshes that overlap adjacent meshes at their edges to allow partial updates in the future, or other reductions in mesh quality that are less observable when mesh is used for occlusion only.</li>
        </ul>

        <h5>See Also</h5>
        ##XrNewSceneComputeInfoMSFT, #ComputeNewSceneMSFT()
        """,

        "SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_COMPLETE_MSFT".."1",
        "SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_INCOMPLETE_FAST_MSFT".."2",
        "SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT".."3"
    )

    EnumConstant(
        """
        XrMeshComputeLodMSFT - Mesh compute level of detail enumeration

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#MESH_COMPUTE_LOD_COARSE_MSFT. Coarse mesh compute level of detail will generate roughly 100 triangles per cubic meter.</li>
            <li>#MESH_COMPUTE_LOD_MEDIUM_MSFT. Medium mesh compute level of detail will generate roughly 400 triangles per cubic meter.</li>
            <li>#MESH_COMPUTE_LOD_FINE_MSFT. Fine mesh compute level of detail will generate roughly 2000 triangles per cubic meter.</li>
            <li>#MESH_COMPUTE_LOD_UNLIMITED_MSFT. Unlimited mesh compute level of detail. There is no guarantee as to the number of triangles returned.</li>
        </ul>

        <h5>See Also</h5>
        ##XrVisualMeshComputeLodInfoMSFT
        """,

        "MESH_COMPUTE_LOD_COARSE_MSFT".."1",
        "MESH_COMPUTE_LOD_MEDIUM_MSFT".."2",
        "MESH_COMPUTE_LOD_FINE_MSFT".."3",
        "MESH_COMPUTE_LOD_UNLIMITED_MSFT".."4"
    )

    EnumConstant(
        """
        XrSceneComponentTypeMSFT - Scene component type

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#SCENE_COMPONENT_TYPE_INVALID_MSFT indicates an invalid scene component type.</li>
            <li>#SCENE_COMPONENT_TYPE_OBJECT_MSFT indicates a discrete object detected in the world, such as a wall, floor, ceiling or table. Scene objects then provide their geometric representations such as planes and meshes as child scene components with the types below.</li>
            <li>#SCENE_COMPONENT_TYPE_PLANE_MSFT indicates a flat 2D representation of a surface in the world, such as a wall, floor, ceiling or table.</li>
            <li>#SCENE_COMPONENT_TYPE_VISUAL_MESH_MSFT indicates a visual mesh representation of an object in the world, optimized for visual quality when directly rendering a wireframe or other mesh visualization to the user. Visual mesh can also be used for rendering the silhouettes of objects. Applications can request varying levels of detail for visual meshes when calling #ComputeNewSceneMSFT() using ##XrVisualMeshComputeLodInfoMSFT.</li>
            <li>#SCENE_COMPONENT_TYPE_COLLIDER_MESH_MSFT indicates a collider mesh representation of an object in the world, optimized to maintain the silhouette of an object while reducing detail on mostly-flat surfaces. Collider mesh is useful when calculating physics collisions or when rendering silhouettes of objects for occlusion.</li>
        </ul>

        <h5>See Also</h5>
        ##XrSceneComponentMSFT, ##XrSceneComponentsGetInfoMSFT
        """,

        "SCENE_COMPONENT_TYPE_INVALID_MSFT".."-1",
        "SCENE_COMPONENT_TYPE_OBJECT_MSFT".."1",
        "SCENE_COMPONENT_TYPE_PLANE_MSFT".."2",
        "SCENE_COMPONENT_TYPE_VISUAL_MESH_MSFT".."3",
        "SCENE_COMPONENT_TYPE_COLLIDER_MESH_MSFT".."4"
    )

    EnumConstant(
        """
        XrSceneObjectTypeMSFT - Scene object type

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#SCENE_OBJECT_TYPE_UNCATEGORIZED_MSFT. This scene object has yet to be classified and assigned a type. This should not be confused with background, as this object could be anything; the system has just not come up with a strong enough classification for it yet.</li>
            <li>#SCENE_OBJECT_TYPE_BACKGROUND_MSFT. The scene object is known to be not one of the other recognized types of scene object. This class should not be confused with uncategorized where background is known not to be wall/floor/ceiling etc. while uncategorized is not yet categorized.</li>
            <li>#SCENE_OBJECT_TYPE_WALL_MSFT. A physical wall. Walls are assumed to be immovable environmental structures.</li>
            <li>#SCENE_OBJECT_TYPE_FLOOR_MSFT. Floors are any surfaces on which one can walk. Note: stairs are not floors. Also note, that floors assume any walkable surface and therefore there is no explicit assumption of a singular floor. Multi-level structures, ramps, etc. should all classify as floor.</li>
            <li>#SCENE_OBJECT_TYPE_CEILING_MSFT. The upper surface of a room.</li>
            <li>#SCENE_OBJECT_TYPE_PLATFORM_MSFT. A large flat surface on which you could place holograms. These tend to represent tables, countertops, and other large horizontal surfaces.</li>
            <li>#SCENE_OBJECT_TYPE_INFERRED_MSFT. An imaginary object that was added to the scene in order to make the scene watertight and avoid gaps.</li>
        </ul>

        <h5>See Also</h5>
        ##XrNewSceneComputeInfoMSFT, ##XrSceneObjectMSFT, ##XrSceneObjectTypesFilterInfoMSFT
        """,

        "SCENE_OBJECT_TYPE_UNCATEGORIZED_MSFT".."-1",
        "SCENE_OBJECT_TYPE_BACKGROUND_MSFT".."1",
        "SCENE_OBJECT_TYPE_WALL_MSFT".."2",
        "SCENE_OBJECT_TYPE_FLOOR_MSFT".."3",
        "SCENE_OBJECT_TYPE_CEILING_MSFT".."4",
        "SCENE_OBJECT_TYPE_PLATFORM_MSFT".."5",
        "SCENE_OBJECT_TYPE_INFERRED_MSFT".."6"
    )

    EnumConstant(
        """
        XrScenePlaneAlignmentTypeMSFT - Scene plane alignment type

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#SCENE_PLANE_ALIGNMENT_TYPE_NON_ORTHOGONAL_MSFT means the plane’s normal is not orthogonal or parallel to the gravity direction.</li>
            <li>#SCENE_PLANE_ALIGNMENT_TYPE_HORIZONTAL_MSFT means the plane’s normal is roughly parallel to the gravity direction.</li>
            <li>#SCENE_PLANE_ALIGNMENT_TYPE_VERTICAL_MSFT means the plane’s normal is roughly orthogonal to the gravity direction.</li>
        </ul>

        <h5>See Also</h5>
        ##XrScenePlaneAlignmentFilterInfoMSFT, ##XrScenePlaneMSFT
        """,

        "SCENE_PLANE_ALIGNMENT_TYPE_NON_ORTHOGONAL_MSFT".."0",
        "SCENE_PLANE_ALIGNMENT_TYPE_HORIZONTAL_MSFT".."1",
        "SCENE_PLANE_ALIGNMENT_TYPE_VERTICAL_MSFT".."2"
    )

    EnumConstant(
        """
        XrSceneComputeStateMSFT - Scene compute state type

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#SCENE_COMPUTE_STATE_NONE_MSFT indicates that no scene is available, and that a scene is not being computed. The application <b>may</b> call #ComputeNewSceneMSFT() to start computing a scene.</li>
            <li>#SCENE_COMPUTE_STATE_UPDATING_MSFT indicates that a new scene is being computed. Calling #CreateSceneMSFT() or #ComputeNewSceneMSFT() <b>must</b> return the error #ERROR_COMPUTE_NEW_SCENE_NOT_COMPLETED_MSFT.</li>
            <li>#SCENE_COMPUTE_STATE_COMPLETED_MSFT indicates that a new scene has completed computing. The application <b>may</b> call #CreateSceneMSFT() to get the results of the query or the application <b>may</b> call #ComputeNewSceneMSFT() to start computing a new scene.</li>
            <li>#SCENE_COMPUTE_STATE_COMPLETED_WITH_ERROR_MSFT indicates that the new scene computation completed with an error. Calling #CreateSceneMSFT() <b>must</b> return a valid {@code XrSceneMSFT} handle but calling #GetSceneComponentsMSFT() with that handle <b>must</b> return zero scene components. The runtime <b>must</b> allow the application to call #ComputeNewSceneMSFT() to try computing a scene again, even if the last call to #ComputeNewSceneMSFT() resulted in #SCENE_COMPUTE_STATE_COMPLETED_WITH_ERROR_MSFT.</li>
        </ul>

        <h5>See Also</h5>
        #GetSceneComputeStateMSFT()
        """,

        "SCENE_COMPUTE_STATE_NONE_MSFT".."0",
        "SCENE_COMPUTE_STATE_UPDATING_MSFT".."1",
        "SCENE_COMPUTE_STATE_COMPLETED_MSFT".."2",
        "SCENE_COMPUTE_STATE_COMPLETED_WITH_ERROR_MSFT".."3"
    )

    XrResult(
        "EnumerateSceneComputeFeaturesMSFT",
        """
        Enumerates scene compute features.

        <h5>C Specification</h5>
        The #EnumerateSceneComputeFeaturesMSFT() function enumerates the supported scene compute features of the given system.

        This function follows the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#buffer-size-parameters">two-call idiom</a> for filling the {@code features} array.

        <pre><code>
￿XrResult xrEnumerateSceneComputeFeaturesMSFT(
￿    XrInstance                                  instance,
￿    XrSystemId                                  systemId,
￿    uint32_t                                    featureCapacityInput,
￿    uint32_t*                                   featureCountOutput,
￿    XrSceneComputeFeatureMSFT*                  features);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to calling #EnumerateSceneComputeFeaturesMSFT()</li>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code featureCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code featureCapacityInput} is not 0, {@code features} <b>must</b> be a pointer to an array of {@code featureCapacityInput} {@code XrSceneComputeFeatureMSFT} values</li>
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
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_SIZE_INSUFFICIENT</li>
                <li>#ERROR_SYSTEM_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #ComputeNewSceneMSFT()
        """,

        XrInstance("instance", "a handle to an {@code XrInstance}."),
        XrSystemId("systemId", "the {@code XrSystemId} whose scene compute features will be enumerated."),
        AutoSize("features")..uint32_t("featureCapacityInput", "the capacity of the array, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("featureCountOutput", "a pointer to the count of scene compute features, or a pointer to the required capacity in the case that {@code featureCapacityInput} is 0."),
        nullable..XrSceneComputeFeatureMSFT.p("features", "an array of {@code XrSceneComputeFeatureMSFT}.")
    )

    XrResult(
        "CreateSceneObserverMSFT",
        """
        Create a scene observer handle.

        <h5>C Specification</h5>
        An {@code XrSceneObserverMSFT} handle is created using #CreateSceneObserverMSFT().

        <pre><code>
￿XrResult xrCreateSceneObserverMSFT(
￿    XrSession                                   session,
￿    const XrSceneObserverCreateInfoMSFT*        createInfo,
￿    XrSceneObserverMSFT*                        sceneObserver);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to calling #CreateSceneObserverMSFT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>If {@code createInfo} is not {@code NULL}, {@code createInfo} <b>must</b> be a pointer to a valid ##XrSceneObserverCreateInfoMSFT structure</li>
            <li>{@code sceneObserver} <b>must</b> be a pointer to an {@code XrSceneObserverMSFT} handle</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSceneObserverCreateInfoMSFT, #DestroySceneObserverMSFT()
        """,

        XrSession("session", "an {@code XrSession} in which the scene observer will be active."),
        nullable..XrSceneObserverCreateInfoMSFT.const.p("createInfo", "exists for extensibility purposes, it is {@code NULL} or a pointer to a valid ##XrSceneObserverCreateInfoMSFT structure."),
        Check(1)..XrSceneObserverMSFT.p("sceneObserver", "the returned {@code XrSceneObserverMSFT} handle.")
    )

    XrResult(
        "DestroySceneObserverMSFT",
        """
        Destroy a scene observer handle.

        <h5>C Specification</h5>
        The #DestroySceneObserverMSFT() function releases the {@code sceneObserver} and the underlying resources.

        <pre><code>
￿XrResult xrDestroySceneObserverMSFT(
￿    XrSceneObserverMSFT                         sceneObserver);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to calling #DestroySceneObserverMSFT()</li>
            <li>{@code sceneObserver} <b>must</b> be a valid {@code XrSceneObserverMSFT} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code sceneObserver}, and any child handles, <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_HANDLE_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #CreateSceneObserverMSFT()
        """,

        XrSceneObserverMSFT("sceneObserver", "an {@code XrSceneObserverMSFT} previously created by #CreateSceneObserverMSFT().")
    )

    XrResult(
        "CreateSceneMSFT",
        """
        Create a scene handle.

        <h5>C Specification</h5>
        The #CreateSceneMSFT() functions creates an {@code XrSceneMSFT} handle. It can only be called after #GetSceneComputeStateMSFT() returns #SCENE_COMPUTE_STATE_COMPLETED_MSFT to indicate that the asynchronous operation has completed. The {@code XrSceneMSFT} handle manages the collection of scene components that represents the detected objects found during the query.

        After an {@code XrSceneMSFT} handle is created, the handle and associated data <b>must</b> remain valid until destroyed, even after #CreateSceneMSFT() is called again to create the next scene. The runtime <b>must</b> keep alive any component data and mesh buffers relating to this historical scene until its handle is destroyed.

        <pre><code>
￿XrResult xrCreateSceneMSFT(
￿    XrSceneObserverMSFT                         sceneObserver,
￿    const XrSceneCreateInfoMSFT*                createInfo,
￿    XrSceneMSFT*                                scene);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to calling #CreateSceneMSFT()</li>
            <li>{@code sceneObserver} <b>must</b> be a valid {@code XrSceneObserverMSFT} handle</li>
            <li>If {@code createInfo} is not {@code NULL}, {@code createInfo} <b>must</b> be a pointer to a valid ##XrSceneCreateInfoMSFT structure</li>
            <li>{@code scene} <b>must</b> be a pointer to an {@code XrSceneMSFT} handle</li>
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
            </ul></dd>
        </dl>

        Calling #CreateSceneMSFT() when #GetSceneComputeStateMSFT() returns #SCENE_COMPUTE_STATE_NONE_MSFT or #SCENE_COMPUTE_STATE_UPDATING_MSFT <b>must</b> return the error #ERROR_COMPUTE_NEW_SCENE_NOT_COMPLETED_MSFT.

        <h5>See Also</h5>
        ##XrSceneCreateInfoMSFT, #DestroySceneMSFT()
        """,

        XrSceneObserverMSFT("sceneObserver", "a handle to an {@code XrSceneObserverMSFT}."),
        nullable..XrSceneCreateInfoMSFT.const.p("createInfo", "exists for extensibility purposes, it is {@code NULL} or a pointer to a valid ##XrSceneCreateInfoMSFT structure."),
        Check(1)..XrSceneMSFT.p("scene", "the returned {@code XrSceneMSFT} handle.")
    )

    XrResult(
        "DestroySceneMSFT",
        """
        Destroy a scene handle.

        <h5>C Specification</h5>
        The #DestroySceneMSFT() function releases the {@code scene} and the underlying resources.

        <pre><code>
￿XrResult xrDestroySceneMSFT(
￿    XrSceneMSFT                                 scene);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to calling #DestroySceneMSFT()</li>
            <li>{@code scene} <b>must</b> be a valid {@code XrSceneMSFT} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code scene}, and any child handles, <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_HANDLE_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #CreateSceneMSFT()
        """,

        XrSceneMSFT("scene", "an {@code XrSceneMSFT} previously created by #CreateSceneMSFT().")
    )

    XrResult(
        "ComputeNewSceneMSFT",
        """
        Compute new scene.

        <h5>C Specification</h5>
        The #ComputeNewSceneMSFT() function begins the compute of a new scene and the runtime <b>must</b> return quickly without waiting for the compute to complete. The application <b>should</b> use #GetSceneComputeStateMSFT() to inspect the compute status.

        The application <b>can</b> control the compute features by passing a list of {@code XrSceneComputeFeatureMSFT} via ##XrNewSceneComputeInfoMSFT{@code ::requestedFeatures}.

        <ul>
            <li>
                If #SCENE_COMPUTE_FEATURE_PLANE_MSFT is passed, but #SCENE_COMPUTE_FEATURE_PLANE_MESH_MSFT is not passed, then:
                <ul>
                    <li>The application <b>may</b> be able to read #SCENE_COMPONENT_TYPE_PLANE_MSFT and #SCENE_COMPONENT_TYPE_OBJECT_MSFT scene components from the resulting {@code XrSceneMSFT} handle.</li>
                    <li>##XrScenePlaneMSFT{@code ::meshBufferId} <b>must</b> be zero to indicate that the plane scene component does not have a mesh buffer available to read.</li>
                </ul>
            </li>
            <li>
                If #SCENE_COMPUTE_FEATURE_PLANE_MSFT and #SCENE_COMPUTE_FEATURE_PLANE_MESH_MSFT are passed, then:
                <ul>
                    <li>the application <b>may</b> be able to read #SCENE_COMPONENT_TYPE_PLANE_MSFT and #SCENE_COMPONENT_TYPE_OBJECT_MSFT scene components from the resulting {@code XrSceneMSFT} handle</li>
                    <li>##XrScenePlaneMSFT{@code ::meshBufferId} <b>may</b> contain a non-zero mesh buffer identifier to indicate that the plane scene component has a mesh buffer available to read.</li>
                </ul>
            </li>
            <li>
                If #SCENE_COMPUTE_FEATURE_VISUAL_MESH_MSFT is passed then:
                <ul>
                    <li>the application <b>may</b> be able to read #SCENE_COMPONENT_TYPE_VISUAL_MESH_MSFT and #SCENE_COMPONENT_TYPE_OBJECT_MSFT scene components from the resulting {@code XrSceneMSFT} handle.</li>
                </ul>
            </li>
            <li>
                If #SCENE_COMPUTE_FEATURE_COLLIDER_MESH_MSFT is passed then:
                <ul>
                    <li>the application <b>may</b> be able to read #SCENE_COMPONENT_TYPE_COLLIDER_MESH_MSFT and #SCENE_COMPONENT_TYPE_OBJECT_MSFT scene components from the resulting {@code XrSceneMSFT} handle.</li>
                </ul>
            </li>
        </ul>

        <pre><code>
￿XrResult xrComputeNewSceneMSFT(
￿    XrSceneObserverMSFT                         sceneObserver,
￿    const XrNewSceneComputeInfoMSFT*            computeInfo);</code></pre>

        <h5>Description</h5>
        The runtime <b>must</b> return #ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT if incompatible features were passed or no compatible features were passed.

        The runtime <b>must</b> return #ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT if #SCENE_COMPUTE_FEATURE_PLANE_MESH_MSFT was passed but #SCENE_COMPUTE_FEATURE_PLANE_MSFT was not passed.

        The runtime <b>must</b> return #ERROR_COMPUTE_NEW_SCENE_NOT_COMPLETED_MSFT if #ComputeNewSceneMSFT() is called while the scene computation is in progress.

        An application that wishes to use #SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT <b>must</b> create an {@code XrSceneObserverMSFT} handle that passes neither #SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_COMPLETE_MSFT nor #SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_INCOMPLETE_FAST_MSFT to #ComputeNewSceneMSFT() for the lifetime of that {@code XrSceneObserverMSFT} handle. This allows the runtime to return occlusion mesh at a different cadence than non-occlusion mesh or planes.

        <ul>
            <li>
                The runtime <b>must</b> return #ERROR_SCENE_COMPUTE_CONSISTENCY_MISMATCH_MSFT if:
                <ul>
                    <li>#SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT is passed to #ComputeNewSceneMSFT() <b>and</b></li>
                    <li>a previous call to #ComputeNewSceneMSFT() did not pass #SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT for the same {@code XrSceneObserverMSFT} handle.</li>
                </ul>
            </li>
            <li>
                The runtime <b>must</b> return #ERROR_SCENE_COMPUTE_CONSISTENCY_MISMATCH_MSFT if:
                <ul>
                    <li>#SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT is not passed to #ComputeNewSceneMSFT() <b>and</b></li>
                    <li>a previous call to #ComputeNewSceneMSFT() did pass #SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT for the same {@code XrSceneObserverMSFT} handle.</li>
                </ul>
            </li>
            <li>
                The runtime <b>must</b> return #ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT if:
                <ul>
                    <li>#SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT is passed to #ComputeNewSceneMSFT() <b>and</b></li>
                    <li>neither #SCENE_COMPUTE_FEATURE_VISUAL_MESH_MSFT nor #SCENE_COMPUTE_FEATURE_COLLIDER_MESH_MSFT are also passed.</li>
                </ul>
            </li>
            <li>
                The runtime <b>must</b> return #ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT if:
                <ul>
                    <li>#SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT is passed to #ComputeNewSceneMSFT() <b>and</b></li>
                    <li>at least one of #SCENE_COMPUTE_FEATURE_SERIALIZE_SCENE_MSFT, #SCENE_COMPUTE_FEATURE_PLANE_MSFT, #SCENE_COMPUTE_FEATURE_PLANE_MESH_MSFT, or #SCENE_COMPUTE_FEATURE_SERIALIZE_SCENE_MSFT are also passed.</li>
                </ul>
            </li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to calling #ComputeNewSceneMSFT()</li>
            <li>{@code sceneObserver} <b>must</b> be a valid {@code XrSceneObserverMSFT} handle</li>
            <li>{@code computeInfo} <b>must</b> be a pointer to a valid ##XrNewSceneComputeInfoMSFT structure</li>
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
                <li>#ERROR_TIME_INVALID</li>
                <li>#ERROR_POSE_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrNewSceneComputeInfoMSFT, #EnumerateSceneComputeFeaturesMSFT()
        """,

        XrSceneObserverMSFT("sceneObserver", "a handle to an {@code XrSceneObserverMSFT}."),
        XrNewSceneComputeInfoMSFT.const.p("computeInfo", "a pointer to an ##XrNewSceneComputeInfoMSFT structure.")
    )

    XrResult(
        "GetSceneComputeStateMSFT",
        """
        Get the scene compute state.

        <h5>C Specification</h5>
        An application <b>can</b> inspect the completion of the compute by polling #GetSceneComputeStateMSFT(). This function <b>should</b> typically be called once per frame per {@code XrSceneObserverMSFT}.

        <pre><code>
￿XrResult xrGetSceneComputeStateMSFT(
￿    XrSceneObserverMSFT                         sceneObserver,
￿    XrSceneComputeStateMSFT*                    state);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to calling #GetSceneComputeStateMSFT()</li>
            <li>{@code sceneObserver} <b>must</b> be a valid {@code XrSceneObserverMSFT} handle</li>
            <li>{@code state} <b>must</b> be a pointer to an {@code XrSceneComputeStateMSFT} value</li>
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
        """,

        XrSceneObserverMSFT("sceneObserver", "a handle to an {@code XrSceneObserverMSFT}."),
        Check(1)..XrSceneComputeStateMSFT.p("state", "the returned {@code XrSceneComputeStateMSFT} value.")
    )

    XrResult(
        "GetSceneComponentsMSFT",
        """
        Get scene components from a scene.

        <h5>C Specification</h5>
        Scene components are read from an {@code XrSceneMSFT} using #GetSceneComponentsMSFT() and passing one {@code XrSceneComponentTypeMSFT}. This function follows the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#buffer-size-parameters">two-call idiom</a> for filling multiple buffers in a struct. Different scene component types <b>may</b> have additional properties that <b>can</b> be read by chaining additional structures to ##XrSceneComponentsMSFT. Those additional structures <b>must</b> have an array size that is at least as large as ##XrSceneComponentsMSFT::componentCapacityInput, otherwise the runtime <b>must</b> return #ERROR_SIZE_INSUFFICIENT.

        <ul>
            <li>If #SCENE_COMPONENT_TYPE_OBJECT_MSFT is passed to #GetSceneComponentsMSFT(), then ##XrSceneObjectsMSFT may be included in the ##XrSceneComponentsMSFT{@code ::next} chain.</li>
            <li>If #SCENE_COMPONENT_TYPE_PLANE_MSFT is passed to #GetSceneComponentsMSFT(), then ##XrScenePlanesMSFT may be included in the ##XrSceneComponentsMSFT{@code ::next} chain.</li>
            <li>If #SCENE_COMPONENT_TYPE_VISUAL_MESH_MSFT or #SCENE_COMPONENT_TYPE_COLLIDER_MESH_MSFT are passed to #GetSceneComponentsMSFT(), then ##XrSceneMeshesMSFT may be included in the ##XrSceneComponentsMSFT{@code ::next} chain.</li>
        </ul>

        <pre><code>
￿XrResult xrGetSceneComponentsMSFT(
￿    XrSceneMSFT                                 scene,
￿    const XrSceneComponentsGetInfoMSFT*         getInfo,
￿    XrSceneComponentsMSFT*                      components);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to calling #GetSceneComponentsMSFT()</li>
            <li>{@code scene} <b>must</b> be a valid {@code XrSceneMSFT} handle</li>
            <li>{@code getInfo} <b>must</b> be a pointer to a valid ##XrSceneComponentsGetInfoMSFT structure</li>
            <li>{@code components} <b>must</b> be a pointer to an ##XrSceneComponentsMSFT structure</li>
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
                <li>#ERROR_SIZE_INSUFFICIENT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSceneComponentsGetInfoMSFT, ##XrSceneComponentsMSFT
        """,

        XrSceneMSFT("scene", "an {@code XrSceneMSFT} previously created by #CreateSceneMSFT()."),
        XrSceneComponentsGetInfoMSFT.const.p("getInfo", "a pointer to an ##XrSceneComponentsGetInfoMSFT structure."),
        XrSceneComponentsMSFT.p("components", "the ##XrSceneComponentsMSFT output structure.")
    )

    XrResult(
        "LocateSceneComponentsMSFT",
        """
        Locate scene components.

        <h5>C Specification</h5>
        The #LocateSceneComponentsMSFT() function locates an array of scene components to a base space at a given time.

        <pre><code>
￿XrResult xrLocateSceneComponentsMSFT(
￿    XrSceneMSFT                                 scene,
￿    const XrSceneComponentsLocateInfoMSFT*      locateInfo,
￿    XrSceneComponentLocationsMSFT*              locations);</code></pre>

        <h5>Description</h5>
        The runtime <b>must</b> return #ERROR_SIZE_INSUFFICIENT if ##XrSceneComponentLocationsMSFT{@code ::locationCount} is less than ##XrSceneComponentsLocateInfoMSFT{@code ::componentIdCount}.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Similar to #LocateSpace(), apps should call #LocateSceneComponentsMSFT() each frame because the location returned by #LocateSceneComponentsMSFT() in later frames may change over time as the target space or the scene components may refine their locations.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to calling #LocateSceneComponentsMSFT()</li>
            <li>{@code scene} <b>must</b> be a valid {@code XrSceneMSFT} handle</li>
            <li>{@code locateInfo} <b>must</b> be a pointer to a valid ##XrSceneComponentsLocateInfoMSFT structure</li>
            <li>{@code locations} <b>must</b> be a pointer to an ##XrSceneComponentLocationsMSFT structure</li>
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
                <li>#ERROR_SIZE_INSUFFICIENT</li>
                <li>#ERROR_TIME_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSceneComponentLocationsMSFT, ##XrSceneComponentsLocateInfoMSFT
        """,

        XrSceneMSFT("scene", "a handle to an {@code XrSceneMSFT}."),
        XrSceneComponentsLocateInfoMSFT.const.p("locateInfo", "a pointer to ##XrSceneComponentsLocateInfoMSFT describing information to locate scene components."),
        XrSceneComponentLocationsMSFT.p("locations", "a pointer to ##XrSceneComponentLocationsMSFT receiving the returned scene component locations.")
    )

    XrResult(
        "GetSceneMeshBuffersMSFT",
        """
        Get scene mesh buffers.

        <h5>C Specification</h5>
        The #GetSceneMeshBuffersMSFT() function retrieves the scene mesh vertex buffer and index buffer for the given scene mesh buffer identifier.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications may use the scene mesh buffer identifier as a key to cache the vertices and indices of a mesh for reuse within an {@code XrSceneMSFT} or across multiple {@code XrSceneMSFT} for the same {@code XrSession}.

        Applications can avoid unnecessarily calling #GetSceneMeshBuffersMSFT() for a scene component if ##XrSceneComponentMSFT{@code ::updateTime} is equal to the ##XrSceneComponentMSFT{@code ::updateTime} value in the previous {@code XrSceneMSFT}. A scene component is uniquely identified by ##XrUuidMSFT.
        </div>

        This function follows the two-call idiom for filling multiple buffers in a struct.

        The #GetSceneMeshBuffersMSFT() function is defined as:

        <pre><code>
￿XrResult xrGetSceneMeshBuffersMSFT(
￿    XrSceneMSFT                                 scene,
￿    const XrSceneMeshBuffersGetInfoMSFT*        getInfo,
￿    XrSceneMeshBuffersMSFT*                     buffers);</code></pre>

        <h5>Description</h5>
        Applications <b>can</b> request the vertex buffer of the mesh by including ##XrSceneMeshVertexBufferMSFT in the ##XrSceneMeshBuffersMSFT{@code ::next} chain. Runtimes <b>must</b> support requesting a 32-bit index buffer and <b>may</b> support requesting a 16-bit index buffer. Applications <b>can</b> request a 32-bit index buffer by including ##XrSceneMeshIndicesUint32MSFT in the ##XrSceneMeshBuffersMSFT{@code ::next} chain. Applications <b>can</b> request a 16-bit index buffer by including ##XrSceneMeshIndicesUint16MSFT in the ##XrSceneMeshBuffersMSFT{@code ::next} chain. If the runtime for the given scene mesh buffer does not support requesting a 16-bit index buffer then #ERROR_VALIDATION_FAILURE <b>must</b> be returned. The runtime <b>must</b> support reading a 16-bit index buffer for the given scene mesh buffer if ##XrScenePlaneMSFT:supportsIndicesUint16 or ##XrSceneMeshMSFT:supportsIndicesUint16 are #TRUE for the scene component that contained that scene mesh buffer identifier.

        The runtime <b>must</b> return #ERROR_SCENE_MESH_BUFFER_ID_INVALID_MSFT if none of the scene components in the given {@code XrSceneMSFT} contain ##XrSceneMeshBuffersGetInfoMSFT{@code ::meshBufferId}. The runtime <b>must</b> return #ERROR_SCENE_MESH_BUFFER_ID_INVALID_MSFT if ##XrSceneMeshBuffersGetInfoMSFT{@code ::meshBufferId} is zero. The runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if both ##XrSceneMeshIndicesUint32MSFT and ##XrSceneMeshIndicesUint16MSFT are included in the ##XrSceneMeshBuffersMSFT{@code ::next} chain. The runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if the ##XrSceneMeshBuffersMSFT{@code ::next} does not contain at least one of ##XrSceneMeshVertexBufferMSFT, ##XrSceneMeshIndicesUint32MSFT or ##XrSceneMeshIndicesUint16MSFT.

        The runtime <b>must</b> return the same vertices and indices for a given scene mesh buffer identifier and {@code XrSession}. A runtime <b>may</b> return zero vertices and indices if the underlying mesh data is no longer available.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to calling #GetSceneMeshBuffersMSFT()</li>
            <li>{@code scene} <b>must</b> be a valid {@code XrSceneMSFT} handle</li>
            <li>{@code getInfo} <b>must</b> be a pointer to a valid ##XrSceneMeshBuffersGetInfoMSFT structure</li>
            <li>{@code buffers} <b>must</b> be a pointer to an ##XrSceneMeshBuffersMSFT structure</li>
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
                <li>#ERROR_SCENE_COMPONENT_ID_INVALID_MSFT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSceneMeshBuffersGetInfoMSFT, ##XrSceneMeshBuffersMSFT
        """,

        XrSceneMSFT("scene", "an {@code XrSceneMSFT} previously created by #CreateSceneMSFT()."),
        XrSceneMeshBuffersGetInfoMSFT.const.p("getInfo", "a pointer to an ##XrSceneMeshBuffersGetInfoMSFT structure."),
        XrSceneMeshBuffersMSFT.p("buffers", "a pointer to an ##XrSceneMeshBuffersMSFT structure for reading a scene mesh buffer.")
    )
}