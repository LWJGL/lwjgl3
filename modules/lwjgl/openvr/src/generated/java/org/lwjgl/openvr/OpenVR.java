/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.lwjgl.system.*;
import java.util.Set;
import java.nio.*;
import java.util.function.*;
import org.jspecify.annotations.Nullable;
import org.lwjgl.*;

import static org.lwjgl.openvr.VR.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The OpenVR function tables. */
public final class OpenVR {

    public static @Nullable IVRSystem VRSystem;
    public static @Nullable IVRChaperone VRChaperone;
    public static @Nullable IVRChaperoneSetup VRChaperoneSetup;
    public static @Nullable IVRCompositor VRCompositor;
    public static @Nullable IVRHeadsetView VRHeadsetView;
    public static @Nullable IVROverlay VROverlay;
    public static @Nullable IVROverlayView VROverlayView;
    public static @Nullable IVRResources VRResources;
    public static @Nullable IVRRenderModels VRRenderModels;
    public static @Nullable IVRExtendedDisplay VRExtendedDisplay;
    public static @Nullable IVRSettings VRSettings;
    public static @Nullable IVRApplications VRApplications;
    public static @Nullable IVRTrackedCamera VRTrackedCamera;
    public static @Nullable IVRScreenshots VRScreenshots;
    public static @Nullable IVRDriverManager VRDriverManager;
    public static @Nullable IVRInput VRInput;
    public static @Nullable IVRIOBuffer VRIOBuffer;
    public static @Nullable IVRSpatialAnchors VRSpatialAnchors;
    public static @Nullable IVRDebug VRDebug;
    public static @Nullable IVRNotifications VRNotifications;
    public static @Nullable IVRProperties VRProperties;
    public static @Nullable IVRPaths VRPaths;
    public static @Nullable IVRBlockQueue VRBlockQueue;

    private static int token;

    static {
        String libName = Platform.mapLibraryNameBundled("lwjgl_openvr");
        Library.loadSystem(System::load, System::loadLibrary, OpenVR.class, "org.lwjgl.openvr", libName);
    }

    private OpenVR() {
    }

    static void initialize() {
        // intentionally empty to trigger static initializer
    }

    public static void create(int token) {
        OpenVR.token = token;

        VRSystem = getGenericInterface(IVRSystem_Version, IVRSystem::new);
        VRChaperone = getGenericInterface(IVRChaperone_Version, IVRChaperone::new);
        VRChaperoneSetup = getGenericInterface(IVRChaperoneSetup_Version, IVRChaperoneSetup::new);
        VRCompositor = getGenericInterface(IVRCompositor_Version, IVRCompositor::new);
        VRHeadsetView = getGenericInterface(IVRHeadsetView_Version, IVRHeadsetView::new);
        VROverlay = getGenericInterface(IVROverlay_Version, IVROverlay::new);
        VROverlayView = getGenericInterface(IVROverlayView_Version, IVROverlayView::new);
        VRResources = getGenericInterface(IVRResources_Version, IVRResources::new);
        VRRenderModels = getGenericInterface(IVRRenderModels_Version, IVRRenderModels::new);
        VRExtendedDisplay = getGenericInterface(IVRExtendedDisplay_Version, IVRExtendedDisplay::new);
        VRSettings = getGenericInterface(IVRSettings_Version, IVRSettings::new);
        VRApplications = getGenericInterface(IVRApplications_Version, IVRApplications::new);
        VRTrackedCamera = getGenericInterface(IVRTrackedCamera_Version, IVRTrackedCamera::new);
        VRScreenshots = getGenericInterface(IVRScreenshots_Version, IVRScreenshots::new);
        VRDriverManager = getGenericInterface(IVRDriverManager_Version, IVRDriverManager::new);
        VRInput = getGenericInterface(IVRInput_Version, IVRInput::new);
        VRIOBuffer = getGenericInterface(IVRIOBuffer_Version, IVRIOBuffer::new);
        VRSpatialAnchors = getGenericInterface(IVRSpatialAnchors_Version, IVRSpatialAnchors::new);
        VRDebug = getGenericInterface(IVRDebug_Version, IVRDebug::new);
        VRNotifications = getGenericInterface(IVRNotifications_Version, IVRNotifications::new);
        VRProperties = getGenericInterface(IVRProperties_Version, IVRProperties::new);
        VRPaths = getGenericInterface(IVRPaths_Version, IVRPaths::new);
        VRBlockQueue = getGenericInterface(IVRBlockQueue_Version, IVRBlockQueue::new);
    }

    private static <T> @Nullable T getGenericInterface(String interfaceNameVersion, LongFunction<T> supplier) {
        try (MemoryStack stack = stackPush()) {
            IntBuffer peError = stack.mallocInt(1);
            long ivr = VR_GetGenericInterface("FnTable:" + interfaceNameVersion, peError);
            return ivr != NULL && peError.get(0) == EVRInitError_VRInitError_None ? supplier.apply(ivr) : null;
        }
    }

    public static void checkInitToken() {
        if (token == 0) {
            throw new IllegalStateException("The OpenVR API must be initialized first.");
        }

        int initToken = VR_GetInitToken();
        if (token != initToken) {
            destroy();
            create(initToken);
        }
    }

