/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyfd;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Bindings to <a target="_blank" href="https://sourceforge.net/projects/tinyfiledialogs/">tiny file dialogs</a>, a native dialog library with support for:
 * 
 * <ul>
 * <li>message / question</li>
 * <li>input / password</li>
 * <li>save file</li>
 * <li>open file &amp; multiple files</li>
 * <li>select folder</li>
 * <li>color picker</li>
 * </ul>
 * 
 * <p>The dialogs can be forced into console mode.</p>
 */
public class TinyFileDialogs {

    static {
        Library.loadSystem(System::load, System::loadLibrary, TinyFileDialogs.class, "org.lwjgl.tinyfd", Platform.mapLibraryNameBundled("lwjgl_tinyfd"));
        tinyfd_winUtf8().put(0, 1);
    }

    protected TinyFileDialogs() {
        throw new UnsupportedOperationException();
    }

    // --- [ tinyfd_version ] ---

    private static native long ntinyfd_version();

    @NativeType("char *")
    private static String tinyfd_version() {
        long __result = ntinyfd_version();
        return memASCII(__result);
    }

    /** Contains tinyfd current version number. */
    public static final String tinyfd_version = tinyfd_version();

    // --- [ tinyfd_needs ] ---

    private static native long ntinyfd_needs();

    @NativeType("char *")
    private static String tinyfd_needs() {
        long __result = ntinyfd_needs();
        return memASCII(__result);
    }

    /** Contains info about requirements. */
    public static final String tinyfd_needs = tinyfd_needs();

    // --- [ tinyfd_verbose ] ---

    private static native long ntinyfd_verbose();

    @NativeType("int *")
    private static IntBuffer tinyfd_verbose() {
        long __result = ntinyfd_verbose();
        return memIntBuffer(__result, 1);
    }

    /** 0 (default) or 1 : on unix, prints the command line calls. */
    public static final IntBuffer tinyfd_verbose = tinyfd_verbose();

    // --- [ tinyfd_silent ] ---

    private static native long ntinyfd_silent();

    @NativeType("int *")
    private static IntBuffer tinyfd_silent() {
        long __result = ntinyfd_silent();
        return memIntBuffer(__result, 1);
    }

    /** 1 (default) or 0 : on unix, hide errors and warnings from called dialog. */
    public static final IntBuffer tinyfd_silent = tinyfd_silent();

    // --- [ tinyfd_winUtf8 ] ---

    private static native long ntinyfd_winUtf8();

    @NativeType("int *")
    private static IntBuffer tinyfd_winUtf8() {
        long __result = ntinyfd_winUtf8();
        return memIntBuffer(__result, 1);
    }

    // --- [ tinyfd_forceConsole ] ---

    private static native long ntinyfd_forceConsole();

    @NativeType("int *")
    private static IntBuffer tinyfd_forceConsole() {
        long __result = ntinyfd_forceConsole();
        return memIntBuffer(__result, 1);
    }

    /**
     * Can be modified at run time.
     * 
     * <p>For unix &amp; windows: 0 (graphic mode) or 1 (console mode).</p>
     * 
     * <p>0: try to use a graphic solution, if it fails then it uses console mode.
     * 1: forces all dialogs into console mode even when the X server is present. It will use the package dialog or dialog.exe if installed. On windows it
     * only makes sense for console applications.</p>
     */
    public static final IntBuffer tinyfd_forceConsole = tinyfd_forceConsole();

    // --- [ tinyfd_response ] ---

    /** Unsafe version of: {@link #tinyfd_response response} */
    public static native long ntinyfd_response();

    /**
     * If you pass "tinyfd_query" as {@code aTitle}, the functions will not display the dialogs but will fill {@code tinyfd_response} with the retain solution
     * and return:
     * 
     * <p>Possible values for {@code tinyfd_response} are (all lowercase) for the graphic mode: windows applescript zenity zenity3 matedialog kdialog xdialog
     * tkinter gdialog gxmessage xmessage</p>
     * 
     * <p>For the console mode: dialog whiptail basicinput</p>
     */
    @NativeType("char *")
    public static String tinyfd_response() {
        long __result = ntinyfd_response();
        return memUTF8(__result);
    }

    // --- [ tinyfd_beep ] ---

    public static native void tinyfd_beep();

    // --- [ tinyfd_notifyPopup ] ---

    /** Unsafe version of: {@link #tinyfd_notifyPopup notifyPopup} */
    public static native int ntinyfd_notifyPopup(long aTitle, long aMessage, long aIconType);

