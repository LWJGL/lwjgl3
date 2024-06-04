/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ML_localization_map = "MLLocalizationMap".nativeClassXR("ML_localization_map", type = "instance", postfix = "ML") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#XR_ML_localization_map">XR_ML_localization_map</a> extension.

        A Magic Leap localization map is a container that holds metadata about the scanned environment. It is a digital copy of a physical place. A localization map holds spatial anchors, dense mesh, planes, feature points, and positional data.

        <ul>
            <li>Spatial anchors - Used for persistent placement of content.</li>
            <li>Dense mesh - 3D triangulated geometry representing Magic Leap device understanding of the real-world geometry of an area.</li>
            <li>Planes - Large, flat surfaces derived from dense mesh data.</li>
        </ul>

        Localization maps <b>can</b> be created on device or in the Magic Leap AR Cloud. There are two types - "On Device" and "Cloud".

        <ul>
            <li>"On Device" for OpenXR (local space for MagicLeap) - are for a single device and <b>can</b> be shared via the export/import mechanism.</li>
            <li>"Cloud" for OpenXR (shared space for MagicLeap) - <b>can</b> be shared across multiple MagicLeap devices in the AR Cloud.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Localization Maps are called Spaces in the Magic Leap C-API.
        </div>

        <h5>Permissions</h5>
        Android applications <b>must</b> have the com.magicleap.permission.SPACE_MANAGER permission listed in their manifest to use these functions:

        <ul>
            <li>#QueryLocalizationMapsML()</li>
            <li>#RequestMapLocalizationML()</li>
        </ul>

        (protection level: normal)

        Android applications <b>must</b> have the com.magicleap.permission.SPACE_IMPORT_EXPORT permission listed in their manifest and granted to use these functions:

        <ul>
            <li>#ImportLocalizationMapML()</li>
            <li>#CreateExportedLocalizationMapML()</li>
        </ul>

        (protection level: dangerous)
        """

    IntConstant(
        "The extension specification version.",

        "ML_localization_map_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "ML_LOCALIZATION_MAP_EXTENSION_NAME".."XR_ML_localization_map"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_EXPORTED_LOCALIZATION_MAP_ML".."1000139000"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_LOCALIZATION_MAP_ML".."1000139000",
        "TYPE_EVENT_DATA_LOCALIZATION_CHANGED_ML".."1000139001",
        "TYPE_MAP_LOCALIZATION_REQUEST_INFO_ML".."1000139002",
        "TYPE_LOCALIZATION_MAP_IMPORT_INFO_ML".."1000139003",
        "TYPE_LOCALIZATION_ENABLE_EVENTS_INFO_ML".."1000139004"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_LOCALIZATION_MAP_INCOMPATIBLE_ML".."-1000139000",
        "ERROR_LOCALIZATION_MAP_UNAVAILABLE_ML".."-1000139001",
        "ERROR_LOCALIZATION_MAP_FAIL_ML".."-1000139002",
        "ERROR_LOCALIZATION_MAP_IMPORT_EXPORT_PERMISSION_DENIED_ML".."-1000139003",
        "ERROR_LOCALIZATION_MAP_PERMISSION_DENIED_ML".."-1000139004",
        "ERROR_LOCALIZATION_MAP_ALREADY_EXISTS_ML".."-1000139005",
        "ERROR_LOCALIZATION_MAP_CANNOT_EXPORT_CLOUD_MAP_ML".."-1000139006"
    )

    EnumConstant(
        "Extends {@code XrReferenceSpaceType}.",

        "REFERENCE_SPACE_TYPE_LOCALIZATION_MAP_ML".."1000139000"
    )

    EnumConstant(
        "XR_MAX_LOCALIZATION_MAP_NAME_LENGTH_ML",

        "MAX_LOCALIZATION_MAP_NAME_LENGTH_ML".."64"
    )

    EnumConstant(
        """
        XrLocalizationMapStateML - Localization Map State

        <h5>Description</h5>
        <table class="lwjgl">
            <thead><tr><th>Enum</th><th>Description</th></tr></thead>
            <tbody>
                <tr><td>#LOCALIZATION_MAP_STATE_NOT_LOCALIZED_ML</td><td>The system is not localized into a map. Features like Spatial Anchors relying on localization will not work.</td></tr>
                <tr><td>#LOCALIZATION_MAP_STATE_LOCALIZED_ML</td><td>The system is localized into a map.</td></tr>
                <tr><td>#LOCALIZATION_MAP_STATE_LOCALIZATION_PENDING_ML</td><td>The system is localizing into a map.</td></tr>
                <tr><td>#LOCALIZATION_MAP_STATE_LOCALIZATION_SLEEPING_BEFORE_RETRY_ML</td><td>Initial localization failed, the system will retry localization.</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        ##XrEventDataLocalizationChangedML
        """,

        "LOCALIZATION_MAP_STATE_NOT_LOCALIZED_ML".."0",
        "LOCALIZATION_MAP_STATE_LOCALIZED_ML".."1",
        "LOCALIZATION_MAP_STATE_LOCALIZATION_PENDING_ML".."2",
        "LOCALIZATION_MAP_STATE_LOCALIZATION_SLEEPING_BEFORE_RETRY_ML".."3"
    )

    EnumConstant(
        """
        XrLocalizationMapTypeML - Localization Map Type

        <h5>Description</h5>
        <table class="lwjgl">
            <thead><tr><th>Enum</th><th>Description</th></tr></thead>
            <tbody>
                <tr><td>#LOCALIZATION_MAP_TYPE_ON_DEVICE_ML</td><td>The system is localized into an On-Device map, published anchors are not shared between different devices.</td></tr>
                <tr><td>#LOCALIZATION_MAP_TYPE_CLOUD_ML</td><td>The system is localized into a Cloud Map, anchors are shared per cloud account settings.</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        ##XrLocalizationMapML
        """,

        "LOCALIZATION_MAP_TYPE_ON_DEVICE_ML".."0",
        "LOCALIZATION_MAP_TYPE_CLOUD_ML".."1"
    )

    EnumConstant(
        """
        XrLocalizationMapConfidenceML - Localization Confidence

        <h5>Description</h5>
        <table class="lwjgl">
            <thead><tr><th>Enum</th><th>Description</th></tr></thead>
            <tbody>
                <tr><td>#LOCALIZATION_MAP_CONFIDENCE_POOR_ML</td><td>The localization map has poor confidence, systems relying on the localization map are likely to have poor performance.</td></tr>
                <tr><td>#LOCALIZATION_MAP_CONFIDENCE_FAIR_ML</td><td>The confidence is fair, current environmental conditions may adversely affect localization.</td></tr>
                <tr><td>#LOCALIZATION_MAP_CONFIDENCE_GOOD_ML</td><td>The confidence is high, persistent content should be stable.</td></tr>
                <tr><td>#LOCALIZATION_MAP_CONFIDENCE_EXCELLENT_ML</td><td>This is a very high-confidence localization, persistent content will be very stable.</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        ##XrEventDataLocalizationChangedML
        """,

        "LOCALIZATION_MAP_CONFIDENCE_POOR_ML".."0",
        "LOCALIZATION_MAP_CONFIDENCE_FAIR_ML".."1",
        "LOCALIZATION_MAP_CONFIDENCE_GOOD_ML".."2",
        "LOCALIZATION_MAP_CONFIDENCE_EXCELLENT_ML".."3"
    )

    EnumConstant(
        """
        XrLocalizationMapErrorFlagBitsML - The world meshing detector flags.

        <h5>Description</h5>
        The flag bits have the following meanings:

        <h5>Flag Descriptions</h5>
        <ul>
            <li>#LOCALIZATION_MAP_ERROR_UNKNOWN_BIT_ML — Localization failed for an unknown reason.</li>
            <li>#LOCALIZATION_MAP_ERROR_OUT_OF_MAPPED_AREA_BIT_ML — Localization failed because the user is outside of the mapped area.</li>
            <li>#LOCALIZATION_MAP_ERROR_LOW_FEATURE_COUNT_BIT_ML — There are not enough features in the environment to successfully localize.</li>
            <li>#LOCALIZATION_MAP_ERROR_EXCESSIVE_MOTION_BIT_ML — Localization failed due to excessive motion.</li>
            <li>#LOCALIZATION_MAP_ERROR_LOW_LIGHT_BIT_ML — Localization failed because the lighting levels are too low in the environment.</li>
            <li>#LOCALIZATION_MAP_ERROR_HEADPOSE_BIT_ML — A headpose failure caused localization to be unsuccessful.</li>
        </ul>
        """,

        "LOCALIZATION_MAP_ERROR_UNKNOWN_BIT_ML".enum(0x00000001),
        "LOCALIZATION_MAP_ERROR_OUT_OF_MAPPED_AREA_BIT_ML".enum(0x00000002),
        "LOCALIZATION_MAP_ERROR_LOW_FEATURE_COUNT_BIT_ML".enum(0x00000004),
        "LOCALIZATION_MAP_ERROR_EXCESSIVE_MOTION_BIT_ML".enum(0x00000008),
        "LOCALIZATION_MAP_ERROR_LOW_LIGHT_BIT_ML".enum(0x00000010),
        "LOCALIZATION_MAP_ERROR_HEADPOSE_BIT_ML".enum(0x00000020)
    )

    XrResult(
        "EnableLocalizationEventsML",
        """
        Retrieve the current localization status.

        <h5>C Specification</h5>
        The #EnableLocalizationEventsML() function is defined as:

        <pre><code>
