/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The MSFT_perception_anchor_interop extension. */
public class MSFTPerceptionAnchorInterop {

    /** The extension specification version. */
    public static final int XR_MSFT_perception_anchor_interop_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_MSFT_PERCEPTION_ANCHOR_INTEROP_EXTENSION_NAME = "XR_MSFT_perception_anchor_interop";

    protected MSFTPerceptionAnchorInterop() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpatialAnchorFromPerceptionAnchorMSFT ] ---

    /** Unsafe version of: {@link #xrCreateSpatialAnchorFromPerceptionAnchorMSFT CreateSpatialAnchorFromPerceptionAnchorMSFT} */
    public static int nxrCreateSpatialAnchorFromPerceptionAnchorMSFT(XrSession session, long perceptionAnchor, long anchor) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAnchorFromPerceptionAnchorMSFT;
        if (CHECKS) {
            check(__functionAddress);
            check(perceptionAnchor);
        }
        return callPPPI(session.address(), perceptionAnchor, anchor, __functionAddress);
    }

    /**
     * Create an {@code XrSpatialAnchorMSFT} from a Windows SpatialAnchor pointer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateSpatialAnchorFromPerceptionAnchorMSFT CreateSpatialAnchorFromPerceptionAnchorMSFT} function creates a {@code XrSpatialAnchorMSFT} handle from an {@code IUnknown} pointer to <a target="_blank" href="https://docs.microsoft.com/uwp/api/Windows.Perception.Spatial.SpatialAnchor">Windows.Perception.Spatial.SpatialAnchor</a>.</p>
     * 
     * <pre><code>
     * XrResult xrCreateSpatialAnchorFromPerceptionAnchorMSFT(
     *     XrSession                                   session,
     *     IUnknown*                                   perceptionAnchor,
     *     XrSpatialAnchorMSFT*                        anchor);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The input {@code perceptionAnchor} <b>must</b> support successful {@code QueryInterface} to <a target="_blank" href="https://docs.microsoft.com/uwp/api/Windows.Perception.Spatial.SpatialAnchor">Windows.Perception.Spatial.SpatialAnchor</a> , otherwise the runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}.</p>
     * 
     * <p>If the function successfully returned, the output {@code anchor} <b>must</b> be a valid handle. This also increments the refcount of the {@code perceptionAnchor} object.</p>
     * 
     * <p>When application is done with the {@code anchor} handle, it <b>can</b> be destroyed using {@link MSFTSpatialAnchor#xrDestroySpatialAnchorMSFT DestroySpatialAnchorMSFT} function. This also decrements the refcount of underlying windows perception anchor object.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTPerceptionAnchorInterop XR_MSFT_perception_anchor_interop} extension <b>must</b> be enabled prior to calling {@link #xrCreateSpatialAnchorFromPerceptionAnchorMSFT CreateSpatialAnchorFromPerceptionAnchorMSFT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code perceptionAnchor} <b>must</b> be a pointer to an {@code IUnknown} value</li>
     * <li>{@code anchor} <b>must</b> be a pointer to an {@code XrSpatialAnchorMSFT} handle</li>
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
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * </ul></dd>
     * </dl>
     *
     * @param session          the specified {@code XrSession}.
     * @param perceptionAnchor an IUnknown pointer to a <a target="_blank" href="https://docs.microsoft.com/uwp/api/Windows.Perception.Spatial.SpatialAnchor">Windows.Perception.Spatial.SpatialAnchor</a> object.
     * @param anchor           a pointer to {@code XrSpatialAnchorMSFT} to receive the returned anchor handle.
     */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorFromPerceptionAnchorMSFT(XrSession session, @NativeType("IUnknown *") long perceptionAnchor, @NativeType("XrSpatialAnchorMSFT *") PointerBuffer anchor) {
        if (CHECKS) {
            check(anchor, 1);
        }
        return nxrCreateSpatialAnchorFromPerceptionAnchorMSFT(session, perceptionAnchor, memAddress(anchor));
    }

    // --- [ xrTryGetPerceptionAnchorFromSpatialAnchorMSFT ] ---

    /** Unsafe version of: {@link #xrTryGetPerceptionAnchorFromSpatialAnchorMSFT TryGetPerceptionAnchorFromSpatialAnchorMSFT} */
    public static int nxrTryGetPerceptionAnchorFromSpatialAnchorMSFT(XrSession session, XrSpatialAnchorMSFT anchor, long perceptionAnchor) {
        long __functionAddress = session.getCapabilities().xrTryGetPerceptionAnchorFromSpatialAnchorMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), anchor.address(), perceptionAnchor, __functionAddress);
    }

    /**
     * Convert an {@code XrSpatialAnchorMSFT} to a Windows SpatialAnchor.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrTryGetPerceptionAnchorFromSpatialAnchorMSFT TryGetPerceptionAnchorFromSpatialAnchorMSFT} function converts a {@code XrSpatialAnchorMSFT} handle into an {@code IUnknown} pointer to <a target="_blank" href="https://docs.microsoft.com/uwp/api/Windows.Perception.Spatial.SpatialAnchor">Windows.Perception.Spatial.SpatialAnchor</a>.</p>
     * 
     * <pre><code>
     * XrResult xrTryGetPerceptionAnchorFromSpatialAnchorMSFT(
     *     XrSession                                   session,
     *     XrSpatialAnchorMSFT                         anchor,
     *     IUnknown**                                  perceptionAnchor);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If the runtime can convert the {@code anchor} to a <a target="_blank" href="https://docs.microsoft.com/uwp/api/Windows.Perception.Spatial.SpatialAnchor">Windows.Perception.Spatial.SpatialAnchor</a> object, this function <b>must</b> return {@link XR10#XR_SUCCESS SUCCESS}, and the output {@code IUnknown} in the pointer of {@code perceptionAnchor} <b>must</b> be not {@code NULL}. This also increments the refcount of the object. The application <b>can</b> then use {@code QueryInterface} to get the pointer for <a target="_blank" href="https://docs.microsoft.com/uwp/api/Windows.Perception.Spatial.SpatialAnchor">Windows.Perception.Spatial.SpatialAnchor</a> object. The application <b>should</b> release the COM pointer after done with the object, or attach it to a smart COM pointer such as {@code winrt::com_ptr}.</p>
     * 
     * <p>If the runtime cannot convert the {@code anchor} to a <a target="_blank" href="https://docs.microsoft.com/uwp/api/Windows.Perception.Spatial.SpatialAnchor">Windows.Perception.Spatial.SpatialAnchor</a> object, the function <b>must</b> return {@link XR10#XR_SUCCESS SUCCESS}, and the output {@code IUnknown} in the pointer of {@code perceptionAnchor} <b>must</b> be {@code NULL}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTPerceptionAnchorInterop XR_MSFT_perception_anchor_interop} extension <b>must</b> be enabled prior to calling {@link #xrTryGetPerceptionAnchorFromSpatialAnchorMSFT TryGetPerceptionAnchorFromSpatialAnchorMSFT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code anchor} <b>must</b> be a valid {@code XrSpatialAnchorMSFT} handle</li>
     * <li>{@code perceptionAnchor} <b>must</b> be a pointer to a pointer to an {@code IUnknown} value</li>
     * <li>{@code anchor} <b>must</b> have been created, allocated, or retrieved from {@code session}</li>
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
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * </ul></dd>
     * </dl>
     *
     * @param session          the specified {@code XrSession}.
     * @param anchor           a valid {@code XrSpatialAnchorMSFT} handle.
     * @param perceptionAnchor a valid pointer to IUnknown pointer to receive the output <a target="_blank" href="https://docs.microsoft.com/uwp/api/Windows.Perception.Spatial.SpatialAnchor">Windows.Perception.Spatial.SpatialAnchor</a> object.
     */
    @NativeType("XrResult")
    public static int xrTryGetPerceptionAnchorFromSpatialAnchorMSFT(XrSession session, XrSpatialAnchorMSFT anchor, @NativeType("IUnknown **") PointerBuffer perceptionAnchor) {
        if (CHECKS) {
            check(perceptionAnchor, 1);
        }
        return nxrTryGetPerceptionAnchorFromSpatialAnchorMSFT(session, anchor, memAddress(perceptionAnchor));
    }

}