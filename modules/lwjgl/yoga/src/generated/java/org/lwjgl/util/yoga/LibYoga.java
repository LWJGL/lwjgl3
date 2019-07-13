/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.lwjgl.system.*;

/** Initializes the yoga shared library. */
final class LibYoga {

    static {
        String libName = Platform.mapLibraryNameBundled("lwjgl_yoga");
        Library.loadSystem(System::load, System::loadLibrary, LibYoga.class, "org.lwjgl.yoga", libName);
    }

    private LibYoga() {
    }

    static void initialize() {
        // intentionally empty to trigger static initializer
    }

}
