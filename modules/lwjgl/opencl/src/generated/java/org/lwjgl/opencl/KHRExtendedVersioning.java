/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <strong>khr_extended_versioning</strong> extension.
 * 
 * <p>This extension introduces new platform and device queries that return detailed version information to applications.</p>
 * 
 * <p>It makes it possible to return the exact revision of the specification or intermediate languages supported by an implementation. It also enables
 * implementations to communicate a version number for each of the extensions they support and remove the requirement for applications to process strings
 * to test for the presence of an extension or intermediate language or built-in kernel.</p>
 * 
 * <p>This extension introduces a new scheme to encode detailed (major, minor, patch/revision) version information into a single 32-bit unsigned integer:</p>
 * 
 * <ul>
 * <li>The major version is using bits 31-22</li>
 * <li>The minor version is using bits 21-12</li>
 * <li>The patch version is using bits 11-0</li>
 * </ul>
 * 
 * <p>This scheme enables two versions to be ordered using the standard C/C++ operators. Macros are provided to extract individual fields or compose a full
 * version from the individual fields.</p>
 */
public class KHRExtendedVersioning {

    public static final int
        CL_VERSION_MAJOR_BITS_KHR  = 10,
        CL_VERSION_MINOR_BITS_KHR  = 10,
        CL_VERSION_PATCH_BITS_KHR  = 12;

    public static final int
        CL_VERSION_MAJOR_MASK_KHR = ((1 << CL_VERSION_MAJOR_BITS_KHR) - 1),
        CL_VERSION_MINOR_MASK_KHR = ((1 << CL_VERSION_MINOR_BITS_KHR) - 1),
        CL_VERSION_PATCH_MASK_KHR = ((1 << CL_VERSION_PATCH_BITS_KHR) - 1);

    /**
     * Returns detailed (major, minor, patch) numeric version information. ({@code cl_version_khr})
     * 
     * <p>The major and minor version numbers returned must match those returned via {@link CL10#CL_PLATFORM_VERSION PLATFORM_VERSION}.</p>
     */
    public static final int CL_PLATFORM_NUMERIC_VERSION_KHR = 0x906;

    /**
     * Returns an array of description (name and version) structures. ({@code cl_name_version_khr[])}
     * 
     * <p>The same extension name must not be reported more than once. The list of extensions reported must match the list reported via {@link CL10#CL_PLATFORM_EXTENSIONS PLATFORM_EXTENSIONS}.</p>
     */
    public static final int CL_PLATFORM_EXTENSIONS_WITH_VERSION_KHR = 0x907;

    /**
     * Returns detailed (major, minor, patch) numeric version information. ({@code cl_version_khr})
     * 
     * <p>The major and minor version numbers returned must match those returned via {@link CL10#CL_DEVICE_VERSION DEVICE_VERSION}.</p>
     */
    public static final int CL_DEVICE_NUMERIC_VERSION_KHR = 0x105E;

    /**
     * Returns detailed (major, minor, patch) numeric version information. ({@code cl_version_khr})
     * 
     * <p>The major and minor version numbers returned must match those returned via {@link CL11#CL_DEVICE_OPENCL_C_VERSION DEVICE_OPENCL_C_VERSION}.</p>
     */
    public static final int CL_DEVICE_OPENCL_C_NUMERIC_VERSION_KHR = 0x105F;

    /**
     * Returns an array of description (name and version) structures. ({@code cl_name_version_khr[]})
     * 
     * <p>The same extension name must not be reported more than once. The list of extensions reported must match the list reported via {@link CL10#CL_DEVICE_EXTENSIONS DEVICE_EXTENSIONS}.</p>
     */
    public static final int CL_DEVICE_EXTENSIONS_WITH_VERSION_KHR = 0x1060;

    /**
     * Returns an array of descriptions (name and version) for all supported Intermediate Languages. ({@code cl_name_version_khr[]})
     * 
     * <p>Intermediate Languages with the same name may be reported more than once but each name and major/minor version combination may only be reported once.
     * The list of intermediate languages reported must match the list reported via {@link CL21#CL_DEVICE_IL_VERSION DEVICE_IL_VERSION}.</p>
     */
    public static final int CL_DEVICE_ILS_WITH_VERSION_KHR = 0x1061;

    /**
     * Returns an array of descriptions for the built-in kernels supported by the device. ({@code cl_name_version_khr[]})
     * 
     * <p>Each built-in kernel may only be reported once. The list of reported kernels must match the list returned via {@link CL12#CL_DEVICE_BUILT_IN_KERNELS DEVICE_BUILT_IN_KERNELS}.</p>
     */
    public static final int CL_DEVICE_BUILT_IN_KERNELS_WITH_VERSION_KHR = 0x1062;

    protected KHRExtendedVersioning() {
        throw new UnsupportedOperationException();
    }

    // --- [ CL_VERSION_MAJOR_KHR ] ---

    @NativeType("uint32_t")
    public static int CL_VERSION_MAJOR_KHR(@NativeType("uint32_t") int version) {
        return version >> (CL_VERSION_MINOR_BITS_KHR + CL_VERSION_PATCH_BITS_KHR);
    }

    // --- [ CL_VERSION_MINOR_KHR ] ---

    @NativeType("uint32_t")
    public static int CL_VERSION_MINOR_KHR(@NativeType("uint32_t") int version) {
        return (version >> CL_VERSION_PATCH_BITS_KHR) & CL_VERSION_MINOR_MASK_KHR;
    }

    // --- [ CL_VERSION_PATCH_KHR ] ---

    @NativeType("uint32_t")
    public static int CL_VERSION_PATCH_KHR(@NativeType("uint32_t") int version) {
        return version & CL_VERSION_PATCH_MASK_KHR;
    }

    // --- [ CL_MAKE_VERSION_KHR ] ---

    /**
     * @param major the major version number
     * @param minor the minor version number
     * @param patch the patch version number
     */
    @NativeType("uint32_t")
    public static int CL_MAKE_VERSION_KHR(@NativeType("uint32_t") int major, @NativeType("uint32_t") int minor, @NativeType("uint32_t") int patch) {
        return ((major & CL_VERSION_MAJOR_MASK_KHR) << (CL_VERSION_MINOR_BITS_KHR + CL_VERSION_PATCH_BITS_KHR)) | ((minor & CL_VERSION_MINOR_MASK_KHR) << CL_VERSION_PATCH_BITS_KHR) | (patch & CL_VERSION_PATCH_MASK_KHR);
    }

}