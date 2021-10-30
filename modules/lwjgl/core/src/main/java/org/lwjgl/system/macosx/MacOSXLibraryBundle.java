/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.*;

import javax.annotation.*;
import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.macosx.CoreFoundation.*;

/** Implements a {@link SharedLibrary} on the macOS using {@code CFBundle}. */
public class MacOSXLibraryBundle extends MacOSXLibrary {

    public MacOSXLibraryBundle(String name, long bundleRef) {
        super(name, bundleRef);
    }

    public static MacOSXLibraryBundle getWithIdentifier(String bundleID) {
        long filePath = NULL;
        try (MemoryStack stack = stackPush()) {
            filePath = CString2CFString(stack.UTF8(bundleID), kCFStringEncodingUTF8);

            long bundleRef = CFBundleGetBundleWithIdentifier(filePath);
            if (bundleRef == NULL) {
                throw new UnsatisfiedLinkError("Failed to retrieve bundle with identifier: " + bundleID);
            }

            CFRetain(bundleRef);
            return new MacOSXLibraryBundle(bundleID, bundleRef);
        } finally {
            if (filePath != NULL) {
                CFRelease(filePath);
            }
        }
    }

    public static MacOSXLibraryBundle create(String path) {
        long filePath = NULL;
        long url      = NULL;
        try (MemoryStack stack = stackPush()) {
            filePath = CString2CFString(stack.UTF8(path), kCFStringEncodingUTF8);
            url = check(CFURLCreateWithFileSystemPath(NULL, filePath, kCFURLPOSIXPathStyle, true));

            long bundleRef = CFBundleCreate(NULL, url);
            if (bundleRef == NULL) {
                throw new UnsatisfiedLinkError("Failed to create bundle: " + path);
            }

            return new MacOSXLibraryBundle(path, bundleRef);
        } finally {
            if (url != NULL) {
                CFRelease(url);
            }
            if (filePath != NULL) {
                CFRelease(filePath);
            }
        }
    }

    @Nullable
    @Override public String getPath() {
        return null;
    }

    @Override
    public long getFunctionAddress(ByteBuffer functionName) {
        long nameRef = CString2CFString(functionName, kCFStringEncodingASCII);
        try {
            return CFBundleGetFunctionPointerForName(address(), nameRef);
        } finally {
            CFRelease(nameRef);
        }
    }

    private static long CString2CFString(ByteBuffer name, int encoding) {
        return check(CFStringCreateWithCStringNoCopy(NULL, name, encoding, kCFAllocatorNull));
    }

    @Override
    public void free() {
        CFRelease(address());
    }

}