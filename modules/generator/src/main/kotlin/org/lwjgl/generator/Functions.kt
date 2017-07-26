/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import org.lwjgl.generator.GenerationMode.*
import org.lwjgl.generator.ParameterType.*
import java.io.*

/*
    ****
    The code below implements the more complex parts of LWJGL's code generation.
    Please only modify if you fully understand what's going on.
    ****

    The basic generation is relatively straightforward. It's an almost 1-to-1 mapping
    of the native function signature to the proper Java -> JNI -> native function code.

    We then try to generate additional Java methods that make the user's life easier. We
    use the TemplateModifiers on the function signature parameters and return values to figure
    out what kind of Transforms we should apply. Depending on the modifiers, we may generate
    one or more additional methods.
*/

// Global definitions

internal const val ADDRESS = "address()"

const val RESULT = "__result"
internal const val POINTER_POSTFIX = "Address"
internal const val MAP_OLD = "old_buffer"
internal const val MAP_LENGTH = "length"
const val FUNCTION_ADDRESS = "__functionAddress"

internal const val JNIENV = "__env"

/** Special parameter that generates an explicit function address parameter. */
val EXPLICIT_FUNCTION_ADDRESS = opaque_p.IN(FUNCTION_ADDRESS, "the function address")
/** Special parameter that will accept the JNI function's JNIEnv* parameter. Hidden in Java code. */
val JNI_ENV = "JNIEnv".p.IN(JNIENV, "the JNI environment struct")

private val TRY_FINALLY_ALIGN = "^(\\s+)".toRegex(RegexOption.MULTILINE)

enum class GenerationMode {
    NORMAL,
    ALTERNATIVE
}

// DSL extensions

fun NativeType.IN(name: String, javadoc: String, links: String = "", linkMode: LinkMode = LinkMode.SINGLE) = Parameter(this, name, IN, javadoc, links, linkMode)
fun PointerType.OUT(name: String, javadoc: String, links: String = "", linkMode: LinkMode = LinkMode.SINGLE) = Parameter(this, name, OUT, javadoc, links, linkMode)
fun PointerType.INOUT(name: String, javadoc: String, links: String = "", linkMode: LinkMode = LinkMode.SINGLE) = Parameter(this, name, INOUT, javadoc, links, linkMode)

// --- [ Native class functions ] ---

