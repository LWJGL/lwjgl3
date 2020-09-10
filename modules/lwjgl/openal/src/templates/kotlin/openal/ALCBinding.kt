/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal

import org.lwjgl.generator.*
import java.io.*

fun NativeClass.capName(core: String) =
    if (templateName.startsWith(prefixTemplate)) {
        if (prefix == core)
            "Open$core${templateName.substring(core.length)}"
        else
            templateName
    } else {
        "${prefixTemplate}_$templateName"
    }

private val NativeClass.isCore: Boolean get() = templateName.startsWith("ALC")

private const val ALC_CAP_CLASS = "ALCCapabilities"

val ALCBinding = Generator.register(object : APIBinding(
    Module.OPENAL,
    ALC_CAP_CLASS,
    APICapabilities.JAVA_CAPABILITIES
) {

    private val classes by lazy { super.getClasses("ALC") }

    private val functions by lazy {
        classes.getFunctionPointers {
            it.hasNativeFunctions && it.prefix == "ALC"
        }
    }

    private val functionOrdinals by lazy {
        LinkedHashMap<String, Int>().also { functionOrdinals ->
            classes.asSequence()
                .filter { it.hasNativeFunctions && it.prefix == "ALC" }
                .forEach {
                    it.functions.asSequence()
                        .forEach { cmd ->
                            if (!cmd.has<Macro>() && !functionOrdinals.contains(cmd.name)) {
                                functionOrdinals[cmd.name] = functionOrdinals.size
                            }
                        }
                }
        }
    }

    override fun shouldCheckFunctionAddress(function: Func): Boolean = function.nativeClass.templateName != "ALC10"

    override fun generateFunctionAddress(writer: PrintWriter, function: Func) {
        writer.println("\t\tlong $FUNCTION_ADDRESS = ALC.getICD().${function.name};")
    }

    private fun PrintWriter.printCheckFunctions(
        nativeClass: NativeClass,
        filter: (Func) -> Boolean
    ) {
        print("checkFunctions(provider, device, caps, new int[] {")
        nativeClass.printPointers(this, { func -> functionOrdinals[func.name].toString() }, filter)
        print("},")
        nativeClass.printPointers(this, { "\"${it.name}\"" }, filter)
        print(")")
    }

    private fun PrintWriter.checkExtensionFunctions(nativeClass: NativeClass) {
        val capName = nativeClass.capName("ALC")

        print(
            """
    private static boolean check_${nativeClass.templateName}(FunctionProviderLocal provider, long device, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("$capName")) {
            return false;
        }"""
        )

        print("\n\n$t${t}return ")
        printCheckFunctions(nativeClass) { !it.has(IgnoreMissing) }
        println(" || reportMissing(\"ALC\", \"$capName\");")
        println("$t}")
    }

    init {
        javaImport(
            "org.lwjgl.*",
            "java.util.function.IntFunction",
            "static org.lwjgl.system.Checks.*"
        )

        documentation = "Defines the capabilities of the OpenAL Context API."
    }

    override fun PrintWriter.generateJava() {
        generateJavaPreamble()
        println("public final class $ALC_CAP_CLASS {")

        val functionSet = LinkedHashSet<String>()
        classes.asSequence()
            .filter { it.hasNativeFunctions && it.prefix == "ALC" }
            .forEach {
                val functions = it.functions.asSequence()
                    .filter { cmd ->
                        if (!cmd.has<Macro>()) {
                            if (functionSet.add(cmd.name)) {
                                return@filter true
                            }
                        }
                        false
                    }
                    .joinToString(",\n$t$t") { cmd -> cmd.name }

                if (functions.isNotEmpty()) {
                    println("\n$t// ${it.templateName}")
                    println("${t}public final long")
                    println("$t$t$functions;")
                }
            }

        println()

        classes.forEach {
            println(it.getCapabilityJavadoc())
            println("${t}public final boolean ${it.capName("ALC")};")
        }

        print(
            """
    /** Device handle. */
    final long device;

    /** Off-heap array of the above function addresses. */
    final PointerBuffer addresses;

    $ALC_CAP_CLASS(FunctionProviderLocal provider, long device, Set<String> ext, IntFunction<PointerBuffer> bufferFactory) {
        this.device = device;

        PointerBuffer caps = bufferFactory.apply(${functions.size});
"""
        )

        for (extension in classes) {
            val capName = extension.capName("ALC")
            print(
                if (extension.hasNativeFunctions && extension.prefix == "ALC")
                    "\n$t$t$capName = check_${extension.templateName}(provider, device, caps, ext);"
                else
                    "\n$t$t$capName = ext.contains(\"$capName\");"
            )
        }

        println()
        functionOrdinals.forEach { (it, index) ->
            print("\n$t$t$it = caps.get($index);")
        }

        print(
            """

        addresses = ThreadLocalUtil.setupAddressBuffer(caps);
    }

    /** Returns the buffer of OpenAL function pointers. */
    public PointerBuffer getAddressBuffer() {
        return addresses;
    }
"""
        )

        for (extension in classes) {
            if (extension.hasNativeFunctions && extension.prefix == "ALC") {
                checkExtensionFunctions(extension)
            }
        }

        println("\n}")
    }

})

// DSL Extensions

fun String.nativeClassALC(templateName: String, prefix: String = "ALC", postfix: String = "", init: (NativeClass.() -> Unit)? = null) =
    nativeClass(Module.OPENAL, templateName, prefix = prefix, prefixTemplate = "ALC", postfix = postfix, binding = ALCBinding, init = init)