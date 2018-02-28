/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import java.io.*

private const val STRUCT = "struct"

private val KEYWORDS = setOf(
    // Java keywords
    "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue", "default", "do", "double", "else", "enum",
    "extends", "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package",
    "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient",
    "try", "void", "volatile", "while",
    // Object
    "equals", "getClass", "hashCode", "notify", "notifyAll", "toString", "wait",
    // Pointer
    "address",
    // AutoCloseable
    "close",
    // NativeResource
    "free",
    // Struct
    "create", "callocStack", "calloc", "isNull", "malloc", "mallocStack", "sizeof",
    // Iterable
    "iterator", "forEach", "spliterator",
    // CustomBuffer
    "address0", "capacity", "clear", "compact", "duplicate", "flip", "hasRemaining", "limit", "mark", "position", "remaining", "reset", "rewind",
    "slice",
    // StructBuffer
    "get", "parallelStream", "put", "stream"
)

open class StructMember(
    val nativeType: DataType,
    val name: String,
    val documentation: String
) : ModifierTarget<StructMemberModifier>() {

    override fun validate(modifier: StructMemberModifier) = modifier.validate(this)

    internal val offsetField
        get() = name.toUpperCase()

    internal fun offsetField(parentField: String): String {
        return if (parentField.isEmpty())
            offsetField
        else
            "${parentField}_$offsetField"
    }

    internal fun field(parentMember: String) = if (parentMember.isEmpty())
        if (KEYWORDS.contains(name)) "$name\$" else name
    else
        "${parentMember}_$name"

    internal fun fieldName(parentMember: String) = if (parentMember.isEmpty())
        name
    else
        "$parentMember.$name"

    /** hidden if false, contributes to layout only */
    var public = true
    /** mutable if true, even if the parent struct is not mutable */
    var mutable = false

    internal var links: String = ""
    internal var linkMode: LinkMode = LinkMode.SINGLE

    fun links(links: String, linkMode: LinkMode = LinkMode.SINGLE) {
        this.links = links
        this.linkMode = linkMode
    }
}

internal class StructMemberBuffer(
    nativeType: PointerType<*>,
    name: String,
    documentation: String
) : StructMember(nativeType, name, documentation)

private open class StructMemberArray(
    nativeType: DataType,
    name: String,
    documentation: String,
    /** Number of elements in the array. */
    val size: String,
    /** Number of pointer elements that must not be null. */
    val validSize: String
) : StructMember(nativeType, name, documentation) {

    val primitiveMapping get() = this.nativeType.let {
        if (it is PointerType<*>) PrimitiveMapping.POINTER else it.mapping as PrimitiveMapping
    }

}

private class StructMemberCharArray(
    nativeType: CharType,
    name: String,
    documentation: String,
    size: String
) : StructMemberArray(nativeType, name, documentation, size, size)

private class StructMemberPadding(size: String, val condition: String?) : StructMemberArray(char, ANONYMOUS, "", size, size) {
    init {
        public = false
    }
}

private enum class MultiSetterMode {
    NORMAL,
    ALTER
}

private enum class AccessMode(val indent: String) {
    INSTANCE(t),
    FLYWEIGHT("$t$t");
}

