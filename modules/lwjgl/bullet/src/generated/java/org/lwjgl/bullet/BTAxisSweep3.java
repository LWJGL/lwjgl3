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

public class BTAxisSweep3 {

    protected BTAxisSweep3() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            AxisSweep3_new                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btAxisSweep3_new"),
            AxisSweep3_addHandle                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btAxisSweep3_addHandle"),
            AxisSweep3_getHandle                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btAxisSweep3_getHandle"),
            AxisSweep3_getNumHandles                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btAxisSweep3_getNumHandles"),
            AxisSweep3_getOverlappingPairUserCallback        = apiGetFunctionAddress(LibBullet.getLibrary(), "btAxisSweep3_getOverlappingPairUserCallback"),
            AxisSweep3_quantize                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btAxisSweep3_quantize"),
            AxisSweep3_removeHandle                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btAxisSweep3_removeHandle"),
            AxisSweep3_setOverlappingPairUserCallback        = apiGetFunctionAddress(LibBullet.getLibrary(), "btAxisSweep3_setOverlappingPairUserCallback"),
            AxisSweep3_testAabbOverlap                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btAxisSweep3_testAabbOverlap"),
            AxisSweep3_unQuantize                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btAxisSweep3_unQuantize"),
            AxisSweep3_updateHandle                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btAxisSweep3_updateHandle"),
            bt32BitAxisSweep3_new                            = apiGetFunctionAddress(LibBullet.getLibrary(), "bt32BitAxisSweep3_new"),
            bt32BitAxisSweep3_addHandle                      = apiGetFunctionAddress(LibBullet.getLibrary(), "bt32BitAxisSweep3_addHandle"),
            bt32BitAxisSweep3_getHandle                      = apiGetFunctionAddress(LibBullet.getLibrary(), "bt32BitAxisSweep3_getHandle"),
            bt32BitAxisSweep3_getNumHandles                  = apiGetFunctionAddress(LibBullet.getLibrary(), "bt32BitAxisSweep3_getNumHandles"),
            bt32BitAxisSweep3_getOverlappingPairUserCallback = apiGetFunctionAddress(LibBullet.getLibrary(), "bt32BitAxisSweep3_getOverlappingPairUserCallback"),
            bt32BitAxisSweep3_quantize                       = apiGetFunctionAddress(LibBullet.getLibrary(), "bt32BitAxisSweep3_quantize"),
            bt32BitAxisSweep3_removeHandle                   = apiGetFunctionAddress(LibBullet.getLibrary(), "bt32BitAxisSweep3_removeHandle"),
            bt32BitAxisSweep3_setOverlappingPairUserCallback = apiGetFunctionAddress(LibBullet.getLibrary(), "bt32BitAxisSweep3_setOverlappingPairUserCallback"),
            bt32BitAxisSweep3_testAabbOverlap                = apiGetFunctionAddress(LibBullet.getLibrary(), "bt32BitAxisSweep3_testAabbOverlap"),
            bt32BitAxisSweep3_unQuantize                     = apiGetFunctionAddress(LibBullet.getLibrary(), "bt32BitAxisSweep3_unQuantize"),
            bt32BitAxisSweep3_updateHandle                   = apiGetFunctionAddress(LibBullet.getLibrary(), "bt32BitAxisSweep3_updateHandle");

    }

    // --- [ btAxisSweep3_new ] ---

    public static long nbtAxisSweep3_new(long worldAabbMin, long worldAabbMax, short maxHandles, long pairCache, boolean disableRaycastAccelerator) {
        long __functionAddress = Functions.AxisSweep3_new;
        if (CHECKS) {
            check(pairCache);
        }
        return invokePPPP(worldAabbMin, worldAabbMax, maxHandles, pairCache, disableRaycastAccelerator, __functionAddress);
    }

    @NativeType("void *")
    public static long btAxisSweep3_new(@NativeType("btVector3 const *") ΒΤVector3 worldAabbMin, @NativeType("btVector3 const *") ΒΤVector3 worldAabbMax, @NativeType("unsigned short") short maxHandles, @NativeType("void *") long pairCache, @NativeType("bool") boolean disableRaycastAccelerator) {
        return nbtAxisSweep3_new(worldAabbMin.address(), worldAabbMax.address(), maxHandles, pairCache, disableRaycastAccelerator);
    }

    // --- [ btAxisSweep3_addHandle ] ---

    public static short nbtAxisSweep3_addHandle(long obj, long aabbMin, long aabbMax, long pOwner, int collisionFilterGroup, int collisionFilterMask, long dispatcher) {
        long __functionAddress = Functions.AxisSweep3_addHandle;
        if (CHECKS) {
            check(obj);
            check(pOwner);
            check(dispatcher);
        }
        return invokePPPPPS(obj, aabbMin, aabbMax, pOwner, collisionFilterGroup, collisionFilterMask, dispatcher, __functionAddress);
    }

    @NativeType("unsigned short")
    public static short btAxisSweep3_addHandle(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 aabbMin, @NativeType("btVector3 const *") ΒΤVector3 aabbMax, @NativeType("void *") long pOwner, int collisionFilterGroup, int collisionFilterMask, @NativeType("void *") long dispatcher) {
        return nbtAxisSweep3_addHandle(obj, aabbMin.address(), aabbMax.address(), pOwner, collisionFilterGroup, collisionFilterMask, dispatcher);
    }

    // --- [ btAxisSweep3_getHandle ] ---

    @NativeType("void *")
    public static long btAxisSweep3_getHandle(@NativeType("void *") long obj, @NativeType("unsigned short") short index) {
        long __functionAddress = Functions.AxisSweep3_getHandle;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btAxisSweep3_getNumHandles ] ---

    @NativeType("unsigned short")
    public static short btAxisSweep3_getNumHandles(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AxisSweep3_getNumHandles;
        if (CHECKS) {
            check(obj);
        }
        return invokePS(obj, __functionAddress);
    }

    // --- [ btAxisSweep3_getOverlappingPairUserCallback ] ---

    @NativeType("void *")
    public static long btAxisSweep3_getOverlappingPairUserCallback(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AxisSweep3_getOverlappingPairUserCallback;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btAxisSweep3_quantize ] ---

    public static void nbtAxisSweep3_quantize(long obj, long out, long point, int isMax) {
        long __functionAddress = Functions.AxisSweep3_quantize;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, out, point, isMax, __functionAddress);
    }

    public static void btAxisSweep3_quantize(@NativeType("void *") long obj, @NativeType("unsigned short *") ShortBuffer out, @NativeType("btVector3 const *") ΒΤVector3 point, int isMax) {
        nbtAxisSweep3_quantize(obj, memAddress(out), point.address(), isMax);
    }

    // --- [ btAxisSweep3_removeHandle ] ---

    public static void btAxisSweep3_removeHandle(@NativeType("void *") long obj, @NativeType("unsigned short") short handle, @NativeType("void *") long dispatcher) {
        long __functionAddress = Functions.AxisSweep3_removeHandle;
        if (CHECKS) {
            check(obj);
            check(dispatcher);
        }
        invokePPV(obj, handle, dispatcher, __functionAddress);
    }

    // --- [ btAxisSweep3_setOverlappingPairUserCallback ] ---

    public static void btAxisSweep3_setOverlappingPairUserCallback(@NativeType("void *") long obj, @NativeType("void *") long pairCallback) {
        long __functionAddress = Functions.AxisSweep3_setOverlappingPairUserCallback;
        if (CHECKS) {
            check(obj);
            check(pairCallback);
        }
        invokePPV(obj, pairCallback, __functionAddress);
    }

    // --- [ btAxisSweep3_testAabbOverlap ] ---

    @NativeType("bool")
    public static boolean btAxisSweep3_testAabbOverlap(@NativeType("void *") long obj, @NativeType("void *") long proxy0, @NativeType("void *") long proxy1) {
        long __functionAddress = Functions.AxisSweep3_testAabbOverlap;
        if (CHECKS) {
            check(obj);
            check(proxy0);
            check(proxy1);
        }
        return invokePPPZ(obj, proxy0, proxy1, __functionAddress);
    }

    // --- [ btAxisSweep3_unQuantize ] ---

    public static void nbtAxisSweep3_unQuantize(long obj, long proxy, long aabbMin, long aabbMax) {
        long __functionAddress = Functions.AxisSweep3_unQuantize;
        if (CHECKS) {
            check(obj);
            check(proxy);
        }
        invokePPPPV(obj, proxy, aabbMin, aabbMax, __functionAddress);
    }

    public static void btAxisSweep3_unQuantize(@NativeType("void *") long obj, @NativeType("void *") long proxy, @NativeType("btVector3 *") ΒΤVector3 aabbMin, @NativeType("btVector3 *") ΒΤVector3 aabbMax) {
        nbtAxisSweep3_unQuantize(obj, proxy, aabbMin.address(), aabbMax.address());
    }

    // --- [ btAxisSweep3_updateHandle ] ---

    public static void nbtAxisSweep3_updateHandle(long obj, short handle, long aabbMin, long aabbMax, long dispatcher) {
        long __functionAddress = Functions.AxisSweep3_updateHandle;
        if (CHECKS) {
            check(obj);
            check(dispatcher);
        }
        invokePPPPV(obj, handle, aabbMin, aabbMax, dispatcher, __functionAddress);
    }

    public static void btAxisSweep3_updateHandle(@NativeType("void *") long obj, @NativeType("unsigned short") short handle, @NativeType("btVector3 const *") ΒΤVector3 aabbMin, @NativeType("btVector3 const *") ΒΤVector3 aabbMax, @NativeType("void *") long dispatcher) {
        nbtAxisSweep3_updateHandle(obj, handle, aabbMin.address(), aabbMax.address(), dispatcher);
    }

    // --- [ bt32BitAxisSweep3_new ] ---

    public static long nbt32BitAxisSweep3_new(long worldAabbMin, long worldAabbMax, int maxHandles, long pairCache, boolean disableRaycastAccelerator) {
        long __functionAddress = Functions.bt32BitAxisSweep3_new;
        if (CHECKS) {
            check(pairCache);
        }
        return invokePPPP(worldAabbMin, worldAabbMax, maxHandles, pairCache, disableRaycastAccelerator, __functionAddress);
    }

    @NativeType("void *")
    public static long bt32BitAxisSweep3_new(@NativeType("btVector3 const *") ΒΤVector3 worldAabbMin, @NativeType("btVector3 const *") ΒΤVector3 worldAabbMax, @NativeType("unsigned int") int maxHandles, @NativeType("void *") long pairCache, @NativeType("bool") boolean disableRaycastAccelerator) {
        return nbt32BitAxisSweep3_new(worldAabbMin.address(), worldAabbMax.address(), maxHandles, pairCache, disableRaycastAccelerator);
    }

    // --- [ bt32BitAxisSweep3_addHandle ] ---

    public static int nbt32BitAxisSweep3_addHandle(long obj, long aabbMin, long aabbMax, long pOwner, int collisionFilterGroup, int collisionFilterMask, long dispatchery) {
        long __functionAddress = Functions.bt32BitAxisSweep3_addHandle;
        if (CHECKS) {
            check(obj);
            check(pOwner);
            check(dispatchery);
        }
        return invokePPPPPI(obj, aabbMin, aabbMax, pOwner, collisionFilterGroup, collisionFilterMask, dispatchery, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int bt32BitAxisSweep3_addHandle(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 aabbMin, @NativeType("btVector3 const *") ΒΤVector3 aabbMax, @NativeType("void *") long pOwner, int collisionFilterGroup, int collisionFilterMask, @NativeType("void *") long dispatchery) {
        return nbt32BitAxisSweep3_addHandle(obj, aabbMin.address(), aabbMax.address(), pOwner, collisionFilterGroup, collisionFilterMask, dispatchery);
    }

    // --- [ bt32BitAxisSweep3_getHandle ] ---

    @NativeType("void *")
    public static long bt32BitAxisSweep3_getHandle(@NativeType("void *") long obj, @NativeType("unsigned int") int index) {
        long __functionAddress = Functions.bt32BitAxisSweep3_getHandle;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ bt32BitAxisSweep3_getNumHandles ] ---

    @NativeType("unsigned int")
    public static int bt32BitAxisSweep3_getNumHandles(@NativeType("void *") long obj) {
        long __functionAddress = Functions.bt32BitAxisSweep3_getNumHandles;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ bt32BitAxisSweep3_getOverlappingPairUserCallback ] ---

    @NativeType("void *")
    public static long bt32BitAxisSweep3_getOverlappingPairUserCallback(@NativeType("void *") long obj) {
        long __functionAddress = Functions.bt32BitAxisSweep3_getOverlappingPairUserCallback;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ bt32BitAxisSweep3_quantize ] ---

    public static void nbt32BitAxisSweep3_quantize(long obj, long out, long point, int isMax) {
        long __functionAddress = Functions.bt32BitAxisSweep3_quantize;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, out, point, isMax, __functionAddress);
    }

    public static void bt32BitAxisSweep3_quantize(@NativeType("void *") long obj, @NativeType("unsigned int *") IntBuffer out, @NativeType("btVector3 const *") ΒΤVector3 point, int isMax) {
        nbt32BitAxisSweep3_quantize(obj, memAddress(out), point.address(), isMax);
    }

    // --- [ bt32BitAxisSweep3_removeHandle ] ---

    public static void bt32BitAxisSweep3_removeHandle(@NativeType("void *") long obj, @NativeType("unsigned int") int handle, @NativeType("void *") long dispatcher) {
        long __functionAddress = Functions.bt32BitAxisSweep3_removeHandle;
        if (CHECKS) {
            check(obj);
            check(dispatcher);
        }
        invokePPV(obj, handle, dispatcher, __functionAddress);
    }

    // --- [ bt32BitAxisSweep3_setOverlappingPairUserCallback ] ---

    public static void bt32BitAxisSweep3_setOverlappingPairUserCallback(@NativeType("void *") long obj, @NativeType("void *") long pairCallback) {
        long __functionAddress = Functions.bt32BitAxisSweep3_setOverlappingPairUserCallback;
        if (CHECKS) {
            check(obj);
            check(pairCallback);
        }
        invokePPV(obj, pairCallback, __functionAddress);
    }

    // --- [ bt32BitAxisSweep3_testAabbOverlap ] ---

    @NativeType("bool")
    public static boolean bt32BitAxisSweep3_testAabbOverlap(@NativeType("void *") long obj, @NativeType("void *") long proxy0, @NativeType("void *") long proxy1) {
        long __functionAddress = Functions.bt32BitAxisSweep3_testAabbOverlap;
        if (CHECKS) {
            check(obj);
            check(proxy0);
            check(proxy1);
        }
        return invokePPPZ(obj, proxy0, proxy1, __functionAddress);
    }

    // --- [ bt32BitAxisSweep3_unQuantize ] ---

    public static void nbt32BitAxisSweep3_unQuantize(long obj, long proxy, long aabbMin, long aabbMax) {
        long __functionAddress = Functions.bt32BitAxisSweep3_unQuantize;
        if (CHECKS) {
            check(obj);
            check(proxy);
        }
        invokePPPPV(obj, proxy, aabbMin, aabbMax, __functionAddress);
    }

    public static void bt32BitAxisSweep3_unQuantize(@NativeType("void *") long obj, @NativeType("void *") long proxy, @NativeType("btVector3 *") ΒΤVector3 aabbMin, @NativeType("btVector3 *") ΒΤVector3 aabbMax) {
        nbt32BitAxisSweep3_unQuantize(obj, proxy, aabbMin.address(), aabbMax.address());
    }

    // --- [ bt32BitAxisSweep3_updateHandle ] ---

    public static void nbt32BitAxisSweep3_updateHandle(long obj, int handle, long aabbMin, long aabbMax, long dispatcher) {
        long __functionAddress = Functions.bt32BitAxisSweep3_updateHandle;
        if (CHECKS) {
            check(obj);
            check(dispatcher);
        }
        invokePPPPV(obj, handle, aabbMin, aabbMax, dispatcher, __functionAddress);
    }

    public static void bt32BitAxisSweep3_updateHandle(@NativeType("void *") long obj, @NativeType("unsigned int") int handle, @NativeType("btVector3 const *") ΒΤVector3 aabbMin, @NativeType("btVector3 const *") ΒΤVector3 aabbMax, @NativeType("void *") long dispatcher) {
        nbt32BitAxisSweep3_updateHandle(obj, handle, aabbMin.address(), aabbMax.address(), dispatcher);
    }

}