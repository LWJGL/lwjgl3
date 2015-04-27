/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.io.PrintWriter
import java.util.ArrayList
import java.util.regex.Pattern

// TODO: Add support for javadoc
open class StructMember(
	val nativeType: NativeType,
	val nativeName: String,
	val name: String
) {
	companion object {
		val UNDERSCORE = Pattern.compile("_")
	}

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
			"$parentMember${name.upperCaseFirst}"
	}

	fun javaMethod(parentMember: String): String = UNDERSCORE.split(method(parentMember)).map { it.upperCaseFirst }.join("")
}

open class StructMemberArray(
	nativeType: NativeType,
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

enum class StructIdentifierType(val keyword: String) {
	/**
	 * typedef struct Foo { ... } Bar
	 * or
	 * typedef union Foo { ... } Bar
	 */
	ALIAS: StructIdentifierType("")
	/** struct Foo { ... } */
	STRUCT: StructIdentifierType("struct ")
	/** union Foo { ... } */
	UNION: StructIdentifierType("union ")
}

class Struct(
	packageName: String,
	className: String,
	nativeSubPath: String = "",
	/** The native struct name. May be different than className. */
	val structName: String = className,
	val identifierType: StructIdentifierType = StructIdentifierType.ALIAS,
	/** when true, a declaration is missing, we need to output one. */
	val virtual: Boolean = false,
	/** when false, malloc methods will not be generated. */
	val malloc: Boolean = true
): GeneratorTargetNative(packageName, className, nativeSubPath) {

	companion object {
		private val bufferMethodMap = hashMapOf(
			"boolean" to "",

			"byte" to "",
			"char" to "Char",
			"short" to "Short",
			"int" to "Int",
			"long" to "Long",

			"float" to "Float",
			"double" to "Double"
		)

		private val BUFFER_LEN_PARAM = "byteLen"
	}

	val nativeType: StructType get() = StructType(this)
	val nativeName: String get() = "${identifierType.keyword}$structName"

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

	// We allow struct arrays
	fun StructType.member(nativeName: String, name: String = nativeName, size: Int) {
		members add StructMemberArray(this, nativeName, name, size)
	}

	val StructMember.isNestedStruct: Boolean
		get() = nativeType is StructType && !nativeType.includesPointer && this !is StructMemberArray

	val StructMember.isNestedAnonymousStruct: Boolean
		get() = isNestedStruct && (nativeType as StructType).name == ANONYMOUS

	val StructMember.nestedMembers: ArrayList<StructMember>
		get() = (nativeType as StructType).definition.members

	// Make parameter lowercase if it's all uppercase and conflicts with the offset field
	fun String.toParam(field: String) = if ( this != field ) this else this.toLowerCase()

	override fun PrintWriter.generateJava() {
		print(HEADER)
		println("package $packageName;\n")

		println("import java.nio.*;\n")

		println("import org.lwjgl.*;")

		println("import static org.lwjgl.system.Checks.*;")
		println("import static org.lwjgl.system.MemoryUtil.*;")

		println();
		preamble.printJava(this)

		val documentation = super.documentation
		if ( documentation != null )
			println(processDocumentation(documentation).toJavaDoc(indentation = ""))
		println("${access.modifier}final class $className implements Pointer {")

		print("""
	/** The struct size in bytes. */
	public static final int SIZEOF;
""")

		if ( members.isNotEmpty() ) {
			// Member offset fields

			print("""
	/** The struct member offsets. */
	public static final int
""")
			generateOffsetFields(members)

			// Member offset initialization

			print("""
	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(${getMemberCount(members)});

		SIZEOF = offsets(memAddress(offsets));

""")
			generateOffsetInit(members)
			println("\t}")
		} else {
			print("""
	static {
		SIZEOF = offsets();
	}
""")
		}

		print("""
	private final ByteBuffer struct;
""")

		// Constructors

		if ( malloc )
			print("""
	public $className() {
		this(malloc());
	}
""")

		print("""
	public $className(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);

		this.struct = struct;
	}

	public ByteBuffer buffer() {
		return struct;
	}

	@Override
	public long getPointer() {
		return memAddress(struct);
	}
""")

		if ( members.isNotEmpty() ) {
			println()
			generateSetters(members)

			println()
			generateGetters(members)
		}

		print("""
	// -----------------------------------

	private static native int offsets(${if ( members.isNotEmpty() ) "long buffer" else ""});
""")
		if ( malloc )
			print("""
	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }
""")

		if ( members.isNotEmpty() ) {
			if ( malloc ) {
				// Virtual constructors
				if ( generateAlternativeConstructor(members) ) {
					generateConstructor(
						"Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values.",
						members, generateAlternativeConstructorArguments, generateAlternativeConstructorSetters, ConstructorMode.ALTER1
					)
					if ( members any { it is StructMemberCharArray } )
						generateConstructor(
							"Alternative virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values.",
							members, generateAlternativeConstructorArguments, generateAlternativeConstructorSetters, ConstructorMode.ALTER2
						)
				} else {
					generateConstructor(
						"Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values.",
						members, generateConstructorArguments, generateConstructorSetters
					)
				}

				println();
			}

			generateStaticSetters(members)

			println()

			generateStaticGetters(members)
		}

		print("\n}")
	}

	private fun PrintWriter.generateOffsetFields(
		members: List<StructMember>,
		indentation: String = "\t\t",
		parentField: String = "",
		more: Boolean = false
	) {
		members.forEachWithMore(more) { member, more ->
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
		var count = members.size()
		for ( member in members.sequence().filter { it.isNestedAnonymousStruct } )
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
		generateSetters: PrintWriter.(List<StructMember>, String, ConstructorMode) -> Unit,
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
		generateSetters(members, "", mode)
		print("""
		return $struct;
	}
""")
	}

	private val generateConstructorArguments: PrintWriter.(List<StructMember>, String, ConstructorMode, Boolean) -> Unit = { members, parentMember, mode, more ->
		members.forEachWithMore(more) { it, more ->
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
				it is StructMemberArray                                                        -> {
					println("long $param,")
					print("\t\tint ${param}Bytes")
				}
				it.nativeType is PointerType || it.nativeType.mapping === PrimitiveMapping.PTR -> {
					print("long $param")
				}
				else                                                                           -> {
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

	private val generateConstructorSetters: PrintWriter.(List<StructMember>, String, ConstructorMode) -> Unit = { members, parentMember, mode ->
		members.forEach {
			val method = it.method(parentMember)

			if ( it.isNestedAnonymousStruct ) {
				generateConstructorSetters(it.nestedMembers, method, mode)
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

	private val generateAlternativeConstructor: (List<StructMember>) -> Boolean = { members ->
		members any {
			if ( it.isNestedAnonymousStruct )
				generateAlternativeConstructor(it.nestedMembers)
			else
				it is StructMemberArray || (it.nativeType is PointerType && it.nativeType.mapping != PointerMapping.OPAQUE_POINTER)
		}
	}

	private val generateAlternativeConstructorArguments: PrintWriter.(List<StructMember>, String, ConstructorMode, Boolean) -> Unit = { members, parentMember, mode, more ->
		members.forEachWithMore(more) { it, more ->
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
				it is StructMemberArray                                                                 -> {
					print(
						if ( it is StructMemberCharArray && mode === ConstructorMode.ALTER2 )
							"CharSequence $param"
						else
							"ByteBuffer $param"
					)
				}
				it.nativeType is PointerType && it.nativeType.mapping !== PointerMapping.OPAQUE_POINTER -> {
					print("ByteBuffer $param")
				}
				else                                                                                    -> {
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

	private val generateAlternativeConstructorSetters: PrintWriter.(List<StructMember>, String, ConstructorMode) -> Unit = { members, parentMember, mode ->
		members.forEach {
			val method = it.method(parentMember)

			if ( it.isNestedAnonymousStruct ) {
				generateAlternativeConstructorSetters(it.nestedMembers, method, mode)
			} else {
				val param = if ( parentMember.isEmpty() ) it.name else "${parentMember}_${it.name}"
				val postfix = if ( (it is StructMemberArray && (mode === ConstructorMode.ALTER1 || it !is StructMemberCharArray)) || it.isNestedStruct ) "Set" else "";
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
	else if ( parentStruct.className === ANONYMOUS )
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

	private fun PrintWriter.generateStaticSetters(
		members: List<StructMember>,
		parentStruct: Struct? = null,
		parentMember: String = "",
		parentField: String = ""
	) {
		members.forEach {
			val method = it.method(parentMember)
			val field = getFieldOffset(it, parentStruct, parentField)

			val param = it.name.toParam(field)

			if ( it.isNestedStruct ) {
				val nestedStruct = (it.nativeType as StructType).definition
				if ( !(nestedStruct.className === ANONYMOUS) )
					println("\tpublic static void ${method}Set(ByteBuffer $struct, ByteBuffer $param) { if ( $param != null ) memCopy(memAddress($param), memAddress($struct) + $field, ${getNestedStructSizeOf(nestedStruct, field)}); }")
				generateStaticSetters(it.nestedMembers, nestedStruct, method, field)
			} else {
				// Setter

				if ( it !is StructMemberArray ) {
					var postfix = if ( it is StructMemberArray ) "Set" else "";
					print("\tpublic static void ${method}$postfix(ByteBuffer $struct, ")

					if ( it.nativeType is PointerType || it.nativeType.mapping === PrimitiveMapping.PTR ) {
						println("long $param) { PointerBuffer.put($struct, $struct.position() + $field, $param); }")
					} else {
						val javaType = it.nativeType.javaMethodType.getSimpleName()
						val bufferMethod = getBufferMethod(it, javaType)

						println(
							if ( javaType.equals("byte") || javaType.equals("short") )
								"int $param) { $struct.put$bufferMethod($struct.position() + $field, ($javaType)$param); }"
							else
								"$javaType $param) { $struct.put$bufferMethod($struct.position() + $field, $param${if ( javaType == "boolean" ) " ? (byte)1 : (byte)0" else ""}); }"
						)
					}
				}

				// Alternative setters

				when {
					it is StructMemberArray                                                                -> {
						val array: StructMemberArray = it

						if ( array.nativeType is PrimitiveType ) {
							val mapping = array.nativeType.mapping as PrimitiveMapping
							val bytesPerElement = if ( mapping === PrimitiveMapping.PTR ) "POINTER_SIZE" else mapping.bytes

							println("\tpublic static void ${method}Set(ByteBuffer $struct, ByteBuffer $param) {")
							println("\t\tif ( LWJGLUtil.CHECKS ) {")
							if ( array is StructMemberCharArray ) {
								val charMapping = array.nativeType.mapping as CharMapping
								println("\t\t\tcheckNT${charMapping.bytes}($param);")
							}
							println("\t\t\tcheckBufferGT($param, ${array.size} * $bytesPerElement);")
							println("\t\t}")
							println("\t\tmemCopy(memAddress($param), memAddress($struct) + $field, $param.remaining());")
							println("\t}")

							if ( array is StructMemberCharArray ) {
								var charMapping = array.nativeType.mapping as CharMapping
								println("\tpublic static void ${method}(ByteBuffer $struct, CharSequence $param) { memEncode${charMapping.charset}($param, ${array.nullTerminated}, $struct, $field); }")
							} else /*if ( bytesPerElement != 1 )*/ {
								print("\tpublic static void ${method}(ByteBuffer $struct, int index, ${mapping.javaMethodType} $param) { ")
								print(
									when ( mapping ) {
										PrimitiveMapping.PTR  -> "PointerBuffer.put($struct, $field + index * POINTER_SIZE, $param);"
										PrimitiveMapping.BYTE -> "$struct.put($field + index, $param);"
										else                  -> "$struct.put${mapping.javaMethodType.getSimpleName().upperCaseFirst}($field + index * $bytesPerElement, $param);"
									}
								)
								println(" }")
							}
						} else {
							val nestedStruct = (array.nativeType as StructType).definition
							val SIZEOF = getNestedStructSizeOf(nestedStruct, field)

							println("\tpublic static void ${method}Set(ByteBuffer $struct, ByteBuffer $param) {")
							println("\t\tif ( LWJGLUtil.CHECKS ) checkBufferGT($param, ${array.size} * $SIZEOF);")
							println("\t\tmemCopy(memAddress($param), memAddress($struct) + $field, $param.remaining());")
							println("\t}")

							println("\tpublic static void ${method}Set(ByteBuffer $struct, ByteBuffer $param, int index) {")
							println("\t\tif ( LWJGLUtil.CHECKS ) checkBufferGT($param, $SIZEOF);")
							println("\t\tmemCopy(memAddress($param), memAddress($struct) + $field + index * ${nestedStruct.className}.SIZEOF, $param.remaining());")
							println("\t}")
						}
					}
					it.nativeType is CharSequenceType                                                      -> {
						print("\tpublic static void ${method}(ByteBuffer $struct, ByteBuffer $param) { ")
						if ( it.nativeType.nullTerminated )
							print("if ( LWJGLUtil.CHECKS && $param != null ) checkNT${it.nativeType.charMapping.bytes}($param); ")
						println("${method}($struct, memAddressSafe($param)); }")
					}
					it.nativeType is PointerType && it.nativeType.mapping != PointerMapping.OPAQUE_POINTER -> {
						println("\tpublic static void ${method}(ByteBuffer $struct, ByteBuffer $param) { ${method}($struct, memAddressSafe($param)); }")
					}
				}
			}
		}
	}

	private fun PrintWriter.generateSetters(
		members: List<StructMember>,
		parentStruct: Struct? = null,
		parentMember: String = "",
		parentField: String = ""
	) {
		members.forEach {
			val method = it.method(parentMember)
			val setMethod = "set${it.javaMethod(parentMember)}"
			val field = getFieldOffset(it, parentStruct, parentField)

			val param = it.name.toParam(field)

			if ( it.isNestedStruct ) {
				val nestedStruct = (it.nativeType as StructType).definition
				if ( !(nestedStruct.className === ANONYMOUS) )
					println("\tpublic void $setMethod(ByteBuffer $param) { ${method}Set(struct, $param); }")
				generateSetters(it.nestedMembers, nestedStruct, method, field)
			} else {
				// Setter

				if ( it !is StructMemberArray ) {
					print("\tpublic void ${setMethod}(")

					if (it.nativeType is PointerType || it.nativeType.mapping === PrimitiveMapping.PTR ) {
						println("long $param) { $method(struct, $param); }")
					} else {
						val javaType = it.nativeType.javaMethodType.getSimpleName()
						println(
							if ( javaType.equals("byte") || javaType.equals("short") )
								"int $param) { $method(struct, $param); }"
							else
								"$javaType $param) { $method(struct, $param); }"
						)
					}
				}

				// Alternative setters

				if ( it.nativeType is CharSequenceType ) {
					println("\tpublic void ${setMethod}(ByteBuffer $param) { ${method}(struct, $param); }")
				} else if ( it is StructMemberArray ) {
					println("\tpublic void ${setMethod}(ByteBuffer $param) { ${method}Set(struct, $param); }")
					if ( it is StructMemberCharArray )
						println("\tpublic void ${setMethod}(CharSequence $param) { ${method}(struct, $param); }")
					else if ( it.nativeType is PrimitiveType )
						println("\tpublic void ${setMethod}(int index, ${it.nativeType.mapping.javaMethodType} $param) { ${method}(struct, index, $param); }")
					else if ( it.nativeType is StructType )
						println("\tpublic void ${setMethod}(ByteBuffer $param, int index) { ${method}Set(struct, $param, index); }")
				} else if ( it.nativeType is PointerType && it.nativeType.mapping != PointerMapping.OPAQUE_POINTER )
					println("\tpublic void ${setMethod}(ByteBuffer $param) { ${method}(struct, $param); }")
			}
		}
	}

	private fun PrintWriter.generateStaticGetters(
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
				if ( !(nestedStruct.className === ANONYMOUS) ) {
					val param = it.name.toParam(field)
					val SIZEOF = getNestedStructSizeOf(nestedStruct, field)
					println("\tpublic static void ${method}Get(ByteBuffer $struct, ByteBuffer $param) { if ( LWJGLUtil.CHECKS ) checkBuffer($param, $SIZEOF); memCopy(memAddress($struct) + $field, memAddress($param), $SIZEOF); }")
				}
				generateStaticGetters(it.nestedMembers, nestedStruct, method, field)
			} else {
				// Getter

				if ( it !is StructMemberArray ) {
					print("\tpublic static ")

					if ( it.nativeType is PointerType || it.nativeType.mapping === PrimitiveMapping.PTR ) {
						println("long ${method}(ByteBuffer $struct) { return PointerBuffer.get($struct, $struct.position() + $field); }")
					} else {
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
						if ( it.nativeType is IntegerType ) {
							if ( convertToInt && it.nativeType.unsigned ) {
								print(" & 0x")
								for ( i in 1..(it.nativeType.mapping as PrimitiveMapping).bytes )
									print("FF")
							} else if ( it.nativeType.mapping === PrimitiveMapping.BOOLEAN )
								print(" != 0")
						}
						println("; }")
					}
				}

				// Alternative getters

				when {
					it is StructMemberArray                              -> {
						val array: StructMemberArray = it
						val param = array.name.toParam(field)

						if ( it.nativeType is PrimitiveType ) {
							// TODO: We support primitive arrays only for now. Fix this if we ever need struct/pointer arrays
							val mapping = (array.nativeType as PrimitiveType).mapping as PrimitiveMapping
							val bytesPerElement = mapping.bytes

							println("\tpublic static void ${method}Get(ByteBuffer $struct, ByteBuffer $param) {")
							println("\t\tif ( LWJGLUtil.CHECKS ) checkBufferGT($param, ${array.size} * $bytesPerElement);")
							println("\t\tmemCopy(memAddress($struct) + $field, memAddress($param), $param.remaining());")
							println("\t}")

							if ( array is StructMemberCharArray ) {
								val charMapping = array.nativeType.mapping as CharMapping
								if ( array.nullTerminated ) {
									println("\tpublic static String ${method}String(ByteBuffer $struct) { return memDecode${charMapping.charset}($struct, memStrLen${charMapping.bytes}($struct, $field), $field); }")
									println("\tpublic static String ${method}String(ByteBuffer $struct, int $BUFFER_LEN_PARAM) { return memDecode${charMapping.charset}($struct, $BUFFER_LEN_PARAM, $field); }")
								} else
									println("\tpublic static String ${method}String(ByteBuffer $struct) { return memDecode${charMapping.charset}($struct, ${array.size}, $field); }")
							} else {
								val javaType = mapping.javaMethodType.getSimpleName()
								val bufferMethod = getBufferMethod(it, javaType)

								println("\tpublic static $javaType ${method}(ByteBuffer $struct, int index) {")
								println("\t\treturn $struct.get${bufferMethod}($field + index * $bytesPerElement);")
								println("\t}")
							}
						} else {
							val nestedStruct = (array.nativeType as StructType).definition
							val SIZEOF = getNestedStructSizeOf(nestedStruct, field)

							println("\tpublic static void ${method}Get(ByteBuffer $struct, ByteBuffer $param) {")
							println("\t\tif ( LWJGLUtil.CHECKS ) checkBufferGT($param, ${array.size} * $SIZEOF);")
							println("\t\tmemCopy(memAddress($struct) + $field, memAddress($param), $param.remaining());")
							println("\t}")

							println("\tpublic static void ${method}Get(ByteBuffer $struct, ByteBuffer $param, int index) {")
							println("\t\tif ( LWJGLUtil.CHECKS ) checkBufferGT($param, $SIZEOF);")
							println("\t\tmemCopy(memAddress($struct) + $field + index * $SIZEOF, memAddress($param), $param.remaining());")
							println("\t}")
						}
					}
					it.nativeType is CharSequenceType                                                      -> {
						if ( it.nativeType.nullTerminated ) {
							println("\tpublic static ByteBuffer ${method}Buffer(ByteBuffer $struct) { return memByteBufferNT${it.nativeType.charMapping.bytes}(${method}($struct)); }")
							println("\tpublic static String ${method}String(ByteBuffer $struct) { return memDecode${it.nativeType.charMapping.charset}(${method}($struct)); }")
						} else {
							println("\tpublic static ByteBuffer ${method}Buffer(ByteBuffer $struct, int $BUFFER_LEN_PARAM) { return memByteBuffer(${method}($struct), $BUFFER_LEN_PARAM); }")
							println("\tpublic static String ${method}String(ByteBuffer $struct, int $BUFFER_LEN_PARAM) { return memDecode${it.nativeType.charMapping.charset}(memByteBuffer(${method}($struct), $BUFFER_LEN_PARAM)); }")
						}
					}
					it.nativeType is StructType                                                            -> {
						println("\tpublic static ByteBuffer ${method}Buffer(ByteBuffer $struct) { return memByteBuffer(${method}($struct), ${it.nativeType.definition.className}.SIZEOF); }")
					}
					it.nativeType is PointerType && it.nativeType.mapping != PointerMapping.OPAQUE_POINTER -> {
						println("\tpublic static ByteBuffer ${method}(ByteBuffer $struct, int $BUFFER_LEN_PARAM) { return memByteBuffer(${method}($struct), $BUFFER_LEN_PARAM); }")
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
			val getMethod = "get${it.javaMethod(parentMember)}"
			val field = getFieldOffset(it, parentStruct, parentField)

			if ( it.isNestedStruct ) {
				val nestedStruct = (it.nativeType as StructType).definition
				if ( !(nestedStruct.className === ANONYMOUS) ) {
					val param = it.name.toParam(field)
					println("\tpublic void ${getMethod}(ByteBuffer $param) { ${method}Get(struct, $param); }")
				}
				generateGetters(it.nestedMembers, nestedStruct, method, field)
			} else {
				// Getter

				if ( it !is StructMemberArray ) {
					print("\tpublic ")

					if ( it.nativeType is PointerType || it.nativeType.mapping === PrimitiveMapping.PTR ) {
						println("long ${getMethod}() { return $method(struct); }")
					} else {
						val javaType = it.nativeType.javaMethodType.getSimpleName()

						val convertToInt = javaType.equals("byte") || javaType.equals("short");

						println(
							if ( convertToInt )
								"int ${getMethod}() { return ${method}(struct); }"
							else
								"$javaType ${getMethod}() { return ${method}(struct); }"
						)
					}
				}

				// Alternative getters

				when {
					it is StructMemberArray                                                                -> {
						val array: StructMemberArray = it
						val param = it.name.toParam(field)

						println("\tpublic void ${getMethod}(ByteBuffer $param) { ${method}Get(struct, $param); }")
						if ( array is StructMemberCharArray ) {
							println("\tpublic String ${getMethod}String() { return ${method}String(struct); }")
							if ( array.nullTerminated )
								println("\tpublic String ${getMethod}String(int $BUFFER_LEN_PARAM) { return ${method}String(struct, $BUFFER_LEN_PARAM); }")
						} else if ( array.nativeType is StructType ) {
							println("\tpublic void ${getMethod}(ByteBuffer $param, int index) { ${method}Get(struct, $param, index); }")
						}
					}
					it.nativeType is CharSequenceType                                                      -> {
						if ( it.nativeType.nullTerminated ) {
							println("\tpublic ByteBuffer ${getMethod}Buffer() { return ${method}Buffer(struct); }")
							println("\tpublic String ${getMethod}String() { return ${method}String(struct); }")
						} else {
							println("\tpublic ByteBuffer ${getMethod}Buffer(int $BUFFER_LEN_PARAM) { return ${method}Buffer(struct, $BUFFER_LEN_PARAM); }")
							println("\tpublic String ${getMethod}String(int $BUFFER_LEN_PARAM) { return ${method}String(struct, $BUFFER_LEN_PARAM); }")
						}
					}
					it.nativeType is StructType                                                            -> {
						println("\tpublic ByteBuffer ${getMethod}Buffer() { return ${method}Buffer(struct); }")
					}
					it.nativeType is PointerType && it.nativeType.mapping != PointerMapping.OPAQUE_POINTER -> {
						println("\tpublic ByteBuffer ${getMethod}(int $BUFFER_LEN_PARAM) { return ${method}(struct, $BUFFER_LEN_PARAM); }")
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

		print("JNIEXPORT jint JNICALL Java_${nativeFileNameJNI}_offsets(JNIEnv *$JNIENV, jclass clazz")
		if ( members.isNotEmpty() ) {
			println(", jlong bufferAddress) {")
			println("\tjint *buffer = (jint *)(intptr_t)bufferAddress;\n")
		} else {
			println(") {")
		}

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

		if ( members.isNotEmpty() ) {
			generateNativeMembers(members)
			println()
		}

		println("\treturn sizeof($nativeName);")
		println("}")

		println("\nEXTERN_C_EXIT")
	}

	private fun PrintWriter.generateNativeMembers(members: List<StructMember>, offset: Int = 0, prefix: String = ""): Int {
		var index = offset
		members forEach {
			println("\tbuffer[$index] = (jint)offsetof($nativeName, $prefix${it.nativeName});")
			index++

			if ( it.isNestedStruct ) {
				// Output anonymous inner structs
				val structType = it.nativeType as StructType
				if ( structType.name == ANONYMOUS )
					index = generateNativeMembers(structType.definition.members, index, prefix = "${it.nativeName}.") // recursion
			}
		}
		return index
	}

}

fun struct(
	packageName: String,
	className: String,
	nativeSubPath: String = "",
	structName: String = className,
	identifierType: StructIdentifierType = StructIdentifierType.ALIAS,
	virtual: Boolean = false,
	malloc: Boolean = true,
	init: Struct.() -> Unit
): Struct {
	val struct = Struct(packageName, className, nativeSubPath, structName, identifierType, virtual, malloc)
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