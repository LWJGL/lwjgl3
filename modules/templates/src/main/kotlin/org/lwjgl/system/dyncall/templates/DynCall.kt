/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.dyncall.templates

import org.lwjgl.generator.*
import org.lwjgl.system.dyncall.*

val DynCall = "DynCall".nativeClass(DYNCALL_PACKAGE, prefix = "DC") {
    nativeImport(
        "dyncall.h"
    )

    documentation =
        """
        Native bindings to \"dyncall.h\".

        The dyncall library encapsulates architecture-, OS- and compiler-specific function call semantics in a virtual "bind argument parameters from left to
        right and then call" interface allowing programmers to call C functions in a completely dynamic manner.

        In other words, instead of calling a function directly, the dyncall library provides a mechanism to push the function parameters manually and to issue
        the call afterwards.

        Since the idea behind this concept is similar to call dispatching mechanisms of virtual machines, the object that can be dynamically loaded with
        arguments, and then used to actually invoke the call, is called {@code CallVM}. It is possible to change the calling convention used by the
        {@code CallVM} at run-time. Due to the fact that nearly every platform comes with one or more distinct calling conventions, the dyncall library project
        intends to be a portable and open-source approach to the variety of compiler-specific binary interfaces, platform specific subtleties, and so on...
        """

    val CallingConventions = IntConstant(
        "Supported calling convention modes.",

        "CALL_C_DEFAULT".."0",
        "CALL_C_ELLIPSIS".."100",
        "CALL_C_ELLIPSIS_VARARGS".."101",
        "CALL_C_X86_CDECL".."1",
        "CALL_C_X86_WIN32_STD".."2",
        "CALL_C_X86_WIN32_FAST_MS".."3",
        "CALL_C_X86_WIN32_FAST_GNU".."4",
        "CALL_C_X86_WIN32_THIS_MS".."5",
        "CALL_C_X86_WIN32_THIS_GNU".."6",
        "CALL_C_X64_WIN64".."7",
        "CALL_C_X64_SYSV".."8",
        "CALL_C_PPC32_DARWIN".."9",
        "CALL_C_PPC32_OSX".."DC_CALL_C_PPC32_DARWIN",
        "CALL_C_ARM_ARM_EABI".."10",
        "CALL_C_ARM_THUMB_EABI".."11",
        "CALL_C_ARM_ARMHF".."30",
        "CALL_C_MIPS32_EABI".."12",
        "CALL_C_PPC32_SYSV".."13",
        "CALL_C_PPC32_LINUX".."DC_CALL_C_PPC32_SYSV",
        "CALL_C_ARM_ARM".."14",
        "CALL_C_ARM_THUMB".."15",
        "CALL_C_MIPS32_O32".."16",
        "CALL_C_MIPS64_N32".."17",
        "CALL_C_MIPS64_N64".."18",
        "CALL_C_X86_PLAN9".."19",
        "CALL_C_SPARC32".."20",
        "CALL_C_SPARC64".."21",
        "CALL_C_ARM64".."22",
        "CALL_C_PPC64".."23",
        "CALL_C_PPC64_LINUX".."DC_CALL_C_PPC64",
        "CALL_SYS_DEFAULT".."200",
        "CALL_SYS_X86_INT80H_LINUX".."201",
        "CALL_SYS_X86_INT80H_BSD".."202",
        "CALL_SYS_PPC32".."210",
        "CALL_SYS_PPC64".."211"
    ).javaDocLinks

    IntConstant(
        "Error codes.",

        "ERROR_NONE".."0",
        "ERROR_UNSUPPORTED_MODE".."-1"
    )

    IntConstant(
        "Boolean values.",

        "TRUE".."1",
        "FALSE".."0"
    )

    CharConstant(
        "Signatures.",

        "SIGCHAR_VOID"..'v',
        "SIGCHAR_BOOL"..'B',
        "SIGCHAR_CHAR"..'c',
        "SIGCHAR_UCHAR"..'C',
        "SIGCHAR_SHORT"..'s',
        "SIGCHAR_USHORT"..'S',
        "SIGCHAR_INT"..'i',
        "SIGCHAR_UINT"..'I',
        "SIGCHAR_LONG"..'j',
        "SIGCHAR_ULONG"..'J',
        "SIGCHAR_LONGLONG"..'l',
        "SIGCHAR_ULONGLONG"..'L',
        "SIGCHAR_FLOAT"..'f',
        "SIGCHAR_DOUBLE"..'d',
        "SIGCHAR_POINTER"..'p',
        "SIGCHAR_STRING"..'Z',
        "SIGCHAR_STRUCT"..'T',
        "SIGCHAR_ENDARG"..')' /* also works for end struct */
    )

    DCCallVM_p(
        "NewCallVM",
        """
        Creates a new {@code CallVM} object.

        Use #Free() to destroy the {@code CallVM} object.
        """,

        DCsize.IN("size", "the max size of the internal stack that will be allocated and used to bind arguments to")
    )

    val vm = DCCallVM_p.IN("vm", "a {@code CallVM} instance")

    void(
        "Free",
        "Frees a {@code CallVM} object.",

        vm
    )

    void(
        "Reset",
        """
        Resets the internal stack of arguments and prepares it for a new call. This function should be called after setting the call mode (using #Mode()), but
        prior to binding arguments to the {@code CallVM}. Use it also when reusing a {@code CallVM}, as arguments don’t get flushed automatically after a
        function call invocation.

        Note: you should also call this function after initial creation of the a {@code CallVM} object, as #NewCallVM() doesn’t do this, implicitly.
        """,

        vm
    )

    void(
        "Mode",
        """
        Sets the calling convention to use.

        #CALL_C_DEFAULT is the default standard C call on the target platform. It uses the standard C calling convention. #CALL_C_ELLIPSIS is used for C
        ellipsis calls which allow to build up a variable argument list. On many platforms, there is only one C calling convention. The X86 platform provides a
        rich family of different calling conventions.
        """,

        vm,
        DCint.IN("mode", "the calling convention", CallingConventions)
    )

    void("ArgBool", "Binds a {@code bool} argument.", vm, DCbool.IN("value", "the argument value"))
    void("ArgChar", "Binds a {@code char} argument.", vm, DCchar.IN("value", "the argument value"))
    void("ArgShort", "Binds a {@code short} argument.", vm, DCshort.IN("value", "the argument value"))
    void("ArgInt", "Binds an {@code int} argument.", vm, DCint.IN("value", "the argument value"))
    void("ArgLong", "Binds a {@code long} argument.", vm, DClong.IN("value", "the argument value"))
    void("ArgLongLong", "Binds a {@code long long} argument.", vm, DClonglong.IN("value", "the argument value"))
    void("ArgFloat", "Binds a {@code float} argument.", vm, DCfloat.IN("value", "the argument value"))
    void("ArgDouble", "Binds a {@code double} argument.", vm, DCdouble.IN("value", "the argument value"))
    void("ArgPointer", "Binds a pointer argument.", vm, nullable..DCpointer.IN("value", "the argument value"))
    void(
        "ArgStruct",
        "Binds a struct argument.",

        vm,
        DCstruct_p.IN("s", ""),
        DCpointer.IN("value", "the argument value")
    )

    val CallDoc =
        """
        Calls the function specified by {@code funcptr} with the arguments bound to the {@code CallVM} and returns.

        After the invocation of the foreign function call, the argument values are still bound and a second call using the same arguments can be issued. If you
        need to clear the argument bindings, you have to reset the {@code CallVM}.

        """
    val funcptr = DCpointer.IN("funcptr", "the function pointer")

    DCvoid("CallVoid", CallDoc, vm, funcptr)
    DCbool("CallBool", CallDoc, vm, funcptr)
    DCchar("CallChar", CallDoc, vm, funcptr)
    DCshort("CallShort", CallDoc, vm, funcptr)
    DCint("CallInt", CallDoc, vm, funcptr)
    DClong("CallLong", CallDoc, vm, funcptr)
    DClonglong("CallLongLong", CallDoc, vm, funcptr)
    DCfloat("CallFloat", CallDoc, vm, funcptr)
    DCdouble("CallDouble", CallDoc, vm, funcptr)
    DCpointer("CallPointer", CallDoc, vm, funcptr)

    void(
        "CallStruct",
        CallDoc,

        vm,
        funcptr,
        DCstruct_p.IN("s", ""),
        DCpointer.IN("returnValue", "")
    )

    DCint(
        "GetError",
        "Returns the most recent error state code.",

        vm
    )

    DCstruct_p(
        "NewStruct",
        "Creates a new struct type.",

        DCsize.IN("fieldCount", "the number of fields"),
        DCint.IN("alignment", "a custom struct alignment, or 0 to calculate automatically")
    )

    void(
        "StructField",
        "Adds a field to the specified struct.",

        DCstruct_p.IN("s", "the struct"),
        DCint.IN("type", "the field type"),
        DCint.IN("alignment", "a custom field alignment, or 0 to calculate automatically"),
        DCsize.IN("arrayLength", "1 or a higher value if the field is an array")
    )

    void(
        "SubStruct",
        "Adds a nested struct to the specified struct",

        DCstruct_p.IN("s", "the struct"),
        DCsize.IN("fieldCount", "the number of fields in the nested struct"),
        DCint.IN("alignment", "a custom nested struct alignment, or 0 to calculate automatically"),
        DCsize.IN("arrayLength", "1 or a higher value if the nested struct is an array")
    )

    void(
        "CloseStruct",
        "Completes the struct definition.",

        DCstruct_p.IN("s", "the struct to close")
    )

    DCsize(
        "StructSize",
        "Returns the size, in bytes, of the specified struct.",

        DCstruct_p.IN("s", "the struct")
    )

    DCsize(
        "StructAlignment",
        "Returns the alignment, in bytes, of the specified struct.",

        DCstruct_p.IN("s", "the struct")
    )

    void(
        "FreeStruct",
        "Frees the specified struct object.",

        DCstruct_p.IN("s", "the struct to free")
    )

    DCstruct_p(
        "DefineStruct",
        "Creates a new struct type using a signature string.",

        const..charASCII_p.IN("signature", "the struct signature")
    )
}