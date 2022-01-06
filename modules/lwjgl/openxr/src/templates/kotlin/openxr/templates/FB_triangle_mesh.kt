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
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "FB_triangle_mesh_SPEC_VERSION".."1"
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
        "XrTriangleMeshFlagBitsFB",

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
        Retrieves a pointer to the vertex buffer. The vertex buffer is structured as an array of ##XrVector3f. The size of the buffer is {@code vertexCount}. The application must call #TriangleMeshBeginUpdateFB() or #TriangleMeshBeginVertexBufferUpdateFB() before making modifications to the vertex buffer. The buffer location is guaranteed to remain constant over the lifecycle of the mesh object.

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
        ##XrVector3f
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
        Retrieves a pointer to the index buffer that defines the topology of the triangle mesh. Each triplet of consecutive elements points to three vertices in the vertex buffer and thus form a triangle.

        The application <b>must</b> call #TriangleMeshBeginUpdateFB() before making modifications to the index buffer. The buffer location is guaranteed to remain constant over the lifecycle of the mesh object.

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
        Begins updating the mesh buffer data. The application <b>must</b> call this function before it makes any modifications to the buffers retrieved by #TriangleMeshGetVertexBufferFB() and #TriangleMeshGetIndexBufferFB(). If only the vertex buffer needs to be updated, #TriangleMeshBeginVertexBufferUpdateFB() <b>may</b> be used instead. To commit the modifications, the application <b>must</b> call #TriangleMeshEndUpdateFB(). Runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if the mesh is immutable.

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
            </ul></dd>
        </dl>
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
        Signals to the runtime that the application has finished updating the mesh buffers following a call to #TriangleMeshBeginUpdateFB(). {@code vertexCount} and {@code triangleCount} specify the actual number of primitives that make up the mesh after the update. They must be larger than zero but smaller or equal to the maximum counts defined at create time.

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
            </ul></dd>
        </dl>
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
        Begins an update of the vertex positions of a triangle mesh. Can only be called once the mesh topology has been set using #TriangleMeshBeginUpdateFB() followed by #TriangleMeshEndUpdateFB(). The vertex count is defined by the last invocation to #TriangleMeshEndUpdateFB(). Once the modification is done, call #TriangleMeshEndVertexBufferUpdateFB() to commit the changes. Runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if an invalid count is passed. Runtime <b>must</b> return #ERROR_VALIDATION_FAILURE if the mesh is immutable.

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
            </ul></dd>
        </dl>
        """,

        XrTriangleMeshFB("mesh", "the {@code XrTriangleMeshFB} to update."),
        Check(1)..uint32_t.p("outVertexCount", "the current vertex count. The updated data must have the exact same number of vertices.")
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
            </ul></dd>
        </dl>
        """,

        XrTriangleMeshFB("mesh", "the {@code XrTriangleMeshFB} to update.")
    )
}