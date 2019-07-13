/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.meow;

import org.lwjgl.system.*;

/** Initializes the meow shared library. */
final class LibMeow {

    static {
        String libName = Platform.mapLibraryNameBundled("lwjgl_meow");
        Library.loadSystem(System::load, System::loadLibrary, LibMeow.class, "org.lwjgl.meow", libName);
    }

    private LibMeow() {
    }

    static void initialize() {
        // intentionally empty to trigger static initializer
    }

}
