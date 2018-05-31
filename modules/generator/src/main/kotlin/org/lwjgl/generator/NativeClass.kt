/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import java.io.*
import java.lang.Math.*
import java.nio.file.*

const val EXT_FLAG = ""

enum class CallingConvention(val method: String) {
    DEFAULT("invoke"),
    STDCALL("call") // __stdcall on Windows, default on other systems
}

enum class APICapabilities {
    NONE,
    JNI_CAPABILITIES,
    JAVA_CAPABILITIES,
    PARAM_CAPABILITIES
}

/**
 * The Generator can be customized with binding-specific overrides using this class. This class must implemented for bindings that are loaded dynamically. It
 * is not necessary for libraries that are static compiled/linked into the LWJGL natives.
 */
abstract class APIBinding(
    module: Module,
    className: String,
    val apiCapabilities: APICapabilities = APICapabilities.NONE
) : GeneratorTarget(module, className) {

    init {
        javaImport(
            "org.lwjgl.system.*",
            "java.util.Set"
        )
    }

    private val _classes: MutableList<NativeClass> = ArrayList()

    fun getClasses(corePrefix: String): List<NativeClass> {
        val classes = ArrayList(_classes)
        classes.sortWith(Comparator { o1, o2 ->
            // Core functionality first, extensions after
            val isCore1 = o1.templateName.startsWith(corePrefix)
            val isCore2 = o2.templateName.startsWith(corePrefix)

            if (isCore1 xor isCore2)
                (if (isCore1) -1 else 1)
            else
                o1.templateName.compareTo(o2.templateName, ignoreCase = true)
        })
        return classes
    }

    protected fun List<NativeClass>.getFunctionPointers() = this.asSequence()
        .filter { it.hasNativeFunctions }
        .flatMap { it.functions.asSequence() }
        .filter { !it.has<Reuse>() }
        .toList()

    fun addClass(clazz: NativeClass) {
        _classes.add(clazz)
    }

    override fun getLastModified(root: String): Long = max(
        super.getLastModified(root),
        Paths.get(root, "templates").lastModified()
    )

    abstract fun generateFunctionAddress(writer: PrintWriter, function: Func)

    abstract fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass)

    // OVERRIDES

    open fun getFunctionOrdinal(function: Func): Int = 0

    /** Can be overridden to generate binding-specific alternative methods. */
    open fun generateAlternativeMethods(
        writer: PrintWriter,
        function: Func,
        transforms: MutableMap<QualifiedType, Transform>
    ) = Unit

    /** Can be overridden to generate binding-specific javadoc. If this function returns false, the default javadoc will be generated. */
    open fun printCustomJavadoc(writer: PrintWriter, function: Func, documentation: String) = false

    /** Can be overridden to implement a custom condition for checking the function address. */
    open fun shouldCheckFunctionAddress(function: Func) = apiCapabilities.ordinal > 1

    /** Can be overridden to add custom parameter checks. */
    open fun addParameterChecks(
        checks: MutableList<String>,
        mode: GenerationMode,
        parameter: Parameter,
        hasTransform: Parameter.(FunctionTransform<Parameter>) -> Boolean
    ) = Unit

}

/** An APIBinding without an associated capabilities class.  */
abstract class SimpleBinding(
    module: Module,
    private val libraryExpression: String
) : APIBinding(module, "*") { // TODO
    override fun PrintWriter.generateJava() = Unit
    override fun generateFunctionAddress(writer: PrintWriter, function: Func) {
        writer.println("$t${t}long ${if (function has Address) RESULT else FUNCTION_ADDRESS} = Functions.${function.simpleName};")
    }

    protected fun PrintWriter.generateFunctionsClass(nativeClass: NativeClass, javadoc: String) {
        val bindingFunctions = nativeClass.functions.filter { !it.hasExplicitFunctionAddress && !it.has<Macro>() }
        if (bindingFunctions.none())
            return

        print(javadoc)

        val alignment = bindingFunctions.map { it.simpleName.length }.max()!!

        println("""
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ${bindingFunctions.joinToString(separator = ",\n$t$t$t", postfix = ";") {
            "${it.simpleName}${" ".repeat(alignment - it.simpleName.length)} = ${if (it has IgnoreMissing)
                "$libraryExpression.getFunctionAddress(${it.functionAddress})"
            else
                "apiGetFunctionAddress($libraryExpression, ${it.functionAddress})"}"
        }}

    }""")
    }
}

