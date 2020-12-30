/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btConstraintSolver = "BTConstraintSolver".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    void(
        "ConstraintSolver_allSolved",
        "",

        opaque_p("obj", ""),
        opaque_p("__unnamed0", ""),
        opaque_p("__unnamed1", "")
    )

    int(
        "ConstraintSolver_getSolverType",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConstraintSolver_prepareSolve",
        "",

        opaque_p("obj", ""),
        int("__unnamed0", ""),
        int("__unnamed1", "")
    )

    void(
        "ConstraintSolver_reset",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "ConstraintSolver_solveGroup",
        "",

        opaque_p("obj", ""),
        opaque_p.p("bodies", ""),
        AutoSize("bodies")..int("numBodies", ""),
        opaque_p.p("manifold", ""),
        AutoSize("manifold")..int("numManifolds", ""),
        opaque_p.p("constraints", ""),
        AutoSize("constraints")..int("numConstraints", ""),
        opaque_p("info", ""),
        opaque_p("debugDrawer", ""),
        opaque_p("dispatcher", "")
    )

    void(
        "ConstraintSolver_delete",
        "",

        opaque_p("obj", "")
    )

}