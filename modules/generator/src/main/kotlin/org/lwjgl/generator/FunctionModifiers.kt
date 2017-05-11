/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

class DependsOn(override val reference: String, val postfix: String? = null) : FunctionModifier, ReferenceModifier {
    override val isSpecial = false
}

/**
 * Can be used to mark a function as optional. FunctionProviders should ignore such functions if they're missing.
 * This is useful for functions that have been added long after the initial release of a particular extension, or
 * as a workaround for buggy drivers.
 */
object IgnoreMissing : FunctionModifier {
    override val isSpecial = false
}

/** Defines an expression that should be passed to the getInstance() method. */
class Capabilities(
    /** The expression to pass to the getInstance() method. */
    val expression: String,
    /** If true, getInstance() will not be called and the expression will be assigned to the FUNCTION_ADDRESS variable directly. */
    val override: Boolean = false
) : FunctionModifier {
    override val isSpecial = true
}

enum class ApplyTo {
    NORMAL,
    ALTERNATIVE,
    BOTH
}

class Code(
    val javaInit: List<Code.Statement> = Code.NO_STATEMENTS,

    val javaBeforeNative: List<Code.Statement> = Code.NO_STATEMENTS,
    val javaAfterNative: List<Code.Statement> = Code.NO_STATEMENTS,
    val javaFinally: List<Code.Statement> = Code.NO_STATEMENTS,

    val nativeBeforeCall: String? = null,
    val nativeCall: String? = null,
    val nativeAfterCall: String? = null
) : FunctionModifier {
    companion object {
        // Used to avoid null checks
        private val NO_STATEMENTS = ArrayList<Statement>(0)
        internal val NO_CODE = Code()
    }

    data class Statement(
        val code: String,
        val applyTo: ApplyTo = ApplyTo.BOTH
    )

    override val isSpecial get() =
    Code.NO_STATEMENTS !== javaInit ||
    Code.NO_STATEMENTS !== javaBeforeNative ||
    Code.NO_STATEMENTS !== javaAfterNative ||
    Code.NO_STATEMENTS !== javaFinally

    internal fun hasStatements(statements: List<Code.Statement>, applyTo: ApplyTo) =
        if (statements === NO_STATEMENTS) false else statements.any { it.applyTo === ApplyTo.BOTH || it.applyTo === applyTo }

    internal fun getStatements(statements: List<Code.Statement>, applyTo: ApplyTo) =
        if (statements === NO_STATEMENTS) statements else statements.filter { it.applyTo === ApplyTo.BOTH || it.applyTo === applyTo }

    private fun List<Code.Statement>.append(other: List<Code.Statement>) =
        if (this === Code.NO_STATEMENTS && other === Code.NO_STATEMENTS) Code.NO_STATEMENTS else this + other

    private fun String?.append(other: String?) =
        if (this == null)
            other
        else if (other == null)
            this
        else
            "$this\n$other"

    internal fun append(
        javaInit: List<Code.Statement> = Code.NO_STATEMENTS,

        javaBeforeNative: List<Code.Statement> = Code.NO_STATEMENTS,
        javaAfterNative: List<Code.Statement> = Code.NO_STATEMENTS,
        javaFinally: List<Code.Statement> = Code.NO_STATEMENTS,

        nativeBeforeCall: String? = null,
        nativeCall: String? = null,
        nativeAfterCall: String? = null
    ) = Code(
        this.javaInit.append(javaInit),

        this.javaBeforeNative.append(javaBeforeNative),
        this.javaAfterNative.append(javaAfterNative),
        this.javaFinally.append(javaFinally),

        this.nativeBeforeCall.append(nativeBeforeCall),
        this.nativeCall.append(nativeCall),
        this.nativeAfterCall.append(nativeAfterCall)
    )
}

val SaveErrno = Code(nativeAfterCall = "${t}saveErrno();")

fun statement(code: String, applyTo: ApplyTo = ApplyTo.BOTH): List<Code.Statement> = arrayListOf(Code.Statement(code, applyTo))

/** Marks a function without arguments as a macro. */
class Macro internal constructor(val function: Boolean, val constant: Boolean, val expression: String? = null) : FunctionModifier {
    companion object {
        internal val CONSTANT = Macro(function = false, constant = true)
        internal val VARIABLE = Macro(function = false, constant = false)
        internal val FUNCTION = Macro(function = true, constant = false)
    }

    override val isSpecial = false

    override fun validate(func: Func) {
        if (constant && func.parameters.isNotEmpty())
            throw IllegalArgumentException("The constant macro modifier can only be applied on functions with no arguments.")
    }
}

val macro = Macro.CONSTANT
fun macro(variable: Boolean = false) = if (variable) Macro.VARIABLE else Macro.FUNCTION
fun macro(expression: String) = Macro(function = true, constant = false, expression = expression)

class AccessModifier(val access: Access) : FunctionModifier {
    override val isSpecial = false
}

/** Makes the generated methods private. */
val private = AccessModifier(Access.PRIVATE)
/** Makes the generated methods package private. */
val internal = AccessModifier(Access.INTERNAL)

/** Overrides the native function name. This is useful for functions like Windows functions that have both a Unicode (W suffix) and ANSI version (A suffix). */
class NativeName(val nativeName: String) : FunctionModifier {
    internal val name get() = if (nativeName.contains(' ')) nativeName else "\"$nativeName\""

    override val isSpecial = false
}

/** Marks reused functions. */
object Reuse : FunctionModifier {
    override val isSpecial = false
}

/** Disables creation of Java array overloads. */
object OffHeapOnly : FunctionModifier {
    override val isSpecial = false
}

/** Marks a return value as a pointer that should be mapped (wrapped in a ByteBuffer of some capacity). */
class MapPointer(
    /** An expression that defines the ByteBuffer capacity. */
    val sizeExpression: String
) : FunctionModifier {
    override val isSpecial = true
    override fun validate(func: Func) {
        if (func.returns.nativeType !is PointerType)
            throw IllegalArgumentException("The MapPointer modifier can only be applied on functions with pointer return types.")

        if (func.returns.nativeType.mapping != PointerMapping.DATA)
            throw IllegalArgumentException("The MapPointer modifier can only be applied on function with void pointer return types.")
    }
}

class Construct(
    val firstArg: String, // Makes the user specify at least one, else the modifier is pointless
    vararg val otherArgs: String
) : FunctionModifier {
    override val isSpecial = true
    override fun validate(func: Func) {
        if (func.returns.nativeType !is ObjectType)
            throw IllegalArgumentException("The Construct modifier can only be applied on function with object return types.")
    }
}

/** Returns the address of the return value, instead of the return value itself. */
object Address : FunctionModifier {
    override val isSpecial = false
}