/** Creates a simple APIBinding that stores the shared library and function pointers inside the binding class. The shared library is never unloaded. */
fun simpleBinding(
    module: Module,
    libraryName: String = module.name.toLowerCase(),
    libraryExpression: String = "\"$libraryName\"",
    bundledWithLWJGL: Boolean = false
) = object : SimpleBinding(module, libraryName.toUpperCase()) {
    override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
        val libraryReference = libraryName.toUpperCase()

        println("\n${t}private static final SharedLibrary $libraryReference = Library.loadNative(${nativeClass.className}.class, $libraryExpression${if (bundledWithLWJGL) ", true" else ""});")
        generateFunctionsClass(nativeClass, "\n$t/** Contains the function pointers loaded from the $libraryName {@link SharedLibrary}. */")
        println("""
    /** Returns the $libraryName {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return $libraryReference;
    }""")
    }
}

/** Creates a simple APIBinding that delegates function pointer loading to this APIBinding. */
fun APIBinding.delegate(
    libraryExpression: String
) = object : SimpleBinding(module, libraryExpression) {
    override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
        generateFunctionsClass(nativeClass, "\n$t/** Contains the function pointers loaded from {@code $libraryExpression}. */")
    }
}

// TODO: Remove if KT-7859 is fixed.
private fun APIBinding.generateFunctionSetup(writer: PrintWriter, nativeClass: NativeClass) = writer.generateFunctionSetup(nativeClass)

