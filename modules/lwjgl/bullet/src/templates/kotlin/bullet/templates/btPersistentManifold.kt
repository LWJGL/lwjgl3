/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btPersistentManifold = "BTPersistentManifold".nativeClass(Module.BULLET, prefixMethod = "", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "btPersistentManifold_new",
        "",

        void()
    )

    opaque_p(
        "btPersistentManifold_new2",
        "",

        opaque_p("body0", ""),
        opaque_p("body1", ""),
        int("__unnamed2", ""),
        btScalar("contactBreakingThreshold", ""),
        btScalar("contactProcessingThreshold", "")
    )

    int(
        "btPersistentManifold_addManifoldPoint",
        "",

        opaque_p("obj", ""),
        opaque_p("newPoint", ""),
        bool("isPredictive", "")
    )

    void(
        "btPersistentManifold_clearManifold",
        "",

        opaque_p("obj", "")
    )

    void(
        "btPersistentManifold_clearUserCache",
        "",

        opaque_p("obj", ""),
        opaque_p("pt", "")
    )

    opaque_p(
        "btPersistentManifold_getBody0",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "btPersistentManifold_getBody1",
        "",

        opaque_p("obj", "")
    )

    int(
        "btPersistentManifold_getCacheEntry",
        "",

        opaque_p("obj", ""),
        opaque_p("newPoint", "")
    )

    int(
        "btPersistentManifold_getCompanionIdA",
        "",

        opaque_p("obj", "")
    )

    int(
        "btPersistentManifold_getCompanionIdB",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "btPersistentManifold_getContactBreakingThreshold",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "btPersistentManifold_getContactPoint",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    btScalar(
        "btPersistentManifold_getContactProcessingThreshold",
        "",

        opaque_p("obj", "")
    )

    int(
        "btPersistentManifold_getIndex1a",
        "",

        opaque_p("obj", "")
    )

    int(
        "btPersistentManifold_getNumContacts",
        "",

        opaque_p("obj", "")
    )

    void(
        "btPersistentManifold_refreshContactPoints",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("trA", ""),
        btTransform.const.p("trB", "")
    )

    void(
        "btPersistentManifold_removeContactPoint",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    void(
        "btPersistentManifold_replaceContactPoint",
        "",

        opaque_p("obj", ""),
        opaque_p("newPoint", ""),
        int("insertIndex", "")
    )

    void(
        "btPersistentManifold_setBodies",
        "",

        opaque_p("obj", ""),
        opaque_p("body0", ""),
        opaque_p("body1", "")
    )

    void(
        "btPersistentManifold_setCompanionIdA",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "btPersistentManifold_setCompanionIdB",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "btPersistentManifold_setContactBreakingThreshold",
        "",

        opaque_p("obj", ""),
        btScalar("contactBreakingThreshold", "")
    )

    void(
        "btPersistentManifold_setContactProcessingThreshold",
        "",

        opaque_p("obj", ""),
        btScalar("contactProcessingThreshold", "")
    )

    void(
        "btPersistentManifold_setIndex1a",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "btPersistentManifold_setNumContacts",
        "",

        opaque_p("obj", ""),
        int("cachedPoints", "")
    )

    bool(
        "btPersistentManifold_validContactDistance",
        "",

        opaque_p("obj", ""),
        opaque_p("pt", "")
    )

    void(
        "btPersistentManifold_delete",
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