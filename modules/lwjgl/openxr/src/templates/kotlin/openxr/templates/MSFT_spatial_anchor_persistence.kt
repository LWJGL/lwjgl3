/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_spatial_anchor_persistence = "MSFTSpatialAnchorPersistence".nativeClassXR("MSFT_spatial_anchor_persistence", type = "instance", postfix = "MSFT") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "MSFT_spatial_anchor_persistence_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "MSFT_SPATIAL_ANCHOR_PERSISTENCE_EXTENSION_NAME".."XR_MSFT_spatial_anchor_persistence"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_SPATIAL_ANCHOR_STORE_CONNECTION_MSFT".."1000142000"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SPATIAL_ANCHOR_PERSISTENCE_INFO_MSFT".."1000142000",
        "TYPE_SPATIAL_ANCHOR_FROM_PERSISTED_ANCHOR_CREATE_INFO_MSFT".."1000142001"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT".."-1000142001",
        "ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT".."-1000142002"
    )

    EnumConstant(
        "XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT",

        "MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT".."256"
    )

    XrResult(
        "CreateSpatialAnchorStoreConnectionMSFT",
        """
        Create a handle to track a connection to the spatial anchor store.

        <h5>C Specification</h5>
        The application <b>can</b> use the #CreateSpatialAnchorStoreConnectionMSFT() function to create an handle to the spatial anchor store. The application <b>can</b> use this handle to interact with the spatial anchor store in order to persist anchors across application sessions.

        The #CreateSpatialAnchorStoreConnectionMSFT() function <b>may</b> be a slow operation and therefore <b>should</b> be invoked from a non-timing critical thread.

        <pre><code>
￿XrResult xrCreateSpatialAnchorStoreConnectionMSFT(
￿    XrSession                                   session,
￿    XrSpatialAnchorStoreConnectionMSFT*         spatialAnchorStore);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSpatialAnchorPersistence XR_MSFT_spatial_anchor_persistence} extension <b>must</b> be enabled prior to calling #CreateSpatialAnchorStoreConnectionMSFT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code spatialAnchorStore} <b>must</b> be a pointer to an {@code XrSpatialAnchorStoreConnectionMSFT} handle</li>
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
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
            </ul></dd>
        </dl>
        """,

        XrSession("session", "the {@code XrSession} the anchor was created with."),
        Check(1)..XrSpatialAnchorStoreConnectionMSFT.p("spatialAnchorStore", "a pointer to the {@code XrSpatialAnchorStoreConnectionMSFT} handle.")
    )

    XrResult(
        "DestroySpatialAnchorStoreConnectionMSFT",
        """
        Destroys the anchor store handle.

        <h5>C Specification</h5>
        The application <b>can</b> use the #DestroySpatialAnchorStoreConnectionMSFT() function to destroy an anchor store connection.

        <pre><code>
￿XrResult xrDestroySpatialAnchorStoreConnectionMSFT(
￿    XrSpatialAnchorStoreConnectionMSFT          spatialAnchorStore);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSpatialAnchorPersistence XR_MSFT_spatial_anchor_persistence} extension <b>must</b> be enabled prior to calling #DestroySpatialAnchorStoreConnectionMSFT()</li>
            <li>{@code spatialAnchorStore} <b>must</b> be a valid {@code XrSpatialAnchorStoreConnectionMSFT} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code spatialAnchorStore}, and any child handles, <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        XrSpatialAnchorStoreConnectionMSFT("spatialAnchorStore", "the {@code XrSpatialAnchorStoreConnectionMSFT} to be destroyed.")
    )

    XrResult(
        "PersistSpatialAnchorMSFT",
        """
        Persist the spatial anchor in the spatial anchor store.

        <h5>C Specification</h5>
        The application <b>can</b> use the #PersistSpatialAnchorMSFT() function to persist a spatial anchor in the spatial anchor store for this application. The given {@code spatialAnchorName} will be the string to retrieve the spatial anchor from the Spatial Anchor store or subsequently remove the record of this spatial anchor from the store. This name will uniquely identify the spatial anchor for the current application. If there is already a spatial anchor of the same name persisted in the spatial anchor store, the existing spatial anchor will be replaced and #PersistSpatialAnchorMSFT() <b>must</b> return #SUCCESS.

        <pre><code>
￿XrResult xrPersistSpatialAnchorMSFT(
￿    XrSpatialAnchorStoreConnectionMSFT          spatialAnchorStore,
￿    const XrSpatialAnchorPersistenceInfoMSFT*   spatialAnchorPersistenceInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSpatialAnchorPersistence XR_MSFT_spatial_anchor_persistence} extension <b>must</b> be enabled prior to calling #PersistSpatialAnchorMSFT()</li>
            <li>{@code spatialAnchorStore} <b>must</b> be a valid {@code XrSpatialAnchorStoreConnectionMSFT} handle</li>
            <li>{@code spatialAnchorPersistenceInfo} <b>must</b> be a pointer to a valid ##XrSpatialAnchorPersistenceInfoMSFT structure</li>
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
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpatialAnchorPersistenceInfoMSFT
        """,

        XrSpatialAnchorStoreConnectionMSFT("spatialAnchorStore", "the {@code XrSpatialAnchorStoreConnectionMSFT} with which to persist the {@code spatialAnchor}."),
        XrSpatialAnchorPersistenceInfoMSFT.const.p("spatialAnchorPersistenceInfo", "a pointer to ##XrSpatialAnchorPersistenceInfoMSFT structure to specify the anchor and its name to persist.")
    )

    XrResult(
        "EnumeratePersistedSpatialAnchorNamesMSFT",
        """
        Enumerate the names of currently persisted spatial anchors in the spatial anchor store.

        <h5>C Specification</h5>
        The application <b>can</b> use the #EnumeratePersistedSpatialAnchorNamesMSFT() function to enumerate the names of all spatial anchors currently persisted in the spatial anchor store for this application. This function follows the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#buffer-size-parameters">two-call idiom</a> for filling the {@code spatialAnchorNames}.

        <pre><code>
￿XrResult xrEnumeratePersistedSpatialAnchorNamesMSFT(
￿    XrSpatialAnchorStoreConnectionMSFT          spatialAnchorStore,
￿    uint32_t                                    spatialAnchorNamesCapacityInput,
￿    uint32_t*                                   spatialAnchorNamesCountOutput,
￿    XrSpatialAnchorPersistenceNameMSFT*         persistedAnchorNames);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSpatialAnchorPersistence XR_MSFT_spatial_anchor_persistence} extension <b>must</b> be enabled prior to calling #EnumeratePersistedSpatialAnchorNamesMSFT()</li>
            <li>{@code spatialAnchorStore} <b>must</b> be a valid {@code XrSpatialAnchorStoreConnectionMSFT} handle</li>
            <li>If {@code spatialAnchorNamesCountOutput} is not {@code NULL}, {@code spatialAnchorNamesCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code spatialAnchorNamesCapacityInput} is not 0, {@code persistedAnchorNames} <b>must</b> be a pointer to an array of {@code spatialAnchorNamesCapacityInput} ##XrSpatialAnchorPersistenceNameMSFT structures</li>
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
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_SIZE_INSUFFICIENT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpatialAnchorPersistenceNameMSFT
        """,

        XrSpatialAnchorStoreConnectionMSFT("spatialAnchorStore", "the {@code XrSpatialAnchorStoreConnectionMSFT} anchor store to perform the enumeration operation on."),
        AutoSize("persistedAnchorNames")..uint32_t("spatialAnchorNamesCapacityInput", "the capacity of the {@code spatialAnchorNames} array, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..nullable..uint32_t.p("spatialAnchorNamesCountOutput", "filled in by the runtime with the count of anchor names written or the required capacity in the case that {@code spatialAnchorNamesCapacityInput} is 0."),
        nullable..XrSpatialAnchorPersistenceNameMSFT.p("persistedAnchorNames", "a pointer to an array of ##XrSpatialAnchorPersistenceNameMSFT structures, but <b>can</b> be {@code NULL} if propertyCapacityInput is 0.")
    )

    XrResult(
        "CreateSpatialAnchorFromPersistedNameMSFT",
        """
        Create a spatial anchor from the spatial anchor store by name.

        <h5>C Specification</h5>
        The application <b>can</b> use the #CreateSpatialAnchorFromPersistedNameMSFT() function to create a {@code XrSpatialAnchorMSFT} from the spatial anchor store. If the {@code spatialAnchorName} provided does not correspond to a currently stored anchor (i.e. the list of spatial anchor names returned from #EnumeratePersistedSpatialAnchorNamesMSFT()), the function <b>must</b> return #ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT.

        <pre><code>
