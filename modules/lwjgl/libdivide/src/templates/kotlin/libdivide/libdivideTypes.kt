/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package libdivide

import org.lwjgl.generator.*

const val LIBDIVIDE_LIBRARY = "LibDivideBoot.initialize();"

fun config() {
    packageInfo(
        Module.LIBDIVIDE,
        "Contains bindings to ${url("https://libdivide.com/", "libdivide")}."
    )

    Generator.registerLibraryInit(Module.LIBDIVIDE, "LibDivideBoot", "libdivide")
}

val libdivide_u32_t = struct(Module.LIBDIVIDE, "LibDivideU32", nativeName = "struct libdivide_u32_t", mutable = false) {
    uint32_t.member("magic", "")
    uint8_t.member("more", "")
}

val libdivide_s32_t = struct(Module.LIBDIVIDE, "LibDivideS32", nativeName = "struct libdivide_s32_t", mutable = false) {
    int32_t.member("magic", "")
    uint8_t.member("more", "")
}

val libdivide_u32_branchfree_t = struct(Module.LIBDIVIDE, "LibDivideU32BranchFree", nativeName = "struct libdivide_u32_branchfree_t", mutable = false) {
    uint32_t.member("magic", "")
    uint8_t.member("more", "")
}

val libdivide_s32_branchfree_t = struct(Module.LIBDIVIDE, "LibDivideS32BranchFree", nativeName = "struct libdivide_s32_branchfree_t", mutable = false) {
    int32_t.member("magic", "")
    uint8_t.member("more", "")
}

val libdivide_u64_t = struct(Module.LIBDIVIDE, "LibDivideU64", nativeName = "struct libdivide_u64_t", mutable = false) {
    uint64_t.member("magic", "")
    uint8_t.member("more", "")
}

val libdivide_s64_t = struct(Module.LIBDIVIDE, "LibDivideS64", nativeName = "struct libdivide_s64_t", mutable = false) {
    int64_t.member("magic", "")
    uint8_t.member("more", "")
}

val libdivide_u64_branchfree_t = struct(Module.LIBDIVIDE, "LibDivideU64BranchFree", nativeName = "struct libdivide_u64_branchfree_t", mutable = false) {
    uint64_t.member("magic", "")
    uint8_t.member("more", "")
}

val libdivide_s64_branchfree_t = struct(Module.LIBDIVIDE, "LibDivideS64BranchFree", nativeName = "struct libdivide_s64_branchfree_t", mutable = false) {
    int64_t.member("magic", "")
    uint8_t.member("more", "")
}