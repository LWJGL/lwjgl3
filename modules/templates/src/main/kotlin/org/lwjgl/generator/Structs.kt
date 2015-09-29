/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.io.PrintWriter
import java.util.*
import java.util.regex.Pattern

private val STRUCT = "struct"

// TODO: Add support for javadoc
private open class StructMember(
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
			"${parentField}_$offsetField"
	}

	private fun _method(parentMember: String) = if ( parentMember.isEmpty() )
		name
	else
		"$parentMember${name.upperCaseFirst}"

	fun method(parentMember: String) = UNDERSCORE.split(_method(parentMember)).map { it.upperCaseFirst }.join("")

}

private open class StructMemberArray(
	nativeType: NativeType,
	nativeName: String,
	name: String,
	val size: Int
) : StructMember(nativeType, nativeName, name)

private class StructMemberCharArray(
	nativeType: CharType,
	nativeName: String,
	name: String,
	size: Int,
	val nullTerminated: Boolean
) : StructMemberArray(nativeType, nativeName, name, size)

private val ANONYMOUS = "*"

enum class StructIdentifierType(val keyword: String) {
	/**
	 * typedef struct Foo { ... } Bar
	 * or
	 * typedef union Foo { ... } Bar
	 */
	ALIAS(""),
	/** struct Foo { ... } */
	STRUCT("struct "),
	/** union Foo { ... } */
	UNION("union ")
}

private enum class MultiSetterMode {
	NORMAL,
	ALTER1,
	ALTER2
}

private enum class AccessMode(val indent: String) {
	INSTANCE("\t"),
	FLYWEIGHT("\t\t");
}

