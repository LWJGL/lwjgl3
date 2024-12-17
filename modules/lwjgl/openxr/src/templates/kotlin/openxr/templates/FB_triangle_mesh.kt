/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_triangle_mesh = "FBTriangleMesh".nativeClassXR("FB_triangle_mesh", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_triangle_mesh_SPEC_VERSION".."2"
    )

    StringConstant(
        "FB_TRIANGLE_MESH_EXTENSION_NAME".."XR_FB_triangle_mesh"
    )

    EnumConstant(
        "TYPE_TRIANGLE_MESH_CREATE_INFO_FB".."1000117001"
    )

    EnumConstant(
        "OBJECT_TYPE_TRIANGLE_MESH_FB".."1000117000"
    )

    EnumConstant(
        "TRIANGLE_MESH_MUTABLE_BIT_FB".enum(0x00000001)
    )

    EnumConstant(
        "WINDING_ORDER_UNKNOWN_FB".."0",
        "WINDING_ORDER_CW_FB".."1",
        "WINDING_ORDER_CCW_FB".."2"
    )

    XrResult(
        "CreateTriangleMeshFB",

        XrSession("session"),
        XrTriangleMeshCreateInfoFB.const.p("createInfo"),
        Check(1)..XrTriangleMeshFB.p("outTriangleMesh")
    )

    XrResult(
        "DestroyTriangleMeshFB",

        XrTriangleMeshFB("mesh")
    )

    XrResult(
        "TriangleMeshGetVertexBufferFB",

        XrTriangleMeshFB("mesh"),
        Check(1)..XrVector3f.p.p("outVertexBuffer")
    )

    XrResult(
        "TriangleMeshGetIndexBufferFB",

        XrTriangleMeshFB("mesh"),
        Check(1)..uint32_t.p.p("outIndexBuffer")
    )

    XrResult(
        "TriangleMeshBeginUpdateFB",

        XrTriangleMeshFB("mesh")
    )

    XrResult(
        "TriangleMeshEndUpdateFB",

        XrTriangleMeshFB("mesh"),
        uint32_t("vertexCount"),
        uint32_t("triangleCount")
    )

    XrResult(
        "TriangleMeshBeginVertexBufferUpdateFB",

        XrTriangleMeshFB("mesh"),
        Check(1)..uint32_t.p("outVertexCount")
    )

    XrResult(
        "TriangleMeshEndVertexBufferUpdateFB",

        XrTriangleMeshFB("mesh")
    )
}