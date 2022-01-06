/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_spatial_graph_bridge = "MSFTSpatialGraphBridge".nativeClassXR("MSFT_spatial_graph_bridge", type = "instance", postfix = "MSFT") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "MSFT_spatial_graph_bridge_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "MSFT_SPATIAL_GRAPH_BRIDGE_EXTENSION_NAME".."XR_MSFT_spatial_graph_bridge"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT".."1000049000"
    )

    EnumConstant(
        """
        XrSpatialGraphNodeTypeMSFT - The type of spatial graph node.

        <h5>Description</h5>
        There are two types of spatial graph nodes: static and dynamic.

        Static spatial nodes track the pose of a fixed location in the world relative to reference spaces. The tracking of static nodes <b>may</b> slowly adjust the pose over time for better accuracy but the pose is relatively stable in the short term, such as between rendering frames. For example, a QR code tracking library can use a static node to represent the location of the tracked QR code. Static spatial nodes are represented by #SPATIAL_GRAPH_NODE_TYPE_STATIC_MSFT.

        Dynamic spatial nodes track the pose of a physical object that moves continuously relative to reference spaces. The pose of dynamic spatial nodes <b>can</b> be very different within the duration of a rendering frame. It is important for the application to use the correct timestamp to query the space location using #LocateSpace(). For example, a color camera mounted in front of a HMD is also tracked by the HMD so a web camera library can use a dynamic node to represent the camera location. Dynamic spatial nodes are represented by #SPATIAL_GRAPH_NODE_TYPE_DYNAMIC_MSFT.

        <h5>See Also</h5>
        ##XrSpatialGraphNodeSpaceCreateInfoMSFT
        """,

        "SPATIAL_GRAPH_NODE_TYPE_STATIC_MSFT".."1",
        "SPATIAL_GRAPH_NODE_TYPE_DYNAMIC_MSFT".."2"
    )

    XrResult(
        "CreateSpatialGraphNodeSpaceMSFT",
        """
        Create an {@code XrSpace} from a spatial graph node.

        <h5>C Specification</h5>
        The #CreateSpatialGraphNodeSpaceMSFT() function creates an {@code XrSpace} handle for a given spatial graph node type and ID.

        <pre><code>
￿XrResult xrCreateSpatialGraphNodeSpaceMSFT(
￿    XrSession                                   session,
￿    const XrSpatialGraphNodeSpaceCreateInfoMSFT* createInfo,
￿    XrSpace*                                    space);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSpatialGraphBridge XR_MSFT_spatial_graph_bridge} extension <b>must</b> be enabled prior to calling #CreateSpatialGraphNodeSpaceMSFT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrSpatialGraphNodeSpaceCreateInfoMSFT structure</li>
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
        ##XrSpatialGraphNodeSpaceCreateInfoMSFT
        """,

        XrSession("session", "the {@code XrSession} which will use the created space."),
        XrSpatialGraphNodeSpaceCreateInfoMSFT.const.p("createInfo", "an ##XrSpatialGraphNodeSpaceCreateInfoMSFT specifying the space to be created."),
        Check(1)..XrSpace.p("space", "the returned {@code XrSpace} handle for the given spatial node ID.")
    )
}