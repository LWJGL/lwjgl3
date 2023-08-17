/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_spatial_entity_sharing = "FBSpatialEntitySharing".nativeClassXR("FB_spatial_entity_sharing", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_spatial_entity_sharing">XR_FB_spatial_entity_sharing</a> extension.

        This extension enables spatial entities to be shared between users. If the #SPACE_COMPONENT_TYPE_SHARABLE_FB component has been enabled on the spatial entity, application developers <b>may</b> share {@code XrSpace} entities between users.

        In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into #CreateInstance() via the ##XrInstanceCreateInfo{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#extensions">extensions</a> section.
        """

    IntConstant(
        "The extension specification version.",

        "FB_spatial_entity_sharing_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_SPATIAL_ENTITY_SHARING_EXTENSION_NAME".."XR_FB_spatial_entity_sharing"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SPACE_SHARE_INFO_FB".."1000169001",
        "TYPE_EVENT_DATA_SPACE_SHARE_COMPLETE_FB".."1000169002"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_SPACE_MAPPING_INSUFFICIENT_FB".."-1000169000",
        "ERROR_SPACE_LOCALIZATION_FAILED_FB".."-1000169001",
        "ERROR_SPACE_NETWORK_TIMEOUT_FB".."-1000169002",
        "ERROR_SPACE_NETWORK_REQUEST_FAILED_FB".."-1000169003",
        "ERROR_SPACE_CLOUD_STORAGE_DISABLED_FB".."-1000169004"
    )

    XrResult(
        "ShareSpacesFB",
        """
        Shares spatial entities with specified users.

        <h5>C Specification</h5>
        The #ShareSpacesFB() function is defined as:

        <pre><code>
￿XrResult xrShareSpacesFB(
￿    XrSession                                   session,
￿    const XrSpaceShareInfoFB*                   info,
￿    XrAsyncRequestIdFB*                         requestId);</code></pre>

        <h5>Description</h5>
        This operation is asynchronous and the runtime <b>must</b> post an ##XrEventDataSpaceShareCompleteFB event when the operation completes successfully or encounters an error. If this function returns a failure code, no event is posted. The {@code requestId} <b>can</b> be used to later refer to the request, such as identifying which request has completed when an ##XrEventDataSpaceShareCompleteFB is posted to the event queue.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntitySharing XR_FB_spatial_entity_sharing} extension <b>must</b> be enabled prior to calling #ShareSpacesFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code info} <b>must</b> be a pointer to a valid ##XrSpaceShareInfoFB structure</li>
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
        ##XrSpaceShareInfoFB
        """,

        XrSession("session", "a handle to an {@code XrSession}."),
        XrSpaceShareInfoFB.const.p("info", "a pointer to an ##XrSpaceShareInfoFB structure containing information about which spatial entities to share with which users."),
        Check(1)..XrAsyncRequestIdFB.p("requestId", "the output parameter that points to the ID of this asynchronous request.")
    )
}