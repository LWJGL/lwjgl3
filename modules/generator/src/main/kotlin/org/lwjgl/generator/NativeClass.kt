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
    packageName: String,
    className: String,
    val apiCapabilities: APICapabilities = APICapabilities.NONE,
    val callingConvention: CallingConvention = CallingConvention.STDCALL
) : GeneratorTarget(packageName, className) {

    init {
        javaImport(
            "org.lwjgl.system.*",
            "java.util.Set"
        )
    }

    private val _classes: MutableList<NativeClass> = ArrayList()

    protected fun getClasses(
        comparator: (NativeClass, NativeClass) -> Int = { o1, o2 -> o1.templateName.compareTo(o2.templateName, ignoreCase = true) }
    ): List<NativeClass> {
        val classes = ArrayList(_classes)
        classes.sortWith(Comparator { o1, o2 -> comparator(o1, o2) })
        return classes
    }

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

    /** Can be overriden to generate binding-specific alternative methods. */
    open fun generateAlternativeMethods(
        writer: PrintWriter,
        function: Func,
        transforms: MutableMap<QualifiedType, Transform>
    ) = Unit

    /** Can be overriden to generate binding-specific javadoc. If this function returns false, the default javadoc will be generated. */
    open fun printCustomJavadoc(writer: PrintWriter, function: Func, documentation: String) = false

    /** Can be overriden to implement a custom condition for checking the function address. */
    open fun shouldCheckFunctionAddress(function: Func) = apiCapabilities.ordinal > 1

    /** Can be overriden to add custom parameter checks. */
    open fun addParameterChecks(
        checks: MutableList<String>,
        mode: GenerationMode,
        parameter: Parameter,
        hasTransform: Parameter.(FunctionTransform<Parameter>) -> Boolean
    ) = Unit

}

/** An APIBinding without an associated capabilities class.  */
abstract class SimpleBinding(
    val libraryExpression: String,
    callingConvention: CallingConvention
) : APIBinding("n/a", "n/a", callingConvention = callingConvention) {
    override fun PrintWriter.generateJava() = Unit
    override fun generateFunctionAddress(writer: PrintWriter, function: Func) {
        writer.println("$t${t}long ${if (function has Address) RESULT else FUNCTION_ADDRESS} = Functions.${function.simpleName};")
    }

    protected fun PrintWriter.generateFunctionsClass(nativeClass: NativeClass) {
        val bindingFunctions = nativeClass.functions.filter { !it.hasExplicitFunctionAddress && !it.has<Macro>() }
        if (bindingFunctions.isEmpty())
            return

        val alignment = bindingFunctions.map { it.simpleName.length }.max()!!

        println("""
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ${
        bindingFunctions
            .map {
                "${it.simpleName}${" ".repeat(alignment - it.simpleName.length)} = ${if (it has IgnoreMissing)
                    "$libraryExpression.getFunctionAddress(${it.functionAddress})"
                else
                    "apiGetFunctionAddress($libraryExpression, ${it.functionAddress})"}"
            }
            .joinToString(separator = ",\n$t$t$t", postfix = ";")
        }

    }""")
    }
}

/** Creates a simple APIBinding that stores the shared library and function pointers inside the binding class. The shared library is never unloaded. */
fun simpleBinding(
    libraryName: String,
    libraryExpression: String = "\"$libraryName\"",
    callingConvention: CallingConvention = CallingConvention.DEFAULT,
    bundledWithLWJGL: Boolean = false
) = object : SimpleBinding(libraryName.toUpperCase(), callingConvention) {
    override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
        val libraryReference = libraryName.toUpperCase()

        println("\n${t}private static final SharedLibrary $libraryReference = Library.loadNative(${nativeClass.className}.class, $libraryExpression${if (bundledWithLWJGL) ", true" else ""});\n")
        print("$t/** Contains the function pointers loaded from the $libraryName {@link SharedLibrary}. */")
        generateFunctionsClass(nativeClass)
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
) = object : SimpleBinding(libraryExpression, callingConvention) {
    override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
        print("\n$t/** Contains the function pointers loaded from {@code $libraryExpression}. */")
        generateFunctionsClass(nativeClass)
    }
}

