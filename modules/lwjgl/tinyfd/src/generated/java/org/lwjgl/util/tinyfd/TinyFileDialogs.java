/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyfd;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class TinyFileDialogs {

    static {
        Library.loadSystem(System::load, System::loadLibrary, TinyFileDialogs.class, "org.lwjgl.tinyfd", Platform.mapLibraryNameBundled("lwjgl_tinyfd"));
        if (Platform.get() == Platform.WINDOWS) {
            tinyfd_setGlobalInt("tinyfd_winUtf8", 1);
        }
    }

    public static final String
        tinyfd_version            = "tinyfd_version",
        tinyfd_needs              = "tinyfd_needs",
        tinyfd_response           = "tinyfd_response",
        tinyfd_verbose            = "tinyfd_verbose",
        tinyfd_silent             = "tinyfd_silent",
        tinyfd_allowCursesDialogs = "tinyfd_allowCursesDialogs",
        tinyfd_forceConsole       = "tinyfd_forceConsole",
        tinyfd_winUtf8            = "tinyfd_winUtf8";

    protected TinyFileDialogs() {
        throw new UnsupportedOperationException();
    }

    // --- [ tinyfd_getGlobalChar ] ---

    /** {@code char const * tinyfd_getGlobalChar(char const * aCharVariableName)} */
    public static native long ntinyfd_getGlobalChar(long aCharVariableName);

    /** {@code char const * tinyfd_getGlobalChar(char const * aCharVariableName)} */
    @NativeType("char const *")
    public static @Nullable String tinyfd_getGlobalChar(@NativeType("char const *") ByteBuffer aCharVariableName) {
        if (CHECKS) {
            checkNT1(aCharVariableName);
        }
        long __result = ntinyfd_getGlobalChar(memAddress(aCharVariableName));
        return memASCIISafe(__result);
    }

    /** {@code char const * tinyfd_getGlobalChar(char const * aCharVariableName)} */
    @NativeType("char const *")
    public static @Nullable String tinyfd_getGlobalChar(@NativeType("char const *") CharSequence aCharVariableName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(aCharVariableName, true);
            long aCharVariableNameEncoded = stack.getPointerAddress();
            long __result = ntinyfd_getGlobalChar(aCharVariableNameEncoded);
            return memASCIISafe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ tinyfd_getGlobalInt ] ---

    /** {@code int tinyfd_getGlobalInt(char const * aIntVariableName)} */
    public static native int ntinyfd_getGlobalInt(long aIntVariableName);

    /** {@code int tinyfd_getGlobalInt(char const * aIntVariableName)} */
    public static int tinyfd_getGlobalInt(@NativeType("char const *") ByteBuffer aIntVariableName) {
        if (CHECKS) {
            checkNT1(aIntVariableName);
        }
        return ntinyfd_getGlobalInt(memAddress(aIntVariableName));
    }

    /** {@code int tinyfd_getGlobalInt(char const * aIntVariableName)} */
    public static int tinyfd_getGlobalInt(@NativeType("char const *") CharSequence aIntVariableName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(aIntVariableName, true);
            long aIntVariableNameEncoded = stack.getPointerAddress();
            return ntinyfd_getGlobalInt(aIntVariableNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ tinyfd_setGlobalInt ] ---

    /** {@code int tinyfd_setGlobalInt(char const * aIntVariableName, int aValue)} */
    public static native int ntinyfd_setGlobalInt(long aIntVariableName, int aValue);

    /** {@code int tinyfd_setGlobalInt(char const * aIntVariableName, int aValue)} */
    public static int tinyfd_setGlobalInt(@NativeType("char const *") ByteBuffer aIntVariableName, int aValue) {
        if (CHECKS) {
            checkNT1(aIntVariableName);
        }
        return ntinyfd_setGlobalInt(memAddress(aIntVariableName), aValue);
    }

    /** {@code int tinyfd_setGlobalInt(char const * aIntVariableName, int aValue)} */
    public static int tinyfd_setGlobalInt(@NativeType("char const *") CharSequence aIntVariableName, int aValue) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(aIntVariableName, true);
            long aIntVariableNameEncoded = stack.getPointerAddress();
            return ntinyfd_setGlobalInt(aIntVariableNameEncoded, aValue);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ tinyfd_beep ] ---

    /** {@code void tinyfd_beep(void)} */
    public static native void tinyfd_beep();

    // --- [ tinyfd_notifyPopup ] ---

    /** {@code int tinyfd_notifyPopup(char const * aTitle, char const * aMessage, char const * aIconType)} */
    public static native int ntinyfd_notifyPopup(long aTitle, long aMessage, long aIconType);

    /** {@code int tinyfd_notifyPopup(char const * aTitle, char const * aMessage, char const * aIconType)} */
    public static int tinyfd_notifyPopup(@NativeType("char const *") @Nullable ByteBuffer aTitle, @NativeType("char const *") @Nullable ByteBuffer aMessage, @NativeType("char const *") ByteBuffer aIconType) {
        if (CHECKS) {
            checkNT1Safe(aTitle);
            checkNT1Safe(aMessage);
            checkNT1(aIconType);
        }
        return ntinyfd_notifyPopup(memAddressSafe(aTitle), memAddressSafe(aMessage), memAddress(aIconType));
    }

    /** {@code int tinyfd_notifyPopup(char const * aTitle, char const * aMessage, char const * aIconType)} */
    public static int tinyfd_notifyPopup(@NativeType("char const *") @Nullable CharSequence aTitle, @NativeType("char const *") @Nullable CharSequence aMessage, @NativeType("char const *") CharSequence aIconType) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(aTitle, true);
            long aTitleEncoded = aTitle == null ? NULL : stack.getPointerAddress();
            stack.nUTF8Safe(aMessage, true);
            long aMessageEncoded = aMessage == null ? NULL : stack.getPointerAddress();
            stack.nASCII(aIconType, true);
            long aIconTypeEncoded = stack.getPointerAddress();
            return ntinyfd_notifyPopup(aTitleEncoded, aMessageEncoded, aIconTypeEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ tinyfd_messageBox ] ---

    /** {@code int tinyfd_messageBox(char const * aTitle, char const * aMessage, char const * aDialogType, char const * aIconType, int aDefaultButton)} */
    public static native int ntinyfd_messageBox(long aTitle, long aMessage, long aDialogType, long aIconType, int aDefaultButton);

    /** {@code int tinyfd_messageBox(char const * aTitle, char const * aMessage, char const * aDialogType, char const * aIconType, int aDefaultButton)} */
    public static int tinyfd_messageBox(@NativeType("char const *") @Nullable ByteBuffer aTitle, @NativeType("char const *") @Nullable ByteBuffer aMessage, @NativeType("char const *") ByteBuffer aDialogType, @NativeType("char const *") ByteBuffer aIconType, int aDefaultButton) {
        if (CHECKS) {
            checkNT1Safe(aTitle);
            checkNT1Safe(aMessage);
            checkNT1(aDialogType);
            checkNT1(aIconType);
        }
        return ntinyfd_messageBox(memAddressSafe(aTitle), memAddressSafe(aMessage), memAddress(aDialogType), memAddress(aIconType), aDefaultButton);
    }

    /** {@code int tinyfd_messageBox(char const * aTitle, char const * aMessage, char const * aDialogType, char const * aIconType, int aDefaultButton)} */
    public static int tinyfd_messageBox(@NativeType("char const *") @Nullable CharSequence aTitle, @NativeType("char const *") @Nullable CharSequence aMessage, @NativeType("char const *") CharSequence aDialogType, @NativeType("char const *") CharSequence aIconType, int aDefaultButton) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(aTitle, true);
            long aTitleEncoded = aTitle == null ? NULL : stack.getPointerAddress();
            stack.nUTF8Safe(aMessage, true);
            long aMessageEncoded = aMessage == null ? NULL : stack.getPointerAddress();
            stack.nASCII(aDialogType, true);
            long aDialogTypeEncoded = stack.getPointerAddress();
            stack.nASCII(aIconType, true);
            long aIconTypeEncoded = stack.getPointerAddress();
            return ntinyfd_messageBox(aTitleEncoded, aMessageEncoded, aDialogTypeEncoded, aIconTypeEncoded, aDefaultButton);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ tinyfd_inputBox ] ---

    /** {@code char const * tinyfd_inputBox(char const * aTitle, char const * aMessage, char const * aDefaultInput)} */
    public static native long ntinyfd_inputBox(long aTitle, long aMessage, long aDefaultInput);

    /** {@code char const * tinyfd_inputBox(char const * aTitle, char const * aMessage, char const * aDefaultInput)} */
    @NativeType("char const *")
    public static @Nullable String tinyfd_inputBox(@NativeType("char const *") @Nullable ByteBuffer aTitle, @NativeType("char const *") @Nullable ByteBuffer aMessage, @NativeType("char const *") @Nullable ByteBuffer aDefaultInput) {
        if (CHECKS) {
            checkNT1Safe(aTitle);
            checkNT1Safe(aMessage);
            checkNT1Safe(aDefaultInput);
        }
        long __result = ntinyfd_inputBox(memAddressSafe(aTitle), memAddressSafe(aMessage), memAddressSafe(aDefaultInput));
        return memUTF8Safe(__result);
    }

    /** {@code char const * tinyfd_inputBox(char const * aTitle, char const * aMessage, char const * aDefaultInput)} */
    @NativeType("char const *")
    public static @Nullable String tinyfd_inputBox(@NativeType("char const *") @Nullable CharSequence aTitle, @NativeType("char const *") @Nullable CharSequence aMessage, @NativeType("char const *") @Nullable CharSequence aDefaultInput) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(aTitle, true);
            long aTitleEncoded = aTitle == null ? NULL : stack.getPointerAddress();
            stack.nUTF8Safe(aMessage, true);
            long aMessageEncoded = aMessage == null ? NULL : stack.getPointerAddress();
            stack.nUTF8Safe(aDefaultInput, true);
            long aDefaultInputEncoded = aDefaultInput == null ? NULL : stack.getPointerAddress();
            long __result = ntinyfd_inputBox(aTitleEncoded, aMessageEncoded, aDefaultInputEncoded);
            return memUTF8Safe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ tinyfd_saveFileDialog ] ---

    /** {@code char const * tinyfd_saveFileDialog(char const * aTitle, char const * aDefaultPathAndOrFile, int aNumOfFilterPatterns, char const * const * aFilterPatterns, char const * aSingleFilterDescription)} */
    public static native long ntinyfd_saveFileDialog(long aTitle, long aDefaultPathAndOrFile, int aNumOfFilterPatterns, long aFilterPatterns, long aSingleFilterDescription);

    /** {@code char const * tinyfd_saveFileDialog(char const * aTitle, char const * aDefaultPathAndOrFile, int aNumOfFilterPatterns, char const * const * aFilterPatterns, char const * aSingleFilterDescription)} */
    @NativeType("char const *")
    public static @Nullable String tinyfd_saveFileDialog(@NativeType("char const *") @Nullable ByteBuffer aTitle, @NativeType("char const *") @Nullable ByteBuffer aDefaultPathAndOrFile, @NativeType("char const * const *") @Nullable PointerBuffer aFilterPatterns, @NativeType("char const *") @Nullable ByteBuffer aSingleFilterDescription) {
        if (CHECKS) {
            checkNT1Safe(aTitle);
            checkNT1Safe(aDefaultPathAndOrFile);
            checkNT1Safe(aSingleFilterDescription);
        }
        long __result = ntinyfd_saveFileDialog(memAddressSafe(aTitle), memAddressSafe(aDefaultPathAndOrFile), remainingSafe(aFilterPatterns), memAddressSafe(aFilterPatterns), memAddressSafe(aSingleFilterDescription));
        return memUTF8Safe(__result);
    }

    /** {@code char const * tinyfd_saveFileDialog(char const * aTitle, char const * aDefaultPathAndOrFile, int aNumOfFilterPatterns, char const * const * aFilterPatterns, char const * aSingleFilterDescription)} */
    @NativeType("char const *")
    public static @Nullable String tinyfd_saveFileDialog(@NativeType("char const *") @Nullable CharSequence aTitle, @NativeType("char const *") @Nullable CharSequence aDefaultPathAndOrFile, @NativeType("char const * const *") @Nullable PointerBuffer aFilterPatterns, @NativeType("char const *") @Nullable CharSequence aSingleFilterDescription) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(aTitle, true);
            long aTitleEncoded = aTitle == null ? NULL : stack.getPointerAddress();
            stack.nUTF8Safe(aDefaultPathAndOrFile, true);
            long aDefaultPathAndOrFileEncoded = aDefaultPathAndOrFile == null ? NULL : stack.getPointerAddress();
            stack.nUTF8Safe(aSingleFilterDescription, true);
            long aSingleFilterDescriptionEncoded = aSingleFilterDescription == null ? NULL : stack.getPointerAddress();
            long __result = ntinyfd_saveFileDialog(aTitleEncoded, aDefaultPathAndOrFileEncoded, remainingSafe(aFilterPatterns), memAddressSafe(aFilterPatterns), aSingleFilterDescriptionEncoded);
            return memUTF8Safe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ tinyfd_openFileDialog ] ---

    /** {@code char const * tinyfd_openFileDialog(char const * aTitle, char const * aDefaultPathAndOrFile, int aNumOfFilterPatterns, char const * const * aFilterPatterns, char const * aSingleFilterDescription, int aAllowMultipleSelects)} */
    public static native long ntinyfd_openFileDialog(long aTitle, long aDefaultPathAndOrFile, int aNumOfFilterPatterns, long aFilterPatterns, long aSingleFilterDescription, int aAllowMultipleSelects);

    /** {@code char const * tinyfd_openFileDialog(char const * aTitle, char const * aDefaultPathAndOrFile, int aNumOfFilterPatterns, char const * const * aFilterPatterns, char const * aSingleFilterDescription, int aAllowMultipleSelects)} */
    @NativeType("char const *")
    public static @Nullable String tinyfd_openFileDialog(@NativeType("char const *") @Nullable ByteBuffer aTitle, @NativeType("char const *") @Nullable ByteBuffer aDefaultPathAndOrFile, @NativeType("char const * const *") @Nullable PointerBuffer aFilterPatterns, @NativeType("char const *") @Nullable ByteBuffer aSingleFilterDescription, @NativeType("int") boolean aAllowMultipleSelects) {
        if (CHECKS) {
            checkNT1Safe(aTitle);
            checkNT1Safe(aDefaultPathAndOrFile);
            checkNT1Safe(aSingleFilterDescription);
        }
        long __result = ntinyfd_openFileDialog(memAddressSafe(aTitle), memAddressSafe(aDefaultPathAndOrFile), remainingSafe(aFilterPatterns), memAddressSafe(aFilterPatterns), memAddressSafe(aSingleFilterDescription), aAllowMultipleSelects ? 1 : 0);
        return memUTF8Safe(__result);
    }

    /** {@code char const * tinyfd_openFileDialog(char const * aTitle, char const * aDefaultPathAndOrFile, int aNumOfFilterPatterns, char const * const * aFilterPatterns, char const * aSingleFilterDescription, int aAllowMultipleSelects)} */
    @NativeType("char const *")
    public static @Nullable String tinyfd_openFileDialog(@NativeType("char const *") @Nullable CharSequence aTitle, @NativeType("char const *") @Nullable CharSequence aDefaultPathAndOrFile, @NativeType("char const * const *") @Nullable PointerBuffer aFilterPatterns, @NativeType("char const *") @Nullable CharSequence aSingleFilterDescription, @NativeType("int") boolean aAllowMultipleSelects) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(aTitle, true);
            long aTitleEncoded = aTitle == null ? NULL : stack.getPointerAddress();
            stack.nUTF8Safe(aDefaultPathAndOrFile, true);
            long aDefaultPathAndOrFileEncoded = aDefaultPathAndOrFile == null ? NULL : stack.getPointerAddress();
            stack.nUTF8Safe(aSingleFilterDescription, true);
            long aSingleFilterDescriptionEncoded = aSingleFilterDescription == null ? NULL : stack.getPointerAddress();
            long __result = ntinyfd_openFileDialog(aTitleEncoded, aDefaultPathAndOrFileEncoded, remainingSafe(aFilterPatterns), memAddressSafe(aFilterPatterns), aSingleFilterDescriptionEncoded, aAllowMultipleSelects ? 1 : 0);
            return memUTF8Safe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ tinyfd_selectFolderDialog ] ---

    /** {@code char const * tinyfd_selectFolderDialog(char const * aTitle, char const * aDefaultPath)} */
    public static native long ntinyfd_selectFolderDialog(long aTitle, long aDefaultPath);

    /** {@code char const * tinyfd_selectFolderDialog(char const * aTitle, char const * aDefaultPath)} */
    @NativeType("char const *")
    public static @Nullable String tinyfd_selectFolderDialog(@NativeType("char const *") @Nullable ByteBuffer aTitle, @NativeType("char const *") @Nullable ByteBuffer aDefaultPath) {
        if (CHECKS) {
            checkNT1Safe(aTitle);
            checkNT1Safe(aDefaultPath);
        }
        long __result = ntinyfd_selectFolderDialog(memAddressSafe(aTitle), memAddressSafe(aDefaultPath));
        return memUTF8Safe(__result);
    }

    /** {@code char const * tinyfd_selectFolderDialog(char const * aTitle, char const * aDefaultPath)} */
    @NativeType("char const *")
    public static @Nullable String tinyfd_selectFolderDialog(@NativeType("char const *") @Nullable CharSequence aTitle, @NativeType("char const *") @Nullable CharSequence aDefaultPath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(aTitle, true);
            long aTitleEncoded = aTitle == null ? NULL : stack.getPointerAddress();
            stack.nUTF8Safe(aDefaultPath, true);
            long aDefaultPathEncoded = aDefaultPath == null ? NULL : stack.getPointerAddress();
            long __result = ntinyfd_selectFolderDialog(aTitleEncoded, aDefaultPathEncoded);
            return memUTF8Safe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ tinyfd_colorChooser ] ---

    /** {@code char const * tinyfd_colorChooser(char const * aTitle, char const * aDefaultHexRGB, unsigned char * aDefaultRGB, unsigned char * aoResultRGB)} */
    public static native long ntinyfd_colorChooser(long aTitle, long aDefaultHexRGB, long aDefaultRGB, long aoResultRGB);

    /** {@code char const * tinyfd_colorChooser(char const * aTitle, char const * aDefaultHexRGB, unsigned char * aDefaultRGB, unsigned char * aoResultRGB)} */
    @NativeType("char const *")
    public static @Nullable String tinyfd_colorChooser(@NativeType("char const *") @Nullable ByteBuffer aTitle, @NativeType("char const *") @Nullable ByteBuffer aDefaultHexRGB, @NativeType("unsigned char *") @Nullable ByteBuffer aDefaultRGB, @NativeType("unsigned char *") ByteBuffer aoResultRGB) {
        if (CHECKS) {
            checkNT1Safe(aTitle);
            checkNT1Safe(aDefaultHexRGB);
            checkSafe(aDefaultRGB, 3);
            check(aoResultRGB, 3);
        }
        long __result = ntinyfd_colorChooser(memAddressSafe(aTitle), memAddressSafe(aDefaultHexRGB), memAddressSafe(aDefaultRGB), memAddress(aoResultRGB));
        return memUTF8Safe(__result);
    }

    /** {@code char const * tinyfd_colorChooser(char const * aTitle, char const * aDefaultHexRGB, unsigned char * aDefaultRGB, unsigned char * aoResultRGB)} */
    @NativeType("char const *")
    public static @Nullable String tinyfd_colorChooser(@NativeType("char const *") @Nullable CharSequence aTitle, @NativeType("char const *") @Nullable CharSequence aDefaultHexRGB, @NativeType("unsigned char *") @Nullable ByteBuffer aDefaultRGB, @NativeType("unsigned char *") ByteBuffer aoResultRGB) {
        if (CHECKS) {
            checkSafe(aDefaultRGB, 3);
            check(aoResultRGB, 3);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(aTitle, true);
            long aTitleEncoded = aTitle == null ? NULL : stack.getPointerAddress();
            stack.nASCIISafe(aDefaultHexRGB, true);
            long aDefaultHexRGBEncoded = aDefaultHexRGB == null ? NULL : stack.getPointerAddress();
            long __result = ntinyfd_colorChooser(aTitleEncoded, aDefaultHexRGBEncoded, memAddressSafe(aDefaultRGB), memAddress(aoResultRGB));
            return memUTF8Safe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}