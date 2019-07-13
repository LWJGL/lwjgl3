/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr

import org.lwjgl.generator.*
import openvr.templates.*
import java.io.*

private val NativeClass.capabilitiesClass get() = "I$className"
private val NativeClass.capabilitiesField get() = className

private fun PrintWriter.generateCapabilitiesClass(nativeClass: NativeClass) {
    println("\n\n${t}public static final class ${nativeClass.capabilitiesClass} {\n")

    println("$t${t}public final long")
    println(nativeClass.functions
        .map(Func::simpleName)
        .joinToString(",\n$t$t$t", prefix = "$t$t$t", postfix = ";"))

    println("\n$t${t}public ${nativeClass.capabilitiesClass}(long tableAddress) {")
    println("$t$t${t}PointerBuffer table = memPointerBuffer(tableAddress, ${nativeClass.functions.count()});")
    println(nativeClass.functions
        .mapIndexed { i, function -> "${function.simpleName} = table.get($i);" }
        .joinToString("\n$t$t$t", prefix = "$t$t$t"))
    println("$t$t}")

    print("\n$t}")
}

val OPENVR_FNTABLE_BINDING: APIBinding = Generator.register(object : APIBinding(Module.OPENVR, "OpenVR", APICapabilities.JAVA_CAPABILITIES) {

    override fun generateFunctionAddress(writer: PrintWriter, function: Func) {
        writer.println("$t${t}long $FUNCTION_ADDRESS = OpenVR.${function.nativeClass.capabilitiesField}.${function.simpleName};")
    }

    override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
    }

    init {
        javaImport(
            "java.nio.*",
            "java.util.function.*",
            "javax.annotation.Nullable",
            "org.lwjgl.*",
            "static org.lwjgl.openvr.VR.*",
            "static org.lwjgl.system.MemoryStack.*",
            "static org.lwjgl.system.MemoryUtil.*"
        )
        documentation = "The OpenVR function tables."
    }

    override fun PrintWriter.generateJava() {
        generateJavaPreamble()
        println("public final class OpenVR {\n")

        // in COpenVRContext order
        val interfaces = arrayOf(
            VRSystem,

            VRChaperone,
            VRChaperoneSetup,
            VRCompositor,
            VROverlay,
            VRResources,
            VRRenderModels,
            VRExtendedDisplay,
            VRSettings,
            VRApplications,
            VRTrackedCamera,
            VRScreenshots,
            VRDriverManager,
            VRInput,
            VRIOBuffer,
            VRSpatialAnchors,
            VRNotifications
        )

        println(interfaces.joinToString("\n$t", prefix = t) { "@Nullable public static ${it.capabilitiesClass} ${it.capabilitiesField};" })

        // Common constructor
        print("""
    private static int token;

    static {
        String libName = Platform.mapLibraryNameBundled("lwjgl_openvr");
        Library.loadSystem(System::load, System::loadLibrary, OpenVR.class, "org.lwjgl.openvr", libName);
    }

    private OpenVR() {
    }

    static void initialize() {
        // intentionally empty to trigger static initializer
    }

    public static void create(int token) {
        OpenVR.token = token;
""")
        interfaces.forEach {
            print("\n$t$t${it.capabilitiesField} = getGenericInterface(I${it.className}_Version, ${it.capabilitiesClass}::new);")
        }
        print("""
    }

    @Nullable
    private static <T> T getGenericInterface(String interfaceNameVersion, LongFunction<T> supplier) {
        try (MemoryStack stack = stackPush()) {
            IntBuffer peError = stack.mallocInt(1);
            long ivr = VR_GetGenericInterface("FnTable:" + interfaceNameVersion, peError);
            return ivr != NULL && peError.get(0) == EVRInitError_VRInitError_None ? supplier.apply(ivr) : null;
        }
    }

    public static void checkInitToken() {
        if (token == 0) {
            throw new IllegalStateException("The OpenVR API must be initialized first.");
        }

        int initToken = VR_GetInitToken();
        if (token != initToken) {
            destroy();
            create(initToken);
        }
    }

    public static void destroy() {
        token = 0;

        ${interfaces.joinToString("\n$t$t") { "${it.capabilitiesField} = null;" }}
    }""")

        interfaces.forEach {
            generateCapabilitiesClass(it)
        }

        print("\n\n}")
    }

})