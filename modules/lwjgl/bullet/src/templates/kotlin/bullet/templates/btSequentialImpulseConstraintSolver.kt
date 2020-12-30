/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btSequentialImpulseConstraintSolver = "BTSequentialImpulseConstraintSolver".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
	opaque_p(
        "SequentialImpulseConstraintSolver_new",
        "",

        void()
    )

    unsigned_long(
        "SequentialImpulseConstraintSolver_btRand2",
        "",

        opaque_p("obj", "")
    )

    int(
        "SequentialImpulseConstraintSolver_btRandInt2",
        "",

        opaque_p("obj", ""),
        int("n", "")
    )

    unsigned_long(
        "SequentialImpulseConstraintSolver_getRandSeed",
        "",

        opaque_p("obj", "")
    )

    void(
        "SequentialImpulseConstraintSolver_setRandSeed",
        "",

        opaque_p("obj", ""),
        unsigned_long("seed", "")
    )

}