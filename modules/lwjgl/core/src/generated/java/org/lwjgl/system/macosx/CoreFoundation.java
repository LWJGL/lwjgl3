/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to &lt;CoreFoundation.h&gt;. */
public class CoreFoundation {

    static { Library.initialize(); }

    /** Boolean values. */
    public static final byte
        TRUE  = 1,
        FALSE = 0;

    /** Platform-independent built-in encodings; always available on all platforms. */
    public static final int
        kCFStringEncodingMacRoman      = 0,
        kCFStringEncodingWindowsLatin1 = 0x500,
        kCFStringEncodingISOLatin1     = 0x201,
        kCFStringEncodingNextStepLatin = 0xB01,
        kCFStringEncodingASCII         = 0x600,
        kCFStringEncodingUnicode       = 0x100,
        kCFStringEncodingUTF8          = 0x8000100,
        kCFStringEncodingNonLossyASCII = 0xBFF,
        kCFStringEncodingUTF16         = 0x100,
        kCFStringEncodingUTF16BE       = 0x10000100,
        kCFStringEncodingUTF16LE       = 0x14000100,
        kCFStringEncodingUTF32         = 0xC000100,
        kCFStringEncodingUTF32BE       = 0x18000100,
        kCFStringEncodingUTF32LE       = 0x1C000100;

    /** URL path styles. */
    public static final int
        kCFURLPOSIXPathStyle   = 0,
        kCFURLHFSPathStyle     = 1,
        kCFURLWindowsPathStyle = 2;

    protected CoreFoundation() {
        throw new UnsupportedOperationException();
    }

    // --- [ kCFAllocatorDefault ] ---

    @NativeType("CFAllocatorRef")
    private static native long kCFAllocatorDefault();

    /** This is a synonym for {@code NULL}, if you'd rather use a named constant. */
    public static final long kCFAllocatorDefault = kCFAllocatorDefault();

    // --- [ kCFAllocatorSystemDefault ] ---

    @NativeType("CFAllocatorRef")
    private static native long kCFAllocatorSystemDefault();

    /** Default system allocator; you rarely need to use this. */
    public static final long kCFAllocatorSystemDefault = kCFAllocatorSystemDefault();

    // --- [ kCFAllocatorMalloc ] ---

    @NativeType("CFAllocatorRef")
    private static native long kCFAllocatorMalloc();

    /**
     * This allocator uses {@code malloc()}, {@code realloc()}, and {@code free()}. This should not be generally used; stick to {@link #kCFAllocatorDefault}
     * whenever possible. This allocator is useful as the "bytesDeallocator" in {@code CFData} or "contentsDeallocator" in {@code CFString} where the memory
     * was obtained as a result of {@code malloc()} type functions.
     */
    public static final long kCFAllocatorMalloc = kCFAllocatorMalloc();

    // --- [ kCFAllocatorMallocZone ] ---

    @NativeType("CFAllocatorRef")
    private static native long kCFAllocatorMallocZone();

    /**
     * This allocator explicitly uses the default malloc zone, returned by {@code malloc_default_zone()}. It should only be used when an object is safe to be
     * allocated in non-scanned memory.
     */
    public static final long kCFAllocatorMallocZone = kCFAllocatorMallocZone();

    // --- [ kCFAllocatorNull ] ---

    @NativeType("CFAllocatorRef")
    private static native long kCFAllocatorNull();

    /**
     * Null allocator which does nothing and allocates no memory. This allocator is useful as the "bytesDeallocator" in {@code CFData} or "contentsDeallocator"
     * in {@code CFString} where the memory should not be freed.
     */
    public static final long kCFAllocatorNull = kCFAllocatorNull();

    // --- [ kCFAllocatorUseContext ] ---

    @NativeType("CFAllocatorRef")
    private static native long kCFAllocatorUseContext();

    /** Special allocator argument to CFAllocatorCreate which means "use the functions given in the context to allocate the allocator itself as well". */
    public static final long kCFAllocatorUseContext = kCFAllocatorUseContext();

    // --- [ CFRetain ] ---

    /** Unsafe version of: {@link #CFRetain} */
    public static native long nCFRetain(long cf);

    /**
     * Retains a Core Foundation object.
     * 
     * <p>You should retain a Core Foundation object when you receive it from elsewhere (that is, you did not create or copy it) and you want it to persist. If
     * you retain a Core Foundation object you are responsible for releasing it.</p>
     *
     * @param cf the CFType object to retain
     */
    @NativeType("CFTypeRef")
    public static long CFRetain(@NativeType("CFTypeRef") long cf) {
        if (CHECKS) {
            check(cf);
        }
        return nCFRetain(cf);
    }