￿XrResult xrEnableLocalizationEventsML(
￿    XrSession                                   session,
￿    const XrLocalizationEnableEventsInfoML *    info);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLLocalizationMap XR_ML_localization_map} extension <b>must</b> be enabled prior to calling #EnableLocalizationEventsML()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code info} <b>must</b> be a pointer to a valid ##XrLocalizationEnableEventsInfoML structure</li>
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
                <li>#ERROR_LOCALIZATION_MAP_PERMISSION_DENIED_ML</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrEventDataLocalizationChangedML, ##XrLocalizationEnableEventsInfoML
        """,

        XrSession("session", "a handle to an {@code XrSession} previously created with #CreateSession()."),
        XrLocalizationEnableEventsInfoML.const.p("info", "a pointer to an ##XrLocalizationEnableEventsInfoML structure.")
    )

    XrResult(
        "QueryLocalizationMapsML",
        """
        Query the available localization maps.

        <h5>C Specification</h5>
        The #QueryLocalizationMapsML() function is defined as:

        <pre><code>
￿XrResult xrQueryLocalizationMapsML(
￿    XrSession                                   session,
￿    const XrLocalizationMapQueryInfoBaseHeaderML* queryInfo,
￿    uint32_t                                    mapCapacityInput,
￿    uint32_t *                                  mapCountOutput,
￿    XrLocalizationMapML*                        maps);</code></pre>

        <h5>Description</h5>
        The list of localization maps returned will depend on the current device mapping mode. Only the localization maps associated with the current mapping mode will be returned by this call. Device mapping mode (e.g. #LOCALIZATION_MAP_TYPE_ON_DEVICE_ML or #LOCALIZATION_MAP_TYPE_CLOUD_ML) <b>can</b> only be changed via the system application(s).

        The list of maps known to the runtime <b>may</b> change between the two calls to #QueryLocalizationMapsML(). This is however a rare occurrence and the application <b>may</b> retry the call again if it receives #ERROR_SIZE_INSUFFICIENT.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLLocalizationMap XR_ML_localization_map} extension <b>must</b> be enabled prior to calling #QueryLocalizationMapsML()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>If {@code queryInfo} is not {@code NULL}, {@code queryInfo} <b>must</b> be a pointer to a valid ##XrLocalizationMapQueryInfoBaseHeaderML-based structure</li>
            <li>{@code mapCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code mapCapacityInput} is not 0, {@code maps} <b>must</b> be a pointer to an array of {@code mapCapacityInput} ##XrLocalizationMapML structures</li>
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
                <li>#ERROR_LOCALIZATION_MAP_PERMISSION_DENIED_ML</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrLocalizationMapML, ##XrLocalizationMapQueryInfoBaseHeaderML
        """,

        XrSession("session", "a handle to an {@code XrSession} previously created with #CreateSession()."),
        nullable..XrLocalizationMapQueryInfoBaseHeaderML.const.p("queryInfo", "an <b>optional</b> enumeration filter based on ##XrLocalizationMapQueryInfoBaseHeaderML to use."),
        AutoSize("maps")..uint32_t("mapCapacityInput", "the capacity of the maps array, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("mapCountOutput", "filled in by the runtime with the count of {@code maps} written or the required capacity in the case that {@code mapCapacityInput} is insufficient."),
        nullable..XrLocalizationMapML.p("maps", "an array of ##XrLocalizationMapML filled in by the runtime, but <b>can</b> be {@code NULL} if {@code mapCapacityInput} is 0.")
    )

    XrResult(
        "RequestMapLocalizationML",
        """
        Requests a localization map.

        <h5>C Specification</h5>
        The #RequestMapLocalizationML() function is defined as:

        <pre><code>
￿XrResult xrRequestMapLocalizationML(
￿    XrSession                                   session,
￿    const XrMapLocalizationRequestInfoML*       requestInfo);</code></pre>

        <h5>Description</h5>
        This is an asynchronous request. Listen for ##XrEventDataLocalizationChangedML events to get the results of the localization. A new request for localization will override all the past requests for localization that are yet to be completed.

        The runtime <b>must</b> return #ERROR_LOCALIZATION_MAP_UNAVAILABLE_ML if the requested is not a map known to the runtime.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLLocalizationMap XR_ML_localization_map} extension <b>must</b> be enabled prior to calling #RequestMapLocalizationML()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code requestInfo} <b>must</b> be a pointer to a valid ##XrMapLocalizationRequestInfoML structure</li>
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
                <li>#ERROR_LOCALIZATION_MAP_UNAVAILABLE_ML</li>
                <li>#ERROR_LOCALIZATION_MAP_PERMISSION_DENIED_ML</li>
                <li>#ERROR_LOCALIZATION_MAP_FAIL_ML</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrMapLocalizationRequestInfoML
        """,

        XrSession("session", "a handle to an {@code XrSession} previously created with #CreateSession()."),
        XrMapLocalizationRequestInfoML.const.p("requestInfo", "contains ##XrMapLocalizationRequestInfoML on the localization map to request.")
    )

    XrResult(
        "ImportLocalizationMapML",
        """
        Imports a localization map.

        <h5>C Specification</h5>
        The #ImportLocalizationMapML() function is defined as:

        <pre><code>
￿XrResult xrImportLocalizationMapML(
￿    XrSession                                   session,
￿    const XrLocalizationMapImportInfoML*        importInfo,
￿    XrUuidEXT*                                  mapUuid);</code></pre>

        <h5>Description</h5>
        The runtime <b>must</b> return #ERROR_LOCALIZATION_MAP_ALREADY_EXISTS_ML if the map that is being imported already exists. The runtime <b>must</b> return #ERROR_LOCALIZATION_MAP_INCOMPATIBLE_ML if the map being imported is not compatible.

        #ImportLocalizationMapML() <b>may</b> take a long time to complete; as such applications <b>should</b> not call this from the frame loop.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLLocalizationMap XR_ML_localization_map} extension <b>must</b> be enabled prior to calling #ImportLocalizationMapML()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code importInfo} <b>must</b> be a pointer to a valid ##XrLocalizationMapImportInfoML structure</li>
            <li>If {@code mapUuid} is not {@code NULL}, {@code mapUuid} <b>must</b> be a pointer to an ##XrUuidEXT structure</li>
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
                <li>#ERROR_LOCALIZATION_MAP_INCOMPATIBLE_ML</li>
                <li>#ERROR_LOCALIZATION_MAP_IMPORT_EXPORT_PERMISSION_DENIED_ML</li>
                <li>#ERROR_LOCALIZATION_MAP_ALREADY_EXISTS_ML</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrLocalizationMapImportInfoML, ##XrUuidEXT
        """,

        XrSession("session", "a handle to an {@code XrSession} previously created with #CreateSession()."),
        XrLocalizationMapImportInfoML.const.p("importInfo", "contains ##XrLocalizationMapImportInfoML on the localization map to import."),
        nullable..XrUuidEXT.p("mapUuid", "the ##XrUuidEXT of the newly imported localization map filled in by the runtime.")
    )

    XrResult(
        "CreateExportedLocalizationMapML",
        """
        Creates an exported localization map handle.

        <h5>C Specification</h5>
        The #CreateExportedLocalizationMapML() function is defined as:

        <pre><code>
￿XrResult xrCreateExportedLocalizationMapML(
￿    XrSession                                   session,
￿    const XrUuidEXT*                            mapUuid,
￿    XrExportedLocalizationMapML*                map);</code></pre>

        <h5>Description</h5>
        #CreateExportedLocalizationMapML() creates a frozen copy of the {@code mapUuid} localization map that <b>can</b> be exported using #GetExportedLocalizationMapDataML(). Applications <b>should</b> call #DestroyExportedLocalizationMapML() once they are done with the data.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLLocalizationMap XR_ML_localization_map} extension <b>must</b> be enabled prior to calling #CreateExportedLocalizationMapML()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code mapUuid} <b>must</b> be a pointer to a valid ##XrUuidEXT structure</li>
            <li>{@code map} <b>must</b> be a pointer to an {@code XrExportedLocalizationMapML} handle</li>
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
                <li>#ERROR_LOCALIZATION_MAP_UNAVAILABLE_ML</li>
                <li>#ERROR_LOCALIZATION_MAP_IMPORT_EXPORT_PERMISSION_DENIED_ML</li>
                <li>#ERROR_LOCALIZATION_MAP_CANNOT_EXPORT_CLOUD_MAP_ML</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrUuidEXT, #GetExportedLocalizationMapDataML()
        """,

        XrSession("session", "a handle to an {@code XrSession} previously created with #CreateSession()."),
        XrUuidEXT.const.p("mapUuid", "a pointer to the uuid of the map to export."),
        Check(1)..XrExportedLocalizationMapML.p("map", "a pointer to a map handle filled in by the runtime.")
    )

    XrResult(
        "DestroyExportedLocalizationMapML",
        """
        Destroys an exported localization map.

        <h5>C Specification</h5>
        The #DestroyExportedLocalizationMapML() function is defined as:

        <pre><code>
￿XrResult xrDestroyExportedLocalizationMapML(
￿    XrExportedLocalizationMapML                 map);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLLocalizationMap XR_ML_localization_map} extension <b>must</b> be enabled prior to calling #DestroyExportedLocalizationMapML()</li>
            <li>{@code map} <b>must</b> be a valid {@code XrExportedLocalizationMapML} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code map}, and any child handles, <b>must</b> be externally synchronized</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #CreateExportedLocalizationMapML()
        """,

        XrExportedLocalizationMapML("map", "the map to destroy.")
    )

    XrResult(
        "GetExportedLocalizationMapDataML",
        """
        Returns the exported localization map data.

        <h5>C Specification</h5>
        The #GetExportedLocalizationMapDataML() function is defined as:

        <pre><code>
￿XrResult xrGetExportedLocalizationMapDataML(
￿    XrExportedLocalizationMapML                 map,
￿    uint32_t                                    bufferCapacityInput,
￿    uint32_t*                                   bufferCountOutput,
￿    char*                                       buffer);</code></pre>

        <h5>Description</h5>
        #GetExportedLocalizationMapDataML() <b>may</b> take a long time to complete; as such applications <b>should</b> not call this from the frame loop.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLLocalizationMap XR_ML_localization_map} extension <b>must</b> be enabled prior to calling #GetExportedLocalizationMapDataML()</li>
            <li>{@code map} <b>must</b> be a valid {@code XrExportedLocalizationMapML} handle</li>
            <li>{@code bufferCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code bufferCapacityInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferCapacityInput} char values</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #CreateExportedLocalizationMapML()
        """,

        XrExportedLocalizationMapML("map", "the map to export."),
        AutoSize("buffer")..uint32_t("bufferCapacityInput", "the capacity of the buffer array, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("bufferCountOutput", "filled in by the runtime with the count of bytes written or the required capacity in the case that bufferCapacityInput is insufficient."),
        nullable..char.p("buffer", "an array of bytes filled in by the runtime.")
    )
}