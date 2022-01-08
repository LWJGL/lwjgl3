/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_opengl_es_enable = "KHROpenGLESEnable".nativeClassXR("KHR_opengl_es_enable", type = "instance", postfix = "KHR") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_opengl_es_enable_SPEC_VERSION".."8"
    )

    StringConstant(
        "The extension name.",

        "KHR_OPENGL_ES_ENABLE_EXTENSION_NAME".."XR_KHR_opengl_es_enable"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_GRAPHICS_BINDING_OPENGL_ES_ANDROID_KHR".."1000024001",
        "TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR".."1000024002",
        "TYPE_GRAPHICS_REQUIREMENTS_OPENGL_ES_KHR".."1000024003"
    )

    XrResult(
        "GetOpenGLESGraphicsRequirementsKHR",
        """
        Retrieve the OpenGL ES version requirements for an instance and system.

        <h5>C Specification</h5>
        To query OpenGL ES API version requirements for an instance and system, call:

        <pre><code>
￿XrResult xrGetOpenGLESGraphicsRequirementsKHR(
￿    XrInstance                                  instance,
￿    XrSystemId                                  systemId,
￿    XrGraphicsRequirementsOpenGLESKHR*          graphicsRequirements);</code></pre>

        <h5>Description</h5>
        The #GetOpenGLESGraphicsRequirementsKHR() function identifies to the application the minimum OpenGL ES version requirement and the highest known tested OpenGL ES version. The runtime <b>must</b> return #ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING (#ERROR_VALIDATION_FAILURE <b>may</b> be returned due to legacy behavior) on calls to #CreateSession() if #GetOpenGLESGraphicsRequirementsKHR() has not been called for the same {@code instance} and {@code systemId}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHROpenGLESEnable XR_KHR_opengl_es_enable} extension <b>must</b> be enabled prior to calling #GetOpenGLESGraphicsRequirementsKHR()</li>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code graphicsRequirements} <b>must</b> be a pointer to an ##XrGraphicsRequirementsOpenGLESKHR structure</li>
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
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SYSTEM_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrGraphicsRequirementsOpenGLESKHR
        """,

        XrInstance("instance", "an {@code XrInstance} handle previously created with #CreateInstance()."),
        XrSystemId("systemId", "an {@code XrSystemId} handle for the system which will be used to create a session."),
        XrGraphicsRequirementsOpenGLESKHR.p("graphicsRequirements", "the ##XrGraphicsRequirementsOpenGLESKHR output structure.")
    )
}