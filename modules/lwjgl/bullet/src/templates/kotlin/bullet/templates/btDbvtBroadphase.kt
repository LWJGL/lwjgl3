/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btDbvtBroadphase = "BTDbvtBroadphase".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "DbvtProxy_getLeaf",
        "",

        opaque_p("obj", "")
    )

    opaque_p[2](
        "DbvtProxy_getLinks",
        "",

        opaque_p("obj", "")
    )

    int(
        "DbvtProxy_getStage",
        "",

        opaque_p("obj", "")
    )

    void(
        "DbvtProxy_setLeaf",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "DbvtProxy_setStage",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    opaque_p(
        "DbvtBroadphase_new",
        "",

        nullable..opaque_p("paircache", "")
    )

    void(
        "DbvtBroadphase_benchmark",
        "",

        opaque_p("__unnamed0", "")
    )

    void(
        "DbvtBroadphase_collide",
        "",

        opaque_p("obj", ""),
        opaque_p("dispatcher", "")
    )

    int(
        "DbvtBroadphase_getCid",
        "",

        opaque_p("obj", "")
    )

    int(
        "DbvtBroadphase_getCupdates",
        "",

        opaque_p("obj", "")
    )

    bool(
        "DbvtBroadphase_getDeferedcollide",
        "",

        opaque_p("obj", "")
    )

    int(
        "DbvtBroadphase_getDupdates",
        "",

        opaque_p("obj", "")
    )

    int(
        "DbvtBroadphase_getFixedleft",
        "",

        opaque_p("obj", "")
    )

    int(
        "DbvtBroadphase_getFupdates",
        "",

        opaque_p("obj", "")
    )

    int(
        "DbvtBroadphase_getGid",
        "",

        opaque_p("obj", "")
    )

    bool(
        "DbvtBroadphase_getNeedcleanup",
        "",

        opaque_p("obj", "")
    )

    int(
        "DbvtBroadphase_getNewpairs",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "DbvtBroadphase_getPaircache",
        "",

        opaque_p("obj", "")
    )

    int(
        "DbvtBroadphase_getPid",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "DbvtBroadphase_getPrediction",
        "",

        opaque_p("obj", "")
    )

    bool(
        "DbvtBroadphase_getReleasepaircache",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "DbvtBroadphase_getSets",
        "",

        opaque_p("obj", "")
    )

    int(
        "DbvtBroadphase_getStageCurrent",
        "",

        opaque_p("obj", "")
    )

    opaque_p[3](
        "DbvtBroadphase_getStageRoots",
        "",

        opaque_p("obj", "")
    )

    unsigned_int(
        "DbvtBroadphase_getUpdates_call",
        "",

        opaque_p("obj", "")
    )

    unsigned_int(
        "DbvtBroadphase_getUpdates_done",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "DbvtBroadphase_getUpdates_ratio",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "DbvtBroadphase_getVelocityPrediction",
        "",

        opaque_p("obj", "")
    )

    void(
        "DbvtBroadphase_optimize",
        "",

        opaque_p("obj", "")
    )

    void(
        "DbvtBroadphase_performDeferredRemoval",
        "",

        opaque_p("obj", ""),
        opaque_p("dispatcher", "")
    )

    void(
        "DbvtBroadphase_setAabbForceUpdate",
        "",

        opaque_p("obj", ""),
        opaque_p("absproxy", ""),
        btVector3.const.p("aabbMin", ""),
        btVector3.const.p("aabbMax", ""),
        opaque_p("__unnamed3", "")
    )

    void(
        "DbvtBroadphase_setCid",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "DbvtBroadphase_setCupdates",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "DbvtBroadphase_setDeferedcollide",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "DbvtBroadphase_setDupdates",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "DbvtBroadphase_setFixedleft",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "DbvtBroadphase_setFupdates",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "DbvtBroadphase_setGid",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "DbvtBroadphase_setNeedcleanup",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "DbvtBroadphase_setNewpairs",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "DbvtBroadphase_setPaircache",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "DbvtBroadphase_setPid",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "DbvtBroadphase_setPrediction",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "DbvtBroadphase_setReleasepaircache",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "DbvtBroadphase_setStageCurrent",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "DbvtBroadphase_setUpdates_call",
        "",

        opaque_p("obj", ""),
        unsigned_int("value", "")
    )

    void(
        "DbvtBroadphase_setUpdates_done",
        "",

        opaque_p("obj", ""),
        unsigned_int("value", "")
    )

    void(
        "DbvtBroadphase_setUpdates_ratio",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "DbvtBroadphase_setVelocityPrediction",
        "",

        opaque_p("obj", ""),
        btScalar("prediction", "")
    )

}