￿XrResult xrCreateSpatialAnchorFromPersistedNameMSFT(
￿    XrSession                                   session,
￿    const XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT* spatialAnchorCreateInfo,
￿    XrSpatialAnchorMSFT*                        spatialAnchor);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSpatialAnchorPersistence XR_MSFT_spatial_anchor_persistence} extension <b>must</b> be enabled prior to calling #CreateSpatialAnchorFromPersistedNameMSFT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code spatialAnchorCreateInfo} <b>must</b> be a pointer to a valid ##XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT structure</li>
            <li>{@code spatialAnchor} <b>must</b> be a pointer to an {@code XrSpatialAnchorMSFT} handle</li>
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
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT</li>
                <li>#ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT
        """,

        XrSession("session", "a handle to an {@code XrSession} previously created with #CreateSession()."),
        XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.const.p("spatialAnchorCreateInfo", "a pointer to the ##XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT."),
        Check(1)..XrSpatialAnchorMSFT.p("spatialAnchor", "a pointer to an {@code XrSpatialAnchorMSFT} handle that will be set by the runtime on successful load.")
    )

    XrResult(
        "UnpersistSpatialAnchorMSFT",
        """
        Removes an anchor from the store.

        <h5>C Specification</h5>
        The application <b>can</b> use the #UnpersistSpatialAnchorMSFT() function to remove the record of the anchor in the spatial anchor store. This operation will not affect any {@code XrSpatialAnchorMSFT} handles previously created. If the {@code spatialAnchorName} provided does not correspond to a currently stored anchor, the function <b>must</b> return #ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT.

        <pre><code>
