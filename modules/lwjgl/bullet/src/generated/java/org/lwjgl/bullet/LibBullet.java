/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import org.lwjgl.system.*;

/** Initializes the bullet shared library. */
final class LibBullet {

    static {
        String libName = Platform.mapLibraryNameBundled("lwjgl_bullet");
        Library.loadSystem(System::load, System::loadLibrary, LibBullet.class, "org.lwjgl.bullet", libName);
    }

    private LibBullet() {
    }

    static void initialize() {
        // intentionally empty to trigger static initializer
    }

}
