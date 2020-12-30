/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btUnionFind = "BTUnionFind".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "Element_new",
        "",

        void()
    )

    int(
        "Element_getId",
        "",

        opaque_p("obj", "")
    )

    int(
        "Element_getSz",
        "",

        opaque_p("obj", "")
    )

    void(
        "Element_setId",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "Element_setSz",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "Element_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "UnionFind_new",
        "",

        void()
    )

    void(
        "UnionFind_allocate",
        "",

        opaque_p("obj", ""),
        int("N", "")
    )

    int(
        "UnionFind_find",
        "",

        opaque_p("obj", ""),
        int("p", ""),
        int("q", "")
    )

    int(
        "UnionFind_find2",
        "",

        opaque_p("obj", ""),
        int("x", "")
    )

    void(
        "UnionFind_Free",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "UnionFind_getElement",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    int(
        "UnionFind_getNumElements",
        "",

        opaque_p("obj", "")
    )

    bool(
        "UnionFind_isRoot",
        "",

        opaque_p("obj", ""),
        int("x", "")
    )

    void(
        "UnionFind_reset",
        "",

        opaque_p("obj", ""),
        int("N", "")
    )

    void(
        "UnionFind_sortIslands",
        "",

        opaque_p("obj", "")
    )

    void(
        "UnionFind_unite",
        "",

        opaque_p("obj", ""),
        int("p", ""),
        int("q", "")
    )

    void(
        "UnionFind_delete",
        "",

        opaque_p("obj", "")
    )

}