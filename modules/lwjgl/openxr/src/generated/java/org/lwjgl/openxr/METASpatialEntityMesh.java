/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#XR_META_spatial_entity_mesh">XR_META_spatial_entity_mesh</a> extension.
 * 
 * <p>This extension expands on the concept of spatial entities to include a way for a spatial entity to represent a triangle mesh that describes 3D geometry of the spatial entity in a scene. Spatial entities are defined in {@link FBSpatialEntity XR_FB_spatial_entity} extension using the Entity-Component System. The triangle mesh is a component type that <b>may</b> be associated to a spatial entity.</p>
 * 
 * <p>In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into {@link XR10#xrCreateInstance CreateInstance} via the {@link XrInstanceCreateInfo}{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#fundamentals-extensions">extension</a> section.</p>
 */
public class METASpatialEntityMesh {

    /** The extension specification version. */
    public static final int XR_META_spatial_entity_mesh_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_META_SPATIAL_ENTITY_MESH_EXTENSION_NAME = "XR_META_spatial_entity_mesh";

    /** Extends {@code XrSpaceComponentTypeFB}. */
    public static final int XR_SPACE_COMPONENT_TYPE_TRIANGLE_MESH_META = 1000269000;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SPACE_TRIANGLE_MESH_GET_INFO_META TYPE_SPACE_TRIANGLE_MESH_GET_INFO_META}</li>
     * <li>{@link #XR_TYPE_SPACE_TRIANGLE_MESH_META TYPE_SPACE_TRIANGLE_MESH_META}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SPACE_TRIANGLE_MESH_GET_INFO_META = 1000269001,
        XR_TYPE_SPACE_TRIANGLE_MESH_META          = 1000269002;

    protected METASpatialEntityMesh() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetSpaceTriangleMeshMETA ] ---

    /** Unsafe version of: {@link #xrGetSpaceTriangleMeshMETA GetSpaceTriangleMeshMETA} */
    public static int nxrGetSpaceTriangleMeshMETA(XrSpace space, long getInfo, long triangleMeshOutput) {
        long __functionAddress = space.getCapabilities().xrGetSpaceTriangleMeshMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(space.address(), getInfo, triangleMeshOutput, __functionAddress);
    }

    /**
     * Gets an XrSpaceTriangleMeshMETA that represents a triangle mesh.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetSpaceTriangleMeshMETA GetSpaceTriangleMeshMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetSpaceTriangleMeshMETA(
     *     XrSpace                                     space,
     *     const XrSpaceTriangleMeshGetInfoMETA*       getInfo,
     *     XrSpaceTriangleMeshMETA*                    triangleMeshOutput);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrGetSpaceTriangleMeshMETA GetSpaceTriangleMeshMETA} function is used by the application to perform the two calls required to obtain a triangle mesh associated to a spatial entity specified by {@code space}.</p>
     * 
     * <p>The spatial entity {@code space} <b>must</b> have the {@link #XR_SPACE_COMPONENT_TYPE_TRIANGLE_MESH_META SPACE_COMPONENT_TYPE_TRIANGLE_MESH_META} component type enabled, otherwise this function will return {@link FBSpatialEntity#XR_ERROR_SPACE_COMPONENT_NOT_ENABLED_FB ERROR_SPACE_COMPONENT_NOT_ENABLED_FB}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METASpatialEntityMesh XR_META_spatial_entity_mesh} extension <b>must</b> be enabled prior to calling {@link #xrGetSpaceTriangleMeshMETA GetSpaceTriangleMeshMETA}</li>
     * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
     * <li>{@code getInfo} <b>must</b> be a pointer to a valid {@link XrSpaceTriangleMeshGetInfoMETA} structure</li>
     * <li>{@code triangleMeshOutput} <b>must</b> be a pointer to an {@link XrSpaceTriangleMeshMETA} structure</li>
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
     * <li>{@link FBSpatialEntity#XR_ERROR_SPACE_COMPONENT_NOT_ENABLED_FB ERROR_SPACE_COMPONENT_NOT_ENABLED_FB}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpaceTriangleMeshGetInfoMETA}, {@link XrSpaceTriangleMeshMETA}</p>
     *
     * @param space              a handle to an {@code XrSpace}.
     * @param getInfo            exists for extensibility purposes. It is {@code NULL} or a pointer to a valid {@link XrSpaceTriangleMeshGetInfoMETA}.
     * @param triangleMeshOutput the output parameter that points to an {@link XrSpaceTriangleMeshMETA}.
     */
    @NativeType("XrResult")
    public static int xrGetSpaceTriangleMeshMETA(XrSpace space, @NativeType("XrSpaceTriangleMeshGetInfoMETA const *") XrSpaceTriangleMeshGetInfoMETA getInfo, @NativeType("XrSpaceTriangleMeshMETA *") XrSpaceTriangleMeshMETA triangleMeshOutput) {
        return nxrGetSpaceTriangleMeshMETA(space, getInfo.address(), triangleMeshOutput.address());
    }

}