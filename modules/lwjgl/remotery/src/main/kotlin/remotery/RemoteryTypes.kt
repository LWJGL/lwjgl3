/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package remotery

import org.lwjgl.generator.*

const val REMOTERY_LIBRARY = "LibRemotery.initialize();"

fun config() {
    packageInfo(
        Module.REMOTERY,
        """
        Contains bindings to ${url("https://github.com/Celtoys/Remotery", "Remotery")}, a realtime CPU/GPU profiler hosted in a single C file with a viewer
        that runs in a web browser.
        """
    )

    Generator.registerLibraryInit(Module.REMOTERY, "LibRemotery", "remotery")
}

fun NativeClass.remoteryIncludes(type: String) {
    nativeDirective(
        """DISABLE_WARNINGS()
#define RMT_USE_OPENGL 1
#define RMT_ASSUME_LITTLE_ENDIAN 1
#ifdef LWJGL_LINUX
    #define RMT_USE_POSIX_THREADNAMES 1${if (type == "h") "" else """
    #pragma GCC diagnostic ignored "-Wunused-parameter"
    #pragma GCC diagnostic ignored "-Wunused-but-set-variable"
    #pragma GCC diagnostic ignored "-Wunused-function"
    #pragma GCC diagnostic ignored "-Wpedantic""""}
#elif LWJGL_MACOS
    #define RMT_USE_METAL 1
#endif
#include "Remotery.$type"${if (type == "h") "" else """
#ifdef LWJGL_MACOS
    #include "RemoteryMetal.mm"
#endif"""}
ENABLE_WARNINGS()""")
}

// Boolean
val rmtBool = typedef(unsigned_int, "rmtBool")

// Unsigned integer types
val rmtU8 = typedef(uint8_t, "rmtU8")
val rmtU16 = typedef(uint16_t, "rmtU16")
val rmtU32 = typedef(uint32_t, "rmtU32")
val rmtU64 = typedef(uint64_t, "rmtU64")

// Signed integer types
val rmtS8 = typedef(int8_t, "rmtS8")
val rmtS16 = typedef(int16_t, "rmtS16")
val rmtS32 = typedef(int32_t, "rmtS32")
val rmtS64 = typedef(int64_t, "rmtS64")

// Const, null-terminated string pointer
val rmtPStr = typedef(charASCII.p, "rmtPStr")

// Handle to the main remotery instance
const val Remotery = "Remotery"

val rmtError = "rmtError".enumType

// Callback function pointer types
val rmtMallocPtr = "rmtMallocPtr".callback(
    Module.REMOTERY, opaque_p, "RMTMalloc", "",

    opaque_p.IN("mm_context", ""),
    rmtU32.IN("size", "")
)

val rmtReallocPtr = "rmtReallocPtr".callback(
    Module.REMOTERY, opaque_p, "RMTRealloc", "",

    opaque_p.IN("mm_context", ""),
    void.p.IN("ptr", ""),
    rmtU32.IN("size", "")
)

val rmtFreePtr = "rmtFreePtr".callback(
    Module.REMOTERY, opaque_p, "RMTFree", "",

    opaque_p.IN("mm_context", ""),
    void.p.IN("ptr", "")
)

val rmtInputHandlerPtr = "rmtInputHandlerPtr".callback(
    Module.REMOTERY, opaque_p, "RMTInputHandler", "",

    charASCII.const.p.IN("text", ""),
    opaque_p.IN("context", "")
)

val rmtSettings = struct(Module.REMOTERY, "RMTSettings", nativeName = "rmtSettings") {
    documentation = "Structure to fill in to modify Remotery default settings."

    rmtU16.member("port", "which port to listen for incoming connections on")
    rmtBool.member(
        "limit_connections_to_localhost",
        """
        Only allow connections on localhost?

        For dev builds you may want to access your game from other devices but if you distribute a game to your players with Remotery active, probably best to
        limit connections to localhost.
        """
    )
    rmtU32.member("msSleepBetweenServerUpdates", "how long to sleep between server updates, hopefully trying to give a little CPU back to other threads")
    rmtU32.member("messageQueueSizeInBytes", "size of the internal message queues Remotery uses. Will be rounded to page granularity of 64k.")
    rmtU32.member(
        "maxNbMessagesPerUpdate",
        """
        if the user continuously pushes to the message queue, the server network code won't get a chance to update unless there's an upper-limit on how many
        messages can be consumed per loop
        """
    )

    rmtMallocPtr.member("_malloc", "callback pointer for memory allocation")
    rmtReallocPtr.member("realloc", "callback pointer for memory allocation")
    rmtFreePtr.member("_free", "callback pointer for memory allocation")
    opaque_p.member("mm_context", "memory allocation context pointer")

    rmtInputHandlerPtr.member("input_handler", "callback pointer for receiving input from the Remotery console")
    opaque_p.member("input_handler_context", "context pointer that gets sent to Remotery console callback function")

    rmtPStr.member("logFilename", "")
}

val id = "id".handle