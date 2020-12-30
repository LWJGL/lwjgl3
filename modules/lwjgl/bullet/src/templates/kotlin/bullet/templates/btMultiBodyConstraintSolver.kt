/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btMultiBodyConstraintSolver = "BTMultiBodyConstraintSolver".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "MultiBodyConstraintSolver_new",
        "",

        void()
    )

    btScalar(
        "MultiBodyConstraintSolver_solveGroupCacheFriendlyFinish",
        "",

        opaque_p("obj", ""),
        opaque_p.p("bodies", ""),
        AutoSize("bodies")..int("numBodies", ""),
        opaque_p("infoGlobal", "")
    )

    void(
        "MultiBodyConstraintSolver_solveMultiBodyGroup",
        "",

        opaque_p("obj", ""),
        opaque_p.p("bodies", ""),
        AutoSize("bodies")..int("numBodies", ""),
        opaque_p.p("manifold", ""),
        AutoSize("manifold")..int("numManifolds", ""),
        opaque_p.p("constraints", ""),
        AutoSize("constraints")..int("numConstraints", ""),
        opaque_p.p("multiBodyConstraints", ""),
        AutoSize("multiBodyConstraints")..int("numMultiBodyConstraints", ""),
        opaque_p("info", ""),
        opaque_p("debugDrawer", ""),
        opaque_p("dispatcher", "")
    )

}