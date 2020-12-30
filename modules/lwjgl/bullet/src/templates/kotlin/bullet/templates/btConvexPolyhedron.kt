/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btConvexPolyhedron = "BTConvexPolyhedron".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "Face_new",
        "",

        void()
    )

    opaque_p(
        "Face_getIndices",
        "",

        opaque_p("obj", "")
    )

    btScalar[4](
        "Face_getPlane",
        "",

        opaque_p("obj", "")
    )

    void(
        "Face_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "ConvexPolyhedron_new",
        "",

        void()
    )

    void(
        "ConvexPolyhedron_getExtents",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    opaque_p(
        "ConvexPolyhedron_getFaces",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConvexPolyhedron_getLocalCenter",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "ConvexPolyhedron_getMC",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "ConvexPolyhedron_getME",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "ConvexPolyhedron_getRadius",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConvexPolyhedron_initialize",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConvexPolyhedron_initialize2",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConvexPolyhedron_project",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("trans", ""),
        btVector3.const.p("dir", ""),
        Check(1)..btScalar.p("minProj", ""),
        Check(1)..btScalar.p("maxProj", ""),
        btVector3.p("witnesPtMin", ""),
        btVector3.p("witnesPtMax", "")
    )

    void(
        "ConvexPolyhedron_setExtents",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "ConvexPolyhedron_setLocalCenter",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "ConvexPolyhedron_setMC",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "ConvexPolyhedron_setME",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "ConvexPolyhedron_setRadius",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    bool(
        "ConvexPolyhedron_testContainment",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConvexPolyhedron_delete",
        "",

        opaque_p("obj", "")
    )

}