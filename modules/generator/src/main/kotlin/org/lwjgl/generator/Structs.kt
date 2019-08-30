/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import java.io.*

private const val STRUCT = "struct"

private val KEYWORDS = JAVA_KEYWORDS + setOf(
    // Object
    "equals", "getClass", "hashCode", "notify", "notifyAll", "toString", "wait",
    // Pointer
    "address",
    // AutoCloseable
    "close",
    // NativeResource
    "free",
    // Struct
    "create", "callocStack", "calloc", "isNull", "malloc", "mallocStack", "sizeof"
)

private val BUFFER_KEYWORDS = setOf(
    // Iterable
    "iterator", "forEach", "spliterator",
    // CustomBuffer
    "address0", "capacity", "clear", "compact", "duplicate", "flip", "hasRemaining", "limit", "mark", "position", "remaining", "reset", "rewind",
    "slice",
    // StructBuffer
    "apply", "get", "parallelStream", "put", "stream"
)

open class StructMember(
    val nativeType: DataType,
    val name: String,
    val documentation: String,
    val bits: Int
) : ModifierTarget<StructMemberModifier>() {

    override fun validate(modifier: StructMemberModifier) = modifier.validate(this)

    internal var getter: String? = null
    fun getter(expression: String) {
        this.getter = expression;
    }

    internal var setter: String? = null
    fun setter(expression: String) {
        this.setter = expression;
    }

    internal val offsetField
        get() = name.toUpperCase()

    internal fun offsetField(parentField: String): String {
        return if (parentField.isEmpty())
            offsetField
        else
            "${parentField}_$offsetField"
    }

    /** hidden if false, contributes to layout only */
    internal var public = true
    fun private(): StructMember {
        public = false
        return this
    }

    /** private + hidden from struct layout javadoc */
    internal var virtual = false
    fun virtual(): StructMember {
        virtual = true
        return private()
    }

    /** mutable if true, even if the parent struct is not mutable */
    internal var mutable = false
    fun mutable(): StructMember {
        mutable = true
        return this
    }

    internal var links: String = ""
    internal var linkMode: LinkMode = LinkMode.SINGLE

    fun links(links: String, linkMode: LinkMode = LinkMode.SINGLE) {
        this.links = links
        this.linkMode = linkMode
    }

    internal open fun copy() = StructMember(nativeType, name, documentation, bits)
}

open class StructMemberArray(
    val arrayType: CArrayType<*>,
    name: String,
    documentation: String,
    /** Number of pointer elements that must not be null. */
    val validSize: String
) : StructMember(arrayType.elementType, name, documentation, -1) {
    val size: String get() = arrayType.size
    val primitiveMapping get() = nativeType.let {
        if (it is PointerType<*>) PrimitiveMapping.POINTER else it.mapping as PrimitiveMapping
    }

    override fun copy() = StructMemberArray(arrayType, name, documentation, validSize)
}

private class StructMemberPadding(size: String, val condition: String?) : StructMemberArray(char[size], ANONYMOUS, "", size) {
    init {
        public = false
    }

    override fun copy() = StructMemberPadding((nativeType as CArrayType<*>).size, condition)
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
    /** if specified, this struct aliases it. */
    private val alias: Struct?,
    /** when true, the struct layout will be built using native code. */
    private val nativeLayout: Boolean,
    /** when true, a nested StructBuffer subclass will be generated as well. */
    private val generateBuffer: Boolean
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

    private var pack: String? = null
    fun pack(expression: String) {
        pack = expression
    }
    fun pack(alignment: Int) {
        pack = alignment.toString()
    }

    // TODO: add alignas support to non-struct members if necessary
    private var alignas: String? = null
    fun alignas(expression: String) {
        alignas = expression
    }
    fun alignas(alignment: Int) {
        alignas = alignment.toString()
    }

