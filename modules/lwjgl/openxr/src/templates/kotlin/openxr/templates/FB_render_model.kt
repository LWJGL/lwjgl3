/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_render_model = "FBRenderModel".nativeClassXR("FB_render_model", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_render_model">XR_FB_render_model</a> extension.

        This extension allows applications to request GLTF models for certain connected devices supported by the runtime. Paths that correspond to these devices will be provided through the extension and can be used to get information about the models as well as loading them.
        """

    IntConstant(
        "The extension specification version.",

        "FB_render_model_SPEC_VERSION".."4"
    )

    StringConstant(
        "The extension name.",

        "FB_RENDER_MODEL_EXTENSION_NAME".."XR_FB_render_model"
    )

    EnumConstant(
        "XR_MAX_RENDER_MODEL_NAME_SIZE_FB",

        "MAX_RENDER_MODEL_NAME_SIZE_FB".."64"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_RENDER_MODEL_PATH_INFO_FB".."1000119000",
        "TYPE_RENDER_MODEL_PROPERTIES_FB".."1000119001",
        "TYPE_RENDER_MODEL_BUFFER_FB".."1000119002",
        "TYPE_RENDER_MODEL_LOAD_INFO_FB".."1000119003",
        "TYPE_SYSTEM_RENDER_MODEL_PROPERTIES_FB".."1000119004",
        "TYPE_RENDER_MODEL_CAPABILITIES_REQUEST_FB".."1000119005"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_RENDER_MODEL_KEY_INVALID_FB".."-1000119000",
        "RENDER_MODEL_UNAVAILABLE_FB".."1000119020"
    )

    EnumConstant(
        """
        XrRenderModelFlagBitsFB - XrRenderModelFlagBitsFB

        <h5>Flag Descriptions</h5>
        <ul>
            <li>#RENDER_MODEL_SUPPORTS_GLTF_2_0_SUBSET_1_BIT_FB — Minimal level of support.  Can only contain a single mesh.  Can only contain a single texture.  Can not contain transparency.  Assumes unlit rendering.  Requires Extension KHR_texturebasisu.</li>
            <li>#RENDER_MODEL_SUPPORTS_GLTF_2_0_SUBSET_2_BIT_FB — All of XR_RENDER_MODEL_SUPPORTS_GLTF_2_0_SUBSET_1_BIT_FB support plus: Multiple meshes. Multiple Textures. Texture Transparency.</li>
        </ul>

        Render Model Support Levels: An application <b>should</b> request a model of a certain complexity via the ##XrRenderModelCapabilitiesRequestFB on the structure chain of ##XrRenderModelPropertiesFB passed into #GetRenderModelPropertiesFB(). The flags on the ##XrRenderModelCapabilitiesRequestFB are an acknowledgement of the application’s ability to render such a model. Multiple values of {@code XrRenderModelFlagBitsFB} can be set on this variable to indicate acceptance of different support levels. The flags parameter on the ##XrRenderModelPropertiesFB will indicate what capabilities the model in the runtime actually requires. It will be set to a single value of {@code XrRenderModelFlagBitsFB}.
        """,

        "RENDER_MODEL_SUPPORTS_GLTF_2_0_SUBSET_1_BIT_FB".enum(0x00000001),
        "RENDER_MODEL_SUPPORTS_GLTF_2_0_SUBSET_2_BIT_FB".enum(0x00000002)
    )

    XrResult(
        "EnumerateRenderModelPathsFB",
        """
        Enumerate supported render model paths.

        <h5>C Specification</h5>
        The #EnumerateRenderModelPathsFB() function is defined as:

        <pre><code>
￿XrResult xrEnumerateRenderModelPathsFB(
￿    XrSession                                   session,
￿    uint32_t                                    pathCapacityInput,
￿    uint32_t*                                   pathCountOutput,
￿    XrRenderModelPathInfoFB*                    paths);</code></pre>

        <h5>Description</h5>
        The application <b>must</b> call #EnumerateRenderModelPathsFB() to enumerate the valid render model paths that are supported by the runtime before calling #GetRenderModelPropertiesFB(). The paths returned <b>may</b> be used later in #GetRenderModelPropertiesFB().

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBRenderModel XR_FB_render_model} extension <b>must</b> be enabled prior to calling #EnumerateRenderModelPathsFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code pathCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code pathCapacityInput} is not 0, {@code paths} <b>must</b> be a pointer to an array of {@code pathCapacityInput} ##XrRenderModelPathInfoFB structures</li>
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

        <h5>See Also</h5>
        ##XrRenderModelPathInfoFB
        """,

        XrSession("session", "the specified {@code XrSession}."),
        AutoSize("paths")..uint32_t("pathCapacityInput", "the capacity of the {@code paths}, or 0 to retrieve the required capacity."),
        Check(1)..uint32_t.p("pathCountOutput", "a pointer to the count of {@code float} {@code paths} written, or a pointer to the required capacity in the case that {@code pathCapacityInput} is insufficient."),
        nullable..XrRenderModelPathInfoFB.p("paths", "a pointer to an application-allocated array that will be filled with ##XrRenderModelPathInfoFB values that are supported by the runtime, but <b>can</b> be {@code NULL} if {@code pathCapacityInput} is 0")
    )

    XrResult(
        "GetRenderModelPropertiesFB",
        """
        Get information for a render model.

        <h5>C Specification</h5>
        The #GetRenderModelPropertiesFB() function is defined as:

        <pre><code>
