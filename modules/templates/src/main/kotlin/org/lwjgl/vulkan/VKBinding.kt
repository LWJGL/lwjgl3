/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan

import org.lwjgl.generator.*
import org.lwjgl.vulkan.VKFunctionType.*
import org.lwjgl.vulkan.templates.*
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

private val CAPS_INSTANCE = "VKCapabilitiesInstance"
private val CAPS_DEVICE = "VKCapabilitiesDevice"

private val EXTENSION_TYPES = HashMap<String, String>()
private val DEVICE_EXTENSIONS = ArrayList<NativeClass>()

private enum class VKFunctionType {
    PROC,
    GLOBAL,
    INSTANCE,
    DEVICE
}

private val Func.type: VKFunctionType
    get() = when {
        name == "vkGetInstanceProcAddr" -> PROC // dlsym/GetProcAddress
        when (name) {
            "vkEnumerateInstanceExtensionProperties",
            "vkEnumerateInstanceLayerProperties",
            "vkCreateInstance" -> true
            else               -> false
        }                               -> GLOBAL // vkGetInstanceProcAddr: VK_NULL_HANDLE
        parameters[0].nativeType.let {
            it === VkInstance || it === VkPhysicalDevice
        }                               -> INSTANCE // vkGetInstanceProcAddr: instance handle
        else                            -> DEVICE // vkGetDeviceProcAddr  : device handle
    }

private val EXTENSION_NAME = "[A-Za-z0-9_]+".toRegex()

private fun printPointer(func: Func) = if (func.has<DependsOn>())
    "${func.get<DependsOn>().reference.let { if (EXTENSION_NAME.matches(it)) "ext.contains(\"$it\")" else it }} ? caps.${func.name} : -1L"
else
    "caps.${func.name}"

val VK_BINDING_INSTANCE = Generator.register(object : APIBinding(
    VULKAN_PACKAGE,
    CAPS_INSTANCE,
    APICapabilities.PARAM_CAPABILITIES
) {

    override fun shouldCheckFunctionAddress(function: Func): Boolean = function.nativeClass.templateName != "VK10"

    override fun generateFunctionAddress(writer: PrintWriter, function: Func) {
        writer.print("$t${t}long $FUNCTION_ADDRESS = ")
        writer.println(if (function.has<Capabilities>())
            "${function.get<Capabilities>().expression}.${function.name};"
        else
            "${function.getParams { it.nativeType is ObjectType }.first().name}.getCapabilities().${function.name};")
    }

    override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
        val hasInstanceFunctions = EXTENSION_TYPES[nativeClass.templateName] == "instance" || nativeClass.functions.any { it.type === INSTANCE }
        val hasInstanceDependencies = hasInstanceFunctions && nativeClass.functions.any { it.type === INSTANCE && it.has<DependsOn>() }
        if (hasInstanceFunctions) {
            println("\n${t}static boolean isAvailable($CAPS_INSTANCE caps${if (hasInstanceDependencies) ", java.util.Set<String> ext" else ""}) {")
            print("$t${t}return checkFunctions(")
            nativeClass.printPointers(this, ::printPointer) {
                it.type === INSTANCE && !it.has<Macro>()
            }
            println(");")
            println("$t}")
        }

        val hasDeviceFunctions = EXTENSION_TYPES[nativeClass.templateName] == "device" || (nativeClass.templateName.startsWith("VK") && nativeClass.functions.any { it.type === DEVICE })
        if (hasDeviceFunctions) {
            val hasDeviceDependencies = nativeClass.functions.any { it.type === DEVICE && it.has<DependsOn>() }
            print("\n${t}static boolean isAvailable(${if (hasInstanceFunctions) "$CAPS_INSTANCE capsInstance, " else ""}$CAPS_DEVICE caps")
            if (hasInstanceDependencies || hasDeviceDependencies) print(", java.util.Set<String> ext")
            println(") {")
            print("$t${t}return ${if (hasInstanceFunctions) "isAvailable(capsInstance${if (hasInstanceDependencies) ", ext" else ""}) && " else ""}checkFunctions(")
            nativeClass.printPointers(this, ::printPointer) {
                it.type === DEVICE && !it.has<Macro>()
            }
            println(");")
            println("$t}")
        }
    }

    init {
        javaImport("static org.lwjgl.vulkan.VK.*")

        documentation = "Defines the capabilities of a Vulkan {@code VkInstance}."
    }

    override fun PrintWriter.generateJava() {
        generateJavaPreamble()
        println("public class $CAPS_INSTANCE {")

        val classes = super.getClasses { o1, o2 ->
            // Core functionality first, extensions after
            val isVK1 = o1.templateName.startsWith("VK")
            val isVK2 = o2.templateName.startsWith("VK")

            if (isVK1 xor isVK2)
                (if (isVK1) -1 else 1)
            else
                o1.templateName.compareTo(o2.templateName, ignoreCase = true)
        }.filter {
            EXTENSION_TYPES[it.templateName] ?: "instance" == "instance" || it.functions.any { it.type === INSTANCE }
        }

        classes.asSequence()
            .filter { it.hasNativeFunctions }
            .forEach {
                println("\n$t// ${it.templateName}")
                println("${t}public final long")
                println(it.functions.asSequence()
                    .filter { it.type === INSTANCE && !it.has<Macro>() }
                    .map(Func::name)
                    .joinToString(",\n$t$t", prefix = "$t$t", postfix = ";")
                )
            }

        println("""
    /** The Vulkan API version number. */
    public final int apiVersion;
""")

        classes
            .filter { EXTENSION_TYPES[it.templateName] ?: "instance" == "instance" }
            .forEach {
                println(it.getCapabilityJavadoc())
                println("${t}public final boolean ${it.capName};")
            }

        println("""
    $CAPS_INSTANCE(FunctionProvider provider, int apiVersion, Set<String> ext) {
        this.apiVersion = apiVersion;

        boolean supported;""")
        classes.forEach {
            val capName = it.capName
            if (it.hasNativeFunctions) {
                println("\n$t$t{")
                val isInstanceExtension = EXTENSION_TYPES[it.templateName] ?: "instance" == "instance"
                if (isInstanceExtension)
                    println("$t$t${t}supported = ext.contains(\"$capName\");")
                print(it.functions.asSequence()
                    .filter { it.type === INSTANCE && !it.has<Macro>() }
                    .map { "${it.name} = isSupported(provider, ${it.functionAddress}, ${if (isInstanceExtension) "supported" else "true"});" }.joinToString("\n$t$t$t", prefix = "$t$t$t"))
                if (isInstanceExtension) {
                    println("\n$t$t$t$capName = supported && VK.checkExtension(\"$capName\", ${
                    if (capName == it.className) "$VULKAN_PACKAGE.${it.className}" else it.className
                    }.isAvailable(this${
                    if (it.functions.any { it.has<DependsOn>() }) ", ext" else ""
                    }));")
                }
                print("$t$t}")
            } else {
                print("\n$t$t$capName = ext.contains(\"$capName\");")
            }
        }
        println("""
    }

}""")
    }

})

