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
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_spatial_entity_sharing">XR_FB_spatial_entity_sharing</a> extension.
 * 
 * <p>This extension enables spatial entities to be shared between users. If the {@link FBSpatialEntity#XR_SPACE_COMPONENT_TYPE_SHARABLE_FB SPACE_COMPONENT_TYPE_SHARABLE_FB} component has been enabled on the spatial entity, application developers <b>may</b> share {@code XrSpace} entities between users.</p>
 * 
 * <p>In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into {@link XR10#xrCreateInstance CreateInstance} via the {@link XrInstanceCreateInfo}{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#extensions">extensions</a> section.</p>
 */
public class FBSpatialEntitySharing {

    /** The extension specification version. */
    public static final int XR_FB_spatial_entity_sharing_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_SPATIAL_ENTITY_SHARING_EXTENSION_NAME = "XR_FB_spatial_entity_sharing";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SPACE_SHARE_INFO_FB TYPE_SPACE_SHARE_INFO_FB}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_SPACE_SHARE_COMPLETE_FB TYPE_EVENT_DATA_SPACE_SHARE_COMPLETE_FB}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SPACE_SHARE_INFO_FB                = 1000169001,
        XR_TYPE_EVENT_DATA_SPACE_SHARE_COMPLETE_FB = 1000169002;

    /**
     * Extends {@code XrResult}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_ERROR_SPACE_MAPPING_INSUFFICIENT_FB ERROR_SPACE_MAPPING_INSUFFICIENT_FB}</li>
     * <li>{@link #XR_ERROR_SPACE_LOCALIZATION_FAILED_FB ERROR_SPACE_LOCALIZATION_FAILED_FB}</li>
     * <li>{@link #XR_ERROR_SPACE_NETWORK_TIMEOUT_FB ERROR_SPACE_NETWORK_TIMEOUT_FB}</li>
     * <li>{@link #XR_ERROR_SPACE_NETWORK_REQUEST_FAILED_FB ERROR_SPACE_NETWORK_REQUEST_FAILED_FB}</li>
     * <li>{@link #XR_ERROR_SPACE_CLOUD_STORAGE_DISABLED_FB ERROR_SPACE_CLOUD_STORAGE_DISABLED_FB}</li>
     * </ul>
     */
    public static final int
        XR_ERROR_SPACE_MAPPING_INSUFFICIENT_FB   = -1000169000,
        XR_ERROR_SPACE_LOCALIZATION_FAILED_FB    = -1000169001,
        XR_ERROR_SPACE_NETWORK_TIMEOUT_FB        = -1000169002,
        XR_ERROR_SPACE_NETWORK_REQUEST_FAILED_FB = -1000169003,
        XR_ERROR_SPACE_CLOUD_STORAGE_DISABLED_FB = -1000169004;

    protected FBSpatialEntitySharing() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrShareSpacesFB ] ---

    /** Unsafe version of: {@link #xrShareSpacesFB ShareSpacesFB} */
    public static int nxrShareSpacesFB(XrSession session, long info, long requestId) {
        long __functionAddress = session.getCapabilities().xrShareSpacesFB;
        if (CHECKS) {
            check(__functionAddress);
            XrSpaceShareInfoFB.validate(info);
        }
        return callPPPI(session.address(), info, requestId, __functionAddress);
    }

    /**
     * Shares spatial entities with specified users.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrShareSpacesFB ShareSpacesFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrShareSpacesFB(
     *     XrSession                                   session,
     *     const XrSpaceShareInfoFB*                   info,
     *     XrAsyncRequestIdFB*                         requestId);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This operation is asynchronous and the runtime <b>must</b> post an {@link XrEventDataSpaceShareCompleteFB} event when the operation completes successfully or encounters an error. If this function returns a failure code, no event is posted. The {@code requestId} <b>can</b> be used to later refer to the request, such as identifying which request has completed when an {@link XrEventDataSpaceShareCompleteFB} is posted to the event queue.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBSpatialEntitySharing XR_FB_spatial_entity_sharing} extension <b>must</b> be enabled prior to calling {@link #xrShareSpacesFB ShareSpacesFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code info} <b>must</b> be a pointer to a valid {@link XrSpaceShareInfoFB} structure</li>
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
     * <li>{@link #XR_ERROR_SPACE_NETWORK_TIMEOUT_FB ERROR_SPACE_NETWORK_TIMEOUT_FB}</li>
     * <li>{@link #XR_ERROR_SPACE_NETWORK_REQUEST_FAILED_FB ERROR_SPACE_NETWORK_REQUEST_FAILED_FB}</li>
     * <li>{@link #XR_ERROR_SPACE_MAPPING_INSUFFICIENT_FB ERROR_SPACE_MAPPING_INSUFFICIENT_FB}</li>
     * <li>{@link #XR_ERROR_SPACE_LOCALIZATION_FAILED_FB ERROR_SPACE_LOCALIZATION_FAILED_FB}</li>
     * <li>{@link FBSpatialEntity#XR_ERROR_SPACE_COMPONENT_NOT_ENABLED_FB ERROR_SPACE_COMPONENT_NOT_ENABLED_FB}</li>
     * <li>{@link #XR_ERROR_SPACE_CLOUD_STORAGE_DISABLED_FB ERROR_SPACE_CLOUD_STORAGE_DISABLED_FB}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpaceShareInfoFB}</p>
     *
     * @param session   a handle to an {@code XrSession}.
     * @param info      a pointer to an {@link XrSpaceShareInfoFB} structure containing information about which spatial entities to share with which users.
     * @param requestId the output parameter that points to the ID of this asynchronous request.
     */
    @NativeType("XrResult")
    public static int xrShareSpacesFB(XrSession session, @NativeType("XrSpaceShareInfoFB const *") XrSpaceShareInfoFB info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrShareSpacesFB(session, info.address(), memAddress(requestId));
    }

}