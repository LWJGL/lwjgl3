/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btMLCPSolver = "BTMLCPSolver".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "MLCPSolver_new",
        "",

        opaque_p("solver", "")
    )

    int(
        "MLCPSolver_getNumFallbacks",
        "",

        opaque_p("obj", "")
    )

    void(
        "MLCPSolver_setMLCPSolver",
        "",

        opaque_p("obj", ""),
        opaque_p("solver", "")
    )

    void(
        "MLCPSolver_setNumFallbacks",
        "",

        opaque_p("obj", ""),
        int("num", "")
    )

}