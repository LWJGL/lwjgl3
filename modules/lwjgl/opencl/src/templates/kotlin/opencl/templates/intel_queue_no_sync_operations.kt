/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_queue_no_sync_operations = "INTELQueueNOSyncOperations".nativeClassCL("intel_queue_no_sync_operations", INTEL) {
    IntConstant(
        "QUEUE_NO_SYNC_OPERATIONS_INTEL".."1 << 29",
    )
}
