/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import java.io.PrintWriter
import java.util.*

private val STRUCT = "struct"
private val ANONYMOUS = "*" // very easy to introduce bugs, unless this is an invalid character in Java identifiers

open class StructMember(
	val nativeType: NativeType,
	val name: String,
	val documentation: String
) : TemplateElement() {

	init {
		if ( nativeType is StructType && nativeType.includesPointer )
			nativeType.definition.hasUsageInput()
	}

	internal val offsetField: String
		get() = name.toUpperCase()

	internal fun offsetField(parentField: String): String {
		return if ( parentField.isEmpty() )
			offsetField
		else
			"${parentField}_$offsetField"
	}

	internal fun field(parentMember: String) = if ( parentMember.isEmpty() )
		if ( name == "class" ) "$name\$" else name // TODO: use a list of Java keywords here
	else
		"${parentMember}_$name"

	var mutable = false

	internal var links: String = ""
	internal var linkMode: LinkMode = LinkMode.SINGLE

	fun links(links: String, linkMode: LinkMode = LinkMode.SINGLE) {
		this.links = links
		this.linkMode = linkMode
	}
}

private class StructMemberBuffer(
	nativeType: StructType,
	name: String,
	documentation: String
) : StructMember(nativeType, name, documentation)

private open class StructMemberArray(
	nativeType: NativeType,
	name: String,
	documentation: String,
	/** Number of elements in the array. */
	val size: String,
	/** Number of pointer elements that must not be null. */
	val validSize: String
) : StructMember(nativeType, name, documentation) {

	val primitiveMapping: PrimitiveMapping get() = nativeType.let {
		if ( it is PointerType ) PrimitiveMapping.POINTER else it.mapping as PrimitiveMapping
	}

}

private class StructMemberCharArray(
	nativeType: CharType,
	name: String,
	documentation: String,
	size: String
) : StructMemberArray(nativeType, name, documentation, size, size)

private class StructMemberPadding(size: String, val condition: String?) : StructMemberArray(char, ANONYMOUS, "", size, size)

private enum class MultiSetterMode {
	NORMAL,
	ALTER
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

	/* Output parameter or function result by value */
	private var usageOutput = false
	fun hasUsageOutput() {
		usageOutput = true
	}

	/* Input parameter */
	private var usageInput = false
	fun hasUsageInput() {
		usageInput = true
	}

	/* Function result by reference */
	private var usageResultPointer = false
	fun hasUsageResultPointer() {
		usageResultPointer = true
	}

	private var static: String? = null
	fun static(expression: String) {
		static = expression
	}

	private val members = ArrayList<StructMember>()

	private val visibleMembers: Sequence<StructMember>
		get() = members.asSequence().filter { it !is StructMemberPadding }

	private val mutableMembers: Sequence<StructMember>
		get() = visibleMembers.let {
			if ( mutable ) it else it.filter { it -> it.mutable }
		}

	private val hasMutableMembers: Boolean get() = members.isNotEmpty() && (mutable || mutableMembers.any())

	private fun add(member: StructMember): StructMember {
		members.add(member)
		return member
	}

	// Plain field
	fun NativeType.member(name: String, documentation: String) = add(StructMember(this, name, documentation))

	// Points to an array of structs, not a single struct
	fun PointerType.buffer(name: String, documentation: String): StructMember {
		if ( this !is StructType )
			throw IllegalArgumentException()

		return add(StructMemberBuffer(this, name, documentation))
	}

	// Array field
	fun NativeType.array(name: String, documentation: String, size: Int, validSize: Int = size)
		= array(name, documentation, size.toString(), validSize.toString())
	fun NativeType.array(name: String, documentation: String, size: String, validSize: String = size)
		= add(StructMemberArray(this, name, documentation, size, validSize))

	// CharSequence special-case
	fun CharType.array(name: String, documentation: String, size: Int) = array(name, documentation, size.toString())
	fun CharType.array(name: String, documentation: String, size: String) = add(StructMemberCharArray(this, name, documentation, size))

	fun padding(size: Int, condition: String? = null) = add(StructMemberPadding(size.toString(), condition))

	/** Anonymous nested member struct definition. */
	fun struct(init: Struct.() -> Unit): StructMember {
		return struct(ANONYMOUS, ANONYMOUS, init)
	}

	/** Nested member struct definition. */
	fun struct(name: String, documentation: String, init: Struct.() -> Unit): StructMember {
		val struct = Struct(ANONYMOUS, ANONYMOUS, "", ANONYMOUS, false, false, true, false)
		struct.init()
		return StructType(struct).member(name, documentation)
	}

	/** Anonymous nested member union definition. */
	fun union(init: Struct.() -> Unit): StructMember {
		return union(ANONYMOUS, ANONYMOUS, init)
	}

	/** Nested member union definition. */
	fun union(name: String, documentation: String, init: Struct.() -> Unit): StructMember {
		val struct = Struct(ANONYMOUS, ANONYMOUS, "", ANONYMOUS, true, false, true, false)
		struct.init()
		return StructType(struct).member(name, documentation)
	}

	/** The nested struct's members are embedded in the parent struct. */
	private val StructMember.isNestedStruct: Boolean
		get() = nativeType is StructType && !nativeType.includesPointer && this !is StructMemberArray

	/** The nested struct is not defined elsewhere, it's part of the parent struct's definition */
	private val StructMember.isNestedStructDefinition: Boolean
		get() = isNestedStruct && (nativeType as StructType).name == ANONYMOUS

	private val StructMember.nestedMembers: Sequence<StructMember>
		get() = (nativeType as StructType).definition.visibleMembers

	private val containsUnion: Boolean get() =
	union || members.any {
		it.isNestedStruct && (it.nativeType as StructType).let {
			if ( it.name == ANONYMOUS )
				it.definition.containsUnion
			else
				it.definition.union
		}
	}

