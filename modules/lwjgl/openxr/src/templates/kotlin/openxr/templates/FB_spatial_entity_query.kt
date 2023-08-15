/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_spatial_entity_query = "FBSpatialEntityQuery".nativeClassXR("FB_spatial_entity_query", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_spatial_entity_query">XR_FB_spatial_entity_query</a> extension.

        This extension enables an application to discover persistent spatial entities in the area and restore them. Using the query system, the application <b>can</b> load persistent spatial entities from storage. The query system consists of a set of filters to define the spatial entity search query and an operation that needs to be performed on the search results.

        In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into #CreateInstance() via the ##XrInstanceCreateInfo{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#extensions">extensions</a> section.
        """

    IntConstant(
        "The extension specification version.",

        "FB_spatial_entity_query_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_SPATIAL_ENTITY_QUERY_EXTENSION_NAME".."XR_FB_spatial_entity_query"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SPACE_QUERY_INFO_FB".."1000156001",
        "TYPE_SPACE_QUERY_RESULTS_FB".."1000156002",
        "TYPE_SPACE_STORAGE_LOCATION_FILTER_INFO_FB".."1000156003",
        "TYPE_SPACE_UUID_FILTER_INFO_FB".."1000156054",
        "TYPE_SPACE_COMPONENT_FILTER_INFO_FB".."1000156052",
        "TYPE_EVENT_DATA_SPACE_QUERY_RESULTS_AVAILABLE_FB".."1000156103",
        "TYPE_EVENT_DATA_SPACE_QUERY_COMPLETE_FB".."1000156104"
    )

    EnumConstant(
        """
        XrSpaceQueryActionFB - Type of query being performed

        <h5>Description</h5>
        Specify the type of query being performed.

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#SPACE_QUERY_ACTION_LOAD_FB — Tells the query to perform a load operation on any {@code XrSpace} returned by the query.</li>
        </ul>

        <h5>See Also</h5>
        ##XrSpaceQueryInfoFB
        """,

        "SPACE_QUERY_ACTION_LOAD_FB".."0"
    )

    EnumConstant(
        """
        XrSpaceStorageLocationFB - Storage location to persist spatial entities

        <h5>Description</h5>
        The {@code XrSpaceStorageLocationFB} enumeration contains the storage locations used to store, erase, and query spatial entities.

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#SPACE_STORAGE_LOCATION_INVALID_FB — Invalid storage location</li>
            <li>#SPACE_STORAGE_LOCATION_LOCAL_FB — Local device storage</li>
            <li>#SPACE_STORAGE_LOCATION_CLOUD_FB — Cloud storage</li>
        </ul>

        <h5>See Also</h5>
        ##XrEventDataSpaceEraseCompleteFB, ##XrEventDataSpaceSaveCompleteFB, ##XrSpaceEraseInfoFB, ##XrSpaceListSaveInfoFB, ##XrSpaceSaveInfoFB, ##XrSpaceStorageLocationFilterInfoFB
        """,

        "SPACE_STORAGE_LOCATION_INVALID_FB".."0",
        "SPACE_STORAGE_LOCATION_LOCAL_FB".."1",
        "SPACE_STORAGE_LOCATION_CLOUD_FB".."2"
    )

    XrResult(
        "QuerySpacesFB",
        """
        Queries for spatial entities.

        <h5>C Specification</h5>
        The #QuerySpacesFB() function is defined as:

        <pre><code>
￿XrResult xrQuerySpacesFB(
￿    XrSession                                   session,
￿    const XrSpaceQueryInfoBaseHeaderFB*         info,
￿    XrAsyncRequestIdFB*                         requestId);</code></pre>

        <h5>Description</h5>
        The #QuerySpacesFB() function enables an application to find and retrieve spatial entities from storage. Cast an ##XrSpaceQueryInfoFB pointer to a ##XrSpaceQueryInfoBaseHeaderFB pointer to pass as {@code info}. The application <b>should</b> keep the returned {@code requestId} for the duration of the request as it is used to refer to the request when calling #RetrieveSpaceQueryResultsFB() and is used to map completion events to the request. This operation is asynchronous and the runtime <b>must</b> post an ##XrEventDataSpaceQueryCompleteFB event when the operation completes successfully or encounters an error. If this function returns a failure code, no event is posted. The runtime <b>must</b> post an ##XrEventDataSpaceQueryResultsAvailableFB before ##XrEventDataSpaceQueryCompleteFB if any results are found. Once an ##XrEventDataSpaceQueryResultsAvailableFB event has been posted, the application <b>may</b> call #RetrieveSpaceQueryResultsFB() to retrieve the available results.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityQuery XR_FB_spatial_entity_query} extension <b>must</b> be enabled prior to calling #QuerySpacesFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code info} <b>must</b> be a pointer to a valid ##XrSpaceQueryInfoBaseHeaderFB-based structure. See also: ##XrSpaceQueryInfoFB</li>
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
        ##XrSpaceQueryInfoBaseHeaderFB
        """,

        XrSession("session", "a handle to an {@code XrSession}."),
        XrSpaceQueryInfoBaseHeaderFB.const.p("info", "a pointer to the ##XrSpaceQueryInfoBaseHeaderFB structure."),
        Check(1)..XrAsyncRequestIdFB.p("requestId", "an output parameter, and the variable it points to will be populated with the ID of this asynchronous request.")
    )

    XrResult(
        "RetrieveSpaceQueryResultsFB",
        """
        Copies query results into an output buffer.

        <h5>C Specification</h5>
        The #RetrieveSpaceQueryResultsFB() function is defined as:

        <pre><code>
￿XrResult xrRetrieveSpaceQueryResultsFB(
￿    XrSession                                   session,
￿    XrAsyncRequestIdFB                          requestId,
￿    XrSpaceQueryResultsFB*                      results);</code></pre>

        <h5>Description</h5>
        Allows an application to retrieve all available results for a specified query. Call this function once to get the number of results found and then once more to copy the results into a buffer provided by the application. The number of results will not change between the two calls used to retrieve results. This function <b>must</b> only retrieve each query result once. After the application has used this function to retrieve a query result, the runtime frees its copy. The runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if {@code requestId} refers to a request that is not yet complete, a request for which results have already been retrieved, or if {@code requestId} does not refer to a known request.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSpatialEntityQuery XR_FB_spatial_entity_query} extension <b>must</b> be enabled prior to calling #RetrieveSpaceQueryResultsFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code results} <b>must</b> be a pointer to an ##XrSpaceQueryResultsFB structure</li>
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
                <li>#ERROR_SIZE_INSUFFICIENT</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpaceQueryResultsFB
        """,

        XrSession("session", "the {@code XrSession} for which the in-progress query is valid."),
        XrAsyncRequestIdFB("requestId", "the {@code XrAsyncRequestIdFB} to enumerate results for."),
        XrSpaceQueryResultsFB.p("results", "a pointer to an ##XrSpaceQueryResultsFB to populate with results.")
    )
}