class Struct(
	packageName: String,
	className: String,
	nativeSubPath: String = "",
	/** The native struct name. May be different than className. */
	private val structName: String = className,
	private val identifierType: StructIdentifierType = StructIdentifierType.ALIAS,
	/** when true, a declaration is missing, we need to output one. */
	private val virtual: Boolean = false,
	/** when false, setters methods will not be generated. */
	private val mutable: Boolean = true
) : GeneratorTargetNative(packageName, className, nativeSubPath) {

	companion object {
		private val bufferMethodMap = mapOf(
			"boolean" to "Byte",

			"byte" to "Byte",
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

	private val members = ArrayList<StructMember>()

	// Plain field
	fun NativeType.member(nativeName: String, name: String = nativeName) {
		members add StructMember(this, nativeName, name)
	}

	// Array field
	fun NativeType.member(nativeName: String, name: String = nativeName, size: Int) {
		members add StructMemberArray(this, nativeName, name, size)
	}

	// CharSequence special-case
	fun CharType.member(nativeName: String, name: String = nativeName, size: Int, nullTerminated: Boolean) {
		members add StructMemberCharArray(this, nativeName, name, size, nullTerminated)
	}

	private val StructMember.isNestedStruct: Boolean
		get() = nativeType is StructType && !nativeType.includesPointer && this !is StructMemberArray

	private val StructMember.isNestedAnonymousStruct: Boolean
		get() = isNestedStruct && (nativeType as StructType).name == ANONYMOUS

	private val StructMember.nestedMembers: ArrayList<StructMember>
		get() = (nativeType as StructType).definition.members

	// Make parameter lowercase if it's all uppercase and conflicts with the offset field
	private fun String.toParam(field: String) = if ( this != field ) this else this.toLowerCase()

	override fun PrintWriter.generateJava() {
		print(HEADER)
		println("package $packageName;\n")

		println("import java.nio.*;\n")

		println("import org.lwjgl.*;")
		println("import org.lwjgl.system.*;\n")

		println("import static org.lwjgl.system.Checks.*;")
		println("import static org.lwjgl.system.MemoryUtil.*;")

		println();
		preamble.printJava(this)

		val documentation = super.documentation
		if ( documentation != null )
			println(processDocumentation(documentation).toJavaDoc(indentation = ""))
		println("${access.modifier}final class $className extends Struct {")

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
		IntBuffer offsets = memAllocInt(${getMemberCount(members)});

		SIZEOF = offsets(memAddress(offsets));

""")
			generateOffsetInit(members)
			print("""
		memFree(offsets);
	}
""")
		} else {
			print("""
	static {
		LWJGLUtil.initialize();

		SIZEOF = offsets();
	}
""")
		}
		print("""
	private static native int offsets(${if ( members.isNotEmpty() ) "long buffer" else ""});

	$className(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link $className} instance at the specified memory address. */
	public $className(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link $className} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public $className(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }
""")

		if ( members.isNotEmpty() ) {
			println()
			generateGetters(AccessMode.INSTANCE, members)

			if ( mutable ) {
				println()
				generateSetters(AccessMode.INSTANCE, members)

				if ( members.size() > 1 ) {
					val javadoc = "Initializes this struct with the specified values."
					// Factory constructors
					if ( generateAlternativeMultiSetter(members) ) {
						generateMultiSetter(javadoc, members, generateAlternativeMultiSetterParameters, generateAlternativeMultiSetterSetters, MultiSetterMode.ALTER1)
						if ( members any { it is StructMemberCharArray } )
							generateMultiSetter(javadoc, members, generateAlternativeMultiSetterParameters, generateAlternativeMultiSetterSetters, MultiSetterMode.ALTER2)
					} else
						generateMultiSetter(javadoc, members, generateMultiSetterParameters, generateMultiSetterSetters)

					print("""
	/** Unsafe version of {@link #set}. */
	public $className nset(long struct) {
		memCopy(struct, $ADDRESS, SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @returns this struct
	 */
	public $className set($className src) {
		return nset($ADDRESS);
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public $className set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}
""")
				}
			}
		}

		// Factory constructors
		println("""
	// -----------------------------------

	/** Returns a new {@link $className} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static $className malloc() {
		return new $className(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link $className} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static $className calloc() {
		return new $className(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link $className} instance allocated with {@link BufferUtils}. */
	public static $className create() {
		return new $className(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link $className.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link $className.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link $className.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}
""")

		if ( members.isNotEmpty() ) {
			generateStaticGetters(members)
			println()

			if ( mutable ) {
				generateStaticSetters(members)
				println()
			}
		}

		println("\t// -----------------------------------")

		print("""
	/** An array of {@link $className} structs. */
	public static final class Buffer extends StructBuffer<$className, Buffer> {

		/**
		 * Creates a new {@link $className.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link $className#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			this(container.slice(), SIZEOF);
		}

		Buffer(ByteBuffer container, int SIZEOF) {
			super(container, SIZEOF);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(ByteBuffer buffer) {
			return new Buffer(buffer);
		}

		@Override
		protected $className newInstance(long address) {
			return new $className(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}
""")
		if ( members.isNotEmpty() ) {
			println()
			generateGetters(AccessMode.FLYWEIGHT, members)

			if ( mutable ) {
				println()
				generateSetters(AccessMode.FLYWEIGHT, members)
			}
		}

		print("""
	}

}""")
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
		for (member in members.asSequence().filter { it.isNestedAnonymousStruct })
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

	private fun PrintWriter.generateMultiSetter(
		javaDoc: String,
		members: List<StructMember>,
		generateParameters: PrintWriter.(List<StructMember>, String, MultiSetterMode, Boolean) -> Unit,
		generateSetters: PrintWriter.(List<StructMember>, String, MultiSetterMode) -> Unit,
		mode: MultiSetterMode = MultiSetterMode.NORMAL
	) {
		print("""
	/** $javaDoc */
	public $className set(
""")
		generateParameters(members, "", mode, false)
		println("""
	) {""")
		generateSetters(members, "", mode)
		print("""
		return this;
	}
""")
	}

	private val generateMultiSetterParameters: PrintWriter.(List<StructMember>, String, MultiSetterMode, Boolean) -> Unit = { members, parentMember, mode, more ->
		members.forEachWithMore(more) { it, more ->
			val method = it.method(parentMember)

			if ( it.isNestedAnonymousStruct ) {
				generateMultiSetterParameters(it.nestedMembers, method, mode, more)
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
				it.nativeType.isPointer -> {
					print("long $param")
				}
				else                    -> {
					val javaType = it.nativeType.javaMethodType.simpleName
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

	private val generateMultiSetterSetters: PrintWriter.(List<StructMember>, String, MultiSetterMode) -> Unit = { members, parentMember, mode ->
		members.forEach {
			val setter = it.method(parentMember)
			val method = "set$setter"

			if ( it.isNestedAnonymousStruct ) {
				generateMultiSetterSetters(it.nestedMembers, setter, mode)
			} else {
				val param = if ( parentMember.isEmpty() ) it.name else "${parentMember}_${it.name}"

				when {
					it is StructMemberArray -> {
						println("\t\t$method($param, ${param}Bytes);")
					}
					it.isNestedStruct       -> {
						println("\t\t$method($param);")
					}
					else                    -> {
						println("\t\t$method($param);")
					}
				}
			}
		}
	}

	private val generateAlternativeMultiSetter: (List<StructMember>) -> Boolean = { members ->
		members any {
			if ( it.isNestedAnonymousStruct )
				generateAlternativeMultiSetter(it.nestedMembers)
			else
				it is StructMemberArray || it.nativeType.isPointerData
		}
	}

	private val generateAlternativeMultiSetterParameters: PrintWriter.(List<StructMember>, String, MultiSetterMode, Boolean) -> Unit = { members, parentMember, mode, more ->
		members.forEachWithMore(more) { it, more ->
			val method = it.method(parentMember)

			if ( it.isNestedAnonymousStruct ) {
				generateAlternativeMultiSetterParameters(it.nestedMembers, method, mode, more)
				return@forEachWithMore
			}

			if ( more )
				println(",")

			print("\t\t")

			val param = if ( parentMember.isEmpty() ) it.name else "${parentMember}_${it.name}"

			when {
				it is StructMemberArray     -> {
					print(
						if ( it is StructMemberCharArray && mode === MultiSetterMode.ALTER2 )
							"CharSequence $param"
						else if ( it.nativeType is StructType && it.nativeType.includesPointer )
							"PointerBuffer $param"
						else
							"ByteBuffer $param"
					)
				}
				it.nativeType.isPointerData -> {
					if ( it.nativeType is StructType )
						print("${it.nativeType.definition.className} $param")
					else
						print("ByteBuffer $param")
				}
				else                        -> {
					val javaType = it.nativeType.javaMethodType.simpleName
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

	private val generateAlternativeMultiSetterSetters: PrintWriter.(List<StructMember>, String, MultiSetterMode) -> Unit = { members, parentMember, mode ->
		members.forEach {
			val method = it.method(parentMember)

			if ( it.isNestedAnonymousStruct ) {
				generateAlternativeMultiSetterSetters(it.nestedMembers, method, mode)
			} else {
				val param = if ( parentMember.isEmpty() ) it.name else "${parentMember}_${it.name}"
				println("\t\tset$method($param);")
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
			val setter = it.method(parentMember)
			val method = "set$setter"
			val field = getFieldOffset(it, parentStruct, parentField)

			val param = it.name.toParam(field)

			if ( it.isNestedStruct ) {
				val nestedStruct = (it.nativeType as StructType).definition
				if ( !(nestedStruct.className === ANONYMOUS) ) {
					println("\tpublic static void n$method(long $STRUCT, ${nestedStruct.className} $param) { memCopy($param.$ADDRESS, $STRUCT + $field, ${getNestedStructSizeOf(nestedStruct, field)}); }")
					println("\t/** Copies the specified {@link ${nestedStruct.className}} struct to the nested {@code $param} struct. */")
					println("\tpublic static void $method(ByteBuffer $STRUCT, ${nestedStruct.className} $param) { n$method(memAddress($STRUCT), $param); }")
				}
				generateStaticSetters(it.nestedMembers, nestedStruct, setter, field)
			} else {
				// Setter

				if ( it !is StructMemberArray ) {
					val javaType = if ( it.nativeType.isPointer )
						"long"
					else
						it.nativeType.javaMethodType.simpleName

					// pointer

					print("\tpublic static void n$method(long $STRUCT, ")
					val bufferMethod = getBufferMethod(it, javaType)
					println(
						if ( javaType.equals("byte") || javaType.equals("short") ) // TODO: revisit cast
							"int $param) { memPut$bufferMethod($STRUCT + $field, ($javaType)$param); }"
						else
							"$javaType $param) { memPut$bufferMethod($STRUCT + $field, $param${if ( javaType == "boolean" ) " ? (byte)1 : (byte)0" else ""}); }"
					)

					// ByteBuffer

					if ( !it.nativeType.isPointerData ) {
						print("\tpublic static void $method(ByteBuffer $STRUCT, ")
						println(
							if ( javaType.equals("byte") || javaType.equals("short") )
								"int $param) { n$method(memAddress($STRUCT), $param); }"
							else
								"$javaType $param) { n$method(memAddress($STRUCT), $param); }"
						)
					}
				}

				// Alternative setters

				when {
					it is StructMemberArray           -> {
						if ( it.nativeType is PrimitiveType ) {
							val mapping = it.nativeType.mapping as PrimitiveMapping
							val bytesPerElement = if ( mapping === PrimitiveMapping.POINTER ) "POINTER_SIZE" else mapping.bytes

							println("\tpublic static void n$method(long $STRUCT, ByteBuffer $param) {")
							println("\t\tif ( LWJGLUtil.CHECKS ) {")
							if ( it is StructMemberCharArray ) {
								val charMapping = it.nativeType.mapping as CharMapping
								println("\t\t\tcheckNT${charMapping.bytes}($param);")
							}
							println("\t\t\tcheckBufferGT($param, ${it.size} * $bytesPerElement);")
							println("\t\t}")
							println("\t\tmemCopy(memAddress($param), $STRUCT + $field, $param.remaining());")
							println("\t}")
							println("\tpublic static void $method(ByteBuffer $STRUCT, ByteBuffer $param) { n$method(memAddress($STRUCT), $param); }")

							if ( it is StructMemberCharArray ) {
								println("\tpublic static void n$method(long $STRUCT, CharSequence $param) { memEncode${(it.nativeType.mapping as CharMapping).charset}($param, ${it.nullTerminated}, memByteBuffer($STRUCT + $field, ${it.size})); }")
								println("\tpublic static void $method(ByteBuffer $STRUCT, CharSequence $param) { memEncode${it.nativeType.mapping.charset}($param, ${it.nullTerminated}, $STRUCT, $field); }") // optimized version, there is a ByteBuffer available
							} else /*if ( bytesPerElement != 1 )*/ {
								print("\tpublic static void n$method(long $STRUCT, int index, ${mapping.javaMethodType} $param) { ")
								print(
									when ( mapping ) {
										PrimitiveMapping.POINTER -> "memPutAddress($STRUCT + $field + index * POINTER_SIZE, $param);"
										else                     -> "memPut${bufferMethodMap[mapping.javaMethodType.simpleName]}($STRUCT + $field + index * $bytesPerElement, $param);"
									}
								)
								println(" }")
								println("\tpublic static void $method(ByteBuffer $STRUCT, int index, ${mapping.javaMethodType} $param) { n$method(memAddress($STRUCT), index, $param); }")
							}
						} else {
							val nestedStructType = it.nativeType as StructType
							val nestedStruct = nestedStructType.definition
							val SIZEOF = getNestedStructSizeOf(nestedStruct, field)

							if ( nestedStructType.includesPointer ) {
								println("\tpublic static void n$method(long $STRUCT, PointerBuffer $param) {")
								println("\t\tif ( LWJGLUtil.CHECKS ) checkBufferGT($param, ${it.size});")
								println("\t\tmemCopy(memAddress($param), $STRUCT + $field, $param.remaining() * POINTER_SIZE);")
								println("\t}")
								println("\tpublic static void $method(ByteBuffer $STRUCT, PointerBuffer $param) { n$method(memAddress($STRUCT), $param); }")

								println("\tpublic static void n$method(long $STRUCT, int index, ${nestedStruct.className} $param) {")
								println("\t\tmemPutAddress($STRUCT + $field + index * POINTER_SIZE, $param.$ADDRESS);")
								println("\t}")
								println("\tpublic static void $method(ByteBuffer $STRUCT, int index, ${nestedStruct.className} $param) { n$method(memAddress($STRUCT), index, $param); }")
							} else {
								println("\tpublic static void n$method(long $STRUCT, ByteBuffer $param) {")
								println("\t\tif ( LWJGLUtil.CHECKS ) checkBufferGT($param, ${it.size} * $SIZEOF);")
								println("\t\tmemCopy(memAddress($param), $STRUCT + $field, $param.remaining());")
								println("\t}")
								println("\tpublic static void $method(ByteBuffer $STRUCT, ByteBuffer $param) { n$method(memAddress($STRUCT), $param); }")

								println("\tpublic static void n$method(long $STRUCT, int index, ${nestedStruct.className} $param) {")
								println("\t\tmemCopy($param.$ADDRESS, $STRUCT + $field + index * ${nestedStruct.className}.SIZEOF, ${nestedStruct.className}.SIZEOF);")
								println("\t}")
								println("\tpublic static void $method(ByteBuffer $STRUCT, int index, ${nestedStruct.className} $param) { n$method(memAddress($STRUCT), index, $param); }")
							}
						}
					}
					it.nativeType is CharSequenceType -> {
						print("\tpublic static void n$method(long $STRUCT, ByteBuffer $param) { ")
						if ( it.nativeType.nullTerminated )
							print("if ( LWJGLUtil.CHECKS && $param != null ) checkNT${it.nativeType.charMapping.bytes}($param); ")
						println("n$method($STRUCT, memAddressSafe($param)); }")
						println("\tpublic static void $method(ByteBuffer $STRUCT, ByteBuffer $param) { n$method(memAddress($STRUCT), $param); }")

						println("\tpublic static void n$method(long $STRUCT, CharSequence $param) { n$method($STRUCT, memEncode${it.nativeType.charMapping.charset}($param, BufferAllocator.MALLOC)); }")
						println("\t/** Encodes the specified {@link CharSequence} to a newly allocated buffer and sets its address to the {@code $param} field. The allocated buffer must be explicitly freed. */")
						println("\tpublic static void $method(ByteBuffer $STRUCT, CharSequence $param) { n$method(memAddress($STRUCT), $param); }")
					}
					it.nativeType.isPointerData       -> {
						if ( it.nativeType is StructType ) {
							println("\tpublic static void n$method(long $STRUCT, ${it.nativeType.definition.className} $param) { n$method($STRUCT, $param.$ADDRESS); }")
							println("\tpublic static void $method(ByteBuffer $STRUCT, ${it.nativeType.definition.className} $param) { n$method(memAddress($STRUCT), $param); }")
						} else {
							println("\tpublic static void n$method(long $STRUCT, ByteBuffer $param) { n$method($STRUCT, memAddressSafe($param)); }")
							println("\tpublic static void $method(ByteBuffer $STRUCT, ByteBuffer $param) { n$method(memAddress($STRUCT), $param); }")
						}
					}
				}
			}
		}
	}

	private fun PrintWriter.generateSetters(
		accessMode: AccessMode,
		members: List<StructMember>,
		parentStruct: Struct? = null,
		parentMember: String = "",
		parentField: String = ""
	) {
		members.forEach {
			val setter = it.method(parentMember)
			val method = "set$setter"
			val field = getFieldOffset(it, parentStruct, parentField)

			val indent = accessMode.indent;
			val returnType = if ( accessMode === AccessMode.INSTANCE )
				className
			else
				"$className.Buffer"

			val param = it.name.toParam(field)

			if ( it.isNestedStruct ) {
				val nestedStruct = (it.nativeType as StructType).definition
				if ( !(nestedStruct.className === ANONYMOUS) )
					println("${indent}public $returnType $method(${nestedStruct.className} $param) { n$method($ADDRESS, $param); return this; }")
				generateSetters(accessMode, it.nestedMembers, nestedStruct, setter, field)
			} else {
				// Setter

				if ( it !is StructMemberArray && !it.nativeType.isPointerData ) {
					print("${indent}public $returnType $method(")

					val javaType = it.nativeType.javaMethodType.simpleName
					println(
						if ( javaType.equals("byte") || javaType.equals("short") )
							"int $param) { n$method($ADDRESS, $param); return this; }"
						else
							"$javaType $param) { n$method($ADDRESS, $param); return this; }"
					)
				}

				// Alternative setters

				if ( it.nativeType is CharSequenceType ) {
					println("${indent}public $returnType $method(ByteBuffer $param) { n$method($ADDRESS, $param); return this; }")
					println("${indent}public $returnType $method(CharSequence $param) { n$method($ADDRESS, $param); return this; }")
				} else if ( it is StructMemberArray ) {
					if ( it.nativeType is StructType && it.nativeType.includesPointer ) {
						println("${indent}public $returnType $method(PointerBuffer $param) { n$method($ADDRESS, $param); return this; }")
						println("${indent}public $returnType $method(int index, ${it.nativeType.definition.className} $param) { n$method($ADDRESS, index, $param); return this; }")
					} else {
						println("${indent}public $returnType $method(ByteBuffer $param) { n$method($ADDRESS, $param); return this; }")
						if ( it is StructMemberCharArray )
							println("${indent}public $returnType $method(CharSequence $param) { n$method($ADDRESS, $param); return this; }")
						else if ( it.nativeType is PrimitiveType )
							println("${indent}public $returnType $method(int index, ${it.nativeType.mapping.javaMethodType} $param) { n$method($ADDRESS, index, $param); return this; }")
						else if ( it.nativeType is StructType )
							println("${indent}public $returnType $method(int index, ${it.nativeType.definition.className} $param) { n$method($ADDRESS, index, $param); return this; }")
					}
				} else if ( it.nativeType.isPointerData )
					if ( it.nativeType is StructType )
						println("${indent}public $returnType $method(${it.nativeType.definition.className} $param) { n$method($ADDRESS, $param); return this; }")
					else
						println("${indent}public $returnType $method(ByteBuffer $param) { n$method($ADDRESS, $param); return this; }")
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
			val getter = it.method(parentMember)
			val method = "get$getter"
			val field = getFieldOffset(it, parentStruct, parentField)

			if ( it.isNestedStruct ) {
				val nestedStruct = (it.nativeType as StructType).definition
				if ( !(nestedStruct.className === ANONYMOUS) ) {
					println(
						if ( !this@Struct.mutable && !nestedStruct.mutable )
							"\tpublic static ${nestedStruct.className} n$method(long $STRUCT) { return new ${nestedStruct.className}($STRUCT + $field); }"
						else
							"\tpublic static ${nestedStruct.className} n$method(long $STRUCT) { return ${nestedStruct.className}.malloc().nset($STRUCT + $field); }"
					)
					println("\t/** Returns a copy of the {@code ${it.name.toParam(field)}} {@link ${nestedStruct.className}} struct. */")
					println("\tpublic static ${nestedStruct.className} $method(ByteBuffer $STRUCT) { return n$method(memAddress($STRUCT)); }")
				}
				generateStaticGetters(it.nestedMembers, nestedStruct, getter, field)
			} else {
				// Getter

				if ( it !is StructMemberArray ) {
					// pointer

					print("\tpublic static ")

					val javaType = if ( it.nativeType.isPointer )
						"long"
					else
						it.nativeType.javaMethodType.simpleName

					val bufferMethod = getBufferMethod(it, javaType)

					val convertToInt = javaType.equals("byte") || javaType.equals("short");
					print(
						if ( convertToInt ) // TODO: revisit
							"int n$method(long $STRUCT) { return memGet$bufferMethod("
						else
							"$javaType n$method(long $STRUCT) { return memGet$bufferMethod("
					)

					print("$STRUCT + $field)")
					if ( it.nativeType is IntegerType ) {
						if ( convertToInt && it.nativeType.unsigned ) {
							print(" & 0x")
							for (i in 1..(it.nativeType.mapping as PrimitiveMapping).bytes)
								print("FF")
						} else if ( it.nativeType.mapping === PrimitiveMapping.BOOLEAN )
							print(" != 0")
					}
					println("; }")

					// ByteBuffer

					if ( !it.nativeType.isPointerData ) {
						print("\tpublic static ")

						print(
							if ( convertToInt )
								"int $method(ByteBuffer $STRUCT) { return n$method("
							else
								"$javaType $method(ByteBuffer $STRUCT) { return n$method("
						)

						println("memAddress($STRUCT)); }")
					}
				}

				// Alternative getters

				when {
					it is StructMemberArray           -> {
						val array: StructMemberArray = it
						val param = array.name.toParam(field)

						if ( it.nativeType is PrimitiveType ) {
							// TODO: We support primitive arrays only for now. Fix this if we ever need struct/pointer arrays
							val mapping = (array.nativeType as PrimitiveType).mapping as PrimitiveMapping
							val bytesPerElement = mapping.bytes

							println("\tpublic static void n$method(long $STRUCT, ByteBuffer $param) {")
							println("\t\tif ( LWJGLUtil.CHECKS ) checkBufferGT($param, ${array.size} * $bytesPerElement);")
							println("\t\tmemCopy($STRUCT + $field, memAddress($param), $param.remaining());")
							println("\t}")
							println("\tpublic static void $method(ByteBuffer $STRUCT, ByteBuffer $param) { n$method(memAddress($STRUCT), $param); }")

							if ( array is StructMemberCharArray ) {
								val charMapping = array.nativeType.mapping as CharMapping
								if ( array.nullTerminated ) {
									println("\tpublic static String n${method}String(long $STRUCT) { return memDecode${charMapping.charset}($STRUCT + $field); }")
									println("\tpublic static String ${method}String(ByteBuffer $STRUCT) { return n${method}String(memAddress($STRUCT)); }")

									println("\tpublic static String n${method}String(long $STRUCT, int $BUFFER_LEN_PARAM) { return memDecode${charMapping.charset}(memByteBuffer($STRUCT + $field, $BUFFER_LEN_PARAM)); }")
									println("\tpublic static String ${method}String(ByteBuffer $STRUCT, int $BUFFER_LEN_PARAM) { return n${method}String(memAddress($STRUCT), $BUFFER_LEN_PARAM); }")
								} else
									println("\tpublic static String ${method}String(ByteBuffer $STRUCT) { return memDecode${charMapping.charset}($STRUCT, ${array.size}, $field); }")
							} else {
								val javaType = mapping.javaMethodType.simpleName
								val bufferMethod = getBufferMethod(it, javaType)

								println("\tpublic static $javaType n$method(long $STRUCT, int index) { return memGet$bufferMethod($STRUCT + $field + index * $bytesPerElement); }")
								println("\tpublic static $javaType $method(ByteBuffer $STRUCT, int index) { return n$method(memAddress($STRUCT), index); }")
							}
						} else {
							val nestedStructType = array.nativeType as StructType
							val nestedStruct = nestedStructType.definition
							val SIZEOF = getNestedStructSizeOf(nestedStruct, field)

							if ( nestedStructType.includesPointer ) {
								println("\tpublic static void n$method(long $STRUCT, PointerBuffer $param) {")
								println("\t\tif ( LWJGLUtil.CHECKS ) checkBufferGT($param, ${array.size});")
								println("\t\tmemCopy($STRUCT + $field, memAddress($param), $param.remaining() * POINTER_SIZE);")
								println("\t}")
								println("\tpublic static void $method(ByteBuffer $STRUCT, PointerBuffer $param) { n$method(memAddress($STRUCT), $param); }")

								println("\tpublic static ${nestedStruct.className} n$method(long $STRUCT, int index) {")
								println("\t\treturn new ${nestedStruct.className}($STRUCT + $field + index * POINTER_SIZE);")
								println("\t}")
								println("\tpublic static ${nestedStruct.className} $method(ByteBuffer $STRUCT, int index) { return n$method(memAddress($STRUCT), index); }")
							} else {
								println("\tpublic static void n$method(long $STRUCT, ByteBuffer $param) {")
								println("\t\tif ( LWJGLUtil.CHECKS ) checkBufferGT($param, ${array.size} * $SIZEOF);")
								println("\t\tmemCopy($STRUCT + $field, memAddress($param), $param.remaining());")
								println("\t}")
								println("\tpublic static void $method(ByteBuffer $STRUCT, ByteBuffer $param) { n$method(memAddress($STRUCT), $param); }")

								println("\tpublic static ${nestedStruct.className} n$method(long $STRUCT, int index) {")
								println(
									if ( !this@Struct.mutable && !nestedStruct.mutable )
										"\t\treturn new ${nestedStruct.className}($STRUCT + $field + index * $SIZEOF);"
									else
										"\t\treturn ${nestedStruct.className}.malloc().nset($STRUCT + $field + index * $SIZEOF);"
								)
								println("\t}")
								println("\tpublic static ${nestedStruct.className} $method(ByteBuffer $STRUCT, int index) { return n$method(memAddress($STRUCT), index); }")
							}
						}
					}
					it.nativeType is CharSequenceType -> {
						if ( it.nativeType.nullTerminated ) {
							println("\tpublic static ByteBuffer n${method}Buffer(long $STRUCT) { return memByteBufferNT${it.nativeType.charMapping.bytes}(n$method($STRUCT)); }")
							println("\tpublic static ByteBuffer ${method}Buffer(ByteBuffer $STRUCT) { return n${method}Buffer(memAddress($STRUCT)); }")
							println("\tpublic static String n${method}String(long $STRUCT) { return memDecode${it.nativeType.charMapping.charset}(n$method($STRUCT)); }")
							println("\tpublic static String ${method}String(ByteBuffer $STRUCT) { return n${method}String(memAddress($STRUCT)); }")
						} else {
							println("\tpublic static ByteBuffer ${method}Buffer(ByteBuffer $STRUCT, int $BUFFER_LEN_PARAM) { return memByteBuffer($method($STRUCT), $BUFFER_LEN_PARAM); }")
							println("\tpublic static String ${method}String(ByteBuffer $STRUCT, int $BUFFER_LEN_PARAM) { return memDecode${it.nativeType.charMapping.charset}(memByteBuffer($method($STRUCT), $BUFFER_LEN_PARAM)); }")
						}
					}
					it.nativeType is StructType       -> {
						println("\tpublic static ${it.nativeType.definition.className} n${method}Struct(long $STRUCT) { return new ${it.nativeType.definition.className}(n$method($STRUCT)); }")
						println("\tpublic static ${it.nativeType.definition.className} $method(ByteBuffer $STRUCT) { return n${method}Struct(memAddress($STRUCT)); }")
					}
					it.nativeType.isPointerData       -> {
						println("\tpublic static ByteBuffer n$method(long $STRUCT, int $BUFFER_LEN_PARAM) { return memByteBuffer(n$method($STRUCT), $BUFFER_LEN_PARAM); }")
						println("\tpublic static ByteBuffer $method(ByteBuffer $STRUCT, int $BUFFER_LEN_PARAM) { return n$method(memAddress($STRUCT), $BUFFER_LEN_PARAM); }")
					}
				}
			}
		}
	}

	private fun PrintWriter.generateGetters(
		accessMode: AccessMode,
		members: List<StructMember>,
		parentStruct: Struct? = null,
		parentMember: String = "",
		parentField: String = ""
	) {
		members.forEach {
			val getter = it.method(parentMember)
			val method = "get$getter"
			val field = getFieldOffset(it, parentStruct, parentField)

			val indent = accessMode.indent

			if ( it.isNestedStruct ) {
				val nestedStruct = (it.nativeType as StructType).definition
				if ( !(nestedStruct.className === ANONYMOUS) ) {
					println("${indent}public ${nestedStruct.className} $method() { return n$method($ADDRESS); }")
				}
				generateGetters(accessMode, it.nestedMembers, nestedStruct, getter, field)
			} else {
				// Getter

				if ( it !is StructMemberArray && !it.nativeType.isPointerData ) {
					print("${indent}public ")

					val javaType = it.nativeType.javaMethodType.simpleName

					val convertToInt = javaType.equals("byte") || javaType.equals("short"); // TODO: revisit
					println(
						if ( convertToInt )
							"int $method() { return n$method($ADDRESS); }"
						else
							"$javaType $method() { return n$method($ADDRESS); }"
					)
				}

				// Alternative getters

				when {
					it is StructMemberArray           -> {
						val param = it.name.toParam(field)

						if ( it.nativeType is StructType && it.nativeType.includesPointer ) {
							println("${indent}public void $method(PointerBuffer $param) { n$method($ADDRESS, $param); }")
							println("${indent}public ${it.nativeType.definition.className} $method(int index) { return n$method($ADDRESS, index); }")
						} else {
							println("${indent}public void $method(ByteBuffer $param) { n$method($ADDRESS, $param); }")
							if ( it is StructMemberCharArray ) {
								println("${indent}public String ${method}String() { return n${method}String($ADDRESS); }")
								if ( it.nullTerminated )
									println("${indent}public String ${method}String(int $BUFFER_LEN_PARAM) { return n${method}String($ADDRESS, $BUFFER_LEN_PARAM); }")
							} else if ( it.nativeType is StructType ) {
								println("${indent}public ${it.nativeType.definition.className} $method(int index) { return n$method($ADDRESS, index); }")
							}
						}
					}
					it.nativeType is CharSequenceType -> {
						if ( it.nativeType.nullTerminated ) {
							println("${indent}public ByteBuffer ${method}Buffer() { return n${method}Buffer($ADDRESS); }")
							println("${indent}public String ${method}String() { return n${method}String($ADDRESS); }")
						} else {
							println("${indent}public ByteBuffer ${method}Buffer(int $BUFFER_LEN_PARAM) { return n${method}Buffer($ADDRESS, $BUFFER_LEN_PARAM); }")
							println("${indent}public String ${method}String(int $BUFFER_LEN_PARAM) { return n${method}String($ADDRESS, $BUFFER_LEN_PARAM); }")
						}
					}
					it.nativeType is StructType       -> {
						println("${indent}public ${it.nativeType.definition.className} $method() { return n${method}Struct($ADDRESS); }")
					}
					it.nativeType.isPointerData       -> {
						println("${indent}public ByteBuffer $method(int $BUFFER_LEN_PARAM) { return n$method($ADDRESS, $BUFFER_LEN_PARAM); }")
					}
				}
			}
		}
	}

	private fun getBufferMethod(member: StructMember, javaType: String) = if ( member.nativeType.isPointer )
		"Address"
	else
		bufferMethodMap[javaType] ?: throw UnsupportedOperationException("Unsupported struct member java type: $className.${member.name} ($javaType)")

	override fun PrintWriter.generateNative() {
		print(HEADER)
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
			for (m in members) {
				print("\t\t${m.nativeType.name}")
				if ( m.nativeType is PointerType && !m.nativeType.includesPointer ) {
					if ( !m.nativeType.name.endsWith('*') )
						print(' ')
					print('*')
				}
				println(" ${m.nativeName};")
			}
			println("\t} $structName;\n")
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
	mutable: Boolean = true,
	init: Struct.() -> Unit
): Struct {
	val struct = Struct(packageName, className, nativeSubPath, structName, identifierType, virtual, mutable)
	struct.init()
	Generator.register(struct)
	return struct
}

fun struct_p(
	packageName: String,
	className: String,
	nativeSubPath: String = "",
	structName: String = className,
	identifierType: StructIdentifierType = StructIdentifierType.ALIAS,
	virtual: Boolean = false,
	mutable: Boolean = true,
	init: Struct.() -> Unit
) = struct(packageName, className, nativeSubPath, structName, identifierType, virtual, mutable, init).nativeType.p

/** Anonymous member struct definition. Mostly useful for union of structs. */
fun Struct.struct(init: Struct.() -> Unit): StructType {
	val struct = Struct(ANONYMOUS, ANONYMOUS)
	struct.init()
	return StructType(struct)
}