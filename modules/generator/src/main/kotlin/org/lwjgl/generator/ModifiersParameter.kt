/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

// Parameter

object Virtual : ParameterModifier {
    override val isSpecial = false
}

/** Marks a pointer-to-not-const parameter as an input parameter. */
object Input : ParameterModifier {
    override val isSpecial = false
    override fun validate(param: Parameter) {
        if (param.nativeType !is PointerType<*>) {
            throw IllegalArgumentException("The Input modifier can only be applied to pointer parameters.")
        }

        if (!param.nativeType.elementType.let { it is StructType || it is CharType }) {
            throw IllegalArgumentException("The Input modifier is only necessary on struct or string parameters.")
        }

        if (isInput(param.nativeType)) {
            throw IllegalArgumentException("The Input modifier is not necessary on pointer-to-const parameters.")
        }
    }

    private fun isInput(type: PointerType<*>): Boolean =
        type.elementType.name.endsWith(" const") ||
        (type.elementType is PointerType<*> && isInput(type.elementType))
}

object MapToInt : ParameterModifier {
    override val isSpecial = true
    override fun validate(param: Parameter) {
        if (param.nativeType.mapping !== PrimitiveMapping.BYTE && param.nativeType.mapping !== PrimitiveMapping.SHORT)
            throw IllegalArgumentException("The MapToInt modifier can only be applied to byte or short parameters.")
    }
}

/** When present, the parameter transformation is stored to a local variable that can be referenced from custom code or checks. */
object UseVariable : ParameterModifier {
    override val isSpecial = false
}

class AutoSizeFactor(
    val operator: String,
    private val operatorInv: String,
    val expression: String
) {
    companion object {
        const val OPERAND = "\$operand"

        fun div(expression: String) = AutoSizeFactor("/", "*", expression)
        fun mul(expression: String) = AutoSizeFactor("*", "/", expression)
        fun shl(expression: String) = AutoSizeFactor("<<", ">>", expression)
        fun shr(expression: String) = AutoSizeFactor(">>", "<<", expression)

        // Normal factors: operand operator expression => operand operatorInv expression
        // This enables: operator(operand) => operatorInv(operand)
        // Usage example: AutoSizeFactor.custom { "op($it)" to "opInv($it)" }
        fun custom(operators: (String)->Pair<String, String>): AutoSizeFactor {
            val (operator, operatorInv) = operators(OPERAND)
            return AutoSizeFactor(operator, operatorInv, OPERAND)
        }
    }

    fun scale(operand: String) = if (expression === OPERAND)
        operator.replace(OPERAND, operand)
    else
        "$operand $operator $expression"

    fun scaleInv(operand: String) = if (expression === OPERAND)
        operatorInv.replace(OPERAND, operand)
    else
        "$operand $operatorInv $expression"
}

class AutoSize(
    override val reference: String,
    vararg val dependent: String,
    /** If not null, the expression will be appended to the parameter. */
    val factor: AutoSizeFactor? = null
) : ParameterModifier, ReferenceModifier {
    override val isSpecial = true

    override fun hasReference(reference: String) = this.reference == reference || dependent.any { it == reference }

    override fun validate(param: Parameter) {
        if (param.nativeType is PointerType<*>) {
            if (param.isInput) {
                if (dependent.isNotEmpty()) {
                    throw IllegalArgumentException("Input pointer parameters with the AutoSize modifier cannot reference dependent parameters.")
                }
            } else {
                when (param.nativeType.mapping) {
                    PointerMapping.DATA_INT,
                    PointerMapping.DATA_POINTER -> {
                    }
                    else                        -> throw IllegalArgumentException("Output pointer parameters with the AutoSize modifier must be integer pointer types.")
                }
            }
        } else {
            when (param.nativeType.mapping) {
                PrimitiveMapping.BYTE,
                PrimitiveMapping.SHORT,
                PrimitiveMapping.INT,
                PrimitiveMapping.LONG,
                PrimitiveMapping.POINTER -> {
                }
                else                     -> throw IllegalArgumentException("Value parameters with the AutoSize modifier must be integer primitive types.")
            }
        }
    }
}

