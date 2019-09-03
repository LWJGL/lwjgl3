/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.meshoptimizer;

import org.lwjgl.system.*;

/** Initializes the meshoptimizer shared library. */
final class LibMeshOptimizer {

    static {
        String libName = Platform.mapLibraryNameBundled("lwjgl_meshoptimizer");
        Library.loadSystem(System::load, System::loadLibrary, LibMeshOptimizer.class, "org.lwjgl.meshoptimizer", libName);
    }

    private LibMeshOptimizer() {
    }

    static void initialize() {
        // intentionally empty to trigger static initializer
    }

}
