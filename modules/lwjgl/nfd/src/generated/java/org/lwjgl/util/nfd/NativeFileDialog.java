/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.nfd;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NativeFileDialog {

    static { LibNFD.initialize(); }

    public static final int
        NFD_ERROR  = 0,
        NFD_OKAY   = 1,
        NFD_CANCEL = 2;

    public static final int
        NFD_WINDOW_HANDLE_TYPE_UNSET   = 0,
        NFD_WINDOW_HANDLE_TYPE_WINDOWS = 1,
        NFD_WINDOW_HANDLE_TYPE_COCOA   = 2,
        NFD_WINDOW_HANDLE_TYPE_X11     = 3;

    protected NativeFileDialog() {
        throw new UnsupportedOperationException();
    }

    // --- [ NFD_FreePath ] ---

    /** {@code void NFD_FreePath(nfdchar_t * filePath)} */
    public static native void nNFD_FreePath(long filePath);

    /** {@code void NFD_FreePath(nfdchar_t * filePath)} */
    public static void NFD_FreePath(@NativeType("nfdchar_t *") ByteBuffer filePath) {
        if (CHECKS) {
            checkNT1(filePath);
        }
        nNFD_FreePath(memAddress(filePath));
    }

    /** {@code void NFD_FreePath(nfdchar_t * filePath)} */
    public static void NFD_FreePath(@NativeType("nfdchar_t *") long filePath) {
        nNFD_FreePath(filePath);
    }

    // --- [ NFD_Init ] ---

    /** {@code nfdresult_t NFD_Init(void)} */
    @NativeType("nfdresult_t")
    public static native int NFD_Init();

    // --- [ NFD_Quit ] ---

    /** {@code void NFD_Quit(void)} */
    public static native void NFD_Quit();

    // --- [ NFD_OpenDialog ] ---

    /** {@code nfdresult_t NFD_OpenDialog(nfdchar_t ** outPath, nfdfilteritem_t const * filterList, nfdfiltersize_t filterCount, nfdchar_t const * defaultPath)} */
    public static native int nNFD_OpenDialog(long outPath, long filterList, int filterCount, long defaultPath);

    /** {@code nfdresult_t NFD_OpenDialog(nfdchar_t ** outPath, nfdfilteritem_t const * filterList, nfdfiltersize_t filterCount, nfdchar_t const * defaultPath)} */
    @NativeType("nfdresult_t")
    public static int NFD_OpenDialog(@NativeType("nfdchar_t **") PointerBuffer outPath, @NativeType("nfdfilteritem_t const *") NFDFilterItem.@Nullable Buffer filterList, @NativeType("nfdchar_t const *") @Nullable ByteBuffer defaultPath) {
        if (CHECKS) {
            check(outPath, 1);
            checkNT1Safe(defaultPath);
            if (filterList != null) { Struct.validate(filterList.address(), remainingSafe(filterList), NFDFilterItem.SIZEOF, NFDFilterItem::validate); }
        }
        return nNFD_OpenDialog(memAddress(outPath), memAddressSafe(filterList), remainingSafe(filterList), memAddressSafe(defaultPath));
    }

    /** {@code nfdresult_t NFD_OpenDialog(nfdchar_t ** outPath, nfdfilteritem_t const * filterList, nfdfiltersize_t filterCount, nfdchar_t const * defaultPath)} */
    @NativeType("nfdresult_t")
    public static int NFD_OpenDialog(@NativeType("nfdchar_t **") PointerBuffer outPath, @NativeType("nfdfilteritem_t const *") NFDFilterItem.@Nullable Buffer filterList, @NativeType("nfdchar_t const *") @Nullable CharSequence defaultPath) {
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

    // --- [ NFD_OpenDialog_With ] ---

    /** {@code nfdresult_t NFD_OpenDialog_With(nfdchar_t ** outPath, nfdopendialogu8args_t const * args)} */
    public static native int nNFD_OpenDialog_With(long outPath, long args);

    /** {@code nfdresult_t NFD_OpenDialog_With(nfdchar_t ** outPath, nfdopendialogu8args_t const * args)} */
    @NativeType("nfdresult_t")
    public static int NFD_OpenDialog_With(@NativeType("nfdchar_t **") PointerBuffer outPath, @NativeType("nfdopendialogu8args_t const *") NFDOpenDialogArgs args) {
        if (CHECKS) {
            check(outPath, 1);
            NFDOpenDialogArgs.validate(args.address());
        }
        return nNFD_OpenDialog_With(memAddress(outPath), args.address());
    }

    // --- [ NFD_OpenDialogMultiple ] ---

    /** {@code nfdresult_t NFD_OpenDialogMultiple(nfdpathset_t const ** outPath, nfdfilteritem_t const * filterList, nfdfiltersize_t filterCount, nfdchar_t const * defaultPath)} */
    public static native int nNFD_OpenDialogMultiple(long outPath, long filterList, int filterCount, long defaultPath);

    /** {@code nfdresult_t NFD_OpenDialogMultiple(nfdpathset_t const ** outPath, nfdfilteritem_t const * filterList, nfdfiltersize_t filterCount, nfdchar_t const * defaultPath)} */
    @NativeType("nfdresult_t")
    public static int NFD_OpenDialogMultiple(@NativeType("nfdpathset_t const **") PointerBuffer outPath, @NativeType("nfdfilteritem_t const *") NFDFilterItem.@Nullable Buffer filterList, @NativeType("nfdchar_t const *") @Nullable ByteBuffer defaultPath) {
        if (CHECKS) {
            check(outPath, 1);
            checkNT1Safe(defaultPath);
            if (filterList != null) { Struct.validate(filterList.address(), remainingSafe(filterList), NFDFilterItem.SIZEOF, NFDFilterItem::validate); }
        }
        return nNFD_OpenDialogMultiple(memAddress(outPath), memAddressSafe(filterList), remainingSafe(filterList), memAddressSafe(defaultPath));
    }

    /** {@code nfdresult_t NFD_OpenDialogMultiple(nfdpathset_t const ** outPath, nfdfilteritem_t const * filterList, nfdfiltersize_t filterCount, nfdchar_t const * defaultPath)} */
    @NativeType("nfdresult_t")
    public static int NFD_OpenDialogMultiple(@NativeType("nfdpathset_t const **") PointerBuffer outPath, @NativeType("nfdfilteritem_t const *") NFDFilterItem.@Nullable Buffer filterList, @NativeType("nfdchar_t const *") @Nullable CharSequence defaultPath) {
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

    // --- [ NFD_OpenDialogMultiple_With ] ---

    /** {@code nfdresult_t NFD_OpenDialogMultiple_With(nfdpathset_t const ** outPath, nfdopendialogu8args_t const * args)} */
    public static native int nNFD_OpenDialogMultiple_With(long outPath, long args);

    /** {@code nfdresult_t NFD_OpenDialogMultiple_With(nfdpathset_t const ** outPath, nfdopendialogu8args_t const * args)} */
    @NativeType("nfdresult_t")
    public static int NFD_OpenDialogMultiple_With(@NativeType("nfdpathset_t const **") PointerBuffer outPath, @NativeType("nfdopendialogu8args_t const *") NFDOpenDialogArgs args) {
        if (CHECKS) {
            check(outPath, 1);
            NFDOpenDialogArgs.validate(args.address());
        }
        return nNFD_OpenDialogMultiple_With(memAddress(outPath), args.address());
    }

    // --- [ NFD_SaveDialog ] ---

    /** {@code nfdresult_t NFD_SaveDialog(nfdchar_t ** outPath, nfdfilteritem_t const * filterList, nfdfiltersize_t filterCount, nfdchar_t const * defaultPath, nfdchar_t const * defaultName)} */
    public static native int nNFD_SaveDialog(long outPath, long filterList, int filterCount, long defaultPath, long defaultName);

    /** {@code nfdresult_t NFD_SaveDialog(nfdchar_t ** outPath, nfdfilteritem_t const * filterList, nfdfiltersize_t filterCount, nfdchar_t const * defaultPath, nfdchar_t const * defaultName)} */
    @NativeType("nfdresult_t")
    public static int NFD_SaveDialog(@NativeType("nfdchar_t **") PointerBuffer outPath, @NativeType("nfdfilteritem_t const *") NFDFilterItem.@Nullable Buffer filterList, @NativeType("nfdchar_t const *") @Nullable ByteBuffer defaultPath, @NativeType("nfdchar_t const *") @Nullable ByteBuffer defaultName) {
        if (CHECKS) {
            check(outPath, 1);
            checkNT1Safe(defaultPath);
            checkNT1Safe(defaultName);
            if (filterList != null) { Struct.validate(filterList.address(), remainingSafe(filterList), NFDFilterItem.SIZEOF, NFDFilterItem::validate); }
        }
        return nNFD_SaveDialog(memAddress(outPath), memAddressSafe(filterList), remainingSafe(filterList), memAddressSafe(defaultPath), memAddressSafe(defaultName));
    }

    /** {@code nfdresult_t NFD_SaveDialog(nfdchar_t ** outPath, nfdfilteritem_t const * filterList, nfdfiltersize_t filterCount, nfdchar_t const * defaultPath, nfdchar_t const * defaultName)} */
    @NativeType("nfdresult_t")
    public static int NFD_SaveDialog(@NativeType("nfdchar_t **") PointerBuffer outPath, @NativeType("nfdfilteritem_t const *") NFDFilterItem.@Nullable Buffer filterList, @NativeType("nfdchar_t const *") @Nullable CharSequence defaultPath, @NativeType("nfdchar_t const *") @Nullable CharSequence defaultName) {
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

    // --- [ NFD_SaveDialog_With ] ---

    /** {@code nfdresult_t NFD_SaveDialog_With(nfdchar_t ** outPath, nfdsavedialogu8args_t const * args)} */
    public static native int nNFD_SaveDialog_With(long outPath, long args);

    /** {@code nfdresult_t NFD_SaveDialog_With(nfdchar_t ** outPath, nfdsavedialogu8args_t const * args)} */
    @NativeType("nfdresult_t")
    public static int NFD_SaveDialog_With(@NativeType("nfdchar_t **") PointerBuffer outPath, @NativeType("nfdsavedialogu8args_t const *") NFDSaveDialogArgs args) {
        if (CHECKS) {
            check(outPath, 1);
            NFDSaveDialogArgs.validate(args.address());
        }
        return nNFD_SaveDialog_With(memAddress(outPath), args.address());
    }

    // --- [ NFD_PickFolder ] ---

    /** {@code nfdresult_t NFD_PickFolder(nfdchar_t ** outPath, nfdchar_t const * defaultPath)} */
    public static native int nNFD_PickFolder(long outPath, long defaultPath);

    /** {@code nfdresult_t NFD_PickFolder(nfdchar_t ** outPath, nfdchar_t const * defaultPath)} */
    @NativeType("nfdresult_t")
    public static int NFD_PickFolder(@NativeType("nfdchar_t **") PointerBuffer outPath, @NativeType("nfdchar_t const *") @Nullable ByteBuffer defaultPath) {
        if (CHECKS) {
            check(outPath, 1);
            checkNT1Safe(defaultPath);
        }
        return nNFD_PickFolder(memAddress(outPath), memAddressSafe(defaultPath));
    }

    /** {@code nfdresult_t NFD_PickFolder(nfdchar_t ** outPath, nfdchar_t const * defaultPath)} */
    @NativeType("nfdresult_t")
    public static int NFD_PickFolder(@NativeType("nfdchar_t **") PointerBuffer outPath, @NativeType("nfdchar_t const *") @Nullable CharSequence defaultPath) {
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

    // --- [ NFD_PickFolder_With ] ---

    /** {@code nfdresult_t NFD_PickFolder_With(nfdchar_t ** outPath, nfdpickfolderu8args_t const * args)} */
    public static native int nNFD_PickFolder_With(long outPath, long args);

    /** {@code nfdresult_t NFD_PickFolder_With(nfdchar_t ** outPath, nfdpickfolderu8args_t const * args)} */
    @NativeType("nfdresult_t")
    public static int NFD_PickFolder_With(@NativeType("nfdchar_t **") PointerBuffer outPath, @NativeType("nfdpickfolderu8args_t const *") NFDPickFolderArgs args) {
        if (CHECKS) {
            check(outPath, 1);
        }
        return nNFD_PickFolder_With(memAddress(outPath), args.address());
    }

    // --- [ NFD_PickFolderMultiple ] ---

    /** {@code nfdresult_t NFD_PickFolderMultiple(nfdpathset_t const ** outPaths, nfdchar_t const * defaultPath)} */
    public static native int nNFD_PickFolderMultiple(long outPaths, long defaultPath);

    /** {@code nfdresult_t NFD_PickFolderMultiple(nfdpathset_t const ** outPaths, nfdchar_t const * defaultPath)} */
    @NativeType("nfdresult_t")
    public static int NFD_PickFolderMultiple(@NativeType("nfdpathset_t const **") PointerBuffer outPaths, @NativeType("nfdchar_t const *") @Nullable ByteBuffer defaultPath) {
        if (CHECKS) {
            check(outPaths, 1);
            checkNT1Safe(defaultPath);
        }
        return nNFD_PickFolderMultiple(memAddress(outPaths), memAddressSafe(defaultPath));
    }

    /** {@code nfdresult_t NFD_PickFolderMultiple(nfdpathset_t const ** outPaths, nfdchar_t const * defaultPath)} */
    @NativeType("nfdresult_t")
    public static int NFD_PickFolderMultiple(@NativeType("nfdpathset_t const **") PointerBuffer outPaths, @NativeType("nfdchar_t const *") @Nullable CharSequence defaultPath) {
        if (CHECKS) {
            check(outPaths, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(defaultPath, true);
            long defaultPathEncoded = defaultPath == null ? NULL : stack.getPointerAddress();
            return nNFD_PickFolderMultiple(memAddress(outPaths), defaultPathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ NFD_PickFolderMultiple_With ] ---

    /** {@code nfdresult_t NFD_PickFolderMultiple_With(nfdpathset_t const ** outPaths, nfdpickfolderu8args_t const * args)} */
    public static native int nNFD_PickFolderMultiple_With(long outPaths, long args);

    /** {@code nfdresult_t NFD_PickFolderMultiple_With(nfdpathset_t const ** outPaths, nfdpickfolderu8args_t const * args)} */
    @NativeType("nfdresult_t")
    public static int NFD_PickFolderMultiple_With(@NativeType("nfdpathset_t const **") PointerBuffer outPaths, @NativeType("nfdpickfolderu8args_t const *") NFDPickFolderArgs args) {
        if (CHECKS) {
            check(outPaths, 1);
        }
        return nNFD_PickFolderMultiple_With(memAddress(outPaths), args.address());
    }

    // --- [ NFD_GetError ] ---

    /** {@code char const * NFD_GetError(void)} */
    public static native long nNFD_GetError();

    /** {@code char const * NFD_GetError(void)} */
    @NativeType("char const *")
    public static @Nullable String NFD_GetError() {
        long __result = nNFD_GetError();
        return memUTF8Safe(__result);
    }

    // --- [ NFD_ClearError ] ---

    /** {@code void NFD_ClearError(void)} */
    public static native void NFD_ClearError();

    // --- [ NFD_PathSet_GetCount ] ---

    /** {@code nfdresult_t NFD_PathSet_GetCount(nfdpathset_t const * pathSet, nfdpathsetsize_t * count)} */
    public static native int nNFD_PathSet_GetCount(long pathSet, long count);

    /** {@code nfdresult_t NFD_PathSet_GetCount(nfdpathset_t const * pathSet, nfdpathsetsize_t * count)} */
    @NativeType("nfdresult_t")
    public static int NFD_PathSet_GetCount(@NativeType("nfdpathset_t const *") long pathSet, @NativeType("nfdpathsetsize_t *") IntBuffer count) {
        if (CHECKS) {
            check(pathSet);
            check(count, 1);
        }
        return nNFD_PathSet_GetCount(pathSet, memAddress(count));
    }

    // --- [ NFD_PathSet_GetPath ] ---

    /** {@code nfdresult_t NFD_PathSet_GetPath(nfdpathset_t const * pathSet, nfdpathsetsize_t index, nfdchar_t ** outPath)} */
    public static native int nNFD_PathSet_GetPath(long pathSet, int index, long outPath);

    /** {@code nfdresult_t NFD_PathSet_GetPath(nfdpathset_t const * pathSet, nfdpathsetsize_t index, nfdchar_t ** outPath)} */
    @NativeType("nfdresult_t")
    public static int NFD_PathSet_GetPath(@NativeType("nfdpathset_t const *") long pathSet, @NativeType("nfdpathsetsize_t") int index, @NativeType("nfdchar_t **") PointerBuffer outPath) {
        if (CHECKS) {
            check(pathSet);
            check(outPath, 1);
        }
        return nNFD_PathSet_GetPath(pathSet, index, memAddress(outPath));
    }

    // --- [ NFD_PathSet_FreePath ] ---

    /** {@code void NFD_PathSet_FreePath(nfdchar_t * filePath)} */
    public static native void nNFD_PathSet_FreePath(long filePath);

    /** {@code void NFD_PathSet_FreePath(nfdchar_t * filePath)} */
    public static void NFD_PathSet_FreePath(@NativeType("nfdchar_t *") ByteBuffer filePath) {
        if (CHECKS) {
            checkNT1(filePath);
        }
        nNFD_PathSet_FreePath(memAddress(filePath));
    }

    /** {@code void NFD_PathSet_FreePath(nfdchar_t * filePath)} */
    public static void NFD_PathSet_FreePath(@NativeType("nfdchar_t *") long filePath) {
        nNFD_PathSet_FreePath(filePath);
    }

    // --- [ NFD_PathSet_GetEnum ] ---

    /** {@code nfdresult_t NFD_PathSet_GetEnum(nfdpathset_t const * pathSet, nfdpathsetenum_t * outEnumerator)} */
    public static native int nNFD_PathSet_GetEnum(long pathSet, long outEnumerator);

    /** {@code nfdresult_t NFD_PathSet_GetEnum(nfdpathset_t const * pathSet, nfdpathsetenum_t * outEnumerator)} */
    @NativeType("nfdresult_t")
    public static int NFD_PathSet_GetEnum(@NativeType("nfdpathset_t const *") long pathSet, @NativeType("nfdpathsetenum_t *") NFDPathSetEnum outEnumerator) {
        if (CHECKS) {
            check(pathSet);
        }
        return nNFD_PathSet_GetEnum(pathSet, outEnumerator.address());
    }

    // --- [ NFD_PathSet_FreeEnum ] ---

    /** {@code void NFD_PathSet_FreeEnum(nfdpathsetenum_t * enumerator)} */
    public static native void nNFD_PathSet_FreeEnum(long enumerator);

    /** {@code void NFD_PathSet_FreeEnum(nfdpathsetenum_t * enumerator)} */
    public static void NFD_PathSet_FreeEnum(@NativeType("nfdpathsetenum_t *") NFDPathSetEnum enumerator) {
        nNFD_PathSet_FreeEnum(enumerator.address());
    }

    // --- [ NFD_PathSet_EnumNext ] ---

    /** {@code nfdresult_t NFD_PathSet_EnumNext(nfdpathsetenum_t * enumerator, nfdchar_t ** outPath)} */
    public static native int nNFD_PathSet_EnumNext(long enumerator, long outPath);

    /** {@code nfdresult_t NFD_PathSet_EnumNext(nfdpathsetenum_t * enumerator, nfdchar_t ** outPath)} */
    @NativeType("nfdresult_t")
    public static int NFD_PathSet_EnumNext(@NativeType("nfdpathsetenum_t *") NFDPathSetEnum enumerator, @NativeType("nfdchar_t **") PointerBuffer outPath) {
        if (CHECKS) {
            check(outPath, 1);
        }
        return nNFD_PathSet_EnumNext(enumerator.address(), memAddress(outPath));
    }

    // --- [ NFD_PathSet_Free ] ---

    /** {@code void NFD_PathSet_Free(nfdpathset_t const * pathSet)} */
    public static native void nNFD_PathSet_Free(long pathSet);

    /** {@code void NFD_PathSet_Free(nfdpathset_t const * pathSet)} */
    public static void NFD_PathSet_Free(@NativeType("nfdpathset_t const *") long pathSet) {
        if (CHECKS) {
            check(pathSet);
        }
        nNFD_PathSet_Free(pathSet);
    }

    /** {@code nfdresult_t NFD_PathSet_GetCount(nfdpathset_t const * pathSet, nfdpathsetsize_t * count)} */
    public static native int nNFD_PathSet_GetCount(long pathSet, int[] count);

    /** {@code nfdresult_t NFD_PathSet_GetCount(nfdpathset_t const * pathSet, nfdpathsetsize_t * count)} */
    @NativeType("nfdresult_t")
    public static int NFD_PathSet_GetCount(@NativeType("nfdpathset_t const *") long pathSet, @NativeType("nfdpathsetsize_t *") int[] count) {
        if (CHECKS) {
            check(pathSet);
            check(count, 1);
        }
        return nNFD_PathSet_GetCount(pathSet, count);
    }

}