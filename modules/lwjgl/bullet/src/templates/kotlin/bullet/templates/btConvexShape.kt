/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btConvexShape = "BTConvexShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    void(
        "ConvexShape_batchedUnitVectorGetSupportingVertexWithoutMargin",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("vectors", ""),
        btVector3.p("supportVerticesOut", ""),
        int("numVectors", "")
    )

    void(
        "ConvexShape_getAabbNonVirtual",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("t", ""),
        btVector3.p("aabbMin", ""),
        btVector3.p("aabbMax", "")
    )

    void(
        "ConvexShape_getAabbSlow",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("t", ""),
        btVector3.p("aabbMin", ""),
        btVector3.p("aabbMax", "")
    )

    btScalar(
        "ConvexShape_getMarginNonVirtual",
        "",

        opaque_p("obj", "")
    )

    int(
        "ConvexShape_getNumPreferredPenetrationDirections",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConvexShape_getPreferredPenetrationDirection",
        "",

        opaque_p("obj", ""),
        int("index", ""),
        btVector3.p("penetrationVector", "")
    )

    void(
        "ConvexShape_localGetSupportingVertex",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("vec", ""),
        btVector3.p("value", "")
    )

    void(
        "ConvexShape_localGetSupportingVertexWithoutMargin",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("vec", ""),
        btVector3.p("value", "")
    )

    void(
        "ConvexShape_localGetSupportVertexNonVirtual",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("vec", ""),
        btVector3.p("value", "")
    )

    void(
        "ConvexShape_localGetSupportVertexWithoutMarginNonVirtual",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("vec", ""),
        btVector3.p("value", "")
    )

    void(
        "ConvexShape_project",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("trans", ""),
        btVector3.const.p("dir", ""),
        Check(1)..btScalar.p("minProj", ""),
        Check(1)..btScalar.p("maxProj", ""),
        btVector3.p("witnesPtMin", ""),
        btVector3.p("witnesPtMax", "")
    )

}