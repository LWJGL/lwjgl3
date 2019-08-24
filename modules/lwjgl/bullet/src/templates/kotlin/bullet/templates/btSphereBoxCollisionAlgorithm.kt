/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btSphereBoxCollisionAlgorithm = "BTSphereBoxCollisionAlgorithm".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "SphereBoxCollisionAlgorithm_CreateFunc_new",
        "",

        void()
    )

    opaque_p(
        "SphereBoxCollisionAlgorithm_new",
        "",

        opaque_p("mf", ""),
        opaque_p("ci", ""),
        opaque_p("body0Wrap", ""),
        opaque_p("body1Wrap", ""),
        bool("isSwapped", "")
    )

    bool(
        "SphereBoxCollisionAlgorithm_getSphereDistance",
        "",

        opaque_p("obj", ""),
        opaque_p("boxObjWrap", ""),
        btVector3.p("v3PointOnBox", ""),
        btVector3.p("normal", ""),
        Check(1)..btScalar.p("penetrationDepth", ""),
        btVector3.const.p("v3SphereCenter", ""),
        btScalar("fRadius", ""),
        btScalar("maxContactDistance", "")
    )

    btScalar(
        "SphereBoxCollisionAlgorithm_getSpherePenetration",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("boxHalfExtent", ""),
        btVector3.const.p("sphereRelPos", ""),
        btVector3.p("closestPoint", ""),
        btVector3.p("normal", "")
    )

}