/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.simd;

import org.lwjgl.system.*;

/** Initializes the sse shared library. */
final class LibSSE {

    static {
        String libName = Platform.mapLibraryNameBundled("lwjgl_sse");
        Library.loadSystem(System::load, System::loadLibrary, LibSSE.class, "org.lwjgl.sse", libName);
    }

    private LibSSE() {
    }

    static void initialize() {
        // intentionally empty to trigger static initializer
    }

}
