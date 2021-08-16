/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package vulkan

import org.lwjgl.generator.*
import vulkan.VKFunctionType.*
import java.io.*

private val NativeClass.capName: String
    get() = if (templateName.startsWith(prefix)) {
        if (prefix == "VK")
            "Vulkan${templateName.substring(2)}"
        else
            templateName
    } else {
        "${prefixTemplate}_$templateName"
    }

private const val CAPS_INSTANCE = "VKCapabilitiesInstance"
private const val CAPS_DEVICE = "VKCapabilitiesDevice"

private val EXTENSION_TYPES = HashMap<String, String>()

private enum class VKFunctionType {
    PROC,
    GLOBAL,
    INSTANCE,
    DEVICE
}

private val Func.type: VKFunctionType
    get() = when {
        name == "vkGetInstanceProcAddr"                 -> PROC // dlsym/GetProcAddress
        parameters[0].nativeType !is WrappedPointerType -> GLOBAL // vkGetInstanceProcAddr: VK_NULL_HANDLE
        parameters[0].nativeType.let {
            it === VkInstance || it === VkPhysicalDevice
        }                                               -> INSTANCE // vkGetInstanceProcAddr: instance handle
        else                                            -> DEVICE // vkGetDeviceProcAddr: device handle
    }

private val Func.isInstanceFunction get() = type === INSTANCE && !has<Macro>()
private val Func.isDeviceFunction get() = type === DEVICE && !has<Macro>()

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

val VK_BINDING_INSTANCE = Generator.register(object : APIBinding(
    Module.VULKAN,
    CAPS_INSTANCE,
    APICapabilities.PARAM_CAPABILITIES
) {

    override fun shouldCheckFunctionAddress(function: Func): Boolean = function.nativeClass.templateName != "VK10"

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
        println(" || reportMissing(\"VK\", \"$capName\");")
        println("$t}")
    }

    init {
        javaImport("static org.lwjgl.system.Checks.*")

        documentation = "Defines the capabilities of a Vulkan {@code VkInstance}."
    }

    override fun PrintWriter.generateJava() {
        generateJavaPreamble()
        println("@SuppressWarnings(\"SimplifiableIfStatement\")")
        println("public class $CAPS_INSTANCE {")

        val classes = super.getClasses("VK")

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
    /** The Vulkan API version number. */
    public final int apiVersion;
"""
        )

        classes
            .filter { EXTENSION_TYPES[it.templateName] ?: "instance" == "instance" }
            .forEach {
                println(it.getCapabilityJavadoc())
                println("${t}public final boolean ${it.capName};")
            }

        print(
            """
    $CAPS_INSTANCE(FunctionProvider provider, int apiVersion, Set<String> ext, Set<String> deviceExt) {
        this.apiVersion = apiVersion;

        long[] caps = new long[${instanceCommands.size}];
"""
        )

        classes.forEach {
            val capName = it.capName
            val hasFlag = EXTENSION_TYPES[it.templateName] == "instance" || it.templateName.startsWith("VK")
            if (it.functions.any { func -> func.isInstanceFunction }) {
                print(
                    if (hasFlag)
                        "\n$t$t$capName = check_${it.templateName}(provider, caps, ext);"
                    else
                        "\n$t${t}check_${it.templateName}(provider, caps, deviceExt);"
                )
            } else if (hasFlag) {
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

val VK_BINDING_DEVICE = Generator.register(object : GeneratorTarget(Module.VULKAN, CAPS_DEVICE) {

    private fun PrintWriter.checkExtensionFunctions(nativeClass: NativeClass, commands: Map<String, Int>) {
        val capName = nativeClass.capName

        val isDeviceExtension = EXTENSION_TYPES[nativeClass.templateName] == "device" || nativeClass.templateName.startsWith("VK")
        val hasDependencies = nativeClass.functions.any { it.has<DependsOn>() }
        print("""
    private static boolean check_${nativeClass.templateName}(FunctionProvider provider, long[] caps""")
        if (isDeviceExtension || hasDependencies) {
            print(", Set<String> ext")
        } else if (!isDeviceExtension) {
            print(", VKCapabilitiesInstance capsInstance")
        }
        print(""") {
        if (!${if (isDeviceExtension) {
            "ext.contains(\"$capName\")"
        } else {
            "capsInstance.$capName"
        }}) {
            return false;
        }""")

        val dependencies = nativeClass.functions
            .filter { it.isDeviceFunction && it.has<DependsOn>() }
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
        printCheckFunctions(nativeClass, commands, dependencies) { it.isDeviceFunction }
        println(" || reportMissing(\"VK\", \"$capName\");")
        println("$t}")
    }

    init {
        javaImport(
            "java.util.*",
            "org.lwjgl.system.*",

            "static org.lwjgl.system.Checks.*"
        )

        documentation = "Defines the capabilities of a Vulkan {@code VkDevice}."
    }

    override fun PrintWriter.generateJava() {
        generateJavaPreamble()
        println("@SuppressWarnings(\"SimplifiableIfStatement\")")
        println("public class $CAPS_DEVICE {")

        val classes = VK_BINDING_INSTANCE.getClasses("VK")

        val deviceCommands = LinkedHashMap<String, Int>()
        classes.asSequence()
            .filter { it.hasNativeFunctions }
            .forEach {
                val functions = it.functions.asSequence()
                    .filter { cmd ->
                        if (cmd.type === DEVICE && !cmd.has<Macro>()) {
                            if (!deviceCommands.contains(cmd.name)) {
                                deviceCommands[cmd.name] = deviceCommands.size
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
    /** The Vulkan API version number. */
    public final int apiVersion;
"""
        )

        classes
            .filter { EXTENSION_TYPES[it.templateName] ?: "device" == "device" }
            .forEach {
            println(it.getCapabilityJavadoc())
            println("${t}public final boolean ${it.capName};")
        }

        print(
            """
    $CAPS_DEVICE(FunctionProvider provider, VKCapabilitiesInstance capsInstance, int apiVersion, Set<String> ext) {
        this.apiVersion = apiVersion;

        long[] caps = new long[${deviceCommands.size}];
"""
        )

        classes.forEach {
            val capName = it.capName
            val hasFlag = EXTENSION_TYPES[it.templateName] == "device" || it.templateName.startsWith("VK")
            if (it.functions.any { func -> func.isDeviceFunction }) {
                print(
                    if (hasFlag)
                        "\n$t$t$capName = check_${it.templateName}(provider, caps, ext);"
                    else
                        "\n$t${t}check_${it.templateName}(provider, caps, capsInstance);"
                )
            } else if (hasFlag) {
                print("\n$t$t$capName = ext.contains(\"$capName\");")
            }
        }

        println()
        deviceCommands.forEach { (it, index) ->
            print("\n$t$t$it = caps[$index];")
        }

        print(
            """
    }
""")

        for (extension in classes) {
            if (extension.functions.any { it.isDeviceFunction }) {
                checkExtensionFunctions(extension, deviceCommands)
            }
        }

        println("\n}")
    }

})

// DSL Extensions

val GlobalCommand = Capabilities("VK.getGlobalCommands()")

fun String.nativeClassVK(
    templateName: String,
    type: String,
    prefix: String = "VK",
    prefixMethod: String = prefix.lowercase(),
    postfix: String = "",
    init: (NativeClass.() -> Unit)? = null
): NativeClass {
    EXTENSION_TYPES[templateName] = type
    return nativeClass(
        Module.VULKAN,
        templateName,
        prefix = prefix,
        prefixMethod = prefixMethod,
        postfix = postfix,
        binding = VK_BINDING_INSTANCE,
        init = init
    )
}