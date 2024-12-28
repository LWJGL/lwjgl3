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

public class SDLInit {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            Init                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_Init"),
            InitSubSystem          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_InitSubSystem"),
            QuitSubSystem          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_QuitSubSystem"),
            WasInit                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WasInit"),
            Quit                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_Quit"),
            IsMainThread           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_IsMainThread"),
            RunOnMainThread        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RunOnMainThread"),
            SetAppMetadata         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetAppMetadata"),
            SetAppMetadataProperty = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetAppMetadataProperty"),
            GetAppMetadataProperty = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAppMetadataProperty");

    }

    public static final int
        SDL_INIT_AUDIO    = 0x00000010,
        SDL_INIT_VIDEO    = 0x00000020,
        SDL_INIT_JOYSTICK = 0x00000200,
        SDL_INIT_HAPTIC   = 0x00001000,
        SDL_INIT_GAMEPAD  = 0x00002000,
        SDL_INIT_EVENTS   = 0x00004000,
        SDL_INIT_SENSOR   = 0x00008000,
        SDL_INIT_CAMERA   = 0x00010000;

    public static final String
        SDL_PROP_APP_METADATA_NAME_STRING       = "SDL.app.metadata.name",
        SDL_PROP_APP_METADATA_VERSION_STRING    = "SDL.app.metadata.version",
        SDL_PROP_APP_METADATA_IDENTIFIER_STRING = "SDL.app.metadata.identifier",
        SDL_PROP_APP_METADATA_CREATOR_STRING    = "SDL.app.metadata.creator",
        SDL_PROP_APP_METADATA_COPYRIGHT_STRING  = "SDL.app.metadata.copyright",
        SDL_PROP_APP_METADATA_URL_STRING        = "SDL.app.metadata.url",
        SDL_PROP_APP_METADATA_TYPE_STRING       = "SDL.app.metadata.type";

    protected SDLInit() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_Init ] ---

    /** {@code bool SDL_Init(SDL_InitFlags flags)} */
    @NativeType("bool")
    public static boolean SDL_Init(@NativeType("SDL_InitFlags") int flags) {
        long __functionAddress = Functions.Init;
        return invokeZ(flags, __functionAddress);
    }

    // --- [ SDL_InitSubSystem ] ---

    /** {@code bool SDL_InitSubSystem(SDL_InitFlags flags)} */
    @NativeType("bool")
    public static boolean SDL_InitSubSystem(@NativeType("SDL_InitFlags") int flags) {
        long __functionAddress = Functions.InitSubSystem;
        return invokeZ(flags, __functionAddress);
    }

    // --- [ SDL_QuitSubSystem ] ---

    /** {@code void SDL_QuitSubSystem(SDL_InitFlags flags)} */
    public static void SDL_QuitSubSystem(@NativeType("SDL_InitFlags") int flags) {
        long __functionAddress = Functions.QuitSubSystem;
        invokeV(flags, __functionAddress);
    }

    // --- [ SDL_WasInit ] ---

    /** {@code SDL_InitFlags SDL_WasInit(SDL_InitFlags flags)} */
    @NativeType("SDL_InitFlags")
    public static int SDL_WasInit(@NativeType("SDL_InitFlags") int flags) {
        long __functionAddress = Functions.WasInit;
        return invokeI(flags, __functionAddress);
    }

    // --- [ SDL_Quit ] ---

    /** {@code void SDL_Quit(void)} */
    public static void SDL_Quit() {
        long __functionAddress = Functions.Quit;
        invokeV(__functionAddress);
    }

    // --- [ SDL_IsMainThread ] ---

    /** {@code bool SDL_IsMainThread(void)} */
    @NativeType("bool")
    public static boolean SDL_IsMainThread() {
        long __functionAddress = Functions.IsMainThread;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_RunOnMainThread ] ---

    /** {@code bool SDL_RunOnMainThread(SDL_MainThreadCallback callback, void * userdata, bool wait_complete)} */
    public static boolean nSDL_RunOnMainThread(long callback, long userdata, boolean wait_complete) {
        long __functionAddress = Functions.RunOnMainThread;
        return invokePPZ(callback, userdata, wait_complete, __functionAddress);
    }

    /** {@code bool SDL_RunOnMainThread(SDL_MainThreadCallback callback, void * userdata, bool wait_complete)} */
    @NativeType("bool")
    public static boolean SDL_RunOnMainThread(@NativeType("SDL_MainThreadCallback") SDL_MainThreadCallbackI callback, @NativeType("void *") long userdata, @NativeType("bool") boolean wait_complete) {
        return nSDL_RunOnMainThread(callback.address(), userdata, wait_complete);
    }

    // --- [ SDL_SetAppMetadata ] ---

    /** {@code bool SDL_SetAppMetadata(char const * appname, char const * appversion, char const * appidentifier)} */
    public static boolean nSDL_SetAppMetadata(long appname, long appversion, long appidentifier) {
        long __functionAddress = Functions.SetAppMetadata;
        return invokePPPZ(appname, appversion, appidentifier, __functionAddress);
    }

    /** {@code bool SDL_SetAppMetadata(char const * appname, char const * appversion, char const * appidentifier)} */
    @NativeType("bool")
    public static boolean SDL_SetAppMetadata(@NativeType("char const *") @Nullable ByteBuffer appname, @NativeType("char const *") @Nullable ByteBuffer appversion, @NativeType("char const *") @Nullable ByteBuffer appidentifier) {
        if (CHECKS) {
            checkNT1Safe(appname);
            checkNT1Safe(appversion);
            checkNT1Safe(appidentifier);
        }
        return nSDL_SetAppMetadata(memAddressSafe(appname), memAddressSafe(appversion), memAddressSafe(appidentifier));
    }

    /** {@code bool SDL_SetAppMetadata(char const * appname, char const * appversion, char const * appidentifier)} */
    @NativeType("bool")
    public static boolean SDL_SetAppMetadata(@NativeType("char const *") @Nullable CharSequence appname, @NativeType("char const *") @Nullable CharSequence appversion, @NativeType("char const *") @Nullable CharSequence appidentifier) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(appname, true);
            long appnameEncoded = appname == null ? NULL : stack.getPointerAddress();
            stack.nUTF8Safe(appversion, true);
            long appversionEncoded = appversion == null ? NULL : stack.getPointerAddress();
            stack.nUTF8Safe(appidentifier, true);
            long appidentifierEncoded = appidentifier == null ? NULL : stack.getPointerAddress();
            return nSDL_SetAppMetadata(appnameEncoded, appversionEncoded, appidentifierEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetAppMetadataProperty ] ---

    /** {@code bool SDL_SetAppMetadataProperty(char const * name, char const * value)} */
    public static boolean nSDL_SetAppMetadataProperty(long name, long value) {
        long __functionAddress = Functions.SetAppMetadataProperty;
        return invokePPZ(name, value, __functionAddress);
    }

    /** {@code bool SDL_SetAppMetadataProperty(char const * name, char const * value)} */
    @NativeType("bool")
    public static boolean SDL_SetAppMetadataProperty(@NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer value) {
        if (CHECKS) {
            checkNT1(name);
            checkNT1(value);
        }
        return nSDL_SetAppMetadataProperty(memAddress(name), memAddress(value));
    }

    /** {@code bool SDL_SetAppMetadataProperty(char const * name, char const * value)} */
    @NativeType("bool")
    public static boolean SDL_SetAppMetadataProperty(@NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8(value, true);
            long valueEncoded = stack.getPointerAddress();
            return nSDL_SetAppMetadataProperty(nameEncoded, valueEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetAppMetadataProperty ] ---

    /** {@code char const * SDL_GetAppMetadataProperty(char const * name)} */
    public static long nSDL_GetAppMetadataProperty(long name) {
        long __functionAddress = Functions.GetAppMetadataProperty;
        return invokePP(name, __functionAddress);
    }

    /** {@code char const * SDL_GetAppMetadataProperty(char const * name)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetAppMetadataProperty(@NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        long __result = nSDL_GetAppMetadataProperty(memAddress(name));
        return memUTF8Safe(__result);
    }

    /** {@code char const * SDL_GetAppMetadataProperty(char const * name)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetAppMetadataProperty(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            long __result = nSDL_GetAppMetadataProperty(nameEncoded);
            return memUTF8Safe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}