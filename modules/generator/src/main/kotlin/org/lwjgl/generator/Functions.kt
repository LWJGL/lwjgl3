/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import org.lwjgl.generator.GenerationMode.*
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
internal const val ANONYMOUS = "*" // invalid character in Java identifiers
internal const val POINTER_POSTFIX = "Address"
internal const val MAP_OLD = "old_buffer"
internal const val MAP_LENGTH = "length"
const val FUNCTION_ADDRESS = "__functionAddress"

internal const val JNIENV = "__env"

/** Special parameter that generates an explicit function address parameter. */
val EXPLICIT_FUNCTION_ADDRESS = Parameter(opaque_p, FUNCTION_ADDRESS, "the function address")
/** Special parameter that will accept the JNI function's JNIEnv* parameter. Hidden in Java code. */
val JNI_ENV = Parameter("JNIEnv".opaque.p, JNIENV, "the JNI environment struct")

private val TRY_FINALLY_ALIGN = "^(\\s+)".toRegex(RegexOption.MULTILINE)

enum class GenerationMode {
    NORMAL,
    ALTERNATIVE
}

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
            paramMap[param.name] = param

        validate()
    }

    private val hasNativeParams = getNativeParams().any()

    fun getParam(paramName: String) = paramMap[paramName] ?: throw IllegalArgumentException("Referenced parameter does not exist: $simpleName.$paramName")
    inline fun getParams(crossinline predicate: (Parameter) -> Boolean) = parameters.asSequence().filter {
        predicate(it)
    }

    private inline fun getParam(crossinline predicate: (Parameter) -> Boolean) = getParams(predicate).single()
    internal inline fun hasParam(crossinline predicate: (Parameter) -> Boolean) = getParams(predicate).any()

    private fun getNativeParams(
        withExplicitFunctionAddress: Boolean = true,
        withJNIEnv: Boolean = false,
        withAutoSizeResultParams: Boolean = true
    ) = parameters.asSequence()
        .let { p -> if (withExplicitFunctionAddress) p else p.filter { it !== EXPLICIT_FUNCTION_ADDRESS } }
        .let { p -> if (withJNIEnv) p else p.filter { it !== JNI_ENV } }
        .let { p -> if (withAutoSizeResultParams)
            p.filter { !it.has<Virtual>() }
        else
            p.filter { !((it.has<Virtual>() && !it.has<AutoSizeResultParam>()) || (it.isAutoSizeResultOut && hideAutoSizeResultParam)) }
        }

    /** Returns a parameter that has the specified ReferenceModifier with the specified reference. Returns null if no such parameter exists. */
    internal inline fun <reified T> getReferenceParam(reference: String)
        where T : ParameterModifier,
              T : ReferenceModifier = parameters.asSequence().firstOrNull {
        it.has<T>(reference)
    } // Assumes at most 1 parameter will be found that references the specified parameter

    override fun validate(modifier: FunctionModifier) = modifier.validate(this)

    internal fun copyModifiers(other: Func): Func {
        if (other.hasModifiers())
            this._modifiers = HashMap(other.modifiers)
        return this
    }

    val functionAddress get() = if (has<NativeName>()) get<NativeName>().name else "\"${this.name}\""

    val nativeName get() = if (has<NativeName> { !nativeName.contains(' ') }) get<NativeName>().nativeName else this.name

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
        nativeClass.binding != null && (nativeClass.binding.apiCapabilities !== APICapabilities.JNI_CAPABILITIES || hasParam { it.nativeType is ArrayType<*> })
    }

    internal val hasExplicitFunctionAddress
        get() = this.parameters.isNotEmpty() && this.parameters.last() === EXPLICIT_FUNCTION_ADDRESS

    private val hasNativeCode
        get() = (has<Code> { nativeBeforeCall != null || nativeCall != null || nativeAfterCall != null }) || this.parameters.contains(JNI_ENV)

    internal val hasCustomJNIWithIgnoreAddress get() = (this.returns.isStructValue || hasNativeCode) && (!has<Macro> { expression != null })

    internal val hasCustomJNI: Boolean by lazy(LazyThreadSafetyMode.NONE) {
        (!hasFunctionAddressParam || returns.isStructValue || hasNativeCode || hasParam { it.nativeType is StructType }) && (!has<Macro> { expression != null })
    }

    private val isNativeOnly: Boolean by lazy(LazyThreadSafetyMode.NONE) {
        (nativeClass.binding == null || nativeClass.binding.apiCapabilities === APICapabilities.JNI_CAPABILITIES) &&
            !(
                modifiers.any { it.value.isSpecial }
                    || this.returns.isSpecial
                    || hasParam { it.isSpecial }
                    || has<NativeName>()
                    || (has<Macro> { expression != null })
                )
    }

    private val hasUnsafeMethod by lazy(LazyThreadSafetyMode.NONE) {
        hasFunctionAddressParam
        && !(hasExplicitFunctionAddress && hasNativeCode)
        && (this.returns.hasUnsafe || hasParam { it.hasUnsafe || it has MapToInt })
        && !has<Address>()
        && !hasParam { it.nativeType is ArrayType<*> }
        && (!has<Macro> { expression != null })
    }

    internal val hasArrayOverloads
        get() = !has<OffHeapOnly>() && this.parameters
            .count { it.isAutoSizeResultOut }
            .let { autoSizeResultOutParams -> this.parameters.asSequence().any { it.has<MultiType>() || it.isArrayParameter(autoSizeResultOutParams) } }

    private val ReturnValue.javaMethodType
        get() = this.nativeType.let {
            if (it is PointerType<*>) {
                if (it.elementType is StructType && hasParam { param -> param.has<AutoSizeResultParam>() })
                    "${it.javaMethodType}.Buffer"
                else if (it is FunctionType)
                    it.className
                else
                    it.javaMethodType
            } else
                it.javaMethodType
        }

    private val ReturnValue.nativeMethodType
        get() = if (this.isStructValue) "void" else this.nativeType.nativeMethodType

    private val ReturnValue.jniFunctionType
        get() = if (this.isStructValue) "void" else this.nativeType.jniFunctionType

    internal val returnsNull
        get() = !(has(Nonnull) || has(Address) || has<Macro> { !function })

    private inline fun <reified T> hasReference(reference: Parameter): (Parameter) -> Boolean
        where T : ParameterModifier,
              T : ReferenceModifier = { it.has<T> { hasReference(reference.name) } }

    private inline fun <reified T> hasReferenceFor(reference: Parameter)
        where T : ParameterModifier,
              T : ReferenceModifier = hasParam(hasReference<T>(reference))

    internal fun hasAutoSizeFor(reference: Parameter) = hasReferenceFor<AutoSize>(reference)

    internal val hideAutoSizeResultParam = returns.nativeType is PointerType<*> && getParams { it.isAutoSizeResultOut }.count() == 1

    private fun Parameter.error(msg: String) {
        throw IllegalArgumentException("$msg [${nativeClass.className}.${this@Func.simpleName}, parameter: ${this.name}]")
    }

    private fun Parameter.asJavaMethodParam(annotate: Boolean) =
        (
            if (nativeType is PointerType<*> && nativeType.elementType is StructType && (has<Check>() || has<Unsafe>() || getReferenceParam<AutoSize>(name) != null))
                "$javaMethodType.Buffer"
            else if (nativeType is ArrayType<*>)
                "${nativeType.mapping.primitive}[]"
            else if (has<MapToInt>())
                "int"
            else
                javaMethodType
        ).let {
            if (annotate) {
                nativeType.annotate(it).let { annotatedType ->
                    if (nativeType.isReference && has(nullable)) {
                        "@Nullable $annotatedType"
                    } else {
                        annotatedType
                    }
                }
            } else {
                it
            }
        }.let {
            "$it $name"
        }

    private fun Parameter.asNativeMethodParam(nativeOnly: Boolean) =
        (if (nativeType is ArrayType<*>)
            "${nativeType.mapping.primitive}[]"
        else
            nativeType.nativeMethodType
        ).let {
            if (nativeOnly) {
                "${nativeType.annotate(it)} $name"
            } else {
                "$it $name"
            }
        }

    private fun Parameter.asNativeMethodArgument(mode: GenerationMode) = when {
        nativeType.dereference is StructType || nativeType is WrappedPointerType
                                                         ->
            if (has(nullable))
                "memAddressSafe($name)"
            else if (nativeType is WrappedPointerType && hasUnsafeMethod && nativeClass.binding!!.apiCapabilities === APICapabilities.PARAM_CAPABILITIES)
                name
            else
                "$name.$ADDRESS"
        nativeType.isPointerData                         ->
            if (nativeType is ArrayType<*>)
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
        get() = nativeType is WrappedPointerType && nativeClass.binding != null && nativeClass.binding.apiCapabilities === APICapabilities.PARAM_CAPABILITIES

    /** Validates parameters with modifiers that reference other parameters. */
    private fun validate() {
        returns.nativeType.let {
            if (it is StructType)
                it.definition.hasUsageOutput()
            else if (it is PointerType<*> && it.elementType is StructType)
                it.elementType.definition.hasUsageResultPointer()
        }

        var returnCount = 0
        val autoSizeReferences = HashSet<String>()
        parameters.forEachIndexed { i, it ->
            it.nativeType.dereference.let { type ->
                if (type is StructType) {
                    if (it.isInput)
                        type.definition.hasUsageInput()
                    else
                        type.definition.hasUsageOutput()
                }
            }

            if (it === EXPLICIT_FUNCTION_ADDRESS && i != parameters.lastIndex)
                it.error("The explicit function address parameter must be the last parameter.")

            if (it.has<Check>()) {
                val checkReference = paramMap[it.get<Check>().expression]
                if (checkReference != null) {
                    if (checkReference.nativeType !is IntegerType) {
                        it.error("The Check expression refers to an invalid parameter: ${checkReference.name}")
                    }
                }
            }

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
                            it.replaceModifier(nativeClass.AutoSize(2, autoSize.reference, *autoSize.dependent))
                    }
                }
            }

            if (it.has<AutoSizeResultParam>()) {
                if (!returns.nativeType.isPointerData)
                    it.error("Return type is not an array: AutoSizeResult")
            }

            if (it.isBufferPointer
                && it.nativeType !is CharSequenceType
                && !it.has<Check>()
                && !it.has<Unsafe>()
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
                    bufferParam.nativeType !is PointerType<*>       -> it.error("Buffer reference must be a pointer type: AutoType($bufferParamName)")
                    bufferParam.nativeType.elementType !is VoidType -> it.error("Pointer reference must point to a void type: AutoType($bufferParamName)")
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
                        if (!returns.nativeType.mapping.let { it === PrimitiveMapping.INT || it === PrimitiveMapping.POINTER })
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
                        else if (!lengthParam.nativeType.isPointerSize)
                            it.error("The length parameter must be an integer pointer type: Return(${returnMod.lengthParam})")
                    }
                }
            }

            if (it.has<PointerArray>()) {
                if (!hasAutoSizeFor(it))
                    it.error("An AutoSize for PointerArray parameter does not exist")

                val lengthsParamName = it.get<PointerArray>().lengthsParam
                val lengthsParam = paramMap[lengthsParamName]
                if (lengthsParam != null && !lengthsParam.nativeType.isPointerSize)
                    it.error("Lengths reference must be an integer pointer type: PointerArray($lengthsParamName)")
            }

            if (it.nativeType === va_list && i != parameters.lastIndex)
                it.error("The va_list type can only be used on the last parameter of a function")

            if (it.nativeType is FunctionType && !it.nativeType.function.skipNative) {
                if (!hasReferenceFor<UserData>(it)) {
                    it.error("Missing UserData parameter for callback parameter: ${it.name}")
                }
                Expression(
                    "${if (it.has(nullable)) "${it.name} == null ? NULL : " else ""}${it.nativeType.function.className}.DELEGATE",
                    keepParam = true,
                    skipNormal = true
                )..it
            }

            if (it.has<UserData>()) {
                val callbackParamName = it.get<UserData>().reference
                val callbackParam = paramMap[callbackParamName]
                if (callbackParam == null) {
                    it.error("Callback reference does not exist: UserData($callbackParamName)")
                } else if (callbackParam.nativeType !is FunctionType) {
                    it.error("UserData reference must be a callback parameter: UserData($callbackParamName)")
                }
                Expression(
                    "$callbackParamName.$ADDRESS",
                    skipNormal = true
                )..it
            }
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
                if (!it.has(nullable) && !hasUnsafeMethod && it.nativeType !is WrappedPointerType && transforms?.get(it) !is SkipCheckFunctionTransform)
                    checks.add("check(${it.name});")
                return@forEach
            }

            var Safe = if (it.has<Nullable>()) "Safe" else ""

            if (it.nativeType is CharSequenceType && !it.has<Check>() && !it.has<Unsafe>() && !hasAutoSizeFor(it) && transforms?.get(it) == null)
                checks.add("checkNT${it.nativeType.charMapping.bytes}$Safe(${it.name});")

            if (it.has<Terminated>()) {
                val postfix = if ((it.nativeType.mapping as PointerMapping).isMultiByte) "" else "1"
                checks.add("checkNT$postfix$Safe(${it.name}${it.get<Terminated>().let { terminated -> if (terminated === NullTerminated) "" else ", ${terminated.value}" }});")
            }

            if (it.has<Check>() && (!it.has<AutoSizeResultParam>() || !hideAutoSizeResultParam)) {
                val check = it.get<Check>()
                val transform = transforms?.get(it)
                if (transform !is SkipCheckFunctionTransform) {
                    checks.add(when {
                        it.has<MultiType>()         -> "check$Safe(${it.name}, ${bufferShift(check.expression, it.name, ">>", transform)});"
                        it.nativeType is StructType -> "check$Safe(${it.name}, ${bufferShift(check.expression, it.name, "<<", transform)});"
                        else                        -> "check$Safe(${it.name}, ${check.expression});"
                    }.let { code -> if (check.debug) "if (DEBUG) {\n$t$t$t$t$code\n$t$t$t}" else code})
                }
            }

            if (it.has<AutoSize>()) {
                val autoSize = it.get<AutoSize>()
                if (mode === NORMAL || !it.isInput) {
                    var expression = it.name
                    if (!it.isInput) {
                        expression += if (it.nativeType is ArrayType<*>)
                            "[0]"
                        else
                            ".get($expression.position())"
                    } else if (autoSize.factor != null)
                        expression = autoSize.factor.scaleInv(expression)

                    sequenceOf(autoSize.reference, *autoSize.dependent).forEach { reference ->
                        val bufferParam = paramMap[reference]!!
                        Safe = if (bufferParam.has<Nullable>()) "Safe" else ""
                        checks.add("check$Safe($reference, $expression);")
                    }
                }

                if (mode !== NORMAL) {
                    val reference = paramMap[autoSize.reference]!!
                    val referenceTransform = transforms!![reference]
                    val expression =
                        if (referenceTransform is SingleValueTransform || referenceTransform === PointerArrayTransformSingle) {
                            "1"
                        } else if (referenceTransform is PointerArrayTransform || reference.nativeType is ArrayType<*>) {
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

                    autoSize.dependent.forEach { dependency ->
                        val param = paramMap[dependency]!!
                        val transform = transforms[param]
                        if (transform !is SkipCheckFunctionTransform) {
                            Safe = if (param.has<Nullable>() && transform !is PointerArrayTransform) "Safe" else ""
                            checks.add(if (transform === PointerArrayTransformArray)
                                "check$Safe($dependency, $expression);"
                            else
                                "check$Safe($dependency, $expression);")
                        }
                    }
                }
            }
        }

        // Second pass
        getNativeParams()
            .filter { it.isInput && it.nativeType.hasStructValidation && !hasUnsafeMethod }
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
                                }.let { name ->
                                    if (autoSize.nativeType.mapping === PrimitiveMapping.INT)
                                        name
                                    else
                                        "(int)$name"
                                }
                        }
                    ).firstOrNull { size -> size != null }.let { size -> if (size == null) "" else ", $size" }});".let { validation ->
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
            nativeClass.binding?.addParameterChecks(checks, mode, it) { transform ->
                transforms?.get(this) === transform
            }
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
        val hasReuse = has<Reuse>()
        val nativeOnly = isNativeOnly

        val constantMacro = has<Macro> { constant }

        if (hasCustomJNI && !(hasReuse && nativeOnly))
            writer.generateNativeMethod(constantMacro, nativeOnly, hasReuse)

        if (!nativeOnly || hasReuse) {
            if (hasUnsafeMethod)
                writer.generateUnsafeMethod(constantMacro, hasReuse)

            if ((returns.nativeType !is CharSequenceType || has<Address>() || has<MustBeDisposed>()) && parameters.none { (it.has<AutoSize>() && it.isInput) || it.has<Expression> { skipNormal } })
                writer.generateJavaMethod(constantMacro, hasReuse)

            writer.generateAlternativeMethods()
        }

        if (constantMacro && !has(private)) {
            writer.println()
            writer.printDocumentation { true }
            writer.println("$t${accessModifier}static final ${if (returns.nativeType is CharSequenceType) "String" else returns.javaMethodType} $name = $name(${
                if (returns.nativeType !is StructType) "" else "${returns.nativeType.javaMethodType}.create()"
            });")
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
        } else if (hasParam { it.nativeType is ArrayType<*> } && !has<OffHeapOnly>()) {
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

    private fun PrintWriter.generateNativeMethod(constantMacro: Boolean, nativeOnly: Boolean, hasReuse: Boolean) {
        println()

        printUnsafeJavadoc(constantMacro, nativeOnly)

        if (returns.nativeType is JObjectType && returnsNull) {
            println("$t@Nullable")
        }

        val retType = returns.nativeMethodType

        if (nativeOnly) {
            val retTypeAnnotation = returns.nativeType.annotation(retType)
            if (retTypeAnnotation != null)
                println("$t$retTypeAnnotation")
        }

        print("$t${if (constantMacro) "private " else accessModifier}static${if (hasReuse) "" else " native"} $retType ")
        if (!nativeOnly) print('n')
        print(name)
        print("(")

        val nativeParams = getNativeParams()
        printList(nativeParams) {
            it.asNativeMethodParam(nativeOnly)
        }
        if (hasFunctionAddressParam && !hasExplicitFunctionAddress) {
            if (nativeParams.any()) print(", ")
            print("long $FUNCTION_ADDRESS")
        }
        if (returns.isStructValue && !hasParam { it has ReturnParam }) {
            if (nativeClass.binding != null || nativeParams.any()) print(", ")
            print("long $RESULT")
        }

        if (hasReuse) {
            print(") {\n$t$t")
            if (retType != "void")
                print("return ")
            print("${get<Reuse>().source.className}.n$name(")
            printList(nativeParams) {
                it.name
            }
            if (hasFunctionAddressParam && !hasExplicitFunctionAddress) {
                if (nativeParams.any()) print(", ")
                print(FUNCTION_ADDRESS)
            }
            println(");\n$t}")
        } else {
            println(");")
        }
    }

    private fun PrintWriter.generateUnsafeMethod(constantMacro: Boolean, hasReuse: Boolean) {
        println()

        printUnsafeJavadoc(constantMacro)
        if (returns.nativeType is JObjectType && returnsNull) {
            println("$t@Nullable")
        }
        print("$t${if (constantMacro) "private " else accessModifier}static ${returns.nativeMethodType} n$name(")
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

        if (hasReuse) {
            print("$t$t")
            if (returns.nativeMethodType != "void") {
                print("return ")
            }
            print("${get<Reuse>().source.className}.n$name(")
            printList(getNativeParams()) {
                it.name
            }
            println(");\n$t}")
            return
        }

        val binding = nativeClass.binding!!

        // Get function address
        if (!hasExplicitFunctionAddress && !constantMacro)
            binding.generateFunctionAddress(this, this@Func)

        if (Module.CHECKS) {
            // Basic checks
            val checks = ArrayList<String>(4)
            if (has<DependsOn>() || has<IgnoreMissing>() || binding.shouldCheckFunctionAddress(this@Func))
                checks.add("check($FUNCTION_ADDRESS);")
            getNativeParams().forEach {
                if (it.nativeType.mapping === PointerMapping.OPAQUE_POINTER && !it.has(nullable) && it.nativeType !is WrappedPointerType)
                    checks.add("check(${it.name});")
                else if (it.isInput && it.nativeType.hasStructValidation)
                    checks.add(
                        "${it.nativeType.javaMethodType}.validate(${it.name}${sequenceOf(
                            if (it.has<Check>()) it.get<Check>().expression else null,
                            getReferenceParam<AutoSize>(it.name).let { autoSize ->
                                autoSize?.name?.let { name ->
                                    if (autoSize.nativeType.mapping === PrimitiveMapping.INT)
                                        name
                                    else
                                        "(int)$name"
                                }
                            }
                        ).firstOrNull { size -> size != null }.let { size -> if (size == null) "" else ", $size" }});".let { validation ->
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
            "n$name("
        else
            "${nativeClass.callingConvention.method}${getNativeParams(withExplicitFunctionAddress = false).map { it.nativeType.jniSignatureJava }.joinToString("")}${returns.nativeType.jniSignature}("
        )
        printList(getNativeParams()) {
            if (it.isFunctionProvider)
                "${it.name}.$ADDRESS"
            else
                it.name
        }
        if (!hasExplicitFunctionAddress) {
            if (hasNativeParams) print(", ")
            print(FUNCTION_ADDRESS)
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

    private fun PrintWriter.generateJavaMethod(constantMacro: Boolean, hasReuse: Boolean) {
        println()

        // JavaDoc

        if (!constantMacro) {
            val hideAutoSizeResult = parameters.count { it.isAutoSizeResultOut } == 1
            printDocumentation {
                !(hideAutoSizeResult && it.isAutoSizeResultOut)
            }
        }

        // Method signature

        if (returns.nativeType.isReference && returnsNull) {
            println("$t@Nullable")
        }

        val retType = returns.javaMethodType

        val retTypeAnnotation = returns.nativeType.annotation(retType)
        if (retTypeAnnotation != null) {
            println("$t$retTypeAnnotation")
        }

        print("$t${if (constantMacro) "private " else accessModifier}static ${if (has<MapPointer>() && returns.nativeType.dereference is StructType) "$retType.Buffer" else retType} $name(")
        printList(getNativeParams(withAutoSizeResultParams = false)) {
            it.asJavaMethodParam(true)
        }

        if (returns.isStructValue && !hasParam { it has ReturnParam }) {
            if (parameters.isNotEmpty()) print(", ")
            print("${returns.nativeType.annotate(retType)} $RESULT")
        }

        println(") {")

        if (hasReuse) {
            print("$t$t")
            if (retType != "void") {
                print("return ")
            }
            print("${get<Reuse>().source.className}.$name(")
            printList(getNativeParams()) {
                if (it.isAutoSizeResultOut && hideAutoSizeResultParam)
                    null
                else
                    it.name
            }
            println(");\n$t}")
            return
        }

        val hasArrays = hasParam { it.nativeType is ArrayType<*> }
        val code = if (has<Code>()) get() else Code.NO_CODE

        // Get function address

        if (hasFunctionAddressParam && !hasUnsafeMethod && !hasExplicitFunctionAddress && !has<Macro>())
            nativeClass.binding!!.generateFunctionAddress(this, this@Func)

        // Generate checks
        printCode(code.javaInit, false, hasArrays)
        if (Module.CHECKS && !has<Macro>())
            generateChecks(NORMAL)

        // Prepare stack parameters

        val hasStack = hideAutoSizeResultParam
        if (hasStack) {
            println("$t${t}MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();")

            val autoSizeParam = getParam { it.has<AutoSizeResultParam>() }
            val autoSizeType = (autoSizeParam.nativeType.mapping as PointerMapping).mallocType
            println("$t$t${autoSizeType}Buffer ${autoSizeParam.name} = stack.calloc$autoSizeType(1);")
        }

        val hasFinally = hasStack || code.hasStatements(code.javaFinally, false, hasArrays)

        // Call the native method
        generateCodeBeforeNative(code, false, hasArrays, hasFinally)

        if (hasCustomJNI || !has<Address>()) {
            generateNativeMethodCall(
                code.hasStatements(code.javaAfterNative, false, hasArrays),
                hasStack || code.hasStatements(code.javaFinally, false, hasArrays)
            ) {
                printList(getNativeParams()) {
                    it.asNativeMethodArgument(NORMAL)
                }
            }
        }

        generateCodeAfterNative(code, false, hasArrays, hasFinally)

        if (returns.isStructValue) {
            println("${if (hasFinally) "$t$t$t" else "$t$t"}return ${getParams { it has ReturnParam }.map { it.name }.singleOrNull() ?: RESULT};")
        } else if (!returns.isVoid) {
            if (returns.nativeType is PointerType<*> && returns.nativeType.mapping !== PointerMapping.OPAQUE_POINTER) {
                if (hasFinally)
                    print(t)
                print("$t${t}return ")

                val isNullTerminated = returns.nativeType is CharSequenceType
                print(
                    if (returns.nativeType.dereference is StructType) {
                        "${returns.nativeType.javaMethodType}.create"
                    } else {
                        "mem${if (isNullTerminated || returns.nativeType.elementType is VoidType)
                            "ByteBuffer"
                        else
                            returns.nativeType.mapping.javaMethodName}"
                    }
                )
                if (isNullTerminated) {
                    print("NT${(returns.nativeType as CharSequenceType).charMapping.bytes}")
                }
                if (returnsNull) {
                    print("Safe")
                }

                print("($RESULT")
                if (has<MapPointer>())
                    get<MapPointer>().sizeExpression.let { expression ->
                        val castToInt =
                            paramMap[expression].run { this != null && nativeType.mapping !== PrimitiveMapping.INT }
                            ||
                            expression.indexOf('(').run {
                                if (this == -1) false else expression.substring(0, this).run {
                                    nativeClass.functions
                                        .singleOrNull { it.nativeName == this }?.let { it.returns.nativeType.mapping !== PrimitiveMapping.INT } ?: false
                                }
                            }

                        print(", ${if (castToInt) "(int)" else ""}$expression")
                    }
                else {
                    val hasAutoSizeResult = hasParam { it.has<AutoSizeResultParam>() }
                    if (!isNullTerminated || hasAutoSizeResult) {
                        if (hasAutoSizeResult) {
                            val params = getParams { it.has<AutoSizeResultParam>() }
                            val single = params.count() == 1
                            print(", ${params.map { getAutoSizeResultExpression(single, it) }.joinToString(" * ")}")
                        } else if (returns.nativeType.dereference !is StructType) {
                            if (has<Address>()) {
                                print(", 1")
                            } else {
                                throw IllegalStateException("No AutoSizeResult parameter could be found.")
                            }
                        }
                    }
                }
                println(");")
            } else if (code.hasStatements(code.javaAfterNative, false, hasArrays)) {
                if (hasFinally)
                    print(t)
                println("$t${t}return $RESULT;")
            }
        }

        generateCodeFinally(code, false, hasArrays, hasStack)

        println("$t}")
    }

    private fun PrintWriter.printCode(statements: List<Code.Statement>, alternative: Boolean, arrays: Boolean, indent: String = "") {
        if (statements.isEmpty())
            return

        statements
            .filter { it.applyTo.filter(alternative, arrays) }
            .forEach {
                print(indent)
                println(it.code)
            }
    }

    private fun getAutoSizeResultExpression(single: Boolean, param: Parameter) =
        if (param.isInput)
            param.name.let {
                val custom = param.get<AutoSizeResultParam>().expression
                custom?.replace("\$original", it) ?: it.let { expression -> if (param.nativeType.mapping === PrimitiveMapping.INT) expression else "(int)$expression" }
            }
        else
            when {
                single                           -> "${param.name}.get(0)"
                param.nativeType is ArrayType<*> -> "${param.name}[0]"
                else                             -> "${param.name}.get(${param.name}.position())"
            }.let {
                val custom = param.get<AutoSizeResultParam>().expression
                custom?.replace("\$original", it) ?: it.let { expression -> if (param.nativeType.mapping === PointerMapping.DATA_INT) expression else "(int)$expression" }
            }

    private fun PrintWriter.generateCodeBeforeNative(code: Code, alternative: Boolean, arrays: Boolean, hasFinally: Boolean) {
        printCode(code.javaBeforeNative, alternative, arrays , "")

        if (hasFinally)
            println("$t${t}try {")
    }

    private fun PrintWriter.generateCodeAfterNative(code: Code, alternative: Boolean, arrays: Boolean, hasFinally: Boolean) {
        printCode(code.javaAfterNative, alternative, arrays, if (hasFinally) t else "")
    }

    private fun PrintWriter.generateCodeFinally(code: Code, alternative: Boolean, arrays: Boolean, hasStack: Boolean) {
        val finally = code.getStatements(code.javaFinally, alternative, arrays)
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
        val returnsObject = returns.nativeType is WrappedPointerType
        val returnType = if (returnsObject) (returns.nativeType as WrappedPointerType).className else returns.nativeMethodType

        if (hasFinally)
            print(t)
        print("$t$t")
        if (!(returns.isVoid || returns.isStructValue)) {
            if (returnLater || returns.nativeType.isPointerData) {
                print("$returnType $RESULT = ")
                if (returnsObject)
                    print("$returnType.createSafe(")
            } else {
                print("return ")
                if (returnsObject)
                    print("$returnType.createSafe(")
            }
        }

        val macroExpression = if (has<Macro>()) get<Macro>().expression else null
        if (hasUnsafeMethod) {
            print("n$name(")
        } else {
            if (hasCustomJNI) {
                if (!isNativeOnly) {
                    print('n')
                }
                print("$name(")
            } else {
                print(macroExpression ?: "${nativeClass.callingConvention.method}${getNativeParams(withExplicitFunctionAddress = false)
                    .map { it.nativeType.jniSignatureJava }
                    .joinToString("")
                }${returns.nativeType.jniSignature}(")
            }
        }
        if (macroExpression == null) {
            printParams()
            if (!hasUnsafeMethod && hasFunctionAddressParam && !hasExplicitFunctionAddress && !has<Macro>()) {
                if (hasNativeParams) print(", ")
                print(FUNCTION_ADDRESS)
            }
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

        // Apply RawPointer transformations.
        parameters.filter { it.has<RawPointer>() && it.nativeType !is ArrayType<*> }.let { params ->
            if (params.isEmpty())
                return@let

            params.forEach {
                transforms[it] = RawPointerTransform
            }
            generateAlternativeMethod(name, transforms)
            params.forEach {
                transforms.remove(it)
            }
        }

        if (returns.nativeType is CharSequenceType && !has<Address>() && !has<MustBeDisposed>())
            transforms[returns] = StringReturnTransform(returnsNull)
        else if (has<MapPointer>()) {
            val mapPointer = get<MapPointer>()

            if (mapPointer.oldBufferOverloads) {
                transforms[returns] = if (paramMap.containsKey(mapPointer.sizeExpression))
                    MapPointerExplicitTransform(mapPointer.sizeExpression, useOldBuffer = true, addParam = false)
                else
                    MapPointerTransform(mapPointer.sizeExpression, useOldBuffer = true)
            }
        }

        // Apply basic transformations
        parameters.forEach {
            if (it.has<AutoSize>() && it.isInput) {
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

        // Check if we have any basic transformations to apply
        if (transforms.isNotEmpty())
            generateAlternativeMethod(name, transforms)

        // Generate more complex alternatives if necessary

        // The size expression may be an existing parameter, in which case we don't need an explicit size alternative.
        if (has<MapPointer> { !paramMap.containsKey(sizeExpression) }) {
            transforms[returns] = MapPointerExplicitTransform("length", get<MapPointer>().oldBufferOverloads)
            generateAlternativeMethod(name, transforms)
        }

        // Apply any CharSequenceTransforms. These can be combined with any of the other transformations.
        if (parameters.count {
            if (!it.isInput || it.nativeType !is CharSequenceType)
                false
            else {
                val hasAutoSize = hasAutoSizeFor(it)
                it.apply {
                    if (hasAutoSize)
                        getParams(hasReference<AutoSize>(this)).forEach { param -> transforms[param] = AutoSizeCharSequenceTransform(this) }
                }
                transforms[it] = CharSequenceTransform(!hasAutoSize)
                true
            }
        } != 0)
            generateAlternativeMethod(name, transforms)

        fun applyReturnValueTransforms(param: Parameter) {
            // Transform void to the proper type
            transforms[returns] = PrimitiveValueReturnTransform(param.nativeType as PointerType<*>, param.name)

            // Transform the AutoSize parameter, if there is one
            getParams(hasReference<AutoSize>(param)).forEach {
                transforms[it] = Expression1Transform
            }

            // Transform the returnValue parameter
            transforms[param] = PrimitiveValueTransform
        }

        // Apply any complex transformations.
        parameters.forEach {
            if (it.has<Return>() && !hasParam { param -> param.has<PointerArray>() }) {
                val returnMod = it.get<Return>()

                if (returnMod === ReturnParam && returns.isVoid && it.nativeType !is CharSequenceType) {
                    if (!hasParam { param -> param.has<SingleValue>() || param.has<PointerArray>() }) {
                        // Skip, we inject the Return alternative in these transforms
                        applyReturnValueTransforms(it)
                        generateAlternativeMethod(stripPostfix(), transforms)
                    }
                } else if (it.nativeType is CharSequenceType) {
                    // Remove any transform from the maxLength parameter
                    val maxLengthParam = getParam(hasReference<AutoSize>(it))
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
                } else {
                    check(!returns.isVoid)
                }
            } else if (it.has<AutoType>()) {
                // Generate AutoType alternatives

                val autoTypes = it.get<AutoType>()
                val bufferParam = paramMap[autoTypes.reference]!!

                // Disable AutoSize factor
                val autoSizeParam = getReferenceParam<AutoSize>(bufferParam.name)
                if (autoSizeParam != null)
                    transforms[autoSizeParam] = AutoSizeTransform(bufferParam, hasCustomJNI || hasUnsafeMethod, applyFactor = false)

                for (autoType in autoTypes.types) {
                    transforms[it] = AutoTypeParamTransform("${autoType.className}.${autoType.name}")
                    transforms[bufferParam] = AutoTypeTargetTransform(autoType.mapping)
                    generateAlternativeMethod(name, transforms)
                }

                transforms.remove(bufferParam)
                transforms.remove(it)
            }
        }

        // Apply any MultiType transformations.
        parameters.filter { it.has<MultiType>() }.let { params ->
            if (params.isEmpty())
                return@let

            check(params.groupBy { it.get<MultiType>().types.contentHashCode() }.size == 1) {
                "All MultiType modifiers in a function must have the same structure."
            }

            // Add the AutoSize transformation if we skipped it above
            getParams { it.has<AutoSize>() }.forEach {
                val autoSize = it.get<AutoSize>()
                transforms[it] = AutoSizeTransform(paramMap[autoSize.reference]!!, hasCustomJNI || hasUnsafeMethod)
            }

            var multiTypes = params.first().get<MultiType>().types.asSequence()
            if (params.any { it has optional })
                multiTypes = sequenceOf(PointerMapping.DATA_BYTE) + multiTypes

            for (autoType in multiTypes) {
                params.forEach {
                    // Transform the AutoSize parameter, if there is one
                    getReferenceParam<AutoSize>(it.name).let { autoSizeParam ->
                        if (autoSizeParam != null)
                            transforms[autoSizeParam] = AutoSizeTransform(it, hasCustomJNI || hasUnsafeMethod, autoType.byteShift)
                    }

                    transforms[it] = AutoTypeTargetTransform(autoType)
                }
                generateAlternativeMethod(name, transforms)
            }

            val singleValueParams = params.filter { it.has<SingleValue>() }
            if (singleValueParams.any()) {
                // Generate a SingleValue alternative for each type
                for (autoType in multiTypes) {
                    val primitiveType = autoType.box.toLowerCase()

                    // Generate type1, type2, type4 versions
                    // TODO: Make customizable? New modifier?
                    for (i in 1..4) {
                        if (i == 3) {
                            continue
                        }
                        singleValueParams.forEach {
                            // Transform the AutoSize parameter
                            val autoSizeParam = getParam(hasReference<AutoSize>(it)) // required
                            transforms[autoSizeParam] = ExpressionTransform("(1 << ${autoType.byteShift}) * $i")

                            val singleValue = it.get<SingleValue>()
                            transforms[it] = VectorValueTransform(autoType, primitiveType, singleValue.newName, i)
                        }
                        generateAlternativeMethod("$name$i${primitiveType[0]}", transforms)
                    }
                }

                singleValueParams.forEach {
                    transforms.remove(getParam(hasReference<AutoSize>(it)))
                }
            }

            params.forEach {
                getReferenceParam<AutoSize>(it.name).let { param ->
                    if (param != null)
                        transforms.remove(param)
                }

                transforms.remove(it)
            }
        }

        // Apply any PointerArray transformations.
        parameters.filter { it.has<PointerArray>() }.let { params ->
            if (params.isEmpty())
                return@let

            fun Parameter.getAutoSizeReference(): Parameter? = getParams {
                it.has<AutoSize> { reference == this@getAutoSizeReference.name }
            }.firstOrNull()

            // Array version
            params.forEach {
                val pointerArray = it.get<PointerArray>()

                val lengthsParam = paramMap[pointerArray.lengthsParam]
                if (lengthsParam != null)
                    transforms[lengthsParam] = PointerArrayLengthsTransform(it, true)

                val countParam = it.getAutoSizeReference()
                if (countParam != null)
                    transforms[countParam] = ExpressionTransform("${it.name}.length")

                transforms[it] = if (it === parameters.last { param ->
                    param !== lengthsParam && param !== countParam // these will be hidden, ignore
                }) PointerArrayTransformVararg else PointerArrayTransformArray
            }
            generateAlternativeMethod(name, transforms)

            // Combine PointerArrayTransformSingle with BufferValueReturnTransform
            getParams { it has ReturnParam }.forEach(::applyReturnValueTransforms)

            // Single value version
            params.forEach {
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
            params.forEach {
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
                getParams { param -> param has ReturnParam }.forEach(::applyReturnValueTransforms)

                // Transform the AutoSize parameter, if there is one
                getParams(hasReference<AutoSize>(it)).forEach { param ->
                    transforms[param] = Expression1Transform
                }

                val singleValue = it.get<SingleValue>()
                val pointerType = it.nativeType as PointerType<*>
                if (pointerType.elementType is StructType) {
                    transforms[it] = SingleValueStructTransform(singleValue.newName)
                } else {
                    transforms[it] = SingleValueTransform(
                        when (pointerType.elementType) {
                            is CharSequenceType   -> "CharSequence"
                            is WrappedPointerType -> pointerType.elementType.className
                            is StructType         -> it.javaMethodType
                            is PointerType<*>     -> "long"
                            else                  -> pointerType.elementType.javaMethodType
                        },
                        pointerType.mapping.box.toLowerCase(),
                        singleValue.newName
                    )
                }

                true
            }
        } != 0)
            generateAlternativeMethod(stripPostfix(), transforms)
    }

    private fun <T : QualifiedType> T.transformDeclarationOrElse(transforms: Map<QualifiedType, Transform>, original: String, annotate: Boolean): String? {
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
            else {
                val space = it.lastIndexOf(' ')
                "${nativeType.annotate(it.substring(0, space))} ${it.substring(space + 1)}"
            }
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

    private fun PrintWriter.generateAlternativeMethodSignature(
        name: String,
        transforms: Map<QualifiedType, Transform>,
        description: String? = null,
        constantMacro: Boolean
    ): String {
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
                        (it == null || (it as FunctionTransform<Parameter>).transformDeclaration(param, param.name)
                            .let { declaration -> declaration != null && declaration.endsWith(param.name) })
                    }
                }
            }
        }

        // Method signature

        val retType = returns.transformDeclarationOrElse(transforms, returns.javaMethodType, false)!!

        if ((returns.nativeType.isReference && returnsNull) || (transforms[returns].let { it is FunctionTransform<*> && it.forceNullable }) ) {
            println("$t@Nullable")
        }

        val retTypeAnnotation = returns.nativeType.annotation(retType)
        if (retTypeAnnotation != null) {
            println("$t$retTypeAnnotation")
        }

        print("$t${if (constantMacro) "private " else accessModifier}static $retType $name(")
        printList(getNativeParams(withAutoSizeResultParams = false)) { param ->
            param.transformDeclarationOrElse(transforms, param.asJavaMethodParam(false), true).let {
                if (
                    it != null && param.nativeType.isReference && param.has(nullable) &&
                    transforms[param] !is SingleValueTransform &&
                    transforms[param] !is SingleValueStructTransform
                ) {
                    "@Nullable $it"
                } else {
                    it
                }
            }
        }
        // Update Reuse delegation if the code below changes
        when (val returnTransform = transforms[returns]) {
            is MapPointerTransform         -> {
                if (returnTransform.useOldBuffer) {
                    if (parameters.isNotEmpty()) print(", ")
                    print("@Nullable ByteBuffer $MAP_OLD")
                }
            }
            is MapPointerExplicitTransform -> {
                var hasParams = parameters.isNotEmpty()
                if (returnTransform.addParam) {
                    if (hasParams) print(", ") else hasParams = true
                    print("long ${returnTransform.lengthParam}")
                }
                if (returnTransform.useOldBuffer) {
                    if (hasParams) print(", ")
                    print("@Nullable ByteBuffer $MAP_OLD")
                }
            }
        }
        if (returns.isStructValue) {
            if (parameters.isNotEmpty()) print(", ")
            print("${returns.nativeType.annotate(retType)} $RESULT")
        }
        println(") {")

        return retType
    }

    private fun PrintWriter.generateAlternativeMethod(
        name: String,
        transforms: Map<QualifiedType, Transform>,
        description: String? = null
    ) {
        println()

        val macro = has<Macro>()
        val retType = generateAlternativeMethodSignature(name, transforms, description, macro && get<Macro>().constant)

        if (has<Reuse>()) {
            print("$t$t")
            if (retType != "void") {
                print("return ")
            }
            print("${get<Reuse>().source.className}.$name(")
            printList(getNativeParams(withAutoSizeResultParams = false)) {
                it.transformDeclarationOrElse(transforms, it.name, false).let { name ->
                    name?.substring(name.lastIndexOf(' ') + 1)
                }
            }
            when (val returnTransform = transforms[returns]) {
                is MapPointerTransform         -> {
                    if (returnTransform.useOldBuffer) {
                        if (parameters.isNotEmpty()) print(", ")
                        print(MAP_OLD)
                    }
                }
                is MapPointerExplicitTransform -> {
                    var hasParams = parameters.isNotEmpty()
                    if (returnTransform.addParam) {
                        if (hasParams) print(", ") else hasParams = true
                        print(returnTransform.lengthParam)
                    }
                    if (returnTransform.useOldBuffer) {
                        if (hasParams) print(", ")
                        print(MAP_OLD)
                    }
                }
            }
            if (returns.isStructValue) {
                if (parameters.isNotEmpty()) print(", ")
                print(RESULT)
            }
            println(");\n$t}")
            return
        }

        // Append CodeFunctionTransform statements to Code

        val hasArrays = hasParam { it.nativeType is ArrayType<*> }
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
            .filter { it.key.let { qt -> qt is Parameter && qt.has<UseVariable>() } }
            .forEach {
                val param = it.key as Parameter
                @Suppress("UNCHECKED_CAST")
                val transform = it.value as FunctionTransform<Parameter>
                println("$t$t${param.asJavaMethodParam(false)} = ${transform.transformCall(param, param.name)};")
            }

        printCode(code.javaInit, true, hasArrays)
        if (Module.CHECKS && !macro)
            generateChecks(ALTERNATIVE, transforms)

        // Prepare stack parameters

        val stackTransforms = if (macro) emptySequence() else transforms.asSequence().filter { it.value is StackFunctionTransform<*> }
        val hideAutoSizeResultParam = this@Func.hideAutoSizeResultParam
        val hasStack = (hideAutoSizeResultParam || stackTransforms.any()) && !macro

        if (hasStack)
            println("$t${t}MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();")

        val hasFinally = hasStack || code.hasStatements(code.javaFinally, true, hasArrays)

        // Call the native method

        generateCodeBeforeNative(code, true, hasArrays, hasFinally)

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

        val returnLater = code.hasStatements(code.javaAfterNative, true, hasArrays) || transforms[returns] is ReturnLaterTransform
        generateNativeMethodCall(returnLater, hasFinally) {
            printList(getNativeParams()) {
                it.transformCallOrElse(transforms, it.asNativeMethodArgument(ALTERNATIVE))
            }
        }

        generateCodeAfterNative(code, true, hasArrays, hasFinally)

        // Return

        if (returns.isVoid || returns.isStructValue) {
            // TODO: struct value + custom transform?
            val result = returns.transformCallOrElse(transforms, "")
            if (result.isNotEmpty()) {
                println(if (hasFinally) result.replace(TRY_FINALLY_ALIGN, "$t$1") else result)
            } else if (returns.isStructValue)
                println("${if (hasFinally) "$t$t$t" else "$t$t"}return $RESULT;")
        } else {
            if (returns.nativeType is PointerType<*> && returns.nativeType.mapping !== PointerMapping.OPAQUE_POINTER) {
                if (hasFinally)
                    print(t)
                print("$t$t")

                val builder = StringBuilder()

                val isNullTerminated = returns.nativeType is CharSequenceType
                builder.append(
                    if (returns.nativeType.dereference is StructType) {
                        "${returns.nativeType.javaMethodType}.create"
                    } else {
                        "mem${if (isNullTerminated || returns.nativeType.elementType is VoidType)
                            "ByteBuffer"
                        else
                            returns.nativeType.mapping.javaMethodName}"
                    }
                )
                if (isNullTerminated) {
                    builder.append("NT${(returns.nativeType as CharSequenceType).charMapping.bytes}")
                } else if (returnsNull) {
                    builder.append("Safe")
                }

                builder.append("($RESULT")
                if (has<MapPointer>())
                    builder.append(", ${get<MapPointer>().sizeExpression}")
                else {
                    val hasAutoSizeResult = hasParam { it.has<AutoSizeResultParam>() }
                    if (!isNullTerminated || hasAutoSizeResult) {
                        if (hasAutoSizeResult) {
                            val params = getParams { it.has<AutoSizeResultParam>() }
                            val single = params.count() == 1
                            builder.append(", ${params.map { getAutoSizeResultExpression(single, it) }.joinToString(" * ")}")
                        } else {
                            check(returns.nativeType.dereference is StructType) {
                                "No AutoSizeResult parameter could be found."
                            }
                        }
                    }
                }
                builder.append(")")

                val returnExpression = returns.transformCallOrElse(transforms, builder.toString())
                if (returnExpression.indexOf('\n') == -1)
                    println("return $returnExpression;")
                else // Multiple statements, assumes the transformation includes the return statement.
                    println(returnExpression)
            } else if (returnLater) {
                if (hasFinally)
                    print(t)
                println(returns.transformCallOrElse(transforms, "$t${t}return $RESULT;"))
            }
        }

        generateCodeFinally(code, true, hasArrays, hasStack)

        println("$t}")
    }

    private fun PrintWriter.generateAlternativeMethodDelegate(
        name: String,
        transforms: Map<QualifiedType, Transform>,
        description: String? = null
    ) {
        println()

        generateAlternativeMethodSignature(name, transforms, description, has<Macro> { constant })

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
                t.transformCall(it, it.asNativeMethodArgument(ALTERNATIVE))
            else
                it.name
        }
        println(");")
        println("$t}")
    }

    // --[ JNI FUNCTIONS ]--

    internal fun generateFunctionDefinition(writer: PrintWriter) = writer.generateFunctionDefinitionImpl()
    private fun PrintWriter.generateFunctionDefinitionImpl() {
        print("typedef ${returns.toNativeType(nativeClass.binding)} (")
        if (nativeClass.callingConvention !== CallingConvention.DEFAULT)
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
        val hasArrays = hasParam { it.nativeType is ArrayType<*> }
        val hasCritical = false && nativeClass.binding?.apiCapabilities != APICapabilities.JNI_CAPABILITIES && !parameters.contains(JNI_ENV)
        if (hasCritical) {
            writer.generateFunctionImpl(hasArrays, hasCritical, critical = true)
        }
        writer.generateFunctionImpl(hasArrays, hasCritical, critical = false)
    }

    private fun PrintWriter.generateFunctionImpl(hasArrays: Boolean, hasCritical: Boolean, critical: Boolean) {
        val params = ArrayList<String>(4 + parameters.size)
        if (!critical)
            params.add("JNIEnv *$JNIENV, jclass clazz")
        getNativeParams(withExplicitFunctionAddress = false).map {
            if (it.nativeType is ArrayType<*>) {
                if (critical)
                    "jint ${it.name}__length, j${it.nativeType.mapping.primitive}* ${it.name}"
                else
                    "j${it.nativeType.mapping.primitive}Array ${it.name}$POINTER_POSTFIX"
            } else {
                "${it.nativeType.jniFunctionType} ${it.name}${if (it.nativeType is PointerType<*> || it.nativeType is StructType) POINTER_POSTFIX else ""}"
            }
        }.toCollection(params)
        if (hasFunctionAddressParam)
            params.add("jlong $FUNCTION_ADDRESS")
        if (returns.isStructValue && !hasParam { it has ReturnParam })
            params.add("jlong $RESULT")

        // Function signature

        print("JNIEXPORT${if (critical && workaroundJDK8167409()) "_CRITICAL" else ""} ${returns.jniFunctionType} JNICALL ${JNI_NAME(hasArrays, critical)}")
        println("(${if (params.isEmpty()) "void" else params.joinToString(", ")}) {")

        if (hasCritical && !(critical || hasArrays)) {
            // Unused parameter macro
            printUnusedParameters(false)

            print(t)
            if (!returns.isVoid && !returns.isStructValue)
                print("return ")

            print(JNI_NAME(hasArrays, critical = true, ignoreArrayType = true))
            print('(')

            params.clear()
            getNativeParams(withExplicitFunctionAddress = true, withJNIEnv = false)
                .mapTo(params) { "${it.name}${if (it.nativeType is PointerType<*> || it.nativeType is StructType) POINTER_POSTFIX else ""}" }
            if (hasFunctionAddressParam)
                params.add(FUNCTION_ADDRESS)
            if (returns.isStructValue && !hasParam { it has ReturnParam })
                params.add(RESULT)
            print(params.joinToString(", "))

            println(");")
            println("}")
            return
        }

        // Cast function address to pointer

        if (nativeClass.binding != null) {
            if (hasFunctionAddressParam) {
                println("$t${nativeName}PROC $nativeName = (${nativeName}PROC)(intptr_t)$FUNCTION_ADDRESS;")
            } else
                println("$t${nativeName}PROC $nativeName = (${nativeName}PROC)tlsGetFunction(${nativeClass.binding.getFunctionOrdinal(this@Func)});")
        }

        // Cast addresses to pointers

        if (!hasCritical || !hasArrays) {
            getNativeParams(withExplicitFunctionAddress = false)
                .filter { it.nativeType.castAddressToPointer }
                .forEach {
                    val variableType = if (it.nativeType === va_list)
                        "va_list *"
                    else
                        it.toNativeType(nativeClass.binding, pointerMode = true)

                    print(t)
                    if (it.nativeType is FunctionType && variableType.contains("(*)")) {
                        print(variableType.replace("(*)", "(*${it.name})"))
                    } else {
                        print(variableType)
                        if (!variableType.endsWith('*')) {
                            print(' ')
                        }
                        print(it.name)
                    }
                    println(
                        " = ${if (it.nativeType === va_list) {
                            "VA_LIST_CAST"
                        } else {
                            "($variableType)"
                        }
                        }${if (variableType != "intptr_t") "(intptr_t)" else ""}${it.name}$POINTER_POSTFIX;"
                    )
                }
        }

        // Custom code

        var code = if (has<Code>()) get() else Code.NO_CODE
        if (hasArrays) {
            if (!critical) {
                code = code.append(
                    nativeBeforeCall = getParams { it.nativeType is ArrayType<*> }.map {
                        "j${(it.nativeType.mapping as PointerMapping).primitive} *${it.name} = ${
                        "(*$JNIENV)->Get${(it.nativeType as PointerType<*>).mapping.box}ArrayElements($JNIENV, ${it.name}$POINTER_POSTFIX, NULL)".let { expression ->
                            if (it.has<Nullable>())
                                "${it.name}$POINTER_POSTFIX == NULL ? NULL : $expression"
                            else
                                expression
                        }};"
                    }.joinToString("\n$t", prefix = t),
                    nativeAfterCall = getParams { it.nativeType is ArrayType<*> }
                        .withIndex()
                        .sortedByDescending { it.index }
                        .map { it.value }
                        .map {
                            "(*$JNIENV)->Release${(it.nativeType as PointerType<*>).mapping.box}ArrayElements($JNIENV, ${it.name}$POINTER_POSTFIX, ${it.name}, 0);".let { expression ->
                                if (it.has<Nullable>())
                                    "if (${it.name} != NULL) { $expression }"
                                else
                                    expression
                            }
                        }.joinToString("\n$t", prefix = t)
                )
            }
            if (hasCritical) {
                val callPrefix = if (!returns.isVoid && !returns.isStructValue) {
                    if (critical) "return " else "$RESULT = "
                } else {
                    ""
                }
                code = code.append(
                    nativeCall = "$t$callPrefix${JNI_NAME(hasArrays = true, critical = true, ignoreArrayType = true)}(${getNativeParams()
                        .map {
                            if (it.nativeType is ArrayType<*>)
                                "(intptr_t)${it.name}"
                            else
                                "${it.name}${if (it.nativeType is PointerType<*> || it.nativeType is StructType) POINTER_POSTFIX else ""}"
                        }
                        .joinToString(", ")
                    }${if (returns.isStructValue) ", $RESULT" else ""});"
                )
            }
        }

        if (code.nativeAfterCall != null && !returns.isVoid && !returns.isStructValue)
            println("$t${returns.jniFunctionType} $RESULT;")

        code.nativeBeforeCall.let { if (it != null) println(it) }

        // Unused parameter macro

        printUnusedParameters(critical)

        // Call native function

        code.nativeCall.let { call ->
            if (call != null)
                println(call)
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
                    if (returns.jniFunctionType != returns.nativeType.name)
                        print("(${returns.jniFunctionType})")
                    if (returns.nativeType is PointerType<*> && nativeClass.binding == null)
                        print("(intptr_t)")
                    if (has<Address>())
                        print('&')
                }
                if (parameters.isNotEmpty() && parameters[0] === JNI_ENV && nativeClass.className == "JNINativeInterface")
                    print("(*$JNIENV)->")
                print(nativeName)
                if (!has<Macro> { !function }) print('(')
                printList(getNativeParams(withExplicitFunctionAddress = false, withJNIEnv = true)) { param ->
                    param.nativeType.let {
                        if (it is StructType || it === va_list)
                            "*${param.name}"
                        else if (!it.castAddressToPointer) {
                            val nativeType = param.toNativeType(nativeClass.binding)
                            if (nativeType != it.jniFunctionType && "j$nativeType" != it.jniFunctionType)
                                "($nativeType)${param.name}" // Avoid implicit cast warnings
                            else
                                param.name
                        } else
                            param.name
                    }
                }
                if (!has<Macro> { !function }) print(')')
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
    }

    private fun workaroundJDK8167409(ignoreArrayType: Boolean = false): Boolean = parameters.size.let {
        6 <= it || (5 <= it && returns.isStructValue && !hasParam { param -> param has ReturnParam })
    } && parameters[0].nativeType.let { type ->
        (type is PointerType<*> && (ignoreArrayType || type !is ArrayType<*>)) || type.mapping.let { it is PrimitiveMapping && 4 < it.bytes }
    }

    private fun JNI_NAME(hasArrays: Boolean, critical: Boolean, ignoreArrayType: Boolean = false): String {
        return "${nativeClass.nativeFileNameJNI}_${if (isNativeOnly) "" else "n"}${name.asJNIName}${if (nativeClass.module.arrayOverloads && (hasArrays || hasArrayOverloads))
            getNativeParams(withExplicitFunctionAddress = false)
                .map {
                    if (it.nativeType is ArrayType<*> && !(critical && ignoreArrayType))
                        it.nativeType.jniSignatureArray
                    else
                        it.nativeType.jniSignatureStrict
                }
                .joinToString(
                    "",
                    prefix = "__",
                    postfix = "J".repeat((if (returns.isStructValue) 1 else 0) + (if (hasFunctionAddressParam) 1 else 0))
                )
        else
            ""
        }".let {
            if (critical) {
                if (workaroundJDK8167409(ignoreArrayType))
                    "CRITICAL($it)"
                else
                    "JavaCritical_$it"
            } else {
                "Java_$it"
            }
        }
    }

    private fun PrintWriter.printUnusedParameters(critical: Boolean) {
        if (!critical)
            println(
                if (parameters.contains(JNI_ENV) || (nativeClass.binding != null && !hasFunctionAddressParam))
                    "${t}UNUSED_PARAM(clazz)"
                else
                    "${t}UNUSED_PARAMS($JNIENV, clazz)"
            )
        else
            getParams { it.nativeType is ArrayType<*> }.forEach {
                println("${t}UNUSED_PARAM(${it.name}__length)")
            }
    }

}