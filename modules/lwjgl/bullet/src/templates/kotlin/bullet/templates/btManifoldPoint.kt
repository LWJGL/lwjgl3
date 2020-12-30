/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btManifoldPoint = "BTManifoldPoint".nativeClass(Module.BULLET, prefixMethod = "", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "btManifoldPoint_new",
        "",

        void()
    )

    opaque_p(
        "btManifoldPoint_new2",
        "",

        btVector3.const.p("pointA", ""),
        btVector3.const.p("pointB", ""),
        btVector3.const.p("normal", ""),
        btScalar("distance", "")
    )

    btScalar(
        "btManifoldPoint_getAppliedImpulse",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "btManifoldPoint_getAppliedImpulseLateral1",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "btManifoldPoint_getAppliedImpulseLateral2",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "btManifoldPoint_getCombinedContactDamping1",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "btManifoldPoint_getCombinedContactStiffness1",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "btManifoldPoint_getCombinedFriction",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "btManifoldPoint_getCombinedRestitution",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "btManifoldPoint_getCombinedRollingFriction",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "btManifoldPoint_getContactCFM",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "btManifoldPoint_getContactERP",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "btManifoldPoint_getContactMotion1",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "btManifoldPoint_getContactMotion2",
        "",

        opaque_p("obj", "")
    )

    int(
        "btManifoldPoint_getContactPointFlags",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "btManifoldPoint_getDistance",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "btManifoldPoint_getDistance1",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "btManifoldPoint_getFrictionCFM",
        "",

        opaque_p("obj", "")
    )

    int(
        "btManifoldPoint_getIndex0",
        "",

        opaque_p("obj", "")
    )

    int(
        "btManifoldPoint_getIndex1",
        "",

        opaque_p("obj", "")
    )

    void(
        "btManifoldPoint_getLateralFrictionDir1",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "btManifoldPoint_getLateralFrictionDir2",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    int(
        "btManifoldPoint_getLifeTime",
        "",

        opaque_p("obj", "")
    )

    void(
        "btManifoldPoint_getLocalPointA",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "btManifoldPoint_getLocalPointB",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "btManifoldPoint_getNormalWorldOnB",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    int(
        "btManifoldPoint_getPartId0",
        "",

        opaque_p("obj", "")
    )

    int(
        "btManifoldPoint_getPartId1",
        "",

        opaque_p("obj", "")
    )

    void(
        "btManifoldPoint_getPositionWorldOnA",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "btManifoldPoint_getPositionWorldOnB",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    opaque_p(
        "btManifoldPoint_getUserPersistentData",
        "",

        opaque_p("obj", "")
    )

    void(
        "btManifoldPoint_setAppliedImpulse",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "btManifoldPoint_setAppliedImpulseLateral1",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "btManifoldPoint_setAppliedImpulseLateral2",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "btManifoldPoint_setCombinedContactDamping1",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "btManifoldPoint_setCombinedContactStiffness1",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "btManifoldPoint_setCombinedFriction",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "btManifoldPoint_setCombinedRestitution",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "btManifoldPoint_setCombinedRollingFriction",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "btManifoldPoint_setContactCFM",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "btManifoldPoint_setContactERP",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "btManifoldPoint_setContactMotion1",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "btManifoldPoint_setContactMotion2",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "btManifoldPoint_setContactPointFlags",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "btManifoldPoint_setDistance",
        "",

        opaque_p("obj", ""),
        btScalar("dist", "")
    )

    void(
        "btManifoldPoint_setDistance1",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "btManifoldPoint_setFrictionCFM",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "btManifoldPoint_setIndex0",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "btManifoldPoint_setIndex1",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "btManifoldPoint_setLateralFrictionDir1",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "btManifoldPoint_setLateralFrictionDir2",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "btManifoldPoint_setLifeTime",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "btManifoldPoint_setLocalPointA",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "btManifoldPoint_setLocalPointB",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "btManifoldPoint_setNormalWorldOnB",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "btManifoldPoint_setPartId0",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "btManifoldPoint_setPartId1",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "btManifoldPoint_setPositionWorldOnA",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "btManifoldPoint_setPositionWorldOnB",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "btManifoldPoint_setUserPersistentData",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "btManifoldPoint_delete",
        "",

        opaque_p("obj", "")
    )

    ContactAddedCallback(
        "getGContactAddedCallback",
        "",

        void()
    )

    void(
        "setGContactAddedCallback",
        "",

        ContactAddedCallback("value", "")
    )

}