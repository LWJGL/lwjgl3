/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_colocation_discovery = "METAColocationDiscovery".nativeClassXR("META_colocation_discovery", type = "instance", postfix = "META") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#XR_META_colocation_discovery">XR_META_colocation_discovery</a> extension.

        Colocation discovery is a capability available through the {@link METAColocationDiscovery XR_META_colocation_discovery} extension that allows apps to discover physically colocated devices running the same app.

        In the context of this extension, "the same application" means "bytewise identical Android package name" when running on an Android-based platform.
        """

    IntConstant(
        "The extension specification version.",

        "META_colocation_discovery_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "META_COLOCATION_DISCOVERY_EXTENSION_NAME".."XR_META_colocation_discovery"
    )

    EnumConstant(
        "XR_MAX_COLOCATION_DISCOVERY_BUFFER_SIZE_META",

        "MAX_COLOCATION_DISCOVERY_BUFFER_SIZE_META".."1024"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_COLOCATION_DISCOVERY_NETWORK_FAILED_META".."-1000571001",
        "ERROR_COLOCATION_DISCOVERY_NO_DISCOVERY_METHOD_META".."-1000571002",
        "COLOCATION_DISCOVERY_ALREADY_ADVERTISING_META".."1000571003",
        "COLOCATION_DISCOVERY_ALREADY_DISCOVERING_META".."1000571004"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_COLOCATION_DISCOVERY_START_INFO_META".."1000571010",
        "TYPE_COLOCATION_DISCOVERY_STOP_INFO_META".."1000571011",
        "TYPE_COLOCATION_ADVERTISEMENT_START_INFO_META".."1000571012",
        "TYPE_COLOCATION_ADVERTISEMENT_STOP_INFO_META".."1000571013",
        "TYPE_EVENT_DATA_START_COLOCATION_ADVERTISEMENT_COMPLETE_META".."1000571020",
        "TYPE_EVENT_DATA_STOP_COLOCATION_ADVERTISEMENT_COMPLETE_META".."1000571021",
        "TYPE_EVENT_DATA_COLOCATION_ADVERTISEMENT_COMPLETE_META".."1000571022",
        "TYPE_EVENT_DATA_START_COLOCATION_DISCOVERY_COMPLETE_META".."1000571023",
        "TYPE_EVENT_DATA_COLOCATION_DISCOVERY_RESULT_META".."1000571024",
        "TYPE_EVENT_DATA_COLOCATION_DISCOVERY_COMPLETE_META".."1000571025",
        "TYPE_EVENT_DATA_STOP_COLOCATION_DISCOVERY_COMPLETE_META".."1000571026",
        "TYPE_SYSTEM_COLOCATION_DISCOVERY_PROPERTIES_META".."1000571030"
    )

    XrResult(
        "StartColocationDiscoveryMETA",
        """
        Start colocation discovery.

        <h5>C Specification</h5>
        The #StartColocationDiscoveryMETA() function is defined as:

        <pre><code>
