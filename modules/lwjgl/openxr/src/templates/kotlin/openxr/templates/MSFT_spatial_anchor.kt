/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_spatial_anchor = "MSFTSpatialAnchor".nativeClassXR("MSFT_spatial_anchor", type = "instance", postfix = "MSFT") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "MSFT_spatial_anchor_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "MSFT_SPATIAL_ANCHOR_EXTENSION_NAME".."XR_MSFT_spatial_anchor"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SPATIAL_ANCHOR_CREATE_INFO_MSFT".."1000039000",
        "TYPE_SPATIAL_ANCHOR_SPACE_CREATE_INFO_MSFT".."1000039001"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_SPATIAL_ANCHOR_MSFT".."1000039000"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_CREATE_SPATIAL_ANCHOR_FAILED_MSFT".."-1000039001"
    )

    XrResult(
        "CreateSpatialAnchorMSFT",
        """
        Creates a spatial anchor.

        <h5>C Specification</h5>
        The #CreateSpatialAnchorMSFT() function is defined as:

        <pre><code>
￿XrResult xrCreateSpatialAnchorMSFT(
￿    XrSession                                   session,
￿    const XrSpatialAnchorCreateInfoMSFT*        createInfo,
￿    XrSpatialAnchorMSFT*                        anchor);</code></pre>

        <h5>Description</h5>
        Creates an {@code XrSpatialAnchorMSFT} handle representing a spatial anchor that will track a fixed location in the physical world over time. That real-world location is specified by the position and orientation of the specified {@code pose} within {@code space} at {@code time}.

        If {@code space} cannot be located relative to the environment at the moment of the call to #CreateSpatialAnchorMSFT(), the runtime <b>must</b> return #ERROR_CREATE_SPATIAL_ANCHOR_FAILED_MSFT.

        After the anchor is created, the runtime <b>should</b> then adjust its position and orientation over time relative to other spaces so as to maintain maximum alignment to its original real-world location, even if that changes the anchor’s relationship to the original {@code space} used to initialize it.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSpatialAnchor XR_MSFT_spatial_anchor} extension <b>must</b> be enabled prior to calling #CreateSpatialAnchorMSFT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrSpatialAnchorCreateInfoMSFT structure</li>
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
                <li>#ERROR_TIME_INVALID</li>
                <li>#ERROR_POSE_INVALID</li>
                <li>#ERROR_CREATE_SPATIAL_ANCHOR_FAILED_MSFT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpatialAnchorCreateInfoMSFT
        """,

        XrSession("session", "a handle to an {@code XrSession}."),
        XrSpatialAnchorCreateInfoMSFT.const.p("createInfo", "a pointer to an ##XrSpatialAnchorCreateInfoMSFT structure containing information about how to create the anchor."),
        Check(1)..XrSpatialAnchorMSFT.p("anchor", "a pointer to a handle in which the created {@code XrSpatialAnchorMSFT} is returned.")
    )

    XrResult(
        "CreateSpatialAnchorSpaceMSFT",
        """
        Creates a space from a spatial anchor.

        <h5>C Specification</h5>
        The #CreateSpatialAnchorSpaceMSFT() function is defined as:

        <pre><code>
￿XrResult xrCreateSpatialAnchorSpaceMSFT(
￿    XrSession                                   session,
￿    const XrSpatialAnchorSpaceCreateInfoMSFT*   createInfo,
￿    XrSpace*                                    space);</code></pre>

        <h5>Description</h5>
        Creates an {@code XrSpace} handle based on a spatial anchor. Application <b>can</b> provide an ##XrPosef to define the position and orientation of the new space’s origin relative to the anchor’s natural origin.

        Multiple {@code XrSpace} handles may exist for a given {@code XrSpatialAnchorMSFT} simultaneously, up to some limit imposed by the runtime. The {@code XrSpace} handle must be eventually freed via the #DestroySpace() function or by destroying the parent {@code XrSpatialAnchorMSFT} handle.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSpatialAnchor XR_MSFT_spatial_anchor} extension <b>must</b> be enabled prior to calling #CreateSpatialAnchorSpaceMSFT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrSpatialAnchorSpaceCreateInfoMSFT structure</li>
            <li>{@code space} <b>must</b> be a pointer to an {@code XrSpace} handle</li>
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
                <li>#ERROR_POSE_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpatialAnchorSpaceCreateInfoMSFT
        """,

        XrSession("session", "a handle to an {@code XrSession}."),
        XrSpatialAnchorSpaceCreateInfoMSFT.const.p("createInfo", "a pointer to an ##XrSpatialAnchorSpaceCreateInfoMSFT structure containing information about how to create the anchor."),
        Check(1)..XrSpace.p("space", "a pointer to a handle in which the created {@code XrSpace} is returned.")
    )

    XrResult(
        "DestroySpatialAnchorMSFT",
        """
        Destroys a spatial anchor.

        <h5>C Specification</h5>
        The #DestroySpatialAnchorMSFT() function is defined as:

        <pre><code>
￿XrResult xrDestroySpatialAnchorMSFT(
￿    XrSpatialAnchorMSFT                         anchor);</code></pre>

        <h5>Description</h5>
        {@code XrSpatialAnchorMSFT} handles are destroyed using #DestroySpatialAnchorMSFT(). By destroying an anchor, the runtime <b>can</b> stop spending resources used to maintain tracking for that anchor’s origin.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSpatialAnchor XR_MSFT_spatial_anchor} extension <b>must</b> be enabled prior to calling #DestroySpatialAnchorMSFT()</li>
            <li>{@code anchor} <b>must</b> be a valid {@code XrSpatialAnchorMSFT} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code anchor}, and any child handles, <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_HANDLE_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #CreateSpatialAnchorMSFT()
        """,

        XrSpatialAnchorMSFT("anchor", "a handle to an {@code XrSpatialAnchorMSFT} previously created by #CreateSpatialAnchorMSFT().")
    )
}