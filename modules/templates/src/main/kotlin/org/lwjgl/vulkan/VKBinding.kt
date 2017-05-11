/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan

import org.lwjgl.generator.*
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

private val Func.addressType: Long get() {
    return when {
        name == "vkGetInstanceProcAddr" -> 0 // dlsym/GetProcAddress
        when (name) {
            "vkEnumerateInstanceExtensionProperties",
            "vkEnumerateInstanceLayerProperties",
            "vkCreateInstance" -> true
            else               -> false
        }                               -> 1 // vkGetInstanceProcAddr: VK_NULL_HANDLE
        parameters[0].nativeType.let {
            it === VkInstance || it === VkPhysicalDevice
        }                               -> 2 // vkGetInstanceProcAddr: instance handle
        else                            -> 3 // vkGetDeviceProcAddr  : device handle
    }
}

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
        val hasInstanceFunctions = EXTENSION_TYPES[nativeClass.templateName] == "instance" || nativeClass.functions.any { it.addressType == 2L }
        if (hasInstanceFunctions) {
            println("\n${t}static boolean isAvailable($CAPS_INSTANCE caps) {")
            print("$t${t}return checkFunctions(")
            nativeClass.printPointers(this, { "caps.${it.name}" }) {
                it.addressType == 2L && !it.has<Macro>()
            }
            println(");")
            println("$t}")
        }

        if (EXTENSION_TYPES[nativeClass.templateName] == "device" || (nativeClass.templateName.startsWith("VK") && nativeClass.functions.any { it.addressType == 3L })) {
            println("\n${t}static boolean isAvailable(${if (hasInstanceFunctions) "$CAPS_INSTANCE capsInstance, " else ""}$CAPS_DEVICE caps) {")
            print("$t${t}return ${if (hasInstanceFunctions) "isAvailable(capsInstance) && " else ""}checkFunctions(")
            nativeClass.printPointers(this, { "caps.${it.name}" }) {
                it.addressType == 3L && !it.has<Macro>()
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
            EXTENSION_TYPES[it.templateName] ?: "instance" == "instance" || it.functions.any { it.addressType == 2L }
        }

        classes.asSequence()
            .filter { it.hasNativeFunctions }
            .forEach {
                println("\n$t// ${it.templateName}")
                println("${t}public final long")
                println(it.functions.asSequence()
                    .filter { it.addressType == 2L && !it.has<Macro>() }
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
                println(it.functions.asSequence()
                    .filter { it.addressType == 2L && !it.has<Macro>() }
                    .map { "${it.name} = isSupported(provider, ${it.functionAddress}, ${if (isInstanceExtension) "supported" else "true"});" }.joinToString("\n$t$t$t", prefix = "$t$t$t"))
                if (isInstanceExtension)
                    println("$t$t$t$capName = supported && VK.checkExtension(\"$capName\", ${if (capName == it.className) "$VULKAN_PACKAGE.${it.className}" else it.className}.isAvailable(this));")
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
                    .filter { it.addressType == 3L && !it.has<Macro>() }
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
                    .filter { it.addressType == 3L && !it.has<Macro>() }
                    .map { "${it.name} = isSupported(provider, ${it.functionAddress}, supported);" }.joinToString("\n$t$t$t", prefix = "$t$t$t"))
                println("$t$t$t$capName = supported && VK.checkExtension(\"$capName\", ${if (capName == it.className) "$VULKAN_PACKAGE.${it.className}" else it.className}.isAvailable(${
                if (it.functions.any { it.addressType == 2L }) "capsInstance, " else ""
                }this));")
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