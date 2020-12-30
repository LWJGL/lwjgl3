/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btSparseSdf3 = "BTSparseSdf3".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "SparseSdf_new",
        "",

        void()
    )

    void(
        "SparseSdf3_GarbageCollect",
        "",

        opaque_p("obj", ""),
        int("lifetime", "")
    )

    void(
        "SparseSdf3_Initialize",
        "",

        opaque_p("obj", ""),
        int("hashsize", ""),
        int("clampCells", "")
    )

    int(
        "SparseSdf3_RemoveReferences",
        "",

        opaque_p("obj", ""),
        opaque_p("pcs", "")
    )

    void(
        "SparseSdf3_Reset",
        "",

        opaque_p("obj", "")
    )

    void(
        "SparseSdf_delete",
        "",

        opaque_p("obj", "")
    )

}