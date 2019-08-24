/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import org.lwjgl.system.*;


public final class LibBullet {

    private LibBullet() {
        throw new UnsupportedOperationException();
    }

    private static final SharedLibrary BULLET = Library.loadNative(LibBullet.class, "org.lwjgl.bullet", Configuration.BULLET_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("bulletc")), true);

    /** Returns the bullet {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return BULLET;
    }

}