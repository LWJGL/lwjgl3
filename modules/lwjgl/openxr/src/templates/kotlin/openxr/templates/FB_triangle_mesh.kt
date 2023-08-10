/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_triangle_mesh = "FBTriangleMesh".nativeClassXR("FB_triangle_mesh", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_triangle_mesh">XR_FB_triangle_mesh</a> extension.

        Meshes may be useful in XR applications when representing parts of the environment. In particular, application may provide the surfaces of real-world objects tagged manually to the runtime, or obtain automatically detected environment contents.

        This extension allows:

        <ul>
            <li>An application to create a triangle mesh and specify the mesh data.</li>
            <li>An application to update mesh contents if a mesh is mutable.</li>
        </ul>

        In order to enable the functionality of this extension, the application <b>must</b> pass the name of the extension into #CreateInstance() via the ##XrInstanceCreateInfo{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#extensions">extensions</a> section.
        """

    IntConstant(
        "The extension specification version.",

        "FB_triangle_mesh_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "FB_TRIANGLE_MESH_EXTENSION_NAME".."XR_FB_triangle_mesh"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_TRIANGLE_MESH_CREATE_INFO_FB".."1000117001"
    )

    EnumConstant(
        "Extends {@code XrObjectType}.",

        "OBJECT_TYPE_TRIANGLE_MESH_FB".."1000117000"
    )

    EnumConstant(
        """
        XrTriangleMeshFlagBitsFB - XrTriangleMeshFlagBitsFB

        <h5>Flag Descriptions</h5>
        <ul>
            <li>#TRIANGLE_MESH_MUTABLE_BIT_FB — The triangle mesh is mutable (can be modified after it is created).</li>
        </ul>
        """,

        "TRIANGLE_MESH_MUTABLE_BIT_FB".enum(0x00000001)
    )

    EnumConstant(
        """
        XrWindingOrderFB - Triangle winding order

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#WINDING_ORDER_UNKNOWN_FB — Winding order is unknown and the runtime cannot make any assumptions on the triangle orientation</li>
            <li>#WINDING_ORDER_CW_FB — Clockwise winding order</li>
            <li>#WINDING_ORDER_CCW_FB — Counter-clockwise winding order</li>
        </ul>

        <h5>See Also</h5>
        ##XrTriangleMeshCreateInfoFB
        """,

        "WINDING_ORDER_UNKNOWN_FB".."0",
        "WINDING_ORDER_CW_FB".."1",
        "WINDING_ORDER_CCW_FB".."2"
    )

    XrResult(
        "CreateTriangleMeshFB",
        """
        Create a triangle mesh.

        <h5>C Specification</h5>
        The #CreateTriangleMeshFB() function is defined as:

        <pre><code>
￿XrResult xrCreateTriangleMeshFB(
￿    XrSession                                   session,
￿    const XrTriangleMeshCreateInfoFB*           createInfo,
￿    XrTriangleMeshFB*                           outTriangleMesh);</code></pre>

        <h5>Description</h5>
        This creates an {@code XrTriangleMeshFB} handle. The returned triangle mesh handle <b>may</b> be subsequently used in API calls.

        When the mesh is mutable (the #TRIANGLE_MESH_MUTABLE_BIT_FB bit is set in {@code createInfo→pname}:flags), the created triangle mesh starts in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#fb_triangle_mesh_state_undefined_topology">fb_triangle_mesh_state_undefined_topology</a> state.

        Immutable meshes have no state machine; they may be considered to be in state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#fb_triangle_mesh_state_ready">fb_triangle_mesh_state_ready</a> with no valid edges leaving that state.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBTriangleMesh XR_FB_triangle_mesh} extension <b>must</b> be enabled prior to calling #CreateTriangleMeshFB()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code createInfo} <b>must</b> be a pointer to a valid ##XrTriangleMeshCreateInfoFB structure</li>
            <li>{@code outTriangleMesh} <b>must</b> be a pointer to an {@code XrTriangleMeshFB} handle</li>
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
                <li>#ERROR_INSUFFICIENT_RESOURCES_PASSTHROUGH_FB</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrTriangleMeshCreateInfoFB
        """,

        XrSession("session", "the {@code XrSession} to which the mesh will belong."),
        XrTriangleMeshCreateInfoFB.const.p("createInfo", "a pointer to an ##XrTriangleMeshCreateInfoFB structure containing parameters to be used to create the mesh."),
        Check(1)..XrTriangleMeshFB.p("outTriangleMesh", "a pointer to a handle in which the created {@code XrTriangleMeshFB} is returned.")
    )

    XrResult(
        "DestroyTriangleMeshFB",
        """
        Destroy a triangle mesh.

        <h5>C Specification</h5>
        The #DestroyTriangleMeshFB() function is defined as:

        <pre><code>
￿XrResult xrDestroyTriangleMeshFB(
￿    XrTriangleMeshFB                            mesh);</code></pre>

        <h5>Description</h5>
        {@code XrTriangleMeshFB} handles and their associated data are destroyed by #DestroyTriangleMeshFB(). The mesh buffers retrieved by #TriangleMeshGetVertexBufferFB() and #TriangleMeshGetIndexBufferFB() <b>must</b> not be accessed anymore after their parent mesh object has been destroyed.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBTriangleMesh XR_FB_triangle_mesh} extension <b>must</b> be enabled prior to calling #DestroyTriangleMeshFB()</li>
            <li>{@code mesh} <b>must</b> be a valid {@code XrTriangleMeshFB} handle</li>
        </ul>

        <h5>Thread Safety</h5>
        <ul>
            <li>Access to {@code mesh}, and any child handles, <b>must</b> be externally synchronized</li>
            <li>Access to the buffers returned from calls to #TriangleMeshGetVertexBufferFB() and #TriangleMeshGetIndexBufferFB() on {@code mesh} <b>must</b> be externally synchronized</li>
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

        XrTriangleMeshFB("mesh", "the {@code XrTriangleMeshFB} to destroy.")
    )

    XrResult(
        "TriangleMeshGetVertexBufferFB",
        """
        Obtain the vertex buffer of a triangle mesh.

        <h5>C Specification</h5>
        The #TriangleMeshGetVertexBufferFB() function is defined as:

        <pre><code>
￿XrResult xrTriangleMeshGetVertexBufferFB(
￿    XrTriangleMeshFB                            mesh,
￿    XrVector3f**                                outVertexBuffer);</code></pre>

        <h5>Description</h5>
        Retrieves a pointer to the vertex buffer. The vertex buffer is structured as an array of ##XrVector3f. The size of the buffer is ##XrTriangleMeshCreateInfoFB{@code ::vertexCount} elements. The buffer location is guaranteed to remain constant over the lifecycle of the mesh object.

        A mesh <b>must</b> be mutable and in a specific state for the application to <b>modify</b> it through the retrieved vertex buffer.

        <ul>
            <li>A mutable triangle mesh <b>must</b> be in state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#fb_triangle_mesh_state_defining_topology">fb_triangle_mesh_state_defining_topology</a>, <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#fb_triangle_mesh_state_updating_mesh">fb_triangle_mesh_state_updating_mesh</a>, or <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#fb_triangle_mesh_state_updating_vertices">fb_triangle_mesh_state_updating_vertices</a> to modify the <b>contents</b> of the vertex buffer retrieved by this function.</li>
            <li>A mutable triangle mesh <b>must</b> be in state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#fb_triangle_mesh_state_defining_topology">fb_triangle_mesh_state_defining_topology</a> or <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#fb_triangle_mesh_state_updating_mesh">fb_triangle_mesh_state_updating_mesh</a> to modify the <b>count</b> of elements in the vertex buffer retrieved by this function. The new count is passed as a parameter to #TriangleMeshEndUpdateFB().</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBTriangleMesh XR_FB_triangle_mesh} extension <b>must</b> be enabled prior to calling #TriangleMeshGetVertexBufferFB()</li>
            <li>{@code mesh} <b>must</b> be a valid {@code XrTriangleMeshFB} handle</li>
            <li>{@code outVertexBuffer} <b>must</b> be a pointer to a pointer to an ##XrVector3f structure</li>
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
        ##XrVector3f, #TriangleMeshGetIndexBufferFB()
        """,

        XrTriangleMeshFB("mesh", "the {@code XrTriangleMeshFB} to get the vertex buffer for."),
        Check(1)..XrVector3f.p.p("outVertexBuffer", "a pointer to return the vertex buffer into.")
    )

    XrResult(
        "TriangleMeshGetIndexBufferFB",
        """
        Obtain the index buffer of a triangle mesh.

        <h5>C Specification</h5>
        The #TriangleMeshGetIndexBufferFB() function is defined as:

        <pre><code>
￿XrResult xrTriangleMeshGetIndexBufferFB(
￿    XrTriangleMeshFB                            mesh,
￿    uint32_t**                                  outIndexBuffer);</code></pre>

        <h5>Description</h5>
        Retrieves a pointer to the index buffer that defines the topology of the triangle mesh. Each triplet of consecutive elements points to three vertices in the vertex buffer and thus form a triangle. The size of the buffer is ##XrTriangleMeshCreateInfoFB{@code ::indexCount} elements. The buffer location is guaranteed to remain constant over the lifecycle of the mesh object.

        A triangle mesh <b>must</b> be mutable and in state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#fb_triangle_mesh_state_defining_topology">fb_triangle_mesh_state_defining_topology</a> or <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#fb_triangle_mesh_state_updating_mesh">fb_triangle_mesh_state_updating_mesh</a> for the application to <b>modify</b> the contents and/or triangle count in the index buffer retrieved by this function.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBTriangleMesh XR_FB_triangle_mesh} extension <b>must</b> be enabled prior to calling #TriangleMeshGetIndexBufferFB()</li>
            <li>{@code mesh} <b>must</b> be a valid {@code XrTriangleMeshFB} handle</li>
            <li>{@code outIndexBuffer} <b>must</b> be a pointer to a pointer to a {@code uint32_t} value</li>
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
        #TriangleMeshGetVertexBufferFB()
        """,

        XrTriangleMeshFB("mesh", "the {@code XrTriangleMeshFB} to get the index buffer for."),
        Check(1)..uint32_t.p.p("outIndexBuffer", "a pointer to return the index buffer into.")
    )

    XrResult(
        "TriangleMeshBeginUpdateFB",
        """
        Begin an update of the mesh data.

        <h5>C Specification</h5>
        The #TriangleMeshBeginUpdateFB() function is defined as:

        <pre><code>
￿XrResult xrTriangleMeshBeginUpdateFB(
￿    XrTriangleMeshFB                            mesh);</code></pre>

        <h5>Description</h5>
        Begins updating the mesh buffer data. The application <b>must</b> call this function before it makes any modifications to the buffers retrieved by #TriangleMeshGetVertexBufferFB() and #TriangleMeshGetIndexBufferFB(). If only the vertex buffer contents need to be updated, and the mesh is in state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#fb_triangle_mesh_state_ready">fb_triangle_mesh_state_ready</a>, #TriangleMeshBeginVertexBufferUpdateFB() <b>may</b> be used instead. To commit the modifications, the application <b>must</b> call #TriangleMeshEndUpdateFB().

        The triangle mesh {@code mesh} <b>must</b> be mutable. The runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if the mesh is immutable.

        The triangle mesh {@code mesh} <b>must</b> be in state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#fb_triangle_mesh_state_undefined_topology">fb_triangle_mesh_state_undefined_topology</a> or <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#fb_triangle_mesh_state_ready">fb_triangle_mesh_state_ready</a>.

        <ul>
            <li>If the triangle mesh is in state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#fb_triangle_mesh_state_undefined_topology">fb_triangle_mesh_state_undefined_topology</a> before this call, a successful call moves it to state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#fb_triangle_mesh_state_defining_topology">fb_triangle_mesh_state_defining_topology</a>.</li>
            <li>If the triangle mesh is in state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#fb_triangle_mesh_state_ready">fb_triangle_mesh_state_ready</a> before this call, a successful call moves it to state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#fb_triangle_mesh_state_updating_mesh">fb_triangle_mesh_state_updating_mesh</a>.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBTriangleMesh XR_FB_triangle_mesh} extension <b>must</b> be enabled prior to calling #TriangleMeshBeginUpdateFB()</li>
            <li>{@code mesh} <b>must</b> be a valid {@code XrTriangleMeshFB} handle</li>
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
                <li>#ERROR_CALL_ORDER_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #TriangleMeshEndUpdateFB()
        """,

        XrTriangleMeshFB("mesh", "the {@code XrTriangleMeshFB} to update.")
    )

    XrResult(
        "TriangleMeshEndUpdateFB",
        """
        End an update of the mesh data.

        <h5>C Specification</h5>
        The #TriangleMeshEndUpdateFB() function is defined as:

        <pre><code>
￿XrResult xrTriangleMeshEndUpdateFB(
￿    XrTriangleMeshFB                            mesh,
￿    uint32_t                                    vertexCount,
￿    uint32_t                                    triangleCount);</code></pre>

        <h5>Description</h5>
        Signals to the runtime that the application has finished initially populating or updating the mesh buffers. {@code vertexCount} and {@code triangleCount} specify the actual number of primitives that make up the mesh after the update. They <b>must</b> be larger than zero but smaller or equal to the maximum counts defined at create time. The runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if an invalid count is passed.

        The triangle mesh {@code mesh} <b>must</b> be mutable. The runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if the mesh is immutable.

        The triangle mesh {@code mesh} <b>must</b> be in state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#fb_triangle_mesh_state_defining_topology">fb_triangle_mesh_state_defining_topology</a> or <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#fb_triangle_mesh_state_updating_mesh">fb_triangle_mesh_state_updating_mesh</a>.

        A successful call moves {@code mesh} to state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#fb_triangle_mesh_state_ready">fb_triangle_mesh_state_ready</a>.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBTriangleMesh XR_FB_triangle_mesh} extension <b>must</b> be enabled prior to calling #TriangleMeshEndUpdateFB()</li>
            <li>{@code mesh} <b>must</b> be a valid {@code XrTriangleMeshFB} handle</li>
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
                <li>#ERROR_CALL_ORDER_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #TriangleMeshBeginUpdateFB()
        """,

        XrTriangleMeshFB("mesh", "the {@code XrTriangleMeshFB} to update."),
        uint32_t("vertexCount", "the vertex count after the update."),
        uint32_t("triangleCount", "the triangle count after the update.")
    )

    XrResult(
        "TriangleMeshBeginVertexBufferUpdateFB",
        """
        Begin an update of the vertex data.

        <h5>C Specification</h5>
        The #TriangleMeshBeginVertexBufferUpdateFB() function is defined as:

        <pre><code>
￿XrResult xrTriangleMeshBeginVertexBufferUpdateFB(
￿    XrTriangleMeshFB                            mesh,
￿    uint32_t*                                   outVertexCount);</code></pre>

        <h5>Description</h5>
        Begins an update of the vertex positions of a mutable triangle mesh. The vertex count returned through {@code outVertexCount} is defined by the last call to #TriangleMeshEndUpdateFB(). Once the modification is done, call #TriangleMeshEndVertexBufferUpdateFB() to commit the changes and move to state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#fb_triangle_mesh_state_ready">fb_triangle_mesh_state_ready</a>.

        The triangle mesh {@code mesh} <b>must</b> be mutable. The runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if the mesh is immutable.

        The triangle mesh {@code mesh} <b>must</b> be in state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#fb_triangle_mesh_state_ready">fb_triangle_mesh_state_ready</a>.

        A successful call moves {@code mesh} to state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#fb_triangle_mesh_state_updating_vertices">fb_triangle_mesh_state_updating_vertices</a>.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBTriangleMesh XR_FB_triangle_mesh} extension <b>must</b> be enabled prior to calling #TriangleMeshBeginVertexBufferUpdateFB()</li>
            <li>{@code mesh} <b>must</b> be a valid {@code XrTriangleMeshFB} handle</li>
            <li>{@code outVertexCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
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
                <li>#ERROR_CALL_ORDER_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #TriangleMeshBeginUpdateFB(), #TriangleMeshEndVertexBufferUpdateFB()
        """,

        XrTriangleMeshFB("mesh", "the {@code XrTriangleMeshFB} to update."),
        Check(1)..uint32_t.p("outVertexCount", "a pointer to a value to populate with the current vertex count. The updated data must have the exact same number of vertices.")
    )

    XrResult(
        "TriangleMeshEndVertexBufferUpdateFB",
        """
        End an update of the vertex data.

        <h5>C Specification</h5>
        The #TriangleMeshEndVertexBufferUpdateFB() function is defined as:

        <pre><code>
￿XrResult xrTriangleMeshEndVertexBufferUpdateFB(
￿    XrTriangleMeshFB                            mesh);</code></pre>

        <h5>Description</h5>
        Signals to the runtime that the application has finished updating the vertex buffer data following a call to #TriangleMeshBeginVertexBufferUpdateFB().

        The triangle mesh {@code mesh} <b>must</b> be mutable. The runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if the mesh is immutable.

        The triangle mesh {@code mesh} <b>must</b> be in state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#fb_triangle_mesh_state_updating_vertices">fb_triangle_mesh_state_updating_vertices</a>.

        A successful call moves {@code mesh} to state <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#fb_triangle_mesh_state_ready">fb_triangle_mesh_state_ready</a>.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link FBTriangleMesh XR_FB_triangle_mesh} extension <b>must</b> be enabled prior to calling #TriangleMeshEndVertexBufferUpdateFB()</li>
            <li>{@code mesh} <b>must</b> be a valid {@code XrTriangleMeshFB} handle</li>
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
                <li>#ERROR_CALL_ORDER_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #TriangleMeshBeginVertexBufferUpdateFB()
        """,

        XrTriangleMeshFB("mesh", "the {@code XrTriangleMeshFB} to update.")
    )
}