// TODO: Remove if KT-7859 is fixed.
private fun APIBinding.generateFunctionSetup(writer: PrintWriter, nativeClass: NativeClass) = writer.generateFunctionSetup(nativeClass)

class NativeClass(
    packageName: String,
    className: String,
    nativeSubPath: String,
    val templateName: String = className,
    val prefix: String,
    val prefixMethod: String,
    val prefixConstant: String,
    val prefixTemplate: String,
    val postfix: String,
    val binding: APIBinding?,
    val library: String?
) : GeneratorTargetNative(packageName, className, nativeSubPath) {
    companion object {
        private val JDOC_LINK_PATTERN = """(?<!\p{javaJavaIdentifierPart}|[@#])#(\p{javaJavaIdentifierStart}\p{javaJavaIdentifierPart}*)""".toRegex()
    }

    private val constantBlocks = ArrayList<ConstantBlock<*>>()

    private val _functions = LinkedHashMap<String, Func>()
    val functions: Iterable<Func>
        get() = _functions.values

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
                                Parameter(
                                    ArrayType(it.nativeType as PointerType),
                                    it.name,
                                    it.paramType,
                                    it.documentation
                                ).copyModifiers(it).removeArrayModifiers()
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
                                    Parameter(
                                        ArrayType(it.nativeType as PointerType),
                                        it.name,
                                        it.paramType,
                                        it.documentation
                                    ).copyModifiers(it).removeArrayModifiers()
                                else if (it.has<MultiType>())
                                    Parameter(
                                        ArrayType(it.nativeType as PointerType, autoType),
                                        it.name,
                                        it.paramType,
                                        it.documentation
                                    ).copyModifiers(it).removeArrayModifiers().replaceModifier<Check> {
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
                                } catch(e: NumberFormatException) {
                                    return null
                                }
                            }

                            val autoSize = it.get<AutoSize>()
                            it.replaceModifier(if (autoSize.factor == null)
                                AutoSizeShl(
                                    autoType.byteShift!!,
                                    autoSize.reference,
                                    *autoSize.dependent
                                )
                            else
                                AutoSize(
                                    autoSize.reference,
                                    *autoSize.dependent,
                                    factor = getAutoSizeFactor(autoSize.factor, autoType.byteShift!!.toInt())
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
        if (prev == null) {
            registry.put(name, link)
        } else if (link.length < prev.length) { // Short link == shorter class == usually core API
            registry.put(name, link)
            duplicate.remove(name) // sometimes there are more than 2 definitions of the same symbol
        } else if (link.length == prev.length) {
            duplicate.add(name)
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

        this.functions.asSequence().filter { !it.has(Reuse) }.forEach {
            if (it has macro)
                registerLink(it.simpleName, "$className#${it.name}", tokens, duplicateTokens)
            else
                registerLink(it.simpleName, "$className#${it.name}()", functions, duplicateFunctions)
        }
    }

    override fun PrintWriter.generateJava() {
        print(HEADER)
        println("package $packageName;\n")

        val hasFunctions = !_functions.isEmpty()
        if (hasFunctions || binding is SimpleBinding) {
            // TODO: This is horrible. Refactor so that we build imports after code generation.
            val hasBuffers = functions.any { it.returns.nativeType.isPointerData || it.hasParam { it.nativeType.isPointerData } }

            if (hasBuffers) {
                if (functions.any {
                    (it.returns.isBufferPointer && it.returns.nativeType.mapping !== PointerMapping.DATA_POINTER && it.returns.nativeType !is CharSequenceType)
                    ||
                    it.hasParam { it.isBufferPointer && it.nativeType.mapping !== PointerMapping.DATA_POINTER }
                })
                    println("import java.nio.*;\n")

                val needsPointerBuffer: NativeType.() -> Boolean = {
                    this is PointerType && this.elementType.let { it != null && (it is PointerType || (it.mapping == PrimitiveMapping.POINTER && it !is StructType)) }
                }
                if (functions.any {
                    it.returns.nativeType.needsPointerBuffer() || it.hasParam {
                        it.nativeType.needsPointerBuffer() || (it.has<MultiType>() && it.get<MultiType>().types.contains(PointerMapping.DATA_POINTER))
                    }
                })
                    println("import org.lwjgl.*;\n")
            }

            val hasMemoryStack = hasBuffers && functions.any { func ->
                func.hasParam {
                    it.nativeType is PointerType &&
                    (
                        it.has<Return>() ||
                        it.has<SingleValue>() ||
                        (it.isAutoSizeResultOut && func.hideAutoSizeResultParam) ||
                        it.has<PointerArray>() ||
                        (it.nativeType is CharSequenceType && it.paramType !== ParameterType.OUT)
                    )
                }
            }

            if (hasMemoryStack || (binding is SimpleBinding && !binding.libraryExpression.contains('.')) || (binding == null && (library == null || !library.endsWith(");")))) {
                if (packageName != "org.lwjgl.system")
                    println("import org.lwjgl.system.*;\n")
            }

            if (hasFunctions && (binding is SimpleBinding || (binding != null && functions.any { it.has<MapPointer>() })))
                println("import static org.lwjgl.system.APIUtil.*;")
            if (hasFunctions && ((binding != null && binding !is SimpleBinding) || functions.any { func ->
                func.hasParam { param ->
                    param.nativeType is PointerType && func.getReferenceParam<AutoSize>(param.name).let {
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
                    param.nativeType.let { it is PointerType && it.mapping !== PointerMapping.OPAQUE_POINTER && (it.elementType !is StructType || param.has<Nullable>()) }
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
        println("${access.modifier}${if (hasFunctions) "" else "final "}class $className {")

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

                printCustomMethods(static = true)

                if (binding is SimpleBinding || functions.any { !it.hasExplicitFunctionAddress }) {
                    println("""
    ${if (hasFunctions && access === Access.PUBLIC) "protected" else "private"} $className() {
        throw new UnsupportedOperationException();
    }""")
                    binding.generateFunctionSetup(this, this@NativeClass)
                }
            } else {
                libraryInit()

                printCustomMethods(static = true)

                // This allows binding classes to be "statically" extended. Not a good practice, but usable with static imports.
                println("""
    ${if (hasFunctions && access === Access.PUBLIC) "protected" else "private"} $className() {
        throw new UnsupportedOperationException();
    }""")
            }
        } else {
            println("\n${t}private $className() {}")
        }

        genFunctions.forEach { func ->
            if (!func.hasParam { it.nativeType is ArrayType })
                println("\n$t// --- [ ${func.name} ] ---")
            try {
                func.generateMethods(this)
            } catch (e: Exception) {
                throw RuntimeException("Uncaught exception while generating method: $className.${func.name}", e)
            }
        }

        printCustomMethods(static = false)

        print("\n}")
    }

    override val skipNative get() = functions.none(Func::hasCustomJNI)

    override fun PrintWriter.generateNative() {
        print(HEADER)
        preamble.printNative(this)

        if (binding != null) {
            // Generate typedefs for casting the function pointers
            println()
            functions.asSequence().filter(Func::hasCustomJNI).forEach {
                it.generateFunctionDefinition(this)
            }
        }

        println("\nEXTERN_C_ENTER")

        genFunctions.asSequence().filter(Func::hasCustomJNI).forEach {
            println()
            it.generateFunction(this)
        }

        println("\nEXTERN_C_EXIT")
    }

    internal fun nativeDirectivesWarning() {
        if (preamble.hasNativeDirectives)
            println("${t}Unnecessary native directives in: $packageName.$templateName")
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

    operator fun NativeType.invoke(name: String, documentation: String, vararg parameters: Parameter, returnDoc: String = "", see: Array<String>? = null, since: String = "", noPrefix: Boolean = false) =
        ReturnValue(this)(name, documentation, *parameters, returnDoc = returnDoc, see = see, since = since, noPrefix = noPrefix)

    operator fun ReturnValue.invoke(name: String, documentation: String, vararg parameters: Parameter, returnDoc: String = "", see: Array<String>? = null, since: String = "", noPrefix: Boolean = false): Func {
        val func = Func(
            returns = this,
            simpleName = name,
            name = if (noPrefix) name else "$prefixMethod$name",
            documentation = { parameterFilter ->
                this@NativeClass.toJavaDoc(
                    processDocumentation(documentation),
                    parameters.asSequence().filter { it !== JNI_ENV && parameterFilter(it) },
                    this.nativeType,
                    returnDoc,
                    see,
                    since
                )
            },
            nativeClass = this@NativeClass,
            parameters = *parameters
        )

        _functions.put(name, func)
        return func
    }

    fun customMethod(method: String) {
        customMethods.add(method)
    }

    private fun PrintWriter.printCustomMethods(static: Boolean) {
        customMethods.filter { it.startsWith("static {") == static }.forEach {
            println("\n$t${it.trim()}")
        }
    }

    operator fun NativeClass.get(functionName: String) = _functions[functionName] ?: throw IllegalArgumentException("Referenced function does not exist: $templateName.$functionName")

    infix fun NativeClass.reuse(functionName: String): Func {
        val reference = this[functionName]

        val func = Reuse..Func(
            returns = reference.returns,
            simpleName = reference.simpleName,
            name = reference.name,
            documentation = { this@NativeClass.convertDocumentation(this, reference.name, reference.documentation(it)) },
            nativeClass = this@NativeClass,
            parameters = *reference.parameters
        ).copyModifiers(reference)

        this@NativeClass._functions.put(functionName, func)
        return func
    }

    operator fun Func.get(paramName: String): Parameter {
        val param = getParam(paramName)

        return if (param === EXPLICIT_FUNCTION_ADDRESS || param === JNI_ENV)
            param
        else {
            Parameter(
                param.nativeType,
                param.name,
                param.paramType,
                param.documentation
            ).copyModifiers(param)
        }
    }

    private fun convertDocumentation(referenceClass: NativeClass, referenceFunction: String, documentation: String): String = documentation.replace(JDOC_LINK_PATTERN) { match ->
        match.value.let {
            val element = match.groupValues[1]
            if ((
                    referenceClass.prefixConstant.isNotEmpty() &&
                    element.startsWith(referenceClass.prefixConstant) &&
                    !constantLinks.containsKey(element.substring(referenceClass.prefixConstant.length))
                ) || (referenceFunction != element && !this.functions.any { it -> it.name == element })
                )
                "${referenceClass.className}$it"
            else
                it
        }
    }

    fun getCapabilityJavadoc(): String {
        val documentation = this.documentation
        return (if (documentation == null)
            "When true, {@code $templateName} is supported."
        else if (hasBody)
            "When true, {@link $className} is supported."
        else
            processDocumentation(documentation)).toJavaDoc()
    }

}

// DSL extensions

fun String.nativeClass(
    packageName: String,
    templateName: String = this,
    nativeSubPath: String = "",
    prefix: String = "",
    prefixMethod: String = prefix.toLowerCase(),
    prefixConstant: String = if (prefix.isEmpty() || prefix.endsWith('_')) prefix else "${prefix}_",
    prefixTemplate: String = prefix,
    postfix: String = "",
    binding: APIBinding? = null,
    library: String? = null,
    init: (NativeClass.() -> Unit)? = null
): NativeClass {
    val ext = NativeClass(packageName, this, nativeSubPath, templateName, prefix, prefixMethod, prefixConstant, prefixTemplate, postfix, binding, library)
    if (init != null)
        ext.init()

    binding?.addClass(ext)

    return ext
}