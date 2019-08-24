/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val ActionInterface = "BTActionInterface".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    btActionInterfaceWrapper.p(
        "ActionInterfaceWrapper_new",
        "",

        p_btActionInterface_debugDraw("debugDrawCallback", ""),
        p_btActionInterface_updateAction("updateActionCallback", "")
    )

    void(
        "ActionInterface_debugDraw",
        "",

        btActionInterface.p("obj", ""),
        btIDebugDraw.p("debugDrawer", "")
    )

    void(
        "ActionInterface_updateAction",
        "",

        btActionInterface.p("obj", ""),
        btCollisionWorld.p("collisionWorld", ""),
        btScalar("deltaTimeStep", "")
    )

    void(
        "ActionInterface_delete",
        "",

        btActionInterface.p("obj", "")
    )
}