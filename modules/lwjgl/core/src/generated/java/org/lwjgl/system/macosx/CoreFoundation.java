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

public class CoreFoundation {

    static { Library.initialize(); }

    public static final byte
        TRUE  = 1,
        FALSE = 0;

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

    /** {@code CFAllocatorRef kCFAllocatorDefault(void)} */
    public static final long kCFAllocatorDefault = kCFAllocatorDefault();

    // --- [ kCFAllocatorSystemDefault ] ---

    @NativeType("CFAllocatorRef")
    private static native long kCFAllocatorSystemDefault();

    /** {@code CFAllocatorRef kCFAllocatorSystemDefault(void)} */
    public static final long kCFAllocatorSystemDefault = kCFAllocatorSystemDefault();

    // --- [ kCFAllocatorMalloc ] ---

    @NativeType("CFAllocatorRef")
    private static native long kCFAllocatorMalloc();

    /** {@code CFAllocatorRef kCFAllocatorMalloc(void)} */
    public static final long kCFAllocatorMalloc = kCFAllocatorMalloc();

    // --- [ kCFAllocatorMallocZone ] ---

    @NativeType("CFAllocatorRef")
    private static native long kCFAllocatorMallocZone();

    /** {@code CFAllocatorRef kCFAllocatorMallocZone(void)} */
    public static final long kCFAllocatorMallocZone = kCFAllocatorMallocZone();

    // --- [ kCFAllocatorNull ] ---

    @NativeType("CFAllocatorRef")
    private static native long kCFAllocatorNull();

    /** {@code CFAllocatorRef kCFAllocatorNull(void)} */
    public static final long kCFAllocatorNull = kCFAllocatorNull();

    // --- [ kCFAllocatorUseContext ] ---

    @NativeType("CFAllocatorRef")
    private static native long kCFAllocatorUseContext();

    /** {@code CFAllocatorRef kCFAllocatorUseContext(void)} */
    public static final long kCFAllocatorUseContext = kCFAllocatorUseContext();

    // --- [ CFRetain ] ---

    /** {@code CFTypeRef CFRetain(CFTypeRef cf)} */
    public static native long nCFRetain(long cf);

    /** {@code CFTypeRef CFRetain(CFTypeRef cf)} */
    @NativeType("CFTypeRef")
    public static long CFRetain(@NativeType("CFTypeRef") long cf) {
        if (CHECKS) {
            check(cf);
        }
        return nCFRetain(cf);
    }

    // --- [ CFRelease ] ---

    /** {@code void CFRelease(CFTypeRef cf)} */
    public static native void nCFRelease(long cf);

    /** {@code void CFRelease(CFTypeRef cf)} */
    public static void CFRelease(@NativeType("CFTypeRef") long cf) {
        if (CHECKS) {
            check(cf);
        }
        nCFRelease(cf);
    }

    // --- [ CFBundleCreate ] ---

    /** {@code CFBundleRef CFBundleCreate(CFAllocatorRef allocator, CFURLRef bundleURL)} */
    public static native long nCFBundleCreate(long allocator, long bundleURL);

    /** {@code CFBundleRef CFBundleCreate(CFAllocatorRef allocator, CFURLRef bundleURL)} */
    @NativeType("CFBundleRef")
    public static long CFBundleCreate(@NativeType("CFAllocatorRef") long allocator, @NativeType("CFURLRef") long bundleURL) {
        if (CHECKS) {
            check(bundleURL);
        }
        return nCFBundleCreate(allocator, bundleURL);
    }

    // --- [ CFBundleGetBundleWithIdentifier ] ---

    /** {@code CFBundleRef CFBundleGetBundleWithIdentifier(CFStringRef bundleID)} */
    public static native long nCFBundleGetBundleWithIdentifier(long bundleID);

