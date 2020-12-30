/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btConvexInternalShape = "BTConvexInternalShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    void(
        "ConvexInternalShape_getImplicitShapeDimensions",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "ConvexInternalShape_getLocalScalingNV",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "ConvexInternalShape_getMarginNV",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConvexInternalShape_setImplicitShapeDimensions",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("dimensions", "")
    )

    void(
        "ConvexInternalShape_setSafeMargin",
        "",

        opaque_p("obj", ""),
        btScalar("minDimension", ""),
        btScalar("defaultMarginMultiplier", "")
    )

    void(
        "ConvexInternalShape_setSafeMargin2",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("halfExtents", ""),
        btScalar("defaultMarginMultiplier", "")
    )

    void(
        "ConvexInternalAabbCachingShape_recalcLocalAabb",
        "",

        opaque_p("obj", "")
    )

}