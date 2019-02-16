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

    override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
        if (nativeClass.functions.any { it.isInstanceFunction }) {
            print("""
    static boolean checkCapsInstance(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("${nativeClass.capName}") && VK.checkExtension("${nativeClass.capName}",""")
            nativeClass.functions
                .filter { it.isInstanceFunction }
                .forEachIndexed { index, it ->
                    print("\n$t$t$t${if (index == 0) "   " else "&& "}VK.isSupported(provider, \"${it.name}\", caps")
                    if (it.has<DependsOn>()) {
                        print(", ${it.get<DependsOn>().reference.let { if (EXTENSION_NAME.matches(it)) "ext.contains(\"$it\")" else it }}")
                    }
                    print(")")
                }
            println("""
        );
    }""")
        }

        if (nativeClass.functions.any { it.isDeviceFunction }) {
            val isDeviceExtension = EXTENSION_TYPES[nativeClass.templateName] == "device" || nativeClass.templateName.startsWith("VK")
            val hasDependencies = nativeClass.functions.any { it.has<DependsOn>() }
            print("""
    static boolean checkCapsDevice(FunctionProvider provider, java.util.Map<String, Long> caps""")
            if (isDeviceExtension || hasDependencies) {
                print(", java.util.Set<String> ext")
            } else if (!isDeviceExtension) {
                print(", VKCapabilitiesInstance capsInstance")
            }
            print(""") {
        return """)
            if (isDeviceExtension) {
                print("ext.contains(\"${nativeClass.capName}\")")
            } else {
                print("capsInstance.${nativeClass.capName}")
            }
            print(""" && VK.checkExtension("${nativeClass.capName}",""")
            nativeClass.functions
                .filter { it.isDeviceFunction }
                .forEachIndexed { index, it ->
                    print("\n$t$t$t${if (index == 0) "   " else "&& "}VK.isSupported(provider, \"${it.name}\", caps")
                    if (it.has<DependsOn>()) {
                        print(", ${it.get<DependsOn>().reference.let { if (EXTENSION_NAME.matches(it)) "ext.contains(\"$it\")" else it }}")
                    }
                    print(")")
                }
            println("""
        );
    }""")
        }
    }

    init {
        javaImport("java.util.*")

        documentation = "Defines the capabilities of a Vulkan {@code VkInstance}."
    }

    override fun PrintWriter.generateJava() {
        generateJavaPreamble()
        println("public class $CAPS_INSTANCE {")

        val classes = super.getClasses("VK")

        val instanceCommands = LinkedHashSet<String>()
        classes.asSequence()
            .filter { it.hasNativeFunctions }
            .forEach {
                val functions = it.functions.asSequence()
                    .filter { cmd ->
                        if (cmd.isInstanceFunction) {
                            if (!instanceCommands.contains(cmd.name)) {
                                instanceCommands.add(cmd.name)
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

        Map<String, Long> caps = new HashMap<>(${instanceCommands.size});
"""
        )

        classes.forEach {
            val capName = it.capName
            val hasFlag = EXTENSION_TYPES[it.templateName] == "instance" || it.templateName.startsWith("VK")
            if (it.functions.any { it.isInstanceFunction }) {
                print(
                    if (hasFlag)
                        "\n$t$t$capName = ${it.className}.checkCapsInstance(provider, caps, ext);"
                    else
                        "\n$t$t${it.className}.checkCapsInstance(provider, caps, deviceExt);"
                )
            } else if (hasFlag) {
                print("\n$t$t$capName = ext.contains(\"$capName\");")
            }
        }

        println()
        instanceCommands.forEach {
            print("\n$t$t$it = VK.get(caps, \"$it\");")
        }

        println(
            """
    }

}"""
        )
    }

})

val VK_BINDING_DEVICE = Generator.register(object : GeneratorTarget(Module.VULKAN, CAPS_DEVICE) {

    init {
        javaImport(
            "java.util.*",
            "org.lwjgl.system.*"
        )

        documentation = "Defines the capabilities of a Vulkan {@code VkDevice}."
    }

    override fun PrintWriter.generateJava() {
        generateJavaPreamble()
        println("public class $CAPS_DEVICE {")

        val classes = VK_BINDING_INSTANCE.getClasses("VK")

        val deviceCommands = LinkedHashSet<String>()
        classes.asSequence()
            .filter { it.hasNativeFunctions }
            .forEach {
                val functions = it.functions.asSequence()
                    .filter {
                        if (it.type === DEVICE && !it.has<Macro>()) {
                            if (!deviceCommands.contains(it.name)) {
                                deviceCommands.add(it.name)
                                return@filter true
                            }
                        }
                        false
                    }
                    .joinToString(",\n$t$t") {
                        it.name
                    }

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
    $CAPS_DEVICE(FunctionProvider provider, VKCapabilitiesInstance capsInstance, Set<String> ext) {
        this.apiVersion = capsInstance.apiVersion;

        Map<String, Long> caps = new HashMap<>(${deviceCommands.size});
"""
        )

        classes.forEach {
            val capName = it.capName
            val hasFlag = EXTENSION_TYPES[it.templateName] == "device" || it.templateName.startsWith("VK")
            if (it.functions.any { it.isDeviceFunction }) {
                print(
                    if (hasFlag)
                        "\n$t$t$capName = ${it.className}.checkCapsDevice(provider, caps, ext);"
                    else
                        "\n$t$t${it.className}.checkCapsDevice(provider, caps, capsInstance);"
                )
            } else if (hasFlag) {
                print("\n$t$t$capName = ext.contains(\"$capName\");")
            }
        }

        println()
        deviceCommands.forEach {
            print("\n$t$t$it = VK.get(caps, \"$it\");")
        }

        println(
            """
    }

}"""
        )
    }

})

// DSL Extensions

val GlobalCommand = Capabilities("VK.getGlobalCommands()")

fun String.nativeClassVK(
    templateName: String,
    type: String,
    prefix: String = "VK",
    prefixMethod: String = prefix.toLowerCase(),
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