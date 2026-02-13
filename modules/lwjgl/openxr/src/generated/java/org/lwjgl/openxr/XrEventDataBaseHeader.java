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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrEventDataBaseHeader {
 *     XrStructureType type;
 *     void const * next;
 * }}</pre>
 */
public class XrEventDataBaseHeader extends Struct<XrEventDataBaseHeader> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    protected XrEventDataBaseHeader(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataBaseHeader create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataBaseHeader(address, container);
    }

    /**
     * Creates a {@code XrEventDataBaseHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataBaseHeader(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataBaseHeader type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataBaseHeader next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataBaseHeader set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEventDataBaseHeader set(XrEventDataBaseHeader src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataBaseHeader} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataBaseHeader malloc() {
        return new XrEventDataBaseHeader(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataBaseHeader} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataBaseHeader calloc() {
        return new XrEventDataBaseHeader(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataBaseHeader} instance allocated with {@link BufferUtils}. */
    public static XrEventDataBaseHeader create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataBaseHeader(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataBaseHeader} instance for the specified memory address. */
    public static XrEventDataBaseHeader create(long address) {
        return new XrEventDataBaseHeader(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataBaseHeader createSafe(long address) {
        return address == NULL ? null : new XrEventDataBaseHeader(address, null);
    }

    /** Upcasts the specified {@code XrEventDataEventsLost} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataEventsLost value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataInstanceLossPending} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataInstanceLossPending value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataSessionStateChanged} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataSessionStateChanged value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataReferenceSpaceChangePending} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataReferenceSpaceChangePending value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataInteractionProfileChanged} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataInteractionProfileChanged value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataPerfSettingsEXT} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataPerfSettingsEXT value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataVisibilityMaskChangedKHR} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataVisibilityMaskChangedKHR value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataMainSessionVisibilityChangedEXTX} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataMainSessionVisibilityChangedEXTX value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataDisplayRefreshRateChangedFB} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataDisplayRefreshRateChangedFB value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataViveTrackerConnectedHTCX} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataViveTrackerConnectedHTCX value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataSpatialAnchorCreateCompleteFB} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataSpatialAnchorCreateCompleteFB value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataSpaceSetStatusCompleteFB} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataSpaceSetStatusCompleteFB value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataPassthroughStateChangedFB} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataPassthroughStateChangedFB value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataMarkerTrackingUpdateVARJO} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataMarkerTrackingUpdateVARJO value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataLocalizationChangedML} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataLocalizationChangedML value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataHeadsetFitChangedML} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataHeadsetFitChangedML value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataEyeCalibrationChangedML} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataEyeCalibrationChangedML value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataSpaceQueryResultsAvailableFB} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataSpaceQueryResultsAvailableFB value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataSpaceQueryCompleteFB} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataSpaceQueryCompleteFB value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataSpaceSaveCompleteFB} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataSpaceSaveCompleteFB value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataSpaceEraseCompleteFB} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataSpaceEraseCompleteFB value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataSpaceShareCompleteFB} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataSpaceShareCompleteFB value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataSceneCaptureCompleteFB} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataSceneCaptureCompleteFB value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataVirtualKeyboardCommitTextMETA} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataVirtualKeyboardCommitTextMETA value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataVirtualKeyboardBackspaceMETA} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataVirtualKeyboardBackspaceMETA value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataVirtualKeyboardEnterMETA} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataVirtualKeyboardEnterMETA value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataVirtualKeyboardShownMETA} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataVirtualKeyboardShownMETA value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataVirtualKeyboardHiddenMETA} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataVirtualKeyboardHiddenMETA value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataSpaceListSaveCompleteFB} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataSpaceListSaveCompleteFB value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataSpaceDiscoveryResultsAvailableMETA} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataSpaceDiscoveryResultsAvailableMETA value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataSpaceDiscoveryCompleteMETA} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataSpaceDiscoveryCompleteMETA value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataSpacesSaveResultMETA} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataSpacesSaveResultMETA value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataSpacesEraseResultMETA} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataSpacesEraseResultMETA value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataPassthroughLayerResumedMETA} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataPassthroughLayerResumedMETA value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataShareSpacesCompleteMETA} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataShareSpacesCompleteMETA value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataInteractionRenderModelsChangedEXT} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataInteractionRenderModelsChangedEXT value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataSenseDataProviderStateChangedBD} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataSenseDataProviderStateChangedBD value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataSenseDataUpdatedBD} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataSenseDataUpdatedBD value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataUserPresenceChangedEXT} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataUserPresenceChangedEXT value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataStartColocationAdvertisementCompleteMETA} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataStartColocationAdvertisementCompleteMETA value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataStopColocationAdvertisementCompleteMETA} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataStopColocationAdvertisementCompleteMETA value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataColocationAdvertisementCompleteMETA} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataColocationAdvertisementCompleteMETA value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataStartColocationDiscoveryCompleteMETA} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataStartColocationDiscoveryCompleteMETA value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataColocationDiscoveryResultMETA} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataColocationDiscoveryResultMETA value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataColocationDiscoveryCompleteMETA} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataColocationDiscoveryCompleteMETA value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataStopColocationDiscoveryCompleteMETA} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataStopColocationDiscoveryCompleteMETA value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataImageTrackingLostANDROID} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataImageTrackingLostANDROID value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrEventDataSpatialDiscoveryRecommendedEXT} instance to {@code XrEventDataBaseHeader}. */
    public static XrEventDataBaseHeader create(XrEventDataSpatialDiscoveryRecommendedEXT value) {
        return new XrEventDataBaseHeader(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataBaseHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataBaseHeader.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataBaseHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataBaseHeader.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataBaseHeader.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataBaseHeader.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataBaseHeader.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataBaseHeader.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataBaseHeader.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Upcasts the specified {@code XrEventDataEventsLost.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataEventsLost.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataInstanceLossPending.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataInstanceLossPending.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataSessionStateChanged.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataSessionStateChanged.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataReferenceSpaceChangePending.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataReferenceSpaceChangePending.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataInteractionProfileChanged.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataInteractionProfileChanged.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataPerfSettingsEXT.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataPerfSettingsEXT.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataVisibilityMaskChangedKHR.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataVisibilityMaskChangedKHR.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataMainSessionVisibilityChangedEXTX.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataMainSessionVisibilityChangedEXTX.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataDisplayRefreshRateChangedFB.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataDisplayRefreshRateChangedFB.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataViveTrackerConnectedHTCX.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataViveTrackerConnectedHTCX.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataSpatialAnchorCreateCompleteFB.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataSpatialAnchorCreateCompleteFB.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataSpaceSetStatusCompleteFB.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataSpaceSetStatusCompleteFB.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataPassthroughStateChangedFB.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataPassthroughStateChangedFB.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataMarkerTrackingUpdateVARJO.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataMarkerTrackingUpdateVARJO.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataLocalizationChangedML.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataLocalizationChangedML.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataHeadsetFitChangedML.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataHeadsetFitChangedML.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataEyeCalibrationChangedML.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataEyeCalibrationChangedML.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataSpaceQueryResultsAvailableFB.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataSpaceQueryResultsAvailableFB.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataSpaceQueryCompleteFB.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataSpaceQueryCompleteFB.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataSpaceSaveCompleteFB.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataSpaceSaveCompleteFB.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataSpaceEraseCompleteFB.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataSpaceEraseCompleteFB.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataSpaceShareCompleteFB.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataSpaceShareCompleteFB.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataSceneCaptureCompleteFB.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataSceneCaptureCompleteFB.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataVirtualKeyboardCommitTextMETA.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataVirtualKeyboardCommitTextMETA.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataVirtualKeyboardBackspaceMETA.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataVirtualKeyboardBackspaceMETA.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataVirtualKeyboardEnterMETA.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataVirtualKeyboardEnterMETA.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataVirtualKeyboardShownMETA.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataVirtualKeyboardShownMETA.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataVirtualKeyboardHiddenMETA.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataVirtualKeyboardHiddenMETA.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataSpaceListSaveCompleteFB.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataSpaceListSaveCompleteFB.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataSpaceDiscoveryResultsAvailableMETA.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataSpaceDiscoveryResultsAvailableMETA.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataSpaceDiscoveryCompleteMETA.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataSpaceDiscoveryCompleteMETA.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataSpacesSaveResultMETA.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataSpacesSaveResultMETA.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataSpacesEraseResultMETA.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataSpacesEraseResultMETA.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataPassthroughLayerResumedMETA.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataPassthroughLayerResumedMETA.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataShareSpacesCompleteMETA.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataShareSpacesCompleteMETA.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataInteractionRenderModelsChangedEXT.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataInteractionRenderModelsChangedEXT.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataSenseDataProviderStateChangedBD.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataSenseDataProviderStateChangedBD.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataSenseDataUpdatedBD.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataSenseDataUpdatedBD.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataUserPresenceChangedEXT.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataUserPresenceChangedEXT.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataStartColocationAdvertisementCompleteMETA.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataStartColocationAdvertisementCompleteMETA.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataStopColocationAdvertisementCompleteMETA.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataStopColocationAdvertisementCompleteMETA.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataColocationAdvertisementCompleteMETA.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataColocationAdvertisementCompleteMETA.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataStartColocationDiscoveryCompleteMETA.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataStartColocationDiscoveryCompleteMETA.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataColocationDiscoveryResultMETA.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataColocationDiscoveryResultMETA.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataColocationDiscoveryCompleteMETA.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataColocationDiscoveryCompleteMETA.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataStopColocationDiscoveryCompleteMETA.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataStopColocationDiscoveryCompleteMETA.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataImageTrackingLostANDROID.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataImageTrackingLostANDROID.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrEventDataSpatialDiscoveryRecommendedEXT.Buffer} instance to {@code XrEventDataBaseHeader.Buffer}. */
    public static XrEventDataBaseHeader.Buffer create(XrEventDataSpatialDiscoveryRecommendedEXT.Buffer value) {
        return new XrEventDataBaseHeader.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataBaseHeader} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataBaseHeader malloc(MemoryStack stack) {
        return new XrEventDataBaseHeader(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataBaseHeader} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataBaseHeader calloc(MemoryStack stack) {
        return new XrEventDataBaseHeader(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataBaseHeader.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataBaseHeader.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataBaseHeader.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataBaseHeader.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataBaseHeader.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataBaseHeader.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataBaseHeader.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataBaseHeader.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataBaseHeader} structs. */
    public static class Buffer extends StructBuffer<XrEventDataBaseHeader, Buffer> implements NativeResource {

        private static final XrEventDataBaseHeader ELEMENT_FACTORY = XrEventDataBaseHeader.create(-1L);

        /**
         * Creates a new {@code XrEventDataBaseHeader.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataBaseHeader#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrEventDataBaseHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataBaseHeader.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataBaseHeader.nnext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataBaseHeader.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataBaseHeader.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataBaseHeader.Buffer next(@NativeType("void const *") long value) { XrEventDataBaseHeader.nnext(address(), value); return this; }

    }

}