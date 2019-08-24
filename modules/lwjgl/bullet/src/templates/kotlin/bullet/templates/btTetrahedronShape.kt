/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btTetrahedronShape = "BTTetrahedronShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "BU_Simplex1to4_new",
        "",

        void()
    )

    opaque_p(
        "BU_Simplex1to4_new2",
        "",

        btVector3.const.p("pt0", "")
    )

    opaque_p(
        "BU_Simplex1to4_new3",
        "",

        btVector3.const.p("pt0", ""),
        btVector3.const.p("pt1", "")
    )

    opaque_p(
        "BU_Simplex1to4_new4",
        "",

        btVector3.const.p("pt0", ""),
        btVector3.const.p("pt1", ""),
        btVector3.const.p("pt2", "")
    )

    opaque_p(
        "BU_Simplex1to4_new5",
        "",

        btVector3.const.p("pt0", ""),
        btVector3.const.p("pt1", ""),
        btVector3.const.p("pt2", ""),
        btVector3.const.p("pt3", "")
    )

    void(
        "BU_Simplex1to4_addVertex",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("pt", "")
    )

    int(
        "BU_Simplex1to4_getIndex",
        "",

        opaque_p("obj", ""),
        int("i", "")
    )

    void(
        "BU_Simplex1to4_reset",
        "",

        opaque_p("obj", "")
    )

}