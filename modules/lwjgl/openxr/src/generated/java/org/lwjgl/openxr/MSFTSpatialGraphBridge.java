/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_MSFT_spatial_graph_bridge">XR_MSFT_spatial_graph_bridge</a> extension.
 * 
 * <p>This extension enables applications to interop between {@code XrSpace} handles and other Windows Mixed Reality device platform libraries or APIs. These libraries represent a spatially tracked point, also known as a "spatial graph node", with a GUID value. This extension enables applications to create {@code XrSpace} handles from spatial graph nodes. Applications can also try to get a spatial graph node from an {@code XrSpace} handle.</p>
 */
public class MSFTSpatialGraphBridge {

    /** The extension specification version. */
    public static final int XR_MSFT_spatial_graph_bridge_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_MSFT_SPATIAL_GRAPH_BRIDGE_EXTENSION_NAME = "XR_MSFT_spatial_graph_bridge";

    /** XR_GUID_SIZE_MSFT */
    public static final int XR_GUID_SIZE_MSFT = 16;

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_SPATIAL_GRAPH_NODE_BINDING_MSFT = 1000049000;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT}</li>
     * <li>{@link #XR_TYPE_SPATIAL_GRAPH_STATIC_NODE_BINDING_CREATE_INFO_MSFT TYPE_SPATIAL_GRAPH_STATIC_NODE_BINDING_CREATE_INFO_MSFT}</li>
     * <li>{@link #XR_TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_GET_INFO_MSFT TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_GET_INFO_MSFT}</li>
     * <li>{@link #XR_TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_MSFT TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_MSFT}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT           = 1000049000,
        XR_TYPE_SPATIAL_GRAPH_STATIC_NODE_BINDING_CREATE_INFO_MSFT  = 1000049001,
        XR_TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_GET_INFO_MSFT = 1000049002,
        XR_TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_MSFT          = 1000049003;

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
     * <p>{@link XrSpatialGraphNodeSpaceCreateInfoMSFT}, {@link #xrCreateSpatialGraphNodeSpaceMSFT CreateSpatialGraphNodeSpaceMSFT}</p>
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

    // --- [ xrTryCreateSpatialGraphStaticNodeBindingMSFT ] ---

    /** Unsafe version of: {@link #xrTryCreateSpatialGraphStaticNodeBindingMSFT TryCreateSpatialGraphStaticNodeBindingMSFT} */
    public static int nxrTryCreateSpatialGraphStaticNodeBindingMSFT(XrSession session, long createInfo, long nodeBinding) {
        long __functionAddress = session.getCapabilities().xrTryCreateSpatialGraphStaticNodeBindingMSFT;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialGraphStaticNodeBindingCreateInfoMSFT.validate(createInfo);
        }
        return callPPPI(session.address(), createInfo, nodeBinding, __functionAddress);
    }

    /**
     * Try create spatial graph static node binding.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrTryCreateSpatialGraphStaticNodeBindingMSFT TryCreateSpatialGraphStaticNodeBindingMSFT} function tries to create a binding to the best spatial graph static node relative to the given location and returns an {@code XrSpatialGraphNodeBindingMSFT} handle.</p>
     * 
     * <pre><code>
     * XrResult xrTryCreateSpatialGraphStaticNodeBindingMSFT(
     *     XrSession                                   session,
     *     const XrSpatialGraphStaticNodeBindingCreateInfoMSFT* createInfo,
     *     XrSpatialGraphNodeBindingMSFT*              nodeBinding);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The runtime <b>may</b> return {@link XR10#XR_SUCCESS SUCCESS} and set {@code nodeBinding} to {@link XR10#XR_NULL_HANDLE NULL_HANDLE} if it is unable to create a spatial graph static node binding. This may happen when the given {@code XrSpace} cannot be properly tracked at the moment. The application can retry creating the {@code XrSpatialGraphNodeBindingMSFT} handle again after a reasonable period of time when tracking is regained.</p>
     * 
     * <p>The {@link #xrTryCreateSpatialGraphStaticNodeBindingMSFT TryCreateSpatialGraphStaticNodeBindingMSFT} function <b>may</b> be a slow operation and therefore <b>should</b> be invoked from a non-timing critical thread.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSpatialGraphBridge XR_MSFT_spatial_graph_bridge} extension <b>must</b> be enabled prior to calling {@link #xrTryCreateSpatialGraphStaticNodeBindingMSFT TryCreateSpatialGraphStaticNodeBindingMSFT}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrSpatialGraphStaticNodeBindingCreateInfoMSFT} structure</li>
     * <li>{@code nodeBinding} <b>must</b> be a pointer to an {@code XrSpatialGraphNodeBindingMSFT} handle</li>
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
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
     * <li>{@link XR10#XR_ERROR_TIME_INVALID ERROR_TIME_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_POSE_INVALID ERROR_POSE_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpatialGraphStaticNodeBindingCreateInfoMSFT}, {@link #xrDestroySpatialGraphNodeBindingMSFT DestroySpatialGraphNodeBindingMSFT}</p>
     *
     * @param session     the specified {@code XrSession}.
     * @param createInfo  the {@link XrSpatialGraphStaticNodeBindingCreateInfoMSFT} input structure.
     * @param nodeBinding the {@code XrSpatialGraphNodeBindingMSFT} output structure.
     */
    @NativeType("XrResult")
    public static int xrTryCreateSpatialGraphStaticNodeBindingMSFT(XrSession session, @NativeType("XrSpatialGraphStaticNodeBindingCreateInfoMSFT const *") XrSpatialGraphStaticNodeBindingCreateInfoMSFT createInfo, @NativeType("XrSpatialGraphNodeBindingMSFT *") PointerBuffer nodeBinding) {
        if (CHECKS) {
            check(nodeBinding, 1);
        }
        return nxrTryCreateSpatialGraphStaticNodeBindingMSFT(session, createInfo.address(), memAddress(nodeBinding));
    }

    // --- [ xrDestroySpatialGraphNodeBindingMSFT ] ---

    /**
     * Destroy a spatial graph node handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroySpatialGraphNodeBindingMSFT DestroySpatialGraphNodeBindingMSFT} function releases the {@code nodeBinding} and the underlying resources.</p>
     * 
     * <pre><code>
     * XrResult xrDestroySpatialGraphNodeBindingMSFT(
     *     XrSpatialGraphNodeBindingMSFT               nodeBinding);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSpatialGraphBridge XR_MSFT_spatial_graph_bridge} extension <b>must</b> be enabled prior to calling {@link #xrDestroySpatialGraphNodeBindingMSFT DestroySpatialGraphNodeBindingMSFT}</li>
     * <li>{@code nodeBinding} <b>must</b> be a valid {@code XrSpatialGraphNodeBindingMSFT} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code nodeBinding}, and any child handles, <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrTryCreateSpatialGraphStaticNodeBindingMSFT TryCreateSpatialGraphStaticNodeBindingMSFT}</p>
     *
     * @param nodeBinding an {@code XrSpatialGraphNodeBindingMSFT} previously created by {@link #xrTryCreateSpatialGraphStaticNodeBindingMSFT TryCreateSpatialGraphStaticNodeBindingMSFT}.
     */
    @NativeType("XrResult")
    public static int xrDestroySpatialGraphNodeBindingMSFT(XrSpatialGraphNodeBindingMSFT nodeBinding) {
        long __functionAddress = nodeBinding.getCapabilities().xrDestroySpatialGraphNodeBindingMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(nodeBinding.address(), __functionAddress);
    }

    // --- [ xrGetSpatialGraphNodeBindingPropertiesMSFT ] ---

    /** Unsafe version of: {@link #xrGetSpatialGraphNodeBindingPropertiesMSFT GetSpatialGraphNodeBindingPropertiesMSFT} */
    public static int nxrGetSpatialGraphNodeBindingPropertiesMSFT(XrSpatialGraphNodeBindingMSFT nodeBinding, long getInfo, long properties) {
        long __functionAddress = nodeBinding.getCapabilities().xrGetSpatialGraphNodeBindingPropertiesMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(nodeBinding.address(), getInfo, properties, __functionAddress);
    }

    /**
     * Destroy a spatial graph node handle.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetSpatialGraphNodeBindingPropertiesMSFT GetSpatialGraphNodeBindingPropertiesMSFT} function retrieves the spatial graph node GUID and the pose in the node space from an {@code XrSpatialGraphNodeBindingMSFT} handle.</p>
     * 
     * <pre><code>
     * XrResult xrGetSpatialGraphNodeBindingPropertiesMSFT(
     *     XrSpatialGraphNodeBindingMSFT               nodeBinding,
     *     const XrSpatialGraphNodeBindingPropertiesGetInfoMSFT* getInfo,
     *     XrSpatialGraphNodeBindingPropertiesMSFT*    properties);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MSFTSpatialGraphBridge XR_MSFT_spatial_graph_bridge} extension <b>must</b> be enabled prior to calling {@link #xrGetSpatialGraphNodeBindingPropertiesMSFT GetSpatialGraphNodeBindingPropertiesMSFT}</li>
     * <li>{@code nodeBinding} <b>must</b> be a valid {@code XrSpatialGraphNodeBindingMSFT} handle</li>
     * <li>If {@code getInfo} is not {@code NULL}, {@code getInfo} <b>must</b> be a pointer to a valid {@link XrSpatialGraphNodeBindingPropertiesGetInfoMSFT} structure</li>
     * <li>{@code properties} <b>must</b> be a pointer to an {@link XrSpatialGraphNodeBindingPropertiesMSFT} structure</li>
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
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrSpatialGraphNodeBindingPropertiesGetInfoMSFT}, {@link XrSpatialGraphNodeBindingPropertiesMSFT}, {@link #xrTryCreateSpatialGraphStaticNodeBindingMSFT TryCreateSpatialGraphStaticNodeBindingMSFT}</p>
     *
     * @param nodeBinding an {@code XrSpatialGraphNodeBindingMSFT} previously created by {@link #xrTryCreateSpatialGraphStaticNodeBindingMSFT TryCreateSpatialGraphStaticNodeBindingMSFT}.
     * @param getInfo     a pointer to an {@link XrSpatialGraphNodeBindingPropertiesGetInfoMSFT} input structure.
     * @param properties  a pointer to an {@link XrSpatialGraphNodeBindingPropertiesMSFT} output structure.
     */
    @NativeType("XrResult")
    public static int xrGetSpatialGraphNodeBindingPropertiesMSFT(XrSpatialGraphNodeBindingMSFT nodeBinding, @Nullable @NativeType("XrSpatialGraphNodeBindingPropertiesGetInfoMSFT const *") XrSpatialGraphNodeBindingPropertiesGetInfoMSFT getInfo, @NativeType("XrSpatialGraphNodeBindingPropertiesMSFT *") XrSpatialGraphNodeBindingPropertiesMSFT properties) {
        return nxrGetSpatialGraphNodeBindingPropertiesMSFT(nodeBinding, memAddressSafe(getInfo), properties.address());
    }

}