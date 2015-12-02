/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.io.PrintWriter
import java.util.*

private val STRUCT = "struct"
private val ANONYMOUS = "*" // very easy to introduce bugs, unless this is an invalid character in Java identifiers

private open class StructMember(
	val nativeType: NativeType,
	val name: String,
	val documentation: String
) {
	val offsetField: String
		get() = name.toUpperCase()

	fun offsetField(parentField: String): String {
		return if ( parentField.isEmpty() )
			offsetField
		else
			"${parentField}_$offsetField"
	}

	fun field(parentMember: String) = if ( parentMember.isEmpty() )
		if ( name == "class" ) "$name\$" else name // TODO: use a list of Java keywords here
	else
		"${parentMember}_$name"
}

private open class StructMemberArray(
	nativeType: NativeType,
	name: String,
	documentation: String,
	val size: Int
) : StructMember(nativeType, name, documentation)

private class StructMemberCharArray(
	nativeType: CharType,
	name: String,
	documentation: String,
	size: Int
) : StructMemberArray(nativeType, name, documentation, size)

private class StructMemberPadding(size: Int, val condition: String?) : StructMemberArray(char, ANONYMOUS, "", size)

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
	val nativeName: String,
	private val union: Boolean,
	/** when true, a declaration is missing, we need to output one. */
	private val virtual: Boolean,
	/** when false, setters methods will not be generated. */
	private val mutable: Boolean,
	/** when true, the struct layout will be built using native code. */
	private val nativeLayout: Boolean
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

		private val BUFFER_CAPACITY_PARAM = "capacity"
	}

	val nativeType: StructType get() = StructType(this)

	private val members = ArrayList<StructMember>()

	private val visibleMembers: Sequence<StructMember>
		get() = members.asSequence().filter { it !is StructMemberPadding }

	// Plain field
	fun NativeType.member(name: String, documentation: String) {
		members.add(StructMember(this, name, documentation))
	}

	// Array field
	fun NativeType.array(name: String, documentation: String, size: Int) {
		members.add(StructMemberArray(this, name, documentation, size))
	}

	// CharSequence special-case
	fun CharType.string(name: String, documentation: String, size: Int) {
		members.add(StructMemberCharArray(this, name, documentation, size))
	}

	fun padding(size: Int, condition: String? = null) {
		members.add(StructMemberPadding(size, condition))
	}

	/** Anonymous nested member struct definition. */
	fun struct(init: Struct.() -> Unit) {
		struct(ANONYMOUS, ANONYMOUS, init)
	}

	/** Nested member struct definition. */
	fun struct(name: String, documentation: String, init: Struct.() -> Unit) {
		val struct = Struct(ANONYMOUS, ANONYMOUS, "", ANONYMOUS, false, false, true, false)
		struct.init()
		StructType(struct).member(name, documentation)
	}

	/** Anonymous nested member union definition. */
	fun union(init: Struct.() -> Unit) {
		union(ANONYMOUS, ANONYMOUS, init)
	}

	/** Nested member union definition. */
	fun union(name: String, documentation: String, init: Struct.() -> Unit) {
		val struct = Struct(ANONYMOUS, ANONYMOUS, "", ANONYMOUS, true, false, true, false)
		struct.init()
		StructType(struct).member(name, documentation)
	}

	/** The nested struct's members are embedded in the parent struct. */
	private val StructMember.isNestedStruct: Boolean
		get() = nativeType is StructType && !nativeType.includesPointer && this !is StructMemberArray

	/** The nested struct is not defined elsewhere, it's part of the parent struct's definition */
	private val StructMember.isNestedStructDefinition: Boolean
		get() = isNestedStruct && (nativeType as StructType).name == ANONYMOUS

	private val StructMember.nestedMembers: Sequence<StructMember>
		get() = (nativeType as StructType).definition.visibleMembers

	private fun PrintWriter.printDocumentation() {
		val builder = StringBuilder()

		val members = members.filter { it !is StructMemberPadding }
		if ( documentation != null ) {
			builder.append(documentation)
			if ( members.isNotEmpty() )
				builder.append("\n\n")
		}

		if ( members.isNotEmpty() )
			builder
				.append(" <h3>${this@Struct.nativeName} members</h3>\n ")
				.append(this@Struct.printStructLayout())

		if ( builder.length != 0 )
			println(processDocumentation(builder.toString()).toJavaDoc(indentation = ""))
	}

	private fun Struct.printStructLayout(): String {
		return table(
			tr(
				th("Member"),
				th("Type"),
				th("Description")
			),
			*members.map {
				tr(
					td(it.name),
					if ( it.isNestedStructDefinition )
						td((it.nativeType as StructType).definition.printStructLayout())
					else {
						val nativeType = if ( it.nativeType is StructType && !it.nativeType.includesPointer )
							"{@link ${it.nativeType.definition.className} ${it.nativeType.name}}"
						else
							it.nativeType.let {
								if ( it is PointerType && !it.includesPointer )
									"${it.name}${if ( !it.name.endsWith('*') ) " " else ""}*"
								else
									it.name
							}
						td(if ( it is StructMemberArray ) "$nativeType[${it.size}]" else nativeType, className = "nw")
					},
					td(it.documentation)
				)
			}.toTypedArray()
		)
	}

	override fun PrintWriter.generateJava() {
		val nativeLayout = this@Struct.nativeLayout || members.isEmpty()
		if ( !nativeLayout && preamble.hasNativeDirectives )
			kotlin.io.println("\tUnnecessary native directives in struct: $packageName.$className")

		print(HEADER)
		println("package $packageName;\n")

		println("import java.nio.*;\n")

		println("import org.lwjgl.*;")
		println("import org.lwjgl.system.*;\n")

		if ( mutable )
			println("import static org.lwjgl.system.Checks.*;")
		println("import static org.lwjgl.system.MemoryUtil.*;")

		println();
		preamble.printJava(this)

		printDocumentation()
		println("${access.modifier}class $className extends Struct {")

		print("""
	/** The struct size in bytes. */
	public static final int SIZEOF;
""")
		if ( !nativeLayout )
			print("""
	@JavadocExclude
	public static final int __ALIGNMENT;
""")

		if ( members.isNotEmpty() && (!nativeLayout || visibleMembers.any()) ) {
			val memberCount = getMemberCount(members)

			// Member offset fields

			if ( visibleMembers.any() ) {
				print("""
	/** The struct member offsets. */
	public static final int
""")
				generateOffsetFields(visibleMembers)
				println(";")
			}

			// Member offset initialization

			if ( nativeLayout ) {
				print("""
	static {
		IntBuffer offsets = memAllocInt($memberCount);

		SIZEOF = offsets(memAddress(offsets));

""")
				generateOffsetInit(members)
				println("\n\t\tmemFree(offsets);")
			} else {
				print("""
	static {
		Layout layout = """)
				generateLayout(this@Struct)
				print(""";

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

""")
				generateOffsetInit(members)
			}

			print("\t}")
		} else {
			print("""
	static {
		SIZEOF = offsets();
	}""")
		}

		if ( nativeLayout )
			print("""

	private static native int offsets(${if ( visibleMembers.any() ) "long buffer" else ""});""")

		print("""

	$className(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link $className} instance at the specified memory address. */
	${access.modifier}$className(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link $className} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	${access.modifier}$className(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }
""")

		val members = visibleMembers
		if ( members.any() ) {
			println()
			generateGetters(AccessMode.INSTANCE, members)

			if ( mutable ) {
				println()
				generateSetters(AccessMode.INSTANCE, members)

				if ( members.singleOrNull() == null ) {
					val javadoc = "Initializes this struct with the specified values."
					// Factory constructors
					if ( generateAlternativeMultiSetter(members) ) {
						generateMultiSetter(javadoc, members, generateAlternativeMultiSetterParameters, generateAlternativeMultiSetterSetters, MultiSetterMode.ALTER1)
						if ( members.any { it is StructMemberCharArray } )
							generateMultiSetter(javadoc, members, generateAlternativeMultiSetterParameters, generateAlternativeMultiSetterSetters, MultiSetterMode.ALTER2)
					} else
						generateMultiSetter(javadoc, members, generateMultiSetterParameters, generateMultiSetterSetters)
				}

				print("""
	/** Unsafe version of {@link #set($className) set}. */
	public $className nset(long struct) {
		memCopy(struct, $ADDRESS, SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public $className set($className src) {
		return nset(src.$ADDRESS);
	}

	/** {@link ByteBuffer} version of {@link #set($className) set}. */
	public $className set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}
""")
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

	/**
	 * Create a {@link $className.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}
""")

		if ( members.any() ) {
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
		if ( members.any() ) {
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
		members: Sequence<StructMember>,
		indentation: String = "\t\t",
		parentField: String = "",
		more: Boolean = false
	) {
		members.forEachWithMore(more) { member, more ->
			if ( member.name === ANONYMOUS && member.isNestedStruct ) {
				generateOffsetFields(member.nestedMembers, indentation, parentField, more) // recursion
			} else {
				if ( more )
					println(",")

				val field = member.offsetField(parentField)

				print("$indentation$field")

				// Output nested field offsets
				if ( member.isNestedStructDefinition )
					generateOffsetFields(member.nestedMembers, "$indentation\t", field, true) // recursion
			}
		}
	}

	private fun getMemberCount(members: List<StructMember>): Int {
		var count = members.size
		for (member in members.asSequence().filter { it.isNestedStructDefinition })
			count += getMemberCount((member.nativeType as StructType).definition.members) // recursion
		return count
	}

	private fun PrintWriter.generateOffsetInit(
		members: List<StructMember>,
		indentation: String = "\t\t",
		parentField: String = "",
		offset: Int = 0
	): Int {
		var index = offset
		members.forEach {
			if ( it.name === ANONYMOUS && it.isNestedStruct ) {
				index = generateOffsetInit((it.nativeType as StructType).definition.members, indentation, parentField, index + 1) // recursion
			} else {
				val field = it.offsetField(parentField)
				try {
					if ( it is StructMemberPadding )
						return@forEach

					println("$indentation$field = ${if ( nativeLayout ) "offsets.get" else "layout.offsetof"}($index);")
				} finally {
					index++
				}

				// Output nested fields
				if ( it.isNestedStructDefinition )
					index = generateOffsetInit((it.nativeType as StructType).definition.members, "$indentation\t", field, index) // recursion
			}
		}
		return index
	}

	private fun PrintWriter.generateLayout(
		struct: Struct,
		indentation: String = "\t\t",
		parentField: String = ""
	) {
		println("__${if ( struct.union ) "union" else "struct"}(")
		struct.members.forEachWithMore { it, more ->
			val field = it.offsetField(parentField)

			if ( more )
				println(",")
			if ( it is StructMemberPadding ) {
				print("$indentation\t__padding(${it.size}, ${it.condition ?: "true"})")
			} else if ( it.isNestedStructDefinition ) {
				print("$indentation\t")
				generateLayout((it.nativeType as StructType).definition, "$indentation\t", field)
				//print(")")
			} else {
				val size: String
				val alignment: String

				if ( it.nativeType is StructType && !it.nativeType.includesPointer ) {
					size = "${it.nativeType.definition.className}.SIZEOF"
					alignment = "${it.nativeType.definition.className}.__ALIGNMENT"
				} else {
					size = if ( it.nativeType is PointerType || it.nativeType.mapping === PrimitiveMapping.POINTER )
						"POINTER_SIZE"
					else
						(it.nativeType.mapping as PrimitiveMapping).bytes.toString()
					alignment = size
				}

				if ( it is StructMemberArray )
					print("$indentation\t__array($size${if ( size != alignment ) ", $alignment" else ""}, ${it.size})")
				else
					print("$indentation\t__member($size${if ( size != alignment ) ", $alignment" else ""})")
			}
		}
		print("\n$indentation)")
	}

	private fun PrintWriter.generateMultiSetter(
		javaDoc: String,
		members: Sequence<StructMember>,
		generateParameters: PrintWriter.(Sequence<StructMember>, String, MultiSetterMode, Boolean) -> Unit,
		generateSetters: PrintWriter.(Sequence<StructMember>, String, MultiSetterMode) -> Unit,
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

	private val generateMultiSetterParameters: PrintWriter.(Sequence<StructMember>, String, MultiSetterMode, Boolean) -> Unit = { members, parentMember, mode, more ->
		members.forEachWithMore(more) { it, more ->
			val method = it.field(parentMember)

			if ( it.isNestedStructDefinition ) {
				generateMultiSetterParameters(it.nestedMembers, method, mode, more)
				return@forEachWithMore
			}

			if ( more )
				println(",")

			print("\t\t")

			val param = it.field(parentMember)

			when {
				it is StructMemberArray -> print("long $param,\n\t\tint ${param}Bytes")
				it.nativeType.isPointer -> print("long $param")
				else                    -> print("${it.nativeType.javaMethodType.simpleName} $param")
			}
		}
	}

	private val generateMultiSetterSetters: PrintWriter.(Sequence<StructMember>, String, MultiSetterMode) -> Unit = { members, parentMember, mode ->
		members.forEach {
			val setter = it.field(parentMember)

			if ( it.isNestedStructDefinition ) {
				generateMultiSetterSetters(it.nestedMembers, setter, mode)
			} else {
				val param = it.field(parentMember)
				println(if ( it is StructMemberArray )
					"\t\t$setter($param, ${param}Bytes);"
				else
					"\t\t$setter($param);")
			}
		}
	}

	private val generateAlternativeMultiSetter: (Sequence<StructMember>) -> Boolean = { members ->
		members.any {
			if ( it.isNestedStructDefinition )
				generateAlternativeMultiSetter(it.nestedMembers)
			else
				it is StructMemberArray || it.nativeType.isPointerData
		}
	}

	private val generateAlternativeMultiSetterParameters: PrintWriter.(Sequence<StructMember>, String, MultiSetterMode, Boolean) -> Unit = { members, parentMember, mode, more ->
		members.forEachWithMore(more) { it, more ->
			val method = it.field(parentMember)

			if ( it.isNestedStructDefinition ) {
				generateAlternativeMultiSetterParameters(it.nestedMembers, method, mode, more)
				return@forEachWithMore
			}

			if ( more )
				println(",")

			print("\t\t")

			val param = it.field(parentMember)

			if (it is StructMemberArray) {
				print(
					if ( it is StructMemberCharArray ) {
						when ( mode ) {
							MultiSetterMode.NORMAL,
							MultiSetterMode.ALTER1 -> "ByteBuffer $param"
							MultiSetterMode.ALTER2 -> "CharSequence $param"
						}
					} else if ( it.nativeType is StructType ) {
						if ( it.nativeType.includesPointer )
							"PointerBuffer $param"
						else
							"${it.nativeType.definition.className}.Buffer $param"
					} else
						"${(it.nativeType.mapping as PrimitiveMapping).toPointer.javaMethodType.simpleName} $param"
				)
			} else if ( it.nativeType.isPointerData && it.nativeType is StructType )
				print("${it.nativeType.definition.className} $param")
			else
				print("${it.nativeType.javaMethodType.simpleName} $param")
		}
	}

	private val generateAlternativeMultiSetterSetters: PrintWriter.(Sequence<StructMember>, String, MultiSetterMode) -> Unit = { members, parentMember, mode ->
		members.forEach {
			val method = it.field(parentMember)

			if ( it.isNestedStructDefinition )
				generateAlternativeMultiSetterSetters(it.nestedMembers, method, mode)
			else
				println("\t\t$method(${it.field(parentMember)});")
		}
	}

	private fun getFieldOffset(
		m: StructMember,
		parentStruct: Struct?,
		parentField: String
	) = if ( parentStruct == null || parentField.isEmpty() )
		"$className.${m.offsetField}"
	else if ( parentStruct.className === ANONYMOUS )
		"${parentField}_${m.offsetField}"
	else
		throw IllegalStateException()

	private fun PrintWriter.generateStaticSetters(
		members: Sequence<StructMember>,
		parentStruct: Struct? = null,
		parentMember: String = "",
		parentField: String = ""
	) {
		members.forEach {
			val setter = it.field(parentMember)
			val field = getFieldOffset(it, parentStruct, parentField)

			if ( it.isNestedStruct ) {
				val nestedStruct = (it.nativeType as StructType).definition
				val structType = nestedStruct.className
				if ( structType === ANONYMOUS )
					generateStaticSetters(
						it.nestedMembers, nestedStruct,
						if ( it.name === ANONYMOUS ) parentMember else setter,
						if ( it.name === ANONYMOUS ) parentField else field
					)
				else {
					println("\t/** Unsafe version of {@link #$setter($structType) $setter}. */")
					println("\tpublic static void n$setter(long $STRUCT, $structType value) { memCopy(value.$ADDRESS, $STRUCT + $field, $structType.SIZEOF); }")
				}
			} else {
				// Setter

				if ( it !is StructMemberArray && !it.nativeType.isPointerData ) {
					val javaType = it.nativeType.javaMethodType.simpleName
					val bufferMethod = getBufferMethod(it, javaType)

					println("\t/** Unsafe version of {@link #$setter($javaType) $setter}. */")
					println("\tpublic static void n$setter(long $STRUCT, $javaType value) { memPut$bufferMethod($STRUCT + $field, value${if ( javaType == "boolean" ) " ? (byte)1 : (byte)0" else ""}); }")
				}

				// Alternative setters

				if ( it is StructMemberArray ) {
					if ( it.nativeType is StructType ) {
						val structType = it.nativeType.definition.className
						if ( it.nativeType.includesPointer ) {
							println("\t/** Unsafe version of {@link #$setter(PointerBuffer) $setter}. */")
							println("\tpublic static void n$setter(long $STRUCT, PointerBuffer value) {")
							println("\t\tif ( CHECKS ) checkBufferGT(value, ${it.size});")
							println("\t\tmemCopy(memAddress(value), $STRUCT + $field, value.remaining() * POINTER_SIZE);")
							println("\t}")
							println("\t/** Unsafe version of {@link #$setter(int, $structType) $setter}. */")
							println("\tpublic static void n$setter(long $STRUCT, int index, $structType value) { memPutAddress($STRUCT + $field + index * POINTER_SIZE, value.$ADDRESS); }")
						} else {
							println("\t/** Unsafe version of {@link #$setter($structType.Buffer) $setter}. */")
							println("\tpublic static void n$setter(long $STRUCT, $structType.Buffer value) {")
							println("\t\tif ( CHECKS ) checkBufferGT(value, ${it.size});")
							println("\t\tmemCopy(value.$ADDRESS, $STRUCT + $field, value.remaining() * $structType.SIZEOF);")
							println("\t}")
							println("\t/** Unsafe version of {@link #$setter(int, $structType) $setter}. */")
							println("\tpublic static void n$setter(long $STRUCT, int index, $structType value) { memCopy(value.$ADDRESS, $STRUCT + $field + index * $structType.SIZEOF, $structType.SIZEOF); }")
						}
					} else if ( it is StructMemberCharArray ) {
						val mapping = it.nativeType.mapping as PrimitiveMapping
						val byteSize = it.size * mapping.bytes

						println("\t/** Unsafe version of {@link #$setter(ByteBuffer) $setter}. */")
						println("\tpublic static void n$setter(long $STRUCT, ByteBuffer value) {")
						println("\t\tif ( CHECKS ) {")
						println("\t\t\tcheckNT${mapping.bytes}(value);")
						println("\t\t\tcheckBufferGT(value, $byteSize);")
						println("\t\t}")
						println("\t\tmemCopy(memAddress(value), $STRUCT + $field, value.remaining());")
						println("\t}")

						println("\t/** Unsafe version of {@link #$setter(CharSequence) $setter}. */")
						println("\tpublic static void n$setter(long $STRUCT, CharSequence value) { memEncode${(it.nativeType.mapping as CharMapping).charset}(value, true, memByteBuffer($STRUCT + $field, $byteSize)); }")
					} else {
						val mapping = it.nativeType.mapping as PrimitiveMapping
						val bytesPerElement = if ( mapping === PrimitiveMapping.POINTER ) "POINTER_SIZE" else mapping.bytes.toString()
						val bufferType = mapping.toPointer.javaMethodType.simpleName

						println("\t/** Unsafe version of {@link #$setter($bufferType) $setter}. */")
						println("\tpublic static void n$setter(long $STRUCT, $bufferType value) {")
						println("\t\tif ( CHECKS ) checkBufferGT(value, ${it.size});")
						println("\t\tmemCopy(memAddress(value), $STRUCT + $field, value.remaining() * $bytesPerElement);")
						println("\t}")

						println("\t/** Unsafe version of {@link #$setter(int, ${mapping.javaMethodType}) $setter}. */")
						print("\tpublic static void n$setter(long $STRUCT, int index, ${mapping.javaMethodType} value) { ")
						print(
							when ( mapping ) {
								PrimitiveMapping.POINTER -> "memPutAddress($STRUCT + $field + index * POINTER_SIZE, value);"
								else                     -> "memPut${bufferMethodMap[mapping.javaMethodType.simpleName]}($STRUCT + $field + index * $bytesPerElement, value);"
							}
						)
						println(" }")
					}
				} else if ( it.nativeType is CharSequenceType ) {
					val mapping = it.nativeType.charMapping

					println("\t/** Unsafe version of {@link #$setter(ByteBuffer) $setter}. */")
					println("\tpublic static void n$setter(long $STRUCT, ByteBuffer value) { ")
					println("\t\tif ( CHECKS && value != null ) checkNT${mapping.bytes}(value); ")
					println("\t\tmemPutAddress($STRUCT + $field, memAddressSafe(value));")
					println("\t}")

					println("\t/** Unsafe version of {@link #$setter(CharSequence) $setter}. */")
					println("\tpublic static void n$setter(long $STRUCT, CharSequence value) { n$setter($STRUCT, memEncode${mapping.charset}(value, BufferAllocator.MALLOC)); }")
				} else if ( it.nativeType.isPointerData ) {
					if ( it.nativeType is StructType ) {
						val structType = it.nativeType.definition.className
						println("\t/** Unsafe version of {@link #$setter($structType) $setter}. */")
						println("\tpublic static void n$setter(long $STRUCT, $structType value) { memPutAddress($STRUCT + $field, value.$ADDRESS); }")
					} else {
						val bufferType = it.nativeType.javaMethodType.simpleName
						println("\t/** Unsafe version of {@link #$setter($bufferType) $setter}. */")
						println("\tpublic static void n$setter(long $STRUCT, $bufferType value) { memPutAddress($STRUCT + $field, memAddressSafe(value)); }")
					}
				}
			}
		}
	}

	private fun PrintWriter.generateSetters(
		accessMode: AccessMode,
		members: Sequence<StructMember>,
		parentMember: String = ""
	) {
		members.forEach {
			val setter = it.field(parentMember)
			val field = it.name

			val indent = accessMode.indent;
			val returnType = if ( accessMode === AccessMode.INSTANCE )
				className
			else
				"$className.Buffer"

			if ( it.isNestedStruct ) {
				val structType = (it.nativeType as StructType).definition.className
				if ( structType === ANONYMOUS )
					generateSetters(accessMode, it.nestedMembers, if ( field === ANONYMOUS ) parentMember else field)
				else {
					println("$indent/** Copies the specified {@link $structType} to the {@code $field} field. */")
					println("${indent}public $returnType $setter($structType value) { n$setter($ADDRESS, value); return this; }")
				}
			} else {
				// Setter

				if ( it !is StructMemberArray && !it.nativeType.isPointerData ) {
					println("$indent/** Sets the specified value to the {@code $field} field. */")
					println("${indent}public $returnType $setter(${it.nativeType.javaMethodType.simpleName} value) { n$setter($ADDRESS, value); return this; }")
				}

				// Alternative setters

				if ( it is StructMemberArray ) {
					if ( it.nativeType is StructType ) {
						val structType = it.nativeType.definition.className
						if ( it.nativeType.includesPointer ) {
							println("$indent/** Copies the specified {@link PointerBuffer} to the {@code $field} field. */")
							println("${indent}public $returnType $setter(PointerBuffer value) { n$setter($ADDRESS, value); return this; }")
							println("$indent/** Copies the address of the specified {@link $structType} at the specified index of the {@code $field} field. */")
						} else {
							println("$indent/** Copies the specified {@link $structType.Buffer} to the {@code $field} field. */")
							println("${indent}public $returnType $setter($structType.Buffer value) { n$setter($ADDRESS, value); return this; }")
							println("$indent/** Copies the specified {@link $structType} at the specified index of the {@code $field} field. */")
						}
						println("${indent}public $returnType $setter(int index, $structType value) { n$setter($ADDRESS, index, value); return this; }")
					} else if ( it is StructMemberCharArray ) {
						println("$indent/** Copies the specified encoded string to the {@code $field} field. */")
						println("${indent}public $returnType $setter(ByteBuffer value) { n$setter($ADDRESS, value); return this; }")
						println("$indent/** Encodes the specified {@link CharSequence} to the {@code $field} field. */")
						println("${indent}public $returnType $setter(CharSequence value) { n$setter($ADDRESS, value); return this; }")
					} else {
						val bufferType = (it.nativeType.mapping as PrimitiveMapping).toPointer.javaMethodType.simpleName
						println("$indent/** Copies the specified {@link $bufferType} to the {@code $field} field. */")
						println("${indent}public $returnType $setter($bufferType value) { n$setter($ADDRESS, value); return this; }")
						println("$indent/** Sets the specified value at the specified index of the {@code $field} field. */")
						println("${indent}public $returnType $setter(int index, ${it.nativeType.mapping.javaMethodType} value) { n$setter($ADDRESS, index, value); return this; }")
					}
				} else if ( it.nativeType is CharSequenceType ) {
					println("$indent/** Sets the address of the specified encoded string to the {@code $field} field. */")
					println("${indent}public $returnType $setter(ByteBuffer value) { n$setter($ADDRESS, value); return this; }")
					println(
						"""	/**
	 * Encodes the specified {@link CharSequence} and sets the address of the encoded string to the {@code $field} field.
	 *
	 * <p>The encoded string must be explicitly freed with {@link MemoryUtil#memFree memFree}.</p>
	*/""")
					println("${indent}public $returnType $setter(CharSequence value) { n$setter($ADDRESS, value); return this; }")
				} else if ( it.nativeType.isPointerData ) {
					val pointerType = if ( it.nativeType is StructType )
						it.nativeType.definition.className
					else
						it.nativeType.javaMethodType.simpleName
					println("$indent/** Sets the address of the specified {@link $pointerType} to the {@code $field} field. */")
					println("${indent}public $returnType $setter($pointerType value) { n$setter($ADDRESS, value); return this; }")
				}
			}
		}
	}

	private fun PrintWriter.generateStaticGetters(
		members: Sequence<StructMember>,
		parentStruct: Struct? = null,
		parentMember: String = "",
		parentField: String = ""
	) {
		members.forEach {
			val getter = it.field(parentMember)
			val field = getFieldOffset(it, parentStruct, parentField)

			if ( it.isNestedStruct ) {
				val nestedStruct = (it.nativeType as StructType).definition
				val structType = nestedStruct.className
				if ( structType === ANONYMOUS )
					generateStaticGetters(
						it.nestedMembers, nestedStruct,
						if ( it.name === ANONYMOUS ) parentMember else getter,
						if ( it.name === ANONYMOUS ) parentField else field
					)
				else {
					println("\t/** Unsafe version of {@link #$getter}. */")
					println("\tpublic static $structType n$getter(long $STRUCT) { return new $structType($STRUCT + $field); }")
				}
			} else {
				// Getter

				if ( it !is StructMemberArray && !it.nativeType.isPointerData ) {
					println("\t/** Unsafe version of {@link #$getter}. */")
					if ( it.nativeType is CallbackType ) {
						val callbackType = it.nativeType.className

						println("\tpublic static $callbackType n$getter(long $STRUCT) { return org.lwjgl.system.libffi.Closure.create(memGetAddress($STRUCT + $field)); }")
					} else {
						val javaType = it.nativeType.javaMethodType.simpleName
						val bufferMethod = getBufferMethod(it, javaType)

						print("\tpublic static $javaType n$getter(long $STRUCT) { return memGet$bufferMethod($STRUCT + $field)")
						if ( it.nativeType.mapping === PrimitiveMapping.BOOLEAN )
							print(" != 0")
						println("; }")
					}
				}

				// Alternative getters

				if ( it is StructMemberArray ) {
					if ( it.nativeType is StructType ) {
						val nestedStruct = it.nativeType.definition.className
						if ( it.nativeType.includesPointer ) {
							println("\t/** Unsafe version of {@link #$getter}. */")
							println("\tpublic static PointerBuffer n$getter(long $STRUCT) {")
							println("\t\treturn memPointerBuffer($STRUCT + $field, ${it.size});")
							println("\t}")
							println("\t/** Unsafe version of {@link #$getter(int) $getter}. */")
							println("\tpublic static $nestedStruct n$getter(long $STRUCT, int index) {")
							println("\t\treturn new $nestedStruct(memGetAddress($STRUCT + $field + index * POINTER_SIZE));")
							println("\t}")
						} else {
							println("\t/** Unsafe version of {@link #$getter}. */")
							println("\tpublic static $nestedStruct.Buffer n$getter(long $STRUCT) {")
							println("\t\treturn $nestedStruct.createBuffer($STRUCT + $field, ${it.size});")
							println("\t}")
							println("\t/** Unsafe version of {@link #$getter(int) $getter}. */")
							println("\tpublic static $nestedStruct n$getter(long $STRUCT, int index) {")
							println("\t\treturn new $nestedStruct($STRUCT + $field + index * $nestedStruct.SIZEOF);")
							println("\t}")
						}
					} else if ( it is StructMemberCharArray ) {
						val mapping = it.nativeType.mapping as CharMapping

						println("\t/** Unsafe version of {@link #$getter}. */")
						println("\tpublic static ByteBuffer n$getter(long $STRUCT) { return memByteBuffer($STRUCT + $field, ${it.size * mapping.bytes}); }")
						println("\t/** Unsafe version of {@link #${getter}String}. */")
						println("\tpublic static String n${getter}String(long $STRUCT) { return memDecode${mapping.charset}($STRUCT + $field); }")
					} else {
						val mapping = it.nativeType.mapping as PrimitiveMapping
						val bufferType = mapping.toPointer.javaMethodType.simpleName

						println("\t/** Unsafe version of {@link #$getter}. */")
						println("\tpublic static $bufferType n$getter(long $STRUCT) {")
						println("\t\treturn mem$bufferType($STRUCT + $field, ${it.size});")
						println("\t}")

						val javaType = mapping.javaMethodType.simpleName
						val bufferMethod = getBufferMethod(it, javaType)

						println("\t/** Unsafe version of {@link #$getter(int) $getter}. */")
						println("\tpublic static $javaType n$getter(long $STRUCT, int index) { return memGet$bufferMethod($STRUCT + $field + index * ${mapping.bytes}); }")
					}
				} else if ( it.nativeType is CharSequenceType ) {
					var mapping = it.nativeType.charMapping
					println("\t/** Unsafe version of {@link #$getter}. */")
					println("\tpublic static ByteBuffer n$getter(long $STRUCT) { return memByteBufferNT${mapping.bytes}(memGetAddress($STRUCT + $field)); }")
					println("\t/** Unsafe version of {@link #${getter}String}. */")
					println("\tpublic static String n${getter}String(long $STRUCT) { return memDecode${mapping.charset}(memGetAddress($STRUCT + $field)); }")
				} else if ( it.nativeType is StructType ) {
					val structType = it.nativeType.definition.className
					println("\t/** Unsafe version of {@link #$getter}. */")
					println("\tpublic static $structType n$getter(long $STRUCT) { return new $structType(memGetAddress($STRUCT + $field)); }")
				} else if ( it.nativeType.isPointerData ) {
					val bufferType = it.nativeType.javaMethodType.simpleName
					println("\t/** Unsafe version of {@link #$getter(int) $getter}. */")
					println("\tpublic static $bufferType n$getter(long $STRUCT, int $BUFFER_CAPACITY_PARAM) { return mem$bufferType(memGetAddress($STRUCT + $field), $BUFFER_CAPACITY_PARAM); }")
				}
			}
		}
	}

	private fun PrintWriter.generateGetters(
		accessMode: AccessMode,
		members: Sequence<StructMember>,
		parentMember: String = ""
	) {
		members.forEach {
			val getter = it.field(parentMember)

			val indent = accessMode.indent

			if ( it.isNestedStruct ) {
				val nestedStruct = (it.nativeType as StructType).definition
				val structType = nestedStruct.className
				if ( structType === ANONYMOUS )
					generateGetters(accessMode, it.nestedMembers, if ( it.name === ANONYMOUS ) parentMember else getter)
				else {
					println("$indent/** Returns a {@link $structType} view of the {@code $getter} field. */")
					println("${indent}public $structType $getter() { return n$getter($ADDRESS); }")
				}
			} else {
				// Getter

				if ( it !is StructMemberArray && !it.nativeType.isPointerData ) {
					if ( it.nativeType is CallbackType ) {
						val callbackType = it.nativeType.className

						println("$indent/** Returns the {@code $callbackType} instance at the {@code $getter} field. */")
						println("${indent}public $callbackType $getter() { return n$getter($ADDRESS); }")
					} else {
						println("$indent/** Returns the value of the {@code $getter} field. */")
						println("${indent}public ${it.nativeType.javaMethodType.simpleName} $getter() { return n$getter($ADDRESS); }")
					}
				}

				// Alternative getters

				if ( it is StructMemberArray ) {
					if ( it.nativeType is StructType ) {
						val structType = it.nativeType.definition.className
						if (  it.nativeType.includesPointer ) {
							println("$indent/** Returns a {@link PointerBuffer} view of the {@code $getter} field. */")
							println("${indent}public PointerBuffer $getter() { return n$getter($ADDRESS); }")
							println("$indent/** Returns a {@link $structType} view of the pointer at the specified index of the {@code $getter}. */")
							println("${indent}public $structType $getter(int index) { return n$getter($ADDRESS, index); }")
						} else {
							println("$indent/** Returns a {@link $structType}.Buffer view of the {@code $getter} field. */")
							println("${indent}public $structType.Buffer $getter() { return n$getter($ADDRESS); }")
							println("$indent/** Returns a {@link $structType} view of the struct at the specified index of the {@code $getter} field. */")
							println("${indent}public $structType $getter(int index) { return n$getter($ADDRESS, index); }")
						}
					} else if ( it is StructMemberCharArray ) {
						println("$indent/** Returns a {@link ByteBuffer} view of the {@code $getter} field. */")
						println("${indent}public ByteBuffer $getter() { return n$getter($ADDRESS); }")
						println("$indent/** Decodes the null-terminated string stored in the {@code $getter} field. */")
						println("${indent}public String ${getter}String() { return n${getter}String($ADDRESS); }")
					} else {
						val bufferType = (it.nativeType.mapping as PrimitiveMapping).toPointer.javaMethodType.simpleName
						println("$indent/** Returns a {@link $bufferType} view of the {@code $getter} field. */")
						println("${indent}public $bufferType $getter() { return n$getter($ADDRESS); }")
						println("$indent/** Returns the value at the specified index of the {@code $getter} field. */")
						println("${indent}public ${it.nativeType.javaMethodType.simpleName} $getter(int index) { return n$getter($ADDRESS, index); }")
					}
				} else if ( it.nativeType is CharSequenceType ) {
					println("$indent/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code $getter} field. */")
					println("${indent}public ByteBuffer $getter() { return n$getter($ADDRESS); }")
					println("$indent/** Decodes the null-terminated string pointed to by the {@code $getter} field. */")
					println("${indent}public String ${getter}String() { return n${getter}String($ADDRESS); }")
				} else if ( it.nativeType is StructType ) {
					val structType = it.nativeType.definition.className
					println("$indent/** Returns a {@link $structType} view of the struct pointed to by the {@code $getter} field. */")
					println("${indent}public ${it.nativeType.definition.className} $getter() { return n$getter($ADDRESS); }")
				} else if ( it.nativeType.isPointerData ) {
					val bufferType = it.nativeType.javaMethodType.simpleName
					println(
						"""$indent/**
$indent * Returns a {@link $bufferType} view of the data pointed to by the {@code $getter} field.
$indent *
$indent * @param $BUFFER_CAPACITY_PARAM the number of elements in the returned {@link $bufferType}
$indent */""")
					println("${indent}public $bufferType $getter(int $BUFFER_CAPACITY_PARAM) { return n$getter($ADDRESS, $BUFFER_CAPACITY_PARAM); }")
				}
			}
		}
	}

	private fun getBufferMethod(member: StructMember, javaType: String) = if ( member.nativeType.isPointer )
		"Address"
	else
		bufferMethodMap[javaType] ?: throw UnsupportedOperationException("Unsupported struct member java type: $className.${member.name} ($javaType)")

	override val skipNative: Boolean get() = !nativeLayout && members.isNotEmpty()

	override fun PrintWriter.generateNative() {
		print(HEADER)
		println("#include <stddef.h>")
		preamble.printNative(this)

		println("\nEXTERN_C_EXIT\n")

		print("JNIEXPORT jint JNICALL Java_${nativeFileNameJNI}_offsets(JNIEnv *$JNIENV, jclass clazz")
		if ( members.filter { it !is StructMemberPadding }.isNotEmpty() ) {
			println(", jlong bufferAddress) {")
			println("\tjint *buffer = (jint *)(intptr_t)bufferAddress;\n")
		} else {
			println(") {")
		}

		println("\tUNUSED_PARAMS($JNIENV, clazz)\n")

		if ( virtual ) {
			// NOTE: Assumes a plain struct definition (no nested structs, no unions)
			println("\ttypedef struct $nativeName {")
			for (m in members) {
				print("\t\t${m.nativeType.name}")
				if ( m.nativeType is PointerType && !m.nativeType.includesPointer ) {
					if ( !m.nativeType.name.endsWith('*') )
						print(' ')
					print('*')
				}
				println(" ${m.name};")
			}
			println("\t} $nativeName;\n")
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
		members.forEach {
			println("\tbuffer[$index] = (jint)offsetof($nativeName, $prefix${it.name});")
			index++

			if ( it.isNestedStruct ) {
				// Output nested structs
				val structType = it.nativeType as StructType
				if ( structType.name == ANONYMOUS )
					index = generateNativeMembers(structType.definition.members, index, prefix = "$prefix${it.name}.") // recursion
			}
		}
		return index
	}

}

