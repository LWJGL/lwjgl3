/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_spatial_entity_storage = "FBSpatialEntityStorage".nativeClassXR("FB_spatial_entity_storage", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_spatial_entity_storage">XR_FB_spatial_entity_storage</a> extension.

        This extension enables spatial entities to be stored and persisted across sessions. If the #SPACE_COMPONENT_TYPE_STORABLE_FB component has been enabled on the spatial entity, application developers <b>may</b> save, load, and erase persisted {@code XrSpace} entities.

        In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into #CreateInstance() via the ##XrInstanceCreateInfo{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#extensions">extensions</a> section.
        """

    IntConstant(
        "The extension specification version.",

        "FB_spatial_entity_storage_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_SPATIAL_ENTITY_STORAGE_EXTENSION_NAME".."XR_FB_spatial_entity_storage"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SPACE_SAVE_INFO_FB".."1000158000",
        "TYPE_SPACE_ERASE_INFO_FB".."1000158001",
        "TYPE_EVENT_DATA_SPACE_SAVE_COMPLETE_FB".."1000158106",
        "TYPE_EVENT_DATA_SPACE_ERASE_COMPLETE_FB".."1000158107"
    )

    EnumConstant(
        """
        XrSpacePersistenceModeFB - Persistence mode

        <h5>Description</h5>
        The {@code XrSpacePersistenceModeFB} enumeration specifies the persistence mode for the save operation.

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#SPACE_PERSISTENCE_MODE_INVALID_FB — Invalid storage persistence</li>
            <li>#SPACE_PERSISTENCE_MODE_INDEFINITE_FB — Store {@code XrSpace} indefinitely, or until erased</li>
        </ul>

        <h5>See Also</h5>
        ##XrSpaceSaveInfoFB
        """,

        "SPACE_PERSISTENCE_MODE_INVALID_FB".."0",
        "SPACE_PERSISTENCE_MODE_INDEFINITE_FB".."1"
    )

    XrResult(
        "SaveSpaceFB",
        """
        Saves a spatial entity to persistent storage.

        <h5>C Specification</h5>
        The #SaveSpaceFB() function is defined as:

        <pre><code>
￿XrResult xrSaveSpaceFB(
￿    XrSession                                   session,
￿    const XrSpaceSaveInfoFB*                    info,
￿    XrAsyncRequestIdFB*                         requestId);</code></pre>

        <h5>Description</h5>
        The #SaveSpaceFB() function persists the spatial entity at the specified location with the specified mode. The runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if ##XrSpaceSaveInfoFB{@code ::space} is #NULL_HANDLE or otherwise invalid. The runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if ##XrSpaceSaveInfoFB{@code ::location} or ##XrSpaceSaveInfoFB{@code ::persistenceMode} is invalid. This operation is asynchronous and the runtime <b>must</b> post an ##XrEventDataSpaceSaveCompleteFB event when the operation completes successfully or encounters an error. If this function returns a failure code, no event is posted.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityStorage XR_FB_spatial_entity_storage} extension <b>must</b> be enabled prior to calling #SaveSpaceFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code info} <b>must</b> be a pointer to a valid ##XrSpaceSaveInfoFB structure</li>
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
                <li>#ERROR_SPACE_COMPONENT_NOT_ENABLED_FB</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpaceSaveInfoFB, #EraseSpaceFB()
        """,

        XrSession("session", "a handle to an {@code XrSession}."),
        XrSpaceSaveInfoFB.const.p("info", "contains the parameters for the save operation."),
        Check(1)..XrAsyncRequestIdFB.p("requestId", "an output parameter, and the variable it points to will be populated with the ID of this asynchronous request.")
    )

    XrResult(
        "EraseSpaceFB",
        """
        Erases a spatial entity from persistent storage.

        <h5>C Specification</h5>
        The #EraseSpaceFB() function is defined as:

        <pre><code>
￿XrResult xrEraseSpaceFB(
￿    XrSession                                   session,
￿    const XrSpaceEraseInfoFB*                   info,
￿    XrAsyncRequestIdFB*                         requestId);</code></pre>

        <h5>Description</h5>
        The #EraseSpaceFB() function erases a spatial entity from storage at the specified location. The {@code XrSpace} remains valid in the current session until the application destroys it or the session ends. The runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if ##XrSpaceEraseInfoFB{@code ::space} is #NULL_HANDLE or otherwise invalid. The runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if ##XrSpaceEraseInfoFB{@code ::location} is invalid. This operation is asynchronous and the runtime <b>must</b> post an ##XrEventDataSpaceEraseCompleteFB event when the operation completes successfully or encounters an error. If this function returns a failure code, no event is posted.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityStorage XR_FB_spatial_entity_storage} extension <b>must</b> be enabled prior to calling #EraseSpaceFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code info} <b>must</b> be a pointer to a valid ##XrSpaceEraseInfoFB structure</li>
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
                <li>#ERROR_SPACE_COMPONENT_NOT_ENABLED_FB</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpaceEraseInfoFB, #SaveSpaceFB()
        """,

        XrSession("session", "a handle to an {@code XrSession}."),
        XrSpaceEraseInfoFB.const.p("info", "contains the parameters for the erase operation."),
        Check(1)..XrAsyncRequestIdFB.p("requestId", "an output parameter, and the variable it points to will be populated with the ID of this asynchronous request.")
    )
}