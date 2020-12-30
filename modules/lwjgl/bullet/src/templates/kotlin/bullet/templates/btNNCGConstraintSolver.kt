/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btNNCGConstraintSolver = "BTNNCGConstraintSolver".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "NNCGConstraintSolver_new",
        "",

        void()
    )

    bool(
        "NNCGConstraintSolver_getOnlyForNoneContact",
        "",

        opaque_p("obj", "")
    )

    void(
        "NNCGConstraintSolver_setOnlyForNoneContact",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

}