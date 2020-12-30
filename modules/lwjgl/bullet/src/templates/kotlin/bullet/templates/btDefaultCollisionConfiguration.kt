/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btDefaultCollisionConfiguration = "BTDefaultCollisionConfiguration".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "DefaultCollisionConstructionInfo_new",
        "",

        void()
    )

    opaque_p(
        "DefaultCollisionConstructionInfo_getCollisionAlgorithmPool",
        "",

        opaque_p("obj", "")
    )

    int(
        "DefaultCollisionConstructionInfo_getCustomCollisionAlgorithmMaxElementSize",
        "",

        opaque_p("obj", "")
    )

    int(
        "DefaultCollisionConstructionInfo_getDefaultMaxCollisionAlgorithmPoolSize",
        "",

        opaque_p("obj", "")
    )

    int(
        "DefaultCollisionConstructionInfo_getDefaultMaxPersistentManifoldPoolSize",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "DefaultCollisionConstructionInfo_getPersistentManifoldPool",
        "",

        opaque_p("obj", "")
    )

    int(
        "DefaultCollisionConstructionInfo_getUseEpaPenetrationAlgorithm",
        "",

        opaque_p("obj", "")
    )

    void(
        "DefaultCollisionConstructionInfo_setCollisionAlgorithmPool",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "DefaultCollisionConstructionInfo_setCustomCollisionAlgorithmMaxElementSize",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "DefaultCollisionConstructionInfo_setDefaultMaxCollisionAlgorithmPoolSize",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "DefaultCollisionConstructionInfo_setDefaultMaxPersistentManifoldPoolSize",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "DefaultCollisionConstructionInfo_setPersistentManifoldPool",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "DefaultCollisionConstructionInfo_setUseEpaPenetrationAlgorithm",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "DefaultCollisionConstructionInfo_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "DefaultCollisionConfiguration_new",
        "",

        void()
    )

    opaque_p(
        "DefaultCollisionConfiguration_new2",
        "",

        opaque_p("constructionInfo", "")
    )

    opaque_p(
        "DefaultCollisionConfiguration_getClosestPointsAlgorithmCreateFunc",
        "",

        opaque_p("obj", ""),
        int("proxyType0", ""),
        int("proxyType1", "")
    )

    void(
        "DefaultCollisionConfiguration_setConvexConvexMultipointIterations",
        "",

        opaque_p("obj", ""),
        int("numPerturbationIterations", ""),
        int("minimumPointsPerturbationThreshold", "")
    )

    void(
        "DefaultCollisionConfiguration_setPlaneConvexMultipointIterations",
        "",

        opaque_p("obj", ""),
        int("numPerturbationIterations", ""),
        int("minimumPointsPerturbationThreshold", "")
    )

}