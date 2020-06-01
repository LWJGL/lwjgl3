/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl

import org.lwjgl.generator.*
import java.io.*

private const val CAPABILITIES_CLASS = "WGLCapabilities"

val WGLBinding = Generator.register(object : APIBinding(
    Module.OPENGL,
    CAPABILITIES_CLASS,
    APICapabilities.JAVA_CAPABILITIES
) {

    private val classes by lazy { super.getClasses("WGL") }

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

    override fun generateFunctionAddress(writer: PrintWriter, function: Func) {
        writer.println("$t${t}long $FUNCTION_ADDRESS = GL.getCapabilitiesWGL().${function.name};")
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
        val capName = nativeClass.capName

        print("""
    private static boolean check_${nativeClass.templateName}(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("$capName")) {
            return false;
        }""")

        print("\n\n$t${t}return ")
        printCheckFunctions(nativeClass) { it-> !it.has(IgnoreMissing) }
        println(" || reportMissing(\"WGL\", \"$capName\");")
        println("$t}")
    }

    init {
        javaImport(
            "static org.lwjgl.system.APIUtil.*",
            "static org.lwjgl.system.Checks.*"
        )

        documentation = "Defines the WGL capabilities of an OpenGL device."
    }

    override fun PrintWriter.generateJava() {
        generateJavaPreamble()
        println("public final class $CAPABILITIES_CLASS {")

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
            println("${t}public final boolean ${it.capName};")
        }

        print("""
    $CAPABILITIES_CLASS(FunctionProvider provider, Set<String> ext) {
        long[] caps = new long[${functions.size}];
""")

        for (extension in classes) {
            val capName = extension.capName
            print(
                if (extension.hasNativeFunctions)
                    "\n$t$t$capName = check_${extension.templateName}(provider, caps, ext);"
                else
                    "\n$t$t$capName = ext.contains(\"$capName\");"
            )
        }

        println()
        functionOrdinals.forEach { (it, index) ->
            print("\n$t$t$it = caps[$index];")
        }
        print("""
    }
""")

        for (extension in classes) {
            if (!extension.hasNativeFunctions) {
                continue
            }

            checkExtensionFunctions(extension)
        }

        println("\n}")
    }

})

fun String.nativeClassWGL(templateName: String, postfix: String = "", init: (NativeClass.() -> Unit)? = null) = nativeClass(
    Module.OPENGL,
    templateName,
    prefix = "WGL",
    postfix = postfix,
    binding = WGLBinding,
    init = init
)