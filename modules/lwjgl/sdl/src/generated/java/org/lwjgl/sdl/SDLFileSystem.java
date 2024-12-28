/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.sdl.SDLStdinc.*;

public class SDLFileSystem {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetBasePath         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetBasePath"),
            GetPrefPath         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPrefPath"),
            GetUserFolder       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetUserFolder"),
            CreateDirectory     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateDirectory"),
            EnumerateDirectory  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_EnumerateDirectory"),
            RemovePath          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RemovePath"),
            RenamePath          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenamePath"),
            CopyFile            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CopyFile"),
            GetPathInfo         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPathInfo"),
            GlobDirectory       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GlobDirectory"),
            GetCurrentDirectory = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCurrentDirectory");

    }

    public static final int
        SDL_FOLDER_HOME        = 0,
        SDL_FOLDER_DESKTOP     = 1,
        SDL_FOLDER_DOCUMENTS   = 2,
        SDL_FOLDER_DOWNLOADS   = 3,
        SDL_FOLDER_MUSIC       = 4,
        SDL_FOLDER_PICTURES    = 5,
        SDL_FOLDER_PUBLICSHARE = 6,
        SDL_FOLDER_SAVEDGAMES  = 7,
        SDL_FOLDER_SCREENSHOTS = 8,
        SDL_FOLDER_TEMPLATES   = 9,
        SDL_FOLDER_VIDEOS      = 10,
        SDL_FOLDER_COUNT       = 11;

    public static final int
        SDL_PATHTYPE_NONE      = 0,
        SDL_PATHTYPE_FILE      = 1,
        SDL_PATHTYPE_DIRECTORY = 2,
        SDL_PATHTYPE_OTHER     = 3;

    public static final int
        SDL_ENUM_CONTINUE = 0,
        SDL_ENUM_SUCCESS  = 1,
        SDL_ENUM_FAILURE  = 2;

    protected SDLFileSystem() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_GetBasePath ] ---

    /** {@code char const * SDL_GetBasePath(void)} */
    public static long nSDL_GetBasePath() {
        long __functionAddress = Functions.GetBasePath;
        return invokeP(__functionAddress);
    }

    /** {@code char const * SDL_GetBasePath(void)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetBasePath() {
        long __result = nSDL_GetBasePath();
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetPrefPath ] ---

    /** {@code char * SDL_GetPrefPath(char const * org, char const * app)} */
    public static long nSDL_GetPrefPath(long org, long app) {
        long __functionAddress = Functions.GetPrefPath;
        return invokePPP(org, app, __functionAddress);
    }

    /** {@code char * SDL_GetPrefPath(char const * org, char const * app)} */
    @NativeType("char *")
    public static @Nullable String SDL_GetPrefPath(@NativeType("char const *") ByteBuffer org, @NativeType("char const *") ByteBuffer app) {
        if (CHECKS) {
            checkNT1(org);
            checkNT1(app);
        }
        long __result = NULL;
        try {
            __result = nSDL_GetPrefPath(memAddress(org), memAddress(app));
            return memUTF8Safe(__result);
        } finally {
            nSDL_free(__result);
        }
    }

    /** {@code char * SDL_GetPrefPath(char const * org, char const * app)} */
    @NativeType("char *")
    public static @Nullable String SDL_GetPrefPath(@NativeType("char const *") CharSequence org, @NativeType("char const *") CharSequence app) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        long __result = NULL;
        try {
            stack.nUTF8(org, true);
            long orgEncoded = stack.getPointerAddress();
            stack.nUTF8(app, true);
            long appEncoded = stack.getPointerAddress();
            __result = nSDL_GetPrefPath(orgEncoded, appEncoded);
            return memUTF8Safe(__result);
        } finally {
            nSDL_free(__result);
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetUserFolder ] ---

    /** {@code char const * SDL_GetUserFolder(SDL_Folder folder)} */
    public static long nSDL_GetUserFolder(int folder) {
        long __functionAddress = Functions.GetUserFolder;
        return invokeP(folder, __functionAddress);
    }

    /** {@code char const * SDL_GetUserFolder(SDL_Folder folder)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetUserFolder(@NativeType("SDL_Folder") int folder) {
        long __result = nSDL_GetUserFolder(folder);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_CreateDirectory ] ---

    /** {@code bool SDL_CreateDirectory(char const * path)} */
    public static boolean nSDL_CreateDirectory(long path) {
        long __functionAddress = Functions.CreateDirectory;
        return invokePZ(path, __functionAddress);
    }

    /** {@code bool SDL_CreateDirectory(char const * path)} */
    @NativeType("bool")
    public static boolean SDL_CreateDirectory(@NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nSDL_CreateDirectory(memAddress(path));
    }

    /** {@code bool SDL_CreateDirectory(char const * path)} */
    @NativeType("bool")
    public static boolean SDL_CreateDirectory(@NativeType("char const *") CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_CreateDirectory(pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_EnumerateDirectory ] ---

    /** {@code bool SDL_EnumerateDirectory(char const * path, SDL_EnumerateDirectoryCallback callback, void * userdata)} */
    public static boolean nSDL_EnumerateDirectory(long path, long callback, long userdata) {
        long __functionAddress = Functions.EnumerateDirectory;
        return invokePPPZ(path, callback, userdata, __functionAddress);
    }

    /** {@code bool SDL_EnumerateDirectory(char const * path, SDL_EnumerateDirectoryCallback callback, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_EnumerateDirectory(@NativeType("char const *") ByteBuffer path, @NativeType("SDL_EnumerateDirectoryCallback") SDL_EnumerateDirectoryCallbackI callback, @NativeType("void *") long userdata) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nSDL_EnumerateDirectory(memAddress(path), callback.address(), userdata);
    }

    /** {@code bool SDL_EnumerateDirectory(char const * path, SDL_EnumerateDirectoryCallback callback, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_EnumerateDirectory(@NativeType("char const *") CharSequence path, @NativeType("SDL_EnumerateDirectoryCallback") SDL_EnumerateDirectoryCallbackI callback, @NativeType("void *") long userdata) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_EnumerateDirectory(pathEncoded, callback.address(), userdata);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_RemovePath ] ---

    /** {@code bool SDL_RemovePath(char const * path)} */
    public static boolean nSDL_RemovePath(long path) {
        long __functionAddress = Functions.RemovePath;
        return invokePZ(path, __functionAddress);
    }

    /** {@code bool SDL_RemovePath(char const * path)} */
    @NativeType("bool")
    public static boolean SDL_RemovePath(@NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nSDL_RemovePath(memAddress(path));
    }

    /** {@code bool SDL_RemovePath(char const * path)} */
    @NativeType("bool")
    public static boolean SDL_RemovePath(@NativeType("char const *") CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_RemovePath(pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_RenamePath ] ---

    /** {@code bool SDL_RenamePath(char const * oldpath, char const * newpath)} */
    public static boolean nSDL_RenamePath(long oldpath, long newpath) {
        long __functionAddress = Functions.RenamePath;
        return invokePPZ(oldpath, newpath, __functionAddress);
    }

    /** {@code bool SDL_RenamePath(char const * oldpath, char const * newpath)} */
    @NativeType("bool")
    public static boolean SDL_RenamePath(@NativeType("char const *") ByteBuffer oldpath, @NativeType("char const *") ByteBuffer newpath) {
        if (CHECKS) {
            checkNT1(oldpath);
            checkNT1(newpath);
        }
        return nSDL_RenamePath(memAddress(oldpath), memAddress(newpath));
    }

    /** {@code bool SDL_RenamePath(char const * oldpath, char const * newpath)} */
    @NativeType("bool")
    public static boolean SDL_RenamePath(@NativeType("char const *") CharSequence oldpath, @NativeType("char const *") CharSequence newpath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(oldpath, true);
            long oldpathEncoded = stack.getPointerAddress();
            stack.nUTF8(newpath, true);
            long newpathEncoded = stack.getPointerAddress();
            return nSDL_RenamePath(oldpathEncoded, newpathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_CopyFile ] ---

    /** {@code bool SDL_CopyFile(char const * oldpath, char const * newpath)} */
    public static boolean nSDL_CopyFile(long oldpath, long newpath) {
        long __functionAddress = Functions.CopyFile;
        return invokePPZ(oldpath, newpath, __functionAddress);
    }

    /** {@code bool SDL_CopyFile(char const * oldpath, char const * newpath)} */
    @NativeType("bool")
    public static boolean SDL_CopyFile(@NativeType("char const *") ByteBuffer oldpath, @NativeType("char const *") ByteBuffer newpath) {
        if (CHECKS) {
            checkNT1(oldpath);
            checkNT1(newpath);
        }
        return nSDL_CopyFile(memAddress(oldpath), memAddress(newpath));
    }

    /** {@code bool SDL_CopyFile(char const * oldpath, char const * newpath)} */
    @NativeType("bool")
    public static boolean SDL_CopyFile(@NativeType("char const *") CharSequence oldpath, @NativeType("char const *") CharSequence newpath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(oldpath, true);
            long oldpathEncoded = stack.getPointerAddress();
            stack.nUTF8(newpath, true);
            long newpathEncoded = stack.getPointerAddress();
            return nSDL_CopyFile(oldpathEncoded, newpathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetPathInfo ] ---

    /** {@code bool SDL_GetPathInfo(char const * path, SDL_PathInfo * info)} */
    public static boolean nSDL_GetPathInfo(long path, long info) {
        long __functionAddress = Functions.GetPathInfo;
        return invokePPZ(path, info, __functionAddress);
    }

    /** {@code bool SDL_GetPathInfo(char const * path, SDL_PathInfo * info)} */
    @NativeType("bool")
    public static boolean SDL_GetPathInfo(@NativeType("char const *") ByteBuffer path, @NativeType("SDL_PathInfo *") @Nullable SDL_PathInfo info) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nSDL_GetPathInfo(memAddress(path), memAddressSafe(info));
    }

    /** {@code bool SDL_GetPathInfo(char const * path, SDL_PathInfo * info)} */
    @NativeType("bool")
    public static boolean SDL_GetPathInfo(@NativeType("char const *") CharSequence path, @NativeType("SDL_PathInfo *") @Nullable SDL_PathInfo info) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_GetPathInfo(pathEncoded, memAddressSafe(info));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GlobDirectory ] ---

    /** {@code char ** SDL_GlobDirectory(char const * path, char const * pattern, SDL_GlobFlags flags, int * count)} */
    public static long nSDL_GlobDirectory(long path, long pattern, int flags, long count) {
        long __functionAddress = Functions.GlobDirectory;
        return invokePPPP(path, pattern, flags, count, __functionAddress);
    }

    /** {@code char ** SDL_GlobDirectory(char const * path, char const * pattern, SDL_GlobFlags flags, int * count)} */
    @NativeType("char **")
    public static @Nullable PointerBuffer SDL_GlobDirectory(@NativeType("char const *") ByteBuffer path, @NativeType("char const *") @Nullable ByteBuffer pattern, @NativeType("SDL_GlobFlags") int flags) {
        if (CHECKS) {
            checkNT1(path);
            checkNT1Safe(pattern);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GlobDirectory(memAddress(path), memAddressSafe(pattern), flags, memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code char ** SDL_GlobDirectory(char const * path, char const * pattern, SDL_GlobFlags flags, int * count)} */
    @NativeType("char **")
    public static @Nullable PointerBuffer SDL_GlobDirectory(@NativeType("char const *") CharSequence path, @NativeType("char const *") @Nullable CharSequence pattern, @NativeType("SDL_GlobFlags") int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer count = stack.callocInt(1);
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            stack.nUTF8Safe(pattern, true);
            long patternEncoded = pattern == null ? NULL : stack.getPointerAddress();
            long __result = nSDL_GlobDirectory(pathEncoded, patternEncoded, flags, memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetCurrentDirectory ] ---

    /** {@code char * SDL_GetCurrentDirectory(void)} */
    public static long nSDL_GetCurrentDirectory() {
        long __functionAddress = Functions.GetCurrentDirectory;
        return invokeP(__functionAddress);
    }

    /** {@code char * SDL_GetCurrentDirectory(void)} */
    @NativeType("char *")
    public static @Nullable String SDL_GetCurrentDirectory() {
        long __result = NULL;
        try {
            __result = nSDL_GetCurrentDirectory();
            return memUTF8Safe(__result);
        } finally {
            nSDL_free(__result);
        }
    }

}