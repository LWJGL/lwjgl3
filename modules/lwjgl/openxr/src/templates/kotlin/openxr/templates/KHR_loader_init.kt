/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_loader_init = "KHRLoaderInit".nativeClassXR("KHR_loader_init", type = "instance", postfix = "KHR") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_loader_init_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_LOADER_INIT_EXTENSION_NAME".."XR_KHR_loader_init"
    )

    GlobalCommand..XrResult(
        "InitializeLoaderKHR",
        """
        Initializes loader.

        <h5>C Specification</h5>
        To initialize an OpenXR loader with platform or implementation-specific parameters, call:

        <pre><code>
￿XrResult xrInitializeLoaderKHR(
￿    const XrLoaderInitInfoBaseHeaderKHR*        loaderInitInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHRLoaderInit XR_KHR_loader_init} extension <b>must</b> be enabled prior to calling #InitializeLoaderKHR()</li>
            <li>{@code loaderInitInfo} <b>must</b> be a pointer to a valid ##XrLoaderInitInfoBaseHeaderKHR-based structure</li>
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
                <li>#ERROR_VALIDATION_FAILURE</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrLoaderInitInfoBaseHeaderKHR
        """,

        XrLoaderInitInfoBaseHeaderKHR.const.p("loaderInitInfo", "a pointer to an ##XrLoaderInitInfoBaseHeaderKHR structure, which is a polymorphic type defined by other platform- or implementation-specific extensions.")
    )
}