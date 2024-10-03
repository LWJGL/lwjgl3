/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ML_spatial_anchors_storage = "MLSpatialAnchorsStorage".nativeClassXR("ML_spatial_anchors_storage", type = "instance", postfix = "ML") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#XR_ML_spatial_anchors_storage">XR_ML_spatial_anchors_storage</a> extension.

        This extension allows spatial anchors created by {@link MLSpatialAnchors XR_ML_spatial_anchors} to be persisted beyond the head pose session.

        Spatial anchor management is closely tied to the selected mapping mode on the device. The modes are mutually exclusive and affect the functionality of these APIs. The available mapping modes are:

        <dl>
            <dt>On-Device Mode</dt>
            <dd>A persistent mode in which anchors are persisted locally and will be available across multiple sessions when localized to the same localization map in which they were published.</dd>

            <dt>AR Cloud Mode</dt>
            <dd>A persistent mode in which anchors are persisted in the cloud environment and will be available across multiple sessions and across multiple devices that are localized to the same localization map in which they were published.</dd>
        </dl>

        For more details on mapping modes refer to the {@link MLLocalizationMap XR_ML_localization_map} extension.

        <h5>Permissions</h5>
        Android applications <b>must</b> have the com.magicleap.permission.SPATIAL_ANCHOR permission listed in their manifest to use this extension. (protection level: normal)
        """

    IntConstant(
        "The extension specification version.",

        "ML_spatial_anchors_storage_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "ML_SPATIAL_ANCHORS_STORAGE_EXTENSION_NAME".."XR_ML_spatial_anchors_storage"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_SPATIAL_ANCHORS_STORAGE_ML".."1000141000"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_SPATIAL_ANCHORS_ANCHOR_NOT_FOUND_ML".."-1000141000"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SPATIAL_ANCHORS_CREATE_STORAGE_INFO_ML".."1000141000",
        "TYPE_SPATIAL_ANCHORS_QUERY_INFO_RADIUS_ML".."1000141001",
        "TYPE_SPATIAL_ANCHORS_QUERY_COMPLETION_ML".."1000141002",
        "TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_UUIDS_ML".."1000141003",
        "TYPE_SPATIAL_ANCHORS_PUBLISH_INFO_ML".."1000141004",
        "TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_ML".."1000141005",
        "TYPE_SPATIAL_ANCHORS_DELETE_INFO_ML".."1000141006",
        "TYPE_SPATIAL_ANCHORS_DELETE_COMPLETION_ML".."1000141007",
        "TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_INFO_ML".."1000141008",
        "TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_ML".."1000141009",
        "TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_DETAILS_ML".."1000141010",
        "TYPE_SPATIAL_ANCHORS_DELETE_COMPLETION_DETAILS_ML".."1000141011",
        "TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_DETAILS_ML".."1000141012"
    )

    XrResult(
        "CreateSpatialAnchorsStorageML",
        """
        Create spatial anchors storage connection.

        <h5>C Specification</h5>
        The #CreateSpatialAnchorsStorageML() function is defined as:

        <pre><code>
￿XrResult xrCreateSpatialAnchorsStorageML(
￿    XrSession                                   session,
￿    const XrSpatialAnchorsCreateStorageInfoML*  createInfo,
￿    XrSpatialAnchorsStorageML*                  storage);</code></pre>

        <h5>Description</h5>
        The #CreateSpatialAnchorsStorageML() function is used to create a {@code XrSpatialAnchorsStorageML}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to calling #CreateSpatialAnchorsStorageML()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrSpatialAnchorsCreateStorageInfoML structure</li>
            <li>{@code storage} <b>must</b> be a pointer to an {@code XrSpatialAnchorsStorageML} handle</li>
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
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_SPATIAL_ANCHORS_PERMISSION_DENIED_ML</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpatialAnchorsCreateStorageInfoML
        """,

        XrSession("session", "a handle to an {@code XrSession} previously created with #CreateSession()."),
        XrSpatialAnchorsCreateStorageInfoML.const.p("createInfo", "a pointer to an ##XrSpatialAnchorsCreateInfoBaseHeaderML derived structure."),
        Check(1)..XrSpatialAnchorsStorageML.p("storage", "a pointer to an {@code XrSpatialAnchorsStorageML} where the created storage is returned.")
    )

    XrResult(
        "DestroySpatialAnchorsStorageML",
        """
        Destroy spatial anchors storage.

        <h5>C Specification</h5>
        The #DestroySpatialAnchorsStorageML() function is defined as:

        <pre><code>