class AutoSizeResultParam(val expression: String?) : ParameterModifier {
    override val isSpecial = true
    override fun validate(param: Parameter) {
        if (param.nativeType is PointerType<*>) {
            when (param.nativeType.mapping) {
                PointerMapping.DATA_INT,
                PointerMapping.DATA_POINTER -> {
                }
                else                        -> {
                    throw IllegalArgumentException("The AutoSizeResult modifier on output parameters can only be applied to integer pointer types.")
                }
            }

            if (param has nullable)
                throw IllegalArgumentException("The AutoSizeResult modifier cannot be applied to nullable parameters.")
        } else {
            if (param.nativeType.mapping.nativeMethodType.isPrimitive) {
                when (param.nativeType.mapping) {
                    PrimitiveMapping.INT,
                    PrimitiveMapping.POINTER -> {
                    }
                    else                     -> {
                        throw IllegalArgumentException("The AutoSizeResult modifier on input parameters can only be applied to integer primitive types.")
                    }
                }
            }
        }
    }
}

val AutoSizeResult = AutoSizeResultParam(null)
/* Custom expression. Use $original to inject the hardcoded expression */
fun AutoSizeResult(expression: String) = AutoSizeResultParam(expression)

/** Adds a capacity check to a buffer parameter. */
class Check(
    /** An integer expression to validate against the buffer capacity. */
    val expression: String,
    /** If true, the check will only be performed in debug mode. Useful for expensive checks. */
    val debug: Boolean = false
) : ParameterModifier {
    override val isSpecial = expression != "0"
    override fun validate(param: Parameter) {
        if (param.nativeType !is PointerType<*>)
            throw IllegalArgumentException("The Check modifier can only be applied to pointer types.")

        if (param.nativeType.mapping === PointerMapping.OPAQUE_POINTER)
            throw IllegalArgumentException("The Check modifier cannot be applied to opaque pointer types.")
    }
}

/** Factory method for Check modifiers with integer expressions. */
fun Check(value: Int) = Check(Integer.toString(value))

/** Marks a buffer parameter as terminated by the specified value. */
class Terminated(val value: String) : ParameterModifier {
    override val isSpecial = true
    override fun validate(param: Parameter) {
        if (param.nativeType !is PointerType<*>)
            throw IllegalArgumentException("The NullTerminated modifier can only be applied to pointer types.")

        if (param.nativeType.mapping === PointerMapping.OPAQUE_POINTER)
            throw IllegalArgumentException("The NullTerminated modifier cannot be applied to opaque pointer types.")
    }
}

/** Marks a buffer parameter as null-terminated. */
val NullTerminated = Terminated("")

/** Marks a parameter to be replaced with an expression. */
class Expression(
    /** The expression to use instead of the parameter name. */
    val value: String,
    /** If true, the parameter will not be removed from the method signature. */
    val keepParam: Boolean = false,
    /** If true, the normal method overload (without the applied Expression) will not be generated. */
    val skipNormal: Boolean = false
) : ParameterModifier {
    override val isSpecial = true
}

interface AutoTypeToken {
    val name: String
    val mapping: PointerMapping
    val className: String
}

/**
 * Replaces a parameter with specific type tokens and the referenced pointer parameter with the typed NIO buffer that corresponds to the token value. See
 * GL20#glVertexAttribPointer for an example.
 */
class AutoType(override val reference: String, vararg val types: AutoTypeToken) : ParameterModifier, ReferenceModifier {
    override val isSpecial = false

    init {
        if (types.isEmpty())
            throw IllegalArgumentException("No types specified.")
    }

    override fun validate(param: Parameter) {
        if (param.nativeType !is IntegerType || !param.nativeType.unsigned)
            throw IllegalArgumentException("The AutoType modifier can only be applied to unsigned integer parameters.")
    }
}

/** Like AutoType, but with a hard-coded list of types. See glTexImage2D for an example. */
class MultiType(
    vararg val types: PointerMapping,
    /** If true, a byte[] overload will be generated as well. */
    val byteArray: Boolean = false
) : ParameterModifier {
    init {
        if (types.isEmpty())
            throw IllegalArgumentException("No buffer types specified.")

        for (t in types) {
            if (t === PointerMapping.DATA_BYTE)
                throw IllegalArgumentException("The DATA_BYTE mapping cannot be used with the MultiType modifier.")

            if (t === PointerMapping.OPAQUE_POINTER)
                throw IllegalArgumentException("The MultiType modifier can only be applied with concrete PointerMappings.")
        }
    }

    override val isSpecial = true
    override fun validate(param: Parameter) {
        if (param.nativeType !is PointerType<*>)
            throw IllegalArgumentException("The MultiType modifier can only be applied to pointer types.")

        if (param.nativeType.mapping === PointerMapping.OPAQUE_POINTER)
            throw IllegalArgumentException("The MultiType modifier cannot be applied to opaque pointer types.")
    }

}