    public static void destroy() {
        token = 0;

        VRSystem = null;
        VRChaperone = null;
        VRChaperoneSetup = null;
        VRCompositor = null;
        VRHeadsetView = null;
        VROverlay = null;
        VROverlayView = null;
        VRResources = null;
        VRRenderModels = null;
        VRExtendedDisplay = null;
        VRSettings = null;
        VRApplications = null;
        VRTrackedCamera = null;
        VRScreenshots = null;
        VRDriverManager = null;
        VRInput = null;
        VRIOBuffer = null;
        VRSpatialAnchors = null;
        VRDebug = null;
        VRNotifications = null;
        VRProperties = null;
        VRPaths = null;
        VRBlockQueue = null;
    }

    public static final class IVRSystem {

        public final long
            GetRecommendedRenderTargetSize,
            GetProjectionMatrix,
            GetProjectionRaw,
            ComputeDistortion,
            GetEyeToHeadTransform,
            GetTimeSinceLastVsync,
            GetD3D9AdapterIndex,
            GetDXGIOutputInfo,
            GetOutputDevice,
            IsDisplayOnDesktop,
            SetDisplayVisibility,
            GetDeviceToAbsoluteTrackingPose,
            GetSeatedZeroPoseToStandingAbsoluteTrackingPose,
            GetRawZeroPoseToStandingAbsoluteTrackingPose,
            GetSortedTrackedDeviceIndicesOfClass,
            GetTrackedDeviceActivityLevel,
            ApplyTransform,
            GetTrackedDeviceIndexForControllerRole,
            GetControllerRoleForTrackedDeviceIndex,
            GetTrackedDeviceClass,
            IsTrackedDeviceConnected,
            GetBoolTrackedDeviceProperty,
            GetFloatTrackedDeviceProperty,
            GetInt32TrackedDeviceProperty,
            GetUint64TrackedDeviceProperty,
            GetMatrix34TrackedDeviceProperty,
            GetArrayTrackedDeviceProperty,
            GetStringTrackedDeviceProperty,
            GetPropErrorNameFromEnum,
            PollNextEvent,
            PollNextEventWithPose,
            GetEventTypeNameFromEnum,
            GetHiddenAreaMesh,
            GetControllerState,
            GetControllerStateWithPose,
            TriggerHapticPulse,
            GetButtonIdNameFromEnum,
            GetControllerAxisTypeNameFromEnum,
            IsInputAvailable,
            IsSteamVRDrawingControllers,
            ShouldApplicationPause,
            ShouldApplicationReduceRenderingWork,
            PerformFirmwareUpdate,
            AcknowledgeQuit_Exiting,
            GetAppContainerFilePaths,
            GetRuntimeVersion;

        public IVRSystem(long tableAddress) {
            PointerBuffer table = memPointerBuffer(tableAddress, 46);
            GetRecommendedRenderTargetSize = table.get(0);
            GetProjectionMatrix = table.get(1);
            GetProjectionRaw = table.get(2);
            ComputeDistortion = table.get(3);
            GetEyeToHeadTransform = table.get(4);
            GetTimeSinceLastVsync = table.get(5);
            GetD3D9AdapterIndex = table.get(6);
            GetDXGIOutputInfo = table.get(7);
            GetOutputDevice = table.get(8);
            IsDisplayOnDesktop = table.get(9);
            SetDisplayVisibility = table.get(10);
            GetDeviceToAbsoluteTrackingPose = table.get(11);
            GetSeatedZeroPoseToStandingAbsoluteTrackingPose = table.get(12);
            GetRawZeroPoseToStandingAbsoluteTrackingPose = table.get(13);
            GetSortedTrackedDeviceIndicesOfClass = table.get(14);
            GetTrackedDeviceActivityLevel = table.get(15);
            ApplyTransform = table.get(16);
            GetTrackedDeviceIndexForControllerRole = table.get(17);
            GetControllerRoleForTrackedDeviceIndex = table.get(18);
            GetTrackedDeviceClass = table.get(19);
            IsTrackedDeviceConnected = table.get(20);
            GetBoolTrackedDeviceProperty = table.get(21);
            GetFloatTrackedDeviceProperty = table.get(22);
            GetInt32TrackedDeviceProperty = table.get(23);
            GetUint64TrackedDeviceProperty = table.get(24);
            GetMatrix34TrackedDeviceProperty = table.get(25);
            GetArrayTrackedDeviceProperty = table.get(26);
            GetStringTrackedDeviceProperty = table.get(27);
            GetPropErrorNameFromEnum = table.get(28);
            PollNextEvent = table.get(29);
            PollNextEventWithPose = table.get(30);
            GetEventTypeNameFromEnum = table.get(31);
            GetHiddenAreaMesh = table.get(32);
            GetControllerState = table.get(33);
            GetControllerStateWithPose = table.get(34);
            TriggerHapticPulse = table.get(35);
            GetButtonIdNameFromEnum = table.get(36);
            GetControllerAxisTypeNameFromEnum = table.get(37);
            IsInputAvailable = table.get(38);
            IsSteamVRDrawingControllers = table.get(39);
            ShouldApplicationPause = table.get(40);
            ShouldApplicationReduceRenderingWork = table.get(41);
            PerformFirmwareUpdate = table.get(42);
            AcknowledgeQuit_Exiting = table.get(43);
            GetAppContainerFilePaths = table.get(44);
            GetRuntimeVersion = table.get(45);
        }

    }

