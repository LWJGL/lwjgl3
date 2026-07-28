/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package shaderc

import org.lwjgl.generator.*

val spv_context = typedef("spv_context_t".opaque.p, "spv_context")
val spv_const_context = typedef("spv_context_t".opaque.const.p, "spv_const_context")

val spv_validator_options = typedef("spv_validator_options_t".opaque.p, "spv_validator_options")
val spv_const_validator_options = typedef("spv_validator_options_t".opaque.const.p, "spv_const_validator_options")
val spv_optimizer_options = "spv_optimizer_options".handle
val spv_reducer_options = "spv_reducer_options".handle
val spv_fuzzer_options = "spv_fuzzer_options".handle
val spv_optimizer_t = "spv_optimizer_t".opaque

val spv_endianness_t = "spv_endianness_t".enumType
val spv_ext_inst_type_t = "spv_ext_inst_type_t".enumType
val spv_fp_encoding_t = "spv_fp_encoding_t".enumType
val spv_message_level_t = "spv_message_level_t".enumType
val spv_number_kind_t = "spv_number_kind_t".enumType
val spv_operand_type_t = "spv_operand_type_t".enumType
val spv_result_t = "spv_result_t".enumType
val spv_target_env = "spv_target_env".enumType
val spv_validator_limit = "spv_validator_limit".enumType

val spv_parsed_operand_t = struct(Module.SHADERC, "SPVParsedOperand", nativeName = "spv_parsed_operand_t") {
    uint16_t("offset")
    uint16_t("num_words")
    spv_operand_type_t("type")
    spv_number_kind_t("number_kind")
    uint32_t("number_bit_width")
    spv_fp_encoding_t("fp_encoding")
}

val spv_parsed_instruction_t = struct(Module.SHADERC, "SPVParsedInstruction", nativeName = "spv_parsed_instruction_t") {
    uint32_t.const.p("words")
    AutoSize("words")..uint16_t("num_words")
    uint16_t("opcode")
    spv_ext_inst_type_t("ext_inst_type")
    uint32_t("type_id")
    uint32_t("result_id")
    spv_parsed_operand_t.const.p("operands")
    AutoSize("operands")..uint16_t("num_operands")
}

val spv_parsed_header_t = struct(Module.SHADERC, "SPVParsedHeader", nativeName = "spv_parsed_header_t", mutable = false) {
    uint32_t("magic")
    uint32_t("version")
    uint32_t("generator")
    uint32_t("bound")
    uint32_t("reserved").private()
}

val spv_binary_t = struct(Module.SHADERC, "SPVBinary", nativeName = "spv_binary_t", mutable = false) {
    uint32_t.p("code")
    AutoSize("code")..size_t("wordCount")
}

val spv_text_t = struct(Module.SHADERC, "SPVText", nativeName = "spv_text_t", mutable = false) {
    charUTF8.const.p("str")
    AutoSize("str")..size_t("length")
}

val spv_position_t = struct(Module.SHADERC, "SPVPosition", nativeName = "spv_position_t") {
    size_t("line")
    size_t("column")
    size_t("index")
}

val spv_diagnostic_t = struct(Module.SHADERC, "SPVDiagnostic", nativeName = "spv_diagnostic_t", mutable = false) {
    spv_position_t("position")
    charUTF8.p("error")
    bool("isTextSource")
}

val spv_parsed_header_fn_t = Module.SHADERC.callback {
    spv_result_t(
        "SPVParsedHeaderFn",

        nullable..opaque_p("user_data"),
        spv_endianness_t("endian"),
        uint32_t("magic"),
        uint32_t("version"),
        uint32_t("generator"),
        uint32_t("id_bound"),
        uint32_t("reserved"),

        nativeType = "spv_parsed_header_fn_t"
    )
}

val spv_parsed_instruction_fn_t = Module.SHADERC.callback {
    spv_result_t(
        "SPVParsedInstructionFn",

        nullable..opaque_p("user_data"),
        spv_parsed_instruction_t.const.p("parsed_instruction"),

        nativeType = "spv_parsed_instruction_fn_t"
    )
}

val spv_message_consumer = Module.SHADERC.callback {
    void(
        "SPVMessageConsumer",

        spv_message_level_t("level"),
        charUTF8.const.p("source"),
        spv_position_t.const.p("position"),
        charUTF8.const.p("message"),

        nativeType = "spv_message_consumer"
    )
}

val spv_diagnostic = typedef(spv_diagnostic_t.p, "spv_diagnostic")
val spv_binary = typedef(spv_binary_t.p, "spv_binary")
val spv_const_binary = typedef(spv_binary_t.const.p, "spv_const_binary")
val spv_text = typedef(spv_text_t.p, "spv_text")
val spv_position = typedef(spv_position_t.p, "spv_position")