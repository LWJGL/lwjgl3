/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BTCompoundShape {

    protected BTCompoundShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CompoundShapeChild_getChildMargin             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShapeChild_getChildMargin"),
            CompoundShapeChild_getChildShape              = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShapeChild_getChildShape"),
            CompoundShapeChild_getChildShapeType          = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShapeChild_getChildShapeType"),
            CompoundShapeChild_getNode                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShapeChild_getNode"),
            CompoundShapeChild_getTransform               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShapeChild_getTransform"),
            CompoundShapeChild_setChildMargin             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShapeChild_setChildMargin"),
            CompoundShapeChild_setChildShape              = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShapeChild_setChildShape"),
            CompoundShapeChild_setChildShapeType          = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShapeChild_setChildShapeType"),
            CompoundShapeChild_setNode                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShapeChild_setNode"),
            CompoundShapeChild_setTransform               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShapeChild_setTransform"),
            CompoundShapeChild_delete                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShapeChild_delete"),
            CompoundShape_new                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShape_new"),
            CompoundShape_addChildShape                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShape_addChildShape"),
            CompoundShape_calculatePrincipalAxisTransform = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShape_calculatePrincipalAxisTransform"),
            CompoundShape_createAabbTreeFromChildren      = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShape_createAabbTreeFromChildren"),
            CompoundShape_getChildList                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShape_getChildList"),
            CompoundShape_getChildShape                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShape_getChildShape"),
            CompoundShape_getChildTransform               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShape_getChildTransform"),
            CompoundShape_getDynamicAabbTree              = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShape_getDynamicAabbTree"),
            CompoundShape_getNumChildShapes               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShape_getNumChildShapes"),
            CompoundShape_getUpdateRevision               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShape_getUpdateRevision"),
            CompoundShape_recalculateLocalAabb            = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShape_recalculateLocalAabb"),
            CompoundShape_removeChildShape                = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShape_removeChildShape"),
            CompoundShape_removeChildShapeByIndex         = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShape_removeChildShapeByIndex"),
            CompoundShape_updateChildTransform            = apiGetFunctionAddress(LibBullet.getLibrary(), "btCompoundShape_updateChildTransform");

    }

    // --- [ btCompoundShapeChild_getChildMargin ] ---

    @NativeType("btScalar")
    public static float btCompoundShapeChild_getChildMargin(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CompoundShapeChild_getChildMargin;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btCompoundShapeChild_getChildShape ] ---

    @NativeType("void *")
    public static long btCompoundShapeChild_getChildShape(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CompoundShapeChild_getChildShape;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCompoundShapeChild_getChildShapeType ] ---

    public static int btCompoundShapeChild_getChildShapeType(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CompoundShapeChild_getChildShapeType;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCompoundShapeChild_getNode ] ---

    @NativeType("void *")
    public static long btCompoundShapeChild_getNode(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CompoundShapeChild_getNode;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCompoundShapeChild_getTransform ] ---

    public static void nbtCompoundShapeChild_getTransform(long obj, long value) {
        long __functionAddress = Functions.CompoundShapeChild_getTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCompoundShapeChild_getTransform(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtCompoundShapeChild_getTransform(obj, value.address());
    }

    // --- [ btCompoundShapeChild_setChildMargin ] ---

    public static void btCompoundShapeChild_setChildMargin(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.CompoundShapeChild_setChildMargin;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btCompoundShapeChild_setChildShape ] ---

    public static void btCompoundShapeChild_setChildShape(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.CompoundShapeChild_setChildShape;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btCompoundShapeChild_setChildShapeType ] ---

    public static void btCompoundShapeChild_setChildShapeType(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.CompoundShapeChild_setChildShapeType;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btCompoundShapeChild_setNode ] ---

    public static void btCompoundShapeChild_setNode(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.CompoundShapeChild_setNode;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btCompoundShapeChild_setTransform ] ---

    public static void nbtCompoundShapeChild_setTransform(long obj, long value) {
        long __functionAddress = Functions.CompoundShapeChild_setTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCompoundShapeChild_setTransform(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform value) {
        nbtCompoundShapeChild_setTransform(obj, value.address());
    }

    // --- [ btCompoundShapeChild_delete ] ---

    public static void btCompoundShapeChild_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CompoundShapeChild_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btCompoundShape_new ] ---

    @NativeType("void *")
    public static long btCompoundShape_new(@NativeType("bool") boolean enableDynamicAabbTree, int initialChildCapacity) {
        long __functionAddress = Functions.CompoundShape_new;
        return invokeP(enableDynamicAabbTree, initialChildCapacity, __functionAddress);
    }

    // --- [ btCompoundShape_addChildShape ] ---

    public static void nbtCompoundShape_addChildShape(long obj, long localTransform, long shape) {
        long __functionAddress = Functions.CompoundShape_addChildShape;
        if (CHECKS) {
            check(obj);
            check(shape);
        }
        invokePPPV(obj, localTransform, shape, __functionAddress);
    }

    public static void btCompoundShape_addChildShape(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform localTransform, @NativeType("void *") long shape) {
        nbtCompoundShape_addChildShape(obj, localTransform.address(), shape);
    }

    // --- [ btCompoundShape_calculatePrincipalAxisTransform ] ---

    public static void nbtCompoundShape_calculatePrincipalAxisTransform(long obj, long masses, long principal, long inertia) {
        long __functionAddress = Functions.CompoundShape_calculatePrincipalAxisTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPV(obj, masses, principal, inertia, __functionAddress);
    }

    public static void btCompoundShape_calculatePrincipalAxisTransform(@NativeType("void *") long obj, @NativeType("btScalar *") FloatBuffer masses, @NativeType("btTransform *") BTTransform principal, @NativeType("btVector3 *") ΒΤVector3 inertia) {
        nbtCompoundShape_calculatePrincipalAxisTransform(obj, memAddress(masses), principal.address(), inertia.address());
    }

    // --- [ btCompoundShape_createAabbTreeFromChildren ] ---

    public static void btCompoundShape_createAabbTreeFromChildren(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CompoundShape_createAabbTreeFromChildren;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btCompoundShape_getChildList ] ---

    @NativeType("void *")
    public static long btCompoundShape_getChildList(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CompoundShape_getChildList;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCompoundShape_getChildShape ] ---

    @NativeType("void *")
    public static long btCompoundShape_getChildShape(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.CompoundShape_getChildShape;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btCompoundShape_getChildTransform ] ---

    public static void nbtCompoundShape_getChildTransform(long obj, int index, long value) {
        long __functionAddress = Functions.CompoundShape_getChildTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, index, value, __functionAddress);
    }

    public static void btCompoundShape_getChildTransform(@NativeType("void *") long obj, int index, @NativeType("btTransform *") BTTransform value) {
        nbtCompoundShape_getChildTransform(obj, index, value.address());
    }

    // --- [ btCompoundShape_getDynamicAabbTree ] ---

    @NativeType("void *")
    public static long btCompoundShape_getDynamicAabbTree(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CompoundShape_getDynamicAabbTree;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCompoundShape_getNumChildShapes ] ---

    public static int btCompoundShape_getNumChildShapes(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CompoundShape_getNumChildShapes;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCompoundShape_getUpdateRevision ] ---

    public static int btCompoundShape_getUpdateRevision(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CompoundShape_getUpdateRevision;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCompoundShape_recalculateLocalAabb ] ---

    public static void btCompoundShape_recalculateLocalAabb(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CompoundShape_recalculateLocalAabb;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btCompoundShape_removeChildShape ] ---

    public static void btCompoundShape_removeChildShape(@NativeType("void *") long obj, @NativeType("void *") long shape) {
        long __functionAddress = Functions.CompoundShape_removeChildShape;
        if (CHECKS) {
            check(obj);
            check(shape);
        }
        invokePPV(obj, shape, __functionAddress);
    }

    // --- [ btCompoundShape_removeChildShapeByIndex ] ---

    public static void btCompoundShape_removeChildShapeByIndex(@NativeType("void *") long obj, int childShapeindex) {
        long __functionAddress = Functions.CompoundShape_removeChildShapeByIndex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, childShapeindex, __functionAddress);
    }

    // --- [ btCompoundShape_updateChildTransform ] ---

    public static void nbtCompoundShape_updateChildTransform(long obj, int childIndex, long newChildTransform, boolean shouldRecalculateLocalAabb) {
        long __functionAddress = Functions.CompoundShape_updateChildTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, childIndex, newChildTransform, shouldRecalculateLocalAabb, __functionAddress);
    }

    public static void btCompoundShape_updateChildTransform(@NativeType("void *") long obj, int childIndex, @NativeType("btTransform const *") BTTransform newChildTransform, @NativeType("bool") boolean shouldRecalculateLocalAabb) {
        nbtCompoundShape_updateChildTransform(obj, childIndex, newChildTransform.address(), shouldRecalculateLocalAabb);
    }

}