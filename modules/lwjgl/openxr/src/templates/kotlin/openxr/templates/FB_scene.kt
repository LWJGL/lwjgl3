/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_scene = "FBScene".nativeClassXR("FB_scene", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_scene">XR_FB_scene</a> extension.

        This extension expands on the concept of spatial entities to include a way for a spatial entity to represent rooms, objects, or other boundaries in a scene.

        In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into #CreateInstance() via the ##XrInstanceCreateInfo{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#extensions">extensions</a> section.
        """

    IntConstant(
        "The extension specification version.",

        "FB_scene_SPEC_VERSION".."3"
    )

    StringConstant(
        "The extension name.",

        "FB_SCENE_EXTENSION_NAME".."XR_FB_scene"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SEMANTIC_LABELS_FB".."1000175000",
        "TYPE_ROOM_LAYOUT_FB".."1000175001",
        "TYPE_BOUNDARY_2D_FB".."1000175002",
        "TYPE_SEMANTIC_LABELS_SUPPORT_INFO_FB".."1000175010"
    )

    EnumConstant(
        """
        XrSemanticLabelsSupportFlagBitsFB - XrSemanticLabelsSupportFlagBitsFB

        <h5>Flag Descriptions</h5>
        <ul>
            <li>#SEMANTIC_LABELS_SUPPORT_MULTIPLE_SEMANTIC_LABELS_BIT_FB — If set, and the runtime reports the {@code extensionVersion} as 2 or greater, the runtime <b>may</b> return multiple semantic labels separated by a comma without spaces. Otherwise, the runtime <b>must</b> return a single semantic label.</li>
            <li>#SEMANTIC_LABELS_SUPPORT_ACCEPT_DESK_TO_TABLE_MIGRATION_BIT_FB — If set, and the runtime reports the {@code extensionVersion} as 3 or greater, the runtime <b>must</b> return "TABLE" instead of "DESK" as a semantic label to the application. Otherwise, the runtime <b>must</b> return "DESK" instead of "TABLE" as a semantic label to the application, when applicable.</li>
        </ul>
        """,

        "SEMANTIC_LABELS_SUPPORT_MULTIPLE_SEMANTIC_LABELS_BIT_FB".enum(0x00000001),
        "SEMANTIC_LABELS_SUPPORT_ACCEPT_DESK_TO_TABLE_MIGRATION_BIT_FB".enum(0x00000002)
    )

    XrResult(
        "GetSpaceBoundingBox2DFB",
        """
        Gets the 2D bounding box for a spatial entity.

        <h5>C Specification</h5>
        The #GetSpaceBoundingBox2DFB() function is defined as:

        <pre><code>
￿XrResult xrGetSpaceBoundingBox2DFB(
￿    XrSession                                   session,
￿    XrSpace                                     space,
￿    XrRect2Df*                                  boundingBox2DOutput);</code></pre>

        <h5>Description</h5>
        Gets the 2D bounding box for a spatial entity with the #SPACE_COMPONENT_TYPE_BOUNDED_2D_FB component type enabled.

        The bounding box is defined by an {@code offset} and {@code extent}. The {@code offset} refers to the coordinate of the minimum corner of the box in the x-y plane of the given {@code XrSpace}’s coordinate system; that is, the corner whose coordinate has the minimum value on each axis. The {@code extent} refers to the dimensions of the box along each axis. The maximum corner can therefore be computed as <code>offset extent</code>.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBScene XR_FB_scene} extension <b>must</b> be enabled prior to calling #GetSpaceBoundingBox2DFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code boundingBox2DOutput} <b>must</b> be a pointer to an ##XrRect2Df structure</li>
            <li>{@code space} <b>must</b> have been created, allocated, or retrieved from {@code session}</li>
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
                <li>#ERROR_SPACE_COMPONENT_NOT_ENABLED_FB</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrRect2Df
        """,

        XrSession("session", "a handle to an {@code XrSession}."),
        XrSpace("space", "the {@code XrSpace} handle to the spatial entity."),
        XrRect2Df.p("boundingBox2DOutput", "an output parameter pointing to the structure containing the 2D bounding box for {@code space}.")
    )

    XrResult(
        "GetSpaceBoundingBox3DFB",
        """
        Gets the 3D bounding box for a spatial entity.

        <h5>C Specification</h5>
        The #GetSpaceBoundingBox3DFB() function is defined as:

        <pre><code>