    /**
     * Displays a notification popup.
     *
     * @param aTitle    the dialog title or {@code NULL}
     * @param aMessage  the message or {@code NULL}. It may contain \n and \t characters.
     * @param aIconType the icon type. One of:<br><table><tr><td>"info"</td><td>"warning"</td><td>"error"</td></tr></table>
     */
    public static int tinyfd_notifyPopup(@Nullable @NativeType("char const *") ByteBuffer aTitle, @Nullable @NativeType("char const *") ByteBuffer aMessage, @NativeType("char const *") ByteBuffer aIconType) {
        if (CHECKS) {
            checkNT1Safe(aTitle);
            checkNT1Safe(aMessage);
            checkNT1(aIconType);
        }
        return ntinyfd_notifyPopup(memAddressSafe(aTitle), memAddressSafe(aMessage), memAddress(aIconType));
    }

    /**
     * Displays a notification popup.
     *
     * @param aTitle    the dialog title or {@code NULL}
     * @param aMessage  the message or {@code NULL}. It may contain \n and \t characters.
     * @param aIconType the icon type. One of:<br><table><tr><td>"info"</td><td>"warning"</td><td>"error"</td></tr></table>
     */
    public static int tinyfd_notifyPopup(@Nullable @NativeType("char const *") CharSequence aTitle, @Nullable @NativeType("char const *") CharSequence aMessage, @NativeType("char const *") CharSequence aIconType) {
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

    /** Unsafe version of: {@link #tinyfd_messageBox messageBox} */
    public static native int ntinyfd_messageBox(long aTitle, long aMessage, long aDialogType, long aIconType, int aDefaultButton);

    /**
     * Displays a message dialog.
     *
     * @param aTitle         the dialog title or {@code NULL}
     * @param aMessage       the message or {@code NULL}. It may contain \n and \t characters.
     * @param aDialogType    the dialog type. One of:<br><table><tr><td>"ok"</td><td>"okcancel"</td><td>"yesno"</td><td>"yesnocancel"</td></tr></table>
     * @param aIconType      the icon type. One of:<br><table><tr><td>"info"</td><td>"warning"</td><td>"error"</td><td>"question"</td></tr></table>
     * @param aDefaultButton 0 for cancel/no, 1 for ok/yes
     *
     * @return 0 for cancel/no, 1 for ok/yes, 2 for no in yesnocancel
     */
    @NativeType("int")
    public static boolean tinyfd_messageBox(@Nullable @NativeType("char const *") ByteBuffer aTitle, @Nullable @NativeType("char const *") ByteBuffer aMessage, @NativeType("char const *") ByteBuffer aDialogType, @NativeType("char const *") ByteBuffer aIconType, @NativeType("int") boolean aDefaultButton) {
        if (CHECKS) {
            checkNT1Safe(aTitle);
            checkNT1Safe(aMessage);
            checkNT1(aDialogType);
            checkNT1(aIconType);
        }
        return ntinyfd_messageBox(memAddressSafe(aTitle), memAddressSafe(aMessage), memAddress(aDialogType), memAddress(aIconType), aDefaultButton ? 1 : 0) != 0;
    }

    /**
     * Displays a message dialog.
     *
     * @param aTitle         the dialog title or {@code NULL}
     * @param aMessage       the message or {@code NULL}. It may contain \n and \t characters.
     * @param aDialogType    the dialog type. One of:<br><table><tr><td>"ok"</td><td>"okcancel"</td><td>"yesno"</td><td>"yesnocancel"</td></tr></table>
     * @param aIconType      the icon type. One of:<br><table><tr><td>"info"</td><td>"warning"</td><td>"error"</td><td>"question"</td></tr></table>
     * @param aDefaultButton 0 for cancel/no, 1 for ok/yes
     *
     * @return 0 for cancel/no, 1 for ok/yes, 2 for no in yesnocancel
     */
    @NativeType("int")
    public static boolean tinyfd_messageBox(@Nullable @NativeType("char const *") CharSequence aTitle, @Nullable @NativeType("char const *") CharSequence aMessage, @NativeType("char const *") CharSequence aDialogType, @NativeType("char const *") CharSequence aIconType, @NativeType("int") boolean aDefaultButton) {
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
            return ntinyfd_messageBox(aTitleEncoded, aMessageEncoded, aDialogTypeEncoded, aIconTypeEncoded, aDefaultButton ? 1 : 0) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ tinyfd_inputBox ] ---

    /** Unsafe version of: {@link #tinyfd_inputBox inputBox} */
    public static native long ntinyfd_inputBox(long aTitle, long aMessage, long aDefaultInput);

    /**
     * Displays an input dialog.
     *
     * @param aTitle        the dialog title or {@code NULL}
     * @param aMessage      the message or {@code NULL}. May NOT contain \n and \t characters on Windows.
     * @param aDefaultInput if {@code NULL} it's a password box
     *
     * @return the input value or {@code NULL} on cancel
     */
    @Nullable
    @NativeType("char const *")
    public static String tinyfd_inputBox(@Nullable @NativeType("char const *") ByteBuffer aTitle, @Nullable @NativeType("char const *") ByteBuffer aMessage, @Nullable @NativeType("char const *") ByteBuffer aDefaultInput) {
        if (CHECKS) {
            checkNT1Safe(aTitle);
            checkNT1Safe(aMessage);
            checkNT1Safe(aDefaultInput);
        }
        long __result = ntinyfd_inputBox(memAddressSafe(aTitle), memAddressSafe(aMessage), memAddressSafe(aDefaultInput));
        return memUTF8Safe(__result);
    }

    /**
     * Displays an input dialog.
     *
     * @param aTitle        the dialog title or {@code NULL}
     * @param aMessage      the message or {@code NULL}. May NOT contain \n and \t characters on Windows.
     * @param aDefaultInput if {@code NULL} it's a password box
     *
     * @return the input value or {@code NULL} on cancel
     */
    @Nullable
    @NativeType("char const *")
    public static String tinyfd_inputBox(@Nullable @NativeType("char const *") CharSequence aTitle, @Nullable @NativeType("char const *") CharSequence aMessage, @Nullable @NativeType("char const *") CharSequence aDefaultInput) {
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

    /**
     * Unsafe version of: {@link #tinyfd_saveFileDialog saveFileDialog}
     *
     * @param aNumOfFilterPatterns the number of patterns in {@code aFilterPatterns}
     */
    public static native long ntinyfd_saveFileDialog(long aTitle, long aDefaultPathAndFile, int aNumOfFilterPatterns, long aFilterPatterns, long aSingleFilterDescription);

    /**
     * Displays a file save dialog.
     *
     * @param aTitle                   the dialog title or {@code NULL}
     * @param aDefaultPathAndFile      the default path and/or file or {@code NULL}
     * @param aFilterPatterns          an array of file type patterns ({@code NULL} or {"*.jpg","*.png"}
     * @param aSingleFilterDescription {@code NULL} or "image files"
     *
     * @return the selected file path or {@code NULL} on cancel
     */
    @Nullable
    @NativeType("char const *")
    public static String tinyfd_saveFileDialog(@Nullable @NativeType("char const *") ByteBuffer aTitle, @Nullable @NativeType("char const *") ByteBuffer aDefaultPathAndFile, @Nullable @NativeType("char const * const *") PointerBuffer aFilterPatterns, @Nullable @NativeType("char const *") ByteBuffer aSingleFilterDescription) {
        if (CHECKS) {
            checkNT1Safe(aTitle);
            checkNT1Safe(aDefaultPathAndFile);
            checkNT1Safe(aSingleFilterDescription);
        }
        long __result = ntinyfd_saveFileDialog(memAddressSafe(aTitle), memAddressSafe(aDefaultPathAndFile), remainingSafe(aFilterPatterns), memAddressSafe(aFilterPatterns), memAddressSafe(aSingleFilterDescription));
        return memUTF8Safe(__result);
    }

    /**
     * Displays a file save dialog.
     *
     * @param aTitle                   the dialog title or {@code NULL}
     * @param aDefaultPathAndFile      the default path and/or file or {@code NULL}
     * @param aFilterPatterns          an array of file type patterns ({@code NULL} or {"*.jpg","*.png"}
     * @param aSingleFilterDescription {@code NULL} or "image files"
     *
     * @return the selected file path or {@code NULL} on cancel
     */
    @Nullable
    @NativeType("char const *")
    public static String tinyfd_saveFileDialog(@Nullable @NativeType("char const *") CharSequence aTitle, @Nullable @NativeType("char const *") CharSequence aDefaultPathAndFile, @Nullable @NativeType("char const * const *") PointerBuffer aFilterPatterns, @Nullable @NativeType("char const *") CharSequence aSingleFilterDescription) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(aTitle, true);
            long aTitleEncoded = aTitle == null ? NULL : stack.getPointerAddress();
            stack.nUTF8Safe(aDefaultPathAndFile, true);
            long aDefaultPathAndFileEncoded = aDefaultPathAndFile == null ? NULL : stack.getPointerAddress();
            stack.nUTF8Safe(aSingleFilterDescription, true);
            long aSingleFilterDescriptionEncoded = aSingleFilterDescription == null ? NULL : stack.getPointerAddress();
            long __result = ntinyfd_saveFileDialog(aTitleEncoded, aDefaultPathAndFileEncoded, remainingSafe(aFilterPatterns), memAddressSafe(aFilterPatterns), aSingleFilterDescriptionEncoded);
            return memUTF8Safe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ tinyfd_openFileDialog ] ---

    /**
     * Unsafe version of: {@link #tinyfd_openFileDialog openFileDialog}
     *
     * @param aNumOfFilterPatterns the number of patterns in {@code aFilterPatterns}
     */
    public static native long ntinyfd_openFileDialog(long aTitle, long aDefaultPathAndFile, int aNumOfFilterPatterns, long aFilterPatterns, long aSingleFilterDescription, int aAllowMultipleSelects);

    /**
     * Displays a file open dialog.
     *
     * @param aTitle                   the dialog title or {@code NULL}
     * @param aDefaultPathAndFile      the default path and/or file or {@code NULL}
     * @param aFilterPatterns          an array of file type patterns ({@code NULL} or {"*.jpg","*.png"}
     * @param aSingleFilterDescription {@code NULL} or "image files"
     * @param aAllowMultipleSelects    if true, multiple selections are allowed
     *
     * @return the file(s) selected or {@code NULL} on cancel. In case of multiple files, the separator is '|'.
     */
    @Nullable
    @NativeType("char const *")
    public static String tinyfd_openFileDialog(@Nullable @NativeType("char const *") ByteBuffer aTitle, @Nullable @NativeType("char const *") ByteBuffer aDefaultPathAndFile, @Nullable @NativeType("char const * const *") PointerBuffer aFilterPatterns, @Nullable @NativeType("char const *") ByteBuffer aSingleFilterDescription, @NativeType("int") boolean aAllowMultipleSelects) {
        if (CHECKS) {
            checkNT1Safe(aTitle);
            checkNT1Safe(aDefaultPathAndFile);
            checkNT1Safe(aSingleFilterDescription);
        }
        long __result = ntinyfd_openFileDialog(memAddressSafe(aTitle), memAddressSafe(aDefaultPathAndFile), remainingSafe(aFilterPatterns), memAddressSafe(aFilterPatterns), memAddressSafe(aSingleFilterDescription), aAllowMultipleSelects ? 1 : 0);
        return memUTF8Safe(__result);
    }

    /**
     * Displays a file open dialog.
     *
     * @param aTitle                   the dialog title or {@code NULL}
     * @param aDefaultPathAndFile      the default path and/or file or {@code NULL}
     * @param aFilterPatterns          an array of file type patterns ({@code NULL} or {"*.jpg","*.png"}
     * @param aSingleFilterDescription {@code NULL} or "image files"
     * @param aAllowMultipleSelects    if true, multiple selections are allowed
     *
     * @return the file(s) selected or {@code NULL} on cancel. In case of multiple files, the separator is '|'.
     */
    @Nullable
    @NativeType("char const *")
    public static String tinyfd_openFileDialog(@Nullable @NativeType("char const *") CharSequence aTitle, @Nullable @NativeType("char const *") CharSequence aDefaultPathAndFile, @Nullable @NativeType("char const * const *") PointerBuffer aFilterPatterns, @Nullable @NativeType("char const *") CharSequence aSingleFilterDescription, @NativeType("int") boolean aAllowMultipleSelects) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(aTitle, true);
            long aTitleEncoded = aTitle == null ? NULL : stack.getPointerAddress();
            stack.nUTF8Safe(aDefaultPathAndFile, true);
            long aDefaultPathAndFileEncoded = aDefaultPathAndFile == null ? NULL : stack.getPointerAddress();
            stack.nUTF8Safe(aSingleFilterDescription, true);
            long aSingleFilterDescriptionEncoded = aSingleFilterDescription == null ? NULL : stack.getPointerAddress();
            long __result = ntinyfd_openFileDialog(aTitleEncoded, aDefaultPathAndFileEncoded, remainingSafe(aFilterPatterns), memAddressSafe(aFilterPatterns), aSingleFilterDescriptionEncoded, aAllowMultipleSelects ? 1 : 0);
            return memUTF8Safe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ tinyfd_selectFolderDialog ] ---

