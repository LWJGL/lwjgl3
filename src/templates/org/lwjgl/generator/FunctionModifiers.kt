package org.lwjgl.generator

import java.util.ArrayList

class DependsOn(override val reference: String, val postfix: String? = null): FunctionModifier(), ReferenceModifier {
	companion object: ModifierKey<DependsOn>

	override val isSpecial = false
}

class Reuse(override val reference: String): FunctionModifier(), ReferenceModifier {
	companion object: ModifierKey<Reuse>

	override val isSpecial = true
}

/**
 * Can be used to mark a function as optional. FunctionProviders should ignore such functions if they're missing.
 * This is useful for functions that have been added long after the initial release of a particular extension, or
 * as a workaround for buggy drivers.
 */
val ignoreMissing = object: FunctionModifier() {
	override val isSpecial = false
}

/** Defines an expression that should be passed to the getInstance() method. */
class Capabilities(
	/** The expression to pass to the getInstance() method. */
	val expression: String,
	/** If defined, is a statement that will be printed before the getInstance() call. */
	val statement: String? = null,
	/** If true, getInstance() will not be called and the expression will be assigned to the FUNCTION_ADDRESS variable directly. */
	val override: Boolean = false
): FunctionModifier() {
	companion object: ModifierKey<Capabilities>

	override val isSpecial = true
}

class Code(
	val javaInit: List<Code.Statement> = Code.NO_STATEMENTS,

	val javaBeforeNative: List<Code.Statement> = Code.NO_STATEMENTS,
	val javaAfterNative: List<Code.Statement> = Code.NO_STATEMENTS,
	val javaFinally: List<Code.Statement> = Code.NO_STATEMENTS,

	val nativeBeforeCall: String? = null,
	val nativeAfterCall: String? = null
): FunctionModifier() {
	companion object: ModifierKey<Code> {
		// Used to avoid null checks
		private val NO_STATEMENTS: List<Statement> = ArrayList(0)
		val NO_CODE = Code()
	}

	enum class ApplyTo {
		NORMAL
		ALTERNATIVE
		BOTH
	}

	data class Statement(
		val code: String,
		val applyTo: Code.ApplyTo = Code.ApplyTo.BOTH
	)

	override val isSpecial = true

	fun hasStatements(statements: List<Code.Statement>, applyTo: Code.ApplyTo) =
		if ( statements === NO_STATEMENTS ) false else statements.any { it.applyTo === Code.ApplyTo.BOTH || it.applyTo === applyTo }
	fun getStatements(statements: List<Code.Statement>, applyTo: Code.ApplyTo) =
		if ( statements === NO_STATEMENTS ) statements else statements.filter { it.applyTo === Code.ApplyTo.BOTH || it.applyTo === applyTo }

}
fun NativeClass.statement(code: String, applyTo: Code.ApplyTo = Code.ApplyTo.BOTH): List<Code.Statement> = arrayListOf(Code.Statement(code, applyTo))

/** Marks a function without arguments as a macro. */
val macro = object: FunctionModifier() {
	override val isSpecial = false

	protected override fun validate(func: NativeClassFunction) {
		if ( func.getNativeParams().any() )
			throw IllegalArgumentException("The macro modifier can only be applied on functions with no arguments.")
	}
}

class AccessModifier(val access: Access): FunctionModifier() {
	companion object: ModifierKey<AccessModifier>

	override val isSpecial = false
}

/** Makes the generated methods private. */
val private = AccessModifier(Access.PUBLIC)
/** Makes the generated methods package private. */
val internal = AccessModifier(Access.INTERNAL)