￿XrResult xrStartColocationDiscoveryMETA(
￿    XrSession                                   session,
￿    const XrColocationDiscoveryStartInfoMETA*   info,
￿    XrAsyncRequestIdFB*                         discoveryRequestId);</code></pre>

        <h5>Description</h5>
        The application <b>can</b> call #StartColocationDiscoveryMETA() to start discovering physically colocated devices.

        If the system does not support colocation advertisement and discovery, the runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED from #StartColocationDiscoveryMETA(). In this case, the runtime <b>must</b> return #FALSE for ##XrSystemColocationDiscoveryPropertiesMETA{@code ::supportsColocationDiscovery} when the function #GetSystemProperties() is called, so that the application knows to not use this functionality.

        This is an asynchronous operation. Completion results are conveyed in the event ##XrEventDataStartColocationDiscoveryCompleteMETA.

        If the asynchronous operation is scheduled successfully, the runtime <b>must</b> return #SUCCESS.

        If and only if the runtime returns #SUCCESS, the runtime <b>must</b> queue a single ##XrEventDataStartColocationDiscoveryCompleteMETA event identified with a {@code discoveryRequestId} matching the {@code discoveryRequestId} value output by this function, referred to as the "corresponding completion event."

        (This implies that if the runtime returns anything other than #SUCCESS, the runtime <b>must</b> not queue any ##XrEventDataStartColocationDiscoveryCompleteMETA events with {@code discoveryRequestId} field matching the {@code discoveryRequestId} populated by this function.)

        If the asynchronous operation is successful, in the corresponding completion event, the runtime <b>must</b> set the ##XrEventDataStartColocationDiscoveryCompleteMETA{@code ::result} field to #SUCCESS. The runtime <b>may</b> subsequently queue zero or more ##XrEventDataColocationDiscoveryResultMETA events asynchronously as the runtime discovers nearby advertisements. Once the application or runtime stops the colocation discovery, the runtime <b>must</b> queue a single ##XrEventDataColocationDiscoveryCompleteMETA event. All ##XrEventDataColocationDiscoveryResultMETA and ##XrEventDataColocationDiscoveryCompleteMETA events will identified with {@code discoveryRequestId} matching the value populated in {@code discoveryRequestId} by #StartColocationDiscoveryMETA().

        If the asynchronous operation is scheduled but not successful, in the corresponding completion event, the runtime <b>must</b> set the ##XrEventDataStartColocationDiscoveryCompleteMETA{@code ::result} field to an appropriate error code instead of #SUCCESS.

        If the application already has an active colocation discovery, in the corresponding completion event, the runtime <b>must</b> set the ##XrEventDataStartColocationDiscoveryCompleteMETA{@code ::result} field to #COLOCATION_DISCOVERY_ALREADY_DISCOVERING_META.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAColocationDiscovery XR_META_colocation_discovery} extension <b>must</b> be enabled prior to calling #StartColocationDiscoveryMETA()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code info} <b>must</b> be a pointer to a valid ##XrColocationDiscoveryStartInfoMETA structure</li>
            <li>{@code discoveryRequestId} <b>must</b> be a pointer to an {@code XrAsyncRequestIdFB} value</li>
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
                <li>#ERROR_RUNTIME_UNAVAILABLE</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
                <li>#ERROR_EXTENSION_NOT_PRESENT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrColocationDiscoveryStartInfoMETA, ##XrEventDataStartColocationDiscoveryCompleteMETA
        """,

        XrSession("session", "an {@code XrSession} in which the colocation discovery will be active."),
        XrColocationDiscoveryStartInfoMETA.const.p("info", "a pointer to ##XrColocationDiscoveryStartInfoMETA structure to specify the discovery request information."),
        Check(1)..XrAsyncRequestIdFB.p("discoveryRequestId", "an output parameter, and the variable it points to will be populated with the ID of this asynchronous request. Note that this ID is used for associating additional events with this original call, in addition to the typical completion event.")
    )

    XrResult(
        "StopColocationDiscoveryMETA",
        """
        Stop ongoing discovery process.

        <h5>C Specification</h5>
        The #StopColocationDiscoveryMETA() function is defined as:

        <pre><code>
￿XrResult xrStopColocationDiscoveryMETA(
￿    XrSession                                   session,
￿    const XrColocationDiscoveryStopInfoMETA*    info,
￿    XrAsyncRequestIdFB*                         requestId);</code></pre>

        <h5>Description</h5>
        The application <b>can</b> call #StopColocationDiscoveryMETA() to stop an ongoing discovery process that was started by #StartColocationDiscoveryMETA().

        If the system does not support colocation advertisement and discovery, the runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED from #StopColocationDiscoveryMETA(). In this case, the runtime <b>must</b> return #FALSE for ##XrSystemColocationDiscoveryPropertiesMETA{@code ::supportsColocationDiscovery} when the function #GetSystemProperties() is called, so that the application knows to not use this functionality.

        This is an asynchronous operation. Completion results are conveyed in the event ##XrEventDataStopColocationDiscoveryCompleteMETA.

        If the asynchronous operation is scheduled successfully, the runtime <b>must</b> return #SUCCESS.

        If and only if the runtime returns #SUCCESS, the runtime <b>must</b> queue a single ##XrEventDataStopColocationDiscoveryCompleteMETA event identified with a {@code requestId} matching the {@code requestId} value output by this function, referred to as the "corresponding completion event."

        (This implies that if the runtime returns anything other than #SUCCESS, the runtime <b>must</b> not queue any ##XrEventDataStopColocationDiscoveryCompleteMETA events with {@code requestId} field matching the {@code requestId} populated by this function.)

        If the asynchronous operation is successful, in the corresponding completion event, the runtime <b>must</b> set the ##XrEventDataStopColocationDiscoveryCompleteMETA{@code ::result} field to #SUCCESS.

        If the asynchronous operation is scheduled but not successful, in the corresponding completion event, the runtime <b>must</b> set the ##XrEventDataStopColocationDiscoveryCompleteMETA{@code ::result} field to an appropriate error code instead of #SUCCESS.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAColocationDiscovery XR_META_colocation_discovery} extension <b>must</b> be enabled prior to calling #StopColocationDiscoveryMETA()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code info} <b>must</b> be a pointer to a valid ##XrColocationDiscoveryStopInfoMETA structure</li>
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
                <li>#ERROR_RUNTIME_UNAVAILABLE</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
                <li>#ERROR_EXTENSION_NOT_PRESENT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrColocationDiscoveryStopInfoMETA, #StartColocationDiscoveryMETA()
        """,

        XrSession("session", "an {@code XrSession} in which the colocation discovery will be active."),
        XrColocationDiscoveryStopInfoMETA.const.p("info", "a pointer to ##XrColocationDiscoveryStopInfoMETA structure to specify the stop discovery request information."),
        Check(1)..XrAsyncRequestIdFB.p("requestId", "an output parameter, and the variable it points to will be populated with the ID of this asynchronous request.")
    )

    XrResult(
        "StartColocationAdvertisementMETA",
        """
        Start colocation visibility.

        <h5>C Specification</h5>
        The #StartColocationAdvertisementMETA() function is defined as:

        <pre><code>
￿XrResult xrStartColocationAdvertisementMETA(
￿    XrSession                                   session,
￿    const XrColocationAdvertisementStartInfoMETA* info,
￿    XrAsyncRequestIdFB*                         advertisementRequestId);</code></pre>

        <h5>Description</h5>
        The #StartColocationAdvertisementMETA() function requests that the current device become discoverable by other physically colocated devices running the same application.

        If the system does not support colocation advertisement and discovery, the runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED from #StartColocationAdvertisementMETA(). In this case, the runtime <b>must</b> return #FALSE for ##XrSystemColocationDiscoveryPropertiesMETA{@code ::supportsColocationDiscovery} when the function #GetSystemProperties() is called, so that the application knows to not use this functionality.

        This is an asynchronous operation. Completion results are conveyed in the event ##XrEventDataStartColocationAdvertisementCompleteMETA.

        If the asynchronous operation is scheduled successfully, the runtime <b>must</b> return #SUCCESS.

        If and only if the runtime returns #SUCCESS, the runtime <b>must</b> queue a single ##XrEventDataStartColocationAdvertisementCompleteMETA event identified with a {@code advertisementRequestId} matching the {@code advertisementRequestId} value output by this function, referred to as the "corresponding completion event."

        (This implies that if the runtime returns anything other than #SUCCESS, the runtime <b>must</b> not queue any ##XrEventDataStartColocationAdvertisementCompleteMETA events with {@code advertisementRequestId} field matching the {@code advertisementRequestId} populated by this function.)

        If the asynchronous operation is successful, in the corresponding completion event, the runtime <b>must</b> set the ##XrEventDataStartColocationAdvertisementCompleteMETA{@code ::result} field to #SUCCESS.

        If the asynchronous operation is scheduled but not successful, in the corresponding completion event, the runtime <b>must</b> set the ##XrEventDataStartColocationAdvertisementCompleteMETA{@code ::result} field to an appropriate error code instead of #SUCCESS.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAColocationDiscovery XR_META_colocation_discovery} extension <b>must</b> be enabled prior to calling #StartColocationAdvertisementMETA()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code info} <b>must</b> be a pointer to a valid ##XrColocationAdvertisementStartInfoMETA structure</li>
            <li>{@code advertisementRequestId} <b>must</b> be a pointer to an {@code XrAsyncRequestIdFB} value</li>
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
                <li>#ERROR_RUNTIME_UNAVAILABLE</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
                <li>#ERROR_EXTENSION_NOT_PRESENT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrColocationAdvertisementStartInfoMETA, ##XrEventDataStartColocationAdvertisementCompleteMETA
        """,

        XrSession("session", "an {@code XrSession} in which the colocation discovery will be active."),
        XrColocationAdvertisementStartInfoMETA.const.p("info", "a pointer to ##XrColocationAdvertisementStartInfoMETA structure to specify the visibility configuration."),
        Check(1)..XrAsyncRequestIdFB.p("advertisementRequestId", "an output parameter, and the variable it points to will be populated with the ID of this asynchronous request. Note that this ID is used for associating additional events with this original call, in addition to the typical completion event.")
    )

    XrResult(
        "StopColocationAdvertisementMETA",
        """
        Stop colocation advertisement.

        <h5>C Specification</h5>
        The #StopColocationAdvertisementMETA() function is defined as:

        <pre><code>
￿XrResult xrStopColocationAdvertisementMETA(
￿    XrSession                                   session,
￿    const XrColocationAdvertisementStopInfoMETA* info,
￿    XrAsyncRequestIdFB*                         requestId);</code></pre>

        <h5>Description</h5>
        The application <b>can</b> use the #StopColocationAdvertisementMETA() function to disable the ability for other physically colocated devices running the same application to discover the current device.

        If the system does not support colocation advertisement and discovery, the runtime <b>must</b> return #ERROR_FEATURE_UNSUPPORTED from #StopColocationAdvertisementMETA(). In this case, the runtime <b>must</b> return #FALSE for ##XrSystemColocationDiscoveryPropertiesMETA{@code ::supportsColocationDiscovery} when the function #GetSystemProperties() is called, so that the application knows to not use this functionality.

        This is an asynchronous operation. Completion results are conveyed in the event ##XrEventDataStopColocationAdvertisementCompleteMETA.

        If the asynchronous operation is scheduled successfully, the runtime <b>must</b> return #SUCCESS.

        If and only if the runtime returns #SUCCESS, the runtime <b>must</b> queue a single ##XrEventDataStopColocationAdvertisementCompleteMETA event identified with a {@code requestId} matching the {@code requestId} value output by this function, referred to as the "corresponding completion event."

        (This implies that if the runtime returns anything other than #SUCCESS, the runtime <b>must</b> not queue any ##XrEventDataStopColocationAdvertisementCompleteMETA events with {@code requestId} field matching the {@code requestId} populated by this function.)

        If the asynchronous operation is successful, in the corresponding completion event, the runtime <b>must</b> set the ##XrEventDataStopColocationAdvertisementCompleteMETA{@code ::result} field to #SUCCESS.

        If the asynchronous operation is scheduled but not successful, in the corresponding completion event, the runtime <b>must</b> set the ##XrEventDataStopColocationAdvertisementCompleteMETA{@code ::result} field to an appropriate error code instead of #SUCCESS.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link METAColocationDiscovery XR_META_colocation_discovery} extension <b>must</b> be enabled prior to calling #StopColocationAdvertisementMETA()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code info} <b>must</b> be a pointer to a valid ##XrColocationAdvertisementStopInfoMETA structure</li>
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
                <li>#ERROR_RUNTIME_UNAVAILABLE</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
                <li>#ERROR_EXTENSION_NOT_PRESENT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrColocationAdvertisementStopInfoMETA, ##XrEventDataStopColocationAdvertisementCompleteMETA, #StartColocationAdvertisementMETA()
        """,

        XrSession("session", "an {@code XrSession} in which the colocation discovery will be active."),
        XrColocationAdvertisementStopInfoMETA.const.p("info", "a pointer to ##XrColocationAdvertisementStopInfoMETA structure to specify the advertisement configuration."),
        Check(1)..XrAsyncRequestIdFB.p("requestId", "an output parameter, and the variable it points to will be populated with the ID of this asynchronous request.")
    )
}