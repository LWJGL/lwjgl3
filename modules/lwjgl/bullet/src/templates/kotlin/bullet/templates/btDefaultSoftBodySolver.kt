/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btDefaultSoftBodySolver = "BTDefaultSoftBodySolver".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "DefaultSoftBodySolver_new",
        "",

        void()
    )

    void(
        "DefaultSoftBodySolver_copySoftBodyToVertexBuffer",
        "",

        opaque_p("obj", ""),
        opaque_p("softBody", ""),
        opaque_p("vertexBuffer", "")
    )

}