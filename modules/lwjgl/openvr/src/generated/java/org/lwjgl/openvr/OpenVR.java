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
import javax.annotation.Nullable;
import org.lwjgl.*;

import static org.lwjgl.openvr.VR.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The OpenVR function tables. */
public final class OpenVR {

    @Nullable public static IVRSystem VRSystem;
    @Nullable public static IVRChaperone VRChaperone;
    @Nullable public static IVRChaperoneSetup VRChaperoneSetup;
    @Nullable public static IVRCompositor VRCompositor;
    @Nullable public static IVRHeadsetView VRHeadsetView;
    @Nullable public static IVROverlay VROverlay;
    @Nullable public static IVROverlayView VROverlayView;
    @Nullable public static IVRResources VRResources;
    @Nullable public static IVRRenderModels VRRenderModels;
    @Nullable public static IVRExtendedDisplay VRExtendedDisplay;
    @Nullable public static IVRSettings VRSettings;
    @Nullable public static IVRApplications VRApplications;
    @Nullable public static IVRTrackedCamera VRTrackedCamera;
    @Nullable public static IVRScreenshots VRScreenshots;
    @Nullable public static IVRDriverManager VRDriverManager;
    @Nullable public static IVRInput VRInput;
    @Nullable public static IVRIOBuffer VRIOBuffer;
    @Nullable public static IVRSpatialAnchors VRSpatialAnchors;
    @Nullable public static IVRDebug VRDebug;
    @Nullable public static IVRNotifications VRNotifications;

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
    }

    @Nullable
    private static <T> T getGenericInterface(String interfaceNameVersion, LongFunction<T> supplier) {
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
            PointerBuffer table = memPointerBuffer(tableAddress, 51);
            SetTrackingSpace = table.get(0);
            GetTrackingSpace = table.get(1);
            WaitGetPoses = table.get(2);
            GetLastPoses = table.get(3);
            GetLastPoseForTrackedDeviceIndex = table.get(4);
            Submit = table.get(5);
            ClearLastSubmittedFrame = table.get(6);
            PostPresentHandoff = table.get(7);
            GetFrameTiming = table.get(8);
            GetFrameTimings = table.get(9);
            GetFrameTimeRemaining = table.get(10);
            GetCumulativeStats = table.get(11);
            FadeToColor = table.get(12);
            GetCurrentFadeColor = table.get(13);
            FadeGrid = table.get(14);
            GetCurrentGridAlpha = table.get(15);
            SetSkyboxOverride = table.get(16);
            ClearSkyboxOverride = table.get(17);
            CompositorBringToFront = table.get(18);
            CompositorGoToBack = table.get(19);
            CompositorQuit = table.get(20);
            IsFullscreen = table.get(21);
            GetCurrentSceneFocusProcess = table.get(22);
            GetLastFrameRenderer = table.get(23);
            CanRenderScene = table.get(24);
            ShowMirrorWindow = table.get(25);
            HideMirrorWindow = table.get(26);
            IsMirrorWindowVisible = table.get(27);
            CompositorDumpImages = table.get(28);
            ShouldAppRenderWithLowResources = table.get(29);
            ForceInterleavedReprojectionOn = table.get(30);
            ForceReconnectProcess = table.get(31);
            SuspendRendering = table.get(32);
            GetMirrorTextureD3D11 = table.get(33);
            ReleaseMirrorTextureD3D11 = table.get(34);
            GetMirrorTextureGL = table.get(35);
            ReleaseSharedGLTexture = table.get(36);
            LockGLSharedTextureForAccess = table.get(37);
            UnlockGLSharedTextureForAccess = table.get(38);
            GetVulkanInstanceExtensionsRequired = table.get(39);
            GetVulkanDeviceExtensionsRequired = table.get(40);
            SetExplicitTimingMode = table.get(41);
            SubmitExplicitTimingData = table.get(42);
            IsMotionSmoothingEnabled = table.get(43);
            IsMotionSmoothingSupported = table.get(44);
            IsCurrentSceneFocusAppLoading = table.get(45);
            SetStageOverride_Async = table.get(46);
            ClearStageOverride = table.get(47);
            GetCompositorBenchmarkResults = table.get(48);
            GetLastPosePredictionIDs = table.get(49);
            GetPosesForFrame = table.get(50);
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
            GetOverlayTransformOverlayRelative,
            SetOverlayTransformOverlayRelative,
            SetOverlayTransformCursor,
            GetOverlayTransformCursor,
            SetOverlayTransformProjection,
            ShowOverlay,
            HideOverlay,
            IsOverlayVisible,
            GetTransformForOverlayCoordinates,
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
            PointerBuffer table = memPointerBuffer(tableAddress, 79);
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
            SetOverlayTextureColorSpace = table.get(25);
            GetOverlayTextureColorSpace = table.get(26);
            SetOverlayTextureBounds = table.get(27);
            GetOverlayTextureBounds = table.get(28);
            GetOverlayTransformType = table.get(29);
            SetOverlayTransformAbsolute = table.get(30);
            GetOverlayTransformAbsolute = table.get(31);
            SetOverlayTransformTrackedDeviceRelative = table.get(32);
            GetOverlayTransformTrackedDeviceRelative = table.get(33);
            SetOverlayTransformTrackedDeviceComponent = table.get(34);
            GetOverlayTransformTrackedDeviceComponent = table.get(35);
            GetOverlayTransformOverlayRelative = table.get(36);
            SetOverlayTransformOverlayRelative = table.get(37);
            SetOverlayTransformCursor = table.get(38);
            GetOverlayTransformCursor = table.get(39);
            SetOverlayTransformProjection = table.get(40);
            ShowOverlay = table.get(41);
            HideOverlay = table.get(42);
            IsOverlayVisible = table.get(43);
            GetTransformForOverlayCoordinates = table.get(44);
            PollNextOverlayEvent = table.get(45);
            GetOverlayInputMethod = table.get(46);
            SetOverlayInputMethod = table.get(47);
            GetOverlayMouseScale = table.get(48);
            SetOverlayMouseScale = table.get(49);
            ComputeOverlayIntersection = table.get(50);
            IsHoverTargetOverlay = table.get(51);
            SetOverlayIntersectionMask = table.get(52);
            TriggerLaserMouseHapticVibration = table.get(53);
            SetOverlayCursor = table.get(54);
            SetOverlayCursorPositionOverride = table.get(55);
            ClearOverlayCursorPositionOverride = table.get(56);
            SetOverlayTexture = table.get(57);
            ClearOverlayTexture = table.get(58);
            SetOverlayRaw = table.get(59);
            SetOverlayFromFile = table.get(60);
            GetOverlayTexture = table.get(61);
            ReleaseNativeOverlayHandle = table.get(62);
            GetOverlayTextureSize = table.get(63);
            CreateDashboardOverlay = table.get(64);
            IsDashboardVisible = table.get(65);
            IsActiveDashboardOverlay = table.get(66);
            SetDashboardOverlaySceneProcess = table.get(67);
            GetDashboardOverlaySceneProcess = table.get(68);
            ShowDashboard = table.get(69);
            GetPrimaryDashboardDevice = table.get(70);
            ShowKeyboard = table.get(71);
            ShowKeyboardForOverlay = table.get(72);
            GetKeyboardText = table.get(73);
            HideKeyboard = table.get(74);
            SetKeyboardTransformAbsolute = table.get(75);
            SetKeyboardPositionForOverlay = table.get(76);
            ShowMessageOverlay = table.get(77);
            CloseMessageOverlay = table.get(78);
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

}