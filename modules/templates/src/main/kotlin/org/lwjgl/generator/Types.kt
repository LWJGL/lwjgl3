/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.nio.*

open class NativeType(
	/** The type used in the native API. */
	val name: String,
	/** The type we map the native type to. */
	val mapping: TypeMapping
) {

	// Lets get rid a level of indirection

	/** The JNI function argument type. */
	val jniFunctionType: String
		get() = mapping.jniFunctionType

	/** The native method argument type. */
	val nativeMethodType: Class<*>
		get() = mapping.nativeMethodType

	/** The Java method argument type. */
	val javaMethodType: Class<*>
		get() = mapping.javaMethodType

	override fun toString(): String =
		"${this.javaClass.getSimpleName()}: $name | ${mapping.jniFunctionType} | ${mapping.nativeMethodType} | ${mapping.javaMethodType}"
}

// Specialization for primitives.
open class PrimitiveType(name: String, mapping: PrimitiveMapping): NativeType(name, mapping)
// Specialization for integers.
open class IntegerType(name: String, mapping: PrimitiveMapping, val unsigned: Boolean = false): PrimitiveType(name, mapping)
open class EnumType(name: String): IntegerType(name, PrimitiveMapping.INT, unsigned = true)
// Specialization for string characters.
class CharType(name: String, mapping: CharMapping): PrimitiveType(name, mapping)

// Pointers
open class PointerType(
	/** The type used in the native API. */
	name: String,
	/** The type we map the native type to. */
	mapping: PointerMapping = PointerMapping.OPAQUE_POINTER,
	/** If true, the nativeType typedef includes a pointer. */
	val includesPointer: Boolean = false,
	/** Optional element type. See the secondary constructors below. */
	val elementType: NativeType? = null
): NativeType(name, mapping)
/** Converts primitive to array */
val PrimitiveType.p: PointerType get() = PointerType(
	this.name,
	(this.mapping as PrimitiveMapping).toPointer,
	elementType = this
)
/** pointer to pointer. */
private fun PointerType.pointerTo(const: Boolean = false): String {
	val builder = StringBuilder(name)
	if ( !includesPointer ) {
		if ( !name.endsWith('*') )
			builder append ' '
		builder append '*'
	}
	if ( const )
		builder append " const"

	return builder.toString()
}
val PointerType.p: PointerType get() = PointerType(this.pointerTo(), PointerMapping.DATA_POINTER, elementType = this)
val PointerType.const_p: PointerType get() = PointerType(this.pointerTo(const = true), PointerMapping.DATA_POINTER, elementType = this)

val String.p: PointerType get() = PointerType(this, includesPointer = false)
val String.opaque_p: PointerType get() = PointerType(this, includesPointer = true)

// Objects (pointer wrappers)
open class ObjectType(
	/** The Java wrapper class. */
	val className: String,
	/** The type used in the native API. */
	name: String = className,
	/** If true, the nativeType typedef includes a pointer. */
	includesPointer: Boolean = true
): PointerType(name, PointerMapping.OPAQUE_POINTER, includesPointer)

// Structs, 3 cases:
//
//     1) struct value
//         * val foo = struct(...).nativeType
//         * foo is <StructType with includesPointer = false>
//         * mapped to ByteBuffer
//     2) pointer to struct value(s), i.e. array of struct values
//         * val foo_p = foo.p
//         * foo_p is <StructType with includesPointer = true>
//         * mapped to ByteBuffer
//     3) pointer to pointer to struct value(s):
//         * val foo_pp = foo_p.p
//         * foo_pp is <PointerType with includesPointer = false>
//         * mapped to PointerBuffer
//
// The special case is #2. One would normally expect a PointerBuffer there (#1 is a ByteBuffer),
// but since struct arrays are packed, there's no need for an extra indirection. The difference
// between #2 and #3 is handled in the StructType.p extension property below.
class StructType(
	/** The struct size in bytes. */
	val definition: Struct,
	/** The type used in the native API. */
	name: String = definition.nativeName,
	/** The type we map the native type to. */
	mapping: PointerMapping = PointerMapping.DATA_BYTE,
	/** If true, the nativeType typedef includes a pointer. If false, the argument will be passed-by-value. */
	includesPointer: Boolean = false
): PointerType(name, mapping, includesPointer)
/** Converts a struct value to a pointer to a struct value. */
val StructType.p: PointerType get() = if ( this.includesPointer )
	PointerType(this.pointerTo(), PointerMapping.DATA_POINTER, elementType = this)
else
	StructType(name = this.pointerTo(), includesPointer = true, definition = this.definition)

// Strings
class CharSequenceType(
	/** The type used in the native API. */
	name: String,
	/** The type we map the native type to. */
	mapping: PointerMapping = PointerMapping.DATA_BYTE,
	/** If true, the nativeType typedef includes a pointer. */
	includesPointer: Boolean = false,
	/** The CharSequence charset. */
	val charMapping: CharMapping = CharMapping.ASCII,
	/** If true, the nativeType typedef includes a pointer. */
	val nullTerminated: Boolean = true
): PointerType(name, mapping, includesPointer)
/** Converts CharType to CharSequenceType. */
fun CharSequenceType(
	charType: CharType,
	/** The type we map the native type to. */
	mapping: PointerMapping = PointerMapping.DATA_BYTE,
	/** The CharSequence charset. */
	nullTerminated: Boolean = true
) = CharSequenceType(charType.name, mapping = mapping, charMapping = (charType.mapping as CharMapping), nullTerminated = nullTerminated)

