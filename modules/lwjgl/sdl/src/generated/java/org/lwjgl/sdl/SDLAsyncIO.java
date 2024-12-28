/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SDLAsyncIO {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            AsyncIOFromFile     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_AsyncIOFromFile"),
            GetAsyncIOSize      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAsyncIOSize"),
            ReadAsyncIO         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadAsyncIO"),
            WriteAsyncIO        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteAsyncIO"),
            CloseAsyncIO        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CloseAsyncIO"),
            CreateAsyncIOQueue  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateAsyncIOQueue"),
            DestroyAsyncIOQueue = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyAsyncIOQueue"),
            GetAsyncIOResult    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAsyncIOResult"),
            WaitAsyncIOResult   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WaitAsyncIOResult"),
            SignalAsyncIOQueue  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SignalAsyncIOQueue"),
            LoadFileAsync       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_LoadFileAsync");

    }

    public static final int
        SDL_ASYNCIO_TASK_READ  = 0,
        SDL_ASYNCIO_TASK_WRITE = 1,
        SDL_ASYNCIO_TASK_CLOSE = 2;

    public static final int
        SDL_ASYNCIO_COMPLETE = 0,
        SDL_ASYNCIO_FAILURE  = 1,
        SDL_ASYNCIO_CANCELED = 2;

    protected SDLAsyncIO() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_AsyncIOFromFile ] ---

    /** {@code SDL_AsyncIO * SDL_AsyncIOFromFile(char const * file, char const * mode)} */
    public static long nSDL_AsyncIOFromFile(long file, long mode) {
        long __functionAddress = Functions.AsyncIOFromFile;
        return invokePPP(file, mode, __functionAddress);
    }

    /** {@code SDL_AsyncIO * SDL_AsyncIOFromFile(char const * file, char const * mode)} */
    @NativeType("SDL_AsyncIO *")
    public static long SDL_AsyncIOFromFile(@NativeType("char const *") ByteBuffer file, @NativeType("char const *") ByteBuffer mode) {
        if (CHECKS) {
            checkNT1(file);
            checkNT1(mode);
        }
        return nSDL_AsyncIOFromFile(memAddress(file), memAddress(mode));
    }

    /** {@code SDL_AsyncIO * SDL_AsyncIOFromFile(char const * file, char const * mode)} */
    @NativeType("SDL_AsyncIO *")
    public static long SDL_AsyncIOFromFile(@NativeType("char const *") CharSequence file, @NativeType("char const *") CharSequence mode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            stack.nASCII(mode, true);
            long modeEncoded = stack.getPointerAddress();
            return nSDL_AsyncIOFromFile(fileEncoded, modeEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetAsyncIOSize ] ---

    /** {@code Sint64 SDL_GetAsyncIOSize(SDL_AsyncIO * asyncio)} */
    @NativeType("Sint64")
    public static long SDL_GetAsyncIOSize(@NativeType("SDL_AsyncIO *") long asyncio) {
        long __functionAddress = Functions.GetAsyncIOSize;
        if (CHECKS) {
            check(asyncio);
        }
        return invokePJ(asyncio, __functionAddress);
    }

    // --- [ SDL_ReadAsyncIO ] ---

    /** {@code bool SDL_ReadAsyncIO(SDL_AsyncIO * asyncio, void * ptr, Uint64 offset, Uint64 size, SDL_AsyncIOQueue * queue, void * userdata)} */
    public static boolean nSDL_ReadAsyncIO(long asyncio, long ptr, long offset, long size, long queue, long userdata) {
        long __functionAddress = Functions.ReadAsyncIO;
        if (CHECKS) {
            check(asyncio);
            check(queue);
        }
        return invokePPJJPPZ(asyncio, ptr, offset, size, queue, userdata, __functionAddress);
    }

    /** {@code bool SDL_ReadAsyncIO(SDL_AsyncIO * asyncio, void * ptr, Uint64 offset, Uint64 size, SDL_AsyncIOQueue * queue, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_ReadAsyncIO(@NativeType("SDL_AsyncIO *") long asyncio, @NativeType("void *") ByteBuffer ptr, @NativeType("Uint64") long offset, @NativeType("SDL_AsyncIOQueue *") long queue, @NativeType("void *") long userdata) {
        return nSDL_ReadAsyncIO(asyncio, memAddress(ptr), offset, ptr.remaining(), queue, userdata);
    }

    // --- [ SDL_WriteAsyncIO ] ---

    /** {@code bool SDL_WriteAsyncIO(SDL_AsyncIO * asyncio, void * ptr, Uint64 offset, Uint64 size, SDL_AsyncIOQueue * queue, void * userdata)} */
    public static boolean nSDL_WriteAsyncIO(long asyncio, long ptr, long offset, long size, long queue, long userdata) {
        long __functionAddress = Functions.WriteAsyncIO;
        if (CHECKS) {
            check(asyncio);
            check(queue);
        }
        return invokePPJJPPZ(asyncio, ptr, offset, size, queue, userdata, __functionAddress);
    }

    /** {@code bool SDL_WriteAsyncIO(SDL_AsyncIO * asyncio, void * ptr, Uint64 offset, Uint64 size, SDL_AsyncIOQueue * queue, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_WriteAsyncIO(@NativeType("SDL_AsyncIO *") long asyncio, @NativeType("void *") ByteBuffer ptr, @NativeType("Uint64") long offset, @NativeType("SDL_AsyncIOQueue *") long queue, @NativeType("void *") long userdata) {
        return nSDL_WriteAsyncIO(asyncio, memAddress(ptr), offset, ptr.remaining(), queue, userdata);
    }

    // --- [ SDL_CloseAsyncIO ] ---

    /** {@code bool SDL_CloseAsyncIO(SDL_AsyncIO * asyncio, bool flush, SDL_AsyncIOQueue * queue, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_CloseAsyncIO(@NativeType("SDL_AsyncIO *") long asyncio, @NativeType("bool") boolean flush, @NativeType("SDL_AsyncIOQueue *") long queue, @NativeType("void *") long userdata) {
        long __functionAddress = Functions.CloseAsyncIO;
        if (CHECKS) {
            check(asyncio);
            check(queue);
        }
        return invokePPPZ(asyncio, flush, queue, userdata, __functionAddress);
    }

    // --- [ SDL_CreateAsyncIOQueue ] ---

    /** {@code SDL_AsyncIOQueue * SDL_CreateAsyncIOQueue(void)} */
    @NativeType("SDL_AsyncIOQueue *")
    public static long SDL_CreateAsyncIOQueue() {
        long __functionAddress = Functions.CreateAsyncIOQueue;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_DestroyAsyncIOQueue ] ---

    /** {@code void SDL_DestroyAsyncIOQueue(SDL_AsyncIOQueue * queue)} */
    public static void SDL_DestroyAsyncIOQueue(@NativeType("SDL_AsyncIOQueue *") long queue) {
        long __functionAddress = Functions.DestroyAsyncIOQueue;
        if (CHECKS) {
            check(queue);
        }
        invokePV(queue, __functionAddress);
    }

    // --- [ SDL_GetAsyncIOResult ] ---

    /** {@code bool SDL_GetAsyncIOResult(SDL_AsyncIOQueue * queue, SDL_AsyncIOOutcome * outcome)} */
    public static boolean nSDL_GetAsyncIOResult(long queue, long outcome) {
        long __functionAddress = Functions.GetAsyncIOResult;
        if (CHECKS) {
            check(queue);
        }
        return invokePPZ(queue, outcome, __functionAddress);
    }

    /** {@code bool SDL_GetAsyncIOResult(SDL_AsyncIOQueue * queue, SDL_AsyncIOOutcome * outcome)} */
    @NativeType("bool")
    public static boolean SDL_GetAsyncIOResult(@NativeType("SDL_AsyncIOQueue *") long queue, @NativeType("SDL_AsyncIOOutcome *") SDL_AsyncIOOutcome outcome) {
        return nSDL_GetAsyncIOResult(queue, outcome.address());
    }

    // --- [ SDL_WaitAsyncIOResult ] ---

    /** {@code bool SDL_WaitAsyncIOResult(SDL_AsyncIOQueue * queue, SDL_AsyncIOOutcome * outcome, Sint32 timeoutMS)} */
    public static boolean nSDL_WaitAsyncIOResult(long queue, long outcome, int timeoutMS) {
        long __functionAddress = Functions.WaitAsyncIOResult;
        if (CHECKS) {
            check(queue);
        }
        return invokePPZ(queue, outcome, timeoutMS, __functionAddress);
    }

    /** {@code bool SDL_WaitAsyncIOResult(SDL_AsyncIOQueue * queue, SDL_AsyncIOOutcome * outcome, Sint32 timeoutMS)} */
    @NativeType("bool")
    public static boolean SDL_WaitAsyncIOResult(@NativeType("SDL_AsyncIOQueue *") long queue, @NativeType("SDL_AsyncIOOutcome *") SDL_AsyncIOOutcome outcome, @NativeType("Sint32") int timeoutMS) {
        return nSDL_WaitAsyncIOResult(queue, outcome.address(), timeoutMS);
    }

    // --- [ SDL_SignalAsyncIOQueue ] ---

    /** {@code void SDL_SignalAsyncIOQueue(SDL_AsyncIOQueue * queue)} */
    public static void SDL_SignalAsyncIOQueue(@NativeType("SDL_AsyncIOQueue *") long queue) {
        long __functionAddress = Functions.SignalAsyncIOQueue;
        if (CHECKS) {
            check(queue);
        }
        invokePV(queue, __functionAddress);
    }

    // --- [ SDL_LoadFileAsync ] ---

    /** {@code bool SDL_LoadFileAsync(char const * file, SDL_AsyncIOQueue * queue, void * userdata)} */
    public static boolean nSDL_LoadFileAsync(long file, long queue, long userdata) {
        long __functionAddress = Functions.LoadFileAsync;
        if (CHECKS) {
            check(queue);
        }
        return invokePPPZ(file, queue, userdata, __functionAddress);
    }

    /** {@code bool SDL_LoadFileAsync(char const * file, SDL_AsyncIOQueue * queue, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_LoadFileAsync(@NativeType("char const *") ByteBuffer file, @NativeType("SDL_AsyncIOQueue *") long queue, @NativeType("void *") long userdata) {
        if (CHECKS) {
            checkNT1(file);
        }
        return nSDL_LoadFileAsync(memAddress(file), queue, userdata);
    }

    /** {@code bool SDL_LoadFileAsync(char const * file, SDL_AsyncIOQueue * queue, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_LoadFileAsync(@NativeType("char const *") CharSequence file, @NativeType("SDL_AsyncIOQueue *") long queue, @NativeType("void *") long userdata) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            return nSDL_LoadFileAsync(fileEncoded, queue, userdata);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}