    /** Unsafe version of: {@link #tinyfd_selectFolderDialog selectFolderDialog} */
    public static native long ntinyfd_selectFolderDialog(long aTitle, long aDefaultPath);

    /**
     * Displays a folder selection dialog.
     *
     * @param aTitle       the dialog title or {@code NULL}
     * @param aDefaultPath the default path or {@code NULL}
     */
    @Nullable
    @NativeType("char const *")
    public static String tinyfd_selectFolderDialog(@Nullable @NativeType("char const *") ByteBuffer aTitle, @NativeType("char const *") ByteBuffer aDefaultPath) {
        if (CHECKS) {
            checkNT1Safe(aTitle);
            checkNT1(aDefaultPath);
        }
        long __result = ntinyfd_selectFolderDialog(memAddressSafe(aTitle), memAddress(aDefaultPath));
        return memUTF8Safe(__result);
    }

    /**
     * Displays a folder selection dialog.
     *
     * @param aTitle       the dialog title or {@code NULL}
     * @param aDefaultPath the default path or {@code NULL}
     */
    @Nullable
    @NativeType("char const *")
    public static String tinyfd_selectFolderDialog(@Nullable @NativeType("char const *") CharSequence aTitle, @NativeType("char const *") CharSequence aDefaultPath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(aTitle, true);
            long aTitleEncoded = aTitle == null ? NULL : stack.getPointerAddress();
            stack.nUTF8(aDefaultPath, true);
            long aDefaultPathEncoded = stack.getPointerAddress();
            long __result = ntinyfd_selectFolderDialog(aTitleEncoded, aDefaultPathEncoded);
            return memUTF8Safe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ tinyfd_colorChooser ] ---

