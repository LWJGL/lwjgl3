/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.libffi

import org.lwjgl.generator.*

val ffi_abi = "ffi_abi".enumType
val ffi_status = "ffi_status".enumType

val FFI_FN_TYPE = "FFI_FN_TYPE".handle

val ffi_type = struct(Module.CORE_LIBFFI, "FFIType", nativeName = "ffi_type") {
    size_t("size")
    unsigned_short("alignment")
    unsigned_short("type")
    nullable.."ffi_type".handle.p("elements")
}

val ffi_cif = struct(Module.CORE_LIBFFI, "FFICIF", nativeName = "ffi_cif", nativeLayout = true, mutable = false) {
    nativeDirective("""
DISABLE_WARNINGS()
#include "ffi.h"
ENABLE_WARNINGS()""")

    ffi_abi("abi")
    unsigned("nargs")
    ffi_type.p.p("arg_types")
    ffi_type.p("rtype")
    unsigned("bytes")
    unsigned("flags")
}

// Closures

val ffi_closure = struct(Module.CORE_LIBFFI, "FFIClosure", nativeName = "ffi_closure", nativeLayout = true, mutable = false) {
    nativeDirective("""
DISABLE_WARNINGS()
#include "ffi.h"
ENABLE_WARNINGS()""")

    ffi_cif.p("cif")
    "void (*)(ffi_cif*,void*,void**,void*)".handle("fun")
    opaque_p("user_data")
}
val FFI_CLOSURE_FUN = "FFI_CLOSURE_FUN".handle