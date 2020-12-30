/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btStridingMeshInterface = "BTStridingMeshInterface".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    void(
        "StridingMeshInterface_calculateAabbBruteForce",
        "",

        opaque_p("obj", ""),
        btVector3.p("aabbMin", ""),
        btVector3.p("aabbMax", "")
    )

    int(
        "StridingMeshInterface_calculateSerializeBufferSize",
        "",

        opaque_p("obj", "")
    )

    void(
        "StridingMeshInterface_getLockedReadOnlyVertexIndexBase",
        "",

        opaque_p("obj", ""),
        Check(1)..unsigned_char.const.p.p("vertexbase", ""),
        Check(1)..int.p("numverts", ""),
        Check(1)..int.p("type", ""),
        Check(1)..int.p("vertexStride", ""),
        Check(1)..unsigned_char.const.p.p("indexbase", ""),
        Check(1)..int.p("indexstride", ""),
        Check(1)..int.p("numfaces", ""),
        Check(1)..int.p("indicestype", ""),
        int("subpart", "")
    )

    void(
        "StridingMeshInterface_getLockedVertexIndexBase",
        "",

        opaque_p("obj", ""),
        Check(1)..unsigned_char.p.p("vertexbase", ""),
        Check(1)..int.p("numverts", ""),
        Check(1)..int.p("type", ""),
        Check(1)..int.p("vertexStride", ""),
        Check(1)..unsigned_char.p.p("indexbase", ""),
        Check(1)..int.p("indexstride", ""),
        Check(1)..int.p("numfaces", ""),
        Check(1)..int.p("indicestype", ""),
        int("subpart", "")
    )

    int(
        "StridingMeshInterface_getNumSubParts",
        "",

        opaque_p("obj", "")
    )

    void(
        "StridingMeshInterface_getPremadeAabb",
        "",

        opaque_p("obj", ""),
        btVector3.p("aabbMin", ""),
        btVector3.p("aabbMax", "")
    )

    void(
        "StridingMeshInterface_getScaling",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    bool(
        "StridingMeshInterface_hasPremadeAabb",
        "",

        opaque_p("obj", "")
    )

    void(
        "StridingMeshInterface_InternalProcessAllTriangles",
        "",

        opaque_p("obj", ""),
        opaque_p("callback", ""),
        btVector3.const.p("aabbMin", ""),
        btVector3.const.p("aabbMax", "")
    )

    void(
        "StridingMeshInterface_preallocateIndices",
        "",

        opaque_p("obj", ""),
        int("numindices", "")
    )

    void(
        "StridingMeshInterface_preallocateVertices",
        "",

        opaque_p("obj", ""),
        int("numverts", "")
    )

    charUTF8.const.p(
        "StridingMeshInterface_serialize",
        "",

        opaque_p("obj", ""),
        opaque_p("dataBuffer", ""),
        opaque_p("serializer", "")
    )

    void(
        "StridingMeshInterface_setPremadeAabb",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("aabbMin", ""),
        btVector3.const.p("aabbMax", "")
    )

    void(
        "StridingMeshInterface_setScaling",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("scaling", "")
    )

    void(
        "StridingMeshInterface_unLockReadOnlyVertexBase",
        "",

        opaque_p("obj", ""),
        int("subpart", "")
    )

    void(
        "StridingMeshInterface_unLockVertexBase",
        "",

        opaque_p("obj", ""),
        int("subpart", "")
    )

    void(
        "StridingMeshInterface_delete",
        "",

        opaque_p("obj", "")
    )

}