￿XrResult xrDestroySpatialAnchorsStorageML(
￿    XrSpatialAnchorsStorageML                   storage);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to calling #DestroySpatialAnchorsStorageML()</li>
            <li>{@code storage} <b>must</b> be a valid {@code XrSpatialAnchorsStorageML} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code storage}, and any child handles, <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #CreateSpatialAnchorsStorageML()
        """,

        XrSpatialAnchorsStorageML("storage", "the {@code XrSpatialAnchorsStorageML} to destroy.")
    )

    XrResult(
        "QuerySpatialAnchorsAsyncML",
        """
        Begin a storage query.

        <h5>C Specification</h5>
        The #QuerySpatialAnchorsAsyncML() function is defined as:

        <pre><code>
￿XrResult xrQuerySpatialAnchorsAsyncML(
￿    XrSpatialAnchorsStorageML                   storage,
￿    const XrSpatialAnchorsQueryInfoBaseHeaderML* queryInfo,
￿    XrFutureEXT*                                future);</code></pre>

        <h5>Description</h5>
        If the space was not locatable during the query the runtime <b>must</b> return #ERROR_SPACE_NOT_LOCATABLE_EXT in ##XrSpatialAnchorsQueryCompletionML{@code ::futureResult}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to calling #QuerySpatialAnchorsAsyncML()</li>
            <li>{@code storage} <b>must</b> be a valid {@code XrSpatialAnchorsStorageML} handle</li>
            <li>{@code queryInfo} <b>must</b> be a pointer to a valid ##XrSpatialAnchorsQueryInfoBaseHeaderML-based structure. See also: ##XrSpatialAnchorsQueryInfoRadiusML</li>
            <li>{@code future} <b>must</b> be a pointer to an {@code XrFutureEXT} value</li>
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
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_TIME_INVALID</li>
                <li>#ERROR_SPATIAL_ANCHORS_SPACE_NOT_LOCATABLE_ML</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpatialAnchorsQueryInfoBaseHeaderML
        """,

        XrSpatialAnchorsStorageML("storage", "the {@code XrSpatialAnchorsStorageML} to use."),
        XrSpatialAnchorsQueryInfoBaseHeaderML.const.p("queryInfo", "the ##XrSpatialAnchorsQueryInfoBaseHeaderML structure used to define the query. ##XrSpatialAnchorsQueryInfoRadiusML allows querying around a pose."),
        Check(1)..XrFutureEXT.p("future", "a pointer the created {@code XrFutureEXT}.")
    )

    XrResult(
        "QuerySpatialAnchorsCompleteML",
        """
        Complete the asynchronous query operation.

        <h5>C Specification</h5>
        The #QuerySpatialAnchorsCompleteML() function is defined as:

        <pre><code>
￿XrResult xrQuerySpatialAnchorsCompleteML(
￿    XrSpatialAnchorsStorageML                   storage,
￿    XrFutureEXT                                 future,
￿    XrSpatialAnchorsQueryCompletionML*          completion);</code></pre>

        <h5>Description</h5>
        Once the {@code XrFutureEXT} has completed #QuerySpatialAnchorsCompleteML() <b>must</b> be called to retrieve the ##XrUuidEXT values of the found anchors.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to calling #QuerySpatialAnchorsCompleteML()</li>
            <li>{@code storage} <b>must</b> be a valid {@code XrSpatialAnchorsStorageML} handle</li>
            <li>{@code completion} <b>must</b> be a pointer to an ##XrSpatialAnchorsQueryCompletionML structure</li>
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
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_FUTURE_PENDING_EXT</li>
                <li>#ERROR_FUTURE_INVALID_EXT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpatialAnchorsQueryCompletionML, #QuerySpatialAnchorsAsyncML()
        """,

        XrSpatialAnchorsStorageML("storage", "the {@code XrSpatialAnchorsStorageML} used to start the query."),
        XrFutureEXT("future", "the {@code XrFutureEXT} of the future to complete."),
        XrSpatialAnchorsQueryCompletionML.p("completion", "a pointer to an ##XrSpatialAnchorsQueryCompletionML structure containing the result of the operation.")
    )

    XrResult(
        "PublishSpatialAnchorsAsyncML",
        """
        Begin a storage query.

        <h5>C Specification</h5>
        The #PublishSpatialAnchorsAsyncML() function is defined as:

        <pre><code>