    public static final class IVRChaperone {

        public final long
            GetCalibrationState,
            GetPlayAreaSize,
            GetPlayAreaRect,
            ReloadInfo,
            SetSceneColor,
            GetBoundsColor,
            AreBoundsVisible,
            ForceBoundsVisible,
            ResetZeroPose;

        public IVRChaperone(long tableAddress) {
            PointerBuffer table = memPointerBuffer(tableAddress, 9);
            GetCalibrationState = table.get(0);
            GetPlayAreaSize = table.get(1);
            GetPlayAreaRect = table.get(2);
            ReloadInfo = table.get(3);
            SetSceneColor = table.get(4);
            GetBoundsColor = table.get(5);
            AreBoundsVisible = table.get(6);
            ForceBoundsVisible = table.get(7);
            ResetZeroPose = table.get(8);
        }

    }

    public static final class IVRChaperoneSetup {

        public final long
            CommitWorkingCopy,
            RevertWorkingCopy,
            GetWorkingPlayAreaSize,
            GetWorkingPlayAreaRect,
            GetWorkingCollisionBoundsInfo,
            GetLiveCollisionBoundsInfo,
            GetWorkingSeatedZeroPoseToRawTrackingPose,
            GetWorkingStandingZeroPoseToRawTrackingPose,
            SetWorkingPlayAreaSize,
            SetWorkingCollisionBoundsInfo,
            SetWorkingPerimeter,
            SetWorkingSeatedZeroPoseToRawTrackingPose,
            SetWorkingStandingZeroPoseToRawTrackingPose,
            ReloadFromDisk,
            GetLiveSeatedZeroPoseToRawTrackingPose,
            ExportLiveToBuffer,
            ImportFromBufferToWorking,
            ShowWorkingSetPreview,
            HideWorkingSetPreview,
            RoomSetupStarting;

        public IVRChaperoneSetup(long tableAddress) {
            PointerBuffer table = memPointerBuffer(tableAddress, 20);
            CommitWorkingCopy = table.get(0);
            RevertWorkingCopy = table.get(1);
            GetWorkingPlayAreaSize = table.get(2);
            GetWorkingPlayAreaRect = table.get(3);
            GetWorkingCollisionBoundsInfo = table.get(4);
            GetLiveCollisionBoundsInfo = table.get(5);
            GetWorkingSeatedZeroPoseToRawTrackingPose = table.get(6);
            GetWorkingStandingZeroPoseToRawTrackingPose = table.get(7);
            SetWorkingPlayAreaSize = table.get(8);
            SetWorkingCollisionBoundsInfo = table.get(9);
            SetWorkingPerimeter = table.get(10);
            SetWorkingSeatedZeroPoseToRawTrackingPose = table.get(11);
            SetWorkingStandingZeroPoseToRawTrackingPose = table.get(12);
            ReloadFromDisk = table.get(13);
            GetLiveSeatedZeroPoseToRawTrackingPose = table.get(14);
            ExportLiveToBuffer = table.get(15);
            ImportFromBufferToWorking = table.get(16);
            ShowWorkingSetPreview = table.get(17);
            HideWorkingSetPreview = table.get(18);
            RoomSetupStarting = table.get(19);
        }

    }

    public static final class IVRCompositor {

        public final long
            SetTrackingSpace,
            GetTrackingSpace,
            WaitGetPoses,
            GetLastPoses,
            GetLastPoseForTrackedDeviceIndex,
            Submit,
            SubmitWithArrayIndex,
            ClearLastSubmittedFrame,
            PostPresentHandoff,
            GetFrameTiming,
            GetFrameTimings,
            GetFrameTimeRemaining,
            GetCumulativeStats,
            FadeToColor,
            GetCurrentFadeColor,
            FadeGrid,
            GetCurrentGridAlpha,
            SetSkyboxOverride,
            ClearSkyboxOverride,
            CompositorBringToFront,
            CompositorGoToBack,
            CompositorQuit,
            IsFullscreen,
            GetCurrentSceneFocusProcess,
            GetLastFrameRenderer,
            CanRenderScene,
            ShowMirrorWindow,
            HideMirrorWindow,
            IsMirrorWindowVisible,
            CompositorDumpImages,
            ShouldAppRenderWithLowResources,
            ForceInterleavedReprojectionOn,
            ForceReconnectProcess,
            SuspendRendering,
            GetMirrorTextureD3D11,
            ReleaseMirrorTextureD3D11,
            GetMirrorTextureGL,
            ReleaseSharedGLTexture,
            LockGLSharedTextureForAccess,
            UnlockGLSharedTextureForAccess,
            GetVulkanInstanceExtensionsRequired,
            GetVulkanDeviceExtensionsRequired,
            SetExplicitTimingMode,
            SubmitExplicitTimingData,
            IsMotionSmoothingEnabled,
            IsMotionSmoothingSupported,
            IsCurrentSceneFocusAppLoading,
            SetStageOverride_Async,
            ClearStageOverride,
            GetCompositorBenchmarkResults,
            GetLastPosePredictionIDs,
            GetPosesForFrame;

