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
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_scene">XR_FB_scene</a> extension.
 * 
 * <p>This extension expands on the concept of spatial entities to include a way for a spatial entity to represent rooms, objects, or other boundaries in a scene.</p>
 * 
 * <p>In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into {@link XR10#xrCreateInstance CreateInstance} via the {@link XrInstanceCreateInfo}{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#extensions">extensions</a> section.</p>
 */
public class FBScene {

    /** The extension specification version. */
    public static final int XR_FB_scene_SPEC_VERSION = 3;

    /** The extension name. */
    public static final String XR_FB_SCENE_EXTENSION_NAME = "XR_FB_scene";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SEMANTIC_LABELS_FB TYPE_SEMANTIC_LABELS_FB}</li>
     * <li>{@link #XR_TYPE_ROOM_LAYOUT_FB TYPE_ROOM_LAYOUT_FB}</li>
     * <li>{@link #XR_TYPE_BOUNDARY_2D_FB TYPE_BOUNDARY_2D_FB}</li>
     * <li>{@link #XR_TYPE_SEMANTIC_LABELS_SUPPORT_INFO_FB TYPE_SEMANTIC_LABELS_SUPPORT_INFO_FB}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SEMANTIC_LABELS_FB              = 1000175000,
        XR_TYPE_ROOM_LAYOUT_FB                  = 1000175001,
        XR_TYPE_BOUNDARY_2D_FB                  = 1000175002,
        XR_TYPE_SEMANTIC_LABELS_SUPPORT_INFO_FB = 1000175010;

    /**
     * XrSemanticLabelsSupportFlagBitsFB - XrSemanticLabelsSupportFlagBitsFB
     * 
     * <h5>Flag Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_SEMANTIC_LABELS_SUPPORT_MULTIPLE_SEMANTIC_LABELS_BIT_FB SEMANTIC_LABELS_SUPPORT_MULTIPLE_SEMANTIC_LABELS_BIT_FB} — If set, and the runtime reports the {@code extensionVersion} as 2 or greater, the runtime <b>may</b> return multiple semantic labels separated by a comma without spaces. Otherwise, the runtime <b>must</b> return a single semantic label.</li>
     * <li>{@link #XR_SEMANTIC_LABELS_SUPPORT_ACCEPT_DESK_TO_TABLE_MIGRATION_BIT_FB SEMANTIC_LABELS_SUPPORT_ACCEPT_DESK_TO_TABLE_MIGRATION_BIT_FB} — If set, and the runtime reports the {@code extensionVersion} as 3 or greater, the runtime <b>must</b> return "TABLE" instead of "DESK" as a semantic label to the application. Otherwise, the runtime <b>must</b> return "DESK" instead of "TABLE" as a semantic label to the application, when applicable.</li>
     * </ul>
     */
    public static final int
        XR_SEMANTIC_LABELS_SUPPORT_MULTIPLE_SEMANTIC_LABELS_BIT_FB       = 0x1,
        XR_SEMANTIC_LABELS_SUPPORT_ACCEPT_DESK_TO_TABLE_MIGRATION_BIT_FB = 0x2;

    protected FBScene() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetSpaceBoundingBox2DFB ] ---

    /** Unsafe version of: {@link #xrGetSpaceBoundingBox2DFB GetSpaceBoundingBox2DFB} */
    public static int nxrGetSpaceBoundingBox2DFB(XrSession session, XrSpace space, long boundingBox2DOutput) {
        long __functionAddress = session.getCapabilities().xrGetSpaceBoundingBox2DFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), space.address(), boundingBox2DOutput, __functionAddress);
    }

    /**
     * Gets the 2D bounding box for a spatial entity.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetSpaceBoundingBox2DFB GetSpaceBoundingBox2DFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetSpaceBoundingBox2DFB(
     *     XrSession                                   session,
     *     XrSpace                                     space,
     *     XrRect2Df*                                  boundingBox2DOutput);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Gets the 2D bounding box for a spatial entity with the {@link FBSpatialEntity#XR_SPACE_COMPONENT_TYPE_BOUNDED_2D_FB SPACE_COMPONENT_TYPE_BOUNDED_2D_FB} component type enabled.</p>
     * 
     * <p>The bounding box is defined by an {@code offset} and {@code extent}. The {@code offset} refers to the coordinate of the minimum corner of the box in the x-y plane of the given {@code XrSpace}’s coordinate system; that is, the corner whose coordinate has the minimum value on each axis. The {@code extent} refers to the dimensions of the box along each axis. The maximum corner can therefore be computed as <code>offset extent</code>.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBScene XR_FB_scene} extension <b>must</b> be enabled prior to calling {@link #xrGetSpaceBoundingBox2DFB GetSpaceBoundingBox2DFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
     * <li>{@code boundingBox2DOutput} <b>must</b> be a pointer to an {@link XrRect2Df} structure</li>
     * <li>{@code space} <b>must</b> have been created, allocated, or retrieved from {@code session}</li>
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
     * <li>{@link FBSpatialEntity#XR_ERROR_SPACE_COMPONENT_NOT_ENABLED_FB ERROR_SPACE_COMPONENT_NOT_ENABLED_FB}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrRect2Df}</p>
     *
     * @param session             a handle to an {@code XrSession}.
     * @param space               the {@code XrSpace} handle to the spatial entity.
     * @param boundingBox2DOutput an output parameter pointing to the structure containing the 2D bounding box for {@code space}.
     */
    @NativeType("XrResult")
    public static int xrGetSpaceBoundingBox2DFB(XrSession session, XrSpace space, @NativeType("XrRect2Df *") XrRect2Df boundingBox2DOutput) {
        return nxrGetSpaceBoundingBox2DFB(session, space, boundingBox2DOutput.address());
    }

    // --- [ xrGetSpaceBoundingBox3DFB ] ---

    /** Unsafe version of: {@link #xrGetSpaceBoundingBox3DFB GetSpaceBoundingBox3DFB} */
    public static int nxrGetSpaceBoundingBox3DFB(XrSession session, XrSpace space, long boundingBox3DOutput) {
        long __functionAddress = session.getCapabilities().xrGetSpaceBoundingBox3DFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), space.address(), boundingBox3DOutput, __functionAddress);
    }

    /**
     * Gets the 3D bounding box for a spatial entity.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetSpaceBoundingBox3DFB GetSpaceBoundingBox3DFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetSpaceBoundingBox3DFB(
     *     XrSession                                   session,
     *     XrSpace                                     space,
     *     XrRect3DfFB*                                boundingBox3DOutput);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Gets the 3D bounding box for a spatial entity with the {@link FBSpatialEntity#XR_SPACE_COMPONENT_TYPE_BOUNDED_3D_FB SPACE_COMPONENT_TYPE_BOUNDED_3D_FB} component type enabled.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBScene XR_FB_scene} extension <b>must</b> be enabled prior to calling {@link #xrGetSpaceBoundingBox3DFB GetSpaceBoundingBox3DFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
     * <li>{@code boundingBox3DOutput} <b>must</b> be a pointer to an {@link XrRect3DfFB} structure</li>
     * <li>{@code space} <b>must</b> have been created, allocated, or retrieved from {@code session}</li>
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
     * <li>{@link FBSpatialEntity#XR_ERROR_SPACE_COMPONENT_NOT_ENABLED_FB ERROR_SPACE_COMPONENT_NOT_ENABLED_FB}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrRect3DfFB}</p>
     *
     * @param session             a handle to an {@code XrSession}.
     * @param space               the {@code XrSpace} handle to the spatial entity.
     * @param boundingBox3DOutput an output parameter pointing to the structure containing the 3D bounding box for {@code space}.
     */
    @NativeType("XrResult")
    public static int xrGetSpaceBoundingBox3DFB(XrSession session, XrSpace space, @NativeType("XrRect3DfFB *") XrRect3DfFB boundingBox3DOutput) {
        return nxrGetSpaceBoundingBox3DFB(session, space, boundingBox3DOutput.address());
    }

    // --- [ xrGetSpaceSemanticLabelsFB ] ---

    /** Unsafe version of: {@link #xrGetSpaceSemanticLabelsFB GetSpaceSemanticLabelsFB} */
    public static int nxrGetSpaceSemanticLabelsFB(XrSession session, XrSpace space, long semanticLabelsOutput) {
        long __functionAddress = session.getCapabilities().xrGetSpaceSemanticLabelsFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), space.address(), semanticLabelsOutput, __functionAddress);
    }

    /**
     * Gets the semantic labels for a spatial entity.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetSpaceSemanticLabelsFB GetSpaceSemanticLabelsFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetSpaceSemanticLabelsFB(
     *     XrSession                                   session,
     *     XrSpace                                     space,
     *     XrSemanticLabelsFB*                         semanticLabelsOutput);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Gets the semantic labels for a spatial entity with the {@link FBSpatialEntity#XR_SPACE_COMPONENT_TYPE_SEMANTIC_LABELS_FB SPACE_COMPONENT_TYPE_SEMANTIC_LABELS_FB} component type enabled.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBScene XR_FB_scene} extension <b>must</b> be enabled prior to calling {@link #xrGetSpaceSemanticLabelsFB GetSpaceSemanticLabelsFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
     * <li>{@code semanticLabelsOutput} <b>must</b> be a pointer to an {@link XrSemanticLabelsFB} structure</li>
     * <li>{@code space} <b>must</b> have been created, allocated, or retrieved from {@code session}</li>
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
     * <p>{@link XrSemanticLabelsFB}</p>
     *
     * @param session              a handle to an {@code XrSession}.
     * @param space                the {@code XrSpace} handle to the spatial entity.
     * @param semanticLabelsOutput an output parameter pointing to the structure containing the {@link XrSemanticLabelsFB} for {@code space}.
     */
    @NativeType("XrResult")
    public static int xrGetSpaceSemanticLabelsFB(XrSession session, XrSpace space, @NativeType("XrSemanticLabelsFB *") XrSemanticLabelsFB semanticLabelsOutput) {
        return nxrGetSpaceSemanticLabelsFB(session, space, semanticLabelsOutput.address());
    }

    // --- [ xrGetSpaceBoundary2DFB ] ---

    /** Unsafe version of: {@link #xrGetSpaceBoundary2DFB GetSpaceBoundary2DFB} */
    public static int nxrGetSpaceBoundary2DFB(XrSession session, XrSpace space, long boundary2DOutput) {
        long __functionAddress = session.getCapabilities().xrGetSpaceBoundary2DFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), space.address(), boundary2DOutput, __functionAddress);
    }

    /**
     * Gets the 2D boundary for a spatial entity.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetSpaceBoundary2DFB GetSpaceBoundary2DFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetSpaceBoundary2DFB(
     *     XrSession                                   session,
     *     XrSpace                                     space,
     *     XrBoundary2DFB*                             boundary2DOutput);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Gets the 2D boundary, specified by vertices, for a spatial entity with the {@link FBSpatialEntity#XR_SPACE_COMPONENT_TYPE_BOUNDED_2D_FB SPACE_COMPONENT_TYPE_BOUNDED_2D_FB} component type enabled.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBScene XR_FB_scene} extension <b>must</b> be enabled prior to calling {@link #xrGetSpaceBoundary2DFB GetSpaceBoundary2DFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
     * <li>{@code boundary2DOutput} <b>must</b> be a pointer to an {@link XrBoundary2DFB} structure</li>
     * <li>{@code space} <b>must</b> have been created, allocated, or retrieved from {@code session}</li>
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
     * <p>{@link XrBoundary2DFB}</p>
     *
     * @param session          a handle to an {@code XrSession}.
     * @param space            the {@code XrSpace} handle to the spatial entity.
     * @param boundary2DOutput an output parameter pointing to the structure containing the {@link XrBoundary2DFB} for {@code space}.
     */
    @NativeType("XrResult")
    public static int xrGetSpaceBoundary2DFB(XrSession session, XrSpace space, @NativeType("XrBoundary2DFB *") XrBoundary2DFB boundary2DOutput) {
        return nxrGetSpaceBoundary2DFB(session, space, boundary2DOutput.address());
    }

    // --- [ xrGetSpaceRoomLayoutFB ] ---

    /** Unsafe version of: {@link #xrGetSpaceRoomLayoutFB GetSpaceRoomLayoutFB} */
    public static int nxrGetSpaceRoomLayoutFB(XrSession session, XrSpace space, long roomLayoutOutput) {
        long __functionAddress = session.getCapabilities().xrGetSpaceRoomLayoutFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), space.address(), roomLayoutOutput, __functionAddress);
    }

    /**
     * Gets the room layout for a spatial entity.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetSpaceRoomLayoutFB GetSpaceRoomLayoutFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetSpaceRoomLayoutFB(
     *     XrSession                                   session,
     *     XrSpace                                     space,
     *     XrRoomLayoutFB*                             roomLayoutOutput);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Gets the room layout, specified by UUIDs for each surface, for a spatial entity with the {@link FBSpatialEntity#XR_SPACE_COMPONENT_TYPE_ROOM_LAYOUT_FB SPACE_COMPONENT_TYPE_ROOM_LAYOUT_FB} component type enabled.</p>
     * 
     * <p>If the {@link XrRoomLayoutFB}{@code ::wallUuidCapacityInput} field is zero (indicating a request to retrieve the required capacity for the {@link XrRoomLayoutFB}{@code ::wallUuids} array), or if {@link #xrGetSpaceRoomLayoutFB GetSpaceRoomLayoutFB} returns failure, then the values of {@code floorUuid} and {@code ceilingUuid} are unspecified and should not be used.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBScene XR_FB_scene} extension <b>must</b> be enabled prior to calling {@link #xrGetSpaceRoomLayoutFB GetSpaceRoomLayoutFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
     * <li>{@code roomLayoutOutput} <b>must</b> be a pointer to an {@link XrRoomLayoutFB} structure</li>
     * <li>{@code space} <b>must</b> have been created, allocated, or retrieved from {@code session}</li>
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
     * <p>{@link XrRoomLayoutFB}</p>
     *
     * @param session          a handle to an {@code XrSession}.
     * @param space            the {@code XrSpace} handle to the spatial entity.
     * @param roomLayoutOutput an output parameter pointing to the structure containing the {@link XrRoomLayoutFB} for {@code space}.
     */
    @NativeType("XrResult")
    public static int xrGetSpaceRoomLayoutFB(XrSession session, XrSpace space, @NativeType("XrRoomLayoutFB *") XrRoomLayoutFB roomLayoutOutput) {
        return nxrGetSpaceRoomLayoutFB(session, space, roomLayoutOutput.address());
    }

}