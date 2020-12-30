/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btMLCPSolverInterface = "BTMLCPSolverInterface".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    void(
        "MLCPSolverInterface_delete",
        """
        EXPORT bool btMLCPSolverInterface_solveMLCP(btMLCPSolverInterface* obj, const btMatrixX_float* A, const btVectorX_float* b, btVectorX_float* x, const
        btVectorX_float* lo, const btVectorX_float* hi, const btAlignedObjectArray_int* limitDependency, int numIterations, bool useSparsity);
        """,

        opaque_p("obj", "")
    )

}