    private val customMethods = ArrayList<String>()

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
        mutableMembers.filter { !(it.has<AutoSizeMember> { !keepSetter(mutableMembers) } || it.has<UserDataMember>()) }
    }

    private fun hasMutableMembers(members: Sequence<StructMember> = publicMembers) = this.members.isNotEmpty() && (mutable || mutableMembers(members).any())

    operator fun get(name: String): StructMember = members.asSequence().first { it.name == name }

    fun StructMember.replace(old: StructMember): StructMember {
        members.remove(this)
        members[members.indexOf(old)] = this
        return this
    }

    infix fun StructType.copy(member: String) = add(definition[member].copy())
    private fun add(member: StructMember): StructMember {
        members.add(member)
        return member
    }

    // Plain struct member
    operator fun DataType.invoke(name: String, documentation: String) = add(StructMember(this, name, documentation, -1))

    // Bitfield struct member
    operator fun PrimitiveType.invoke(name: String, documentation: String, bits: Int) = add(StructMember(this, name, documentation, bits))

    // Converts a plain member to an array member
    operator fun StructMember.get(size: Int, validSize: Int = size) = this[size.toString(), validSize.toString()]
    operator fun StructMember.get(size: String, validSize: String = size): StructMemberArray {
        this@Struct.members.remove(this)

        val nativeType = if (isNestedStructDefinition) {
            val definition = (this.nativeType as StructType).definition

            val copy = Struct(
                this@Struct.module,
                this.name,
                this@Struct.nativeSubPath,
                ANONYMOUS,
                this@Struct.union,
                true,
                this@Struct.mutable,
                this@Struct.alias,
                this@Struct.nativeLayout,
                this@Struct.generateBuffer
            )

            copy.documentation = definition.documentation
            copy.customMethods.addAll(definition.customMethods)
            copy.members.addAll(definition.members)
            copy.usageInput = definition.usageInput
            copy.usageOutput = definition.usageOutput
            copy.usageResultPointer = definition.usageResultPointer
            copy.static = definition.static
            copy.alignas = definition.alignas
            copy.pack = definition.pack

            copy.nativeType
        } else
            this.nativeType

        return StructMemberArray(nativeType[size], name, documentation, validSize)
            .let {
                add(it)
                it
            }
    }
    // Converts an N-dimensional array to an (N+1)-dimensional array.
    operator fun StructMemberArray.get(size: Int, validSize: Int = size) = this[size.toString(), validSize.toString()]
    operator fun StructMemberArray.get(size: String, validSize: String): StructMemberArray {
        this@Struct.members.remove(this)
        return StructMemberArray(arrayType[size], name, documentation, "${this.validSize} * $validSize")
            .let {
                add(it)
                it
            }
    }

    fun padding(size: Int, condition: String? = null) = padding(size.toString(), condition)
    fun padding(size: String, condition: String? = null) = add(StructMemberPadding(size, condition))

    /** Anonymous nested member struct definition. */
    fun struct(
        mutable: Boolean = this.mutable,
        alias: StructType? = null,
        nativeLayout: Boolean = false,
        skipBuffer: Boolean = false,
        init: Struct.() -> Unit
    ): StructMember {
        val struct = Struct(module, ANONYMOUS, nativeSubPath, ANONYMOUS, false, true, mutable, alias?.definition, nativeLayout, !skipBuffer)
        struct.init()
        return StructType(struct).invoke(ANONYMOUS, "")
    }

    /** Anonymous nested member union definition. */
    fun union(
        mutable: Boolean = this.mutable,
        alias: StructType? = null,
        nativeLayout: Boolean = false,
        skipBuffer: Boolean = false,
        init: Struct.() -> Unit
    ): StructMember {
        val struct = Struct(module, ANONYMOUS, nativeSubPath, ANONYMOUS, true, true, mutable, alias?.definition, nativeLayout, !skipBuffer)
        struct.init()
        return StructType(struct).invoke(ANONYMOUS, "")
    }

    /** Named nested struct/union. */
    operator fun StructMember.invoke(name: String, documentation: String): StructMember {
        this@Struct.members.remove(this)
        return this.nativeType.invoke(name, documentation)
    }

    fun customMethod(method: String) {
        customMethods.add(method.trim())
    }

    private fun PrintWriter.printCustomMethods(static: Boolean) {
        customMethods
            .filter { it.startsWith("static {") == static }
            .forEach {
                println("\n$t$it")
            }
    }

    /** A pointer-to-struct member points to an array of structs, rather than a single struct. */
    private val StructMember.isStructBuffer
        get() = getReferenceMember<AutoSizeMember>(this.name) != null || this.has<Unsafe>()

    /** The nested struct's members are embedded in the parent struct. */
    private val StructMember.isNestedStruct
        get() = nativeType is StructType && this !is StructMemberArray

    /** The nested struct is not defined elsewhere, it's part of the parent struct's definition */
    private val StructMember.isNestedStructDefinition
        get() = isNestedStruct && (nativeType as StructType).name === ANONYMOUS

    private val StructMember.nestedMembers
        get() = (nativeType as StructType).definition.visibleMembers

    private val containsUnion: Boolean get() = union || members.any {
        it.isNestedStruct && (it.nativeType as StructType).let { type -> type.name === ANONYMOUS && type.definition.containsUnion }
    }

    private fun StructMember.field(parentMember: String) = if (parentMember.isEmpty())
        if (KEYWORDS.contains(name) || (generateBuffer && BUFFER_KEYWORDS.contains(name))) "$name\$" else name
    else
        "${parentMember}_$name"

    private fun StructMember.fieldName(parentMember: String) = if (parentMember.isEmpty())
        name
    else
        "$parentMember.$name"

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

    private fun printStructLayout(indentation: String = "", parent: String = ""): String {
        val memberIndentation = "$indentation    "
        return """$nativeNameQualified {
${members.asSequence()
        .filter { !it.virtual }
        .joinToString(";\n$memberIndentation", prefix = memberIndentation, postfix = ";") { member ->
            if (member.isNestedStructDefinition || (member is StructMemberArray && member.nativeType is StructType && member.nativeType.name === ANONYMOUS)) {
                val struct = (member.nativeType as StructType).definition
                "${struct.printStructLayout(memberIndentation, "$parent${struct.className}.")}${if (member.name === ANONYMOUS) "" else " ${member.name.let {
                    if (member is StructMemberArray)
                        "{@link $parent${struct.className} $it}${member.arrayType.def}"
                    else
                        it
                }}"}"
            } else {
                val anonymous = member.name === ANONYMOUS || (member.nativeType is FunctionType && member.nativeType.name.contains("(*)"))
                member.nativeType
                    .let {
                        when {
                            it is FunctionType && anonymous -> it.function.nativeType(member.name)
                            else                            -> it.name
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
                            elementType is FunctionType && anonymous                 -> it.replace(
                                "(*${member.name})",
                                "(*{@link ${elementType.javaMethodType} ${member.name}})"
                            )
                            elementType is StructType || elementType is FunctionType -> it.replace(
                                elementType.name, "{@link ${elementType.javaMethodType} ${elementType.name.let { name ->
                                    if (name.endsWith(" const")) {
                                        "${name.substring(0, name.length - 6)}} const"
                                    } else {
                                        "$name}"
                                    }
                                }}")
                            else                                                     -> it
                        }
                    }
                    .let { if (anonymous) it else "$it ${member.name}" }
                    .let {
                        if (member.bits != -1)
                            "$it : ${member.bits}"
                        else if (member is StructMemberArray)
                            "$it${member.arrayType.def}"
                        else
                            it
                    }
            }
        }}
$indentation}"""
    }

    private fun printMemberDocumentation(prefix: String = "", documentation: MutableList<String> = ArrayList()): List<String> {
        members.forEach {
            val size = if (it is StructMemberArray) "[${it.size}]" else ""
            val doc = if (it.documentation.isNotEmpty() || it.links.isNotEmpty()) {
                if (it.links.isEmpty())
                    it.documentation
                else
                    it.linkMode.appendLinks(
                        it.documentation,
                        if (!it.links.contains('+')) it.links else linksFromRegex(it.links)
                    )
            } else
                null

            if (it.isNestedStructDefinition) {
                val nestedStruct = (it.nativeType as StructType).definition

                val memberDoc = ArrayList<String>()
                nestedStruct.printMemberDocumentation(if (it.name === ANONYMOUS) prefix else "$prefix${it.name}.", memberDoc)

                val name = if (it.name === ANONYMOUS)
                    "${if (prefix.isEmpty()) "" else "{@code $prefix}"}<em>&lt;${if (nestedStruct.union) "union" else "struct"}&gt;$size</em>"
                else
                    "{@code $prefix${it.name}$size}"

                if (memberDoc.isNotEmpty()) {
                    documentation.add("$name${if (doc == null) "" else " &ndash; $doc"}\n\n${ul(*memberDoc.toTypedArray())}")
                } else if (doc != null) {
                    documentation.add("$name &ndash; $doc")
                }
            } else if (doc != null) {
                documentation.add("{@code $prefix${it.name}$size} &ndash; $doc")
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
                val bufferParam = members.firstOrNull { member -> member.name == reference }
                if (bufferParam == null)
                    it.error("Reference does not exist: AutoSize($reference)")
                else {
                    if (bufferParam !is StructMemberArray) {
                        if (bufferParam.nativeType !is PointerType<*>)
                            it.error("Reference must be a pointer type: AutoSize($reference)")

                        if (!bufferParam.nativeType.isPointerData)
                            it.error("Reference must not be a opaque pointer: AutoSize($reference)")
                    } else if (autoSize.optional || autoSize.atLeastOne)
                        it.error("Optional cannot be used with array references: AutoSize($reference)")

                    if (autoSize.atLeastOne && !bufferParam.has(nullable))
                        it.error("The \"atLeastOne\" option requires references to be nullable: AutoSize($reference)")
                }
            }
        }
    }

    override fun PrintWriter.generateJava() = generateJava(false, 1)
    private fun PrintWriter.generateJava(nested: Boolean, level: Int) {
        if (alias != null) {
            usageInput = usageInput or alias.usageInput
            usageOutput = usageOutput or alias.usageOutput
            usageResultPointer = usageResultPointer or alias.usageResultPointer
        }

        val mallocable = mutableMembers().any() || usageOutput || (usageInput && !usageResultPointer)
        validate(mallocable)

        val nativeLayout = !skipNative
        if (nativeLayout) {
            checkNotNull(module.library) {
                "${t}Missing module library for native layout of struct: ${module.packageKotlin}.$className"
            }
        } else if (preamble.hasNativeDirectives) {
            kotlin.io.println("${t}Unnecessary native directives in struct: ${module.packageKotlin}.$className")
        }

        if (!nested) {
            print(HEADER)
            println("package $packageName;\n")

            println("import javax.annotation.*;\n")

            println("import java.nio.*;\n")

            if (mallocable || members.any { m ->
                    m.nativeType.let {
                        (it.mapping === PointerMapping.DATA_POINTER && it is PointerType<*> && (it.elementType !is StructType || m is StructMemberArray)) ||
                        (it.mapping === PrimitiveMapping.POINTER && m is StructMemberArray && it !is StructType)
                    }
                })
                println("import org.lwjgl.*;")
            println("import org.lwjgl.system.*;\n")

            fun Struct.hasChecks(): Boolean = visibleMembers.any {
                (it is StructMemberArray && it.nativeType !is CharType) ||
                (
                (mutable || it.mutable) &&
                (
                it is StructMemberArray ||
                it.nativeType is CharSequenceType ||
                (it.nativeType is PointerType<*> && !it.has<Nullable>())
                )
                ) ||
                it.isNestedStructDefinition && (it.nativeType as StructType).definition.hasChecks()
            }

            if (Module.CHECKS && hasChecks())
                println("import static org.lwjgl.system.Checks.*;")
            println("import static org.lwjgl.system.MemoryUtil.*;")
            if (nativeLayout || mallocable)
                println("import static org.lwjgl.system.MemoryStack.*;")
        }

        println()
        preamble.printJava(this)

        printDocumentation()
        if (className != nativeName) {
            println("@NativeType(\"$nativeNameQualified\")")
        }
        print("${access.modifier}${if (nested) "static " else ""}class $className extends ")
        print(alias?.className ?: "Struct${if (mallocable) " implements NativeResource" else ""}")
        println(" {")

        if (alias == null) {
            print("""
    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;
"""
            )

            val visibleMembersExceptBitfields = visibleMembers.filter { it.bits == -1 }
            if (members.isNotEmpty() && (!nativeLayout || visibleMembersExceptBitfields.any())) {
                val memberCount = getMemberCount(members)

                // Member offset fields

                if (visibleMembersExceptBitfields.any()) {
                    print(
                        """
    /** The struct member offsets. */
    public static final int
"""
                    )
                    generateOffsetFields(visibleMembersExceptBitfields)
                    println(";")
                }

                print(
                    """
    static {"""
                )
                if (static != null)
                    print(
                        """
        $static
"""
                    )

                // Member offset initialization

                if (nativeLayout) {
                    print(
                        """
        ${module.library!!.expression(module)}

        try (MemoryStack stack = stackPush()) {
            IntBuffer offsets = stack.mallocInt(${memberCount + 1});
            SIZEOF = offsets(memAddress(offsets));

"""
                    )
                    generateOffsetInit(true, members, indentation = "$t$t$t")
                    println(
                        """
            ALIGNOF = offsets.get($memberCount);
        }"""
                    )
                } else {
                    print(
                        """
        Layout layout = """
                    )
                    generateLayout(this@Struct)
                    print(
                        """;

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

"""
                    )
                    generateOffsetInit(false, members)
                }

                println("$t}")
            } else if (nativeLayout) {
                print(
                    """
    static {"""
                )
                if (static != null)
                    print(
                        """
        $static
"""
                    )
                println(
                    """
        ${module.library!!.expression(module)}

        try (MemoryStack stack = stackPush()) {
            IntBuffer offsets = stack.mallocInt(1);
            SIZEOF = offsets(memAddress(offsets));
            ALIGNOF = offsets.get(0);
        }
    }"""
                )
            }

            if (nativeLayout)
                println(
                    """
    private static native int offsets(long buffer);"""
                )
        }

        printCustomMethods(static = true)

        print("""
    /**
     * Creates a {@code $className} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    ${access.modifier}$className(ByteBuffer container) {
        super(${if (alias == null) "memAddress(container), __checkContainer(container, SIZEOF)" else "container"});
    }
""")

        if (alias == null) {
            print("""
    @Override
    public int sizeof() { return SIZEOF; }
""")
        }

        var members = publicMembers
        if (members.any()) {
            if (alias == null) {
                println()
                generateGetters(AccessMode.INSTANCE, members)
            }

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
    /** Returns a new {@code $className} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static $className malloc() {
        return wrap($className.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code $className} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static $className calloc() {
        return wrap($className.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code $className} instance allocated with {@link BufferUtils}. */
    public static $className create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap($className.class, memAddress(container), container);
    }
""")
        }

        print("""
    /** Returns a new {@code $className} instance for the specified memory address. */
    public static $className create(long address) {
        return wrap($className.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static $className createSafe(long address) {
        return address == NULL ? null : wrap($className.class, address);
    }
""")
        if (generateBuffer) {
            if (mallocable) {
                print("""
    /**
     * Returns a new {@link $className.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param $BUFFER_CAPACITY_PARAM the buffer capacity
     */
    public static $className.Buffer malloc(int $BUFFER_CAPACITY_PARAM) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc($BUFFER_CAPACITY_PARAM, SIZEOF)), $BUFFER_CAPACITY_PARAM);
    }

    /**
     * Returns a new {@link $className.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param $BUFFER_CAPACITY_PARAM the buffer capacity
     */
    public static $className.Buffer calloc(int $BUFFER_CAPACITY_PARAM) {
        return wrap(Buffer.class, nmemCallocChecked($BUFFER_CAPACITY_PARAM, SIZEOF), $BUFFER_CAPACITY_PARAM);
    }

    /**
     * Returns a new {@link $className.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param $BUFFER_CAPACITY_PARAM the buffer capacity
     */
    public static $className.Buffer create(int $BUFFER_CAPACITY_PARAM) {
        ByteBuffer container = __create($BUFFER_CAPACITY_PARAM, SIZEOF);
        return wrap(Buffer.class, memAddress(container), $BUFFER_CAPACITY_PARAM, container);
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
        return wrap(Buffer.class, address, $BUFFER_CAPACITY_PARAM);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static $className.Buffer createSafe(long address, int $BUFFER_CAPACITY_PARAM) {
        return address == NULL ? null : wrap(Buffer.class, address, $BUFFER_CAPACITY_PARAM);
    }
""")
        }

        if (mallocable) {
            print("""
    // -----------------------------------

    /** Returns a new {@code $className} instance allocated on the thread-local {@link MemoryStack}. */
    public static $className mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code $className} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static $className callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code $className} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static $className mallocStack(MemoryStack stack) {
        return wrap($className.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code $className} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static $className callocStack(MemoryStack stack) {
        return wrap($className.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }
""")
            if (generateBuffer) {
                print("""
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
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, $BUFFER_CAPACITY_PARAM * SIZEOF), $BUFFER_CAPACITY_PARAM);
    }

    /**
     * Returns a new {@link $className.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param $BUFFER_CAPACITY_PARAM the buffer capacity
     */
    public static $className.Buffer callocStack(int $BUFFER_CAPACITY_PARAM, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, $BUFFER_CAPACITY_PARAM, SIZEOF), $BUFFER_CAPACITY_PARAM);
    }
