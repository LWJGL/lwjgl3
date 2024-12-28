/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import java.nio.*;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.libffi.LibFFI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SDLGUID {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GUIDToString = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GUIDToString"),
            StringToGUID = apiGetFunctionAddress(SDL.getLibrary(), "SDL_StringToGUID");

    }

    protected SDLGUID() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_GUIDToString ] ---

    private static final FFICIF SDL_GUIDToStringCIF = apiCreateCIF(
        FFI_DEFAULT_ABI, ffi_type_void,
        apiCreateStruct(apiCreateArray(ffi_type_uint8, 16)), ffi_type_pointer, ffi_type_sint32
    );

    /** {@code void SDL_GUIDToString(SDL_GUID guid, char * pszGUID, int cbGUID)} */
    public static void nSDL_GUIDToString(long guid, long pszGUID, int cbGUID) {
        long __functionAddress = Functions.GUIDToString;
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 3);
            memPutAddress(arguments, guid);
            memPutAddress(arguments + POINTER_SIZE, stack.npointer(pszGUID));
            memPutAddress(arguments + 2 * POINTER_SIZE, stack.nint(cbGUID));

            nffi_call(SDL_GUIDToStringCIF.address(), __functionAddress, NULL, arguments);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void SDL_GUIDToString(SDL_GUID guid, char * pszGUID, int cbGUID)} */
    public static void SDL_GUIDToString(SDL_GUID guid, @NativeType("char *") ByteBuffer pszGUID) {
        if (CHECKS) {
            check(pszGUID, 33);
        }
        nSDL_GUIDToString(guid.address(), memAddress(pszGUID), pszGUID.remaining());
    }

    // --- [ SDL_StringToGUID ] ---

    private static final FFICIF SDL_StringToGUIDCIF = apiCreateCIF(
        FFI_DEFAULT_ABI, apiCreateStruct(apiCreateArray(ffi_type_uint8, 16)),
        ffi_type_pointer
    );

    /** {@code SDL_GUID SDL_StringToGUID(char const * pchGUID)} */
    public static void nSDL_StringToGUID(long pchGUID, long __result) {
        long __functionAddress = Functions.StringToGUID;
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 1);
            memPutAddress(arguments, stack.npointer(pchGUID));

            nffi_call(SDL_StringToGUIDCIF.address(), __functionAddress, __result, arguments);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code SDL_GUID SDL_StringToGUID(char const * pchGUID)} */
    public static SDL_GUID SDL_StringToGUID(@NativeType("char const *") ByteBuffer pchGUID, SDL_GUID __result) {
        if (CHECKS) {
            checkNT1(pchGUID);
        }
        nSDL_StringToGUID(memAddress(pchGUID), __result.address());
        return __result;
    }

    /** {@code SDL_GUID SDL_StringToGUID(char const * pchGUID)} */
    public static SDL_GUID SDL_StringToGUID(@NativeType("char const *") CharSequence pchGUID, SDL_GUID __result) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchGUID, true);
            long pchGUIDEncoded = stack.getPointerAddress();
            nSDL_StringToGUID(pchGUIDEncoded, __result.address());
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}