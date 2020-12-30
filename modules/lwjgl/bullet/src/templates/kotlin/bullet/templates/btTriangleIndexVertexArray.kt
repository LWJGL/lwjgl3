/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btTriangleIndexVertexArray = "BTTriangleIndexVertexArray".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "IndexedMesh_new",
        "",

        void()
    )

    int(
        "IndexedMesh_getIndexType",
        "",

        opaque_p("obj", "")
    )

    int(
        "IndexedMesh_getNumTriangles",
        "",

        opaque_p("obj", "")
    )

    int(
        "IndexedMesh_getNumVertices",
        "",

        opaque_p("obj", "")
    )

    //unsigned_char.const.p(
    opaque_const_p(
        "IndexedMesh_getTriangleIndexBase",
        "",

        opaque_p("obj", "")
    )

    int(
        "IndexedMesh_getTriangleIndexStride",
        "",

        opaque_p("obj", "")
    )

    //unsigned_char.const.p(
    opaque_const_p(
        "IndexedMesh_getVertexBase",
        "",

        opaque_p("obj", "")
    )

    int(
        "IndexedMesh_getVertexStride",
        "",

        opaque_p("obj", "")
    )

    int(
        "IndexedMesh_getVertexType",
        "",

        opaque_p("obj", "")
    )

    void(
        "IndexedMesh_setIndexType",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "IndexedMesh_setNumTriangles",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "IndexedMesh_setNumVertices",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "IndexedMesh_setTriangleIndexBase",
        "",

        opaque_p("obj", ""),
        Unsafe..unsigned_char.const.p("value", "")
    )

    void(
        "IndexedMesh_setTriangleIndexStride",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "IndexedMesh_setVertexBase",
        "",

        opaque_p("obj", ""),
        Unsafe..unsigned_char.const.p("value", "")
    )

    void(
        "IndexedMesh_setVertexStride",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "IndexedMesh_setVertexType",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "IndexedMesh_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "TriangleIndexVertexArray_new",
        "",

        void()
    )

    opaque_p(
        "TriangleIndexVertexArray_new2",
        "",

        int("numTriangles", ""),
        Unsafe..int.p("triangleIndexBase", ""),
        int("triangleIndexStride", "Size in byte of the indices for one triangle (3*sizeof(index_type) if the indices are tightly packed)"),
        int("numVertices", ""),
        Unsafe..btScalar.p("vertexBase", ""),
        int("vertexStride", "Size of a vertex, in bytes")
    )

    void(
        "TriangleIndexVertexArray_addIndexedMesh",
        "",

        opaque_p("obj", ""),
        opaque_p("mesh", ""),
        int("indexType", "")
    )

    opaque_p(
        "TriangleIndexVertexArray_getIndexedMeshArray",
        "",

        opaque_p("obj", "")
    )

}