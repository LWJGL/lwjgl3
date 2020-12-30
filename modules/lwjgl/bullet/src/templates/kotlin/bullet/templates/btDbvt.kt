/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btDbvt = "BTDbvt".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "DbvtAabbMm_new",
        "",

        void()
    )

    void(
        "DbvtAabbMm_Center",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    int(
        "DbvtAabbMm_Classify",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("n", ""),
        btScalar("o", ""),
        int("s", "")
    )

    bool(
        "DbvtAabbMm_Contain",
        "",

        opaque_p("obj", ""),
        opaque_p("a", "")
    )

    void(
        "DbvtAabbMm_Expand",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("e", "")
    )

    void(
        "DbvtAabbMm_Extents",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    opaque_p(
        "DbvtAabbMm_FromCE",
        "",

        btVector3.const.p("c", ""),
        btVector3.const.p("e", "")
    )

    opaque_p(
        "DbvtAabbMm_FromCR",
        "",

        btVector3.const.p("c", ""),
        btScalar("r", "")
    )

    opaque_p(
        "DbvtAabbMm_FromMM",
        "",

        btVector3.const.p("mi", ""),
        btVector3.const.p("mx", "")
    )

    opaque_p(
        "DbvtAabbMm_FromPoints",
        "",

        btVector3.const.p.p("ppts", ""),
        AutoSize("ppts")..int("n", "")
    )

    opaque_p(
        "DbvtAabbMm_FromPoints2",
        "",

        btVector3.const.p("pts", ""),
        AutoSize("pts")..int("n", "")
    )

    void(
        "DbvtAabbMm_Lengths",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "DbvtAabbMm_Maxs",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "DbvtAabbMm_Mins",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "DbvtAabbMm_ProjectMinimum",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("v", ""),
        unsigned_int("signs", "")
    )

    void(
        "DbvtAabbMm_SignedExpand",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("e", "")
    )

    void(
        "DbvtAabbMm_tMaxs",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "DbvtAabbMm_tMins",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "DbvtAabbMm_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "DbvtNode_new",
        "",

        void()
    )

    opaque_p[2](
        "DbvtNode_getChilds",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "DbvtNode_getData",
        "",

        opaque_p("obj", "")
    )

    int(
        "DbvtNode_getDataAsInt",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "DbvtNode_getParent",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "DbvtNode_getVolume",
        "",

        opaque_p("obj", "")
    )

    bool(
        "DbvtNode_isinternal",
        "",

        opaque_p("obj", "")
    )

    bool(
        "DbvtNode_isleaf",
        "",

        opaque_p("obj", "")
    )

    void(
        "DbvtNode_setData",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "DbvtNode_setDataAsInt",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "DbvtNode_setParent",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "DbvtNode_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "Dbvt_IClone_new",
        "",

        void()
    )

    void(
        "Dbvt_IClone_CloneLeaf",
        "",

        opaque_p("obj", ""),
        opaque_p("__unnamed0", "")
    )

    void(
        "Dbvt_IClone_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "Dbvt_ICollide_new",
        "",

        void()
    )

    bool(
        "Dbvt_ICollide_AllLeaves",
        "",

        opaque_p("obj", ""),
        opaque_p("__unnamed0", "")
    )

    bool(
        "Dbvt_ICollide_Descent",
        "",

        opaque_p("obj", ""),
        opaque_p("__unnamed0", "")
    )

    void(
        "Dbvt_ICollide_Process",
        "",

        opaque_p("obj", ""),
        opaque_p("__unnamed0", ""),
        opaque_p("__unnamed1", "")
    )

    void(
        "Dbvt_ICollide_Process2",
        "",

        opaque_p("obj", ""),
        opaque_p("__unnamed0", "")
    )

    void(
        "Dbvt_ICollide_Process3",
        "",

        opaque_p("obj", ""),
        opaque_p("n", ""),
        btScalar("__unnamed1", "")
    )

    void(
        "Dbvt_ICollide_delete",
        "",

        opaque_p("obj", "")
    )

    void(
        "Dbvt_IWriter_Prepare",
        "",

        opaque_p("obj", ""),
        opaque_p("root", ""),
        int("numnodes", "")
    )

    void(
        "Dbvt_IWriter_WriteLeaf",
        "",

        opaque_p("obj", ""),
        opaque_p("__unnamed0", ""),
        int("index", ""),
        int("parent", "")
    )

    void(
        "Dbvt_IWriter_WriteNode",
        "",

        opaque_p("obj", ""),
        opaque_p("__unnamed0", ""),
        int("index", ""),
        int("parent", ""),
        int("child0", ""),
        int("child1", "")
    )

    void(
        "Dbvt_IWriter_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "Dbvt_sStkCLN_new",
        "",

        opaque_p("n", ""),
        opaque_p("p", "")
    )

    opaque_p(
        "Dbvt_sStkCLN_getNode",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "Dbvt_sStkCLN_getParent",
        "",

        opaque_p("obj", "")
    )

    void(
        "Dbvt_sStkCLN_setNode",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "Dbvt_sStkCLN_setParent",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "Dbvt_sStkCLN_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "Dbvt_sStkNN_new",
        "",

        void()
    )

    opaque_p(
        "Dbvt_sStkNN_new2",
        "",

        opaque_p("na", ""),
        opaque_p("nb", "")
    )

    opaque_p(
        "Dbvt_sStkNN_getA",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "Dbvt_sStkNN_getB",
        "",

        opaque_p("obj", "")
    )

    void(
        "Dbvt_sStkNN_setA",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "Dbvt_sStkNN_setB",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "Dbvt_sStkNN_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "Dbvt_sStkNP_new",
        "",

        opaque_p("n", ""),
        unsigned_int("m", "")
    )

    int(
        "Dbvt_sStkNP_getMask",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "Dbvt_sStkNP_getNode",
        "",

        opaque_p("obj", "")
    )

    void(
        "Dbvt_sStkNP_setMask",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "Dbvt_sStkNP_setNode",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "Dbvt_sStkNP_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "Dbvt_sStkNPS_new",
        "",

        void()
    )

    opaque_p(
        "Dbvt_sStkNPS_new2",
        "",

        opaque_p("n", ""),
        unsigned_int("m", ""),
        btScalar("v", "")
    )

    int(
        "Dbvt_sStkNPS_getMask",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "Dbvt_sStkNPS_getNode",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "Dbvt_sStkNPS_getValue",
        "",

        opaque_p("obj", "")
    )

    void(
        "Dbvt_sStkNPS_setMask",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "Dbvt_sStkNPS_setNode",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "Dbvt_sStkNPS_setValue",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "Dbvt_sStkNPS_delete",
        "",

        opaque_p("obj", "")
    )

    int(
        "Dbvt_allocate",
        "",

        opaque_p("ifree", ""),
        opaque_p("stock", ""),
        opaque_p("value", "")
    )

    void(
        "Dbvt_benchmark",
        "",

        void()
    )

    void(
        "Dbvt_clear",
        "",

        opaque_p("obj", "")
    )

    void(
        "Dbvt_clone",
        "",

        opaque_p("obj", ""),
        opaque_p("dest", "")
    )

    void(
        "Dbvt_clone2",
        "",

        opaque_p("obj", ""),
        opaque_p("dest", ""),
        opaque_p("iclone", "")
    )

    int(
        "Dbvt_countLeaves",
        """
        EXPORT void btDbvt_collideKDOP(const btDbvtNode* root, const btVector3* normals, const btScalar* offsets, int count, const btDbvt_ICollide* policy);
        EXPORT void btDbvt_collideOCL(const btDbvtNode* root, const btVector3* normals, const btScalar* offsets, const btVector3* sortaxis, int count, const
        btDbvt_ICollide* policy); EXPORT void btDbvt_collideOCL2(const btDbvtNode* root, const btVector3* normals, const btScalar* offsets, const btVector3*
        sortaxis, int count, const btDbvt_ICollide* policy, bool fullsort); EXPORT void btDbvt_collideTT(btDbvt* obj, const btDbvtNode* root0, const
        btDbvtNode* root1, const btDbvt_ICollide* policy); EXPORT void btDbvt_collideTTpersistentStack(btDbvt* obj, const btDbvtNode* root0, const btDbvtNode*
        root1, const btDbvt_ICollide* policy); EXPORT void btDbvt_collideTU(const btDbvtNode* root, const btDbvt_ICollide* policy); EXPORT void
        btDbvt_collideTV(btDbvt* obj, const btDbvtNode* root, const btDbvtVolume* volume, const btDbvt_ICollide* policy);
        """,

        opaque_p("node", "")
    )

    bool(
        "Dbvt_empty",
        "",

        opaque_p("obj", "")
    )

    void(
        "Dbvt_extractLeaves",
        """
        EXPORT void btDbvt_enumLeaves(const btDbvtNode* root, const btDbvt_ICollide* policy); EXPORT void btDbvt_enumNodes(const btDbvtNode* root, const
        btDbvt_ICollide* policy);
        """,

        opaque_p("node", ""),
        opaque_p("leaves", "")
    )

    opaque_p(
        "Dbvt_getFree",
        "",

        opaque_p("obj", "")
    )

    int(
        "Dbvt_getLeaves",
        "",

        opaque_p("obj", "")
    )

    int(
        "Dbvt_getLkhd",
        "",

        opaque_p("obj", "")
    )

    unsigned_int(
        "Dbvt_getOpath",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "Dbvt_getRoot",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "Dbvt_getStkStack",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "Dbvt_insert",
        "",

        opaque_p("obj", ""),
        opaque_p("box", ""),
        opaque_p("data", "")
    )

    int(
        "Dbvt_maxdepth",
        "",

        opaque_p("node", "")
    )

    int(
        "Dbvt_nearest",
        "",

        Unsafe..int.const.p("i", ""),
        opaque_p("a", ""),
        btScalar("v", ""),
        int("l", ""),
        int("h", "")
    )

    void(
        "Dbvt_optimizeBottomUp",
        "",

        opaque_p("obj", "")
    )

    void(
        "Dbvt_optimizeIncremental",
        "",

        opaque_p("obj", ""),
        int("passes", "")
    )

    void(
        "Dbvt_optimizeTopDown",
        "",

        opaque_p("obj", "")
    )

    void(
        "Dbvt_optimizeTopDown2",
        "",

        opaque_p("obj", ""),
        int("bu_treshold", "")
    )
/*
    void(
        "Dbvt_rayTest",
        "",

        opaque_p("root", ""),
        btVector3.const.p("rayFrom", ""),
        btVector3.const.p("rayTo", ""),
        opaque_p("policy", "")
    )

    void(
        "Dbvt_rayTestInternal",
        "",

        opaque_p("obj", ""),
        opaque_p("root", ""),
        btVector3.const.p("rayFrom", ""),
        btVector3.const.p("rayTo", ""),
        btVector3.const.p("rayDirectionInverse", ""),
        Check(3)..unsigned_int.p("signs", ""),
        btScalar("lambda_max", ""),
        btVector3.const.p("aabbMin", ""),
        btVector3.const.p("aabbMax", ""),
        opaque_p("policy", "")
    )
*/
    void(
        "Dbvt_remove",
        "",

        opaque_p("obj", ""),
        opaque_p("leaf", "")
    )

    void(
        "Dbvt_setFree",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "Dbvt_setLeaves",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "Dbvt_setLkhd",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "Dbvt_setOpath",
        "",

        opaque_p("obj", ""),
        unsigned_int("value", "")
    )

    void(
        "Dbvt_setRoot",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "Dbvt_update",
        "",

        opaque_p("obj", ""),
        opaque_p("leaf", ""),
        opaque_p("volume", "")
    )

    void(
        "Dbvt_update2",
        "",

        opaque_p("obj", ""),
        opaque_p("leaf", "")
    )

    void(
        "Dbvt_update3",
        "",

        opaque_p("obj", ""),
        opaque_p("leaf", ""),
        int("lookahead", "")
    )

    bool(
        "Dbvt_update4",
        "",

        opaque_p("obj", ""),
        opaque_p("leaf", ""),
        opaque_p("volume", ""),
        btScalar("margin", "")
    )

    bool(
        "Dbvt_update5",
        "",

        opaque_p("obj", ""),
        opaque_p("leaf", ""),
        opaque_p("volume", ""),
        btVector3.const.p("velocity", "")
    )

    bool(
        "Dbvt_update6",
        "",

        opaque_p("obj", ""),
        opaque_p("leaf", ""),
        opaque_p("volume", ""),
        btVector3.const.p("velocity", ""),
        btScalar("margin", "")
    )

    void(
        "Dbvt_write",
        "",

        opaque_p("obj", ""),
        opaque_p("iwriter", "")
    )

    opaque_p(
        "Dbvt_array_at",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    int(
        "Dbvt_array_index_of",
        "",

        opaque_p("obj", ""),
        opaque_p("value", ""),
        int("length", "")
    )

    opaque_p(
        "DbvtNodePtr_array_at",
        "",

        Unsafe..opaque_p.p("obj", ""),
        int("index", "")
    )

    int(
        "DbvtNodePtr_array_index_of",
        "",

        Unsafe..opaque_p.p("obj", ""),
        opaque_p("value", ""),
        int("length", "")
    )

}