/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btVoronoiSimplexSolver = "BTVoronoiSimplexSolver".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    bool(
        "UsageBitfield_getUnused1",
        "",

        opaque_p("obj", "")
    )

    bool(
        "UsageBitfield_getUnused2",
        "",

        opaque_p("obj", "")
    )

    bool(
        "UsageBitfield_getUnused3",
        "",

        opaque_p("obj", "")
    )

    bool(
        "UsageBitfield_getUnused4",
        "",

        opaque_p("obj", "")
    )

    bool(
        "UsageBitfield_getUsedVertexA",
        "",

        opaque_p("obj", "")
    )

    bool(
        "UsageBitfield_getUsedVertexB",
        "",

        opaque_p("obj", "")
    )

    bool(
        "UsageBitfield_getUsedVertexC",
        "",

        opaque_p("obj", "")
    )

    bool(
        "UsageBitfield_getUsedVertexD",
        "",

        opaque_p("obj", "")
    )

    void(
        "UsageBitfield_reset",
        "",

        opaque_p("obj", "")
    )

    void(
        "UsageBitfield_setUnused1",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "UsageBitfield_setUnused2",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "UsageBitfield_setUnused3",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "UsageBitfield_setUnused4",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "UsageBitfield_setUsedVertexA",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "UsageBitfield_setUsedVertexB",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "UsageBitfield_setUsedVertexC",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "UsageBitfield_setUsedVertexD",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    opaque_p(
        "SubSimplexClosestResult_new",
        "",

        void()
    )

    btScalar[4](
        "SubSimplexClosestResult_getBarycentricCoords",
        "",

        opaque_p("obj", "")
    )

    void(
        "SubSimplexClosestResult_getClosestPointOnSimplex",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    bool(
        "SubSimplexClosestResult_getDegenerate",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SubSimplexClosestResult_getUsedVertices",
        "",

        opaque_p("obj", "")
    )

    bool(
        "SubSimplexClosestResult_isValid",
        "",

        opaque_p("obj", "")
    )

    void(
        "SubSimplexClosestResult_reset",
        "",

        opaque_p("obj", "")
    )

    void(
        "SubSimplexClosestResult_setBarycentricCoordinates",
        "",

        opaque_p("obj", "")
    )

    void(
        "SubSimplexClosestResult_setBarycentricCoordinates2",
        "",

        opaque_p("obj", ""),
        btScalar("a", "")
    )

    void(
        "SubSimplexClosestResult_setBarycentricCoordinates3",
        "",

        opaque_p("obj", ""),
        btScalar("a", ""),
        btScalar("b", "")
    )

    void(
        "SubSimplexClosestResult_setBarycentricCoordinates4",
        "",

        opaque_p("obj", ""),
        btScalar("a", ""),
        btScalar("b", ""),
        btScalar("c", "")
    )

    void(
        "SubSimplexClosestResult_setBarycentricCoordinates5",
        "",

        opaque_p("obj", ""),
        btScalar("a", ""),
        btScalar("b", ""),
        btScalar("c", ""),
        btScalar("d", "")
    )

    void(
        "SubSimplexClosestResult_setClosestPointOnSimplex",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SubSimplexClosestResult_setDegenerate",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "SubSimplexClosestResult_setUsedVertices",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "SubSimplexClosestResult_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "VoronoiSimplexSolver_new",
        "",

        void()
    )

    void(
        "VoronoiSimplexSolver_addVertex",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("w", ""),
        btVector3.const.p("p", ""),
        btVector3.const.p("q", "")
    )

    void(
        "VoronoiSimplexSolver_backup_closest",
        "",

        opaque_p("obj", ""),
        btVector3.p("v", "")
    )

    bool(
        "VoronoiSimplexSolver_closest",
        "",

        opaque_p("obj", ""),
        btVector3.p("v", "")
    )

    bool(
        "VoronoiSimplexSolver_closestPtPointTetrahedron",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("p", ""),
        btVector3.const.p("a", ""),
        btVector3.const.p("b", ""),
        btVector3.const.p("c", ""),
        btVector3.const.p("d", ""),
        opaque_p("finalResult", "")
    )

    bool(
        "VoronoiSimplexSolver_closestPtPointTriangle",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("p", ""),
        btVector3.const.p("a", ""),
        btVector3.const.p("b", ""),
        btVector3.const.p("c", ""),
        opaque_p("result", "")
    )

    void(
        "VoronoiSimplexSolver_compute_points",
        "",

        opaque_p("obj", ""),
        btVector3.p("p1", ""),
        btVector3.p("p2", "")
    )

    bool(
        "VoronoiSimplexSolver_emptySimplex",
        "",

        opaque_p("obj", "")
    )

    bool(
        "VoronoiSimplexSolver_fullSimplex",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "VoronoiSimplexSolver_getCachedBC",
        "",

        opaque_p("obj", "")
    )

    void(
        "VoronoiSimplexSolver_getCachedP1",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "VoronoiSimplexSolver_getCachedP2",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "VoronoiSimplexSolver_getCachedV",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    bool(
        "VoronoiSimplexSolver_getCachedValidClosest",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "VoronoiSimplexSolver_getEqualVertexThreshold",
        "",

        opaque_p("obj", "")
    )

    void(
        "VoronoiSimplexSolver_getLastW",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    bool(
        "VoronoiSimplexSolver_getNeedsUpdate",
        "",

        opaque_p("obj", "")
    )

    int(
        "VoronoiSimplexSolver_getNumVertices",
        "",

        opaque_p("obj", "")
    )

    int(
        "VoronoiSimplexSolver_getSimplex",
        "",

        opaque_p("obj", ""),
        btVector3.p("pBuf", ""),
        btVector3.p("qBuf", ""),
        btVector3.p("yBuf", "")
    )

    btVector3.p(
        "VoronoiSimplexSolver_getSimplexPointsP",
        "",

        opaque_p("obj", "")
    )

    btVector3.p(
        "VoronoiSimplexSolver_getSimplexPointsQ",
        "",

        opaque_p("obj", "")
    )

    btVector3.p(
        "VoronoiSimplexSolver_getSimplexVectorW",
        "",

        opaque_p("obj", "")
    )

    bool(
        "VoronoiSimplexSolver_inSimplex",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("w", "")
    )

    btScalar(
        "VoronoiSimplexSolver_maxVertex",
        "",

        opaque_p("obj", "")
    )

    int(
        "VoronoiSimplexSolver_numVertices",
        "",

        opaque_p("obj", "")
    )

    int(
        "VoronoiSimplexSolver_pointOutsideOfPlane",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("p", ""),
        btVector3.const.p("a", ""),
        btVector3.const.p("b", ""),
        btVector3.const.p("c", ""),
        btVector3.const.p("d", "")
    )

    void(
        "VoronoiSimplexSolver_reduceVertices",
        "",

        opaque_p("obj", ""),
        opaque_p("usedVerts", "")
    )

    void(
        "VoronoiSimplexSolver_removeVertex",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    void(
        "VoronoiSimplexSolver_reset",
        "",

        opaque_p("obj", "")
    )

    void(
        "VoronoiSimplexSolver_setCachedBC",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "VoronoiSimplexSolver_setCachedP1",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "VoronoiSimplexSolver_setCachedP2",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "VoronoiSimplexSolver_setCachedV",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "VoronoiSimplexSolver_setCachedValidClosest",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "VoronoiSimplexSolver_setEqualVertexThreshold",
        "",

        opaque_p("obj", ""),
        btScalar("threshold", "")
    )

    void(
        "VoronoiSimplexSolver_setLastW",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "VoronoiSimplexSolver_setNeedsUpdate",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "VoronoiSimplexSolver_setNumVertices",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    bool(
        "VoronoiSimplexSolver_updateClosestVectorAndPoints",
        "",

        opaque_p("obj", "")
    )

    void(
        "VoronoiSimplexSolver_delete",
        "",

        opaque_p("obj", "")
    )

}