/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btManifoldPoint = "BTManifoldPoint".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "ManifoldPoint_new",
        "",

        void()
    )

    opaque_p(
        "ManifoldPoint_new2",
        "",

        btVector3.const.p("pointA", ""),
        btVector3.const.p("pointB", ""),
        btVector3.const.p("normal", ""),
        btScalar("distance", "")
    )

    btScalar(
        "ManifoldPoint_getAppliedImpulse",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ManifoldPoint_getAppliedImpulseLateral1",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ManifoldPoint_getAppliedImpulseLateral2",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ManifoldPoint_getCombinedContactDamping1",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ManifoldPoint_getCombinedContactStiffness1",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ManifoldPoint_getCombinedFriction",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ManifoldPoint_getCombinedRestitution",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ManifoldPoint_getCombinedRollingFriction",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ManifoldPoint_getContactCFM",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ManifoldPoint_getContactERP",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ManifoldPoint_getContactMotion1",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ManifoldPoint_getContactMotion2",
        "",

        opaque_p("obj", "")
    )

    int(
        "ManifoldPoint_getContactPointFlags",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ManifoldPoint_getDistance",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ManifoldPoint_getDistance1",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ManifoldPoint_getFrictionCFM",
        "",

        opaque_p("obj", "")
    )

    int(
        "ManifoldPoint_getIndex0",
        "",

        opaque_p("obj", "")
    )

    int(
        "ManifoldPoint_getIndex1",
        "",

        opaque_p("obj", "")
    )

    void(
        "ManifoldPoint_getLateralFrictionDir1",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "ManifoldPoint_getLateralFrictionDir2",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    int(
        "ManifoldPoint_getLifeTime",
        "",

        opaque_p("obj", "")
    )

    void(
        "ManifoldPoint_getLocalPointA",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "ManifoldPoint_getLocalPointB",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "ManifoldPoint_getNormalWorldOnB",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    int(
        "ManifoldPoint_getPartId0",
        "",

        opaque_p("obj", "")
    )

    int(
        "ManifoldPoint_getPartId1",
        "",

        opaque_p("obj", "")
    )

    void(
        "ManifoldPoint_getPositionWorldOnA",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "ManifoldPoint_getPositionWorldOnB",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    opaque_p(
        "ManifoldPoint_getUserPersistentData",
        "",

        opaque_p("obj", "")
    )

    void(
        "ManifoldPoint_setAppliedImpulse",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ManifoldPoint_setAppliedImpulseLateral1",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ManifoldPoint_setAppliedImpulseLateral2",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ManifoldPoint_setCombinedContactDamping1",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ManifoldPoint_setCombinedContactStiffness1",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ManifoldPoint_setCombinedFriction",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ManifoldPoint_setCombinedRestitution",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ManifoldPoint_setCombinedRollingFriction",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ManifoldPoint_setContactCFM",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ManifoldPoint_setContactERP",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ManifoldPoint_setContactMotion1",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ManifoldPoint_setContactMotion2",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ManifoldPoint_setContactPointFlags",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "ManifoldPoint_setDistance",
        "",

        opaque_p("obj", ""),
        btScalar("dist", "")
    )

    void(
        "ManifoldPoint_setDistance1",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ManifoldPoint_setFrictionCFM",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "ManifoldPoint_setIndex0",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "ManifoldPoint_setIndex1",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "ManifoldPoint_setLateralFrictionDir1",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "ManifoldPoint_setLateralFrictionDir2",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "ManifoldPoint_setLifeTime",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "ManifoldPoint_setLocalPointA",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "ManifoldPoint_setLocalPointB",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "ManifoldPoint_setNormalWorldOnB",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "ManifoldPoint_setPartId0",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "ManifoldPoint_setPartId1",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "ManifoldPoint_setPositionWorldOnA",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "ManifoldPoint_setPositionWorldOnB",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "ManifoldPoint_setUserPersistentData",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "ManifoldPoint_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "getGContactAddedCallback",
        "",

        void()
    )

    void(
        "setGContactAddedCallback",
        "",

        opaque_p("value", "")
    )

}