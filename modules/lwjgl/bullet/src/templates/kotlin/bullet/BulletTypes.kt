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

val btInternalTickCallback = Module.BULLET.callback {
    void(
        "BTInternalTickCallback",
        "",

        opaque_p("world", ""),
        btScalar("timeStep", ""),

        nativeType = "btInternalTickCallback"
    )
}


val p_btCollisionWorld_ContactResultCallback_addSingleResult = Module.BULLET.callback {
    btScalar(
        "BTCollisionWorldContactResultCallbackAddSingleResult",
        "",

        opaque_p("cp", ""),
        opaque_p("colObj0Wrap", ""),
        int("partId0", ""),
        int("index0", ""),
        opaque_p("colObj1Wrap", ""),
        int("partId1", ""),
        int("index1", ""),

        nativeType = "p_btCollisionWorld_ContactResultCallback_addSingleResult"
    )
}
val p_btCollisionWorld_ContactResultCallback_needsCollision = Module.BULLET.callback {
    bool(
        "BTCollisionWorldContactResultCallbackNeedsCollision",
        "",

        opaque_p("proxy0", ""),

        nativeType = "p_btCollisionWorld_ContactResultCallback_needsCollision"
    )
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
val p_btCollisionWorld_RayResultCallback_addSingleResult = Module.BULLET.callback {
    btScalar(
        "BTCollisionWorldRayResultCallbackAddSingleResult",
        "",

        opaque_p("rayResult", ""),
        bool("normalInWorldSpace", ""),

        nativeType = "p_btCollisionWorld_RayResultCallback_addSingleResult"
    )
}
val p_btCollisionWorld_RayResultCallback_needsCollision = Module.BULLET.callback {
    bool(
        "BTCollisionWorldRayResultCallbackNeedsCollision",
        "",

        opaque_p("proxy0", ""),

        nativeType = "p_btCollisionWorld_RayResultCallback_needsCollision"
    )
}


val ContactAddedCallback = Module.BULLET.callback {
    bool(
        "BTContactAddedCallback",
        "",

        opaque_p("cp", ""),
        opaque_p("colObj0Wrap", ""),
        int("partId0", ""),
        int("index0", ""),
        opaque_p("colObj1Wrap", ""),
        int("partId1", ""),
        int("index1", ""),

        nativeType = "ContactAddedCallback"
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
        btScalar("deltaTimeStep", ""),
        nativeType = "p_btActionInterface_updateAction"
    )
}


val btBroadphaseProxy = "btBroadphaseProxy".opaque
val p_btBroadphaseAabbCallback_process = Module.BULLET.callback {
    bool(
        "BTBroadphaseAabbCallbackProcess",
        "",

        btBroadphaseProxy.p("proxy", ""),
        nativeType = "p_btBroadphaseAabbCallback_process"
    )
}


val btNearCallback = Module.BULLET.callback {
    void(
        "BTNearCallback",
        "",

        "btBroadphasePair".opaque.p("collisionPair", ""),
        "btCollisionDispatcher".opaque.p("dispatcher", ""),
        "btDispatcherInfo".opaque.p("dispatchInfo", ""),
        nativeType = "btNearCallback"
    )
}


val p_btMotionState_getWorldTransform = Module.BULLET.callback {
    void(
        "BTMotionStateGetWorldTransform",
        "",

        btTransform.p("worldTrans", ""),
        nativeType = "p_btMotionState_getWorldTransform"
    )
}
val p_btMotionState_setWorldTransform = Module.BULLET.callback {
    void(
        "BTMotionStateSetWorldTransform",
        "",

        btTransform.const.p("worldTrans", ""),
        nativeType = "p_btMotionState_setWorldTransform"
    )
}


val p_btOverlapFilterCallback_needBroadphaseCollision = Module.BULLET.callback {
    bool(
        "BTOverlapFilterCallbackNeedBroadphaseCollision",
        "",

        "btBroadphaseProxy".opaque.p("proxy0", ""),
        "btBroadphaseProxy".opaque.p("proxy1", ""),
        nativeType = "p_btOverlapFilterCallback_needBroadphaseCollision"
    )
}


val ContactDestroyedCallback = Module.BULLET.callback {
    bool(
        "BTContactDestroyedCallback",
        "",

        void.p("userPersistentData", ""),
        nativeType = "ContactDestroyedCallback"
    )
}
val ContactProcessedCallback = Module.BULLET.callback {
    bool(
        "BTContactProcessedCallback",
        "",

        "btManifoldPoint".opaque.p("cp", ""),
        void.p("body0", ""),
        void.p("body1", ""),
        nativeType = "ContactProcessedCallback"
    )
}
val ContactStartedCallback = Module.BULLET.callback {
    void(
        "BTContactStartedCallback",
        "",

        "btPersistentManifold".opaque.p.const.p("manifold", ""),
        nativeType = "ContactStartedCallback"
    )
}
val ContactEndedCallback = Module.BULLET.callback {
    void(
        "BTContactEndedCallback",
        "",

        "btPersistentManifold".opaque.p.const.p("manifold", ""),
        nativeType = "ContactEndedCallback"
    )
}


val p_btSoftBody_AJoint_IControl_Prepare = Module.BULLET.callback {
    void(
        "BTSoftBodyAJointIControlPrepare",
        "",

        "btSoftBody_AJoint".opaque.p("aJoint", ""),
        nativeType = "p_btSoftBody_AJoint_IControl_Prepare"
    )
}
val p_btSoftBody_AJoint_IControl_Speed = Module.BULLET.callback {
    btScalar(
        "BTSoftBodyAJointIControlSpeed",
        "",

        "btSoftBody_AJoint".opaque.p("aJoint", ""),
		btScalar("current", ""),
        nativeType = "p_btSoftBody_AJoint_IControl_Speed"
    )
}
val p_btSoftBody_ImplicitFn_Eval = Module.BULLET.callback {
    btScalar(
        "BTSoftBodyImplicitFnEval",
        "",

        btVector3.const.p("x", ""),
        nativeType = "p_btSoftBody_ImplicitFn_Eval"
    )
}


val btTriangleCallback = "btTriangleCallback".opaque
val p_btInternalTriangleIndexCallback_internalProcessTriangleIndex = Module.BULLET.callback {
    void(
        "BTInternalTriangleIndexCallbackInternalProcessTriangleIndex",
        "",

        btVector3.p("triangle", ""),
        int("partId", ""),
        int("triangleIndex", ""),
        nativeType = "p_btInternalTriangleIndexCallback_internalProcessTriangleIndex"
    )
}
val p_btTriangleCallback_processTriangle = Module.BULLET.callback {
    void(
        "BTTriangleCallbackProcessTriangle",
        "",

        btVector3.p("triangle", ""),
        int("partId", ""),
        int("triangleIndex", ""),
        nativeType = "p_btTriangleCallback_processTriangle"
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