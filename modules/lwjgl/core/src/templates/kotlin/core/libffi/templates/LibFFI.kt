/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.libffi.templates

import org.lwjgl.generator.*
import core.libffi.*

fun LibFFI() = "LibFFI".nativeClass(Module.CORE_LIBFFI, prefix = "FFI_") {
    nativeDirective("""
DISABLE_WARNINGS()
#define FFI_BUILDING
#include "ffi.h"
ENABLE_WARNINGS()
typedef void (*FFI_FN_TYPE)(void);
typedef void (*FFI_CLOSURE_FUN)(ffi_cif*, void*, void**, void*);""")

    documentation =
        """
		Native bindings to the ${url("https://sourceware.org/libffi", "libffi")} library.

		The foreign function interface provides a mechanism by which a function can generate a call to another function at runtime without requiring knowledge
		of the called function's interface at compile time. This enables use of native libraries that LWJGL does not provide bindings for.

		libffi assumes that you have a pointer to the function you wish to call and that you know the number and types of arguments to pass it, as well as the
		return type of the function.

		The first thing you must do is create an ##FFICIF object that matches the signature of the function you wish to call. This is a separate step
		because it is common to make multiple calls using a single ##FFICIF. The {@code cif} in {@code ffi_cif} stands for Call InterFace. To prepare a
		call interface object, use the function #prep_cif(). To call a function using an initialized {@code ffi_cif}, use the #call() function.
		"""

    ShortConstant(
        "Types used to create custom ##FFICIF.",

        "TYPE_VOID".."0",
        "TYPE_INT".."1",
        "TYPE_FLOAT".."2",
        "TYPE_DOUBLE".."3",
        "TYPE_LONGDOUBLE".."FFI_TYPE_DOUBLE()",
        "TYPE_UINT8".."5",
        "TYPE_SINT8".."6",
        "TYPE_UINT16".."7",
        "TYPE_SINT16".."8",
        "TYPE_UINT32".."9",
        "TYPE_SINT32".."10",
        "TYPE_UINT64".."11",
        "TYPE_SINT64".."12",
        "TYPE_STRUCT".."13",
        "TYPE_POINTER".."14"
    )

    macro(variable=true)..private..short(
        "FFI_TYPE_DOUBLE",
        "The double type.",

        void(),
        noPrefix = true
    )

    val ABI = EnumConstant(
        """
        ABI enumeration.
        
        <b>LWJGL note</b>: ABIs that are not applicable to the current platform will have a value of -1 and should not be used.
        """,

        "FIRST_ABI".enum("", "FFI_FIRST_ABI()"),

        "WIN64".enum("", "FFI_WIN64()"),
        "GNUW64".enum("", "FFI_GNUW64()"),
        "UNIX64".enum("", "FFI_UNIX64()"),
        "EFI64".enum("", "FFI_EFI64()"),
        "SYSV".enum("", "FFI_SYSV()"),
        "STDCALL".enum("", "FFI_STDCALL()"),
        "THISCALL".enum("", "FFI_THISCALL()"),
        "FASTCALL".enum("", "FFI_FASTCALL()"),
        "MS_CDECL".enum("", "FFI_MS_CDECL()"),
        "PASCAL".enum("", "FFI_PASCAL()"),
        "REGISTER".enum("", "FFI_REGISTER()"),
        "VFP".enum("", "FFI_VFP()"),

        "LAST_ABI".enum("", "FFI_LAST_ABI()"),
        "DEFAULT_ABI".enum("", "FFI_DEFAULT_ABI()")
    ).javaDocLinks

    macro(variable=true)..private..int("FFI_WIN64", "", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_GNUW64", "", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_UNIX64", "", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_EFI64", "", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_SYSV", "", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_STDCALL", "", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_THISCALL", "", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_FASTCALL", "", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_MS_CDECL", "", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_PASCAL", "", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_REGISTER", "", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_VFP", "", void(), noPrefix = true)

    macro(variable=true)..private..int("FFI_FIRST_ABI", "", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_LAST_ABI", "", void(), noPrefix = true)
    macro(variable=true)..private..int("FFI_DEFAULT_ABI", "", void(), noPrefix = true)

    EnumConstant(
        "Status codes.",

        "OK".enum,
        "BAD_TYPEDEF".enum,
        "BAD_ABI".enum
    )

    macro..Address..ffi_type.p("type_void", "The {@code ffi_type_void} struct.", void())

    macro..Address..ffi_type.p("type_uint8", "The {@code ffi_type_uint8} struct.", void())
    macro..Address..ffi_type.p("type_sint8", "The {@code ffi_type_sint8} struct.", void())
    macro..Address..ffi_type.p("type_uint16", "The {@code ffi_type_uint16} struct.", void())
    macro..Address..ffi_type.p("type_sint16", "The {@code ffi_type_sint16} struct.", void())
    macro..Address..ffi_type.p("type_uint32", "The {@code ffi_type_uint32} struct.", void())
    macro..Address..ffi_type.p("type_sint32", "The {@code ffi_type_sint32} struct.", void())
    macro..Address..ffi_type.p("type_uint64", "The {@code ffi_type_uint64} struct.", void())
    macro..Address..ffi_type.p("type_sint64", "The {@code ffi_type_sint64} struct.", void())

    macro..Address..ffi_type.p("type_uchar", "The {@code ffi_type_uchar} struct.", void())
    macro..Address..ffi_type.p("type_schar", "The {@code ffi_type_schar} struct.", void())
    macro..Address..ffi_type.p("type_ushort", "The {@code ffi_type_ushort} struct.", void())
    macro..Address..ffi_type.p("type_sshort", "The {@code ffi_type_sshort} struct.", void())
    macro..Address..ffi_type.p("type_uint", "The {@code ffi_type_uint} struct.", void())
    macro..Address..ffi_type.p("type_sint", "The {@code ffi_type_sint} struct.", void())
    macro..Address..ffi_type.p("type_ulong", "The {@code ffi_type_ulong} struct.", void())
    macro..Address..ffi_type.p("type_slong", "The {@code ffi_type_slong} struct.", void())

    macro..Address..ffi_type.p("type_float", "The {@code ffi_type_float} struct.", void())
    macro..Address..ffi_type.p("type_double", "The {@code ffi_type_double} struct.", void())
    macro..Address..ffi_type.p("type_longdouble", "The {@code ffi_type_longdouble} struct.", void())

    macro..Address..ffi_type.p("type_pointer", "The {@code ffi_type_pointer} struct.", void())

    ffi_status(
        "prep_cif",
        """
        Initializes the specified Call Interface (CIF) according to the given parameters.
        
        The resulting {@code ffi_cif} holds pointers to all the {@code ffi_type} objects that were used during initialization. You must ensure that these type
        objects have a lifetime at least as long as that of the {@code ffi_cif}.
        """,

        ffi_cif.p("cif", "the {@code ffi_cif} structure to prepare"),
        ffi_abi("abi", "the ABI to use; normally #DEFAULT_ABI is what you want", ABI),
        AutoSize("atypes")..unsigned_int("nargs", "the number of arguments that this function accepts"),
        ffi_type.p("rtype", "a pointer to an {@code ffi_type} structure that describes the return type of the function"),
        nullable..ffi_type.p.p(
            "atypes",
            "a vector of {@code ffi_type} pointers. {@code atypes} must have {@code nargs} elements. If {@code nargs} is 0, this argument is ignored."
        ),

        returnDoc =
        """
		a status code, of type {@code ffi_status}.

        This will be either #OK if everything worked properly; #BAD_TYPEDEF if one of the {@code ffi_type} objects is incorrect; or #BAD_ABI if the ABI
        parameter is invalid.
		"""
    )

    ffi_status(
        "prep_cif_var",
        """
		Initializes the specified Call Interface (CIF) according to the given parameters for a call to a variadic function.

		Different CIF's must be prepped for calls to the same function when different numbers of arguments are passed. A call to {@code ffi_prep_cif_var} with
        {@code nfixedargs == ntotalargs} is NOT equivalent to a call to #prep_cif().

        The resulting {@code ffi_cif} holds pointers to all the {@code ffi_type} objects that were used during initialization. You must ensure that these type
        objects have a lifetime at least as long as that of the {@code ffi_cif}.
		""",

        ffi_cif.p("cif", "the {@code ffi_cif} structure to prepare"),
        ffi_abi("abi", "the ABI to use; normally #DEFAULT_ABI is what you want", ABI),
        unsigned_int("nfixedargs", "the number of fixed arguments, prior to any variadic arguments. It must be greater than zero."),
        AutoSize("atypes")..unsigned_int("ntotalargs", "the total number of arguments, including variadic and fixed arguments"),
        ffi_type.p("rtype", "a pointer to an {@code ffi_type} structure that describes the return type of the function"),
        ffi_type.p.p("atypes", "a vector of {@code ffi_type} pointers. {@code atypes} must have {@code ntotalargs} elements."),

        returnDoc =
        """
		a status code, of type {@code ffi_status}.

        This will be either #OK if everything worked properly; #BAD_TYPEDEF if one of the {@code ffi_type} objects is incorrect; or #BAD_ABI if the ABI
        parameter is invalid.
		"""
    )

    void(
        "call",
        """
        Calls the function {@code fn} according to the description given in {@code cif}.
        
        {@code cif} must have already been prepared using #prep_cif().
        """,

        ffi_cif.p(
            "cif",
            "a ##FFICIF structure. It must be initialized with #prep_cif() or #prep_cif_var() before it is used with {@code ffi_call}."
        ),
        FFI_FN_TYPE("fn", "the function to call"),
        Unsafe..nullable..void.p(
            "rvalue",
            """
			a pointer to a chunk of memory that will hold the result of the function call.
 
            This must be large enough to hold the result, no smaller than the system register size (generally 32 or 64 bits), and must be suitably aligned; it
            is the caller's responsibility to ensure this. If CIF declares that the function returns {@code void} (using #type_void), then {@code rvalue} is
            ignored.

            In most situations, libffi will handle promotion according to the ABI. However, for historical reasons, there is a special case with return values
            that must be handled by your code. In particular, for integral (not {@code struct}) types that are narrower than the system register size, the
            return value will be widened by libffi. libffi provides a type, {@code ffi_arg}, that can be used as the return type. For example, if the CIF was
            defined with a return type of {@code char}, libffi will try to store a full {@code ffi_arg} into the return value.
			"""
        ),
        Unsafe..nullable..void.p.p(
            "avalues",
            """
            a vector of {@code void *} pointers that point to the memory locations holding the argument values for a call.
             
            If {@code cif} declares that the function has no arguments (i.e., {@code nargs} was 0), then {@code avalues} is ignored. Note that argument values
            may be modified by the callee (for instance, structs passed by value); the burden of copying pass-by-value arguments is placed on the caller.

            Note that while the return value must be register-sized, arguments should exactly match their declared type. For example, if an argument is a
            {@code short}, then the entry in {@code avalues} should point to an object declared as {@code short}; but if the return type is {@code short}, then
            {@code rvalue} should point to an object declared as a larger type - usually {@code ffi_arg}.
            """
        )
    )

    ffi_status(
        "get_struct_offsets",
        "Computes the offset of each element of the given structure type.",

        ffi_abi("abi", "the ABI to use; this is needed because in some cases the layout depends on the ABI"),
        ffi_type.p("struct_type", ""),
        Unsafe..nullable..size_t.p(
            "offsets",
            """
            an out parameter. The caller is responsible for providing enough space for all the results to be written - one element per element type in
            {@code struct_type}. If {@code offsets} is #NULL, then the type will be laid out but not otherwise modified. This can be useful for accessing the
            type's size or layout.
            """
        ),

        returnDoc =
        """
        returns #OK on success; #BAD_ABI if {@code abi} is invalid; or #BAD_TYPEDEF if {@code struct_type} is invalid in some way. Note that only
        {@code FFI_STRUCT} types are valid here.
        """
    )

    ffi_closure.p(
        "closure_alloc",
        """
        Allocates a chunk of memory holding {@code size} bytes.
         
        Returns a pointer to the writable address, and sets {@code *code} to the corresponding executable address.
        """,

        size_t("size", "the number of bytes to allocate. Should be sufficient to hold an {@code ffi_closure} object (FFIClosure#SIZEOF)."),
        Check(1)..void.p.p("code", "a buffer in which to place the returned executable address"),

        returnDoc = "a pointer to the writable address"
    )

    void(
        "closure_free",
        "Frees memory allocated using #closure_alloc().",

        ffi_closure.p("writable", "the address of an ##FFIClosure structure")
    )

    ffi_status(
        "prep_closure_loc",
        """
        Prepares a closure function.
        
        After calling {@code ffi_prep_closure_loc,} you can cast {@code codeloc} to the appropriate pointer-to-function type.
        """,

        ffi_closure.p("closure", "the address of an {@code ffi_closure} object; this is the writable address returned by #closure_alloc()."),
        ffi_cif.p("cif", "the {@code ffi_cif} describing the function parameters"),
        FFI_CLOSURE_FUN(
            "fun",
            """
            the function which will be called when the closure is invoked. It is called with the arguments:
            ${ul(
                "{@code cif} - The {@code ffi_cif} passed to {@code ffi_prep_closure_loc}.",
                """
                {@code ret} - a pointer to the memory used for the function's return value.
                 
                If the function is declared as returning {@code void}, then this value is garbage and should not be used.

                Otherwise, {@code fun} must fill the object to which this points, following the same special promotion behavior as {@code ffi_call}. That is,
                in most cases, {@code ret} points to an object of exactly the size of the type specified when {@code cif} was constructed. However, integral
                types narrower than the system register size are widened. In these cases your program may assume that {@code ret} points to an {@code ffi_arg}
                object.
                """,
                "{@code args} - a vector of pointers to memory holding the arguments to the function.",
                "{@code user_data} - the same USER_DATA that was passed to {@code ffi_prep_closure_loc}."
            )}
            """
        ),
        nullable..opaque_p("user_data", "an arbitrary datum that is passed, uninterpreted, to your closure function"),
        opaque_p("codeloc", "the executable address returned by #closure_alloc()."),

        returnDoc = "#OK if everything went ok, and one of the other {@code ffi_status} values on error"
    )
}