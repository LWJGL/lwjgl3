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
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#XR_META_colocation_discovery">XR_META_colocation_discovery</a> extension.
 * 
 * <p>Colocation discovery is a capability available through the {@link METAColocationDiscovery XR_META_colocation_discovery} extension that allows apps to discover physically colocated devices running the same app.</p>
 * 
 * <p>In the context of this extension, "the same application" means "bytewise identical Android package name" when running on an Android-based platform.</p>
 */
public class METAColocationDiscovery {

    /** The extension specification version. */
    public static final int XR_META_colocation_discovery_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_META_COLOCATION_DISCOVERY_EXTENSION_NAME = "XR_META_colocation_discovery";

    /** XR_MAX_COLOCATION_DISCOVERY_BUFFER_SIZE_META */
    public static final int XR_MAX_COLOCATION_DISCOVERY_BUFFER_SIZE_META = 1024;

    /**
     * Extends {@code XrResult}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_ERROR_COLOCATION_DISCOVERY_NETWORK_FAILED_META ERROR_COLOCATION_DISCOVERY_NETWORK_FAILED_META}</li>
     * <li>{@link #XR_ERROR_COLOCATION_DISCOVERY_NO_DISCOVERY_METHOD_META ERROR_COLOCATION_DISCOVERY_NO_DISCOVERY_METHOD_META}</li>
     * <li>{@link #XR_COLOCATION_DISCOVERY_ALREADY_ADVERTISING_META COLOCATION_DISCOVERY_ALREADY_ADVERTISING_META}</li>
     * <li>{@link #XR_COLOCATION_DISCOVERY_ALREADY_DISCOVERING_META COLOCATION_DISCOVERY_ALREADY_DISCOVERING_META}</li>
     * </ul>
     */
    public static final int
        XR_ERROR_COLOCATION_DISCOVERY_NETWORK_FAILED_META      = -1000571001,
        XR_ERROR_COLOCATION_DISCOVERY_NO_DISCOVERY_METHOD_META = -1000571002,
        XR_COLOCATION_DISCOVERY_ALREADY_ADVERTISING_META       = 1000571003,
        XR_COLOCATION_DISCOVERY_ALREADY_DISCOVERING_META       = 1000571004;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_COLOCATION_DISCOVERY_START_INFO_META TYPE_COLOCATION_DISCOVERY_START_INFO_META}</li>
     * <li>{@link #XR_TYPE_COLOCATION_DISCOVERY_STOP_INFO_META TYPE_COLOCATION_DISCOVERY_STOP_INFO_META}</li>
     * <li>{@link #XR_TYPE_COLOCATION_ADVERTISEMENT_START_INFO_META TYPE_COLOCATION_ADVERTISEMENT_START_INFO_META}</li>
     * <li>{@link #XR_TYPE_COLOCATION_ADVERTISEMENT_STOP_INFO_META TYPE_COLOCATION_ADVERTISEMENT_STOP_INFO_META}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_START_COLOCATION_ADVERTISEMENT_COMPLETE_META TYPE_EVENT_DATA_START_COLOCATION_ADVERTISEMENT_COMPLETE_META}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_STOP_COLOCATION_ADVERTISEMENT_COMPLETE_META TYPE_EVENT_DATA_STOP_COLOCATION_ADVERTISEMENT_COMPLETE_META}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_COLOCATION_ADVERTISEMENT_COMPLETE_META TYPE_EVENT_DATA_COLOCATION_ADVERTISEMENT_COMPLETE_META}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_START_COLOCATION_DISCOVERY_COMPLETE_META TYPE_EVENT_DATA_START_COLOCATION_DISCOVERY_COMPLETE_META}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_COLOCATION_DISCOVERY_RESULT_META TYPE_EVENT_DATA_COLOCATION_DISCOVERY_RESULT_META}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_COLOCATION_DISCOVERY_COMPLETE_META TYPE_EVENT_DATA_COLOCATION_DISCOVERY_COMPLETE_META}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_STOP_COLOCATION_DISCOVERY_COMPLETE_META TYPE_EVENT_DATA_STOP_COLOCATION_DISCOVERY_COMPLETE_META}</li>
     * <li>{@link #XR_TYPE_SYSTEM_COLOCATION_DISCOVERY_PROPERTIES_META TYPE_SYSTEM_COLOCATION_DISCOVERY_PROPERTIES_META}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_COLOCATION_DISCOVERY_START_INFO_META                    = 1000571010,
        XR_TYPE_COLOCATION_DISCOVERY_STOP_INFO_META                     = 1000571011,
        XR_TYPE_COLOCATION_ADVERTISEMENT_START_INFO_META                = 1000571012,
        XR_TYPE_COLOCATION_ADVERTISEMENT_STOP_INFO_META                 = 1000571013,
        XR_TYPE_EVENT_DATA_START_COLOCATION_ADVERTISEMENT_COMPLETE_META = 1000571020,
        XR_TYPE_EVENT_DATA_STOP_COLOCATION_ADVERTISEMENT_COMPLETE_META  = 1000571021,
        XR_TYPE_EVENT_DATA_COLOCATION_ADVERTISEMENT_COMPLETE_META       = 1000571022,
        XR_TYPE_EVENT_DATA_START_COLOCATION_DISCOVERY_COMPLETE_META     = 1000571023,
        XR_TYPE_EVENT_DATA_COLOCATION_DISCOVERY_RESULT_META             = 1000571024,
        XR_TYPE_EVENT_DATA_COLOCATION_DISCOVERY_COMPLETE_META           = 1000571025,
        XR_TYPE_EVENT_DATA_STOP_COLOCATION_DISCOVERY_COMPLETE_META      = 1000571026,
        XR_TYPE_SYSTEM_COLOCATION_DISCOVERY_PROPERTIES_META             = 1000571030;

    protected METAColocationDiscovery() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrStartColocationDiscoveryMETA ] ---

    /** Unsafe version of: {@link #xrStartColocationDiscoveryMETA StartColocationDiscoveryMETA} */
    public static int nxrStartColocationDiscoveryMETA(XrSession session, long info, long discoveryRequestId) {
        long __functionAddress = session.getCapabilities().xrStartColocationDiscoveryMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), info, discoveryRequestId, __functionAddress);
    }

    /**
     * Start colocation discovery.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrStartColocationDiscoveryMETA StartColocationDiscoveryMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrStartColocationDiscoveryMETA(
     *     XrSession                                   session,
     *     const XrColocationDiscoveryStartInfoMETA*   info,
     *     XrAsyncRequestIdFB*                         discoveryRequestId);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The application <b>can</b> call {@link #xrStartColocationDiscoveryMETA StartColocationDiscoveryMETA} to start discovering physically colocated devices.</p>
     * 
     * <p>If the system does not support colocation advertisement and discovery, the runtime <b>must</b> return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} from {@link #xrStartColocationDiscoveryMETA StartColocationDiscoveryMETA}. In this case, the runtime <b>must</b> return {@link XR10#XR_FALSE FALSE} for {@link XrSystemColocationDiscoveryPropertiesMETA}{@code ::supportsColocationDiscovery} when the function {@link XR10#xrGetSystemProperties GetSystemProperties} is called, so that the application knows to not use this functionality.</p>
     * 
     * <p>This is an asynchronous operation. Completion results are conveyed in the event {@link XrEventDataStartColocationDiscoveryCompleteMETA}.</p>
     * 
     * <p>If the asynchronous operation is scheduled successfully, the runtime <b>must</b> return {@link XR10#XR_SUCCESS SUCCESS}.</p>
     * 
     * <p>If and only if the runtime returns {@link XR10#XR_SUCCESS SUCCESS}, the runtime <b>must</b> queue a single {@link XrEventDataStartColocationDiscoveryCompleteMETA} event identified with a {@code discoveryRequestId} matching the {@code discoveryRequestId} value output by this function, referred to as the "corresponding completion event."</p>
     * 
     * <p>(This implies that if the runtime returns anything other than {@link XR10#XR_SUCCESS SUCCESS}, the runtime <b>must</b> not queue any {@link XrEventDataStartColocationDiscoveryCompleteMETA} events with {@code discoveryRequestId} field matching the {@code discoveryRequestId} populated by this function.)</p>
     * 
     * <p>If the asynchronous operation is successful, in the corresponding completion event, the runtime <b>must</b> set the {@link XrEventDataStartColocationDiscoveryCompleteMETA}{@code ::result} field to {@link XR10#XR_SUCCESS SUCCESS}. The runtime <b>may</b> subsequently queue zero or more {@link XrEventDataColocationDiscoveryResultMETA} events asynchronously as the runtime discovers nearby advertisements. Once the application or runtime stops the colocation discovery, the runtime <b>must</b> queue a single {@link XrEventDataColocationDiscoveryCompleteMETA} event. All {@link XrEventDataColocationDiscoveryResultMETA} and {@link XrEventDataColocationDiscoveryCompleteMETA} events will identified with {@code discoveryRequestId} matching the value populated in {@code discoveryRequestId} by {@link #xrStartColocationDiscoveryMETA StartColocationDiscoveryMETA}.</p>
     * 
     * <p>If the asynchronous operation is scheduled but not successful, in the corresponding completion event, the runtime <b>must</b> set the {@link XrEventDataStartColocationDiscoveryCompleteMETA}{@code ::result} field to an appropriate error code instead of {@link XR10#XR_SUCCESS SUCCESS}.</p>
     * 
     * <p>If the application already has an active colocation discovery, in the corresponding completion event, the runtime <b>must</b> set the {@link XrEventDataStartColocationDiscoveryCompleteMETA}{@code ::result} field to {@link #XR_COLOCATION_DISCOVERY_ALREADY_DISCOVERING_META COLOCATION_DISCOVERY_ALREADY_DISCOVERING_META}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METAColocationDiscovery XR_META_colocation_discovery} extension <b>must</b> be enabled prior to calling {@link #xrStartColocationDiscoveryMETA StartColocationDiscoveryMETA}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code info} <b>must</b> be a pointer to a valid {@link XrColocationDiscoveryStartInfoMETA} structure</li>
     * <li>{@code discoveryRequestId} <b>must</b> be a pointer to an {@code XrAsyncRequestIdFB} value</li>
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
     * <li>{@link XR10#XR_ERROR_RUNTIME_UNAVAILABLE ERROR_RUNTIME_UNAVAILABLE}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_EXTENSION_NOT_PRESENT ERROR_EXTENSION_NOT_PRESENT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrColocationDiscoveryStartInfoMETA}, {@link XrEventDataStartColocationDiscoveryCompleteMETA}</p>
     *
     * @param session            an {@code XrSession} in which the colocation discovery will be active.
     * @param info               a pointer to {@link XrColocationDiscoveryStartInfoMETA} structure to specify the discovery request information.
     * @param discoveryRequestId an output parameter, and the variable it points to will be populated with the ID of this asynchronous request. Note that this ID is used for associating additional events with this original call, in addition to the typical completion event.
     */
    @NativeType("XrResult")
    public static int xrStartColocationDiscoveryMETA(XrSession session, @NativeType("XrColocationDiscoveryStartInfoMETA const *") XrColocationDiscoveryStartInfoMETA info, @NativeType("XrAsyncRequestIdFB *") LongBuffer discoveryRequestId) {
        if (CHECKS) {
            check(discoveryRequestId, 1);
        }
        return nxrStartColocationDiscoveryMETA(session, info.address(), memAddress(discoveryRequestId));
    }

    // --- [ xrStopColocationDiscoveryMETA ] ---

    /** Unsafe version of: {@link #xrStopColocationDiscoveryMETA StopColocationDiscoveryMETA} */
    public static int nxrStopColocationDiscoveryMETA(XrSession session, long info, long requestId) {
        long __functionAddress = session.getCapabilities().xrStopColocationDiscoveryMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), info, requestId, __functionAddress);
    }

    /**
     * Stop ongoing discovery process.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrStopColocationDiscoveryMETA StopColocationDiscoveryMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrStopColocationDiscoveryMETA(
     *     XrSession                                   session,
     *     const XrColocationDiscoveryStopInfoMETA*    info,
     *     XrAsyncRequestIdFB*                         requestId);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The application <b>can</b> call {@link #xrStopColocationDiscoveryMETA StopColocationDiscoveryMETA} to stop an ongoing discovery process that was started by {@link #xrStartColocationDiscoveryMETA StartColocationDiscoveryMETA}.</p>
     * 
     * <p>If the system does not support colocation advertisement and discovery, the runtime <b>must</b> return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} from {@link #xrStopColocationDiscoveryMETA StopColocationDiscoveryMETA}. In this case, the runtime <b>must</b> return {@link XR10#XR_FALSE FALSE} for {@link XrSystemColocationDiscoveryPropertiesMETA}{@code ::supportsColocationDiscovery} when the function {@link XR10#xrGetSystemProperties GetSystemProperties} is called, so that the application knows to not use this functionality.</p>
     * 
     * <p>This is an asynchronous operation. Completion results are conveyed in the event {@link XrEventDataStopColocationDiscoveryCompleteMETA}.</p>
     * 
     * <p>If the asynchronous operation is scheduled successfully, the runtime <b>must</b> return {@link XR10#XR_SUCCESS SUCCESS}.</p>
     * 
     * <p>If and only if the runtime returns {@link XR10#XR_SUCCESS SUCCESS}, the runtime <b>must</b> queue a single {@link XrEventDataStopColocationDiscoveryCompleteMETA} event identified with a {@code requestId} matching the {@code requestId} value output by this function, referred to as the "corresponding completion event."</p>
     * 
     * <p>(This implies that if the runtime returns anything other than {@link XR10#XR_SUCCESS SUCCESS}, the runtime <b>must</b> not queue any {@link XrEventDataStopColocationDiscoveryCompleteMETA} events with {@code requestId} field matching the {@code requestId} populated by this function.)</p>
     * 
     * <p>If the asynchronous operation is successful, in the corresponding completion event, the runtime <b>must</b> set the {@link XrEventDataStopColocationDiscoveryCompleteMETA}{@code ::result} field to {@link XR10#XR_SUCCESS SUCCESS}.</p>
     * 
     * <p>If the asynchronous operation is scheduled but not successful, in the corresponding completion event, the runtime <b>must</b> set the {@link XrEventDataStopColocationDiscoveryCompleteMETA}{@code ::result} field to an appropriate error code instead of {@link XR10#XR_SUCCESS SUCCESS}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METAColocationDiscovery XR_META_colocation_discovery} extension <b>must</b> be enabled prior to calling {@link #xrStopColocationDiscoveryMETA StopColocationDiscoveryMETA}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code info} <b>must</b> be a pointer to a valid {@link XrColocationDiscoveryStopInfoMETA} structure</li>
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
     * <li>{@link XR10#XR_ERROR_RUNTIME_UNAVAILABLE ERROR_RUNTIME_UNAVAILABLE}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_EXTENSION_NOT_PRESENT ERROR_EXTENSION_NOT_PRESENT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrColocationDiscoveryStopInfoMETA}, {@link #xrStartColocationDiscoveryMETA StartColocationDiscoveryMETA}</p>
     *
     * @param session   an {@code XrSession} in which the colocation discovery will be active.
     * @param info      a pointer to {@link XrColocationDiscoveryStopInfoMETA} structure to specify the stop discovery request information.
     * @param requestId an output parameter, and the variable it points to will be populated with the ID of this asynchronous request.
     */
    @NativeType("XrResult")
    public static int xrStopColocationDiscoveryMETA(XrSession session, @NativeType("XrColocationDiscoveryStopInfoMETA const *") XrColocationDiscoveryStopInfoMETA info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrStopColocationDiscoveryMETA(session, info.address(), memAddress(requestId));
    }

    // --- [ xrStartColocationAdvertisementMETA ] ---

    /** Unsafe version of: {@link #xrStartColocationAdvertisementMETA StartColocationAdvertisementMETA} */
    public static int nxrStartColocationAdvertisementMETA(XrSession session, long info, long advertisementRequestId) {
        long __functionAddress = session.getCapabilities().xrStartColocationAdvertisementMETA;
        if (CHECKS) {
            check(__functionAddress);
            XrColocationAdvertisementStartInfoMETA.validate(info);
        }
        return callPPPI(session.address(), info, advertisementRequestId, __functionAddress);
    }

    /**
     * Start colocation visibility.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrStartColocationAdvertisementMETA StartColocationAdvertisementMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrStartColocationAdvertisementMETA(
     *     XrSession                                   session,
     *     const XrColocationAdvertisementStartInfoMETA* info,
     *     XrAsyncRequestIdFB*                         advertisementRequestId);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@link #xrStartColocationAdvertisementMETA StartColocationAdvertisementMETA} function requests that the current device become discoverable by other physically colocated devices running the same application.</p>
     * 
     * <p>If the system does not support colocation advertisement and discovery, the runtime <b>must</b> return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} from {@link #xrStartColocationAdvertisementMETA StartColocationAdvertisementMETA}. In this case, the runtime <b>must</b> return {@link XR10#XR_FALSE FALSE} for {@link XrSystemColocationDiscoveryPropertiesMETA}{@code ::supportsColocationDiscovery} when the function {@link XR10#xrGetSystemProperties GetSystemProperties} is called, so that the application knows to not use this functionality.</p>
     * 
     * <p>This is an asynchronous operation. Completion results are conveyed in the event {@link XrEventDataStartColocationAdvertisementCompleteMETA}.</p>
     * 
     * <p>If the asynchronous operation is scheduled successfully, the runtime <b>must</b> return {@link XR10#XR_SUCCESS SUCCESS}.</p>
     * 
     * <p>If and only if the runtime returns {@link XR10#XR_SUCCESS SUCCESS}, the runtime <b>must</b> queue a single {@link XrEventDataStartColocationAdvertisementCompleteMETA} event identified with a {@code advertisementRequestId} matching the {@code advertisementRequestId} value output by this function, referred to as the "corresponding completion event."</p>
     * 
     * <p>(This implies that if the runtime returns anything other than {@link XR10#XR_SUCCESS SUCCESS}, the runtime <b>must</b> not queue any {@link XrEventDataStartColocationAdvertisementCompleteMETA} events with {@code advertisementRequestId} field matching the {@code advertisementRequestId} populated by this function.)</p>
     * 
     * <p>If the asynchronous operation is successful, in the corresponding completion event, the runtime <b>must</b> set the {@link XrEventDataStartColocationAdvertisementCompleteMETA}{@code ::result} field to {@link XR10#XR_SUCCESS SUCCESS}.</p>
     * 
     * <p>If the asynchronous operation is scheduled but not successful, in the corresponding completion event, the runtime <b>must</b> set the {@link XrEventDataStartColocationAdvertisementCompleteMETA}{@code ::result} field to an appropriate error code instead of {@link XR10#XR_SUCCESS SUCCESS}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METAColocationDiscovery XR_META_colocation_discovery} extension <b>must</b> be enabled prior to calling {@link #xrStartColocationAdvertisementMETA StartColocationAdvertisementMETA}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code info} <b>must</b> be a pointer to a valid {@link XrColocationAdvertisementStartInfoMETA} structure</li>
     * <li>{@code advertisementRequestId} <b>must</b> be a pointer to an {@code XrAsyncRequestIdFB} value</li>
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
     * <li>{@link XR10#XR_ERROR_RUNTIME_UNAVAILABLE ERROR_RUNTIME_UNAVAILABLE}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_EXTENSION_NOT_PRESENT ERROR_EXTENSION_NOT_PRESENT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrColocationAdvertisementStartInfoMETA}, {@link XrEventDataStartColocationAdvertisementCompleteMETA}</p>
     *
     * @param session                an {@code XrSession} in which the colocation discovery will be active.
     * @param info                   a pointer to {@link XrColocationAdvertisementStartInfoMETA} structure to specify the visibility configuration.
     * @param advertisementRequestId an output parameter, and the variable it points to will be populated with the ID of this asynchronous request. Note that this ID is used for associating additional events with this original call, in addition to the typical completion event.
     */
    @NativeType("XrResult")
    public static int xrStartColocationAdvertisementMETA(XrSession session, @NativeType("XrColocationAdvertisementStartInfoMETA const *") XrColocationAdvertisementStartInfoMETA info, @NativeType("XrAsyncRequestIdFB *") LongBuffer advertisementRequestId) {
        if (CHECKS) {
            check(advertisementRequestId, 1);
        }
        return nxrStartColocationAdvertisementMETA(session, info.address(), memAddress(advertisementRequestId));
    }

    // --- [ xrStopColocationAdvertisementMETA ] ---

    /** Unsafe version of: {@link #xrStopColocationAdvertisementMETA StopColocationAdvertisementMETA} */
    public static int nxrStopColocationAdvertisementMETA(XrSession session, long info, long requestId) {
        long __functionAddress = session.getCapabilities().xrStopColocationAdvertisementMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), info, requestId, __functionAddress);
    }

    /**
     * Stop colocation advertisement.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrStopColocationAdvertisementMETA StopColocationAdvertisementMETA} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrStopColocationAdvertisementMETA(
     *     XrSession                                   session,
     *     const XrColocationAdvertisementStopInfoMETA* info,
     *     XrAsyncRequestIdFB*                         requestId);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The application <b>can</b> use the {@link #xrStopColocationAdvertisementMETA StopColocationAdvertisementMETA} function to disable the ability for other physically colocated devices running the same application to discover the current device.</p>
     * 
     * <p>If the system does not support colocation advertisement and discovery, the runtime <b>must</b> return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} from {@link #xrStopColocationAdvertisementMETA StopColocationAdvertisementMETA}. In this case, the runtime <b>must</b> return {@link XR10#XR_FALSE FALSE} for {@link XrSystemColocationDiscoveryPropertiesMETA}{@code ::supportsColocationDiscovery} when the function {@link XR10#xrGetSystemProperties GetSystemProperties} is called, so that the application knows to not use this functionality.</p>
     * 
     * <p>This is an asynchronous operation. Completion results are conveyed in the event {@link XrEventDataStopColocationAdvertisementCompleteMETA}.</p>
     * 
     * <p>If the asynchronous operation is scheduled successfully, the runtime <b>must</b> return {@link XR10#XR_SUCCESS SUCCESS}.</p>
     * 
     * <p>If and only if the runtime returns {@link XR10#XR_SUCCESS SUCCESS}, the runtime <b>must</b> queue a single {@link XrEventDataStopColocationAdvertisementCompleteMETA} event identified with a {@code requestId} matching the {@code requestId} value output by this function, referred to as the "corresponding completion event."</p>
     * 
     * <p>(This implies that if the runtime returns anything other than {@link XR10#XR_SUCCESS SUCCESS}, the runtime <b>must</b> not queue any {@link XrEventDataStopColocationAdvertisementCompleteMETA} events with {@code requestId} field matching the {@code requestId} populated by this function.)</p>
     * 
     * <p>If the asynchronous operation is successful, in the corresponding completion event, the runtime <b>must</b> set the {@link XrEventDataStopColocationAdvertisementCompleteMETA}{@code ::result} field to {@link XR10#XR_SUCCESS SUCCESS}.</p>
     * 
     * <p>If the asynchronous operation is scheduled but not successful, in the corresponding completion event, the runtime <b>must</b> set the {@link XrEventDataStopColocationAdvertisementCompleteMETA}{@code ::result} field to an appropriate error code instead of {@link XR10#XR_SUCCESS SUCCESS}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link METAColocationDiscovery XR_META_colocation_discovery} extension <b>must</b> be enabled prior to calling {@link #xrStopColocationAdvertisementMETA StopColocationAdvertisementMETA}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code info} <b>must</b> be a pointer to a valid {@link XrColocationAdvertisementStopInfoMETA} structure</li>
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
     * <li>{@link XR10#XR_ERROR_RUNTIME_UNAVAILABLE ERROR_RUNTIME_UNAVAILABLE}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_EXTENSION_NOT_PRESENT ERROR_EXTENSION_NOT_PRESENT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrColocationAdvertisementStopInfoMETA}, {@link XrEventDataStopColocationAdvertisementCompleteMETA}, {@link #xrStartColocationAdvertisementMETA StartColocationAdvertisementMETA}</p>
     *
     * @param session   an {@code XrSession} in which the colocation discovery will be active.
     * @param info      a pointer to {@link XrColocationAdvertisementStopInfoMETA} structure to specify the advertisement configuration.
     * @param requestId an output parameter, and the variable it points to will be populated with the ID of this asynchronous request.
     */
    @NativeType("XrResult")
    public static int xrStopColocationAdvertisementMETA(XrSession session, @NativeType("XrColocationAdvertisementStopInfoMETA const *") XrColocationAdvertisementStopInfoMETA info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrStopColocationAdvertisementMETA(session, info.address(), memAddress(requestId));
    }

}