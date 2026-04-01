/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class METATilePropertiesHint {

    public static final int XR_META_tile_properties_hint_SPEC_VERSION = 1;

    public static final String XR_META_TILE_PROPERTIES_HINT_EXTENSION_NAME = "XR_META_tile_properties_hint";

    public static final int
        XR_TYPE_TILE_PROPERTIES_META      = 1000609000,
        XR_TYPE_TILE_PROPERTIES_HINT_META = 1000609001;

    protected METATilePropertiesHint() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSetTilePropertiesHintMETA ] ---

    /** {@code XrResult xrSetTilePropertiesHintMETA(XrSession session, XrTilePropertiesHintMETA const * properties)} */
    public static int nxrSetTilePropertiesHintMETA(XrSession session, long properties) {
        long __functionAddress = session.getCapabilities().xrSetTilePropertiesHintMETA;
        if (CHECKS) {
            check(__functionAddress);
            XrTilePropertiesHintMETA.validate(properties);
        }
        return callPPI(session.address(), properties, __functionAddress);
    }

    /** {@code XrResult xrSetTilePropertiesHintMETA(XrSession session, XrTilePropertiesHintMETA const * properties)} */
    @NativeType("XrResult")
    public static int xrSetTilePropertiesHintMETA(XrSession session, @NativeType("XrTilePropertiesHintMETA const *") XrTilePropertiesHintMETA properties) {
        return nxrSetTilePropertiesHintMETA(session, properties.address());
    }

}