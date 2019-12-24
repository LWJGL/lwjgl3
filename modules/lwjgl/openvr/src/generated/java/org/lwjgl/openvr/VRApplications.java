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

/** Application management. */
public class VRApplications {

    protected VRApplications() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRApplications_AddApplicationManifest ] ---

    /** Unsafe version of: {@link #VRApplications_AddApplicationManifest AddApplicationManifest} */
    public static int nVRApplications_AddApplicationManifest(long pchApplicationManifestFullPath, boolean bTemporary) {
        long __functionAddress = OpenVR.VRApplications.AddApplicationManifest;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchApplicationManifestFullPath, bTemporary, __functionAddress);
    }

    /**
     * Adds an application manifest to the list to load when building the list of installed applications.
     * 
     * <p>Temporary manifests are not automatically loaded.</p>
     */
    @NativeType("EVRApplicationError")
    public static int VRApplications_AddApplicationManifest(@NativeType("char const *") ByteBuffer pchApplicationManifestFullPath, @NativeType("bool") boolean bTemporary) {
        if (CHECKS) {
            checkNT1(pchApplicationManifestFullPath);
        }
        return nVRApplications_AddApplicationManifest(memAddress(pchApplicationManifestFullPath), bTemporary);
    }

    /**
     * Adds an application manifest to the list to load when building the list of installed applications.
     * 
     * <p>Temporary manifests are not automatically loaded.</p>
     */
    @NativeType("EVRApplicationError")
    public static int VRApplications_AddApplicationManifest(@NativeType("char const *") CharSequence pchApplicationManifestFullPath, @NativeType("bool") boolean bTemporary) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchApplicationManifestFullPath, true);
            long pchApplicationManifestFullPathEncoded = stack.getPointerAddress();
            return nVRApplications_AddApplicationManifest(pchApplicationManifestFullPathEncoded, bTemporary);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_RemoveApplicationManifest ] ---

    /** Unsafe version of: {@link #VRApplications_RemoveApplicationManifest RemoveApplicationManifest} */
    public static int nVRApplications_RemoveApplicationManifest(long pchApplicationManifestFullPath) {
        long __functionAddress = OpenVR.VRApplications.RemoveApplicationManifest;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchApplicationManifestFullPath, __functionAddress);
    }

    /** Removes an application manifest from the list to load when building the list of installed applications. */
    @NativeType("EVRApplicationError")
    public static int VRApplications_RemoveApplicationManifest(@NativeType("char const *") ByteBuffer pchApplicationManifestFullPath) {
        if (CHECKS) {
            checkNT1(pchApplicationManifestFullPath);
        }
        return nVRApplications_RemoveApplicationManifest(memAddress(pchApplicationManifestFullPath));
    }

    /** Removes an application manifest from the list to load when building the list of installed applications. */
    @NativeType("EVRApplicationError")
    public static int VRApplications_RemoveApplicationManifest(@NativeType("char const *") CharSequence pchApplicationManifestFullPath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchApplicationManifestFullPath, true);
            long pchApplicationManifestFullPathEncoded = stack.getPointerAddress();
            return nVRApplications_RemoveApplicationManifest(pchApplicationManifestFullPathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_IsApplicationInstalled ] ---

    /** Unsafe version of: {@link #VRApplications_IsApplicationInstalled IsApplicationInstalled} */
    public static boolean nVRApplications_IsApplicationInstalled(long pchAppKey) {
        long __functionAddress = OpenVR.VRApplications.IsApplicationInstalled;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(pchAppKey, __functionAddress);
    }

    /** Returns true if an application is installed. */
    @NativeType("bool")
    public static boolean VRApplications_IsApplicationInstalled(@NativeType("char const *") ByteBuffer pchAppKey) {
        if (CHECKS) {
            checkNT1(pchAppKey);
        }
        return nVRApplications_IsApplicationInstalled(memAddress(pchAppKey));
    }

    /** Returns true if an application is installed. */
    @NativeType("bool")
    public static boolean VRApplications_IsApplicationInstalled(@NativeType("char const *") CharSequence pchAppKey) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_IsApplicationInstalled(pchAppKeyEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_GetApplicationCount ] ---

    /** Returns the number of applications available in the list. */
    @NativeType("uint32_t")
    public static int VRApplications_GetApplicationCount() {
        long __functionAddress = OpenVR.VRApplications.GetApplicationCount;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VRApplications_GetApplicationKeyByIndex ] ---

    /** Unsafe version of: {@link #VRApplications_GetApplicationKeyByIndex GetApplicationKeyByIndex} */
    public static int nVRApplications_GetApplicationKeyByIndex(int unApplicationIndex, long pchAppKeyBuffer, int unAppKeyBufferLen) {
        long __functionAddress = OpenVR.VRApplications.GetApplicationKeyByIndex;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(unApplicationIndex, pchAppKeyBuffer, unAppKeyBufferLen, __functionAddress);
    }

    /**
     * Returns the key of the specified application. The index is at least 0 and is less than the return value of {@link #VRApplications_GetApplicationCount GetApplicationCount}. The buffer should be
     * at least {@link VR#k_unMaxApplicationKeyLength} in order to fit the key.
     */
    @NativeType("EVRApplicationError")
    public static int VRApplications_GetApplicationKeyByIndex(@NativeType("uint32_t") int unApplicationIndex, @Nullable @NativeType("char *") ByteBuffer pchAppKeyBuffer) {
        return nVRApplications_GetApplicationKeyByIndex(unApplicationIndex, memAddressSafe(pchAppKeyBuffer), remainingSafe(pchAppKeyBuffer));
    }

    // --- [ VRApplications_GetApplicationKeyByProcessId ] ---

    /** Unsafe version of: {@link #VRApplications_GetApplicationKeyByProcessId GetApplicationKeyByProcessId} */
    public static int nVRApplications_GetApplicationKeyByProcessId(int unProcessId, long pchAppKeyBuffer, int unAppKeyBufferLen) {
        long __functionAddress = OpenVR.VRApplications.GetApplicationKeyByProcessId;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(unProcessId, pchAppKeyBuffer, unAppKeyBufferLen, __functionAddress);
    }

    /** Returns the key of the application for the specified Process Id. The buffer should be at least {@link VR#k_unMaxApplicationKeyLength} in order to fit the key. */
    @NativeType("EVRApplicationError")
    public static int VRApplications_GetApplicationKeyByProcessId(@NativeType("uint32_t") int unProcessId, @Nullable @NativeType("char *") ByteBuffer pchAppKeyBuffer) {
        return nVRApplications_GetApplicationKeyByProcessId(unProcessId, memAddressSafe(pchAppKeyBuffer), remainingSafe(pchAppKeyBuffer));
    }

    // --- [ VRApplications_LaunchApplication ] ---

    /** Unsafe version of: {@link #VRApplications_LaunchApplication LaunchApplication} */
    public static int nVRApplications_LaunchApplication(long pchAppKey) {
        long __functionAddress = OpenVR.VRApplications.LaunchApplication;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchAppKey, __functionAddress);
    }

    /**
     * Launches the application. The existing scene application will exit and then the new application will start.
     * 
     * <p>This call is not valid for dashboard overlay applications.</p>
     */
    @NativeType("EVRApplicationError")
    public static int VRApplications_LaunchApplication(@NativeType("char const *") ByteBuffer pchAppKey) {
        if (CHECKS) {
            checkNT1(pchAppKey);
        }
        return nVRApplications_LaunchApplication(memAddress(pchAppKey));
    }

    /**
     * Launches the application. The existing scene application will exit and then the new application will start.
     * 
     * <p>This call is not valid for dashboard overlay applications.</p>
     */
    @NativeType("EVRApplicationError")
    public static int VRApplications_LaunchApplication(@NativeType("char const *") CharSequence pchAppKey) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_LaunchApplication(pchAppKeyEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_LaunchTemplateApplication ] ---

    /** Unsafe version of: {@link #VRApplications_LaunchTemplateApplication LaunchTemplateApplication} */
    public static int nVRApplications_LaunchTemplateApplication(long pchTemplateAppKey, long pchNewAppKey, long pKeys, int unKeys) {
        long __functionAddress = OpenVR.VRApplications.LaunchTemplateApplication;
        if (CHECKS) {
            check(__functionAddress);
            AppOverrideKeys.validate(pKeys, unKeys);
        }
        return callPPPI(pchTemplateAppKey, pchNewAppKey, pKeys, unKeys, __functionAddress);
    }

    /**
     * Launches an instance of an application of type template, with its app key being {@code pchNewAppKey} (which must be unique) and optionally override
     * sections from the manifest file via {@link AppOverrideKeys}.
     */
    @NativeType("EVRApplicationError")
    public static int VRApplications_LaunchTemplateApplication(@NativeType("char const *") ByteBuffer pchTemplateAppKey, @NativeType("char const *") ByteBuffer pchNewAppKey, @NativeType("AppOverrideKeys_t const *") AppOverrideKeys.Buffer pKeys) {
        if (CHECKS) {
            checkNT1(pchTemplateAppKey);
            checkNT1(pchNewAppKey);
        }
        return nVRApplications_LaunchTemplateApplication(memAddress(pchTemplateAppKey), memAddress(pchNewAppKey), pKeys.address(), pKeys.remaining());
    }

    /**
     * Launches an instance of an application of type template, with its app key being {@code pchNewAppKey} (which must be unique) and optionally override
     * sections from the manifest file via {@link AppOverrideKeys}.
     */
    @NativeType("EVRApplicationError")
    public static int VRApplications_LaunchTemplateApplication(@NativeType("char const *") CharSequence pchTemplateAppKey, @NativeType("char const *") CharSequence pchNewAppKey, @NativeType("AppOverrideKeys_t const *") AppOverrideKeys.Buffer pKeys) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchTemplateAppKey, true);
            long pchTemplateAppKeyEncoded = stack.getPointerAddress();
            stack.nASCII(pchNewAppKey, true);
            long pchNewAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_LaunchTemplateApplication(pchTemplateAppKeyEncoded, pchNewAppKeyEncoded, pKeys.address(), pKeys.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_LaunchApplicationFromMimeType ] ---

    /** Unsafe version of: {@link #VRApplications_LaunchApplicationFromMimeType LaunchApplicationFromMimeType} */
    public static int nVRApplications_LaunchApplicationFromMimeType(long pchMimeType, long pchArgs) {
        long __functionAddress = OpenVR.VRApplications.LaunchApplicationFromMimeType;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pchMimeType, pchArgs, __functionAddress);
    }

    /**
     * Launches the application currently associated with this mime type and passes it the option args, typically the filename or object name of the item
     * being launched.
     */
    @NativeType("EVRApplicationError")
    public static int VRApplications_LaunchApplicationFromMimeType(@NativeType("char const *") ByteBuffer pchMimeType, @NativeType("char const *") ByteBuffer pchArgs) {
        if (CHECKS) {
            checkNT1(pchMimeType);
            checkNT1(pchArgs);
        }
        return nVRApplications_LaunchApplicationFromMimeType(memAddress(pchMimeType), memAddress(pchArgs));
    }

    /**
     * Launches the application currently associated with this mime type and passes it the option args, typically the filename or object name of the item
     * being launched.
     */
    @NativeType("EVRApplicationError")
    public static int VRApplications_LaunchApplicationFromMimeType(@NativeType("char const *") CharSequence pchMimeType, @NativeType("char const *") CharSequence pchArgs) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchMimeType, true);
            long pchMimeTypeEncoded = stack.getPointerAddress();
            stack.nASCII(pchArgs, true);
            long pchArgsEncoded = stack.getPointerAddress();
            return nVRApplications_LaunchApplicationFromMimeType(pchMimeTypeEncoded, pchArgsEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_LaunchDashboardOverlay ] ---

    /** Unsafe version of: {@link #VRApplications_LaunchDashboardOverlay LaunchDashboardOverlay} */
    public static int nVRApplications_LaunchDashboardOverlay(long pchAppKey) {
        long __functionAddress = OpenVR.VRApplications.LaunchDashboardOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchAppKey, __functionAddress);
    }

    /** Launches the dashboard overlay application if it is not already running. This call is only valid for dashboard overlay applications. */
    @NativeType("EVRApplicationError")
    public static int VRApplications_LaunchDashboardOverlay(@NativeType("char const *") ByteBuffer pchAppKey) {
        if (CHECKS) {
            checkNT1(pchAppKey);
        }
        return nVRApplications_LaunchDashboardOverlay(memAddress(pchAppKey));
    }

    /** Launches the dashboard overlay application if it is not already running. This call is only valid for dashboard overlay applications. */
    @NativeType("EVRApplicationError")
    public static int VRApplications_LaunchDashboardOverlay(@NativeType("char const *") CharSequence pchAppKey) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_LaunchDashboardOverlay(pchAppKeyEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_CancelApplicationLaunch ] ---

    /** Unsafe version of: {@link #VRApplications_CancelApplicationLaunch CancelApplicationLaunch} */
    public static boolean nVRApplications_CancelApplicationLaunch(long pchAppKey) {
        long __functionAddress = OpenVR.VRApplications.CancelApplicationLaunch;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(pchAppKey, __functionAddress);
    }

    /** Cancel a pending launch for an application. */
    @NativeType("bool")
    public static boolean VRApplications_CancelApplicationLaunch(@NativeType("char const *") ByteBuffer pchAppKey) {
        if (CHECKS) {
            checkNT1(pchAppKey);
        }
        return nVRApplications_CancelApplicationLaunch(memAddress(pchAppKey));
    }

    /** Cancel a pending launch for an application. */
    @NativeType("bool")
    public static boolean VRApplications_CancelApplicationLaunch(@NativeType("char const *") CharSequence pchAppKey) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_CancelApplicationLaunch(pchAppKeyEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_IdentifyApplication ] ---

    /** Unsafe version of: {@link #VRApplications_IdentifyApplication IdentifyApplication} */
    public static int nVRApplications_IdentifyApplication(int unProcessId, long pchAppKey) {
        long __functionAddress = OpenVR.VRApplications.IdentifyApplication;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(unProcessId, pchAppKey, __functionAddress);
    }

    /**
     * Identifies a running application. OpenVR can't always tell which process started in response to a URL. This function allows a URL handler (or the
     * process itself) to identify the app key for the now running application. Passing a process ID of 0 identifies the calling process. The application must
     * be one that's known to the system via a call to {@link #VRApplications_AddApplicationManifest AddApplicationManifest}.
     */
    @NativeType("EVRApplicationError")
    public static int VRApplications_IdentifyApplication(@NativeType("uint32_t") int unProcessId, @NativeType("char const *") ByteBuffer pchAppKey) {
        if (CHECKS) {
            checkNT1(pchAppKey);
        }
        return nVRApplications_IdentifyApplication(unProcessId, memAddress(pchAppKey));
    }

    /**
     * Identifies a running application. OpenVR can't always tell which process started in response to a URL. This function allows a URL handler (or the
     * process itself) to identify the app key for the now running application. Passing a process ID of 0 identifies the calling process. The application must
     * be one that's known to the system via a call to {@link #VRApplications_AddApplicationManifest AddApplicationManifest}.
     */
    @NativeType("EVRApplicationError")
    public static int VRApplications_IdentifyApplication(@NativeType("uint32_t") int unProcessId, @NativeType("char const *") CharSequence pchAppKey) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_IdentifyApplication(unProcessId, pchAppKeyEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_GetApplicationProcessId ] ---

    /** Unsafe version of: {@link #VRApplications_GetApplicationProcessId GetApplicationProcessId} */
    public static int nVRApplications_GetApplicationProcessId(long pchAppKey) {
        long __functionAddress = OpenVR.VRApplications.GetApplicationProcessId;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchAppKey, __functionAddress);
    }

    /** Returns the process ID for an application. Return 0 if the application was not found or is not running. */
    @NativeType("uint32_t")
    public static int VRApplications_GetApplicationProcessId(@NativeType("char const *") ByteBuffer pchAppKey) {
        if (CHECKS) {
            checkNT1(pchAppKey);
        }
        return nVRApplications_GetApplicationProcessId(memAddress(pchAppKey));
    }

    /** Returns the process ID for an application. Return 0 if the application was not found or is not running. */
    @NativeType("uint32_t")
    public static int VRApplications_GetApplicationProcessId(@NativeType("char const *") CharSequence pchAppKey) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_GetApplicationProcessId(pchAppKeyEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_GetApplicationsErrorNameFromEnum ] ---

    /** Unsafe version of: {@link #VRApplications_GetApplicationsErrorNameFromEnum GetApplicationsErrorNameFromEnum} */
    public static long nVRApplications_GetApplicationsErrorNameFromEnum(int error) {
        long __functionAddress = OpenVR.VRApplications.GetApplicationsErrorNameFromEnum;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(error, __functionAddress);
    }

    /**
     * Returns a string for an applications error.
     *
     * @param error one of:<br><table><tr><td>{@link VR#EVRApplicationError_VRApplicationError_None}</td></tr><tr><td>{@link VR#EVRApplicationError_VRApplicationError_AppKeyAlreadyExists}</td></tr><tr><td>{@link VR#EVRApplicationError_VRApplicationError_NoManifest}</td></tr><tr><td>{@link VR#EVRApplicationError_VRApplicationError_NoApplication}</td></tr><tr><td>{@link VR#EVRApplicationError_VRApplicationError_InvalidIndex}</td></tr><tr><td>{@link VR#EVRApplicationError_VRApplicationError_UnknownApplication}</td></tr><tr><td>{@link VR#EVRApplicationError_VRApplicationError_IPCFailed}</td></tr><tr><td>{@link VR#EVRApplicationError_VRApplicationError_ApplicationAlreadyRunning}</td></tr><tr><td>{@link VR#EVRApplicationError_VRApplicationError_InvalidManifest}</td></tr><tr><td>{@link VR#EVRApplicationError_VRApplicationError_InvalidApplication}</td></tr><tr><td>{@link VR#EVRApplicationError_VRApplicationError_LaunchFailed}</td></tr><tr><td>{@link VR#EVRApplicationError_VRApplicationError_ApplicationAlreadyStarting}</td></tr><tr><td>{@link VR#EVRApplicationError_VRApplicationError_LaunchInProgress}</td></tr><tr><td>{@link VR#EVRApplicationError_VRApplicationError_OldApplicationQuitting}</td></tr><tr><td>{@link VR#EVRApplicationError_VRApplicationError_TransitionAborted}</td></tr><tr><td>{@link VR#EVRApplicationError_VRApplicationError_IsTemplate}</td></tr><tr><td>{@link VR#EVRApplicationError_VRApplicationError_SteamVRIsExiting}</td></tr><tr><td>{@link VR#EVRApplicationError_VRApplicationError_BufferTooSmall}</td></tr><tr><td>{@link VR#EVRApplicationError_VRApplicationError_PropertyNotSet}</td></tr><tr><td>{@link VR#EVRApplicationError_VRApplicationError_UnknownProperty}</td></tr><tr><td>{@link VR#EVRApplicationError_VRApplicationError_InvalidParameter}</td></tr></table>
     */
    @Nullable
    @NativeType("char const *")
    public static String VRApplications_GetApplicationsErrorNameFromEnum(@NativeType("EVRApplicationError") int error) {
        long __result = nVRApplications_GetApplicationsErrorNameFromEnum(error);
        return memASCIISafe(__result);
    }

    // --- [ VRApplications_GetApplicationPropertyString ] ---

    /** Unsafe version of: {@link #VRApplications_GetApplicationPropertyString GetApplicationPropertyString} */
    public static int nVRApplications_GetApplicationPropertyString(long pchAppKey, int eProperty, long pchPropertyValueBuffer, int unPropertyValueBufferLen, long peError) {
        long __functionAddress = OpenVR.VRApplications.GetApplicationPropertyString;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(pchAppKey, eProperty, pchPropertyValueBuffer, unPropertyValueBufferLen, peError, __functionAddress);
    }

    /**
     * Returns a value for an application property. The required buffer size to fit this value will be returned.
     *
     * @param eProperty one of:<br><table><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_Name_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_LaunchType_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_WorkingDirectory_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_BinaryPath_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_Arguments_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_URL_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_Description_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_NewsURL_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_ImagePath_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_Source_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_ActionManifestURL_String}</td></tr></table>
     */
    @NativeType("uint32_t")
    public static int VRApplications_GetApplicationPropertyString(@NativeType("char const *") ByteBuffer pchAppKey, @NativeType("EVRApplicationProperty") int eProperty, @Nullable @NativeType("char *") ByteBuffer pchPropertyValueBuffer, @NativeType("EVRApplicationError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchAppKey);
            check(peError, 1);
        }
        return nVRApplications_GetApplicationPropertyString(memAddress(pchAppKey), eProperty, memAddressSafe(pchPropertyValueBuffer), remainingSafe(pchPropertyValueBuffer), memAddress(peError));
    }

    /**
     * Returns a value for an application property. The required buffer size to fit this value will be returned.
     *
     * @param eProperty one of:<br><table><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_Name_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_LaunchType_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_WorkingDirectory_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_BinaryPath_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_Arguments_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_URL_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_Description_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_NewsURL_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_ImagePath_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_Source_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_ActionManifestURL_String}</td></tr></table>
     */
    @NativeType("uint32_t")
    public static int VRApplications_GetApplicationPropertyString(@NativeType("char const *") CharSequence pchAppKey, @NativeType("EVRApplicationProperty") int eProperty, @Nullable @NativeType("char *") ByteBuffer pchPropertyValueBuffer, @NativeType("EVRApplicationError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_GetApplicationPropertyString(pchAppKeyEncoded, eProperty, memAddressSafe(pchPropertyValueBuffer), remainingSafe(pchPropertyValueBuffer), memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Returns a value for an application property. The required buffer size to fit this value will be returned.
     *
     * @param eProperty one of:<br><table><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_Name_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_LaunchType_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_WorkingDirectory_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_BinaryPath_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_Arguments_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_URL_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_Description_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_NewsURL_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_ImagePath_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_Source_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_ActionManifestURL_String}</td></tr></table>
     */
    @NativeType("uint32_t")
    public static String VRApplications_GetApplicationPropertyString(@NativeType("char const *") CharSequence pchAppKey, @NativeType("EVRApplicationProperty") int eProperty, @NativeType("uint32_t") int unPropertyValueBufferLen, @NativeType("EVRApplicationError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            ByteBuffer pchPropertyValueBuffer = stack.malloc(unPropertyValueBufferLen);
            int __result = nVRApplications_GetApplicationPropertyString(pchAppKeyEncoded, eProperty, memAddress(pchPropertyValueBuffer), unPropertyValueBufferLen, memAddress(peError));
            return memASCII(pchPropertyValueBuffer, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Returns a value for an application property. The required buffer size to fit this value will be returned.
     *
     * @param eProperty one of:<br><table><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_Name_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_LaunchType_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_WorkingDirectory_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_BinaryPath_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_Arguments_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_URL_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_Description_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_NewsURL_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_ImagePath_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_Source_String}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_ActionManifestURL_String}</td></tr></table>
     */
    @NativeType("uint32_t")
    public static String VRApplications_GetApplicationPropertyString(@NativeType("char const *") CharSequence pchAppKey, @NativeType("EVRApplicationProperty") int eProperty, @NativeType("EVRApplicationError *") IntBuffer peError) {
        return VRApplications_GetApplicationPropertyString(pchAppKey, eProperty, VR.k_unMaxPropertyStringSize, peError);
    }

    // --- [ VRApplications_GetApplicationPropertyBool ] ---

    /** Unsafe version of: {@link #VRApplications_GetApplicationPropertyBool GetApplicationPropertyBool} */
    public static boolean nVRApplications_GetApplicationPropertyBool(long pchAppKey, int eProperty, long peError) {
        long __functionAddress = OpenVR.VRApplications.GetApplicationPropertyBool;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(pchAppKey, eProperty, peError, __functionAddress);
    }

    /**
     * Returns a bool value for an application property. Returns false in all error cases.
     *
     * @param eProperty one of:<br><table><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_IsDashboardOverlay_Bool}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_IsTemplate_Bool}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_IsInstanced_Bool}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_IsInternal_Bool}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_WantsCompositorPauseInStandby_Bool}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_IsHidden_Bool}</td></tr></table>
     */
    @NativeType("bool")
    public static boolean VRApplications_GetApplicationPropertyBool(@NativeType("char const *") ByteBuffer pchAppKey, @NativeType("EVRApplicationProperty") int eProperty, @NativeType("EVRApplicationError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchAppKey);
            check(peError, 1);
        }
        return nVRApplications_GetApplicationPropertyBool(memAddress(pchAppKey), eProperty, memAddress(peError));
    }

    /**
     * Returns a bool value for an application property. Returns false in all error cases.
     *
     * @param eProperty one of:<br><table><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_IsDashboardOverlay_Bool}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_IsTemplate_Bool}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_IsInstanced_Bool}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_IsInternal_Bool}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_WantsCompositorPauseInStandby_Bool}</td></tr><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_IsHidden_Bool}</td></tr></table>
     */
    @NativeType("bool")
    public static boolean VRApplications_GetApplicationPropertyBool(@NativeType("char const *") CharSequence pchAppKey, @NativeType("EVRApplicationProperty") int eProperty, @NativeType("EVRApplicationError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_GetApplicationPropertyBool(pchAppKeyEncoded, eProperty, memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_GetApplicationPropertyUint64 ] ---

    /** Unsafe version of: {@link #VRApplications_GetApplicationPropertyUint64 GetApplicationPropertyUint64} */
    public static long nVRApplications_GetApplicationPropertyUint64(long pchAppKey, int eProperty, long peError) {
        long __functionAddress = OpenVR.VRApplications.GetApplicationPropertyUint64;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJ(pchAppKey, eProperty, peError, __functionAddress);
    }

    /**
     * Returns a uint64 value for an application property. Returns 0 in all error cases.
     *
     * @param eProperty must be:<br><table><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_LastLaunchTime_Uint64}</td></tr></table>
     */
    @NativeType("uint64_t")
    public static long VRApplications_GetApplicationPropertyUint64(@NativeType("char const *") ByteBuffer pchAppKey, @NativeType("EVRApplicationProperty") int eProperty, @NativeType("EVRApplicationError *") IntBuffer peError) {
        if (CHECKS) {
            checkNT1(pchAppKey);
            check(peError, 1);
        }
        return nVRApplications_GetApplicationPropertyUint64(memAddress(pchAppKey), eProperty, memAddress(peError));
    }

    /**
     * Returns a uint64 value for an application property. Returns 0 in all error cases.
     *
     * @param eProperty must be:<br><table><tr><td>{@link VR#EVRApplicationProperty_VRApplicationProperty_LastLaunchTime_Uint64}</td></tr></table>
     */
    @NativeType("uint64_t")
    public static long VRApplications_GetApplicationPropertyUint64(@NativeType("char const *") CharSequence pchAppKey, @NativeType("EVRApplicationProperty") int eProperty, @NativeType("EVRApplicationError *") IntBuffer peError) {
        if (CHECKS) {
            check(peError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_GetApplicationPropertyUint64(pchAppKeyEncoded, eProperty, memAddress(peError));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_SetApplicationAutoLaunch ] ---

    /** Unsafe version of: {@link #VRApplications_SetApplicationAutoLaunch SetApplicationAutoLaunch} */
    public static int nVRApplications_SetApplicationAutoLaunch(long pchAppKey, boolean bAutoLaunch) {
        long __functionAddress = OpenVR.VRApplications.SetApplicationAutoLaunch;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchAppKey, bAutoLaunch, __functionAddress);
    }

    /**
     * Sets the application auto-launch flag. This is only valid for applications which return true for
     * {@link VR#EVRApplicationProperty_VRApplicationProperty_IsDashboardOverlay_Bool}.
     */
    @NativeType("EVRApplicationError")
    public static int VRApplications_SetApplicationAutoLaunch(@NativeType("char const *") ByteBuffer pchAppKey, @NativeType("bool") boolean bAutoLaunch) {
        if (CHECKS) {
            checkNT1(pchAppKey);
        }
        return nVRApplications_SetApplicationAutoLaunch(memAddress(pchAppKey), bAutoLaunch);
    }

    /**
     * Sets the application auto-launch flag. This is only valid for applications which return true for
     * {@link VR#EVRApplicationProperty_VRApplicationProperty_IsDashboardOverlay_Bool}.
     */
    @NativeType("EVRApplicationError")
    public static int VRApplications_SetApplicationAutoLaunch(@NativeType("char const *") CharSequence pchAppKey, @NativeType("bool") boolean bAutoLaunch) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_SetApplicationAutoLaunch(pchAppKeyEncoded, bAutoLaunch);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_GetApplicationAutoLaunch ] ---

    /** Unsafe version of: {@link #VRApplications_GetApplicationAutoLaunch GetApplicationAutoLaunch} */
    public static boolean nVRApplications_GetApplicationAutoLaunch(long pchAppKey) {
        long __functionAddress = OpenVR.VRApplications.GetApplicationAutoLaunch;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(pchAppKey, __functionAddress);
    }

    /**
     * Gets the application auto-launch flag. This is only valid for applications which return true for
     * {@link VR#EVRApplicationProperty_VRApplicationProperty_IsDashboardOverlay_Bool}.
     */
    @NativeType("bool")
    public static boolean VRApplications_GetApplicationAutoLaunch(@NativeType("char const *") ByteBuffer pchAppKey) {
        if (CHECKS) {
            checkNT1(pchAppKey);
        }
        return nVRApplications_GetApplicationAutoLaunch(memAddress(pchAppKey));
    }

    /**
     * Gets the application auto-launch flag. This is only valid for applications which return true for
     * {@link VR#EVRApplicationProperty_VRApplicationProperty_IsDashboardOverlay_Bool}.
     */
    @NativeType("bool")
    public static boolean VRApplications_GetApplicationAutoLaunch(@NativeType("char const *") CharSequence pchAppKey) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_GetApplicationAutoLaunch(pchAppKeyEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_SetDefaultApplicationForMimeType ] ---

    /** Unsafe version of: {@link #VRApplications_SetDefaultApplicationForMimeType SetDefaultApplicationForMimeType} */
    public static int nVRApplications_SetDefaultApplicationForMimeType(long pchAppKey, long pchMimeType) {
        long __functionAddress = OpenVR.VRApplications.SetDefaultApplicationForMimeType;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pchAppKey, pchMimeType, __functionAddress);
    }

    /** Adds this mime-type to the list of supported mime types for this application. */
    @NativeType("EVRApplicationError")
    public static int VRApplications_SetDefaultApplicationForMimeType(@NativeType("char const *") ByteBuffer pchAppKey, @NativeType("char const *") ByteBuffer pchMimeType) {
        if (CHECKS) {
            checkNT1(pchAppKey);
            checkNT1(pchMimeType);
        }
        return nVRApplications_SetDefaultApplicationForMimeType(memAddress(pchAppKey), memAddress(pchMimeType));
    }

    /** Adds this mime-type to the list of supported mime types for this application. */
    @NativeType("EVRApplicationError")
    public static int VRApplications_SetDefaultApplicationForMimeType(@NativeType("char const *") CharSequence pchAppKey, @NativeType("char const *") CharSequence pchMimeType) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            stack.nASCII(pchMimeType, true);
            long pchMimeTypeEncoded = stack.getPointerAddress();
            return nVRApplications_SetDefaultApplicationForMimeType(pchAppKeyEncoded, pchMimeTypeEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_GetDefaultApplicationForMimeType ] ---

    /** Unsafe version of: {@link #VRApplications_GetDefaultApplicationForMimeType GetDefaultApplicationForMimeType} */
    public static boolean nVRApplications_GetDefaultApplicationForMimeType(long pchMimeType, long pchAppKeyBuffer, int unAppKeyBufferLen) {
        long __functionAddress = OpenVR.VRApplications.GetDefaultApplicationForMimeType;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(pchMimeType, pchAppKeyBuffer, unAppKeyBufferLen, __functionAddress);
    }

    /** Return the app key that will open this mime type. */
    @NativeType("bool")
    public static boolean VRApplications_GetDefaultApplicationForMimeType(@NativeType("char const *") ByteBuffer pchMimeType, @Nullable @NativeType("char *") ByteBuffer pchAppKeyBuffer) {
        if (CHECKS) {
            checkNT1(pchMimeType);
        }
        return nVRApplications_GetDefaultApplicationForMimeType(memAddress(pchMimeType), memAddressSafe(pchAppKeyBuffer), remainingSafe(pchAppKeyBuffer));
    }

    /** Return the app key that will open this mime type. */
    @NativeType("bool")
    public static boolean VRApplications_GetDefaultApplicationForMimeType(@NativeType("char const *") CharSequence pchMimeType, @Nullable @NativeType("char *") ByteBuffer pchAppKeyBuffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchMimeType, true);
            long pchMimeTypeEncoded = stack.getPointerAddress();
            return nVRApplications_GetDefaultApplicationForMimeType(pchMimeTypeEncoded, memAddressSafe(pchAppKeyBuffer), remainingSafe(pchAppKeyBuffer));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_GetApplicationSupportedMimeTypes ] ---

    /** Unsafe version of: {@link #VRApplications_GetApplicationSupportedMimeTypes GetApplicationSupportedMimeTypes} */
    public static boolean nVRApplications_GetApplicationSupportedMimeTypes(long pchAppKey, long pchMimeTypesBuffer, int unMimeTypesBuffer) {
        long __functionAddress = OpenVR.VRApplications.GetApplicationSupportedMimeTypes;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(pchAppKey, pchMimeTypesBuffer, unMimeTypesBuffer, __functionAddress);
    }

    /** Get the list of supported mime types for this application, comma-delimited. */
    @NativeType("bool")
    public static boolean VRApplications_GetApplicationSupportedMimeTypes(@NativeType("char const *") ByteBuffer pchAppKey, @Nullable @NativeType("char *") ByteBuffer pchMimeTypesBuffer) {
        if (CHECKS) {
            checkNT1(pchAppKey);
        }
        return nVRApplications_GetApplicationSupportedMimeTypes(memAddress(pchAppKey), memAddressSafe(pchMimeTypesBuffer), remainingSafe(pchMimeTypesBuffer));
    }

    /** Get the list of supported mime types for this application, comma-delimited. */
    @NativeType("bool")
    public static boolean VRApplications_GetApplicationSupportedMimeTypes(@NativeType("char const *") CharSequence pchAppKey, @Nullable @NativeType("char *") ByteBuffer pchMimeTypesBuffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_GetApplicationSupportedMimeTypes(pchAppKeyEncoded, memAddressSafe(pchMimeTypesBuffer), remainingSafe(pchMimeTypesBuffer));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_GetApplicationsThatSupportMimeType ] ---

    /** Unsafe version of: {@link #VRApplications_GetApplicationsThatSupportMimeType GetApplicationsThatSupportMimeType} */
    public static int nVRApplications_GetApplicationsThatSupportMimeType(long pchMimeType, long pchAppKeysThatSupportBuffer, int unAppKeysThatSupportBuffer) {
        long __functionAddress = OpenVR.VRApplications.GetApplicationsThatSupportMimeType;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pchMimeType, pchAppKeysThatSupportBuffer, unAppKeysThatSupportBuffer, __functionAddress);
    }

    /** Get the list of app-keys that support this mime type, comma-delimited, the return value is number of bytes you need to return the full string. */
    @NativeType("uint32_t")
    public static int VRApplications_GetApplicationsThatSupportMimeType(@NativeType("char const *") ByteBuffer pchMimeType, @Nullable @NativeType("char *") ByteBuffer pchAppKeysThatSupportBuffer) {
        if (CHECKS) {
            checkNT1(pchMimeType);
        }
        return nVRApplications_GetApplicationsThatSupportMimeType(memAddress(pchMimeType), memAddressSafe(pchAppKeysThatSupportBuffer), remainingSafe(pchAppKeysThatSupportBuffer));
    }

    /** Get the list of app-keys that support this mime type, comma-delimited, the return value is number of bytes you need to return the full string. */
    @NativeType("uint32_t")
    public static int VRApplications_GetApplicationsThatSupportMimeType(@NativeType("char const *") CharSequence pchMimeType, @Nullable @NativeType("char *") ByteBuffer pchAppKeysThatSupportBuffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchMimeType, true);
            long pchMimeTypeEncoded = stack.getPointerAddress();
            return nVRApplications_GetApplicationsThatSupportMimeType(pchMimeTypeEncoded, memAddressSafe(pchAppKeysThatSupportBuffer), remainingSafe(pchAppKeysThatSupportBuffer));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Get the list of app-keys that support this mime type, comma-delimited, the return value is number of bytes you need to return the full string. */
    @NativeType("uint32_t")
    public static String VRApplications_GetApplicationsThatSupportMimeType(@NativeType("char const *") CharSequence pchMimeType, @NativeType("uint32_t") int unAppKeysThatSupportBuffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchMimeType, true);
            long pchMimeTypeEncoded = stack.getPointerAddress();
            ByteBuffer pchAppKeysThatSupportBuffer = stack.malloc(unAppKeysThatSupportBuffer);
            int __result = nVRApplications_GetApplicationsThatSupportMimeType(pchMimeTypeEncoded, memAddress(pchAppKeysThatSupportBuffer), unAppKeysThatSupportBuffer);
            return memASCII(pchAppKeysThatSupportBuffer, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_GetApplicationLaunchArguments ] ---

    /** Unsafe version of: {@link #VRApplications_GetApplicationLaunchArguments GetApplicationLaunchArguments} */
    public static int nVRApplications_GetApplicationLaunchArguments(int unHandle, long pchArgs, int unArgs) {
        long __functionAddress = OpenVR.VRApplications.GetApplicationLaunchArguments;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(unHandle, pchArgs, unArgs, __functionAddress);
    }

    /** Get the args list from an app launch that had the process already running, you call this when you get a {@link VR#EVREventType_VREvent_ApplicationMimeTypeLoad}. */
    @NativeType("uint32_t")
    public static int VRApplications_GetApplicationLaunchArguments(@NativeType("uint32_t") int unHandle, @Nullable @NativeType("char *") ByteBuffer pchArgs) {
        return nVRApplications_GetApplicationLaunchArguments(unHandle, memAddressSafe(pchArgs), remainingSafe(pchArgs));
    }

    /** Get the args list from an app launch that had the process already running, you call this when you get a {@link VR#EVREventType_VREvent_ApplicationMimeTypeLoad}. */
    @NativeType("uint32_t")
    public static String VRApplications_GetApplicationLaunchArguments(@NativeType("uint32_t") int unHandle, @NativeType("uint32_t") int unArgs) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchArgs = stack.malloc(unArgs);
            int __result = nVRApplications_GetApplicationLaunchArguments(unHandle, memAddress(pchArgs), unArgs);
            return memASCII(pchArgs, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_GetStartingApplication ] ---

    /** Unsafe version of: {@link #VRApplications_GetStartingApplication GetStartingApplication} */
    public static int nVRApplications_GetStartingApplication(long pchAppKeyBuffer, int unAppKeyBufferLen) {
        long __functionAddress = OpenVR.VRApplications.GetStartingApplication;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchAppKeyBuffer, unAppKeyBufferLen, __functionAddress);
    }

    /** Returns the app key for the application that is starting up. */
    @NativeType("EVRApplicationError")
    public static int VRApplications_GetStartingApplication(@NativeType("char *") ByteBuffer pchAppKeyBuffer) {
        return nVRApplications_GetStartingApplication(memAddress(pchAppKeyBuffer), pchAppKeyBuffer.remaining());
    }

    // --- [ VRApplications_GetSceneApplicationState ] ---

    /** Returns the application transition state. */
    @NativeType("EVRSceneApplicationState")
    public static int VRApplications_GetSceneApplicationState() {
        long __functionAddress = OpenVR.VRApplications.GetSceneApplicationState;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VRApplications_PerformApplicationPrelaunchCheck ] ---

    /** Unsafe version of: {@link #VRApplications_PerformApplicationPrelaunchCheck PerformApplicationPrelaunchCheck} */
    public static int nVRApplications_PerformApplicationPrelaunchCheck(long pchAppKey) {
        long __functionAddress = OpenVR.VRApplications.PerformApplicationPrelaunchCheck;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchAppKey, __functionAddress);
    }

    /**
     * Returns errors that would prevent the specified application from launching immediately. Calling this function will cause the current scene application
     * to quit, so only call it when you are actually about to launch something else.
     * 
     * <p>What the caller should do about these failures depends on the failure:</p>
     * 
     * <ul>
     * <li>{@link VR#EVRApplicationError_VRApplicationError_OldApplicationQuitting} - An existing application has been told to quit. Wait for a
     * {@link VR#EVREventType_VREvent_ProcessQuit} and try again.</li>
     * <li>{@link VR#EVRApplicationError_VRApplicationError_ApplicationAlreadyStarting} - This application is already starting. This is a permanent failure.</li>
     * <li>{@link VR#EVRApplicationError_VRApplicationError_LaunchInProgress} - A different application is already starting. This is a permanent failure.</li>
     * <li>{@link VR#EVRApplicationError_VRApplicationError_None} - Go ahead and launch. Everything is clear.</li>
     * </ul>
     */
    @NativeType("EVRApplicationError")
    public static int VRApplications_PerformApplicationPrelaunchCheck(@NativeType("char const *") ByteBuffer pchAppKey) {
        if (CHECKS) {
            checkNT1(pchAppKey);
        }
        return nVRApplications_PerformApplicationPrelaunchCheck(memAddress(pchAppKey));
    }

    /**
     * Returns errors that would prevent the specified application from launching immediately. Calling this function will cause the current scene application
     * to quit, so only call it when you are actually about to launch something else.
     * 
     * <p>What the caller should do about these failures depends on the failure:</p>
     * 
     * <ul>
     * <li>{@link VR#EVRApplicationError_VRApplicationError_OldApplicationQuitting} - An existing application has been told to quit. Wait for a
     * {@link VR#EVREventType_VREvent_ProcessQuit} and try again.</li>
     * <li>{@link VR#EVRApplicationError_VRApplicationError_ApplicationAlreadyStarting} - This application is already starting. This is a permanent failure.</li>
     * <li>{@link VR#EVRApplicationError_VRApplicationError_LaunchInProgress} - A different application is already starting. This is a permanent failure.</li>
     * <li>{@link VR#EVRApplicationError_VRApplicationError_None} - Go ahead and launch. Everything is clear.</li>
     * </ul>
     */
    @NativeType("EVRApplicationError")
    public static int VRApplications_PerformApplicationPrelaunchCheck(@NativeType("char const *") CharSequence pchAppKey) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRApplications_PerformApplicationPrelaunchCheck(pchAppKeyEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_GetSceneApplicationStateNameFromEnum ] ---

    /** Unsafe version of: {@link #VRApplications_GetSceneApplicationStateNameFromEnum GetSceneApplicationStateNameFromEnum} */
    public static long nVRApplications_GetSceneApplicationStateNameFromEnum(int state) {
        long __functionAddress = OpenVR.VRApplications.GetSceneApplicationStateNameFromEnum;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(state, __functionAddress);
    }

    /**
     * Returns a string for an application transition state.
     *
     * @param state one of:<br><table><tr><td>{@link VR#EVRSceneApplicationState_None}</td><td>{@link VR#EVRSceneApplicationState_Starting}</td></tr><tr><td>{@link VR#EVRSceneApplicationState_Quitting}</td><td>{@link VR#EVRSceneApplicationState_Running}</td></tr><tr><td>{@link VR#EVRSceneApplicationState_Waiting}</td></tr></table>
     */
    @Nullable
    @NativeType("char const *")
    public static String VRApplications_GetSceneApplicationStateNameFromEnum(@NativeType("EVRSceneApplicationState") int state) {
        long __result = nVRApplications_GetSceneApplicationStateNameFromEnum(state);
        return memASCIISafe(__result);
    }

    // --- [ VRApplications_LaunchInternalProcess ] ---

    /** Unsafe version of: {@link #VRApplications_LaunchInternalProcess LaunchInternalProcess} */
    public static int nVRApplications_LaunchInternalProcess(long pchBinaryPath, long pchArguments, long pchWorkingDirectory) {
        long __functionAddress = OpenVR.VRApplications.LaunchInternalProcess;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(pchBinaryPath, pchArguments, pchWorkingDirectory, __functionAddress);
    }

    /**
     * Starts a subprocess within the calling application. This suppresses all application transition UI and automatically identifies the new executable as
     * part of the same application. On success the calling process should exit immediately. If working directory is {@code NULL} or "" the directory portion of the
     * binary path will be the working directory.
     */
    @NativeType("EVRApplicationError")
    public static int VRApplications_LaunchInternalProcess(@NativeType("char const *") ByteBuffer pchBinaryPath, @NativeType("char const *") ByteBuffer pchArguments, @NativeType("char const *") ByteBuffer pchWorkingDirectory) {
        if (CHECKS) {
            checkNT1(pchBinaryPath);
            checkNT1(pchArguments);
            checkNT1(pchWorkingDirectory);
        }
        return nVRApplications_LaunchInternalProcess(memAddress(pchBinaryPath), memAddress(pchArguments), memAddress(pchWorkingDirectory));
    }

    /**
     * Starts a subprocess within the calling application. This suppresses all application transition UI and automatically identifies the new executable as
     * part of the same application. On success the calling process should exit immediately. If working directory is {@code NULL} or "" the directory portion of the
     * binary path will be the working directory.
     */
    @NativeType("EVRApplicationError")
    public static int VRApplications_LaunchInternalProcess(@NativeType("char const *") CharSequence pchBinaryPath, @NativeType("char const *") CharSequence pchArguments, @NativeType("char const *") CharSequence pchWorkingDirectory) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchBinaryPath, true);
            long pchBinaryPathEncoded = stack.getPointerAddress();
            stack.nASCII(pchArguments, true);
            long pchArgumentsEncoded = stack.getPointerAddress();
            stack.nASCII(pchWorkingDirectory, true);
            long pchWorkingDirectoryEncoded = stack.getPointerAddress();
            return nVRApplications_LaunchInternalProcess(pchBinaryPathEncoded, pchArgumentsEncoded, pchWorkingDirectoryEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRApplications_GetCurrentSceneProcessId ] ---

    /**
     * Returns the current scene process ID according to the application system. A scene process will get scene focus once it starts rendering, but it will
     * appear here once it calls {@code VR_Init} with the Scene application type.
     */
    @NativeType("uint32_t")
    public static int VRApplications_GetCurrentSceneProcessId() {
        long __functionAddress = OpenVR.VRApplications.GetCurrentSceneProcessId;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

}