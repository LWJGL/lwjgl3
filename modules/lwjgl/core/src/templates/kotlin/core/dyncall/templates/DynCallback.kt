/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.dyncall.templates

import org.lwjgl.generator.*
import core.dyncall.*

val DynCallback = "DynCallback".nativeClass(Module.CORE_DYNCALL, prefix = "DCB") {
    nativeImport(
        "dyncall_callback.h"
    )

    documentation =
        """
        Native bindings to \"dyncall_callback.h\".

        The dyncallback dyncall library has an interface to create callback  objects, that can be passed to functions as callback arguments. In other words, a
        pointer to the callback object can be "called", directly. The callback handler then allows iterating dynamically over the arguments once called back.
        """

    CharConstant(
        "Callback signatures.",

        "SIGCHAR_CC_PREFIX"..'_',
        "SIGCHAR_CC_ELLIPSIS"..'e',
        "SIGCHAR_CC_STDCALL"..'s',
        "SIGCHAR_CC_FASTCALL_GNU"..'f',
        "SIGCHAR_CC_FASTCALL_MS"..'F',
        "SIGCHAR_CC_THISCALL_MS"..'+'
    )

    DCCallback.p(
        "NewCallback",
        """
        Creates and initializes a new {@code Callback} object.

        Use #FreeCallback() to destroy the {@code Callback} object.
        """,

        charASCII.const.p("signature", "the function signature of the function to mimic"),
        DCCallbackHandler.p("funcptr", "a pointer to a callback handler"),
        opaque_p("userdata", "a pointer to custom data that might be useful in the handler")
    )

    void(
        "InitCallback",
        "(Re)initializes a callback object.",

        DCCallback.p("pcb", "the callback object"),
        charASCII.const.p("signature", "the function signature of the function to mimic"),
        DCCallbackHandler.p("handler", "a pointer to a callback handler"),
        opaque_p("userdata", "a pointer to custom data that might be useful in the handler")
    )

    void(
        "FreeCallback",
        "Destroys and frees the callback object.",

        DCCallback.p("pcb", "the callback object")
    )

    opaque_p(
        "GetUserData",
        "Returns a pointer to the {@code userdata} passed to the callback object on creation or initialization.",

        DCCallback.p("pcb", "the callback object")
    )

    val args = DCArgs.p("args", "the function arguments")

    DCbool("ArgBool", "Returns the next {@code bool} argument.", args)
    DCchar("ArgChar", "Returns the next {@code char} argument.", args)
    DCshort("ArgShort", "Returns the next {@code short} argument.", args)
    DCint("ArgInt", "Returns the next {@code int} argument.", args)
    DClong("ArgLong", "Returns the next {@code long} argument.", args)
    DClonglong("ArgLongLong", "Returns the next {@code long long} argument.", args)
    DCchar("ArgUChar", "Returns the next {@code unsigned char} argument.", args)
    DCshort("ArgUShort", "Returns the next {@code unsigned short} argument.", args)
    DCint("ArgUInt", "Returns the next {@code unsigned int} argument.", args)
    DClong("ArgULong", "Returns the next {@code unsigned long} argument.", args)
    DClonglong("ArgULongLong", "Returns the next {@code unsigned long long} argument.", args)
    DCfloat("ArgFloat", "Returns the next {@code float} argument.", args)
    DCdouble("ArgDouble", "Returns the next {@code double} argument.", args)
    DCpointer("ArgPointer", "Returns the next {@code pointer} argument.", args)

}