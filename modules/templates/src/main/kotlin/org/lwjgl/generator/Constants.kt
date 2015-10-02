/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.io.PrintWriter
import kotlin.reflect.KClass

// Extension properties for numeric literals.
inline val Int.b: Byte get() = this.toByte()
inline val Int.s: Short get() = this.toShort()
inline val Long.i: Int get() = this.toInt()

class ConstantType<T: Any>(
	type: KClass<T>,
	val print: (T) -> String
) {
	val javaType = type.java
}

val ByteConstant = ConstantType(Byte::class) {
	val i = it.toInt() and 0xFF
	"0x%X".format(i) let {
		if ( i < 0x80 ) it else "(byte)$it"
	}
}
val CharConstant = ConstantType(Char::class) { "'$it'" }
val ShortConstant = ConstantType(Short::class) {
	val i = it.toInt() and 0xFFFF
	"0x%X".format(i) let {
		if ( i < 0x8000 ) it else "(short)$it"
	}
}
val IntConstant = ConstantType(Int::class) { "0x%X".format(it) }
val LongConstant = ConstantType(Long::class) { "0x%XL".format(it) }
val FloatConstant = ConstantType(Float::class) { "%sf".format(it) }

val StringConstant = ConstantType(String::class) { "\"$it\"" }

open class Constant<T: Any>(val name: String, val value: T?)
class ConstantExpression<T: Any>(name: String, val expression: String): Constant<T>(name, null)

class ConstantBlock<T: Any>(
	val nativeClass: NativeClass,
	val constantType: ConstantType<T>,
	val documentation: String,
	vararg val constants: Constant<T>
) {

	private var noPrefix = false

	fun noPrefix() {
		noPrefix = true
	}

	private fun getConstantName(name: String) = if ( noPrefix ) name else "${nativeClass.prefixConstant}$name"

	fun generate(writer: PrintWriter) {
		writer.generateBlock()
	}

	private fun PrintWriter.generateBlock() {
		println(documentation)

		print("\tpublic static final ${constantType.javaType.simpleName}")

		val indent: String
		if ( constants.size() == 1 ) {
			indent = " ";
		} else {
			print('\n')
			indent = "\t\t";
		}

		// Find maximum constant name length
		val alignment = constants.map {
			it.name.length()
		}.fold(0) { left, right ->
			Math.max(left, right)
		}

		constants.forEachWithMore { it, more ->
			if ( more )
				println(',')
			printConstant(it, indent, alignment)
		}
		println(";\n")
	}

	private fun PrintWriter.printConstant(constant: Constant<T>, indent: String, alignment: Int) {
		print("$indent${getConstantName(constant.name)}")
		for ( i in 0..(alignment - constant.name.length() - 1) )
			print(' ')

		print(" = ")
		if ( constant is ConstantExpression )
			print(constant.expression)
		else
			print(constantType.print(constant.value!!))
	}

	val javaDocLinks: String get() {
		val builder = StringBuilder(constants.size() * 32)

		printJavaDocLink(builder, constants[0])
		for ( i in 1..constants.lastIndex ) {
			builder append " "
			printJavaDocLink(builder, constants[i])
		}

		return builder.toString()
	}

	private fun <T: Any> printJavaDocLink(builder: StringBuilder, constant: Constant<T>) {
		builder append nativeClass.className
		builder append '#'
		builder append constant.name
	}

}