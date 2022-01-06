/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_perception_anchor_interop = "MSFTPerceptionAnchorInterop".nativeClassXR("MSFT_perception_anchor_interop", type = "instance", postfix = "MSFT") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "MSFT_perception_anchor_interop_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "MSFT_PERCEPTION_ANCHOR_INTEROP_EXTENSION_NAME".."XR_MSFT_perception_anchor_interop"
    )

    XrResult(
        "CreateSpatialAnchorFromPerceptionAnchorMSFT",
        """
        Create an {@code XrSpatialAnchorMSFT} from a Windows SpatialAnchor pointer.

        <h5>C Specification</h5>
        The #CreateSpatialAnchorFromPerceptionAnchorMSFT() function creates a {@code XrSpatialAnchorMSFT} handle from an {@code IUnknown} pointer to <a target="_blank" href="https://docs.microsoft.com/uwp/api/Windows.Perception.Spatial.SpatialAnchor">Windows.Perception.Spatial.SpatialAnchor</a>.

        <pre><code>
￿XrResult xrCreateSpatialAnchorFromPerceptionAnchorMSFT(
￿    XrSession                                   session,
￿    IUnknown*                                   perceptionAnchor,
￿    XrSpatialAnchorMSFT*                        anchor);</code></pre>

        <h5>Description</h5>
        The input {@code perceptionAnchor} <b>must</b> support successful {@code QueryInterface} to <a target="_blank" href="https://docs.microsoft.com/uwp/api/Windows.Perception.Spatial.SpatialAnchor">Windows.Perception.Spatial.SpatialAnchor</a> , otherwise the runtime <b>must</b> return #ERROR_VALIDATION_FAILURE.

        If the function successfully returned, the output {@code anchor} <b>must</b> be a valid handle. This also increments the refcount of the {@code perceptionAnchor} object.

        When application is done with the {@code anchor} handle, it <b>can</b> be destroyed using #DestroySpatialAnchorMSFT() function. This also decrements the refcount of underlying windows perception anchor object.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTPerceptionAnchorInterop XR_MSFT_perception_anchor_interop} extension <b>must</b> be enabled prior to calling #CreateSpatialAnchorFromPerceptionAnchorMSFT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code perceptionAnchor} <b>must</b> be a pointer to an {@code IUnknown} value</li>
            <li>{@code anchor} <b>must</b> be a pointer to an {@code XrSpatialAnchorMSFT} handle</li>
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

        XrSession("session", "the specified {@code XrSession}."),
        IUnknown.p("perceptionAnchor", "an IUnknown pointer to a <a target=\"_blank\" href=\"https://docs.microsoft.com/uwp/api/Windows.Perception.Spatial.SpatialAnchor\">Windows.Perception.Spatial.SpatialAnchor</a> object."),
        Check(1)..XrSpatialAnchorMSFT.p("anchor", "a pointer to {@code XrSpatialAnchorMSFT} to receive the returned anchor handle.")
    )

    XrResult(
        "TryGetPerceptionAnchorFromSpatialAnchorMSFT",
        """
        Convert an {@code XrSpatialAnchorMSFT} to a Windows SpatialAnchor.

        <h5>C Specification</h5>
        The #TryGetPerceptionAnchorFromSpatialAnchorMSFT() function converts a {@code XrSpatialAnchorMSFT} handle into an {@code IUnknown} pointer to <a target="_blank" href="https://docs.microsoft.com/uwp/api/Windows.Perception.Spatial.SpatialAnchor">Windows.Perception.Spatial.SpatialAnchor</a>.

        <pre><code>
￿XrResult xrTryGetPerceptionAnchorFromSpatialAnchorMSFT(
￿    XrSession                                   session,
￿    XrSpatialAnchorMSFT                         anchor,
￿    IUnknown**                                  perceptionAnchor);</code></pre>

        <h5>Description</h5>
        If the runtime can convert the {@code anchor} to a <a target="_blank" href="https://docs.microsoft.com/uwp/api/Windows.Perception.Spatial.SpatialAnchor">Windows.Perception.Spatial.SpatialAnchor</a> object, this function <b>must</b> return #SUCCESS, and the output {@code IUnknown} in the pointer of {@code perceptionAnchor} <b>must</b> be not {@code NULL}. This also increments the refcount of the object. The application <b>can</b> then use {@code QueryInterface} to get the pointer for <a target="_blank" href="https://docs.microsoft.com/uwp/api/Windows.Perception.Spatial.SpatialAnchor">Windows.Perception.Spatial.SpatialAnchor</a> object. The application <b>should</b> release the COM pointer after done with the object, or attach it to a smart COM pointer such as {@code winrt::com_ptr}.

        If the runtime cannot convert the {@code anchor} to a <a target="_blank" href="https://docs.microsoft.com/uwp/api/Windows.Perception.Spatial.SpatialAnchor">Windows.Perception.Spatial.SpatialAnchor</a> object, the function <b>must</b> return #SUCCESS, and the output {@code IUnknown} in the pointer of {@code perceptionAnchor} <b>must</b> be {@code NULL}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTPerceptionAnchorInterop XR_MSFT_perception_anchor_interop} extension <b>must</b> be enabled prior to calling #TryGetPerceptionAnchorFromSpatialAnchorMSFT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code anchor} <b>must</b> be a valid {@code XrSpatialAnchorMSFT} handle</li>
            <li>{@code perceptionAnchor} <b>must</b> be a pointer to a pointer to an {@code IUnknown} value</li>
            <li>{@code anchor} <b>must</b> have been created, allocated, or retrieved from {@code session}</li>
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

        XrSession("session", "the specified {@code XrSession}."),
        XrSpatialAnchorMSFT("anchor", "a valid {@code XrSpatialAnchorMSFT} handle."),
        Check(1)..IUnknown.p.p("perceptionAnchor", "a valid pointer to IUnknown pointer to receive the output <a target=\"_blank\" href=\"https://docs.microsoft.com/uwp/api/Windows.Perception.Spatial.SpatialAnchor\">Windows.Perception.Spatial.SpatialAnchor</a> object.")
    )
}