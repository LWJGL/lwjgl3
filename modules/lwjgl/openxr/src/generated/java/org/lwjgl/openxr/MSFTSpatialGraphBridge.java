/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The MSFT_spatial_graph_bridge extension. */
public class MSFTSpatialGraphBridge {

    /** The extension specification version. */
    public static final int XR_MSFT_spatial_graph_bridge_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_MSFT_SPATIAL_GRAPH_BRIDGE_EXTENSION_NAME = "XR_MSFT_spatial_graph_bridge";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT = 1000049000;

    /**
     * XrSpatialGraphNodeTypeMSFT - The type of spatial graph node.
     * 
     * <h5>Description</h5>
     * 
     * <p>There are two types of spatial graph nodes: static and dynamic.</p>
     * 
     * <p>Static spatial nodes track the pose of a fixed location in the world relative to reference spaces. The tracking of static nodes <b>may</b> slowly adjust the pose over time for better accuracy but the pose is relatively stable in the short term, such as between rendering frames. For example, a QR code tracking library can use a static node to represent the location of the tracked QR code. Static spatial nodes are represented by {@link #XR_SPATIAL_GRAPH_NODE_TYPE_STATIC_MSFT SPATIAL_GRAPH_NODE_TYPE_STATIC_MSFT}.</p>
     * 
     * <p>Dynamic spatial nodes track the pose of a physical object that moves continuously relative to reference spaces. The pose of dynamic spatial nodes <b>can</b> be very different within the duration of a rendering frame. It is important for the application to use the correct timestamp to query the space location using {@link XR10#xrLocateSpace LocateSpace}. For example, a color camera mounted in front of a HMD is also tracked by the HMD so a web camera library can use a dynamic node to represent the camera location. Dynamic spatial nodes are represented by {@link #XR_SPATIAL_GRAPH_NODE_TYPE_DYNAMIC_MSFT SPATIAL_GRAPH_NODE_TYPE_DYNAMIC_MSFT}.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpatialGraphNodeSpaceCreateInfoMSFT}</p>
     */
    public static final int
        XR_SPATIAL_GRAPH_NODE_TYPE_STATIC_MSFT  = 1,
        XR_SPATIAL_GRAPH_NODE_TYPE_DYNAMIC_MSFT = 2;

    protected MSFTSpatialGraphBridge() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpatialGraphNodeSpaceMSFT ] ---

    /** Unsafe version of: {@link #xrCreateSpatialGraphNodeSpaceMSFT CreateSpatialGraphNodeSpaceMSFT} */
    public static int nxrCreateSpatialGraphNodeSpaceMSFT(XrSession session, long createInfo, long space) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialGraphNodeSpaceMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, space, __functionAddress);
    }

    /**
     * Create an {@code XrSpace} from a spatial graph node.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateSpatialGraphNodeSpaceMSFT CreateSpatialGraphNodeSpaceMSFT} function creates an {@code XrSpace} handle for a given spatial graph node type and ID.</p>
     * 
     * <pre><code>
     * XrResult xrCreateSpatialGraphNodeSpaceMSFT(
     *     XrSession                                   session,
     *     const XrSpatialGraphNodeSpaceCreateInfoMSFT* createInfo,
     *     XrSpace*                                    space);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSpatialGraphBridge XR_MSFT_spatial_graph_bridge} extension <b>must</b> be enabled prior to calling {@link #xrCreateSpatialGraphNodeSpaceMSFT CreateSpatialGraphNodeSpaceMSFT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrSpatialGraphNodeSpaceCreateInfoMSFT} structure</li>
     * <li>{@code space} <b>must</b> be a pointer to an {@code XrSpace} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link XR10#XR_ERROR_POSE_INVALID ERROR_POSE_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpatialGraphNodeSpaceCreateInfoMSFT}</p>
     *
     * @param session    the {@code XrSession} which will use the created space.
     * @param createInfo an {@link XrSpatialGraphNodeSpaceCreateInfoMSFT} specifying the space to be created.
     * @param space      the returned {@code XrSpace} handle for the given spatial node ID.
     */
    @NativeType("XrResult")
    public static int xrCreateSpatialGraphNodeSpaceMSFT(XrSession session, @NativeType("XrSpatialGraphNodeSpaceCreateInfoMSFT const *") XrSpatialGraphNodeSpaceCreateInfoMSFT createInfo, @NativeType("XrSpace *") PointerBuffer space) {
        if (CHECKS) {
            check(space, 1);
        }
        return nxrCreateSpatialGraphNodeSpaceMSFT(session, createInfo.address(), memAddress(space));
    }

}