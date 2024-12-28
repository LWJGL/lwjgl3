/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.lwjgl.system.*;

public final class SDL {

    private static final SharedLibrary SDL = Library.loadNative(SDL.class, "org.lwjgl.sdl", Configuration.SDL_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("SDL3")), true);

    /** Returns the sdl {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return SDL;
    }

    private SDL() {
        throw new UnsupportedOperationException();
    }

}