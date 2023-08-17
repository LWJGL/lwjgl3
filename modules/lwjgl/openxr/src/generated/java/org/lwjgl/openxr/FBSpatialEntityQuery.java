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
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_spatial_entity_query">XR_FB_spatial_entity_query</a> extension.
 * 
 * <p>This extension enables an application to discover persistent spatial entities in the area and restore them. Using the query system, the application <b>can</b> load persistent spatial entities from storage. The query system consists of a set of filters to define the spatial entity search query and an operation that needs to be performed on the search results.</p>
 * 
 * <p>In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into {@link XR10#xrCreateInstance CreateInstance} via the {@link XrInstanceCreateInfo}{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#extensions">extensions</a> section.</p>
 */
public class FBSpatialEntityQuery {

    /** The extension specification version. */
    public static final int XR_FB_spatial_entity_query_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_SPATIAL_ENTITY_QUERY_EXTENSION_NAME = "XR_FB_spatial_entity_query";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SPACE_QUERY_INFO_FB TYPE_SPACE_QUERY_INFO_FB}</li>
     * <li>{@link #XR_TYPE_SPACE_QUERY_RESULTS_FB TYPE_SPACE_QUERY_RESULTS_FB}</li>
     * <li>{@link #XR_TYPE_SPACE_STORAGE_LOCATION_FILTER_INFO_FB TYPE_SPACE_STORAGE_LOCATION_FILTER_INFO_FB}</li>
     * <li>{@link #XR_TYPE_SPACE_UUID_FILTER_INFO_FB TYPE_SPACE_UUID_FILTER_INFO_FB}</li>
     * <li>{@link #XR_TYPE_SPACE_COMPONENT_FILTER_INFO_FB TYPE_SPACE_COMPONENT_FILTER_INFO_FB}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_SPACE_QUERY_RESULTS_AVAILABLE_FB TYPE_EVENT_DATA_SPACE_QUERY_RESULTS_AVAILABLE_FB}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_SPACE_QUERY_COMPLETE_FB TYPE_EVENT_DATA_SPACE_QUERY_COMPLETE_FB}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SPACE_QUERY_INFO_FB                         = 1000156001,
        XR_TYPE_SPACE_QUERY_RESULTS_FB                      = 1000156002,
        XR_TYPE_SPACE_STORAGE_LOCATION_FILTER_INFO_FB       = 1000156003,
        XR_TYPE_SPACE_UUID_FILTER_INFO_FB                   = 1000156054,
        XR_TYPE_SPACE_COMPONENT_FILTER_INFO_FB              = 1000156052,
        XR_TYPE_EVENT_DATA_SPACE_QUERY_RESULTS_AVAILABLE_FB = 1000156103,
        XR_TYPE_EVENT_DATA_SPACE_QUERY_COMPLETE_FB          = 1000156104;

    /**
     * XrSpaceQueryActionFB - Type of query being performed
     * 
     * <h5>Description</h5>
     * 
     * <p>Specify the type of query being performed.</p>
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_SPACE_QUERY_ACTION_LOAD_FB SPACE_QUERY_ACTION_LOAD_FB} — Tells the query to perform a load operation on any {@code XrSpace} returned by the query.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpaceQueryInfoFB}</p>
     */
    public static final int XR_SPACE_QUERY_ACTION_LOAD_FB = 0;

    /**
     * XrSpaceStorageLocationFB - Storage location to persist spatial entities
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@code XrSpaceStorageLocationFB} enumeration contains the storage locations used to store, erase, and query spatial entities.</p>
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_SPACE_STORAGE_LOCATION_INVALID_FB SPACE_STORAGE_LOCATION_INVALID_FB} — Invalid storage location</li>
     * <li>{@link #XR_SPACE_STORAGE_LOCATION_LOCAL_FB SPACE_STORAGE_LOCATION_LOCAL_FB} — Local device storage</li>
     * <li>{@link #XR_SPACE_STORAGE_LOCATION_CLOUD_FB SPACE_STORAGE_LOCATION_CLOUD_FB} — Cloud storage</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrEventDataSpaceEraseCompleteFB}, {@link XrEventDataSpaceSaveCompleteFB}, {@link XrSpaceEraseInfoFB}, {@link XrSpaceListSaveInfoFB}, {@link XrSpaceSaveInfoFB}, {@link XrSpaceStorageLocationFilterInfoFB}</p>
     */
    public static final int
        XR_SPACE_STORAGE_LOCATION_INVALID_FB = 0,
        XR_SPACE_STORAGE_LOCATION_LOCAL_FB   = 1,
        XR_SPACE_STORAGE_LOCATION_CLOUD_FB   = 2;

    protected FBSpatialEntityQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrQuerySpacesFB ] ---

    /** Unsafe version of: {@link #xrQuerySpacesFB QuerySpacesFB} */
    public static int nxrQuerySpacesFB(XrSession session, long info, long requestId) {
        long __functionAddress = session.getCapabilities().xrQuerySpacesFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), info, requestId, __functionAddress);
    }

    /**
     * Queries for spatial entities.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrQuerySpacesFB QuerySpacesFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrQuerySpacesFB(
     *     XrSession                                   session,
     *     const XrSpaceQueryInfoBaseHeaderFB*         info,
     *     XrAsyncRequestIdFB*                         requestId);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrQuerySpacesFB QuerySpacesFB} function enables an application to find and retrieve spatial entities from storage. Cast an {@link XrSpaceQueryInfoFB} pointer to a {@link XrSpaceQueryInfoBaseHeaderFB} pointer to pass as {@code info}. The application <b>should</b> keep the returned {@code requestId} for the duration of the request as it is used to refer to the request when calling {@link #xrRetrieveSpaceQueryResultsFB RetrieveSpaceQueryResultsFB} and is used to map completion events to the request. This operation is asynchronous and the runtime <b>must</b> post an {@link XrEventDataSpaceQueryCompleteFB} event when the operation completes successfully or encounters an error. If this function returns a failure code, no event is posted. The runtime <b>must</b> post an {@link XrEventDataSpaceQueryResultsAvailableFB} before {@link XrEventDataSpaceQueryCompleteFB} if any results are found. Once an {@link XrEventDataSpaceQueryResultsAvailableFB} event has been posted, the application <b>may</b> call {@link #xrRetrieveSpaceQueryResultsFB RetrieveSpaceQueryResultsFB} to retrieve the available results.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBSpatialEntityQuery XR_FB_spatial_entity_query} extension <b>must</b> be enabled prior to calling {@link #xrQuerySpacesFB QuerySpacesFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code info} <b>must</b> be a pointer to a valid {@link XrSpaceQueryInfoBaseHeaderFB}-based structure. See also: {@link XrSpaceQueryInfoFB}</li>
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
     * <p>{@link XrSpaceQueryInfoBaseHeaderFB}</p>
     *
     * @param session   a handle to an {@code XrSession}.
     * @param info      a pointer to the {@link XrSpaceQueryInfoBaseHeaderFB} structure.
     * @param requestId an output parameter, and the variable it points to will be populated with the ID of this asynchronous request.
     */
    @NativeType("XrResult")
    public static int xrQuerySpacesFB(XrSession session, @NativeType("XrSpaceQueryInfoBaseHeaderFB const *") XrSpaceQueryInfoBaseHeaderFB info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrQuerySpacesFB(session, info.address(), memAddress(requestId));
    }

    // --- [ xrRetrieveSpaceQueryResultsFB ] ---

    /** Unsafe version of: {@link #xrRetrieveSpaceQueryResultsFB RetrieveSpaceQueryResultsFB} */
    public static int nxrRetrieveSpaceQueryResultsFB(XrSession session, long requestId, long results) {
        long __functionAddress = session.getCapabilities().xrRetrieveSpaceQueryResultsFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), requestId, results, __functionAddress);
    }

    /**
     * Copies query results into an output buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrRetrieveSpaceQueryResultsFB RetrieveSpaceQueryResultsFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrRetrieveSpaceQueryResultsFB(
     *     XrSession                                   session,
     *     XrAsyncRequestIdFB                          requestId,
     *     XrSpaceQueryResultsFB*                      results);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Allows an application to retrieve all available results for a specified query. Call this function once to get the number of results found and then once more to copy the results into a buffer provided by the application. The number of results will not change between the two calls used to retrieve results. This function <b>must</b> only retrieve each query result once. After the application has used this function to retrieve a query result, the runtime frees its copy. The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if {@code requestId} refers to a request that is not yet complete, a request for which results have already been retrieved, or if {@code requestId} does not refer to a known request.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBSpatialEntityQuery XR_FB_spatial_entity_query} extension <b>must</b> be enabled prior to calling {@link #xrRetrieveSpaceQueryResultsFB RetrieveSpaceQueryResultsFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code results} <b>must</b> be a pointer to an {@link XrSpaceQueryResultsFB} structure</li>
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
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpaceQueryResultsFB}</p>
     *
     * @param session   the {@code XrSession} for which the in-progress query is valid.
     * @param requestId the {@code XrAsyncRequestIdFB} to enumerate results for.
     * @param results   a pointer to an {@link XrSpaceQueryResultsFB} to populate with results.
     */
    @NativeType("XrResult")
    public static int xrRetrieveSpaceQueryResultsFB(XrSession session, @NativeType("XrAsyncRequestIdFB") long requestId, @NativeType("XrSpaceQueryResultsFB *") XrSpaceQueryResultsFB results) {
        return nxrRetrieveSpaceQueryResultsFB(session, requestId, results.address());
    }

}