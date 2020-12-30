/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BTWorldImporter {

    protected BTWorldImporter() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            WorldImporter_new                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_new"),
            WorldImporter_createBoxShape                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createBoxShape"),
            WorldImporter_createBvhTriangleMeshShape         = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createBvhTriangleMeshShape"),
            WorldImporter_createCapsuleShapeZ                = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createCapsuleShapeZ"),
            WorldImporter_createCapsuleShapeX                = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createCapsuleShapeX"),
            WorldImporter_createCapsuleShapeY                = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createCapsuleShapeY"),
            WorldImporter_createCollisionObject              = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createCollisionObject"),
            WorldImporter_createCompoundShape                = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createCompoundShape"),
            WorldImporter_createConeShapeZ                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createConeShapeZ"),
            WorldImporter_createConeShapeX                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createConeShapeX"),
            WorldImporter_createConeShapeY                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createConeShapeY"),
            WorldImporter_createConeTwistConstraint          = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createConeTwistConstraint"),
            WorldImporter_createConeTwistConstraint2         = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createConeTwistConstraint2"),
            WorldImporter_createConvexHullShape              = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createConvexHullShape"),
            WorldImporter_createConvexTriangleMeshShape      = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createConvexTriangleMeshShape"),
            WorldImporter_createCylinderShapeZ               = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createCylinderShapeZ"),
            WorldImporter_createCylinderShapeX               = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createCylinderShapeX"),
            WorldImporter_createCylinderShapeY               = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createCylinderShapeY"),
            WorldImporter_createGearConstraint               = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createGearConstraint"),
            WorldImporter_createGeneric6DofConstraint        = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createGeneric6DofConstraint"),
            WorldImporter_createGeneric6DofConstraint2       = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createGeneric6DofConstraint2"),
            WorldImporter_createGeneric6DofSpring2Constraint = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createGeneric6DofSpring2Constraint"),
            WorldImporter_createGeneric6DofSpringConstraint  = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createGeneric6DofSpringConstraint"),
            WorldImporter_createGimpactShape                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createGimpactShape"),
            WorldImporter_createHingeConstraint              = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createHingeConstraint"),
            WorldImporter_createHingeConstraint2             = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createHingeConstraint2"),
            WorldImporter_createHingeConstraint3             = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createHingeConstraint3"),
            WorldImporter_createHingeConstraint4             = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createHingeConstraint4"),
            WorldImporter_createMeshInterface                = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createMeshInterface"),
            WorldImporter_createMultiSphereShape             = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createMultiSphereShape"),
            WorldImporter_createOptimizedBvh                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createOptimizedBvh"),
            WorldImporter_createPlaneShape                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createPlaneShape"),
            WorldImporter_createPoint2PointConstraint        = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createPoint2PointConstraint"),
            WorldImporter_createPoint2PointConstraint2       = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createPoint2PointConstraint2"),
            WorldImporter_createRigidBody                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createRigidBody"),
            WorldImporter_createScaledTrangleMeshShape       = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createScaledTrangleMeshShape"),
            WorldImporter_createSliderConstraint             = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createSliderConstraint"),
            WorldImporter_createSliderConstraint2            = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createSliderConstraint2"),
            WorldImporter_createSphereShape                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createSphereShape"),
            WorldImporter_createStridingMeshInterfaceData    = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createStridingMeshInterfaceData"),
            WorldImporter_createTriangleInfoMap              = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createTriangleInfoMap"),
            WorldImporter_createTriangleMeshContainer        = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_createTriangleMeshContainer"),
            WorldImporter_deleteAllData                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_deleteAllData"),
            WorldImporter_getBvhByIndex                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_getBvhByIndex"),
            WorldImporter_getCollisionShapeByIndex           = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_getCollisionShapeByIndex"),
            WorldImporter_getCollisionShapeByName            = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_getCollisionShapeByName"),
            WorldImporter_getConstraintByIndex               = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_getConstraintByIndex"),
            WorldImporter_getConstraintByName                = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_getConstraintByName"),
            WorldImporter_getNameForPointer                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_getNameForPointer"),
            WorldImporter_getNumBvhs                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_getNumBvhs"),
            WorldImporter_getNumCollisionShapes              = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_getNumCollisionShapes"),
            WorldImporter_getNumConstraints                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_getNumConstraints"),
            WorldImporter_getNumRigidBodies                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_getNumRigidBodies"),
            WorldImporter_getNumTriangleInfoMaps             = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_getNumTriangleInfoMaps"),
            WorldImporter_getRigidBodyByIndex                = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_getRigidBodyByIndex"),
            WorldImporter_getRigidBodyByName                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_getRigidBodyByName"),
            WorldImporter_getTriangleInfoMapByIndex          = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_getTriangleInfoMapByIndex"),
            WorldImporter_getVerboseMode                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_getVerboseMode"),
            WorldImporter_setDynamicsWorldInfo               = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_setDynamicsWorldInfo"),
            WorldImporter_setVerboseMode                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_setVerboseMode"),
            WorldImporter_delete                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btWorldImporter_delete");

    }

    // --- [ btWorldImporter_new ] ---

    @NativeType("void *")
    public static long btWorldImporter_new(@NativeType("void *") long world) {
        long __functionAddress = Functions.WorldImporter_new;
        if (CHECKS) {
            check(world);
        }
        return invokePP(world, __functionAddress);
    }

    // --- [ btWorldImporter_createBoxShape ] ---

    public static long nbtWorldImporter_createBoxShape(long obj, long halfExtents) {
        long __functionAddress = Functions.WorldImporter_createBoxShape;
        if (CHECKS) {
            check(obj);
        }
        return invokePPP(obj, halfExtents, __functionAddress);
    }

    @NativeType("void *")
    public static long btWorldImporter_createBoxShape(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 halfExtents) {
        return nbtWorldImporter_createBoxShape(obj, halfExtents.address());
    }

    // --- [ btWorldImporter_createBvhTriangleMeshShape ] ---

    @NativeType("void *")
    public static long btWorldImporter_createBvhTriangleMeshShape(@NativeType("void *") long obj, @NativeType("void *") long trimesh, @NativeType("void *") long bvh) {
        long __functionAddress = Functions.WorldImporter_createBvhTriangleMeshShape;
        if (CHECKS) {
            check(obj);
            check(trimesh);
            check(bvh);
        }
        return invokePPPP(obj, trimesh, bvh, __functionAddress);
    }

    // --- [ btWorldImporter_createCapsuleShapeZ ] ---

    @NativeType("void *")
    public static long btWorldImporter_createCapsuleShapeZ(@NativeType("void *") long obj, @NativeType("btScalar") float radius, @NativeType("btScalar") float height) {
        long __functionAddress = Functions.WorldImporter_createCapsuleShapeZ;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, radius, height, __functionAddress);
    }

    // --- [ btWorldImporter_createCapsuleShapeX ] ---

    @NativeType("void *")
    public static long btWorldImporter_createCapsuleShapeX(@NativeType("void *") long obj, @NativeType("btScalar") float radius, @NativeType("btScalar") float height) {
        long __functionAddress = Functions.WorldImporter_createCapsuleShapeX;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, radius, height, __functionAddress);
    }

    // --- [ btWorldImporter_createCapsuleShapeY ] ---

    @NativeType("void *")
    public static long btWorldImporter_createCapsuleShapeY(@NativeType("void *") long obj, @NativeType("btScalar") float radius, @NativeType("btScalar") float height) {
        long __functionAddress = Functions.WorldImporter_createCapsuleShapeY;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, radius, height, __functionAddress);
    }

    // --- [ btWorldImporter_createCollisionObject ] ---

    public static long nbtWorldImporter_createCollisionObject(long obj, long startTransform, long shape, long bodyName) {
        long __functionAddress = Functions.WorldImporter_createCollisionObject;
        if (CHECKS) {
            check(obj);
            check(shape);
        }
        return invokePPPPP(obj, startTransform, shape, bodyName, __functionAddress);
    }

    @NativeType("void *")
    public static long btWorldImporter_createCollisionObject(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform startTransform, @NativeType("void *") long shape, @NativeType("char const *") ByteBuffer bodyName) {
        if (CHECKS) {
            checkNT1(bodyName);
        }
        return nbtWorldImporter_createCollisionObject(obj, startTransform.address(), shape, memAddress(bodyName));
    }

    @NativeType("void *")
    public static long btWorldImporter_createCollisionObject(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform startTransform, @NativeType("void *") long shape, @NativeType("char const *") CharSequence bodyName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(bodyName, true);
            long bodyNameEncoded = stack.getPointerAddress();
            return nbtWorldImporter_createCollisionObject(obj, startTransform.address(), shape, bodyNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ btWorldImporter_createCompoundShape ] ---

    @NativeType("void *")
    public static long btWorldImporter_createCompoundShape(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WorldImporter_createCompoundShape;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btWorldImporter_createConeShapeZ ] ---

    @NativeType("void *")
    public static long btWorldImporter_createConeShapeZ(@NativeType("void *") long obj, @NativeType("btScalar") float radius, @NativeType("btScalar") float height) {
        long __functionAddress = Functions.WorldImporter_createConeShapeZ;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, radius, height, __functionAddress);
    }

    // --- [ btWorldImporter_createConeShapeX ] ---

    @NativeType("void *")
    public static long btWorldImporter_createConeShapeX(@NativeType("void *") long obj, @NativeType("btScalar") float radius, @NativeType("btScalar") float height) {
        long __functionAddress = Functions.WorldImporter_createConeShapeX;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, radius, height, __functionAddress);
    }

    // --- [ btWorldImporter_createConeShapeY ] ---

    @NativeType("void *")
    public static long btWorldImporter_createConeShapeY(@NativeType("void *") long obj, @NativeType("btScalar") float radius, @NativeType("btScalar") float height) {
        long __functionAddress = Functions.WorldImporter_createConeShapeY;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, radius, height, __functionAddress);
    }

    // --- [ btWorldImporter_createConeTwistConstraint ] ---

    public static long nbtWorldImporter_createConeTwistConstraint(long obj, long rbA, long rbB, long rbAFrame, long rbBFrame) {
        long __functionAddress = Functions.WorldImporter_createConeTwistConstraint;
        if (CHECKS) {
            check(obj);
            check(rbA);
            check(rbB);
        }
        return invokePPPPPP(obj, rbA, rbB, rbAFrame, rbBFrame, __functionAddress);
    }

    @NativeType("void *")
    public static long btWorldImporter_createConeTwistConstraint(@NativeType("void *") long obj, @NativeType("void *") long rbA, @NativeType("void *") long rbB, @NativeType("btTransform const *") BTTransform rbAFrame, @NativeType("btTransform const *") BTTransform rbBFrame) {
        return nbtWorldImporter_createConeTwistConstraint(obj, rbA, rbB, rbAFrame.address(), rbBFrame.address());
    }

    // --- [ btWorldImporter_createConeTwistConstraint2 ] ---

    public static long nbtWorldImporter_createConeTwistConstraint2(long obj, long rbA, long rbAFrame) {
        long __functionAddress = Functions.WorldImporter_createConeTwistConstraint2;
        if (CHECKS) {
            check(obj);
            check(rbA);
        }
        return invokePPPP(obj, rbA, rbAFrame, __functionAddress);
    }

    @NativeType("void *")
    public static long btWorldImporter_createConeTwistConstraint2(@NativeType("void *") long obj, @NativeType("void *") long rbA, @NativeType("btTransform const *") BTTransform rbAFrame) {
        return nbtWorldImporter_createConeTwistConstraint2(obj, rbA, rbAFrame.address());
    }

    // --- [ btWorldImporter_createConvexHullShape ] ---

    @NativeType("void *")
    public static long btWorldImporter_createConvexHullShape(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WorldImporter_createConvexHullShape;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btWorldImporter_createConvexTriangleMeshShape ] ---

    @NativeType("void *")
    public static long btWorldImporter_createConvexTriangleMeshShape(@NativeType("void *") long obj, @NativeType("void *") long trimesh) {
        long __functionAddress = Functions.WorldImporter_createConvexTriangleMeshShape;
        if (CHECKS) {
            check(obj);
            check(trimesh);
        }
        return invokePPP(obj, trimesh, __functionAddress);
    }

    // --- [ btWorldImporter_createCylinderShapeZ ] ---

    @NativeType("void *")
    public static long btWorldImporter_createCylinderShapeZ(@NativeType("void *") long obj, @NativeType("btScalar") float radius, @NativeType("btScalar") float height) {
        long __functionAddress = Functions.WorldImporter_createCylinderShapeZ;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, radius, height, __functionAddress);
    }

    // --- [ btWorldImporter_createCylinderShapeX ] ---

    @NativeType("void *")
    public static long btWorldImporter_createCylinderShapeX(@NativeType("void *") long obj, @NativeType("btScalar") float radius, @NativeType("btScalar") float height) {
        long __functionAddress = Functions.WorldImporter_createCylinderShapeX;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, radius, height, __functionAddress);
    }

    // --- [ btWorldImporter_createCylinderShapeY ] ---

    @NativeType("void *")
    public static long btWorldImporter_createCylinderShapeY(@NativeType("void *") long obj, @NativeType("btScalar") float radius, @NativeType("btScalar") float height) {
        long __functionAddress = Functions.WorldImporter_createCylinderShapeY;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, radius, height, __functionAddress);
    }

    // --- [ btWorldImporter_createGearConstraint ] ---

    public static long nbtWorldImporter_createGearConstraint(long obj, long rbA, long rbB, long axisInA, long axisInB, float ratio) {
        long __functionAddress = Functions.WorldImporter_createGearConstraint;
        if (CHECKS) {
            check(obj);
            check(rbA);
            check(rbB);
        }
        return invokePPPPPP(obj, rbA, rbB, axisInA, axisInB, ratio, __functionAddress);
    }

    @NativeType("void *")
    public static long btWorldImporter_createGearConstraint(@NativeType("void *") long obj, @NativeType("void *") long rbA, @NativeType("void *") long rbB, @NativeType("btVector3 const *") BTVector3 axisInA, @NativeType("btVector3 const *") BTVector3 axisInB, @NativeType("btScalar") float ratio) {
        return nbtWorldImporter_createGearConstraint(obj, rbA, rbB, axisInA.address(), axisInB.address(), ratio);
    }

    // --- [ btWorldImporter_createGeneric6DofConstraint ] ---

    public static long nbtWorldImporter_createGeneric6DofConstraint(long obj, long rbA, long rbB, long frameInA, long frameInB, boolean useLinearReferenceFrameA) {
        long __functionAddress = Functions.WorldImporter_createGeneric6DofConstraint;
        if (CHECKS) {
            check(obj);
            check(rbA);
            check(rbB);
        }
        return invokePPPPPP(obj, rbA, rbB, frameInA, frameInB, useLinearReferenceFrameA, __functionAddress);
    }

    @NativeType("void *")
    public static long btWorldImporter_createGeneric6DofConstraint(@NativeType("void *") long obj, @NativeType("void *") long rbA, @NativeType("void *") long rbB, @NativeType("btTransform const *") BTTransform frameInA, @NativeType("btTransform const *") BTTransform frameInB, @NativeType("bool") boolean useLinearReferenceFrameA) {
        return nbtWorldImporter_createGeneric6DofConstraint(obj, rbA, rbB, frameInA.address(), frameInB.address(), useLinearReferenceFrameA);
    }

    // --- [ btWorldImporter_createGeneric6DofConstraint2 ] ---

    public static long nbtWorldImporter_createGeneric6DofConstraint2(long obj, long rbB, long frameInB, boolean useLinearReferenceFrameB) {
        long __functionAddress = Functions.WorldImporter_createGeneric6DofConstraint2;
        if (CHECKS) {
            check(obj);
            check(rbB);
        }
        return invokePPPP(obj, rbB, frameInB, useLinearReferenceFrameB, __functionAddress);
    }

    @NativeType("void *")
    public static long btWorldImporter_createGeneric6DofConstraint2(@NativeType("void *") long obj, @NativeType("void *") long rbB, @NativeType("btTransform const *") BTTransform frameInB, @NativeType("bool") boolean useLinearReferenceFrameB) {
        return nbtWorldImporter_createGeneric6DofConstraint2(obj, rbB, frameInB.address(), useLinearReferenceFrameB);
    }

    // --- [ btWorldImporter_createGeneric6DofSpring2Constraint ] ---

    public static long nbtWorldImporter_createGeneric6DofSpring2Constraint(long obj, long rbA, long rbB, long frameInA, long frameInB, int rotateOrder) {
        long __functionAddress = Functions.WorldImporter_createGeneric6DofSpring2Constraint;
        if (CHECKS) {
            check(obj);
            check(rbA);
            check(rbB);
        }
        return invokePPPPPP(obj, rbA, rbB, frameInA, frameInB, rotateOrder, __functionAddress);
    }

    @NativeType("void *")
    public static long btWorldImporter_createGeneric6DofSpring2Constraint(@NativeType("void *") long obj, @NativeType("void *") long rbA, @NativeType("void *") long rbB, @NativeType("btTransform const *") BTTransform frameInA, @NativeType("btTransform const *") BTTransform frameInB, int rotateOrder) {
        return nbtWorldImporter_createGeneric6DofSpring2Constraint(obj, rbA, rbB, frameInA.address(), frameInB.address(), rotateOrder);
    }

    // --- [ btWorldImporter_createGeneric6DofSpringConstraint ] ---

    public static long nbtWorldImporter_createGeneric6DofSpringConstraint(long obj, long rbA, long rbB, long frameInA, long frameInB, boolean useLinearReferenceFrameA) {
        long __functionAddress = Functions.WorldImporter_createGeneric6DofSpringConstraint;
        if (CHECKS) {
            check(obj);
            check(rbA);
            check(rbB);
        }
        return invokePPPPPP(obj, rbA, rbB, frameInA, frameInB, useLinearReferenceFrameA, __functionAddress);
    }

    @NativeType("void *")
    public static long btWorldImporter_createGeneric6DofSpringConstraint(@NativeType("void *") long obj, @NativeType("void *") long rbA, @NativeType("void *") long rbB, @NativeType("btTransform const *") BTTransform frameInA, @NativeType("btTransform const *") BTTransform frameInB, @NativeType("bool") boolean useLinearReferenceFrameA) {
        return nbtWorldImporter_createGeneric6DofSpringConstraint(obj, rbA, rbB, frameInA.address(), frameInB.address(), useLinearReferenceFrameA);
    }

    // --- [ btWorldImporter_createGimpactShape ] ---

    @NativeType("void *")
    public static long btWorldImporter_createGimpactShape(@NativeType("void *") long obj, @NativeType("void *") long trimesh) {
        long __functionAddress = Functions.WorldImporter_createGimpactShape;
        if (CHECKS) {
            check(obj);
            check(trimesh);
        }
        return invokePPP(obj, trimesh, __functionAddress);
    }

    // --- [ btWorldImporter_createHingeConstraint ] ---

    public static long nbtWorldImporter_createHingeConstraint(long obj, long rbA, long rbB, long rbAFrame, long rbBFrame) {
        long __functionAddress = Functions.WorldImporter_createHingeConstraint;
        if (CHECKS) {
            check(obj);
            check(rbA);
            check(rbB);
        }
        return invokePPPPPP(obj, rbA, rbB, rbAFrame, rbBFrame, __functionAddress);
    }

    @NativeType("void *")
    public static long btWorldImporter_createHingeConstraint(@NativeType("void *") long obj, @NativeType("void *") long rbA, @NativeType("void *") long rbB, @NativeType("btTransform const *") BTTransform rbAFrame, @NativeType("btTransform const *") BTTransform rbBFrame) {
        return nbtWorldImporter_createHingeConstraint(obj, rbA, rbB, rbAFrame.address(), rbBFrame.address());
    }

    // --- [ btWorldImporter_createHingeConstraint2 ] ---

    public static long nbtWorldImporter_createHingeConstraint2(long obj, long rbA, long rbB, long rbAFrame, long rbBFrame, boolean useReferenceFrameA) {
        long __functionAddress = Functions.WorldImporter_createHingeConstraint2;
        if (CHECKS) {
            check(obj);
            check(rbA);
            check(rbB);
        }
        return invokePPPPPP(obj, rbA, rbB, rbAFrame, rbBFrame, useReferenceFrameA, __functionAddress);
    }

    @NativeType("void *")
    public static long btWorldImporter_createHingeConstraint2(@NativeType("void *") long obj, @NativeType("void *") long rbA, @NativeType("void *") long rbB, @NativeType("btTransform const *") BTTransform rbAFrame, @NativeType("btTransform const *") BTTransform rbBFrame, @NativeType("bool") boolean useReferenceFrameA) {
        return nbtWorldImporter_createHingeConstraint2(obj, rbA, rbB, rbAFrame.address(), rbBFrame.address(), useReferenceFrameA);
    }

    // --- [ btWorldImporter_createHingeConstraint3 ] ---

    public static long nbtWorldImporter_createHingeConstraint3(long obj, long rbA, long rbAFrame) {
        long __functionAddress = Functions.WorldImporter_createHingeConstraint3;
        if (CHECKS) {
            check(obj);
            check(rbA);
        }
        return invokePPPP(obj, rbA, rbAFrame, __functionAddress);
    }

    @NativeType("void *")
    public static long btWorldImporter_createHingeConstraint3(@NativeType("void *") long obj, @NativeType("void *") long rbA, @NativeType("btTransform const *") BTTransform rbAFrame) {
        return nbtWorldImporter_createHingeConstraint3(obj, rbA, rbAFrame.address());
    }

    // --- [ btWorldImporter_createHingeConstraint4 ] ---

    public static long nbtWorldImporter_createHingeConstraint4(long obj, long rbA, long rbAFrame, boolean useReferenceFrameA) {
        long __functionAddress = Functions.WorldImporter_createHingeConstraint4;
        if (CHECKS) {
            check(obj);
            check(rbA);
        }
        return invokePPPP(obj, rbA, rbAFrame, useReferenceFrameA, __functionAddress);
    }

    @NativeType("void *")
    public static long btWorldImporter_createHingeConstraint4(@NativeType("void *") long obj, @NativeType("void *") long rbA, @NativeType("btTransform const *") BTTransform rbAFrame, @NativeType("bool") boolean useReferenceFrameA) {
        return nbtWorldImporter_createHingeConstraint4(obj, rbA, rbAFrame.address(), useReferenceFrameA);
    }

    // --- [ btWorldImporter_createMeshInterface ] ---

    @NativeType("void *")
    public static long btWorldImporter_createMeshInterface(@NativeType("void *") long obj, @NativeType("void *") long meshData) {
        long __functionAddress = Functions.WorldImporter_createMeshInterface;
        if (CHECKS) {
            check(obj);
            check(meshData);
        }
        return invokePPP(obj, meshData, __functionAddress);
    }

    // --- [ btWorldImporter_createMultiSphereShape ] ---

    public static long nbtWorldImporter_createMultiSphereShape(long obj, long positions, long radi, int numSpheres) {
        long __functionAddress = Functions.WorldImporter_createMultiSphereShape;
        if (CHECKS) {
            check(obj);
        }
        return invokePPPP(obj, positions, radi, numSpheres, __functionAddress);
    }

    @NativeType("void *")
    public static long btWorldImporter_createMultiSphereShape(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3.Buffer positions, @NativeType("btScalar const *") FloatBuffer radi) {
        if (CHECKS) {
            check(radi, positions.remaining());
        }
        return nbtWorldImporter_createMultiSphereShape(obj, positions.address(), memAddress(radi), positions.remaining());
    }

    // --- [ btWorldImporter_createOptimizedBvh ] ---

    @NativeType("void *")
    public static long btWorldImporter_createOptimizedBvh(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WorldImporter_createOptimizedBvh;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btWorldImporter_createPlaneShape ] ---

    public static long nbtWorldImporter_createPlaneShape(long obj, long planeNormal, float planeConstant) {
        long __functionAddress = Functions.WorldImporter_createPlaneShape;
        if (CHECKS) {
            check(obj);
        }
        return invokePPP(obj, planeNormal, planeConstant, __functionAddress);
    }

    @NativeType("void *")
    public static long btWorldImporter_createPlaneShape(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 planeNormal, @NativeType("btScalar") float planeConstant) {
        return nbtWorldImporter_createPlaneShape(obj, planeNormal.address(), planeConstant);
    }

    // --- [ btWorldImporter_createPoint2PointConstraint ] ---

    public static long nbtWorldImporter_createPoint2PointConstraint(long obj, long rbA, long pivotInA) {
        long __functionAddress = Functions.WorldImporter_createPoint2PointConstraint;
        if (CHECKS) {
            check(obj);
            check(rbA);
        }
        return invokePPPP(obj, rbA, pivotInA, __functionAddress);
    }

    @NativeType("void *")
    public static long btWorldImporter_createPoint2PointConstraint(@NativeType("void *") long obj, @NativeType("void *") long rbA, @NativeType("btVector3 const *") BTVector3 pivotInA) {
        return nbtWorldImporter_createPoint2PointConstraint(obj, rbA, pivotInA.address());
    }

    // --- [ btWorldImporter_createPoint2PointConstraint2 ] ---

    public static long nbtWorldImporter_createPoint2PointConstraint2(long obj, long rbA, long rbB, long pivotInA, long pivotInB) {
        long __functionAddress = Functions.WorldImporter_createPoint2PointConstraint2;
        if (CHECKS) {
            check(obj);
            check(rbA);
            check(rbB);
        }
        return invokePPPPPP(obj, rbA, rbB, pivotInA, pivotInB, __functionAddress);
    }

    @NativeType("void *")
    public static long btWorldImporter_createPoint2PointConstraint2(@NativeType("void *") long obj, @NativeType("void *") long rbA, @NativeType("void *") long rbB, @NativeType("btVector3 const *") BTVector3 pivotInA, @NativeType("btVector3 const *") BTVector3 pivotInB) {
        return nbtWorldImporter_createPoint2PointConstraint2(obj, rbA, rbB, pivotInA.address(), pivotInB.address());
    }

    // --- [ btWorldImporter_createRigidBody ] ---

    public static long nbtWorldImporter_createRigidBody(long obj, boolean isDynamic, float mass, long startTransform, long shape, long bodyName) {
        long __functionAddress = Functions.WorldImporter_createRigidBody;
        if (CHECKS) {
            check(obj);
            check(shape);
        }
        return invokePPPPP(obj, isDynamic, mass, startTransform, shape, bodyName, __functionAddress);
    }

    @NativeType("void *")
    public static long btWorldImporter_createRigidBody(@NativeType("void *") long obj, @NativeType("bool") boolean isDynamic, @NativeType("btScalar") float mass, @NativeType("btTransform const *") BTTransform startTransform, @NativeType("void *") long shape, @NativeType("char const *") ByteBuffer bodyName) {
        if (CHECKS) {
            checkNT1(bodyName);
        }
        return nbtWorldImporter_createRigidBody(obj, isDynamic, mass, startTransform.address(), shape, memAddress(bodyName));
    }

    @NativeType("void *")
    public static long btWorldImporter_createRigidBody(@NativeType("void *") long obj, @NativeType("bool") boolean isDynamic, @NativeType("btScalar") float mass, @NativeType("btTransform const *") BTTransform startTransform, @NativeType("void *") long shape, @NativeType("char const *") CharSequence bodyName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(bodyName, true);
            long bodyNameEncoded = stack.getPointerAddress();
            return nbtWorldImporter_createRigidBody(obj, isDynamic, mass, startTransform.address(), shape, bodyNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ btWorldImporter_createScaledTrangleMeshShape ] ---

    public static long nbtWorldImporter_createScaledTrangleMeshShape(long obj, long meshShape, long localScalingbtBvhTriangleMeshShape) {
        long __functionAddress = Functions.WorldImporter_createScaledTrangleMeshShape;
        if (CHECKS) {
            check(obj);
            check(meshShape);
        }
        return invokePPPP(obj, meshShape, localScalingbtBvhTriangleMeshShape, __functionAddress);
    }

    @NativeType("void *")
    public static long btWorldImporter_createScaledTrangleMeshShape(@NativeType("void *") long obj, @NativeType("void *") long meshShape, @NativeType("btVector3 const *") BTVector3 localScalingbtBvhTriangleMeshShape) {
        return nbtWorldImporter_createScaledTrangleMeshShape(obj, meshShape, localScalingbtBvhTriangleMeshShape.address());
    }

    // --- [ btWorldImporter_createSliderConstraint ] ---

    public static long nbtWorldImporter_createSliderConstraint(long obj, long rbA, long rbB, long frameInA, long frameInB, boolean useLinearReferenceFrameA) {
        long __functionAddress = Functions.WorldImporter_createSliderConstraint;
        if (CHECKS) {
            check(obj);
            check(rbA);
            check(rbB);
        }
        return invokePPPPPP(obj, rbA, rbB, frameInA, frameInB, useLinearReferenceFrameA, __functionAddress);
    }

    @NativeType("void *")
    public static long btWorldImporter_createSliderConstraint(@NativeType("void *") long obj, @NativeType("void *") long rbA, @NativeType("void *") long rbB, @NativeType("btTransform const *") BTTransform frameInA, @NativeType("btTransform const *") BTTransform frameInB, @NativeType("bool") boolean useLinearReferenceFrameA) {
        return nbtWorldImporter_createSliderConstraint(obj, rbA, rbB, frameInA.address(), frameInB.address(), useLinearReferenceFrameA);
    }

    // --- [ btWorldImporter_createSliderConstraint2 ] ---

    public static long nbtWorldImporter_createSliderConstraint2(long obj, long rbB, long frameInB, boolean useLinearReferenceFrameA) {
        long __functionAddress = Functions.WorldImporter_createSliderConstraint2;
        if (CHECKS) {
            check(obj);
            check(rbB);
        }
        return invokePPPP(obj, rbB, frameInB, useLinearReferenceFrameA, __functionAddress);
    }

    @NativeType("void *")
    public static long btWorldImporter_createSliderConstraint2(@NativeType("void *") long obj, @NativeType("void *") long rbB, @NativeType("btTransform const *") BTTransform frameInB, @NativeType("bool") boolean useLinearReferenceFrameA) {
        return nbtWorldImporter_createSliderConstraint2(obj, rbB, frameInB.address(), useLinearReferenceFrameA);
    }

    // --- [ btWorldImporter_createSphereShape ] ---

    @NativeType("void *")
    public static long btWorldImporter_createSphereShape(@NativeType("void *") long obj, @NativeType("btScalar") float radius) {
        long __functionAddress = Functions.WorldImporter_createSphereShape;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, radius, __functionAddress);
    }

    // --- [ btWorldImporter_createStridingMeshInterfaceData ] ---

    @NativeType("void *")
    public static long btWorldImporter_createStridingMeshInterfaceData(@NativeType("void *") long obj, @NativeType("void *") long interfaceData) {
        long __functionAddress = Functions.WorldImporter_createStridingMeshInterfaceData;
        if (CHECKS) {
            check(obj);
            check(interfaceData);
        }
        return invokePPP(obj, interfaceData, __functionAddress);
    }

    // --- [ btWorldImporter_createTriangleInfoMap ] ---

    @NativeType("void *")
    public static long btWorldImporter_createTriangleInfoMap(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WorldImporter_createTriangleInfoMap;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btWorldImporter_createTriangleMeshContainer ] ---

    @NativeType("void *")
    public static long btWorldImporter_createTriangleMeshContainer(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WorldImporter_createTriangleMeshContainer;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btWorldImporter_deleteAllData ] ---

    public static void btWorldImporter_deleteAllData(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WorldImporter_deleteAllData;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btWorldImporter_getBvhByIndex ] ---

    @NativeType("void *")
    public static long btWorldImporter_getBvhByIndex(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.WorldImporter_getBvhByIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btWorldImporter_getCollisionShapeByIndex ] ---

    @NativeType("void *")
    public static long btWorldImporter_getCollisionShapeByIndex(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.WorldImporter_getCollisionShapeByIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btWorldImporter_getCollisionShapeByName ] ---

    public static long nbtWorldImporter_getCollisionShapeByName(long obj, long name) {
        long __functionAddress = Functions.WorldImporter_getCollisionShapeByName;
        if (CHECKS) {
            check(obj);
        }
        return invokePPP(obj, name, __functionAddress);
    }

    @NativeType("void *")
    public static long btWorldImporter_getCollisionShapeByName(@NativeType("void *") long obj, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nbtWorldImporter_getCollisionShapeByName(obj, memAddress(name));
    }

    @NativeType("void *")
    public static long btWorldImporter_getCollisionShapeByName(@NativeType("void *") long obj, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nbtWorldImporter_getCollisionShapeByName(obj, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ btWorldImporter_getConstraintByIndex ] ---

    @NativeType("void *")
    public static long btWorldImporter_getConstraintByIndex(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.WorldImporter_getConstraintByIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btWorldImporter_getConstraintByName ] ---

    public static long nbtWorldImporter_getConstraintByName(long obj, long name) {
        long __functionAddress = Functions.WorldImporter_getConstraintByName;
        if (CHECKS) {
            check(obj);
        }
        return invokePPP(obj, name, __functionAddress);
    }

    @NativeType("void *")
    public static long btWorldImporter_getConstraintByName(@NativeType("void *") long obj, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nbtWorldImporter_getConstraintByName(obj, memAddress(name));
    }

    @NativeType("void *")
    public static long btWorldImporter_getConstraintByName(@NativeType("void *") long obj, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nbtWorldImporter_getConstraintByName(obj, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ btWorldImporter_getNameForPointer ] ---

    public static long nbtWorldImporter_getNameForPointer(long obj, long ptr) {
        long __functionAddress = Functions.WorldImporter_getNameForPointer;
        if (CHECKS) {
            check(obj);
            check(ptr);
        }
        return invokePPP(obj, ptr, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String btWorldImporter_getNameForPointer(@NativeType("void *") long obj, @NativeType("void *") long ptr) {
        long __result = nbtWorldImporter_getNameForPointer(obj, ptr);
        return memUTF8Safe(__result);
    }

    // --- [ btWorldImporter_getNumBvhs ] ---

    public static int btWorldImporter_getNumBvhs(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WorldImporter_getNumBvhs;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btWorldImporter_getNumCollisionShapes ] ---

    public static int btWorldImporter_getNumCollisionShapes(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WorldImporter_getNumCollisionShapes;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btWorldImporter_getNumConstraints ] ---

    public static int btWorldImporter_getNumConstraints(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WorldImporter_getNumConstraints;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btWorldImporter_getNumRigidBodies ] ---

    public static int btWorldImporter_getNumRigidBodies(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WorldImporter_getNumRigidBodies;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btWorldImporter_getNumTriangleInfoMaps ] ---

    public static int btWorldImporter_getNumTriangleInfoMaps(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WorldImporter_getNumTriangleInfoMaps;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btWorldImporter_getRigidBodyByIndex ] ---

    @NativeType("void *")
    public static long btWorldImporter_getRigidBodyByIndex(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.WorldImporter_getRigidBodyByIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btWorldImporter_getRigidBodyByName ] ---

    public static long nbtWorldImporter_getRigidBodyByName(long obj, long name) {
        long __functionAddress = Functions.WorldImporter_getRigidBodyByName;
        if (CHECKS) {
            check(obj);
        }
        return invokePPP(obj, name, __functionAddress);
    }

    @NativeType("void *")
    public static long btWorldImporter_getRigidBodyByName(@NativeType("void *") long obj, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nbtWorldImporter_getRigidBodyByName(obj, memAddress(name));
    }

    @NativeType("void *")
    public static long btWorldImporter_getRigidBodyByName(@NativeType("void *") long obj, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nbtWorldImporter_getRigidBodyByName(obj, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ btWorldImporter_getTriangleInfoMapByIndex ] ---

    @NativeType("void *")
    public static long btWorldImporter_getTriangleInfoMapByIndex(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.WorldImporter_getTriangleInfoMapByIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btWorldImporter_getVerboseMode ] ---

    public static int btWorldImporter_getVerboseMode(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WorldImporter_getVerboseMode;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btWorldImporter_setDynamicsWorldInfo ] ---

    public static void nbtWorldImporter_setDynamicsWorldInfo(long obj, long gravity, long solverInfo) {
        long __functionAddress = Functions.WorldImporter_setDynamicsWorldInfo;
        if (CHECKS) {
            check(obj);
            check(solverInfo);
        }
        invokePPPV(obj, gravity, solverInfo, __functionAddress);
    }

    public static void btWorldImporter_setDynamicsWorldInfo(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 gravity, @NativeType("void *") long solverInfo) {
        nbtWorldImporter_setDynamicsWorldInfo(obj, gravity.address(), solverInfo);
    }

    // --- [ btWorldImporter_setVerboseMode ] ---

    public static void btWorldImporter_setVerboseMode(@NativeType("void *") long obj, int verboseMode) {
        long __functionAddress = Functions.WorldImporter_setVerboseMode;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, verboseMode, __functionAddress);
    }

    // --- [ btWorldImporter_delete ] ---

    public static void btWorldImporter_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.WorldImporter_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}