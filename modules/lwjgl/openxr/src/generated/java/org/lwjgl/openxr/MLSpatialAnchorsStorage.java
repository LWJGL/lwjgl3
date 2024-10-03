/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#XR_ML_spatial_anchors_storage">XR_ML_spatial_anchors_storage</a> extension.
 * 
 * <p>This extension allows spatial anchors created by {@link MLSpatialAnchors XR_ML_spatial_anchors} to be persisted beyond the head pose session.</p>
 * 
 * <p>Spatial anchor management is closely tied to the selected mapping mode on the device. The modes are mutually exclusive and affect the functionality of these APIs. The available mapping modes are:</p>
 * 
 * <dl>
 * <dt>On-Device Mode</dt>
 * <dd>A persistent mode in which anchors are persisted locally and will be available across multiple sessions when localized to the same localization map in which they were published.</dd>
 * <dt>AR Cloud Mode</dt>
 * <dd>A persistent mode in which anchors are persisted in the cloud environment and will be available across multiple sessions and across multiple devices that are localized to the same localization map in which they were published.</dd>
 * </dl>
 * 
 * <p>For more details on mapping modes refer to the {@link MLLocalizationMap XR_ML_localization_map} extension.</p>
 * 
 * <h5>Permissions</h5>
 * 
 * <p>Android applications <b>must</b> have the com.magicleap.permission.SPATIAL_ANCHOR permission listed in their manifest to use this extension. (protection level: normal)</p>
 */
public class MLSpatialAnchorsStorage {

    /** The extension specification version. */
    public static final int XR_ML_spatial_anchors_storage_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_ML_SPATIAL_ANCHORS_STORAGE_EXTENSION_NAME = "XR_ML_spatial_anchors_storage";

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_SPATIAL_ANCHORS_STORAGE_ML = 1000141000;

