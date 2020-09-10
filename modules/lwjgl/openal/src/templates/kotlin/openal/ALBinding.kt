/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal

import org.lwjgl.generator.*
import java.io.*

private const val CAPABILITIES_CLASS = "ALCapabilities"

private val ALBinding = Generator.register(object : APIBinding(
    Module.OPENAL,
    CAPABILITIES_CLASS,
    APICapabilities.JAVA_CAPABILITIES
) {

    private val classes by lazy { super.getClasses("AL") }

    private val functions by lazy { classes.getFunctionPointers() }

    private val functionOrdinals by lazy {
        LinkedHashMap<String, Int>().also { functionOrdinals ->
            classes.asSequence()
                .filter { it.hasNativeFunctions }
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

    override fun shouldCheckFunctionAddress(function: Func): Boolean = function.nativeClass.templateName != "AL10"

    override fun generateFunctionAddress(writer: PrintWriter, function: Func) {
        writer.println("$t${t}long $FUNCTION_ADDRESS = AL.getICD().${function.name};")
    }

    private fun PrintWriter.printCheckFunctions(
        nativeClass: NativeClass,
        filter: (Func) -> Boolean
    ) {
        print("checkFunctions(provider, caps, new int[] {")
        nativeClass.printPointers(this, { func -> functionOrdinals[func.name].toString() }, filter)
        print("},")
        nativeClass.printPointers(this, { "\"${it.name}\"" }, filter)
        print(")")
    }

    private fun PrintWriter.checkExtensionFunctions(nativeClass: NativeClass) {
        val capName = nativeClass.capName("AL")

        print("""
    private static boolean check_${nativeClass.templateName}(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("$capName")) {
            return false;
        }""")

        print("\n\n$t${t}return ")
        printCheckFunctions(nativeClass) { !it.has(IgnoreMissing) }
        println(" || reportMissing(\"AL\", \"$capName\");")
        println("$t}")
    }

    init {
        javaImport(
            "org.lwjgl.*",
            "java.util.function.IntFunction",
            "static org.lwjgl.system.APIUtil.*",
            "static org.lwjgl.system.Checks.*"
        )

        documentation = "Defines the capabilities of an OpenAL context."
    }

    override fun PrintWriter.generateJava() {
        generateJavaPreamble()
        println("""public final class $CAPABILITIES_CLASS {""")

        val functionSet = LinkedHashSet<String>()
        classes.asSequence()
            .filter { it.hasNativeFunctions }
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
            println("${t}public final boolean ${it.capName("AL")};")
        }

        print("""
    /** Off-heap array of the above function addresses. */
    final PointerBuffer addresses;

    $CAPABILITIES_CLASS(FunctionProvider provider, Set<String> ext, IntFunction<PointerBuffer> bufferFactory) {
        PointerBuffer caps = bufferFactory.apply(${functions.size});
""")

        for (extension in classes) {
            val capName = extension.capName("AL")
            print(
                if (extension.hasNativeFunctions)
                    "\n$t$t$capName = check_${extension.templateName}(provider, caps, ext);"
                else
                    "\n$t$t$capName = ext.contains(\"$capName\");"
            )
        }

        println()
        functionOrdinals.forEach { (it, index) ->
            print("\n$t$t$it = caps.get($index);")
        }

        print("""

        addresses = ThreadLocalUtil.setupAddressBuffer(caps);
    }

    /** Returns the buffer of OpenAL function pointers. */
    public PointerBuffer getAddressBuffer() {
        return addresses;
    }
""")

        for (extension in classes) {
            if (extension.hasNativeFunctions) {
                checkExtensionFunctions(extension)
            }
        }

        println("\n}")
    }

})

// DSL Extensions

fun String.nativeClassAL(templateName: String, prefixTemplate: String = "AL", postfix: String = "", init: (NativeClass.() -> Unit)? = null) =
    nativeClass(Module.OPENAL, templateName, prefix = "AL", prefixTemplate = prefixTemplate, postfix = postfix, binding = ALBinding, init = init)

val NativeClass.specLinkOpenALSoft: String get() = url("http://kcat.strangesoft.net/openal-extensions/$templateName.txt", templateName)
val NativeClass.extensionName: String get() = "{@code ${prefixTemplate}_$templateName}"