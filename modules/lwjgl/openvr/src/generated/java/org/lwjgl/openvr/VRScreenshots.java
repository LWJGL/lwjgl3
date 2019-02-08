/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Allows the application to generate screenshots. */
public class VRScreenshots {

    protected VRScreenshots() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRScreenshots_RequestScreenshot ] ---

    /** Unsafe version of: {@link #VRScreenshots_RequestScreenshot RequestScreenshot} */
    public static int nVRScreenshots_RequestScreenshot(long pOutScreenshotHandle, int type, long pchPreviewFilename, long pchVRFilename) {
        long __functionAddress = OpenVR.VRScreenshots.RequestScreenshot;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(pOutScreenshotHandle, type, pchPreviewFilename, pchVRFilename, __functionAddress);
    }

    /**
     * Request a screenshot of the requested type.
     * 
     * <p>A request of the {@link VR#EVRScreenshotType_VRScreenshotType_Stereo} type will always work. Other types will depend on the underlying application support.</p>
     * 
     * <p>The first file name is for the preview image and should be a regular screenshot (ideally from the left eye). The second is the VR screenshot in the
     * correct format. They should be in the same aspect ratio.</p>
     * 
     * <p>Note that the VR dashboard will call this function when the user presses the screenshot binding (currently System Button + Trigger). If Steam is
     * running, the destination file names will be in %TEMP% and will be copied into Steam's screenshot library for the running application once
     * {@link #VRScreenshots_SubmitScreenshot SubmitScreenshot} is called. If Steam is not running, the paths will be in the user's documents folder under Documents\SteamVR\Screenshots. Other VR
     * applications can call this to initate a screenshot outside of user control. The destination file names do not need an extension, will be replaced with
     * the correct one for the format which is currently .png.</p>
     *
     * @param type one of:<br><table><tr><td>{@link VR#EVRScreenshotType_VRScreenshotType_None}</td></tr><tr><td>{@link VR#EVRScreenshotType_VRScreenshotType_Mono}</td></tr><tr><td>{@link VR#EVRScreenshotType_VRScreenshotType_Stereo}</td></tr><tr><td>{@link VR#EVRScreenshotType_VRScreenshotType_Cubemap}</td></tr><tr><td>{@link VR#EVRScreenshotType_VRScreenshotType_MonoPanorama}</td></tr><tr><td>{@link VR#EVRScreenshotType_VRScreenshotType_StereoPanorama}</td></tr></table>
     */
    @NativeType("EVRScreenshotError")
    public static int VRScreenshots_RequestScreenshot(@NativeType("ScreenshotHandle_t *") IntBuffer pOutScreenshotHandle, @NativeType("EVRScreenshotType") int type, @NativeType("char const *") ByteBuffer pchPreviewFilename, @NativeType("char const *") ByteBuffer pchVRFilename) {
        if (CHECKS) {
            check(pOutScreenshotHandle, 1);
            checkNT1(pchPreviewFilename);
            checkNT1(pchVRFilename);
        }
        return nVRScreenshots_RequestScreenshot(memAddress(pOutScreenshotHandle), type, memAddress(pchPreviewFilename), memAddress(pchVRFilename));
    }

    /**
     * Request a screenshot of the requested type.
     * 
     * <p>A request of the {@link VR#EVRScreenshotType_VRScreenshotType_Stereo} type will always work. Other types will depend on the underlying application support.</p>
     * 
     * <p>The first file name is for the preview image and should be a regular screenshot (ideally from the left eye). The second is the VR screenshot in the
     * correct format. They should be in the same aspect ratio.</p>
     * 
     * <p>Note that the VR dashboard will call this function when the user presses the screenshot binding (currently System Button + Trigger). If Steam is
     * running, the destination file names will be in %TEMP% and will be copied into Steam's screenshot library for the running application once
     * {@link #VRScreenshots_SubmitScreenshot SubmitScreenshot} is called. If Steam is not running, the paths will be in the user's documents folder under Documents\SteamVR\Screenshots. Other VR
     * applications can call this to initate a screenshot outside of user control. The destination file names do not need an extension, will be replaced with
     * the correct one for the format which is currently .png.</p>
     *
     * @param type one of:<br><table><tr><td>{@link VR#EVRScreenshotType_VRScreenshotType_None}</td></tr><tr><td>{@link VR#EVRScreenshotType_VRScreenshotType_Mono}</td></tr><tr><td>{@link VR#EVRScreenshotType_VRScreenshotType_Stereo}</td></tr><tr><td>{@link VR#EVRScreenshotType_VRScreenshotType_Cubemap}</td></tr><tr><td>{@link VR#EVRScreenshotType_VRScreenshotType_MonoPanorama}</td></tr><tr><td>{@link VR#EVRScreenshotType_VRScreenshotType_StereoPanorama}</td></tr></table>
     */
    @NativeType("EVRScreenshotError")
    public static int VRScreenshots_RequestScreenshot(@NativeType("ScreenshotHandle_t *") IntBuffer pOutScreenshotHandle, @NativeType("EVRScreenshotType") int type, @NativeType("char const *") CharSequence pchPreviewFilename, @NativeType("char const *") CharSequence pchVRFilename) {
        if (CHECKS) {
            check(pOutScreenshotHandle, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchPreviewFilename, true);
            long pchPreviewFilenameEncoded = stack.getPointerAddress();
            stack.nASCII(pchVRFilename, true);
            long pchVRFilenameEncoded = stack.getPointerAddress();
            return nVRScreenshots_RequestScreenshot(memAddress(pOutScreenshotHandle), type, pchPreviewFilenameEncoded, pchVRFilenameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRScreenshots_HookScreenshot ] ---

    /** Unsafe version of: {@link #VRScreenshots_HookScreenshot HookScreenshot} */
    public static int nVRScreenshots_HookScreenshot(long pSupportedTypes, int numTypes) {
        long __functionAddress = OpenVR.VRScreenshots.HookScreenshot;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pSupportedTypes, numTypes, __functionAddress);
    }

    /**
     * Called by the running VR application to indicate that it wishes to be in charge of screenshots. If the application does not call this, the Compositor
     * will only support {@link VR#EVRScreenshotType_VRScreenshotType_Stereo} screenshots that will be captured without notification to the running app.
     * 
     * <p>Once hooked your application will receive a {@link VR#EVREventType_VREvent_RequestScreenshot} event when the user presses the buttons to take a screenshot.</p>
     */
    @NativeType("EVRScreenshotError")
    public static int VRScreenshots_HookScreenshot(@NativeType("EVRScreenshotType const *") IntBuffer pSupportedTypes) {
        return nVRScreenshots_HookScreenshot(memAddress(pSupportedTypes), pSupportedTypes.remaining());
    }

    // --- [ VRScreenshots_GetScreenshotPropertyType ] ---

    /** Unsafe version of: {@link #VRScreenshots_GetScreenshotPropertyType GetScreenshotPropertyType} */
    public static int nVRScreenshots_GetScreenshotPropertyType(int screenshotHandle, long pError) {
        long __functionAddress = OpenVR.VRScreenshots.GetScreenshotPropertyType;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(screenshotHandle, pError, __functionAddress);
    }

    /** When your application receives a {@link VR#EVREventType_VREvent_RequestScreenshot} event, call these functions to get the details of the screenshot request. */
    @NativeType("EVRScreenshotType")
    public static int VRScreenshots_GetScreenshotPropertyType(@NativeType("ScreenshotHandle_t") int screenshotHandle, @NativeType("EVRScreenshotError *") IntBuffer pError) {
        if (CHECKS) {
            check(pError, 1);
        }
        return nVRScreenshots_GetScreenshotPropertyType(screenshotHandle, memAddress(pError));
    }

    // --- [ VRScreenshots_GetScreenshotPropertyFilename ] ---

    /** Unsafe version of: {@link #VRScreenshots_GetScreenshotPropertyFilename GetScreenshotPropertyFilename} */
    public static int nVRScreenshots_GetScreenshotPropertyFilename(int screenshotHandle, int filenameType, long pchFilename, int cchFilename, long pError) {
        long __functionAddress = OpenVR.VRScreenshots.GetScreenshotPropertyFilename;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(screenshotHandle, filenameType, pchFilename, cchFilename, pError, __functionAddress);
    }

    /**
     * Get the filename for the preview or vr image (see {@code EScreenshotPropertyFilenames}).
     *
     * @param filenameType one of:<br><table><tr><td>{@link VR#EVRScreenshotPropertyFilenames_VRScreenshotPropertyFilenames_Preview}</td></tr><tr><td>{@link VR#EVRScreenshotPropertyFilenames_VRScreenshotPropertyFilenames_VR}</td></tr></table>
     *
     * @return the size of the string
     */
    @NativeType("uint32_t")
    public static int VRScreenshots_GetScreenshotPropertyFilename(@NativeType("ScreenshotHandle_t") int screenshotHandle, @NativeType("EVRScreenshotPropertyFilenames") int filenameType, @Nullable @NativeType("char *") ByteBuffer pchFilename, @NativeType("EVRScreenshotError *") IntBuffer pError) {
        if (CHECKS) {
            check(pError, 1);
        }
        return nVRScreenshots_GetScreenshotPropertyFilename(screenshotHandle, filenameType, memAddressSafe(pchFilename), remainingSafe(pchFilename), memAddress(pError));
    }

    /**
     * Get the filename for the preview or vr image (see {@code EScreenshotPropertyFilenames}).
     *
     * @param filenameType one of:<br><table><tr><td>{@link VR#EVRScreenshotPropertyFilenames_VRScreenshotPropertyFilenames_Preview}</td></tr><tr><td>{@link VR#EVRScreenshotPropertyFilenames_VRScreenshotPropertyFilenames_VR}</td></tr></table>
     *
     * @return the size of the string
     */
    @NativeType("uint32_t")
    public static String VRScreenshots_GetScreenshotPropertyFilename(@NativeType("ScreenshotHandle_t") int screenshotHandle, @NativeType("EVRScreenshotPropertyFilenames") int filenameType, @NativeType("uint32_t") int cchFilename, @NativeType("EVRScreenshotError *") IntBuffer pError) {
        if (CHECKS) {
            check(pError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchFilename = stack.malloc(cchFilename);
            int __result = nVRScreenshots_GetScreenshotPropertyFilename(screenshotHandle, filenameType, memAddress(pchFilename), cchFilename, memAddress(pError));
            return memASCII(pchFilename, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRScreenshots_UpdateScreenshotProgress ] ---

    /**
     * Call this if the application is taking the screen shot will take more than a few ms processing. This will result in an overlay being presented that
     * shows a completion bar.
     */
    @NativeType("EVRScreenshotError")
    public static int VRScreenshots_UpdateScreenshotProgress(@NativeType("ScreenshotHandle_t") int screenshotHandle, float flProgress) {
        long __functionAddress = OpenVR.VRScreenshots.UpdateScreenshotProgress;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(screenshotHandle, flProgress, __functionAddress);
    }

    // --- [ VRScreenshots_TakeStereoScreenshot ] ---

    /** Unsafe version of: {@link #VRScreenshots_TakeStereoScreenshot TakeStereoScreenshot} */
    public static int nVRScreenshots_TakeStereoScreenshot(long pOutScreenshotHandle, long pchPreviewFilename, long pchVRFilename) {
        long __functionAddress = OpenVR.VRScreenshots.TakeStereoScreenshot;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(pOutScreenshotHandle, pchPreviewFilename, pchVRFilename, __functionAddress);
    }

    /**
     * Tells the compositor to take an internal screenshot of type {@link VR#EVRScreenshotType_VRScreenshotType_Stereo}. It will take the current submitted scene
     * textures of the running application and write them into the preview image and a side-by-side file for the VR image.
     * 
     * <p>This is similiar to request screenshot, but doesn't ever talk to the application, just takes the shot and submits.</p>
     */
    @NativeType("EVRScreenshotError")
    public static int VRScreenshots_TakeStereoScreenshot(@NativeType("ScreenshotHandle_t *") IntBuffer pOutScreenshotHandle, @NativeType("char const *") ByteBuffer pchPreviewFilename, @NativeType("char const *") ByteBuffer pchVRFilename) {
        if (CHECKS) {
            check(pOutScreenshotHandle, 1);
            checkNT1(pchPreviewFilename);
            checkNT1(pchVRFilename);
        }
        return nVRScreenshots_TakeStereoScreenshot(memAddress(pOutScreenshotHandle), memAddress(pchPreviewFilename), memAddress(pchVRFilename));
    }

    /**
     * Tells the compositor to take an internal screenshot of type {@link VR#EVRScreenshotType_VRScreenshotType_Stereo}. It will take the current submitted scene
     * textures of the running application and write them into the preview image and a side-by-side file for the VR image.
     * 
     * <p>This is similiar to request screenshot, but doesn't ever talk to the application, just takes the shot and submits.</p>
     */
    @NativeType("EVRScreenshotError")
    public static int VRScreenshots_TakeStereoScreenshot(@NativeType("ScreenshotHandle_t *") IntBuffer pOutScreenshotHandle, @NativeType("char const *") CharSequence pchPreviewFilename, @NativeType("char const *") CharSequence pchVRFilename) {
        if (CHECKS) {
            check(pOutScreenshotHandle, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchPreviewFilename, true);
            long pchPreviewFilenameEncoded = stack.getPointerAddress();
            stack.nASCII(pchVRFilename, true);
            long pchVRFilenameEncoded = stack.getPointerAddress();
            return nVRScreenshots_TakeStereoScreenshot(memAddress(pOutScreenshotHandle), pchPreviewFilenameEncoded, pchVRFilenameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRScreenshots_SubmitScreenshot ] ---

    /** Unsafe version of: {@link #VRScreenshots_SubmitScreenshot SubmitScreenshot} */
    public static int nVRScreenshots_SubmitScreenshot(int screenshotHandle, int type, long pchSourcePreviewFilename, long pchSourceVRFilename) {
        long __functionAddress = OpenVR.VRScreenshots.SubmitScreenshot;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(screenshotHandle, type, pchSourcePreviewFilename, pchSourceVRFilename, __functionAddress);
    }

    /**
     * Submit the completed screenshot.
     * 
     * <p>If Steam is running this will call into the Steam client and upload the screenshot to the screenshots section of the library for the running
     * application. If Steam is not running, this function will display a notification to the user that the screenshot was taken. The paths should be full
     * paths with extensions.</p>
     * 
     * <p>File paths should be absolute including extensions.</p>
     * 
     * <p>{@code screenshotHandle} can be {@link VR#k_unScreenshotHandleInvalid} if this was a new shot taking by the app to be saved and not initiated by a user
     * (achievement earned or something).</p>
     *
     * @param type one of:<br><table><tr><td>{@link VR#EVRScreenshotType_VRScreenshotType_None}</td></tr><tr><td>{@link VR#EVRScreenshotType_VRScreenshotType_Mono}</td></tr><tr><td>{@link VR#EVRScreenshotType_VRScreenshotType_Stereo}</td></tr><tr><td>{@link VR#EVRScreenshotType_VRScreenshotType_Cubemap}</td></tr><tr><td>{@link VR#EVRScreenshotType_VRScreenshotType_MonoPanorama}</td></tr><tr><td>{@link VR#EVRScreenshotType_VRScreenshotType_StereoPanorama}</td></tr></table>
     */
    @NativeType("EVRScreenshotError")
    public static int VRScreenshots_SubmitScreenshot(@NativeType("ScreenshotHandle_t") int screenshotHandle, @NativeType("EVRScreenshotType") int type, @NativeType("char const *") ByteBuffer pchSourcePreviewFilename, @NativeType("char const *") ByteBuffer pchSourceVRFilename) {
        if (CHECKS) {
            checkNT1(pchSourcePreviewFilename);
            checkNT1(pchSourceVRFilename);
        }
        return nVRScreenshots_SubmitScreenshot(screenshotHandle, type, memAddress(pchSourcePreviewFilename), memAddress(pchSourceVRFilename));
    }

    /**
     * Submit the completed screenshot.
     * 
     * <p>If Steam is running this will call into the Steam client and upload the screenshot to the screenshots section of the library for the running
     * application. If Steam is not running, this function will display a notification to the user that the screenshot was taken. The paths should be full
     * paths with extensions.</p>
     * 
     * <p>File paths should be absolute including extensions.</p>
     * 
     * <p>{@code screenshotHandle} can be {@link VR#k_unScreenshotHandleInvalid} if this was a new shot taking by the app to be saved and not initiated by a user
     * (achievement earned or something).</p>
     *
     * @param type one of:<br><table><tr><td>{@link VR#EVRScreenshotType_VRScreenshotType_None}</td></tr><tr><td>{@link VR#EVRScreenshotType_VRScreenshotType_Mono}</td></tr><tr><td>{@link VR#EVRScreenshotType_VRScreenshotType_Stereo}</td></tr><tr><td>{@link VR#EVRScreenshotType_VRScreenshotType_Cubemap}</td></tr><tr><td>{@link VR#EVRScreenshotType_VRScreenshotType_MonoPanorama}</td></tr><tr><td>{@link VR#EVRScreenshotType_VRScreenshotType_StereoPanorama}</td></tr></table>
     */
    @NativeType("EVRScreenshotError")
    public static int VRScreenshots_SubmitScreenshot(@NativeType("ScreenshotHandle_t") int screenshotHandle, @NativeType("EVRScreenshotType") int type, @NativeType("char const *") CharSequence pchSourcePreviewFilename, @NativeType("char const *") CharSequence pchSourceVRFilename) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchSourcePreviewFilename, true);
            long pchSourcePreviewFilenameEncoded = stack.getPointerAddress();
            stack.nASCII(pchSourceVRFilename, true);
            long pchSourceVRFilenameEncoded = stack.getPointerAddress();
            return nVRScreenshots_SubmitScreenshot(screenshotHandle, type, pchSourcePreviewFilenameEncoded, pchSourceVRFilenameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}