""")
            }
        }

        if (alias == null) {
            print("""
    // -----------------------------------
""")

            members = visibleMembers
            if (members.any()) {
                println()
                generateStaticGetters(members)

                if (hasMutableMembers(visibleMembers)) {
                    println()
                    generateStaticSetters(mutableMembers(visibleMembers))

                    if (Module.CHECKS && validations.any()) {
                        println(
                            """
    /**
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
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }""")
                    }
                }
            }
        }

        printCustomMethods(static = false)

        if (generateBuffer) {
            println("\n$t// -----------------------------------")

            print("""
    /** An array of {@link $className} structs. */
    public static class Buffer extends """)

            print(if (alias == null)
                "StructBuffer<$className, Buffer>${if (mallocable) " implements NativeResource" else ""}"
            else
                "${alias.className}.Buffer"
            )

            print(""" {

        private static final $className ELEMENT_FACTORY = $className.create(-1L);

        /**
         * Creates a new {@code $className.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link $className#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */""")

            print(if (alias == null)
            """
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }"""
            else
            """
        public Buffer(ByteBuffer container) {
            super(container);
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
        protected $className getElementFactory() {
            return ELEMENT_FACTORY;
        }
""")

            members = publicMembers
            if (members.any()) {
                if (alias == null) {
                    println()
                    generateGetters(AccessMode.FLYWEIGHT, members)
                }

                if (hasMutableMembers()) {
                    println()
                    generateSetters(AccessMode.FLYWEIGHT, settableMembers)
                }
            }

            print("""
    }
