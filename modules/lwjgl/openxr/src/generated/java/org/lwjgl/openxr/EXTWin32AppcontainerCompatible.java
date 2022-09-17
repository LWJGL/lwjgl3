/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_EXT_win32_appcontainer_compatible">XR_EXT_win32_appcontainer_compatible</a> extension.
 * 
 * <p>To minimize opportunities for malicious manipulation, a common practice on the Windows OS is to isolate the application process in an {url-appcontainer-isolation}[AppContainer execution environment]. In order for a runtime to work properly in such an application process, the runtime <b>must</b> properly {url-appcontainer-impl}[set ACL to device resources and cross process resources].</p>
 * 
 * <p>An application running in an AppContainer process <b>can</b> request for a runtime to enable such AppContainer compatibility by adding {@link #XR_EXT_WIN32_APPCONTAINER_COMPATIBLE_EXTENSION_NAME EXT_WIN32_APPCONTAINER_COMPATIBLE_EXTENSION_NAME} to {@code enabledExtensionNames} of {@link XrInstanceCreateInfo} when calling {@link XR10#xrCreateInstance CreateInstance}. If the runtime is not capable of running properly within the AppContainer execution environment, it <b>must</b> return {@link XR10#XR_ERROR_EXTENSION_NOT_PRESENT ERROR_EXTENSION_NOT_PRESENT}.</p>
 * 
 * <p>If the runtime supports this extension, it <b>can</b> further inspect the capability based on the connected device. If the XR system cannot support an AppContainer execution environment, the runtime <b>must</b> return {@link XR10#XR_ERROR_FORM_FACTOR_UNAVAILABLE ERROR_FORM_FACTOR_UNAVAILABLE} when the application calls {@link XR10#xrGetSystem GetSystem}.</p>
 * 
 * <p>If the call to {@link XR10#xrGetSystem GetSystem} successfully returned with a valid {@code XrSystemId}, the application <b>can</b> rely on the runtime working properly in the AppContainer execution environment.</p>
 */
public final class EXTWin32AppcontainerCompatible {

    /** The extension specification version. */
    public static final int XR_EXT_win32_appcontainer_compatible_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_EXT_WIN32_APPCONTAINER_COMPATIBLE_EXTENSION_NAME = "XR_EXT_win32_appcontainer_compatible";

    private EXTWin32AppcontainerCompatible() {}

}