/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC10 = "ALC10".nativeClassALC("ALC10") {
    IntConstant(
        "INVALID"..0xFFFFFFFF.i,
        "FALSE"..0x0,
        "TRUE"..0x1
    )

    IntConstant(
        "FREQUENCY"..0x1007,
        "REFRESH"..0x1008,
        "SYNC"..0x1009
    )

    IntConstant(
        "NO_ERROR"..0x0,
        "INVALID_DEVICE"..0xA001,
        "INVALID_CONTEXT"..0xA002,
        "INVALID_ENUM"..0xA003,
        "INVALID_VALUE"..0xA004,
        "OUT_OF_MEMORY"..0xA005
    )

    IntConstant(
        "DEFAULT_DEVICE_SPECIFIER"..0x1004,
        "DEVICE_SPECIFIER"..0x1005,
        "EXTENSIONS"..0x1006
    )

    IntConstant(
        "MAJOR_VERSION"..0x1000,
        "MINOR_VERSION"..0x1001,
        "ATTRIBUTES_SIZE"..0x1002,
        "ALL_ATTRIBUTES"..0x1003
    )

    ALCdevice.p(
        "OpenDevice",

        nullable..ALCcharUTF8.const.p("deviceSpecifier")
    )

    ALCboolean(
        "CloseDevice",

        ALCdevice.const.p("deviceHandle")
    )

    ALCcontext.p(
        "CreateContext",

        ALCdevice.const.p("deviceHandle"),
        nullable..NullTerminated..ALCint.const.p("attrList")
    )

    ALCboolean(
        "MakeContextCurrent",

        nullable..ALCcontext.p("context")
    )

    ALCvoid(
        "ProcessContext",

        ALCcontext.p("context")
    )

    ALCvoid(
        "SuspendContext",

        ALCcontext.p("context")
    )

    ALCvoid(
        "DestroyContext",

        ALCcontext.p("context")
    )

    ALCcontext.p(
        "GetCurrentContext",
        void()
    )

    ALCdevice.p(
        "GetContextsDevice",

        ALCcontext.p("context")
    )

    ALCboolean(
        "IsExtensionPresent",

        nullable..ALCdevice.const.p("deviceHandle"),
        ALCcharASCII.const.p("extName")
    )

    "ALCvoid".opaque.p(
        "GetProcAddress",

        nullable..ALCdevice.const.p("deviceHandle"),
        ALcharASCII.const.p("funcName")
    )

    ALCenum(
        "GetEnumValue",

        nullable..ALCdevice.const.p("deviceHandle"),
        ALCcharASCII.const.p("enumName")
    )

    ALCenum(
        "GetError",

        nullable..ALCdevice.p("deviceHandle")
    )

    ALCcharUTF8.const.p(
        "GetString",

        nullable..ALCdevice.p("deviceHandle"),
        ALCenum("token")
    )

    ALCvoid(
        "GetIntegerv",

        nullable..ALCdevice.p("deviceHandle"),
        ALCenum("token"),
        AutoSize("dest")..ALCsizei("size"),
        ReturnParam..ALCint.p("dest")
    )

}