        public IVRCompositor(long tableAddress) {
            PointerBuffer table = memPointerBuffer(tableAddress, 52);
            SetTrackingSpace = table.get(0);
            GetTrackingSpace = table.get(1);
            WaitGetPoses = table.get(2);
            GetLastPoses = table.get(3);
            GetLastPoseForTrackedDeviceIndex = table.get(4);
            Submit = table.get(5);
            SubmitWithArrayIndex = table.get(6);
            ClearLastSubmittedFrame = table.get(7);
            PostPresentHandoff = table.get(8);
            GetFrameTiming = table.get(9);
            GetFrameTimings = table.get(10);
            GetFrameTimeRemaining = table.get(11);
            GetCumulativeStats = table.get(12);
            FadeToColor = table.get(13);
            GetCurrentFadeColor = table.get(14);
            FadeGrid = table.get(15);
            GetCurrentGridAlpha = table.get(16);
            SetSkyboxOverride = table.get(17);
            ClearSkyboxOverride = table.get(18);
            CompositorBringToFront = table.get(19);
            CompositorGoToBack = table.get(20);
            CompositorQuit = table.get(21);
            IsFullscreen = table.get(22);
            GetCurrentSceneFocusProcess = table.get(23);
            GetLastFrameRenderer = table.get(24);
            CanRenderScene = table.get(25);
            ShowMirrorWindow = table.get(26);
            HideMirrorWindow = table.get(27);
            IsMirrorWindowVisible = table.get(28);
            CompositorDumpImages = table.get(29);
            ShouldAppRenderWithLowResources = table.get(30);
            ForceInterleavedReprojectionOn = table.get(31);
            ForceReconnectProcess = table.get(32);
            SuspendRendering = table.get(33);
            GetMirrorTextureD3D11 = table.get(34);
            ReleaseMirrorTextureD3D11 = table.get(35);
            GetMirrorTextureGL = table.get(36);
            ReleaseSharedGLTexture = table.get(37);
            LockGLSharedTextureForAccess = table.get(38);
            UnlockGLSharedTextureForAccess = table.get(39);
            GetVulkanInstanceExtensionsRequired = table.get(40);
            GetVulkanDeviceExtensionsRequired = table.get(41);
            SetExplicitTimingMode = table.get(42);
            SubmitExplicitTimingData = table.get(43);
            IsMotionSmoothingEnabled = table.get(44);
            IsMotionSmoothingSupported = table.get(45);
            IsCurrentSceneFocusAppLoading = table.get(46);
            SetStageOverride_Async = table.get(47);
            ClearStageOverride = table.get(48);
            GetCompositorBenchmarkResults = table.get(49);
            GetLastPosePredictionIDs = table.get(50);
            GetPosesForFrame = table.get(51);
        }

    }

    public static final class IVRHeadsetView {

        public final long
            SetHeadsetViewSize,
            GetHeadsetViewSize,
            SetHeadsetViewMode,
            GetHeadsetViewMode,
            SetHeadsetViewCropped,
            GetHeadsetViewCropped,
            GetHeadsetViewAspectRatio,
            SetHeadsetViewBlendRange,
            GetHeadsetViewBlendRange;

        public IVRHeadsetView(long tableAddress) {
            PointerBuffer table = memPointerBuffer(tableAddress, 9);
            SetHeadsetViewSize = table.get(0);
            GetHeadsetViewSize = table.get(1);
            SetHeadsetViewMode = table.get(2);
            GetHeadsetViewMode = table.get(3);
            SetHeadsetViewCropped = table.get(4);
            GetHeadsetViewCropped = table.get(5);
            GetHeadsetViewAspectRatio = table.get(6);
            SetHeadsetViewBlendRange = table.get(7);
            GetHeadsetViewBlendRange = table.get(8);
        }

    }

    public static final class IVROverlay {

        public final long
            FindOverlay,
            CreateOverlay,
            DestroyOverlay,
            GetOverlayKey,
            GetOverlayName,
            SetOverlayName,
            GetOverlayImageData,
            GetOverlayErrorNameFromEnum,
            SetOverlayRenderingPid,
            GetOverlayRenderingPid,
            SetOverlayFlag,
            GetOverlayFlag,
            GetOverlayFlags,
            SetOverlayColor,
            GetOverlayColor,
            SetOverlayAlpha,
            GetOverlayAlpha,
            SetOverlayTexelAspect,
            GetOverlayTexelAspect,
            SetOverlaySortOrder,
            GetOverlaySortOrder,
            SetOverlayWidthInMeters,
            GetOverlayWidthInMeters,
            SetOverlayCurvature,
            GetOverlayCurvature,
            SetOverlayPreCurvePitch,
            GetOverlayPreCurvePitch,
            SetOverlayTextureColorSpace,
            GetOverlayTextureColorSpace,
            SetOverlayTextureBounds,
            GetOverlayTextureBounds,
            GetOverlayTransformType,
            SetOverlayTransformAbsolute,
            GetOverlayTransformAbsolute,
            SetOverlayTransformTrackedDeviceRelative,
            GetOverlayTransformTrackedDeviceRelative,
            SetOverlayTransformTrackedDeviceComponent,
            GetOverlayTransformTrackedDeviceComponent,
            SetOverlayTransformCursor,
            GetOverlayTransformCursor,
            SetOverlayTransformProjection,
            ShowOverlay,
            HideOverlay,
            IsOverlayVisible,
            GetTransformForOverlayCoordinates,
            WaitFrameSync,
            PollNextOverlayEvent,
            GetOverlayInputMethod,
            SetOverlayInputMethod,
            GetOverlayMouseScale,
            SetOverlayMouseScale,
            ComputeOverlayIntersection,
            IsHoverTargetOverlay,
            SetOverlayIntersectionMask,
            TriggerLaserMouseHapticVibration,
            SetOverlayCursor,
            SetOverlayCursorPositionOverride,
            ClearOverlayCursorPositionOverride,
            SetOverlayTexture,
            ClearOverlayTexture,
            SetOverlayRaw,
            SetOverlayFromFile,
            GetOverlayTexture,
            ReleaseNativeOverlayHandle,
            GetOverlayTextureSize,
            CreateDashboardOverlay,
            IsDashboardVisible,
            IsActiveDashboardOverlay,
            SetDashboardOverlaySceneProcess,
            GetDashboardOverlaySceneProcess,
            ShowDashboard,
            GetPrimaryDashboardDevice,
            ShowKeyboard,
            ShowKeyboardForOverlay,
            GetKeyboardText,
            HideKeyboard,
            SetKeyboardTransformAbsolute,
            SetKeyboardPositionForOverlay,
            ShowMessageOverlay,
            CloseMessageOverlay;

