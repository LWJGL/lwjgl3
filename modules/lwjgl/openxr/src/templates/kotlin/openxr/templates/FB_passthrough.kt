/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_passthrough = "FBPassthrough".nativeClassXR("FB_passthrough", type = "instance", postfix = "FB") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "FB_passthrough_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_PASSTHROUGH_EXTENSION_NAME".."XR_FB_passthrough"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SYSTEM_PASSTHROUGH_PROPERTIES_FB".."1000118000",
        "TYPE_PASSTHROUGH_CREATE_INFO_FB".."1000118001",
        "TYPE_PASSTHROUGH_LAYER_CREATE_INFO_FB".."1000118002",
        "TYPE_COMPOSITION_LAYER_PASSTHROUGH_FB".."1000118003",
        "TYPE_GEOMETRY_INSTANCE_CREATE_INFO_FB".."1000118004",
        "TYPE_GEOMETRY_INSTANCE_TRANSFORM_FB".."1000118005",
        "TYPE_PASSTHROUGH_STYLE_FB".."1000118020",
        "TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_RGBA_FB".."1000118021",
        "TYPE_PASSTHROUGH_COLOR_MAP_MONO_TO_MONO_FB".."1000118022",
        "TYPE_EVENT_DATA_PASSTHROUGH_STATE_CHANGED_FB".."1000118030"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB".."-1000118000",
        "ERROR_FEATURE_ALREADY_CREATED_PASSTHROUGH_FB".."-1000118001",
        "ERROR_FEATURE_REQUIRED_PASSTHROUGH_FB".."-1000118002",
        "ERROR_NOT_PERMITTED_PASSTHROUGH_FB".."-1000118003",
        "ERROR_INSUFFICIENT_RESOURCES_PASSTHROUGH_FB".."-1000118004",
        "ERROR_UNKNOWN_PASSTHROUGH_FB".."-1000118050"
    )

    EnumConstant(
        "XR_PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB",

        "PASSTHROUGH_COLOR_MAP_MONO_SIZE_FB".."256"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_PASSTHROUGH_FB".."1000118000",
        "OBJECT_TYPE_PASSTHROUGH_LAYER_FB".."1000118002",
        "OBJECT_TYPE_GEOMETRY_INSTANCE_FB".."1000118004"
    )

    EnumConstant(
        "XrPassthroughFlagBitsFB",

        "PASSTHROUGH_IS_RUNNING_AT_CREATION_BIT_FB".enum(0x00000001)
    )

    EnumConstant(
        """
        XrPassthroughLayerPurposeFB - Layer purpose

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#PASSTHROUGH_LAYER_PURPOSE_RECONSTRUCTION_FB — Reconstruction passthrough (full screen environment)</li>
            <li>#PASSTHROUGH_LAYER_PURPOSE_PROJECTED_FB — Projected passthrough (using a custom surface)</li>
            <li>#PASSTHROUGH_LAYER_PURPOSE_TRACKED_KEYBOARD_HANDS_FB — Passthrough layer purpose for keyboard hands presence.</li>
        </ul>

        <h5>See Also</h5>
        ##XrPassthroughLayerCreateInfoFB
        """,

        "PASSTHROUGH_LAYER_PURPOSE_RECONSTRUCTION_FB".."0",
        "PASSTHROUGH_LAYER_PURPOSE_PROJECTED_FB".."1"
    )

    EnumConstant(
        "XrPassthroughStateChangedFlagBitsFB",

        "PASSTHROUGH_STATE_CHANGED_REINIT_REQUIRED_BIT_FB".enum(0x00000001),
        "PASSTHROUGH_STATE_CHANGED_NON_RECOVERABLE_ERROR_BIT_FB".enum(0x00000002),
        "PASSTHROUGH_STATE_CHANGED_RECOVERABLE_ERROR_BIT_FB".enum(0x00000004),
        "PASSTHROUGH_STATE_CHANGED_RESTORED_ERROR_BIT_FB".enum(0x00000008)
    )

    XrResult(
        "CreatePassthroughFB",
        """
        Create a passthrough feature.

        <h5>C Specification</h5>
        The #CreatePassthroughFB() function is defined as:

        <pre><code>
￿XrResult xrCreatePassthroughFB(
￿    XrSession                                   session,
￿    const XrPassthroughCreateInfoFB*            createInfo,
￿    XrPassthroughFB*                            outPassthrough);</code></pre>

        <h5>Description</h5>
        Creates an {@code XrPassthroughFB} handle. The returned passthrough handle <b>may</b> be subsequently used in API calls.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to calling #CreatePassthroughFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrPassthroughCreateInfoFB structure</li>
            <li>{@code outPassthrough} <b>must</b> be a pointer to an {@code XrPassthroughFB} handle</li>
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
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_UNKNOWN_PASSTHROUGH_FB</li>
                <li>#ERROR_NOT_PERMITTED_PASSTHROUGH_FB</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
                <li>#ERROR_FEATURE_ALREADY_CREATED_PASSTHROUGH_FB</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrPassthroughCreateInfoFB
        """,

        XrSession("session", "the {@code XrSession}."),
        XrPassthroughCreateInfoFB.const.p("createInfo", "the ##XrPassthroughCreateInfoFB."),
        Check(1)..XrPassthroughFB.p("outPassthrough", "the {@code XrPassthroughFB}.")
    )

    XrResult(
        "DestroyPassthroughFB",
        """
        Destroy a passthrough feature.

        <h5>C Specification</h5>
        The #DestroyPassthroughFB() function is defined as:

        <pre><code>
￿XrResult xrDestroyPassthroughFB(
￿    XrPassthroughFB                             passthrough);</code></pre>

        <h5>Description</h5>
        Destroys an {@code XrPassthroughFB} handle.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to calling #DestroyPassthroughFB()</li>
            <li>{@code passthrough} <b>must</b> be a valid {@code XrPassthroughFB} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code passthrough}, and any child handles, <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>
        """,

        XrPassthroughFB("passthrough", "the {@code XrPassthroughFB} to be destroyed.")
    )

    XrResult(
        "PassthroughStartFB",
        """
        Start a passthrough feature.

        <h5>C Specification</h5>
        The #PassthroughStartFB() function is defined as:

        <pre><code>
￿XrResult xrPassthroughStartFB(
￿    XrPassthroughFB                             passthrough);</code></pre>

        <h5>Description</h5>
        Starts an {@code XrPassthroughFB} feature. If the feature is not started, either explicitly with a call to #PassthroughStartFB(), or implicitly at creation using the behavior flags, it is considered paused. When the feature is paused, runtime will stop rendering and compositing all passthrough layers produced on behalf of the application, and may free up some or all the resources used to produce passthrough until #PassthroughStartFB() is called.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to calling #PassthroughStartFB()</li>
            <li>{@code passthrough} <b>must</b> be a valid {@code XrPassthroughFB} handle</li>
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
                <li>#ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>
        """,

        XrPassthroughFB("passthrough", "the {@code XrPassthroughFB} to be started.")
    )

    XrResult(
        "PassthroughPauseFB",
        """
        Pause a passthrough feature.

        <h5>C Specification</h5>
        The #PassthroughPauseFB() function is defined as:

        <pre><code>
￿XrResult xrPassthroughPauseFB(
￿    XrPassthroughFB                             passthrough);</code></pre>

        <h5>Description</h5>
        Pauses an {@code XrPassthroughFB} feature. When the feature is paused, runtime will stop rendering and compositing all passthrough layers produced on behalf of the application, and may free up some or all the resources used to produce passthrough until #PassthroughStartFB() is called.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to calling #PassthroughPauseFB()</li>
            <li>{@code passthrough} <b>must</b> be a valid {@code XrPassthroughFB} handle</li>
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
                <li>#ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>
        """,

        XrPassthroughFB("passthrough", "the {@code XrPassthroughFB} to be paused.")
    )

    XrResult(
        "CreatePassthroughLayerFB",
        """
        Create a passthrough layer.

        <h5>C Specification</h5>
        The #CreatePassthroughLayerFB() function is defined as:

        <pre><code>
￿XrResult xrCreatePassthroughLayerFB(
￿    XrSession                                   session,
￿    const XrPassthroughLayerCreateInfoFB*       createInfo,
￿    XrPassthroughLayerFB*                       outLayer);</code></pre>

        <h5>Description</h5>
        Creates an {@code XrPassthroughLayerFB} handle. The returned layer handle <b>may</b> be subsequently used in API calls. Layer objects may be used to specify rendering properties of the layer, such as styles, and compositing rules.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to calling #CreatePassthroughLayerFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrPassthroughLayerCreateInfoFB structure</li>
            <li>{@code outLayer} <b>must</b> be a pointer to an {@code XrPassthroughLayerFB} handle</li>
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
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_UNKNOWN_PASSTHROUGH_FB</li>
                <li>#ERROR_INSUFFICIENT_RESOURCES_PASSTHROUGH_FB</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
                <li>#ERROR_FEATURE_REQUIRED_PASSTHROUGH_FB</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrPassthroughLayerCreateInfoFB
        """,

        XrSession("session", "the {@code XrSession}."),
        XrPassthroughLayerCreateInfoFB.const.p("createInfo", "the ##XrPassthroughLayerCreateInfoFB."),
        Check(1)..XrPassthroughLayerFB.p("outLayer", "the {@code XrPassthroughLayerFB}.")
    )

    XrResult(
        "DestroyPassthroughLayerFB",
        """
        Destroy a passthrough layer.

        <h5>C Specification</h5>
        The #DestroyPassthroughLayerFB() function is defined as:

        <pre><code>
￿XrResult xrDestroyPassthroughLayerFB(
￿    XrPassthroughLayerFB                        layer);</code></pre>

        <h5>Description</h5>
        Destroys an {@code XrPassthroughLayerFB} handle.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to calling #DestroyPassthroughLayerFB()</li>
            <li>{@code layer} <b>must</b> be a valid {@code XrPassthroughLayerFB} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code layer}, and any child handles, <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>
        """,

        XrPassthroughLayerFB("layer", "the {@code XrPassthroughLayerFB} to be destroyed.")
    )

    XrResult(
        "PassthroughLayerPauseFB",
        """
        Pause a passthrough layer.

        <h5>C Specification</h5>
        The #PassthroughLayerPauseFB() function is defined as:

        <pre><code>
￿XrResult xrPassthroughLayerPauseFB(
￿    XrPassthroughLayerFB                        layer);</code></pre>

        <h5>Description</h5>
        Pauses an {@code XrPassthroughLayerFB} layer. Runtime will not render or composite paused layers.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to calling #PassthroughLayerPauseFB()</li>
            <li>{@code layer} <b>must</b> be a valid {@code XrPassthroughLayerFB} handle</li>
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
                <li>#ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>
        """,

        XrPassthroughLayerFB("layer", "the {@code XrPassthroughLayerFB} to be paused.")
    )

    XrResult(
        "PassthroughLayerResumeFB",
        """
        Resume a passthrough layer.

        <h5>C Specification</h5>
        The #PassthroughLayerResumeFB() function is defined as:

        <pre><code>
￿XrResult xrPassthroughLayerResumeFB(
￿    XrPassthroughLayerFB                        layer);</code></pre>

        <h5>Description</h5>
        Resumes an {@code XrPassthroughLayerFB} layer.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to calling #PassthroughLayerResumeFB()</li>
            <li>{@code layer} <b>must</b> be a valid {@code XrPassthroughLayerFB} handle</li>
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
                <li>#ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>
        """,

        XrPassthroughLayerFB("layer", "the {@code XrPassthroughLayerFB} to be resumed.")
    )

    XrResult(
        "PassthroughLayerSetStyleFB",
        """
        Set style on a passthrough layer.

        <h5>C Specification</h5>
        The #PassthroughLayerSetStyleFB() function is defined as:

        <pre><code>
￿XrResult xrPassthroughLayerSetStyleFB(
￿    XrPassthroughLayerFB                        layer,
￿    const XrPassthroughStyleFB*                 style);</code></pre>

        <h5>Description</h5>
        Sets an ##XrPassthroughStyleFB style on an {@code XrPassthroughLayerFB} layer.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to calling #PassthroughLayerSetStyleFB()</li>
            <li>{@code layer} <b>must</b> be a valid {@code XrPassthroughLayerFB} handle</li>
            <li>{@code style} <b>must</b> be a pointer to a valid ##XrPassthroughStyleFB structure</li>
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
        ##XrPassthroughStyleFB
        """,

        XrPassthroughLayerFB("layer", "the {@code XrPassthroughLayerFB} to get the style."),
        XrPassthroughStyleFB.const.p("style", "the ##XrPassthroughStyleFB to be set.")
    )

    XrResult(
        "CreateGeometryInstanceFB",
        """
        Create a triangle mesh.

        <h5>C Specification</h5>
        The #CreateGeometryInstanceFB() function is defined as:

        <pre><code>
￿XrResult xrCreateGeometryInstanceFB(
￿    XrSession                                   session,
￿    const XrGeometryInstanceCreateInfoFB*       createInfo,
￿    XrGeometryInstanceFB*                       outGeometryInstance);</code></pre>

        <h5>Description</h5>
        Creates an {@code XrGeometryInstanceFB} handle. Geometry instance functionality requires <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_triangle_mesh">XR_FB_triangle_mesh</a> extension to be enabled. An {@code XrGeometryInstanceFB} connects a layer, a mesh, and a transformation, with the semantics that a specific mesh will be instantiated in a specific layer with a specific transformation. A mesh can be instantiated multiple times, in the same or in different layers.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to calling #CreateGeometryInstanceFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrGeometryInstanceCreateInfoFB structure</li>
            <li>{@code outGeometryInstance} <b>must</b> be a pointer to an {@code XrGeometryInstanceFB} handle</li>
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
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_LIMIT_REACHED</li>
                <li>#ERROR_POSE_INVALID</li>
                <li>#ERROR_INSUFFICIENT_RESOURCES_PASSTHROUGH_FB</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrGeometryInstanceCreateInfoFB
        """,

        XrSession("session", "the {@code XrSession}."),
        XrGeometryInstanceCreateInfoFB.const.p("createInfo", "the ##XrGeometryInstanceCreateInfoFB."),
        Check(1)..XrGeometryInstanceFB.p("outGeometryInstance", "the {@code XrGeometryInstanceFB}.")
    )

    XrResult(
        "DestroyGeometryInstanceFB",
        """
        Destroy a geometry instance.

        <h5>C Specification</h5>
        The #DestroyGeometryInstanceFB() function is defined as:

        <pre><code>
￿XrResult xrDestroyGeometryInstanceFB(
￿    XrGeometryInstanceFB                        instance);</code></pre>

        <h5>Description</h5>
        Destroys an {@code XrGeometryInstanceFB} handle. Destroying an {@code XrGeometryInstanceFB} does not destroy a mesh and does not free mesh resources. Destroying a layer invalidates all geometry instances attached to it. Destroying a mesh invalidates all its instances.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to calling #DestroyGeometryInstanceFB()</li>
            <li>{@code instance} <b>must</b> be a valid {@code XrGeometryInstanceFB} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code instance}, and any child handles, <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>
        """,

        XrGeometryInstanceFB("instance", "")
    )

    XrResult(
        "GeometryInstanceSetTransformFB",
        """
        Create a triangle mesh.

        <h5>C Specification</h5>
        The #GeometryInstanceSetTransformFB() function is defined as:

        <pre><code>
￿XrResult xrGeometryInstanceSetTransformFB(
￿    XrGeometryInstanceFB                        instance,
￿    const XrGeometryInstanceTransformFB*        transformation);</code></pre>

        <h5>Description</h5>
        Sets an ##XrGeometryInstanceTransformFB transform on an {@code XrGeometryInstanceFB} geometry instance.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBPassthrough XR_FB_passthrough} extension <b>must</b> be enabled prior to calling #GeometryInstanceSetTransformFB()</li>
            <li>{@code instance} <b>must</b> be a valid {@code XrGeometryInstanceFB} handle</li>
            <li>{@code transformation} <b>must</b> be a pointer to a valid ##XrGeometryInstanceTransformFB structure</li>
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
                <li>#ERROR_TIME_INVALID</li>
                <li>#ERROR_POSE_INVALID</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrGeometryInstanceTransformFB
        """,

        XrGeometryInstanceFB("instance", ""),
        XrGeometryInstanceTransformFB.const.p("transformation", "")
    )
}