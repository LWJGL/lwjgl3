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
	/** when true, a declaration is missing, we need to output one. */
	val virtual: Boolean = false,
	/** true: the Struct is a typedef to a struct declaration. false: it is the struct declaration itself, so we need to prepend the struct keyword. */
	val globalIdentifier: Boolean = true,
	/** when false, malloc methods will not be generated. */
	val malloc: Boolean = true
): GeneratorTargetNative(packageName, className, nativeSubPath) {

	companion object {
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

	val nativeType: StructType get() = StructType(this)
	val nativeName: String get() = if ( globalIdentifier ) structName else "struct $structName"

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
		get() = isNestedStruct && (nativeType as StructType).name === ANONYMOUS

	val StructMember.nestedMembers: ArrayList<StructMember>
		get() = (nativeType as StructType).definition.members

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
				generateConstructor(
					"Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values.",
					members, generateConstructorArguments, generateConstructorSetters
				)
				if ( generateAlternativeConstructor(members) ) {
					generateConstructor(
						"Alternative virtual constructor.",
						members, generateAlternativeConstructorArguments, generateAlternativeConstructorSetters, ConstructorMode.ALTER1
					)
					if ( members any { it is StructMemberCharArray } )
						generateConstructor(
							"Alternative virtual constructor.",
							members, generateAlternativeConstructorArguments, generateAlternativeConstructorSetters, ConstructorMode.ALTER2
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
				it is StructMemberArray -> {
					println("long $param,")
					print("\t\tint ${param}Bytes")
				}
				it.nativeType is PointerType || it.nativeType.mapping === PrimitiveMapping.PTR -> {
					print("long $param")
				}
				else -> {
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
				it is StructMemberArray -> {
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
				else -> {
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
				val postfix = if ( (it is StructMemberArray && mode === ConstructorMode.ALTER1) || it.isNestedStruct ) "Set" else "";
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

			val param = it.name

			if ( it.isNestedStruct ) {
				val nestedStruct = (it.nativeType as StructType).definition
				if ( !(nestedStruct.className === ANONYMOUS) ) {
					println("\tpublic static void ${method}Set(ByteBuffer $struct, long $param) { if ( $param != NULL ) memCopy($param, memAddress($struct) + $field, ${getNestedStructSizeOf(nestedStruct, field)}); }")
					println("\tpublic static void ${method}Set(ByteBuffer $struct, ByteBuffer $param) { ${method}Set($struct, memAddressSafe($param)); }")
				}
				generateStaticSetters(it.nestedMembers, nestedStruct, method, field)
			} else {
				// Setter

				var postfix = if ( it is StructMemberArray ) "Set" else "";
				print("\tpublic static void ${method}$postfix(ByteBuffer $struct, ")
				when {
					it is StructMemberArray                                                       -> {
						println("long $param, int bytes) { memCopy($param, memAddress($struct) + $field, bytes); }")
					}
					it.nativeType is PointerType || it.nativeType.mapping === PrimitiveMapping.PTR -> {
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

						// TODO: We support primitive arrays only for now. Fix this if we ever need struct arrays
						val mapping = array.nativeType.mapping as PrimitiveMapping
						val bytesPerElement = if ( mapping === PrimitiveMapping.PTR ) "POINTER_SIZE" else mapping.bytes

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
							println("\tpublic static void ${method}(ByteBuffer $struct, CharSequence $param) { memEncode${charMapping.charset}($param, ${array.nullTerminated}, $struct, $field); }")
						} else /*if ( bytesPerElement != 1 )*/ {
							print("\tpublic static void ${method}Set(ByteBuffer $struct, int index, ${mapping.javaMethodType} element) { ")
							print(
								when ( mapping ) {
									PrimitiveMapping.PTR -> "PointerBuffer.put($struct, $field + index * POINTER_SIZE, element);"
									PrimitiveMapping.BYTE -> "$struct.put($field + index, element);"
									else -> "$struct.put${mapping.javaMethodType.getSimpleName().upperCaseFirst}($field + index * $bytesPerElement, element);"
								}
							)
							println(" }")
						}
					}
					it.nativeType is CharSequenceType                                                      -> {
						print("\tpublic static void ${method}(ByteBuffer $struct, ByteBuffer $param) { ")
						val buffer = if ( it.nativeType.nullTerminated )
							"checkNT${it.nativeType.charMapping.bytes}($param)"
						else
							param
						println("${method}($struct, $param == null ? NULL : memAddress($buffer)); }")
					}
					it.nativeType is PointerType && it.nativeType.mapping != PointerMapping.OPAQUE_POINTER -> {
						println("\tpublic static void ${method}(ByteBuffer $struct, ByteBuffer $param) { ${method}($struct, memAddress($param)); }")
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

			val param = it.name

			if ( it.isNestedStruct ) {
				val nestedStruct = (it.nativeType as StructType).definition
				if ( !(nestedStruct.className === ANONYMOUS) ) {
					println("\tpublic void ${setMethod}(long $param) { ${method}Set(struct, $param); }")
					println("\tpublic void ${setMethod}(ByteBuffer $param) { ${method}Set(struct, $param); }")
				}
				generateSetters(it.nestedMembers, nestedStruct, method, field)
			} else {
				// Setter

				print("\tpublic void ${setMethod}(")
				when {
					it is StructMemberArray                                                       -> {
						println("long $param, int bytes) { ${method}Set(struct, $param, bytes); }")
					}
					it.nativeType is PointerType || it.nativeType.mapping === PrimitiveMapping.PTR -> {
						println("long $param) { ${method}(struct, $param); }")
					}
					else                                                                          -> {
						val javaType = it.nativeType.javaMethodType.getSimpleName()
						println(
							if ( javaType.equals("byte") || javaType.equals("short") )
								"int $param) { ${method}(struct, $param); }"
							else
								"$javaType $param) { ${method}(struct, $param); }"
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
					else
						println("\tpublic void ${setMethod}(int index, ${it.nativeType.mapping.javaMethodType} element) { ${method}Set(struct, index, element); }")
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
					val param = it.name
					val SIZEOF = getNestedStructSizeOf(nestedStruct, field)
					println("\tpublic static void ${method}Get(ByteBuffer $struct, long $param) { memCopy(memAddress($struct) + $field, $param, $SIZEOF); }")
					println("\tpublic static void ${method}Get(ByteBuffer $struct, ByteBuffer $param) { checkBuffer($param, $SIZEOF); ${method}Get($struct, memAddress($param)); }")
				}
				generateStaticGetters(it.nestedMembers, nestedStruct, method, field)
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
					it.nativeType is PointerType || it.nativeType.mapping === PrimitiveMapping.PTR -> {
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
								println("\tpublic static String ${method}String(ByteBuffer $struct) { return memDecode${charMapping.charset}($struct, memStrLen${charMapping.bytes}($struct, $field), $field); }")
								println("\tpublic static String ${method}String(ByteBuffer $struct, int size) { return memDecode${charMapping.charset}($struct, size, $field); }")
							} else
								println("\tpublic static String ${method}String(ByteBuffer $struct) { return memDecode${charMapping.charset}($struct, ${array.size}, $field); }")
						}
					}
					it.nativeType is CharSequenceType                                                      -> {
						if ( it.nativeType.nullTerminated ) {
							println("\tpublic static ByteBuffer ${method}Buffer(ByteBuffer $struct) { long address = ${method}($struct); return address == NULL ? null : memByteBufferNT${it.nativeType.charMapping.bytes}(address); }")
							println("\tpublic static String ${method}String(ByteBuffer $struct) { long address = ${method}($struct); return address == NULL ? null : memDecode${it.nativeType.charMapping.charset}(address); }")
						} else {
							println("\tpublic static ByteBuffer ${method}Buffer(ByteBuffer $struct, int size) { long address = ${method}($struct); return address == NULL ? null : memByteBuffer(address, size); }")
							println("\tpublic static String ${method}String(ByteBuffer $struct, int size) { long address = ${method}($struct); return address == NULL ? null : memDecode${it.nativeType.charMapping.charset}(memByteBuffer(address, size)); }")
						}
					}
					it.nativeType is StructType                                                            -> {
						println("\tpublic static ByteBuffer ${method}Buffer(ByteBuffer $struct) { return memByteBuffer(${method}($struct), ${it.nativeType.definition.className}.SIZEOF); }")
					}
					it.nativeType is PointerType && it.nativeType.mapping != PointerMapping.OPAQUE_POINTER -> {
						println("\tpublic static ByteBuffer ${method}(ByteBuffer $struct, int size) { long address = ${method}($struct); return address == NULL ? null : memByteBuffer(address, size); }")
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
					val param = it.name
					println("\tpublic void ${getMethod}(long $param) { ${method}Get(struct, $param); }")
					println("\tpublic void ${getMethod}(ByteBuffer $param) { ${method}Get(struct, $param); }")
				}
				generateGetters(it.nestedMembers, nestedStruct, method, field)
			} else {
				// Getter

				print("\tpublic ")

				when {
					it is StructMemberArray                                                       -> {
						val param = it.name
						println("void ${getMethod}(long $param, int bytes) { ${method}Get(struct, $param, bytes); }")
					}
					it.nativeType is PointerType || it.nativeType.mapping === PrimitiveMapping.PTR -> {
						println("long ${getMethod}() { return $method(struct); }")
					}
					else                                                                          -> {
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
						val param = it.name

						println("\tpublic void ${getMethod}(ByteBuffer $param) { ${method}Get(struct, $param); }")
						if ( array is StructMemberCharArray ) {
							println("\tpublic String ${getMethod}String() { return ${method}String(struct); }")
							if ( array.nullTerminated )
								println("\tpublic String ${getMethod}String(int size) { return ${method}String(struct, size); }")
						}
					}
					it.nativeType is CharSequenceType                                                      -> {
						if ( it.nativeType.nullTerminated ) {
							println("\tpublic ByteBuffer ${getMethod}Buffer() { return ${method}Buffer(struct); }")
							println("\tpublic String ${getMethod}String() { return ${method}String(struct); }")
						} else {
							println("\tpublic ByteBuffer ${getMethod}Buffer(int size) { return ${method}Buffer(struct, size); }")
							println("\tpublic String ${getMethod}String(int size) { return ${method}String(struct, size); }")
						}
					}
					it.nativeType is StructType                                                            -> {
						println("\tpublic ByteBuffer ${getMethod}Buffer() { return ${method}Buffer(struct); }")
					}
					it.nativeType is PointerType && it.nativeType.mapping != PointerMapping.OPAQUE_POINTER -> {
						println("\tpublic ByteBuffer ${getMethod}(int size) { return ${method}(struct, size); }")
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
				if ( structType.name === ANONYMOUS )
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
	virtual: Boolean = false,
	globalIdentifier: Boolean = true,
	malloc: Boolean = true,
	init: Struct.() -> Unit
): Struct {
	val struct = Struct(packageName, className, nativeSubPath, structName, virtual, globalIdentifier, malloc)
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