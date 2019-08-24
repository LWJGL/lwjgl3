/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btConvexTriangleMeshShape = "BTConvexTriangleMeshShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "ConvexTriangleMeshShape_new",
        "",

        opaque_p("meshInterface", ""),
        bool("calcAabb", "")
    )

    void(
        "ConvexTriangleMeshShape_calculatePrincipalAxisTransform",
        "",

        opaque_p("obj", ""),
        btTransform.p("principal", ""),
        btVector3.p("inertia", ""),
        Check(1)..btScalar.p("volume", "")
    )

    opaque_p(
        "ConvexTriangleMeshShape_getMeshInterface",
        "",

        opaque_p("obj", "")
    )

}