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
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#XR_ML_spatial_anchors">XR_ML_spatial_anchors</a> extension.
 * 
 * <p>Spatial anchors are {@code XrSpace} entities tied to a physical location. This allows the developer to place virtual content in real world locations.</p>
 * 
 * <p>The runtime <b>should</b> then adjust the {@code XrSpace} over time as needed, independently of all other spaces and anchors, to ensure that it maintains its original mapping to the real world.</p>
 * 
 * <h5>Caution</h5>
 * 
 * <p>If head pose is lost and regained, spatial anchors <b>may</b> also be lost. It is therefore strongly recommended that once an anchor is created, it is also persisted using the {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension.</p>
 * 
 * <h5>Permissions</h5>
 * 
 * <p>Android applications <b>must</b> have the com.magicleap.permission.SPATIAL_ANCHOR permission listed in their manifest to use this extension. (protection level: normal)</p>
 */
public class MLSpatialAnchors {

    /** The extension specification version. */
    public static final int XR_ML_spatial_anchors_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_ML_SPATIAL_ANCHORS_EXTENSION_NAME = "XR_ML_spatial_anchors";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_POSE_ML TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_POSE_ML}</li>
     * <li>{@link #XR_TYPE_CREATE_SPATIAL_ANCHORS_COMPLETION_ML TYPE_CREATE_SPATIAL_ANCHORS_COMPLETION_ML}</li>
     * <li>{@link #XR_TYPE_SPATIAL_ANCHOR_STATE_ML TYPE_SPATIAL_ANCHOR_STATE_ML}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_POSE_ML = 1000140000,
        XR_TYPE_CREATE_SPATIAL_ANCHORS_COMPLETION_ML     = 1000140001,
        XR_TYPE_SPATIAL_ANCHOR_STATE_ML                  = 1000140002;

    /**
     * Extends {@code XrResult}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_ERROR_SPATIAL_ANCHORS_PERMISSION_DENIED_ML ERROR_SPATIAL_ANCHORS_PERMISSION_DENIED_ML}</li>
     * <li>{@link #XR_ERROR_SPATIAL_ANCHORS_NOT_LOCALIZED_ML ERROR_SPATIAL_ANCHORS_NOT_LOCALIZED_ML}</li>
     * <li>{@link #XR_ERROR_SPATIAL_ANCHORS_OUT_OF_MAP_BOUNDS_ML ERROR_SPATIAL_ANCHORS_OUT_OF_MAP_BOUNDS_ML}</li>
     * <li>{@link #XR_ERROR_SPATIAL_ANCHORS_SPACE_NOT_LOCATABLE_ML ERROR_SPATIAL_ANCHORS_SPACE_NOT_LOCATABLE_ML}</li>
     * </ul>
     */
    public static final int
        XR_ERROR_SPATIAL_ANCHORS_PERMISSION_DENIED_ML   = -1000140000,
        XR_ERROR_SPATIAL_ANCHORS_NOT_LOCALIZED_ML       = -1000140001,
        XR_ERROR_SPATIAL_ANCHORS_OUT_OF_MAP_BOUNDS_ML   = -1000140002,
        XR_ERROR_SPATIAL_ANCHORS_SPACE_NOT_LOCATABLE_ML = -1000140003;

    /**
     * XrSpatialAnchorConfidenceML - Spatial anchor confidence
     * 
     * <h5>Description</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>Enum</th><th>Description</th></tr></thead>
     * <tbody>
     * <tr><td>{@link #XR_SPATIAL_ANCHOR_CONFIDENCE_LOW_ML SPATIAL_ANCHOR_CONFIDENCE_LOW_ML}</td><td>Low quality, this anchor can be expected to move significantly.</td></tr>
     * <tr><td>{@link #XR_SPATIAL_ANCHOR_CONFIDENCE_MEDIUM_ML SPATIAL_ANCHOR_CONFIDENCE_MEDIUM_ML}</td><td>Medium quality, this anchor may move slightly.</td></tr>
     * <tr><td>{@link #XR_SPATIAL_ANCHOR_CONFIDENCE_HIGH_ML SPATIAL_ANCHOR_CONFIDENCE_HIGH_ML}</td><td>High quality, this anchor is stable and suitable for digital content attachment.</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpatialAnchorStateML}</p>
     */
    public static final int
        XR_SPATIAL_ANCHOR_CONFIDENCE_LOW_ML    = 0,
        XR_SPATIAL_ANCHOR_CONFIDENCE_MEDIUM_ML = 1,
        XR_SPATIAL_ANCHOR_CONFIDENCE_HIGH_ML   = 2;

    protected MLSpatialAnchors() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpatialAnchorsAsyncML ] ---

    /** Unsafe version of: {@link #xrCreateSpatialAnchorsAsyncML CreateSpatialAnchorsAsyncML} */
    public static int nxrCreateSpatialAnchorsAsyncML(XrSession session, long createInfo, long future) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAnchorsAsyncML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, future, __functionAddress);
    }

    /**
     * Create spatial anchors.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateSpatialAnchorsAsyncML CreateSpatialAnchorsAsyncML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateSpatialAnchorsAsyncML(
     *     XrSession                                   session,
     *     const XrSpatialAnchorsCreateInfoBaseHeaderML* createInfo,
     *     XrFutureEXT*                                future);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This function starts an asynchronous spatial anchor creation. Call one of the {@link EXTFuture#xrPollFutureEXT PollFutureEXT} functions to check the ready state on the future. Once the future is in ready state, call {@link #xrCreateSpatialAnchorsCompleteML CreateSpatialAnchorsCompleteML} to retrieve the results.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLSpatialAnchors XR_ML_spatial_anchors} extension <b>must</b> be enabled prior to calling {@link #xrCreateSpatialAnchorsAsyncML CreateSpatialAnchorsAsyncML}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrSpatialAnchorsCreateInfoBaseHeaderML}-based structure. See also: {@link XrSpatialAnchorsCreateInfoFromPoseML}, {@link XrSpatialAnchorsCreateInfoFromUuidsML}</li>
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
     * <li>{@link #XR_ERROR_SPATIAL_ANCHORS_SPACE_NOT_LOCATABLE_ML ERROR_SPATIAL_ANCHORS_SPACE_NOT_LOCATABLE_ML}</li>
     * <li>{@link #XR_ERROR_SPATIAL_ANCHORS_PERMISSION_DENIED_ML ERROR_SPATIAL_ANCHORS_PERMISSION_DENIED_ML}</li>
     * <li>{@link XR10#XR_ERROR_POSE_INVALID ERROR_POSE_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpatialAnchorsCreateInfoBaseHeaderML}, {@link XrSpatialAnchorsCreateInfoFromPoseML}, {@link #xrCreateSpatialAnchorsCompleteML CreateSpatialAnchorsCompleteML}</p>
     *
     * @param session    a handle to an {@code XrSession} previously created with {@link XR10#xrCreateSession CreateSession}.
     * @param createInfo a pointer to an {@link XrSpatialAnchorsCreateInfoBaseHeaderML} derived structure.
     * @param future     a pointer to an {@code XrFutureEXT}.
     */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorsAsyncML(XrSession session, @NativeType("XrSpatialAnchorsCreateInfoBaseHeaderML const *") XrSpatialAnchorsCreateInfoBaseHeaderML createInfo, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrCreateSpatialAnchorsAsyncML(session, createInfo.address(), memAddress(future));
    }

    // --- [ xrCreateSpatialAnchorsCompleteML ] ---

    /** Unsafe version of: {@link #xrCreateSpatialAnchorsCompleteML CreateSpatialAnchorsCompleteML} */
    public static int nxrCreateSpatialAnchorsCompleteML(XrSession session, long future, long completion) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAnchorsCompleteML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), future, completion, __functionAddress);
    }

    /**
     * Completion function for spatial anchor creation.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateSpatialAnchorsCompleteML CreateSpatialAnchorsCompleteML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateSpatialAnchorsCompleteML(
     *     XrSession                                   session,
     *     XrFutureEXT                                 future,
     *     XrCreateSpatialAnchorsCompletionML*         completion);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLSpatialAnchors XR_ML_spatial_anchors} extension <b>must</b> be enabled prior to calling {@link #xrCreateSpatialAnchorsCompleteML CreateSpatialAnchorsCompleteML}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code completion} <b>must</b> be a pointer to an {@link XrCreateSpatialAnchorsCompletionML} structure</li>
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
     * <p>{@link XrCreateSpatialAnchorsCompletionML}, {@link #xrCreateSpatialAnchorsAsyncML CreateSpatialAnchorsAsyncML}</p>
     *
     * @param session    a handle to an {@code XrSession} previously created with {@link XR10#xrCreateSession CreateSession}.
     * @param future     the {@code XrFutureEXT} to complete.
     * @param completion a pointer to an {@link XrCreateSpatialAnchorsCompletionML} filled in by the runtime.
     */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorsCompleteML(XrSession session, @NativeType("XrFutureEXT") long future, @NativeType("XrCreateSpatialAnchorsCompletionML *") XrCreateSpatialAnchorsCompletionML completion) {
        return nxrCreateSpatialAnchorsCompleteML(session, future, completion.address());
    }

    // --- [ xrGetSpatialAnchorStateML ] ---

    /** Unsafe version of: {@link #xrGetSpatialAnchorStateML GetSpatialAnchorStateML} */
    public static int nxrGetSpatialAnchorStateML(XrSpace anchor, long state) {
        long __functionAddress = anchor.getCapabilities().xrGetSpatialAnchorStateML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(anchor.address(), state, __functionAddress);
    }

    /**
     * Retrieve spatial anchor state.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetSpatialAnchorStateML GetSpatialAnchorStateML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetSpatialAnchorStateML(
     *     XrSpace                                     anchor,
     *     XrSpatialAnchorStateML*                     state);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if the {@code XrSpace} is not an spatial anchor.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLSpatialAnchors XR_ML_spatial_anchors} extension <b>must</b> be enabled prior to calling {@link #xrGetSpatialAnchorStateML GetSpatialAnchorStateML}</li>
     * <li>{@code anchor} <b>must</b> be a valid {@code XrSpace} handle</li>
     * <li>{@code state} <b>must</b> be a pointer to an {@link XrSpatialAnchorStateML} structure</li>
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
     * <p>{@link XrCreateSpatialAnchorsCompletionML}, {@link XrSpatialAnchorStateML}, {@link #xrCreateSpatialAnchorsAsyncML CreateSpatialAnchorsAsyncML}</p>
     *
     * @param anchor a handle to an {@code XrSpace} corresponding to a spatial anchor.
     * @param state  a pointer to an {@link XrSpatialAnchorStateML} structure to populate with the spatial anchor state.
     */
    @NativeType("XrResult")
    public static int xrGetSpatialAnchorStateML(XrSpace anchor, @NativeType("XrSpatialAnchorStateML *") XrSpatialAnchorStateML state) {
        return nxrGetSpatialAnchorStateML(anchor, state.address());
    }

}