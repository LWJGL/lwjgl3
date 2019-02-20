/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.linux

import org.lwjgl.generator.*

val long = IntegerType("long", PrimitiveMapping.POINTER)
val unsigned_long = IntegerType("unsigned long", PrimitiveMapping.POINTER, unsigned = true)