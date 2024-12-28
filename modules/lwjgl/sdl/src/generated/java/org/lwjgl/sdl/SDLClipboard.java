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

public class SDLClipboard {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            SetClipboardText        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetClipboardText"),
            GetClipboardText        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetClipboardText"),
            HasClipboardText        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasClipboardText"),
            SetPrimarySelectionText = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetPrimarySelectionText"),
            GetPrimarySelectionText = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPrimarySelectionText"),
            HasPrimarySelectionText = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasPrimarySelectionText"),
            SetClipboardData        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetClipboardData"),
            ClearClipboardData      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ClearClipboardData"),
            GetClipboardData        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetClipboardData"),
            HasClipboardData        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasClipboardData"),
            GetClipboardMimeTypes   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetClipboardMimeTypes");

    }

    protected SDLClipboard() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_SetClipboardText ] ---

    /** {@code bool SDL_SetClipboardText(char const * text)} */
    public static boolean nSDL_SetClipboardText(long text) {
        long __functionAddress = Functions.SetClipboardText;
        return invokePZ(text, __functionAddress);
    }

    /** {@code bool SDL_SetClipboardText(char const * text)} */
    @NativeType("bool")
    public static boolean SDL_SetClipboardText(@NativeType("char const *") ByteBuffer text) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nSDL_SetClipboardText(memAddress(text));
    }

    /** {@code bool SDL_SetClipboardText(char const * text)} */
    @NativeType("bool")
    public static boolean SDL_SetClipboardText(@NativeType("char const *") CharSequence text) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nSDL_SetClipboardText(textEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetClipboardText ] ---

    /** {@code char * SDL_GetClipboardText(void)} */
    public static long nSDL_GetClipboardText() {
        long __functionAddress = Functions.GetClipboardText;
        return invokeP(__functionAddress);
    }

    /** {@code char * SDL_GetClipboardText(void)} */
    @NativeType("char *")
    public static @Nullable String SDL_GetClipboardText() {
        long __result = NULL;
        try {
            __result = nSDL_GetClipboardText();
            return memUTF8Safe(__result);
        } finally {
            nSDL_free(__result);
        }
    }

    // --- [ SDL_HasClipboardText ] ---

    /** {@code bool SDL_HasClipboardText(void)} */
    @NativeType("bool")
    public static boolean SDL_HasClipboardText() {
        long __functionAddress = Functions.HasClipboardText;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_SetPrimarySelectionText ] ---

    /** {@code bool SDL_SetPrimarySelectionText(char const * text)} */
    public static boolean nSDL_SetPrimarySelectionText(long text) {
        long __functionAddress = Functions.SetPrimarySelectionText;
        return invokePZ(text, __functionAddress);
    }

    /** {@code bool SDL_SetPrimarySelectionText(char const * text)} */
    @NativeType("bool")
    public static boolean SDL_SetPrimarySelectionText(@NativeType("char const *") ByteBuffer text) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nSDL_SetPrimarySelectionText(memAddress(text));
    }

    /** {@code bool SDL_SetPrimarySelectionText(char const * text)} */
    @NativeType("bool")
    public static boolean SDL_SetPrimarySelectionText(@NativeType("char const *") CharSequence text) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nSDL_SetPrimarySelectionText(textEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetPrimarySelectionText ] ---

    /** {@code char * SDL_GetPrimarySelectionText(void)} */
    public static long nSDL_GetPrimarySelectionText() {
        long __functionAddress = Functions.GetPrimarySelectionText;
        return invokeP(__functionAddress);
    }

    /** {@code char * SDL_GetPrimarySelectionText(void)} */
    @NativeType("char *")
    public static @Nullable String SDL_GetPrimarySelectionText() {
        long __result = NULL;
        try {
            __result = nSDL_GetPrimarySelectionText();
            return memUTF8Safe(__result);
        } finally {
            nSDL_free(__result);
        }
    }

    // --- [ SDL_HasPrimarySelectionText ] ---

    /** {@code bool SDL_HasPrimarySelectionText(void)} */
    @NativeType("bool")
    public static boolean SDL_HasPrimarySelectionText() {
        long __functionAddress = Functions.HasPrimarySelectionText;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_SetClipboardData ] ---

    /** {@code bool SDL_SetClipboardData(SDL_ClipboardDataCallback callback, SDL_ClipboardCleanupCallback cleanup, void * userdata, char const ** mime_types, size_t num_mime_types)} */
    public static boolean nSDL_SetClipboardData(long callback, long cleanup, long userdata, long mime_types, long num_mime_types) {
        long __functionAddress = Functions.SetClipboardData;
        return invokePPPPPZ(callback, cleanup, userdata, mime_types, num_mime_types, __functionAddress);
    }

    /** {@code bool SDL_SetClipboardData(SDL_ClipboardDataCallback callback, SDL_ClipboardCleanupCallback cleanup, void * userdata, char const ** mime_types, size_t num_mime_types)} */
    @NativeType("bool")
    public static boolean SDL_SetClipboardData(@NativeType("SDL_ClipboardDataCallback") SDL_ClipboardDataCallbackI callback, @NativeType("SDL_ClipboardCleanupCallback") SDL_ClipboardCleanupCallbackI cleanup, @NativeType("void *") long userdata, @NativeType("char const **") PointerBuffer mime_types) {
        return nSDL_SetClipboardData(callback.address(), cleanup.address(), userdata, memAddress(mime_types), mime_types.remaining());
    }

    // --- [ SDL_ClearClipboardData ] ---

    /** {@code bool SDL_ClearClipboardData(void)} */
    @NativeType("bool")
    public static boolean SDL_ClearClipboardData() {
        long __functionAddress = Functions.ClearClipboardData;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_GetClipboardData ] ---

    /** {@code void * SDL_GetClipboardData(char const * mime_type, size_t * size)} */
    public static long nSDL_GetClipboardData(long mime_type, long size) {
        long __functionAddress = Functions.GetClipboardData;
        return invokePPP(mime_type, size, __functionAddress);
    }

    /** {@code void * SDL_GetClipboardData(char const * mime_type, size_t * size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer SDL_GetClipboardData(@NativeType("char const *") ByteBuffer mime_type) {
        if (CHECKS) {
            checkNT1(mime_type);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        PointerBuffer size = stack.callocPointer(1);
        try {
            long __result = nSDL_GetClipboardData(memAddress(mime_type), memAddress(size));
            return memByteBufferSafe(__result, (int)size.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void * SDL_GetClipboardData(char const * mime_type, size_t * size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer SDL_GetClipboardData(@NativeType("char const *") CharSequence mime_type) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer size = stack.callocPointer(1);
            stack.nASCII(mime_type, true);
            long mime_typeEncoded = stack.getPointerAddress();
            long __result = nSDL_GetClipboardData(mime_typeEncoded, memAddress(size));
            return memByteBufferSafe(__result, (int)size.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_HasClipboardData ] ---

    /** {@code bool SDL_HasClipboardData(char const * mime_type)} */
    public static boolean nSDL_HasClipboardData(long mime_type) {
        long __functionAddress = Functions.HasClipboardData;
        return invokePZ(mime_type, __functionAddress);
    }

    /** {@code bool SDL_HasClipboardData(char const * mime_type)} */
    @NativeType("bool")
    public static boolean SDL_HasClipboardData(@NativeType("char const *") ByteBuffer mime_type) {
        if (CHECKS) {
            checkNT1(mime_type);
        }
        return nSDL_HasClipboardData(memAddress(mime_type));
    }

    /** {@code bool SDL_HasClipboardData(char const * mime_type)} */
    @NativeType("bool")
    public static boolean SDL_HasClipboardData(@NativeType("char const *") CharSequence mime_type) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(mime_type, true);
            long mime_typeEncoded = stack.getPointerAddress();
            return nSDL_HasClipboardData(mime_typeEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetClipboardMimeTypes ] ---

    /** {@code char ** SDL_GetClipboardMimeTypes(size_t * num_mime_types)} */
    public static long nSDL_GetClipboardMimeTypes(long num_mime_types) {
        long __functionAddress = Functions.GetClipboardMimeTypes;
        return invokePP(num_mime_types, __functionAddress);
    }

    /** {@code char ** SDL_GetClipboardMimeTypes(size_t * num_mime_types)} */
    @NativeType("char **")
    public static @Nullable PointerBuffer SDL_GetClipboardMimeTypes() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        PointerBuffer num_mime_types = stack.callocPointer(1);
        try {
            long __result = nSDL_GetClipboardMimeTypes(memAddress(num_mime_types));
            return memPointerBufferSafe(__result, (int)num_mime_types.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}