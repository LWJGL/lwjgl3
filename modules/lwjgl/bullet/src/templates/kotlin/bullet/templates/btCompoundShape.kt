/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btCompoundShape = "BTCompoundShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    btScalar(
        "CompoundShapeChild_getChildMargin",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CompoundShapeChild_getChildShape",
        "",

        opaque_p("obj", "")
    )

    int(
        "CompoundShapeChild_getChildShapeType",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CompoundShapeChild_getNode",
        "",

        opaque_p("obj", "")
    )

    void(
        "CompoundShapeChild_getTransform",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "CompoundShapeChild_setChildMargin",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "CompoundShapeChild_setChildShape",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "CompoundShapeChild_setChildShapeType",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "CompoundShapeChild_setNode",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "CompoundShapeChild_setTransform",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("value", "")
    )

    void(
        "CompoundShapeChild_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CompoundShape_new",
        "",

        bool("enableDynamicAabbTree", ""),
        int("initialChildCapacity", "")
    )

    void(
        "CompoundShape_addChildShape",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("localTransform", ""),
        opaque_p("shape", "")
    )

    void(
        "CompoundShape_calculatePrincipalAxisTransform",
        "",

        opaque_p("obj", ""),
        Unsafe..btScalar.p("masses", ""),
        btTransform.p("principal", ""),
        btVector3.p("inertia", "")
    )

    void(
        "CompoundShape_createAabbTreeFromChildren",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CompoundShape_getChildList",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CompoundShape_getChildShape",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    void(
        "CompoundShape_getChildTransform",
        "",

        opaque_p("obj", ""),
        int("index", ""),
        btTransform.p("value", "")
    )

    opaque_p(
        "CompoundShape_getDynamicAabbTree",
        "",

        opaque_p("obj", "")
    )

    int(
        "CompoundShape_getNumChildShapes",
        "",

        opaque_p("obj", "")
    )

    int(
        "CompoundShape_getUpdateRevision",
        "",

        opaque_p("obj", "")
    )

    void(
        "CompoundShape_recalculateLocalAabb",
        "",

        opaque_p("obj", "")
    )

    void(
        "CompoundShape_removeChildShape",
        "",

        opaque_p("obj", ""),
        opaque_p("shape", "")
    )

    void(
        "CompoundShape_removeChildShapeByIndex",
        "",

        opaque_p("obj", ""),
        int("childShapeindex", "")
    )

    void(
        "CompoundShape_updateChildTransform",
        "",

        opaque_p("obj", ""),
        int("childIndex", ""),
        btTransform.const.p("newChildTransform", ""),
        bool("shouldRecalculateLocalAabb", "")
    )

}