￿XrResult xrPublishSpatialAnchorsAsyncML(
￿    XrSpatialAnchorsStorageML                   storage,
￿    const XrSpatialAnchorsPublishInfoML*        publishInfo,
￿    XrFutureEXT*                                future);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to calling #PublishSpatialAnchorsAsyncML()</li>
            <li>{@code storage} <b>must</b> be a valid {@code XrSpatialAnchorsStorageML} handle</li>
            <li>{@code publishInfo} <b>must</b> be a pointer to a valid ##XrSpatialAnchorsPublishInfoML structure</li>
            <li>{@code future} <b>must</b> be a pointer to an {@code XrFutureEXT} value</li>
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
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpatialAnchorsPublishInfoML
        """,

        XrSpatialAnchorsStorageML("storage", "the {@code XrSpatialAnchorsStorageML} to use."),
        XrSpatialAnchorsPublishInfoML.const.p("publishInfo", "the ##XrSpatialAnchorsPublishInfoML structure use to specify the anchors to publish."),
        Check(1)..XrFutureEXT.p("future", "a pointer the created {@code XrFutureEXT}.")
    )

    XrResult(
        "PublishSpatialAnchorsCompleteML",
        """
        Complete the asynchronous publish operation.

        <h5>C Specification</h5>
        The #PublishSpatialAnchorsCompleteML() function is defined as:

        <pre><code>
￿XrResult xrPublishSpatialAnchorsCompleteML(
￿    XrSpatialAnchorsStorageML                   storage,
￿    XrFutureEXT                                 future,
￿    XrSpatialAnchorsPublishCompletionML*        completion);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to calling #PublishSpatialAnchorsCompleteML()</li>
            <li>{@code storage} <b>must</b> be a valid {@code XrSpatialAnchorsStorageML} handle</li>
            <li>{@code completion} <b>must</b> be a pointer to an ##XrSpatialAnchorsPublishCompletionML structure</li>
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
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_FUTURE_PENDING_EXT</li>
                <li>#ERROR_FUTURE_INVALID_EXT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpatialAnchorsPublishCompletionML, #PublishSpatialAnchorsAsyncML()
        """,

        XrSpatialAnchorsStorageML("storage", "the {@code XrSpatialAnchorsStorageML} used to start the publish operation."),
        XrFutureEXT("future", "the {@code XrFutureEXT} of the future to complete."),
        XrSpatialAnchorsPublishCompletionML.p("completion", "a pointer to a ##XrSpatialAnchorsPublishCompletionML structure containing the result of the operation.")
    )

    XrResult(
        "DeleteSpatialAnchorsAsyncML",
        """
        Begin a storage query.

        <h5>C Specification</h5>
        The #DeleteSpatialAnchorsAsyncML() function is defined as:

        <pre><code>
￿XrResult xrDeleteSpatialAnchorsAsyncML(
￿    XrSpatialAnchorsStorageML                   storage,
￿    const XrSpatialAnchorsDeleteInfoML*         deleteInfo,
￿    XrFutureEXT*                                future);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to calling #DeleteSpatialAnchorsAsyncML()</li>
            <li>{@code storage} <b>must</b> be a valid {@code XrSpatialAnchorsStorageML} handle</li>
            <li>{@code deleteInfo} <b>must</b> be a pointer to a valid ##XrSpatialAnchorsDeleteInfoML structure</li>
            <li>{@code future} <b>must</b> be a pointer to an {@code XrFutureEXT} value</li>
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
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpatialAnchorsDeleteInfoML, #DeleteSpatialAnchorsCompleteML()
        """,

        XrSpatialAnchorsStorageML("storage", "the {@code XrSpatialAnchorsStorageML} to use."),
        XrSpatialAnchorsDeleteInfoML.const.p("deleteInfo", "the ##XrSpatialAnchorsDeleteInfoML structure used to specify the anchors to delete."),
        Check(1)..XrFutureEXT.p("future", "a pointer the created {@code XrFutureEXT}.")
    )

    XrResult(
        "DeleteSpatialAnchorsCompleteML",
        """
        Complete the asynchronous deletion operation.

        <h5>C Specification</h5>
        The #DeleteSpatialAnchorsCompleteML() function is defined as:

        <pre><code>
