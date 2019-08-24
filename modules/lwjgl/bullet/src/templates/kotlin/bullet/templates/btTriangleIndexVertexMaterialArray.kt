/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btTriangleIndexVertexMaterialArray = "BTTriangleIndexVertexMaterialArray".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "MaterialProperties_new",
        "",

        void()
    )

    //unsigned_char.const.p(
    opaque_const_p(
        "MaterialProperties_getMaterialBase",
        "",

        opaque_p("obj", "")
    )

    int(
        "MaterialProperties_getMaterialStride",
        "",

        opaque_p("obj", "")
    )

    int(
        "MaterialProperties_getMaterialType",
        "",

        opaque_p("obj", "")
    )

    int(
        "MaterialProperties_getNumMaterials",
        "",

        opaque_p("obj", "")
    )

    int(
        "MaterialProperties_getNumTriangles",
        "",

        opaque_p("obj", "")
    )

    //unsigned_char.const.p(
    opaque_const_p(
        "MaterialProperties_getTriangleMaterialsBase",
        "",

        opaque_p("obj", "")
    )

    int(
        "MaterialProperties_getTriangleMaterialStride",
        "",

        opaque_p("obj", "")
    )

    int(
        "MaterialProperties_getTriangleType",
        "",

        opaque_p("obj", "")
    )

    void(
        "MaterialProperties_setMaterialBase",
        "",

        opaque_p("obj", ""),
        Unsafe..unsigned_char.const.p("value", "")
    )

    void(
        "MaterialProperties_setMaterialStride",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MaterialProperties_setMaterialType",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MaterialProperties_setNumMaterials",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MaterialProperties_setNumTriangles",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MaterialProperties_setTriangleMaterialsBase",
        "",

        opaque_p("obj", ""),
        Unsafe..unsigned_char.const.p("value", "")
    )

    void(
        "MaterialProperties_setTriangleMaterialStride",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MaterialProperties_setTriangleType",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MaterialProperties_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "TriangleIndexVertexMaterialArray_new",
        "",

        void()
    )

    opaque_p(
        "TriangleIndexVertexMaterialArray_new2",
        "2 btScalar values make up one material, friction then restitution",

        int("numTriangles", ""),
        Unsafe..int.p("triangleIndexBase", ""),
        int("triangleIndexStride", ""),
        int("numVertices", ""),
        Unsafe..btScalar.p("vertexBase", ""),
        int("vertexStride", ""),
        int("numMaterials", ""),
        Unsafe..unsigned_char.p("materialBase", ""),
        int("materialStride", ""),
        Unsafe..int.p("triangleMaterialsBase", "1 integer value makes up one entry eg: m_triangleMaterials[1] = 5; // This will set triangle 2 to use material 5"),
        int("materialIndexStride", "")
    )

    void(
        "TriangleIndexVertexMaterialArray_addMaterialProperties",
        "",

        opaque_p("obj", ""),
        opaque_p("mat", ""),
        int("triangleType", "")
    )

    void(
        "TriangleIndexVertexMaterialArray_getLockedMaterialBase",
        "",

        opaque_p("obj", ""),
        Check(1)..unsigned_char.p.p("materialBase", ""),
        Check(1)..int.p("numMaterials", ""),
        Check(1)..int.p("materialType", ""),
        Check(1)..int.p("materialStride", ""),
        Check(1)..unsigned_char.p.p("triangleMaterialBase", ""),
        Check(1)..int.p("numTriangles", ""),
        Check(1)..int.p("triangleMaterialStride", ""),
        Check(1)..int.p("triangleType", ""),
        int("subpart", "")
    )

    void(
        "TriangleIndexVertexMaterialArray_getLockedReadOnlyMaterialBase",
        "",

        opaque_p("obj", ""),
        Check(1)..unsigned_char.const.p.p("materialBase", ""),
        Check(1)..int.p("numMaterials", ""),
        Check(1)..int.p("materialType", ""),
        Check(1)..int.p("materialStride", ""),
        Check(1)..unsigned_char.const.p.p("triangleMaterialBase", ""),
        Check(1)..int.p("numTriangles", ""),
        Check(1)..int.p("triangleMaterialStride", ""),
        Check(1)..int.p("triangleType", ""),
        int("subpart", "")
    )

}