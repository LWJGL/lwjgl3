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
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#XR_META_spatial_entity_sharing">XR_META_spatial_entity_sharing</a> extension.
 * 
 * <p>The {@link METASpatialEntitySharing XR_META_spatial_entity_sharing} extension enables applications to share spatial entities.</p>
 * 
 * <p>This base extension provides a generic space sharing endpoint. This extension depends on other extensions (such as {@link METASpatialEntityGroupSharing XR_META_spatial_entity_group_sharing}) to define concrete "recipient info" structures, which are passed into the generic endpoint introduced in this extension.</p>
 * 
 * <p>The scope/lifetime of the sharing action is dependent on the recipient type of the sharing. Therefore, the scope/lifetime of the sharing action is defined in the extensions which provide concrete "recipient info" structures.</p>
 * 
 * <p>{@link METASpatialEntitySharing XR_META_spatial_entity_sharing} is a more generic and extendable alternative to {@link FBSpatialEntitySharing XR_FB_spatial_entity_sharing} (which is tightly coupled with {@code XrSpaceUserFB}).</p>
 */
public class METASpatialEntitySharing {

    /** The extension specification version. */
    public static final int XR_META_spatial_entity_sharing_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_META_SPATIAL_ENTITY_SHARING_EXTENSION_NAME = "XR_META_spatial_entity_sharing";

    /** XR_MAX_SPACES_PER_SHARE_REQUEST_META */
    public static final int XR_MAX_SPACES_PER_SHARE_REQUEST_META = 32;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SYSTEM_SPATIAL_ENTITY_SHARING_PROPERTIES_META TYPE_SYSTEM_SPATIAL_ENTITY_SHARING_PROPERTIES_META}</li>
     * <li>{@link #XR_TYPE_SHARE_SPACES_INFO_META TYPE_SHARE_SPACES_INFO_META}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_SHARE_SPACES_COMPLETE_META TYPE_EVENT_DATA_SHARE_SPACES_COMPLETE_META}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SYSTEM_SPATIAL_ENTITY_SHARING_PROPERTIES_META = 1000290000,
        XR_TYPE_SHARE_SPACES_INFO_META                        = 1000290001,
        XR_TYPE_EVENT_DATA_SHARE_SPACES_COMPLETE_META         = 1000290002;

    protected METASpatialEntitySharing() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrShareSpacesMETA ] ---

    /** Unsafe version of: {@link #xrShareSpacesMETA ShareSpacesMETA} */
    public static int nxrShareSpacesMETA(XrSession session, long info, long requestId) {
        long __functionAddress = session.getCapabilities().xrShareSpacesMETA;
        if (CHECKS) {
            check(__functionAddress);
            XrShareSpacesInfoMETA.validate(info);
        }
        return callPPPI(session.address(), info, requestId, __functionAddress);
    }

    /**
     * Share a spatial entity.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrShareSpacesMETA ShareSpacesMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrShareSpacesMETA(
     *     XrSession                                   session,
     *     const XrShareSpacesInfoMETA*                info,
     *     XrAsyncRequestIdFB*                         requestId);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The application <b>may</b> use the {@link #xrShareSpacesMETA ShareSpacesMETA} function to share spaces ({@code XrSpace}) if the {@link FBSpatialEntity#XR_SPACE_COMPONENT_TYPE_SHARABLE_FB SPACE_COMPONENT_TYPE_SHARABLE_FB} component has been enabled on the space.</p>
     * 
     * <p>This is an asynchronous operation. Completion results are conveyed in the event {@link XrEventDataShareSpacesCompleteMETA}.</p>
     * 
     * <p>If the asynchronous operation is scheduled successfully, the runtime <b>must</b> return {@link XR10#XR_SUCCESS SUCCESS}.</p>
     * 
     * <p>If and only if the runtime returns {@link XR10#XR_SUCCESS SUCCESS}, the runtime <b>must</b> queue a single {@link XrEventDataShareSpacesCompleteMETA} event identified with a {@code requestId} field matching the value output by this function, referred to as the "corresponding completion event."</p>
     * 
     * <p>(If the runtime returns anything other than {@link XR10#XR_SUCCESS SUCCESS}, the runtime <b>must</b> not queue any {@link XrEventDataShareSpacesCompleteMETA} events with {@code requestId} field matching the {@code requestId} populated by this function.)</p>
     * 
     * <p>If the asynchronous operation is successful, the runtime <b>must</b> set the {@link XrEventDataShareSpacesCompleteMETA}{@code ::result} field to {@link XR10#XR_SUCCESS SUCCESS} in the corresponding completion event.</p>
     * 
     * <p>If the asynchronous operation is scheduled but not successful, in the corresponding completion event, the runtime <b>must</b> set the {@link XrEventDataShareSpacesCompleteMETA}{@code ::result} field to an appropriate error code instead of {@link XR10#XR_SUCCESS SUCCESS}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METASpatialEntitySharing XR_META_spatial_entity_sharing} extension <b>must</b> be enabled prior to calling {@link #xrShareSpacesMETA ShareSpacesMETA}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code info} <b>must</b> be a pointer to a valid {@link XrShareSpacesInfoMETA} structure</li>
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
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrShareSpacesInfoMETA}</p>
     *
     * @param session   an {@code XrSession} in which the spatial entity will be active.
     * @param info      a pointer to {@link XrShareSpacesInfoMETA} structure to specify the spatial entity sharing details.
     * @param requestId a pointer to an {@code XrAsyncRequestIdFB} variable in which the generated async request ID will be stored. It is used to identify the corresponding {@link XrEventDataShareSpacesCompleteMETA} completion event.
     */
    @NativeType("XrResult")
    public static int xrShareSpacesMETA(XrSession session, @NativeType("XrShareSpacesInfoMETA const *") XrShareSpacesInfoMETA info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrShareSpacesMETA(session, info.address(), memAddress(requestId));
    }

}