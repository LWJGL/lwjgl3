/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_ML_localization_map">XR_ML_localization_map</a> extension.
 * 
 * <p>A Magic Leap localization map is a container that holds metadata about the scanned environment. It is a digital copy of a physical place. A localization map holds spatial anchors, dense mesh, planes, feature points, and positional data.</p>
 * 
 * <ul>
 * <li>Spatial anchors - Used for persistent placement of content.</li>
 * <li>Dense mesh - 3D triangulated geometry representing Magic Leap device understanding of the real-world geometry of an area.</li>
 * <li>Planes - Large, flat surfaces derived from dense mesh data.</li>
 * </ul>
 * 
 * <p>Localization maps <b>can</b> be created on device or in the Magic Leap AR Cloud. There are two types - "On Device" and "Cloud".</p>
 * 
 * <ul>
 * <li>"On Device" for OpenXR (local space for MagicLeap) - are for a single device and <b>can</b> be shared via the export/import mechanism.</li>
 * <li>"Cloud" for OpenXR (shared space for MagicLeap) - <b>can</b> be shared across multiple MagicLeap devices in the AR Cloud.</li>
 * </ul>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Localization Maps are called Spaces in the Magic Leap C-API.</p>
 * </div>
 * 
 * <h5>Permissions</h5>
 * 
 * <p>Android applications <b>must</b> have the com.magicleap.permission.SPACE_MANAGER permission listed in their manifest to use these functions:</p>
 * 
 * <ul>
 * <li>{@link #xrQueryLocalizationMapsML QueryLocalizationMapsML}</li>
 * <li>{@link #xrRequestMapLocalizationML RequestMapLocalizationML}</li>
 * </ul>
 * 
 * <p>(protection level: normal)</p>
 * 
 * <p>Android applications <b>must</b> have the com.magicleap.permission.SPACE_IMPORT_EXPORT permission listed in their manifest and granted to use these functions:</p>
 * 
 * <ul>
 * <li>{@link #xrImportLocalizationMapML ImportLocalizationMapML}</li>
 * <li>{@link #xrCreateExportedLocalizationMapML CreateExportedLocalizationMapML}</li>
 * </ul>
 * 
 * <p>(protection level: dangerous)</p>
 */
public class MLLocalizationMap {

    /** The extension specification version. */
    public static final int XR_ML_localization_map_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_ML_LOCALIZATION_MAP_EXTENSION_NAME = "XR_ML_localization_map";

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_EXPORTED_LOCALIZATION_MAP_ML = 1000139000;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_LOCALIZATION_MAP_ML TYPE_LOCALIZATION_MAP_ML}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_LOCALIZATION_CHANGED_ML TYPE_EVENT_DATA_LOCALIZATION_CHANGED_ML}</li>
     * <li>{@link #XR_TYPE_MAP_LOCALIZATION_REQUEST_INFO_ML TYPE_MAP_LOCALIZATION_REQUEST_INFO_ML}</li>
     * <li>{@link #XR_TYPE_LOCALIZATION_MAP_IMPORT_INFO_ML TYPE_LOCALIZATION_MAP_IMPORT_INFO_ML}</li>
     * <li>{@link #XR_TYPE_LOCALIZATION_ENABLE_EVENTS_INFO_ML TYPE_LOCALIZATION_ENABLE_EVENTS_INFO_ML}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_LOCALIZATION_MAP_ML                = 1000139000,
        XR_TYPE_EVENT_DATA_LOCALIZATION_CHANGED_ML = 1000139001,
        XR_TYPE_MAP_LOCALIZATION_REQUEST_INFO_ML   = 1000139002,
        XR_TYPE_LOCALIZATION_MAP_IMPORT_INFO_ML    = 1000139003,
        XR_TYPE_LOCALIZATION_ENABLE_EVENTS_INFO_ML = 1000139004;

    /**
     * Extends {@code XrResult}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_ERROR_LOCALIZATION_MAP_INCOMPATIBLE_ML ERROR_LOCALIZATION_MAP_INCOMPATIBLE_ML}</li>
     * <li>{@link #XR_ERROR_LOCALIZATION_MAP_UNAVAILABLE_ML ERROR_LOCALIZATION_MAP_UNAVAILABLE_ML}</li>
     * <li>{@link #XR_ERROR_LOCALIZATION_MAP_FAIL_ML ERROR_LOCALIZATION_MAP_FAIL_ML}</li>
     * <li>{@link #XR_ERROR_LOCALIZATION_MAP_IMPORT_EXPORT_PERMISSION_DENIED_ML ERROR_LOCALIZATION_MAP_IMPORT_EXPORT_PERMISSION_DENIED_ML}</li>
     * <li>{@link #XR_ERROR_LOCALIZATION_MAP_PERMISSION_DENIED_ML ERROR_LOCALIZATION_MAP_PERMISSION_DENIED_ML}</li>
     * <li>{@link #XR_ERROR_LOCALIZATION_MAP_ALREADY_EXISTS_ML ERROR_LOCALIZATION_MAP_ALREADY_EXISTS_ML}</li>
     * <li>{@link #XR_ERROR_LOCALIZATION_MAP_CANNOT_EXPORT_CLOUD_MAP_ML ERROR_LOCALIZATION_MAP_CANNOT_EXPORT_CLOUD_MAP_ML}</li>
     * </ul>
     */
    public static final int
        XR_ERROR_LOCALIZATION_MAP_INCOMPATIBLE_ML                    = -1000139000,
        XR_ERROR_LOCALIZATION_MAP_UNAVAILABLE_ML                     = -1000139001,
        XR_ERROR_LOCALIZATION_MAP_FAIL_ML                            = -1000139002,
        XR_ERROR_LOCALIZATION_MAP_IMPORT_EXPORT_PERMISSION_DENIED_ML = -1000139003,
        XR_ERROR_LOCALIZATION_MAP_PERMISSION_DENIED_ML               = -1000139004,
        XR_ERROR_LOCALIZATION_MAP_ALREADY_EXISTS_ML                  = -1000139005,
        XR_ERROR_LOCALIZATION_MAP_CANNOT_EXPORT_CLOUD_MAP_ML         = -1000139006;

    /** Extends {@code XrReferenceSpaceType}. */
    public static final int XR_REFERENCE_SPACE_TYPE_LOCALIZATION_MAP_ML = 1000139000;

    /** XR_MAX_LOCALIZATION_MAP_NAME_LENGTH_ML */
    public static final int XR_MAX_LOCALIZATION_MAP_NAME_LENGTH_ML = 64;

    /**
     * XrLocalizationMapStateML - Localization Map State
     * 
     * <h5>Description</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>Enum</th><th>Description</th></tr></thead>
     * <tbody>
     * <tr><td>{@link #XR_LOCALIZATION_MAP_STATE_NOT_LOCALIZED_ML LOCALIZATION_MAP_STATE_NOT_LOCALIZED_ML}</td><td>The system is not localized into a map. Features like Spatial Anchors relying on localization will not work.</td></tr>
     * <tr><td>{@link #XR_LOCALIZATION_MAP_STATE_LOCALIZED_ML LOCALIZATION_MAP_STATE_LOCALIZED_ML}</td><td>The system is localized into a map.</td></tr>
     * <tr><td>{@link #XR_LOCALIZATION_MAP_STATE_LOCALIZATION_PENDING_ML LOCALIZATION_MAP_STATE_LOCALIZATION_PENDING_ML}</td><td>The system is localizing into a map.</td></tr>
     * <tr><td>{@link #XR_LOCALIZATION_MAP_STATE_LOCALIZATION_SLEEPING_BEFORE_RETRY_ML LOCALIZATION_MAP_STATE_LOCALIZATION_SLEEPING_BEFORE_RETRY_ML}</td><td>Initial localization failed, the system will retry localization.</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrEventDataLocalizationChangedML}</p>
     */
    public static final int
        XR_LOCALIZATION_MAP_STATE_NOT_LOCALIZED_ML                      = 0,
        XR_LOCALIZATION_MAP_STATE_LOCALIZED_ML                          = 1,
        XR_LOCALIZATION_MAP_STATE_LOCALIZATION_PENDING_ML               = 2,
        XR_LOCALIZATION_MAP_STATE_LOCALIZATION_SLEEPING_BEFORE_RETRY_ML = 3;

    /**
     * XrLocalizationMapTypeML - Localization Map Type
     * 
     * <h5>Description</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>Enum</th><th>Description</th></tr></thead>
     * <tbody>
     * <tr><td>{@link #XR_LOCALIZATION_MAP_TYPE_ON_DEVICE_ML LOCALIZATION_MAP_TYPE_ON_DEVICE_ML}</td><td>The system is localized into an On-Device map, published anchors are not shared between different devices.</td></tr>
     * <tr><td>{@link #XR_LOCALIZATION_MAP_TYPE_CLOUD_ML LOCALIZATION_MAP_TYPE_CLOUD_ML}</td><td>The system is localized into a Cloud Map, anchors are shared per cloud account settings.</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrLocalizationMapML}</p>
     */
    public static final int
        XR_LOCALIZATION_MAP_TYPE_ON_DEVICE_ML = 0,
        XR_LOCALIZATION_MAP_TYPE_CLOUD_ML     = 1;

    /**
     * XrLocalizationMapConfidenceML - Localization Confidence
     * 
     * <h5>Description</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>Enum</th><th>Description</th></tr></thead>
     * <tbody>
     * <tr><td>{@link #XR_LOCALIZATION_MAP_CONFIDENCE_POOR_ML LOCALIZATION_MAP_CONFIDENCE_POOR_ML}</td><td>The localization map has poor confidence, systems relying on the localization map are likely to have poor performance.</td></tr>
     * <tr><td>{@link #XR_LOCALIZATION_MAP_CONFIDENCE_FAIR_ML LOCALIZATION_MAP_CONFIDENCE_FAIR_ML}</td><td>The confidence is fair, current environmental conditions may adversely affect localization.</td></tr>
     * <tr><td>{@link #XR_LOCALIZATION_MAP_CONFIDENCE_GOOD_ML LOCALIZATION_MAP_CONFIDENCE_GOOD_ML}</td><td>The confidence is high, persistent content should be stable.</td></tr>
     * <tr><td>{@link #XR_LOCALIZATION_MAP_CONFIDENCE_EXCELLENT_ML LOCALIZATION_MAP_CONFIDENCE_EXCELLENT_ML}</td><td>This is a very high-confidence localization, persistent content will be very stable.</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrEventDataLocalizationChangedML}</p>
     */
    public static final int
        XR_LOCALIZATION_MAP_CONFIDENCE_POOR_ML      = 0,
        XR_LOCALIZATION_MAP_CONFIDENCE_FAIR_ML      = 1,
        XR_LOCALIZATION_MAP_CONFIDENCE_GOOD_ML      = 2,
        XR_LOCALIZATION_MAP_CONFIDENCE_EXCELLENT_ML = 3;

    /**
     * XrLocalizationMapErrorFlagBitsML - The world meshing detector flags.
     * 
     * <h5>Description</h5>
     * 
     * <p>The flag bits have the following meanings:</p>
     * 
     * <h5>Flag Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_LOCALIZATION_MAP_ERROR_UNKNOWN_BIT_ML LOCALIZATION_MAP_ERROR_UNKNOWN_BIT_ML} — Localization failed for an unknown reason.</li>
     * <li>{@link #XR_LOCALIZATION_MAP_ERROR_OUT_OF_MAPPED_AREA_BIT_ML LOCALIZATION_MAP_ERROR_OUT_OF_MAPPED_AREA_BIT_ML} — Localization failed because the user is outside of the mapped area.</li>
     * <li>{@link #XR_LOCALIZATION_MAP_ERROR_LOW_FEATURE_COUNT_BIT_ML LOCALIZATION_MAP_ERROR_LOW_FEATURE_COUNT_BIT_ML} — There are not enough features in the environment to successfully localize.</li>
     * <li>{@link #XR_LOCALIZATION_MAP_ERROR_EXCESSIVE_MOTION_BIT_ML LOCALIZATION_MAP_ERROR_EXCESSIVE_MOTION_BIT_ML} — Localization failed due to excessive motion.</li>
     * <li>{@link #XR_LOCALIZATION_MAP_ERROR_LOW_LIGHT_BIT_ML LOCALIZATION_MAP_ERROR_LOW_LIGHT_BIT_ML} — Localization failed because the lighting levels are too low in the environment.</li>
     * <li>{@link #XR_LOCALIZATION_MAP_ERROR_HEADPOSE_BIT_ML LOCALIZATION_MAP_ERROR_HEADPOSE_BIT_ML} — A headpose failure caused localization to be unsuccessful.</li>
     * </ul>
     */
    public static final int
        XR_LOCALIZATION_MAP_ERROR_UNKNOWN_BIT_ML            = 0x1,
        XR_LOCALIZATION_MAP_ERROR_OUT_OF_MAPPED_AREA_BIT_ML = 0x2,
        XR_LOCALIZATION_MAP_ERROR_LOW_FEATURE_COUNT_BIT_ML  = 0x4,
        XR_LOCALIZATION_MAP_ERROR_EXCESSIVE_MOTION_BIT_ML   = 0x8,
        XR_LOCALIZATION_MAP_ERROR_LOW_LIGHT_BIT_ML          = 0x10,
        XR_LOCALIZATION_MAP_ERROR_HEADPOSE_BIT_ML           = 0x20;

    protected MLLocalizationMap() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnableLocalizationEventsML ] ---

    /** Unsafe version of: {@link #xrEnableLocalizationEventsML EnableLocalizationEventsML} */
    public static int nxrEnableLocalizationEventsML(XrSession session, long info) {
        long __functionAddress = session.getCapabilities().xrEnableLocalizationEventsML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), info, __functionAddress);
    }

    /**
     * Retrieve the current localization status.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrEnableLocalizationEventsML EnableLocalizationEventsML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrEnableLocalizationEventsML(
     *     XrSession                                   session,
     *     const XrLocalizationEnableEventsInfoML *    info);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLLocalizationMap XR_ML_localization_map} extension <b>must</b> be enabled prior to calling {@link #xrEnableLocalizationEventsML EnableLocalizationEventsML}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code info} <b>must</b> be a pointer to a valid {@link XrLocalizationEnableEventsInfoML} structure</li>
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
     * <li>{@link #XR_ERROR_LOCALIZATION_MAP_PERMISSION_DENIED_ML ERROR_LOCALIZATION_MAP_PERMISSION_DENIED_ML}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrEventDataLocalizationChangedML}, {@link XrLocalizationEnableEventsInfoML}</p>
     *
     * @param session a handle to an {@code XrSession} previously created with {@link XR10#xrCreateSession CreateSession}.
     * @param info    a pointer to an {@link XrLocalizationEnableEventsInfoML} structure.
     */
    @NativeType("XrResult")
    public static int xrEnableLocalizationEventsML(XrSession session, @NativeType("XrLocalizationEnableEventsInfoML const *") XrLocalizationEnableEventsInfoML info) {
        return nxrEnableLocalizationEventsML(session, info.address());
    }

    // --- [ xrQueryLocalizationMapsML ] ---

    /**
     * Unsafe version of: {@link #xrQueryLocalizationMapsML QueryLocalizationMapsML}
     *
     * @param mapCapacityInput the capacity of the maps array, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrQueryLocalizationMapsML(XrSession session, long queryInfo, int mapCapacityInput, long mapCountOutput, long maps) {
        long __functionAddress = session.getCapabilities().xrQueryLocalizationMapsML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(session.address(), queryInfo, mapCapacityInput, mapCountOutput, maps, __functionAddress);
    }

    /**
     * Query the available localization maps.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrQueryLocalizationMapsML QueryLocalizationMapsML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrQueryLocalizationMapsML(
     *     XrSession                                   session,
     *     const XrLocalizationMapQueryInfoBaseHeaderML* queryInfo,
     *     uint32_t                                    mapCapacityInput,
     *     uint32_t *                                  mapCountOutput,
     *     XrLocalizationMapML*                        maps);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The list of localization maps returned will depend on the current device mapping mode. Only the localization maps associated with the current mapping mode will be returned by this call. Device mapping mode (e.g. {@link #XR_LOCALIZATION_MAP_TYPE_ON_DEVICE_ML LOCALIZATION_MAP_TYPE_ON_DEVICE_ML} or {@link #XR_LOCALIZATION_MAP_TYPE_CLOUD_ML LOCALIZATION_MAP_TYPE_CLOUD_ML}) <b>can</b> only be changed via the system application(s).</p>
     * 
     * <p>The list of maps known to the runtime <b>may</b> change between the two calls to {@link #xrQueryLocalizationMapsML QueryLocalizationMapsML}. This is however a rare occurrence and the application <b>may</b> retry the call again if it receives {@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLLocalizationMap XR_ML_localization_map} extension <b>must</b> be enabled prior to calling {@link #xrQueryLocalizationMapsML QueryLocalizationMapsML}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>If {@code queryInfo} is not {@code NULL}, {@code queryInfo} <b>must</b> be a pointer to a valid {@link XrLocalizationMapQueryInfoBaseHeaderML}-based structure</li>
     * <li>{@code mapCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code mapCapacityInput} is not 0, {@code maps} <b>must</b> be a pointer to an array of {@code mapCapacityInput} {@link XrLocalizationMapML} structures</li>
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
     * <li>{@link #XR_ERROR_LOCALIZATION_MAP_PERMISSION_DENIED_ML ERROR_LOCALIZATION_MAP_PERMISSION_DENIED_ML}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrLocalizationMapML}, {@link XrLocalizationMapQueryInfoBaseHeaderML}</p>
     *
     * @param session        a handle to an {@code XrSession} previously created with {@link XR10#xrCreateSession CreateSession}.
     * @param queryInfo      an <b>optional</b> enumeration filter based on {@link XrLocalizationMapQueryInfoBaseHeaderML} to use.
     * @param mapCountOutput filled in by the runtime with the count of {@code maps} written or the required capacity in the case that {@code mapCapacityInput} is insufficient.
     * @param maps           an array of {@link XrLocalizationMapML} filled in by the runtime, but <b>can</b> be {@code NULL} if {@code mapCapacityInput} is 0.
     */
    @NativeType("XrResult")
    public static int xrQueryLocalizationMapsML(XrSession session, @Nullable @NativeType("XrLocalizationMapQueryInfoBaseHeaderML const *") XrLocalizationMapQueryInfoBaseHeaderML queryInfo, @NativeType("uint32_t *") IntBuffer mapCountOutput, @Nullable @NativeType("XrLocalizationMapML *") XrLocalizationMapML.Buffer maps) {
        if (CHECKS) {
            check(mapCountOutput, 1);
        }
        return nxrQueryLocalizationMapsML(session, memAddressSafe(queryInfo), remainingSafe(maps), memAddress(mapCountOutput), memAddressSafe(maps));
    }

    // --- [ xrRequestMapLocalizationML ] ---

    /** Unsafe version of: {@link #xrRequestMapLocalizationML RequestMapLocalizationML} */
    public static int nxrRequestMapLocalizationML(XrSession session, long requestInfo) {
        long __functionAddress = session.getCapabilities().xrRequestMapLocalizationML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), requestInfo, __functionAddress);
    }

    /**
     * Requests a localization map.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrRequestMapLocalizationML RequestMapLocalizationML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrRequestMapLocalizationML(
     *     XrSession                                   session,
     *     const XrMapLocalizationRequestInfoML*       requestInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This is an asynchronous request. Listen for {@link XrEventDataLocalizationChangedML} events to get the results of the localization. A new request for localization will override all the past requests for localization that are yet to be completed.</p>
     * 
     * <p>The runtime <b>must</b> return {@link #XR_ERROR_LOCALIZATION_MAP_UNAVAILABLE_ML ERROR_LOCALIZATION_MAP_UNAVAILABLE_ML} if the requested is not a map known to the runtime.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLLocalizationMap XR_ML_localization_map} extension <b>must</b> be enabled prior to calling {@link #xrRequestMapLocalizationML RequestMapLocalizationML}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code requestInfo} <b>must</b> be a pointer to a valid {@link XrMapLocalizationRequestInfoML} structure</li>
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
     * <li>{@link #XR_ERROR_LOCALIZATION_MAP_UNAVAILABLE_ML ERROR_LOCALIZATION_MAP_UNAVAILABLE_ML}</li>
     * <li>{@link #XR_ERROR_LOCALIZATION_MAP_PERMISSION_DENIED_ML ERROR_LOCALIZATION_MAP_PERMISSION_DENIED_ML}</li>
     * <li>{@link #XR_ERROR_LOCALIZATION_MAP_FAIL_ML ERROR_LOCALIZATION_MAP_FAIL_ML}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrMapLocalizationRequestInfoML}</p>
     *
     * @param session     a handle to an {@code XrSession} previously created with {@link XR10#xrCreateSession CreateSession}.
     * @param requestInfo contains {@link XrMapLocalizationRequestInfoML} on the localization map to request.
     */
    @NativeType("XrResult")
    public static int xrRequestMapLocalizationML(XrSession session, @NativeType("XrMapLocalizationRequestInfoML const *") XrMapLocalizationRequestInfoML requestInfo) {
        return nxrRequestMapLocalizationML(session, requestInfo.address());
    }

    // --- [ xrImportLocalizationMapML ] ---

    /** Unsafe version of: {@link #xrImportLocalizationMapML ImportLocalizationMapML} */
    public static int nxrImportLocalizationMapML(XrSession session, long importInfo, long mapUuid) {
        long __functionAddress = session.getCapabilities().xrImportLocalizationMapML;
        if (CHECKS) {
            check(__functionAddress);
            XrLocalizationMapImportInfoML.validate(importInfo);
        }
        return callPPPI(session.address(), importInfo, mapUuid, __functionAddress);
    }

    /**
     * Imports a localization map.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrImportLocalizationMapML ImportLocalizationMapML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrImportLocalizationMapML(
     *     XrSession                                   session,
     *     const XrLocalizationMapImportInfoML*        importInfo,
     *     XrUuidEXT*                                  mapUuid);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The runtime <b>must</b> return {@link #XR_ERROR_LOCALIZATION_MAP_ALREADY_EXISTS_ML ERROR_LOCALIZATION_MAP_ALREADY_EXISTS_ML} if the map that is being imported already exists. The runtime <b>must</b> return {@link #XR_ERROR_LOCALIZATION_MAP_INCOMPATIBLE_ML ERROR_LOCALIZATION_MAP_INCOMPATIBLE_ML} if the map being imported is not compatible.</p>
     * 
     * <p>{@link #xrImportLocalizationMapML ImportLocalizationMapML} <b>may</b> take a long time to complete; as such applications <b>should</b> not call this from the frame loop.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLLocalizationMap XR_ML_localization_map} extension <b>must</b> be enabled prior to calling {@link #xrImportLocalizationMapML ImportLocalizationMapML}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code importInfo} <b>must</b> be a pointer to a valid {@link XrLocalizationMapImportInfoML} structure</li>
     * <li>If {@code mapUuid} is not {@code NULL}, {@code mapUuid} <b>must</b> be a pointer to an {@link XrUuidEXT} structure</li>
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
     * <li>{@link #XR_ERROR_LOCALIZATION_MAP_INCOMPATIBLE_ML ERROR_LOCALIZATION_MAP_INCOMPATIBLE_ML}</li>
     * <li>{@link #XR_ERROR_LOCALIZATION_MAP_IMPORT_EXPORT_PERMISSION_DENIED_ML ERROR_LOCALIZATION_MAP_IMPORT_EXPORT_PERMISSION_DENIED_ML}</li>
     * <li>{@link #XR_ERROR_LOCALIZATION_MAP_ALREADY_EXISTS_ML ERROR_LOCALIZATION_MAP_ALREADY_EXISTS_ML}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrLocalizationMapImportInfoML}, {@link XrUuidEXT}</p>
     *
     * @param session    a handle to an {@code XrSession} previously created with {@link XR10#xrCreateSession CreateSession}.
     * @param importInfo contains {@link XrLocalizationMapImportInfoML} on the localization map to import.
     * @param mapUuid    the {@link XrUuidEXT} of the newly imported localization map filled in by the runtime.
     */
    @NativeType("XrResult")
    public static int xrImportLocalizationMapML(XrSession session, @NativeType("XrLocalizationMapImportInfoML const *") XrLocalizationMapImportInfoML importInfo, @Nullable @NativeType("XrUuidEXT *") XrUuidEXT mapUuid) {
        return nxrImportLocalizationMapML(session, importInfo.address(), memAddressSafe(mapUuid));
    }

    // --- [ xrCreateExportedLocalizationMapML ] ---

    /** Unsafe version of: {@link #xrCreateExportedLocalizationMapML CreateExportedLocalizationMapML} */
    public static int nxrCreateExportedLocalizationMapML(XrSession session, long mapUuid, long map) {
        long __functionAddress = session.getCapabilities().xrCreateExportedLocalizationMapML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), mapUuid, map, __functionAddress);
    }

    /**
     * Creates an exported localization map handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateExportedLocalizationMapML CreateExportedLocalizationMapML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateExportedLocalizationMapML(
     *     XrSession                                   session,
     *     const XrUuidEXT*                            mapUuid,
     *     XrExportedLocalizationMapML*                map);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrCreateExportedLocalizationMapML CreateExportedLocalizationMapML} creates a frozen copy of the {@code mapUuid} localization map that <b>can</b> be exported using {@link #xrGetExportedLocalizationMapDataML GetExportedLocalizationMapDataML}. Applications <b>should</b> call {@link #xrDestroyExportedLocalizationMapML DestroyExportedLocalizationMapML} once they are done with the data.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLLocalizationMap XR_ML_localization_map} extension <b>must</b> be enabled prior to calling {@link #xrCreateExportedLocalizationMapML CreateExportedLocalizationMapML}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code mapUuid} <b>must</b> be a pointer to a valid {@link XrUuidEXT} structure</li>
     * <li>{@code map} <b>must</b> be a pointer to an {@code XrExportedLocalizationMapML} handle</li>
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
     * <li>{@link #XR_ERROR_LOCALIZATION_MAP_UNAVAILABLE_ML ERROR_LOCALIZATION_MAP_UNAVAILABLE_ML}</li>
     * <li>{@link #XR_ERROR_LOCALIZATION_MAP_IMPORT_EXPORT_PERMISSION_DENIED_ML ERROR_LOCALIZATION_MAP_IMPORT_EXPORT_PERMISSION_DENIED_ML}</li>
     * <li>{@link #XR_ERROR_LOCALIZATION_MAP_CANNOT_EXPORT_CLOUD_MAP_ML ERROR_LOCALIZATION_MAP_CANNOT_EXPORT_CLOUD_MAP_ML}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrUuidEXT}, {@link #xrGetExportedLocalizationMapDataML GetExportedLocalizationMapDataML}</p>
     *
     * @param session a handle to an {@code XrSession} previously created with {@link XR10#xrCreateSession CreateSession}.
     * @param mapUuid a pointer to the uuid of the map to export.
     * @param map     a pointer to a map handle filled in by the runtime.
     */
    @NativeType("XrResult")
    public static int xrCreateExportedLocalizationMapML(XrSession session, @NativeType("XrUuidEXT const *") XrUuidEXT mapUuid, @NativeType("XrExportedLocalizationMapML *") PointerBuffer map) {
        if (CHECKS) {
            check(map, 1);
        }
        return nxrCreateExportedLocalizationMapML(session, mapUuid.address(), memAddress(map));
    }

    // --- [ xrDestroyExportedLocalizationMapML ] ---

    /**
     * Destroys an exported localization map.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroyExportedLocalizationMapML DestroyExportedLocalizationMapML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDestroyExportedLocalizationMapML(
     *     XrExportedLocalizationMapML                 map);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLLocalizationMap XR_ML_localization_map} extension <b>must</b> be enabled prior to calling {@link #xrDestroyExportedLocalizationMapML DestroyExportedLocalizationMapML}</li>
     * <li>{@code map} <b>must</b> be a valid {@code XrExportedLocalizationMapML} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code map}, and any child handles, <b>must</b> be externally synchronized</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrCreateExportedLocalizationMapML CreateExportedLocalizationMapML}</p>
     *
     * @param map the map to destroy.
     */
    @NativeType("XrResult")
    public static int xrDestroyExportedLocalizationMapML(XrExportedLocalizationMapML map) {
        long __functionAddress = map.getCapabilities().xrDestroyExportedLocalizationMapML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(map.address(), __functionAddress);
    }

    // --- [ xrGetExportedLocalizationMapDataML ] ---

    /**
     * Unsafe version of: {@link #xrGetExportedLocalizationMapDataML GetExportedLocalizationMapDataML}
     *
     * @param bufferCapacityInput the capacity of the buffer array, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrGetExportedLocalizationMapDataML(XrExportedLocalizationMapML map, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = map.getCapabilities().xrGetExportedLocalizationMapDataML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(map.address(), bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /**
     * Returns the exported localization map data.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetExportedLocalizationMapDataML GetExportedLocalizationMapDataML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetExportedLocalizationMapDataML(
     *     XrExportedLocalizationMapML                 map,
     *     uint32_t                                    bufferCapacityInput,
     *     uint32_t*                                   bufferCountOutput,
     *     char*                                       buffer);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrGetExportedLocalizationMapDataML GetExportedLocalizationMapDataML} <b>may</b> take a long time to complete; as such applications <b>should</b> not call this from the frame loop.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLLocalizationMap XR_ML_localization_map} extension <b>must</b> be enabled prior to calling {@link #xrGetExportedLocalizationMapDataML GetExportedLocalizationMapDataML}</li>
     * <li>{@code map} <b>must</b> be a valid {@code XrExportedLocalizationMapML} handle</li>
     * <li>{@code bufferCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code bufferCapacityInput} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferCapacityInput} char values</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrCreateExportedLocalizationMapML CreateExportedLocalizationMapML}</p>
     *
     * @param map               the map to export.
     * @param bufferCountOutput filled in by the runtime with the count of bytes written or the required capacity in the case that bufferCapacityInput is insufficient.
     * @param buffer            an array of bytes filled in by the runtime.
     */
    @NativeType("XrResult")
    public static int xrGetExportedLocalizationMapDataML(XrExportedLocalizationMapML map, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @Nullable @NativeType("char *") ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrGetExportedLocalizationMapDataML(map, remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

}