fun struct(
	packageName: String,
	className: String,
	nativeSubPath: String = "",
	nativeName: String = className,
	virtual: Boolean = false,
	mutable: Boolean = true,
	nativeLayout: Boolean = false,
	init: Struct.() -> Unit
): Struct {
	val struct = Struct(packageName, className, nativeSubPath, nativeName, false, virtual, mutable, nativeLayout)
	struct.init()
	Generator.register(struct)
	return struct
}

fun struct_p(
	packageName: String,
	className: String,
	nativeSubPath: String = "",
	nativeName: String = className,
	virtual: Boolean = false,
	mutable: Boolean = true,
	nativeLayout: Boolean = false,
	init: Struct.() -> Unit
) = struct(packageName, className, nativeSubPath, nativeName, virtual, mutable, nativeLayout, init).nativeType.p

fun union(
	packageName: String,
	className: String,
	nativeSubPath: String = "",
	nativeName: String = className,
	virtual: Boolean = false,
	mutable: Boolean = true,
	nativeLayout: Boolean = false,
	init: Struct.() -> Unit
): Struct {
	val struct = Struct(packageName, className, nativeSubPath, nativeName, true, virtual, mutable, nativeLayout)
	struct.init()
	Generator.register(struct)
	return struct
}

fun union_p(
	packageName: String,
	className: String,
	nativeSubPath: String = "",
	nativeName: String = className,
	virtual: Boolean = false,
	mutable: Boolean = true,
	nativeLayout: Boolean = false,
	init: Struct.() -> Unit
) = union(packageName, className, nativeSubPath, nativeName, virtual, mutable, nativeLayout, init).nativeType.p