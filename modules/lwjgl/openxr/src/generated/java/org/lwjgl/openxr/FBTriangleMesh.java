/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_triangle_mesh">XR_FB_triangle_mesh</a> extension.
 * 
 * <p>Meshes may be useful in XR applications when representing parts of the environment. In particular, application may provide the surfaces of real-world objects tagged manually to the runtime, or obtain automatically detected environment contents.</p>
 * 
 * <p>This extension allows:</p>
 * 
 * <ul>
 * <li>An application to create a triangle mesh and specify the mesh data.</li>
 * <li>An application to update mesh contents if a mesh is mutable.</li>
 * </ul>
 * 
 * <p>In order to enable the functionality of this extension, the application <b>must</b> pass the name of the extension into {@link XR10#xrCreateInstance CreateInstance} via the {@link XrInstanceCreateInfo}{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#extensions">extensions</a> section.</p>
 */
public class FBTriangleMesh {

    /** The extension specification version. */
    public static final int XR_FB_triangle_mesh_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_FB_TRIANGLE_MESH_EXTENSION_NAME = "XR_FB_triangle_mesh";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_TRIANGLE_MESH_CREATE_INFO_FB = 1000117001;

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_TRIANGLE_MESH_FB = 1000117000;

    /**
     * XrTriangleMeshFlagBitsFB - XrTriangleMeshFlagBitsFB
     * 
     * <h5>Flag Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_TRIANGLE_MESH_MUTABLE_BIT_FB TRIANGLE_MESH_MUTABLE_BIT_FB} — The triangle mesh is mutable (can be modified after it is created).</li>
     * </ul>
     */
    public static final int XR_TRIANGLE_MESH_MUTABLE_BIT_FB = 0x1;

    /**
     * XrWindingOrderFB - Triangle winding order
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_WINDING_ORDER_UNKNOWN_FB WINDING_ORDER_UNKNOWN_FB} — Winding order is unknown and the runtime cannot make any assumptions on the triangle orientation</li>
     * <li>{@link #XR_WINDING_ORDER_CW_FB WINDING_ORDER_CW_FB} — Clockwise winding order</li>
     * <li>{@link #XR_WINDING_ORDER_CCW_FB WINDING_ORDER_CCW_FB} — Counter-clockwise winding order</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrTriangleMeshCreateInfoFB}</p>
     */
    public static final int
        XR_WINDING_ORDER_UNKNOWN_FB = 0,
        XR_WINDING_ORDER_CW_FB      = 1,
        XR_WINDING_ORDER_CCW_FB     = 2;

    protected FBTriangleMesh() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateTriangleMeshFB ] ---

    /** Unsafe version of: {@link #xrCreateTriangleMeshFB CreateTriangleMeshFB} */
    public static int nxrCreateTriangleMeshFB(XrSession session, long createInfo, long outTriangleMesh) {
        long __functionAddress = session.getCapabilities().xrCreateTriangleMeshFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, outTriangleMesh, __functionAddress);
    }

    /**
     * Create a triangle mesh.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrCreateTriangleMeshFB CreateTriangleMeshFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrCreateTriangleMeshFB(
     *     XrSession                                   session,
     *     const XrTriangleMeshCreateInfoFB*           createInfo,
     *     XrTriangleMeshFB*                           outTriangleMesh);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This creates an {@code XrTriangleMeshFB} handle. The returned triangle mesh handle <b>may</b> be subsequently used in API calls.</p>
     * 
     * <p>When the mesh is mutable (the {@link #XR_TRIANGLE_MESH_MUTABLE_BIT_FB TRIANGLE_MESH_MUTABLE_BIT_FB} bit is set in {@code createInfo→pname}:flags), the created triangle mesh starts in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#fb_triangle_mesh_state_undefined_topology">fb_triangle_mesh_state_undefined_topology</a> state.</p>
     * 
     * <p>Immutable meshes have no state machine; they may be considered to be in state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#fb_triangle_mesh_state_ready">fb_triangle_mesh_state_ready</a> with no valid edges leaving that state.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBTriangleMesh XR_FB_triangle_mesh} extension <b>must</b> be enabled prior to calling {@link #xrCreateTriangleMeshFB CreateTriangleMeshFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code createInfo} <b>must</b> be a pointer to a valid {@link XrTriangleMeshCreateInfoFB} structure</li>
     * <li>{@code outTriangleMesh} <b>must</b> be a pointer to an {@code XrTriangleMeshFB} handle</li>
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
     * <li>{@link FBPassthrough#XR_ERROR_INSUFFICIENT_RESOURCES_PASSTHROUGH_FB ERROR_INSUFFICIENT_RESOURCES_PASSTHROUGH_FB}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrTriangleMeshCreateInfoFB}</p>
     *
     * @param session         the {@code XrSession} to which the mesh will belong.
     * @param createInfo      a pointer to an {@link XrTriangleMeshCreateInfoFB} structure containing parameters to be used to create the mesh.
     * @param outTriangleMesh a pointer to a handle in which the created {@code XrTriangleMeshFB} is returned.
     */
    @NativeType("XrResult")
    public static int xrCreateTriangleMeshFB(XrSession session, @NativeType("XrTriangleMeshCreateInfoFB const *") XrTriangleMeshCreateInfoFB createInfo, @NativeType("XrTriangleMeshFB *") PointerBuffer outTriangleMesh) {
        if (CHECKS) {
            check(outTriangleMesh, 1);
        }
        return nxrCreateTriangleMeshFB(session, createInfo.address(), memAddress(outTriangleMesh));
    }

    // --- [ xrDestroyTriangleMeshFB ] ---

    /**
     * Destroy a triangle mesh.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrDestroyTriangleMeshFB DestroyTriangleMeshFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrDestroyTriangleMeshFB(
     *     XrTriangleMeshFB                            mesh);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code XrTriangleMeshFB} handles and their associated data are destroyed by {@link #xrDestroyTriangleMeshFB DestroyTriangleMeshFB}. The mesh buffers retrieved by {@link #xrTriangleMeshGetVertexBufferFB TriangleMeshGetVertexBufferFB} and {@link #xrTriangleMeshGetIndexBufferFB TriangleMeshGetIndexBufferFB} <b>must</b> not be accessed anymore after their parent mesh object has been destroyed.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBTriangleMesh XR_FB_triangle_mesh} extension <b>must</b> be enabled prior to calling {@link #xrDestroyTriangleMeshFB DestroyTriangleMeshFB}</li>
     * <li>{@code mesh} <b>must</b> be a valid {@code XrTriangleMeshFB} handle</li>
     * </ul>
     * 
     * <h5>Thread Safety</h5>
     * 
     * <ul>
     * <li>Access to {@code mesh}, and any child handles, <b>must</b> be externally synchronized</li>
     * <li>Access to the buffers returned from calls to {@link #xrTriangleMeshGetVertexBufferFB TriangleMeshGetVertexBufferFB} and {@link #xrTriangleMeshGetIndexBufferFB TriangleMeshGetIndexBufferFB} on {@code mesh} <b>must</b> be externally synchronized</li>
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
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     *
     * @param mesh the {@code XrTriangleMeshFB} to destroy.
     */
    @NativeType("XrResult")
    public static int xrDestroyTriangleMeshFB(XrTriangleMeshFB mesh) {
        long __functionAddress = mesh.getCapabilities().xrDestroyTriangleMeshFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(mesh.address(), __functionAddress);
    }

    // --- [ xrTriangleMeshGetVertexBufferFB ] ---

    /** Unsafe version of: {@link #xrTriangleMeshGetVertexBufferFB TriangleMeshGetVertexBufferFB} */
    public static int nxrTriangleMeshGetVertexBufferFB(XrTriangleMeshFB mesh, long outVertexBuffer) {
        long __functionAddress = mesh.getCapabilities().xrTriangleMeshGetVertexBufferFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(mesh.address(), outVertexBuffer, __functionAddress);
    }

    /**
     * Obtain the vertex buffer of a triangle mesh.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrTriangleMeshGetVertexBufferFB TriangleMeshGetVertexBufferFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrTriangleMeshGetVertexBufferFB(
     *     XrTriangleMeshFB                            mesh,
     *     XrVector3f**                                outVertexBuffer);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Retrieves a pointer to the vertex buffer. The vertex buffer is structured as an array of {@link XrVector3f}. The size of the buffer is {@link XrTriangleMeshCreateInfoFB}{@code ::vertexCount} elements. The buffer location is guaranteed to remain constant over the lifecycle of the mesh object.</p>
     * 
     * <p>A mesh <b>must</b> be mutable and in a specific state for the application to <b>modify</b> it through the retrieved vertex buffer.</p>
     * 
     * <ul>
     * <li>A mutable triangle mesh <b>must</b> be in state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#fb_triangle_mesh_state_defining_topology">fb_triangle_mesh_state_defining_topology</a>, <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#fb_triangle_mesh_state_updating_mesh">fb_triangle_mesh_state_updating_mesh</a>, or <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#fb_triangle_mesh_state_updating_vertices">fb_triangle_mesh_state_updating_vertices</a> to modify the <b>contents</b> of the vertex buffer retrieved by this function.</li>
     * <li>A mutable triangle mesh <b>must</b> be in state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#fb_triangle_mesh_state_defining_topology">fb_triangle_mesh_state_defining_topology</a> or <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#fb_triangle_mesh_state_updating_mesh">fb_triangle_mesh_state_updating_mesh</a> to modify the <b>count</b> of elements in the vertex buffer retrieved by this function. The new count is passed as a parameter to {@link #xrTriangleMeshEndUpdateFB TriangleMeshEndUpdateFB}.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBTriangleMesh XR_FB_triangle_mesh} extension <b>must</b> be enabled prior to calling {@link #xrTriangleMeshGetVertexBufferFB TriangleMeshGetVertexBufferFB}</li>
     * <li>{@code mesh} <b>must</b> be a valid {@code XrTriangleMeshFB} handle</li>
     * <li>{@code outVertexBuffer} <b>must</b> be a pointer to a pointer to an {@link XrVector3f} structure</li>
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
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrVector3f}, {@link #xrTriangleMeshGetIndexBufferFB TriangleMeshGetIndexBufferFB}</p>
     *
     * @param mesh            the {@code XrTriangleMeshFB} to get the vertex buffer for.
     * @param outVertexBuffer a pointer to return the vertex buffer into.
     */
    @NativeType("XrResult")
    public static int xrTriangleMeshGetVertexBufferFB(XrTriangleMeshFB mesh, @NativeType("XrVector3f **") PointerBuffer outVertexBuffer) {
        if (CHECKS) {
            check(outVertexBuffer, 1);
        }
        return nxrTriangleMeshGetVertexBufferFB(mesh, memAddress(outVertexBuffer));
    }

    // --- [ xrTriangleMeshGetIndexBufferFB ] ---

    /** Unsafe version of: {@link #xrTriangleMeshGetIndexBufferFB TriangleMeshGetIndexBufferFB} */
    public static int nxrTriangleMeshGetIndexBufferFB(XrTriangleMeshFB mesh, long outIndexBuffer) {
        long __functionAddress = mesh.getCapabilities().xrTriangleMeshGetIndexBufferFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(mesh.address(), outIndexBuffer, __functionAddress);
    }

    /**
     * Obtain the index buffer of a triangle mesh.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrTriangleMeshGetIndexBufferFB TriangleMeshGetIndexBufferFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrTriangleMeshGetIndexBufferFB(
     *     XrTriangleMeshFB                            mesh,
     *     uint32_t**                                  outIndexBuffer);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Retrieves a pointer to the index buffer that defines the topology of the triangle mesh. Each triplet of consecutive elements points to three vertices in the vertex buffer and thus form a triangle. The size of the buffer is {@link XrTriangleMeshCreateInfoFB}{@code ::indexCount} elements. The buffer location is guaranteed to remain constant over the lifecycle of the mesh object.</p>
     * 
     * <p>A triangle mesh <b>must</b> be mutable and in state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#fb_triangle_mesh_state_defining_topology">fb_triangle_mesh_state_defining_topology</a> or <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#fb_triangle_mesh_state_updating_mesh">fb_triangle_mesh_state_updating_mesh</a> for the application to <b>modify</b> the contents and/or triangle count in the index buffer retrieved by this function.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBTriangleMesh XR_FB_triangle_mesh} extension <b>must</b> be enabled prior to calling {@link #xrTriangleMeshGetIndexBufferFB TriangleMeshGetIndexBufferFB}</li>
     * <li>{@code mesh} <b>must</b> be a valid {@code XrTriangleMeshFB} handle</li>
     * <li>{@code outIndexBuffer} <b>must</b> be a pointer to a pointer to a {@code uint32_t} value</li>
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
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrTriangleMeshGetVertexBufferFB TriangleMeshGetVertexBufferFB}</p>
     *
     * @param mesh           the {@code XrTriangleMeshFB} to get the index buffer for.
     * @param outIndexBuffer a pointer to return the index buffer into.
     */
    @NativeType("XrResult")
    public static int xrTriangleMeshGetIndexBufferFB(XrTriangleMeshFB mesh, @NativeType("uint32_t **") PointerBuffer outIndexBuffer) {
        if (CHECKS) {
            check(outIndexBuffer, 1);
        }
        return nxrTriangleMeshGetIndexBufferFB(mesh, memAddress(outIndexBuffer));
    }

    // --- [ xrTriangleMeshBeginUpdateFB ] ---

    /**
     * Begin an update of the mesh data.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrTriangleMeshBeginUpdateFB TriangleMeshBeginUpdateFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrTriangleMeshBeginUpdateFB(
     *     XrTriangleMeshFB                            mesh);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Begins updating the mesh buffer data. The application <b>must</b> call this function before it makes any modifications to the buffers retrieved by {@link #xrTriangleMeshGetVertexBufferFB TriangleMeshGetVertexBufferFB} and {@link #xrTriangleMeshGetIndexBufferFB TriangleMeshGetIndexBufferFB}. If only the vertex buffer contents need to be updated, and the mesh is in state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#fb_triangle_mesh_state_ready">fb_triangle_mesh_state_ready</a>, {@link #xrTriangleMeshBeginVertexBufferUpdateFB TriangleMeshBeginVertexBufferUpdateFB} <b>may</b> be used instead. To commit the modifications, the application <b>must</b> call {@link #xrTriangleMeshEndUpdateFB TriangleMeshEndUpdateFB}.</p>
     * 
     * <p>The triangle mesh {@code mesh} <b>must</b> be mutable. The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if the mesh is immutable.</p>
     * 
     * <p>The triangle mesh {@code mesh} <b>must</b> be in state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#fb_triangle_mesh_state_undefined_topology">fb_triangle_mesh_state_undefined_topology</a> or <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#fb_triangle_mesh_state_ready">fb_triangle_mesh_state_ready</a>.</p>
     * 
     * <ul>
     * <li>If the triangle mesh is in state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#fb_triangle_mesh_state_undefined_topology">fb_triangle_mesh_state_undefined_topology</a> before this call, a successful call moves it to state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#fb_triangle_mesh_state_defining_topology">fb_triangle_mesh_state_defining_topology</a>.</li>
     * <li>If the triangle mesh is in state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#fb_triangle_mesh_state_ready">fb_triangle_mesh_state_ready</a> before this call, a successful call moves it to state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#fb_triangle_mesh_state_updating_mesh">fb_triangle_mesh_state_updating_mesh</a>.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBTriangleMesh XR_FB_triangle_mesh} extension <b>must</b> be enabled prior to calling {@link #xrTriangleMeshBeginUpdateFB TriangleMeshBeginUpdateFB}</li>
     * <li>{@code mesh} <b>must</b> be a valid {@code XrTriangleMeshFB} handle</li>
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
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrTriangleMeshEndUpdateFB TriangleMeshEndUpdateFB}</p>
     *
     * @param mesh the {@code XrTriangleMeshFB} to update.
     */
    @NativeType("XrResult")
    public static int xrTriangleMeshBeginUpdateFB(XrTriangleMeshFB mesh) {
        long __functionAddress = mesh.getCapabilities().xrTriangleMeshBeginUpdateFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(mesh.address(), __functionAddress);
    }

    // --- [ xrTriangleMeshEndUpdateFB ] ---

    /**
     * End an update of the mesh data.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrTriangleMeshEndUpdateFB TriangleMeshEndUpdateFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrTriangleMeshEndUpdateFB(
     *     XrTriangleMeshFB                            mesh,
     *     uint32_t                                    vertexCount,
     *     uint32_t                                    triangleCount);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Signals to the runtime that the application has finished initially populating or updating the mesh buffers. {@code vertexCount} and {@code triangleCount} specify the actual number of primitives that make up the mesh after the update. They <b>must</b> be larger than zero but smaller or equal to the maximum counts defined at create time. The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if an invalid count is passed.</p>
     * 
     * <p>The triangle mesh {@code mesh} <b>must</b> be mutable. The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if the mesh is immutable.</p>
     * 
     * <p>The triangle mesh {@code mesh} <b>must</b> be in state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#fb_triangle_mesh_state_defining_topology">fb_triangle_mesh_state_defining_topology</a> or <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#fb_triangle_mesh_state_updating_mesh">fb_triangle_mesh_state_updating_mesh</a>.</p>
     * 
     * <p>A successful call moves {@code mesh} to state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#fb_triangle_mesh_state_ready">fb_triangle_mesh_state_ready</a>.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBTriangleMesh XR_FB_triangle_mesh} extension <b>must</b> be enabled prior to calling {@link #xrTriangleMeshEndUpdateFB TriangleMeshEndUpdateFB}</li>
     * <li>{@code mesh} <b>must</b> be a valid {@code XrTriangleMeshFB} handle</li>
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
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrTriangleMeshBeginUpdateFB TriangleMeshBeginUpdateFB}</p>
     *
     * @param mesh          the {@code XrTriangleMeshFB} to update.
     * @param vertexCount   the vertex count after the update.
     * @param triangleCount the triangle count after the update.
     */
    @NativeType("XrResult")
    public static int xrTriangleMeshEndUpdateFB(XrTriangleMeshFB mesh, @NativeType("uint32_t") int vertexCount, @NativeType("uint32_t") int triangleCount) {
        long __functionAddress = mesh.getCapabilities().xrTriangleMeshEndUpdateFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(mesh.address(), vertexCount, triangleCount, __functionAddress);
    }

    // --- [ xrTriangleMeshBeginVertexBufferUpdateFB ] ---

    /** Unsafe version of: {@link #xrTriangleMeshBeginVertexBufferUpdateFB TriangleMeshBeginVertexBufferUpdateFB} */
    public static int nxrTriangleMeshBeginVertexBufferUpdateFB(XrTriangleMeshFB mesh, long outVertexCount) {
        long __functionAddress = mesh.getCapabilities().xrTriangleMeshBeginVertexBufferUpdateFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(mesh.address(), outVertexCount, __functionAddress);
    }

    /**
     * Begin an update of the vertex data.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrTriangleMeshBeginVertexBufferUpdateFB TriangleMeshBeginVertexBufferUpdateFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrTriangleMeshBeginVertexBufferUpdateFB(
     *     XrTriangleMeshFB                            mesh,
     *     uint32_t*                                   outVertexCount);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Begins an update of the vertex positions of a mutable triangle mesh. The vertex count returned through {@code outVertexCount} is defined by the last call to {@link #xrTriangleMeshEndUpdateFB TriangleMeshEndUpdateFB}. Once the modification is done, call {@link #xrTriangleMeshEndVertexBufferUpdateFB TriangleMeshEndVertexBufferUpdateFB} to commit the changes and move to state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#fb_triangle_mesh_state_ready">fb_triangle_mesh_state_ready</a>.</p>
     * 
     * <p>The triangle mesh {@code mesh} <b>must</b> be mutable. The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if the mesh is immutable.</p>
     * 
     * <p>The triangle mesh {@code mesh} <b>must</b> be in state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#fb_triangle_mesh_state_ready">fb_triangle_mesh_state_ready</a>.</p>
     * 
     * <p>A successful call moves {@code mesh} to state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#fb_triangle_mesh_state_updating_vertices">fb_triangle_mesh_state_updating_vertices</a>.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBTriangleMesh XR_FB_triangle_mesh} extension <b>must</b> be enabled prior to calling {@link #xrTriangleMeshBeginVertexBufferUpdateFB TriangleMeshBeginVertexBufferUpdateFB}</li>
     * <li>{@code mesh} <b>must</b> be a valid {@code XrTriangleMeshFB} handle</li>
     * <li>{@code outVertexCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
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
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrTriangleMeshBeginUpdateFB TriangleMeshBeginUpdateFB}, {@link #xrTriangleMeshEndVertexBufferUpdateFB TriangleMeshEndVertexBufferUpdateFB}</p>
     *
     * @param mesh           the {@code XrTriangleMeshFB} to update.
     * @param outVertexCount a pointer to a value to populate with the current vertex count. The updated data must have the exact same number of vertices.
     */
    @NativeType("XrResult")
    public static int xrTriangleMeshBeginVertexBufferUpdateFB(XrTriangleMeshFB mesh, @NativeType("uint32_t *") IntBuffer outVertexCount) {
        if (CHECKS) {
            check(outVertexCount, 1);
        }
        return nxrTriangleMeshBeginVertexBufferUpdateFB(mesh, memAddress(outVertexCount));
    }

    // --- [ xrTriangleMeshEndVertexBufferUpdateFB ] ---

    /**
     * End an update of the vertex data.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrTriangleMeshEndVertexBufferUpdateFB TriangleMeshEndVertexBufferUpdateFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrTriangleMeshEndVertexBufferUpdateFB(
     *     XrTriangleMeshFB                            mesh);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Signals to the runtime that the application has finished updating the vertex buffer data following a call to {@link #xrTriangleMeshBeginVertexBufferUpdateFB TriangleMeshBeginVertexBufferUpdateFB}.</p>
     * 
     * <p>The triangle mesh {@code mesh} <b>must</b> be mutable. The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if the mesh is immutable.</p>
     * 
     * <p>The triangle mesh {@code mesh} <b>must</b> be in state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#fb_triangle_mesh_state_updating_vertices">fb_triangle_mesh_state_updating_vertices</a>.</p>
     * 
     * <p>A successful call moves {@code mesh} to state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#fb_triangle_mesh_state_ready">fb_triangle_mesh_state_ready</a>.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBTriangleMesh XR_FB_triangle_mesh} extension <b>must</b> be enabled prior to calling {@link #xrTriangleMeshEndVertexBufferUpdateFB TriangleMeshEndVertexBufferUpdateFB}</li>
     * <li>{@code mesh} <b>must</b> be a valid {@code XrTriangleMeshFB} handle</li>
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
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrTriangleMeshBeginVertexBufferUpdateFB TriangleMeshBeginVertexBufferUpdateFB}</p>
     *
     * @param mesh the {@code XrTriangleMeshFB} to update.
     */
    @NativeType("XrResult")
    public static int xrTriangleMeshEndVertexBufferUpdateFB(XrTriangleMeshFB mesh) {
        long __functionAddress = mesh.getCapabilities().xrTriangleMeshEndVertexBufferUpdateFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(mesh.address(), __functionAddress);
    }

}