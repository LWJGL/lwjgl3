/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet

import org.lwjgl.generator.*

val BULLET_BINDING = simpleBinding(
    Module.BULLET,
    libraryExpression = """Configuration.BULLET_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("bulletc"))""",
    bundledWithLWJGL = true
)
val BULLET_BINDING_DELEGATE = BULLET_BINDING.delegate("LibBullet.getLibrary()")

val btScalar = typedef(float, "btScalar")

val btVector3 = struct(Module.BULLET, "BTVector3", nativeName = "btVector3") {
    documentation = ""

    btScalar("m_floats", "")[4]
}
val btVector4 = typedef(btVector3, "btVector4")
val btQuaternion = typedef(btVector3, "btQuaternion")

val btMatrix3x3 = struct(Module.BULLET, "BTMatrix3x3", nativeName = "btMatrix3x3") {
    documentation = ""

    btVector3("m_el", "")[3]
}

val btTransform = struct(Module.BULLET, "BTTransform", nativeName = "btTransform") {
    documentation = ""

    btMatrix3x3("m_basis", "")
    btVector3("m_origin", "")
}

val p_btCollisionWorld_ConvexResultCallback_addSingleResult = Module.BULLET.callback {
    btScalar(
        "BTCollisionWorldConvexResultCallbackAddSingleResult",
        "",

        opaque_p("convexResult", ""),
        bool("normalInWorldSpace", ""),

        nativeType = "p_btCollisionWorld_ConvexResultCallback_addSingleResult"
    )
}

val p_btCollisionWorld_ConvexResultCallback_needsCollision = Module.BULLET.callback {
    bool(
        "BTCollisionWorldConvexResultCallbackNeedsCollision",
        "",

        opaque_p("proxy0", ""),

        nativeType = "p_btCollisionWorld_ConvexResultCallback_needsCollision"
    )
}

// TODO:
val btIDebugDraw = "btIDebugDraw".opaque
val btCollisionWorld = "btCollisionWorld".opaque

// btActionInterface types
val btActionInterfaceWrapper = "btActionInterfaceWrapper".opaque
val btActionInterface = "btActionInterface".opaque
val p_btActionInterface_debugDraw = Module.BULLET.callback {
    void(
        "BTActionInterfaceDebugDraw",
        "",

        btIDebugDraw.p("debugDrawer", ""),
        nativeType = "p_btActionInterface_debugDraw"
    )
}
val p_btActionInterface_updateAction = Module.BULLET.callback {
    void(
        "BTActionInterfaceUpdateAction",
        "",

        btCollisionWorld.p("collisionWorld", ""),
        nativeType = "p_btActionInterface_updateAction"
    )
}

// HACD Types
val HACD_HACD = "HACD_HACD".opaque
val HACD_Vec3_Real = struct(Module.BULLET, "HACDVec3Real", nativeName = "HACD_Vec3_Real") {
    opaque_p("__VTABLE", "").virtual()
    double("m_data", "")[3]
}
val HACD_Vec3_long = struct(Module.BULLET, "HACDVec3Long", nativeName = "HACD_Vec3_long") {
    opaque_p("__VTABLE", "").virtual()
    long("m_data", "")[3]
}
val HACD_CallBackFunction = Module.BULLET.callback {
    bool(
        "HACDCallBackFunction",
        "",

        char.const.p("msg", ""),
        double("progress", ""),
        double("globalConcavity", ""),
        size_t("vertices", ""),

        nativeType = "HACD_CallBackFunction"
    )
}