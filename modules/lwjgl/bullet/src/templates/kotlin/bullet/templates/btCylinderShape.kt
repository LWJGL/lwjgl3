/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btCylinderShape = "BTCylinderShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "CylinderShape_new",
        "",

        btVector3.const.p("halfExtents", "")
    )

    opaque_p(
        "CylinderShape_new2",
        "",

        btScalar("halfExtentX", ""),
        btScalar("halfExtentY", ""),
        btScalar("halfExtentZ", "")
    )

    void(
        "CylinderShape_getHalfExtentsWithMargin",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "CylinderShape_getHalfExtentsWithoutMargin",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "CylinderShape_getRadius",
        "",

        opaque_p("obj", "")
    )

    int(
        "CylinderShape_getUpAxis",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CylinderShapeX_new",
        "",

        btVector3.const.p("halfExtents", "")
    )

    opaque_p(
        "CylinderShapeX_new2",
        "",

        btScalar("halfExtentX", ""),
        btScalar("halfExtentY", ""),
        btScalar("halfExtentZ", "")
    )

    opaque_p(
        "CylinderShapeZ_new",
        "",

        btVector3.const.p("halfExtents", "")
    )

    opaque_p(
        "CylinderShapeZ_new2",
        "",

        btScalar("halfExtentX", ""),
        btScalar("halfExtentY", ""),
        btScalar("halfExtentZ", "")
    )

}