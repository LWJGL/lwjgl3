/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SDLDialog {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ShowOpenFileDialog           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ShowOpenFileDialog"),
            ShowSaveFileDialog           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ShowSaveFileDialog"),
            ShowOpenFolderDialog         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ShowOpenFolderDialog"),
            ShowFileDialogWithProperties = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ShowFileDialogWithProperties");

    }

    public static final String
        SDL_PROP_FILE_DIALOG_FILTERS_POINTER = "SDL.filedialog.filters",
        SDL_PROP_FILE_DIALOG_NFILTERS_NUMBER = "SDL.filedialog.nfilters",
        SDL_PROP_FILE_DIALOG_WINDOW_POINTER  = "SDL.filedialog.window",
        SDL_PROP_FILE_DIALOG_LOCATION_STRING = "SDL.filedialog.location",
        SDL_PROP_FILE_DIALOG_MANY_BOOLEAN    = "SDL.filedialog.many",
        SDL_PROP_FILE_DIALOG_TITLE_STRING    = "SDL.filedialog.title",
        SDL_PROP_FILE_DIALOG_ACCEPT_STRING   = "SDL.filedialog.accept",
        SDL_PROP_FILE_DIALOG_CANCEL_STRING   = "SDL.filedialog.cancel";

    public static final int
        SDL_FILEDIALOG_OPENFILE   = 0,
        SDL_FILEDIALOG_SAVEFILE   = 1,
        SDL_FILEDIALOG_OPENFOLDER = 2;

    protected SDLDialog() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_ShowOpenFileDialog ] ---

    /** {@code void SDL_ShowOpenFileDialog(SDL_DialogFileCallback callback, void * userdata, SDL_Window * window, SDL_DialogFileFilter const * filters, int nfilters, char const * default_location, bool allow_many)} */
    public static void nSDL_ShowOpenFileDialog(long callback, long userdata, long window, long filters, int nfilters, long default_location, boolean allow_many) {
        long __functionAddress = Functions.ShowOpenFileDialog;
        if (CHECKS) {
            if (filters != NULL) { Struct.validate(filters, nfilters, SDL_DialogFileFilter.SIZEOF, SDL_DialogFileFilter::validate); }
        }
        invokePPPPPV(callback, userdata, window, filters, nfilters, default_location, allow_many, __functionAddress);
    }

    /** {@code void SDL_ShowOpenFileDialog(SDL_DialogFileCallback callback, void * userdata, SDL_Window * window, SDL_DialogFileFilter const * filters, int nfilters, char const * default_location, bool allow_many)} */
    public static void SDL_ShowOpenFileDialog(@NativeType("SDL_DialogFileCallback") SDL_DialogFileCallbackI callback, @NativeType("void *") long userdata, @NativeType("SDL_Window *") long window, @NativeType("SDL_DialogFileFilter const *") SDL_DialogFileFilter.@Nullable Buffer filters, @NativeType("char const *") @Nullable ByteBuffer default_location, @NativeType("bool") boolean allow_many) {
        if (CHECKS) {
            checkNT1Safe(default_location);
        }
        nSDL_ShowOpenFileDialog(callback.address(), userdata, window, memAddressSafe(filters), remainingSafe(filters), memAddressSafe(default_location), allow_many);
    }

    /** {@code void SDL_ShowOpenFileDialog(SDL_DialogFileCallback callback, void * userdata, SDL_Window * window, SDL_DialogFileFilter const * filters, int nfilters, char const * default_location, bool allow_many)} */
    public static void SDL_ShowOpenFileDialog(@NativeType("SDL_DialogFileCallback") SDL_DialogFileCallbackI callback, @NativeType("void *") long userdata, @NativeType("SDL_Window *") long window, @NativeType("SDL_DialogFileFilter const *") SDL_DialogFileFilter.@Nullable Buffer filters, @NativeType("char const *") @Nullable CharSequence default_location, @NativeType("bool") boolean allow_many) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(default_location, true);
            long default_locationEncoded = default_location == null ? NULL : stack.getPointerAddress();
            nSDL_ShowOpenFileDialog(callback.address(), userdata, window, memAddressSafe(filters), remainingSafe(filters), default_locationEncoded, allow_many);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_ShowSaveFileDialog ] ---

    /** {@code void SDL_ShowSaveFileDialog(SDL_DialogFileCallback callback, void * userdata, SDL_Window * window, SDL_DialogFileFilter const * filters, int nfilters, char const * default_location)} */
    public static void nSDL_ShowSaveFileDialog(long callback, long userdata, long window, long filters, int nfilters, long default_location) {
        long __functionAddress = Functions.ShowSaveFileDialog;
        if (CHECKS) {
            if (filters != NULL) { Struct.validate(filters, nfilters, SDL_DialogFileFilter.SIZEOF, SDL_DialogFileFilter::validate); }
        }
        invokePPPPPV(callback, userdata, window, filters, nfilters, default_location, __functionAddress);
    }

    /** {@code void SDL_ShowSaveFileDialog(SDL_DialogFileCallback callback, void * userdata, SDL_Window * window, SDL_DialogFileFilter const * filters, int nfilters, char const * default_location)} */
    public static void SDL_ShowSaveFileDialog(@NativeType("SDL_DialogFileCallback") SDL_DialogFileCallbackI callback, @NativeType("void *") long userdata, @NativeType("SDL_Window *") long window, @NativeType("SDL_DialogFileFilter const *") SDL_DialogFileFilter.@Nullable Buffer filters, @NativeType("char const *") @Nullable ByteBuffer default_location) {
        if (CHECKS) {
            checkNT1Safe(default_location);
        }
        nSDL_ShowSaveFileDialog(callback.address(), userdata, window, memAddressSafe(filters), remainingSafe(filters), memAddressSafe(default_location));
    }

    /** {@code void SDL_ShowSaveFileDialog(SDL_DialogFileCallback callback, void * userdata, SDL_Window * window, SDL_DialogFileFilter const * filters, int nfilters, char const * default_location)} */
    public static void SDL_ShowSaveFileDialog(@NativeType("SDL_DialogFileCallback") SDL_DialogFileCallbackI callback, @NativeType("void *") long userdata, @NativeType("SDL_Window *") long window, @NativeType("SDL_DialogFileFilter const *") SDL_DialogFileFilter.@Nullable Buffer filters, @NativeType("char const *") @Nullable CharSequence default_location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(default_location, true);
            long default_locationEncoded = default_location == null ? NULL : stack.getPointerAddress();
            nSDL_ShowSaveFileDialog(callback.address(), userdata, window, memAddressSafe(filters), remainingSafe(filters), default_locationEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_ShowOpenFolderDialog ] ---

    /** {@code void SDL_ShowOpenFolderDialog(SDL_DialogFileCallback callback, void * userdata, SDL_Window * window, char const * default_location, bool allow_many)} */
    public static void nSDL_ShowOpenFolderDialog(long callback, long userdata, long window, long default_location, boolean allow_many) {
        long __functionAddress = Functions.ShowOpenFolderDialog;
        invokePPPPV(callback, userdata, window, default_location, allow_many, __functionAddress);
    }

    /** {@code void SDL_ShowOpenFolderDialog(SDL_DialogFileCallback callback, void * userdata, SDL_Window * window, char const * default_location, bool allow_many)} */
    public static void SDL_ShowOpenFolderDialog(@NativeType("SDL_DialogFileCallback") SDL_DialogFileCallbackI callback, @NativeType("void *") long userdata, @NativeType("SDL_Window *") long window, @NativeType("char const *") @Nullable ByteBuffer default_location, @NativeType("bool") boolean allow_many) {
        if (CHECKS) {
            checkNT1Safe(default_location);
        }
        nSDL_ShowOpenFolderDialog(callback.address(), userdata, window, memAddressSafe(default_location), allow_many);
    }

    /** {@code void SDL_ShowOpenFolderDialog(SDL_DialogFileCallback callback, void * userdata, SDL_Window * window, char const * default_location, bool allow_many)} */
    public static void SDL_ShowOpenFolderDialog(@NativeType("SDL_DialogFileCallback") SDL_DialogFileCallbackI callback, @NativeType("void *") long userdata, @NativeType("SDL_Window *") long window, @NativeType("char const *") @Nullable CharSequence default_location, @NativeType("bool") boolean allow_many) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(default_location, true);
            long default_locationEncoded = default_location == null ? NULL : stack.getPointerAddress();
            nSDL_ShowOpenFolderDialog(callback.address(), userdata, window, default_locationEncoded, allow_many);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_ShowFileDialogWithProperties ] ---

    /** {@code void SDL_ShowFileDialogWithProperties(SDL_FileDialogType type, SDL_DialogFileCallback callback, void * userdata, SDL_PropertiesID props)} */
    public static void nSDL_ShowFileDialogWithProperties(int type, long callback, long userdata, int props) {
        long __functionAddress = Functions.ShowFileDialogWithProperties;
        invokePPV(type, callback, userdata, props, __functionAddress);
    }

    /** {@code void SDL_ShowFileDialogWithProperties(SDL_FileDialogType type, SDL_DialogFileCallback callback, void * userdata, SDL_PropertiesID props)} */
    public static void SDL_ShowFileDialogWithProperties(@NativeType("SDL_FileDialogType") int type, @NativeType("SDL_DialogFileCallback") SDL_DialogFileCallbackI callback, @NativeType("void *") long userdata, @NativeType("SDL_PropertiesID") int props) {
        nSDL_ShowFileDialogWithProperties(type, callback.address(), userdata, props);
    }

}