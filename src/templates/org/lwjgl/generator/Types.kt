/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import org.lwjgl.PointerBuffer
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
	val nativeMethodType: Class<out Any>
		get() = mapping.nativeMethodType

	/** The Java method argument type. */
	val javaMethodType: Class<out Any>
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
fun PointerType(primitiveType: PrimitiveType) = PointerType(
	primitiveType.name,
	when ( primitiveType.mapping as PrimitiveMapping ) {
		PrimitiveMapping.BOOLEAN -> PointerMapping.DATA_BYTE
		PrimitiveMapping.BYTE    -> PointerMapping.DATA_BYTE
		PrimitiveMapping.SHORT   -> PointerMapping.DATA_SHORT
		PrimitiveMapping.INT     -> PointerMapping.DATA_INT
		PrimitiveMapping.LONG    -> PointerMapping.DATA_LONG
		PrimitiveMapping.PTR     -> PointerMapping.DATA_POINTER
		PrimitiveMapping.FLOAT   -> PointerMapping.DATA_FLOAT
		PrimitiveMapping.DOUBLE  -> PointerMapping.DATA_DOUBLE
		else                     -> {
			throw IllegalArgumentException()
		}
	},
	elementType = primitiveType
)
/** pointer to pointer. */
private fun PointerType.pointerTo(const: Boolean): String {
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
fun PointerType(pointerType: PointerType, const: Boolean = false) = PointerType(pointerType.pointerTo(const), PointerMapping.DATA_POINTER, elementType = pointerType)

// Objects (pointer wrappers)
open class ObjectType(
	/** The Java wrapper class. */
	val className: String,
	/** The type used in the native API. */
	name: String = className,
	/** If true, the nativeType typedef includes a pointer. */
	includesPointer: Boolean = true
): PointerType(name, PointerMapping.OPAQUE_POINTER, includesPointer)

// Structs
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
fun StructType(structType: StructType) = StructType(name = structType.pointerTo(const = false), includesPointer = true, definition = structType.definition)

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
	val nativeMethodType: Class<out Any>,
	/** The Java method argument type. */
	val javaMethodType: Class<out Any>
) {

	companion object {
		val VOID = TypeMapping("void", Void.TYPE, Void.TYPE)
	}

}

open class PrimitiveMapping(
	jniFunctionType: String,
	javaMethodType: Class<out Any>,
	val bytes: Int
): TypeMapping(jniFunctionType, javaMethodType, javaMethodType) {

	companion object {
		val BOOLEAN = PrimitiveMapping("jboolean", javaClass<Boolean>(), 1)

		val BYTE = PrimitiveMapping("jbyte", javaClass<Byte>(), 1)
		val CHAR = PrimitiveMapping("jchar", javaClass<Char>(), 2)
		val SHORT = PrimitiveMapping("jshort", javaClass<Short>(), 2)
		val INT = PrimitiveMapping("jint", javaClass<Int>(), 4)
		val LONG = PrimitiveMapping("jlong", javaClass<Long>(), 8)

		// Integer type with enough precision to store a pointer
		val PTR = PrimitiveMapping("jlong", javaClass<Long>(), 8)

		val FLOAT = PrimitiveMapping("jfloat", javaClass<Float>(), 4)
		val DOUBLE = PrimitiveMapping("jdouble", javaClass<Double>(), 8)
	}

}

class CharMapping(
	jniFunctionType: String,
	javaMethodType: Class<out Any>,
	bytes: Int,
	val charset: String
): PrimitiveMapping(jniFunctionType, javaMethodType, bytes) {

	companion object {
		val ASCII = CharMapping("jbyte", javaClass<Byte>(), 1, "ASCII")
		val UTF8 = CharMapping("jbyte", javaClass<Byte>(), 1, "UTF8")
		val UTF16 = CharMapping("jchar", javaClass<Char>(), 2, "UTF16")
	}

}

open class PointerMapping(
	javaMethodType: Class<out Any>,
	val byteShift: String? = null
): TypeMapping("jlong", javaClass<Long>(), javaMethodType) {

	companion object {
		val OPAQUE_POINTER = PointerMapping(javaClass<Long>())

		/** Useful for void * params that will be AutoTyped. */
		val DATA = PointerMapping(javaClass<ByteBuffer>())

		val DATA_POINTER = PointerMapping(javaClass<PointerBuffer>(), "POINTER_SHIFT")

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
	get() = this === PrimitiveMapping.INT || this === PrimitiveMapping.PTR
val TypeMapping.isSizePointer: Boolean
	get() = this === PointerMapping.DATA_INT || this === PointerMapping.DATA_POINTER