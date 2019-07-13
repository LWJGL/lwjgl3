/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import org.lwjgl.system.*;

/** Initializes the remotery shared library. */
final class LibRemotery {

    static {
        String libName = Platform.mapLibraryNameBundled("lwjgl_remotery");
        Library.loadSystem(System::load, System::loadLibrary, LibRemotery.class, "org.lwjgl.remotery", libName);
    }

    private LibRemotery() {
    }

    static void initialize() {
        // intentionally empty to trigger static initializer
    }

}