""")
        }

        // Recursively output inner classes for array-of-anonymous-nested-struct members.
        this@Struct.members
            .filter { it is StructMemberArray && it.nativeType is StructType && it.nativeType.name === ANONYMOUS }
            .forEach { member ->
                (member.nativeType as StructType).definition.apply {
                    val writer = StringWriter(4 * 1024)
                    PrintWriter(writer).use {
                        it.generateJava(nested = true, level = level + 1)
                    }
                    println(writer.toString().replace("\n(?!$)".toRegex(), "\n    "))
                }
            }

        print("""
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
        var count = members.count { it.bits == -1 }
        for (member in members.asSequence().filter { it.isNestedStructDefinition })
            count += getMemberCount((member.nativeType as StructType).definition.members) // recursion
        return count
    }

    private fun PrintWriter.generateOffsetInit(
        nativeLayout: Boolean,
        members: List<StructMember>,
        indentation: String = "$t$t",
        parentField: String = "",
        offset: Int = 0
    ): Int {
        var index = offset
        members.forEach {
            if (it.name === ANONYMOUS && it.isNestedStruct) {
                index = generateOffsetInit(nativeLayout, (it.nativeType as StructType).definition.members, indentation, parentField, index + 1) // recursion
            } else if (it is StructMemberPadding) {
                index++
            } else if (it.bits == -1) {
                val field = it.offsetField(parentField)
                println("$indentation$field = ${if (nativeLayout) "offsets.get" else "layout.offsetof"}(${index++});")

                // Output nested fields
                if (it.isNestedStructDefinition)
                    index = generateOffsetInit(nativeLayout, (it.nativeType as StructType).definition.members, "$indentation$t", field, index) // recursion
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
        if (pack != null || alignas != null) {
            println("$indentation$t${pack ?: "DEFAULT_PACK_ALIGNMENT"}, ${alignas ?: "DEFAULT_ALIGN_AS"},")
        }
        struct.members
            .filter { it.bits == -1 }
            .forEachWithMore { it, more ->
                val field = it.offsetField(parentField)

                if (more)
                    println(",")
                if (it is StructMemberPadding) {
                    print("$indentation${t}__padding(${it.size}, ${it.condition ?: "true"})")
                } else if (it.isNestedStructDefinition) {
                    print("$indentation$t")
                    generateLayout((it.nativeType as StructType).definition, "$indentation$t", field)
                } else {
                    val size: String
                    val alignment: String

                    if (it.nativeType is StructType) {
                        size = "${it.nativeType.javaMethodType}.SIZEOF"
                        alignment = "${it.nativeType.javaMethodType}.ALIGNOF${if (it.nativeType.definition.alignas != null) ", true" else ""}"
                    } else {
                        size = if (it.nativeType.isPointer)
                            "POINTER_SIZE"
                        else
                            (it.nativeType.mapping as PrimitiveMapping).bytesExpression
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
    /** $javaDoc */""")
        if (alias != null) {
            print("""
    @Override""")
        }
        print("""
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

                print(
                    "$t$t${it.nullable(
                        if (it is StructMemberArray) {
                            if (it.nativeType is CharType) {
                                "ByteBuffer"
                            } else if (it.nativeType is StructType)
                                "${it.nativeType.javaMethodType}.Buffer"
                            else
                                it.primitiveMapping.toPointer.javaMethodName
                        } else if (it.nativeType is PointerType<*> && it.nativeType.elementType is StructType) {
                            val structType = it.nativeType.javaMethodType
                            if (it.isStructBuffer)
                                "$structType.Buffer"
                            else
                                structType
                        } else
                            it.nativeType.javaMethodType,
                        if (it is StructMemberArray) it.arrayType else it.nativeType
                    )} ${it.field(parentMember)}"
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
        val capacity = members.firstOrNull {
            it.has<AutoSizeMember> { atLeastOne || (dependent.isEmpty() && reference == m.name) }
        }
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
            if (it.has<UserDataMember>()) {
                return@forEach
            }

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
                    if (it.nativeType is WrappedPointerType) {
                        if (it.public)
                            println("$t/** Unsafe version of {@link #$setter(${it.nativeType.javaMethodType}) $setter}. */")
                        print("${t}public static void n$setter(long $STRUCT, ${it.nullable(it.nativeType.javaMethodType)} value) {")

                        val userDataMember = if (it.nativeType is FunctionType) getReferenceMember<UserDataMember>(it.name) else null
                        if (userDataMember != null) {
                            print("\n$t${t}memPutAddress($STRUCT + $field, ${(it.nativeType as FunctionType).function.className}.DELEGATE);")
                            print("\n$t${t}memPutAddress($STRUCT + ${getFieldOffset(userDataMember, parentStruct, parentField)}, ${it.addressValue});")
                            println("\n$t}")
                        } else {
                            println(" memPutAddress($STRUCT + $field, ${it.addressValue}); }")
                        }
                    } else {
                        val javaType = it.nativeType.nativeMethodType

                        if (it.public)
                            println(
                                if (it.has<AutoSizeMember>())
                                    "$t/** Sets the specified value to the {@code ${it.name}} field of the specified {@code struct}. */"
                                else
                                    "$t/** Unsafe version of {@link #$setter(${if (it.nativeType.mapping == PrimitiveMapping.BOOLEAN4) "boolean" else javaType}) $setter}. */"
                            )
                        if (it.setter != null) {
                            println("${t}public static void n$setter(long $STRUCT, $javaType value) { ${it.setter}; }")
                        } else if (it.bits != -1) {
                            println("${t}public static native void n$setter(long $STRUCT, $javaType value);")
                        } else {
                            print("${t}public static void n$setter(long $STRUCT, $javaType value) { ${getBufferMethod("put", it, javaType)}$STRUCT + $field, ")
                            print(
                                when {
                                    javaType == "boolean"
                                         -> "value ? (byte)1 : (byte)0"
                                    it.nativeType.mapping === PointerMapping.OPAQUE_POINTER
                                         -> it.pointerValue
                                    else -> "value"
                                }
                            )
                            println("); }")
                        }
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
                            println("${t}public static void n$setter(long $STRUCT, int index, ${it.nullable(structTypeIndexed)} value) {")
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
                    } else if (it.nativeType is CharType) {
                        val mapping = it.nativeType.mapping as PrimitiveMapping
                        val byteSize = if (mapping.bytes == 1) it.size else "${it.size} * ${mapping.bytes}"
                        val nullTerminated = getReferenceMember<AutoSizeMember>(it.name) == null || it.has(NullTerminatedMember)

                        if (it.public)
                            println("$t/** Unsafe version of {@link #$setter(ByteBuffer) $setter}. */")
                        println("${t}public static void n$setter(long $STRUCT, ByteBuffer value) {")
                        if (Module.CHECKS) {
                            println("$t${t}if (CHECKS) {")
                            if (nullTerminated) {
                                println("$t$t${t}checkNT${mapping.bytes}(value);")
                            }
                            println("$t$t${t}checkGT(value, $byteSize);")
                            println("$t$t}")
                        }
                        println("$t${t}memCopy(memAddress(value), $STRUCT + $field, value.remaining());")
                        setRemaining(it, if (nullTerminated) mapping.bytes else 0, prefix = "$t$t", suffix = "\n")
                        println("$t}")
                    } else {
                        val mapping = it.primitiveMapping
                        val bufferType = mapping.toPointer.javaMethodName

                        if (it.public)
                            println("$t/** Unsafe version of {@link #$setter($bufferType) $setter}. */")
                        println("${t}public static void n$setter(long $STRUCT, $bufferType value) {")
                        if (Module.CHECKS)
                            println("$t${t}if (CHECKS) { checkGT(value, ${it.size}); }")
                        println("$t${t}memCopy(memAddress(value), $STRUCT + $field, value.remaining() * ${mapping.bytesExpression});")
                        setRemaining(it, prefix = "$t$t", suffix = "\n")
                        println("$t}")

                        val javaType = it.nativeType.nativeMethodType

                        if (it.public)
                            println("$t/** Unsafe version of {@link #$setter(int, $javaType) $setter}. */")
                        println("${t}public static void n$setter(long $STRUCT, int index, $javaType value) {")
                        println("$t$t${getBufferMethod("put", it, javaType)}$STRUCT + $field + check(index, ${it.size}) * ${mapping.bytesExpression}, value);")
                        println("$t}")
                    }
                } else if (it.nativeType is CharSequenceType) {
                    val mapping = it.nativeType.charMapping
                    val nullTerminated = getReferenceMember<AutoSizeMember>(it.name) == null || it.has(NullTerminatedMember)

                    if (it.public)
                        println("$t/** Unsafe version of {@link #$setter(ByteBuffer) $setter}. */")
                    println("${t}public static void n$setter(long $STRUCT, ${it.nullable("ByteBuffer")} value) {")
                    if (Module.CHECKS && nullTerminated)
                        println("$t${t}if (CHECKS) { checkNT${mapping.bytes}${if (it.isNullable) "Safe" else ""}(value); }")
                    println("$t${t}memPutAddress($STRUCT + $field, ${it.memAddressValue});")
                    setRemaining(it, prefix = "$t$t", suffix = "\n")
                    println("$t}")
                } else if (it.nativeType.isPointerData) {
                    val paramType = it.nativeType.javaMethodType
                    if (it.nativeType.dereference is StructType) {
                        if (it.isStructBuffer) {
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

    private fun StructMember.annotate(
        type: String,
        nativeType: DataType = if (this is StructMemberArray) this.arrayType else this.nativeType
    ) = nullable(nativeType.annotate(type), nativeType)

    private fun StructMember.nullable(type: String, nativeType: DataType = this.nativeType) =
        if (nativeType.isReference && isNullable && nativeType !is CArrayType<*>) {
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
            if (it.has<UserDataMember>()) {
                return@forEach
            }

            val setter = it.field(parentSetter)
            val member = it.fieldName(parentMember)

            val indent = accessMode.indent
            val overrides = alias != null /*
                TODO: forward declarations have no members (see VkPhysicalDeviceBufferDeviceAddressFeaturesEXT)
                && alias.members.any { parentMember -> parentMember.name == it.name }
            */

            val returnType = if (accessMode === AccessMode.INSTANCE)
                className
            else
                "$className.Buffer"

            if (it.isNestedStruct) {
                val nestedStruct = (it.nativeType as StructType).definition
                val structType = nestedStruct.className
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
                    if (nestedStruct.mutable) {
                        println("$indent/** Passes the {@code $member} field to the specified {@link java.util.function.Consumer Consumer}. */")
                        println("${indent}public $className${if (accessMode === AccessMode.INSTANCE) "" else ".Buffer"} $setter(java.util.function.Consumer<$structType> consumer) { consumer.accept($setter()); return this; }")
                    }
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
                        val nestedStruct: Struct
                        val structType = it.nativeType.javaMethodType
                        val retType = "$structType${if (getReferenceMember<AutoSizeIndirect>(it.name) == null) "" else ".Buffer"}"
                        if (it.nativeType is PointerType<*>) {
                            nestedStruct = (it.nativeType.dereference as StructType).definition

                            println("$indent/** Copies the specified {@link PointerBuffer} to the {@code $member} field. */")
                            if (overrides) println("$indent@Override")
                            println("${indent}public $returnType $setter(${it.annotate("PointerBuffer")} value) { $n$setter($ADDRESS, value); return this; }")
                            println("$indent/** Copies the address of the specified {@link $structType} at the specified index of the {@code $member} field. */")
                        } else {
                            nestedStruct = (it.nativeType as StructType).definition

                            println("$indent/** Copies the specified {@link $structType.Buffer} to the {@code $member} field. */")
                            if (overrides) println("$indent@Override")
                            println("${indent}public $returnType $setter(${it.annotate("$structType.Buffer")} value) { $n$setter($ADDRESS, value); return this; }")
                            println("$indent/** Copies the specified {@link $structType} at the specified index of the {@code $member} field. */")
                        }
                        if (overrides) println("$indent@Override")
                        println("${indent}public $returnType $setter(int index, ${it.annotate(retType, it.nativeType)} value) { $n$setter($ADDRESS, index, value); return this; }")

                        if (nestedStruct.mutable) {
                            if (it.nativeType !is PointerType<*>) {
                                println("$indent/** Passes the {@code $member} field to the specified {@link java.util.function.Consumer Consumer}. */")
                                println("${indent}public $className${if (accessMode === AccessMode.INSTANCE) "" else ".Buffer"} $setter(java.util.function.Consumer<$structType.Buffer> consumer) { consumer.accept($setter()); return this; }")
                            }
                            println("$indent/** Passes the element at {@code index} of the {@code $member} field to the specified {@link java.util.function.Consumer Consumer}. */")
                            println("${indent}public $className${if (accessMode === AccessMode.INSTANCE) "" else ".Buffer"} $setter(int index, java.util.function.Consumer<$retType> consumer) { consumer.accept($setter(index)); return this; }")
                        }
                    } else if (it.nativeType is CharType) {
                        println("$indent/** Copies the specified encoded string to the {@code $member} field. */")
                        if (overrides) println("$indent@Override")
                        println("${indent}public $returnType $setter(${it.annotate("ByteBuffer")} value) { $n$setter($ADDRESS, value); return this; }")
                    } else {
                        val bufferType = it.primitiveMapping.toPointer.javaMethodName
                        println("$indent/** Copies the specified {@link $bufferType} to the {@code $member} field. */")
                        if (overrides) println("$indent@Override")
                        println("${indent}public $returnType $setter(${it.annotate(bufferType)} value) { $n$setter($ADDRESS, value); return this; }")
                        println("$indent/** Sets the specified value at the specified index of the {@code $member} field. */")
                        if (overrides) println("$indent@Override")
                        println("${indent}public $returnType $setter(int index, ${it.annotate(it.nativeType.javaMethodType, it.nativeType)} value) { $n$setter($ADDRESS, index, value); return this; }")
                    }
                } else if (it.nativeType is CharSequenceType) {
                    println("$indent/** Sets the address of the specified encoded string to the {@code $member} field. */")
                    if (overrides) println("$indent@Override")
                    println("${indent}public $returnType $setter(${it.annotate("ByteBuffer")} value) { $n$setter($ADDRESS, value); return this; }")
                } else if (it.nativeType.isPointerData) {
                    val pointerType = it.nativeType.javaMethodType
                    if ((it.nativeType as PointerType<*>).elementType is StructType && it.isStructBuffer) {
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
            if (it.has<UserDataMember>()) {
                return@forEach
            }

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
                    if (it.nativeType is FunctionType) {
                        val callbackField = getReferenceMember<UserDataMember>(it.name).let { userDataMember ->
                            if (userDataMember == null)
                                field
                            else
                                getFieldOffset(userDataMember, parentStruct, parentField)
                        }
                        println("$t${it.nullable("public")} static ${it.nativeType.className} n$getter(long $STRUCT) { return ${it.construct(it.nativeType.className)}(memGetAddress($STRUCT + $callbackField)); }")
                    } else if (it.getter != null) {
                        println("${t}public static ${it.nativeType.nativeMethodType} n$getter(long $STRUCT) { return ${it.getter}; }")
                    } else if (it.bits != -1) {
                        println("${t}public static native ${it.nativeType.nativeMethodType} n$getter(long $STRUCT);")
                    } else {
                        val javaType = it.nativeType.nativeMethodType

                        print("${t}public static $javaType n$getter(long $STRUCT) { return ${getBufferMethod("get", it, javaType)}$STRUCT + $field)")
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
                            println("${t}public static PointerBuffer n$getter(long $STRUCT) { return ${it.mem("PointerBuffer")}($STRUCT + $field, $size); }")
                            if (it.public)
                                println("$t/** Unsafe version of {@link #$getter(int) $getter}. */")
                            println("$t${it.nullable("public")} static $nestedStruct${if (autoSizeIndirect == null) "" else ".Buffer"} n$getter(long $STRUCT, int index) {")
                            println("$t${t}return ${it.construct(nestedStruct)}(memGetAddress($STRUCT + $field + check(index, $size) * POINTER_SIZE)${
                                if (autoSizeIndirect == null) "" else ", n${autoSizeIndirect.name}($STRUCT)"
                            });")
                            println("$t}")
                        } else {
                            if (it.public)
                                println("$t/** Unsafe version of {@link #$getter}. */")
                            println("${t}public static $nestedStruct.Buffer n$getter(long $STRUCT) { return ${it.construct(nestedStruct)}($STRUCT + $field, $size); }")
                            if (it.public)
                                println("$t/** Unsafe version of {@link #$getter(int) $getter}. */")
                            println("$t${it.nullable("public")} static $nestedStruct n$getter(long $STRUCT, int index) {")
                            println("$t${t}return ${it.construct(nestedStruct)}($STRUCT + $field + check(index, $size) * $nestedStruct.SIZEOF);")
                            println("$t}")
                        }
                    } else if (it.nativeType is CharType) {
                        val mapping = it.nativeType.mapping
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
                        println("${t}public static $bufferType n$getter(long $STRUCT) { return ${it.mem(bufferType)}($STRUCT + $field, ${getReferenceMember<AutoSizeMember>(it.name)?.autoSize ?: it.size}); }")

                        val javaType = it.nativeType.nativeMethodType

                        if (it.public)
                            println("$t/** Unsafe version of {@link #$getter(int) $getter}. */")
                        println("${t}public static $javaType n$getter(long $STRUCT, int index) {")
                        print("$t${t}return ${getBufferMethod("get", it, javaType)}$STRUCT + $field + check(index, ${it.size}) * ${mapping.bytesExpression})")
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
                        println(if (it.isStructBuffer) {
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

    private fun PrintWriter.generateGetterAnnotations(indent: String, member: StructMember, type: String, nativeType: NativeType = member.nativeType) {
        if (nativeType.isReference && member.isNullable) {
            println("$indent@Nullable")
        }
        nativeType.annotation(type).let {
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
            if (it.has<UserDataMember>()) {
                return@forEach
            }

            val getter = it.field(parentGetter)
            val member = it.fieldName(parentMember)

            val indent = accessMode.indent

            if (it.isNestedStruct) {
                val structType = it.nativeType.javaMethodType
                if (structType === ANONYMOUS)
                    generateGetters(
                        accessMode,
                        it.nestedMembers,
                        if (it.name === ANONYMOUS) parentGetter else getter,
                        if (it.name === ANONYMOUS) parentMember else member
                    )
                else {
                    println("$indent/** Returns a {@link $structType} view of the {@code $member} field. */")
                    generateGetterAnnotations(indent, it, structType)
                    println("${indent}public $structType $getter() { return $n$getter($ADDRESS); }")
                }
            } else {
                // Getter

                if (it !is StructMemberArray && !it.nativeType.isPointerData) {
                    val returnType = when (it.nativeType) {
                        is FunctionType       -> it.nativeType.className
                        is WrappedPointerType -> "long"
                        else                  -> it.nativeType.javaMethodType
                    }
                    println("$indent/** Returns the value of the {@code $member} field. */")
                    generateGetterAnnotations(indent, it, returnType)
                    println("${indent}public $returnType $getter() { return $n$getter($ADDRESS)${if (it.nativeType.mapping === PrimitiveMapping.BOOLEAN4) " != 0" else ""}; }")
                }

                // Alternative getters

                if (it is StructMemberArray) {
                    if (it.nativeType.dereference is StructType) {
                        val structType = it.nativeType.javaMethodType
                        if (it.nativeType is PointerType<*>) {
                            println("$indent/** Returns a {@link PointerBuffer} view of the {@code $member} field. */")
                            generateGetterAnnotations(indent, it, "PointerBuffer", it.arrayType)
                            println("${indent}public PointerBuffer $getter() { return $n$getter($ADDRESS); }")

                            val retType = "$structType${if (getReferenceMember<AutoSizeIndirect>(it.name) == null) "" else ".Buffer"}"
                            println("$indent/** Returns a {@link $structType} view of the pointer at the specified index of the {@code $member} field. */")
                            generateGetterAnnotations(indent, it, retType)
                            println("${indent}public $retType $getter(int index) { return $n$getter($ADDRESS, index); }")
                        } else {
                            println("$indent/** Returns a {@link $structType}.Buffer view of the {@code $member} field. */")
                            generateGetterAnnotations(indent, it, "$structType.Buffer", it.arrayType)
                            println("${indent}public $structType.Buffer $getter() { return $n$getter($ADDRESS); }")
                            println("$indent/** Returns a {@link $structType} view of the struct at the specified index of the {@code $member} field. */")
                            generateGetterAnnotations(indent, it, structType)
                            println("${indent}public $structType $getter(int index) { return $n$getter($ADDRESS, index); }")
                        }
                    } else if (it.nativeType is CharType) {
                        println("$indent/** Returns a {@link ByteBuffer} view of the {@code $member} field. */")
                        generateGetterAnnotations(indent, it, "ByteBuffer", it.arrayType)
                        println("${indent}public ByteBuffer $getter() { return $n$getter($ADDRESS); }")
                        println("$indent/** Decodes the null-terminated string stored in the {@code $member} field. */")
                        generateGetterAnnotations(indent, it, "String", it.arrayType)
                        println("${indent}public String ${getter}String() { return $n${getter}String($ADDRESS); }")
                    } else {
                        val bufferType = it.primitiveMapping.toPointer.javaMethodName
                        println("$indent/** Returns a {@link $bufferType} view of the {@code $member} field. */")
                        generateGetterAnnotations(indent, it, bufferType, it.arrayType)
                        println("${indent}public $bufferType $getter() { return $n$getter($ADDRESS); }")
                        println("$indent/** Returns the value at the specified index of the {@code $member} field. */")
                        generateGetterAnnotations(indent, it, it.nativeType.nativeMethodType)
                        println("${indent}public ${it.nativeType.nativeMethodType} $getter(int index) { return $n$getter($ADDRESS, index); }")
                    }
                } else if (it.nativeType is CharSequenceType) {
                    println("$indent/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code $member} field. */")
                    generateGetterAnnotations(indent, it, "ByteBuffer")
                    println("${indent}public ByteBuffer $getter() { return $n$getter($ADDRESS); }")
                    println("$indent/** Decodes the null-terminated string pointed to by the {@code $member} field. */")
                    generateGetterAnnotations(indent, it, "String")
                    println("${indent}public String ${getter}String() { return $n${getter}String($ADDRESS); }")
                } else if (it.nativeType.isPointerData) {
                    val returnType = it.nativeType.javaMethodType
                    if (it.nativeType.dereference is StructType) {
                        if (it.isStructBuffer) {
                            if (getReferenceMember<AutoSizeMember>(it.name) == null) {
                                println("""$indent/**
$indent * Returns a {@link $returnType.Buffer} view of the struct array pointed to by the {@code $member} field.
$indent *
$indent * @param $BUFFER_CAPACITY_PARAM the number of elements in the returned buffer
$indent */""")
                                generateGetterAnnotations(indent, it, "$returnType.Buffer")
                                println("${indent}public $returnType.Buffer $getter(int $BUFFER_CAPACITY_PARAM) { return $n$getter($ADDRESS, $BUFFER_CAPACITY_PARAM); }")
                            } else {
                                println("$indent/** Returns a {@link $returnType.Buffer} view of the struct array pointed to by the {@code $member} field. */")
                                generateGetterAnnotations(indent, it, "$returnType.Buffer")
                                println("${indent}public $returnType.Buffer $getter() { return $n$getter($ADDRESS); }")
                            }
                        } else {
                            println("$indent/** Returns a {@link $returnType} view of the struct pointed to by the {@code $member} field. */")
                            generateGetterAnnotations(indent, it, returnType)
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
                            generateGetterAnnotations(indent, it, returnType)
                            println("${indent}public $returnType $getter(int $BUFFER_CAPACITY_PARAM) { return $n$getter($ADDRESS, $BUFFER_CAPACITY_PARAM); }")
                        } else {
                            println("$indent/** Returns a {@link $returnType} view of the data pointed to by the {@code $member} field. */")
                            generateGetterAnnotations(indent, it, returnType)
                            println("${indent}public $returnType $getter() { return $n$getter($ADDRESS); }")
                        }
                    }
                }
            }
        }
    }

    private fun getBufferMethod(type: String, member: StructMember, javaType: String) = if (member.nativeType.isPointer)
        "mem${type.upperCaseFirst}Address("
    else if (member.nativeType.mapping === PrimitiveMapping.CLONG)
        "mem${type.upperCaseFirst}CLong("
    else
        "UNSAFE.$type${
        bufferMethodMap[javaType] ?: throw UnsupportedOperationException("Unsupported struct member java type: $className.${member.name} ($javaType)")
        }(null, "

    override val skipNative get() = !nativeLayout && members.isNotEmpty() && members.none { it.bits != -1 && it.getter == null }

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
EXTERN_C_ENTER

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
            if (index != 0) {
                println()
            }
        }
        print(
            """    buffer[$index] = alignof($nativeName);

    return sizeof($nativeName);
}""")
        generateNativeGetters(members)
        generateNativeSetters(mutableMembers())
        println("""

EXTERN_C_EXIT""")
    }

    private fun PrintWriter.generateNativeMembers(members: List<StructMember>, offset: Int = 0, prefix: String = ""): Int {
        var index = offset
        members.forEach {
            if (it.name === ANONYMOUS && it.isNestedStruct) {
                index = generateNativeMembers((it.nativeType as StructType).definition.members, index + 1, prefix) // recursion
            } else if (it is StructMemberPadding) {
                index++
            } else if (it.bits == -1) {
                println("${t}buffer[$index] = (jint)offsetof($nativeName, $prefix${if (it.has<NativeName>()) it.get<NativeName>().nativeName else it.name});")
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

    private fun PrintWriter.generateNativeGetters(members: List<StructMember>, prefix: String = "") {
        members.forEach {
            if (it.name === ANONYMOUS && it.isNestedStruct) {
                generateNativeGetters((it.nativeType as StructType).definition.members, prefix) // recursion
            } else if (it.isNestedStruct) {
                // Output nested structs
                val structType = it.nativeType as StructType
                if (structType.name === ANONYMOUS)
                    generateNativeGetters(structType.definition.members, "$prefix${it.name}.") // recursion
            } else if (it.bits != -1 && it.getter == null) {
                val signature = "${nativeFileNameJNI}_n${"${prefix.replace('.', '_')}${it.name}".asJNIName}__J"
                print("""

JNIEXPORT ${it.nativeType.jniFunctionType} JNICALL Java_$signature(JNIEnv *$JNIENV, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS($JNIENV, clazz)
    $nativeName *buffer = ($nativeName *)(intptr_t)bufferAddress;
    return (${it.nativeType.jniFunctionType})buffer->$prefix${it.name};
}""")
            }
        }
    }

    private fun PrintWriter.generateNativeSetters(members: Sequence<StructMember>, prefix: String = "") {
        members.forEach {
            if (it.name === ANONYMOUS && it.isNestedStruct) {
                generateNativeSetters((it.nativeType as StructType).definition.mutableMembers(), prefix) // recursion
            } else if (it.isNestedStruct) {
                // Output nested structs
                val structType = it.nativeType as StructType
                if (structType.name === ANONYMOUS)
                    generateNativeSetters(structType.definition.mutableMembers(), "$prefix${it.name}.") // recursion
            } else if (it.bits != -1 && it.setter == null) {
                val signature = "${nativeFileNameJNI}_n${"${prefix.replace('.', '_')}${it.name}".asJNIName}__J${it.nativeType.jniSignatureStrict}"
                print("""

JNIEXPORT void JNICALL Java_$signature(JNIEnv *$JNIENV, jclass clazz, jlong bufferAddress, ${it.nativeType.jniFunctionType} value) {
    UNUSED_PARAMS($JNIENV, clazz)
    $nativeName *buffer = ($nativeName *)(intptr_t)bufferAddress;
    buffer->$prefix${it.name} = (${it.nativeType.name})value;
}""")
            }
        }
    }

    fun AutoSize(reference: String, vararg dependent: String, optional: Boolean = false, atLeastOne: Boolean = false) =
        AutoSizeMember(reference, *dependent, optional = optional, atLeastOne = atLeastOne)

    fun AutoSize(div: Int, reference: String, vararg dependent: String, optional: Boolean = false, atLeastOne: Boolean = false) =
        when {
            div < 1                    -> throw IllegalArgumentException()
            div == 1                   -> AutoSizeMember(reference, *dependent, optional = optional, atLeastOne = atLeastOne)
            Integer.bitCount(div) == 1 -> AutoSizeShr(Integer.numberOfTrailingZeros(div).toString(), reference, *dependent, optional = optional, atLeastOne = atLeastOne)
            else                       -> AutoSizeDiv(div.toString(), reference, *dependent, optional = optional, atLeastOne = atLeastOne)
        }

    fun AutoSizeDiv(expression: String, reference: String, vararg dependent: String, optional: Boolean = false, atLeastOne: Boolean = false) =
        AutoSizeMember(reference, *dependent, factor = AutoSizeFactor.div(expression), optional = optional, atLeastOne = atLeastOne)

    fun AutoSizeMul(expression: String, reference: String, vararg dependent: String, optional: Boolean = false, atLeastOne: Boolean = false) =
        AutoSizeMember(reference, *dependent, factor = AutoSizeFactor.mul(expression), optional = optional, atLeastOne = atLeastOne)

    fun AutoSizeShr(expression: String, reference: String, vararg dependent: String, optional: Boolean = false, atLeastOne: Boolean = false) =
        AutoSizeMember(reference, *dependent, factor = AutoSizeFactor.shr(expression), optional = optional, atLeastOne = atLeastOne)

    fun AutoSizeShl(expression: String, reference: String, vararg dependent: String, optional: Boolean = false, atLeastOne: Boolean = false) =
        AutoSizeMember(reference, *dependent, factor = AutoSizeFactor.shl(expression), optional = optional, atLeastOne = atLeastOne)
}

fun struct(
    module: Module,
    className: String,
    nativeSubPath: String = "",
    nativeName: String = className,
    virtual: Boolean = false,
    mutable: Boolean = true,
    alias: StructType? = null,
    nativeLayout: Boolean = false,
    skipBuffer: Boolean = false,
    init: (Struct.() -> Unit)? = null
): StructType {
    val struct = Struct(module, className, nativeSubPath, nativeName, false, virtual, mutable, alias?.definition, nativeLayout, !skipBuffer)
    if (init != null) {
        struct.init()
    }
    if (init != null || nativeLayout) {
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
    alias: StructType? = null,
    nativeLayout: Boolean = false,
    skipBuffer: Boolean = false,
    init: (Struct.() -> Unit)? = null
): StructType {
    val struct = Struct(module, className, nativeSubPath, nativeName, true, virtual, mutable, alias?.definition, nativeLayout, !skipBuffer)
    if (init != null) {
        struct.init()
        Generator.register(struct)
    }
    return struct.nativeType
}