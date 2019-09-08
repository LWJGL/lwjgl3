/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.driftfx;

import org.lwjgl.system.*;

/** Initializes the driftfx shared library. */
final class LibDriftFX {

    static {
        String libName = Platform.mapLibraryNameBundled("lwjgl_driftfx");
        Library.loadSystem(System::load, System::loadLibrary, LibDriftFX.class, "org.lwjgl.driftfx", libName);
    }

    private LibDriftFX() {
    }

    static void initialize() {
        // intentionally empty to trigger static initializer
    }

}
