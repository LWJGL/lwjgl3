/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openxr

import org.lwjgl.generator.*
import openxr.XRFunctionType.*
import java.io.*

private val NativeClass.capName: String
    get() = if (templateName.startsWith(prefix)) {
        if (prefix == "XR")
            "OpenXR${templateName.substring(2)}"
        else
            templateName
    } else {
        "${prefixTemplate}_$templateName"
    }

private enum class XRFunctionType {
    PROC,
    GLOBAL,
    INSTANCE
}

private val Func.type: XRFunctionType
    get() = when {
        name == "xrGetInstanceProcAddr"                 -> PROC // dlsym/GetProcAddress
        parameters[0].nativeType !is WrappedPointerType -> GLOBAL // xrGetInstanceProcAddr: XR_NULL_HANDLE
        else                                            -> INSTANCE // xrGetDeviceProcAddr: instance handle
    }

private val Func.isInstanceFunction get() = type === INSTANCE && !has<Macro>()

private val EXTENSION_NAME = "[A-Za-z0-9_]+".toRegex()

private fun getFunctionDependencyExpression(func: Func) = func.get<DependsOn>()
    .reference
    .let { expression ->
        if (EXTENSION_NAME.matches(expression))
            "ext.contains(\"$expression\")"
        else
            expression
    }

private fun PrintWriter.printCheckFunctions(
    nativeClass: NativeClass,
    commands: Map<String, Int>,
    dependencies: LinkedHashMap<String, Int>,
    filter: (Func) -> Boolean
) {
    print("checkFunctions(provider, caps, new int[] {")
    nativeClass.printPointers(this, { func ->
        val index = commands[func.name]
        if (func.has<DependsOn>()) {
            "flag${dependencies[getFunctionDependencyExpression(func)]} + $index"
        } else{
            index.toString()
        }
    }, filter)
    print("},")
    nativeClass.printPointers(this, { "\"${it.name}\"" }, filter)
    print(")")
}

val XR_BINDING_INSTANCE = Generator.register(object : APIBinding(Module.OPENXR, "XRCapabilities", APICapabilities.PARAM_CAPABILITIES) {

    override fun shouldCheckFunctionAddress(function: Func): Boolean = function.nativeClass.templateName != "XR10"

    override fun generateFunctionAddress(writer: PrintWriter, function: Func) {
        writer.print("$t${t}long $FUNCTION_ADDRESS = ")
        writer.println(if (function.has<Capabilities>())
            "${function.get<Capabilities>().expression}.${function.name};"
        else
            "${function.getParams { it.nativeType is WrappedPointerType }.first().name}.getCapabilities().${function.name};"
        )
    }

    private fun PrintWriter.checkExtensionFunctions(nativeClass: NativeClass, commands: Map<String, Int>) {
        val capName = nativeClass.capName

        print("""
    private static boolean check_${nativeClass.templateName}(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("$capName")) {
            return false;
        }""")

        val dependencies = nativeClass.functions
            .filter { it.isInstanceFunction && it.has<DependsOn>() }
            .map(::getFunctionDependencyExpression)
            .foldIndexed(LinkedHashMap<String, Int>()) { index, map, expression ->
                if (!map.containsKey(expression)) {
                    map[expression] = index
                }
                map
            }
        if (dependencies.isNotEmpty()) {
            println()
            dependencies.forEach { (expression, index) ->
                print("\n$t${t}int flag$index = $expression ? 0 : Integer.MIN_VALUE;")
            }
        }

        print("\n\n$t${t}return ")
        printCheckFunctions(nativeClass, commands, dependencies) { it.isInstanceFunction }
        println(" || reportMissing(\"XR\", \"$capName\");")
        println("$t}")
    }

    init {
        javaImport("static org.lwjgl.system.Checks.*")

        documentation = "Defines the capabilities of an OpenXR {@code XrInstance}."
    }

    override fun PrintWriter.generateJava() {
        generateJavaPreamble()
        println("@SuppressWarnings(\"SimplifiableIfStatement\")")
        println("public class XRCapabilities {")

        val classes = super.getClasses("XR")

        val instanceCommands = LinkedHashMap<String, Int>()
        classes.asSequence()
            .filter { it.hasNativeFunctions }
            .forEach {
                val functions = it.functions.asSequence()
                    .filter { cmd ->
                        if (cmd.isInstanceFunction) {
                            if (!instanceCommands.contains(cmd.name)) {
                                instanceCommands[cmd.name] = instanceCommands.size
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

        println(
            """
    /** The OpenXR API version number. */
    public final long apiVersion;
"""
        )

        classes
            .forEach {
                println(it.getCapabilityJavadoc())
                println("${t}public final boolean ${it.capName};")
            }

        print(
            """
    XRCapabilities(FunctionProvider provider, long apiVersion, Set<String> ext) {
        this.apiVersion = apiVersion;

        long[] caps = new long[${instanceCommands.size}];
"""
        )

        classes.forEach {
            val capName = it.capName
            if (it.functions.any { func -> func.isInstanceFunction }) {
                print("\n$t$t$capName = check_${it.templateName}(provider, caps, ext);")
            } else {
                print("\n$t$t$capName = ext.contains(\"$capName\");")
            }
        }

        println()
        instanceCommands.forEach { (it, index) ->
            print("\n$t$t$it = caps[$index];")
        }

        print(
            """
    }
""")

        for (extension in classes) {
            if (extension.functions.any { it.isInstanceFunction }) {
                checkExtensionFunctions(extension, instanceCommands)
            }
        }

        println("\n}")
    }

})

// DSL Extensions

val GlobalCommand = Capabilities("XR.getGlobalCommands()")

fun String.nativeClassXR(
    templateName: String,
    type: String,
    prefix: String = "XR",
    prefixMethod: String = prefix.lowercase(),
    postfix: String = "",
    init: (NativeClass.() -> Unit)? = null
): NativeClass {
    check(type == "instance")
    return nativeClass(
        Module.OPENXR,
        templateName,
        prefix = prefix,
        prefixMethod = prefixMethod,
        postfix = postfix,
        binding = XR_BINDING_INSTANCE,
        init = init
    )
}