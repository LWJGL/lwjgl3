/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_exec_by_local_thread = "INTELExecByLocalThread".nativeClassCL("intel_exec_by_local_thread", INTEL) {
    LongConstant(
        "QUEUE_THREAD_LOCAL_EXEC_ENABLE_INTEL".."1L << 31",
    )
}