class Struct(
    module: Module,
    className: String,
    nativeSubPath: String = "",
    /** The native struct name. May be different than className. */
    val nativeName: String,
    private val union: Boolean,
    /** when true, a declaration is missing, we need to output one. */
    private val virtual: Boolean,
    /** when false, setters methods will not be generated. */
    private val mutable: Boolean,
    /** if specified, is the super-type of this struct. */
    private val extends: Struct?,
    /** when true, the struct layout will be built using native code. */
    private val nativeLayout: Boolean
) : GeneratorTargetNative(module, className, nativeSubPath) {

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

        private const val BUFFER_CAPACITY_PARAM = "capacity"
    }

    val nativeType get() = StructType(this)

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

    private val visibleMembers
        get() = members.asSequence().filter { it !is StructMemberPadding }

    private val publicMembers
        get() = members.asSequence().filter { it.public }

    private fun mutableMembers(members: Sequence<StructMember> = publicMembers): Sequence<StructMember> = members.let {
        if (mutable) it else it.filter { member -> member.mutable }
    }

    private val settableMembers: Sequence<StructMember> by lazy(LazyThreadSafetyMode.NONE) {
        val mutableMembers = mutableMembers()
        mutableMembers.filter { !it.has<AutoSizeMember>() || it.get<AutoSizeMember>().keepSetter(mutableMembers) }
    }

    private fun hasMutableMembers(members: Sequence<StructMember> = publicMembers) = this.members.isNotEmpty() && (mutable || mutableMembers(members).any())

    operator fun get(name: String): StructMember = members.asSequence().first { it.name == name }

    fun StructMember.replace(old: StructMember) {
        members.remove(this)
        members[members.indexOf(old)] = this
    }

    private fun add(member: StructMember): StructMember {
        members.add(member)
        return member
    }

    // Plain field
    fun DataType.member(name: String, documentation: String) = add(StructMember(this, name, documentation))

    // Points to an array of structs, not a single struct
    fun PointerType<StructType>.buffer(name: String, documentation: String): StructMember {
        return add(StructMemberBuffer(this, name, documentation))
    }

    // Array field
    fun DataType.array(name: String, documentation: String, size: Int, validSize: Int = size)
        = array(name, documentation, size.toString(), validSize.toString())

    fun DataType.array(name: String, documentation: String, size: String, validSize: String = size)
        = add(StructMemberArray(this, name, documentation, size, validSize))

    // CharSequence special-case
    fun CharType.array(name: String, documentation: String, size: Int) = array(name, documentation, size.toString())

    fun CharType.array(name: String, documentation: String, size: String) = add(StructMemberCharArray(this, name, documentation, size))

    fun padding(size: Int, condition: String? = null) = padding(size.toString(), condition)
    fun padding(size: String, condition: String? = null) = add(StructMemberPadding(size, condition))

    /** Anonymous nested member struct definition. */
    fun struct(init: Struct.() -> Unit): StructMember = struct(ANONYMOUS, ANONYMOUS, init)

    /** Nested member struct definition. */
    fun struct(name: String, documentation: String, init: Struct.() -> Unit): StructMember {
        val struct = Struct(module, ANONYMOUS, "", ANONYMOUS, false, false, mutable, null, false)
        struct.init()
        return StructType(struct).member(name, documentation)
    }

    /** Anonymous nested member union definition. */
    fun union(init: Struct.() -> Unit): StructMember = union(ANONYMOUS, ANONYMOUS, init)

    /** Nested member union definition. */
    fun union(name: String, documentation: String, init: Struct.() -> Unit): StructMember {
        val struct = Struct(module, ANONYMOUS, "", ANONYMOUS, true, false, mutable, null, false)
        struct.init()
        return StructType(struct).member(name, documentation)
    }

    /** The nested struct's members are embedded in the parent struct. */
    private val StructMember.isNestedStruct
        get() = nativeType is StructType && this !is StructMemberArray

    /** The nested struct is not defined elsewhere, it's part of the parent struct's definition */
    private val StructMember.isNestedStructDefinition
        get() = isNestedStruct && (nativeType as StructType).name === ANONYMOUS

    private val StructMember.nestedMembers
        get() = (nativeType as StructType).definition.visibleMembers

    private val containsUnion: Boolean get() = union || members.any {
        it.isNestedStruct && (it.nativeType as StructType).let { it.name === ANONYMOUS && it.definition.containsUnion }
    }

    internal val validations: Sequence<String> by lazy(LazyThreadSafetyMode.NONE) {
        if (union)
            return@lazy emptySequence<String>()

        val validations = ArrayList<String>()

        fun MutableList<String>.addPointer(m: StructMember) = this.add("$t${t}long ${m.name} = memGetAddress($STRUCT + $className.${m.offsetField});")
        fun MutableList<String>.addCount(m: StructMember) = this.add("$t$t${m.nativeType.javaMethodType} ${m.name} = n${m.name}($STRUCT);")

        fun validate(m: StructMember, indent: String, hasPointer: Boolean = false): String {
            return if (m.nativeType.hasStructValidation) {
                if (m is StructMemberArray) {
                    """${
                    if (hasPointer) "" else "${indent}long ${m.name} = $STRUCT + $className.${m.offsetField};\n"
                    }${indent}for (int i = 0; i < ${getReferenceMember<AutoSizeMember>(m.name)?.name ?: m.size}; i++) {${
                    if (m is PointerType<*>) {
                        if (m.validSize == m.size)
                            "\n$indent   check(memGetAddress(${m.name}));"
                        else
                            """
$indent   if (i < ${m.validSize}) {
$indent       check(memGetAddress(${m.name}));
$indent   } else if (memGetAddress(${m.name}) == NULL) {
$indent       break;
$indent   }"""
                    } else ""}
$indent   ${m.nativeType.javaMethodType}.validate(${m.name});
$indent   ${m.name} += POINTER_SIZE;
$indent}"""
                } else {
                    "${if (hasPointer) "" else
                        "${indent}long ${m.name} = memGetAddress($STRUCT + $className.${m.offsetField});\n" +
                        "${indent}check(${m.name});\n"
                    }$indent${m.nativeType.javaMethodType}.validate(${m.name}${getReferenceMember<AutoSizeMember>(m.name).let { if (it != null) ", ${it.name}" else "" }});"
                }
            } else
                "${indent}check(memGetAddress($STRUCT + $className.${m.offsetField}));"
        }

        fun validationBlock(condition: String, validations: String): String = "$t${t}if ($condition) {\n$validations\n$t$t}"

        mutableMembers().forEach { m ->
            if (m.has<AutoSizeMember>()) {
                m.get<AutoSizeMember>().let { autoSize ->
                    val refs = autoSize.members(mutableMembers())

                    if (autoSize.atLeastOne) {
                        // TODO: There will be redundancy here when one of the refs is a validateable struct array. But we don't have a case for it yet.
                        validations.addCount(m)

                        // if m != 0, make sure one of the auto-sized members is not null
                        validations.add(
                            "$t${t}if (${if (autoSize.optional) "\n$t$t$t${m.name} != 0 &&" else "\n$t$t$t${m.name} == 0 || ("}${
                            refs.map { "\n$t$t${t}memGetAddress($STRUCT + $className.${it.offsetField}) == NULL" }.joinToString(" &&")
                            }\n$t$t${if (autoSize.optional) "" else ")"}) {\n$t$t${t}throw new NullPointerException(\"At least one of ${refs.map { it.name }.joinToString()} must not be null\");\n$t$t}"
                        )
                    } else if (autoSize.optional) {
                        val refValidations = refs.filter { !it.has(nullable) }.map { ref ->
                            validate(ref, "$t$t$t")
                        }.joinToString("\n")

                        if (refValidations.isEmpty())
                            return@let

                        // if m != 0, make sure auto-sized members are not null
                        validations.add(
                            validationBlock("${if (refValidations.contains(", ${m.name})")) {
                                validations.addCount(m)
                                m.name
                            } else "n${m.name}($STRUCT)"} != 0", refValidations)
                        )
                    } else if (refs.any { it.nativeType.hasStructValidation })
                        validations.addCount(m)
                }
            } else if (m.nativeType is StructType && m.nativeType.definition.validations.any()) {
                validations.add(
                    if (m is StructMemberArray)
                        validate(m, "$t$t")
                    else
                        "$t$t${m.nativeType.javaMethodType}.validate($STRUCT + $className.${m.offsetField});"
                )
            } else if (m.nativeType is PointerType<*> && getReferenceMember<AutoSizeMember>(m.name)?.get<AutoSizeMember>().let { it == null || !it.optional }) {
                if (m.nativeType.hasStructValidation) {
                    validations.add(
                        if (m.has(nullable)) {
                            validations.addPointer(m)
                            validationBlock("${m.name} != NULL", validate(m, "$t$t$t", hasPointer = true))
                        } else
                            validate(m, "$t$t")
                    )
                } else if (!m.has(nullable) && m.nativeType !is StructType) {
                    validations.add(validate(m, "$t$t"))
                }
            }
        }

        validations.asSequence()
    }

    /** Returns a member that has the specified ReferenceModifier with the specified reference. Returns null if no such parameter exists. */
    private inline fun <reified T> getReferenceMember(reference: String) where T : StructMemberModifier, T : ReferenceModifier = members.firstOrNull {
        it.has<T>(reference)
    } // Assumes at most 1 parameter will be found that references the specified parameter

    private fun PrintWriter.printDocumentation() {
        val builder = StringBuilder()

        val members = members.filter { it !is StructMemberPadding }
        if (documentation != null) {
            builder.append(documentation)
            if (members.isNotEmpty())
                builder.append("\n\n")
        }

        if (members.isNotEmpty()) {
            val memberDoc = printMemberDocumentation()
            if (memberDoc.isNotEmpty())
                builder
                    .append("<h3>Member documentation</h3>\n\n")
                    .append(ul(*memberDoc.toTypedArray()))
                    .append("\n\n")

            builder.append("<h3>Layout</h3>\n\n")
            builder.append(codeBlock(printStructLayout()))
        }

        if (builder.isNotEmpty())
            println(processDocumentation(builder.toString()).toJavaDoc(indentation = "", see = see, since = since))
    }

    private val nativeNameQualified get() = (if (union) "union " else "struct ").let { type ->
        when {
            nativeName.startsWith(type) -> nativeName
            nativeName === ANONYMOUS    -> type.substring(0, type.length - 1)
            else                        -> "$type$nativeName"
        }
    }

    private fun Struct.printStructLayout(indentation: String = ""): String {
        val memberIndentation = "$indentation    "
        return """$nativeNameQualified {
${members.joinToString("\n$memberIndentation", prefix = memberIndentation) {member ->
            if (member.isNestedStructDefinition)
                "${(member.nativeType as StructType).definition.printStructLayout(memberIndentation)}${if (member.name === ANONYMOUS) "" else " ${member.name}"};"
            else {
                val anonymous = member.name === ANONYMOUS || (member.nativeType is CallbackType && member.nativeType.name.contains("(*)"))
                member.nativeType
                    .let {
                        when {
                            it is CallbackType && anonymous -> it.function.nativeType(member.name)
                            else -> it.name
                        }
                    }
                    .let {
                        var elementType: NativeType = member.nativeType
                        while (true) {
                            if (elementType !is PointerType<*> || elementType.elementType is OpaqueType) {
                                break
                            }

                            elementType = elementType.elementType
                        }
                        when {
                            elementType is CallbackType && anonymous                 -> it.replace(
                                "(*${member.name})",
                                "(*{@link ${elementType.javaMethodType} ${member.name}})"
                            )
                            elementType is StructType || elementType is CallbackType -> it.replace(
                                elementType.name,
                                "{@link ${elementType.javaMethodType} ${elementType.name}}"
                            )
                            else                                                     -> it
                        }
                    }
                    .let {
                        "$it${if (anonymous) "" else " ${member.name}"}${if (member is StructMemberArray) "[${member.size}]" else ""};"
                    }

            }
        }}
$indentation}"""
    }

    private fun Struct.printMemberDocumentation(prefix: String = "", documentation: MutableList<String> = ArrayList()): List<String> {
        members.forEach {
            if (it.isNestedStructDefinition)
                (it.nativeType as StructType).definition.printMemberDocumentation(if (it.name === ANONYMOUS) prefix else "$prefix${it.name}.", documentation)
            else if (it.documentation.isNotEmpty() || it.links.isNotEmpty()) {
                val doc = if (it.links.isEmpty())
                    it.documentation
                else
                    it.linkMode.appendLinks(
                        it.documentation,
                        if (!it.links.contains('+')) it.links else linksFromRegex(it.links)
                    )
                documentation.add("{@code $prefix${it.name}} &ndash; $doc")
            }
        }
        return documentation
    }

    private fun StructMember.error(msg: String) {
        throw IllegalArgumentException("$msg [${this@Struct.className}, member: $name]")
    }

    private fun validate(mallocable: Boolean) {
        if (mallocable) {
            members.forEach {
                if (it.nativeType is PointerType<*> && it.nativeType.elementType is StructType)
                    it.nativeType.elementType.definition.hasUsageInput()
            }
        }

        members.filter { it.has<AutoSizeMember>() }.forEach {
            val autoSize = it.get<AutoSizeMember>()

            autoSize.references.forEach { reference ->
                val bufferParam = members.firstOrNull { it.name == reference }
                if (bufferParam == null)
                    it.error("Reference does not exist: AutoSize($reference)")
                else {
                    if (bufferParam !is StructMemberArray) {
                        if (bufferParam.nativeType !is PointerType<*>)
                            it.error("Reference must be a pointer type: AutoSize($reference)")

                        if (!bufferParam.nativeType.isPointerData)
                            it.error("Reference must not be a opaque pointer: AutoSize($reference)")

                        if ((bufferParam.nativeType as PointerType<*>).elementType is StructType && bufferParam !is StructMemberBuffer)
                            it.error("Reference must be a struct buffer: AutoSize($reference)")
                    } else if (autoSize.optional || autoSize.atLeastOne)
                        it.error("Optional cannot be used with array references: AutoSize($reference)")

                    if (autoSize.atLeastOne && !bufferParam.has(nullable))
                        it.error("The \"atLeastOne\" option requires references to be nullable: AutoSize($reference)")
                }
            }
        }
    }

    override fun PrintWriter.generateJava() {
        val mallocable = mutable || usageOutput || (usageInput && !usageResultPointer)
        validate(mallocable)

        val nativeLayout = this@Struct.nativeLayout || members.isEmpty()
        if (!nativeLayout && preamble.hasNativeDirectives)
            kotlin.io.println("${t}Unnecessary native directives in struct: ${module.packageKotlin}.$className")

        print(HEADER)
        println("package $packageName;\n")

        println("import javax.annotation.*;\n")

        println("import java.nio.*;\n")

        if (mallocable || members.any { m -> m.nativeType.let {
            (it.mapping === PointerMapping.DATA_POINTER && it is PointerType<*> && (it.elementType !is StructType || m is StructMemberArray)) ||
            (it.mapping === PrimitiveMapping.POINTER && m is StructMemberArray && it !is StructType)
        } })
            println("import org.lwjgl.*;")
        println("import org.lwjgl.system.*;\n")

        fun Struct.hasChecks(): Boolean = visibleMembers.any {
            (it is StructMemberArray && it !is StructMemberCharArray) ||
            (
                (mutable || it.mutable) &&
                (
                    it is StructMemberArray ||
                    it.nativeType is CharSequenceType ||
                    (it.nativeType is PointerType<*> && !it.has(NullableMember))
                )
            ) ||
            it.isNestedStructDefinition && (it.nativeType as StructType).definition.hasChecks()
        }

        if (Module.CHECKS && hasChecks())
            println("import static org.lwjgl.system.Checks.*;")
        println("import static org.lwjgl.system.MemoryUtil.*;")
        if (nativeLayout || mallocable)
            println("import static org.lwjgl.system.MemoryStack.*;")

        println()
        preamble.printJava(this)

        printDocumentation()
        if (className != nativeName) {
            println("@NativeType(\"$nativeNameQualified\")")
        }
        print("${access.modifier}class $className extends ")
        print(extends?.className ?: "Struct${if (mallocable) " implements NativeResource" else ""}"
        )

        print(""" {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;
""")

        if (members.isNotEmpty() && (!nativeLayout || visibleMembers.any())) {
            val memberCount = getMemberCount(members)

            // Member offset fields

            if (visibleMembers.any()) {
                print("""
    /** The struct member offsets. */
    public static final int
""")
                generateOffsetFields(visibleMembers)
                println(";")
            }

            print("""
    static {""")
            if (static != null)
                print("""
        $static
""")

            // Member offset initialization

            if (nativeLayout) {
                print("""
        try (MemoryStack stack = stackPush()) {
            IntBuffer offsets = stack.mallocInt(${memberCount + 1});
            SIZEOF = offsets(memAddress(offsets));

""")
                generateOffsetInit(members, indentation = "$t$t$t")
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

            print("$t}")
        } else {
            print("""
    static {""")
            if (static != null)
                print("""
        $static
""")
            print("""
        try (MemoryStack stack = stackPush()) {
            IntBuffer offsets = stack.mallocInt(1);
            SIZEOF = offsets(memAddress(offsets));
            ALIGNOF = offsets.get(0);
        }
    }""")
        }

        if (nativeLayout)
            print("""

    private static native int offsets(long buffer);""")

        print("""

    $className(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link $className} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    ${access.modifier}$className(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }
""")

        var members = publicMembers
        if (members.any()) {
            println()
            generateGetters(AccessMode.INSTANCE, members)

            if (hasMutableMembers()) {
                println()
                generateSetters(AccessMode.INSTANCE, settableMembers)

                if (settableMembers.singleOrNull() == null && !containsUnion) {
                    val javadoc = "Initializes this struct with the specified values."
                    if (generateAlternativeMultiSetter(settableMembers))
                        generateMultiSetter(javadoc, settableMembers, Struct::generateAlternativeMultiSetterParameters, Struct::generateAlternativeMultiSetterSetters, MultiSetterMode.ALTER)
                    else
                        generateMultiSetter(javadoc, settableMembers, Struct::generateMultiSetterParameters, Struct::generateMultiSetterSetters)
                }

                print("""
    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public $className set($className src) {
        memCopy(src.$ADDRESS, $ADDRESS, SIZEOF);
        return this;
    }
""")
            }
        }

        print("""
    // -----------------------------------
""")

        // Factory constructors
        if (mallocable) {
            print("""
    /** Returns a new {@link $className} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static $className malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link $className} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static $className calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link $className} instance allocated with {@link BufferUtils}. */
    public static $className create() {
        return new $className(BufferUtils.createByteBuffer(SIZEOF));
    }
""")
        }

        print("""
    /** Returns a new {@link $className} instance for the specified memory address. */
    public static $className create(long address) {
        return new $className(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static $className createSafe(long address) {
        return address == NULL ? null : create(address);
    }
""")
        if (mallocable) {
            print("""
    /**
     * Returns a new {@link $className.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param $BUFFER_CAPACITY_PARAM the buffer capacity
     */
    public static $className.Buffer malloc(int $BUFFER_CAPACITY_PARAM) {
        return create(__malloc($BUFFER_CAPACITY_PARAM, SIZEOF), $BUFFER_CAPACITY_PARAM);
    }

    /**
     * Returns a new {@link $className.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param $BUFFER_CAPACITY_PARAM the buffer capacity
     */
    public static $className.Buffer calloc(int $BUFFER_CAPACITY_PARAM) {
        return create(nmemCallocChecked($BUFFER_CAPACITY_PARAM, SIZEOF), $BUFFER_CAPACITY_PARAM);
    }

    /**
     * Returns a new {@link $className.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param $BUFFER_CAPACITY_PARAM the buffer capacity
     */
    public static $className.Buffer create(int $BUFFER_CAPACITY_PARAM) {
        return new Buffer(__create($BUFFER_CAPACITY_PARAM, SIZEOF));
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
    public static $className.Buffer create(long address, int $BUFFER_CAPACITY_PARAM) {
        return new Buffer(address, $BUFFER_CAPACITY_PARAM);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static $className.Buffer createSafe(long address, int $BUFFER_CAPACITY_PARAM) {
        return address == NULL ? null : create(address, $BUFFER_CAPACITY_PARAM);
    }
""")

        if (mallocable) {
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
    public static $className.Buffer mallocStack(int $BUFFER_CAPACITY_PARAM) {
        return mallocStack($BUFFER_CAPACITY_PARAM, stackGet());
    }

    /**
     * Returns a new {@link $className.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param $BUFFER_CAPACITY_PARAM the buffer capacity
     */
    public static $className.Buffer callocStack(int $BUFFER_CAPACITY_PARAM) {
        return callocStack($BUFFER_CAPACITY_PARAM, stackGet());
    }

    /**
     * Returns a new {@link $className.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param $BUFFER_CAPACITY_PARAM the buffer capacity
     */
    public static $className.Buffer mallocStack(int $BUFFER_CAPACITY_PARAM, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, $BUFFER_CAPACITY_PARAM * SIZEOF), $BUFFER_CAPACITY_PARAM);
    }

    /**
     * Returns a new {@link $className.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param $BUFFER_CAPACITY_PARAM the buffer capacity
     */
    public static $className.Buffer callocStack(int $BUFFER_CAPACITY_PARAM, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, $BUFFER_CAPACITY_PARAM, SIZEOF), $BUFFER_CAPACITY_PARAM);
    }
