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

public class SDLStorage {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            OpenTitleStorage          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenTitleStorage"),
            OpenUserStorage           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenUserStorage"),
            OpenFileStorage           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenFileStorage"),
            OpenStorage               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenStorage"),
            CloseStorage              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CloseStorage"),
            StorageReady              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_StorageReady"),
            GetStorageFileSize        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetStorageFileSize"),
            ReadStorageFile           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadStorageFile"),
            WriteStorageFile          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteStorageFile"),
            CreateStorageDirectory    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateStorageDirectory"),
            EnumerateStorageDirectory = apiGetFunctionAddress(SDL.getLibrary(), "SDL_EnumerateStorageDirectory"),
            RemoveStoragePath         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RemoveStoragePath"),
            RenameStoragePath         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenameStoragePath"),
            CopyStorageFile           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CopyStorageFile"),
            GetStoragePathInfo        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetStoragePathInfo"),
            GetStorageSpaceRemaining  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetStorageSpaceRemaining"),
            GlobStorageDirectory      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GlobStorageDirectory");

    }

    protected SDLStorage() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_OpenTitleStorage ] ---

    /** {@code SDL_Storage * SDL_OpenTitleStorage(char const * override, SDL_PropertiesID props)} */
    public static long nSDL_OpenTitleStorage(long override, int props) {
        long __functionAddress = Functions.OpenTitleStorage;
        return invokePP(override, props, __functionAddress);
    }

    /** {@code SDL_Storage * SDL_OpenTitleStorage(char const * override, SDL_PropertiesID props)} */
    @NativeType("SDL_Storage *")
    public static long SDL_OpenTitleStorage(@NativeType("char const *") @Nullable ByteBuffer override, @NativeType("SDL_PropertiesID") int props) {
        if (CHECKS) {
            checkNT1Safe(override);
        }
        return nSDL_OpenTitleStorage(memAddressSafe(override), props);
    }

    /** {@code SDL_Storage * SDL_OpenTitleStorage(char const * override, SDL_PropertiesID props)} */
    @NativeType("SDL_Storage *")
    public static long SDL_OpenTitleStorage(@NativeType("char const *") @Nullable CharSequence override, @NativeType("SDL_PropertiesID") int props) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(override, true);
            long overrideEncoded = override == null ? NULL : stack.getPointerAddress();
            return nSDL_OpenTitleStorage(overrideEncoded, props);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_OpenUserStorage ] ---

    /** {@code SDL_Storage * SDL_OpenUserStorage(char const * org, char const * app, SDL_PropertiesID props)} */
    public static long nSDL_OpenUserStorage(long org, long app, int props) {
        long __functionAddress = Functions.OpenUserStorage;
        return invokePPP(org, app, props, __functionAddress);
    }

    /** {@code SDL_Storage * SDL_OpenUserStorage(char const * org, char const * app, SDL_PropertiesID props)} */
    @NativeType("SDL_Storage *")
    public static long SDL_OpenUserStorage(@NativeType("char const *") ByteBuffer org, @NativeType("char const *") ByteBuffer app, @NativeType("SDL_PropertiesID") int props) {
        if (CHECKS) {
            checkNT1(org);
            checkNT1(app);
        }
        return nSDL_OpenUserStorage(memAddress(org), memAddress(app), props);
    }

    /** {@code SDL_Storage * SDL_OpenUserStorage(char const * org, char const * app, SDL_PropertiesID props)} */
    @NativeType("SDL_Storage *")
    public static long SDL_OpenUserStorage(@NativeType("char const *") CharSequence org, @NativeType("char const *") CharSequence app, @NativeType("SDL_PropertiesID") int props) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(org, true);
            long orgEncoded = stack.getPointerAddress();
            stack.nUTF8(app, true);
            long appEncoded = stack.getPointerAddress();
            return nSDL_OpenUserStorage(orgEncoded, appEncoded, props);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_OpenFileStorage ] ---

    /** {@code SDL_Storage * SDL_OpenFileStorage(char const * path)} */
    public static long nSDL_OpenFileStorage(long path) {
        long __functionAddress = Functions.OpenFileStorage;
        return invokePP(path, __functionAddress);
    }

    /** {@code SDL_Storage * SDL_OpenFileStorage(char const * path)} */
    @NativeType("SDL_Storage *")
    public static long SDL_OpenFileStorage(@NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nSDL_OpenFileStorage(memAddress(path));
    }

    /** {@code SDL_Storage * SDL_OpenFileStorage(char const * path)} */
    @NativeType("SDL_Storage *")
    public static long SDL_OpenFileStorage(@NativeType("char const *") CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_OpenFileStorage(pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_OpenStorage ] ---

    /** {@code SDL_Storage * SDL_OpenStorage(SDL_StorageInterface const * iface, void * userdata)} */
    public static long nSDL_OpenStorage(long iface, long userdata) {
        long __functionAddress = Functions.OpenStorage;
        return invokePPP(iface, userdata, __functionAddress);
    }

    /** {@code SDL_Storage * SDL_OpenStorage(SDL_StorageInterface const * iface, void * userdata)} */
    @NativeType("SDL_Storage *")
    public static long SDL_OpenStorage(@NativeType("SDL_StorageInterface const *") SDL_StorageInterface iface, @NativeType("void *") long userdata) {
        return nSDL_OpenStorage(iface.address(), userdata);
    }

    // --- [ SDL_CloseStorage ] ---

    /** {@code bool SDL_CloseStorage(SDL_Storage * storage)} */
    @NativeType("bool")
    public static boolean SDL_CloseStorage(@NativeType("SDL_Storage *") long storage) {
        long __functionAddress = Functions.CloseStorage;
        if (CHECKS) {
            check(storage);
        }
        return invokePZ(storage, __functionAddress);
    }

    // --- [ SDL_StorageReady ] ---

    /** {@code bool SDL_StorageReady(SDL_Storage * storage)} */
    @NativeType("bool")
    public static boolean SDL_StorageReady(@NativeType("SDL_Storage *") long storage) {
        long __functionAddress = Functions.StorageReady;
        if (CHECKS) {
            check(storage);
        }
        return invokePZ(storage, __functionAddress);
    }

    // --- [ SDL_GetStorageFileSize ] ---

    /** {@code bool SDL_GetStorageFileSize(SDL_Storage * storage, char const * path, Uint64 * length)} */
    public static boolean nSDL_GetStorageFileSize(long storage, long path, long length) {
        long __functionAddress = Functions.GetStorageFileSize;
        if (CHECKS) {
            check(storage);
        }
        return invokePPPZ(storage, path, length, __functionAddress);
    }

    /** {@code bool SDL_GetStorageFileSize(SDL_Storage * storage, char const * path, Uint64 * length)} */
    @NativeType("bool")
    public static boolean SDL_GetStorageFileSize(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer path, @NativeType("Uint64 *") @Nullable LongBuffer length) {
        if (CHECKS) {
            checkNT1(path);
            checkSafe(length, 1);
        }
        return nSDL_GetStorageFileSize(storage, memAddress(path), memAddressSafe(length));
    }

    /** {@code bool SDL_GetStorageFileSize(SDL_Storage * storage, char const * path, Uint64 * length)} */
    @NativeType("bool")
    public static boolean SDL_GetStorageFileSize(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence path, @NativeType("Uint64 *") @Nullable LongBuffer length) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_GetStorageFileSize(storage, pathEncoded, memAddressSafe(length));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_ReadStorageFile ] ---

    /** {@code bool SDL_ReadStorageFile(SDL_Storage * storage, char const * path, void * destination, Uint64 length)} */
    public static boolean nSDL_ReadStorageFile(long storage, long path, long destination, long length) {
        long __functionAddress = Functions.ReadStorageFile;
        if (CHECKS) {
            check(storage);
        }
        return invokePPPJZ(storage, path, destination, length, __functionAddress);
    }

    /** {@code bool SDL_ReadStorageFile(SDL_Storage * storage, char const * path, void * destination, Uint64 length)} */
    @NativeType("bool")
    public static boolean SDL_ReadStorageFile(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer path, @NativeType("void *") ByteBuffer destination) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nSDL_ReadStorageFile(storage, memAddress(path), memAddress(destination), destination.remaining());
    }

    /** {@code bool SDL_ReadStorageFile(SDL_Storage * storage, char const * path, void * destination, Uint64 length)} */
    @NativeType("bool")
    public static boolean SDL_ReadStorageFile(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence path, @NativeType("void *") ByteBuffer destination) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_ReadStorageFile(storage, pathEncoded, memAddress(destination), destination.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_WriteStorageFile ] ---

    /** {@code bool SDL_WriteStorageFile(SDL_Storage * storage, char const * path, void const * source, Uint64 length)} */
    public static boolean nSDL_WriteStorageFile(long storage, long path, long source, long length) {
        long __functionAddress = Functions.WriteStorageFile;
        if (CHECKS) {
            check(storage);
        }
        return invokePPPJZ(storage, path, source, length, __functionAddress);
    }

    /** {@code bool SDL_WriteStorageFile(SDL_Storage * storage, char const * path, void const * source, Uint64 length)} */
    @NativeType("bool")
    public static boolean SDL_WriteStorageFile(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer path, @NativeType("void const *") ByteBuffer source) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nSDL_WriteStorageFile(storage, memAddress(path), memAddress(source), source.remaining());
    }

    /** {@code bool SDL_WriteStorageFile(SDL_Storage * storage, char const * path, void const * source, Uint64 length)} */
    @NativeType("bool")
    public static boolean SDL_WriteStorageFile(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence path, @NativeType("void const *") ByteBuffer source) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_WriteStorageFile(storage, pathEncoded, memAddress(source), source.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_CreateStorageDirectory ] ---

    /** {@code bool SDL_CreateStorageDirectory(SDL_Storage * storage, char const * path)} */
    public static boolean nSDL_CreateStorageDirectory(long storage, long path) {
        long __functionAddress = Functions.CreateStorageDirectory;
        if (CHECKS) {
            check(storage);
        }
        return invokePPZ(storage, path, __functionAddress);
    }

    /** {@code bool SDL_CreateStorageDirectory(SDL_Storage * storage, char const * path)} */
    @NativeType("bool")
    public static boolean SDL_CreateStorageDirectory(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nSDL_CreateStorageDirectory(storage, memAddress(path));
    }

    /** {@code bool SDL_CreateStorageDirectory(SDL_Storage * storage, char const * path)} */
    @NativeType("bool")
    public static boolean SDL_CreateStorageDirectory(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_CreateStorageDirectory(storage, pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_EnumerateStorageDirectory ] ---

    /** {@code bool SDL_EnumerateStorageDirectory(SDL_Storage * storage, char const * path, SDL_EnumerateDirectoryCallback callback, void * userdata)} */
    public static boolean nSDL_EnumerateStorageDirectory(long storage, long path, long callback, long userdata) {
        long __functionAddress = Functions.EnumerateStorageDirectory;
        if (CHECKS) {
            check(storage);
        }
        return invokePPPPZ(storage, path, callback, userdata, __functionAddress);
    }

    /** {@code bool SDL_EnumerateStorageDirectory(SDL_Storage * storage, char const * path, SDL_EnumerateDirectoryCallback callback, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_EnumerateStorageDirectory(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") @Nullable ByteBuffer path, @NativeType("SDL_EnumerateDirectoryCallback") SDL_EnumerateDirectoryCallbackI callback, @NativeType("void *") long userdata) {
        if (CHECKS) {
            checkNT1Safe(path);
        }
        return nSDL_EnumerateStorageDirectory(storage, memAddressSafe(path), callback.address(), userdata);
    }

    /** {@code bool SDL_EnumerateStorageDirectory(SDL_Storage * storage, char const * path, SDL_EnumerateDirectoryCallback callback, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_EnumerateStorageDirectory(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") @Nullable CharSequence path, @NativeType("SDL_EnumerateDirectoryCallback") SDL_EnumerateDirectoryCallbackI callback, @NativeType("void *") long userdata) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(path, true);
            long pathEncoded = path == null ? NULL : stack.getPointerAddress();
            return nSDL_EnumerateStorageDirectory(storage, pathEncoded, callback.address(), userdata);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_RemoveStoragePath ] ---

    /** {@code bool SDL_RemoveStoragePath(SDL_Storage * storage, char const * path)} */
    public static boolean nSDL_RemoveStoragePath(long storage, long path) {
        long __functionAddress = Functions.RemoveStoragePath;
        if (CHECKS) {
            check(storage);
        }
        return invokePPZ(storage, path, __functionAddress);
    }

    /** {@code bool SDL_RemoveStoragePath(SDL_Storage * storage, char const * path)} */
    @NativeType("bool")
    public static boolean SDL_RemoveStoragePath(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nSDL_RemoveStoragePath(storage, memAddress(path));
    }

    /** {@code bool SDL_RemoveStoragePath(SDL_Storage * storage, char const * path)} */
    @NativeType("bool")
    public static boolean SDL_RemoveStoragePath(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_RemoveStoragePath(storage, pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_RenameStoragePath ] ---

    /** {@code bool SDL_RenameStoragePath(SDL_Storage * storage, char const * oldpath, char const * newpath)} */
    public static boolean nSDL_RenameStoragePath(long storage, long oldpath, long newpath) {
        long __functionAddress = Functions.RenameStoragePath;
        if (CHECKS) {
            check(storage);
        }
        return invokePPPZ(storage, oldpath, newpath, __functionAddress);
    }

    /** {@code bool SDL_RenameStoragePath(SDL_Storage * storage, char const * oldpath, char const * newpath)} */
    @NativeType("bool")
    public static boolean SDL_RenameStoragePath(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer oldpath, @NativeType("char const *") ByteBuffer newpath) {
        if (CHECKS) {
            checkNT1(oldpath);
            checkNT1(newpath);
        }
        return nSDL_RenameStoragePath(storage, memAddress(oldpath), memAddress(newpath));
    }

    /** {@code bool SDL_RenameStoragePath(SDL_Storage * storage, char const * oldpath, char const * newpath)} */
    @NativeType("bool")
    public static boolean SDL_RenameStoragePath(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence oldpath, @NativeType("char const *") CharSequence newpath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(oldpath, true);
            long oldpathEncoded = stack.getPointerAddress();
            stack.nUTF8(newpath, true);
            long newpathEncoded = stack.getPointerAddress();
            return nSDL_RenameStoragePath(storage, oldpathEncoded, newpathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_CopyStorageFile ] ---

    /** {@code bool SDL_CopyStorageFile(SDL_Storage * storage, char const * oldpath, char const * newpath)} */
    public static boolean nSDL_CopyStorageFile(long storage, long oldpath, long newpath) {
        long __functionAddress = Functions.CopyStorageFile;
        if (CHECKS) {
            check(storage);
        }
        return invokePPPZ(storage, oldpath, newpath, __functionAddress);
    }

    /** {@code bool SDL_CopyStorageFile(SDL_Storage * storage, char const * oldpath, char const * newpath)} */
    @NativeType("bool")
    public static boolean SDL_CopyStorageFile(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer oldpath, @NativeType("char const *") ByteBuffer newpath) {
        if (CHECKS) {
            checkNT1(oldpath);
            checkNT1(newpath);
        }
        return nSDL_CopyStorageFile(storage, memAddress(oldpath), memAddress(newpath));
    }

    /** {@code bool SDL_CopyStorageFile(SDL_Storage * storage, char const * oldpath, char const * newpath)} */
    @NativeType("bool")
    public static boolean SDL_CopyStorageFile(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence oldpath, @NativeType("char const *") CharSequence newpath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(oldpath, true);
            long oldpathEncoded = stack.getPointerAddress();
            stack.nUTF8(newpath, true);
            long newpathEncoded = stack.getPointerAddress();
            return nSDL_CopyStorageFile(storage, oldpathEncoded, newpathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetStoragePathInfo ] ---

    /** {@code bool SDL_GetStoragePathInfo(SDL_Storage * storage, char const * path, SDL_PathInfo * info)} */
    public static boolean nSDL_GetStoragePathInfo(long storage, long path, long info) {
        long __functionAddress = Functions.GetStoragePathInfo;
        if (CHECKS) {
            check(storage);
        }
        return invokePPPZ(storage, path, info, __functionAddress);
    }

    /** {@code bool SDL_GetStoragePathInfo(SDL_Storage * storage, char const * path, SDL_PathInfo * info)} */
    @NativeType("bool")
    public static boolean SDL_GetStoragePathInfo(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer path, @NativeType("SDL_PathInfo *") @Nullable SDL_PathInfo info) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nSDL_GetStoragePathInfo(storage, memAddress(path), memAddressSafe(info));
    }

    /** {@code bool SDL_GetStoragePathInfo(SDL_Storage * storage, char const * path, SDL_PathInfo * info)} */
    @NativeType("bool")
    public static boolean SDL_GetStoragePathInfo(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence path, @NativeType("SDL_PathInfo *") @Nullable SDL_PathInfo info) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nSDL_GetStoragePathInfo(storage, pathEncoded, memAddressSafe(info));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetStorageSpaceRemaining ] ---

    /** {@code Uint64 SDL_GetStorageSpaceRemaining(SDL_Storage * storage)} */
    @NativeType("Uint64")
    public static long SDL_GetStorageSpaceRemaining(@NativeType("SDL_Storage *") long storage) {
        long __functionAddress = Functions.GetStorageSpaceRemaining;
        if (CHECKS) {
            check(storage);
        }
        return invokePJ(storage, __functionAddress);
    }

    // --- [ SDL_GlobStorageDirectory ] ---

    /** {@code char ** SDL_GlobStorageDirectory(SDL_Storage * storage, char const * path, char const * pattern, SDL_GlobFlags flags, int * count)} */
    public static long nSDL_GlobStorageDirectory(long storage, long path, long pattern, int flags, long count) {
        long __functionAddress = Functions.GlobStorageDirectory;
        if (CHECKS) {
            check(storage);
        }
        return invokePPPPP(storage, path, pattern, flags, count, __functionAddress);
    }

    /** {@code char ** SDL_GlobStorageDirectory(SDL_Storage * storage, char const * path, char const * pattern, SDL_GlobFlags flags, int * count)} */
    @NativeType("char **")
    public static @Nullable PointerBuffer SDL_GlobStorageDirectory(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") @Nullable ByteBuffer path, @NativeType("char const *") @Nullable ByteBuffer pattern, @NativeType("SDL_GlobFlags") int flags) {
        if (CHECKS) {
            checkNT1Safe(path);
            checkNT1Safe(pattern);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GlobStorageDirectory(storage, memAddressSafe(path), memAddressSafe(pattern), flags, memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code char ** SDL_GlobStorageDirectory(SDL_Storage * storage, char const * path, char const * pattern, SDL_GlobFlags flags, int * count)} */
    @NativeType("char **")
    public static @Nullable PointerBuffer SDL_GlobStorageDirectory(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") @Nullable CharSequence path, @NativeType("char const *") @Nullable CharSequence pattern, @NativeType("SDL_GlobFlags") int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer count = stack.callocInt(1);
            stack.nUTF8Safe(path, true);
            long pathEncoded = path == null ? NULL : stack.getPointerAddress();
            stack.nUTF8Safe(pattern, true);
            long patternEncoded = pattern == null ? NULL : stack.getPointerAddress();
            long __result = nSDL_GlobStorageDirectory(storage, pathEncoded, patternEncoded, flags, memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void SDL_INIT_INTERFACE(SDL_StorageInterface * iface)} */
    public static void SDL_INIT_INTERFACE(SDL_StorageInterface iface) {
        iface.clear();
        iface.version(SDL_StorageInterface.SIZEOF);
    }

}