class NativeClass internal constructor(
    module: Module,
    className: String,
    nativeSubPath: String,
    val templateName: String = className,
    val prefix: String,
    internal val prefixMethod: String,
    internal val prefixConstant: String,
    val prefixTemplate: String,
    val postfix: String,
    val binding: APIBinding?,
    internal val library: String?,
    internal val callingConvention: CallingConvention
) : GeneratorTargetNative(module, className, nativeSubPath) {
    companion object {
        private val JDOC_LINK_PATTERN = """(?<!\p{javaJavaIdentifierPart}|[@#])#(\p{javaJavaIdentifierStart}\p{javaJavaIdentifierPart}*)""".toRegex()
    }

    var extends: NativeClass? = null

    private val constantBlocks = ArrayList<ConstantBlock<*>>()

    private val _functions = LinkedHashMap<String, Func>()
    val functions: Sequence<Func>
        get() = _functions.values.asSequence()

    // same as above + array overloads
    private val genFunctions: MutableList<Func> by lazy(LazyThreadSafetyMode.NONE) {
        ArrayList<Func>(_functions.values)
    }

    private val customMethods = ArrayList<String>()

    internal val hasBody
        get() = binding is SimpleBinding || !constantBlocks.isEmpty() || hasNativeFunctions || customMethods.isNotEmpty()

    val hasNativeFunctions
        get() = _functions.isNotEmpty()

    val link get() = "{@link ${this.className} ${this.templateName}}"

    override fun processDocumentation(documentation: String, forcePackage: Boolean): String =
        processDocumentation(documentation, prefixConstant, prefixMethod, forcePackage = forcePackage)

    private val constantLinks: Map<String, String> by lazy(LazyThreadSafetyMode.NONE) {
        val map = HashMap<String, String>()

        constantBlocks
            .forEach { block ->
                block.constants.forEach {
                    map[it.name] = block.getClassLink(it.name)
                }
            }

        functions
            .filter { it has macro }
            .forEach {
                map[it.name] = "$className#${it.name}"
            }

        map
    }

    override fun getFieldLink(field: String): String? = constantLinks[field]
    override fun getMethodLink(method: String): String? = _functions[method].let {
        if (it == null)
            null
        else
            "$className#${it.name}()"
    }

    internal fun registerFunctions(generateArrayOverloads: Boolean) {
        if (binding != null) {
            functions.asSequence()
                // This will generate additional signatures that cover the entire
                // GL/GLES API. They will not be used by LWJGL, but may be useful
                // to users. Using !it.hasCustomJNI here will eliminate them.
                .filter { !it.hasCustomJNIWithIgnoreAddress }
                .forEach { JNI.register(it) }
        }

        genFunctions
        if (!generateArrayOverloads)
            return

        functions.asSequence()
            .filter(Func::hasArrayOverloads)
            .forEach { func ->
                val multiTypeParams = func.parameters.filter { it.has<MultiType>() }
                val autoSizeResultOutParams = func.parameters.count { it.isAutoSizeResultOut }
                val documentation: ((Parameter) -> Boolean) -> String = { processDocumentation("Array version of: ${func.javaDocLink}").toJavaDoc() }

                if (multiTypeParams.isEmpty() || func.parameters.any { it.isArrayParameter(autoSizeResultOutParams) }) {
                    val overload = Func(
                        returns = func.returns,
                        simpleName = func.simpleName,
                        name = func.name,
                        documentation = documentation,
                        nativeClass = this@NativeClass,
                        parameters = *func.parameters.asSequence().map {
                            if (it.isArrayParameter(autoSizeResultOutParams))
                                it
                                    .copy(ArrayType(it.nativeType as PointerType<*>))
                                    .removeArrayModifiers()
                            else
                                func[it.name].removeArrayModifiers()
                        }.toList().toTypedArray()
                    ).copyModifiers(func)

                    if (!overload.hasCustomJNI)
                        JNI.registerArray(overload)

                    genFunctions.add(overload)
                }

                if (multiTypeParams.isEmpty())
                    return@forEach

                val multiType = multiTypeParams.first().get<MultiType>()
                multiType.types.asSequence()
                    .filter { it !== PointerMapping.DATA_POINTER }
                    .let {
                        if (multiType.byteArray)
                            sequenceOf(PointerMapping.DATA_BYTE) + it
                        else
                            it
                    }
                    .forEach { autoType ->
                        val overload = Func(
                            returns = func.returns,
                            simpleName = func.simpleName,
                            name = func.name,
                            documentation = documentation,
                            nativeClass = this@NativeClass,
                            parameters = *func.parameters.asSequence().map {
                                if (it.isArrayParameter(autoSizeResultOutParams))
                                    it
                                        .copy(ArrayType(it.nativeType as PointerType<*>))
                                        .removeArrayModifiers()
                                else if (it.has<MultiType>())
                                    it
                                        .copy(ArrayType(it.nativeType as PointerType<*>, autoType))
                                        .removeArrayModifiers()
                                        .replaceModifier<Check> {
                                            if (it === Unsafe)
                                                it
                                            else
                                                Check("${it.expression.let { if (it.contains(' ')) "($it)" else it }} >> ${autoType.byteShift}")
                                        }
                                else
                                    func[it.name].removeArrayModifiers()
                            }.toList().toTypedArray()
                        ).copyModifiers(func)

                        overload.parameters.asSequence().filter { param ->
                            param.has<AutoSize>() && multiTypeParams.any { param.get<AutoSize>().hasReference(it.name) }
                        }.forEach {
                            // TODO: This is correct for now, but we may want to add a flag to AutoSize for better control
                            fun getAutoSizeFactor(factor: AutoSizeFactor, byteShift: Int): AutoSizeFactor? {
                                if (factor.operator == "/")
                                    return null

                                try {
                                    val value = factor.expression.toInt() * (if (factor.operator == "<<") -1 else 1) - byteShift
                                    if (value == 0)
                                        return null

                                    return if (value < 0)
                                        AutoSizeFactor.shl("${-value}")
                                    else
                                        AutoSizeFactor.shr("$value")
                                } catch (e: NumberFormatException) {
                                    return null
                                }
                            }

                            val autoSize = it.get<AutoSize>()
                            it.replaceModifier(
                                if (autoSize.factor == null)
                                    AutoSizeShl(
                                        autoType.byteShift,
                                        autoSize.reference,
                                        *autoSize.dependent
                                    )
                                else
                                    AutoSize(
                                        autoSize.reference,
                                        *autoSize.dependent,
                                        factor = getAutoSizeFactor(autoSize.factor, autoType.byteShift.toInt())
                                    )
                            )
                        }

                        if (!overload.hasCustomJNI)
                            JNI.registerArray(overload)

                        genFunctions.add(overload)
                    }
            }
    }

    private fun registerLink(
        name: String,
        link: String,
        registry: MutableMap<String, String>,
        duplicate: MutableSet<String>
    ) {
        val prev = registry[name]
        when {
            prev == null               -> registry[name] = link
            link.length < prev.length  -> { // Short link == shorter class == usually core API
                registry[name] = link
                duplicate.remove(name) // sometimes there are more than 2 definitions of the same symbol
            }
            link.length == prev.length -> duplicate.add(name)
        }
    }

    internal fun registerLinks(
        tokens: MutableMap<String, String>,
        duplicateTokens: MutableSet<String>,
        functions: MutableMap<String, String>,
        duplicateFunctions: MutableSet<String>
    ) {
        constantBlocks.forEach { block ->
            block.constants.forEach {
                registerLink(it.name, block.getClassLink(it.name), tokens, duplicateTokens)
            }
        }

        this.functions.asSequence().filter { !it.has<Reuse>() }.forEach {
            if (it has macro)
                registerLink(it.simpleName, "$className#${it.name}", tokens, duplicateTokens)
            else
                registerLink(it.simpleName, "$className#${it.name}()", functions, duplicateFunctions)
        }
    }

    override fun PrintWriter.generateJava() {
        print(HEADER)
        println("package $packageName;\n")

        val hasFunctions = _functions.isNotEmpty()
        if (hasFunctions || binding is SimpleBinding) {
            // TODO: This is horrible. Refactor so that we build imports after code generation.
            if (functions.any {
                (it.returns.nativeType.isReference && it.returnsNull) || it.parameters.any {
                    it.nativeType.isReference && it.has(nullable)
                } || it.has<MapPointer>()
            }) {
                println("import javax.annotation.*;\n")
            }

            val hasBuffers = functions.any { it.returns.nativeType.isPointerData || it.hasParam { it.nativeType.isPointerData } }

            if (hasBuffers) {
                if (functions.any {
                    (it.returns.isBufferPointer && it.returns.nativeType.mapping !== PointerMapping.DATA_POINTER && it.returns.nativeType !is CharSequenceType)
                    ||
                    it.hasParam { it.isBufferPointer && it.nativeType.mapping !== PointerMapping.DATA_POINTER }
                })
                    println("import java.nio.*;\n")

                val needsPointerBuffer: NativeType.() -> Boolean = {
                    this is PointerType<*> && this.elementType.let { it is PointerType<*> || (it.mapping == PrimitiveMapping.POINTER && it !is StructType) }
                }
                if (functions.any {
                    it.returns.nativeType.needsPointerBuffer() || it.hasParam {
                        it.nativeType.needsPointerBuffer() || (it.has<MultiType>() && it.get<MultiType>().types.contains(PointerMapping.DATA_POINTER))
                    }
                })
                    println("import org.lwjgl.*;\n")
            }

            val functions = this@NativeClass.functions
                .filter { !it.has<Reuse>() }

            val hasMemoryStack = hasBuffers && functions.any { func ->
                func.hasParam {
                    it.nativeType is PointerType<*> &&
                    (
                        it.has<Return>() ||
                        it.has<SingleValue>() ||
                        (it.isAutoSizeResultOut && func.hideAutoSizeResultParam) ||
                        it.has<PointerArray>() ||
                        (it.nativeType is CharSequenceType && it.paramType !== ParameterType.OUT)
                    )
                }
            }

            if ((hasFunctions || binding != null) && module !== Module.CORE) {
                println("import org.lwjgl.system.*;\n")
            }

            if (hasFunctions && (binding is SimpleBinding || (binding != null && functions.any { it.has<MapPointer>() })))
                println("import static org.lwjgl.system.APIUtil.*;")
            if (hasFunctions && ((binding != null && binding !is SimpleBinding) || functions.any { func ->
                func.hasParam { param ->
                    param.nativeType is PointerType<*> && func.getReferenceParam<AutoSize>(param.name).let {
                        if (it == null)
                            !param.has<Nullable>() && param.nativeType.elementType !is StructType
                        else
                            it.get<AutoSize>().reference != param.name // dependent auto-size
                    }
                }
            }))
                println("import static org.lwjgl.system.Checks.*;")
            if (binding != null && functions.any { !it.hasCustomJNI || it.hasArrayOverloads })
                println("import static org.lwjgl.system.JNI.*;")
            if (hasMemoryStack)
                println("import static org.lwjgl.system.MemoryStack.*;")
            if (hasBuffers && functions.any {
                it.returns.isBufferPointer || it.hasParam { param ->
                    param.nativeType.let { it is PointerType<*> && it.mapping !== PointerMapping.OPAQUE_POINTER && (it.elementType !is StructType || param.has<Nullable>()) }
                }
            }) {
                println("import static org.lwjgl.system.MemoryUtil.*;")
                if (functions.any { func ->
                    func.hasParam {
                        it.has<MultiType>() && it.get<MultiType>().types.contains(PointerMapping.DATA_POINTER) && func.hasAutoSizeFor(it)
                    }
                })
                    println("import static org.lwjgl.system.Pointer.*;")
            }
            println()
        }

        preamble.printJava(this)

        val documentation = super.documentation
        if (!documentation.isNullOrBlank())
            println(processDocumentation(documentation!!).toJavaDoc(indentation = ""))
        val isOpen = hasFunctions || extends != null
        print("${access.modifier}${if (isOpen) "" else "final "}class $className")
        extends.let {
            if (it != null)
                print(" extends ${it.className}")
        }
        println(" {")

        constantBlocks.forEach {
            it.generate(this)
        }

        fun PrintWriter.libraryInit() {
            println(if (library == null)
                "\n${t}static { Library.initialize(); }"
            else if (library.contains('\n'))
                """
    static {
        ${library.trim()}
    }"""
            else if (library.endsWith(");"))
                "\n${t}static { $library }"
            else
                "\n${t}static { Library.loadSystem(System::load, System::loadLibrary, $className.class, Platform.mapLibraryNameBundled(\"$library\")); }"
            )
        }

        if (hasFunctions || binding is SimpleBinding) {
            if (binding != null) {
                if (binding !is SimpleBinding && functions.any(Func::hasCustomJNI))
                    libraryInit()

                if (binding is SimpleBinding || functions.any { !it.hasExplicitFunctionAddress }) {
                    println("""
    ${if (isOpen && access === Access.PUBLIC) "protected" else "private"} $className() {
        throw new UnsupportedOperationException();
    }""")
                    binding.generateFunctionSetup(this, this@NativeClass)
                }
                printCustomMethods(static = true)
            } else {
                libraryInit()

                printCustomMethods(static = true)

                // This allows binding classes to be "statically" extended. Not a good practice, but usable with static imports.
                println("""
    ${if (isOpen && access === Access.PUBLIC) "protected" else "private"} $className() {
        throw new UnsupportedOperationException();
    }""")
            }
        } else {
            println("\n$t${if (isOpen && access === Access.PUBLIC) "protected" else "private"} $className() {}")
        }

        genFunctions.forEach { func ->
            if (!func.hasParam { it.nativeType is ArrayType<*> })
                println("\n$t// --- [ ${func.name} ] ---")
            try {
                func.generateMethods(this)
            } catch (e: Exception) {
                throw RuntimeException("Uncaught exception while generating method: $className.${func.simpleName}", e)
            }
        }

        printCustomMethods(static = false)

        print("\n}")
    }

    override val skipNative get() = functions.none { it.hasCustomJNI && !it.has<Reuse>() }

    override fun PrintWriter.generateNative() {
        print(HEADER)
        preamble.printNative(this)

        if (binding != null) {
            // Generate typedefs for casting the function pointers
            println()
            functions.asSequence().filter { it.hasCustomJNI && !it.has<Reuse>() }.forEach {
                it.generateFunctionDefinition(this)
            }
        }

        println("\nEXTERN_C_ENTER")

        genFunctions.asSequence().filter { it.hasCustomJNI && !it.has<Reuse>() }.forEach {
            println()
            it.generateFunction(this)
        }

        println("\nEXTERN_C_EXIT")
    }

    internal fun nativeDirectivesWarning() {
        if (preamble.hasNativeDirectives)
            println("${t}Unnecessary native directives in: ${module.packageKotlin}.$templateName")
    }

    fun printPointers(
        out: PrintWriter,
        printPointer: (func: Func) -> String = Func::name,
        filter: ((Func) -> Boolean)? = null
    ) {
        out.print("\n$t$t$t")

        val functions = _functions.values.let { if (filter == null) it else it.filter(filter) }

        var lineSize = 12
        functions.forEachWithMore { func, more ->
            if (more) {
                out.print(", ")
                lineSize += 2
            }

            val pointer = printPointer(func)

            lineSize += pointer.length
            if (160 <= lineSize) {
                out.print("\n$t$t$t")
                lineSize = 12 + pointer.length
            }

            out.print(pointer)
        }

        out.print("\n$t$t")
    }

    // DSL extensions

    operator fun <T : Any> ConstantType<T>.invoke(documentation: String, vararg constants: Constant<T>, see: Array<String>? = null, access: Access = Access.PUBLIC): ConstantBlock<T> {
        val block = ConstantBlock(this@NativeClass, access, this, { processDocumentation(documentation) }, see, *constants)
        constantBlocks.add(block)
        return block
    }

    /** Adds a new constant. */
    operator fun <T : Any> String.rangeTo(value: T) = Constant(this, value)

    operator fun <T : Any> String.rangeTo(expression: String): Constant<T> = ConstantExpression(this, expression, false)

    /** Adds a new String constant whose value is an expression. */
    infix fun String.expr(expression: String): Constant<String> = ConstantExpression(this, expression, true)

    /** Adds a new enum constant. */
    val String.enum get() = Constant(this, EnumValue())

    infix fun String.enum(documentation: String) =
        Constant(this, EnumValue({ if (documentation.isEmpty()) null else processDocumentation(documentation) }))

    infix fun String.enum(value: Int) = Constant(this, EnumValue(value = value))
    fun String.enum(documentation: String, value: Int) =
        Constant(this, EnumValue({ if (documentation.isEmpty()) null else processDocumentation(documentation) }, value))

    fun String.enum(documentation: String, expression: String) =
        Constant(this, EnumValueExpression({ if (documentation.isEmpty()) null else processDocumentation(documentation) }, expression))

    fun DataType.IN(name: String, javadoc: String, links: String = "", linkMode: LinkMode = LinkMode.SINGLE) = createParameter(name, ParameterType.IN, javadoc, links, linkMode)
    fun PointerType<*>.OUT(name: String, javadoc: String, links: String = "", linkMode: LinkMode = LinkMode.SINGLE) = createParameter(name, ParameterType.OUT, javadoc, links, linkMode)
    fun <T : DataType> PointerType<T>.INOUT(name: String, javadoc: String, links: String = "", linkMode: LinkMode = LinkMode.SINGLE) =
        createParameter(name, ParameterType.INOUT, javadoc, links, linkMode)

    private fun NativeType.createParameter(
        name: String,
        paramType: ParameterType,
        javadoc: String,
        links: String,
        linkMode: LinkMode = LinkMode.SINGLE
    ) = if (links.isEmpty() || !links.contains('+'))
        Parameter(this, name, paramType, javadoc, links, linkMode)
    else
        Parameter(this, name, paramType) { linkMode.appendLinks(javadoc, linksFromRegex(links)) }

    operator fun VoidType.invoke(
        className: String,
        functionDoc: String,
        vararg signature: Parameter,
        nativeType: String = ANONYMOUS,
        returnDoc: String = "",
        see: Array<String>? = null,
        since: String = "",
        init: (CallbackFunction.() -> Unit)? = null
    ) = createCallback(this, nativeType, className, functionDoc, returnDoc, see, since, init, *signature)

    operator fun DataType.invoke(
        className: String,
        functionDoc: String,
        vararg signature: Parameter,
        nativeType: String = ANONYMOUS,
        returnDoc: String = "",
        see: Array<String>? = null,
        since: String = "",
        init: (CallbackFunction.() -> Unit)? = null
    ) = createCallback(this, nativeType, className, functionDoc, returnDoc, see, since, init, *signature)

    private fun createCallback(
        returns: NativeType,
        nativeType: String,
        className: String,
        functionDoc: String,
        returnDoc: String,
        see: Array<String>?,
        since: String,
        init: (CallbackFunction.() -> Unit)?,
        vararg signature: Parameter
    ): CallbackType {
        val callback = CallbackFunction(this@NativeClass.module, className, nativeType, returns, *signature)
        if (init != null)
            callback.init()
        callback.functionDoc = { it -> it.toJavaDoc(it.processDocumentation(functionDoc), it.signature.asSequence(), it.returns, returnDoc, see, since) }
        Generator.register(callback)
        Generator.register(CallbackInterface(callback))
        return CallbackType(callback)
    }

    fun AutoSize(reference: String, vararg dependent: String, factor: AutoSizeFactor? = null) =
        org.lwjgl.generator.AutoSize(reference, *dependent, factor = factor)

    /** Marks the parameter to be replaced with .remaining() on the buffer parameter specified by reference. */
    fun AutoSize(div: Int, reference: String, vararg dependent: String) =
        when {
            div < 1                    -> throw IllegalArgumentException()
            div == 1                   -> AutoSize(reference, *dependent)
            Integer.bitCount(div) == 1 -> AutoSizeShr(Integer.numberOfTrailingZeros(div).toString(), reference, *dependent)
            else                       -> AutoSizeDiv(div.toString(), reference, dependent = *dependent)
        }

    fun AutoSizeDiv(expression: String, reference: String, vararg dependent: String) =
        AutoSize(reference, *dependent, factor = AutoSizeFactor.div(expression))

    fun AutoSizeMul(expression: String, reference: String, vararg dependent: String) =
        AutoSize(reference, *dependent, factor = AutoSizeFactor.mul(expression))

    fun AutoSizeShr(expression: String, reference: String, vararg dependent: String) =
        AutoSize(reference, *dependent, factor = AutoSizeFactor.shr(expression))

    fun AutoSizeShl(expression: String, reference: String, vararg dependent: String) =
        AutoSize(reference, *dependent, factor = AutoSizeFactor.shl(expression))

    /** Marks a pointer parameter as nullable. */
    val nullable get() = org.lwjgl.generator.nullable

    operator fun VoidType.invoke(
        name: String,
        documentation: String,
        vararg parameters: Parameter,
        returnDoc: String = "",
        see: Array<String>? = null,
        since: String = "",
        noPrefix: Boolean = false
    ) =
        createFunction(ReturnValue(this), name, documentation, returnDoc, see, since, noPrefix, *parameters)

    operator fun DataType.invoke(
        name: String,
        documentation: String,
        vararg parameters: Parameter,
        returnDoc: String = "",
        see: Array<String>? = null,
        since: String = "",
        noPrefix: Boolean = false
    ) = createFunction(ReturnValue(this), name, documentation, returnDoc, see, since, noPrefix, *parameters)

    private fun createFunction(
        returns: ReturnValue,
        name: String,
        documentation: String,
        returnDoc: String,
        see: Array<String>?,
        since: String,
        noPrefix: Boolean,
        vararg parameters: Parameter
    ): Func {
        val overload = name.indexOf('@').let { if (it == -1) name else name.substring(0, it) }
        val func = Func(
            returns = returns,
            simpleName = overload,
            name = if (noPrefix) overload else "$prefixMethod$overload",
            documentation = { parameterFilter ->
                this@NativeClass.toJavaDoc(
                    processDocumentation(documentation),
                    parameters.asSequence().filter { it !== JNI_ENV && parameterFilter(it) },
                    returns.nativeType,
                    returnDoc,
                    see,
                    since
                )
            },
            nativeClass = this@NativeClass,
            parameters = *parameters
        )

        if ((_functions.put(name, func)) != null) {
            throw IllegalArgumentException("The $name function is already defined in ${this@NativeClass.className}.")
        }
        return func
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

    operator fun NativeClass.get(functionName: String) = _functions[functionName] ?: throw IllegalArgumentException("Referenced function does not exist: $templateName.$functionName")

    infix fun NativeClass.reuse(functionName: String): Func {
        val reference = this[functionName]

        val func = Reuse(this)..Func(
            returns = reference.returns,
            simpleName = reference.simpleName,
            name = reference.name,
            documentation = { this@NativeClass.convertDocumentation(this, reference.name, reference.documentation(it)) },
            nativeClass = this@NativeClass,
            parameters = *reference.parameters
        ).copyModifiers(reference)

        this@NativeClass._functions[functionName] = func
        return func
    }

    operator fun Func.get(paramName: String): Parameter = getParam(paramName).let {
        if (it === EXPLICIT_FUNCTION_ADDRESS || it === JNI_ENV)
            it
        else
            it.copy()
    }

    private fun convertDocumentation(referenceClass: NativeClass, referenceFunction: String, documentation: String) = documentation.replace(JDOC_LINK_PATTERN) { match ->
        match.value.let {
            val element = match.groupValues[1]
            if ((
                    referenceClass.prefixConstant.isNotEmpty() &&
                    element.startsWith(referenceClass.prefixConstant) &&
                    !constantLinks.containsKey(element.substring(referenceClass.prefixConstant.length))
                ) || (referenceFunction != element && !this.functions.any { func -> func.name == element })
                )
                "${referenceClass.className}$it"
            else
                it
        }
    }

    fun getCapabilityJavadoc(): String {
        val documentation = this.documentation
        return when {
            documentation == null -> "When true, {@code $templateName} is supported."
            hasBody               -> "When true, {@link $className} is supported."
            else                  -> processDocumentation(documentation)
        }.toJavaDoc()
    }

}

// DSL extensions

fun String.nativeClass(
    module: Module,
    templateName: String = this,
    nativeSubPath: String = "",
    prefix: String = "",
    prefixMethod: String = prefix.toLowerCase(),
    prefixConstant: String = if (prefix.isEmpty() || prefix.endsWith('_')) prefix else "${prefix}_",
    prefixTemplate: String = prefix,
    postfix: String = "",
    binding: APIBinding? = null,
    library: String? = null,
    callingConvention: CallingConvention = module.callingConvention,
    init: (NativeClass.() -> Unit)? = null
): NativeClass {
    val ext = NativeClass(module, this, nativeSubPath, templateName, prefix, prefixMethod, prefixConstant, prefixTemplate, postfix, binding, library, callingConvention)
    if (init != null)
        ext.init()

    binding?.addClass(ext)

    return ext
}