""")
        }

        print("""
    // -----------------------------------

""")

        members = visibleMembers
        if (members.any()) {
            generateStaticGetters(members)
            println()

            if (hasMutableMembers(visibleMembers)) {
                generateStaticSetters(mutableMembers(visibleMembers))
                println()

                if (Module.CHECKS && validations.any()) {
                    println(
                        """    /**
     * Validates pointer members that should not be {@code NULL}.
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
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }
""")
                }
            }
        }

        println("$t// -----------------------------------")

        print("""
    /** An array of {@link $className} structs. */
    public static class Buffer extends """)

        print(if (extends == null)
            "StructBuffer<$className, Buffer>${if (mallocable) " implements NativeResource" else ""}"
        else
            "${extends.className}.Buffer"
        )

        print(""" {

        /**
         * Creates a new {@link $className.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link $className#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */""")

        print(if (extends == null)
            """
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }"""
        else
            """
        public Buffer(ByteBuffer container) {
            this(container, container.remaining() / SIZEOF);
        }

        private Buffer(ByteBuffer container, int remaining) {
            super(memAddress(container), container, -1, 0, remaining, remaining);
        }""")

        print("""

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected $className newInstance(long address) {
            return new $className(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }
""")
        members = publicMembers
        if (members.any()) {
            println()
            generateGetters(AccessMode.FLYWEIGHT, members)

            if (hasMutableMembers()) {
                println()
                generateSetters(AccessMode.FLYWEIGHT, settableMembers)
            }
        }

        print("""
    }

}""")
    }

    private fun PrintWriter.generateOffsetFields(
        members: Sequence<StructMember>,
        indentation: String = "$t$t",
        parentField: String = "",
        moreOverride: Boolean = false
    ) {
        members.forEachWithMore(moreOverride) { member, more ->
            if (member.name === ANONYMOUS && member.isNestedStruct) {
                generateOffsetFields(member.nestedMembers, indentation, parentField, more) // recursion
            } else {
                if (more)
                    println(",")

                val field = member.offsetField(parentField)

                print("$indentation$field")

                // Output nested field offsets
                if (member.isNestedStructDefinition)
                    generateOffsetFields(member.nestedMembers, "$indentation$t", field, true) // recursion
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
        indentation: String = "$t$t",
        parentField: String = "",
        offset: Int = 0
    ): Int {
        var index = offset
        members.forEach {
            if (it.name === ANONYMOUS && it.isNestedStruct) {
                index = generateOffsetInit((it.nativeType as StructType).definition.members, indentation, parentField, index + 1) // recursion
            } else {
                val field = it.offsetField(parentField)
                try {
                    if (it is StructMemberPadding)
                        return@forEach

                    println("$indentation$field = ${if (nativeLayout) "offsets.get" else "layout.offsetof"}($index);")
                } finally {
                    index++
                }

                // Output nested fields
                if (it.isNestedStructDefinition)
                    index = generateOffsetInit((it.nativeType as StructType).definition.members, "$indentation$t", field, index) // recursion
            }
        }
        return index
    }

    private fun PrintWriter.generateLayout(
        struct: Struct,
        indentation: String = "$t$t",
        parentField: String = ""
    ) {
        println("__${if (struct.union) "union" else "struct"}(")
        struct.members.forEachWithMore { it, more ->
            val field = it.offsetField(parentField)

            if (more)
                println(",")
            if (it is StructMemberPadding) {
                print("$indentation${t}__padding(${it.size}, ${it.condition ?: "true"})")
            } else if (it.isNestedStructDefinition) {
                print("$indentation$t")
                generateLayout((it.nativeType as StructType).definition, "$indentation$t", field)
                //print(")")
            } else {
                val size: String
                val alignment: String

                if (it.nativeType is StructType) {
                    size = "${it.nativeType.javaMethodType}.SIZEOF"
                    alignment = "${it.nativeType.javaMethodType}.ALIGNOF"
                } else {
                    size = if (it.nativeType.isPointer)
                        "POINTER_SIZE"
                    else
                        (it.nativeType.mapping as PrimitiveMapping).bytes.toString()
                    alignment = size
                }

                if (it is StructMemberArray)
                    print("$indentation${t}__array($size${if (size != alignment) ", $alignment" else ""}, ${it.size})")
                else
                    print("$indentation${t}__member($size${if (size != alignment) ", $alignment" else ""})")
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

                if (it.isNestedStructDefinition) {
                    generateMultiSetterParameters(writer, it.nestedMembers, method, mode, more) // recursion
                    return@forEachWithMore
                }

                if (more)
                    println(",")

                print("$t$t")

                val param = it.field(parentMember)
                print("${it.nativeType.javaMethodType} $param")
            }
        }
    }

    private fun generateMultiSetterSetters(writer: PrintWriter, members: Sequence<StructMember>, parentMember: String, mode: MultiSetterMode) {
        writer.apply {
            members.forEach {
                val field = it.field(parentMember)

                if (it.isNestedStructDefinition)
                    generateMultiSetterSetters(writer, it.nestedMembers, field, mode) // recursion
                else
                    println("$t$t$field($field);")
            }
        }
    }

    private fun generateAlternativeMultiSetter(members: Sequence<StructMember>): Boolean =
        members.any {
            if (it.isNestedStructDefinition)
                generateAlternativeMultiSetter(it.nestedMembers) // recursion
            else
                it is StructMemberArray || it.nativeType.isPointerData
        }

    private fun generateAlternativeMultiSetterParameters(writer: PrintWriter, members: Sequence<StructMember>, parentMember: String, mode: MultiSetterMode, more: Boolean) {
        writer.apply {
            members.forEachWithMore(more) { it, more ->
                val method = it.field(parentMember)

                if (it.isNestedStructDefinition) {
                    generateAlternativeMultiSetterParameters(writer, it.nestedMembers, method, mode, more) // recursion
                    return@forEachWithMore
                }

                if (more)
                    println(",")

                print("$t$t")

                val param = it.field(parentMember)
                print(
                    if (it is StructMemberArray) {
                        if (it is StructMemberCharArray) {
                            when (mode) {
                                MultiSetterMode.NORMAL,
                                MultiSetterMode.ALTER -> "ByteBuffer $param"
                            }
                        } else if (it.nativeType is StructType)
                            "${it.nativeType.javaMethodType}.Buffer $param"
                        else
                            "${it.primitiveMapping.toPointer.javaMethodName} $param"
                    } else if (it.nativeType is PointerType<*> && it.nativeType.elementType is StructType) {
                        val structType = it.nativeType.javaMethodType
                        if (it is StructMemberBuffer)
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

                if (it.isNestedStructDefinition)
                    generateAlternativeMultiSetterSetters(writer, it.nestedMembers, field, mode) // recursion
                else
                    println("$t$t$field($field);")
            }
        }
    }

    private fun getFieldOffset(
        m: StructMember,
        parentStruct: Struct?,
        parentField: String
    ) = if (parentStruct == null || parentField.isEmpty())
        "$className.${m.offsetField}"
    else if (parentStruct.className === ANONYMOUS)
        "${parentField}_${m.offsetField}"
    else
        throw IllegalStateException()

    private val StructMember.pointerValue get() = if (!Module.CHECKS || has(nullable)) "value" else "check(value)"
    private val StructMember.isNullable
        get() = has(nullable) ||
                getReferenceMember<AutoSizeMember>(name)?.get<AutoSizeMember>()?.optional ?: false ||
                (this is StructMemberArray && this.validSize < this.size)
    private val StructMember.addressValue get() = if (isNullable) "memAddressSafe(value)" else "value.address()"
    private val StructMember.memAddressValue get() = if (isNullable) "memAddressSafe(value)" else "memAddress(value)"
    private val StructMember.autoSize get() = "n$name($STRUCT)"
        .let {
            val type = this.nativeType as IntegerType
            if (!type.unsigned)
                it
            else {
                val mapping = type.mapping
                when (mapping.bytes) {
                    1    -> "Byte.toUnsignedInt($it)"
                    2    -> "Short.toUnsignedInt($it)"
                    else -> it
                }
            }
        }
        .let {
            val factor = get<AutoSizeMember>().factor
            if (factor != null)
                "(${factor.scale(it)})"
            else
                it
        }
        .let { if (4 < (nativeType.mapping as PrimitiveMapping).bytes && !it.startsWith('(')) "(int)$it" else it }

    private fun PrintWriter.setRemaining(m: StructMember, offset: Int = 0, prefix: String = " ", suffix: String = "") {
        // do not do this if the AutoSize parameter auto-sizes multiple members
        val capacity = members.firstOrNull { it.has<AutoSizeMember>() && it.get<AutoSizeMember>().let { it.atLeastOne || (it.dependent.isEmpty() && it.reference == m.name) } }
        if (capacity != null) {
            val autoSize = capacity.get<AutoSizeMember>()
            val autoSizeExpression = "value.remaining()"
                .let {
                    if (autoSize.factor != null)
                        "(${autoSize.factor.scaleInv(it)})"
                    else
                        it
                }
                .let { if ((capacity.nativeType.mapping as PrimitiveMapping).bytes < 4) "(${capacity.nativeType.javaMethodType})$it" else it }
                .let { if (offset != 0) "$it - $offset" else it }

            print(prefix)
            print(if ((m has nullable || autoSize.optional) && m !is StructMemberArray) {
                if (autoSize.atLeastOne || (m has nullable && autoSize.optional))
                    "if (value != null) { n${capacity.name}($STRUCT, $autoSizeExpression); }"
                else
                    "n${capacity.name}($STRUCT, value == null ? 0 : $autoSizeExpression);"
            } else
                "n${capacity.name}($STRUCT, $autoSizeExpression);"
            )
            print(suffix)
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

            if (it.isNestedStruct) {
                val nestedStruct = (it.nativeType as StructType).definition
                val structType = nestedStruct.className
                if (structType === ANONYMOUS)
                    generateStaticSetters(
                        it.nestedMembers, nestedStruct,
                        if (it.name === ANONYMOUS) parentMember else setter,
                        if (it.name === ANONYMOUS) parentField else field
                    )
                else {
                    if (it.public)
                        println("$t/** Unsafe version of {@link #$setter($structType) $setter}. */")
                    println("${t}public static void n$setter(long $STRUCT, $structType value) { memCopy(value.$ADDRESS, $STRUCT + $field, $structType.SIZEOF); }")
                }
            } else {
                // Setter

                if (it !is StructMemberArray && !it.nativeType.isPointerData) {
                    if (it.nativeType is ObjectType) {
                        if (it.public)
                            println("$t/** Unsafe version of {@link #$setter(${it.nativeType.javaMethodType}) $setter}. */")
                        println("${t}public static void n$setter(long $STRUCT, ${it.nullable(it.nativeType.javaMethodType)} value) { memPutAddress($STRUCT + $field, ${it.addressValue}); }")
                    } else {
                        val javaType = it.nativeType.nativeMethodType
                        val bufferMethod = getBufferMethod(it, javaType)

                        if (it.public)
                            println(
                                if (it.has<AutoSizeMember>())
                                    "$t/** Sets the specified value to the {@code ${it.name}} field of the specified {@code struct}. */"
                                else
                                    "$t/** Unsafe version of {@link #$setter(${if (it.nativeType.mapping == PrimitiveMapping.BOOLEAN4) "boolean" else javaType}) $setter}. */"
                            )
                        print("${t}public static void n$setter(long $STRUCT, $javaType value) { memPut$bufferMethod($STRUCT + $field, ")
                        print(when {
                            javaType == "boolean"
                                 -> "value ? (byte)1 : (byte)0"
                            it.nativeType.mapping === PointerMapping.OPAQUE_POINTER
                                 -> it.pointerValue
                            else -> "value"
                        })
                        println("); }")
                    }
                }

                // Alternative setters

                if (it is StructMemberArray) {
                    if (it.nativeType.dereference is StructType) {
                        val structType = it.nativeType.javaMethodType
                        if (it.nativeType is PointerType<*>) {
                            if (it.public)
                                println("$t/** Unsafe version of {@link #$setter(PointerBuffer) $setter}. */")
                            println("${t}public static void n$setter(long $STRUCT, PointerBuffer value) {")
                            if (Module.CHECKS)
                                println("$t${t}if (CHECKS) { checkGT(value, ${it.size}); }")
                            println("$t${t}memCopy(memAddress(value), $STRUCT + $field, value.remaining() * POINTER_SIZE);")
                            setRemaining(it, prefix = "$t$t", suffix = "\n")
                            println("$t}")
                            val structTypeIndexed = "$structType${if (getReferenceMember<AutoSizeIndirect>(it.name) == null) "" else ".Buffer"}"
                            if (it.public)
                                println("$t/** Unsafe version of {@link #$setter(int, $structTypeIndexed) $setter}. */")
                            println("${t}public static void n$setter(long $STRUCT, int index, ${it.nullable(structTypeIndexed, isArray = false)} value) {")
                            println("$t${t}memPutAddress($STRUCT + $field + check(index, ${it.size}) * POINTER_SIZE, ${it.addressValue});")
                            println("$t}")
                        } else {
                            if (it.public)
                                println("$t/** Unsafe version of {@link #$setter($structType.Buffer) $setter}. */")
                            println("${t}public static void n$setter(long $STRUCT, $structType.Buffer value) {")
                            if (Module.CHECKS)
                                println("$t${t}if (CHECKS) { checkGT(value, ${it.size}); }")
                            println("$t${t}memCopy(value.$ADDRESS, $STRUCT + $field, value.remaining() * $structType.SIZEOF);")
                            setRemaining(it, prefix = "$t$t", suffix = "\n")
                            println("$t}")
                            if (it.public)
                                println("$t/** Unsafe version of {@link #$setter(int, $structType) $setter}. */")
                            println("${t}public static void n$setter(long $STRUCT, int index, $structType value) {")
                            println("$t${t}memCopy(value.$ADDRESS, $STRUCT + $field + check(index, ${it.size}) * $structType.SIZEOF, $structType.SIZEOF);")
                            println("$t}")
                        }
                    } else if (it is StructMemberCharArray) {
                        val mapping = it.nativeType.mapping as PrimitiveMapping
                        val byteSize = if (mapping.bytes == 1) it.size else "${it.size} * ${mapping.bytes}"

                        if (it.public)
                            println("$t/** Unsafe version of {@link #$setter(ByteBuffer) $setter}. */")
                        println("${t}public static void n$setter(long $STRUCT, ByteBuffer value) {")
                        if (Module.CHECKS) {
                            println("$t${t}if (CHECKS) {")
                            println("$t$t${t}checkNT${mapping.bytes}(value);")
                            println("$t$t${t}checkGT(value, $byteSize);")
                            println("$t$t}")
                        }
                        println("$t${t}memCopy(memAddress(value), $STRUCT + $field, value.remaining());")
                        setRemaining(it, mapping.bytes, prefix = "$t$t", suffix = "\n")
                        println("$t}")
                    } else {
                        val mapping = it.primitiveMapping
                        val bytesPerElement = if (mapping === PrimitiveMapping.POINTER) "POINTER_SIZE" else mapping.bytes.toString()
                        val bufferType = mapping.toPointer.javaMethodName

                        if (it.public)
                            println("$t/** Unsafe version of {@link #$setter($bufferType) $setter}. */")
                        println("${t}public static void n$setter(long $STRUCT, $bufferType value) {")
                        if (Module.CHECKS)
                            println("$t${t}if (CHECKS) { checkGT(value, ${it.size}); }")
                        println("$t${t}memCopy(memAddress(value), $STRUCT + $field, value.remaining() * $bytesPerElement);")
                        setRemaining(it, prefix = "$t$t", suffix = "\n")
                        println("$t}")

                        val javaType = it.nativeType.nativeMethodType

                        if (it.public)
                            println("$t/** Unsafe version of {@link #$setter(int, $javaType) $setter}. */")
                        println("${t}public static void n$setter(long $STRUCT, int index, $javaType value) {")
                        println("$t${t}memPut${getBufferMethod(it, javaType)}($STRUCT + $field + check(index, ${it.size}) * $bytesPerElement, value);")
                        println("$t}")
                    }
                } else if (it.nativeType is CharSequenceType) {
                    val mapping = it.nativeType.charMapping

                    if (it.public)
                        println("$t/** Unsafe version of {@link #$setter(ByteBuffer) $setter}. */")
                    println("${t}public static void n$setter(long $STRUCT, ${it.nullable("ByteBuffer")} value) {")
                    if (Module.CHECKS)
                        println("$t${t}if (CHECKS) { checkNT${mapping.bytes}${if (it.isNullable) "Safe" else ""}(value); }")
                    println("$t${t}memPutAddress($STRUCT + $field, ${it.memAddressValue});")
                    println("$t}")
                } else if (it.nativeType.isPointerData) {
                    val paramType = it.nativeType.javaMethodType
                    if (it.nativeType.dereference is StructType) {
                        if (it is StructMemberBuffer) {
                            if (it.public)
                                println("$t/** Unsafe version of {@link #$setter($paramType.Buffer) $setter}. */")
                            print("${t}public static void n$setter(long $STRUCT, ${it.nullable("$paramType.Buffer")} value) { memPutAddress($STRUCT + $field, ${it.addressValue});")
                            setRemaining(it)
                            println(" }")
                        } else {
                            if (it.public)
                                println("$t/** Unsafe version of {@link #$setter($paramType) $setter}. */")
                            println("${t}public static void n$setter(long $STRUCT, ${it.nullable(paramType)} value) { memPutAddress($STRUCT + $field, ${it.addressValue}); }")
                        }
                    } else {
                        if (it.public)
                            println("$t/** Unsafe version of {@link #$setter($paramType) $setter}. */")
                        print("${t}public static void n$setter(long $STRUCT, ${it.nullable(paramType)} value) { memPutAddress($STRUCT + $field, ${it.memAddressValue});")
                        setRemaining(it)
                        println(" }")
                    }
                }
            }
        }
    }

    private fun StructMember.annotate(type: String, arraySize: String? = null) = nativeType.annotate(type, arraySize).let {
        if (arraySize == null)
            nullable(it, false)
        else
            it
    }

    private fun StructMember.nullable(type: String, isArray: Boolean = this is StructMemberArray) =
        if (nativeType.isReference && isNullable && !isArray) {
            "@Nullable $type"
        } else {
            type
        }

    private fun StructMember.construct(type: String) = if (nativeType.isReference && isNullable) {
        "$type.createSafe"
    } else {
        "$type.create"
    }

    private fun StructMember.mem(type: String) = if (nativeType.isReference && isNullable && this !is StructMemberArray) {
        "mem${type}Safe"
    } else {
        "mem$type"
    }

    private fun PrintWriter.generateSetters(
        accessMode: AccessMode,
        members: Sequence<StructMember>,
        parentSetter: String = "",
        parentMember: String = ""
    ) {
        val n = if (accessMode === AccessMode.INSTANCE) "n" else "$className.n"
        members.forEach {
            val setter = it.field(parentSetter)
            val member = it.fieldName(parentMember)

            val indent = accessMode.indent
            val overrides = extends != null && extends.members.any { parentMember -> parentMember.name == it.name }

            val returnType = if (accessMode === AccessMode.INSTANCE)
                className
            else
                "$className.Buffer"

            if (it.isNestedStruct) {
                val structType = it.nativeType.javaMethodType
                if (structType === ANONYMOUS)
                    generateSetters(
                        accessMode,
                        it.nestedMembers,
                        if (it.name === ANONYMOUS) parentSetter else setter,
                        if (it.name === ANONYMOUS) parentMember else member
                    )
                else {
                    println("$indent/** Copies the specified {@link $structType} to the {@code $member} field. */")
                    if (overrides) println("$indent@Override")
                    println("${indent}public $returnType $setter(${it.annotate(structType)} value) { $n$setter($ADDRESS, value); return this; }")
                }
            } else {
                // Setter

                if (it !is StructMemberArray && !it.nativeType.isPointerData) {
                    println("$indent/** Sets the specified value to the {@code $member} field. */")
                    if (overrides) println("$indent@Override")
                    println("${indent}public $returnType $setter(${it.annotate(it.nativeType.javaMethodType)} value) { $n$setter($ADDRESS, value${if (it.nativeType.mapping === PrimitiveMapping.BOOLEAN4) " ? 1 : 0" else ""}); return this; }")
                }

                // Alternative setters

                if (it is StructMemberArray) {
                    if (it.nativeType.dereference is StructType) {
                        val structType = it.nativeType.javaMethodType
                        if (it.nativeType is PointerType<*>) {
                            println("$indent/** Copies the specified {@link PointerBuffer} to the {@code $member} field. */")
                            if (overrides) println("$indent@Override")
                            println("${indent}public $returnType $setter(${it.annotate("PointerBuffer", it.size)} value) { $n$setter($ADDRESS, value); return this; }")
                            println("$indent/** Copies the address of the specified {@link $structType} at the specified index of the {@code $member} field. */")
                        } else {
                            println("$indent/** Copies the specified {@link $structType.Buffer} to the {@code $member} field. */")
                            if (overrides) println("$indent@Override")
                            println("${indent}public $returnType $setter(${it.annotate("$structType.Buffer", it.size)} value) { $n$setter($ADDRESS, value); return this; }")
                            println("$indent/** Copies the specified {@link $structType} at the specified index of the {@code $member} field. */")
                        }
                        if (overrides) println("$indent@Override")
                        println("${indent}public $returnType $setter(int index, ${it.annotate("$structType${if (getReferenceMember<AutoSizeIndirect>(it.name) == null) "" else ".Buffer"}")} value) { $n$setter($ADDRESS, index, value); return this; }")
                    } else if (it is StructMemberCharArray) {
                        println("$indent/** Copies the specified encoded string to the {@code $member} field. */")
                        if (overrides) println("$indent@Override")
                        println("${indent}public $returnType $setter(${it.annotate("ByteBuffer", it.size)} value) { $n$setter($ADDRESS, value); return this; }")
                    } else {
                        val bufferType = it.primitiveMapping.toPointer.javaMethodName
                        println("$indent/** Copies the specified {@link $bufferType} to the {@code $member} field. */")
                        if (overrides) println("$indent@Override")
                        println("${indent}public $returnType $setter(${it.annotate(bufferType, it.size)} value) { $n$setter($ADDRESS, value); return this; }")
                        println("$indent/** Sets the specified value at the specified index of the {@code $member} field. */")
                        if (overrides) println("$indent@Override")
                        println("${indent}public $returnType $setter(int index, ${it.annotate(it.nativeType.javaMethodType)} value) { $n$setter($ADDRESS, index, value); return this; }")
                    }
                } else if (it.nativeType is CharSequenceType) {
                    println("$indent/** Sets the address of the specified encoded string to the {@code $member} field. */")
                    if (overrides) println("$indent@Override")
                    println("${indent}public $returnType $setter(${it.annotate("ByteBuffer")} value) { $n$setter($ADDRESS, value); return this; }")
                } else if (it.nativeType.isPointerData) {
                    val pointerType = it.nativeType.javaMethodType
                    if (it is StructMemberBuffer) {
                        println("$indent/** Sets the address of the specified {@link $pointerType.Buffer} to the {@code $member} field. */")
                        if (overrides) println("$indent@Override")
                        println("${indent}public $returnType $setter(${it.annotate("$pointerType.Buffer")} value) { $n$setter($ADDRESS, value); return this; }")
                    } else {
                        println("$indent/** Sets the address of the specified {@link $pointerType} to the {@code $member} field. */")
                        if (overrides) println("$indent@Override")
                        println("${indent}public $returnType $setter(${it.annotate(pointerType)} value) { $n$setter($ADDRESS, value); return this; }")
                    }
                }
            }
        }
    }

    private fun PrintWriter.generateStaticGetters(
        members: Sequence<StructMember>,
        parentStruct: Struct? = null,
        parentGetter: String = "",
        parentField: String = ""
    ) {
        members.forEach {
            val getter = it.field(parentGetter)
            val field = getFieldOffset(it, parentStruct, parentField)

            if (it.isNestedStruct) {
                val nestedStruct = (it.nativeType as StructType).definition
                val structType = nestedStruct.className
                if (structType === ANONYMOUS)
                    generateStaticGetters(
                        it.nestedMembers, nestedStruct,
                        if (it.name === ANONYMOUS) parentGetter else getter,
                        if (it.name === ANONYMOUS) parentField else field
                    )
                else {
                    if (it.public)
                        println("$t/** Unsafe version of {@link #$getter}. */")
                    println("${t}public static $structType n$getter(long $STRUCT) { return $structType.create($STRUCT + $field); }")
                }
            } else {
                // Getter

                if (it !is StructMemberArray && !it.nativeType.isPointerData) {
                    if (it.public)
                        println("$t/** Unsafe version of {@link #$getter}. */")
                    if (it.nativeType is CallbackType) {
                        println("$t${it.nullable("public")} static ${it.nativeType.className} n$getter(long $STRUCT) { return ${it.construct(it.nativeType.className)}(memGetAddress($STRUCT + $field)); }")
                    } else {
                        val javaType = it.nativeType.nativeMethodType
                        val bufferMethod = getBufferMethod(it, javaType)

                        print("${t}public static $javaType n$getter(long $STRUCT) { return memGet$bufferMethod($STRUCT + $field)")
                        if (it.nativeType.mapping === PrimitiveMapping.BOOLEAN)
                            print(" != 0")
                        println("; }")
                    }
                }

                // Alternative getters

                if (it is StructMemberArray) {
                    if (it.nativeType.dereference is StructType) {
                        val nestedStruct = it.nativeType.javaMethodType
                        val size = getReferenceMember<AutoSizeMember>(it.name)?.autoSize ?: it.size
                        if (it.nativeType is PointerType<*>) {
                            val autoSizeIndirect = getReferenceMember<AutoSizeIndirect>(it.name)

                            if (it.public)
                                println("$t/** Unsafe version of {@link #$getter}. */")
                            println("$t${it.nullable("public")} static PointerBuffer n$getter(long $STRUCT) { return ${it.mem("PointerBuffer")}($STRUCT + $field, $size); }")
                            if (it.public)
                                println("$t/** Unsafe version of {@link #$getter(int) $getter}. */")
                            println("$t${it.nullable("public", isArray = false)} static $nestedStruct${if (autoSizeIndirect == null) "" else ".Buffer"} n$getter(long $STRUCT, int index) {")
                            println("$t${t}return ${it.construct(nestedStruct)}(memGetAddress($STRUCT + $field + check(index, $size) * POINTER_SIZE)${autoSizeIndirect.let {
                                if (it == null) "" else ", n${it.name}($STRUCT)"
                            }});")
                            println("$t}")
                        } else {
                            if (it.public)
                                println("$t/** Unsafe version of {@link #$getter}. */")
                            println("$t${it.nullable("public")} static $nestedStruct.Buffer n$getter(long $STRUCT) { return ${it.construct(nestedStruct)}($STRUCT + $field, $size); }")
                            if (it.public)
                                println("$t/** Unsafe version of {@link #$getter(int) $getter}. */")
                            println("$t${it.nullable("public")} static $nestedStruct n$getter(long $STRUCT, int index) {")
                            println("$t${t}return ${it.construct(nestedStruct)}($STRUCT + $field + check(index, $size) * $nestedStruct.SIZEOF);")
                            println("$t}")
                        }
                    } else if (it is StructMemberCharArray) {
                        val mapping = it.nativeType.mapping as CharMapping
                        val capacity = getReferenceMember<AutoSizeMember>(it.name)
                        val byteSize = capacity?.autoSize ?: if (mapping.bytes == 1) it.size else "${it.size} * ${mapping.bytes}"

                        if (it.public)
                            println("$t/** Unsafe version of {@link #$getter}. */")
                        println("${t}public static ByteBuffer n$getter(long $STRUCT) { return memByteBuffer($STRUCT + $field, $byteSize); }")
                        if (it.public)
                            println("$t/** Unsafe version of {@link #${getter}String}. */")
                        println("${t}public static String n${getter}String(long $STRUCT) { return mem${mapping.charset}(${if (capacity != null) "n$getter($STRUCT)" else "$STRUCT + $field"}); }")
                    } else {
                        val mapping = it.primitiveMapping
                        val bufferType = mapping.toPointer.javaMethodName

                        if (it.public)
                            println("$t/** Unsafe version of {@link #$getter}. */")
                        println("$t${it.nullable("public")} static $bufferType n$getter(long $STRUCT) { return ${it.mem(bufferType)}($STRUCT + $field, ${getReferenceMember<AutoSizeMember>(it.name)?.autoSize ?: it.size}); }")

                        val javaType = it.nativeType.nativeMethodType
                        val bytesPerElement = if (mapping === PrimitiveMapping.POINTER) "POINTER_SIZE" else mapping.bytes.toString()

                        if (it.public)
                            println("$t/** Unsafe version of {@link #$getter(int) $getter}. */")
                        println("${t}public static $javaType n$getter(long $STRUCT, int index) {")
                        print("$t${t}return memGet${getBufferMethod(it, javaType)}($STRUCT + $field + check(index, ${it.size}) * $bytesPerElement)")
                        if (it.nativeType.mapping === PrimitiveMapping.BOOLEAN)
                            print(" != 0")
                        println(";\n$t}")
                    }
                } else if (it.nativeType is CharSequenceType) {
                    val mapping = it.nativeType.charMapping
                    if (it.public)
                        println("$t/** Unsafe version of {@link #$getter}. */")
                    println("$t${it.nullable("public")} static ByteBuffer n$getter(long $STRUCT) { return ${it.mem("ByteBufferNT${mapping.bytes}")}(memGetAddress($STRUCT + $field)); }")
                    if (it.public)
                        println("$t/** Unsafe version of {@link #${getter}String}. */")
                    println("$t${it.nullable("public")} static String n${getter}String(long $STRUCT) { return ${it.mem(mapping.charset)}(memGetAddress($STRUCT + $field)); }")
                } else if (it.nativeType.isPointerData) {
                    val returnType = it.nativeType.javaMethodType
                    if (it.nativeType.dereference is StructType) {
                        if (it.public)
                            println("$t/** Unsafe version of {@link #$getter}. */")
                        println(if (it is StructMemberBuffer) {
                            val capacity = getReferenceMember<AutoSizeMember>(it.name)
                            if (capacity == null)
                                "$t${it.nullable("public")} static $returnType.Buffer n$getter(long $STRUCT, int $BUFFER_CAPACITY_PARAM) { return ${it.construct(returnType)}(memGetAddress($STRUCT + $field), $BUFFER_CAPACITY_PARAM); }"
                            else
                                "$t${it.nullable("public")} static $returnType.Buffer n$getter(long $STRUCT) { return ${it.construct(returnType)}(memGetAddress($STRUCT + $field), ${capacity.autoSize}); }"
                        } else
                            "$t${it.nullable("public")} static $returnType n$getter(long $STRUCT) { return ${it.construct(returnType)}(memGetAddress($STRUCT + $field)); }"
                        )
                    } else {
                        val capacity = getReferenceMember<AutoSizeMember>(it.name)
                        if (capacity == null) {
                            if (it.public)
                                println("$t/** Unsafe version of {@link #$getter(int) $getter}. */")
                            println("$t${it.nullable("public")} static $returnType n$getter(long $STRUCT, int $BUFFER_CAPACITY_PARAM) { return ${it.mem(returnType)}(memGetAddress($STRUCT + $field), $BUFFER_CAPACITY_PARAM); }")
                        } else {
                            if (it.public)
                                println("$t/** Unsafe version of {@link #$getter() $getter}. */")
                            println("$t${it.nullable("public")} static $returnType n$getter(long $STRUCT) { return ${it.mem(returnType)}(memGetAddress($STRUCT + $field), ${capacity.autoSize}); }")
                        }
                    }
                }
            }
        }
    }

    private fun PrintWriter.generateGetterAnnotations(indent: String, overrides: Boolean, member: StructMember, type: String, arraySize: String? = null) {
        if (overrides) println("$indent@Override")
        if (arraySize == null && member.nativeType.isReference && member.isNullable) {
            println("$indent@Nullable")
        }
        member.nativeType.annotation(type, arraySize).let {
            if (it != null)
                println("$indent$it")
        }
    }

    private fun PrintWriter.generateGetters(
        accessMode: AccessMode,
        members: Sequence<StructMember>,
        parentGetter: String = "",
        parentMember: String = ""
    ) {
        val n = if (accessMode === AccessMode.INSTANCE) "n" else "$className.n"
        members.forEach {
            val getter = it.field(parentGetter)
            val member = it.fieldName(parentMember)

            val indent = accessMode.indent
            val overrides = extends != null && extends.members.any { parentMember -> parentMember.name == it.name }

            if (it.isNestedStruct) {
                val nestedStruct = (it.nativeType as StructType).definition
                val structType = nestedStruct.className
                if (structType === ANONYMOUS)
                    generateGetters(
                        accessMode,
                        it.nestedMembers,
                        if (it.name === ANONYMOUS) parentGetter else getter,
                        if (it.name === ANONYMOUS) parentMember else member
                    )
                else {
                    println("$indent/** Returns a {@link $structType} view of the {@code $member} field. */")
                    generateGetterAnnotations(indent, overrides, it, structType)
                    println("${indent}public $structType $getter() { return $n$getter($ADDRESS); }")
                }
            } else {
                // Getter

                if (it !is StructMemberArray && !it.nativeType.isPointerData) {
                    val returnType = when (it.nativeType) {
                        is CallbackType -> it.nativeType.className
                        is ObjectType   -> "long"
                        else            -> it.nativeType.javaMethodType
                    }
                    println("$indent/** Returns the value of the {@code $member} field. */")
                    generateGetterAnnotations(indent, overrides, it, returnType)
                    println("${indent}public $returnType $getter() { return $n$getter($ADDRESS)${if (it.nativeType.mapping === PrimitiveMapping.BOOLEAN4) " != 0" else ""}; }")
                }

                // Alternative getters

                if (it is StructMemberArray) {
                    if (it.nativeType.dereference is StructType) {
                        val structType = it.nativeType.javaMethodType
                        if (it.nativeType is PointerType<*>) {
                            println("$indent/** Returns a {@link PointerBuffer} view of the {@code $member} field. */")
                            generateGetterAnnotations(indent, overrides, it, "PointerBuffer", it.size)
                            println("${indent}public PointerBuffer $getter() { return $n$getter($ADDRESS); }")

                            val retType = "$structType${if (getReferenceMember<AutoSizeIndirect>(it.name) == null) "" else ".Buffer"}"
                            println("$indent/** Returns a {@link $structType} view of the pointer at the specified index of the {@code $member} field. */")
                            generateGetterAnnotations(indent, overrides, it, retType)
                            println("${indent}public $retType $getter(int index) { return $n$getter($ADDRESS, index); }")
                        } else {
                            println("$indent/** Returns a {@link $structType}.Buffer view of the {@code $member} field. */")
                            generateGetterAnnotations(indent, overrides, it, "$structType.Buffer", it.size)
                            println("${indent}public $structType.Buffer $getter() { return $n$getter($ADDRESS); }")
                            println("$indent/** Returns a {@link $structType} view of the struct at the specified index of the {@code $member} field. */")
                            generateGetterAnnotations(indent, overrides, it, structType)
                            println("${indent}public $structType $getter(int index) { return $n$getter($ADDRESS, index); }")
                        }
                    } else if (it is StructMemberCharArray) {
                        println("$indent/** Returns a {@link ByteBuffer} view of the {@code $member} field. */")
                        generateGetterAnnotations(indent, overrides, it, "ByteBuffer", it.size)
                        println("${indent}public ByteBuffer $getter() { return $n$getter($ADDRESS); }")
                        println("$indent/** Decodes the null-terminated string stored in the {@code $member} field. */")
                        generateGetterAnnotations(indent, overrides, it, "String", it.size)
                        println("${indent}public String ${getter}String() { return $n${getter}String($ADDRESS); }")
                    } else {
                        val bufferType = it.primitiveMapping.toPointer.javaMethodName
                        println("$indent/** Returns a {@link $bufferType} view of the {@code $member} field. */")
                        generateGetterAnnotations(indent, overrides, it, bufferType, it.size)
                        println("${indent}public $bufferType $getter() { return $n$getter($ADDRESS); }")
                        println("$indent/** Returns the value at the specified index of the {@code $member} field. */")
                        generateGetterAnnotations(indent, overrides, it, it.nativeType.nativeMethodType)
                        println("${indent}public ${it.nativeType.nativeMethodType} $getter(int index) { return $n$getter($ADDRESS, index); }")
                    }
                } else if (it.nativeType is CharSequenceType) {
                    println("$indent/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code $member} field. */")
                    generateGetterAnnotations(indent, overrides, it, "ByteBuffer")
                    println("${indent}public ByteBuffer $getter() { return $n$getter($ADDRESS); }")
                    println("$indent/** Decodes the null-terminated string pointed to by the {@code $member} field. */")
                    generateGetterAnnotations(indent, overrides, it, "String")
                    println("${indent}public String ${getter}String() { return $n${getter}String($ADDRESS); }")
                } else if (it.nativeType.isPointerData) {
                    val returnType = it.nativeType.javaMethodType
                    if (it.nativeType.dereference is StructType) {
                        if (it is StructMemberBuffer) {
                            if (getReferenceMember<AutoSizeMember>(it.name) == null) {
                                println("""$indent/**
$indent * Returns a {@link $returnType.Buffer} view of the struct array pointed to by the {@code $member} field.
$indent *
$indent * @param $BUFFER_CAPACITY_PARAM the number of elements in the returned buffer
$indent */""")
                                generateGetterAnnotations(indent, overrides, it, "$returnType.Buffer")
                                println("${indent}public $returnType.Buffer $getter(int $BUFFER_CAPACITY_PARAM) { return $n$getter($ADDRESS, $BUFFER_CAPACITY_PARAM); }")
                            } else {
                                println("$indent/** Returns a {@link $returnType.Buffer} view of the struct array pointed to by the {@code $member} field. */")
                                generateGetterAnnotations(indent, overrides, it, "$returnType.Buffer")
                                println("${indent}public $returnType.Buffer $getter() { return $n$getter($ADDRESS); }")
                            }
                        } else {
                            println("$indent/** Returns a {@link $returnType} view of the struct pointed to by the {@code $member} field. */")
                            generateGetterAnnotations(indent, overrides, it, returnType)
                            println("${indent}public $returnType $getter() { return $n$getter($ADDRESS); }")
                        }
                    } else {
                        if (getReferenceMember<AutoSizeMember>(it.name) == null) {
                            println(
                                """$indent/**
$indent * Returns a {@link $returnType} view of the data pointed to by the {@code $member} field.
$indent *
$indent * @param $BUFFER_CAPACITY_PARAM the number of elements in the returned buffer
$indent */""")
                            generateGetterAnnotations(indent, overrides, it, returnType)
                            println("${indent}public $returnType $getter(int $BUFFER_CAPACITY_PARAM) { return $n$getter($ADDRESS, $BUFFER_CAPACITY_PARAM); }")
                        } else {
                            println("$indent/** Returns a {@link $returnType} view of the data pointed to by the {@code $member} field. */")
                            generateGetterAnnotations(indent, overrides, it, returnType)
                            println("${indent}public $returnType $getter() { return $n$getter($ADDRESS); }")
                        }
                    }
                }
            }
        }
    }

    private fun getBufferMethod(member: StructMember, javaType: String) = if (member.nativeType.isPointer)
        "Address"
    else
        bufferMethodMap[javaType] ?: throw UnsupportedOperationException("Unsupported struct member java type: $className.${member.name} ($javaType)")

    override val skipNative get() = !nativeLayout && members.isNotEmpty()

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

        if (virtual) {
            // NOTE: Assumes a plain struct definition (no nested structs, no unions)
            println("${t}typedef struct $nativeName {")
            for (m in members) {
                print("$t$t${m.nativeType.name}")
                println(" ${m.name};")
            }
            println("$t} $nativeName;\n")
        }

        var index = 0
        if (members.isNotEmpty()) {
            index = generateNativeMembers(members)
            println()
        }
        println(
            """    buffer[$index] = alignof($nativeName);

    return sizeof($nativeName);
}

