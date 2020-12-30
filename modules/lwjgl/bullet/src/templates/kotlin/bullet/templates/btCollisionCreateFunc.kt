/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btCollisionCreateFunc = "BTCollisionCreateFunc".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "CollisionAlgorithmCreateFunc_new",
        "",

        void()
    )

    opaque_p(
        "CollisionAlgorithmCreateFunc_CreateCollisionAlgorithm",
        "",

        opaque_p("obj", ""),
        opaque_p("__unnamed0", ""),
        opaque_p("body0Wrap", ""),
        opaque_p("body1Wrap", "")
    )

    bool(
        "CollisionAlgorithmCreateFunc_getSwapped",
        "",

        opaque_p("obj", "")
    )

    void(
        "CollisionAlgorithmCreateFunc_setSwapped",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "CollisionAlgorithmCreateFunc_delete",
        "",

        opaque_p("obj", "")
    )

}