class Func(
    val returns: ReturnValue,
    val simpleName: String,
    val name: String,
    val documentation: ((Parameter) -> Boolean) -> String,
    val nativeClass: NativeClass,
    vararg val parameters: Parameter
) : ModifierTarget<FunctionModifier>() {

    private val paramMap = HashMap<String, Parameter>()

    init {
        for (param in parameters)
            paramMap.put(param.name, param)

        validate()
    }

    private val hasNativeParams = getNativeParams().any()

    fun getParam(paramName: String) = paramMap[paramName] ?: throw IllegalArgumentException("Referenced parameter does not exist: $simpleName.$paramName")
    inline fun getParams(crossinline predicate: (Parameter) -> Boolean) = parameters.asSequence().filter {
        predicate(it)
    }

    private inline fun getParam(crossinline predicate: (Parameter) -> Boolean) = getParams(predicate).single()
    internal inline fun hasParam(crossinline predicate: (Parameter) -> Boolean) = getParams(predicate).any()

    private fun getNativeParams(withExplicitFunctionAddress: Boolean = true, withJNIEnv: Boolean = false) =
        getParams { (withJNIEnv || it !== JNI_ENV) && (withExplicitFunctionAddress || it !== EXPLICIT_FUNCTION_ADDRESS) && !it.has<Virtual>() }

    /** Returns a parameter that has the specified ReferenceModifier with the specified reference. Returns null if no such parameter exists. */
    internal inline fun <reified T> getReferenceParam(reference: String) where T : ParameterModifier, T : ReferenceModifier = parameters.asSequence().firstOrNull {
        it.has<T>(reference)
    } // Assumes at most 1 parameter will be found that references the specified parameter

    override fun validate(modifier: FunctionModifier) = modifier.validate(this)

    internal fun copyModifiers(other: Func): Func {
        if (other.hasModifiers())
            this._modifiers = HashMap(other.modifiers)
        return this
    }

    val functionAddress get() = if (has<NativeName>()) get<NativeName>().name else "\"${this.name}\""

    val nativeName get() = if (has<NativeName>() && !get<NativeName>().nativeName.contains(' ')) get<NativeName>().nativeName else this.name

    private val accessModifier
        get() = (if (has<AccessModifier>()) get<AccessModifier>().access else nativeClass.access).modifier

    private fun stripPostfix(functionName: String = name): String {
        if (!hasNativeParams)
            return functionName

        val param = parameters[parameters.lastIndex]
        if (!param.isBufferPointer)
            return functionName

        var name = functionName
        var postfix = (if (has<DependsOn>()) get<DependsOn>().postfix else null) ?: nativeClass.postfix
        if (name.endsWith(postfix))
            name = name.substring(0, name.length - postfix.length)
        else
            postfix = ""

        return (if (name.endsWith("v"))
            name.substring(0, name.length - (if (name.endsWith("_v")) 2 else 1))
        else
            name) + postfix
    }

    val javaDocLink
        get() = "#${this.simpleName}()"

    private val hasFunctionAddressParam: Boolean by lazy(LazyThreadSafetyMode.NONE) {
        nativeClass.binding != null && (nativeClass.binding.apiCapabilities !== APICapabilities.JNI_CAPABILITIES || hasParam { it.nativeType is ArrayType })
    }

    internal val hasExplicitFunctionAddress
        get() = this.parameters.isNotEmpty() && this.parameters[0] === EXPLICIT_FUNCTION_ADDRESS

    private val hasNativeCode
        get() = (has<Code>() && get<Code>().let { it.nativeBeforeCall != null || it.nativeCall != null || it.nativeAfterCall != null }) || this.parameters.contains(JNI_ENV)

    internal val hasCustomJNIWithIgnoreAddress get() = (this.returns.isStructValue || hasNativeCode) && (!has<Macro>() || get<Macro>().expression == null)

    internal val hasCustomJNI: Boolean by lazy(LazyThreadSafetyMode.NONE) {
        (!hasFunctionAddressParam || returns.isStructValue || hasNativeCode) && (!has<Macro>() || get<Macro>().expression == null)
    }

    private val isNativeOnly
        get() = (nativeClass.binding == null || nativeClass.binding.apiCapabilities === APICapabilities.JNI_CAPABILITIES) &&
                !(
                    modifiers.any { it.value.isSpecial }
                    || this.returns.isSpecial
                    || hasParam { it.isSpecial }
                    || has<NativeName>()
                    || (has<Macro>() && get<Macro>().expression != null)
                 )

    private val hasUnsafeMethod by lazy(LazyThreadSafetyMode.NONE) {
        hasFunctionAddressParam
        && !(hasExplicitFunctionAddress && hasNativeCode)
        && (this.returns.hasUnsafe || hasParam { it.hasUnsafe || it has MapToInt })
        && !has<Address>()
        && !hasParam { it.nativeType is ArrayType }
        && (!has<Macro>() || get<Macro>().expression == null)
    }

    internal val hasArrayOverloads
        get() = !has<OffHeapOnly>() && this.parameters
            .count { it.isAutoSizeResultOut }
            .let { autoSizeResultOutParams -> this.parameters.asSequence().any { it.has<MultiType>() || it.isArrayParameter(autoSizeResultOutParams) } }

    private val returnsJavaMethodType
        get() = this.returns.let {
            if (it.nativeType is PointerType) {
                if (it.nativeType.elementType is StructType && hasParam { it.has<AutoSizeResultParam>() })
                    "${it.javaMethodType}.Buffer"
                else if (it.nativeType is CallbackType)
                    it.nativeType.className
                else
                    it.javaMethodType
            } else
                it.javaMethodType
        }

    private val returnsNativeMethodType
        get() = this.returns.let { if (it.isStructValue) "void" else it.nativeType.nativeMethodType }

    private val returnsJniFunctionType
        get() = this.returns.let { if (it.isStructValue) "void" else it.nativeType.jniFunctionType }

    private fun hasAutoSizePredicate(reference: Parameter): (Parameter) -> Boolean = { it.has<AutoSize>() && it.get<AutoSize>().hasReference(reference.name) }

    internal fun hasAutoSizeFor(reference: Parameter) = hasParam(hasAutoSizePredicate(reference))

    internal val hideAutoSizeResultParam = returns.nativeType is PointerType && getParams { it.isAutoSizeResultOut }.count() == 1

    private fun Parameter.error(msg: String) {
        throw IllegalArgumentException("$msg [${nativeClass.className}.${this@Func.name}, parameter: ${this.name}]")
    }

    private fun Parameter.asJavaMethodParam(annotate: Boolean) =
        (
            if (nativeType is PointerType && nativeType.elementType is StructType && (has<Check>() || getReferenceParam<AutoSize>(name) != null))
                "$javaMethodType.Buffer"
            else if (nativeType is ArrayType)
                "${(nativeType.mapping as PointerMapping).primitive}[]"
            else if (has<MapToInt>())
                "int"
            else
                javaMethodType
        ).let {
            if (annotate) {
                "${nativeType.annotate(it, has(const))} $name"
            } else {
                "$it $name"
            }
        }

    private fun Parameter.asNativeMethodParam(nativeOnly: Boolean) =
        (if (nativeType is ArrayType)
            "${(nativeType.mapping as PointerMapping).primitive}[]"
        else
            nativeType.nativeMethodType
        ).let {
            if (nativeOnly) {
                "${nativeType.annotate(it, has(const))} $name"
            } else {
                "$it $name"
            }
        }

    private fun Parameter.asNativeMethodCallParam(mode: GenerationMode) = when {
        nativeType.dereference is StructType || nativeType is ObjectType
                                                         ->
            if (has(nullable))
                "memAddressSafe($name)"
            else if (nativeType is ObjectType && hasUnsafeMethod && nativeClass.binding!!.apiCapabilities === APICapabilities.PARAM_CAPABILITIES)
                name
            else
                "$name.$ADDRESS"
        nativeType.isPointerData                         ->
            if (nativeType is ArrayType)
                name
            else if (!isAutoSizeResultOut && (has(nullable) || (has(optional) && mode === NORMAL)))
                "memAddressSafe($name)"
            else
                "memAddress($name)"
        nativeType.mapping === PrimitiveMapping.BOOLEAN4 -> "$name ? 1 : 0"
        has<MapToInt>()                                  -> if (nativeType.mapping === PrimitiveMapping.BYTE) "(byte)$name" else "(short)$name"
        else                                             -> name
    }

    private val Parameter.isFunctionProvider
        get() = nativeType is ObjectType && nativeClass.binding != null && nativeClass.binding.apiCapabilities === APICapabilities.PARAM_CAPABILITIES

    /** Validates parameters with modifiers that reference other parameters. */
    private fun validate() {
        returns.nativeType.let {
            if (it is StructType)
                it.definition.hasUsageOutput()
            else if (it is PointerType && it.elementType is StructType)
                it.elementType.definition.hasUsageResultPointer()
        }

        var returnCount = 0
        val autoSizeReferences = HashSet<String>()
        parameters.forEachIndexed { i, it ->
            it.nativeType.dereference.let { type ->
                if (type is StructType) {
                    if (it.paramType === OUT)
                        type.definition.hasUsageOutput()
                    else
                        type.definition.hasUsageInput()
                }
            }

            if (it === EXPLICIT_FUNCTION_ADDRESS && i != 0)
                it.error("The explicit function address parameter must be the first parameter.")

            if (it.has<AutoSize>()) {
                val autoSize = it.get<AutoSize>()
                val nullableReference = paramMap[autoSize.reference]?.has(nullable) ?: false
                (sequenceOf(autoSize.reference) + autoSize.dependent.asSequence()).forEach { reference ->
                    if (autoSizeReferences.contains(reference))
                        it.error("An AutoSize reference already exists for: $reference")

                    autoSizeReferences.add(reference)

                    val bufferParam = paramMap[reference]
                    if (bufferParam == null)
                        it.error("Buffer reference does not exist: AutoSize($reference)")
                    else {
                        when {
                            !bufferParam.nativeType.isPointerData -> it.error("Buffer reference must be a data pointer: AutoSize($reference)")
                            nullableReference && !bufferParam.has(nullable)
                                                                  -> it.error("If reference is nullable, dependent parameters must also be nullable: AutoSize($reference)")
                        }

                        if (bufferParam.nativeType is CharSequenceType && bufferParam.nativeType.charMapping == CharMapping.UTF16)
                            it.replaceModifier(AutoSize(2, autoSize.reference, *autoSize.dependent))
                    }
                }
            }

            if (it.has<AutoSizeResultParam>()) {
                if (!returns.nativeType.isPointerData)
                    it.error("Return type is not an array: AutoSizeResult")
            }

            if (it.isBufferPointer && !(it.nativeType as PointerType).includesPointer
                && it.nativeType !is CharSequenceType
                && !it.has<Check>()
                && !hasAutoSizeFor(it)
                && !it.has<AutoSizeResultParam>()
                && !it.has<Terminated>()
                ) {
                it.error("Data pointer not validated with Check/AutoSize/Terminated. If validation is not possible, use the Unsafe modifier.")
            }

            if (it.has<AutoType>()) {
                val bufferParamName = it.get<AutoType>().reference
                val bufferParam = paramMap[bufferParamName]
                if (bufferParam == null)
                    it.error("Buffer reference does not exist: AutoType($bufferParamName)")
                else when {
                    bufferParam.nativeType !is PointerType                -> it.error("Buffer reference must be a pointer type: AutoType($bufferParamName)")
                    bufferParam.nativeType.mapping != PointerMapping.DATA -> it.error("Pointer reference must have a DATA mapping: AutoType($bufferParamName)")
                }
            }

            if (it.has<Return>()) {
                returnCount++
                if (1 < returnCount)
                    it.error("More than one return value found.")

                val returnMod = it.get<Return>()

                if (returnMod === ReturnParam) {
                    if (returns.isStructValue) {
                        if (returns.nativeType != it.nativeType)
                            it.error("The ReturnParam modifier can only be used on a struct value parameter if the function returns the same type.")
                    } else if (!returns.isVoid)
                        it.error("The ReturnParam modifier can only be used in functions with void return type.")
                } else {
                    if (returnMod.lengthParam.startsWith(RESULT)) {
                        if (!returns.nativeType.mapping.let({ it === PrimitiveMapping.INT || it === PrimitiveMapping.POINTER }))
                            it.error("The Return modifier was used in a function with an unsupported return type")

                        if (!it.has<Check>()) {
                            if (!hasAutoSizeFor(it))
                                it.error("A Check or AutoSize for ReturnParam parameter does not exist")
                            else if (it.nativeType !is CharSequenceType)
                                it.error("Return parameters with AutoSize must have a CharSequence type")
                        } else if (it.get<Check>().expression != "1" || it.nativeType is CharSequenceType)
                            it.error("Return parameters with Check must be pointers to a single primitive value")
                    } else {
                        if (!returns.isVoid)
                            it.error("The Return modifier was used in a function with an unsupported return type")

                        if (!hasAutoSizeFor(it))
                            it.error("An AutoSize for Return parameter does not exist")

                        val lengthParam = paramMap[returnMod.lengthParam]
                        if (lengthParam == null)
                            it.error("The length parameter does not exist: Return(${returnMod.lengthParam})")
                        else if (!lengthParam.nativeType.mapping.isPointerSize)
                            it.error("The length parameter must be an integer pointer type: Return(${returnMod.lengthParam})")
                    }
                }
            }

            if (it.has<PointerArray>()) {
                if (!hasAutoSizeFor(it))
                    it.error("An AutoSize for PointerArray parameter does not exist")

                val lengthsParamName = it.get<PointerArray>().lengthsParam
                val lengthsParam = paramMap[lengthsParamName]
                if (lengthsParam != null && !lengthsParam.nativeType.mapping.isPointerSize)
                    it.error("Lengths reference must be an integer pointer type: PointerArray($lengthsParamName)")
            }

            if (it.nativeType === va_list && i != parameters.lastIndex)
                it.error("The va_list type can only be used on the last parameter of a function")
        }
    }

    private fun PrintWriter.generateChecks(mode: GenerationMode, transforms: Map<QualifiedType, Transform>? = null) {
        val checks = ArrayList<String>()

        // Validate function address
        if (hasFunctionAddressParam && (has<DependsOn>() || has<IgnoreMissing>() || (nativeClass.binding?.shouldCheckFunctionAddress(this@Func) == true)) && !hasUnsafeMethod)
            checks.add("check($FUNCTION_ADDRESS);")

        // We convert multi-byte-per-element buffers to ByteBuffer for NORMAL generation.
        // So we need to scale the length check by the number of bytes per element.
        fun bufferShift(expression: String, param: String, shift: String, transform: Transform?): String {
            val nativeType = paramMap[param]!!.nativeType
            val mapping =
                if (transform != null && transform is AutoTypeTargetTransform) {
                    transform.autoType
                } else
                    nativeType.mapping as PointerMapping

            if (!mapping.isMultiByte)
                return expression

            val builder = StringBuilder(expression.length + 8)

            if (expression.indexOf(' ') != -1) {
                builder
                    .append('(')
                    .append(expression)
                    .append(')')
            } else
                builder.append(expression)

            return builder
                .append(' ')
                .append(shift)
                .append(' ')
                .append(mapping.byteShift)
                .toString()
        }

        // First pass
        getNativeParams().forEach {
            if (it.nativeType.mapping === PointerMapping.OPAQUE_POINTER) {
                if (!it.has(nullable) && !hasUnsafeMethod && it.nativeType !is ObjectType && transforms?.get(it) !is SkipCheckFunctionTransform)
                    checks.add("check(${it.name});")
                return@forEach
            }

            var Safe = if (it.has<Nullable>()) "Safe" else ""

            if (it.paramType === IN) {
                if (it.nativeType is CharSequenceType && !it.has<Check>() && !hasAutoSizeFor(it) && transforms?.get(it) == null)
                    checks.add("checkNT${it.nativeType.charMapping.bytes}$Safe(${it.name});")

                if (it.has<Terminated>()) {
                    val postfix = if ((it.nativeType.mapping as PointerMapping).isMultiByte) "" else "1"
                    checks.add("checkNT$postfix$Safe(${it.name}${it.get<Terminated>().let { if (it === NullTerminated) "" else ", ${it.value}" }});")
                }
            }

            if (it.has<Check>()) {
                val check = it.get<Check>()
                val transform = transforms?.get(it)
                if (check !== Unsafe && transform !is SkipCheckFunctionTransform) {
                    checks.add(when {
                        it.has<MultiType>()         -> "check$Safe(${it.name}, ${bufferShift(check.expression, it.name, ">>", transform)});"
                        it.nativeType is StructType -> "check$Safe(${it.name}, ${bufferShift(check.expression, it.name, "<<", transform)});"
                        else                        -> "check$Safe(${it.name}, ${check.expression});"
                    }.let { if (check.debug) "if (DEBUG) {\n$t$t$t$t$it\n$t$t$t}" else it})
                }
            }

            if (it.has<AutoSize>()) {
                val autoSize = it.get<AutoSize>()
                if (mode === NORMAL || it.paramType === INOUT) {
                    var expression = it.name
                    if (it.paramType === INOUT) {
                        expression += if (it.nativeType is ArrayType)
                            "[0]"
                        else
                            ".get($expression.position())"
                    } else if (autoSize.factor != null)
                        expression = autoSize.factor.scaleInv(expression)

                    sequenceOf(autoSize.reference, *autoSize.dependent).forEach {
                        val bufferParam = paramMap[it]!!
                        Safe = if (bufferParam.has<Nullable>()) "Safe" else ""
                        checks.add("check$Safe($it, $expression);")
                    }
                }

                if (mode !== NORMAL) {
                    val reference = paramMap[autoSize.reference]!!
                    val referenceTransform = transforms!![reference]
                    val expression =
                        if (referenceTransform is SingleValueTransform || referenceTransform === PointerArrayTransformSingle) {
                            "1"
                        } else if (referenceTransform is PointerArrayTransform || reference.nativeType is ArrayType) {
                            if (reference has nullable)
                                "lengthSafe(${autoSize.reference})"
                            else
                                "${autoSize.reference}.length"
                        } else {
                            if (reference has nullable)
                                "remainingSafe(${autoSize.reference})"
                            else
                                "${autoSize.reference}.remaining()"
                        }

                    autoSize.dependent.forEach {
                        val param = paramMap[it]!!
                        val transform = transforms[param]
                        if (transform !is SkipCheckFunctionTransform) {
                            Safe = if (param.has<Nullable>() && transform !is PointerArrayTransform) "Safe" else ""
                            checks.add(if (transform === PointerArrayTransformArray)
                                "check$Safe($it, $expression);"
                            else
                                "check$Safe($it, $expression);")
                        }
                    }
                }
            }
        }

        // Second pass
        getNativeParams()
            .filter { it.paramType != OUT && it.nativeType.hasStructValidation && !hasUnsafeMethod }
            .forEach {
                // Do this after the AutoSize check
                checks.add(
                    "${it.nativeType.javaMethodType}.validate(${it.name}.address()${sequenceOf(
                        if (it.has<Check>()) it.get<Check>().expression else null,
                        getReferenceParam<AutoSize>(it.name).let { autoSize ->
                            if (autoSize == null)
                                null
                            else
                                transforms?.get(autoSize).let { transform ->
                                    if (transform == null)
                                        autoSize.name
                                    else
                                        @Suppress("UNCHECKED_CAST") (transform as FunctionTransform<Parameter>).transformCall(autoSize, autoSize.name)
                                }.let {
                                    if (autoSize.nativeType.mapping === PrimitiveMapping.INT)
                                        it
                                    else
                                        "(int)$it"
                                }
                        }
                    ).firstOrNull { it != null }.let { if (it == null) "" else ", $it" }});".let { validation ->
                        if (it.has<Nullable>())
                            "if (${it.name} != null) { $validation }"
                        else
                            validation
                    }
                )
            }

        // Third pass
        getNativeParams().forEach {
            // Special checks last
            nativeClass.binding?.addParameterChecks(checks, mode, it) { transforms?.get(this) === it }
        }

        if (checks.isEmpty())
            return

        println("$t${t}if (CHECKS) {")
        checks.forEach {
            print("$t$t$t")
            println(it)
        }
        println("$t$t}")
    }

    /** This is where we start generating java code. */
    internal fun generateMethods(writer: PrintWriter) {
        val nativeOnly = isNativeOnly

        val constantMacro = has<Macro>() && get<Macro>().constant

        if (hasCustomJNI)
            writer.generateNativeMethod(constantMacro, nativeOnly)

        if (!nativeOnly) {
            if (hasUnsafeMethod)
                writer.generateUnsafeMethod(constantMacro)

            if (returns.nativeType !is CharSequenceType && parameters.none { it.has<AutoSize>() && it.paramType == IN })
                writer.generateJavaMethod(constantMacro)

            writer.generateAlternativeMethods()
        }

        if (constantMacro && !has(private)) {
            writer.println()
            writer.printDocumentation { true }
            writer.println("$t${accessModifier}static final ${if (returns.nativeType is CharSequenceType) "String" else returnsJavaMethodType} $name = $name();")
        }
    }

    // --[ JAVA METHODS ]--

    private fun <T> PrintWriter.printList(items: Sequence<T>, itemPrint: (item: T) -> String?) = print(items.map(itemPrint).filterNotNull().joinToString(", "))

    private fun PrintWriter.printUnsafeJavadoc(private: Boolean, verbose: Boolean = false) {
        if (private)
            return

        val javadoc = documentation { it !== JNI_ENV }
        if (javadoc.isEmpty()) {
            if (verbose)
                nativeClass.binding?.printCustomJavadoc(this, this@Func, javadoc)
            return
        }

        if (verbose) {
            if (nativeClass.binding?.printCustomJavadoc(this, this@Func, javadoc) != true)
                println(javadoc)
        } else if (hasParam { it.nativeType is ArrayType }) {
            println(nativeClass.processDocumentation("Array version of: ${nativeClass.className}#n$name()").toJavaDoc())
        } else {
            getNativeParams().filter {
                it.documentation != null &&
                (
                    it.has<AutoSize>() ||
                    it.has<AutoType>() ||
                    (it.isAutoSizeResultOut && hideAutoSizeResultParam)
                    // TODO: more?
                )
            }.let { hiddenParameters ->
                val documentation = nativeClass.processDocumentation("Unsafe version of: $javaDocLink")
                println(if (hiddenParameters.any())
                    nativeClass.toJavaDoc(documentation, hiddenParameters, returns.nativeType, "", null, "")
                else
                    documentation.toJavaDoc()
                )
            }
        }
    }

    private fun PrintWriter.generateNativeMethod(constantMacro: Boolean, nativeOnly: Boolean) {
        println()

        printUnsafeJavadoc(constantMacro, nativeOnly)

        val retType = returnsNativeMethodType

        if (nativeOnly) {
            val retTypeAnnotation = returns.nativeType.annotation(retType, has(const))
            if (retTypeAnnotation != null)
                println("$t$retTypeAnnotation")
        }

        print("$t${if (constantMacro) "private " else accessModifier}static native $retType ")
        if (!nativeOnly) print('n')
        print(nativeName)
        print("(")

        val nativeParams = getNativeParams()
        if (hasFunctionAddressParam && !hasExplicitFunctionAddress) {
            print("long $FUNCTION_ADDRESS")
            if (nativeParams.any()) print(", ")
        }
        printList(nativeParams) {
            it.asNativeMethodParam(nativeOnly)
        }
        if (returns.isStructValue && !hasParam { it has ReturnParam }) {
            if (nativeClass.binding != null || nativeParams.any()) print(", ")
            print("long $RESULT")
        }

        println(");")
    }

    private fun PrintWriter.generateUnsafeMethod(constantMacro: Boolean) {
        println()

        printUnsafeJavadoc(constantMacro)
        print("$t${if (constantMacro) "private " else accessModifier}static $returnsNativeMethodType n$name(")
        printList(getNativeParams()) {
            if (it.isFunctionProvider)
                it.asJavaMethodParam(false)
            else
                it.asNativeMethodParam(false)
        }

        if (returns.isStructValue && !hasParam { it has ReturnParam }) {
            if (this@Func.hasNativeParams) print(", ")
            print("long $RESULT")
        }
        println(") {")

        val binding = nativeClass.binding!!

        // Get function address
        if (!hasExplicitFunctionAddress && !constantMacro)
            binding.generateFunctionAddress(this, this@Func)

        if (Binding.CHECKS) {
            // Basic checks
            val checks = ArrayList<String>(4)
            if (has<DependsOn>() || has<IgnoreMissing>() || binding.shouldCheckFunctionAddress(this@Func))
                checks.add("check($FUNCTION_ADDRESS);")
            getNativeParams().forEach {
                if (it.nativeType.mapping === PointerMapping.OPAQUE_POINTER && !it.has(nullable) && it.nativeType !is ObjectType)
                    checks.add("check(${it.name});")
                else if (it.paramType != OUT && it.nativeType.hasStructValidation)
                    checks.add(
                        "${it.nativeType.javaMethodType}.validate(${it.name}${sequenceOf(
                            if (it.has<Check>()) it.get<Check>().expression else null,
                            getReferenceParam<AutoSize>(it.name).let { autoSize ->
                                autoSize?.name?.let {
                                    if (autoSize.nativeType.mapping === PrimitiveMapping.INT)
                                        it
                                    else
                                        "(int)$it"
                                }
                            }
                        ).firstOrNull { it != null }.let { if (it == null) "" else ", $it" }});".let { validation ->
                            if (it.has<Nullable>())
                                "if (${it.name} != NULL) { $validation }"
                            else
                                validation
                        }
                    )
            }

            if (checks.isNotEmpty()) {
                println("$t${t}if (CHECKS) {")
                checks.forEach {
                    print("$t$t$t")
                    println(it)
                }
                println("$t$t}")
            }
        }

        // Native method call
        print("$t$t")
        if (!returns.isVoid && !returns.isStructValue)
            print("return ")
        print(if (hasCustomJNI)
            "n$nativeName("
        else
            "${binding.callingConvention.method}${getNativeParams(withExplicitFunctionAddress = false).map { it.nativeType.mapping.jniSignatureJava }.joinToString("")}${returns.nativeType.mapping.jniSignature}("
        )
        if (!hasExplicitFunctionAddress) {
            print(FUNCTION_ADDRESS)
            if (hasNativeParams) print(", ")
        }
        printList(getNativeParams()) {
            if (it.isFunctionProvider)
                "${it.name}.$ADDRESS"
            else
                it.name
        }
        if (returns.isStructValue && !hasParam { it has ReturnParam }) {
            print(", ")
            print(RESULT)
        }
        println(");")

        println("$t}")
    }

    private fun PrintWriter.printDocumentation(parameterFilter: (Parameter) -> Boolean) {
        val doc = documentation(parameterFilter)
        val custom = nativeClass.binding?.printCustomJavadoc(this, this@Func, doc) ?: false
        if (!custom && doc.isNotEmpty())
            println(doc)
    }

    private fun PrintWriter.generateJavaMethod(constantMacro: Boolean) {
        println()

        // JavaDoc

        if (!constantMacro)
            (parameters.count { it.isAutoSizeResultOut } == 1).let { hideAutoSizeResult ->
                printDocumentation { !(hideAutoSizeResult && it.isAutoSizeResultOut) }
            }

        // Method signature

        val retType = returnsJavaMethodType

        val retTypeAnnotation = returns.nativeType.annotation(retType, has(const))
        if (retTypeAnnotation != null)
            println("$t$retTypeAnnotation")

        print("$t${if (constantMacro) "private " else accessModifier}static $retType $name(")
        printList(getNativeParams()) {
            if (it.isAutoSizeResultOut && hideAutoSizeResultParam)
                null
            else
                it.asJavaMethodParam(true)
        }

        if (returns.isStructValue && !hasParam { it has ReturnParam }) {
            if (!parameters.isEmpty()) print(", ")
            print("${returns.nativeType.javaMethodType} $RESULT")
        }

        println(") {")

        val code = if (has<Code>()) get() else Code.NO_CODE

        // Get function address

        if (hasFunctionAddressParam && !hasUnsafeMethod && !hasExplicitFunctionAddress && !has<Macro>())
            nativeClass.binding!!.generateFunctionAddress(this, this@Func)

        // Generate checks
        printCode(code.javaInit, ApplyTo.NORMAL)
        if (Binding.CHECKS && !has<Macro>())
            generateChecks(NORMAL)

        // Prepare stack parameters

        val hasStack = hideAutoSizeResultParam
        if (hasStack) {
            println("$t${t}MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();")

            val autoSizeParam = getParam { it.has<AutoSizeResultParam>() }
            val autoSizeType = (autoSizeParam.nativeType.mapping as PointerMapping).mallocType
            println("$t$t${autoSizeType}Buffer ${autoSizeParam.name} = stack.calloc$autoSizeType(1);")
        }

        val hasFinally = hasStack || code.hasStatements(code.javaFinally, ApplyTo.NORMAL)

        // Call the native method
        generateCodeBeforeNative(code, ApplyTo.NORMAL, hasFinally)

        if (hasCustomJNI || !has<Address>()) {
            generateNativeMethodCall(
                code.hasStatements(code.javaAfterNative, ApplyTo.NORMAL),
                hasStack || code.hasStatements(code.javaFinally, ApplyTo.NORMAL)
            ) {
                printList(getNativeParams()) {
                    it.asNativeMethodCallParam(NORMAL)
                }
            }
        }

        generateCodeAfterNative(code, ApplyTo.NORMAL, hasFinally)

        if (returns.isStructValue) {
            getParams { it has ReturnParam }.map { it.name }.singleOrNull().let {
                println("${if (hasFinally) "$t$t$t" else "$t$t"}return ${it ?: RESULT};")
            }
        } else if (!returns.isVoid) {
            if (returns.nativeType.isPointerData) {
                if (hasFinally)
                    print(t)
                print("$t$t")
                if (returns.nativeType.dereference is StructType) {
                    println("return ${returns.nativeType.javaMethodType}.create($RESULT${parameters.asSequence().singleOrNull { it.has<AutoSizeResultParam>() }.let { if (it != null) ", ${it.name}.get(0)" else "" }});")
                } else {
                    val isNullTerminated = returns.nativeType is CharSequenceType
                    val bufferType = if (isNullTerminated || returns.nativeType.mapping === PointerMapping.DATA)
                        "ByteBuffer"
                    else
                        returns.nativeType.mapping.javaMethodName

                    print("return mem$bufferType")
                    if (isNullTerminated)
                        print("NT${(returns.nativeType as CharSequenceType).charMapping.bytes}")
                    print("($RESULT")
                    if (has<MapPointer>())
                        get<MapPointer>().sizeExpression.let { expression ->
                            print(", ${if (paramMap[expression]?.nativeType?.mapping === PrimitiveMapping.POINTER) "(int)" else ""}$expression")
                        }
                    else if (!isNullTerminated) {
                        if (hasParam { it.has<AutoSizeResultParam>() }) {
                            val params = getParams { it.has<AutoSizeResultParam>() }
                            val single = params.count() == 1
                            print(", ${params.map { getAutoSizeResultExpression(single, it) }.joinToString(" * ")}")
                        } else if (has<Address>())
                            print(", 1")
                        else
                            throw IllegalStateException("No AutoSizeResult parameter could be found.")
                    }
                    println(");")
                }
            } else if (code.hasStatements(code.javaAfterNative, ApplyTo.NORMAL)) {
                if (hasFinally)
                    print(t)
                println("$t${t}return $RESULT;")
            }
        }

        generateCodeFinally(code, ApplyTo.NORMAL, hasStack)

        println("$t}")
    }

    private fun PrintWriter.printCode(statements: List<Code.Statement>, applyTo: ApplyTo, indent: String = "") {
        if (statements.isEmpty())
            return

        statements.filter { it.applyTo === ApplyTo.BOTH || it.applyTo === applyTo }.forEach {
            print(indent)
            println(it.code)
        }
    }

    private fun getAutoSizeResultExpression(single: Boolean, param: Parameter) =
        if (param.paramType === IN)
            param.name.let {
                val custom = param.get<AutoSizeResultParam>().expression
                custom?.replace("\$original", it) ?: it.let { if (param.nativeType.mapping === PrimitiveMapping.INT) it else "(int)$it" }
            }
        else
            when {
                single                        -> "${param.name}.get(0)"
                param.nativeType is ArrayType -> "${param.name}[0]"
                else                          -> "${param.name}.get(${param.name}.position())"
            }.let {
                val custom = param.get<AutoSizeResultParam>().expression
                custom?.replace("\$original", it) ?: it.let { if (param.nativeType.mapping === PointerMapping.DATA_INT) it else "(int)$it" }
            }

    private fun PrintWriter.generateCodeBeforeNative(code: Code, applyTo: ApplyTo, hasFinally: Boolean) {
        printCode(code.javaBeforeNative, applyTo, "")

        if (hasFinally)
            println("$t${t}try {")
    }

    private fun PrintWriter.generateCodeAfterNative(code: Code, applyTo: ApplyTo, hasFinally: Boolean) {
        printCode(code.javaAfterNative, applyTo, if (hasFinally) t else "")
    }

    private fun PrintWriter.generateCodeFinally(code: Code, applyTo: ApplyTo, hasStack: Boolean) {
        val finally = code.getStatements(code.javaFinally, applyTo)
        if (hasStack || finally.isNotEmpty()) {
            println("$t$t} finally {")
            finally.forEach {
                println(it.code)
            }
            if (hasStack)
                println("$t$t${t}stack.setPointer(stackPointer);")
            println("$t$t}")
        }
    }

    private fun PrintWriter.generateNativeMethodCall(
        returnLater: Boolean,
        hasFinally: Boolean,
        printParams: PrintWriter.() -> Unit
    ) {
        val returnsObject = returns.nativeType is ObjectType
        val returnType = if (returnsObject) (returns.nativeType as ObjectType).className else returnsNativeMethodType

        if (hasFinally)
            print(t)
        print("$t$t")
        if (!(returns.isVoid || returns.isStructValue)) {
            if (returnLater || returns.nativeType.isPointerData) {
                print("$returnType $RESULT = ")
                if (returnsObject)
                    print("$returnType.create(")
            } else {
                print("return ")
                if (returnsObject)
                    print("$returnType.create(")
            }
        }

        val macroExpression = if (has<Macro>()) get<Macro>().expression else null
        if (hasUnsafeMethod) {
            print("n$name(")
        } else {
            print(
                if (hasCustomJNI)
                    "n$nativeName("
                else macroExpression ?:
                     "${nativeClass.binding!!.callingConvention.method}${getNativeParams(withExplicitFunctionAddress = false).map { it.nativeType.mapping.jniSignatureJava }.joinToString("")}${returns.nativeType.mapping.jniSignature}("
            )
            if (hasFunctionAddressParam && !hasExplicitFunctionAddress && !has<Macro>()) {
                print(FUNCTION_ADDRESS)
                if (hasNativeParams) print(", ")
            }
        }
        if (macroExpression == null) {
            printParams()
            if (returns.isStructValue && !hasParam { it has ReturnParam }) {
                if (hasNativeParams) print(", ")
                print("$RESULT.$ADDRESS")
            }
            print(")")
        }

        if (returnsObject) {
            if (has<Construct>()) {
                val construct = get<Construct>()
                print(", ${construct.firstArg}")
                for (arg in construct.otherArgs)
                    print(", $arg")
            }
            print(")")
        }
        if (returns.nativeType.mapping == PrimitiveMapping.BOOLEAN4)
            print(" != 0")
        println(";")
    }

    /** Alternative methods are generated by applying one or more transformations. */
    private fun PrintWriter.generateAlternativeMethods() {
        val transforms = LinkedHashMap<QualifiedType, Transform>()

        nativeClass.binding?.generateAlternativeMethods(this, this@Func, transforms)

        if (returns.nativeType is CharSequenceType)
            transforms[returns] = StringReturnTransform
        else if (has<MapPointer>()) {
            val mapPointer = get<MapPointer>()

            transforms[returns] = if (paramMap.containsKey(mapPointer.sizeExpression))
                MapPointerExplicitTransform(lengthParam = mapPointer.sizeExpression, addParam = false)
            else
                MapPointerTransform(mapPointer.sizeExpression)
        }

        // Apply basic transformations
        parameters.forEach {
            if (it.paramType === IN) {
                if (it.has<AutoSize>()) {
                    val autoSize = it.get<AutoSize>()
                    val param = paramMap[autoSize.reference]!! // TODO: Check dependent too?
                    // Check if there's also an optional on the referenced parameter. Skip if so.
                    if (!(param has optional))
                        transforms[it] = AutoSizeTransform(param, hasCustomJNI || hasUnsafeMethod)
                } else if (it has optional) {
                    transforms[it] = ExpressionTransform("NULL")
                } else if (it.has<Expression>()) {
                    // We do this here in case another transform applies too.
                    // We overwrite the value with the expression but use the type of the other transform.
                    val expression = it.get<Expression>()
                    transforms[it] = ExpressionTransform(expression.value, expression.keepParam, @Suppress("UNCHECKED_CAST") (transforms[it] as FunctionTransform<Parameter>?))
                }
            }
        }

        // Check if we have any basic transformations to apply
        if (!transforms.isEmpty())
            generateAlternativeMethod(name, transforms)

        // Generate more complex alternatives if necessary
        if (has<MapPointer>()) {
            // The size expression may be an existing parameter, in which case we don't need an explicit size alternative.
            if (!paramMap.containsKey(get<MapPointer>().sizeExpression)) {
                transforms[returns] = MapPointerExplicitTransform("length")
                generateAlternativeMethod(name, transforms)
            }
        }

        // Apply any CharSequenceTransforms. These can be combined with any of the other transformations.
        if (parameters.count {
            if (it.paramType === OUT || it.nativeType !is CharSequenceType)
                false
            else {
                val hasAutoSize = hasAutoSizeFor(it)
                it.apply {
                    if (hasAutoSize)
                        getParams(hasAutoSizePredicate(this)).forEach { transforms[it] = AutoSizeCharSequenceTransform(this) }
                }
                transforms[it] = CharSequenceTransform(!hasAutoSize)
                true
            }
        } != 0)
            generateAlternativeMethod(name, transforms)

        fun applyReturnValueTransforms(param: Parameter) {
            // Transform void to the proper type
            transforms[returns] = PrimitiveValueReturnTransform(param.nativeType as PointerType, param.name)

            // Transform the AutoSize parameter, if there is one
            getParams(hasAutoSizePredicate(param)).forEach {
                transforms[it] = Expression1Transform
            }

            // Transform the returnValue parameter
            transforms[param] = PrimitiveValueTransform
        }

        // Apply any complex transformations.
        parameters.forEach {
            if (it.has<Return>() && !hasParam { it.has<PointerArray>() }) {
                val returnMod = it.get<Return>()

                if (returnMod === ReturnParam && returns.isVoid && it.nativeType !is CharSequenceType) {
                    if (!hasParam { it.has<SingleValue>() || it.has<PointerArray>() }) {
                        // Skip, we inject the Return alternative in these transforms
                        applyReturnValueTransforms(it)
                        generateAlternativeMethod(stripPostfix(), transforms)
                    }
                } else if (it.nativeType is CharSequenceType) {
                    // Remove any transform from the maxLength parameter
                    val maxLengthParam = getParam(hasAutoSizePredicate(it))
                    transforms.remove(maxLengthParam)

                    // Hide length parameter and use the stack
                    val lengthParam = returnMod.lengthParam
                    if (lengthParam.isNotEmpty() && lengthParam !== RESULT)
                        transforms[paramMap[lengthParam]!!] = BufferLengthTransform

                    // Hide target parameter and decode internally
                    val bufferAutoSizeTransform: FunctionTransform<Parameter> = if (returnMod.heapAllocate)
                        StringAutoSizeTransform(maxLengthParam)
                    else
                        StringAutoSizeStackTransform(maxLengthParam)
                    transforms[it] = bufferAutoSizeTransform

                    // Transform void to the buffer type
                    transforms[returns] = if (lengthParam.isNotEmpty())
                        BufferReturnTransform(it, lengthParam, it.nativeType.charMapping, returnMod.includesNT)
                    else
                        BufferReturnNTTransform(
                            it,
                            if (4 < (maxLengthParam.nativeType.mapping as PrimitiveMapping).bytes) "(int)${maxLengthParam.name}" else maxLengthParam.name
                        )

                    generateAlternativeMethod(name, transforms)

                    if (returnMod.maxLengthExpression != null) {
                        // Transform maxLength parameter and generate an additional alternative
                        transforms[maxLengthParam] = ExpressionTransform(returnMod.maxLengthExpression)
                        generateAlternativeMethodDelegate(name, transforms)
                    }
                } else if (returnMod.lengthParam.startsWith(RESULT)) {
                    transforms[returns] = BufferAutoSizeReturnTransform(it, returnMod.lengthParam)
                    transforms[it] = BufferReplaceReturnTransform
                    generateAlternativeMethod(name, transforms)
                } else if (returns.isVoid)
                    throw IllegalStateException()
            } else if (it.has<AutoType>()) {
                // Generate AutoType alternatives

                val autoTypes = it.get<AutoType>()
                val bufferParam = paramMap[autoTypes.reference]!!

                // Disable AutoSize factor
                val autoSizeParam = getReferenceParam<AutoSize>(bufferParam.name)
                if (autoSizeParam != null)
                    transforms[autoSizeParam] = AutoSizeTransform(bufferParam, hasCustomJNI || hasUnsafeMethod, applyFactor = false)

                val types = ArrayList<AutoTypeToken>(autoTypes.types.size)
                autoTypes.types.forEach { types.add(it) }

                for (autoType in types) {
                    transforms[it] = AutoTypeParamTransform("${autoType.className}.${autoType.name}")
                    transforms[bufferParam] = AutoTypeTargetTransform(autoType.mapping)
                    generateAlternativeMethod(name, transforms)
                }

                transforms.remove(bufferParam)
                transforms.remove(it)
            }
        }

        // Apply any MultiType transformations.
        parameters.filter { it.has<MultiType>() }.let {
            if (it.isEmpty())
                return@let

            if (it.groupBy { it.get<MultiType>().types.contentHashCode() }.size != 1)
                throw IllegalStateException("All MultiType modifiers in a function must have the same structure.")

            // Add the AutoSize transformation if we skipped it above
            getParams { it.has<AutoSize>() }.forEach {
                val autoSize = it.get<AutoSize>()
                transforms[it] = AutoSizeTransform(paramMap[autoSize.reference]!!, hasCustomJNI || hasUnsafeMethod)
            }

            var multiTypes = it.first().get<MultiType>().types.asSequence()
            if (it.any { it has optional })
                multiTypes = sequenceOf(PointerMapping.DATA_BYTE) + multiTypes

            for (autoType in multiTypes) {
                it.forEach {
                    // Transform the AutoSize parameter, if there is one
                    getReferenceParam<AutoSize>(it.name).let { autoSizeParam ->
                        if (autoSizeParam != null)
                            transforms[autoSizeParam] = AutoSizeTransform(it, hasCustomJNI || hasUnsafeMethod, autoType.byteShift!!)
                    }

                    transforms[it] = AutoTypeTargetTransform(autoType)
                }
                generateAlternativeMethod(name, transforms)
            }

            val singleValueParams = it.filter { it.has<SingleValue>() }
            if (singleValueParams.any()) {
                // Generate a SingleValue alternative for each type
                for (autoType in multiTypes) {
                    val primitiveType = autoType.box.toLowerCase()

                    // Generate type1, type2, type3, type4 versions
                    // TODO: Make customizable? New modifier?
                    for (i in 1..4) {
                        singleValueParams.forEach {
                            // Transform the AutoSize parameter
                            val autoSizeParam = getParam(hasAutoSizePredicate(it)) // required
                            transforms[autoSizeParam] = ExpressionTransform("(1 << ${autoType.byteShift}) * $i")

                            val singleValue = it.get<SingleValue>()
                            transforms[it] = VectorValueTransform(autoType, primitiveType, singleValue.newName, i)
                        }
                        generateAlternativeMethod("$name$i${primitiveType[0]}", transforms)
                    }
                }

                singleValueParams.forEach {
                    transforms.remove(getParam(hasAutoSizePredicate(it)))
                }
            }

            it.forEach {
                getReferenceParam<AutoSize>(it.name).let {
                    if (it != null)
                        transforms.remove(it)
                }

                transforms.remove(it)
            }
        }

        // Apply any PointerArray transformations.
        parameters.filter { it.has<PointerArray>() }.let {
            if (it.isEmpty())
                return@let

            fun Parameter.getAutoSizeReference(): Parameter? = getParams {
                it.has<AutoSize>() && it.get<AutoSize>().reference == this.name
            }.firstOrNull()

            // Array version
            it.forEach {
                val pointerArray = it.get<PointerArray>()

                val lengthsParam = paramMap[pointerArray.lengthsParam]
                if (lengthsParam != null)
                    transforms[lengthsParam] = PointerArrayLengthsTransform(it, true)

                val countParam = it.getAutoSizeReference()
                if (countParam != null)
                    transforms[countParam] = ExpressionTransform("${it.name}.length")

                transforms[it] = if (it === parameters.last {
                    it !== lengthsParam && it !== countParam // these will be hidden, ignore
                }) PointerArrayTransformVararg else PointerArrayTransformArray
            }
            generateAlternativeMethod(name, transforms)

            // Combine PointerArrayTransformSingle with BufferValueReturnTransform
            getParams { it has ReturnParam }.forEach(::applyReturnValueTransforms)

            // Single value version
            it.forEach {
                val pointerArray = it.get<PointerArray>()

                val lengthsParam = paramMap[pointerArray.lengthsParam]
                if (lengthsParam != null)
                    transforms[lengthsParam] = PointerArrayLengthsTransform(it, false)

                val countParam = it.getAutoSizeReference()
                if (countParam != null)
                    transforms[countParam] = ExpressionTransform("1")

                transforms[it] = PointerArrayTransformSingle
            }
            generateAlternativeMethod(name, transforms)

            // Cleanup
            it.forEach {
                val countParam = it.getAutoSizeReference()
                if (countParam != null)
                    transforms.remove(countParam)
                transforms.remove(it)
            }
        }

        // Apply any SingleValue transformations.
        if (parameters.count {
            if (!it.has<SingleValue>() || it.has<MultiType>()) {
                false
            } else {
                // Compine SingleValueTransform with BufferValueReturnTransform
                getParams { it has ReturnParam }.forEach(::applyReturnValueTransforms)

                // Transform the AutoSize parameter, if there is one
                getParams(hasAutoSizePredicate(it)).forEach {
                    transforms[it] = Expression1Transform
                }

                val singleValue = it.get<SingleValue>()
                val pointerType = it.nativeType as PointerType
                if (pointerType.elementType is StructType) {
                    transforms[it] = SingleValueStructTransform(singleValue.newName)
                } else {
                    transforms[it] = SingleValueTransform(
                        when (pointerType.elementType) {
                            is CharSequenceType -> "CharSequence"
                            is ObjectType       -> pointerType.elementType.className
                            is StructType       -> it.javaMethodType
                            is PointerType      -> "long"
                            else                -> pointerType.elementType!!.javaMethodType
                        },
                        (pointerType.mapping as PointerMapping).box.toLowerCase(),
                        singleValue.newName
                    )
                }

                true
            }
        } != 0)
            generateAlternativeMethod(stripPostfix(), transforms)
    }

    private fun <T : QualifiedType> T.transformDeclarationOrElse(transforms: Map<QualifiedType, Transform>, original: String, annotate: Boolean, hasConst: Boolean): String? {
        val transform = transforms[this]
        return (
            if (transform == null)
                original
            else
                @Suppress("UNCHECKED_CAST")
                (transform as FunctionTransform<T>).transformDeclaration(this, original)
               ).let {
            if (!annotate || it == null)
                it
            else
                nativeType.annotate(it, hasConst)
        }
    }

    private fun <T : QualifiedType> T.transformCallOrElse(transforms: Map<QualifiedType, Transform>, original: String): String {
        val transform = transforms[this]
        if (transform == null || this is Parameter && this.has(UseVariable))
            return original
        else
            @Suppress("UNCHECKED_CAST")
            return (transform as FunctionTransform<T>).transformCall(this, original)
    }

    // TODO: Remove if KT-7859 is fixed.
    fun generateAlternativeMethod(
        writer: PrintWriter, name: String,
        transforms: Map<QualifiedType, Transform>
    ) = writer.generateAlternativeMethod(name, transforms)

    private fun PrintWriter.generateAlternativeMethodSignature(
        name: String,
        transforms: Map<QualifiedType, Transform>,
        description: String? = null,
        constantMacro: Boolean
    ) {
        // JavaDoc
        if (!constantMacro) {
            if (description != null) {
                val doc = nativeClass.processDocumentation("$description $javaDocLink").toJavaDoc()
                val custom = nativeClass.binding?.printCustomJavadoc(this, this@Func, doc) ?: false
                if (!custom && doc.isNotEmpty())
                    println(doc)
            } else {
                val hideAutoSizeResult = parameters.count { it.isAutoSizeResultOut } == 1
                printDocumentation { param ->
                    !(hideAutoSizeResult && param.isAutoSizeResultOut) && transforms[param].let {
                        @Suppress("UNCHECKED_CAST")
                        (it == null || (it as FunctionTransform<Parameter>).transformDeclaration(param, param.name).let { it != null && it.endsWith(param.name) })
                    }
                }
            }
        }

        // Method signature

        val retType = returns.transformDeclarationOrElse(transforms, returnsJavaMethodType, false, false)!!

        val retTypeAnnotation = returns.nativeType.annotation(retType, has(const))
        if (retTypeAnnotation != null)
            println("$t$retTypeAnnotation")

        print("$t${if (constantMacro) "private " else accessModifier}static $retType $name(")
        printList(getParams { it !== JNI_ENV }) {
            if (it.isAutoSizeResultOut && hideAutoSizeResultParam)
                null
            else
                it.transformDeclarationOrElse(transforms, it.asJavaMethodParam(false), true, it.has(const))
        }
        val returnTransform = transforms[returns]
        if (returnTransform is MapPointerTransform) {
            if (!parameters.isEmpty())
                print(", ")
            print("ByteBuffer $MAP_OLD")
        } else if (returnTransform != null && returnTransform::class.java === MapPointerExplicitTransform::class.java) {
            if (!parameters.isEmpty())
                print(", ")
            val mapPointerExplicit = returnTransform as MapPointerExplicitTransform
            if (mapPointerExplicit.addParam)
                print("long ${mapPointerExplicit.lengthParam}, ")
            print("ByteBuffer $MAP_OLD")
        }
        if (returns.isStructValue) {
            if (!parameters.isEmpty()) print(", ")
            print("${returns.nativeType.javaMethodType} $RESULT")
        }
        println(") {")
    }

    private fun PrintWriter.generateAlternativeMethod(
        name: String,
        transforms: Map<QualifiedType, Transform>,
        description: String? = null
    ) {
        println()

        val macro = has<Macro>()
        generateAlternativeMethodSignature(name, transforms, description, macro && get<Macro>().constant)

        // Append CodeFunctionTransform statements to Code

        val code = transforms
            .asSequence()
            .filter { it.value is CodeFunctionTransform<*> }
            .fold(if (has<Code>()) get() else Code.NO_CODE) { code, entry ->
                val (qtype, transform) = entry
                @Suppress("UNCHECKED_CAST")
                (transform as CodeFunctionTransform<QualifiedType>).generate(qtype, code)
            }

        // Get function address

        if (hasFunctionAddressParam && !hasUnsafeMethod && !has<Macro>())
            nativeClass.binding!!.generateFunctionAddress(this, this@Func)

        // Generate checks

        transforms
            .asSequence()
            .filter { it.key.let { it is Parameter && it.has<UseVariable>() } }
            .forEach {
                val param = it.key as Parameter
                @Suppress("UNCHECKED_CAST")
                val transform = it.value as FunctionTransform<Parameter>
                println("$t$t${param.asJavaMethodParam(false)} = ${transform.transformCall(param, param.name)};")
            }

        printCode(code.javaInit, ApplyTo.ALTERNATIVE)
        if (Binding.CHECKS && !macro)
            generateChecks(ALTERNATIVE, transforms)

        // Prepare stack parameters

        val stackTransforms = if (macro) emptySequence() else transforms.asSequence().filter { it.value is StackFunctionTransform<*> }
        val hideAutoSizeResultParam = this@Func.hideAutoSizeResultParam
        val hasStack = (hideAutoSizeResultParam || stackTransforms.any()) && !macro

        if (hasStack)
            println("$t${t}MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();")

        val hasFinally = hasStack || code.hasStatements(code.javaFinally, ApplyTo.ALTERNATIVE)

        // Call the native method

        generateCodeBeforeNative(code, ApplyTo.ALTERNATIVE, hasFinally)

        if (hideAutoSizeResultParam) {
            val autoSizeParam = getParam { it.has<AutoSizeResultParam>() }
            val autoSizeType = (autoSizeParam.nativeType.mapping as PointerMapping).mallocType
            println("$t$t$t${autoSizeType}Buffer ${autoSizeParam.name} = stack.calloc$autoSizeType(1);")
        }

        for ((qtype, transform) in stackTransforms) {
            @Suppress("UNCHECKED_CAST")
            when (qtype) {
                is Parameter   -> (transform as StackFunctionTransform<Parameter>).setupStack(this@Func, qtype, this)
                is ReturnValue -> (transform as StackFunctionTransform<ReturnValue>).setupStack(this@Func, qtype, this)
            }
        }

        val returnLater = code.hasStatements(code.javaAfterNative, ApplyTo.ALTERNATIVE) || transforms[returns] is ReturnLaterTransform
        generateNativeMethodCall(returnLater, hasFinally) {
            printList(getNativeParams()) {
                it.transformCallOrElse(transforms, it.asNativeMethodCallParam(ALTERNATIVE))
            }
        }

        generateCodeAfterNative(code, ApplyTo.ALTERNATIVE, hasFinally)

        // Return

        if (returns.isVoid || returns.isStructValue) {
            // TODO: struct value + custom transform?
            val result = returns.transformCallOrElse(transforms, "")
            if (!result.isEmpty()) {
                println(if (hasFinally) result.replace(TRY_FINALLY_ALIGN, "$t$1") else result)
            } else if (returns.isStructValue)
                println("${if (hasFinally) "$t$t$t" else "$t$t"}return $RESULT;")
        } else {
            if (returns.nativeType.isPointerData) {
                if (hasFinally)
                    print(t)
                print("$t$t")
                if (returns.nativeType.dereference is StructType) {
                    println("return ${returns.nativeType.javaMethodType}.create($RESULT${parameters.asSequence().singleOrNull { it.has<AutoSizeResultParam>() }.let { if (it != null) ", ${it.name}.get(${it.name}.position()" else "" }});")
                } else {
                    val isNullTerminated = returns.nativeType is CharSequenceType
                    val bufferType = if (isNullTerminated || returns.nativeType.mapping === PointerMapping.DATA)
                        "ByteBuffer"
                    else
                        returns.nativeType.mapping.javaMethodName

                    val builder = StringBuilder()
                    builder.append("mem$bufferType")
                    if (isNullTerminated)
                        builder.append("NT${(returns.nativeType as CharSequenceType).charMapping.bytes}")
                    builder.append("($RESULT")
                    if (has<MapPointer>())
                        builder.append(", ${get<MapPointer>().sizeExpression}")
                    else if (!isNullTerminated) {
                        if (hasParam { it.has<AutoSizeResultParam>() }) {
                            val params = getParams { it.has<AutoSizeResultParam>() }
                            val single = params.count() == 1
                            builder.append(", ${params.map { getAutoSizeResultExpression(single, it) }.joinToString(" * ")}")
                        } else
                            throw IllegalStateException("No AutoSizeResult parameter could be found.")
                    }
                    builder.append(")")

                    val returnExpression = returns.transformCallOrElse(transforms, builder.toString())
                    if (returnExpression.indexOf('\n') == -1)
                        println("return $returnExpression;")
                    else // Multiple statements, assumes the transformation includes the return statement.
                        println(returnExpression)
                }
            } else if (returnLater) {
                if (hasFinally)
                    print(t)
                println(returns.transformCallOrElse(transforms, "$t${t}return $RESULT;"))
            }
        }

        generateCodeFinally(code, ApplyTo.ALTERNATIVE, hasStack)

        println("$t}")
    }

    private fun PrintWriter.generateAlternativeMethodDelegate(
        name: String,
        transforms: Map<QualifiedType, Transform>,
        description: String? = null
    ) {
        println()

        generateAlternativeMethodSignature(name, transforms, description, has<Macro>() && get<Macro>().constant)

        // Call the native method
        print("$t$t")
        if (!((returns.isVoid && transforms[returns] == null) || returns.isStructValue))
            print("return ")
        print("$name(")
        printList(getNativeParams().filter {
            @Suppress("UNCHECKED_CAST")
            val t = transforms[it] as FunctionTransform<Parameter>?
            t == null || t is ExpressionTransform || t.transformDeclaration(it, it.asJavaMethodParam(false)) != null
        }) {
            val t = transforms[it]
            if (t is ExpressionTransform)
                t.transformCall(it, it.asNativeMethodCallParam(ALTERNATIVE))
            else
                it.name
        }
        println(");")
        println("$t}")
    }

    // --[ JNI FUNCTIONS ]--

    internal fun generateFunctionDefinition(writer: PrintWriter) = writer.generateFunctionDefinitionImpl()
    private fun PrintWriter.generateFunctionDefinitionImpl() {
        print("typedef ${returns.toNativeType(has(const), nativeClass.binding)} (")
        if (nativeClass.binding?.callingConvention !== CallingConvention.DEFAULT)
            print("APIENTRY ")
        print("*${nativeName}PROC) (")
        val nativeParams = getNativeParams(withExplicitFunctionAddress = false, withJNIEnv = true)
        if (nativeParams.any()) {
            printList(nativeParams) {
                it.toNativeType(nativeClass.binding)
            }
        } else
            print("void")
        println(");")
    }

    internal fun generateFunction(writer: PrintWriter) {
        val hasArrays = hasParam { it.nativeType is ArrayType }
        writer.generateFunctionImpl(hasArrays, critical = false)
        if (hasArrays && !parameters.contains(JNI_ENV))
            writer.generateFunctionImpl(hasArrays, critical = true)
    }

    private fun PrintWriter.generateFunctionImpl(hasArrays: Boolean, critical: Boolean) {
        val params = ArrayList<String>(4 + parameters.size)
        if (!critical)
            params.add("JNIEnv *$JNIENV, jclass clazz")
        if (hasFunctionAddressParam)
            params.add("jlong $FUNCTION_ADDRESS")
        getNativeParams(withExplicitFunctionAddress = false).map {
            if (it.nativeType is ArrayType) {
                if (critical)
                    "jint ${it.name}__length, j${(it.nativeType.mapping as PointerMapping).primitive}* ${it.name}"
                else
                    "j${(it.nativeType.mapping as PointerMapping).primitive}Array ${it.name}$POINTER_POSTFIX"
            } else {
                "${it.nativeType.jniFunctionType} ${it.name}${if (it.nativeType is PointerType || it.nativeType is StructType) POINTER_POSTFIX else ""}"
            }
        }.toCollection(params)
        if (returns.isStructValue && !hasParam { it has ReturnParam })
            params.add("jlong $RESULT")

        // Function signature

        val workaroundJDK8167409 = critical && 6 <= parameters.count() && parameters.any {
            (it.nativeType is PointerType && it.nativeType !is ArrayType) || it.nativeType.mapping.let { it is PrimitiveMapping && 4 < it.bytes }
        }
        if (workaroundJDK8167409) println("#ifdef LWJGL_WINDOWS")
        print("JNIEXPORT $returnsJniFunctionType JNICALL Java${if (critical) "Critical" else ""}_${nativeClass.nativeFileNameJNI}_")
        if (!isNativeOnly)
            print('n')
        print(nativeName.asJNIName)
        if (hasArrays || hasArrayOverloads)
            print(getNativeParams(withExplicitFunctionAddress = false).map {
                if (it.nativeType is ArrayType)
                    it.nativeType.mapping.jniSignatureArray
                else
                    it.nativeType.mapping.jniSignatureStrict
            }.joinToString("", prefix = if (hasFunctionAddressParam) "__J" else "__", postfix = if (returns.isStructValue) "J" else ""))
        println("(${if (params.isEmpty()) "void" else params.joinToString(", ")}) {")

        // Cast function address to pointer

        if (nativeClass.binding != null) {
            if (hasFunctionAddressParam) {
                println("$t${nativeName}PROC $nativeName = (${nativeName}PROC)(intptr_t)$FUNCTION_ADDRESS;")
            } else
                println("$t${nativeName}PROC $nativeName = (${nativeName}PROC)tlsGetFunction(${nativeClass.binding.getFunctionOrdinal(this@Func)});")
        }

        // Cast addresses to pointers

        getNativeParams(withExplicitFunctionAddress = false)
            .filter { it.nativeType.let { (it is PointerType && it !is ArrayType) || it is StructType } }
            .forEach {
                val pointerType = it.toNativeType(nativeClass.binding, pointerMode = true)
                print("$t$pointerType")
                if (!pointerType.endsWith('*')) print(' ')
                val castExpression = if (it.nativeType === va_list)
                    "VA_LIST_CAST"
                else
                    "($pointerType)"
                println("${it.name} = $castExpression${if (nativeClass.binding == null) "(intptr_t)" else ""}${it.name}$POINTER_POSTFIX;")
            }

        // Custom code

        var code = if (has<Code>()) get() else Code.NO_CODE
        if (hasArrays && !critical) {
            code = code.append(
                nativeBeforeCall = getParams { it.nativeType is ArrayType }.map {
                    "j${(it.nativeType.mapping as PointerMapping).primitive} *${it.name} = ${
                    "(*$JNIENV)->GetPrimitiveArrayCritical($JNIENV, ${it.name}$POINTER_POSTFIX, 0)".let { expression ->
                        if (it.has<Nullable>())
                            "${it.name}$POINTER_POSTFIX == NULL ? NULL : $expression"
                        else
                            expression
                    }};"
                }.joinToString("\n$t", prefix = t),
                nativeAfterCall = getParams { it.nativeType is ArrayType }
                    .withIndex()
                    .sortedByDescending { it.index }
                    .map { it.value }
                    .map {
                        "(*$JNIENV)->ReleasePrimitiveArrayCritical($JNIENV, ${it.name}$POINTER_POSTFIX, ${it.name}, 0);".let { expression ->
                            if (it.has<Nullable>())
                                "if (${it.name} != NULL) { $expression }"
                            else
                                expression
                        }
                    }.joinToString("\n$t", prefix = t)
            )
        }

        if (code.nativeAfterCall != null && !returns.isVoid && !returns.isStructValue)
            println("$t$returnsJniFunctionType $RESULT;")

        code.nativeBeforeCall.let { if (it != null) println(it) }

        // Unused parameter macro

        if (!critical)
            println(if (parameters.contains(JNI_ENV) || (nativeClass.binding != null && !hasFunctionAddressParam))
                "${t}UNUSED_PARAM(clazz)"
            else
                "${t}UNUSED_PARAMS($JNIENV, clazz)"
            )
        else
            getParams { it.nativeType is ArrayType }.forEach {
                println("${t}UNUSED_PARAM(${it.name}__length)")
            }

        // Call native function

        code.nativeCall.let {
            if (it != null)
                println(it)
            else {
                print(t)
                if (returns.isStructValue) {
                    getParams { it has ReturnParam }.map { it.name }.singleOrNull().let {
                        print(if (it != null)
                            "*$it = "
                        else
                            "*((${returns.nativeType.name}*)(intptr_t)$RESULT) = "
                        )
                    }
                } else if (!returns.isVoid) {
                    print(if (code.nativeAfterCall != null) "$RESULT = " else "return ")
                    if (returnsJniFunctionType != returns.nativeType.name)
                        print("($returnsJniFunctionType)")
                    if (returns.nativeType is PointerType && nativeClass.binding == null)
                        print("(intptr_t)")
                    if (has<Address>())
                        print('&')
                }
                if (parameters.isNotEmpty() && parameters[0] === JNI_ENV && nativeClass.className == "JNINativeInterface")
                    print("(*$JNIENV)->")
                print(nativeName)
                if (!has<Macro>() || get<Macro>().function) print('(')
                printList(getNativeParams(withExplicitFunctionAddress = false, withJNIEnv = true)) {
                    if (it.nativeType.let { it is StructType || it === va_list })
                        "*${it.name}"
                    else if ((it.nativeType.mapping === PrimitiveMapping.POINTER || it.nativeType is ArrayType) && it.nativeType !is ObjectType)
                        "(${it.toNativeType(nativeClass.binding, pointerMode = true)})${it.name}" // Avoid implicit cast warnings
                    else
                        it.name
                }
                if (!has<Macro>() || get<Macro>().function) print(')')
                println(';')
            }
        }

        code.nativeAfterCall.let {
            if (it == null) return@let

            println(it)
            if (!returns.isVoid && !returns.isStructValue)
                println("${t}return $RESULT;")
        }

        println("}")
        if (workaroundJDK8167409) println("#endif")
    }

}