/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.libdivide;

import org.lwjgl.system.*;

/** Initializes the libdivide shared library. */
final class LibDivideBoot {

    static {
        String libName = Platform.mapLibraryNameBundled("lwjgl_libdivide");
        Library.loadSystem(System::load, System::loadLibrary, LibDivideBoot.class, libName);
    }

    private LibDivideBoot() {
    }

    static void initialize() {
        // intentionally empty to trigger static initializer
    }

}