    // --- [ CFRelease ] ---

    /** Unsafe version of: {@link #CFRelease} */
    public static native void nCFRelease(long cf);

    /**
     * Releases a Core Foundation object.
     * 
     * <p>If the retain count of {@code cf} becomes zero the memory allocated to the object is deallocated and the object is destroyed. If you create, copy, or
     * explicitly retain (see the {@link #CFRetain} function) a Core Foundation object, you are responsible for releasing it when you no longer need it.</p>
     *
     * @param cf the CFType object to release
     */
    public static void CFRelease(@NativeType("CFTypeRef") long cf) {
        if (CHECKS) {
            check(cf);
        }
        nCFRelease(cf);
    }

    // --- [ CFBundleCreate ] ---

    /** Unsafe version of: {@link #CFBundleCreate} */
    public static native long nCFBundleCreate(long allocator, long bundleURL);

    /**
     * Creates a {@code CFBundle} object.
     *
     * @param allocator the allocator to use to allocate memory for the new object. Pass {@code NULL} or {@code kCFAllocatorDefault} to use the current default allocator.
     * @param bundleURL the location of the bundle for which to create a {@code CFBundle} object
     */
    @NativeType("CFBundleRef")
    public static long CFBundleCreate(@NativeType("CFAllocatorRef") long allocator, @NativeType("CFURLRef") long bundleURL) {
        if (CHECKS) {
            check(bundleURL);
        }
        return nCFBundleCreate(allocator, bundleURL);
    }

    // --- [ CFBundleGetBundleWithIdentifier ] ---

    /** Unsafe version of: {@link #CFBundleGetBundleWithIdentifier} */
    public static native long nCFBundleGetBundleWithIdentifier(long bundleID);

    /**
     * Locates a bundle given its program-defined identifier.
     *
     * @param bundleID the identifier of the bundle to locate. Note that identifier names are case-sensitive.
     */
    @NativeType("CFBundleRef")
    public static long CFBundleGetBundleWithIdentifier(@NativeType("CFStringRef") long bundleID) {
        if (CHECKS) {
            check(bundleID);
        }
        return nCFBundleGetBundleWithIdentifier(bundleID);
    }

    // --- [ CFBundleGetFunctionPointerForName ] ---

    /** Unsafe version of: {@link #CFBundleGetFunctionPointerForName} */
    public static native long nCFBundleGetFunctionPointerForName(long bundle, long functionName);

    /**
     * Returns a pointer to a function in a bundle’s executable code using the function name as the search key.
     *
     * @param bundle       the bundle to examine
     * @param functionName the name of the function to locate
     */
    @NativeType("void *")
    public static long CFBundleGetFunctionPointerForName(@NativeType("CFBundleRef") long bundle, @NativeType("CFStringRef") long functionName) {
        if (CHECKS) {
            check(bundle);
            check(functionName);
        }
        return nCFBundleGetFunctionPointerForName(bundle, functionName);
    }

    // --- [ CFStringCreateWithCString ] ---

    /** Unsafe version of: {@link #CFStringCreateWithCString} */
    public static native long nCFStringCreateWithCString(long allocator, long cStr, int encoding);

    /**
     * Creates an immutable string from a C string.
     *
     * @param allocator the allocator to use to allocate memory for the new object. Pass {@code NULL} or {@code kCFAllocatorDefault} to use the current default allocator.
     * @param cStr      the {@code NULL}-terminated C string to be used to create the {@code CFString} object. The string must use an 8-bit encoding.
     * @param encoding  the encoding of the characters in the C string. The encoding must specify an 8-bit encoding. One of:<br><table><tr><td>{@link #kCFStringEncodingMacRoman}</td><td>{@link #kCFStringEncodingWindowsLatin1}</td><td>{@link #kCFStringEncodingISOLatin1}</td></tr><tr><td>{@link #kCFStringEncodingNextStepLatin}</td><td>{@link #kCFStringEncodingASCII}</td><td>{@link #kCFStringEncodingUnicode}</td></tr><tr><td>{@link #kCFStringEncodingUTF8}</td><td>{@link #kCFStringEncodingNonLossyASCII}</td><td>{@link #kCFStringEncodingUTF16}</td></tr><tr><td>{@link #kCFStringEncodingUTF16BE}</td><td>{@link #kCFStringEncodingUTF16LE}</td><td>{@link #kCFStringEncodingUTF32}</td></tr><tr><td>{@link #kCFStringEncodingUTF32BE}</td><td>{@link #kCFStringEncodingUTF32LE}</td></tr></table>
     */
    @NativeType("CFStringRef")
    public static long CFStringCreateWithCString(@NativeType("CFAllocatorRef") long allocator, @NativeType("char const *") ByteBuffer cStr, @NativeType("CFStringEncoding") int encoding) {
        return nCFStringCreateWithCString(allocator, memAddress(cStr), encoding);
    }

