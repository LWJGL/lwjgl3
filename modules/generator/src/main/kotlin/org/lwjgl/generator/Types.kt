/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import org.lwjgl.*
import java.nio.*
import kotlin.reflect.*

/*
- NativeType
    - ValueType
        - PrimitiveType
            - IntegerType
            - CharType
        - StructType (mapped to struct class)
    - PointerType (mapped to raw pointer or buffer)
        - ArrayType (mapped to java array)
        - CharSequenceType (mapped to String/CharSequence)
        - ObjectType (mapped to a Java class)
            - CallbackType (mapped to callback interface)
            - C++ classes (if we add support in the future)
*/

open class NativeType(
    /** The type used in the native API. */
    val name: String,
    /** The type we map the native type to. */
    val mapping: TypeMapping
) {

    // Lets get rid a level of indirection

    /** The JNI function argument type. */
    internal val jniFunctionType
        get() = mapping.jniFunctionType

    /** The native method argument type. */
    internal val nativeMethodType
        get() = mapping.nativeMethodName

    /** The Java method argument type. */
    internal open val javaMethodType
        get() = if (this.mapping === PrimitiveMapping.BOOLEAN4) "boolean" else mapping.javaMethodName

    internal fun annotation(type: String, hasConst: Boolean, arraySize: String? = null): String? {
        val nativeType = this.name.let {
            if (this is PointerType && !this.includesPointer) {
                if (!it.endsWith('*')) "$it *" else "$it*"
            } else
                it
        }.let {
            if (hasConst)
                "const $it"
            else
                it
        }

        return if (type == nativeType)
            null
        else
            "@NativeType(\"$nativeType${if (arraySize == null) "" else "[$arraySize]"}\")"
    }

    internal fun annotate(type: String, hasConst: Boolean, arraySize: String? = null) = annotation(type, hasConst, arraySize).let {
        if (it == null)
            type
        else
            "$it $type"
    }

    override fun toString() =
        "${this::class.java.simpleName}: $name | $jniFunctionType | $nativeMethodType | $javaMethodType"
}

// Java instance passed as jobject to native code
val KClass<*>.jobject: NativeType get() = NativeType("jobject", TypeMapping("jobject", this, this))

abstract class ValueType internal constructor(name: String, mapping: TypeMapping) : NativeType(name, mapping)

// Specialization for primitives.
open class PrimitiveType(name: String, mapping: PrimitiveMapping) : ValueType(name, mapping)

// Specialization for integers.
open class IntegerType(name: String, mapping: PrimitiveMapping, val unsigned: Boolean = false) : PrimitiveType(name, mapping)

val String.enumType get() = IntegerType(this, PrimitiveMapping.INT)

// Specialization for string characters.
class CharType(name: String, mapping: CharMapping) : PrimitiveType(name, mapping)

// Structs
class StructType internal constructor(
    /** The struct size in bytes. */
    val definition: Struct,
    /** The type used in the native API. */
    name: String = definition.nativeName
) : ValueType(name, PrimitiveMapping.POINTER) {
    override val javaMethodType
        get() = definition.className
}

internal val NativeType.dereference get() = (if (this is PointerType && this.elementType != null) this.elementType else this)
internal val NativeType.hasStructValidation
    get() = dereference.let { it is StructType && it.definition.validations.any() }

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
) : NativeType(name, mapping) {
    override val javaMethodType
        get() = if (elementType is StructType)
            elementType.definition.className
        else
            super.javaMethodType
}

private fun PointerType.pointerTo(): String {
    val builder = StringBuilder(name)
    if (!includesPointer) {
        if (!name.endsWith('*'))
            builder.append(' ')
        builder.append('*')
    }

    return builder.toString()
}

