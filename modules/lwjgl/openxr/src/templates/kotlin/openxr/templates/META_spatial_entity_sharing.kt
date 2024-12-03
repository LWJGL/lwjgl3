/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_spatial_entity_sharing = "METASpatialEntitySharing".nativeClassXR("META_spatial_entity_sharing", type = "instance", postfix = "META") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#XR_META_spatial_entity_sharing">XR_META_spatial_entity_sharing</a> extension.

        The {@link METASpatialEntitySharing XR_META_spatial_entity_sharing} extension enables applications to share spatial entities.

        This base extension provides a generic space sharing endpoint. This extension depends on other extensions (such as {@link METASpatialEntityGroupSharing XR_META_spatial_entity_group_sharing}) to define concrete "recipient info" structures, which are passed into the generic endpoint introduced in this extension.

        The scope/lifetime of the sharing action is dependent on the recipient type of the sharing. Therefore, the scope/lifetime of the sharing action is defined in the extensions which provide concrete "recipient info" structures.

        {@link METASpatialEntitySharing XR_META_spatial_entity_sharing} is a more generic and extendable alternative to {@link FBSpatialEntitySharing XR_FB_spatial_entity_sharing} (which is tightly coupled with {@code XrSpaceUserFB}).
        """

    IntConstant(
        "The extension specification version.",

        "META_spatial_entity_sharing_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "META_SPATIAL_ENTITY_SHARING_EXTENSION_NAME".."XR_META_spatial_entity_sharing"
    )

    EnumConstant(
        "XR_MAX_SPACES_PER_SHARE_REQUEST_META",

        "MAX_SPACES_PER_SHARE_REQUEST_META".."32"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SYSTEM_SPATIAL_ENTITY_SHARING_PROPERTIES_META".."1000290000",
        "TYPE_SHARE_SPACES_INFO_META".."1000290001",
        "TYPE_EVENT_DATA_SHARE_SPACES_COMPLETE_META".."1000290002"
    )

    XrResult(
        "ShareSpacesMETA",
        """
        Share a spatial entity.

        <h5>C Specification</h5>
        The #ShareSpacesMETA() function is defined as:

        <pre><code>
￿XrResult xrShareSpacesMETA(
￿    XrSession                                   session,
￿    const XrShareSpacesInfoMETA*                info,
￿    XrAsyncRequestIdFB*                         requestId);</code></pre>

        <h5>Description</h5>
        The application <b>may</b> use the #ShareSpacesMETA() function to share spaces ({@code XrSpace}) if the #SPACE_COMPONENT_TYPE_SHARABLE_FB component has been enabled on the space.

        This is an asynchronous operation. Completion results are conveyed in the event ##XrEventDataShareSpacesCompleteMETA.

        If the asynchronous operation is scheduled successfully, the runtime <b>must</b> return #SUCCESS.

        If and only if the runtime returns #SUCCESS, the runtime <b>must</b> queue a single ##XrEventDataShareSpacesCompleteMETA event identified with a {@code requestId} field matching the value output by this function, referred to as the "corresponding completion event."

        (If the runtime returns anything other than #SUCCESS, the runtime <b>must</b> not queue any ##XrEventDataShareSpacesCompleteMETA events with {@code requestId} field matching the {@code requestId} populated by this function.)

        If the asynchronous operation is successful, the runtime <b>must</b> set the ##XrEventDataShareSpacesCompleteMETA{@code ::result} field to #SUCCESS in the corresponding completion event.

        If the asynchronous operation is scheduled but not successful, in the corresponding completion event, the runtime <b>must</b> set the ##XrEventDataShareSpacesCompleteMETA{@code ::result} field to an appropriate error code instead of #SUCCESS.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METASpatialEntitySharing XR_META_spatial_entity_sharing} extension <b>must</b> be enabled prior to calling #ShareSpacesMETA()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code info} <b>must</b> be a pointer to a valid ##XrShareSpacesInfoMETA structure</li>
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
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrShareSpacesInfoMETA
        """,

        XrSession("session", "an {@code XrSession} in which the spatial entity will be active."),
        XrShareSpacesInfoMETA.const.p("info", "a pointer to ##XrShareSpacesInfoMETA structure to specify the spatial entity sharing details."),
        Check(1)..XrAsyncRequestIdFB.p("requestId", "a pointer to an {@code XrAsyncRequestIdFB} variable in which the generated async request ID will be stored. It is used to identify the corresponding ##XrEventDataShareSpacesCompleteMETA completion event.")
    )
}