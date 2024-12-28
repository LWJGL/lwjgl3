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

public class SDLProperties {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetGlobalProperties           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGlobalProperties"),
            CreateProperties              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateProperties"),
            CopyProperties                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CopyProperties"),
            LockProperties                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_LockProperties"),
            UnlockProperties              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_UnlockProperties"),
            SetPointerPropertyWithCleanup = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetPointerPropertyWithCleanup"),
            SetPointerProperty            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetPointerProperty"),
            SetStringProperty             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetStringProperty"),
            SetNumberProperty             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetNumberProperty"),
            SetFloatProperty              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetFloatProperty"),
            SetBooleanProperty            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetBooleanProperty"),
            HasProperty                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasProperty"),
            GetPropertyType               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPropertyType"),
            GetPointerProperty            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPointerProperty"),
            GetStringProperty             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetStringProperty"),
            GetNumberProperty             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumberProperty"),
            GetFloatProperty              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetFloatProperty"),
            GetBooleanProperty            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetBooleanProperty"),
            ClearProperty                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ClearProperty"),
            EnumerateProperties           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_EnumerateProperties"),
            DestroyProperties             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyProperties");

    }

    public static final int
        SDL_PROPERTY_TYPE_INVALID = 0x0,
        SDL_PROPERTY_TYPE_POINTER = 0x1,
        SDL_PROPERTY_TYPE_STRING  = 0x2,
        SDL_PROPERTY_TYPE_NUMBER  = 0x3,
        SDL_PROPERTY_TYPE_FLOAT   = 0x4,
        SDL_PROPERTY_TYPE_BOOLEAN = 0x5;

    protected SDLProperties() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_GetGlobalProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetGlobalProperties(void)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetGlobalProperties() {
        long __functionAddress = Functions.GetGlobalProperties;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_CreateProperties ] ---

    /** {@code SDL_PropertiesID SDL_CreateProperties(void)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_CreateProperties() {
        long __functionAddress = Functions.CreateProperties;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_CopyProperties ] ---

    /** {@code bool SDL_CopyProperties(SDL_PropertiesID src, SDL_PropertiesID dst)} */
    @NativeType("bool")
    public static boolean SDL_CopyProperties(@NativeType("SDL_PropertiesID") int src, @NativeType("SDL_PropertiesID") int dst) {
        long __functionAddress = Functions.CopyProperties;
        return invokeZ(src, dst, __functionAddress);
    }

    // --- [ SDL_LockProperties ] ---

    /** {@code bool SDL_LockProperties(SDL_PropertiesID props)} */
    @NativeType("bool")
    public static boolean SDL_LockProperties(@NativeType("SDL_PropertiesID") int props) {
        long __functionAddress = Functions.LockProperties;
        return invokeZ(props, __functionAddress);
    }

    // --- [ SDL_UnlockProperties ] ---

    /** {@code void SDL_UnlockProperties(SDL_PropertiesID props)} */
    public static void SDL_UnlockProperties(@NativeType("SDL_PropertiesID") int props) {
        long __functionAddress = Functions.UnlockProperties;
        invokeV(props, __functionAddress);
    }

    // --- [ SDL_SetPointerPropertyWithCleanup ] ---

    /** {@code bool SDL_SetPointerPropertyWithCleanup(SDL_PropertiesID props, char const * name, void * value, SDL_CleanupPropertyCallback cleanup, void * userdata)} */
    public static boolean nSDL_SetPointerPropertyWithCleanup(int props, long name, long value, long cleanup, long userdata) {
        long __functionAddress = Functions.SetPointerPropertyWithCleanup;
        return invokePPPPZ(props, name, value, cleanup, userdata, __functionAddress);
    }

    /** {@code bool SDL_SetPointerPropertyWithCleanup(SDL_PropertiesID props, char const * name, void * value, SDL_CleanupPropertyCallback cleanup, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_SetPointerPropertyWithCleanup(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("void *") long value, @NativeType("SDL_CleanupPropertyCallback") @Nullable SDL_CleanupPropertyCallbackI cleanup, @NativeType("void *") long userdata) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_SetPointerPropertyWithCleanup(props, memAddress(name), value, memAddressSafe(cleanup), userdata);
    }

    /** {@code bool SDL_SetPointerPropertyWithCleanup(SDL_PropertiesID props, char const * name, void * value, SDL_CleanupPropertyCallback cleanup, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_SetPointerPropertyWithCleanup(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("void *") long value, @NativeType("SDL_CleanupPropertyCallback") @Nullable SDL_CleanupPropertyCallbackI cleanup, @NativeType("void *") long userdata) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_SetPointerPropertyWithCleanup(props, nameEncoded, value, memAddressSafe(cleanup), userdata);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetPointerProperty ] ---

    /** {@code bool SDL_SetPointerProperty(SDL_PropertiesID props, char const * name, void * value)} */
    public static boolean nSDL_SetPointerProperty(int props, long name, long value) {
        long __functionAddress = Functions.SetPointerProperty;
        return invokePPZ(props, name, value, __functionAddress);
    }

    /** {@code bool SDL_SetPointerProperty(SDL_PropertiesID props, char const * name, void * value)} */
    @NativeType("bool")
    public static boolean SDL_SetPointerProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("void *") long value) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_SetPointerProperty(props, memAddress(name), value);
    }

    /** {@code bool SDL_SetPointerProperty(SDL_PropertiesID props, char const * name, void * value)} */
    @NativeType("bool")
    public static boolean SDL_SetPointerProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("void *") long value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_SetPointerProperty(props, nameEncoded, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetStringProperty ] ---

    /** {@code bool SDL_SetStringProperty(SDL_PropertiesID props, char const * name, char const * value)} */
    public static boolean nSDL_SetStringProperty(int props, long name, long value) {
        long __functionAddress = Functions.SetStringProperty;
        return invokePPZ(props, name, value, __functionAddress);
    }

    /** {@code bool SDL_SetStringProperty(SDL_PropertiesID props, char const * name, char const * value)} */
    @NativeType("bool")
    public static boolean SDL_SetStringProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") @Nullable ByteBuffer value) {
        if (CHECKS) {
            checkNT1(name);
            checkNT1Safe(value);
        }
        return nSDL_SetStringProperty(props, memAddress(name), memAddressSafe(value));
    }

    /** {@code bool SDL_SetStringProperty(SDL_PropertiesID props, char const * name, char const * value)} */
    @NativeType("bool")
    public static boolean SDL_SetStringProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("char const *") @Nullable CharSequence value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8Safe(value, true);
            long valueEncoded = value == null ? NULL : stack.getPointerAddress();
            return nSDL_SetStringProperty(props, nameEncoded, valueEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetNumberProperty ] ---

    /** {@code bool SDL_SetNumberProperty(SDL_PropertiesID props, char const * name, Sint64 value)} */
    public static boolean nSDL_SetNumberProperty(int props, long name, long value) {
        long __functionAddress = Functions.SetNumberProperty;
        return invokePJZ(props, name, value, __functionAddress);
    }

    /** {@code bool SDL_SetNumberProperty(SDL_PropertiesID props, char const * name, Sint64 value)} */
    @NativeType("bool")
    public static boolean SDL_SetNumberProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("Sint64") long value) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_SetNumberProperty(props, memAddress(name), value);
    }

    /** {@code bool SDL_SetNumberProperty(SDL_PropertiesID props, char const * name, Sint64 value)} */
    @NativeType("bool")
    public static boolean SDL_SetNumberProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("Sint64") long value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_SetNumberProperty(props, nameEncoded, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetFloatProperty ] ---

    /** {@code bool SDL_SetFloatProperty(SDL_PropertiesID props, char const * name, float value)} */
    public static boolean nSDL_SetFloatProperty(int props, long name, float value) {
        long __functionAddress = Functions.SetFloatProperty;
        return invokePZ(props, name, value, __functionAddress);
    }

    /** {@code bool SDL_SetFloatProperty(SDL_PropertiesID props, char const * name, float value)} */
    @NativeType("bool")
    public static boolean SDL_SetFloatProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, float value) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_SetFloatProperty(props, memAddress(name), value);
    }

    /** {@code bool SDL_SetFloatProperty(SDL_PropertiesID props, char const * name, float value)} */
    @NativeType("bool")
    public static boolean SDL_SetFloatProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, float value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_SetFloatProperty(props, nameEncoded, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetBooleanProperty ] ---

    /** {@code bool SDL_SetBooleanProperty(SDL_PropertiesID props, char const * name, bool value)} */
    public static boolean nSDL_SetBooleanProperty(int props, long name, boolean value) {
        long __functionAddress = Functions.SetBooleanProperty;
        return invokePZ(props, name, value, __functionAddress);
    }

    /** {@code bool SDL_SetBooleanProperty(SDL_PropertiesID props, char const * name, bool value)} */
    @NativeType("bool")
    public static boolean SDL_SetBooleanProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("bool") boolean value) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_SetBooleanProperty(props, memAddress(name), value);
    }

    /** {@code bool SDL_SetBooleanProperty(SDL_PropertiesID props, char const * name, bool value)} */
    @NativeType("bool")
    public static boolean SDL_SetBooleanProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("bool") boolean value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_SetBooleanProperty(props, nameEncoded, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_HasProperty ] ---

    /** {@code bool SDL_HasProperty(SDL_PropertiesID props, char const * name)} */
    public static boolean nSDL_HasProperty(int props, long name) {
        long __functionAddress = Functions.HasProperty;
        return invokePZ(props, name, __functionAddress);
    }

    /** {@code bool SDL_HasProperty(SDL_PropertiesID props, char const * name)} */
    @NativeType("bool")
    public static boolean SDL_HasProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_HasProperty(props, memAddress(name));
    }

    /** {@code bool SDL_HasProperty(SDL_PropertiesID props, char const * name)} */
    @NativeType("bool")
    public static boolean SDL_HasProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_HasProperty(props, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetPropertyType ] ---

    /** {@code SDL_PropertyType SDL_GetPropertyType(SDL_PropertiesID props, char const * name)} */
    public static int nSDL_GetPropertyType(int props, long name) {
        long __functionAddress = Functions.GetPropertyType;
        return invokePI(props, name, __functionAddress);
    }

    /** {@code SDL_PropertyType SDL_GetPropertyType(SDL_PropertiesID props, char const * name)} */
    @NativeType("SDL_PropertyType")
    public static int SDL_GetPropertyType(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_GetPropertyType(props, memAddress(name));
    }

    /** {@code SDL_PropertyType SDL_GetPropertyType(SDL_PropertiesID props, char const * name)} */
    @NativeType("SDL_PropertyType")
    public static int SDL_GetPropertyType(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_GetPropertyType(props, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetPointerProperty ] ---

    /** {@code void * SDL_GetPointerProperty(SDL_PropertiesID props, char const * name, void * default_value)} */
    public static long nSDL_GetPointerProperty(int props, long name, long default_value) {
        long __functionAddress = Functions.GetPointerProperty;
        return invokePPP(props, name, default_value, __functionAddress);
    }

    /** {@code void * SDL_GetPointerProperty(SDL_PropertiesID props, char const * name, void * default_value)} */
    @NativeType("void *")
    public static long SDL_GetPointerProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("void *") long default_value) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_GetPointerProperty(props, memAddress(name), default_value);
    }

    /** {@code void * SDL_GetPointerProperty(SDL_PropertiesID props, char const * name, void * default_value)} */
    @NativeType("void *")
    public static long SDL_GetPointerProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("void *") long default_value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_GetPointerProperty(props, nameEncoded, default_value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetStringProperty ] ---

    /** {@code char const * SDL_GetStringProperty(SDL_PropertiesID props, char const * name, char const * default_value)} */
    public static long nSDL_GetStringProperty(int props, long name, long default_value) {
        long __functionAddress = Functions.GetStringProperty;
        return invokePPP(props, name, default_value, __functionAddress);
    }

    /** {@code char const * SDL_GetStringProperty(SDL_PropertiesID props, char const * name, char const * default_value)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetStringProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") @Nullable ByteBuffer default_value) {
        if (CHECKS) {
            checkNT1(name);
            checkNT1Safe(default_value);
        }
        long __result = nSDL_GetStringProperty(props, memAddress(name), memAddressSafe(default_value));
        return memUTF8Safe(__result);
    }

    /** {@code char const * SDL_GetStringProperty(SDL_PropertiesID props, char const * name, char const * default_value)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetStringProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("char const *") @Nullable CharSequence default_value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8Safe(default_value, true);
            long default_valueEncoded = default_value == null ? NULL : stack.getPointerAddress();
            long __result = nSDL_GetStringProperty(props, nameEncoded, default_valueEncoded);
            return memUTF8Safe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetNumberProperty ] ---

    /** {@code Sint64 SDL_GetNumberProperty(SDL_PropertiesID props, char const * name, Sint64 default_value)} */
    public static long nSDL_GetNumberProperty(int props, long name, long default_value) {
        long __functionAddress = Functions.GetNumberProperty;
        return invokePJJ(props, name, default_value, __functionAddress);
    }

    /** {@code Sint64 SDL_GetNumberProperty(SDL_PropertiesID props, char const * name, Sint64 default_value)} */
    @NativeType("Sint64")
    public static long SDL_GetNumberProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("Sint64") long default_value) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_GetNumberProperty(props, memAddress(name), default_value);
    }

    /** {@code Sint64 SDL_GetNumberProperty(SDL_PropertiesID props, char const * name, Sint64 default_value)} */
    @NativeType("Sint64")
    public static long SDL_GetNumberProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("Sint64") long default_value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_GetNumberProperty(props, nameEncoded, default_value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetFloatProperty ] ---

    /** {@code float SDL_GetFloatProperty(SDL_PropertiesID props, char const * name, float default_value)} */
    public static float nSDL_GetFloatProperty(int props, long name, float default_value) {
        long __functionAddress = Functions.GetFloatProperty;
        return invokePF(props, name, default_value, __functionAddress);
    }

    /** {@code float SDL_GetFloatProperty(SDL_PropertiesID props, char const * name, float default_value)} */
    public static float SDL_GetFloatProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, float default_value) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_GetFloatProperty(props, memAddress(name), default_value);
    }

    /** {@code float SDL_GetFloatProperty(SDL_PropertiesID props, char const * name, float default_value)} */
    public static float SDL_GetFloatProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, float default_value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_GetFloatProperty(props, nameEncoded, default_value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetBooleanProperty ] ---

    /** {@code bool SDL_GetBooleanProperty(SDL_PropertiesID props, char const * name, bool default_value)} */
    public static boolean nSDL_GetBooleanProperty(int props, long name, boolean default_value) {
        long __functionAddress = Functions.GetBooleanProperty;
        return invokePZ(props, name, default_value, __functionAddress);
    }

    /** {@code bool SDL_GetBooleanProperty(SDL_PropertiesID props, char const * name, bool default_value)} */
    @NativeType("bool")
    public static boolean SDL_GetBooleanProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name, @NativeType("bool") boolean default_value) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_GetBooleanProperty(props, memAddress(name), default_value);
    }

    /** {@code bool SDL_GetBooleanProperty(SDL_PropertiesID props, char const * name, bool default_value)} */
    @NativeType("bool")
    public static boolean SDL_GetBooleanProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name, @NativeType("bool") boolean default_value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_GetBooleanProperty(props, nameEncoded, default_value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_ClearProperty ] ---

    /** {@code bool SDL_ClearProperty(SDL_PropertiesID props, char const * name)} */
    public static boolean nSDL_ClearProperty(int props, long name) {
        long __functionAddress = Functions.ClearProperty;
        return invokePZ(props, name, __functionAddress);
    }

    /** {@code bool SDL_ClearProperty(SDL_PropertiesID props, char const * name)} */
    @NativeType("bool")
    public static boolean SDL_ClearProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_ClearProperty(props, memAddress(name));
    }

    /** {@code bool SDL_ClearProperty(SDL_PropertiesID props, char const * name)} */
    @NativeType("bool")
    public static boolean SDL_ClearProperty(@NativeType("SDL_PropertiesID") int props, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_ClearProperty(props, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_EnumerateProperties ] ---

    /** {@code bool SDL_EnumerateProperties(SDL_PropertiesID props, SDL_EnumeratePropertiesCallback callback, void * userdata)} */
    public static boolean nSDL_EnumerateProperties(int props, long callback, long userdata) {
        long __functionAddress = Functions.EnumerateProperties;
        return invokePPZ(props, callback, userdata, __functionAddress);
    }

    /** {@code bool SDL_EnumerateProperties(SDL_PropertiesID props, SDL_EnumeratePropertiesCallback callback, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_EnumerateProperties(@NativeType("SDL_PropertiesID") int props, @NativeType("SDL_EnumeratePropertiesCallback") SDL_EnumeratePropertiesCallbackI callback, @NativeType("void *") long userdata) {
        return nSDL_EnumerateProperties(props, callback.address(), userdata);
    }

    // --- [ SDL_DestroyProperties ] ---

    /** {@code void SDL_DestroyProperties(SDL_PropertiesID props)} */
    public static void SDL_DestroyProperties(@NativeType("SDL_PropertiesID") int props) {
        long __functionAddress = Functions.DestroyProperties;
        invokeV(props, __functionAddress);
    }

}