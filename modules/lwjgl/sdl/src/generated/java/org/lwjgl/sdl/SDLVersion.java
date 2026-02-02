/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SDLVersion {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetVersion  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetVersion"),
            GetRevision = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRevision");

    }

    public static final int SDL_MAJOR_VERSION = 3;

    public static final int SDL_MINOR_VERSION = 4;

    public static final int SDL_MICRO_VERSION = 1;

    public static final int SDL_VERSION = SDL_VERSIONNUM(SDL_MAJOR_VERSION, SDL_MINOR_VERSION, SDL_MICRO_VERSION);

    protected SDLVersion() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_GetVersion ] ---

    /** {@code int SDL_GetVersion(void)} */
    public static int SDL_GetVersion() {
        long __functionAddress = Functions.GetVersion;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_GetRevision ] ---

    /** {@code char const * SDL_GetRevision(void)} */
    public static long nSDL_GetRevision() {
        long __functionAddress = Functions.GetRevision;
        return invokeP(__functionAddress);
    }

    /** {@code char const * SDL_GetRevision(void)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetRevision() {
        long __result = nSDL_GetRevision();
        return memASCIISafe(__result);
    }

    // --- [ SDL_VERSIONNUM ] ---

    /** {@code uint32_t SDL_VERSIONNUM(uint32_t major, uint32_t minor, uint32_t patch)} */
    @NativeType("uint32_t")
    public static int SDL_VERSIONNUM(@NativeType("uint32_t") int major, @NativeType("uint32_t") int minor, @NativeType("uint32_t") int patch) {
        return (major) * 1000000 + (minor) * 1000 + patch;
    }

    // --- [ SDL_VERSIONNUM_MAJOR ] ---

    /** {@code uint32_t SDL_VERSIONNUM_MAJOR(uint32_t version)} */
    @NativeType("uint32_t")
    public static int SDL_VERSIONNUM_MAJOR(@NativeType("uint32_t") int version) {
        return version / 1000000;
    }

    // --- [ SDL_VERSIONNUM_MINOR ] ---

    /** {@code uint32_t SDL_VERSIONNUM_MINOR(uint32_t version)} */
    @NativeType("uint32_t")
    public static int SDL_VERSIONNUM_MINOR(@NativeType("uint32_t") int version) {
        return (version / 1000) % 1000;
    }

    // --- [ SDL_VERSIONNUM_MICRO ] ---

    /** {@code uint32_t SDL_VERSIONNUM_MICRO(uint32_t version)} */
    @NativeType("uint32_t")
    public static int SDL_VERSIONNUM_MICRO(@NativeType("uint32_t") int version) {
        return version % 1000;
    }

    // --- [ SDL_VERSION_ATLEAST ] ---

    /** {@code bool SDL_VERSION_ATLEAST(uint32_t X, uint32_t Y, uint32_t Z)} */
    @NativeType("bool")
    public static boolean SDL_VERSION_ATLEAST(@NativeType("uint32_t") int X, @NativeType("uint32_t") int Y, @NativeType("uint32_t") int Z) {
        return SDL_VERSION >= SDL_VERSIONNUM(X, Y, Z);
    }

}