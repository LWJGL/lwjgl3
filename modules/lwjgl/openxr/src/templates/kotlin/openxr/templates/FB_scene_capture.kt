/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_scene_capture = "FBSceneCapture".nativeClassXR("FB_scene_capture", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_scene_capture">XR_FB_scene_capture</a> extension.

        This extension allows an application to request that the system begin capturing information about what is in the environment around the user.

        In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into #CreateInstance() via the ##XrInstanceCreateInfo{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#extensions">extensions</a> section.
        """

    IntConstant(
        "The extension specification version.",

        "FB_scene_capture_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_SCENE_CAPTURE_EXTENSION_NAME".."XR_FB_scene_capture"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_EVENT_DATA_SCENE_CAPTURE_COMPLETE_FB".."1000198001",
        "TYPE_SCENE_CAPTURE_REQUEST_INFO_FB".."1000198050"
    )

    XrResult(
        "RequestSceneCaptureFB",
        """
        Begins a scene capture using the specified parameters.

        <h5>C Specification</h5>
        The #RequestSceneCaptureFB() function is defined as:

        <pre><code>
￿XrResult xrRequestSceneCaptureFB(
￿    XrSession                                   session,
￿    const XrSceneCaptureRequestInfoFB*          info,
￿    XrAsyncRequestIdFB*                         requestId);</code></pre>

        <h5>Description</h5>
        The #RequestSceneCaptureFB() function is used by an application to begin capturing the scene around the user. This is an asynchronous operation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBSceneCapture XR_FB_scene_capture} extension <b>must</b> be enabled prior to calling #RequestSceneCaptureFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code info} <b>must</b> be a pointer to a valid ##XrSceneCaptureRequestInfoFB structure</li>
            <li>{@code requestId} <b>must</b> be a pointer to an {@code XrAsyncRequestIdFB} value</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSceneCaptureRequestInfoFB
        """,

        XrSession("session", "a handle to an {@code XrSession}."),
        XrSceneCaptureRequestInfoFB.const.p("info", "an ##XrSceneCaptureRequestInfoFB which specifies how the scene capture should occur."),
        Check(1)..XrAsyncRequestIdFB.p("requestId", "the output parameter that points to the ID of this asynchronous request.")
    )
}