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

public class FBTriangleMesh {

    public static final int XR_FB_triangle_mesh_SPEC_VERSION = 2;

    public static final String XR_FB_TRIANGLE_MESH_EXTENSION_NAME = "XR_FB_triangle_mesh";

    public static final int XR_TYPE_TRIANGLE_MESH_CREATE_INFO_FB = 1000117001;

    public static final int XR_OBJECT_TYPE_TRIANGLE_MESH_FB = 1000117000;

    public static final int XR_TRIANGLE_MESH_MUTABLE_BIT_FB = 0x1;

    public static final int
        XR_WINDING_ORDER_UNKNOWN_FB = 0,
        XR_WINDING_ORDER_CW_FB      = 1,
        XR_WINDING_ORDER_CCW_FB     = 2;

    protected FBTriangleMesh() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateTriangleMeshFB ] ---

    /** {@code XrResult xrCreateTriangleMeshFB(XrSession session, XrTriangleMeshCreateInfoFB const * createInfo, XrTriangleMeshFB * outTriangleMesh)} */
    public static int nxrCreateTriangleMeshFB(XrSession session, long createInfo, long outTriangleMesh) {
        long __functionAddress = session.getCapabilities().xrCreateTriangleMeshFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, outTriangleMesh, __functionAddress);
    }

    /** {@code XrResult xrCreateTriangleMeshFB(XrSession session, XrTriangleMeshCreateInfoFB const * createInfo, XrTriangleMeshFB * outTriangleMesh)} */
    @NativeType("XrResult")
    public static int xrCreateTriangleMeshFB(XrSession session, @NativeType("XrTriangleMeshCreateInfoFB const *") XrTriangleMeshCreateInfoFB createInfo, @NativeType("XrTriangleMeshFB *") PointerBuffer outTriangleMesh) {
        if (CHECKS) {
            check(outTriangleMesh, 1);
        }
        return nxrCreateTriangleMeshFB(session, createInfo.address(), memAddress(outTriangleMesh));
    }

    // --- [ xrDestroyTriangleMeshFB ] ---

    /** {@code XrResult xrDestroyTriangleMeshFB(XrTriangleMeshFB mesh)} */
    @NativeType("XrResult")
    public static int xrDestroyTriangleMeshFB(XrTriangleMeshFB mesh) {
        long __functionAddress = mesh.getCapabilities().xrDestroyTriangleMeshFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(mesh.address(), __functionAddress);
    }

    // --- [ xrTriangleMeshGetVertexBufferFB ] ---

    /** {@code XrResult xrTriangleMeshGetVertexBufferFB(XrTriangleMeshFB mesh, XrVector3f ** outVertexBuffer)} */
    public static int nxrTriangleMeshGetVertexBufferFB(XrTriangleMeshFB mesh, long outVertexBuffer) {
        long __functionAddress = mesh.getCapabilities().xrTriangleMeshGetVertexBufferFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(mesh.address(), outVertexBuffer, __functionAddress);
    }

    /** {@code XrResult xrTriangleMeshGetVertexBufferFB(XrTriangleMeshFB mesh, XrVector3f ** outVertexBuffer)} */
    @NativeType("XrResult")
    public static int xrTriangleMeshGetVertexBufferFB(XrTriangleMeshFB mesh, @NativeType("XrVector3f **") PointerBuffer outVertexBuffer) {
        if (CHECKS) {
            check(outVertexBuffer, 1);
        }
        return nxrTriangleMeshGetVertexBufferFB(mesh, memAddress(outVertexBuffer));
    }

    // --- [ xrTriangleMeshGetIndexBufferFB ] ---

    /** {@code XrResult xrTriangleMeshGetIndexBufferFB(XrTriangleMeshFB mesh, uint32_t ** outIndexBuffer)} */
    public static int nxrTriangleMeshGetIndexBufferFB(XrTriangleMeshFB mesh, long outIndexBuffer) {
        long __functionAddress = mesh.getCapabilities().xrTriangleMeshGetIndexBufferFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(mesh.address(), outIndexBuffer, __functionAddress);
    }

    /** {@code XrResult xrTriangleMeshGetIndexBufferFB(XrTriangleMeshFB mesh, uint32_t ** outIndexBuffer)} */
    @NativeType("XrResult")
    public static int xrTriangleMeshGetIndexBufferFB(XrTriangleMeshFB mesh, @NativeType("uint32_t **") PointerBuffer outIndexBuffer) {
        if (CHECKS) {
            check(outIndexBuffer, 1);
        }
        return nxrTriangleMeshGetIndexBufferFB(mesh, memAddress(outIndexBuffer));
    }

    // --- [ xrTriangleMeshBeginUpdateFB ] ---

    /** {@code XrResult xrTriangleMeshBeginUpdateFB(XrTriangleMeshFB mesh)} */
    @NativeType("XrResult")
    public static int xrTriangleMeshBeginUpdateFB(XrTriangleMeshFB mesh) {
        long __functionAddress = mesh.getCapabilities().xrTriangleMeshBeginUpdateFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(mesh.address(), __functionAddress);
    }

    // --- [ xrTriangleMeshEndUpdateFB ] ---

    /** {@code XrResult xrTriangleMeshEndUpdateFB(XrTriangleMeshFB mesh, uint32_t vertexCount, uint32_t triangleCount)} */
    @NativeType("XrResult")
    public static int xrTriangleMeshEndUpdateFB(XrTriangleMeshFB mesh, @NativeType("uint32_t") int vertexCount, @NativeType("uint32_t") int triangleCount) {
        long __functionAddress = mesh.getCapabilities().xrTriangleMeshEndUpdateFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(mesh.address(), vertexCount, triangleCount, __functionAddress);
    }

    // --- [ xrTriangleMeshBeginVertexBufferUpdateFB ] ---

    /** {@code XrResult xrTriangleMeshBeginVertexBufferUpdateFB(XrTriangleMeshFB mesh, uint32_t * outVertexCount)} */
    public static int nxrTriangleMeshBeginVertexBufferUpdateFB(XrTriangleMeshFB mesh, long outVertexCount) {
        long __functionAddress = mesh.getCapabilities().xrTriangleMeshBeginVertexBufferUpdateFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(mesh.address(), outVertexCount, __functionAddress);
    }

    /** {@code XrResult xrTriangleMeshBeginVertexBufferUpdateFB(XrTriangleMeshFB mesh, uint32_t * outVertexCount)} */
    @NativeType("XrResult")
    public static int xrTriangleMeshBeginVertexBufferUpdateFB(XrTriangleMeshFB mesh, @NativeType("uint32_t *") IntBuffer outVertexCount) {
        if (CHECKS) {
            check(outVertexCount, 1);
        }
        return nxrTriangleMeshBeginVertexBufferUpdateFB(mesh, memAddress(outVertexCount));
    }

    // --- [ xrTriangleMeshEndVertexBufferUpdateFB ] ---

    /** {@code XrResult xrTriangleMeshEndVertexBufferUpdateFB(XrTriangleMeshFB mesh)} */
    @NativeType("XrResult")
    public static int xrTriangleMeshEndVertexBufferUpdateFB(XrTriangleMeshFB mesh) {
        long __functionAddress = mesh.getCapabilities().xrTriangleMeshEndVertexBufferUpdateFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(mesh.address(), __functionAddress);
    }

}