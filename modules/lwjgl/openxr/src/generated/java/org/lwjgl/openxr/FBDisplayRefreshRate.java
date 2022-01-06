/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The FB_display_refresh_rate extension. */
public class FBDisplayRefreshRate {

    /** The extension specification version. */
    public static final int XR_FB_display_refresh_rate_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_DISPLAY_REFRESH_RATE_EXTENSION_NAME = "XR_FB_display_refresh_rate";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_EVENT_DATA_DISPLAY_REFRESH_RATE_CHANGED_FB = 1000101000;

    /** Extends {@code XrResult}. */
    public static final int XR_ERROR_DISPLAY_REFRESH_RATE_UNSUPPORTED_FB = -1000101000;

    protected FBDisplayRefreshRate() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateDisplayRefreshRatesFB ] ---

    /**
     * Unsafe version of: {@link #xrEnumerateDisplayRefreshRatesFB EnumerateDisplayRefreshRatesFB}
     *
     * @param displayRefreshRateCapacityInput the capacity of the {@code displayRefreshRates}, or 0 to retrieve the required capacity.
     */
    public static int nxrEnumerateDisplayRefreshRatesFB(XrSession session, int displayRefreshRateCapacityInput, long displayRefreshRateCountOutput, long displayRefreshRates) {
        long __functionAddress = session.getCapabilities().xrEnumerateDisplayRefreshRatesFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), displayRefreshRateCapacityInput, displayRefreshRateCountOutput, displayRefreshRates, __functionAddress);
    }

    /**
     * Enumerates display refresh rates.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrEnumerateDisplayRefreshRatesFB EnumerateDisplayRefreshRatesFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrEnumerateDisplayRefreshRatesFB(
     *     XrSession                                   session,
     *     uint32_t                                    displayRefreshRateCapacityInput,
     *     uint32_t*                                   displayRefreshRateCountOutput,
     *     float*                                      displayRefreshRates);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrEnumerateDisplayRefreshRatesFB EnumerateDisplayRefreshRatesFB} enumerates the display refresh rates supported by the current session. Display refresh rates <b>must</b> be in order from lowest to highest supported display refresh rates. Runtimes <b>must</b> always return identical buffer contents from this enumeration for the lifetime of the session.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBDisplayRefreshRate XR_FB_display_refresh_rate} extension <b>must</b> be enabled prior to calling {@link #xrEnumerateDisplayRefreshRatesFB EnumerateDisplayRefreshRatesFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code displayRefreshRateCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code displayRefreshRateCapacityInput} is not 0, {@code displayRefreshRates} <b>must</b> be a pointer to an array of {@code displayRefreshRateCapacityInput} {@code float} values</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrGetDisplayRefreshRateFB GetDisplayRefreshRateFB}, {@link #xrRequestDisplayRefreshRateFB RequestDisplayRefreshRateFB}</p>
     *
     * @param session                       the session that enumerates the supported display refresh rates.
     * @param displayRefreshRateCountOutput a pointer to the count of {@code float} {@code displayRefreshRates} written, or a pointer to the required capacity in the case that {@code displayRefreshRateCapacityInput} is 0.
     * @param displayRefreshRates           a pointer to an array of {@code float} display refresh rates, but <b>can</b> be {@code NULL} if {@code displayRefreshRateCapacityInput} is 0.
     */
    @NativeType("XrResult")
    public static int xrEnumerateDisplayRefreshRatesFB(XrSession session, @NativeType("uint32_t *") IntBuffer displayRefreshRateCountOutput, @Nullable @NativeType("float *") FloatBuffer displayRefreshRates) {
        if (CHECKS) {
            check(displayRefreshRateCountOutput, 1);
        }
        return nxrEnumerateDisplayRefreshRatesFB(session, remainingSafe(displayRefreshRates), memAddress(displayRefreshRateCountOutput), memAddressSafe(displayRefreshRates));
    }

    // --- [ xrGetDisplayRefreshRateFB ] ---

    /** Unsafe version of: {@link #xrGetDisplayRefreshRateFB GetDisplayRefreshRateFB} */
    public static int nxrGetDisplayRefreshRateFB(XrSession session, long displayRefreshRate) {
        long __functionAddress = session.getCapabilities().xrGetDisplayRefreshRateFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), displayRefreshRate, __functionAddress);
    }

    /**
     * Get the current display refresh rate.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetDisplayRefreshRateFB GetDisplayRefreshRateFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetDisplayRefreshRateFB(
     *     XrSession                                   session,
     *     float*                                      displayRefreshRate);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrGetDisplayRefreshRateFB GetDisplayRefreshRateFB} retrieves the current display refresh rate.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBDisplayRefreshRate XR_FB_display_refresh_rate} extension <b>must</b> be enabled prior to calling {@link #xrGetDisplayRefreshRateFB GetDisplayRefreshRateFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code displayRefreshRate} <b>must</b> be a pointer to a {@code float} value</li>
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
     * <p>{@link #xrEnumerateDisplayRefreshRatesFB EnumerateDisplayRefreshRatesFB}, {@link #xrRequestDisplayRefreshRateFB RequestDisplayRefreshRateFB}</p>
     *
     * @param session            the {@code XrSession} to query.
     * @param displayRefreshRate a pointer to a float into which the current display refresh rate will be placed.
     */
    @NativeType("XrResult")
    public static int xrGetDisplayRefreshRateFB(XrSession session, @NativeType("float *") FloatBuffer displayRefreshRate) {
        if (CHECKS) {
            check(displayRefreshRate, 1);
        }
        return nxrGetDisplayRefreshRateFB(session, memAddress(displayRefreshRate));
    }

    // --- [ xrRequestDisplayRefreshRateFB ] ---

    /**
     * Request a display refresh rate.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrRequestDisplayRefreshRateFB RequestDisplayRefreshRateFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrRequestDisplayRefreshRateFB(
     *     XrSession                                   session,
     *     float                                       displayRefreshRate);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrRequestDisplayRefreshRateFB RequestDisplayRefreshRateFB} provides a mechanism for an application to request the system to dynamically change the display refresh rate to the application preferred value. The runtime <b>must</b> return {@link #XR_ERROR_DISPLAY_REFRESH_RATE_UNSUPPORTED_FB ERROR_DISPLAY_REFRESH_RATE_UNSUPPORTED_FB} if {@code displayRefreshRate} is not either {@code 0.0f} or one of the values enumerated by {@link #xrEnumerateDisplayRefreshRatesFB EnumerateDisplayRefreshRatesFB}. A display refresh rate of {@code 0.0f} indicates the application has no preference.</p>
     * 
     * <p>Note that this is only a request and does not guarantee the system will switch to the requested display refresh rate.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBDisplayRefreshRate XR_FB_display_refresh_rate} extension <b>must</b> be enabled prior to calling {@link #xrRequestDisplayRefreshRateFB RequestDisplayRefreshRateFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
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
     * <li>{@link #XR_ERROR_DISPLAY_REFRESH_RATE_UNSUPPORTED_FB ERROR_DISPLAY_REFRESH_RATE_UNSUPPORTED_FB}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrEnumerateDisplayRefreshRatesFB EnumerateDisplayRefreshRatesFB}, {@link #xrGetDisplayRefreshRateFB GetDisplayRefreshRateFB}</p>
     *
     * @param session            a valid {@code XrSession} handle.
     * @param displayRefreshRate {@code 0.0f} or a supported display refresh rate. Supported display refresh rates are indicated by {@link #xrEnumerateDisplayRefreshRatesFB EnumerateDisplayRefreshRatesFB}.
     */
    @NativeType("XrResult")
    public static int xrRequestDisplayRefreshRateFB(XrSession session, float displayRefreshRate) {
        long __functionAddress = session.getCapabilities().xrRequestDisplayRefreshRateFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(session.address(), displayRefreshRate, __functionAddress);
    }

}