// Callbacks
class CallbackType(
	val signature: CallbackFunction,
    name: String = signature.className
): ObjectType(signature.className, name)

// typedefs
fun typedef(typedef: PrimitiveType, name: String) = PrimitiveType(name, typedef.mapping as PrimitiveMapping)
fun typedef(typedef: IntegerType, name: String) = IntegerType(name, typedef.mapping as PrimitiveMapping, typedef.unsigned)
fun typedef(typedef: PointerType, name: String) = PointerType(name, typedef.mapping as PointerMapping, true, typedef.elementType)

// --- [ TYPE MAPPINGS ] ---

open class TypeMapping(
	/** The JNI function argument type. */
	val jniFunctionType: String,
	/** The native method argument type. */
	val nativeMethodType: Class<*>,
	/** The Java method argument type. */
	val javaMethodType: Class<*>
) {

	companion object {
		val VOID = TypeMapping("void", Void.TYPE, Void.TYPE)
	}

}

open class PrimitiveMapping(
	jniFunctionType: String,
	javaMethodType: Class<out Any>,
	val bytes: Int,
    val toPointer: PointerMapping
): TypeMapping(jniFunctionType, javaMethodType, javaMethodType) {

	companion object {
		val BOOLEAN = PrimitiveMapping("jboolean", javaClass<Boolean>(), 1, PointerMapping.DATA_BOOLEAN)

		val BYTE = PrimitiveMapping("jbyte", javaClass<Byte>(), 1, PointerMapping.DATA_BYTE)
		val CHAR = PrimitiveMapping("jchar", javaClass<Char>(), 2, PointerMapping.DATA_SHORT)
		val SHORT = PrimitiveMapping("jshort", javaClass<Short>(), 2, PointerMapping.DATA_SHORT)
		val INT = PrimitiveMapping("jint", javaClass<Int>(), 4, PointerMapping.DATA_INT)
		val LONG = PrimitiveMapping("jlong", javaClass<Long>(), 8, PointerMapping.DATA_LONG)

		// Integer type with enough precision to store a pointer
		val POINTER = PrimitiveMapping("jlong", javaClass<Long>(), 8, PointerMapping.DATA_POINTER)

		val FLOAT = PrimitiveMapping("jfloat", javaClass<Float>(), 4, PointerMapping.DATA_FLOAT)
		val DOUBLE = PrimitiveMapping("jdouble", javaClass<Double>(), 8, PointerMapping.DATA_DOUBLE)
	}

}

class CharMapping(
	jniFunctionType: String,
	javaMethodType: Class<out Any>,
	bytes: Int,
	toPointer: PointerMapping,
	val charset: String
): PrimitiveMapping(jniFunctionType, javaMethodType, bytes, toPointer) {

	companion object {
		val ASCII = CharMapping("jbyte", javaClass<Byte>(), 1, PointerMapping.DATA_BYTE, "ASCII")
		val UTF8 = CharMapping("jbyte", javaClass<Byte>(), 1, PointerMapping.DATA_BYTE, "UTF8")
		val UTF16 = CharMapping("jchar", javaClass<Char>(), 2, PointerMapping.DATA_SHORT, "UTF16")
	}

}

open class PointerMapping(
	javaMethodType: Class<*>,
	val byteShift: String? = null
): TypeMapping("jlong", javaClass<Long>(), javaMethodType) {

	companion object {
		val OPAQUE_POINTER = PointerMapping(javaClass<Long>())

		/** Useful for void * params that will be AutoTyped. */
		val DATA = PointerMapping(javaClass<ByteBuffer>())

		val DATA_POINTER = PointerMapping(Class.forName("org.lwjgl.PointerBuffer"), "POINTER_SHIFT")

		fun PointerMapping(javaMethodType: Class<out Any>, byteShift: Int) = PointerMapping(javaMethodType, Integer.toString(byteShift))

		val DATA_BOOLEAN = PointerMapping(javaClass<ByteBuffer>(), 0)
		val DATA_BYTE = PointerMapping(javaClass<ByteBuffer>(), 0)
		val DATA_SHORT = PointerMapping(javaClass<ShortBuffer>(), 1)
		val DATA_INT = PointerMapping(javaClass<IntBuffer>(), 2)
		val DATA_LONG = PointerMapping(javaClass<LongBuffer>(), 3)
		val DATA_FLOAT = PointerMapping(javaClass<FloatBuffer>(), 2)
		val DATA_DOUBLE = PointerMapping(javaClass<DoubleBuffer>(), 3)

		val primitiveMap = hashMapOf(
			DATA_POINTER to "pointer",

			DATA_BOOLEAN to "boolean",
			DATA_BYTE to "byte",
			DATA_SHORT to "short",
			DATA_INT to "int",
			DATA_LONG to "long",
			DATA_FLOAT to "float",
			DATA_DOUBLE to "double"
		)
	}

	val isMultiByte = byteShift != null && byteShift != "0"

}

val TypeMapping.isSizeType: Boolean
	get() = this === PrimitiveMapping.INT || this === PrimitiveMapping.POINTER
val TypeMapping.isSizePointer: Boolean
	get() = this === PointerMapping.DATA_INT || this === PointerMapping.DATA_POINTER