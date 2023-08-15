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
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_MSFT_spatial_graph_bridge">XR_MSFT_spatial_graph_bridge</a> extension.

        This extension enables applications to interop between {@code XrSpace} handles and other Windows Mixed Reality device platform libraries or APIs. These libraries represent a spatially tracked point, also known as a "spatial graph node", with a GUID value. This extension enables applications to create {@code XrSpace} handles from spatial graph nodes. Applications can also try to get a spatial graph node from an {@code XrSpace} handle.
        """

    IntConstant(
        "The extension specification version.",

        "MSFT_spatial_graph_bridge_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "MSFT_SPATIAL_GRAPH_BRIDGE_EXTENSION_NAME".."XR_MSFT_spatial_graph_bridge"
    )

    EnumConstant(
        "XR_GUID_SIZE_MSFT",

        "GUID_SIZE_MSFT".."16"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_SPATIAL_GRAPH_NODE_BINDING_MSFT".."1000049000"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT".."1000049000",
        "TYPE_SPATIAL_GRAPH_STATIC_NODE_BINDING_CREATE_INFO_MSFT".."1000049001",
        "TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_GET_INFO_MSFT".."1000049002",
        "TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_MSFT".."1000049003"
    )

    EnumConstant(
        """
        XrSpatialGraphNodeTypeMSFT - The type of spatial graph node.

        <h5>Description</h5>
        There are two types of spatial graph nodes: static and dynamic.

        Static spatial nodes track the pose of a fixed location in the world relative to reference spaces. The tracking of static nodes <b>may</b> slowly adjust the pose over time for better accuracy but the pose is relatively stable in the short term, such as between rendering frames. For example, a QR code tracking library can use a static node to represent the location of the tracked QR code. Static spatial nodes are represented by #SPATIAL_GRAPH_NODE_TYPE_STATIC_MSFT.

        Dynamic spatial nodes track the pose of a physical object that moves continuously relative to reference spaces. The pose of dynamic spatial nodes <b>can</b> be very different within the duration of a rendering frame. It is important for the application to use the correct timestamp to query the space location using #LocateSpace(). For example, a color camera mounted in front of a HMD is also tracked by the HMD so a web camera library can use a dynamic node to represent the camera location. Dynamic spatial nodes are represented by #SPATIAL_GRAPH_NODE_TYPE_DYNAMIC_MSFT.

        <h5>See Also</h5>
        ##XrSpatialGraphNodeSpaceCreateInfoMSFT, #CreateSpatialGraphNodeSpaceMSFT()
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

    XrResult(
        "TryCreateSpatialGraphStaticNodeBindingMSFT",
        """
        Try create spatial graph static node binding.

        <h5>C Specification</h5>
        The #TryCreateSpatialGraphStaticNodeBindingMSFT() function tries to create a binding to the best spatial graph static node relative to the given location and returns an {@code XrSpatialGraphNodeBindingMSFT} handle.

        <pre><code>
￿XrResult xrTryCreateSpatialGraphStaticNodeBindingMSFT(
￿    XrSession                                   session,
￿    const XrSpatialGraphStaticNodeBindingCreateInfoMSFT* createInfo,
￿    XrSpatialGraphNodeBindingMSFT*              nodeBinding);</code></pre>

        <h5>Description</h5>
        The runtime <b>may</b> return #SUCCESS and set {@code nodeBinding} to #NULL_HANDLE if it is unable to create a spatial graph static node binding. This may happen when the given {@code XrSpace} cannot be properly tracked at the moment. The application can retry creating the {@code XrSpatialGraphNodeBindingMSFT} handle again after a reasonable period of time when tracking is regained.

        The #TryCreateSpatialGraphStaticNodeBindingMSFT() function <b>may</b> be a slow operation and therefore <b>should</b> be invoked from a non-timing critical thread.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSpatialGraphBridge XR_MSFT_spatial_graph_bridge} extension <b>must</b> be enabled prior to calling #TryCreateSpatialGraphStaticNodeBindingMSFT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrSpatialGraphStaticNodeBindingCreateInfoMSFT structure</li>
            <li>{@code nodeBinding} <b>must</b> be a pointer to an {@code XrSpatialGraphNodeBindingMSFT} handle</li>
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
                <li>#ERROR_TIME_INVALID</li>
                <li>#ERROR_POSE_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpatialGraphStaticNodeBindingCreateInfoMSFT, #DestroySpatialGraphNodeBindingMSFT()
        """,

        XrSession("session", "the specified {@code XrSession}."),
        XrSpatialGraphStaticNodeBindingCreateInfoMSFT.const.p("createInfo", "the ##XrSpatialGraphStaticNodeBindingCreateInfoMSFT input structure."),
        Check(1)..XrSpatialGraphNodeBindingMSFT.p("nodeBinding", "the {@code XrSpatialGraphNodeBindingMSFT} output structure.")
    )

    XrResult(
        "DestroySpatialGraphNodeBindingMSFT",
        """
        Destroy a spatial graph node handle.

        <h5>C Specification</h5>
        The #DestroySpatialGraphNodeBindingMSFT() function releases the {@code nodeBinding} and the underlying resources.

        <pre><code>
￿XrResult xrDestroySpatialGraphNodeBindingMSFT(
￿    XrSpatialGraphNodeBindingMSFT               nodeBinding);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSpatialGraphBridge XR_MSFT_spatial_graph_bridge} extension <b>must</b> be enabled prior to calling #DestroySpatialGraphNodeBindingMSFT()</li>
            <li>{@code nodeBinding} <b>must</b> be a valid {@code XrSpatialGraphNodeBindingMSFT} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code nodeBinding}, and any child handles, <b>must</b> be externally synchronized</li>
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
        #TryCreateSpatialGraphStaticNodeBindingMSFT()
        """,

        XrSpatialGraphNodeBindingMSFT("nodeBinding", "an {@code XrSpatialGraphNodeBindingMSFT} previously created by #TryCreateSpatialGraphStaticNodeBindingMSFT().")
    )

    XrResult(
        "GetSpatialGraphNodeBindingPropertiesMSFT",
        """
        Destroy a spatial graph node handle.

        <h5>C Specification</h5>
        The #GetSpatialGraphNodeBindingPropertiesMSFT() function retrieves the spatial graph node GUID and the pose in the node space from an {@code XrSpatialGraphNodeBindingMSFT} handle.

        <pre><code>
￿XrResult xrGetSpatialGraphNodeBindingPropertiesMSFT(
￿    XrSpatialGraphNodeBindingMSFT               nodeBinding,
￿    const XrSpatialGraphNodeBindingPropertiesGetInfoMSFT* getInfo,
￿    XrSpatialGraphNodeBindingPropertiesMSFT*    properties);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MSFTSpatialGraphBridge XR_MSFT_spatial_graph_bridge} extension <b>must</b> be enabled prior to calling #GetSpatialGraphNodeBindingPropertiesMSFT()</li>
            <li>{@code nodeBinding} <b>must</b> be a valid {@code XrSpatialGraphNodeBindingMSFT} handle</li>
            <li>If {@code getInfo} is not {@code NULL}, {@code getInfo} <b>must</b> be a pointer to a valid ##XrSpatialGraphNodeBindingPropertiesGetInfoMSFT structure</li>
            <li>{@code properties} <b>must</b> be a pointer to an ##XrSpatialGraphNodeBindingPropertiesMSFT structure</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrSpatialGraphNodeBindingPropertiesGetInfoMSFT, ##XrSpatialGraphNodeBindingPropertiesMSFT, #TryCreateSpatialGraphStaticNodeBindingMSFT()
        """,

        XrSpatialGraphNodeBindingMSFT("nodeBinding", "an {@code XrSpatialGraphNodeBindingMSFT} previously created by #TryCreateSpatialGraphStaticNodeBindingMSFT()."),
        nullable..XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.const.p("getInfo", "a pointer to an ##XrSpatialGraphNodeBindingPropertiesGetInfoMSFT input structure."),
        XrSpatialGraphNodeBindingPropertiesMSFT.p("properties", "a pointer to an ##XrSpatialGraphNodeBindingPropertiesMSFT output structure.")
    )
}