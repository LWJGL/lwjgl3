/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.macos.templates

import org.lwjgl.generator.*

val libSystem = "LibSystem".nativeClass(
    Module.CORE_MACOS,
    nativeSubPath = "macos",
    binding = simpleBinding(Module.CORE_MACOS, "System")
) {
}