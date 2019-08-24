/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btPersistentManifold = "BTPersistentManifold".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "PersistentManifold_new",
        "",

        void()
    )

    opaque_p(
        "PersistentManifold_new2",
        "",

        opaque_p("body0", ""),
        opaque_p("body1", ""),
        int("__unnamed2", ""),
        btScalar("contactBreakingThreshold", ""),
        btScalar("contactProcessingThreshold", "")
    )

    int(
        "PersistentManifold_addManifoldPoint",
        "",

        opaque_p("obj", ""),
        opaque_p("newPoint", ""),
        bool("isPredictive", "")
    )

    void(
        "PersistentManifold_clearManifold",
        "",

        opaque_p("obj", "")
    )

    void(
        "PersistentManifold_clearUserCache",
        "",

        opaque_p("obj", ""),
        opaque_p("pt", "")
    )

    opaque_p(
        "PersistentManifold_getBody0",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "PersistentManifold_getBody1",
        "",

        opaque_p("obj", "")
    )

    int(
        "PersistentManifold_getCacheEntry",
        "",

        opaque_p("obj", ""),
        opaque_p("newPoint", "")
    )

    int(
        "PersistentManifold_getCompanionIdA",
        "",

        opaque_p("obj", "")
    )

    int(
        "PersistentManifold_getCompanionIdB",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "PersistentManifold_getContactBreakingThreshold",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "PersistentManifold_getContactPoint",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    btScalar(
        "PersistentManifold_getContactProcessingThreshold",
        "",

        opaque_p("obj", "")
    )

    int(
        "PersistentManifold_getIndex1a",
        "",

        opaque_p("obj", "")
    )

    int(
        "PersistentManifold_getNumContacts",
        "",

        opaque_p("obj", "")
    )

    void(
        "PersistentManifold_refreshContactPoints",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("trA", ""),
        btTransform.const.p("trB", "")
    )

    void(
        "PersistentManifold_removeContactPoint",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    void(
        "PersistentManifold_replaceContactPoint",
        "",

        opaque_p("obj", ""),
        opaque_p("newPoint", ""),
        int("insertIndex", "")
    )

    void(
        "PersistentManifold_setBodies",
        "",

        opaque_p("obj", ""),
        opaque_p("body0", ""),
        opaque_p("body1", "")
    )

    void(
        "PersistentManifold_setCompanionIdA",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "PersistentManifold_setCompanionIdB",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "PersistentManifold_setContactBreakingThreshold",
        "",

        opaque_p("obj", ""),
        btScalar("contactBreakingThreshold", "")
    )

    void(
        "PersistentManifold_setContactProcessingThreshold",
        "",

        opaque_p("obj", ""),
        btScalar("contactProcessingThreshold", "")
    )

    void(
        "PersistentManifold_setIndex1a",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "PersistentManifold_setNumContacts",
        "",

        opaque_p("obj", ""),
        int("cachedPoints", "")
    )

    bool(
        "PersistentManifold_validContactDistance",
        "",

        opaque_p("obj", ""),
        opaque_p("pt", "")
    )

    void(
        "PersistentManifold_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "getGContactDestroyedCallback",
        "",

        void()
    )

    opaque_p(
        "getGContactProcessedCallback",
        "",

        void()
    )

    void(
        "setGContactDestroyedCallback",
        "",

        opaque_p("callback", "")
    )

    void(
        "setGContactProcessedCallback",
        "",

        opaque_p("callback", "")
    )

}