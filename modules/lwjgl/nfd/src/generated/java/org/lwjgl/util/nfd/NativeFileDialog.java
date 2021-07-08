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
 * Bindings to <a target="_blank" href="https://github.com/mlabbe/nativefiledialog">Native File Dialog</a>, a tiny, neat C library that portably invokes native file open
 * and save dialogs. Write dialog code once and have it pop up native dialogs on all supported platforms.
 * 
 * <h3>Usage</h3>
 * 
 * <ul>
 * <li><a href="https://github.com/LWJGL/lwjgl3/blob/master/modules/samples/src/test/java/org/lwjgl/demo/util/nfd/HelloNFD.java#L97">Single file open dialog</a></li>
 * <li><a href="https://github.com/LWJGL/lwjgl3/blob/master/modules/samples/src/test/java/org/lwjgl/demo/util/nfd/HelloNFD.java#L119">Multiple file open dialog</a></li>
 * <li><a href="https://github.com/LWJGL/lwjgl3/blob/master/modules/samples/src/test/java/org/lwjgl/demo/util/nfd/HelloNFD.java#L140">Save dialog</a></li>
 * </ul>
 * 
 * <h3>File Filter Syntax</h3>
 * 
 * <p>There is a form of file filtering in every file dialog, but no consistent means of supporting it. NFD provides support for filtering files by groups of
 * extensions, providing its own descriptions (where applicable) for the extensions.</p>
 * 
 * <p>A wildcard filter is always added to every dialog.</p>
 * 
 * <p>Separators:</p>
 * 
 * <ul>
 * <li><i>;</i> Begin a new filter.</li>
 * <li><i>,</i> Add a separate type to the filter.</li>
 * </ul>
 * 
 * <p>Examples:</p>
 * 
 * <ul>
 * <li><i>txt</i> The default filter is for text files. There is a wildcard option in a dropdown.</li>
 * <li><i>png,jpg;psd</i> The default filter is for png and jpg files. A second filter is available for psd files. There is a wildcard option in a dropdown.</li>
 * <li>{@code NULL} Wildcard only.</li>
 * </ul>
 * 
 * <h3>Known Limitations</h3>
 * 
 * <ul>
 * <li>No support for Windows XP's legacy dialogs such as GetOpenFileName.</li>
 * <li>No support for file filter names -- ex: "Image Files" (*.png, *.jpg). Nameless filters are supported, though.</li>
 * <li>No support for selecting folders instead of files.</li>
 * <li>On Linux, GTK+ cannot be uninitialized to save memory. Launching a file dialog costs memory.</li>
 * </ul>
 */
public class NativeFileDialog {

    static { LibNFD.initialize(); }

    /**
     * Result values.
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

    // --- [ NFD_OpenDialog ] ---

    /** Unsafe version of: {@link #NFD_OpenDialog OpenDialog} */
    public static native int nNFD_OpenDialog(long filterList, long defaultPath, long outPath);

    /**
     * Launches a single file open dialog.
     * 
     * <p>If {@link #NFD_OKAY OKAY} is returned, {@code outPath} will contain a pointer to a UTF-8 encoded string. The user must free the string with {@link #NFD_Free Free} when it is no longer
     * needed.</p>
     *
     * @param filterList  an optional filter list
     * @param defaultPath an optional default path
     * @param outPath     returns the selected file path
     */
    @NativeType("nfdresult_t")
    public static int NFD_OpenDialog(@Nullable @NativeType("nfdchar_t const *") ByteBuffer filterList, @Nullable @NativeType("nfdchar_t const *") ByteBuffer defaultPath, @NativeType("nfdchar_t **") PointerBuffer outPath) {
        if (CHECKS) {
            checkNT1Safe(filterList);
            checkNT1Safe(defaultPath);
            check(outPath, 1);
        }
        return nNFD_OpenDialog(memAddressSafe(filterList), memAddressSafe(defaultPath), memAddress(outPath));
    }