        public IVROverlay(long tableAddress) {
            PointerBuffer table = memPointerBuffer(tableAddress, 80);
            FindOverlay = table.get(0);
            CreateOverlay = table.get(1);
            DestroyOverlay = table.get(2);
            GetOverlayKey = table.get(3);
            GetOverlayName = table.get(4);
            SetOverlayName = table.get(5);
            GetOverlayImageData = table.get(6);
            GetOverlayErrorNameFromEnum = table.get(7);
            SetOverlayRenderingPid = table.get(8);
            GetOverlayRenderingPid = table.get(9);
            SetOverlayFlag = table.get(10);
            GetOverlayFlag = table.get(11);
            GetOverlayFlags = table.get(12);
            SetOverlayColor = table.get(13);
            GetOverlayColor = table.get(14);
            SetOverlayAlpha = table.get(15);
            GetOverlayAlpha = table.get(16);
            SetOverlayTexelAspect = table.get(17);
            GetOverlayTexelAspect = table.get(18);
            SetOverlaySortOrder = table.get(19);
            GetOverlaySortOrder = table.get(20);
            SetOverlayWidthInMeters = table.get(21);
            GetOverlayWidthInMeters = table.get(22);
            SetOverlayCurvature = table.get(23);
            GetOverlayCurvature = table.get(24);
            SetOverlayPreCurvePitch = table.get(25);
            GetOverlayPreCurvePitch = table.get(26);
            SetOverlayTextureColorSpace = table.get(27);
            GetOverlayTextureColorSpace = table.get(28);
            SetOverlayTextureBounds = table.get(29);
            GetOverlayTextureBounds = table.get(30);
            GetOverlayTransformType = table.get(31);
            SetOverlayTransformAbsolute = table.get(32);
            GetOverlayTransformAbsolute = table.get(33);
            SetOverlayTransformTrackedDeviceRelative = table.get(34);
            GetOverlayTransformTrackedDeviceRelative = table.get(35);
            SetOverlayTransformTrackedDeviceComponent = table.get(36);
            GetOverlayTransformTrackedDeviceComponent = table.get(37);
            SetOverlayTransformCursor = table.get(38);
            GetOverlayTransformCursor = table.get(39);
            SetOverlayTransformProjection = table.get(40);
            ShowOverlay = table.get(41);
            HideOverlay = table.get(42);
            IsOverlayVisible = table.get(43);
            GetTransformForOverlayCoordinates = table.get(44);
            WaitFrameSync = table.get(45);
            PollNextOverlayEvent = table.get(46);
            GetOverlayInputMethod = table.get(47);
            SetOverlayInputMethod = table.get(48);
            GetOverlayMouseScale = table.get(49);
            SetOverlayMouseScale = table.get(50);
            ComputeOverlayIntersection = table.get(51);
            IsHoverTargetOverlay = table.get(52);
            SetOverlayIntersectionMask = table.get(53);
            TriggerLaserMouseHapticVibration = table.get(54);
            SetOverlayCursor = table.get(55);
            SetOverlayCursorPositionOverride = table.get(56);
            ClearOverlayCursorPositionOverride = table.get(57);
            SetOverlayTexture = table.get(58);
            ClearOverlayTexture = table.get(59);
            SetOverlayRaw = table.get(60);
            SetOverlayFromFile = table.get(61);
            GetOverlayTexture = table.get(62);
            ReleaseNativeOverlayHandle = table.get(63);
            GetOverlayTextureSize = table.get(64);
            CreateDashboardOverlay = table.get(65);
            IsDashboardVisible = table.get(66);
            IsActiveDashboardOverlay = table.get(67);
            SetDashboardOverlaySceneProcess = table.get(68);
            GetDashboardOverlaySceneProcess = table.get(69);
            ShowDashboard = table.get(70);
            GetPrimaryDashboardDevice = table.get(71);
            ShowKeyboard = table.get(72);
            ShowKeyboardForOverlay = table.get(73);
            GetKeyboardText = table.get(74);
            HideKeyboard = table.get(75);
            SetKeyboardTransformAbsolute = table.get(76);
            SetKeyboardPositionForOverlay = table.get(77);
            ShowMessageOverlay = table.get(78);
            CloseMessageOverlay = table.get(79);
        }

    }