    /** Unsafe version of: {@link #tinyfd_colorChooser colorChooser} */
    public static native long ntinyfd_colorChooser(long aTitle, long aDefaultHexRGB, long aDefaultRGB, long aoResultRGB);

    /**
     * Displays a color chooser dialog.
     *
     * @param aTitle         the dialog title or {@code NULL}
     * @param aDefaultHexRGB {@code NULL} or "#FF0000"
     * @param aDefaultRGB    { 0 , 255 , 255 }. Used only if {@code aDefaultHexRGB} is {@code NULL}.
     * @param aoResultRGB    returns the selected color. {@code aDefaultRGB} and {@code aoResultRGB} can be the same array.
     *
     * @return the selected hexcolor as a string "#FF0000" or {@code NULL} on cancel
     */
    @Nullable
    @NativeType("char const *")
    public static String tinyfd_colorChooser(@Nullable @NativeType("char const *") ByteBuffer aTitle, @Nullable @NativeType("char const *") ByteBuffer aDefaultHexRGB, @Nullable @NativeType("unsigned char *") ByteBuffer aDefaultRGB, @NativeType("unsigned char *") ByteBuffer aoResultRGB) {
        if (CHECKS) {
            checkNT1Safe(aTitle);
            checkNT1Safe(aDefaultHexRGB);
            checkSafe(aDefaultRGB, 3);
            check(aoResultRGB, 3);
        }
        long __result = ntinyfd_colorChooser(memAddressSafe(aTitle), memAddressSafe(aDefaultHexRGB), memAddressSafe(aDefaultRGB), memAddress(aoResultRGB));
        return memUTF8Safe(__result);
    }

    /**
     * Displays a color chooser dialog.
     *
     * @param aTitle         the dialog title or {@code NULL}
     * @param aDefaultHexRGB {@code NULL} or "#FF0000"
     * @param aDefaultRGB    { 0 , 255 , 255 }. Used only if {@code aDefaultHexRGB} is {@code NULL}.
     * @param aoResultRGB    returns the selected color. {@code aDefaultRGB} and {@code aoResultRGB} can be the same array.
     *
     * @return the selected hexcolor as a string "#FF0000" or {@code NULL} on cancel
     */
    @Nullable
    @NativeType("char const *")
    public static String tinyfd_colorChooser(@Nullable @NativeType("char const *") CharSequence aTitle, @Nullable @NativeType("char const *") CharSequence aDefaultHexRGB, @Nullable @NativeType("unsigned char *") ByteBuffer aDefaultRGB, @NativeType("unsigned char *") ByteBuffer aoResultRGB) {
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