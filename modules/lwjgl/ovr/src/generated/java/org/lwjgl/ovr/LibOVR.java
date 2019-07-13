/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.lwjgl.system.*;

/** Initializes the ovr shared library. */
final class LibOVR {

    static {
        String libName = Platform.mapLibraryNameBundled("lwjgl_ovr");
        Library.loadSystem(System::load, System::loadLibrary, LibOVR.class, "org.lwjgl.ovr", libName);
    }

    private LibOVR() {
    }

    static void initialize() {
        // intentionally empty to trigger static initializer
    }

}
