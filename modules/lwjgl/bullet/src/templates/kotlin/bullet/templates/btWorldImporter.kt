/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btWorldImporter = "BTWorldImporter".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "WorldImporter_new",
        "",

        opaque_p("world", "")
    )

    opaque_p(
        "WorldImporter_createBoxShape",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("halfExtents", "")
    )

    opaque_p(
        "WorldImporter_createBvhTriangleMeshShape",
        "",

        opaque_p("obj", ""),
        opaque_p("trimesh", ""),
        opaque_p("bvh", "")
    )

    opaque_p(
        "WorldImporter_createCapsuleShapeZ",
        "",

        opaque_p("obj", ""),
        btScalar("radius", ""),
        btScalar("height", "")
    )

    opaque_p(
        "WorldImporter_createCapsuleShapeX",
        "",

        opaque_p("obj", ""),
        btScalar("radius", ""),
        btScalar("height", "")
    )

    opaque_p(
        "WorldImporter_createCapsuleShapeY",
        "",

        opaque_p("obj", ""),
        btScalar("radius", ""),
        btScalar("height", "")
    )

    opaque_p(
        "WorldImporter_createCollisionObject",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("startTransform", ""),
        opaque_p("shape", ""),
        charUTF8.const.p("bodyName", "")
    )

    opaque_p(
        "WorldImporter_createCompoundShape",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "WorldImporter_createConeShapeZ",
        "",

        opaque_p("obj", ""),
        btScalar("radius", ""),
        btScalar("height", "")
    )

    opaque_p(
        "WorldImporter_createConeShapeX",
        "",

        opaque_p("obj", ""),
        btScalar("radius", ""),
        btScalar("height", "")
    )

    opaque_p(
        "WorldImporter_createConeShapeY",
        "",

        opaque_p("obj", ""),
        btScalar("radius", ""),
        btScalar("height", "")
    )

    opaque_p(
        "WorldImporter_createConeTwistConstraint",
        "",

        opaque_p("obj", ""),
        opaque_p("rbA", ""),
        opaque_p("rbB", ""),
        btTransform.const.p("rbAFrame", ""),
        btTransform.const.p("rbBFrame", "")
    )

    opaque_p(
        "WorldImporter_createConeTwistConstraint2",
        "",

        opaque_p("obj", ""),
        opaque_p("rbA", ""),
        btTransform.const.p("rbAFrame", "")
    )

    opaque_p(
        "WorldImporter_createConvexHullShape",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "WorldImporter_createConvexTriangleMeshShape",
        "",

        opaque_p("obj", ""),
        opaque_p("trimesh", "")
    )

    opaque_p(
        "WorldImporter_createCylinderShapeZ",
        "",

        opaque_p("obj", ""),
        btScalar("radius", ""),
        btScalar("height", "")
    )

    opaque_p(
        "WorldImporter_createCylinderShapeX",
        "",

        opaque_p("obj", ""),
        btScalar("radius", ""),
        btScalar("height", "")
    )

    opaque_p(
        "WorldImporter_createCylinderShapeY",
        "",

        opaque_p("obj", ""),
        btScalar("radius", ""),
        btScalar("height", "")
    )

    opaque_p(
        "WorldImporter_createGearConstraint",
        "",

        opaque_p("obj", ""),
        opaque_p("rbA", ""),
        opaque_p("rbB", ""),
        btVector3.const.p("axisInA", ""),
        btVector3.const.p("axisInB", ""),
        btScalar("ratio", "")
    )

    opaque_p(
        "WorldImporter_createGeneric6DofConstraint",
        "",

        opaque_p("obj", ""),
        opaque_p("rbA", ""),
        opaque_p("rbB", ""),
        btTransform.const.p("frameInA", ""),
        btTransform.const.p("frameInB", ""),
        bool("useLinearReferenceFrameA", "")
    )

    opaque_p(
        "WorldImporter_createGeneric6DofConstraint2",
        "",

        opaque_p("obj", ""),
        opaque_p("rbB", ""),
        btTransform.const.p("frameInB", ""),
        bool("useLinearReferenceFrameB", "")
    )

    opaque_p(
        "WorldImporter_createGeneric6DofSpring2Constraint",
        "",

        opaque_p("obj", ""),
        opaque_p("rbA", ""),
        opaque_p("rbB", ""),
        btTransform.const.p("frameInA", ""),
        btTransform.const.p("frameInB", ""),
        int("rotateOrder", "")
    )

    opaque_p(
        "WorldImporter_createGeneric6DofSpringConstraint",
        "",

        opaque_p("obj", ""),
        opaque_p("rbA", ""),
        opaque_p("rbB", ""),
        btTransform.const.p("frameInA", ""),
        btTransform.const.p("frameInB", ""),
        bool("useLinearReferenceFrameA", "")
    )

    opaque_p(
        "WorldImporter_createGimpactShape",
        "",

        opaque_p("obj", ""),
        opaque_p("trimesh", "")
    )

    opaque_p(
        "WorldImporter_createHingeConstraint",
        "",

        opaque_p("obj", ""),
        opaque_p("rbA", ""),
        opaque_p("rbB", ""),
        btTransform.const.p("rbAFrame", ""),
        btTransform.const.p("rbBFrame", "")
    )

    opaque_p(
        "WorldImporter_createHingeConstraint2",
        "",

        opaque_p("obj", ""),
        opaque_p("rbA", ""),
        opaque_p("rbB", ""),
        btTransform.const.p("rbAFrame", ""),
        btTransform.const.p("rbBFrame", ""),
        bool("useReferenceFrameA", "")
    )

    opaque_p(
        "WorldImporter_createHingeConstraint3",
        "",

        opaque_p("obj", ""),
        opaque_p("rbA", ""),
        btTransform.const.p("rbAFrame", "")
    )

    opaque_p(
        "WorldImporter_createHingeConstraint4",
        "",

        opaque_p("obj", ""),
        opaque_p("rbA", ""),
        btTransform.const.p("rbAFrame", ""),
        bool("useReferenceFrameA", "")
    )

    opaque_p(
        "WorldImporter_createMeshInterface",
        "",

        opaque_p("obj", ""),
        opaque_p("meshData", "")
    )

    opaque_p(
        "WorldImporter_createMultiSphereShape",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("positions", ""),
        btScalar.const.p("radi", ""),
        AutoSize("positions", "radi")..int("numSpheres", "")
    )

    opaque_p(
        "WorldImporter_createOptimizedBvh",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "WorldImporter_createPlaneShape",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("planeNormal", ""),
        btScalar("planeConstant", "")
    )

    opaque_p(
        "WorldImporter_createPoint2PointConstraint",
        "",

        opaque_p("obj", ""),
        opaque_p("rbA", ""),
        btVector3.const.p("pivotInA", "")
    )

    opaque_p(
        "WorldImporter_createPoint2PointConstraint2",
        "",

        opaque_p("obj", ""),
        opaque_p("rbA", ""),
        opaque_p("rbB", ""),
        btVector3.const.p("pivotInA", ""),
        btVector3.const.p("pivotInB", "")
    )

    opaque_p(
        "WorldImporter_createRigidBody",
        "",

        opaque_p("obj", ""),
        bool("isDynamic", ""),
        btScalar("mass", ""),
        btTransform.const.p("startTransform", ""),
        opaque_p("shape", ""),
        charUTF8.const.p("bodyName", "")
    )

    opaque_p(
        "WorldImporter_createScaledTrangleMeshShape",
        "",

        opaque_p("obj", ""),
        opaque_p("meshShape", ""),
        btVector3.const.p("localScalingbtBvhTriangleMeshShape", "")
    )

    opaque_p(
        "WorldImporter_createSliderConstraint",
        "",

        opaque_p("obj", ""),
        opaque_p("rbA", ""),
        opaque_p("rbB", ""),
        btTransform.const.p("frameInA", ""),
        btTransform.const.p("frameInB", ""),
        bool("useLinearReferenceFrameA", "")
    )

    opaque_p(
        "WorldImporter_createSliderConstraint2",
        "",

        opaque_p("obj", ""),
        opaque_p("rbB", ""),
        btTransform.const.p("frameInB", ""),
        bool("useLinearReferenceFrameA", "")
    )

    opaque_p(
        "WorldImporter_createSphereShape",
        "",

        opaque_p("obj", ""),
        btScalar("radius", "")
    )

    opaque_p(
        "WorldImporter_createStridingMeshInterfaceData",
        "",

        opaque_p("obj", ""),
        opaque_p("interfaceData", "")
    )

    opaque_p(
        "WorldImporter_createTriangleInfoMap",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "WorldImporter_createTriangleMeshContainer",
        "",

        opaque_p("obj", "")
    )

    void(
        "WorldImporter_deleteAllData",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "WorldImporter_getBvhByIndex",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    opaque_p(
        "WorldImporter_getCollisionShapeByIndex",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    opaque_p(
        "WorldImporter_getCollisionShapeByName",
        "",

        opaque_p("obj", ""),
        charUTF8.const.p("name", "")
    )

    opaque_p(
        "WorldImporter_getConstraintByIndex",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    opaque_p(
        "WorldImporter_getConstraintByName",
        "",

        opaque_p("obj", ""),
        charUTF8.const.p("name", "")
    )

    charUTF8.const.p(
        "WorldImporter_getNameForPointer",
        "",

        opaque_p("obj", ""),
        opaque_p("ptr", "")
    )

    int(
        "WorldImporter_getNumBvhs",
        "",

        opaque_p("obj", "")
    )

    int(
        "WorldImporter_getNumCollisionShapes",
        "",

        opaque_p("obj", "")
    )

    int(
        "WorldImporter_getNumConstraints",
        "",

        opaque_p("obj", "")
    )

    int(
        "WorldImporter_getNumRigidBodies",
        "",

        opaque_p("obj", "")
    )

    int(
        "WorldImporter_getNumTriangleInfoMaps",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "WorldImporter_getRigidBodyByIndex",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    opaque_p(
        "WorldImporter_getRigidBodyByName",
        "",

        opaque_p("obj", ""),
        charUTF8.const.p("name", "")
    )

    opaque_p(
        "WorldImporter_getTriangleInfoMapByIndex",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    int(
        "WorldImporter_getVerboseMode",
        "",

        opaque_p("obj", "")
    )

    void(
        "WorldImporter_setDynamicsWorldInfo",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("gravity", ""),
        opaque_p("solverInfo", "")
    )

    void(
        "WorldImporter_setVerboseMode",
        "",

        opaque_p("obj", ""),
        int("verboseMode", "")
    )

    void(
        "WorldImporter_delete",
        "",

        opaque_p("obj", "")
    )

}