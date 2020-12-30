/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btCompoundFromGimpact = "BTCompoundFromGimpact".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "CompoundFromGImpact_btCreateCompoundFromGimpactShape",
        "",

        opaque_p("gimpactMesh", ""),
        btScalar("depth", "")
    )

}