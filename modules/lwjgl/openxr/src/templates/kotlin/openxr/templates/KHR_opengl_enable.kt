/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_opengl_enable = "KHROpenGLEnable".nativeClassXR("KHR_opengl_enable", type = "instance", postfix = "KHR") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_KHR_opengl_enable">XR_KHR_opengl_enable</a> extension.

        This extension enables the use of the OpenGL graphics API in an OpenXR runtime. Without this extension, the OpenXR runtime <b>may</b> not be able to provide any OpenGL swapchain images.

        This extension provides the mechanisms necessary for an application to generate a valid stext:XrGraphicsBindingOpenGL*KHR structure in order to create an OpenGL-based {@code XrSession}. Note that during this process the application is responsible for creating an OpenGL context to be used for rendering. The runtime however will provide the OpenGL textures to render into in the form of a swapchain.

        This extension provides mechanisms for the application to interact with images acquired by calling #EnumerateSwapchainImages().

        In order to expose the structures, types, and functions of this extension, the application <b>must</b> define #USE_GRAPHICS_API_OPENGL, as well as an appropriate <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#window-system-header-control">window system define</a> supported by this extension, before including the OpenXR platform header {@code openxr_platform.h}, in all portions of the library or application that include it. The window system defines currently supported by this extension are:

        <ul>
            <li>#USE_PLATFORM_WIN32</li>
            <li>#USE_PLATFORM_XLIB</li>
            <li>#USE_PLATFORM_XCB</li>
            <li>#USE_PLATFORM_WAYLAND</li>
        </ul>

        Note that a runtime implementation of this extension is only required to support the structs introduced by this extension which belong to the platform it is running on.

        Note that the OpenGL context given to the call #CreateSession() <b>must</b> not be bound in another thread when calling the functions: #CreateSession(), #DestroySession(), #BeginFrame(), #EndFrame(), #CreateSwapchain(), #DestroySwapchain(), #EnumerateSwapchainImages(), #AcquireSwapchainImage(), #WaitSwapchainImage() and #ReleaseSwapchainImage(). It <b>may</b> be bound in the thread calling those functions. The runtime <b>must</b> not access the context from any other function. In particular the application must be able to call #WaitFrame() from a different thread than the rendering thread.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_opengl_enable_SPEC_VERSION".."10"
    )

    StringConstant(
        "The extension name.",

        "KHR_OPENGL_ENABLE_EXTENSION_NAME".."XR_KHR_opengl_enable"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR".."1000023000",
        "TYPE_GRAPHICS_BINDING_OPENGL_XLIB_KHR".."1000023001",
        "TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR".."1000023002",
        "TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR".."1000023003",
        "TYPE_SWAPCHAIN_IMAGE_OPENGL_KHR".."1000023004",
        "TYPE_GRAPHICS_REQUIREMENTS_OPENGL_KHR".."1000023005"
    )

    XrResult(
        "GetOpenGLGraphicsRequirementsKHR",
        """
        Retrieve the OpenGL version requirements for an instance and system.

        <h5>C Specification</h5>
        To query OpenGL API version requirements for an instance and system, call:

        <pre><code>
￿XrResult xrGetOpenGLGraphicsRequirementsKHR(
￿    XrInstance                                  instance,
￿    XrSystemId                                  systemId,
￿    XrGraphicsRequirementsOpenGLKHR*            graphicsRequirements);</code></pre>

        <h5>Description</h5>
        The #GetOpenGLGraphicsRequirementsKHR() function identifies to the application the minimum OpenGL version requirement and the highest known tested OpenGL version. The runtime <b>must</b> return #ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING (#ERROR_VALIDATION_FAILURE <b>may</b> be returned due to legacy behavior) on calls to #CreateSession() if #GetOpenGLGraphicsRequirementsKHR() has not been called for the same {@code instance} and {@code systemId}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link KHROpenGLEnable XR_KHR_opengl_enable} extension <b>must</b> be enabled prior to calling #GetOpenGLGraphicsRequirementsKHR()</li>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code graphicsRequirements} <b>must</b> be a pointer to an ##XrGraphicsRequirementsOpenGLKHR structure</li>
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
        ##XrGraphicsRequirementsOpenGLKHR
        """,

        XrInstance("instance", "an {@code XrInstance} handle previously created with #CreateInstance()."),
        XrSystemId("systemId", "an {@code XrSystemId} handle for the system which will be used to create a session."),
        XrGraphicsRequirementsOpenGLKHR.p("graphicsRequirements", "the ##XrGraphicsRequirementsOpenGLKHR output structure.")
    )
}