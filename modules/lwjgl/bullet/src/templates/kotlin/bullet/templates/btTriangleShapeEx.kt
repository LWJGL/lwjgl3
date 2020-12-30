/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btTriangleShapeEx = "BTTriangleShapeEx".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "GIM_TRIANGLE_CONTACT_new",
        "",

        void()
    )

    opaque_p(
        "GIM_TRIANGLE_CONTACT_new2",
        "",

        opaque_p("other", "")
    )

    void(
        "GIM_TRIANGLE_CONTACT_copy_from",
        "",

        opaque_p("obj", ""),
        opaque_p("other", "")
    )

    btScalar(
        "GIM_TRIANGLE_CONTACT_getPenetration_depth",
        "",

        opaque_p("obj", "")
    )

    int(
        "GIM_TRIANGLE_CONTACT_getPoint_count",
        "",

        opaque_p("obj", "")
    )

    btVector3.p(
        "GIM_TRIANGLE_CONTACT_getPoints",
        "",

        opaque_p("obj", "")
    )

    void(
        "GIM_TRIANGLE_CONTACT_getSeparating_normal",
        "",

        opaque_p("obj", ""),
        btVector4.p("value", "")
    )

    void(
        "GIM_TRIANGLE_CONTACT_merge_points",
        "",

        opaque_p("obj", ""),
        btVector4.const.p("plane", ""),
        btScalar("margin", ""),
        btVector3.const.p("points", ""),
        int("point_count", "")
    )

    void(
        "GIM_TRIANGLE_CONTACT_setPenetration_depth",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "GIM_TRIANGLE_CONTACT_setPoint_count",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "GIM_TRIANGLE_CONTACT_setSeparating_normal",
        "",

        opaque_p("obj", ""),
        btVector4.const.p("value", "")
    )

    void(
        "GIM_TRIANGLE_CONTACT_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "PrimitiveTriangle_new",
        "",

        void()
    )

    void(
        "PrimitiveTriangle_applyTransform",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("t", "")
    )

    void(
        "PrimitiveTriangle_buildTriPlane",
        "",

        opaque_p("obj", "")
    )

    int(
        "PrimitiveTriangle_clip_triangle",
        "",

        opaque_p("obj", ""),
        opaque_p("other", ""),
        btVector3.p("clipped_points", "")
    )

    bool(
        "PrimitiveTriangle_find_triangle_collision_clip_method",
        "",

        opaque_p("obj", ""),
        opaque_p("other", ""),
        opaque_p("contacts", "")
    )

    void(
        "PrimitiveTriangle_get_edge_plane",
        "",

        opaque_p("obj", ""),
        int("edge_index", ""),
        btVector4.p("plane", "")
    )

    btScalar(
        "PrimitiveTriangle_getDummy",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "PrimitiveTriangle_getMargin",
        "",

        opaque_p("obj", "")
    )

    void(
        "PrimitiveTriangle_getPlane",
        "",

        opaque_p("obj", ""),
        btVector4.p("value", "")
    )

    btVector3.p(
        "PrimitiveTriangle_getVertices",
        "",

        opaque_p("obj", "")
    )

    bool(
        "PrimitiveTriangle_overlap_test_conservative",
        "",

        opaque_p("obj", ""),
        opaque_p("other", "")
    )

    void(
        "PrimitiveTriangle_setDummy",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "PrimitiveTriangle_setMargin",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "PrimitiveTriangle_setPlane",
        "",

        opaque_p("obj", ""),
        btVector4.const.p("value", "")
    )

    void(
        "PrimitiveTriangle_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "TriangleShapeEx_new",
        "",

        void()
    )

    opaque_p(
        "TriangleShapeEx_new2",
        "",

        btVector3.const.p("p0", ""),
        btVector3.const.p("p1", ""),
        btVector3.const.p("p2", "")
    )

    opaque_p(
        "TriangleShapeEx_new3",
        "",

        opaque_p("other", "")
    )

    void(
        "TriangleShapeEx_applyTransform",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("t", "")
    )

    void(
        "TriangleShapeEx_buildTriPlane",
        "",

        opaque_p("obj", ""),
        btVector4.p("plane", "")
    )

    bool(
        "TriangleShapeEx_overlap_test_conservative",
        "",

        opaque_p("obj", ""),
        opaque_p("other", "")
    )

}