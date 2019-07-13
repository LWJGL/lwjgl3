/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

/** Initializes the llvm shared library. */
final class LibLLVM {

    static {
        String libName = Platform.mapLibraryNameBundled("lwjgl_llvm");
        Library.loadSystem(System::load, System::loadLibrary, LibLLVM.class, "org.lwjgl.llvm", libName);
    }

    private LibLLVM() {
    }

    static void initialize() {
        // intentionally empty to trigger static initializer
    }

}