EXTERN_C_EXIT""")
    }

    private fun PrintWriter.generateNativeMembers(members: List<StructMember>, offset: Int = 0, prefix: String = ""): Int {
        var index = offset
        members.forEach {
            if (it.name === ANONYMOUS && it.isNestedStruct) {
                index = generateNativeMembers((it.nativeType as StructType).definition.members, index + 1, prefix) // recursion
            } else {
                println("${t}buffer[$index] = (jint)offsetof($nativeName, $prefix${it.name});")
                index++

                if (it.isNestedStruct) {
                    // Output nested structs
                    val structType = it.nativeType as StructType
                    if (structType.name === ANONYMOUS)
                        index = generateNativeMembers(structType.definition.members, index, prefix = "$prefix${it.name}.") // recursion
                }
            }
        }
        return index
    }

}

fun struct(
    module: Module,
    className: String,
    nativeSubPath: String = "",
    nativeName: String = className,
    virtual: Boolean = false,
    mutable: Boolean = true,
    extends: StructType? = null,
    nativeLayout: Boolean = false,
    init: (Struct.() -> Unit)? = null
): StructType {
    val struct = Struct(module, className, nativeSubPath, nativeName, false, virtual, mutable, extends?.definition, nativeLayout)
    if (init != null) {
        struct.init()
        Generator.register(struct)
    }
    return struct.nativeType
}

fun union(
    module: Module,
    className: String,
    nativeSubPath: String = "",
    nativeName: String = className,
    virtual: Boolean = false,
    mutable: Boolean = true,
    extends: StructType? = null,
    nativeLayout: Boolean = false,
    init: (Struct.() -> Unit)? = null
): StructType {
    val struct = Struct(module, className, nativeSubPath, nativeName, true, virtual, mutable, extends?.definition, nativeLayout)
    if (init != null) {
        struct.init()
        Generator.register(struct)
    }
    return struct.nativeType
}

// Hack that allows use of function modifiers that alias with struct modifiers, inside struct definitions
object GSCOPE

fun <T> global(block: GSCOPE.() -> T) = GSCOPE.block()

val GSCOPE.nullable get() = org.lwjgl.generator.nullable
fun GSCOPE.AutoSize(div: Int, reference: String, vararg dependent: String) = org.lwjgl.generator.AutoSize(div, reference, *dependent)
fun GSCOPE.AutoSize(reference: String, vararg dependent: String, factor: AutoSizeFactor? = null) =
    org.lwjgl.generator.AutoSize(reference, *dependent, factor = factor)
fun GSCOPE.AutoSizeDiv(expression: String, reference: String, vararg dependent: String) =
    org.lwjgl.generator.AutoSizeDiv(expression, reference, *dependent)
fun GSCOPE.AutoSizeMul(expression: String, reference: String, vararg dependent: String) =
    org.lwjgl.generator.AutoSizeMul(expression, reference, *dependent)
fun GSCOPE.AutoSizeShr(expression: String, reference: String, vararg dependent: String) =
    org.lwjgl.generator.AutoSizeShr(expression, reference, *dependent)
fun GSCOPE.AutoSizeShl(expression: String, reference: String, vararg dependent: String) =
    org.lwjgl.generator.AutoSizeShl(expression, reference, *dependent)