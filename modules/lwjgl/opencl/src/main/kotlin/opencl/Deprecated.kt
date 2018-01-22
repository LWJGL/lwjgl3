/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl

import org.lwjgl.generator.*

/** Marks an OpenCL function as deprecated. */
class DeprecatedCL(val after: String) : FunctionModifier {
    override val isSpecial = false
    override fun validate(func: Func) {
        if (!func.nativeClass.postfix.isEmpty())
            throw IllegalArgumentException("The deprecated modifier can only be applied on core functionality.")
    }
}