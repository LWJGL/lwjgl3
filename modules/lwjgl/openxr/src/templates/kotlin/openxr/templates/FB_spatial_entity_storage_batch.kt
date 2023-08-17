/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_spatial_entity_storage_batch = "FBSpatialEntityStorageBatch".nativeClassXR("FB_spatial_entity_storage_batch", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_spatial_entity_storage_batch">XR_FB_spatial_entity_storage_batch</a> extension.

        This extension enables multiple spatial entities at a time to be persisted across sessions. If the #SPACE_COMPONENT_TYPE_STORABLE_FB component has been enabled on the spatial entity, application developers <b>may</b> save and erase {@code XrSpace} entities.

        In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into #CreateInstance() via the ##XrInstanceCreateInfo{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#extensions">extensions</a> section.
        """

    IntConstant(
        "The extension specification version.",

        "FB_spatial_entity_storage_batch_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_SPATIAL_ENTITY_STORAGE_BATCH_EXTENSION_NAME".."XR_FB_spatial_entity_storage_batch"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SPACE_LIST_SAVE_INFO_FB".."1000238000",
        "TYPE_EVENT_DATA_SPACE_LIST_SAVE_COMPLETE_FB".."1000238001"
    )

    XrResult(
        "SaveSpaceListFB",
        """
        Saves a list of spatial entities to persistent storage.

        <h5>C Specification</h5>
        The #SaveSpaceListFB() function is defined as:

        <pre><code>
￿XrResult xrSaveSpaceListFB(
￿    XrSession                                   session,
￿    const XrSpaceListSaveInfoFB*                info,
￿    XrAsyncRequestIdFB*                         requestId);</code></pre>

        <h5>Description</h5>
        The #SaveSpaceListFB() function persists the specified spatial entities at the specified storage location. The runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if ##XrSpaceSaveInfoFB{@code ::location} is invalid. This operation is asynchronous and the runtime <b>must</b> post an ##XrEventDataSpaceListSaveCompleteFB event when the operation completes successfully or encounters an error. If this function returns a failure code, no event is posted.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityStorageBatch XR_FB_spatial_entity_storage_batch} extension <b>must</b> be enabled prior to calling #SaveSpaceListFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code info} <b>must</b> be a pointer to a valid ##XrSpaceListSaveInfoFB structure</li>
            <li>{@code requestId} <b>must</b> be a pointer to an {@code XrAsyncRequestIdFB} value</li>
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
                <li>#ERROR_SPACE_NETWORK_TIMEOUT_FB</li>
                <li>#ERROR_SPACE_NETWORK_REQUEST_FAILED_FB</li>
                <li>#ERROR_SPACE_MAPPING_INSUFFICIENT_FB</li>
                <li>#ERROR_SPACE_LOCALIZATION_FAILED_FB</li>
                <li>#ERROR_SPACE_COMPONENT_NOT_ENABLED_FB</li>
                <li>#ERROR_SPACE_CLOUD_STORAGE_DISABLED_FB</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpaceListSaveInfoFB
        """,

        XrSession("session", "a handle to an {@code XrSession}."),
        XrSpaceListSaveInfoFB.const.p("info", "contains the parameters for the save operation."),
        Check(1)..XrAsyncRequestIdFB.p("requestId", "an output parameter, and the variable it points to will be populated with the ID of this asynchronous request.")
    )
}