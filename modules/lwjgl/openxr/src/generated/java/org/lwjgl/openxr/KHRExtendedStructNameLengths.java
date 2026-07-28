/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class KHRExtendedStructNameLengths {

    public static final int XR_KHR_extended_struct_name_lengths_SPEC_VERSION = 2;

    public static final String XR_KHR_EXTENDED_STRUCT_NAME_LENGTHS_EXTENSION_NAME = "XR_KHR_extended_struct_name_lengths";

    public static final int XR_MAX_STRUCTURE_NAME_SIZE_EXTENDED_KHR = 256;

    protected KHRExtendedStructNameLengths() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrStructureTypeToString2KHR ] ---

    /** {@code XrResult xrStructureTypeToString2KHR(XrInstance instance, XrStructureType value, char * buffer)} */
    public static int nxrStructureTypeToString2KHR(XrInstance instance, int value, long buffer) {
        long __functionAddress = instance.getCapabilities().xrStructureTypeToString2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(instance.address(), value, buffer, __functionAddress);
    }

    /** {@code XrResult xrStructureTypeToString2KHR(XrInstance instance, XrStructureType value, char * buffer)} */
    @NativeType("XrResult")
    public static int xrStructureTypeToString2KHR(XrInstance instance, @NativeType("XrStructureType") int value, @NativeType("char *") ByteBuffer buffer) {
        if (CHECKS) {
            check(buffer, XR_MAX_STRUCTURE_NAME_SIZE_EXTENDED_KHR);
        }
        return nxrStructureTypeToString2KHR(instance, value, memAddress(buffer));
    }

}