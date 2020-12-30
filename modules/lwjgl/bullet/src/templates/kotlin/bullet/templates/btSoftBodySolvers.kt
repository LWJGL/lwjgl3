/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btSoftBodySolvers = "BTSoftBodySolvers".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    bool(
        "SoftBodySolver_checkInitialized",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBodySolver_copyBackToSoftBodies",
        "",

        opaque_p("obj", ""),
        bool("bMove", "")
    )

    int(
        "SoftBodySolver_getNumberOfPositionIterations",
        "",

        opaque_p("obj", "")
    )

    int(
        "SoftBodySolver_getNumberOfVelocityIterations",
        "",

        opaque_p("obj", "")
    )

    float(
        "SoftBodySolver_getTimeScale",
        "EXPORT SolverTypes btSoftBodySolver_getSolverType(btSoftBodySolver* obj);",

        opaque_p("obj", "")
    )

    void(
        "SoftBodySolver_predictMotion",
        "EXPORT void btSoftBodySolver_optimize(btSoftBodySolver* obj, btAlignedObjectArray_btSoftBodyPtr* softBodies, bool forceUpdate);",

        opaque_p("obj", ""),
        float("solverdt", "")
    )

    void(
        "SoftBodySolver_setNumberOfPositionIterations",
        """
        EXPORT void btSoftBodySolver_processCollision(btSoftBodySolver* obj, btSoftBody* __unnamed0, const btCollisionObjectWrapper* __unnamed1); EXPORT void
        btSoftBodySolver_processCollision2(btSoftBodySolver* obj, btSoftBody* __unnamed0, btSoftBody* __unnamed1);
        """,

        opaque_p("obj", ""),
        int("iterations", "")
    )

    void(
        "SoftBodySolver_setNumberOfVelocityIterations",
        "",

        opaque_p("obj", ""),
        int("iterations", "")
    )

    void(
        "SoftBodySolver_solveConstraints",
        "",

        opaque_p("obj", ""),
        float("solverdt", "")
    )

    void(
        "SoftBodySolver_updateSoftBodies",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBodySolver_delete",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBodySolverOutput_delete",
        """
        EXPORT void btSoftBodySolverOutput_copySoftBodyToVertexBuffer(btSoftBodySolverOutput* obj, const btSoftBody* softBody, btVertexBufferDescriptor*
        vertexBuffer);
        """,

        opaque_p("obj", "")
    )

}