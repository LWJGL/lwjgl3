/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.dyncall

import org.lwjgl.generator.*

fun config() {
    packageInfo(
        Module.CORE_DYNCALL,
        """
        Contains bindings to the ${url("http://www.dyncall.org/", "dyncall")} library.

        The dyncall library encapsulates architecture-, OS- and compiler-specific function call semantics in a virtual bind argument parameters from left to
        right and then call interface allowing programmers to call C functions in a completely dynamic manner. In other words, instead of calling a function
        directly, the dyncall library provides a mechanism to push the function parameters manually and to issue the call afterwards.

        This means, that a program can determine at runtime what function to call, and what parameters to pass to it. The library is written in C and assembly
        and provides a very simple C interface to program against.

        The library comes in very handy to power flexible message systems, dynamic function call dispatch mechanisms, closure implementations, to bridge
        different programming languages, or to simply wrap a "vararg" function.

        When it comes to language bindings, the dyncall library provides a clean and portable C interface to dynamically issue calls to foreign code using
        small call kernels written in assembly. Instead of providing code for every bridged function call, which unnecessarily results in code bloat, only a
        couple of instructions are used to invoke every possible call.
        """
    )
}

val DCCallVM = "DCCallVM".opaque
val DCstruct = "DCstruct".opaque

val DCvoid = "DCvoid".void

val DCbool = typedef(intb, "DCbool")
val DCchar = typedef(char, "DCchar")
val DCuchar = typedef(unsigned_char, "DCuchar")
val DCshort = typedef(short, "DCshort")
val DCushort = typedef(unsigned_short, "DCushort")
val DCint = typedef(int, "DCint")
val DCuint = typedef(unsigned_int, "DCuint")
val DClong = IntegerType("DClong", PrimitiveMapping.INT)
val DCulong = IntegerType("DCulong", PrimitiveMapping.INT, unsigned = true)
val DClonglong = IntegerType("DClonglong", PrimitiveMapping.LONG)
val DCulonglong = IntegerType("DCulonglong", PrimitiveMapping.LONG, unsigned = true)
val DCfloat = typedef(float, "DCfloat")
val DCdouble = typedef(double, "DCdouble")
val DCpointer = typedef(opaque_p, "DCpointer")
val DCstring = typedef(char.const.p, "DCstring")

val DCsize = typedef(size_t, "DCsize")

// dyncall_callback.h

val DCCallback = "DCCallback".opaque
val DCCallbackHandler = "DCCallbackHandler".opaque
val DCArgs = "DCArgs".opaque

// dynload.h

val DLLib = "DLLib".opaque
val DLSyms = "DLSyms".opaque