    public static final class IVROverlayView {

        public final long
            AcquireOverlayView,
            ReleaseOverlayView,
            PostOverlayEvent,
            IsViewingPermitted;

        public IVROverlayView(long tableAddress) {
            PointerBuffer table = memPointerBuffer(tableAddress, 4);
            AcquireOverlayView = table.get(0);
            ReleaseOverlayView = table.get(1);
            PostOverlayEvent = table.get(2);
            IsViewingPermitted = table.get(3);
        }

    }

    public static final class IVRResources {

        public final long
            LoadSharedResource,
            GetResourceFullPath;

        public IVRResources(long tableAddress) {
            PointerBuffer table = memPointerBuffer(tableAddress, 2);
            LoadSharedResource = table.get(0);
            GetResourceFullPath = table.get(1);
        }

    }

    public static final class IVRRenderModels {

        public final long
            LoadRenderModel_Async,
            FreeRenderModel,
            LoadTexture_Async,
            FreeTexture,
            LoadTextureD3D11_Async,
            LoadIntoTextureD3D11_Async,
            FreeTextureD3D11,
            GetRenderModelName,
            GetRenderModelCount,
            GetComponentCount,
            GetComponentName,
            GetComponentButtonMask,
            GetComponentRenderModelName,
            GetComponentStateForDevicePath,
            GetComponentState,
            RenderModelHasComponent,
            GetRenderModelThumbnailURL,
            GetRenderModelOriginalPath,
            GetRenderModelErrorNameFromEnum;

        public IVRRenderModels(long tableAddress) {
            PointerBuffer table = memPointerBuffer(tableAddress, 19);
            LoadRenderModel_Async = table.get(0);
            FreeRenderModel = table.get(1);
            LoadTexture_Async = table.get(2);
            FreeTexture = table.get(3);
            LoadTextureD3D11_Async = table.get(4);
            LoadIntoTextureD3D11_Async = table.get(5);
            FreeTextureD3D11 = table.get(6);
            GetRenderModelName = table.get(7);
            GetRenderModelCount = table.get(8);
            GetComponentCount = table.get(9);
            GetComponentName = table.get(10);
            GetComponentButtonMask = table.get(11);
            GetComponentRenderModelName = table.get(12);
            GetComponentStateForDevicePath = table.get(13);
            GetComponentState = table.get(14);
            RenderModelHasComponent = table.get(15);
            GetRenderModelThumbnailURL = table.get(16);
            GetRenderModelOriginalPath = table.get(17);
            GetRenderModelErrorNameFromEnum = table.get(18);
        }

    }

    public static final class IVRExtendedDisplay {

        public final long
            GetWindowBounds,
            GetEyeOutputViewport,
            GetDXGIOutputInfo;

        public IVRExtendedDisplay(long tableAddress) {
            PointerBuffer table = memPointerBuffer(tableAddress, 3);
            GetWindowBounds = table.get(0);
            GetEyeOutputViewport = table.get(1);
            GetDXGIOutputInfo = table.get(2);
        }

    }

    public static final class IVRSettings {

        public final long
            GetSettingsErrorNameFromEnum,
            SetBool,
            SetInt32,
            SetFloat,
            SetString,
            GetBool,
            GetInt32,
            GetFloat,
            GetString,
            RemoveSection,
            RemoveKeyInSection;

        public IVRSettings(long tableAddress) {
            PointerBuffer table = memPointerBuffer(tableAddress, 11);
            GetSettingsErrorNameFromEnum = table.get(0);
            SetBool = table.get(1);
            SetInt32 = table.get(2);
            SetFloat = table.get(3);
            SetString = table.get(4);
            GetBool = table.get(5);
            GetInt32 = table.get(6);
            GetFloat = table.get(7);
            GetString = table.get(8);
            RemoveSection = table.get(9);
            RemoveKeyInSection = table.get(10);
        }

    }

    public static final class IVRApplications {

        public final long
            AddApplicationManifest,
            RemoveApplicationManifest,
            IsApplicationInstalled,
            GetApplicationCount,
            GetApplicationKeyByIndex,
            GetApplicationKeyByProcessId,
            LaunchApplication,
            LaunchTemplateApplication,
            LaunchApplicationFromMimeType,
            LaunchDashboardOverlay,
            CancelApplicationLaunch,
            IdentifyApplication,
            GetApplicationProcessId,
            GetApplicationsErrorNameFromEnum,
            GetApplicationPropertyString,
            GetApplicationPropertyBool,
            GetApplicationPropertyUint64,
            SetApplicationAutoLaunch,
            GetApplicationAutoLaunch,
            SetDefaultApplicationForMimeType,
            GetDefaultApplicationForMimeType,
            GetApplicationSupportedMimeTypes,
            GetApplicationsThatSupportMimeType,
            GetApplicationLaunchArguments,
            GetStartingApplication,
            GetSceneApplicationState,
            PerformApplicationPrelaunchCheck,
            GetSceneApplicationStateNameFromEnum,
            LaunchInternalProcess,
            GetCurrentSceneProcessId;

