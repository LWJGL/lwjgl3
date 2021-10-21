/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package libdivide

import org.lwjgl.generator.*

val libdivide_u16_t = struct(Module.LIBDIVIDE, "LibDivideU16", nativeName = "struct libdivide_u16_t") {
    uint16_t("magic", "")
    uint8_t("more", "")
}

val libdivide_s16_t = struct(Module.LIBDIVIDE, "LibDivideS16", nativeName = "struct libdivide_s16_t") {
    int16_t("magic", "")
    uint8_t("more", "")
}

val libdivide_u16_branchfree_t = struct(Module.LIBDIVIDE, "LibDivideU16BranchFree", nativeName = "struct libdivide_u16_branchfree_t") {
    uint16_t("magic", "")
    uint8_t("more", "")
}

val libdivide_s16_branchfree_t = struct(Module.LIBDIVIDE, "LibDivideS16BranchFree", nativeName = "struct libdivide_s16_branchfree_t") {
    int16_t("magic", "")
    uint8_t("more", "")
}

val libdivide_u32_t = struct(Module.LIBDIVIDE, "LibDivideU32", nativeName = "struct libdivide_u32_t") {
    uint32_t("magic", "")
    uint8_t("more", "")
}

val libdivide_s32_t = struct(Module.LIBDIVIDE, "LibDivideS32", nativeName = "struct libdivide_s32_t") {
    int32_t("magic", "")
    uint8_t("more", "")
}

val libdivide_u32_branchfree_t = struct(Module.LIBDIVIDE, "LibDivideU32BranchFree", nativeName = "struct libdivide_u32_branchfree_t") {
    uint32_t("magic", "")
    uint8_t("more", "")
}

val libdivide_s32_branchfree_t = struct(Module.LIBDIVIDE, "LibDivideS32BranchFree", nativeName = "struct libdivide_s32_branchfree_t") {
    int32_t("magic", "")
    uint8_t("more", "")
}

val libdivide_u64_t = struct(Module.LIBDIVIDE, "LibDivideU64", nativeName = "struct libdivide_u64_t") {
    uint64_t("magic", "")
    uint8_t("more", "")
}

val libdivide_s64_t = struct(Module.LIBDIVIDE, "LibDivideS64", nativeName = "struct libdivide_s64_t") {
    int64_t("magic", "")
    uint8_t("more", "")
}

val libdivide_u64_branchfree_t = struct(Module.LIBDIVIDE, "LibDivideU64BranchFree", nativeName = "struct libdivide_u64_branchfree_t") {
    uint64_t("magic", "")
    uint8_t("more", "")
}

val libdivide_s64_branchfree_t = struct(Module.LIBDIVIDE, "LibDivideS64BranchFree", nativeName = "struct libdivide_s64_branchfree_t") {
    int64_t("magic", "")
    uint8_t("more", "")
}