    /** Extends {@code XrResult}. */
    public static final int XR_ERROR_SPATIAL_ANCHORS_ANCHOR_NOT_FOUND_ML = -1000141000;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SPATIAL_ANCHORS_CREATE_STORAGE_INFO_ML TYPE_SPATIAL_ANCHORS_CREATE_STORAGE_INFO_ML}</li>
     * <li>{@link #XR_TYPE_SPATIAL_ANCHORS_QUERY_INFO_RADIUS_ML TYPE_SPATIAL_ANCHORS_QUERY_INFO_RADIUS_ML}</li>
     * <li>{@link #XR_TYPE_SPATIAL_ANCHORS_QUERY_COMPLETION_ML TYPE_SPATIAL_ANCHORS_QUERY_COMPLETION_ML}</li>
     * <li>{@link #XR_TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_UUIDS_ML TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_UUIDS_ML}</li>
     * <li>{@link #XR_TYPE_SPATIAL_ANCHORS_PUBLISH_INFO_ML TYPE_SPATIAL_ANCHORS_PUBLISH_INFO_ML}</li>
     * <li>{@link #XR_TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_ML TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_ML}</li>
     * <li>{@link #XR_TYPE_SPATIAL_ANCHORS_DELETE_INFO_ML TYPE_SPATIAL_ANCHORS_DELETE_INFO_ML}</li>
     * <li>{@link #XR_TYPE_SPATIAL_ANCHORS_DELETE_COMPLETION_ML TYPE_SPATIAL_ANCHORS_DELETE_COMPLETION_ML}</li>
     * <li>{@link #XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_INFO_ML TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_INFO_ML}</li>
     * <li>{@link #XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_ML TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_ML}</li>
     * <li>{@link #XR_TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_DETAILS_ML TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_DETAILS_ML}</li>
     * <li>{@link #XR_TYPE_SPATIAL_ANCHORS_DELETE_COMPLETION_DETAILS_ML TYPE_SPATIAL_ANCHORS_DELETE_COMPLETION_DETAILS_ML}</li>
     * <li>{@link #XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_DETAILS_ML TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_DETAILS_ML}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SPATIAL_ANCHORS_CREATE_STORAGE_INFO_ML                  = 1000141000,
        XR_TYPE_SPATIAL_ANCHORS_QUERY_INFO_RADIUS_ML                    = 1000141001,
        XR_TYPE_SPATIAL_ANCHORS_QUERY_COMPLETION_ML                     = 1000141002,
        XR_TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_UUIDS_ML               = 1000141003,
        XR_TYPE_SPATIAL_ANCHORS_PUBLISH_INFO_ML                         = 1000141004,
        XR_TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_ML                   = 1000141005,
        XR_TYPE_SPATIAL_ANCHORS_DELETE_INFO_ML                          = 1000141006,
        XR_TYPE_SPATIAL_ANCHORS_DELETE_COMPLETION_ML                    = 1000141007,
        XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_INFO_ML               = 1000141008,
        XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_ML         = 1000141009,
        XR_TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_DETAILS_ML           = 1000141010,
        XR_TYPE_SPATIAL_ANCHORS_DELETE_COMPLETION_DETAILS_ML            = 1000141011,
        XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_DETAILS_ML = 1000141012;

    protected MLSpatialAnchorsStorage() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpatialAnchorsStorageML ] ---

    /** Unsafe version of: {@link #xrCreateSpatialAnchorsStorageML CreateSpatialAnchorsStorageML} */
    public static int nxrCreateSpatialAnchorsStorageML(XrSession session, long createInfo, long storage) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAnchorsStorageML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, storage, __functionAddress);
    }

    /**
     * Create spatial anchors storage connection.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateSpatialAnchorsStorageML CreateSpatialAnchorsStorageML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateSpatialAnchorsStorageML(
     *     XrSession                                   session,
     *     const XrSpatialAnchorsCreateStorageInfoML*  createInfo,
     *     XrSpatialAnchorsStorageML*                  storage);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrCreateSpatialAnchorsStorageML CreateSpatialAnchorsStorageML} function is used to create a {@code XrSpatialAnchorsStorageML}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to calling {@link #xrCreateSpatialAnchorsStorageML CreateSpatialAnchorsStorageML}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrSpatialAnchorsCreateStorageInfoML} structure</li>
     * <li>{@code storage} <b>must</b> be a pointer to an {@code XrSpatialAnchorsStorageML} handle</li>
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
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link MLSpatialAnchors#XR_ERROR_SPATIAL_ANCHORS_PERMISSION_DENIED_ML ERROR_SPATIAL_ANCHORS_PERMISSION_DENIED_ML}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpatialAnchorsCreateStorageInfoML}</p>
     *
     * @param session    a handle to an {@code XrSession} previously created with {@link XR10#xrCreateSession CreateSession}.
     * @param createInfo a pointer to an {@link XrSpatialAnchorsCreateInfoBaseHeaderML} derived structure.
     * @param storage    a pointer to an {@code XrSpatialAnchorsStorageML} where the created storage is returned.
     */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorsStorageML(XrSession session, @NativeType("XrSpatialAnchorsCreateStorageInfoML const *") XrSpatialAnchorsCreateStorageInfoML createInfo, @NativeType("XrSpatialAnchorsStorageML *") PointerBuffer storage) {
        if (CHECKS) {
            check(storage, 1);
        }
        return nxrCreateSpatialAnchorsStorageML(session, createInfo.address(), memAddress(storage));
    }

    // --- [ xrDestroySpatialAnchorsStorageML ] ---

    /**
     * Destroy spatial anchors storage.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroySpatialAnchorsStorageML DestroySpatialAnchorsStorageML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDestroySpatialAnchorsStorageML(
     *     XrSpatialAnchorsStorageML                   storage);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to calling {@link #xrDestroySpatialAnchorsStorageML DestroySpatialAnchorsStorageML}</li>
     * <li>{@code storage} <b>must</b> be a valid {@code XrSpatialAnchorsStorageML} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code storage}, and any child handles, <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrCreateSpatialAnchorsStorageML CreateSpatialAnchorsStorageML}</p>
     *
     * @param storage the {@code XrSpatialAnchorsStorageML} to destroy.
     */
    @NativeType("XrResult")
    public static int xrDestroySpatialAnchorsStorageML(XrSpatialAnchorsStorageML storage) {
        long __functionAddress = storage.getCapabilities().xrDestroySpatialAnchorsStorageML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(storage.address(), __functionAddress);
    }

    // --- [ xrQuerySpatialAnchorsAsyncML ] ---

    /** Unsafe version of: {@link #xrQuerySpatialAnchorsAsyncML QuerySpatialAnchorsAsyncML} */
    public static int nxrQuerySpatialAnchorsAsyncML(XrSpatialAnchorsStorageML storage, long queryInfo, long future) {
        long __functionAddress = storage.getCapabilities().xrQuerySpatialAnchorsAsyncML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(storage.address(), queryInfo, future, __functionAddress);
    }

    /**
     * Begin a storage query.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrQuerySpatialAnchorsAsyncML QuerySpatialAnchorsAsyncML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrQuerySpatialAnchorsAsyncML(
     *     XrSpatialAnchorsStorageML                   storage,
     *     const XrSpatialAnchorsQueryInfoBaseHeaderML* queryInfo,
     *     XrFutureEXT*                                future);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If the space was not locatable during the query the runtime <b>must</b> return {@link EXTPlaneDetection#XR_ERROR_SPACE_NOT_LOCATABLE_EXT ERROR_SPACE_NOT_LOCATABLE_EXT} in {@link XrSpatialAnchorsQueryCompletionML}{@code ::futureResult}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to calling {@link #xrQuerySpatialAnchorsAsyncML QuerySpatialAnchorsAsyncML}</li>
     * <li>{@code storage} <b>must</b> be a valid {@code XrSpatialAnchorsStorageML} handle</li>
     * <li>{@code queryInfo} <b>must</b> be a pointer to a valid {@link XrSpatialAnchorsQueryInfoBaseHeaderML}-based structure. See also: {@link XrSpatialAnchorsQueryInfoRadiusML}</li>
     * <li>{@code future} <b>must</b> be a pointer to an {@code XrFutureEXT} value</li>
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
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link XR10#XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}</li>
     * <li>{@link MLSpatialAnchors#XR_ERROR_SPATIAL_ANCHORS_SPACE_NOT_LOCATABLE_ML ERROR_SPATIAL_ANCHORS_SPACE_NOT_LOCATABLE_ML}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpatialAnchorsQueryInfoBaseHeaderML}</p>
     *
     * @param storage   the {@code XrSpatialAnchorsStorageML} to use.
     * @param queryInfo the {@link XrSpatialAnchorsQueryInfoBaseHeaderML} structure used to define the query. {@link XrSpatialAnchorsQueryInfoRadiusML} allows querying around a pose.
     * @param future    a pointer the created {@code XrFutureEXT}.
     */
    @NativeType("XrResult")
    public static int xrQuerySpatialAnchorsAsyncML(XrSpatialAnchorsStorageML storage, @NativeType("XrSpatialAnchorsQueryInfoBaseHeaderML const *") XrSpatialAnchorsQueryInfoBaseHeaderML queryInfo, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrQuerySpatialAnchorsAsyncML(storage, queryInfo.address(), memAddress(future));
    }

    // --- [ xrQuerySpatialAnchorsCompleteML ] ---

    /** Unsafe version of: {@link #xrQuerySpatialAnchorsCompleteML QuerySpatialAnchorsCompleteML} */
    public static int nxrQuerySpatialAnchorsCompleteML(XrSpatialAnchorsStorageML storage, long future, long completion) {
        long __functionAddress = storage.getCapabilities().xrQuerySpatialAnchorsCompleteML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(storage.address(), future, completion, __functionAddress);
    }

    /**
     * Complete the asynchronous query operation.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrQuerySpatialAnchorsCompleteML QuerySpatialAnchorsCompleteML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrQuerySpatialAnchorsCompleteML(
     *     XrSpatialAnchorsStorageML                   storage,
     *     XrFutureEXT                                 future,
     *     XrSpatialAnchorsQueryCompletionML*          completion);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Once the {@code XrFutureEXT} has completed {@link #xrQuerySpatialAnchorsCompleteML QuerySpatialAnchorsCompleteML} <b>must</b> be called to retrieve the {@link XrUuidEXT} values of the found anchors.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to calling {@link #xrQuerySpatialAnchorsCompleteML QuerySpatialAnchorsCompleteML}</li>
     * <li>{@code storage} <b>must</b> be a valid {@code XrSpatialAnchorsStorageML} handle</li>
     * <li>{@code completion} <b>must</b> be a pointer to an {@link XrSpatialAnchorsQueryCompletionML} structure</li>
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
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link EXTFuture#XR_ERROR_FUTURE_PENDING_EXT ERROR_FUTURE_PENDING_EXT}</li>
     * <li>{@link EXTFuture#XR_ERROR_FUTURE_INVALID_EXT ERROR_FUTURE_INVALID_EXT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpatialAnchorsQueryCompletionML}, {@link #xrQuerySpatialAnchorsAsyncML QuerySpatialAnchorsAsyncML}</p>
     *
     * @param storage    the {@code XrSpatialAnchorsStorageML} used to start the query.
     * @param future     the {@code XrFutureEXT} of the future to complete.
     * @param completion a pointer to an {@link XrSpatialAnchorsQueryCompletionML} structure containing the result of the operation.
     */
    @NativeType("XrResult")
    public static int xrQuerySpatialAnchorsCompleteML(XrSpatialAnchorsStorageML storage, @NativeType("XrFutureEXT") long future, @NativeType("XrSpatialAnchorsQueryCompletionML *") XrSpatialAnchorsQueryCompletionML completion) {
        return nxrQuerySpatialAnchorsCompleteML(storage, future, completion.address());
    }

    // --- [ xrPublishSpatialAnchorsAsyncML ] ---

    /** Unsafe version of: {@link #xrPublishSpatialAnchorsAsyncML PublishSpatialAnchorsAsyncML} */
    public static int nxrPublishSpatialAnchorsAsyncML(XrSpatialAnchorsStorageML storage, long publishInfo, long future) {
        long __functionAddress = storage.getCapabilities().xrPublishSpatialAnchorsAsyncML;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorsPublishInfoML.validate(publishInfo);
        }
        return callPPPI(storage.address(), publishInfo, future, __functionAddress);
    }

    /**
     * Begin a storage query.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrPublishSpatialAnchorsAsyncML PublishSpatialAnchorsAsyncML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrPublishSpatialAnchorsAsyncML(
     *     XrSpatialAnchorsStorageML                   storage,
     *     const XrSpatialAnchorsPublishInfoML*        publishInfo,
     *     XrFutureEXT*                                future);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to calling {@link #xrPublishSpatialAnchorsAsyncML PublishSpatialAnchorsAsyncML}</li>
     * <li>{@code storage} <b>must</b> be a valid {@code XrSpatialAnchorsStorageML} handle</li>
     * <li>{@code publishInfo} <b>must</b> be a pointer to a valid {@link XrSpatialAnchorsPublishInfoML} structure</li>
     * <li>{@code future} <b>must</b> be a pointer to an {@code XrFutureEXT} value</li>
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
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpatialAnchorsPublishInfoML}</p>
     *
     * @param storage     the {@code XrSpatialAnchorsStorageML} to use.
     * @param publishInfo the {@link XrSpatialAnchorsPublishInfoML} structure use to specify the anchors to publish.
     * @param future      a pointer the created {@code XrFutureEXT}.
     */
    @NativeType("XrResult")
    public static int xrPublishSpatialAnchorsAsyncML(XrSpatialAnchorsStorageML storage, @NativeType("XrSpatialAnchorsPublishInfoML const *") XrSpatialAnchorsPublishInfoML publishInfo, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrPublishSpatialAnchorsAsyncML(storage, publishInfo.address(), memAddress(future));
    }

    // --- [ xrPublishSpatialAnchorsCompleteML ] ---

    /** Unsafe version of: {@link #xrPublishSpatialAnchorsCompleteML PublishSpatialAnchorsCompleteML} */
    public static int nxrPublishSpatialAnchorsCompleteML(XrSpatialAnchorsStorageML storage, long future, long completion) {
        long __functionAddress = storage.getCapabilities().xrPublishSpatialAnchorsCompleteML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(storage.address(), future, completion, __functionAddress);
    }

    /**
     * Complete the asynchronous publish operation.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrPublishSpatialAnchorsCompleteML PublishSpatialAnchorsCompleteML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrPublishSpatialAnchorsCompleteML(
     *     XrSpatialAnchorsStorageML                   storage,
     *     XrFutureEXT                                 future,
     *     XrSpatialAnchorsPublishCompletionML*        completion);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to calling {@link #xrPublishSpatialAnchorsCompleteML PublishSpatialAnchorsCompleteML}</li>
     * <li>{@code storage} <b>must</b> be a valid {@code XrSpatialAnchorsStorageML} handle</li>
     * <li>{@code completion} <b>must</b> be a pointer to an {@link XrSpatialAnchorsPublishCompletionML} structure</li>
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
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link EXTFuture#XR_ERROR_FUTURE_PENDING_EXT ERROR_FUTURE_PENDING_EXT}</li>
     * <li>{@link EXTFuture#XR_ERROR_FUTURE_INVALID_EXT ERROR_FUTURE_INVALID_EXT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpatialAnchorsPublishCompletionML}, {@link #xrPublishSpatialAnchorsAsyncML PublishSpatialAnchorsAsyncML}</p>
     *
     * @param storage    the {@code XrSpatialAnchorsStorageML} used to start the publish operation.
     * @param future     the {@code XrFutureEXT} of the future to complete.
     * @param completion a pointer to a {@link XrSpatialAnchorsPublishCompletionML} structure containing the result of the operation.
     */
    @NativeType("XrResult")
    public static int xrPublishSpatialAnchorsCompleteML(XrSpatialAnchorsStorageML storage, @NativeType("XrFutureEXT") long future, @NativeType("XrSpatialAnchorsPublishCompletionML *") XrSpatialAnchorsPublishCompletionML completion) {
        return nxrPublishSpatialAnchorsCompleteML(storage, future, completion.address());
    }

    // --- [ xrDeleteSpatialAnchorsAsyncML ] ---

    /** Unsafe version of: {@link #xrDeleteSpatialAnchorsAsyncML DeleteSpatialAnchorsAsyncML} */
    public static int nxrDeleteSpatialAnchorsAsyncML(XrSpatialAnchorsStorageML storage, long deleteInfo, long future) {
        long __functionAddress = storage.getCapabilities().xrDeleteSpatialAnchorsAsyncML;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorsDeleteInfoML.validate(deleteInfo);
        }
        return callPPPI(storage.address(), deleteInfo, future, __functionAddress);
    }

    /**
     * Begin a storage query.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDeleteSpatialAnchorsAsyncML DeleteSpatialAnchorsAsyncML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDeleteSpatialAnchorsAsyncML(
     *     XrSpatialAnchorsStorageML                   storage,
     *     const XrSpatialAnchorsDeleteInfoML*         deleteInfo,
     *     XrFutureEXT*                                future);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to calling {@link #xrDeleteSpatialAnchorsAsyncML DeleteSpatialAnchorsAsyncML}</li>
     * <li>{@code storage} <b>must</b> be a valid {@code XrSpatialAnchorsStorageML} handle</li>
     * <li>{@code deleteInfo} <b>must</b> be a pointer to a valid {@link XrSpatialAnchorsDeleteInfoML} structure</li>
     * <li>{@code future} <b>must</b> be a pointer to an {@code XrFutureEXT} value</li>
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
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpatialAnchorsDeleteInfoML}, {@link #xrDeleteSpatialAnchorsCompleteML DeleteSpatialAnchorsCompleteML}</p>
     *
     * @param storage    the {@code XrSpatialAnchorsStorageML} to use.
     * @param deleteInfo the {@link XrSpatialAnchorsDeleteInfoML} structure used to specify the anchors to delete.
     * @param future     a pointer the created {@code XrFutureEXT}.
     */
    @NativeType("XrResult")
    public static int xrDeleteSpatialAnchorsAsyncML(XrSpatialAnchorsStorageML storage, @NativeType("XrSpatialAnchorsDeleteInfoML const *") XrSpatialAnchorsDeleteInfoML deleteInfo, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrDeleteSpatialAnchorsAsyncML(storage, deleteInfo.address(), memAddress(future));
    }

    // --- [ xrDeleteSpatialAnchorsCompleteML ] ---

    /** Unsafe version of: {@link #xrDeleteSpatialAnchorsCompleteML DeleteSpatialAnchorsCompleteML} */
    public static int nxrDeleteSpatialAnchorsCompleteML(XrSpatialAnchorsStorageML storage, long future, long completion) {
        long __functionAddress = storage.getCapabilities().xrDeleteSpatialAnchorsCompleteML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(storage.address(), future, completion, __functionAddress);
    }

    /**
     * Complete the asynchronous deletion operation.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDeleteSpatialAnchorsCompleteML DeleteSpatialAnchorsCompleteML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDeleteSpatialAnchorsCompleteML(
     *     XrSpatialAnchorsStorageML                   storage,
     *     XrFutureEXT                                 future,
     *     XrSpatialAnchorsDeleteCompletionML*         completion);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to calling {@link #xrDeleteSpatialAnchorsCompleteML DeleteSpatialAnchorsCompleteML}</li>
     * <li>{@code storage} <b>must</b> be a valid {@code XrSpatialAnchorsStorageML} handle</li>
     * <li>{@code completion} <b>must</b> be a pointer to an {@link XrSpatialAnchorsDeleteCompletionML} structure</li>
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
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link EXTFuture#XR_ERROR_FUTURE_PENDING_EXT ERROR_FUTURE_PENDING_EXT}</li>
     * <li>{@link EXTFuture#XR_ERROR_FUTURE_INVALID_EXT ERROR_FUTURE_INVALID_EXT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpatialAnchorsDeleteCompletionML}, {@link #xrDeleteSpatialAnchorsAsyncML DeleteSpatialAnchorsAsyncML}</p>
     *
     * @param storage    the {@code XrSpatialAnchorsStorageML} used to start the publish operation.
     * @param future     the {@code XrFutureEXT} of the future to complete.
     * @param completion a pointer to a {@link XrSpatialAnchorsDeleteCompletionML} structure containing the result of the operation.
     */
    @NativeType("XrResult")
    public static int xrDeleteSpatialAnchorsCompleteML(XrSpatialAnchorsStorageML storage, @NativeType("XrFutureEXT") long future, @NativeType("XrSpatialAnchorsDeleteCompletionML *") XrSpatialAnchorsDeleteCompletionML completion) {
        return nxrDeleteSpatialAnchorsCompleteML(storage, future, completion.address());
    }

    // --- [ xrUpdateSpatialAnchorsExpirationAsyncML ] ---

    /** Unsafe version of: {@link #xrUpdateSpatialAnchorsExpirationAsyncML UpdateSpatialAnchorsExpirationAsyncML} */
    public static int nxrUpdateSpatialAnchorsExpirationAsyncML(XrSpatialAnchorsStorageML storage, long updateInfo, long future) {
        long __functionAddress = storage.getCapabilities().xrUpdateSpatialAnchorsExpirationAsyncML;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorsUpdateExpirationInfoML.validate(updateInfo);
        }
        return callPPPI(storage.address(), updateInfo, future, __functionAddress);
    }

    /**
     * Update anchors expiration time.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrUpdateSpatialAnchorsExpirationAsyncML UpdateSpatialAnchorsExpirationAsyncML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrUpdateSpatialAnchorsExpirationAsyncML(
     *     XrSpatialAnchorsStorageML                   storage,
     *     const XrSpatialAnchorsUpdateExpirationInfoML* updateInfo,
     *     XrFutureEXT*                                future);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to calling {@link #xrUpdateSpatialAnchorsExpirationAsyncML UpdateSpatialAnchorsExpirationAsyncML}</li>
     * <li>{@code storage} <b>must</b> be a valid {@code XrSpatialAnchorsStorageML} handle</li>
     * <li>{@code updateInfo} <b>must</b> be a pointer to a valid {@link XrSpatialAnchorsUpdateExpirationInfoML} structure</li>
     * <li>{@code future} <b>must</b> be a pointer to an {@code XrFutureEXT} value</li>
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
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpatialAnchorsUpdateExpirationInfoML}, {@link #xrUpdateSpatialAnchorsExpirationCompleteML UpdateSpatialAnchorsExpirationCompleteML}</p>
     *
     * @param storage    the {@code XrSpatialAnchorsStorageML} to use.
     * @param updateInfo a pointer to {@link XrSpatialAnchorsUpdateExpirationInfoML} structure used to specify the anchors to update.
     * @param future     a pointer to the created {@code XrFutureEXT}.
     */
    @NativeType("XrResult")
    public static int xrUpdateSpatialAnchorsExpirationAsyncML(XrSpatialAnchorsStorageML storage, @NativeType("XrSpatialAnchorsUpdateExpirationInfoML const *") XrSpatialAnchorsUpdateExpirationInfoML updateInfo, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrUpdateSpatialAnchorsExpirationAsyncML(storage, updateInfo.address(), memAddress(future));
    }

    // --- [ xrUpdateSpatialAnchorsExpirationCompleteML ] ---

    /** Unsafe version of: {@link #xrUpdateSpatialAnchorsExpirationCompleteML UpdateSpatialAnchorsExpirationCompleteML} */
    public static int nxrUpdateSpatialAnchorsExpirationCompleteML(XrSpatialAnchorsStorageML storage, long future, long completion) {
        long __functionAddress = storage.getCapabilities().xrUpdateSpatialAnchorsExpirationCompleteML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(storage.address(), future, completion, __functionAddress);
    }

    /**
     * Complete the asynchronous update operation.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrUpdateSpatialAnchorsExpirationCompleteML UpdateSpatialAnchorsExpirationCompleteML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrUpdateSpatialAnchorsExpirationCompleteML(
     *     XrSpatialAnchorsStorageML                   storage,
     *     XrFutureEXT                                 future,
     *     XrSpatialAnchorsUpdateExpirationCompletionML* completion);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to calling {@link #xrUpdateSpatialAnchorsExpirationCompleteML UpdateSpatialAnchorsExpirationCompleteML}</li>
     * <li>{@code storage} <b>must</b> be a valid {@code XrSpatialAnchorsStorageML} handle</li>
     * <li>{@code completion} <b>must</b> be a pointer to an {@link XrSpatialAnchorsUpdateExpirationCompletionML} structure</li>
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
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link EXTFuture#XR_ERROR_FUTURE_PENDING_EXT ERROR_FUTURE_PENDING_EXT}</li>
     * <li>{@link EXTFuture#XR_ERROR_FUTURE_INVALID_EXT ERROR_FUTURE_INVALID_EXT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpatialAnchorsUpdateExpirationCompletionML}, {@link #xrUpdateSpatialAnchorsExpirationAsyncML UpdateSpatialAnchorsExpirationAsyncML}</p>
     *
     * @param storage    the {@code XrSpatialAnchorsStorageML} used to start the publish operation.
     * @param future     the {@code XrFutureEXT} of the future to complete.
     * @param completion a pointer to a {@link XrSpatialAnchorsUpdateExpirationCompletionML} structure containing the result of the operation.
     */
    @NativeType("XrResult")
    public static int xrUpdateSpatialAnchorsExpirationCompleteML(XrSpatialAnchorsStorageML storage, @NativeType("XrFutureEXT") long future, @NativeType("XrSpatialAnchorsUpdateExpirationCompletionML *") XrSpatialAnchorsUpdateExpirationCompletionML completion) {
        return nxrUpdateSpatialAnchorsExpirationCompleteML(storage, future, completion.address());
    }

}