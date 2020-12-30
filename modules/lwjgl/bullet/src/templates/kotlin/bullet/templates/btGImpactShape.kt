/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btGImpactShape = "BTGImpactShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "TetrahedronShapeEx_new",
        "",

        void()
    )

    void(
        "TetrahedronShapeEx_setVertices",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("v0", ""),
        btVector3.const.p("v1", ""),
        btVector3.const.p("v2", ""),
        btVector3.const.p("v3", "")
    )

    bool(
        "GImpactShapeInterface_childrenHasTransform",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "GImpactShapeInterface_getBoxSet",
        "",

        opaque_p("obj", "")
    )

    void(
        "GImpactShapeInterface_getBulletTetrahedron",
        "",

        opaque_p("obj", ""),
        int("prim_index", ""),
        opaque_p("tetrahedron", "")
    )

    void(
        "GImpactShapeInterface_getBulletTriangle",
        "",

        opaque_p("obj", ""),
        int("prim_index", ""),
        opaque_p("triangle", "")
    )

    void(
        "GImpactShapeInterface_getChildAabb",
        "",

        opaque_p("obj", ""),
        int("child_index", ""),
        btTransform.const.p("t", ""),
        btVector3.p("aabbMin", ""),
        btVector3.p("aabbMax", "")
    )

    opaque_p(
        "GImpactShapeInterface_getChildShape",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    void(
        "GImpactShapeInterface_getChildTransform",
        "",

        opaque_p("obj", ""),
        int("index", ""),
        btTransform.p("value", "")
    )

    int(
        "GImpactShapeInterface_getGImpactShapeType",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "GImpactShapeInterface_getLocalBox",
        "",

        opaque_p("obj", "")
    )

    int(
        "GImpactShapeInterface_getNumChildShapes",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "GImpactShapeInterface_getPrimitiveManager",
        "",

        opaque_p("obj", "")
    )

    void(
        "GImpactShapeInterface_getPrimitiveTriangle",
        "",

        opaque_p("obj", ""),
        int("index", ""),
        opaque_p("triangle", "")
    )

    bool(
        "GImpactShapeInterface_hasBoxSet",
        "",

        opaque_p("obj", "")
    )

    void(
        "GImpactShapeInterface_lockChildShapes",
        "",

        opaque_p("obj", "")
    )

    bool(
        "GImpactShapeInterface_needsRetrieveTetrahedrons",
        "",

        opaque_p("obj", "")
    )

    bool(
        "GImpactShapeInterface_needsRetrieveTriangles",
        "",

        opaque_p("obj", "")
    )

    void(
        "GImpactShapeInterface_postUpdate",
        "",

        opaque_p("obj", "")
    )

    void(
        "GImpactShapeInterface_processAllTrianglesRay",
        "",

        opaque_p("obj", ""),
        opaque_p("__unnamed0", ""),
        btVector3.const.p("__unnamed1", ""),
        btVector3.const.p("__unnamed2", "")
    )

    void(
        "GImpactShapeInterface_rayTest",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("rayFrom", ""),
        btVector3.const.p("rayTo", ""),
        opaque_p("resultCallback", "")
    )

    void(
        "GImpactShapeInterface_setChildTransform",
        "",

        opaque_p("obj", ""),
        int("index", ""),
        btTransform.const.p("transform", "")
    )

    void(
        "GImpactShapeInterface_unlockChildShapes",
        "",

        opaque_p("obj", "")
    )

    void(
        "GImpactShapeInterface_updateBound",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "GImpactCompoundShape_CompoundPrimitiveManager_new",
        "",

        opaque_p("compound", "")
    )

    opaque_p(
        "GImpactCompoundShape_CompoundPrimitiveManager_new2",
        "",

        opaque_p("compoundShape", "")
    )

    opaque_p(
        "GImpactCompoundShape_CompoundPrimitiveManager_new3",
        "",

        void()
    )

    opaque_p(
        "GImpactCompoundShape_CompoundPrimitiveManager_getCompoundShape",
        "",

        opaque_p("obj", "")
    )

    void(
        "GImpactCompoundShape_CompoundPrimitiveManager_setCompoundShape",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    opaque_p(
        "GImpactCompoundShape_new",
        "",

        bool("children_has_transform", "")
    )

    void(
        "GImpactCompoundShape_addChildShape",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("localTransform", ""),
        opaque_p("shape", "")
    )

    void(
        "GImpactCompoundShape_addChildShape2",
        "",

        opaque_p("obj", ""),
        opaque_p("shape", "")
    )

    opaque_p(
        "GImpactCompoundShape_getCompoundPrimitiveManager",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_new",
        "",

        opaque_p("meshInterface", ""),
        int("part", "")
    )

    opaque_p(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_new2",
        "",

        opaque_p("manager", "")
    )

    opaque_p(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_new3",
        "",

        void()
    )

    void(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_get_bullet_triangle",
        "",

        opaque_p("obj", ""),
        int("prim_index", ""),
        opaque_p("triangle", "")
    )

    void(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_get_indices",
        "",

        opaque_p("obj", ""),
        int("face_index", ""),
        Check(1)..unsigned_int.p("i0", ""),
        Check(1)..unsigned_int.p("i1", ""),
        Check(1)..unsigned_int.p("i2", "")
    )

    void(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_get_vertex",
        "",

        opaque_p("obj", ""),
        unsigned_int("vertex_index", ""),
        btVector3.p("vertex", "")
    )

    int(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_get_vertex_count",
        "",

        opaque_p("obj", "")
    )

    //unsigned_char.const.p(
    opaque_p(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_getIndexbase",
        "",

        opaque_p("obj", "")
    )

    int(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_getIndexstride",
        "",

        opaque_p("obj", "")
    )

    int(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_getIndicestype",
        "",

        opaque_p("obj", "")
    )

    int(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_getLock_count",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_getMargin",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_getMeshInterface",
        "",

        opaque_p("obj", "")
    )

    int(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_getNumfaces",
        "",

        opaque_p("obj", "")
    )

    int(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_getNumverts",
        "",

        opaque_p("obj", "")
    )

    int(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_getPart",
        "",

        opaque_p("obj", "")
    )

    void(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_getScale",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    int(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_getStride",
        "",

        opaque_p("obj", "")
    )

    int(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_getType",
        "",

        opaque_p("obj", "")
    )

    //unsigned_char.const.p(
    opaque_p(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_getVertexbase",
        "",

        opaque_p("obj", "")
    )

    void(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_lock",
        "",

        opaque_p("obj", "")
    )

    void(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_setIndexbase",
        "",

        opaque_p("obj", ""),
        Unsafe..unsigned_char.const.p("value", "")
    )

    void(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_setIndexstride",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_setIndicestype",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_setLock_count",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_setMargin",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_setMeshInterface",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_setNumfaces",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_setNumverts",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_setPart",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_setScale",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_setStride",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_setType",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_setVertexbase",
        "",

        opaque_p("obj", ""),
        Unsafe..unsigned_char.const.p("value", "")
    )

    void(
        "GImpactMeshShapePart_TrimeshPrimitiveManager_unlock",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "GImpactMeshShapePart_new",
        "",

        void()
    )

    opaque_p(
        "GImpactMeshShapePart_new2",
        "",

        opaque_p("meshInterface", ""),
        int("part", "")
    )

    int(
        "GImpactMeshShapePart_getPart",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "GImpactMeshShapePart_getTrimeshPrimitiveManager",
        "",

        opaque_p("obj", "")
    )

    void(
        "GImpactMeshShapePart_getVertex",
        "",

        opaque_p("obj", ""),
        int("vertex_index", ""),
        btVector3.p("vertex", "")
    )

    int(
        "GImpactMeshShapePart_getVertexCount",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "GImpactMeshShape_new",
        "",

        opaque_p("meshInterface", "")
    )

    opaque_p(
        "GImpactMeshShape_getMeshInterface",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "GImpactMeshShape_getMeshPart",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    int(
        "GImpactMeshShape_getMeshPartCount",
        "",

        opaque_p("obj", "")
    )

}