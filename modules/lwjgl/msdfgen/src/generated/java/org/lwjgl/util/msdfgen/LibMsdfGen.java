/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.msdfgen;

import org.lwjgl.system.*;

/** Initializes the msdfgen shared library. */
final class LibMsdfGen {

    static {
        String libName = Platform.mapLibraryNameBundled("lwjgl_msdfgen");
        Library.loadSystem(System::load, System::loadLibrary, LibMsdfGen.class, "org.lwjgl.msdfgen", libName);
    }

    private LibMsdfGen() {
    }

    static void initialize() {
        // intentionally empty to trigger static initializer
    }

}
