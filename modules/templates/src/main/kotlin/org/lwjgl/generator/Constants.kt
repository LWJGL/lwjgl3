/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.io.PrintWriter
import java.util.*
import kotlin.reflect.KClass

// Extension properties for numeric literals.
val Int.b: Byte get() = this.toByte()
val Int.s: Short get() = this.toShort()
val Long.i: Int get() = this.toInt()

open class ConstantType<T : Any>(
	val javaType: String,
	val print: (T) -> String
) {
	constructor(
		type: KClass<T>,
		print: (T) -> String
	) : this(type.java.simpleName, print)
}

val ByteConstant = ConstantType(Byte::class) {
	val i = it.toInt() and 0xFF
	"0x%X".format(i).let {
		if ( i < 0x80 ) it else "(byte)$it"
	}
}
val CharConstant = ConstantType(Char::class) { "'$it'" }
val ShortConstant = ConstantType(Short::class) {
	val i = it.toInt() and 0xFFFF
	"0x%X".format(i).let {
		if ( i < 0x8000 ) it else "(short)$it"
	}
}
val IntConstant = ConstantType(Int::class) { "0x%X".format(it) }
val LongConstant = ConstantType(Long::class) { "0x%XL".format(it) }
val FloatConstant = ConstantType(Float::class) { "%sf".format(it) }

val StringConstant = ConstantType(String::class) { "\"$it\"" }

class CustomConstant(javaType: String) : ConstantType<String>(javaType, {
	throw UnsupportedOperationException("Custom constant types must use expressions only")
})

open class EnumValue(
	val documentation: String? = null,
	val value: Int? = null
)

class EnumValueExpression(
	documentation: String? = null,
	val expression: String
) : EnumValue(documentation, null)

val EnumConstant = ConstantType(EnumValue::class, { "0x%X".format(it) })

open class Constant<T : Any>(val name: String, val value: T?)
class ConstantExpression<T : Any>(name: String, val expression: String) : Constant<T>(name, null)

class ConstantBlock<T : Any>(
	val nativeClass: NativeClass,
	val constantType: ConstantType<T>,
	val documentation: String,
	vararg val constants: Constant<out T>
) {

	private var noPrefix = false

	fun noPrefix() {
		noPrefix = true
	}

	private fun getConstantName(name: String) = if ( noPrefix ) name else "${nativeClass.prefixConstant}$name"

	fun generate(writer: PrintWriter) {
		if ( constantType === EnumConstant ) {
			// Increment/update the current enum value while iterating the enum constants.
			// Constants without documentation are added to the root block.
			// Constants with documentation go to their own block.

			val rootBlock = ArrayList<Constant<Int>>()
			val enumBlocks = ArrayList<ConstantBlock<Int>>()

			var value = 0
			for (c in constants) {
				if ( c is ConstantExpression ) {
					@Suppress("CAST_NEVER_SUCCEEDS")
					rootBlock.add(c as ConstantExpression<Int>)
					continue
				}

				val ev = c.value as EnumValue
				if ( ev.value != null )
					value = ev.value

				Constant(c.name, value++).let {
					if ( ev.documentation == null )
						rootBlock.add(it)
					else
						enumBlocks.add(ConstantBlock(nativeClass, IntConstant, ev.documentation, it))
				}
			}

			if ( rootBlock.isNotEmpty() )
				ConstantBlock(nativeClass, IntConstant, this@ConstantBlock.documentation, *rootBlock.toTypedArray()).generate(writer)

			for (b in enumBlocks)
				b.generate(writer)
		} else
			writer.generateBlock()
	}

	private fun PrintWriter.generateBlock() {
		println();
		println(documentation)

		print("\tpublic static final ${constantType.javaType}")

		val indent: String
		if ( constants.size == 1 ) {
			indent = " ";
		} else {
			print('\n')
			indent = "\t\t";
		}

		// Find maximum constant name length
		val alignment = constants.map {
			it.name.length
		}.fold(0) { left, right ->
			Math.max(left, right)
		}

		constants.forEachWithMore { it, more ->
			if ( more )
				println(',')
			printConstant(it, indent, alignment)
		}
		println(";")
	}

	private fun PrintWriter.printConstant(constant: Constant<out T>, indent: String, alignment: Int) {
		print("$indent${getConstantName(constant.name)}")
		for (i in 0..(alignment - constant.name.length - 1))
			print(' ')

		print(" = ")
		if ( constant is ConstantExpression )
			print(constant.expression)
		else
			print(constantType.print(constant.value!!))
	}

	val javaDocLinks: String get() {
		val builder = StringBuilder(constants.size * 32)

		printJavaDocLink(builder, constants[0])
		for (i in 1..constants.lastIndex) {
			builder.append(" ")
			printJavaDocLink(builder, constants[i])
		}

		return builder.toString()
	}

	private fun <T : Any> printJavaDocLink(builder: StringBuilder, constant: Constant<T>) {
		builder.append(nativeClass.className)
		builder.append('#')
		builder.append(constant.name)
	}

}