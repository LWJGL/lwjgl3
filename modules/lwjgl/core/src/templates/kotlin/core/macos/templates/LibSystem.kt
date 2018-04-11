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
    documentation =
        """
        Native bindings to libSystem, the MacOS system library.

        This class contains no functionality and is only responsible for loading the system library. Other libraries (contained in libSystem) reuse the library
        handle loaded by this class.
        """
}