        public IVRApplications(long tableAddress) {
            PointerBuffer table = memPointerBuffer(tableAddress, 30);
            AddApplicationManifest = table.get(0);
            RemoveApplicationManifest = table.get(1);
            IsApplicationInstalled = table.get(2);
            GetApplicationCount = table.get(3);
            GetApplicationKeyByIndex = table.get(4);
            GetApplicationKeyByProcessId = table.get(5);
            LaunchApplication = table.get(6);
            LaunchTemplateApplication = table.get(7);
            LaunchApplicationFromMimeType = table.get(8);
            LaunchDashboardOverlay = table.get(9);
            CancelApplicationLaunch = table.get(10);
            IdentifyApplication = table.get(11);
            GetApplicationProcessId = table.get(12);
            GetApplicationsErrorNameFromEnum = table.get(13);
            GetApplicationPropertyString = table.get(14);
            GetApplicationPropertyBool = table.get(15);
            GetApplicationPropertyUint64 = table.get(16);
            SetApplicationAutoLaunch = table.get(17);
            GetApplicationAutoLaunch = table.get(18);
            SetDefaultApplicationForMimeType = table.get(19);
            GetDefaultApplicationForMimeType = table.get(20);
            GetApplicationSupportedMimeTypes = table.get(21);
            GetApplicationsThatSupportMimeType = table.get(22);
            GetApplicationLaunchArguments = table.get(23);
            GetStartingApplication = table.get(24);
            GetSceneApplicationState = table.get(25);
            PerformApplicationPrelaunchCheck = table.get(26);
            GetSceneApplicationStateNameFromEnum = table.get(27);
            LaunchInternalProcess = table.get(28);
            GetCurrentSceneProcessId = table.get(29);
        }

    }

    public static final class IVRTrackedCamera {

        public final long
            GetCameraErrorNameFromEnum,
            HasCamera,
            GetCameraFrameSize,
            GetCameraIntrinsics,
            GetCameraProjection,
            AcquireVideoStreamingService,
            ReleaseVideoStreamingService,
            GetVideoStreamFrameBuffer,
            GetVideoStreamTextureSize,
            GetVideoStreamTextureD3D11,
            GetVideoStreamTextureGL,
            ReleaseVideoStreamTextureGL,
            SetCameraTrackingSpace,
            GetCameraTrackingSpace;

        public IVRTrackedCamera(long tableAddress) {
            PointerBuffer table = memPointerBuffer(tableAddress, 14);
            GetCameraErrorNameFromEnum = table.get(0);
            HasCamera = table.get(1);
            GetCameraFrameSize = table.get(2);
            GetCameraIntrinsics = table.get(3);
            GetCameraProjection = table.get(4);
            AcquireVideoStreamingService = table.get(5);
            ReleaseVideoStreamingService = table.get(6);
            GetVideoStreamFrameBuffer = table.get(7);
            GetVideoStreamTextureSize = table.get(8);
            GetVideoStreamTextureD3D11 = table.get(9);
            GetVideoStreamTextureGL = table.get(10);
            ReleaseVideoStreamTextureGL = table.get(11);
            SetCameraTrackingSpace = table.get(12);
            GetCameraTrackingSpace = table.get(13);
        }

    }

    public static final class IVRScreenshots {

        public final long
            RequestScreenshot,
            HookScreenshot,
            GetScreenshotPropertyType,
            GetScreenshotPropertyFilename,
            UpdateScreenshotProgress,
            TakeStereoScreenshot,
            SubmitScreenshot;

        public IVRScreenshots(long tableAddress) {
            PointerBuffer table = memPointerBuffer(tableAddress, 7);
            RequestScreenshot = table.get(0);
            HookScreenshot = table.get(1);
            GetScreenshotPropertyType = table.get(2);
            GetScreenshotPropertyFilename = table.get(3);
            UpdateScreenshotProgress = table.get(4);
            TakeStereoScreenshot = table.get(5);
            SubmitScreenshot = table.get(6);
        }

    }

    public static final class IVRDriverManager {

        public final long
            GetDriverCount,
            GetDriverName,
            GetDriverHandle,
            IsEnabled;

        public IVRDriverManager(long tableAddress) {
            PointerBuffer table = memPointerBuffer(tableAddress, 4);
            GetDriverCount = table.get(0);
            GetDriverName = table.get(1);
            GetDriverHandle = table.get(2);
            IsEnabled = table.get(3);
        }

    }

    public static final class IVRInput {

        public final long
            SetActionManifestPath,
            GetActionSetHandle,
            GetActionHandle,
            GetInputSourceHandle,
            UpdateActionState,
            GetDigitalActionData,
            GetAnalogActionData,
            GetPoseActionDataRelativeToNow,
            GetPoseActionDataForNextFrame,
            GetSkeletalActionData,
            GetDominantHand,
            SetDominantHand,
            GetBoneCount,
            GetBoneHierarchy,
            GetBoneName,
            GetSkeletalReferenceTransforms,
            GetSkeletalTrackingLevel,
            GetSkeletalBoneData,
            GetSkeletalSummaryData,
            GetSkeletalBoneDataCompressed,
            DecompressSkeletalBoneData,
            TriggerHapticVibrationAction,
            GetActionOrigins,
            GetOriginLocalizedName,
            GetOriginTrackedDeviceInfo,
            GetActionBindingInfo,
            ShowActionOrigins,
            ShowBindingsForActionSet,
            GetComponentStateForBinding,
            OpenBindingUI,
            GetBindingVariant;

