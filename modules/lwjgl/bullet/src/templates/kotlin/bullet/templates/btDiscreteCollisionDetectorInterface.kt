/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btDiscreteCollisionDetectorInterface = "BTDiscreteCollisionDetectorInterface".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "DiscreteCollisionDetectorInterface_ClosestPointInput_new",
        "",

        void()
    )

    btScalar(
        "DiscreteCollisionDetectorInterface_ClosestPointInput_getMaximumDistanceSquared",
        "",

        opaque_p("obj", "")
    )

    void(
        "DiscreteCollisionDetectorInterface_ClosestPointInput_getTransformA",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "DiscreteCollisionDetectorInterface_ClosestPointInput_getTransformB",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "DiscreteCollisionDetectorInterface_ClosestPointInput_setMaximumDistanceSquared",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "DiscreteCollisionDetectorInterface_ClosestPointInput_setTransformA",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("value", "")
    )

    void(
        "DiscreteCollisionDetectorInterface_ClosestPointInput_setTransformB",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("value", "")
    )

    void(
        "DiscreteCollisionDetectorInterface_ClosestPointInput_delete",
        "",

        opaque_p("obj", "")
    )

    void(
        "DiscreteCollisionDetectorInterface_Result_addContactPoint",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("normalOnBInWorld", ""),
        btVector3.const.p("pointInWorld", ""),
        btScalar("depth", "")
    )

    void(
        "DiscreteCollisionDetectorInterface_Result_setShapeIdentifiersA",
        "",

        opaque_p("obj", ""),
        int("partId0", ""),
        int("index0", "")
    )

    void(
        "DiscreteCollisionDetectorInterface_Result_setShapeIdentifiersB",
        "",

        opaque_p("obj", ""),
        int("partId1", ""),
        int("index1", "")
    )

    void(
        "DiscreteCollisionDetectorInterface_Result_delete",
        "",

        opaque_p("obj", "")
    )

    void(
        "DiscreteCollisionDetectorInterface_getClosestPoints",
        "",

        opaque_p("obj", ""),
        opaque_p("input", ""),
        opaque_p("output", ""),
        opaque_p("debugDraw", ""),
        bool("swapResults", "")
    )

    void(
        "DiscreteCollisionDetectorInterface_delete",
        "",

        opaque_p("obj", "")
    )

    void(
        "StorageResult_getClosestPointInB",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "StorageResult_getDistance",
        "",

        opaque_p("obj", "")
    )

    void(
        "StorageResult_getNormalOnSurfaceB",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "StorageResult_setClosestPointInB",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "StorageResult_setDistance",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "StorageResult_setNormalOnSurfaceB",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

}