val MultiTypeAll = MultiType(
    PointerMapping.DATA_SHORT,
    PointerMapping.DATA_INT,
    PointerMapping.DATA_LONG,
    PointerMapping.DATA_FLOAT,
    PointerMapping.DATA_DOUBLE,
    PointerMapping.DATA_POINTER
)

object RawPointer : ParameterModifier {
    override val isSpecial = true
    override fun validate(param: Parameter) {
        if (!param.nativeType.isPointerData) {
            throw IllegalStateException("The RawPointer modifier can only modifier to data pointer parameters.")
        }
    }
}

/** Marks a pointer parameter to become the return value of an alternative method. */
class Return(
    /** The parameter that returns the actual buffer size. Use {@code RESULT} if it's the function return value. */
    val lengthParam: String,
    /** An expression that defines the maximum length value. If defined, an additional alternative method will be generated. */
    val maxLengthExpression: String? = null,
    /** When true, any temporary buffers will be allocated on the heap. */
    val heapAllocate: Boolean = false,
    /** When true, the actual buffer size includes the null-termination. */
    val includesNT: Boolean = false
) : ParameterModifier {
    override val isSpecial = true
    override fun validate(param: Parameter) {
        if (param.nativeType is PointerType<*>) {
            if (param.isInput)
                throw IllegalArgumentException("The Return modifier can only be applied to output parameters.")

            if (param.nativeType.mapping === PointerMapping.OPAQUE_POINTER)
                throw IllegalArgumentException("The Return modifier cannot be applied to opaque pointer types.")

            if (this !== ReturnParam && param.nativeType !is CharSequenceType && !lengthParam.startsWith(RESULT))
                throw IllegalArgumentException("The Return modifier can only be applied to CharSequence parameters.")

            if (heapAllocate && param.nativeType !is CharSequenceType)
                throw IllegalArgumentException("The heapAllocate option can only be enabled with CharSequence parameters.")

            if (includesNT && param.nativeType !is CharSequenceType)
                throw IllegalArgumentException("The includesNT option can only be enabled with CharSequence parameters.")
        } else {
            if (this !== ReturnParam || param.nativeType !is StructType)
                throw IllegalArgumentException("The ReturnParam modifier can only be used on struct value parameters.")
        }
    }
}

/** Used for simple return values. */
val ReturnParam = Return("", null)

/** Marks a buffer parameter to transform to a single element value in an alternative method. */
class SingleValue(val newName: String) : ParameterModifier {
    override val isSpecial = true
    override fun validate(param: Parameter) {
        if (param.nativeType !is PointerType<*>)
            throw IllegalArgumentException("The SingleValue modifier can only be applied to pointer types.")

        if (param.nativeType.mapping === PointerMapping.OPAQUE_POINTER)
            throw IllegalArgumentException("The SingleValue modifier cannot be applied to opaque pointer types.")
    }
}

/** Marks a pointer parameter as an array of pointers. */
class PointerArray(
    /** The array element type. */
    val elementType: PointerType<*>,
    /** The single version parameter name. */
    val singleName: String,
    /** The parameter that defines the data legth of each element in the array. If null, the elements are assumed to be null-terminated. */
    val lengthsParam: String? = null
) : ParameterModifier {
    override val isSpecial = true
    override fun validate(param: Parameter) {
        if (param.nativeType !is PointerType<*>)
            throw IllegalArgumentException("The PointerArray modifier can only be applied to pointer types.")

        if (param.nativeType.mapping != PointerMapping.DATA_POINTER)
            throw IllegalArgumentException("The PointerArray modifier can only be applied to pointer-to-pointer types.")

        if (!param.isInput)
            throw IllegalArgumentException("The PointerArray modifier can only be applied to input parameters.")
    }
}

/** Marks a callback parameter as the "user data" parameter. */
class UserData(
    override val reference: String = ""
) : ParameterModifier, ReferenceModifier {
    override val isSpecial = false
    override fun validate(param: Parameter) {
        if (!(param.nativeType is PointerType<*> && param.nativeType.elementType is OpaqueType)) {
            throw IllegalArgumentException("The UserData modifier can only be applied to opaque pointer parameters.")
        }
    }
}