/** Pointer to value */
val ValueType.p get() = PointerType(this.name, (this.mapping as PrimitiveMapping).toPointer, elementType = this)
fun ValueType.p(name: String) = PointerType(
    name,
    (this.mapping as PrimitiveMapping).toPointer,
    elementType = this,
    includesPointer = true
)
/** Pointer to pointer */
val PointerType.p get() = PointerType(this.pointerTo(), PointerMapping.DATA_POINTER, elementType = this)
/** Const pointer */
val PointerType.const get() = when {
    this.includesPointer    -> throw IllegalArgumentException("The const keyword cannot be applied to opaque pointer types.")
    this.name.endsWith("*") -> PointerType("${this.name} const", this.mapping as PointerMapping, elementType = this.elementType, includesPointer = false)
    else                    -> PointerType("${this.name} * const", this.mapping as PointerMapping, elementType = this.elementType, includesPointer = true)
}
/** Simple pointer shortcut */
val String.p get() = PointerType(this, includesPointer = false)
/** Opaque pointer shortcut */
val String.opaque_p get() = PointerType(this, includesPointer = true)

// Strings
class CharSequenceType(
    /** The type used in the native API. */
    name: String,
    /** The type we map the native type to. */
    mapping: PointerMapping = PointerMapping.DATA_BYTE,
    /** If true, the native typedef includes a pointer. */
    includesPointer: Boolean = false,
    /** The CharSequence charset. */
    val charMapping: CharMapping = CharMapping.ASCII
) : PointerType(name, mapping, includesPointer)

/** Converts CharType to CharSequenceType. */
val CharType.p get() = CharSequenceType(this.name, mapping = PointerMapping.DATA_BYTE, charMapping = (this.mapping as CharMapping))

// Arrays (automatically used for array overloads)
class ArrayType internal constructor(
    type: PointerType,
    mapping: PointerMapping = type.mapping as PointerMapping
) : PointerType(
    type.name,
    mapping,
    type.includesPointer,
    type.elementType
)

// Objects (org.lwjgl.system.Pointer subclasses)
open class ObjectType(
    /** The Java wrapper class. */
    val className: String,
    /** The type used in the native API. */
    name: String = className,
    /** If true, the native typedef includes a pointer. */
    includesPointer: Boolean = true
) : PointerType(name, PointerMapping.OPAQUE_POINTER, includesPointer) {
    override val javaMethodType
        get() = className
}

// Callbacks
class CallbackType(
    val signature: CallbackFunction,
    name: String = signature.className
) : ObjectType(signature.className, name) {
    override val javaMethodType
        get() = "${super.javaMethodType}I"
}

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

    constructor(
        /** The JNI function argument type. */
        jniFunctionType: String,
        /** The native method argument type. */
        nativeMethodClass: KClass<*>,
        /** The Java method argument type. */
        javaMethodClass: KClass<*>
    ) : this(jniFunctionType, nativeMethodClass.java, javaMethodClass.java)

    companion object {
        val VOID = TypeMapping("void", Void.TYPE, Void.TYPE)
    }

    private val Class<*>.javaName get() = this.typeParameters.let {
        if (it.isEmpty())
            this.simpleName
        else
            "${this.simpleName}<${it.indices.map { '?' }.joinToString(", ")}>"
    }

    internal val nativeMethodName get() = nativeMethodType.javaName
    internal val javaMethodName get() = javaMethodType.javaName

    internal val jniSignatureStrict get() = when (this.nativeMethodType) {
        Boolean::class.java -> "Z"
        Byte::class.java    -> "B"
        Char::class.java    -> "C"
        Double::class.java  -> "D"
        Float::class.java   -> "F"
        Int::class.java     -> "I"
        Long::class.java    -> "J"
        Short::class.java   -> "S"
        Void.TYPE           -> "V"
        else                -> "L${this.nativeMethodType.name};"
    }

    internal val jniSignature get() = if (this.nativeMethodType === Long::class.java && this !== PrimitiveMapping.LONG) "P" else jniSignatureStrict

    internal val jniSignatureJava get() = if (this.nativeMethodType === Long::class.java)
        if (this === PrimitiveMapping.LONG) "J" else "P"
    else
        ""

    internal val jniSignatureArray get() = when ((this as PointerMapping).primitive) {
        "byte"   -> "_3B"
        "double" -> "_3D"
        "float"  -> "_3F"
        "int"    -> "_3I"
        "long"   -> "_3J"
        "short"  -> "_3S"
        else     -> throw IllegalStateException()
    }

}