        public IVRInput(long tableAddress) {
            PointerBuffer table = memPointerBuffer(tableAddress, 31);
            SetActionManifestPath = table.get(0);
            GetActionSetHandle = table.get(1);
            GetActionHandle = table.get(2);
            GetInputSourceHandle = table.get(3);
            UpdateActionState = table.get(4);
            GetDigitalActionData = table.get(5);
            GetAnalogActionData = table.get(6);
            GetPoseActionDataRelativeToNow = table.get(7);
            GetPoseActionDataForNextFrame = table.get(8);
            GetSkeletalActionData = table.get(9);
            GetDominantHand = table.get(10);
            SetDominantHand = table.get(11);
            GetBoneCount = table.get(12);
            GetBoneHierarchy = table.get(13);
            GetBoneName = table.get(14);
            GetSkeletalReferenceTransforms = table.get(15);
            GetSkeletalTrackingLevel = table.get(16);
            GetSkeletalBoneData = table.get(17);
            GetSkeletalSummaryData = table.get(18);
            GetSkeletalBoneDataCompressed = table.get(19);
            DecompressSkeletalBoneData = table.get(20);
            TriggerHapticVibrationAction = table.get(21);
            GetActionOrigins = table.get(22);
            GetOriginLocalizedName = table.get(23);
            GetOriginTrackedDeviceInfo = table.get(24);
            GetActionBindingInfo = table.get(25);
            ShowActionOrigins = table.get(26);
            ShowBindingsForActionSet = table.get(27);
            GetComponentStateForBinding = table.get(28);
            OpenBindingUI = table.get(29);
            GetBindingVariant = table.get(30);
        }

    }

    public static final class IVRIOBuffer {

        public final long
            Open,
            Close,
            Read,
            Write,
            PropertyContainer,
            HasReaders;

        public IVRIOBuffer(long tableAddress) {
            PointerBuffer table = memPointerBuffer(tableAddress, 6);
            Open = table.get(0);
            Close = table.get(1);
            Read = table.get(2);
            Write = table.get(3);
            PropertyContainer = table.get(4);
            HasReaders = table.get(5);
        }

    }

    public static final class IVRSpatialAnchors {

        public final long
            CreateSpatialAnchorFromDescriptor,
            CreateSpatialAnchorFromPose,
            GetSpatialAnchorPose,
            GetSpatialAnchorDescriptor;

        public IVRSpatialAnchors(long tableAddress) {
            PointerBuffer table = memPointerBuffer(tableAddress, 4);
            CreateSpatialAnchorFromDescriptor = table.get(0);
            CreateSpatialAnchorFromPose = table.get(1);
            GetSpatialAnchorPose = table.get(2);
            GetSpatialAnchorDescriptor = table.get(3);
        }

    }

    public static final class IVRDebug {

        public final long
            EmitVrProfilerEvent,
            BeginVrProfilerEvent,
            FinishVrProfilerEvent,
            DriverDebugRequest;

        public IVRDebug(long tableAddress) {
            PointerBuffer table = memPointerBuffer(tableAddress, 4);
            EmitVrProfilerEvent = table.get(0);
            BeginVrProfilerEvent = table.get(1);
            FinishVrProfilerEvent = table.get(2);
            DriverDebugRequest = table.get(3);
        }

    }

    public static final class IVRNotifications {

        public final long
            CreateNotification,
            RemoveNotification;

        public IVRNotifications(long tableAddress) {
            PointerBuffer table = memPointerBuffer(tableAddress, 2);
            CreateNotification = table.get(0);
            RemoveNotification = table.get(1);
        }

    }

    public static final class IVRProperties {

        public final long
            ReadPropertyBatch,
            WritePropertyBatch,
            GetPropErrorNameFromEnum,
            TrackedDeviceToPropertyContainer;

        public IVRProperties(long tableAddress) {
            PointerBuffer table = memPointerBuffer(tableAddress, 4);
            ReadPropertyBatch = table.get(0);
            WritePropertyBatch = table.get(1);
            GetPropErrorNameFromEnum = table.get(2);
            TrackedDeviceToPropertyContainer = table.get(3);
        }

    }

    public static final class IVRPaths {

        public final long
            ReadPathBatch,
            WritePathBatch,
            StringToHandle,
            HandleToString;

        public IVRPaths(long tableAddress) {
            PointerBuffer table = memPointerBuffer(tableAddress, 4);
            ReadPathBatch = table.get(0);
            WritePathBatch = table.get(1);
            StringToHandle = table.get(2);
            HandleToString = table.get(3);
        }

    }

    public static final class IVRBlockQueue {

        public final long
            Create,
            Connect,
            Destroy,
            AcquireWriteOnlyBlock,
            ReleaseWriteOnlyBlock,
            WaitAndAcquireReadOnlyBlock,
            AcquireReadOnlyBlock,
            ReleaseReadOnlyBlock,
            QueueHasReader;

        public IVRBlockQueue(long tableAddress) {
            PointerBuffer table = memPointerBuffer(tableAddress, 9);
            Create = table.get(0);
            Connect = table.get(1);
            Destroy = table.get(2);
            AcquireWriteOnlyBlock = table.get(3);
            ReleaseWriteOnlyBlock = table.get(4);
            WaitAndAcquireReadOnlyBlock = table.get(5);
            AcquireReadOnlyBlock = table.get(6);
            ReleaseReadOnlyBlock = table.get(7);
            QueueHasReader = table.get(8);
        }

    }

}