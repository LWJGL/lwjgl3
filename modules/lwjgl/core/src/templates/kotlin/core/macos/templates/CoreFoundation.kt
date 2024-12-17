/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.macos.templates

import org.lwjgl.generator.*
import core.macos.*

val ALLOCATOR = nullable..Parameter(CFAllocatorRef, "allocator")

val CoreFoundation = "CoreFoundation".nativeClass(Module.CORE_MACOS, nativeSubPath = "macos") {
    nativeImport("<CoreFoundation/CoreFoundation.h>")

    // -----------------------------------------------
    // CFBase.h

    ByteConstant(
        "TRUE".."1",
        "FALSE".."0"
    )

    macro..CFAllocatorRef("kCFAllocatorDefault", void())
    macro..CFAllocatorRef("kCFAllocatorSystemDefault", void())
    macro..CFAllocatorRef(
        "kCFAllocatorMalloc",
        void()
    )
    macro..CFAllocatorRef(
        "kCFAllocatorMallocZone",
        void()
    )
    macro..CFAllocatorRef(
        "kCFAllocatorNull",
        void()
    )
    macro..CFAllocatorRef(
        "kCFAllocatorUseContext",
        void()
    )

    CFTypeRef(
        "CFRetain",

        CFTypeRef("cf")
    )

    void(
        "CFRelease",

        CFTypeRef("cf")
    )

    // -----------------------------------------------
    // CFBundle.h

    CFBundleRef(
        "CFBundleCreate",

        ALLOCATOR,
        CFURLRef("bundleURL")
    )

    CFBundleRef(
        "CFBundleGetBundleWithIdentifier",

        CFStringRef("bundleID")
    )

    opaque_p(
        "CFBundleGetFunctionPointerForName",

        CFBundleRef("bundle"),
        CFStringRef("functionName")
    )

    // -----------------------------------------------
    // CFString.h

    IntConstant(
        "kCFStringEncodingMacRoman".."0",
        "kCFStringEncodingWindowsLatin1"..0x0500,
        "kCFStringEncodingISOLatin1"..0x0201,
        "kCFStringEncodingNextStepLatin"..0x0B01,
        "kCFStringEncodingASCII"..0x0600,
        "kCFStringEncodingUnicode"..0x0100,
        "kCFStringEncodingUTF8"..0x08000100,
        "kCFStringEncodingNonLossyASCII"..0x0BFF,
        "kCFStringEncodingUTF16"..0x0100,
        "kCFStringEncodingUTF16BE"..0x10000100,
        "kCFStringEncodingUTF16LE"..0x14000100,
        "kCFStringEncodingUTF32"..0x0c000100,
        "kCFStringEncodingUTF32BE"..0x18000100,
        "kCFStringEncodingUTF32LE"..0x1c000100
    )

    CFStringRef(
        "CFStringCreateWithCString",

        ALLOCATOR,
        Unsafe..char.const.p("cStr"),
        CFStringEncoding("encoding")
    )

    CFStringRef(
        "CFStringCreateWithCStringNoCopy",

        ALLOCATOR,
        Unsafe..char.const.p("cStr"),
        CFStringEncoding("encoding"),
        nullable..CFAllocatorRef("contentsDeallocator")
    )

    // -----------------------------------------------
    // CFURL.h

    IntConstant(
        "kCFURLPOSIXPathStyle".."0",
        "kCFURLHFSPathStyle".."1",
        "kCFURLWindowsPathStyle".."2"
    )

    CFURLRef(
        "CFURLCreateWithFileSystemPath",

        ALLOCATOR,
        CFStringRef("filePath"),
        CFURLPathStyle("pathStyle"),
        core.macos.Boolean("isDirectory")
    )

}