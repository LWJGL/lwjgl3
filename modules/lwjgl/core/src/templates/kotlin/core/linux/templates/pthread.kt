/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.linux.templates

import core.linux.*
import org.lwjgl.generator.*

val pthread = "PThread".nativeClass(Module.CORE_LINUX, prefixMethod = "pthread_", nativeSubPath = "linux") {
    nativeImport("<pthread.h>")
    pthread_t(
        "self",

        void()
    )
}