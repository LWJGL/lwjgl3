/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.io.PrintWriter
import java.util.ArrayList

open class StructMember(
	val nativeType: NativeType,
	val nativeName: String,
	val name: String
) {
	val offsetField: String
		get() = name.toUpperCase()

	fun offsetField(parentField: String): String {
		return if ( parentField.isEmpty() )
			offsetField
		else
			"${parentField}_${offsetField}"
	}

	fun method(parentMember: String): String {
		return if ( parentMember.isEmpty() )
			name
		else
			"$parentMember${name.substring(0, 1).toUpperCase()}${if ( 1 < name.size ) name.substring(1) else ""}"
	}
}

open class StructMemberArray(
	nativeType: PrimitiveType,
	nativeName: String,
	name: String,
	val size: Int
): StructMember(nativeType, nativeName, name)

class StructMemberCharArray(
	nativeType: CharType,
	nativeName: String,
	name: String,
	size: Int,
	val nullTerminated: Boolean
): StructMemberArray(nativeType, nativeName, name, size)

private val ANONYMOUS = "*"

class Struct(
	packageName: String,
	className: String,
	nativeSubPath: String = "",
	/** The native struct name. May be different than className. */
	val structName: String = className,
	/** false: the Struct has an existing declaration. true: a declaration is missing, we need to output one. */
	val virtual: Boolean = false,
	/** true: the Struct is a typedef to a struct declaration. false: it is the struct declaration itself, so we need to prepend the struct keyword. */
	val globalIdentifier: Boolean = true
): GeneratorTargetNative(packageName, className, nativeSubPath) {

	class object {
		private val bufferMethodMap = hashMapOf(
			"byte" to "",
			"char" to "Char",
			"short" to "Short",
			"int" to "Int",
			"long" to "Long",

			"float" to "Float",
			"double" to "Double"
		)
	}

	val nativeName: String
		get() = if ( globalIdentifier ) structName else "struct $structName"

	private val struct = structName.toLowerCase()

	private val members = ArrayList<StructMember>()

	// We allow primitives as members
	fun PrimitiveType.member(nativeName: String, name: String = nativeName) {
		members add StructMember(this, nativeName, name)
	}

	// We allow primitive arrays as members
	fun PrimitiveType.member(nativeName: String, name: String = nativeName, size: Int) {
		members add StructMemberArray(this, nativeName, name, size)
	}

	// TODO: Kotlin bug - Removed nullTerminated = false default. If nullTerminated is omitted on the call site, the above function will be called instead.
	// TODO: Is nullTerminated ever false?
	// We allow character arrays as members
	fun CharType.member(nativeName: String, name: String = nativeName, size: Int, nullTerminated: Boolean) {
		members add StructMemberCharArray(this, nativeName, name, size, nullTerminated)
	}

	// We allow pointers as members
	fun PointerType.member(nativeName: String, name: String = nativeName) {
		members add StructMember(this, nativeName, name)
	}

	val StructMember.isNestedStruct: Boolean
		get() = nativeType is StructType && !nativeType.includesPointer

	val StructMember.isNestedAnonymousStruct: Boolean
		get() = isNestedStruct && (nativeType as StructType).name identityEquals ANONYMOUS

	val StructMember.nestedMembers: ArrayList<StructMember>
		get() = (nativeType as StructType).definition.members

	override fun PrintWriter.generateJava() {
		print(HEADER)
		println("package $packageName;\n")

		println("import java.nio.*;\n")

		println("import org.lwjgl.*;")

		println("import static org.lwjgl.system.Checks.*;")
		println("import static org.lwjgl.system.MemoryUtil.*;\n")

		preamble.printJava(this)

		val documentation = this@Struct.documentation
		if ( documentation != null )
			println(processDocumentation(documentation).toJavaDoc(indentation = ""))
		println("${access.modifier}final class $className {")

		print("""
	/** The struct size in bytes. */
	public static final int SIZEOF;
""")

		// Step 1: Member offset fields

		print("""
	/** The struct member offsets. */
	public static final int
""")
		generateOffsetFields(members)

		// Step 2: Member offset initialization

		print("""
	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(${getMemberCount(members)});

		SIZEOF = offsets(memAddress(offsets));

""")
		generateOffsetInit(members)
		println("\t}\n")

		println("\tprivate $className() {}")

		print("""
	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }
""")

		// Step: 3: Constructors
		generateConstructor(
			"Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values.",
			members, generateConstructorArguments, generateConstructorSetters
		)
		if ( generateAlternativeConstructor(members) ) {
			generateConstructor(
				"Alternative virtual constructor.",
				members, generateAlternativeConstructorArguments, generateAlternativeConstructorSetters, ConstructorMode.ALTER1
			)
			if ( members any { it is StructMemberCharArray || it.nativeType is CharSequenceType } )
				generateConstructor(
					"Alternative virtual constructor.",
					members, generateAlternativeConstructorArguments, generateAlternativeConstructorSetters, ConstructorMode.ALTER2
				)
		}

		println();

		// Step 4: Setters
		generateSetters(members)

		println()

		// Step 5: Getters
		generateGetters(members)

		print("\n}")
	}

	private fun PrintWriter.generateOffsetFields(
		members: List<StructMember>,
		indentation: String = "\t\t",
		parentField: String = "",
		more: Boolean = false
	) {
		members.forEachWithMore(more) { (member, more) ->
			if ( more )
				println(",")

			val field = member.offsetField(parentField)

			print("$indentation$field")

			// Output nested field offsets
			if ( member.isNestedAnonymousStruct )
				generateOffsetFields(member.nestedMembers, "$indentation\t", field, true)
		}
		if ( parentField.isEmpty() )
			println(";")
	}

	private fun getMemberCount(members: List<StructMember>): Int {
		var count = members.size
		for ( member in members.stream().filter { it.isNestedAnonymousStruct } )
			count += getMemberCount(member.nestedMembers) // recursion
		return count
	}

	private fun PrintWriter.generateOffsetInit(
		members: List<StructMember>,
		indentation: String = "\t\t",
		parentField: String = "",
		offset: Int = 0
	): Int {
		var index = offset
		members forEach {
			val field = it.offsetField(parentField)

			println("$indentation$field = offsets.get($index);")
			index++

			// Output nested fields
			if ( it.isNestedAnonymousStruct )
				index = generateOffsetInit(it.nestedMembers, "$indentation\t", field, index) // recursion
		}
		return index
	}

	enum class ConstructorMode {
		NORMAL
		ALTER1
		ALTER2
	}

	private fun PrintWriter.generateConstructor(
		javaDoc: String,
		members: List<StructMember>,
		generateArguments: PrintWriter.(List<StructMember>, String, ConstructorMode, Boolean) -> Unit,
		generateSetters: PrintWriter.(List<StructMember>, String) -> Unit,
		mode: ConstructorMode = ConstructorMode.NORMAL
	) {
		print("""
	/** $javaDoc */
	public static ByteBuffer malloc(
""")
		generateArguments(members, "", mode, false)
		println("""
	) {
		ByteBuffer $struct = malloc();
""")
		generateSetters(members, "")
		print("""
		return $struct;
	}
""")
	}

	private val generateConstructorArguments: PrintWriter.(List<StructMember>, String, ConstructorMode, Boolean) -> Unit = {(members, parentMember, mode, more) ->
		members.forEachWithMore(more) {(it, more): Unit ->
			val method = it.method(parentMember)

			if ( it.isNestedAnonymousStruct ) {
				generateConstructorArguments(it.nestedMembers, method, mode, more)
				return@forEachWithMore
			}

			if ( more )
				println(",")

			print("\t\t")

			val param = if ( parentMember.isEmpty() ) it.name else "${parentMember}_${it.name}"

			when {
				it is StructMemberArray                                                       -> {
					println("long $param,")
					print("\t\tint ${param}Bytes")
				}
				it.nativeType is PointerType || it.nativeType.mapping == PrimitiveMapping.PTR -> {
					print("long $param")
				}
				else                                                                          -> {
					val javaType = it.nativeType.javaMethodType.getSimpleName()
					print(
						if ( javaType.equals("byte") || javaType.equals("short") )
							"int $param"
						else
							"$javaType $param"
					)
				}
			}
		}
	}

	private val generateConstructorSetters: PrintWriter.(List<StructMember>, String) -> Unit = {(members, parentMember) ->
		members.forEach {
			val method = it.method(parentMember)

			if ( it.isNestedAnonymousStruct ) {
				generateConstructorSetters(it.nestedMembers, method)
			} else {
				val param = if ( parentMember.isEmpty() ) it.name else "${parentMember}_${it.name}"

				when {
					it is StructMemberArray -> {
						println("\t\t${method}Set($struct, $param, ${param}Bytes);")
					}
					it.isNestedStruct       -> {
						println("\t\t${method}Set($struct, $param);")
					}
					else                    -> {
						println("\t\t${method}($struct, $param);")
					}
				}
			}
		}
	}

	private val generateAlternativeConstructor: (List<StructMember>) -> Boolean = {(members) ->
		members any {
			if ( it.isNestedAnonymousStruct )
				generateAlternativeConstructor(it.nestedMembers)
			else
				it is StructMemberArray || it.nativeType is CharSequenceType || (it.nativeType is PointerType && it.nativeType.mapping != PointerMapping.OPAQUE_POINTER)
		}
	}

	private val generateAlternativeConstructorArguments: PrintWriter.(List<StructMember>, String, ConstructorMode, Boolean) -> Unit = {(members, parentMember, mode, more) ->
		members.forEachWithMore(more) {(it, more): Unit ->
			val method = it.method(parentMember)

			if ( it.isNestedAnonymousStruct ) {
				generateAlternativeConstructorArguments(it.nestedMembers, method, mode, more)
				return@forEachWithMore
			}

			if ( more )
				println(",")

			print("\t\t")

			val param = if ( parentMember.isEmpty() ) it.name else "${parentMember}_${it.name}"

			when {
				it is StructMemberArray                                                                -> {
					print(
						if ( it is StructMemberCharArray && mode == ConstructorMode.ALTER2 )
							"CharSequence $param"
						else
							"ByteBuffer $param"
					)
				}
				it.nativeType is CharSequenceType && mode == ConstructorMode.ALTER2                    -> {
					print("CharSequence $param")
				}
				it.nativeType is PointerType && it.nativeType.mapping != PointerMapping.OPAQUE_POINTER -> {
					print("ByteBuffer $param")
				}
				else                                                                                   -> {
					val javaType = it.nativeType.javaMethodType.getSimpleName()
					print(
						if ( javaType.equals("byte") || javaType.equals("short") )
							"int $param"
						else
							"$javaType $param"
					)
				}
			}
		}
	}

	private val generateAlternativeConstructorSetters: PrintWriter.(List<StructMember>, String) -> Unit = {(members, parentMember) ->
		members.forEach {
			val method = it.method(parentMember)

			if ( it.isNestedAnonymousStruct ) {
				generateAlternativeConstructorSetters(it.nestedMembers, method)
			} else {
				val param = if ( parentMember.isEmpty() ) it.name else "${parentMember}_${it.name}"
				val postfix = if ( it is StructMemberArray || it.nativeType is CharSequenceType || it.isNestedStruct ) "Set" else "";
				println("\t\t${method}$postfix($struct, $param);")
			}
		}
	}

	private fun getFieldOffset(
		m: StructMember,
		parentStruct: Struct?,
		parentField: String
	) = if ( parentStruct == null )
		m.offsetField
	else if ( parentStruct.className identityEquals ANONYMOUS )
		"${parentField}_${m.offsetField}"
	else {
		val classPrefix = if ( parentField equals parentStruct.className ) // See org.lwjgl.system.windows.MSG, field POINT
			"${parentStruct.packageName}.${parentStruct.className}"
		else
			parentStruct.className
		"$parentField + $classPrefix.${m.offsetField}"
	}

	private fun getNestedStructSizeOf(
		nestedStruct: Struct,
		field: String
	) = if ( field equals nestedStruct.className ) // See org.lwjgl.system.windows.MSG, field POINT
		"${nestedStruct.packageName}.${nestedStruct.className}.SIZEOF"
	else
		"${nestedStruct.className}.SIZEOF"

	private fun PrintWriter.generateSetters(
		members: List<StructMember>,
		parentStruct: Struct? = null,
		parentMember: String = "",
		parentField: String = ""
	) {
		members.forEach {
			val method = it.method(parentMember)
			val field = getFieldOffset(it, parentStruct, parentField)

			val param = it.name

			if ( it.isNestedStruct ) {
				val nestedStruct = (it.nativeType as StructType).definition
				if ( !(nestedStruct.className identityEquals ANONYMOUS) ) {
					println("\tpublic static void ${method}Set(ByteBuffer $struct, long $param) { if ( $param != NULL ) memCopy($param, memAddress($struct) + $field, ${getNestedStructSizeOf(nestedStruct, field)}); }")
					println("\tpublic static void ${method}Set(ByteBuffer $struct, ByteBuffer $param) { ${method}Set($struct, memAddressSafe($param)); }")
				}
				generateSetters(it.nestedMembers, nestedStruct, method, field)
			} else {
				// Setter

				var postfix = if ( it is StructMemberArray ) "Set" else "";
				print("\tpublic static void ${method}$postfix(ByteBuffer $struct, ")
				when {
					it is StructMemberArray                                                       -> {
						println("long $param, int bytes) { memCopy($param, memAddress($struct) + $field, bytes); }")
					}
					it.nativeType is PointerType || it.nativeType.mapping == PrimitiveMapping.PTR -> {
						println("long $param) { PointerBuffer.put($struct, $struct.position() + $field, $param); }")
					}
					else                                                                          -> {
						val javaType = it.nativeType.javaMethodType.getSimpleName()
						val bufferMethod = getBufferMethod(it, javaType)

						println(
							if ( javaType.equals("byte") || javaType.equals("short") )
								"int $param) { $struct.put$bufferMethod($struct.position() + $field, ($javaType)$param); }"
							else
								"$javaType $param) { $struct.put$bufferMethod($struct.position() + $field, $param); }"
						)
					}
				}

				// Alternative setters

				when {
					it is StructMemberArray                                                                -> {
						val array: StructMemberArray = it

						// TODO: We support primitive arrays only for now. Fix this if we ever need struct/pointer arrays
						val mapping = array.nativeType.mapping as PrimitiveMapping
						val bytesPerElement = mapping.bytes

						println("\tpublic static void ${method}Set(ByteBuffer $struct, ByteBuffer $param) {")
						if ( array is StructMemberCharArray ) {
							val charMapping = array.nativeType.mapping as CharMapping
							println("\t\tcheckNT${charMapping.bytes}($param);")
						}
						println("\t\tcheckBufferGT($param, ${array.size} * $bytesPerElement);")
						println("\t\t${method}Set($struct, memAddress($param), $param.remaining());")
						println("\t}")

						if ( array is StructMemberCharArray ) {
							var charMapping = array.nativeType.mapping as CharMapping
							println("\tpublic static void ${method}Set(ByteBuffer $struct, CharSequence $param) { ByteBuffer buffer = memEncode${charMapping.charset}($param, ${array.nullTerminated}); ${method}Set($struct, memAddress(buffer), buffer.capacity()); }")
						}
					}
					it.nativeType is CharSequenceType                                                      -> {
						print("\tpublic static void ${method}Set(ByteBuffer $struct, ByteBuffer $param) { ")
						val buffer = if ( it.nativeType.nullTerminated )
							"checkNT${it.nativeType.charMapping.bytes}($param)"
						else
							param
						println("${method}($struct, $param == null ? NULL : memAddress($buffer)); }")
						println("\tpublic static void ${method}Set(ByteBuffer $struct, CharSequence $param) { ByteBuffer ${param}Encoded; ${method}($struct, $param == null ? NULL : memAddress(${param}Encoded = memEncode${it.nativeType.charMapping.charset}($param))); }")
					}
					it.nativeType is PointerType && it.nativeType.mapping != PointerMapping.OPAQUE_POINTER -> {
						println("\tpublic static void ${method}(ByteBuffer $struct, ByteBuffer $param) { ${method}($struct, memAddress($param)); }")
					}
				}
			}
		}
	}

	private fun PrintWriter.generateGetters(
		members: List<StructMember>,
		parentStruct: Struct? = null,
		parentMember: String = "",
		parentField: String = ""
	) {
		members.forEach {
			val method = it.method(parentMember)
			val field = getFieldOffset(it, parentStruct, parentField)

			if ( it.isNestedStruct ) {
				val nestedStruct = (it.nativeType as StructType).definition
				if ( !(nestedStruct.className identityEquals ANONYMOUS) ) {
					val param = it.name
					val SIZEOF = getNestedStructSizeOf(nestedStruct, field)
					println("\tpublic static void ${method}Get(ByteBuffer $struct, long $param) { memCopy(memAddress($struct) + $field, $param, $SIZEOF); }")
					println("\tpublic static void ${method}Get(ByteBuffer $struct, ByteBuffer $param) { checkBuffer($param, $SIZEOF); ${method}Get($struct, memAddress($param)); }")
				}
				generateGetters(it.nestedMembers, nestedStruct, method, field)
			} else {
				// Getter

				print("\tpublic static ")

				when {
					it is StructMemberArray                                                       -> {
						val param = it.name
						println("void ${method}Get(ByteBuffer $struct, long $param, int bytes) {")
						println("\t\tmemCopy(memAddress($struct) + $field, $param, bytes);")
						println("\t}")
					}
					it.nativeType is PointerType || it.nativeType.mapping == PrimitiveMapping.PTR -> {
						println("long ${method}(ByteBuffer $struct) { return PointerBuffer.get($struct, $struct.position() + $field); }")
					}
					else                                                                          -> {
						val javaType = it.nativeType.javaMethodType.getSimpleName()
						val bufferMethod = getBufferMethod(it, javaType)

						val convertToInt = javaType.equals("byte") || javaType.equals("short");

						print(
							if ( convertToInt )
								"int ${method}(ByteBuffer $struct) { return $struct.get$bufferMethod("
							else
								"$javaType ${method}(ByteBuffer $struct) { return $struct.get$bufferMethod("
						)

						print("$struct.position() + $field)")
						if ( convertToInt && it.nativeType is IntegerType && it.nativeType.unsigned ) {
							print(" & 0x")
							for ( i in 1..(it.nativeType.mapping as PrimitiveMapping).bytes )
								print("FF")
						}
						println("; }")
					}
				}

				// Alternative getters

				when {
					it is StructMemberArray                                                                -> {
						val array: StructMemberArray = it

						// TODO: We support primitive arrays only for now. Fix this if we ever need struct/pointer arrays
						val mapping = (array.nativeType as PrimitiveType).mapping as PrimitiveMapping
						val bytesPerElement = mapping.bytes

						val param = array.name

						println("\tpublic static void ${method}Get(ByteBuffer $struct, ByteBuffer $param) {")
						println("\t\tcheckBufferGT($param, ${array.size} * $bytesPerElement);")
						println("\t\t${method}Get($struct, memAddress($param), $param.remaining());")
						println("\t}")

						if ( array is StructMemberCharArray ) {
							val charMapping = array.nativeType.mapping as CharMapping
							if ( array.nullTerminated ) {
								println("\tpublic static String ${method}Gets(ByteBuffer $struct) { return memDecode${charMapping.charset}($struct, memStrLen${charMapping.bytes}($struct, $field), $field); }")
								println("\tpublic static String ${method}Gets(ByteBuffer $struct, int size) { return memDecode${charMapping.charset}($struct, size, $field); }")
							} else
								println("\tpublic static String ${method}Gets(ByteBuffer $struct) { return memDecode${charMapping.charset}($struct, ${array.size}, $field); }")
						}
					}
					it.nativeType is CharSequenceType                                                      -> {
						if ( it.nativeType.nullTerminated ) {
							println("\tpublic static ByteBuffer ${method}Getb(ByteBuffer $struct) { long address = ${method}($struct); return address == NULL ? null : memByteBufferNT${it.nativeType.charMapping.bytes}(address); }")
							println("\tpublic static String ${method}Gets(ByteBuffer $struct) { long address = ${method}($struct); return address == NULL ? null : memDecode${it.nativeType.charMapping.charset}(memByteBufferNT${it.nativeType.charMapping.bytes}(address)); }")
						} else {
							println("\tpublic static ByteBuffer ${method}Getb(ByteBuffer $struct, int size) { long address = ${method}($struct); return address == NULL ? null : memByteBuffer(address, size); }")
							println("\tpublic static String ${method}Gets(ByteBuffer $struct, int size) { long address = ${method}($struct); return address == NULL ? null : memDecode${it.nativeType.charMapping.charset}(memByteBuffer(address, size)); }")
						}
					}
					it.nativeType is StructType                                                            -> {
						println("\tpublic static ByteBuffer ${method}b(ByteBuffer $struct) { return memByteBuffer(${method}($struct), ${it.nativeType.definition.className}.SIZEOF); }")
					}
					it.nativeType is PointerType && it.nativeType.mapping != PointerMapping.OPAQUE_POINTER -> {
						println("\tpublic static ByteBuffer ${method}(ByteBuffer $struct, int size) { long address = ${method}($struct); return address == NULL ? null : memByteBuffer(address, size); }")
					}
				}
			}
		}
	}

	private fun getBufferMethod(member: StructMember, javaType: String): String {
		val bufferMethod = bufferMethodMap[javaType]
		if ( bufferMethod == null )
			throw UnsupportedOperationException("Unsupported struct member java type: $className.${member.name} ($javaType)")

		return bufferMethod
	}

	override fun PrintWriter.generateNative() {
		print(HEADER)
		println("#include \"common_tools.h\"")
		println("#include <stddef.h>")

		preamble.printNative(this)

		println("\nEXTERN_C_EXIT\n")

		println("JNIEXPORT jint JNICALL Java_${nativeFileNameJNI}_offsets(JNIEnv *$JNIENV, jclass clazz, jlong bufferAddress) {")
		println("\tjint *buffer = (jint *)(intptr_t)bufferAddress;\n")

		println("\tUNUSED_PARAMS($JNIENV, clazz)\n")

		if ( virtual ) {
			// NOTE: Assumes a plain struct definition (no nested structs, no unions)
			println("\ttypedef struct $structName {")
			for ( m in members ) {
				print("\t\t${m.nativeType.name}")
				if ( m.nativeType is PointerType && !m.nativeType.includesPointer ) {
					if ( !m.nativeType.name.endsWith('*') )
						print(' ')
					print('*')
				}
				println(" ${m.nativeName};")
			}
			println("\t} ${structName};\n")
		}

		generateNativeMembers(members)

		println("\n\treturn sizeof($nativeName);")
		println("}")

		println("\nEXTERN_C_EXIT")
	}

	private fun PrintWriter.generateNativeMembers(members: List<StructMember>, offset: Int = 0, prefix: String = ""): Int {
		var index = offset
		members forEach {
			println("\tbuffer[$index] = (jint)(offsetof($nativeName, $prefix${it.nativeName}));")
			index++

			if ( it.isNestedStruct ) {
				// Output anonymous inner structs
				val structType = it.nativeType as StructType
				if ( structType.name identityEquals ANONYMOUS )
					index = generateNativeMembers(structType.definition.members, index, prefix = "${it.nativeName}.") // recursion
			}
		}
		return index
	}

}

fun struct(packageName: String, className: String, nativeSubPath: String = "", structName: String = className, virtual: Boolean = false, globalIdentifier: Boolean = true, init: Struct.() -> Unit): Struct {
	val struct = Struct(packageName, className, nativeSubPath, structName, virtual, globalIdentifier)
	struct.init()
	Generator.register(struct)
	return struct
}

/** Anonymous member struct definition. Mostly useful for union of structs. */
fun Struct.struct(init: Struct.() -> Unit): StructType {
	val struct = Struct(ANONYMOUS, ANONYMOUS)
	struct.init()
	return StructType(struct)
}