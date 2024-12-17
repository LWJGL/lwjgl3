/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm

import org.lwjgl.generator.*

val LTO_BINDING = simpleBinding(Module.LLVM, libraryName = "LTO", libraryExpression = "Configuration.LLVM_LTO_LIBRARY_NAME, \"LTO\"")

val lto_code_gen_t = "lto_code_gen_t".handle
val lto_module_t = "lto_module_t".handle
val thinlto_code_gen_t = "thinlto_code_gen_t".handle

val lto_bool_t = PrimitiveType("lto_bool_t", PrimitiveMapping.BOOLEAN)
val off_t = IntegerType("off_t", PrimitiveMapping.LONG, unsigned = true)

val lto_codegen_diagnostic_severity_t = "lto_codegen_diagnostic_severity_t".enumType
val lto_codegen_model = "lto_codegen_model".enumType
val lto_debug_model = "lto_debug_model".enumType
val lto_symbol_attributes = "lto_symbol_attributes".enumType

val lto_diagnostic_handler_t = Module.LLVM.callback {
    void(
        "LTODiagnosticHandler",

        lto_codegen_diagnostic_severity_t("severity"),
        charUTF8.const.p("diag"),
        opaque_p("ctxt")
    ) {
    }
}

val LTOObjectBuffer = struct(Module.LLVM, "LTOObjectBuffer", mutable = false) {
    char.const.p("Buffer")
    AutoSize("Buffer")..size_t("Size")
}