	internal val validations: Sequence<String> by lazy {
		if ( union )
			return@lazy emptySequence<String>()

		val validations = ArrayList<String>()

		fun MutableList<String>.addPointer(m: StructMember) = this.add("\t\tlong ${m.name} = memGetAddress($STRUCT + $className.${m.offsetField});")
		fun MutableList<String>.addCount(m: StructMember) = this.add("\t\t${m.nativeType.javaMethodType} ${m.name} = n${m.name}($STRUCT);")

		fun validate(m: StructMember, indent: String, hasPointer: Boolean = false): String {
			return if ( m.nativeType is StructType && m.nativeType.definition.validations.any() ) {
				if ( m is StructMemberArray ) {
					"""${if ( hasPointer ) "" else "${indent}long ${m.name} = $STRUCT + $className.${m.offsetField};\n"}${indent}for ( int i = 0; i < ${m.size}; i++ ) {
${ if ( m.validSize == m.size ) "$indent   checkPointer(memGetAddress(${m.name}));" else
						"""$indent   if ( i < ${m.validSize} )
$indent       checkPointer(memGetAddress(${m.name}));
$indent   else if ( memGetAddress(${m.name}) == NULL )
$indent       break;"""}
$indent   ${m.nativeType.javaMethodType}.validate(${m.name});
$indent   ${m.name} += POINTER_SIZE;
$indent}"""
				} else {
					"${if ( hasPointer ) "" else
						"${indent}long ${m.name} = memGetAddress($STRUCT + $className.${m.offsetField});\n" +
						"${indent}checkPointer(${m.name});\n"
					}$indent${m.nativeType.javaMethodType}.validate(${m.name}${getReferenceMember(AutoSizeMember, m.name).let { if ( it != null ) ", ${it.name}" else "" }});"
				}
			} else
				"${indent}checkPointer(memGetAddress($STRUCT + $className.${m.offsetField}));"
		}

		fun validationBlock(condition: String, validations: String): String = validations.contains('\n').let { needBraces ->
			"\t\tif ( $condition )${if ( needBraces ) " {" else ""}\n$validations${if ( needBraces ) "\n\t\t}" else ""}"
		}

