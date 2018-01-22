/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.macosx.templates

import org.lwjgl.generator.*
import org.lwjgl.system.macosx.*

val libSystem = "LibSystem".nativeClass(MACOSX_PACKAGE, binding = simpleBinding("System")) {
    documentation =
        """
        Native bindings to libSystem, the MacOS system library.

        This class contains no functionality and is only responsible for loading the system library. Other libraries (contained in libSystem) reuse the library
        handle loaded by this class.
        """
}