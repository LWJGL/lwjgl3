/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val HTC_passthrough = "HTCPassthrough".nativeClassXR("HTC_passthrough", type = "instance", postfix = "HTC") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_HTC_passthrough">XR_HTC_passthrough</a> extension.

        This extension enables an application to show the passthrough image to see the surrounding environment from the VR headset. The application is allowed to configure the passthrough image with the different appearances according to the demand of the application.

        The passthrough configurations that runtime provides to applications contain:

        <ul>
            <li>Decide the passthrough layer shown over or under the frame submitted by the application.</li>
            <li>Specify the passthrough form with full of the entire screen or projection onto the mesh specified by the application.</li>
            <li>Set the alpha blending level for the composition of the passthrough layer.</li>
        </ul>
        """

    IntConstant(
        "The extension specification version.",

        "HTC_passthrough_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "HTC_PASSTHROUGH_EXTENSION_NAME".."XR_HTC_passthrough"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_PASSTHROUGH_HTC".."1000317000"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_PASSTHROUGH_CREATE_INFO_HTC".."1000317001",
        "TYPE_PASSTHROUGH_COLOR_HTC".."1000317002",
        "TYPE_PASSTHROUGH_MESH_TRANSFORM_INFO_HTC".."1000317003",
        "TYPE_COMPOSITION_LAYER_PASSTHROUGH_HTC".."1000317004"
    )

    EnumConstant(
        """
        XrPassthroughFormHTC - Describes the form of passthrough.

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#PASSTHROUGH_FORM_PLANAR_HTC — Presents the passthrough with full of the entire screen.</li>
            <li>#PASSTHROUGH_FORM_PROJECTED_HTC — Presents the passthrough projecting onto a custom mesh.</li>
        </ul>

        <h5>See Also</h5>
        ##XrPassthroughCreateInfoHTC
        """,

        "PASSTHROUGH_FORM_PLANAR_HTC".."0",
        "PASSTHROUGH_FORM_PROJECTED_HTC".."1"
    )

    XrResult(
        "CreatePassthroughHTC",
        """
        Create a passthrough handle.

        <h5>C Specification</h5>
        The #CreatePassthroughHTC() function is defined as:

        <pre><code>
￿XrResult xrCreatePassthroughHTC(
￿    XrSession                                   session,
￿    const XrPassthroughCreateInfoHTC*           createInfo,
￿    XrPassthroughHTC*                           passthrough);</code></pre>

        <h5>Description</h5>
        Creates an {@code XrPassthroughHTC} handle.

        If the function successfully returned, the output {@code passthrough} <b>must</b> be a valid handle.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCPassthrough XR_HTC_passthrough} extension <b>must</b> be enabled prior to calling #CreatePassthroughHTC()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrPassthroughCreateInfoHTC structure</li>
            <li>{@code passthrough} <b>must</b> be a pointer to an {@code XrPassthroughHTC} handle</li>
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
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrPassthroughCreateInfoHTC
        """,

        XrSession("session", "an {@code XrSession} in which the passthrough will be active."),
        XrPassthroughCreateInfoHTC.const.p("createInfo", "a pointer to an ##XrPassthroughCreateInfoHTC structure containing information about how to create the passthrough."),
        Check(1)..XrPassthroughHTC.p("passthrough", "a pointer to a handle in which the created {@code XrPassthroughHTC} is returned.")
    )

    XrResult(
        "DestroyPassthroughHTC",
        """
        Destroy a passthrough handle.

        <h5>C Specification</h5>
        The #DestroyPassthroughHTC() function is defined as:

        <pre><code>
￿XrResult xrDestroyPassthroughHTC(
￿    XrPassthroughHTC                            passthrough);</code></pre>

        <h5>Description</h5>
        The #DestroyPassthroughHTC() function releases the passthrough and the underlying resources.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link HTCPassthrough XR_HTC_passthrough} extension <b>must</b> be enabled prior to calling #DestroyPassthroughHTC()</li>
            <li>{@code passthrough} <b>must</b> be a valid {@code XrPassthroughHTC} handle</li>
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
            </ul></dd>
        </dl>
        """,

        XrPassthroughHTC("passthrough", "the {@code XrPassthroughHTC} to be destroyed.")
    )
}