val VK_BINDING_DEVICE = Generator.register(object : GeneratorTarget(VULKAN_PACKAGE, CAPS_DEVICE) {

    init {
        javaImport(
            "java.util.Set",
            "org.lwjgl.system.*",
            "static org.lwjgl.vulkan.VK.*"
        )

        documentation = "Defines the capabilities of a Vulkan {@code VkDevice}."
    }

    override fun PrintWriter.generateJava() {
        DEVICE_EXTENSIONS.add(VK10)

        generateJavaPreamble()
        println("public class $CAPS_DEVICE {")

        val classes = DEVICE_EXTENSIONS
        classes.sortWith(Comparator { o1, o2 ->
            // Core functionality first, extensions after
            val isVK1 = o1.templateName.startsWith("VK")
            val isVK2 = o2.templateName.startsWith("VK")

            if (isVK1 xor isVK2)
                (if (isVK1) -1 else 1)
            else
                o1.templateName.compareTo(o2.templateName, ignoreCase = true)
        })

        classes.asSequence()
            .filter { it.hasNativeFunctions }
            .forEach {
                println("\n$t// ${it.templateName}")
                println("${t}public final long")
                println(it.functions.asSequence()
                    .filter { it.type === DEVICE && !it.has<Macro>() }
                    .map(Func::name)
                    .joinToString(",\n$t$t", prefix = "$t$t", postfix = ";")
                )
            }

        println("""
    /** The Vulkan API version number. */
    public final int apiVersion;
""")

        classes.forEach {
            println(it.getCapabilityJavadoc())
            println("${t}public final boolean ${it.capName};")
        }

        println("""
    $CAPS_DEVICE(FunctionProvider provider, VKCapabilitiesInstance capsInstance, Set<String> ext) {
        this.apiVersion = capsInstance.apiVersion;

        boolean supported;""")
        classes.forEach {
            val capName = it.capName
            if (it.hasNativeFunctions) {
                println("\n$t$t{")
                println("$t$t${t}supported = ext.contains(\"$capName\");")
                println(it.functions.asSequence()
                    .filter { it.type === DEVICE && !it.has<Macro>() }
                    .map { "${it.name} = isSupported(provider, ${it.functionAddress}, supported);" }.joinToString("\n$t$t$t", prefix = "$t$t$t"))
                println("$t$t$t$capName = supported && VK.checkExtension(\"$capName\", ${
                if (capName == it.className) "$VULKAN_PACKAGE.${it.className}" else it.className
                }.isAvailable(${
                if (it.functions.any { it.type === INSTANCE }) "capsInstance, " else ""
                }this${
                if (it.functions.any { it.has<DependsOn>() }) ", ext" else ""
                }));")
                print("$t$t}")
            } else {
                print("\n$t$t$capName = ext.contains(\"$capName\");")
            }
        }
        println("""
    }

}""")
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

    val ext = nativeClass(
        VULKAN_PACKAGE,
        templateName,
        prefix = prefix,
        prefixMethod = prefixMethod,
        postfix = postfix,
        binding = VK_BINDING_INSTANCE,
        init = init
    )

    // There are device extensions with instance functions (currently only NVX_device_generated_commands, a spec bug?)
    if (type == "device")
        DEVICE_EXTENSIONS.add(ext)

    return ext
}