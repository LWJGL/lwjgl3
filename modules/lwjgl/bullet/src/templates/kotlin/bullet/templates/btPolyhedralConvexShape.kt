/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btPolyhedralConvexShape = "BTPolyhedralConvexShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "PolyhedralConvexShape_getConvexPolyhedron",
        "",

        opaque_p("obj", "")
    )

    void(
        "PolyhedralConvexShape_getEdge",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        btVector3.p("pa", ""),
        btVector3.p("pb", "")
    )

    int(
        "PolyhedralConvexShape_getNumEdges",
        "",

        opaque_p("obj", "")
    )

    int(
        "PolyhedralConvexShape_getNumPlanes",
        "",

        opaque_p("obj", "")
    )

    int(
        "PolyhedralConvexShape_getNumVertices",
        "",

        opaque_p("obj", "")
    )

    void(
        "PolyhedralConvexShape_getPlane",
        "",

        opaque_p("obj", ""),
        btVector3.p("planeNormal", ""),
        btVector3.p("planeSupport", ""),
        int("i", "")
    )

    void(
        "PolyhedralConvexShape_getVertex",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        btVector3.p("vtx", "")
    )

    bool(
        "PolyhedralConvexShape_initializePolyhedralFeatures",
        "",

        opaque_p("obj", ""),
        int("shiftVerticesByMargin", "")
    )

    bool(
        "PolyhedralConvexShape_isInside",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("pt", ""),
        btScalar("tolerance", "")
    )

    void(
        "PolyhedralConvexShape_setPolyhedralFeatures",
        "",

        opaque_p("obj", ""),
        opaque_p("polyhedron", "")
    )

    void(
        "PolyhedralConvexAabbCachingShape_getNonvirtualAabb",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("trans", ""),
        btVector3.p("aabbMin", ""),
        btVector3.p("aabbMax", ""),
        btScalar("margin", "")
    )

    void(
        "PolyhedralConvexAabbCachingShape_recalcLocalAabb",
        "",

        opaque_p("obj", "")
    )

}