￿XrResult xrDeleteSpatialAnchorsCompleteML(
￿    XrSpatialAnchorsStorageML                   storage,
￿    XrFutureEXT                                 future,
￿    XrSpatialAnchorsDeleteCompletionML*         completion);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to calling #DeleteSpatialAnchorsCompleteML()</li>
            <li>{@code storage} <b>must</b> be a valid {@code XrSpatialAnchorsStorageML} handle</li>
            <li>{@code completion} <b>must</b> be a pointer to an ##XrSpatialAnchorsDeleteCompletionML structure</li>
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
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_FUTURE_PENDING_EXT</li>
                <li>#ERROR_FUTURE_INVALID_EXT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpatialAnchorsDeleteCompletionML, #DeleteSpatialAnchorsAsyncML()
        """,

        XrSpatialAnchorsStorageML("storage", "the {@code XrSpatialAnchorsStorageML} used to start the publish operation."),
        XrFutureEXT("future", "the {@code XrFutureEXT} of the future to complete."),
        XrSpatialAnchorsDeleteCompletionML.p("completion", "a pointer to a ##XrSpatialAnchorsDeleteCompletionML structure containing the result of the operation.")
    )

    XrResult(
        "UpdateSpatialAnchorsExpirationAsyncML",
        """
        Update anchors expiration time.

        <h5>C Specification</h5>
        The #UpdateSpatialAnchorsExpirationAsyncML() function is defined as:

        <pre><code>
￿XrResult xrUpdateSpatialAnchorsExpirationAsyncML(
￿    XrSpatialAnchorsStorageML                   storage,
￿    const XrSpatialAnchorsUpdateExpirationInfoML* updateInfo,
￿    XrFutureEXT*                                future);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to calling #UpdateSpatialAnchorsExpirationAsyncML()</li>
            <li>{@code storage} <b>must</b> be a valid {@code XrSpatialAnchorsStorageML} handle</li>
            <li>{@code updateInfo} <b>must</b> be a pointer to a valid ##XrSpatialAnchorsUpdateExpirationInfoML structure</li>
            <li>{@code future} <b>must</b> be a pointer to an {@code XrFutureEXT} value</li>
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
                <li>#ERROR_OUT_OF_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpatialAnchorsUpdateExpirationInfoML, #UpdateSpatialAnchorsExpirationCompleteML()
        """,

        XrSpatialAnchorsStorageML("storage", "the {@code XrSpatialAnchorsStorageML} to use."),
        XrSpatialAnchorsUpdateExpirationInfoML.const.p("updateInfo", "a pointer to ##XrSpatialAnchorsUpdateExpirationInfoML structure used to specify the anchors to update."),
        Check(1)..XrFutureEXT.p("future", "a pointer to the created {@code XrFutureEXT}.")
    )

    XrResult(
        "UpdateSpatialAnchorsExpirationCompleteML",
        """
        Complete the asynchronous update operation.

        <h5>C Specification</h5>
        The #UpdateSpatialAnchorsExpirationCompleteML() function is defined as:

        <pre><code>
￿XrResult xrUpdateSpatialAnchorsExpirationCompleteML(
￿    XrSpatialAnchorsStorageML                   storage,
￿    XrFutureEXT                                 future,
￿    XrSpatialAnchorsUpdateExpirationCompletionML* completion);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to calling #UpdateSpatialAnchorsExpirationCompleteML()</li>
            <li>{@code storage} <b>must</b> be a valid {@code XrSpatialAnchorsStorageML} handle</li>
            <li>{@code completion} <b>must</b> be a pointer to an ##XrSpatialAnchorsUpdateExpirationCompletionML structure</li>
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
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_FUTURE_PENDING_EXT</li>
                <li>#ERROR_FUTURE_INVALID_EXT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpatialAnchorsUpdateExpirationCompletionML, #UpdateSpatialAnchorsExpirationAsyncML()
        """,

        XrSpatialAnchorsStorageML("storage", "the {@code XrSpatialAnchorsStorageML} used to start the publish operation."),
        XrFutureEXT("future", "the {@code XrFutureEXT} of the future to complete."),
        XrSpatialAnchorsUpdateExpirationCompletionML.p("completion", "a pointer to a ##XrSpatialAnchorsUpdateExpirationCompletionML structure containing the result of the operation.")
    )
}