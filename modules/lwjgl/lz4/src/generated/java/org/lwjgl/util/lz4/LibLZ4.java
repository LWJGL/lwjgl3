/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import org.lwjgl.system.*;

/** Initializes the lz4 shared library. */
final class LibLZ4 {

    static {
        String libName = Platform.mapLibraryNameBundled("lwjgl_lz4");
        Library.loadSystem(System::load, System::loadLibrary, LibLZ4.class, "org.lwjgl.lz4", libName);
    }

    private LibLZ4() {
    }

    static void initialize() {
        // intentionally empty to trigger static initializer
    }

}
