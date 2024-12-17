/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class MLLocalizationMap {

    public static final int XR_ML_localization_map_SPEC_VERSION = 1;

    public static final String XR_ML_LOCALIZATION_MAP_EXTENSION_NAME = "XR_ML_localization_map";

    public static final int XR_OBJECT_TYPE_EXPORTED_LOCALIZATION_MAP_ML = 1000139000;

    public static final int
        XR_TYPE_LOCALIZATION_MAP_ML                = 1000139000,
        XR_TYPE_EVENT_DATA_LOCALIZATION_CHANGED_ML = 1000139001,
        XR_TYPE_MAP_LOCALIZATION_REQUEST_INFO_ML   = 1000139002,
        XR_TYPE_LOCALIZATION_MAP_IMPORT_INFO_ML    = 1000139003,
        XR_TYPE_LOCALIZATION_ENABLE_EVENTS_INFO_ML = 1000139004;

    public static final int
        XR_ERROR_LOCALIZATION_MAP_INCOMPATIBLE_ML                    = -1000139000,
        XR_ERROR_LOCALIZATION_MAP_UNAVAILABLE_ML                     = -1000139001,
        XR_ERROR_LOCALIZATION_MAP_FAIL_ML                            = -1000139002,
        XR_ERROR_LOCALIZATION_MAP_IMPORT_EXPORT_PERMISSION_DENIED_ML = -1000139003,
        XR_ERROR_LOCALIZATION_MAP_PERMISSION_DENIED_ML               = -1000139004,
        XR_ERROR_LOCALIZATION_MAP_ALREADY_EXISTS_ML                  = -1000139005,
        XR_ERROR_LOCALIZATION_MAP_CANNOT_EXPORT_CLOUD_MAP_ML         = -1000139006;

    public static final int XR_REFERENCE_SPACE_TYPE_LOCALIZATION_MAP_ML = 1000139000;

    public static final int XR_MAX_LOCALIZATION_MAP_NAME_LENGTH_ML = 64;

    public static final int
        XR_LOCALIZATION_MAP_STATE_NOT_LOCALIZED_ML                      = 0,
        XR_LOCALIZATION_MAP_STATE_LOCALIZED_ML                          = 1,
        XR_LOCALIZATION_MAP_STATE_LOCALIZATION_PENDING_ML               = 2,
        XR_LOCALIZATION_MAP_STATE_LOCALIZATION_SLEEPING_BEFORE_RETRY_ML = 3;

    public static final int
        XR_LOCALIZATION_MAP_TYPE_ON_DEVICE_ML = 0,
        XR_LOCALIZATION_MAP_TYPE_CLOUD_ML     = 1;

    public static final int
        XR_LOCALIZATION_MAP_CONFIDENCE_POOR_ML      = 0,
        XR_LOCALIZATION_MAP_CONFIDENCE_FAIR_ML      = 1,
        XR_LOCALIZATION_MAP_CONFIDENCE_GOOD_ML      = 2,
        XR_LOCALIZATION_MAP_CONFIDENCE_EXCELLENT_ML = 3;

    public static final int
        XR_LOCALIZATION_MAP_ERROR_UNKNOWN_BIT_ML            = 0x1,
        XR_LOCALIZATION_MAP_ERROR_OUT_OF_MAPPED_AREA_BIT_ML = 0x2,
        XR_LOCALIZATION_MAP_ERROR_LOW_FEATURE_COUNT_BIT_ML  = 0x4,
        XR_LOCALIZATION_MAP_ERROR_EXCESSIVE_MOTION_BIT_ML   = 0x8,
        XR_LOCALIZATION_MAP_ERROR_LOW_LIGHT_BIT_ML          = 0x10,
        XR_LOCALIZATION_MAP_ERROR_HEADPOSE_BIT_ML           = 0x20;

    protected MLLocalizationMap() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnableLocalizationEventsML ] ---

    /** {@code XrResult xrEnableLocalizationEventsML(XrSession session, XrLocalizationEnableEventsInfoML const * info)} */
    public static int nxrEnableLocalizationEventsML(XrSession session, long info) {
        long __functionAddress = session.getCapabilities().xrEnableLocalizationEventsML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), info, __functionAddress);
    }

    /** {@code XrResult xrEnableLocalizationEventsML(XrSession session, XrLocalizationEnableEventsInfoML const * info)} */
    @NativeType("XrResult")
    public static int xrEnableLocalizationEventsML(XrSession session, @NativeType("XrLocalizationEnableEventsInfoML const *") XrLocalizationEnableEventsInfoML info) {
        return nxrEnableLocalizationEventsML(session, info.address());
    }

    // --- [ xrQueryLocalizationMapsML ] ---

    /** {@code XrResult xrQueryLocalizationMapsML(XrSession session, XrLocalizationMapQueryInfoBaseHeaderML const * queryInfo, uint32_t mapCapacityInput, uint32_t * mapCountOutput, XrLocalizationMapML * maps)} */
    public static int nxrQueryLocalizationMapsML(XrSession session, long queryInfo, int mapCapacityInput, long mapCountOutput, long maps) {
        long __functionAddress = session.getCapabilities().xrQueryLocalizationMapsML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(session.address(), queryInfo, mapCapacityInput, mapCountOutput, maps, __functionAddress);
    }

    /** {@code XrResult xrQueryLocalizationMapsML(XrSession session, XrLocalizationMapQueryInfoBaseHeaderML const * queryInfo, uint32_t mapCapacityInput, uint32_t * mapCountOutput, XrLocalizationMapML * maps)} */
    @NativeType("XrResult")
    public static int xrQueryLocalizationMapsML(XrSession session, @NativeType("XrLocalizationMapQueryInfoBaseHeaderML const *") @Nullable XrLocalizationMapQueryInfoBaseHeaderML queryInfo, @NativeType("uint32_t *") IntBuffer mapCountOutput, @NativeType("XrLocalizationMapML *") XrLocalizationMapML.@Nullable Buffer maps) {
        if (CHECKS) {
            check(mapCountOutput, 1);
        }
        return nxrQueryLocalizationMapsML(session, memAddressSafe(queryInfo), remainingSafe(maps), memAddress(mapCountOutput), memAddressSafe(maps));
    }

    // --- [ xrRequestMapLocalizationML ] ---

    /** {@code XrResult xrRequestMapLocalizationML(XrSession session, XrMapLocalizationRequestInfoML const * requestInfo)} */
    public static int nxrRequestMapLocalizationML(XrSession session, long requestInfo) {
        long __functionAddress = session.getCapabilities().xrRequestMapLocalizationML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), requestInfo, __functionAddress);
    }

    /** {@code XrResult xrRequestMapLocalizationML(XrSession session, XrMapLocalizationRequestInfoML const * requestInfo)} */
    @NativeType("XrResult")
    public static int xrRequestMapLocalizationML(XrSession session, @NativeType("XrMapLocalizationRequestInfoML const *") XrMapLocalizationRequestInfoML requestInfo) {
        return nxrRequestMapLocalizationML(session, requestInfo.address());
    }

    // --- [ xrImportLocalizationMapML ] ---

    /** {@code XrResult xrImportLocalizationMapML(XrSession session, XrLocalizationMapImportInfoML const * importInfo, XrUuidEXT * mapUuid)} */
    public static int nxrImportLocalizationMapML(XrSession session, long importInfo, long mapUuid) {
        long __functionAddress = session.getCapabilities().xrImportLocalizationMapML;
        if (CHECKS) {
            check(__functionAddress);
            XrLocalizationMapImportInfoML.validate(importInfo);
        }
        return callPPPI(session.address(), importInfo, mapUuid, __functionAddress);
    }

    /** {@code XrResult xrImportLocalizationMapML(XrSession session, XrLocalizationMapImportInfoML const * importInfo, XrUuidEXT * mapUuid)} */
    @NativeType("XrResult")
    public static int xrImportLocalizationMapML(XrSession session, @NativeType("XrLocalizationMapImportInfoML const *") XrLocalizationMapImportInfoML importInfo, @NativeType("XrUuidEXT *") @Nullable XrUuidEXT mapUuid) {
        return nxrImportLocalizationMapML(session, importInfo.address(), memAddressSafe(mapUuid));
    }

    // --- [ xrCreateExportedLocalizationMapML ] ---

    /** {@code XrResult xrCreateExportedLocalizationMapML(XrSession session, XrUuidEXT const * mapUuid, XrExportedLocalizationMapML * map)} */
    public static int nxrCreateExportedLocalizationMapML(XrSession session, long mapUuid, long map) {
        long __functionAddress = session.getCapabilities().xrCreateExportedLocalizationMapML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), mapUuid, map, __functionAddress);
    }

    /** {@code XrResult xrCreateExportedLocalizationMapML(XrSession session, XrUuidEXT const * mapUuid, XrExportedLocalizationMapML * map)} */
    @NativeType("XrResult")
    public static int xrCreateExportedLocalizationMapML(XrSession session, @NativeType("XrUuidEXT const *") XrUuidEXT mapUuid, @NativeType("XrExportedLocalizationMapML *") PointerBuffer map) {
        if (CHECKS) {
            check(map, 1);
        }
        return nxrCreateExportedLocalizationMapML(session, mapUuid.address(), memAddress(map));
    }

    // --- [ xrDestroyExportedLocalizationMapML ] ---

    /** {@code XrResult xrDestroyExportedLocalizationMapML(XrExportedLocalizationMapML map)} */
    @NativeType("XrResult")
    public static int xrDestroyExportedLocalizationMapML(XrExportedLocalizationMapML map) {
        long __functionAddress = map.getCapabilities().xrDestroyExportedLocalizationMapML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(map.address(), __functionAddress);
    }

    // --- [ xrGetExportedLocalizationMapDataML ] ---

    /** {@code XrResult xrGetExportedLocalizationMapDataML(XrExportedLocalizationMapML map, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, char * buffer)} */
    public static int nxrGetExportedLocalizationMapDataML(XrExportedLocalizationMapML map, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = map.getCapabilities().xrGetExportedLocalizationMapDataML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(map.address(), bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /** {@code XrResult xrGetExportedLocalizationMapDataML(XrExportedLocalizationMapML map, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, char * buffer)} */
    @NativeType("XrResult")
    public static int xrGetExportedLocalizationMapDataML(XrExportedLocalizationMapML map, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @NativeType("char *") @Nullable ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrGetExportedLocalizationMapDataML(map, remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

}