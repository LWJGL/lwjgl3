/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BTDbvt {

    protected BTDbvt() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            DbvtAabbMm_new             = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtAabbMm_new"),
            DbvtAabbMm_Center          = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtAabbMm_Center"),
            DbvtAabbMm_Classify        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtAabbMm_Classify"),
            DbvtAabbMm_Contain         = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtAabbMm_Contain"),
            DbvtAabbMm_Expand          = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtAabbMm_Expand"),
            DbvtAabbMm_Extents         = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtAabbMm_Extents"),
            DbvtAabbMm_FromCE          = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtAabbMm_FromCE"),
            DbvtAabbMm_FromCR          = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtAabbMm_FromCR"),
            DbvtAabbMm_FromMM          = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtAabbMm_FromMM"),
            DbvtAabbMm_FromPoints      = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtAabbMm_FromPoints"),
            DbvtAabbMm_FromPoints2     = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtAabbMm_FromPoints2"),
            DbvtAabbMm_Lengths         = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtAabbMm_Lengths"),
            DbvtAabbMm_Maxs            = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtAabbMm_Maxs"),
            DbvtAabbMm_Mins            = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtAabbMm_Mins"),
            DbvtAabbMm_ProjectMinimum  = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtAabbMm_ProjectMinimum"),
            DbvtAabbMm_SignedExpand    = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtAabbMm_SignedExpand"),
            DbvtAabbMm_tMaxs           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtAabbMm_tMaxs"),
            DbvtAabbMm_tMins           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtAabbMm_tMins"),
            DbvtAabbMm_delete          = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtAabbMm_delete"),
            DbvtNode_new               = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtNode_new"),
            DbvtNode_getChilds         = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtNode_getChilds"),
            DbvtNode_getData           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtNode_getData"),
            DbvtNode_getDataAsInt      = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtNode_getDataAsInt"),
            DbvtNode_getParent         = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtNode_getParent"),
            DbvtNode_getVolume         = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtNode_getVolume"),
            DbvtNode_isinternal        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtNode_isinternal"),
            DbvtNode_isleaf            = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtNode_isleaf"),
            DbvtNode_setData           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtNode_setData"),
            DbvtNode_setDataAsInt      = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtNode_setDataAsInt"),
            DbvtNode_setParent         = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtNode_setParent"),
            DbvtNode_delete            = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtNode_delete"),
            Dbvt_IClone_new            = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_IClone_new"),
            Dbvt_IClone_CloneLeaf      = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_IClone_CloneLeaf"),
            Dbvt_IClone_delete         = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_IClone_delete"),
            Dbvt_ICollide_new          = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_ICollide_new"),
            Dbvt_ICollide_AllLeaves    = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_ICollide_AllLeaves"),
            Dbvt_ICollide_Descent      = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_ICollide_Descent"),
            Dbvt_ICollide_Process      = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_ICollide_Process"),
            Dbvt_ICollide_Process2     = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_ICollide_Process2"),
            Dbvt_ICollide_Process3     = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_ICollide_Process3"),
            Dbvt_ICollide_delete       = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_ICollide_delete"),
            Dbvt_IWriter_Prepare       = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_IWriter_Prepare"),
            Dbvt_IWriter_WriteLeaf     = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_IWriter_WriteLeaf"),
            Dbvt_IWriter_WriteNode     = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_IWriter_WriteNode"),
            Dbvt_IWriter_delete        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_IWriter_delete"),
            Dbvt_sStkCLN_new           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkCLN_new"),
            Dbvt_sStkCLN_getNode       = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkCLN_getNode"),
            Dbvt_sStkCLN_getParent     = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkCLN_getParent"),
            Dbvt_sStkCLN_setNode       = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkCLN_setNode"),
            Dbvt_sStkCLN_setParent     = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkCLN_setParent"),
            Dbvt_sStkCLN_delete        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkCLN_delete"),
            Dbvt_sStkNN_new            = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkNN_new"),
            Dbvt_sStkNN_new2           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkNN_new2"),
            Dbvt_sStkNN_getA           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkNN_getA"),
            Dbvt_sStkNN_getB           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkNN_getB"),
            Dbvt_sStkNN_setA           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkNN_setA"),
            Dbvt_sStkNN_setB           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkNN_setB"),
            Dbvt_sStkNN_delete         = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkNN_delete"),
            Dbvt_sStkNP_new            = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkNP_new"),
            Dbvt_sStkNP_getMask        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkNP_getMask"),
            Dbvt_sStkNP_getNode        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkNP_getNode"),
            Dbvt_sStkNP_setMask        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkNP_setMask"),
            Dbvt_sStkNP_setNode        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkNP_setNode"),
            Dbvt_sStkNP_delete         = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkNP_delete"),
            Dbvt_sStkNPS_new           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkNPS_new"),
            Dbvt_sStkNPS_new2          = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkNPS_new2"),
            Dbvt_sStkNPS_getMask       = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkNPS_getMask"),
            Dbvt_sStkNPS_getNode       = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkNPS_getNode"),
            Dbvt_sStkNPS_getValue      = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkNPS_getValue"),
            Dbvt_sStkNPS_setMask       = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkNPS_setMask"),
            Dbvt_sStkNPS_setNode       = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkNPS_setNode"),
            Dbvt_sStkNPS_setValue      = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkNPS_setValue"),
            Dbvt_sStkNPS_delete        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_sStkNPS_delete"),
            Dbvt_allocate              = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_allocate"),
            Dbvt_benchmark             = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_benchmark"),
            Dbvt_clear                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_clear"),
            Dbvt_clone                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_clone"),
            Dbvt_clone2                = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_clone2"),
            Dbvt_countLeaves           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_countLeaves"),
            Dbvt_empty                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_empty"),
            Dbvt_extractLeaves         = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_extractLeaves"),
            Dbvt_getFree               = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_getFree"),
            Dbvt_getLeaves             = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_getLeaves"),
            Dbvt_getLkhd               = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_getLkhd"),
            Dbvt_getOpath              = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_getOpath"),
            Dbvt_getRoot               = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_getRoot"),
            Dbvt_getStkStack           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_getStkStack"),
            Dbvt_insert                = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_insert"),
            Dbvt_maxdepth              = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_maxdepth"),
            Dbvt_nearest               = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_nearest"),
            Dbvt_optimizeBottomUp      = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_optimizeBottomUp"),
            Dbvt_optimizeIncremental   = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_optimizeIncremental"),
            Dbvt_optimizeTopDown       = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_optimizeTopDown"),
            Dbvt_optimizeTopDown2      = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_optimizeTopDown2"),
            Dbvt_remove                = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_remove"),
            Dbvt_setFree               = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_setFree"),
            Dbvt_setLeaves             = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_setLeaves"),
            Dbvt_setLkhd               = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_setLkhd"),
            Dbvt_setOpath              = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_setOpath"),
            Dbvt_setRoot               = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_setRoot"),
            Dbvt_update                = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_update"),
            Dbvt_update2               = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_update2"),
            Dbvt_update3               = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_update3"),
            Dbvt_update4               = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_update4"),
            Dbvt_update5               = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_update5"),
            Dbvt_update6               = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_update6"),
            Dbvt_write                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_write"),
            Dbvt_array_at              = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_array_at"),
            Dbvt_array_index_of        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvt_array_index_of"),
            DbvtNodePtr_array_at       = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtNodePtr_array_at"),
            DbvtNodePtr_array_index_of = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtNodePtr_array_index_of");

    }

    // --- [ btDbvtAabbMm_new ] ---

    @NativeType("void *")
    public static long btDbvtAabbMm_new() {
        long __functionAddress = Functions.DbvtAabbMm_new;
        return invokeP(__functionAddress);
    }

    // --- [ btDbvtAabbMm_Center ] ---

    public static void nbtDbvtAabbMm_Center(long obj, long value) {
        long __functionAddress = Functions.DbvtAabbMm_Center;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btDbvtAabbMm_Center(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtDbvtAabbMm_Center(obj, value.address());
    }

    // --- [ btDbvtAabbMm_Classify ] ---

    public static int nbtDbvtAabbMm_Classify(long obj, long n, float o, int s) {
        long __functionAddress = Functions.DbvtAabbMm_Classify;
        if (CHECKS) {
            check(obj);
        }
        return invokePPI(obj, n, o, s, __functionAddress);
    }

    public static int btDbvtAabbMm_Classify(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 n, @NativeType("btScalar") float o, int s) {
        return nbtDbvtAabbMm_Classify(obj, n.address(), o, s);
    }

    // --- [ btDbvtAabbMm_Contain ] ---

    @NativeType("bool")
    public static boolean btDbvtAabbMm_Contain(@NativeType("void *") long obj, @NativeType("void *") long a) {
        long __functionAddress = Functions.DbvtAabbMm_Contain;
        if (CHECKS) {
            check(obj);
            check(a);
        }
        return invokePPZ(obj, a, __functionAddress);
    }

    // --- [ btDbvtAabbMm_Expand ] ---

    public static void nbtDbvtAabbMm_Expand(long obj, long e) {
        long __functionAddress = Functions.DbvtAabbMm_Expand;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, e, __functionAddress);
    }

    public static void btDbvtAabbMm_Expand(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 e) {
        nbtDbvtAabbMm_Expand(obj, e.address());
    }

    // --- [ btDbvtAabbMm_Extents ] ---

    public static void nbtDbvtAabbMm_Extents(long obj, long value) {
        long __functionAddress = Functions.DbvtAabbMm_Extents;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btDbvtAabbMm_Extents(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtDbvtAabbMm_Extents(obj, value.address());
    }

    // --- [ btDbvtAabbMm_FromCE ] ---

    public static long nbtDbvtAabbMm_FromCE(long c, long e) {
        long __functionAddress = Functions.DbvtAabbMm_FromCE;
        return invokePPP(c, e, __functionAddress);
    }

    @NativeType("void *")
    public static long btDbvtAabbMm_FromCE(@NativeType("btVector3 const *") BTVector3 c, @NativeType("btVector3 const *") BTVector3 e) {
        return nbtDbvtAabbMm_FromCE(c.address(), e.address());
    }

    // --- [ btDbvtAabbMm_FromCR ] ---

    public static long nbtDbvtAabbMm_FromCR(long c, float r) {
        long __functionAddress = Functions.DbvtAabbMm_FromCR;
        return invokePP(c, r, __functionAddress);
    }

    @NativeType("void *")
    public static long btDbvtAabbMm_FromCR(@NativeType("btVector3 const *") BTVector3 c, @NativeType("btScalar") float r) {
        return nbtDbvtAabbMm_FromCR(c.address(), r);
    }

    // --- [ btDbvtAabbMm_FromMM ] ---

    public static long nbtDbvtAabbMm_FromMM(long mi, long mx) {
        long __functionAddress = Functions.DbvtAabbMm_FromMM;
        return invokePPP(mi, mx, __functionAddress);
    }

    @NativeType("void *")
    public static long btDbvtAabbMm_FromMM(@NativeType("btVector3 const *") BTVector3 mi, @NativeType("btVector3 const *") BTVector3 mx) {
        return nbtDbvtAabbMm_FromMM(mi.address(), mx.address());
    }

    // --- [ btDbvtAabbMm_FromPoints ] ---

    public static long nbtDbvtAabbMm_FromPoints(long ppts, int n) {
        long __functionAddress = Functions.DbvtAabbMm_FromPoints;
        return invokePP(ppts, n, __functionAddress);
    }

    @NativeType("void *")
    public static long btDbvtAabbMm_FromPoints(@NativeType("btVector3 const **") PointerBuffer ppts) {
        return nbtDbvtAabbMm_FromPoints(memAddress(ppts), ppts.remaining());
    }

    // --- [ btDbvtAabbMm_FromPoints2 ] ---

    public static long nbtDbvtAabbMm_FromPoints2(long pts, int n) {
        long __functionAddress = Functions.DbvtAabbMm_FromPoints2;
        return invokePP(pts, n, __functionAddress);
    }

    @NativeType("void *")
    public static long btDbvtAabbMm_FromPoints2(@NativeType("btVector3 const *") BTVector3.Buffer pts) {
        return nbtDbvtAabbMm_FromPoints2(pts.address(), pts.remaining());
    }

    // --- [ btDbvtAabbMm_Lengths ] ---

    public static void nbtDbvtAabbMm_Lengths(long obj, long value) {
        long __functionAddress = Functions.DbvtAabbMm_Lengths;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btDbvtAabbMm_Lengths(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtDbvtAabbMm_Lengths(obj, value.address());
    }

    // --- [ btDbvtAabbMm_Maxs ] ---

    public static void nbtDbvtAabbMm_Maxs(long obj, long value) {
        long __functionAddress = Functions.DbvtAabbMm_Maxs;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btDbvtAabbMm_Maxs(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtDbvtAabbMm_Maxs(obj, value.address());
    }

    // --- [ btDbvtAabbMm_Mins ] ---

    public static void nbtDbvtAabbMm_Mins(long obj, long value) {
        long __functionAddress = Functions.DbvtAabbMm_Mins;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btDbvtAabbMm_Mins(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtDbvtAabbMm_Mins(obj, value.address());
    }

    // --- [ btDbvtAabbMm_ProjectMinimum ] ---

    public static float nbtDbvtAabbMm_ProjectMinimum(long obj, long v, int signs) {
        long __functionAddress = Functions.DbvtAabbMm_ProjectMinimum;
        if (CHECKS) {
            check(obj);
        }
        return invokePPF(obj, v, signs, __functionAddress);
    }

    @NativeType("btScalar")
    public static float btDbvtAabbMm_ProjectMinimum(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 v, @NativeType("unsigned int") int signs) {
        return nbtDbvtAabbMm_ProjectMinimum(obj, v.address(), signs);
    }

    // --- [ btDbvtAabbMm_SignedExpand ] ---

    public static void nbtDbvtAabbMm_SignedExpand(long obj, long e) {
        long __functionAddress = Functions.DbvtAabbMm_SignedExpand;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, e, __functionAddress);
    }

    public static void btDbvtAabbMm_SignedExpand(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 e) {
        nbtDbvtAabbMm_SignedExpand(obj, e.address());
    }

    // --- [ btDbvtAabbMm_tMaxs ] ---

    public static void nbtDbvtAabbMm_tMaxs(long obj, long value) {
        long __functionAddress = Functions.DbvtAabbMm_tMaxs;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btDbvtAabbMm_tMaxs(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtDbvtAabbMm_tMaxs(obj, value.address());
    }

    // --- [ btDbvtAabbMm_tMins ] ---

    public static void nbtDbvtAabbMm_tMins(long obj, long value) {
        long __functionAddress = Functions.DbvtAabbMm_tMins;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btDbvtAabbMm_tMins(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtDbvtAabbMm_tMins(obj, value.address());
    }

    // --- [ btDbvtAabbMm_delete ] ---

    public static void btDbvtAabbMm_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtAabbMm_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btDbvtNode_new ] ---

    @NativeType("void *")
    public static long btDbvtNode_new() {
        long __functionAddress = Functions.DbvtNode_new;
        return invokeP(__functionAddress);
    }

    // --- [ btDbvtNode_getChilds ] ---

    @NativeType("void *[2]")
    public static PointerBuffer btDbvtNode_getChilds(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtNode_getChilds;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memPointerBuffer(__result, 2);
    }

    // --- [ btDbvtNode_getData ] ---

    @NativeType("void *")
    public static long btDbvtNode_getData(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtNode_getData;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDbvtNode_getDataAsInt ] ---

    public static int btDbvtNode_getDataAsInt(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtNode_getDataAsInt;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDbvtNode_getParent ] ---

    @NativeType("void *")
    public static long btDbvtNode_getParent(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtNode_getParent;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDbvtNode_getVolume ] ---

    @NativeType("void *")
    public static long btDbvtNode_getVolume(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtNode_getVolume;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDbvtNode_isinternal ] ---

    @NativeType("bool")
    public static boolean btDbvtNode_isinternal(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtNode_isinternal;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btDbvtNode_isleaf ] ---

    @NativeType("bool")
    public static boolean btDbvtNode_isleaf(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtNode_isleaf;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btDbvtNode_setData ] ---

    public static void btDbvtNode_setData(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.DbvtNode_setData;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btDbvtNode_setDataAsInt ] ---

    public static void btDbvtNode_setDataAsInt(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.DbvtNode_setDataAsInt;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDbvtNode_setParent ] ---

    public static void btDbvtNode_setParent(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.DbvtNode_setParent;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btDbvtNode_delete ] ---

    public static void btDbvtNode_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtNode_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btDbvt_IClone_new ] ---

    @NativeType("void *")
    public static long btDbvt_IClone_new() {
        long __functionAddress = Functions.Dbvt_IClone_new;
        return invokeP(__functionAddress);
    }

    // --- [ btDbvt_IClone_CloneLeaf ] ---

    public static void btDbvt_IClone_CloneLeaf(@NativeType("void *") long obj, @NativeType("void *") long __unnamed0) {
        long __functionAddress = Functions.Dbvt_IClone_CloneLeaf;
        if (CHECKS) {
            check(obj);
            check(__unnamed0);
        }
        invokePPV(obj, __unnamed0, __functionAddress);
    }

    // --- [ btDbvt_IClone_delete ] ---

    public static void btDbvt_IClone_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_IClone_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btDbvt_ICollide_new ] ---

    @NativeType("void *")
    public static long btDbvt_ICollide_new() {
        long __functionAddress = Functions.Dbvt_ICollide_new;
        return invokeP(__functionAddress);
    }

    // --- [ btDbvt_ICollide_AllLeaves ] ---

    @NativeType("bool")
    public static boolean btDbvt_ICollide_AllLeaves(@NativeType("void *") long obj, @NativeType("void *") long __unnamed0) {
        long __functionAddress = Functions.Dbvt_ICollide_AllLeaves;
        if (CHECKS) {
            check(obj);
            check(__unnamed0);
        }
        return invokePPZ(obj, __unnamed0, __functionAddress);
    }

    // --- [ btDbvt_ICollide_Descent ] ---

    @NativeType("bool")
    public static boolean btDbvt_ICollide_Descent(@NativeType("void *") long obj, @NativeType("void *") long __unnamed0) {
        long __functionAddress = Functions.Dbvt_ICollide_Descent;
        if (CHECKS) {
            check(obj);
            check(__unnamed0);
        }
        return invokePPZ(obj, __unnamed0, __functionAddress);
    }

    // --- [ btDbvt_ICollide_Process ] ---

    public static void btDbvt_ICollide_Process(@NativeType("void *") long obj, @NativeType("void *") long __unnamed0, @NativeType("void *") long __unnamed1) {
        long __functionAddress = Functions.Dbvt_ICollide_Process;
        if (CHECKS) {
            check(obj);
            check(__unnamed0);
            check(__unnamed1);
        }
        invokePPPV(obj, __unnamed0, __unnamed1, __functionAddress);
    }

    // --- [ btDbvt_ICollide_Process2 ] ---

    public static void btDbvt_ICollide_Process2(@NativeType("void *") long obj, @NativeType("void *") long __unnamed0) {
        long __functionAddress = Functions.Dbvt_ICollide_Process2;
        if (CHECKS) {
            check(obj);
            check(__unnamed0);
        }
        invokePPV(obj, __unnamed0, __functionAddress);
    }

    // --- [ btDbvt_ICollide_Process3 ] ---

    public static void btDbvt_ICollide_Process3(@NativeType("void *") long obj, @NativeType("void *") long n, @NativeType("btScalar") float __unnamed1) {
        long __functionAddress = Functions.Dbvt_ICollide_Process3;
        if (CHECKS) {
            check(obj);
            check(n);
        }
        invokePPV(obj, n, __unnamed1, __functionAddress);
    }

    // --- [ btDbvt_ICollide_delete ] ---

    public static void btDbvt_ICollide_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_ICollide_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btDbvt_IWriter_Prepare ] ---

    public static void btDbvt_IWriter_Prepare(@NativeType("void *") long obj, @NativeType("void *") long root, int numnodes) {
        long __functionAddress = Functions.Dbvt_IWriter_Prepare;
        if (CHECKS) {
            check(obj);
            check(root);
        }
        invokePPV(obj, root, numnodes, __functionAddress);
    }

    // --- [ btDbvt_IWriter_WriteLeaf ] ---

    public static void btDbvt_IWriter_WriteLeaf(@NativeType("void *") long obj, @NativeType("void *") long __unnamed0, int index, int parent) {
        long __functionAddress = Functions.Dbvt_IWriter_WriteLeaf;
        if (CHECKS) {
            check(obj);
            check(__unnamed0);
        }
        invokePPV(obj, __unnamed0, index, parent, __functionAddress);
    }

    // --- [ btDbvt_IWriter_WriteNode ] ---

    public static void btDbvt_IWriter_WriteNode(@NativeType("void *") long obj, @NativeType("void *") long __unnamed0, int index, int parent, int child0, int child1) {
        long __functionAddress = Functions.Dbvt_IWriter_WriteNode;
        if (CHECKS) {
            check(obj);
            check(__unnamed0);
        }
        invokePPV(obj, __unnamed0, index, parent, child0, child1, __functionAddress);
    }

    // --- [ btDbvt_IWriter_delete ] ---

    public static void btDbvt_IWriter_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_IWriter_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btDbvt_sStkCLN_new ] ---

    @NativeType("void *")
    public static long btDbvt_sStkCLN_new(@NativeType("void *") long n, @NativeType("void *") long p) {
        long __functionAddress = Functions.Dbvt_sStkCLN_new;
        if (CHECKS) {
            check(n);
            check(p);
        }
        return invokePPP(n, p, __functionAddress);
    }

    // --- [ btDbvt_sStkCLN_getNode ] ---

    @NativeType("void *")
    public static long btDbvt_sStkCLN_getNode(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_sStkCLN_getNode;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDbvt_sStkCLN_getParent ] ---

    @NativeType("void *")
    public static long btDbvt_sStkCLN_getParent(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_sStkCLN_getParent;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDbvt_sStkCLN_setNode ] ---

    public static void btDbvt_sStkCLN_setNode(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.Dbvt_sStkCLN_setNode;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btDbvt_sStkCLN_setParent ] ---

    public static void btDbvt_sStkCLN_setParent(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.Dbvt_sStkCLN_setParent;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btDbvt_sStkCLN_delete ] ---

    public static void btDbvt_sStkCLN_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_sStkCLN_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btDbvt_sStkNN_new ] ---

    @NativeType("void *")
    public static long btDbvt_sStkNN_new() {
        long __functionAddress = Functions.Dbvt_sStkNN_new;
        return invokeP(__functionAddress);
    }

    // --- [ btDbvt_sStkNN_new2 ] ---

    @NativeType("void *")
    public static long btDbvt_sStkNN_new2(@NativeType("void *") long na, @NativeType("void *") long nb) {
        long __functionAddress = Functions.Dbvt_sStkNN_new2;
        if (CHECKS) {
            check(na);
            check(nb);
        }
        return invokePPP(na, nb, __functionAddress);
    }

    // --- [ btDbvt_sStkNN_getA ] ---

    @NativeType("void *")
    public static long btDbvt_sStkNN_getA(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_sStkNN_getA;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDbvt_sStkNN_getB ] ---

    @NativeType("void *")
    public static long btDbvt_sStkNN_getB(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_sStkNN_getB;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDbvt_sStkNN_setA ] ---

    public static void btDbvt_sStkNN_setA(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.Dbvt_sStkNN_setA;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btDbvt_sStkNN_setB ] ---

    public static void btDbvt_sStkNN_setB(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.Dbvt_sStkNN_setB;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btDbvt_sStkNN_delete ] ---

    public static void btDbvt_sStkNN_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_sStkNN_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btDbvt_sStkNP_new ] ---

    @NativeType("void *")
    public static long btDbvt_sStkNP_new(@NativeType("void *") long n, @NativeType("unsigned int") int m) {
        long __functionAddress = Functions.Dbvt_sStkNP_new;
        if (CHECKS) {
            check(n);
        }
        return invokePP(n, m, __functionAddress);
    }

    // --- [ btDbvt_sStkNP_getMask ] ---

    public static int btDbvt_sStkNP_getMask(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_sStkNP_getMask;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDbvt_sStkNP_getNode ] ---

    @NativeType("void *")
    public static long btDbvt_sStkNP_getNode(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_sStkNP_getNode;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDbvt_sStkNP_setMask ] ---

    public static void btDbvt_sStkNP_setMask(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.Dbvt_sStkNP_setMask;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDbvt_sStkNP_setNode ] ---

    public static void btDbvt_sStkNP_setNode(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.Dbvt_sStkNP_setNode;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btDbvt_sStkNP_delete ] ---

    public static void btDbvt_sStkNP_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_sStkNP_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btDbvt_sStkNPS_new ] ---

    @NativeType("void *")
    public static long btDbvt_sStkNPS_new() {
        long __functionAddress = Functions.Dbvt_sStkNPS_new;
        return invokeP(__functionAddress);
    }

    // --- [ btDbvt_sStkNPS_new2 ] ---

    @NativeType("void *")
    public static long btDbvt_sStkNPS_new2(@NativeType("void *") long n, @NativeType("unsigned int") int m, @NativeType("btScalar") float v) {
        long __functionAddress = Functions.Dbvt_sStkNPS_new2;
        if (CHECKS) {
            check(n);
        }
        return invokePP(n, m, v, __functionAddress);
    }

    // --- [ btDbvt_sStkNPS_getMask ] ---

    public static int btDbvt_sStkNPS_getMask(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_sStkNPS_getMask;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDbvt_sStkNPS_getNode ] ---

    @NativeType("void *")
    public static long btDbvt_sStkNPS_getNode(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_sStkNPS_getNode;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDbvt_sStkNPS_getValue ] ---

    @NativeType("btScalar")
    public static float btDbvt_sStkNPS_getValue(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_sStkNPS_getValue;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btDbvt_sStkNPS_setMask ] ---

    public static void btDbvt_sStkNPS_setMask(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.Dbvt_sStkNPS_setMask;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDbvt_sStkNPS_setNode ] ---

    public static void btDbvt_sStkNPS_setNode(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.Dbvt_sStkNPS_setNode;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btDbvt_sStkNPS_setValue ] ---

    public static void btDbvt_sStkNPS_setValue(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.Dbvt_sStkNPS_setValue;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDbvt_sStkNPS_delete ] ---

    public static void btDbvt_sStkNPS_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_sStkNPS_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btDbvt_allocate ] ---

    public static int btDbvt_allocate(@NativeType("void *") long ifree, @NativeType("void *") long stock, @NativeType("void *") long value) {
        long __functionAddress = Functions.Dbvt_allocate;
        if (CHECKS) {
            check(ifree);
            check(stock);
            check(value);
        }
        return invokePPPI(ifree, stock, value, __functionAddress);
    }

    // --- [ btDbvt_benchmark ] ---

    public static void btDbvt_benchmark() {
        long __functionAddress = Functions.Dbvt_benchmark;
        invokeV(__functionAddress);
    }

    // --- [ btDbvt_clear ] ---

    public static void btDbvt_clear(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_clear;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btDbvt_clone ] ---

    public static void btDbvt_clone(@NativeType("void *") long obj, @NativeType("void *") long dest) {
        long __functionAddress = Functions.Dbvt_clone;
        if (CHECKS) {
            check(obj);
            check(dest);
        }
        invokePPV(obj, dest, __functionAddress);
    }

    // --- [ btDbvt_clone2 ] ---

    public static void btDbvt_clone2(@NativeType("void *") long obj, @NativeType("void *") long dest, @NativeType("void *") long iclone) {
        long __functionAddress = Functions.Dbvt_clone2;
        if (CHECKS) {
            check(obj);
            check(dest);
            check(iclone);
        }
        invokePPPV(obj, dest, iclone, __functionAddress);
    }

    // --- [ btDbvt_countLeaves ] ---

    /**
     * EXPORT void btDbvt_collideKDOP(const btDbvtNode* root, const btVector3* normals, const btScalar* offsets, int count, const btDbvt_ICollide* policy);
     * EXPORT void btDbvt_collideOCL(const btDbvtNode* root, const btVector3* normals, const btScalar* offsets, const btVector3* sortaxis, int count, const
     * btDbvt_ICollide* policy); EXPORT void btDbvt_collideOCL2(const btDbvtNode* root, const btVector3* normals, const btScalar* offsets, const btVector3*
     * sortaxis, int count, const btDbvt_ICollide* policy, bool fullsort); EXPORT void btDbvt_collideTT(btDbvt* obj, const btDbvtNode* root0, const
     * btDbvtNode* root1, const btDbvt_ICollide* policy); EXPORT void btDbvt_collideTTpersistentStack(btDbvt* obj, const btDbvtNode* root0, const btDbvtNode*
     * root1, const btDbvt_ICollide* policy); EXPORT void btDbvt_collideTU(const btDbvtNode* root, const btDbvt_ICollide* policy); EXPORT void
     * btDbvt_collideTV(btDbvt* obj, const btDbvtNode* root, const btDbvtVolume* volume, const btDbvt_ICollide* policy);
     */
    public static int btDbvt_countLeaves(@NativeType("void *") long node) {
        long __functionAddress = Functions.Dbvt_countLeaves;
        if (CHECKS) {
            check(node);
        }
        return invokePI(node, __functionAddress);
    }

    // --- [ btDbvt_empty ] ---

    @NativeType("bool")
    public static boolean btDbvt_empty(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_empty;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btDbvt_extractLeaves ] ---

    /**
     * EXPORT void btDbvt_enumLeaves(const btDbvtNode* root, const btDbvt_ICollide* policy); EXPORT void btDbvt_enumNodes(const btDbvtNode* root, const
     * btDbvt_ICollide* policy);
     */
    public static void btDbvt_extractLeaves(@NativeType("void *") long node, @NativeType("void *") long leaves) {
        long __functionAddress = Functions.Dbvt_extractLeaves;
        if (CHECKS) {
            check(node);
            check(leaves);
        }
        invokePPV(node, leaves, __functionAddress);
    }

    // --- [ btDbvt_getFree ] ---

    @NativeType("void *")
    public static long btDbvt_getFree(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_getFree;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDbvt_getLeaves ] ---

    public static int btDbvt_getLeaves(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_getLeaves;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDbvt_getLkhd ] ---

    public static int btDbvt_getLkhd(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_getLkhd;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDbvt_getOpath ] ---

    @NativeType("unsigned int")
    public static int btDbvt_getOpath(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_getOpath;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDbvt_getRoot ] ---

    @NativeType("void *")
    public static long btDbvt_getRoot(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_getRoot;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDbvt_getStkStack ] ---

    @NativeType("void *")
    public static long btDbvt_getStkStack(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_getStkStack;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDbvt_insert ] ---

    @NativeType("void *")
    public static long btDbvt_insert(@NativeType("void *") long obj, @NativeType("void *") long box, @NativeType("void *") long data) {
        long __functionAddress = Functions.Dbvt_insert;
        if (CHECKS) {
            check(obj);
            check(box);
            check(data);
        }
        return invokePPPP(obj, box, data, __functionAddress);
    }

    // --- [ btDbvt_maxdepth ] ---

    public static int btDbvt_maxdepth(@NativeType("void *") long node) {
        long __functionAddress = Functions.Dbvt_maxdepth;
        if (CHECKS) {
            check(node);
        }
        return invokePI(node, __functionAddress);
    }

    // --- [ btDbvt_nearest ] ---

    public static int nbtDbvt_nearest(long i, long a, float v, int l, int h) {
        long __functionAddress = Functions.Dbvt_nearest;
        if (CHECKS) {
            check(a);
        }
        return invokePPI(i, a, v, l, h, __functionAddress);
    }

    public static int btDbvt_nearest(@NativeType("int const *") IntBuffer i, @NativeType("void *") long a, @NativeType("btScalar") float v, int l, int h) {
        return nbtDbvt_nearest(memAddress(i), a, v, l, h);
    }

    // --- [ btDbvt_optimizeBottomUp ] ---

    public static void btDbvt_optimizeBottomUp(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_optimizeBottomUp;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btDbvt_optimizeIncremental ] ---

    public static void btDbvt_optimizeIncremental(@NativeType("void *") long obj, int passes) {
        long __functionAddress = Functions.Dbvt_optimizeIncremental;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, passes, __functionAddress);
    }

    // --- [ btDbvt_optimizeTopDown ] ---

    public static void btDbvt_optimizeTopDown(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dbvt_optimizeTopDown;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btDbvt_optimizeTopDown2 ] ---

    public static void btDbvt_optimizeTopDown2(@NativeType("void *") long obj, int bu_treshold) {
        long __functionAddress = Functions.Dbvt_optimizeTopDown2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, bu_treshold, __functionAddress);
    }

    // --- [ btDbvt_remove ] ---

    public static void btDbvt_remove(@NativeType("void *") long obj, @NativeType("void *") long leaf) {
        long __functionAddress = Functions.Dbvt_remove;
        if (CHECKS) {
            check(obj);
            check(leaf);
        }
        invokePPV(obj, leaf, __functionAddress);
    }

    // --- [ btDbvt_setFree ] ---

    public static void btDbvt_setFree(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.Dbvt_setFree;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btDbvt_setLeaves ] ---

    public static void btDbvt_setLeaves(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.Dbvt_setLeaves;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDbvt_setLkhd ] ---

    public static void btDbvt_setLkhd(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.Dbvt_setLkhd;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDbvt_setOpath ] ---

    public static void btDbvt_setOpath(@NativeType("void *") long obj, @NativeType("unsigned int") int value) {
        long __functionAddress = Functions.Dbvt_setOpath;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDbvt_setRoot ] ---

    public static void btDbvt_setRoot(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.Dbvt_setRoot;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btDbvt_update ] ---

    public static void btDbvt_update(@NativeType("void *") long obj, @NativeType("void *") long leaf, @NativeType("void *") long volume) {
        long __functionAddress = Functions.Dbvt_update;
        if (CHECKS) {
            check(obj);
            check(leaf);
            check(volume);
        }
        invokePPPV(obj, leaf, volume, __functionAddress);
    }

    // --- [ btDbvt_update2 ] ---

    public static void btDbvt_update2(@NativeType("void *") long obj, @NativeType("void *") long leaf) {
        long __functionAddress = Functions.Dbvt_update2;
        if (CHECKS) {
            check(obj);
            check(leaf);
        }
        invokePPV(obj, leaf, __functionAddress);
    }

    // --- [ btDbvt_update3 ] ---

    public static void btDbvt_update3(@NativeType("void *") long obj, @NativeType("void *") long leaf, int lookahead) {
        long __functionAddress = Functions.Dbvt_update3;
        if (CHECKS) {
            check(obj);
            check(leaf);
        }
        invokePPV(obj, leaf, lookahead, __functionAddress);
    }

    // --- [ btDbvt_update4 ] ---

    @NativeType("bool")
    public static boolean btDbvt_update4(@NativeType("void *") long obj, @NativeType("void *") long leaf, @NativeType("void *") long volume, @NativeType("btScalar") float margin) {
        long __functionAddress = Functions.Dbvt_update4;
        if (CHECKS) {
            check(obj);
            check(leaf);
            check(volume);
        }
        return invokePPPZ(obj, leaf, volume, margin, __functionAddress);
    }

    // --- [ btDbvt_update5 ] ---

    public static boolean nbtDbvt_update5(long obj, long leaf, long volume, long velocity) {
        long __functionAddress = Functions.Dbvt_update5;
        if (CHECKS) {
            check(obj);
            check(leaf);
            check(volume);
        }
        return invokePPPPZ(obj, leaf, volume, velocity, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btDbvt_update5(@NativeType("void *") long obj, @NativeType("void *") long leaf, @NativeType("void *") long volume, @NativeType("btVector3 const *") BTVector3 velocity) {
        return nbtDbvt_update5(obj, leaf, volume, velocity.address());
    }

    // --- [ btDbvt_update6 ] ---

    public static boolean nbtDbvt_update6(long obj, long leaf, long volume, long velocity, float margin) {
        long __functionAddress = Functions.Dbvt_update6;
        if (CHECKS) {
            check(obj);
            check(leaf);
            check(volume);
        }
        return invokePPPPZ(obj, leaf, volume, velocity, margin, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btDbvt_update6(@NativeType("void *") long obj, @NativeType("void *") long leaf, @NativeType("void *") long volume, @NativeType("btVector3 const *") BTVector3 velocity, @NativeType("btScalar") float margin) {
        return nbtDbvt_update6(obj, leaf, volume, velocity.address(), margin);
    }

    // --- [ btDbvt_write ] ---

    public static void btDbvt_write(@NativeType("void *") long obj, @NativeType("void *") long iwriter) {
        long __functionAddress = Functions.Dbvt_write;
        if (CHECKS) {
            check(obj);
            check(iwriter);
        }
        invokePPV(obj, iwriter, __functionAddress);
    }

    // --- [ btDbvt_array_at ] ---

    @NativeType("void *")
    public static long btDbvt_array_at(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.Dbvt_array_at;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btDbvt_array_index_of ] ---

    public static int btDbvt_array_index_of(@NativeType("void *") long obj, @NativeType("void *") long value, int length) {
        long __functionAddress = Functions.Dbvt_array_index_of;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        return invokePPI(obj, value, length, __functionAddress);
    }

    // --- [ btDbvtNodePtr_array_at ] ---

    public static long nbtDbvtNodePtr_array_at(long obj, int index) {
        long __functionAddress = Functions.DbvtNodePtr_array_at;
        return invokePP(obj, index, __functionAddress);
    }

    @NativeType("void *")
    public static long btDbvtNodePtr_array_at(@NativeType("void **") PointerBuffer obj, int index) {
        return nbtDbvtNodePtr_array_at(memAddress(obj), index);
    }

    // --- [ btDbvtNodePtr_array_index_of ] ---

    public static int nbtDbvtNodePtr_array_index_of(long obj, long value, int length) {
        long __functionAddress = Functions.DbvtNodePtr_array_index_of;
        if (CHECKS) {
            check(value);
        }
        return invokePPI(obj, value, length, __functionAddress);
    }

    public static int btDbvtNodePtr_array_index_of(@NativeType("void **") PointerBuffer obj, @NativeType("void *") long value, int length) {
        return nbtDbvtNodePtr_array_index_of(memAddress(obj), value, length);
    }

}