/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class BTBroadphaseProxy {

    protected BTBroadphaseProxy() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            BroadphaseProxy_getAabbMax              = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseProxy_getAabbMax"),
            BroadphaseProxy_getAabbMin              = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseProxy_getAabbMin"),
            BroadphaseProxy_getClientObject         = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseProxy_getClientObject"),
            BroadphaseProxy_getCollisionFilterGroup = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseProxy_getCollisionFilterGroup"),
            BroadphaseProxy_getCollisionFilterMask  = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseProxy_getCollisionFilterMask"),
            BroadphaseProxy_getUid                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseProxy_getUid"),
            BroadphaseProxy_getUniqueId             = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseProxy_getUniqueId"),
            BroadphaseProxy_isCompound              = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseProxy_isCompound"),
            BroadphaseProxy_isConcave               = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseProxy_isConcave"),
            BroadphaseProxy_isConvex                = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseProxy_isConvex"),
            BroadphaseProxy_isConvex2d              = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseProxy_isConvex2d"),
            BroadphaseProxy_isInfinite              = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseProxy_isInfinite"),
            BroadphaseProxy_isNonMoving             = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseProxy_isNonMoving"),
            BroadphaseProxy_isPolyhedral            = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseProxy_isPolyhedral"),
            BroadphaseProxy_isSoftBody              = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseProxy_isSoftBody"),
            BroadphaseProxy_setAabbMax              = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseProxy_setAabbMax"),
            BroadphaseProxy_setAabbMin              = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseProxy_setAabbMin"),
            BroadphaseProxy_setClientObject         = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseProxy_setClientObject"),
            BroadphaseProxy_setCollisionFilterGroup = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseProxy_setCollisionFilterGroup"),
            BroadphaseProxy_setCollisionFilterMask  = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseProxy_setCollisionFilterMask"),
            BroadphaseProxy_setUniqueId             = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseProxy_setUniqueId"),
            BroadphaseProxy_delete                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseProxy_delete"),
            BroadphasePair_new                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphasePair_new"),
            BroadphasePair_new2                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphasePair_new2"),
            BroadphasePair_new3                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphasePair_new3"),
            BroadphasePair_getAlgorithm             = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphasePair_getAlgorithm"),
            BroadphasePair_getPProxy0               = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphasePair_getPProxy0"),
            BroadphasePair_getPProxy1               = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphasePair_getPProxy1"),
            BroadphasePair_setAlgorithm             = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphasePair_setAlgorithm"),
            BroadphasePair_setPProxy0               = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphasePair_setPProxy0"),
            BroadphasePair_setPProxy1               = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphasePair_setPProxy1"),
            BroadphasePair_delete                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphasePair_delete");

    }

    // --- [ btBroadphaseProxy_getAabbMax ] ---

    public static void nbtBroadphaseProxy_getAabbMax(long obj, long value) {
        long __functionAddress = Functions.BroadphaseProxy_getAabbMax;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btBroadphaseProxy_getAabbMax(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtBroadphaseProxy_getAabbMax(obj, value.address());
    }

    // --- [ btBroadphaseProxy_getAabbMin ] ---

    public static void nbtBroadphaseProxy_getAabbMin(long obj, long value) {
        long __functionAddress = Functions.BroadphaseProxy_getAabbMin;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btBroadphaseProxy_getAabbMin(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtBroadphaseProxy_getAabbMin(obj, value.address());
    }

    // --- [ btBroadphaseProxy_getClientObject ] ---

    @NativeType("void *")
    public static long btBroadphaseProxy_getClientObject(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BroadphaseProxy_getClientObject;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btBroadphaseProxy_getCollisionFilterGroup ] ---

    public static int btBroadphaseProxy_getCollisionFilterGroup(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BroadphaseProxy_getCollisionFilterGroup;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btBroadphaseProxy_getCollisionFilterMask ] ---

    public static int btBroadphaseProxy_getCollisionFilterMask(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BroadphaseProxy_getCollisionFilterMask;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btBroadphaseProxy_getUid ] ---

    public static int btBroadphaseProxy_getUid(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BroadphaseProxy_getUid;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btBroadphaseProxy_getUniqueId ] ---

    public static int btBroadphaseProxy_getUniqueId(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BroadphaseProxy_getUniqueId;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btBroadphaseProxy_isCompound ] ---

    @NativeType("bool")
    public static boolean btBroadphaseProxy_isCompound(int proxyType) {
        long __functionAddress = Functions.BroadphaseProxy_isCompound;
        return invokeZ(proxyType, __functionAddress);
    }

    // --- [ btBroadphaseProxy_isConcave ] ---

    @NativeType("bool")
    public static boolean btBroadphaseProxy_isConcave(int proxyType) {
        long __functionAddress = Functions.BroadphaseProxy_isConcave;
        return invokeZ(proxyType, __functionAddress);
    }

    // --- [ btBroadphaseProxy_isConvex ] ---

    @NativeType("bool")
    public static boolean btBroadphaseProxy_isConvex(int proxyType) {
        long __functionAddress = Functions.BroadphaseProxy_isConvex;
        return invokeZ(proxyType, __functionAddress);
    }

    // --- [ btBroadphaseProxy_isConvex2d ] ---

    @NativeType("bool")
    public static boolean btBroadphaseProxy_isConvex2d(int proxyType) {
        long __functionAddress = Functions.BroadphaseProxy_isConvex2d;
        return invokeZ(proxyType, __functionAddress);
    }

    // --- [ btBroadphaseProxy_isInfinite ] ---

    @NativeType("bool")
    public static boolean btBroadphaseProxy_isInfinite(int proxyType) {
        long __functionAddress = Functions.BroadphaseProxy_isInfinite;
        return invokeZ(proxyType, __functionAddress);
    }

    // --- [ btBroadphaseProxy_isNonMoving ] ---

    @NativeType("bool")
    public static boolean btBroadphaseProxy_isNonMoving(int proxyType) {
        long __functionAddress = Functions.BroadphaseProxy_isNonMoving;
        return invokeZ(proxyType, __functionAddress);
    }

    // --- [ btBroadphaseProxy_isPolyhedral ] ---

    @NativeType("bool")
    public static boolean btBroadphaseProxy_isPolyhedral(int proxyType) {
        long __functionAddress = Functions.BroadphaseProxy_isPolyhedral;
        return invokeZ(proxyType, __functionAddress);
    }

    // --- [ btBroadphaseProxy_isSoftBody ] ---

    @NativeType("bool")
    public static boolean btBroadphaseProxy_isSoftBody(int proxyType) {
        long __functionAddress = Functions.BroadphaseProxy_isSoftBody;
        return invokeZ(proxyType, __functionAddress);
    }

    // --- [ btBroadphaseProxy_setAabbMax ] ---

    public static void nbtBroadphaseProxy_setAabbMax(long obj, long value) {
        long __functionAddress = Functions.BroadphaseProxy_setAabbMax;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btBroadphaseProxy_setAabbMax(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtBroadphaseProxy_setAabbMax(obj, value.address());
    }

    // --- [ btBroadphaseProxy_setAabbMin ] ---

    public static void nbtBroadphaseProxy_setAabbMin(long obj, long value) {
        long __functionAddress = Functions.BroadphaseProxy_setAabbMin;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btBroadphaseProxy_setAabbMin(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtBroadphaseProxy_setAabbMin(obj, value.address());
    }

    // --- [ btBroadphaseProxy_setClientObject ] ---

    public static void btBroadphaseProxy_setClientObject(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.BroadphaseProxy_setClientObject;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btBroadphaseProxy_setCollisionFilterGroup ] ---

    public static void btBroadphaseProxy_setCollisionFilterGroup(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.BroadphaseProxy_setCollisionFilterGroup;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btBroadphaseProxy_setCollisionFilterMask ] ---

    public static void btBroadphaseProxy_setCollisionFilterMask(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.BroadphaseProxy_setCollisionFilterMask;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btBroadphaseProxy_setUniqueId ] ---

    public static void btBroadphaseProxy_setUniqueId(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.BroadphaseProxy_setUniqueId;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btBroadphaseProxy_delete ] ---

    public static void btBroadphaseProxy_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BroadphaseProxy_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btBroadphasePair_new ] ---

    @NativeType("void *")
    public static long btBroadphasePair_new() {
        long __functionAddress = Functions.BroadphasePair_new;
        return invokeP(__functionAddress);
    }

    // --- [ btBroadphasePair_new2 ] ---

    @NativeType("void *")
    public static long btBroadphasePair_new2(@NativeType("void *") long other) {
        long __functionAddress = Functions.BroadphasePair_new2;
        if (CHECKS) {
            check(other);
        }
        return invokePP(other, __functionAddress);
    }

    // --- [ btBroadphasePair_new3 ] ---

    @NativeType("void *")
    public static long btBroadphasePair_new3(@NativeType("void *") long proxy0, @NativeType("void *") long proxy1) {
        long __functionAddress = Functions.BroadphasePair_new3;
        if (CHECKS) {
            check(proxy0);
            check(proxy1);
        }
        return invokePPP(proxy0, proxy1, __functionAddress);
    }

    // --- [ btBroadphasePair_getAlgorithm ] ---

    @NativeType("void *")
    public static long btBroadphasePair_getAlgorithm(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BroadphasePair_getAlgorithm;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btBroadphasePair_getPProxy0 ] ---

    @NativeType("void *")
    public static long btBroadphasePair_getPProxy0(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BroadphasePair_getPProxy0;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btBroadphasePair_getPProxy1 ] ---

    @NativeType("void *")
    public static long btBroadphasePair_getPProxy1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BroadphasePair_getPProxy1;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btBroadphasePair_setAlgorithm ] ---

    public static void btBroadphasePair_setAlgorithm(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.BroadphasePair_setAlgorithm;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btBroadphasePair_setPProxy0 ] ---

    public static void btBroadphasePair_setPProxy0(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.BroadphasePair_setPProxy0;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btBroadphasePair_setPProxy1 ] ---

    public static void btBroadphasePair_setPProxy1(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.BroadphasePair_setPProxy1;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btBroadphasePair_delete ] ---

    public static void btBroadphasePair_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BroadphasePair_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}