￿XrResult xrUnpersistSpatialAnchorMSFT(
￿    XrSpatialAnchorStoreConnectionMSFT          spatialAnchorStore,
￿    const XrSpatialAnchorPersistenceNameMSFT*   spatialAnchorPersistenceName);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSpatialAnchorPersistence XR_MSFT_spatial_anchor_persistence} extension <b>must</b> be enabled prior to calling #UnpersistSpatialAnchorMSFT()</li>
            <li>{@code spatialAnchorStore} <b>must</b> be a valid {@code XrSpatialAnchorStoreConnectionMSFT} handle</li>
            <li>{@code spatialAnchorPersistenceName} <b>must</b> be a pointer to a valid ##XrSpatialAnchorPersistenceNameMSFT structure</li>
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
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT</li>
                <li>#ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpatialAnchorPersistenceNameMSFT
        """,

        XrSpatialAnchorStoreConnectionMSFT("spatialAnchorStore", "an {@code XrSpatialAnchorStoreConnectionMSFT} anchor store to perform the unpersist operation on."),
        XrSpatialAnchorPersistenceNameMSFT.const.p("spatialAnchorPersistenceName", "a pointer to the ##XrSpatialAnchorPersistenceNameMSFT.")
    )

    XrResult(
        "ClearSpatialAnchorStoreMSFT",
        """
        Clear all spatial anchors from the spatial anchor store.

        <h5>C Specification</h5>
        The application <b>can</b> use the #ClearSpatialAnchorStoreMSFT() function to remove all spatial anchors from the spatial anchor store for this application. The function only removes the record of the spatial anchors in the store but does not affect any {@code XrSpatialAnchorMSFT} handles previously loaded in the current session.

        <pre><code>
￿XrResult xrClearSpatialAnchorStoreMSFT(
￿    XrSpatialAnchorStoreConnectionMSFT          spatialAnchorStore);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSpatialAnchorPersistence XR_MSFT_spatial_anchor_persistence} extension <b>must</b> be enabled prior to calling #ClearSpatialAnchorStoreMSFT()</li>
            <li>{@code spatialAnchorStore} <b>must</b> be a valid {@code XrSpatialAnchorStoreConnectionMSFT} handle</li>
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
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        XrSpatialAnchorStoreConnectionMSFT("spatialAnchorStore", "{@code XrSpatialAnchorStoreConnectionMSFT} to perform the clear operation on.")
    )
}