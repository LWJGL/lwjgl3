/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * An event posted by the server to all running applications.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VREvent_t {
 *     uint32_t {@link #eventType};
 *     TrackedDeviceIndex_t {@link #trackedDeviceIndex};
 *     float {@link #eventAgeSeconds};
 *     {@link VREventData VREvent_Data_t} {@link #data};
 * }</code></pre>
 */
@NativeType("struct VREvent_t")
public class VREvent extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        EVENTTYPE,
        TRACKEDDEVICEINDEX,
        EVENTAGESECONDS,
        DATA;

    static {
        Layout layout = __struct(
            Platform.get() == Platform.LINUX || Platform.get() == Platform.MACOSX ? 4 : DEFAULT_PACK_ALIGNMENT, DEFAULT_ALIGN_AS,
            __member(4),
            __member(4),
            __member(4),
            __member(VREventData.SIZEOF, VREventData.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        EVENTTYPE = layout.offsetof(0);
        TRACKEDDEVICEINDEX = layout.offsetof(1);
        EVENTAGESECONDS = layout.offsetof(2);
        DATA = layout.offsetof(3);
    }

    /**
     * Creates a {@code VREvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREvent(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of the event. One of:<br><table><tr><td>{@link VR#EVREventType_VREvent_None}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedDeviceActivated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedDeviceDeactivated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedDeviceUpdated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedDeviceUserInteractionStarted}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedDeviceUserInteractionEnded}</td></tr><tr><td>{@link VR#EVREventType_VREvent_IpdChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_EnterStandbyMode}</td></tr><tr><td>{@link VR#EVREventType_VREvent_LeaveStandbyMode}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedDeviceRoleChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_WatchdogWakeUpRequested}</td></tr><tr><td>{@link VR#EVREventType_VREvent_LensDistortionChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_PropertyChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_WirelessDisconnect}</td></tr><tr><td>{@link VR#EVREventType_VREvent_WirelessReconnect}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ButtonPress}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ButtonUnpress}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ButtonTouch}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ButtonUntouch}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Modal_Cancel}</td></tr><tr><td>{@link VR#EVREventType_VREvent_MouseMove}</td></tr><tr><td>{@link VR#EVREventType_VREvent_MouseButtonDown}</td></tr><tr><td>{@link VR#EVREventType_VREvent_MouseButtonUp}</td></tr><tr><td>{@link VR#EVREventType_VREvent_FocusEnter}</td></tr><tr><td>{@link VR#EVREventType_VREvent_FocusLeave}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ScrollDiscrete}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TouchPadMove}</td></tr><tr><td>{@link VR#EVREventType_VREvent_OverlayFocusChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ReloadOverlays}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ScrollSmooth}</td></tr><tr><td>{@link VR#EVREventType_VREvent_LockMousePosition}</td></tr><tr><td>{@link VR#EVREventType_VREvent_UnlockMousePosition}</td></tr><tr><td>{@link VR#EVREventType_VREvent_InputFocusCaptured}</td></tr><tr><td>{@link VR#EVREventType_VREvent_InputFocusReleased}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SceneApplicationChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SceneFocusChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_InputFocusChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SceneApplicationUsingWrongGraphicsAdapter}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ActionBindingReloaded}</td></tr><tr><td>{@link VR#EVREventType_VREvent_HideRenderModels}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ShowRenderModels}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SceneApplicationStateChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ConsoleOpened}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ConsoleClosed}</td></tr><tr><td>{@link VR#EVREventType_VREvent_OverlayShown}</td></tr><tr><td>{@link VR#EVREventType_VREvent_OverlayHidden}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DashboardActivated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DashboardDeactivated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DashboardRequested}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ResetDashboard}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ImageLoaded}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ShowKeyboard}</td></tr><tr><td>{@link VR#EVREventType_VREvent_HideKeyboard}</td></tr><tr><td>{@link VR#EVREventType_VREvent_OverlayGamepadFocusGained}</td></tr><tr><td>{@link VR#EVREventType_VREvent_OverlayGamepadFocusLost}</td></tr><tr><td>{@link VR#EVREventType_VREvent_OverlaySharedTextureChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ScreenshotTriggered}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ImageFailed}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DashboardOverlayCreated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SwitchGamepadFocus}</td></tr><tr><td>{@link VR#EVREventType_VREvent_RequestScreenshot}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ScreenshotTaken}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ScreenshotFailed}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SubmitScreenshotToDashboard}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ScreenshotProgressToDashboard}</td></tr><tr><td>{@link VR#EVREventType_VREvent_PrimaryDashboardDeviceChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_RoomViewShown}</td></tr><tr><td>{@link VR#EVREventType_VREvent_RoomViewHidden}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ShowUI}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ShowDevTools}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DesktopViewUpdating}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DesktopViewReady}</td></tr><tr><td>{@link VR#EVREventType_VREvent_StartDashboard}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ElevatePrism}</td></tr><tr><td>{@link VR#EVREventType_VREvent_OverlayClosed}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Notification_Shown}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Notification_Hidden}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Notification_BeginInteraction}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Notification_Destroyed}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Quit}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ProcessQuit}</td></tr><tr><td>{@link VR#EVREventType_VREvent_QuitAcknowledged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DriverRequestedQuit}</td></tr><tr><td>{@link VR#EVREventType_VREvent_RestartRequested}</td></tr><tr><td>{@link VR#EVREventType_VREvent_InvalidateSwapTextureSets}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ChaperoneDataHasChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ChaperoneUniverseHasChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ChaperoneTempDataHasChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ChaperoneSettingsHaveChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SeatedZeroPoseReset}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ChaperoneFlushCache}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ChaperoneRoomSetupStarting}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ChaperoneRoomSetupFinished}</td></tr><tr><td>{@link VR#EVREventType_VREvent_StandingZeroPoseReset}</td></tr><tr><td>{@link VR#EVREventType_VREvent_AudioSettingsHaveChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_BackgroundSettingHasChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_CameraSettingsHaveChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ReprojectionSettingHasChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ModelSkinSettingsHaveChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_EnvironmentSettingsHaveChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_PowerSettingsHaveChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_EnableHomeAppSettingsHaveChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SteamVRSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_LighthouseSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_NullSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_UserInterfaceSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_NotificationsSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_KeyboardSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_PerfSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DashboardSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_WebInterfaceSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackersSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_LastKnownSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DismissedWarningsSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_GpuSpeedSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_WindowsMRSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_OtherSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_StatusUpdate}</td></tr><tr><td>{@link VR#EVREventType_VREvent_WebInterface_InstallDriverCompleted}</td></tr><tr><td>{@link VR#EVREventType_VREvent_MCImageUpdated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_FirmwareUpdateStarted}</td></tr><tr><td>{@link VR#EVREventType_VREvent_FirmwareUpdateFinished}</td></tr><tr><td>{@link VR#EVREventType_VREvent_KeyboardClosed}</td></tr><tr><td>{@link VR#EVREventType_VREvent_KeyboardCharInput}</td></tr><tr><td>{@link VR#EVREventType_VREvent_KeyboardDone}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ApplicationListUpdated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ApplicationMimeTypeLoad}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ProcessConnected}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ProcessDisconnected}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Compositor_ChaperoneBoundsShown}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Compositor_ChaperoneBoundsHidden}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Compositor_DisplayDisconnected}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Compositor_DisplayReconnected}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Compositor_HDCPError}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Compositor_ApplicationNotResponding}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Compositor_ApplicationResumed}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Compositor_OutOfVideoMemory}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Compositor_DisplayModeNotSupported}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Compositor_StageOverrideReady}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Compositor_RequestDisconnectReconnect}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedCamera_StartVideoStream}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedCamera_StopVideoStream}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedCamera_PauseVideoStream}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedCamera_ResumeVideoStream}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedCamera_EditingSurface}</td></tr><tr><td>{@link VR#EVREventType_VREvent_PerformanceTest_EnableCapture}</td></tr><tr><td>{@link VR#EVREventType_VREvent_PerformanceTest_DisableCapture}</td></tr><tr><td>{@link VR#EVREventType_VREvent_PerformanceTest_FidelityLevel}</td></tr><tr><td>{@link VR#EVREventType_VREvent_MessageOverlay_Closed}</td></tr><tr><td>{@link VR#EVREventType_VREvent_MessageOverlayCloseRequested}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Input_HapticVibration}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Input_BindingLoadFailed}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Input_BindingLoadSuccessful}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Input_ActionManifestReloaded}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Input_ActionManifestLoadFailed}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Input_ProgressUpdate}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Input_TrackerActivated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Input_BindingsUpdated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Input_BindingSubscriptionChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SpatialAnchors_PoseUpdated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SpatialAnchors_DescriptorUpdated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SpatialAnchors_RequestPoseUpdate}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SpatialAnchors_RequestDescriptorUpdate}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SystemReport_Started}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Monitor_ShowHeadsetView}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Monitor_HideHeadsetView}</td></tr><tr><td>{@link VR#EVREventType_VREvent_VendorSpecific_Reserved_Start}</td></tr><tr><td>{@link VR#EVREventType_VREvent_VendorSpecific_Reserved_End}</td></tr></table> */
    @NativeType("uint32_t")
    public int eventType() { return neventType(address()); }
    /** the tracked device index of the event. For events that aren't connected to a tracked device this is {@link VR#k_unTrackedDeviceIndexInvalid}. */
    @NativeType("TrackedDeviceIndex_t")
    public int trackedDeviceIndex() { return ntrackedDeviceIndex(address()); }
    /** the age of the event in seconds */
    public float eventAgeSeconds() { return neventAgeSeconds(address()); }
    /**
     * more information about the event. This is a union of several structs. See the event type enum for information about which union member to look at for
     * each event.
     */
    @NativeType("VREvent_Data_t")
    public VREventData data() { return ndata(address()); }

    // -----------------------------------

    /** Returns a new {@code VREvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VREvent malloc() {
        return wrap(VREvent.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VREvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VREvent calloc() {
        return wrap(VREvent.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VREvent} instance allocated with {@link BufferUtils}. */
    public static VREvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VREvent.class, memAddress(container), container);
    }

    /** Returns a new {@code VREvent} instance for the specified memory address. */
    public static VREvent create(long address) {
        return wrap(VREvent.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREvent createSafe(long address) {
        return address == NULL ? null : wrap(VREvent.class, address);
    }

    /**
     * Returns a new {@link VREvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VREvent.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VREvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VREvent.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VREvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VREvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREvent.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VREvent mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VREvent callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VREvent mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VREvent callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VREvent.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VREvent.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VREvent.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VREvent.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VREvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VREvent malloc(MemoryStack stack) {
        return wrap(VREvent.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VREvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VREvent calloc(MemoryStack stack) {
        return wrap(VREvent.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VREvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VREvent.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VREvent.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #eventType}. */
    public static int neventType(long struct) { return UNSAFE.getInt(null, struct + VREvent.EVENTTYPE); }
    /** Unsafe version of {@link #trackedDeviceIndex}. */
    public static int ntrackedDeviceIndex(long struct) { return UNSAFE.getInt(null, struct + VREvent.TRACKEDDEVICEINDEX); }
    /** Unsafe version of {@link #eventAgeSeconds}. */
    public static float neventAgeSeconds(long struct) { return UNSAFE.getFloat(null, struct + VREvent.EVENTAGESECONDS); }
    /** Unsafe version of {@link #data}. */
    public static VREventData ndata(long struct) { return VREventData.create(struct + VREvent.DATA); }

    // -----------------------------------

    /** An array of {@link VREvent} structs. */
    public static class Buffer extends StructBuffer<VREvent, Buffer> implements NativeResource {

        private static final VREvent ELEMENT_FACTORY = VREvent.create(-1L);

        /**
         * Creates a new {@code VREvent.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREvent#SIZEOF}, and its mark will be undefined.
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
        protected VREvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VREvent#eventType} field. */
        @NativeType("uint32_t")
        public int eventType() { return VREvent.neventType(address()); }
        /** @return the value of the {@link VREvent#trackedDeviceIndex} field. */
        @NativeType("TrackedDeviceIndex_t")
        public int trackedDeviceIndex() { return VREvent.ntrackedDeviceIndex(address()); }
        /** @return the value of the {@link VREvent#eventAgeSeconds} field. */
        public float eventAgeSeconds() { return VREvent.neventAgeSeconds(address()); }
        /** @return a {@link VREventData} view of the {@link VREvent#data} field. */
        @NativeType("VREvent_Data_t")
        public VREventData data() { return VREvent.ndata(address()); }

    }

}