    /**
     * Launches a single file open dialog.
     * 
     * <p>If {@link #NFD_OKAY OKAY} is returned, {@code outPath} will contain a pointer to a UTF-8 encoded string. The user must free the string with {@link #NFD_Free Free} when it is no longer
     * needed.</p>
     *
     * @param filterList  an optional filter list
     * @param defaultPath an optional default path
     * @param outPath     returns the selected file path
     */
    @NativeType("nfdresult_t")
    public static int NFD_OpenDialog(@Nullable @NativeType("nfdchar_t const *") CharSequence filterList, @Nullable @NativeType("nfdchar_t const *") CharSequence defaultPath, @NativeType("nfdchar_t **") PointerBuffer outPath) {
        if (CHECKS) {
            check(outPath, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(filterList, true);
            long filterListEncoded = filterList == null ? NULL : stack.getPointerAddress();
            stack.nUTF8Safe(defaultPath, true);
            long defaultPathEncoded = defaultPath == null ? NULL : stack.getPointerAddress();
            return nNFD_OpenDialog(filterListEncoded, defaultPathEncoded, memAddress(outPath));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ NFD_OpenDialogMultiple ] ---

    /** Unsafe version of: {@link #NFD_OpenDialogMultiple OpenDialogMultiple} */
    public static native int nNFD_OpenDialogMultiple(long filterList, long defaultPath, long outPaths);

    /**
     * Launches a multiple file open dialog.
     * 
     * <p>If {@link #NFD_OKAY OKAY} is returned, {@code outPaths} will be filled with information about the selected file or files. The user must free that information with
     * {@link #NFD_PathSet_Free PathSet_Free} when it is no longer needed.</p>
     *
     * @param filterList  an optional filter list
     * @param defaultPath an optional default path
     * @param outPaths    a path set that will be filled with the selected files
     */
    @NativeType("nfdresult_t")
    public static int NFD_OpenDialogMultiple(@Nullable @NativeType("nfdchar_t const *") ByteBuffer filterList, @Nullable @NativeType("nfdchar_t const *") ByteBuffer defaultPath, @NativeType("nfdpathset_t *") NFDPathSet outPaths) {
        if (CHECKS) {
            checkNT1Safe(filterList);
            checkNT1Safe(defaultPath);
        }
        return nNFD_OpenDialogMultiple(memAddressSafe(filterList), memAddressSafe(defaultPath), outPaths.address());
    }

    /**
     * Launches a multiple file open dialog.
     * 
     * <p>If {@link #NFD_OKAY OKAY} is returned, {@code outPaths} will be filled with information about the selected file or files. The user must free that information with
     * {@link #NFD_PathSet_Free PathSet_Free} when it is no longer needed.</p>
     *
     * @param filterList  an optional filter list
     * @param defaultPath an optional default path
     * @param outPaths    a path set that will be filled with the selected files
     */
    @NativeType("nfdresult_t")
    public static int NFD_OpenDialogMultiple(@Nullable @NativeType("nfdchar_t const *") CharSequence filterList, @Nullable @NativeType("nfdchar_t const *") CharSequence defaultPath, @NativeType("nfdpathset_t *") NFDPathSet outPaths) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(filterList, true);
            long filterListEncoded = filterList == null ? NULL : stack.getPointerAddress();
            stack.nUTF8Safe(defaultPath, true);
            long defaultPathEncoded = defaultPath == null ? NULL : stack.getPointerAddress();
            return nNFD_OpenDialogMultiple(filterListEncoded, defaultPathEncoded, outPaths.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ NFD_SaveDialog ] ---

    /** Unsafe version of: {@link #NFD_SaveDialog SaveDialog} */
    public static native int nNFD_SaveDialog(long filterList, long defaultPath, long outPath);

    /**
     * Launches a save dialog.
     * 
     * <p>If {@link #NFD_OKAY OKAY} is returned, {@code outPath} will contain a pointer to a UTF-8 encoded string. The user must free the string with {@link #NFD_Free Free} when it is no longer
     * needed.</p>
     *
     * @param filterList  an optional filter list
     * @param defaultPath an optional default path
     * @param outPath     returns the selected file path
     */
    @NativeType("nfdresult_t")
    public static int NFD_SaveDialog(@Nullable @NativeType("nfdchar_t const *") ByteBuffer filterList, @Nullable @NativeType("nfdchar_t const *") ByteBuffer defaultPath, @NativeType("nfdchar_t **") PointerBuffer outPath) {
        if (CHECKS) {
            checkNT1Safe(filterList);
            checkNT1Safe(defaultPath);
            check(outPath, 1);
        }
        return nNFD_SaveDialog(memAddressSafe(filterList), memAddressSafe(defaultPath), memAddress(outPath));
    }

    /**
     * Launches a save dialog.
     * 
     * <p>If {@link #NFD_OKAY OKAY} is returned, {@code outPath} will contain a pointer to a UTF-8 encoded string. The user must free the string with {@link #NFD_Free Free} when it is no longer
     * needed.</p>
     *
     * @param filterList  an optional filter list
     * @param defaultPath an optional default path
     * @param outPath     returns the selected file path
     */
    @NativeType("nfdresult_t")
    public static int NFD_SaveDialog(@Nullable @NativeType("nfdchar_t const *") CharSequence filterList, @Nullable @NativeType("nfdchar_t const *") CharSequence defaultPath, @NativeType("nfdchar_t **") PointerBuffer outPath) {
        if (CHECKS) {
            check(outPath, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(filterList, true);
            long filterListEncoded = filterList == null ? NULL : stack.getPointerAddress();
            stack.nUTF8Safe(defaultPath, true);
            long defaultPathEncoded = defaultPath == null ? NULL : stack.getPointerAddress();
            return nNFD_SaveDialog(filterListEncoded, defaultPathEncoded, memAddress(outPath));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ NFD_PickFolder ] ---

    /** Unsafe version of: {@link #NFD_PickFolder PickFolder} */
    public static native int nNFD_PickFolder(long defaultPath, long outPath);

    /**
     * Launches a select folder dialog.
     * 
     * <p>If {@link #NFD_OKAY OKAY} is returned, {@code outPath} will contain a pointer to a UTF-8 encoded string. The user must free the string with {@link #NFD_Free Free} when it is no longer
     * needed.</p>
     *
     * @param defaultPath an optional default path
     * @param outPath     returns the selected file path
     */
    @NativeType("nfdresult_t")
    public static int NFD_PickFolder(@Nullable @NativeType("nfdchar_t const *") ByteBuffer defaultPath, @NativeType("nfdchar_t **") PointerBuffer outPath) {
        if (CHECKS) {
            checkNT1Safe(defaultPath);
            check(outPath, 1);
        }
        return nNFD_PickFolder(memAddressSafe(defaultPath), memAddress(outPath));
    }

    /**
     * Launches a select folder dialog.
     * 
     * <p>If {@link #NFD_OKAY OKAY} is returned, {@code outPath} will contain a pointer to a UTF-8 encoded string. The user must free the string with {@link #NFD_Free Free} when it is no longer
     * needed.</p>
     *
     * @param defaultPath an optional default path
     * @param outPath     returns the selected file path
     */
    @NativeType("nfdresult_t")
    public static int NFD_PickFolder(@Nullable @NativeType("nfdchar_t const *") CharSequence defaultPath, @NativeType("nfdchar_t **") PointerBuffer outPath) {
        if (CHECKS) {
            check(outPath, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(defaultPath, true);
            long defaultPathEncoded = defaultPath == null ? NULL : stack.getPointerAddress();
            return nNFD_PickFolder(defaultPathEncoded, memAddress(outPath));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ NFD_GetError ] ---

    /** Unsafe version of: {@link #NFD_GetError GetError} */
    public static native long nNFD_GetError();

    /** Returns the last error. */
    @Nullable
    @NativeType("char const *")
    public static String NFD_GetError() {
        long __result = nNFD_GetError();
        return memASCIISafe(__result);
    }

    // --- [ NFD_PathSet_GetCount ] ---

    /** Unsafe version of: {@link #NFD_PathSet_GetCount PathSet_GetCount} */
    public static native long nNFD_PathSet_GetCount(long pathSet);

    /**
     * Returns the number of entries stored in {@code pathSet}.
     *
     * @param pathSet the path set to query
     */
    @NativeType("size_t")
    public static long NFD_PathSet_GetCount(@NativeType("nfdpathset_t const *") NFDPathSet pathSet) {
        return nNFD_PathSet_GetCount(pathSet.address());
    }

    // --- [ NFD_PathSet_GetPath ] ---

    /** Unsafe version of: {@link #NFD_PathSet_GetPath PathSet_GetPath} */
    public static native long nNFD_PathSet_GetPath(long pathSet, long index);

    /**
     * Returns the UTF-8 path at offset {@code index}.
     *
     * @param pathSet the path set to query
     * @param index   the path offset
     */
    @Nullable
    @NativeType("nfdchar_t *")
    public static String NFD_PathSet_GetPath(@NativeType("nfdpathset_t const *") NFDPathSet pathSet, @NativeType("size_t") long index) {
        long __result = nNFD_PathSet_GetPath(pathSet.address(), index);
        return memUTF8Safe(__result);
    }

    // --- [ NFD_PathSet_Free ] ---

    /** Unsafe version of: {@link #NFD_PathSet_Free PathSet_Free} */
    public static native void nNFD_PathSet_Free(long pathSet);

    /**
     * Frees the contents of the specified path set.
     *
     * @param pathSet the path set
     */
    public static void NFD_PathSet_Free(@NativeType("nfdpathset_t *") NFDPathSet pathSet) {
        nNFD_PathSet_Free(pathSet.address());
    }

    // --- [ NFD_Free ] ---

    /** Unsafe version of: {@link #NFD_Free Free} */
    public static native void nNFD_Free(long outPath);

    /**
     * Frees memory allocated by NativeFileDialog.
     *
     * @param outPath the string to free
     */
    public static void NFD_Free(@NativeType("void *") ByteBuffer outPath) {
        if (CHECKS) {
            check(outPath, 1);
        }
        nNFD_Free(memAddress(outPath));
    }

}