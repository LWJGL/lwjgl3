/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_extended_versioning = "KHRExtendedVersioning".nativeClassCL("khr_extended_versioning", KHR) {
    documentation =
        """
        Native bindings to the $extensionName extension.

        This extension introduces new platform and device queries that return detailed version information to applications.
        
        It makes it possible to return the exact revision of the specification or intermediate languages supported by an implementation. It also enables
        implementations to communicate a version number for each of the extensions they support and remove the requirement for applications to process strings
        to test for the presence of an extension or intermediate language or built-in kernel.
        
        This extension introduces a new scheme to encode detailed (major, minor, patch/revision) version information into a single 32-bit unsigned integer:
        ${ul(
            "The major version is using bits 31-22",
            "The minor version is using bits 21-12",
            "The patch version is using bits 11-0"
        )}
        
        This scheme enables two versions to be ordered using the standard C/C++ operators. Macros are provided to extract individual fields or compose a full
        version from the individual fields.
        """

    IntConstant(
        "",

        "VERSION_MAJOR_BITS_KHR".."10",
        "VERSION_MINOR_BITS_KHR ".."10",
        "VERSION_PATCH_BITS_KHR ".."12",
    )

    IntConstant(
        "",

        "VERSION_MAJOR_MASK_KHR".."((1 << CL_VERSION_MAJOR_BITS_KHR) - 1)",
        "VERSION_MINOR_MASK_KHR".."((1 << CL_VERSION_MINOR_BITS_KHR) - 1)",
        "VERSION_PATCH_MASK_KHR".."((1 << CL_VERSION_PATCH_BITS_KHR) - 1)"
    )

    macro(
        expression = "version >> (CL_VERSION_MINOR_BITS_KHR + CL_VERSION_PATCH_BITS_KHR)"
    )..uint32_t("CL_VERSION_MAJOR_KHR", "", uint32_t("version", ""), noPrefix = true)

    macro(
        expression = "(version >> CL_VERSION_PATCH_BITS_KHR) & CL_VERSION_MINOR_MASK_KHR"
    )..uint32_t("CL_VERSION_MINOR_KHR", "", uint32_t("version", ""), noPrefix = true)

    macro(
        expression = "version & CL_VERSION_PATCH_MASK_KHR"
    )..uint32_t("CL_VERSION_PATCH_KHR", "", uint32_t("version", ""), noPrefix = true)

    macro(
        expression = "((major & CL_VERSION_MAJOR_MASK_KHR) << (CL_VERSION_MINOR_BITS_KHR + CL_VERSION_PATCH_BITS_KHR)) | ((minor & CL_VERSION_MINOR_MASK_KHR) << CL_VERSION_PATCH_BITS_KHR) | (patch & CL_VERSION_PATCH_MASK_KHR)"
    )..uint32_t(
        "CL_MAKE_VERSION_KHR",
        "",

        uint32_t("major", "the major version number"),
        uint32_t("minor", "the minor version number"),
        uint32_t("patch", "the patch version number"),

        noPrefix = true
    )

    IntConstant(
        """
        Returns detailed (major, minor, patch) numeric version information. ({@code cl_version_khr})
        
        The major and minor version numbers returned must match those returned via #PLATFORM_VERSION.
        """,

        "PLATFORM_NUMERIC_VERSION_KHR"..0x0906
    )

    IntConstant(
        """
        Returns an array of description (name and version) structures. ({@code cl_name_version_khr[])}
        
        The same extension name must not be reported more than once. The list of extensions reported must match the list reported via #PLATFORM_EXTENSIONS.
        """,

        "PLATFORM_EXTENSIONS_WITH_VERSION_KHR"..0x0907
    )

    IntConstant(
        """
        Returns detailed (major, minor, patch) numeric version information. ({@code cl_version_khr})
        
        The major and minor version numbers returned must match those returned via #DEVICE_VERSION.
        """,

        "DEVICE_NUMERIC_VERSION_KHR"..0x105E
    )

    IntConstant(
        """
        Returns detailed (major, minor, patch) numeric version information. ({@code cl_version_khr})
        
        The major and minor version numbers returned must match those returned via #DEVICE_OPENCL_C_VERSION.
        """,

        "DEVICE_OPENCL_C_NUMERIC_VERSION_KHR"..0x105F
    )

    IntConstant(
        """
        Returns an array of description (name and version) structures. ({@code cl_name_version_khr[]})
        
        The same extension name must not be reported more than once. The list of extensions reported must match the list reported via #DEVICE_EXTENSIONS.
        """,

        "DEVICE_EXTENSIONS_WITH_VERSION_KHR"..0x1060
    )

    IntConstant(
        """
        Returns an array of descriptions (name and version) for all supported Intermediate Languages. ({@code cl_name_version_khr[]})
        
        Intermediate Languages with the same name may be reported more than once but each name and major/minor version combination may only be reported once.
        The list of intermediate languages reported must match the list reported via #DEVICE_IL_VERSION.
        """,

        "DEVICE_ILS_WITH_VERSION_KHR"..0x1061
    )

    IntConstant(
        """
        Returns an array of descriptions for the built-in kernels supported by the device. ({@code cl_name_version_khr[]})
        
        Each built-in kernel may only be reported once. The list of reported kernels must match the list returned via #DEVICE_BUILT_IN_KERNELS.
        """,

        "DEVICE_BUILT_IN_KERNELS_WITH_VERSION_KHR"..0x1062
    )
}