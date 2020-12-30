/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btPolarDecomposition = "BTPolarDecomposition".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "PolarDecomposition_new",
        "",

        btScalar("tolerance", ""),
        unsigned_int("maxIterations", "")
    )

    unsigned_int(
        "PolarDecomposition_decompose",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.const.p("a", ""),
        btMatrix3x3.p("u", ""),
        btMatrix3x3.p("h", "")
    )

    unsigned_int(
        "PolarDecomposition_maxIterations",
        "",

        opaque_p("obj", "")
    )

    void(
        "PolarDecomposition_delete",
        "",

        opaque_p("obj", "")
    )

}