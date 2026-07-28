/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTStationaryReferenceSpace {

    public static final int XR_EXT_stationary_reference_space_SPEC_VERSION = 1;

    public static final String XR_EXT_STATIONARY_REFERENCE_SPACE_EXTENSION_NAME = "XR_EXT_stationary_reference_space";

    public static final int XR_REFERENCE_SPACE_TYPE_STATIONARY_EXT = 1000742000;

    public static final int
        XR_TYPE_STATIONARY_REFERENCE_SPACE_GENERATION_ID_GET_INFO_EXT = 1000742001,
        XR_TYPE_STATIONARY_REFERENCE_SPACE_GENERATION_ID_RESULT_EXT   = 1000742002;

    protected EXTStationaryReferenceSpace() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetStationaryReferenceSpaceGenerationIdEXT ] ---

    /** {@code XrResult xrGetStationaryReferenceSpaceGenerationIdEXT(XrSession session, XrStationaryReferenceSpaceGenerationIdGetInfoEXT const * getInfo, XrStationaryReferenceSpaceGenerationIdResultEXT * generationIdResult)} */
    public static int nxrGetStationaryReferenceSpaceGenerationIdEXT(XrSession session, long getInfo, long generationIdResult) {
        long __functionAddress = session.getCapabilities().xrGetStationaryReferenceSpaceGenerationIdEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), getInfo, generationIdResult, __functionAddress);
    }

    /** {@code XrResult xrGetStationaryReferenceSpaceGenerationIdEXT(XrSession session, XrStationaryReferenceSpaceGenerationIdGetInfoEXT const * getInfo, XrStationaryReferenceSpaceGenerationIdResultEXT * generationIdResult)} */
    @NativeType("XrResult")
    public static int xrGetStationaryReferenceSpaceGenerationIdEXT(XrSession session, @NativeType("XrStationaryReferenceSpaceGenerationIdGetInfoEXT const *") @Nullable XrStationaryReferenceSpaceGenerationIdGetInfoEXT getInfo, @NativeType("XrStationaryReferenceSpaceGenerationIdResultEXT *") XrStationaryReferenceSpaceGenerationIdResultEXT generationIdResult) {
        return nxrGetStationaryReferenceSpaceGenerationIdEXT(session, memAddressSafe(getInfo), generationIdResult.address());
    }

}