￿XrResult xrGetRenderModelPropertiesFB(
￿    XrSession                                   session,
￿    XrPath                                      path,
￿    XrRenderModelPropertiesFB*                  properties);</code></pre>

        <h5>Description</h5>
        #GetRenderModelPropertiesFB() is used for getting information for a render model using a path retrieved from #EnumerateRenderModelPathsFB(). The information returned will be for the connected device that corresponds to the path given. For example, using pathname:/model_fb/controller/left will return information for the left controller that is currently connected and will change if a different device that also represents a left controller is connected.

        The runtime <b>must</b> return #ERROR_CALL_ORDER_INVALID if #GetRenderModelPropertiesFB() is called with render model paths before calling #EnumerateRenderModelPathsFB(). The runtime <b>must</b> return #ERROR_PATH_INVALID if a path not given by #EnumerateRenderModelPathsFB() is used.

        If #GetRenderModelPropertiesFB() returns a success code of #RENDER_MODEL_UNAVAILABLE_FB and has a {@code modelKey} of #NULL_RENDER_MODEL_KEY_FB, this indicates that the model for the device is unavailable. The application <b>may</b> keep calling #GetRenderModelPropertiesFB() because the model <b>may</b> become available later when a device is connected.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBRenderModel XR_FB_render_model} extension <b>must</b> be enabled prior to calling #GetRenderModelPropertiesFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code properties} <b>must</b> be a pointer to an ##XrRenderModelPropertiesFB structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
                <li>#RENDER_MODEL_UNAVAILABLE_FB</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_PATH_UNSUPPORTED</li>
                <li>#ERROR_PATH_INVALID</li>
                <li>#ERROR_CALL_ORDER_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrRenderModelPropertiesFB
        """,

        XrSession("session", "the specified {@code XrSession}."),
        XrPath("path", "the path of the render model to get the properties for."),
        XrRenderModelPropertiesFB.p("properties", "a pointer to the ##XrRenderModelPropertiesFB to write the render model information to.")
    )

    XrResult(
        "LoadRenderModelFB",
        """
        Load binary data for a render model.

        <h5>C Specification</h5>
        The #LoadRenderModelFB() function is defined as:

        <pre><code>
￿XrResult xrLoadRenderModelFB(
￿    XrSession                                   session,
￿    const XrRenderModelLoadInfoFB*              info,
￿    XrRenderModelBufferFB*                      buffer);</code></pre>

        <h5>Description</h5>
        #LoadRenderModelFB() is used to load the GLTF model data using a valid {@code modelKey}. #LoadRenderModelFB() loads the model as a byte buffer containing the GLTF in the binary format (GLB). The GLB data <b>must</b> conform to the glTF 2.0 format defined at {uri-fb-gltf2} The GLB <b>may</b> contain texture data in a format that requires the use of the {@code KHR_texture_basisu} GLTF extension defined at {uri-fb-gltf2-basisu}. Therefore, the application <b>should</b> ensure it can handle this extension.

        If the device for the requested model is disconnected or does not match the {@code modelKey} provided, #LoadRenderModelFB() <b>must</b> return #RENDER_MODEL_UNAVAILABLE_FB as well as a {@code bufferCountOutput} value of 0 indicating that the model was not available.

        The #LoadRenderModelFB() function <b>may</b> be slow, therefore applications <b>should</b> call it from a non-time sensitive thread.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBRenderModel XR_FB_render_model} extension <b>must</b> be enabled prior to calling #LoadRenderModelFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code info} <b>must</b> be a pointer to a valid ##XrRenderModelLoadInfoFB structure</li>
            <li>{@code buffer} <b>must</b> be a pointer to an ##XrRenderModelBufferFB structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
                <li>#RENDER_MODEL_UNAVAILABLE_FB</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_RENDER_MODEL_KEY_INVALID_FB</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrRenderModelBufferFB, ##XrRenderModelLoadInfoFB
        """,

        XrSession("session", "the specified {@code XrSession}."),
        XrRenderModelLoadInfoFB.const.p("info", "a pointer to the ##XrRenderModelLoadInfoFB structure."),
        XrRenderModelBufferFB.p("buffer", "a pointer to the ##XrRenderModelBufferFB structure to write the binary data into.")
    )
}