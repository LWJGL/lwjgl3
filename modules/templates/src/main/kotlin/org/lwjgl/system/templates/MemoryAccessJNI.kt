/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.templates

import org.lwjgl.generator.*

val MemoryAccessJNI = "MemoryAccessJNI".nativeClass(packageName = "org.lwjgl.system") {
	nativeImport(
		"<stdlib.h>",
		"<stdint.h>"
	)

	access = Access.INTERNAL
	documentation = "Memory access utilities."

	Code(
		nativeCall = "\treturn (jint)sizeof(void *);"
	)..int(
		"getPointerSize",
		"Returns the {@code sizeof(void *)}."
	)

	val primitives = arrayOf(
		Triple(int8_t, "Byte", "a byte value"),
		Triple(int16_t, "Short", "a short value"),
		Triple(int32_t, "Int", "an int value"),
		Triple(int64_t, "Long", "a long value"),

		Triple(float, "Float", "a float value"),
		Triple(double, "Double", "a double value"),

		Triple(intptr_t, "Address", "a pointer address")
	)

	nativeDirective(
		"""#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4711))
	static void* aligned_alloc(size_t alignment, size_t size) {
        return _aligned_malloc(size, alignment);
    }
	#define aligned_free _aligned_free
#else
	#ifndef __USE_ISOC11
	static void* aligned_alloc(size_t alignment, size_t size) {
		void *p;
		return posix_memalign(&p, alignment, size) ? NULL : p;
	}
	#endif
	#define aligned_free free
#endif

// -----------

${primitives
			.asSequence()
			.map {
				val (type, name) = it
				"static inline ${type.name} get$name(void *ptr) { return *(${type.name} *)ptr; }"
			}
			.joinToString("\n")}

// -----------

${primitives
			.asSequence()
			.map {
				val (type, name) = it
				"static inline void put$name(void *ptr, ${type.name} value) { *(${type.name} *)ptr = value; }"
			}
			.joinToString("\n")}

// -----------""")

	arrayOf(
		"malloc",
		"calloc",
		"realloc",
		"free",

		"aligned_alloc",
		"aligned_free"
	).forEach {
		macro..Address..voidptr(
			it,
			"Returns the address of the stdlib $it function."
		)
	}

	for ((type, name, msg) in primitives)
		type(
			"get$name",
			"Reads $msg from the specified memory address.",

			voidptr.IN("ptr", "the memory address to read")
		)

	for ((type, name, msg) in primitives)
		void(
			"put$name",
			"Writes $msg to the specified memory address.",

			voidptr.IN("ptr", "the memory address to write"),
			type.IN("value", "the value to write")
		)
}