￿XrResult xrGetSpaceBoundingBox3DFB(
￿    XrSession                                   session,
￿    XrSpace                                     space,
￿    XrRect3DfFB*                                boundingBox3DOutput);</code></pre>

        <h5>Description</h5>
        Gets the 3D bounding box for a spatial entity with the #SPACE_COMPONENT_TYPE_BOUNDED_3D_FB component type enabled.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBScene XR_FB_scene} extension <b>must</b> be enabled prior to calling #GetSpaceBoundingBox3DFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code boundingBox3DOutput} <b>must</b> be a pointer to an ##XrRect3DfFB structure</li>
            <li>{@code space} <b>must</b> have been created, allocated, or retrieved from {@code session}</li>
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
                <li>#ERROR_SPACE_COMPONENT_NOT_ENABLED_FB</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrRect3DfFB
        """,

        XrSession("session", "a handle to an {@code XrSession}."),
        XrSpace("space", "the {@code XrSpace} handle to the spatial entity."),
        XrRect3DfFB.p("boundingBox3DOutput", "an output parameter pointing to the structure containing the 3D bounding box for {@code space}.")
    )

    XrResult(
        "GetSpaceSemanticLabelsFB",
        """
        Gets the semantic labels for a spatial entity.

        <h5>C Specification</h5>
        The #GetSpaceSemanticLabelsFB() function is defined as:

        <pre><code>
￿XrResult xrGetSpaceSemanticLabelsFB(
￿    XrSession                                   session,
￿    XrSpace                                     space,
￿    XrSemanticLabelsFB*                         semanticLabelsOutput);</code></pre>

        <h5>Description</h5>
        Gets the semantic labels for a spatial entity with the #SPACE_COMPONENT_TYPE_SEMANTIC_LABELS_FB component type enabled.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBScene XR_FB_scene} extension <b>must</b> be enabled prior to calling #GetSpaceSemanticLabelsFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code semanticLabelsOutput} <b>must</b> be a pointer to an ##XrSemanticLabelsFB structure</li>
            <li>{@code space} <b>must</b> have been created, allocated, or retrieved from {@code session}</li>
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
        ##XrSemanticLabelsFB
        """,

        XrSession("session", "a handle to an {@code XrSession}."),
        XrSpace("space", "the {@code XrSpace} handle to the spatial entity."),
        XrSemanticLabelsFB.p("semanticLabelsOutput", "an output parameter pointing to the structure containing the ##XrSemanticLabelsFB for {@code space}.")
    )

    XrResult(
        "GetSpaceBoundary2DFB",
        """
        Gets the 2D boundary for a spatial entity.

        <h5>C Specification</h5>
        The #GetSpaceBoundary2DFB() function is defined as:

        <pre><code>
￿XrResult xrGetSpaceBoundary2DFB(
￿    XrSession                                   session,
￿    XrSpace                                     space,
￿    XrBoundary2DFB*                             boundary2DOutput);</code></pre>

        <h5>Description</h5>
        Gets the 2D boundary, specified by vertices, for a spatial entity with the #SPACE_COMPONENT_TYPE_BOUNDED_2D_FB component type enabled.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBScene XR_FB_scene} extension <b>must</b> be enabled prior to calling #GetSpaceBoundary2DFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code boundary2DOutput} <b>must</b> be a pointer to an ##XrBoundary2DFB structure</li>
            <li>{@code space} <b>must</b> have been created, allocated, or retrieved from {@code session}</li>
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
        ##XrBoundary2DFB
        """,

        XrSession("session", "a handle to an {@code XrSession}."),
        XrSpace("space", "the {@code XrSpace} handle to the spatial entity."),
        XrBoundary2DFB.p("boundary2DOutput", "an output parameter pointing to the structure containing the ##XrBoundary2DFB for {@code space}.")
    )

    XrResult(
        "GetSpaceRoomLayoutFB",
        """
        Gets the room layout for a spatial entity.

        <h5>C Specification</h5>
        The #GetSpaceRoomLayoutFB() function is defined as:

        <pre><code>
￿XrResult xrGetSpaceRoomLayoutFB(
￿    XrSession                                   session,
￿    XrSpace                                     space,
￿    XrRoomLayoutFB*                             roomLayoutOutput);</code></pre>

        <h5>Description</h5>
        Gets the room layout, specified by UUIDs for each surface, for a spatial entity with the #SPACE_COMPONENT_TYPE_ROOM_LAYOUT_FB component type enabled.

        If the ##XrRoomLayoutFB{@code ::wallUuidCapacityInput} field is zero (indicating a request to retrieve the required capacity for the ##XrRoomLayoutFB{@code ::wallUuids} array), or if #GetSpaceRoomLayoutFB() returns failure, then the values of {@code floorUuid} and {@code ceilingUuid} are unspecified and should not be used.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBScene XR_FB_scene} extension <b>must</b> be enabled prior to calling #GetSpaceRoomLayoutFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code roomLayoutOutput} <b>must</b> be a pointer to an ##XrRoomLayoutFB structure</li>
            <li>{@code space} <b>must</b> have been created, allocated, or retrieved from {@code session}</li>
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
        ##XrRoomLayoutFB
        """,

        XrSession("session", "a handle to an {@code XrSession}."),
        XrSpace("space", "the {@code XrSpace} handle to the spatial entity."),
        XrRoomLayoutFB.p("roomLayoutOutput", "an output parameter pointing to the structure containing the ##XrRoomLayoutFB for {@code space}.")
    )
}