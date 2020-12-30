/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btSoftRigidDynamicsWorld = "BTSoftRigidDynamicsWorld".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "SoftRigidDynamicsWorld_new",
        "",

        opaque_p("dispatcher", ""),
        opaque_p("pairCache", ""),
        opaque_p("constraintSolver", ""),
        opaque_p("collisionConfiguration", ""),
        opaque_p("softBodySolver", "")
    )

    void(
        "SoftRigidDynamicsWorld_addSoftBody",
        "",

        opaque_p("obj", ""),
        opaque_p("body", "")
    )

    void(
        "SoftRigidDynamicsWorld_addSoftBody2",
        "",

        opaque_p("obj", ""),
        opaque_p("body", ""),
        int("collisionFilterGroup", "")
    )

    void(
        "SoftRigidDynamicsWorld_addSoftBody3",
        "",

        opaque_p("obj", ""),
        opaque_p("body", ""),
        int("collisionFilterGroup", ""),
        int("collisionFilterMask", "")
    )

    int(
        "SoftRigidDynamicsWorld_getDrawFlags",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftRigidDynamicsWorld_getSoftBodyArray",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftRigidDynamicsWorld_getWorldInfo",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftRigidDynamicsWorld_removeSoftBody",
        "",

        opaque_p("obj", ""),
        opaque_p("body", "")
    )

    void(
        "SoftRigidDynamicsWorld_setDrawFlags",
        "",

        opaque_p("obj", ""),
        int("f", "")
    )

}