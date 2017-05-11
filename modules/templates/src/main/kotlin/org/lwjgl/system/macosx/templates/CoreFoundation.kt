/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.macosx.templates

import org.lwjgl.generator.*
import org.lwjgl.system.macosx.*

val ALLOCATOR = nullable..CFAllocatorRef.IN(
    "allocator",
    "the allocator to use to allocate memory for the new object. Pass #NULL or {@code kCFAllocatorDefault} to use the current default allocator."
)

val CoreFoundation = "CoreFoundation".nativeClass(MACOSX_PACKAGE) {
    nativeImport(
        "MacOSXLWJGL.h"
    )

    documentation = "Native bindings to &lt;CoreFoundation.h&gt;."

    // -----------------------------------------------
    // CFBase.h

    ByteConstant(
        "Boolean values.",

        "TRUE".."1",
        "FALSE".."0"
    )

    macro..CFAllocatorRef("kCFAllocatorDefault", "This is a synonym for #NULL, if you'd rather use a named constant.")
    macro..CFAllocatorRef("kCFAllocatorSystemDefault", "Default system allocator; you rarely need to use this.")
    macro..CFAllocatorRef(
        "kCFAllocatorMalloc",
        """
        This allocator uses {@code malloc()}, {@code realloc()}, and {@code free()}. This should not be generally used; stick to #kCFAllocatorDefault()
        whenever possible. This allocator is useful as the "bytesDeallocator" in {@code CFData} or "contentsDeallocator" in {@code CFString} where the memory
        was obtained as a result of {@code malloc()} type functions.
        """
    )
    macro..CFAllocatorRef(
        "kCFAllocatorMallocZone",
        """
        This allocator explicitly uses the default malloc zone, returned by {@code malloc_default_zone()}. It should only be used when an object is safe to be
        allocated in non-scanned memory.
        """
    )
    macro..CFAllocatorRef(
        "kCFAllocatorNull",
        """
        Null allocator which does nothing and allocates no memory. This allocator is useful as the "bytesDeallocator" in {@code CFData} or "contentsDeallocator"
        in {@code CFString} where the memory should not be freed.
        """
    )
    macro..CFAllocatorRef(
        "kCFAllocatorUseContext",
        "Special allocator argument to CFAllocatorCreate which means \"use the functions given in the context to allocate the allocator itself as well\"."
    )

    CFTypeRef(
        "CFRetain",
        """
        Retains a Core Foundation object.

        You should retain a Core Foundation object when you receive it from elsewhere (that is, you did not create or copy it) and you want it to persist. If
        you retain a Core Foundation object you are responsible for releasing it.
        """,

        CFTypeRef.IN("cf", "the CFType object to retain")
    )

    void(
        "CFRelease",
        """
        Releases a Core Foundation object.

        If the retain count of {@code cf} becomes zero the memory allocated to the object is deallocated and the object is destroyed. If you create, copy, or
        explicitly retain (see the #CFRetain() function) a Core Foundation object, you are responsible for releasing it when you no longer need it.
        """,

        CFTypeRef.IN("cf", "the CFType object to release")
    )

    // -----------------------------------------------
    // CFBundle.h

    CFBundleRef(
        "CFBundleCreate",
        "Creates a {@code CFBundle} object.",

        ALLOCATOR,
        CFURLRef.IN("bundleURL", "the location of the bundle for which to create a {@code CFBundle} object")
    )

    CFBundleRef(
        "CFBundleGetBundleWithIdentifier",
        "Locates a bundle given its program-defined identifier.",

        CFStringRef.IN("bundleID", "the identifier of the bundle to locate. Note that identifier names are case-sensitive.")
    )

    opaque_p(
        "CFBundleGetFunctionPointerForName",
        "Returns a pointer to a function in a bundle’s executable code using the function name as the search key.",

        CFBundleRef.IN("bundle", "the bundle to examine"),
        CFStringRef.IN("functionName", "the name of the function to locate")
    )

    // -----------------------------------------------
    // CFString.h

    val Encodings = IntConstant(
        "Platform-independent built-in encodings; always available on all platforms.",

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
    ).javaDocLinks

    CFStringRef(
        "CFStringCreateWithCString",
        "Creates an immutable string from a C string.",

        ALLOCATOR,
        Unsafe..const..char_p.IN("cStr", "the #NULL-terminated C string to be used to create the {@code CFString} object. The string must use an 8-bit encoding."),
        CFStringEncoding.IN("encoding", "the encoding of the characters in the C string. The encoding must specify an 8-bit encoding.", Encodings)
    )

    CFStringRef(
        "CFStringCreateWithCStringNoCopy",
        "Creates a CFString object from an external C string buffer that might serve as the backing store for the object.",

        ALLOCATOR,
        Unsafe..const..char_p.IN("cStr", "the #NULL-terminated C string to be used to create the {@code CFString} object. The string must use an 8-bit encoding."),
        CFStringEncoding.IN("encoding", "the encoding of the characters in the C string. The encoding must specify an 8-bit encoding.", Encodings),
        nullable..CFAllocatorRef.IN(
            "contentsDeallocator",
            """
            the {@code CFAllocator} object to use to deallocate the external string buffer when it is no longer needed. You can pass #NULL or
            {@code kCFAllocatorDefault} to request the default allocator for this purpose. If the buffer does not need to be deallocated, or if you want to
            assume responsibility for deallocating the buffer (and not have the {@code CFString} object deallocate it), pass {@code kCFAllocatorNull}.
            """
        )
    )

    // -----------------------------------------------
    // CFURL.h

    val PathStyles = IntConstant(
        "URL path styles.",

        "kCFURLPOSIXPathStyle".."0",
        "kCFURLHFSPathStyle".."1",
        "kCFURLWindowsPathStyle".."2"
    ).javaDocLinks

    CFURLRef(
        "CFURLCreateWithFileSystemPath",
        "Creates a {@code CFURL} object using a local file system path string.",

        ALLOCATOR,
        CFStringRef.IN(
            "filePath",
            """
            the path string to convert to a {@code CFURL} object. If {@code filePath} is not absolute, the resulting URL will be considered relative to the
            current working directory (evaluated when this function is being invoked).
            """
        ),
        CFURLPathStyle.IN("pathStyle", "the operating system path style used in {@code filePath}", PathStyles),
        Boolean.IN(
            "isDirectory",
            """
            a Boolean value that specifies whether filePath is treated as a directory path when resolving against relative path components. Pass true if the
            pathname indicates a directory, false otherwise.
            """
        )
    )

}