/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_iostream() = SDL.apply {
    StringConstant("PROP_IOSTREAM_WINDOWS_HANDLE_POINTER".."SDL.iostream.windows.handle")
    StringConstant("PROP_IOSTREAM_STDIO_FILE_POINTER".."SDL.iostream.stdio.file")
    StringConstant("PROP_IOSTREAM_FILE_DESCRIPTOR_NUMBER".."SDL.iostream.file_descriptor")
    StringConstant("PROP_IOSTREAM_ANDROID_AASSET_POINTER".."SDL.iostream.android.aasset")
    StringConstant("PROP_IOSTREAM_MEMORY_POINTER".."SDL.iostream.memory.base")
    StringConstant("PROP_IOSTREAM_MEMORY_SIZE_NUMBER".."SDL.iostream.memory.size")
    StringConstant("PROP_IOSTREAM_DYNAMIC_MEMORY_POINTER".."SDL.iostream.dynamic.memory")
    StringConstant("PROP_IOSTREAM_DYNAMIC_CHUNKSIZE_NUMBER".."SDL.iostream.dynamic.chunksize")

    EnumConstant(
        "IO_STATUS_READY".enum(0),
        "IO_STATUS_ERROR".enum,
        "IO_STATUS_EOF".enum,
        "IO_STATUS_NOT_READY".enum,
        "IO_STATUS_READONLY".enum,
        "IO_STATUS_WRITEONLY".enum
    )

    EnumConstant(
        "IO_SEEK_SET".enum(0),
        "IO_SEEK_CUR".enum,
        "IO_SEEK_END".enum
    )

    SDL_IOStream.p(
        "IOFromFile",

        charUTF8.const.p("file"),
        charASCII.const.p("mode")
    )

    SDL_IOStream.p(
        "IOFromMem",

        void.p("mem"),
        AutoSize("mem")..size_t("size")
    )

    SDL_IOStream.p(
        "IOFromConstMem",

        void.const.p("mem"),
        AutoSize("mem")..size_t("size")
    )

    SDL_IOStream.p(
        "IOFromDynamicMem",

        void()
    )

    SDL_IOStream.p(
        "OpenIO",

        SDL_IOStreamInterface.const.p("iface"),
        nullable..opaque_p("userdata")
    )

    _Bool(
        "CloseIO",

        SDL_IOStream.p("context")
    )

    SDL_PropertiesID(
        "GetIOProperties",

        SDL_IOStream.p("context")
    )

    SDL_IOStatus(
        "GetIOStatus",

        SDL_IOStream.p("context")
    )

    Sint64(
        "GetIOSize",

        SDL_IOStream.p("context")
    )

    Sint64(
        "SeekIO",

        SDL_IOStream.p("context"),
        Sint64("offset"),
        SDL_IOWhence("whence")
    )

    Sint64(
        "TellIO",

        SDL_IOStream.p("context")
    )

    size_t(
        "ReadIO",

        SDL_IOStream.p("context"),
        void.p("ptr"),
        AutoSize("ptr")..size_t("size")
    )

    size_t(
        "WriteIO",

        SDL_IOStream.p("context"),
        void.const.p("ptr"),
        AutoSize("ptr")..size_t("size")
    )

    size_t(
        "IOprintf",

        SDL_IOStream.p("context"),
        charUTF8.const.p("fmt")
    )

    size_t(
        "IOvprintf",

        SDL_IOStream.p("context"),
        charUTF8.const.p("fmt"),
        va_list("ap")
    )

    _Bool(
        "FlushIO",

        SDL_IOStream.p("context")
    )

    void.p(
        "LoadFile_IO",

        SDL_IOStream.p("src"),
        AutoSizeResult..size_t.p("datasize"),
        _Bool("closeio")
    )

    void.p(
        "LoadFile",

        charUTF8.const.p("file"),
        AutoSizeResult..size_t.p("datasize")
    )

    _Bool(
        "SaveFile_IO",

        SDL_IOStream.p("src"),
        void.const.p("data"),
        AutoSize("data")..size_t("datasize"),
        _Bool("closeio")
    )

    _Bool(
        "SaveFile",

        charUTF8.const.p("file"),
        void.const.p("data"),
        AutoSize("data")..size_t("datasize")
    )

    _Bool(
        "ReadU8",

        SDL_IOStream.p("src"),
        Check(1)..Uint8.p("value")
    )

    _Bool(
        "ReadS8",

        SDL_IOStream.p("src"),
        Check(1)..Sint8.p("value")
    )

    _Bool(
        "ReadU16LE",

        SDL_IOStream.p("src"),
        Check(1)..Uint16.p("value")
    )

    _Bool(
        "ReadS16LE",

        SDL_IOStream.p("src"),
        Check(1)..Sint16.p("value")
    )

    _Bool(
        "ReadU16BE",

        SDL_IOStream.p("src"),
        Check(1)..Uint16.p("value")
    )

    _Bool(
        "ReadS16BE",

        SDL_IOStream.p("src"),
        Check(1)..Sint16.p("value")
    )

    _Bool(
        "ReadU32LE",

        SDL_IOStream.p("src"),
        Check(1)..Uint32.p("value")
    )

    _Bool(
        "ReadS32LE",

        SDL_IOStream.p("src"),
        Check(1)..Sint32.p("value")
    )

    _Bool(
        "ReadU32BE",

        SDL_IOStream.p("src"),
        Check(1)..Uint32.p("value")
    )

    _Bool(
        "ReadS32BE",

        SDL_IOStream.p("src"),
        Check(1)..Sint32.p("value")
    )

    _Bool(
        "ReadU64LE",

        SDL_IOStream.p("src"),
        Check(1)..Uint64.p("value")
    )

    _Bool(
        "ReadS64LE",

        SDL_IOStream.p("src"),
        Check(1)..Sint64.p("value")
    )

    _Bool(
        "ReadU64BE",

        SDL_IOStream.p("src"),
        Check(1)..Uint64.p("value")
    )

    _Bool(
        "ReadS64BE",

        SDL_IOStream.p("src"),
        Check(1)..Sint64.p("value")
    )

    _Bool(
        "WriteU8",

        SDL_IOStream.p("dst"),
        Uint8("value")
    )

    _Bool(
        "WriteS8",

        SDL_IOStream.p("dst"),
        Sint8("value")
    )

    _Bool(
        "WriteU16LE",

        SDL_IOStream.p("dst"),
        Uint16("value")
    )

    _Bool(
        "WriteS16LE",

        SDL_IOStream.p("dst"),
        Sint16("value")
    )

    _Bool(
        "WriteU16BE",

        SDL_IOStream.p("dst"),
        Uint16("value")
    )

    _Bool(
        "WriteS16BE",

        SDL_IOStream.p("dst"),
        Sint16("value")
    )

    _Bool(
        "WriteU32LE",

        SDL_IOStream.p("dst"),
        Uint32("value")
    )

    _Bool(
        "WriteS32LE",

        SDL_IOStream.p("dst"),
        Sint32("value")
    )

    _Bool(
        "WriteU32BE",

        SDL_IOStream.p("dst"),
        Uint32("value")
    )

    _Bool(
        "WriteS32BE",

        SDL_IOStream.p("dst"),
        Sint32("value")
    )

    _Bool(
        "WriteU64LE",

        SDL_IOStream.p("dst"),
        Uint64("value")
    )

    _Bool(
        "WriteS64LE",

        SDL_IOStream.p("dst"),
        Sint64("value")
    )

    _Bool(
        "WriteU64BE",

        SDL_IOStream.p("dst"),
        Uint64("value")
    )

    _Bool(
        "WriteS64BE",

        SDL_IOStream.p("dst"),
        Sint64("value")
    )

}
