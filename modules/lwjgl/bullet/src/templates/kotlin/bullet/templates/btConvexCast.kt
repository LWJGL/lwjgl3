/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btConvexCast = "BTConvexCast".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "ConvexCast_CastResult_new",
        "",

        void()
    )

    void(
        "ConvexCast_CastResult_DebugDraw",
        "",

        opaque_p("obj", ""),
        btScalar("fraction", "")
    )

    void(
        "ConvexCast_CastResult_drawCoordSystem",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("trans", "")
    )

    btScalar(
        "ConvexCast_CastResult_getAllowedPenetration",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "ConvexCast_CastResult_getDebugDrawer",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ConvexCast_CastResult_getFraction",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConvexCast_CastResult_getHitPoint",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "ConvexCast_CastResult_getHitTransformA",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "ConvexCast_CastResult_getHitTransformB",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "ConvexCast_CastResult_getNormal",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "ConvexCast_CastResult_reportFailure",
        "",

        opaque_p("obj", ""),
        int("errNo", ""),
        int("numIterations", "")
    )

    void(
        "ConvexCast_CastResult_setAllowedPenetration",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ConvexCast_CastResult_setDebugDrawer",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "ConvexCast_CastResult_setFraction",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ConvexCast_CastResult_setHitPoint",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "ConvexCast_CastResult_setHitTransformA",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("value", "")
    )

    void(
        "ConvexCast_CastResult_setHitTransformB",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("value", "")
    )

    void(
        "ConvexCast_CastResult_setNormal",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "ConvexCast_CastResult_delete",
        "",

        opaque_p("obj", "")
    )

    bool(
        "ConvexCast_calcTimeOfImpact",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("fromA", ""),
        btTransform.const.p("toA", ""),
        btTransform.const.p("fromB", ""),
        btTransform.const.p("toB", ""),
        opaque_p("result", "")
    )

    void(
        "ConvexCast_delete",
        "",

        opaque_p("obj", "")
    )

}