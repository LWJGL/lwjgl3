/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.io.PrintWriter

// Extension properties for numeric literals.
inline val Int.b: Byte get() = this.toByte()
inline val Int.s: Short get() = this.toShort()
inline val Long.i: Int get() = this.toInt()

class ConstantType<T: Any>(
	val javaType: Class<T>,
	val print: (T) -> String
)

val ByteConstant = ConstantType(javaClass<Byte>()) { "0x%X".format(it.toInt()) }
val CharConstant = ConstantType(javaClass<Char>()) { "'$it'" }
val ShortConstant = ConstantType(javaClass<Short>()) { "0x%X".format(it.toInt()) }
val IntConstant = ConstantType(javaClass<Int>()) { "0x%X".format(it) }
val LongConstant = ConstantType(javaClass<Long>()) { "0x%XL".format(it) }
val FloatConstant = ConstantType(javaClass<Float>()) { "%sf".format(it) }

val StringConstant = ConstantType(javaClass<String>()) { "\"$it\"" }

open data class Constant<T: Any>(val name: String, val value: T?)
class ConstantExpression<T: Any>(name: String, val expression: String): Constant<T>(name, null)

class ConstantBlock<T: Any>(
	val nativeClass: NativeClass,
	val constantType: ConstantType<T>,
	val documentation: String,
	vararg val constants: Constant<T>
) {

	private var noPrefix = false

	fun noPrefix() {
		javaClass<Int>()
		noPrefix = true
	}

	private fun getConstantName(name: String) = if ( noPrefix ) name else "${nativeClass.prefixConstant}$name"

	fun generate(writer: PrintWriter) {
		writer.generateBlock()
	}

	private fun PrintWriter.generateBlock() {
		println(documentation)

		print("\tpublic static final ${constantType.javaType.getSimpleName()}")

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
		val (name, value) = constant

		print("$indent${getConstantName(name)}")
		for ( i in 0..(alignment - name.length() - 1) )
			print(' ')

		print(" = ")
		if ( constant is ConstantExpression )
			print(constant.expression)
		else
			print(constantType.print(value!!))
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