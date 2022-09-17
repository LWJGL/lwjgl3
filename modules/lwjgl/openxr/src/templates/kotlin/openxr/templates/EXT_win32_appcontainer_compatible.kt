/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_win32_appcontainer_compatible = "EXTWin32AppcontainerCompatible".nativeClassXR("EXT_win32_appcontainer_compatible", type = "instance", postfix = "EXT") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_EXT_win32_appcontainer_compatible">XR_EXT_win32_appcontainer_compatible</a> extension.

        To minimize opportunities for malicious manipulation, a common practice on the Windows OS is to isolate the application process in an {url-appcontainer-isolation}[AppContainer execution environment]. In order for a runtime to work properly in such an application process, the runtime <b>must</b> properly {url-appcontainer-impl}[set ACL to device resources and cross process resources].

        An application running in an AppContainer process <b>can</b> request for a runtime to enable such AppContainer compatibility by adding #EXT_WIN32_APPCONTAINER_COMPATIBLE_EXTENSION_NAME to {@code enabledExtensionNames} of ##XrInstanceCreateInfo when calling #CreateInstance(). If the runtime is not capable of running properly within the AppContainer execution environment, it <b>must</b> return #ERROR_EXTENSION_NOT_PRESENT.

        If the runtime supports this extension, it <b>can</b> further inspect the capability based on the connected device. If the XR system cannot support an AppContainer execution environment, the runtime <b>must</b> return #ERROR_FORM_FACTOR_UNAVAILABLE when the application calls #GetSystem().

        If the call to #GetSystem() successfully returned with a valid {@code XrSystemId}, the application <b>can</b> rely on the runtime working properly in the AppContainer execution environment.
        """

    IntConstant(
        "The extension specification version.",

        "EXT_win32_appcontainer_compatible_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_WIN32_APPCONTAINER_COMPATIBLE_EXTENSION_NAME".."XR_EXT_win32_appcontainer_compatible"
    )
}