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

public class SDLIOStream {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            IOFromFile       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_IOFromFile"),
            IOFromMem        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_IOFromMem"),
            IOFromConstMem   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_IOFromConstMem"),
            IOFromDynamicMem = apiGetFunctionAddress(SDL.getLibrary(), "SDL_IOFromDynamicMem"),
            OpenIO           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenIO"),
            CloseIO          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CloseIO"),
            GetIOProperties  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetIOProperties"),
            GetIOStatus      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetIOStatus"),
            GetIOSize        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetIOSize"),
            SeekIO           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SeekIO"),
            TellIO           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_TellIO"),
            ReadIO           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadIO"),
            WriteIO          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteIO"),
            IOprintf         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_IOprintf"),
            IOvprintf        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_IOvprintf"),
            FlushIO          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_FlushIO"),
            LoadFile_IO      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_LoadFile_IO"),
            LoadFile         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_LoadFile"),
            SaveFile_IO      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SaveFile_IO"),
            SaveFile         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SaveFile"),
            ReadU8           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadU8"),
            ReadS8           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadS8"),
            ReadU16LE        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadU16LE"),
            ReadS16LE        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadS16LE"),
            ReadU16BE        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadU16BE"),
            ReadS16BE        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadS16BE"),
            ReadU32LE        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadU32LE"),
            ReadS32LE        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadS32LE"),
            ReadU32BE        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadU32BE"),
            ReadS32BE        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadS32BE"),
            ReadU64LE        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadU64LE"),
            ReadS64LE        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadS64LE"),
            ReadU64BE        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadU64BE"),
            ReadS64BE        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadS64BE"),
            WriteU8          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteU8"),
            WriteS8          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteS8"),
            WriteU16LE       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteU16LE"),
            WriteS16LE       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteS16LE"),
            WriteU16BE       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteU16BE"),
            WriteS16BE       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteS16BE"),
            WriteU32LE       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteU32LE"),
            WriteS32LE       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteS32LE"),
            WriteU32BE       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteU32BE"),
            WriteS32BE       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteS32BE"),
            WriteU64LE       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteU64LE"),
            WriteS64LE       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteS64LE"),
            WriteU64BE       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteU64BE"),
            WriteS64BE       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteS64BE");

    }

    public static final int
        SDL_IO_STATUS_READY     = 0,
        SDL_IO_STATUS_ERROR     = 1,
        SDL_IO_STATUS_EOF       = 2,
        SDL_IO_STATUS_NOT_READY = 3,
        SDL_IO_STATUS_READONLY  = 4,
        SDL_IO_STATUS_WRITEONLY = 5;

    public static final int
        SDL_IO_SEEK_SET = 0,
        SDL_IO_SEEK_CUR = 1,
        SDL_IO_SEEK_END = 2;

    public static final String
        SDL_PROP_IOSTREAM_WINDOWS_HANDLE_POINTER = "SDL.iostream.windows.handle",
        SDL_PROP_IOSTREAM_STDIO_FILE_POINTER     = "SDL.iostream.stdio.file",
        SDL_PROP_IOSTREAM_FILE_DESCRIPTOR_NUMBER = "SDL.iostream.file_descriptor",
        SDL_PROP_IOSTREAM_ANDROID_AASSET_POINTER = "SDL.iostream.android.aasset";

    public static final String
        SDL_PROP_IOSTREAM_MEMORY_POINTER     = "SDL.iostream.memory.base",
        SDL_PROP_IOSTREAM_MEMORY_SIZE_NUMBER = "SDL.iostream.memory.size";

    public static final String
        SDL_PROP_IOSTREAM_DYNAMIC_MEMORY_POINTER   = "SDL.iostream.dynamic.memory",
        SDL_PROP_IOSTREAM_DYNAMIC_CHUNKSIZE_NUMBER = "SDL.iostream.dynamic.chunksize";

    protected SDLIOStream() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_IOFromFile ] ---

    /** {@code SDL_IOStream * SDL_IOFromFile(char const * file, char const * mode)} */
    public static long nSDL_IOFromFile(long file, long mode) {
        long __functionAddress = Functions.IOFromFile;
        return invokePPP(file, mode, __functionAddress);
    }

    /** {@code SDL_IOStream * SDL_IOFromFile(char const * file, char const * mode)} */
    @NativeType("SDL_IOStream *")
    public static long SDL_IOFromFile(@NativeType("char const *") ByteBuffer file, @NativeType("char const *") ByteBuffer mode) {
        if (CHECKS) {
            checkNT1(file);
            checkNT1(mode);
        }
        return nSDL_IOFromFile(memAddress(file), memAddress(mode));
    }

    /** {@code SDL_IOStream * SDL_IOFromFile(char const * file, char const * mode)} */
    @NativeType("SDL_IOStream *")
    public static long SDL_IOFromFile(@NativeType("char const *") CharSequence file, @NativeType("char const *") CharSequence mode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            stack.nASCII(mode, true);
            long modeEncoded = stack.getPointerAddress();
            return nSDL_IOFromFile(fileEncoded, modeEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_IOFromMem ] ---

    /** {@code SDL_IOStream * SDL_IOFromMem(void * mem, size_t size)} */
    public static long nSDL_IOFromMem(long mem, long size) {
        long __functionAddress = Functions.IOFromMem;
        return invokePPP(mem, size, __functionAddress);
    }

    /** {@code SDL_IOStream * SDL_IOFromMem(void * mem, size_t size)} */
    @NativeType("SDL_IOStream *")
    public static long SDL_IOFromMem(@NativeType("void *") ByteBuffer mem) {
        return nSDL_IOFromMem(memAddress(mem), mem.remaining());
    }

    // --- [ SDL_IOFromConstMem ] ---

    /** {@code SDL_IOStream * SDL_IOFromConstMem(void const * mem, size_t size)} */
    public static long nSDL_IOFromConstMem(long mem, long size) {
        long __functionAddress = Functions.IOFromConstMem;
        return invokePPP(mem, size, __functionAddress);
    }

    /** {@code SDL_IOStream * SDL_IOFromConstMem(void const * mem, size_t size)} */
    @NativeType("SDL_IOStream *")
    public static long SDL_IOFromConstMem(@NativeType("void const *") ByteBuffer mem) {
        return nSDL_IOFromConstMem(memAddress(mem), mem.remaining());
    }

    // --- [ SDL_IOFromDynamicMem ] ---

    /** {@code SDL_IOStream * SDL_IOFromDynamicMem(void)} */
    @NativeType("SDL_IOStream *")
    public static long SDL_IOFromDynamicMem() {
        long __functionAddress = Functions.IOFromDynamicMem;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_OpenIO ] ---

    /** {@code SDL_IOStream * SDL_OpenIO(SDL_IOStreamInterface const * iface, void * userdata)} */
    public static long nSDL_OpenIO(long iface, long userdata) {
        long __functionAddress = Functions.OpenIO;
        if (CHECKS) {
            SDL_IOStreamInterface.validate(iface);
        }
        return invokePPP(iface, userdata, __functionAddress);
    }

    /** {@code SDL_IOStream * SDL_OpenIO(SDL_IOStreamInterface const * iface, void * userdata)} */
    @NativeType("SDL_IOStream *")
    public static long SDL_OpenIO(@NativeType("SDL_IOStreamInterface const *") SDL_IOStreamInterface iface, @NativeType("void *") long userdata) {
        return nSDL_OpenIO(iface.address(), userdata);
    }

    // --- [ SDL_CloseIO ] ---

    /** {@code bool SDL_CloseIO(SDL_IOStream * context)} */
    @NativeType("bool")
    public static boolean SDL_CloseIO(@NativeType("SDL_IOStream *") long context) {
        long __functionAddress = Functions.CloseIO;
        if (CHECKS) {
            check(context);
        }
        return invokePZ(context, __functionAddress);
    }

    // --- [ SDL_GetIOProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetIOProperties(SDL_IOStream * context)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetIOProperties(@NativeType("SDL_IOStream *") long context) {
        long __functionAddress = Functions.GetIOProperties;
        if (CHECKS) {
            check(context);
        }
        return invokePI(context, __functionAddress);
    }

    // --- [ SDL_GetIOStatus ] ---

    /** {@code SDL_IOStatus SDL_GetIOStatus(SDL_IOStream * context)} */
    @NativeType("SDL_IOStatus")
    public static int SDL_GetIOStatus(@NativeType("SDL_IOStream *") long context) {
        long __functionAddress = Functions.GetIOStatus;
        if (CHECKS) {
            check(context);
        }
        return invokePI(context, __functionAddress);
    }

    // --- [ SDL_GetIOSize ] ---

    /** {@code Sint64 SDL_GetIOSize(SDL_IOStream * context)} */
    @NativeType("Sint64")
    public static long SDL_GetIOSize(@NativeType("SDL_IOStream *") long context) {
        long __functionAddress = Functions.GetIOSize;
        if (CHECKS) {
            check(context);
        }
        return invokePJ(context, __functionAddress);
    }

    // --- [ SDL_SeekIO ] ---

    /** {@code Sint64 SDL_SeekIO(SDL_IOStream * context, Sint64 offset, SDL_IOWhence whence)} */
    @NativeType("Sint64")
    public static long SDL_SeekIO(@NativeType("SDL_IOStream *") long context, @NativeType("Sint64") long offset, @NativeType("SDL_IOWhence") int whence) {
        long __functionAddress = Functions.SeekIO;
        if (CHECKS) {
            check(context);
        }
        return invokePJJ(context, offset, whence, __functionAddress);
    }

    // --- [ SDL_TellIO ] ---

    /** {@code Sint64 SDL_TellIO(SDL_IOStream * context)} */
    @NativeType("Sint64")
    public static long SDL_TellIO(@NativeType("SDL_IOStream *") long context) {
        long __functionAddress = Functions.TellIO;
        if (CHECKS) {
            check(context);
        }
        return invokePJ(context, __functionAddress);
    }

    // --- [ SDL_ReadIO ] ---

    /** {@code size_t SDL_ReadIO(SDL_IOStream * context, void * ptr, size_t size)} */
    public static long nSDL_ReadIO(long context, long ptr, long size) {
        long __functionAddress = Functions.ReadIO;
        if (CHECKS) {
            check(context);
        }
        return invokePPPP(context, ptr, size, __functionAddress);
    }

    /** {@code size_t SDL_ReadIO(SDL_IOStream * context, void * ptr, size_t size)} */
    @NativeType("size_t")
    public static long SDL_ReadIO(@NativeType("SDL_IOStream *") long context, @NativeType("void *") ByteBuffer ptr) {
        return nSDL_ReadIO(context, memAddress(ptr), ptr.remaining());
    }

    // --- [ SDL_WriteIO ] ---

    /** {@code size_t SDL_WriteIO(SDL_IOStream * context, void const * ptr, size_t size)} */
    public static long nSDL_WriteIO(long context, long ptr, long size) {
        long __functionAddress = Functions.WriteIO;
        if (CHECKS) {
            check(context);
        }
        return invokePPPP(context, ptr, size, __functionAddress);
    }

    /** {@code size_t SDL_WriteIO(SDL_IOStream * context, void const * ptr, size_t size)} */
    @NativeType("size_t")
    public static long SDL_WriteIO(@NativeType("SDL_IOStream *") long context, @NativeType("void const *") ByteBuffer ptr) {
        return nSDL_WriteIO(context, memAddress(ptr), ptr.remaining());
    }

    // --- [ SDL_IOprintf ] ---

    /** {@code size_t SDL_IOprintf(SDL_IOStream * context, char const * fmt)} */
    public static long nSDL_IOprintf(long context, long fmt) {
        long __functionAddress = Functions.IOprintf;
        if (CHECKS) {
            check(context);
        }
        return invokePPP(context, fmt, __functionAddress);
    }

    /** {@code size_t SDL_IOprintf(SDL_IOStream * context, char const * fmt)} */
    @NativeType("size_t")
    public static long SDL_IOprintf(@NativeType("SDL_IOStream *") long context, @NativeType("char const *") ByteBuffer fmt) {
        if (CHECKS) {
            checkNT1(fmt);
        }
        return nSDL_IOprintf(context, memAddress(fmt));
    }

    /** {@code size_t SDL_IOprintf(SDL_IOStream * context, char const * fmt)} */
    @NativeType("size_t")
    public static long SDL_IOprintf(@NativeType("SDL_IOStream *") long context, @NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            return nSDL_IOprintf(context, fmtEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_IOvprintf ] ---

    /** {@code size_t SDL_IOvprintf(SDL_IOStream * context, char const * fmt, va_list ap)} */
    public static long nSDL_IOvprintf(long context, long fmt, long ap) {
        long __functionAddress = Functions.IOvprintf;
        if (CHECKS) {
            check(context);
            check(ap);
        }
        return invokePPPP(context, fmt, ap, __functionAddress);
    }

    /** {@code size_t SDL_IOvprintf(SDL_IOStream * context, char const * fmt, va_list ap)} */
    @NativeType("size_t")
    public static long SDL_IOvprintf(@NativeType("SDL_IOStream *") long context, @NativeType("char const *") ByteBuffer fmt, @NativeType("va_list") long ap) {
        if (CHECKS) {
            checkNT1(fmt);
        }
        return nSDL_IOvprintf(context, memAddress(fmt), ap);
    }

    /** {@code size_t SDL_IOvprintf(SDL_IOStream * context, char const * fmt, va_list ap)} */
    @NativeType("size_t")
    public static long SDL_IOvprintf(@NativeType("SDL_IOStream *") long context, @NativeType("char const *") CharSequence fmt, @NativeType("va_list") long ap) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            return nSDL_IOvprintf(context, fmtEncoded, ap);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_FlushIO ] ---

    /** {@code bool SDL_FlushIO(SDL_IOStream * context)} */
    @NativeType("bool")
    public static boolean SDL_FlushIO(@NativeType("SDL_IOStream *") long context) {
        long __functionAddress = Functions.FlushIO;
        if (CHECKS) {
            check(context);
        }
        return invokePZ(context, __functionAddress);
    }

    // --- [ SDL_LoadFile_IO ] ---

    /** {@code void * SDL_LoadFile_IO(SDL_IOStream * src, size_t * datasize, bool closeio)} */
    public static long nSDL_LoadFile_IO(long src, long datasize, boolean closeio) {
        long __functionAddress = Functions.LoadFile_IO;
        if (CHECKS) {
            check(src);
        }
        return invokePPP(src, datasize, closeio, __functionAddress);
    }

    /** {@code void * SDL_LoadFile_IO(SDL_IOStream * src, size_t * datasize, bool closeio)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer SDL_LoadFile_IO(@NativeType("SDL_IOStream *") long src, @NativeType("bool") boolean closeio) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        PointerBuffer datasize = stack.callocPointer(1);
        try {
            long __result = nSDL_LoadFile_IO(src, memAddress(datasize), closeio);
            return memByteBufferSafe(__result, (int)datasize.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_LoadFile ] ---

    /** {@code void * SDL_LoadFile(char const * file, size_t * datasize)} */
    public static long nSDL_LoadFile(long file, long datasize) {
        long __functionAddress = Functions.LoadFile;
        return invokePPP(file, datasize, __functionAddress);
    }

    /** {@code void * SDL_LoadFile(char const * file, size_t * datasize)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer SDL_LoadFile(@NativeType("char const *") ByteBuffer file) {
        if (CHECKS) {
            checkNT1(file);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        PointerBuffer datasize = stack.callocPointer(1);
        try {
            long __result = nSDL_LoadFile(memAddress(file), memAddress(datasize));
            return memByteBufferSafe(__result, (int)datasize.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void * SDL_LoadFile(char const * file, size_t * datasize)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer SDL_LoadFile(@NativeType("char const *") CharSequence file) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer datasize = stack.callocPointer(1);
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            long __result = nSDL_LoadFile(fileEncoded, memAddress(datasize));
            return memByteBufferSafe(__result, (int)datasize.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SaveFile_IO ] ---

    /** {@code bool SDL_SaveFile_IO(SDL_IOStream * src, void const * data, size_t datasize, bool closeio)} */
    public static boolean nSDL_SaveFile_IO(long src, long data, long datasize, boolean closeio) {
        long __functionAddress = Functions.SaveFile_IO;
        if (CHECKS) {
            check(src);
        }
        return invokePPPZ(src, data, datasize, closeio, __functionAddress);
    }

    /** {@code bool SDL_SaveFile_IO(SDL_IOStream * src, void const * data, size_t datasize, bool closeio)} */
    @NativeType("bool")
    public static boolean SDL_SaveFile_IO(@NativeType("SDL_IOStream *") long src, @NativeType("void const *") ByteBuffer data, @NativeType("bool") boolean closeio) {
        return nSDL_SaveFile_IO(src, memAddress(data), data.remaining(), closeio);
    }

    // --- [ SDL_SaveFile ] ---

    /** {@code bool SDL_SaveFile(char const * file, void const * data, size_t datasize)} */
    public static boolean nSDL_SaveFile(long file, long data, long datasize) {
        long __functionAddress = Functions.SaveFile;
        return invokePPPZ(file, data, datasize, __functionAddress);
    }

    /** {@code bool SDL_SaveFile(char const * file, void const * data, size_t datasize)} */
    @NativeType("bool")
    public static boolean SDL_SaveFile(@NativeType("char const *") ByteBuffer file, @NativeType("void const *") ByteBuffer data) {
        if (CHECKS) {
            checkNT1(file);
        }
        return nSDL_SaveFile(memAddress(file), memAddress(data), data.remaining());
    }

    /** {@code bool SDL_SaveFile(char const * file, void const * data, size_t datasize)} */
    @NativeType("bool")
    public static boolean SDL_SaveFile(@NativeType("char const *") CharSequence file, @NativeType("void const *") ByteBuffer data) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            return nSDL_SaveFile(fileEncoded, memAddress(data), data.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_ReadU8 ] ---

    /** {@code bool SDL_ReadU8(SDL_IOStream * src, Uint8 * value)} */
    public static boolean nSDL_ReadU8(long src, long value) {
        long __functionAddress = Functions.ReadU8;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadU8(SDL_IOStream * src, Uint8 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadU8(@NativeType("SDL_IOStream *") long src, @NativeType("Uint8 *") ByteBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadU8(src, memAddress(value));
    }

    // --- [ SDL_ReadS8 ] ---

    /** {@code bool SDL_ReadS8(SDL_IOStream * src, Sint8 * value)} */
    public static boolean nSDL_ReadS8(long src, long value) {
        long __functionAddress = Functions.ReadS8;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadS8(SDL_IOStream * src, Sint8 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadS8(@NativeType("SDL_IOStream *") long src, @NativeType("Sint8 *") ByteBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadS8(src, memAddress(value));
    }

    // --- [ SDL_ReadU16LE ] ---

    /** {@code bool SDL_ReadU16LE(SDL_IOStream * src, Uint16 * value)} */
    public static boolean nSDL_ReadU16LE(long src, long value) {
        long __functionAddress = Functions.ReadU16LE;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadU16LE(SDL_IOStream * src, Uint16 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadU16LE(@NativeType("SDL_IOStream *") long src, @NativeType("Uint16 *") ShortBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadU16LE(src, memAddress(value));
    }

    // --- [ SDL_ReadS16LE ] ---

    /** {@code bool SDL_ReadS16LE(SDL_IOStream * src, Sint16 * value)} */
    public static boolean nSDL_ReadS16LE(long src, long value) {
        long __functionAddress = Functions.ReadS16LE;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadS16LE(SDL_IOStream * src, Sint16 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadS16LE(@NativeType("SDL_IOStream *") long src, @NativeType("Sint16 *") ShortBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadS16LE(src, memAddress(value));
    }

    // --- [ SDL_ReadU16BE ] ---

    /** {@code bool SDL_ReadU16BE(SDL_IOStream * src, Uint16 * value)} */
    public static boolean nSDL_ReadU16BE(long src, long value) {
        long __functionAddress = Functions.ReadU16BE;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadU16BE(SDL_IOStream * src, Uint16 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadU16BE(@NativeType("SDL_IOStream *") long src, @NativeType("Uint16 *") ShortBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadU16BE(src, memAddress(value));
    }

    // --- [ SDL_ReadS16BE ] ---

    /** {@code bool SDL_ReadS16BE(SDL_IOStream * src, Sint16 * value)} */
    public static boolean nSDL_ReadS16BE(long src, long value) {
        long __functionAddress = Functions.ReadS16BE;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadS16BE(SDL_IOStream * src, Sint16 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadS16BE(@NativeType("SDL_IOStream *") long src, @NativeType("Sint16 *") ShortBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadS16BE(src, memAddress(value));
    }

    // --- [ SDL_ReadU32LE ] ---

    /** {@code bool SDL_ReadU32LE(SDL_IOStream * src, Uint32 * value)} */
    public static boolean nSDL_ReadU32LE(long src, long value) {
        long __functionAddress = Functions.ReadU32LE;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadU32LE(SDL_IOStream * src, Uint32 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadU32LE(@NativeType("SDL_IOStream *") long src, @NativeType("Uint32 *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadU32LE(src, memAddress(value));
    }

    // --- [ SDL_ReadS32LE ] ---

    /** {@code bool SDL_ReadS32LE(SDL_IOStream * src, Sint32 * value)} */
    public static boolean nSDL_ReadS32LE(long src, long value) {
        long __functionAddress = Functions.ReadS32LE;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadS32LE(SDL_IOStream * src, Sint32 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadS32LE(@NativeType("SDL_IOStream *") long src, @NativeType("Sint32 *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadS32LE(src, memAddress(value));
    }

    // --- [ SDL_ReadU32BE ] ---

    /** {@code bool SDL_ReadU32BE(SDL_IOStream * src, Uint32 * value)} */
    public static boolean nSDL_ReadU32BE(long src, long value) {
        long __functionAddress = Functions.ReadU32BE;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadU32BE(SDL_IOStream * src, Uint32 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadU32BE(@NativeType("SDL_IOStream *") long src, @NativeType("Uint32 *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadU32BE(src, memAddress(value));
    }

    // --- [ SDL_ReadS32BE ] ---

    /** {@code bool SDL_ReadS32BE(SDL_IOStream * src, Sint32 * value)} */
    public static boolean nSDL_ReadS32BE(long src, long value) {
        long __functionAddress = Functions.ReadS32BE;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadS32BE(SDL_IOStream * src, Sint32 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadS32BE(@NativeType("SDL_IOStream *") long src, @NativeType("Sint32 *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadS32BE(src, memAddress(value));
    }

    // --- [ SDL_ReadU64LE ] ---

    /** {@code bool SDL_ReadU64LE(SDL_IOStream * src, Uint64 * value)} */
    public static boolean nSDL_ReadU64LE(long src, long value) {
        long __functionAddress = Functions.ReadU64LE;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadU64LE(SDL_IOStream * src, Uint64 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadU64LE(@NativeType("SDL_IOStream *") long src, @NativeType("Uint64 *") LongBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadU64LE(src, memAddress(value));
    }

    // --- [ SDL_ReadS64LE ] ---

    /** {@code bool SDL_ReadS64LE(SDL_IOStream * src, Sint64 * value)} */
    public static boolean nSDL_ReadS64LE(long src, long value) {
        long __functionAddress = Functions.ReadS64LE;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadS64LE(SDL_IOStream * src, Sint64 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadS64LE(@NativeType("SDL_IOStream *") long src, @NativeType("Sint64 *") LongBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadS64LE(src, memAddress(value));
    }

    // --- [ SDL_ReadU64BE ] ---

    /** {@code bool SDL_ReadU64BE(SDL_IOStream * src, Uint64 * value)} */
    public static boolean nSDL_ReadU64BE(long src, long value) {
        long __functionAddress = Functions.ReadU64BE;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadU64BE(SDL_IOStream * src, Uint64 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadU64BE(@NativeType("SDL_IOStream *") long src, @NativeType("Uint64 *") LongBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadU64BE(src, memAddress(value));
    }

    // --- [ SDL_ReadS64BE ] ---

    /** {@code bool SDL_ReadS64BE(SDL_IOStream * src, Sint64 * value)} */
    public static boolean nSDL_ReadS64BE(long src, long value) {
        long __functionAddress = Functions.ReadS64BE;
        if (CHECKS) {
            check(src);
        }
        return invokePPZ(src, value, __functionAddress);
    }

    /** {@code bool SDL_ReadS64BE(SDL_IOStream * src, Sint64 * value)} */
    @NativeType("bool")
    public static boolean SDL_ReadS64BE(@NativeType("SDL_IOStream *") long src, @NativeType("Sint64 *") LongBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nSDL_ReadS64BE(src, memAddress(value));
    }

    // --- [ SDL_WriteU8 ] ---

    /** {@code bool SDL_WriteU8(SDL_IOStream * dst, Uint8 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteU8(@NativeType("SDL_IOStream *") long dst, @NativeType("Uint8") byte value) {
        long __functionAddress = Functions.WriteU8;
        if (CHECKS) {
            check(dst);
        }
        return invokePUZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteS8 ] ---

    /** {@code bool SDL_WriteS8(SDL_IOStream * dst, Sint8 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteS8(@NativeType("SDL_IOStream *") long dst, @NativeType("Sint8") byte value) {
        long __functionAddress = Functions.WriteS8;
        if (CHECKS) {
            check(dst);
        }
        return invokePBZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteU16LE ] ---

    /** {@code bool SDL_WriteU16LE(SDL_IOStream * dst, Uint16 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteU16LE(@NativeType("SDL_IOStream *") long dst, @NativeType("Uint16") short value) {
        long __functionAddress = Functions.WriteU16LE;
        if (CHECKS) {
            check(dst);
        }
        return invokePCZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteS16LE ] ---

    /** {@code bool SDL_WriteS16LE(SDL_IOStream * dst, Sint16 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteS16LE(@NativeType("SDL_IOStream *") long dst, @NativeType("Sint16") short value) {
        long __functionAddress = Functions.WriteS16LE;
        if (CHECKS) {
            check(dst);
        }
        return invokePSZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteU16BE ] ---

    /** {@code bool SDL_WriteU16BE(SDL_IOStream * dst, Uint16 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteU16BE(@NativeType("SDL_IOStream *") long dst, @NativeType("Uint16") short value) {
        long __functionAddress = Functions.WriteU16BE;
        if (CHECKS) {
            check(dst);
        }
        return invokePCZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteS16BE ] ---

    /** {@code bool SDL_WriteS16BE(SDL_IOStream * dst, Sint16 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteS16BE(@NativeType("SDL_IOStream *") long dst, @NativeType("Sint16") short value) {
        long __functionAddress = Functions.WriteS16BE;
        if (CHECKS) {
            check(dst);
        }
        return invokePSZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteU32LE ] ---

    /** {@code bool SDL_WriteU32LE(SDL_IOStream * dst, Uint32 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteU32LE(@NativeType("SDL_IOStream *") long dst, @NativeType("Uint32") int value) {
        long __functionAddress = Functions.WriteU32LE;
        if (CHECKS) {
            check(dst);
        }
        return invokePZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteS32LE ] ---

    /** {@code bool SDL_WriteS32LE(SDL_IOStream * dst, Sint32 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteS32LE(@NativeType("SDL_IOStream *") long dst, @NativeType("Sint32") int value) {
        long __functionAddress = Functions.WriteS32LE;
        if (CHECKS) {
            check(dst);
        }
        return invokePZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteU32BE ] ---

    /** {@code bool SDL_WriteU32BE(SDL_IOStream * dst, Uint32 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteU32BE(@NativeType("SDL_IOStream *") long dst, @NativeType("Uint32") int value) {
        long __functionAddress = Functions.WriteU32BE;
        if (CHECKS) {
            check(dst);
        }
        return invokePZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteS32BE ] ---

    /** {@code bool SDL_WriteS32BE(SDL_IOStream * dst, Sint32 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteS32BE(@NativeType("SDL_IOStream *") long dst, @NativeType("Sint32") int value) {
        long __functionAddress = Functions.WriteS32BE;
        if (CHECKS) {
            check(dst);
        }
        return invokePZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteU64LE ] ---

    /** {@code bool SDL_WriteU64LE(SDL_IOStream * dst, Uint64 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteU64LE(@NativeType("SDL_IOStream *") long dst, @NativeType("Uint64") long value) {
        long __functionAddress = Functions.WriteU64LE;
        if (CHECKS) {
            check(dst);
        }
        return invokePJZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteS64LE ] ---

    /** {@code bool SDL_WriteS64LE(SDL_IOStream * dst, Sint64 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteS64LE(@NativeType("SDL_IOStream *") long dst, @NativeType("Sint64") long value) {
        long __functionAddress = Functions.WriteS64LE;
        if (CHECKS) {
            check(dst);
        }
        return invokePJZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteU64BE ] ---

    /** {@code bool SDL_WriteU64BE(SDL_IOStream * dst, Uint64 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteU64BE(@NativeType("SDL_IOStream *") long dst, @NativeType("Uint64") long value) {
        long __functionAddress = Functions.WriteU64BE;
        if (CHECKS) {
            check(dst);
        }
        return invokePJZ(dst, value, __functionAddress);
    }

    // --- [ SDL_WriteS64BE ] ---

    /** {@code bool SDL_WriteS64BE(SDL_IOStream * dst, Sint64 value)} */
    @NativeType("bool")
    public static boolean SDL_WriteS64BE(@NativeType("SDL_IOStream *") long dst, @NativeType("Sint64") long value) {
        long __functionAddress = Functions.WriteS64BE;
        if (CHECKS) {
            check(dst);
        }
        return invokePJZ(dst, value, __functionAddress);
    }

    /** {@code void SDL_INIT_INTERFACE(SDL_IOStreamInterface * iface)} */
    public static void SDL_INIT_INTERFACE(SDL_IOStreamInterface iface) {
        iface.clear();
        iface.version(SDL_IOStreamInterface.SIZEOF);
    }

}