    /** {@code CFBundleRef CFBundleGetBundleWithIdentifier(CFStringRef bundleID)} */
    @NativeType("CFBundleRef")
    public static long CFBundleGetBundleWithIdentifier(@NativeType("CFStringRef") long bundleID) {
        if (CHECKS) {
            check(bundleID);
        }
        return nCFBundleGetBundleWithIdentifier(bundleID);
    }

    // --- [ CFBundleGetFunctionPointerForName ] ---

    /** {@code void * CFBundleGetFunctionPointerForName(CFBundleRef bundle, CFStringRef functionName)} */
    public static native long nCFBundleGetFunctionPointerForName(long bundle, long functionName);

    /** {@code void * CFBundleGetFunctionPointerForName(CFBundleRef bundle, CFStringRef functionName)} */
    @NativeType("void *")
    public static long CFBundleGetFunctionPointerForName(@NativeType("CFBundleRef") long bundle, @NativeType("CFStringRef") long functionName) {
        if (CHECKS) {
            check(bundle);
            check(functionName);
        }
        return nCFBundleGetFunctionPointerForName(bundle, functionName);
    }

    // --- [ CFStringCreateWithCString ] ---

    /** {@code CFStringRef CFStringCreateWithCString(CFAllocatorRef allocator, char const * cStr, CFStringEncoding encoding)} */
    public static native long nCFStringCreateWithCString(long allocator, long cStr, int encoding);

    /** {@code CFStringRef CFStringCreateWithCString(CFAllocatorRef allocator, char const * cStr, CFStringEncoding encoding)} */
    @NativeType("CFStringRef")
    public static long CFStringCreateWithCString(@NativeType("CFAllocatorRef") long allocator, @NativeType("char const *") ByteBuffer cStr, @NativeType("CFStringEncoding") int encoding) {
        return nCFStringCreateWithCString(allocator, memAddress(cStr), encoding);
    }

    // --- [ CFStringCreateWithCStringNoCopy ] ---

    /** {@code CFStringRef CFStringCreateWithCStringNoCopy(CFAllocatorRef allocator, char const * cStr, CFStringEncoding encoding, CFAllocatorRef contentsDeallocator)} */
    public static native long nCFStringCreateWithCStringNoCopy(long allocator, long cStr, int encoding, long contentsDeallocator);

    /** {@code CFStringRef CFStringCreateWithCStringNoCopy(CFAllocatorRef allocator, char const * cStr, CFStringEncoding encoding, CFAllocatorRef contentsDeallocator)} */
    @NativeType("CFStringRef")
    public static long CFStringCreateWithCStringNoCopy(@NativeType("CFAllocatorRef") long allocator, @NativeType("char const *") ByteBuffer cStr, @NativeType("CFStringEncoding") int encoding, @NativeType("CFAllocatorRef") long contentsDeallocator) {
        return nCFStringCreateWithCStringNoCopy(allocator, memAddress(cStr), encoding, contentsDeallocator);
    }

    // --- [ CFURLCreateWithFileSystemPath ] ---

    /** {@code CFURLRef CFURLCreateWithFileSystemPath(CFAllocatorRef allocator, CFStringRef filePath, CFURLPathStyle pathStyle, Boolean isDirectory)} */
    public static native long nCFURLCreateWithFileSystemPath(long allocator, long filePath, long pathStyle, boolean isDirectory);

    /** {@code CFURLRef CFURLCreateWithFileSystemPath(CFAllocatorRef allocator, CFStringRef filePath, CFURLPathStyle pathStyle, Boolean isDirectory)} */
    @NativeType("CFURLRef")
    public static long CFURLCreateWithFileSystemPath(@NativeType("CFAllocatorRef") long allocator, @NativeType("CFStringRef") long filePath, @NativeType("CFURLPathStyle") long pathStyle, @NativeType("Boolean") boolean isDirectory) {
        if (CHECKS) {
            check(filePath);
        }
        return nCFURLCreateWithFileSystemPath(allocator, filePath, pathStyle, isDirectory);
    }

}