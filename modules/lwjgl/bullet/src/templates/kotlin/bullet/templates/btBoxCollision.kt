/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btBoxCollision = "BTBoxCollision".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "BT_BOX_BOX_TRANSFORM_CACHE_new",
        "",

        void()
    )

    void(
        "BT_BOX_BOX_TRANSFORM_CACHE_calc_absolute_matrix",
        "",

        opaque_p("obj", "")
    )

    void(
        "BT_BOX_BOX_TRANSFORM_CACHE_calc_from_full_invert",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("trans0", ""),
        btTransform.const.p("trans1", "")
    )

    void(
        "BT_BOX_BOX_TRANSFORM_CACHE_calc_from_homogenic",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("trans0", ""),
        btTransform.const.p("trans1", "")
    )

    void(
        "BT_BOX_BOX_TRANSFORM_CACHE_getAR",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.p("value", "")
    )

    void(
        "BT_BOX_BOX_TRANSFORM_CACHE_getR1to0",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.p("value", "")
    )

    void(
        "BT_BOX_BOX_TRANSFORM_CACHE_getT1to0",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "BT_BOX_BOX_TRANSFORM_CACHE_setAR",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.const.p("value", "")
    )

    void(
        "BT_BOX_BOX_TRANSFORM_CACHE_setR1to0",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.const.p("value", "")
    )

    void(
        "BT_BOX_BOX_TRANSFORM_CACHE_setT1to0",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "BT_BOX_BOX_TRANSFORM_CACHE_transform",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("point", ""),
        btVector3.p("value", "")
    )

    void(
        "BT_BOX_BOX_TRANSFORM_CACHE_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "AABB_new",
        "",

        void()
    )

    opaque_p(
        "AABB_new2",
        "",

        btVector3.const.p("V1", ""),
        btVector3.const.p("V2", ""),
        btVector3.const.p("V3", "")
    )

    opaque_p(
        "AABB_new3",
        "",

        btVector3.const.p("V1", ""),
        btVector3.const.p("V2", ""),
        btVector3.const.p("V3", ""),
        btScalar("margin", "")
    )

    opaque_p(
        "AABB_new4",
        "",

        opaque_p("other", "")
    )

    opaque_p(
        "AABB_new5",
        "",

        opaque_p("other", ""),
        btScalar("margin", "")
    )

    void(
        "AABB_appy_transform",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("trans", "")
    )

    void(
        "AABB_appy_transform_trans_cache",
        "",

        opaque_p("obj", ""),
        opaque_p("trans", "")
    )

    bool(
        "AABB_collide_plane",
        "",

        opaque_p("obj", ""),
        btVector4.const.p("plane", "")
    )

    bool(
        "AABB_collide_ray",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("vorigin", ""),
        btVector3.const.p("vdir", "")
    )

    bool(
        "AABB_collide_triangle_exact",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("p1", ""),
        btVector3.const.p("p2", ""),
        btVector3.const.p("p3", ""),
        btVector4.const.p("triangle_plane", "")
    )

    void(
        "AABB_copy_with_margin",
        "",

        opaque_p("obj", ""),
        opaque_p("other", ""),
        btScalar("margin", "")
    )

    void(
        "AABB_find_intersection",
        "",

        opaque_p("obj", ""),
        opaque_p("other", ""),
        opaque_p("intersection", "")
    )

    void(
        "AABB_get_center_extend",
        "",

        opaque_p("obj", ""),
        btVector3.p("center", ""),
        btVector3.p("extend", "")
    )

    void(
        "AABB_getMax",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "AABB_getMin",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    bool(
        "AABB_has_collision",
        "",

        opaque_p("obj", ""),
        opaque_p("other", "")
    )

    void(
        "AABB_increment_margin",
        "",

        opaque_p("obj", ""),
        btScalar("margin", "")
    )

    void(
        "AABB_invalidate",
        "",

        opaque_p("obj", "")
    )

    void(
        "AABB_merge",
        "",

        opaque_p("obj", ""),
        opaque_p("box", "")
    )

    bool(
        "AABB_overlapping_trans_cache",
        "",

        opaque_p("obj", ""),
        opaque_p("box", ""),
        opaque_p("transcache", ""),
        bool("fulltest", "")
    )

    bool(
        "AABB_overlapping_trans_conservative",
        "",

        opaque_p("obj", ""),
        opaque_p("box", ""),
        btTransform.p("trans1_to_0", "")
    )

    bool(
        "AABB_overlapping_trans_conservative2",
        "",

        opaque_p("obj", ""),
        opaque_p("box", ""),
        opaque_p("trans1_to_0", "")
    )

    int(
        "AABB_plane_classify",
        "",

        opaque_p("obj", ""),
        btVector4.const.p("plane", "")
    )

    void(
        "AABB_projection_interval",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("direction", ""),
        Check(1)..btScalar.p("vmin", ""),
        Check(1)..btScalar.p("vmax", "")
    )

    void(
        "AABB_setMax",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "AABB_setMin",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "AABB_delete",
        "",

        opaque_p("obj", "")
    )

}