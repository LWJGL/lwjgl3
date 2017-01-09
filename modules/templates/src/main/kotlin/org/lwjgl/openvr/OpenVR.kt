/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openvr

import org.lwjgl.generator.*
import org.lwjgl.openvr.templates.*
import java.io.*

private val NativeClass.capabilitiesClass get() = "I$className"
private val NativeClass.capabilitiesField get() = className

private fun PrintWriter.generateCapabilitiesClass(nativeClass: NativeClass) {
	println("\n\n\tpublic static final class ${nativeClass.capabilitiesClass} {\n")

	println("\t\tpublic final long")
	println(nativeClass.functions
		.map { it.simpleName }
		.joinToString(",\n\t\t\t", prefix = "\t\t\t", postfix = ";"))

	println("\n\t\tpublic ${nativeClass.capabilitiesClass}(long tableAddress) {")
	println("\t\t\tPointerBuffer table = MemoryUtil.memPointerBuffer(tableAddress, ${nativeClass.functions.count()});")
	println(nativeClass.functions
		.mapIndexed { i, function -> "${function.simpleName} = table.get($i);" }
		.joinToString("\n\t\t\t", prefix = "\t\t\t"))
	println("\t\t}")

	print("\n\t}")
}

val OPENVR_FNTABLE_BINDING: APIBinding = Generator.register(object : APIBinding(OPENVR_PACKAGE, "OpenVR", APICapabilities.JAVA_CAPABILITIES) {

	override fun generateFunctionAddress(writer: PrintWriter, function: NativeClassFunction) {
		writer.println("\t\tlong $FUNCTION_ADDRESS = OpenVR.${function.nativeClass.capabilitiesField}.${function.simpleName};")
	}

	override fun PrintWriter.generateFunctionSetup(nativeClass: NativeClass) {
	}

	init {
		javaImport(
			"java.nio.*",
			"java.util.function.*",
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

		val interfaces = arrayOf(
			VRSystem,

			VRApplications,
			VRChaperone,
			VRChaperoneSetup,
			VRCompositor,
			VRExtendedDisplay,
			VRNotifications,
			VROverlay,
			VRRenderModels,
			VRResources,
			VRScreenshots,
			VRSettings,
			VRTrackedCamera
		)

		println(interfaces
			.map { "public static ${it.capabilitiesClass} ${it.capabilitiesField};" }
			.joinToString("\n\t", prefix = "\t"))

		// Common constructor
		print("""
	private static int token;

	static {
		String libName = Platform.mapLibraryNameBundled("lwjgl_openvr");
		Library.loadSystem(libName);
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
			print("\n\t\t${it.capabilitiesField} = getGenericInterface(I${it.className}_Version, ${it.capabilitiesClass}::new);")
		}
		print("""
	}

	private static <T> T getGenericInterface(String interfaceNameVersion, LongFunction<T> supplier) {
		try ( MemoryStack stack = stackPush() ) {
			IntBuffer peError = stack.mallocInt(1);
			long ivr = VR_GetGenericInterface("FnTable:" + interfaceNameVersion, peError);
			return ivr != NULL && peError.get(0) == EVRInitError_VRInitError_None ? supplier.apply(ivr) : null;
		}
	}

	public static void checkInitToken() {
		if ( token == 0 )
			throw new IllegalStateException("The OpenVR API must be initialized first.");

		int initToken = VR_GetInitToken();
		if ( token != initToken ) {
			destroy();
			create(initToken);
		}
	}

	public static void destroy() {
		token = 0;

		${interfaces
			.map { "${it.capabilitiesField} = null;" }
			.joinToString("\n\t\t")}
	}""")

		interfaces.forEach {
			generateCapabilitiesClass(it)
		}

		print("\n\n}")
	}

})