/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btManifoldResult = "BTManifoldResult".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "ManifoldResult_new",
        "",

        void()
    )

    opaque_p(
        "ManifoldResult_new2",
        "",

        opaque_p("body0Wrap", ""),
        opaque_p("body1Wrap", "")
    )

    btScalar(
        "ManifoldResult_calculateCombinedContactDamping",
        "",

        opaque_p("body0", ""),
        opaque_p("body1", "")
    )

    btScalar(
        "ManifoldResult_calculateCombinedContactStiffness",
        "",

        opaque_p("body0", ""),
        opaque_p("body1", "")
    )

    btScalar(
        "ManifoldResult_calculateCombinedFriction",
        "",

        opaque_p("body0", ""),
        opaque_p("body1", "")
    )

    btScalar(
        "ManifoldResult_calculateCombinedRestitution",
        "",

        opaque_p("body0", ""),
        opaque_p("body1", "")
    )

    btScalar(
        "ManifoldResult_calculateCombinedRollingFriction",
        "",

        opaque_p("body0", ""),
        opaque_p("body1", "")
    )

    btScalar(
        "ManifoldResult_getClosestPointDistanceThreshold",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "ManifoldResult_getBody0Internal",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "ManifoldResult_getBody0Wrap",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "ManifoldResult_getBody1Internal",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "ManifoldResult_getBody1Wrap",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "ManifoldResult_getPersistentManifold",
        "",

        opaque_p("obj", "")
    )

    void(
        "ManifoldResult_refreshContactPoints",
        "",

        opaque_p("obj", "")
    )

    void(
        "ManifoldResult_setBody0Wrap",
        "",

        opaque_p("obj", ""),
        opaque_p("obj0Wrap", "")
    )

    void(
        "ManifoldResult_setBody1Wrap",
        "",

        opaque_p("obj", ""),
        opaque_p("obj1Wrap", "")
    )

    void(
        "ManifoldResult_setClosestPointDistanceThreshold",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ManifoldResult_setPersistentManifold",
        "",

        opaque_p("obj", ""),
        opaque_p("manifoldPtr", "")
    )

}