/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.nfd;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Bindings to <a href="https://github.com/btzy/nativefiledialog-extended">Native File Dialog Extended</a>, a small C library that portably invokes native
 * file open, folder select and file save dialogs. Write dialog code once and have it pop up native dialogs on all supported platforms.
 * 
 * <h3>Usage</h3>
 * 
 * <ul>
 * <li><a href="https://github.com/LWJGL/lwjgl3/blob/master/modules/samples/src/test/java/org/lwjgl/demo/util/nfd/HelloNFD.java#L115">Single file open dialog</a></li>
 * <li><a href="https://github.com/LWJGL/lwjgl3/blob/master/modules/samples/src/test/java/org/lwjgl/demo/util/nfd/HelloNFD.java#L133">Multiple file open dialog</a></li>
 * <li><a href="https://github.com/LWJGL/lwjgl3/blob/master/modules/samples/src/test/java/org/lwjgl/demo/util/nfd/HelloNFD.java#L184">Save dialog</a></li>
 * </ul>
 * 
 * <h3>File Filter Syntax</h3>
 * 
 * <p>Files can be filtered by file extension groups:</p>
 * 
 * <pre><code>
 * nfdfilteritem_t filterItem[2] = { { "Source code", "c,cpp,cc" }, { "Headers", "h,hpp" } };</code></pre>
 * 
 * <p>A file filter is a pair of strings comprising the friendly name and the specification (multiple file extensions are comma-separated).</p>
 * 
 * <p>A list of file filters can be passed as an argument when invoking the library.</p>
 * 
 * <p>A wildcard filter is always added to every dialog.</p>
 * 
 * <p>Note: On MacOS, the file dialogs do not have friendly names and there is no way to switch between filters, so the filter specifications are combined
 * (e.g. "c,cpp,cc,h,hpp"). The filter specification is also never explicitly shown to the user. This is usual MacOS behaviour and users expect it.</p>
 * 
 * <p>Note 2: You must ensure that the specification string is non-empty and that every file extension has at least one character. Otherwise, bad things
 * might ensue (i.e. undefined behaviour).</p>
 * 
 * <p>Note 3: On Linux, the file extension is appended (if missing) when the user presses down the "Save" button. The appended file extension will remain
 * visible to the user, even if an overwrite prompt is shown and the user then presses "Cancel".</p>
 * 
 * <p>Note 4: On Windows, the default folder parameter is only used if there is no recently used folder available. Otherwise, the default folder will be the
 * folder that was last used. Internally, the Windows implementation calls {@code IFileDialog::SetDefaultFolder(IShellItem)}. This is usual Windows
 * behaviour and users expect it.</p>
 * 
 * <h3>Iterating Over PathSets</h3>
 * 
 * <p>A file open dialog that supports multiple selection produces a {@code PathSet}, which is a thin abstraction over the platform-specific collection.
 * There are two ways to iterate over a {@code PathSet}:</p>
 * 
 * <h4>Accessing by index</h4>
 * 
 * <p>This method does array-like access on the {@code PathSet}, and is the easiest to use. However, on certain platforms (Linux, and possibly Windows), it
 * takes O(N<sup>2</sup>) time in total to iterate the entire {@code PathSet}, because the underlying platform-specific implementation uses a linked list.</p>
 * 
 * <h4>Using an enumerator</h4>
 * 
 * <p>This method uses an enumerator object to iterate the paths in the {@code PathSet}. It is guaranteed to take O(N) time in total to iterate the entire
 * {@code PathSet}.</p>
 * 
 * <h3>Usage with a Platform Abstraction Framework</h3>
 * 
 * <p>NFDe is known to work with SDL2 and GLFW, and should also work with other platform abstraction framworks. However, you should initialize NFDe after
 * initializing the framework, and probably should deinitialize NFDe before deinitializing the framework. This is because some frameworks expect to be
 * initialized on a "clean slate", and they may configure the system in a different way from NFDe. {@link #NFD_Init Init} is generally very careful not to disrupt the
 * existing configuration unless necessary, and {@link #NFD_Quit Quit} restores the configuration back exactly to what it was before initialization.</p>
 * 
 * <h3>Known Limitations</h3>
 * 
 * <ul>
 * <li>No support for Windows XP's legacy dialogs such as {@code GetOpenFileName}.</li>
 * <li>GTK dialogs don't set the existing window as parent, so if users click the existing window while the dialog is open then the dialog will go behind
 * it. GTK writes a warning to {@code stdout} or {@code stderr} about this.</li>
 * <li>This library does not explicitly dispatch calls to the UI thread. This may lead to crashes if you call functions from other threads when the
 * platform does not support it (e.g. MacOS). Users are generally expected to call NFDe from an appropriate UI thread (i.e. the thread performing the
 * UI event loop).</li>
 * </ul>
 */
public class NativeFileDialog {

    static { LibNFD.initialize(); }

    /**
     * Result values. ({@code nfdresult_t})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NFD_ERROR ERROR} - Programmatic error.</li>
     * <li>{@link #NFD_OKAY OKAY} - User pressed okay, or successful return.</li>
     * <li>{@link #NFD_CANCEL CANCEL} - User pressed cancel.</li>
     * </ul>
     */
    public static final int
        NFD_ERROR  = 0,
        NFD_OKAY   = 1,
        NFD_CANCEL = 2;

    protected NativeFileDialog() {
        throw new UnsupportedOperationException();
    }

    // --- [ NFD_FreePath ] ---

    /** Unsafe version of: {@link #NFD_FreePath FreePath} */
    public static native void nNFD_FreePath(long filePath);

    /** Free a file path that was returned by the dialogs. */
    public static void NFD_FreePath(@NativeType("nfdchar_t *") ByteBuffer filePath) {
        if (CHECKS) {
            checkNT1(filePath);
        }
        nNFD_FreePath(memAddress(filePath));
    }

    /** Free a file path that was returned by the dialogs. */
    public static void NFD_FreePath(@NativeType("nfdchar_t *") long filePath) {
        nNFD_FreePath(filePath);
    }

    // --- [ NFD_Init ] ---

    /** Initialize NFD - call this for every thread that might use NFD, before calling any other NFD functions on that thread. */
    @NativeType("nfdresult_t")
    public static native int NFD_Init();

    // --- [ NFD_Quit ] ---

    /** Call this to de-initialize NFD, if {@link #NFD_Init Init} returned {@link #NFD_OKAY OKAY}. */
    public static native void NFD_Quit();

    // --- [ NFD_OpenDialog ] ---

    /**
     * Unsafe version of: {@link #NFD_OpenDialog OpenDialog}
     *
     * @param filterCount if zero, {@code filterList} is ignored (you can use {@code NULL})
     */
    public static native int nNFD_OpenDialog(long outPath, long filterList, int filterCount, long defaultPath);

    /**
     * Single file open dialog.
     * 
     * <p>It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePath FreePath} if this function returns {@link #NFD_OKAY OKAY}.</p>
     *
     * @param defaultPath if {@code NULL}, the operating system will decide
     */
    @NativeType("nfdresult_t")
    public static int NFD_OpenDialog(@NativeType("nfdchar_t **") PointerBuffer outPath, @Nullable @NativeType("nfdfilteritem_t const *") NFDFilterItem.Buffer filterList, @Nullable @NativeType("nfdchar_t const *") ByteBuffer defaultPath) {
        if (CHECKS) {
            check(outPath, 1);
            checkNT1Safe(defaultPath);
            if (filterList != null) { Struct.validate(filterList.address(), remainingSafe(filterList), NFDFilterItem.SIZEOF, NFDFilterItem::validate); }
        }
        return nNFD_OpenDialog(memAddress(outPath), memAddressSafe(filterList), remainingSafe(filterList), memAddressSafe(defaultPath));
    }

    /**
     * Single file open dialog.
     * 
     * <p>It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePath FreePath} if this function returns {@link #NFD_OKAY OKAY}.</p>
     *
     * @param defaultPath if {@code NULL}, the operating system will decide
     */
    @NativeType("nfdresult_t")
    public static int NFD_OpenDialog(@NativeType("nfdchar_t **") PointerBuffer outPath, @Nullable @NativeType("nfdfilteritem_t const *") NFDFilterItem.Buffer filterList, @Nullable @NativeType("nfdchar_t const *") CharSequence defaultPath) {
        if (CHECKS) {
            check(outPath, 1);
            if (filterList != null) { Struct.validate(filterList.address(), remainingSafe(filterList), NFDFilterItem.SIZEOF, NFDFilterItem::validate); }
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(defaultPath, true);
            long defaultPathEncoded = defaultPath == null ? NULL : stack.getPointerAddress();
            return nNFD_OpenDialog(memAddress(outPath), memAddressSafe(filterList), remainingSafe(filterList), defaultPathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ NFD_OpenDialogMultiple ] ---

    /**
     * Unsafe version of: {@link #NFD_OpenDialogMultiple OpenDialogMultiple}
     *
     * @param filterCount if zero, {@code filterList} is ignored (you can use {@code NULL})
     */
    public static native int nNFD_OpenDialogMultiple(long outPath, long filterList, int filterCount, long defaultPath);

    /**
     * Multiple file open dialog.
     * 
     * <p>It is the caller's responsibility to free {@code outPaths} via {@link #NFD_PathSet_Free PathSet_Free} if this function returns {@link #NFD_OKAY OKAY}.</p>
     *
     * @param defaultPath if {@code NULL}, the operating system will decide
     */
    @NativeType("nfdresult_t")
    public static int NFD_OpenDialogMultiple(@NativeType("nfdpathset_t const **") PointerBuffer outPath, @Nullable @NativeType("nfdfilteritem_t const *") NFDFilterItem.Buffer filterList, @Nullable @NativeType("nfdchar_t const *") ByteBuffer defaultPath) {
        if (CHECKS) {
            check(outPath, 1);
            checkNT1Safe(defaultPath);
            if (filterList != null) { Struct.validate(filterList.address(), remainingSafe(filterList), NFDFilterItem.SIZEOF, NFDFilterItem::validate); }
        }
        return nNFD_OpenDialogMultiple(memAddress(outPath), memAddressSafe(filterList), remainingSafe(filterList), memAddressSafe(defaultPath));
    }

    /**
     * Multiple file open dialog.
     * 
     * <p>It is the caller's responsibility to free {@code outPaths} via {@link #NFD_PathSet_Free PathSet_Free} if this function returns {@link #NFD_OKAY OKAY}.</p>
     *
     * @param defaultPath if {@code NULL}, the operating system will decide
     */
    @NativeType("nfdresult_t")
    public static int NFD_OpenDialogMultiple(@NativeType("nfdpathset_t const **") PointerBuffer outPath, @Nullable @NativeType("nfdfilteritem_t const *") NFDFilterItem.Buffer filterList, @Nullable @NativeType("nfdchar_t const *") CharSequence defaultPath) {
        if (CHECKS) {
            check(outPath, 1);
            if (filterList != null) { Struct.validate(filterList.address(), remainingSafe(filterList), NFDFilterItem.SIZEOF, NFDFilterItem::validate); }
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(defaultPath, true);
            long defaultPathEncoded = defaultPath == null ? NULL : stack.getPointerAddress();
            return nNFD_OpenDialogMultiple(memAddress(outPath), memAddressSafe(filterList), remainingSafe(filterList), defaultPathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ NFD_SaveDialog ] ---

    /**
     * Unsafe version of: {@link #NFD_SaveDialog SaveDialog}
     *
     * @param filterCount if zero, {@code filterList} is ignored (you can use {@code NULL})
     */
    public static native int nNFD_SaveDialog(long outPath, long filterList, int filterCount, long defaultPath, long defaultName);

    /**
     * Save dialog.
     * 
     * <p>It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePath FreePath} if this function returns {@link #NFD_OKAY OKAY}.</p>
     *
     * @param defaultPath if {@code NULL}, the operating system will decide
     */
    @NativeType("nfdresult_t")
    public static int NFD_SaveDialog(@NativeType("nfdchar_t **") PointerBuffer outPath, @Nullable @NativeType("nfdfilteritem_t const *") NFDFilterItem.Buffer filterList, @Nullable @NativeType("nfdchar_t const *") ByteBuffer defaultPath, @Nullable @NativeType("nfdchar_t const *") ByteBuffer defaultName) {
        if (CHECKS) {
            check(outPath, 1);
            checkNT1Safe(defaultPath);
            checkNT1Safe(defaultName);
            if (filterList != null) { Struct.validate(filterList.address(), remainingSafe(filterList), NFDFilterItem.SIZEOF, NFDFilterItem::validate); }
        }
        return nNFD_SaveDialog(memAddress(outPath), memAddressSafe(filterList), remainingSafe(filterList), memAddressSafe(defaultPath), memAddressSafe(defaultName));
    }

    /**
     * Save dialog.
     * 
     * <p>It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePath FreePath} if this function returns {@link #NFD_OKAY OKAY}.</p>
     *
     * @param defaultPath if {@code NULL}, the operating system will decide
     */
    @NativeType("nfdresult_t")
    public static int NFD_SaveDialog(@NativeType("nfdchar_t **") PointerBuffer outPath, @Nullable @NativeType("nfdfilteritem_t const *") NFDFilterItem.Buffer filterList, @Nullable @NativeType("nfdchar_t const *") CharSequence defaultPath, @Nullable @NativeType("nfdchar_t const *") CharSequence defaultName) {
        if (CHECKS) {
            check(outPath, 1);
            if (filterList != null) { Struct.validate(filterList.address(), remainingSafe(filterList), NFDFilterItem.SIZEOF, NFDFilterItem::validate); }
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(defaultPath, true);
            long defaultPathEncoded = defaultPath == null ? NULL : stack.getPointerAddress();
            stack.nUTF8Safe(defaultName, true);
            long defaultNameEncoded = defaultName == null ? NULL : stack.getPointerAddress();
            return nNFD_SaveDialog(memAddress(outPath), memAddressSafe(filterList), remainingSafe(filterList), defaultPathEncoded, defaultNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ NFD_PickFolder ] ---

    /** Unsafe version of: {@link #NFD_PickFolder PickFolder} */
    public static native int nNFD_PickFolder(long outPath, long defaultPath);

    /**
     * Select folder dialog.
     * 
     * <p>It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePath FreePath} if this function returns {@link #NFD_OKAY OKAY}.</p>
     *
     * @param defaultPath if {@code NULL}, the operating system will decide
     */
    @NativeType("nfdresult_t")
    public static int NFD_PickFolder(@NativeType("nfdchar_t **") PointerBuffer outPath, @Nullable @NativeType("nfdchar_t const *") ByteBuffer defaultPath) {
        if (CHECKS) {
            check(outPath, 1);
            checkNT1Safe(defaultPath);
        }
        return nNFD_PickFolder(memAddress(outPath), memAddressSafe(defaultPath));
    }

    /**
     * Select folder dialog.
     * 
     * <p>It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePath FreePath} if this function returns {@link #NFD_OKAY OKAY}.</p>
     *
     * @param defaultPath if {@code NULL}, the operating system will decide
     */
    @NativeType("nfdresult_t")
    public static int NFD_PickFolder(@NativeType("nfdchar_t **") PointerBuffer outPath, @Nullable @NativeType("nfdchar_t const *") CharSequence defaultPath) {
        if (CHECKS) {
            check(outPath, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(defaultPath, true);
            long defaultPathEncoded = defaultPath == null ? NULL : stack.getPointerAddress();
            return nNFD_PickFolder(memAddress(outPath), defaultPathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ NFD_GetError ] ---

    /** Unsafe version of: {@link #NFD_GetError GetError} */
    public static native long nNFD_GetError();

    /**
     * Get last error -- set when {@code nfdresult_t} returns {@link #NFD_ERROR ERROR}. 
     * 
     * <p>Returns the last error that was set, or {@code NULL} if there is no error. The memory is owned by NFD and should not be freed by user code. This is
     * <b>always</b> ASCII printable characters, so it can be interpreted as UTF-8 without any conversion.</p>
     */
    @Nullable
    @NativeType("char const *")
    public static String NFD_GetError() {
        long __result = nNFD_GetError();
        return memUTF8Safe(__result);
    }

    // --- [ NFD_ClearError ] ---

    /** Clear the error */
    public static native void NFD_ClearError();

    // --- [ NFD_PathSet_GetCount ] ---

    /** Unsafe version of: {@link #NFD_PathSet_GetCount PathSet_GetCount} */
    public static native int nNFD_PathSet_GetCount(long pathSet, long count);

    /**
     * Gets the number of entries stored in {@code pathSet}.
     * 
     * <p>Note that some paths might be invalid ({@link #NFD_ERROR ERROR} will be returned by {@link #NFD_PathSet_GetPath PathSet_GetPath}), so we might not actually have this number of usable paths.</p>
     */
    @NativeType("nfdresult_t")
    public static int NFD_PathSet_GetCount(@NativeType("nfdpathset_t const *") long pathSet, @NativeType("nfdpathsetsize_t *") IntBuffer count) {
        if (CHECKS) {
            check(pathSet);
            check(count, 1);
        }
        return nNFD_PathSet_GetCount(pathSet, memAddress(count));
    }

    // --- [ NFD_PathSet_GetPath ] ---

    /** Unsafe version of: {@link #NFD_PathSet_GetPath PathSet_GetPath} */
    public static native int nNFD_PathSet_GetPath(long pathSet, int index, long outPath);

    /**
     * Gets the UTF-8 path at offset index.
     * 
     * <p>It is the caller's responsibility to free {@code outPath} via {@link #NFD_PathSet_FreePath PathSet_FreePath} if this function returns {@link #NFD_OKAY OKAY}.</p>
     */
    @NativeType("nfdresult_t")
    public static int NFD_PathSet_GetPath(@NativeType("nfdpathset_t const *") long pathSet, @NativeType("nfdpathsetsize_t") int index, @NativeType("nfdchar_t **") PointerBuffer outPath) {
        if (CHECKS) {
            check(pathSet);
            check(outPath, 1);
        }
        return nNFD_PathSet_GetPath(pathSet, index, memAddress(outPath));
    }

    // --- [ NFD_PathSet_FreePath ] ---

    /** Unsafe version of: {@link #NFD_PathSet_FreePath PathSet_FreePath} */
    public static native void nNFD_PathSet_FreePath(long filePath);

    /** Free the path gotten by {@link #NFD_PathSet_GetPath PathSet_GetPath}. */
    public static void NFD_PathSet_FreePath(@NativeType("nfdchar_t *") ByteBuffer filePath) {
        if (CHECKS) {
            checkNT1(filePath);
        }
        nNFD_PathSet_FreePath(memAddress(filePath));
    }

    /** Free the path gotten by {@link #NFD_PathSet_GetPath PathSet_GetPath}. */
    public static void NFD_PathSet_FreePath(@NativeType("nfdchar_t *") long filePath) {
        nNFD_PathSet_FreePath(filePath);
    }

    // --- [ NFD_PathSet_GetEnum ] ---

    /** Unsafe version of: {@link #NFD_PathSet_GetEnum PathSet_GetEnum} */
    public static native int nNFD_PathSet_GetEnum(long pathSet, long outEnumerator);

    /**
     * Gets an enumerator of the path set.
     * 
     * <p>It is the caller's responsibility to free {@code enumerator} via {@link #NFD_PathSet_FreeEnum PathSet_FreeEnum} if this function returns {@link #NFD_OKAY OKAY}, and it should be freed before
     * freeing the pathset.</p>
     */
    @NativeType("nfdresult_t")
    public static int NFD_PathSet_GetEnum(@NativeType("nfdpathset_t const *") long pathSet, @NativeType("nfdpathsetenum_t *") NFDPathSetEnum outEnumerator) {
        if (CHECKS) {
            check(pathSet);
        }
        return nNFD_PathSet_GetEnum(pathSet, outEnumerator.address());
    }

    // --- [ NFD_PathSet_FreeEnum ] ---

    /** Unsafe version of: {@link #NFD_PathSet_FreeEnum PathSet_FreeEnum} */
    public static native void nNFD_PathSet_FreeEnum(long enumerator);

    /** Frees an enumerator of the path set. */
    public static void NFD_PathSet_FreeEnum(@NativeType("nfdpathsetenum_t *") NFDPathSetEnum enumerator) {
        nNFD_PathSet_FreeEnum(enumerator.address());
    }

    // --- [ NFD_PathSet_EnumNext ] ---

    /** Unsafe version of: {@link #NFD_PathSet_EnumNext PathSet_EnumNext} */
    public static native int nNFD_PathSet_EnumNext(long enumerator, long outPath);

    /**
     * Gets the next item from the path set enumerator.
     * 
     * <p>If there are no more items, then {@code *outPaths} will be set to {@code NULL}.</p>
     * 
     * <p>It is the caller's responsibility to free {@code *outPath} via {@link #NFD_PathSet_FreePath PathSet_FreePath} if this function returns {@link #NFD_OKAY OKAY} and {@code *outPath} is not null.</p>
     */
    @NativeType("nfdresult_t")
    public static int NFD_PathSet_EnumNext(@NativeType("nfdpathsetenum_t *") NFDPathSetEnum enumerator, @NativeType("nfdchar_t **") PointerBuffer outPath) {
        if (CHECKS) {
            check(outPath, 1);
        }
        return nNFD_PathSet_EnumNext(enumerator.address(), memAddress(outPath));
    }

    // --- [ NFD_PathSet_Free ] ---

    /** Unsafe version of: {@link #NFD_PathSet_Free PathSet_Free} */
    public static native void nNFD_PathSet_Free(long pathSet);

    /** Free the {@code pathSet}. */
    public static void NFD_PathSet_Free(@NativeType("nfdpathset_t const *") long pathSet) {
        if (CHECKS) {
            check(pathSet);
        }
        nNFD_PathSet_Free(pathSet);
    }

    /** Array version of: {@link #nNFD_PathSet_GetCount} */
    public static native int nNFD_PathSet_GetCount(long pathSet, int[] count);

    /** Array version of: {@link #NFD_PathSet_GetCount PathSet_GetCount} */
    @NativeType("nfdresult_t")
    public static int NFD_PathSet_GetCount(@NativeType("nfdpathset_t const *") long pathSet, @NativeType("nfdpathsetsize_t *") int[] count) {
        if (CHECKS) {
            check(pathSet);
            check(count, 1);
        }
        return nNFD_PathSet_GetCount(pathSet, count);
    }

}