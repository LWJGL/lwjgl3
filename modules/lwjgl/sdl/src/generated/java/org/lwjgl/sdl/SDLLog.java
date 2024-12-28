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

public class SDLLog {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            SetLogPriorities            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetLogPriorities"),
            SetLogPriority              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetLogPriority"),
            GetLogPriority              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetLogPriority"),
            ResetLogPriorities          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ResetLogPriorities"),
            SetLogPriorityPrefix        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetLogPriorityPrefix"),
            Log                         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_Log"),
            LogTrace                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_LogTrace"),
            LogVerbose                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_LogVerbose"),
            LogDebug                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_LogDebug"),
            LogInfo                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_LogInfo"),
            LogWarn                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_LogWarn"),
            LogError                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_LogError"),
            LogCritical                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_LogCritical"),
            LogMessage                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_LogMessage"),
            LogMessageV                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_LogMessageV"),
            GetDefaultLogOutputFunction = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDefaultLogOutputFunction"),
            GetLogOutputFunction        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetLogOutputFunction"),
            SetLogOutputFunction        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetLogOutputFunction");

    }

    public static final int
        SDL_LOG_CATEGORY_APPLICATION = 0,
        SDL_LOG_CATEGORY_ERROR       = 1,
        SDL_LOG_CATEGORY_ASSERT      = 2,
        SDL_LOG_CATEGORY_SYSTEM      = 3,
        SDL_LOG_CATEGORY_AUDIO       = 4,
        SDL_LOG_CATEGORY_VIDEO       = 5,
        SDL_LOG_CATEGORY_RENDER      = 6,
        SDL_LOG_CATEGORY_INPUT       = 7,
        SDL_LOG_CATEGORY_TEST        = 8,
        SDL_LOG_CATEGORY_GPU         = 9,
        SDL_LOG_CATEGORY_RESERVED2   = 10,
        SDL_LOG_CATEGORY_RESERVED3   = 11,
        SDL_LOG_CATEGORY_RESERVED4   = 12,
        SDL_LOG_CATEGORY_RESERVED5   = 13,
        SDL_LOG_CATEGORY_RESERVED6   = 14,
        SDL_LOG_CATEGORY_RESERVED7   = 15,
        SDL_LOG_CATEGORY_RESERVED8   = 16,
        SDL_LOG_CATEGORY_RESERVED9   = 17,
        SDL_LOG_CATEGORY_RESERVED10  = 18,
        SDL_LOG_CATEGORY_CUSTOM      = 19;

    public static final int
        SDL_LOG_PRIORITY_INVALID  = 0,
        SDL_LOG_PRIORITY_TRACE    = 1,
        SDL_LOG_PRIORITY_VERBOSE  = 2,
        SDL_LOG_PRIORITY_DEBUG    = 3,
        SDL_LOG_PRIORITY_INFO     = 4,
        SDL_LOG_PRIORITY_WARN     = 5,
        SDL_LOG_PRIORITY_ERROR    = 6,
        SDL_LOG_PRIORITY_CRITICAL = 7,
        SDL_LOG_PRIORITY_COUNT    = 8;

    protected SDLLog() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_SetLogPriorities ] ---

    /** {@code void SDL_SetLogPriorities(SDL_LogPriority priority)} */
    public static void SDL_SetLogPriorities(@NativeType("SDL_LogPriority") int priority) {
        long __functionAddress = Functions.SetLogPriorities;
        invokeV(priority, __functionAddress);
    }

    // --- [ SDL_SetLogPriority ] ---

    /** {@code void SDL_SetLogPriority(int category, SDL_LogPriority priority)} */
    public static void SDL_SetLogPriority(int category, @NativeType("SDL_LogPriority") int priority) {
        long __functionAddress = Functions.SetLogPriority;
        invokeV(category, priority, __functionAddress);
    }

    // --- [ SDL_GetLogPriority ] ---

    /** {@code SDL_LogPriority SDL_GetLogPriority(int category)} */
    @NativeType("SDL_LogPriority")
    public static int SDL_GetLogPriority(int category) {
        long __functionAddress = Functions.GetLogPriority;
        return invokeI(category, __functionAddress);
    }

    // --- [ SDL_ResetLogPriorities ] ---

    /** {@code void SDL_ResetLogPriorities(void)} */
    public static void SDL_ResetLogPriorities() {
        long __functionAddress = Functions.ResetLogPriorities;
        invokeV(__functionAddress);
    }

    // --- [ SDL_SetLogPriorityPrefix ] ---

    /** {@code bool SDL_SetLogPriorityPrefix(SDL_LogPriority priority, char const * prefix)} */
    public static boolean nSDL_SetLogPriorityPrefix(int priority, long prefix) {
        long __functionAddress = Functions.SetLogPriorityPrefix;
        return invokePZ(priority, prefix, __functionAddress);
    }

    /** {@code bool SDL_SetLogPriorityPrefix(SDL_LogPriority priority, char const * prefix)} */
    @NativeType("bool")
    public static boolean SDL_SetLogPriorityPrefix(@NativeType("SDL_LogPriority") int priority, @NativeType("char const *") @Nullable ByteBuffer prefix) {
        if (CHECKS) {
            checkNT1Safe(prefix);
        }
        return nSDL_SetLogPriorityPrefix(priority, memAddressSafe(prefix));
    }

    /** {@code bool SDL_SetLogPriorityPrefix(SDL_LogPriority priority, char const * prefix)} */
    @NativeType("bool")
    public static boolean SDL_SetLogPriorityPrefix(@NativeType("SDL_LogPriority") int priority, @NativeType("char const *") @Nullable CharSequence prefix) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(prefix, true);
            long prefixEncoded = prefix == null ? NULL : stack.getPointerAddress();
            return nSDL_SetLogPriorityPrefix(priority, prefixEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_Log ] ---

    /** {@code void SDL_Log(char const * fmt)} */
    public static void nSDL_Log(long fmt) {
        long __functionAddress = Functions.Log;
        invokePV(fmt, __functionAddress);
    }

    /** {@code void SDL_Log(char const * fmt)} */
    public static void SDL_Log(@NativeType("char const *") ByteBuffer fmt) {
        if (CHECKS) {
            checkNT1(fmt);
        }
        nSDL_Log(memAddress(fmt));
    }

    /** {@code void SDL_Log(char const * fmt)} */
    public static void SDL_Log(@NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            nSDL_Log(fmtEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_LogTrace ] ---

    /** {@code void SDL_LogTrace(int category, char const * fmt)} */
    public static void nSDL_LogTrace(int category, long fmt) {
        long __functionAddress = Functions.LogTrace;
        invokePV(category, fmt, __functionAddress);
    }

    /** {@code void SDL_LogTrace(int category, char const * fmt)} */
    public static void SDL_LogTrace(int category, @NativeType("char const *") ByteBuffer fmt) {
        if (CHECKS) {
            checkNT1(fmt);
        }
        nSDL_LogTrace(category, memAddress(fmt));
    }

    /** {@code void SDL_LogTrace(int category, char const * fmt)} */
    public static void SDL_LogTrace(int category, @NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            nSDL_LogTrace(category, fmtEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_LogVerbose ] ---

    /** {@code void SDL_LogVerbose(int category, char const * fmt)} */
    public static void nSDL_LogVerbose(int category, long fmt) {
        long __functionAddress = Functions.LogVerbose;
        invokePV(category, fmt, __functionAddress);
    }

    /** {@code void SDL_LogVerbose(int category, char const * fmt)} */
    public static void SDL_LogVerbose(int category, @NativeType("char const *") ByteBuffer fmt) {
        if (CHECKS) {
            checkNT1(fmt);
        }
        nSDL_LogVerbose(category, memAddress(fmt));
    }

    /** {@code void SDL_LogVerbose(int category, char const * fmt)} */
    public static void SDL_LogVerbose(int category, @NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            nSDL_LogVerbose(category, fmtEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_LogDebug ] ---

    /** {@code void SDL_LogDebug(int category, char const * fmt)} */
    public static void nSDL_LogDebug(int category, long fmt) {
        long __functionAddress = Functions.LogDebug;
        invokePV(category, fmt, __functionAddress);
    }

    /** {@code void SDL_LogDebug(int category, char const * fmt)} */
    public static void SDL_LogDebug(int category, @NativeType("char const *") ByteBuffer fmt) {
        if (CHECKS) {
            checkNT1(fmt);
        }
        nSDL_LogDebug(category, memAddress(fmt));
    }

    /** {@code void SDL_LogDebug(int category, char const * fmt)} */
    public static void SDL_LogDebug(int category, @NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            nSDL_LogDebug(category, fmtEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_LogInfo ] ---

    /** {@code void SDL_LogInfo(int category, char const * fmt)} */
    public static void nSDL_LogInfo(int category, long fmt) {
        long __functionAddress = Functions.LogInfo;
        invokePV(category, fmt, __functionAddress);
    }

    /** {@code void SDL_LogInfo(int category, char const * fmt)} */
    public static void SDL_LogInfo(int category, @NativeType("char const *") ByteBuffer fmt) {
        if (CHECKS) {
            checkNT1(fmt);
        }
        nSDL_LogInfo(category, memAddress(fmt));
    }

    /** {@code void SDL_LogInfo(int category, char const * fmt)} */
    public static void SDL_LogInfo(int category, @NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            nSDL_LogInfo(category, fmtEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_LogWarn ] ---

    /** {@code void SDL_LogWarn(int category, char const * fmt)} */
    public static void nSDL_LogWarn(int category, long fmt) {
        long __functionAddress = Functions.LogWarn;
        invokePV(category, fmt, __functionAddress);
    }

    /** {@code void SDL_LogWarn(int category, char const * fmt)} */
    public static void SDL_LogWarn(int category, @NativeType("char const *") ByteBuffer fmt) {
        if (CHECKS) {
            checkNT1(fmt);
        }
        nSDL_LogWarn(category, memAddress(fmt));
    }

    /** {@code void SDL_LogWarn(int category, char const * fmt)} */
    public static void SDL_LogWarn(int category, @NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            nSDL_LogWarn(category, fmtEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_LogError ] ---

    /** {@code void SDL_LogError(int category, char const * fmt)} */
    public static void nSDL_LogError(int category, long fmt) {
        long __functionAddress = Functions.LogError;
        invokePV(category, fmt, __functionAddress);
    }

    /** {@code void SDL_LogError(int category, char const * fmt)} */
    public static void SDL_LogError(int category, @NativeType("char const *") ByteBuffer fmt) {
        if (CHECKS) {
            checkNT1(fmt);
        }
        nSDL_LogError(category, memAddress(fmt));
    }

    /** {@code void SDL_LogError(int category, char const * fmt)} */
    public static void SDL_LogError(int category, @NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            nSDL_LogError(category, fmtEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_LogCritical ] ---

    /** {@code void SDL_LogCritical(int category, char const * fmt)} */
    public static void nSDL_LogCritical(int category, long fmt) {
        long __functionAddress = Functions.LogCritical;
        invokePV(category, fmt, __functionAddress);
    }

    /** {@code void SDL_LogCritical(int category, char const * fmt)} */
    public static void SDL_LogCritical(int category, @NativeType("char const *") ByteBuffer fmt) {
        if (CHECKS) {
            checkNT1(fmt);
        }
        nSDL_LogCritical(category, memAddress(fmt));
    }

    /** {@code void SDL_LogCritical(int category, char const * fmt)} */
    public static void SDL_LogCritical(int category, @NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            nSDL_LogCritical(category, fmtEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_LogMessage ] ---

    /** {@code void SDL_LogMessage(int category, SDL_LogPriority priority, char const * fmt)} */
    public static void nSDL_LogMessage(int category, int priority, long fmt) {
        long __functionAddress = Functions.LogMessage;
        invokePV(category, priority, fmt, __functionAddress);
    }

    /** {@code void SDL_LogMessage(int category, SDL_LogPriority priority, char const * fmt)} */
    public static void SDL_LogMessage(int category, @NativeType("SDL_LogPriority") int priority, @NativeType("char const *") ByteBuffer fmt) {
        if (CHECKS) {
            checkNT1(fmt);
        }
        nSDL_LogMessage(category, priority, memAddress(fmt));
    }

    /** {@code void SDL_LogMessage(int category, SDL_LogPriority priority, char const * fmt)} */
    public static void SDL_LogMessage(int category, @NativeType("SDL_LogPriority") int priority, @NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            nSDL_LogMessage(category, priority, fmtEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_LogMessageV ] ---

    /** {@code void SDL_LogMessageV(int category, SDL_LogPriority priority, char const * fmt, va_list ap)} */
    public static void nSDL_LogMessageV(int category, int priority, long fmt, long ap) {
        long __functionAddress = Functions.LogMessageV;
        if (CHECKS) {
            check(ap);
        }
        invokePPV(category, priority, fmt, ap, __functionAddress);
    }

    /** {@code void SDL_LogMessageV(int category, SDL_LogPriority priority, char const * fmt, va_list ap)} */
    public static void SDL_LogMessageV(int category, @NativeType("SDL_LogPriority") int priority, @NativeType("char const *") ByteBuffer fmt, @NativeType("va_list") long ap) {
        if (CHECKS) {
            checkNT1(fmt);
        }
        nSDL_LogMessageV(category, priority, memAddress(fmt), ap);
    }

    /** {@code void SDL_LogMessageV(int category, SDL_LogPriority priority, char const * fmt, va_list ap)} */
    public static void SDL_LogMessageV(int category, @NativeType("SDL_LogPriority") int priority, @NativeType("char const *") CharSequence fmt, @NativeType("va_list") long ap) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            nSDL_LogMessageV(category, priority, fmtEncoded, ap);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetDefaultLogOutputFunction ] ---

    /** {@code SDL_LogOutputFunction SDL_GetDefaultLogOutputFunction(void)} */
    public static long nSDL_GetDefaultLogOutputFunction() {
        long __functionAddress = Functions.GetDefaultLogOutputFunction;
        return invokeP(__functionAddress);
    }

    /** {@code SDL_LogOutputFunction SDL_GetDefaultLogOutputFunction(void)} */
    @NativeType("SDL_LogOutputFunction")
    public static @Nullable SDL_LogOutputFunction SDL_GetDefaultLogOutputFunction() {
        return SDL_LogOutputFunction.createSafe(nSDL_GetDefaultLogOutputFunction());
    }

    // --- [ SDL_GetLogOutputFunction ] ---

    /** {@code void SDL_GetLogOutputFunction(SDL_LogOutputFunction * callback, void ** userdata)} */
    public static void nSDL_GetLogOutputFunction(long callback, long userdata) {
        long __functionAddress = Functions.GetLogOutputFunction;
        invokePPV(callback, userdata, __functionAddress);
    }

    /** {@code void SDL_GetLogOutputFunction(SDL_LogOutputFunction * callback, void ** userdata)} */
    public static void SDL_GetLogOutputFunction(@NativeType("SDL_LogOutputFunction *") @Nullable PointerBuffer callback, @NativeType("void **") @Nullable PointerBuffer userdata) {
        if (CHECKS) {
            checkSafe(callback, 1);
            checkSafe(userdata, 1);
        }
        nSDL_GetLogOutputFunction(memAddressSafe(callback), memAddressSafe(userdata));
    }

    // --- [ SDL_SetLogOutputFunction ] ---

    /** {@code void SDL_SetLogOutputFunction(SDL_LogOutputFunction callback, void * userdata)} */
    public static void nSDL_SetLogOutputFunction(long callback, long userdata) {
        long __functionAddress = Functions.SetLogOutputFunction;
        invokePPV(callback, userdata, __functionAddress);
    }

    /** {@code void SDL_SetLogOutputFunction(SDL_LogOutputFunction callback, void * userdata)} */
    public static void SDL_SetLogOutputFunction(@NativeType("SDL_LogOutputFunction") @Nullable SDL_LogOutputFunctionI callback, @NativeType("void *") long userdata) {
        nSDL_SetLogOutputFunction(memAddressSafe(callback), userdata);
    }

}