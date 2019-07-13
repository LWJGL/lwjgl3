/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

import org.lwjgl.system.*;

/** Initializes the zstd shared library. */
final class LibZstd {

    static {
        String libName = Platform.mapLibraryNameBundled("lwjgl_zstd");
        Library.loadSystem(System::load, System::loadLibrary, LibZstd.class, "org.lwjgl.zstd", libName);
    }

    private LibZstd() {
    }

    static void initialize() {
        // intentionally empty to trigger static initializer
    }

}