		mutableMembers.forEach { m ->
			if ( m has AutoSizeMember ) {
				m[AutoSizeMember].let { autoSize ->
					val refs = autoSize.members(mutableMembers)

					if ( autoSize.atLeastOne ) {
						// TODO: There will be redundancy here when one of the refs is a validateable struct array. But we don't have a case for it yet.
						validations.addCount(m)

						// if m != 0, make sure one of the auto-sized members is not null
						validations.add(
							"\t\tif (${if ( autoSize.optional ) "\n\t\t\t${m.name} != 0 &&" else "\n\t\t\t${m.name} == 0 || ("}${
							refs.map { "\n\t\t\tmemGetAddress($STRUCT + $className.${it.offsetField}) == NULL" }.joinToString(" &&")
							}\n\t\t${if ( autoSize.optional ) "" else ")"}) {\n\t\t\tthrow new NullPointerException(\"At least one of ${refs.map { it.name }.joinToString()} must not be null\");\n\t\t}"
						)
					} else if ( autoSize.optional ) {
						val refValidations = refs.filter { !it.has(nullable) }.map { ref ->
							validate(ref, "\t\t\t")
						}.joinToString("\n")

						if ( refValidations.isEmpty() )
							return@let

						// if m != 0, make sure auto-sized members are not null
						validations.add(
							validationBlock("${if ( refValidations.contains(", ${m.name})") ) {
								validations.addCount(m)
								m.name
							} else "n${m.name}($STRUCT)"} != 0", refValidations)
						)
					} else if ( refs.any { it.nativeType is StructType && it.nativeType.definition.validations.any() } )
						validations.addCount(m)
				}
			} else if ( m.nativeType is PointerType && getReferenceMember(AutoSizeMember, m.name)?.get(AutoSizeMember).let { it == null || !it.optional } ) {
				if ( m.nativeType is StructType && m.nativeType.definition.validations.any() ) {
					validations.add(
						if ( m.nativeType.includesPointer ) {
							if ( m.has(nullable) ) {
								validations.addPointer(m)
								validationBlock("${m.name} != NULL", validate(m, "\t\t\t", hasPointer = true))
							} else
								validate(m, "\t\t")
						} else
							"\t\t${m.nativeType.javaMethodType}.validate($STRUCT + $className.${m.offsetField});"
					)
				} else if ( !m.has(nullable) && !(m.nativeType is StructType && !m.nativeType.includesPointer) ) {
					validations.add(validate(m, "\t\t"))
				}
			}
		}

		validations.asSequence()
	}

	/** Returns a member that has the specified ReferenceModifier with the specified reference. Returns null if no such parameter exists. */
	private fun getReferenceMember(modifierObject: ModifierKey<*>, reference: String) = members.firstOrNull {
		it.hasRef(modifierObject, reference)
	} // Assumes at most 1 parameter will be found that references the specified parameter

	private fun PrintWriter.printDocumentation() {
		val builder = StringBuilder()

		val members = members.filter { it !is StructMemberPadding }
		if ( documentation != null ) {
			builder.append(documentation)
			if ( members.isNotEmpty() )
				builder.append("\n\n")
		}

		if ( members.isNotEmpty() ) {
			val memberDoc = printMemberDocumentation()
			if ( memberDoc.isNotEmpty() )
				builder
					.append("<h3>Member documentation</h3>\n\n")
					.append(ul(*memberDoc.toTypedArray()))
					.append("\n\n")

			builder.append("<h3>Layout</h3>\n\n")
			builder.append(codeBlock(printStructLayout()))
		}

		if ( builder.length != 0 )
			println(processDocumentation(builder.toString()).toJavaDoc(indentation = ""))
	}

	private val nativeNameQualified: String get() {
		val type = if ( union ) "union " else "struct "
		return if ( nativeName.startsWith(type) )
			nativeName
		else if ( nativeName === ANONYMOUS )
			type.substring(0, type.length - 1)
		else
			"$type$nativeName"
	}

	private fun Struct.printStructLayout(indentation: String = ""): String {
		val memberIndentation = "$indentation    "
		return """$nativeNameQualified {
${members.map {
			if ( it.isNestedStructDefinition )
				"${(it.nativeType as StructType).definition.printStructLayout(memberIndentation)}${if ( it.name === ANONYMOUS ) "" else " ${it.name}"};"
			else {
				val nativeType = if ( it.nativeType is StructType && !it.nativeType.includesPointer )
					"{@link ${it.nativeType.javaMethodType} ${it.nativeType.name}}"
				else
					it.nativeType.let {
						if ( it is PointerType && !it.includesPointer )
							"${it.name}${if ( !it.name.endsWith('*') ) " " else ""}*"
						else
							it.name
					}
				"$nativeType${if ( it.name === ANONYMOUS ) "" else " ${it.name}"}${if ( it is StructMemberArray ) "[${it.size}]" else ""};"
			}
		}.joinToString("\n$memberIndentation", prefix = memberIndentation)}
$indentation}"""
	}

	private fun Struct.printMemberDocumentation(prefix: String = "", documentation: MutableList<String> = ArrayList<String>()): List<String> {
		members.forEach {
			if ( it.isNestedStructDefinition )
				(it.nativeType as StructType).definition.printMemberDocumentation(if (it.name === ANONYMOUS) prefix else "$prefix${it.name}.", documentation)
			else if ( it.documentation.isNotEmpty() ) {
				val doc = if ( it.links.isEmpty() )
					it.documentation
				else if ( it.links.any { it == '#' } )
					it.linkMode.appendLinks(it.documentation, it.links)
				else {
					val regex = it.links.toRegex()
					val tokens = Generator.tokens[packageName]!!.keys.filter { regex.matches(it) }
					if ( tokens.isEmpty() )
						throw IllegalStateException("Failed to match any tokens with regex: ${it.links}")

					it.linkMode.appendLinks(it.documentation, tokens.sorted().joinToString(" #", prefix = "#"))
				}
				documentation.add("{@code $prefix${it.name}} &ndash; $doc")
			}
		}
		return documentation
	}

	private fun StructMember.error(msg: String) {
		throw IllegalArgumentException("$msg [${this@Struct.className}, member: $name]")
	}

	private fun validate() {
		members.filter { it has AutoSizeMember }.forEach {
			val autoSize = it[AutoSizeMember]

			autoSize.references.forEachIndexed { i, reference ->
				val bufferParam = members.firstOrNull { it.name == reference }
				if ( bufferParam == null )
					it.error("Reference does not exist: AutoSize($reference)")
				else {
					when {
						bufferParam.nativeType !is PointerType
						                                      -> it.error("Reference must be a pointer type: AutoSize($reference)")
						!bufferParam.nativeType.isPointerData -> it.error("Reference must not be a opaque pointer: AutoSize($reference)")
						bufferParam.nativeType is StructType && !(bufferParam is StructMemberBuffer || bufferParam is StructMemberArray)
						                                      -> it.error("Reference must be a struct buffer: AutoSize($reference)")
						autoSize.atLeastOne && !bufferParam.has(nullable)
						                                      -> it.error("The \"atLeastOne\" option requires references to be nullable: AutoSize($reference)")
					}
				}
			}
		}
	}

	override fun PrintWriter.generateJava() {
		validate()

		val nativeLayout = this@Struct.nativeLayout || members.isEmpty()
		if ( !nativeLayout && preamble.hasNativeDirectives )
			kotlin.io.println("\tUnnecessary native directives in struct: $packageName.$className")

		print(HEADER)
		println("package $packageName;\n")

		println("import java.nio.*;\n")

		val mallocable = mutable || usageOutput || (usageInput && !usageResultPointer)

		if ( mallocable || members.any { it.nativeType is PointerType && it.nativeType.mapping === PointerMapping.DATA_POINTER } )
			println("import org.lwjgl.*;")
		println("import org.lwjgl.system.*;\n")

		if ( hasMutableMembers )
			println("import static org.lwjgl.system.Checks.*;")
		println("import static org.lwjgl.system.MemoryUtil.*;")
		if ( nativeLayout || mallocable )
			println("import static org.lwjgl.system.MemoryStack.*;")

		println()
		preamble.printJava(this)

		printDocumentation()
		println("${access.modifier}class $className extends Struct${if ( mallocable ) " implements NativeResource" else ""} {")

		print("""
	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;
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

			print("""
	static {""")
			if ( static != null )
				print("""
		$static
""")

			// Member offset initialization

			if ( nativeLayout ) {
				print("""
		try ( MemoryStack stack = stackPush() ) {
			IntBuffer offsets = stack.mallocInt(${memberCount + 1});
			SIZEOF = offsets(memAddress(offsets));

""")
				generateOffsetInit(members, indentation = "\t\t\t")
				println("""
			ALIGNOF = offsets.get($memberCount);
		}""")
			} else {
				print("""
		Layout layout = """)
				generateLayout(this@Struct)
				print(""";

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

""")
				generateOffsetInit(members)
			}

			print("\t}")
		} else {
			print("""
	static {""")
			if (static != null)
				print("""
		$static
""")
			print("""
		try ( MemoryStack stack = stackPush() ) {
			IntBuffer offsets = stack.mallocInt(1);
			SIZEOF = offsets(memAddress(offsets));
			ALIGNOF = offsets.get(0);
		}
	}""")
		}

		if ( nativeLayout )
			print("""

	private static native int offsets(long buffer);""")

		print("""

	$className(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link $className} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	${access.modifier}$className(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }
""")

		val members = visibleMembers
		if ( members.any() ) {
			println()
			generateGetters(AccessMode.INSTANCE, members)

			if ( hasMutableMembers ) {
				val mutableMembers = mutableMembers.filter { !it.has(AutoSizeMember) || it[AutoSizeMember].keepSetter(mutableMembers) }
				println()
				generateSetters(AccessMode.INSTANCE, mutableMembers)

				if ( mutableMembers.singleOrNull() == null && !containsUnion ) {
					val javadoc = "Initializes this struct with the specified values."
					if ( generateAlternativeMultiSetter(mutableMembers) )
						generateMultiSetter(javadoc, mutableMembers, Struct::generateAlternativeMultiSetterParameters, Struct::generateAlternativeMultiSetterSetters, MultiSetterMode.ALTER)
					else
						generateMultiSetter(javadoc, mutableMembers, Struct::generateMultiSetterParameters, Struct::generateMultiSetterSetters)
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
""")
			}
		}

		print("""
	// -----------------------------------
""")

		// Factory constructors
		if ( mallocable ) {
			print("""
	/** Returns a new {@link $className} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static $className malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link $className} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static $className calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link $className} instance allocated with {@link BufferUtils}. */
	public static $className create() {
		return new $className(BufferUtils.createByteBuffer(SIZEOF));
	}
""")
		}

		print("""
	/** Returns a new {@link $className} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static $className create(long address) {
		return address == NULL ? null : new $className(address, null);
	}
""")
		if ( mallocable ) {
			print("""
	/**
	 * Returns a new {@link $className.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param $BUFFER_CAPACITY_PARAM the buffer capacity
	 */
	public static Buffer malloc(int $BUFFER_CAPACITY_PARAM) {
		return create(nmemAlloc($BUFFER_CAPACITY_PARAM * SIZEOF), $BUFFER_CAPACITY_PARAM);
	}

	/**
	 * Returns a new {@link $className.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param $BUFFER_CAPACITY_PARAM the buffer capacity
	 */
	public static Buffer calloc(int $BUFFER_CAPACITY_PARAM) {
		return create(nmemCalloc($BUFFER_CAPACITY_PARAM, SIZEOF), $BUFFER_CAPACITY_PARAM);
	}

	/**
	 * Returns a new {@link $className.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param $BUFFER_CAPACITY_PARAM the buffer capacity
	 */
	public static Buffer create(int $BUFFER_CAPACITY_PARAM) {
		return new Buffer(BufferUtils.createByteBuffer($BUFFER_CAPACITY_PARAM * SIZEOF));
	}
""")
		}

		print("""
	/**
	 * Create a {@link $className.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param $BUFFER_CAPACITY_PARAM the buffer capacity
	 */
	public static Buffer create(long address, int $BUFFER_CAPACITY_PARAM) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, $BUFFER_CAPACITY_PARAM, $BUFFER_CAPACITY_PARAM);
	}
""")

		if ( mallocable ) {
			print("""
	// -----------------------------------

	/** Returns a new {@link $className} instance allocated on the thread-local {@link MemoryStack}. */
	public static $className mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link $className} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static $className callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link $className} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static $className mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link $className} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static $className callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link $className.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param $BUFFER_CAPACITY_PARAM the buffer capacity
	 */
	public static Buffer mallocStack(int $BUFFER_CAPACITY_PARAM) {
		return mallocStack($BUFFER_CAPACITY_PARAM, stackGet());
	}

	/**
	 * Returns a new {@link $className.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param $BUFFER_CAPACITY_PARAM the buffer capacity
	 */
	public static Buffer callocStack(int $BUFFER_CAPACITY_PARAM) {
		return callocStack($BUFFER_CAPACITY_PARAM, stackGet());
	}

	/**
	 * Returns a new {@link $className.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param $BUFFER_CAPACITY_PARAM the buffer capacity
	 */
	public static Buffer mallocStack(int $BUFFER_CAPACITY_PARAM, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, $BUFFER_CAPACITY_PARAM * SIZEOF), $BUFFER_CAPACITY_PARAM);
	}

	/**
	 * Returns a new {@link $className.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param $BUFFER_CAPACITY_PARAM the buffer capacity
	 */
	public static Buffer callocStack(int $BUFFER_CAPACITY_PARAM, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, $BUFFER_CAPACITY_PARAM, SIZEOF), $BUFFER_CAPACITY_PARAM);
	}
""")
		}

		print("""
	// -----------------------------------

""")

		if ( members.any() ) {
			generateStaticGetters(members)
			println()

			if ( hasMutableMembers ) {
				generateStaticSetters(mutableMembers)
				println()

				if ( validations.any() ) {
					println(
						"""	/**
	 * Validates pointer members that should not be $NULL.
	 *
	 * @param $STRUCT the struct to validate
	 */
	public static void validate(long $STRUCT) {
${validations.joinToString("\n")}
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}
""")
				}
			}
		}

		println("\t// -----------------------------------")

		print("""
	/** An array of {@link $className} structs. */
	public static final class Buffer extends StructBuffer<$className, Buffer>${if ( mallocable ) " implements NativeResource" else ""} {

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
			super(container, container.remaining() / SIZEOF);
		}

		Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			super(address, container, mark, pos, lim, cap);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			return new Buffer(address, container, mark, pos, lim, cap);
		}

		@Override
		protected $className newInstance(long address) {
			return new $className(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}
""")
		if ( members.any() ) {
			println()
			generateGetters(AccessMode.FLYWEIGHT, members)

			if ( hasMutableMembers ) {
				println()
				generateSetters(AccessMode.FLYWEIGHT, mutableMembers.filter { !it.has(AutoSizeMember) || it[AutoSizeMember].keepSetter(mutableMembers) })
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
					size = "${it.nativeType.javaMethodType}.SIZEOF"
					alignment = "${it.nativeType.javaMethodType}.ALIGNOF"
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
		generateParameters: (Struct, PrintWriter, Sequence<StructMember>, String, MultiSetterMode, Boolean) -> Unit,
		generateSetters: (Struct, PrintWriter, Sequence<StructMember>, String, MultiSetterMode) -> Unit,
		mode: MultiSetterMode = MultiSetterMode.NORMAL
	) {
		print("""
	/** $javaDoc */
	public $className set(
""")
		generateParameters(this@Struct, this, members, "", mode, false)
		println("""
	) {""")
		generateSetters(this@Struct, this, members, "", mode)
		print("""
		return this;
	}
""")
	}

	private fun generateMultiSetterParameters(writer: PrintWriter, members: Sequence<StructMember>, parentMember: String, mode: MultiSetterMode, more: Boolean) {
		writer.apply {
			members.forEachWithMore(more) { it, more ->
				val method = it.field(parentMember)

				if ( it.isNestedStructDefinition ) {
					generateMultiSetterParameters(writer, it.nestedMembers, method, mode, more) // recursion
					return@forEachWithMore
				}

				if ( more )
					println(",")

				print("\t\t")

				val param = it.field(parentMember)
				print("${it.nativeType.javaMethodType} $param")
			}
		}
	}

	private fun generateMultiSetterSetters(writer: PrintWriter, members: Sequence<StructMember>, parentMember: String, mode: MultiSetterMode) {
		writer.apply {
			members.forEach {
				val field = it.field(parentMember)

				if ( it.isNestedStructDefinition )
					generateMultiSetterSetters(writer, it.nestedMembers, field, mode) // recursion
				else
					println("\t\t$field($field);")
			}
		}
	}

	private fun generateAlternativeMultiSetter(members: Sequence<StructMember>): Boolean =
		members.any {
			if ( it.isNestedStructDefinition )
				generateAlternativeMultiSetter(it.nestedMembers) // recursion
			else
				it is StructMemberArray || it.nativeType.isPointerData
		}

	private fun generateAlternativeMultiSetterParameters(writer: PrintWriter, members: Sequence<StructMember>, parentMember: String, mode: MultiSetterMode, more: Boolean) {
		writer.apply {
			members.forEachWithMore(more) { it, more ->
				val method = it.field(parentMember)

				if ( it.isNestedStructDefinition ) {
					generateAlternativeMultiSetterParameters(writer, it.nestedMembers, method, mode, more) // recursion
					return@forEachWithMore
				}

				if ( more )
					println(",")

				print("\t\t")

				val param = it.field(parentMember)
				print(
					if (it is StructMemberArray) {
						if ( it is StructMemberCharArray ) {
							when ( mode ) {
								MultiSetterMode.NORMAL,
								MultiSetterMode.ALTER -> "ByteBuffer $param"
							}
						} else if ( it.nativeType is StructType ) {
							if ( it.nativeType.includesPointer )
								"PointerBuffer $param"
							else
								"${it.nativeType.javaMethodType}.Buffer $param"
						} else
							"${it.primitiveMapping.toPointer.javaMethodType.simpleName} $param"
					} else if ( it.nativeType.isPointerData && it.nativeType is StructType ) {
						val structType = it.nativeType.javaMethodType
						if ( it is StructMemberBuffer )
							"$structType.Buffer $param"
						else
							"$structType $param"
					} else
						"${it.nativeType.javaMethodType} $param"
				)
			}
		}
	}

	private fun generateAlternativeMultiSetterSetters(writer: PrintWriter, members: Sequence<StructMember>, parentMember: String, mode: MultiSetterMode) {
		writer.apply {
			members.forEach {
				val field = it.field(parentMember)

				if ( it.isNestedStructDefinition )
					generateAlternativeMultiSetterSetters(writer, it.nestedMembers, field, mode) // recursion
				else
					println("\t\t$field($field);")
			}
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

	private val StructMember.pointerValue: String get() = if ( has(nullable) ) "value" else "checkPointer(value)"
	private val StructMember.isNullable: Boolean
		get() = has(nullable) ||
		        getReferenceMember(AutoSizeMember, name)?.get(AutoSizeMember)?.optional ?: false ||
		        (this is StructMemberArray && this.validSize < this.size)
	private val StructMember.addressValue: String get() = if ( isNullable ) "addressSafe(value)" else "value.address()"
	private val StructMember.memAddressValue: String get() = if ( isNullable ) "memAddressSafe(value)" else "memAddress(value)"
	private val StructMember.autoSize: String get() = "n$name($STRUCT)"
		.let {
			val type = this.nativeType as IntegerType
			if ( !type.unsigned )
				it
			else {
				val mapping = type.mapping as PrimitiveMapping
				when ( mapping.bytes ) {
					1 -> "Byte.toUnsignedInt($it)"
					2 -> "Short.toUnsignedInt($it)"
					else -> it
				}
			}
		}
		.let {
			val factor = this[AutoSizeMember].factor
			if (factor != null)
				"($it ${factor.expression()})"
			else
				it
		}
		.let { if (4 < (nativeType.mapping as PrimitiveMapping).bytes && !it.startsWith('(') ) "(int)$it" else it }

	private fun PrintWriter.setRemaining(m: StructMember) {
		// do not do this if the AutoSize parameter auto-sizes multiple members
		val capacity = members.firstOrNull { it has AutoSizeMember && it[AutoSizeMember].let { it.atLeastOne || (it.dependent.isEmpty() && it.reference == m.name) } }
		if ( capacity != null ) {
			val autoSize = capacity[AutoSizeMember]
			val autoSizeExpression = "value.remaining()"
				.let {
					if (autoSize.factor != null)
						"($it ${autoSize.factor.expressionInv()})"
					else
						it
				}
				.let { if ((capacity.nativeType.mapping as PrimitiveMapping).bytes < 4) "(${capacity.nativeType.mapping.javaMethodType})$it" else it }

			print(if ( m has nullable || autoSize.optional ) {
				if ( autoSize.atLeastOne )
					" if ( value != null ) n${capacity.name}($STRUCT, $autoSizeExpression);"
				else if ( m has nullable && !autoSize.optional )
					" if ( value != null ) n${capacity.name}($STRUCT, $autoSizeExpression);"
				else
					" n${capacity.name}($STRUCT, value == null ? 0 : $autoSizeExpression);"
			} else
				" n${capacity.name}($STRUCT, $autoSizeExpression);"
			)
		}
	}

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
					if ( it.nativeType is CallbackType ) {
						println("\t/** Unsafe version of {@link #$setter(${it.nativeType.javaMethodType}) $setter}. */")
						println("\tpublic static void n$setter(long $STRUCT, long value) { memPutAddress($STRUCT + $field, ${it.pointerValue}); }")
					} else {
						val javaType = it.nativeType.nativeMethodType
						val bufferMethod = getBufferMethod(it, javaType)

						println(
							if ( it has AutoSizeMember )
								"\t/** Sets the specified value to the {@code ${it.name}} field of the specified {@code struct}. */"
							else
								"\t/** Unsafe version of {@link #$setter($javaType) $setter}. */"
						)
						print("\tpublic static void n$setter(long $STRUCT, $javaType value) { memPut$bufferMethod($STRUCT + $field, ")
						if ( javaType == "boolean" )
							print("value ? (byte)1 : (byte)0")
						else if ( it.nativeType.mapping === PointerMapping.OPAQUE_POINTER )
							print(it.pointerValue)
						else
							print("value")
						println("); }")
					}
				}

				// Alternative setters

				if ( it is StructMemberArray ) {
					if ( it.nativeType is StructType ) {
						val structType = it.nativeType.javaMethodType
						if ( it.nativeType.includesPointer ) {
							println("\t/** Unsafe version of {@link #$setter(PointerBuffer) $setter}. */")
							println("\tpublic static void n$setter(long $STRUCT, PointerBuffer value) {")
							println("\t\tif ( CHECKS ) checkBufferGT(value, ${it.size});")
							println("\t\tmemCopy(memAddress(value), $STRUCT + $field, value.remaining() * POINTER_SIZE);")
							println("\t}")
							println("\t/** Unsafe version of {@link #$setter(int, $structType) $setter}. */")
							println("\tpublic static void n$setter(long $STRUCT, int index, $structType value) { memPutAddress($STRUCT + $field + index * POINTER_SIZE, ${it.addressValue}); }")
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
						val byteSize = if ( mapping.bytes == 1 ) it.size else "${it.size} * ${mapping.bytes}"

						println("\t/** Unsafe version of {@link #$setter(ByteBuffer) $setter}. */")
						println("\tpublic static void n$setter(long $STRUCT, ByteBuffer value) {")
						println("\t\tif ( CHECKS ) {")
						println("\t\t\tcheckNT${mapping.bytes}(value);")
						println("\t\t\tcheckBufferGT(value, $byteSize);")
						println("\t\t}")
						println("\t\tmemCopy(memAddress(value), $STRUCT + $field, value.remaining());")
						println("\t}")
					} else {
						val mapping = it.primitiveMapping
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
					println("\t\tif ( CHECKS ) checkNT${mapping.bytes}Safe(value); ")
					println("\t\tmemPutAddress($STRUCT + $field, ${it.memAddressValue});")
					println("\t}")
				} else if ( it.nativeType.isPointerData ) {
					if ( it.nativeType is StructType ) {
						val structType = it.nativeType.javaMethodType
						if ( it is StructMemberBuffer ) {
							println("\t/** Unsafe version of {@link #$setter($structType.Buffer) $setter}. */")
							print("\tpublic static void n$setter(long $STRUCT, $structType.Buffer value) { memPutAddress($STRUCT + $field, ${it.addressValue});")
							setRemaining(it)
							println(" }")
						} else {
							println("\t/** Unsafe version of {@link #$setter($structType) $setter}. */")
							println("\tpublic static void n$setter(long $STRUCT, $structType value) { memPutAddress($STRUCT + $field, ${it.addressValue}); }")
						}
					} else {
						val bufferType = it.nativeType.javaMethodType
						println("\t/** Unsafe version of {@link #$setter($bufferType) $setter}. */")
						print("\tpublic static void n$setter(long $STRUCT, $bufferType value) { memPutAddress($STRUCT + $field, ${it.memAddressValue});")
						setRemaining(it)
						println(" }")
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
		val n = if ( accessMode === AccessMode.INSTANCE ) "n" else "$className.n"
		members.forEach {
			val setter = it.field(parentMember)
			val field = it.name

			val indent = accessMode.indent
			val returnType = if ( accessMode === AccessMode.INSTANCE )
				className
			else
				"$className.Buffer"

			if ( it.isNestedStruct ) {
				val structType = it.nativeType.javaMethodType
				if ( structType === ANONYMOUS )
					generateSetters(accessMode, it.nestedMembers, if ( field === ANONYMOUS ) parentMember else field)
				else {
					println("$indent/** Copies the specified {@link $structType} to the {@code $field} field. */")
					println("${indent}public $returnType $setter($structType value) { $n$setter($ADDRESS, value); return this; }")
				}
			} else {
				// Setter

				if ( it !is StructMemberArray && !it.nativeType.isPointerData ) {
					if ( it.nativeType is CallbackType ) {
						val callbackType = it.nativeType.javaMethodType
						println("$indent/** Sets the address of the specified {@link $callbackType} to the {@code $field} field. */")
						println("${indent}public $returnType $setter($callbackType value) { $n$setter($ADDRESS, addressSafe(value)); return this; }")
					} else {
						println("$indent/** Sets the specified value to the {@code $field} field. */")
						println("${indent}public $returnType $setter(${it.nativeType.javaMethodType} value) { $n$setter($ADDRESS, value${if ( it.nativeType.mapping === PrimitiveMapping.BOOLEAN4 ) " ? 1 : 0" else ""}); return this; }")
					}
				}

				// Alternative setters

				if ( it is StructMemberArray ) {
					if ( it.nativeType is StructType ) {
						val structType = it.nativeType.javaMethodType
						if ( it.nativeType.includesPointer ) {
							println("$indent/** Copies the specified {@link PointerBuffer} to the {@code $field} field. */")
							println("${indent}public $returnType $setter(PointerBuffer value) { $n$setter($ADDRESS, value); return this; }")
							println("$indent/** Copies the address of the specified {@link $structType} at the specified index of the {@code $field} field. */")
						} else {
							println("$indent/** Copies the specified {@link $structType.Buffer} to the {@code $field} field. */")
							println("${indent}public $returnType $setter($structType.Buffer value) { $n$setter($ADDRESS, value); return this; }")
							println("$indent/** Copies the specified {@link $structType} at the specified index of the {@code $field} field. */")
						}
						println("${indent}public $returnType $setter(int index, $structType value) { $n$setter($ADDRESS, index, value); return this; }")
					} else if ( it is StructMemberCharArray ) {
						println("$indent/** Copies the specified encoded string to the {@code $field} field. */")
						println("${indent}public $returnType $setter(ByteBuffer value) { $n$setter($ADDRESS, value); return this; }")
					} else {
						val bufferType = it.primitiveMapping.toPointer.javaMethodType.simpleName
						println("$indent/** Copies the specified {@link $bufferType} to the {@code $field} field. */")
						println("${indent}public $returnType $setter($bufferType value) { $n$setter($ADDRESS, value); return this; }")
						println("$indent/** Sets the specified value at the specified index of the {@code $field} field. */")
						println("${indent}public $returnType $setter(int index, ${it.nativeType.mapping.javaMethodType} value) { $n$setter($ADDRESS, index, value); return this; }")
					}
				} else if ( it.nativeType is CharSequenceType ) {
					println("$indent/** Sets the address of the specified encoded string to the {@code $field} field. */")
					println("${indent}public $returnType $setter(ByteBuffer value) { $n$setter($ADDRESS, value); return this; }")
				} else if ( it.nativeType.isPointerData ) {
					val pointerType = it.nativeType.javaMethodType
					if ( it is StructMemberBuffer ) {
						println("$indent/** Sets the address of the specified {@link $pointerType.Buffer} to the {@code $field} field. */")
						println("${indent}public $returnType $setter($pointerType.Buffer value) { $n$setter($ADDRESS, value); return this; }")
					} else {
						println("$indent/** Sets the address of the specified {@link $pointerType} to the {@code $field} field. */")
						println("${indent}public $returnType $setter($pointerType value) { $n$setter($ADDRESS, value); return this; }")
					}
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
					println("\tpublic static $structType n$getter(long $STRUCT) { return $structType.create($STRUCT + $field); }")
				}
			} else {
				// Getter

				if ( it !is StructMemberArray && !it.nativeType.isPointerData ) {
					println("\t/** Unsafe version of {@link #$getter}. */")
					if ( it.nativeType is CallbackType ) {
						println("\tpublic static long n$getter(long $STRUCT) { return memGetAddress($STRUCT + $field); }")
					} else {
						val javaType = it.nativeType.nativeMethodType
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
						val nestedStruct = it.nativeType.javaMethodType
						if ( it.nativeType.includesPointer ) {
							val capacity = getReferenceMember(AutoSizeMember, it.name)

							println("\t/** Unsafe version of {@link #$getter}. */")
							println("\tpublic static PointerBuffer n$getter(long $STRUCT) {")
							println("\t\treturn memPointerBuffer($STRUCT + $field, ${if ( capacity == null ) it.size else capacity.autoSize});")
							println("\t}")
							println("\t/** Unsafe version of {@link #$getter(int) $getter}. */")
							println("\tpublic static $nestedStruct n$getter(long $STRUCT, int index) {")
							println("\t\treturn $nestedStruct.create(memGetAddress($STRUCT + $field + index * POINTER_SIZE));")
							println("\t}")
						} else {
							val capacity = getReferenceMember(AutoSizeMember, it.name)

							println("\t/** Unsafe version of {@link #$getter}. */")
							println("\tpublic static $nestedStruct.Buffer n$getter(long $STRUCT) {")
							println("\t\treturn $nestedStruct.create($STRUCT + $field, ${if ( capacity == null ) it.size else capacity.autoSize});")
							println("\t}")
							println("\t/** Unsafe version of {@link #$getter(int) $getter}. */")
							println("\tpublic static $nestedStruct n$getter(long $STRUCT, int index) {")
							println("\t\treturn $nestedStruct.create($STRUCT + $field + index * $nestedStruct.SIZEOF);")
							println("\t}")
						}
					} else if ( it is StructMemberCharArray ) {
						val mapping = it.nativeType.mapping as CharMapping
						val byteSize = if ( mapping.bytes == 1 ) it.size else "${it.size} * ${mapping.bytes}"

						println("\t/** Unsafe version of {@link #$getter}. */")
						println("\tpublic static ByteBuffer n$getter(long $STRUCT) { return memByteBuffer($STRUCT + $field, $byteSize); }")
						println("\t/** Unsafe version of {@link #${getter}String}. */")
						println("\tpublic static String n${getter}String(long $STRUCT) { return mem${mapping.charset}($STRUCT + $field); }")
					} else {
						val mapping = it.primitiveMapping
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
					val mapping = it.nativeType.charMapping
					println("\t/** Unsafe version of {@link #$getter}. */")
					println("\tpublic static ByteBuffer n$getter(long $STRUCT) { return memByteBufferNT${mapping.bytes}(memGetAddress($STRUCT + $field)); }")
					println("\t/** Unsafe version of {@link #${getter}String}. */")
					println("\tpublic static String n${getter}String(long $STRUCT) { return mem${mapping.charset}(memGetAddress($STRUCT + $field)); }")
				} else if ( it.nativeType is StructType ) {
					val structType = it.nativeType.javaMethodType
					println("\t/** Unsafe version of {@link #$getter}. */")
					println(if ( it is StructMemberBuffer ) {
						val capacity = getReferenceMember(AutoSizeMember, it.name)
						if ( capacity == null )
							"\tpublic static $structType.Buffer n$getter(long $STRUCT, int $BUFFER_CAPACITY_PARAM) { return $structType.create(memGetAddress($STRUCT + $field), $BUFFER_CAPACITY_PARAM); }"
						else
							"\tpublic static $structType.Buffer n$getter(long $STRUCT) { return $structType.create(memGetAddress($STRUCT + $field), ${capacity.autoSize}); }"
					} else
						"\tpublic static $structType n$getter(long $STRUCT) { return $structType.create(memGetAddress($STRUCT + $field)); }"
					)
				} else if ( it.nativeType.isPointerData ) {
					val bufferType = it.nativeType.javaMethodType
					val capacity = getReferenceMember(AutoSizeMember, it.name)

					if ( capacity == null ) {
						println("\t/** Unsafe version of {@link #$getter(int) $getter}. */")
						println("\tpublic static $bufferType n$getter(long $STRUCT, int $BUFFER_CAPACITY_PARAM) { return mem$bufferType(memGetAddress($STRUCT + $field), $BUFFER_CAPACITY_PARAM); }")
					} else {
						println("\t/** Unsafe version of {@link #$getter() $getter}. */")
						println("\tpublic static $bufferType n$getter(long $STRUCT) { return mem$bufferType(memGetAddress($STRUCT + $field), ${capacity.autoSize}); }")
					}

				}
			}
		}
	}

	private fun PrintWriter.generateGetters(
		accessMode: AccessMode,
		members: Sequence<StructMember>,
		parentMember: String = ""
	) {
		val n = if ( accessMode === AccessMode.INSTANCE ) "n" else "$className.n"
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
					println("${indent}public $structType $getter() { return $n$getter($ADDRESS); }")
				}
			} else {
				// Getter

				if ( it !is StructMemberArray && !it.nativeType.isPointerData ) {
					if ( it.nativeType is CallbackType ) {
						val callbackType = it.nativeType.className

						println("$indent/** Returns the {@code $callbackType} instance at the {@code $getter} field. */")
						println("${indent}public $callbackType $getter() { return $callbackType.create($n$getter($ADDRESS)); }")
					} else {
						println("$indent/** Returns the value of the {@code $getter} field. */")
						println("${indent}public ${it.nativeType.javaMethodType} $getter() { return $n$getter($ADDRESS)${if ( it.nativeType.mapping === PrimitiveMapping.BOOLEAN4 ) " != 0" else ""}; }")
					}
				}

				// Alternative getters

				if ( it is StructMemberArray ) {
					if ( it.nativeType is StructType ) {
						val structType = it.nativeType.javaMethodType
						if (  it.nativeType.includesPointer ) {
							println("$indent/** Returns a {@link PointerBuffer} view of the {@code $getter} field. */")
							println("${indent}public PointerBuffer $getter() { return $n$getter($ADDRESS); }")
							println("$indent/** Returns a {@link $structType} view of the pointer at the specified index of the {@code $getter}. */")
							println("${indent}public $structType $getter(int index) { return $n$getter($ADDRESS, index); }")
						} else {
							println("$indent/** Returns a {@link $structType}.Buffer view of the {@code $getter} field. */")
							println("${indent}public $structType.Buffer $getter() { return $n$getter($ADDRESS); }")
							println("$indent/** Returns a {@link $structType} view of the struct at the specified index of the {@code $getter} field. */")
							println("${indent}public $structType $getter(int index) { return $n$getter($ADDRESS, index); }")
						}
					} else if ( it is StructMemberCharArray ) {
						println("$indent/** Returns a {@link ByteBuffer} view of the {@code $getter} field. */")
						println("${indent}public ByteBuffer $getter() { return $n$getter($ADDRESS); }")
						println("$indent/** Decodes the null-terminated string stored in the {@code $getter} field. */")
						println("${indent}public String ${getter}String() { return $n${getter}String($ADDRESS); }")
					} else {
						val bufferType = it.primitiveMapping.toPointer.javaMethodType.simpleName
						println("$indent/** Returns a {@link $bufferType} view of the {@code $getter} field. */")
						println("${indent}public $bufferType $getter() { return $n$getter($ADDRESS); }")
						println("$indent/** Returns the value at the specified index of the {@code $getter} field. */")
						println("${indent}public ${it.nativeType.javaMethodType} $getter(int index) { return $n$getter($ADDRESS, index); }")
					}
				} else if ( it.nativeType is CharSequenceType ) {
					println("$indent/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code $getter} field. */")
					println("${indent}public ByteBuffer $getter() { return $n$getter($ADDRESS); }")
					println("$indent/** Decodes the null-terminated string pointed to by the {@code $getter} field. */")
					println("${indent}public String ${getter}String() { return $n${getter}String($ADDRESS); }")
				} else if ( it.nativeType is StructType ) {
					val structType = it.nativeType.javaMethodType
					if ( it is StructMemberBuffer ) {
						if ( getReferenceMember(AutoSizeMember, it.name) == null ) {
							println("""$indent/**
$indent * Returns a {@link $structType.Buffer} view of the struct array pointed to by the {@code $getter} field.
$indent *
$indent * @param $BUFFER_CAPACITY_PARAM the number of elements in the returned buffer
$indent */""")
							println("${indent}public $structType.Buffer $getter(int $BUFFER_CAPACITY_PARAM) { return $n$getter($ADDRESS, $BUFFER_CAPACITY_PARAM); }")
						} else {
							println("$indent/** Returns a {@link $structType.Buffer} view of the struct array pointed to by the {@code $getter} field. */")
							println("${indent}public $structType.Buffer $getter() { return $n$getter($ADDRESS); }")
						}

					} else {
						println("$indent/** Returns a {@link $structType} view of the struct pointed to by the {@code $getter} field. */")
						println("${indent}public $structType $getter() { return $n$getter($ADDRESS); }")
					}
				} else if ( it.nativeType.isPointerData ) {
					val bufferType = it.nativeType.javaMethodType

					if ( getReferenceMember(AutoSizeMember, it.name) == null ) {
						println(
							"""$indent/**
$indent * Returns a {@link $bufferType} view of the data pointed to by the {@code $getter} field.
$indent *
$indent * @param $BUFFER_CAPACITY_PARAM the number of elements in the returned buffer
$indent */""")
						println("${indent}public $bufferType $getter(int $BUFFER_CAPACITY_PARAM) { return $n$getter($ADDRESS, $BUFFER_CAPACITY_PARAM); }")
					} else {
						println("$indent/** Returns a {@link $bufferType} view of the data pointed to by the {@code $getter} field. */")
						println("${indent}public $bufferType $getter() { return $n$getter($ADDRESS); }")
					}
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

		nativeImport("<stddef.h>")
		nativeDirective(
			"""#ifdef LWJGL_WINDOWS
	#define alignof __alignof
#else
	#include <stdalign.h>
#endif""")

		preamble.printNative(this)

		println("""
EXTERN_C_EXIT

JNIEXPORT jint JNICALL Java_${nativeFileNameJNI}_offsets(JNIEnv *$JNIENV, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	UNUSED_PARAMS($JNIENV, clazz)
""")

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

		var index = 0
		if ( members.isNotEmpty() ) {
			index = generateNativeMembers(members)
			println()
		}
		println(
"""	buffer[$index] = alignof($nativeName);

	return sizeof($nativeName);
}

EXTERN_C_EXIT""")
	}

	private fun PrintWriter.generateNativeMembers(members: List<StructMember>, offset: Int = 0, prefix: String = ""): Int {
		var index = offset
		members.forEach {
			if ( it.name === ANONYMOUS && it.isNestedStruct ) {
				index = generateNativeMembers((it.nativeType as StructType).definition.members, index + 1, prefix) // recursion
			} else {
				println("\tbuffer[$index] = (jint)offsetof($nativeName, $prefix${it.name});")
				index++

				if ( it.isNestedStruct ) {
					// Output nested structs
					val structType = it.nativeType as StructType
					if ( structType.name == ANONYMOUS )
						index = generateNativeMembers(structType.definition.members, index, prefix = "$prefix${it.name}.") // recursion
				}
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
	init: (Struct.() -> Unit)? = null
): Struct {
	val struct = Struct(packageName, className, nativeSubPath, nativeName, false, virtual, mutable, nativeLayout)
	if ( init != null ) {
		struct.init()
		Generator.register(struct)
	}
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
	init: (Struct.() -> Unit)? = null
) = struct(packageName, className, nativeSubPath, nativeName, virtual, mutable, nativeLayout, init).nativeType.p

fun union(
	packageName: String,
	className: String,
	nativeSubPath: String = "",
	nativeName: String = className,
	virtual: Boolean = false,
	mutable: Boolean = true,
	nativeLayout: Boolean = false,
	init: (Struct.() -> Unit)? = null
): Struct {
	val struct = Struct(packageName, className, nativeSubPath, nativeName, true, virtual, mutable, nativeLayout)
	if ( init != null ) {
		struct.init()
		Generator.register(struct)
	}
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
	init: (Struct.() -> Unit)? = null
) = union(packageName, className, nativeSubPath, nativeName, virtual, mutable, nativeLayout, init).nativeType.p