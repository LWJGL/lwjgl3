/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.dyncall

import org.lwjgl.generator.*

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