/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.rpmalloc;

import org.lwjgl.system.*;

/** Initializes the rpmalloc shared library. */
final class LibRPmalloc {

    static {
        String libName = Platform.mapLibraryNameBundled("lwjgl_rpmalloc");
        Library.loadSystem(System::load, System::loadLibrary, LibRPmalloc.class, "org.lwjgl.rpmalloc", libName);
    }

    private LibRPmalloc() {
    }

    static void initialize() {
        // intentionally empty to trigger static initializer
    }

}