    // --- [ CFStringCreateWithCStringNoCopy ] ---

    /** Unsafe version of: {@link #CFStringCreateWithCStringNoCopy} */
    public static native long nCFStringCreateWithCStringNoCopy(long allocator, long cStr, int encoding, long contentsDeallocator);

    /**
     * Creates a CFString object from an external C string buffer that might serve as the backing store for the object.
     *
     * @param allocator           the allocator to use to allocate memory for the new object. Pass {@code NULL} or {@code kCFAllocatorDefault} to use the current default allocator.
     * @param cStr                the {@code NULL}-terminated C string to be used to create the {@code CFString} object. The string must use an 8-bit encoding.
     * @param encoding            the encoding of the characters in the C string. The encoding must specify an 8-bit encoding. One of:<br><table><tr><td>{@link #kCFStringEncodingMacRoman}</td><td>{@link #kCFStringEncodingWindowsLatin1}</td><td>{@link #kCFStringEncodingISOLatin1}</td></tr><tr><td>{@link #kCFStringEncodingNextStepLatin}</td><td>{@link #kCFStringEncodingASCII}</td><td>{@link #kCFStringEncodingUnicode}</td></tr><tr><td>{@link #kCFStringEncodingUTF8}</td><td>{@link #kCFStringEncodingNonLossyASCII}</td><td>{@link #kCFStringEncodingUTF16}</td></tr><tr><td>{@link #kCFStringEncodingUTF16BE}</td><td>{@link #kCFStringEncodingUTF16LE}</td><td>{@link #kCFStringEncodingUTF32}</td></tr><tr><td>{@link #kCFStringEncodingUTF32BE}</td><td>{@link #kCFStringEncodingUTF32LE}</td></tr></table>
     * @param contentsDeallocator the {@code CFAllocator} object to use to deallocate the external string buffer when it is no longer needed. You can pass {@code NULL} or
     *                            {@code kCFAllocatorDefault} to request the default allocator for this purpose. If the buffer does not need to be deallocated, or if you want to
     *                            assume responsibility for deallocating the buffer (and not have the {@code CFString} object deallocate it), pass {@code kCFAllocatorNull}.
     */
    @NativeType("CFStringRef")
    public static long CFStringCreateWithCStringNoCopy(@NativeType("CFAllocatorRef") long allocator, @NativeType("char const *") ByteBuffer cStr, @NativeType("CFStringEncoding") int encoding, @NativeType("CFAllocatorRef") long contentsDeallocator) {
        return nCFStringCreateWithCStringNoCopy(allocator, memAddress(cStr), encoding, contentsDeallocator);
    }

    // --- [ CFURLCreateWithFileSystemPath ] ---

    /** Unsafe version of: {@link #CFURLCreateWithFileSystemPath} */
    public static native long nCFURLCreateWithFileSystemPath(long allocator, long filePath, long pathStyle, boolean isDirectory);

    /**
     * Creates a {@code CFURL} object using a local file system path string.
     *
     * @param allocator   the allocator to use to allocate memory for the new object. Pass {@code NULL} or {@code kCFAllocatorDefault} to use the current default allocator.
     * @param filePath    the path string to convert to a {@code CFURL} object. If {@code filePath} is not absolute, the resulting URL will be considered relative to the
     *                    current working directory (evaluated when this function is being invoked).
     * @param pathStyle   the operating system path style used in {@code filePath}. One of:<br><table><tr><td>{@link #kCFURLPOSIXPathStyle}</td><td>{@link #kCFURLHFSPathStyle}</td><td>{@link #kCFURLWindowsPathStyle}</td></tr></table>
     * @param isDirectory a Boolean value that specifies whether filePath is treated as a directory path when resolving against relative path components. Pass true if the
     *                    pathname indicates a directory, false otherwise.
     */
    @NativeType("CFURLRef")
    public static long CFURLCreateWithFileSystemPath(@NativeType("CFAllocatorRef") long allocator, @NativeType("CFStringRef") long filePath, @NativeType("CFURLPathStyle") long pathStyle, @NativeType("Boolean") boolean isDirectory) {
        if (CHECKS) {
            check(filePath);
        }
        return nCFURLCreateWithFileSystemPath(allocator, filePath, pathStyle, isDirectory);
    }

}