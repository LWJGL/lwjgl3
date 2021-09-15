/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package remotery

import org.lwjgl.generator.*

fun NativeClass.remoteryIncludes(type: String) {
    nativeDirective(
        """DISABLE_WARNINGS()
#define RMT_USE_OPENGL 1
#define RMT_ASSUME_LITTLE_ENDIAN 1
#ifdef LWJGL_LINUX
    #define RMT_USE_POSIX_THREADNAMES 1
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
val rmtBool = PrimitiveType("rmtBool", PrimitiveMapping.BOOLEAN4)

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
val rmtPStr = typedef(charASCII.const.p, "rmtPStr")

// Handle to the main remotery instance
val Remotery = "Remotery".opaque

val rmtError = "rmtError".enumType

// Callback function pointer types
val rmtMallocPtr = Module.REMOTERY.callback {
    opaque_p(
        "RMTMalloc", "",

        opaque_p("mm_context", ""),
        rmtU32("size", ""),

        nativeType = "rmtMallocPtr"
    )
}

val rmtReallocPtr = Module.REMOTERY.callback {
    opaque_p(
        "RMTRealloc", "",

        opaque_p("mm_context", ""),
        void.p("ptr", ""),
        rmtU32("size", ""),

        nativeType = "rmtReallocPtr"
    )
}

val rmtFreePtr = Module.REMOTERY.callback {
    opaque_p(
        "RMTFree", "",

        opaque_p("mm_context", ""),
        void.p("ptr", ""),

        nativeType = "rmtFreePtr"
    )
}

val rmtInputHandlerPtr = Module.REMOTERY.callback {
    opaque_p(
        "RMTInputHandler", "",

        charASCII.const.p("text", ""),
        opaque_p("context", ""),

        nativeType = "rmtInputHandlerPtr"
    )
}

val rmtSettings = struct(Module.REMOTERY, "RMTSettings", nativeName = "rmtSettings", skipBuffer = true) {
    documentation = "Structure to fill in to modify Remotery default settings."

    rmtU16("port", "which port to listen for incoming connections on")
	rmtBool(
        "reuse_open_port",
        """
        when this server exits it can leave the port open in {@code TIME_WAIT} state for a while. This forces subsequent server bind attempts to fail when
        restarting. If you find restarts fail repeatedly with bind attempts, set this to true to forcibly reuse the open port.
        """
    )
    rmtBool(
        "limit_connections_to_localhost",
        """
        Only allow connections on localhost?

        For dev builds you may want to access your game from other devices but if you distribute a game to your players with Remotery active, probably best to
        limit connections to localhost.
        """
    )
    rmtBool(
        "enableThreadSampler",
        """
        Whether to enable runtime thread sampling that discovers which processors a thread is running on.
        
        This will suspend and resume threads from outside repeatdly and inject code into each thread that automatically instruments the processor.
        
        Default: Enabled 
        """
    )
    rmtU32("msSleepBetweenServerUpdates", "how long to sleep between server updates, hopefully trying to give a little CPU back to other threads")
    rmtU32("messageQueueSizeInBytes", "size of the internal message queues Remotery uses. Will be rounded to page granularity of 64k.")
    rmtU32(
        "maxNbMessagesPerUpdate",
        """
        if the user continuously pushes to the message queue, the server network code won't get a chance to update unless there's an upper-limit on how many
        messages can be consumed per loop
        """
    )

    rmtMallocPtr("_malloc", "callback pointer for memory allocation")
    rmtReallocPtr("realloc", "callback pointer for memory allocation")
    rmtFreePtr("_free", "callback pointer for memory allocation")
    opaque_p("mm_context", "memory allocation context pointer")

    rmtInputHandlerPtr("input_handler", "callback pointer for receiving input from the Remotery console")
    opaque_p("input_handler_context", "context pointer that gets sent to Remotery console callback function")

    rmtPStr("logPath", "")
}

val id = "id".handle