open class PrimitiveMapping internal constructor(
    jniFunctionType: String,
    javaMethodType: KClass<*>,
    val bytes: Int,
    val toPointer: PointerMapping
) : TypeMapping(jniFunctionType, javaMethodType, javaMethodType) {

    companion object {
        val BOOLEAN = PrimitiveMapping("jboolean", Boolean::class, 1, PointerMapping.DATA_BOOLEAN)
        val BOOLEAN4 = PrimitiveMapping("jint", Int::class, 4, PointerMapping.DATA_INT)

        val BYTE = PrimitiveMapping("jbyte", Byte::class, 1, PointerMapping.DATA_BYTE)
        val SHORT = PrimitiveMapping("jshort", Short::class, 2, PointerMapping.DATA_SHORT)
        val INT = PrimitiveMapping("jint", Int::class, 4, PointerMapping.DATA_INT)
        val LONG = PrimitiveMapping("jlong", Long::class, 8, PointerMapping.DATA_LONG)

        // Integer type with enough precision to store a pointer
        val POINTER = PrimitiveMapping("jlong", Long::class, Int.MAX_VALUE /* should not be used */, PointerMapping.DATA_POINTER)

        val FLOAT = PrimitiveMapping("jfloat", Float::class, 4, PointerMapping.DATA_FLOAT)
        val DOUBLE = PrimitiveMapping("jdouble", Double::class, 8, PointerMapping.DATA_DOUBLE)
    }

}

class CharMapping(
    jniFunctionType: String,
    javaMethodType: KClass<*>,
    bytes: Int,
    toPointer: PointerMapping,
    val charset: String
) : PrimitiveMapping(jniFunctionType, javaMethodType, bytes, toPointer) {

    companion object {
        val ASCII = CharMapping("jbyte", Byte::class, 1, PointerMapping.DATA_BYTE, "ASCII")
        val UTF8 = CharMapping("jbyte", Byte::class, 1, PointerMapping.DATA_BYTE, "UTF8")
        val UTF16 = CharMapping("jchar", Char::class, 2, PointerMapping.DATA_SHORT, "UTF16")
    }

}

open class PointerMapping private constructor(
    javaMethodType: KClass<*>,
    val byteShift: String? = null
) : TypeMapping("jlong", Long::class, javaMethodType) {

    companion object {
        val OPAQUE_POINTER = PointerMapping(Long::class)

        /** Useful for void * params that will be AutoTyped. */
        val DATA = PointerMapping(ByteBuffer::class)

        val DATA_POINTER = PointerMapping(PointerBuffer::class, "POINTER_SHIFT")

        fun PointerMapping(javaMethodType: KClass<*>, byteShift: Int) = PointerMapping(javaMethodType, Integer.toString(byteShift))

        val DATA_BOOLEAN = PointerMapping(ByteBuffer::class, 0)
        val DATA_BYTE = PointerMapping(ByteBuffer::class, 0)
        val DATA_SHORT = PointerMapping(ShortBuffer::class, 1)
        val DATA_INT = PointerMapping(IntBuffer::class, 2)
        val DATA_LONG = PointerMapping(LongBuffer::class, 3)
        val DATA_FLOAT = PointerMapping(FloatBuffer::class, 2)
        val DATA_DOUBLE = PointerMapping(DoubleBuffer::class, 3)
    }

    internal val isMultiByte = byteShift != null && byteShift != "0"

    internal val box = super.javaMethodName.substringBefore("Buffer")
    internal val primitive get() = when (this) {
        DATA_BOOLEAN -> "boolean"
        DATA_POINTER -> "long"
        else         -> box.toLowerCase()
    }

    internal val mallocType get() = when (box) {
        "Byte" -> ""
        else   -> box
    }

}

val NativeType.isPointer
    get() = this is PointerType || this.mapping === PrimitiveMapping.POINTER

val NativeType.isPointerData
    get() = this is PointerType && this.mapping !== PointerMapping.OPAQUE_POINTER

val TypeMapping.isPointerSize
    get() = this === PointerMapping.DATA_INT || this === PointerMapping.DATA_POINTER

internal val TypeMapping.isArray
    get() = this is PointerMapping && this.isMultiByte && this !== PointerMapping.DATA_POINTER