/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_spatial_entity_mesh = "METASpatialEntityMesh".nativeClassXR("META_spatial_entity_mesh", type = "instance", postfix = "META") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#XR_META_spatial_entity_mesh">XR_META_spatial_entity_mesh</a> extension.

        This extension expands on the concept of spatial entities to include a way for a spatial entity to represent a triangle mesh that describes 3D geometry of the spatial entity in a scene. Spatial entities are defined in {@link FBSpatialEntity XR_FB_spatial_entity} extension using the Entity-Component System. The triangle mesh is a component type that <b>may</b> be associated to a spatial entity.

        In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into #CreateInstance() via the ##XrInstanceCreateInfo{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#fundamentals-extensions">extension</a> section.
        """

    IntConstant(
        "The extension specification version.",

        "META_spatial_entity_mesh_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "META_SPATIAL_ENTITY_MESH_EXTENSION_NAME".."XR_META_spatial_entity_mesh"
    )

    EnumConstant(
        "Extends {@code XrSpaceComponentTypeFB}.",

        "SPACE_COMPONENT_TYPE_TRIANGLE_MESH_META".."1000269000"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SPACE_TRIANGLE_MESH_GET_INFO_META".."1000269001",
        "TYPE_SPACE_TRIANGLE_MESH_META".."1000269002"
    )

    XrResult(
        "GetSpaceTriangleMeshMETA",
        """
        Gets an XrSpaceTriangleMeshMETA that represents a triangle mesh.

        <h5>C Specification</h5>
        The #GetSpaceTriangleMeshMETA() function is defined as:

        <pre><code>
￿XrResult xrGetSpaceTriangleMeshMETA(
￿    XrSpace                                     space,
￿    const XrSpaceTriangleMeshGetInfoMETA*       getInfo,
￿    XrSpaceTriangleMeshMETA*                    triangleMeshOutput);</code></pre>

        <h5>Description</h5>
        The #GetSpaceTriangleMeshMETA() function is used by the application to perform the two calls required to obtain a triangle mesh associated to a spatial entity specified by {@code space}.

        The spatial entity {@code space} <b>must</b> have the #SPACE_COMPONENT_TYPE_TRIANGLE_MESH_META component type enabled, otherwise this function will return #ERROR_SPACE_COMPONENT_NOT_ENABLED_FB.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METASpatialEntityMesh XR_META_spatial_entity_mesh} extension <b>must</b> be enabled prior to calling #GetSpaceTriangleMeshMETA()</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code getInfo} <b>must</b> be a pointer to a valid ##XrSpaceTriangleMeshGetInfoMETA structure</li>
            <li>{@code triangleMeshOutput} <b>must</b> be a pointer to an ##XrSpaceTriangleMeshMETA structure</li>
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
                <li>#ERROR_SPACE_COMPONENT_NOT_ENABLED_FB</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpaceTriangleMeshGetInfoMETA, ##XrSpaceTriangleMeshMETA
        """,

        XrSpace("space", "a handle to an {@code XrSpace}."),
        XrSpaceTriangleMeshGetInfoMETA.const.p("getInfo", "exists for extensibility purposes. It is {@code NULL} or a pointer to a valid ##XrSpaceTriangleMeshGetInfoMETA."),
        XrSpaceTriangleMeshMETA.p("triangleMeshOutput", "the output parameter that points to an ##XrSpaceTriangleMeshMETA.")
    )
}