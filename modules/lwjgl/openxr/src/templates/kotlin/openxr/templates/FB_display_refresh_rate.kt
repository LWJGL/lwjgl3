/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_display_refresh_rate = "FBDisplayRefreshRate".nativeClassXR("FB_display_refresh_rate", type = "instance", postfix = "FB") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "FB_display_refresh_rate_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_DISPLAY_REFRESH_RATE_EXTENSION_NAME".."XR_FB_display_refresh_rate"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_EVENT_DATA_DISPLAY_REFRESH_RATE_CHANGED_FB".."1000101000"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_DISPLAY_REFRESH_RATE_UNSUPPORTED_FB".."-1000101000"
    )

    XrResult(
        "EnumerateDisplayRefreshRatesFB",
        """
        Enumerates display refresh rates.

        <h5>C Specification</h5>
        The #EnumerateDisplayRefreshRatesFB() function is defined as:

        <pre><code>
￿XrResult xrEnumerateDisplayRefreshRatesFB(
￿    XrSession                                   session,
￿    uint32_t                                    displayRefreshRateCapacityInput,
￿    uint32_t*                                   displayRefreshRateCountOutput,
￿    float*                                      displayRefreshRates);</code></pre>

        <h5>Description</h5>
        #EnumerateDisplayRefreshRatesFB() enumerates the display refresh rates supported by the current session. Display refresh rates <b>must</b> be in order from lowest to highest supported display refresh rates. Runtimes <b>must</b> always return identical buffer contents from this enumeration for the lifetime of the session.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBDisplayRefreshRate XR_FB_display_refresh_rate} extension <b>must</b> be enabled prior to calling #EnumerateDisplayRefreshRatesFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code displayRefreshRateCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code displayRefreshRateCapacityInput} is not 0, {@code displayRefreshRates} <b>must</b> be a pointer to an array of {@code displayRefreshRateCapacityInput} {@code float} values</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #GetDisplayRefreshRateFB(), #RequestDisplayRefreshRateFB()
        """,

        XrSession("session", "the session that enumerates the supported display refresh rates."),
        AutoSize("displayRefreshRates")..uint32_t("displayRefreshRateCapacityInput", "the capacity of the {@code displayRefreshRates}, or 0 to retrieve the required capacity."),
        Check(1)..uint32_t.p("displayRefreshRateCountOutput", "a pointer to the count of {@code float} {@code displayRefreshRates} written, or a pointer to the required capacity in the case that {@code displayRefreshRateCapacityInput} is 0."),
        nullable..float.p("displayRefreshRates", "a pointer to an array of {@code float} display refresh rates, but <b>can</b> be {@code NULL} if {@code displayRefreshRateCapacityInput} is 0.")
    )

    XrResult(
        "GetDisplayRefreshRateFB",
        """
        Get the current display refresh rate.

        <h5>C Specification</h5>
        The #GetDisplayRefreshRateFB() function is defined as:

        <pre><code>
￿XrResult xrGetDisplayRefreshRateFB(
￿    XrSession                                   session,
￿    float*                                      displayRefreshRate);</code></pre>

        <h5>Description</h5>
        #GetDisplayRefreshRateFB() retrieves the current display refresh rate.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBDisplayRefreshRate XR_FB_display_refresh_rate} extension <b>must</b> be enabled prior to calling #GetDisplayRefreshRateFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code displayRefreshRate} <b>must</b> be a pointer to a {@code float} value</li>
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
        #EnumerateDisplayRefreshRatesFB(), #RequestDisplayRefreshRateFB()
        """,

        XrSession("session", "the {@code XrSession} to query."),
        Check(1)..float.p("displayRefreshRate", "a pointer to a float into which the current display refresh rate will be placed.")
    )

    XrResult(
        "RequestDisplayRefreshRateFB",
        """
        Request a display refresh rate.

        <h5>C Specification</h5>
        The #RequestDisplayRefreshRateFB() function is defined as:

        <pre><code>
￿XrResult xrRequestDisplayRefreshRateFB(
￿    XrSession                                   session,
￿    float                                       displayRefreshRate);</code></pre>

        <h5>Description</h5>
        #RequestDisplayRefreshRateFB() provides a mechanism for an application to request the system to dynamically change the display refresh rate to the application preferred value. The runtime <b>must</b> return #ERROR_DISPLAY_REFRESH_RATE_UNSUPPORTED_FB if {@code displayRefreshRate} is not either {@code 0.0f} or one of the values enumerated by #EnumerateDisplayRefreshRatesFB(). A display refresh rate of {@code 0.0f} indicates the application has no preference.

        Note that this is only a request and does not guarantee the system will switch to the requested display refresh rate.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBDisplayRefreshRate XR_FB_display_refresh_rate} extension <b>must</b> be enabled prior to calling #RequestDisplayRefreshRateFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
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
                <li>#ERROR_DISPLAY_REFRESH_RATE_UNSUPPORTED_FB</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #EnumerateDisplayRefreshRatesFB(), #GetDisplayRefreshRateFB()
        """,

        XrSession("session", "a valid {@code XrSession} handle."),
        float("displayRefreshRate", "{@code 0.0f} or a supported display refresh rate. Supported display refresh rates are indicated by #EnumerateDisplayRefreshRatesFB().")
    )
}