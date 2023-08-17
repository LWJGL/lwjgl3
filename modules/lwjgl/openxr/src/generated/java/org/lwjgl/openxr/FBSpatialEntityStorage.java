/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_spatial_entity_storage">XR_FB_spatial_entity_storage</a> extension.
 * 
 * <p>This extension enables spatial entities to be stored and persisted across sessions. If the {@link FBSpatialEntity#XR_SPACE_COMPONENT_TYPE_STORABLE_FB SPACE_COMPONENT_TYPE_STORABLE_FB} component has been enabled on the spatial entity, application developers <b>may</b> save, load, and erase persisted {@code XrSpace} entities.</p>
 * 
 * <p>In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into {@link XR10#xrCreateInstance CreateInstance} via the {@link XrInstanceCreateInfo}{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#extensions">extensions</a> section.</p>
 */
public class FBSpatialEntityStorage {

    /** The extension specification version. */
    public static final int XR_FB_spatial_entity_storage_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_SPATIAL_ENTITY_STORAGE_EXTENSION_NAME = "XR_FB_spatial_entity_storage";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SPACE_SAVE_INFO_FB TYPE_SPACE_SAVE_INFO_FB}</li>
     * <li>{@link #XR_TYPE_SPACE_ERASE_INFO_FB TYPE_SPACE_ERASE_INFO_FB}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_SPACE_SAVE_COMPLETE_FB TYPE_EVENT_DATA_SPACE_SAVE_COMPLETE_FB}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_SPACE_ERASE_COMPLETE_FB TYPE_EVENT_DATA_SPACE_ERASE_COMPLETE_FB}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SPACE_SAVE_INFO_FB                 = 1000158000,
        XR_TYPE_SPACE_ERASE_INFO_FB                = 1000158001,
        XR_TYPE_EVENT_DATA_SPACE_SAVE_COMPLETE_FB  = 1000158106,
        XR_TYPE_EVENT_DATA_SPACE_ERASE_COMPLETE_FB = 1000158107;

    /**
     * XrSpacePersistenceModeFB - Persistence mode
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@code XrSpacePersistenceModeFB} enumeration specifies the persistence mode for the save operation.</p>
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_SPACE_PERSISTENCE_MODE_INVALID_FB SPACE_PERSISTENCE_MODE_INVALID_FB} — Invalid storage persistence</li>
     * <li>{@link #XR_SPACE_PERSISTENCE_MODE_INDEFINITE_FB SPACE_PERSISTENCE_MODE_INDEFINITE_FB} — Store {@code XrSpace} indefinitely, or until erased</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpaceSaveInfoFB}</p>
     */
    public static final int
        XR_SPACE_PERSISTENCE_MODE_INVALID_FB    = 0,
        XR_SPACE_PERSISTENCE_MODE_INDEFINITE_FB = 1;

    protected FBSpatialEntityStorage() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSaveSpaceFB ] ---

    /** Unsafe version of: {@link #xrSaveSpaceFB SaveSpaceFB} */
    public static int nxrSaveSpaceFB(XrSession session, long info, long requestId) {
        long __functionAddress = session.getCapabilities().xrSaveSpaceFB;
        if (CHECKS) {
            check(__functionAddress);
            XrSpaceSaveInfoFB.validate(info);
        }
        return callPPPI(session.address(), info, requestId, __functionAddress);
    }

    /**
     * Saves a spatial entity to persistent storage.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrSaveSpaceFB SaveSpaceFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrSaveSpaceFB(
     *     XrSession                                   session,
     *     const XrSpaceSaveInfoFB*                    info,
     *     XrAsyncRequestIdFB*                         requestId);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrSaveSpaceFB SaveSpaceFB} function persists the spatial entity at the specified location with the specified mode. The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if {@link XrSpaceSaveInfoFB}{@code ::space} is {@link XR10#XR_NULL_HANDLE NULL_HANDLE} or otherwise invalid. The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if {@link XrSpaceSaveInfoFB}{@code ::location} or {@link XrSpaceSaveInfoFB}{@code ::persistenceMode} is invalid. This operation is asynchronous and the runtime <b>must</b> post an {@link XrEventDataSpaceSaveCompleteFB} event when the operation completes successfully or encounters an error. If this function returns a failure code, no event is posted.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBSpatialEntityStorage XR_FB_spatial_entity_storage} extension <b>must</b> be enabled prior to calling {@link #xrSaveSpaceFB SaveSpaceFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code info} <b>must</b> be a pointer to a valid {@link XrSpaceSaveInfoFB} structure</li>
     * <li>{@code requestId} <b>must</b> be a pointer to an {@code XrAsyncRequestIdFB} value</li>
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
     * <p>{@link XrSpaceSaveInfoFB}, {@link #xrEraseSpaceFB EraseSpaceFB}</p>
     *
     * @param session   a handle to an {@code XrSession}.
     * @param info      contains the parameters for the save operation.
     * @param requestId an output parameter, and the variable it points to will be populated with the ID of this asynchronous request.
     */
    @NativeType("XrResult")
    public static int xrSaveSpaceFB(XrSession session, @NativeType("XrSpaceSaveInfoFB const *") XrSpaceSaveInfoFB info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrSaveSpaceFB(session, info.address(), memAddress(requestId));
    }

    // --- [ xrEraseSpaceFB ] ---

    /** Unsafe version of: {@link #xrEraseSpaceFB EraseSpaceFB} */
    public static int nxrEraseSpaceFB(XrSession session, long info, long requestId) {
        long __functionAddress = session.getCapabilities().xrEraseSpaceFB;
        if (CHECKS) {
            check(__functionAddress);
            XrSpaceEraseInfoFB.validate(info);
        }
        return callPPPI(session.address(), info, requestId, __functionAddress);
    }

    /**
     * Erases a spatial entity from persistent storage.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrEraseSpaceFB EraseSpaceFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrEraseSpaceFB(
     *     XrSession                                   session,
     *     const XrSpaceEraseInfoFB*                   info,
     *     XrAsyncRequestIdFB*                         requestId);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrEraseSpaceFB EraseSpaceFB} function erases a spatial entity from storage at the specified location. The {@code XrSpace} remains valid in the current session until the application destroys it or the session ends. The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if {@link XrSpaceEraseInfoFB}{@code ::space} is {@link XR10#XR_NULL_HANDLE NULL_HANDLE} or otherwise invalid. The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if {@link XrSpaceEraseInfoFB}{@code ::location} is invalid. This operation is asynchronous and the runtime <b>must</b> post an {@link XrEventDataSpaceEraseCompleteFB} event when the operation completes successfully or encounters an error. If this function returns a failure code, no event is posted.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBSpatialEntityStorage XR_FB_spatial_entity_storage} extension <b>must</b> be enabled prior to calling {@link #xrEraseSpaceFB EraseSpaceFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code info} <b>must</b> be a pointer to a valid {@link XrSpaceEraseInfoFB} structure</li>
     * <li>{@code requestId} <b>must</b> be a pointer to an {@code XrAsyncRequestIdFB} value</li>
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
     * <p>{@link XrSpaceEraseInfoFB}, {@link #xrSaveSpaceFB SaveSpaceFB}</p>
     *
     * @param session   a handle to an {@code XrSession}.
     * @param info      contains the parameters for the erase operation.
     * @param requestId an output parameter, and the variable it points to will be populated with the ID of this asynchronous request.
     */
    @NativeType("XrResult")
    public static int xrEraseSpaceFB(XrSession session, @NativeType("XrSpaceEraseInfoFB const *") XrSpaceEraseInfoFB info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrEraseSpaceFB(session, info.address(), memAddress(requestId));
    }

}